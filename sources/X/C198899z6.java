package X;

import com.whatsapp.util.Log;
import java.util.Iterator;
import java.util.Locale;
import java.util.regex.Pattern;
import org.json.JSONObject;

/* renamed from: X.9z6  reason: invalid class name and case insensitive filesystem */
public final class C198899z6 {
    public static final C198899z6 A00 = new Object();

    public final String A00(C18030ve r7, String str) {
        JSONObject jSONObject;
        C18070vi.A0d(r7, 0);
        if (!(str == null || str.length() == 0)) {
            try {
                jSONObject = r7.A0J(8969);
                C18070vi.A0b(jSONObject);
            } catch (Exception e) {
                Log.e("Error on parsing payment links url json from prop.", e);
                jSONObject = C17880vN.A15();
            }
            if (jSONObject.length() != 0) {
                Iterator A0s = AnonymousClass8BS.A0s(jSONObject);
                while (A0s.hasNext()) {
                    String A0v = C17880vN.A0v(A0s);
                    Pattern compile = Pattern.compile(A0v);
                    Locale locale = Locale.getDefault();
                    C18070vi.A0X(locale);
                    if (AnonymousClass8BU.A1V(AnonymousClass8BS.A0p(locale, str), compile)) {
                        C18070vi.A0b(A0v);
                        return A6n.A03(A0v, jSONObject, C18070vi.A15(jSONObject, A0v));
                    }
                }
            }
        }
        return null;
    }
}
