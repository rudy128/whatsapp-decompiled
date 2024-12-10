package androidx.car.app.navigation.model;

import X.AnonymousClass000;
import X.AnonymousClass026;
import X.C15470qg;
import X.C15550qo;
import X.C15590qs;
import androidx.car.app.model.Action;
import androidx.car.app.model.ActionStrip;
import androidx.car.app.model.CarText;
import androidx.car.app.model.Header;
import androidx.car.app.model.ItemList;

public final class PlaceListNavigationTemplate implements C15550qo {
    public final ActionStrip mActionStrip = null;
    public final Header mHeader = null;
    @Deprecated
    public final Action mHeaderAction = null;
    public final boolean mIsLoading = false;
    public final ItemList mItemList = null;
    public final ActionStrip mMapActionStrip = null;
    public final C15470qg mOnContentRefreshDelegate = null;
    public final C15590qs mPanModeDelegate = null;
    @Deprecated
    public final CarText mTitle = null;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PlaceListNavigationTemplate)) {
            return false;
        }
        PlaceListNavigationTemplate placeListNavigationTemplate = (PlaceListNavigationTemplate) obj;
        return this.mIsLoading == placeListNavigationTemplate.mIsLoading && AnonymousClass026.A00(this.mTitle, placeListNavigationTemplate.mTitle) && AnonymousClass026.A00(this.mItemList, placeListNavigationTemplate.mItemList) && AnonymousClass026.A00(this.mHeaderAction, placeListNavigationTemplate.mHeaderAction) && AnonymousClass026.A00(this.mActionStrip, placeListNavigationTemplate.mActionStrip) && AnonymousClass026.A00(this.mMapActionStrip, placeListNavigationTemplate.mMapActionStrip) && AnonymousClass026.A01(Boolean.valueOf(AnonymousClass000.A1X(this.mPanModeDelegate)), AnonymousClass000.A1X(placeListNavigationTemplate.mPanModeDelegate)) && AnonymousClass026.A01(Boolean.valueOf(AnonymousClass000.A1X(this.mOnContentRefreshDelegate)), AnonymousClass000.A1X(placeListNavigationTemplate.mOnContentRefreshDelegate)) && AnonymousClass026.A00(this.mHeader, placeListNavigationTemplate.mHeader);
    }

    public int hashCode() {
        Object[] objArr = new Object[9];
        boolean z = false;
        objArr[0] = this.mTitle;
        objArr[1] = Boolean.valueOf(this.mIsLoading);
        objArr[2] = this.mItemList;
        objArr[3] = this.mHeaderAction;
        objArr[4] = this.mActionStrip;
        objArr[5] = this.mMapActionStrip;
        objArr[6] = Boolean.valueOf(AnonymousClass000.A1X(this.mPanModeDelegate));
        if (this.mOnContentRefreshDelegate == null) {
            z = true;
        }
        objArr[7] = Boolean.valueOf(z);
        return AnonymousClass000.A0P(this.mHeader, objArr, 8);
    }

    public String toString() {
        return "PlaceListNavigationTemplate";
    }
}
