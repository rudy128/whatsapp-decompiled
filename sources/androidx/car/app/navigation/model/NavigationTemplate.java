package androidx.car.app.navigation.model;

import X.AnonymousClass000;
import X.AnonymousClass026;
import X.C15550qo;
import X.C15580qr;
import X.C15590qs;
import androidx.car.app.model.ActionStrip;
import androidx.car.app.model.CarColor;
import androidx.car.app.model.Toggle;

public final class NavigationTemplate implements C15550qo {
    public final ActionStrip mActionStrip = null;
    public final CarColor mBackgroundColor = null;
    public final TravelEstimate mDestinationTravelEstimate = null;
    public final ActionStrip mMapActionStrip = null;
    public final C15580qr mNavigationInfo = null;
    public final C15590qs mPanModeDelegate = null;
    public final Toggle mPanModeToggle = null;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NavigationTemplate)) {
            return false;
        }
        NavigationTemplate navigationTemplate = (NavigationTemplate) obj;
        return AnonymousClass026.A00(this.mNavigationInfo, navigationTemplate.mNavigationInfo) && AnonymousClass026.A00(this.mBackgroundColor, navigationTemplate.mBackgroundColor) && AnonymousClass026.A00(this.mDestinationTravelEstimate, navigationTemplate.mDestinationTravelEstimate) && AnonymousClass026.A00(this.mActionStrip, navigationTemplate.mActionStrip) && AnonymousClass026.A00(this.mMapActionStrip, navigationTemplate.mMapActionStrip) && AnonymousClass026.A00(this.mPanModeToggle, navigationTemplate.mPanModeToggle) && AnonymousClass026.A01(Boolean.valueOf(AnonymousClass000.A1X(this.mPanModeDelegate)), AnonymousClass000.A1X(navigationTemplate.mPanModeDelegate));
    }

    public int hashCode() {
        Object[] objArr = new Object[7];
        boolean z = false;
        objArr[0] = this.mNavigationInfo;
        objArr[1] = this.mBackgroundColor;
        objArr[2] = this.mDestinationTravelEstimate;
        objArr[3] = this.mActionStrip;
        objArr[4] = this.mMapActionStrip;
        objArr[5] = this.mPanModeToggle;
        if (this.mPanModeDelegate == null) {
            z = true;
        }
        return AnonymousClass000.A0P(Boolean.valueOf(z), objArr, 6);
    }

    public String toString() {
        return "NavigationTemplate";
    }
}
