package androidx.car.app.navigation.model;

import X.AnonymousClass000;
import X.AnonymousClass026;
import X.C15550qo;
import X.C15590qs;
import androidx.car.app.model.Action;
import androidx.car.app.model.ActionStrip;
import androidx.car.app.model.CarText;
import androidx.car.app.model.Header;
import androidx.car.app.model.ItemList;

public final class RoutePreviewNavigationTemplate implements C15550qo {
    public final ActionStrip mActionStrip = null;
    public final Header mHeader = null;
    @Deprecated
    public final Action mHeaderAction = null;
    public final boolean mIsLoading = false;
    public final ItemList mItemList = null;
    public final ActionStrip mMapActionStrip = null;
    public final Action mNavigateAction = null;
    public final C15590qs mPanModeDelegate = null;
    @Deprecated
    public final CarText mTitle = null;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RoutePreviewNavigationTemplate)) {
            return false;
        }
        RoutePreviewNavigationTemplate routePreviewNavigationTemplate = (RoutePreviewNavigationTemplate) obj;
        return this.mIsLoading == routePreviewNavigationTemplate.mIsLoading && AnonymousClass026.A00(this.mTitle, routePreviewNavigationTemplate.mTitle) && AnonymousClass026.A00(this.mNavigateAction, routePreviewNavigationTemplate.mNavigateAction) && AnonymousClass026.A00(this.mItemList, routePreviewNavigationTemplate.mItemList) && AnonymousClass026.A00(this.mHeaderAction, routePreviewNavigationTemplate.mHeaderAction) && AnonymousClass026.A00(this.mActionStrip, routePreviewNavigationTemplate.mActionStrip) && AnonymousClass026.A00(this.mMapActionStrip, routePreviewNavigationTemplate.mMapActionStrip) && AnonymousClass026.A01(Boolean.valueOf(AnonymousClass000.A1X(this.mPanModeDelegate)), AnonymousClass000.A1X(routePreviewNavigationTemplate.mPanModeDelegate)) && AnonymousClass026.A00(this.mHeader, routePreviewNavigationTemplate.mHeader);
    }

    public int hashCode() {
        Object[] objArr = new Object[9];
        boolean z = false;
        objArr[0] = this.mTitle;
        objArr[1] = Boolean.valueOf(this.mIsLoading);
        objArr[2] = this.mNavigateAction;
        objArr[3] = this.mItemList;
        objArr[4] = this.mHeaderAction;
        objArr[5] = this.mActionStrip;
        objArr[6] = this.mMapActionStrip;
        if (this.mPanModeDelegate == null) {
            z = true;
        }
        objArr[7] = Boolean.valueOf(z);
        return AnonymousClass000.A0P(this.mHeader, objArr, 8);
    }

    public String toString() {
        return "RoutePreviewNavigationTemplate";
    }
}
