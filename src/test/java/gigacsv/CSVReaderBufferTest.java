package gigacsv;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

@Disabled
class CSVReaderBufferTest {

  @Test
  void bufferToSmall() {
    final GigaCSV csv = new GigaCSV(new GigaCSV.Option().bufferSize(10));
    try (GigaCSV.Reader reader = csv.reader("src/test/resources/unicode-emoji.csv")) {
      for (GigaCSV.Record record : reader) {
        Assertions.assertNotNull(record);
      }
    } catch (Exception e) {
      throw new RuntimeException(e);
    }
  }

  @Disabled
  @Test
  void randomBufferSize() {
    for (int i = 500; i < 497622; i++) {
      final GigaCSV csv = new GigaCSV(new GigaCSV.Option().bufferSize(i));
      try (GigaCSV.Reader reader = csv.reader("src/test/resources/unicode-emoji.csv")) {
        for (GigaCSV.Record record : reader) {
          Assertions.assertNotNull(record);
        }
      } catch (Exception e) {
        throw new RuntimeException(e);
      }
    }
  }
}
