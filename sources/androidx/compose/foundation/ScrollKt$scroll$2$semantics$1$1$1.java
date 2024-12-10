package androidx.compose.foundation;

import X.AnonymousClass000;
import X.AnonymousClass0U0;
import X.AnonymousClass1OS;
import X.AnonymousClass1OX;
import X.AnonymousClass3F6;
import X.C05400Ua;
import X.C18070vi;
import X.C27621Wu;
import X.C30391dr;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import androidx.compose.foundation.gestures.ScrollExtensionsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "androidx.compose.foundation.ScrollKt$scroll$2$semantics$1$1$1", f = "Scroll.kt", i = {}, l = {293, 295}, m = "invokeSuspend", n = {}, s = {})
public final class ScrollKt$scroll$2$semantics$1$1$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ boolean $isVertical;
    public final /* synthetic */ C05400Ua $state;
    public final /* synthetic */ float $x;
    public final /* synthetic */ float $y;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ScrollKt$scroll$2$semantics$1$1$1(C05400Ua r2, C30391dr r3, float f, float f2, boolean z) {
        super(2, r3);
        this.$isVertical = z;
        this.$state = r2;
        this.$y = f;
        this.$x = f2;
    }

    /* renamed from: A00 */
    public final Object invoke(C30391dr r3, AnonymousClass1OX r4) {
        return ((ScrollKt$scroll$2$semantics$1$1$1) create(r4, r3)).invokeSuspend(C27621Wu.A00);
    }

    public final C30391dr create(Object obj, C30391dr r8) {
        return new ScrollKt$scroll$2$semantics$1$1$1(this.$state, r8, this.$y, this.$x, this.$isVertical);
    }

    public final Object invokeSuspend(Object obj) {
        float f;
        C31751g4 A03 = AnonymousClass3F6.A03();
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            boolean z = this.$isVertical;
            C05400Ua r1 = this.$state;
            if (z) {
                C18070vi.A0z(r1, "null cannot be cast to non-null type androidx.compose.foundation.gestures.ScrollableState");
                f = this.$y;
                this.label = 1;
            } else {
                C18070vi.A0z(r1, "null cannot be cast to non-null type androidx.compose.foundation.gestures.ScrollableState");
                f = this.$x;
                this.label = 2;
            }
            if (ScrollExtensionsKt.A00(AnonymousClass0U0.A01((Object) null), r1, this, f) == A03) {
                return A03;
            }
        } else if (i == 1 || i == 2) {
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        return C27621Wu.A00;
    }
}
