# Simple Calculator
Simple calculator built using Java.

<p align="center">
    <img width="300" height="250" src="Screenshot.png">
</p>

# About this Project

This project's goal is to create a simple calculator app on which the user can perform simple mathematical operations and get the result displayed.

# Getting Started

**Prerequisites**

To run this project, you'll need to have a basic environment to run a Java App.

**Cloning the Repository**

    $ git clone https://github.com/awcasella/Simple-Calculator.git

    $ cd Simple-Calculator
  
**Java Installation**

    $ sudo apt install default-jre
    
    $ sudo apt install default-jdk

**Run project**

Compile the main class
    
    $ javac Calculator.java

Run the application
    
    $ java Calculator

After that, build the package

    $ javac -d . Calculator.java

Run the application from the package
    
    $ java src.Calculator

**Making a standalone application**

Create a manifest.MF document:
    
    $ touch manifest.MF

Open the document, and write this:

    Main-Class: src.Calculator
    Name: src/Calculator.class
    Java-Bean: True

Then just save the document. To make an jar, type this:

    $ jar cfm app.jar manifest.MF src

Run the .jar file:

    $ java -jar app.jar

To make it executable on linux, type this:
    
    $ chmod +x app.jar


# Built With

- [NetBeans](https://netbeans.org): Quickly and easily develop desktop, mobile, and web applications with Java, JavaScript, HTML5, PHP, C/C++ and more.

# References

- Interfaces gráficas com Swing. Caelum. Available at: [https://www.caelum.com.br/apostila-java-testes-xml-design-patterns/interfaces-graficas-com-swing/](https://www.caelum.com.br/apostila-java-testes-xml-design-patterns/interfaces-graficas-com-swing/). Access on January, 2020.
 
- Java Swing: Conheça os componentes JTextField e JFormattedTextField. DevMedia. Available at: [https://www.devmedia.com.br/java-swing-conheca-os-componentes-jtextfield-e-jformattedtextfield/30981](https://www.devmedia.com.br/java-swing-conheca-os-componentes-jtextfield-e-jformattedtextfield/30981). Access on January, 2020.
