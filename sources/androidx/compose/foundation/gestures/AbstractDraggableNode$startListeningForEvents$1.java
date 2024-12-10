package androidx.compose.foundation.gestures;

import X.AnonymousClass1OS;
import X.AnonymousClass1OX;
import X.C27621Wu;
import X.C30391dr;
import X.C30431dv;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "androidx.compose.foundation.gestures.AbstractDraggableNode$startListeningForEvents$1", f = "Draggable.kt", i = {0, 0, 1, 1, 2, 2, 3, 4, 5}, l = {431, 433, 435, 442, 444, 447}, m = "invokeSuspend", n = {"$this$launch", "event", "$this$launch", "event", "$this$launch", "event", "$this$launch", "$this$launch", "$this$launch"}, s = {"L$0", "L$1", "L$0", "L$1", "L$0", "L$1", "L$0", "L$0", "L$0"})
public final class AbstractDraggableNode$startListeningForEvents$1 extends C30431dv implements AnonymousClass1OS {
    public /* synthetic */ Object L$0;
    public Object L$1;
    public Object L$2;
    public int label;
    public final /* synthetic */ AbstractDraggableNode this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AbstractDraggableNode$startListeningForEvents$1(AbstractDraggableNode abstractDraggableNode, C30391dr r3) {
        super(2, r3);
        this.this$0 = abstractDraggableNode;
    }

    /* renamed from: A00 */
    public final Object invoke(C30391dr r3, AnonymousClass1OX r4) {
        return ((AbstractDraggableNode$startListeningForEvents$1) create(r4, r3)).invokeSuspend(C27621Wu.A00);
    }

