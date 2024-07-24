package gigacsv;

import java.util.Iterator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

@Disabled
class CSVReader0601Test {

  @Test
  void test01AQLFNENDL() {
    final GigaCSV csv = new GigaCSV(new GigaCSV.Option().bufferSize(30));
    try (GigaCSV.Reader reader = csv.reader("src/test/resources/reader_06_01_AQ_LF_NENDL.csv")) {
      Iterator<GigaCSV.Record> iterator = reader.iterator();
      GigaCSV.Record next = iterator.next();
      Assertions.assertEquals(0L, next.number());
      Assertions.assertEquals(GigaCSV.LineBreak.LF, next.lineBreak());
      Assertions.assertEquals("aaa", next.fields()[0]);
      Assertions.assertEquals("b\nbb", next.fields()[1]);
      Assertions.assertEquals("ccc", next.fields()[2]);
      next = iterator.next();
      Assertions.assertEquals(1L, next.number());
      Assertions.assertEquals(GigaCSV.LineBreak.NONE, next.lineBreak());
      Assertions.assertEquals("z,,,z,,z", next.fields()[0]);
      Assertions.assertEquals("yyy\"\"", next.fields()[1]);
      Assertions.assertEquals("xxx", next.fields()[2]);
    } catch (Exception e) {
      assert false;
    }
  }

  @Test
  void test01AQCRLFNENDL() {
    final GigaCSV csv = new GigaCSV(new GigaCSV.Option().bufferSize(30));
    try (GigaCSV.Reader reader = csv.reader("src/test/resources/reader_06_01_AQ_CRLF_NENDL.csv")) {
      Iterator<GigaCSV.Record> iterator = reader.iterator();
      GigaCSV.Record next = iterator.next();
      Assertions.assertEquals(0L, next.number());
      Assertions.assertEquals(GigaCSV.LineBreak.CRLF, next.lineBreak());
      Assertions.assertEquals("aaa", next.fields()[0]);
      Assertions.assertEquals("b\r\nbb", next.fields()[1]);
      Assertions.assertEquals("ccc", next.fields()[2]);
      next = iterator.next();
      Assertions.assertEquals(1L, next.number());
      Assertions.assertEquals(GigaCSV.LineBreak.NONE, next.lineBreak());
      Assertions.assertEquals("z,,,z,,z", next.fields()[0]);
      Assertions.assertEquals("yyy\"\"", next.fields()[1]);
      Assertions.assertEquals("xxx", next.fields()[2]);
    } catch (Exception e) {
      assert false;
    }
  }

  @Test
  void test01AQCRNENDL() {
    final GigaCSV csv = new GigaCSV(new GigaCSV.Option().bufferSize(30));
    try (GigaCSV.Reader reader = csv.reader("src/test/resources/reader_06_01_AQ_CR_NENDL.csv")) {
      Iterator<GigaCSV.Record> iterator = reader.iterator();
      GigaCSV.Record next = iterator.next();
      Assertions.assertEquals(0L, next.number());
      Assertions.assertEquals(GigaCSV.LineBreak.CR, next.lineBreak());
      Assertions.assertEquals("aaa", next.fields()[0]);
      Assertions.assertEquals("b\rbb", next.fields()[1]);
      Assertions.assertEquals("ccc", next.fields()[2]);
      next = iterator.next();
      Assertions.assertEquals(1L, next.number());
      Assertions.assertEquals(GigaCSV.LineBreak.NONE, next.lineBreak());
      Assertions.assertEquals("z,,,z,,z", next.fields()[0]);
      Assertions.assertEquals("yyy\"\"", next.fields()[1]);
      Assertions.assertEquals("xxx", next.fields()[2]);
    } catch (Exception e) {
      assert false;
    }
  }

  @Test
  void test01AQLFWENDL() {
    final GigaCSV csv = new GigaCSV(new GigaCSV.Option().bufferSize(30));
    try (GigaCSV.Reader reader = csv.reader("src/test/resources/reader_06_01_AQ_LF_WENDL.csv")) {
      Iterator<GigaCSV.Record> iterator = reader.iterator();
      GigaCSV.Record next = iterator.next();
      Assertions.assertEquals(0L, next.number());
      Assertions.assertEquals(GigaCSV.LineBreak.LF, next.lineBreak());
      Assertions.assertEquals("aaa", next.fields()[0]);
      Assertions.assertEquals("b\nbb", next.fields()[1]);
      Assertions.assertEquals("ccc", next.fields()[2]);
      next = iterator.next();
      Assertions.assertEquals(1L, next.number());
      Assertions.assertEquals(GigaCSV.LineBreak.LF, next.lineBreak());
      Assertions.assertEquals("z,,,z,,z", next.fields()[0]);
      Assertions.assertEquals("yyy\"\"", next.fields()[1]);
      Assertions.assertEquals("xxx", next.fields()[2]);
    } catch (Exception e) {
      assert false;
    }
  }

