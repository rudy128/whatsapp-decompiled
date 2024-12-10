package com.google.android.gms.common.internal.safeparcel;

import X.C18210vx;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;

public abstract class SafeParcelableSerializer {
    public static SafeParcelable A00(Intent intent, Parcelable.Creator creator, String str) {
        byte[] byteArrayExtra = intent.getByteArrayExtra(str);
        if (byteArrayExtra == null) {
            return null;
        }
        C18210vx.A00(creator);
        Parcel obtain = Parcel.obtain();
        obtain.unmarshall(byteArrayExtra, 0, byteArrayExtra.length);
        obtain.setDataPosition(0);
        SafeParcelable safeParcelable = (SafeParcelable) creator.createFromParcel(obtain);
        obtain.recycle();
        return safeParcelable;
    }
}
