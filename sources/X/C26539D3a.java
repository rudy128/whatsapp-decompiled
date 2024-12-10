package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.D3a  reason: case insensitive filesystem */
public final class C26539D3a implements Parcelable {
    public static final C26539D3a A03 = new C26539D3a(new D3X[0]);
    public static final E0X CREATOR = new C26654D8d(2);
    public int A00;
    public final int A01;
    public final AnonymousClass1IX A02;

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C26539D3a d3a = (C26539D3a) obj;
            if (this.A01 != d3a.A01 || !this.A02.equals(d3a.A02)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int i = this.A00;
        if (i != 0) {
            return i;
        }
        int hashCode = this.A02.hashCode();
        this.A00 = hashCode;
        return hashCode;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int i2 = this.A01;
        parcel.writeInt(i2);
        for (int i3 = 0; i3 < i2; i3++) {
            parcel.writeParcelable((Parcelable) this.A02.get(i3), 0);
        }
    }

    public C26539D3a(D3X... d3xArr) {
        this.A02 = AnonymousClass1IX.copyOf((Object[]) d3xArr);
        this.A01 = d3xArr.length;
    }
}
