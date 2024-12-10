package com.whatsapp.payments.ui.mapper.register;

import X.AFR;
import X.AGA;
import X.AGE;
import X.AXS;
import X.AYS;
import X.AZ6;
import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass1FY;
import X.AnonymousClass1YE;
import X.AnonymousClass3MW;
import X.AnonymousClass3MY;
import X.AnonymousClass3MZ;
import X.AnonymousClass3Ma;
import X.AnonymousClass8BR;
import X.AnonymousClass8BS;
import X.AnonymousClass8BU;
import X.AnonymousClass8BW;
import X.AnonymousClass8BX;
import X.AnonymousClass93x;
import X.AnonymousClass9AL;
import X.AnonymousClass9R2;
import X.C108965cb;
import X.C137116uw;
import X.C175798zI;
import X.C18070vi;
import X.C20330AGm;
import X.C20752AXh;
import X.C63662tU;
import X.C63932tv;
import X.C72663Na;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.SpannableString;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.textfield.TextInputLayout;
import com.whatsapp.CircularProgressBar;
import com.whatsapp.WaEditText;
import com.whatsapp.wds.components.button.WDSButton;
import java.util.Iterator;

public final class IndiaUpiCreateCustomNumberActivity extends AnonymousClass1FY {
    public LinearLayout A00;
    public TextInputLayout A01;
    public CircularProgressBar A02;
    public WaEditText A03;
    public C20752AXh A04;
    public AZ6 A05;
    public WDSButton A06;
    public IndiaUpiMapperLinkViewModel A07;
    public boolean A08;

    public static final void A03(IndiaUpiCreateCustomNumberActivity indiaUpiCreateCustomNumberActivity) {
        WaEditText waEditText = indiaUpiCreateCustomNumberActivity.A03;
        if (waEditText != null) {
            String A17 = AnonymousClass3MZ.A17(waEditText);
            IndiaUpiMapperLinkViewModel indiaUpiMapperLinkViewModel = indiaUpiCreateCustomNumberActivity.A07;
            if (indiaUpiMapperLinkViewModel != null) {
                C18070vi.A0d(A17, 0);
                String str = null;
                if (AnonymousClass1YE.A0A(A17, "0", false)) {
                    str = indiaUpiMapperLinkViewModel.A08;
                } else {
                    int length = A17.length();
                    if (length < 8 || length > 9) {
                        str = indiaUpiMapperLinkViewModel.A07;
                    } else {
                        int i = length - 2;
                        if (A17.charAt(length - 1) == A17.charAt(i) && A17.charAt(i) == A17.charAt(length - 3)) {
                            str = indiaUpiMapperLinkViewModel.A06;
                        }
                    }
                }
                if (str == null) {
                    TextInputLayout textInputLayout = indiaUpiCreateCustomNumberActivity.A01;
                    if (textInputLayout != null) {
                        textInputLayout.setErrorEnabled(false);
                        LinearLayout linearLayout = indiaUpiCreateCustomNumberActivity.A00;
                        if (linearLayout != null) {
                            linearLayout.setVisibility(0);
                            IndiaUpiMapperLinkViewModel indiaUpiMapperLinkViewModel2 = indiaUpiCreateCustomNumberActivity.A07;
                            if (indiaUpiMapperLinkViewModel2 != null) {
                                indiaUpiMapperLinkViewModel2.A05.A0E(AnonymousClass93x.A00);
                                C175798zI r5 = indiaUpiMapperLinkViewModel2.A03;
                                AXS axs = indiaUpiMapperLinkViewModel2.A00;
                                String A0J = axs.A0J();
                                if (A0J == null) {
                                    A0J = "";
                                }
                                r5.A01(axs.A0D(), AnonymousClass8BR.A0Y(AnonymousClass8BR.A0Z(), String.class, A17, "upiAlias"), new AYS(indiaUpiMapperLinkViewModel2, 0), A0J, "numeric_id", "add");
                                return;
                            }
                        }
                        C18070vi.A11("customNumberBulletRulesContainer");
                        throw null;
                    }
                } else {
                    LinearLayout linearLayout2 = indiaUpiCreateCustomNumberActivity.A00;
                    if (linearLayout2 != null) {
                        linearLayout2.setVisibility(8);
                        TextInputLayout textInputLayout2 = indiaUpiCreateCustomNumberActivity.A01;
                        if (textInputLayout2 != null) {
                            textInputLayout2.setError(str);
                            WaEditText waEditText2 = indiaUpiCreateCustomNumberActivity.A03;
                            if (waEditText2 != null) {
                                waEditText2.requestFocus();
                                return;
                            }
                        }
                    }
                    C18070vi.A11("customNumberBulletRulesContainer");
                    throw null;
                }
                C18070vi.A11("enterCustomNumberTextInputLayout");
                throw null;
            }
            C18070vi.A11("indiaUpiNumberMapperLinkViewModel");
            throw null;
        }
        C18070vi.A11("customNumberEditText");
        throw null;
    }

    public static final void A0Q(IndiaUpiCreateCustomNumberActivity indiaUpiCreateCustomNumberActivity) {
        String str;
        CircularProgressBar circularProgressBar = indiaUpiCreateCustomNumberActivity.A02;
        if (circularProgressBar == null) {
            str = "progressBar";
        } else {
            circularProgressBar.setVisibility(8);
            WDSButton wDSButton = indiaUpiCreateCustomNumberActivity.A06;
            if (wDSButton == null) {
                str = "continueButton";
            } else {
                wDSButton.setText(2131887451);
                return;
            }
        }
        C18070vi.A11(str);
        throw null;
    }

