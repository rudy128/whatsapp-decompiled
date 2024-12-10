package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.770  reason: invalid class name */
public final class AnonymousClass770 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new Object();
    public final String A00;
    public final String A01;

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass770) {
                AnonymousClass770 r5 = (AnonymousClass770) obj;
                if (!C18070vi.A18(this.A01, r5.A01) || !C18070vi.A18(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C18070vi.A0d(parcel, 0);
        parcel.writeString(this.A01);
        parcel.writeString(this.A00);
    }

    public int hashCode() {
        return (C17900vP.A00(this.A01) * 31) + C108955ca.A06(this.A00);
    }

    public AnonymousClass770(String str, String str2) {
        this.A01 = str;
        this.A00 = str2;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("SupportUserContext(entrypoint=");
        A10.append(this.A01);
        A10.append(", articles=");
        return C17900vP.A0B(this.A00, A10);
    }
}
