package gigacsv;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Iterator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

@Disabled
class CSVWriter0604Test {

  @Test
  void test04AQLFNENDL() {
    final GigaCSV csv = new GigaCSV(new GigaCSV.Option().bufferSize(60));
    try (GigaCSV.Reader reader = csv.reader("src/test/resources/reader_06_04_AQ_LF_NENDL.csv")) {
      try (GigaCSV.Writer writer =
          csv.writerWithModeAndAlwaysQuote(
              "src/test/resources/reader_06_04_AQ_LF_NENDL_WAQ.csv", "rw")) {
        for (GigaCSV.Record record : reader) {
          writer.write(record);
        }
      } catch (Exception e) {
        assert false;
      }
      try (GigaCSV.Writer writer =
          csv.writerWithMode("src/test/resources/reader_06_04_AQ_LF_NENDL_WNQ.csv", "rw")) {
        for (GigaCSV.Record record : reader) {
          writer.write(record);
        }
      } catch (Exception e) {
        assert false;
      }
    } catch (Exception e) {
      assert false;
    }
    try (GigaCSV.Reader reader1 = csv.reader("src/test/resources/reader_06_04_AQ_LF_NENDL.csv")) {
      try (GigaCSV.Reader reader =
          csv.reader("src/test/resources/reader_06_04_AQ_LF_NENDL_WAQ.csv")) {
        Iterator<GigaCSV.Record> iterator1 = reader1.iterator();
        Iterator<GigaCSV.Record> iterator = reader.iterator();
        Assertions.assertEquals(iterator.hasNext(), iterator1.hasNext());
        while (iterator.hasNext()) {
          GigaCSV.Record next = iterator.next();
          GigaCSV.Record next1 = iterator1.next();
          Assertions.assertEquals(next, next1);
        }
      }
      try (GigaCSV.Reader reader =
          csv.reader("src/test/resources/reader_06_04_AQ_LF_NENDL_WNQ.csv")) {
        Iterator<GigaCSV.Record> iterator1 = reader1.iterator();
        Iterator<GigaCSV.Record> iterator = reader.iterator();
        Assertions.assertEquals(iterator.hasNext(), iterator1.hasNext());
        while (iterator.hasNext()) {
          GigaCSV.Record next = iterator.next();
          GigaCSV.Record next1 = iterator1.next();
          Assertions.assertEquals(next, next1);
        }
      }
    } catch (Exception e) {
      assert false;
    }
    try {
      Files.deleteIfExists(Paths.get("src/test/resources/reader_06_04_AQ_LF_NENDL_WAQ.csv"));
      Files.deleteIfExists(Paths.get("src/test/resources/reader_06_04_AQ_LF_NENDL_WNQ.csv"));
    } catch (IOException e) {
      assert false;
    }
  }

