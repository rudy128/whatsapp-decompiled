package X;

/* renamed from: X.1kL  reason: invalid class name and case insensitive filesystem */
public final class C34351kL extends C31911gK {
    public final C19880zA A00;
    public final C31361fR A01;
    public final AnonymousClass1KB A02;
    public final AnonymousClass11S A03;
    public final C26811To A04;
    public final C30191dX A05;
    public final AnonymousClass1M9 A06;
    public final C24671Lf A07;
    public final C25111Mx A08;
    public final C24791Lr A09;
    public final C26881Tv A0A;
    public final C34341kK A0B;
    public final AnonymousClass12E A0C;
    public final C26861Tt A0D;
    public final AnonymousClass1RW A0E;
    public final AnonymousClass118 A0F;
    public final C19830z4 A0G;
    public final AnonymousClass1TG A0H;
    public final C24751Ln A0I;
    public final C18030ve A0J;
    public final AnonymousClass1PY A0K;
    public final AnonymousClass1PX A0L;
    public final AnonymousClass1OZ A0M;
    public final C26241Rj A0N;
    public final C27001Ui A0O;
    public final AnonymousClass10I A0P;
    public final AnonymousClass00H A0Q;
    public final AnonymousClass00H A0R;
    public final AnonymousClass00H A0S;
    public final AnonymousClass00H A0T;
    public final AnonymousClass00H A0U;
    public final AnonymousClass00H A0V;
    public final AnonymousClass00H A0W;
    public final C34321kI A0X;

