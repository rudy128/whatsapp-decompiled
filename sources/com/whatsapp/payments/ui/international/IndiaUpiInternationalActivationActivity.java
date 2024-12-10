package com.whatsapp.payments.ui.international;

import X.A7B;
import X.A9J;
import X.AFQ;
import X.AFT;
import X.AGE;
import X.AXS;
import X.AnonymousClass00H;
import X.AnonymousClass00R;
import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass129;
import X.AnonymousClass1DF;
import X.AnonymousClass1K1;
import X.AnonymousClass1QE;
import X.AnonymousClass3MW;
import X.AnonymousClass3MY;
import X.AnonymousClass3Ma;
import X.AnonymousClass8BR;
import X.AnonymousClass8BT;
import X.AnonymousClass8BU;
import X.AnonymousClass8BW;
import X.AnonymousClass8BX;
import X.AnonymousClass8Dv;
import X.AnonymousClass8pN;
import X.AnonymousClass8pS;
import X.AnonymousClass91S;
import X.AnonymousClass91U;
import X.AnonymousClass9R2;
import X.C108975cc;
import X.C137116uw;
import X.C1418477e;
import X.C170278pb;
import X.C17880vN;
import X.C17890vO;
import X.C17960vV;
import X.C18070vi;
import X.C18100vl;
import X.C20080A6g;
import X.C20284AEs;
import X.C20339AGv;
import X.C20752AXh;
import X.C21427Aju;
import X.C21966AvU;
import X.C22240Azu;
import X.C22241Azv;
import X.C36401np;
import X.C63662tU;
import X.C63932tv;
import X.C72463Mc;
import android.content.Context;
import android.os.Bundle;
import android.text.SpannableString;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ProgressBar;
import com.google.android.material.textfield.TextInputLayout;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.wds.components.button.WDSButton;
import java.text.DateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public final class IndiaUpiInternationalActivationActivity extends AnonymousClass91S {
    public long A00;
    public DatePicker A01;
    public ProgressBar A02;
    public TextInputLayout A03;
    public TextInputLayout A04;
    public AnonymousClass8pN A05;
    public C1418477e A06;
    public AnonymousClass129 A07;
    public C36401np A08;
    public WDSButton A09;
    public AnonymousClass00H A0A;
    public boolean A0B;
    public final AnonymousClass1QE A0C;
    public final C18100vl A0D;

    public void Bwk(A7B a7b, String str) {
        String str2;
        String str3 = str;
        if (str != null && str.length() != 0) {
            AnonymousClass8pN r2 = this.A05;
            if (r2 != null) {
                String str4 = r2.A0B;
                C1418477e r0 = this.A06;
                if (r0 == null) {
                    str2 = "seqNumber";
                } else {
                    String str5 = (String) r0.A00;
                    C170278pb r4 = r2.A08;
                    C18070vi.A0z(r4, "null cannot be cast to non-null type com.whatsapp.payments.IndiaUpiMethodData");
                    AnonymousClass8pS r42 = (AnonymousClass8pS) r4;
                    AnonymousClass8pN r02 = this.A05;
                    if (r02 != null) {
                        A5C(r42, str3, str4, str5, (String) C20284AEs.A02(r02), 3);
                        return;
                    }
                }
            }
            C18070vi.A11("paymentBankAccount");
            throw null;
        } else if (a7b != null && !C20752AXh.A01(this, "upi-list-keys", a7b.A00, false)) {
            if (this.A04.A05("upi-list-keys")) {
                AnonymousClass91U.A1b(this);
                AnonymousClass8pN r03 = this.A05;
                if (r03 == null) {
                    str2 = "paymentBankAccount";
                } else {
                    A5A(r03.A08);
                    return;
                }
            } else {
                A56();
                return;
            }
        } else {
            return;
        }
        C18070vi.A11(str2);
        throw null;
    }

    public void A2y() {
        if (!this.A0B) {
            this.A0B = true;
            AnonymousClass1K1 A002 = C137116uw.A00(this);
            AnonymousClass10E r2 = A002.AAQ;
            C63932tv.A02(r2, this);
            AnonymousClass10G r1 = r2.A00;
            C63932tv.A01(r2, r1, this);
            C63662tU.A00(r2, r1, this, r1.A5A);
            AnonymousClass91U.A1V(r2, r1, this);
            AnonymousClass91U.A1Q(A002, r2, r1, this, r2.A7z);
            AnonymousClass91U.A1P(A002, r2, r1, AnonymousClass8BU.A0E(r2), this);
            AnonymousClass91U.A1Y(r2, this);
            AnonymousClass91U.A1W(r2, r1, this);
            AnonymousClass91U.A1T(A002, r2, r1, this);
            this.A0A = AnonymousClass8BT.A0f(r2);
            this.A07 = C108975cc.A0O(r2);
            this.A08 = AnonymousClass3MY.A0e(r1);
        }
    }

    public void C5K(A7B a7b) {
        throw new UnsupportedOperationException(this.A0C.A03("onSetPin unsupported"));
    }

    public void onCreate(Bundle bundle) {
        String str;
        String str2;
        super.onCreate(bundle);
        AnonymousClass8pN r0 = (AnonymousClass8pN) AnonymousClass91U.A1I(this);
        if (r0 != null) {
            this.A05 = r0;
        }
        this.A06 = AnonymousClass8BR.A0Y(AnonymousClass8BR.A0Z(), String.class, AXS.A01(this), "upiSequenceNumber");
        AnonymousClass8BX.A0u(this);
        setContentView(2131625625);
        this.A04 = (TextInputLayout) AnonymousClass3MY.A0C(this, 2131435590);
        this.A00 = System.currentTimeMillis();
        DateFormat dateInstance = DateFormat.getDateInstance(2, this.A00.A0N());
        TextInputLayout textInputLayout = this.A04;
        if (textInputLayout != null) {
            EditText editText = textInputLayout.A0B;
            if (editText != null) {
                editText.setEnabled(false);
            }
            TextInputLayout textInputLayout2 = this.A04;
            if (textInputLayout2 != null) {
                EditText editText2 = textInputLayout2.A0B;
                if (editText2 != null) {
                    AnonymousClass8BW.A13(editText2, dateInstance, this.A00);
                }
                TextInputLayout textInputLayout3 = (TextInputLayout) AnonymousClass3MY.A0C(this, 2131430468);
                this.A03 = textInputLayout3;
                if (textInputLayout3 == null) {
                    str2 = "endDateInputLayout";
                } else {
                    EditText editText3 = textInputLayout3.A0B;
                    C17960vV.A05(editText3);
                    C18070vi.A0X(editText3);
                    Calendar instance = Calendar.getInstance();
                    DateFormat dateInstance2 = DateFormat.getDateInstance(2, this.A00.A0N());
                    instance.add(5, 89);
                    AnonymousClass8BW.A13(editText3, dateInstance2, instance.getTimeInMillis());
                    AnonymousClass8Dv r6 = new AnonymousClass8Dv(new A9J(editText3, this, dateInstance2, 1), this, (Calendar) null, 2132083202, instance.get(1), instance.get(2), instance.get(5));
                    AFT.A00(editText3, this, r6, 27);
                    DatePicker datePicker = r6.A01;
                    C18070vi.A0X(datePicker);
                    this.A01 = datePicker;
                    TextEmojiLabel A0H = AnonymousClass8BR.A0H(this, 2131427548);
                    C36401np r10 = this.A08;
                    if (r10 != null) {
                        Context context = A0H.getContext();
                        if (getIntent().getBooleanExtra("EXTRA_INTERNATIONAL_QR_ACTIVATION_FROM_SCAN", false)) {
                            Object[] A1b = AnonymousClass3MW.A1b();
                            C20080A6g a6g = this.A0O;
                            AnonymousClass8pN r02 = this.A05;
                            if (r02 == null) {
                                C18070vi.A11("paymentBankAccount");
                                throw null;
                            } else {
                                A1b[0] = a6g.A05(r02);
                                str = C17880vN.A0q(this, "supported-countries-faq", A1b, 1, 2131897401);
                            }
                        } else {
                            str = C17890vO.A0R(this, "supported-countries-faq", 1, 0, 2131897400);
                        }
                        C18070vi.A0b(str);
                        SpannableString spannableString = new SpannableString(r10.A06(context, new C21427Aju(this, 27), str, "supported-countries-faq", C72463Mc.A02(A0H.getContext())));
                        AnonymousClass3Ma.A1K(A0H, this.A08);
                        AnonymousClass3Ma.A1L(this.A0E, A0H);
                        A0H.setText(spannableString);
                        this.A02 = (ProgressBar) AnonymousClass3MY.A0H(this, 2131436454);
                        this.A09 = (WDSButton) AnonymousClass3MY.A0H(this, 2131429535);
                        AnonymousClass9R2.A00(this, 2131232759);
                        C18100vl r3 = this.A0D;
                        C20339AGv.A00(this, ((IndiaUpiInternationalActivationViewModel) r3.getValue()).A00, new C22241Azv(this), 43);
                        C20339AGv.A00(this, ((IndiaUpiInternationalActivationViewModel) r3.getValue()).A04, new C22240Azu(this), 43);
                        WDSButton wDSButton = this.A09;
                        if (wDSButton == null) {
                            str2 = "buttonView";
                        } else {
                            AFQ.A00(wDSButton, this, 42);
                            return;
                        }
                    } else {
                        C18070vi.A11("linkifier");
                        throw null;
                    }
                }
                C18070vi.A11(str2);
                throw null;
            }
        }
        C18070vi.A11("startDateInputLayout");
        throw null;
    }

    public IndiaUpiInternationalActivationActivity(int i) {
        this.A0B = false;
        AGE.A00(this, 4);
    }

    public static final long A03(DatePicker datePicker) {
        return new GregorianCalendar(datePicker.getYear(), datePicker.getMonth(), datePicker.getDayOfMonth(), 0, 0, 0).getTimeInMillis();
    }

    public IndiaUpiInternationalActivationActivity() {
        this(0);
        this.A0C = AnonymousClass1QE.A00("IndiaUpiInternationalActivationActivity", "payment-settings", "IN");
        this.A0D = AnonymousClass1DF.A00(AnonymousClass00R.A0C, new C21966AvU(this));
    }
}
