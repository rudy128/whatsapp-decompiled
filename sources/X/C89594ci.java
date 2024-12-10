package X;

import android.text.Editable;
import android.text.InputFilter;
import android.text.SpannableStringBuilder;
import android.text.TextWatcher;
import android.text.style.CharacterStyle;
import android.text.style.RelativeSizeSpan;
import com.whatsapp.CodeInputField;

/* renamed from: X.4ci  reason: invalid class name and case insensitive filesystem */
public final class C89594ci implements TextWatcher {
    public boolean A00;
    public String A01 = "";
    public boolean A02;
    public final AnonymousClass5YS A03;
    public final CodeInputField A04;
    public final C107815af A05;

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public void afterTextChanged(Editable editable) {
        SpannableStringBuilder spannableStringBuilder;
        C22625BGl bGl;
        int i;
        int length;
        int length2;
        CodeInputField codeInputField = this.A04;
        int selectionStart = codeInputField.getSelectionStart();
        Editable editable2 = editable;
        String replace = editable2.toString().replace(Character.toString(codeInputField.A01), "");
        if (!replace.isEmpty() && replace.charAt(0) != 160) {
            codeInputField.A04 = false;
        }
        int i2 = codeInputField.A02 / 2;
        int length3 = replace.length();
        if (length3 > 0 && this.A01.startsWith(replace.substring(0, 1)) && this.A01.indexOf(160) >= 0 && replace.indexOf(160) < 0 && selectionStart == i2) {
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append(replace.substring(0, i2 - 1));
            replace = AnonymousClass000.A0y(replace.substring(i2), A10);
            selectionStart--;
        } else if (length3 > selectionStart && replace.indexOf(160) == selectionStart && selectionStart == i2 + 1) {
            selectionStart++;
        }
        String replace2 = replace.replace(Character.toString(160), "");
        int length4 = replace2.length();
        int i3 = codeInputField.A02;
        if (i3 > 4) {
            if (length4 > i2) {
                length4++;
            }
            while (true) {
                length2 = replace2.length();
                if (length2 >= i2) {
                    break;
                }
                replace2 = C17890vO.A0c(AnonymousClass000.A11(replace2), codeInputField.A01);
            }
            StringBuilder A102 = AnonymousClass000.A10();
            A102.append(replace2.substring(0, i2));
            A102.append(160);
            A102.append(replace2.substring(i2, Math.min(codeInputField.A02, length2)));
            while (true) {
                replace2 = A102.toString();
                if (replace2.length() >= codeInputField.A02 + 1) {
                    break;
                }
                A102 = AnonymousClass000.A11(replace2);
                A102.append(codeInputField.A01);
            }
        } else {
            while (true) {
                length = replace2.length();
                if (length >= i3) {
                    break;
                }
                replace2 = C17890vO.A0c(AnonymousClass000.A11(replace2), codeInputField.A01);
            }
            if (length > i3) {
                replace2 = replace2.substring(0, i3);
            }
        }
        if (codeInputField.A04) {
            spannableStringBuilder = AnonymousClass3MW.A09(replace2);
            for (int i4 = 0; i4 < spannableStringBuilder.length(); i4++) {
                if (spannableStringBuilder.charAt(i4) == codeInputField.A01) {
                    i = i4 + 1;
                    spannableStringBuilder.setSpan(new RelativeSizeSpan(0.9f), i4, i, 33);
                    bGl = new C22625BGl(codeInputField.getContext(), AnonymousClass3MZ.A02(codeInputField.getContext(), codeInputField.getContext(), 2130969090, 2131100132));
                } else if (spannableStringBuilder.charAt(i4) != 160) {
                    bGl = new C22625BGl(codeInputField.getContext(), AnonymousClass3MZ.A02(codeInputField.getContext(), codeInputField.getContext(), 2130969092, 2131100134));
                    i = i4 + 1;
                }
                spannableStringBuilder.setSpan(bGl, i4, i, 33);
            }
        } else {
            spannableStringBuilder = this.A03.BZV(replace2);
        }
        if (spannableStringBuilder.length() > 0) {
            InputFilter[] filters = editable2.getFilters();
            codeInputField.removeTextChangedListener(this);
            editable2.setFilters(new InputFilter[0]);
            Class<CharacterStyle> cls = CharacterStyle.class;
            for (Object removeSpan : editable2.getSpans(0, editable2.length(), cls)) {
                editable2.removeSpan(removeSpan);
            }
            editable2.replace(0, editable2.length(), spannableStringBuilder.toString());
            for (Object obj : spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), cls)) {
                editable2.setSpan(obj, spannableStringBuilder.getSpanStart(obj), spannableStringBuilder.getSpanEnd(obj), 18);
            }
            editable2.setFilters(filters);
            codeInputField.addTextChangedListener(this);
        }
        codeInputField.setSelection(Math.min(selectionStart, Math.min(length4, replace2.length())));
        if (!this.A00) {
            C107815af r3 = this.A05;
            String replaceAll = replace2.toString().replaceAll("[^0-9]", "");
            if (replaceAll.length() != codeInputField.A02) {
                this.A02 = false;
                r3.BzF(replaceAll);
            } else if (!this.A02) {
                this.A02 = true;
                r3.BpB(replaceAll);
            }
        }
    }

    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        if (charSequence != null) {
            this.A01 = charSequence.toString();
        }
    }

    public C89594ci(C107815af r2, AnonymousClass5YS r3, CodeInputField codeInputField) {
        this.A05 = r2;
        this.A04 = codeInputField;
        this.A03 = r3;
    }
}
