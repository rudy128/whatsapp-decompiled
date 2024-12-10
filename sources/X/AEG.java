package X;

import android.os.Parcel;
import android.os.Parcelable;

public final class AEG implements Parcelable {
    public static final AEG A04 = new AEG((Double) null, (Double) null, "", "");
    public static final Parcelable.Creator CREATOR = new Object();
    public String A00;
    public String A01;
    public final Double A02;
    public final Double A03;

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AEG) {
                AEG aeg = (AEG) obj;
                if (!C18070vi.A18(this.A00, aeg.A00) || !C18070vi.A18(this.A01, aeg.A01) || !C18070vi.A18(this.A02, aeg.A02) || !C18070vi.A18(this.A03, aeg.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C18070vi.A0d(parcel, 0);
        parcel.writeString(this.A00);
        parcel.writeString(this.A01);
        Double d = this.A02;
        if (d == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeDouble(d.doubleValue());
        }
        Double d2 = this.A03;
        if (d2 == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeDouble(d2.doubleValue());
    }

    public int hashCode() {
        return ((C17890vO.A02(this.A01, C17880vN.A03(this.A00)) + AnonymousClass001.A0k(this.A02)) * 31) + C17880vN.A02(this.A03);
    }

    public AEG(Double d, Double d2, String str, String str2) {
        this.A00 = str;
        this.A01 = str2;
        this.A02 = d;
        this.A03 = d2;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("CityLevelAddress(cityId=");
        A10.append(this.A00);
        A10.append(", cityName=");
        A10.append(this.A01);
        A10.append(", latitude=");
        A10.append(this.A02);
        A10.append(", longitude=");
        return AnonymousClass001.A1F(this.A03, A10);
    }
}
