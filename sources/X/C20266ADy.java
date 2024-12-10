package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.ADy  reason: case insensitive filesystem */
public final class C20266ADy implements Parcelable {
    public static final Parcelable.Creator CREATOR = new Object();
    public final AE1 A00;
    public final String A01;
    public final String A02;

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C20266ADy) {
                C20266ADy aDy = (C20266ADy) obj;
                if (!C18070vi.A18(this.A02, aDy.A02) || !C18070vi.A18(this.A01, aDy.A01) || !C18070vi.A18(this.A00, aDy.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C18070vi.A0d(parcel, 0);
        parcel.writeString(this.A02);
        parcel.writeString(this.A01);
        AE1 ae1 = this.A00;
        if (ae1 == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        ae1.writeToParcel(parcel, i);
    }

    public int hashCode() {
        return C17890vO.A02(this.A01, C17880vN.A03(this.A02)) + AnonymousClass001.A0k(this.A00);
    }

    public C20266ADy(AE1 ae1, String str, String str2) {
        C18070vi.A0j(str, str2);
        this.A02 = str;
        this.A01 = str2;
        this.A00 = ae1;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("Coupon(id=");
        A10.append(this.A02);
        A10.append(", code=");
        A10.append(this.A01);
        A10.append(", discount=");
        return AnonymousClass001.A1F(this.A00, A10);
    }
}
