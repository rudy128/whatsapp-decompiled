package androidx.car.app.model;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.C15390qY;
import java.util.Arrays;
import java.util.List;

public final class Alert {
    public final List mActions = AnonymousClass000.A13();
    public final C15390qY mCallbackDelegate = null;
    public final long mDuration = 0;
    public final CarIcon mIcon = null;
    public final int mId = 0;
    public final CarText mSubtitle = null;
    public final CarText mTitle = new CarText((CharSequence) "");

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof Alert) && this.mId == ((Alert) obj).mId;
        }
        return true;
    }

    public int hashCode() {
        Object[] objArr = new Object[1];
        AnonymousClass000.A1L(objArr, this.mId);
        return Arrays.hashCode(objArr);
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("[id: ");
        A10.append(this.mId);
        A10.append(", title: ");
        A10.append(this.mTitle);
        A10.append(", icon: ");
        return AnonymousClass001.A1G(this.mIcon, A10);
    }
}
