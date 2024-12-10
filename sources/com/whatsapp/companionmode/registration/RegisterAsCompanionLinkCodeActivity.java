package com.whatsapp.companionmode.registration;

import X.A15;
import X.A9B;
import X.AnonymousClass000;
import X.AnonymousClass00H;
import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass118;
import X.AnonymousClass1FB;
import X.AnonymousClass1FY;
import X.AnonymousClass1LU;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3MY;
import X.AnonymousClass3MZ;
import X.AnonymousClass3Ma;
import X.AnonymousClass4aX;
import X.AnonymousClass6UT;
import X.AnonymousClass79Z;
import X.C000200d;
import X.C108955ca;
import X.C109005cf;
import X.C109695dr;
import X.C116395xC;
import X.C17880vN;
import X.C18070vi;
import X.C26264Cw9;
import X.C26721Tf;
import X.C72813Np;
import android.os.Bundle;
import android.text.Html;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.method.LinkMovementMethod;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.whatsapp.WaTextView;
import java.util.ArrayList;

public final class RegisterAsCompanionLinkCodeActivity extends AnonymousClass1FY {
    public LinearLayout A00;
    public ProgressBar A01;
    public C26721Tf A02;
    public AnonymousClass118 A03;
    public AnonymousClass1LU A04;
    public A15 A05;
    public AnonymousClass00H A06;
    public String A07;
    public String A08;
    public String A09;
    public boolean A0A;
    public final ArrayList A0B;
    public final AnonymousClass6UT A0C;

