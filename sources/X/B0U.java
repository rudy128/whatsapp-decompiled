package X;

import android.view.MenuItem;
import com.whatsapp.biz.catalog.view.activity.ProductListActivity;

public final class B0U extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ MenuItem $cartMenu;
    public final /* synthetic */ ProductListActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public B0U(MenuItem menuItem, ProductListActivity productListActivity) {
        super(1);
        this.this$0 = productListActivity;
        this.$cartMenu = menuItem;
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [X.A7D, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000b, code lost:
        if (r7.this$0.A0N == null) goto L_0x000d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r8) {
        /*
            r7 = this;
            boolean r2 = X.AnonymousClass000.A1Y(r8)
            if (r2 == 0) goto L_0x000d
            com.whatsapp.biz.catalog.view.activity.ProductListActivity r0 = r7.this$0
            java.lang.String r0 = r0.A0N
            r1 = 1
            if (r0 != 0) goto L_0x000e
        L_0x000d:
            r1 = 0
        L_0x000e:
            android.view.MenuItem r0 = r7.$cartMenu
            r0.setVisible(r1)
            com.whatsapp.biz.catalog.view.activity.ProductListActivity r0 = r7.this$0
            X.8I0 r1 = r0.A0E
            if (r1 != 0) goto L_0x0020
            java.lang.String r0 = "productSectionsListAdapter"
            X.C18070vi.A11(r0)
            r0 = 0
            throw r0
        L_0x0020:
            boolean r0 = r1.A02
            if (r2 == r0) goto L_0x0029
            r1.A02 = r2
            r1.notifyDataSetChanged()
        L_0x0029:
            com.whatsapp.biz.catalog.view.activity.ProductListActivity r0 = r7.this$0
            com.whatsapp.biz.catalog.view.activity.ProductListActivity.A0Q(r0)
            com.whatsapp.biz.catalog.view.activity.ProductListActivity r6 = r7.this$0
            boolean r0 = r6.A0Q
            if (r0 != 0) goto L_0x00a1
            X.9cl r1 = r6.A0B
            if (r1 == 0) goto L_0x00a1
            r0 = 1
            r6.A0Q = r0
            X.A8Q r5 = r6.A4b()
            X.A7D r4 = new X.A7D
            r4.<init>()
            X.A7D.A03(r4, r1)
            X.A8Q.A05(r4, r6)
            long r0 = r1.A01
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r4.A09 = r0
            java.lang.Integer r0 = X.C17880vN.A0k()
            r4.A06 = r0
            r0 = 23
            X.A7D.A02(r4, r0)
            X.8F5 r0 = r6.A0F
            java.lang.String r1 = "productListViewModel"
            r3 = 0
            if (r0 == 0) goto L_0x00a4
            X.9p3 r0 = r0.A04
            X.1DS r0 = r0.A03
            X.A7D.A00(r0, r4)
            com.whatsapp.jid.UserJid r0 = r6.A0H
            if (r0 != 0) goto L_0x0075
            java.lang.String r0 = "businessId"
        L_0x0071:
            X.C18070vi.A11(r0)
            throw r3
        L_0x0075:
            r4.A00 = r0
            X.8F7 r0 = r6.A0A
            if (r0 != 0) goto L_0x007e
            java.lang.String r0 = "cartMenuViewModel"
            goto L_0x0071
        L_0x007e:
            X.1DT r0 = r0.A00
            java.lang.Object r0 = r0.A06()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            r4.A01 = r0
            X.8F5 r2 = r6.A0F
            if (r2 == 0) goto L_0x00a4
            X.00H r0 = r2.A0B
            java.lang.Object r1 = r0.get()
            X.96v r1 = (X.C1770196v) r1
            com.whatsapp.jid.UserJid r0 = r2.A09
            java.lang.String r0 = X.A5T.A01(r1, r0)
            r4.A0A = r0
            r5.A09(r4)
            r6.A0B = r3
        L_0x00a1:
            X.1Wu r0 = X.C27621Wu.A00
            return r0
        L_0x00a4:
            X.C18070vi.A11(r1)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.B0U.invoke(java.lang.Object):java.lang.Object");
    }
}
