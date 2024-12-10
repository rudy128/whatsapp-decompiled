package X;

import android.app.Activity;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import com.google.android.material.textfield.TextInputLayout;
import com.whatsapp.WaEditText;
import com.whatsapp.util.Log;
import java.io.IOException;

/* renamed from: X.70Q  reason: invalid class name */
public abstract class AnonymousClass70Q {
    public TextWatcher A00;
    public EditText A01;
    public LinearLayout A02;
    public TextInputLayout A03;
    public WaEditText A04;
    public C28931bI A05;
    public final Activity A06;
    public final AnonymousClass1LA A07;
    public final AnonymousClass1KB A08;
    public final C1599386l A09;
    public final AnonymousClass11C A0A;
    public final C18000vb A0B;
    public final AnonymousClass1K3 A0C;
    public final AnonymousClass10I A0D;
    public final View A0E;

    public final void A06() {
        InputFilter[] inputFilterArr = {new InputFilter.LengthFilter(17)};
        WaEditText waEditText = this.A04;
        if (waEditText != null) {
            waEditText.setFilters(inputFilterArr);
            WaEditText waEditText2 = this.A04;
            if (waEditText2 != null) {
                waEditText2.setTextDirection(3);
                EditText editText = this.A01;
                if (editText != null) {
                    editText.setTextDirection(3);
                    LinearLayout linearLayout = this.A02;
                    if (linearLayout == null) {
                        C18070vi.A11("phoneFieldContainer");
                        throw null;
                    }
                    linearLayout.setLayoutDirection(0);
                    if (AnonymousClass3MW.A1Z(this.A0B)) {
                        EditText editText2 = this.A01;
                        if (editText2 != null) {
                            editText2.setLayoutDirection(1);
                        }
                    }
                    WaEditText waEditText3 = this.A04;
                    if (waEditText3 != null) {
                        waEditText3.setOnFocusChangeListener(new AnonymousClass78V(this, 1));
                        WaEditText waEditText4 = this.A04;
                        if (waEditText4 != null) {
                            waEditText4.A01 = new C143067Bw(this);
                            EditText editText3 = this.A01;
                            if (editText3 != null) {
                                AnonymousClass3Ma.A1B(editText3, this, 18);
                                this.A0D.CGO(new C146437Pc(this, 33), "getCountryCode");
                                return;
                            }
                        }
                    }
                }
                C18070vi.A11("countryCodeField");
                throw null;
            }
        }
        C18070vi.A11("phoneField");
        throw null;
    }

    public void A07(String str) {
        C116505xr r2 = (C116505xr) this;
        if (!TextUtils.isEmpty(str)) {
            TextWatcher textWatcher = r2.A00;
            if (textWatcher != null) {
                r2.A03.removeTextChangedListener(textWatcher);
            }
            try {
                AnonymousClass6IY r1 = new AnonymousClass6IY(r2, str);
                r2.A00 = r1;
                r2.A03.addTextChangedListener(r1);
            } catch (NullPointerException unused) {
                Log.e("PhoneNumberEntry/formatter exception");
            }
            WaEditText waEditText = r2.A03;
            Editable text = waEditText.getText();
            text.getClass();
            String obj = text.toString();
            String str2 = "";
            if (obj != null) {
                str2 = obj.replaceAll("\\D", str2);
            }
            waEditText.setText(str2);
        }
    }

    public final void A08(String str) {
        C18070vi.A0d(str, 0);
        String A002 = AnonymousClass1K3.A00(str);
        if (A002 != null && A002.length() != 0) {
            A07(A002);
            String A1H = AnonymousClass001.A1H(" +", str, AnonymousClass000.A11(A002));
            EditText editText = this.A01;
            if (editText == null) {
                C18070vi.A11("countryCodeField");
                throw null;
            } else {
                editText.setText(A1H);
            }
        }
    }

    public void A09(boolean z) {
        C116505xr r3 = (C116505xr) this;
        C28931bI r1 = r3.A07;
        if (z) {
            r1.A04(0);
            TextInputLayout textInputLayout = r3.A02;
            textInputLayout.requestFocus();
            r3.A06.A01.A0F(textInputLayout.getTop());
            textInputLayout.setError(" ");
            return;
        }
        r1.A04(8);
        r3.A02.setError((CharSequence) null);
    }

    public static final String A01(AnonymousClass70Q r3) {
        WaEditText waEditText = r3.A04;
        if (waEditText == null) {
            C18070vi.A11("phoneField");
            throw null;
        }
        Editable text = waEditText.getText();
        text.getClass();
        String valueOf = String.valueOf(text);
        String str = "";
        if (valueOf != null) {
            str = valueOf.replaceAll("\\D", str);
        }
        C18070vi.A0X(str);
        String A022 = r3.A02();
        if (A022.length() <= 0 || AnonymousClass1YD.A03(A022) == null) {
            return str;
        }
        try {
            String A032 = r3.A07.A03(Integer.parseInt(A022), str);
            C18070vi.A0X(A032);
            return A032;
        } catch (IOException e) {
            Log.e("ContactFormActivity/cc failed trimLeadingZero from CountryPhoneInfo", e);
            return str;
        }
    }

    public final String A02() {
        EditText editText = this.A01;
        if (editText == null) {
            C18070vi.A11("countryCodeField");
            throw null;
        }
        String A12 = AnonymousClass3Ma.A12(editText);
        return C108955ca.A0z(A12, AnonymousClass1YF.A0F(A12, "+", 0, false) + 1);
    }

    public final String A03() {
        String obj;
        WaEditText waEditText = this.A04;
        if (waEditText == null) {
            C18070vi.A11("phoneField");
            throw null;
        }
        Editable text = waEditText.getText();
        if (text == null || (obj = text.toString()) == null) {
            return "";
        }
        return obj;
    }

    public final boolean A0A() {
        WaEditText waEditText = this.A04;
        if (waEditText == null) {
            C18070vi.A11("phoneField");
            throw null;
        }
        Editable text = waEditText.getText();
        if (text != null && text.length() != 0 && C63942tw.A01(this.A07, A02(), A01(this)) == 1) {
            return false;
        }
        this.A08.A0J(new AnonymousClass7RE(this));
        return true;
    }

    public AnonymousClass70Q(Activity activity, View view, AnonymousClass1LA r3, AnonymousClass1KB r4, C1599386l r5, AnonymousClass11C r6, C18000vb r7, AnonymousClass1K3 r8, AnonymousClass10I r9) {
        C108985cd.A1D(r4, r9);
        C18070vi.A0l(r6, r7);
        this.A0E = view;
        this.A06 = activity;
        this.A08 = r4;
        this.A0D = r9;
        this.A0C = r8;
        this.A0A = r6;
        this.A0B = r7;
        this.A07 = r3;
        this.A09 = r5;
    }

    public final String A04() {
        String A012 = A01(this);
        if (A012.length() == 0) {
            return "";
        }
        return AnonymousClass001.A1H(A02(), A012, AnonymousClass000.A10());
    }

    public final String A05() {
        String A012 = A01(this);
        if (A012.length() == 0) {
            return "";
        }
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append('+');
        return AnonymousClass001.A1H(A02(), A012, A10);
    }
}
