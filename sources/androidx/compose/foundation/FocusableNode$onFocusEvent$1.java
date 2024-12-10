package androidx.compose.foundation;

import X.AnonymousClass000;
import X.AnonymousClass0AZ;
import X.AnonymousClass0NU;
import X.AnonymousClass1OS;
import X.AnonymousClass1OX;
import X.AnonymousClass3F6;
import X.C16200rs;
import X.C27621Wu;
import X.C30391dr;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "androidx.compose.foundation.FocusableNode$onFocusEvent$1", f = "Focusable.kt", i = {}, l = {238}, m = "invokeSuspend", n = {}, s = {})
public final class FocusableNode$onFocusEvent$1 extends C30431dv implements AnonymousClass1OS {
    public int label;
    public final /* synthetic */ AnonymousClass0AZ this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FocusableNode$onFocusEvent$1(AnonymousClass0AZ r2, C30391dr r3) {
        super(2, r3);
        this.this$0 = r2;
    }

    /* renamed from: A01 */
    public final Object invoke(C30391dr r3, AnonymousClass1OX r4) {
        return ((FocusableNode$onFocusEvent$1) create(r4, r3)).invokeSuspend(C27621Wu.A00);
    }

    public final C30391dr create(Object obj, C30391dr r4) {
        return new FocusableNode$onFocusEvent$1(this.this$0, r4);
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 A03 = AnonymousClass3F6.A03();
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            C16200rs r0 = this.this$0.A02;
            this.label = 1;
            if (r0.BDL((AnonymousClass0NU) null, this) == A03) {
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
