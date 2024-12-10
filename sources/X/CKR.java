package X;

import android.os.Bundle;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;

public final class CKR {
    public final Bundle A00;

    public CKR(Bundle bundle) {
        C26161CtZ.A03(PublicKeyCredentialControllerUtility.JSON_KEY_CHALLENGE, bundle);
        Class<Bundle> cls = Bundle.class;
        C26161CtZ.A01(bundle, cls, "auxArguments");
        C26161CtZ.A01(bundle, cls, "additionalKeyMaterial");
        Class<Boolean> cls2 = Boolean.class;
        C26161CtZ.A01(bundle, cls2, "refreshVerifier");
        C26161CtZ.A01(bundle, cls2, "useDebugKey");
        this.A00 = bundle;
    }
}
