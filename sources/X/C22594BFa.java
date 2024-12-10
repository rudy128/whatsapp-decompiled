package X;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;

/* renamed from: X.BFa  reason: case insensitive filesystem */
public abstract class C22594BFa extends Binder implements IInterface {
    public final IBinder asBinder() {
        return this;
    }

    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        Status status;
        Object A0i;
        TaskCompletionSource taskCompletionSource;
        if (i <= 16777215) {
            BE7.A16(this, parcel);
        } else if (super.onTransact(i, parcel, parcel2, i2)) {
            return true;
        }
        if (this instanceof C23281BeV) {
            C23281BeV beV = (C23281BeV) this;
            if (i != 1) {
                return false;
            }
            status = (Status) BEA.A0M(parcel, Status.CREATOR);
            A0i = Boolean.valueOf(AnonymousClass000.A1O(parcel.readInt()));
            taskCompletionSource = beV.A00;
        } else if (this instanceof C23280BeU) {
            C23280BeU beU = (C23280BeU) this;
            if (i != 1) {
                return false;
            }
            status = (Status) BEA.A0M(parcel, Status.CREATOR);
            A0i = parcel.createByteArray();
            taskCompletionSource = beU.A00;
        } else {
            C23279BeT beT = (C23279BeT) this;
            if (i != 1) {
                return false;
            }
            status = (Status) BEA.A0M(parcel, Status.CREATOR);
            A0i = AnonymousClass8BT.A0i(parcel);
            taskCompletionSource = beT.A00;
        }
        C24601CAx.A00(status, taskCompletionSource, A0i);
        return true;
    }
}
