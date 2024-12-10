package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.ADc  reason: case insensitive filesystem */
public final class C20244ADc implements Parcelable {
    public static final C189099iV A01 = new Object();
    public static final Parcelable.Creator CREATOR = new Object();
    public final String A00;

    public C20244ADc(String str) {
        C18070vi.A0d(str, 1);
        this.A00 = str;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C20244ADc) && C18070vi.A18(this.A00, ((C20244ADc) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public void writeToParcel(Parcel parcel, int i) {
        C18070vi.A0d(parcel, 0);
        parcel.writeString(this.A00);
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("IndiaUpiTransactionOfferData(id=");
        return C17900vP.A0B(this.A00, A10);
    }
}
