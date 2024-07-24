package gigacsv;

import java.util.Iterator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

@Disabled
class CSVReader0602Test {

  @Test
  void test02AQLFNENDL() {
    final GigaCSV csv = new GigaCSV(new GigaCSV.Option().bufferSize(40));
    try (GigaCSV.Reader reader = csv.reader("src/test/resources/reader_06_02_AQ_LF_NENDL.csv")) {
      Iterator<GigaCSV.Record> iterator = reader.iterator();
      GigaCSV.Record next = iterator.next();
      Assertions.assertEquals(0L, next.number());
      Assertions.assertEquals(GigaCSV.LineBreak.LF, next.lineBreak());
      Assertions.assertEquals("øúø", next.fields()[0]);
      Assertions.assertEquals("ø\núø", next.fields()[1]);
      Assertions.assertEquals("øúø", next.fields()[2]);
      next = iterator.next();
      Assertions.assertEquals(1L, next.number());
      Assertions.assertEquals(GigaCSV.LineBreak.NONE, next.lineBreak());
      Assertions.assertEquals("ø,,,ø,,ú", next.fields()[0]);
      Assertions.assertEquals("øúø\"\"", next.fields()[1]);
      Assertions.assertEquals("øúø", next.fields()[2]);
      Assertions.assertFalse(iterator.hasNext());
    } catch (Exception e) {
      assert false;
    }
  }

  @Test
  void test02AQCRLFNENDL() {
    final GigaCSV csv = new GigaCSV(new GigaCSV.Option().bufferSize(40));
    try (GigaCSV.Reader reader = csv.reader("src/test/resources/reader_06_02_AQ_CRLF_NENDL.csv")) {
      Iterator<GigaCSV.Record> iterator = reader.iterator();
      GigaCSV.Record next = iterator.next();
      Assertions.assertEquals(0L, next.number());
      Assertions.assertEquals(GigaCSV.LineBreak.CRLF, next.lineBreak());
      Assertions.assertEquals("øúø", next.fields()[0]);
      Assertions.assertEquals("ø\r\núø", next.fields()[1]);
      Assertions.assertEquals("øúø", next.fields()[2]);
      next = iterator.next();
      Assertions.assertEquals(1L, next.number());
      Assertions.assertEquals(GigaCSV.LineBreak.NONE, next.lineBreak());
      Assertions.assertEquals("ø,,,ø,,ú", next.fields()[0]);
      Assertions.assertEquals("øúø\"\"", next.fields()[1]);
      Assertions.assertEquals("øúø", next.fields()[2]);
      Assertions.assertFalse(iterator.hasNext());
    } catch (Exception e) {
      assert false;
    }
  }

  @Test
  void test02AQCRNENDL() {
    final GigaCSV csv = new GigaCSV(new GigaCSV.Option().bufferSize(40));
    try (GigaCSV.Reader reader = csv.reader("src/test/resources/reader_06_02_AQ_CR_NENDL.csv")) {
      Iterator<GigaCSV.Record> iterator = reader.iterator();
      GigaCSV.Record next = iterator.next();
      Assertions.assertEquals(0L, next.number());
      Assertions.assertEquals(GigaCSV.LineBreak.CR, next.lineBreak());
      Assertions.assertEquals("øúø", next.fields()[0]);
      Assertions.assertEquals("ø\rúø", next.fields()[1]);
      Assertions.assertEquals("øúø", next.fields()[2]);
      next = iterator.next();
      Assertions.assertEquals(1L, next.number());
      Assertions.assertEquals(GigaCSV.LineBreak.NONE, next.lineBreak());
      Assertions.assertEquals("ø,,,ø,,ú", next.fields()[0]);
      Assertions.assertEquals("øúø\"\"", next.fields()[1]);
      Assertions.assertEquals("øúø", next.fields()[2]);
      Assertions.assertFalse(iterator.hasNext());
    } catch (Exception e) {
      assert false;
    }
  }

  @Test
  void test02AQLFWENDL() {
    final GigaCSV csv = new GigaCSV(new GigaCSV.Option().bufferSize(40));
    try (GigaCSV.Reader reader = csv.reader("src/test/resources/reader_06_02_AQ_LF_WENDL.csv")) {
      Iterator<GigaCSV.Record> iterator = reader.iterator();
      GigaCSV.Record next = iterator.next();
      Assertions.assertEquals(0L, next.number());
      Assertions.assertEquals(GigaCSV.LineBreak.LF, next.lineBreak());
      Assertions.assertEquals("øúø", next.fields()[0]);
      Assertions.assertEquals("ø\núø", next.fields()[1]);
      Assertions.assertEquals("øúø", next.fields()[2]);
      next = iterator.next();
      Assertions.assertEquals(1L, next.number());
      Assertions.assertEquals(GigaCSV.LineBreak.LF, next.lineBreak());
      Assertions.assertEquals("ø,,,ø,,ú", next.fields()[0]);
      Assertions.assertEquals("øúø\"\"", next.fields()[1]);
      Assertions.assertEquals("øúø", next.fields()[2]);
      Assertions.assertFalse(iterator.hasNext());
    } catch (Exception e) {
      assert false;
    }
  }

