# rmibasic
Try a simple rmi program.

disclaimer: This code is the followed by youtube video of Telusko learning.

Problem statement: to perform addition remotely from client to server

This section includes the steps to create and run rmi program.

So, create a RMI program, follow theses steps:

1. Create the remote interface (AddI)
2. Implement the remote interface (AddC)
3. Create server
4. Create client

To run the the program, follow these steps: 

1. compile all java files 
	javac *.java
2. Create stub and skeleton
	rmic AddC
3. Start rmi registry
	start rmiregistry
4. Start the server 
	java Server
5. Start the Client (Of course on different terminal)
	java Client





