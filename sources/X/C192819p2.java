package X;

import java.util.Set;
import java.util.Stack;

/* renamed from: X.9p2  reason: invalid class name and case insensitive filesystem */
public final class C192819p2 {
    public long A00 = System.currentTimeMillis();
    public boolean A01;
    public final C52452aw A02;
    public final C195649tg A03;
    public final String A04;
    public final Set A05 = C17880vN.A14();
    public final Stack A06 = new Stack();
    public final AnonymousClass11P A07;
    public final C192909pE A08;

    public final void A01(String str) {
        C18070vi.A0d(str, 0);
        if (str.equals(this.A03.A01)) {
            ((C195039sh) this.A06.peek()).A00 = AnonymousClass00R.A00;
        }
    }

    public final String A00() {
        Stack stack = this.A03.A08;
        if (stack.isEmpty()) {
            return null;
        }
        String str = (String) stack.peek();
        while (true) {
            Stack stack2 = this.A06;
            if (C18070vi.A18(((C195039sh) stack2.peek()).A01, str)) {
                return str;
            }
            stack2.pop();
        }
    }

    public C192819p2(AnonymousClass11P r3, C52452aw r4, C192909pE r5, C195649tg r6, String str) {
        C18070vi.A0j(r3, r4);
        this.A07 = r3;
        this.A02 = r4;
        this.A04 = str;
        this.A08 = r5;
        this.A03 = r6;
    }
}
