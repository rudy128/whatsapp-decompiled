package X;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: X.4aG  reason: invalid class name and case insensitive filesystem */
public final class C88634aG {
    public C29681ch A00;
    public Runnable A01;
    public Runnable A02;
    public final C25001Mm A03;
    public final C18030ve A04;
    public final AnonymousClass10I A05;
    public final Object A06 = C17880vN.A0p();
    public final Map A07 = C17880vN.A13();
    public final Set A08 = C17880vN.A14();
    public final C18100vl A09 = AnonymousClass1DF.A00(AnonymousClass00R.A0C, new C102945Ik(this));
    public final AnonymousClass11P A0A;

    public static final void A03(C88634aG r11, boolean z) {
        r11.A02 = null;
        Map map = r11.A07;
        if (!map.isEmpty()) {
            ArrayList A13 = AnonymousClass000.A13();
            long uptimeMillis = SystemClock.uptimeMillis();
            synchronized (r11.A06) {
                Iterator A15 = AnonymousClass000.A15(AnonymousClass1D7.A0F(map));
                while (A15.hasNext()) {
                    Map.Entry A16 = AnonymousClass000.A16(A15);
                    if (C17880vN.A05(A16.getValue()) < uptimeMillis) {
                        Set set = r11.A08;
                        set.add(A16.getKey());
                        A13.add(A16.getKey());
                        if (set.size() > 20) {
                            A02(r11, false);
                        }
                    }
                }
                if (z) {
                    A02(r11, false);
                    map.clear();
                } else {
                    AnonymousClass4Z0.A02(map, A13.toArray(new AnonymousClass206[0]));
                }
            }
            A00(r11);
        }
    }

    public final void A04(AnonymousClass21V r3) {
        C18070vi.A0d(r3, 0);
        if (r3.A0w()) {
            AnonymousClass1BI r1 = r3.A0v.A00;
            C18070vi.A0z(r1, "null cannot be cast to non-null type com.whatsapp.jid.NewsletterJid");
            C29681ch r12 = (C29681ch) r1;
            if (!C18070vi.A18(r12, this.A00)) {
                A03(this, true);
                this.A00 = r12;
            }
            synchronized (this.A06) {
                this.A08.add(r3);
            }
            A01(this);
        }
    }

    public static final void A00(C88634aG r5) {
        if (r5.A02 == null && !r5.A07.isEmpty()) {
            r5.A02 = r5.A05.CGv(new C21356Ail(r5, 24), C72453Mb.A0K(r5.A09));
        }
    }

    public static final void A01(C88634aG r4) {
        if (r4.A01 == null) {
            r4.A01 = r4.A05.CGv(new C21356Ail(r4, 23), 10000);
        }
    }

    public static final void A02(C88634aG r5, boolean z) {
        C29681ch r4;
        Set set = r5.A08;
        if (!set.isEmpty() && (r4 = r5.A00) != null) {
            C98494rF A002 = C98494rF.A00();
            if (z) {
                synchronized (r5.A06) {
                    A002.element = C29431cG.A0t(set);
                    set.clear();
                }
            } else {
                A002.element = C29431cG.A0t(set);
                set.clear();
            }
            r5.A05.CGF(new C21435Ak2(r5, r4, A002, 5));
        }
    }

    public C88634aG(C25001Mm r3, AnonymousClass11P r4, C18030ve r5, AnonymousClass10I r6) {
        C18070vi.A0s(r4, r5, r6, r3);
        this.A0A = r4;
        this.A04 = r5;
        this.A05 = r6;
        this.A03 = r3;
    }
}
