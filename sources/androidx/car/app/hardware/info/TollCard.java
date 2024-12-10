package androidx.car.app.hardware.info;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass026;
import androidx.car.app.hardware.common.CarValue;

public final class TollCard {
    public final CarValue mCardState = CarValue.A05;

    public int hashCode() {
        return AnonymousClass000.A0P(this.mCardState, new Object[1], 0);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TollCard)) {
            return false;
        }
        return AnonymousClass026.A00(this.mCardState, ((TollCard) obj).mCardState);
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("[ tollcard state: ");
        return AnonymousClass001.A1G(this.mCardState, A10);
    }
}