  @Test
  void test02AQCRLFWENDL() {
    final GigaCSV csv = new GigaCSV(new GigaCSV.Option().bufferSize(40));
    try (GigaCSV.Reader reader = csv.reader("src/test/resources/reader_06_02_AQ_CRLF_WENDL.csv")) {
      Iterator<GigaCSV.Record> iterator = reader.iterator();
      GigaCSV.Record next = iterator.next();
      Assertions.assertEquals(0L, next.number());
      Assertions.assertEquals(GigaCSV.LineBreak.CRLF, next.lineBreak());
      Assertions.assertEquals("øúø", next.fields()[0]);
      Assertions.assertEquals("ø\r\núø", next.fields()[1]);
      Assertions.assertEquals("øúø", next.fields()[2]);
      next = iterator.next();
      Assertions.assertEquals(1L, next.number());
      Assertions.assertEquals(GigaCSV.LineBreak.CRLF, next.lineBreak());
      Assertions.assertEquals("ø,,,ø,,ú", next.fields()[0]);
      Assertions.assertEquals("øúø\"\"", next.fields()[1]);
      Assertions.assertEquals("øúø", next.fields()[2]);
      Assertions.assertFalse(iterator.hasNext());
    } catch (Exception e) {
      assert false;
    }
  }

  @Test
  void test02AQCRWENDL() {
    final GigaCSV csv = new GigaCSV(new GigaCSV.Option().bufferSize(40));
    try (GigaCSV.Reader reader = csv.reader("src/test/resources/reader_06_02_AQ_CR_WENDL.csv")) {
      Iterator<GigaCSV.Record> iterator = reader.iterator();
      GigaCSV.Record next = iterator.next();
      Assertions.assertEquals(0L, next.number());
      Assertions.assertEquals(GigaCSV.LineBreak.CR, next.lineBreak());
      Assertions.assertEquals("øúø", next.fields()[0]);
      Assertions.assertEquals("ø\rúø", next.fields()[1]);
      Assertions.assertEquals("øúø", next.fields()[2]);
      next = iterator.next();
      Assertions.assertEquals(1L, next.number());
      Assertions.assertEquals(GigaCSV.LineBreak.CR, next.lineBreak());
      Assertions.assertEquals("ø,,,ø,,ú", next.fields()[0]);
      Assertions.assertEquals("øúø\"\"", next.fields()[1]);
      Assertions.assertEquals("øúø", next.fields()[2]);
      Assertions.assertFalse(iterator.hasNext());
    } catch (Exception e) {
      assert false;
    }
  }

  //
  @Test
  void test02NQLFNENDL() {
    final GigaCSV csv = new GigaCSV(new GigaCSV.Option().bufferSize(40));
    try (GigaCSV.Reader reader = csv.reader("src/test/resources/reader_06_02_NQ_LF_NENDL.csv")) {
      Iterator<GigaCSV.Record> iterator = reader.iterator();
      GigaCSV.Record next = iterator.next();
      Assertions.assertEquals(0L, next.number());
      Assertions.assertEquals(GigaCSV.LineBreak.LF, next.lineBreak());
      Assertions.assertEquals("øúø", next.fields()[0]);
      Assertions.assertEquals("ø\núø", next.fields()[1]);
      Assertions.assertEquals("øúø", next.fields()[2]);
      next = iterator.next();
      Assertions.assertEquals(1L, next.number());
      Assertions.assertEquals(GigaCSV.LineBreak.NONE, next.lineBreak());
      Assertions.assertEquals("ø,,,ø,,ú", next.fields()[0]);
      Assertions.assertEquals("øúø\"\"", next.fields()[1]);
      Assertions.assertEquals("øúø", next.fields()[2]);
      Assertions.assertFalse(iterator.hasNext());
    } catch (Exception e) {
      assert false;
    }
  }

  @Test
  void test02NQCRLFNENDL() {
    final GigaCSV csv = new GigaCSV(new GigaCSV.Option().bufferSize(40));
    try (GigaCSV.Reader reader = csv.reader("src/test/resources/reader_06_02_NQ_CRLF_NENDL.csv")) {
      Iterator<GigaCSV.Record> iterator = reader.iterator();
      GigaCSV.Record next = iterator.next();
      Assertions.assertEquals(0L, next.number());
      Assertions.assertEquals(GigaCSV.LineBreak.CRLF, next.lineBreak());
      Assertions.assertEquals("øúø", next.fields()[0]);
      Assertions.assertEquals("ø\r\núø", next.fields()[1]);
      Assertions.assertEquals("øúø", next.fields()[2]);
      next = iterator.next();
      Assertions.assertEquals(1L, next.number());
      Assertions.assertEquals(GigaCSV.LineBreak.NONE, next.lineBreak());
      Assertions.assertEquals("ø,,,ø,,ú", next.fields()[0]);
      Assertions.assertEquals("øúø\"\"", next.fields()[1]);
      Assertions.assertEquals("øúø", next.fields()[2]);
      Assertions.assertFalse(iterator.hasNext());
    } catch (Exception e) {
      assert false;
    }
  }

