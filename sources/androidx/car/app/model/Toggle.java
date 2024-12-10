package androidx.car.app.model;

import X.AnonymousClass000;
import X.C15440qd;

public final class Toggle {
    public final boolean mIsChecked = false;
    public final boolean mIsEnabled = true;
    public final C15440qd mOnCheckedChangeDelegate = null;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Toggle)) {
            return false;
        }
        Toggle toggle = (Toggle) obj;
        return this.mIsChecked == toggle.mIsChecked && this.mIsEnabled == toggle.mIsEnabled;
    }

    public int hashCode() {
        Object[] objArr = new Object[2];
        AnonymousClass000.A1N(objArr, this.mIsChecked);
        return AnonymousClass000.A0P(Boolean.valueOf(this.mIsEnabled), objArr, 1);
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("[ isChecked: ");
        A10.append(this.mIsChecked);
        A10.append(", isEnabled: ");
        A10.append(this.mIsEnabled);
        return AnonymousClass000.A0z(A10);
    }
}
