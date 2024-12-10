package X;

import android.widget.TextView;
import java.util.Map;

/* renamed from: X.Cpd  reason: case insensitive filesystem */
public final class C25970Cpd {
    public static String A00 = "en";
    public static String A01 = "en_US";
    public static Map A02 = AnonymousClass1D7.A0I();
    public static final C25970Cpd A03 = new Object();

    public static final String A00(String str) {
        if (C18070vi.A18(A00, "en")) {
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("sup:NetworkStringTranslator language is set to en. Did not attempt to translate ");
            A10.append(str);
            C17890vO.A1A(A10, ", returning null");
            return null;
        }
        if (A02.get(str) == null) {
            StringBuilder A102 = AnonymousClass000.A10();
            A102.append("sup:NetworkStringTranslator No translation exists for string ");
            A102.append(str);
            A102.append(" in ");
            A102.append(A00);
            A102.append('/');
            A102.append(A01);
            C17890vO.A19(A102, "! Returning null");
        }
        return C17880vN.A0s(str, A02);
    }

    public final void A01(TextView textView, int i, String str) {
        C18070vi.A0i(textView, str);
        String A002 = A00(str);
        if (A002 != null) {
            textView.setText(A002);
        } else {
            textView.setText(i);
        }
    }
}