    public void A2y() {
        if (!this.A08) {
            this.A08 = true;
            AnonymousClass10E r2 = C137116uw.A00(this).AAQ;
            C63932tv.A02(r2, this);
            AnonymousClass10G r1 = r2.A00;
            C63932tv.A00(r2, r1, r1, this);
            C63662tU.A00(r2, r1, this, r1.A5A);
            this.A05 = AnonymousClass8BU.A0T(r2);
            this.A04 = AnonymousClass8BU.A0M(r1);
        }
    }

    public void onBackPressed() {
        AZ6 az6 = this.A05;
        if (az6 != null) {
            az6.BiL(1, "create_numeric_upi_alias", AnonymousClass8BX.A0Y(this), 1);
            super.onBackPressed();
            return;
        }
        C18070vi.A11("fieldStatsLogger");
        throw null;
    }

    public IndiaUpiCreateCustomNumberActivity(int i) {
        this.A08 = false;
        AGE.A00(this, 7);
    }

    public void onCreate(Bundle bundle) {
        String str;
        String str2;
        super.onCreate(bundle);
        AZ6 az6 = this.A05;
        if (az6 != null) {
            Intent intent = getIntent();
            if (intent != null) {
                str2 = intent.getStringExtra("extra_referral_screen");
            } else {
                str2 = null;
            }
            az6.BiL((Integer) null, "create_numeric_upi_alias", str2, 0);
            AnonymousClass8BX.A0u(this);
            setContentView(2131625634);
            AnonymousClass9R2.A00(this, 2131232758);
            Parcelable parcelableExtra = getIntent().getParcelableExtra("extra_payment_name");
            this.A06 = (WDSButton) AnonymousClass3MY.A0H(this, 2131429755);
            this.A02 = (CircularProgressBar) AnonymousClass3MY.A0H(this, 2131434181);
            this.A03 = (WaEditText) AnonymousClass3MY.A0H(this, 2131430481);
            this.A01 = (TextInputLayout) AnonymousClass3MY.A0H(this, 2131429761);
            this.A00 = (LinearLayout) AnonymousClass3MY.A0H(this, 2131429754);
            A0Q(this);
            SpannableString A09 = AnonymousClass8BU.A09(this, 2131897443);
            SpannableString A092 = AnonymousClass8BU.A09(this, 2131897444);
            SpannableString A093 = AnonymousClass8BU.A09(this, 2131897445);
            SpannableString[] spannableStringArr = new SpannableString[3];
            AnonymousClass8BS.A1B(A09, A092, spannableStringArr);
            Iterator it = C18070vi.A0O(A093, spannableStringArr, 2).iterator();
            while (true) {
                if (it.hasNext()) {
                    SpannableString spannableString = (SpannableString) it.next();
                    spannableString.setSpan(new C72663Na(AnonymousClass3MW.A01(getResources(), 2131168236)), 0, spannableString.length(), 0);
                    TextView textView = new TextView(this);
                    textView.setText(spannableString);
                    AnonymousClass8BW.A0z(textView.getContext(), textView.getResources(), textView, 2130971113, 2131102439);
                    textView.setTextSize(0, (float) textView.getResources().getDimensionPixelSize(2131169436));
                    textView.setPadding(textView.getResources().getDimensionPixelSize(2131168242), 0, AnonymousClass3Ma.A02(textView, 2131168242), 0);
                    LinearLayout linearLayout = this.A00;
                    if (linearLayout == null) {
                        str = "customNumberBulletRulesContainer";
                        break;
                    }
                    linearLayout.addView(textView);
                } else {
                    AnonymousClass9AL r1 = new AnonymousClass9AL(this, 9);
                    WaEditText waEditText = this.A03;
                    str = "customNumberEditText";
                    if (waEditText != null) {
                        waEditText.addTextChangedListener(r1);
                        WaEditText waEditText2 = this.A03;
                        if (waEditText2 != null) {
                            waEditText2.setOnEditorActionListener(new AGA(this, 2));
                            IndiaUpiMapperLinkViewModel indiaUpiMapperLinkViewModel = (IndiaUpiMapperLinkViewModel) AnonymousClass3MW.A0N(this).A00(IndiaUpiMapperLinkViewModel.class);
                            this.A07 = indiaUpiMapperLinkViewModel;
                            if (indiaUpiMapperLinkViewModel == null) {
                                str = "indiaUpiNumberMapperLinkViewModel";
                            } else {
                                indiaUpiMapperLinkViewModel.A05.A0A(this, new C20330AGm(parcelableExtra, this, 4));
                                WDSButton wDSButton = this.A06;
                                if (wDSButton == null) {
                                    str = "continueButton";
                                } else {
                                    AFR.A00(wDSButton, this, 0);
                                    onConfigurationChanged(C108965cb.A03(this));
                                    return;
                                }
                            }
                        }
                    }
                }
            }
        } else {
            str = "fieldStatsLogger";
        }
        C18070vi.A11(str);
        throw null;
    }

    public IndiaUpiCreateCustomNumberActivity() {
        this(0);
    }
}
