package gigacsv;

import java.util.Iterator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

@Disabled
class CSVReader0603Test {

  @Test
  void test03AQLFNENDL() {
    final GigaCSV csv = new GigaCSV(new GigaCSV.Option().bufferSize(50));
    try (GigaCSV.Reader reader = csv.reader("src/test/resources/reader_06_03_AQ_LF_NENDL.csv")) {
      Iterator<GigaCSV.Record> iterator = reader.iterator();
      GigaCSV.Record next = iterator.next();
      Assertions.assertEquals(0L, next.number());
      Assertions.assertEquals(GigaCSV.LineBreak.LF, next.lineBreak());
      Assertions.assertEquals("⅀Ωℤ", next.fields()[0]);
      Assertions.assertEquals("⅀\nΩℤ", next.fields()[1]);
      Assertions.assertEquals("⅀Ωℤ", next.fields()[2]);
      next = iterator.next();
      Assertions.assertEquals(1L, next.number());
      Assertions.assertEquals(GigaCSV.LineBreak.NONE, next.lineBreak());
      Assertions.assertEquals("⅀,,,Ω,,ℤ", next.fields()[0]);
      Assertions.assertEquals("⅀Ωℤ\"\"", next.fields()[1]);
      Assertions.assertEquals("⅀Ωℤ", next.fields()[2]);
    } catch (Exception e) {
      assert false;
    }
  }

  @Test
  void test03AQCRLFNENDL() {
    final GigaCSV csv = new GigaCSV(new GigaCSV.Option().bufferSize(50));
    try (GigaCSV.Reader reader = csv.reader("src/test/resources/reader_06_03_AQ_CRLF_NENDL.csv")) {
      Iterator<GigaCSV.Record> iterator = reader.iterator();
      GigaCSV.Record next = iterator.next();
      Assertions.assertEquals(0L, next.number());
      Assertions.assertEquals(GigaCSV.LineBreak.CRLF, next.lineBreak());
      Assertions.assertEquals("⅀Ωℤ", next.fields()[0]);
      Assertions.assertEquals("⅀\r\nΩℤ", next.fields()[1]);
      Assertions.assertEquals("⅀Ωℤ", next.fields()[2]);
      next = iterator.next();
      Assertions.assertEquals(1L, next.number());
      Assertions.assertEquals(GigaCSV.LineBreak.NONE, next.lineBreak());
      Assertions.assertEquals("⅀,,,Ω,,ℤ", next.fields()[0]);
      Assertions.assertEquals("⅀Ωℤ\"\"", next.fields()[1]);
      Assertions.assertEquals("⅀Ωℤ", next.fields()[2]);
    } catch (Exception e) {
      assert false;
    }
  }

  @Test
  void test03AQCRNENDL() {
    final GigaCSV csv = new GigaCSV(new GigaCSV.Option().bufferSize(50));
    try (GigaCSV.Reader reader = csv.reader("src/test/resources/reader_06_03_AQ_CR_NENDL.csv")) {
      Iterator<GigaCSV.Record> iterator = reader.iterator();
      GigaCSV.Record next = iterator.next();
      Assertions.assertEquals(0L, next.number());
      Assertions.assertEquals(GigaCSV.LineBreak.CR, next.lineBreak());
      Assertions.assertEquals("⅀Ωℤ", next.fields()[0]);
      Assertions.assertEquals("⅀\rΩℤ", next.fields()[1]);
      Assertions.assertEquals("⅀Ωℤ", next.fields()[2]);
      next = iterator.next();
      Assertions.assertEquals(1L, next.number());
      Assertions.assertEquals(GigaCSV.LineBreak.NONE, next.lineBreak());
      Assertions.assertEquals("⅀,,,Ω,,ℤ", next.fields()[0]);
      Assertions.assertEquals("⅀Ωℤ\"\"", next.fields()[1]);
      Assertions.assertEquals("⅀Ωℤ", next.fields()[2]);
    } catch (Exception e) {
      assert false;
    }
  }

