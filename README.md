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

#### How to run test

```bash
$ mvn clean test jacoco:report -Ptest,fmt
```

#### Notes:

> * GigaCSV only supports UTF-8 encoding.

> * GigaCSV has not been tested. Don't use it in production.
