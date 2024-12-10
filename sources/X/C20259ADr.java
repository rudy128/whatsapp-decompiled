package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.ADr  reason: case insensitive filesystem */
public final class C20259ADr implements Parcelable {
    public static final Parcelable.Creator CREATOR = new Object();
    public final String A00;
    public final String A01;
    public final String A02;

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C18070vi.A0d(parcel, 0);
        parcel.writeString(this.A00);
        parcel.writeString(this.A01);
        parcel.writeString(this.A02);
    }

    public boolean equals(Object obj) {
        Object obj2 = null;
        if (obj instanceof C20259ADr) {
            obj2 = obj;
        }
        if (obj2 == null) {
            return false;
        }
        C20259ADr aDr = (C20259ADr) obj;
        if (!AnonymousClass1EG.A0I(this.A00, aDr.A00) || !AnonymousClass1EG.A0I(this.A01, aDr.A01) || !C18070vi.A18(this.A02, aDr.A02)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int i = 0;
        int A022 = AnonymousClass8BW.A02(this.A00) * 31;
        String str = this.A01;
        if (str != null) {
            i = str.hashCode();
        }
        return A022 + i;
    }

    public C20259ADr(String str, String str2, String str3) {
        this.A00 = str;
        this.A01 = str2;
        this.A02 = str3;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("BizDirectConnectionPostcode(code=");
        A10.append(this.A00);
        A10.append(", locationName=");
        A10.append(this.A01);
        A10.append(", postcodeType=");
        return C17900vP.A0B(this.A02, A10);
    }
}
