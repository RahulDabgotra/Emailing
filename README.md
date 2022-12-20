# Spring MVC Emailing

This is a Spring MVC project to send emails.

## Configuration 

Go to **src/main/resources/application.properties**  and add your email after ```spring.mail.username=youremail@mail.com```. Add your password under this ```spring.mail.password=yourpasswd```. 
>NOTE: To get your password token go to your Google Account and under security, enable two factor authentication. After that go to app password and get one app password. 

## Run Project

#### IntelliJ IDEA
To run project, go to the EmailingApplication file and then select run.

#### Commands
to be updated.

## Build Project

#### IntelliJ IDEA
Go to Maven Tab in IntelliJ and select ```emailing>Lifecycle```  under lifecycle click on clean and then package. Your jar file package will be built now and is present under ```Target``` folder.

#### Commands
to be updated.

## Run Build Files

#### Commands
```java -jar emailing-app.jar & ```


