package gigacsv;

import java.util.Iterator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

// @Disabled
class CSVReaderFieldSizeTest {

  @Test
  void fieldTestLF() {
    final GigaCSV csv = new GigaCSV();
    try (final GigaCSV.Reader reader = csv.reader("src/test/resources/reader_field_size_LF.csv")) {
      final Iterator<GigaCSV.Record> iterator = reader.iterator();
      GigaCSV.Record next = iterator.next();
      Assertions.assertEquals("1", next.fields()[0]);
      Assertions.assertEquals("2", next.fields()[1]);
      Assertions.assertEquals("3", next.fields()[2]);
      Assertions.assertEquals("4", next.fields()[3]);
      Assertions.assertEquals(GigaCSV.LineBreak.LF, next.lineBreak());
      next = iterator.next();
      Assertions.assertEquals("a", next.fields()[0]);
      Assertions.assertEquals("b", next.fields()[1]);
      Assertions.assertEquals("c", next.fields()[2]);
      Assertions.assertEquals("d", next.fields()[3]);
      Assertions.assertEquals(GigaCSV.LineBreak.LF, next.lineBreak());
      next = iterator.next();
      Assertions.assertEquals("d", next.fields()[0]);
      Assertions.assertEquals("e", next.fields()[1]);
      Assertions.assertEquals(GigaCSV.LineBreak.LF, next.lineBreak());
      next = iterator.next();
      Assertions.assertEquals("f", next.fields()[0]);
      Assertions.assertEquals("g", next.fields()[1]);
      Assertions.assertEquals("h", next.fields()[2]);
      Assertions.assertEquals("i", next.fields()[3]);
      Assertions.assertEquals(GigaCSV.LineBreak.LF, next.lineBreak());
      next = iterator.next();
      Assertions.assertEquals("j", next.fields()[0]);
      Assertions.assertEquals("k", next.fields()[1]);
      Assertions.assertEquals("l", next.fields()[2]);
      Assertions.assertEquals(GigaCSV.LineBreak.LF, next.lineBreak());
      next = iterator.next();
      Assertions.assertEquals("m", next.fields()[0]);
      Assertions.assertEquals("n", next.fields()[1]);
      Assertions.assertEquals("o", next.fields()[2]);
      Assertions.assertEquals("p", next.fields()[3]);
      Assertions.assertEquals("q", next.fields()[4]);
      Assertions.assertEquals("r", next.fields()[5]);
      Assertions.assertEquals("s", next.fields()[6]);
      Assertions.assertEquals("t", next.fields()[7]);
      Assertions.assertFalse(iterator.hasNext());
    } catch (Exception e) {
      assert false;
    }
  }

