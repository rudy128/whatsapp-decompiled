package androidx.car.app.model.signin;

import X.AnonymousClass000;
import X.AnonymousClass026;
import X.C15570qq;
import androidx.car.app.model.CarText;

public final class PinSignInMethod implements C15570qq {
    public final CarText mPinCode = null;

    public int hashCode() {
        return AnonymousClass000.A0P(this.mPinCode, new Object[1], 0);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PinSignInMethod)) {
            return false;
        }
        return AnonymousClass026.A00(this.mPinCode, ((PinSignInMethod) obj).mPinCode);
    }
}
