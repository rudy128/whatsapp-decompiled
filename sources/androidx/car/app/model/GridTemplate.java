package androidx.car.app.model;

import X.AnonymousClass000;
import X.AnonymousClass026;
import X.C15550qo;

public final class GridTemplate implements C15550qo {
    public final ActionStrip mActionStrip = null;
    public final Action mHeaderAction = null;
    public final boolean mIsLoading = false;
    public final ItemList mSingleList = null;
    public final CarText mTitle = null;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GridTemplate)) {
            return false;
        }
        GridTemplate gridTemplate = (GridTemplate) obj;
        return this.mIsLoading == gridTemplate.mIsLoading && AnonymousClass026.A00(this.mTitle, gridTemplate.mTitle) && AnonymousClass026.A00(this.mHeaderAction, gridTemplate.mHeaderAction) && AnonymousClass026.A00(this.mSingleList, gridTemplate.mSingleList) && AnonymousClass026.A00(this.mActionStrip, gridTemplate.mActionStrip);
    }

    public int hashCode() {
        Object[] objArr = new Object[5];
        AnonymousClass000.A1N(objArr, this.mIsLoading);
        objArr[1] = this.mTitle;
        objArr[2] = this.mHeaderAction;
        objArr[3] = this.mSingleList;
        return AnonymousClass000.A0P(this.mActionStrip, objArr, 4);
    }

    public String toString() {
        return "GridTemplate";
    }
}
