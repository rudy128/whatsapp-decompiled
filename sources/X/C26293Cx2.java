package X;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* renamed from: X.Cx2  reason: case insensitive filesystem */
public abstract class C26293Cx2 {
    public static void A0C(Parcel parcel, List list, int i, boolean z) {
        if (list != null) {
            int A02 = A02(parcel, i);
            int size = list.size();
            parcel.writeInt(size);
            for (int i2 = 0; i2 < size; i2++) {
                Parcelable parcelable = (Parcelable) list.get(i2);
                if (parcelable == null) {
                    parcel.writeInt(0);
                } else {
                    BEB.A0o(parcel, parcelable, 0);
                }
            }
            A05(parcel, A02);
        } else if (z) {
            parcel.writeInt(i);
        }
    }

    public static void A0F(Parcel parcel, Parcelable[] parcelableArr, int i, int i2) {
        if (parcelableArr != null) {
            int A02 = A02(parcel, i);
            parcel.writeInt(r2);
            for (Parcelable parcelable : parcelableArr) {
                if (parcelable == null) {
                    parcel.writeInt(0);
                } else {
                    BEB.A0o(parcel, parcelable, i2);
                }
            }
            A05(parcel, A02);
        }
    }

    public static void A0H(Parcel parcel, byte[][] bArr, int i) {
        if (bArr != null) {
            int A02 = A02(parcel, i);
            parcel.writeInt(r1);
            for (byte[] writeByteArray : bArr) {
                parcel.writeByteArray(writeByteArray);
            }
            A05(parcel, A02);
        }
    }

    public static int A00(Parcel parcel) {
        return A02(parcel, 20293);
    }

    public static int A01(Parcel parcel, int i) {
        int A02 = A02(parcel, 20293);
        A06(parcel, 1, i);
        return A02;
    }

    public static int A02(Parcel parcel, int i) {
        parcel.writeInt(i | -65536);
        parcel.writeInt(0);
        return parcel.dataPosition();
    }

    public static void A03(Bundle bundle, Parcel parcel, int i) {
        if (bundle != null) {
            int A02 = A02(parcel, i);
            parcel.writeBundle(bundle);
            A05(parcel, A02);
        }
    }

    public static void A04(IBinder iBinder, Parcel parcel, int i) {
        if (iBinder != null) {
            int A02 = A02(parcel, i);
            parcel.writeStrongBinder(iBinder);
            A05(parcel, A02);
        }
    }

    public static void A07(Parcel parcel, int i, long j) {
        parcel.writeInt(i | 524288);
        parcel.writeLong(j);
    }

    public static void A09(Parcel parcel, Parcelable parcelable, int i, int i2, boolean z) {
        if (parcelable != null) {
            int A02 = A02(parcel, i);
            parcelable.writeToParcel(parcel, i2);
            A05(parcel, A02);
        } else if (z) {
            parcel.writeInt(i);
        }
    }

    public static void A0A(Parcel parcel, String str, int i, boolean z) {
        if (str != null) {
            int A02 = A02(parcel, i);
            parcel.writeString(str);
            A05(parcel, A02);
        } else if (z) {
            parcel.writeInt(i);
        }
    }

    public static void A0B(Parcel parcel, List list, int i) {
        if (list != null) {
            int A02 = A02(parcel, i);
            parcel.writeStringList(list);
            A05(parcel, A02);
        }
    }

    public static void A0D(Parcel parcel, byte[] bArr, int i, boolean z) {
        if (bArr != null) {
            int A02 = A02(parcel, i);
            parcel.writeByteArray(bArr);
            A05(parcel, A02);
        } else if (z) {
            parcel.writeInt(i);
        }
    }

    public static void A0E(Parcel parcel, int[] iArr, int i) {
        if (iArr != null) {
            int A02 = A02(parcel, i);
            parcel.writeIntArray(iArr);
            A05(parcel, A02);
        }
    }

    public static void A0G(Parcel parcel, String[] strArr, int i) {
        if (strArr != null) {
            int A02 = A02(parcel, i);
            parcel.writeStringArray(strArr);
            A05(parcel, A02);
        }
    }

    public static void A05(Parcel parcel, int i) {
        int dataPosition = parcel.dataPosition();
        parcel.setDataPosition(i - 4);
        parcel.writeInt(dataPosition - i);
        parcel.setDataPosition(dataPosition);
    }

    public static void A06(Parcel parcel, int i, int i2) {
        BE7.A0z(i, parcel);
        parcel.writeInt(i2);
    }

    public static void A08(Parcel parcel, int i, boolean z) {
        BE7.A0z(i, parcel);
        parcel.writeInt(z ? 1 : 0);
    }
}
