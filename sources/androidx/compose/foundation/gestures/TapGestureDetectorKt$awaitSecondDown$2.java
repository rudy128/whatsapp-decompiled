package androidx.compose.foundation.gestures;

import X.AnonymousClass0KX;
import X.AnonymousClass1OS;
import X.C17750vA;
import X.C27621Wu;
import X.C30391dr;
import X.C71433Fg;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$awaitSecondDown$2", f = "TapGestureDetector.kt", i = {0, 0}, l = {212}, m = "invokeSuspend", n = {"$this$withTimeoutOrNull", "minUptime"}, s = {"L$0", "J$0"})
public final class TapGestureDetectorKt$awaitSecondDown$2 extends C71433Fg implements AnonymousClass1OS {
    public final /* synthetic */ AnonymousClass0KX $firstUp;
    public long J$0;
    public /* synthetic */ Object L$0;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TapGestureDetectorKt$awaitSecondDown$2(AnonymousClass0KX r1, C30391dr r2) {
        super(r2);
        this.$firstUp = r1;
    }

    /* renamed from: A00 */
    public final Object invoke(C17750vA r3, C30391dr r4) {
        return ((TapGestureDetectorKt$awaitSecondDown$2) create(r3, r4)).invokeSuspend(C27621Wu.A00);
    }

    public final C30391dr create(Object obj, C30391dr r4) {
        TapGestureDetectorKt$awaitSecondDown$2 tapGestureDetectorKt$awaitSecondDown$2 = new TapGestureDetectorKt$awaitSecondDown$2(this.$firstUp, r4);
        tapGestureDetectorKt$awaitSecondDown$2.L$0 = obj;
        return tapGestureDetectorKt$awaitSecondDown$2;
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x003b A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:6:0x001c A[RETURN] */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            X.1g4 r8 = X.AnonymousClass3F6.A03()
            int r0 = r9.label
            r7 = 1
            if (r0 == 0) goto L_0x001d
            if (r0 != r7) goto L_0x003c
            long r2 = r9.J$0
            java.lang.Object r6 = r9.L$0
            X.0vA r6 = (X.C17750vA) r6
            X.C30691eM.A01(r10)
        L_0x0014:
            X.0KX r10 = (X.AnonymousClass0KX) r10
            long r4 = r10.A0A
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r0 < 0) goto L_0x002e
            return r10
        L_0x001d:
            X.C30691eM.A01(r10)
            java.lang.Object r6 = r9.L$0
            X.0vA r6 = (X.C17750vA) r6
            X.0KX r0 = r9.$firstUp
            long r2 = r0.A0A
            r6.getViewConfiguration()
            r0 = 40
            long r2 = r2 + r0
        L_0x002e:
            r9.L$0 = r6
            r9.J$0 = r2
            r9.label = r7
            r0 = 3
            java.lang.Object r10 = androidx.compose.foundation.gestures.TapGestureDetectorKt.A07(r6, r9, r0)
            if (r10 != r8) goto L_0x0014
            return r8
        L_0x003c:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.TapGestureDetectorKt$awaitSecondDown$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