    public final C30391dr create(Object obj, C30391dr r4) {
        AbstractDraggableNode$startListeningForEvents$1 abstractDraggableNode$startListeningForEvents$1 = new AbstractDraggableNode$startListeningForEvents$1(this.this$0, r4);
        abstractDraggableNode$startListeningForEvents$1.L$0 = obj;
        return abstractDraggableNode$startListeningForEvents$1;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x004f, code lost:
        if (X.AnonymousClass1OW.A05(r2) == false) goto L_0x00e4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0051, code lost:
        r6 = new X.C98494rF();
        r1 = r7.this$0.A0C;
        r7.L$0 = r2;
        r7.L$1 = r6;
        r7.L$2 = r6;
        r7.label = 1;
        r8 = r1.CDW(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0069, code lost:
        if (r8 == r4) goto L_0x0087;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x006b, code lost:
        r0 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x006c, code lost:
        r0.element = r8;
        r5 = r6.element;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0072, code lost:
        if ((r5 instanceof X.AnonymousClass07E) == false) goto L_0x004b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0074, code lost:
        r7.L$0 = r2;
        r7.L$1 = r6;
        r7.L$2 = null;
        r7.label = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0085, code lost:
        if (r7.this$0.A03((X.AnonymousClass07E) r5, r7, r2) != r4) goto L_0x0088;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0087, code lost:
        return r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
        r5 = r7.this$0;
        r1 = new androidx.compose.foundation.gestures.AbstractDraggableNode$startListeningForEvents$1.AnonymousClass1((X.C30391dr) null);
        r7.L$0 = r2;
        r7.L$1 = r6;
        r7.label = 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x009a, code lost:
        if (r5.A0O(r7, r1) != r4) goto L_0x00a0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00a0, code lost:
        r5 = r6.element;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00a4, code lost:
        if ((r5 instanceof X.AnonymousClass07F) == false) goto L_0x00bd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00a6, code lost:
        r1 = r7.this$0;
        X.C18070vi.A0z(r5, "null cannot be cast to non-null type androidx.compose.foundation.gestures.DragEvent.DragStopped");
        r7.L$0 = r2;
        r7.L$1 = null;
        r7.label = 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00ba, code lost:
        if (r1.A04((X.AnonymousClass07F) r5, r7, r2) != r4) goto L_0x004b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00bf, code lost:
        if ((r5 instanceof X.AnonymousClass07G) == false) goto L_0x004b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00c1, code lost:
        r1 = r7.this$0;
        r7.L$0 = r2;
        r7.L$1 = null;
        r7.label = 5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00ce, code lost:
        if (r1.A05(r7, r2) != r4) goto L_0x004b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00e1, code lost:
        return r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00e2, code lost:
        return r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00e3, code lost:
        return r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00e6, code lost:
        return X.C27621Wu.A00;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            X.1g4 r4 = X.AnonymousClass3F6.A03()
            int r0 = r7.label
            r3 = 0
            switch(r0) {
                case 0: goto L_0x0044;
                case 1: goto L_0x0017;
                case 2: goto L_0x0038;
                case 3: goto L_0x002f;
                case 4: goto L_0x0027;
                case 5: goto L_0x0027;
                case 6: goto L_0x000f;
                default: goto L_0x000a;
            }
        L_0x000a:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        L_0x000f:
            java.lang.Object r2 = r7.L$0
            X.1OX r2 = (X.AnonymousClass1OX) r2
            X.C30691eM.A01(r8)
            goto L_0x004b
        L_0x0017:
            java.lang.Object r0 = r7.L$2
            X.4rF r0 = (X.C98494rF) r0
            java.lang.Object r6 = r7.L$1
            X.4rF r6 = (X.C98494rF) r6
            java.lang.Object r2 = r7.L$0
            X.1OX r2 = (X.AnonymousClass1OX) r2
            X.C30691eM.A01(r8)
            goto L_0x006c
        L_0x0027:
            java.lang.Object r2 = r7.L$0
            X.1OX r2 = (X.AnonymousClass1OX) r2
            X.C30691eM.A01(r8)     // Catch:{ CancellationException -> 0x00d1 }
            goto L_0x004b
        L_0x002f:
            java.lang.Object r6 = r7.L$1
            X.4rF r6 = (X.C98494rF) r6
            java.lang.Object r2 = r7.L$0
            X.1OX r2 = (X.AnonymousClass1OX) r2
            goto L_0x009d
        L_0x0038:
            java.lang.Object r6 = r7.L$1
            X.4rF r6 = (X.C98494rF) r6
            java.lang.Object r2 = r7.L$0
            X.1OX r2 = (X.AnonymousClass1OX) r2
            X.C30691eM.A01(r8)
            goto L_0x0088
        L_0x0044:
            X.C30691eM.A01(r8)
            java.lang.Object r2 = r7.L$0
            X.1OX r2 = (X.AnonymousClass1OX) r2
        L_0x004b:
            boolean r0 = X.AnonymousClass1OW.A05(r2)
            if (r0 == 0) goto L_0x00e4
            X.4rF r6 = new X.4rF
            r6.<init>()
            androidx.compose.foundation.gestures.AbstractDraggableNode r0 = r7.this$0
            X.5bm r1 = r0.A0C
            r7.L$0 = r2
            r7.L$1 = r6
            r7.L$2 = r6
            r0 = 1
            r7.label = r0
            java.lang.Object r8 = r1.CDW(r7)
            if (r8 == r4) goto L_0x0087
            r0 = r6
        L_0x006c:
            r0.element = r8
            java.lang.Object r5 = r6.element
            boolean r0 = r5 instanceof X.AnonymousClass07E
            if (r0 == 0) goto L_0x004b
            androidx.compose.foundation.gestures.AbstractDraggableNode r1 = r7.this$0
            X.07E r5 = (X.AnonymousClass07E) r5
            r7.L$0 = r2
            r7.L$1 = r6
            r7.L$2 = r3
            r0 = 2
            r7.label = r0
            java.lang.Object r0 = r1.A03(r5, r7, r2)
            if (r0 != r4) goto L_0x0088
        L_0x0087:
            return r4
        L_0x0088:
            androidx.compose.foundation.gestures.AbstractDraggableNode r5 = r7.this$0     // Catch:{ CancellationException -> 0x00d1 }
            androidx.compose.foundation.gestures.AbstractDraggableNode$startListeningForEvents$1$1 r1 = new androidx.compose.foundation.gestures.AbstractDraggableNode$startListeningForEvents$1$1     // Catch:{ CancellationException -> 0x00d1 }
            r1.<init>(r5, r3, r6)     // Catch:{ CancellationException -> 0x00d1 }
            r7.L$0 = r2     // Catch:{ CancellationException -> 0x00d1 }
            r7.L$1 = r6     // Catch:{ CancellationException -> 0x00d1 }
            r0 = 3
            r7.label = r0     // Catch:{ CancellationException -> 0x00d1 }
            java.lang.Object r0 = r5.A0O(r7, r1)     // Catch:{ CancellationException -> 0x00d1 }
            if (r0 != r4) goto L_0x00a0
            goto L_0x00e1
        L_0x009d:
            X.C30691eM.A01(r8)     // Catch:{ CancellationException -> 0x00d1 }
        L_0x00a0:
            java.lang.Object r5 = r6.element     // Catch:{ CancellationException -> 0x00d1 }
            boolean r0 = r5 instanceof X.AnonymousClass07F     // Catch:{ CancellationException -> 0x00d1 }
            if (r0 == 0) goto L_0x00bd
            androidx.compose.foundation.gestures.AbstractDraggableNode r1 = r7.this$0     // Catch:{ CancellationException -> 0x00d1 }
            java.lang.String r0 = "null cannot be cast to non-null type androidx.compose.foundation.gestures.DragEvent.DragStopped"
            X.C18070vi.A0z(r5, r0)     // Catch:{ CancellationException -> 0x00d1 }
            X.07F r5 = (X.AnonymousClass07F) r5     // Catch:{ CancellationException -> 0x00d1 }
            r7.L$0 = r2     // Catch:{ CancellationException -> 0x00d1 }
            r7.L$1 = r3     // Catch:{ CancellationException -> 0x00d1 }
            r0 = 4
            r7.label = r0     // Catch:{ CancellationException -> 0x00d1 }
            java.lang.Object r0 = r1.A04(r5, r7, r2)     // Catch:{ CancellationException -> 0x00d1 }
            if (r0 != r4) goto L_0x004b
            goto L_0x00e2
        L_0x00bd:
            boolean r0 = r5 instanceof X.AnonymousClass07G     // Catch:{ CancellationException -> 0x00d1 }
            if (r0 == 0) goto L_0x004b
            androidx.compose.foundation.gestures.AbstractDraggableNode r1 = r7.this$0     // Catch:{ CancellationException -> 0x00d1 }
            r7.L$0 = r2     // Catch:{ CancellationException -> 0x00d1 }
            r7.L$1 = r3     // Catch:{ CancellationException -> 0x00d1 }
            r0 = 5
            r7.label = r0     // Catch:{ CancellationException -> 0x00d1 }
            java.lang.Object r0 = r1.A05(r7, r2)     // Catch:{ CancellationException -> 0x00d1 }
            if (r0 != r4) goto L_0x004b
            goto L_0x00e3
        L_0x00d1:
            androidx.compose.foundation.gestures.AbstractDraggableNode r1 = r7.this$0
            r7.L$0 = r2
            r7.L$1 = r3
            r0 = 6
            r7.label = r0
            java.lang.Object r0 = r1.A05(r7, r2)
            if (r0 != r4) goto L_0x004b
            return r4
        L_0x00e1:
            return r4
        L_0x00e2:
            return r4
        L_0x00e3:
            return r4
        L_0x00e4:
            X.1Wu r0 = X.C27621Wu.A00
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.AbstractDraggableNode$startListeningForEvents$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
