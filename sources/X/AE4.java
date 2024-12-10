package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;

public final class AE4 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new Object();
    public final String A00;
    public final String A01;
    public final List A02;

    public AE4(String str, String str2, List list) {
        C18070vi.A0d(str, 1);
        this.A01 = str;
        this.A00 = str2;
        this.A02 = list;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AE4) {
                AE4 ae4 = (AE4) obj;
                if (!C18070vi.A18(this.A01, ae4.A01) || !C18070vi.A18(this.A00, ae4.A00) || !C18070vi.A18(this.A02, ae4.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C18070vi.A0d(parcel, 0);
        parcel.writeString(this.A01);
        parcel.writeString(this.A00);
        Iterator A0r = C108985cd.A0r(parcel, this.A02);
        while (A0r.hasNext()) {
            ((AEF) A0r.next()).writeToParcel(parcel, i);
        }
    }

    public int hashCode() {
        return AnonymousClass000.A0O(this.A02, (C17880vN.A03(this.A01) + C17900vP.A00(this.A00)) * 31);
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("SingleSelectListSection(title=");
        A10.append(this.A01);
        A10.append(", highlightLabel=");
        A10.append(this.A00);
        A10.append(", items=");
        return AnonymousClass001.A1F(this.A02, A10);
    }
}
