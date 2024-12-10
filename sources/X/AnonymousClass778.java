package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.778  reason: invalid class name */
public final class AnonymousClass778 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new Object();
    public final Boolean A00;
    public final String A01;
    public final String A02;

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass778) {
                AnonymousClass778 r5 = (AnonymousClass778) obj;
                if (!C18070vi.A18(this.A02, r5.A02) || !C18070vi.A18(this.A00, r5.A00) || !C18070vi.A18(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public void writeToParcel(Parcel parcel, int i) {
        boolean booleanValue;
        C18070vi.A0d(parcel, 0);
        parcel.writeString(this.A02);
        Boolean bool = this.A00;
        if (bool == null) {
            booleanValue = false;
        } else {
            parcel.writeInt(1);
            booleanValue = bool.booleanValue();
        }
        parcel.writeInt(booleanValue ? 1 : 0);
        parcel.writeString(this.A01);
    }

    public int hashCode() {
        return (((C17900vP.A00(this.A02) * 31) + AnonymousClass001.A0k(this.A00)) * 31) + C108955ca.A06(this.A01);
    }

    public AnonymousClass778(Boolean bool, String str, String str2) {
        this.A02 = str;
        this.A00 = bool;
        this.A01 = str2;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("FunStickerData(displayName=");
        A10.append(this.A02);
        A10.append(", isGroup=");
        A10.append(this.A00);
        A10.append(", chatJid=");
        return C17900vP.A0B(this.A01, A10);
    }
}
