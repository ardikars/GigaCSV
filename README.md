## GigaCSV

Single Java file for `Reading/Writing` large CSV file efficiently.

### Features

* Sequential access file.
* Configurable field separator.
* Auto detect line endings: `CRLF` (Windows), `LF` (Linux), and `CR` (old macOS).
* Supports Unicode characters.
* Preserves the starting line number (useful for debugging data).
* Adjustable buffer size.
* Supports writer quoting strategy.
* Compliant with the CSV specification (`RFC 4180`)


#### Usage

Copy and paste `GigaCSV.java` into your project or add `GigaCSV` as dependency.

```xml
<dependency>
    <groupId>com.ardikars.gigacsv</groupId>
    <artifactId>gigacsv</artifactId>
    <version>${VERSION}</version>
</dependency>
```

##### Java

```java
final GigaCSV csv = new GigaCSV();
try (final GigaCSV.Writer writer = csv.writer("output.csv")) {
    try (final GigaCSV.Reader reader = csv.reader("input.csv")) {
        for (GigaCSV.Record record : reader) {
            writer.write(record); // write to output.csv file
        }
    } catch (Exception e) {
        // reader exception
    }
} catch (Exception e) {
    // writer exception
}
```

##### Kotlin

```kotlin
val csv = GigaCSV()
csv.writer("output.csv").use { writer ->
    csv.reader("input.csv").use { reader ->
        for (record in reader) {
            writer.write(record) // write to output.csv file
        }
    }
}
```

### Build and Deploy

#### Compile

```bash
$ mkdir -p target/classes/ target/doc/
$ javac -d target/classes/ GigaCSV.java
```

#### Generate Javadoc

```bash
$ javadoc -d target/doc/ GigaCSV.java
```

#### Build JAR file

```bash
$ jar cMf target/gigacsv-1.0.0.jar -C target/classes/ .
$ jar cMf target/gigacsv-1.0.0-sources.jar -C . GigaCSV.java
$ jar cMf target/gigacsv-1.0.0-javadoc.jar -C target/doc/ .
```

#### Create pom.xml in `target/gigacsv-1.0.0.pom`

```xml
<?xml version="1.0" encoding="UTF-8"?>
<project xmlns="http://maven.apache.org/POM/4.0.0"
         xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
         xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/maven-v4_0_0.xsd">
    <modelVersion>4.0.0</modelVersion>
                
    <groupId>com.ardikars.gigacsv</groupId>
    <artifactId>gigacsv</artifactId>
    <version>1.0.0</version>
    <packaging>jar</packaging>
                
    <name>GigaCSV</name>
    <description>Single Java File for Processing CSV File</description>
    <url>https://github.com/ardikars/GigaCSV</url>
                
    <licenses>
        <license>
            <name>MIT</name>
            <url>https://opensource.org/license/MIT</url>
        </license>
    </licenses>
                
    <developers>
        <developer>
            <name>Ardika Rommy Sanjaya</name>
            <email>contact@ardikars.com</email>
            <organization>ardikars</organization>
            <organizationUrl>https://ardikars.com</organizationUrl>
        </developer>
    </developers>
                
    <scm>
        <connection>scm:git:git://github.com/ardikars/GigaCSV.git</connection>
        <developerConnection>scm:git:ssh://github.com:ardikars/GigaCSV.git</developerConnection>
        <url>https://github.com/ardikars/GigaCSV/tree/main</url>
    </scm>
</project>
```

#### Sign and Bundle JAR

```bash
$ mkdir target/deploy
$ cp target/gigacsv-1.0.0.pom target/deploy/
$ cp target/gigacsv-1.0.0.jar target/deploy/
$ cp target/gigacsv-1.0.0-sources.jar target/deploy/
$ cp target/gigacsv-1.0.0-javadoc.jar target/deploy/
$ gpg --armor --detach-sign target/deploy/gigacsv-1.0.0.pom
$ gpg --armor --detach-sign target/deploy/gigacsv-1.0.0.jar
$ gpg --armor --detach-sign target/deploy/gigacsv-1.0.0-sources.jar
$ gpg --armor --detach-sign target/deploy/gigacsv-1.0.0-javadoc.jar
$ jar cMf target/bundle.jar -C target/deploy/ .
```

#### Deployment

* Login

```bash
$ curl --request GET \
  --url https://oss.sonatype.org/service/local/authentication/login \
  --cookie-jar cookies.txt \
  --user $USERNAME:$PASSWORD
```

* Upload the bundle to a staging repository

```bash
curl --request POST \
  --url https://oss.sonatype.org/service/local/staging/bundle_upload \
  --cookie cookies.txt \
  --header 'Content-Type: multipart/form-data' \
  --form file=@target/bundle.jar
```

* Release

```bash
$ curl --request POST \
  --url https://oss.sonatype.org/service/local/staging/bulk/promote \
  --cookie cookies.txt \
  --header 'Content-Type: application/json' \
  --data '{ 
    "data": {
        "autoDropAfterRelease": true,
        "description": "",
        "stagedRepositoryIds": ["STAGING_REPOSITORY_ID"]
    }
}'
```

#### Format the code

```bash
$ java -jar google-java-format-*.jar --replace --skip-javadoc-formatting GigaCSV.java
```

#### Notes:

> * GigaCSV only supports UTF-8 encoding.

> * GigaCSV has not been tested. Don't use it in production.
