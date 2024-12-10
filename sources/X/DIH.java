package X;

import android.os.Parcel;
import com.google.android.gms.tasks.TaskCompletionSource;

public final /* synthetic */ class DIH implements E5D {
    public final /* synthetic */ C23039BaG A00;

    public /* synthetic */ DIH(C23039BaG baG) {
        this.A00 = baG;
    }

    /* JADX INFO: finally extract failed */
    public final void accept(Object obj, Object obj2) {
        TaskCompletionSource taskCompletionSource = (TaskCompletionSource) obj2;
        C26392Cys cys = (C26392Cys) ((C26157CtR) obj).A04();
        C23039BaG baG = this.A00;
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(cys.A01);
        obtain.writeInt(1);
        baG.writeToParcel(obtain, 0);
        try {
            cys.A00.transact(1, obtain, (Parcel) null, 1);
            obtain.recycle();
            taskCompletionSource.setResult((Object) null);
        } catch (Throwable th) {
            obtain.recycle();
            throw th;
        }
    }
}
