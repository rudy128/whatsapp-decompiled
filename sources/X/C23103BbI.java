package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.BbI  reason: case insensitive filesystem */
public class C23103BbI extends DJ0 {
    public static final Parcelable.Creator CREATOR = new Object();
    public final float A00;
    public final float A01;
    public final float A02;
    public final float A03;
    public final float A04;
    public final float A05;
    public final float A06;
    public final float A07;
    public final float A08;
    public final float A09;
    public final float A0A;
    public final int A0B;
    public final C23086Bb1[] A0C;
    public final C23050BaR[] A0D;
    public final int A0E;

    public C23103BbI(C23086Bb1[] bb1Arr, C23050BaR[] baRArr, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, float f11, int i, int i2) {
        this.A0E = i;
        this.A0B = i2;
        this.A00 = f;
        this.A01 = f2;
        this.A02 = f3;
        this.A03 = f4;
        this.A04 = f5;
        this.A05 = f6;
        this.A06 = f7;
        this.A0C = bb1Arr;
        this.A07 = f8;
        this.A08 = f9;
        this.A09 = f10;
        this.A0D = baRArr;
        this.A0A = f11;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int A002 = C26293Cx2.A00(parcel);
        C26293Cx2.A06(parcel, 1, this.A0E);
        C26293Cx2.A06(parcel, 2, this.A0B);
        float f = this.A00;
        BE7.A0z(3, parcel);
        parcel.writeFloat(f);
        float f2 = this.A01;
        BE7.A0z(4, parcel);
        parcel.writeFloat(f2);
        float f3 = this.A02;
        BE7.A0z(5, parcel);
        parcel.writeFloat(f3);
        float f4 = this.A03;
        BE7.A0z(6, parcel);
        parcel.writeFloat(f4);
        float f5 = this.A04;
        BE7.A0z(7, parcel);
        parcel.writeFloat(f5);
        float f6 = this.A05;
        BE7.A0z(8, parcel);
        parcel.writeFloat(f6);
        C26293Cx2.A0F(parcel, this.A0C, 9, i);
        float f7 = this.A07;
        BE7.A0z(10, parcel);
        parcel.writeFloat(f7);
        float f8 = this.A08;
        BE7.A0z(11, parcel);
        parcel.writeFloat(f8);
        float f9 = this.A09;
        BE7.A0z(12, parcel);
        parcel.writeFloat(f9);
        C26293Cx2.A0F(parcel, this.A0D, 13, i);
        float f10 = this.A06;
        BE7.A0z(14, parcel);
        parcel.writeFloat(f10);
        float f11 = this.A0A;
        BE7.A0z(15, parcel);
        parcel.writeFloat(f11);
        C26293Cx2.A05(parcel, A002);
    }
}
