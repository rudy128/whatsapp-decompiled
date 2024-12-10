package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.4cL  reason: invalid class name and case insensitive filesystem */
public final class C89364cL implements Parcelable {
    public static final Parcelable.Creator CREATOR = new Object();
    public final C29681ch A00;
    public final C89494cY A01;

    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C89364cL) {
                C89364cL r5 = (C89364cL) obj;
                if (!C18070vi.A18(this.A00, r5.A00) || !C18070vi.A18(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C18070vi.A0d(parcel, 0);
        parcel.writeParcelable(this.A00, i);
        parcel.writeParcelable(this.A01, i);
    }

    public int hashCode() {
        return AnonymousClass000.A0O(this.A01, AnonymousClass000.A0L(this.A00));
    }

    public C89364cL(C29681ch r1, C89494cY r2) {
        C18070vi.A0j(r1, r2);
        this.A00 = r1;
        this.A01 = r2;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("NewsletterAppealRequest(newsletterJid=");
        A10.append(this.A00);
        A10.append(", enforcement=");
        return AnonymousClass001.A1F(this.A01, A10);
    }
}
