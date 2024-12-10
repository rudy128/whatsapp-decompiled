package X;

import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;

/* renamed from: X.Ckh  reason: case insensitive filesystem */
public abstract class C25711Ckh {
    public final int A00;

    public C25711Ckh(int i) {
        this.A00 = i;
    }

    public void A01(Status status) {
        if (this instanceof C23005BZf) {
            try {
                ((C23005BZf) this).A00.CIq(status);
            } catch (IllegalStateException e) {
                Log.w("ApiCallRunner", "Exception reporting failure", e);
            }
        } else if (this instanceof C23002BZc) {
            ((C23002BZc) this).A01.trySetException(C24602CAy.A00(status));
        } else {
            ((C23001BZb) this).A00.trySetException(new ApiException(status));
        }
    }

    public void A02(Exception exc) {
        TaskCompletionSource taskCompletionSource;
        if (this instanceof C23005BZf) {
            C23005BZf bZf = (C23005BZf) this;
            try {
                bZf.A00.CIq(new Status(10, AnonymousClass001.A1H(": ", exc.getLocalizedMessage(), AnonymousClass000.A11(C108955ca.A0x(exc)))));
            } catch (IllegalStateException e) {
                Log.w("ApiCallRunner", "Exception reporting failure", e);
            }
        } else {
            if (this instanceof C23002BZc) {
                taskCompletionSource = ((C23002BZc) this).A01;
            } else {
                taskCompletionSource = ((C23001BZb) this).A00;
            }
            taskCompletionSource.trySetException(exc);
        }
    }

    public static /* bridge */ /* synthetic */ Status A00(RemoteException remoteException) {
        StringBuilder A10 = AnonymousClass000.A10();
        C17900vP.A0a(remoteException, A10);
        A10.append(": ");
        return new Status(19, AnonymousClass000.A0y(remoteException.getLocalizedMessage(), A10));
    }
}
