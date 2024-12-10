package androidx.car.app.model;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass026;
import java.util.Collections;
import java.util.List;

public final class ActionStrip {
    public final List mActions = Collections.emptyList();

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ActionStrip)) {
            return false;
        }
        return AnonymousClass026.A00(this.mActions, ((ActionStrip) obj).mActions);
    }

    public int hashCode() {
        return AnonymousClass001.A0k(this.mActions);
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("[action count: ");
        A10.append(this.mActions.size());
        return AnonymousClass000.A0z(A10);
    }
}
