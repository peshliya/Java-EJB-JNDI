# 💼 Java-EJB-JNDI Example Project

A simple, educational example of using **Enterprise JavaBeans (EJB)** and **Java Naming and Directory Interface (JNDI)** with **Jakarta EE** and **GlassFish**. This project demonstrates how multiple standalone clients can interact with a shared EJB and access a common JNDI registry.

---

## 📁 Project Structure
Java-EJB-JNDI/
├── EE-WebApp/ # EJB module (remote business logic)
├── EE-Client-App/ # Client #1 - performs remote EJB call and binds data
└── EE-Client-App2/ # Client #2 - retrieves shared data from JNDI


---

## 🔧 Technologies Used

- ☕ Java 11  
- 🌐 Jakarta EE 10  
- 📦 EJB (Enterprise Java Beans)  
- 🧭 JNDI (Java Naming and Directory Interface)  
- 🐬 GlassFish 7.0.21 (remote + embedded)  
- 🛠 Maven  

---

## 🧩 Module Breakdown

### 📦 `EE-WebApp/` — EJB Module (Server-side)

- 📌 **Purpose**: Hosts remote business logic via a remote interface.
- 🧪 **Implements**: `UserDetailsBean` (an EJB)
- 🔌 **Exposes**: `UserDetails` interface using `@Remote`
- 🚀 **Deployment**: Build and deploy `.jar` to GlassFish

---

### 💻 `EE-Client-App/` — Standalone Java Client #1

- 🔍 **Performs**: JNDI lookup of the `UserDetails` EJB
- 🧑 **Retrieves**: User's name from the remote bean
- 🔗 **Binds**: `"AppName"` string to JNDI for other clients to use

---

### 💻 `EE-Client-App2/` — Standalone Java Client #2

- 🔍 **Looks up**: `"AppName"` from the JNDI context
- 📤 **Reads and Prints**: Shared string set by Client #1

---

## 🚀 How to Run the Project

### 📌 Prerequisites

- GlassFish 7 installed and configured
- GlassFish server is **running**
- Java 11 and Maven installed

---

### 🧪 Step 1: Deploy EJB Module to GlassFish

```bash
cd EE-WebApp/
mvn clean install
# Deploy via GlassFish Admin Console or:
asadmin deploy target/EE-WebApp.jar
