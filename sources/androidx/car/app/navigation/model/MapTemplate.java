package androidx.car.app.navigation.model;

import X.AnonymousClass000;
import X.AnonymousClass026;
import X.C15550qo;
import androidx.car.app.model.ActionStrip;
import androidx.car.app.model.Header;
import androidx.car.app.model.ItemList;
import androidx.car.app.model.Pane;

public final class MapTemplate implements C15550qo {
    public final ActionStrip mActionStrip = null;
    public final Header mHeader = null;
    public final ItemList mItemList = null;
    public final MapController mMapController = null;
    public final Pane mPane = null;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MapTemplate)) {
            return false;
        }
        MapTemplate mapTemplate = (MapTemplate) obj;
        return AnonymousClass026.A00(this.mPane, mapTemplate.mPane) && AnonymousClass026.A00(this.mItemList, mapTemplate.mItemList) && AnonymousClass026.A00(this.mHeader, mapTemplate.mHeader) && AnonymousClass026.A00(this.mMapController, mapTemplate.mMapController) && AnonymousClass026.A00(this.mActionStrip, mapTemplate.mActionStrip);
    }

    public int hashCode() {
        Object[] objArr = new Object[5];
        objArr[0] = this.mMapController;
        objArr[1] = this.mPane;
        objArr[2] = this.mItemList;
        objArr[3] = this.mHeader;
        return AnonymousClass000.A0P(this.mActionStrip, objArr, 4);
    }
}
