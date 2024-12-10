package X;

/* renamed from: X.1jZ  reason: invalid class name and case insensitive filesystem */
public class C33901jZ extends C31911gK {
    public final AnonymousClass11S A00;
    public final AnonymousClass1M9 A01;
    public final C24791Lr A02;
    public final AnonymousClass12E A03;
    public final AnonymousClass122 A04;
    public final AnonymousClass1R3 A05;
    public final C18030ve A06;
    public final C27071Up A07;
    public final AnonymousClass1PQ A08;
    public final AnonymousClass00H A09;
    public final AnonymousClass00H A0A;
    public final AnonymousClass00H A0B;
    public final AnonymousClass00H A0C;
    public final AnonymousClass00H A0D;
    public final AnonymousClass00H A0E;

    public C33901jZ(AnonymousClass190 r9, AnonymousClass11S r10, AnonymousClass1M9 r11, C24791Lr r12, AnonymousClass12E r13, AnonymousClass122 r14, AnonymousClass1R3 r15, C18030ve r16, AnonymousClass1OZ r17, AnonymousClass1N7 r18, C27071Up r19, AnonymousClass1PQ r20, AnonymousClass10I r21, AnonymousClass00H r22, AnonymousClass00H r23, AnonymousClass00H r24, AnonymousClass00H r25, AnonymousClass00H r26, AnonymousClass00H r27) {
        super(r9, r17, r18, r21, new int[]{189}, true);
        this.A06 = r16;
        this.A00 = r10;
        this.A0D = r22;
        this.A01 = r11;
        this.A0C = r23;
        this.A04 = r14;
        this.A05 = r15;
        this.A02 = r12;
        this.A03 = r13;
        this.A07 = r19;
        this.A09 = r24;
        this.A0B = r25;
        this.A08 = r20;
        this.A0E = r26;
        this.A0A = r27;
    }

