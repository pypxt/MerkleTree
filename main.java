package merkletree;
import java.util.ArrayList;


public class main {
	//create blockchainn array list that will contain blocks called blockchainn
	public static ArrayList<blockchain> blockchainn = new ArrayList<blockchain>();
	public static int difficulty = 5;
	
	public static void mainBlockchain (String[] args) {
		
		//here we add blocks to array
		blockchainn.add(new blockchain("Block one", "0"));
		System.out.println("Mining block one... ");
		blockchainn.get(0).mineBlock(difficulty);
		
		blockchainn.add(new blockchain("Block two",blockchainn.get(blockchainn.size()-1).hash));
		System.out.println("Mining block two... ");
		blockchainn.get(1).mineBlock(difficulty);
		
		blockchainn.add(new blockchain("Block three",blockchainn.get(blockchainn.size()-1).hash));
		System.out.println("Mining block three... ");
		blockchainn.get(2).mineBlock(difficulty);
		
		System.out.println("\nThis Blockchain is Valid: " + BlockValidation());
		System.out.println(blockchainn);
	}
	
	public static Boolean BlockValidation() {
		blockchain currentBlock; 
		blockchain previousBlock;
		String hashTarget = new String(new char[difficulty]).replace('\0', '0');
		
		//loop through blockchainn to check hashes:
		for(int i=1; i < blockchainn.size(); i++) {
			currentBlock = blockchainn.get(i);
			previousBlock = blockchainn.get(i-1);
			//compare registered hash and calculated hash:
			if(!currentBlock.hash.equals(currentBlock.calculateHash()) ){
				System.out.println("Current Hashes are not equal");			
				return false;
			}
			//compare previous hash and registered previous hash
			if(!previousBlock.hash.equals(currentBlock.previousHash) ) {
				System.out.println("Previous Hashes are not equal");
				return false;
			}
			//check if hash is solved
			if(!currentBlock.hash.substring( 0, difficulty).equals(hashTarget)) {
				System.out.println("Block not found");
				return false;
			}
		
			
	}
		return true;

}
}
