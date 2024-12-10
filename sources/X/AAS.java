package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.math.BigDecimal;
import java.util.ArrayList;

public final class AAS implements Parcelable.Creator {
    public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        BigDecimal bigDecimal;
        A6S a6s;
        Object createFromParcel;
        Object createFromParcel2;
        Object createFromParcel3;
        Object createFromParcel4;
        Object createFromParcel5;
        Parcel parcel2 = parcel;
        String A0y = C72453Mb.A0y(parcel2);
        String readString = parcel2.readString();
        String readString2 = parcel2.readString();
        String readString3 = parcel2.readString();
        if (readString3 == null || readString3.length() == 0) {
            bigDecimal = null;
        } else {
            bigDecimal = new BigDecimal(readString3);
        }
        String readString4 = parcel2.readString();
        if (readString4 == null || readString4.length() == 0) {
            a6s = null;
        } else {
            a6s = new A6S(readString4);
        }
        String readString5 = parcel2.readString();
        String readString6 = parcel2.readString();
        String readString7 = parcel2.readString();
        int readInt = parcel2.readInt();
        ArrayList A0z = C17880vN.A0z(readInt);
        for (int i = 0; i != readInt; i = AnonymousClass8BV.A01(parcel2, AEI.CREATOR, A0z, i)) {
        }
        int readInt2 = parcel2.readInt();
        ArrayList A0z2 = C17880vN.A0z(readInt2);
        for (int i2 = 0; i2 != readInt2; i2 = AnonymousClass8BV.A01(parcel2, AnonymousClass773.CREATOR, A0z2, i2)) {
        }
        Object obj = null;
        if (parcel2.readInt() == 0) {
            createFromParcel = null;
        } else {
            createFromParcel = AEJ.CREATOR.createFromParcel(parcel2);
        }
        AEJ aej = (AEJ) createFromParcel;
        if (parcel2.readInt() == 0) {
            createFromParcel2 = null;
        } else {
            createFromParcel2 = AE5.CREATOR.createFromParcel(parcel2);
        }
        AE5 ae5 = (AE5) createFromParcel2;
        String readString8 = parcel2.readString();
        boolean A01 = A3Y.A01(parcel2);
        boolean A012 = A3Y.A01(parcel2);
        int readInt3 = parcel2.readInt();
        if (parcel2.readInt() == 0) {
            createFromParcel3 = null;
        } else {
            createFromParcel3 = C20255ADn.CREATOR.createFromParcel(parcel2);
        }
        C20255ADn aDn = (C20255ADn) createFromParcel3;
        long readLong = parcel2.readLong();
        if (parcel2.readInt() == 0) {
            createFromParcel4 = null;
        } else {
            createFromParcel4 = AE6.CREATOR.createFromParcel(parcel2);
        }
        AE6 ae6 = (AE6) createFromParcel4;
        if (parcel2.readInt() == 0) {
            createFromParcel5 = null;
        } else {
            createFromParcel5 = ADX.CREATOR.createFromParcel(parcel2);
        }
        ADX adx = (ADX) createFromParcel5;
        if (parcel2.readInt() != 0) {
            obj = ADH.CREATOR.createFromParcel(parcel2);
        }
        return new C20287AEv((ADH) obj, aDn, aej, ae5, ae6, adx, a6s, A0y, readString, readString2, readString5, readString6, readString7, readString8, bigDecimal, A0z, A0z2, readInt3, readLong, A01, A012);
    }

    public /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new C20287AEv[i];
    }
}