  @Test
  void fieldSizeQuotedLF() {
    final GigaCSV csv = new GigaCSV();
    try (final GigaCSV.Reader reader =
        csv.reader("src/test/resources/reader_field_size_quoted_LF.csv")) {
      final Iterator<GigaCSV.Record> iterator = reader.iterator();
      GigaCSV.Record next = iterator.next();
      Assertions.assertEquals("1", next.fields()[0]);
      Assertions.assertEquals("2", next.fields()[1]);
      Assertions.assertEquals("3", next.fields()[2]);
      Assertions.assertEquals("4", next.fields()[3]);
      Assertions.assertEquals(GigaCSV.LineBreak.LF, next.lineBreak());
      next = iterator.next();
      Assertions.assertEquals("a", next.fields()[0]);
      Assertions.assertEquals("b", next.fields()[1]);
      Assertions.assertEquals("c", next.fields()[2]);
      Assertions.assertEquals("d", next.fields()[3]);
      Assertions.assertEquals(GigaCSV.LineBreak.LF, next.lineBreak());
      next = iterator.next();
      Assertions.assertEquals("d", next.fields()[0]);
      Assertions.assertEquals("e", next.fields()[1]);
      Assertions.assertEquals(GigaCSV.LineBreak.LF, next.lineBreak());
      next = iterator.next();
      Assertions.assertEquals("f", next.fields()[0]);
      Assertions.assertEquals("g", next.fields()[1]);
      Assertions.assertEquals("h", next.fields()[2]);
      Assertions.assertEquals("i", next.fields()[3]);
      Assertions.assertEquals(GigaCSV.LineBreak.LF, next.lineBreak());
      next = iterator.next();
      Assertions.assertEquals("j", next.fields()[0]);
      Assertions.assertEquals("k", next.fields()[1]);
      Assertions.assertEquals("l", next.fields()[2]);
      Assertions.assertEquals(GigaCSV.LineBreak.LF, next.lineBreak());
      next = iterator.next();
      Assertions.assertEquals("m", next.fields()[0]);
      Assertions.assertEquals("n", next.fields()[1]);
      Assertions.assertEquals("o", next.fields()[2]);
      Assertions.assertEquals("p", next.fields()[3]);
      Assertions.assertEquals("q", next.fields()[4]);
      Assertions.assertEquals("r", next.fields()[5]);
      Assertions.assertEquals("s", next.fields()[6]);
      Assertions.assertEquals("t", next.fields()[7]);
      Assertions.assertFalse(iterator.hasNext());
    } catch (Exception e) {
      assert false;
    }
  }

  @Test
  void fieldTestCR() {
    final GigaCSV csv = new GigaCSV();
    try (final GigaCSV.Reader reader = csv.reader("src/test/resources/reader_field_size_CR.csv")) {
      final Iterator<GigaCSV.Record> iterator = reader.iterator();
      GigaCSV.Record next = iterator.next();
      Assertions.assertEquals("1", next.fields()[0]);
      Assertions.assertEquals("2", next.fields()[1]);
      Assertions.assertEquals("3", next.fields()[2]);
      Assertions.assertEquals("4", next.fields()[3]);
      Assertions.assertEquals(GigaCSV.LineBreak.CR, next.lineBreak());
      next = iterator.next();
      Assertions.assertEquals("a", next.fields()[0]);
      Assertions.assertEquals("b", next.fields()[1]);
      Assertions.assertEquals("c", next.fields()[2]);
      Assertions.assertEquals("d", next.fields()[3]);
      Assertions.assertEquals(GigaCSV.LineBreak.CR, next.lineBreak());
      next = iterator.next();
      Assertions.assertEquals("d", next.fields()[0]);
      Assertions.assertEquals("e", next.fields()[1]);
      Assertions.assertEquals(GigaCSV.LineBreak.CR, next.lineBreak());
      next = iterator.next();
      Assertions.assertEquals("f", next.fields()[0]);
      Assertions.assertEquals("g", next.fields()[1]);
      Assertions.assertEquals("h", next.fields()[2]);
      Assertions.assertEquals("i", next.fields()[3]);
      Assertions.assertEquals(GigaCSV.LineBreak.CR, next.lineBreak());
      next = iterator.next();
      Assertions.assertEquals("j", next.fields()[0]);
      Assertions.assertEquals("k", next.fields()[1]);
      Assertions.assertEquals("l", next.fields()[2]);
      Assertions.assertEquals(GigaCSV.LineBreak.CR, next.lineBreak());
      next = iterator.next();
      Assertions.assertEquals("m", next.fields()[0]);
      Assertions.assertEquals("n", next.fields()[1]);
      Assertions.assertEquals("o", next.fields()[2]);
      Assertions.assertEquals("p", next.fields()[3]);
      Assertions.assertEquals("q", next.fields()[4]);
      Assertions.assertEquals("r", next.fields()[5]);
      Assertions.assertEquals("s", next.fields()[6]);
      Assertions.assertEquals("t", next.fields()[7]);
      Assertions.assertFalse(iterator.hasNext());
    } catch (Exception e) {
      assert false;
    }
  }

