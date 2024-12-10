package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.AbstractCollection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.76o  reason: invalid class name and case insensitive filesystem */
public final class C1416876o implements Parcelable {
    public static final Parcelable.Creator CREATOR = new Object();
    public HashMap A00 = C17880vN.A11();

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C18070vi.A0d(parcel, 0);
        HashMap hashMap = this.A00;
        parcel.writeInt(hashMap.size());
        Iterator A0i = C17890vO.A0i(hashMap);
        while (A0i.hasNext()) {
            Map.Entry A16 = AnonymousClass000.A16(A0i);
            parcel.writeString(C17880vN.A0x(A16));
            AbstractCollection abstractCollection = (AbstractCollection) A16.getValue();
            if (abstractCollection == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeInt(abstractCollection.size());
                Iterator it = abstractCollection.iterator();
                while (it.hasNext()) {
                    parcel.writeLong(C17890vO.A07(it));
                }
            }
        }
    }
}
