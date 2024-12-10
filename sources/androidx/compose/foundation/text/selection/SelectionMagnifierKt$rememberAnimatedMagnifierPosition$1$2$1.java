package androidx.compose.foundation.text.selection;

import X.AnonymousClass000;
import X.AnonymousClass0PI;
import X.AnonymousClass0Q3;
import X.AnonymousClass0QY;
import X.AnonymousClass0U0;
import X.AnonymousClass1OS;
import X.AnonymousClass1OX;
import X.AnonymousClass3F6;
import X.C27621Wu;
import X.C30391dr;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "androidx.compose.foundation.text.selection.SelectionMagnifierKt$rememberAnimatedMagnifierPosition$1$2$1", f = "SelectionMagnifier.kt", i = {}, l = {100}, m = "invokeSuspend", n = {}, s = {})
public final class SelectionMagnifierKt$rememberAnimatedMagnifierPosition$1$2$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ AnonymousClass0Q3 $animatable;
    public final /* synthetic */ long $targetValue;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SelectionMagnifierKt$rememberAnimatedMagnifierPosition$1$2$1(AnonymousClass0Q3 r2, C30391dr r3, long j) {
        super(2, r3);
        this.$animatable = r2;
        this.$targetValue = j;
    }

    /* renamed from: A00 */
    public final Object invoke(C30391dr r3, AnonymousClass1OX r4) {
        return ((SelectionMagnifierKt$rememberAnimatedMagnifierPosition$1$2$1) create(r4, r3)).invokeSuspend(C27621Wu.A00);
    }

    public final C30391dr create(Object obj, C30391dr r6) {
        return new SelectionMagnifierKt$rememberAnimatedMagnifierPosition$1$2$1(this.$animatable, r6, this.$targetValue);
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 A03 = AnonymousClass3F6.A03();
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            AnonymousClass0Q3 r2 = this.$animatable;
            AnonymousClass0QY A0e = AnonymousClass000.A0e(this.$targetValue);
            AnonymousClass0U0 r0 = AnonymousClass0PI.A02;
            this.label = 1;
            if (r2.A06(r0, A0e, r2.A05(), this) == A03) {
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
