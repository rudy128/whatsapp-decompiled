package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.whatsapp.jid.PhoneUserJid;

/* renamed from: X.2v0  reason: invalid class name and case insensitive filesystem */
public final class C64582v0 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new Object();
    public final PhoneUserJid A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final int A04;

    public C64582v0(PhoneUserJid phoneUserJid, String str, String str2, String str3, int i) {
        C18070vi.A0d(phoneUserJid, 1);
        this.A00 = phoneUserJid;
        this.A02 = str;
        this.A03 = str2;
        this.A01 = str3;
        this.A04 = i;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C64582v0) {
                C64582v0 r5 = (C64582v0) obj;
                if (!C18070vi.A18(this.A00, r5.A00) || !C18070vi.A18(this.A02, r5.A02) || !C18070vi.A18(this.A03, r5.A03) || !C18070vi.A18(this.A01, r5.A01) || this.A04 != r5.A04) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C18070vi.A0d(parcel, 0);
        parcel.writeParcelable(this.A00, i);
        parcel.writeString(this.A02);
        parcel.writeString(this.A03);
        parcel.writeString(this.A01);
        parcel.writeInt(this.A04);
    }

    public int hashCode() {
        int i = 0;
        int A0L = (((AnonymousClass000.A0L(this.A00) + C17900vP.A00(this.A02)) * 31) + C17900vP.A00(this.A03)) * 31;
        String str = this.A01;
        if (str != null) {
            i = str.hashCode();
        }
        return ((A0L + i) * 31) + this.A04;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("DownloadedContactData jid:");
        return C17890vO.A0V(this.A00, A10);
    }
}
