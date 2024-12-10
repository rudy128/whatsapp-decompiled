package X;

import com.google.android.gms.maps.model.LatLng;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Map;

/* renamed from: X.ATk  reason: case insensitive filesystem */
public class C20652ATk implements C22508BAp {
    public final float A00;
    public final LatLng A01;
    public final String A02;
    public final String A03;
    public final WeakReference A04;
    public final /* synthetic */ C192699op A05;

    public C20652ATk(LatLng latLng, BAW baw, C192699op r4, String str, String str2, float f) {
        this.A05 = r4;
        this.A01 = latLng;
        this.A03 = str;
        this.A00 = f;
        this.A02 = str2;
        this.A04 = AnonymousClass3MW.A0z(baw);
    }

    public void BtA(C190599lD r2, int i) {
        BAW baw = (BAW) this.A04.get();
        if (baw != null) {
            baw.Bvo(r2, i);
        }
    }

    public /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int i;
        AnonymousClass9X0 r8 = (AnonymousClass9X0) obj;
        LatLng latLng = this.A01;
        double d = latLng.A00;
        double d2 = latLng.A01;
        ArrayList A032 = C20086A6o.A03(d, d2, 14);
        C17960vV.A07(A032);
        String A022 = C20086A6o.A02((Long) C108955ca.A0p(A032), (Long) A032.get(1), 14);
        BAW baw = (BAW) this.A04.get();
        if (baw != null) {
            Map map = r8.A00;
            if (map.containsKey(A022)) {
                i = AnonymousClass000.A0M(map.get(A022));
            } else {
                i = 10;
            }
            String str = this.A02;
            ArrayList A033 = C20086A6o.A03(d, d2, i);
            C17960vV.A07(A033);
            ArrayList A042 = C20086A6o.A04(i, C17880vN.A05(A033.get(0)), C17880vN.A05(A033.get(1)));
            LatLng A09 = AnonymousClass8BV.A09((Number) A042.get(1), AnonymousClass8BR.A00(A042.get(0)));
            double A012 = C20086A6o.A01(A033, i);
            String str2 = this.A03;
            double d3 = (double) this.A00;
            C20079A6f a6f = new C20079A6f(Double.valueOf(A012 + d3), Double.valueOf(d), Double.valueOf(d2), Double.valueOf(A09.A00), Double.valueOf(A09.A01), Double.valueOf(d3), str2, (String) null, str);
            a6f.A00 = i;
            baw.Bvp(a6f);
        }
    }
}
