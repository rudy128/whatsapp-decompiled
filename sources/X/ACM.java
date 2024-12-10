package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

public final class ACM implements Parcelable.Creator {
    public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Object createFromParcel;
        ArrayList A0z;
        ArrayList A0z2;
        ArrayList A0z3;
        Object createFromParcel2;
        Object createFromParcel3;
        ArrayList A0z4;
        Object createFromParcel4;
        Parcel parcel2 = parcel;
        C18070vi.A0d(parcel2, 0);
        byte[] createByteArray = parcel2.createByteArray();
        String readString = parcel2.readString();
        if (parcel2.readInt() == 0) {
            createFromParcel = null;
        } else {
            createFromParcel = AE1.CREATOR.createFromParcel(parcel2);
        }
        AE1 ae1 = (AE1) createFromParcel;
        String readString2 = parcel2.readString();
        String readString3 = parcel2.readString();
        String readString4 = parcel2.readString();
        AnonymousClass1KJ A00 = AnonymousClass1KI.A00(parcel2);
        String readString5 = parcel2.readString();
        String readString6 = parcel2.readString();
        AEU aeu = (AEU) AEU.CREATOR.createFromParcel(parcel2);
        String readString7 = parcel2.readString();
        int readInt = parcel2.readInt();
        String readString8 = parcel2.readString();
        String readString9 = parcel2.readString();
        long readLong = parcel2.readLong();
        boolean A01 = A3Y.A01(parcel2);
        if (parcel2.readInt() == 0) {
            A0z = null;
        } else {
            int readInt2 = parcel2.readInt();
            A0z = C17880vN.A0z(readInt2);
            for (int i = 0; i != readInt2; i++) {
                A0z.add(AnonymousClass3Ma.A08(parcel2, C20279AEn.class));
            }
        }
        if (parcel2.readInt() == 0) {
            A0z2 = null;
        } else {
            int readInt3 = parcel2.readInt();
            A0z2 = C17880vN.A0z(readInt3);
            for (int i2 = 0; i2 != readInt3; i2 = AnonymousClass8BV.A01(parcel2, C20267ADz.CREATOR, A0z2, i2)) {
            }
        }
        boolean A012 = A3Y.A01(parcel2);
        if (parcel2.readInt() == 0) {
            A0z3 = null;
        } else {
            int readInt4 = parcel2.readInt();
            A0z3 = C17880vN.A0z(readInt4);
            for (int i3 = 0; i3 != readInt4; i3 = AnonymousClass8BV.A01(parcel2, C20251ADj.CREATOR, A0z3, i3)) {
            }
        }
        if (parcel2.readInt() == 0) {
            createFromParcel2 = null;
        } else {
            createFromParcel2 = ADZ.CREATOR.createFromParcel(parcel2);
        }
        ADZ adz = (ADZ) createFromParcel2;
        String readString10 = parcel2.readString();
        Class<C20279AEn> cls = C20279AEn.class;
        C22565BDa bDa = (C22565BDa) AnonymousClass3Ma.A08(parcel2, cls);
        ArrayList<String> createStringArrayList = parcel2.createStringArrayList();
        long readLong2 = parcel2.readLong();
        String readString11 = parcel2.readString();
        AES aes = (AES) AnonymousClass3Ma.A08(parcel2, cls);
        if (parcel2.readInt() == 0) {
            createFromParcel3 = null;
        } else {
            createFromParcel3 = AE0.CREATOR.createFromParcel(parcel2);
        }
        AE0 ae0 = (AE0) createFromParcel3;
        if (parcel2.readInt() == 0) {
            A0z4 = null;
        } else {
            int readInt5 = parcel2.readInt();
            A0z4 = C17880vN.A0z(readInt5);
            for (int i4 = 0; i4 != readInt5; i4 = AnonymousClass8BV.A01(parcel2, C20928Abi.CREATOR, A0z4, i4)) {
            }
        }
        boolean A013 = A3Y.A01(parcel2);
        if (parcel2.readInt() == 0) {
            createFromParcel4 = null;
        } else {
            createFromParcel4 = C20266ADy.CREATOR.createFromParcel(parcel2);
        }
        return new C20279AEn(A00, bDa, aes, (C20266ADy) createFromParcel4, ae0, aeu, adz, ae1, readString, readString2, readString3, readString4, readString5, readString6, readString7, readString8, readString9, readString10, readString11, parcel2.readString(), A0z, A0z2, A0z3, createStringArrayList, A0z4, createByteArray, readInt, readLong, readLong2, A01, A012, A013);
    }

    public /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new C20279AEn[i];
    }
}
