package androidx.car.app.model;

import X.AnonymousClass000;
import X.AnonymousClass026;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public final class DateTimeWithZone {
    public final long mTimeSinceEpochMillis = 0;
    public final int mZoneOffsetSeconds = 0;
    public final String mZoneShortName = null;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DateTimeWithZone)) {
            return false;
        }
        DateTimeWithZone dateTimeWithZone = (DateTimeWithZone) obj;
        return this.mTimeSinceEpochMillis == dateTimeWithZone.mTimeSinceEpochMillis && this.mZoneOffsetSeconds == dateTimeWithZone.mZoneOffsetSeconds && AnonymousClass026.A00(this.mZoneShortName, dateTimeWithZone.mZoneShortName);
    }

    public int hashCode() {
        Object[] objArr = new Object[3];
        objArr[0] = Long.valueOf(this.mTimeSinceEpochMillis);
        AnonymousClass000.A1M(objArr, this.mZoneOffsetSeconds);
        return AnonymousClass000.A0P(this.mZoneShortName, objArr, 2);
    }

    static {
        TimeUnit.HOURS.toSeconds(1);
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("[time since epoch (ms): ");
        long j = this.mTimeSinceEpochMillis;
        A10.append(j);
        A10.append("( ");
        A10.append(new Date(j));
        A10.append(")  zone offset (s): ");
        A10.append(this.mZoneOffsetSeconds);
        A10.append(", zone: ");
        A10.append(this.mZoneShortName);
        return AnonymousClass000.A0z(A10);
    }
}
