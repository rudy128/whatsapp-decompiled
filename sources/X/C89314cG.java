package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.4cG  reason: invalid class name and case insensitive filesystem */
public final class C89314cG implements Parcelable {
    public static final Parcelable.Creator CREATOR = new Object();
    public final String A00;

    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C89314cG) && C18070vi.A18(this.A00, ((C89314cG) obj).A00));
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C18070vi.A0d(parcel, 0);
        parcel.writeString(this.A00);
    }

    public int hashCode() {
        return C17900vP.A00(this.A00);
    }

    public C89314cG(String str) {
        this.A00 = str;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("NewsletterAppealExtraData(appealFormUrl=");
        return C17900vP.A0B(this.A00, A10);
    }
}
