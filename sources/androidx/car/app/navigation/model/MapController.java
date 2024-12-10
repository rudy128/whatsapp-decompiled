package androidx.car.app.navigation.model;

import X.AnonymousClass000;
import X.AnonymousClass026;
import X.C15590qs;
import androidx.car.app.model.ActionStrip;

public final class MapController {
    public final ActionStrip mMapActionStrip = null;
    public final C15590qs mPanModeDelegate = null;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MapController)) {
            return false;
        }
        MapController mapController = (MapController) obj;
        return AnonymousClass026.A01(Boolean.valueOf(AnonymousClass000.A1X(this.mPanModeDelegate)), AnonymousClass000.A1X(mapController.mPanModeDelegate)) && AnonymousClass026.A00(this.mMapActionStrip, mapController.mMapActionStrip);
    }

    public int hashCode() {
        Object[] objArr = new Object[2];
        objArr[0] = this.mPanModeDelegate;
        return AnonymousClass000.A0P(this.mMapActionStrip, objArr, 1);
    }
}
