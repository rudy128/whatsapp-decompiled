package androidx.car.app.navigation.model;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass026;
import androidx.car.app.model.CarIcon;
import androidx.car.app.model.CarText;

public final class Destination {
    public final CarText mAddress = null;
    public final CarIcon mImage = null;
    public final CarText mName = null;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Destination)) {
            return false;
        }
        Destination destination = (Destination) obj;
        return AnonymousClass026.A00(this.mName, destination.mName) && AnonymousClass026.A00(this.mAddress, destination.mAddress) && AnonymousClass026.A00(this.mImage, destination.mImage);
    }

    public int hashCode() {
        Object[] objArr = new Object[3];
        objArr[0] = this.mName;
        objArr[1] = this.mAddress;
        return AnonymousClass000.A0P(this.mImage, objArr, 2);
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("[name: ");
        AnonymousClass000.A1B(this.mName, A10);
        A10.append(", address: ");
        AnonymousClass000.A1B(this.mAddress, A10);
        A10.append(", image: ");
        return AnonymousClass001.A1G(this.mImage, A10);
    }
}
