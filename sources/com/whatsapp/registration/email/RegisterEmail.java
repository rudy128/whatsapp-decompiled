package com.whatsapp.registration.email;

import X.A9B;
import X.AnonymousClass000;
import X.AnonymousClass00H;
import X.AnonymousClass039;
import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass19D;
import X.AnonymousClass1DF;
import X.AnonymousClass1FB;
import X.AnonymousClass1HF;
import X.AnonymousClass1K1;
import X.AnonymousClass1LU;
import X.AnonymousClass3MW;
import X.AnonymousClass3MZ;
import X.AnonymousClass3Ma;
import X.AnonymousClass4HQ;
import X.AnonymousClass4a6;
import X.AnonymousClass5LM;
import X.AnonymousClass5LN;
import X.AnonymousClass5LO;
import X.AnonymousClass5LP;
import X.AnonymousClass5P7;
import X.AnonymousClass5U5;
import X.AnonymousClass5U6;
import X.AnonymousClass781;
import X.C000200d;
import X.C161528Fl;
import X.C166908eI;
import X.C17880vN;
import X.C18020vd;
import X.C18040vf;
import X.C18070vi;
import X.C18100vl;
import X.C18460wS;
import X.C19880zA;
import X.C19890zB;
import X.C28931bI;
import X.C33641j9;
import X.C57352iw;
import X.C58712l8;
import X.C72453Mb;
import X.C72463Mc;
import X.C72473Md;
import X.C72483Me;
import X.C73203Rj;
import X.C89554ce;
import X.C91034f2;
import X.C91634g0;
import X.C99274sY;
import android.app.Dialog;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import com.whatsapp.WaEditText;
import com.whatsapp.WaTextView;
import com.whatsapp.util.Log;
import com.whatsapp.wds.components.button.WDSButton;
import java.util.List;

public final class RegisterEmail extends C166908eI {
    public int A00;
    public C19880zA A01;
    public WaEditText A02;
    public AnonymousClass19D A03;
    public C33641j9 A04;
    public C57352iw A05;
    public C28931bI A06;
    public WDSButton A07;
    public WDSButton A08;
    public AnonymousClass00H A09;
    public AnonymousClass00H A0A;
    public AnonymousClass00H A0B;
    public AnonymousClass00H A0C;
    public AnonymousClass00H A0D;
    public AnonymousClass00H A0E;
    public AnonymousClass00H A0F;
    public String A0G;
    public List A0H;
    public boolean A0I;
    public WaTextView A0J;
    public WaTextView A0K;
    public String A0L;
    public String A0M;
    public boolean A0N;
    public boolean A0O;
    public final C18100vl A0P;
    public final C18100vl A0Q;

    public static /* synthetic */ void $r8$lambda$1kOoTniba27KWjmziU4ZN_HWiUk(View view) {
    }

    public RegisterEmail() {
        this(0);
        this.A0Q = AnonymousClass1DF.A01(new AnonymousClass5LN(this));
        this.A0P = C99274sY.A00(new AnonymousClass5LP(this), new AnonymousClass5LO(this), new AnonymousClass5P7(this), AnonymousClass3MW.A15(C161528Fl.class));
        this.A0H = C18460wS.A00;
    }

