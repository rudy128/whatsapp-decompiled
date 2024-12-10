package androidx.compose.material3;

import X.AnonymousClass0NL;
import X.AnonymousClass0Q3;
import X.AnonymousClass1OS;
import X.AnonymousClass1OX;
import X.C15670r0;
import X.C27621Wu;
import X.C30391dr;
import X.C30431dv;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "androidx.compose.material3.ButtonElevation$animateElevation$3", f = "Button.kt", i = {}, l = {869}, m = "invokeSuspend", n = {}, s = {})
public final class ButtonElevation$animateElevation$3 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ AnonymousClass0Q3 $animatable;
    public final /* synthetic */ C15670r0 $interaction;
    public final /* synthetic */ float $target;
    public int label;
    public final /* synthetic */ AnonymousClass0NL this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ButtonElevation$animateElevation$3(AnonymousClass0Q3 r2, C15670r0 r3, AnonymousClass0NL r4, C30391dr r5, float f) {
        super(2, r5);
        this.$animatable = r2;
        this.this$0 = r4;
        this.$target = f;
        this.$interaction = r3;
    }

    /* renamed from: A00 */
    public final Object invoke(C30391dr r3, AnonymousClass1OX r4) {
        return ((ButtonElevation$animateElevation$3) create(r4, r3)).invokeSuspend(C27621Wu.A00);
    }

    public final C30391dr create(Object obj, C30391dr r8) {
        return new ButtonElevation$animateElevation$3(this.$animatable, this.$interaction, this.this$0, r8, this.$target);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0045 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            X.1g4 r4 = X.AnonymousClass3F6.A03()
            int r0 = r6.label
            r5 = 1
            if (r0 == 0) goto L_0x0011
            if (r0 != r5) goto L_0x0058
            X.C30691eM.A01(r7)
        L_0x000e:
            X.1Wu r0 = X.C27621Wu.A00
            return r0
        L_0x0011:
            X.C30691eM.A01(r7)
            X.0Q3 r0 = r6.$animatable
            X.0uU r0 = r0.A07
            java.lang.Object r0 = r0.getValue()
            X.DSH r0 = (X.DSH) r0
            float r1 = r0.A02()
            r0 = 0
            int r0 = java.lang.Float.compare(r1, r0)
            boolean r0 = X.AnonymousClass000.A1P(r0)
            r3 = 0
            if (r0 == 0) goto L_0x0046
            long r0 = X.AnonymousClass0QY.A03
            X.0Uk r3 = new X.0Uk
            r3.<init>(r0)
        L_0x0035:
            X.0r0 r3 = (X.C15670r0) r3
        L_0x0037:
            X.0Q3 r2 = r6.$animatable
            float r1 = r6.$target
            X.0r0 r0 = r6.$interaction
            r6.label = r5
            java.lang.Object r0 = X.AnonymousClass0MR.A00(r2, r3, r0, r6, r1)
            if (r0 != r4) goto L_0x000e
            return r4
        L_0x0046:
            r0 = 1065353216(0x3f800000, float:1.0)
            int r0 = java.lang.Float.compare(r1, r0)
            boolean r0 = X.AnonymousClass000.A1P(r0)
            if (r0 == 0) goto L_0x0037
            X.0Ue r3 = new X.0Ue
            r3.<init>()
            goto L_0x0035
        L_0x0058:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.ButtonElevation$animateElevation$3.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
