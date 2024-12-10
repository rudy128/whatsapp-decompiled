package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.5w6  reason: invalid class name and case insensitive filesystem */
public final class C115945w6 extends C1416576l {
    public static final Parcelable.Creator CREATOR = new Object();
    public final int A00;
    public final AnonymousClass6R7 A01;
    public final String A02;
    public final String A03;
    public final boolean A04;

    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C115945w6) {
                C115945w6 r5 = (C115945w6) obj;
                if (!(this.A04 == r5.A04 && C18070vi.A18(this.A02, r5.A02) && C18070vi.A18(this.A03, r5.A03) && this.A01 == r5.A01 && this.A00 == r5.A00)) {
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
        parcel.writeString(this.A02);
        parcel.writeString(this.A03);
        AnonymousClass6R7 r1 = this.A01;
        if (r1 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(r1.name());
        }
        parcel.writeInt(this.A00);
    }

    public int hashCode() {
        return ((((((AnonymousClass3MX.A03(this.A04) + C17900vP.A00(this.A02)) * 31) + C17900vP.A00(this.A03)) * 31) + C17880vN.A02(this.A01)) * 31) + this.A00;
    }

    public C115945w6(AnonymousClass6R7 r1, String str, String str2, int i, boolean z) {
        this.A04 = z;
        this.A02 = str;
        this.A03 = str2;
        this.A01 = r1;
        this.A00 = i;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("BonsaiOnboardingSearchSuggestionToMetaAi(needDefaultBot=");
        A10.append(this.A04);
        A10.append(", sendPrompt=");
        A10.append(this.A02);
        A10.append(", sessionId=");
        A10.append(this.A03);
        A10.append(", sessionSource=");
        A10.append(this.A01);
        A10.append(", referrerAction=");
        return AnonymousClass001.A1L(A10, this.A00);
    }
}
