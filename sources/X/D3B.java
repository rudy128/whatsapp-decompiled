package X;

import android.graphics.RectF;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import androidx.versionedparcelable.ParcelImpl;
import com.facebook.cameracore.mediapipeline.arengineservices.interfaces.EffectAttribution;
import com.facebook.cameracore.mediapipeline.dataproviders.worldtracker.interfaces.DeviceConfig;
import com.facebook.wearable.applinks.AppLinkDeviceConnectionStatus;
import com.facebook.wearable.applinks.AppLinkDeviceHardwareState;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class D3B implements Parcelable.Creator {
    public final int A00;

    public D3B(int i) {
        this.A00 = i;
    }

    public static D3B A00(int i) {
        return new D3B(i);
    }

    /* JADX WARNING: type inference failed for: r1v3, types: [java.lang.Object, X.D47] */
    /* JADX WARNING: type inference failed for: r1v9, types: [X.D3K, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r1v15, types: [X.D3s, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r1v24, types: [X.2v4, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r1v27, types: [java.lang.Object, X.D3H] */
    /* JADX WARNING: type inference failed for: r1v41, types: [android.view.View$BaseSavedState, X.BHK, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r1v43, types: [java.lang.Object, X.D3U] */
    /* JADX WARNING: type inference failed for: r1v44, types: [X.2uu, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r1v46, types: [X.D3S, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r1v49, types: [android.view.View$BaseSavedState, java.lang.Object, X.BHL] */
    /* JADX WARNING: type inference failed for: r1v50, types: [java.lang.Object, X.D3V] */
    public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Integer num;
        switch (this.A00) {
            case 0:
                ? baseSavedState = new View.BaseSavedState(parcel);
                baseSavedState.A00 = parcel.readInt();
                return baseSavedState;
            case 1:
                return new C64602v2(parcel);
            case 2:
                return new D3M(parcel);
            case 3:
                ? obj = new Object();
                obj.A01 = null;
                obj.A04 = AnonymousClass000.A13();
                obj.A05 = AnonymousClass000.A13();
                obj.A02 = parcel.createStringArrayList();
                obj.A03 = parcel.createStringArrayList();
                obj.A07 = (C64602v2[]) parcel.createTypedArray(C64602v2.CREATOR);
                obj.A00 = parcel.readInt();
                obj.A01 = parcel.readString();
                obj.A04 = parcel.createStringArrayList();
                obj.A05 = parcel.createTypedArrayList(D3M.CREATOR);
                obj.A06 = parcel.createTypedArrayList(C1416676m.CREATOR);
                return obj;
            case 4:
                return new C64612v3(parcel);
            case 5:
                ? obj2 = new Object();
                obj2.A01 = parcel.readInt();
                obj2.A00 = parcel.readInt();
                obj2.A02 = C17890vO.A1R(parcel.readInt());
                return obj2;
            case 6:
                ? obj3 = new Object();
                obj3.A01 = parcel.readInt();
                obj3.A00 = parcel.readInt();
                obj3.A02 = C17890vO.A1R(parcel.readInt());
                int readInt = parcel.readInt();
                if (readInt <= 0) {
                    return obj3;
                }
                int[] iArr = new int[readInt];
                obj3.A03 = iArr;
                parcel.readIntArray(iArr);
                return obj3;
            case 7:
                ? obj4 = new Object();
                obj4.A00 = parcel.readInt();
                obj4.A03 = parcel.readInt();
                int readInt2 = parcel.readInt();
                obj4.A02 = readInt2;
                if (readInt2 > 0) {
                    int[] iArr2 = new int[readInt2];
                    obj4.A09 = iArr2;
                    parcel.readIntArray(iArr2);
                }
                int readInt3 = parcel.readInt();
                obj4.A01 = readInt3;
                if (readInt3 > 0) {
                    int[] iArr3 = new int[readInt3];
                    obj4.A08 = iArr3;
                    parcel.readIntArray(iArr3);
                }
                boolean z = false;
                obj4.A07 = AnonymousClass000.A1T(parcel.readInt(), 1);
                obj4.A05 = AnonymousClass000.A1T(parcel.readInt(), 1);
                if (parcel.readInt() == 1) {
                    z = true;
                }
                obj4.A06 = z;
                obj4.A04 = parcel.readArrayList(D3V.class.getClassLoader());
                return obj4;
            case 8:
                return new ParcelImpl(parcel);
            case 9:
                ? baseSavedState2 = new View.BaseSavedState(parcel);
                baseSavedState2.A04 = parcel.readString();
                baseSavedState2.A00 = parcel.readFloat();
                baseSavedState2.A06 = C17890vO.A1R(parcel.readInt());
                baseSavedState2.A05 = parcel.readString();
                baseSavedState2.A03 = parcel.readInt();
                baseSavedState2.A02 = parcel.readInt();
                return baseSavedState2;
            case 10:
                CUN cun = new CUN();
                cun.A05 = parcel.readString();
                cun.A0F = AnonymousClass000.A1O(parcel.readInt());
                cun.A0G = AnonymousClass000.A1O(parcel.readInt());
                cun.A0C = AnonymousClass000.A1O(parcel.readInt());
                cun.A0B = AnonymousClass000.A1O(parcel.readInt());
                cun.A0A = AnonymousClass000.A1O(parcel.readInt());
                cun.A09 = AnonymousClass000.A1O(parcel.readInt());
                cun.A08 = AnonymousClass000.A1O(parcel.readInt());
                cun.A07 = AnonymousClass000.A1O(parcel.readInt());
                cun.A0H = AnonymousClass000.A1O(parcel.readInt());
                cun.A03 = parcel.readString();
                cun.A04 = parcel.readString();
                cun.A02 = parcel.readString();
                cun.A06 = parcel.readString();
                cun.A01 = parcel.readString();
                cun.A0E = AnonymousClass000.A1O(parcel.readInt());
                cun.A00 = parcel.readInt();
                cun.A0D = AnonymousClass000.A1O(parcel.readInt());
                cun.A0I = AnonymousClass000.A1O(parcel.readInt());
                return new D3W(cun);
            case 11:
                return new DUU(parcel);
            case 12:
                return new C26556D3w(parcel);
            case 13:
                return new D9H(parcel);
            case 14:
                return new D42(parcel);
            case 15:
                return new D9I(parcel);
            case 16:
                return new C22779BOs(parcel);
            case 17:
                return new C22777BOq(parcel);
            case 18:
                return new C22778BOr(parcel);
            case 19:
                return new C22776BOp(parcel);
            case 20:
                return new D9G(parcel);
            case 21:
                return new BPC(parcel);
            case 22:
                return new D3Y(parcel);
            case 23:
                String readString = parcel.readString();
                ? obj5 = new Object();
                obj5.A00 = 1.0f;
                obj5.A01 = 1.0f;
                obj5.A0C = Collections.EMPTY_LIST;
                obj5.A08 = readString;
                obj5.A04 = parcel.readString();
                obj5.A0B = parcel.readString();
                obj5.A02 = parcel.readString();
                obj5.A0A = parcel.readString();
                obj5.A03 = parcel.readString();
                obj5.A05 = parcel.readString();
                obj5.A06 = parcel.readString();
                obj5.A07 = parcel.readString();
                obj5.A00 = parcel.readFloat();
                obj5.A01 = parcel.readFloat();
                ArrayList A13 = AnonymousClass000.A13();
                obj5.A0C = A13;
                parcel.readStringList(A13);
                obj5.A09 = parcel.readString();
                return obj5;
            case 24:
                return new D44(parcel);
            case 25:
                return new C26555D3v(parcel);
            case 26:
                ? obj6 = new Object();
                obj6.mIdentifiers = null;
                obj6.mIdentifiers = (List) parcel.readValue(List.class.getClassLoader());
                return obj6;
            case 27:
                return new EffectAttribution(parcel);
            case 28:
                return new EffectAttribution.AttributedAsset(parcel);
            case 29:
                return new EffectAttribution.License(parcel);
            case 30:
                return new D3Q(parcel);
            case 31:
                return new DeviceConfig(parcel);
            case 32:
                return new D4A(parcel);
            case 33:
                return new D4B(parcel);
            case 34:
                return new C26557D3x(parcel);
            case 35:
                ? obj7 = new Object();
                obj7.A06 = parcel.readLong();
                obj7.A0D = parcel.readString();
                obj7.A01 = parcel.readInt();
                obj7.A0C = null;
                obj7.A0B = null;
                obj7.A05 = parcel.readLong();
                obj7.A02 = parcel.readInt();
                obj7.A03 = parcel.readInt();
                obj7.A00 = parcel.readInt();
                obj7.A04 = parcel.readInt();
                obj7.A08 = (C26557D3x) C26557D3x.CREATOR.createFromParcel(parcel);
                return obj7;
            case 36:
                C18070vi.A0d(parcel, 0);
                D3T d3t = new D3T();
                d3t.A05 = parcel.readString();
                d3t.A01 = parcel.readLong();
                d3t.A06 = parcel.readString();
                parcel.readStringList(d3t.A07);
                d3t.A00 = parcel.readInt();
                d3t.A04 = AnonymousClass00R.A00(3)[parcel.readInt()];
                d3t.A02 = (RectF) AnonymousClass3Ma.A08(parcel, RectF.class);
                return d3t;
            case 37:
                return new C26559D3z(parcel);
            case 38:
                C18070vi.A0d(parcel, 0);
                return new C26553D3t(parcel);
            case 39:
                return new D43(parcel);
            case 40:
                return new D40(parcel);
            case 41:
                ? obj8 = new Object();
                obj8.A00 = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
                return obj8;
            case 42:
                return new D3O(parcel.readLong(), parcel.readLong());
            case 43:
                return new D49(parcel);
            case 44:
                int readInt4 = parcel.readInt();
                SparseArray sparseArray = C0W.A00;
                if (sparseArray.get(readInt4) != null) {
                    return sparseArray.get(readInt4);
                }
                throw AnonymousClass000.A0k("Invalid VideoMemoryState value");
            case 45:
                return new C26551D3p(parcel);
            case 46:
                ? obj9 = new Object();
                boolean z2 = false;
                obj9.A0R = false;
                ClassLoader classLoader = D47.class.getClassLoader();
                obj9.A05 = (Uri) parcel.readParcelable(classLoader);
                obj9.A0H = parcel.readString();
                obj9.A0A = parcel.readString();
                obj9.A0G = parcel.readString();
                obj9.A04 = (Uri) parcel.readParcelable(classLoader);
                obj9.A0B = parcel.readString();
                obj9.A0C = parcel.readString();
                obj9.A0D = parcel.readString();
                String readString2 = parcel.readString();
                if (readString2.equals("DASH_VOD")) {
                    num = AnonymousClass00R.A00;
                } else if (readString2.equals("DASH_LIVE")) {
                    num = AnonymousClass00R.A01;
                } else if (readString2.equals("PROGRESSIVE")) {
                    num = AnonymousClass00R.A0C;
                } else if (readString2.equals("HLS")) {
                    num = AnonymousClass00R.A0N;
                } else if (readString2.equals("BYTEARRAY")) {
                    num = AnonymousClass00R.A0Y;
                } else {
                    throw AnonymousClass000.A0k(readString2);
                }
                obj9.A07 = num;
                obj9.A02 = parcel.readLong();
                obj9.A03 = parcel.readLong();
                obj9.A01 = parcel.readInt();
                obj9.A0M = AnonymousClass000.A1T(parcel.readByte(), 1);
                obj9.A0Q = AnonymousClass000.A1T(parcel.readByte(), 1);
                obj9.A0F = parcel.readString();
                int readInt5 = parcel.readInt();
                obj9.A0I = C17880vN.A11();
                for (int i = 0; i < readInt5; i++) {
                    obj9.A0I.put(parcel.readString(), parcel.readString());
                }
                obj9.A0O = AnonymousClass000.A1T(parcel.readByte(), 1);
                obj9.A0P = AnonymousClass000.A1T(parcel.readByte(), 1);
                obj9.A0J = AnonymousClass000.A1T(parcel.readByte(), 1);
                obj9.A0N = AnonymousClass000.A1T(parcel.readByte(), 1);
                obj9.A0E = parcel.readString();
                obj9.A0L = AnonymousClass000.A1T(parcel.readByte(), 1);
                obj9.A06 = C24259ByI.valueOf(parcel.readString());
                obj9.A0K = AnonymousClass000.A1T(parcel.readByte(), 1);
                obj9.A08 = parcel.readString();
                obj9.A00 = parcel.readInt();
                obj9.A09 = parcel.readString();
                obj9.A0S = parcel.createByteArray();
                if (parcel.readByte() == 1) {
                    z2 = true;
                }
                obj9.A0R = z2;
                return obj9;
            case 47:
                return new C26543D3e(parcel);
            case 48:
                return AppLinkDeviceConnectionStatus.values()[parcel.readInt()];
            default:
                return AppLinkDeviceHardwareState.values()[parcel.readInt()];
        }
    }

    public /* bridge */ /* synthetic */ Object[] newArray(int i) {
        switch (this.A00) {
            case 0:
                return new BHL[i];
            case 1:
                return new C64602v2[i];
            case 2:
                return new D3M[i];
            case 3:
                return new D3S[i];
            case 4:
                return new C64612v3[i];
            case 5:
                return new C64522uu[i];
            case 6:
                return new D3V[i];
            case 7:
                return new D3U[i];
            case 8:
                return new ParcelImpl[i];
            case 9:
                return new BHK[i];
            case 10:
                return new D3W[i];
            case 11:
                return new DUU[i];
            case 12:
                return new C26556D3w[i];
            case 13:
                return new D9H[i];
            case 14:
                return new D42[i];
            case 15:
                return new D9I[i];
            case 16:
                return new C22779BOs[i];
            case 17:
                return new C22777BOq[i];
            case 18:
                return new C22778BOr[i];
            case 19:
                return new C22776BOp[i];
            case 20:
                return new D9G[i];
            case 21:
                return new BPC[i];
            case 22:
                return new D3Y[i];
            case 23:
                return new D3H[i];
            case 24:
                return new D44[i];
            case 25:
                return new C26555D3v[i];
            case 26:
                return new C64622v4[i];
            case 27:
                return new EffectAttribution[i];
            case 28:
                return new EffectAttribution.AttributedAsset[i];
            case 29:
                return new EffectAttribution.License[i];
            case 30:
                return new D3Q[i];
            case 31:
                return new DeviceConfig[i];
            case 32:
                return new D4A[i];
            case 33:
                return new D4B[i];
            case 34:
                return new C26557D3x[i];
            case 35:
                return new C26552D3s[i];
            case 36:
                return new D3T[i];
            case 37:
                return new C26559D3z[i];
            case 38:
                return new C26553D3t[i];
            case 39:
                return new D43[i];
            case 40:
                return new D40[i];
            case 41:
                return new D3K[i];
            case 42:
                return new D3O[i];
            case 43:
                return new D49[i];
            case 44:
                return new C0W[i];
            case 45:
                return new C26551D3p[i];
            case 46:
                return new D47[i];
            case 47:
                return new C26543D3e[i];
            case 48:
                return new AppLinkDeviceConnectionStatus[i];
            default:
                return new AppLinkDeviceHardwareState[i];
        }
    }
}
