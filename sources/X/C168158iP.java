package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.8iP  reason: invalid class name and case insensitive filesystem */
public final class C168158iP extends ADA {
    public static final Parcelable.Creator CREATOR = new Object();
    public final String A00;
    public final List A01;

    public C168158iP(String str, List list) {
        C18070vi.A0d(str, 1);
        this.A00 = str;
        this.A01 = list;
    }

    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C168158iP) {
                C168158iP r5 = (C168158iP) obj;
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
        parcel.writeString(this.A00);
        Iterator A0r = C108985cd.A0r(parcel, this.A01);
        while (A0r.hasNext()) {
            ((C168178iR) A0r.next()).writeToParcel(parcel, i);
        }
    }

    public int hashCode() {
        return AnonymousClass000.A0O(this.A01, C17880vN.A03(this.A00));
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("ThumbnailsVariantType(name=");
        A10.append(this.A00);
        A10.append(", options=");
        return AnonymousClass001.A1F(this.A01, A10);
    }
}
