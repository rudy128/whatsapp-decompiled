package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.AEy  reason: case insensitive filesystem */
public final class C20290AEy implements Parcelable, C22424B7g {
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
        C20290AEy aEy = (C20290AEy) obj;
        return this == aEy || (C18070vi.A18(this.A02, aEy.A02) && C18070vi.A18(this.A01, aEy.A01));
    }

    public void writeToParcel(Parcel parcel, int i) {
        C18070vi.A0d(parcel, 0);
        parcel.writeString(this.A02);
        parcel.writeString(this.A01);
        parcel.writeString(this.A03);
        parcel.writeLong(this.A00);
    }

    public C20290AEy(long j, String str, String str2, String str3) {
        C18070vi.A0j(str, str2);
        this.A02 = str;
        this.A01 = str2;
        this.A03 = str3;
        this.A00 = j;
    }

    public long BaP() {
        return this.A00;
    }

    public int hashCode() {
        Object[] A1b = AnonymousClass3MW.A1b();
        A1b[0] = this.A01;
        return AnonymousClass000.A0P(this.A02, A1b, 1);
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("DirectoryRecentCategorySearch(categoryName=");
        A10.append(this.A02);
        A10.append(", categoryId=");
        A10.append(this.A01);
        A10.append(", parentCategory=");
        A10.append(this.A03);
        A10.append(", timeAdded=");
        return C17900vP.A0E(A10, this.A00);
    }
}
