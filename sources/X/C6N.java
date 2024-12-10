package X;

import android.graphics.Point;
import com.google.android.gms.maps.model.LatLng;

public final class C6N {
    public C26152CtJ A00;
    public C25134CZk A01;

    public final Point A00(LatLng latLng) {
        Point A002;
        C18070vi.A0d(latLng, 0);
        C25134CZk cZk = this.A01;
        if (cZk != null && (A002 = cZk.A00(latLng)) != null) {
            return A002;
        }
        C26152CtJ ctJ = this.A00;
        if (ctJ != null) {
            return ctJ.A04(DJ0.A05(latLng));
        }
        throw C17890vO.A0K();
    }

    public final LatLng A01(Point point) {
        LatLng A012;
        C25134CZk cZk = this.A01;
        if (cZk != null && (A012 = cZk.A01(point)) != null) {
            return A012;
        }
        C26152CtJ ctJ = this.A00;
        if (ctJ != null) {
            C20269AEc A05 = ctJ.A05((float) point.x, (float) point.y);
            return new LatLng(A05.A00, A05.A01);
        }
        throw C17890vO.A0K();
    }
}
