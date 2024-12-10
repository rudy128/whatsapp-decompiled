package com.whatsapp.companionmode.registration;

import X.A15;
import X.A8V;
import X.A9B;
import X.AnonymousClass000;
import X.AnonymousClass00H;
import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass1FB;
import X.AnonymousClass1K1;
import X.AnonymousClass1LU;
import X.AnonymousClass1VJ;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3MY;
import X.AnonymousClass3Ma;
import X.AnonymousClass4a6;
import X.AnonymousClass4aX;
import X.AnonymousClass6W4;
import X.AnonymousClass757;
import X.AnonymousClass79C;
import X.AnonymousClass79Z;
import X.AnonymousClass7AN;
import X.C000200d;
import X.C108955ca;
import X.C108995ce;
import X.C109005cf;
import X.C134036pu;
import X.C166908eI;
import X.C17890vO;
import X.C18070vi;
import X.C19880zA;
import X.C19890zB;
import X.C24261Jm;
import X.C26264Cw9;
import X.C29491cN;
import X.C33841jT;
import X.C72453Mb;
import X.C72473Md;
import X.C72813Np;
import X.C73203Rj;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.Html;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.whatsapp.QrImageView;
import com.whatsapp.wds.components.topbar.WDSToolbar;

public final class RegisterAsCompanionActivity extends C166908eI {
    public LinearLayout A00;
    public ProgressBar A01;
    public C19880zA A02;
    public QrImageView A03;
    public AnonymousClass1VJ A04;
    public CompanionRegistrationViewModel A05;
    public C134036pu A06;
    public AnonymousClass1LU A07;
    public C33841jT A08;
    public A15 A09;
    public AnonymousClass00H A0A;
    public AnonymousClass00H A0B;
    public AnonymousClass00H A0C;
    public AnonymousClass00H A0D;
    public boolean A0E;

    public boolean onCreateOptionsMenu(Menu menu) {
        C18070vi.A0d(menu, 0);
        if (!C108995ce.A1W(this)) {
            menu.add(0, 0, 0, 2131895081);
        } else {
            menu.add(0, 2, 0, 2131895079);
        }
        menu.add(0, 1, 0, 2131896666);
        return super.onCreateOptionsMenu(menu);
    }

    private final void A03() {
        String str;
        String str2;
        C33841jT r1 = this.A08;
        if (r1 != null) {
            C33841jT.A03(r1, 1, true);
            AnonymousClass00H r0 = this.A0D;
            if (r0 != null) {
                A8V a8v = (A8V) r0.get();
                if (C108995ce.A1W(this)) {
                    str2 = "register_as_companion_phone";
                } else {
                    str2 = "register_as_companion";
                }
                a8v.A0I(str2, "tapped");
                if (this.A07 != null) {
                    startActivity(AnonymousClass1LU.A04(this));
                    return;
                }
                str = "waIntents";
            } else {
                str = "funnelLogger";
            }
        } else {
            str = "registrationManager";
        }
        C18070vi.A11(str);
        throw null;
    }

    public static final void A0Q(RegisterAsCompanionActivity registerAsCompanionActivity) {
        AnonymousClass00H r0 = registerAsCompanionActivity.A0A;
        if (r0 != null) {
            String str = ((C29491cN) r0.get()).A01;
            if (str == null || str.length() == 0) {
                C73203Rj A002 = AnonymousClass4a6.A00(registerAsCompanionActivity);
                A002.A0D(2131888645);
                A002.A0E(2131888646);
                A002.A0T(false);
                A002.A0L(AnonymousClass757.A00(registerAsCompanionActivity, 12), registerAsCompanionActivity.getString(2131899286));
                A002.A0C();
                return;
            }
            AnonymousClass00H r02 = registerAsCompanionActivity.A0A;
            if (r02 != null) {
                AnonymousClass6W4.A00(registerAsCompanionActivity, (C29491cN) C18070vi.A0E(r02), str);
                return;
            }
        }
        C18070vi.A11("accountSwitcher");
        throw null;
    }

    public void A2y() {
        if (!this.A0E) {
            this.A0E = true;
            AnonymousClass1K1 A0K = C108955ca.A0K(this);
            AnonymousClass10E A0A2 = C109005cf.A0A(A0K, this);
            AnonymousClass1FB.A0M(A0A2, this);
            AnonymousClass10G r2 = A0A2.A00;
            C109005cf.A0d(A0A2, r2, this);
            C109005cf.A0e(A0A2, r2, this, r2.A5A);
            this.A00 = AnonymousClass1K1.A1f(A0K);
            this.A0A = C000200d.A00(A0A2.A08);
            this.A0B = C000200d.A00(A0A2.AHp);
            this.A04 = (AnonymousClass1VJ) A0A2.A2W.get();
            this.A0C = AnonymousClass3MX.A10(A0A2);
            this.A06 = (C134036pu) r2.AB8.get();
            this.A0D = C000200d.A00(A0A2.A4U);
            this.A09 = (A15) A0A2.AHu.get();
            this.A08 = (C33841jT) A0A2.A9T.get();
            this.A02 = C19890zB.A00;
            this.A07 = AnonymousClass3MY.A0Z(A0A2);
        }
    }

