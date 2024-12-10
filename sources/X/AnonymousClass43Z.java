package X;

import android.view.View;
import android.widget.TextView;
import com.whatsapp.newsletter.insights.view.InsightsItemView;
import com.whatsapp.newsletter.insights.view.chart.PieChartView;
import java.util.LinkedHashSet;
import java.util.List;

/* renamed from: X.43Z  reason: invalid class name */
public final class AnonymousClass43Z extends AnonymousClass4VW {
    public final LinkedHashSet A00;
    public final C18030ve A01;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass43Z(X.C18000vb r16, X.C18030ve r17, X.C29681ch r18, X.AnonymousClass4QX r19, X.AnonymousClass74D r20, X.AnonymousClass4XM r21, X.AnonymousClass1K3 r22, long r23) {
        /*
            r15 = this;
            r5 = 1
            r3 = r17
            r12 = r22
            int r4 = X.C72453Mb.A0G(r3, r12, r5)
            r0 = 3
            r7 = r16
            r10 = r20
            r11 = r21
            X.C72473Md.A1M(r7, r10, r11, r0)
            r8 = r18
            r9 = r19
            X.C18070vi.A0l(r9, r8)
            r6 = r15
            r13 = r23
            r6.<init>(r7, r8, r9, r10, r11, r12, r13)
            r15.A01 = r3
            X.4Uu[] r2 = new X.C87234Uu[r0]
            X.4Uu r1 = X.C821643h.A0B
            r0 = 0
            r2[r0] = r1
            X.4Uu r0 = X.C821643h.A0A
            r2[r5] = r0
            X.4Uu r0 = X.C821643h.A09
            r2[r4] = r0
            java.util.LinkedHashSet r2 = X.AnonymousClass1AP.A02(r2)
            r1 = 9792(0x2640, float:1.3722E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r3, r1)
            if (r0 != 0) goto L_0x0044
            X.4Uu r0 = X.C821643h.A07
            r2.add(r0)
        L_0x0044:
            r15.A00 = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass43Z.<init>(X.0vb, X.0ve, X.1ch, X.4QX, X.74D, X.4XM, X.1K3, long):void");
    }

    public void A02(View.OnClickListener onClickListener, View view, AnonymousClass1FU r18, AnonymousClass3VG r19) {
        Float f;
        View view2 = view;
        AnonymousClass1FU r0 = r18;
        boolean A17 = C18070vi.A17(r0, view2);
        AnonymousClass3VG r13 = r19;
        View.OnClickListener onClickListener2 = onClickListener;
        AnonymousClass3Ma.A1O(r13, 2, onClickListener2);
        super.A02(onClickListener2, view2, r0, r13);
        C87234Uu r1 = C821643h.A07;
        AnonymousClass5W1 r02 = AnonymousClass5W1.A00;
        Integer A0T = r13.A0T(r1, r02);
        C87234Uu r12 = C821643h.A0B;
        int A0B = C72463Mc.A0B(r13.A0T(r12, r02));
        C87234Uu r2 = C821643h.A0A;
        int A0B2 = C72463Mc.A0B(r13.A0T(r2, C106475Vz.A00));
        int A0B3 = C72463Mc.A0B(r13.A0T(r2, C106465Vy.A00));
        Integer valueOf = Integer.valueOf(A0B);
        if (valueOf == null || A0T == null || valueOf.equals(A0T) || !AnonymousClass3VG.A04(r13)) {
            f = null;
        } else {
            int intValue = A0T.intValue();
            f = Float.valueOf(((float) intValue) / ((float) (A0B - intValue)));
        }
        float f2 = 0.0f;
        float f3 = 0.0f;
        if (A0B != 0) {
            float f4 = (float) A0B;
            f3 = ((float) A0B2) / f4;
            f2 = ((float) A0B3) / f4;
        }
        List A0U = r13.A0U(C821643h.A09);
        A03(view2, r13, r12);
        C17880vN.A0E(view2, 2131431685).setText(this.A02.A0L().format(valueOf));
        TextView A0E = C17880vN.A0E(view2, 2131431687);
        if (f != null) {
            if (!C18020vd.A05(C18040vf.A02, this.A01, 9792)) {
                C18070vi.A0b(A0E);
                A0E.setVisibility(0);
                A0E.setText(A01(AnonymousClass3MY.A04(A0E), f.floatValue(), 2131892698));
                C86944Tr[] r122 = new C86944Tr[2];
                r122[0] = new C86944Tr(2131101258, f3);
                ((PieChartView) view2.findViewById(2131431690)).setSlices(C18070vi.A0O(new C86944Tr(2131101253, f2), r122, A17 ? 1 : 0));
                InsightsItemView insightsItemView = (InsightsItemView) view2.findViewById(2131431688);
                AnonymousClass4QX r8 = this.A04;
                insightsItemView.setPrimaryValue(r8.A00(Float.valueOf(f2)));
                AnonymousClass4XM r22 = this.A06;
                insightsItemView.setSecondaryValue(r22.A01(A0B3));
                InsightsItemView insightsItemView2 = (InsightsItemView) view2.findViewById(2131431689);
                insightsItemView2.setPrimaryValue(r8.A00(Float.valueOf(f3)));
                insightsItemView2.setSecondaryValue(r22.A01(A0B2));
                A04(view2, A0U, A0B);
            }
        }
        C18070vi.A0b(A0E);
        A0E.setVisibility(8);
        C86944Tr[] r1222 = new C86944Tr[2];
        r1222[0] = new C86944Tr(2131101258, f3);
        ((PieChartView) view2.findViewById(2131431690)).setSlices(C18070vi.A0O(new C86944Tr(2131101253, f2), r1222, A17 ? 1 : 0));
        InsightsItemView insightsItemView3 = (InsightsItemView) view2.findViewById(2131431688);
        AnonymousClass4QX r82 = this.A04;
        insightsItemView3.setPrimaryValue(r82.A00(Float.valueOf(f2)));
        AnonymousClass4XM r222 = this.A06;
        insightsItemView3.setSecondaryValue(r222.A01(A0B3));
        InsightsItemView insightsItemView22 = (InsightsItemView) view2.findViewById(2131431689);
        insightsItemView22.setPrimaryValue(r82.A00(Float.valueOf(f3)));
        insightsItemView22.setSecondaryValue(r222.A01(A0B2));
        A04(view2, A0U, A0B);
    }
}
