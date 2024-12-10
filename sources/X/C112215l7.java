package X;

import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.HashMap;

/* renamed from: X.5l7  reason: invalid class name and case insensitive filesystem */
public class C112215l7 extends C38391rD {
    public ArrayList A00;
    public C145227Kl[] A01;
    public final /* synthetic */ C145247Kn A02;

    public C42011xT BqY(ViewGroup viewGroup, int i) {
        C145247Kn r0 = this.A02;
        if (i == 1) {
            return new C113565nI(r0.A07, viewGroup, r0.A0B);
        }
        return new C113265mo(r0.A07, viewGroup);
    }

    public C112215l7(C145247Kn r2, ArrayList arrayList, C145227Kl[] r4) {
        this.A02 = r2;
        this.A00 = arrayList;
        this.A01 = r4;
        A0K(true);
    }

    public long A0M(int i) {
        if (!this.A00) {
            return -1;
        }
        String str = ((C138916xu) this.A00.get(i)).A01;
        C145247Kn r5 = this.A02;
        HashMap hashMap = r5.A0C;
        Number A1D = C108945cZ.A1D(str, hashMap);
        if (A1D == null) {
            long j = r5.A02;
            r5.A02 = 1 + j;
            A1D = Long.valueOf(j);
            hashMap.put(str, A1D);
        }
        return A1D.longValue();
    }

    public int A0Q() {
        return this.A00.size();
    }

