package com.whatsapp.profile.coinflip.preview;

import X.AnonymousClass000;
import X.AnonymousClass1E7;
import X.AnonymousClass1OS;
import X.C18600wl;
import X.C22821Di;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30451dy;
import X.C30691eM;
import X.C31751g4;
import com.whatsapp.jid.UserJid;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.profile.coinflip.preview.CoinFlipPreviewViewModel$getOtherProfileContact$1", f = "CoinFlipPreviewViewModel.kt", i = {}, l = {95}, m = "invokeSuspend", n = {}, s = {})
public final class CoinFlipPreviewViewModel$getOtherProfileContact$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ C22821Di $callBack;
    public final /* synthetic */ UserJid $jid;
    public int label;
    public final /* synthetic */ CoinFlipPreviewViewModel this$0;

    @DebugMetadata(c = "com.whatsapp.profile.coinflip.preview.CoinFlipPreviewViewModel$getOtherProfileContact$1$1", f = "CoinFlipPreviewViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.whatsapp.profile.coinflip.preview.CoinFlipPreviewViewModel$getOtherProfileContact$1$1  reason: invalid class name */
    public final class AnonymousClass1 extends C30431dv implements AnonymousClass1OS {
        public int label;

        public final C30391dr create(Object obj, C30391dr r6) {
            return new AnonymousClass1(userJid, coinFlipPreviewViewModel, r6, r2);
        }

        public final Object invokeSuspend(Object obj) {
            if (this.label == 0) {
                C30691eM.A01(obj);
                AnonymousClass1E7 A0E = coinFlipPreviewViewModel.A00.A0E(userJid);
                if (A0E != null) {
                    r2.invoke(A0E);
                }
                return C27621Wu.A00;
            }
            throw AnonymousClass000.A0l();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CoinFlipPreviewViewModel$getOtherProfileContact$1(UserJid userJid, CoinFlipPreviewViewModel coinFlipPreviewViewModel, C30391dr r4, C22821Di r5) {
        super(2, r4);
        this.this$0 = coinFlipPreviewViewModel;
        this.$jid = userJid;
        this.$callBack = r5;
    }

    public final C30391dr create(Object obj, C30391dr r6) {
        return new CoinFlipPreviewViewModel$getOtherProfileContact$1(this.$jid, this.this$0, r6, this.$callBack);
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 r7 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            final CoinFlipPreviewViewModel coinFlipPreviewViewModel = this.this$0;
            C18600wl r4 = coinFlipPreviewViewModel.A08;
            final UserJid userJid = this.$jid;
            final C22821Di r2 = this.$callBack;
            AnonymousClass1 r0 = new AnonymousClass1((C30391dr) null);
            this.label = 1;
            if (C30451dy.A00(this, r4, r0) == r7) {
                return r7;
            }
        } else if (i == 1) {
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        return C27621Wu.A00;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((CoinFlipPreviewViewModel$getOtherProfileContact$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
