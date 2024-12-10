package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.77I  reason: invalid class name */
public final class AnonymousClass77I implements Parcelable {
    public static final Parcelable.Creator CREATOR = new Object();
    public int A00 = 0;
    public int A01 = 0;
    public int A02 = 0;
    public String A03 = null;
    public boolean A04 = false;
    public boolean A05 = false;

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass77I) {
                AnonymousClass77I r5 = (AnonymousClass77I) obj;
                if (!(this.A01 == r5.A01 && this.A00 == r5.A00 && this.A02 == r5.A02 && C18070vi.A18(this.A03, r5.A03) && this.A04 == r5.A04 && this.A05 == r5.A05)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C18070vi.A0d(parcel, 0);
        parcel.writeInt(this.A01);
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A02);
        parcel.writeString(this.A03);
        parcel.writeInt(this.A04 ? 1 : 0);
        parcel.writeInt(this.A05 ? 1 : 0);
    }

    public int hashCode() {
        return C17880vN.A01(AnonymousClass0DV.A00(((((((this.A01 * 31) + this.A00) * 31) + this.A02) * 31) + C17900vP.A00(this.A03)) * 31, this.A04), this.A05);
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("ImageListParam{loc=");
        A10.append(this.A01);
        A10.append(",inc=");
        A10.append(this.A00);
        A10.append(",sort=");
        A10.append(this.A02);
        A10.append(",bucket=");
        A10.append(this.A03);
        A10.append(",empty=");
        A10.append(this.A05);
        A10.append(",favorite=");
        A10.append(this.A04);
        return C17890vO.A0b(A10);
    }
}
