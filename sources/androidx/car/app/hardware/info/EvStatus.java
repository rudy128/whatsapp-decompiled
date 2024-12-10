package androidx.car.app.hardware.info;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass026;
import androidx.car.app.hardware.common.CarValue;

public class EvStatus {
    public final CarValue mEvChargePortConnected;
    public final CarValue mEvChargePortOpen;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EvStatus)) {
            return false;
        }
        EvStatus evStatus = (EvStatus) obj;
        return AnonymousClass026.A00(this.mEvChargePortConnected, evStatus.mEvChargePortConnected) && AnonymousClass026.A00(this.mEvChargePortOpen, evStatus.mEvChargePortOpen);
    }

    public int hashCode() {
        Object[] objArr = new Object[2];
        objArr[0] = this.mEvChargePortOpen;
        return AnonymousClass000.A0P(this.mEvChargePortConnected, objArr, 1);
    }

    public EvStatus() {
        CarValue carValue = CarValue.A02;
        this.mEvChargePortOpen = carValue;
        this.mEvChargePortConnected = carValue;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("[ EV charge port open: ");
        A10.append(this.mEvChargePortOpen);
        A10.append(", EV charge port connected: ");
        return AnonymousClass001.A1G(this.mEvChargePortConnected, A10);
    }
}
