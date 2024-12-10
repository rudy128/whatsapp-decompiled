package X;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.3rs  reason: invalid class name and case insensitive filesystem */
public final class C77953rs extends C78023rz implements C22851Dl, AnonymousClass85W {
    public RecyclerView A00;
    public C24671Lf A01;
    public AnonymousClass7KN A02;
    public boolean A03;
    public final C131416l3 A04;
    public final C37451pZ A05;
    public final C18030ve A06;
    public final AnonymousClass74D A07;
    public final C34571ki A08;
    public final AnonymousClass440 A09;
    public final C18100vl A0A = AnonymousClass1DF.A01(new AnonymousClass5GE(this));
    public final C95424mD A0B;

    public static final void A00(C77953rs r11) {
        C29681ch r4;
        AnonymousClass1BI chatJid = r11.A01.getChatJid();
        if ((chatJid instanceof C29681ch) && (r4 = (C29681ch) chatJid) != null) {
            boolean z = !r11.A08();
            AnonymousClass74D r3 = r11.A07;
            long A0K = C72453Mb.A0K(r11.A0A);
            AnonymousClass440 r2 = r11.A09;
            List<C135386s7> A10 = AnonymousClass3MW.A10(r2.A01);
            if (A10 == null) {
                A10 = C18460wS.A00;
            }
            ArrayList A0E = C29351c6.A0E(A10);
            for (C135386s7 r0 : A10) {
                A0E.add(r0.A02);
            }
            List<C135386s7> A102 = AnonymousClass3MW.A10(r2.A00);
            if (A102 == null) {
                A102 = C18460wS.A00;
            }
            ArrayList A0E2 = C29351c6.A0E(A102);
            for (C135386s7 r02 : A102) {
                A0E2.add(r02.A02);
            }
            r3.A0J(r4, AnonymousClass00R.A0F, A0E, A0E2, z ? 1 : 0, A0K);
        }
    }

    public static final boolean A01(C77953rs r3) {
        C86924Tp A022;
        AnonymousClass1BI chatJid = r3.A01.getChatJid();
        if (!(chatJid instanceof C29681ch)) {
            chatJid = null;
        }
        if (!(chatJid == null || (A022 = r3.A0B.A02(chatJid)) == null)) {
            boolean A1Z = AnonymousClass000.A1Z(A022.A00.A02, C179509Ig.SUBSCRIBED);
            if (Boolean.valueOf(A1Z) != null) {
                return A1Z;
            }
        }
        return false;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C77953rs(C131416l3 r4, C24671Lf r5, C37451pZ r6, C108885cS r7, C18030ve r8, C95424mD r9, AnonymousClass74D r10, C34571ki r11, AnonymousClass440 r12, C28931bI r13) {
        super(r7, r13, 81);
        C18070vi.A0w(r8, r5, r9, r10, r4);
        C18070vi.A0q(r7, r13, r12);
        C18070vi.A0d(r6, 9);
        this.A06 = r8;
        this.A01 = r5;
        this.A0B = r9;
        this.A07 = r10;
        this.A04 = r4;
        this.A09 = r12;
        this.A05 = r6;
        this.A08 = r11;
        AnonymousClass1FY CFa = r7.CFa();
        CFa.getLifecycle().A05(new C91394fc(this));
        r12.A02.A00.A0A(CFa, this);
        r12.A00.A0A(CFa, this);
    }

    public void Bo9(Object obj) {
        if (!A01(this)) {
            this.A03 = false;
        }
        boolean A082 = A08();
        boolean A092 = A09();
        if (A082) {
            if (!A092 && !this.A03) {
                A07(true);
            }
            AnonymousClass7KN r1 = this.A02;
            if (r1 != null) {
                List A10 = AnonymousClass3MW.A10(this.A09.A00);
                if (A10 == null) {
                    A10 = C18460wS.A00;
                }
                r1.A02(A10);
            }
        } else if (A092) {
            A06(true);
        }
    }
}
