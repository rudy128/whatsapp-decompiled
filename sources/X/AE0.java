package X;

import android.os.Parcel;
import android.os.Parcelable;

public final class AE0 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new Object();
    public final String A00;
    public final String A01;
    public final String A02;

    public AE0(String str, String str2, String str3) {
        C18070vi.A0d(str, 1);
        this.A00 = str;
        this.A01 = str2;
        this.A02 = str3;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AE0) {
                AE0 ae0 = (AE0) obj;
                if (!C18070vi.A18(this.A00, ae0.A00) || !C18070vi.A18(this.A01, ae0.A01) || !C18070vi.A18(this.A02, ae0.A02)) {
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
        parcel.writeString(this.A02);
    }

    public int hashCode() {
        return ((C17880vN.A03(this.A00) + C17900vP.A00(this.A01)) * 31) + C108955ca.A06(this.A02);
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("FlowConfiguration(flowId=");
        A10.append(this.A00);
        A10.append(", flowMessageVersion=");
        A10.append(this.A01);
        A10.append(", flowToken=");
        return C17900vP.A0B(this.A02, A10);
    }
}
