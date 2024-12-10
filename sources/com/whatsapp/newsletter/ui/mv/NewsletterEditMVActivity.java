package com.whatsapp.newsletter.ui.mv;

import X.AGC;
import X.AnonymousClass00H;
import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass1E7;
import X.AnonymousClass1K1;
import X.AnonymousClass1YF;
import X.AnonymousClass3MW;
import X.AnonymousClass8BT;
import X.AnonymousClass9I0;
import X.C137116uw;
import X.C175208yK;
import X.C175218yL;
import X.C18070vi;
import X.C27201Vd;
import X.C37451pZ;
import X.C39241sk;
import X.C46162Dk;
import X.C63662tU;
import X.C63932tv;
import android.os.Bundle;
import com.whatsapp.WaEditText;

public final class NewsletterEditMVActivity extends C175208yK {
    public C37451pZ A00;
    public AnonymousClass00H A01;
    public boolean A02;

    public void A2y() {
        if (!this.A02) {
            this.A02 = true;
            AnonymousClass1K1 A002 = C137116uw.A00(this);
            AnonymousClass10E r2 = A002.AAQ;
            C63932tv.A02(r2, this);
            AnonymousClass10G r1 = r2.A00;
            C63932tv.A01(r2, r1, this);
            C63662tU.A00(r2, r1, this, r1.A5A);
            C175218yL.A0V(A002, r2, this, r2.A2H);
            C175218yL.A0c(r2, this);
            this.A01 = AnonymousClass8BT.A0h(r2);
        }
    }

    public NewsletterEditMVActivity(int i) {
        this.A02 = false;
        AGC.A00(this, 3);
    }

    public void A4j() {
        String str;
        C46162Dk A4d = A4d();
        if (A4d == null || !A4d.A0Q()) {
            WaEditText A4c = A4c();
            C46162Dk A4d2 = A4d();
            if (A4d2 != null) {
                str = A4d2.A0T;
            } else {
                str = null;
            }
            A4c.setText(str);
            A4c().setEnabled(false);
            this.A04 = "";
            return;
        }
        super.A4j();
    }

    public void A4k() {
        super.A4k();
        AnonymousClass3MW.A0I(this, 2131433082).setText(2131892734);
    }

    public void A4o() {
        C46162Dk A4d = A4d();
        if (A4d == null || !A4d.A0Q()) {
            A4e().setProfileBadge((C39241sk) null);
        } else {
            super.A4o();
        }
    }

    public void onCreate(Bundle bundle) {
        String str;
        String str2;
        String str3;
        super.onCreate(bundle);
        C27201Vd r1 = this.A02;
        if (r1 != null) {
            this.A00 = r1.A04(this, this, "newsletter-edit-mv");
            if (this.A0A == null) {
                finish();
            } else {
                C46162Dk A4d = A4d();
                if (A4d != null) {
                    WaEditText A4b = A4b();
                    String str4 = A4d.A0Q;
                    if (str4 == null || (str2 = AnonymousClass1YF.A0I(str4)) == null) {
                        str2 = "";
                    }
                    A4b.setText(str2);
                    int dimensionPixelSize = getResources().getDimensionPixelSize(2131168013);
                    C37451pZ r2 = this.A00;
                    if (r2 == null) {
                        str = "contactPhotoLoader";
                    } else {
                        AnonymousClass1E7 r12 = new AnonymousClass1E7(this.A0A);
                        C46162Dk A4d2 = A4d();
                        if (!(A4d2 == null || (str3 = A4d2.A0T) == null)) {
                            r12.A0R = str3;
                        }
                        r2.A0A(A4e(), r12, dimensionPixelSize);
                    }
                }
            }
            if (bundle != null) {
                bundle.getInt("photo_state", 0);
                AnonymousClass9I0.values();
                return;
            }
            return;
        }
        str = "contactPhotos";
        C18070vi.A11(str);
        throw null;
    }

    public NewsletterEditMVActivity() {
        this(0);
    }
}
