package com.whatsapp.settings.chat.wallpaper;

import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass1FB;
import X.AnonymousClass47N;
import X.C108875cR;
import X.C110885hR;
import X.C72473Md;
import X.C72483Me;
import X.C88594aB;
import X.C91034f2;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ImageView;

public class DefaultWallpaperPreview extends AnonymousClass47N {
    public boolean A00;

    public DefaultWallpaperPreview() {
        this(0);
    }

    public void A2y() {
        if (!this.A00) {
            this.A00 = true;
            AnonymousClass10E A0L = C72473Md.A0L(this);
            C72483Me.A0q(A0L, this);
            AnonymousClass10G r1 = A0L.A00;
            AnonymousClass1FB.A0K(A0L, r1, this, r1.A45);
            AnonymousClass1FB.A0L(A0L, r1, this, r1.A5A);
            AnonymousClass47N.A0V(A0L, r1, this);
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ((ImageView) C110885hR.A0A(this, 2131436985)).setImageDrawable(C88594aB.A02(this, getResources(), this.A0E));
        ((WallpaperMockChatView) C110885hR.A0A(this, 2131436984)).setMessages(getString(2131898400), A4b(), (C108875cR) null);
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return false;
        }
        setResult(0);
        finish();
        return true;
    }

    public DefaultWallpaperPreview(int i) {
        this.A00 = false;
        C91034f2.A00(this, 34);
    }
}