  @Test
  void test04AQCRLFNENDL() {
    final GigaCSV csv = new GigaCSV(new GigaCSV.Option().bufferSize(60));
    try (GigaCSV.Reader reader = csv.reader("src/test/resources/reader_06_04_AQ_CRLF_NENDL.csv")) {
      try (GigaCSV.Writer writer =
          csv.writerWithModeAndAlwaysQuote(
              "src/test/resources/reader_06_04_AQ_CRLF_NENDL_WAQ.csv", "rw")) {
        for (GigaCSV.Record record : reader) {
          writer.write(record);
        }
      } catch (Exception e) {
        assert false;
      }
      try (GigaCSV.Writer writer =
          csv.writerWithMode("src/test/resources/reader_06_04_AQ_CRLF_NENDL_WNQ.csv", "rw")) {
        for (GigaCSV.Record record : reader) {
          writer.write(record);
        }
      } catch (Exception e) {
        assert false;
      }
    } catch (Exception e) {
      assert false;
    }
    try (GigaCSV.Reader reader1 = csv.reader("src/test/resources/reader_06_04_AQ_CRLF_NENDL.csv")) {
      try (GigaCSV.Reader reader =
          csv.reader("src/test/resources/reader_06_04_AQ_CRLF_NENDL_WAQ.csv")) {
        Iterator<GigaCSV.Record> iterator1 = reader1.iterator();
        Iterator<GigaCSV.Record> iterator = reader.iterator();
        Assertions.assertEquals(iterator.hasNext(), iterator1.hasNext());
        while (iterator.hasNext()) {
          GigaCSV.Record next = iterator.next();
          GigaCSV.Record next1 = iterator1.next();
          Assertions.assertEquals(next, next1);
        }
      }
      try (GigaCSV.Reader reader =
          csv.reader("src/test/resources/reader_06_04_AQ_CRLF_NENDL_WNQ.csv")) {
        Iterator<GigaCSV.Record> iterator1 = reader1.iterator();
        Iterator<GigaCSV.Record> iterator = reader.iterator();
        Assertions.assertEquals(iterator.hasNext(), iterator1.hasNext());
        while (iterator.hasNext()) {
          GigaCSV.Record next = iterator.next();
          GigaCSV.Record next1 = iterator1.next();
          Assertions.assertEquals(next, next1);
        }
      }
    } catch (Exception e) {
      assert false;
    }
    try {
      Files.deleteIfExists(Paths.get("src/test/resources/reader_06_04_AQ_CRLF_NENDL_WAQ.csv"));
      Files.deleteIfExists(Paths.get("src/test/resources/reader_06_04_AQ_CRLF_NENDL_WNQ.csv"));
    } catch (IOException e) {
      assert false;
    }
  }

  @Test
  void test04AQCRNENDL() {
    final GigaCSV csv = new GigaCSV(new GigaCSV.Option().bufferSize(60));
    try (GigaCSV.Reader reader = csv.reader("src/test/resources/reader_06_04_AQ_CR_NENDL.csv")) {
      try (GigaCSV.Writer writer =
          csv.writerWithModeAndAlwaysQuote(
              "src/test/resources/reader_06_04_AQ_CR_NENDL_WAQ.csv", "rw")) {
        for (GigaCSV.Record record : reader) {
          writer.write(record);
        }
      } catch (Exception e) {
        assert false;
      }
      try (GigaCSV.Writer writer =
          csv.writerWithMode("src/test/resources/reader_06_04_AQ_CR_NENDL_WNQ.csv", "rw")) {
        for (GigaCSV.Record record : reader) {
          writer.write(record);
        }
      } catch (Exception e) {
        assert false;
      }
    } catch (Exception e) {
      assert false;
    }
    try (GigaCSV.Reader reader1 = csv.reader("src/test/resources/reader_06_04_AQ_CR_NENDL.csv")) {
      try (GigaCSV.Reader reader =
          csv.reader("src/test/resources/reader_06_04_AQ_CR_NENDL_WAQ.csv")) {
        Iterator<GigaCSV.Record> iterator1 = reader1.iterator();
        Iterator<GigaCSV.Record> iterator = reader.iterator();
        Assertions.assertEquals(iterator.hasNext(), iterator1.hasNext());
        while (iterator.hasNext()) {
          GigaCSV.Record next = iterator.next();
          GigaCSV.Record next1 = iterator1.next();
          Assertions.assertEquals(next, next1);
        }
      }
      try (GigaCSV.Reader reader =
          csv.reader("src/test/resources/reader_06_04_AQ_CR_NENDL_WNQ.csv")) {
        Iterator<GigaCSV.Record> iterator1 = reader1.iterator();
        Iterator<GigaCSV.Record> iterator = reader.iterator();
        Assertions.assertEquals(iterator.hasNext(), iterator1.hasNext());
        while (iterator.hasNext()) {
          GigaCSV.Record next = iterator.next();
          GigaCSV.Record next1 = iterator1.next();
          Assertions.assertEquals(next, next1);
        }
      }
    } catch (Exception e) {
      assert false;
    }
    try {
      Files.deleteIfExists(Paths.get("src/test/resources/reader_06_04_AQ_CR_NENDL_WAQ.csv"));
      Files.deleteIfExists(Paths.get("src/test/resources/reader_06_04_AQ_CR_NENDL_WNQ.csv"));
    } catch (IOException e) {
      assert false;
    }
  }

