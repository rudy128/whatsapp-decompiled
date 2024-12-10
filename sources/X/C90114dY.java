package X;

import android.view.View;

/* renamed from: X.4dY  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C90114dY implements View.OnCreateContextMenuListener {
    public final /* synthetic */ C77043p2 A00;

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0037, code lost:
        if (X.AnonymousClass1Q0.A03(r1, r6, r4) != false) goto L_0x0039;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreateContextMenu(android.view.ContextMenu r11, android.view.View r12, android.view.ContextMenu.ContextMenuInfo r13) {
        /*
            r10 = this;
            X.3p2 r3 = r10.A00
            com.whatsapp.community.CommunityNavigationActivity r5 = r3.A00
            X.1BI r1 = r5.A0W
            if (r1 == 0) goto L_0x00db
            X.1CJ r0 = r5.A0R
            int r0 = r0.A03(r1)
            r7 = 1
            r2 = 0
            boolean r9 = X.AnonymousClass000.A1O(r0)
            X.1CJ r1 = r5.A0R
            X.1BI r0 = r5.A0W
            boolean r8 = r1.A0Q(r0)
            if (r8 != 0) goto L_0x0048
            X.1Nb r0 = r5.A0Z
            X.1CJ r6 = r5.A0R
            X.1BI r4 = r5.A0W
            X.0z4 r1 = r5.A0A
            X.1yM r0 = r0.A0a(r4)
            boolean r0 = r0.A0A()
            if (r0 != 0) goto L_0x0039
            boolean r1 = X.AnonymousClass1Q0.A03(r1, r6, r4)
            r0 = 2131891999(0x7f12171f, float:1.9418734E38)
            if (r1 == 0) goto L_0x003c
        L_0x0039:
            r0 = 2131892017(0x7f121731, float:1.941877E38)
        L_0x003c:
            android.view.MenuItem r1 = r11.add(r2, r7, r2, r0)
            X.4cn r0 = new X.4cn
            r0.<init>(r3, r7)
            r1.setOnMenuItemClickListener(r0)
        L_0x0048:
            if (r9 == 0) goto L_0x00fa
            r4 = 2
            r0 = 2131891882(0x7f1216aa, float:1.9418497E38)
        L_0x004e:
            android.view.MenuItem r0 = r11.add(r2, r4, r2, r0)
            X.4cn r1 = new X.4cn
            r1.<init>(r3, r4)
            r0.setOnMenuItemClickListener(r1)
            if (r8 == 0) goto L_0x00e9
            r1 = 2131432569(0x7f0b1479, float:1.84869E38)
            r0 = 2131897267(0x7f122bb3, float:1.9429419E38)
            java.lang.String r0 = r5.getString(r0)
            android.view.MenuItem r4 = r11.add(r2, r1, r2, r0)
            r1 = 4
        L_0x006b:
            X.4cn r0 = new X.4cn
            r0.<init>(r3, r1)
            r4.setOnMenuItemClickListener(r0)
            X.1px r1 = r5.A0P
            X.1BI r0 = r5.A0W
            boolean r0 = r1.A03(r0)
            if (r0 == 0) goto L_0x009a
            X.1CJ r1 = r5.A0R
            X.1BI r0 = r5.A0W
            boolean r0 = r1.A0S(r0)
            if (r0 != 0) goto L_0x009a
            r1 = 2131432558(0x7f0b146e, float:1.8486877E38)
            r0 = 2131888161(0x7f120821, float:1.941095E38)
            android.view.MenuItem r4 = r11.add(r2, r1, r2, r0)
            r1 = 6
            X.4cn r0 = new X.4cn
            r0.<init>(r3, r1)
            r4.setOnMenuItemClickListener(r0)
        L_0x009a:
            X.1CJ r1 = r5.A0R
            X.1BI r0 = r5.A0W
            boolean r0 = r1.A0Q(r0)
            if (r0 != 0) goto L_0x00c1
            X.1Nb r1 = r5.A0Z
            X.1BI r0 = r5.A0W
            boolean r0 = r1.A0y(r0)
            if (r0 == 0) goto L_0x00dc
            r1 = 2131432574(0x7f0b147e, float:1.848691E38)
            r0 = 2131892018(0x7f121732, float:1.9418772E38)
            android.view.MenuItem r4 = r11.add(r2, r1, r2, r0)
            r1 = 7
        L_0x00b9:
            X.4cn r0 = new X.4cn
            r0.<init>(r3, r1)
            r4.setOnMenuItemClickListener(r0)
        L_0x00c1:
            X.00H r0 = r5.A0j
            boolean r0 = X.C72453Mb.A1W(r0)
            if (r0 == 0) goto L_0x00db
            r1 = 2131432526(0x7f0b144e, float:1.8486812E38)
            r0 = 2131886519(0x7f1201b7, float:1.940762E38)
            android.view.MenuItem r1 = r11.add(r2, r1, r2, r0)
            X.4cn r0 = new X.4cn
            r0.<init>(r3, r2)
            r1.setOnMenuItemClickListener(r0)
        L_0x00db:
            return
        L_0x00dc:
            r1 = 2131432566(0x7f0b1476, float:1.8486893E38)
            r0 = 2131892004(0x7f121724, float:1.9418744E38)
            android.view.MenuItem r4 = r11.add(r2, r1, r2, r0)
            r1 = 8
            goto L_0x00b9
        L_0x00e9:
            r1 = 2131432549(0x7f0b1465, float:1.8486859E38)
            r0 = 2131886726(0x7f120286, float:1.9408039E38)
            java.lang.String r0 = r5.getString(r0)
            android.view.MenuItem r4 = r11.add(r2, r1, r2, r0)
            r1 = 5
            goto L_0x006b
        L_0x00fa:
            r4 = 3
            r0 = 2131891883(0x7f1216ab, float:1.9418499E38)
            goto L_0x004e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C90114dY.onCreateContextMenu(android.view.ContextMenu, android.view.View, android.view.ContextMenu$ContextMenuInfo):void");
    }

    public /* synthetic */ C90114dY(C77043p2 r1) {
        this.A00 = r1;
    }
}
