package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.779  reason: invalid class name */
public final class AnonymousClass779 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new Object();
    public final AnonymousClass77S A00;
    public final AnonymousClass77S A01;
    public final AnonymousClass77S A02;

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass779) {
                AnonymousClass779 r5 = (AnonymousClass779) obj;
                if (!C18070vi.A18(this.A00, r5.A00) || !C18070vi.A18(this.A01, r5.A01) || !C18070vi.A18(this.A02, r5.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C18070vi.A0d(parcel, 0);
        parcel.writeParcelable(this.A00, i);
        parcel.writeParcelable(this.A01, i);
        parcel.writeParcelable(this.A02, i);
    }

    public int hashCode() {
        return AnonymousClass000.A0O(this.A02, AnonymousClass000.A0N(this.A01, AnonymousClass000.A0L(this.A00)));
    }

    public AnonymousClass779(AnonymousClass77S r1, AnonymousClass77S r2, AnonymousClass77S r3) {
        C18070vi.A0o(r1, r2, r3);
        this.A00 = r1;
        this.A01 = r2;
        this.A02 = r3;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("Fb4aUserEntityForNativeAuth(accessToken=");
        A10.append(this.A00);
        A10.append(", fullName=");
        A10.append(this.A01);
        A10.append(", profilePictureUrl=");
        return AnonymousClass001.A1F(this.A02, A10);
    }
}
