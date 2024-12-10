package androidx.car.app.model;

import X.AnonymousClass000;
import X.AnonymousClass026;
import X.C15450qe;

public final class Action {
    public static final Action A00 = new Action(65538);
    public static final Action A01 = new Action(65539);
    public static final Action A02 = new Action(65540);
    public final CarColor mBackgroundColor;
    public final int mFlags;
    public final CarIcon mIcon;
    public final boolean mIsEnabled;
    public final C15450qe mOnClickDelegate;
    public final CarText mTitle;
    public final int mType;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Action)) {
            return false;
        }
        Action action = (Action) obj;
        return AnonymousClass026.A00(this.mTitle, action.mTitle) && this.mType == action.mType && AnonymousClass026.A00(this.mIcon, action.mIcon) && AnonymousClass026.A01(Boolean.valueOf(AnonymousClass000.A1X(this.mOnClickDelegate)), AnonymousClass000.A1X(action.mOnClickDelegate)) && AnonymousClass026.A00(Integer.valueOf(this.mFlags), Integer.valueOf(action.mFlags)) && this.mIsEnabled == action.mIsEnabled;
    }

    public int hashCode() {
        Object[] objArr = new Object[5];
        boolean z = false;
        objArr[0] = this.mTitle;
        AnonymousClass000.A1M(objArr, this.mType);
        objArr[2] = Boolean.valueOf(AnonymousClass000.A1X(this.mOnClickDelegate));
        if (this.mIcon == null) {
            z = true;
        }
        objArr[3] = Boolean.valueOf(z);
        return AnonymousClass000.A0P(Boolean.valueOf(this.mIsEnabled), objArr, 4);
    }

    public Action(int i) {
        this.mTitle = null;
        this.mIcon = null;
        this.mBackgroundColor = CarColor.A00;
        this.mOnClickDelegate = null;
        this.mType = i;
        this.mFlags = 0;
        this.mIsEnabled = true;
    }

    public String toString() {
        String str;
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("[type: ");
        int i = this.mType;
        if (i != 1) {
            switch (i) {
                case 65538:
                    str = "APP_ICON";
                    break;
                case 65539:
                    str = "BACK";
                    break;
                case 65540:
                    str = "PAN";
                    break;
                default:
                    str = "<unknown>";
                    break;
            }
        } else {
            str = "CUSTOM";
        }
        A10.append(str);
        A10.append(", icon: ");
        A10.append(this.mIcon);
        A10.append(", bkg: ");
        A10.append(this.mBackgroundColor);
        A10.append(", isEnabled: ");
        A10.append(this.mIsEnabled);
        return AnonymousClass000.A0z(A10);
    }

    public Action() {
        this.mTitle = null;
        this.mIcon = null;
        this.mBackgroundColor = CarColor.A00;
        this.mOnClickDelegate = null;
        this.mType = 1;
        this.mFlags = 0;
        this.mIsEnabled = true;
    }
}
