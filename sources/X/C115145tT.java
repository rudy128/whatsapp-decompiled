package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.5tT  reason: invalid class name and case insensitive filesystem */
public final class C115145tT extends C1416476k {
    public static final Parcelable.Creator CREATOR = new Object();
    public final int A00;
    public final Integer A01;
    public final String A02;

    public C115145tT(Integer num, String str, int i) {
        C18070vi.A0d(num, 1);
        this.A01 = num;
        this.A00 = i;
        this.A02 = str;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C115145tT) {
                C115145tT r5 = (C115145tT) obj;
                if (!(this.A01 == r5.A01 && this.A00 == r5.A00 && C18070vi.A18(this.A02, r5.A02))) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C18070vi.A0d(parcel, 0);
        parcel.writeString(C137126ux.A01(this.A01));
        parcel.writeInt(this.A00);
        parcel.writeString(this.A02);
    }

    public int hashCode() {
        Integer num = this.A01;
        return (((C72453Mb.A0E(num, C137126ux.A01(num)) * 31) + this.A00) * 31) + C17900vP.A00(this.A02);
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("AdVideoPromotionParams(entryPointSource=");
        C1416476k.A00(this.A01, A10);
        A10.append(this.A00);
        A10.append(", userFlowUuid=");
        return C17900vP.A0B(this.A02, A10);
    }
}
