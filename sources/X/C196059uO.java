package X;

/* renamed from: X.9uO  reason: invalid class name and case insensitive filesystem */
public final class C196059uO {
    public boolean A00;
    public int A01 = -1;
    public String A02;
    public final C19830z4 A03;
    public final AnonymousClass1FU A04;

    public C196059uO(AnonymousClass1FU r2, C19830z4 r3) {
        C18070vi.A0d(r3, 2);
        this.A04 = r2;
        this.A03 = r3;
    }

    public final void A00() {
        this.A00 = false;
        A9B.A00 = C17890vO.A0B(this.A03).getString("registration_failure_reason", "");
        String str = this.A02;
        if (str != null) {
            this.A04.BhR(str);
        }
        int i = this.A01;
        if (i != -1) {
            AnonymousClass4Yv.A01(this.A04, i);
        }
        this.A02 = null;
        this.A01 = -1;
    }

    public final void A03(String str) {
        C18070vi.A0d(str, 0);
        if (!this.A00) {
            AnonymousClass1FU r1 = this.A04;
            if (!r1.isFinishing()) {
                r1.BhR(str);
                return;
            }
        }
        this.A02 = str;
    }

    public final void A01(int i) {
        if (!this.A00) {
            AnonymousClass4Yv.A01(this.A04, i);
        } else {
            this.A01 = i;
        }
    }

    public final void A02(int i) {
        if (!this.A00) {
            AnonymousClass1FU r1 = this.A04;
            if (!r1.isFinishing()) {
                r1.BhQ(i);
                return;
            }
        }
        AnonymousClass1FU r0 = this.A04;
        r0.getString(i);
        this.A02 = r0.getString(i);
    }
}
