package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.C0b  reason: case insensitive filesystem */
public enum C24366C0b implements Parcelable {
    NONE("none");
    
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
    C24366C0b(String str) {
        this.zzb = str;
    }

    public static C24366C0b A00(String str) {
        for (C24366C0b c0b : values()) {
            if (str.equals(c0b.zzb)) {
                return c0b;
            }
        }
        throw new C1X(str);
    }
}
