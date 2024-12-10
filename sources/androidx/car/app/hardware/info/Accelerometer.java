package androidx.car.app.hardware.info;

import X.AnonymousClass000;
import X.AnonymousClass026;
import androidx.car.app.hardware.common.CarValue;

public final class Accelerometer {
    public final CarValue mForces = CarValue.A04;

    public int hashCode() {
        return AnonymousClass000.A0P(this.mForces, new Object[1], 0);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Accelerometer)) {
            return false;
        }
        return AnonymousClass026.A00(this.mForces, ((Accelerometer) obj).mForces);
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("[ forces: ");
        A10.append(this.mForces);
        return AnonymousClass000.A0y(" ]", A10);
    }
}