    /* JADX WARNING: type inference failed for: r15v0, types: [java.lang.Object, X.2rm] */
    /* JADX WARNING: type inference failed for: r0v47, types: [X.2MN, X.20i, X.206] */
    /* JADX WARNING: type inference failed for: r0v48, types: [X.2MN, X.20i, X.206] */
    /* JADX WARNING: type inference failed for: r0v53, types: [X.2MN, X.20i, X.206] */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x01ae, code lost:
        r7 = r1.A06;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A05(X.C29621ca r32, int r33) {
        /*
            r31 = this;
            r14 = 1
            r3 = r32
            X.C18070vi.A0d(r3, r14)
            r0 = 0
            X.1ca r7 = r3.A0J(r0)
            if (r7 == 0) goto L_0x004a
            java.lang.String r0 = "add"
            boolean r0 = X.C29621ca.A07(r7, r0)
            r1 = r31
            if (r0 == 0) goto L_0x004b
            X.11S r0 = r1.A03
            boolean r0 = r0.A0N()
            r2 = r0 ^ 1
            java.lang.String r0 = "ContactUpdateNotificationHandler/handleContactAdd/add notification should only be sent to primary"
            X.C17960vV.A0H(r2, r0)
            byte[] r4 = r7.A01
            X.2R1 r3 = X.AnonymousClass2R1.A0J
            java.lang.Integer r0 = X.AnonymousClass00R.A0C
            X.2sh r2 = new X.2sh
            r2.<init>(r3, r0)
            r2.A03 = r14
            X.2qq r0 = X.C62132qq.A0C
            r2.A00 = r0
            if (r4 == 0) goto L_0x003a
            r2.A03(r4)
        L_0x003a:
            X.2re r2 = r2.A02()
        L_0x003e:
            X.10I r4 = r1.A0P
            r0 = 17
            X.7Pi r3 = new X.7Pi
            r3.<init>(r1, r2, r0)
        L_0x0047:
            r4.CGF(r3)
        L_0x004a:
            return
        L_0x004b:
            java.lang.String r0 = "remove"
            boolean r0 = X.C29621ca.A07(r7, r0)
            if (r0 == 0) goto L_0x014c
            X.11S r0 = r1.A03
            boolean r0 = r0.A0N()
            r2 = r0 ^ 1
            java.lang.String r0 = "ContactUpdateNotificationHandler/handleContactRemove/remove notification should only be sent to primary"
            X.C17960vV.A0H(r2, r0)
            java.lang.Class<com.whatsapp.jid.UserJid> r2 = com.whatsapp.jid.UserJid.class
            java.lang.String r0 = "jid"
            com.whatsapp.jid.Jid r4 = r7.A0F(r2, r0)
            com.whatsapp.jid.UserJid r4 = (com.whatsapp.jid.UserJid) r4
            if (r4 == 0) goto L_0x004a
            X.00H r0 = r1.A0Q
            java.lang.Object r3 = r0.get()
            X.1gM r3 = (X.C31931gM) r3
            r0 = 14
            X.7Pi r2 = new X.7Pi
            r2.<init>(r1, r4, r0)
            r0 = 45
            r3.A01(r2, r0)
            X.1M9 r8 = r1.A06
            X.1M2 r2 = r8.A04
            java.util.ArrayList r6 = r2.A0N(r4)
            boolean r0 = X.C22971Dz.A0T(r4)
            if (r0 == 0) goto L_0x009f
            X.1Ln r0 = r1.A0I
            X.1E1 r4 = (X.AnonymousClass1E1) r4
            com.whatsapp.jid.PhoneUserJid r0 = r0.A0D(r4)
            if (r0 == 0) goto L_0x009f
            java.util.ArrayList r0 = r2.A0N(r0)
            r6.addAll(r0)
        L_0x009f:
            boolean r0 = r6.isEmpty()
            r0 = r0 ^ 1
            r5 = 0
            if (r0 == 0) goto L_0x0121
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r9 = r6.iterator()
        L_0x00b1:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x0114
            java.lang.Object r7 = r9.next()
            X.1E7 r7 = (X.AnonymousClass1E7) r7
            boolean r0 = r7.A10
            if (r0 == 0) goto L_0x00cf
            r7.A10 = r5
            r4.add(r7)
            X.1BI r2 = r7.A0J
            if (r2 == 0) goto L_0x00cf
            X.1Tv r0 = r1.A0A
            r0.A03(r2)
        L_0x00cf:
            X.0ve r3 = r1.A0J
            r2 = 5868(0x16ec, float:8.223E-42)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r3, r2)
            if (r0 == 0) goto L_0x00b1
            X.0z4 r0 = r1.A0G
            boolean r0 = r0.A2K()
            if (r0 == 0) goto L_0x00b1
            X.1dX r0 = r1.A05
            X.17x r2 = r0.A00
            java.lang.String r0 = "android.permission.WRITE_CONTACTS"
            int r0 = r2.A03(r0)
            if (r0 == 0) goto L_0x00b1
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r0 = "ContactUpdateNotificationHandler/handleContactRemove/soft delete because out of network: "
            r3.append(r0)
            X.2lf r0 = r7.A0H
            if (r0 == 0) goto L_0x0112
            java.lang.String r2 = r0.A01
        L_0x00ff:
            r0 = 4
            java.lang.String r0 = X.AnonymousClass1EG.A0B(r2, r0)
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            com.whatsapp.util.Log.w((java.lang.String) r0)
            r8.A0U(r7)
            goto L_0x00b1
        L_0x0112:
            r2 = 0
            goto L_0x00ff
        L_0x0114:
            boolean r0 = r4.isEmpty()
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0121
            X.1To r0 = r1.A04
            r0.A0P(r4, r14, r5)
        L_0x0121:
            X.2rV r4 = r1.A04(r14)
            if (r4 == 0) goto L_0x004a
            X.1MD[] r3 = new X.AnonymousClass1MD[r14]
            boolean r0 = r6.isEmpty()
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0149
            java.lang.String r2 = "in"
        L_0x0133:
            java.lang.String r1 = "contacts"
            X.1MD r0 = new X.1MD
            r0.<init>((java.lang.String) r1, (java.lang.String) r2)
            r3[r5] = r0
            java.lang.String r0 = "sync"
            X.1ca r1 = new X.1ca
            r1.<init>(r0, r3)
            r0 = 0
            X.C62502rV.A00(r1, r4, r0)
            return
        L_0x0149:
            java.lang.String r2 = "out"
            goto L_0x0133
        L_0x014c:
            java.lang.String r0 = "update"
            boolean r0 = X.C29621ca.A07(r7, r0)
            if (r0 == 0) goto L_0x0223
            java.lang.String r2 = "hash"
            r0 = 0
            java.lang.String r2 = r7.A0Q(r2, r0)
            if (r2 == 0) goto L_0x01a2
            int r0 = r2.length()
            if (r0 == 0) goto L_0x01a2
            java.nio.charset.Charset r0 = X.C26571Sq.A05
            byte[] r2 = r2.getBytes(r0)
            X.C18070vi.A0X(r2)
            r0 = 0
            byte[] r4 = android.util.Base64.decode(r2, r0)
            java.util.Arrays.toString(r4)
            X.2R1 r3 = X.AnonymousClass2R1.A0L
            r2 = 0
            X.2sh r0 = new X.2sh
            r0.<init>(r3, r2)
            r0.A03 = r14
            r12 = 0
            X.2qq r11 = new X.2qq
            r16 = r12
            r17 = r12
            r18 = r12
            r19 = r12
            r20 = r12
            r21 = r12
            r22 = r12
            r23 = r14
            r13 = r12
            r15 = r14
            r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
            r0.A00 = r11
            r0.A03(r4)
            X.2re r2 = r0.A02()
            goto L_0x003e
        L_0x01a2:
            java.lang.Class<com.whatsapp.jid.UserJid> r2 = com.whatsapp.jid.UserJid.class
            java.lang.String r0 = "jid"
            com.whatsapp.jid.Jid r2 = r7.A0F(r2, r0)
            X.1BI r2 = (X.AnonymousClass1BI) r2
            if (r2 == 0) goto L_0x004a
            X.1M9 r7 = r1.A06
            X.1E7 r4 = r7.A0E(r2)
            if (r4 == 0) goto L_0x004a
            X.00H r0 = r1.A0S
            java.lang.Object r5 = r0.get()
            X.2kZ r5 = (X.C58362kZ) r5
            r3 = 14
            X.3Cl r0 = new X.3Cl
            r0.<init>(r4, r1, r2, r3)
            r5.A01(r0)
            X.1Rj r0 = r1.A0N
            boolean r0 = r0.A0E(r2)
            if (r0 != 0) goto L_0x01dc
            X.1KB r5 = r1.A02
            r3 = 15
            X.7Pi r0 = new X.7Pi
            r0.<init>(r1, r2, r3)
            r5.A0J(r0)
        L_0x01dc:
            X.1RW r0 = r1.A0E
            X.1RX r0 = r0.A00()
            X.C18070vi.A0X(r0)
            boolean r0 = r0.A01(r2)
            if (r0 == 0) goto L_0x0204
            X.00H r0 = r1.A0W
            java.lang.Object r0 = r0.get()
            X.1ef r0 = (X.C30881ef) r0
            int r3 = r0.A00
            r0 = 3
            if (r3 == r0) goto L_0x0204
            X.1KB r5 = r1.A02
            r3 = 16
            X.7Pi r0 = new X.7Pi
            r0.<init>(r1, r2, r3)
            r5.A0J(r0)
        L_0x0204:
            X.0ve r11 = r1.A0J
            r3 = 4921(0x1339, float:6.896E-42)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r11, r3)
            if (r0 == 0) goto L_0x03ca
            X.00H r0 = r1.A0U
            java.lang.Object r1 = r0.get()
            X.2eo r1 = (X.C54852eo) r1
            X.10I r4 = r1.A03
            r0 = 46
            X.3Ch r3 = new X.3Ch
            r3.<init>(r1, r2, r0)
            goto L_0x0047
        L_0x0223:
            java.lang.String r0 = "sync"
            boolean r0 = X.C29621ca.A07(r7, r0)
            if (r0 == 0) goto L_0x0267
            java.lang.String r0 = "after"
            r10 = 0
            java.lang.String r2 = r7.A0Q(r0, r10)
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.SECONDS
            r4 = 0
            long r6 = X.C20099A7c.A04(r2, r4)
            long r8 = r0.toMillis(r6)
            java.util.concurrent.TimeUnit r6 = java.util.concurrent.TimeUnit.SECONDS
            java.lang.String r0 = "t"
            java.lang.String r0 = r3.A0Q(r0, r10)
            long r2 = X.C20099A7c.A04(r0, r4)
            long r6 = r6.toMillis(r2)
            X.1KB r3 = r1.A02
            r0 = 29
            X.3Bp r2 = new X.3Bp
            r2.<init>(r1, r0)
            int r0 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r0 <= 0) goto L_0x0263
            int r0 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r0 <= 0) goto L_0x0263
            long r4 = r8 - r6
        L_0x0263:
            r3.A0K(r2, r4)
            return
        L_0x0267:
            java.lang.String r0 = "modify"
            boolean r0 = X.C29621ca.A07(r7, r0)
            if (r0 == 0) goto L_0x039c
            java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.SECONDS
            java.lang.String r2 = "t"
            r0 = 0
            java.lang.String r0 = r3.A0Q(r2, r0)
            r2 = 0
            long r2 = X.C20099A7c.A04(r0, r2)
            long r2 = r4.toMillis(r2)
            java.lang.Class<com.whatsapp.jid.UserJid> r4 = com.whatsapp.jid.UserJid.class
            java.lang.String r0 = "old"
            com.whatsapp.jid.Jid r5 = r7.A0F(r4, r0)
            com.whatsapp.jid.UserJid r5 = (com.whatsapp.jid.UserJid) r5
            java.lang.String r0 = "new"
            com.whatsapp.jid.Jid r4 = r7.A0F(r4, r0)
            com.whatsapp.jid.UserJid r4 = (com.whatsapp.jid.UserJid) r4
            java.lang.Class<X.1E2> r6 = X.AnonymousClass1E2.class
            java.lang.String r0 = "old_lid"
            com.whatsapp.jid.Jid r9 = r7.A0F(r6, r0)
            com.whatsapp.jid.UserJid r9 = (com.whatsapp.jid.UserJid) r9
            java.lang.String r0 = "new_lid"
            com.whatsapp.jid.Jid r8 = r7.A0F(r6, r0)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r0 = "contactupdatenotificationhandler/handleContactModify oldUserJid="
            r6.append(r0)
            r6.append(r5)
            java.lang.String r0 = " newUserJid="
            r6.append(r0)
            r6.append(r4)
            java.lang.String r0 = r6.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            if (r5 == 0) goto L_0x004a
            if (r4 == 0) goto L_0x004a
            X.1fR r7 = r1.A01
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r0 = "ChangeNumberManager/onContactNumberChanged/oldPnJid="
            r6.append(r0)
            r6.append(r5)
            java.lang.String r0 = "; newPnJid="
            r6.append(r0)
            r6.append(r4)
            java.lang.String r0 = "/oldLidJid="
            r6.append(r0)
            r6.append(r9)
            java.lang.String r0 = "; newLidJid="
            r6.append(r0)
            r6.append(r8)
            java.lang.String r0 = r6.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r0 = 2
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>(r0)
            if (r9 == 0) goto L_0x0307
            boolean r0 = r5 instanceof com.whatsapp.jid.PhoneUserJid
            if (r0 == 0) goto L_0x0307
            X.0yx r0 = new X.0yx
            r0.<init>(r9, r5)
            r6.add(r0)
        L_0x0307:
            if (r8 == 0) goto L_0x0315
            boolean r0 = r4 instanceof com.whatsapp.jid.PhoneUserJid
            if (r0 == 0) goto L_0x0315
            X.0yx r0 = new X.0yx
            r0.<init>(r8, r4)
            r6.add(r0)
        L_0x0315:
            boolean r0 = r6.isEmpty()
            if (r0 != 0) goto L_0x0320
            X.1Ln r0 = r7.A03
            r0.A0J(r6)
        L_0x0320:
            X.1PQ r0 = r7.A05
            X.1PP r13 = r0.A02
            X.205 r6 = r13.A01(r5, r14)
            r12 = 28
            X.2MN r0 = new X.2MN
            r0.<init>(r6, r12, r2)
            r0.A01 = r5
            r0.A18(r4)
            X.122 r11 = r7.A02
            r11.BBM(r0)
            X.1SG r10 = r7.A01
            r10.A01(r5, r0)
            X.205 r6 = r13.A01(r4, r14)
            X.2MN r0 = new X.2MN
            r0.<init>(r6, r12, r2)
            r0.A01 = r5
            r0.A18(r4)
            r11.BBM(r0)
            r10.A01(r4, r0)
            if (r9 == 0) goto L_0x0376
            if (r8 == 0) goto L_0x0376
            X.205 r6 = r13.A01(r9, r14)
            X.2MN r0 = new X.2MN
            r0.<init>(r6, r12, r2)
            r0.A01 = r9
            r0.A18(r4)
            r11.BBM(r0)
            r10.A01(r9, r0)
            X.10I r3 = r7.A06
            r2 = 40
            X.DTg r0 = new X.DTg
            r0.<init>(r8, r7, r9, r2)
            r3.CGF(r0)
        L_0x0376:
            X.0zA r3 = r1.A00
            boolean r0 = r3.A07()
            if (r0 == 0) goto L_0x004a
            X.0ve r2 = r1.A0J
            r1 = 7710(0x1e1e, float:1.0804E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 == 0) goto L_0x004a
            r3.A03()
            r5.getRawString()
            r4.getRawString()
            java.lang.String r1 = "updateChatJidWhenMigrated"
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>(r1)
            throw r0
        L_0x039c:
            java.lang.String r2 = "invite"
            boolean r0 = X.C29621ca.A07(r7, r2)
            if (r0 == 0) goto L_0x03b4
            X.1kI r4 = r1.A0X
            r1 = 0
            X.0ve r6 = r4.A04
            r5 = 8400(0x20d0, float:1.1771E-41)
            X.0vf r0 = X.C18040vf.A02
            int r0 = X.C18020vd.A00(r0, r6, r5)
            if (r0 == r14) goto L_0x004a
            goto L_0x0411
        L_0x03b4:
            java.lang.String r0 = "native_contact_restore"
            boolean r0 = X.C29621ca.A07(r7, r0)
            if (r0 == 0) goto L_0x004a
            X.0z4 r0 = r1.A0G
            int r0 = r0.A0D()
            if (r0 == r14) goto L_0x004a
            X.1kK r0 = r1.A0B
            r0.A00()
            return
        L_0x03ca:
            X.118 r10 = r1.A0F
            X.10I r3 = r1.A0P
            X.190 r8 = r1.A03
            X.1OZ r15 = r1.A0M
            X.1PY r12 = r1.A0K
            X.1Mx r9 = r1.A08
            X.1KB r6 = r1.A02
            X.1To r5 = r1.A04
            X.1Lf r0 = r1.A07
            X.37P r16 = new X.37P
            r19 = r7
            r20 = r0
            r21 = r3
            r17 = r6
            r18 = r5
            r16.<init>(r17, r18, r19, r20, r21)
            X.00H r0 = r1.A0V
            java.lang.Object r13 = r0.get()
            X.C18070vi.A0X(r13)
            X.9lt r13 = (X.C191019lt) r13
            X.1PX r14 = r1.A0L
            X.2gr r7 = new X.2gr
            r17 = r3
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            long r3 = r4.A0F
            X.10I r0 = r7.A09
            r8 = 16
            X.3C3 r5 = new X.3C3
            r6 = r7
            r7 = r2
            r9 = r3
            r5.<init>(r6, r7, r8, r9)
            r0.CGF(r5)
            return
        L_0x0411:
            X.8v4 r25 = X.C173438v4.A00     // Catch:{ 1UI -> 0x04e8 }
            java.lang.String r28 = "contacts"
            java.lang.String r0 = "notification"
            X.C29621ca.A04(r3, r0)     // Catch:{ 1UI -> 0x04e8 }
            X.2rm r15 = new X.2rm     // Catch:{ 1UI -> 0x04e8 }
            r15.<init>()     // Catch:{ 1UI -> 0x04e8 }
            r5 = 3
            java.lang.String[] r6 = new java.lang.String[r5]     // Catch:{ 1UI -> 0x04e8 }
            r6[r1] = r2     // Catch:{ 1UI -> 0x04e8 }
            java.lang.String r10 = "receiver"
            r6[r14] = r10     // Catch:{ 1UI -> 0x04e8 }
            java.lang.String r7 = "user"
            r0 = 2
            r6[r0] = r7     // Catch:{ 1UI -> 0x04e8 }
            java.lang.Class<com.whatsapp.jid.UserJid> r17 = com.whatsapp.jid.UserJid.class
            r7 = -9007199254740991(0xffe0000000000001, double:-8.988465674311582E307)
            java.lang.Long r18 = java.lang.Long.valueOf(r7)     // Catch:{ 1UI -> 0x04e8 }
            r7 = 9007199254740991(0x1fffffffffffff, double:4.4501477170144023E-308)
            java.lang.Long r19 = java.lang.Long.valueOf(r7)     // Catch:{ 1UI -> 0x04e8 }
            r20 = 0
            r16 = r3
            r21 = r6
            r22 = r1
            java.lang.Object r6 = r15.A05(r16, r17, r18, r19, r20, r21, r22)     // Catch:{ 1UI -> 0x04e8 }
            com.whatsapp.jid.UserJid r6 = (com.whatsapp.jid.UserJid) r6     // Catch:{ 1UI -> 0x04e8 }
            if (r6 == 0) goto L_0x04d8
            java.lang.String[] r8 = new java.lang.String[r14]     // Catch:{ 1UI -> 0x04e8 }
            java.lang.String r7 = "from"
            r8[r1] = r7     // Catch:{ 1UI -> 0x04e8 }
            java.lang.Class<X.8v4> r22 = X.C173438v4.class
            r20 = r15
            r21 = r3
            r23 = r18
            r24 = r19
            r26 = r8
            r27 = r1
            java.lang.Object r7 = r20.A05(r21, r22, r23, r24, r25, r26, r27)     // Catch:{ 1UI -> 0x04e8 }
            if (r7 == 0) goto L_0x04d0
            java.lang.String[] r8 = new java.lang.String[r14]     // Catch:{ 1UI -> 0x04e8 }
            java.lang.String r7 = "type"
            r8[r1] = r7     // Catch:{ 1UI -> 0x04e8 }
            java.lang.Class<java.lang.String> r25 = java.lang.String.class
            r23 = r15
            r24 = r3
            r26 = r18
            r27 = r19
            r29 = r8
            r30 = r1
            java.lang.Object r7 = r23.A05(r24, r25, r26, r27, r28, r29, r30)     // Catch:{ 1UI -> 0x04e8 }
            if (r7 == 0) goto L_0x04e0
            java.lang.String[] r7 = new java.lang.String[r5]     // Catch:{ 1UI -> 0x04e8 }
            r7[r1] = r2     // Catch:{ 1UI -> 0x04e8 }
            r7[r14] = r10     // Catch:{ 1UI -> 0x04e8 }
            java.lang.String r5 = "reason"
            r7[r0] = r5     // Catch:{ 1UI -> 0x04e8 }
            java.lang.String r20 = "clicked_invite_link"
            r17 = r25
            r21 = r7
            r22 = r1
            java.lang.Object r8 = r15.A05(r16, r17, r18, r19, r20, r21, r22)     // Catch:{ 1UI -> 0x04e8 }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ 1UI -> 0x04e8 }
            X.2ow r9 = X.C60992ow.A00     // Catch:{ 1UI -> 0x04e8 }
            r7 = 14
            X.AhV r5 = new X.AhV     // Catch:{ 1UI -> 0x04e8 }
            r5.<init>(r9, r7)     // Catch:{ 1UI -> 0x04e8 }
            java.lang.Object r7 = r5.BCF(r3, r15)     // Catch:{ 1UI -> 0x04e8 }
            X.9DC r7 = (X.AnonymousClass9DC) r7     // Catch:{ 1UI -> 0x04e8 }
            if (r7 == 0) goto L_0x04c8
            java.lang.String[] r5 = new java.lang.String[r0]     // Catch:{ 1UI -> 0x04e8 }
            r5[r1] = r2     // Catch:{ 1UI -> 0x04e8 }
            r5[r14] = r10     // Catch:{ 1UI -> 0x04e8 }
            X.2V9 r0 = new X.2V9     // Catch:{ 1UI -> 0x04e8 }
            r0.<init>()     // Catch:{ 1UI -> 0x04e8 }
            java.util.ArrayList r0 = X.C29601cY.A00(r3, r5)     // Catch:{ 1UI -> 0x04e8 }
            r0.get(r1)     // Catch:{ 1UI -> 0x04e8 }
            long r0 = r7.A00     // Catch:{ 1UI -> 0x04e8 }
            r4.A00(r6, r8, r0)     // Catch:{ 1UI -> 0x04e8 }
            return
        L_0x04c8:
            java.lang.String r0 = r15.A00     // Catch:{ 1UI -> 0x04e8 }
            X.1UI r1 = new X.1UI     // Catch:{ 1UI -> 0x04e8 }
            r1.<init>((java.lang.String) r0)     // Catch:{ 1UI -> 0x04e8 }
            goto L_0x04e7
        L_0x04d0:
            java.lang.String r0 = r15.A00     // Catch:{ 1UI -> 0x04e8 }
            X.1UI r1 = new X.1UI     // Catch:{ 1UI -> 0x04e8 }
            r1.<init>((java.lang.String) r0)     // Catch:{ 1UI -> 0x04e8 }
            goto L_0x04e7
        L_0x04d8:
            java.lang.String r0 = r15.A00     // Catch:{ 1UI -> 0x04e8 }
            X.1UI r1 = new X.1UI     // Catch:{ 1UI -> 0x04e8 }
            r1.<init>((java.lang.String) r0)     // Catch:{ 1UI -> 0x04e8 }
            goto L_0x04e7
        L_0x04e0:
            java.lang.String r0 = r15.A00     // Catch:{ 1UI -> 0x04e8 }
            X.1UI r1 = new X.1UI     // Catch:{ 1UI -> 0x04e8 }
            r1.<init>((java.lang.String) r0)     // Catch:{ 1UI -> 0x04e8 }
        L_0x04e7:
            throw r1     // Catch:{ 1UI -> 0x04e8 }
        L_0x04e8:
            r2 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "InviteAcceptedNotificationHandler/handleAcceptedInvite ex="
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.e((java.lang.String) r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C34351kL.A05(X.1ca, int):void");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C34351kL(X.C19880zA r44, X.C31361fR r45, X.AnonymousClass190 r46, X.AnonymousClass1KB r47, X.AnonymousClass11S r48, X.C26811To r49, X.C30191dX r50, X.AnonymousClass1M9 r51, X.C24671Lf r52, X.C25111Mx r53, X.C24791Lr r54, X.C26881Tv r55, X.C34321kI r56, X.C34341kK r57, X.AnonymousClass12E r58, X.C26861Tt r59, X.AnonymousClass1RW r60, X.AnonymousClass118 r61, X.C19830z4 r62, X.AnonymousClass1TG r63, X.C24751Ln r64, X.C18030ve r65, X.AnonymousClass1PY r66, X.AnonymousClass1PX r67, X.AnonymousClass1OZ r68, X.AnonymousClass1N7 r69, X.C26241Rj r70, X.C27001Ui r71, X.AnonymousClass10I r72, X.AnonymousClass00H r73, X.AnonymousClass00H r74, X.AnonymousClass00H r75, X.AnonymousClass00H r76, X.AnonymousClass00H r77, X.AnonymousClass00H r78, X.AnonymousClass00H r79) {
        /*
            r43 = this;
            r14 = 1
            r16 = r46
            r0 = r16
            X.C18070vi.A0d(r0, r14)
            r1 = 2
            r24 = r65
            r0 = r24
            X.C18070vi.A0d(r0, r1)
            r1 = 3
            r40 = r47
            r0 = r40
            X.C18070vi.A0d(r0, r1)
            r1 = 4
            r39 = r48
            r0 = r39
            X.C18070vi.A0d(r0, r1)
            r1 = 5
            r27 = r61
            r0 = r27
            X.C18070vi.A0d(r0, r1)
            r0 = 6
            r13 = r72
            X.C18070vi.A0d(r13, r0)
            r1 = 7
            r38 = r49
            r0 = r38
            X.C18070vi.A0d(r0, r1)
            r1 = 8
            r18 = r69
            r0 = r18
            X.C18070vi.A0d(r0, r1)
            r0 = 9
            r12 = r68
            X.C18070vi.A0d(r12, r0)
            r1 = 10
            r23 = r66
            r0 = r23
            X.C18070vi.A0d(r0, r1)
            r1 = 11
            r36 = r51
            r0 = r36
            X.C18070vi.A0d(r0, r1)
            r0 = 12
            r11 = r70
            X.C18070vi.A0d(r11, r0)
            r1 = 13
            r35 = r52
            r0 = r35
            X.C18070vi.A0d(r0, r1)
            r1 = 14
            r25 = r64
            r0 = r25
            X.C18070vi.A0d(r0, r1)
            r1 = 15
            r42 = r44
            r0 = r42
            X.C18070vi.A0d(r0, r1)
            r1 = 16
            r33 = r54
            r0 = r33
            X.C18070vi.A0d(r0, r1)
            r1 = 17
            r30 = r58
            r0 = r30
            X.C18070vi.A0d(r0, r1)
            r0 = 18
            r10 = r73
            X.C18070vi.A0d(r10, r0)
            r0 = 19
            r8 = r74
            X.C18070vi.A0d(r8, r0)
            r1 = 20
            r26 = r63
            r0 = r26
            X.C18070vi.A0d(r0, r1)
            r1 = 21
            r37 = r50
            r0 = r37
            X.C18070vi.A0d(r0, r1)
            r1 = 22
            r41 = r45
            r0 = r41
            X.C18070vi.A0d(r0, r1)
            r1 = 23
            r32 = r55
            r0 = r32
            X.C18070vi.A0d(r0, r1)
            r0 = 24
            r6 = r75
            X.C18070vi.A0d(r6, r0)
            r1 = 25
            r34 = r53
            r0 = r34
            X.C18070vi.A0d(r0, r1)
            r0 = 26
            r9 = r71
            X.C18070vi.A0d(r9, r0)
            r0 = 27
            r5 = r76
            X.C18070vi.A0d(r5, r0)
            r0 = 28
            r4 = r77
            X.C18070vi.A0d(r4, r0)
            r0 = 29
            r3 = r78
            X.C18070vi.A0d(r3, r0)
            r0 = 30
            r2 = r79
            X.C18070vi.A0d(r2, r0)
            r7 = 31
            r22 = r67
            r0 = r22
            X.C18070vi.A0d(r0, r7)
            r7 = 32
            r29 = r59
            r0 = r29
            X.C18070vi.A0d(r0, r7)
            r7 = 33
            r28 = r60
            r0 = r28
            X.C18070vi.A0d(r0, r7)
            r0 = 35
            r7 = r62
            X.C18070vi.A0d(r7, r0)
            r15 = 36
            r31 = r57
            r0 = r31
            X.C18070vi.A0d(r0, r15)
            int[] r0 = new int[r14]
            r15 = 0
            r0[r15] = r1
            r1 = r43
            r15 = r1
            r17 = r12
            r19 = r13
            r20 = r0
            r21 = r14
            r15.<init>(r16, r17, r18, r19, r20, r21)
            r0 = r24
            r1.A0J = r0
            r0 = r40
            r1.A02 = r0
            r0 = r39
            r1.A03 = r0
            r0 = r27
            r1.A0F = r0
            r1.A0P = r13
            r0 = r38
            r1.A04 = r0
            r1.A0M = r12
            r0 = r23
            r1.A0K = r0
            r0 = r36
            r1.A06 = r0
            r1.A0N = r11
            r0 = r35
            r1.A07 = r0
            r0 = r25
            r1.A0I = r0
            r0 = r42
            r1.A00 = r0
            r0 = r33
            r1.A09 = r0
            r0 = r30
            r1.A0C = r0
            r1.A0S = r10
            r1.A0W = r8
            r0 = r26
            r1.A0H = r0
            r0 = r37
            r1.A05 = r0
            r0 = r41
            r1.A01 = r0
            r0 = r32
            r1.A0A = r0
            r1.A0T = r6
            r0 = r34
            r1.A08 = r0
            r1.A0O = r9
            r1.A0Q = r5
            r1.A0R = r4
            r1.A0U = r3
            r1.A0V = r2
            r0 = r22
            r1.A0L = r0
            r0 = r29
            r1.A0D = r0
            r0 = r28
            r1.A0E = r0
            r0 = r56
            r1.A0X = r0
            r1.A0G = r7
            r0 = r31
            r1.A0B = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C34351kL.<init>(X.0zA, X.1fR, X.190, X.1KB, X.11S, X.1To, X.1dX, X.1M9, X.1Lf, X.1Mx, X.1Lr, X.1Tv, X.1kI, X.1kK, X.12E, X.1Tt, X.1RW, X.118, X.0z4, X.1TG, X.1Ln, X.0ve, X.1PY, X.1PX, X.1OZ, X.1N7, X.1Rj, X.1Ui, X.10I, X.00H, X.00H, X.00H, X.00H, X.00H, X.00H, X.00H):void");
    }
}
