package X;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.7I5  reason: invalid class name */
public class AnonymousClass7I5 implements C1606989o {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final Object A06;
    public final String A07;

    public AnonymousClass7I5(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, String str, int i) {
        this.A00 = i;
        this.A02 = obj3;
        this.A04 = obj5;
        this.A06 = obj4;
        this.A05 = obj;
        this.A01 = obj2;
        this.A07 = str;
        this.A03 = obj6;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:226:0x056c, code lost:
        if (r7 == null) goto L_0x062a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:228:0x0572, code lost:
        r1 = r13.values();
        r7 = X.C29351c6.A0D(r1);
        r10 = r1.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:230:0x0583, code lost:
        if (r10.hasNext() == false) goto L_0x0591;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:231:0x0585, code lost:
        r7.add(((X.C136346tf) r10.next()).A05);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:232:0x0591, code lost:
        r10 = X.C29431cG.A0t(X.C29431cG.A11(r7));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:233:0x059e, code lost:
        if (r10.size() != 1) goto L_0x0642;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:234:0x05a0, code lost:
        r19 = X.C17880vN.A0w(r10, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:235:0x05a4, code lost:
        if (r19 == null) goto L_0x063a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:237:0x05a8, code lost:
        if ((r6 instanceof X.AnonymousClass210) != false) goto L_0x05ac;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:238:0x05aa, code lost:
        r11 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:239:0x05ac, code lost:
        r6 = r2.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:241:0x05b4, code lost:
        if (r6.hasNext() == false) goto L_0x0632;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:242:0x05b6, code lost:
        r11 = ((X.C136346tf) r6.next()).A04;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:243:0x05be, code lost:
        if (r11 == null) goto L_0x05b0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:245:0x05ca, code lost:
        if (r5.A00.A0a(r11).exists() == false) goto L_0x05b0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:246:0x05cc, code lost:
        r16 = r2.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:247:0x05d0, code lost:
        r10 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:248:0x05d5, code lost:
        if (r16.hasNext() == false) goto L_0x0614;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:249:0x05d7, code lost:
        r7 = r16.next();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:250:0x05e7, code lost:
        if (r5.A02.A00(((X.C136346tf) r7).A03, true) == null) goto L_0x05d0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:251:0x05e9, code lost:
        r7 = (X.C136346tf) r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:252:0x05eb, code lost:
        if (r7 == null) goto L_0x05ef;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:253:0x05ed, code lost:
        r10 = r7.A03;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:254:0x05ef, code lost:
        r2 = X.C108995ce.A0b(r13);
        r13 = X.AnonymousClass000.A15(r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:256:0x05fb, code lost:
        if (r13.hasNext() == false) goto L_0x0616;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:257:0x05fd, code lost:
        r1 = X.AnonymousClass000.A16(r13);
        r7 = r1.getKey();
        r6 = ((X.C136346tf) r1.getValue()).A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:258:0x060e, code lost:
        if (1 != r6) goto L_0x0652;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:259:0x0610, code lost:
        X.C17880vN.A1P(r7, r2, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:260:0x0614, code lost:
        r7 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:261:0x0616, code lost:
        r8.put(r14, new X.C136066tD(r19, r11, r10, r2, r25));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:263:0x0632, code lost:
        r2 = new X.AnonymousClass6OO("media file path not exist for text status");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:264:0x063a, code lost:
        r2 = new X.AnonymousClass6OO("empty unique id");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:265:0x0642, code lost:
        r2 = new X.AnonymousClass6OO("inconsistent uniqueId across target destinations");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:267:0x0652, code lost:
        r2 = new X.AnonymousClass6OO("invalid db data state");
     */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x02dd A[LOOP:5: B:127:0x02d7->B:129:0x02dd, LOOP_END] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void BE5(X.C138506xC r30) {
        /*
            r29 = this;
            r0 = r29
            int r1 = r0.A00
            r2 = r30
            if (r1 == 0) goto L_0x030e
            r4 = 0
            X.C18070vi.A0d(r2, r4)
            boolean r1 = X.C22781De.A03()
            r1 = r1 ^ 1
            if (r1 == 0) goto L_0x0307
            int r1 = r2.A00
            if (r1 == 0) goto L_0x0062
            java.lang.Object r9 = r0.A06
            X.6x0 r9 = (X.C138396x0) r9
            X.00H r1 = r9.A01
            java.lang.Object r3 = r1.get()
            X.6wE r3 = (X.C137916wE) r3
            X.163 r2 = r2.A04
            java.lang.String r1 = "null cannot be cast to non-null type com.whatsapp.xfamily.utils.XFamilyGraphqlErrorProcessor"
            X.C18070vi.A0z(r2, r1)
            java.lang.Object r11 = r0.A05
            X.705 r11 = (X.AnonymousClass705) r11
            java.lang.Object r6 = r0.A01
            java.lang.String r12 = r0.A07
            java.lang.Object r7 = r0.A03
            java.lang.Object r10 = r0.A02
            X.6nT r10 = (X.C132736nT) r10
            java.lang.Object r8 = r0.A04
            r13 = 4
            X.7QN r5 = new X.7QN
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13)
            X.C18070vi.A0d(r2, r4)
            int r1 = X.C108995ce.A05(r2)
            r0 = 3489014(0x353cf6, float:4.88915E-39)
            if (r1 != r0) goto L_0x005d
            java.lang.Long r0 = r11.A01()
            if (r0 == 0) goto L_0x005d
            X.10I r2 = r3.A00
            long r0 = r0.longValue()
            r2.CGv(r5, r0)
            return
        L_0x005d:
            r0 = 0
            r10.A00(r1, r0)
            return
        L_0x0062:
            X.161 r1 = r2.A03
            java.lang.Object r7 = r1.A00
            X.6sS r7 = (X.C135596sS) r7
            if (r7 != 0) goto L_0x0074
            java.lang.Object r2 = r0.A02
            X.6nT r2 = (X.C132736nT) r2
            r1 = 2
            r0 = 0
            r2.A00(r1, r0)
            return
        L_0x0074:
            X.6ts r2 = r7.A00
            java.lang.Object r4 = r0.A04
            X.7Rz r4 = (X.C147147Rz) r4
            java.util.concurrent.atomic.AtomicBoolean r3 = r4.A00
            boolean r1 = r3.get()
            r1 = r1 ^ 1
            if (r1 == 0) goto L_0x0300
            byte[] r1 = r4.A02
            r2.A01 = r1
            X.6ts r2 = r7.A00
            boolean r1 = r3.get()
            r1 = r1 ^ 1
            if (r1 == 0) goto L_0x02f9
            byte[] r1 = r4.A01
            r2.A00 = r1
            java.lang.Object r3 = r0.A02
            X.6nT r3 = (X.C132736nT) r3
            X.6oD r1 = r3.A01
            X.00H r0 = r1.A05
            java.lang.Object r0 = r0.get()
            X.6wD r0 = (X.C137906wD) r0
            r9 = 0
            r6 = 0
            X.00H r0 = r0.A00     // Catch:{ UnsupportedEncodingException -> 0x02c2, GeneralSecurityException -> 0x02bf }
            java.lang.Object r8 = r0.get()     // Catch:{ UnsupportedEncodingException -> 0x02c2, GeneralSecurityException -> 0x02bf }
            X.CUj r8 = (X.C25032CUj) r8     // Catch:{ UnsupportedEncodingException -> 0x02c2, GeneralSecurityException -> 0x02bf }
            java.lang.String r5 = r2.A02     // Catch:{ UnsupportedEncodingException -> 0x02c2, GeneralSecurityException -> 0x02bf }
            java.lang.String[] r4 = X.C17880vN.A1Y()     // Catch:{ UnsupportedEncodingException -> 0x02c2, GeneralSecurityException -> 0x02bf }
            java.lang.String r0 = "CN=Facebook Purpose Encryption Signature"
            r4[r9] = r0     // Catch:{ UnsupportedEncodingException -> 0x02c2, GeneralSecurityException -> 0x02bf }
            java.security.cert.X509Certificate r4 = r8.A00(r5, r4)     // Catch:{ UnsupportedEncodingException -> 0x02c2, GeneralSecurityException -> 0x02bf }
            java.lang.String r0 = "SHA256withRSA"
            java.security.Signature r5 = java.security.Signature.getInstance(r0)     // Catch:{ UnsupportedEncodingException -> 0x02c2, GeneralSecurityException -> 0x02bf }
            java.security.PublicKey r0 = r4.getPublicKey()     // Catch:{ UnsupportedEncodingException -> 0x02c2, GeneralSecurityException -> 0x02bf }
            r5.initVerify(r0)     // Catch:{ UnsupportedEncodingException -> 0x02c2, GeneralSecurityException -> 0x02bf }
            byte[] r8 = r2.A07     // Catch:{ UnsupportedEncodingException -> 0x02c2, GeneralSecurityException -> 0x02bf }
            r5.update(r8)     // Catch:{ UnsupportedEncodingException -> 0x02c2, GeneralSecurityException -> 0x02bf }
            java.lang.String r4 = r2.A03     // Catch:{ UnsupportedEncodingException -> 0x02c2, GeneralSecurityException -> 0x02bf }
            r0 = 8
            byte[] r0 = android.util.Base64.decode(r4, r0)     // Catch:{ UnsupportedEncodingException -> 0x02c2, GeneralSecurityException -> 0x02bf }
            boolean r0 = r5.verify(r0)     // Catch:{ UnsupportedEncodingException -> 0x02c2, GeneralSecurityException -> 0x02bf }
            if (r0 == 0) goto L_0x02c7
            byte[] r9 = r2.A06
            byte[] r10 = r2.A01
            java.lang.String r6 = "Required value was null."
            if (r10 == 0) goto L_0x02ba
            byte[] r11 = r2.A00
            if (r11 == 0) goto L_0x02b5
            byte[] r12 = X.C137906wD.A01
            r13 = 2
            byte[] r5 = X.C26098CsI.A02(r8, r9, r10, r11, r12, r13)
            X.C18070vi.A0X(r5)
            byte[] r4 = r2.A05
            byte[] r0 = r2.A04
            byte[] r5 = X.C25892Co3.A01(r5, r4, r0)
            byte[] r4 = r2.A01
            if (r4 == 0) goto L_0x02b0
            r0 = 11
            java.lang.String r0 = android.util.Base64.encodeToString(r4, r0)
            X.C18070vi.A0X(r0)
            byte[] r0 = X.C108975cc.A1O(r0)
            boolean r0 = java.util.Arrays.equals(r0, r5)
            if (r0 == 0) goto L_0x02c7
            java.util.List r13 = r3.A03
            java.util.ArrayList r11 = X.AnonymousClass000.A13()
            java.util.ArrayList r8 = X.AnonymousClass000.A13()
            java.util.List r0 = r7.A01
            java.util.Iterator r15 = r0.iterator()
            r4 = 0
        L_0x0122:
            boolean r0 = r15.hasNext()
            if (r0 == 0) goto L_0x0167
            java.lang.Object r0 = r15.next()
            int r14 = r4 + 1
            if (r4 >= 0) goto L_0x0135
            X.AnonymousClass1ZU.A0B()
            r0 = 0
            throw r0
        L_0x0135:
            boolean r0 = X.AnonymousClass000.A1Y(r0)
            X.206 r12 = X.AnonymousClass3MW.A0k(r13, r4)
            if (r0 == 0) goto L_0x0144
            r11.add(r12)
        L_0x0142:
            r4 = r14
            goto L_0x0122
        L_0x0144:
            java.util.List r0 = r7.A02
            java.lang.Object r10 = r0.get(r4)
            X.77S r10 = (X.AnonymousClass77S) r10
            X.00H r0 = r1.A06
            java.lang.Object r9 = r0.get()
            X.72Q r9 = (X.AnonymousClass72Q) r9
            long r4 = r12.A0x
            r0 = 1
            X.C18070vi.A0d(r10, r0)
            X.7vx r6 = new X.7vx
            r6.<init>(r9, r10, r4)
            r0 = 2
            X.C20017A3j.A01(r6, r0)
            r8.add(r12)
            goto L_0x0142
        L_0x0167:
            boolean r0 = X.C17880vN.A1X(r11)
            if (r0 == 0) goto L_0x018f
            java.util.ArrayList r7 = X.C29351c6.A0E(r11)
            java.util.Iterator r4 = r11.iterator()
        L_0x0175:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x017f
            X.C108995ce.A1Q(r7, r4)
            goto L_0x0175
        L_0x017f:
            X.1KB r6 = r1.A01
            X.00H r0 = r1.A04
            java.lang.Object r5 = X.C18070vi.A0E(r0)
            X.2LI r5 = (X.AnonymousClass2LI) r5
            X.00H r4 = r1.A06
            r0 = 3
            X.AnonymousClass74B.A06(r6, r5, r4, r7, r0)
        L_0x018f:
            X.00H r0 = r1.A06
            java.lang.Object r6 = r0.get()
            X.72Q r6 = (X.AnonymousClass72Q) r6
            java.util.ArrayList r5 = X.C29351c6.A0E(r8)
            java.util.Iterator r4 = r8.iterator()
        L_0x019f:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x01a9
            X.C108995ce.A1Q(r5, r4)
            goto L_0x019f
        L_0x01a9:
            java.util.HashMap r0 = r6.A03(r5)
            java.util.LinkedHashMap r7 = X.AnonymousClass1D7.A08(r0)
            java.lang.String r6 = r3.A02
            java.util.Iterator r11 = r8.iterator()
        L_0x01b7:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L_0x029e
            X.206 r9 = X.C17880vN.A0Y(r11)
            long r4 = r9.A0x
            java.lang.Object r5 = X.C108965cb.A0n(r7, r4)
            X.6t0 r5 = (X.C135936t0) r5
            r4 = 0
            if (r5 == 0) goto L_0x029a
            X.77S r0 = r5.A02
            if (r0 == 0) goto L_0x029a
            java.lang.String r5 = r5.A04
            r10 = 1
            if (r5 == 0) goto L_0x01b7
            int r0 = r5.length()
            if (r0 == 0) goto L_0x01b7
            X.00H r0 = r1.A03
            java.lang.Object r0 = r0.get()
            X.6mr r0 = (X.C132466mr) r0
            X.1SJ r0 = r0.A00
            java.lang.String r0 = r0.A00(r5, r10)
            if (r0 == 0) goto L_0x01f1
            int r0 = r0.length()
            if (r0 != 0) goto L_0x01b7
        L_0x01f1:
            boolean r0 = r9 instanceof X.AnonymousClass210
            if (r0 != 0) goto L_0x028a
            java.lang.String r2 = "XFamilyCrosspostEligibilityManager/Invalid directURL path for non-text status"
        L_0x01f7:
            r0 = 0
            X.C17960vV.A0F(r0, r2)
            boolean r0 = r7.isEmpty()
            if (r0 == 0) goto L_0x0219
            r0 = -17
        L_0x0203:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
        L_0x0207:
            X.1D6 r0 = X.AnonymousClass1D6.A01(r0, r4)
        L_0x020b:
            X.8A3 r2 = r3.A00
            int r1 = X.AnonymousClass3MZ.A04(r0)
            java.lang.Object r0 = r0.second
            java.lang.Integer r0 = (java.lang.Integer) r0
            r2.Bsm(r1, r0)
            return
        L_0x0219:
            java.util.Iterator r10 = r8.iterator()
        L_0x021d:
            boolean r0 = r10.hasNext()
            r9 = -9999(0xffffffffffffd8f1, float:NaN)
            if (r0 == 0) goto L_0x0284
            X.206 r8 = X.C17880vN.A0Y(r10)
            long r5 = r8.A0x
            java.lang.Object r5 = X.C108965cb.A0n(r7, r5)
            X.6t0 r5 = (X.C135936t0) r5
            if (r5 != 0) goto L_0x0236
            r0 = -18
            goto L_0x0203
        L_0x0236:
            X.77S r0 = r5.A02
            if (r0 != 0) goto L_0x023d
            r0 = -22
            goto L_0x0203
        L_0x023d:
            int r2 = r5.A00
            r0 = 1
            if (r2 == r0) goto L_0x024d
            r0 = -19
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            X.1D6 r0 = X.AnonymousClass1D6.A00(r0, r2)
            goto L_0x020b
        L_0x024d:
            java.lang.String r5 = r5.A04
            if (r5 == 0) goto L_0x0284
            int r0 = r5.length()
            if (r0 == 0) goto L_0x0284
            X.00H r0 = r1.A03
            java.lang.Object r0 = r0.get()
            X.6mr r0 = (X.C132466mr) r0
            X.1SJ r2 = r0.A00
            r0 = 1
            java.lang.String r0 = r2.A00(r5, r0)
            if (r0 == 0) goto L_0x026e
            int r0 = r0.length()
            if (r0 != 0) goto L_0x0284
        L_0x026e:
            boolean r0 = r8 instanceof X.AnonymousClass210
            if (r0 != 0) goto L_0x0275
            r0 = -20
            goto L_0x0203
        L_0x0275:
            X.17r r0 = r1.A00
            java.io.File r0 = r0.A0a(r5)
            boolean r0 = r0.exists()
            if (r0 != 0) goto L_0x021d
            r0 = -21
            goto L_0x0203
        L_0x0284:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r9)
            goto L_0x0207
        L_0x028a:
            X.17r r0 = r1.A00
            java.io.File r0 = r0.A0a(r5)
            boolean r0 = r0.exists()
            if (r0 != 0) goto L_0x01b7
            java.lang.String r2 = "XFamilyCrosspostEligibilityManager/Media file not exist for text status"
            goto L_0x01f7
        L_0x029a:
            java.lang.String r2 = "XFamilyCrosspostEligibilityManager/DB Data UniqueID invalid"
            goto L_0x01f7
        L_0x029e:
            X.1IX r0 = X.AnonymousClass1IX.copyOf((java.util.Collection) r8)
            X.C18070vi.A0X(r0)
            X.6sR r1 = new X.6sR
            r1.<init>(r0, r6, r7)
            X.8A3 r0 = r3.A00
            r0.C7Q(r1, r2)
            return
        L_0x02b0:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0n(r6)
            throw r0
        L_0x02b5:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0n(r6)
            throw r0
        L_0x02ba:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0n(r6)
            throw r0
        L_0x02bf:
            java.lang.String r0 = "XFamilyCrosspostPurposeEncryptionHelper/validatePurposeEncryptionParams GeneralSecurityException: Credential data cannot be validated"
            goto L_0x02c4
        L_0x02c2:
            java.lang.String r0 = "XFamilyCrosspostPurposeEncryptionHelper/validatePurposeEncryptionParams UnsupportedEncodingException: Credential data cannot be validated"
        L_0x02c4:
            X.AnonymousClass6YJ.A00(r0, r6)
        L_0x02c7:
            java.lang.String r0 = "XFamilyCrosspostEligibilityManager/generateEligibilityGraphqlCallback purpose encryption validation failed"
            r6 = 0
            X.AnonymousClass6YJ.A00(r0, r6)
            java.util.List r0 = r3.A03
            java.util.ArrayList r5 = X.C29351c6.A0E(r0)
            java.util.Iterator r2 = r0.iterator()
        L_0x02d7:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x02e1
            X.C108995ce.A1Q(r5, r2)
            goto L_0x02d7
        L_0x02e1:
            X.1KB r4 = r1.A01
            X.00H r0 = r1.A04
            java.lang.Object r2 = X.C18070vi.A0E(r0)
            X.2LI r2 = (X.AnonymousClass2LI) r2
            X.00H r1 = r1.A06
            r0 = 4
            X.AnonymousClass74B.A06(r4, r2, r1, r5, r0)
            X.8A3 r1 = r3.A00
            r0 = -14
            r1.Bsm(r0, r6)
            return
        L_0x02f9:
            java.lang.String r0 = "key has been destroyed"
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0n(r0)
            throw r0
        L_0x0300:
            java.lang.String r0 = "key has been destroyed"
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0n(r0)
            throw r0
        L_0x0307:
            java.lang.String r0 = "Check failed."
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0n(r0)
            throw r0
        L_0x030e:
            r1 = 0
            X.C18070vi.A0d(r2, r1)
            boolean r1 = X.C22781De.A03()
            r1 = r1 ^ 1
            if (r1 == 0) goto L_0x06ef
            int r1 = r2.A00
            if (r1 == 0) goto L_0x034b
            java.lang.Object r8 = r0.A06
            X.6ww r8 = (X.C138356ww) r8
            X.1lR r3 = r8.A00
            X.163 r2 = r2.A04
            java.lang.String r1 = "null cannot be cast to non-null type com.whatsapp.waffle.utils.graphql.WaffleGraphqlErrorProcessor"
            X.C18070vi.A0z(r2, r1)
            X.67A r2 = (X.AnonymousClass67A) r2
            java.lang.Object r7 = r0.A05
            X.705 r7 = (X.AnonymousClass705) r7
            java.lang.Object r5 = r0.A03
            java.lang.String r11 = r0.A07
            java.lang.Object r6 = r0.A01
            java.lang.Object r9 = r0.A04
            java.lang.Object r10 = r0.A02
            r12 = 3
            X.7QN r4 = new X.7QN
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12)
            r1 = 1
            X.7Oy r0 = new X.7Oy
            r0.<init>(r6, r1)
            r3.A00(r7, r0, r2, r4)
            return
        L_0x034b:
            X.161 r1 = r2.A03
            java.lang.Object r4 = r1.A00
            X.6tE r4 = (X.C136076tE) r4
            if (r4 != 0) goto L_0x0361
            java.lang.Object r2 = r0.A01
            X.6ns r2 = (X.C132926ns) r2
            r1 = 1
            X.6OK r0 = new X.6OK
            r0.<init>(r1)
        L_0x035d:
            r2.A00(r0)
            return
        L_0x0361:
            boolean r1 = r4.A04
            if (r1 != 0) goto L_0x036c
            java.lang.Object r2 = r0.A01
            X.6ns r2 = (X.C132926ns) r2
            X.6OL r0 = X.AnonymousClass6OL.A00
            goto L_0x035d
        L_0x036c:
            X.6tq r3 = r4.A00
            if (r3 == 0) goto L_0x0382
            java.lang.Object r2 = r0.A04
            X.7Ry r2 = (X.C147137Ry) r2
            java.util.concurrent.atomic.AtomicBoolean r1 = r2.A00
            boolean r1 = r1.get()
            r1 = r1 ^ 1
            if (r1 == 0) goto L_0x06e8
            byte[] r1 = r2.A02
            r3.A01 = r1
        L_0x0382:
            X.6tq r3 = r4.A00
            if (r3 == 0) goto L_0x0398
            java.lang.Object r2 = r0.A04
            X.7Ry r2 = (X.C147137Ry) r2
            java.util.concurrent.atomic.AtomicBoolean r1 = r2.A00
            boolean r1 = r1.get()
            r1 = r1 ^ 1
            if (r1 == 0) goto L_0x06e1
            byte[] r1 = r2.A01
            r3.A00 = r1
        L_0x0398:
            java.lang.Object r0 = r0.A01
            X.6ns r0 = (X.C132926ns) r0
            if (r3 == 0) goto L_0x06a8
            X.6oB r5 = r0.A02
            X.00H r1 = r5.A04
            java.lang.Object r1 = r1.get()
            X.6wB r1 = (X.C137886wB) r1
            r8 = 0
            X.00H r1 = r1.A00     // Catch:{ UnsupportedEncodingException -> 0x0691, GeneralSecurityException -> 0x0697 }
            java.lang.Object r7 = r1.get()     // Catch:{ UnsupportedEncodingException -> 0x0691, GeneralSecurityException -> 0x0697 }
            X.CUj r7 = (X.C25032CUj) r7     // Catch:{ UnsupportedEncodingException -> 0x0691, GeneralSecurityException -> 0x0697 }
            java.lang.String r6 = r3.A02     // Catch:{ UnsupportedEncodingException -> 0x0691, GeneralSecurityException -> 0x0697 }
            java.lang.String[] r2 = X.C17880vN.A1Y()     // Catch:{ UnsupportedEncodingException -> 0x0691, GeneralSecurityException -> 0x0697 }
            java.lang.String r1 = "CN=Facebook Purpose Encryption Signature"
            r2[r8] = r1     // Catch:{ UnsupportedEncodingException -> 0x0691, GeneralSecurityException -> 0x0697 }
            java.security.cert.X509Certificate r2 = r7.A00(r6, r2)     // Catch:{ UnsupportedEncodingException -> 0x0691, GeneralSecurityException -> 0x0697 }
            java.lang.String r1 = "SHA256withRSA"
            java.security.Signature r6 = java.security.Signature.getInstance(r1)     // Catch:{ UnsupportedEncodingException -> 0x0691, GeneralSecurityException -> 0x0697 }
            java.security.PublicKey r1 = r2.getPublicKey()     // Catch:{ UnsupportedEncodingException -> 0x0691, GeneralSecurityException -> 0x0697 }
            r6.initVerify(r1)     // Catch:{ UnsupportedEncodingException -> 0x0691, GeneralSecurityException -> 0x0697 }
            byte[] r8 = r3.A07     // Catch:{ UnsupportedEncodingException -> 0x0691, GeneralSecurityException -> 0x0697 }
            r6.update(r8)     // Catch:{ UnsupportedEncodingException -> 0x0691, GeneralSecurityException -> 0x0697 }
            java.lang.String r2 = r3.A03     // Catch:{ UnsupportedEncodingException -> 0x0691, GeneralSecurityException -> 0x0697 }
            r1 = 8
            byte[] r1 = android.util.Base64.decode(r2, r1)     // Catch:{ UnsupportedEncodingException -> 0x0691, GeneralSecurityException -> 0x0697 }
            boolean r1 = r6.verify(r1)     // Catch:{ UnsupportedEncodingException -> 0x0691, GeneralSecurityException -> 0x0697 }
            if (r1 == 0) goto L_0x06a8
            byte[] r9 = r3.A06
            byte[] r10 = r3.A01
            java.lang.String r7 = "Required value was null."
            if (r10 == 0) goto L_0x068c
            byte[] r11 = r3.A00
            if (r11 == 0) goto L_0x0687
            byte[] r12 = X.C137886wB.A01
            r13 = 2
            byte[] r6 = X.C26098CsI.A02(r8, r9, r10, r11, r12, r13)
            X.C18070vi.A0X(r6)
            byte[] r2 = r3.A05
            byte[] r1 = r3.A04
            byte[] r6 = X.C25892Co3.A01(r6, r2, r1)
            byte[] r2 = r3.A01
            if (r2 == 0) goto L_0x0682
            r1 = 11
            java.lang.String r1 = android.util.Base64.encodeToString(r2, r1)
            X.C18070vi.A0X(r1)
            byte[] r1 = X.C108975cc.A1O(r1)
            boolean r1 = java.util.Arrays.equals(r1, r6)
            if (r1 == 0) goto L_0x06a8
            java.util.List r13 = r0.A05
            java.util.List r15 = r0.A04
            java.util.ArrayList r11 = X.AnonymousClass000.A13()
            java.util.ArrayList r9 = X.AnonymousClass000.A13()
            java.util.Map r8 = r4.A03
            java.util.ArrayList r12 = X.AnonymousClass000.A13()
            java.util.Collection r1 = r8.values()
            java.lang.Object r1 = X.C29431cG.A0X(r1)
            java.util.List r1 = (java.util.List) r1
            int r7 = r1.size()
            r6 = 0
        L_0x0435:
            if (r6 >= r7) goto L_0x0459
            java.util.ArrayList r2 = X.AnonymousClass000.A13()
            java.util.Iterator r10 = X.C17890vO.A0l(r8)
        L_0x043f:
            boolean r1 = r10.hasNext()
            if (r1 == 0) goto L_0x0453
            java.lang.Object r1 = r10.next()
            java.util.List r1 = (java.util.List) r1
            java.lang.Object r1 = r1.get(r6)
            r2.add(r1)
            goto L_0x043f
        L_0x0453:
            r12.add(r2)
            int r6 = r6 + 1
            goto L_0x0435
        L_0x0459:
            int r10 = r13.size()
            r8 = 0
        L_0x045e:
            if (r8 >= r10) goto L_0x04bf
            X.206 r7 = X.AnonymousClass3MW.A0k(r13, r8)
            java.lang.Object r2 = r12.get(r8)
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            boolean r1 = r2 instanceof java.util.Collection
            if (r1 == 0) goto L_0x047d
            r1 = r2
            java.util.Collection r1 = (java.util.Collection) r1
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L_0x047d
        L_0x0477:
            r11.add(r7)
        L_0x047a:
            int r8 = r8 + 1
            goto L_0x045e
        L_0x047d:
            java.util.Iterator r2 = r2.iterator()
        L_0x0481:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L_0x0477
            java.lang.Object r1 = r2.next()
            boolean r1 = X.AnonymousClass000.A1Y(r1)
            if (r1 != 0) goto L_0x0481
            java.util.List r1 = r4.A02
            java.lang.String r14 = X.C17880vN.A0w(r1, r8)
            X.00H r1 = r5.A05
            java.lang.Object r6 = r1.get()
            X.73E r6 = (X.AnonymousClass73E) r6
            long r1 = r7.A0x
            r16 = r1
            r1 = 1
            X.C18070vi.A0d(r14, r1)
            android.content.ContentValues r2 = X.C17880vN.A08()
            java.lang.String r1 = "crossposting_status_unique_id"
            r2.put(r1, r14)
            java.lang.Long r1 = java.lang.Long.valueOf(r16)
            java.util.List r1 = X.C18070vi.A0M(r1)
            X.AnonymousClass73E.A02(r2, r6, r1)
            r9.add(r7)
            goto L_0x047a
        L_0x04bf:
            boolean r1 = X.C17880vN.A1X(r11)
            if (r1 == 0) goto L_0x04ec
            java.util.ArrayList r7 = X.C29351c6.A0E(r11)
            java.util.Iterator r2 = r11.iterator()
        L_0x04cd:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L_0x04d7
            X.C108995ce.A1Q(r7, r2)
            goto L_0x04cd
        L_0x04d7:
            X.1KB r6 = r5.A01
            X.00H r1 = r5.A03
            java.lang.Object r2 = X.C18070vi.A0E(r1)
            X.2LF r2 = (X.AnonymousClass2LF) r2
            X.00H r1 = r5.A05
            r16 = 3
            r11 = r6
            r12 = r2
            r13 = r1
            r14 = r7
            X.AnonymousClass74A.A06(r11, r12, r13, r14, r15, r16)
        L_0x04ec:
            X.00H r1 = r5.A05
            java.lang.Object r7 = r1.get()
            X.73E r7 = (X.AnonymousClass73E) r7
            java.util.ArrayList r6 = X.C29351c6.A0E(r9)
            java.util.Iterator r2 = r9.iterator()
        L_0x04fc:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L_0x0506
            X.C108995ce.A1Q(r6, r2)
            goto L_0x04fc
        L_0x0506:
            java.util.HashMap r12 = r7.A04(r6)
            java.lang.String r1 = r0.A03     // Catch:{ 6OF -> 0x067b }
            r28 = r1
            int r1 = r0.A00     // Catch:{ 6OF -> 0x067b }
            r27 = r1
            java.util.HashMap r8 = X.C17880vN.A11()     // Catch:{ 6OF -> 0x067b }
            java.util.Iterator r17 = r9.iterator()     // Catch:{ 6OF -> 0x067b }
        L_0x051a:
            boolean r1 = r17.hasNext()     // Catch:{ 6OF -> 0x067b }
            if (r1 == 0) goto L_0x065a
            X.206 r6 = X.C17880vN.A0Y(r17)     // Catch:{ 6OF -> 0x067b }
            long r1 = r6.A0x     // Catch:{ 6OF -> 0x067b }
            r25 = r1
            java.lang.Long r14 = java.lang.Long.valueOf(r25)     // Catch:{ 6OF -> 0x067b }
            java.lang.Object r2 = r12.get(r14)     // Catch:{ 6OF -> 0x067b }
            java.util.List r2 = (java.util.List) r2     // Catch:{ 6OF -> 0x067b }
            if (r2 == 0) goto L_0x064a
            r1 = 10
            int r1 = X.C29351c6.A0C(r15, r1)     // Catch:{ 6OF -> 0x067b }
            int r7 = X.C200610r.A03(r1)     // Catch:{ 6OF -> 0x067b }
            r1 = 16
            if (r7 >= r1) goto L_0x0544
            r7 = 16
        L_0x0544:
            java.util.LinkedHashMap r13 = new java.util.LinkedHashMap     // Catch:{ 6OF -> 0x067b }
            r13.<init>(r7)     // Catch:{ 6OF -> 0x067b }
            java.util.Iterator r16 = r15.iterator()     // Catch:{ 6OF -> 0x067b }
        L_0x054d:
            boolean r1 = r16.hasNext()     // Catch:{ 6OF -> 0x067b }
            if (r1 == 0) goto L_0x0572
            java.lang.Object r10 = r16.next()     // Catch:{ 6OF -> 0x067b }
            java.util.Iterator r11 = r2.iterator()     // Catch:{ 6OF -> 0x067b }
        L_0x055b:
            boolean r1 = r11.hasNext()     // Catch:{ 6OF -> 0x067b }
            if (r1 == 0) goto L_0x062a
            java.lang.Object r7 = r11.next()     // Catch:{ 6OF -> 0x067b }
            r1 = r7
            X.6tf r1 = (X.C136346tf) r1     // Catch:{ 6OF -> 0x067b }
            X.6Re r1 = r1.A02     // Catch:{ 6OF -> 0x067b }
            if (r1 != r10) goto L_0x055b
            if (r7 == 0) goto L_0x062a
            r13.put(r10, r7)     // Catch:{ 6OF -> 0x067b }
            goto L_0x054d
        L_0x0572:
            r11 = 0
            java.util.Collection r1 = r13.values()     // Catch:{ 6OF -> 0x067b }
            java.util.ArrayList r7 = X.C29351c6.A0D(r1)     // Catch:{ 6OF -> 0x067b }
            java.util.Iterator r10 = r1.iterator()     // Catch:{ 6OF -> 0x067b }
        L_0x057f:
            boolean r1 = r10.hasNext()     // Catch:{ 6OF -> 0x067b }
            if (r1 == 0) goto L_0x0591
            java.lang.Object r1 = r10.next()     // Catch:{ 6OF -> 0x067b }
            X.6tf r1 = (X.C136346tf) r1     // Catch:{ 6OF -> 0x067b }
            java.lang.String r1 = r1.A05     // Catch:{ 6OF -> 0x067b }
            r7.add(r1)     // Catch:{ 6OF -> 0x067b }
            goto L_0x057f
        L_0x0591:
            java.util.Set r1 = X.C29431cG.A11(r7)     // Catch:{ 6OF -> 0x067b }
            java.util.List r10 = X.C29431cG.A0t(r1)     // Catch:{ 6OF -> 0x067b }
            int r7 = r10.size()     // Catch:{ 6OF -> 0x067b }
            r1 = 1
            if (r7 != r1) goto L_0x0642
            java.lang.String r19 = X.C17880vN.A0w(r10, r11)     // Catch:{ 6OF -> 0x067b }
            if (r19 == 0) goto L_0x063a
            boolean r1 = r6 instanceof X.AnonymousClass210     // Catch:{ 6OF -> 0x067b }
            if (r1 != 0) goto L_0x05ac
            r11 = 0
            goto L_0x05cc
        L_0x05ac:
            java.util.Iterator r6 = r2.iterator()     // Catch:{ 6OF -> 0x067b }
        L_0x05b0:
            boolean r1 = r6.hasNext()     // Catch:{ 6OF -> 0x067b }
            if (r1 == 0) goto L_0x0632
            java.lang.Object r1 = r6.next()     // Catch:{ 6OF -> 0x067b }
            X.6tf r1 = (X.C136346tf) r1     // Catch:{ 6OF -> 0x067b }
            java.lang.String r11 = r1.A04     // Catch:{ 6OF -> 0x067b }
            if (r11 == 0) goto L_0x05b0
            X.17r r1 = r5.A00     // Catch:{ 6OF -> 0x067b }
            java.io.File r1 = r1.A0a(r11)     // Catch:{ 6OF -> 0x067b }
            boolean r1 = r1.exists()     // Catch:{ 6OF -> 0x067b }
            if (r1 == 0) goto L_0x05b0
        L_0x05cc:
            java.util.Iterator r16 = r2.iterator()     // Catch:{ 6OF -> 0x067b }
        L_0x05d0:
            boolean r1 = r16.hasNext()     // Catch:{ 6OF -> 0x067b }
            r10 = 0
            if (r1 == 0) goto L_0x0614
            java.lang.Object r7 = r16.next()     // Catch:{ 6OF -> 0x067b }
            r1 = r7
            X.6tf r1 = (X.C136346tf) r1     // Catch:{ 6OF -> 0x067b }
            X.1SJ r6 = r5.A02     // Catch:{ 6OF -> 0x067b }
            java.lang.String r2 = r1.A03     // Catch:{ 6OF -> 0x067b }
            r1 = 1
            java.lang.String r1 = r6.A00(r2, r1)     // Catch:{ 6OF -> 0x067b }
            if (r1 == 0) goto L_0x05d0
        L_0x05e9:
            X.6tf r7 = (X.C136346tf) r7     // Catch:{ 6OF -> 0x067b }
            if (r7 == 0) goto L_0x05ef
            java.lang.String r10 = r7.A03     // Catch:{ 6OF -> 0x067b }
        L_0x05ef:
            java.util.LinkedHashMap r2 = X.C108995ce.A0b(r13)     // Catch:{ 6OF -> 0x067b }
            java.util.Iterator r13 = X.AnonymousClass000.A15(r13)     // Catch:{ 6OF -> 0x067b }
        L_0x05f7:
            boolean r1 = r13.hasNext()     // Catch:{ 6OF -> 0x067b }
            if (r1 == 0) goto L_0x0616
            java.util.Map$Entry r1 = X.AnonymousClass000.A16(r13)     // Catch:{ 6OF -> 0x067b }
            java.lang.Object r7 = r1.getKey()     // Catch:{ 6OF -> 0x067b }
            java.lang.Object r1 = r1.getValue()     // Catch:{ 6OF -> 0x067b }
            X.6tf r1 = (X.C136346tf) r1     // Catch:{ 6OF -> 0x067b }
            int r6 = r1.A00     // Catch:{ 6OF -> 0x067b }
            r1 = 1
            if (r1 != r6) goto L_0x0652
            X.C17880vN.A1P(r7, r2, r6)     // Catch:{ 6OF -> 0x067b }
            goto L_0x05f7
        L_0x0614:
            r7 = r10
            goto L_0x05e9
        L_0x0616:
            X.6tD r1 = new X.6tD     // Catch:{ 6OF -> 0x067b }
            r18 = r1
            r20 = r11
            r21 = r10
            r22 = r2
            r23 = r25
            r18.<init>(r19, r20, r21, r22, r23)     // Catch:{ 6OF -> 0x067b }
            r8.put(r14, r1)     // Catch:{ 6OF -> 0x067b }
            goto L_0x051a
        L_0x062a:
            java.lang.String r1 = "missing destination db information"
            X.6OO r2 = new X.6OO     // Catch:{ 6OF -> 0x067b }
            r2.<init>(r1)     // Catch:{ 6OF -> 0x067b }
            goto L_0x0659
        L_0x0632:
            java.lang.String r1 = "media file path not exist for text status"
            X.6OO r2 = new X.6OO     // Catch:{ 6OF -> 0x067b }
            r2.<init>(r1)     // Catch:{ 6OF -> 0x067b }
            goto L_0x0659
        L_0x063a:
            java.lang.String r1 = "empty unique id"
            X.6OO r2 = new X.6OO     // Catch:{ 6OF -> 0x067b }
            r2.<init>(r1)     // Catch:{ 6OF -> 0x067b }
            goto L_0x0659
        L_0x0642:
            java.lang.String r1 = "inconsistent uniqueId across target destinations"
            X.6OO r2 = new X.6OO     // Catch:{ 6OF -> 0x067b }
            r2.<init>(r1)     // Catch:{ 6OF -> 0x067b }
            goto L_0x0659
        L_0x064a:
            java.lang.String r1 = "empty db data"
            X.6OO r2 = new X.6OO     // Catch:{ 6OF -> 0x067b }
            r2.<init>(r1)     // Catch:{ 6OF -> 0x067b }
            goto L_0x0659
        L_0x0652:
            java.lang.String r1 = "invalid db data state"
            X.6OO r2 = new X.6OO     // Catch:{ 6OF -> 0x067b }
            r2.<init>(r1)     // Catch:{ 6OF -> 0x067b }
        L_0x0659:
            throw r2     // Catch:{ 6OF -> 0x067b }
        L_0x065a:
            X.1IX r10 = X.AnonymousClass1IX.copyOf((java.util.Collection) r9)     // Catch:{ 6OF -> 0x067b }
            X.C18070vi.A0X(r10)     // Catch:{ 6OF -> 0x067b }
            java.util.List r1 = r4.A01     // Catch:{ 6OF -> 0x067b }
            X.1IX r11 = X.AnonymousClass1IX.copyOf((java.util.Collection) r1)     // Catch:{ 6OF -> 0x067b }
            X.C18070vi.A0X(r11)     // Catch:{ 6OF -> 0x067b }
            X.6tc r9 = new X.6tc     // Catch:{ 6OF -> 0x067b }
            r12 = r3
            r13 = r28
            r14 = r8
            r15 = r27
            r9.<init>(r10, r11, r12, r13, r14, r15)     // Catch:{ 6OF -> 0x067b }
            X.8A1 r0 = r0.A01
            r0.C7P(r9, r3)
            return
        L_0x067b:
            r1 = move-exception
            X.8A1 r0 = r0.A01
            r0.Bsv(r1)
            return
        L_0x0682:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0n(r7)
            throw r0
        L_0x0687:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0n(r7)
            throw r0
        L_0x068c:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0n(r7)
            throw r0
        L_0x0691:
            java.lang.String r1 = "CrosspostPurposeEncryptionHelper/validatePurposeEncryptionParams UnsupportedEncodingException: Credential data cannot be validated"
            X.C31081ez.A01(r1)
            goto L_0x06a8
        L_0x0697:
            r3 = move-exception
            java.lang.StringBuilder r2 = X.AnonymousClass000.A10()
            java.lang.String r1 = "CrosspostPurposeEncryptionHelper/validatePurposeEncryptionParams GeneralSecurityException: "
            java.lang.String r1 = X.C17900vP.A0C(r1, r2, r3)
            X.C31081ez.A01(r1)
            r3.printStackTrace()
        L_0x06a8:
            java.lang.String r1 = "EligibilityManager/generateEligibilityGraphqlCallback purpose encryption validation failed"
            X.C31081ez.A01(r1)
            java.util.List r1 = r0.A05
            java.util.ArrayList r6 = X.C29351c6.A0E(r1)
            java.util.Iterator r2 = r1.iterator()
        L_0x06b7:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L_0x06c1
            X.C108995ce.A1Q(r6, r2)
            goto L_0x06b7
        L_0x06c1:
            java.util.List r7 = r0.A04
            X.6oB r2 = r0.A02
            X.1KB r3 = r2.A01
            X.00H r1 = r2.A03
            java.lang.Object r4 = X.C18070vi.A0E(r1)
            X.2LF r4 = (X.AnonymousClass2LF) r4
            X.00H r5 = r2.A05
            r8 = 4
            X.AnonymousClass74A.A06(r3, r4, r5, r6, r7, r8)
            X.8A1 r2 = r0.A01
            r1 = 0
            X.6ON r0 = new X.6ON
            r0.<init>(r1)
            r2.Bsv(r0)
            return
        L_0x06e1:
            java.lang.String r0 = "key has been destroyed"
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0n(r0)
            throw r0
        L_0x06e8:
            java.lang.String r0 = "key has been destroyed"
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0n(r0)
            throw r0
        L_0x06ef:
            java.lang.String r0 = "Check failed."
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0n(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7I5.BE5(X.6xC):void");
    }

    public void BrB(IOException iOException) {
        if (this.A00 != 0) {
            C132736nT r5 = (C132736nT) this.A02;
            AnonymousClass6YJ.A00("XFamilyCrosspostEligibilityManager/generateEligibilityGraphqlCallback delivery failure", (Throwable) null);
            AnonymousClass6p6 r4 = (AnonymousClass6p6) r5.A01.A07.get();
            String str = r5.A02;
            List list = r5.A03;
            ArrayList A0D = C29351c6.A0D(list);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C108995ce.A1Q(A0D, it);
            }
            r4.A01(str, A0D);
            r5.A00.BrA();
            return;
        }
        C132926ns r52 = (C132926ns) this.A01;
        C31081ez.A01("EligibilityManager/generateEligibilityGraphqlCallback delivery failure");
        C133526ou r42 = (C133526ou) r52.A02.A06.get();
        String str2 = r52.A03;
        List list2 = r52.A05;
        ArrayList A0D2 = C29351c6.A0D(list2);
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            C108995ce.A1Q(A0D2, it2);
        }
        r42.A01(str2, A0D2, r52.A04);
        r52.A01.BrA();
    }

    public void Bsw(Exception exc) {
        C132926ns r2;
        AnonymousClass6OF r1;
        int i;
        Integer num;
        if (this.A00 != 0) {
            C18070vi.A0d(exc, 0);
            boolean z = exc instanceof C122816Sa;
            C132736nT r22 = (C132736nT) this.A02;
            if (z) {
                C1404571m r0 = ((C122816Sa) exc).error;
                i = r0.A01;
                num = Integer.valueOf(r0.A02);
            } else {
                i = 2;
                num = null;
            }
            r22.A00(i, num);
            return;
        }
        C18070vi.A0d(exc, 0);
        if ((exc instanceof AnonymousClass6OR) || (exc instanceof AnonymousClass6OT)) {
            r2 = (C132926ns) this.A01;
            r1 = AnonymousClass6OL.A00;
        } else {
            r2 = (C132926ns) this.A01;
            r1 = new AnonymousClass6OK(1);
        }
        r2.A00(r1);
    }
}
