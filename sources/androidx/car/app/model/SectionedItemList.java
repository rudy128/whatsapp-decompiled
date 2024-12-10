package androidx.car.app.model;

import X.AnonymousClass000;
import X.AnonymousClass026;

public final class SectionedItemList {
    public final CarText mHeader = null;
    public final ItemList mItemList = null;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SectionedItemList)) {
            return false;
        }
        SectionedItemList sectionedItemList = (SectionedItemList) obj;
        return AnonymousClass026.A00(this.mItemList, sectionedItemList.mItemList) && AnonymousClass026.A00(this.mHeader, sectionedItemList.mHeader);
    }

    public int hashCode() {
        Object[] objArr = new Object[2];
        objArr[0] = this.mItemList;
        return AnonymousClass000.A0P(this.mHeader, objArr, 1);
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("[ items: ");
        A10.append(this.mItemList);
        A10.append(", has header: ");
        A10.append(AnonymousClass000.A1W(this.mHeader));
        return AnonymousClass000.A0z(A10);
    }
}
