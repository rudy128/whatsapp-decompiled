package androidx.car.app.hardware.info;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass026;
import androidx.car.app.hardware.common.CarValue;

public final class Mileage {
    public final CarValue mDistanceDisplayUnit = CarValue.A05;
    public final CarValue mOdometerMeters = CarValue.A03;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Mileage)) {
            return false;
        }
        Mileage mileage = (Mileage) obj;
        CarValue carValue = this.mOdometerMeters;
        carValue.getClass();
        CarValue carValue2 = mileage.mOdometerMeters;
        carValue2.getClass();
        return AnonymousClass026.A00(carValue, carValue2) && AnonymousClass026.A00(this.mDistanceDisplayUnit, mileage.mDistanceDisplayUnit);
    }

    public int hashCode() {
        Object[] objArr = new Object[2];
        CarValue carValue = this.mOdometerMeters;
        carValue.getClass();
        objArr[0] = carValue;
        return AnonymousClass000.A0P(this.mDistanceDisplayUnit, objArr, 1);
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("[ odometer: ");
        CarValue carValue = this.mOdometerMeters;
        carValue.getClass();
        A10.append(carValue);
        A10.append(", distance display unit: ");
        return AnonymousClass001.A1G(this.mDistanceDisplayUnit, A10);
    }
}
