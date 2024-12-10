package androidx.car.app;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass0RM;
import android.graphics.Rect;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public interface ISurfaceCallback extends IInterface {
    public static final String DESCRIPTOR = "androidx.car.app.ISurfaceCallback";

    public class Default implements ISurfaceCallback {
        public IBinder asBinder() {
            return null;
        }

        public void onClick(float f, float f2) {
        }

        public void onFling(float f, float f2) {
        }

        public void onScale(float f, float f2, float f3) {
        }

        public void onScroll(float f, float f2) {
        }

        public void onStableAreaChanged(Rect rect, IOnDoneCallback iOnDoneCallback) {
        }

        public void onSurfaceAvailable(AnonymousClass0RM r1, IOnDoneCallback iOnDoneCallback) {
        }

        public void onSurfaceDestroyed(AnonymousClass0RM r1, IOnDoneCallback iOnDoneCallback) {
        }

        public void onVisibleAreaChanged(Rect rect, IOnDoneCallback iOnDoneCallback) {
        }
    }

    public abstract class Stub extends Binder implements ISurfaceCallback {
        public static final int TRANSACTION_onClick = 9;
        public static final int TRANSACTION_onFling = 7;
        public static final int TRANSACTION_onScale = 8;
        public static final int TRANSACTION_onScroll = 6;
        public static final int TRANSACTION_onStableAreaChanged = 4;
        public static final int TRANSACTION_onSurfaceAvailable = 2;
        public static final int TRANSACTION_onSurfaceDestroyed = 5;
        public static final int TRANSACTION_onVisibleAreaChanged = 3;

        public IBinder asBinder() {
            return this;
        }

        public class Proxy implements ISurfaceCallback {
            public IBinder mRemote;

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            public IBinder asBinder() {
                return this.mRemote;
            }

            public String getInterfaceDescriptor() {
                return ISurfaceCallback.DESCRIPTOR;
            }

            public void onClick(float f, float f2) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(ISurfaceCallback.DESCRIPTOR);
                    obtain.writeFloat(f);
                    obtain.writeFloat(f2);
                    this.mRemote.transact(9, obtain, (Parcel) null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            public void onFling(float f, float f2) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(ISurfaceCallback.DESCRIPTOR);
                    obtain.writeFloat(f);
                    obtain.writeFloat(f2);
                    this.mRemote.transact(7, obtain, (Parcel) null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            public void onScale(float f, float f2, float f3) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(ISurfaceCallback.DESCRIPTOR);
                    obtain.writeFloat(f);
                    obtain.writeFloat(f2);
                    obtain.writeFloat(f3);
                    this.mRemote.transact(8, obtain, (Parcel) null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            public void onScroll(float f, float f2) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(ISurfaceCallback.DESCRIPTOR);
                    obtain.writeFloat(f);
                    obtain.writeFloat(f2);
                    this.mRemote.transact(6, obtain, (Parcel) null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            public void onStableAreaChanged(Rect rect, IOnDoneCallback iOnDoneCallback) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(ISurfaceCallback.DESCRIPTOR);
                    if (rect != null) {
                        obtain.writeInt(1);
                        rect.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongInterface(iOnDoneCallback);
                    this.mRemote.transact(4, obtain, (Parcel) null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            public void onSurfaceAvailable(AnonymousClass0RM r4, IOnDoneCallback iOnDoneCallback) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(ISurfaceCallback.DESCRIPTOR);
                    if (r4 != null) {
                        obtain.writeInt(1);
                        r4.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongInterface(iOnDoneCallback);
                    AnonymousClass001.A1N(this.mRemote, obtain);
                } finally {
                    obtain.recycle();
                }
            }

            public void onSurfaceDestroyed(AnonymousClass0RM r6, IOnDoneCallback iOnDoneCallback) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(ISurfaceCallback.DESCRIPTOR);
                    if (r6 != null) {
                        obtain.writeInt(1);
                        r6.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongInterface(iOnDoneCallback);
                    this.mRemote.transact(5, obtain, (Parcel) null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            public void onVisibleAreaChanged(Rect rect, IOnDoneCallback iOnDoneCallback) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(ISurfaceCallback.DESCRIPTOR);
                    if (rect != null) {
                        obtain.writeInt(1);
                        rect.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongInterface(iOnDoneCallback);
                    AnonymousClass001.A1O(this.mRemote, obtain);
                } finally {
                    obtain.recycle();
                }
            }
        }

        public static ISurfaceCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(ISurfaceCallback.DESCRIPTOR);
            if (queryLocalInterface == null || !(queryLocalInterface instanceof ISurfaceCallback)) {
                return new Proxy(iBinder);
            }
            return (ISurfaceCallback) queryLocalInterface;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i >= 1) {
                if (i <= 16777215) {
                    parcel.enforceInterface(ISurfaceCallback.DESCRIPTOR);
                    switch (i) {
                        case 2:
                            onSurfaceAvailable((AnonymousClass0RM) AnonymousClass001.A19(parcel, AnonymousClass0RM.CREATOR), AnonymousClass000.A0a(parcel));
                            return true;
                        case 3:
                            onVisibleAreaChanged((Rect) AnonymousClass001.A19(parcel, Rect.CREATOR), AnonymousClass000.A0a(parcel));
                            return true;
                        case 4:
                            onStableAreaChanged((Rect) AnonymousClass001.A19(parcel, Rect.CREATOR), AnonymousClass000.A0a(parcel));
                            return true;
                        case 5:
                            onSurfaceDestroyed((AnonymousClass0RM) AnonymousClass001.A19(parcel, AnonymousClass0RM.CREATOR), AnonymousClass000.A0a(parcel));
                            return true;
                        case 6:
                            onScroll(parcel.readFloat(), parcel.readFloat());
                            return true;
                        case 7:
                            onFling(parcel.readFloat(), parcel.readFloat());
                            return true;
                        case 8:
                            onScale(parcel.readFloat(), parcel.readFloat(), parcel.readFloat());
                            return true;
                        case 9:
                            onClick(parcel.readFloat(), parcel.readFloat());
                            return true;
                    }
                } else if (i == 1598968902) {
                    parcel2.writeString(ISurfaceCallback.DESCRIPTOR);
                    return true;
                }
            }
            return super.onTransact(i, parcel, parcel2, i2);
        }

        public Stub() {
            attachInterface(this, ISurfaceCallback.DESCRIPTOR);
        }
    }

    void onClick(float f, float f2);

    void onFling(float f, float f2);

    void onScale(float f, float f2, float f3);

    void onScroll(float f, float f2);

    void onStableAreaChanged(Rect rect, IOnDoneCallback iOnDoneCallback);

    void onSurfaceAvailable(AnonymousClass0RM r1, IOnDoneCallback iOnDoneCallback);

    void onSurfaceDestroyed(AnonymousClass0RM r1, IOnDoneCallback iOnDoneCallback);

    void onVisibleAreaChanged(Rect rect, IOnDoneCallback iOnDoneCallback);
}