    public void A0R(C42011xT r2) {
        if (r2 instanceof C113565nI) {
            ((C113565nI) r2).A0B();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:44:0x01b6, code lost:
        if (r3 != 3) goto L_0x01b8;
     */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x01c9  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x01e5  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void Bmc(X.C42011xT r19, int r20) {
        /*
            r18 = this;
            r11 = r19
            r2 = r18
            r1 = r20
            int r0 = r2.getItemViewType(r1)
            if (r0 != 0) goto L_0x00cb
            X.5mo r11 = (X.C113265mo) r11
            java.util.ArrayList r0 = r2.A00
            java.lang.Object r5 = r0.get(r1)
            X.6xu r5 = (X.C138916xu) r5
            X.7Kn r0 = r2.A02
            int r0 = r0.A00
            boolean r6 = r5.A00(r0)
            android.view.View r7 = r11.A01
            if (r6 == 0) goto L_0x00c8
            android.content.Context r4 = r7.getContext()
            android.content.Context r3 = r7.getContext()
            r1 = 2130970739(0x7f040873, float:1.7550197E38)
            r0 = 2131102169(0x7f0609d9, float:1.7816768E38)
            int r0 = X.AnonymousClass3MZ.A02(r3, r4, r1, r0)
        L_0x0034:
            r7.setBackgroundColor(r0)
            X.7Kl[] r1 = r2.A01
            int r0 = r5.A00
            r4 = r1[r0]
            android.widget.ImageView r3 = r11.A02
            boolean r0 = r4 instanceof X.C121136Hw
            if (r0 == 0) goto L_0x008f
            r10 = r4
            X.6Hw r10 = (X.C121136Hw) r10
            r0 = 0
            X.C28081Yu.A00(r0, r3)
            X.725 r0 = r10.A04
            java.lang.String r0 = r0.A0H
            r3.setTag(r0)
            X.7Ma r9 = new X.7Ma
            r9.<init>(r3, r10, r0)
            android.content.Context r8 = r10.A0B
            r7 = 2131896440(0x7f122878, float:1.9427741E38)
            java.lang.Object[] r1 = X.AnonymousClass3MW.A1a()
            X.725 r0 = r10.A04
            java.lang.String r0 = r0.A04
            java.lang.String r0 = X.C108975cc.A0b(r8, r0, r1, r7)
            r3.setContentDescription(r0)
            r3.setSelected(r6)
            X.1SB r1 = r10.A06
            X.725 r0 = r10.A04
            r1.A0F(r0, r9)
        L_0x0074:
            boolean r0 = r4 instanceof X.C121136Hw
            if (r0 == 0) goto L_0x008d
            X.6Hw r4 = (X.C121136Hw) r4
            X.725 r0 = r4.A04
            boolean r0 = r0.A0B
        L_0x007e:
            android.view.View r1 = r11.A00
            int r0 = X.C72453Mb.A07(r0)
            r1.setVisibility(r0)
            r0 = 41
            X.AnonymousClass3MZ.A1P(r3, r2, r5, r0)
        L_0x008c:
            return
        L_0x008d:
            r0 = 0
            goto L_0x007e
        L_0x008f:
            boolean r0 = r4 instanceof X.C121146Hx
            if (r0 == 0) goto L_0x00a2
            r0 = 2131232317(0x7f08063d, float:1.808074E38)
            X.C108995ce.A0z(r3, r0, r6)
            android.content.Context r1 = r4.A0B
            r0 = 2131896408(0x7f122858, float:1.9427676E38)
            X.AnonymousClass3MY.A0w(r1, r3, r0)
            goto L_0x0074
        L_0x00a2:
            boolean r0 = r4 instanceof X.C121156Hy
            if (r0 == 0) goto L_0x00b5
            r0 = 2131232258(0x7f080602, float:1.808062E38)
            X.C108995ce.A0z(r3, r0, r6)
            android.content.Context r1 = r4.A0B
            r0 = 2131896478(0x7f12289e, float:1.9427818E38)
            X.AnonymousClass3MY.A0w(r1, r3, r0)
            goto L_0x0074
        L_0x00b5:
            boolean r0 = r4 instanceof X.C121126Hv
            if (r0 != 0) goto L_0x0074
            r0 = 2131233040(0x7f080910, float:1.8082206E38)
            X.C108995ce.A0z(r3, r0, r6)
            android.content.Context r1 = r4.A0B
            r0 = 2131896403(0x7f122853, float:1.9427666E38)
            X.AnonymousClass3MY.A0w(r1, r3, r0)
            goto L_0x0074
        L_0x00c8:
            r0 = 0
            goto L_0x0034
        L_0x00cb:
            X.5nI r11 = (X.C113565nI) r11
            java.util.ArrayList r0 = r2.A00
            java.lang.Object r10 = r0.get(r1)
            X.6xu r10 = (X.C138916xu) r10
            android.view.View r9 = r11.A02
            r0 = 42
            X.AnonymousClass3MZ.A1P(r9, r2, r10, r0)
            android.view.View r8 = r11.A03
            r0 = 43
            X.AnonymousClass3MZ.A1P(r8, r2, r10, r0)
            android.view.View r7 = r11.A04
            r0 = 44
            X.AnonymousClass3MZ.A1P(r7, r2, r10, r0)
            android.view.View r6 = r11.A05
            r0 = 45
            X.AnonymousClass3MZ.A1P(r6, r2, r10, r0)
            X.7Kn r0 = r2.A02
            r17 = r0
            int r0 = r0.A00
            boolean r0 = r10.A00(r0)
            if (r0 == 0) goto L_0x01d9
            boolean r0 = r11.A00
            if (r0 == 0) goto L_0x019d
            X.1ba r5 = new X.1ba
            r5.<init>()
            r5.A0E(r8)
            android.view.View r14 = r11.A01
            r5.A0E(r14)
            r0 = 300(0x12c, double:1.48E-321)
            r5.A0C(r0)
            X.1bX r13 = new X.1bX
            r13.<init>()
            X.1LI r2 = new X.1LI
            r2.<init>()
            X.0vb r0 = r11.A08
            r16 = r0
            boolean r1 = X.AnonymousClass3MY.A1b(r16)
            r15 = 5
            r0 = 3
            if (r1 == 0) goto L_0x012a
            r0 = 5
        L_0x012a:
            r2.A0X(r0)
            r3 = 400(0x190, double:1.976E-321)
            r2.A0C(r3)
            X.1bZ r12 = new X.1bZ
            r12.<init>()
            r0 = 100
            r12.A01 = r0
            r12.A0C(r3)
            r13.A0E(r9)
            r13.A0a(r2)
            r13.A0a(r12)
            X.1bX r12 = new X.1bX
            r12.<init>()
            X.1LI r2 = new X.1LI
            r2.<init>()
            boolean r16 = X.AnonymousClass3MY.A1b(r16)
            if (r16 == 0) goto L_0x0158
            r15 = 3
        L_0x0158:
            r2.A0X(r15)
            r2.A0C(r3)
            r2.A01 = r0
            X.1bZ r3 = new X.1bZ
            r3.<init>()
            r0 = 200(0xc8, double:9.9E-322)
            r3.A01 = r0
            r0 = 300(0x12c, double:1.48E-321)
            r3.A0C(r0)
            r12.A0E(r6)
            r12.A0E(r7)
            r12.A0a(r2)
            r12.A0a(r3)
            android.view.View r0 = r11.A0H
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            X.C29191bl.A02(r0, r5)
            android.view.ViewGroup r0 = r11.A07
            X.C29191bl.A02(r0, r12)
            android.view.ViewGroup r0 = r11.A06
            X.C29191bl.A02(r0, r13)
            r0 = 2131233053(0x7f08091d, float:1.8082233E38)
            r14.setBackgroundResource(r0)
            r0 = 0
            r7.setVisibility(r0)
            r6.setVisibility(r0)
            r9.setVisibility(r0)
            r11.A00 = r0
        L_0x019d:
            r0 = r17
            int r3 = r0.A00
            int r1 = r10.A00
            if (r3 < r1) goto L_0x01b8
            int r0 = r1 + 4
            if (r3 >= r0) goto L_0x01b8
            int r3 = r3 - r1
            r0 = 1
            r2 = 1
            if (r3 == 0) goto L_0x01b9
            r2 = 2
            if (r3 == r0) goto L_0x01b9
            if (r3 == r2) goto L_0x01d7
            r0 = 3
            r2 = 8
            if (r3 == r0) goto L_0x01b9
        L_0x01b8:
            r2 = 0
        L_0x01b9:
            r0 = 0
            r9.setSelected(r0)
            r7.setSelected(r0)
            r8.setSelected(r0)
            r6.setSelected(r0)
            r1 = 1
            if (r2 == r1) goto L_0x01e5
            r0 = 2
            if (r2 == r0) goto L_0x01e1
            r0 = 4
            if (r2 == r0) goto L_0x01dd
            r0 = 8
            if (r2 != r0) goto L_0x008c
            r6.setSelected(r1)
            return
        L_0x01d7:
            r2 = 4
            goto L_0x01b9
        L_0x01d9:
            r11.A0B()
            goto L_0x019d
        L_0x01dd:
            r7.setSelected(r1)
            return
        L_0x01e1:
            r8.setSelected(r1)
            return
        L_0x01e5:
            r9.setSelected(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C112215l7.Bmc(X.1xT, int):void");
    }

    public int getItemViewType(int i) {
        return this.A00.get(i) instanceof AnonymousClass6Ho ? 1 : 0;
    }
}
