## GigaCSV

Single Java file for `Reading/Writing` large CSV file efficiently.

### Features

* Sequential access file.
* Configurable field separator.
* Auto detect line endings: `CRLF` (Windows), `LF` (Linux), and `CR` (old macOS).
* Supports Unicode characters.
* Preserves the starting line number (useful for debugging data).
* Adjustable buffer size.
* Compliant with the CSV specification (`RFC 4180`)

#### How to compile

```bash
$ javac -d target/classes GigaCSV.java
```

#### Format the code

```bash
$ java -jar google-java-format.jar --replace --skip-javadoc-formatting GigaCSV.java
```

#### Usage

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

#### Notes:

> * GigaCSV only supports UTF-8 encoding.
> * GigaCSV has not been tested. Don't use it in production.
