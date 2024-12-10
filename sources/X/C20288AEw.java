package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.AEw  reason: case insensitive filesystem */
public final class C20288AEw implements Parcelable, C22424B7g {
    public static final Parcelable.Creator CREATOR = new Object();
    public long A00;
    public final String A01;

    public C20288AEw(String str, long j) {
        C18070vi.A0d(str, 1);
        this.A01 = str;
        this.A00 = j;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (obj == null || !C18070vi.A14(obj, this)) {
            return false;
        }
        C20288AEw aEw = (C20288AEw) obj;
        return this == aEw || C18070vi.A18(this.A01, aEw.A01);
    }

    public void writeToParcel(Parcel parcel, int i) {
        C18070vi.A0d(parcel, 0);
        parcel.writeString(this.A01);
        parcel.writeLong(this.A00);
    }

    public int hashCode() {
        return this.A01.hashCode();
    }

    public long BaP() {
        return this.A00;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("DirectoryRecentSearchQuery(searchQuery=");
        A10.append(this.A01);
        A10.append(", timeAdded=");
        return C17900vP.A0E(A10, this.A00);
    }
}
