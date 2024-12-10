package X;

/* renamed from: X.4fD  reason: invalid class name and case insensitive filesystem */
public class C91144fD implements C15930rR {
    public final int A00;
    public final Object A01;

    public C91144fD(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x006c, code lost:
        X.C137086ut.A01(r0, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x012b, code lost:
        com.whatsapp.util.Log.w(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:?, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:?, code lost:
        return true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onMenuItemClick(android.view.MenuItem r7) {
        /*
            r6 = this;
            int r0 = r6.A00
            switch(r0) {
                case 0: goto L_0x00da;
                case 1: goto L_0x0070;
                case 2: goto L_0x0043;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r2 = r6.A01
            com.whatsapp.conversationslist.filter.ConversationFilterMenuHandler r2 = (com.whatsapp.conversationslist.filter.ConversationFilterMenuHandler) r2
            int r1 = r7.getItemId()
            r0 = 2131429569(0x7f0b08c1, float:1.8480814E38)
            if (r1 != r0) goto L_0x0032
            android.content.Context r5 = r2.A00
            r4 = 5
            r3 = 0
            android.content.Intent r2 = X.C17880vN.A0A()
            java.lang.String r1 = r5.getPackageName()
            java.lang.String r0 = "com.whatsapp.lists.home.ListsHomeActivity"
            r2.setClassName(r1, r0)
            java.lang.String r0 = "LAUNCH_FROM_DEEPLINK"
            r2.putExtra(r0, r3)
            java.lang.String r0 = "EXTRA_ENTRY_POINT"
            r2.putExtra(r0, r4)
            r5.startActivity(r2)
        L_0x0030:
            r0 = 1
            return r0
        L_0x0032:
            r0 = 2131429641(0x7f0b0909, float:1.848096E38)
            if (r1 != r0) goto L_0x0030
            androidx.fragment.app.Fragment r1 = r2.A01
            X.00H r0 = r2.A0C
            r0.get()
            com.whatsapp.lists.home.ListsHomeBottomSheet r0 = X.AnonymousClass4H2.A00()
            goto L_0x006c
        L_0x0043:
            java.lang.Object r3 = r6.A01
            com.whatsapp.conversationslist.filter.ConversationFilterMenuHandler r3 = (com.whatsapp.conversationslist.filter.ConversationFilterMenuHandler) r3
            int r1 = r7.getItemId()
            r0 = 2131429636(0x7f0b0904, float:1.848095E38)
            r2 = 7
            if (r1 != r0) goto L_0x005d
            android.content.Context r1 = r3.A00
            X.4CZ r0 = X.AnonymousClass4CZ.CHATS
            android.content.Intent r0 = X.AnonymousClass1LU.A0X(r1, r0, r2)
            r1.startActivity(r0)
            goto L_0x0030
        L_0x005d:
            r0 = 2131429637(0x7f0b0905, float:1.8480952E38)
            if (r1 != r0) goto L_0x0030
            androidx.fragment.app.Fragment r1 = r3.A01
            com.whatsapp.favorites.FavoriteBottomSheetFragment r0 = new com.whatsapp.favorites.FavoriteBottomSheetFragment
            r0.<init>()
            X.C72473Md.A1A(r0, r2)
        L_0x006c:
            X.C137086ut.A01(r0, r1)
            goto L_0x0030
        L_0x0070:
            java.lang.Object r1 = r6.A01
            X.4Zx r1 = (X.AnonymousClass4Zx) r1
            java.lang.ref.WeakReference r0 = r1.A0C
            java.lang.Object r5 = r0.get()
            X.1FL r5 = (X.AnonymousClass1FL) r5
            r2 = 1
            if (r5 == 0) goto L_0x00d7
            boolean r0 = r5.isFinishing()
            if (r0 != 0) goto L_0x00d7
            int r4 = r7.getItemId()
            r0 = 2
            if (r4 == r0) goto L_0x00b1
            r0 = 4
            if (r4 == r0) goto L_0x00b1
            r0 = 5
            if (r4 != r0) goto L_0x00ac
            r3 = 0
        L_0x0093:
            X.9sx r0 = r1.A07
            r0.A01()
            r0 = 5
            if (r4 == r0) goto L_0x00c2
            r0 = 4
            if (r4 == r0) goto L_0x00c2
            r0 = 3
            if (r4 == r0) goto L_0x00c2
            r0 = 6
            X.5ap r2 = r1.A06
            X.1E7 r1 = r1.A09
            if (r4 != r0) goto L_0x00b6
            r2.CNj(r1)
            goto L_0x0030
        L_0x00ac:
            java.lang.Boolean r3 = X.AnonymousClass000.A0h()
            goto L_0x0093
        L_0x00b1:
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r2)
            goto L_0x0093
        L_0x00b6:
            X.C17960vV.A07(r3)
            boolean r0 = r3.booleanValue()
            r2.CCS(r1, r0)
            goto L_0x0030
        L_0x00c2:
            X.1BI r2 = r1.A0B
            int r1 = r1.A04
            r0 = 0
            X.C18070vi.A0d(r2, r0)
            com.whatsapp.calling.schedulecall.ScheduleCallFragment r1 = com.whatsapp.calling.schedulecall.ScheduleCallFragment.A00(r2, r3, r1)
            X.1GP r0 = r5.getSupportFragmentManager()
            X.C20098A7b.A02(r1, r0)
            goto L_0x0030
        L_0x00d7:
            java.lang.String r0 = "GroupCallMenuHelper/onPopupMenuEventListener activity is finished/finishing"
            goto L_0x012b
        L_0x00da:
            java.lang.Object r3 = r6.A01
            X.4ZW r3 = (X.AnonymousClass4ZW) r3
            r2 = 1
            X.C18070vi.A0d(r7, r2)
            java.lang.ref.WeakReference r0 = r3.A05
            java.lang.Object r0 = r0.get()
            android.app.Activity r0 = (android.app.Activity) r0
            if (r0 == 0) goto L_0x0129
            boolean r0 = r0.isFinishing()
            if (r0 != 0) goto L_0x0129
            int r1 = r7.getItemId()
            if (r1 == 0) goto L_0x011e
            if (r1 == r2) goto L_0x010d
            r0 = 2
            if (r1 != r0) goto L_0x0030
            X.9sx r0 = r3.A02
            r0.A01()
            X.4MJ r0 = r3.A03
            X.1E7 r1 = r3.A04
            X.5cS r0 = r0.A01
            r0.BcU(r1, r2)
            goto L_0x0030
        L_0x010d:
            X.9sx r0 = r3.A02
            r0.A01()
            X.4MJ r0 = r3.A03
            X.1E7 r2 = r3.A04
            r1 = 0
            X.5cS r0 = r0.A01
            r0.BcU(r2, r1)
            goto L_0x0030
        L_0x011e:
            X.4MJ r0 = r3.A03
            X.1E7 r1 = r3.A04
            X.5cS r0 = r0.A01
            r0.BBc(r1)
            goto L_0x0030
        L_0x0129:
            java.lang.String r0 = "CallMenuHelper/onPopupMenuEventListener activity is finished/finishing"
        L_0x012b:
            com.whatsapp.util.Log.w((java.lang.String) r0)
            goto L_0x0030
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C91144fD.onMenuItemClick(android.view.MenuItem):boolean");
    }
}
