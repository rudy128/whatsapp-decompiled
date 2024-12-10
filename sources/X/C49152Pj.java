package X;

import android.os.SystemClock;
import com.whatsapp.Main;
import com.whatsapp.util.Log;

/* renamed from: X.2Pj  reason: invalid class name and case insensitive filesystem */
public class C49152Pj extends A34 {
    public final /* synthetic */ Main A00;

    public C49152Pj(Main main) {
        this.A00 = main;
    }

    public void A0F() {
        AnonymousClass4Yv.A01(this.A00, 104);
    }

    public /* bridge */ /* synthetic */ Object A0G(Object[] objArr) {
        long j;
        Main main = this.A00;
        if (main.A05.A01) {
            j = 90000;
        } else {
            j = 45000;
        }
        int i = 0;
        while (main.A05.A02 && ((long) i) < j) {
            i += 200;
            SystemClock.sleep(200);
        }
        if (((long) i) < j || !main.A05.A02 || main.A05.A01) {
            return null;
        }
        ((AnonymousClass126) main.A0F.get()).A0N(3);
        return null;
    }

    public /* bridge */ /* synthetic */ void A0H(Object obj) {
        Main main = this.A00;
        AnonymousClass4Yv.A00(main, 104);
        Log.i("main/gotoActivity");
        Main.A0V(main);
    }
}
