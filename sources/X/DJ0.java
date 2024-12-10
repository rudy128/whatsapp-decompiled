package X;

import android.location.Location;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;

public abstract class DJ0 implements SafeParcelable {
    public static CameraPosition A0B(LatLng latLng, C24001Bti bti) {
        float f = bti.A00;
        LatLng A00 = C24001Bti.A00(latLng, (double) f);
        float max = Math.max(Math.min(bti.A02, 67.5f), 0.0f);
        float max2 = Math.max(bti.A01, 15.0f);
        C18210vx.A02(A00, "location must not be null.");
        CameraPosition cameraPosition = new CameraPosition(A00, max2, max, f);
        bti.A0B = true;
        return cameraPosition;
    }

    public static void A0F(Parcel parcel, Parcelable parcelable, int i, int i2) {
        C26293Cx2.A09(parcel, parcelable, 3, i, false);
        C26293Cx2.A05(parcel, i2);
    }

    public static void A0G(Parcel parcel, String str, int i) {
        C26293Cx2.A0A(parcel, str, 2, false);
        C26293Cx2.A05(parcel, i);
    }

    public static boolean A0I(Parcel parcel, Parcelable parcelable, int i) {
        C26293Cx2.A09(parcel, parcelable, 1, i, false);
        return false;
    }

    public static boolean A0J(Parcel parcel, Parcelable parcelable, int i) {
        C26293Cx2.A09(parcel, parcelable, 2, i, false);
        return false;
    }

    public static boolean A0K(Parcel parcel, String str) {
        C26293Cx2.A0A(parcel, str, 1, false);
        return false;
    }

    public static boolean A0L(Parcel parcel, String str) {
        C26293Cx2.A0A(parcel, str, 2, false);
        return false;
    }

    public final int describeContents() {
        return 0;
    }

    public static C20269AEc A05(LatLng latLng) {
        return new C20269AEc(latLng.A00, latLng.A01);
    }

    public static C23191Bcl A06(String str) {
        return new C23191Bcl(str, 2);
    }

    public static C23191Bcl A07(String str, long j) {
        return new C23191Bcl(str, j);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [X.CQA, java.lang.Object] */
    public static CQA A08(CQA cqa, Object obj, String str) {
        ? obj2 = new Object();
        cqa.A00 = obj2;
        obj2.A01 = obj;
        obj2.A02 = str;
        return obj2;
    }

    public static C23171BcR A0A(Parcel parcel, int i) {
        return (C23171BcR) C26300CxD.A0A(parcel, C23171BcR.CREATOR, i);
    }

    public static LatLng A0D(Parcel parcel, int i) {
        return (LatLng) C26300CxD.A0A(parcel, LatLng.CREATOR, i);
    }

    public static byte[] A0N(DSS dss) {
        if (dss == null) {
            return null;
        }
        return dss.A04();
    }

    public static C23362Bfo A09(byte[] bArr) {
        C18210vx.A00(bArr);
        return DSS.A01(bArr, bArr.length);
    }

    public static LatLng A0C(Location location) {
        return new LatLng(location.getLatitude(), location.getLongitude());
    }

    public static LatLng A0E(LatLng latLng, double d, double d2) {
        double radians = Math.toRadians(d);
        double radians2 = Math.toRadians(latLng.A00);
        double radians3 = Math.toRadians(latLng.A01);
        double cos = Math.cos(d2);
        double sin = Math.sin(d2);
        double sin2 = Math.sin(radians2);
        double cos2 = sin * Math.cos(radians2);
        double cos3 = (cos * sin2) + (cos2 * Math.cos(radians));
        return new LatLng(Math.toDegrees(Math.asin(cos3)), Math.toDegrees(radians3 + Math.atan2(cos2 * Math.sin(radians), cos - (sin2 * cos3))));
    }

    public static boolean A0H(int i, Object obj) {
        return C25332Cdd.A01(obj, Integer.valueOf(i));
    }

    public static boolean A0M(Object obj, boolean z) {
        return C25332Cdd.A01(obj, Boolean.valueOf(z));
    }
}
