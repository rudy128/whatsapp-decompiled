package X;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/* renamed from: X.7Mz  reason: invalid class name and case insensitive filesystem */
public final class C145887Mz implements EAv {
    public Runnable A00;
    public final C125166ad A01;
    public final C125176ae A02;
    public final AnonymousClass11S A03;
    public final C18030ve A04;
    public final AnonymousClass1NV A05 = new AnonymousClass1NV(new Random(), 5, 16000, 1000);
    public final AnonymousClass1NV A06 = new AnonymousClass1NV(new Random(), 5, 16000, 1000);
    public final AnonymousClass10I A07;
    public final AnonymousClass00H A08;
    public final AnonymousClass00H A09;
    public final Runnable A0A = AnonymousClass7RC.A00(this, 20);
    public final List A0B = C18070vi.A0M("20210210");
    public final AnonymousClass1KB A0C;
    public final AnonymousClass11P A0D;

    public final int A01(String str) {
        C18070vi.A0d(str, 0);
        return C18070vi.A03(((C133596p2) this.A08.get()).A01).getInt(AnonymousClass001.A1H("tos_acceptance_state_", str, AnonymousClass000.A10()), 0);
    }

    public final void A02() {
        AnonymousClass10I r1 = this.A07;
        r1.CEz(this.A0A);
        Runnable runnable = this.A00;
        if (runnable != null) {
            r1.CEz(runnable);
        }
        this.A05.A02();
        this.A06.A02();
        C17900vP.A0J(C18070vi.A03(((C133596p2) this.A08.get()).A01));
    }

    public final void A03(C139866zZ r7) {
        this.A05.A02();
        AnonymousClass00H r5 = this.A08;
        C17880vN.A1D(C108995ce.A0E(((C133596p2) r5.get()).A01), "request_refresh_rate_seconds", r7.A00);
        for (C135006rV r0 : r7.A01) {
            String str = r0.A01;
            ((C133596p2) r5.get()).A00(str, r0.A00);
            ((C133596p2) r5.get()).A01(str, System.currentTimeMillis());
        }
        this.A0C.A0J(AnonymousClass7RC.A00(this, 21));
    }

    public C145887Mz(C125166ad r9, C125176ae r10, AnonymousClass1KB r11, AnonymousClass11S r12, AnonymousClass11P r13, C18030ve r14, AnonymousClass10I r15, AnonymousClass00H r16, AnonymousClass00H r17) {
        C18070vi.A0w(r13, r14, r11, r12, r15);
        AnonymousClass00H r2 = r16;
        AnonymousClass00H r1 = r17;
        C18070vi.A0q(r2, r1, r9);
        C18070vi.A0d(r10, 9);
        this.A0D = r13;
        this.A04 = r14;
        this.A0C = r11;
        this.A03 = r12;
        this.A07 = r15;
        this.A09 = r2;
        this.A08 = r1;
        this.A01 = r9;
        this.A02 = r10;
    }

    public static final void A00(C145887Mz r5, List list, long j) {
        AnonymousClass7RO r1;
        ArrayList A13 = AnonymousClass000.A13();
        for (Object next : list) {
            if (r5.A01((String) next) == 1) {
                A13.add(next);
            }
        }
        if (A13.isEmpty()) {
            r1 = null;
        } else {
            r1 = new AnonymousClass7RO(r5, A13, list, 17);
        }
        r5.A00 = r1;
        if (r1 == null) {
            r5.A06.A02();
        } else {
            r5.A07.CGv(r1, j);
        }
    }
}
