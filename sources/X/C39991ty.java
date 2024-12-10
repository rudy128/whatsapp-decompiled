package X;

/* renamed from: X.1ty  reason: invalid class name and case insensitive filesystem */
public final class C39991ty implements C23571Gu, C36771oR {
    public final C18030ve A00;
    public final AnonymousClass1Bd A01;
    public final C32741hg A02;
    public final C18100vl A03 = new C18110vm(new C40001tz(this));

    public C39991ty(C18030ve r3, AnonymousClass1Bd r4, C32741hg r5) {
        C18070vi.A0d(r4, 1);
        C18070vi.A0d(r5, 2);
        C18070vi.A0d(r3, 3);
        this.A01 = r4;
        this.A02 = r5;
        this.A00 = r3;
    }

    public final void A00() {
        if (((Boolean) this.A03.getValue()).booleanValue()) {
            this.A01.A08("StatusesFragment_onCreate");
        }
        this.A02.A0E.markerPoint(453128091, 1, "CREATE_END");
    }

    public final void A01() {
        if (((Boolean) this.A03.getValue()).booleanValue()) {
            this.A01.A09("StatusesFragment_onCreate");
        }
        AnonymousClass19Y r3 = this.A02.A0E;
        r3.markerStart(453128091, 1);
        r3.markerPoint(453128091, 1, "CREATE_START");
    }

    public boolean BlE() {
        if (!((Boolean) this.A03.getValue()).booleanValue()) {
            return false;
        }
        this.A01.A08("StatusesFragment_onDraw");
        return false;
    }

    public void BlF() {
        if (((Boolean) this.A03.getValue()).booleanValue()) {
            this.A01.A08("StatusesFragment_onLayout");
        }
    }

    public void BmV() {
        if (((Boolean) this.A03.getValue()).booleanValue()) {
            this.A01.A09("StatusesFragment_onDraw");
        }
    }

    public void BmX() {
        if (((Boolean) this.A03.getValue()).booleanValue()) {
            this.A01.A09("StatusesFragment_onLayout");
        }
    }
}
