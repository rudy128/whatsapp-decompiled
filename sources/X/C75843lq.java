package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.whatsapp.jid.UserJid;

/* renamed from: X.3lq  reason: invalid class name and case insensitive filesystem */
public final class C75843lq extends C1416576l {
    public static final Parcelable.Creator CREATOR = new Object();
    public final UserJid A00;
    public final String A01;
    public final boolean A02;
    public final boolean A03;
    public final boolean A04;

    public C75843lq(UserJid userJid, String str, boolean z, boolean z2, boolean z3) {
        C18070vi.A0d(userJid, 4);
        this.A04 = z;
        this.A02 = z2;
        this.A03 = z3;
        this.A00 = userJid;
        this.A01 = str;
    }

    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C75843lq) {
                C75843lq r5 = (C75843lq) obj;
                if (!(this.A04 == r5.A04 && this.A02 == r5.A02 && this.A03 == r5.A03 && C18070vi.A18(this.A00, r5.A00) && C18070vi.A18(this.A01, r5.A01))) {
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
        parcel.writeInt(this.A02 ? 1 : 0);
        parcel.writeInt(this.A03 ? 1 : 0);
        parcel.writeParcelable(this.A00, i);
        parcel.writeString(this.A01);
    }

    public boolean A00() {
        return this.A04;
    }

    public int hashCode() {
        return AnonymousClass000.A0N(this.A00, AnonymousClass0DV.A00(AnonymousClass0DV.A00(AnonymousClass3MX.A03(this.A04), this.A02), this.A03)) + C17900vP.A00(this.A01);
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("BonsaiOnboardingContactToMetaAi(needDefaultBot=");
        A10.append(this.A04);
        A10.append(", openChat=");
        A10.append(this.A02);
        A10.append(", openInfo=");
        A10.append(this.A03);
        A10.append(", jidToOpen=");
        A10.append(this.A00);
        A10.append(", bizName=");
        return C17900vP.A0B(this.A01, A10);
    }
}
