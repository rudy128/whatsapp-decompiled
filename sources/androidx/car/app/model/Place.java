package androidx.car.app.model;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass026;

public final class Place {
    public final CarLocation mLocation = null;
    public final PlaceMarker mMarker = null;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Place)) {
            return false;
        }
        Place place = (Place) obj;
        return AnonymousClass026.A00(this.mLocation, place.mLocation) && AnonymousClass026.A00(this.mMarker, place.mMarker);
    }

    public int hashCode() {
        Object[] objArr = new Object[2];
        objArr[0] = this.mLocation;
        return AnonymousClass000.A0P(this.mMarker, objArr, 1);
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("[ location: ");
        A10.append(this.mLocation);
        A10.append(", marker: ");
        return AnonymousClass001.A1G(this.mMarker, A10);
    }
}
