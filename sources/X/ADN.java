package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

public final class ADN implements Parcelable {
    public static final Parcelable.Creator CREATOR = new Object();
    public int A00;
    public int A01;
    public int A02 = 0;
    public int A03 = 0;
    public int A04 = 0;
    public long A05 = 0;
    public ADM A06 = null;
    public C59772mr A07;
    public C195429tK A08;
    public Integer A09;
    public String A0A;
    public String A0B = null;
    public String A0C = null;
    public String A0D = null;
    public String A0E;
    public String A0F = null;
    public String A0G = null;
    public String A0H = null;
    public String A0I = null;
    public String A0J = null;
    public String A0K;
    public String A0L = null;
    public String A0M = null;
    public String A0N = null;
    public String A0O = null;
    public String A0P = null;
    public String A0Q = null;
    public String A0R = null;
    public String A0S = null;
    public String A0T;
    public ArrayList A0U = null;
    public ArrayList A0V;
    public boolean A0W;
    public boolean A0X = false;

    public ADN(Integer num) {
        this.A09 = num;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C18070vi.A0d(parcel, 0);
        parcel.writeString(C181669Rj.A00(this.A09));
        parcel.writeString(this.A0H);
        parcel.writeString(this.A0L);
        parcel.writeInt(this.A02);
        parcel.writeString(this.A0C);
        parcel.writeInt(this.A03);
        parcel.writeInt(this.A0X ? 1 : 0);
        parcel.writeString(this.A0J);
        parcel.writeString(this.A0O);
        parcel.writeString(this.A0Q);
        parcel.writeString(this.A0R);
        parcel.writeString(this.A0N);
        parcel.writeString(this.A0G);
        parcel.writeString(this.A0S);
        parcel.writeLong(this.A05);
        parcel.writeString(this.A0I);
        parcel.writeInt(this.A04);
        parcel.writeString(this.A0B);
        parcel.writeString(this.A0F);
        ADM adm = this.A06;
        if (adm == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            adm.writeToParcel(parcel, i);
        }
        parcel.writeString(this.A0M);
        parcel.writeString(this.A0P);
        parcel.writeString(this.A0D);
        parcel.writeStringList(this.A0U);
    }
}
