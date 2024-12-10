package com.whatsapp.expressionstray;

import X.AnonymousClass1OS;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.expressionstray.ExpressionsTrayViewModel$onSearchStarted$1", f = "ExpressionsTrayViewModel.kt", i = {}, l = {409, 414, 418}, m = "invokeSuspend", n = {}, s = {})
public final class ExpressionsTrayViewModel$onSearchStarted$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ String $preFilledQuery;
    public int label;
    public final /* synthetic */ ExpressionsTrayViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ExpressionsTrayViewModel$onSearchStarted$1(ExpressionsTrayViewModel expressionsTrayViewModel, String str, C30391dr r4) {
        super(2, r4);
        this.this$0 = expressionsTrayViewModel;
        this.$preFilledQuery = str;
    }

    public final C30391dr create(Object obj, C30391dr r5) {
        return new ExpressionsTrayViewModel$onSearchStarted$1(this.this$0, this.$preFilledQuery, r5);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00a0, code lost:
        if (X.C18070vi.A18(r1, r7) == false) goto L_0x00a2;
     */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x003b A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            r12 = this;
            X.1g4 r3 = X.C31751g4.COROUTINE_SUSPENDED
            int r0 = r12.label
            r4 = 3
            r2 = 2
            r1 = 1
            if (r0 == 0) goto L_0x0014
            if (r0 == r1) goto L_0x00c1
            if (r0 == r2) goto L_0x00c1
            if (r0 == r4) goto L_0x00c1
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        L_0x0014:
            X.C30691eM.A01(r13)
            com.whatsapp.expressionstray.ExpressionsTrayViewModel r0 = r12.this$0
            X.6e2 r0 = r0.A02
            X.5zR r7 = X.C117235zR.A00
            boolean r0 = X.C18070vi.A18(r0, r7)
            if (r0 == 0) goto L_0x003c
            com.whatsapp.expressionstray.ExpressionsTrayViewModel r6 = r12.this$0
            int r5 = r6.A00
            r0 = 7
            if (r5 == r0) goto L_0x003c
            X.1G3 r5 = r6.A0G
            X.1BI r0 = r6.A03
            X.5zG r4 = new X.5zG
            r4.<init>(r0)
            r12.label = r1
        L_0x0035:
            java.lang.Object r0 = r5.BJt(r4, r12)
        L_0x0039:
            if (r0 != r3) goto L_0x00c4
            return r3
        L_0x003c:
            com.whatsapp.expressionstray.ExpressionsTrayViewModel r6 = r12.this$0
            X.62j r5 = new X.62j
            r5.<init>()
            int r0 = r6.A00
            java.lang.Integer r10 = java.lang.Integer.valueOf(r4)
            java.lang.Integer r11 = X.C17880vN.A0k()
            java.lang.Integer r9 = java.lang.Integer.valueOf(r2)
            java.lang.Integer r8 = java.lang.Integer.valueOf(r1)
            switch(r0) {
                case 2: goto L_0x00b0;
                case 3: goto L_0x00ae;
                case 4: goto L_0x00ac;
                case 5: goto L_0x00a6;
                case 6: goto L_0x0058;
                case 7: goto L_0x00a4;
                default: goto L_0x0058;
            }
        L_0x0058:
            r0 = r8
        L_0x0059:
            r5.A00 = r0
            X.6e2 r1 = r6.A02
            X.5zQ r0 = X.C117225zQ.A00
            boolean r0 = X.C18070vi.A18(r1, r0)
            if (r0 != 0) goto L_0x006e
            X.5zS r0 = X.C117245zS.A00
            boolean r0 = X.C18070vi.A18(r1, r0)
            if (r0 == 0) goto L_0x0093
            r10 = r8
        L_0x006e:
            r5.A01 = r10
            X.11P r0 = r6.A06
            long r0 = X.AnonymousClass11P.A01(r0)
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r5.A02 = r0
            X.18K r0 = r6.A0A
            r0.CC7(r5)
            java.lang.String r1 = r12.$preFilledQuery
            com.whatsapp.expressionstray.ExpressionsTrayViewModel r0 = r12.this$0
            X.1G3 r5 = r0.A0G
            if (r1 == 0) goto L_0x00b2
            X.1BI r0 = r0.A03
            X.5zM r4 = new X.5zM
            r4.<init>(r0, r1)
            r12.label = r2
            goto L_0x0035
        L_0x0093:
            X.5zT r0 = X.C117255zT.A00
            boolean r0 = X.C18070vi.A18(r1, r0)
            if (r0 != 0) goto L_0x00a2
            boolean r0 = X.C18070vi.A18(r1, r7)
            r10 = r11
            if (r0 != 0) goto L_0x006e
        L_0x00a2:
            r10 = r9
            goto L_0x006e
        L_0x00a4:
            r0 = 7
            goto L_0x00a7
        L_0x00a6:
            r0 = 5
        L_0x00a7:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto L_0x0059
        L_0x00ac:
            r0 = r9
            goto L_0x0059
        L_0x00ae:
            r0 = r10
            goto L_0x0059
        L_0x00b0:
            r0 = r11
            goto L_0x0059
        L_0x00b2:
            X.1BI r1 = r0.A03
            X.5zF r0 = new X.5zF
            r0.<init>(r1)
            r12.label = r4
            java.lang.Object r0 = r5.BJt(r0, r12)
            goto L_0x0039
        L_0x00c1:
            X.C30691eM.A01(r13)
        L_0x00c4:
            X.1Wu r0 = X.C27621Wu.A00
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.expressionstray.ExpressionsTrayViewModel$onSearchStarted$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((ExpressionsTrayViewModel$onSearchStarted$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
