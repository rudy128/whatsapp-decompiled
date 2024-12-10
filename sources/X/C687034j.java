package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.34j  reason: invalid class name and case insensitive filesystem */
public final class C687034j implements C25471Oi, AnonymousClass3M6 {
    public final C25001Mm A00;
    public final AnonymousClass1M9 A01;
    public final AnonymousClass121 A02;
    public final C18030ve A03;
    public final AnonymousClass10I A04;
    public final AnonymousClass00H A05;
    public final AnonymousClass00H A06;
    public final AnonymousClass00H A07;

    /* JADX WARNING: type inference failed for: r1v1, types: [java.lang.Object, X.2kB] */
    public void BBw(AnonymousClass206 r7, C63362sw r8) {
        C18070vi.A0d(r8, 0);
        C59812mv r3 = r8.A0D;
        if (r7 != null && r3 != null) {
            int i = r7.A01;
            if (!(i == 0 || i == 2 || i == 1 || r7.A0u == 12)) {
                if (!C18020vd.A05(C18040vf.A02, this.A03, 11237)) {
                    return;
                }
            }
            UserJid A052 = r8.A05();
            int i2 = r3.A03;
            if (i2 != -1) {
                AnonymousClass121 r2 = this.A02;
                ? obj = new Object();
                obj.A02 = 1;
                obj.A00 = 1;
                obj.A03 = i2;
                obj.A01 = r3.A01;
                obj.A07 = r3.A07;
                obj.A06 = r3.A06;
                obj.A05 = r3.A05;
                obj.A04 = r3.A04;
                obj.A08 = r3.A08;
                obj.A02 = r3.A02;
                obj.A00 = r3.A00;
                obj.A01 = r7.A0D;
                r2.BAz(A052, obj.A00());
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:90:0x02dd, code lost:
        if (r9 == null) goto L_0x02df;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x02df, code lost:
        if (r11 != r12) goto L_0x02e1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x02e1, code lost:
        r4 = !r7.A05(r10, r9, r12, true);
        r1 = X.AnonymousClass000.A11("VerifiedNameInfoMessageStanzaParser");
        r1.append("/new privacy valid and vlevel change, jid: ");
        r1.append(r10);
        r1.append("requestSyncThoughCertInSync = ");
        r1.append(r4);
        r1.append(", old vlevel: ");
        r1.append(r11);
        X.C17900vP.A0j(", new vlevel: ", r1, r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x0310, code lost:
        if (r0 < r9.privacyModeTs) goto L_0x02e1;
     */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0131  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x022a  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0234  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x0264  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x02b1  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.B5I Bvs(X.C166418cr r40, X.C63362sw r41, boolean r42) {
        /*
            r39 = this;
            r14 = 0
            r13 = r41
            X.C18070vi.A0d(r13, r14)
            java.lang.Class<X.34x> r0 = X.C688434x.class
            X.B5K r0 = r13.A06(r0)
            X.34x r0 = (X.C688434x) r0
            if (r0 == 0) goto L_0x0316
            java.lang.Long r2 = r0.A01
            int r12 = r0.A00
            byte[] r0 = r0.A02
            r27 = r0
        L_0x0018:
            r28 = 0
            r16 = 0
            r15 = 0
            r21 = 0
            r38 = 0
            r26 = 1
            r25 = 1
            r11 = -1
            com.whatsapp.jid.UserJid r10 = r13.A05()
            java.lang.Class<X.34v> r0 = X.C688234v.class
            X.B5K r0 = r13.A06(r0)
            X.34v r0 = (X.C688234v) r0
            if (r0 == 0) goto L_0x0313
            X.1ya r9 = r0.A00
        L_0x0036:
            java.lang.StringBuilder r4 = X.AnonymousClass000.A10()
            java.lang.String r24 = "VerifiedNameInfoMessageStanzaParser"
            r0 = r24
            r4.append(r0)
            java.lang.String r0 = "/processVerifiedNameData, jid: "
            r4.append(r0)
            r4.append(r10)
            java.lang.String r0 = "incoming vname: "
            r4.append(r0)
            r4.append(r2)
            java.lang.String r3 = ", vlevel: "
            r4.append(r3)
            r4.append(r12)
            java.lang.String r1 = ", privacyMode: "
            X.C17900vP.A0Y(r9, r1, r4)
            r8 = r39
            X.00H r0 = r8.A06
            java.lang.Object r7 = r0.get()
            X.1PM r7 = (X.AnonymousClass1PM) r7
            if (r2 == 0) goto L_0x01a9
            if (r10 == 0) goto L_0x024b
            X.00H r0 = r8.A07
            java.lang.Object r6 = r0.get()
            X.2nO r6 = (X.C60102nO) r6
            r0 = r24
            r6.A02(r0)
            java.lang.String r4 = "entry_point"
            java.lang.String r0 = "incoming_msg"
            r6.A03(r4, r0)
            long r17 = r2.longValue()
            r22 = 0
            int r0 = (r17 > r22 ? 1 : (r17 == r22 ? 0 : -1))
            if (r0 >= 0) goto L_0x00be
            X.0ve r5 = r8.A03
            r4 = 9234(0x2412, float:1.294E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r5, r4)
            if (r0 == 0) goto L_0x00be
            java.lang.String r1 = "change_reason"
            java.lang.String r0 = "negative_serial"
            r6.A03(r1, r0)
            r0 = r26
            r6.A04(r0)
            X.2mv r0 = new X.2mv
            r30 = r15
            r31 = r15
            r35 = r26
            r27 = r0
            r29 = r15
            r32 = r11
            r33 = r12
            r34 = r26
            r36 = r14
            r27.<init>(r28, r29, r30, r31, r32, r33, r34, r35, r36)
        L_0x00b9:
            r13.A0D = r0
            X.AVd r0 = X.C20697AVd.A00
            return r0
        L_0x00be:
            java.util.Map r0 = r7.A08
            r0.remove(r10)
            X.1yf r5 = r7.A02(r10)
            java.lang.StringBuilder r4 = X.AnonymousClass000.A11(r24)
            java.lang.String r0 = "/processVerifiedNameData log db value jid = "
            r4.append(r0)
            r4.append(r10)
            r4.append(r3)
            if (r5 == 0) goto L_0x018a
            int r0 = r5.A03
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
        L_0x00de:
            r4.append(r0)
            r4.append(r1)
            if (r5 != 0) goto L_0x0184
            r0 = 0
        L_0x00e7:
            X.C17900vP.A0b(r0, r4)
            int r26 = X.AnonymousClass2V2.A00(r5)
            java.lang.String r3 = "validate_vname"
            r6.A01(r3)
            if (r5 == 0) goto L_0x0179
            long r0 = r5.A05
            int r4 = (r0 > r17 ? 1 : (r0 == r17 ? 0 : -1))
            if (r4 == 0) goto L_0x0161
            java.lang.StringBuilder r11 = X.AnonymousClass000.A11(r24)
            java.lang.String r4 = "/processVerifiedNameData verified name serial changed, requestCert = true; jid="
            r11.append(r4)
            r11.append(r10)
            r4 = 32
            r11.append(r4)
            r11.append(r0)
            java.lang.String r0 = " -> "
            X.C17900vP.A0Z(r2, r0, r11)
            int r11 = r5.A03
            java.lang.String r0 = r5.A08
            r21 = r0
            X.1ya r15 = r5.A00()
            r7.A03(r10)
        L_0x0122:
            r20 = 1
        L_0x0124:
            r6.A00(r3)
            java.lang.Class<X.34l> r0 = X.C687234l.class
            X.B5K r0 = r13.A06(r0)
            X.34l r0 = (X.C687234l) r0
            if (r0 == 0) goto L_0x01f1
            long r3 = r0.A01
            long r1 = r0.A00
            java.lang.StringBuilder r0 = X.AnonymousClass000.A11(r24)
            java.lang.String r14 = "/processVerifiedNameData triggred_block expiration_ts = "
            r0.append(r14)
            r0.append(r3)
            java.lang.String r14 = " cooldown = "
            X.C17900vP.A0m(r14, r0, r1)
            int r0 = (r3 > r22 ? 1 : (r3 == r22 ? 0 : -1))
            if (r0 <= 0) goto L_0x01f1
            int r0 = (r1 > r22 ? 1 : (r1 == r22 ? 0 : -1))
            if (r0 <= 0) goto L_0x01f1
            X.00H r0 = r8.A05
            java.lang.Object r19 = r0.get()
            r0 = r19
            X.1Mb r0 = (X.C24891Mb) r0
            r19 = r0
            r17 = 1000(0x3e8, double:4.94E-321)
            long r3 = r3 * r17
            long r1 = r1 * r17
            goto L_0x018d
        L_0x0161:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A11(r24)
            java.lang.String r0 = " name is in sync but privacy or level may have changed, jid: "
            X.C17900vP.A0Y(r10, r0, r1)
            r38 = 1
            int r11 = r5.A03
            java.lang.String r0 = r5.A08
            r21 = r0
            X.1ya r15 = r5.A00()
            r20 = 0
            goto L_0x0124
        L_0x0179:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A11(r24)
            java.lang.String r0 = " oldVerifiedName is null, new cert case, requestCert = true, jid: "
            X.C17900vP.A0Y(r10, r0, r1)
            r11 = 0
            goto L_0x0122
        L_0x0184:
            X.1ya r0 = r5.A00()
            goto L_0x00e7
        L_0x018a:
            r0 = 0
            goto L_0x00de
        L_0x018d:
            org.json.JSONObject r14 = X.C24891Mb.A00(r0, r10)     // Catch:{ JSONException -> 0x01f1 }
            if (r14 != 0) goto L_0x0197
            org.json.JSONObject r14 = X.C17880vN.A15()     // Catch:{ JSONException -> 0x01f1 }
        L_0x0197:
            java.lang.String r0 = "tb_expired_ts"
            r14.put(r0, r3)     // Catch:{ JSONException -> 0x01f1 }
            java.lang.String r0 = "tb_cooldown"
            r14.put(r0, r1)     // Catch:{ JSONException -> 0x01f1 }
            r0 = r19
            X.C24891Mb.A01(r0, r10, r14)     // Catch:{ JSONException -> 0x01f1 }
            goto L_0x01f1
        L_0x01a9:
            if (r10 == 0) goto L_0x024b
            X.1M9 r0 = r8.A01
            X.1E7 r4 = r0.A0E(r10)
            if (r4 == 0) goto L_0x024b
            boolean r0 = r4.A0C()
            if (r0 == 0) goto L_0x024b
            X.1yf r3 = r4.A0G
            if (r3 == 0) goto L_0x01e2
            boolean r0 = X.C42701yb.A01(r10)
            if (r0 == 0) goto L_0x01e2
            X.0ve r2 = r8.A03
            r1 = 6863(0x1acf, float:9.617E-42)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 == 0) goto L_0x01e2
            java.lang.StringBuilder r1 = X.AnonymousClass000.A11(r24)
            java.lang.String r0 = "/verified level absent in message, ignore for bot; jid="
            X.C17900vP.A0Z(r10, r0, r1)
            int r12 = r3.A03
            r11 = r12
            java.lang.String r0 = r3.A08
            r21 = r0
            r16 = r0
            goto L_0x024b
        L_0x01e2:
            int r11 = r4.A0A
            java.lang.StringBuilder r1 = X.AnonymousClass000.A11(r24)
            java.lang.String r0 = "/verified name serial not present on message, clearing state; jid="
            X.C17900vP.A0Z(r10, r0, r1)
            r7.A03(r10)
            goto L_0x024b
        L_0x01f1:
            if (r20 == 0) goto L_0x02ae
            if (r27 == 0) goto L_0x02ae
            if (r5 == 0) goto L_0x0280
            X.1ya r0 = r5.A00()
            long r0 = r0.privacyModeTs
            int r2 = (r0 > r22 ? 1 : (r0 == r22 ? 0 : -1))
            if (r2 <= 0) goto L_0x0280
            if (r9 == 0) goto L_0x0209
            long r0 = r9.privacyModeTs
            int r2 = (r0 > r22 ? 1 : (r0 == r22 ? 0 : -1))
            if (r2 != 0) goto L_0x0280
        L_0x0209:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A11(r24)
            java.lang.String r0 = "/missing privacy mode. userJid="
            r1.append(r0)
            r1.append(r10)
            java.lang.String r0 = ". id="
            r1.append(r0)
            java.lang.String r0 = r13.A0h
            X.C17890vO.A1A(r1, r0)
        L_0x021f:
            r4 = 0
        L_0x0220:
            X.1yf r1 = r7.A02(r10)
            int r25 = X.AnonymousClass2V2.A00(r1)
            if (r1 == 0) goto L_0x0232
            java.lang.String r0 = r1.A08
            r16 = r0
            X.1ya r28 = r1.A00()
        L_0x0232:
            if (r20 == 0) goto L_0x0264
            java.lang.StringBuilder r1 = X.AnonymousClass000.A11(r24)
            java.lang.String r0 = "/requestCert=true, start GetVNameCertificateJob for jid: "
            X.C17900vP.A0Y(r10, r0, r1)
        L_0x023d:
            X.1Mm r1 = r8.A00
            com.whatsapp.jobqueue.job.GetVNameCertificateJob r0 = new com.whatsapp.jobqueue.job.GetVNameCertificateJob
            r0.<init>(r10)
            r1.A01(r0)
        L_0x0247:
            r0 = 1
            r6.A04(r0)
        L_0x024b:
            X.2mv r0 = new X.2mv
            r29 = r0
            r30 = r15
            r31 = r28
            r32 = r21
            r33 = r16
            r34 = r11
            r35 = r12
            r36 = r26
            r37 = r25
            r29.<init>(r30, r31, r32, r33, r34, r35, r36, r37, r38)
            goto L_0x00b9
        L_0x0264:
            if (r4 == 0) goto L_0x0247
            java.lang.StringBuilder r1 = X.AnonymousClass000.A11(r24)
            java.lang.String r0 = "/usync vlevel/privacy mismatch, requestSyncThoughCertInSync=true, start GetVNameCertificateJob. jid="
            r1.append(r0)
            r1.append(r10)
            java.lang.String r0 = " new vlevel="
            r1.append(r0)
            r1.append(r12)
            java.lang.String r0 = " new privacy mode="
            X.C17900vP.A0Z(r9, r0, r1)
            goto L_0x023d
        L_0x0280:
            r0 = r27
            boolean r0 = r7.A06(r10, r9, r0, r12)
            if (r0 == 0) goto L_0x021f
            java.lang.StringBuilder r1 = X.AnonymousClass000.A11(r24)
            java.lang.String r0 = "/reset the transition state, jid: "
            r1.append(r0)
            r1.append(r10)
            java.lang.String r0 = "db update called"
            X.C17890vO.A1A(r1, r0)
            X.10I r2 = r8.A04
            r1 = 6
            X.7Pk r0 = new X.7Pk
            r0.<init>(r13, r8, r1)
            r2.CGF(r0)
            r4 = 0
            r11 = 0
            r21 = r28
            r15 = r28
            r20 = 0
            goto L_0x0220
        L_0x02ae:
            r4 = 0
            if (r20 != 0) goto L_0x0220
            if (r15 == 0) goto L_0x02df
            long r0 = r15.privacyModeTs
            int r2 = (r0 > r22 ? 1 : (r0 == r22 ? 0 : -1))
            if (r2 <= 0) goto L_0x02dd
            if (r9 == 0) goto L_0x02c1
            long r2 = r9.privacyModeTs
            int r5 = (r2 > r22 ? 1 : (r2 == r22 ? 0 : -1))
            if (r5 != 0) goto L_0x030c
        L_0x02c1:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A11(r24)
            java.lang.String r0 = "/maybe biz removal, requestSyncThoughCertInSync = true, jid: "
            r1.append(r0)
            r1.append(r10)
            java.lang.String r0 = ", old PrivacyMode: "
            r1.append(r0)
            r1.append(r15)
            java.lang.String r0 = ", new PrivacyMode: "
            X.C17900vP.A0Y(r9, r0, r1)
            r4 = 1
            goto L_0x0220
        L_0x02dd:
            if (r9 != 0) goto L_0x030c
        L_0x02df:
            if (r11 == r12) goto L_0x0220
        L_0x02e1:
            r0 = r25
            boolean r0 = r7.A05(r10, r9, r12, r0)
            r4 = r0 ^ 1
            java.lang.StringBuilder r1 = X.AnonymousClass000.A11(r24)
            java.lang.String r0 = "/new privacy valid and vlevel change, jid: "
            r1.append(r0)
            r1.append(r10)
            java.lang.String r0 = "requestSyncThoughCertInSync = "
            r1.append(r0)
            r1.append(r4)
            java.lang.String r0 = ", old vlevel: "
            r1.append(r0)
            r1.append(r11)
            java.lang.String r0 = ", new vlevel: "
            X.C17900vP.A0j(r0, r1, r12)
            goto L_0x0220
        L_0x030c:
            long r2 = r9.privacyModeTs
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r5 >= 0) goto L_0x02df
            goto L_0x02e1
        L_0x0313:
            r9 = 0
            goto L_0x0036
        L_0x0316:
            r2 = 0
            r12 = 0
            r27 = 0
            goto L_0x0018
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C687034j.Bvs(X.8cr, X.2sw, boolean):X.B5I");
    }

    public /* synthetic */ void Bvt(C63362sw r1) {
    }

    public /* synthetic */ void CB9(C63362sw r1, C29621ca r2) {
    }

    public /* bridge */ /* synthetic */ B5K CBD(C194979sb r8, C29621ca r9) {
        int i;
        C18070vi.A0d(r9, 0);
        byte[] bArr = null;
        String A0Q = r9.A0Q("verified_name", (String) null);
        String A0Q2 = r9.A0Q("verified_level", (String) null);
        Long l = null;
        if (A0Q == null && A0Q2 == null) {
            return null;
        }
        C29621ca A0K = r9.A0K("verified_name");
        if (A0K != null) {
            String A0Q3 = A0K.A0Q("v", (String) null);
            if (!"1".equals(A0Q3) || (bArr = A0K.A01) == null) {
                C17900vP.A0g("VerifiedNameInfoMessageStanzaParser/unknown vname cert payload version: ", A0Q3, AnonymousClass000.A10());
                bArr = null;
            }
        }
        if (A0Q != null) {
            try {
                l = Long.valueOf(Long.parseLong(A0Q));
            } catch (NumberFormatException unused) {
                StringBuilder A10 = AnonymousClass000.A10();
                A10.append("verified name serial number value '");
                A10.append(A0Q);
                throw AnonymousClass1UI.A01(AnonymousClass000.A0y("' is not numeric", A10));
            }
        }
        if (A0Q2 != null) {
            i = C50402Uh.A00(A0Q2);
        } else {
            i = 0;
        }
        return new C688434x(l, bArr, i);
    }

    public /* synthetic */ void CBF(C63362sw r1, C29621ca r2) {
    }

    public C687034j(C25001Mm r1, AnonymousClass1M9 r2, AnonymousClass121 r3, C18030ve r4, AnonymousClass10I r5, AnonymousClass00H r6, AnonymousClass00H r7, AnonymousClass00H r8) {
        C18070vi.A0w(r4, r5, r1, r2, r3);
        C18070vi.A0q(r6, r7, r8);
        this.A03 = r4;
        this.A04 = r5;
        this.A00 = r1;
        this.A01 = r2;
        this.A02 = r3;
        this.A06 = r6;
        this.A07 = r7;
        this.A05 = r8;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001d, code lost:
        if (X.C18020vd.A05(X.C18040vf.A02, r4.A03, 11237) != false) goto L_0x001f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.B5J BCv(X.AnonymousClass206 r5, X.C63362sw r6) {
        /*
            r4 = this;
            boolean r2 = X.C18070vi.A16(r6, r5)
            int r1 = r5.A01
            if (r1 == 0) goto L_0x001f
            r0 = 2
            if (r1 == r0) goto L_0x001f
            if (r1 == r2) goto L_0x001f
            int r1 = r5.A0u
            r0 = 12
            if (r1 == r0) goto L_0x001f
            X.0ve r2 = r4.A03
            r1 = 11237(0x2be5, float:1.5746E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 == 0) goto L_0x0053
        L_0x001f:
            X.2mv r3 = r6.A0D
            X.00H r0 = r4.A06
            java.lang.Object r1 = r0.get()
            X.1PM r1 = (X.AnonymousClass1PM) r1
            com.whatsapp.jid.UserJid r0 = r6.A0f
            X.1yf r0 = r1.A02(r0)
            r2 = 0
            if (r0 == 0) goto L_0x0058
            X.1ya r1 = r0.A00()
        L_0x0036:
            java.lang.Class<X.34v> r0 = X.C688234v.class
            X.B5K r0 = r6.A06(r0)
            X.34v r0 = (X.C688234v) r0
            if (r0 == 0) goto L_0x0042
            X.1ya r2 = r0.A00
        L_0x0042:
            boolean r0 = X.C60622oL.A01(r1, r2)
            if (r0 == 0) goto L_0x004d
            r0 = 4096(0x1000, double:2.0237E-320)
            r5.A0b(r0)
        L_0x004d:
            if (r3 == 0) goto L_0x0056
            boolean r0 = r3.A08
        L_0x0051:
            r5.A0r = r0
        L_0x0053:
            X.AVf r0 = X.C20699AVf.A00
            return r0
        L_0x0056:
            r0 = 1
            goto L_0x0051
        L_0x0058:
            if (r3 == 0) goto L_0x005d
            X.1ya r1 = r3.A05
            goto L_0x0036
        L_0x005d:
            r1 = r2
            goto L_0x0036
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C687034j.BCv(X.206, X.2sw):X.B5J");
    }

    public String BSr() {
        return "VerifiedNameInfoMessageStanzaParser";
    }

    public void Bvr(C166278cd r3, AnonymousClass206 r4, C63362sw r5) {
        C18070vi.A0i(r5, r4);
        C688434x r1 = (C688434x) C63362sw.A00(r5, C688434x.class);
        if (r1 != null) {
            Long l = r1.A01;
            if (l != null) {
                r4.A0W = l;
            }
            r4.A0D = r1.A00;
        }
    }

    public /* synthetic */ long CBC(C29621ca r3) {
        return 0;
    }

    public /* synthetic */ boolean CM6(C63362sw r2) {
        return false;
    }
}
