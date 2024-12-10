package X;

import bolts.Task;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.CkB  reason: case insensitive filesystem */
public final class C25680CkB {
    public final C25963CpV A00;
    public final CV5 A01;
    public final C25762ClX A02 = new C25762ClX();
    public final C25052CVg A03;
    public final Executor A04;
    public final C24662CEc A05;
    public final Executor A06;

    public C25680CkB(C25963CpV cpV, CV5 cv5, C24662CEc cEc, C25052CVg cVg, Executor executor, Executor executor2) {
        C18070vi.A0d(cpV, 1);
        this.A00 = cpV;
        this.A03 = cVg;
        this.A01 = cv5;
        this.A06 = executor;
        this.A04 = executor2;
        this.A05 = cEc;
    }

    private final Task A00(C28573E8e e8e, AtomicBoolean atomicBoolean) {
        try {
            Task call = Task.call(new C27121DVh(this, atomicBoolean, e8e, 0), this.A06);
            C18070vi.A0b(call);
            return call;
        } catch (Exception e) {
            Object[] A1a = AnonymousClass3MW.A1a();
            A1a[0] = e8e.Bb4();
            C26265CwA.A07("Failed to schedule disk-cache read for %s", e, A1a);
            Task forError = Task.forError(e);
            C18070vi.A0b(forError);
            return forError;
        }
    }

    public final Task A01(C28573E8e e8e, AtomicBoolean atomicBoolean) {
        Task task;
        if (!C26212Cuq.A04()) {
            DRJ A012 = this.A02.A01(e8e);
            if (A012 == null) {
                return A00(e8e, atomicBoolean);
            }
            C26265CwA.A02(C25680CkB.class, e8e.Bb4(), "Found image for %s in staging area");
            Task forResult = Task.forResult(A012);
            C18070vi.A0X(forResult);
            return forResult;
        }
        C26212Cuq.A03("BufferedDiskCache#get");
        try {
            DRJ A013 = this.A02.A01(e8e);
            if (A013 != null) {
                C26265CwA.A02(C25680CkB.class, e8e.Bb4(), "Found image for %s in staging area");
                task = Task.forResult(A013);
                C18070vi.A0X(task);
            } else {
                task = A00(e8e, atomicBoolean);
            }
            return task;
        } finally {
            C26212Cuq.A01();
        }
    }
}
