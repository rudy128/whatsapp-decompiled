package androidx.car.app.navigation.model;

import X.AnonymousClass000;

public final class LaneDirection {
    public final boolean mIsRecommended = false;
    public final int mShape = 1;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LaneDirection)) {
            return false;
        }
        LaneDirection laneDirection = (LaneDirection) obj;
        return this.mShape == laneDirection.mShape && this.mIsRecommended == laneDirection.mIsRecommended;
    }

    public int hashCode() {
        Object[] objArr = new Object[2];
        AnonymousClass000.A1L(objArr, this.mShape);
        return AnonymousClass000.A0P(Boolean.valueOf(this.mIsRecommended), objArr, 1);
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("[shape: ");
        A10.append(this.mShape);
        A10.append(", isRecommended: ");
        A10.append(this.mIsRecommended);
        return AnonymousClass000.A0z(A10);
    }
}
