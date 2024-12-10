package X;

import android.os.Parcel;
import com.google.android.gms.tasks.TaskCompletionSource;

public final /* synthetic */ class DIN implements E5D {
    public final C23083Bay A00;

    public DIN(C23083Bay bay) {
        this.A00 = bay;
    }

    public final void accept(Object obj, Object obj2) {
        C23083Bay bay = this.A00;
        C26157CtR ctR = (C26157CtR) obj;
        DIC dic = new DIC((TaskCompletionSource) obj2);
        ctR.A06();
        C23377Bg4 bg4 = new C23377Bg4();
        bg4.A00 = dic;
        C26397Cyx cyx = (C26397Cyx) ((ECI) ctR.A04());
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(cyx.A00);
        bay.writeToParcel(obtain, BE8.A1V(obtain) ? 1 : 0);
        obtain.writeStrongBinder(bg4.asBinder());
        obtain.writeString((String) null);
        cyx.A01(63, obtain);
    }
}
