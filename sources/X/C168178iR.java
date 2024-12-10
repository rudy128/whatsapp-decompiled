package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.8iR  reason: invalid class name and case insensitive filesystem */
public final class C168178iR extends AD8 {
    public static final Parcelable.Creator CREATOR = new Object();
    public final AEI A00;
    public final String A01;

    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C168178iR) {
                C168178iR r5 = (C168178iR) obj;
                if (!C18070vi.A18(this.A01, r5.A01) || !C18070vi.A18(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C18070vi.A0d(parcel, 0);
        parcel.writeString(this.A01);
        this.A00.writeToParcel(parcel, i);
    }

    public int hashCode() {
        return AnonymousClass000.A0O(this.A00, C17880vN.A03(this.A01));
    }

    public C168178iR(AEI aei, String str) {
        C18070vi.A0j(str, aei);
        this.A01 = str;
        this.A00 = aei;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("ThumbnailOption(value=");
        A10.append(this.A01);
        A10.append(", thumbnail=");
        return AnonymousClass001.A1F(this.A00, A10);
    }
}
