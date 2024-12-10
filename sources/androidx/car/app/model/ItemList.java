package androidx.car.app.model;

import X.AnonymousClass000;
import X.AnonymousClass026;
import X.C15490qi;
import X.C15500qj;
import java.util.Collections;
import java.util.List;

public final class ItemList {
    public final List mItems = Collections.emptyList();
    public final CarText mNoItemsMessage = null;
    public final C15490qi mOnItemVisibilityChangedDelegate = null;
    public final C15500qj mOnSelectedDelegate = null;
    public final int mSelectedIndex = 0;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ItemList)) {
            return false;
        }
        ItemList itemList = (ItemList) obj;
        return this.mSelectedIndex == itemList.mSelectedIndex && AnonymousClass026.A00(this.mItems, itemList.mItems) && AnonymousClass026.A01(Boolean.valueOf(AnonymousClass000.A1X(this.mOnSelectedDelegate)), AnonymousClass000.A1X(itemList.mOnSelectedDelegate)) && AnonymousClass026.A01(Boolean.valueOf(AnonymousClass000.A1X(this.mOnItemVisibilityChangedDelegate)), AnonymousClass000.A1X(itemList.mOnItemVisibilityChangedDelegate)) && AnonymousClass026.A00(this.mNoItemsMessage, itemList.mNoItemsMessage);
    }

    public int hashCode() {
        Object[] objArr = new Object[5];
        boolean z = false;
        objArr[0] = Integer.valueOf(this.mSelectedIndex);
        objArr[1] = this.mItems;
        objArr[2] = Boolean.valueOf(AnonymousClass000.A1X(this.mOnSelectedDelegate));
        if (this.mOnItemVisibilityChangedDelegate == null) {
            z = true;
        }
        objArr[3] = Boolean.valueOf(z);
        return AnonymousClass000.A0P(this.mNoItemsMessage, objArr, 4);
    }

    public String toString() {
        String str;
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("[ items: ");
        List list = this.mItems;
        if (list != null) {
            str = list.toString();
        } else {
            str = null;
        }
        A10.append(str);
        A10.append(", selected: ");
        A10.append(this.mSelectedIndex);
        return AnonymousClass000.A0z(A10);
    }
}
