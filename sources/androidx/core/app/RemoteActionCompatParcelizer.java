package androidx.core.app;

import X.C22717BMe;
import X.C25849Cn7;
import X.C72473Md;
import android.app.PendingIntent;
import android.os.Parcel;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;

public class RemoteActionCompatParcelizer {
    /* JADX WARNING: type inference failed for: r2v0, types: [androidx.core.app.RemoteActionCompat, java.lang.Object] */
    public static RemoteActionCompat read(C25849Cn7 cn7) {
        ? obj = new Object();
        Object obj2 = obj.A01;
        if (cn7.A09(1)) {
            obj2 = cn7.A04();
        }
        obj.A01 = (IconCompat) obj2;
        CharSequence charSequence = obj.A03;
        if (cn7.A09(2)) {
            charSequence = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((C22717BMe) cn7).A05);
        }
        obj.A03 = charSequence;
        CharSequence charSequence2 = obj.A02;
        if (cn7.A09(3)) {
            charSequence2 = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((C22717BMe) cn7).A05);
        }
        obj.A02 = charSequence2;
        obj.A00 = (PendingIntent) cn7.A02(obj.A00, 4);
        boolean z = obj.A04;
        if (cn7.A09(5)) {
            z = C72473Md.A1R(((C22717BMe) cn7).A05);
        }
        obj.A04 = z;
        boolean z2 = obj.A05;
        if (cn7.A09(6)) {
            z2 = C72473Md.A1R(((C22717BMe) cn7).A05);
        }
        obj.A05 = z2;
        return obj;
    }

    public static void write(RemoteActionCompat remoteActionCompat, C25849Cn7 cn7) {
        IconCompat iconCompat = remoteActionCompat.A01;
        cn7.A05(1);
        cn7.A08(iconCompat);
        CharSequence charSequence = remoteActionCompat.A03;
        cn7.A05(2);
        Parcel parcel = ((C22717BMe) cn7).A05;
        TextUtils.writeToParcel(charSequence, parcel, 0);
        CharSequence charSequence2 = remoteActionCompat.A02;
        cn7.A05(3);
        TextUtils.writeToParcel(charSequence2, parcel, 0);
        cn7.A07(remoteActionCompat.A00, 4);
        boolean z = remoteActionCompat.A04;
        cn7.A05(5);
        parcel.writeInt(z ? 1 : 0);
        boolean z2 = remoteActionCompat.A05;
        cn7.A05(6);
        parcel.writeInt(z2 ? 1 : 0);
    }
}