    public void onCreate(Bundle bundle) {
        String str;
        boolean z;
        String str2;
        super.onCreate(bundle);
        C72463Mc.A0t(this);
        setContentView(2131626705);
        C57352iw r0 = this.A05;
        if (r0 != null) {
            r0.A00(this);
            boolean A2L = this.A0A.A2L();
            View view = this.A00;
            int i = 2131436208;
            if (A2L) {
                i = 2131436252;
            }
            View A062 = AnonymousClass1HF.A06(view, i);
            C18070vi.A0b(A062);
            View inflate = ((ViewStub) A062).inflate();
            C18070vi.A0z(inflate, "null cannot be cast to non-null type com.whatsapp.WaTextView");
            WaTextView waTextView = (WaTextView) inflate;
            this.A0K = waTextView;
            String str3 = "title";
            if (waTextView != null) {
                waTextView.setText(2131889687);
                this.A0J = AnonymousClass3Ma.A0N(this.A00, 2131434447);
                this.A07 = (WDSButton) C18070vi.A05(this.A00, 2131434449);
                this.A02 = (WaEditText) C18070vi.A05(this.A00, 2131434450);
                this.A08 = (WDSButton) C18070vi.A05(this.A00, 2131434448);
                this.A06 = C28931bI.A00(this.A00, 2131431778);
                int i2 = 2131436280;
                if (this.A0A.A2L()) {
                    i2 = 2131436281;
                }
                AnonymousClass19D r02 = this.A03;
                if (r02 != null) {
                    A9B.A0T(this, r02, i2);
                    WDSButton wDSButton = this.A07;
                    if (wDSButton == null) {
                        str = "nextButton";
                    } else {
                        AnonymousClass3MZ.A1L(wDSButton, this, 21);
                        if (!A9B.A0V(getResources())) {
                            WaEditText waEditText = this.A02;
                            if (waEditText != null) {
                                waEditText.A0I(false);
                            }
                            C18070vi.A11("emailInput");
                            throw null;
                        }
                        WaEditText waEditText2 = this.A02;
                        if (waEditText2 != null) {
                            C89554ce.A00(waEditText2, this, 5);
                            WDSButton wDSButton2 = this.A08;
                            if (wDSButton2 == null) {
                                str = "notNowButton";
                            } else {
                                AnonymousClass3MZ.A1L(wDSButton2, this, 20);
                                AnonymousClass19D r1 = this.A03;
                                if (r1 != null) {
                                    C18040vf r2 = C18040vf.A02;
                                    boolean A052 = C18020vd.A05(r2, r1, 10206);
                                    if (A052) {
                                        WDSButton wDSButton3 = this.A08;
                                        if (wDSButton3 == null) {
                                            C18070vi.A11("notNowButton");
                                            throw null;
                                        }
                                        wDSButton3.setVisibility(8);
                                        WaTextView waTextView2 = this.A0K;
                                        if (waTextView2 != null) {
                                            waTextView2.setText(2131889652);
                                            if (!this.A0A.A2L()) {
                                                WaTextView waTextView3 = this.A0K;
                                                if (waTextView3 != null) {
                                                    ViewGroup.LayoutParams layoutParams = waTextView3.getLayoutParams();
                                                    C18070vi.A0z(layoutParams, "null cannot be cast to non-null type androidx.appcompat.widget.Toolbar.LayoutParams");
                                                    AnonymousClass039 r12 = (AnonymousClass039) layoutParams;
                                                    r12.A00 = 3;
                                                    WaTextView waTextView4 = this.A0K;
                                                    if (waTextView4 != null) {
                                                        waTextView4.setLayoutParams(r12);
                                                    }
                                                }
                                            }
                                            WaTextView waTextView5 = this.A0J;
                                            if (waTextView5 == null) {
                                                str3 = "description";
                                            } else {
                                                waTextView5.setText(2131886476);
                                            }
                                        }
                                    }
                                    AnonymousClass00H r03 = this.A09;
                                    if (r03 != null) {
                                        this.A0O = C17880vN.A0I(r03).A0J(false);
                                        this.A00 = getIntent().getIntExtra("entrypoint", 0);
                                        this.A0G = C72453Mb.A0v(this);
                                        boolean booleanExtra = getIntent().getBooleanExtra("challenge_flow", false);
                                        this.A0I = booleanExtra;
                                        View view2 = this.A00;
                                        if (this.A0O || (A052 && !booleanExtra)) {
                                            z = true;
                                        } else {
                                            z = false;
                                        }
                                        A9B.A0Q(view2, this, 2131434451, false, false, z);
                                        String A0l = this.A0A.A0l();
                                        C18070vi.A0X(A0l);
                                        this.A0L = A0l;
                                        String A0n = this.A0A.A0n();
                                        C18070vi.A0X(A0n);
                                        this.A0M = A0n;
                                        C72463Mc.A0b(this).A00(this.A0G, (String) null, this.A00, 1, 8, 3);
                                        if (C72453Mb.A1a(this.A0Q)) {
                                            C19880zA r04 = this.A01;
                                            if (r04 != null) {
                                                r04.A03();
                                                throw AnonymousClass000.A0s("logOnboardingViewEvent");
                                            } else {
                                                C18070vi.A11("smbOnboardingAnalyticsManager");
                                                throw null;
                                            }
                                        } else {
                                            if (this.A0I) {
                                                WDSButton wDSButton4 = this.A08;
                                                if (wDSButton4 == null) {
                                                    str2 = "notNowButton";
                                                } else {
                                                    wDSButton4.setVisibility(8);
                                                    WDSButton wDSButton5 = this.A07;
                                                    if (wDSButton5 == null) {
                                                        str2 = "nextButton";
                                                    } else {
                                                        wDSButton5.setOnClickListener(new AnonymousClass781(8));
                                                    }
                                                }
                                                C18070vi.A11(str2);
                                                throw null;
                                            }
                                            C18100vl r4 = this.A0P;
                                            C91634g0.A00(this, ((C161528Fl) r4.getValue()).A00, new AnonymousClass5U5(this), 24);
                                            AnonymousClass19D r13 = this.A03;
                                            if (r13 != null) {
                                                int A002 = C18020vd.A00(r2, r13, 12536);
                                                if (A002 > 0 && !C72453Mb.A0M(this).getBoolean("pref_email_hints_shown", false)) {
                                                    ((C161528Fl) r4.getValue()).A0T(this, A002);
                                                    return;
                                                }
                                                return;
                                            }
                                            C18070vi.A11("abPreChatdProps");
                                            throw null;
                                        }
                                    } else {
                                        str = "accountSwitcher";
                                    }
                                }
                            }
                        }
                        C18070vi.A11("emailInput");
                        throw null;
                    }
                }
                str = "abPreChatdProps";
            }
            C18070vi.A11(str3);
            throw null;
        }
        str = "landscapeModeBacktest";
        C18070vi.A11(str);
        throw null;
    }

