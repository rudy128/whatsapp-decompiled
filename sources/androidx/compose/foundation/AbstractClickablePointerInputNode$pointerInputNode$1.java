package androidx.compose.foundation;

import X.AnonymousClass000;
import X.AnonymousClass0AX;
import X.AnonymousClass1OS;
import X.AnonymousClass3F6;
import X.C17730v8;
import X.C27621Wu;
import X.C30391dr;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "androidx.compose.foundation.AbstractClickablePointerInputNode$pointerInputNode$1", f = "Clickable.kt", i = {}, l = {938}, m = "invokeSuspend", n = {}, s = {})
public final class AbstractClickablePointerInputNode$pointerInputNode$1 extends C30431dv implements AnonymousClass1OS {
    public /* synthetic */ Object L$0;
    public int label;
    public final /* synthetic */ AnonymousClass0AX this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AbstractClickablePointerInputNode$pointerInputNode$1(AnonymousClass0AX r2, C30391dr r3) {
        super(2, r3);
        this.this$0 = r2;
    }

    /* renamed from: A00 */
    public final Object invoke(C17730v8 r3, C30391dr r4) {
        return ((AbstractClickablePointerInputNode$pointerInputNode$1) create(r3, r4)).invokeSuspend(C27621Wu.A00);
    }

    public final C30391dr create(Object obj, C30391dr r4) {
        AbstractClickablePointerInputNode$pointerInputNode$1 abstractClickablePointerInputNode$pointerInputNode$1 = new AbstractClickablePointerInputNode$pointerInputNode$1(this.this$0, r4);
        abstractClickablePointerInputNode$pointerInputNode$1.L$0 = obj;
        return abstractClickablePointerInputNode$pointerInputNode$1;
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 A03 = AnonymousClass3F6.A03();
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            AnonymousClass0AX r0 = this.this$0;
            this.label = 1;
            if (r0.A0P((C17730v8) this.L$0, this) == A03) {
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
