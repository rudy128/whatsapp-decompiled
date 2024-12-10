package X;

import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: X.1G8  reason: invalid class name */
public class AnonymousClass1G8 {
    public final Runnable A00;
    public final CopyOnWriteArrayList A01 = new CopyOnWriteArrayList();
    public final Map A02 = new HashMap();

    public void A00(Menu menu) {
        Iterator it = this.A01.iterator();
        while (it.hasNext()) {
            ((AnonymousClass1GW) it.next()).ByC(menu);
        }
    }

    public void A01(Menu menu) {
        Iterator it = this.A01.iterator();
        while (it.hasNext()) {
            ((AnonymousClass1GW) it.next()).C1X(menu);
        }
    }

    public void A02(Menu menu, MenuInflater menuInflater) {
        Iterator it = this.A01.iterator();
        while (it.hasNext()) {
            ((AnonymousClass1GW) it.next()).BqV(menu, menuInflater);
        }
    }

    public void A03(AnonymousClass1GW r2) {
        this.A01.add(r2);
        this.A00.run();
    }

    public void A04(AnonymousClass1GW r4) {
        this.A01.remove(r4);
        C52842bZ r2 = (C52842bZ) this.A02.remove(r4);
        if (r2 != null) {
            r2.A01.A06(r2.A00);
            r2.A00 = null;
        }
        this.A00.run();
    }

    public boolean A07(MenuItem menuItem) {
        Iterator it = this.A01.iterator();
        while (it.hasNext()) {
            if (((AnonymousClass1GW) it.next()).ByD(menuItem)) {
                return true;
            }
        }
        return false;
    }

    public AnonymousClass1G8(Runnable runnable) {
        this.A00 = runnable;
    }

    public void A05(AnonymousClass1GW r6, C23401Fx r7, AnonymousClass1F9 r8) {
        C23381Fv lifecycle = r8.getLifecycle();
        Map map = this.A02;
        C52842bZ r2 = (C52842bZ) map.remove(r6);
        if (r2 != null) {
            r2.A01.A06(r2.A00);
            r2.A00 = null;
        }
        map.put(r6, new C52842bZ(lifecycle, new C65012vh(r7, this, r6, 0)));
    }

    public void A06(AnonymousClass1GW r6, AnonymousClass1F9 r7) {
        A03(r6);
        C23381Fv lifecycle = r7.getLifecycle();
        Map map = this.A02;
        C52842bZ r2 = (C52842bZ) map.remove(r6);
        if (r2 != null) {
            r2.A01.A06(r2.A00);
            r2.A00 = null;
        }
        map.put(r6, new C52842bZ(lifecycle, new C91434fg(this, r6, 0)));
    }
}
