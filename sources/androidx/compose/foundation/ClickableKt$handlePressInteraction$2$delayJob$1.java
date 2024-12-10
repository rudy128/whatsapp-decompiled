package androidx.compose.foundation;

import X.AnonymousClass1OS;
import X.AnonymousClass1OX;
import X.C03200Ha;
import X.C17210uI;
import X.C18090vk;
import X.C27621Wu;
import X.C30391dr;
import X.C30431dv;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "androidx.compose.foundation.ClickableKt$handlePressInteraction$2$delayJob$1", f = "Clickable.kt", i = {1}, l = {301, 304}, m = "invokeSuspend", n = {"press"}, s = {"L$0"})
public final class ClickableKt$handlePressInteraction$2$delayJob$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ C18090vk $delayPressInteraction;
    public final /* synthetic */ C03200Ha $interactionData;
    public final /* synthetic */ C17210uI $interactionSource;
    public final /* synthetic */ long $pressPoint;
    public Object L$0;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ClickableKt$handlePressInteraction$2$delayJob$1(C03200Ha r2, C17210uI r3, C30391dr r4, C18090vk r5, long j) {
        super(2, r4);
        this.$delayPressInteraction = r5;
        this.$pressPoint = j;
        this.$interactionSource = r3;
        this.$interactionData = r2;
    }

    /* renamed from: A00 */
    public final Object invoke(C30391dr r3, AnonymousClass1OX r4) {
        return ((ClickableKt$handlePressInteraction$2$delayJob$1) create(r4, r3)).invokeSuspend(C27621Wu.A00);
    }

    public final C30391dr create(Object obj, C30391dr r9) {
        C18090vk r4 = this.$delayPressInteraction;
        long j = this.$pressPoint;
        return new ClickableKt$handlePressInteraction$2$delayJob$1(this.$interactionData, this.$interactionSource, r9, r4, j);
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x004c A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            X.1g4 r4 = X.AnonymousClass3F6.A03()
            int r0 = r5.label
            r3 = 2
            r2 = 1
            if (r0 == 0) goto L_0x001c
            if (r0 == r2) goto L_0x0036
            if (r0 != r3) goto L_0x004d
            java.lang.Object r2 = r5.L$0
            X.0Uk r2 = (X.AnonymousClass0Uk) r2
            X.C30691eM.A01(r6)
        L_0x0015:
            X.0Ha r0 = r5.$interactionData
            r0.A01 = r2
            X.1Wu r0 = X.C27621Wu.A00
            return r0
        L_0x001c:
            X.C30691eM.A01(r6)
            X.0vk r0 = r5.$delayPressInteraction
            java.lang.Object r0 = r0.invoke()
            boolean r0 = X.AnonymousClass000.A1Y(r0)
            if (r0 == 0) goto L_0x0039
            long r0 = X.C02890Fu.A00
            r5.label = r2
            java.lang.Object r0 = X.C62882s9.A00(r5, r0)
            if (r0 != r4) goto L_0x0039
            return r4
        L_0x0036:
            X.C30691eM.A01(r6)
        L_0x0039:
            long r0 = r5.$pressPoint
            X.0Uk r2 = new X.0Uk
            r2.<init>(r0)
            X.0uI r0 = r5.$interactionSource
            r5.L$0 = r2
            r5.label = r3
            java.lang.Object r0 = r0.BJs(r2, r5)
            if (r0 != r4) goto L_0x0015
            return r4
        L_0x004d:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.ClickableKt$handlePressInteraction$2$delayJob$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
