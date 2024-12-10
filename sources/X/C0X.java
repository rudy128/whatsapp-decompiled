package X;

import android.os.Parcel;
import android.os.Parcelable;

public enum C0X implements Parcelable {
    NOT_SUPPORTED_ERR(9),
    INVALID_STATE_ERR(11),
    SECURITY_ERR(18),
    NETWORK_ERR(19),
    ABORT_ERR(20),
    TIMEOUT_ERR(23),
    ENCODING_ERR(27),
    UNKNOWN_ERR(28),
    CONSTRAINT_ERR(29),
    DATA_ERR(30),
    NOT_ALLOWED_ERR(35),
    ATTESTATION_NOT_PRIVATE_ERR(36);
    
    public static final Parcelable.Creator CREATOR = null;
    public final int zzb;

    public int describeContents() {
        return 0;
    }

    /* JADX WARNING: type inference failed for: r0v14, types: [java.lang.Object, android.os.Parcelable$Creator] */
    /* access modifiers changed from: public */
    static {
        CREATOR = new Object();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.zzb);
    }

    /* access modifiers changed from: public */
    C0X(int i) {
        this.zzb = i;
    }
}
