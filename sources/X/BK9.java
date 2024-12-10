package X;

import android.os.Bundle;
import org.json.JSONObject;

public final class BK9 extends C24739CIb {
    public final String A00;

    public BK9(String str, Bundle bundle) {
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
        throw AnonymousClass000.A0k("authenticationResponseJson must not be empty, and must be a valid JSON");
    }
}
