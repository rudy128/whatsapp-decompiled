package X;

import com.google.android.gms.tasks.TaskCompletionSource;

/* renamed from: X.Bg3  reason: case insensitive filesystem */
public final class C23376Bg3 extends C23378Bg5 {
    public final TaskCompletionSource A00;
    public final E2F A01;

    public final void CTJ(C23208Bd3 bd3) {
        C24601CAx.A00(bd3.A00, this.A00, (Object) null);
    }

    /* JADX WARNING: type inference failed for: r0v5, types: [com.google.android.gms.tasks.Continuation, java.lang.Object] */
    public final void zzc() {
        DKH dkh = (DKH) this.A01;
        C22995BYv bYv = dkh.A00;
        C26901DIi dIi = dkh.A01;
        C197629x0 r1 = dkh.A02;
        dIi.A00 = false;
        bYv.A04(C25934Coz.A00(r1, "LocationCallback")).continueWith(new Object());
    }

    public C23376Bg3(E2F e2f, TaskCompletionSource taskCompletionSource) {
        this.A00 = taskCompletionSource;
        this.A01 = e2f;
    }
}
