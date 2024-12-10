package X;

import android.view.View;
import android.widget.TextView;
import com.whatsapp.newsletter.insights.view.InsightsItemView;
import com.whatsapp.newsletter.insights.view.chart.LineChartView;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

/* renamed from: X.43a  reason: invalid class name */
public final class AnonymousClass43a extends AnonymousClass4VW implements C107555aD {
    public View A00;
    public TextView A01;
    public InsightsItemView A02;
    public InsightsItemView A03;
    public InsightsItemView A04;
    public LineChartView A05;
    public int A06;
    public List A07;
    public List A08;
    public List A09;
    public final LinkedHashSet A0A;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass43a(C18000vb r6, C29681ch r7, AnonymousClass4QX r8, AnonymousClass74D r9, AnonymousClass4XM r10, AnonymousClass1K3 r11, long j) {
        super(r6, r7, r8, r9, r10, r11, j);
        int A0G = C72453Mb.A0G(r11, r6, 1);
        C72473Md.A1M(r9, r10, r8, 3);
        C18070vi.A0d(r7, 6);
        C87234Uu[] r2 = new C87234Uu[3];
        r2[0] = C821643h.A06;
        r2[1] = C821643h.A05;
        r2[A0G] = C821643h.A08;
        this.A0A = AnonymousClass1AP.A02(r2);
        C18460wS r0 = C18460wS.A00;
        this.A07 = r0;
        this.A09 = r0;
        this.A08 = r0;
    }

