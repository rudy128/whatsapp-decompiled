package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.whatsapp.jid.UserJid;
import java.util.ArrayList;

public final class AB0 implements Parcelable.Creator {
    public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Object createFromParcel;
        Object createFromParcel2;
        Object createFromParcel3;
        Object createFromParcel4;
        Object createFromParcel5;
        Integer A0i;
        Parcel parcel2 = parcel;
        C18070vi.A0d(parcel2, 0);
        Class<AEW> cls = AEW.class;
        UserJid userJid = (UserJid) AnonymousClass3Ma.A08(parcel2, cls);
        String readString = parcel2.readString();
        int readInt = parcel2.readInt();
        ArrayList A0z = C17880vN.A0z(readInt);
        for (int i = 0; i != readInt; i++) {
            A0z.add(AnonymousClass3Ma.A08(parcel2, cls));
        }
        ArrayList<String> createStringArrayList = parcel2.createStringArrayList();
        String readString2 = parcel2.readString();
        String readString3 = parcel2.readString();
        AEH aeh = (AEH) AEH.CREATOR.createFromParcel(parcel2);
        if (parcel2.readInt() == 0) {
            createFromParcel = null;
        } else {
            createFromParcel = C20260ADs.CREATOR.createFromParcel(parcel2);
        }
        C20260ADs aDs = (C20260ADs) createFromParcel;
        boolean A1R = C72473Md.A1R(parcel2);
        String readString4 = parcel2.readString();
        boolean A1R2 = C72473Md.A1R(parcel2);
        String readString5 = parcel2.readString();
        String readString6 = parcel2.readString();
        boolean A1R3 = C72473Md.A1R(parcel2);
        String readString7 = parcel2.readString();
        boolean A1R4 = C72473Md.A1R(parcel2);
        boolean A1R5 = C72473Md.A1R(parcel2);
        if (parcel2.readInt() == 0) {
            createFromParcel2 = null;
        } else {
            createFromParcel2 = C20248ADg.CREATOR.createFromParcel(parcel2);
        }
        C20248ADg aDg = (C20248ADg) createFromParcel2;
        if (parcel2.readInt() == 0) {
            createFromParcel3 = null;
        } else {
            createFromParcel3 = C20259ADr.CREATOR.createFromParcel(parcel2);
        }
        C20259ADr aDr = (C20259ADr) createFromParcel3;
        boolean A1R6 = C72473Md.A1R(parcel2);
        if (parcel2.readInt() == 0) {
            createFromParcel4 = null;
        } else {
            createFromParcel4 = AEA.CREATOR.createFromParcel(parcel2);
        }
        AEA aea = (AEA) createFromParcel4;
        int readInt2 = parcel2.readInt();
        ArrayList A0z2 = C17880vN.A0z(readInt2);
        for (int i2 = 0; i2 != readInt2; i2 = AnonymousClass8BV.A01(parcel2, AE9.CREATOR, A0z2, i2)) {
        }
        String readString8 = parcel2.readString();
        String readString9 = parcel2.readString();
        boolean A1R7 = C72473Md.A1R(parcel2);
        int readInt3 = parcel2.readInt();
        int readInt4 = parcel2.readInt();
        ArrayList A0z3 = C17880vN.A0z(readInt4);
        for (int i3 = 0; i3 != readInt4; i3 = AnonymousClass8BV.A01(parcel2, ADD.CREATOR, A0z3, i3)) {
        }
        ArrayList<String> createStringArrayList2 = parcel2.createStringArrayList();
        boolean A1R8 = C72473Md.A1R(parcel2);
        if (parcel2.readInt() == 0) {
            createFromParcel5 = null;
        } else {
            createFromParcel5 = C20261ADt.CREATOR.createFromParcel(parcel2);
        }
        C20261ADt aDt = (C20261ADt) createFromParcel5;
        String readString10 = parcel2.readString();
        int readInt5 = parcel2.readInt();
        ArrayList A0z4 = C17880vN.A0z(readInt5);
        for (int i4 = 0; i4 != readInt5; i4 = AnonymousClass8BV.A01(parcel2, AEL.CREATOR, A0z4, i4)) {
        }
        if (parcel2.readInt() == 0) {
            A0i = null;
        } else {
            A0i = AnonymousClass8BT.A0i(parcel2);
        }
        boolean A1R9 = C72473Md.A1R(parcel2);
        int readInt6 = parcel2.readInt();
        String readString11 = parcel2.readString();
        String readString12 = parcel2.readString();
        String readString13 = parcel2.readString();
        int readInt7 = parcel2.readInt();
        ArrayList A0z5 = C17880vN.A0z(readInt7);
        for (int i5 = 0; i5 != readInt7; i5++) {
            A0z5.add(AnonymousClass3Ma.A08(parcel2, cls));
        }
        int readInt8 = parcel2.readInt();
        ArrayList A0z6 = C17880vN.A0z(readInt8);
        for (int i6 = 0; i6 != readInt8; i6++) {
            A0z6.add(AnonymousClass3Ma.A08(parcel2, cls));
        }
        ArrayList arrayList = A0z;
        ArrayList arrayList2 = A0z2;
        ArrayList arrayList3 = A0z3;
        ArrayList arrayList4 = A0z4;
        ArrayList arrayList5 = A0z5;
        ArrayList arrayList6 = A0z6;
        C20248ADg aDg2 = aDg;
        C20261ADt aDt2 = aDt;
        AEH aeh2 = aeh;
        UserJid userJid2 = userJid;
        return new AEW((C64572uz) AnonymousClass3Ma.A08(parcel2, cls), aDr, aDs, aea, aDg2, aDt2, aeh2, userJid2, A0i, readString, readString2, readString3, readString4, readString5, readString6, readString7, readString8, readString9, readString10, readString11, readString12, readString13, arrayList, createStringArrayList, arrayList2, arrayList3, createStringArrayList2, arrayList4, arrayList5, arrayList6, readInt3, readInt6, A1R, A1R2, A1R3, A1R4, A1R5, A1R6, A1R7, A1R8, A1R9, C72473Md.A1R(parcel2));
    }

    public /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new AEW[i];
    }
}