  @Test
  void test01AQCRLFWENDL() {
    final GigaCSV csv = new GigaCSV(new GigaCSV.Option().bufferSize(30));
    try (GigaCSV.Reader reader = csv.reader("src/test/resources/reader_06_01_AQ_CRLF_WENDL.csv")) {
      Iterator<GigaCSV.Record> iterator = reader.iterator();
      GigaCSV.Record next = iterator.next();
      Assertions.assertEquals(0L, next.number());
      Assertions.assertEquals(GigaCSV.LineBreak.CRLF, next.lineBreak());
      Assertions.assertEquals("aaa", next.fields()[0]);
      Assertions.assertEquals("b\r\nbb", next.fields()[1]);
      Assertions.assertEquals("ccc", next.fields()[2]);
      next = iterator.next();
      Assertions.assertEquals(1L, next.number());
      Assertions.assertEquals(GigaCSV.LineBreak.CRLF, next.lineBreak());
      Assertions.assertEquals("z,,,z,,z", next.fields()[0]);
      Assertions.assertEquals("yyy\"\"", next.fields()[1]);
      Assertions.assertEquals("xxx", next.fields()[2]);
    } catch (Exception e) {
      assert false;
    }
  }

  @Test
  void test01AQCRWENDL() {
    final GigaCSV csv = new GigaCSV(new GigaCSV.Option().bufferSize(30));
    try (GigaCSV.Reader reader = csv.reader("src/test/resources/reader_06_01_AQ_CR_WENDL.csv")) {
      Iterator<GigaCSV.Record> iterator = reader.iterator();
      GigaCSV.Record next = iterator.next();
      Assertions.assertEquals(0L, next.number());
      Assertions.assertEquals(GigaCSV.LineBreak.CR, next.lineBreak());
      Assertions.assertEquals("aaa", next.fields()[0]);
      Assertions.assertEquals("b\rbb", next.fields()[1]);
      Assertions.assertEquals("ccc", next.fields()[2]);
      next = iterator.next();
      Assertions.assertEquals(1L, next.number());
      Assertions.assertEquals(GigaCSV.LineBreak.CR, next.lineBreak());
      Assertions.assertEquals("z,,,z,,z", next.fields()[0]);
      Assertions.assertEquals("yyy\"\"", next.fields()[1]);
      Assertions.assertEquals("xxx", next.fields()[2]);
    } catch (Exception e) {
      assert false;
    }
  }

  //
  @Test
  void test01NQLFNENDL() {
    final GigaCSV csv = new GigaCSV(new GigaCSV.Option().bufferSize(30));
    try (GigaCSV.Reader reader = csv.reader("src/test/resources/reader_06_01_NQ_LF_NENDL.csv")) {
      Iterator<GigaCSV.Record> iterator = reader.iterator();
      GigaCSV.Record next = iterator.next();
      Assertions.assertEquals(0L, next.number());
      Assertions.assertEquals(GigaCSV.LineBreak.LF, next.lineBreak());
      Assertions.assertEquals("aaa", next.fields()[0]);
      Assertions.assertEquals("b\nbb", next.fields()[1]);
      Assertions.assertEquals("ccc", next.fields()[2]);
      next = iterator.next();
      Assertions.assertEquals(1L, next.number());
      Assertions.assertEquals(GigaCSV.LineBreak.NONE, next.lineBreak());
      Assertions.assertEquals("z,,,z,,z", next.fields()[0]);
      Assertions.assertEquals("yyy\"\"", next.fields()[1]);
      Assertions.assertEquals("xxx", next.fields()[2]);
    } catch (Exception e) {
      assert false;
    }
  }

  @Test
  void test01NQCRLFNENDL() {
    final GigaCSV csv = new GigaCSV(new GigaCSV.Option().bufferSize(30));
    try (GigaCSV.Reader reader = csv.reader("src/test/resources/reader_06_01_NQ_CRLF_NENDL.csv")) {
      Iterator<GigaCSV.Record> iterator = reader.iterator();
      GigaCSV.Record next = iterator.next();
      Assertions.assertEquals(0L, next.number());
      Assertions.assertEquals(GigaCSV.LineBreak.CRLF, next.lineBreak());
      Assertions.assertEquals("aaa", next.fields()[0]);
      Assertions.assertEquals("b\r\nbb", next.fields()[1]);
      Assertions.assertEquals("ccc", next.fields()[2]);
      next = iterator.next();
      Assertions.assertEquals(1L, next.number());
      Assertions.assertEquals(GigaCSV.LineBreak.NONE, next.lineBreak());
      Assertions.assertEquals("z,,,z,,z", next.fields()[0]);
      Assertions.assertEquals("yyy\"\"", next.fields()[1]);
      Assertions.assertEquals("xxx", next.fields()[2]);
    } catch (Exception e) {
      assert false;
    }
  }

