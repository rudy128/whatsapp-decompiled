package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;

/* renamed from: X.BcK  reason: case insensitive filesystem */
public final class C23164BcK extends DJ0 {
    public static final Parcelable.Creator CREATOR = new Object();
    public final LatLng A00;
    public final LatLng A01;
    public final LatLng A02;
    public final LatLng A03;
    public final LatLngBounds A04;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C23164BcK) {
                C23164BcK bcK = (C23164BcK) obj;
                if (!this.A02.equals(bcK.A02) || !this.A03.equals(bcK.A03) || !this.A00.equals(bcK.A00) || !this.A01.equals(bcK.A01) || !this.A04.equals(bcK.A04)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        Object[] objArr = new Object[5];
        objArr[0] = this.A02;
        objArr[1] = this.A03;
        objArr[2] = this.A00;
        objArr[3] = this.A01;
        return AnonymousClass000.A0P(this.A04, objArr, 4);
    }

    public String toString() {
        CYH cyh = new CYH(this);
        cyh.A00(this.A02, "nearLeft");
        cyh.A00(this.A03, "nearRight");
        cyh.A00(this.A00, "farLeft");
        cyh.A00(this.A01, "farRight");
        cyh.A00(this.A04, "latLngBounds");
        return cyh.toString();
    }

    public C23164BcK(LatLng latLng, LatLng latLng2, LatLng latLng3, LatLng latLng4, LatLngBounds latLngBounds) {
        this.A02 = latLng;
        this.A03 = latLng2;
        this.A00 = latLng3;
        this.A01 = latLng4;
        this.A04 = latLngBounds;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int A002 = C26293Cx2.A00(parcel);
        boolean A0J = DJ0.A0J(parcel, this.A02, i);
        C26293Cx2.A09(parcel, this.A03, 3, i, A0J);
        C26293Cx2.A09(parcel, this.A00, 4, i, A0J);
        C26293Cx2.A09(parcel, this.A01, 5, i, A0J);
        C26293Cx2.A09(parcel, this.A04, 6, i, A0J);
        C26293Cx2.A05(parcel, A002);
    }
}
