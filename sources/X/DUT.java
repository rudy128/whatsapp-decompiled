package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Comparator;
import java.util.UUID;

public final class DUT implements Comparator, Parcelable {
    public static final Parcelable.Creator CREATOR = new D36(3);
    public int A00;
    public final String A01;
    public final C26540D3b[] A02;

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            DUT dut = (DUT) obj;
            if (!C25458CgB.A00(this.A01, dut.A01) || !Arrays.equals(this.A02, dut.A02)) {
                return false;
            }
        }
        return true;
    }

    public /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        UUID uuid = CI0.A03;
        UUID uuid2 = ((C26540D3b) obj).A03;
        boolean equals = uuid.equals(uuid2);
        UUID uuid3 = ((C26540D3b) obj2).A03;
        if (!equals) {
            return uuid2.compareTo(uuid3);
        }
        if (uuid.equals(uuid3)) {
            return 0;
        }
        return 1;
    }

    public int hashCode() {
        int i = this.A00;
        if (i != 0) {
            return i;
        }
        int A002 = (C17900vP.A00(this.A01) * 31) + Arrays.hashCode(this.A02);
        this.A00 = A002;
        return A002;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A01);
        parcel.writeTypedArray(this.A02, 0);
    }

    public DUT(Parcel parcel) {
        this.A01 = parcel.readString();
        this.A02 = (C26540D3b[]) parcel.createTypedArray(C26540D3b.CREATOR);
    }
}
