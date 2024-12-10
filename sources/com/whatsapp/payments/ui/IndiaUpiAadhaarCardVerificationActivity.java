package com.whatsapp.payments.ui;

import X.A7B;
import X.AF4;
import X.AFO;
import X.AGC;
import X.AXS;
import X.AZ6;
import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass11P;
import X.AnonymousClass1K1;
import X.AnonymousClass1QD;
import X.AnonymousClass1QE;
import X.AnonymousClass3MY;
import X.AnonymousClass78X;
import X.AnonymousClass8BT;
import X.AnonymousClass8BU;
import X.AnonymousClass8BX;
import X.AnonymousClass8BY;
import X.AnonymousClass8pN;
import X.AnonymousClass91M;
import X.AnonymousClass91U;
import X.C003401n;
import X.C108975cc;
import X.C137116uw;
import X.C1418477e;
import X.C17880vN;
import X.C18070vi;
import X.C185039bv;
import X.C19967A1c;
import X.C20112A7u;
import X.C63662tU;
import X.C63932tv;
import X.C72453Mb;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import com.whatsapp.util.Log;
import com.whatsapp.wds.components.button.WDSButton;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

public final class IndiaUpiAadhaarCardVerificationActivity extends AnonymousClass91M {
    public EditText A00;
    public EditText A01;
    public AnonymousClass8pN A02;
    public C1418477e A03;
    public C185039bv A04;
    public WDSButton A05;
    public String A06;
    public String A07;
    public boolean A08;
    public final AnonymousClass1QE A09;

    public void Bzl(A7B a7b) {
        String str;
        String string;
        C18070vi.A0d(a7b, 0);
        if (a7b.A00 == 21324) {
            C185039bv r4 = this.A04;
            if (r4 != null) {
                AXS axs = r4.A01;
                int A0A = axs.A0A();
                int i = 1;
                if (C108975cc.A19(((AnonymousClass11P.A01(r4.A00) - axs.A0C()) > TimeUnit.HOURS.toMillis(24) ? 1 : ((AnonymousClass11P.A01(r4.A00) - axs.A0C()) == TimeUnit.HOURS.toMillis(24) ? 0 : -1)))) {
                    i = 1 + A0A;
                }
                synchronized (axs) {
                    try {
                        AnonymousClass1QD r5 = axs.A01;
                        JSONObject A0c = AnonymousClass8BY.A0c(r5);
                        A0c.put("invalidAadhaarEntryCount", i);
                        A0c.put("lastInvalidAadhaarEntryTs", AnonymousClass11P.A01(axs.A00));
                        AnonymousClass8BT.A1G(r5, A0c);
                    } catch (JSONException e) {
                        Log.w("PAY: IndiaUpiPaymentSharedPrefs storeInvalidAadhaarEntry threw: ", e);
                    }
                }
                AZ6 az6 = this.A0S;
                AnonymousClass8pN r1 = this.A02;
                if (r1 == null) {
                    str = "bankAccount";
                } else {
                    az6.A09(r1, a7b, 16);
                    this.A09.A06("onRequestOtp failed; showErrorAndFinish");
                    if (this.A0N.A0A() >= 2) {
                        Intent A0A2 = C17880vN.A0A();
                        A0A2.putExtra("extra_max_aadhaar_attempt_exceeded", true);
                        setResult(0, A0A2);
                        Object[] objArr = new Object[1];
                        C17880vN.A1T(objArr, 24, 0);
                        string = getString(2131893779, objArr);
                    } else {
                        string = getString(2131893778);
                    }
                    C18070vi.A0b(string);
                    A5H(new C19967A1c(0, string));
                    return;
                }
            } else {
                str = "indiaUpiAadhaarUtils";
            }
            C18070vi.A11(str);
            throw null;
        }
        super.Bzl(a7b);
        return;
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        C18070vi.A0d(menu, 0);
        A4w(menu);
        return super.onCreateOptionsMenu(menu);
    }

    public void onRestoreInstanceState(Bundle bundle) {
        C18070vi.A0d(bundle, 0);
        super.onRestoreInstanceState(bundle);
        if (bundle.containsKey("aadhaarNumberInst")) {
            this.A03 = (C1418477e) bundle.getParcelable("aadhaarNumberInst");
        }
        if (bundle.containsKey("otpTransactionIdInst")) {
            this.A06 = bundle.getString("otpTransactionIdInst");
        }
        if (bundle.containsKey("otpTransactionTsInst")) {
            this.A07 = bundle.getString("otpTransactionTsInst");
        }
    }

    public void onSaveInstanceState(Bundle bundle) {
        C18070vi.A0d(bundle, 0);
        super.onSaveInstanceState(bundle);
        C1418477e r1 = this.A03;
        if (r1 != null) {
            bundle.putParcelable("aadhaarNumberInst", r1);
        }
        String str = this.A06;
        if (str != null) {
            bundle.putString("otpTransactionIdInst", str);
        }
        String str2 = this.A07;
        if (str2 != null) {
            bundle.putString("otpTransactionTsInst", str2);
        }
    }

