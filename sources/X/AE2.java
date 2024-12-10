package X;

import android.os.Parcel;
import android.os.Parcelable;

public final class AE2 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new Object();
    public final Integer A00;
    public final String A01;
    public final String A02;

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AE2) {
                AE2 ae2 = (AE2) obj;
                if (!C18070vi.A18(this.A01, ae2.A01) || !C18070vi.A18(this.A02, ae2.A02) || !C18070vi.A18(this.A00, ae2.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int intValue;
        C18070vi.A0d(parcel, 0);
        parcel.writeString(this.A01);
        parcel.writeString(this.A02);
        Integer num = this.A00;
        if (num == null) {
            intValue = 0;
        } else {
            parcel.writeInt(1);
            intValue = num.intValue();
        }
        parcel.writeInt(intValue);
    }

    public int hashCode() {
        return (((C17900vP.A00(this.A01) * 31) + C17900vP.A00(this.A02)) * 31) + C17880vN.A02(this.A00);
    }

    public AE2(Integer num, String str, String str2) {
        this.A01 = str;
        this.A02 = str2;
        this.A00 = num;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("NativeFlowResponse(name=");
        A10.append(this.A01);
        A10.append(", paramsJson=");
        A10.append(this.A02);
        A10.append(", version=");
        return AnonymousClass001.A1F(this.A00, A10);
    }
}
