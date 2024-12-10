package X;

import android.view.ViewOutlineProvider;

/* renamed from: X.BHo  reason: case insensitive filesystem */
public class C22650BHo extends ViewOutlineProvider {
    public final int A00;
    public final Object A01;

    public C22650BHo(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x003e, code lost:
        r0 = 0.0f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0050, code lost:
        r0 = r2.A03(65, 1.0f);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0058, code lost:
        r5.setAlpha(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x005b, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void getOutline(android.view.View r4, android.graphics.Outline r5) {
        /*
            r3 = this;
            int r0 = r3.A00
            switch(r0) {
                case 0: goto L_0x0027;
                case 1: goto L_0x0040;
                case 2: goto L_0x0015;
                default: goto L_0x0005;
            }
        L_0x0005:
            android.content.res.Resources r1 = r4.getResources()
            r0 = 2131166214(0x7f070406, float:1.7946667E38)
            int r1 = r1.getDimensionPixelSize(r0)
            r0 = 0
            r5.setOval(r0, r0, r1, r1)
        L_0x0014:
            return
        L_0x0015:
            boolean r2 = X.C18070vi.A15(r4, r5)
            android.graphics.drawable.Drawable r0 = r4.getBackground()
            if (r0 == 0) goto L_0x0033
            r0.getOutline(r5)
            java.lang.Object r2 = r3.A01
            X.DFL r2 = (X.DFL) r2
            goto L_0x0050
        L_0x0027:
            java.lang.Object r0 = r3.A01
            com.google.android.material.chip.Chip r0 = (com.google.android.material.chip.Chip) r0
            X.Bih r0 = r0.A04
            if (r0 == 0) goto L_0x003e
            r0.getOutline(r5)
            return
        L_0x0033:
            int r1 = r4.getWidth()
            int r0 = r4.getHeight()
            r5.setRect(r2, r2, r1, r0)
        L_0x003e:
            r0 = 0
            goto L_0x0058
        L_0x0040:
            X.C18070vi.A0h(r4, r5)
            android.graphics.drawable.Drawable r0 = r4.getBackground()
            if (r0 == 0) goto L_0x0014
            java.lang.Object r2 = r3.A01
            X.DFL r2 = (X.DFL) r2
            r0.getOutline(r5)
        L_0x0050:
            r1 = 65
            r0 = 1065353216(0x3f800000, float:1.0)
            float r0 = r2.A03(r1, r0)
        L_0x0058:
            r5.setAlpha(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C22650BHo.getOutline(android.view.View, android.graphics.Outline):void");
    }
}
