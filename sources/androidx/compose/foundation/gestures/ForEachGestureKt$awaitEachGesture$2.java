package androidx.compose.foundation.gestures;

import X.AnonymousClass1OB;
import X.AnonymousClass1OS;
import X.C17750vA;
import X.C18560wh;
import X.C27621Wu;
import X.C30391dr;
import X.C71433Fg;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "androidx.compose.foundation.gestures.ForEachGestureKt$awaitEachGesture$2", f = "ForEachGesture.kt", i = {0, 1, 2}, l = {104, 107, 112}, m = "invokeSuspend", n = {"$this$awaitPointerEventScope", "$this$awaitPointerEventScope", "$this$awaitPointerEventScope"}, s = {"L$0", "L$0", "L$0"})
public final class ForEachGestureKt$awaitEachGesture$2 extends C71433Fg implements AnonymousClass1OS {
    public final /* synthetic */ AnonymousClass1OS $block;
    public final /* synthetic */ C18560wh $currentContext;
    public /* synthetic */ Object L$0;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ForEachGestureKt$awaitEachGesture$2(C30391dr r1, C18560wh r2, AnonymousClass1OS r3) {
        super(r1);
        this.$currentContext = r2;
        this.$block = r3;
    }

    /* renamed from: A01 */
    public final Object invoke(C17750vA r3, C30391dr r4) {
        return ((ForEachGestureKt$awaitEachGesture$2) create(r3, r4)).invokeSuspend(C27621Wu.A00);
    }

    public final C30391dr create(Object obj, C30391dr r5) {
        ForEachGestureKt$awaitEachGesture$2 forEachGestureKt$awaitEachGesture$2 = new ForEachGestureKt$awaitEachGesture$2(r5, this.$currentContext, this.$block);
        forEachGestureKt$awaitEachGesture$2.L$0 = obj;
        return forEachGestureKt$awaitEachGesture$2;
    }

    public static final boolean A00(C18560wh r1) {
        AnonymousClass1OB r0 = (AnonymousClass1OB) r1.get(AnonymousClass1OB.A00);
        if (r0 != null) {
            return r0.Be2();
        }
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0058 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0020 A[SYNTHETIC, Splitter:B:8:0x0020] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            X.1g4 r6 = X.AnonymousClass3F6.A03()
            int r0 = r7.label
            r5 = 3
            r4 = 2
            r3 = 1
            if (r0 == 0) goto L_0x0059
            if (r0 == r3) goto L_0x0035
            if (r0 == r4) goto L_0x002d
            if (r0 != r5) goto L_0x0065
            java.lang.Object r2 = r7.L$0
            X.0vA r2 = (X.C17750vA) r2
            X.C30691eM.A01(r8)
        L_0x0018:
            X.0wh r0 = r7.$currentContext
            boolean r0 = A00(r0)
            if (r0 == 0) goto L_0x0062
            X.1OS r0 = r7.$block     // Catch:{ CancellationException -> 0x0045 }
            r7.L$0 = r2     // Catch:{ CancellationException -> 0x0045 }
            r7.label = r3     // Catch:{ CancellationException -> 0x0045 }
            java.lang.Object r0 = r0.invoke(r2, r7)     // Catch:{ CancellationException -> 0x0045 }
            if (r0 != r6) goto L_0x003c
            goto L_0x0061
        L_0x002d:
            java.lang.Object r2 = r7.L$0
            X.0vA r2 = (X.C17750vA) r2
            X.C30691eM.A01(r8)     // Catch:{ CancellationException -> 0x0045 }
            goto L_0x0018
        L_0x0035:
            java.lang.Object r2 = r7.L$0
            X.0vA r2 = (X.C17750vA) r2
            X.C30691eM.A01(r8)     // Catch:{ CancellationException -> 0x0045 }
        L_0x003c:
            r7.L$0 = r2     // Catch:{ CancellationException -> 0x0045 }
            r7.label = r4     // Catch:{ CancellationException -> 0x0045 }
            java.lang.Object r0 = androidx.compose.foundation.gestures.ForEachGestureKt.A00(r2, r7)     // Catch:{ CancellationException -> 0x0045 }
            goto L_0x0056
        L_0x0045:
            r1 = move-exception
            X.0wh r0 = r7.$currentContext
            boolean r0 = A00(r0)
            if (r0 == 0) goto L_0x0069
            r7.L$0 = r2
            r7.label = r5
            java.lang.Object r0 = androidx.compose.foundation.gestures.ForEachGestureKt.A00(r2, r7)
        L_0x0056:
            if (r0 != r6) goto L_0x0018
            return r6
        L_0x0059:
            X.C30691eM.A01(r8)
            java.lang.Object r2 = r7.L$0
            X.0vA r2 = (X.C17750vA) r2
            goto L_0x0018
        L_0x0061:
            return r6
        L_0x0062:
            X.1Wu r0 = X.C27621Wu.A00
            return r0
        L_0x0065:
            java.lang.IllegalStateException r1 = X.AnonymousClass000.A0l()
        L_0x0069:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.ForEachGestureKt$awaitEachGesture$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
