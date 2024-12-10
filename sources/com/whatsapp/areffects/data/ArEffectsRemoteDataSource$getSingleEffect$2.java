package com.whatsapp.areffects.data;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.AnonymousClass6YX;
import X.AnonymousClass7CC;
import X.AnonymousClass7SV;
import X.AnonymousClass7SW;
import X.AnonymousClass821;
import X.AnonymousClass8AB;
import X.AnonymousClass9PA;
import X.C115255te;
import X.C131206ki;
import X.C134276qK;
import X.C138506xC;
import X.C160988Aw;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import X.C75533hg;
import com.whatsapp.bot.metaai.imagineme.ImagineMeOnboardingArEffectRepository;
import com.whatsapp.productinfra.avatar.data.AvatarAREffectRepository;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.areffects.data.ArEffectsRemoteDataSource$getSingleEffect$2", f = "ArEffectsRemoteDataSource.kt", i = {}, l = {111}, m = "invokeSuspend", n = {}, s = {})
public final class ArEffectsRemoteDataSource$getSingleEffect$2 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ String $effectId;
    public final /* synthetic */ C160988Aw $requestWrapper;
    public int label;
    public final /* synthetic */ C115255te this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ArEffectsRemoteDataSource$getSingleEffect$2(C115255te r2, C160988Aw r3, String str, C30391dr r5) {
        super(2, r5);
        this.$requestWrapper = r3;
        this.this$0 = r2;
        this.$effectId = str;
    }

    public final C30391dr create(Object obj, C30391dr r6) {
        return new ArEffectsRemoteDataSource$getSingleEffect$2(this.this$0, this.$requestWrapper, this.$effectId, r6);
    }

    public final Object invokeSuspend(Object obj) {
        AnonymousClass8AB A00;
        C31751g4 r6 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            try {
                C160988Aw r2 = this.$requestWrapper;
                AnonymousClass821 r3 = new AnonymousClass821(this.this$0, this.$effectId);
                AnonymousClass7CC r22 = (AnonymousClass7CC) r2;
                if (r22.A00 != 0) {
                    A00 = ((AvatarAREffectRepository) r22.A01).A00.BGe(new AnonymousClass7SW(r3));
                } else {
                    A00 = C131206ki.A00(AnonymousClass6YX.A00, ((ImagineMeOnboardingArEffectRepository) r22.A01).A00, new AnonymousClass7SV(r3));
                }
                C115255te r0 = this.this$0;
                this.label = 1;
                obj = r0.A00(A00, "ArEffectsRemoteDataSource/getSingleEffect", this);
                if (obj == r6) {
                    return r6;
                }
            } catch (UnsupportedOperationException e) {
                throw new C75533hg(e);
            }
        } else if (i == 1) {
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        return AnonymousClass9PA.A00(((C134276qK) this.this$0.A01((C138506xC) obj, "ArEffectsRemoteDataSource/getSingleEffect")).A00);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((ArEffectsRemoteDataSource$getSingleEffect$2) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
