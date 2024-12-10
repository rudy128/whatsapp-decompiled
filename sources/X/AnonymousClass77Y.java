package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.77Y  reason: invalid class name */
public final class AnonymousClass77Y implements Parcelable {
    public static final Parcelable.Creator CREATOR = new Object();
    public final int A00;
    public final int A01;
    public final String A02;
    public final int A03;
    public final String A04;

    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass77Y) {
                AnonymousClass77Y r5 = (AnonymousClass77Y) obj;
                if (!(C18070vi.A18(this.A04, r5.A04) && C18070vi.A18(this.A02, r5.A02) && this.A00 == r5.A00 && this.A01 == r5.A01 && this.A03 == r5.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C18070vi.A0d(parcel, 0);
        parcel.writeString(this.A04);
        parcel.writeString(this.A02);
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A01);
        parcel.writeInt(this.A03);
    }

    public int hashCode() {
        return (((((((C17900vP.A00(this.A04) * 31) + C108955ca.A06(this.A02)) * 31) + this.A00) * 31) + this.A01) * 31) + this.A03;
    }

    public AnonymousClass77Y(String str, String str2, int i, int i2, int i3) {
        this.A04 = str;
        this.A02 = str2;
        this.A00 = i;
        this.A01 = i2;
        this.A03 = i3;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("GifFile(plainFileHash=");
        A10.append(this.A04);
        A10.append(", filePath=");
        A10.append(this.A02);
        A10.append(", height=");
        A10.append(this.A00);
        A10.append(", width=");
        A10.append(this.A01);
        A10.append(", gifAttribution=");
        return AnonymousClass001.A1L(A10, this.A03);
    }

    public AnonymousClass77Y() {
        this((String) null, (String) null, 0, 0, 0);
    }
}
