package X;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import java.util.Set;

/* renamed from: X.Bi8  reason: case insensitive filesystem */
public final class C23501Bi8 extends Bi9 implements EDW, EDX {
    public static final C22993BYp A07 = CIA.A00;
    public E5E A00;
    public EDR A01;
    public final Context A02;
    public final Handler A03;
    public final C22993BYp A04;
    public final CTL A05;
    public final Set A06;

    public C23501Bi8(Context context, Handler handler, CTL ctl) {
        C22993BYp bYp = A07;
        this.A02 = context;
        this.A03 = handler;
        this.A05 = ctl;
        this.A06 = ctl.A05;
        this.A04 = bYp;
    }

    public final void CSf(C23074Bap bap) {
        this.A03.post(new C27076DTa(bap, this, 45));
    }

    public final void onConnected(Bundle bundle) {
        this.A01.CSj(this);
    }

    public final void onConnectionFailed(C23203Bcx bcx) {
        this.A00.CSl(bcx);
    }

    public final void onConnectionSuspended(int i) {
        C26915DIw dIw = (C26915DIw) this.A00;
        C26910DIr dIr = (C26910DIr) dIw.A05.A09.get(dIw.A04);
        if (dIr == null) {
            return;
        }
        if (dIr.A02) {
            dIr.A0B(new C23203Bcx(17));
        } else {
            dIr.onConnectionSuspended(i);
        }
    }
}
