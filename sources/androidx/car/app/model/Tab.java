package androidx.car.app.model;

import X.AnonymousClass000;
import X.AnonymousClass026;

public final class Tab {
    public final String mContentId = "EMPTY_TAB_CONTENT_ID";
    public final CarIcon mIcon = null;
    public final boolean mIsActive = false;
    public final CarText mTitle = null;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Tab)) {
            return false;
        }
        Tab tab = (Tab) obj;
        return AnonymousClass026.A00(this.mTitle, tab.mTitle) && AnonymousClass026.A00(this.mContentId, tab.mContentId) && AnonymousClass026.A00(this.mIcon, tab.mIcon) && this.mIsActive == tab.mIsActive;
    }

    public int hashCode() {
        Object[] objArr = new Object[4];
        objArr[0] = this.mTitle;
        objArr[1] = this.mContentId;
        objArr[2] = this.mIcon;
        return AnonymousClass000.A0P(Boolean.valueOf(this.mIsActive), objArr, 3);
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("[title: ");
        AnonymousClass000.A1B(this.mTitle, A10);
        A10.append(", contentId: ");
        A10.append(this.mContentId);
        A10.append(", icon: ");
        A10.append(this.mIcon);
        A10.append(", isActive ");
        A10.append(this.mIsActive);
        return AnonymousClass000.A0z(A10);
    }
}
