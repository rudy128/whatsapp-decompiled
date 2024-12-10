package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.77J  reason: invalid class name */
public final class AnonymousClass77J implements Parcelable {
    public static final Parcelable.Creator CREATOR = new Object();
    public final int A00;
    public final AnonymousClass77C A01;
    public final AnonymousClass77C A02;
    public final AnonymousClass77C A03;
    public final String A04;
    public final String A05;

    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass77J) {
                AnonymousClass77J r5 = (AnonymousClass77J) obj;
                if (!C18070vi.A18(this.A05, r5.A05) || !C18070vi.A18(this.A02, r5.A02) || !C18070vi.A18(this.A03, r5.A03) || !C18070vi.A18(this.A01, r5.A01) || this.A00 != r5.A00 || !C18070vi.A18(this.A04, r5.A04)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C18070vi.A0d(parcel, 0);
        parcel.writeString(this.A05);
        this.A02.writeToParcel(parcel, i);
        this.A03.writeToParcel(parcel, i);
        this.A01.writeToParcel(parcel, i);
        parcel.writeInt(this.A00);
        parcel.writeString(this.A04);
    }

    public int hashCode() {
        return ((AnonymousClass000.A0N(this.A01, AnonymousClass000.A0N(this.A03, AnonymousClass000.A0N(this.A02, C17880vN.A03(this.A05)))) + this.A00) * 31) + C17900vP.A00(this.A04);
    }

    public AnonymousClass77J(AnonymousClass77C r1, AnonymousClass77C r2, AnonymousClass77C r3, String str, String str2, int i) {
        C18070vi.A0s(str, r1, r2, r3);
        this.A05 = str;
        this.A02 = r1;
        this.A03 = r2;
        this.A01 = r3;
        this.A00 = i;
        this.A04 = str2;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append(C17890vO.A0U(this));
        A10.append("{id='");
        A10.append(this.A05);
        A10.append("', preview='");
        A10.append(this.A02);
        A10.append("', staticPreview='");
        A10.append(this.A03);
        A10.append("', content='");
        A10.append(this.A01);
        A10.append("', providerType='");
        A10.append(this.A00);
        return AnonymousClass000.A0y("'}", A10);
    }
}
