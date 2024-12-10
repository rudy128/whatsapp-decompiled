package androidx.car.app;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass04E;
import X.AnonymousClass0RM;
import android.location.Location;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;

public interface IAppHost extends IInterface {
    public static final String DESCRIPTOR = "androidx.car.app.IAppHost";

    public class Default implements IAppHost {
        public IBinder asBinder() {
            return null;
        }

        public void dismissAlert(int i) {
        }

        public void invalidate() {
        }

        public AnonymousClass0RM openMicrophone(AnonymousClass0RM r2) {
            return null;
        }

        public void sendLocation(Location location) {
        }

        public void setSurfaceCallback(ISurfaceCallback iSurfaceCallback) {
        }

        public void showAlert(AnonymousClass0RM r1) {
        }

        public void showToast(CharSequence charSequence, int i) {
        }
    }

    public abstract class Stub extends Binder implements IAppHost {
        public static final int TRANSACTION_dismissAlert = 7;
        public static final int TRANSACTION_invalidate = 2;
        public static final int TRANSACTION_openMicrophone = 8;
        public static final int TRANSACTION_sendLocation = 5;
        public static final int TRANSACTION_setSurfaceCallback = 4;
        public static final int TRANSACTION_showAlert = 6;
        public static final int TRANSACTION_showToast = 3;

        public abstract IBinder asBinder();

        public class Proxy implements IAppHost {
            public IBinder mRemote;

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            public IBinder asBinder() {
                return this.mRemote;
            }

            public void dismissAlert(int i) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IAppHost.DESCRIPTOR);
                    obtain.writeInt(i);
                    AnonymousClass000.A18(this.mRemote, obtain, obtain2, 7);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public String getInterfaceDescriptor() {
                return IAppHost.DESCRIPTOR;
            }

            public void invalidate() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IAppHost.DESCRIPTOR);
                    AnonymousClass000.A18(this.mRemote, obtain, obtain2, 2);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public AnonymousClass0RM openMicrophone(AnonymousClass0RM r6) {
                Object obj;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    this.mRemote.transact(8, obtain, obtain2, AnonymousClass001.A1W(obtain, r6, IAppHost.DESCRIPTOR) ? 1 : 0);
                    obtain2.readException();
                    Parcelable.Creator creator = AnonymousClass0RM.CREATOR;
                    if (obtain2.readInt() != 0) {
                        obj = creator.createFromParcel(obtain2);
                    } else {
                        obj = null;
                    }
                    return (AnonymousClass0RM) obj;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void sendLocation(Location location) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IAppHost.DESCRIPTOR);
                    if (location != null) {
                        obtain.writeInt(1);
                        location.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.mRemote.transact(5, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void setSurfaceCallback(ISurfaceCallback iSurfaceCallback) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IAppHost.DESCRIPTOR);
                    obtain.writeStrongInterface(iSurfaceCallback);
                    AnonymousClass000.A18(this.mRemote, obtain, obtain2, 4);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void showAlert(AnonymousClass0RM r6) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    this.mRemote.transact(6, obtain, obtain2, AnonymousClass001.A1W(obtain, r6, IAppHost.DESCRIPTOR) ? 1 : 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void showToast(CharSequence charSequence, int i) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IAppHost.DESCRIPTOR);
                    if (charSequence != null) {
                        obtain.writeInt(1);
                        TextUtils.writeToParcel(charSequence, obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeInt(i);
                    this.mRemote.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public static IAppHost asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(IAppHost.DESCRIPTOR);
            if (queryLocalInterface == null || !(queryLocalInterface instanceof IAppHost)) {
                return new Proxy(iBinder);
            }
            return (IAppHost) queryLocalInterface;
        }

        public Stub() {
            throw AnonymousClass04E.createAndThrow();
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            throw AnonymousClass04E.createAndThrow();
        }
    }

    void dismissAlert(int i);

    void invalidate();

    AnonymousClass0RM openMicrophone(AnonymousClass0RM r1);

    void sendLocation(Location location);

    void setSurfaceCallback(ISurfaceCallback iSurfaceCallback);

    void showAlert(AnonymousClass0RM r1);

    void showToast(CharSequence charSequence, int i);
}