  @Test
  void fieldSizeQuotedCR() {
    final GigaCSV csv = new GigaCSV();
    try (final GigaCSV.Reader reader =
        csv.reader("src/test/resources/reader_field_size_quoted_CR.csv")) {
      final Iterator<GigaCSV.Record> iterator = reader.iterator();
      GigaCSV.Record next = iterator.next();
      Assertions.assertEquals("1", next.fields()[0]);
      Assertions.assertEquals("2", next.fields()[1]);
      Assertions.assertEquals("3", next.fields()[2]);
      Assertions.assertEquals("4", next.fields()[3]);
      Assertions.assertEquals(GigaCSV.LineBreak.CR, next.lineBreak());
      next = iterator.next();
      Assertions.assertEquals("a", next.fields()[0]);
      Assertions.assertEquals("b", next.fields()[1]);
      Assertions.assertEquals("c", next.fields()[2]);
      Assertions.assertEquals("d", next.fields()[3]);
      Assertions.assertEquals(GigaCSV.LineBreak.CR, next.lineBreak());
      next = iterator.next();
      Assertions.assertEquals("d", next.fields()[0]);
      Assertions.assertEquals("e", next.fields()[1]);
      Assertions.assertEquals(GigaCSV.LineBreak.CR, next.lineBreak());
      next = iterator.next();
      Assertions.assertEquals("f", next.fields()[0]);
      Assertions.assertEquals("g", next.fields()[1]);
      Assertions.assertEquals("h", next.fields()[2]);
      Assertions.assertEquals("i", next.fields()[3]);
      Assertions.assertEquals(GigaCSV.LineBreak.CR, next.lineBreak());
      next = iterator.next();
      Assertions.assertEquals("j", next.fields()[0]);
      Assertions.assertEquals("k", next.fields()[1]);
      Assertions.assertEquals("l", next.fields()[2]);
      Assertions.assertEquals(GigaCSV.LineBreak.CR, next.lineBreak());
      next = iterator.next();
      Assertions.assertEquals("m", next.fields()[0]);
      Assertions.assertEquals("n", next.fields()[1]);
      Assertions.assertEquals("o", next.fields()[2]);
      Assertions.assertEquals("p", next.fields()[3]);
      Assertions.assertEquals("q", next.fields()[4]);
      Assertions.assertEquals("r", next.fields()[5]);
      Assertions.assertEquals("s", next.fields()[6]);
      Assertions.assertEquals("t", next.fields()[7]);
      Assertions.assertFalse(iterator.hasNext());
    } catch (Exception e) {
      assert false;
    }
  }

  @Test
  void fieldTestCRLF() {
    final GigaCSV csv = new GigaCSV();
    try (final GigaCSV.Reader reader =
        csv.reader("src/test/resources/reader_field_size_CRLF.csv")) {
      final Iterator<GigaCSV.Record> iterator = reader.iterator();
      GigaCSV.Record next = iterator.next();
      Assertions.assertEquals("1", next.fields()[0]);
      Assertions.assertEquals("2", next.fields()[1]);
      Assertions.assertEquals("3", next.fields()[2]);
      Assertions.assertEquals("4", next.fields()[3]);
      Assertions.assertEquals(GigaCSV.LineBreak.CRLF, next.lineBreak());
      next = iterator.next();
      Assertions.assertEquals("a", next.fields()[0]);
      Assertions.assertEquals("b", next.fields()[1]);
      Assertions.assertEquals("c", next.fields()[2]);
      Assertions.assertEquals("d", next.fields()[3]);
      Assertions.assertEquals(GigaCSV.LineBreak.CRLF, next.lineBreak());
      next = iterator.next();
      Assertions.assertEquals("d", next.fields()[0]);
      Assertions.assertEquals("e", next.fields()[1]);
      Assertions.assertEquals(GigaCSV.LineBreak.CRLF, next.lineBreak());
      next = iterator.next();
      Assertions.assertEquals("f", next.fields()[0]);
      Assertions.assertEquals("g", next.fields()[1]);
      Assertions.assertEquals("h", next.fields()[2]);
      Assertions.assertEquals("i", next.fields()[3]);
      Assertions.assertEquals(GigaCSV.LineBreak.CRLF, next.lineBreak());
      next = iterator.next();
      Assertions.assertEquals("j", next.fields()[0]);
      Assertions.assertEquals("k", next.fields()[1]);
      Assertions.assertEquals("l", next.fields()[2]);
      Assertions.assertEquals(GigaCSV.LineBreak.CRLF, next.lineBreak());
      next = iterator.next();
      Assertions.assertEquals("m", next.fields()[0]);
      Assertions.assertEquals("n", next.fields()[1]);
      Assertions.assertEquals("o", next.fields()[2]);
      Assertions.assertEquals("p", next.fields()[3]);
      Assertions.assertEquals("q", next.fields()[4]);
      Assertions.assertEquals("r", next.fields()[5]);
      Assertions.assertEquals("s", next.fields()[6]);
      Assertions.assertEquals("t", next.fields()[7]);
      Assertions.assertFalse(iterator.hasNext());
    } catch (Exception e) {
      assert false;
    }
  }

