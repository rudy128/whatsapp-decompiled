package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.46p  reason: invalid class name */
public final class AnonymousClass46p extends C89264cB {
    public static final Parcelable.Creator CREATOR = new Object();
    public final String A00;

    public AnonymousClass46p(String str) {
        C18070vi.A0d(str, 1);
        this.A00 = str;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof AnonymousClass46p) && C18070vi.A18(this.A00, ((AnonymousClass46p) obj).A00));
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
        A10.append("Url(url=");
        return C17900vP.A0B(this.A00, A10);
    }
}
