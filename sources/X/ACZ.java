package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import org.json.JSONObject;

public final class ACZ implements Parcelable.Creator {
    public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        JSONObject jSONObject;
        ArrayList A0z;
        String A0y = C72453Mb.A0y(parcel);
        String readString = parcel.readString();
        String readString2 = parcel.readString();
        if (readString2 != null) {
            jSONObject = C17880vN.A16(readString2);
        } else {
            jSONObject = null;
        }
        if (parcel.readInt() == 0) {
            A0z = null;
        } else {
            int readInt = parcel.readInt();
            A0z = C17880vN.A0z(readInt);
            int i = 0;
            while (i != readInt) {
                i = AnonymousClass8BV.A01(parcel, C20928Abi.CREATOR, A0z, i);
            }
        }
        return new C20936Abq(A0y, readString, A0z, parcel.createStringArrayList(), jSONObject);
    }

    public /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new C20936Abq[i];
    }
}
