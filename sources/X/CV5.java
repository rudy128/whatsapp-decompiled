package X;

import java.io.InputStream;
import java.io.OutputStream;

public class CV5 {
    public final BSI A00;

    public void A00(InputStream inputStream, OutputStream outputStream) {
        BSI bsi = this.A00;
        byte[] bArr = (byte[]) bsi.get(16384);
        while (true) {
            try {
                int read = inputStream.read(bArr, 0, 16384);
                if (read != -1) {
                    outputStream.write(bArr, 0, read);
                } else {
                    return;
                }
            } finally {
                bsi.CEE(bArr);
            }
        }
    }

    public CV5(BSI bsi) {
        this.A00 = bsi;
    }
}
