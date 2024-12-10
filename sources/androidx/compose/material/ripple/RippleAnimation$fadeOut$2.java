package androidx.compose.material.ripple;

import X.AnonymousClass000;
import X.AnonymousClass0Q3;
import X.AnonymousClass0Tx;
import X.AnonymousClass1OS;
import X.AnonymousClass1OX;
import X.AnonymousClass3F6;
import X.AnonymousClass4Z4;
import X.C02980Gd;
import X.C18560wh;
import X.C27621Wu;
import X.C30391dr;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "androidx.compose.material.ripple.RippleAnimation$fadeOut$2", f = "RippleAnimation.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class RippleAnimation$fadeOut$2 extends C30431dv implements AnonymousClass1OS {
    public /* synthetic */ Object L$0;
    public int label;
    public final /* synthetic */ RippleAnimation this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RippleAnimation$fadeOut$2(RippleAnimation rippleAnimation, C30391dr r3) {
        super(2, r3);
        this.this$0 = rippleAnimation;
    }

    /* renamed from: A00 */
    public final Object invoke(C30391dr r3, AnonymousClass1OX r4) {
        return ((RippleAnimation$fadeOut$2) create(r4, r3)).invokeSuspend(C27621Wu.A00);
    }

    public final C30391dr create(Object obj, C30391dr r4) {
        RippleAnimation$fadeOut$2 rippleAnimation$fadeOut$2 = new RippleAnimation$fadeOut$2(this.this$0, r4);
        rippleAnimation$fadeOut$2.L$0 = obj;
        return rippleAnimation$fadeOut$2;
    }

    @DebugMetadata(c = "androidx.compose.material.ripple.RippleAnimation$fadeOut$2$1", f = "RippleAnimation.kt", i = {}, l = {112}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: androidx.compose.material.ripple.RippleAnimation$fadeOut$2$1  reason: invalid class name */
    public final class AnonymousClass1 extends C30431dv implements AnonymousClass1OS {
        public int label;

        /* renamed from: A00 */
        public final Object invoke(C30391dr r3, AnonymousClass1OX r4) {
            return ((AnonymousClass1) create(r4, r3)).invokeSuspend(C27621Wu.A00);
        }

        public final C30391dr create(Object obj, C30391dr r4) {
            return new AnonymousClass1(r4);
        }

        public final Object invokeSuspend(Object obj) {
            C31751g4 A03 = AnonymousClass3F6.A03();
            int i = this.label;
            if (i == 0) {
                C30691eM.A01(obj);
                AnonymousClass0Q3 r5 = RippleAnimation.this.A04;
                Float f = new Float(0.0f);
                AnonymousClass0Tx r0 = new AnonymousClass0Tx(C02980Gd.A02, 150, 0);
                this.label = 1;
                if (r5.A06(r0, f, r5.A05(), this) == A03) {
                    return A03;
                }
            } else if (i == 1) {
                C30691eM.A01(obj);
            } else {
                throw AnonymousClass000.A0l();
            }
            return C27621Wu.A00;
        }
    }

    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            C30691eM.A01(obj);
            final RippleAnimation rippleAnimation = this.this$0;
            return AnonymousClass4Z4.A02((Integer) null, (C18560wh) null, new AnonymousClass1((C30391dr) null), (AnonymousClass1OX) this.L$0, 3);
        }
        throw AnonymousClass000.A0l();
    }
}