    public void onSaveInstanceState(Bundle bundle) {
        C18070vi.A0d(bundle, 0);
        super.onSaveInstanceState(bundle);
        bundle.putString("link_code", this.A08);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x004c, code lost:
        if (r3 < 4) goto L_0x0028;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A03(com.whatsapp.companionmode.registration.RegisterAsCompanionLinkCodeActivity r6, java.lang.String r7) {
        /*
            r6.A08 = r7
            android.widget.ProgressBar r0 = r6.A01
            if (r0 != 0) goto L_0x000d
            java.lang.String r0 = "loadingSpinner"
            X.C18070vi.A11(r0)
        L_0x000b:
            r0 = 0
            throw r0
        L_0x000d:
            r5 = 4
            r0.setVisibility(r5)
            android.widget.LinearLayout r0 = r6.A00
            java.lang.String r4 = "codeInputBoxesLinearLayout"
            if (r0 == 0) goto L_0x0063
            r3 = 0
            r0.setVisibility(r3)
            int r1 = r7.length()
            r0 = 8
            boolean r0 = X.AnonymousClass000.A1T(r1, r0)
            X.C17960vV.A0C(r0)
        L_0x0028:
            java.util.ArrayList r2 = r6.A0B
            java.lang.Object r1 = r2.get(r3)
            android.widget.TextView r1 = (android.widget.TextView) r1
            char r0 = r7.charAt(r3)
        L_0x0034:
            java.lang.String r0 = java.lang.String.valueOf(r0)
        L_0x0038:
            r1.setText(r0)
            int r3 = r3 + 1
            r0 = 9
            if (r3 >= r0) goto L_0x005b
            if (r3 != r5) goto L_0x004c
            java.lang.Object r1 = r2.get(r3)
            android.widget.TextView r1 = (android.widget.TextView) r1
            java.lang.String r0 = "-"
            goto L_0x0038
        L_0x004c:
            if (r3 < r5) goto L_0x0028
            java.lang.Object r1 = r2.get(r3)
            android.widget.TextView r1 = (android.widget.TextView) r1
            int r0 = r3 + -1
            char r0 = r7.charAt(r0)
            goto L_0x0034
        L_0x005b:
            android.widget.LinearLayout r0 = r6.A00
            if (r0 == 0) goto L_0x0063
            r0.setContentDescription(r7)
            return
        L_0x0063:
            X.C18070vi.A11(r4)
            goto L_0x000b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.companionmode.registration.RegisterAsCompanionLinkCodeActivity.A03(com.whatsapp.companionmode.registration.RegisterAsCompanionLinkCodeActivity, java.lang.String):void");
    }

    public void A2y() {
        if (!this.A0A) {
            this.A0A = true;
            AnonymousClass10E A0A2 = C109005cf.A0A(C108955ca.A0K(this), this);
            AnonymousClass1FB.A0M(A0A2, this);
            AnonymousClass10G r1 = A0A2.A00;
            C109005cf.A0c(A0A2, r1, r1, this);
            C109005cf.A0e(A0A2, r1, this, r1.A5A);
            this.A06 = C000200d.A00(A0A2.A08);
            this.A05 = (A15) A0A2.AHu.get();
            this.A02 = (C26721Tf) A0A2.A2V.get();
            this.A03 = AnonymousClass3MZ.A0l(A0A2);
            this.A04 = AnonymousClass3MY.A0Z(A0A2);
        }
    }

    public void onBackPressed() {
        C26721Tf r0 = this.A02;
        if (r0 != null) {
            C26721Tf.A00(r0).A04();
            super.onBackPressed();
            return;
        }
        C18070vi.A11("companionRegistrationManager");
        throw null;
    }

    public RegisterAsCompanionLinkCodeActivity(int i) {
        this.A0A = false;
        AnonymousClass79Z.A00(this, 33);
    }

    public void onCreate(Bundle bundle) {
        String str;
        String string;
        super.onCreate(bundle);
        this.A0E = false;
        setContentView(2131626703);
        this.A01 = (ProgressBar) AnonymousClass3MY.A0H(this, 2131432171);
        this.A00 = (LinearLayout) C18070vi.A05(this.A00, 2131432011);
        int i = 0;
        while (true) {
            WaTextView waTextView = new WaTextView(new ContextThemeWrapper(this, 2132083408));
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, getResources().getDimensionPixelSize(2131166026));
            int dimensionPixelSize = getResources().getDimensionPixelSize(2131166027);
            layoutParams.setMargins(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
            layoutParams.weight = 1.0f;
            layoutParams.gravity = 17;
            waTextView.setLayoutParams(layoutParams);
            this.A0B.add(waTextView);
            LinearLayout linearLayout = this.A00;
            if (linearLayout == null) {
                str = "codeInputBoxesLinearLayout";
                break;
            }
            linearLayout.addView(waTextView);
            i++;
            if (i >= 9) {
                TextView A0L = AnonymousClass3MX.A0L(this, 2131429305);
                Spanned fromHtml = Html.fromHtml(getString(2131888669));
                C18070vi.A0X(fromHtml);
                SpannableStringBuilder A022 = C72813Np.A02(A0L.getPaint(), AnonymousClass4aX.A08(AnonymousClass3MX.A06(this, 2131232023), AnonymousClass3Ma.A00(this, 2130970831, 2131102246)), fromHtml, "[settings_icon]");
                A0L.setText(C72813Np.A02(A0L.getPaint(), AnonymousClass4aX.A08(AnonymousClass3MX.A06(this, 2131231005), AnonymousClass3Ma.A00(this, 2130970831, 2131102246)), A022, "[overflow_menu_icon]"));
                AnonymousClass3MY.A1X(getString(2131888667), AnonymousClass3MX.A0L(this, 2131429304));
                AnonymousClass3MY.A1X(getString(2131888652), AnonymousClass3MX.A0L(this, 2131429302));
                TextView A0L2 = AnonymousClass3MX.A0L(this, 2131429301);
                A0L2.setText(2131888651);
                A0L2.setVisibility(0);
                AnonymousClass3MX.A1H(this, 2131432064, 0);
                if (AnonymousClass3MW.A1Z(this.A00)) {
                    View findViewById = findViewById(2131432063);
                    C18070vi.A0z(findViewById, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout");
                    ConstraintLayout constraintLayout = (ConstraintLayout) findViewById;
                    C26264Cw9 cw9 = new C26264Cw9();
                    cw9.A0C(constraintLayout);
                    cw9.A08(2131429303);
                    cw9.A08(2131429305);
                    cw9.A08(2131429304);
                    cw9.A08(2131429302);
                    cw9.A0A(constraintLayout);
                }
                String stringExtra = getIntent().getStringExtra("country_code");
                String stringExtra2 = getIntent().getStringExtra("phone_number");
                if (stringExtra == null || stringExtra2 == null) {
                    throw AnonymousClass000.A0s("RegisterAsCompanionLinkCodeActivity/setupNumberPreview/cc or pn is null");
                }
                this.A07 = stringExtra;
                this.A09 = stringExtra2;
                TextView A0L3 = AnonymousClass3MX.A0L(this, 2131429306);
                String A0F = C18070vi.A0F(this, 2131888658);
                Object[] A1b = AnonymousClass3MW.A1b();
                String str2 = this.A07;
                if (str2 == null) {
                    str = "cc";
                } else {
                    String str3 = this.A09;
                    if (str3 == null) {
                        str = "pn";
                    } else {
                        A1b[0] = A9B.A0H(str2, str3);
                        Spanned fromHtml2 = Html.fromHtml(C17880vN.A0q(this, A0F, A1b, 1, 2131888659));
                        C18070vi.A0X(fromHtml2);
                        SpannableStringBuilder A092 = AnonymousClass3MW.A09(fromHtml2);
                        A092.setSpan(new C109695dr(this, 0), (fromHtml2.length() - A0F.length()) - 1, fromHtml2.length() - 1, 33);
                        A0L3.setText(A092);
                        A0L3.setLinksClickable(true);
                        A0L3.setMovementMethod(LinkMovementMethod.getInstance());
                        if (!(bundle == null || (string = bundle.getString("link_code")) == null)) {
                            A03(this, string);
                        }
                        A15 a15 = this.A05;
                        if (a15 != null) {
                            a15.A00.set("register_as_companion_link_code");
                            C26721Tf r0 = this.A02;
                            if (r0 != null) {
                                C26721Tf.A00(r0).A07(this.A0C);
                                return;
                            }
                            str = "companionRegistrationManager";
                        } else {
                            str = "companionPreRegLogger";
                        }
                    }
                }
            }
        }
        C18070vi.A11(str);
        throw null;
    }

    public void onDestroy() {
        super.onDestroy();
        C26721Tf r0 = this.A02;
        if (r0 != null) {
            C26721Tf.A00(r0).A08(this.A0C);
            return;
        }
        C18070vi.A11("companionRegistrationManager");
        throw null;
    }

    public RegisterAsCompanionLinkCodeActivity() {
        this(0);
        this.A0B = AnonymousClass000.A13();
        this.A0C = new C116395xC(this, 2);
    }
}
