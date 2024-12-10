package androidx.compose.foundation.gestures;

import X.AnonymousClass000;
import X.AnonymousClass0UR;
import X.AnonymousClass1OS;
import X.AnonymousClass3F6;
import X.C16100ri;
import X.C27621Wu;
import X.C30391dr;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "androidx.compose.foundation.gestures.ScrollDraggableState$drag$2", f = "Scrollable.kt", i = {}, l = {894}, m = "invokeSuspend", n = {}, s = {})
public final class ScrollDraggableState$drag$2 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ AnonymousClass1OS $block;
    public /* synthetic */ Object L$0;
    public int label;
    public final /* synthetic */ AnonymousClass0UR this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ScrollDraggableState$drag$2(AnonymousClass0UR r2, C30391dr r3, AnonymousClass1OS r4) {
        super(2, r3);
        this.this$0 = r2;
        this.$block = r4;
    }

    /* renamed from: A00 */
    public final Object invoke(C16100ri r3, C30391dr r4) {
        return ((ScrollDraggableState$drag$2) create(r3, r4)).invokeSuspend(C27621Wu.A00);
    }

    public final C30391dr create(Object obj, C30391dr r5) {
        ScrollDraggableState$drag$2 scrollDraggableState$drag$2 = new ScrollDraggableState$drag$2(this.this$0, r5, this.$block);
        scrollDraggableState$drag$2.L$0 = obj;
        return scrollDraggableState$drag$2;
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 A03 = AnonymousClass3F6.A03();
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            AnonymousClass0UR r1 = this.this$0;
            r1.A00 = (C16100ri) this.L$0;
            AnonymousClass1OS r0 = this.$block;
            this.label = 1;
            if (r0.invoke(r1, this) == A03) {
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
