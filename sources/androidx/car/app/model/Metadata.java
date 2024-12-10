package androidx.car.app.model;

import X.AnonymousClass001;
import X.AnonymousClass026;

public final class Metadata {
    public static final Metadata A00 = new Metadata((Place) null);
    public final Place mPlace = null;

    public Metadata(Place place) {
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Metadata)) {
            return false;
        }
        return AnonymousClass026.A00(this.mPlace, ((Metadata) obj).mPlace);
    }

    public int hashCode() {
        return AnonymousClass001.A0k(this.mPlace);
    }

    public Metadata() {
    }
}
