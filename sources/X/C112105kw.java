package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.5kw  reason: invalid class name and case insensitive filesystem */
public final class C112105kw extends C38391rD {
    public List A00;
    public final C19880zA A01;
    public final AnonymousClass6ZV A02;
    public final C1595685a A03;
    public final List A04;

    public C112105kw(C19880zA r9, AnonymousClass6ZV r10, C18030ve r11, C1595685a r12) {
        C18070vi.A0d(r11, 1);
        C18070vi.A0k(r10, r9);
        this.A02 = r10;
        this.A01 = r9;
        this.A03 = r12;
        List A0S = AnonymousClass1YF.A0S(C108955ca.A0v(r11, 5127), new String[]{","}, 0);
        ArrayList A13 = AnonymousClass000.A13();
        Iterator it = A0S.iterator();
        while (it.hasNext()) {
            C109005cf.A0q(A13, it);
        }
        ArrayList A132 = AnonymousClass000.A13();
        Iterator it2 = A13.iterator();
        while (it2.hasNext()) {
            int A0H = C72453Mb.A0H(it2);
            C122746Rt[] values = C122746Rt.values();
            int length = values.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                C122746Rt r1 = values[i];
                if (r1.value == A0H) {
                    A132.add(r1);
                    break;
                }
                i++;
            }
        }
        ArrayList A0m = C29431cG.A0m(A132);
        Boolean bool = C17970vW.A03;
        C19880zA r13 = this.A01;
        if (r13.A07()) {
            r13.A03();
            throw AnonymousClass000.A0s("shouldAddDiscoveryTab");
        }
        if (C18020vd.A05(C18040vf.A02, r11, 7685)) {
            A0m.remove(C122746Rt.COUNTRY);
        }
        this.A04 = A0m;
        this.A00 = AnonymousClass000.A13();
    }

    public final void A0U(C122746Rt r6, String str) {
        C18070vi.A0d(r6, 0);
        List<C122746Rt> list = this.A04;
        ArrayList A0D = C29351c6.A0D(list);
        for (C122746Rt r2 : list) {
            C135376s6 r1 = new C135376s6(r2, AnonymousClass000.A1Z(r2, r6));
            if (r2 == C122746Rt.COUNTRY) {
                r1.A00 = str;
            }
            A0D.add(r1);
        }
        this.A00 = A0D;
        notifyDataSetChanged();
    }

    public /* bridge */ /* synthetic */ C42011xT BqY(ViewGroup viewGroup, int i) {
        C18070vi.A0d(viewGroup, 0);
        AnonymousClass6ZV r3 = this.A02;
        View inflate = AnonymousClass3MZ.A0D(viewGroup).inflate(2131626258, viewGroup, false);
        C18070vi.A0z(inflate, "null cannot be cast to non-null type com.google.android.material.chip.Chip");
        TextView textView = (TextView) inflate;
        C43421zm.A04(textView);
        List list = C42011xT.A0I;
        return new C113135mb(textView, (C133836pa) r3.A00.A01.A7D.get(), this);
    }

    public int A0Q() {
        return this.A00.size();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0066, code lost:
        if (r0 != null) goto L_0x0068;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ void Bmc(X.C42011xT r8, int r9) {
        /*
            r7 = this;
            X.5mb r8 = (X.C113135mb) r8
            r1 = 0
            X.C18070vi.A0d(r8, r1)
            java.util.List r0 = r7.A00
            java.lang.Object r6 = r0.get(r9)
            X.6s6 r6 = (X.C135376s6) r6
            X.C18070vi.A0d(r6, r1)
            X.6Rt r5 = r6.A01
            com.google.android.material.chip.Chip r4 = r8.A00
            java.lang.CharSequence r0 = r4.getText()
            r4.setContentDescription(r0)
            boolean r0 = r6.A02
            r4.setChecked(r0)
            r4.setCheckedIconVisible((boolean) r1)
            android.content.Context r0 = X.AnonymousClass3MY.A04(r4)
            java.lang.String r0 = r5.A01(r0)
            r4.setText(r0)
            X.6Rt r0 = X.C122746Rt.COUNTRY
            if (r5 != r0) goto L_0x006c
            r3 = 2131101222(0x7f060626, float:1.7814848E38)
            r2 = 1
            r4.setChipIconVisible((boolean) r2)
            r0 = 2131232228(0x7f0805e4, float:1.808056E38)
            r4.setChipIconResource(r0)
            r4.setChipIconTintResource(r3)
            r0 = 2131168345(0x7f070c59, float:1.795099E38)
            r4.setChipIconSizeResource(r0)
            r1 = 2131165903(0x7f0702cf, float:1.7946036E38)
            r4.setIconStartPaddingResource(r1)
            r4.setCloseIconVisible((boolean) r2)
            r0 = 2131233339(0x7f080a3b, float:1.8082813E38)
            r4.setCloseIconResource(r0)
            r4.setCloseIconTintResource(r3)
            r4.setCloseIconEndPaddingResource(r1)
            X.6pa r1 = r8.A01
            java.lang.String r0 = r6.A00
            java.lang.String r0 = r1.A01(r0)
            if (r0 == 0) goto L_0x0072
        L_0x0068:
            r4.setText(r0)
            return
        L_0x006c:
            r4.setChipIconVisible((boolean) r1)
            r4.setCloseIconVisible((boolean) r1)
        L_0x0072:
            android.content.Context r0 = X.AnonymousClass3MY.A04(r4)
            java.lang.String r0 = r5.A01(r0)
            goto L_0x0068
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C112105kw.Bmc(X.1xT, int):void");
    }
}
