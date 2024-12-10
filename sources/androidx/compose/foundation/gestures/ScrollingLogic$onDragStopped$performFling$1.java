package androidx.compose.foundation.gestures;

import X.AnonymousClass1OS;
import X.C26199CuU;
import X.C27621Wu;
import X.C30391dr;
import X.C30431dv;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "androidx.compose.foundation.gestures.ScrollingLogic$onDragStopped$performFling$1", f = "Scrollable.kt", i = {0, 1, 1, 2, 2}, l = {804, 807, 810}, m = "invokeSuspend", n = {"velocity", "velocity", "available", "velocity", "velocityLeft"}, s = {"J$0", "J$0", "J$1", "J$0", "J$1"})
public final class ScrollingLogic$onDragStopped$performFling$1 extends C30431dv implements AnonymousClass1OS {
    public /* synthetic */ long J$0;
    public long J$1;
    public int label;
    public final /* synthetic */ ScrollingLogic this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ScrollingLogic$onDragStopped$performFling$1(ScrollingLogic scrollingLogic, C30391dr r3) {
        super(2, r3);
        this.this$0 = scrollingLogic;
    }

    public final Object A00(C30391dr r3, long j) {
        return ((ScrollingLogic$onDragStopped$performFling$1) create(C26199CuU.A01(j), r3)).invokeSuspend(C27621Wu.A00);
    }

    public final C30391dr create(Object obj, C30391dr r5) {
        ScrollingLogic$onDragStopped$performFling$1 scrollingLogic$onDragStopped$performFling$1 = new ScrollingLogic$onDragStopped$performFling$1(this.this$0, r5);
        scrollingLogic$onDragStopped$performFling$1.J$0 = ((C26199CuU) obj).A03();
        return scrollingLogic$onDragStopped$performFling$1;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return A00((C30391dr) obj2, ((C26199CuU) obj).A03());
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x005d A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x007f A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            r13 = this;
            X.1g4 r6 = X.AnonymousClass3F6.A03()
            r8 = r13
            int r0 = r13.label
            r5 = 3
            r7 = 2
            r3 = 1
            if (r0 == 0) goto L_0x002c
            if (r0 == r3) goto L_0x0040
            if (r0 == r7) goto L_0x005e
            if (r0 != r5) goto L_0x0080
            long r11 = r13.J$1
            long r0 = r13.J$0
            X.C30691eM.A01(r14)
        L_0x0019:
            X.CuU r14 = (X.C26199CuU) r14
            long r2 = r14.A03()
            long r2 = X.C26199CuU.A00(r11, r2)
            long r0 = X.C26199CuU.A00(r0, r2)
            X.CuU r6 = X.C26199CuU.A01(r0)
            return r6
        L_0x002c:
            X.C30691eM.A01(r14)
            long r0 = r13.J$0
            androidx.compose.foundation.gestures.ScrollingLogic r2 = r13.this$0
            androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher r2 = r2.A04
            r13.J$0 = r0
            r13.label = r3
            java.lang.Object r14 = r2.A00(r13, r0)
            if (r14 != r6) goto L_0x0045
            return r6
        L_0x0040:
            long r0 = r13.J$0
            X.C30691eM.A01(r14)
        L_0x0045:
            X.CuU r14 = (X.C26199CuU) r14
            long r2 = r14.A03()
            long r2 = X.C26199CuU.A00(r0, r2)
            androidx.compose.foundation.gestures.ScrollingLogic r4 = r13.this$0
            r13.J$0 = r0
            r13.J$1 = r2
            r13.label = r7
            java.lang.Object r14 = r4.A05(r13, r2)
            if (r14 != r6) goto L_0x0065
            return r6
        L_0x005e:
            long r2 = r13.J$1
            long r0 = r13.J$0
            X.C30691eM.A01(r14)
        L_0x0065:
            X.CuU r14 = (X.C26199CuU) r14
            long r11 = r14.A03()
            androidx.compose.foundation.gestures.ScrollingLogic r4 = r13.this$0
            androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher r7 = r4.A04
            long r9 = X.C26199CuU.A00(r2, r11)
            r13.J$0 = r0
            r13.J$1 = r11
            r13.label = r5
            java.lang.Object r14 = r7.A01(r8, r9, r11)
            if (r14 != r6) goto L_0x0019
            return r6
        L_0x0080:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.ScrollingLogic$onDragStopped$performFling$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
