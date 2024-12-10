package androidx.car.app.model.signin;

import X.AnonymousClass000;
import X.AnonymousClass026;
import X.C15570qq;
import android.net.Uri;

public final class QRCodeSignInMethod implements C15570qq {
    public final Uri mUri = null;

    public int hashCode() {
        return AnonymousClass000.A0P(this.mUri, new Object[1], 0);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof QRCodeSignInMethod)) {
            return false;
        }
        return AnonymousClass026.A00(this.mUri, ((QRCodeSignInMethod) obj).mUri);
    }
}
