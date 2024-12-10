package X;

import android.os.Parcel;
import android.os.Parcelable;

public class D43 implements Parcelable {
    public static final Parcelable.Creator CREATOR = D3B.A00(39);
    public final float A00;
    public final C24258ByH A01;
    public final C24258ByH A02;

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof D43)) {
            return false;
        }
        D43 d43 = (D43) obj;
        return Float.compare(d43.A00, this.A00) == 0 && this.A01 == d43.A01 && this.A02 == d43.A02;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A01.name());
        parcel.writeString(this.A02.name());
        parcel.writeFloat(this.A00);
    }

    public D43(Parcel parcel) {
        C24258ByH valueOf;
        C24258ByH valueOf2;
        String readString = parcel.readString();
        if (readString == null) {
            valueOf = C24258ByH.NONE;
        } else {
            valueOf = C24258ByH.valueOf(readString);
        }
        this.A01 = valueOf;
        String readString2 = parcel.readString();
        if (readString2 == null) {
            valueOf2 = C24258ByH.NONE;
        } else {
            valueOf2 = C24258ByH.valueOf(readString2);
        }
        this.A02 = valueOf2;
        this.A00 = parcel.readFloat();
    }

    public int hashCode() {
        Object[] A1a = AnonymousClass8BR.A1a();
        A1a[0] = this.A01;
        A1a[1] = this.A02;
        return AnonymousClass000.A0P(Float.valueOf(this.A00), A1a, 2);
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("AudioFocusLossSettings{mAudioFocusLossBehavior=");
        A10.append(this.A01);
        A10.append(", mAudioFocusTransientLossBehavior=");
        A10.append(this.A02);
        A10.append(", mAudioFocusTransientLossDuckVolume=");
        A10.append(this.A00);
        return C17890vO.A0b(A10);
    }

    public D43() {
        this.A01 = C24258ByH.PAUSE;
        this.A02 = C24258ByH.NONE;
        this.A00 = 0.0f;
    }
}