    public Dialog onCreateDialog(int i) {
        C73203Rj r1;
        int i2;
        C73203Rj A002;
        int i3;
        String str;
        if (i != 1) {
            int i4 = 2;
            if (i == 2) {
                r1 = C73203Rj.A02(this);
                i3 = 2131899286;
            } else if (i == 3) {
                WaEditText waEditText = this.A02;
                if (waEditText == null) {
                    str = "emailInput";
                } else {
                    waEditText.setEnabled(false);
                    WDSButton wDSButton = this.A07;
                    if (wDSButton == null) {
                        str = "nextButton";
                    } else {
                        wDSButton.setEnabled(false);
                        r1 = C73203Rj.A01(this);
                        i3 = 2131899286;
                        i4 = 1;
                    }
                }
                C18070vi.A11(str);
                throw null;
            } else if (i != 4) {
                if (i == 5) {
                    AnonymousClass4HQ.A00(this, this.A0H, new AnonymousClass5LM(this), new AnonymousClass5U6(this)).show();
                }
                return super.onCreateDialog(i);
            } else {
                A002 = AnonymousClass4a6.A00(this);
                i2 = 2131889717;
            }
            C73203Rj.A0B(r1, this, i4, i3);
            return r1.create();
        }
        A002 = AnonymousClass4a6.A00(this);
        i2 = 2131889674;
        r1.A0D(i2);
        r1.A0T(false);
        return r1.create();
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        C18070vi.A0d(menu, 0);
        menu.add(0, 1, 0, 2131895081);
        return super.onCreateOptionsMenu(menu);
    }

    public void A2y() {
        if (!this.A0N) {
            this.A0N = true;
            AnonymousClass1K1 A0K2 = C72473Md.A0K(this);
            AnonymousClass10E r1 = A0K2.AAQ;
            C72483Me.A0q(r1, this);
            AnonymousClass10G r3 = r1.A00;
            AnonymousClass1FB.A0K(r1, r3, this, r3.A45);
            AnonymousClass1FB.A0L(r1, r3, this, r3.A5A);
            this.A00 = AnonymousClass1K1.A1f(A0K2);
            this.A03 = C72463Mc.A0e(r1);
            this.A09 = C000200d.A00(r1.A08);
            this.A0A = C000200d.A00(A0K2.A07);
            this.A0B = C000200d.A00(r3.A9X);
            this.A0C = C000200d.A00(r1.AKr);
            this.A05 = C72463Mc.A0i(r3);
            this.A0D = AnonymousClass3MZ.A14(r1);
            this.A0E = C000200d.A00(A0K2.A5g);
            this.A01 = C19890zB.A00;
            this.A04 = (C33641j9) r1.Am6.get();
            this.A0F = AnonymousClass3MW.A0s(r1);
        }
    }

    public final AnonymousClass00H A4e() {
        AnonymousClass00H r0 = this.A0B;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("emailVerificationLogger");
        throw null;
    }

    public void onBackPressed() {
        if (this.A0O) {
            Log.i("RegisterEmail/onBackPressed/is adding new account");
            A9B.A0J(this, this.A0A, this.A0B);
            return;
        }
        AnonymousClass19D r2 = this.A03;
        if (r2 == null) {
            C18070vi.A11("abPreChatdProps");
            throw null;
        } else if (C18020vd.A05(C18040vf.A02, r2, 10206)) {
            Log.i("RegisterEmail/onBackPressed/skip add email");
            C72463Mc.A0b(this).A00(this.A0G, (String) null, this.A00, 1, 3, 3);
            finish();
        }
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        String str;
        int A0B2 = C72453Mb.A0B(menuItem);
        if (A0B2 == 1) {
            AnonymousClass00H r0 = this.A0E;
            if (r0 != null) {
                C58712l8 r3 = (C58712l8) r0.get();
                C33641j9 r2 = this.A04;
                if (r2 != null) {
                    StringBuilder A10 = AnonymousClass000.A10();
                    A10.append("register-email +");
                    String str2 = this.A0L;
                    if (str2 == null) {
                        str = "countryCode";
                    } else {
                        A10.append(str2);
                        String str3 = this.A0M;
                        if (str3 == null) {
                            str = "phoneNumber";
                        } else {
                            r3.A01(this, r2, AnonymousClass000.A0y(str3, A10));
                        }
                    }
                } else {
                    str = "verificationFlowState";
                }
            } else {
                str = "registrationHelper";
            }
            C18070vi.A11(str);
            throw null;
        } else if (A0B2 == 2) {
            AnonymousClass00H r02 = this.A0F;
            if (r02 != null) {
                r02.get();
                startActivity(AnonymousClass1LU.A01(this));
                finishAffinity();
                return true;
            }
            str = "waIntents";
            C18070vi.A11(str);
            throw null;
        }
        return super.onOptionsItemSelected(menuItem);
    }

    public RegisterEmail(int i) {
        this.A0N = false;
        C91034f2.A00(this, 2);
    }
}
