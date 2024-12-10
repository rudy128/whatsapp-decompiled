package com.whatsapp.productinfra.avatar.coinflip;

import X.AnonymousClass1OS;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import com.whatsapp.jid.UserJid;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.productinfra.avatar.coinflip.ContactAvatarCoinFlipRepository$updateContactAvatarPicAsync$1", f = "ContactAvatarCoinFlipRepository.kt", i = {}, l = {59, 60}, m = "invokeSuspend", n = {}, s = {})
public final class ContactAvatarCoinFlipRepository$updateContactAvatarPicAsync$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ UserJid $jid;
    public int label;
    public final /* synthetic */ ContactAvatarCoinFlipRepository this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ContactAvatarCoinFlipRepository$updateContactAvatarPicAsync$1(UserJid userJid, ContactAvatarCoinFlipRepository contactAvatarCoinFlipRepository, C30391dr r4) {
        super(2, r4);
        this.this$0 = contactAvatarCoinFlipRepository;
        this.$jid = userJid;
    }

    public final C30391dr create(Object obj, C30391dr r5) {
        return new ContactAvatarCoinFlipRepository$updateContactAvatarPicAsync$1(this.$jid, this.this$0, r5);
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0063 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            X.1g4 r3 = X.C31751g4.COROUTINE_SUSPENDED
            int r0 = r7.label
            r4 = 2
            r5 = 1
            if (r0 == 0) goto L_0x0012
            if (r0 == r5) goto L_0x0054
            if (r0 != r4) goto L_0x0064
            X.C30691eM.A01(r8)
        L_0x000f:
            X.1Wu r0 = X.C27621Wu.A00
            return r0
        L_0x0012:
            X.C30691eM.A01(r8)
            com.whatsapp.productinfra.avatar.coinflip.ContactAvatarCoinFlipRepository r2 = r7.this$0
            com.whatsapp.jid.UserJid r6 = r7.$jid
            X.00H r0 = r2.A03
            X.1ga r1 = X.C108975cc.A0E(r0)
            java.lang.String r0 = r6.user
            r1.A0E(r0)
            X.00H r0 = r2.A00
            java.lang.Object r2 = r0.get()
            X.73M r2 = (X.AnonymousClass73M) r2
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = r6.user
            r1.append(r0)
            java.lang.String r0 = ".jpg"
            java.lang.String r1 = X.AnonymousClass000.A0y(r0, r1)
            X.118 r0 = r2.A00
            java.io.File r0 = X.C108945cZ.A16(r0)
            X.C18070vi.A0X(r0)
            X.AnonymousClass73M.A03(r1, r0)
            com.whatsapp.productinfra.avatar.coinflip.ContactAvatarCoinFlipRepository r1 = r7.this$0
            com.whatsapp.jid.UserJid r0 = r7.$jid
            r7.label = r5
            java.lang.Object r0 = com.whatsapp.productinfra.avatar.coinflip.ContactAvatarCoinFlipRepository.A01(r0, r1, r7)
            if (r0 != r3) goto L_0x0057
            return r3
        L_0x0054:
            X.C30691eM.A01(r8)
        L_0x0057:
            com.whatsapp.productinfra.avatar.coinflip.ContactAvatarCoinFlipRepository r1 = r7.this$0
            com.whatsapp.jid.UserJid r0 = r7.$jid
            r7.label = r4
            java.lang.Object r0 = com.whatsapp.productinfra.avatar.coinflip.ContactAvatarCoinFlipRepository.A02(r0, r1, r7)
            if (r0 != r3) goto L_0x000f
            return r3
        L_0x0064:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.productinfra.avatar.coinflip.ContactAvatarCoinFlipRepository$updateContactAvatarPicAsync$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((ContactAvatarCoinFlipRepository$updateContactAvatarPicAsync$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
