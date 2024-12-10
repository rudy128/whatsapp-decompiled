package androidx.compose.foundation;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.AnonymousClass1OX;
import X.AnonymousClass3F6;
import X.C15670r0;
import X.C17210uI;
import X.C27621Wu;
import X.C30391dr;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "androidx.compose.foundation.FocusableInteractionNode$emitWithFallback$1", f = "Focusable.kt", i = {}, l = {311}, m = "invokeSuspend", n = {}, s = {})
public final class FocusableInteractionNode$emitWithFallback$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ C15670r0 $interaction;
    public final /* synthetic */ C17210uI $this_emitWithFallback;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FocusableInteractionNode$emitWithFallback$1(C15670r0 r2, C17210uI r3, C30391dr r4) {
        super(2, r4);
        this.$this_emitWithFallback = r3;
        this.$interaction = r2;
    }

    /* renamed from: A00 */
    public final Object invoke(C30391dr r3, AnonymousClass1OX r4) {
        return ((FocusableInteractionNode$emitWithFallback$1) create(r4, r3)).invokeSuspend(C27621Wu.A00);
    }

    public final C30391dr create(Object obj, C30391dr r5) {
        return new FocusableInteractionNode$emitWithFallback$1(this.$interaction, this.$this_emitWithFallback, r5);
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 A03 = AnonymousClass3F6.A03();
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            C17210uI r1 = this.$this_emitWithFallback;
            C15670r0 r0 = this.$interaction;
            this.label = 1;
            if (r1.BJs(r0, this) == A03) {
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
