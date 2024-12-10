package com.whatsapp.loginfailure;

import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass1FB;
import X.AnonymousClass3Ma;
import X.C33841jT;
import X.C36361nl;
import X.C72473Md;
import X.C72483Me;
import X.C75083dy;
import X.C91014f0;

public final class LogoutMessageActivity extends C75083dy {
    public C36361nl A00;
    public boolean A01;

    public LogoutMessageActivity() {
        this(0);
    }

    public void A2y() {
        if (!this.A01) {
            this.A01 = true;
            AnonymousClass10E A0L = C72473Md.A0L(this);
            C72483Me.A0q(A0L, this);
            AnonymousClass10G r1 = A0L.A00;
            AnonymousClass1FB.A0K(A0L, r1, this, r1.A45);
            AnonymousClass1FB.A0L(A0L, r1, this, r1.A5A);
            this.A00 = (C33841jT) A0L.A9T.get();
            this.A00 = AnonymousClass3Ma.A0L(A0L);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x002b, code lost:
        if (X.C18070vi.A18(r6.A00.A05(), r1) == false) goto L_0x002d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r7) {
        /*
            r6 = this;
            super.onCreate(r7)
            r0 = 2131625915(0x7f0e07bb, float:1.8879051E38)
            r6.setContentView((int) r0)
            android.view.View r1 = r6.A00
            r0 = 2131436101(0x7f0b2245, float:1.8494063E38)
            android.view.View r3 = X.C18070vi.A05(r1, r0)
            com.whatsapp.wds.components.textlayout.WDSTextLayout r3 = (com.whatsapp.wds.components.textlayout.WDSTextLayout) r3
            android.content.SharedPreferences r1 = X.C72453Mb.A0M(r6)
            java.lang.String r0 = "logout_message_locale"
            java.lang.String r1 = X.C17880vN.A0r(r1, r0)
            if (r1 == 0) goto L_0x002d
            X.0vb r0 = r6.A00
            java.lang.String r0 = r0.A05()
            boolean r0 = X.C18070vi.A18(r0, r1)
            r2 = 1
            if (r0 != 0) goto L_0x002e
        L_0x002d:
            r2 = 0
        L_0x002e:
            android.content.SharedPreferences r1 = X.C72453Mb.A0M(r6)
            java.lang.String r0 = "main_button_text"
            java.lang.String r1 = X.C17880vN.A0r(r1, r0)
            if (r2 == 0) goto L_0x00ce
            if (r1 == 0) goto L_0x00ce
            boolean r0 = X.C24605CBj.A00(r1)
            if (r0 != 0) goto L_0x00ce
        L_0x0042:
            r3.setPrimaryButtonText(r1)
            android.content.SharedPreferences r0 = X.C72453Mb.A0M(r6)
            java.lang.String r5 = "logout_message_header"
            r1 = 0
            java.lang.String r0 = r0.getString(r5, r1)
            if (r0 != 0) goto L_0x00c5
            r0 = 2131897679(0x7f122d4f, float:1.9430254E38)
            java.lang.String r0 = r6.getString(r0)
        L_0x0059:
            r3.setHeadlineText(r0)
            android.content.SharedPreferences r0 = X.C72453Mb.A0M(r6)
            r4 = 0
            java.lang.String r0 = r0.getString(r5, r1)
            if (r0 != 0) goto L_0x00ba
            android.content.SharedPreferences r1 = X.C72453Mb.A0M(r6)
            java.lang.String r0 = "logout_message_subtext"
            java.lang.String r0 = r1.getString(r0, r4)
            if (r0 != 0) goto L_0x00ba
            r0 = 2131894711(0x7f1221b7, float:1.9424234E38)
            java.lang.String r0 = r6.getString(r0)
        L_0x007a:
            r3.setDescriptionText(r0)
            r1 = 1
            X.48c r0 = new X.48c
            r0.<init>(r6, r6, r1, r2)
            r3.setPrimaryButtonClickListener(r0)
            android.content.SharedPreferences r1 = X.C72453Mb.A0M(r6)
            java.lang.String r0 = "secondary_button_text"
            java.lang.String r1 = X.C17880vN.A0r(r1, r0)
            if (r2 == 0) goto L_0x00b8
            if (r1 == 0) goto L_0x00b8
            boolean r0 = X.C24605CBj.A00(r1)
            if (r0 != 0) goto L_0x00b8
        L_0x009a:
            r3.setSecondaryButtonText(r1)
            r1 = 2
            X.48c r0 = new X.48c
            r0.<init>(r6, r6, r1, r2)
            r3.setSecondaryButtonClickListener(r0)
            boolean r0 = X.C22891Dp.A06
            if (r0 == 0) goto L_0x00b7
            r1 = 2130971617(0x7f040be1, float:1.7551977E38)
            r0 = 2131102224(0x7f060a10, float:1.781688E38)
            int r0 = X.AnonymousClass1YL.A00(r6, r1, r0)
            X.C28281Zt.A06(r6, r0)
        L_0x00b7:
            return
        L_0x00b8:
            r1 = 0
            goto L_0x009a
        L_0x00ba:
            android.content.SharedPreferences r1 = X.C72453Mb.A0M(r6)
            java.lang.String r0 = "logout_message_subtext"
            java.lang.String r0 = r1.getString(r0, r4)
            goto L_0x007a
        L_0x00c5:
            android.content.SharedPreferences r0 = X.C72453Mb.A0M(r6)
            java.lang.String r0 = r0.getString(r5, r1)
            goto L_0x0059
        L_0x00ce:
            android.content.Context r1 = r6.getBaseContext()
            r0 = 2131891828(0x7f121674, float:1.9418387E38)
            java.lang.String r1 = X.C18070vi.A0F(r1, r0)
            goto L_0x0042
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.loginfailure.LogoutMessageActivity.onCreate(android.os.Bundle):void");
    }

    public void onBackPressed() {
        finishAffinity();
    }

    public LogoutMessageActivity(int i) {
        this.A01 = false;
        C91014f0.A00(this, 42);
    }
}
