package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.77G  reason: invalid class name */
public final class AnonymousClass77G implements Parcelable {
    public static final Parcelable.Creator CREATOR = new Object();
    public final long A00;
    public final AEI A01;
    public final String A02;
    public final String A03;
    public final String A04;

    public AnonymousClass77G(AEI aei, String str, String str2, String str3, long j) {
        C18070vi.A0f(str, 1, aei);
        this.A04 = str;
        this.A02 = str2;
        this.A00 = j;
        this.A01 = aei;
        this.A03 = str3;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass77G) {
                AnonymousClass77G r8 = (AnonymousClass77G) obj;
                if (!C18070vi.A18(this.A04, r8.A04) || !C18070vi.A18(this.A02, r8.A02) || this.A00 != r8.A00 || !C18070vi.A18(this.A01, r8.A01) || !C18070vi.A18(this.A03, r8.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C18070vi.A0d(parcel, 0);
        parcel.writeString(this.A04);
        parcel.writeString(this.A02);
        parcel.writeLong(this.A00);
        parcel.writeParcelable(this.A01, i);
        parcel.writeString(this.A03);
    }

    public int hashCode() {
        return AnonymousClass000.A0N(this.A01, AnonymousClass001.A0K(this.A00, (C17880vN.A03(this.A04) + C17900vP.A00(this.A02)) * 31)) + C108955ca.A06(this.A03);
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("LinkedAccountPost(id=");
        A10.append(this.A04);
        A10.append(", caption=");
        A10.append(this.A02);
        A10.append(", creationTime=");
        A10.append(this.A00);
        A10.append(", image=");
        A10.append(this.A01);
        A10.append(", postUrl=");
        return C17900vP.A0B(this.A03, A10);
    }
}
