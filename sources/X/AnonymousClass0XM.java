package X;

/* renamed from: X.0XM  reason: invalid class name */
public final class AnonymousClass0XM implements C16430sF, C16440sG, C15710r4 {
    public final C17280uP A00 = new AnonymousClass08Y(-1);
    public final C17280uP A01 = new AnonymousClass08Y(0);
    public final C17330uU A02 = AnonymousClass0Q9.A01((Object) null);
    public final C17330uU A03 = AnonymousClass0Q9.A01((Object) null);
    public final Object A04;
    public final C06830Zv A05;

    public AnonymousClass0XM CBi() {
        AnonymousClass0XM r1;
        C17280uP r2 = this.A01;
        if (r2.BT8() == 0) {
            this.A05.A00(this);
            C16440sG r0 = (C16440sG) this.A02.getValue();
            if (r0 != null) {
                r1 = r0.CBi();
            } else {
                r1 = null;
            }
            this.A03.setValue(r1);
        }
        r2.CJC(r2.BT8() + 1);
        return this;
    }

    public void release() {
        C17280uP r1 = this.A01;
        if (r1.BT8() > 0) {
            r1.CJC(r1.BT8() - 1);
            if (r1.BT8() == 0) {
                this.A05.A01(this);
                C17330uU r12 = this.A03;
                C16430sF r0 = (C16430sF) r12.getValue();
                if (r0 != null) {
                    r0.release();
                }
                r12.setValue((Object) null);
                return;
            }
            return;
        }
        throw AnonymousClass000.A0n("Release should only be called once");
    }

    public AnonymousClass0XM(C06830Zv r3, Object obj) {
        this.A04 = obj;
        this.A05 = r3;
        C18100vl r0 = AnonymousClass0GU.A01;
    }
}
