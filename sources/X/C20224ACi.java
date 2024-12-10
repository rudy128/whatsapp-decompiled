package X;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import java.util.ArrayList;

/* renamed from: X.ACi  reason: case insensitive filesystem */
public final class C20224ACi implements Parcelable.Creator {
    public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Object createFromParcel;
        Object createFromParcel2;
        Object createFromParcel3;
        Object createFromParcel4;
        Object createFromParcel5;
        Object createFromParcel6;
        Parcel parcel2 = parcel;
        int A0A = C72453Mb.A0A(parcel2);
        Object obj = null;
        if (parcel2.readInt() == 0) {
            createFromParcel = null;
        } else {
            createFromParcel = AEE.CREATOR.createFromParcel(parcel2);
        }
        AEE aee = (AEE) createFromParcel;
        String readString = parcel2.readString();
        String readString2 = parcel2.readString();
        String readString3 = parcel2.readString();
        int readInt = parcel2.readInt();
        ArrayList A0z = C17880vN.A0z(readInt);
        for (int i = 0; i != readInt; i = AnonymousClass8BV.A01(parcel2, AE4.CREATOR, A0z, i)) {
        }
        if (parcel2.readInt() == 0) {
            createFromParcel2 = null;
        } else {
            createFromParcel2 = AER.CREATOR.createFromParcel(parcel2);
        }
        AER aer = (AER) createFromParcel2;
        String readString4 = parcel2.readString();
        Class<C20285AEt> cls = C20285AEt.class;
        AEY aey = (AEY) AnonymousClass3Ma.A08(parcel2, cls);
        if (parcel2.readInt() == 0) {
            createFromParcel3 = null;
        } else {
            createFromParcel3 = C20279AEn.CREATOR.createFromParcel(parcel2);
        }
        C20279AEn aEn = (C20279AEn) createFromParcel3;
        if (parcel2.readInt() == 0) {
            createFromParcel4 = null;
        } else {
            createFromParcel4 = ADF.CREATOR.createFromParcel(parcel2);
        }
        ADF adf = (ADF) createFromParcel4;
        if (parcel2.readInt() == 0) {
            createFromParcel5 = null;
        } else {
            createFromParcel5 = C20277AEk.CREATOR.createFromParcel(parcel2);
        }
        C20277AEk aEk = (C20277AEk) createFromParcel5;
        if (parcel2.readInt() == 0) {
            createFromParcel6 = null;
        } else {
            createFromParcel6 = C20242ADa.CREATOR.createFromParcel(parcel2);
        }
        C20242ADa aDa = (C20242ADa) createFromParcel6;
        if (parcel2.readInt() != 0) {
            obj = ADG.CREATOR.createFromParcel(parcel2);
        }
        return new C20285AEt((View.OnClickListener) parcel2.readValue(cls.getClassLoader()), aEn, aey, aDa, aee, aEk, aer, adf, (ADG) obj, readString, readString2, readString3, readString4, parcel2.readString(), A0z, A0A);
    }

    public /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new C20285AEt[i];
    }
}
