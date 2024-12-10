package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.whatsapp.jid.UserJid;
import java.math.BigDecimal;

/* renamed from: X.ACy  reason: case insensitive filesystem */
public final class C20240ACy implements Parcelable.Creator {
    /* JADX WARNING: type inference failed for: r0v2, types: [X.ADG, java.lang.Object] */
    public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        C18070vi.A0d(parcel, 0);
        String readString = parcel.readString();
        String readString2 = parcel.readString();
        String readString3 = parcel.readString();
        String readString4 = parcel.readString();
        String readString5 = parcel.readString();
        String readString6 = parcel.readString();
        int readInt = parcel.readInt();
        String readString7 = parcel.readString();
        String readString8 = parcel.readString();
        C18070vi.A0k(readString, readString2);
        ? obj = new Object();
        obj.A01 = (UserJid) AnonymousClass3Ma.A08(parcel, ADG.class);
        obj.A06 = readString;
        obj.A09 = readString2;
        obj.A04 = readString3;
        obj.A03 = readString4;
        obj.A0A = (BigDecimal) parcel.readSerializable();
        obj.A0B = (BigDecimal) parcel.readSerializable();
        obj.A08 = readString5;
        obj.A07 = readString6;
        obj.A00 = readInt;
        obj.A02 = readString7;
        obj.A05 = readString8;
        return obj;
    }

    public /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new ADG[i];
    }
}
