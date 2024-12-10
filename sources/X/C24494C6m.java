package X;

import android.content.Context;
import android.os.Looper;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* renamed from: X.C6m  reason: case insensitive filesystem */
public abstract class C24494C6m {
    public Context A00;
    public E0J A01;
    public boolean A02;
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public boolean A06;

    public void A00() {
        C22702BLf bLf = (C22702BLf) this;
        if (bLf.A02 != null) {
            if (!bLf.A06) {
                bLf.A03 = true;
            }
            if (bLf.A01 == null) {
                C27078DTd dTd = bLf.A02;
                dTd.A02.set(true);
                if (dTd.A01.cancel(false)) {
                    bLf.A01 = bLf.A02;
                    bLf.A07();
                }
            }
            bLf.A02 = null;
        }
    }

    public void A01() {
    }

    public void A02() {
        C22701BLe bLe = (C22701BLe) this;
        bLe.A01.drainPermits();
        bLe.A09();
    }

    public void A03() {
    }

    public void A04(Object obj) {
        E0J e0j = this.A01;
        if (e0j != null) {
            AnonymousClass1DS r2 = (AnonymousClass1DS) e0j;
            if (Looper.myLooper() == Looper.getMainLooper()) {
                r2.A0F(obj);
            } else {
                r2.A0E(obj);
            }
        }
    }

    public String toString() {
        StringBuilder A0t = BE6.A0t(64);
        C7M.A00(this, A0t);
        BE8.A1F(A0t, " id=");
        return AnonymousClass000.A0y("}", A0t);
    }

    @Deprecated
    public void A05(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.print(str);
        printWriter.print("mId=");
        printWriter.print(0);
        printWriter.print(" mListener=");
        printWriter.println(this.A01);
        if (this.A06 || this.A03 || this.A04) {
            printWriter.print(str);
            printWriter.print("mStarted=");
            printWriter.print(this.A06);
            printWriter.print(" mContentChanged=");
            printWriter.print(this.A03);
            printWriter.print(" mProcessingChange=");
            printWriter.println(this.A04);
        }
        if (this.A02 || this.A05) {
            printWriter.print(str);
            printWriter.print("mAbandoned=");
            printWriter.print(this.A02);
            printWriter.print(" mReset=");
            printWriter.println(this.A05);
        }
    }
}
