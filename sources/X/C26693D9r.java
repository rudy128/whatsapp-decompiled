package X;

import android.net.Uri;
import java.util.Map;

/* renamed from: X.D9r  reason: case insensitive filesystem */
public class C26693D9r implements C28651ECk {
    public int A00;
    public int A01;
    public int A02;
    public long A03;
    public long A04;
    public boolean A05;
    public byte[] A06;
    public C26115Csd A07;
    public final int A08;
    public final C28651ECk A09;
    public final int A0A;

    private int A00() {
        C26115Csd csd = this.A07;
        boolean z = true;
        if (csd != null) {
            long j = csd.A02;
            int i = (j > 0 ? 1 : (j == 0 ? 0 : -1));
            long j2 = (long) this.A0A;
            long j3 = j2;
            if (i > 0) {
                j2 = Math.min(j2, j - (this.A04 - csd.A03));
            }
            Uri uri = csd.A04;
            byte[] bArr = csd.A08;
            long j4 = this.A03;
            long j5 = this.A04;
            String str = csd.A06;
            int i2 = csd.A00;
            long CAj = this.A09.CAj(new C26115Csd(uri, csd.A05, str, bArr, i2, j4, j5, j2));
            if (CAj < 0 || CAj >= j3) {
                z = false;
            }
            this.A05 = z;
            return (int) CAj;
        }
        throw new BPN(new C26115Csd(Uri.EMPTY), "No DataSpec when calling openInnder", 1);
    }

    public Map BYJ() {
        return this.A09.BYJ();
    }

    public Uri Bb3() {
        return this.A09.Bb3();
    }

    public long CAj(C26115Csd csd) {
        this.A07 = csd;
        this.A06 = new byte[this.A08];
        this.A03 = csd.A01;
        this.A04 = csd.A03;
        int A002 = A00();
        this.A02 = A002;
        this.A00 = 0;
        if (A002 >= 0 && A002 < this.A0A) {
            return (long) A002;
        }
        long j = csd.A02;
        if (j < 0) {
            return -1;
        }
        return j;
    }

    public void close() {
        this.A09.close();
        this.A07 = null;
        this.A06 = null;
    }

    public int read(byte[] bArr, int i, int i2) {
        int i3;
        int i4;
        int i5;
        byte[] bArr2 = this.A06;
        if (bArr2 == null || this.A00 < i2) {
            int i6 = 0;
            if (bArr2 == null || (i5 = this.A00) <= 0) {
                i3 = i2;
            } else {
                System.arraycopy(bArr2, this.A01, bArr, i, i5);
                int i7 = this.A00;
                i += i7;
                i3 = i2 - i7;
                this.A00 = 0;
            }
            do {
                int i8 = this.A02;
                if (i8 > 0) {
                    int read = this.A09.read(bArr, i, i3);
                    if (read == -1) {
                        this.A02 = 0;
                        i8 = 0;
                    } else {
                        i += read;
                        i3 -= read;
                        this.A02 -= read;
                        long j = (long) read;
                        this.A04 += j;
                        this.A03 += j;
                    }
                }
                byte[] bArr3 = this.A06;
                if (bArr3 != null) {
                    int i9 = this.A00;
                    if (i4 + i9 <= this.A08) {
                        int i10 = this.A01;
                        if (i10 > 0) {
                            if (i9 > 0) {
                                System.arraycopy(bArr3, i10, bArr3, 0, i9);
                            }
                            this.A01 = 0;
                        }
                        while (true) {
                            i4 = this.A02;
                            if (i4 <= 0) {
                                break;
                            }
                            int read2 = this.A09.read(this.A06, this.A00, i4);
                            if (read2 == -1) {
                                this.A02 = 0;
                                i4 = 0;
                                break;
                            }
                            this.A00 += read2;
                            this.A02 -= read2;
                            long j2 = (long) read2;
                            this.A04 += j2;
                            this.A03 += j2;
                        }
                        if (!this.A05) {
                            this.A09.close();
                            i4 = A00();
                            this.A02 = i4;
                        }
                    }
                    if (this.A00 > 0 || i4 > 0) {
                        int read3 = read(bArr, i, i3);
                        int i11 = i2 - i3;
                        if (read3 != -1) {
                            i6 = read3;
                        }
                        return i11 + i6;
                    }
                    int i12 = i2 - i3;
                    if (i12 > 0) {
                        return i12;
                    }
                    return -1;
                }
                throw new BPN(new C26115Csd(Uri.EMPTY), "No internal buffer", 2);
            } while (i3 != 0);
            return i2;
        }
        System.arraycopy(bArr2, this.A01, bArr, i, i2);
        this.A01 += i2;
        this.A00 -= i2;
        return i2;
    }

    public C26693D9r(C28651ECk eCk, int i, int i2) {
        this.A09 = eCk;
        this.A08 = i;
        this.A0A = i2;
    }

    public void BBr(C28570E8b e8b) {
        C26056CrS.A01(e8b);
        this.A09.BBr(e8b);
    }
}
