package androidx.car.app.model;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass026;
import X.C15450qe;
import java.util.Collections;
import java.util.List;

public final class Row {
    public final List mActions = Collections.emptyList();
    public final CarIcon mImage = null;
    public final boolean mIsBrowsable = false;
    public final boolean mIsEnabled = true;
    public final Metadata mMetadata = Metadata.A00;
    public final int mNumericDecoration = -1;
    public final C15450qe mOnClickDelegate = null;
    public final int mRowImageType = 1;
    public final List mTexts = Collections.emptyList();
    public final CarText mTitle = null;
    public final Toggle mToggle = null;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Row)) {
            return false;
        }
        Row row = (Row) obj;
        return AnonymousClass026.A00(this.mTitle, row.mTitle) && AnonymousClass026.A00(this.mTexts, row.mTexts) && AnonymousClass026.A00(this.mImage, row.mImage) && AnonymousClass026.A00(this.mToggle, row.mToggle) && AnonymousClass026.A01(Boolean.valueOf(AnonymousClass000.A1X(this.mOnClickDelegate)), AnonymousClass000.A1X(row.mOnClickDelegate)) && AnonymousClass026.A00(this.mMetadata, row.mMetadata) && this.mIsBrowsable == row.mIsBrowsable && this.mRowImageType == row.mRowImageType && this.mIsEnabled == row.mIsEnabled;
    }

    public int hashCode() {
        Object[] objArr = new Object[9];
        boolean z = false;
        objArr[0] = this.mTitle;
        objArr[1] = this.mTexts;
        objArr[2] = this.mImage;
        objArr[3] = this.mToggle;
        if (this.mOnClickDelegate == null) {
            z = true;
        }
        objArr[4] = Boolean.valueOf(z);
        objArr[5] = this.mMetadata;
        objArr[6] = Boolean.valueOf(this.mIsBrowsable);
        objArr[7] = Integer.valueOf(this.mRowImageType);
        return AnonymousClass000.A0P(Boolean.valueOf(this.mIsEnabled), objArr, 8);
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("[title: ");
        AnonymousClass000.A1B(this.mTitle, A10);
        A10.append(", text count: ");
        A10.append(AnonymousClass001.A0m(this.mTexts));
        A10.append(", image: ");
        A10.append(this.mImage);
        A10.append(", isBrowsable: ");
        A10.append(this.mIsBrowsable);
        A10.append(", isEnabled: ");
        A10.append(this.mIsEnabled);
        return AnonymousClass000.A0z(A10);
    }
}
