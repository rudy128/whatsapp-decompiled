package X;

/* renamed from: X.1WZ  reason: invalid class name */
public class AnonymousClass1WZ implements AnonymousClass1WY {
    public final AnonymousClass1LW A00;
    public final AnonymousClass1CJ A01;
    public final AnonymousClass1MS A02;
    public final AnonymousClass1DL A03;
    public final AnonymousClass1Cd A04;
    public final AnonymousClass1WX A05;
    public final AnonymousClass1QV A06;
    public final C24661Le A07;
    public final C24751Ln A08;
    public final AnonymousClass1RL A09;

    private void A00() {
        AnonymousClass1DL r1 = this.A03;
        r1.A03.clear();
        r1.A02.clear();
        AnonymousClass1WX r2 = this.A05;
        r2.A00.A07(-1);
        C002100z r12 = r2.A04.A00;
        synchronized (r12) {
            r12.A07(-1);
        }
        C26111Qw r13 = r2.A03;
        r13.A01.A06();
        r13.A00.A06();
        this.A02.A05.clear();
        this.A06.A01();
        AnonymousClass1LW r14 = this.A00;
        synchronized (r14) {
            r14.A08.clear();
            r14.A09.clear();
        }
        C24661Le r15 = this.A07;
        if (r15.A0C != null) {
            r15.A0C.clear();
        }
        this.A08.A0O();
        this.A09.A07.clear();
    }

    public AnonymousClass1WZ(AnonymousClass1LW r1, AnonymousClass1CJ r2, AnonymousClass1MS r3, AnonymousClass1DL r4, AnonymousClass1Cd r5, AnonymousClass1WX r6, AnonymousClass1QV r7, C24661Le r8, C24751Ln r9, AnonymousClass1RL r10) {
        this.A03 = r4;
        this.A00 = r1;
        this.A01 = r2;
        this.A07 = r8;
        this.A05 = r6;
        this.A08 = r9;
        this.A06 = r7;
        this.A04 = r5;
        this.A02 = r3;
        this.A09 = r10;
    }

    public void A01() {
        A00();
        AnonymousClass1Cd r1 = this.A04;
        r1.A06();
        r1.A08 = false;
        AnonymousClass1CJ r12 = this.A01;
        synchronized (r12) {
            if (r12.A00) {
                AnonymousClass1CJ.A01(r12).clear();
                r12.A00 = false;
            }
        }
    }

    public void C2o() {
        A00();
    }
}
