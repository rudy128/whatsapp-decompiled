package X;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.BdW  reason: case insensitive filesystem */
public class C23220BdW extends C23221BdX {
    public static final Parcelable.Creator CREATOR = new Object();
    public final Parcel A00;
    public final C23105BbK A01;
    public final String A02;
    public final int A03;

    public static final void A01(Object obj, StringBuilder sb, int i) {
        String str;
        byte[] bArr;
        int i2;
        switch (i) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                sb.append(obj);
                return;
            case 7:
                sb.append("\"");
                C18210vx.A00(obj);
                str = C197459wj.A00(obj.toString());
                break;
            case 8:
                sb.append("\"");
                bArr = (byte[]) obj;
                i2 = 0;
                break;
            case 9:
                sb.append("\"");
                bArr = (byte[]) obj;
                i2 = 10;
                break;
            case 10:
                C18210vx.A00(obj);
                CB0.A00(sb, (HashMap) obj);
                return;
            case 11:
                throw AnonymousClass000.A0k("Method does not accept concrete type.");
            default:
                throw AnonymousClass001.A13("Unknown type = ", AnonymousClass000.A10(), i);
        }
        if (bArr == null) {
            str = null;
        } else {
            str = Base64.encodeToString(bArr, i2);
        }
        sb.append(str);
        sb.append("\"");
    }

    public final String toString() {
        C23105BbK bbK = this.A01;
        C18210vx.A02(bbK, "Cannot convert to JSON on client side.");
        Parcel parcel = this.A00;
        parcel.setDataPosition(0);
        StringBuilder A0t = BE6.A0t(100);
        String str = this.A02;
        C18210vx.A00(str);
        Map map = (Map) bbK.A02.get(str);
        C18210vx.A00(map);
        A00(parcel, A0t, map);
        return A0t.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A012 = C26293Cx2.A01(parcel, this.A03);
        Parcel parcel2 = this.A00;
        if (parcel2 != null) {
            int A022 = C26293Cx2.A02(parcel, 2);
            parcel.appendFrom(parcel2, 0, parcel2.dataSize());
            C26293Cx2.A05(parcel, A022);
        }
        C26293Cx2.A09(parcel, this.A01, 3, i, false);
        C26293Cx2.A05(parcel, A012);
    }

    public C23220BdW(Parcel parcel, C23105BbK bbK, int i) {
        String str;
        this.A03 = i;
        C18210vx.A00(parcel);
        this.A00 = parcel;
        this.A01 = bbK;
        if (bbK == null) {
            str = null;
        } else {
            str = bbK.A01;
        }
        this.A02 = str;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x036d, code lost:
        r0 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x037a, code lost:
        r4.append(r0);
        r4.append("\"");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:172:0x03fd, code lost:
        r4.append(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:173:0x0401, code lost:
        r7 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00ff, code lost:
        r7 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0112, code lost:
        r11 = X.C25821CmY.A02(r10, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0118, code lost:
        if (r10.A08 == false) goto L_0x0139;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x011a, code lost:
        r11 = (java.util.AbstractList) r11;
        r4.append("[");
        r9 = r11.size();
        r7 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0126, code lost:
        if (r7 >= r9) goto L_0x0413;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0128, code lost:
        if (r7 == 0) goto L_0x012d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x012a, code lost:
        r4.append(",");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x012d, code lost:
        A01(r11.get(r7), r4, r10.A01);
        r7 = r7 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0139, code lost:
        A01(r11, r4, r10.A01);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void A00(android.os.Parcel r18, java.lang.StringBuilder r19, java.util.Map r20) {
        /*
            r17 = this;
            android.util.SparseArray r6 = X.BE6.A0Q()
            java.util.Iterator r2 = X.AnonymousClass000.A15(r20)
        L_0x0008:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x001e
            java.util.Map$Entry r1 = X.AnonymousClass000.A16(r2)
            java.lang.Object r0 = r1.getValue()
            X.Bcq r0 = (X.C23196Bcq) r0
            int r0 = r0.A03
            r6.put(r0, r1)
            goto L_0x0008
        L_0x001e:
            r0 = 123(0x7b, float:1.72E-43)
            r4 = r19
            r4.append(r0)
            r2 = r18
            int r3 = X.C26300CxD.A02(r2)
            r5 = 0
            r9 = 0
        L_0x002d:
            int r0 = r2.dataPosition()
            if (r0 >= r3) goto L_0x0429
            int r1 = r2.readInt()
            char r0 = (char) r1
            java.lang.Object r7 = r6.get(r0)
            java.util.Map$Entry r7 = (java.util.Map.Entry) r7
            if (r7 == 0) goto L_0x002d
            java.lang.String r8 = ","
            if (r9 == 0) goto L_0x0047
            r4.append(r8)
        L_0x0047:
            java.lang.String r0 = X.C17880vN.A0x(r7)
            java.lang.Object r10 = r7.getValue()
            X.Bcq r10 = (X.C23196Bcq) r10
            java.lang.String r11 = "\""
            r4.append(r11)
            r4.append(r0)
            java.lang.String r0 = "\":"
            r4.append(r0)
            X.E1p r0 = r10.A04
            if (r0 == 0) goto L_0x0140
            int r7 = r10.A02
            switch(r7) {
                case 0: goto L_0x010a;
                case 1: goto L_0x00e7;
                case 2: goto L_0x0101;
                case 3: goto L_0x00de;
                case 4: goto L_0x00d5;
                case 5: goto L_0x00b4;
                case 6: goto L_0x0072;
                case 7: goto L_0x00af;
                case 8: goto L_0x00aa;
                case 9: goto L_0x00aa;
                case 10: goto L_0x0080;
                case 11: goto L_0x041b;
                default: goto L_0x0067;
            }
        L_0x0067:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "Unknown field out type = "
            java.lang.IllegalArgumentException r1 = X.AnonymousClass001.A13(r0, r1, r7)
            throw r1
        L_0x0072:
            int r0 = X.C26300CxD.A03(r2, r1)
            boolean r0 = X.AnonymousClass000.A1O(r0)
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r0)
            goto L_0x0112
        L_0x0080:
            android.os.Bundle r11 = X.C26300CxD.A08(r2, r1)
            java.util.HashMap r9 = X.C17880vN.A11()
            java.util.Set r0 = r11.keySet()
            java.util.Iterator r7 = r0.iterator()
        L_0x0090:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x00a5
            java.lang.String r1 = X.C17880vN.A0v(r7)
            java.lang.String r0 = r11.getString(r1)
            X.C18210vx.A00(r0)
            r9.put(r1, r0)
            goto L_0x0090
        L_0x00a5:
            java.lang.Object r11 = X.C25821CmY.A02(r10, r9)
            goto L_0x0116
        L_0x00aa:
            byte[] r7 = X.C26300CxD.A0O(r2, r1)
            goto L_0x0112
        L_0x00af:
            java.lang.String r7 = X.C26300CxD.A0D(r2, r1)
            goto L_0x0112
        L_0x00b4:
            int r9 = X.C26300CxD.A04(r2, r1)
            int r0 = r2.dataPosition()
            if (r9 == 0) goto L_0x00ff
            byte[] r7 = r2.createByteArray()
            int r1 = r2.readInt()
            int r0 = r0 + r9
            r2.setDataPosition(r0)
            java.math.BigInteger r0 = new java.math.BigInteger
            r0.<init>(r7)
            java.math.BigDecimal r7 = new java.math.BigDecimal
            r7.<init>(r0, r1)
            goto L_0x0112
        L_0x00d5:
            double r0 = X.C26300CxD.A00(r2, r1)
            java.lang.Double r7 = java.lang.Double.valueOf(r0)
            goto L_0x0112
        L_0x00de:
            float r0 = X.C26300CxD.A01(r2, r1)
            java.lang.Float r7 = java.lang.Float.valueOf(r0)
            goto L_0x0112
        L_0x00e7:
            int r7 = X.C26300CxD.A04(r2, r1)
            int r1 = r2.dataPosition()
            if (r7 == 0) goto L_0x00ff
            byte[] r0 = r2.createByteArray()
            int r1 = r1 + r7
            r2.setDataPosition(r1)
            java.math.BigInteger r7 = new java.math.BigInteger
            r7.<init>(r0)
            goto L_0x0112
        L_0x00ff:
            r7 = 0
            goto L_0x0112
        L_0x0101:
            long r0 = X.C26300CxD.A07(r2, r1)
            java.lang.Long r7 = java.lang.Long.valueOf(r0)
            goto L_0x0112
        L_0x010a:
            int r0 = X.C26300CxD.A03(r2, r1)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r0)
        L_0x0112:
            java.lang.Object r11 = X.C25821CmY.A02(r10, r7)
        L_0x0116:
            boolean r0 = r10.A08
            if (r0 == 0) goto L_0x0139
            java.util.AbstractList r11 = (java.util.AbstractList) r11
            java.lang.String r0 = "["
            r4.append(r0)
            int r9 = r11.size()
            r7 = 0
        L_0x0126:
            if (r7 >= r9) goto L_0x0413
            if (r7 == 0) goto L_0x012d
            r4.append(r8)
        L_0x012d:
            int r1 = r10.A01
            java.lang.Object r0 = r11.get(r7)
            A01(r0, r4, r1)
            int r7 = r7 + 1
            goto L_0x0126
        L_0x0139:
            int r0 = r10.A01
            A01(r11, r4, r0)
            goto L_0x0418
        L_0x0140:
            boolean r0 = r10.A09
            r9 = r17
            if (r0 == 0) goto L_0x02f6
            java.lang.String r0 = "["
            r4.append(r0)
            int r0 = r10.A02
            switch(r0) {
                case 0: goto L_0x0172;
                case 1: goto L_0x02be;
                case 2: goto L_0x0299;
                case 3: goto L_0x0274;
                case 4: goto L_0x024f;
                case 5: goto L_0x020e;
                case 6: goto L_0x01e9;
                case 7: goto L_0x0157;
                case 8: goto L_0x0422;
                case 9: goto L_0x0422;
                case 10: goto L_0x0422;
                case 11: goto L_0x0187;
                default: goto L_0x0150;
            }
        L_0x0150:
            java.lang.String r0 = "Unknown field type out."
            java.lang.IllegalStateException r1 = X.AnonymousClass000.A0n(r0)
            throw r1
        L_0x0157:
            java.lang.String[] r9 = X.C26300CxD.A0S(r2, r1)
            int r7 = r9.length
            r1 = 0
        L_0x015d:
            if (r1 >= r7) goto L_0x0413
            if (r1 == 0) goto L_0x0164
            r4.append(r8)
        L_0x0164:
            r4.append(r11)
            r0 = r9[r1]
            r4.append(r0)
            r4.append(r11)
            int r1 = r1 + 1
            goto L_0x015d
        L_0x0172:
            int[] r9 = X.C26300CxD.A0Q(r2, r1)
            int r7 = r9.length
            r1 = 0
        L_0x0178:
            if (r1 >= r7) goto L_0x0413
            if (r1 == 0) goto L_0x017f
            r4.append(r8)
        L_0x017f:
            r0 = r9[r1]
            r4.append(r0)
            int r1 = r1 + 1
            goto L_0x0178
        L_0x0187:
            int r16 = X.C26300CxD.A04(r2, r1)
            int r15 = r2.dataPosition()
            r14 = 0
            if (r16 == 0) goto L_0x01be
            int r13 = r2.readInt()
            android.os.Parcel[] r12 = new android.os.Parcel[r13]
            r11 = 0
        L_0x0199:
            if (r11 >= r13) goto L_0x01b8
            int r7 = r2.readInt()
            if (r7 == 0) goto L_0x01b5
            int r1 = r2.dataPosition()
            android.os.Parcel r0 = android.os.Parcel.obtain()
            r0.appendFrom(r2, r1, r7)
            r12[r11] = r0
            int r1 = r1 + r7
            r2.setDataPosition(r1)
        L_0x01b2:
            int r11 = r11 + 1
            goto L_0x0199
        L_0x01b5:
            r12[r11] = r14
            goto L_0x01b2
        L_0x01b8:
            int r15 = r15 + r16
            r2.setDataPosition(r15)
            r14 = r12
        L_0x01be:
            int r11 = r14.length
            r7 = 0
        L_0x01c0:
            if (r7 >= r11) goto L_0x0413
            if (r7 <= 0) goto L_0x01c7
            r4.append(r8)
        L_0x01c7:
            r0 = r14[r7]
            r0.setDataPosition(r5)
            java.lang.String r1 = r10.A07
            X.C18210vx.A00(r1)
            X.BbK r0 = r10.A00
            X.C18210vx.A00(r0)
            java.util.HashMap r0 = r0.A02
            java.lang.Object r1 = r0.get(r1)
            java.util.Map r1 = (java.util.Map) r1
            X.C18210vx.A00(r1)
            r0 = r14[r7]
            r9.A00(r0, r4, r1)
            int r7 = r7 + 1
            goto L_0x01c0
        L_0x01e9:
            int r1 = X.C26300CxD.A04(r2, r1)
            int r0 = r2.dataPosition()
            if (r1 != 0) goto L_0x0205
            r9 = 0
        L_0x01f4:
            int r7 = r9.length
            r1 = 0
        L_0x01f6:
            if (r1 >= r7) goto L_0x0413
            if (r1 == 0) goto L_0x01fd
            r4.append(r8)
        L_0x01fd:
            boolean r0 = r9[r1]
            r4.append(r0)
            int r1 = r1 + 1
            goto L_0x01f6
        L_0x0205:
            boolean[] r9 = r2.createBooleanArray()
            int r0 = r0 + r1
            r2.setDataPosition(r0)
            goto L_0x01f4
        L_0x020e:
            int r13 = X.C26300CxD.A04(r2, r1)
            int r12 = r2.dataPosition()
            if (r13 != 0) goto L_0x022a
            r11 = 0
        L_0x0219:
            int r7 = r11.length
            r1 = 0
        L_0x021b:
            if (r1 >= r7) goto L_0x0413
            if (r1 == 0) goto L_0x0222
            r4.append(r8)
        L_0x0222:
            r0 = r11[r1]
            r4.append(r0)
            int r1 = r1 + 1
            goto L_0x021b
        L_0x022a:
            int r10 = r2.readInt()
            java.math.BigDecimal[] r11 = new java.math.BigDecimal[r10]
            r9 = 0
        L_0x0231:
            if (r9 >= r10) goto L_0x024a
            byte[] r0 = r2.createByteArray()
            int r7 = r2.readInt()
            java.math.BigInteger r1 = new java.math.BigInteger
            r1.<init>(r0)
            java.math.BigDecimal r0 = new java.math.BigDecimal
            r0.<init>(r1, r7)
            r11[r9] = r0
            int r9 = r9 + 1
            goto L_0x0231
        L_0x024a:
            int r12 = r12 + r13
            r2.setDataPosition(r12)
            goto L_0x0219
        L_0x024f:
            int r1 = X.C26300CxD.A04(r2, r1)
            int r0 = r2.dataPosition()
            if (r1 != 0) goto L_0x026b
            r10 = 0
        L_0x025a:
            int r9 = r10.length
            r7 = 0
        L_0x025c:
            if (r7 >= r9) goto L_0x0413
            if (r7 == 0) goto L_0x0263
            r4.append(r8)
        L_0x0263:
            r0 = r10[r7]
            r4.append(r0)
            int r7 = r7 + 1
            goto L_0x025c
        L_0x026b:
            double[] r10 = r2.createDoubleArray()
            int r0 = r0 + r1
            r2.setDataPosition(r0)
            goto L_0x025a
        L_0x0274:
            int r1 = X.C26300CxD.A04(r2, r1)
            int r0 = r2.dataPosition()
            if (r1 != 0) goto L_0x0290
            r9 = 0
        L_0x027f:
            int r7 = r9.length
            r1 = 0
        L_0x0281:
            if (r1 >= r7) goto L_0x0413
            if (r1 == 0) goto L_0x0288
            r4.append(r8)
        L_0x0288:
            r0 = r9[r1]
            r4.append(r0)
            int r1 = r1 + 1
            goto L_0x0281
        L_0x0290:
            float[] r9 = r2.createFloatArray()
            int r0 = r0 + r1
            r2.setDataPosition(r0)
            goto L_0x027f
        L_0x0299:
            int r1 = X.C26300CxD.A04(r2, r1)
            int r0 = r2.dataPosition()
            if (r1 != 0) goto L_0x02b5
            r10 = 0
        L_0x02a4:
            int r9 = r10.length
            r7 = 0
        L_0x02a6:
            if (r7 >= r9) goto L_0x0413
            if (r7 == 0) goto L_0x02ad
            r4.append(r8)
        L_0x02ad:
            r0 = r10[r7]
            r4.append(r0)
            int r7 = r7 + 1
            goto L_0x02a6
        L_0x02b5:
            long[] r10 = r2.createLongArray()
            int r0 = r0 + r1
            r2.setDataPosition(r0)
            goto L_0x02a4
        L_0x02be:
            int r12 = X.C26300CxD.A04(r2, r1)
            int r11 = r2.dataPosition()
            if (r12 != 0) goto L_0x02da
            r10 = 0
        L_0x02c9:
            int r7 = r10.length
            r1 = 0
        L_0x02cb:
            if (r1 >= r7) goto L_0x0413
            if (r1 == 0) goto L_0x02d2
            r4.append(r8)
        L_0x02d2:
            r0 = r10[r1]
            r4.append(r0)
            int r1 = r1 + 1
            goto L_0x02cb
        L_0x02da:
            int r9 = r2.readInt()
            java.math.BigInteger[] r10 = new java.math.BigInteger[r9]
            r7 = 0
        L_0x02e1:
            if (r7 >= r9) goto L_0x02f1
            byte[] r1 = r2.createByteArray()
            java.math.BigInteger r0 = new java.math.BigInteger
            r0.<init>(r1)
            r10[r7] = r0
            int r7 = r7 + 1
            goto L_0x02e1
        L_0x02f1:
            int r11 = r11 + r12
            r2.setDataPosition(r11)
            goto L_0x02c9
        L_0x02f6:
            int r0 = r10.A02
            switch(r0) {
                case 0: goto L_0x040b;
                case 1: goto L_0x03e6;
                case 2: goto L_0x0403;
                case 3: goto L_0x03de;
                case 4: goto L_0x03d6;
                case 5: goto L_0x03b5;
                case 6: goto L_0x0302;
                case 7: goto L_0x036f;
                case 8: goto L_0x035f;
                case 9: goto L_0x034f;
                case 10: goto L_0x030f;
                case 11: goto L_0x0382;
                default: goto L_0x02fb;
            }
        L_0x02fb:
            java.lang.String r0 = "Unknown field type out"
            java.lang.IllegalStateException r1 = X.AnonymousClass000.A0n(r0)
            throw r1
        L_0x0302:
            int r0 = X.C26300CxD.A03(r2, r1)
            boolean r0 = X.AnonymousClass000.A1O(r0)
            r4.append(r0)
            goto L_0x0418
        L_0x030f:
            android.os.Bundle r10 = X.C26300CxD.A08(r2, r1)
            java.util.Set r1 = r10.keySet()
            java.lang.String r0 = "{"
            r4.append(r0)
            java.util.Iterator r9 = r1.iterator()
            r7 = 1
        L_0x0321:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x034b
            java.lang.String r1 = X.C17880vN.A0v(r9)
            if (r7 != 0) goto L_0x0330
            r4.append(r8)
        L_0x0330:
            r4.append(r11)
            r4.append(r1)
            java.lang.String r0 = "\":\""
            r4.append(r0)
            java.lang.String r0 = r10.getString(r1)
            java.lang.String r0 = X.C197459wj.A00(r0)
            r4.append(r0)
            r4.append(r11)
            r7 = 0
            goto L_0x0321
        L_0x034b:
            java.lang.String r0 = "}"
            goto L_0x0415
        L_0x034f:
            byte[] r1 = X.C26300CxD.A0O(r2, r1)
            r4.append(r11)
            if (r1 == 0) goto L_0x036d
            r0 = 10
            java.lang.String r0 = android.util.Base64.encodeToString(r1, r0)
            goto L_0x037a
        L_0x035f:
            byte[] r0 = X.C26300CxD.A0O(r2, r1)
            r4.append(r11)
            if (r0 == 0) goto L_0x036d
            java.lang.String r0 = android.util.Base64.encodeToString(r0, r5)
            goto L_0x037a
        L_0x036d:
            r0 = 0
            goto L_0x037a
        L_0x036f:
            java.lang.String r0 = X.C26300CxD.A0D(r2, r1)
            r4.append(r11)
            java.lang.String r0 = X.C197459wj.A00(r0)
        L_0x037a:
            r4.append(r0)
            r4.append(r11)
            goto L_0x0418
        L_0x0382:
            int r1 = X.C26300CxD.A04(r2, r1)
            int r0 = r2.dataPosition()
            if (r1 != 0) goto L_0x03a9
            r7 = 0
        L_0x038d:
            r7.setDataPosition(r5)
            java.lang.String r1 = r10.A07
            X.C18210vx.A00(r1)
            X.BbK r0 = r10.A00
            X.C18210vx.A00(r0)
            java.util.HashMap r0 = r0.A02
            java.lang.Object r0 = r0.get(r1)
            java.util.Map r0 = (java.util.Map) r0
            X.C18210vx.A00(r0)
            r9.A00(r7, r4, r0)
            goto L_0x0418
        L_0x03a9:
            android.os.Parcel r7 = android.os.Parcel.obtain()
            r7.appendFrom(r2, r0, r1)
            int r0 = r0 + r1
            r2.setDataPosition(r0)
            goto L_0x038d
        L_0x03b5:
            int r8 = X.C26300CxD.A04(r2, r1)
            int r0 = r2.dataPosition()
            if (r8 == 0) goto L_0x0401
            byte[] r7 = r2.createByteArray()
            int r1 = r2.readInt()
            int r0 = r0 + r8
            r2.setDataPosition(r0)
            java.math.BigInteger r0 = new java.math.BigInteger
            r0.<init>(r7)
            java.math.BigDecimal r7 = new java.math.BigDecimal
            r7.<init>(r0, r1)
            goto L_0x03fd
        L_0x03d6:
            double r0 = X.C26300CxD.A00(r2, r1)
            r4.append(r0)
            goto L_0x0418
        L_0x03de:
            float r0 = X.C26300CxD.A01(r2, r1)
            r4.append(r0)
            goto L_0x0418
        L_0x03e6:
            int r7 = X.C26300CxD.A04(r2, r1)
            int r1 = r2.dataPosition()
            if (r7 == 0) goto L_0x0401
            byte[] r0 = r2.createByteArray()
            int r1 = r1 + r7
            r2.setDataPosition(r1)
            java.math.BigInteger r7 = new java.math.BigInteger
            r7.<init>(r0)
        L_0x03fd:
            r4.append(r7)
            goto L_0x0418
        L_0x0401:
            r7 = 0
            goto L_0x03fd
        L_0x0403:
            long r0 = X.C26300CxD.A07(r2, r1)
            r4.append(r0)
            goto L_0x0418
        L_0x040b:
            int r0 = X.C26300CxD.A03(r2, r1)
            r4.append(r0)
            goto L_0x0418
        L_0x0413:
            java.lang.String r0 = "]"
        L_0x0415:
            r4.append(r0)
        L_0x0418:
            r9 = 1
            goto L_0x002d
        L_0x041b:
            java.lang.String r0 = "Method does not accept concrete type."
            java.lang.IllegalArgumentException r1 = X.AnonymousClass000.A0k(r0)
            throw r1
        L_0x0422:
            java.lang.String r0 = "List of type BASE64, BASE64_URL_SAFE, or STRING_MAP is not supported"
            java.lang.UnsupportedOperationException r1 = X.BE6.A0v(r0)
            throw r1
        L_0x0429:
            int r0 = r2.dataPosition()
            if (r0 != r3) goto L_0x0435
            r0 = 125(0x7d, float:1.75E-43)
            r4.append(r0)
            return
        L_0x0435:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "Overread allowed size end="
            java.lang.String r0 = X.AnonymousClass001.A1I(r0, r1, r3)
            X.DZn r1 = new X.DZn
            r1.<init>(r2, r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C23220BdW.A00(android.os.Parcel, java.lang.StringBuilder, java.util.Map):void");
    }
}
