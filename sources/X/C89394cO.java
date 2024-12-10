package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.4cO  reason: invalid class name and case insensitive filesystem */
public final class C89394cO implements Parcelable {
    public static final Parcelable.Creator CREATOR = new Object();
    public final String A00;
    public final String A01;
    public final String A02;

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C89394cO) {
                C89394cO r5 = (C89394cO) obj;
                if (!C18070vi.A18(this.A00, r5.A00) || !C18070vi.A18(this.A02, r5.A02) || !C18070vi.A18(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C18070vi.A0d(parcel, 0);
        parcel.writeString(this.A00);
        parcel.writeString(this.A02);
        parcel.writeString(this.A01);
    }

    public int hashCode() {
        return C17890vO.A02(this.A02, C17880vN.A03(this.A00)) + this.A01.hashCode();
    }

    public C89394cO(String str, String str2, String str3) {
        C18070vi.A0o(str, str2, str3);
        this.A00 = str;
        this.A02 = str2;
        this.A01 = str3;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("ImageCandidateGenerationResponse(imageId=");
        A10.append(this.A00);
        A10.append(", imageUrl=");
        A10.append(this.A02);
        A10.append(", imagePrompt=");
        return C17900vP.A0B(this.A01, A10);
    }
}
