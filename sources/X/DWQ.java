package X;

public class DWQ implements C18140vp {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public DWQ(Object obj, Object obj2, int i) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
    }

    public static C23731Hk A00(Object obj, Object obj2, int i) {
        return C23731Hk.A00(new DWQ(obj, obj2, i));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0088, code lost:
        r2 = r2 - r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x008c, code lost:
        if (r3 < 0.0f) goto L_0x008e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x008e, code lost:
        r3 = 0.0f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x00b2, code lost:
        if (r3 > 1.0f) goto L_0x00b4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00b4, code lost:
        r3 = 1.0f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00ee, code lost:
        r2 = r2 * (1.0f - X.AnonymousClass000.A04(r0.get()));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00fe, code lost:
        return java.lang.Float.valueOf(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0027, code lost:
        r1.setStrokeWidth(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x002a, code lost:
        return r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object get() {
        /*
            r5 = this;
            int r0 = r5.A00
            switch(r0) {
                case 0: goto L_0x004e;
                case 1: goto L_0x006a;
                case 2: goto L_0x00b7;
                case 3: goto L_0x00c6;
                case 4: goto L_0x00e2;
                case 5: goto L_0x0090;
                case 6: goto L_0x00ff;
                case 7: goto L_0x002b;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r3 = r5.A01
            android.content.Context r3 = (android.content.Context) r3
            java.lang.Object r2 = r5.A02
            X.BHY r2 = (X.BHY) r2
            r0 = 1
            X.C18070vi.A0d(r2, r0)
            r1 = 2130971976(0x7f040d48, float:1.7552706E38)
            r0 = 2131103148(0x7f060dac, float:1.7818754E38)
            int r0 = X.AnonymousClass3Ma.A00(r3, r1, r0)
            android.graphics.Paint r1 = X.AnonymousClass3MW.A06()
            r1.setColor(r0)
            X.AnonymousClass3MW.A1P(r1)
            float r0 = r2.A08
        L_0x0027:
            r1.setStrokeWidth(r0)
            return r1
        L_0x002b:
            java.lang.Object r3 = r5.A01
            android.content.Context r3 = (android.content.Context) r3
            java.lang.Object r2 = r5.A02
            X.BHY r2 = (X.BHY) r2
            r0 = 1
            X.C18070vi.A0d(r2, r0)
            r1 = 2130971997(0x7f040d5d, float:1.7552748E38)
            r0 = 2131103198(0x7f060dde, float:1.7818855E38)
            int r0 = X.AnonymousClass3Ma.A00(r3, r1, r0)
            android.graphics.Paint r1 = X.AnonymousClass3MW.A06()
            r1.setColor(r0)
            X.AnonymousClass3MW.A1P(r1)
            float r0 = r2.A07
            goto L_0x0027
        L_0x004e:
            java.lang.Object r0 = r5.A01
            X.Bq9 r0 = (X.Bq9) r0
            java.lang.Object r2 = r5.A02
            android.view.View r2 = (android.view.View) r2
            android.content.res.Resources r1 = r0.A02
            r0 = 2131168774(0x7f070e06, float:1.795186E38)
            int r0 = r1.getDimensionPixelSize(r0)
            float r2 = X.C108945cZ.A04(r2)
            float r1 = (float) r0
            r0 = 1073741824(0x40000000, float:2.0)
            float r1 = r1 * r0
            float r2 = r2 - r1
            goto L_0x00fa
        L_0x006a:
            java.lang.Object r2 = r5.A01
            X.Bq9 r2 = (X.Bq9) r2
            java.lang.Object r0 = r5.A02
            android.view.View r0 = (android.view.View) r0
            float r1 = X.C108945cZ.A04(r0)
            X.1Hk r0 = r2.A0A
            float r3 = X.BE9.A03(r0)
            float r3 = r3 / r1
            r2 = 1065353216(0x3f800000, float:1.0)
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x008a
            int r0 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r0 > 0) goto L_0x008a
        L_0x0088:
            float r2 = r2 - r3
            goto L_0x00fa
        L_0x008a:
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x00b4
        L_0x008e:
            r3 = 0
            goto L_0x0088
        L_0x0090:
            java.lang.Object r1 = r5.A01
            android.view.View r1 = (android.view.View) r1
            java.lang.Object r0 = r5.A02
            X.1Hk r0 = (X.C23731Hk) r0
            float r4 = X.C108945cZ.A04(r1)
            float r3 = X.BE9.A03(r0)
            r2 = 1065353216(0x3f800000, float:1.0)
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x00fa
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x00fa
            float r3 = r3 / r4
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x008e
            int r0 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r0 <= 0) goto L_0x0088
        L_0x00b4:
            r3 = 1065353216(0x3f800000, float:1.0)
            goto L_0x0088
        L_0x00b7:
            java.lang.Object r1 = r5.A01
            X.Bq9 r1 = (X.Bq9) r1
            java.lang.Object r0 = r5.A02
            android.view.View r0 = (android.view.View) r0
            float r2 = X.C108945cZ.A03(r0)
            X.1Hk r0 = r1.A0G
            goto L_0x00ee
        L_0x00c6:
            java.lang.Object r0 = r5.A01
            X.Bq9 r0 = (X.Bq9) r0
            java.lang.Object r2 = r5.A02
            android.view.View r2 = (android.view.View) r2
            android.content.res.Resources r1 = r0.A02
            r0 = 2131168774(0x7f070e06, float:1.795186E38)
            float r1 = X.AnonymousClass3MW.A00(r1, r0)
            int r0 = r2.getTop()
            float r0 = (float) r0
            float r1 = r1 - r0
            java.lang.Float r1 = java.lang.Float.valueOf(r1)
            return r1
        L_0x00e2:
            java.lang.Object r1 = r5.A01
            android.view.View r1 = (android.view.View) r1
            java.lang.Object r0 = r5.A02
            X.1Hk r0 = (X.C23731Hk) r0
            float r2 = X.C108945cZ.A03(r1)
        L_0x00ee:
            java.lang.Object r0 = r0.get()
            float r1 = X.AnonymousClass000.A04(r0)
            r0 = 1065353216(0x3f800000, float:1.0)
            float r0 = r0 - r1
            float r2 = r2 * r0
        L_0x00fa:
            java.lang.Float r1 = java.lang.Float.valueOf(r2)
            return r1
        L_0x00ff:
            java.lang.Object r2 = r5.A01
            android.content.Context r2 = (android.content.Context) r2
            java.lang.Object r1 = r5.A02
            X.BHY r1 = (X.BHY) r1
            r0 = 1
            X.C18070vi.A0d(r1, r0)
            X.CbV r0 = r1.A04
            int r0 = r0.A00
            int r0 = X.C19740yt.A00(r2, r0)
            android.graphics.Paint r1 = X.AnonymousClass3MW.A06()
            r1.setColor(r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.DWQ.get():java.lang.Object");
    }
}
