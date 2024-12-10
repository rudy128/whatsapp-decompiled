package androidx.car.app.model;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass026;

public final class CarIconSpan extends CarSpan {
    public final int mAlignment = 1;
    public final CarIcon mIcon = null;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CarIconSpan)) {
            return false;
        }
        return AnonymousClass026.A00(this.mIcon, ((CarIconSpan) obj).mIcon);
    }

    public int hashCode() {
        return AnonymousClass001.A0k(this.mIcon);
    }

    public String toString() {
        String str;
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("[icon: ");
        A10.append(this.mIcon);
        A10.append(", alignment: ");
        int i = this.mAlignment;
        if (i == 0) {
            str = "bottom";
        } else if (i == 1) {
            str = "baseline";
        } else if (i != 2) {
            str = "unknown";
        } else {
            str = "center";
        }
        A10.append(str);
        return AnonymousClass000.A0z(A10);
    }
}
