package androidx.car.app;

import X.AnonymousClass001;
import X.AnonymousClass0RM;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public interface IOnDoneCallback extends IInterface {
    public static final String DESCRIPTOR = "androidx.car.app.IOnDoneCallback";

    public class Default implements IOnDoneCallback {
        public IBinder asBinder() {
            return null;
        }

        public void onFailure(AnonymousClass0RM r1) {
        }

        public void onSuccess(AnonymousClass0RM r1) {
        }
    }

    public abstract class Stub extends Binder implements IOnDoneCallback {
        public static final int TRANSACTION_onFailure = 3;
        public static final int TRANSACTION_onSuccess = 2;

        public IBinder asBinder() {
            return this;
        }

        public class Proxy implements IOnDoneCallback {
            public IBinder mRemote;

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            public IBinder asBinder() {
                return this.mRemote;
            }

            public String getInterfaceDescriptor() {
                return IOnDoneCallback.DESCRIPTOR;
            }

            public void onFailure(AnonymousClass0RM r6) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    this.mRemote.transact(3, obtain, obtain2, AnonymousClass001.A1W(obtain, r6, IOnDoneCallback.DESCRIPTOR) ? 1 : 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void onSuccess(AnonymousClass0RM r6) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    this.mRemote.transact(2, obtain, obtain2, AnonymousClass001.A1W(obtain, r6, IOnDoneCallback.DESCRIPTOR) ? 1 : 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public static IOnDoneCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(IOnDoneCallback.DESCRIPTOR);
            if (queryLocalInterface == null || !(queryLocalInterface instanceof IOnDoneCallback)) {
                return new Proxy(iBinder);
            }
            return (IOnDoneCallback) queryLocalInterface;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i >= 1) {
                if (i <= 16777215) {
                    parcel.enforceInterface(IOnDoneCallback.DESCRIPTOR);
                    if (i == 2) {
                        onSuccess((AnonymousClass0RM) AnonymousClass001.A19(parcel, AnonymousClass0RM.CREATOR));
                    } else if (i == 3) {
                        onFailure((AnonymousClass0RM) AnonymousClass001.A19(parcel, AnonymousClass0RM.CREATOR));
                    }
                    throw null;
                } else if (i == 1598968902) {
                    parcel2.writeString(IOnDoneCallback.DESCRIPTOR);
                    return true;
                }
            }
            return super.onTransact(i, parcel, parcel2, i2);
        }

        public Stub() {
            attachInterface(this, IOnDoneCallback.DESCRIPTOR);
        }
    }

    void onFailure(AnonymousClass0RM r1);

    void onSuccess(AnonymousClass0RM r1);
}
