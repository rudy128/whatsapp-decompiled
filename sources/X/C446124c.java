package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.24c  reason: invalid class name and case insensitive filesystem */
public final class C446124c implements Comparable, Parcelable {
    public static final Parcelable.Creator CREATOR = new Object();
    public final C20271AEe A00;
    public final String A01;
    public final String A02;

    public C446124c(C20271AEe aEe, String str, String str2) {
        C18070vi.A0d(str, 1);
        C18070vi.A0d(str2, 2);
        this.A02 = str;
        this.A01 = str2;
        this.A00 = aEe;
    }

    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C446124c) {
                C446124c r5 = (C446124c) obj;
                if (!C18070vi.A18(this.A02, r5.A02) || !C18070vi.A18(this.A01, r5.A01) || !C18070vi.A18(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        int hashCode = ((this.A02.hashCode() * 31) + this.A01.hashCode()) * 31;
        C20271AEe aEe = this.A00;
        return hashCode + (aEe == null ? 0 : aEe.hashCode());
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("BotCommand(name=");
        sb.append(this.A02);
        sb.append(", description=");
        sb.append(this.A01);
        sb.append(", flowInfo=");
        sb.append(this.A00);
        sb.append(')');
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C18070vi.A0d(parcel, 0);
        parcel.writeString(this.A02);
        parcel.writeString(this.A01);
        parcel.writeParcelable(this.A00, i);
    }

    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        C446124c r3 = (C446124c) obj;
        C18070vi.A0d(r3, 0);
        return C40151uF.A00(this.A02, r3.A02);
    }
}
