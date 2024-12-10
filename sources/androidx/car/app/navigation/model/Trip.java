package androidx.car.app.navigation.model;

import X.AnonymousClass000;
import X.AnonymousClass026;
import androidx.car.app.model.CarText;
import java.util.Collections;
import java.util.List;

public final class Trip {
    public final CarText mCurrentRoad = null;
    public final List mDestinationTravelEstimates = Collections.emptyList();
    public final List mDestinations = Collections.emptyList();
    public final boolean mIsLoading = false;
    public final List mStepTravelEstimates = Collections.emptyList();
    public final List mSteps = Collections.emptyList();

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Trip)) {
            return false;
        }
        Trip trip = (Trip) obj;
        return AnonymousClass026.A00(this.mDestinations, trip.mDestinations) && AnonymousClass026.A00(this.mSteps, trip.mSteps) && AnonymousClass026.A00(this.mDestinationTravelEstimates, trip.mDestinationTravelEstimates) && AnonymousClass026.A00(this.mStepTravelEstimates, trip.mStepTravelEstimates) && AnonymousClass026.A00(this.mCurrentRoad, trip.mCurrentRoad) && AnonymousClass026.A01(Boolean.valueOf(this.mIsLoading), trip.mIsLoading);
    }

    public int hashCode() {
        Object[] objArr = new Object[5];
        objArr[0] = this.mDestinations;
        objArr[1] = this.mSteps;
        objArr[2] = this.mDestinationTravelEstimates;
        objArr[3] = this.mStepTravelEstimates;
        return AnonymousClass000.A0P(this.mCurrentRoad, objArr, 4);
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("[ destinations : ");
        A10.append(this.mDestinations.toString());
        A10.append(", steps: ");
        A10.append(this.mSteps.toString());
        A10.append(", dest estimates: ");
        A10.append(this.mDestinationTravelEstimates.toString());
        A10.append(", step estimates: ");
        A10.append(this.mStepTravelEstimates.toString());
        A10.append(", road: ");
        AnonymousClass000.A1B(this.mCurrentRoad, A10);
        A10.append(", isLoading: ");
        A10.append(this.mIsLoading);
        return AnonymousClass000.A0z(A10);
    }
}
