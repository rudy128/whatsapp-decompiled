package com.whatsapp.expressionstray.search;

import X.AnonymousClass1OS;
import X.AnonymousClass77J;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.expressionstray.search.ExpressionsSearchViewModel$onGifSelected$1", f = "ExpressionsSearchViewModel.kt", i = {}, l = {380}, m = "invokeSuspend", n = {}, s = {})
public final class ExpressionsSearchViewModel$onGifSelected$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ AnonymousClass77J $result;
    public final /* synthetic */ boolean $sendWithoutPreview;
    public int label;
    public final /* synthetic */ ExpressionsSearchViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ExpressionsSearchViewModel$onGifSelected$1(ExpressionsSearchViewModel expressionsSearchViewModel, AnonymousClass77J r3, C30391dr r4, boolean z) {
        super(2, r4);
        this.this$0 = expressionsSearchViewModel;
        this.$result = r3;
        this.$sendWithoutPreview = z;
    }

    public final C30391dr create(Object obj, C30391dr r6) {
        return new ExpressionsSearchViewModel$onGifSelected$1(this.this$0, this.$result, r6, this.$sendWithoutPreview);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0082, code lost:
        if (r8.$sendWithoutPreview == false) goto L_0x0084;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            X.1g4 r7 = X.C31751g4.COROUTINE_SUSPENDED
            int r0 = r8.label
            r6 = 0
            r5 = 1
            if (r0 == 0) goto L_0x0067
            if (r0 != r5) goto L_0x009b
            X.C30691eM.A01(r9)
        L_0x000d:
            com.whatsapp.expressionstray.search.ExpressionsSearchViewModel r0 = r8.this$0
            X.0ve r0 = r0.A0B
            r4 = 0
            X.C18070vi.A0d(r0, r6)
            r3 = 9452(0x24ec, float:1.3245E-41)
            boolean r0 = X.C25291Nq.A04(r0, r3)
            if (r0 == 0) goto L_0x0022
            boolean r0 = r8.$sendWithoutPreview
            if (r0 != 0) goto L_0x0022
            r6 = 1
        L_0x0022:
            com.whatsapp.expressionstray.search.ExpressionsSearchViewModel r0 = r8.this$0
            X.00H r0 = r0.A0G
            X.A59 r2 = X.C108945cZ.A0e(r0)
            if (r6 == 0) goto L_0x002d
            r5 = 4
        L_0x002d:
            r0 = 22
            java.lang.Integer r1 = X.AnonymousClass3MW.A0v(r0)
            r0 = 5
            r2.A03(r1, r5, r0)
            com.whatsapp.expressionstray.search.ExpressionsSearchViewModel r0 = r8.this$0
            X.0ve r0 = r0.A0B
            X.C18070vi.A0d(r0, r4)
            boolean r0 = X.C25291Nq.A04(r0, r3)
            if (r0 == 0) goto L_0x0064
            X.77J r0 = r8.$result
            int r0 = r0.A00
            if (r0 == 0) goto L_0x0064
            X.620 r1 = new X.620
            r1.<init>()
            X.77J r0 = r8.$result
            int r0 = r0.A00
            int r0 = X.C123876We.A00(r0)
            java.lang.Integer r0 = X.AnonymousClass3MW.A0v(r0)
            r1.A00 = r0
            com.whatsapp.expressionstray.search.ExpressionsSearchViewModel r0 = r8.this$0
            X.18K r0 = r0.A0C
            r0.CC7(r1)
        L_0x0064:
            X.1Wu r0 = X.C27621Wu.A00
            return r0
        L_0x0067:
            X.C30691eM.A01(r9)
            com.whatsapp.expressionstray.search.ExpressionsSearchViewModel r0 = r8.this$0
            r0.A06 = r5
            X.1G3 r4 = r0.A0L
            X.77J r3 = r8.$result
            X.0ve r1 = r0.A0B
            X.C18070vi.A0d(r1, r6)
            r0 = 9452(0x24ec, float:1.3245E-41)
            boolean r0 = X.C25291Nq.A04(r1, r0)
            if (r0 == 0) goto L_0x0084
            boolean r0 = r8.$sendWithoutPreview
            r2 = 1
            if (r0 != 0) goto L_0x0085
        L_0x0084:
            r2 = 0
        L_0x0085:
            com.whatsapp.expressionstray.search.ExpressionsSearchViewModel r0 = r8.this$0
            X.00H r0 = r0.A0F
            X.1BI r1 = X.C137836w6.A00(r0)
            X.5zO r0 = new X.5zO
            r0.<init>(r3, r1, r5, r2)
            r8.label = r5
            java.lang.Object r0 = r4.BJt(r0, r8)
            if (r0 != r7) goto L_0x000d
            return r7
        L_0x009b:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.expressionstray.search.ExpressionsSearchViewModel$onGifSelected$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((ExpressionsSearchViewModel$onGifSelected$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
