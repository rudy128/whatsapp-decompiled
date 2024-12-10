package androidx.car.app.navigation.model;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass026;
import androidx.car.app.model.CarIcon;

public final class Maneuver {
    public final CarIcon mIcon = null;
    public final int mRoundaboutExitAngle = 0;
    public final int mRoundaboutExitNumber = 0;
    public final int mType = 0;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Maneuver)) {
            return false;
        }
        Maneuver maneuver = (Maneuver) obj;
        return this.mType == maneuver.mType && this.mRoundaboutExitNumber == maneuver.mRoundaboutExitNumber && this.mRoundaboutExitAngle == maneuver.mRoundaboutExitAngle && AnonymousClass026.A00(this.mIcon, maneuver.mIcon);
    }

    public int hashCode() {
        Object[] objArr = new Object[4];
        AnonymousClass000.A1L(objArr, this.mType);
        AnonymousClass000.A1M(objArr, this.mRoundaboutExitNumber);
        objArr[2] = Integer.valueOf(this.mRoundaboutExitAngle);
        return AnonymousClass000.A0P(this.mIcon, objArr, 3);
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("[type: ");
        A10.append(this.mType);
        A10.append(", exit #: ");
        A10.append(this.mRoundaboutExitNumber);
        A10.append(", exit angle: ");
        A10.append(this.mRoundaboutExitAngle);
        A10.append(", icon: ");
        return AnonymousClass001.A1G(this.mIcon, A10);
    }
}
