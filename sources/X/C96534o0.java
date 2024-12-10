package X;

import android.os.SystemClock;

/* renamed from: X.4o0  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C96534o0 implements AnonymousClass5a2 {
    public final /* synthetic */ long A00;
    public final /* synthetic */ AnonymousClass3TA A01;

    public final void Bzv(C143887Fe r9, boolean z) {
        AnonymousClass3TA r7 = this.A01;
        long elapsedRealtime = 1000 - (SystemClock.elapsedRealtime() - this.A00);
        if (elapsedRealtime < 0) {
            elapsedRealtime = 0;
        }
        r7.A0N.A0K(new AnonymousClass7RF(r7, r9, 36, z), elapsedRealtime);
    }

    public /* synthetic */ C96534o0(AnonymousClass3TA r1, long j) {
        this.A01 = r1;
        this.A00 = j;
    }
}
