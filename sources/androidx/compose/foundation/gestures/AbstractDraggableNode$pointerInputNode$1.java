package androidx.compose.foundation.gestures;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.AnonymousClass1OW;
import X.AnonymousClass1OX;
import X.AnonymousClass3F6;
import X.C17730v8;
import X.C27621Wu;
import X.C30391dr;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "androidx.compose.foundation.gestures.AbstractDraggableNode$pointerInputNode$1", f = "Draggable.kt", i = {}, l = {456}, m = "invokeSuspend", n = {}, s = {})
public final class AbstractDraggableNode$pointerInputNode$1 extends C30431dv implements AnonymousClass1OS {
    public /* synthetic */ Object L$0;
    public int label;
    public final /* synthetic */ AbstractDraggableNode this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AbstractDraggableNode$pointerInputNode$1(AbstractDraggableNode abstractDraggableNode, C30391dr r3) {
        super(2, r3);
        this.this$0 = abstractDraggableNode;
    }

    /* renamed from: A00 */
    public final Object invoke(C17730v8 r3, C30391dr r4) {
        return ((AbstractDraggableNode$pointerInputNode$1) create(r3, r4)).invokeSuspend(C27621Wu.A00);
    }

    public final C30391dr create(Object obj, C30391dr r4) {
        AbstractDraggableNode$pointerInputNode$1 abstractDraggableNode$pointerInputNode$1 = new AbstractDraggableNode$pointerInputNode$1(this.this$0, r4);
        abstractDraggableNode$pointerInputNode$1.L$0 = obj;
        return abstractDraggableNode$pointerInputNode$1;
    }

    @DebugMetadata(c = "androidx.compose.foundation.gestures.AbstractDraggableNode$pointerInputNode$1$1", f = "Draggable.kt", i = {0}, l = {458}, m = "invokeSuspend", n = {"$this$coroutineScope"}, s = {"L$0"})
    /* renamed from: androidx.compose.foundation.gestures.AbstractDraggableNode$pointerInputNode$1$1  reason: invalid class name */
    public final class AnonymousClass1 extends C30431dv implements AnonymousClass1OS {
        public /* synthetic */ Object L$0;
        public int label;

        /* renamed from: A00 */
        public final Object invoke(C30391dr r3, AnonymousClass1OX r4) {
            return ((AnonymousClass1) create(r4, r3)).invokeSuspend(C27621Wu.A00);
        }

        public final C30391dr create(Object obj, C30391dr r5) {
            AnonymousClass1 r0 = new AnonymousClass1(abstractDraggableNode, r3, r5);
            r0.L$0 = obj;
            return r0;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:13:0x0034, code lost:
            if (X.AnonymousClass1OW.A05(r4) == false) goto L_0x003d;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                X.1g4 r6 = X.AnonymousClass3F6.A03()
                int r0 = r7.label
                r5 = 1
                if (r0 == 0) goto L_0x0013
                if (r0 != r5) goto L_0x0039
                java.lang.Object r4 = r7.L$0
                X.1OX r4 = (X.AnonymousClass1OX) r4
                X.C30691eM.A01(r8)     // Catch:{ CancellationException -> 0x002f }
                goto L_0x0036
            L_0x0013:
                X.C30691eM.A01(r8)
                java.lang.Object r4 = r7.L$0
                X.1OX r4 = (X.AnonymousClass1OX) r4
                X.0v8 r3 = r3     // Catch:{ CancellationException -> 0x002f }
                androidx.compose.foundation.gestures.AbstractDraggableNode r2 = r2     // Catch:{ CancellationException -> 0x002f }
                r1 = 0
                androidx.compose.foundation.gestures.AbstractDraggableNode$pointerInputNode$1$1$1 r0 = new androidx.compose.foundation.gestures.AbstractDraggableNode$pointerInputNode$1$1$1     // Catch:{ CancellationException -> 0x002f }
                r0.<init>(r2, r1, r4)     // Catch:{ CancellationException -> 0x002f }
                r7.L$0 = r4     // Catch:{ CancellationException -> 0x002f }
                r7.label = r5     // Catch:{ CancellationException -> 0x002f }
                java.lang.Object r0 = r3.BCr(r7, r0)     // Catch:{ CancellationException -> 0x002f }
                if (r0 != r6) goto L_0x0036
                return r6
            L_0x002f:
                r1 = move-exception
                boolean r0 = X.AnonymousClass1OW.A05(r4)
                if (r0 == 0) goto L_0x003d
            L_0x0036:
                X.1Wu r0 = X.C27621Wu.A00
                return r0
            L_0x0039:
                java.lang.IllegalStateException r1 = X.AnonymousClass000.A0l()
            L_0x003d:
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.AbstractDraggableNode$pointerInputNode$1.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 A03 = AnonymousClass3F6.A03();
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            final C17730v8 r3 = (C17730v8) this.L$0;
            final AbstractDraggableNode abstractDraggableNode = this.this$0;
            if (abstractDraggableNode.A01) {
                AnonymousClass1 r0 = new AnonymousClass1((C30391dr) null);
                this.label = 1;
                if (AnonymousClass1OW.A00(this, r0) == A03) {
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
