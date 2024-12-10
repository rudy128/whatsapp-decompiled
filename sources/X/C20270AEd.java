package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.AEd  reason: case insensitive filesystem */
public final class C20270AEd implements Parcelable {
    public static final Parcelable.Creator CREATOR = new Object();
    public final String A00;
    public final String A01;
    public final boolean A02;

    public C20270AEd(String str, String str2, boolean z) {
        C18070vi.A0d(str, 2);
        this.A02 = z;
        this.A00 = str;
        this.A01 = str2;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C20270AEd) {
                C20270AEd aEd = (C20270AEd) obj;
                if (this.A02 != aEd.A02 || !C18070vi.A18(this.A00, aEd.A00) || !C18070vi.A18(this.A01, aEd.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C18070vi.A0d(parcel, 0);
        parcel.writeByte(this.A02 ? (byte) 1 : 0);
        parcel.writeString(this.A00);
        parcel.writeString(this.A01);
    }

    public int hashCode() {
        return C108945cZ.A09(this.A01, C17890vO.A02(this.A00, AnonymousClass3MX.A03(this.A02)));
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("PaymentMethodDetailsInternationalViewState(isShimmering=");
        A10.append(this.A02);
        A10.append(", descriptionText=");
        A10.append(this.A00);
        A10.append(", showDialog=");
        return C17900vP.A0B(this.A01, A10);
    }

    public C20270AEd() {
        this("", "", false);
    }
}