  @Test
  void test04AQLFWENDL() {
    final GigaCSV csv = new GigaCSV(new GigaCSV.Option().bufferSize(60));
    try (GigaCSV.Reader reader = csv.reader("src/test/resources/reader_06_04_AQ_LF_WENDL.csv")) {
      try (GigaCSV.Writer writer =
          csv.writerWithModeAndAlwaysQuote(
              "src/test/resources/reader_06_04_AQ_LF_WENDL_WAQ.csv", "rw")) {
        for (GigaCSV.Record record : reader) {
          writer.write(record);
        }
      } catch (Exception e) {
        assert false;
      }
      try (GigaCSV.Writer writer =
          csv.writerWithMode("src/test/resources/reader_06_04_AQ_LF_WENDL_WNQ.csv", "rw")) {
        for (GigaCSV.Record record : reader) {
          writer.write(record);
        }
      } catch (Exception e) {
        assert false;
      }
    } catch (Exception e) {
      assert false;
    }
    try (GigaCSV.Reader reader1 = csv.reader("src/test/resources/reader_06_04_AQ_LF_WENDL.csv")) {
      try (GigaCSV.Reader reader =
          csv.reader("src/test/resources/reader_06_04_AQ_LF_WENDL_WAQ.csv")) {
        Iterator<GigaCSV.Record> iterator1 = reader1.iterator();
        Iterator<GigaCSV.Record> iterator = reader.iterator();
        Assertions.assertEquals(iterator.hasNext(), iterator1.hasNext());
        while (iterator.hasNext()) {
          GigaCSV.Record next = iterator.next();
          GigaCSV.Record next1 = iterator1.next();
          Assertions.assertEquals(next, next1);
        }
      }
      try (GigaCSV.Reader reader =
          csv.reader("src/test/resources/reader_06_04_AQ_LF_WENDL_WNQ.csv")) {
        Iterator<GigaCSV.Record> iterator1 = reader1.iterator();
        Iterator<GigaCSV.Record> iterator = reader.iterator();
        Assertions.assertEquals(iterator.hasNext(), iterator1.hasNext());
        while (iterator.hasNext()) {
          GigaCSV.Record next = iterator.next();
          GigaCSV.Record next1 = iterator1.next();
          Assertions.assertEquals(next, next1);
        }
      }
    } catch (Exception e) {
      assert false;
    }
    try {
      Files.deleteIfExists(Paths.get("src/test/resources/reader_06_04_AQ_LF_WENDL_WAQ.csv"));
      Files.deleteIfExists(Paths.get("src/test/resources/reader_06_04_AQ_LF_WENDL_WNQ.csv"));
    } catch (IOException e) {
      assert false;
    }
  }

