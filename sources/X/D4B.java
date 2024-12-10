package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Map;

public class D4B implements Parcelable {
    public static final Parcelable.Creator CREATOR = D3B.A00(33);
    public String A00;
    public Map A01;
    public String A02;
    public final D4B A03;
    public final String A04;
    public final String A05;

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            D4B d4b = (D4B) obj;
            if (!AnonymousClass026.A00(this.A00, d4b.A00) || !AnonymousClass026.A00(this.A03, d4b.A03)) {
                return false;
            }
        }
        return true;
    }

    public D4B(D4B d4b, String str, String str2) {
        Map map;
        this.A05 = "i";
        this.A04 = str2;
        this.A00 = AnonymousClass001.A1H(":", str2, AnonymousClass000.A11("i"));
        this.A03 = d4b;
        if (d4b != null && (map = d4b.A01) != null) {
            this.A01 = BE6.A10(map);
        }
    }

    public String toString() {
        String str = this.A02;
        if (str != null) {
            return str;
        }
        String str2 = this.A00;
        this.A02 = str2;
        D4B d4b = this.A03;
        if (d4b == null) {
            return str2;
        }
        StringBuilder A10 = AnonymousClass000.A10();
        AnonymousClass8BS.A1D(d4b, A10);
        A10.append('/');
        String A0y = AnonymousClass000.A0y(this.A02, A10);
        this.A02 = A0y;
        return A0y;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A05);
        parcel.writeString(this.A04);
        parcel.writeString(this.A00);
        parcel.writeParcelable(this.A03, i);
    }

    public int hashCode() {
        Object[] A1b = AnonymousClass3MW.A1b();
        A1b[0] = this.A03;
        return AnonymousClass000.A0P(this.A00, A1b, 1);
    }

    public D4B(Parcel parcel) {
        this.A05 = parcel.readString();
        this.A04 = parcel.readString();
        this.A00 = parcel.readString();
        this.A03 = (D4B) AnonymousClass3Ma.A08(parcel, D4B.class);
    }

    public D4B(D4B d4b, String str) {
        this.A05 = "serialized_tag";
        this.A04 = "serialized_name";
        this.A00 = str;
        this.A03 = d4b;
        Map map = d4b.A01;
        if (map != null) {
            this.A01 = BE6.A10(map);
        }
    }
}