    public void onCreate(Bundle bundle) {
        View findViewById;
        String str;
        super.onCreate(bundle);
        this.A0E = false;
        ViewGroup viewGroup = (ViewGroup) AnonymousClass3MY.A0H(this, 16908290);
        boolean A1W = C108995ce.A1W(this);
        LayoutInflater layoutInflater = getLayoutInflater();
        int i = 2131626700;
        if (A1W) {
            i = 2131626704;
        }
        layoutInflater.inflate(i, viewGroup);
        CompanionRegistrationViewModel companionRegistrationViewModel = (CompanionRegistrationViewModel) AnonymousClass3MW.A0N(this).A00(CompanionRegistrationViewModel.class);
        this.A05 = companionRegistrationViewModel;
        if (companionRegistrationViewModel != null) {
            AnonymousClass7AN.A00(this, companionRegistrationViewModel.A02, 44);
            CompanionRegistrationViewModel companionRegistrationViewModel2 = this.A05;
            if (companionRegistrationViewModel2 != null) {
                AnonymousClass7AN.A00(this, companionRegistrationViewModel2.A03, 45);
                CompanionRegistrationViewModel companionRegistrationViewModel3 = this.A05;
                if (companionRegistrationViewModel3 != null) {
                    AnonymousClass7AN.A00(this, companionRegistrationViewModel3.A04, 46);
                    if (C108995ce.A1W(this)) {
                        int i2 = 2131429309;
                        if (this.A0A.A2L()) {
                            i2 = 2131429310;
                        }
                        findViewById = ((ViewStub) findViewById(i2)).inflate();
                        C18070vi.A0z(findViewById, "null cannot be cast to non-null type com.whatsapp.WaTextView");
                    } else {
                        findViewById = findViewById(2131436280);
                        C18070vi.A0b(findViewById);
                    }
                    ((TextView) findViewById).setText(2131888671);
                    TextView textView = (TextView) AnonymousClass3MY.A0H(this, 2131429307);
                    int i3 = 2131888656;
                    if (C108995ce.A1W(this)) {
                        i3 = 2131888657;
                    }
                    textView.setText(i3);
                    QrImageView qrImageView = (QrImageView) AnonymousClass3MY.A0H(this, 2131434464);
                    this.A03 = qrImageView;
                    String str2 = "qrCodeView";
                    if (qrImageView != null) {
                        qrImageView.setVisibility(4);
                        QrImageView qrImageView2 = this.A03;
                        if (qrImageView2 != null) {
                            AnonymousClass3MY.A0w(this, qrImageView2, 2131888655);
                            LinearLayout linearLayout = (LinearLayout) AnonymousClass3MY.A0H(this, 2131434470);
                            this.A00 = linearLayout;
                            if (linearLayout == null) {
                                str2 = "reloadQrLayout";
                            } else {
                                linearLayout.setVisibility(4);
                                this.A01 = (ProgressBar) AnonymousClass3MY.A0H(this, 2131432171);
                                ((TextView) AnonymousClass3MY.A0H(this, 2131429303)).setText(2131888664);
                                TextView textView2 = (TextView) AnonymousClass3MY.A0H(this, 2131429305);
                                Spanned fromHtml = Html.fromHtml(getString(2131888669));
                                C18070vi.A0X(fromHtml);
                                Drawable A002 = C24261Jm.A00(this, 2131232023);
                                if (A002 != null) {
                                    SpannableStringBuilder A022 = C72813Np.A02(textView2.getPaint(), AnonymousClass4aX.A08(A002, AnonymousClass3Ma.A00(this, 2130970831, 2131102246)), fromHtml, "[settings_icon]");
                                    Drawable A003 = C24261Jm.A00(this, 2131233368);
                                    if (A003 != null) {
                                        textView2.setText(C72813Np.A02(textView2.getPaint(), AnonymousClass4aX.A08(A003, AnonymousClass3Ma.A00(this, 2130970831, 2131102246)), A022, "[overflow_menu_icon]"));
                                        AnonymousClass3MY.A1X(getString(2131888667), (TextView) AnonymousClass3MY.A0H(this, 2131429304));
                                        if (AnonymousClass3MW.A1Z(this.A00)) {
                                            ConstraintLayout constraintLayout = (ConstraintLayout) AnonymousClass3MY.A0H(this, 2131432063);
                                            C26264Cw9 cw9 = new C26264Cw9();
                                            cw9.A0C(constraintLayout);
                                            cw9.A08(2131429303);
                                            cw9.A08(2131429305);
                                            cw9.A08(2131429304);
                                            cw9.A08(2131429302);
                                            cw9.A0A(constraintLayout);
                                        }
                                        AnonymousClass3Ma.A1B(AnonymousClass3MY.A0H(this, 2131434469), this, 8);
                                        View findViewById2 = findViewById(2131434837);
                                        if (findViewById2 != null) {
                                            WDSToolbar wDSToolbar = (WDSToolbar) AnonymousClass3MY.A0C(this, 2131436246);
                                            ColorDrawable colorDrawable = new ColorDrawable(AnonymousClass3Ma.A01(this, getResources(), 2130970830, 2131102245));
                                            colorDrawable.setAlpha(0);
                                            wDSToolbar.setBackground(colorDrawable);
                                            findViewById2.getViewTreeObserver().addOnScrollChangedListener(new AnonymousClass79C(colorDrawable, findViewById2, wDSToolbar, (int) getTheme().obtainStyledAttributes(new int[]{16843499}).getDimension(0, 0.0f)));
                                        }
                                        if (!"entry_eula".equals(getIntent().getStringExtra("entry_point"))) {
                                            AnonymousClass1VJ r1 = this.A04;
                                            if (r1 != null) {
                                                r1.A01(2);
                                            } else {
                                                str2 = "companionStateHolder";
                                            }
                                        }
                                        A9B.A0Q(viewGroup, this, 2131436246, false, C108995ce.A1W(this), false);
                                        if (A1W) {
                                            str = "register_as_companion_phone";
                                        } else {
                                            str = "register_as_companion";
                                        }
                                        AnonymousClass00H r0 = this.A0D;
                                        if (r0 != null) {
                                            ((A8V) r0.get()).A0D(str);
                                            A15 a15 = this.A09;
                                            if (a15 != null) {
                                                a15.A00.set(str);
                                                A15 a152 = this.A09;
                                                if (a152 != null) {
                                                    a152.A01.set(C17890vO.A0Q());
                                                    CompanionRegistrationViewModel companionRegistrationViewModel4 = this.A05;
                                                    if (companionRegistrationViewModel4 == null) {
                                                        str2 = "viewModel";
                                                    } else {
                                                        companionRegistrationViewModel4.A08.registerObserver(companionRegistrationViewModel4.A07);
                                                        return;
                                                    }
                                                }
                                            }
                                            str2 = "preRegLogger";
                                        } else {
                                            str2 = "funnelLogger";
                                        }
                                    } else {
                                        throw AnonymousClass000.A0n("Required value was null.");
                                    }
                                } else {
                                    throw AnonymousClass000.A0n("Required value was null.");
                                }
                            }
                        }
                    }
                    C18070vi.A11(str2);
                    throw null;
                }
            }
        }
        C18070vi.A11("viewModel");
        throw null;
    }

