package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.ADl  reason: case insensitive filesystem */
public final class C20253ADl implements Parcelable {
    public static final Parcelable.Creator CREATOR = new Object();
    public boolean A00;
    public final C20271AEe A01;

    public C20253ADl(C20271AEe aEe, boolean z) {
        C18070vi.A0d(aEe, 2);
        this.A00 = z;
        this.A01 = aEe;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C20253ADl) {
                C20253ADl aDl = (C20253ADl) obj;
                if (this.A00 != aDl.A00 || !C18070vi.A18(this.A01, aDl.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C18070vi.A0d(parcel, 0);
        parcel.writeInt(this.A00 ? 1 : 0);
        this.A01.writeToParcel(parcel, i);
    }

    public int hashCode() {
        return AnonymousClass000.A0O(this.A01, AnonymousClass3MX.A03(this.A00));
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("NativeFlowButton(isSelected=");
        A10.append(this.A00);
        A10.append(", info=");
        return AnonymousClass001.A1F(this.A01, A10);
    }
}
