package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;

public final class AEK implements Parcelable {
    public static final Parcelable.Creator CREATOR = new Object();
    public final float A00;
    public final float A01;
    public final int A02;
    public final int A03;
    public final ArrayList A04;

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AEK) {
                AEK aek = (AEK) obj;
                if (!(Float.compare(this.A01, aek.A01) == 0 && Float.compare(this.A00, aek.A00) == 0 && this.A02 == aek.A02 && C18070vi.A18(this.A04, aek.A04) && this.A03 == aek.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C18070vi.A0d(parcel, 0);
        parcel.writeFloat(this.A01);
        parcel.writeFloat(this.A00);
        parcel.writeInt(this.A02);
        ArrayList arrayList = this.A04;
        parcel.writeInt(arrayList.size());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((C20247ADf) it.next()).writeToParcel(parcel, i);
        }
        parcel.writeInt(this.A03);
    }

    public int hashCode() {
        return AnonymousClass000.A0N(this.A04, ((((Float.floatToIntBits(this.A01) * 31) + Float.floatToIntBits(this.A00)) * 31) + this.A02) * 31) + this.A03;
    }

    public AEK(ArrayList arrayList, float f, float f2, int i, int i2) {
        this.A01 = f;
        this.A00 = f2;
        this.A02 = i;
        this.A04 = arrayList;
        this.A03 = i2;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("MapViewSegment(startDistanceInMeter=");
        A10.append(this.A01);
        A10.append(", endDistanceInMeter=");
        A10.append(this.A00);
        A10.append(", compactPinLayerCount=");
        A10.append(this.A02);
        A10.append(", mapViewLayers=");
        A10.append(this.A04);
        A10.append(", gridSize=");
        return AnonymousClass001.A1L(A10, this.A03);
    }
}
