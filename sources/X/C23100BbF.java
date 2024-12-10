package X;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.maps.model.LatLng;

/* renamed from: X.BbF  reason: case insensitive filesystem */
public final class C23100BbF extends DJ0 {
    public static final Parcelable.Creator CREATOR = new Object();
    public float A00 = 0.5f;
    public float A01 = 1.0f;
    public float A02 = 0.0f;
    public float A03 = 0.5f;
    public float A04 = 0.0f;
    public float A05 = 1.0f;
    public float A06;
    public CLL A07;
    public LatLng A08;
    public String A09;
    public String A0A;
    public boolean A0B;
    public boolean A0C = true;
    public boolean A0D = false;

    public void writeToParcel(Parcel parcel, int i) {
        IBinder asBinder;
        int A002 = C26293Cx2.A00(parcel);
        boolean A0J = DJ0.A0J(parcel, this.A08, i);
        C26293Cx2.A0A(parcel, this.A09, 3, A0J);
        C26293Cx2.A0A(parcel, this.A0A, 4, A0J);
        CLL cll = this.A07;
        if (cll == null) {
            asBinder = null;
        } else {
            asBinder = cll.A00.asBinder();
        }
        C26293Cx2.A04(asBinder, parcel, 5);
        float f = this.A00;
        BE7.A0z(6, parcel);
        parcel.writeFloat(f);
        float f2 = this.A01;
        BE7.A0z(7, parcel);
        parcel.writeFloat(f2);
        C26293Cx2.A08(parcel, 8, this.A0B);
        C26293Cx2.A08(parcel, 9, this.A0C);
        C26293Cx2.A08(parcel, 10, this.A0D);
        float f3 = this.A02;
        BE7.A0z(11, parcel);
        parcel.writeFloat(f3);
        float f4 = this.A03;
        BE7.A0z(12, parcel);
        parcel.writeFloat(f4);
        float f5 = this.A04;
        BE7.A0z(13, parcel);
        parcel.writeFloat(f5);
        float f6 = this.A05;
        BE7.A0z(14, parcel);
        parcel.writeFloat(f6);
        float f7 = this.A06;
        BE7.A0z(15, parcel);
        parcel.writeFloat(f7);
        C26293Cx2.A05(parcel, A002);
    }
}
