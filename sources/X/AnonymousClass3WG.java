package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.List;

/* renamed from: X.3WG  reason: invalid class name */
public final class AnonymousClass3WG extends C41251w3 {
    public final AnonymousClass1F9 A00;
    public final AnonymousClass1VW A01;
    public final C42971z2 A02;
    public final C18000vb A03;
    public final AnonymousClass00H A04;
    public final C18100vl A05;
    public final C22821Di A06;
    public final AnonymousClass1OS A07;
    public final AnonymousClass1OS A08;
    public final AnonymousClass20H A09;
    public final C18030ve A0A;

    public /* bridge */ /* synthetic */ C42011xT BqY(ViewGroup viewGroup, int i) {
        View inflate = C72463Mc.A0K(viewGroup, 0).inflate(i, viewGroup, false);
        if (i == 2131624433) {
            List list = C42011xT.A0I;
            C18070vi.A0b(inflate);
            return new C76023mL(inflate, this.A03, this.A06, this.A07);
        } else if (i == 2131624434 || i == 2131624435) {
            List list2 = C42011xT.A0I;
            C18070vi.A0b(inflate);
            return new C76003mJ(inflate);
        } else if (i == 2131624437) {
            List list3 = C42011xT.A0I;
            C18070vi.A0b(inflate);
            return new C76013mK(inflate, this.A01, this.A02, (C37451pZ) this.A05.getValue(), this.A08, this.A09);
        } else if (i == 2131624436) {
            List list4 = C42011xT.A0I;
            C18070vi.A0b(inflate);
            return new C75993mI(inflate);
        } else {
            throw AnonymousClass000.A0n("Unknown view. Expected call log View or Header View.");
        }
    }

    public /* bridge */ /* synthetic */ void Bmc(C42011xT r2, int i) {
        C73953Xy r22 = (C73953Xy) r2;
        r22.A0B(C72463Mc.A0l(this, r22, i));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass3WG(Context context, AnonymousClass1F9 r4, AnonymousClass1VW r5, C42971z2 r6, C18000vb r7, C18030ve r8, AnonymousClass00H r9, C22821Di r10, AnonymousClass1OS r11, AnonymousClass1OS r12, AnonymousClass20H r13) {
        super((C40411uf) AnonymousClass3W2.A00);
        C18070vi.A0p(r8, r5, r7);
        C18070vi.A0d(r9, 5);
        C18070vi.A0d(r6, 7);
        this.A0A = r8;
        this.A01 = r5;
        this.A03 = r7;
        this.A04 = r9;
        this.A00 = r4;
        this.A02 = r6;
        this.A07 = r11;
        this.A06 = r10;
        this.A09 = r13;
        this.A08 = r12;
        this.A05 = AnonymousClass1DF.A00(AnonymousClass00R.A0C, new AnonymousClass5MH(context, this));
    }

    public int getItemViewType(int i) {
        Object A0U = A0U(i);
        if (A0U instanceof C93374is) {
            return 2131624433;
        }
        if (A0U instanceof C93354iq) {
            C18030ve r2 = this.A0A;
            if (r2 == null || !C18020vd.A05(C18040vf.A01, r2, 11202)) {
                return 2131624434;
            }
            return 2131624435;
        } else if (A0U instanceof C93364ir) {
            return 2131624437;
        } else {
            if (A0U instanceof C93384it) {
                return 2131624436;
            }
            throw AnonymousClass3MW.A14();
        }
    }
}
