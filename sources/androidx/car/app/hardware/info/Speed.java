package androidx.car.app.hardware.info;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass026;
import androidx.car.app.hardware.common.CarValue;

public final class Speed {
    public final CarValue mDisplaySpeedMetersPerSecond;
    public final CarValue mRawSpeedMetersPerSecond;
    public final CarValue mSpeedDisplayUnit = CarValue.A05;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Speed)) {
            return false;
        }
        Speed speed = (Speed) obj;
        CarValue carValue = this.mRawSpeedMetersPerSecond;
        carValue.getClass();
        CarValue carValue2 = speed.mRawSpeedMetersPerSecond;
        carValue2.getClass();
        if (AnonymousClass026.A00(carValue, carValue2)) {
            CarValue carValue3 = this.mDisplaySpeedMetersPerSecond;
            carValue3.getClass();
            CarValue carValue4 = speed.mDisplaySpeedMetersPerSecond;
            carValue4.getClass();
            return AnonymousClass026.A00(carValue3, carValue4) && AnonymousClass026.A00(this.mSpeedDisplayUnit, speed.mSpeedDisplayUnit);
        }
    }

    public int hashCode() {
        Object[] objArr = new Object[3];
        CarValue carValue = this.mRawSpeedMetersPerSecond;
        carValue.getClass();
        objArr[0] = carValue;
        CarValue carValue2 = this.mDisplaySpeedMetersPerSecond;
        carValue2.getClass();
        objArr[1] = carValue2;
        return AnonymousClass000.A0P(this.mSpeedDisplayUnit, objArr, 2);
    }

    public Speed() {
        CarValue carValue = CarValue.A03;
        this.mRawSpeedMetersPerSecond = carValue;
        this.mDisplaySpeedMetersPerSecond = carValue;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("[ raw speed: ");
        CarValue carValue = this.mRawSpeedMetersPerSecond;
        carValue.getClass();
        A10.append(carValue);
        A10.append(", display speed: ");
        CarValue carValue2 = this.mDisplaySpeedMetersPerSecond;
        carValue2.getClass();
        A10.append(carValue2);
        A10.append(", speed display unit: ");
        return AnonymousClass001.A1G(this.mSpeedDisplayUnit, A10);
    }
}
