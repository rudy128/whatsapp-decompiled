package com.whatsapp.expressionstray.search;

import X.AnonymousClass1OS;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.expressionstray.search.ExpressionsSearchViewModel$onTabsUpdated$1", f = "ExpressionsSearchViewModel.kt", i = {0}, l = {285}, m = "invokeSuspend", n = {"shouldShowEmoji"}, s = {"I$0"})
public final class ExpressionsSearchViewModel$onTabsUpdated$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ int $from;
    public int I$0;
    public Object L$0;
    public int label;
    public final /* synthetic */ ExpressionsSearchViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ExpressionsSearchViewModel$onTabsUpdated$1(ExpressionsSearchViewModel expressionsSearchViewModel, C30391dr r3, int i) {
        super(2, r3);
        this.this$0 = expressionsSearchViewModel;
        this.$from = i;
    }

    public final C30391dr create(Object obj, C30391dr r5) {
        return new ExpressionsSearchViewModel$onTabsUpdated$1(this.this$0, r5, this.$from);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v1, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v4, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v5, resolved type: boolean} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            X.1g4 r8 = X.C31751g4.COROUTINE_SUSPENDED
            int r0 = r9.label
            r6 = 0
            r2 = 1
            if (r0 == 0) goto L_0x006b
            if (r0 != r2) goto L_0x0098
            int r7 = r9.I$0
            java.lang.Object r5 = r9.L$0
            com.whatsapp.expressionstray.search.ExpressionsSearchViewModel r5 = (com.whatsapp.expressionstray.search.ExpressionsSearchViewModel) r5
            X.C30691eM.A01(r10)
        L_0x0013:
            java.util.List r10 = (java.util.List) r10
            r5.A04 = r10
            com.whatsapp.expressionstray.search.ExpressionsSearchViewModel r2 = r9.this$0
            X.00H r0 = r2.A0H
            java.lang.Object r1 = r0.get()
            X.6nY r1 = (X.C132766nY) r1
            int r0 = r9.$from
            if (r7 == 0) goto L_0x0026
            r6 = 1
        L_0x0026:
            X.6e2 r0 = r1.A00(r0, r6)
            com.whatsapp.expressionstray.search.ExpressionsSearchViewModel.A00(r0, r2)
            com.whatsapp.expressionstray.search.ExpressionsSearchViewModel r0 = r9.this$0
            java.util.List r1 = r0.A04
            X.6e2 r0 = r0.A03
            int r6 = r1.indexOf(r0)
            com.whatsapp.expressionstray.search.ExpressionsSearchViewModel r2 = r9.this$0
            if (r6 >= 0) goto L_0x0047
            java.lang.String r1 = "expression_search_tabs_update_failed"
        L_0x003d:
            java.lang.Integer r0 = X.AnonymousClass3MW.A0v(r6)
            com.whatsapp.expressionstray.search.ExpressionsSearchViewModel.A03(r2, r0, r1)
        L_0x0044:
            X.1Wu r0 = X.C27621Wu.A00
            return r0
        L_0x0047:
            java.util.List r0 = r2.A04
            boolean r0 = r0.isEmpty()
            com.whatsapp.expressionstray.search.ExpressionsSearchViewModel r2 = r9.this$0
            if (r0 == 0) goto L_0x0054
            java.lang.String r1 = "expression_search_tabs_update_failed_expression_tabs_is_empty"
            goto L_0x003d
        L_0x0054:
            X.1DT r1 = r2.A08
            X.6e2 r4 = r2.A03
            java.util.List r5 = r2.A04
            boolean r0 = com.whatsapp.expressionstray.search.ExpressionsSearchViewModel.A04(r2)
            r7 = r0 ^ 1
            r3 = 0
            r8 = 0
            X.60g r2 = new X.60g
            r2.<init>(r3, r4, r5, r6, r7, r8)
            r1.A0F(r2)
            goto L_0x0044
        L_0x006b:
            X.C30691eM.A01(r10)
            com.whatsapp.expressionstray.search.ExpressionsSearchViewModel r5 = r9.this$0
            int r1 = r9.$from
            r5.A00 = r1
            r0 = 7
            boolean r7 = X.AnonymousClass000.A1T(r1, r0)
            X.00H r0 = r5.A0H
            java.lang.Object r4 = r0.get()
            X.6nY r4 = (X.C132766nY) r4
            int r3 = r9.$from
            r9.L$0 = r5
            r9.I$0 = r7
            r9.label = r2
            X.0wl r2 = r4.A04
            r1 = 0
            com.whatsapp.expressionstray.ExpressionsTrayTabHandler$createTabsListByOpener$2 r0 = new com.whatsapp.expressionstray.ExpressionsTrayTabHandler$createTabsListByOpener$2
            r0.<init>(r4, r1, r3, r7)
            java.lang.Object r10 = X.C30451dy.A00(r9, r2, r0)
            if (r10 != r8) goto L_0x0013
            return r8
        L_0x0098:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.expressionstray.search.ExpressionsSearchViewModel$onTabsUpdated$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((ExpressionsSearchViewModel$onTabsUpdated$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
