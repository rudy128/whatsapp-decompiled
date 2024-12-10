package X;

import com.whatsapp.biz.catalog.view.activity.ProductListActivity;

/* renamed from: X.Ay6  reason: case insensitive filesystem */
public final class C22128Ay6 extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ ProductListActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C22128Ay6(ProductListActivity productListActivity) {
        super(1);
        this.this$0 = productListActivity;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0083, code lost:
        if (r0 == null) goto L_0x0085;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x00eb, code lost:
        if (r0 == null) goto L_0x00ed;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x00f1, code lost:
        r0.show();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r11) {
        /*
            r10 = this;
            java.lang.Number r11 = (java.lang.Number) r11
            java.lang.String r9 = "noItemsDialog"
            r4 = 8
            java.lang.String r8 = "errorDialog"
            java.lang.String r7 = "noInternetConnectionView"
            r2 = 0
            if (r11 == 0) goto L_0x0042
            int r1 = r11.intValue()
            if (r1 == 0) goto L_0x0016
            r0 = 2
            if (r1 != r0) goto L_0x0042
        L_0x0016:
            com.whatsapp.biz.catalog.view.activity.ProductListActivity r0 = r10.this$0
            android.view.View r0 = r0.A00
            if (r0 == 0) goto L_0x0164
            r0.setVisibility(r4)
            com.whatsapp.biz.catalog.view.activity.ProductListActivity r0 = r10.this$0
            X.Bik r1 = r0.A04
            if (r1 == 0) goto L_0x0029
            r0 = 3
            r1.A09(r0)
        L_0x0029:
            com.whatsapp.biz.catalog.view.activity.ProductListActivity r0 = r10.this$0
            X.05w r0 = r0.A01
            if (r0 == 0) goto L_0x00ed
            r0.hide()
            com.whatsapp.biz.catalog.view.activity.ProductListActivity r0 = r10.this$0
            X.05w r0 = r0.A02
            if (r0 == 0) goto L_0x0085
            r0.hide()
            com.whatsapp.biz.catalog.view.activity.ProductListActivity r0 = r10.this$0
            r0.A0P = r2
        L_0x003f:
            X.1Wu r0 = X.C27621Wu.A00
            return r0
        L_0x0042:
            r5 = 1
            if (r11 == 0) goto L_0x004c
            int r0 = r11.intValue()
            if (r0 != r5) goto L_0x004c
            goto L_0x0016
        L_0x004c:
            java.lang.String r3 = "plm_details_view_tag"
            if (r11 == 0) goto L_0x008a
            int r1 = r11.intValue()
            r0 = 3
            if (r1 != r0) goto L_0x008a
            com.whatsapp.biz.catalog.view.activity.ProductListActivity r0 = r10.this$0
            android.view.View r0 = r0.A00
            if (r0 == 0) goto L_0x0164
            r0.setVisibility(r4)
            com.whatsapp.biz.catalog.view.activity.ProductListActivity r0 = r10.this$0
            X.Bik r1 = r0.A04
            if (r1 == 0) goto L_0x006a
            r0 = 3
            r1.A09(r0)
        L_0x006a:
            com.whatsapp.biz.catalog.view.activity.ProductListActivity r0 = r10.this$0
            X.05w r0 = r0.A01
            if (r0 == 0) goto L_0x00ed
            r0.hide()
            com.whatsapp.biz.catalog.view.activity.ProductListActivity r0 = r10.this$0
            X.05w r0 = r0.A02
            if (r0 == 0) goto L_0x0085
            boolean r0 = r0.isShowing()
            if (r0 != 0) goto L_0x0117
            com.whatsapp.biz.catalog.view.activity.ProductListActivity r0 = r10.this$0
            X.05w r0 = r0.A02
            if (r0 != 0) goto L_0x00f1
        L_0x0085:
            X.C18070vi.A11(r9)
        L_0x0088:
            r0 = 0
            throw r0
        L_0x008a:
            java.lang.String r6 = "productSectionsListAdapter"
            if (r11 == 0) goto L_0x003f
            int r1 = r11.intValue()
            r0 = 4
            if (r1 != r0) goto L_0x00f5
            com.whatsapp.biz.catalog.view.activity.ProductListActivity r0 = r10.this$0
            X.05w r0 = r0.A02
            if (r0 == 0) goto L_0x0085
            r0.hide()
            com.whatsapp.biz.catalog.view.activity.ProductListActivity r0 = r10.this$0
            android.view.View r0 = r0.A00
            if (r0 == 0) goto L_0x0164
            r0.setVisibility(r4)
            com.whatsapp.biz.catalog.view.activity.ProductListActivity r0 = r10.this$0
            X.Bik r1 = r0.A04
            if (r1 == 0) goto L_0x00b1
            r0 = 3
            r1.A09(r0)
        L_0x00b1:
            com.whatsapp.biz.catalog.view.activity.ProductListActivity r0 = r10.this$0
            X.8I0 r0 = r0.A0E
            if (r0 == 0) goto L_0x0169
            boolean r4 = r0.A0U()
            java.util.List r0 = r0.A05
            int r1 = r0.size()
            if (r4 == 0) goto L_0x00c5
            int r1 = r1 + -1
        L_0x00c5:
            com.whatsapp.biz.catalog.view.activity.ProductListActivity r0 = r10.this$0
            X.05w r0 = r0.A01
            if (r1 <= 0) goto L_0x00df
            if (r0 == 0) goto L_0x00ed
            r0.hide()
        L_0x00d0:
            com.whatsapp.biz.catalog.view.activity.ProductListActivity r0 = r10.this$0
            r0.A0P = r5
        L_0x00d4:
            com.whatsapp.biz.catalog.view.activity.ProductListActivity r0 = r10.this$0
            X.A2u r0 = r0.A0J
            if (r0 == 0) goto L_0x015d
            r0.A06(r3, r2)
            goto L_0x003f
        L_0x00df:
            if (r0 == 0) goto L_0x00ed
            boolean r0 = r0.isShowing()
            if (r0 != 0) goto L_0x00d4
            com.whatsapp.biz.catalog.view.activity.ProductListActivity r0 = r10.this$0
            X.05w r0 = r0.A01
            if (r0 != 0) goto L_0x00f1
        L_0x00ed:
            X.C18070vi.A11(r8)
            goto L_0x0088
        L_0x00f1:
            r0.show()
            goto L_0x0117
        L_0x00f5:
            r0 = 5
            if (r1 != r0) goto L_0x003f
            com.whatsapp.biz.catalog.view.activity.ProductListActivity r0 = r10.this$0
            X.8I0 r0 = r0.A0E
            if (r0 == 0) goto L_0x0169
            boolean r6 = r0.A0U()
            java.util.List r0 = r0.A05
            int r1 = r0.size()
            if (r6 == 0) goto L_0x010c
            int r1 = r1 + -1
        L_0x010c:
            com.whatsapp.biz.catalog.view.activity.ProductListActivity r0 = r10.this$0
            if (r1 != 0) goto L_0x011c
            android.view.View r0 = r0.A00
            if (r0 == 0) goto L_0x0164
            r0.setVisibility(r2)
        L_0x0117:
            com.whatsapp.biz.catalog.view.activity.ProductListActivity r0 = r10.this$0
            r0.A0P = r2
            goto L_0x00d4
        L_0x011c:
            X.Bik r0 = r0.A04
            if (r0 == 0) goto L_0x0127
            boolean r0 = r0.A0D()
            if (r0 != r5) goto L_0x0127
            goto L_0x00d4
        L_0x0127:
            com.whatsapp.biz.catalog.view.activity.ProductListActivity r0 = r10.this$0
            android.view.View r0 = r0.A00
            if (r0 == 0) goto L_0x0164
            r0.setVisibility(r4)
            com.whatsapp.biz.catalog.view.activity.ProductListActivity r7 = r10.this$0
            X.Bik r6 = r7.A04
            if (r6 != 0) goto L_0x0158
            android.view.View r4 = r7.A00
            android.content.res.Resources r1 = r7.getResources()
            r0 = 2131892929(0x7f121ac1, float:1.942062E38)
            java.lang.String r1 = r1.getString(r0)
            r0 = 4000(0xfa0, float:5.605E-42)
            X.Bik r6 = X.C23520Bik.A02(r4, r1, r0)
            r4 = 2131895332(0x7f122424, float:1.9425494E38)
            r1 = 28
            X.9Aa r0 = new X.9Aa
            r0.<init>(r7, r1)
            r6.A0F(r0, r4)
            r7.A04 = r6
        L_0x0158:
            r6.A08()
            goto L_0x00d0
        L_0x015d:
            java.lang.String r0 = "bizQPLManager"
            X.C18070vi.A11(r0)
            goto L_0x0088
        L_0x0164:
            X.C18070vi.A11(r7)
            goto L_0x0088
        L_0x0169:
            X.C18070vi.A11(r6)
            goto L_0x0088
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C22128Ay6.invoke(java.lang.Object):java.lang.Object");
    }
}