  @Test
  void test04AQCRLFWENDL() {
    final GigaCSV csv = new GigaCSV(new GigaCSV.Option().bufferSize(60));
    try (GigaCSV.Reader reader = csv.reader("src/test/resources/reader_06_04_AQ_CRLF_WENDL.csv")) {
      try (GigaCSV.Writer writer =
          csv.writerWithModeAndAlwaysQuote(
              "src/test/resources/reader_06_04_AQ_CRLF_WENDL_WAQ.csv", "rw")) {
        for (GigaCSV.Record record : reader) {
          writer.write(record);
        }
      } catch (Exception e) {
        assert false;
      }
      try (GigaCSV.Writer writer =
          csv.writerWithMode("src/test/resources/reader_06_04_AQ_CRLF_WENDL_WNQ.csv", "rw")) {
        for (GigaCSV.Record record : reader) {
          writer.write(record);
        }
      } catch (Exception e) {
        assert false;
      }
    } catch (Exception e) {
      assert false;
    }
    try (GigaCSV.Reader reader1 = csv.reader("src/test/resources/reader_06_04_AQ_CRLF_WENDL.csv")) {
      try (GigaCSV.Reader reader =
          csv.reader("src/test/resources/reader_06_04_AQ_CRLF_WENDL_WAQ.csv")) {
        Iterator<GigaCSV.Record> iterator1 = reader1.iterator();
        Iterator<GigaCSV.Record> iterator = reader.iterator();
        Assertions.assertEquals(iterator.hasNext(), iterator1.hasNext());
        while (iterator.hasNext()) {
          GigaCSV.Record next = iterator.next();
          GigaCSV.Record next1 = iterator1.next();
          Assertions.assertEquals(next, next1);
        }
      }
      try (GigaCSV.Reader reader =
          csv.reader("src/test/resources/reader_06_04_AQ_CRLF_WENDL_WNQ.csv")) {
        Iterator<GigaCSV.Record> iterator1 = reader1.iterator();
        Iterator<GigaCSV.Record> iterator = reader.iterator();
        Assertions.assertEquals(iterator.hasNext(), iterator1.hasNext());
        while (iterator.hasNext()) {
          GigaCSV.Record next = iterator.next();
          GigaCSV.Record next1 = iterator1.next();
          Assertions.assertEquals(next, next1);
        }
      }
    } catch (Exception e) {
      assert false;
    }
    try {
      Files.deleteIfExists(Paths.get("src/test/resources/reader_06_04_AQ_CRLF_WENDL_WAQ.csv"));
      Files.deleteIfExists(Paths.get("src/test/resources/reader_06_04_AQ_CRLF_WENDL_WNQ.csv"));
    } catch (IOException e) {
      assert false;
    }
  }

  @Test
  void test04AQCRWENDL() {
    final GigaCSV csv = new GigaCSV(new GigaCSV.Option().bufferSize(60));
    try (GigaCSV.Reader reader = csv.reader("src/test/resources/reader_06_04_AQ_CR_WENDL.csv")) {
      try (GigaCSV.Writer writer =
          csv.writerWithModeAndAlwaysQuote(
              "src/test/resources/reader_06_04_AQ_CR_WENDL_WAQ.csv", "rw")) {
        for (GigaCSV.Record record : reader) {
          writer.write(record);
        }
      } catch (Exception e) {
        assert false;
      }
      try (GigaCSV.Writer writer =
          csv.writerWithMode("src/test/resources/reader_06_04_AQ_CR_WENDL_WNQ.csv", "rw")) {
        for (GigaCSV.Record record : reader) {
          writer.write(record);
        }
      } catch (Exception e) {
        assert false;
      }
    } catch (Exception e) {
      assert false;
    }
    try (GigaCSV.Reader reader1 = csv.reader("src/test/resources/reader_06_04_AQ_CR_WENDL.csv")) {
      try (GigaCSV.Reader reader =
          csv.reader("src/test/resources/reader_06_04_AQ_CR_WENDL_WAQ.csv")) {
        Iterator<GigaCSV.Record> iterator1 = reader1.iterator();
        Iterator<GigaCSV.Record> iterator = reader.iterator();
        Assertions.assertEquals(iterator.hasNext(), iterator1.hasNext());
        while (iterator.hasNext()) {
          GigaCSV.Record next = iterator.next();
          GigaCSV.Record next1 = iterator1.next();
          Assertions.assertEquals(next, next1);
        }
      }
      try (GigaCSV.Reader reader =
          csv.reader("src/test/resources/reader_06_04_AQ_CR_WENDL_WNQ.csv")) {
        Iterator<GigaCSV.Record> iterator1 = reader1.iterator();
        Iterator<GigaCSV.Record> iterator = reader.iterator();
        Assertions.assertEquals(iterator.hasNext(), iterator1.hasNext());
        while (iterator.hasNext()) {
          GigaCSV.Record next = iterator.next();
          GigaCSV.Record next1 = iterator1.next();
          Assertions.assertEquals(next, next1);
        }
      }
    } catch (Exception e) {
      assert false;
    }
    try {
      Files.deleteIfExists(Paths.get("src/test/resources/reader_06_04_AQ_CR_WENDL_WAQ.csv"));
      Files.deleteIfExists(Paths.get("src/test/resources/reader_06_04_AQ_CR_WENDL_WNQ.csv"));
    } catch (IOException e) {
      assert false;
    }
  }

