package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.cameracore.ardelivery.model.ARCapabilityMinVersionModeling;
import com.facebook.cameracore.ardelivery.model.AREffectAsyncAsset;
import com.whatsapp.jid.UserJid;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class AD6 implements Parcelable.Creator {
    public final int A00;

    public AD6(int i) {
        this.A00 = i;
    }

    /* JADX WARNING: type inference failed for: r3v11, types: [X.AJN, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r3v19, types: [X.8D1, java.lang.Object, X.8Gv] */
    /* JADX WARNING: type inference failed for: r3v20, types: [X.8D1, java.lang.Object, X.8Gw] */
    /* JADX WARNING: type inference failed for: r3v21, types: [X.8D1, java.lang.Object, X.8Gu] */
    /* JADX WARNING: type inference failed for: r3v23, types: [X.8D1, X.8Gt, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r3v24, types: [X.8D1, X.8Gs, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r3v25, types: [X.8Gr, X.8D1, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r3v26, types: [java.lang.Object, X.ADL] */
    public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        AW0 aw0;
        Parcel parcel2 = parcel;
        switch (this.A00) {
            case 0:
                ? r3 = new AnonymousClass8D1(parcel2);
                r3.A00 = parcel2.readString();
                return r3;
            case 1:
                ? r32 = new AnonymousClass8D1(parcel2);
                r32.A00 = parcel2.readString();
                return r32;
            case 2:
                ? r33 = new AnonymousClass8D1(parcel2);
                int readInt = parcel2.readInt();
                r33.A00 = C17880vN.A12();
                String[] strArr = new String[readInt];
                parcel2.readStringArray(strArr);
                Collections.addAll(r33.A00, strArr);
                return r33;
            case 3:
                return new AnonymousClass8D1(parcel2);
            case 4:
                ? r34 = new AnonymousClass8D1(parcel2);
                r34.A00 = parcel2.readInt();
                return r34;
            case 5:
                ? r35 = new AnonymousClass8D1(parcel2);
                r35.A02 = parcel2.readInt();
                r35.A01 = parcel2.readInt();
                r35.A00 = parcel2.readInt();
                return r35;
            case 6:
                ? r36 = new AnonymousClass8D1(parcel2);
                r36.A00 = C17890vO.A1R(parcel2.readInt());
                return r36;
            case 7:
                return new C20269AEc(parcel2);
            case 8:
                return new C20278AEl(parcel2);
            case 9:
                return new ARCapabilityMinVersionModeling(parcel2);
            case 10:
                return new AREffectAsyncAsset(parcel2);
            case 11:
                return new C20282AEq(parcel2);
            case 12:
                Class<C21349Aie> cls = C21349Aie.class;
                return new ADU((BDY) AnonymousClass3Ma.A08(parcel2, BDY.class), (C21349Aie) AnonymousClass3Ma.A08(parcel2, cls), (C21349Aie) AnonymousClass3Ma.A08(parcel2, cls), (C21349Aie) AnonymousClass3Ma.A08(parcel2, cls), parcel2.readInt());
            case 13:
                return C21349Aie.A00(parcel2.readInt(), parcel2.readInt());
            case 14:
                ? obj = new Object();
                obj.A01 = (Long) parcel2.readValue(Long.class.getClassLoader());
                return obj;
            case 15:
                String A0y = C72453Mb.A0y(parcel2);
                if (A0y != null) {
                    return new AEI(A0y, parcel2.readString(), parcel2.readString(), parcel2.readInt(), parcel2.readInt());
                }
                return null;
            case 16:
                return new AnonymousClass8D4(parcel2);
            case 17:
                return new AF0(parcel2);
            case 18:
                int readInt2 = parcel2.readInt();
                int readInt3 = parcel2.readInt();
                long readLong = parcel2.readLong();
                String readString = parcel2.readString();
                int readInt4 = parcel2.readInt();
                String readString2 = parcel2.readString();
                String readString3 = parcel2.readString();
                String readString4 = parcel2.readString();
                C22941Dw r2 = UserJid.Companion;
                UserJid A04 = r2.A04(readString4);
                UserJid A042 = r2.A04(parcel2.readString());
                String readString5 = parcel2.readString();
                String readString6 = parcel2.readString();
                String readString7 = parcel2.readString();
                String readString8 = parcel2.readString();
                ArrayList readArrayList = parcel2.readArrayList(ADO.class.getClassLoader());
                UserJid A043 = r2.A04(parcel2.readString());
                boolean A1R = C72473Md.A1R(parcel2);
                long readLong2 = parcel2.readLong();
                String readString9 = parcel2.readString();
                String readString10 = parcel2.readString();
                int readInt5 = parcel2.readInt();
                boolean A1T = AnonymousClass000.A1T(parcel2.readInt(), 1);
                AEX aex = (AEX) AnonymousClass3Ma.A08(parcel2, AEX.class);
                int readInt6 = parcel2.readInt();
                int readInt7 = parcel2.readInt();
                byte[] bArr = new byte[readInt7];
                if (readInt7 > 0) {
                    parcel2.readByteArray(bArr);
                }
                int readInt8 = parcel2.readInt();
                AnonymousClass8pG r1 = (AnonymousClass8pG) AnonymousClass3Ma.A08(parcel2, AnonymousClass8pG.class);
                AnonymousClass1KJ A002 = AnonymousClass1KI.A00(parcel2);
                if (readInt2 == 5) {
                    C20128A8n a8n = C20128A8n.$redex_init_class;
                    aw0 = new AW0(readString10, 5, readInt5, 0, readLong2);
                    aw0.A0R = bArr;
                    aw0.A0L = readString5;
                    aw0.A0C = A043;
                    aw0.A0Q = A1R;
                    aw0.A0P = A1T;
                    aw0.A07 = A002;
                } else {
                    AnonymousClass1KN A003 = AnonymousClass2TQ.A00(readString2, readInt4);
                    if (readInt2 != 4) {
                        aw0 = new AW0(A002, A003, A04, A042, readString, readString3, readString6, readString7, readString8, (String) null, readString10, readInt2, readInt3, readInt5, readInt8, readInt6, readLong2, readLong);
                        aw0.A0L = readString5;
                        if (readArrayList != null) {
                            ArrayList A0g = C108975cc.A0g(readArrayList);
                            Iterator it = readArrayList.iterator();
                            while (it.hasNext()) {
                                A0g.add(((ADO) it.next()).A00);
                            }
                            aw0.A0N = A0g;
                        }
                        aw0.A0C = A043;
                        aw0.A0Q = A1R;
                        aw0.A0A = r1;
                        aw0.A07 = A002;
                    } else {
                        aw0 = C20128A8n.A01(readLong2);
                    }
                    aw0.A0M = readString9;
                    aw0.A0P = A1T;
                    aw0.A0B(aex);
                }
                return new ADI(aw0);
            case 19:
                int readInt9 = parcel2.readInt();
                String readString11 = parcel2.readString();
                String readString12 = parcel2.readString();
                C20284AEs A01 = C20284AEs.A01(C63572tK.A00(readString12), readString11, parcel2.readString(), parcel2.readString(), readInt9);
                if (A01 instanceof AnonymousClass8pK) {
                    ((AnonymousClass8pK) A01).A01 = parcel2.readInt();
                }
                AnonymousClass1KN A004 = AnonymousClass2TQ.A00(parcel2.readString(), parcel2.readInt());
                int readInt10 = parcel2.readInt();
                if (A004 != null) {
                    return new ADO(new C185879dI(A004, A01, readInt10));
                }
                return null;
            default:
                ? obj2 = new Object();
                String readString13 = parcel2.readString();
                if (readString13 == null) {
                    readString13 = "UNKNOWN";
                }
                obj2.A02 = readString13;
                obj2.A00 = parcel2.readLong();
                obj2.A03 = C17890vO.A1R(parcel2.readInt());
                obj2.A01 = parcel2.readLong();
                return obj2;
        }
    }

    public /* bridge */ /* synthetic */ Object[] newArray(int i) {
        switch (this.A00) {
            case 0:
                return new C161618Gr[i];
            case 1:
                return new AnonymousClass8Gs[i];
            case 2:
                return new C161628Gt[i];
            case 3:
                return new AnonymousClass8D1[i];
            case 4:
                return new AnonymousClass8Gu[i];
            case 5:
                return new AnonymousClass8Gw[i];
            case 6:
                return new C161638Gv[i];
            case 7:
                return new C20269AEc[i];
            case 8:
                return new C20278AEl[i];
            case 9:
                return new ARCapabilityMinVersionModeling[i];
            case 10:
                return new AREffectAsyncAsset[i];
            case 11:
                return new C20282AEq[i];
            case 12:
                return new ADU[i];
            case 13:
                return new C21349Aie[i];
            case 14:
                return new AJN[i];
            case 15:
                return new AEI[i];
            case 16:
                return new AnonymousClass8D4[i];
            case 17:
                return new AF0[i];
            case 18:
                return new ADI[i];
            case 19:
                return new ADO[i];
            default:
                return new ADL[i];
        }
    }
}
