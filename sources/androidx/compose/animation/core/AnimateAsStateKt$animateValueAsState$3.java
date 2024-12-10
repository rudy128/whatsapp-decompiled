package androidx.compose.animation.core;

import X.AnonymousClass0Q3;
import X.AnonymousClass1OS;
import X.AnonymousClass1OX;
import X.C108485bm;
import X.C16300s2;
import X.C27621Wu;
import X.C30391dr;
import X.C30431dv;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "androidx.compose.animation.core.AnimateAsStateKt$animateValueAsState$3", f = "AnimateAsState.kt", i = {0}, l = {419}, m = "invokeSuspend", n = {"$this$LaunchedEffect"}, s = {"L$0"})
public final class AnimateAsStateKt$animateValueAsState$3 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ C16300s2 $animSpec$delegate;
    public final /* synthetic */ AnonymousClass0Q3 $animatable;
    public final /* synthetic */ C108485bm $channel;
    public final /* synthetic */ C16300s2 $listener$delegate;
    public /* synthetic */ Object L$0;
    public Object L$1;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnimateAsStateKt$animateValueAsState$3(AnonymousClass0Q3 r2, C16300s2 r3, C16300s2 r4, C30391dr r5, C108485bm r6) {
        super(2, r5);
        this.$channel = r6;
        this.$animatable = r2;
        this.$animSpec$delegate = r3;
        this.$listener$delegate = r4;
    }

    /* renamed from: A00 */
    public final Object invoke(C30391dr r3, AnonymousClass1OX r4) {
        return ((AnimateAsStateKt$animateValueAsState$3) create(r4, r3)).invokeSuspend(C27621Wu.A00);
    }

    public final C30391dr create(Object obj, C30391dr r8) {
        AnimateAsStateKt$animateValueAsState$3 animateAsStateKt$animateValueAsState$3 = new AnimateAsStateKt$animateValueAsState$3(this.$animatable, this.$animSpec$delegate, this.$listener$delegate, r8, this.$channel);
        animateAsStateKt$animateValueAsState$3.L$0 = obj;
        return animateAsStateKt$animateValueAsState$3;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0049 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:6:0x001c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            X.1g4 r3 = X.AnonymousClass3F6.A03()
            int r0 = r11.label
            r2 = 1
            if (r0 == 0) goto L_0x004a
            if (r0 != r2) goto L_0x005b
            java.lang.Object r4 = r11.L$1
            X.DXm r4 = (X.C27177DXm) r4
            java.lang.Object r1 = r11.L$0
            X.1OX r1 = (X.AnonymousClass1OX) r1
            X.C30691eM.A01(r12)
        L_0x0016:
            boolean r0 = X.AnonymousClass000.A1Y(r12)
            if (r0 == 0) goto L_0x0058
            java.lang.Object r9 = r4.A00()
            X.5bm r0 = r11.$channel
            java.lang.Object r0 = r0.CPy()
            java.lang.Object r0 = X.C26020Cqb.A00(r0)
            if (r0 == 0) goto L_0x002d
            r9 = r0
        L_0x002d:
            X.0Q3 r6 = r11.$animatable
            X.0s2 r7 = r11.$animSpec$delegate
            X.0s2 r8 = r11.$listener$delegate
            r10 = 0
            androidx.compose.animation.core.AnimateAsStateKt$animateValueAsState$3$1 r5 = new androidx.compose.animation.core.AnimateAsStateKt$animateValueAsState$3$1
            r5.<init>(r6, r7, r8, r9, r10)
            r0 = 3
            X.AnonymousClass4Z4.A02(r10, r10, r5, r1, r0)
        L_0x003d:
            r11.L$0 = r1
            r11.L$1 = r4
            r11.label = r2
            java.lang.Object r12 = r4.A01(r11)
            if (r12 != r3) goto L_0x0016
            return r3
        L_0x004a:
            X.C30691eM.A01(r12)
            java.lang.Object r1 = r11.L$0
            X.1OX r1 = (X.AnonymousClass1OX) r1
            X.5bm r0 = r11.$channel
            X.DXm r4 = r0.Bh9()
            goto L_0x003d
        L_0x0058:
            X.1Wu r3 = X.C27621Wu.A00
            return r3
        L_0x005b:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.core.AnimateAsStateKt$animateValueAsState$3.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
