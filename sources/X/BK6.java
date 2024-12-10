package X;

import android.os.Bundle;
import org.json.JSONObject;

public final class BK6 extends C24738CIa {
    public final String A00;

    public BK6(String str, Bundle bundle) {
        super(bundle);
        this.A00 = str;
        C18070vi.A0d(str, 0);
        if (str.length() != 0) {
            try {
                new JSONObject(str);
                return;
            } catch (Exception unused) {
            }
        }
        throw AnonymousClass000.A0k("registrationResponseJson must not be empty, and must be a valid JSON");
    }
}
