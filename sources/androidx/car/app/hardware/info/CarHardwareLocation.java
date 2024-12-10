package androidx.car.app.hardware.info;

import X.AnonymousClass000;
import X.AnonymousClass026;
import androidx.car.app.hardware.common.CarValue;

public final class CarHardwareLocation {
    public static final CarValue A00 = new CarValue(2);
    public static final CarValue A01 = new CarValue(0);
    public final CarValue mLocation = A01;

    public int hashCode() {
        return AnonymousClass000.A0P(this.mLocation, new Object[1], 0);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CarHardwareLocation)) {
            return false;
        }
        return AnonymousClass026.A00(this.mLocation, ((CarHardwareLocation) obj).mLocation);
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("[ location: ");
        A10.append(this.mLocation);
        return AnonymousClass000.A0y(" ]", A10);
    }
}