  @Test
  void test01NQCRNENDL() {
    final GigaCSV csv = new GigaCSV(new GigaCSV.Option().bufferSize(30));
    try (GigaCSV.Reader reader = csv.reader("src/test/resources/reader_06_01_NQ_CR_NENDL.csv")) {
      Iterator<GigaCSV.Record> iterator = reader.iterator();
      GigaCSV.Record next = iterator.next();
      Assertions.assertEquals(0L, next.number());
      Assertions.assertEquals(GigaCSV.LineBreak.CR, next.lineBreak());
      Assertions.assertEquals("aaa", next.fields()[0]);
      Assertions.assertEquals("b\rbb", next.fields()[1]);
      Assertions.assertEquals("ccc", next.fields()[2]);
      next = iterator.next();
      Assertions.assertEquals(1L, next.number());
      Assertions.assertEquals(GigaCSV.LineBreak.NONE, next.lineBreak());
      Assertions.assertEquals("z,,,z,,z", next.fields()[0]);
      Assertions.assertEquals("yyy\"\"", next.fields()[1]);
      Assertions.assertEquals("xxx", next.fields()[2]);
    } catch (Exception e) {
      assert false;
    }
  }

  @Test
  void test01NQLFWENDL() {
    final GigaCSV csv = new GigaCSV(new GigaCSV.Option().bufferSize(30));
    try (GigaCSV.Reader reader = csv.reader("src/test/resources/reader_06_01_NQ_LF_WENDL.csv")) {
      Iterator<GigaCSV.Record> iterator = reader.iterator();
      GigaCSV.Record next = iterator.next();
      Assertions.assertEquals(0L, next.number());
      Assertions.assertEquals(GigaCSV.LineBreak.LF, next.lineBreak());
      Assertions.assertEquals("aaa", next.fields()[0]);
      Assertions.assertEquals("b\nbb", next.fields()[1]);
      Assertions.assertEquals("ccc", next.fields()[2]);
      next = iterator.next();
      Assertions.assertEquals(1L, next.number());
      Assertions.assertEquals(GigaCSV.LineBreak.LF, next.lineBreak());
      Assertions.assertEquals("z,,,z,,z", next.fields()[0]);
      Assertions.assertEquals("yyy\"\"", next.fields()[1]);
      Assertions.assertEquals("xxx", next.fields()[2]);
    } catch (Exception e) {
      assert false;
    }
  }

  @Test
  void test01NQCRLFWENDL() {
    final GigaCSV csv = new GigaCSV(new GigaCSV.Option().bufferSize(30));
    try (GigaCSV.Reader reader = csv.reader("src/test/resources/reader_06_01_NQ_CRLF_WENDL.csv")) {
      Iterator<GigaCSV.Record> iterator = reader.iterator();
      GigaCSV.Record next = iterator.next();
      Assertions.assertEquals(0L, next.number());
      Assertions.assertEquals(GigaCSV.LineBreak.CRLF, next.lineBreak());
      Assertions.assertEquals("aaa", next.fields()[0]);
      Assertions.assertEquals("b\r\nbb", next.fields()[1]);
      Assertions.assertEquals("ccc", next.fields()[2]);
      next = iterator.next();
      Assertions.assertEquals(1L, next.number());
      Assertions.assertEquals(GigaCSV.LineBreak.CRLF, next.lineBreak());
      Assertions.assertEquals("z,,,z,,z", next.fields()[0]);
      Assertions.assertEquals("yyy\"\"", next.fields()[1]);
      Assertions.assertEquals("xxx", next.fields()[2]);
    } catch (Exception e) {
      assert false;
    }
  }

  @Test
  void test01NQCRWENDL() {
    final GigaCSV csv = new GigaCSV(new GigaCSV.Option().bufferSize(30));
    try (GigaCSV.Reader reader = csv.reader("src/test/resources/reader_06_01_NQ_CR_WENDL.csv")) {
      Iterator<GigaCSV.Record> iterator = reader.iterator();
      GigaCSV.Record next = iterator.next();
      Assertions.assertEquals(0L, next.number());
      Assertions.assertEquals(GigaCSV.LineBreak.CR, next.lineBreak());
      Assertions.assertEquals("aaa", next.fields()[0]);
      Assertions.assertEquals("b\rbb", next.fields()[1]);
      Assertions.assertEquals("ccc", next.fields()[2]);
      next = iterator.next();
      Assertions.assertEquals(1L, next.number());
      Assertions.assertEquals(GigaCSV.LineBreak.CR, next.lineBreak());
      Assertions.assertEquals("z,,,z,,z", next.fields()[0]);
      Assertions.assertEquals("yyy\"\"", next.fields()[1]);
      Assertions.assertEquals("xxx", next.fields()[2]);
    } catch (Exception e) {
      assert false;
    }
  }
}
