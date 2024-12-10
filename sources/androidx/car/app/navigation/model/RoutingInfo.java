package androidx.car.app.navigation.model;

import X.AnonymousClass000;
import X.AnonymousClass026;
import X.C15580qr;
import androidx.car.app.model.CarIcon;
import androidx.car.app.model.Distance;

public final class RoutingInfo implements C15580qr {
    public final Distance mCurrentDistance = null;
    public final Step mCurrentStep = null;
    public final boolean mIsLoading = false;
    public final CarIcon mJunctionImage = null;
    public final Step mNextStep = null;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RoutingInfo)) {
            return false;
        }
        RoutingInfo routingInfo = (RoutingInfo) obj;
        return this.mIsLoading == routingInfo.mIsLoading && AnonymousClass026.A00(this.mCurrentStep, routingInfo.mCurrentStep) && AnonymousClass026.A00(this.mCurrentDistance, routingInfo.mCurrentDistance) && AnonymousClass026.A00(this.mNextStep, routingInfo.mNextStep) && AnonymousClass026.A00(this.mJunctionImage, routingInfo.mJunctionImage);
    }

    public int hashCode() {
        Object[] objArr = new Object[5];
        objArr[0] = this.mCurrentStep;
        objArr[1] = this.mCurrentDistance;
        objArr[2] = this.mNextStep;
        objArr[3] = this.mJunctionImage;
        return AnonymousClass000.A0P(Boolean.valueOf(this.mIsLoading), objArr, 4);
    }

    public String toString() {
        return "RoutingInfo";
    }
}
