package X;

import android.os.Parcel;
import com.google.android.gms.tasks.TaskCompletionSource;

public final /* synthetic */ class DII implements E5D {
    public final /* synthetic */ BZ2 A00;

    public /* synthetic */ DII(BZ2 bz2) {
        this.A00 = bz2;
    }

    public final void accept(Object obj, Object obj2) {
        C26386Cym cym = (C26386Cym) ((C26157CtR) obj).A04();
        C23235Bdl bdl = new C23235Bdl((TaskCompletionSource) obj2);
        Parcel obtain = Parcel.obtain();
        BE9.A15(bdl, obtain, "com.google.android.gms.auth.api.phone.internal.ISmsRetrieverApiService");
        Parcel obtain2 = Parcel.obtain();
        try {
            AnonymousClass000.A18(cym.A00, obtain, obtain2, 1);
        } finally {
            obtain.recycle();
            obtain2.recycle();
        }
    }
}
