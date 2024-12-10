package X;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public abstract class CZO {
    public int A00;
    public int A01;
    public long A02;
    public long A03;
    public long A04;
    public long A05;
    public C28586E8z A06;
    public E8Y A07;
    public C24842CMk A08;
    public D9O A09;
    public boolean A0A;
    public boolean A0B;
    public final CWS A0C = new CWS();

    /* JADX WARNING: type inference failed for: r0v3, types: [X.CMk, java.lang.Object] */
    public void A00(boolean z) {
        int i;
        if (z) {
            this.A08 = new Object();
            this.A04 = 0;
            i = 0;
        } else {
            i = 1;
        }
        this.A01 = i;
        this.A05 = -1;
        this.A02 = 0;
    }

    public boolean A01(C24842CMk cMk, C26207Cui cui, long j) {
        if (this instanceof C22772BOl) {
            C22772BOl bOl = (C22772BOl) this;
            boolean z = true;
            if (!bOl.A00) {
                byte[] copyOf = Arrays.copyOf(cui.A02, cui.A00);
                byte b = copyOf[9] & 255;
                ArrayList A0z = C17880vN.A0z(3);
                A0z.add(copyOf);
                BEB.A1R(A0z, (((long) (((copyOf[11] & 255) << 8) | (copyOf[10] & 255))) * 1000000000) / 48000);
                BEB.A1R(A0z, 80000000);
                E0X e0x = D48.CREATOR;
                C25702CkX ckX = new C25702CkX();
                ckX.A0P = null;
                ckX.A0R = "audio/opus";
                ckX.A0N = null;
                ckX.A03 = -1;
                ckX.A09 = -1;
                ckX.A04 = b;
                ckX.A0E = 48000;
                ckX.A0S = A0z;
                ckX.A0K = null;
                ckX.A0F = 0;
                ckX.A0Q = null;
                cMk.A00 = new D48(ckX);
                bOl.A00 = true;
                return true;
            }
            if (cui.A03() != 1332770163) {
                z = false;
            }
            cui.A0I(0);
            return z;
        }
        C22770BOj bOj = (C22770BOj) this;
        byte[] bArr = cui.A02;
        if (bOj.A00 == null) {
            CSF csf = new CSF(bArr);
            bOj.A00 = csf;
            int i = csf.A02;
            if (i == 0) {
                i = -1;
            }
            byte[] copyOfRange = Arrays.copyOfRange(bArr, 9, cui.A00);
            copyOfRange[4] = Byte.MIN_VALUE;
            List singletonList = Collections.singletonList(copyOfRange);
            CSF csf2 = bOj.A00;
            int i2 = csf2.A00;
            int i3 = csf2.A03;
            int i4 = csf2.A01;
            E0X e0x2 = D48.CREATOR;
            C25702CkX ckX2 = new C25702CkX();
            ckX2.A0P = null;
            ckX2.A0R = "audio/flac";
            ckX2.A0N = null;
            ckX2.A03 = i2 * i3 * i4;
            ckX2.A09 = i;
            ckX2.A04 = i4;
            ckX2.A0E = i3;
            ckX2.A0S = singletonList;
            ckX2.A0K = null;
            ckX2.A0F = 0;
            ckX2.A0Q = null;
            cMk.A00 = new D48(ckX2);
            return true;
        }
        byte b2 = bArr[0];
        if ((b2 & Byte.MAX_VALUE) == 3) {
            D90 d90 = new D90(bOj);
            bOj.A01 = d90;
            cui.A0J(1);
            byte[] bArr2 = cui.A02;
            int i5 = cui.A01;
            int i6 = i5 + 1;
            int i7 = i6 + 1;
            int A092 = BE7.A09(bArr2, i6, (bArr2[i5] & 255) << 16);
            cui.A01 = i7 + 1;
            int i8 = ((bArr2[i7] & 255) | A092) / 18;
            d90.A01 = new long[i8];
            d90.A02 = new long[i8];
            for (int i9 = 0; i9 < i8; i9++) {
                d90.A01[i9] = cui.A08();
                d90.A02[i9] = cui.A08();
                cui.A0J(2);
            }
            return true;
        } else if (b2 != -1) {
            return true;
        } else {
            D90 d902 = bOj.A01;
            if (d902 == null) {
                return false;
            }
            d902.A00 = j;
            cMk.A01 = d902;
            return false;
        }
    }
}
