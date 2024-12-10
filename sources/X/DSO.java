package X;

import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.Locale;

public abstract class DSO implements Iterable, Serializable {
    public static final DSO A00 = new C23452BhH(C25462CgF.A01);
    public static final E5S A01;
    public int zzc = 0;

    public int A01() {
        C23452BhH bhH = (C23452BhH) this;
        if (bhH instanceof C23451BhG) {
            return ((C23451BhG) bhH).zzd;
        }
        return bhH.zzb.length;
    }

    public DSO A02(int i) {
        C23452BhH bhH = (C23452BhH) this;
        int A002 = A00(0, i, bhH.A01());
        if (A002 == 0) {
            return A00;
        }
        return new C23451BhG(bhH.zzb, bhH.A03(), A002);
    }

    public abstract boolean equals(Object obj);

    /* JADX WARNING: type inference failed for: r0v3, types: [X.E5S] */
    /* JADX WARNING: type inference failed for: r0v5 */
    /* JADX WARNING: type inference failed for: r0v6 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    static {
        /*
            byte[] r1 = X.C25462CgF.A01
            X.BhH r0 = new X.BhH
            r0.<init>(r1)
            A00 = r0
            boolean r0 = X.C25440Cfn.A00()
            if (r0 == 0) goto L_0x0017
            X.DJv r0 = new X.DJv
            r0.<init>()
        L_0x0014:
            A01 = r0
            return
        L_0x0017:
            X.DJu r0 = new X.DJu
            r0.<init>()
            goto L_0x0014
        */
        throw new UnsupportedOperationException("Method not decompiled: X.DSO.<clinit>():void");
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
        int i = this.zzc;
        if (i == 0) {
            int A012 = A01();
            C23452BhH bhH = (C23452BhH) this;
            byte[] bArr = bhH.zzb;
            int A03 = bhH.A03();
            i = A012;
            Charset charset = C25462CgF.A00;
            for (int i2 = A03; i2 < A03 + A012; i2++) {
                i = (i * 31) + bArr[i2];
            }
            if (i == 0) {
                i = 1;
            }
            this.zzc = i;
        }
        return i;
    }

    public /* synthetic */ Iterator iterator() {
        return new C27115DUz(this);
    }

    public final String toString() {
        String concat;
        Locale locale = Locale.ROOT;
        Object[] A1a = AnonymousClass8BR.A1a();
        A1a[0] = BE8.A0h(this);
        int A012 = A01();
        AnonymousClass000.A1M(A1a, A012);
        if (A012 <= 50) {
            concat = CBI.A00(this);
        } else {
            concat = String.valueOf(CBI.A00(A02(47))).concat("...");
        }
        A1a[2] = concat;
        return String.format(locale, "<ByteString@%s size=%d contents=\"%s\">", A1a);
    }
}
