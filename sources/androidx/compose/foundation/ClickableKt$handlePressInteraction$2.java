package androidx.compose.foundation;

import X.AnonymousClass1OB;
import X.AnonymousClass1OS;
import X.AnonymousClass1OX;
import X.C03200Ha;
import X.C17210uI;
import X.C17720v7;
import X.C18090vk;
import X.C27621Wu;
import X.C30391dr;
import X.C30431dv;
import X.C30551e8;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "androidx.compose.foundation.ClickableKt$handlePressInteraction$2", f = "Clickable.kt", i = {0, 1, 2}, l = {307, 309, 316, 317, 326}, m = "invokeSuspend", n = {"delayJob", "success", "release"}, s = {"L$0", "Z$0", "L$0"})
public final class ClickableKt$handlePressInteraction$2 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ C18090vk $delayPressInteraction;
    public final /* synthetic */ C03200Ha $interactionData;
    public final /* synthetic */ C17210uI $interactionSource;
    public final /* synthetic */ long $pressPoint;
    public final /* synthetic */ C17720v7 $this_handlePressInteraction;
    public /* synthetic */ Object L$0;
    public boolean Z$0;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ClickableKt$handlePressInteraction$2(C03200Ha r2, C17720v7 r3, C17210uI r4, C30391dr r5, C18090vk r6, long j) {
        super(2, r5);
        this.$this_handlePressInteraction = r3;
        this.$pressPoint = j;
        this.$interactionSource = r4;
        this.$interactionData = r2;
        this.$delayPressInteraction = r6;
    }

    /* renamed from: A01 */
    public final Object invoke(C30391dr r3, AnonymousClass1OX r4) {
        return ((ClickableKt$handlePressInteraction$2) create(r4, r3)).invokeSuspend(C27621Wu.A00);
    }

    public final C30391dr create(Object obj, C30391dr r10) {
        C17720v7 r2 = this.$this_handlePressInteraction;
        long j = this.$pressPoint;
        ClickableKt$handlePressInteraction$2 clickableKt$handlePressInteraction$2 = new ClickableKt$handlePressInteraction$2(this.$interactionData, r2, this.$interactionSource, r10, this.$delayPressInteraction, j);
        clickableKt$handlePressInteraction$2.L$0 = obj;
        return clickableKt$handlePressInteraction$2;
    }

    public static final Object A00(C30391dr r0, AnonymousClass1OB r1) {
        return C30551e8.A00(r0, r1);
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0093 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            r14 = this;
            X.1g4 r3 = X.AnonymousClass3F6.A03()
            int r6 = r14.label
            r4 = 5
            r2 = 4
            r5 = 3
            r1 = 2
            r0 = 1
            r10 = 0
            if (r6 == 0) goto L_0x001d
            if (r6 == r0) goto L_0x0042
            if (r6 == r1) goto L_0x0060
            if (r6 == r5) goto L_0x0080
            if (r6 == r2) goto L_0x00b4
            if (r6 == r4) goto L_0x00b4
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        L_0x001d:
            X.C30691eM.A01(r15)
            java.lang.Object r6 = r14.L$0
            X.1OX r6 = (X.AnonymousClass1OX) r6
            X.0vk r11 = r14.$delayPressInteraction
            long r12 = r14.$pressPoint
            X.0uI r9 = r14.$interactionSource
            X.0Ha r8 = r14.$interactionData
            androidx.compose.foundation.ClickableKt$handlePressInteraction$2$delayJob$1 r7 = new androidx.compose.foundation.ClickableKt$handlePressInteraction$2$delayJob$1
            r7.<init>(r8, r9, r10, r11, r12)
            X.1e4 r7 = X.AnonymousClass4Z4.A02(r10, r10, r7, r6, r5)
            X.0v7 r6 = r14.$this_handlePressInteraction
            r14.L$0 = r7
            r14.label = r0
            java.lang.Object r15 = r6.CPu(r14)
            if (r15 != r3) goto L_0x0049
            return r3
        L_0x0042:
            java.lang.Object r7 = r14.L$0
            X.1OB r7 = (X.AnonymousClass1OB) r7
            X.C30691eM.A01(r15)
        L_0x0049:
            boolean r6 = X.AnonymousClass000.A1Y(r15)
            boolean r0 = r7.Be2()
            if (r0 == 0) goto L_0x0094
            r14.L$0 = r10
            r14.Z$0 = r6
            r14.label = r1
            java.lang.Object r0 = A00(r14, r7)
            if (r0 != r3) goto L_0x0065
            return r3
        L_0x0060:
            boolean r6 = r14.Z$0
            X.C30691eM.A01(r15)
        L_0x0065:
            if (r6 == 0) goto L_0x00b7
            long r0 = r14.$pressPoint
            X.0Uk r4 = new X.0Uk
            r4.<init>(r0)
            X.0Ul r1 = new X.0Ul
            r1.<init>(r4)
            X.0uI r0 = r14.$interactionSource
            r14.L$0 = r1
            r14.label = r5
            java.lang.Object r0 = r0.BJs(r4, r14)
            if (r0 != r3) goto L_0x0087
            return r3
        L_0x0080:
            java.lang.Object r1 = r14.L$0
            X.0Ul r1 = (X.C05490Ul) r1
            X.C30691eM.A01(r15)
        L_0x0087:
            X.0uI r0 = r14.$interactionSource
            r14.L$0 = r10
            r14.label = r2
            java.lang.Object r0 = r0.BJs(r1, r14)
            if (r0 != r3) goto L_0x00b7
            return r3
        L_0x0094:
            X.0Ha r0 = r14.$interactionData
            X.0Uk r2 = r0.A01
            if (r2 == 0) goto L_0x00b7
            X.0uI r1 = r14.$interactionSource
            if (r6 == 0) goto L_0x00ae
            X.0Ul r0 = new X.0Ul
            r0.<init>(r2)
        L_0x00a3:
            r14.L$0 = r10
            r14.label = r4
            java.lang.Object r0 = r1.BJs(r0, r14)
            if (r0 != r3) goto L_0x00b7
            return r3
        L_0x00ae:
            X.0Uj r0 = new X.0Uj
            r0.<init>(r2)
            goto L_0x00a3
        L_0x00b4:
            X.C30691eM.A01(r15)
        L_0x00b7:
            X.0Ha r0 = r14.$interactionData
            r0.A01 = r10
            X.1Wu r3 = X.C27621Wu.A00
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.ClickableKt$handlePressInteraction$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
