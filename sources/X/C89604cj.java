package X;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.TextView;
import com.whatsapp.WaEditText;
import com.whatsapp.util.Log;
import java.util.List;
import java.util.Locale;

/* renamed from: X.4cj  reason: invalid class name and case insensitive filesystem */
public final class C89604cj implements TextWatcher {
    public int A00 = -1;
    public int A01 = -1;
    public String A02 = "";
    public boolean A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final WaEditText A07;
    public final WaEditText A08;
    public final WaEditText A09;
    public final C107635aL A0A;
    public final AnonymousClass4VX A0B;
    public final List A0C;

    public C89604cj(WaEditText waEditText, WaEditText waEditText2, WaEditText waEditText3, C107635aL r5, AnonymousClass4VX r6, List list, int i, int i2, int i3) {
        C18070vi.A0d(waEditText2, 5);
        this.A0B = r6;
        this.A0A = r5;
        this.A0C = list;
        this.A09 = waEditText;
        this.A07 = waEditText2;
        this.A08 = waEditText3;
        this.A05 = i;
        this.A06 = i2;
        this.A04 = i3;
    }

    public void afterTextChanged(Editable editable) {
        int i;
        boolean isDigit;
        String str;
        boolean isDigit2;
        Editable text;
        C18070vi.A0d(editable, 0);
        if (this.A02.length() > 0) {
            WaEditText waEditText = this.A07;
            waEditText.setTag(2131436093, (Object) null);
            waEditText.removeTextChangedListener(this);
            waEditText.setText("");
            waEditText.setTag(2131436093, this);
            waEditText.addTextChangedListener(this);
        }
        if (editable.length() != 0 || this.A00 != 0) {
            int i2 = this.A00;
            WaEditText waEditText2 = this.A07;
            waEditText2.setTag(2131436093, (Object) null);
            if (i2 == 1) {
                waEditText2.removeTextChangedListener(this);
                char charAt = editable.charAt(this.A01);
                int i3 = this.A04;
                if (i3 != 0) {
                    isDigit2 = Character.isLetterOrDigit(charAt);
                } else {
                    isDigit2 = Character.isDigit(charAt);
                }
                if (isDigit2) {
                    String valueOf = String.valueOf(editable.charAt(this.A01));
                    if (i3 == 1) {
                        valueOf = valueOf.toUpperCase(Locale.ROOT);
                        C18070vi.A0X(valueOf);
                    }
                    waEditText2.setText(valueOf);
                    WaEditText waEditText3 = this.A08;
                    if (!(waEditText3 == null || (text = waEditText2.getText()) == null || text.length() == 0)) {
                        waEditText3.requestFocus();
                    }
                } else {
                    waEditText2.setText("");
                }
                waEditText2.setTag(2131436093, this);
                waEditText2.addTextChangedListener(this);
            } else {
                waEditText2.removeTextChangedListener(this);
                int i4 = 0;
                int i5 = 0;
                while (true) {
                    i = this.A06;
                    if (i4 >= i || i5 >= editable.length()) {
                        waEditText2.setTag(2131436093, this);
                        waEditText2.addTextChangedListener(this);
                        int i6 = this.A00;
                    } else {
                        char charAt2 = editable.charAt(i5);
                        int i7 = this.A04;
                        if (i7 != 0) {
                            isDigit = Character.isLetterOrDigit(charAt2);
                        } else {
                            isDigit = Character.isDigit(charAt2);
                        }
                        if (!isDigit) {
                            i4--;
                        } else {
                            if (i5 < this.A00) {
                                str = String.valueOf(editable.charAt(i5));
                            } else {
                                str = "";
                            }
                            TextView textView = (TextView) this.A0C.get(i4);
                            if (i7 == 1) {
                                str = str.toUpperCase(Locale.ROOT);
                                C18070vi.A0X(str);
                            }
                            textView.setText(str);
                        }
                        i4++;
                        i5++;
                    }
                }
                waEditText2.setTag(2131436093, this);
                waEditText2.addTextChangedListener(this);
                int i62 = this.A00;
                if (i62 < i) {
                    ((View) this.A0C.get(i62)).requestFocus();
                }
                if (this.A05 != AnonymousClass3MX.A02(this.A0C, 1)) {
                    return;
                }
            }
            String A002 = this.A0B.A00();
            if (A002.length() == this.A0C.size()) {
                waEditText2.A0H();
                C107635aL r1 = this.A0A;
                if (r1 == null) {
                    Log.e("CodeInputBoxManager/CodeInputBoxTextWatcher/afterTextChanged/invalid callback");
                    return;
                }
                Log.i("CodeInputBoxManager/CodeInputBoxTextWatcher/afterTextChanged trigger callback");
                r1.BpB(A002);
            }
        } else if (this.A07.hasFocus() && this.A03) {
            WaEditText waEditText4 = this.A09;
            if (waEditText4 != null) {
                waEditText4.setText("");
                waEditText4.requestFocus();
                return;
            }
            throw C17880vN.A0g();
        }
    }

    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        C18070vi.A0d(charSequence, 0);
        Editable text = this.A07.getText();
        boolean z = false;
        if (text == null || text.length() == 0) {
            if (this.A09 != null) {
                z = true;
            }
            this.A03 = z;
            return;
        }
        this.A02 = charSequence.toString();
        this.A03 = false;
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        this.A00 = i3;
        this.A01 = i;
    }
}
