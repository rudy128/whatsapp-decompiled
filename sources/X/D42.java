package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

public final class D42 implements Parcelable {
    public static final Parcelable.Creator CREATOR = D3B.A00(14);
    public final long A00;
    public final ECQ[] A01;

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            D42 d42 = (D42) obj;
            if (!Arrays.equals(this.A01, d42.A01) || this.A00 != d42.A00) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass001.A0J(this.A00, Arrays.hashCode(this.A01) * 31);
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(r3);
        for (ECQ writeParcelable : this.A01) {
            parcel.writeParcelable(writeParcelable, 0);
        }
        parcel.writeLong(this.A00);
    }

    public D42(Parcel parcel) {
        this.A01 = new ECQ[parcel.readInt()];
        int i = 0;
        while (true) {
            Object[] objArr = this.A01;
            if (i < objArr.length) {
                objArr[i] = AnonymousClass3Ma.A08(parcel, ECQ.class);
                i++;
            } else {
                this.A00 = parcel.readLong();
                return;
            }
        }
    }

    public String toString() {
        String A0a;
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("entries=");
        BE6.A1L(A10, this.A01);
        long j = this.A00;
        if (j == -9223372036854775807L) {
            A0a = "";
        } else {
            A0a = C17890vO.A0a(", presentationTimeUs=", AnonymousClass000.A10(), j);
        }
        return AnonymousClass000.A0y(A0a, A10);
    }

    public D42(ECQ... ecqArr) {
        this.A00 = -9223372036854775807L;
        this.A01 = ecqArr;
    }
}
