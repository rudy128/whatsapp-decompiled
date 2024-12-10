package X;

import android.app.Activity;
import android.os.Bundle;
import android.view.ViewGroup;
import androidx.lifecycle.OnLifecycleEvent;

/* renamed from: X.AGj  reason: case insensitive filesystem */
public final class C20327AGj implements C218317o {
    public C24000Bth A00;
    public final E45 A01;

    public C20327AGj(ViewGroup viewGroup, E45 e45, D44 d44, C27091Ur r8) {
        C18070vi.A0d(viewGroup, 1);
        this.A01 = e45;
        Activity A05 = AnonymousClass3Ma.A05(viewGroup);
        C18070vi.A0z(A05, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
        AnonymousClass1FB r3 = (AnonymousClass1FB) A05;
        r8.A04(r3);
        C25007CTh cTh = new C25007CTh();
        cTh.A00 = 8;
        cTh.A08 = false;
        cTh.A05 = false;
        cTh.A07 = false;
        cTh.A02 = d44;
        cTh.A06 = C28281Zt.A0B(r3);
        cTh.A04 = "whatsapp_smb_business_discovery";
        C24000Bth bth = new C24000Bth(r3, cTh);
        this.A00 = bth;
        bth.A0F((Bundle) null);
        r3.getLifecycle().A05(this);
        viewGroup.addView(this.A00);
    }

    @OnLifecycleEvent(C27581Wq.ON_CREATE)
    private final void onCreate() {
        C24000Bth bth = this.A00;
        bth.A0F((Bundle) null);
        bth.A0J(new DAB(this, 0));
    }

    @OnLifecycleEvent(C27581Wq.ON_DESTROY)
    private final void onDestroy() {
        double d = BIS.A0n;
    }

    @OnLifecycleEvent(C27581Wq.ON_PAUSE)
    private final void onPause() {
        double d = BIS.A0n;
    }

    @OnLifecycleEvent(C27581Wq.ON_RESUME)
    private final void onResume() {
        double d = BIS.A0n;
    }

    @OnLifecycleEvent(C27581Wq.ON_START)
    private final void onStart() {
        double d = BIS.A0n;
    }

    @OnLifecycleEvent(C27581Wq.ON_STOP)
    private final void onStop() {
        double d = BIS.A0n;
    }
}
