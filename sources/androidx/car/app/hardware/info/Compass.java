package androidx.car.app.hardware.info;

import X.AnonymousClass000;
import X.AnonymousClass026;
import androidx.car.app.hardware.common.CarValue;

public final class Compass {
    public final CarValue mOrientations = CarValue.A04;

    public int hashCode() {
        return AnonymousClass000.A0P(this.mOrientations, new Object[1], 0);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Compass)) {
            return false;
        }
        return AnonymousClass026.A00(this.mOrientations, ((Compass) obj).mOrientations);
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("[ orientations: ");
        A10.append(this.mOrientations);
        return AnonymousClass000.A0y(" ]", A10);
    }
}
