package X;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.Cyz  reason: case insensitive filesystem */
public abstract class C26399Cyz implements IInterface {
    public final IBinder A00;
    public final String A01;

    public C26399Cyz(IBinder iBinder, String str) {
        this.A00 = iBinder;
        this.A01 = str;
    }

    public final IBinder asBinder() {
        return this.A00;
    }

    public static Parcel A00(IInterface iInterface, C26399Cyz cyz) {
        IBinder asBinder;
        Parcel A04 = cyz.A04();
        if (iInterface == null) {
            asBinder = null;
        } else {
            asBinder = iInterface.asBinder();
        }
        A04.writeStrongBinder(asBinder);
        return A04;
    }

    public static Parcel A01(Parcelable parcelable, C26399Cyz cyz) {
        Parcel A04 = cyz.A04();
        if (parcelable == null) {
            A04.writeInt(0);
            return A04;
        }
        A04.writeInt(1);
        parcelable.writeToParcel(A04, 0);
        return A04;
    }

    public static Parcel A02(C26399Cyz cyz, int i) {
        return cyz.A05(i, cyz.A04());
    }

    public static void A03(C26399Cyz cyz, int i) {
        cyz.A06(i, cyz.A04());
    }

    public final Parcel A04() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.A01);
        return obtain;
    }

    public final Parcel A05(int i, Parcel parcel) {
        parcel = Parcel.obtain();
        try {
            AnonymousClass000.A18(this.A00, parcel, parcel, i);
            return parcel;
        } catch (RuntimeException e) {
            throw e;
        } finally {
            parcel.recycle();
        }
    }

    public final void A06(int i, Parcel parcel) {
        Parcel obtain = Parcel.obtain();
        try {
            AnonymousClass000.A18(this.A00, parcel, obtain, i);
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }
}
