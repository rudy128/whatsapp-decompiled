package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.77F  reason: invalid class name */
public final class AnonymousClass77F implements Parcelable {
    public static final Parcelable.Creator CREATOR = new Object();
    public final int A00;
    public final long A01;
    public final String A02;
    public final String A03;
    public final String A04;

    public AnonymousClass77F(long j, String str, int i, String str2, String str3) {
        C18070vi.A0f(str, 1, str3);
        this.A03 = str;
        this.A04 = str2;
        this.A00 = i;
        this.A02 = str3;
        this.A01 = j;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass77F) {
                AnonymousClass77F r8 = (AnonymousClass77F) obj;
                if (!C18070vi.A18(this.A03, r8.A03) || !C18070vi.A18(this.A04, r8.A04) || this.A00 != r8.A00 || !C18070vi.A18(this.A02, r8.A02) || this.A01 != r8.A01) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C18070vi.A0d(parcel, 0);
        parcel.writeString(this.A03);
        parcel.writeString(this.A04);
        parcel.writeInt(this.A00);
        parcel.writeString(this.A02);
        parcel.writeLong(this.A01);
    }

    public int hashCode() {
        return AnonymousClass001.A0J(this.A01, C17890vO.A02(this.A02, (((C17880vN.A03(this.A03) + C17900vP.A00(this.A04)) * 31) + this.A00) * 31));
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("TempFMessageMediaInfo(text=");
        A10.append(this.A03);
        A10.append(", translatedText=");
        A10.append(this.A04);
        A10.append(", mediaType=");
        A10.append(this.A00);
        A10.append(", mediaUri=");
        A10.append(this.A02);
        A10.append(", timestamp=");
        return C17900vP.A0E(A10, this.A01);
    }
}
