package androidx.car.app.navigation.model;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass026;
import java.util.Collections;
import java.util.List;

public final class Lane {
    public final List mDirections = Collections.emptyList();

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Lane)) {
            return false;
        }
        return AnonymousClass026.A00(this.mDirections, ((Lane) obj).mDirections);
    }

    public int hashCode() {
        return AnonymousClass001.A0k(this.mDirections);
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("[direction count: ");
        A10.append(AnonymousClass001.A0m(this.mDirections));
        return AnonymousClass000.A0z(A10);
    }
}
