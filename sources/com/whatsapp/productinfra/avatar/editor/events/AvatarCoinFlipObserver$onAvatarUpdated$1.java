package com.whatsapp.productinfra.avatar.editor.events;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.AnonymousClass3MX;
import X.AnonymousClass6SM;
import X.AnonymousClass7KX;
import X.AnonymousClass7L7;
import X.C108995ce;
import X.C17880vN;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import com.whatsapp.productinfra.avatar.coinflip.MyAvatarCoinFlipRepository;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.productinfra.avatar.editor.events.AvatarCoinFlipObserver$onAvatarUpdated$1", f = "AvatarCoinFlipObserver.kt", i = {}, l = {44}, m = "invokeSuspend", n = {}, s = {})
public final class AvatarCoinFlipObserver$onAvatarUpdated$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ boolean $isCreation;
    public int label;
    public final /* synthetic */ AnonymousClass7L7 this$0;

    @DebugMetadata(c = "com.whatsapp.productinfra.avatar.editor.events.AvatarCoinFlipObserver$onAvatarUpdated$1$1", f = "AvatarCoinFlipObserver.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.whatsapp.productinfra.avatar.editor.events.AvatarCoinFlipObserver$onAvatarUpdated$1$1  reason: invalid class name */
    public final class AnonymousClass1 extends C30431dv implements AnonymousClass1OS {
        public int label;

        public final C30391dr create(Object obj, C30391dr r4) {
            return new AnonymousClass1(r4);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return new AnonymousClass1((C30391dr) obj2).invokeSuspend(C27621Wu.A00);
        }

        public final Object invokeSuspend(Object obj) {
            if (this.label == 0) {
                C30691eM.A01(obj);
                AnonymousClass7KX.A00(C17880vN.A0V(AnonymousClass7L7.this.A01), 16);
                AnonymousClass7L7.A00(AnonymousClass7L7.this);
                return C27621Wu.A00;
            }
            throw AnonymousClass000.A0l();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AvatarCoinFlipObserver$onAvatarUpdated$1(AnonymousClass7L7 r2, C30391dr r3, boolean z) {
        super(2, r3);
        this.$isCreation = z;
        this.this$0 = r2;
    }

    public final C30391dr create(Object obj, C30391dr r5) {
        return new AvatarCoinFlipObserver$onAvatarUpdated$1(this.this$0, r5, this.$isCreation);
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 r2 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            if (!this.$isCreation) {
                ((MyAvatarCoinFlipRepository) this.this$0.A02.get()).A04();
                if (((MyAvatarCoinFlipRepository) this.this$0.A02.get()).A06()) {
                    try {
                        this.label = 1;
                        if (((MyAvatarCoinFlipRepository) this.this$0.A02.get()).A03(this, true) == r2) {
                            return r2;
                        }
                    } catch (AnonymousClass6SM e) {
                        C108995ce.A1M("AvatarCoinFlipObserver/onAvatarUpdated {", AnonymousClass000.A10(), e);
                    }
                }
            }
            return C27621Wu.A00;
        } else if (i == 1) {
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        final AnonymousClass7L7 r3 = this.this$0;
        AnonymousClass3MX.A1Q(new AnonymousClass1((C30391dr) null), r3.A03);
        return C27621Wu.A00;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((AvatarCoinFlipObserver$onAvatarUpdated$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
