package X;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.4cI  reason: invalid class name and case insensitive filesystem */
public final class C89334cI implements Parcelable {
    public static final Parcelable.Creator CREATOR = new Object();
    public final Uri A00;
    public final boolean A01;

    public C89334cI(boolean z, Uri uri) {
        C18070vi.A0d(uri, 1);
        this.A00 = uri;
        this.A01 = z;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C89334cI) {
                C89334cI r5 = (C89334cI) obj;
                if (!C18070vi.A18(this.A00, r5.A00) || this.A01 != r5.A01) {
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
        parcel.writeInt(this.A01 ? 1 : 0);
    }

    public int hashCode() {
        return C17880vN.A01(AnonymousClass000.A0L(this.A00), this.A01);
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("BotMedia(uri=");
        A10.append(this.A00);
        A10.append(", isNewContent=");
        return C17900vP.A0F(A10, this.A01);
    }
}
