package androidx.car.app.model;

import X.AnonymousClass000;
import X.AnonymousClass026;
import X.C15450qe;

public final class GridItem {
    public final CarIcon mImage = null;
    public final int mImageType = 2;
    public final boolean mIsLoading = false;
    public final C15450qe mOnClickDelegate = null;
    public final CarText mText = null;
    public final CarText mTitle = null;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GridItem)) {
            return false;
        }
        GridItem gridItem = (GridItem) obj;
        return this.mIsLoading == gridItem.mIsLoading && AnonymousClass026.A00(this.mTitle, gridItem.mTitle) && AnonymousClass026.A00(this.mText, gridItem.mText) && AnonymousClass026.A00(this.mImage, gridItem.mImage) && AnonymousClass026.A01(Boolean.valueOf(AnonymousClass000.A1X(this.mOnClickDelegate)), AnonymousClass000.A1X(gridItem.mOnClickDelegate)) && this.mImageType == gridItem.mImageType;
    }

    public int hashCode() {
        Object[] objArr = new Object[5];
        boolean z = false;
        objArr[0] = Boolean.valueOf(this.mIsLoading);
        objArr[1] = this.mTitle;
        objArr[2] = this.mImage;
        objArr[3] = Integer.valueOf(this.mImageType);
        if (this.mOnClickDelegate == null) {
            z = true;
        }
        return AnonymousClass000.A0P(Boolean.valueOf(z), objArr, 4);
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("[title: ");
        AnonymousClass000.A1B(this.mTitle, A10);
        A10.append(", text: ");
        AnonymousClass000.A1B(this.mText, A10);
        A10.append(", image: ");
        A10.append(this.mImage);
        A10.append(", isLoading: ");
        A10.append(this.mIsLoading);
        return AnonymousClass000.A0z(A10);
    }
}
