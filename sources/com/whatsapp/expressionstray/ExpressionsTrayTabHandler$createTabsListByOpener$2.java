package com.whatsapp.expressionstray;

import X.AnonymousClass1OS;
import X.C132766nY;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.expressionstray.ExpressionsTrayTabHandler$createTabsListByOpener$2", f = "ExpressionsTrayTabHandler.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class ExpressionsTrayTabHandler$createTabsListByOpener$2 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ int $opener;
    public final /* synthetic */ boolean $showEmoji;
    public int label;
    public final /* synthetic */ C132766nY this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ExpressionsTrayTabHandler$createTabsListByOpener$2(C132766nY r2, C30391dr r3, int i, boolean z) {
        super(2, r3);
        this.$opener = i;
        this.$showEmoji = z;
        this.this$0 = r2;
    }

    public final C30391dr create(Object obj, C30391dr r6) {
        return new ExpressionsTrayTabHandler$createTabsListByOpener$2(this.this$0, r6, this.$opener, this.$showEmoji);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x007f, code lost:
        if (r0 != false) goto L_0x0081;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0086, code lost:
        r0 = X.C117245zS.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x009e, code lost:
        if (X.C18020vd.A05(X.C18040vf.A02, r1.A02, 811) != false) goto L_0x00a0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00a0, code lost:
        r3.add(X.C117255zT.A00);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00a5, code lost:
        r1 = X.AnonymousClass1ZT.A02(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00c4, code lost:
        r0 = X.C117245zS.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00c6, code lost:
        r1.add(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00cf, code lost:
        if (r2.A03.A01() != false) goto L_0x00db;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00d9, code lost:
        if ((!r2.A00.A0N()) == false) goto L_0x00e0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00db, code lost:
        r0 = X.C117225zQ.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00dd, code lost:
        r1.add(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00e0, code lost:
        r0 = X.C117255zT.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00e2, code lost:
        r1.add(r0);
        r1 = X.AnonymousClass1ZT.A02(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00ef, code lost:
        return X.C147027Rn.A00(r1, 11);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r5) {
        /*
            r4 = this;
            int r0 = r4.label
            if (r0 != 0) goto L_0x00f7
            X.C30691eM.A01(r5)
            int r2 = r4.$opener
            switch(r2) {
                case 0: goto L_0x00b5;
                case 1: goto L_0x001f;
                case 2: goto L_0x00aa;
                case 3: goto L_0x0089;
                case 4: goto L_0x0079;
                case 5: goto L_0x004b;
                case 6: goto L_0x001f;
                case 7: goto L_0x0042;
                case 8: goto L_0x00f0;
                case 9: goto L_0x0027;
                case 10: goto L_0x001f;
                case 11: goto L_0x002c;
                case 12: goto L_0x001f;
                case 13: goto L_0x001f;
                case 14: goto L_0x001f;
                case 15: goto L_0x001f;
                default: goto L_0x000c;
            }
        L_0x000c:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "ExpressionsKeyboardOpener = "
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = " not supported"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A12(r0, r1)
            throw r0
        L_0x001f:
            X.5zR r0 = X.C117235zR.A00
            java.util.List r1 = X.C18070vi.A0M(r0)
            goto L_0x00e9
        L_0x0027:
            X.DcQ r1 = X.AnonymousClass1ZT.A01()
            goto L_0x0081
        L_0x002c:
            X.6nY r2 = r4.this$0
            boolean r0 = r4.$showEmoji
            X.DcQ r1 = X.AnonymousClass1ZT.A01()
            if (r0 == 0) goto L_0x003b
            X.5zR r0 = X.C117235zR.A00
            r1.add(r0)
        L_0x003b:
            X.5zS r0 = X.C117245zS.A00
            r1.add(r0)
            goto L_0x00d1
        L_0x0042:
            X.6nY r2 = r4.this$0
            X.DcQ r1 = X.AnonymousClass1ZT.A01()
            X.5zR r0 = X.C117235zR.A00
            goto L_0x00c6
        L_0x004b:
            X.6nY r1 = r4.this$0
            boolean r0 = r4.$showEmoji
            X.DcQ r3 = X.AnonymousClass1ZT.A01()
            if (r0 == 0) goto L_0x005a
            X.5zR r0 = X.C117235zR.A00
            r3.add(r0)
        L_0x005a:
            X.5zS r0 = X.C117245zS.A00
            r3.add(r0)
            X.0ve r2 = r1.A02
            r0 = 6110(0x17de, float:8.562E-42)
            X.0vf r1 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r1, r2, r0)
            if (r0 == 0) goto L_0x00a5
            r0 = 6383(0x18ef, float:8.944E-42)
            boolean r0 = X.C18020vd.A05(r1, r2, r0)
            if (r0 == 0) goto L_0x00a0
            X.5zQ r0 = X.C117225zQ.A00
            r3.add(r0)
            goto L_0x00a0
        L_0x0079:
            boolean r0 = r4.$showEmoji
            X.DcQ r1 = X.AnonymousClass1ZT.A01()
            if (r0 == 0) goto L_0x0086
        L_0x0081:
            X.5zR r0 = X.C117235zR.A00
            r1.add(r0)
        L_0x0086:
            X.5zS r0 = X.C117245zS.A00
            goto L_0x00e2
        L_0x0089:
            X.6nY r1 = r4.this$0
            X.DcQ r3 = X.AnonymousClass1ZT.A01()
            X.5zR r0 = X.C117235zR.A00
            r3.add(r0)
            X.0ve r2 = r1.A02
            r1 = 811(0x32b, float:1.136E-42)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 == 0) goto L_0x00a5
        L_0x00a0:
            X.5zT r0 = X.C117255zT.A00
            r3.add(r0)
        L_0x00a5:
            X.DcQ r1 = X.AnonymousClass1ZT.A02(r3)
            goto L_0x00e9
        L_0x00aa:
            boolean r0 = r4.$showEmoji
            X.DcQ r1 = X.AnonymousClass1ZT.A01()
            if (r0 == 0) goto L_0x00e0
            X.5zR r0 = X.C117235zR.A00
            goto L_0x00dd
        L_0x00b5:
            boolean r0 = r4.$showEmoji
            if (r0 == 0) goto L_0x00f0
            X.6nY r2 = r4.this$0
            X.DcQ r1 = X.AnonymousClass1ZT.A01()
            X.5zR r0 = X.C117235zR.A00
            r1.add(r0)
        L_0x00c4:
            X.5zS r0 = X.C117245zS.A00
        L_0x00c6:
            r1.add(r0)
            X.1Uk r0 = r2.A03
            boolean r0 = r0.A01()
            if (r0 != 0) goto L_0x00db
        L_0x00d1:
            X.11S r0 = r2.A00
            boolean r0 = r0.A0N()
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x00e0
        L_0x00db:
            X.5zQ r0 = X.C117225zQ.A00
        L_0x00dd:
            r1.add(r0)
        L_0x00e0:
            X.5zT r0 = X.C117255zT.A00
        L_0x00e2:
            r1.add(r0)
            X.DcQ r1 = X.AnonymousClass1ZT.A02(r1)
        L_0x00e9:
            r0 = 11
            java.util.List r0 = X.C147027Rn.A00(r1, r0)
            return r0
        L_0x00f0:
            X.6nY r2 = r4.this$0
            X.DcQ r1 = X.AnonymousClass1ZT.A01()
            goto L_0x00c4
        L_0x00f7:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.expressionstray.ExpressionsTrayTabHandler$createTabsListByOpener$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((ExpressionsTrayTabHandler$createTabsListByOpener$2) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
