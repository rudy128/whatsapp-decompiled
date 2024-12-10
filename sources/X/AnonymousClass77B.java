package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.77B  reason: invalid class name */
public final class AnonymousClass77B implements Parcelable {
    public static final Parcelable.Creator CREATOR = new Object();
    public final String A00;
    public final List A01;
    public final Map A02;
    public final Map A03;

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass77B) {
                AnonymousClass77B r5 = (AnonymousClass77B) obj;
                if (!C18070vi.A18(this.A00, r5.A00) || !C18070vi.A18(this.A01, r5.A01) || !C18070vi.A18(this.A02, r5.A02) || !C18070vi.A18(this.A03, r5.A03)) {
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
            parcel.writeParcelable((Parcelable) A0r.next(), i);
        }
        Map map = this.A02;
        parcel.writeInt(map.size());
        Iterator A15 = AnonymousClass000.A15(map);
        while (A15.hasNext()) {
            Map.Entry A16 = AnonymousClass000.A16(A15);
            parcel.writeSerializable((Serializable) A16.getKey());
            parcel.writeParcelable((Parcelable) A16.getValue(), i);
        }
        Map map2 = this.A03;
        parcel.writeInt(map2.size());
        Iterator A152 = AnonymousClass000.A15(map2);
        while (A152.hasNext()) {
            Map.Entry A162 = AnonymousClass000.A16(A152);
            parcel.writeParcelable((Parcelable) A162.getKey(), i);
            parcel.writeSerializable((Serializable) A162.getValue());
        }
    }

    public int hashCode() {
        return AnonymousClass000.A0O(this.A03, AnonymousClass000.A0N(this.A02, AnonymousClass000.A0N(this.A01, C17880vN.A03(this.A00))));
    }

    public AnonymousClass77B(String str, List list, Map map, Map map2) {
        C18070vi.A0j(str, list);
        this.A00 = str;
        this.A01 = list;
        this.A02 = map;
        this.A03 = map2;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("VariantsDisplayData(name=");
        A10.append(this.A00);
        A10.append(", displayItems=");
        A10.append(this.A01);
        A10.append(", combinations=");
        A10.append(this.A02);
        A10.append(", firstExistingCombination=");
        return AnonymousClass001.A1F(this.A03, A10);
    }
}
