package X;

import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.4SS  reason: invalid class name */
public final class AnonymousClass4SS {
    public C200710s A00;
    public final C18030ve A01;
    public final C85134Mf A02;
    public final C18010vc A03;
    public final C33531iy A04;
    public final AnonymousClass10I A05;
    public final ConcurrentHashMap A06 = new ConcurrentHashMap(4);
    public final C18100vl A07 = AnonymousClass1DF.A01(new AnonymousClass5JV(this));
    public final C18100vl A08 = AnonymousClass1DF.A01(new AnonymousClass5JW(this));
    public final AnonymousClass11P A09;
    public final C41461wR A0A;
    public final AnonymousClass00H A0B;

    public final boolean A01() {
        if (!C18020vd.A05(C18040vf.A01, this.A01, 1799)) {
            return false;
        }
        C33531iy r3 = this.A04;
        List<C62302rB> A032 = ((C63332st) r3.A06.get()).A03();
        A032.size();
        for (C62302rB A033 : A032) {
            if (r3.A03(A033, false)) {
                return true;
            }
        }
        return false;
    }

    public final boolean A00() {
        C85134Mf r1 = this.A02;
        if (!r1.A01.A01() || !AnonymousClass3MX.A1T(C17890vO.A0B(r1.A00), "pref_interop_badge_enabled") || this.A0A.A00()) {
            return false;
        }
        return true;
    }

    public AnonymousClass4SS(AnonymousClass11P r3, C18030ve r4, C85134Mf r5, C18010vc r6, C33531iy r7, C41461wR r8, AnonymousClass10I r9, AnonymousClass00H r10) {
        C18070vi.A0o(r3, r4, r9);
        C18070vi.A0g(r10, 4, r7);
        C18070vi.A0q(r5, r8, r6);
        this.A09 = r3;
        this.A01 = r4;
        this.A05 = r9;
        this.A0B = r10;
        this.A04 = r7;
        this.A02 = r5;
        this.A0A = r8;
        this.A03 = r6;
    }
}
