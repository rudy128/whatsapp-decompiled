package X;

import android.view.View;
import android.view.ViewGroup;
import java.util.List;

/* renamed from: X.5ya  reason: invalid class name and case insensitive filesystem */
public final class C116765ya extends AnonymousClass28I {
    public final C124886a9 A00;
    public final C124896aA A01;
    public final C124906aB A02;
    public final C18090vk A03;
    public final C18090vk A04;
    public final C22821Di A05;
    public final C22821Di A06;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C116765ya(C124886a9 r3, C124896aA r4, C124906aB r5, C18090vk r6, C18090vk r7, C22821Di r8, C22821Di r9) {
        super(new C40471ul(new C111565jv(3)).A00());
        C18070vi.A0d(r3, 5);
        C18070vi.A0l(r4, r5);
        this.A06 = r8;
        this.A05 = r9;
        this.A04 = r6;
        this.A03 = r7;
        this.A00 = r3;
        this.A01 = r4;
        this.A02 = r5;
    }

    public void Bmc(C42011xT r5, int i) {
        C113535nF r52;
        C113125ma r53;
        C18070vi.A0d(r5, 0);
        C55242fS r2 = this.A00;
        AnonymousClass1IX r0 = r2.A01;
        if (r0 == null) {
            r0 = AnonymousClass1IX.of();
        }
        int intValue = ((C1418277c) r0.get(i)).A01.intValue();
        if (intValue == 1 || intValue == 0) {
            if ((r5 instanceof C113535nF) && (r52 = (C113535nF) r5) != null) {
                AnonymousClass1IX r02 = r2.A01;
                if (r02 == null) {
                    r02 = AnonymousClass1IX.of();
                }
                Object obj = r02.get(i);
                C18070vi.A0X(obj);
                r52.A0B((C1418277c) obj);
            }
        } else if (intValue == 5 && (r5 instanceof C113125ma) && (r53 = (C113125ma) r5) != null) {
            C90054dS.A00(r53.A00.findViewById(2131432860), r53, 21);
        }
    }

    public C42011xT BqY(ViewGroup viewGroup, int i) {
        C42011xT r3;
        View inflate;
        int i2;
        C18070vi.A0d(viewGroup, 0);
        if (i == 1) {
            C124896aA r2 = this.A01;
            View A0B = AnonymousClass3MX.A0B(AnonymousClass3MZ.A0D(viewGroup), viewGroup, 2131626121, false);
            C22821Di r8 = this.A05;
            C18090vk r7 = this.A03;
            List list = C42011xT.A0I;
            AnonymousClass10E r1 = r2.A00.A02;
            r3 = new AnonymousClass6Ap(A0B, C000200d.A00(r1.A00.A06), C000200d.A00(r1.A4b), r7, r8);
        } else if (i == 0) {
            C124886a9 r22 = this.A00;
            View A0B2 = AnonymousClass3MX.A0B(AnonymousClass3MZ.A0D(viewGroup), viewGroup, 2131626127, false);
            C22821Di r9 = this.A06;
            C18090vk r82 = this.A03;
            List list2 = C42011xT.A0I;
            C36251na r12 = r22.A00;
            AnonymousClass00H A002 = C000200d.A00(r12.A01.A1N);
            AnonymousClass10E r13 = r12.A02;
            r3 = new C119966Aq(A0B2, A002, C000200d.A00(r13.A00.A06), C000200d.A00(r13.A4b), r82, r9);
        } else {
            if (i == 2) {
                inflate = AnonymousClass3MZ.A0D(viewGroup).inflate(2131626124, viewGroup, false);
                i2 = 1;
            } else if (i == 3) {
                C124906aB r23 = this.A02;
                View A0B3 = AnonymousClass3MX.A0B(AnonymousClass3MZ.A0D(viewGroup), viewGroup, 2131626126, false);
                List list3 = C42011xT.A0I;
                AnonymousClass10E r32 = r23.A00.A02;
                r3 = new C112985mM(A0B3, C000200d.A00(r32.A0k), C000200d.A00(r32.A30), C000200d.A00(r32.ABz));
            } else if (i == 4) {
                inflate = AnonymousClass3MZ.A0D(viewGroup).inflate(2131626122, viewGroup, false);
                i2 = 2;
            } else if (i == 5) {
                r3 = new C113125ma(this.A04, AnonymousClass3MX.A0B(AnonymousClass3MY.A0B(viewGroup), viewGroup, 2131626125, false));
            } else {
                throw AnonymousClass000.A0n("MusicBrowseAdapter/Unsupported item type");
            }
            r3 = new C112955mJ(inflate, i2);
        }
        return r3;
    }

    public int getItemViewType(int i) {
        AnonymousClass1IX r0 = this.A00.A01;
        if (r0 == null) {
            r0 = AnonymousClass1IX.of();
        }
        return ((C1418277c) r0.get(i)).A01.intValue();
    }
}
