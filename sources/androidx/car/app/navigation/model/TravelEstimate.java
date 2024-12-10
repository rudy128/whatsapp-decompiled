package androidx.car.app.navigation.model;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass026;
import androidx.car.app.model.CarColor;
import androidx.car.app.model.CarIcon;
import androidx.car.app.model.CarText;
import androidx.car.app.model.DateTimeWithZone;
import androidx.car.app.model.Distance;

public final class TravelEstimate {
    public final DateTimeWithZone mArrivalTimeAtDestination = null;
    public final Distance mRemainingDistance = null;
    public final CarColor mRemainingDistanceColor;
    public final CarColor mRemainingTimeColor;
    public final long mRemainingTimeSeconds = 0;
    public final CarIcon mTripIcon;
    public final CarText mTripText;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TravelEstimate)) {
            return false;
        }
        TravelEstimate travelEstimate = (TravelEstimate) obj;
        return AnonymousClass026.A00(this.mRemainingDistance, travelEstimate.mRemainingDistance) && this.mRemainingTimeSeconds == travelEstimate.mRemainingTimeSeconds && AnonymousClass026.A00(this.mArrivalTimeAtDestination, travelEstimate.mArrivalTimeAtDestination) && AnonymousClass026.A00(this.mRemainingTimeColor, travelEstimate.mRemainingTimeColor) && AnonymousClass026.A00(this.mRemainingDistanceColor, travelEstimate.mRemainingDistanceColor) && AnonymousClass026.A00(this.mTripText, travelEstimate.mTripText) && AnonymousClass026.A00(this.mTripIcon, travelEstimate.mTripIcon);
    }

    public int hashCode() {
        Object[] objArr = new Object[7];
        objArr[0] = this.mRemainingDistance;
        objArr[1] = Long.valueOf(this.mRemainingTimeSeconds);
        objArr[2] = this.mArrivalTimeAtDestination;
        objArr[3] = this.mRemainingTimeColor;
        objArr[4] = this.mRemainingDistanceColor;
        objArr[5] = this.mTripText;
        return AnonymousClass000.A0P(this.mTripIcon, objArr, 6);
    }

    public TravelEstimate() {
        CarColor carColor = CarColor.A00;
        this.mRemainingTimeColor = carColor;
        this.mRemainingDistanceColor = carColor;
        this.mTripText = null;
        this.mTripIcon = null;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("[ remaining distance: ");
        A10.append(this.mRemainingDistance);
        A10.append(", time (s): ");
        A10.append(this.mRemainingTimeSeconds);
        A10.append(", ETA: ");
        return AnonymousClass001.A1G(this.mArrivalTimeAtDestination, A10);
    }
}
