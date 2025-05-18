
This repository demonstrates a simple multi-module project using Enterprise Java Beans (EJB) and Java Naming and Directory Interface (JNDI). It includes a server-side EJB module and two standalone client applications to showcase remote method invocation and shared JNDI context usage.

🧩 Project Modules
1. EE-WebApp/ — EJB Module (Server)
This is the main EJB application deployed to a Jakarta EE-compatible server (e.g., GlassFish).

Purpose: Hosts a remote EJB that provides business logic to clients.

Technologies: Jakarta EE 10, EJB, JNDI

Module Type: EJB module (.jar)

Exposes: UserDetails interface (marked with @Remote)

Implements: UserDetailsBean

Deployment Target: GlassFish 7.x (remote)

2. EE-Client-App/ — Standalone Java Client #1
A Java SE application that acts as a remote client to the EJB deployed on GlassFish.

Purpose: Connects to the UserDetailsBean via JNDI and invokes remote methods.

Technologies: Java 11, JNDI, GlassFish Embedded

Main Actions:

Performs JNDI lookup of UserDetails

Prints the retrieved user's name

Binds a string "AppName" to the JNDI context (for sharing between clients)

3. EE-Client-App2/ — Standalone Java Client #2
Another client to demonstrate concurrent access and context sharing via JNDI.

Purpose: Retrieves shared data bound by the first client.

Technologies: Java 11, JNDI

Main Actions:

Looks up "AppName" in the JNDI context

Prints the shared application name string

⚙️ Technologies Used
Java 11

Jakarta EE 10

Enterprise Java Beans (EJB)

Java Naming and Directory Interface (JNDI)

GlassFish 7.0.21 (Remote & Embedded)

Apache Maven

🗂 Repository Structure
graphql
Copy
Edit
Java-EJB-JNDI/
├── EE-WebApp/          # Remote EJB module exposing UserDetailsBean
├── EE-Client-App/      # First standalone client (binds AppName)
└── EE-Client-App2/     # Second standalone client (retrieves AppName)
