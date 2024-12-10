package com.whatsapp.newsletter.multiadmin;

import X.AnonymousClass00R;
import X.AnonymousClass1DF;
import X.AnonymousClass1M9;
import X.AnonymousClass3MW;
import X.AnonymousClass3Ma;
import X.AnonymousClass5OH;
import X.C18070vi;
import X.C18100vl;
import X.C34441kU;
import X.C72463Mc;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.WaImageView;
import com.whatsapp.wds.components.button.WDSButton;

public final class NewsletterSendAdminInviteSheet extends Hilt_NewsletterSendAdminInviteSheet {
    public WaImageView A00;
    public AnonymousClass1M9 A01;
    public C34441kU A02;
    public WDSButton A03;
    public WDSButton A04;
    public final C18100vl A05 = AnonymousClass1DF.A00(AnonymousClass00R.A0C, new AnonymousClass5OH(this));

    public View A1q(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C18070vi.A0d(layoutInflater, 0);
        View inflate = layoutInflater.inflate(2131626259, viewGroup);
        this.A04 = AnonymousClass3MW.A0q(inflate, 2131434059);
        this.A03 = AnonymousClass3MW.A0q(inflate, 2131431962);
        this.A00 = AnonymousClass3MW.A0R(inflate, 2131429138);
        return inflate;
    }

    public void A1s() {
        this.A04 = null;
        this.A03 = null;
        this.A00 = null;
        super.A1s();
    }

    public void A21(Bundle bundle, View view) {
        C18070vi.A0d(view, 0);
        super.A21(bundle, view);
        WDSButton wDSButton = this.A04;
        if (wDSButton != null) {
            AnonymousClass3Ma.A19(wDSButton, this, 6);
        }
        WDSButton wDSButton2 = this.A03;
        if (wDSButton2 != null) {
            AnonymousClass3Ma.A19(wDSButton2, this, 7);
        }
        WaImageView waImageView = this.A00;
        if (waImageView != null) {
            AnonymousClass3Ma.A19(waImageView, this, 8);
        }
        C72463Mc.A13(C18070vi.A05(view, 2131433233), 2131428478);
    }

    public void A28() {
        C34441kU r0 = this.A02;
        if (r0 != null) {
            r0.A00.A00("newsletter_multi_admin", (Object) null);
            super.A28();
            return;
        }
        C18070vi.A11("nuxManager");
        throw null;
    }
}
