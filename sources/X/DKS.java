package X;

import com.google.android.gms.maps.model.LatLng;
import com.whatsapp.location.WaMapView;

public final /* synthetic */ class DKS implements C28516E5a {
    public final /* synthetic */ LatLng A00;
    public final /* synthetic */ C23031Ba7 A01;
    public final /* synthetic */ WaMapView A02;

    public final void Bxb(C25284Ccm ccm) {
        WaMapView waMapView = this.A02;
        waMapView.setupGoogleMap(waMapView.A01, this.A00, this.A01);
    }

    public /* synthetic */ DKS(LatLng latLng, C23031Ba7 ba7, WaMapView waMapView) {
        this.A02 = waMapView;
        this.A00 = latLng;
        this.A01 = ba7;
    }
}
