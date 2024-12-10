package X;

import android.media.MediaDataSource;
import java.io.DataInputStream;
import java.io.IOException;

public class BFT extends MediaDataSource {
    public long A00;
    public final /* synthetic */ BLH A01;
    public final /* synthetic */ C26303CxM A02;

    public void close() {
    }

    public long getSize() {
        return -1;
    }

    public BFT(BLH blh, C26303CxM cxM) {
        this.A02 = cxM;
        this.A01 = blh;
    }

    public int readAt(long j, byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        if (j < 0) {
            return -1;
        }
        try {
            long j2 = this.A00;
            if (j2 != j) {
                if (j2 >= 0 && j >= j2 + ((long) this.A01.A03.available())) {
                    return -1;
                }
                this.A01.A01(j);
                this.A00 = j;
            }
            BLH blh = this.A01;
            DataInputStream dataInputStream = blh.A03;
            if (i2 > dataInputStream.available()) {
                i2 = dataInputStream.available();
            }
            int read = blh.read(bArr, i, i2);
            if (read >= 0) {
                this.A00 += (long) read;
                return read;
            }
        } catch (IOException unused) {
        }
        this.A00 = -1;
        return -1;
    }
}
