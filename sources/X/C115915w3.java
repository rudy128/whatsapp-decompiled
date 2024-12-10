package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.5w3  reason: invalid class name and case insensitive filesystem */
public final class C115915w3 extends C1416576l {
    public static final Parcelable.Creator CREATOR = new Object();
    public final boolean A00;

    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C115915w3) && this.A00 == ((C115915w3) obj).A00);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C18070vi.A0d(parcel, 0);
        parcel.writeInt(this.A00 ? 1 : 0);
    }

    public int hashCode() {
        if (this.A00) {
            return 1231;
        }
        return 1237;
    }

    public C115915w3(boolean z) {
        this.A00 = z;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("MetaAiOnboardingForForwarding(needDefaultBot=");
        return C17900vP.A0F(A10, this.A00);
    }
}
