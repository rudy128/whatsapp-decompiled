package X;

/* renamed from: X.1nR  reason: invalid class name and case insensitive filesystem */
public class C36161nR {
    public final AnonymousClass1M9 A00;
    public final AnonymousClass122 A01;
    public final AnonymousClass1KB A02;
    public final AnonymousClass1PM A03;
    public final AnonymousClass10I A04;
    public final AnonymousClass00H A05;
    public final AnonymousClass00H A06;

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0021, code lost:
        if (r4.A05 != r25) goto L_0x0023;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A00(com.whatsapp.jid.UserJid r21, X.C42691ya r22, byte[] r23, int r24, long r25) {
        /*
            r20 = this;
            r10 = r20
            X.00H r9 = r10.A06
            java.lang.Object r0 = r9.get()
            X.2nO r0 = (X.C60102nO) r0
            java.lang.String r8 = "validate_vname"
            r0.A01(r8)
            X.1PM r5 = r10.A03
            r11 = r21
            X.1yf r4 = r5.A02(r11)
            r2 = r25
            if (r4 == 0) goto L_0x0023
            long r0 = r4.A05
            int r6 = (r0 > r25 ? 1 : (r0 == r25 ? 0 : -1))
            r7 = 1
            if (r6 == 0) goto L_0x0024
        L_0x0023:
            r7 = 0
        L_0x0024:
            java.lang.Object r0 = r9.get()
            X.2nO r0 = (X.C60102nO) r0
            r0.A00(r8)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r0 = "BusinessVnameHelper/updateBizVerifiedInformation jid="
            r6.append(r0)
            r6.append(r11)
            java.lang.String r0 = " existingVname.serial="
            r6.append(r0)
            if (r4 != 0) goto L_0x00ec
            java.lang.String r0 = "null!!"
        L_0x0043:
            r6.append(r0)
            java.lang.String r0 = " existingVname.vlevel="
            r6.append(r0)
            java.lang.String r1 = "null!"
            if (r4 != 0) goto L_0x00e4
            r0 = r1
        L_0x0050:
            r6.append(r0)
            java.lang.String r0 = " existingVname.privacyMode="
            r6.append(r0)
            if (r4 != 0) goto L_0x00de
            r0 = r1
        L_0x005b:
            r6.append(r0)
            java.lang.String r0 = " new serial: "
            r6.append(r0)
            r6.append(r2)
            java.lang.String r0 = " new certBlob=["
            r6.append(r0)
            r2 = r23
            if (r23 == 0) goto L_0x0074
            int r0 = r2.length
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
        L_0x0074:
            r6.append(r1)
            java.lang.String r0 = "] new vlevel="
            r6.append(r0)
            r3 = r24
            r6.append(r3)
            java.lang.String r0 = " new privacyMode="
            r6.append(r0)
            r1 = r22
            r6.append(r1)
            java.lang.String r0 = r6.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            if (r23 == 0) goto L_0x00d8
            if (r7 != 0) goto L_0x00d8
            boolean r2 = r5.A06(r11, r1, r2, r3)
        L_0x009a:
            if (r4 == 0) goto L_0x00d6
            int r1 = r4.A03
        L_0x009e:
            r13 = 0
            if (r4 == 0) goto L_0x00d4
            java.lang.String r14 = r4.A08
        L_0x00a3:
            X.1yf r0 = r5.A02(r11)
            if (r0 != 0) goto L_0x00d1
            r15 = r13
        L_0x00aa:
            if (r4 == 0) goto L_0x00cf
            X.1ya r12 = r4.A00()
        L_0x00b0:
            if (r0 == 0) goto L_0x00b6
            X.1ya r13 = r0.A00()
        L_0x00b6:
            int r18 = X.AnonymousClass2V2.A00(r4)
            int r19 = X.AnonymousClass2V2.A00(r0)
            if (r2 == 0) goto L_0x00ce
            X.10I r0 = r10.A04
            X.3CX r9 = new X.3CX
            r16 = r1
            r17 = r3
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            r0.CGF(r9)
        L_0x00ce:
            return
        L_0x00cf:
            r12 = r13
            goto L_0x00b0
        L_0x00d1:
            java.lang.String r15 = r0.A08
            goto L_0x00aa
        L_0x00d4:
            r14 = r13
            goto L_0x00a3
        L_0x00d6:
            r1 = 0
            goto L_0x009e
        L_0x00d8:
            r0 = 1
            boolean r2 = r5.A05(r11, r1, r3, r0)
            goto L_0x009a
        L_0x00de:
            X.1ya r0 = r4.A00()
            goto L_0x005b
        L_0x00e4:
            int r0 = r4.A03
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto L_0x0050
        L_0x00ec:
            long r0 = r4.A05
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            goto L_0x0043
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C36161nR.A00(com.whatsapp.jid.UserJid, X.1ya, byte[], int, long):void");
    }

    public C36161nR(AnonymousClass1KB r1, AnonymousClass1M9 r2, AnonymousClass1PM r3, AnonymousClass122 r4, AnonymousClass10I r5, AnonymousClass00H r6, AnonymousClass00H r7) {
        this.A02 = r1;
        this.A04 = r5;
        this.A00 = r2;
        this.A01 = r4;
        this.A03 = r3;
        this.A06 = r6;
        this.A05 = r7;
    }
}
