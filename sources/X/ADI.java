package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.whatsapp.jid.UserJid;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ADI implements Parcelable {
    public static final Parcelable.Creator CREATOR = new AD6(18);
    public final AW0 A00;

    public int describeContents() {
        return 0;
    }

    public synchronized void writeToParcel(Parcel parcel, int i) {
        int i2;
        String str;
        String str2;
        String str3;
        AW0 aw0 = this.A00;
        parcel.writeInt(aw0.A03);
        parcel.writeInt(aw0.A02);
        parcel.writeLong(aw0.A06);
        parcel.writeString(aw0.A0I);
        AnonymousClass1KN r0 = aw0.A09;
        if (r0 != null) {
            i2 = r0.A00.scale();
        } else {
            i2 = 0;
        }
        parcel.writeInt(i2);
        AnonymousClass1KN r02 = aw0.A09;
        if (r02 != null) {
            str = r02.A00.toString();
        } else {
            str = null;
        }
        parcel.writeString(str);
        parcel.writeString(aw0.A0K);
        UserJid userJid = aw0.A0E;
        if (userJid == null) {
            str2 = null;
        } else {
            str2 = userJid.getRawString();
        }
        parcel.writeString(str2);
        UserJid userJid2 = aw0.A0D;
        if (userJid2 == null) {
            str3 = null;
        } else {
            str3 = userJid2.getRawString();
        }
        parcel.writeString(str3);
        parcel.writeString(aw0.A0L);
        parcel.writeString(aw0.A0H);
        parcel.writeString(aw0.A0J);
        parcel.writeString(aw0.A0F);
        ArrayList arrayList = aw0.A0N;
        if (arrayList != null) {
            ArrayList A0g = C108975cc.A0g(arrayList);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                A0g.add(new ADO((C185879dI) it.next()));
            }
            parcel.writeList(A0g);
        } else {
            parcel.writeList((List) null);
        }
        parcel.writeString(C22971Dz.A06(aw0.A0C));
        parcel.writeInt(aw0.A0Q ? 1 : 0);
        parcel.writeLong(aw0.A05);
        parcel.writeString(aw0.A0M);
        parcel.writeString(aw0.A0G);
        parcel.writeInt(aw0.A04);
        parcel.writeInt(aw0.A0P ? 1 : 0);
        parcel.writeParcelable(aw0.A0B, 0);
        parcel.writeInt(aw0.A00);
        byte[] bArr = aw0.A0R;
        if (bArr != null) {
            parcel.writeInt(bArr.length);
            parcel.writeByteArray(aw0.A0R);
        } else {
            parcel.writeInt(0);
        }
        parcel.writeInt(aw0.A01);
        parcel.writeParcelable(aw0.A0A, 0);
        AnonymousClass1KJ r1 = aw0.A07;
        AnonymousClass1KJ[] r03 = AnonymousClass1KI.A01;
        parcel.writeParcelable(r1, i);
    }

    public ADI(AW0 aw0) {
        this.A00 = aw0;
    }
}
