package androidx.compose.foundation.text;

import X.AnonymousClass1OS;
import X.C16850tK;
import X.C17750vA;
import X.C27621Wu;
import X.C30391dr;
import X.C71433Fg;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "androidx.compose.foundation.text.LongPressTextDragObserverKt$detectPreDragGesturesWithObserver$2", f = "LongPressTextDragObserver.kt", i = {0, 1, 1}, l = {99, 103}, m = "invokeSuspend", n = {"$this$awaitEachGesture", "$this$awaitEachGesture", "down"}, s = {"L$0", "L$0", "L$1"})
public final class LongPressTextDragObserverKt$detectPreDragGesturesWithObserver$2 extends C71433Fg implements AnonymousClass1OS {
    public final /* synthetic */ C16850tK $observer;
    public /* synthetic */ Object L$0;
    public Object L$1;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LongPressTextDragObserverKt$detectPreDragGesturesWithObserver$2(C16850tK r1, C30391dr r2) {
        super(r2);
        this.$observer = r1;
    }

    /* renamed from: A00 */
    public final Object invoke(C17750vA r3, C30391dr r4) {
        return ((LongPressTextDragObserverKt$detectPreDragGesturesWithObserver$2) create(r3, r4)).invokeSuspend(C27621Wu.A00);
    }

    public final C30391dr create(Object obj, C30391dr r4) {
        LongPressTextDragObserverKt$detectPreDragGesturesWithObserver$2 longPressTextDragObserverKt$detectPreDragGesturesWithObserver$2 = new LongPressTextDragObserverKt$detectPreDragGesturesWithObserver$2(this.$observer, r4);
        longPressTextDragObserverKt$detectPreDragGesturesWithObserver$2.L$0 = obj;
        return longPressTextDragObserverKt$detectPreDragGesturesWithObserver$2;
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0040 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0066 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0024  */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            r13 = this;
            X.1g4 r11 = X.AnonymousClass3F6.A03()
            int r1 = r13.label
            r10 = 2
            r0 = 1
            if (r1 == 0) goto L_0x0044
            if (r1 == r0) goto L_0x0056
            if (r1 != r10) goto L_0x006e
            java.lang.Object r12 = r13.L$1
            X.0KX r12 = (X.AnonymousClass0KX) r12
            java.lang.Object r9 = r13.L$0
            X.0vA r9 = (X.C17750vA) r9
            X.C30691eM.A01(r14)
        L_0x0019:
            X.0Hm r14 = (X.AnonymousClass0Hm) r14
            java.util.List r8 = r14.A03
            int r7 = r8.size()
            r6 = 0
        L_0x0022:
            if (r6 >= r7) goto L_0x0066
            X.0KX r5 = X.AnonymousClass000.A0f(r8, r6)
            long r3 = r5.A05
            long r1 = r12.A05
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x0041
            boolean r0 = r5.A0B
            if (r0 == 0) goto L_0x0041
        L_0x0034:
            r13.L$0 = r9
            r13.L$1 = r12
            r13.label = r10
            java.lang.Object r14 = r9.BCq(X.AnonymousClass0CQ.Main, r13)
            if (r14 != r11) goto L_0x0019
            return r11
        L_0x0041:
            int r6 = r6 + 1
            goto L_0x0022
        L_0x0044:
            X.C30691eM.A01(r14)
            java.lang.Object r9 = r13.L$0
            X.0vA r9 = (X.C17750vA) r9
            r13.L$0 = r9
            r13.label = r0
            java.lang.Object r14 = androidx.compose.foundation.gestures.TapGestureDetectorKt.A07(r9, r13, r10)
            if (r14 != r11) goto L_0x005d
            return r11
        L_0x0056:
            java.lang.Object r9 = r13.L$0
            X.0vA r9 = (X.C17750vA) r9
            X.C30691eM.A01(r14)
        L_0x005d:
            X.0KX r14 = (X.AnonymousClass0KX) r14
            X.0tK r0 = r13.$observer
            r0.Bs9()
            r12 = r14
            goto L_0x0034
        L_0x0066:
            X.0tK r0 = r13.$observer
            r0.C9Y()
            X.1Wu r0 = X.C27621Wu.A00
            return r0
        L_0x006e:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.LongPressTextDragObserverKt$detectPreDragGesturesWithObserver$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
