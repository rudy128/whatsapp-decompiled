package X;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* renamed from: X.CxD  reason: case insensitive filesystem */
public abstract class C26300CxD {
    public static float A01(Parcel parcel, int i) {
        A0K(parcel, i, 4);
        return parcel.readFloat();
    }

    public static int A03(Parcel parcel, int i) {
        A0K(parcel, i, 4);
        return parcel.readInt();
    }

    public static int A05(Parcel parcel, int i, int i2, int i3) {
        if (i != 4) {
            A0I(parcel, i2);
            return i3;
        }
        A0K(parcel, i2, 4);
        return parcel.readInt();
    }

    public static double A00(Parcel parcel, int i) {
        A0K(parcel, i, 8);
        return parcel.readDouble();
    }

    public static int A04(Parcel parcel, int i) {
        if ((i & -65536) != -65536) {
            return (char) (i >> 16);
        }
        return parcel.readInt();
    }

    public static int A06(Parcel parcel, int i, int i2, int i3, int i4) {
        if (i != i2) {
            A0I(parcel, i3);
            return i4;
        }
        A0K(parcel, i3, 4);
        return parcel.readInt();
    }

    public static long A07(Parcel parcel, int i) {
        A0K(parcel, i, 8);
        return parcel.readLong();
    }

    public static C23166BcM A0B(Parcel parcel, C23166BcM bcM, int i, int i2, int i3) {
        if (i == i2) {
            return (C23166BcM) A0A(parcel, C23166BcM.CREATOR, i3);
        }
        A0I(parcel, i3);
        return bcM;
    }

    public static String A0E(Parcel parcel, String str, int i, int i2, int i3) {
        if (i == i2) {
            return A0D(parcel, i3);
        }
        A0I(parcel, i3);
        return str;
    }

    public static void A0J(Parcel parcel, int i, int i2) {
        if (i != i2) {
            String hexString = Integer.toHexString(i);
            StringBuilder A0p = BEA.A0p(i2);
            A0p.append(" got ");
            A0p.append(i);
            throw new C27213DZn(parcel, BEA.A0l(" (0x", hexString, A0p));
        }
    }

    public static boolean A0M(Parcel parcel, int i, int i2, int i3, boolean z) {
        if (i == i2) {
            return A0L(parcel, i3);
        }
        A0I(parcel, i3);
        return z;
    }

    public static byte[] A0P(Parcel parcel, byte[] bArr, int i, int i2, int i3) {
        if (i == i2) {
            return A0O(parcel, i3);
        }
        A0I(parcel, i3);
        return bArr;
    }

    public static int A02(Parcel parcel) {
        int readInt = parcel.readInt();
        int A04 = A04(parcel, readInt);
        char c = (char) readInt;
        int dataPosition = parcel.dataPosition();
        if (c == 20293) {
            int i = A04 + dataPosition;
            if (i >= dataPosition && i <= parcel.dataSize()) {
                return i;
            }
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("Size read is invalid start=");
            A10.append(dataPosition);
            throw new C27213DZn(parcel, AnonymousClass001.A1I(" end=", A10, i));
        }
        throw new C27213DZn(parcel, "Expected object header. Got 0x".concat(String.valueOf(Integer.toHexString(readInt))));
    }

