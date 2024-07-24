package gigacsv;

import java.util.Iterator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

@Disabled
class CSVReader0604Test {

  @Test
  void test04AQLFNENDL() {
    final GigaCSV csv = new GigaCSV(new GigaCSV.Option().bufferSize(60));
    try (GigaCSV.Reader reader = csv.reader("src/test/resources/reader_06_04_AQ_LF_NENDL.csv")) {
      Iterator<GigaCSV.Record> iterator = reader.iterator();
      GigaCSV.Record next = iterator.next();
      Assertions.assertEquals(0L, next.number());
      Assertions.assertEquals(GigaCSV.LineBreak.LF, next.lineBreak());
      Assertions.assertEquals("😃😄😁", next.fields()[0]);
      Assertions.assertEquals("😃\n😄😁", next.fields()[1]);
      Assertions.assertEquals("😃😄😁", next.fields()[2]);
      next = iterator.next();
      Assertions.assertEquals(1L, next.number());
      Assertions.assertEquals(GigaCSV.LineBreak.NONE, next.lineBreak());
      Assertions.assertEquals("😃,,,😄,,😁", next.fields()[0]);
      Assertions.assertEquals("😃😄😁\"\"", next.fields()[1]);
      Assertions.assertEquals("😃😄😁", next.fields()[2]);
    } catch (Exception e) {
      assert false;
    }
  }

  @Test
  void test04AQCRLFNENDL() {
    final GigaCSV csv = new GigaCSV(new GigaCSV.Option().bufferSize(60));
    try (GigaCSV.Reader reader = csv.reader("src/test/resources/reader_06_04_AQ_CRLF_NENDL.csv")) {
      Iterator<GigaCSV.Record> iterator = reader.iterator();
      GigaCSV.Record next = iterator.next();
      Assertions.assertEquals(0L, next.number());
      Assertions.assertEquals(GigaCSV.LineBreak.CRLF, next.lineBreak());
      Assertions.assertEquals("😃😄😁", next.fields()[0]);
      Assertions.assertEquals("😃\r\n😄😁", next.fields()[1]);
      Assertions.assertEquals("😃😄😁", next.fields()[2]);
      next = iterator.next();
      Assertions.assertEquals(1L, next.number());
      Assertions.assertEquals(GigaCSV.LineBreak.NONE, next.lineBreak());
      Assertions.assertEquals("😃,,,😄,,😁", next.fields()[0]);
      Assertions.assertEquals("😃😄😁\"\"", next.fields()[1]);
      Assertions.assertEquals("😃😄😁", next.fields()[2]);
    } catch (Exception e) {
      assert false;
    }
  }

  @Test
  void test04AQCRNENDL() {
    final GigaCSV csv = new GigaCSV(new GigaCSV.Option().bufferSize(60));
    try (GigaCSV.Reader reader = csv.reader("src/test/resources/reader_06_04_AQ_CR_NENDL.csv")) {
      Iterator<GigaCSV.Record> iterator = reader.iterator();
      GigaCSV.Record next = iterator.next();
      Assertions.assertEquals(0L, next.number());
      Assertions.assertEquals(GigaCSV.LineBreak.CR, next.lineBreak());
      Assertions.assertEquals("😃😄😁", next.fields()[0]);
      Assertions.assertEquals("😃\r😄😁", next.fields()[1]);
      Assertions.assertEquals("😃😄😁", next.fields()[2]);
      next = iterator.next();
      Assertions.assertEquals(1L, next.number());
      Assertions.assertEquals(GigaCSV.LineBreak.NONE, next.lineBreak());
      Assertions.assertEquals("😃,,,😄,,😁", next.fields()[0]);
      Assertions.assertEquals("😃😄😁\"\"", next.fields()[1]);
      Assertions.assertEquals("😃😄😁", next.fields()[2]);
    } catch (Exception e) {
      assert false;
    }
  }

  @Test
  void test04AQLFWENDL() {
    final GigaCSV csv = new GigaCSV(new GigaCSV.Option().bufferSize(60));
    try (GigaCSV.Reader reader = csv.reader("src/test/resources/reader_06_04_AQ_LF_WENDL.csv")) {
      Iterator<GigaCSV.Record> iterator = reader.iterator();
      GigaCSV.Record next = iterator.next();
      Assertions.assertEquals(0L, next.number());
      Assertions.assertEquals(GigaCSV.LineBreak.LF, next.lineBreak());
      Assertions.assertEquals("😃😄😁", next.fields()[0]);
      Assertions.assertEquals("😃\n😄😁", next.fields()[1]);
      Assertions.assertEquals("😃😄😁", next.fields()[2]);
      next = iterator.next();
      Assertions.assertEquals(1L, next.number());
      Assertions.assertEquals(GigaCSV.LineBreak.LF, next.lineBreak());
      Assertions.assertEquals("😃,,,😄,,😁", next.fields()[0]);
      Assertions.assertEquals("😃😄😁\"\"", next.fields()[1]);
      Assertions.assertEquals("😃😄😁", next.fields()[2]);
    } catch (Exception e) {
      assert false;
    }
  }

