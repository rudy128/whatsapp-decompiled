package com.whatsapp.productinfra.avatar.coinflip;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.C24671Lf;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import com.whatsapp.jid.UserJid;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.productinfra.avatar.coinflip.ContactAvatarCoinFlipRepository$notifyContactPhotoChangeIfNecessary$2", f = "ContactAvatarCoinFlipRepository.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class ContactAvatarCoinFlipRepository$notifyContactPhotoChangeIfNecessary$2 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ UserJid $jid;
    public int label;
    public final /* synthetic */ ContactAvatarCoinFlipRepository this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ContactAvatarCoinFlipRepository$notifyContactPhotoChangeIfNecessary$2(UserJid userJid, ContactAvatarCoinFlipRepository contactAvatarCoinFlipRepository, C30391dr r4) {
        super(2, r4);
        this.this$0 = contactAvatarCoinFlipRepository;
        this.$jid = userJid;
    }

    public final C30391dr create(Object obj, C30391dr r5) {
        return new ContactAvatarCoinFlipRepository$notifyContactPhotoChangeIfNecessary$2(this.$jid, this.this$0, r5);
    }

    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            C30691eM.A01(obj);
            ((C24671Lf) this.this$0.A04.get()).A01(this.$jid);
            ((C24671Lf) this.this$0.A04.get()).A00(this.$jid);
            return C27621Wu.A00;
        }
        throw AnonymousClass000.A0l();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((ContactAvatarCoinFlipRepository$notifyContactPhotoChangeIfNecessary$2) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
