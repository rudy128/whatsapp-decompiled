package com.whatsapp.registration.email;

import X.A9B;
import X.AnonymousClass000;
import X.AnonymousClass00H;
import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass1FB;
import X.AnonymousClass1FY;
import X.AnonymousClass3MW;
import X.AnonymousClass3MY;
import X.AnonymousClass3MZ;
import X.AnonymousClass48o;
import X.AnonymousClass4CG;
import X.C000200d;
import X.C18070vi;
import X.C190059kJ;
import X.C57352iw;
import X.C72453Mb;
import X.C72463Mc;
import X.C72473Md;
import X.C72483Me;
import X.C73203Rj;
import X.C91034f2;
import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.whatsapp.wds.components.textlayout.WDSTextLayout;

public final class ConfirmEmailSetupRegUpsellActivity extends AnonymousClass1FY {
    public int A00;
    public C190059kJ A01;
    public C57352iw A02;
    public WDSTextLayout A03;
    public AnonymousClass00H A04;
    public AnonymousClass00H A05;
    public AnonymousClass00H A06;
    public String A07;
    public String A08;
    public boolean A09;

    public ConfirmEmailSetupRegUpsellActivity() {
        this(0);
    }

    public void onCreate(Bundle bundle) {
        String str;
        super.onCreate(bundle);
        setContentView(2131624616);
        C57352iw r0 = this.A02;
        if (r0 != null) {
            r0.A00(this);
            this.A03 = (WDSTextLayout) C18070vi.A05(this.A00, 2131429345);
            this.A00 = getIntent().getIntExtra("entrypoint", 0);
            this.A08 = C72453Mb.A0v(this);
            String A0o = this.A0A.A0o();
            if (A0o != null) {
                this.A07 = A0o;
                C190059kJ r2 = this.A01;
                if (r2 != null) {
                    r2.A00(this.A08, (String) null, this.A00, 10, 8, 3);
                    A9B.A0Q(this.A00, this, 2131434410, false, false, true);
                    WDSTextLayout wDSTextLayout = this.A03;
                    if (wDSTextLayout == null) {
                        C18070vi.A11("textLayout");
                        throw null;
                    }
                    AnonymousClass3MY.A10(this, wDSTextLayout, 2131889670);
                    View inflate = View.inflate(this, 2131624615, (ViewGroup) null);
                    TextView A0J = AnonymousClass3MW.A0J(inflate, 2131430289);
                    String str2 = this.A07;
                    if (str2 == null) {
                        C18070vi.A11("emailAddress");
                        throw null;
                    }
                    A0J.setText(str2);
                    AnonymousClass3MW.A0J(inflate, 2131430288).setText(2131889709);
                    C18070vi.A0b(inflate);
                    AnonymousClass4CG.A00(inflate, wDSTextLayout);
                    WDSTextLayout wDSTextLayout2 = this.A03;
                    if (wDSTextLayout2 != null) {
                        AnonymousClass3MY.A0z(this, wDSTextLayout2, 2131898593);
                        WDSTextLayout wDSTextLayout3 = this.A03;
                        if (wDSTextLayout3 != null) {
                            AnonymousClass48o.A02(wDSTextLayout3, this, 3);
                            WDSTextLayout wDSTextLayout4 = this.A03;
                            if (wDSTextLayout4 != null) {
                                wDSTextLayout4.setSecondaryButtonText(getString(2131889684));
                                WDSTextLayout wDSTextLayout5 = this.A03;
                                if (wDSTextLayout5 != null) {
                                    wDSTextLayout5.setSecondaryButtonClickListener(new AnonymousClass48o(this, 4));
                                    return;
                                }
                            }
                        }
                    }
                    C18070vi.A11("textLayout");
                    throw null;
                }
                str = "emailVerificationLogger";
            } else {
                throw AnonymousClass000.A0n("Email address cannot be null");
            }
        } else {
            str = "landscapeModeBacktest";
        }
        C18070vi.A11(str);
        throw null;
    }

    public Dialog onCreateDialog(int i) {
        if (i != 1) {
            return super.onCreateDialog(i);
        }
        C73203Rj A022 = C73203Rj.A02(this);
        C73203Rj.A0A(A022, this, 48, 2131899286);
        return A022.create();
    }

    public void A2y() {
        if (!this.A09) {
            this.A09 = true;
            AnonymousClass10E A0L = C72473Md.A0L(this);
            C72483Me.A0q(A0L, this);
            AnonymousClass10G r1 = A0L.A00;
            AnonymousClass1FB.A0K(A0L, r1, this, r1.A45);
            AnonymousClass1FB.A0L(A0L, r1, this, r1.A5A);
            this.A01 = (C190059kJ) r1.A9X.get();
            this.A04 = C000200d.A00(A0L.AKr);
            this.A02 = C72463Mc.A0i(r1);
            this.A05 = AnonymousClass3MZ.A14(A0L);
            this.A06 = AnonymousClass3MW.A0s(A0L);
        }
    }

    public void onBackPressed() {
        super.onBackPressed();
        C190059kJ r0 = this.A01;
        if (r0 != null) {
            r0.A00(this.A08, (String) null, this.A00, 10, 7, 3);
        } else {
            C18070vi.A11("emailVerificationLogger");
            throw null;
        }
    }

    public ConfirmEmailSetupRegUpsellActivity(int i) {
        this.A09 = false;
        C91034f2.A00(this, 0);
    }
}
