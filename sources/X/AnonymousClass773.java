package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.773  reason: invalid class name */
public final class AnonymousClass773 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new Object();
    public String A00;
    public String A01;
    public final String A02;

    public AnonymousClass773(String str, String str2, String str3) {
        C18070vi.A0d(str, 1);
        this.A02 = str;
        this.A01 = str2;
        this.A00 = str3;
    }

    public int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C18070vi.A0d(parcel, 0);
        parcel.writeString(this.A02);
        parcel.writeString(this.A01);
        parcel.writeString(this.A00);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof AEI)) {
            return false;
        }
        return C18070vi.A18(this.A02, ((AnonymousClass773) obj).A02);
    }

    public int hashCode() {
        return this.A02.hashCode();
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("ProductVideo(videoId=");
        A10.append(this.A02);
        A10.append(", thumbnailUrl=");
        A10.append(this.A01);
        A10.append(", originalVideoUrl=");
        return C17900vP.A0B(this.A00, A10);
    }
}
