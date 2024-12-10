package X;

import android.location.Address;
import android.location.Geocoder;
import android.location.Location;
import android.text.TextUtils;
import com.google.android.gms.maps.model.LatLng;
import java.util.List;

/* renamed from: X.Aiq  reason: case insensitive filesystem */
public final /* synthetic */ class C21361Aiq implements Runnable {
    public final /* synthetic */ double A00;
    public final /* synthetic */ double A01;
    public final /* synthetic */ B56 A02;
    public final /* synthetic */ C187629g7 A03;

    public final void run() {
        List<Address> list;
        String str;
        C187629g7 r6 = this.A03;
        double d = this.A00;
        double d2 = this.A01;
        B56 b56 = this.A02;
        Address address = null;
        try {
            list = new Geocoder(r6.A02.A00, r6.A03.A0N()).getFromLocation(d, d2, 1);
        } catch (Exception e) {
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("DirectoryGeocoder/geocodeAddress Exception while trying to fetch address ");
            AnonymousClass8BW.A1N(e.getClass(), A10);
            list = null;
        }
        r6.A01.removeCallbacks(r6.A05);
        if (list != null && !list.isEmpty()) {
            Address address2 = list.get(0);
            C18070vi.A0b(address2);
            address = address2;
        }
        AP7 ap7 = (AP7) b56;
        if (ap7.A00 != 0) {
            String str2 = null;
            if (address != null) {
                str2 = address.getCountryCode();
            }
            C20041A4k a4k = (C20041A4k) ap7.A02;
            if (a4k.A06.A00().contains(str2)) {
                AnonymousClass1D6 r0 = (AnonymousClass1D6) ap7.A01;
                LatLng latLng = (LatLng) r0.first;
                double A002 = AnonymousClass8BR.A00(r0.second);
                String A032 = a4k.A08.A03(a4k.A05, C20041A4k.A01(a4k));
                Double valueOf = Double.valueOf(A002);
                Double valueOf2 = Double.valueOf(latLng.A00);
                Double valueOf3 = Double.valueOf(latLng.A01);
                C20079A6f a6f = new C20079A6f(valueOf, valueOf2, valueOf3, valueOf2, valueOf3, (Double) null, A032, (String) null, "approx_default");
                C173738ve r62 = a4k.A02;
                long currentTimeMillis = System.currentTimeMillis();
                C190139kR r5 = r62.A03;
                C17880vN.A1D(AnonymousClass8BT.A05(r5), "default_location_last_updated", currentTimeMillis);
                C17880vN.A1E(AnonymousClass8BT.A05(r5), "default_search_location", C20015A3h.A01(r62.A00, r62.A02, a6f.A04()));
                a4k.A00 = a6f;
                C19989A2b a2b = a4k.A07;
                a2b.A03("approx_default_geocoder_success");
                a2b.A03("approx_default_location_end");
                a2b.A01();
                return;
            }
            return;
        }
        C20321AGd aGd = (C20321AGd) ap7.A02;
        Location location = (Location) ap7.A01;
        if (address != null) {
            String str3 = aGd.A0B;
            if (TextUtils.isEmpty(str3) || !C18070vi.A18(str3, "CO")) {
                str = C196589vJ.A00(aGd.A08.A00, address, location.getAccuracy());
                C21459AkQ.A00(aGd.A05, aGd, location, str, 45);
            }
            float accuracy = location.getAccuracy();
            if (!TextUtils.isEmpty(address.getSubLocality())) {
                str = address.getSubLocality();
            } else {
                str = address.getThoroughfare();
                if (((double) accuracy) <= 200.0d && !TextUtils.isEmpty(str)) {
                    String subThoroughfare = address.getSubThoroughfare();
                    if (!TextUtils.isEmpty(subThoroughfare)) {
                        boolean startsWith = subThoroughfare.trim().startsWith("#");
                        StringBuilder A11 = AnonymousClass000.A11(str);
                        if (startsWith) {
                            str = AnonymousClass001.A1H(" ", subThoroughfare, A11);
                        } else {
                            C17890vO.A10(" ", "#", subThoroughfare, A11);
                            str = A11.toString();
                        }
                    }
                } else if (!TextUtils.isEmpty(address.getLocality())) {
                    str = address.getLocality();
                } else if (!TextUtils.isEmpty(address.getSubAdminArea())) {
                    str = address.getSubAdminArea();
                }
            }
            C21459AkQ.A00(aGd.A05, aGd, location, str, 45);
        }
        str = null;
        C21459AkQ.A00(aGd.A05, aGd, location, str, 45);
    }

    public /* synthetic */ C21361Aiq(B56 b56, C187629g7 r2, double d, double d2) {
        this.A03 = r2;
        this.A00 = d;
        this.A01 = d2;
        this.A02 = b56;
    }
}
