package X;

import com.whatsapp.jid.UserJid;

public final class A2P {
    public final AnonymousClass11S A00;
    public final C37511pf A01;
    public final C25111Mx A02;
    public final C26031Qo A03;
    public final C37541pi A04;
    public final C18030ve A05;
    public final C20051A4x A06;
    public final AnonymousClass00H A07;
    public final AnonymousClass00H A08;
    public final AnonymousClass00H A09;
    public final AnonymousClass00H A0A;
    public final AnonymousClass00H A0B;
    public final AnonymousClass00H A0C;
    public final AnonymousClass00H A0D;

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0065, code lost:
        if (r2.equals(r1) == false) goto L_0x001f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:?, code lost:
        return new X.C178759Ei(new X.C178689Eb(r4, r3, r1));
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C178759Ei A01(X.AnonymousClass1BI r6) {
        /*
            r5 = this;
            r1 = 0
            if (r6 == 0) goto L_0x002b
            X.1pf r0 = r5.A01
            X.2pq r2 = r0.A00(r6)
            if (r2 == 0) goto L_0x002b
            long r0 = r2.A00
            java.lang.Long r4 = java.lang.Long.valueOf(r0)
            java.lang.String r3 = r2.A02
            java.lang.String r2 = r2.A03
            X.C18070vi.A0W(r2)
            int r0 = r2.hashCode()
            switch(r0) {
                case -1945543987: goto L_0x005f;
                case -1859421198: goto L_0x005c;
                case -1350068538: goto L_0x0059;
                case -1147981728: goto L_0x0056;
                case -1138948760: goto L_0x0053;
                case -892481550: goto L_0x0050;
                case -433990239: goto L_0x004d;
                case -314025305: goto L_0x004a;
                case 3064571: goto L_0x0047;
                case 401381579: goto L_0x0044;
                case 563217739: goto L_0x0041;
                case 736517098: goto L_0x003e;
                case 1014323530: goto L_0x003b;
                case 1130103474: goto L_0x0038;
                case 1277404111: goto L_0x0035;
                case 1317763348: goto L_0x0032;
                case 1416030845: goto L_0x002f;
                case 1782721813: goto L_0x002c;
                default: goto L_0x001f;
            }
        L_0x001f:
            java.lang.String r1 = "unknown"
        L_0x0021:
            X.9Eb r0 = new X.9Eb
            r0.<init>(r4, r3, r1)
            X.9Ei r1 = new X.9Ei
            r1.<init>((X.C178689Eb) r0)
        L_0x002b:
            return r1
        L_0x002c:
            java.lang.String r1 = "message_short_link"
            goto L_0x0061
        L_0x002f:
            java.lang.String r1 = "biz_profile"
            goto L_0x0061
        L_0x0032:
            java.lang.String r1 = "click_to_chat_link"
            goto L_0x0061
        L_0x0035:
            java.lang.String r1 = "contact_card"
            goto L_0x0061
        L_0x0038:
            java.lang.String r1 = "global_search_new_chat"
            goto L_0x0061
        L_0x003b:
            java.lang.String r1 = "product_link"
            goto L_0x0061
        L_0x003e:
            java.lang.String r1 = "group_participant_list"
            goto L_0x0061
        L_0x0041:
            java.lang.String r1 = "qr_code"
            goto L_0x0061
        L_0x0044:
            java.lang.String r1 = "promotional_qbm"
            goto L_0x0061
        L_0x0047:
            java.lang.String r1 = "ctwa"
            goto L_0x0061
        L_0x004a:
            java.lang.String r1 = "contact_search"
            goto L_0x0061
        L_0x004d:
            java.lang.String r1 = "phone_number_hyperlink"
            goto L_0x0061
        L_0x0050:
            java.lang.String r1 = "status"
            goto L_0x0061
        L_0x0053:
            java.lang.String r1 = "otp_qbm"
            goto L_0x0061
        L_0x0056:
            java.lang.String r1 = "catalog_link"
            goto L_0x0061
        L_0x0059:
            java.lang.String r1 = "transactional_qbm"
            goto L_0x0061
        L_0x005c:
            java.lang.String r1 = "broadcast_list_context_menu"
            goto L_0x0061
        L_0x005f:
            java.lang.String r1 = "other_qbm"
        L_0x0061:
            boolean r0 = r2.equals(r1)
            if (r0 != 0) goto L_0x0021
            goto L_0x001f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.A2P.A01(X.1BI):X.9Ei");
    }

    public final C178749Eh A02(UserJid userJid) {
        C58962lX A052;
        Long l = null;
        C18030ve r5 = this.A05;
        C18040vf r4 = C18040vf.A02;
        if (!C18020vd.A05(r4, r5, 4991) || (A052 = this.A02.A05(userJid)) == null) {
            return null;
        }
        C178749Eh r2 = new C178749Eh(A052.A01, 9);
        if (C18020vd.A05(r4, r5, 4992)) {
            l = Long.valueOf(A052.A00);
        }
        return new C178749Eh(r2, l);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:146:0x02be, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:?, code lost:
        X.CDX.A00(r4, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:0x02c2, code lost:
        throw r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:153:0x02c5, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:?, code lost:
        X.CDX.A00(r11, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x02c9, code lost:
        throw r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:354:0x06f7, code lost:
        if (r3.equals(r13) == false) goto L_0x0052;
     */
    /* JADX WARNING: Removed duplicated region for block: B:211:0x03f6  */
    /* JADX WARNING: Removed duplicated region for block: B:241:0x045c  */
    /* JADX WARNING: Removed duplicated region for block: B:245:0x047b A[LOOP:2: B:243:0x0475->B:245:0x047b, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:248:0x04a7  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0074  */
    /* JADX WARNING: Removed duplicated region for block: B:255:0x04c4  */
    /* JADX WARNING: Removed duplicated region for block: B:256:0x04ce  */
    /* JADX WARNING: Removed duplicated region for block: B:257:0x04e5  */
    /* JADX WARNING: Removed duplicated region for block: B:260:0x04f6  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0080  */
    /* JADX WARNING: Removed duplicated region for block: B:280:0x057f  */
    /* JADX WARNING: Removed duplicated region for block: B:293:0x05de  */
    /* JADX WARNING: Removed duplicated region for block: B:310:0x0647  */
    /* JADX WARNING: Removed duplicated region for block: B:313:0x0664  */
    /* JADX WARNING: Removed duplicated region for block: B:317:0x0676  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x009b  */
    /* JADX WARNING: Removed duplicated region for block: B:320:0x0680  */
    /* JADX WARNING: Removed duplicated region for block: B:323:0x069a  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00ad  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00c0  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00f8  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0106  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0139  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0144  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x0170  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0185  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x01b6  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x01b9  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x01bc A[SYNTHETIC, Splitter:B:91:0x01bc] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C178739Eg A03(X.AnonymousClass206 r52, java.lang.String r53) {
        /*
            r51 = this;
            r7 = 0
            r0 = r52
            X.C18070vi.A0d(r0, r7)
            int r14 = r0.A0u
            boolean r1 = X.AnonymousClass25A.A0J(r14)
            r48 = 0
            r41 = r53
            if (r1 == 0) goto L_0x002b
            java.lang.String r2 = "media_viewer"
            r1 = r41
            boolean r1 = r2.equals(r1)
            if (r1 != 0) goto L_0x002b
            r1 = r0
            X.215 r1 = (X.AnonymousClass215) r1
            int r2 = r1.Bbc()
            r1 = 1
            if (r2 == r1) goto L_0x070d
            r1 = 2
            if (r2 != r1) goto L_0x002b
            java.lang.String r48 = "view_once_expired"
        L_0x002b:
            r1 = r51
            X.00H r2 = r1.A0C
            r32 = r2
            java.lang.Object r2 = r32.get()
            X.1Qp r2 = (X.C26041Qp) r2
            r2.A04(r0)
            r2 = 12
            r13 = 0
            if (r14 == r2) goto L_0x06fb
            boolean r2 = X.C20133A8t.A0A(r0)
            if (r2 != 0) goto L_0x06fb
            java.lang.String r3 = X.AnonymousClass25A.A0B(r14)
            if (r3 == 0) goto L_0x0054
            int r2 = r3.hashCode()
            switch(r2) {
                case -2031136805: goto L_0x06f1;
                case -1890252483: goto L_0x06ee;
                case -1741312354: goto L_0x06eb;
                case -1718548393: goto L_0x06e8;
                case -1490915991: goto L_0x06e5;
                case -1183699191: goto L_0x06e2;
                case -1006478445: goto L_0x06df;
                case -887328209: goto L_0x06dc;
                case -714971329: goto L_0x06d9;
                case -622287711: goto L_0x06d6;
                case -309474065: goto L_0x06d3;
                case 102340: goto L_0x06d0;
                case 111344: goto L_0x06cd;
                case 111346: goto L_0x06ca;
                case 116079: goto L_0x06c7;
                case 3322014: goto L_0x06c4;
                case 93166550: goto L_0x06c1;
                case 100313435: goto L_0x06be;
                case 106006350: goto L_0x06bb;
                case 112021638: goto L_0x06b8;
                case 112202875: goto L_0x06b5;
                case 555704345: goto L_0x06b2;
                case 814376458: goto L_0x06af;
                case 861720859: goto L_0x06ac;
                case 943481210: goto L_0x06a9;
                case 1014323694: goto L_0x06a6;
                case 1279485634: goto L_0x06a3;
                case 1901043637: goto L_0x06a0;
                case 1977401206: goto L_0x069d;
                default: goto L_0x0052;
            }
        L_0x0052:
            java.lang.String r13 = "unknown"
        L_0x0054:
            r2 = 10
            X.9Eh r15 = new X.9Eh
            r15.<init>((int) r2)
            r2 = r41
            boolean r2 = A00(r0, r2)
            if (r2 == 0) goto L_0x04fa
            byte[] r3 = new byte[r7]
        L_0x0065:
            X.9Ec r22 = new X.9Ec
            r2 = r22
            r2.<init>(r15, r13, r3)
        L_0x006c:
            boolean r2 = X.AnonymousClass25A.A0j(r0)
            r25 = 0
            if (r2 == 0) goto L_0x04f6
            r3 = 3
            X.9Eh r24 = new X.9Eh
            r2 = r24
            r2.<init>((int) r3)
        L_0x007c:
            r2 = 15
            if (r14 != r2) goto L_0x04e5
            r3 = 11
            X.9Eh r23 = new X.9Eh
            r2 = r23
            r2.<init>((int) r3)
        L_0x0089:
            r27 = r25
        L_0x008b:
            r3 = 6
            X.9Eh r29 = new X.9Eh
            r2 = r29
            r2.<init>((int) r3)
            r2 = 64
            boolean r2 = r0.A11(r2)
            if (r2 != 0) goto L_0x009d
            r29 = r25
        L_0x009d:
            r3 = 7
            X.9Eh r30 = new X.9Eh
            r2 = r30
            r2.<init>((int) r3)
            r2 = 4
            boolean r2 = r0.A11(r2)
            if (r2 != 0) goto L_0x00af
            r30 = r25
        L_0x00af:
            r3 = 8
            X.9Eh r31 = new X.9Eh
            r2 = r31
            r2.<init>((int) r3)
            r2 = 2
            boolean r2 = r0.A11(r2)
            if (r2 != 0) goto L_0x00c2
            r31 = r25
        L_0x00c2:
            r2 = 8
            boolean r2 = r0.A11(r2)
            if (r2 != 0) goto L_0x04b0
            boolean r2 = r0 instanceof X.C439421n
            if (r2 != 0) goto L_0x04b0
            boolean r2 = r0 instanceof X.AnonymousClass21L
            if (r2 != 0) goto L_0x04b0
        L_0x00d2:
            r28 = r25
        L_0x00d4:
            r2 = 8
            boolean r2 = r0.A11(r2)
            r26 = 0
            if (r2 != 0) goto L_0x0460
            boolean r2 = r0 instanceof X.C439421n
            if (r2 != 0) goto L_0x0460
            boolean r2 = r0 instanceof X.AnonymousClass21L
            if (r2 != 0) goto L_0x0460
            boolean r2 = X.AnonymousClass25A.A0l(r0)
            if (r2 != 0) goto L_0x0460
        L_0x00ec:
            X.1BI r3 = r0.A0H()
            if (r3 == 0) goto L_0x045c
            boolean r2 = X.C22971Dz.A0d(r3)
            if (r2 == 0) goto L_0x045c
            com.whatsapp.jid.UserJid r3 = (com.whatsapp.jid.UserJid) r3
            X.9Eh r21 = new X.9Eh
            r2 = r21
            r2.<init>((com.whatsapp.jid.UserJid) r3)
        L_0x0101:
            boolean r2 = r0 instanceof X.AnonymousClass21F
            r9 = 0
            if (r2 == 0) goto L_0x03f6
            X.205 r2 = r0.A0v
            boolean r2 = r2.A02
            if (r2 == 0) goto L_0x03ea
            com.whatsapp.jid.UserJid r8 = r0.A0I()
            X.11S r2 = r1.A00
            com.whatsapp.jid.PhoneUserJid r6 = X.AnonymousClass11S.A00(r2)
        L_0x0116:
            boolean r2 = r0 instanceof X.AnonymousClass21G
            if (r2 == 0) goto L_0x03e2
            java.lang.String r2 = "request-decline"
        L_0x011c:
            X.4A4 r4 = new X.4A4
            r4.<init>(r8, r6, r9, r2)
            r2 = 28
            X.9Ei r3 = new X.9Ei
            r3.<init>((int) r2)
            X.9Es r2 = new X.9Es
            r2.<init>(r3, r4)
        L_0x012d:
            X.0ve r8 = r1.A05
            r3 = 5718(0x1656, float:8.013E-42)
            X.0vf r5 = X.C18040vf.A02
            boolean r3 = X.C18020vd.A05(r5, r8, r3)
            if (r3 != 0) goto L_0x01bc
            r6 = r25
        L_0x013b:
            r3 = 4194304(0x400000, double:2.0722615E-317)
            boolean r3 = r0.A11(r3)
            if (r3 == 0) goto L_0x01b9
            java.lang.String r5 = "smb_promo"
            r3 = 7
            X.4A4 r4 = new X.4A4
            r4.<init>((java.lang.String) r5, (int) r3)
        L_0x014c:
            java.lang.String r5 = "iab_menu_report"
            r3 = r41
            boolean r3 = r3.equals(r5)
            if (r3 == 0) goto L_0x016c
            java.lang.Class<X.Abx> r3 = X.C20943Abx.class
            X.25F r3 = X.C18070vi.A09(r0, r3)
            X.229 r3 = r3.A02
            X.Abx r3 = (X.C20943Abx) r3
            if (r3 == 0) goto L_0x016c
            java.lang.String r7 = r3.A00
            r5 = 2
            X.9Eh r25 = new X.9Eh
            r3 = r25
            r3.<init>((java.lang.String) r7, (int) r5)
        L_0x016c:
            boolean r3 = r0 instanceof X.AnonymousClass23N
            if (r3 == 0) goto L_0x017f
            r3 = r0
            X.23N r3 = (X.AnonymousClass23N) r3
            java.lang.String r3 = r3.A01
            if (r3 != 0) goto L_0x018c
            X.1Qo r5 = r1.A03
            X.8oI r3 = X.AnonymousClass8oI.A07
            r1 = 0
            r5.A00(r3, r1)
        L_0x017f:
            X.36c r1 = X.C60492o7.A00(r0)
            if (r1 == 0) goto L_0x01b6
            X.205 r1 = r1.A02
        L_0x0187:
            java.lang.String r3 = r1.A01
            X.C18070vi.A0X(r3)
        L_0x018c:
            long r0 = r0.A0I
            long r49 = X.C17880vN.A04(r0)
            X.9Eg r32 = new X.9Eg
            r33 = r27
            r34 = r23
            r35 = r24
            r36 = r29
            r37 = r30
            r38 = r31
            r39 = r28
            r40 = r26
            r41 = r21
            r42 = r6
            r43 = r25
            r44 = r2
            r45 = r4
            r46 = r22
            r47 = r3
            r32.<init>(r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49)
            return r32
        L_0x01b6:
            X.205 r1 = r0.A0v
            goto L_0x0187
        L_0x01b9:
            r4 = r25
            goto L_0x014c
        L_0x01bc:
            X.Ac2 r9 = X.C196899vp.A00(r0)     // Catch:{ all -> 0x03cc }
            if (r9 != 0) goto L_0x01c6
            r6 = r25
            goto L_0x013b
        L_0x01c6:
            byte[] r6 = r9.A03     // Catch:{ all -> 0x03cc }
            r3 = r41
            boolean r20 = A00(r0, r3)     // Catch:{ all -> 0x03cc }
            r4 = 12
            X.9Eh r19 = new X.9Eh     // Catch:{ all -> 0x03cc }
            r3 = r19
            r3.<init>((byte[]) r6, (int) r4)     // Catch:{ all -> 0x03cc }
            r6 = 0
            if (r20 != 0) goto L_0x01e1
            byte[] r4 = r9.A04     // Catch:{ all -> 0x03cc }
            if (r4 == 0) goto L_0x01e1
            r3 = 9070(0x236e, float:1.271E-41)
            goto L_0x01e4
        L_0x01e1:
            r18 = r6
            goto L_0x0204
        L_0x01e4:
            boolean r3 = X.C18020vd.A05(r5, r8, r3)     // Catch:{ all -> 0x03cc }
            if (r3 == 0) goto L_0x01e1
            int r3 = r4.length     // Catch:{ all -> 0x03cc }
            int r3 = 16 - r3
            if (r3 <= 0) goto L_0x01f5
            byte[] r3 = new byte[r3]     // Catch:{ all -> 0x03cc }
            byte[] r4 = X.C200310o.A0A(r4, r3)     // Catch:{ all -> 0x03cc }
        L_0x01f5:
            java.lang.Integer r3 = r9.A01     // Catch:{ all -> 0x03cc }
            if (r3 == 0) goto L_0x01fd
            java.lang.Long r6 = X.C17890vO.A0N(r3)     // Catch:{ all -> 0x03cc }
        L_0x01fd:
            X.9Ei r18 = new X.9Ei     // Catch:{ all -> 0x03cc }
            r3 = r18
            r3.<init>((java.lang.Long) r6, (byte[]) r4)     // Catch:{ all -> 0x03cc }
        L_0x0204:
            java.lang.Object r6 = r32.get()     // Catch:{ all -> 0x03cc }
            X.1Qp r6 = (X.C26041Qp) r6     // Catch:{ all -> 0x03cc }
            X.1Cd r3 = r6.A01     // Catch:{ all -> 0x02ca }
            X.1at r11 = r3.get()     // Catch:{ all -> 0x02ca }
            java.util.ArrayList r17 = X.AnonymousClass000.A13()     // Catch:{ all -> 0x02c3 }
            r3 = r11
            X.1av r3 = (X.C28801av) r3     // Catch:{ all -> 0x02c3 }
            X.1Ev r12 = r3.A02     // Catch:{ all -> 0x02c3 }
            java.lang.String r10 = "SELECT reporting_info.reporting_tag, COALESCE(reporting_info.stanza_id_text,reporting_info.stanza_id) as S_ID_TEXT, reporting_info.send_timestamp, reporting_info_content.reporting_token, reporting_info_content.reporting_token_content, reporting_info_content.reporting_token_version, reporting_info_content.reporting_token_key  FROM reporting_info LEFT JOIN reporting_info_content ON reporting_info._id = reporting_info_content.reporting_info_row_id WHERE message_row_id = ?"
            java.lang.String[] r9 = X.C17880vN.A1Y()     // Catch:{ all -> 0x02c3 }
            long r3 = r0.A0x     // Catch:{ all -> 0x02c3 }
            X.C17880vN.A1V(r9, r7, r3)     // Catch:{ all -> 0x02c3 }
            java.lang.String r3 = "GET_REPORTING_INFO_LIST"
            android.database.Cursor r4 = r12.A0A(r10, r3, r9)     // Catch:{ all -> 0x02c3 }
            java.lang.String r3 = "reporting_tag"
            int r16 = r4.getColumnIndexOrThrow(r3)     // Catch:{ all -> 0x02bc }
            java.lang.String r3 = "reporting_token"
            int r15 = r4.getColumnIndexOrThrow(r3)     // Catch:{ all -> 0x02bc }
            java.lang.String r3 = "reporting_token_content"
            int r14 = r4.getColumnIndexOrThrow(r3)     // Catch:{ all -> 0x02bc }
            java.lang.String r3 = "reporting_token_version"
            int r10 = r4.getColumnIndexOrThrow(r3)     // Catch:{ all -> 0x02bc }
            java.lang.String r3 = "reporting_token_key"
            int r13 = r4.getColumnIndexOrThrow(r3)     // Catch:{ all -> 0x02bc }
            java.lang.String r3 = "S_ID_TEXT"
            int r9 = r4.getColumnIndexOrThrow(r3)     // Catch:{ all -> 0x02bc }
            java.lang.String r3 = "send_timestamp"
            int r7 = r4.getColumnIndexOrThrow(r3)     // Catch:{ all -> 0x02bc }
        L_0x0254:
            boolean r3 = r4.moveToNext()     // Catch:{ all -> 0x02bc }
            r33 = 0
            if (r3 == 0) goto L_0x02b1
            r3 = r16
            byte[] r3 = r4.getBlob(r3)     // Catch:{ all -> 0x02bc }
            byte[] r36 = r4.getBlob(r15)     // Catch:{ all -> 0x02bc }
            byte[] r37 = r4.getBlob(r14)     // Catch:{ all -> 0x02bc }
            boolean r12 = r4.isNull(r10)     // Catch:{ all -> 0x02bc }
            if (r12 != 0) goto L_0x0278
            int r12 = r4.getInt(r10)     // Catch:{ all -> 0x02bc }
            java.lang.Integer r33 = java.lang.Integer.valueOf(r12)     // Catch:{ all -> 0x02bc }
        L_0x0278:
            byte[] r38 = r4.getBlob(r13)     // Catch:{ all -> 0x02bc }
            boolean r12 = r4.isNull(r9)     // Catch:{ all -> 0x02bc }
            if (r12 != 0) goto L_0x0288
            java.lang.String r34 = r4.getString(r9)     // Catch:{ all -> 0x02bc }
            if (r34 != 0) goto L_0x028a
        L_0x0288:
            java.lang.String r34 = ""
        L_0x028a:
            boolean r12 = r4.isNull(r7)     // Catch:{ all -> 0x02bc }
            if (r12 != 0) goto L_0x029b
            long r39 = r4.getLong(r7)     // Catch:{ all -> 0x02bc }
            java.lang.Long r12 = java.lang.Long.valueOf(r39)     // Catch:{ all -> 0x02bc }
            if (r12 == 0) goto L_0x029b
            goto L_0x029d
        L_0x029b:
            r39 = 0
        L_0x029d:
            if (r3 == 0) goto L_0x0254
            int r12 = r3.length     // Catch:{ all -> 0x02bc }
            if (r12 == 0) goto L_0x0254
            X.Ac2 r12 = new X.Ac2     // Catch:{ all -> 0x02bc }
            r32 = r12
            r35 = r3
            r32.<init>(r33, r34, r35, r36, r37, r38, r39)     // Catch:{ all -> 0x02bc }
            r3 = r17
            r3.add(r12)     // Catch:{ all -> 0x02bc }
            goto L_0x0254
        L_0x02b1:
            java.util.List r7 = X.C29431cG.A0t(r17)     // Catch:{ all -> 0x02bc }
            r4.close()     // Catch:{ all -> 0x02c3 }
            r11.close()     // Catch:{ all -> 0x02ca }
            goto L_0x02d6
        L_0x02bc:
            r7 = move-exception
            throw r7     // Catch:{ all -> 0x02be }
        L_0x02be:
            r3 = move-exception
            X.CDX.A00(r4, r7)     // Catch:{ all -> 0x02c3 }
            throw r3     // Catch:{ all -> 0x02c3 }
        L_0x02c3:
            r4 = move-exception
            throw r4     // Catch:{ all -> 0x02c5 }
        L_0x02c5:
            r3 = move-exception
            X.CDX.A00(r11, r4)     // Catch:{ all -> 0x02ca }
            throw r3     // Catch:{ all -> 0x02ca }
        L_0x02ca:
            r7 = move-exception
            X.1Qo r6 = r6.A00     // Catch:{ all -> 0x03cc }
            X.8oI r4 = X.AnonymousClass8oI.A09     // Catch:{ all -> 0x03cc }
            java.lang.String r3 = "getReportingInfoFromNewTable"
            r6.A01(r4, r3, r7)     // Catch:{ all -> 0x03cc }
            X.0wS r7 = X.C18460wS.A00     // Catch:{ all -> 0x03cc }
        L_0x02d6:
            boolean r3 = r7.isEmpty()     // Catch:{ all -> 0x03cc }
            if (r3 == 0) goto L_0x02e6
            X.Ac2 r3 = X.C196899vp.A00(r0)     // Catch:{ all -> 0x03cc }
            if (r3 == 0) goto L_0x03ad
            java.util.List r7 = X.C18070vi.A0M(r3)     // Catch:{ all -> 0x03cc }
        L_0x02e6:
            X.00H r3 = r1.A0B     // Catch:{ all -> 0x03cc }
            r39 = r3
            java.lang.Object r6 = r39.get()     // Catch:{ all -> 0x03cc }
            X.9oV r6 = (X.C192499oV) r6     // Catch:{ all -> 0x03cc }
            X.1BI r4 = r0.A0H()     // Catch:{ all -> 0x03cc }
            X.205 r3 = r0.A0v     // Catch:{ all -> 0x03cc }
            X.C18070vi.A0W(r3)     // Catch:{ all -> 0x03cc }
            X.1BI r17 = r6.A00(r4, r3)     // Catch:{ all -> 0x03cc }
            r39.get()     // Catch:{ all -> 0x03cc }
            X.1BI r6 = r0.A0H()     // Catch:{ all -> 0x03cc }
            X.1BI r4 = r3.A00     // Catch:{ all -> 0x03cc }
            boolean r3 = X.C22971Dz.A0d(r4)     // Catch:{ all -> 0x03cc }
            if (r3 == 0) goto L_0x03a7
            com.whatsapp.jid.UserJid r10 = X.C22941Dw.A00(r4)     // Catch:{ all -> 0x03cc }
        L_0x0310:
            X.00H r3 = r1.A09     // Catch:{ all -> 0x03cc }
            java.lang.Object r6 = r3.get()     // Catch:{ all -> 0x03cc }
            X.1W7 r6 = (X.AnonymousClass1W7) r6     // Catch:{ all -> 0x03cc }
            long r3 = r0.A0x     // Catch:{ all -> 0x03cc }
            byte[] r15 = r6.A01(r3)     // Catch:{ all -> 0x03cc }
            java.util.ArrayList r11 = X.C29351c6.A0D(r7)     // Catch:{ all -> 0x03cc }
            java.util.Iterator r16 = r7.iterator()     // Catch:{ all -> 0x03cc }
        L_0x0326:
            boolean r3 = r16.hasNext()     // Catch:{ all -> 0x03cc }
            if (r3 == 0) goto L_0x03b1
            java.lang.Object r9 = r16.next()     // Catch:{ all -> 0x03cc }
            X.Ac2 r9 = (X.C20948Ac2) r9     // Catch:{ all -> 0x03cc }
            if (r20 != 0) goto L_0x033b
            byte[] r4 = r9.A05     // Catch:{ all -> 0x03cc }
            if (r4 == 0) goto L_0x033b
            r13 = 9070(0x236e, float:1.271E-41)
            goto L_0x033f
        L_0x033b:
            r7 = r25
            r6 = r7
            goto L_0x0356
        L_0x033f:
            boolean r3 = X.C18020vd.A05(r5, r8, r13)     // Catch:{ all -> 0x03cc }
            if (r3 == 0) goto L_0x033b
            r3 = 11
            X.9Ee r7 = new X.9Ee     // Catch:{ all -> 0x03cc }
            r7.<init>((byte[]) r4, (int) r3)     // Catch:{ all -> 0x03cc }
            r6 = 0
            byte[] r12 = r9.A04     // Catch:{ all -> 0x03cc }
            if (r12 != 0) goto L_0x0373
            java.lang.String r3 = "ReportingToken is null"
            com.whatsapp.util.Log.e((java.lang.String) r3)     // Catch:{ all -> 0x03cc }
        L_0x0356:
            java.lang.String r12 = r9.A02     // Catch:{ all -> 0x03cc }
            long r3 = r9.A00     // Catch:{ all -> 0x03cc }
            long r37 = X.C17880vN.A04(r3)     // Catch:{ all -> 0x03cc }
            byte[] r4 = r9.A03     // Catch:{ all -> 0x03cc }
            X.9Ee r3 = new X.9Ee     // Catch:{ all -> 0x03cc }
            r32 = r3
            r33 = r7
            r34 = r6
            r35 = r12
            r36 = r4
            r32.<init>(r33, r34, r35, r36, r37)     // Catch:{ all -> 0x03cc }
            r11.add(r3)     // Catch:{ all -> 0x03cc }
            goto L_0x0326
        L_0x0373:
            java.lang.Integer r3 = r9.A01     // Catch:{ all -> 0x03cc }
            if (r3 == 0) goto L_0x03a4
            int r3 = r3.intValue()     // Catch:{ all -> 0x03cc }
            long r3 = (long) r3     // Catch:{ all -> 0x03cc }
        L_0x037c:
            boolean r13 = X.C18020vd.A05(r5, r8, r13)     // Catch:{ all -> 0x03cc }
            if (r13 == 0) goto L_0x0356
            java.lang.Object r14 = r39.get()     // Catch:{ all -> 0x03cc }
            X.9oV r14 = (X.C192499oV) r14     // Catch:{ all -> 0x03cc }
            byte[] r13 = r9.A06     // Catch:{ all -> 0x03cc }
            if (r13 != 0) goto L_0x039e
            java.lang.String r13 = r9.A02     // Catch:{ all -> 0x03cc }
            r6 = r17
            byte[] r13 = r14.A01(r6, r10, r13, r15)     // Catch:{ all -> 0x03cc }
            if (r13 != 0) goto L_0x039e
            r14 = 32
            byte[] r13 = new byte[r14]     // Catch:{ all -> 0x03cc }
            r6 = 0
            java.util.Arrays.fill(r13, r6, r14, r6)     // Catch:{ all -> 0x03cc }
        L_0x039e:
            X.9Ee r6 = new X.9Ee     // Catch:{ all -> 0x03cc }
            r6.<init>((byte[]) r12, (byte[]) r13, (long) r3)     // Catch:{ all -> 0x03cc }
            goto L_0x0356
        L_0x03a4:
            r3 = -1
            goto L_0x037c
        L_0x03a7:
            com.whatsapp.jid.UserJid r10 = X.C22941Dw.A00(r6)     // Catch:{ all -> 0x03cc }
            goto L_0x0310
        L_0x03ad:
            X.0wS r7 = X.C18460wS.A00     // Catch:{ all -> 0x03cc }
            goto L_0x02e6
        L_0x03b1:
            boolean r3 = r11.isEmpty()     // Catch:{ all -> 0x03cc }
            if (r3 == 0) goto L_0x03ba
            r5 = r25
            goto L_0x03c1
        L_0x03ba:
            r3 = 26
            X.9Ei r5 = new X.9Ei     // Catch:{ all -> 0x03cc }
            r5.<init>((java.util.List) r11, (int) r3)     // Catch:{ all -> 0x03cc }
        L_0x03c1:
            X.9Eh r6 = new X.9Eh     // Catch:{ all -> 0x03cc }
            r4 = r19
            r3 = r18
            r6.<init>(r5, r3, r4)     // Catch:{ all -> 0x03cc }
            goto L_0x013b
        L_0x03cc:
            r3 = move-exception
            X.1IU r3 = X.C108945cZ.A1J(r3)
            java.lang.Throwable r6 = r3.exception
            if (r6 == 0) goto L_0x03de
            X.1Qo r5 = r1.A03
            X.8oI r4 = X.AnonymousClass8oI.A06
            r3 = r25
            r5.A01(r4, r3, r6)
        L_0x03de:
            r6 = r25
            goto L_0x013b
        L_0x03e2:
            boolean r2 = r0 instanceof X.AnonymousClass21I
            if (r2 == 0) goto L_0x0711
            java.lang.String r2 = "request-cancel"
            goto L_0x011c
        L_0x03ea:
            X.11S r2 = r1.A00
            com.whatsapp.jid.PhoneUserJid r8 = X.AnonymousClass11S.A00(r2)
            com.whatsapp.jid.UserJid r6 = r0.A0I()
            goto L_0x0116
        L_0x03f6:
            X.AW0 r5 = X.AnonymousClass25B.A00(r0)
            if (r5 != 0) goto L_0x0420
            boolean r2 = r0 instanceof X.AnonymousClass22H
            if (r2 == 0) goto L_0x040e
            r2 = 29
            X.9Ei r3 = new X.9Ei
            r3.<init>((int) r2)
            X.9Es r2 = new X.9Es
            r2.<init>((X.C178759Ei) r3)
            goto L_0x012d
        L_0x040e:
            boolean r2 = r0 instanceof X.AnonymousClass210
            boolean r2 = X.AnonymousClass000.A1O(r2)
            X.9Em r3 = new X.9Em
            r3.<init>(r2)
            X.9Es r2 = new X.9Es
            r2.<init>((X.C178799Em) r3)
            goto L_0x012d
        L_0x0420:
            java.lang.String r3 = r5.A0K
            boolean r2 = X.C20128A8n.A08(r3)
            if (r2 == 0) goto L_0x0429
            r9 = r3
        L_0x0429:
            com.whatsapp.jid.UserJid r8 = r5.A0E
            com.whatsapp.jid.UserJid r6 = r5.A0D
            int r3 = r5.A03
            r2 = 5
            if (r3 != r2) goto L_0x0436
            java.lang.String r2 = "futureproof"
            goto L_0x011c
        L_0x0436:
            boolean r2 = r5.A0K()
            if (r2 == 0) goto L_0x0440
            java.lang.String r2 = "request"
            goto L_0x011c
        L_0x0440:
            monitor-enter(r5)
            int r4 = r5.A03     // Catch:{ all -> 0x071f }
            r2 = 2
            r3 = 1
            if (r4 == r2) goto L_0x0455
            r2 = 200(0xc8, float:2.8E-43)
            if (r4 == r2) goto L_0x0455
            if (r4 == r3) goto L_0x0455
            r2 = 100
            if (r4 == r2) goto L_0x0455
            r2 = 3
            if (r4 == r2) goto L_0x0455
            r3 = 0
        L_0x0455:
            monitor-exit(r5)
            if (r3 == 0) goto L_0x0718
            java.lang.String r2 = "send"
            goto L_0x011c
        L_0x045c:
            r21 = r25
            goto L_0x0101
        L_0x0460:
            X.A4x r3 = r1.A06
            X.205 r2 = r0.A0v
            java.lang.String r2 = r2.A01
            X.C18070vi.A0X(r2)
            java.util.List r2 = r3.A02(r2)
            java.util.ArrayList r3 = X.C29351c6.A0D(r2)
            java.util.Iterator r5 = r2.iterator()
        L_0x0475:
            boolean r2 = r5.hasNext()
            if (r2 == 0) goto L_0x04a1
            java.lang.Object r4 = r5.next()
            X.9tH r4 = (X.C195399tH) r4
            java.lang.String r9 = r4.A00
            java.lang.String r10 = r4.A05
            java.lang.String r2 = r4.A01
            java.lang.Long r2 = X.AnonymousClass1YD.A04(r2)
            long r13 = X.C17900vP.A01(r2)
            java.lang.String r11 = r4.A04
            java.lang.String r12 = r4.A02
            X.9Eh r8 = new X.9Eh
            r8.<init>(r9, r10, r11, r12, r13)
            X.9Ee r2 = new X.9Ee
            r2.<init>((X.C178749Eh) r8)
            r3.add(r2)
            goto L_0x0475
        L_0x04a1:
            boolean r2 = X.AnonymousClass000.A1a(r3)
            if (r2 == 0) goto L_0x00ec
            X.9Eh r26 = new X.9Eh
            r2 = r26
            r2.<init>((java.util.List) r3)
            goto L_0x00ec
        L_0x04b0:
            boolean r2 = X.AnonymousClass25A.A0l(r0)
            if (r2 != 0) goto L_0x00d2
            X.1pi r2 = r1.A04
            java.lang.String r4 = r2.A00(r0)
            if (r4 == 0) goto L_0x04ce
            boolean r2 = X.AnonymousClass1YF.A0T(r4)
            if (r2 != 0) goto L_0x04ce
            r3 = 5
            X.9Eh r28 = new X.9Eh
            r2 = r28
            r2.<init>((java.lang.String) r4, (int) r3)
            goto L_0x00d4
        L_0x04ce:
            java.lang.StringBuilder r3 = X.AnonymousClass000.A10()
            java.lang.String r2 = "Unexpected null template ID for fmsg: "
            X.AnonymousClass8BT.A1H(r0, r2, r3)
            X.C17890vO.A0w(r3)
            X.1Qo r4 = r1.A03
            X.8oH r3 = X.AnonymousClass8oH.A08
            r2 = r41
            r4.A00(r3, r2)
            goto L_0x00d2
        L_0x04e5:
            r23 = r25
            r2 = 64
            if (r14 != r2) goto L_0x0089
            r3 = 24
            X.9Ei r27 = new X.9Ei
            r2 = r27
            r2.<init>((int) r3)
            goto L_0x008b
        L_0x04f6:
            r24 = r25
            goto L_0x007c
        L_0x04fa:
            X.8X8 r12 = X.C166418cr.A00()
            X.205 r2 = r0.A0v     // Catch:{ 1T8 -> 0x0549, IllegalStateException -> 0x0543, Exception -> 0x054f }
            X.1BI r2 = r2.A00     // Catch:{ 1T8 -> 0x0549, IllegalStateException -> 0x0543, Exception -> 0x054f }
            boolean r2 = X.C22971Dz.A0S(r2)     // Catch:{ 1T8 -> 0x0549, IllegalStateException -> 0x0543, Exception -> 0x054f }
            if (r2 == 0) goto L_0x0527
            X.C18070vi.A0b(r12)     // Catch:{ 1T8 -> 0x0549, IllegalStateException -> 0x0543, Exception -> 0x054f }
            X.C18070vi.A0d(r12, r7)     // Catch:{ 1T8 -> 0x0549, IllegalStateException -> 0x0543, Exception -> 0x054f }
            X.9XV r2 = new X.9XV     // Catch:{ 1T8 -> 0x0549, IllegalStateException -> 0x0543, Exception -> 0x054f }
            r2.<init>(r12)     // Catch:{ 1T8 -> 0x0549, IllegalStateException -> 0x0543, Exception -> 0x054f }
            r4 = 1
            X.8X8 r2 = r2.A00     // Catch:{ 1T8 -> 0x0549, IllegalStateException -> 0x0543, Exception -> 0x054f }
            X.9b2 r3 = new X.9b2     // Catch:{ 1T8 -> 0x0549, IllegalStateException -> 0x0543, Exception -> 0x054f }
            r3.<init>(r2, r4)     // Catch:{ 1T8 -> 0x0549, IllegalStateException -> 0x0543, Exception -> 0x054f }
            X.00H r2 = r1.A07     // Catch:{ 1T8 -> 0x0549, IllegalStateException -> 0x0543, Exception -> 0x054f }
            java.lang.Object r2 = r2.get()     // Catch:{ 1T8 -> 0x0549, IllegalStateException -> 0x0543, Exception -> 0x054f }
            X.9lX r2 = (X.C190799lX) r2     // Catch:{ 1T8 -> 0x0549, IllegalStateException -> 0x0543, Exception -> 0x054f }
            r2.A00(r3, r0)     // Catch:{ 1T8 -> 0x0549, IllegalStateException -> 0x0543, Exception -> 0x054f }
            goto L_0x0558
        L_0x0527:
            X.C18070vi.A0b(r12)     // Catch:{ 1T8 -> 0x0549, IllegalStateException -> 0x0543, Exception -> 0x054f }
            X.9n5 r3 = X.C181349Qd.A00(r12)     // Catch:{ 1T8 -> 0x0549, IllegalStateException -> 0x0543, Exception -> 0x054f }
            X.1cl r2 = r0.A0J()     // Catch:{ 1T8 -> 0x0549, IllegalStateException -> 0x0543, Exception -> 0x054f }
            r3.A00 = r2     // Catch:{ 1T8 -> 0x0549, IllegalStateException -> 0x0543, Exception -> 0x054f }
            r2 = 1
            r3.A03 = r2     // Catch:{ 1T8 -> 0x0549, IllegalStateException -> 0x0543, Exception -> 0x054f }
            r3.A06 = r2     // Catch:{ 1T8 -> 0x0549, IllegalStateException -> 0x0543, Exception -> 0x054f }
            X.A2m r3 = r3.A00()     // Catch:{ 1T8 -> 0x0549, IllegalStateException -> 0x0543, Exception -> 0x054f }
            X.00H r2 = r1.A08     // Catch:{ 1T8 -> 0x0549, IllegalStateException -> 0x0543, Exception -> 0x054f }
            X.AnonymousClass8BV.A1B(r3, r0, r2)     // Catch:{ 1T8 -> 0x0549, IllegalStateException -> 0x0543, Exception -> 0x054f }
            goto L_0x0558
        L_0x0543:
            r5 = move-exception
            X.1Qo r4 = r1.A03
            X.8oH r3 = X.AnonymousClass8oH.A01
            goto L_0x0554
        L_0x0549:
            r5 = move-exception
            X.1Qo r4 = r1.A03
            X.8oH r3 = X.AnonymousClass8oH.A02
            goto L_0x0554
        L_0x054f:
            r5 = move-exception
            X.1Qo r4 = r1.A03
            X.8oH r3 = X.AnonymousClass8oH.A00
        L_0x0554:
            r2 = 0
            r4.A01(r3, r2, r5)
        L_0x0558:
            X.00H r2 = r1.A0A
            java.lang.Object r3 = r2.get()
            X.70P r3 = (X.AnonymousClass70P) r3
            X.2qD r2 = X.AnonymousClass70P.A00(r0)
            if (r2 == 0) goto L_0x0694
            java.lang.String r11 = r3.A02(r2)
            if (r11 == 0) goto L_0x0694
            X.C18070vi.A0b(r12)
            X.C18070vi.A0d(r12, r7)
            X.8Wv r10 = X.AnonymousClass8X8.A02(r12)
            X.Bm6 r4 = r10.A00
            X.8ck r4 = (X.C166348ck) r4
            int r3 = r4.formatCase_
            r2 = 2
            if (r3 != r2) goto L_0x0647
            java.lang.Object r2 = r4.format_
            X.Bm6 r2 = (X.C23577Bm6) r2
        L_0x0583:
            X.Bmt r9 = r2.A0O()
            X.8Ts r9 = (X.C163108Ts) r9
            X.Bm6 r2 = r9.A00
            X.8bt r2 = (X.C165868bt) r2
            java.lang.String r2 = r2.hydratedContentText_
            X.C18070vi.A0X(r2)
            java.lang.String r8 = "<code>"
            java.lang.String r3 = X.AnonymousClass1YE.A07(r2, r11, r8, r7)
            X.Bm6 r4 = X.C17880vN.A0G(r9)
            X.8bt r4 = (X.C165868bt) r4
            int r2 = r4.bitField0_
            r2 = r2 | 32
            r4.bitField0_ = r2
            r4.hydratedContentText_ = r3
            java.lang.String r3 = r4.hydratedFooterText_
            if (r3 == 0) goto L_0x05c2
            int r2 = r3.length()
            if (r2 == 0) goto L_0x05c2
            java.lang.String r3 = X.AnonymousClass1YE.A07(r3, r11, r8, r7)
            X.Bm6 r4 = X.C17880vN.A0G(r9)
            X.8bt r4 = (X.C165868bt) r4
            int r2 = r4.bitField0_
            r2 = r2 | 64
            r4.bitField0_ = r2
            r4.hydratedFooterText_ = r3
        L_0x05c2:
            X.EE9 r2 = r4.hydratedButtons_
            java.util.List r3 = java.util.Collections.unmodifiableList(r2)
            java.util.ArrayList r6 = X.AnonymousClass000.A13()
            if (r3 == 0) goto L_0x066d
            boolean r2 = r3.isEmpty()
            if (r2 != 0) goto L_0x066d
            java.util.Iterator r17 = r3.iterator()
        L_0x05d8:
            boolean r2 = r17.hasNext()
            if (r2 == 0) goto L_0x064b
            java.lang.Object r2 = r17.next()
            X.Bm6 r2 = (X.C23577Bm6) r2
            X.Bmt r5 = r2.A0O()
            X.Bm6 r4 = r5.A00
            X.8ch r4 = (X.C166318ch) r4
            int r3 = r4.hydratedButtonCase_
            if (r3 == 0) goto L_0x0644
            r2 = 1
            if (r3 == r2) goto L_0x0641
            r2 = 2
            if (r3 == r2) goto L_0x063e
            r2 = 3
            if (r3 == r2) goto L_0x063b
            r3 = 0
        L_0x05fa:
            java.lang.Integer r2 = X.AnonymousClass00R.A01
            if (r3 != r2) goto L_0x0633
            X.8bH r2 = r4.A0R()
            X.Bmt r4 = r2.A0O()
            X.Bm6 r2 = r4.A00
            X.8bH r2 = (X.C165518bH) r2
            java.lang.String r2 = r2.url_
            X.C18070vi.A0X(r2)
            java.lang.String r16 = X.AnonymousClass1YE.A07(r2, r11, r8, r7)
            X.Bm6 r3 = X.C17880vN.A0G(r4)
            X.8bH r3 = (X.C165518bH) r3
            int r2 = r3.bitField0_
            r2 = r2 | 2
            r3.bitField0_ = r2
            r2 = r16
            r3.url_ = r2
            X.Bm6 r2 = X.AnonymousClass8BS.A09(r4, r5)
            X.Bm6 r3 = r5.A00
            X.8ch r3 = (X.C166318ch) r3
            r2.getClass()
            r3.hydratedButton_ = r2
            r2 = 2
            r3.hydratedButtonCase_ = r2
        L_0x0633:
            X.Bm6 r2 = r5.A0C()
            r6.add(r2)
            goto L_0x05d8
        L_0x063b:
            java.lang.Integer r3 = X.AnonymousClass00R.A0C
            goto L_0x05fa
        L_0x063e:
            java.lang.Integer r3 = X.AnonymousClass00R.A01
            goto L_0x05fa
        L_0x0641:
            java.lang.Integer r3 = X.AnonymousClass00R.A00
            goto L_0x05fa
        L_0x0644:
            java.lang.Integer r3 = X.AnonymousClass00R.A0N
            goto L_0x05fa
        L_0x0647:
            X.8bt r2 = X.C165868bt.DEFAULT_INSTANCE
            goto L_0x0583
        L_0x064b:
            X.Bm6 r3 = X.C17880vN.A0G(r9)
            X.8bt r3 = (X.C165868bt) r3
            X.Bm9 r2 = X.C23579Bm9.A02
            r3.hydratedButtons_ = r2
            X.Bm6 r4 = X.C17880vN.A0G(r9)
            X.8bt r4 = (X.C165868bt) r4
            X.EE9 r3 = r4.hydratedButtons_
            r2 = r3
            X.DbR r2 = (X.C27296DbR) r2
            boolean r2 = r2.A00
            if (r2 != 0) goto L_0x066a
            X.EE9 r3 = X.C23577Bm6.A09(r3)
            r4.hydratedButtons_ = r3
        L_0x066a:
            X.DND.A09(r6, r3)
        L_0x066d:
            X.Bm6 r3 = r9.A00
            X.8bt r3 = (X.C165868bt) r3
            int r2 = r3.titleCase_
            r4 = 2
            if (r2 != r4) goto L_0x069a
            java.lang.Object r3 = r3.title_
            java.lang.String r3 = (java.lang.String) r3
        L_0x067a:
            int r2 = X.AnonymousClass8BS.A00(r3)
            if (r2 == 0) goto L_0x068e
            java.lang.String r3 = X.AnonymousClass1YE.A07(r3, r11, r8, r7)
            X.Bm6 r2 = X.C17880vN.A0G(r9)
            X.8bt r2 = (X.C165868bt) r2
            r2.titleCase_ = r4
            r2.title_ = r3
        L_0x068e:
            r10.A0G(r9)
            r12.A0R(r10)
        L_0x0694:
            byte[] r3 = X.AnonymousClass8BT.A1Z(r12)
            goto L_0x0065
        L_0x069a:
            java.lang.String r3 = ""
            goto L_0x067a
        L_0x069d:
            java.lang.String r13 = "genai_sticker"
            goto L_0x06f3
        L_0x06a0:
            java.lang.String r13 = "location"
            goto L_0x06f3
        L_0x06a3:
            java.lang.String r13 = "list_response"
            goto L_0x06f3
        L_0x06a6:
            java.lang.String r13 = "product_list"
            goto L_0x06f3
        L_0x06a9:
            java.lang.String r13 = "contact_array"
            goto L_0x06f3
        L_0x06ac:
            java.lang.String r13 = "document"
            goto L_0x06f3
        L_0x06af:
            java.lang.String r13 = "native_flow_response"
            goto L_0x06f3
        L_0x06b2:
            java.lang.String r13 = "catalog"
            goto L_0x06f3
        L_0x06b5:
            java.lang.String r13 = "video"
            goto L_0x06f3
        L_0x06b8:
            java.lang.String r13 = "vcard"
            goto L_0x06f3
        L_0x06bb:
            java.lang.String r13 = "order"
            goto L_0x06f3
        L_0x06be:
            java.lang.String r13 = "image"
            goto L_0x06f3
        L_0x06c1:
            java.lang.String r13 = "audio"
            goto L_0x06f3
        L_0x06c4:
            java.lang.String r13 = "list"
            goto L_0x06f3
        L_0x06c7:
            java.lang.String r13 = "url"
            goto L_0x06f3
        L_0x06ca:
            java.lang.String r13 = "ptv"
            goto L_0x06f3
        L_0x06cd:
            java.lang.String r13 = "ptt"
            goto L_0x06f3
        L_0x06d0:
            java.lang.String r13 = "gif"
            goto L_0x06f3
        L_0x06d3:
            java.lang.String r13 = "product"
            goto L_0x06f3
        L_0x06d6:
            java.lang.String r13 = "livelocation"
            goto L_0x06f3
        L_0x06d9:
            java.lang.String r13 = "buttons_response"
            goto L_0x06f3
        L_0x06dc:
            java.lang.String r13 = "system"
            goto L_0x06f3
        L_0x06df:
            java.lang.String r13 = "cataloglink"
            goto L_0x06f3
        L_0x06e2:
            java.lang.String r13 = "invite"
            goto L_0x06f3
        L_0x06e5:
            java.lang.String r13 = "productlink"
            goto L_0x06f3
        L_0x06e8:
            java.lang.String r13 = "avatar_sticker"
            goto L_0x06f3
        L_0x06eb:
            java.lang.String r13 = "collection"
            goto L_0x06f3
        L_0x06ee:
            java.lang.String r13 = "sticker"
            goto L_0x06f3
        L_0x06f1:
            java.lang.String r13 = "sticker_pack"
        L_0x06f3:
            boolean r2 = r3.equals(r13)
            if (r2 != 0) goto L_0x0054
            goto L_0x0052
        L_0x06fb:
            byte[] r4 = new byte[r7]
            r2 = 10
            X.9Eh r3 = new X.9Eh
            r3.<init>((int) r2)
            X.9Ec r22 = new X.9Ec
            r2 = r22
            r2.<init>(r3, r13, r4)
            goto L_0x006c
        L_0x070d:
            java.lang.String r48 = "view_once_opened"
            goto L_0x002b
        L_0x0711:
            java.lang.String r0 = "This shouldn't happen as FMessagePaymentRequestResponse has only two implementations"
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0n(r0)
            throw r0
        L_0x0718:
            java.lang.String r0 = "typeAttributeValue can't be null"
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0n(r0)
            throw r0
        L_0x071f:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.A2P.A03(X.206, java.lang.String):X.9Eg");
    }

    public static final boolean A00(AnonymousClass206 r1, String str) {
        if (str.equals("media_viewer") || str.equals("view_once_viewer") || !AnonymousClass25A.A0J(r1.A0u) || ((AnonymousClass215) r1).Bbc() == 0) {
            return false;
        }
        return true;
    }

    public A2P(AnonymousClass11S r2, C37511pf r3, C25111Mx r4, C26031Qo r5, C37541pi r6, C18030ve r7, C20051A4x a4x, AnonymousClass00H r9, AnonymousClass00H r10, AnonymousClass00H r11, AnonymousClass00H r12, AnonymousClass00H r13, AnonymousClass00H r14, AnonymousClass00H r15) {
        C18070vi.A0w(r7, r2, r5, r9, r4);
        C18070vi.A0x(r10, r11, r12, r13, r3);
        C18070vi.A0r(a4x, r14, r6);
        C18070vi.A0d(r15, 14);
        this.A05 = r7;
        this.A00 = r2;
        this.A03 = r5;
        this.A0A = r9;
        this.A02 = r4;
        this.A09 = r10;
        this.A0C = r11;
        this.A0B = r12;
        this.A08 = r13;
        this.A01 = r3;
        this.A06 = a4x;
        this.A07 = r14;
        this.A04 = r6;
        this.A0D = r15;
    }
}
