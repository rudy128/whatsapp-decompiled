package com.google.android.gms.common.data;

import X.AnonymousClass000;
import X.BEA;
import X.C26293Cx2;
import X.CQ2;
import X.DJ0;
import android.database.CursorWindow;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.gms.common.annotation.KeepName;
import java.io.Closeable;

@KeepName
public final class DataHolder extends DJ0 implements Closeable {
    public static final CQ2 A09 = new CQ2(new String[0]);
    public static final Parcelable.Creator CREATOR = new Object();
    public int A00;
    public Bundle A01;
    public boolean A02 = false;
    public int[] A03;
    public final int A04;
    public final int A05;
    public final Bundle A06;
    public final CursorWindow[] A07;
    public final String[] A08;

    public void close() {
        synchronized (this) {
            if (!this.A02) {
                this.A02 = true;
                int i = 0;
                while (true) {
                    CursorWindow[] cursorWindowArr = this.A07;
                    if (i >= cursorWindowArr.length) {
                        break;
                    }
                    cursorWindowArr[i].close();
                    i++;
                }
            }
        }
    }

    public final void finalize() {
        boolean z;
        if (this.A07.length > 0) {
            synchronized (this) {
                z = this.A02;
            }
            if (!z) {
                close();
                Log.e("DataBuffer", BEA.A0l("Internal data leak within a DataBuffer object detected!  Be sure to explicitly call release() on all DataBuffer extending objects when you are done with them. (internal object: ", toString(), AnonymousClass000.A10()));
            }
        }
    }

    public final void writeToParcel(Parcel parcel, int i) {
        String[] strArr = this.A08;
        int A002 = C26293Cx2.A00(parcel);
        C26293Cx2.A0G(parcel, strArr, 1);
        C26293Cx2.A0F(parcel, this.A07, 2, i);
        C26293Cx2.A06(parcel, 3, this.A05);
        C26293Cx2.A03(this.A06, parcel, 4);
        C26293Cx2.A06(parcel, 1000, this.A04);
        C26293Cx2.A05(parcel, A002);
        if ((i & 1) != 0) {
            close();
        }
    }

    public DataHolder(Bundle bundle, CursorWindow[] cursorWindowArr, String[] strArr, int i, int i2) {
        this.A04 = i;
        this.A08 = strArr;
        this.A07 = cursorWindowArr;
        this.A05 = i2;
        this.A06 = bundle;
    }
}
