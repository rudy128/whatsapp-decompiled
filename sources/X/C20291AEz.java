package X;

import android.location.Location;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.AEz  reason: case insensitive filesystem */
public final class C20291AEz implements Parcelable, BCm {
    public static final Parcelable.Creator CREATOR = new Object();
    public double A00;
    public int A01;
    public int A02;
    public AF0 A03;
    public Double A04;
    public Double A05;
    public final double A06;
    public final double A07;
    public final double A08;
    public final AnonymousClass8nD A09;
    public final String A0A;
    public final boolean A0B;

    public C20291AEz(AF0 af0, AnonymousClass8nD r3, Double d, Double d2, String str, double d3, double d4, double d5, double d6, int i, int i2, boolean z) {
        C108965cb.A1O(str, 1, r3);
        this.A0A = str;
        this.A06 = d3;
        this.A07 = d4;
        this.A0B = z;
        this.A08 = d5;
        this.A09 = r3;
        this.A03 = af0;
        this.A00 = d6;
        this.A05 = d;
        this.A01 = i;
        this.A02 = i2;
        this.A04 = d2;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C20291AEz) {
                C20291AEz aEz = (C20291AEz) obj;
                if (!(C18070vi.A18(this.A0A, aEz.A0A) && Double.compare(this.A06, aEz.A06) == 0 && Double.compare(this.A07, aEz.A07) == 0 && this.A0B == aEz.A0B && Double.compare(this.A08, aEz.A08) == 0 && C18070vi.A18(this.A09, aEz.A09) && C18070vi.A18(this.A03, aEz.A03) && Double.compare(this.A00, aEz.A00) == 0 && C18070vi.A18(this.A05, aEz.A05) && this.A01 == aEz.A01 && this.A02 == aEz.A02 && C18070vi.A18(this.A04, aEz.A04))) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public void writeToParcel(Parcel parcel, int i) {
        double d;
        double d2;
        C18070vi.A0d(parcel, 0);
        parcel.writeString(this.A0A);
        parcel.writeDouble(this.A06);
        parcel.writeDouble(this.A07);
        parcel.writeByte(this.A0B ? (byte) 1 : 0);
        parcel.writeDouble(this.A08);
        parcel.writeParcelable(this.A09, i);
        parcel.writeParcelable(this.A03, i);
        parcel.writeDouble(this.A00);
        Double d3 = this.A05;
        if (d3 != null) {
            d = d3.doubleValue();
        } else {
            d = -1.0d;
        }
        parcel.writeDouble(d);
        parcel.writeInt(this.A01);
        parcel.writeInt(this.A02);
        Double d4 = this.A04;
        if (d4 != null) {
            d2 = d4.doubleValue();
        } else {
            d2 = -1.0d;
        }
        parcel.writeDouble(d2);
    }

    public void BDm(Location location) {
        double d;
        Location location2 = new Location("");
        double d2 = this.A06;
        if (!Double.isNaN(d2)) {
            double d3 = this.A07;
            if (!(Double.isNaN(d3) || d2 == 0.0d || d3 == 0.0d)) {
                location2.setLatitude(d2);
                location2.setLongitude(d3);
                d = (double) location.distanceTo(location2);
                this.A00 = d;
            }
        }
        d = 0.0d;
        this.A00 = d;
    }

    public Double BXP() {
        return Double.valueOf(this.A08);
    }

    public int hashCode() {
        return ((((((AnonymousClass8BT.A00((AnonymousClass000.A0N(this.A09, AnonymousClass8BT.A00(AnonymousClass0DV.A00(AnonymousClass8BT.A00(AnonymousClass8BT.A00(C17880vN.A03(this.A0A), this.A06), this.A07), this.A0B), this.A08)) + AnonymousClass001.A0k(this.A03)) * 31, this.A00) + AnonymousClass001.A0k(this.A05)) * 31) + this.A01) * 31) + this.A02) * 31) + C17880vN.A02(this.A04);
    }

    public double BQl() {
        return this.A00;
    }

    public Double BXO() {
        return this.A05;
    }

    public void CK4(Double d) {
        this.A05 = d;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("MapBusinessProfile(id=");
        A10.append(this.A0A);
        A10.append(", latitude=");
        A10.append(this.A06);
        A10.append(", longitude=");
        A10.append(this.A07);
        A10.append(", isResponsive=");
        A10.append(this.A0B);
        A10.append(", preRankingScore=");
        A10.append(this.A08);
        A10.append(", categoryInfo=");
        A10.append(this.A09);
        A10.append(", minifiedBusinessProfile=");
        A10.append(this.A03);
        A10.append(", distance=");
        A10.append(this.A00);
        A10.append(", postRankingScore=");
        A10.append(this.A05);
        A10.append(", businessRankIndex=");
        A10.append(this.A01);
        A10.append(", businessSegmentIndex=");
        A10.append(this.A02);
        A10.append(", businessPostRankingScoreWithProximity=");
        return AnonymousClass001.A1F(this.A04, A10);
    }
}
