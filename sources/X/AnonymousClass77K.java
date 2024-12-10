package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.77K  reason: invalid class name */
public final class AnonymousClass77K implements Parcelable {
    public static final Parcelable.Creator CREATOR = new Object();
    public final int A00;
    public final List A01;
    public final List A02;
    public final boolean A03;
    public final boolean A04;
    public final boolean A05;
    public final boolean A06;

    public AnonymousClass77K(List list, List list2, int i, boolean z, boolean z2, boolean z3, boolean z4) {
        this.A00 = i;
        this.A01 = list;
        this.A02 = list2;
        this.A05 = z;
        this.A06 = z2;
        this.A03 = z3;
        this.A04 = z4;
        C17960vV.A0F(AnonymousClass000.A1S(i, 3), "Only set a valid status distribution mode");
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || !C18070vi.A14(this, obj)) {
                return false;
            }
            AnonymousClass77K r4 = (AnonymousClass77K) obj;
            if (!(this.A00 == r4.A00 && this.A05 == r4.A05 && this.A06 == r4.A06 && this.A03 == r4.A03 && this.A04 == r4.A04 && C18070vi.A18(this.A01, r4.A01) && C18070vi.A18(this.A02, r4.A02))) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        Object[] objArr = new Object[7];
        AnonymousClass000.A1L(objArr, this.A00);
        objArr[1] = this.A01;
        objArr[2] = this.A02;
        objArr[3] = Boolean.valueOf(this.A05);
        objArr[4] = Boolean.valueOf(this.A06);
        objArr[5] = Boolean.valueOf(this.A03);
        return AnonymousClass000.A0P(Boolean.valueOf(this.A04), objArr, 6);
    }

    public void writeToParcel(Parcel parcel, int i) {
        C18070vi.A0d(parcel, 0);
        parcel.writeInt(this.A00);
        Iterator A0r = C108985cd.A0r(parcel, this.A01);
        while (A0r.hasNext()) {
            parcel.writeParcelable((Parcelable) A0r.next(), i);
        }
        Iterator A0r2 = C108985cd.A0r(parcel, this.A02);
        while (A0r2.hasNext()) {
            parcel.writeParcelable((Parcelable) A0r2.next(), i);
        }
        parcel.writeInt(this.A05 ? 1 : 0);
        parcel.writeInt(this.A06 ? 1 : 0);
        parcel.writeInt(this.A03 ? 1 : 0);
        parcel.writeInt(this.A04 ? 1 : 0);
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("statusDistributionMode: ");
        A10.append(this.A00);
        A10.append(", allowList size: ");
        A10.append(this.A01.size());
        A10.append(", denyList size: ");
        return C17880vN.A0t(A10, this.A02.size());
    }
}
