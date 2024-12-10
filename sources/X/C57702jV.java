package X;

import com.whatsapp.wamsys.JniBridge;

/* renamed from: X.2jV  reason: invalid class name and case insensitive filesystem */
public final class C57702jV {
    public final JniBridge A00;
    public final AnonymousClass00H A01;
    public final C26011Qm A02;
    public final C24751Ln A03;

    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00da, code lost:
        r5 = r10.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00e2, code lost:
        r5 = r10.A00;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final byte[] A00(X.AnonymousClass350 r11, X.AnonymousClass1BI r12, com.whatsapp.jid.UserJid r13, X.AnonymousClass206 r14, java.lang.String r15, java.lang.String r16, byte[] r17) {
        /*
            r10 = this;
            java.lang.String r4 = r11.A04
            r9 = 0
            if (r13 != 0) goto L_0x000b
            java.lang.String r0 = "BotMessageDecryptionManager/decryptMessageSecretMessage/sender jid is empty"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            return r9
        L_0x000b:
            if (r14 != 0) goto L_0x0075
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "BotMessageDecryptionManager/getBotMessageSecret/getting bot message secret from bot message targetId="
            X.C17900vP.A0f(r0, r4, r1)
            X.00H r0 = r10.A01
            java.lang.Object r0 = r0.get()
            X.2mW r0 = (X.C59572mW) r0
            byte[] r1 = r0.A02(r11, r12)
            if (r1 == 0) goto L_0x0091
            r0 = 29
            java.lang.Object r0 = com.whatsapp.wamsys.JniBridge.jvidispatchOO(r0, r1)
            com.facebook.simplejni.NativeHolder r0 = (com.facebook.simplejni.NativeHolder) r0
            X.2bT r6 = new X.2bT
            r6.<init>(r0)
        L_0x0031:
            X.1Dw r0 = com.whatsapp.jid.UserJid.Companion
            com.whatsapp.jid.UserJid r0 = r11.A01
            com.whatsapp.jid.UserJid r7 = X.C22941Dw.A01(r0)
            if (r7 != 0) goto L_0x0043
            if (r14 == 0) goto L_0x0043
            X.1Qm r0 = r10.A02
            com.whatsapp.jid.UserJid r7 = r0.A01(r14)
        L_0x0043:
            boolean r0 = X.C22971Dz.A0M(r13)
            if (r0 == 0) goto L_0x0055
            boolean r0 = X.C22971Dz.A0T(r7)
            if (r0 != 0) goto L_0x0055
            X.1Ln r0 = r10.A03
            com.whatsapp.jid.UserJid r7 = r0.A0F(r7)
        L_0x0055:
            if (r7 != 0) goto L_0x00d0
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "BotMessageDecryptionManager/decryptMessageSecretMessage/originalUserJid is null targetId="
            r1.append(r0)
            r1.append(r4)
            java.lang.String r0 = " targetMsg="
            r1.append(r0)
            if (r14 == 0) goto L_0x0073
            X.205 r0 = r14.A0v
        L_0x006c:
            r1.append(r0)
            X.C17890vO.A0w(r1)
            return r9
        L_0x0073:
            r0 = r9
            goto L_0x006c
        L_0x0075:
            byte[] r0 = r14.A1D
            if (r0 != 0) goto L_0x00b4
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "BotMessageDecryptionManager/getBotMessageSecret/target msg no secret; key="
            r1.append(r0)
            X.205 r0 = r14.A0v
            r1.append(r0)
            java.lang.String r0 = "; type="
            X.AnonymousClass206.A07(r14, r0, r1)
            java.lang.String r0 = "; targetId="
        L_0x008e:
            X.C17900vP.A0e(r0, r4, r1)
        L_0x0091:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "BotMessageDecryptionManager/decryptMessageSecretMessage/botMessageSecret is null, targetId="
            r1.append(r0)
            r1.append(r4)
            java.lang.String r0 = "; senderJid="
            r1.append(r0)
            r1.append(r13)
            java.lang.String r0 = "; targetChatJid="
            r1.append(r0)
            X.1BI r0 = r11.A00
            java.lang.String r0 = X.C17890vO.A0V(r0, r1)
            com.whatsapp.util.Log.w((java.lang.String) r0)
            return r9
        L_0x00b4:
            com.whatsapp.wamsys.JniBridge r1 = r10.A00
            X.2pN r0 = r1.WCMMessageSecretAPICreateWithSerialized(r0)
            if (r0 != 0) goto L_0x00c3
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "BotMessageDecryptionManager/getBotMessageSecret/messageSecret is null; targetId="
            goto L_0x008e
        L_0x00c3:
            X.2bT r6 = r1.WcmBotMessageSecretAPICreateWithMessageSecret(r0)
            if (r6 != 0) goto L_0x0031
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "BotMessageDecryptionManager/getBotMessageSecret/botMessageSecret is null; targetId="
            goto L_0x008e
        L_0x00d0:
            r1 = r16
            if (r16 == 0) goto L_0x00e2
            int r0 = r1.length()
            if (r0 == 0) goto L_0x00e2
            com.whatsapp.wamsys.JniBridge r5 = r10.A00
            X.2bU r2 = r5.WcmMsmsgSecretAPICreateFromBotMessageSecret(r6, r1, r7, r13)
            if (r2 != 0) goto L_0x00f4
        L_0x00e2:
            com.whatsapp.wamsys.JniBridge r5 = r10.A00
            X.2bU r2 = r5.WcmMsmsgSecretAPICreateFromBotMessageSecret(r6, r15, r7, r13)
            if (r2 != 0) goto L_0x00f4
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "BotMessageDecryptionManager/decryptMessageSecretMessage/msmsgSecret is null targetId="
        L_0x00f0:
            X.C17900vP.A0e(r0, r4, r1)
            return r9
        L_0x00f4:
            java.util.concurrent.atomic.AtomicReference r0 = r5.wajContext
            java.lang.Object r1 = r0.get()
            com.facebook.simplejni.NativeHolder r0 = r2.A00
            r3 = 4
            r8 = r17
            java.lang.Object r0 = com.whatsapp.wamsys.JniBridge.jvidispatchOOOO(r3, r1, r0, r8)
            byte[] r0 = (byte[]) r0
            if (r0 != 0) goto L_0x0124
            X.2bU r2 = r5.WcmMsmsgSecretAPICreateFromBotMessageSecret(r6, r15, r7, r13)
            if (r2 == 0) goto L_0x011d
            java.util.concurrent.atomic.AtomicReference r0 = r5.wajContext
            java.lang.Object r1 = r0.get()
            com.facebook.simplejni.NativeHolder r0 = r2.A00
            java.lang.Object r0 = com.whatsapp.wamsys.JniBridge.jvidispatchOOOO(r3, r1, r0, r8)
            byte[] r0 = (byte[]) r0
            if (r0 != 0) goto L_0x0124
        L_0x011d:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "BotMessageDecryptionManager/decryptMessageSecretMessage/msmsg decrypt fails targetId="
            goto L_0x00f0
        L_0x0124:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C57702jV.A00(X.350, X.1BI, com.whatsapp.jid.UserJid, X.206, java.lang.String, java.lang.String, byte[]):byte[]");
    }

    public C57702jV(C26011Qm r1, C24751Ln r2, JniBridge jniBridge, AnonymousClass00H r4) {
        C18070vi.A0s(jniBridge, r4, r2, r1);
        this.A00 = jniBridge;
        this.A01 = r4;
        this.A03 = r2;
        this.A02 = r1;
    }
}
