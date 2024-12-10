package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.774  reason: invalid class name */
public final class AnonymousClass774 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new Object();
    public final String A00;
    public final List A01;
    public final List A02;

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass774) {
                AnonymousClass774 r5 = (AnonymousClass774) obj;
                if (!C18070vi.A18(this.A01, r5.A01) || !C18070vi.A18(this.A02, r5.A02) || !C18070vi.A18(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C18070vi.A0d(parcel, 0);
        Iterator A0r = C108985cd.A0r(parcel, this.A01);
        while (A0r.hasNext()) {
            parcel.writeDouble(((Number) A0r.next()).doubleValue());
        }
        Iterator A0r2 = C108985cd.A0r(parcel, this.A02);
        while (A0r2.hasNext()) {
            parcel.writeDouble(((Number) A0r2.next()).doubleValue());
        }
        parcel.writeString(this.A00);
    }

    public int hashCode() {
        return AnonymousClass000.A0N(this.A02, AnonymousClass000.A0L(this.A01)) + C17900vP.A00(this.A00);
    }

    public AnonymousClass774(String str, List list, List list2) {
        this.A01 = list;
        this.A02 = list2;
        this.A00 = str;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("StatusTappableArea(x=");
        A10.append(this.A01);
        A10.append(", y=");
        A10.append(this.A02);
        A10.append(", attributionUrl=");
        return C17900vP.A0B(this.A00, A10);
    }
}
