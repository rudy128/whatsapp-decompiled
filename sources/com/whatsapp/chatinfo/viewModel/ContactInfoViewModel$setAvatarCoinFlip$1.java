package com.whatsapp.chatinfo.viewModel;

import X.AnonymousClass000;
import X.AnonymousClass1DT;
import X.AnonymousClass1OS;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30451dy;
import X.C30691eM;
import X.C31751g4;
import X.C76813oT;
import X.C822845e;
import X.C822945f;
import X.C823045g;
import android.graphics.Bitmap;
import com.whatsapp.jid.UserJid;
import com.whatsapp.productinfra.avatar.coinflip.ContactAvatarCoinFlipRepository;
import com.whatsapp.productinfra.avatar.coinflip.ContactAvatarCoinFlipRepository$getContactAvatarPic$2;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.chatinfo.viewModel.ContactInfoViewModel$setAvatarCoinFlip$1", f = "ContactInfoViewModel.kt", i = {}, l = {414}, m = "invokeSuspend", n = {}, s = {})
public final class ContactInfoViewModel$setAvatarCoinFlip$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ Bitmap $profilePic;
    public final /* synthetic */ UserJid $userJid;
    public int label;
    public final /* synthetic */ C76813oT this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ContactInfoViewModel$setAvatarCoinFlip$1(Bitmap bitmap, C76813oT r3, UserJid userJid, C30391dr r5) {
        super(2, r5);
        this.$profilePic = bitmap;
        this.this$0 = r3;
        this.$userJid = userJid;
    }

    public final C30391dr create(Object obj, C30391dr r6) {
        return new ContactInfoViewModel$setAvatarCoinFlip$1(this.$profilePic, this.this$0, this.$userJid, r6);
    }

    public final Object invokeSuspend(Object obj) {
        AnonymousClass1DT r1;
        Object r0;
        C31751g4 r6 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            Bitmap bitmap = this.$profilePic;
            if (bitmap != null) {
                this.this$0.A0F.A0F(new C822945f(bitmap));
            }
            ContactAvatarCoinFlipRepository contactAvatarCoinFlipRepository = (ContactAvatarCoinFlipRepository) this.this$0.A0d.get();
            UserJid userJid = this.$userJid;
            this.label = 1;
            obj = C30451dy.A00(this, contactAvatarCoinFlipRepository.A05, new ContactAvatarCoinFlipRepository$getContactAvatarPic$2(userJid, contactAvatarCoinFlipRepository, (C30391dr) null, true));
            if (obj == r6) {
                return r6;
            }
        } else if (i == 1) {
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        Bitmap bitmap2 = (Bitmap) obj;
        Bitmap bitmap3 = this.$profilePic;
        if (bitmap3 != null) {
            if (bitmap2 != null) {
                C76813oT r12 = this.this$0;
                if (r12.A02.A0g) {
                    r1 = r12.A0F;
                    r0 = new C823045g(bitmap3, bitmap2);
                }
            }
            return C27621Wu.A00;
        }
        if (bitmap2 != null) {
            r1 = this.this$0.A0F;
            r0 = new C822845e(bitmap2);
        }
        return C27621Wu.A00;
        r1.A0F(r0);
        return C27621Wu.A00;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((ContactInfoViewModel$setAvatarCoinFlip$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
