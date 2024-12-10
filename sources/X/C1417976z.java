package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.76z  reason: invalid class name and case insensitive filesystem */
public final class C1417976z implements Parcelable {
    public static final Parcelable.Creator CREATOR = new Object();
    public final float A00;
    public final int A01;

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C1417976z) {
                C1417976z r5 = (C1417976z) obj;
                if (!(this.A01 == r5.A01 && Float.compare(this.A00, r5.A00) == 0)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (this.A01 * 31) + Float.floatToIntBits(this.A00);
    }

    public void writeToParcel(Parcel parcel, int i) {
        C18070vi.A0d(parcel, 0);
        parcel.writeInt(this.A01);
        parcel.writeFloat(this.A00);
    }

    public C1417976z(int i, float f) {
        this.A01 = i;
        this.A00 = f;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("ShapeStickerLayoutData(lineColor=");
        A10.append(this.A01);
        A10.append(", lineWidth=");
        return AnonymousClass001.A1K(A10, this.A00);
    }
}
