package com.whatsapp.contextualhelp;

import X.AGB;
import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass1K1;
import X.AnonymousClass3Ma;
import X.AnonymousClass4aX;
import X.AnonymousClass8BT;
import X.C114925sD;
import X.C137116uw;
import X.C17880vN;
import X.C18070vi;
import X.C63662tU;
import X.C63932tv;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.view.Menu;
import android.view.MenuItem;
import com.whatsapp.webview.ui.WaInAppBrowsingActivity;

public final class ContextualHelpActivity extends WaInAppBrowsingActivity {
    public boolean A00;

    public boolean onCreateOptionsMenu(Menu menu) {
        C18070vi.A0d(menu, 0);
        getMenuInflater().inflate(2131820557, menu);
        MenuItem findItem = menu.findItem(2131432512);
        Drawable icon = findItem.getIcon();
        if (icon != null) {
            Drawable A08 = AnonymousClass4aX.A08(icon, AnonymousClass3Ma.A01(this, getResources(), 2130969324, 2131100309));
            C18070vi.A0X(A08);
            findItem.setIcon(A08);
            return true;
        }
        throw C17880vN.A0g();
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        C18070vi.A0d(menuItem, 0);
        if (menuItem.getItemId() != 2131432605) {
            return false;
        }
        AnonymousClass8BT.A14(this, Uri.parse(getIntent().getStringExtra("webview_url")), "android.intent.action.VIEW");
        return true;
    }

    public void A2y() {
        if (!this.A00) {
            this.A00 = true;
            AnonymousClass1K1 A002 = C137116uw.A00(this);
            AnonymousClass10E r2 = A002.AAQ;
            C63932tv.A02(r2, this);
            AnonymousClass10G r1 = r2.A00;
            C63932tv.A01(r2, r1, this);
            C63662tU.A00(r2, r1, this, r1.A5A);
            C114925sD.A03(A002, r2, r1, this);
        }
    }

    public ContextualHelpActivity(int i) {
        this.A00 = false;
        AGB.A00(this, 38);
    }

    public ContextualHelpActivity() {
        this(0);
    }
}
