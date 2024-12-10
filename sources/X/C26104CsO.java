package X;

import java.util.Collection;
import java.util.Iterator;

/* renamed from: X.CsO  reason: case insensitive filesystem */
public final class C26104CsO {
    public static final C18100vl A01 = AnonymousClass1DF.A00(AnonymousClass00R.A00, C27864Dn1.A00);
    public int A00 = new C25944CpA().A00;

    /* JADX WARNING: Removed duplicated region for block: B:113:0x0153 A[Catch:{ IOException -> 0x0162 }, RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0094 A[Catch:{ IOException -> 0x0162 }] */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0097 A[Catch:{ IOException -> 0x0162 }] */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x0114 A[Catch:{ IOException -> 0x0162 }] */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x011a A[Catch:{ IOException -> 0x0162 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.C25783Clu A00(java.io.InputStream r6) {
        /*
            r5 = 0
            X.C18070vi.A0d(r6, r5)
            X.0vl r0 = A01     // Catch:{ IOException -> 0x0162 }
            java.lang.Object r0 = r0.getValue()     // Catch:{ IOException -> 0x0162 }
            X.CsO r0 = (X.C26104CsO) r0     // Catch:{ IOException -> 0x0162 }
            int r3 = r0.A00     // Catch:{ IOException -> 0x0162 }
            byte[] r4 = new byte[r3]     // Catch:{ IOException -> 0x0162 }
            if (r3 < r3) goto L_0x0154
            boolean r0 = r6.markSupported()     // Catch:{ IOException -> 0x0162 }
            if (r0 == 0) goto L_0x003c
            r6.mark(r3)     // Catch:{ all -> 0x0036 }
            if (r3 < 0) goto L_0x002f
            r2 = 0
        L_0x001e:
            if (r2 >= r3) goto L_0x002b
            int r0 = r3 - r2
            int r1 = r6.read(r4, r2, r0)     // Catch:{ all -> 0x0036 }
            r0 = -1
            if (r1 == r0) goto L_0x002b
            int r2 = r2 + r1
            goto L_0x001e
        L_0x002b:
            r6.reset()     // Catch:{ IOException -> 0x0162 }
            goto L_0x004c
        L_0x002f:
            java.lang.String r0 = "len is negative"
            java.lang.IndexOutOfBoundsException r0 = X.BE6.A0l(r0)     // Catch:{ all -> 0x0036 }
            throw r0     // Catch:{ all -> 0x0036 }
        L_0x0036:
            r0 = move-exception
            r6.reset()     // Catch:{ IOException -> 0x0162 }
            goto L_0x0161
        L_0x003c:
            if (r3 < 0) goto L_0x015b
            r2 = 0
        L_0x003f:
            if (r2 >= r3) goto L_0x004c
            int r0 = r3 - r2
            int r1 = r6.read(r4, r2, r0)     // Catch:{ IOException -> 0x0162 }
            r0 = -1
            if (r1 == r0) goto L_0x004c
            int r2 = r2 + r1
            goto L_0x003f
        L_0x004c:
            r0 = 20
            if (r2 < r0) goto L_0x0052
            goto L_0x00ee
        L_0x0052:
            byte[] r1 = X.C25944CpA.A09     // Catch:{ IOException -> 0x0162 }
            r0 = 3
            if (r2 < r0) goto L_0x0061
            boolean r0 = A01(r4, r1, r5)     // Catch:{ IOException -> 0x0162 }
            if (r0 == 0) goto L_0x0061
            X.Clu r1 = X.CIN.A06     // Catch:{ IOException -> 0x0162 }
            goto L_0x010c
        L_0x0061:
            byte[] r1 = X.C25944CpA.A0A     // Catch:{ IOException -> 0x0162 }
            r0 = 8
            if (r2 < r0) goto L_0x0071
            boolean r0 = A01(r4, r1, r5)     // Catch:{ IOException -> 0x0162 }
            if (r0 == 0) goto L_0x0075
            X.Clu r1 = X.CIN.A07     // Catch:{ IOException -> 0x0162 }
            goto L_0x010c
        L_0x0071:
            r0 = 6
            if (r2 >= r0) goto L_0x0075
            goto L_0x0089
        L_0x0075:
            byte[] r0 = X.C25944CpA.A05     // Catch:{ IOException -> 0x0162 }
            boolean r0 = A01(r4, r0, r5)     // Catch:{ IOException -> 0x0162 }
            if (r0 != 0) goto L_0x0085
            byte[] r0 = X.C25944CpA.A06     // Catch:{ IOException -> 0x0162 }
            boolean r0 = A01(r4, r0, r5)     // Catch:{ IOException -> 0x0162 }
            if (r0 == 0) goto L_0x0089
        L_0x0085:
            X.Clu r1 = X.CIN.A03     // Catch:{ IOException -> 0x0162 }
            goto L_0x010c
        L_0x0089:
            byte[] r1 = X.C25944CpA.A02     // Catch:{ IOException -> 0x0162 }
            int r0 = r1.length     // Catch:{ IOException -> 0x0162 }
            if (r2 < r0) goto L_0x0097
            boolean r0 = A01(r4, r1, r5)     // Catch:{ IOException -> 0x0162 }
            if (r0 == 0) goto L_0x0097
            X.Clu r1 = X.CIN.A01     // Catch:{ IOException -> 0x0162 }
            goto L_0x010c
        L_0x0097:
            byte[] r1 = X.C25944CpA.A08     // Catch:{ IOException -> 0x0162 }
            r0 = 4
            if (r2 < r0) goto L_0x00eb
            boolean r0 = A01(r4, r1, r5)     // Catch:{ IOException -> 0x0162 }
            if (r0 == 0) goto L_0x00a5
            X.Clu r1 = X.CIN.A05     // Catch:{ IOException -> 0x0162 }
            goto L_0x010c
        L_0x00a5:
            r0 = 12
            if (r2 < r0) goto L_0x00cd
            r0 = 3
            byte r0 = r4[r0]     // Catch:{ IOException -> 0x0162 }
            r6 = 8
            if (r0 < r6) goto L_0x00cd
            byte[] r1 = X.C25944CpA.A07     // Catch:{ IOException -> 0x0162 }
            r0 = 4
            boolean r0 = A01(r4, r1, r0)     // Catch:{ IOException -> 0x0162 }
            if (r0 == 0) goto L_0x00cd
            byte[][] r3 = X.C25944CpA.A0B     // Catch:{ IOException -> 0x0162 }
            r2 = 6
            r1 = 0
        L_0x00bd:
            r0 = r3[r1]     // Catch:{ IOException -> 0x0162 }
            boolean r0 = A01(r4, r0, r6)     // Catch:{ IOException -> 0x0162 }
            if (r0 == 0) goto L_0x00c8
            X.Clu r1 = X.CIN.A04     // Catch:{ IOException -> 0x0162 }
            goto L_0x010c
        L_0x00c8:
            int r1 = r1 + 1
            if (r1 >= r2) goto L_0x00cd
            goto L_0x00bd
        L_0x00cd:
            byte[] r0 = X.C25944CpA.A01     // Catch:{ IOException -> 0x0162 }
            boolean r0 = A01(r4, r0, r5)     // Catch:{ IOException -> 0x0162 }
            if (r0 == 0) goto L_0x00d8
            X.Clu r1 = X.CIN.A00     // Catch:{ IOException -> 0x0162 }
            goto L_0x010c
        L_0x00d8:
            byte[] r0 = X.C25944CpA.A03     // Catch:{ IOException -> 0x0162 }
            boolean r0 = A01(r4, r0, r5)     // Catch:{ IOException -> 0x0162 }
            if (r0 != 0) goto L_0x00e8
            byte[] r0 = X.C25944CpA.A04     // Catch:{ IOException -> 0x0162 }
            boolean r0 = A01(r4, r0, r5)     // Catch:{ IOException -> 0x0162 }
            if (r0 == 0) goto L_0x00eb
        L_0x00e8:
            X.Clu r1 = X.CIN.A02     // Catch:{ IOException -> 0x0162 }
            goto L_0x010c
        L_0x00eb:
            X.Clu r1 = X.C25783Clu.A02     // Catch:{ IOException -> 0x0162 }
            goto L_0x010c
        L_0x00ee:
            byte[] r0 = X.C25931Cov.A01     // Catch:{ IOException -> 0x0162 }
            boolean r0 = X.C25931Cov.A00(r4, r0, r5)     // Catch:{ IOException -> 0x0162 }
            if (r0 == 0) goto L_0x0052
            r1 = 8
            byte[] r0 = X.C25931Cov.A00     // Catch:{ IOException -> 0x0162 }
            boolean r0 = X.C25931Cov.A00(r4, r0, r1)     // Catch:{ IOException -> 0x0162 }
            if (r0 == 0) goto L_0x0052
            r1 = 12
            byte[] r0 = X.C25931Cov.A04     // Catch:{ IOException -> 0x0162 }
            boolean r0 = X.C25931Cov.A00(r4, r0, r1)     // Catch:{ IOException -> 0x0162 }
            if (r0 == 0) goto L_0x011b
            X.Clu r1 = X.CIN.A0C     // Catch:{ IOException -> 0x0162 }
        L_0x010c:
            X.Clu r0 = X.CIN.A00     // Catch:{ IOException -> 0x0162 }
            boolean r0 = X.C18070vi.A18(r1, r0)     // Catch:{ IOException -> 0x0162 }
            if (r0 == 0) goto L_0x0116
            X.Clu r1 = X.C25783Clu.A02     // Catch:{ IOException -> 0x0162 }
        L_0x0116:
            X.Clu r0 = X.C25783Clu.A02     // Catch:{ IOException -> 0x0162 }
            if (r1 != r0) goto L_0x0153
            goto L_0x0152
        L_0x011b:
            byte[] r0 = X.C25931Cov.A02     // Catch:{ IOException -> 0x0162 }
            boolean r0 = X.C25931Cov.A00(r4, r0, r1)     // Catch:{ IOException -> 0x0162 }
            if (r0 == 0) goto L_0x0126
            X.Clu r1 = X.CIN.A0B     // Catch:{ IOException -> 0x0162 }
            goto L_0x010c
        L_0x0126:
            r0 = 21
            if (r2 < r0) goto L_0x00eb
            byte[] r0 = X.C25931Cov.A03     // Catch:{ IOException -> 0x0162 }
            boolean r0 = X.C25931Cov.A00(r4, r0, r1)     // Catch:{ IOException -> 0x0162 }
            if (r0 == 0) goto L_0x00eb
            r0 = 20
            byte r2 = r4[r0]     // Catch:{ IOException -> 0x0162 }
            r1 = 2
            r0 = r2 & 2
            boolean r0 = X.AnonymousClass000.A1T(r0, r1)
            if (r0 == 0) goto L_0x0142
            X.Clu r1 = X.CIN.A08     // Catch:{ IOException -> 0x0162 }
            goto L_0x010c
        L_0x0142:
            r1 = 16
            r0 = r2 & 16
            boolean r0 = X.AnonymousClass000.A1T(r0, r1)
            if (r0 == 0) goto L_0x014f
            X.Clu r1 = X.CIN.A0A     // Catch:{ IOException -> 0x0162 }
            goto L_0x010c
        L_0x014f:
            X.Clu r1 = X.CIN.A09     // Catch:{ IOException -> 0x0162 }
            goto L_0x010c
        L_0x0152:
            return r0
        L_0x0153:
            return r1
        L_0x0154:
            java.lang.String r0 = "Check failed."
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0n(r0)     // Catch:{ IOException -> 0x0162 }
            goto L_0x0161
        L_0x015b:
            java.lang.String r0 = "len is negative"
            java.lang.IndexOutOfBoundsException r0 = X.BE6.A0l(r0)     // Catch:{ IOException -> 0x0162 }
        L_0x0161:
            throw r0     // Catch:{ IOException -> 0x0162 }
        L_0x0162:
            r0 = move-exception
            X.C24546C8r.A00(r0)
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26104CsO.A00(java.io.InputStream):X.Clu");
    }

    public static final boolean A01(byte[] bArr, byte[] bArr2, int i) {
        C18070vi.A0d(bArr2, 1);
        int length = bArr2.length;
        if (length + i > bArr.length) {
            return false;
        }
        C25411Oc r1 = new C25411Oc(0, length - 1);
        if ((r1 instanceof Collection) && ((Collection) r1).isEmpty()) {
            return true;
        }
        Iterator it = r1.iterator();
        while (it.hasNext()) {
            int A002 = ((AnonymousClass20T) it).A00();
            if (bArr[i + A002] != bArr2[A002]) {
                return false;
            }
        }
        return true;
    }
}
