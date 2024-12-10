package X;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import java.util.Iterator;
import java.util.List;

public final class AME implements AnonymousClass191 {
    public final AnonymousClass118 A00;
    public final AnonymousClass00H A01;
    public final AnonymousClass00H A02;
    public final C18030ve A03;

    public /* synthetic */ void Blf() {
    }

    public void Blg() {
        if (C18020vd.A05(C18040vf.A01, this.A03, 12129)) {
            List list = C138846xn.A01;
            Iterator it = list.iterator();
            while (it.hasNext()) {
                String A0v = C17880vN.A0v(it);
                Intent launchIntentForPackage = this.A00.A00.getPackageManager().getLaunchIntentForPackage(A0v);
                C138846xn r1 = (C138846xn) this.A01.get();
                if (launchIntentForPackage != null) {
                    C18070vi.A0d(A0v, 0);
                    if (list.contains(A0v)) {
                        r1.A00.put(A0v, new C134286qL(launchIntentForPackage));
                    }
                } else {
                    r1.A00(A0v);
                }
            }
            if (AnonymousClass000.A1a(list)) {
                A5E.A00();
                Context context = this.A00.A00;
                AnonymousClass8Qm r2 = new AnonymousClass8Qm(new C20383AIw(this.A02, this.A01));
                Iterator it2 = r2.A01.iterator();
                while (it2.hasNext()) {
                    context.registerReceiver(r2, (IntentFilter) it2.next());
                }
            }
        }
    }

    public AME(AnonymousClass118 r1, C18030ve r2, AnonymousClass00H r3, AnonymousClass00H r4) {
        C18070vi.A0s(r2, r1, r3, r4);
        this.A03 = r2;
        this.A00 = r1;
        this.A02 = r3;
        this.A01 = r4;
    }

    public void Ba9() {
    }
}
