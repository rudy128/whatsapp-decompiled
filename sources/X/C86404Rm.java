package X;

/* renamed from: X.4Rm  reason: invalid class name and case insensitive filesystem */
public final class C86404Rm {
    public final C18030ve A00;
    public final AnonymousClass00H A01;

    public final boolean A00() {
        if (!C18020vd.A05(C18040vf.A02, this.A00, 7851) || C17880vN.A1W(C17880vN.A0C(((COR) this.A01.get()).A01), "has_ever_open_linked_devices_view")) {
            return false;
        }
        return true;
    }

    public final boolean A01() {
        if (!C18020vd.A05(C18040vf.A02, this.A00, 7851) || C17880vN.A1W(C17880vN.A0C(((COR) this.A01.get()).A01), "has_ever_linked_devices")) {
            return false;
        }
        return true;
    }

    public C86404Rm(C18030ve r1, AnonymousClass00H r2) {
        C18070vi.A0j(r1, r2);
        this.A00 = r1;
        this.A01 = r2;
    }
}
