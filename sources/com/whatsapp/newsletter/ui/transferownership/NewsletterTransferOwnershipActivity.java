package com.whatsapp.newsletter.ui.transferownership;

import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass11S;
import X.AnonymousClass1DF;
import X.AnonymousClass1FB;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3MZ;
import X.AnonymousClass4RH;
import X.AnonymousClass5JJ;
import X.AnonymousClass5JK;
import X.AnonymousClass5JL;
import X.C17880vN;
import X.C18070vi;
import X.C18100vl;
import X.C21425Ajs;
import X.C29681ch;
import X.C72453Mb;
import X.C72473Md;
import X.C72483Me;
import X.C822343w;
import X.C91024f1;
import X.C96844oV;
import android.content.Intent;
import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.TextView;
import com.whatsapp.jid.PhoneUserJid;

public final class NewsletterTransferOwnershipActivity extends C822343w {
    public AnonymousClass4RH A00;
    public boolean A01;
    public final C18100vl A02;
    public final C18100vl A03;
    public final C18100vl A04;

    public NewsletterTransferOwnershipActivity() {
        this(0);
        this.A02 = AnonymousClass1DF.A01(new AnonymousClass5JJ(this));
        this.A03 = AnonymousClass1DF.A01(new AnonymousClass5JK(this));
        this.A04 = AnonymousClass1DF.A01(new AnonymousClass5JL(this));
    }

    public static final void A03(NewsletterTransferOwnershipActivity newsletterTransferOwnershipActivity, Boolean bool, boolean z) {
        newsletterTransferOwnershipActivity.A05.A0J(new C21425Ajs((Object) newsletterTransferOwnershipActivity, 5));
        Intent A0A = C17880vN.A0A();
        A0A.putExtra("transfer_ownership_admin_short_name", AnonymousClass3MW.A0y(newsletterTransferOwnershipActivity.A03));
        A0A.putExtra("transfer_ownership_successful", z);
        if (bool != null) {
            boolean booleanValue = bool.booleanValue();
            A0A.putExtra("transfer_ownership_admin_dismiss_requested", true);
            A0A.putExtra("transfer_ownership_admin_dismiss_successful", booleanValue);
        }
        C72453Mb.A16(newsletterTransferOwnershipActivity, A0A);
    }

    public static final void A0Q(NewsletterTransferOwnershipActivity newsletterTransferOwnershipActivity, boolean z) {
        if (!((CompoundButton) newsletterTransferOwnershipActivity.A04.getValue()).isChecked()) {
            A03(newsletterTransferOwnershipActivity, (Boolean) null, z);
            return;
        }
        AnonymousClass4RH r4 = newsletterTransferOwnershipActivity.A00;
        if (r4 != null) {
            C29681ch A0o = AnonymousClass3MX.A0o(newsletterTransferOwnershipActivity.A03);
            C18070vi.A0z(A0o, "null cannot be cast to non-null type com.whatsapp.jid.NewsletterJid");
            PhoneUserJid A002 = AnonymousClass11S.A00(newsletterTransferOwnershipActivity.A02);
            C18070vi.A0z(A002, "null cannot be cast to non-null type com.whatsapp.jid.UserJid");
            r4.A00(A0o, A002, new C96844oV(newsletterTransferOwnershipActivity, 4));
            return;
        }
        C18070vi.A11("newsletterMultiAdminManager");
        throw null;
    }

    public void A2y() {
        if (!this.A01) {
            this.A01 = true;
            AnonymousClass10E A0L = C72473Md.A0L(this);
            C72483Me.A0q(A0L, this);
            AnonymousClass10G r1 = A0L.A00;
            AnonymousClass1FB.A0K(A0L, r1, this, r1.A45);
            AnonymousClass1FB.A0L(A0L, r1, this, r1.A5A);
            this.A00 = AnonymousClass3MZ.A0i(A0L);
            this.A01 = AnonymousClass3MZ.A0y(A0L);
            this.A00 = (AnonymousClass4RH) r1.A3N.get();
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ((TextView) this.A04.getValue()).setText(2131889499);
    }

    public NewsletterTransferOwnershipActivity(int i) {
        this.A01 = false;
        C91024f1.A00(this, 3);
    }
}
