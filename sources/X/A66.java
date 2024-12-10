package X;

import com.whatsapp.util.Log;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;
import javax.crypto.SecretKey;

public final class A66 {
    public static final A66 A00 = new Object();

    public final C165328ax A02(C83084Dt r12, C83104Dv r13, String str, List list, int i) {
        SecretKey secretKey;
        Charset charset;
        int i2;
        byte[] bArr;
        byte[] bArr2;
        int i3;
        String str2;
        int i4;
        byte[] bArr3;
        String str3;
        int i5;
        char[] cArr;
        C18070vi.A0d(str, 0);
        C23624Bmt A08 = AnonymousClass8BS.A08(C165328ax.DEFAULT_INSTANCE);
        C165328ax r1 = (C165328ax) A08.A00;
        r1.encoding_ = r12.value;
        r1.bitField0_ |= 1;
        C165328ax r14 = (C165328ax) C17880vN.A0G(A08);
        r14.transformer_ = r13.value;
        r14.bitField0_ |= 2;
        C23581BmB A0F = AnonymousClass8BR.A0F(C108975cc.A1O(str), 0);
        int ordinal = r13.ordinal();
        if (ordinal == 1) {
            C83084Dt r15 = C83084Dt.UTF8_BROKEN;
            A66 a66 = A00;
            if (r12 == r15) {
                AnonymousClass1D6 A002 = a66.A00(list);
                i5 = C108955ca.A09(A002);
                byte[] A1P = AnonymousClass8BS.A1P(A0F);
                bArr3 = ((DSQ) A002.first).A06();
                i4 = i * 8;
                str3 = "PBKDF2WithHmacSHA512";
                int length = A1P.length;
                cArr = new char[length];
                for (int i6 = 0; i6 < length; i6++) {
                    cArr[i6] = (char) A1P[i6];
                }
                secretKey = C17970vW.A08(str3, bArr3, cArr, i5, i4);
                A0F = AnonymousClass8BR.A0F(secretKey.getEncoded(), 0);
            } else {
                charset = StandardCharsets.UTF_8;
                C18070vi.A0Z(charset);
                AnonymousClass1D6 A003 = a66.A00(list);
                i2 = C108955ca.A09(A003);
                bArr = AnonymousClass8BS.A1P(A0F);
                bArr2 = ((DSQ) A003.first).A06();
                i3 = i * 8;
                Boolean bool = C17970vW.A01;
                str2 = "PBKDF2WithHmacSHA512";
                secretKey = C17970vW.A08(str2, bArr2, new String(bArr, charset).toCharArray(), i2, i3);
                A0F = AnonymousClass8BR.A0F(secretKey.getEncoded(), 0);
            }
        } else if (ordinal == 2) {
            C83084Dt r16 = C83084Dt.UTF8_BROKEN;
            A66 a662 = A00;
            if (r12 == r16) {
                AnonymousClass1D6 A004 = a662.A00(list);
                i5 = C108955ca.A09(A004);
                byte[] A1P2 = AnonymousClass8BS.A1P(A0F);
                bArr3 = ((DSQ) A004.first).A06();
                i4 = i * 8;
                str3 = "PBKDF2WithHmacSHA384";
                int length2 = A1P2.length;
                cArr = new char[length2];
                for (int i7 = 0; i7 < length2; i7++) {
                    cArr[i7] = (char) A1P2[i7];
                }
                secretKey = C17970vW.A08(str3, bArr3, cArr, i5, i4);
                A0F = AnonymousClass8BR.A0F(secretKey.getEncoded(), 0);
            } else {
                charset = StandardCharsets.UTF_8;
                C18070vi.A0Z(charset);
                AnonymousClass1D6 A005 = a662.A00(list);
                i2 = C108955ca.A09(A005);
                bArr = AnonymousClass8BS.A1P(A0F);
                bArr2 = ((DSQ) A005.first).A06();
                i3 = i * 8;
                Boolean bool2 = C17970vW.A01;
                str2 = "PBKDF2WithHmacSHA384";
                secretKey = C17970vW.A08(str2, bArr2, new String(bArr, charset).toCharArray(), i2, i3);
                A0F = AnonymousClass8BR.A0F(secretKey.getEncoded(), 0);
            }
        } else if (ordinal != 0) {
            Log.i("UserPasscodeUtil/Transformer.transform: Unknown Transformer");
            A0F = null;
        }
        C165328ax r17 = (C165328ax) C17880vN.A0G(A08);
        A0F.getClass();
        r17.bitField0_ |= 4;
        r17.transformedData_ = A0F;
        C165328ax r3 = (C165328ax) C17880vN.A0G(A08);
        EE9 ee9 = r3.transformerArg_;
        if (!((C27296DbR) ee9).A00) {
            ee9 = C23577Bm6.A09(ee9);
            r3.transformerArg_ = ee9;
        }
        DND.A09(list, ee9);
        return (C165328ax) A08.A0C();
    }

