package X;

import java.util.concurrent.TimeUnit;

/* renamed from: X.ALt  reason: case insensitive filesystem */
public final class C20456ALt implements C26181Rd {
    public static final long A0A = TimeUnit.SECONDS.toMillis(5);
    public AnonymousClass6LL A00;
    public Runnable A01;
    public C200710s A02;
    public final AnonymousClass11P A03;
    public final AnonymousClass10I A04;
    public final C30141dS A05;
    public final AnonymousClass00H A06;
    public final AnonymousClass00H A07;
    public final AnonymousClass00H A08;
    public final AnonymousClass00H A09;

    public /* synthetic */ void BvS() {
    }

    public /* synthetic */ void BvU() {
    }

    public /* synthetic */ void BvV() {
    }

    public final void A00() {
        C18070vi.A0d("XFamilyAutoCrosspostManager/scheduleSendAutoCrosspostStatus started scheduling auto crosspost task", 0);
        Runnable runnable = this.A01;
        if (runnable != null) {
            this.A04.CEz(runnable);
        }
        this.A01 = this.A04.CGv(new C21429Ajw(this, 12), A0A);
    }

    public void BvR() {
        this.A02.execute(new C21429Ajw(this, 11));
    }

    public void BvT() {
        this.A02.execute(new C21429Ajw(this, 10));
    }

    public C20456ALt(AnonymousClass11P r2, AnonymousClass10I r3, C30141dS r4, AnonymousClass00H r5, AnonymousClass00H r6, AnonymousClass00H r7, AnonymousClass00H r8) {
        C18070vi.A0w(r2, r3, r4, r5, r6);
        C18070vi.A0l(r7, r8);
        this.A03 = r2;
        this.A04 = r3;
        this.A05 = r4;
        this.A06 = r5;
        this.A07 = r6;
        this.A09 = r7;
        this.A08 = r8;
        this.A02 = C200710s.A00(r3);
    }
}
