package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.ADa  reason: case insensitive filesystem */
public final class C20242ADa implements Parcelable {
    public static final Parcelable.Creator CREATOR = new Object();
    public final List A00;

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C20242ADa) && C18070vi.A18(this.A00, ((C20242ADa) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public void writeToParcel(Parcel parcel, int i) {
        C18070vi.A0d(parcel, 0);
        Iterator A0r = C108985cd.A0r(parcel, this.A00);
        while (A0r.hasNext()) {
            ((C20285AEt) A0r.next()).writeToParcel(parcel, i);
        }
    }

    public C20242ADa(List list) {
        this.A00 = list;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("CarouselContent(cards=");
        return AnonymousClass001.A1F(this.A00, A10);
    }
}
