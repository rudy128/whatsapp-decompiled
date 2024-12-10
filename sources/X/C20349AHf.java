package X;

import androidx.work.impl.WorkDatabase;
import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: X.AHf  reason: case insensitive filesystem */
public final /* synthetic */ class C20349AHf implements C22398B6b {
    public final /* synthetic */ AnonymousClass00I A00;
    public final /* synthetic */ WorkDatabase A01;
    public final /* synthetic */ List A02;
    public final /* synthetic */ Executor A03;

    public final void BtY(C193279pp r8, boolean z) {
        this.A03.execute(new C21368Aix(this.A02, this.A00, r8, this.A01, 0));
    }

    public /* synthetic */ C20349AHf(AnonymousClass00I r1, WorkDatabase workDatabase, List list, Executor executor) {
        this.A03 = executor;
        this.A02 = list;
        this.A00 = r1;
        this.A01 = workDatabase;
    }
}
