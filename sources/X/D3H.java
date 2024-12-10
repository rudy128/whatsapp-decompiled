package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

public class D3H implements Parcelable {
    public static final Parcelable.Creator CREATOR = D3B.A00(23);
    public float A00;
    public float A01;
    public String A02;
    public String A03;
    public String A04;
    public String A05;
    public String A06;
    public String A07;
    public String A08;
    public String A09;
    public String A0A;
    public String A0B;
    public List A0C;

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof D3H)) {
            return false;
        }
        D3H d3h = (D3H) obj;
        return AnonymousClass026.A00(this.A04, d3h.A04) && AnonymousClass026.A00(this.A08, d3h.A08) && AnonymousClass026.A00(this.A0B, d3h.A0B) && AnonymousClass026.A00(this.A02, d3h.A02) && AnonymousClass026.A00(this.A0A, d3h.A0A) && AnonymousClass026.A00(this.A03, d3h.A03) && AnonymousClass026.A00(this.A05, d3h.A05) && AnonymousClass026.A00(this.A06, d3h.A06) && AnonymousClass026.A00(this.A07, d3h.A07) && this.A00 == d3h.A00 && this.A01 == d3h.A01 && this.A0C.equals(d3h.A0C) && AnonymousClass026.A00(this.A09, d3h.A09);
    }

    public int hashCode() {
        return ((AnonymousClass000.A0B(AnonymousClass000.A0B((((((((((((((((((527 + C17900vP.A00(this.A04)) * 31) + C17900vP.A00(this.A08)) * 31) + C17900vP.A00(this.A0B)) * 31) + C17900vP.A00(this.A02)) * 31) + C17900vP.A00(this.A0A)) * 31) + C17900vP.A00(this.A03)) * 31) + C17900vP.A00(this.A05)) * 31) + C17900vP.A00(this.A06)) * 31) + C17900vP.A00(this.A07)) * 31, this.A00), this.A01) + this.A0C.hashCode()) * 31) + C108955ca.A06(this.A09);
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A08);
        parcel.writeString(this.A04);
        parcel.writeString(this.A0B);
        parcel.writeString(this.A02);
        parcel.writeString(this.A0A);
        parcel.writeString(this.A03);
        parcel.writeString(this.A05);
        parcel.writeString(this.A06);
        parcel.writeString(this.A07);
        parcel.writeFloat(this.A00);
        parcel.writeFloat(this.A01);
        parcel.writeStringList(this.A0C);
        parcel.writeString(this.A09);
    }
}
