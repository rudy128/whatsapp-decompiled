package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.AEx  reason: case insensitive filesystem */
public final class C20289AEx implements Parcelable, C22424B7g {
    public static final Parcelable.Creator CREATOR = new Object();
    public long A00;
    public final String A01;
    public final String A02;
    public final String A03;

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (obj == null || !C18070vi.A14(obj, this)) {
            return false;
        }
        C20289AEx aEx = (C20289AEx) obj;
        return this == aEx || C18070vi.A18(this.A03, aEx.A03);
    }

    public void writeToParcel(Parcel parcel, int i) {
        C18070vi.A0d(parcel, 0);
        parcel.writeLong(this.A00);
        parcel.writeString(this.A01);
        parcel.writeString(this.A02);
        parcel.writeString(this.A03);
    }

    public int hashCode() {
        return this.A03.hashCode();
    }

    public C20289AEx(long j, String str, String str2, String str3) {
        C18070vi.A0p(str, str2, str3);
        this.A00 = j;
        this.A01 = str;
        this.A02 = str2;
        this.A03 = str3;
    }

    public long BaP() {
        return this.A00;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("DirectoryBusinessProfileRecentSearch(timeAdded=");
        A10.append(this.A00);
        A10.append(", businessName=");
        A10.append(this.A01);
        A10.append(", categories=");
        A10.append(this.A02);
        A10.append(", jid=");
        return C17900vP.A0B(this.A03, A10);
    }
}
