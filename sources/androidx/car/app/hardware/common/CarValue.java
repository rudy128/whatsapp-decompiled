package androidx.car.app.hardware.common;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass026;
import java.util.Collections;
import java.util.List;

public final class CarValue {
    public static final CarValue A00 = new CarValue(2);
    public static final CarValue A01 = new CarValue(2);
    public static final CarValue A02 = new CarValue(0);
    public static final CarValue A03 = new CarValue(0);
    public static final CarValue A04 = new CarValue(0);
    public static final CarValue A05 = new CarValue(0);
    public static final CarValue A06 = new CarValue(0);
    public static final CarValue A07 = new CarValue(0);
    public final List mCarZones;
    public final int mStatus;
    public final long mTimestampMillis;
    public final Object mValue;

    public CarValue(int i) {
        this.mValue = null;
        this.mTimestampMillis = 0;
        this.mStatus = i;
        this.mCarZones = Collections.singletonList(CarZone.A00);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CarValue)) {
            return false;
        }
        CarValue carValue = (CarValue) obj;
        return AnonymousClass026.A00(this.mValue, carValue.mValue) && this.mTimestampMillis == carValue.mTimestampMillis && this.mStatus == carValue.mStatus && AnonymousClass026.A00(this.mCarZones, carValue.mCarZones);
    }

    public int hashCode() {
        Object[] objArr = new Object[4];
        objArr[0] = this.mValue;
        objArr[1] = Long.valueOf(this.mTimestampMillis);
        objArr[2] = Integer.valueOf(this.mStatus);
        return AnonymousClass000.A0P(this.mCarZones, objArr, 3);
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("[value: ");
        A10.append(this.mValue);
        A10.append(", timestamp: ");
        A10.append(this.mTimestampMillis);
        A10.append(", Status: ");
        A10.append(this.mStatus);
        A10.append(", CarZones: ");
        return AnonymousClass001.A1G(this.mCarZones, A10);
    }

    public CarValue() {
        this.mValue = null;
        this.mTimestampMillis = 0;
        this.mStatus = 0;
        this.mCarZones = Collections.emptyList();
    }
}
