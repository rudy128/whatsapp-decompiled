package X;

import com.whatsapp.HomeActivity;

/* renamed from: X.1Gr  reason: invalid class name and case insensitive filesystem */
public class C23541Gr extends C23531Gq {
    public final HomeActivity A00;

    /* JADX WARNING: Removed duplicated region for block: B:33:0x00b5  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void Bzy(int r9) {
        /*
            r8 = this;
            com.whatsapp.HomeActivity r5 = r8.A00
            X.02B r0 = r5.A0E
            if (r0 == 0) goto L_0x0009
            r0.A05()
        L_0x0009:
            r2 = 1
            r5.A4s(r2)
            r5.A4p()
            int r0 = r5.A4l(r9)
            r5.A00 = r0
            X.0ve r3 = r5.A0E
            r1 = 8678(0x21e6, float:1.216E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r3, r1)
            if (r0 == 0) goto L_0x003d
            int r0 = r5.A00
            int r0 = com.whatsapp.HomeActivity.A0c(r0)
            X.1jl r1 = r5.A4m(r0)
            if (r1 == 0) goto L_0x003d
            boolean r0 = r1.BLg()
            if (r0 == 0) goto L_0x003d
            boolean r0 = r1.Buz()
            if (r0 != 0) goto L_0x003d
            r1.Buy()
        L_0x003d:
            int r1 = r5.A00
            r0 = 600(0x258, float:8.41E-43)
            r4 = 3
            if (r1 != r0) goto L_0x0045
            r4 = 0
        L_0x0045:
            X.10I r3 = r5.A05
            r1 = 17
            X.7RP r0 = new X.7RP
            r0.<init>(r8, r4, r1)
            r3.CGF(r0)
            r5.A4h()
            int r6 = r5.A00
            int r0 = com.whatsapp.HomeActivity.A0c(r6)
            X.1jl r1 = r5.A4m(r0)
            X.00H r0 = r5.A07
            java.lang.Object r4 = r0.get()
            X.1Il r4 = (X.C24001Il) r4
            if (r1 == 0) goto L_0x0130
            boolean r0 = r1.BLg()
            if (r0 == 0) goto L_0x0130
            boolean r0 = r1.Buz()
            if (r0 == 0) goto L_0x007a
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L_0x0130
        L_0x007a:
            r3 = 1
        L_0x007b:
            boolean r0 = r4.A0A()
            if (r0 == 0) goto L_0x008c
            r4.A00 = r6
            r1 = 0
            X.35K r0 = new X.35K
            r0.<init>(r6, r3, r1)
            r4.notifyAllObservers(r0)
        L_0x008c:
            r5.A4i()
            int r6 = r5.A00
            r0 = 400(0x190, float:5.6E-43)
            r1 = 300(0x12c, float:4.2E-43)
            r3 = 500(0x1f4, double:2.47E-321)
            if (r6 != r0) goto L_0x011a
            X.1KB r0 = r5.A05
            java.lang.Runnable r1 = r5.A2P
        L_0x009d:
            r0.A0I(r1)
            X.1KB r0 = r5.A05
            r0.A0K(r1, r3)
        L_0x00a5:
            r6 = 0
            r5.A4q(r6)
            r5.invalidateOptionsMenu()
            r5.A4o()
            androidx.fragment.app.Fragment r0 = com.whatsapp.HomeActivity.A0r(r5)
            if (r0 == 0) goto L_0x0133
            android.view.View r1 = r0.A0B
            boolean r0 = r1 instanceof com.whatsapp.collections.observablelistview.ObservableListView
            if (r0 == 0) goto L_0x0133
            r0 = 16908298(0x102000a, float:2.3877257E-38)
            android.view.View r3 = r1.findViewById(r0)
            com.whatsapp.collections.observablelistview.ObservableListView r3 = (com.whatsapp.collections.observablelistview.ObservableListView) r3
            if (r3 == 0) goto L_0x0133
            int r0 = r3.getChildCount()
            if (r0 <= 0) goto L_0x0133
            int r0 = r3.getFirstVisiblePosition()
            if (r0 <= 0) goto L_0x0110
            r7 = 0
        L_0x00d3:
            int r0 = r3.getChildCount()
            int r0 = r0 - r2
            android.view.View r4 = r3.getChildAt(r0)
            int r1 = r4.getBottom()
            int r0 = r3.getBottom()
            if (r1 <= r0) goto L_0x010e
            int r1 = r4.getBottom()
            int r0 = r3.getBottom()
            int r1 = r1 - r0
        L_0x00ef:
            int r7 = r7 + r1
            if (r7 < 0) goto L_0x0133
            X.1Gt r0 = r5.A2M
            int r0 = r0.A01
            if (r0 != 0) goto L_0x0100
            int r0 = r3.A04
            if (r0 <= 0) goto L_0x00ff
            r3.setSelection(r6)
        L_0x00ff:
            return
        L_0x0100:
            int r1 = r3.A04
            androidx.appcompat.widget.Toolbar r0 = r5.A0G
            int r0 = r0.getHeight()
            if (r1 >= r0) goto L_0x00ff
            r3.setSelection(r2)
            return
        L_0x010e:
            r1 = 0
            goto L_0x00ef
        L_0x0110:
            android.view.View r0 = r3.getChildAt(r6)
            int r0 = r0.getTop()
            int r7 = -r0
            goto L_0x00d3
        L_0x011a:
            r0 = 200(0xc8, float:2.8E-43)
            if (r6 == r0) goto L_0x00a5
            if (r6 != r1) goto L_0x0126
            X.1KB r0 = r5.A05
            java.lang.Runnable r1 = r5.A2Q
            goto L_0x009d
        L_0x0126:
            r0 = 600(0x258, float:8.41E-43)
            if (r6 != r0) goto L_0x00a5
            X.1KB r0 = r5.A05
            java.lang.Runnable r1 = r5.A2O
            goto L_0x009d
        L_0x0130:
            r3 = 0
            goto L_0x007b
        L_0x0133:
            r5.A4p()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C23541Gr.Bzy(int):void");
    }

    public C23541Gr(HomeActivity homeActivity) {
        this.A00 = homeActivity;
    }
}
