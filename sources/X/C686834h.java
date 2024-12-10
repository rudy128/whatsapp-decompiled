package X;

/* renamed from: X.34h  reason: invalid class name and case insensitive filesystem */
public final class C686834h implements C25471Oi, AnonymousClass3M6 {
    public final C51672Ze A00;
    public final C59572mW A01;
    public final AnonymousClass00H A02;
    public final AnonymousClass00H A03;

    public /* synthetic */ void BBw(AnonymousClass206 r1, C63362sw r2) {
    }

    /* JADX WARNING: type inference failed for: r0v35, types: [java.lang.Object, X.229] */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void Bvr(X.C166278cd r10, X.AnonymousClass206 r11, X.C63362sw r12) {
        /*
            r9 = this;
            r5 = 0
            X.C18070vi.A0e(r12, r5, r11)
            boolean r0 = r11 instanceof X.C439721q
            if (r0 != 0) goto L_0x00ae
            java.lang.Class<X.350> r0 = X.AnonymousClass350.class
            X.B5K r4 = X.C63362sw.A00(r12, r0)
            X.350 r4 = (X.AnonymousClass350) r4
            if (r4 == 0) goto L_0x00ae
            java.lang.Class<X.36h> r0 = X.C692036h.class
            X.25F r6 = r11.A0M(r0)
            java.lang.String r3 = r4.A04
            X.2mW r2 = r9.A01
            java.lang.String r1 = r4.A02
            if (r1 == 0) goto L_0x002d
            int r0 = r1.length()
            if (r0 == 0) goto L_0x002d
            int r0 = r1.hashCode()
            switch(r0) {
                case 3314326: goto L_0x0100;
                case 97440432: goto L_0x00f4;
                case 100355670: goto L_0x00e8;
                default: goto L_0x002d;
            }
        L_0x002d:
            X.2Qn r7 = X.C49452Qn.FULL
        L_0x002f:
            com.whatsapp.jid.UserJid r8 = r4.A01
            X.36h r0 = new X.36h
            r0.<init>(r8, r7, r3)
            r6.A02(r0)
            X.205 r0 = r11.A0v
            X.1BI r6 = r0.A00
            java.lang.String r0 = "first"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x00af
            java.lang.String r0 = "inner"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x00af
        L_0x004d:
            java.lang.String r1 = r4.A05
            java.lang.String r0 = "voice"
            if (r1 == 0) goto L_0x0068
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0068
            java.lang.Class<X.36b> r0 = X.C691436b.class
            X.25F r1 = r11.A0M(r0)
            X.36b r0 = new X.36b
            r0.<init>()
            r1.A02(r0)
        L_0x0068:
            com.whatsapp.jid.UserJid r0 = r12.A05()
            boolean r0 = X.C42701yb.A01(r0)
            if (r0 == 0) goto L_0x0085
            boolean r0 = X.C42701yb.A01(r6)
            if (r0 != 0) goto L_0x0085
            boolean r0 = X.C22971Dz.A0d(r6)
            if (r0 == 0) goto L_0x0085
            com.whatsapp.jid.UserJid r0 = r12.A05()
            r11.A0d(r0)
        L_0x0085:
            X.2Qn r0 = X.C49452Qn.FIRST
            if (r7 != r0) goto L_0x00ae
            X.00H r0 = r9.A02
            java.lang.Object r0 = r0.get()
            X.1UD r0 = (X.AnonymousClass1UD) r0
            boolean r0 = r0.A0D()
            if (r0 == 0) goto L_0x00ae
            X.00H r0 = r9.A03
            java.lang.Object r5 = r0.get()
            com.whatsapp.botinfra.message.memory.BotMemoryMetadataRepository r5 = (com.whatsapp.botinfra.message.memory.BotMemoryMetadataRepository) r5
            X.1OX r4 = r5.A05
            X.0wl r2 = r5.A04
            r0 = 0
            com.whatsapp.botinfra.message.memory.BotMemoryMetadataRepository$insertBotMemoryMetadata$1 r1 = new com.whatsapp.botinfra.message.memory.BotMemoryMetadataRepository$insertBotMemoryMetadata$1
            r1.<init>(r5, r11, r3, r0)
            java.lang.Integer r0 = X.AnonymousClass00R.A00
            X.C30451dy.A02(r0, r2, r1, r4)
        L_0x00ae:
            return
        L_0x00af:
            X.206 r0 = r2.A01(r4, r6)
            if (r0 == 0) goto L_0x00de
            byte[] r0 = r0.A1D
            if (r0 == 0) goto L_0x00de
            com.whatsapp.wamsys.JniBridge r1 = r2.A00
            X.2pN r0 = r1.WCMMessageSecretAPICreateWithSerialized(r0)
            if (r0 != 0) goto L_0x00c7
            java.lang.String r0 = "BotMessageUtil/getBotMessageSecretForFirstOrInnerBotMessage/messageSecret is null"
        L_0x00c3:
            com.whatsapp.util.Log.e((java.lang.String) r0)
            goto L_0x004d
        L_0x00c7:
            X.2bT r0 = r1.WcmBotMessageSecretAPICreateWithMessageSecret(r0)
            if (r0 != 0) goto L_0x00d0
            java.lang.String r0 = "BotMessageUtil/getBotMessageSecretForFirstOrInnerBotMessage/botMessageSecret is null"
            goto L_0x00c3
        L_0x00d0:
            com.whatsapp.wamsys.JniBridge.getInstance()
            com.facebook.simplejni.NativeHolder r2 = r0.A00
            r0 = 63
            java.lang.Object r0 = com.whatsapp.wamsys.JniBridge.jvidispatchOIO(r5, r0, r2)
            byte[] r0 = (byte[]) r0
            goto L_0x00e2
        L_0x00de:
            byte[] r0 = r2.A02(r4, r6)
        L_0x00e2:
            if (r0 == 0) goto L_0x004d
            r11.A1D = r0
            goto L_0x004d
        L_0x00e8:
            java.lang.String r0 = "inner"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x002d
            X.2Qn r7 = X.C49452Qn.INNER
            goto L_0x002f
        L_0x00f4:
            java.lang.String r0 = "first"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x002d
            X.2Qn r7 = X.C49452Qn.FIRST
            goto L_0x002f
        L_0x0100:
            java.lang.String r0 = "last"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x002d
            X.2Qn r7 = X.C49452Qn.LAST
            goto L_0x002f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C686834h.Bvr(X.8cd, X.206, X.2sw):void");
    }

    public /* synthetic */ void Bvt(C63362sw r1) {
    }

    public /* synthetic */ void CB9(C63362sw r1, C29621ca r2) {
    }

    public /* synthetic */ B5J BCv(AnonymousClass206 r2, C63362sw r3) {
        return C20699AVf.A00;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0087, code lost:
        if (r0 == false) goto L_0x0089;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ X.B5K CBD(X.C194979sb r17, X.C29621ca r18) {
        /*
            r16 = this;
            r5 = r18
            r4 = r17
            X.C18070vi.A0h(r5, r4)
            r0 = r16
            X.2Ze r3 = r0.A00
            java.lang.String r0 = "meta"
            X.1ca r6 = r5.A0K(r0)
            r9 = 0
            if (r6 == 0) goto L_0x00cc
            java.lang.String r1 = "target_id"
            X.1MD r0 = r6.A0H(r1)
            if (r0 == 0) goto L_0x00c9
            java.lang.String r10 = r6.A0Q(r1, r9)
        L_0x0021:
            java.lang.String r1 = "target_sender_jid"
            X.1MD r0 = r6.A0H(r1)
            if (r0 == 0) goto L_0x00c6
            java.lang.Class<com.whatsapp.jid.UserJid> r0 = com.whatsapp.jid.UserJid.class
            com.whatsapp.jid.Jid r2 = r6.A0F(r0, r1)
            com.whatsapp.jid.UserJid r2 = (com.whatsapp.jid.UserJid) r2
        L_0x0032:
            java.lang.String r1 = "target_chat_jid"
            X.1MD r0 = r6.A0H(r1)
            if (r0 == 0) goto L_0x00c3
            java.lang.Class<X.1BI> r0 = X.AnonymousClass1BI.class
            com.whatsapp.jid.Jid r8 = r6.A0F(r0, r1)
            X.1BI r8 = (X.AnonymousClass1BI) r8
        L_0x0043:
            java.lang.String r0 = "bot"
            X.1ca r6 = r5.A0K(r0)
            r0 = 0
            if (r6 == 0) goto L_0x00bd
            java.lang.String r7 = "edit_target_id"
            java.lang.String r11 = r6.A0Q(r7, r9)
            java.lang.String r7 = "sender_timestamp_ms"
            long r14 = r6.A0D(r7, r0)
            java.lang.String r1 = "edit"
            java.lang.String r0 = "full"
            java.lang.String r12 = r6.A0Q(r1, r0)
            java.lang.String r0 = "type"
            java.lang.String r13 = r6.A0Q(r0, r9)
        L_0x0069:
            if (r10 == 0) goto L_0x00d1
            int r0 = r10.length()
            if (r0 == 0) goto L_0x00d1
            java.lang.String r0 = "addressing_mode"
            java.lang.String r0 = X.C29621ca.A02(r5, r0)
            java.lang.String r1 = X.C42671yY.A00(r0)
            boolean r0 = r8 instanceof X.AnonymousClass1E9
            r5 = 1
            if (r0 == 0) goto L_0x0089
            java.lang.String r0 = "lid"
            boolean r0 = X.C18070vi.A18(r1, r0)
            r1 = 1
            if (r0 != 0) goto L_0x008a
        L_0x0089:
            r1 = 0
        L_0x008a:
            com.whatsapp.jid.Jid r0 = r4.A01
            boolean r0 = r0 instanceof X.C42711yc
            if (r0 == 0) goto L_0x00bb
            if (r1 != 0) goto L_0x00bb
        L_0x0092:
            boolean r0 = r8 instanceof X.AnonymousClass1E2
            if (r0 == 0) goto L_0x00a0
            if (r5 == 0) goto L_0x00a0
            X.1Ln r0 = r3.A00
            X.1E1 r8 = (X.AnonymousClass1E1) r8
            com.whatsapp.jid.PhoneUserJid r8 = r0.A0D(r8)
        L_0x00a0:
            boolean r0 = r2 instanceof X.AnonymousClass1E2
            if (r0 == 0) goto L_0x00ae
            if (r5 == 0) goto L_0x00ae
            X.1Ln r0 = r3.A00
            X.1E1 r2 = (X.AnonymousClass1E1) r2
            com.whatsapp.jid.PhoneUserJid r2 = r0.A0D(r2)
        L_0x00ae:
            boolean r0 = r2 instanceof com.whatsapp.jid.UserJid
            if (r0 == 0) goto L_0x00b5
            r9 = r2
            com.whatsapp.jid.UserJid r9 = (com.whatsapp.jid.UserJid) r9
        L_0x00b5:
            X.350 r7 = new X.350
            r7.<init>(r8, r9, r10, r11, r12, r13, r14)
            return r7
        L_0x00bb:
            r5 = 0
            goto L_0x0092
        L_0x00bd:
            r12 = r9
            r13 = r9
            r14 = 0
            r11 = r9
            goto L_0x0069
        L_0x00c3:
            r8 = r9
            goto L_0x0043
        L_0x00c6:
            r2 = r9
            goto L_0x0032
        L_0x00c9:
            r10 = r9
            goto L_0x0021
        L_0x00cc:
            r8 = r9
            r2 = r9
            r10 = r9
            goto L_0x0043
        L_0x00d1:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C686834h.CBD(X.9sb, X.1ca):X.B5K");
    }

    public /* synthetic */ void CBF(C63362sw r1, C29621ca r2) {
    }

    public C686834h(C51672Ze r1, C59572mW r2, AnonymousClass00H r3, AnonymousClass00H r4) {
        C18070vi.A0s(r2, r1, r3, r4);
        this.A01 = r2;
        this.A00 = r1;
        this.A03 = r3;
        this.A02 = r4;
    }

    public String BSr() {
        return "IncomingBotMessageHandler";
    }

    public /* synthetic */ long CBC(C29621ca r3) {
        return 0;
    }

    public /* synthetic */ boolean CM6(C63362sw r2) {
        return false;
    }

    public /* synthetic */ B5I Bvs(C166418cr r2, C63362sw r3, boolean z) {
        return C20697AVd.A00;
    }
}
