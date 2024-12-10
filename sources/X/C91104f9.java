package X;

import android.view.Menu;
import android.view.MenuItem;
import java.util.Arrays;

/* renamed from: X.4f9  reason: invalid class name and case insensitive filesystem */
public final class C91104f9 implements AnonymousClass02H {
    public AnonymousClass02B A00;
    public final AnonymousClass1FY A01;
    public final C24521Kq A02;
    public final C18030ve A03;
    public final C18000vb A04;
    public final C18090vk A05;
    public final C18090vk A06;
    public final C18090vk A07;
    public final C18090vk A08;

    public boolean Bks(MenuItem menuItem, AnonymousClass02B r5) {
        C18090vk r0;
        if (AnonymousClass3MY.A01(menuItem, 1) == 2131432538) {
            r0 = this.A06;
        } else if (menuItem.getItemId() != 2131432534) {
            return false;
        } else {
            r0 = this.A07;
        }
        r0.invoke();
        return true;
    }

    public boolean BqR(Menu menu, AnonymousClass02B r5) {
        C18070vi.A0d(menu, 1);
        C40811vJ.A0B(this.A03);
        AnonymousClass3MX.A07(menu, 2131432538, 2131888327).setIcon(2131231847).setShowAsAction(2);
        return true;
    }

    public boolean C1U(Menu menu, AnonymousClass02B r7) {
        C18070vi.A0d(r7, 0);
        String format = String.format(this.A04.A0N(), "%d", Arrays.copyOf(new Object[]{this.A08.invoke()}, 1));
        C18070vi.A0X(format);
        r7.A0B(format);
        return true;
    }

    public void BrJ(AnonymousClass02B r2) {
        this.A05.invoke();
    }

    public C91104f9(AnonymousClass1FY r1, C24521Kq r2, C18000vb r3, C18030ve r4, C18090vk r5, C18090vk r6, C18090vk r7, C18090vk r8) {
        C18070vi.A0o(r4, r3, r2);
        this.A03 = r4;
        this.A04 = r3;
        this.A02 = r2;
        this.A01 = r1;
        this.A08 = r5;
        this.A06 = r6;
        this.A05 = r7;
        this.A07 = r8;
    }
}
