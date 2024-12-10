package androidx.car.app.model;

import X.AnonymousClass000;
import X.AnonymousClass026;
import X.C15510qk;
import X.C15550qo;

public final class SearchTemplate implements C15550qo {
    public final ActionStrip mActionStrip = null;
    public final Action mHeaderAction = null;
    public final String mInitialSearchText = null;
    public final boolean mIsLoading = false;
    public final ItemList mItemList = null;
    public final C15510qk mSearchCallbackDelegate = null;
    public final String mSearchHint = null;
    public final boolean mShowKeyboardByDefault = true;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SearchTemplate)) {
            return false;
        }
        SearchTemplate searchTemplate = (SearchTemplate) obj;
        return this.mIsLoading == searchTemplate.mIsLoading && AnonymousClass026.A00(this.mInitialSearchText, searchTemplate.mInitialSearchText) && AnonymousClass026.A00(this.mSearchHint, searchTemplate.mSearchHint) && AnonymousClass026.A00(this.mItemList, searchTemplate.mItemList) && AnonymousClass026.A00(this.mHeaderAction, searchTemplate.mHeaderAction) && AnonymousClass026.A00(this.mActionStrip, searchTemplate.mActionStrip) && this.mShowKeyboardByDefault == searchTemplate.mShowKeyboardByDefault;
    }

    public int hashCode() {
        Object[] objArr = new Object[7];
        objArr[0] = this.mInitialSearchText;
        objArr[1] = Boolean.valueOf(this.mIsLoading);
        objArr[2] = this.mSearchHint;
        objArr[3] = this.mItemList;
        objArr[4] = Boolean.valueOf(this.mShowKeyboardByDefault);
        objArr[5] = this.mHeaderAction;
        return AnonymousClass000.A0P(this.mActionStrip, objArr, 6);
    }

    public String toString() {
        return "SearchTemplate";
    }
}
