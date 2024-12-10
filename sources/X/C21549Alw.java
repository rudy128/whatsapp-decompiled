package X;

/* renamed from: X.Alw  reason: case insensitive filesystem */
public final /* synthetic */ class C21549Alw implements AnonymousClass20H {
    public final /* synthetic */ C194959sZ A00;
    public final /* synthetic */ A2I A01;

    /* JADX WARNING: Removed duplicated region for block: B:6:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0070  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invoke(java.lang.Object r19, java.lang.Object r20, java.lang.Object r21, java.lang.Object r22, java.lang.Object r23) {
        /*
            r18 = this;
            r11 = r20
            r7 = r19
            r15 = r23
            r10 = r22
            r6 = r21
            r0 = r18
            X.A2I r8 = r0.A01
            X.9sZ r1 = r0.A00
            X.205 r7 = (X.AnonymousClass205) r7
            byte[] r11 = (byte[]) r11
            com.whatsapp.jid.UserJid r6 = (com.whatsapp.jid.UserJid) r6
            com.whatsapp.jid.UserJid r10 = (com.whatsapp.jid.UserJid) r10
            byte[] r15 = (byte[]) r15
            r5 = 0
            r4 = 0
            X.C18070vi.A0w(r1, r7, r11, r6, r10)
            r0 = 6
            X.C18070vi.A0d(r15, r0)
            java.lang.String r9 = r1.A02
            X.B84 r0 = X.A2I.A00(r10, r7, r9)
            com.whatsapp.wamsys.JniBridge r12 = r8.A01
            java.lang.String r1 = r7.A01
            X.C18070vi.A0X(r1)
            byte[] r16 = r0.BMI()
            int r2 = r11.length
            r0 = 32
            if (r2 == r0) goto L_0x0076
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "MessageEncUtils/encryptEncMessage: invalid message_secret secretSize="
            java.lang.String r0 = X.AnonymousClass001.A1I(r0, r1, r2)
        L_0x0043:
            com.whatsapp.util.Log.e((java.lang.String) r0)
            r3 = 0
        L_0x0047:
            X.8X7 r2 = X.C166408cq.A00()
            X.00H r0 = r8.A03
            java.lang.Object r1 = r0.get()
            X.9lu r1 = (X.C191029lu) r1
            X.C18070vi.A0b(r2)
            r0 = 0
            r1.A00(r6, r2, r7, r0)
            X.Bm6 r0 = r2.A0C()
            if (r3 != 0) goto L_0x0070
            java.lang.String r0 = "Encryption using iJniBridge failed"
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0n(r0)
            X.1IU r1 = X.C30691eM.A00(r0)
        L_0x006a:
            X.1eK r0 = new X.1eK
            r0.<init>(r1)
            return r0
        L_0x0070:
            X.7PS r1 = new X.7PS
            r1.<init>(r5, r4, r0)
            goto L_0x006a
        L_0x0076:
            r3 = 12
            byte[] r14 = X.AnonymousClass8BV.A1a(r3)
            byte[] r13 = X.C60612oK.A01(r6, r10, r9, r1, r11)
            X.C18070vi.A0X(r13)
            r17 = 16
            byte[] r2 = r12.WCIAPIGcmAesCreateEncryptedCiphertext(r13, r14, r15, r16, r17)
            if (r2 == 0) goto L_0x0099
            int r1 = r2.length
            if (r1 == 0) goto L_0x0099
            r0 = 0
            X.BmB r5 = X.DSQ.A01(r14, r0, r3)
            X.BmB r4 = X.DSQ.A01(r2, r0, r1)
            r3 = 1
            goto L_0x0047
        L_0x0099:
            java.lang.String r0 = "MessageEncUtils/encryptEncMessage encryption values are invalid"
            goto L_0x0043
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21549Alw.invoke(java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public /* synthetic */ C21549Alw(C194959sZ r1, A2I a2i) {
        this.A01 = a2i;
        this.A00 = r1;
    }
}
