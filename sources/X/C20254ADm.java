package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.ADm  reason: case insensitive filesystem */
public final class C20254ADm implements Parcelable {
    public static final Parcelable.Creator CREATOR = new Object();
    public final String A00;
    public final List A01;

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C20254ADm) {
                C20254ADm aDm = (C20254ADm) obj;
                if (!C18070vi.A18(this.A00, aDm.A00) || !C18070vi.A18(this.A01, aDm.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C18070vi.A0d(parcel, 0);
        parcel.writeString(this.A00);
        Iterator A0r = C108985cd.A0r(parcel, this.A01);
        while (A0r.hasNext()) {
            ((C20243ADb) A0r.next()).writeToParcel(parcel, i);
        }
    }

    public int hashCode() {
        return AnonymousClass000.A0O(this.A01, C17900vP.A00(this.A00) * 31);
    }

    public C20254ADm(String str, List list) {
        this.A00 = str;
        this.A01 = list;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("ProductSection(title=");
        A10.append(this.A00);
        A10.append(", productList=");
        return AnonymousClass001.A1F(this.A01, A10);
    }
}
