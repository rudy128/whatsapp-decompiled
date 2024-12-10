package androidx.car.app.model;

import X.AnonymousClass000;
import X.AnonymousClass026;
import X.C15550qo;
import java.util.Collections;
import java.util.List;

public final class ListTemplate implements C15550qo {
    public final ActionStrip mActionStrip = null;
    public final Action mHeaderAction = null;
    public final boolean mIsLoading = false;
    public final List mSectionedLists = Collections.emptyList();
    public final ItemList mSingleList = null;
    public final CarText mTitle = null;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ListTemplate)) {
            return false;
        }
        ListTemplate listTemplate = (ListTemplate) obj;
        return this.mIsLoading == listTemplate.mIsLoading && AnonymousClass026.A00(this.mTitle, listTemplate.mTitle) && AnonymousClass026.A00(this.mHeaderAction, listTemplate.mHeaderAction) && AnonymousClass026.A00(this.mSingleList, listTemplate.mSingleList) && AnonymousClass026.A00(this.mSectionedLists, listTemplate.mSectionedLists) && AnonymousClass026.A00(this.mActionStrip, listTemplate.mActionStrip);
    }

    public int hashCode() {
        Object[] objArr = new Object[6];
        AnonymousClass000.A1N(objArr, this.mIsLoading);
        objArr[1] = this.mTitle;
        objArr[2] = this.mHeaderAction;
        objArr[3] = this.mSingleList;
        objArr[4] = this.mSectionedLists;
        return AnonymousClass000.A0P(this.mActionStrip, objArr, 5);
    }

    public String toString() {
        return "ListTemplate";
    }
}
