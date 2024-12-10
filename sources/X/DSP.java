package X;

import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Iterator;

public abstract class DSP implements Iterable, Serializable {
    public static final DSP A00 = new C23303Ber(C25461CgE.A01);
    public static final E5M A01;
    public int zzfk = 0;

    public byte A01(int i) {
        C23303Ber ber = (C23303Ber) this;
        if (!(ber instanceof C23302Beq)) {
            return ber.zzfp[i];
        }
        C23302Beq beq = (C23302Beq) ber;
        int i2 = beq.zzfn;
        if (((i2 - (i + 1)) | i) >= 0) {
            return beq.zzfp[beq.zzfm + i];
        }
        if (i < 0) {
            throw BEA.A0Z("Index < 0: ", BE6.A0t(22), i);
        }
        StringBuilder A0t = BE6.A0t(40);
        A0t.append("Index > length: ");
        A0t.append(i);
        throw BEA.A0Z(", ", A0t, i2);
    }

    public int A02() {
        C23303Ber ber = (C23303Ber) this;
        if (ber instanceof C23302Beq) {
            return ((C23302Beq) ber).zzfn;
        }
        return ber.zzfp.length;
    }

    public void A03(C26164Ctd ctd) {
        C23303Ber ber = (C23303Ber) this;
        ((C23301Bep) ctd).A0E(ber.zzfp, ber.A04(), ber.A02());
    }

    public abstract boolean equals(Object obj);

    public /* synthetic */ Iterator iterator() {
        return new C27110DUt(this);
    }

    /* JADX WARNING: type inference failed for: r0v3, types: [X.E5M] */
    /* JADX WARNING: type inference failed for: r0v6 */
    /* JADX WARNING: type inference failed for: r0v7 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    static {
        /*
            byte[] r1 = X.C25461CgE.A01
            X.Ber r0 = new X.Ber
            r0.<init>(r1)
            A00 = r0
            java.lang.Class r0 = X.CH6.A00
            if (r0 == 0) goto L_0x0019
            boolean r0 = X.CH6.A01
            if (r0 != 0) goto L_0x0019
            X.DJT r0 = new X.DJT
            r0.<init>()
        L_0x0016:
            A01 = r0
            return
        L_0x0019:
            X.DJS r0 = new X.DJS
            r0.<init>()
            goto L_0x0016
        */
        throw new UnsupportedOperationException("Method not decompiled: X.DSP.<clinit>():void");
    }

    public static int A00(int i, int i2, int i3) {
        int i4 = i2 - i;
        if ((i | i2 | i4 | (i3 - i2)) >= 0) {
            return i4;
        }
        if (i < 0) {
            throw BEB.A0U(BE6.A0t(32), i);
        } else if (i2 < i) {
            StringBuilder A0t = BE6.A0t(66);
            A0t.append("Beginning index larger than ending index: ");
            A0t.append(i);
            throw BE6.A0l(AnonymousClass001.A1I(", ", A0t, i2));
        } else {
            StringBuilder A0t2 = BE6.A0t(37);
            A0t2.append("End index: ");
            A0t2.append(i2);
            throw BE6.A0l(AnonymousClass001.A1I(" >= ", A0t2, i3));
        }
    }

    public final int hashCode() {
        int i = this.zzfk;
        if (i == 0) {
            int A02 = A02();
            C23303Ber ber = (C23303Ber) this;
            byte[] bArr = ber.zzfp;
            int A04 = ber.A04();
            i = A02;
            Charset charset = C25461CgE.A04;
            for (int i2 = A04; i2 < A04 + A02; i2++) {
                i = (i * 31) + bArr[i2];
            }
            if (i == 0) {
                i = 1;
            }
            this.zzfk = i;
        }
        return i;
    }

    public final String toString() {
        Object[] A1b = AnonymousClass3MW.A1b();
        A1b[0] = BE8.A0h(this);
        AnonymousClass000.A1M(A1b, A02());
        return String.format("<ByteString@%s size=%d>", A1b);
    }
}