    public void onDestroy() {
        A15 a15 = this.A09;
        if (a15 != null) {
            a15.A01("cmp_reg_exit");
            super.onDestroy();
            return;
        }
        C18070vi.A11("preRegLogger");
        throw null;
    }

    public RegisterAsCompanionActivity(int i) {
        this.A0E = false;
        AnonymousClass79Z.A00(this, 32);
    }

    public String A4b() {
        return "link_companion";
    }

    public String A4c() {
        return "register_as_companion";
    }

    public void onBackPressed() {
        if ("entry_phone_reg".equals(getIntent().getStringExtra("entry_point")) && C108995ce.A1W(this)) {
            A03();
        } else if (isTaskRoot()) {
            AnonymousClass00H r0 = this.A0A;
            if (r0 != null) {
                if (((C29491cN) r0.get()).A0J(false)) {
                    AnonymousClass00H r02 = this.A0A;
                    if (r02 != null) {
                        ((C29491cN) r02.get()).A0C(this, true);
                    }
                }
            }
            C18070vi.A11("accountSwitcher");
            throw null;
        }
        super.onBackPressed();
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        String str;
        int A0B2 = C72453Mb.A0B(menuItem);
        if (A0B2 == 0) {
            C134036pu r1 = this.A06;
            if (r1 != null) {
                r1.A01(this, "RegisterAsCompanionActivity");
            } else {
                str = "feedbackSendMethods";
                C18070vi.A11(str);
                throw null;
            }
        } else if (A0B2 == 1) {
            if (!C108995ce.A1W(this)) {
                AnonymousClass1VJ r0 = this.A04;
                if (r0 != null) {
                    r0.A01(1);
                } else {
                    str = "companionStateHolder";
                    C18070vi.A11(str);
                    throw null;
                }
            }
            A03();
            finish();
        } else if (A0B2 != 2) {
            if (A0B2 == 16908332) {
                onBackPressed();
                return true;
            }
        } else if (this.A07 != null) {
            startActivity(C72473Md.A0D("https://faq.whatsapp.com/1317564962315842"));
        } else {
            str = "waIntents";
            C18070vi.A11(str);
            throw null;
        }
        return super.onOptionsItemSelected(menuItem);
    }

    public RegisterAsCompanionActivity() {
        this(0);
    }
}
