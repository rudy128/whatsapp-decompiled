package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.24Z  reason: invalid class name */
public final class AnonymousClass24Z implements Parcelable {
    public static final Parcelable.Creator CREATOR = new Object();
    public final String A00;
    public final String A01;

    public AnonymousClass24Z(String str, String str2) {
        C18070vi.A0d(str, 1);
        C18070vi.A0d(str2, 2);
        this.A01 = str;
        this.A00 = str2;
    }

    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass24Z) {
                AnonymousClass24Z r5 = (AnonymousClass24Z) obj;
                if (!C18070vi.A18(this.A01, r5.A01) || !C18070vi.A18(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (this.A01.hashCode() * 31) + this.A00.hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("BotPrompt(text=");
        sb.append(this.A01);
        sb.append(", emoji=");
        sb.append(this.A00);
        sb.append(')');
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C18070vi.A0d(parcel, 0);
        parcel.writeString(this.A01);
        parcel.writeString(this.A00);
    }
}
