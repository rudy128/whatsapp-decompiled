package X;

import android.os.Parcel;
import android.os.Parcelable;

public final class AEH implements Parcelable {
    public static final AEH A04 = new AEH(AEG.A04, (String) null, (String) null, (String) null);
    public static final Parcelable.Creator CREATOR = new Object();
    public final AEG A00;
    public final String A01;
    public final String A02;
    public final String A03;

    public AEH(AEG aeg, String str, String str2, String str3) {
        C18070vi.A0d(aeg, 4);
        this.A01 = str;
        this.A03 = str2;
        this.A02 = str3;
        this.A00 = aeg;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C18070vi.A0d(parcel, 0);
        parcel.writeString(this.A01);
        parcel.writeString(this.A03);
        parcel.writeString(this.A02);
        this.A00.writeToParcel(parcel, i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !C18070vi.A14(this, obj)) {
            return false;
        }
        AEH aeh = (AEH) obj;
        if (!C18070vi.A18(this.A01, aeh.A01) || !C18070vi.A18(this.A03, aeh.A03) || !C18070vi.A18(this.A02, aeh.A02)) {
            return false;
        }
        return this.A00.equals(aeh.A00);
    }

    public int hashCode() {
        int i = 0;
        int A022 = ((AnonymousClass8BW.A02(this.A01) * 31) + AnonymousClass8BW.A02(this.A03)) * 31;
        String str = this.A02;
        if (str != null) {
            i = str.hashCode();
        }
        return AnonymousClass000.A0O(this.A00, (A022 + i) * 31);
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append(this.A03);
        A10.append(' ');
        A10.append(this.A02);
        A10.append(' ');
        return C17890vO.A0V(this.A00, A10);
    }
}
