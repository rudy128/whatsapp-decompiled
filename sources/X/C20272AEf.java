package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.AEf  reason: case insensitive filesystem */
public final class C20272AEf implements Parcelable {
    public static final Parcelable.Creator CREATOR = new Object();
    public final double A00;
    public final float A01;
    public final int A02;
    public final ArrayList A03;
    public final ArrayList A04;

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C20272AEf) {
                C20272AEf aEf = (C20272AEf) obj;
                if (!(Double.compare(this.A00, aEf.A00) == 0 && this.A02 == aEf.A02 && Float.compare(this.A01, aEf.A01) == 0 && C18070vi.A18(this.A03, aEf.A03) && C18070vi.A18(this.A04, aEf.A04))) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C18070vi.A0d(parcel, 0);
        parcel.writeDouble(this.A00);
        parcel.writeInt(this.A02);
        parcel.writeFloat(this.A01);
        ArrayList arrayList = this.A03;
        parcel.writeInt(arrayList.size());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            parcel.writeFloat(AnonymousClass000.A04(it.next()));
        }
        ArrayList arrayList2 = this.A04;
        parcel.writeInt(arrayList2.size());
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            ((AEK) it2.next()).writeToParcel(parcel, i);
        }
    }

    public int hashCode() {
        return AnonymousClass000.A0O(this.A04, AnonymousClass000.A0N(this.A03, ((((AnonymousClass000.A0I(Double.doubleToLongBits(this.A00)) * 31) + this.A02) * 31) + Float.floatToIntBits(this.A01)) * 31));
    }

    public C20272AEf(ArrayList arrayList, ArrayList arrayList2, double d, float f, int i) {
        this.A00 = d;
        this.A02 = i;
        this.A01 = f;
        this.A03 = arrayList;
        this.A04 = arrayList2;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("MapViewConfig(maxBusinessDistanceInMeter=");
        A10.append(this.A00);
        A10.append(", maxNoOfBusinesses=");
        A10.append(this.A02);
        A10.append(", defaultZoomLevel=");
        A10.append(this.A01);
        A10.append(", layeredZoomLevels=");
        A10.append(this.A03);
        A10.append(", mapViewSegments=");
        return AnonymousClass001.A1F(this.A04, A10);
    }

    public C20272AEf() {
        this(AnonymousClass000.A13(), AnonymousClass000.A13(), 0.0d, 0.0f, 0);
    }
}
