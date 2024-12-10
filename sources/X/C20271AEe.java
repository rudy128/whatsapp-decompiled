package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.AEe  reason: case insensitive filesystem */
public final class C20271AEe implements Parcelable {
    public static final Parcelable.Creator CREATOR = new Object();
    public String A00;
    public final C20279AEn A01;
    public final String A02;

    public C20271AEe(C20279AEn aEn, String str, String str2) {
        C18070vi.A0d(str, 1);
        this.A02 = str;
        this.A00 = str2;
        this.A01 = aEn;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C20271AEe) {
                C20271AEe aEe = (C20271AEe) obj;
                if (!C18070vi.A18(this.A02, aEe.A02) || !C18070vi.A18(this.A00, aEe.A00) || !C18070vi.A18(this.A01, aEe.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C18070vi.A0d(parcel, 0);
        parcel.writeString(this.A02);
        parcel.writeString(this.A00);
        C20279AEn aEn = this.A01;
        if (aEn == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        aEn.writeToParcel(parcel, i);
    }

    public int hashCode() {
        return ((C17880vN.A03(this.A02) + C17900vP.A00(this.A00)) * 31) + C17880vN.A02(this.A01);
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("NativeFlowInfo(name=");
        A10.append(this.A02);
        A10.append(", paramsJson=");
        A10.append(this.A00);
        A10.append(", checkoutInfoContent=");
        return AnonymousClass001.A1F(this.A01, A10);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C20271AEe(String str, String str2) {
        this((C20279AEn) null, str, str2);
        C18070vi.A0d(str, 1);
    }
}
