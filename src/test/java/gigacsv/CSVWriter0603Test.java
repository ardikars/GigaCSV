package gigacsv;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Iterator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

@Disabled
class CSVWriter0603Test {

  @Test
  void test03AQLFNENDL() {
    final GigaCSV csv = new GigaCSV(new GigaCSV.Option().bufferSize(50));
    try (GigaCSV.Reader reader = csv.reader("src/test/resources/reader_06_03_AQ_LF_NENDL.csv")) {
      try (GigaCSV.Writer writer =
          csv.writerWithModeAndAlwaysQuote(
              "src/test/resources/reader_06_03_AQ_LF_NENDL_WAQ.csv", "rw")) {
        for (GigaCSV.Record record : reader) {
          writer.write(record);
        }
      } catch (Exception e) {
        assert false;
      }
      try (GigaCSV.Writer writer =
          csv.writerWithMode("src/test/resources/reader_06_03_AQ_LF_NENDL_WNQ.csv", "rw")) {
        for (GigaCSV.Record record : reader) {
          writer.write(record);
        }
      } catch (Exception e) {
        assert false;
      }
    } catch (Exception e) {
      assert false;
    }
    try (GigaCSV.Reader reader1 = csv.reader("src/test/resources/reader_06_03_AQ_LF_NENDL.csv")) {
      try (GigaCSV.Reader reader =
          csv.reader("src/test/resources/reader_06_03_AQ_LF_NENDL_WAQ.csv")) {
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
          csv.reader("src/test/resources/reader_06_03_AQ_LF_NENDL_WNQ.csv")) {
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
      Files.deleteIfExists(Paths.get("src/test/resources/reader_06_03_AQ_LF_NENDL_WAQ.csv"));
      Files.deleteIfExists(Paths.get("src/test/resources/reader_06_03_AQ_LF_NENDL_WNQ.csv"));
    } catch (IOException e) {
      assert false;
    }
  }

  @Test
  void test03AQCRLFNENDL() {
    final GigaCSV csv = new GigaCSV(new GigaCSV.Option().bufferSize(50));
    try (GigaCSV.Reader reader = csv.reader("src/test/resources/reader_06_03_AQ_CRLF_NENDL.csv")) {
      try (GigaCSV.Writer writer =
          csv.writerWithModeAndAlwaysQuote(
              "src/test/resources/reader_06_03_AQ_CRLF_NENDL_WAQ.csv", "rw")) {
        for (GigaCSV.Record record : reader) {
          writer.write(record);
        }
      } catch (Exception e) {
        assert false;
      }
      try (GigaCSV.Writer writer =
          csv.writerWithMode("src/test/resources/reader_06_03_AQ_CRLF_NENDL_WNQ.csv", "rw")) {
        for (GigaCSV.Record record : reader) {
          writer.write(record);
        }
      } catch (Exception e) {
        assert false;
      }
    } catch (Exception e) {
      assert false;
    }
    try (GigaCSV.Reader reader1 = csv.reader("src/test/resources/reader_06_03_AQ_CRLF_NENDL.csv")) {
      try (GigaCSV.Reader reader =
          csv.reader("src/test/resources/reader_06_03_AQ_CRLF_NENDL_WAQ.csv")) {
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
          csv.reader("src/test/resources/reader_06_03_AQ_CRLF_NENDL_WNQ.csv")) {
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
      Files.deleteIfExists(Paths.get("src/test/resources/reader_06_03_AQ_CRLF_NENDL_WAQ.csv"));
      Files.deleteIfExists(Paths.get("src/test/resources/reader_06_03_AQ_CRLF_NENDL_WNQ.csv"));
    } catch (IOException e) {
      assert false;
    }
  }

  @Test
  void test03AQCRNENDL() {
    final GigaCSV csv = new GigaCSV(new GigaCSV.Option().bufferSize(50));
    try (GigaCSV.Reader reader = csv.reader("src/test/resources/reader_06_03_AQ_CR_NENDL.csv")) {
      try (GigaCSV.Writer writer =
          csv.writerWithModeAndAlwaysQuote(
              "src/test/resources/reader_06_03_AQ_CR_NENDL_WAQ.csv", "rw")) {
        for (GigaCSV.Record record : reader) {
          writer.write(record);
        }
      } catch (Exception e) {
        assert false;
      }
      try (GigaCSV.Writer writer =
          csv.writerWithMode("src/test/resources/reader_06_03_AQ_CR_NENDL_WNQ.csv", "rw")) {
        for (GigaCSV.Record record : reader) {
          writer.write(record);
        }
      } catch (Exception e) {
        assert false;
      }
    } catch (Exception e) {
      assert false;
    }
    try (GigaCSV.Reader reader1 = csv.reader("src/test/resources/reader_06_03_AQ_CR_NENDL.csv")) {
      try (GigaCSV.Reader reader =
          csv.reader("src/test/resources/reader_06_03_AQ_CR_NENDL_WAQ.csv")) {
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
          csv.reader("src/test/resources/reader_06_03_AQ_CR_NENDL_WNQ.csv")) {
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
      Files.deleteIfExists(Paths.get("src/test/resources/reader_06_03_AQ_CR_NENDL_WAQ.csv"));
      Files.deleteIfExists(Paths.get("src/test/resources/reader_06_03_AQ_CR_NENDL_WNQ.csv"));
    } catch (IOException e) {
      assert false;
    }
  }

  @Test
  void test03AQLFWENDL() {
    final GigaCSV csv = new GigaCSV(new GigaCSV.Option().bufferSize(50));
    try (GigaCSV.Reader reader = csv.reader("src/test/resources/reader_06_03_AQ_LF_WENDL.csv")) {
      try (GigaCSV.Writer writer =
          csv.writerWithModeAndAlwaysQuote(
              "src/test/resources/reader_06_03_AQ_LF_WENDL_WAQ.csv", "rw")) {
        for (GigaCSV.Record record : reader) {
          writer.write(record);
        }
      } catch (Exception e) {
        assert false;
      }
      try (GigaCSV.Writer writer =
          csv.writerWithMode("src/test/resources/reader_06_03_AQ_LF_WENDL_WNQ.csv", "rw")) {
        for (GigaCSV.Record record : reader) {
          writer.write(record);
        }
      } catch (Exception e) {
        assert false;
      }
    } catch (Exception e) {
      assert false;
    }
    try (GigaCSV.Reader reader1 = csv.reader("src/test/resources/reader_06_03_AQ_LF_WENDL.csv")) {
      try (GigaCSV.Reader reader =
          csv.reader("src/test/resources/reader_06_03_AQ_LF_WENDL_WAQ.csv")) {
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
          csv.reader("src/test/resources/reader_06_03_AQ_LF_WENDL_WNQ.csv")) {
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
      Files.deleteIfExists(Paths.get("src/test/resources/reader_06_03_AQ_LF_WENDL_WAQ.csv"));
      Files.deleteIfExists(Paths.get("src/test/resources/reader_06_03_AQ_LF_WENDL_WNQ.csv"));
    } catch (IOException e) {
      assert false;
    }
  }

  @Test
  void test03AQCRLFWENDL() {
    final GigaCSV csv = new GigaCSV(new GigaCSV.Option().bufferSize(50));
    try (GigaCSV.Reader reader = csv.reader("src/test/resources/reader_06_03_AQ_CRLF_WENDL.csv")) {
      try (GigaCSV.Writer writer =
          csv.writerWithModeAndAlwaysQuote(
              "src/test/resources/reader_06_03_AQ_CRLF_WENDL_WAQ.csv", "rw")) {
        for (GigaCSV.Record record : reader) {
          writer.write(record);
        }
      } catch (Exception e) {
        assert false;
      }
      try (GigaCSV.Writer writer =
          csv.writerWithMode("src/test/resources/reader_06_03_AQ_CRLF_WENDL_WNQ.csv", "rw")) {
        for (GigaCSV.Record record : reader) {
          writer.write(record);
        }
      } catch (Exception e) {
        assert false;
      }
    } catch (Exception e) {
      assert false;
    }
    try (GigaCSV.Reader reader1 = csv.reader("src/test/resources/reader_06_03_AQ_CRLF_WENDL.csv")) {
      try (GigaCSV.Reader reader =
          csv.reader("src/test/resources/reader_06_03_AQ_CRLF_WENDL_WAQ.csv")) {
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
          csv.reader("src/test/resources/reader_06_03_AQ_CRLF_WENDL_WNQ.csv")) {
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
      Files.deleteIfExists(Paths.get("src/test/resources/reader_06_03_AQ_CRLF_WENDL_WAQ.csv"));
      Files.deleteIfExists(Paths.get("src/test/resources/reader_06_03_AQ_CRLF_WENDL_WNQ.csv"));
    } catch (IOException e) {
      assert false;
    }
  }

  @Test
  void test03AQCRWENDL() {
    final GigaCSV csv = new GigaCSV(new GigaCSV.Option().bufferSize(50));
    try (GigaCSV.Reader reader = csv.reader("src/test/resources/reader_06_03_AQ_CR_WENDL.csv")) {
      try (GigaCSV.Writer writer =
          csv.writerWithModeAndAlwaysQuote(
              "src/test/resources/reader_06_03_AQ_CR_WENDL_WAQ.csv", "rw")) {
        for (GigaCSV.Record record : reader) {
          writer.write(record);
        }
      } catch (Exception e) {
        assert false;
      }
      try (GigaCSV.Writer writer =
          csv.writerWithMode("src/test/resources/reader_06_03_AQ_CR_WENDL_WNQ.csv", "rw")) {
        for (GigaCSV.Record record : reader) {
          writer.write(record);
        }
      } catch (Exception e) {
        assert false;
      }
    } catch (Exception e) {
      assert false;
    }
    try (GigaCSV.Reader reader1 = csv.reader("src/test/resources/reader_06_03_AQ_CR_WENDL.csv")) {
      try (GigaCSV.Reader reader =
          csv.reader("src/test/resources/reader_06_03_AQ_CR_WENDL_WAQ.csv")) {
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
          csv.reader("src/test/resources/reader_06_03_AQ_CR_WENDL_WNQ.csv")) {
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
      Files.deleteIfExists(Paths.get("src/test/resources/reader_06_03_AQ_CR_WENDL_WAQ.csv"));
      Files.deleteIfExists(Paths.get("src/test/resources/reader_06_03_AQ_CR_WENDL_WNQ.csv"));
    } catch (IOException e) {
      assert false;
    }
  }

  //
  @Test
  void test03NQLFNENDL() {
    final GigaCSV csv = new GigaCSV(new GigaCSV.Option().bufferSize(50));
    try (GigaCSV.Reader reader = csv.reader("src/test/resources/reader_06_03_NQ_LF_NENDL.csv")) {
      try (GigaCSV.Writer writer =
          csv.writerWithModeAndAlwaysQuote(
              "src/test/resources/reader_06_03_NQ_LF_NENDL_WAQ.csv", "rw")) {
        for (GigaCSV.Record record : reader) {
          writer.write(record);
        }
      } catch (Exception e) {
        assert false;
      }
      try (GigaCSV.Writer writer =
          csv.writerWithMode("src/test/resources/reader_06_03_NQ_LF_NENDL_WNQ.csv", "rw")) {
        for (GigaCSV.Record record : reader) {
          writer.write(record);
        }
      } catch (Exception e) {
        assert false;
      }
    } catch (Exception e) {
      assert false;
    }
    try (GigaCSV.Reader reader1 = csv.reader("src/test/resources/reader_06_03_NQ_LF_NENDL.csv")) {
      try (GigaCSV.Reader reader =
          csv.reader("src/test/resources/reader_06_03_NQ_LF_NENDL_WAQ.csv")) {
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
          csv.reader("src/test/resources/reader_06_03_NQ_LF_NENDL_WNQ.csv")) {
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
      Files.deleteIfExists(Paths.get("src/test/resources/reader_06_03_NQ_LF_NENDL_WAQ.csv"));
      Files.deleteIfExists(Paths.get("src/test/resources/reader_06_03_NQ_LF_NENDL_WNQ.csv"));
    } catch (IOException e) {
      assert false;
    }
  }

  @Test
  void test03NQCRLFNENDL() {
    final GigaCSV csv = new GigaCSV(new GigaCSV.Option().bufferSize(50));
    try (GigaCSV.Reader reader = csv.reader("src/test/resources/reader_06_03_NQ_CRLF_NENDL.csv")) {
      try (GigaCSV.Writer writer =
          csv.writerWithModeAndAlwaysQuote(
              "src/test/resources/reader_06_03_NQ_CRLF_NENDL_WAQ.csv", "rw")) {
        for (GigaCSV.Record record : reader) {
          writer.write(record);
        }
      } catch (Exception e) {
        assert false;
      }
      try (GigaCSV.Writer writer =
          csv.writerWithMode("src/test/resources/reader_06_03_NQ_CRLF_NENDL_WNQ.csv", "rw")) {
        for (GigaCSV.Record record : reader) {
          writer.write(record);
        }
      } catch (Exception e) {
        assert false;
      }
    } catch (Exception e) {
      assert false;
    }
    try (GigaCSV.Reader reader1 = csv.reader("src/test/resources/reader_06_03_NQ_CRLF_NENDL.csv")) {
      try (GigaCSV.Reader reader =
          csv.reader("src/test/resources/reader_06_03_NQ_CRLF_NENDL_WAQ.csv")) {
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
          csv.reader("src/test/resources/reader_06_03_NQ_CRLF_NENDL_WNQ.csv")) {
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
      Files.deleteIfExists(Paths.get("src/test/resources/reader_06_03_NQ_CRLF_NENDL_WAQ.csv"));
      Files.deleteIfExists(Paths.get("src/test/resources/reader_06_03_NQ_CRLF_NENDL_WNQ.csv"));
    } catch (IOException e) {
      assert false;
    }
  }

  @Test
  void test03NQCRNENDL() {
    final GigaCSV csv = new GigaCSV(new GigaCSV.Option().bufferSize(50));
    try (GigaCSV.Reader reader = csv.reader("src/test/resources/reader_06_03_NQ_CR_NENDL.csv")) {
      try (GigaCSV.Writer writer =
          csv.writerWithModeAndAlwaysQuote(
              "src/test/resources/reader_06_03_NQ_CR_NENDL_WAQ.csv", "rw")) {
        for (GigaCSV.Record record : reader) {
          writer.write(record);
        }
      } catch (Exception e) {
        assert false;
      }
      try (GigaCSV.Writer writer =
          csv.writerWithMode("src/test/resources/reader_06_03_NQ_CR_NENDL_WNQ.csv", "rw")) {
        for (GigaCSV.Record record : reader) {
          writer.write(record);
        }
      } catch (Exception e) {
        assert false;
      }
    } catch (Exception e) {
      assert false;
    }
    try (GigaCSV.Reader reader1 = csv.reader("src/test/resources/reader_06_03_NQ_CR_NENDL.csv")) {
      try (GigaCSV.Reader reader =
          csv.reader("src/test/resources/reader_06_03_NQ_CR_NENDL_WAQ.csv")) {
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
          csv.reader("src/test/resources/reader_06_03_NQ_CR_NENDL_WNQ.csv")) {
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
      Files.deleteIfExists(Paths.get("src/test/resources/reader_06_03_NQ_CR_NENDL_WAQ.csv"));
      Files.deleteIfExists(Paths.get("src/test/resources/reader_06_03_NQ_CR_NENDL_WNQ.csv"));
    } catch (IOException e) {
      assert false;
    }
  }

  @Test
  void test03NQLFWENDL() {
    final GigaCSV csv = new GigaCSV(new GigaCSV.Option().bufferSize(50));
    try (GigaCSV.Reader reader = csv.reader("src/test/resources/reader_06_03_NQ_LF_WENDL.csv")) {
      try (GigaCSV.Writer writer =
          csv.writerWithModeAndAlwaysQuote(
              "src/test/resources/reader_06_03_NQ_LF_WENDL_WAQ.csv", "rw")) {
        for (GigaCSV.Record record : reader) {
          writer.write(record);
        }
      } catch (Exception e) {
        assert false;
      }
      try (GigaCSV.Writer writer =
          csv.writerWithMode("src/test/resources/reader_06_03_NQ_LF_WENDL_WNQ.csv", "rw")) {
        for (GigaCSV.Record record : reader) {
          writer.write(record);
        }
      } catch (Exception e) {
        assert false;
      }
    } catch (Exception e) {
      assert false;
    }
    try (GigaCSV.Reader reader1 = csv.reader("src/test/resources/reader_06_03_NQ_LF_WENDL.csv")) {
      try (GigaCSV.Reader reader =
          csv.reader("src/test/resources/reader_06_03_NQ_LF_WENDL_WAQ.csv")) {
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
          csv.reader("src/test/resources/reader_06_03_NQ_LF_WENDL_WNQ.csv")) {
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
      Files.deleteIfExists(Paths.get("src/test/resources/reader_06_03_NQ_LF_WENDL_WAQ.csv"));
      Files.deleteIfExists(Paths.get("src/test/resources/reader_06_03_NQ_LF_WENDL_WNQ.csv"));
    } catch (IOException e) {
      assert false;
    }
  }

  @Test
  void test03NQCRLFWENDL() {
    final GigaCSV csv = new GigaCSV(new GigaCSV.Option().bufferSize(50));
    try (GigaCSV.Reader reader = csv.reader("src/test/resources/reader_06_03_NQ_CRLF_WENDL.csv")) {
      try (GigaCSV.Writer writer =
          csv.writerWithModeAndAlwaysQuote(
              "src/test/resources/reader_06_03_NQ_CRLF_WENDL_WAQ.csv", "rw")) {
        for (GigaCSV.Record record : reader) {
          writer.write(record);
        }
      } catch (Exception e) {
        assert false;
      }
      try (GigaCSV.Writer writer =
          csv.writerWithMode("src/test/resources/reader_06_03_NQ_CRLF_WENDL_WNQ.csv", "rw")) {
        for (GigaCSV.Record record : reader) {
          writer.write(record);
        }
      } catch (Exception e) {
        assert false;
      }
    } catch (Exception e) {
      assert false;
    }
    try (GigaCSV.Reader reader1 = csv.reader("src/test/resources/reader_06_03_NQ_CRLF_WENDL.csv")) {
      try (GigaCSV.Reader reader =
          csv.reader("src/test/resources/reader_06_03_NQ_CRLF_WENDL_WAQ.csv")) {
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
          csv.reader("src/test/resources/reader_06_03_NQ_CRLF_WENDL_WNQ.csv")) {
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
      Files.deleteIfExists(Paths.get("src/test/resources/reader_06_03_NQ_CRLF_WENDL_WAQ.csv"));
      Files.deleteIfExists(Paths.get("src/test/resources/reader_06_03_NQ_CRLF_WENDL_WNQ.csv"));
    } catch (IOException e) {
      assert false;
    }
  }

  @Test
  void test03NQCRWENDL() {
    final GigaCSV csv = new GigaCSV(new GigaCSV.Option().bufferSize(50));
    try (GigaCSV.Reader reader = csv.reader("src/test/resources/reader_06_03_NQ_CR_WENDL.csv")) {
      try (GigaCSV.Writer writer =
          csv.writerWithModeAndAlwaysQuote(
              "src/test/resources/reader_06_03_NQ_CR_WENDL_WAQ.csv", "rw")) {
        for (GigaCSV.Record record : reader) {
          writer.write(record);
        }
      } catch (Exception e) {
        assert false;
      }
      try (GigaCSV.Writer writer =
          csv.writerWithMode("src/test/resources/reader_06_03_NQ_CR_WENDL_WNQ.csv", "rw")) {
        for (GigaCSV.Record record : reader) {
          writer.write(record);
        }
      } catch (Exception e) {
        assert false;
      }
    } catch (Exception e) {
      assert false;
    }
    try (GigaCSV.Reader reader1 = csv.reader("src/test/resources/reader_06_03_NQ_CR_WENDL.csv")) {
      try (GigaCSV.Reader reader =
          csv.reader("src/test/resources/reader_06_03_NQ_CR_WENDL_WAQ.csv")) {
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
          csv.reader("src/test/resources/reader_06_03_NQ_CR_WENDL_WNQ.csv")) {
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
      Files.deleteIfExists(Paths.get("src/test/resources/reader_06_03_NQ_CR_WENDL_WAQ.csv"));
      Files.deleteIfExists(Paths.get("src/test/resources/reader_06_03_NQ_CR_WENDL_WNQ.csv"));
    } catch (IOException e) {
      assert false;
    }
  }
}
