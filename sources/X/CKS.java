package X;

import android.os.Bundle;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;

public final class CKS {
    public final Bundle A00;

    public CKS(Bundle bundle) {
        if (bundle != null) {
            C26161CtZ.A03(PublicKeyCredentialControllerUtility.JSON_KEY_RESPONSE, bundle);
            this.A00 = bundle;
            return;
        }
        throw AnonymousClass000.A0k("Bundle is null");
    }
}