    /* JADX WARNING: type inference failed for: r13v6, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARNING: type inference failed for: r13v8, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A02(android.view.View.OnClickListener r19, android.view.View r20, X.AnonymousClass1FU r21, X.AnonymousClass3VG r22) {
        /*
            r18 = this;
            r17 = 0
            r11 = r20
            r0 = r21
            boolean r16 = X.C18070vi.A17(r0, r11)
            r10 = 2
            r8 = r22
            X.C18070vi.A0d(r8, r10)
            r9 = 3
            r1 = r19
            X.C18070vi.A0d(r1, r9)
            r7 = r18
            super.A02(r1, r11, r0, r8)
            X.4Uu r6 = X.C821643h.A06
            r12 = 0
            X.5W1 r0 = X.AnonymousClass5W1.A00
            java.lang.Integer r0 = r8.A0T(r6, r0)
            int r0 = X.C72463Mc.A0B(r0)
            r7.A06 = r0
            X.4Uu r0 = X.C821643h.A05
            java.util.List r0 = r8.A0U(r0)
            if (r0 == 0) goto L_0x0058
            java.util.ArrayList r13 = X.C29351c6.A0E(r0)
            java.util.Iterator r14 = r0.iterator()
        L_0x003a:
            boolean r0 = r14.hasNext()
            if (r0 == 0) goto L_0x005a
            java.lang.Object r1 = r14.next()
            X.4Uh r1 = (X.C87104Uh) r1
            java.lang.Long r0 = r1.A01
            long r2 = X.C17900vP.A01(r0)
            double r4 = r1.A00
            long r0 = (long) r4
            X.4Tq r4 = new X.4Tq
            r4.<init>(r2, r0)
            r13.add(r4)
            goto L_0x003a
        L_0x0058:
            X.0wS r13 = X.C18460wS.A00
        L_0x005a:
            r7.A07 = r13
            X.4Uu r0 = X.C821643h.A08
            java.util.List r0 = r8.A0U(r0)
            if (r0 == 0) goto L_0x008a
            java.util.ArrayList r13 = X.C29351c6.A0E(r0)
            java.util.Iterator r14 = r0.iterator()
        L_0x006c:
            boolean r0 = r14.hasNext()
            if (r0 == 0) goto L_0x008c
            java.lang.Object r1 = r14.next()
            X.4Uh r1 = (X.C87104Uh) r1
            java.lang.Long r0 = r1.A01
            long r4 = X.C17900vP.A01(r0)
            double r2 = r1.A00
            long r0 = (long) r2
            X.4Tq r2 = new X.4Tq
            r2.<init>(r4, r0)
            r13.add(r2)
            goto L_0x006c
        L_0x008a:
            X.0wS r13 = X.C18460wS.A00
        L_0x008c:
            r7.A09 = r13
            java.util.List r0 = r7.A07
            int r1 = r0.size()
            java.util.List r0 = r7.A09
            int r0 = r0.size()
            int r15 = java.lang.Math.min(r1, r0)
            java.util.ArrayList r14 = X.C17880vN.A0z(r15)
            r13 = 0
        L_0x00a3:
            if (r13 >= r15) goto L_0x00cf
            java.util.List r0 = r7.A07
            java.lang.Object r0 = r0.get(r13)
            X.4Tq r0 = (X.C86934Tq) r0
            long r4 = r0.A00
            java.util.List r0 = r7.A07
            java.lang.Object r0 = r0.get(r13)
            X.4Tq r0 = (X.C86934Tq) r0
            long r2 = r0.A01
            java.util.List r0 = r7.A09
            java.lang.Object r0 = r0.get(r13)
            X.4Tq r0 = (X.C86934Tq) r0
            long r0 = r0.A01
            long r2 = r2 - r0
            X.4Tq r0 = new X.4Tq
            r0.<init>(r4, r2)
            r14.add(r0)
            int r13 = r13 + 1
            goto L_0x00a3
        L_0x00cf:
            r7.A08 = r14
            r7.A03(r11, r8, r6)
            r7.C9t(r12)
            com.whatsapp.newsletter.insights.view.chart.LineChartView r4 = r7.A05
            if (r4 == 0) goto L_0x010f
            X.4UL[] r5 = new X.AnonymousClass4UL[r9]
            java.util.List r3 = r7.A08
            r2 = 2131101256(0x7f060648, float:1.7814917E38)
            r1 = 2131101257(0x7f060649, float:1.7814919E38)
            X.4UL r0 = new X.4UL
            r0.<init>(r3, r2, r1)
            r5[r17] = r0
            java.util.List r3 = r7.A07
            r2 = 2131101254(0x7f060646, float:1.7814912E38)
            r1 = 2131101255(0x7f060647, float:1.7814915E38)
            X.4UL r0 = new X.4UL
            r0.<init>(r3, r2, r1)
            r5[r16] = r0
            java.util.List r3 = r7.A09
            r2 = 2131101259(0x7f06064b, float:1.7814923E38)
            r1 = 2131101260(0x7f06064c, float:1.7814925E38)
            X.4UL r0 = new X.4UL
            r0.<init>(r3, r2, r1)
            java.util.List r0 = X.C18070vi.A0O(r0, r5, r10)
            r4.setSeries(r0)
        L_0x010f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass43a.A02(android.view.View$OnClickListener, android.view.View, X.1FU, X.3VG):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0027, code lost:
        if (r2 == null) goto L_0x0029;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A06(com.whatsapp.newsletter.insights.view.InsightsItemView r4, java.lang.Number r5) {
        /*
            r3 = this;
            if (r4 == 0) goto L_0x002e
            if (r5 == 0) goto L_0x0029
            X.4QX r1 = r3.A04
            X.0vl r0 = r1.A01
            java.lang.Object r0 = r0.getValue()
            java.text.Format r0 = (java.text.Format) r0
            java.lang.String r2 = r0.format(r5)
            X.C18070vi.A0X(r2)
            X.0vb r0 = r1.A00
            boolean r0 = X.AnonymousClass3MW.A1Z(r0)
            if (r0 == 0) goto L_0x002b
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            r0 = 8206(0x200e, float:1.1499E-41)
            java.lang.String r2 = X.C17890vO.A0Z(r2, r1, r0)
            if (r2 != 0) goto L_0x002b
        L_0x0029:
            java.lang.String r2 = ""
        L_0x002b:
            r4.setPrimaryValue(r2)
        L_0x002e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass43a.A06(com.whatsapp.newsletter.insights.view.InsightsItemView, java.lang.Number):void");
    }

    public void C9t(Long l) {
        Number number;
        Long l2;
        Long l3;
        Object obj;
        Object obj2;
        Object obj3;
        if (l == null) {
            number = Integer.valueOf(this.A06);
            long j = 0;
            long j2 = 0;
            for (C86934Tq r0 : this.A07) {
                j2 += r0.A01;
            }
            l2 = Long.valueOf(j2);
            for (C86934Tq r02 : this.A09) {
                j += r02.A01;
            }
            l3 = Long.valueOf(j);
            C72453Mb.A1D(this.A00);
        } else {
            Iterator it = this.A08.iterator();
            while (true) {
                l3 = null;
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((C86934Tq) obj).A00 == l.longValue()) {
                    break;
                }
            }
            C86934Tq r3 = (C86934Tq) obj;
            if (r3 != null) {
                number = Long.valueOf(r3.A01);
            } else {
                number = null;
            }
            Iterator it2 = this.A07.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    obj2 = null;
                    break;
                }
                obj2 = it2.next();
                if (((C86934Tq) obj2).A00 == l.longValue()) {
                    break;
                }
            }
            C86934Tq r32 = (C86934Tq) obj2;
            if (r32 != null) {
                l2 = Long.valueOf(r32.A01);
            } else {
                l2 = null;
            }
            Iterator it3 = this.A09.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    obj3 = null;
                    break;
                }
                obj3 = it3.next();
                if (((C86934Tq) obj3).A00 == l.longValue()) {
                    break;
                }
            }
            C86934Tq r33 = (C86934Tq) obj3;
            if (r33 != null) {
                l3 = Long.valueOf(r33.A01);
            }
            TextView textView = this.A01;
            if (textView != null) {
                textView.setText(AnonymousClass11X.A00.A06(this.A02, l.longValue()));
            }
            View view = this.A00;
            if (view != null) {
                view.setVisibility(0);
                LineChartView lineChartView = this.A05;
                if (lineChartView != null) {
                    view.addOnLayoutChangeListener(new C90214di(view, lineChartView, l, 2));
                }
            }
        }
        A06(this.A03, number);
        A06(this.A02, l2);
        A06(this.A04, l3);
    }
}