  @Test
  void test04AQCRLFWENDL() {
    final GigaCSV csv = new GigaCSV(new GigaCSV.Option().bufferSize(60));
    try (GigaCSV.Reader reader = csv.reader("src/test/resources/reader_06_04_AQ_CRLF_WENDL.csv")) {
      Iterator<GigaCSV.Record> iterator = reader.iterator();
      GigaCSV.Record next = iterator.next();
      Assertions.assertEquals(0L, next.number());
      Assertions.assertEquals(GigaCSV.LineBreak.CRLF, next.lineBreak());
      Assertions.assertEquals("😃😄😁", next.fields()[0]);
      Assertions.assertEquals("😃\r\n😄😁", next.fields()[1]);
      Assertions.assertEquals("😃😄😁", next.fields()[2]);
      next = iterator.next();
      Assertions.assertEquals(1L, next.number());
      Assertions.assertEquals(GigaCSV.LineBreak.CRLF, next.lineBreak());
      Assertions.assertEquals("😃,,,😄,,😁", next.fields()[0]);
      Assertions.assertEquals("😃😄😁\"\"", next.fields()[1]);
      Assertions.assertEquals("😃😄😁", next.fields()[2]);
    } catch (Exception e) {
      assert false;
    }
  }

  @Test
  void test04AQCRWENDL() {
    final GigaCSV csv = new GigaCSV(new GigaCSV.Option().bufferSize(60));
    try (GigaCSV.Reader reader = csv.reader("src/test/resources/reader_06_04_AQ_CR_WENDL.csv")) {
      Iterator<GigaCSV.Record> iterator = reader.iterator();
      GigaCSV.Record next = iterator.next();
      Assertions.assertEquals(0L, next.number());
      Assertions.assertEquals(GigaCSV.LineBreak.CR, next.lineBreak());
      Assertions.assertEquals("😃😄😁", next.fields()[0]);
      Assertions.assertEquals("😃\r😄😁", next.fields()[1]);
      Assertions.assertEquals("😃😄😁", next.fields()[2]);
      next = iterator.next();
      Assertions.assertEquals(1L, next.number());
      Assertions.assertEquals(GigaCSV.LineBreak.CR, next.lineBreak());
      Assertions.assertEquals("😃,,,😄,,😁", next.fields()[0]);
      Assertions.assertEquals("😃😄😁\"\"", next.fields()[1]);
      Assertions.assertEquals("😃😄😁", next.fields()[2]);
    } catch (Exception e) {
      assert false;
    }
  }

  //
  @Test
  void test04NQLFNENDL() {
    final GigaCSV csv = new GigaCSV(new GigaCSV.Option().bufferSize(60));
    try (GigaCSV.Reader reader = csv.reader("src/test/resources/reader_06_04_NQ_LF_NENDL.csv")) {
      Iterator<GigaCSV.Record> iterator = reader.iterator();
      GigaCSV.Record next = iterator.next();
      Assertions.assertEquals(0L, next.number());
      Assertions.assertEquals(GigaCSV.LineBreak.LF, next.lineBreak());
      Assertions.assertEquals("😃😄😁", next.fields()[0]);
      Assertions.assertEquals("😃\n😄😁", next.fields()[1]);
      Assertions.assertEquals("😃😄😁", next.fields()[2]);
      next = iterator.next();
      Assertions.assertEquals(1L, next.number());
      Assertions.assertEquals(GigaCSV.LineBreak.NONE, next.lineBreak());
      Assertions.assertEquals("😃,,,😄,,😁", next.fields()[0]);
      Assertions.assertEquals("😃😄😁\"\"", next.fields()[1]);
      Assertions.assertEquals("😃😄😁", next.fields()[2]);
    } catch (Exception e) {
      assert false;
    }
  }

  @Test
  void test04NQCRLFNENDL() {
    final GigaCSV csv = new GigaCSV(new GigaCSV.Option().bufferSize(60));
    try (GigaCSV.Reader reader = csv.reader("src/test/resources/reader_06_04_NQ_CRLF_NENDL.csv")) {
      Iterator<GigaCSV.Record> iterator = reader.iterator();
      GigaCSV.Record next = iterator.next();
      Assertions.assertEquals(0L, next.number());
      Assertions.assertEquals(GigaCSV.LineBreak.CRLF, next.lineBreak());
      Assertions.assertEquals("😃😄😁", next.fields()[0]);
      Assertions.assertEquals("😃\r\n😄😁", next.fields()[1]);
      Assertions.assertEquals("😃😄😁", next.fields()[2]);
      next = iterator.next();
      Assertions.assertEquals(1L, next.number());
      Assertions.assertEquals(GigaCSV.LineBreak.NONE, next.lineBreak());
      Assertions.assertEquals("😃,,,😄,,😁", next.fields()[0]);
      Assertions.assertEquals("😃😄😁\"\"", next.fields()[1]);
      Assertions.assertEquals("😃😄😁", next.fields()[2]);
    } catch (Exception e) {
      assert false;
    }
  }

