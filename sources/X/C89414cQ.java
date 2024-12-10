package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.4cQ  reason: invalid class name and case insensitive filesystem */
public final class C89414cQ implements Parcelable {
    public static final Parcelable.Creator CREATOR = new Object();
    public final int A00;
    public final String A01;
    public final String A02;

    public C89414cQ(String str, String str2, int i) {
        C18070vi.A0d(str2, 2);
        this.A01 = str;
        this.A02 = str2;
        this.A00 = i;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C89414cQ) {
                C89414cQ r5 = (C89414cQ) obj;
                if (!C18070vi.A18(this.A01, r5.A01) || !C18070vi.A18(this.A02, r5.A02) || this.A00 != r5.A00) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C18070vi.A0d(parcel, 0);
        parcel.writeString(this.A01);
        parcel.writeString(this.A02);
        parcel.writeInt(this.A00);
    }

    public int hashCode() {
        return C17890vO.A02(this.A02, C17900vP.A00(this.A01) * 31) + this.A00;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("BusinessCategoryChipData(categoryId=");
        A10.append(this.A01);
        A10.append(", name=");
        A10.append(this.A02);
        A10.append(", drawableRes=");
        return AnonymousClass001.A1L(A10, this.A00);
    }
}
