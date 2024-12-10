package X;

import android.content.SharedPreferences;
import org.json.JSONObject;

/* renamed from: X.2hu  reason: invalid class name and case insensitive filesystem */
public final class C56712hu {
    public final C18010vc A00;

    public C56712hu(C18010vc r2) {
        C18070vi.A0d(r2, 1);
        this.A00 = r2;
    }

    public final JSONObject A00(String str) {
        SharedPreferences A05 = this.A00.A05("marketing_opt_out");
        C18070vi.A0X(A05);
        String string = A05.getString(str, C17880vN.A15().toString());
        if (string == null) {
            string = C17880vN.A15().toString();
        }
        C18070vi.A0b(string);
        return C17880vN.A16(string);
    }
}
