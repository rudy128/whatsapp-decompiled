package androidx.compose.animation.core;

import X.AnonymousClass0IQ;
import X.AnonymousClass1OS;
import X.AnonymousClass1OX;
import X.C17330uU;
import X.C27621Wu;
import X.C30391dr;
import X.C30431dv;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "androidx.compose.animation.core.InfiniteTransition$run$1", f = "InfiniteTransition.kt", i = {0, 0, 1, 1}, l = {181, 205}, m = "invokeSuspend", n = {"$this$LaunchedEffect", "durationScale", "$this$LaunchedEffect", "durationScale"}, s = {"L$0", "L$1", "L$0", "L$1"})
public final class InfiniteTransition$run$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ C17330uU $toolingOverride;
    public /* synthetic */ Object L$0;
    public Object L$1;
    public int label;
    public final /* synthetic */ AnonymousClass0IQ this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public InfiniteTransition$run$1(AnonymousClass0IQ r2, C17330uU r3, C30391dr r4) {
        super(2, r4);
        this.$toolingOverride = r3;
        this.this$0 = r2;
    }

    /* renamed from: A00 */
    public final Object invoke(C30391dr r3, AnonymousClass1OX r4) {
        return ((InfiniteTransition$run$1) create(r4, r3)).invokeSuspend(C27621Wu.A00);
    }

    public final C30391dr create(Object obj, C30391dr r5) {
        InfiniteTransition$run$1 infiniteTransition$run$1 = new InfiniteTransition$run$1(this.this$0, this.$toolingOverride, r5);
        infiniteTransition$run$1.L$0 = obj;
        return infiniteTransition$run$1;
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x002e A[RETURN] */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            X.1g4 r7 = X.AnonymousClass3F6.A03()
            int r0 = r8.label
            r6 = 2
            r5 = 1
            if (r0 == 0) goto L_0x005d
            if (r0 == r5) goto L_0x002f
            if (r0 != r6) goto L_0x006e
            java.lang.Object r4 = r8.L$1
            X.DRh r4 = (X.C27061DRh) r4
            java.lang.Object r3 = r8.L$0
            X.1OX r3 = (X.AnonymousClass1OX) r3
            X.C30691eM.A01(r9)
        L_0x0019:
            X.0uU r2 = r8.$toolingOverride
            X.0IQ r1 = r8.this$0
            X.0jq r0 = new X.0jq
            r0.<init>(r1, r2, r4, r3)
            r8.L$0 = r3
            r8.L$1 = r4
            r8.label = r5
            java.lang.Object r0 = X.AnonymousClass0DZ.A00(r8, r0)
            if (r0 != r7) goto L_0x003a
            return r7
        L_0x002f:
            java.lang.Object r4 = r8.L$1
            X.DRh r4 = (X.C27061DRh) r4
            java.lang.Object r3 = r8.L$0
            X.1OX r3 = (X.AnonymousClass1OX) r3
            X.C30691eM.A01(r9)
        L_0x003a:
            float r1 = r4.element
            r0 = 0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 != 0) goto L_0x0019
            X.0f6 r0 = new X.0f6
            r0.<init>(r3)
            X.1Fz r2 = X.C04950Pq.A05(r0)
            r1 = 0
            androidx.compose.animation.core.InfiniteTransition$run$1$3 r0 = new androidx.compose.animation.core.InfiniteTransition$run$1$3
            r0.<init>(r1)
            r8.L$0 = r3
            r8.L$1 = r4
            r8.label = r6
            java.lang.Object r0 = X.AnonymousClass4WA.A00(r8, r0, r2)
            if (r0 != r7) goto L_0x0019
            return r7
        L_0x005d:
            X.C30691eM.A01(r9)
            java.lang.Object r3 = r8.L$0
            X.1OX r3 = (X.AnonymousClass1OX) r3
            X.DRh r4 = new X.DRh
            r4.<init>()
            r0 = 1065353216(0x3f800000, float:1.0)
            r4.element = r0
            goto L_0x0019
        L_0x006e:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.core.InfiniteTransition$run$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
