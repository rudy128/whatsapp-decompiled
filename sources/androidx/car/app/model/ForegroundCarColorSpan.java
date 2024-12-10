package androidx.car.app.model;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass026;

public final class ForegroundCarColorSpan extends CarSpan {
    public final CarColor mCarColor = CarColor.A00;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ForegroundCarColorSpan)) {
            return false;
        }
        return AnonymousClass026.A00(this.mCarColor, ((ForegroundCarColorSpan) obj).mCarColor);
    }

    public int hashCode() {
        return AnonymousClass001.A0k(this.mCarColor);
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("[color: ");
        return AnonymousClass001.A1G(this.mCarColor, A10);
    }
}
