package com.whatsapp.registration.parole;

import X.A9B;
import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass1FB;
import X.AnonymousClass1FY;
import X.AnonymousClass1LU;
import X.AnonymousClass3MW;
import X.AnonymousClass3MY;
import X.AnonymousClass3MZ;
import X.AnonymousClass3Ma;
import X.AnonymousClass48o;
import X.AnonymousClass4CG;
import X.C17880vN;
import X.C17960vV;
import X.C18070vi;
import X.C36401np;
import X.C57352iw;
import X.C72463Mc;
import X.C72473Md;
import X.C72483Me;
import X.C91034f2;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.whatsapp.util.Log;
import com.whatsapp.wds.components.textlayout.WDSTextLayout;

public final class CustomRegistrationBlockActivity extends AnonymousClass1FY {
    public AnonymousClass1LU A00;
    public C57352iw A01;
    public C36401np A02;
    public WDSTextLayout A03;
    public String A04;
    public String A05;
    public String A06;
    public String A07;
    public String A08;
    public String A09;
    public boolean A0A;

    public CustomRegistrationBlockActivity() {
        this(0);
    }

    public void onCreate(Bundle bundle) {
        String str;
        super.onCreate(bundle);
        setContentView(2131624044);
        C57352iw r0 = this.A01;
        if (r0 != null) {
            r0.A00(this);
            A9B.A0Q(this.A00, this, 2131429758, false, false, false);
            this.A03 = (WDSTextLayout) C18070vi.A05(this.A00, 2131429757);
            this.A09 = getIntent().getStringExtra("title_text");
            this.A04 = getIntent().getStringExtra("body_text");
            String stringExtra = getIntent().getStringExtra("button_primary_text");
            C17960vV.A07(stringExtra);
            C18070vi.A0X(stringExtra);
            this.A06 = stringExtra;
            this.A08 = getIntent().getStringExtra("button_secondary_text");
            String stringExtra2 = getIntent().getStringExtra("button_primary_link");
            C17960vV.A07(stringExtra2);
            C18070vi.A0X(stringExtra2);
            this.A05 = stringExtra2;
            this.A07 = getIntent().getStringExtra("button_secondary_link");
            if (getIntent().getBooleanExtra("show_custom_fields", false)) {
                Log.i("CustomRegistrationBlockActivity/showCustomFields");
                String str2 = this.A09;
                if (!(str2 == null || str2.length() == 0)) {
                    WDSTextLayout wDSTextLayout = this.A03;
                    if (wDSTextLayout == null) {
                        str = "textLayout";
                    } else {
                        wDSTextLayout.setHeadlineText(str2);
                    }
                }
                String str3 = this.A04;
                if (!(str3 == null || str3.length() == 0)) {
                    View inflate = View.inflate(this, 2131625046, (ViewGroup) null);
                    TextView A0E = C17880vN.A0E(inflate, 2131429756);
                    C36401np r2 = this.A02;
                    if (r2 != null) {
                        Context context = A0E.getContext();
                        String str4 = this.A04;
                        if (str4 != null) {
                            A0E.setText(r2.A03(context, str4), TextView.BufferType.SPANNABLE);
                            AnonymousClass3Ma.A1I(A0E, this.A0E);
                            AnonymousClass3MZ.A1Q(A0E, this.A08);
                            WDSTextLayout wDSTextLayout2 = this.A03;
                            if (wDSTextLayout2 == null) {
                                C18070vi.A11("textLayout");
                                throw null;
                            }
                            AnonymousClass4CG.A00(inflate, wDSTextLayout2);
                        } else {
                            throw C17880vN.A0g();
                        }
                    } else {
                        AnonymousClass3MW.A1E();
                        throw null;
                    }
                }
                WDSTextLayout wDSTextLayout3 = this.A03;
                if (wDSTextLayout3 != null) {
                    String str5 = this.A06;
                    if (str5 == null) {
                        str = "buttonPrimaryText";
                    } else {
                        wDSTextLayout3.setPrimaryButtonText(str5);
                        WDSTextLayout wDSTextLayout4 = this.A03;
                        if (wDSTextLayout4 != null) {
                            AnonymousClass48o.A02(wDSTextLayout4, this, 9);
                            String str6 = this.A08;
                            if (str6 != null && this.A07 != null) {
                                WDSTextLayout wDSTextLayout5 = this.A03;
                                if (wDSTextLayout5 != null) {
                                    wDSTextLayout5.setSecondaryButtonText(str6);
                                    WDSTextLayout wDSTextLayout6 = this.A03;
                                    if (wDSTextLayout6 != null) {
                                        wDSTextLayout6.setSecondaryButtonClickListener(new AnonymousClass48o(this, 10));
                                        return;
                                    }
                                }
                            } else {
                                return;
                            }
                        }
                    }
                }
                C18070vi.A11("textLayout");
                throw null;
            }
            return;
        }
        str = "landscapeModeBacktest";
        C18070vi.A11(str);
        throw null;
    }

    public void A2y() {
        if (!this.A0A) {
            this.A0A = true;
            AnonymousClass10E A0L = C72473Md.A0L(this);
            C72483Me.A0q(A0L, this);
            AnonymousClass10G r1 = A0L.A00;
            AnonymousClass1FB.A0K(A0L, r1, this, r1.A45);
            AnonymousClass1FB.A0L(A0L, r1, this, r1.A5A);
            this.A01 = C72463Mc.A0i(r1);
            this.A02 = AnonymousClass3MY.A0e(r1);
            this.A00 = AnonymousClass3MY.A0Z(A0L);
        }
    }

    public CustomRegistrationBlockActivity(int i) {
        this.A0A = false;
        C91034f2.A00(this, 5);
    }
}
