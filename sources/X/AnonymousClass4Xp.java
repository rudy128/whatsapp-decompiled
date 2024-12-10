package X;

import com.whatsapp.community.AggregateCommunityObserver$communityWaContact$1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.4Xp  reason: invalid class name */
public final class AnonymousClass4Xp {
    public final C34511kb A00;
    public final AnonymousClass1M9 A01;
    public final C23581Gv A02 = new C94164k9(this, 7);
    public final C24671Lf A03;
    public final C28741ap A04 = new C95414mC(this, 4);
    public final AnonymousClass1Q1 A05;
    public final C25231Nk A06 = new C95444mF(this, 3);
    public final AnonymousClass1NN A07;
    public final AnonymousClass3L6 A08 = new C96294nc(this, 0);
    public final C27141Uw A09;
    public final C25221Nj A0A = new C96314ne(this, 6);
    public final C25191Ng A0B;
    public final C34201k6 A0C = new AnonymousClass411(this, 0);
    public final C39501tB A0D;
    public final AnonymousClass1MG A0E;
    public final C83154Ea A0F = new AnonymousClass412(this, 0);
    public final C26211Rg A0G;
    public final C42211xo A0H;
    public final AnonymousClass1EC A0I;
    public final C18600wl A0J;
    public final AnonymousClass1OX A0K;
    public final EEF A0L;
    public final AnonymousClass1G4 A0M = C34071js.A00(C18460wS.A00);

    public final void A01(C107955at r6) {
        Object value;
        ArrayList A0l;
        C18070vi.A0d(r6, 0);
        AnonymousClass1G4 r3 = this.A0M;
        do {
            value = r3.getValue();
            List list = (List) value;
            A0l = C29431cG.A0l(r6, list);
            if (list.isEmpty()) {
                this.A03.registerObserver(this.A02);
                this.A0D.registerObserver(this.A0C);
                this.A07.registerObserver(this.A06);
                this.A09.A00(this.A08);
                this.A0B.registerObserver(this.A0A);
                this.A05.registerObserver(this.A04);
                this.A0G.registerObserver(this.A0F);
            }
        } while (!r3.BFK(value, A0l));
    }

    public final void A02(C107955at r6) {
        Object value;
        List A0x;
        C18070vi.A0d(r6, 0);
        AnonymousClass1G4 r3 = this.A0M;
        do {
            value = r3.getValue();
            A0x = C29431cG.A0x((Iterable) value, r6);
            if (A0x.isEmpty()) {
                this.A03.unregisterObserver(this.A02);
                this.A0D.unregisterObserver(this.A0C);
                this.A07.unregisterObserver(this.A06);
                this.A09.A01(this.A08);
                this.A0B.unregisterObserver(this.A0A);
                this.A05.unregisterObserver(this.A04);
                this.A0G.unregisterObserver(this.A0F);
            }
        } while (!r3.BFK(value, A0x));
    }

    public static Iterator A00(AnonymousClass4Xp r0) {
        return ((Iterable) r0.A0M.getValue()).iterator();
    }

    public AnonymousClass4Xp(C34511kb r5, AnonymousClass1M9 r6, C24671Lf r7, AnonymousClass1Q1 r8, AnonymousClass1NN r9, C27141Uw r10, C25191Ng r11, C39501tB r12, AnonymousClass1MG r13, C26211Rg r14, C42211xo r15, AnonymousClass1EC r16, C18600wl r17, AnonymousClass1OX r18) {
        C18070vi.A0w(r8, r6, r14, r13, r15);
        C18600wl r0 = r17;
        C18070vi.A0x(r5, r0, r7, r12, r9);
        AnonymousClass1OX r3 = r18;
        C18070vi.A0r(r10, r11, r3);
        this.A05 = r8;
        this.A01 = r6;
        this.A0G = r14;
        this.A0E = r13;
        this.A0H = r15;
        this.A00 = r5;
        this.A0J = r0;
        this.A03 = r7;
        this.A0D = r12;
        this.A07 = r9;
        this.A09 = r10;
        this.A0B = r11;
        this.A0K = r3;
        this.A0I = r16;
        AggregateCommunityObserver$communityWaContact$1 aggregateCommunityObserver$communityWaContact$1 = new AggregateCommunityObserver$communityWaContact$1(this, (C30391dr) null);
        this.A0L = C30451dy.A01(AnonymousClass00R.A00, AnonymousClass1OR.A00, aggregateCommunityObserver$communityWaContact$1, r3);
    }
}