  @Test
  void test03AQLFWENDL() {
    final GigaCSV csv = new GigaCSV(new GigaCSV.Option().bufferSize(50));
    try (GigaCSV.Reader reader = csv.reader("src/test/resources/reader_06_03_AQ_LF_WENDL.csv")) {
      Iterator<GigaCSV.Record> iterator = reader.iterator();
      GigaCSV.Record next = iterator.next();
      Assertions.assertEquals(0L, next.number());
      Assertions.assertEquals(GigaCSV.LineBreak.LF, next.lineBreak());
      Assertions.assertEquals("⅀Ωℤ", next.fields()[0]);
      Assertions.assertEquals("⅀\nΩℤ", next.fields()[1]);
      Assertions.assertEquals("⅀Ωℤ", next.fields()[2]);
      next = iterator.next();
      Assertions.assertEquals(1L, next.number());
      Assertions.assertEquals(GigaCSV.LineBreak.LF, next.lineBreak());
      Assertions.assertEquals("⅀,,,Ω,,ℤ", next.fields()[0]);
      Assertions.assertEquals("⅀Ωℤ\"\"", next.fields()[1]);
      Assertions.assertEquals("⅀Ωℤ", next.fields()[2]);
    } catch (Exception e) {
      assert false;
    }
  }

  @Test
  void test03AQCRLFWENDL() {
    final GigaCSV csv = new GigaCSV(new GigaCSV.Option().bufferSize(50));
    try (GigaCSV.Reader reader = csv.reader("src/test/resources/reader_06_03_AQ_CRLF_WENDL.csv")) {
      Iterator<GigaCSV.Record> iterator = reader.iterator();
      GigaCSV.Record next = iterator.next();
      Assertions.assertEquals(0L, next.number());
      Assertions.assertEquals(GigaCSV.LineBreak.CRLF, next.lineBreak());
      Assertions.assertEquals("⅀Ωℤ", next.fields()[0]);
      Assertions.assertEquals("⅀\r\nΩℤ", next.fields()[1]);
      Assertions.assertEquals("⅀Ωℤ", next.fields()[2]);
      next = iterator.next();
      Assertions.assertEquals(1L, next.number());
      Assertions.assertEquals(GigaCSV.LineBreak.CRLF, next.lineBreak());
      Assertions.assertEquals("⅀,,,Ω,,ℤ", next.fields()[0]);
      Assertions.assertEquals("⅀Ωℤ\"\"", next.fields()[1]);
      Assertions.assertEquals("⅀Ωℤ", next.fields()[2]);
    } catch (Exception e) {
      assert false;
    }
  }

  @Test
  void test03AQCRWENDL() {
    final GigaCSV csv = new GigaCSV(new GigaCSV.Option().bufferSize(50));
    try (GigaCSV.Reader reader = csv.reader("src/test/resources/reader_06_03_AQ_CR_WENDL.csv")) {
      Iterator<GigaCSV.Record> iterator = reader.iterator();
      GigaCSV.Record next = iterator.next();
      Assertions.assertEquals(0L, next.number());
      Assertions.assertEquals(GigaCSV.LineBreak.CR, next.lineBreak());
      Assertions.assertEquals("⅀Ωℤ", next.fields()[0]);
      Assertions.assertEquals("⅀\rΩℤ", next.fields()[1]);
      Assertions.assertEquals("⅀Ωℤ", next.fields()[2]);
      next = iterator.next();
      Assertions.assertEquals(1L, next.number());
      Assertions.assertEquals(GigaCSV.LineBreak.CR, next.lineBreak());
      Assertions.assertEquals("⅀,,,Ω,,ℤ", next.fields()[0]);
      Assertions.assertEquals("⅀Ωℤ\"\"", next.fields()[1]);
      Assertions.assertEquals("⅀Ωℤ", next.fields()[2]);
    } catch (Exception e) {
      assert false;
    }
  }

