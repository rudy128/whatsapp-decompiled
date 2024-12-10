package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.Abq  reason: case insensitive filesystem */
public final class C20936Abq implements BDZ {
    public static final Parcelable.Creator CREATOR = new Object();
    public final String A00;
    public final String A01;
    public final List A02;
    public final List A03;
    public final JSONObject A04;

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C20936Abq) {
                C20936Abq abq = (C20936Abq) obj;
                if (!C18070vi.A18(this.A01, abq.A01) || !C18070vi.A18(this.A00, abq.A00) || !C18070vi.A18(this.A04, abq.A04) || !C18070vi.A18(this.A03, abq.A03) || !C18070vi.A18(this.A02, abq.A02)) {
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
        parcel.writeString(C17900vP.A08(this.A04));
        List list = this.A03;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            Iterator A0r = C108985cd.A0r(parcel, list);
            while (A0r.hasNext()) {
                ((C20928Abi) A0r.next()).writeToParcel(parcel, i);
            }
        }
        parcel.writeStringList(this.A02);
    }

    public int hashCode() {
        return ((((C17890vO.A02(this.A00, C17880vN.A03(this.A01)) + AnonymousClass001.A0k(this.A04)) * 31) + AnonymousClass001.A0k(this.A03)) * 31) + C17880vN.A02(this.A02);
    }

    public C20936Abq(String str, String str2, List list, List list2, JSONObject jSONObject) {
        C18070vi.A0j(str, str2);
        this.A01 = str;
        this.A00 = str2;
        this.A04 = jSONObject;
        this.A03 = list;
        this.A02 = list2;
    }

    public JSONObject CPM() {
        JSONArray A1A = AnonymousClass8BR.A1A();
        List list = this.A02;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                AnonymousClass8BS.A1J(it, A1A);
            }
        }
        JSONArray A1A2 = AnonymousClass8BR.A1A();
        List<C20928Abi> list2 = this.A03;
        if (list2 != null) {
            for (C20928Abi CPM : list2) {
                A1A2.put(CPM.CPM());
            }
        }
        return AnonymousClass84U.A00(new B1U(this, A1A2, A1A));
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("PaymentGateway(type=");
        A10.append(this.A01);
        A10.append(", configuration=");
        A10.append(this.A00);
        A10.append(", orderData=");
        A10.append(this.A04);
        A10.append(", preferredPaymentMethods=");
        A10.append(this.A03);
        A10.append(", enabledPaymentOptions=");
        return AnonymousClass001.A1F(this.A02, A10);
    }
}
