package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.whatsapp.jid.UserJid;

/* renamed from: X.5w4  reason: invalid class name and case insensitive filesystem */
public final class C115925w4 extends C1416576l {
    public static final Parcelable.Creator CREATOR = new Object();
    public final UserJid A00;
    public final boolean A01;

    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C115925w4) {
                C115925w4 r5 = (C115925w4) obj;
                if (this.A01 != r5.A01 || !C18070vi.A18(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C18070vi.A0d(parcel, 0);
        parcel.writeInt(this.A01 ? 1 : 0);
        parcel.writeParcelable(this.A00, i);
    }

    public int hashCode() {
        return AnonymousClass3MX.A03(this.A01) + AnonymousClass001.A0k(this.A00);
    }

    public C115925w4(UserJid userJid, boolean z) {
        this.A01 = z;
        this.A00 = userJid;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("BonsaiOnboardingDeepLinkToMetaAi(needDefaultBot=");
        A10.append(this.A01);
        A10.append(", userJid=");
        return AnonymousClass001.A1F(this.A00, A10);
    }
}
