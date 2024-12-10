package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.777  reason: invalid class name */
public final class AnonymousClass777 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new Object();
    public final String A00;
    public final String A01;
    public final String A02;

    public AnonymousClass777(String str, String str2, String str3) {
        C18070vi.A0d(str, 1);
        this.A02 = str;
        this.A01 = str2;
        this.A00 = str3;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass777) {
                AnonymousClass777 r5 = (AnonymousClass777) obj;
                if (!C18070vi.A18(this.A02, r5.A02) || !C18070vi.A18(this.A01, r5.A01) || !C18070vi.A18(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C18070vi.A0d(parcel, 0);
        parcel.writeString(this.A02);
        parcel.writeString(this.A01);
        parcel.writeString(this.A00);
    }

    public int hashCode() {
        return ((C17880vN.A03(this.A02) + C17900vP.A00(this.A01)) * 31) + C108955ca.A06(this.A00);
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("AvatarDownloadableAsset(url=");
        A10.append(this.A02);
        A10.append(", emojis=");
        C108965cb.A1U(A10, this.A01);
        return C17900vP.A0B(this.A00, A10);
    }
}
