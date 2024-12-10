package X;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.04Y  reason: invalid class name */
public class AnonymousClass04Y extends Binder implements C17160uD {
    public final /* synthetic */ AnonymousClass0RA A00;

    public IBinder asBinder() {
        return this;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public AnonymousClass04Y(AnonymousClass0RA r1) {
        this();
        this.A00 = r1;
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        String str = C17160uD.A00;
        if (i >= 1) {
            if (i <= 16777215) {
                parcel.enforceInterface(str);
                if (i == 1) {
                    parcel.readInt();
                    Parcelable.Creator creator = Bundle.CREATOR;
                    if (parcel.readInt() != 0) {
                        creator.createFromParcel(parcel);
                    }
                    return true;
                }
            } else if (i == 1598968902) {
                parcel2.writeString(str);
                return true;
            }
        }
        return super.onTransact(i, parcel, parcel2, i2);
    }

    public AnonymousClass04Y() {
        attachInterface(this, C17160uD.A00);
    }
}
