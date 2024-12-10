package X;

import java.io.ByteArrayOutputStream;
import java.io.File;

/* renamed from: X.D9e  reason: case insensitive filesystem */
public final class C26681D9e implements E8Z {
    public long A00;
    public ByteArrayOutputStream A01;
    public long A02;
    public C26115Csd A03;
    public final C28653ECn A04;

    public void write(byte[] bArr, int i, int i2) {
        int i3 = 0;
        while (i3 < i2) {
            long j = this.A00;
            if (j == Long.MAX_VALUE) {
                A00();
                this.A01 = C108945cZ.A15();
                j = 0;
                this.A00 = 0;
            }
            int min = (int) Math.min((long) (i2 - i3), Long.MAX_VALUE - j);
            this.A01.write(bArr, i + i3, min);
            i3 += min;
            this.A00 += (long) min;
        }
    }

    private void A00() {
        ByteArrayOutputStream byteArrayOutputStream = this.A01;
        if (byteArrayOutputStream != null) {
            C26115Csd csd = this.A03;
            String str = csd.A06;
            long j = csd.A01 + this.A02;
            long currentTimeMillis = System.currentTimeMillis();
            long j2 = this.A00;
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            if (j2 > 0) {
                this.A04.BFG(C26214Cut.A01((File) null, str, j, currentTimeMillis, j2), byteArray);
                this.A02 += j2;
            }
            this.A01.close();
            this.A01 = null;
        }
    }

    public void CAk(C26115Csd csd) {
        this.A03 = csd;
        this.A01 = C108945cZ.A15();
        this.A00 = 0;
    }

    public C26681D9e(C28653ECn eCn) {
        C26056CrS.A01(eCn);
        this.A04 = eCn;
    }

    public void close() {
        A00();
    }
}
