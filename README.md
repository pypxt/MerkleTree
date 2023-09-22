# MerkleTree

Assignment 1 by Zaynullina Aziza | IT-2103 | Blockchain course, 1 trimester


#In this Task, I created the simple blockchain with mining and validation check using Java Programming language.
Blockchain is a distributed ledger technology that underpins cryptocurrencies. Blocks are data structures within the blockchain database, where transaction data in a cryptocurrency blockchain are permanently recorded. A block records some or all of the most recent transactions not yet validated by the network. Once the data are validated, the block is closed. Then, a new block is created for new transactions to be entered into and validated. Blocks include these elements, but it might differ:

* Magic number: A number containing specific values that identify that block as part of a particular cryptocurrency's network.
* Blocksize: Sets the size limit on the block so that only a specific amount of information can be written in it.
* Block header: Contains information about the block.
* Transaction counter: A number that represents how many transactions are stored in the block.
* Transactions: A list of all of the transactions within a block.

  The transaction element is the largest because it contains the most information. It is followed in storage size by the block header, which includes these sub-elements:

- Version: The cryptocurrency version being used.
- Previous block hash: Contains a hash (encrypted number) of the previous block's header.
- Hash Merkle root: Hash of transactions in the Merkle tree of the current block.
- Time: A timestamp to place the block in the blockchain.
- Bits: The difficulty rating of the target hash, signifying the difficulty in solving the nonce.
- Nonce: The encrypted number that a miner must solve to verify the block and close it.

Characteristics of Blockchain:
- Blockchain operates in a decentralized manner, meaning there is no central authority, institution, or single point of control. Instead, it relies on a network of nodes that work collectively. This decentralization enhances security and reduces the risk of manipulation. 
- Blockchain maintains a distributed ledger, which is a shared and synchronized database containing a record of all transactions. Each node in the network maintains a copy of the entire blockchain. New transactions are added to all copies of the ledger, and consensus mechanisms ensure that all copies stay in sync.
- Once data is recorded on the blockchain, it is nearly impossible to alter or delete. The cryptographic link between blocks (using the previous block's hash in the current block) ensures that any change to a block would require changing all subsequent blocks, which is computationally infeasible.
  
