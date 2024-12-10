package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.ADi  reason: case insensitive filesystem */
public final class C20250ADi implements Parcelable {
    public static final Parcelable.Creator CREATOR = new Object();
    public final long A00;
    public final String A01;

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C20250ADi) {
                C20250ADi aDi = (C20250ADi) obj;
                if (this.A00 != aDi.A00 || !C18070vi.A18(this.A01, aDi.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C18070vi.A0d(parcel, 0);
        parcel.writeLong(this.A00);
        parcel.writeString(this.A01);
    }

    public int hashCode() {
        return AnonymousClass8BV.A00(this.A00) + C17900vP.A00(this.A01);
    }

    public C20250ADi(long j, String str) {
        this.A00 = j;
        this.A01 = str;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("Expiration(timestamp=");
        A10.append(this.A00);
        A10.append(", description=");
        return C17900vP.A0B(this.A01, A10);
    }
}
