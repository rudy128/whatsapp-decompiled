package X;

import android.graphics.Point;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import java.io.File;

/* renamed from: X.767  reason: invalid class name */
public final class AnonymousClass767 implements Parcelable.Creator {
    public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        File A17;
        File A172;
        File A173;
        File A174;
        Parcel parcel2 = parcel;
        C18070vi.A0d(parcel2, 0);
        Class<AnonymousClass77R> cls = AnonymousClass77R.class;
        Uri uri = (Uri) AnonymousClass3Ma.A08(parcel2, cls);
        Integer num = (Integer) parcel2.readValue(Integer.TYPE.getClassLoader());
        String readString = parcel2.readString();
        if (readString == null) {
            A17 = null;
        } else {
            A17 = C108945cZ.A17(readString);
        }
        String readString2 = parcel2.readString();
        String readString3 = parcel2.readString();
        String readString4 = parcel2.readString();
        String readString5 = parcel2.readString();
        if (readString5 == null) {
            A172 = null;
        } else {
            A172 = C108945cZ.A17(readString5);
        }
        String readString6 = parcel2.readString();
        String readString7 = parcel2.readString();
        if (readString7 == null) {
            A173 = null;
        } else {
            A173 = C108945cZ.A17(readString7);
        }
        int readInt = parcel2.readInt();
        String readString8 = parcel2.readString();
        if (readString8 == null) {
            A174 = null;
        } else {
            A174 = C108945cZ.A17(readString8);
        }
        boolean booleanValue = A3Y.A00(parcel2).booleanValue();
        return new AnonymousClass77R((Point) AnonymousClass3Ma.A08(parcel2, cls), (Rect) AnonymousClass3Ma.A08(parcel2, cls), uri, A17, A172, A173, A174, num, readString2, readString3, readString4, readString6, parcel2.readString(), readInt, parcel2.readInt(), booleanValue, C72473Md.A1R(parcel2));
    }

    public /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new AnonymousClass77R[i];
    }
}
