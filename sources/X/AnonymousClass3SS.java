package X;

/* renamed from: X.3SS  reason: invalid class name */
public class AnonymousClass3SS extends AnonymousClass1XU {
    public final int A00;
    public final Object A01;

    public AnonymousClass3SS(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0014, code lost:
        r0 = (X.AnonymousClass48A) r3.A01;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A1T(android.view.View r4, android.view.accessibility.AccessibilityEvent r5) {
        /*
            r3 = this;
            int r0 = r3.A00
            switch(r0) {
                case 8: goto L_0x0040;
                case 9: goto L_0x0005;
                case 10: goto L_0x0005;
                case 11: goto L_0x0022;
                case 12: goto L_0x0009;
                default: goto L_0x0005;
            }
        L_0x0005:
            super.A1T(r4, r5)
        L_0x0008:
            return
        L_0x0009:
            super.A1T(r4, r5)
            int r1 = r5.getEventType()
            r0 = 65536(0x10000, float:9.18355E-41)
            if (r1 != r0) goto L_0x0008
            java.lang.Object r0 = r3.A01
            X.48A r0 = (X.AnonymousClass48A) r0
            java.lang.Runnable r1 = r0.A01
            if (r1 == 0) goto L_0x0008
            android.widget.TextView r0 = r0.A04
            r0.removeCallbacks(r1)
            return
        L_0x0022:
            super.A1T(r4, r5)
            java.lang.Object r2 = r3.A01
            com.whatsapp.search.views.TokenizedSearchInput r2 = (com.whatsapp.search.views.TokenizedSearchInput) r2
            X.11C r0 = r2.A08
            android.view.accessibility.AccessibilityManager r0 = r0.A0M()
            boolean r0 = X.AnonymousClass1Y5.A0D(r0)
            if (r0 == 0) goto L_0x0008
            int r1 = r5.getEventType()
            r0 = 1
            if (r1 != r0) goto L_0x0008
            com.whatsapp.search.views.TokenizedSearchInput.A06(r4, r2)
            return
        L_0x0040:
            super.A1T(r4, r5)
            java.lang.Object r0 = r3.A01
            X.4aY r0 = (X.AnonymousClass4aY) r0
            X.5cQ r0 = r0.A2Q
            X.1f4 r0 = r0.getMessageAudioPlayerProvider()
            boolean r0 = r0.A0B()
            if (r0 == 0) goto L_0x0008
            r0 = -1
            r5.setFromIndex(r0)
            r5.setToIndex(r0)
            r5.setItemCount(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3SS.A1T(android.view.View, android.view.accessibility.AccessibilityEvent):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x00b6, code lost:
        if (X.C83724Gk.A00(r2.A3F, r2.A4L) == false) goto L_0x00b8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00fd, code lost:
        r5.A0Q(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0100, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0005, code lost:
        super.A1Z(r4, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0152, code lost:
        r5.A0L(new X.C26137Ct0(16, (java.lang.CharSequence) r1.getString(r0)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0160, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A1Z(android.view.View r4, X.C26228CvK r5) {
        /*
            r3 = this;
            int r0 = r3.A00
            switch(r0) {
                case 0: goto L_0x00eb;
                case 1: goto L_0x013f;
                case 2: goto L_0x00e3;
                case 3: goto L_0x00c4;
                case 4: goto L_0x0059;
                case 5: goto L_0x00e3;
                case 6: goto L_0x012b;
                case 7: goto L_0x0092;
                case 8: goto L_0x0005;
                case 9: goto L_0x0117;
                case 10: goto L_0x0101;
                case 11: goto L_0x0016;
                case 12: goto L_0x0005;
                case 13: goto L_0x0009;
                case 14: goto L_0x0009;
                default: goto L_0x0005;
            }
        L_0x0005:
            super.A1Z(r4, r5)
        L_0x0008:
            return
        L_0x0009:
            X.C18070vi.A0h(r4, r5)
            java.lang.Object r0 = r3.A01
            boolean r0 = X.AnonymousClass000.A1W(r0)
            r5.A0f(r0)
            goto L_0x0005
        L_0x0016:
            super.A1Z(r4, r5)
            java.lang.Object r2 = r3.A01
            com.whatsapp.search.views.TokenizedSearchInput r2 = (com.whatsapp.search.views.TokenizedSearchInput) r2
            X.11C r0 = r2.A08
            android.view.accessibility.AccessibilityManager r0 = r0.A0M()
            boolean r0 = X.AnonymousClass1Y5.A0D(r0)
            if (r0 == 0) goto L_0x0008
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 23
            if (r1 >= r0) goto L_0x003d
            android.content.Context r1 = r2.getContext()
            r0 = 2131886264(0x7f1200b8, float:1.9407102E38)
            java.lang.String r0 = r1.getString(r0)
            r5.A0V(r0)
        L_0x003d:
            java.lang.Class<android.widget.Button> r0 = android.widget.Button.class
            java.lang.String r0 = r0.getName()
            r5.A0O(r0)
            r0 = 0
            r5.A0d(r0)
            r0 = 1
            r5.A0f(r0)
            X.Ct0 r0 = X.C26137Ct0.A08
            android.content.Context r1 = r2.getContext()
            r0 = 2131886193(0x7f120071, float:1.9406958E38)
            goto L_0x0152
        L_0x0059:
            super.A1Z(r4, r5)
            r0 = 0
            r5.A0f(r0)
            android.view.accessibility.AccessibilityNodeInfo r0 = r5.A02
            boolean r0 = r0.isLongClickable()
            if (r0 == 0) goto L_0x0008
            X.Ct0 r0 = X.C26137Ct0.A08
            android.content.res.Resources r1 = r4.getResources()
            r0 = 2131886200(0x7f120078, float:1.9406972E38)
            java.lang.String r2 = r1.getString(r0)
            r1 = 32
            X.Ct0 r0 = new X.Ct0
            r0.<init>((int) r1, (java.lang.CharSequence) r2)
            r5.A0L(r0)
            java.lang.Object r0 = r3.A01
            android.view.View r0 = (android.view.View) r0
            boolean r0 = r0.hasOnClickListeners()
            r5.A0f(r0)
            if (r0 != 0) goto L_0x0008
            X.Ct0 r0 = X.C26137Ct0.A08
            r5.A0M(r0)
            return
        L_0x0092:
            super.A1Z(r4, r5)
            r0 = 0
            r5.A0f(r0)
            r5.A0m(r0)
            X.Ct0 r0 = X.C26137Ct0.A08
            r5.A0M(r0)
            java.lang.Object r2 = r3.A01
            X.4aY r2 = (X.AnonymousClass4aY) r2
            boolean r0 = X.AnonymousClass4aY.A1y(r2)
            if (r0 != 0) goto L_0x00b8
            X.0ve r1 = r2.A3F
            X.1DC r0 = r2.A4L
            boolean r0 = X.C83724Gk.A00(r1, r0)
            r1 = 2131887878(0x7f120706, float:1.9410376E38)
            if (r0 != 0) goto L_0x00bb
        L_0x00b8:
            r1 = 2131887866(0x7f1206fa, float:1.9410351E38)
        L_0x00bb:
            X.1FY r0 = X.AnonymousClass3MW.A0Q(r2)
            java.lang.String r0 = r0.getString(r1)
            goto L_0x00fd
        L_0x00c4:
            super.A1Z(r4, r5)
            r0 = 0
            r5.A0f(r0)
            r5.A0m(r0)
            X.Ct0 r0 = X.C26137Ct0.A08
            r5.A0M(r0)
            java.lang.Object r0 = r3.A01
            android.view.View r0 = (android.view.View) r0
            android.content.Context r1 = r0.getContext()
            r0 = 2131894961(0x7f1222b1, float:1.9424742E38)
            java.lang.String r0 = r1.getString(r0)
            goto L_0x00fd
        L_0x00e3:
            super.A1Z(r4, r5)
            r0 = 1
            r5.A0k(r0)
            return
        L_0x00eb:
            super.A1Z(r4, r5)
            java.lang.Object r0 = r3.A01
            android.content.Context r0 = (android.content.Context) r0
            android.content.res.Resources r1 = r0.getResources()
            r0 = 2131898718(0x7f12315e, float:1.9432362E38)
            java.lang.String r0 = r1.getString(r0)
        L_0x00fd:
            r5.A0Q(r0)
            return
        L_0x0101:
            X.C18070vi.A0h(r4, r5)
            super.A1Z(r4, r5)
            X.Ct0 r0 = X.C26137Ct0.A08
            java.lang.Object r0 = r3.A01
            X.1xT r0 = (X.C42011xT) r0
            android.view.View r0 = r0.A0H
            android.content.Context r1 = r0.getContext()
            r0 = 2131886504(0x7f1201a8, float:1.9407589E38)
            goto L_0x0152
        L_0x0117:
            X.C18070vi.A0h(r4, r5)
            super.A1Z(r4, r5)
            X.Ct0 r0 = X.C26137Ct0.A08
            java.lang.Object r0 = r3.A01
            android.view.View r0 = (android.view.View) r0
            android.content.Context r1 = r0.getContext()
            r0 = 2131888888(0x7f120af8, float:1.9412424E38)
            goto L_0x0152
        L_0x012b:
            X.C18070vi.A0h(r4, r5)
            super.A1Z(r4, r5)
            X.Ct0 r0 = X.C26137Ct0.A08
            java.lang.Object r0 = r3.A01
            android.view.View r0 = (android.view.View) r0
            android.content.Context r1 = r0.getContext()
            r0 = 2131887320(0x7f1204d8, float:1.9409244E38)
            goto L_0x0152
        L_0x013f:
            X.C18070vi.A0h(r4, r5)
            super.A1Z(r4, r5)
            X.Ct0 r0 = X.C26137Ct0.A08
            java.lang.Object r0 = r3.A01
            android.view.View r0 = (android.view.View) r0
            android.content.Context r1 = r0.getContext()
            r0 = 2131888887(0x7f120af7, float:1.9412422E38)
        L_0x0152:
            java.lang.String r2 = r1.getString(r0)
            r1 = 16
            X.Ct0 r0 = new X.Ct0
            r0.<init>((int) r1, (java.lang.CharSequence) r2)
            r5.A0L(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3SS.A1Z(android.view.View, X.CvK):void");
    }
}
