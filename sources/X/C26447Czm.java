package X;

import android.database.CursorWindow;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.data.DataHolder;

/* renamed from: X.Czm  reason: case insensitive filesystem */
public final class C26447Czm implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A02 = C26300CxD.A02(parcel);
        String[] strArr = null;
        CursorWindow[] cursorWindowArr = null;
        Bundle bundle = null;
        int i = 0;
        int i2 = 0;
        while (parcel.dataPosition() < A02) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 1) {
                strArr = C26300CxD.A0S(parcel, readInt);
            } else if (c == 2) {
                cursorWindowArr = (CursorWindow[]) C26300CxD.A0R(parcel, CursorWindow.CREATOR, readInt);
            } else if (c == 3) {
                i2 = C26300CxD.A03(parcel, readInt);
            } else if (c != 4) {
                i = C26300CxD.A06(parcel, c, 1000, readInt, i);
            } else {
                bundle = C26300CxD.A08(parcel, readInt);
            }
        }
        C26300CxD.A0H(parcel, A02);
        DataHolder dataHolder = new DataHolder(bundle, cursorWindowArr, strArr, i, i2);
        dataHolder.A01 = C17880vN.A0D();
        int i3 = 0;
        while (true) {
            String[] strArr2 = dataHolder.A08;
            if (i3 >= strArr2.length) {
                break;
            }
            dataHolder.A01.putInt(strArr2[i3], i3);
            i3++;
        }
        CursorWindow[] cursorWindowArr2 = dataHolder.A07;
        int length = cursorWindowArr2.length;
        dataHolder.A03 = new int[length];
        int i4 = 0;
        for (int i5 = 0; i5 < length; i5++) {
            dataHolder.A03[i5] = i4;
            i4 += cursorWindowArr2[i5].getNumRows() - (i4 - cursorWindowArr2[i5].getStartPosition());
        }
        dataHolder.A00 = i4;
        return dataHolder;
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new DataHolder[i];
    }
}
