package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.whatsapp.jid.UserJid;
import java.util.Iterator;
import java.util.List;

public final class AER implements Parcelable {
    public static final Parcelable.Creator CREATOR = new Object();
    public final UserJid A00;
    public final AE3 A01;
    public final List A02;

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AER) {
                AER aer = (AER) obj;
                if (!C18070vi.A18(this.A02, aer.A02) || !C18070vi.A18(this.A01, aer.A01) || !C18070vi.A18(this.A00, aer.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C18070vi.A0d(parcel, 0);
        Iterator A0r = C108985cd.A0r(parcel, this.A02);
        while (A0r.hasNext()) {
            ((C20254ADm) A0r.next()).writeToParcel(parcel, i);
        }
        this.A01.writeToParcel(parcel, i);
        parcel.writeParcelable(this.A00, i);
    }

    public final int A00() {
        int i = 0;
        for (C20254ADm aDm : this.A02) {
            i += aDm.A01.size();
        }
        return i;
    }

    public int hashCode() {
        return AnonymousClass000.A0O(this.A00, AnonymousClass000.A0N(this.A01, AnonymousClass000.A0L(this.A02)));
    }

    public AER(UserJid userJid, AE3 ae3, List list) {
        C18070vi.A0o(list, ae3, userJid);
        this.A02 = list;
        this.A01 = ae3;
        this.A00 = userJid;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("ProductListInfo(productSectionList=");
        A10.append(this.A02);
        A10.append(", productHeaderImage=");
        A10.append(this.A01);
        A10.append(", businessOwnerJid=");
        return AnonymousClass001.A1F(this.A00, A10);
    }
}
