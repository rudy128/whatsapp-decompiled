package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.8iQ  reason: invalid class name and case insensitive filesystem */
public final class C168168iQ extends AD8 {
    public static final Parcelable.Creator CREATOR = new Object();
    public final String A00;

    public C168168iQ(String str) {
        C18070vi.A0d(str, 1);
        this.A00 = str;
    }

    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C168168iQ) && C18070vi.A18(this.A00, ((C168168iQ) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C18070vi.A0d(parcel, 0);
        parcel.writeString(this.A00);
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("TextOption(value=");
        return C17900vP.A0B(this.A00, A10);
    }
}