    /* JADX WARNING: type inference failed for: r4v3, types: [X.2MP, X.20i, X.206] */
    /* JADX WARNING: type inference failed for: r6v6, types: [com.whatsapp.data.ProfilePhotoChange, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x01e4, code lost:
        if (r1 == 148) goto L_0x01e6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x01fc, code lost:
        if (r3.equals(r6.A0H()) == false) goto L_0x01fe;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A05(X.C29621ca r20, int r21) {
        /*
            r19 = this;
            java.lang.String r0 = "addressing_mode"
            r15 = 0
            r8 = r20
            java.lang.String r0 = r8.A0Q(r0, r15)
            java.lang.String r2 = X.C42671yY.A00(r0)
            r0 = 0
            X.1ca r6 = r8.A0J(r0)
            if (r6 == 0) goto L_0x0051
            java.lang.Class<X.1BI> r0 = X.AnonymousClass1BI.class
            java.lang.String r3 = "jid"
            com.whatsapp.jid.Jid r13 = r6.A0F(r0, r3)
            X.1BI r13 = (X.AnonymousClass1BI) r13
            r5 = r19
            if (r13 == 0) goto L_0x028b
            boolean r0 = X.C22971Dz.A0e(r13)
            if (r0 == 0) goto L_0x0052
            X.00H r0 = r5.A0D
            java.lang.Object r1 = r0.get()
            X.2mo r1 = (X.C59742mo) r1
            r0 = r13
            com.whatsapp.jid.GroupJid r0 = (com.whatsapp.jid.GroupJid) r0
            boolean r0 = r1.A02(r0, r2)
            if (r0 == 0) goto L_0x0052
            X.00H r0 = r5.A0C
            java.lang.Object r12 = r0.get()
            X.126 r12 = (X.AnonymousClass126) r12
            X.1EC r13 = (X.AnonymousClass1EC) r13
            r0 = 4
            java.lang.Integer r14 = java.lang.Integer.valueOf(r0)
            r18 = 5
            r16 = r2
            r17 = r15
            r12.A0d(r13, r14, r15, r16, r17, r18)
        L_0x0051:
            return
        L_0x0052:
            java.lang.String r0 = "t"
            java.lang.String r2 = r8.A0Q(r0, r15)
            long r0 = java.lang.System.currentTimeMillis()
            long r1 = X.C20099A7c.A04(r2, r0)
            java.lang.Class<com.whatsapp.jid.UserJid> r3 = com.whatsapp.jid.UserJid.class
            java.lang.String r0 = "author"
            com.whatsapp.jid.Jid r3 = r6.A0F(r3, r0)
            X.1BI r3 = (X.AnonymousClass1BI) r3
            java.lang.Class<com.whatsapp.jid.PhoneUserJid> r4 = com.whatsapp.jid.PhoneUserJid.class
            java.lang.String r0 = "author_phone_number"
            com.whatsapp.jid.Jid r7 = r6.A0F(r4, r0)
            boolean r0 = X.C22971Dz.A0T(r3)
            if (r0 == 0) goto L_0x008a
            if (r7 == 0) goto L_0x008a
            X.00H r0 = r5.A0E
            java.lang.Object r4 = r0.get()
            X.1fv r4 = (X.C31661fv) r4
            java.util.Map r0 = java.util.Collections.singletonMap(r3, r7)
            r4.A01(r0)
        L_0x008a:
            java.lang.String r7 = "id"
            java.lang.String r4 = r8.A0P(r7)
            java.lang.String r0 = "set"
            boolean r0 = X.C29621ca.A07(r6, r0)
            if (r0 == 0) goto L_0x0149
            java.lang.String r6 = r6.A0Q(r7, r15)
            r0 = -1
            int r7 = X.C20099A7c.A01(r6, r0)
        L_0x00a2:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r0 = "ProfilePictureNotificationHandler/onProfilePhotoChange "
            r6.append(r0)
            r6.append(r13)
            java.lang.String r0 = " author:"
            r6.append(r0)
            r6.append(r3)
            java.lang.String r0 = " photoId:"
            r6.append(r0)
            r6.append(r7)
            java.lang.String r0 = r6.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            boolean r0 = X.C22971Dz.A0T(r13)
            r6 = 0
            X.1M9 r10 = r5.A01
            if (r0 == 0) goto L_0x0141
            X.1E7 r0 = r10.A0E(r13)
            if (r0 == 0) goto L_0x00dd
            r9.add(r0)
        L_0x00dd:
            r8 = r13
            X.1E1 r8 = (X.AnonymousClass1E1) r8
            X.1Ln r0 = r10.A0G
            com.whatsapp.jid.PhoneUserJid r0 = r0.A0D(r8)
            if (r0 == 0) goto L_0x00f1
            X.1E7 r0 = r10.A0E(r0)
            if (r0 == 0) goto L_0x00f1
            r9.add(r0)
        L_0x00f1:
            X.11S r0 = r5.A00
            r0.A0I()
            com.whatsapp.jid.PhoneUserJid r0 = r0.A0E
            if (r0 == 0) goto L_0x02c0
            java.util.Iterator r12 = r9.iterator()
        L_0x00fe:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L_0x0154
            java.lang.Object r8 = r12.next()
            X.1E7 r8 = (X.AnonymousClass1E7) r8
            int r0 = r8.A07
            if (r0 != r7) goto L_0x0113
            int r0 = r8.A08
            if (r0 != r7) goto L_0x0113
            goto L_0x00fe
        L_0x0113:
            X.1BI r10 = r8.A0J
            if (r10 == 0) goto L_0x00fe
            X.1Up r11 = r5.A07
            X.1M9 r0 = r11.A01
            X.1E7 r9 = r0.A0H(r10)
            int r0 = r9.A07
            if (r0 != r7) goto L_0x0127
            int r0 = r9.A08
            if (r0 == r7) goto L_0x00fe
        L_0x0127:
            r0 = -1
            if (r7 != r0) goto L_0x0130
            X.1Tv r0 = r11.A04
            r0.A03(r10)
            goto L_0x00fe
        L_0x0130:
            X.00H r0 = r11.A09
            java.lang.Object r8 = r0.get()
            X.2kZ r8 = (X.C58362kZ) r8
            X.3Cs r0 = new X.3Cs
            r0.<init>((X.AnonymousClass1E7) r9, (X.AnonymousClass1BI) r10, (X.C27071Up) r11, (int) r7)
            r8.A01(r0)
            goto L_0x00fe
        L_0x0141:
            X.1E7 r15 = r10.A0H(r13)
            r9.add(r15)
            goto L_0x00f1
        L_0x0149:
            java.lang.String r0 = "delete"
            boolean r0 = X.C29621ca.A07(r6, r0)
            if (r0 == 0) goto L_0x020e
            r7 = -1
            goto L_0x00a2
        L_0x0154:
            if (r15 == 0) goto L_0x0051
            boolean r0 = r15.A0F()
            if (r0 == 0) goto L_0x0051
            int r0 = r15.A07
            if (r0 != r7) goto L_0x0165
            int r0 = r15.A08
            if (r0 != r7) goto L_0x0165
            return
        L_0x0165:
            X.1Lr r0 = r5.A02
            java.io.File r8 = r0.A01(r15)
            if (r8 == 0) goto L_0x0187
            boolean r0 = r8.exists()
            if (r0 == 0) goto L_0x0187
            com.whatsapp.data.ProfilePhotoChange r6 = new com.whatsapp.data.ProfilePhotoChange
            r6.<init>()
            r6.newPhotoId = r7
            byte[] r0 = X.AnonymousClass1EW.A00(r8)     // Catch:{ IOException -> 0x0181 }
            r6.oldPhoto = r0     // Catch:{ IOException -> 0x0181 }
            goto L_0x0187
        L_0x0181:
            r8 = move-exception
            java.lang.String r0 = "app/xmpp/recv/handle_profile_photo_changed/"
            com.whatsapp.util.Log.w(r0, r8)
        L_0x0187:
            android.os.Parcelable$Creator r0 = X.AnonymousClass1EC.CREATOR
            X.1EC r8 = X.C42941yz.A00(r13)
            if (r8 == 0) goto L_0x01ac
            X.00H r0 = r5.A09
            java.lang.Object r0 = r0.get()
            X.1kb r0 = (X.C34511kb) r0
            X.1EC r0 = r0.A05(r8)
            if (r0 == 0) goto L_0x01ac
            X.00H r0 = r5.A0B
            java.lang.Object r0 = r0.get()
            X.1MZ r0 = (X.AnonymousClass1MZ) r0
            boolean r0 = r0.A0J(r8)
            if (r0 != 0) goto L_0x01ac
            return
        L_0x01ac:
            r8 = 1000(0x3e8, double:4.94E-321)
            long r1 = r1 * r8
            r0 = 1
            X.205 r8 = new X.205
            r8.<init>(r13, r4, r0)
            r0 = 6
            X.2MP r4 = new X.2MP
            r4.<init>(r8, r0, r1)
            r0 = -1
            if (r7 != r0) goto L_0x0209
            r0 = 0
        L_0x01bf:
            r4.A0i(r0)
            r4.A0d(r3)
            r4.A00 = r6
            X.1R3 r0 = r5.A05
            X.206 r6 = r0.A05(r13)
            boolean r0 = r6 instanceof X.C436420i
            if (r0 == 0) goto L_0x0203
            X.20i r6 = (X.C436420i) r6
            int r1 = r6.A00
            r0 = 11
            if (r1 == r0) goto L_0x01e6
            r0 = 167(0xa7, float:2.34E-43)
            if (r1 == r0) goto L_0x01e6
            r0 = 143(0x8f, float:2.0E-43)
            if (r1 == r0) goto L_0x01e6
            r0 = 148(0x94, float:2.07E-43)
            r2 = 0
            if (r1 != r0) goto L_0x01e7
        L_0x01e6:
            r2 = 1
        L_0x01e7:
            X.1BI r0 = r4.A0H()
            if (r0 == 0) goto L_0x01fe
            boolean r0 = r6.A17()
            if (r0 == 0) goto L_0x01fe
            X.1BI r0 = r6.A0H()
            boolean r1 = r3.equals(r0)
            r0 = 1
            if (r1 != 0) goto L_0x01ff
        L_0x01fe:
            r0 = 0
        L_0x01ff:
            if (r2 == 0) goto L_0x0203
            if (r0 != 0) goto L_0x0051
        L_0x0203:
            X.122 r0 = r5.A04
            r0.BBM(r4)
            return
        L_0x0209:
            java.lang.String r0 = java.lang.Integer.toString(r7)
            goto L_0x01bf
        L_0x020e:
            java.lang.String r0 = "request"
            boolean r0 = X.C29621ca.A07(r6, r0)
            if (r0 == 0) goto L_0x0245
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "ProfilePictureNotificationHandler/onProfilePhotoLost "
            r1.append(r0)
            r1.append(r13)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            boolean r0 = X.AnonymousClass73O.A02(r13)
            if (r0 != 0) goto L_0x0051
            X.11S r0 = r5.A00
            r0.A0I()
            X.1E8 r1 = r0.A0D
            if (r1 == 0) goto L_0x0051
            boolean r0 = r0.A0O(r13)
            if (r0 == 0) goto L_0x0051
            X.1Up r0 = r5.A07
            r0.A0E(r1)
            return
        L_0x0245:
            java.lang.String r0 = "set_avatar"
            boolean r0 = X.C29621ca.A07(r6, r0)
            if (r0 == 0) goto L_0x0051
            X.0ve r2 = r5.A06
            r1 = 9156(0x23c4, float:1.283E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 == 0) goto L_0x0051
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "ProfilePictureNotificationHandler/onAvatarPhotoChange jid:"
            r1.append(r0)
            r1.append(r13)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            com.whatsapp.jid.UserJid r13 = (com.whatsapp.jid.UserJid) r13
            X.00H r0 = r5.A0A
            java.lang.Object r1 = r0.get()
            com.whatsapp.productinfra.avatar.coinflip.ContactAvatarCoinFlipRepository r1 = (com.whatsapp.productinfra.avatar.coinflip.ContactAvatarCoinFlipRepository) r1
            r0 = 0
            X.C18070vi.A0d(r13, r0)
            X.1OX r3 = r1.A06
            com.whatsapp.productinfra.avatar.coinflip.ContactAvatarCoinFlipRepository$updateContactAvatarPicAsync$1 r2 = new com.whatsapp.productinfra.avatar.coinflip.ContactAvatarCoinFlipRepository$updateContactAvatarPicAsync$1
            r2.<init>(r13, r1, r15)
            X.1OR r1 = X.AnonymousClass1OR.A00
            java.lang.Integer r0 = X.AnonymousClass00R.A00
            X.C30451dy.A02(r0, r1, r2, r3)
            return
        L_0x028b:
            java.lang.String r0 = "hash"
            java.lang.String r1 = r6.A0Q(r0, r15)
            if (r1 == 0) goto L_0x02c8
            X.2qq r4 = X.C62132qq.A0N
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x0051
            byte[] r1 = r1.getBytes()
            r0 = 0
            byte[] r3 = android.util.Base64.decode(r1, r0)
            java.util.Arrays.toString(r3)
            X.2R1 r1 = X.AnonymousClass2R1.A0L
            X.2sh r0 = new X.2sh
            r0.<init>(r1, r15)
            r2 = 1
            r0.A03 = r2
            r0.A00 = r4
            r0.A03(r3)
            X.2re r1 = r0.A02()
            X.12E r0 = r5.A03
            X.AnonymousClass12E.A00(r0, r1, r2)
            return
        L_0x02c0:
            java.lang.String r1 = "local JID unknown"
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r0.<init>(r1)
            throw r0
        L_0x02c8:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "ProfilePictureNotificationHandler/handleNotification/ignoring notification for invalid jid: "
            r1.append(r0)
            java.lang.String r0 = r6.A0Q(r3, r15)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.w((java.lang.String) r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C33901jZ.A05(X.1ca, int):void");
    }
}
