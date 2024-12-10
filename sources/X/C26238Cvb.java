package X;

import android.os.HandlerThread;
import android.util.Log;
import android.util.SparseArray;
import com.facebook.profilo.logger.BufferLogger;
import com.facebook.profilo.mmapbuf.core.MmapBufferManager;
import java.io.File;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* renamed from: X.Cvb  reason: case insensitive filesystem */
public final class C26238Cvb {
    public static final ThreadLocal A09 = new C27244DaO();
    public static volatile C26238Cvb A0A;
    public BG5 A00;
    public final SparseArray A01;
    public final MmapBufferManager A02;
    public final File A03;
    public final AtomicInteger A04 = BE7.A0v();
    public final AtomicReference A05;
    public final AtomicReferenceArray A06 = new AtomicReferenceArray(4);
    public final DFA A07;
    public final E9D A08;

    public C26238Cvb(SparseArray sparseArray, CNR cnr, DFA dfa, E9D e9d, MmapBufferManager mmapBufferManager, File file) {
        this.A01 = sparseArray;
        this.A05 = new AtomicReference(cnr);
        this.A02 = mmapBufferManager;
        this.A03 = file;
        this.A08 = e9d;
        this.A07 = dfa;
    }

    public static C26552D3s A00(C26238Cvb cvb, int i, long j) {
        if (cvb.A04.get() != 0) {
            int i2 = 0;
            do {
                C26552D3s d3s = (C26552D3s) cvb.A06.get(i2);
                if (!(d3s == null || (d3s.A01 & i) == 0)) {
                    long j2 = d3s.A05;
                    if (d3s.A0B == null && j2 == j) {
                        return d3s;
                    }
                }
                i2++;
            } while (i2 < 4);
        }
        return null;
    }

    public static void A03(C26238Cvb cvb, int i, int i2, int i3, long j) {
        C26552D3s A002 = A00(cvb, i, j);
        if (A002 != null) {
            cvb.A04(A002);
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("STOP PROFILO_TRACEID: ");
            BE9.A1H(C25380Ceg.A00(A002.A06), "Profilo/TraceControl", A10);
            synchronized (cvb) {
                A02(cvb);
                if (i2 != 0) {
                    BufferLogger.writeStandardEntry(A002.A09, 6, 61, 0, 0, 0, 0, A002.A06);
                    cvb.A00.A02(A002);
                } else {
                    BufferLogger.writeStandardEntry(A002.A09, 6, 37, 0, 0, 0, 0, A002.A06);
                    cvb.A00.A01(new C26552D3s(A002, i3));
                }
            }
        }
    }

    private void A04(C26552D3s d3s) {
        AtomicInteger atomicInteger;
        int i;
        int i2 = 0;
        while (!C24565C9m.A00(d3s, (Object) null, this.A06, i2)) {
            i2++;
            if (i2 >= 4) {
                Log.w("Profilo/TraceControl", "Could not reset Trace Context to null");
                return;
            }
        }
        do {
            atomicInteger = this.A04;
            i = atomicInteger.get();
        } while (!atomicInteger.compareAndSet(i, (1 << i2) ^ i));
    }

    public static C26552D3s A01(C26238Cvb cvb, long j) {
        if (cvb.A04.get() != 0) {
            int i = 0;
            do {
                C26552D3s d3s = (C26552D3s) cvb.A06.get(i);
                if (d3s != null && d3s.A06 == j) {
                    return d3s;
                }
                i++;
            } while (i < 4);
        }
        return null;
    }

    /* JADX WARNING: type inference failed for: r2v3, types: [X.CML, java.lang.Object] */
    public static void A02(C26238Cvb cvb) {
        CML cml;
        HandlerThread handlerThread;
        if (cvb.A00 == null) {
            DFA dfa = cvb.A07;
            synchronized (CML.class) {
                CML cml2 = CML.A01;
                cml = cml2;
                if (cml2 == null) {
                    ? obj = new Object();
                    CML.A01 = obj;
                    cml = obj;
                }
            }
            synchronized (cml) {
                if (cml.A00 == null) {
                    HandlerThread handlerThread2 = new HandlerThread("Prflo:TraceCtl");
                    cml.A00 = handlerThread2;
                    handlerThread2.start();
                }
                handlerThread = cml.A00;
            }
            cvb.A00 = new BG5(handlerThread.getLooper(), dfa, cvb.A08);
        }
    }

    public void A05(long j, int i) {
        C26552D3s A012 = A01(this, j);
        if (A012 != null && A012.A06 == j) {
            A04(A012);
            synchronized (this) {
                A02(this);
                this.A00.A01(new C26552D3s(A012, i));
            }
        }
    }
}
