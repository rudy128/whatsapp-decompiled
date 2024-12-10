package androidx.car.app.model;

import X.AnonymousClass000;
import X.AnonymousClass026;
import X.C15470qg;
import X.C15550qo;

public final class PlaceListMapTemplate implements C15550qo {
    public final ActionStrip mActionStrip = null;
    public final Place mAnchor = null;
    public final Action mHeaderAction = null;
    public final boolean mIsLoading = false;
    public final ItemList mItemList = null;
    public final C15470qg mOnContentRefreshDelegate = null;
    public final boolean mShowCurrentLocation = false;
    public final CarText mTitle = null;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PlaceListMapTemplate)) {
            return false;
        }
        PlaceListMapTemplate placeListMapTemplate = (PlaceListMapTemplate) obj;
        return this.mShowCurrentLocation == placeListMapTemplate.mShowCurrentLocation && this.mIsLoading == placeListMapTemplate.mIsLoading && AnonymousClass026.A00(this.mTitle, placeListMapTemplate.mTitle) && AnonymousClass026.A00(this.mItemList, placeListMapTemplate.mItemList) && AnonymousClass026.A00(this.mHeaderAction, placeListMapTemplate.mHeaderAction) && AnonymousClass026.A00(this.mActionStrip, placeListMapTemplate.mActionStrip) && AnonymousClass026.A00(this.mAnchor, placeListMapTemplate.mAnchor) && AnonymousClass026.A01(Boolean.valueOf(AnonymousClass000.A1X(this.mOnContentRefreshDelegate)), AnonymousClass000.A1X(placeListMapTemplate.mOnContentRefreshDelegate));
    }

    public int hashCode() {
        Object[] objArr = new Object[8];
        boolean z = false;
        objArr[0] = Boolean.valueOf(this.mShowCurrentLocation);
        objArr[1] = Boolean.valueOf(this.mIsLoading);
        objArr[2] = this.mTitle;
        objArr[3] = this.mItemList;
        objArr[4] = this.mHeaderAction;
        objArr[5] = this.mActionStrip;
        objArr[6] = this.mAnchor;
        if (this.mOnContentRefreshDelegate == null) {
            z = true;
        }
        return AnonymousClass000.A0P(Boolean.valueOf(z), objArr, 7);
    }

    public String toString() {
        return "PlaceListMapTemplate";
    }
}
