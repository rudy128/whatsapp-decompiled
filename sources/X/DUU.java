package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.android.exoplayer2.util.Util;
import java.util.Arrays;
import java.util.Comparator;
import java.util.UUID;

public final class DUU implements Comparator, Parcelable {
    public static final Parcelable.Creator CREATOR = D3B.A00(11);
    public int A00;
    public final int A01;
    public final String A02;
    public final C26556D3w[] A03;

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            DUU duu = (DUU) obj;
            if (!Util.A0D(this.A02, duu.A02) || !Arrays.equals(this.A03, duu.A03)) {
                return false;
            }
        }
        return true;
    }

    public /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        UUID uuid = C24736CHy.A03;
        UUID uuid2 = ((C26556D3w) obj).A03;
        boolean equals = uuid.equals(uuid2);
        UUID uuid3 = ((C26556D3w) obj2).A03;
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
        int A002 = (C17900vP.A00(this.A02) * 31) + Arrays.hashCode(this.A03);
        this.A00 = A002;
        return A002;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A02);
        parcel.writeTypedArray(this.A03, 0);
    }

    public DUU(String str, C26556D3w... d3wArr) {
        this.A02 = str;
        this.A03 = d3wArr;
        this.A01 = d3wArr.length;
        Arrays.sort(d3wArr, this);
    }

    public DUU(Parcel parcel) {
        this.A02 = parcel.readString();
        C26556D3w[] d3wArr = (C26556D3w[]) parcel.createTypedArray(C26556D3w.CREATOR);
        this.A03 = d3wArr;
        this.A01 = d3wArr.length;
    }
}