  @Test
  void test02NQCRNENDL() {
    final GigaCSV csv = new GigaCSV(new GigaCSV.Option().bufferSize(40));
    try (GigaCSV.Reader reader = csv.reader("src/test/resources/reader_06_02_NQ_CR_NENDL.csv")) {
      Iterator<GigaCSV.Record> iterator = reader.iterator();
      GigaCSV.Record next = iterator.next();
      Assertions.assertEquals(0L, next.number());
      Assertions.assertEquals(GigaCSV.LineBreak.CR, next.lineBreak());
      Assertions.assertEquals("øúø", next.fields()[0]);
      Assertions.assertEquals("ø\rúø", next.fields()[1]);
      Assertions.assertEquals("øúø", next.fields()[2]);
      next = iterator.next();
      Assertions.assertEquals(1L, next.number());
      Assertions.assertEquals(GigaCSV.LineBreak.NONE, next.lineBreak());
      Assertions.assertEquals("ø,,,ø,,ú", next.fields()[0]);
      Assertions.assertEquals("øúø\"\"", next.fields()[1]);
      Assertions.assertEquals("øúø", next.fields()[2]);
      Assertions.assertFalse(iterator.hasNext());
    } catch (Exception e) {
      assert false;
    }
  }

  @Test
  void test02NQLFWENDL() {
    final GigaCSV csv = new GigaCSV(new GigaCSV.Option().bufferSize(40));
    try (GigaCSV.Reader reader = csv.reader("src/test/resources/reader_06_02_NQ_LF_WENDL.csv")) {
      Iterator<GigaCSV.Record> iterator = reader.iterator();
      GigaCSV.Record next = iterator.next();
      Assertions.assertEquals(0L, next.number());
      Assertions.assertEquals(GigaCSV.LineBreak.LF, next.lineBreak());
      Assertions.assertEquals("øúø", next.fields()[0]);
      Assertions.assertEquals("ø\núø", next.fields()[1]);
      Assertions.assertEquals("øúø", next.fields()[2]);
      next = iterator.next();
      Assertions.assertEquals(1L, next.number());
      Assertions.assertEquals(GigaCSV.LineBreak.LF, next.lineBreak());
      Assertions.assertEquals("ø,,,ø,,ú", next.fields()[0]);
      Assertions.assertEquals("øúø\"\"", next.fields()[1]);
      Assertions.assertEquals("øúø", next.fields()[2]);
      Assertions.assertFalse(iterator.hasNext());
    } catch (Exception e) {
      assert false;
    }
  }

  @Test
  void test02NQCRLFWENDL() {
    final GigaCSV csv = new GigaCSV(new GigaCSV.Option().bufferSize(40));
    try (GigaCSV.Reader reader = csv.reader("src/test/resources/reader_06_02_NQ_CRLF_WENDL.csv")) {
      Iterator<GigaCSV.Record> iterator = reader.iterator();
      GigaCSV.Record next = iterator.next();
      Assertions.assertEquals(0L, next.number());
      Assertions.assertEquals(GigaCSV.LineBreak.CRLF, next.lineBreak());
      Assertions.assertEquals("øúø", next.fields()[0]);
      Assertions.assertEquals("ø\r\núø", next.fields()[1]);
      Assertions.assertEquals("øúø", next.fields()[2]);
      next = iterator.next();
      Assertions.assertEquals(1L, next.number());
      Assertions.assertEquals(GigaCSV.LineBreak.CRLF, next.lineBreak());
      Assertions.assertEquals("ø,,,ø,,ú", next.fields()[0]);
      Assertions.assertEquals("øúø\"\"", next.fields()[1]);
      Assertions.assertEquals("øúø", next.fields()[2]);
      Assertions.assertFalse(iterator.hasNext());
    } catch (Exception e) {
      assert false;
    }
  }

  @Test
  void test02NQCRWENDL() {
    final GigaCSV csv = new GigaCSV(new GigaCSV.Option().bufferSize(40));
    try (GigaCSV.Reader reader = csv.reader("src/test/resources/reader_06_02_NQ_CR_WENDL.csv")) {
      Iterator<GigaCSV.Record> iterator = reader.iterator();
      GigaCSV.Record next = iterator.next();
      Assertions.assertEquals(0L, next.number());
      Assertions.assertEquals(GigaCSV.LineBreak.CR, next.lineBreak());
      Assertions.assertEquals("øúø", next.fields()[0]);
      Assertions.assertEquals("ø\rúø", next.fields()[1]);
      Assertions.assertEquals("øúø", next.fields()[2]);
      next = iterator.next();
      Assertions.assertEquals(1L, next.number());
      Assertions.assertEquals(GigaCSV.LineBreak.CR, next.lineBreak());
      Assertions.assertEquals("ø,,,ø,,ú", next.fields()[0]);
      Assertions.assertEquals("øúø\"\"", next.fields()[1]);
      Assertions.assertEquals("øúø", next.fields()[2]);
      Assertions.assertFalse(iterator.hasNext());
    } catch (Exception e) {
      assert false;
    }
  }
}
