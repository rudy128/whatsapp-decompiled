package X;

import android.os.Build;
import android.text.TextUtils;
import android.view.inputmethod.InputMethodInfo;
import android.view.inputmethod.InputMethodManager;
import android.view.inputmethod.InputMethodSubtype;
import java.util.Locale;
import java.util.Set;
import java.util.TreeSet;
import java.util.regex.Pattern;

/* renamed from: X.A0r  reason: case insensitive filesystem */
public class C19960A0r {
    public InputMethodSubtype A00;
    public Set A01;
    public final AnonymousClass11C A02;

    public Locale A01() {
        InputMethodManager A0N = this.A02.A0N();
        C17960vV.A07(A0N);
        C17960vV.A07(A0N);
        InputMethodSubtype currentInputMethodSubtype = A0N.getCurrentInputMethodSubtype();
        if (currentInputMethodSubtype == null || !currentInputMethodSubtype.getMode().equals("keyboard")) {
            return null;
        }
        InputMethodSubtype inputMethodSubtype = this.A00;
        if (!(inputMethodSubtype == null || inputMethodSubtype == currentInputMethodSubtype || inputMethodSubtype.equals(currentInputMethodSubtype))) {
            A00();
        }
        this.A00 = currentInputMethodSubtype;
        if (this.A01 == null) {
            A00();
        }
        Set set = this.A01;
        if (set == null || !set.contains(currentInputMethodSubtype)) {
            return null;
        }
        String locale = currentInputMethodSubtype.getLocale();
        if (TextUtils.isEmpty(locale)) {
            return null;
        }
        if (Pattern.matches("[a-z]{2}_[A-Z]{2}", locale)) {
            return Locale.forLanguageTag(locale.replace("_", "-"));
        }
        if (Pattern.matches("[a-z]{2}", locale)) {
            return new Locale(locale);
        }
        C17900vP.A0e("keyboardLanguageExtractor/error/cannot parse locale ", locale, AnonymousClass000.A10());
        return null;
    }

    public TreeSet A02() {
        String str;
        int length;
        TreeSet treeSet = new TreeSet(String.CASE_INSENSITIVE_ORDER);
        InputMethodManager A0N = this.A02.A0N();
        C17960vV.A07(A0N);
        for (InputMethodInfo enabledInputMethodSubtypeList : A0N.getEnabledInputMethodList()) {
            for (InputMethodSubtype next : A0N.getEnabledInputMethodSubtypeList(enabledInputMethodSubtypeList, true)) {
                if (next.getMode().equals("keyboard")) {
                    if (Build.VERSION.SDK_INT >= 24) {
                        str = next.getLanguageTag();
                    } else {
                        str = "";
                    }
                    if (str.isEmpty()) {
                        str = new Locale(next.getLocale()).getLanguage();
                    }
                    if (str.isEmpty() || (length = str.length()) < 2) {
                        StringBuilder A10 = AnonymousClass000.A10();
                        A10.append("KeyboardLanguageExtractor/getTwoLetterLanguageCode/unexpected language result from input method, language: '");
                        A10.append(str);
                        C17890vO.A1B(A10, "'");
                    } else if (length <= 2 || (str = AnonymousClass8BS.A0o(str, 2)) != null) {
                        treeSet.add(str);
                    }
                }
            }
        }
        return treeSet;
    }

    public C19960A0r(AnonymousClass11C r1) {
        this.A02 = r1;
    }

    private void A00() {
        this.A01 = C17880vN.A12();
        InputMethodManager A0N = this.A02.A0N();
        C17960vV.A07(A0N);
        C17960vV.A07(A0N);
        for (InputMethodInfo next : A0N.getEnabledInputMethodList()) {
            if (next.getId().startsWith("com.google.android.inputmethod")) {
                this.A01.addAll(A0N.getEnabledInputMethodSubtypeList(next, true));
            }
        }
    }
}
