package X;

import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.Locale;

public abstract class DSS implements Iterable, Serializable {
    public static final DSS A00 = new C23362Bfo(CI8.A05);
    public int zzc = 0;

    public static C23362Bfo A01(byte[] bArr, int i) {
        A00(0, i, bArr.length);
        byte[] bArr2 = new byte[i];
        System.arraycopy(bArr, 0, bArr2, 0, i);
        return new C23362Bfo(bArr2);
    }

    public int A03() {
        C23362Bfo bfo = (C23362Bfo) this;
        if (bfo instanceof C23361Bfn) {
            return ((C23361Bfn) bfo).zzd;
        }
        return bfo.zza.length;
    }

    public abstract boolean equals(Object obj);

    public final /* synthetic */ Iterator iterator() {
        return new DUy(this);
    }

    public static int A00(int i, int i2, int i3) {
        int i4 = i2 - i;
        if ((i | i2 | i4 | (i3 - i2)) >= 0) {
            return i4;
        }
        if (i >= 0) {
            StringBuilder A10 = AnonymousClass000.A10();
            if (i2 < i) {
                A10.append("Beginning index larger than ending index: ");
                A10.append(i);
                throw BE6.A0l(AnonymousClass001.A1I(", ", A10, i2));
            }
            A10.append("End index: ");
            A10.append(i2);
            throw BE6.A0l(AnonymousClass001.A1I(" >= ", A10, i3));
        }
        throw BEB.A0U(AnonymousClass000.A10(), i);
    }

    public final int hashCode() {
        int i;
        int i2 = this.zzc;
        if (i2 == 0) {
            int A03 = A03();
            i2 = A03;
            C23362Bfo bfo = (C23362Bfo) this;
            if (bfo instanceof C23361Bfn) {
                i = ((C23361Bfn) bfo).zzc;
            } else {
                i = 0;
            }
            Charset charset = CI8.A02;
            for (int i3 = i; i3 < i + A03; i3++) {
                i2 = (i2 * 31) + bfo.zza[i3];
            }
            if (i2 == 0) {
                i2 = 1;
            }
            this.zzc = i2;
        }
        return i2;
    }

    public final String toString() {
        int i;
        DSS bfn;
        String concat;
        Locale locale = Locale.ROOT;
        Object[] A1a = AnonymousClass8BR.A1a();
        A1a[0] = BE8.A0h(this);
        int A03 = A03();
        AnonymousClass000.A1M(A1a, A03);
        if (A03 <= 50) {
            concat = A02(this);
        } else {
            C23362Bfo bfo = (C23362Bfo) this;
            int A002 = A00(0, 47, bfo.A03());
            if (A002 == 0) {
                bfn = A00;
            } else {
                byte[] bArr = bfo.zza;
                if (bfo instanceof C23361Bfn) {
                    i = ((C23361Bfn) bfo).zzc;
                } else {
                    i = 0;
                }
                bfn = new C23361Bfn(bArr, i, A002);
            }
            concat = A02(bfn).concat("...");
        }
        A1a[2] = concat;
        return String.format(locale, "<ByteString@%s size=%d contents=\"%s\">", A1a);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x004f, code lost:
        if (r1 <= 126) goto L_0x0051;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String A02(X.DSS r6) {
        /*
            int r0 = r6.A03()
            java.lang.StringBuilder r3 = X.BE6.A0t(r0)
            r2 = 0
        L_0x0009:
            int r0 = r6.A03()
            if (r2 >= r0) goto L_0x0090
            r5 = r6
            X.Bfo r5 = (X.C23362Bfo) r5
            boolean r0 = r5 instanceof X.C23361Bfn
            if (r0 == 0) goto L_0x002e
            X.Bfn r5 = (X.C23361Bfn) r5
            int r4 = r5.zzd
            int r0 = r2 + 1
            int r0 = r4 - r0
            r0 = r0 | r2
            if (r0 >= 0) goto L_0x0033
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            if (r2 >= 0) goto L_0x0081
            java.lang.String r0 = "Index < 0: "
            java.lang.ArrayIndexOutOfBoundsException r0 = X.BEA.A0Z(r0, r1, r2)
            throw r0
        L_0x002e:
            byte[] r0 = r5.zza
            byte r1 = r0[r2]
            goto L_0x003a
        L_0x0033:
            byte[] r1 = r5.zza
            int r0 = r5.zzc
            int r0 = r0 + r2
            byte r1 = r1[r0]
        L_0x003a:
            r0 = 34
            if (r1 == r0) goto L_0x0078
            r0 = 39
            if (r1 == r0) goto L_0x0075
            r0 = 92
            if (r1 == r0) goto L_0x0072
            switch(r1) {
                case 7: goto L_0x0063;
                case 8: goto L_0x0066;
                case 9: goto L_0x0069;
                case 10: goto L_0x006c;
                case 11: goto L_0x006f;
                case 12: goto L_0x007b;
                case 13: goto L_0x0060;
                default: goto L_0x0049;
            }
        L_0x0049:
            r0 = 32
            if (r1 < r0) goto L_0x0058
            r0 = 126(0x7e, float:1.77E-43)
            if (r1 > r0) goto L_0x0058
        L_0x0051:
            char r0 = (char) r1
            r3.append(r0)
        L_0x0055:
            int r2 = r2 + 1
            goto L_0x0009
        L_0x0058:
            X.BEB.A1M(r3, r1)
            r0 = r1 & 7
            int r1 = r0 + 48
            goto L_0x0051
        L_0x0060:
            java.lang.String r0 = "\\r"
            goto L_0x007d
        L_0x0063:
            java.lang.String r0 = "\\a"
            goto L_0x007d
        L_0x0066:
            java.lang.String r0 = "\\b"
            goto L_0x007d
        L_0x0069:
            java.lang.String r0 = "\\t"
            goto L_0x007d
        L_0x006c:
            java.lang.String r0 = "\\n"
            goto L_0x007d
        L_0x006f:
            java.lang.String r0 = "\\v"
            goto L_0x007d
        L_0x0072:
            java.lang.String r0 = "\\\\"
            goto L_0x007d
        L_0x0075:
            java.lang.String r0 = "\\'"
            goto L_0x007d
        L_0x0078:
            java.lang.String r0 = "\\\""
            goto L_0x007d
        L_0x007b:
            java.lang.String r0 = "\\f"
        L_0x007d:
            r3.append(r0)
            goto L_0x0055
        L_0x0081:
            java.lang.String r0 = "Index > length: "
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = ", "
            java.lang.ArrayIndexOutOfBoundsException r0 = X.BEA.A0Z(r0, r1, r4)
            throw r0
        L_0x0090:
            java.lang.String r0 = r3.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.DSS.A02(X.DSS):java.lang.String");
    }

    public final byte[] A04() {
        int A03 = A03();
        if (A03 == 0) {
            return CI8.A05;
        }
        byte[] bArr = new byte[A03];
        C23362Bfo bfo = (C23362Bfo) this;
        if (bfo instanceof C23361Bfn) {
            C23361Bfn bfn = (C23361Bfn) bfo;
            System.arraycopy(bfn.zza, bfn.zzc, bArr, 0, A03);
            return bArr;
        }
        System.arraycopy(bfo.zza, 0, bArr, 0, A03);
        return bArr;
    }
}
