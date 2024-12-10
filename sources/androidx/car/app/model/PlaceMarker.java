package androidx.car.app.model;

import X.AnonymousClass000;
import X.AnonymousClass026;

public final class PlaceMarker {
    public final CarColor mColor = null;
    public final CarIcon mIcon = null;
    public final int mIconType = 0;
    public final CarText mLabel = null;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PlaceMarker)) {
            return false;
        }
        PlaceMarker placeMarker = (PlaceMarker) obj;
        return AnonymousClass026.A00(this.mIcon, placeMarker.mIcon) && AnonymousClass026.A00(this.mLabel, placeMarker.mLabel) && AnonymousClass026.A00(this.mColor, placeMarker.mColor) && this.mIconType == placeMarker.mIconType;
    }

    public int hashCode() {
        Object[] objArr = new Object[4];
        objArr[0] = this.mIcon;
        objArr[1] = this.mLabel;
        objArr[2] = this.mColor;
        return AnonymousClass000.A0P(Integer.valueOf(this.mIconType), objArr, 3);
    }

    public String toString() {
        String obj;
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("[");
        CarIcon carIcon = this.mIcon;
        if (carIcon != null) {
            obj = carIcon.toString();
        } else {
            CarText carText = this.mLabel;
            if (carText != null) {
                obj = CarText.A00(carText);
            } else {
                obj = super.toString();
            }
        }
        A10.append(obj);
        return AnonymousClass000.A0z(A10);
    }
}
