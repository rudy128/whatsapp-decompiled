package com.google.android.gms.maps;

import X.BE7;
import X.BE8;
import X.C26293Cx2;
import X.CYH;
import X.DJ0;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLngBounds;

public final class GoogleMapOptions extends DJ0 implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new Object();
    public int A00 = -1;
    public CameraPosition A01;
    public LatLngBounds A02 = null;
    public Boolean A03;
    public Boolean A04;
    public Boolean A05;
    public Boolean A06;
    public Boolean A07;
    public Boolean A08;
    public Boolean A09;
    public Boolean A0A;
    public Boolean A0B;
    public Boolean A0C;
    public Boolean A0D;
    public Boolean A0E;
    public Float A0F = null;
    public Float A0G = null;

    public static byte A00(Boolean bool) {
        if (bool != null) {
            return BE8.A1S(bool.booleanValue() ? 1 : 0) ? (byte) 1 : 0;
        }
        return -1;
    }

    public String toString() {
        CYH cyh = new CYH(this);
        cyh.A00(Integer.valueOf(this.A00), "MapType");
        cyh.A00(this.A0B, "LiteMode");
        cyh.A00(this.A01, "Camera");
        cyh.A00(this.A06, "CompassEnabled");
        cyh.A00(this.A05, "ZoomControlsEnabled");
        cyh.A00(this.A07, "ScrollGesturesEnabled");
        cyh.A00(this.A08, "ZoomGesturesEnabled");
        cyh.A00(this.A09, "TiltGesturesEnabled");
        cyh.A00(this.A0A, "RotateGesturesEnabled");
        cyh.A00(this.A0E, "ScrollGesturesEnabledDuringRotateOrZoom");
        cyh.A00(this.A0C, "MapToolbarEnabled");
        cyh.A00(this.A0D, "AmbientEnabled");
        cyh.A00(this.A0F, "MinZoomPreference");
        cyh.A00(this.A0G, "MaxZoomPreference");
        cyh.A00(this.A02, "LatLngBoundsForCameraTarget");
        cyh.A00(this.A03, "ZOrderOnTop");
        cyh.A00(this.A04, "UseViewLifecycleInFragment");
        return cyh.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        int A002 = C26293Cx2.A00(parcel);
        byte A003 = A00(this.A03);
        BE7.A0z(2, parcel);
        parcel.writeInt(A003);
        byte A004 = A00(this.A04);
        BE7.A0z(3, parcel);
        parcel.writeInt(A004);
        C26293Cx2.A06(parcel, 4, this.A00);
        C26293Cx2.A09(parcel, this.A01, 5, i, false);
        byte A005 = A00(this.A05);
        BE7.A0z(6, parcel);
        parcel.writeInt(A005);
        byte A006 = A00(this.A06);
        BE7.A0z(7, parcel);
        parcel.writeInt(A006);
        byte A007 = A00(this.A07);
        BE7.A0z(8, parcel);
        parcel.writeInt(A007);
        byte A008 = A00(this.A08);
        BE7.A0z(9, parcel);
        parcel.writeInt(A008);
        byte A009 = A00(this.A09);
        BE7.A0z(10, parcel);
        parcel.writeInt(A009);
        byte A0010 = A00(this.A0A);
        BE7.A0z(11, parcel);
        parcel.writeInt(A0010);
        byte A0011 = A00(this.A0B);
        BE7.A0z(12, parcel);
        parcel.writeInt(A0011);
        byte A0012 = A00(this.A0C);
        BE7.A0z(14, parcel);
        parcel.writeInt(A0012);
        byte A0013 = A00(this.A0D);
        BE7.A0z(15, parcel);
        parcel.writeInt(A0013);
        Float f = this.A0F;
        if (f != null) {
            parcel.writeInt(262160);
            parcel.writeFloat(f.floatValue());
        }
        Float f2 = this.A0G;
        if (f2 != null) {
            parcel.writeInt(262161);
            parcel.writeFloat(f2.floatValue());
        }
        C26293Cx2.A09(parcel, this.A02, 18, i, false);
        byte A0014 = A00(this.A0E);
        BE7.A0z(19, parcel);
        parcel.writeInt(A0014);
        C26293Cx2.A05(parcel, A002);
    }
}