    public static Bundle A08(Parcel parcel, int i) {
        int A04 = A04(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (A04 == 0) {
            return null;
        }
        Bundle readBundle = parcel.readBundle();
        parcel.setDataPosition(dataPosition + A04);
        return readBundle;
    }

    public static IBinder A09(Parcel parcel, int i) {
        int A04 = A04(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (A04 == 0) {
            return null;
        }
        IBinder readStrongBinder = parcel.readStrongBinder();
        parcel.setDataPosition(dataPosition + A04);
        return readStrongBinder;
    }

    public static Parcelable A0A(Parcel parcel, Parcelable.Creator creator, int i) {
        int A04 = A04(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (A04 == 0) {
            return null;
        }
        Parcelable parcelable = (Parcelable) creator.createFromParcel(parcel);
        parcel.setDataPosition(dataPosition + A04);
        return parcelable;
    }

    public static Float A0C(Parcel parcel, int i) {
        int A04 = A04(parcel, i);
        if (A04 == 0) {
            return null;
        }
        A0J(parcel, A04, 4);
        return Float.valueOf(parcel.readFloat());
    }

    public static String A0D(Parcel parcel, int i) {
        int A04 = A04(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (A04 == 0) {
            return null;
        }
        String readString = parcel.readString();
        parcel.setDataPosition(dataPosition + A04);
        return readString;
    }

    public static ArrayList A0F(Parcel parcel, int i) {
        int A04 = A04(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (A04 == 0) {
            return null;
        }
        ArrayList<String> createStringArrayList = parcel.createStringArrayList();
        parcel.setDataPosition(dataPosition + A04);
        return createStringArrayList;
    }

    public static ArrayList A0G(Parcel parcel, Parcelable.Creator creator, int i) {
        int A04 = A04(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (A04 == 0) {
            return null;
        }
        ArrayList createTypedArrayList = parcel.createTypedArrayList(creator);
        parcel.setDataPosition(dataPosition + A04);
        return createTypedArrayList;
    }

    public static void A0H(Parcel parcel, int i) {
        if (parcel.dataPosition() != i) {
            throw new C27213DZn(parcel, AnonymousClass001.A1I("Overread allowed size end=", AnonymousClass000.A10(), i));
        }
    }

    public static void A0I(Parcel parcel, int i) {
        parcel.setDataPosition(parcel.dataPosition() + A04(parcel, i));
    }

    public static void A0K(Parcel parcel, int i, int i2) {
        int A04 = A04(parcel, i);
        if (A04 != i2) {
            String hexString = Integer.toHexString(A04);
            StringBuilder A0p = BEA.A0p(i2);
            A0p.append(" got ");
            A0p.append(A04);
            throw new C27213DZn(parcel, BEA.A0l(" (0x", hexString, A0p));
        }
    }

    public static boolean A0L(Parcel parcel, int i) {
        return AnonymousClass000.A1O(A03(parcel, i));
    }

    public static boolean A0N(Parcel parcel, boolean z) {
        int readInt = parcel.readInt();
        if (((char) readInt) == 1) {
            return A0L(parcel, readInt);
        }
        A0I(parcel, readInt);
        return z;
    }

    public static byte[] A0O(Parcel parcel, int i) {
        int A04 = A04(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (A04 == 0) {
            return null;
        }
        byte[] createByteArray = parcel.createByteArray();
        parcel.setDataPosition(dataPosition + A04);
        return createByteArray;
    }

    public static int[] A0Q(Parcel parcel, int i) {
        int A04 = A04(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (A04 == 0) {
            return null;
        }
        int[] createIntArray = parcel.createIntArray();
        parcel.setDataPosition(dataPosition + A04);
        return createIntArray;
    }

    public static Object[] A0R(Parcel parcel, Parcelable.Creator creator, int i) {
        int A04 = A04(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (A04 == 0) {
            return null;
        }
        Object[] createTypedArray = parcel.createTypedArray(creator);
        parcel.setDataPosition(dataPosition + A04);
        return createTypedArray;
    }

    public static String[] A0S(Parcel parcel, int i) {
        int A04 = A04(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (A04 == 0) {
            return null;
        }
        String[] createStringArray = parcel.createStringArray();
        parcel.setDataPosition(dataPosition + A04);
        return createStringArray;
    }

    public static byte[][] A0T(Parcel parcel, int i) {
        int A04 = A04(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (A04 == 0) {
            return null;
        }
        int readInt = parcel.readInt();
        byte[][] bArr = new byte[readInt][];
        for (int i2 = 0; i2 < readInt; i2++) {
            bArr[i2] = parcel.createByteArray();
        }
        parcel.setDataPosition(dataPosition + A04);
        return bArr;
    }
}
