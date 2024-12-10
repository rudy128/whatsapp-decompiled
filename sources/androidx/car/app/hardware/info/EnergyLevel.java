package androidx.car.app.hardware.info;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass026;
import androidx.car.app.hardware.common.CarValue;

public final class EnergyLevel {
    public final CarValue mBatteryPercent;
    public final CarValue mDistanceDisplayUnit;
    public final CarValue mEnergyIsLow = CarValue.A02;
    public final CarValue mFuelPercent;
    public final CarValue mFuelVolumeDisplayUnit;
    public final CarValue mRangeRemainingMeters;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EnergyLevel)) {
            return false;
        }
        EnergyLevel energyLevel = (EnergyLevel) obj;
        if (AnonymousClass026.A00(this.mBatteryPercent, energyLevel.mBatteryPercent) && AnonymousClass026.A00(this.mFuelPercent, energyLevel.mFuelPercent) && AnonymousClass026.A00(this.mEnergyIsLow, energyLevel.mEnergyIsLow)) {
            CarValue carValue = this.mRangeRemainingMeters;
            carValue.getClass();
            CarValue carValue2 = energyLevel.mRangeRemainingMeters;
            carValue2.getClass();
            return AnonymousClass026.A00(carValue, carValue2) && AnonymousClass026.A00(this.mDistanceDisplayUnit, energyLevel.mDistanceDisplayUnit) && AnonymousClass026.A00(this.mFuelVolumeDisplayUnit, energyLevel.mFuelVolumeDisplayUnit);
        }
    }

    public int hashCode() {
        Object[] objArr = new Object[6];
        objArr[0] = this.mBatteryPercent;
        objArr[1] = this.mFuelPercent;
        objArr[2] = this.mEnergyIsLow;
        CarValue carValue = this.mRangeRemainingMeters;
        carValue.getClass();
        objArr[3] = carValue;
        objArr[4] = this.mDistanceDisplayUnit;
        return AnonymousClass000.A0P(this.mFuelVolumeDisplayUnit, objArr, 5);
    }

    public EnergyLevel() {
        CarValue carValue = CarValue.A03;
        this.mBatteryPercent = carValue;
        this.mFuelPercent = carValue;
        this.mRangeRemainingMeters = carValue;
        CarValue carValue2 = CarValue.A05;
        this.mDistanceDisplayUnit = carValue2;
        this.mFuelVolumeDisplayUnit = carValue2;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("[ battery percent: ");
        A10.append(this.mBatteryPercent);
        A10.append(", fuel percent: ");
        A10.append(this.mFuelPercent);
        A10.append(", energyIsLow: ");
        A10.append(this.mEnergyIsLow);
        A10.append(", range remaining: ");
        CarValue carValue = this.mRangeRemainingMeters;
        carValue.getClass();
        A10.append(carValue);
        A10.append(", distance display unit: ");
        A10.append(this.mDistanceDisplayUnit);
        A10.append(", fuel volume display unit: ");
        return AnonymousClass001.A1G(this.mFuelVolumeDisplayUnit, A10);
    }
}
