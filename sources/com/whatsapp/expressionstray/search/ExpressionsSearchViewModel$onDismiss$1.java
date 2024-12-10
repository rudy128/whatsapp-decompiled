package com.whatsapp.expressionstray.search;

import X.AnonymousClass1OS;
import X.C27621Wu;
import X.C30391dr;
import X.C30431dv;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.expressionstray.search.ExpressionsSearchViewModel$onDismiss$1", f = "ExpressionsSearchViewModel.kt", i = {}, l = {474}, m = "invokeSuspend", n = {}, s = {})
public final class ExpressionsSearchViewModel$onDismiss$1 extends C30431dv implements AnonymousClass1OS {
    public int label;
    public final /* synthetic */ ExpressionsSearchViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ExpressionsSearchViewModel$onDismiss$1(ExpressionsSearchViewModel expressionsSearchViewModel, C30391dr r3) {
        super(2, r3);
        this.this$0 = expressionsSearchViewModel;
    }

    public final C30391dr create(Object obj, C30391dr r4) {
        return new ExpressionsSearchViewModel$onDismiss$1(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new ExpressionsSearchViewModel$onDismiss$1(this.this$0, (C30391dr) obj2).invokeSuspend(C27621Wu.A00);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0099, code lost:
        if (r0 == false) goto L_0x009b;
     */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0030  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0071 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0072  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            X.1g4 r4 = X.C31751g4.COROUTINE_SUSPENDED
            int r0 = r8.label
            r2 = 1
            if (r0 == 0) goto L_0x000f
            if (r0 != r2) goto L_0x009d
            X.C30691eM.A01(r9)
        L_0x000c:
            X.1Wu r0 = X.C27621Wu.A00
            return r0
        L_0x000f:
            X.C30691eM.A01(r9)
            X.634 r3 = new X.634
            r3.<init>()
            com.whatsapp.expressionstray.search.ExpressionsSearchViewModel r0 = r8.this$0
            X.6e2 r1 = r0.A03
            X.5zQ r0 = X.C117225zQ.A00
            boolean r0 = X.C18070vi.A18(r1, r0)
            if (r0 == 0) goto L_0x007d
            r1 = 3
        L_0x0024:
            java.lang.Integer r0 = X.AnonymousClass3MW.A0v(r1)
        L_0x0028:
            r3.A01 = r0
            com.whatsapp.expressionstray.search.ExpressionsSearchViewModel r5 = r8.this$0
            boolean r0 = r5.A06
            if (r0 == 0) goto L_0x0072
            java.lang.Integer r0 = X.AnonymousClass3MW.A0v(r2)
        L_0x0034:
            r3.A00 = r0
            X.11P r0 = r5.A09
            long r0 = X.AnonymousClass11P.A01(r0)
            java.lang.Long r5 = new java.lang.Long
            r5.<init>(r0)
            r3.A03 = r5
            com.whatsapp.expressionstray.search.ExpressionsSearchViewModel r7 = r8.this$0
            int r1 = r7.A01
            r0 = -1
            if (r1 == r0) goto L_0x0052
            long r5 = (long) r1
            java.lang.Long r0 = new java.lang.Long
            r0.<init>(r5)
            r3.A02 = r0
        L_0x0052:
            X.18K r0 = r7.A0C
            r0.CC7(r3)
            com.whatsapp.expressionstray.search.ExpressionsSearchViewModel r0 = r8.this$0
            X.00H r0 = r0.A0I
            java.lang.Object r3 = r0.get()
            X.6e3 r3 = (X.C127256e3) r3
            r8.label = r2
            X.0wl r2 = r3.A00
            r1 = 0
            com.whatsapp.expressionstray.search.SearchQueryProvider$clearSearchQuery$2 r0 = new com.whatsapp.expressionstray.search.SearchQueryProvider$clearSearchQuery$2
            r0.<init>(r3, r1)
            java.lang.Object r0 = X.C30451dy.A00(r8, r2, r0)
            if (r0 != r4) goto L_0x000c
            return r4
        L_0x0072:
            boolean r1 = r5.A05
            r0 = 3
            if (r1 == 0) goto L_0x0078
            r0 = 2
        L_0x0078:
            java.lang.Integer r0 = X.AnonymousClass3MW.A0v(r0)
            goto L_0x0034
        L_0x007d:
            X.5zS r0 = X.C117245zS.A00
            boolean r0 = X.C18070vi.A18(r1, r0)
            if (r0 == 0) goto L_0x008a
            java.lang.Integer r0 = X.AnonymousClass3MW.A0v(r2)
            goto L_0x0028
        L_0x008a:
            X.5zT r0 = X.C117255zT.A00
            boolean r0 = X.C18070vi.A18(r1, r0)
            if (r0 != 0) goto L_0x009b
            X.5zR r0 = X.C117235zR.A00
            boolean r0 = X.C18070vi.A18(r1, r0)
            r1 = 4
            if (r0 != 0) goto L_0x0024
        L_0x009b:
            r1 = 2
            goto L_0x0024
        L_0x009d:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.expressionstray.search.ExpressionsSearchViewModel$onDismiss$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
