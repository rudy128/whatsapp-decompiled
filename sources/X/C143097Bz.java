package X;

import java.util.List;

/* renamed from: X.7Bz  reason: invalid class name and case insensitive filesystem */
public final class C143097Bz implements C26181Rd, C1603688e {
    public AnonymousClass6LN A00;
    public Runnable A01;
    public final AnonymousClass11P A02;
    public final AnonymousClass10I A03;
    public final AnonymousClass00H A04;
    public final AnonymousClass00H A05;
    public final AnonymousClass00H A06;
    public final AnonymousClass00H A07;
    public final AnonymousClass00H A08;

    public /* synthetic */ void BvS() {
    }

    public /* synthetic */ void BvU() {
    }

    public /* synthetic */ void BvV() {
    }

    public void BvR() {
        C18070vi.A0d("CrosspostUnsentStatusManager/registerXmppListener network connected", 0);
        C18070vi.A0d("CrosspostUnsentStatusManager/scheduleSendUnsentCrosspostSession started scheduling unsent crosspost sessions", 0);
        Runnable runnable = this.A01;
        if (runnable != null) {
            this.A03.CEz(runnable);
        }
        this.A01 = this.A03.CGv(new C146787Qp(this, 46), 3000);
    }

    public void BvT() {
        C18070vi.A0d("CrosspostUnsentStatusManager/registerXmppListener network disconnected", 0);
        Runnable runnable = this.A01;
        if (runnable != null) {
            C18070vi.A0d("CrosspostUnsentStatusManager/registerXmppListener cancelled", 0);
            this.A03.CEz(runnable);
        }
    }

    public void C9X(List list) {
        C146787Qp.A00(this.A03, this, 45);
    }

    public C143097Bz(AnonymousClass11P r1, AnonymousClass10I r2, AnonymousClass00H r3, AnonymousClass00H r4, AnonymousClass00H r5, AnonymousClass00H r6, AnonymousClass00H r7) {
        C18070vi.A0w(r1, r2, r3, r4, r5);
        C18070vi.A0l(r6, r7);
        this.A02 = r1;
        this.A03 = r2;
        this.A05 = r3;
        this.A06 = r4;
        this.A04 = r5;
        this.A07 = r6;
        this.A08 = r7;
    }
}
