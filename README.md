#  Distributed Systems
This repository contains the code for the labs and assignements of Distributed Systems subject. 

## Table of Conents

1. Setup the enviornment and install the dependencies

2. Install the IDE of yout preferences

## 1. Setup the environment

You need to install both the Java JDK and the Java JRE.  Here we provide the steps for Windows and Linux based distributions. 

### 1.1 Windows


To install the JDK (Java Development Kit) and JRE (Java Runtime Environment) on a Windows-based distribution, follow these steps:

#### 1.1.1. Download the JDK and JRE
Go to the Oracle Java Downloads page (https://www.oracle.com/java/technologies/downloads/).
Select the appropriate version of JDK and JRE for your Windows system (e.g., JDK 17, JDK 21).
#### 1.1.2. Install the JDK
Run the downloaded JDK installer ( **jdk-xx_windows-x64_bin.exe** ).
Follow the on-screen instructions to complete the installation.
During installation, you can choose the installation path or use the default path.
#### 1.1.3. Install the JRE
Run the downloaded JRE installer (**jre-xx_windows-x64_bin.exe**).
Follow the on-screen instructions to complete the installation.
During installation, you can choose the installation path or use the default path.
#### 1.1.4. Set Environment Variables
Open the Start Menu and search for “Environment Variables”.
Click on Edit the system environment variables.
In the System Properties window, click on Environment Variables.
Under System variables, find the Path variable and click Edit.
Add the path to the JDK bin directory (e.g., **C:\Program Files\Java\jdk-xx\bin**).
Click OK to save the changes.
#### 1.1.5. Verify the Installation
Open a Command Prompt.
Verify the JDK installation:
```bash
java -version
```

Verify the JRE installation:
```bash
javac -version
``` 
### 1.2 Linux based distibutions

#### Ubuntu / Debian

``` bash 
sudo apt update
sudo apt install default-jre
sudo apt install default-jdk
```

If you want to check whether it is installed, you can do it by typing:

``` bash 
java -version
javac -version
```

If everything was ok, you will see the versions of both the JDK and Java JRE installed. 

#### CentOS / RHEL.

``` bash 
sudo yum update
sudo apt install java-1.8.0-openjdk
sudo apt install java-1.8.0-openjdk-devel
```
If you want to check whether it is installed, you can do it by typing:

``` bash 
java -version
javac -version
```

If everything was ok, you will see the versions of both the JDK and Java JRE installed. 


## chosing the IDE. 

You can use, (and we encourage you to) use the IDE of your choice. During the course, we will use Maven as the java management tool.  Here, a couple tips for setting and building a Maven project when working on Eclipse IDE / VS Code. 


### 2.1.  Setup the maven project in Visual Studio Code


You must have installed the java extension. 

Afterwards, you must go in the top search bar and type:
` > maven  '

And selecct mave prohect.  Initially, choose the simples option "archetype"


### 2.2. Setup the project in Eclipse. 


You must create a project  in Eclipse main menu  "Create Maven Project". 

Complete the name and namespace for the project.



If everything worked properly you should see the following structure:

```plaintext
├── src/
│   ├── main/
│   │   ├── App.java 
│   ├── test/
│   │   ├── appTestjava.java
│   │   └── 
│   ├── App.js
│   └── index.js
├── target/
│   ├── classes/
│   └── test-classes/
├── .gitignore
├── pom.xml
└── README.md
```



## You can clone this repository to start.

``` bash 
git clone  https://github.com/ghe16/DisSys_grado

