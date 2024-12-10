package com.whatsapp.newsletter.ui;

import X.AGC;
import X.AnonymousClass00H;
import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass1K1;
import X.AnonymousClass1YF;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3Ma;
import X.AnonymousClass8BT;
import X.C137116uw;
import X.C175218yL;
import X.C18070vi;
import X.C46162Dk;
import X.C63662tU;
import X.C63932tv;
import android.os.Bundle;
import com.whatsapp.WaEditText;

public final class NewsletterEditDescriptionActivity extends C175218yL {
    public AnonymousClass00H A00;
    public boolean A01;

    public void A2y() {
        if (!this.A01) {
            this.A01 = true;
            AnonymousClass1K1 A002 = C137116uw.A00(this);
            AnonymousClass10E r2 = A002.AAQ;
            C63932tv.A02(r2, this);
            AnonymousClass10G r1 = r2.A00;
            C63932tv.A01(r2, r1, this);
            C63662tU.A00(r2, r1, this, r1.A5A);
            C175218yL.A0V(A002, r2, this, r2.A2H);
            this.A0D = AnonymousClass3Ma.A0r(r2);
            this.A00 = AnonymousClass8BT.A0h(r2);
        }
    }

    public void A3K() {
        AnonymousClass00H r0 = this.A00;
        if (r0 != null) {
            AnonymousClass3MX.A0u(r0).A02(this.A0A, 32);
        } else {
            C18070vi.A11("navigationTimeSpentManager");
            throw null;
        }
    }

    public NewsletterEditDescriptionActivity(int i) {
        this.A01 = false;
        AGC.A00(this, 0);
    }

    public void A4k() {
        super.A4k();
        AnonymousClass3MW.A0I(this, 2131433082).setText(2131895380);
    }

    public void onCreate(Bundle bundle) {
        String str;
        String A0I;
        super.onCreate(bundle);
        if (this.A0A == null) {
            finish();
            return;
        }
        C46162Dk A4d = A4d();
        if (A4d != null) {
            WaEditText A4c = A4c();
            String str2 = A4d.A0T;
            String str3 = "";
            if (str2 == null || (str = AnonymousClass1YF.A0I(str2)) == null) {
                str = str3;
            }
            A4c.setText(str);
            WaEditText A4b = A4b();
            String str4 = A4d.A0Q;
            if (!(str4 == null || (A0I = AnonymousClass1YF.A0I(str4)) == null)) {
                str3 = A0I;
            }
            A4b.setText(str3);
            A4e().setVisibility(8);
        }
    }

    public NewsletterEditDescriptionActivity() {
        this(0);
    }
}
