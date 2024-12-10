package X;

import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.5lR  reason: invalid class name and case insensitive filesystem */
public final class C112415lR extends C38391rD implements AnonymousClass89H {
    public C116695yT A00;
    public final C56442hT A01;
    public final AnonymousClass1KB A02;
    public final AnonymousClass1M9 A03;
    public final C37451pZ A04;
    public final AnonymousClass1c4 A05;
    public final AnonymousClass74D A06;
    public final AnonymousClass85Z A07;
    public final List A08;
    public final C18100vl A09;
    public final C18100vl A0A;
    public final C18100vl A0B = AnonymousClass1DF.A01(new C152717oM(this));
    public final C131616lO A0C;
    public final AnonymousClass89G A0D;

    public /* bridge */ /* synthetic */ C42011xT BqY(ViewGroup viewGroup, int i) {
        C42011xT r1;
        C18070vi.A0d(viewGroup, 0);
        if (i == 0) {
            r1 = this.A01.A00(AnonymousClass3MX.A0B(AnonymousClass3MZ.A0D(viewGroup), viewGroup, 2131626177, false), this.A04, this);
        } else if (i == 1) {
            r1 = new AnonymousClass6BM(AnonymousClass3MX.A0B(AnonymousClass3MY.A0B(viewGroup), viewGroup, 2131625116, false));
        } else if (i == 2) {
            r1 = new C42011xT(AnonymousClass3MX.A0B(AnonymousClass3MY.A0B(viewGroup), viewGroup, 2131625115, false));
        } else if (i == 3 || i == 4 || i == 5) {
            r1 = new AnonymousClass6BP(AnonymousClass3MX.A0B(AnonymousClass3MY.A0B(viewGroup), viewGroup, 2131625114, false), this.A07);
        } else {
            throw AnonymousClass001.A13("View type not supported ", AnonymousClass000.A10(), i);
        }
        C18070vi.A0z(r1, "null cannot be cast to non-null type com.whatsapp.newsletter.ui.directory.adapter.viewholders.NewsletterDirectoryBaseViewHolder<com.whatsapp.newsletter.directory.DirectoryDataItem>");
        return r1;
    }

    public static final List A00(C112415lR r1) {
        if (!C72453Mb.A1a(r1.A0B)) {
            return r1.A08;
        }
        List list = ((C40431uh) r1.A09.getValue()).A02;
        C18070vi.A0X(list);
        return list;
    }

    public static final void A01(C112415lR r4, List list) {
        if (C72453Mb.A1a(r4.A0B)) {
            C108995ce.A1S(list, r4.A09);
            return;
        }
        C108955ca.A1O(r4.A00);
        C116695yT r3 = new C116695yT(r4.A08, list);
        ((C37471pb) r4.A0A.getValue()).A00(new C143627Ed(r4, list, 0), r3);
        r4.A00 = r3;
    }

    public /* bridge */ /* synthetic */ void Bmc(C42011xT r2, int i) {
        C112945mI r22 = (C112945mI) r2;
        C18070vi.A0d(r22, 0);
        r22.A0B((AnonymousClass6TV) A00(this).get(i), i);
    }

    public void Brg(AnonymousClass6B5 r2, int i, boolean z) {
        this.A0D.Brf(r2, i, z);
        r2.A05 = true;
    }

    public void Bri(AnonymousClass6B5 r2, int i) {
        this.A0D.Brh(r2, i);
    }

    public C112415lR(C56442hT r3, AnonymousClass1KB r4, AnonymousClass1M9 r5, C27201Vd r6, AnonymousClass118 r7, AnonymousClass1c4 r8, C131616lO r9, AnonymousClass74D r10, AnonymousClass89G r11, AnonymousClass85Z r12, AnonymousClass10I r13) {
        C18070vi.A0w(r6, r7, r13, r5, r4);
        C18070vi.A0q(r3, r10, r9);
        C18070vi.A0d(r8, 9);
        this.A03 = r5;
        this.A02 = r4;
        this.A01 = r3;
        this.A06 = r10;
        this.A0C = r9;
        this.A05 = r8;
        this.A0D = r11;
        this.A07 = r12;
        this.A04 = r6.A06(r7.A00, "directory-adapter");
        this.A08 = AnonymousClass000.A13();
        this.A09 = AnonymousClass1DF.A01(new C152697oK(this));
        this.A0A = AnonymousClass1DF.A01(new C152707oL(r13));
    }

    public int A0Q() {
        return A00(this).size();
    }

    public final void A0U() {
        if (C29431cG.A0e(A00(this)) instanceof AnonymousClass6B8) {
            List A002 = A00(this);
            ArrayList A13 = AnonymousClass000.A13();
            Iterator it = A002.iterator();
            while (it.hasNext()) {
                C108985cd.A1O(A13, it);
            }
            A01(this, A13);
        }
    }

    public int getItemViewType(int i) {
        Object obj = A00(this).get(i);
        if (obj instanceof AnonymousClass6B5) {
            return 0;
        }
        if (obj instanceof AnonymousClass6BA) {
            return 1;
        }
        if (obj instanceof AnonymousClass6B8) {
            return 2;
        }
        if (obj instanceof AnonymousClass6B9) {
            return 3;
        }
        if (obj instanceof AnonymousClass6BC) {
            return 4;
        }
        if (obj instanceof AnonymousClass6BB) {
            return 5;
        }
        throw new C122776Rw("An operation is not implemented.");
    }
}
