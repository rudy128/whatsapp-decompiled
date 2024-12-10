package androidx.compose.foundation;

import X.AnonymousClass000;
import X.AnonymousClass07A;
import X.AnonymousClass0QY;
import X.AnonymousClass3F6;
import X.C17720v7;
import X.C27621Wu;
import X.C30391dr;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import X.C36001nB;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "androidx.compose.foundation.ClickablePointerInputNode$pointerInput$2", f = "Clickable.kt", i = {}, l = {984}, m = "invokeSuspend", n = {}, s = {})
public final class ClickablePointerInputNode$pointerInput$2 extends C30431dv implements C36001nB {
    public /* synthetic */ long J$0;
    public /* synthetic */ Object L$0;
    public int label;
    public final /* synthetic */ AnonymousClass07A this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ClickablePointerInputNode$pointerInput$2(AnonymousClass07A r2, C30391dr r3) {
        super(3, r3);
        this.this$0 = r2;
    }

    public final Object A00(C17720v7 r3, C30391dr r4, long j) {
        ClickablePointerInputNode$pointerInput$2 clickablePointerInputNode$pointerInput$2 = new ClickablePointerInputNode$pointerInput$2(this.this$0, r4);
        clickablePointerInputNode$pointerInput$2.L$0 = r3;
        clickablePointerInputNode$pointerInput$2.J$0 = j;
        return clickablePointerInputNode$pointerInput$2.invokeSuspend(C27621Wu.A00);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return A00((C17720v7) obj, (C30391dr) obj3, ((AnonymousClass0QY) obj2).A00);
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 A03 = AnonymousClass3F6.A03();
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            C17720v7 r4 = (C17720v7) this.L$0;
            long j = this.J$0;
            AnonymousClass07A r1 = this.this$0;
            if (r1.A01) {
                this.label = 1;
                if (r1.A0O(r4, this, j) == A03) {
                    return A03;
                }
            }
        } else if (i == 1) {
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        return C27621Wu.A00;
    }
}
