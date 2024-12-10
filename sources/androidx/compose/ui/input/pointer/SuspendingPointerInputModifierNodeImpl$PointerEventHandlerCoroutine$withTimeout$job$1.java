package androidx.compose.ui.input.pointer;

import X.AnonymousClass1OS;
import X.AnonymousClass1OX;
import X.C27621Wu;
import X.C30391dr;
import X.C30431dv;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeout$job$1", f = "SuspendingPointerInputFilter.kt", i = {}, l = {720, 721}, m = "invokeSuspend", n = {}, s = {})
public final class SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeout$job$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ long $timeMillis;
    public int label;
    public final /* synthetic */ SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeout$job$1(SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine suspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine, C30391dr r3, long j) {
        super(2, r3);
        this.$timeMillis = j;
        this.this$0 = suspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine;
    }

    /* renamed from: A00 */
    public final Object invoke(C30391dr r3, AnonymousClass1OX r4) {
        return ((SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeout$job$1) create(r4, r3)).invokeSuspend(C27621Wu.A00);
    }

    public final C30391dr create(Object obj, C30391dr r6) {
        return new SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeout$job$1(this.this$0, r6, this.$timeMillis);
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0046 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            X.1g4 r6 = X.AnonymousClass3F6.A03()
            int r0 = r7.label
            r3 = 1
            r5 = 2
            r2 = 1
            if (r0 == 0) goto L_0x002c
            if (r0 == r2) goto L_0x003b
            if (r0 != r5) goto L_0x0047
            X.C30691eM.A01(r8)
        L_0x0013:
            androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine r0 = r7.this$0
            X.1g5 r3 = r0.A01
            if (r3 == 0) goto L_0x0029
            long r1 = r7.$timeMillis
            X.0af r0 = new X.0af
            r0.<init>(r1)
            X.1IU r0 = X.C30691eM.A00(r0)
            r3.resumeWith(r0)
        L_0x0029:
            X.1Wu r0 = X.C27621Wu.A00
            return r0
        L_0x002c:
            X.C30691eM.A01(r8)
            long r0 = r7.$timeMillis
            long r0 = r0 - r3
            r7.label = r2
            java.lang.Object r0 = X.C62882s9.A00(r7, r0)
            if (r0 != r6) goto L_0x003e
            return r6
        L_0x003b:
            X.C30691eM.A01(r8)
        L_0x003e:
            r7.label = r5
            java.lang.Object r0 = X.C62882s9.A00(r7, r3)
            if (r0 != r6) goto L_0x0013
            return r6
        L_0x0047:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeout$job$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
