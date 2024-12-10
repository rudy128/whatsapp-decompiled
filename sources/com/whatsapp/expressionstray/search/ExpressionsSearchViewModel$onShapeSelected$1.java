package com.whatsapp.expressionstray.search;

import X.AnonymousClass1OS;
import X.C139806zT;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import android.content.Context;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.expressionstray.search.ExpressionsSearchViewModel$onShapeSelected$1", f = "ExpressionsSearchViewModel.kt", i = {}, l = {423, 429}, m = "invokeSuspend", n = {}, s = {})
public final class ExpressionsSearchViewModel$onShapeSelected$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ Context $context;
    public final /* synthetic */ C139806zT $shape;
    public Object L$0;
    public int label;
    public final /* synthetic */ ExpressionsSearchViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ExpressionsSearchViewModel$onShapeSelected$1(Context context, C139806zT r3, ExpressionsSearchViewModel expressionsSearchViewModel, C30391dr r5) {
        super(2, r5);
        this.$shape = r3;
        this.$context = context;
        this.this$0 = expressionsSearchViewModel;
    }

    public final C30391dr create(Object obj, C30391dr r6) {
        return new ExpressionsSearchViewModel$onShapeSelected$1(this.$context, this.$shape, this.this$0, r6);
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x005b A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            X.1g4 r4 = X.C31751g4.COROUTINE_SUSPENDED
            int r0 = r7.label
            r5 = 2
            r6 = 1
            if (r0 == 0) goto L_0x0012
            if (r0 == r6) goto L_0x003e
            if (r0 != r5) goto L_0x005c
            X.C30691eM.A01(r8)
        L_0x000f:
            X.1Wu r0 = X.C27621Wu.A00
            return r0
        L_0x0012:
            X.C30691eM.A01(r8)
            X.6zT r0 = r7.$shape
            X.8B0 r3 = r0.A00
            android.content.Context r2 = r7.$context
            com.whatsapp.expressionstray.search.ExpressionsSearchViewModel r0 = r7.this$0
            X.0vb r1 = r0.A0A
            r0 = 0
            X.73u r3 = r3.BHq(r2, r1, r0)
            com.whatsapp.expressionstray.search.ExpressionsSearchViewModel r0 = r7.this$0
            X.1G3 r2 = r0.A0L
            X.00H r0 = r0.A0F
            X.1BI r1 = X.C137836w6.A00(r0)
            X.5zK r0 = new X.5zK
            r0.<init>(r1, r3)
            r7.L$0 = r3
            r7.label = r6
            java.lang.Object r0 = r2.BJt(r0, r7)
            if (r0 != r4) goto L_0x0041
            return r4
        L_0x003e:
            X.C30691eM.A01(r8)
        L_0x0041:
            com.whatsapp.expressionstray.search.ExpressionsSearchViewModel r0 = r7.this$0
            X.1G3 r2 = r0.A0L
            X.00H r0 = r0.A0F
            X.1BI r0 = X.C137836w6.A00(r0)
            X.5zA r1 = new X.5zA
            r1.<init>(r0)
            r0 = 0
            r7.L$0 = r0
            r7.label = r5
            java.lang.Object r0 = r2.BJt(r1, r7)
            if (r0 != r4) goto L_0x000f
            return r4
        L_0x005c:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.expressionstray.search.ExpressionsSearchViewModel$onShapeSelected$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((ExpressionsSearchViewModel$onShapeSelected$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
