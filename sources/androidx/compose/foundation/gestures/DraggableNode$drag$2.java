package androidx.compose.foundation.gestures;

import X.AnonymousClass000;
import X.AnonymousClass07C;
import X.AnonymousClass0UO;
import X.AnonymousClass1OS;
import X.AnonymousClass3F6;
import X.C16060re;
import X.C27621Wu;
import X.C30391dr;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "androidx.compose.foundation.gestures.DraggableNode$drag$2", f = "Draggable.kt", i = {}, l = {322}, m = "invokeSuspend", n = {}, s = {})
public final class DraggableNode$drag$2 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ AnonymousClass1OS $block;
    public /* synthetic */ Object L$0;
    public int label;
    public final /* synthetic */ AnonymousClass07C this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DraggableNode$drag$2(AnonymousClass07C r2, C30391dr r3, AnonymousClass1OS r4) {
        super(2, r3);
        this.this$0 = r2;
        this.$block = r4;
    }

    /* renamed from: A00 */
    public final Object invoke(C16060re r3, C30391dr r4) {
        return ((DraggableNode$drag$2) create(r3, r4)).invokeSuspend(C27621Wu.A00);
    }

    public final C30391dr create(Object obj, C30391dr r5) {
        DraggableNode$drag$2 draggableNode$drag$2 = new DraggableNode$drag$2(this.this$0, r5, this.$block);
        draggableNode$drag$2.L$0 = obj;
        return draggableNode$drag$2;
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 A03 = AnonymousClass3F6.A03();
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            AnonymousClass07C r0 = this.this$0;
            r0.A00 = (C16060re) this.L$0;
            AnonymousClass1OS r1 = this.$block;
            AnonymousClass0UO r02 = r0.A03;
            this.label = 1;
            if (r1.invoke(r02, this) == A03) {
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
