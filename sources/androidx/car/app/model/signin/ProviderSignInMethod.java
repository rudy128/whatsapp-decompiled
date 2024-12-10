package androidx.car.app.model.signin;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass026;
import X.C15570qq;
import androidx.car.app.model.Action;

public final class ProviderSignInMethod implements C15570qq {
    public final Action mAction = null;

    public int hashCode() {
        return AnonymousClass000.A0P(this.mAction, new Object[1], 0);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProviderSignInMethod)) {
            return false;
        }
        return AnonymousClass026.A00(this.mAction, ((ProviderSignInMethod) obj).mAction);
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("[action:");
        return AnonymousClass001.A1G(this.mAction, A10);
    }
}
