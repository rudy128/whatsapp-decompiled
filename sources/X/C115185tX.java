package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.5tX  reason: invalid class name and case insensitive filesystem */
public final class C115185tX extends C1416476k {
    public static final Parcelable.Creator CREATOR = new Object();
    public final String A00;
    public final int A01;
    public final Integer A02;
    public final String A03;

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C115185tX) {
                C115185tX r5 = (C115185tX) obj;
                if (!C18070vi.A18(this.A00, r5.A00) || this.A02 != r5.A02 || this.A01 != r5.A01 || !C18070vi.A18(this.A03, r5.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C18070vi.A0d(parcel, 0);
        parcel.writeString(this.A00);
        parcel.writeString(C137126ux.A01(this.A02));
        parcel.writeInt(this.A01);
        parcel.writeString(this.A03);
    }

    public int hashCode() {
        int A032 = C17880vN.A03(this.A00);
        Integer num = this.A02;
        return ((((A032 + C72453Mb.A0E(num, C137126ux.A01(num))) * 31) + this.A01) * 31) + C17900vP.A00(this.A03);
    }

    public C115185tX(Integer num, String str, String str2, int i) {
        C18070vi.A0j(str, num);
        this.A00 = str;
        this.A02 = num;
        this.A01 = i;
        this.A03 = str2;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("PromoteStatusParams(id=");
        A10.append(this.A00);
        A10.append(", entryPointSource=");
        C1416476k.A00(this.A02, A10);
        A10.append(this.A01);
        A10.append(", userFlowUuid=");
        return C17900vP.A0B(this.A03, A10);
    }
}
