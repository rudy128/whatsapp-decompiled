package androidx.compose.foundation.gestures;

import X.AnonymousClass000;
import X.AnonymousClass0D0;
import X.AnonymousClass0MW;
import X.AnonymousClass0Ts;
import X.AnonymousClass0j9;
import X.AnonymousClass1OS;
import X.AnonymousClass3F6;
import X.C03860Kx;
import X.C05780Vr;
import X.C13070mm;
import X.C16000rY;
import X.C16100ri;
import X.C16590sg;
import X.C22821Di;
import X.C27061DRh;
import X.C27621Wu;
import X.C30391dr;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import androidx.compose.animation.core.SuspendAnimationKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "androidx.compose.foundation.gestures.ScrollExtensionsKt$animateScrollBy$2", f = "ScrollExtensions.kt", i = {}, l = {41}, m = "invokeSuspend", n = {}, s = {})
public final class ScrollExtensionsKt$animateScrollBy$2 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ C16000rY $animationSpec;
    public final /* synthetic */ C27061DRh $previousValue;
    public final /* synthetic */ float $value;
    public /* synthetic */ Object L$0;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ScrollExtensionsKt$animateScrollBy$2(C16000rY r2, C30391dr r3, C27061DRh dRh, float f) {
        super(2, r3);
        this.$value = f;
        this.$animationSpec = r2;
        this.$previousValue = dRh;
    }

    public static final Object A01(C16000rY r13, C16590sg r14, Object obj, Object obj2, Object obj3, C30391dr r18, AnonymousClass1OS r19) {
        C16590sg r4 = r14;
        C22821Di BPS = r14.BPS();
        AnonymousClass0D0 r3 = (AnonymousClass0D0) BPS.invoke(obj3);
        Object obj4 = obj;
        if (r3 == null) {
            r3 = C03860Kx.A01((AnonymousClass0D0) BPS.invoke(obj));
        }
        Object A00 = SuspendAnimationKt.A01(new AnonymousClass0Ts(r13, r3, r14, obj, obj2), new C05780Vr(r3, r4, obj4, Long.MIN_VALUE, Long.MIN_VALUE, false), r18, new AnonymousClass0j9(r14, r19), Long.MIN_VALUE);
        if (A00 != AnonymousClass3F6.A03()) {
            return C27621Wu.A00;
        }
        return A00;
    }

    /* renamed from: A04 */
    public final Object invoke(C16100ri r3, C30391dr r4) {
        return ((ScrollExtensionsKt$animateScrollBy$2) create(r3, r4)).invokeSuspend(C27621Wu.A00);
    }

    public final C30391dr create(Object obj, C30391dr r6) {
        ScrollExtensionsKt$animateScrollBy$2 scrollExtensionsKt$animateScrollBy$2 = new ScrollExtensionsKt$animateScrollBy$2(this.$animationSpec, r6, this.$previousValue, this.$value);
        scrollExtensionsKt$animateScrollBy$2.L$0 = obj;
        return scrollExtensionsKt$animateScrollBy$2;
    }

    public static final Object A02(C16000rY r5, C30391dr r6, AnonymousClass1OS r7, float f) {
        Object A01 = A01(r5, AnonymousClass0MW.A02, new Float(0.0f), new Float(f), new Float(0.0f), r6, r7);
        if (A01 != AnonymousClass3F6.A03()) {
            return C27621Wu.A00;
        }
        return A01;
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 A03 = AnonymousClass3F6.A03();
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            float f = this.$value;
            C16000rY r2 = this.$animationSpec;
            C13070mm r0 = new C13070mm((C16100ri) this.L$0, this.$previousValue);
            this.label = 1;
            if (A02(r2, this, r0, f) == A03) {
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
