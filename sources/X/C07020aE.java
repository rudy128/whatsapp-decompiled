package X;

import android.content.Context;
import java.util.concurrent.Callable;

/* renamed from: X.0aE  reason: invalid class name and case insensitive filesystem */
public final class C07020aE implements Callable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ Context A02;
    public final /* synthetic */ C04220Mi A03;
    public final /* synthetic */ AnonymousClass0Jt A04;
    public final /* synthetic */ Object A05;

    public C07020aE(Context context, C04220Mi r2, AnonymousClass0Jt r3, Object obj, int i, long j) {
        this.A02 = context;
        this.A04 = r3;
        this.A05 = obj;
        this.A03 = r2;
        this.A00 = i;
        this.A01 = j;
    }

    public /* bridge */ /* synthetic */ Object call() {
        return C04220Mi.A04.A03(this.A02, this.A03, this.A04, this.A05, this.A00, this.A01);
    }
}
