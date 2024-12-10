package androidx.compose.material3;

import X.AnonymousClass000;
import X.AnonymousClass0Q3;
import X.AnonymousClass1OS;
import X.AnonymousClass1OX;
import X.AnonymousClass3F6;
import X.C27621Wu;
import X.C30391dr;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import X.DSH;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "androidx.compose.material3.ButtonElevation$animateElevation$2", f = "Button.kt", i = {}, l = {860}, m = "invokeSuspend", n = {}, s = {})
public final class ButtonElevation$animateElevation$2 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ AnonymousClass0Q3 $animatable;
    public final /* synthetic */ float $target;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ButtonElevation$animateElevation$2(AnonymousClass0Q3 r2, C30391dr r3, float f) {
        super(2, r3);
        this.$animatable = r2;
        this.$target = f;
    }

    /* renamed from: A00 */
    public final Object invoke(C30391dr r3, AnonymousClass1OX r4) {
        return ((ButtonElevation$animateElevation$2) create(r4, r3)).invokeSuspend(C27621Wu.A00);
    }

    public final C30391dr create(Object obj, C30391dr r5) {
        return new ButtonElevation$animateElevation$2(this.$animatable, r5, this.$target);
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 A03 = AnonymousClass3F6.A03();
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            AnonymousClass0Q3 r1 = this.$animatable;
            DSH A00 = DSH.A00(this.$target);
            this.label = 1;
            if (r1.A07(A00, this) == A03) {
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
