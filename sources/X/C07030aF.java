package X;

import android.content.Context;
import java.util.concurrent.Callable;

/* renamed from: X.0aF  reason: invalid class name and case insensitive filesystem */
public final class C07030aF implements Callable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ Context A02;
    public final /* synthetic */ AnonymousClass0sU A03;
    public final /* synthetic */ C04220Mi A04;
    public final /* synthetic */ Object A05;
    public final /* synthetic */ Object A06;

    public C07030aF(Context context, AnonymousClass0sU r2, C04220Mi r3, Object obj, Object obj2, int i, long j) {
        this.A04 = r3;
        this.A03 = r2;
        this.A01 = j;
        this.A06 = obj;
        this.A05 = obj2;
        this.A02 = context;
        this.A00 = i;
    }

    public /* bridge */ /* synthetic */ Object call() {
        C04220Mi r5 = this.A04;
        if (r5 != null) {
            AnonymousClass0sU r4 = this.A03;
            if (AnonymousClass0OS.A01(r4, r5, this.A01)) {
                return new C04220Mi(r4, r5.A01, this.A06, r5.A03);
            }
        }
        AnonymousClass0OS r3 = C04220Mi.A04;
        return r3.A04(r3.A02(this.A02, r5, this.A05, this.A00), this.A03, this.A06, this.A01);
    }
}