  //
  @Test
  void test04NQLFNENDL() {
    final GigaCSV csv = new GigaCSV(new GigaCSV.Option().bufferSize(60));
    try (GigaCSV.Reader reader = csv.reader("src/test/resources/reader_06_04_NQ_LF_NENDL.csv")) {
      try (GigaCSV.Writer writer =
          csv.writerWithModeAndAlwaysQuote(
              "src/test/resources/reader_06_04_NQ_LF_NENDL_WAQ.csv", "rw")) {
        for (GigaCSV.Record record : reader) {
          writer.write(record);
        }
      } catch (Exception e) {
        assert false;
      }
      try (GigaCSV.Writer writer =
          csv.writerWithMode("src/test/resources/reader_06_04_NQ_LF_NENDL_WNQ.csv", "rw")) {
        for (GigaCSV.Record record : reader) {
          writer.write(record);
        }
      } catch (Exception e) {
        assert false;
      }
    } catch (Exception e) {
      assert false;
    }
    try (GigaCSV.Reader reader1 = csv.reader("src/test/resources/reader_06_04_NQ_LF_NENDL.csv")) {
      try (GigaCSV.Reader reader =
          csv.reader("src/test/resources/reader_06_04_NQ_LF_NENDL_WAQ.csv")) {
        Iterator<GigaCSV.Record> iterator1 = reader1.iterator();
        Iterator<GigaCSV.Record> iterator = reader.iterator();
        Assertions.assertEquals(iterator.hasNext(), iterator1.hasNext());
        while (iterator.hasNext()) {
          GigaCSV.Record next = iterator.next();
          GigaCSV.Record next1 = iterator1.next();
          Assertions.assertEquals(next, next1);
        }
      }
      try (GigaCSV.Reader reader =
          csv.reader("src/test/resources/reader_06_04_NQ_LF_NENDL_WNQ.csv")) {
        Iterator<GigaCSV.Record> iterator1 = reader1.iterator();
        Iterator<GigaCSV.Record> iterator = reader.iterator();
        Assertions.assertEquals(iterator.hasNext(), iterator1.hasNext());
        while (iterator.hasNext()) {
          GigaCSV.Record next = iterator.next();
          GigaCSV.Record next1 = iterator1.next();
          Assertions.assertEquals(next, next1);
        }
      }
    } catch (Exception e) {
      assert false;
    }
    try {
      Files.deleteIfExists(Paths.get("src/test/resources/reader_06_04_NQ_LF_NENDL_WAQ.csv"));
      Files.deleteIfExists(Paths.get("src/test/resources/reader_06_04_NQ_LF_NENDL_WNQ.csv"));
    } catch (IOException e) {
      assert false;
    }
  }

