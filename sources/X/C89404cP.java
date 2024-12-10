package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.4cP  reason: invalid class name and case insensitive filesystem */
public final class C89404cP implements Parcelable {
    public static final Parcelable.Creator CREATOR = new Object();
    public final String A00;
    public final String A01;
    public final boolean A02;

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C89404cP) {
                C89404cP r5 = (C89404cP) obj;
                if (!C18070vi.A18(this.A01, r5.A01) || this.A02 != r5.A02 || !C18070vi.A18(this.A00, r5.A00)) {
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
        parcel.writeInt(this.A02 ? 1 : 0);
        parcel.writeString(this.A00);
    }

    public int hashCode() {
        return AnonymousClass0DV.A00(C17880vN.A03(this.A01), this.A02) + this.A00.hashCode();
    }

    public C89404cP(String str, String str2, boolean z) {
        C72473Md.A1I(str, str2);
        this.A01 = str;
        this.A02 = z;
        this.A00 = str2;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("ShareSheetData(text=");
        A10.append(this.A01);
        A10.append(", isVideo=");
        A10.append(this.A02);
        A10.append(", emailSubject=");
        return C17900vP.A0B(this.A00, A10);
    }
}