  @Test
  void fieldTestQuotedCRLF() {
    final GigaCSV csv = new GigaCSV();
    try (final GigaCSV.Reader reader =
        csv.reader("src/test/resources/reader_field_size_quoted_CRLF.csv")) {
      final Iterator<GigaCSV.Record> iterator = reader.iterator();
      GigaCSV.Record next = iterator.next();
      Assertions.assertEquals("1", next.fields()[0]);
      Assertions.assertEquals("2", next.fields()[1]);
      Assertions.assertEquals("3", next.fields()[2]);
      Assertions.assertEquals("4", next.fields()[3]);
      Assertions.assertEquals(GigaCSV.LineBreak.CRLF, next.lineBreak());
      next = iterator.next();
      Assertions.assertEquals("a", next.fields()[0]);
      Assertions.assertEquals("b", next.fields()[1]);
      Assertions.assertEquals("c", next.fields()[2]);
      Assertions.assertEquals("d", next.fields()[3]);
      Assertions.assertEquals(GigaCSV.LineBreak.CRLF, next.lineBreak());
      next = iterator.next();
      Assertions.assertEquals("d", next.fields()[0]);
      Assertions.assertEquals("e", next.fields()[1]);
      Assertions.assertEquals(GigaCSV.LineBreak.CRLF, next.lineBreak());
      next = iterator.next();
      Assertions.assertEquals("f", next.fields()[0]);
      Assertions.assertEquals("g", next.fields()[1]);
      Assertions.assertEquals("h", next.fields()[2]);
      Assertions.assertEquals("i", next.fields()[3]);
      Assertions.assertEquals(GigaCSV.LineBreak.CRLF, next.lineBreak());
      next = iterator.next();
      Assertions.assertEquals("j", next.fields()[0]);
      Assertions.assertEquals("k", next.fields()[1]);
      Assertions.assertEquals("l", next.fields()[2]);
      Assertions.assertEquals(GigaCSV.LineBreak.CRLF, next.lineBreak());
      next = iterator.next();
      Assertions.assertEquals("m", next.fields()[0]);
      Assertions.assertEquals("n", next.fields()[1]);
      Assertions.assertEquals("o", next.fields()[2]);
      Assertions.assertEquals("p", next.fields()[3]);
      Assertions.assertEquals("q", next.fields()[4]);
      Assertions.assertEquals("r", next.fields()[5]);
      Assertions.assertEquals("s", next.fields()[6]);
      Assertions.assertEquals("t", next.fields()[7]);
      Assertions.assertFalse(iterator.hasNext());
    } catch (Exception e) {
      assert false;
    }
  }
}
