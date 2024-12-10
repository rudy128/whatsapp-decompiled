package X;

/* renamed from: X.4Ri  reason: invalid class name and case insensitive filesystem */
public final class C86364Ri {
    public final AnonymousClass73F A00;

    public C86364Ri(AnonymousClass73F r2) {
        C18070vi.A0d(r2, 1);
        this.A00 = r2;
    }

    public final AnonymousClass4X2 A00() {
        AnonymousClass73F r1 = this.A00;
        if (r1.A07()) {
            return new AnonymousClass45j();
        }
        if (r1.A06()) {
            return new C823245i();
        }
        return new AnonymousClass4X2((Float) null, (Integer) null, (Integer) null, (String) null, 0, 0, 0, 0, 0, 8191);
    }

    public final void A01() {
        AnonymousClass73F r1 = this.A00;
        if (r1.A07() && !C17880vN.A0H(r1.A0A).A0N()) {
            AnonymousClass00H r12 = r1.A05;
            if (!C17880vN.A1W(C18070vi.A03(((C85234Mp) r12.get()).A01), "pref_chat_info_new_icon_shown")) {
                C17880vN.A1F(C18070vi.A03(((C85234Mp) r12.get()).A01).edit(), "pref_chat_info_new_icon_shown", true);
            }
        }
    }
}
