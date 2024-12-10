package androidx.car.app.model;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass026;

public final class DistanceSpan extends CarSpan {
    public final Distance mDistance = null;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DistanceSpan)) {
            return false;
        }
        return AnonymousClass026.A00(this.mDistance, ((DistanceSpan) obj).mDistance);
    }

    public int hashCode() {
        return AnonymousClass001.A0k(this.mDistance);
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("[distance: ");
        return AnonymousClass001.A1G(this.mDistance, A10);
    }
}
