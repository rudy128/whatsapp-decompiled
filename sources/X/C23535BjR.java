package X;

import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.List;

/* renamed from: X.BjR  reason: case insensitive filesystem */
public final class C23535BjR extends C27079DTe {
    public final /* synthetic */ TaskCompletionSource A00;
    public final /* synthetic */ C26028Cqm A01;
    public final /* synthetic */ C27079DTe A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C23535BjR(TaskCompletionSource taskCompletionSource, TaskCompletionSource taskCompletionSource2, C26028Cqm cqm, C27079DTe dTe) {
        super(taskCompletionSource);
        this.A00 = taskCompletionSource2;
        this.A02 = dTe;
        this.A01 = cqm;
    }

    public final void b() {
        C26028Cqm cqm = this.A01;
        synchronized (cqm.A08) {
            TaskCompletionSource taskCompletionSource = this.A00;
            cqm.A0C.add(taskCompletionSource);
            taskCompletionSource.zza.addOnCompleteListener(new C26946DKb(taskCompletionSource, cqm));
            if (cqm.A0D.getAndIncrement() > 0) {
                cqm.A06.A02("Already connected to the service.", BE6.A1Z());
            }
            C27079DTe dTe = this.A02;
            if (cqm.A01 == null && !cqm.A02) {
                C25764Cla cla = cqm.A06;
                cla.A02("Initiate binding to the service.", new Object[0]);
                List<C27079DTe> list = cqm.A0B;
                list.add(dTe);
                C26337Cxu cxu = new C26337Cxu(cqm);
                cqm.A00 = cxu;
                cqm.A02 = true;
                if (!cqm.A03.bindService(cqm.A04, cxu, 1)) {
                    cla.A02("Failed to bind to the service.", new Object[0]);
                    cqm.A02 = false;
                    for (C27079DTe a : list) {
                        a.a(new C27215DZq());
                    }
                    list.clear();
                }
            } else if (cqm.A02) {
                cqm.A06.A02("Waiting to bind to the service.", new Object[0]);
                cqm.A0B.add(dTe);
            } else {
                dTe.run();
            }
        }
    }
}
