package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Filter;
import java.util.List;

/* renamed from: X.1rE  reason: invalid class name and case insensitive filesystem */
public final class C38401rE extends C38391rD implements C38361rA {
    public final C36491nz A00;
    public final C36501o0 A01;
    public final C203411t A02;
    public final C37451pZ A03;
    public final C37471pb A04;
    public final C38371rB A05;
    public final C34021jm A06;
    public final C18000vb A07;
    public final C18030ve A08;
    public final AnonymousClass00H A09;
    public final AnonymousClass1DC A0A;

    public /* bridge */ /* synthetic */ C42011xT BqY(ViewGroup viewGroup, int i) {
        AnonymousClass1LT r0;
        View A002;
        Object A003;
        LayoutInflater layoutInflater;
        int i2;
        C18070vi.A0d(viewGroup, 0);
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    A002 = LayoutInflater.from(viewGroup.getContext()).inflate(2131626854, viewGroup, false);
                    List list = C42011xT.A0I;
                    C18070vi.A0b(A002);
                    A002.setTag(new AnonymousClass3Z7(A002, this.A02, this.A07, true));
                } else if (i == 3) {
                    layoutInflater = LayoutInflater.from(viewGroup.getContext());
                    i2 = 2131624984;
                } else if (i == 4) {
                    A002 = LayoutInflater.from(viewGroup.getContext()).inflate(2131624981, viewGroup, false);
                    C18070vi.A0X(A002);
                } else if (i >= 5) {
                    A002 = LayoutInflater.from(viewGroup.getContext()).inflate(2131624988, viewGroup, false);
                    A003 = "message_conversations_list_item";
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Unknown view type: ");
                    sb.append(i);
                    throw new IllegalStateException(sb.toString());
                }
                List list2 = C42011xT.A0I;
                C18070vi.A0b(A002);
                return new C42161xj(A002, viewGroup);
            }
            layoutInflater = LayoutInflater.from(viewGroup.getContext());
            i2 = 2131625857;
            A002 = layoutInflater.inflate(i2, viewGroup, false);
            List list22 = C42011xT.A0I;
            C18070vi.A0b(A002);
            return new C42161xj(A002, viewGroup);
        }
        C18030ve r2 = this.A08;
        boolean A052 = C18020vd.A05(C18040vf.A01, r2, 12469);
        if (AnonymousClass1J8.A04(r2)) {
            r0 = (AnonymousClass1LT) this.A09.get();
        } else {
            r0 = null;
        }
        A002 = C42071xZ.A00(viewGroup, r0, A052);
        C18070vi.A0b(A002);
        if (A052) {
            C36501o0 r3 = this.A01;
            Context context = viewGroup.getContext();
            C18070vi.A0X(context);
            C34021jm r8 = this.A06;
            A003 = r3.A00(context, A002, this.A03, this.A04, r8, (C43351zf) null, C18020vd.A05(C18040vf.A02, r2, 10026));
        } else {
            C36491nz r32 = this.A00;
            Context context2 = viewGroup.getContext();
            C34021jm r82 = this.A06;
            A003 = r32.A00(context2, A002, this.A03, this.A04, r82, (C43351zf) null, C18020vd.A05(C18040vf.A02, r2, 10026));
        }
        A002.setTag(A003);
        List list222 = C42011xT.A0I;
        C18070vi.A0b(A002);
        return new C42161xj(A002, viewGroup);
    }

    public C38401rE(C36491nz r2, C36501o0 r3, C203411t r4, C37451pZ r5, C37471pb r6, C38371rB r7, C34021jm r8, C18000vb r9, C18030ve r10, AnonymousClass1DC r11, AnonymousClass00H r12) {
        C18070vi.A0d(r6, 8);
        this.A08 = r10;
        this.A07 = r9;
        this.A0A = r11;
        this.A00 = r2;
        this.A01 = r3;
        this.A03 = r5;
        this.A05 = r7;
        this.A04 = r6;
        this.A02 = r4;
        this.A09 = r12;
        this.A06 = r8;
    }

    public int A0Q() {
        return this.A05.getCount();
    }

    public void BLD() {
        this.A05.BLD();
    }

    public C23471Gk BN7() {
        return this.A05.A00;
    }

    public C23471Gk BRg() {
        return this.A05.A01;
    }

    public List BXB() {
        return this.A05.A05;
    }

    public String BYr() {
        return this.A05.A02;
    }

    public /* bridge */ /* synthetic */ void Bmc(C42011xT r4, int i) {
        C42161xj r42 = (C42161xj) r4;
        C18070vi.A0d(r42, 0);
        this.A05.getView(i, r42.A0H, r42.A00);
    }

    public void CIs(C23471Gk r2) {
        this.A05.A01 = r2;
    }

    public void CKf(String str) {
        this.A05.CKf(str);
    }

    public int getCount() {
        return this.A05.getCount();
    }

    public Filter getFilter() {
        return this.A05.getFilter();
    }

    public boolean isEmpty() {
        return this.A05.isEmpty();
    }
}
