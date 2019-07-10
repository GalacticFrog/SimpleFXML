
# simpleFXML springboot javafx integration

Spring Boot and JavaFx - A perfect team!
Build your JavaFX Application with spring boot features


This small library links Spring Boot with JavaFx. 
Let all your view and controller classes be Spring Beans and make use of all features in the Spring Framework Universe. 

## 0. Prerequisites 
- ** You will at least need JDK 1.8 or higher.
- **[Spring Boot 2](https://spring.io/projects/spring-boot)** via Maven
## 1. Installing
You can get the latest version of SimpleFXML directly from Bintray’s JCenter repository. 

Maven
```xml
<repositories>
    <repository>
        <id>central</id>
        <name>jcenter</name>
        <url>http://jcenter.bintray.com</url>
    </repository>
</repositories>

<dependencies>
    <dependency>
        <groupId>edu.unsch.epis</groupId>
        <artifactId>SimpleFXML</artifactId>
        <version>1.0.0-Final</version>	
    </dependency>
<dependencies>
```
gradle
```java
repositories {
    jcenter()
}

dependencies {
    compile 'edu.unsch.epis:SimpleFXML:1.0.0-Final'
}
```

2. Generate your GUI with FXML using SceneBuilder
-------------------------------------------------
You find SceneBuilder here: http://gluonhq.com/open-source/scene-builder/
Put the files in a folder called fxml in your classpath, so that Spring's resource loader can find them. Hint: Create a dedicated jar with all FXML, css and resource files and add it as a dependency using your preferred tooling (Maven, Gradle...).

3. Create your view classes
---------------------------
Extend your view class from AbstractFxmlView and annotate it with @FXView. Name your class <FXMLFile>View.
E.g. given your FXML-file is named somelist.fxml the corresponding view class is SomeListView. When you want to name your class different, you need to add the fxml file name as value to your @FXView annotation:
@FXView("/myniceview.fxml")

4. Create the Controller
---------------------------------
Create your controller class for your view as you defined it in the fxml file:
fx:controller="my.example.MyCoolController" and annotate MyCoolController with @FXController.

5. Create a Starter class
-------------------------
Create a starter class extending AbstractJavaFxApplicationSupport. Annotate this one with @SpringBootApplication and call launchApp() from the main method. 

6. Style your views
-------------------
You have multiple ways to style your view:
First on is adding your JavaFX-css with SceneBuilder (the common JavaFX-way). Second is to add one or more css-files to the @FXView annotation: @FXView(css={"/css/main.css", "/css/other.css"}). Or third possibility: Add a property javafx.css=/global.css to your application.properties (or application.yaml).

6. Adding resource bundles to the view
--------------------------------------
To i18n your application you can either add your properties files inside the package of your view class or add a bundle parameter to the @FXView annotation. Example: Your View is named foo.myapp.main.CoolView.class then your properties should be in the package foo.myapp.main as: cool.properties (default and fallback) and cool_de.properties (german), cool_fr.properties (french) etc.
Or if you want to have your files reside in a different location (e.g. /i18n/messages_*.properties) then add your bundle by adding 
@FXView(bundle = "i18n.messages") Be aware of the dot because the FXMLLoader assumes that this is a classpath.





