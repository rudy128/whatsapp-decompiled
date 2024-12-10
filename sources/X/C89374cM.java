package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.4cM  reason: invalid class name and case insensitive filesystem */
public final class C89374cM implements Parcelable {
    public static final Parcelable.Creator CREATOR = new Object();
    public final int A00;
    public final boolean A01;

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C89374cM) {
                C89374cM r5 = (C89374cM) obj;
                if (!(this.A01 == r5.A01 && this.A00 == r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C18070vi.A0d(parcel, 0);
        parcel.writeInt(this.A01 ? 1 : 0);
        parcel.writeInt(this.A00);
    }

    public int hashCode() {
        return AnonymousClass3MX.A03(this.A01) + this.A00;
    }

    public C89374cM(boolean z, int i) {
        this.A01 = z;
        this.A00 = i;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("StatusArchiveSettingsViewState(isEnabled=");
        A10.append(this.A01);
        A10.append(", archiveDurationInDays=");
        return AnonymousClass001.A1L(A10, this.A00);
    }
}
