package X;

import android.view.Menu;
import android.view.MenuItem;

/* renamed from: X.4h4  reason: invalid class name and case insensitive filesystem */
public final class C92294h4 implements C108185bH {
    public final AnonymousClass1DS A00;
    public final AnonymousClass1FU A01;
    public final C25811Ps A02;

    public void BqX(Menu menu) {
        C18070vi.A0d(menu, 0);
        MenuItem add = menu.add(0, 2131432528, 0, 2131886620);
        add.setIcon(2131233609);
        add.setShowAsAction(1);
    }

    public boolean Bze(MenuItem menuItem) {
        if (AnonymousClass3MY.A01(menuItem, 0) != 2131432528) {
            return false;
        }
        this.A02.A08(this.A01, AnonymousClass3MY.A0h(), 0);
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0018, code lost:
        if (r2 == X.C83014Da.A02) goto L_0x001a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean C1Y(android.view.Menu r6) {
        /*
            r5 = this;
            r4 = 0
            X.C18070vi.A0d(r6, r4)
            r0 = 2131432528(0x7f0b1450, float:1.8486816E38)
            android.view.MenuItem r3 = r6.findItem(r0)
            if (r3 == 0) goto L_0x001e
            X.1DS r0 = r5.A00
            if (r0 == 0) goto L_0x001a
            java.lang.Object r2 = r0.A06()
            X.4Da r1 = X.C83014Da.A02
            r0 = 0
            if (r2 != r1) goto L_0x001b
        L_0x001a:
            r0 = 1
        L_0x001b:
            r3.setVisible(r0)
        L_0x001e:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C92294h4.C1Y(android.view.Menu):boolean");
    }

    public C92294h4(AnonymousClass1DS r1, AnonymousClass1FU r2, C25811Ps r3) {
        C18070vi.A0j(r3, r2);
        this.A02 = r3;
        this.A01 = r2;
        this.A00 = r1;
    }
}
