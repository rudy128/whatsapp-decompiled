package androidx.work;

import X.A6J;
import X.A6Y;
import X.AnonymousClass000;
import X.AnonymousClass1YF;
import X.AnonymousClass8BX;
import X.C0L;
import X.C113975oM;
import X.C162168Jj;
import X.C162178Jk;
import X.C17880vN;
import X.C17960vV;
import X.C180129Lg;
import X.C18070vi;
import X.C194159rG;
import X.C20001A2q;
import X.C21471Akc;
import X.C62562rb;
import X.EEC;
import android.app.NotificationManager;
import android.content.Context;
import android.os.CancellationSignal;
import com.whatsapp.accountswitching.notifications.InactiveAccountNotificationDismissWorker;
import com.whatsapp.migration.export.encryption.ExportEncryptionManager$KeyPrefetchWorker;
import com.whatsapp.networkresources.NetworkResourceDownloadWorker;
import com.whatsapp.util.Log;
import java.io.IOException;

public abstract class Worker extends C20001A2q {
    public C113975oM A00;

    /* JADX WARNING: type inference failed for: r3v0, types: [X.EEC, java.lang.Object] */
    public EEC A07() {
        ? obj = new Object();
        this.A01.A09.execute(new C21471Akc((Object) this, (Object) obj, 17));
        return obj;
    }

    public C194159rG A0A() {
        throw AnonymousClass000.A0n("Expedited WorkRequests require a Worker to provide an implementation for \n `getForegroundInfo()`");
    }

    /* JADX WARNING: type inference failed for: r0v20, types: [X.9Lg, java.lang.Object] */
    public C180129Lg A0B() {
        if (this instanceof NetworkResourceDownloadWorker) {
            NetworkResourceDownloadWorker networkResourceDownloadWorker = (NetworkResourceDownloadWorker) this;
            String A0e = AnonymousClass8BX.A0e("resource_id", networkResourceDownloadWorker.A01.A01.A00);
            C17960vV.A07(A0e);
            try {
                if (networkResourceDownloadWorker.A00.A00(networkResourceDownloadWorker, C0L.valueOf(A0e)).A00().booleanValue()) {
                    return new C162178Jk();
                }
                return new C162168Jj();
            } catch (IOException unused) {
                return new C162168Jj();
            }
        } else if (this instanceof ExportEncryptionManager$KeyPrefetchWorker) {
            ExportEncryptionManager$KeyPrefetchWorker exportEncryptionManager$KeyPrefetchWorker = (ExportEncryptionManager$KeyPrefetchWorker) this;
            try {
                exportEncryptionManager$KeyPrefetchWorker.A01.A02(new CancellationSignal());
                return new C162178Jk();
            } catch (Exception e) {
                exportEncryptionManager$KeyPrefetchWorker.A00.A0E("xpm-export-prefetch-key", e.toString(), e);
                return new Object();
            }
        } else {
            InactiveAccountNotificationDismissWorker inactiveAccountNotificationDismissWorker = (InactiveAccountNotificationDismissWorker) this;
            A6Y a6y = inactiveAccountNotificationDismissWorker.A01.A01;
            int A02 = a6y.A02("inactiveAccountNotificationId", -1);
            String A0e2 = AnonymousClass8BX.A0e("inactiveAccountNotificationTag", a6y.A00);
            if (!(A02 == -1 || A0e2 == null || AnonymousClass1YF.A0T(A0e2))) {
                NotificationManager A07 = inactiveAccountNotificationDismissWorker.A02.A07();
                C17960vV.A07(A07);
                C18070vi.A0X(A07);
                A07.cancel(A0e2, A02);
                Log.i("InactiveAccountNotificationDismissWorker/doWork/call notification cancelled");
                String A0e3 = AnonymousClass8BX.A0e("inactiveAccountNotificationLid", a6y.A00);
                String A0e4 = AnonymousClass8BX.A0e("inactiveAccountNotificationCallId", a6y.A00);
                if (!(A0e3 == null || A0e3.length() == 0 || A0e4 == null || A0e4.length() == 0)) {
                    inactiveAccountNotificationDismissWorker.A00.A03(A0e3, A0e4);
                    A6J a6j = inactiveAccountNotificationDismissWorker.A01;
                    Log.i("InactiveAccountNotificationManager/showCallNotifications");
                    C62562rb A06 = C17880vN.A0I(a6j.A04).A06(A0e3, true, true);
                    if (A06 != null) {
                        A6J.A01(A06, a6j);
                    }
                }
            }
            return new C162178Jk();
        }
    }

    public Worker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
    }
}