  @Test
  void test04NQCRLFNENDL() {
    final GigaCSV csv = new GigaCSV(new GigaCSV.Option().bufferSize(60));
    try (GigaCSV.Reader reader = csv.reader("src/test/resources/reader_06_04_NQ_CRLF_NENDL.csv")) {
      try (GigaCSV.Writer writer =
          csv.writerWithModeAndAlwaysQuote(
              "src/test/resources/reader_06_04_NQ_CRLF_NENDL_WAQ.csv", "rw")) {
        for (GigaCSV.Record record : reader) {
          writer.write(record);
        }
      } catch (Exception e) {
        assert false;
      }
      try (GigaCSV.Writer writer =
          csv.writerWithMode("src/test/resources/reader_06_04_NQ_CRLF_NENDL_WNQ.csv", "rw")) {
        for (GigaCSV.Record record : reader) {
          writer.write(record);
        }
      } catch (Exception e) {
        assert false;
      }
    } catch (Exception e) {
      assert false;
    }
    try (GigaCSV.Reader reader1 = csv.reader("src/test/resources/reader_06_04_NQ_CRLF_NENDL.csv")) {
      try (GigaCSV.Reader reader =
          csv.reader("src/test/resources/reader_06_04_NQ_CRLF_NENDL_WAQ.csv")) {
        Iterator<GigaCSV.Record> iterator1 = reader1.iterator();
        Iterator<GigaCSV.Record> iterator = reader.iterator();
        Assertions.assertEquals(iterator.hasNext(), iterator1.hasNext());
        while (iterator.hasNext()) {
          GigaCSV.Record next = iterator.next();
          GigaCSV.Record next1 = iterator1.next();
          Assertions.assertEquals(next, next1);
        }
      }
      try (GigaCSV.Reader reader =
          csv.reader("src/test/resources/reader_06_04_NQ_CRLF_NENDL_WNQ.csv")) {
        Iterator<GigaCSV.Record> iterator1 = reader1.iterator();
        Iterator<GigaCSV.Record> iterator = reader.iterator();
        Assertions.assertEquals(iterator.hasNext(), iterator1.hasNext());
        while (iterator.hasNext()) {
          GigaCSV.Record next = iterator.next();
          GigaCSV.Record next1 = iterator1.next();
          Assertions.assertEquals(next, next1);
        }
      }
    } catch (Exception e) {
      assert false;
    }
    try {
      Files.deleteIfExists(Paths.get("src/test/resources/reader_06_04_NQ_CRLF_NENDL_WAQ.csv"));
      Files.deleteIfExists(Paths.get("src/test/resources/reader_06_04_NQ_CRLF_NENDL_WNQ.csv"));
    } catch (IOException e) {
      assert false;
    }
  }

  @Test
  void test04NQCRNENDL() {
    final GigaCSV csv = new GigaCSV(new GigaCSV.Option().bufferSize(60));
    try (GigaCSV.Reader reader = csv.reader("src/test/resources/reader_06_04_NQ_CR_NENDL.csv")) {
      try (GigaCSV.Writer writer =
          csv.writerWithModeAndAlwaysQuote(
              "src/test/resources/reader_06_04_NQ_CR_NENDL_WAQ.csv", "rw")) {
        for (GigaCSV.Record record : reader) {
          writer.write(record);
        }
      } catch (Exception e) {
        assert false;
      }
      try (GigaCSV.Writer writer =
          csv.writerWithMode("src/test/resources/reader_06_04_NQ_CR_NENDL_WNQ.csv", "rw")) {
        for (GigaCSV.Record record : reader) {
          writer.write(record);
        }
      } catch (Exception e) {
        assert false;
      }
    } catch (Exception e) {
      assert false;
    }
    try (GigaCSV.Reader reader1 = csv.reader("src/test/resources/reader_06_04_NQ_CR_NENDL.csv")) {
      try (GigaCSV.Reader reader =
          csv.reader("src/test/resources/reader_06_04_NQ_CR_NENDL_WAQ.csv")) {
        Iterator<GigaCSV.Record> iterator1 = reader1.iterator();
        Iterator<GigaCSV.Record> iterator = reader.iterator();
        Assertions.assertEquals(iterator.hasNext(), iterator1.hasNext());
        while (iterator.hasNext()) {
          GigaCSV.Record next = iterator.next();
          GigaCSV.Record next1 = iterator1.next();
          Assertions.assertEquals(next, next1);
        }
      }
      try (GigaCSV.Reader reader =
          csv.reader("src/test/resources/reader_06_04_NQ_CR_NENDL_WNQ.csv")) {
        Iterator<GigaCSV.Record> iterator1 = reader1.iterator();
        Iterator<GigaCSV.Record> iterator = reader.iterator();
        Assertions.assertEquals(iterator.hasNext(), iterator1.hasNext());
        while (iterator.hasNext()) {
          GigaCSV.Record next = iterator.next();
          GigaCSV.Record next1 = iterator1.next();
          Assertions.assertEquals(next, next1);
        }
      }
    } catch (Exception e) {
      assert false;
    }
    try {
      Files.deleteIfExists(Paths.get("src/test/resources/reader_06_04_NQ_CR_NENDL_WAQ.csv"));
      Files.deleteIfExists(Paths.get("src/test/resources/reader_06_04_NQ_CR_NENDL_WNQ.csv"));
    } catch (IOException e) {
      assert false;
    }
  }

