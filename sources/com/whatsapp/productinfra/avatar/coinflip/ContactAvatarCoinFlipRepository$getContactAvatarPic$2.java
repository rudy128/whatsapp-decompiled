package com.whatsapp.productinfra.avatar.coinflip;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import com.whatsapp.jid.UserJid;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.productinfra.avatar.coinflip.ContactAvatarCoinFlipRepository$getContactAvatarPic$2", f = "ContactAvatarCoinFlipRepository.kt", i = {}, l = {68, 70}, m = "invokeSuspend", n = {}, s = {})
public final class ContactAvatarCoinFlipRepository$getContactAvatarPic$2 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ UserJid $jid;
    public final /* synthetic */ boolean $useCache;
    public int label;
    public final /* synthetic */ ContactAvatarCoinFlipRepository this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ContactAvatarCoinFlipRepository$getContactAvatarPic$2(UserJid userJid, ContactAvatarCoinFlipRepository contactAvatarCoinFlipRepository, C30391dr r4, boolean z) {
        super(2, r4);
        this.$useCache = z;
        this.this$0 = contactAvatarCoinFlipRepository;
        this.$jid = userJid;
    }

    public final C30391dr create(Object obj, C30391dr r6) {
        boolean z = this.$useCache;
        return new ContactAvatarCoinFlipRepository$getContactAvatarPic$2(this.$jid, this.this$0, r6, z);
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 r5 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            boolean z = this.$useCache;
            ContactAvatarCoinFlipRepository contactAvatarCoinFlipRepository = this.this$0;
            UserJid userJid = this.$jid;
            if (z) {
                obj = contactAvatarCoinFlipRepository.A03(userJid);
                if (obj == null) {
                    contactAvatarCoinFlipRepository = this.this$0;
                    userJid = this.$jid;
                    this.label = 1;
                }
            } else {
                this.label = 2;
            }
            obj = ContactAvatarCoinFlipRepository.A01(userJid, contactAvatarCoinFlipRepository, this);
            if (obj == r5) {
                return r5;
            }
        } else if (i == 1 || i == 2) {
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        return obj;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((ContactAvatarCoinFlipRepository$getContactAvatarPic$2) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
