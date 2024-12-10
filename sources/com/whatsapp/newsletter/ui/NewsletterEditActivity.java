package com.whatsapp.newsletter.ui;

import X.AF3;
import X.AGB;
import X.AnonymousClass00H;
import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass1E7;
import X.AnonymousClass1K1;
import X.AnonymousClass1YF;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3MZ;
import X.AnonymousClass3Ma;
import X.AnonymousClass8BT;
import X.AnonymousClass9I0;
import X.C137116uw;
import X.C175218yL;
import X.C18070vi;
import X.C27201Vd;
import X.C37451pZ;
import X.C46162Dk;
import X.C63662tU;
import X.C63932tv;
import android.os.Bundle;
import android.os.PersistableBundle;
import com.whatsapp.WaEditText;
import com.whatsapp.wds.components.button.WDSButton;
import java.io.File;

public final class NewsletterEditActivity extends C175218yL {
    public C37451pZ A00;
    public C27201Vd A01;
    public AnonymousClass9I0 A02;
    public AnonymousClass00H A03;
    public boolean A04;

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002d, code lost:
        if (r0 != false) goto L_0x002f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A03(com.whatsapp.newsletter.ui.NewsletterEditActivity r3) {
        /*
            com.whatsapp.wds.components.button.WDSButton r2 = r3.A0F
            if (r2 == 0) goto L_0x0038
            X.9I0 r1 = r3.A02
            X.9I0 r0 = X.AnonymousClass9I0.UNCHANGED
            if (r1 != r0) goto L_0x002f
            java.lang.String r1 = r3.A4h()
            X.2Dk r0 = r3.A4d()
            if (r0 == 0) goto L_0x0036
            java.lang.String r0 = r0.A0T
        L_0x0016:
            boolean r0 = X.AnonymousClass8BR.A1T(r1, r0)
            if (r0 != 0) goto L_0x002f
            java.lang.String r1 = r3.A4g()
            X.2Dk r0 = r3.A4d()
            if (r0 == 0) goto L_0x0034
            java.lang.String r0 = r0.A0Q
        L_0x0028:
            boolean r0 = X.AnonymousClass8BR.A1T(r1, r0)
            r1 = 0
            if (r0 == 0) goto L_0x0030
        L_0x002f:
            r1 = 1
        L_0x0030:
            r2.setEnabled(r1)
            return
        L_0x0034:
            r0 = 0
            goto L_0x0028
        L_0x0036:
            r0 = 0
            goto L_0x0016
        L_0x0038:
            java.lang.String r0 = "saveButton"
            X.C18070vi.A11(r0)
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.newsletter.ui.NewsletterEditActivity.A03(com.whatsapp.newsletter.ui.NewsletterEditActivity):void");
    }

    public void A2y() {
        if (!this.A04) {
            this.A04 = true;
            AnonymousClass1K1 A002 = C137116uw.A00(this);
            AnonymousClass10E r2 = A002.AAQ;
            C63932tv.A02(r2, this);
            AnonymousClass10G r1 = r2.A00;
            C63932tv.A01(r2, r1, this);
            C63662tU.A00(r2, r1, this, r1.A5A);
            C175218yL.A0V(A002, r2, this, r2.A2H);
            this.A0D = AnonymousClass3Ma.A0r(r2);
            this.A01 = AnonymousClass3MZ.A0i(r2);
            this.A03 = AnonymousClass8BT.A0h(r2);
        }
    }

    public void A3K() {
        AnonymousClass00H r0 = this.A03;
        if (r0 != null) {
            AnonymousClass3MX.A0u(r0).A02(this.A0A, 32);
        } else {
            C18070vi.A11("navigationTimeSpentManager");
            throw null;
        }
    }

    public File A4f() {
        int ordinal = this.A02.ordinal();
        if (ordinal == 0) {
            return null;
        }
        if (ordinal == 2) {
            return super.A4f();
        }
        if (ordinal == 1) {
            return null;
        }
        throw AnonymousClass3MW.A14();
    }

    public boolean A4u() {
        String str;
        int ordinal = this.A02.ordinal();
        if (ordinal == 0) {
            C46162Dk A4d = A4d();
            if (A4d == null || (str = A4d.A0V) == null || str.length() == 0) {
                return false;
            }
            return true;
        } else if (ordinal == 2) {
            return super.A4u();
        } else {
            if (ordinal == 1) {
                return false;
            }
            throw AnonymousClass3MW.A14();
        }
    }

    public NewsletterEditActivity(int i) {
        this.A04 = false;
        AGB.A00(this, 49);
    }

    public void A4k() {
        super.A4k();
        WDSButton wDSButton = this.A0F;
        if (wDSButton != null) {
            wDSButton.setText(2131895380);
        } else {
            C18070vi.A11("saveButton");
            throw null;
        }
    }

    public void A4l() {
        super.A4l();
        this.A02 = AnonymousClass9I0.UPDATED;
        A03(this);
    }

    public void A4m() {
        super.A4m();
        this.A02 = AnonymousClass9I0.UPDATED;
        A03(this);
    }

    public void A4n() {
        super.A4n();
        this.A02 = AnonymousClass9I0.DELETED;
        A03(this);
    }

    public void onCreate(Bundle bundle) {
        String str;
        String str2;
        String str3;
        String A0I;
        super.onCreate(bundle);
        C27201Vd r1 = this.A01;
        if (r1 != null) {
            this.A00 = r1.A04(this, this, "newsletter-edit");
            AF3 af3 = new AF3(this, 3);
            A4c().addTextChangedListener(af3);
            A4b().addTextChangedListener(af3);
            if (this.A0A == null) {
                finish();
            } else {
                C46162Dk A4d = A4d();
                if (A4d != null) {
                    WaEditText A4c = A4c();
                    String str4 = A4d.A0T;
                    String str5 = "";
                    if (str4 == null || (str2 = AnonymousClass1YF.A0I(str4)) == null) {
                        str2 = str5;
                    }
                    A4c.setText(str2);
                    WaEditText A4b = A4b();
                    String str6 = A4d.A0Q;
                    if (!(str6 == null || (A0I = AnonymousClass1YF.A0I(str6)) == null)) {
                        str5 = A0I;
                    }
                    A4b.setText(str5);
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
                this.A02 = ((AnonymousClass9I0[]) AnonymousClass9I0.A00.toArray(new AnonymousClass9I0[0]))[bundle.getInt("photo_state", 0)];
                A03(this);
                return;
            }
            return;
        }
        str = "contactPhotos";
        C18070vi.A11(str);
        throw null;
    }

    public void onSaveInstanceState(Bundle bundle, PersistableBundle persistableBundle) {
        C18070vi.A0h(bundle, persistableBundle);
        super.onSaveInstanceState(bundle, persistableBundle);
        bundle.putInt("photo_state", this.A02.ordinal());
    }

    public NewsletterEditActivity() {
        this(0);
        this.A02 = AnonymousClass9I0.UNCHANGED;
    }
}