  @Test
  void test04NQLFWENDL() {
    final GigaCSV csv = new GigaCSV(new GigaCSV.Option().bufferSize(60));
    try (GigaCSV.Reader reader = csv.reader("src/test/resources/reader_06_04_NQ_LF_WENDL.csv")) {
      try (GigaCSV.Writer writer =
          csv.writerWithModeAndAlwaysQuote(
              "src/test/resources/reader_06_04_NQ_LF_WENDL_WAQ.csv", "rw")) {
        for (GigaCSV.Record record : reader) {
          writer.write(record);
        }
      } catch (Exception e) {
        assert false;
      }
      try (GigaCSV.Writer writer =
          csv.writerWithMode("src/test/resources/reader_06_04_NQ_LF_WENDL_WNQ.csv", "rw")) {
        for (GigaCSV.Record record : reader) {
          writer.write(record);
        }
      } catch (Exception e) {
        assert false;
      }
    } catch (Exception e) {
      assert false;
    }
    try (GigaCSV.Reader reader1 = csv.reader("src/test/resources/reader_06_04_NQ_LF_WENDL.csv")) {
      try (GigaCSV.Reader reader =
          csv.reader("src/test/resources/reader_06_04_NQ_LF_WENDL_WAQ.csv")) {
        Iterator<GigaCSV.Record> iterator1 = reader1.iterator();
        Iterator<GigaCSV.Record> iterator = reader.iterator();
        Assertions.assertEquals(iterator.hasNext(), iterator1.hasNext());
        while (iterator.hasNext()) {
          GigaCSV.Record next = iterator.next();
          GigaCSV.Record next1 = iterator1.next();
          Assertions.assertEquals(next, next1);
        }
      }
      try (GigaCSV.Reader reader =
          csv.reader("src/test/resources/reader_06_04_NQ_LF_WENDL_WNQ.csv")) {
        Iterator<GigaCSV.Record> iterator1 = reader1.iterator();
        Iterator<GigaCSV.Record> iterator = reader.iterator();
        Assertions.assertEquals(iterator.hasNext(), iterator1.hasNext());
        while (iterator.hasNext()) {
          GigaCSV.Record next = iterator.next();
          GigaCSV.Record next1 = iterator1.next();
          Assertions.assertEquals(next, next1);
        }
      }
    } catch (Exception e) {
      assert false;
    }
    try {
      Files.deleteIfExists(Paths.get("src/test/resources/reader_06_04_NQ_LF_WENDL_WAQ.csv"));
      Files.deleteIfExists(Paths.get("src/test/resources/reader_06_04_NQ_LF_WENDL_WNQ.csv"));
    } catch (IOException e) {
      assert false;
    }
  }

