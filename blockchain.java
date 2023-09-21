package merkletree;

import java.util.Date;

public class blockchain {
	
	public String hash; //hash holds digital signature 
	public String previousHash; //holds previous block's hash
	private String data; //holds block data
	private long timeStamp; 
	private int nonce;
	
public blockchain(String data, String previousHash) { //for block construction
	
	this.data = data;
	this.previousHash = previousHash;
	this.timeStamp = new Date().getTime();
	this.hash = calculateHash(); //to compute and set block hash 
}

public String calculateHash() { //calculate hush from all the parts of the block
	String calculatedhash = StringUtil.applySha256(
			previousHash + Long.toString(timeStamp) + data
			);
	return calculatedhash;
			
}
//create method for mining blocks by finding a nonce value 
public void mineBlock(int difficulty) {
	String target = new String(new char[difficulty]).replace('\0', '0'); 
	//create a string with difficulty number of leading zeros
	while(!hash.substring( 0, difficulty).equals(target)) {
		nonce++; //loop until there's hush with target difficulty 
		hash = calculateHash();
	}
	System.out.println("We mined the block : " + hash);
}
}
