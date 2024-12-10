package androidx.car.app.model;

import X.AnonymousClass000;
import X.AnonymousClass001;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import androidx.car.app.IOnDoneCallback;

public interface IOnClickListener extends IInterface {
    public static final String DESCRIPTOR = "androidx.car.app.model.IOnClickListener";

    public class Default implements IOnClickListener {
        public IBinder asBinder() {
            return null;
        }

        public void onClick(IOnDoneCallback iOnDoneCallback) {
        }
    }

    public abstract class Stub extends Binder implements IOnClickListener {
        public static final int TRANSACTION_onClick = 2;

        public IBinder asBinder() {
            return this;
        }

        public class Proxy implements IOnClickListener {
            public IBinder mRemote;

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            public IBinder asBinder() {
                return this.mRemote;
            }

            public String getInterfaceDescriptor() {
                return IOnClickListener.DESCRIPTOR;
            }

            public void onClick(IOnDoneCallback iOnDoneCallback) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IOnClickListener.DESCRIPTOR);
                    obtain.writeStrongInterface(iOnDoneCallback);
                    AnonymousClass001.A1N(this.mRemote, obtain);
                } finally {
                    obtain.recycle();
                }
            }
        }

        public static IOnClickListener asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(IOnClickListener.DESCRIPTOR);
            if (queryLocalInterface == null || !(queryLocalInterface instanceof IOnClickListener)) {
                return new Proxy(iBinder);
            }
            return (IOnClickListener) queryLocalInterface;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i >= 1) {
                if (i <= 16777215) {
                    parcel.enforceInterface(IOnClickListener.DESCRIPTOR);
                    if (i == 2) {
                        onClick(AnonymousClass000.A0a(parcel));
                        return true;
                    }
                } else if (i == 1598968902) {
                    parcel2.writeString(IOnClickListener.DESCRIPTOR);
                    return true;
                }
            }
            return super.onTransact(i, parcel, parcel2, i2);
        }

        public Stub() {
            attachInterface(this, IOnClickListener.DESCRIPTOR);
        }
    }

    void onClick(IOnDoneCallback iOnDoneCallback);
}
