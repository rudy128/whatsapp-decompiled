package X;

import android.content.Context;
import android.os.SystemClock;
import androidx.work.CoroutineWorker;
import androidx.work.CoroutineWorker$startWork$1;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import androidx.work.impl.workers.ConstraintTrackingWorker;
import com.whatsapp.backup.google.workers.GoogleBackupWorker;
import com.whatsapp.backup.google.workers.GoogleEncryptedReUploadWorker;
import com.whatsapp.companiondevice.sync.HistorySyncCompanionWorker;
import com.whatsapp.util.Log;
import com.whatsapp.workmanager.ObservableWorkerFactory$LogExceptionsWorker;
import java.util.UUID;

/* renamed from: X.A2q  reason: case insensitive filesystem */
public abstract class C20001A2q {
    public Context A00;
    public WorkerParameters A01;
    public boolean A02;
    public volatile int A03 = -256;

    public static StringBuilder A04(GoogleBackupWorker googleBackupWorker) {
        StringBuilder sb = new StringBuilder();
        sb.append(GoogleBackupWorker.A00(googleBackupWorker));
        return sb;
    }

    /* JADX WARNING: type inference failed for: r6v0, types: [X.5oM, java.lang.Object] */
    public final C113975oM A06(C194159rG r9) {
        WorkerParameters workerParameters = this.A01;
        B4L b4l = workerParameters.A02;
        Context context = this.A00;
        UUID uuid = workerParameters.A08;
        C20345AHb aHb = (C20345AHb) b4l;
        ? obj = new Object();
        aHb.A02.BKq(new C21468AkZ(uuid, aHb, r9, context, obj, 1));
        return obj;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [X.EEC, java.lang.Object, X.DMs] */
    public EEC A07() {
        ? obj = new Object();
        obj.A06(AnonymousClass000.A0n("Expedited WorkRequests require a ListenableWorker to provide an implementation for `getForegroundInfoAsync()`"));
        return obj;
    }

    /* JADX WARNING: type inference failed for: r0v8, types: [X.5oM, java.lang.Object] */
    public EEC A08() {
        if (this instanceof ObservableWorkerFactory$LogExceptionsWorker) {
            ObservableWorkerFactory$LogExceptionsWorker observableWorkerFactory$LogExceptionsWorker = (ObservableWorkerFactory$LogExceptionsWorker) this;
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("ObservableWorkerFactory/Calling startWork() for ");
            C20001A2q a2q = observableWorkerFactory$LogExceptionsWorker.A00;
            C17890vO.A1A(A10, C17890vO.A0U(a2q));
            EEC A08 = a2q.A08();
            A08.BBG(new AnonymousClass3C3(A08, observableWorkerFactory$LogExceptionsWorker, 19, SystemClock.elapsedRealtime()), new C27134DVv(2));
            return A08;
        } else if (this instanceof HistorySyncCompanionWorker) {
            HistorySyncCompanionWorker historySyncCompanionWorker = (HistorySyncCompanionWorker) this;
            Log.i("HistorySyncCompanionWorker/ startWork");
            historySyncCompanionWorker.A02.CGF(new C98764rg((Object) historySyncCompanionWorker, 44));
            return historySyncCompanionWorker.A00;
        } else if (this instanceof ConstraintTrackingWorker) {
            ConstraintTrackingWorker constraintTrackingWorker = (ConstraintTrackingWorker) this;
            constraintTrackingWorker.A01.A09.execute(new C21466AkX((Object) constraintTrackingWorker, 25));
            C113975oM r0 = constraintTrackingWorker.A02;
            C18070vi.A0W(r0);
            return r0;
        } else if (this instanceof Worker) {
            Worker worker = (Worker) this;
            worker.A00 = new Object();
            worker.A01.A09.execute(new C21466AkX((Object) worker, 20));
            return worker.A00;
        } else {
            CoroutineWorker coroutineWorker = (CoroutineWorker) this;
            AnonymousClass3MX.A1Q(new CoroutineWorker$startWork$1(coroutineWorker, (C30391dr) null), AnonymousClass1OW.A02(AnonymousClass1OQ.A03(coroutineWorker.A01, coroutineWorker.A02)));
            return coroutineWorker.A00;
        }
    }

    public void A09() {
        if (this instanceof ObservableWorkerFactory$LogExceptionsWorker) {
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("ObservableWorkerFactory/Calling onStopped() for ");
            C20001A2q a2q = ((ObservableWorkerFactory$LogExceptionsWorker) this).A00;
            C17890vO.A1A(A10, C17890vO.A0U(a2q));
            a2q.A09();
        } else if (this instanceof GoogleEncryptedReUploadWorker) {
            GoogleEncryptedReUploadWorker googleEncryptedReUploadWorker = (GoogleEncryptedReUploadWorker) this;
            Log.i("google-encrypted-re-upload-worker/onStopped");
            googleEncryptedReUploadWorker.A0V.set(true);
            googleEncryptedReUploadWorker.A08.A0Q.getAndSet(false);
        } else if (this instanceof GoogleBackupWorker) {
            GoogleBackupWorker googleBackupWorker = (GoogleBackupWorker) this;
            StringBuilder A04 = A04(googleBackupWorker);
            A04.append("onStopped reason=");
            int i = -512;
            if (AnonymousClass112.A08()) {
                try {
                    i = googleBackupWorker.A05();
                } catch (IllegalStateException e) {
                    C108985cd.A1M("onStopped/getStopReason/", A04(googleBackupWorker), e);
                }
            }
            A04.append(i);
            A04.append(" attempt: sys=");
            A04.append(googleBackupWorker.A01.A00);
            A04.append(" user=");
            C17900vP.A0o(A04, googleBackupWorker.A04.A07().getInt("google_backup_retry_count", 0));
            googleBackupWorker.A0Y.set(true);
            AnonymousClass8gY r2 = googleBackupWorker.A0C;
            synchronized (r2.A07) {
                if (r2.A04 && !r2.A01.A09) {
                    Log.i("google-backup-worker-task-condition/refreshConditionsOnStopped sd card is not available");
                    r2.A04 = false;
                }
                if (r2.A03 && !r2.A01.A0T.get()) {
                    Log.i("google-backup-worker-task-condition/refreshConditionsOnStopped network is not available for backup");
                    r2.A03 = false;
                }
            }
            googleBackupWorker.A08.A0P.getAndSet(false);
        } else if (this instanceof CoroutineWorker) {
            ((CoroutineWorker) this).A00.cancel(false);
        }
    }

    public C20001A2q(Context context, WorkerParameters workerParameters) {
        if (context == null) {
            throw AnonymousClass000.A0k("Application Context is null");
        } else if (workerParameters != null) {
            this.A00 = context;
            this.A01 = workerParameters;
        } else {
            throw AnonymousClass000.A0k("WorkerParameters is null");
        }
    }

    public final int A05() {
        return this.A03;
    }
}
