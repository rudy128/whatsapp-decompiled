package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.whatsapp.jid.UserJid;

/* renamed from: X.4cT  reason: invalid class name and case insensitive filesystem */
public final class C89444cT implements Parcelable {
    public static final Parcelable.Creator CREATOR = new Object();
    public final int A00;
    public final UserJid A01;
    public final String A02;
    public final boolean A03;

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C89444cT) {
                C89444cT r5 = (C89444cT) obj;
                if (!C18070vi.A18(this.A01, r5.A01) || this.A03 != r5.A03 || !C18070vi.A18(this.A02, r5.A02) || this.A00 != r5.A00) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C18070vi.A0d(parcel, 0);
        parcel.writeParcelable(this.A01, i);
        parcel.writeInt(this.A03 ? 1 : 0);
        parcel.writeString(this.A02);
        parcel.writeInt(this.A00);
    }

    public int hashCode() {
        return C17890vO.A02(this.A02, AnonymousClass0DV.A00(AnonymousClass000.A0L(this.A01), this.A03)) + this.A00;
    }

    public C89444cT(int i, UserJid userJid, String str, boolean z) {
        C72473Md.A1I(userJid, str);
        this.A01 = userJid;
        this.A03 = z;
        this.A02 = str;
        this.A00 = i;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("CallLogKey(jid=");
        A10.append(this.A01);
        A10.append(", fromMe=");
        A10.append(this.A03);
        A10.append(", callId=");
        A10.append(this.A02);
        A10.append(", transactionId=");
        return AnonymousClass001.A1L(A10, this.A00);
    }
}
