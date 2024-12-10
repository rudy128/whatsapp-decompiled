package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.3lr  reason: invalid class name and case insensitive filesystem */
public final class C75853lr extends C1416576l {
    public static final Parcelable.Creator CREATOR = new Object();
    public final String A00;
    public final boolean A01;
    public final boolean A02;
    public final boolean A03;
    public final boolean A04;

    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C75853lr) {
                C75853lr r5 = (C75853lr) obj;
                if (!(this.A04 == r5.A04 && this.A03 == r5.A03 && this.A01 == r5.A01 && this.A02 == r5.A02 && C18070vi.A18(this.A00, r5.A00))) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C18070vi.A0d(parcel, 0);
        parcel.writeInt(this.A04 ? 1 : 0);
        parcel.writeInt(this.A03 ? 1 : 0);
        parcel.writeInt(this.A01 ? 1 : 0);
        parcel.writeInt(this.A02 ? 1 : 0);
        parcel.writeString(this.A00);
    }

    public boolean A00() {
        return this.A04;
    }

    public int hashCode() {
        return AnonymousClass0DV.A00(AnonymousClass0DV.A00(AnonymousClass0DV.A00(AnonymousClass3MX.A03(this.A04), this.A03), this.A01), this.A02) + C17900vP.A00(this.A00);
    }

    public C75853lr(String str, boolean z, boolean z2, boolean z3, boolean z4) {
        this.A04 = z;
        this.A03 = z2;
        this.A01 = z3;
        this.A02 = z4;
        this.A00 = str;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("BonsaiOnboardingSendToMetaAi(needDefaultBot=");
        A10.append(this.A04);
        A10.append(", showSoftInput=");
        A10.append(this.A03);
        A10.append(", clickEmoji=");
        A10.append(this.A01);
        A10.append(", openCamera=");
        A10.append(this.A02);
        A10.append(", sendPrompt=");
        return C17900vP.A0B(this.A00, A10);
    }
}
