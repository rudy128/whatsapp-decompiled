package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.77L  reason: invalid class name */
public final class AnonymousClass77L implements Parcelable {
    public static final Parcelable.Creator CREATOR = new Object();
    public final AnonymousClass4DO A00;
    public final AnonymousClass4DP A01;
    public final Integer A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass77L) {
                AnonymousClass77L r5 = (AnonymousClass77L) obj;
                if (!C18070vi.A18(this.A04, r5.A04) || !C18070vi.A18(this.A03, r5.A03) || !C18070vi.A18(this.A06, r5.A06) || this.A00 != r5.A00 || this.A01 != r5.A01 || !C18070vi.A18(this.A05, r5.A05) || !C18070vi.A18(this.A02, r5.A02)) {
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
        parcel.writeString(this.A03);
        parcel.writeString(this.A06);
        AnonymousClass4DO r0 = this.A00;
        if (r0 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(r0.name());
        }
        AnonymousClass4DP r02 = this.A01;
        if (r02 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(r02.name());
        }
        parcel.writeString(this.A05);
        C108995ce.A0r(parcel, this.A02);
    }

    public int hashCode() {
        return ((((((C17890vO.A02(this.A06, (C17880vN.A03(this.A04) + C17900vP.A00(this.A03)) * 31) + AnonymousClass001.A0k(this.A00)) * 31) + AnonymousClass001.A0k(this.A01)) * 31) + C17900vP.A00(this.A05)) * 31) + C17880vN.A02(this.A02);
    }

    public AnonymousClass77L(AnonymousClass4DO r1, AnonymousClass4DP r2, Integer num, String str, String str2, String str3, String str4) {
        C72473Md.A1I(str, str3);
        this.A04 = str;
        this.A03 = str2;
        this.A06 = str3;
        this.A00 = r1;
        this.A01 = r2;
        this.A05 = str4;
        this.A02 = num;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("PrivacyDisclosureIcon(lightUrl=");
        A10.append(this.A04);
        A10.append(", darkUrl=");
        A10.append(this.A03);
        A10.append(", type=");
        A10.append(this.A06);
        A10.append(", role=");
        A10.append(this.A00);
        A10.append(", style=");
        A10.append(this.A01);
        A10.append(", size=");
        A10.append(this.A05);
        A10.append(", animationLoopCount=");
        return AnonymousClass001.A1F(this.A02, A10);
    }
}