    public static void A01(C23624Bmt bmt, C164498Zb r3, String str, List list) {
        C164508Zc r1 = (C164508Zc) bmt.A00;
        r1.bitField0_ |= 1;
        r1.key_ = str;
        bmt.A0E();
        C164508Zc r12 = (C164508Zc) bmt.A00;
        r3.getClass();
        r12.value_ = r3;
        r12.bitField0_ |= 2;
        list.add(bmt.A0C());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0036, code lost:
        if (r4 == null) goto L_0x0038;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final X.AnonymousClass1D6 A00(java.util.List r7) {
        /*
            r6 = this;
            int r0 = X.C200510q.A00(r7)
            java.util.LinkedHashMap r3 = new java.util.LinkedHashMap
            r3.<init>(r0)
            java.util.Iterator r2 = r7.iterator()
        L_0x000d:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0025
            java.lang.Object r0 = r2.next()
            X.8Zc r0 = (X.C164508Zc) r0
            java.lang.String r1 = r0.key_
            X.8Zb r0 = r0.value_
            if (r0 != 0) goto L_0x0021
            X.8Zb r0 = X.C164498Zb.DEFAULT_INSTANCE
        L_0x0021:
            r3.put(r1, r0)
            goto L_0x000d
        L_0x0025:
            java.lang.String r5 = "salt"
            java.lang.Object r2 = r3.get(r5)
            X.8Zb r2 = (X.C164498Zb) r2
            if (r2 == 0) goto L_0x0038
            int r1 = r2.valueCase_
            r0 = 1
            if (r1 != r0) goto L_0x00a9
            java.lang.Object r4 = r2.value_
        L_0x0036:
            if (r4 != 0) goto L_0x0064
        L_0x0038:
            byte[] r2 = X.AnonymousClass8BX.A1Z()
            r1 = 0
            r0 = 16
            X.BmB r4 = X.DSQ.A01(r2, r1, r0)
            X.8Zb r0 = X.C164498Zb.DEFAULT_INSTANCE
            X.Bmt r2 = X.AnonymousClass8BS.A08(r0)
            X.Bm6 r1 = r2.A00
            X.8Zb r1 = (X.C164498Zb) r1
            r0 = 1
            r1.valueCase_ = r0
            r1.value_ = r4
            X.Bm6 r1 = r2.A0C()
            X.8Zb r1 = (X.C164498Zb) r1
            X.8Zc r0 = X.C164508Zc.DEFAULT_INSTANCE
            X.Bmt r0 = X.AnonymousClass8BS.A08(r0)
            A01(r0, r1, r5, r7)
            X.C18070vi.A0b(r4)
        L_0x0064:
            java.lang.String r5 = "iterations"
            java.lang.Object r2 = r3.get(r5)
            X.8Zb r2 = (X.C164498Zb) r2
            if (r2 == 0) goto L_0x0080
            int r1 = r2.valueCase_
            r0 = 2
            if (r1 != r0) goto L_0x007e
            java.lang.Object r0 = r2.value_
            int r0 = X.AnonymousClass000.A0M(r0)
        L_0x0079:
            X.1D6 r0 = X.AnonymousClass1D6.A00(r4, r0)
            return r0
        L_0x007e:
            r0 = 0
            goto L_0x0079
        L_0x0080:
            X.8Zb r0 = X.C164498Zb.DEFAULT_INSTANCE
            X.Bmt r3 = r0.A0N()
            r2 = 10000(0x2710, float:1.4013E-41)
            X.Bm6 r1 = X.C17880vN.A0G(r3)
            X.8Zb r1 = (X.C164498Zb) r1
            r0 = 2
            r1.valueCase_ = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            r1.value_ = r0
            X.Bm6 r1 = r3.A0C()
            X.8Zb r1 = (X.C164498Zb) r1
            X.8Zc r0 = X.C164508Zc.DEFAULT_INSTANCE
            X.Bmt r0 = X.AnonymousClass8BS.A08(r0)
            A01(r0, r1, r5, r7)
            r0 = 10000(0x2710, float:1.4013E-41)
            goto L_0x0079
        L_0x00a9:
            X.DSQ r4 = X.DSQ.A00
            goto L_0x0036
        */
        throw new UnsupportedOperationException("Method not decompiled: X.A66.A00(java.util.List):X.1D6");
    }
}
