package X;

import android.content.Context;
import android.os.SystemClock;
import android.util.Log;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* renamed from: X.BLf  reason: case insensitive filesystem */
public abstract class C22702BLf extends C24494C6m {
    public final Executor A00;
    public volatile C27078DTd A01;
    public volatile C27078DTd A02;

    public Object A06() {
        C22701BLe bLe = (C22701BLe) this;
        int i = 0;
        for (C25260Cbz cbz : bLe.A00) {
            if (cbz instanceof BZB) {
                EA7 ea7 = ((BZB) cbz).A01;
                if (ea7 != null && ea7.CSx(bLe)) {
                    i++;
                }
            } else {
                throw C17880vN.A0y();
            }
        }
        try {
            bLe.A01.tryAcquire(i, 5, TimeUnit.SECONDS);
            return null;
        } catch (InterruptedException e) {
            Log.i("GACSignInLoader", "Unexpected InterruptedException", e);
            AnonymousClass8BS.A0x();
            return null;
        }
    }

    public void A07() {
    }

    public void A0B(Object obj) {
    }

    public C22702BLf(Context context) {
        Executor executor = C27078DTd.A08;
        this.A06 = false;
        this.A02 = false;
        this.A05 = true;
        this.A03 = false;
        this.A04 = false;
        this.A00 = context.getApplicationContext();
        this.A00 = executor;
    }

    public void A08() {
        if (this.A01 == null && this.A02 != null) {
            C27078DTd dTd = this.A02;
            Executor executor = this.A00;
            if (dTd.A05 != AnonymousClass00R.A00) {
                int intValue = dTd.A05.intValue();
                if (intValue == 1) {
                    throw AnonymousClass000.A0n("Cannot execute task: the task is already running.");
                } else if (intValue != 2) {
                    throw AnonymousClass000.A0n("We should never reach this state");
                } else {
                    throw AnonymousClass000.A0n("Cannot execute task: the task has already been executed (a task can be executed only once)");
                }
            } else {
                dTd.A05 = AnonymousClass00R.A01;
                executor.execute(dTd.A01);
            }
        }
    }

    @Deprecated
    public void A05(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.A05(str, fileDescriptor, printWriter, strArr);
        if (this.A02 != null) {
            printWriter.print(str);
            printWriter.print("mTask=");
            printWriter.print(this.A02);
            printWriter.print(" waiting=");
            printWriter.println(false);
        }
        if (this.A01 != null) {
            printWriter.print(str);
            printWriter.print("mCancellingTask=");
            printWriter.print(this.A01);
            printWriter.print(" waiting=");
            printWriter.println(false);
        }
    }

    public void A09() {
        A00();
        this.A02 = new C27078DTd(this);
        A08();
    }

    public void A0A(C27078DTd dTd, Object obj) {
        A0B(obj);
        if (this.A01 == dTd) {
            if (this.A04) {
                if (this.A06) {
                    A09();
                } else {
                    this.A03 = true;
                }
            }
            SystemClock.uptimeMillis();
            this.A01 = null;
            A08();
        }
    }
}
