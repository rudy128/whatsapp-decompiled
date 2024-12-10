package androidx.compose.foundation.interaction;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.AnonymousClass1OX;
import X.AnonymousClass3F6;
import X.C07150aS;
import X.C16110rj;
import X.C17330uU;
import X.C23421Fz;
import X.C27621Wu;
import X.C30391dr;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "androidx.compose.foundation.interaction.PressInteractionKt$collectIsPressedAsState$1$1", f = "PressInteraction.kt", i = {}, l = {88}, m = "invokeSuspend", n = {}, s = {})
public final class PressInteractionKt$collectIsPressedAsState$1$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ C17330uU $isPressed;
    public final /* synthetic */ C16110rj $this_collectIsPressedAsState;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PressInteractionKt$collectIsPressedAsState$1$1(C16110rj r2, C17330uU r3, C30391dr r4) {
        super(2, r4);
        this.$this_collectIsPressedAsState = r2;
        this.$isPressed = r3;
    }

    /* renamed from: A00 */
    public final Object invoke(C30391dr r3, AnonymousClass1OX r4) {
        return ((PressInteractionKt$collectIsPressedAsState$1$1) create(r4, r3)).invokeSuspend(C27621Wu.A00);
    }

    public final C30391dr create(Object obj, C30391dr r5) {
        return new PressInteractionKt$collectIsPressedAsState$1$1(this.$this_collectIsPressedAsState, this.$isPressed, r5);
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 A03 = AnonymousClass3F6.A03();
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            ArrayList A13 = AnonymousClass000.A13();
            C23421Fz BTB = this.$this_collectIsPressedAsState.BTB();
            C07150aS r0 = new C07150aS(this.$isPressed, (List) A13, 2);
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
