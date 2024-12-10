package X;

import android.os.IBinder;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.apps.pixelmigrate.migrate.ios.appdatareader.IAppDataReaderService;

public class AJ1 implements IAppDataReaderService {
    public IBinder A00;

    public ParcelFileDescriptor BRf() {
        Object obj;
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.apps.pixelmigrate.migrate.ios.appdatareader.IAppDataReaderService");
            AnonymousClass000.A18(this.A00, obtain, obtain2, 1);
            Parcelable.Creator creator = ParcelFileDescriptor.CREATOR;
            if (obtain2.readInt() != 0) {
                obj = creator.createFromParcel(obtain2);
            } else {
                obj = null;
            }
            return (ParcelFileDescriptor) obj;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public IBinder asBinder() {
        return this.A00;
    }
}
