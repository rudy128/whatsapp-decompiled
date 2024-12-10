package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.BpL  reason: case insensitive filesystem */
public final class C23776BpL extends D3E {
    public static final Parcelable.Creator CREATOR = new Object();
    public final int A00;

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C23776BpL) && this.A00 == ((C23776BpL) obj).A00);
    }

    public int hashCode() {
        return this.A00;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C18070vi.A0d(parcel, 0);
        parcel.writeInt(this.A00);
    }

    public C23776BpL(int i) {
        this.A00 = i;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("Dp(dp=");
        return AnonymousClass001.A1L(A10, this.A00);
    }
}
