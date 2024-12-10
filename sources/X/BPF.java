package X;

import android.net.Uri;
import java.io.IOException;
import java.io.RandomAccessFile;

public final class BPF extends C26688D9l implements E9Q {
    public long A00;
    public Uri A01;
    public RandomAccessFile A02;
    public boolean A03;

    public BPF() {
        super(false);
    }

    public void close() {
        this.A01 = null;
        try {
            RandomAccessFile randomAccessFile = this.A02;
            if (randomAccessFile != null) {
                randomAccessFile.close();
            }
            this.A02 = null;
            if (this.A03) {
                this.A03 = false;
                A01();
            }
        } catch (IOException e) {
            throw new C24186Bww(e);
        } catch (Throwable th) {
            this.A02 = null;
            if (this.A03) {
                this.A03 = false;
                A01();
            }
            throw th;
        }
    }

    public Uri Bb3() {
        return this.A01;
    }

    public long CAj(C26115Csd csd) {
        try {
            C25304Cd8.A01("fileSrcReadOpen");
            Uri uri = csd.A04;
            this.A01 = uri;
            A02();
            RandomAccessFile randomAccessFile = new RandomAccessFile(uri.getPath(), "r");
            this.A02 = randomAccessFile;
            long j = csd.A03;
            randomAccessFile.seek(j);
            long j2 = csd.A02;
            if (j2 == -1) {
                j2 = this.A02.length() - j;
            }
            this.A00 = j2;
            if (j2 >= 0) {
                C25304Cd8.A00();
                this.A03 = true;
                A04(csd);
                return this.A00;
            }
            throw BE6.A0i();
        } catch (IOException e) {
            throw new C24186Bww(e);
        } catch (Throwable th) {
            C25304Cd8.A00();
            throw th;
        }
    }

    public int read(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        if (this.A00 == 0) {
            return -1;
        }
        try {
            C25304Cd8.A01("fileSrcReadRAF");
            int read = this.A02.read(bArr, i, (int) Math.min(this.A00, (long) i2));
            C25304Cd8.A00();
            if (read <= 0) {
                return read;
            }
            this.A00 -= (long) read;
            A03(read);
            return read;
        } catch (IOException e) {
            throw new C24186Bww(e);
        } catch (Throwable th) {
            C25304Cd8.A00();
            throw th;
        }
    }
}
