package androidx.compose.foundation;

import X.AnonymousClass000;
import X.AnonymousClass0AW;
import X.AnonymousClass0Uk;
import X.AnonymousClass1OS;
import X.AnonymousClass1OX;
import X.AnonymousClass3F6;
import X.C17210uI;
import X.C27621Wu;
import X.C30391dr;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "androidx.compose.foundation.AbstractClickableNode$onKeyEvent$1", f = "Clickable.kt", i = {}, l = {810}, m = "invokeSuspend", n = {}, s = {})
public final class AbstractClickableNode$onKeyEvent$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ AnonymousClass0Uk $press;
    public int label;
    public final /* synthetic */ AnonymousClass0AW this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AbstractClickableNode$onKeyEvent$1(AnonymousClass0AW r2, AnonymousClass0Uk r3, C30391dr r4) {
        super(2, r4);
        this.this$0 = r2;
        this.$press = r3;
    }

    /* renamed from: A00 */
    public final Object invoke(C30391dr r3, AnonymousClass1OX r4) {
        return ((AbstractClickableNode$onKeyEvent$1) create(r4, r3)).invokeSuspend(C27621Wu.A00);
    }

    public final C30391dr create(Object obj, C30391dr r5) {
        return new AbstractClickableNode$onKeyEvent$1(this.this$0, this.$press, r5);
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 A03 = AnonymousClass3F6.A03();
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            C17210uI r1 = this.this$0.A00;
            AnonymousClass0Uk r0 = this.$press;
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
