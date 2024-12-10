package X;

import android.view.MenuItem;

/* renamed from: X.0ZT  reason: invalid class name */
public class AnonymousClass0ZT implements Runnable {
    public final /* synthetic */ MenuItem A00;
    public final /* synthetic */ AnonymousClass0SI A01;
    public final /* synthetic */ AnonymousClass0HZ A02;
    public final /* synthetic */ C003301m A03;

    public AnonymousClass0ZT(MenuItem menuItem, AnonymousClass0SI r2, AnonymousClass0HZ r3, C003301m r4) {
        this.A01 = r2;
        this.A02 = r3;
        this.A00 = menuItem;
        this.A03 = r4;
    }

    public void run() {
        AnonymousClass0HZ r1 = this.A02;
        if (r1 != null) {
            AnonymousClass06A r2 = this.A01.A00;
            r2.A05 = true;
            r1.A01.A0a(false);
            r2.A05 = false;
        }
        MenuItem menuItem = this.A00;
        if (menuItem.isEnabled() && menuItem.hasSubMenu()) {
            this.A03.A0f(4, menuItem);
        }
    }
}