  @Test
  void test04NQCRLFWENDL() {
    final GigaCSV csv = new GigaCSV(new GigaCSV.Option().bufferSize(60));
    try (GigaCSV.Reader reader = csv.reader("src/test/resources/reader_06_04_NQ_CRLF_WENDL.csv")) {
      try (GigaCSV.Writer writer =
          csv.writerWithModeAndAlwaysQuote(
              "src/test/resources/reader_06_04_NQ_CRLF_WENDL_WAQ.csv", "rw")) {
        for (GigaCSV.Record record : reader) {
          writer.write(record);
        }
      } catch (Exception e) {
        assert false;
      }
      try (GigaCSV.Writer writer =
          csv.writerWithMode("src/test/resources/reader_06_04_NQ_CRLF_WENDL_WNQ.csv", "rw")) {
        for (GigaCSV.Record record : reader) {
          writer.write(record);
        }
      } catch (Exception e) {
        assert false;
      }
    } catch (Exception e) {
      assert false;
    }
    try (GigaCSV.Reader reader1 = csv.reader("src/test/resources/reader_06_04_NQ_CRLF_WENDL.csv")) {
      try (GigaCSV.Reader reader =
          csv.reader("src/test/resources/reader_06_04_NQ_CRLF_WENDL_WAQ.csv")) {
        Iterator<GigaCSV.Record> iterator1 = reader1.iterator();
        Iterator<GigaCSV.Record> iterator = reader.iterator();
        Assertions.assertEquals(iterator.hasNext(), iterator1.hasNext());
        while (iterator.hasNext()) {
          GigaCSV.Record next = iterator.next();
          GigaCSV.Record next1 = iterator1.next();
          Assertions.assertEquals(next, next1);
        }
      }
      try (GigaCSV.Reader reader =
          csv.reader("src/test/resources/reader_06_04_NQ_CRLF_WENDL_WNQ.csv")) {
        Iterator<GigaCSV.Record> iterator1 = reader1.iterator();
        Iterator<GigaCSV.Record> iterator = reader.iterator();
        Assertions.assertEquals(iterator.hasNext(), iterator1.hasNext());
        while (iterator.hasNext()) {
          GigaCSV.Record next = iterator.next();
          GigaCSV.Record next1 = iterator1.next();
          Assertions.assertEquals(next, next1);
        }
      }
    } catch (Exception e) {
      assert false;
    }
    try {
      Files.deleteIfExists(Paths.get("src/test/resources/reader_06_04_NQ_CRLF_WENDL_WAQ.csv"));
      Files.deleteIfExists(Paths.get("src/test/resources/reader_06_04_NQ_CRLF_WENDL_WNQ.csv"));
    } catch (IOException e) {
      assert false;
    }
  }

  @Test
  void test04NQCRWENDL() {
    final GigaCSV csv = new GigaCSV(new GigaCSV.Option().bufferSize(60));
    try (GigaCSV.Reader reader = csv.reader("src/test/resources/reader_06_04_NQ_CR_WENDL.csv")) {
      try (GigaCSV.Writer writer =
          csv.writerWithModeAndAlwaysQuote(
              "src/test/resources/reader_06_04_NQ_CR_WENDL_WAQ.csv", "rw")) {
        for (GigaCSV.Record record : reader) {
          writer.write(record);
        }
      } catch (Exception e) {
        assert false;
      }
      try (GigaCSV.Writer writer =
          csv.writerWithMode("src/test/resources/reader_06_04_NQ_CR_WENDL_WNQ.csv", "rw")) {
        for (GigaCSV.Record record : reader) {
          writer.write(record);
        }
      } catch (Exception e) {
        assert false;
      }
    } catch (Exception e) {
      assert false;
    }
    try (GigaCSV.Reader reader1 = csv.reader("src/test/resources/reader_06_04_NQ_CR_WENDL.csv")) {
      try (GigaCSV.Reader reader =
          csv.reader("src/test/resources/reader_06_04_NQ_CR_WENDL_WAQ.csv")) {
        Iterator<GigaCSV.Record> iterator1 = reader1.iterator();
        Iterator<GigaCSV.Record> iterator = reader.iterator();
        Assertions.assertEquals(iterator.hasNext(), iterator1.hasNext());
        while (iterator.hasNext()) {
          GigaCSV.Record next = iterator.next();
          GigaCSV.Record next1 = iterator1.next();
          Assertions.assertEquals(next, next1);
        }
      }
      try (GigaCSV.Reader reader =
          csv.reader("src/test/resources/reader_06_04_NQ_CR_WENDL_WNQ.csv")) {
        Iterator<GigaCSV.Record> iterator1 = reader1.iterator();
        Iterator<GigaCSV.Record> iterator = reader.iterator();
        Assertions.assertEquals(iterator.hasNext(), iterator1.hasNext());
        while (iterator.hasNext()) {
          GigaCSV.Record next = iterator.next();
          GigaCSV.Record next1 = iterator1.next();
          Assertions.assertEquals(next, next1);
        }
      }
    } catch (Exception e) {
      assert false;
    }
    try {
      Files.deleteIfExists(Paths.get("src/test/resources/reader_06_04_NQ_CR_WENDL_WAQ.csv"));
      Files.deleteIfExists(Paths.get("src/test/resources/reader_06_04_NQ_CR_WENDL_WNQ.csv"));
    } catch (IOException e) {
      assert false;
    }
  }
}
