package androidx.car.app.hardware.info;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass026;
import androidx.car.app.hardware.common.CarValue;

public final class EnergyProfile {
    public final CarValue mEvConnectorTypes;
    public final CarValue mFuelTypes;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EnergyProfile)) {
            return false;
        }
        EnergyProfile energyProfile = (EnergyProfile) obj;
        return AnonymousClass026.A00(this.mEvConnectorTypes, energyProfile.mEvConnectorTypes) && AnonymousClass026.A00(this.mFuelTypes, energyProfile.mFuelTypes);
    }

    public int hashCode() {
        Object[] objArr = new Object[2];
        objArr[0] = this.mEvConnectorTypes;
        return AnonymousClass000.A0P(this.mFuelTypes, objArr, 1);
    }

    public EnergyProfile() {
        CarValue carValue = CarValue.A06;
        this.mEvConnectorTypes = carValue;
        this.mFuelTypes = carValue;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("[ evConnectorTypes: ");
        A10.append(this.mEvConnectorTypes);
        A10.append(", fuelTypes: ");
        return AnonymousClass001.A1G(this.mFuelTypes, A10);
    }
}
