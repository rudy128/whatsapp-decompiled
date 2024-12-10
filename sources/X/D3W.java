package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.android.exoplayer2.util.Util;

public class D3W implements Parcelable {
    public static final Parcelable.Creator CREATOR = D3B.A00(10);
    public final int A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final boolean A07;
    public final boolean A08;
    public final boolean A09;
    public final boolean A0A;
    public final boolean A0B;
    public final boolean A0C;
    public final boolean A0D;
    public final boolean A0E;
    public final boolean A0F;
    public final boolean A0G;
    public final boolean A0H;
    public final boolean A0I;

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            D3W d3w = (D3W) obj;
            if (!(Util.A0D(this.A05, d3w.A05) && this.A0F == d3w.A0F && this.A0G == d3w.A0G && this.A0C == d3w.A0C && this.A0B == d3w.A0B && this.A0A == d3w.A0A && this.A09 == d3w.A09 && this.A08 == d3w.A08 && this.A07 == d3w.A07 && this.A0H == d3w.A0H && Util.A0D(this.A03, d3w.A03) && Util.A0D(this.A04, d3w.A04) && Util.A0D(this.A02, d3w.A02) && Util.A0D(this.A06, d3w.A06) && Util.A0D(this.A01, d3w.A01) && this.A0E == d3w.A0E && this.A00 == d3w.A00 && this.A0D == d3w.A0D && this.A0I == d3w.A0I)) {
                return false;
            }
        }
        return true;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A05);
        parcel.writeInt(this.A0F ? 1 : 0);
        parcel.writeInt(this.A0G ? 1 : 0);
        parcel.writeInt(this.A0C ? 1 : 0);
        parcel.writeInt(this.A0B ? 1 : 0);
        parcel.writeInt(this.A0A ? 1 : 0);
        parcel.writeInt(this.A09 ? 1 : 0);
        parcel.writeInt(this.A08 ? 1 : 0);
        parcel.writeInt(this.A07 ? 1 : 0);
        parcel.writeInt(this.A0H ? 1 : 0);
        parcel.writeString(this.A03);
        parcel.writeString(this.A04);
        parcel.writeString(this.A02);
        parcel.writeString(this.A06);
        parcel.writeString(this.A01);
        parcel.writeInt(this.A0E ? 1 : 0);
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A0D ? 1 : 0);
        parcel.writeInt(this.A0I ? 1 : 0);
    }

    public D3W(CUN cun) {
        this.A05 = cun.A05;
        this.A0F = cun.A0F;
        this.A0G = cun.A0G;
        this.A0C = cun.A0C;
        this.A0B = cun.A0B;
        this.A0A = cun.A0A;
        this.A09 = cun.A09;
        this.A08 = cun.A08;
        this.A07 = cun.A07;
        this.A0H = cun.A0H;
        this.A03 = cun.A03;
        this.A04 = cun.A04;
        this.A02 = cun.A02;
        this.A06 = cun.A06;
        this.A01 = cun.A01;
        this.A0E = cun.A0E;
        this.A00 = cun.A00;
        this.A0D = cun.A0D;
        this.A0I = cun.A0I;
    }
}
