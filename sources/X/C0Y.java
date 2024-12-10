package X;

import android.os.Parcel;
import android.os.Parcelable;

public enum C0Y implements Parcelable {
    SUPPORTED("supported"),
    NOT_SUPPORTED("not-supported");
    
    public static final Parcelable.Creator CREATOR = null;
    public final String zzb;

    public int describeContents() {
        return 0;
    }

    public String toString() {
        return this.zzb;
    }

    /* JADX WARNING: type inference failed for: r0v5, types: [java.lang.Object, android.os.Parcelable$Creator] */
    /* access modifiers changed from: public */
    static {
        CREATOR = new Object();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.zzb);
    }

    /* access modifiers changed from: public */
    C0Y(String str) {
        this.zzb = str;
    }
}