    public void A2y() {
        if (!this.A08) {
            this.A08 = true;
            AnonymousClass1K1 A002 = C137116uw.A00(this);
            AnonymousClass10E r3 = A002.AAQ;
            C63932tv.A02(r3, this);
            AnonymousClass10G r1 = r3.A00;
            C63932tv.A01(r3, r1, this);
            C63662tU.A00(r3, r1, this, r1.A5A);
            AnonymousClass91U.A1V(r3, r1, this);
            AnonymousClass91U.A1Q(A002, r3, r1, this, r3.A7z);
            AnonymousClass91U.A1P(A002, r3, r1, AnonymousClass8BU.A0E(r3), this);
            AnonymousClass91U.A1Y(r3, this);
            AnonymousClass91U.A1W(r3, r1, this);
            AnonymousClass91U.A1T(A002, r3, r1, this);
            this.A04 = new C185039bv((AnonymousClass11P) r3.AAv.get(), (AXS) r3.A5F.get());
        }
    }

    public IndiaUpiAadhaarCardVerificationActivity(int i) {
        this.A08 = false;
        AGC.A00(this, 38);
    }

    public void onBackPressed() {
        super.onBackPressed();
        this.A0S.A0B((C20112A7u) null, C17880vN.A0h(), C17880vN.A0j(), this.A0c, "enter_aadhaar_number", this.A0f);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        AnonymousClass8BX.A0u(this);
        setContentView(2131625599);
        A4r(2131231675, 2131434837);
        C003401n supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            AnonymousClass8BU.A17(supportActionBar, 2131893788);
        }
        AnonymousClass8pN r0 = (AnonymousClass8pN) AnonymousClass91U.A1I(this);
        if (r0 != null) {
            this.A02 = r0;
        }
        WDSButton wDSButton = (WDSButton) AnonymousClass3MY.A0H(this, 2131436711);
        this.A05 = wDSButton;
        if (wDSButton == null) {
            C18070vi.A11("confirmButton");
            throw null;
        }
        AFO.A00(wDSButton, this, 23);
        this.A00 = (EditText) AnonymousClass3MY.A0H(this, 2131427348);
        EditText editText = (EditText) AnonymousClass3MY.A0H(this, 2131427349);
        this.A01 = editText;
        EditText editText2 = this.A00;
        if (editText2 == null) {
            C18070vi.A11("aadhaarNumber1");
            throw null;
        } else if (editText == null) {
            C18070vi.A11("aadhaarNumber2");
            throw null;
        } else {
            editText2.addTextChangedListener(new AF4(editText, this, 4));
            EditText editText3 = this.A00;
            if (editText3 == null) {
                C18070vi.A11("aadhaarNumber1");
                throw null;
            }
            EditText editText4 = this.A01;
            if (editText4 == null) {
                C18070vi.A11("aadhaarNumber2");
                throw null;
            }
            editText3.setOnKeyListener(new AnonymousClass78X((EditText) null, editText4));
            EditText editText5 = this.A01;
            if (editText5 == null) {
                C18070vi.A11("aadhaarNumber2");
                throw null;
            }
            editText5.addTextChangedListener(new AF4(editText5, this, 2));
            EditText editText6 = this.A01;
            if (editText6 == null) {
                C18070vi.A11("aadhaarNumber2");
                throw null;
            }
            EditText editText7 = this.A00;
            if (editText7 == null) {
                C18070vi.A11("aadhaarNumber1");
                throw null;
            }
            editText6.setOnKeyListener(new AnonymousClass78X(editText7, (EditText) null));
            EditText editText8 = this.A00;
            if (editText8 == null) {
                C18070vi.A11("aadhaarNumber1");
                throw null;
            }
            editText8.requestFocus();
            this.A0S.A0B((C20112A7u) null, AnonymousClass3MY.A0f(), (Integer) null, this.A0c, "enter_aadhaar_number", this.A0f);
        }
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (C72453Mb.A0B(menuItem) == 2131432589) {
            A4u(2131888957, "enter_aadhaar_number", "payments:enter-card");
            return true;
        }
        if (menuItem.getItemId() == 16908332) {
            this.A0S.A0B((C20112A7u) null, 1, C17880vN.A0j(), this.A0c, "enter_aadhaar_number", this.A0f);
        }
        return super.onOptionsItemSelected(menuItem);
    }

    public IndiaUpiAadhaarCardVerificationActivity() {
        this(0);
        this.A09 = AnonymousClass1QE.A00("IndiaUpiAadhaarCardVerificationActivity", "onboarding", "IN");
    }
}