  //
  @Test
  void test03NQLFNENDL() {
    final GigaCSV csv = new GigaCSV(new GigaCSV.Option().bufferSize(50));
    try (GigaCSV.Reader reader = csv.reader("src/test/resources/reader_06_03_NQ_LF_NENDL.csv")) {
      Iterator<GigaCSV.Record> iterator = reader.iterator();
      GigaCSV.Record next = iterator.next();
      Assertions.assertEquals(0L, next.number());
      Assertions.assertEquals(GigaCSV.LineBreak.LF, next.lineBreak());
      Assertions.assertEquals("⅀Ωℤ", next.fields()[0]);
      Assertions.assertEquals("⅀\nΩℤ", next.fields()[1]);
      Assertions.assertEquals("⅀Ωℤ", next.fields()[2]);
      next = iterator.next();
      Assertions.assertEquals(1L, next.number());
      Assertions.assertEquals(GigaCSV.LineBreak.NONE, next.lineBreak());
      Assertions.assertEquals("⅀,,,Ω,,ℤ", next.fields()[0]);
      Assertions.assertEquals("⅀Ωℤ\"\"", next.fields()[1]);
      Assertions.assertEquals("⅀Ωℤ", next.fields()[2]);
    } catch (Exception e) {
      assert false;
    }
  }

  @Test
  void test03NQCRLFNENDL() {
    final GigaCSV csv = new GigaCSV(new GigaCSV.Option().bufferSize(50));
    try (GigaCSV.Reader reader = csv.reader("src/test/resources/reader_06_03_NQ_CRLF_NENDL.csv")) {
      Iterator<GigaCSV.Record> iterator = reader.iterator();
      GigaCSV.Record next = iterator.next();
      Assertions.assertEquals(0L, next.number());
      Assertions.assertEquals(GigaCSV.LineBreak.CRLF, next.lineBreak());
      Assertions.assertEquals("⅀Ωℤ", next.fields()[0]);
      Assertions.assertEquals("⅀\r\nΩℤ", next.fields()[1]);
      Assertions.assertEquals("⅀Ωℤ", next.fields()[2]);
      next = iterator.next();
      Assertions.assertEquals(1L, next.number());
      Assertions.assertEquals(GigaCSV.LineBreak.NONE, next.lineBreak());
      Assertions.assertEquals("⅀,,,Ω,,ℤ", next.fields()[0]);
      Assertions.assertEquals("⅀Ωℤ\"\"", next.fields()[1]);
      Assertions.assertEquals("⅀Ωℤ", next.fields()[2]);
    } catch (Exception e) {
      assert false;
    }
  }

  @Test
  void test03NQCRNENDL() {
    final GigaCSV csv = new GigaCSV(new GigaCSV.Option().bufferSize(50));
    try (GigaCSV.Reader reader = csv.reader("src/test/resources/reader_06_03_NQ_CR_NENDL.csv")) {
      Iterator<GigaCSV.Record> iterator = reader.iterator();
      GigaCSV.Record next = iterator.next();
      Assertions.assertEquals(0L, next.number());
      Assertions.assertEquals(GigaCSV.LineBreak.CR, next.lineBreak());
      Assertions.assertEquals("⅀Ωℤ", next.fields()[0]);
      Assertions.assertEquals("⅀\rΩℤ", next.fields()[1]);
      Assertions.assertEquals("⅀Ωℤ", next.fields()[2]);
      next = iterator.next();
      Assertions.assertEquals(1L, next.number());
      Assertions.assertEquals(GigaCSV.LineBreak.NONE, next.lineBreak());
      Assertions.assertEquals("⅀,,,Ω,,ℤ", next.fields()[0]);
      Assertions.assertEquals("⅀Ωℤ\"\"", next.fields()[1]);
      Assertions.assertEquals("⅀Ωℤ", next.fields()[2]);
    } catch (Exception e) {
      assert false;
    }
  }

