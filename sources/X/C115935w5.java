package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.5w5  reason: invalid class name and case insensitive filesystem */
public final class C115935w5 extends C1416576l {
    public static final Parcelable.Creator CREATOR = new Object();
    public final int A00;
    public final C115945w6 A01;
    public final AnonymousClass1BI A02;
    public final boolean A03;

    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C115935w5) {
                C115935w5 r5 = (C115935w5) obj;
                if (this.A03 != r5.A03 || !C18070vi.A18(this.A02, r5.A02) || this.A00 != r5.A00 || !C18070vi.A18(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C18070vi.A0d(parcel, 0);
        parcel.writeInt(this.A03 ? 1 : 0);
        parcel.writeParcelable(this.A02, i);
        parcel.writeInt(this.A00);
        C115945w6 r1 = this.A01;
        if (r1 == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        r1.writeToParcel(parcel, i);
    }

    public int hashCode() {
        return ((((AnonymousClass3MX.A03(this.A03) + AnonymousClass001.A0k(this.A02)) * 31) + this.A00) * 31) + C17880vN.A02(this.A01);
    }

    public C115935w5(C115945w6 r1, AnonymousClass1BI r2, int i, boolean z) {
        this.A03 = z;
        this.A02 = r2;
        this.A00 = i;
        this.A01 = r1;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("MetaAiOnboardingImagineMe(needDefaultBot=");
        A10.append(this.A03);
        A10.append(", chatJid=");
        A10.append(this.A02);
        A10.append(", actionSource=");
        A10.append(this.A00);
        A10.append(", searchData=");
        return AnonymousClass001.A1F(this.A01, A10);
    }
}
