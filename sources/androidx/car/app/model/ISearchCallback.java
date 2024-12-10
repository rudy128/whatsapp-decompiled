package androidx.car.app.model;

import X.AnonymousClass000;
import X.AnonymousClass001;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import androidx.car.app.IOnDoneCallback;

public interface ISearchCallback extends IInterface {
    public static final String DESCRIPTOR = "androidx.car.app.model.ISearchCallback";

    public class Default implements ISearchCallback {
        public IBinder asBinder() {
            return null;
        }

        public void onSearchSubmitted(String str, IOnDoneCallback iOnDoneCallback) {
        }

        public void onSearchTextChanged(String str, IOnDoneCallback iOnDoneCallback) {
        }
    }

    public abstract class Stub extends Binder implements ISearchCallback {
        public static final int TRANSACTION_onSearchSubmitted = 3;
        public static final int TRANSACTION_onSearchTextChanged = 2;

        public IBinder asBinder() {
            return this;
        }

        public class Proxy implements ISearchCallback {
            public IBinder mRemote;

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            public IBinder asBinder() {
                return this.mRemote;
            }

            public String getInterfaceDescriptor() {
                return ISearchCallback.DESCRIPTOR;
            }

            public void onSearchSubmitted(String str, IOnDoneCallback iOnDoneCallback) {
                Parcel obtain = Parcel.obtain();
                try {
                    AnonymousClass000.A19(iOnDoneCallback, obtain, ISearchCallback.DESCRIPTOR, str);
                    AnonymousClass001.A1O(this.mRemote, obtain);
                } finally {
                    obtain.recycle();
                }
            }

            public void onSearchTextChanged(String str, IOnDoneCallback iOnDoneCallback) {
                Parcel obtain = Parcel.obtain();
                try {
                    AnonymousClass000.A19(iOnDoneCallback, obtain, ISearchCallback.DESCRIPTOR, str);
                    AnonymousClass001.A1N(this.mRemote, obtain);
                } finally {
                    obtain.recycle();
                }
            }
        }

        public static ISearchCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(ISearchCallback.DESCRIPTOR);
            if (queryLocalInterface == null || !(queryLocalInterface instanceof ISearchCallback)) {
                return new Proxy(iBinder);
            }
            return (ISearchCallback) queryLocalInterface;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i >= 1) {
                if (i <= 16777215) {
                    parcel.enforceInterface(ISearchCallback.DESCRIPTOR);
                    if (i == 2) {
                        onSearchTextChanged(parcel.readString(), AnonymousClass000.A0a(parcel));
                        return true;
                    } else if (i == 3) {
                        onSearchSubmitted(parcel.readString(), AnonymousClass000.A0a(parcel));
                        return true;
                    }
                } else if (i == 1598968902) {
                    parcel2.writeString(ISearchCallback.DESCRIPTOR);
                    return true;
                }
            }
            return super.onTransact(i, parcel, parcel2, i2);
        }

        public Stub() {
            attachInterface(this, ISearchCallback.DESCRIPTOR);
        }
    }

    void onSearchSubmitted(String str, IOnDoneCallback iOnDoneCallback);

    void onSearchTextChanged(String str, IOnDoneCallback iOnDoneCallback);
}
