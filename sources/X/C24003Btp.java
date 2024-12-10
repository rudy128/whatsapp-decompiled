package X;

import com.google.android.gms.maps.model.LatLng;
import com.whatsapp.location.WaMapView;

/* renamed from: X.Btp  reason: case insensitive filesystem */
public class C24003Btp extends WaMapView {
    public C25105CXy A00;
    public Integer A01;

    public void A02(LatLng latLng, C23031Ba7 ba7, AnonymousClass689 r4) {
        this.A01 = null;
        super.A02(latLng, ba7, r4);
    }

    public void A03(AnonymousClass689 r2, AnonymousClass219 r3, boolean z) {
        this.A01 = null;
        super.A03(r2, r3, z);
    }

    public void A04(AnonymousClass689 r2, AnonymousClass21B r3) {
        this.A01 = null;
        super.A04(r2, r3);
    }

    public void A05(LatLng latLng, AnonymousClass689 r3, Integer num) {
        this.A01 = num;
        super.A02(latLng, (C23031Ba7) null, r3);
    }

    public void setupGoogleMap(BIC bic, LatLng latLng, C23031Ba7 ba7) {
        bic.A07(new DKT(bic, latLng, ba7, this, 1));
    }
}
