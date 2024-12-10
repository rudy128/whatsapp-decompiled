package X;

import android.os.Looper;
import android.os.Trace;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/* renamed from: X.DcA  reason: case insensitive filesystem */
public class C27338DcA extends FutureTask {
    public final String A00;
    public final ArrayList A01 = AnonymousClass000.A13();
    public final UUID A02;
    public final /* synthetic */ C25850CnB A03;

    public synchronized void A02(C6E c6e) {
        if (isDone()) {
            if (C24670CEk.A00) {
                StringBuilder A10 = AnonymousClass000.A10();
                A10.append("performing callback: ");
                Log.d("OpticFutureTask", AnonymousClass000.A0y(this.A00, A10));
            }
            try {
                A00(c6e, (Exception) null, get(), true);
            } catch (CancellationException e) {
                A00(c6e, e, (Object) null, false);
            } catch (InterruptedException | ExecutionException e2) {
                A00(c6e, e2, (Object) null, false);
            }
        } else {
            this.A01.add(c6e);
        }
        return;
    }

    public void done() {
        String str;
        UUID uuid = C25850CnB.A06;
        boolean z = C24670CEk.A00;
        if (z) {
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("completed task: ");
            A10.append(this.A00);
            if (isCancelled()) {
                str = " was cancelled";
            } else {
                str = "";
            }
            Log.d("OpticFutureTask", AnonymousClass000.A0y(str, A10));
        }
        synchronized (this) {
            if (z) {
                StringBuilder A102 = AnonymousClass000.A10();
                A102.append("performing callbacks: ");
                Log.d("OpticFutureTask", AnonymousClass000.A0y(this.A00, A102));
            }
            ArrayList arrayList = this.A01;
            ArrayList A103 = C17880vN.A10(arrayList);
            arrayList.clear();
            try {
                Object obj = get();
                Iterator it = A103.iterator();
                while (it.hasNext()) {
                    it.next();
                }
                A01((Exception) null, obj, A103, true);
            } catch (CancellationException e) {
                A01(e, (Object) null, A103, false);
            } catch (InterruptedException | ExecutionException e2) {
                if (A103.isEmpty()) {
                    Looper looper = this.A03.A04.getLooper();
                    C28111Yx.A02(looper);
                    if (looper.getThread() != Thread.currentThread()) {
                        C26175Cts.A00(e2);
                    }
                } else {
                    Iterator it2 = A103.iterator();
                    while (it2.hasNext()) {
                        it2.next();
                    }
                    A01(e2, (Object) null, A103, false);
                }
            }
        }
        synchronized (this) {
            Trace.endSection();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C27338DcA(C25850CnB cnB, String str, UUID uuid, Callable callable) {
        super(callable);
        this.A03 = cnB;
        C28111Yx.A03(uuid, AnonymousClass001.A1H("SessionId is null! Attempting to schedule task: ", str, AnonymousClass000.A10()));
        this.A02 = uuid;
        this.A00 = str;
    }

    private void A00(C6E c6e, Exception exc, Object obj, boolean z) {
        this.A03.A05(new AnonymousClass7RT(c6e, obj, exc, 1, z), this.A02);
    }

    private void A01(Exception exc, Object obj, ArrayList arrayList, boolean z) {
        this.A03.A05(new AnonymousClass7RT(arrayList, exc, obj, 0, z), this.A02);
    }

    public void run() {
        String str;
        UUID uuid = C25850CnB.A06;
        synchronized (this) {
            str = this.A00;
            Trace.beginSection(str);
        }
        if (C24670CEk.A00) {
            Log.d("OpticFutureTask", AnonymousClass001.A1H("run task: ", str, AnonymousClass000.A10()));
        }
        super.run();
    }

    public boolean runAndReset() {
        String str;
        String str2;
        UUID uuid = C25850CnB.A06;
        synchronized (this) {
            str = this.A00;
            Trace.beginSection(str);
        }
        boolean runAndReset = super.runAndReset();
        if (C24670CEk.A00) {
            StringBuilder A10 = AnonymousClass000.A10();
            if (runAndReset) {
                str2 = "runAndReset: ";
            } else {
                str2 = "runAndReset failed: ";
            }
            Log.d("OpticFutureTask", AnonymousClass001.A1H(str2, str, A10));
        }
        return runAndReset;
    }

    public boolean cancel(boolean z) {
        String str;
        boolean cancel = super.cancel(z);
        if (C24670CEk.A00) {
            StringBuilder A10 = AnonymousClass000.A10();
            if (cancel) {
                str = "cancelled: ";
            } else {
                str = "cancel failed: ";
            }
            A10.append(str);
            Log.d("OpticFutureTask", AnonymousClass000.A0y(this.A00, A10));
        }
        return cancel;
    }
}
