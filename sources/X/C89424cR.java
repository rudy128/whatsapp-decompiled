package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.4cR  reason: invalid class name and case insensitive filesystem */
public final class C89424cR implements Parcelable {
    public static final Parcelable.Creator CREATOR = new Object();
    public final C89314cG A00;
    public final C89324cH A01;
    public final C89434cS A02;

    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C89424cR) {
                C89424cR r5 = (C89424cR) obj;
                if (!C18070vi.A18(this.A00, r5.A00) || !C18070vi.A18(this.A02, r5.A02) || !C18070vi.A18(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C18070vi.A0d(parcel, 0);
        C89314cG r0 = this.A00;
        if (r0 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            r0.writeToParcel(parcel, i);
        }
        C89434cS r02 = this.A02;
        if (r02 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            r02.writeToParcel(parcel, i);
        }
        C89324cH r03 = this.A01;
        if (r03 == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        r03.writeToParcel(parcel, i);
    }

    public int hashCode() {
        return (((AnonymousClass001.A0k(this.A00) * 31) + AnonymousClass001.A0k(this.A02)) * 31) + C17880vN.A02(this.A01);
    }

    public C89424cR(C89314cG r1, C89324cH r2, C89434cS r3) {
        this.A00 = r1;
        this.A02 = r3;
        this.A01 = r2;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("NewsletterEnforcementExtraData(appealExtraData=");
        A10.append(this.A00);
        A10.append(", ipViolationReportData=");
        A10.append(this.A02);
        A10.append(", enforcementTargetData=");
        return AnonymousClass001.A1F(this.A01, A10);
    }
}
