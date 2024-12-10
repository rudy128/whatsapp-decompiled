package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.77A  reason: invalid class name */
public final class AnonymousClass77A implements Parcelable {
    public static final Parcelable.Creator CREATOR = new Object();
    public final AD8 A00;
    public final boolean A01;
    public final boolean A02;
    public final boolean A03;

    public AnonymousClass77A(AD8 ad8, boolean z, boolean z2, boolean z3) {
        C18070vi.A0d(ad8, 1);
        this.A00 = ad8;
        this.A03 = z;
        this.A01 = z2;
        this.A02 = z3;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass77A) {
                AnonymousClass77A r5 = (AnonymousClass77A) obj;
                if (!(C18070vi.A18(this.A00, r5.A00) && this.A03 == r5.A03 && this.A01 == r5.A01 && this.A02 == r5.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C18070vi.A0d(parcel, 0);
        parcel.writeParcelable(this.A00, i);
        parcel.writeInt(this.A03 ? 1 : 0);
        parcel.writeInt(this.A01 ? 1 : 0);
        parcel.writeInt(this.A02 ? 1 : 0);
    }

    public int hashCode() {
        return C17880vN.A01(AnonymousClass0DV.A00(AnonymousClass0DV.A00(AnonymousClass000.A0L(this.A00), this.A03), this.A01), this.A02);
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("VariantItemDisplayData(property=");
        A10.append(this.A00);
        A10.append(", isVisible=");
        A10.append(this.A03);
        A10.append(", isEnabled=");
        A10.append(this.A01);
        A10.append(", isSelected=");
        return C17900vP.A0F(A10, this.A02);
    }
}
