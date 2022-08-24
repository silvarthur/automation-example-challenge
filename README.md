# E-Core Challenge

## Dependencies

**Java** and **Maven** must be installed on the machine on which the project will be running.

The project was implemented using **Java 11**. If you are using a different version, you might
have to update the pom.xml. The part of code that has to be updated is right below:

    <properties>
        <maven.compiler.source>11</maven.compiler.source>
        <maven.compiler.target>11</maven.compiler.target>
    </properties>

## Executing The Test Project

The test cases can be executed using Chrome in any operational system. Just run the command below:

```bash
mvn clean test
```

## Generating Reports Using Maven

Maven can be used to generate reports that present the test results in friendlier way.
Running the command below will create a folder inside target that contains different kinds
of reports.

```bash
mvn clean test site
```

To open the test execution report directly, open the file target/site/surefire-report.html.
