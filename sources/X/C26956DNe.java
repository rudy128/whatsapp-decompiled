package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.Map;

/* renamed from: X.DNe  reason: case insensitive filesystem */
public final class C26956DNe implements E88 {
    public final Object A00;
    public final Map A01;

    public C26956DNe(Object obj, String str, Map map) {
        C18070vi.A0d(str, 2);
        this.A00 = obj;
        this.A01 = map;
    }

    public Runnable BFH(CFu cFu, E6H e6h) {
        C18070vi.A0d(cFu, 2);
        Map map = this.A01;
        if (map == null) {
            return null;
        }
        map.get(PublicKeyCredentialControllerUtility.JSON_KEY_NAME);
        return null;
    }

    public Object BSx() {
        return this.A00;
    }
}
