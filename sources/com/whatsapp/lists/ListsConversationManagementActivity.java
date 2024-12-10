package com.whatsapp.lists;

import X.AnonymousClass1FY;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3MY;
import X.AnonymousClass3MZ;
import X.AnonymousClass3Ma;
import X.AnonymousClass4YC;
import X.AnonymousClass4aX;
import X.AnonymousClass5I9;
import X.AnonymousClass5IA;
import X.AnonymousClass5O2;
import X.C003401n;
import X.C17880vN;
import X.C18070vi;
import X.C18100vl;
import X.C24141Ja;
import X.C30391dr;
import X.C34001jj;
import X.C41761x1;
import X.C43251zV;
import X.C72453Mb;
import X.C72463Mc;
import X.C99274sY;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public final class ListsConversationManagementActivity extends AnonymousClass1FY {
    public C41761x1 A00;
    public Integer A01;
    public final C18100vl A02 = C99274sY.A00(new AnonymousClass5IA(this), new AnonymousClass5I9(this), new AnonymousClass5O2(this), AnonymousClass3MW.A15(ListsConversationsManagementViewModel.class));

    public boolean onCreateOptionsMenu(Menu menu) {
        int i;
        C18070vi.A0d(menu, 0);
        getMenuInflater().inflate(2131820572, menu);
        C41761x1 r0 = this.A00;
        if (r0 != null && ((i = r0.A02) == 3 || i == 1)) {
            C72453Mb.A19(menu, 2131432502, false);
        }
        C41761x1 r02 = this.A00;
        if (r02 != null && r02.A02 == 4) {
            C72453Mb.A19(menu, 2131432514, false);
        }
        return super.onCreateOptionsMenu(menu);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x008a, code lost:
        if (r1 != 0) goto L_0x008c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onOptionsItemSelected(android.view.MenuItem r8) {
        /*
            r7 = this;
            r6 = 0
            int r1 = X.AnonymousClass3MY.A01(r8, r6)
            r0 = 2131432502(0x7f0b1436, float:1.8486763E38)
            if (r1 != r0) goto L_0x0045
            X.1x1 r3 = r7.A00
            if (r3 == 0) goto L_0x0040
            java.lang.Integer r2 = r7.A01
            java.lang.String r1 = "labelInfo"
            com.whatsapp.lists.ListsManagerBottomSheetFragment r4 = new com.whatsapp.lists.ListsManagerBottomSheetFragment
            r4.<init>()
            android.os.Bundle r0 = X.C17880vN.A0D()
            r0.putParcelable(r1, r3)
            X.C72463Mc.A10(r0, r2)
            r4.A1R(r0)
            X.1GP r1 = r7.getSupportFragmentManager()
            java.lang.String r0 = "ListsManagerBottomSheetFragment"
            r4.A2C(r1, r0)
            X.5WB r3 = new X.5WB
            r3.<init>(r7)
            java.lang.String r2 = "updateListInfoResult"
            X.1GP r1 = r4.A1F()
            X.4fa r0 = new X.4fa
            r0.<init>(r3, r6)
            r1.A0t(r0, r4, r2)
        L_0x0040:
            boolean r0 = super.onOptionsItemSelected(r8)
            return r0
        L_0x0045:
            r0 = 2131432514(0x7f0b1442, float:1.8486788E38)
            if (r1 != r0) goto L_0x0040
            r5 = 0
            X.3Ri r4 = X.C73193Ri.A00(r7)
            r2 = 2131889319(0x7f120ca7, float:1.9413298E38)
            r3 = 1
            java.lang.Object[] r1 = new java.lang.Object[r3]
            X.1x1 r0 = r7.A00
            if (r0 == 0) goto L_0x005b
            java.lang.String r5 = r0.A06
        L_0x005b:
            java.lang.String r2 = X.C17880vN.A0q(r7, r5, r1, r6, r2)
            android.content.Context r1 = r7.getApplicationContext()
            X.1KW r0 = r7.A0D
            java.lang.CharSequence r0 = X.C43251zV.A05(r1, r0, r2)
            r4.A0e(r0)
            r2 = 2131889316(0x7f120ca4, float:1.9413292E38)
            r1 = 23
            X.4bB r0 = new X.4bB
            r0.<init>(r7, r1)
            r4.A0X(r0, r2)
            r1 = 2131889315(0x7f120ca3, float:1.941329E38)
            r0 = 27
            X.C73193Ri.A01(r4, r0, r1)
            X.1x1 r0 = r7.A00
            if (r0 == 0) goto L_0x008c
            int r1 = r0.A02
            r0 = 2131889317(0x7f120ca5, float:1.9413294E38)
            if (r1 == 0) goto L_0x008f
        L_0x008c:
            r0 = 2131889318(0x7f120ca6, float:1.9413296E38)
        L_0x008f:
            r4.A0U(r0)
            r4.A0f(r3)
            X.AnonymousClass3MY.A1G(r4)
            goto L_0x0040
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.lists.ListsConversationManagementActivity.onOptionsItemSelected(android.view.MenuItem):boolean");
    }

    public boolean onPrepareOptionsMenu(Menu menu) {
        MenuItem findItem;
        if (!(menu == null || (findItem = menu.findItem(2131432502)) == null)) {
            int i = 2131233284;
            if (((AnonymousClass4YC) ((ListsConversationsManagementViewModel) this.A02.getValue()).A01.getValue()).A01) {
                i = 2131233241;
            }
            Drawable A05 = AnonymousClass4aX.A05(this, AnonymousClass3MX.A06(this, i), 2131103154);
            C18070vi.A0X(A05);
            findItem.setIcon(A05);
        }
        return super.onPrepareOptionsMenu(menu);
    }

    public final void A4b(String str) {
        C003401n supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.A0S(C43251zV.A05(getApplicationContext(), this.A0D, str));
            supportActionBar.A0W(true);
        }
    }

    public void onCreate(Bundle bundle) {
        C41761x1 r7;
        super.onCreate(bundle);
        setContentView(2131624069);
        Bundle A09 = AnonymousClass3MY.A09(this);
        if (A09 != null) {
            r7 = (C41761x1) C24141Ja.A00(A09, C41761x1.class, "LABELINFO");
            if (r7 != null) {
                A4b(r7.A06);
            }
        } else {
            r7 = null;
        }
        this.A00 = r7;
        int intExtra = getIntent().getIntExtra("EXTRA_ENTRY_POINT", -1);
        Integer valueOf = Integer.valueOf(intExtra);
        if (intExtra == -1) {
            valueOf = null;
        }
        this.A01 = valueOf;
        if (bundle == null && r7 != null) {
            C34001jj A0H = AnonymousClass3Ma.A0H(this);
            A0H.A0G = true;
            Integer num = this.A01;
            ListsManagerFragment listsManagerFragment = new ListsManagerFragment();
            Bundle A0D = C17880vN.A0D();
            A0D.putParcelable("labelInfo", r7);
            C72463Mc.A10(A0D, num);
            listsManagerFragment.A1R(A0D);
            A0H.A09(listsManagerFragment, 2131430999);
            A0H.A01();
        }
        AnonymousClass3MX.A1Q(new ListsConversationManagementActivity$onCreate$3(this, (C30391dr) null), AnonymousClass3MZ.A0H(this));
    }
}