  @Test
  void test03NQLFWENDL() {
    final GigaCSV csv = new GigaCSV(new GigaCSV.Option().bufferSize(50));
    try (GigaCSV.Reader reader = csv.reader("src/test/resources/reader_06_03_NQ_LF_WENDL.csv")) {
      Iterator<GigaCSV.Record> iterator = reader.iterator();
      GigaCSV.Record next = iterator.next();
      Assertions.assertEquals(0L, next.number());
      Assertions.assertEquals(GigaCSV.LineBreak.LF, next.lineBreak());
      Assertions.assertEquals("⅀Ωℤ", next.fields()[0]);
      Assertions.assertEquals("⅀\nΩℤ", next.fields()[1]);
      Assertions.assertEquals("⅀Ωℤ", next.fields()[2]);
      next = iterator.next();
      Assertions.assertEquals(1L, next.number());
      Assertions.assertEquals(GigaCSV.LineBreak.LF, next.lineBreak());
      Assertions.assertEquals("⅀,,,Ω,,ℤ", next.fields()[0]);
      Assertions.assertEquals("⅀Ωℤ\"\"", next.fields()[1]);
      Assertions.assertEquals("⅀Ωℤ", next.fields()[2]);
    } catch (Exception e) {
      assert false;
    }
  }

  @Test
  void test03NQCRLFWENDL() {
    final GigaCSV csv = new GigaCSV(new GigaCSV.Option().bufferSize(50));
    try (GigaCSV.Reader reader = csv.reader("src/test/resources/reader_06_03_NQ_CRLF_WENDL.csv")) {
      Iterator<GigaCSV.Record> iterator = reader.iterator();
      GigaCSV.Record next = iterator.next();
      Assertions.assertEquals(0L, next.number());
      Assertions.assertEquals(GigaCSV.LineBreak.CRLF, next.lineBreak());
      Assertions.assertEquals("⅀Ωℤ", next.fields()[0]);
      Assertions.assertEquals("⅀\r\nΩℤ", next.fields()[1]);
      Assertions.assertEquals("⅀Ωℤ", next.fields()[2]);
      next = iterator.next();
      Assertions.assertEquals(1L, next.number());
      Assertions.assertEquals(GigaCSV.LineBreak.CRLF, next.lineBreak());
      Assertions.assertEquals("⅀,,,Ω,,ℤ", next.fields()[0]);
      Assertions.assertEquals("⅀Ωℤ\"\"", next.fields()[1]);
      Assertions.assertEquals("⅀Ωℤ", next.fields()[2]);
    } catch (Exception e) {
      assert false;
    }
  }

  @Test
  void test03NQCRWENDL() {
    final GigaCSV csv = new GigaCSV(new GigaCSV.Option().bufferSize(50));
    try (GigaCSV.Reader reader = csv.reader("src/test/resources/reader_06_03_NQ_CR_WENDL.csv")) {
      Iterator<GigaCSV.Record> iterator = reader.iterator();
      GigaCSV.Record next = iterator.next();
      Assertions.assertEquals(0L, next.number());
      Assertions.assertEquals(GigaCSV.LineBreak.CR, next.lineBreak());
      Assertions.assertEquals("⅀Ωℤ", next.fields()[0]);
      Assertions.assertEquals("⅀\rΩℤ", next.fields()[1]);
      Assertions.assertEquals("⅀Ωℤ", next.fields()[2]);
      next = iterator.next();
      Assertions.assertEquals(1L, next.number());
      Assertions.assertEquals(GigaCSV.LineBreak.CR, next.lineBreak());
      Assertions.assertEquals("⅀,,,Ω,,ℤ", next.fields()[0]);
      Assertions.assertEquals("⅀Ωℤ\"\"", next.fields()[1]);
      Assertions.assertEquals("⅀Ωℤ", next.fields()[2]);
    } catch (Exception e) {
      assert false;
    }
  }
}
