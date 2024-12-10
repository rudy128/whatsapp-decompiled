package X;

import com.whatsapp.jid.UserJid;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.9yv  reason: invalid class name and case insensitive filesystem */
public final class C198799yv {
    public AnonymousClass1DT A00;
    public AnonymousClass1DT A01;
    public AnonymousClass1DT A02;
    public AnonymousClass1DT A03;
    public AnonymousClass1DT A04;
    public AnonymousClass1DT A05;
    public AnonymousClass1DT A06;
    public AnonymousClass1DT A07;
    public AnonymousClass1DT A08;
    public AnonymousClass1DT A09;
    public AnonymousClass1DT A0A;
    public final AnonymousClass1KB A0B;
    public final C26911Ty A0C;
    public final C189889k1 A0D;
    public final A8S A0E;
    public final C167838hr A0F;
    public final C175278yS A0G;
    public final C20114A7x A0H;
    public final A8Q A0I;
    public final C167918hz A0J;
    public final UserJid A0K;
    public final B9L A0L = new C20999Acr(this, 0);
    public final B9L A0M = new C20999Acr(this, 1);
    public final AnonymousClass10I A0N;

    public static final Boolean A00(C198799yv r3, String str) {
        List A10;
        AnonymousClass1DT r0 = r3.A01;
        if (r0 == null || (A10 = AnonymousClass3MW.A10(r0)) == null) {
            return null;
        }
        Iterator it = A10.iterator();
        while (it.hasNext()) {
            C20287AEv aEv = AnonymousClass8BR.A0J(it).A01;
            if (C18070vi.A18(aEv.A0H, str)) {
                if (aEv.A05 != null) {
                    return AnonymousClass000.A0i();
                }
                return null;
            }
        }
        return null;
    }

    public C198799yv(AnonymousClass1KB r3, C26911Ty r4, C189889k1 r5, A8S a8s, C167838hr r7, C175278yS r8, C20114A7x a7x, A8Q a8q, C167918hz r11, UserJid userJid, AnonymousClass10I r13) {
        C18070vi.A0p(r3, r13, r5);
        C18070vi.A0d(a8s, 5);
        C18070vi.A0l(r8, a7x);
        AnonymousClass8BW.A1H(r4, a8q);
        this.A0K = userJid;
        this.A0B = r3;
        this.A0N = r13;
        this.A0D = r5;
        this.A0E = a8s;
        this.A0G = r8;
        this.A0H = a7x;
        this.A0J = r11;
        this.A0F = r7;
        this.A0C = r4;
        this.A0I = a8q;
    }
}
