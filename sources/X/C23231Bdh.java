package X;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.Arrays;

/* renamed from: X.Bdh  reason: case insensitive filesystem */
public class C23231Bdh extends C23024Ba0 {
    public static final Parcelable.Creator CREATOR = new Object();
    public final DSS A00;
    public final DSS A01;
    public final DSS A02;
    public final String[] A03;

    public static final void A01(long j, byte b) {
        switch (b) {
            case 24:
                if (j < 24) {
                    StringBuilder A11 = AnonymousClass000.A11("Integer value ");
                    A11.append(j);
                    throw new C24197Bx7(AnonymousClass000.A0y(" after add info could have been represented in 0 additional bytes, but used 1", A11));
                }
                return;
            case 25:
                if (j < 256) {
                    StringBuilder A112 = AnonymousClass000.A11("Integer value ");
                    A112.append(j);
                    throw new C24197Bx7(AnonymousClass000.A0y(" after add info could have been represented in 0-1 additional bytes, but used 2", A112));
                }
                return;
            case 26:
                if (j < 65536) {
                    StringBuilder A113 = AnonymousClass000.A11("Integer value ");
                    A113.append(j);
                    throw new C24197Bx7(AnonymousClass000.A0y(" after add info could have been represented in 0-2 additional bytes, but used 4", A113));
                }
                return;
            case 27:
                if (j < 4294967296L) {
                    StringBuilder A114 = AnonymousClass000.A11("Integer value ");
                    A114.append(j);
                    throw new C24197Bx7(AnonymousClass000.A0y(" after add info could have been represented in 0-4 additional bytes, but used 8", A114));
                }
                return;
            default:
                return;
        }
    }

    public static void A02(Object obj, Object obj2) {
        if (obj == null) {
            throw AnonymousClass000.A0s("null key in entry: null=".concat(String.valueOf(String.valueOf(obj2))));
        } else if (obj2 == null) {
            String obj3 = obj.toString();
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("null value in entry: ");
            A10.append(obj3);
            throw AnonymousClass000.A0s(AnonymousClass000.A0y("=null", A10));
        }
    }

