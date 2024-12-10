package com.whatsapp.expressionstray;

import X.AnonymousClass1OS;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.expressionstray.ExpressionsTrayViewModel$onTabsUpdated$1", f = "ExpressionsTrayViewModel.kt", i = {}, l = {197}, m = "invokeSuspend", n = {}, s = {})
public final class ExpressionsTrayViewModel$onTabsUpdated$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ int $from;
    public final /* synthetic */ Integer $trayChatType;
    public final /* synthetic */ Integer $trayOrigin;
    public final /* synthetic */ Integer $trayScreen;
    public final /* synthetic */ Integer $trayTarget;
    public Object L$0;
    public int label;
    public final /* synthetic */ ExpressionsTrayViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ExpressionsTrayViewModel$onTabsUpdated$1(ExpressionsTrayViewModel expressionsTrayViewModel, Integer num, Integer num2, Integer num3, Integer num4, C30391dr r7, int i) {
        super(2, r7);
        this.this$0 = expressionsTrayViewModel;
        this.$from = i;
        this.$trayOrigin = num;
        this.$trayTarget = num2;
        this.$trayScreen = num3;
        this.$trayChatType = num4;
    }

    public final C30391dr create(Object obj, C30391dr r10) {
        return new ExpressionsTrayViewModel$onTabsUpdated$1(this.this$0, this.$trayOrigin, this.$trayTarget, this.$trayScreen, this.$trayChatType, r10, this.$from);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0035, code lost:
        if (r1 != 15) goto L_0x0037;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00fd, code lost:
        if (X.C18070vi.A18(r1, r0) != false) goto L_0x0037;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            X.1g4 r7 = X.C31751g4.COROUTINE_SUSPENDED
            int r0 = r8.label
            r6 = 1
            if (r0 == 0) goto L_0x0108
            if (r0 != r6) goto L_0x012b
            java.lang.Object r5 = r8.L$0
            com.whatsapp.expressionstray.ExpressionsTrayViewModel r5 = (com.whatsapp.expressionstray.ExpressionsTrayViewModel) r5
            X.C30691eM.A01(r9)
        L_0x0010:
            java.util.List r9 = (java.util.List) r9
            r5.A04 = r9
            com.whatsapp.expressionstray.ExpressionsTrayViewModel r2 = r8.this$0
            X.6nY r1 = r2.A08
            int r0 = r8.$from
            X.6e2 r0 = r1.A00(r0, r6)
            com.whatsapp.expressionstray.ExpressionsTrayViewModel.A00(r0, r2)
            int r1 = r8.$from
            r0 = 2
            if (r1 == r0) goto L_0x00e7
            r0 = 3
            if (r1 == r0) goto L_0x00e7
            r0 = 4
            if (r1 == r0) goto L_0x00d4
            r0 = 5
            if (r1 == r0) goto L_0x00d4
            r0 = 14
            if (r1 == r0) goto L_0x00ff
            r0 = 15
            if (r1 == r0) goto L_0x00ff
        L_0x0037:
            java.lang.Integer r0 = r8.$trayOrigin
            if (r0 == 0) goto L_0x0065
            com.whatsapp.expressionstray.ExpressionsTrayViewModel r1 = r8.this$0
            X.A59 r2 = r1.A07
            java.lang.Integer r0 = r8.$trayTarget
            if (r0 == 0) goto L_0x00d0
            int r4 = r0.intValue()
        L_0x0047:
            java.lang.Integer r0 = r8.$trayScreen
            if (r0 == 0) goto L_0x00a5
            int r5 = r0.intValue()
        L_0x004f:
            java.lang.Integer r0 = r8.$trayOrigin
            int r6 = r0.intValue()
            java.lang.Integer r3 = r8.$trayChatType
            if (r3 != 0) goto L_0x0061
            com.whatsapp.expressionstray.ExpressionsTrayViewModel r0 = r8.this$0
            X.1BI r0 = r0.A03
            java.lang.Integer r3 = X.A3P.A00(r0)
        L_0x0061:
            r7 = 1
            r2.A04(r3, r4, r5, r6, r7)
        L_0x0065:
            com.whatsapp.expressionstray.ExpressionsTrayViewModel r0 = r8.this$0
            java.util.List r1 = r0.A04
            X.6e2 r0 = r0.A02
            int r6 = r1.indexOf(r0)
            com.whatsapp.expressionstray.ExpressionsTrayViewModel r2 = r8.this$0
            if (r6 >= 0) goto L_0x007f
            java.lang.String r1 = "expression_keyboard_tab_update_failed"
        L_0x0075:
            java.lang.Integer r0 = X.AnonymousClass3MW.A0v(r6)
            com.whatsapp.expressionstray.ExpressionsTrayViewModel.A03(r2, r0, r1)
        L_0x007c:
            X.1Wu r0 = X.C27621Wu.A00
            return r0
        L_0x007f:
            java.util.List r0 = r2.A04
            boolean r0 = r0.isEmpty()
            com.whatsapp.expressionstray.ExpressionsTrayViewModel r2 = r8.this$0
            if (r0 == 0) goto L_0x008c
            java.lang.String r1 = "expression_keyboard_tab_update_failed_expression_tabs_is_empty"
            goto L_0x0075
        L_0x008c:
            X.1DT r1 = r2.A05
            X.6e2 r4 = r2.A02
            java.util.List r5 = r2.A04
            X.1Uk r0 = r2.A0B
            boolean r7 = r0.A01()
            com.whatsapp.expressionstray.ExpressionsTrayViewModel r0 = r8.this$0
            android.graphics.Bitmap r3 = r0.A01
            X.5zU r2 = new X.5zU
            r2.<init>(r3, r4, r5, r6, r7)
            r1.A0F(r2)
            goto L_0x007c
        L_0x00a5:
            X.6e2 r1 = r1.A02
            X.5zR r0 = X.C117235zR.A00
            boolean r0 = X.C18070vi.A18(r1, r0)
            if (r0 == 0) goto L_0x00b1
            r5 = 4
            goto L_0x004f
        L_0x00b1:
            X.5zT r0 = X.C117255zT.A00
            boolean r0 = X.C18070vi.A18(r1, r0)
            if (r0 == 0) goto L_0x00bc
            r5 = 10
            goto L_0x004f
        L_0x00bc:
            X.5zS r0 = X.C117245zS.A00
            boolean r0 = X.C18070vi.A18(r1, r0)
            if (r0 == 0) goto L_0x00c6
            r5 = 6
            goto L_0x004f
        L_0x00c6:
            X.5zQ r0 = X.C117225zQ.A00
            boolean r0 = X.C18070vi.A18(r1, r0)
            if (r0 == 0) goto L_0x0126
            r5 = 3
            goto L_0x004f
        L_0x00d0:
            r4 = 20
            goto L_0x0047
        L_0x00d4:
            com.whatsapp.expressionstray.ExpressionsTrayViewModel r0 = r8.this$0
            X.6e2 r1 = r0.A02
            X.5zR r0 = X.C117235zR.A00
            boolean r0 = X.C18070vi.A18(r1, r0)
            if (r0 != 0) goto L_0x0037
            com.whatsapp.expressionstray.ExpressionsTrayViewModel r0 = r8.this$0
            X.6e2 r1 = r0.A02
            X.5zS r0 = X.C117245zS.A00
            goto L_0x00f9
        L_0x00e7:
            com.whatsapp.expressionstray.ExpressionsTrayViewModel r0 = r8.this$0
            X.6e2 r1 = r0.A02
            X.5zR r0 = X.C117235zR.A00
            boolean r0 = X.C18070vi.A18(r1, r0)
            if (r0 != 0) goto L_0x0037
            com.whatsapp.expressionstray.ExpressionsTrayViewModel r0 = r8.this$0
            X.6e2 r1 = r0.A02
            X.5zT r0 = X.C117255zT.A00
        L_0x00f9:
            boolean r0 = X.C18070vi.A18(r1, r0)
            if (r0 != 0) goto L_0x0037
        L_0x00ff:
            com.whatsapp.expressionstray.ExpressionsTrayViewModel r1 = r8.this$0
            X.5zR r0 = X.C117235zR.A00
            com.whatsapp.expressionstray.ExpressionsTrayViewModel.A00(r0, r1)
            goto L_0x0037
        L_0x0108:
            X.C30691eM.A01(r9)
            com.whatsapp.expressionstray.ExpressionsTrayViewModel r5 = r8.this$0
            int r4 = r8.$from
            r5.A00 = r4
            X.6nY r3 = r5.A08
            r8.L$0 = r5
            r8.label = r6
            X.0wl r2 = r3.A04
            r1 = 0
            com.whatsapp.expressionstray.ExpressionsTrayTabHandler$createTabsListByOpener$2 r0 = new com.whatsapp.expressionstray.ExpressionsTrayTabHandler$createTabsListByOpener$2
            r0.<init>(r3, r1, r4, r6)
            java.lang.Object r9 = X.C30451dy.A00(r8, r2, r0)
            if (r9 != r7) goto L_0x0010
            return r7
        L_0x0126:
            X.3EW r0 = X.AnonymousClass3MW.A14()
            throw r0
        L_0x012b:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.expressionstray.ExpressionsTrayViewModel$onTabsUpdated$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((ExpressionsTrayViewModel$onTabsUpdated$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
