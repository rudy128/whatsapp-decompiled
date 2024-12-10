package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* renamed from: X.D3c  reason: case insensitive filesystem */
public final class C26541D3c implements Parcelable {
    public static final Parcelable.Creator CREATOR = new D36(5);
    public final ECR[] A00;

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.A00, ((C26541D3c) obj).A00);
    }

    public int hashCode() {
        return Arrays.hashCode(this.A00);
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(r3);
        for (ECR writeParcelable : this.A00) {
            parcel.writeParcelable(writeParcelable, 0);
        }
    }

    public C26541D3c(Parcel parcel) {
        this.A00 = new ECR[parcel.readInt()];
        int i = 0;
        while (true) {
            ECR[] ecrArr = this.A00;
            if (i < ecrArr.length) {
                parcel.readParcelable(ECR.class.getClassLoader());
                ecrArr[i] = null;
                i++;
            } else {
                return;
            }
        }
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("entries=");
        return AnonymousClass000.A0y(Arrays.toString(this.A00), A10);
    }
}
