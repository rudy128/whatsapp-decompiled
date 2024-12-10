package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.maps.model.LatLng;
import java.util.List;

/* renamed from: X.BbE  reason: case insensitive filesystem */
public final class C23099BbE extends DJ0 {
    public static final Parcelable.Creator CREATOR = new Object();
    public double A00 = 0.0d;
    public float A01 = 10.0f;
    public float A02 = 0.0f;
    public int A03 = -16777216;
    public int A04 = 0;
    public LatLng A05 = null;
    public List A06 = null;
    public boolean A07 = true;
    public boolean A08 = false;

    public final void writeToParcel(Parcel parcel, int i) {
        int A002 = C26293Cx2.A00(parcel);
        boolean A0J = DJ0.A0J(parcel, this.A05, i);
        double d = this.A00;
        parcel.writeInt(524291);
        parcel.writeDouble(d);
        float f = this.A01;
        BE7.A0z(4, parcel);
        parcel.writeFloat(f);
        C26293Cx2.A06(parcel, 5, this.A03);
        C26293Cx2.A06(parcel, 6, this.A04);
        float f2 = this.A02;
        BE7.A0z(7, parcel);
        parcel.writeFloat(f2);
        C26293Cx2.A08(parcel, 8, this.A07);
        C26293Cx2.A08(parcel, 9, this.A08);
        C26293Cx2.A0C(parcel, this.A06, 10, A0J);
        C26293Cx2.A05(parcel, A002);
    }
}
