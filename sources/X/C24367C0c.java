package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.C0c  reason: case insensitive filesystem */
public enum C24367C0c implements Parcelable {
    RESIDENT_KEY_REQUIRED("required");
    
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
    C24367C0c(String str) {
        this.zzb = str;
    }

    public static C24367C0c A00(String str) {
        for (C24367C0c c0c : values()) {
            if (str.equals(c0c.zzb)) {
                return c0c;
            }
        }
        throw new C24382C1b(str);
    }
}
