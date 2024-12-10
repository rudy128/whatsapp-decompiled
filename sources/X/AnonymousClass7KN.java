package X;

import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

/* renamed from: X.7KN  reason: invalid class name */
public final class AnonymousClass7KN implements AnonymousClass85W {
    public long A00;
    public final RecyclerView A01;
    public final C34571ki A02;
    public final C142637Af A03 = new C142637Af();
    public final C112145l0 A04;
    public final C111675kF A05;
    public final boolean A06;
    public final AnonymousClass11P A07;
    public final C18000vb A08;

    public AnonymousClass7KN(RecyclerView recyclerView, C125336au r10, C37451pZ r11, AnonymousClass11P r12, C18000vb r13, C34571ki r14, boolean z) {
        C18070vi.A0s(r10, r12, r13, r11);
        C18070vi.A0l(recyclerView, r14);
        this.A07 = r12;
        this.A08 = r13;
        this.A06 = z;
        this.A01 = recyclerView;
        this.A02 = r14;
        AnonymousClass10E r0 = r10.A00.A00;
        AnonymousClass1KB A12 = AnonymousClass10E.A12(r0);
        AnonymousClass10I AL1 = AnonymousClass10E.AL1(r0);
        AnonymousClass1M9 A4z = AnonymousClass10E.A4z(r0);
        this.A04 = new C112145l0((C125346av) r0.A00.A3P.get(), A12, A4z, r11, this, AL1, z);
        this.A05 = new C111675kF(recyclerView.getContext(), r13);
    }

    public final void A01(C29681ch r9) {
        C29681ch r4 = r9;
        C18070vi.A0d(r9, 0);
        C112145l0 r3 = this.A04;
        if (r3.A00 <= 0) {
            int i = 0;
            for (Object next : r3.A01) {
                int i2 = i + 1;
                if (i < 0) {
                    AnonymousClass1ZU.A0B();
                    throw null;
                }
                C135386s7 r5 = (C135386s7) next;
                if (C18070vi.A18(r5.A02.A0M(), r9)) {
                    r3.A04.CGS(new C21365Aiu(r3, r4, r5, i, 48), "RecommendedNewslettersAdapter/notifyItemChanged");
                    return;
                }
                i = i2;
            }
        }
    }

    public final void A00() {
        RecyclerView recyclerView = this.A01;
        C18000vb r1 = this.A08;
        recyclerView.setLayoutDirection(AnonymousClass3MW.A1Z(r1) ? 1 : 0);
        C108965cb.A14(this.A04, recyclerView);
        new C111705kI(r1).A08(recyclerView);
    }

    public final void A02(List list) {
        RecyclerView recyclerView = this.A01;
        C142637Af r1 = this.A03;
        recyclerView.A12.remove(r1);
        if (recyclerView.A0F == r1) {
            recyclerView.A0F = null;
        }
        C112145l0 r12 = this.A04;
        r12.A00 = 0;
        r12.A01 = list;
        r12.notifyDataSetChanged();
    }
}