    public boolean equals(Object obj) {
        if (obj instanceof C23231Bdh) {
            C23231Bdh bdh = (C23231Bdh) obj;
            if (!C25332Cdd.A01(this.A00, bdh.A00) || !C25332Cdd.A01(this.A01, bdh.A01) || !C25332Cdd.A01(this.A02, bdh.A02)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public C23231Bdh(byte[] bArr, byte[] bArr2, byte[] bArr3, String[] strArr) {
        C23362Bfo A09 = DJ0.A09(bArr);
        C23362Bfo A092 = DJ0.A09(bArr2);
        C23362Bfo A093 = DJ0.A09(bArr3);
        C18210vx.A00(A09);
        this.A00 = A09;
        C18210vx.A00(A092);
        this.A01 = A092;
        C18210vx.A00(A093);
        this.A02 = A093;
        C18210vx.A00(strArr);
        this.A03 = strArr;
    }

    /* JADX WARNING: type inference failed for: r4v3, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.DSA A00(X.DRI r11, java.io.InputStream r12) {
        /*
            X.CNt r0 = r11.A05()     // Catch:{ IOException -> 0x0315 }
            if (r0 == 0) goto L_0x030d
            byte r5 = r0.A01     // Catch:{ IOException | RuntimeException -> 0x0306 }
            byte r1 = r0.A00     // Catch:{ IOException | RuntimeException -> 0x0306 }
            r0 = -128(0xffffffffffffff80, float:NaN)
            r9 = 1000(0x3e8, double:4.94E-321)
            r6 = 0
            if (r1 == r0) goto L_0x0292
            r0 = -96
            if (r1 == r0) goto L_0x00f2
            r0 = -64
            if (r1 == r0) goto L_0x00e9
            r0 = -32
            if (r1 == r0) goto L_0x00b6
            if (r1 == 0) goto L_0x005c
            r0 = 32
            if (r1 == r0) goto L_0x005c
            r0 = 64
            if (r1 == r0) goto L_0x0046
            r0 = 96
            if (r1 != r0) goto L_0x02f2
            X.DRI.A02(r11, r0)     // Catch:{ IOException | RuntimeException -> 0x0306 }
            byte[] r1 = X.DRI.A04(r11)     // Catch:{ IOException | RuntimeException -> 0x0306 }
            java.nio.charset.Charset r0 = java.nio.charset.StandardCharsets.UTF_8     // Catch:{ IOException | RuntimeException -> 0x0306 }
            java.lang.String r2 = X.BE6.A0q(r0, r1)     // Catch:{ IOException | RuntimeException -> 0x0306 }
            int r0 = r2.length()     // Catch:{ IOException | RuntimeException -> 0x0306 }
            long r0 = (long) r0     // Catch:{ IOException | RuntimeException -> 0x0306 }
            A01(r0, r5)     // Catch:{ IOException | RuntimeException -> 0x0306 }
            X.Bft r1 = new X.Bft     // Catch:{ IOException | RuntimeException -> 0x0306 }
            r1.<init>(r2)     // Catch:{ IOException | RuntimeException -> 0x0306 }
            return r1
        L_0x0046:
            X.DRI.A02(r11, r0)     // Catch:{ IOException | RuntimeException -> 0x0306 }
            byte[] r3 = X.DRI.A04(r11)     // Catch:{ IOException | RuntimeException -> 0x0306 }
            int r2 = r3.length     // Catch:{ IOException | RuntimeException -> 0x0306 }
            long r0 = (long) r2     // Catch:{ IOException | RuntimeException -> 0x0306 }
            A01(r0, r5)     // Catch:{ IOException | RuntimeException -> 0x0306 }
            X.Bfo r0 = X.DSS.A01(r3, r2)     // Catch:{ IOException | RuntimeException -> 0x0306 }
            X.Bfr r1 = new X.Bfr     // Catch:{ IOException | RuntimeException -> 0x0306 }
            r1.<init>(r0)     // Catch:{ IOException | RuntimeException -> 0x0306 }
            return r1
        L_0x005c:
            r11.A05()     // Catch:{ IOException | RuntimeException -> 0x0306 }
            X.CNt r0 = r11.A00     // Catch:{ IOException | RuntimeException -> 0x0306 }
            byte r2 = r0.A00     // Catch:{ IOException | RuntimeException -> 0x0306 }
            r4 = 1
            if (r2 != 0) goto L_0x0068
            r1 = 1
            goto L_0x006d
        L_0x0068:
            r0 = 32
            if (r2 != r0) goto L_0x00a5
            r1 = 0
        L_0x006d:
            long r2 = X.DRI.A00(r11)     // Catch:{ IOException | RuntimeException -> 0x0306 }
            r7 = 0
            int r0 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r0 < 0) goto L_0x008f
            if (r1 != 0) goto L_0x007d
            r0 = -1
            long r0 = r0 ^ r2
            r2 = r0
        L_0x007d:
            int r0 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r0 <= 0) goto L_0x0083
            r0 = r2
            goto L_0x0086
        L_0x0083:
            r0 = -1
            long r0 = r0 ^ r2
        L_0x0086:
            A01(r0, r5)     // Catch:{ IOException | RuntimeException -> 0x0306 }
            X.Bfs r1 = new X.Bfs     // Catch:{ IOException | RuntimeException -> 0x0306 }
            r1.<init>(r2)     // Catch:{ IOException | RuntimeException -> 0x0306 }
            return r1
        L_0x008f:
            java.lang.Object[] r2 = new java.lang.Object[r4]     // Catch:{ IOException | RuntimeException -> 0x0306 }
            r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            X.AnonymousClass3MX.A1S(r2, r6, r0)     // Catch:{ IOException | RuntimeException -> 0x0306 }
            java.lang.String r0 = "the maximum supported unsigned/negative integer is %s"
            java.lang.String r0 = java.lang.String.format(r0, r2)     // Catch:{ IOException | RuntimeException -> 0x0306 }
            java.lang.UnsupportedOperationException r1 = X.BE6.A0v(r0)     // Catch:{ IOException | RuntimeException -> 0x0306 }
            goto L_0x0305
        L_0x00a5:
            java.lang.Object[] r1 = new java.lang.Object[r4]     // Catch:{ IOException | RuntimeException -> 0x0306 }
            int r0 = r2 >> 5
            r0 = r0 & 7
            X.C17880vN.A1T(r1, r0, r6)     // Catch:{ IOException | RuntimeException -> 0x0306 }
            java.lang.String r0 = "expected major type 0 or 1 but found %s"
            java.lang.IllegalStateException r1 = X.BE8.A0Y(r0, r1)     // Catch:{ IOException | RuntimeException -> 0x0306 }
            goto L_0x0305
        L_0x00b6:
            X.DRI.A02(r11, r0)     // Catch:{ IOException | RuntimeException -> 0x0306 }
            X.CNt r0 = r11.A00     // Catch:{ IOException | RuntimeException -> 0x0306 }
            byte r1 = r0.A01     // Catch:{ IOException | RuntimeException -> 0x0306 }
            r0 = 24
            if (r1 > r0) goto L_0x00e1
            long r0 = X.DRI.A00(r11)     // Catch:{ IOException | RuntimeException -> 0x0306 }
            int r2 = (int) r0     // Catch:{ IOException | RuntimeException -> 0x0306 }
            r1 = 20
            r0 = 0
            if (r2 == r1) goto L_0x00db
            r0 = 21
            if (r2 != r0) goto L_0x00d1
            r0 = 1
            goto L_0x00db
        L_0x00d1:
            java.lang.Object[] r1 = new java.lang.Object[r6]     // Catch:{ IOException | RuntimeException -> 0x0306 }
            java.lang.String r0 = "expected FALSE or TRUE"
            java.lang.IllegalStateException r1 = X.BE8.A0Y(r0, r1)     // Catch:{ IOException | RuntimeException -> 0x0306 }
            goto L_0x0305
        L_0x00db:
            X.Bfq r1 = new X.Bfq     // Catch:{ IOException | RuntimeException -> 0x0306 }
            r1.<init>(r0)     // Catch:{ IOException | RuntimeException -> 0x0306 }
            return r1
        L_0x00e1:
            java.lang.String r0 = "expected simple value"
            java.lang.IllegalStateException r1 = X.AnonymousClass000.A0n(r0)     // Catch:{ IOException | RuntimeException -> 0x0306 }
            goto L_0x0305
        L_0x00e9:
            java.lang.String r0 = "Tags are currently unsupported"
            X.BxK r1 = new X.BxK     // Catch:{ IOException | RuntimeException -> 0x0306 }
            r1.<init>((java.lang.String) r0)     // Catch:{ IOException | RuntimeException -> 0x0306 }
            goto L_0x0305
        L_0x00f2:
            X.DRI.A02(r11, r0)     // Catch:{ IOException | RuntimeException -> 0x0306 }
            X.DRI.A01(r11)     // Catch:{ IOException | RuntimeException -> 0x0306 }
            long r1 = X.DRI.A00(r11)     // Catch:{ IOException | RuntimeException -> 0x0306 }
            r7 = 0
            int r0 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r0 < 0) goto L_0x028b
            r3 = 4611686018427387903(0x3fffffffffffffff, double:1.9999999999999998)
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 > 0) goto L_0x028b
            int r0 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r0 <= 0) goto L_0x011c
            X.CjO r0 = r11.A01     // Catch:{ IOException | RuntimeException -> 0x0306 }
            long r7 = r1 + r1
            java.util.Deque r3 = r0.A00     // Catch:{ IOException | RuntimeException -> 0x0306 }
            java.lang.Long r0 = java.lang.Long.valueOf(r7)     // Catch:{ IOException | RuntimeException -> 0x0306 }
            r3.push(r0)     // Catch:{ IOException | RuntimeException -> 0x0306 }
        L_0x011c:
            int r0 = (r1 > r9 ? 1 : (r1 == r9 ? 0 : -1))
            if (r0 > 0) goto L_0x0283
            A01(r1, r5)     // Catch:{ IOException | RuntimeException -> 0x0306 }
            int r7 = (int) r1     // Catch:{ IOException | RuntimeException -> 0x0306 }
            X.CNs[] r5 = new X.C24874CNs[r7]     // Catch:{ IOException | RuntimeException -> 0x0306 }
            r9 = 0
            r8 = 0
        L_0x0128:
            long r3 = (long) r8     // Catch:{ IOException | RuntimeException -> 0x0306 }
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x0161
            X.DSA r4 = A00(r11, r12)     // Catch:{ IOException | RuntimeException -> 0x0306 }
            if (r9 == 0) goto L_0x0152
            int r0 = r4.compareTo(r9)     // Catch:{ IOException | RuntimeException -> 0x0306 }
            if (r0 > 0) goto L_0x0152
            java.lang.String r3 = "Keys in CBOR Map not in strictly ascending natural order:\nPrevious key: %s\nCurrent key: %s"
            java.lang.Object[] r2 = X.AnonymousClass3MW.A1b()     // Catch:{ IOException | RuntimeException -> 0x0306 }
            X.BE6.A1H(r9, r2, r6)     // Catch:{ IOException | RuntimeException -> 0x0306 }
            java.lang.String r1 = r4.toString()     // Catch:{ IOException | RuntimeException -> 0x0306 }
            r0 = 1
            java.lang.String r0 = X.AnonymousClass8BS.A0l(r1, r3, r2, r0)     // Catch:{ IOException | RuntimeException -> 0x0306 }
            X.Bx7 r1 = new X.Bx7     // Catch:{ IOException | RuntimeException -> 0x0306 }
            r1.<init>(r0)     // Catch:{ IOException | RuntimeException -> 0x0306 }
            goto L_0x0305
        L_0x0152:
            X.DSA r3 = A00(r11, r12)     // Catch:{ IOException | RuntimeException -> 0x0306 }
            X.CNs r0 = new X.CNs     // Catch:{ IOException | RuntimeException -> 0x0306 }
            r0.<init>(r4, r3)     // Catch:{ IOException | RuntimeException -> 0x0306 }
            r5[r8] = r0     // Catch:{ IOException | RuntimeException -> 0x0306 }
            int r8 = r8 + 1
            r9 = r4
            goto L_0x0128
        L_0x0161:
            java.util.TreeMap r3 = new java.util.TreeMap     // Catch:{ IOException | RuntimeException -> 0x0306 }
            r3.<init>()     // Catch:{ IOException | RuntimeException -> 0x0306 }
        L_0x0166:
            if (r6 >= r7) goto L_0x0185
            r2 = r5[r6]     // Catch:{ IOException | RuntimeException -> 0x0306 }
            X.DSA r0 = r2.A00     // Catch:{ IOException | RuntimeException -> 0x0306 }
            boolean r0 = r3.containsKey(r0)     // Catch:{ IOException | RuntimeException -> 0x0306 }
            if (r0 != 0) goto L_0x017c
            X.DSA r1 = r2.A00     // Catch:{ IOException | RuntimeException -> 0x0306 }
            X.DSA r0 = r2.A01     // Catch:{ IOException | RuntimeException -> 0x0306 }
            r3.put(r1, r0)     // Catch:{ IOException | RuntimeException -> 0x0306 }
            int r6 = r6 + 1
            goto L_0x0166
        L_0x017c:
            java.lang.String r0 = "Attempted to add duplicate key to canonical CBOR Map."
            X.Bx7 r1 = new X.Bx7     // Catch:{ IOException | RuntimeException -> 0x0306 }
            r1.<init>(r0)     // Catch:{ IOException | RuntimeException -> 0x0306 }
            goto L_0x0305
        L_0x0185:
            java.util.Comparator r5 = X.C23346BfY.A03     // Catch:{ IOException | RuntimeException -> 0x0306 }
            java.util.Comparator r0 = r3.comparator()     // Catch:{ IOException | RuntimeException -> 0x0306 }
            r11 = 1
            if (r0 != 0) goto L_0x0190
            r9 = 1
            goto L_0x0194
        L_0x0190:
            boolean r9 = r5.equals(r0)     // Catch:{ IOException | RuntimeException -> 0x0306 }
        L_0x0194:
            java.util.Set r4 = r3.entrySet()     // Catch:{ IOException | RuntimeException -> 0x0306 }
            java.util.Map$Entry[] r2 = X.DVL.A01     // Catch:{ IOException | RuntimeException -> 0x0306 }
            boolean r0 = r4 instanceof java.util.Collection     // Catch:{ IOException | RuntimeException -> 0x0306 }
            r3 = 0
            if (r0 != 0) goto L_0x01b4
            java.util.Iterator r1 = r4.iterator()     // Catch:{ IOException | RuntimeException -> 0x0306 }
            java.util.ArrayList r4 = X.AnonymousClass000.A13()     // Catch:{ IOException | RuntimeException -> 0x0306 }
            if (r1 != 0) goto L_0x01aa
            throw r3     // Catch:{ IOException | RuntimeException -> 0x0306 }
        L_0x01aa:
            boolean r0 = r1.hasNext()     // Catch:{ IOException | RuntimeException -> 0x0306 }
            if (r0 == 0) goto L_0x01b4
            X.BE7.A1R(r4, r1)     // Catch:{ IOException | RuntimeException -> 0x0306 }
            goto L_0x01aa
        L_0x01b4:
            java.lang.Object[] r10 = r4.toArray(r2)     // Catch:{ IOException | RuntimeException -> 0x0306 }
            java.util.Map$Entry[] r10 = (java.util.Map.Entry[]) r10     // Catch:{ IOException | RuntimeException -> 0x0306 }
            int r7 = r10.length     // Catch:{ IOException | RuntimeException -> 0x0306 }
            if (r7 == 0) goto L_0x0257
            r2 = 0
            if (r7 == r11) goto L_0x025c
            java.lang.Object[] r8 = new java.lang.Object[r7]     // Catch:{ IOException | RuntimeException -> 0x0306 }
            java.lang.Object[] r6 = new java.lang.Object[r7]     // Catch:{ IOException | RuntimeException -> 0x0306 }
            if (r9 != 0) goto L_0x022a
            X.DUJ r0 = new X.DUJ     // Catch:{ IOException | RuntimeException -> 0x0306 }
            r0.<init>(r5)     // Catch:{ IOException | RuntimeException -> 0x0306 }
            java.util.Arrays.sort(r10, r2, r7, r0)     // Catch:{ IOException | RuntimeException -> 0x0306 }
            r0 = r10[r2]     // Catch:{ IOException | RuntimeException -> 0x0306 }
            r0.getClass()     // Catch:{ IOException | RuntimeException -> 0x0306 }
            java.lang.Object r9 = r0.getKey()     // Catch:{ IOException | RuntimeException -> 0x0306 }
            r8[r2] = r9     // Catch:{ IOException | RuntimeException -> 0x0306 }
            java.lang.Object r1 = r0.getValue()     // Catch:{ IOException | RuntimeException -> 0x0306 }
            r6[r2] = r1     // Catch:{ IOException | RuntimeException -> 0x0306 }
            r0 = r8[r2]     // Catch:{ IOException | RuntimeException -> 0x0306 }
            A02(r0, r1)     // Catch:{ IOException | RuntimeException -> 0x0306 }
        L_0x01e4:
            int r0 = r11 + -1
            r4 = r10[r0]     // Catch:{ IOException | RuntimeException -> 0x0306 }
            r4.getClass()     // Catch:{ IOException | RuntimeException -> 0x0306 }
            r2 = r10[r11]     // Catch:{ IOException | RuntimeException -> 0x0306 }
            r2.getClass()     // Catch:{ IOException | RuntimeException -> 0x0306 }
            java.lang.Object r1 = r2.getKey()     // Catch:{ IOException | RuntimeException -> 0x0306 }
            java.lang.Object r0 = r2.getValue()     // Catch:{ IOException | RuntimeException -> 0x0306 }
            A02(r1, r0)     // Catch:{ IOException | RuntimeException -> 0x0306 }
            r8[r11] = r1     // Catch:{ IOException | RuntimeException -> 0x0306 }
            r6[r11] = r0     // Catch:{ IOException | RuntimeException -> 0x0306 }
            int r0 = r5.compare(r9, r1)     // Catch:{ IOException | RuntimeException -> 0x0306 }
            if (r0 == 0) goto L_0x020b
            int r11 = r11 + 1
            r9 = r1
            if (r11 >= r7) goto L_0x0243
            goto L_0x01e4
        L_0x020b:
            java.lang.String r3 = java.lang.String.valueOf(r4)     // Catch:{ IOException | RuntimeException -> 0x0306 }
            java.lang.String r2 = java.lang.String.valueOf(r2)     // Catch:{ IOException | RuntimeException -> 0x0306 }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ IOException | RuntimeException -> 0x0306 }
            java.lang.String r0 = "Multiple entries with same key: "
            r1.append(r0)     // Catch:{ IOException | RuntimeException -> 0x0306 }
            r1.append(r3)     // Catch:{ IOException | RuntimeException -> 0x0306 }
            java.lang.String r0 = " and "
            r1.append(r0)     // Catch:{ IOException | RuntimeException -> 0x0306 }
            java.lang.IllegalArgumentException r1 = X.AnonymousClass001.A12(r2, r1)     // Catch:{ IOException | RuntimeException -> 0x0306 }
            goto L_0x0305
        L_0x022a:
            r0 = r10[r2]     // Catch:{ IOException | RuntimeException -> 0x0306 }
            r0.getClass()     // Catch:{ IOException | RuntimeException -> 0x0306 }
            java.lang.Object r1 = r0.getKey()     // Catch:{ IOException | RuntimeException -> 0x0306 }
            java.lang.Object r0 = r0.getValue()     // Catch:{ IOException | RuntimeException -> 0x0306 }
            A02(r1, r0)     // Catch:{ IOException | RuntimeException -> 0x0306 }
            r8[r2] = r1     // Catch:{ IOException | RuntimeException -> 0x0306 }
            r6[r2] = r0     // Catch:{ IOException | RuntimeException -> 0x0306 }
            int r2 = r2 + 1
            if (r2 >= r7) goto L_0x0243
            goto L_0x022a
        L_0x0243:
            X.BfS r0 = X.C23340BfS.A03     // Catch:{ IOException | RuntimeException -> 0x0306 }
            X.Bfh r0 = X.C23345BfX.A00     // Catch:{ IOException | RuntimeException -> 0x0306 }
            X.BfW r0 = new X.BfW     // Catch:{ IOException | RuntimeException -> 0x0306 }
            r0.<init>(r8, r7)     // Catch:{ IOException | RuntimeException -> 0x0306 }
            X.BfS r2 = new X.BfS     // Catch:{ IOException | RuntimeException -> 0x0306 }
            r2.<init>(r0, r5)     // Catch:{ IOException | RuntimeException -> 0x0306 }
            X.BfW r1 = new X.BfW     // Catch:{ IOException | RuntimeException -> 0x0306 }
            r1.<init>(r6, r7)     // Catch:{ IOException | RuntimeException -> 0x0306 }
            goto L_0x0278
        L_0x0257:
            X.BfY r0 = X.C23346BfY.A01(r5)     // Catch:{ IOException | RuntimeException -> 0x0306 }
            goto L_0x027d
        L_0x025c:
            r0 = r10[r2]     // Catch:{ IOException | RuntimeException -> 0x0306 }
            r0.getClass()     // Catch:{ IOException | RuntimeException -> 0x0306 }
            java.lang.Object r2 = r0.getKey()     // Catch:{ IOException | RuntimeException -> 0x0306 }
            java.lang.Object r1 = r0.getValue()     // Catch:{ IOException | RuntimeException -> 0x0306 }
            X.BfS r0 = X.C23340BfS.A03     // Catch:{ IOException | RuntimeException -> 0x0306 }
            X.BfW r0 = X.C23345BfX.A01(r2)     // Catch:{ IOException | RuntimeException -> 0x0306 }
            X.BfS r2 = new X.BfS     // Catch:{ IOException | RuntimeException -> 0x0306 }
            r2.<init>(r0, r5)     // Catch:{ IOException | RuntimeException -> 0x0306 }
            X.BfW r1 = X.C23345BfX.A01(r1)     // Catch:{ IOException | RuntimeException -> 0x0306 }
        L_0x0278:
            X.BfY r0 = new X.BfY     // Catch:{ IOException | RuntimeException -> 0x0306 }
            r0.<init>(r1, r3, r2)     // Catch:{ IOException | RuntimeException -> 0x0306 }
        L_0x027d:
            X.Bfv r1 = new X.Bfv     // Catch:{ IOException | RuntimeException -> 0x0306 }
            r1.<init>(r0)     // Catch:{ IOException | RuntimeException -> 0x0306 }
            return r1
        L_0x0283:
            java.lang.String r0 = "Parser being asked to read a large CBOR map"
            X.BxK r1 = new X.BxK     // Catch:{ IOException | RuntimeException -> 0x0306 }
            r1.<init>((java.lang.String) r0)     // Catch:{ IOException | RuntimeException -> 0x0306 }
            goto L_0x0305
        L_0x028b:
            java.lang.String r0 = "the maximum supported map length is 4611686018427387903L"
            java.lang.UnsupportedOperationException r1 = X.BE6.A0v(r0)     // Catch:{ IOException | RuntimeException -> 0x0306 }
            goto L_0x0305
        L_0x0292:
            X.DRI.A02(r11, r0)     // Catch:{ IOException | RuntimeException -> 0x0306 }
            X.DRI.A01(r11)     // Catch:{ IOException | RuntimeException -> 0x0306 }
            long r1 = X.DRI.A00(r11)     // Catch:{ IOException | RuntimeException -> 0x0306 }
            r3 = 0
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 < 0) goto L_0x02db
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 <= 0) goto L_0x02b1
            X.CjO r0 = r11.A01     // Catch:{ IOException | RuntimeException -> 0x0306 }
            java.util.Deque r3 = r0.A00     // Catch:{ IOException | RuntimeException -> 0x0306 }
            java.lang.Long r0 = java.lang.Long.valueOf(r1)     // Catch:{ IOException | RuntimeException -> 0x0306 }
            r3.push(r0)     // Catch:{ IOException | RuntimeException -> 0x0306 }
        L_0x02b1:
            int r0 = (r1 > r9 ? 1 : (r1 == r9 ? 0 : -1))
            if (r0 > 0) goto L_0x02d3
            A01(r1, r5)     // Catch:{ IOException | RuntimeException -> 0x0306 }
            int r0 = (int) r1     // Catch:{ IOException | RuntimeException -> 0x0306 }
            X.DSA[] r5 = new X.DSA[r0]     // Catch:{ IOException | RuntimeException -> 0x0306 }
        L_0x02bb:
            long r3 = (long) r6     // Catch:{ IOException | RuntimeException -> 0x0306 }
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x02c9
            X.DSA r0 = A00(r11, r12)     // Catch:{ IOException | RuntimeException -> 0x0306 }
            r5[r6] = r0     // Catch:{ IOException | RuntimeException -> 0x0306 }
            int r6 = r6 + 1
            goto L_0x02bb
        L_0x02c9:
            X.BfX r0 = X.C23345BfX.A00(r5)     // Catch:{ IOException | RuntimeException -> 0x0306 }
            X.Bfu r1 = new X.Bfu     // Catch:{ IOException | RuntimeException -> 0x0306 }
            r1.<init>(r0)     // Catch:{ IOException | RuntimeException -> 0x0306 }
            return r1
        L_0x02d3:
            java.lang.String r0 = "Parser being asked to read a large CBOR array"
            X.BxK r1 = new X.BxK     // Catch:{ IOException | RuntimeException -> 0x0306 }
            r1.<init>((java.lang.String) r0)     // Catch:{ IOException | RuntimeException -> 0x0306 }
            goto L_0x0305
        L_0x02db:
            java.lang.Object[] r2 = X.AnonymousClass3MW.A1a()     // Catch:{ IOException | RuntimeException -> 0x0306 }
            r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            X.AnonymousClass3MX.A1S(r2, r6, r0)     // Catch:{ IOException | RuntimeException -> 0x0306 }
            java.lang.String r0 = "the maximum supported array length is %s"
            java.lang.String r0 = java.lang.String.format(r0, r2)     // Catch:{ IOException | RuntimeException -> 0x0306 }
            java.lang.UnsupportedOperationException r1 = X.BE6.A0v(r0)     // Catch:{ IOException | RuntimeException -> 0x0306 }
            goto L_0x0305
        L_0x02f2:
            int r0 = r1 >> 5
            r2 = r0 & 7
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ IOException | RuntimeException -> 0x0306 }
            java.lang.String r0 = "Unidentifiable major type: "
            java.lang.String r0 = X.AnonymousClass001.A1I(r0, r1, r2)     // Catch:{ IOException | RuntimeException -> 0x0306 }
            X.BxK r1 = new X.BxK     // Catch:{ IOException | RuntimeException -> 0x0306 }
            r1.<init>((java.lang.String) r0)     // Catch:{ IOException | RuntimeException -> 0x0306 }
        L_0x0305:
            throw r1     // Catch:{ IOException | RuntimeException -> 0x0306 }
        L_0x0306:
            r1 = move-exception
            X.BxK r0 = new X.BxK
            r0.<init>((java.lang.Throwable) r1)
            throw r0
        L_0x030d:
            java.lang.String r1 = "Parser being asked to parse an empty input stream"
            X.BxK r0 = new X.BxK
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x0315:
            r1 = move-exception
            X.BxK r0 = new X.BxK
            r0.<init>((java.lang.Throwable) r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C23231Bdh.A00(X.DRI, java.io.InputStream):X.DSA");
    }

    public int hashCode() {
        Object[] A1a = AnonymousClass8BR.A1a();
        C17880vN.A1T(A1a, AnonymousClass000.A0P(this.A00, new Object[1], 0), 0);
        C17880vN.A1T(A1a, AnonymousClass000.A0P(this.A01, new Object[1], 0), 1);
        AnonymousClass3Ma.A1S(A1a, AnonymousClass000.A0P(this.A02, new Object[1], 0));
        return Arrays.hashCode(A1a);
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [X.CQA, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v8, types: [X.CQA, java.lang.Object] */
    public String toString() {
        String A0x = C108955ca.A0x(this);
        ? obj = new Object();
        if (A0x != null) {
            C25038CUr cUr = C25038CUr.A00;
            CQA A08 = DJ0.A08(DJ0.A08(DJ0.A08(obj, BE8.A0g(cUr, this.A00), "keyHandle"), BE8.A0g(cUr, this.A01), PublicKeyCredentialControllerUtility.JSON_KEY_CLIENT_DATA), BE8.A0g(cUr, this.A02), PublicKeyCredentialControllerUtility.JSON_KEY_ATTESTATION_OBJ);
            String arrays = Arrays.toString(this.A03);
            ? obj2 = new Object();
            A08.A00 = obj2;
            obj2.A01 = arrays;
            obj2.A02 = PublicKeyCredentialControllerUtility.JSON_KEY_TRANSPORTS;
            return CB9.A00(obj, A0x);
        }
        throw null;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int A002 = C26293Cx2.A00(parcel);
        C26293Cx2.A0D(parcel, this.A00.A04(), 2, false);
        C26293Cx2.A0D(parcel, this.A01.A04(), 3, false);
        C26293Cx2.A0D(parcel, this.A02.A04(), 4, false);
        C26293Cx2.A0G(parcel, this.A03, 5);
        C26293Cx2.A05(parcel, A002);
    }
}