  @Test
  void test04NQCRNENDL() {
    final GigaCSV csv = new GigaCSV(new GigaCSV.Option().bufferSize(60));
    try (GigaCSV.Reader reader = csv.reader("src/test/resources/reader_06_04_NQ_CR_NENDL.csv")) {
      Iterator<GigaCSV.Record> iterator = reader.iterator();
      GigaCSV.Record next = iterator.next();
      Assertions.assertEquals(0L, next.number());
      Assertions.assertEquals(GigaCSV.LineBreak.CR, next.lineBreak());
      Assertions.assertEquals("😃😄😁", next.fields()[0]);
      Assertions.assertEquals("😃\r😄😁", next.fields()[1]);
      Assertions.assertEquals("😃😄😁", next.fields()[2]);
      next = iterator.next();
      Assertions.assertEquals(1L, next.number());
      Assertions.assertEquals(GigaCSV.LineBreak.NONE, next.lineBreak());
      Assertions.assertEquals("😃,,,😄,,😁", next.fields()[0]);
      Assertions.assertEquals("😃😄😁\"\"", next.fields()[1]);
      Assertions.assertEquals("😃😄😁", next.fields()[2]);
    } catch (Exception e) {
      assert false;
    }
  }

  @Test
  void test04NQLFWENDL() {
    final GigaCSV csv = new GigaCSV(new GigaCSV.Option().bufferSize(60));
    try (GigaCSV.Reader reader = csv.reader("src/test/resources/reader_06_04_NQ_LF_WENDL.csv")) {
      Iterator<GigaCSV.Record> iterator = reader.iterator();
      GigaCSV.Record next = iterator.next();
      Assertions.assertEquals(0L, next.number());
      Assertions.assertEquals(GigaCSV.LineBreak.LF, next.lineBreak());
      Assertions.assertEquals("😃😄😁", next.fields()[0]);
      Assertions.assertEquals("😃\n😄😁", next.fields()[1]);
      Assertions.assertEquals("😃😄😁", next.fields()[2]);
      next = iterator.next();
      Assertions.assertEquals(1L, next.number());
      Assertions.assertEquals(GigaCSV.LineBreak.LF, next.lineBreak());
      Assertions.assertEquals("😃,,,😄,,😁", next.fields()[0]);
      Assertions.assertEquals("😃😄😁\"\"", next.fields()[1]);
      Assertions.assertEquals("😃😄😁", next.fields()[2]);
    } catch (Exception e) {
      assert false;
    }
  }

  @Test
  void test04NQCRLFWENDL() {
    final GigaCSV csv = new GigaCSV(new GigaCSV.Option().bufferSize(60));
    try (GigaCSV.Reader reader = csv.reader("src/test/resources/reader_06_04_NQ_CRLF_WENDL.csv")) {
      Iterator<GigaCSV.Record> iterator = reader.iterator();
      GigaCSV.Record next = iterator.next();
      Assertions.assertEquals(0L, next.number());
      Assertions.assertEquals(GigaCSV.LineBreak.CRLF, next.lineBreak());
      Assertions.assertEquals("😃😄😁", next.fields()[0]);
      Assertions.assertEquals("😃\r\n😄😁", next.fields()[1]);
      Assertions.assertEquals("😃😄😁", next.fields()[2]);
      next = iterator.next();
      Assertions.assertEquals(1L, next.number());
      Assertions.assertEquals(GigaCSV.LineBreak.CRLF, next.lineBreak());
      Assertions.assertEquals("😃,,,😄,,😁", next.fields()[0]);
      Assertions.assertEquals("😃😄😁\"\"", next.fields()[1]);
      Assertions.assertEquals("😃😄😁", next.fields()[2]);
    } catch (Exception e) {
      assert false;
    }
  }

  @Test
  void test04NQCRWENDL() {
    final GigaCSV csv = new GigaCSV(new GigaCSV.Option().bufferSize(60));
    try (GigaCSV.Reader reader = csv.reader("src/test/resources/reader_06_04_NQ_CR_WENDL.csv")) {
      Iterator<GigaCSV.Record> iterator = reader.iterator();
      GigaCSV.Record next = iterator.next();
      Assertions.assertEquals(0L, next.number());
      Assertions.assertEquals(GigaCSV.LineBreak.CR, next.lineBreak());
      Assertions.assertEquals("😃😄😁", next.fields()[0]);
      Assertions.assertEquals("😃\r😄😁", next.fields()[1]);
      Assertions.assertEquals("😃😄😁", next.fields()[2]);
      next = iterator.next();
      Assertions.assertEquals(1L, next.number());
      Assertions.assertEquals(GigaCSV.LineBreak.CR, next.lineBreak());
      Assertions.assertEquals("😃,,,😄,,😁", next.fields()[0]);
      Assertions.assertEquals("😃😄😁\"\"", next.fields()[1]);
      Assertions.assertEquals("😃😄😁", next.fields()[2]);
    } catch (Exception e) {
      assert false;
    }
  }
}
