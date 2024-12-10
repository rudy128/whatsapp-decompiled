package androidx.compose.material3;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.AnonymousClass1OX;
import X.AnonymousClass3F6;
import X.C06820Zu;
import X.C07140aR;
import X.C16110rj;
import X.C23421Fz;
import X.C27621Wu;
import X.C30391dr;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "androidx.compose.material3.ButtonElevation$animateElevation$1$1", f = "Button.kt", i = {}, l = {815}, m = "invokeSuspend", n = {}, s = {})
public final class ButtonElevation$animateElevation$1$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ C16110rj $interactionSource;
    public final /* synthetic */ C06820Zu $interactions;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ButtonElevation$animateElevation$1$1(C16110rj r2, C06820Zu r3, C30391dr r4) {
        super(2, r4);
        this.$interactionSource = r2;
        this.$interactions = r3;
    }

    /* renamed from: A00 */
    public final Object invoke(C30391dr r3, AnonymousClass1OX r4) {
        return ((ButtonElevation$animateElevation$1$1) create(r4, r3)).invokeSuspend(C27621Wu.A00);
    }

    public final C30391dr create(Object obj, C30391dr r5) {
        return new ButtonElevation$animateElevation$1$1(this.$interactionSource, this.$interactions, r5);
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 A03 = AnonymousClass3F6.A03();
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            C23421Fz BTB = this.$interactionSource.BTB();
            C07140aR r0 = new C07140aR(this.$interactions, 0);
            this.label = 1;
            if (BTB.BFC(this, r0) == A03) {
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
