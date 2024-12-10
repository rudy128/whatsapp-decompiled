package com.whatsapp.newsletter.ui.mv;

import X.AGC;
import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass1K1;
import X.AnonymousClass1YF;
import X.AnonymousClass3MW;
import X.AnonymousClass3MZ;
import X.C137116uw;
import X.C175208yK;
import X.C175218yL;
import X.C18070vi;
import X.C27201Vd;
import X.C37451pZ;
import X.C46162Dk;
import X.C63662tU;
import X.C63932tv;
import android.os.Bundle;
import com.whatsapp.WaEditText;

public final class NewsletterUpgradeToMVActivity extends C175208yK {
    public C37451pZ A00;
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
            C175218yL.A0c(r2, this);
        }
    }

    public NewsletterUpgradeToMVActivity(int i) {
        this.A01 = false;
        AGC.A00(this, 4);
    }

    public void A4k() {
        super.A4k();
        AnonymousClass3MW.A0I(this, 2131433082).setText(2131892734);
    }

    public void onCreate(Bundle bundle) {
        String str;
        String str2;
        super.onCreate(bundle);
        C27201Vd r1 = this.A02;
        if (r1 != null) {
            this.A00 = r1.A04(this, this, "newsletter-verify-channel-mv");
            if (this.A0A == null) {
                finish();
                return;
            }
            int dimensionPixelSize = getResources().getDimensionPixelSize(2131168013);
            C37451pZ r2 = this.A00;
            if (r2 == null) {
                str = "contactPhotoLoader";
            } else {
                r2.A0A(A4e(), AnonymousClass3MZ.A0Q(this.A02), dimensionPixelSize);
                C46162Dk A4d = A4d();
                if (A4d != null) {
                    WaEditText A4b = A4b();
                    String str3 = A4d.A0Q;
                    if (str3 == null || (str2 = AnonymousClass1YF.A0I(str3)) == null) {
                        str2 = "";
                    }
                    A4b.setText(str2);
                    return;
                }
                return;
            }
        } else {
            str = "contactPhotos";
        }
        C18070vi.A11(str);
        throw null;
    }

    public NewsletterUpgradeToMVActivity() {
        this(0);
    }
}
