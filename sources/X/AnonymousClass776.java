package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.776  reason: invalid class name */
public final class AnonymousClass776 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new Object();
    public final AnonymousClass77L A00;
    public final String A01;
    public final String A02;

    public AnonymousClass776(AnonymousClass77L r2, String str, String str2) {
        C18070vi.A0d(str, 1);
        this.A01 = str;
        this.A02 = str2;
        this.A00 = r2;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass776) {
                AnonymousClass776 r5 = (AnonymousClass776) obj;
                if (!C18070vi.A18(this.A01, r5.A01) || !C18070vi.A18(this.A02, r5.A02) || !C18070vi.A18(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C18070vi.A0d(parcel, 0);
        parcel.writeString(this.A01);
        parcel.writeString(this.A02);
        AnonymousClass77L r1 = this.A00;
        if (r1 == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        r1.writeToParcel(parcel, i);
    }

    public int hashCode() {
        return ((C17880vN.A03(this.A01) + C17900vP.A00(this.A02)) * 31) + C17880vN.A02(this.A00);
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("PrivacyDisclosureBullet(text=");
        A10.append(this.A01);
        A10.append(", textSecondary=");
        A10.append(this.A02);
        A10.append(", icon=");
        return AnonymousClass001.A1F(this.A00, A10);
    }
}
