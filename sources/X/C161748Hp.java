package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import java.util.List;

/* renamed from: X.8Hp  reason: invalid class name and case insensitive filesystem */
public class C161748Hp extends C38391rD {
    public final Context A00;
    public final B5U A01;
    public final AnonymousClass1L4 A02;
    public final List A03 = AnonymousClass000.A13();
    public final AnonymousClass4VT A04;

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00be, code lost:
        if (getItemViewType(r16 + 1) == 0) goto L_0x00c0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void Bmc(X.C42011xT r15, int r16) {
        /*
            r14 = this;
            r10 = r15
            r9 = r14
            java.util.List r4 = r14.A03
            int r0 = r4.size()
            r12 = r16
            if (r12 >= r0) goto L_0x0028
            java.lang.Object r2 = r4.get(r12)
            X.9oQ r2 = (X.C192459oQ) r2
            int r1 = r2.A00
            if (r1 == 0) goto L_0x00c5
            r3 = 1
            if (r1 == r3) goto L_0x0029
            r0 = 2
            if (r1 != r0) goto L_0x0029
            X.8IX r10 = (X.AnonymousClass8IX) r10
            java.util.List r0 = X.C42011xT.A0I
            android.widget.TextView r1 = r10.A00
            r0 = 2131893807(0x7f121e2f, float:1.94224E38)
            r1.setText(r0)
        L_0x0028:
            return
        L_0x0029:
            X.8pS r11 = r2.A01
            X.B5U r0 = r14.A01
            com.whatsapp.payments.onboarding.IndiaUpiBankPickerActivity r0 = (com.whatsapp.payments.onboarding.IndiaUpiBankPickerActivity) r0
            java.lang.String r1 = r0.A0H
            java.util.ArrayList r0 = r0.A0I
            android.util.Pair r8 = X.C108945cZ.A0N(r1, r0)
            android.content.Context r0 = r14.A00
            android.content.res.Resources r2 = r0.getResources()
            boolean r0 = r11.A0K
            r1 = 2131231081(0x7f080169, float:1.8078233E38)
            if (r0 == 0) goto L_0x0047
            r1 = 2131231082(0x7f08016a, float:1.8078235E38)
        L_0x0047:
            r0 = 0
            android.graphics.drawable.Drawable r6 = X.C40501uo.A00(r0, r2, r1)
            r5 = r10
            X.8Iq r5 = (X.C162018Iq) r5
            java.lang.Object r7 = r8.first
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r8 = r8.second
            java.util.Collection r8 = (java.util.Collection) r8
            java.util.List r0 = X.C42011xT.A0I
            java.lang.String r0 = r11.A03
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x008e
            X.4VT r2 = r5.A03
            java.lang.String r1 = r11.A03
            X.C17960vV.A07(r1)
            android.widget.ImageView r0 = r5.A01
            r2.A01(r6, r6, r0, r1)
        L_0x006d:
            java.util.ArrayList r6 = X.AnonymousClass000.A13()
            if (r8 == 0) goto L_0x0076
            r6.addAll(r8)
        L_0x0076:
            boolean r0 = android.text.TextUtils.isEmpty(r7)
            if (r0 != 0) goto L_0x0094
            r2 = 0
        L_0x007d:
            int r0 = r7.length()
            if (r2 >= r0) goto L_0x0094
            int r1 = r2 + 1
            java.lang.String r0 = r7.substring(r2, r1)
            r6.add(r0)
            r2 = r1
            goto L_0x007d
        L_0x008e:
            android.widget.ImageView r0 = r5.A01
            r0.setImageDrawable(r6)
            goto L_0x006d
        L_0x0094:
            com.whatsapp.TextEmojiLabel r2 = r5.A02
            X.77e r0 = r11.A01
            java.lang.Object r1 = X.AnonymousClass8BT.A0q(r0)
            java.lang.String r1 = (java.lang.String) r1
            r0 = 0
            r2.A0S(r1, r6, r0, r0)
            android.view.View r0 = r15.A0H
            r13 = 3
            X.78D r8 = new X.78D
            r8.<init>(r9, r10, r11, r12, r13)
            r0.setOnClickListener(r8)
            android.view.View r2 = r5.A00
            if (r2 == 0) goto L_0x0028
            int r0 = X.AnonymousClass3MX.A02(r4, r3)
            if (r12 == r0) goto L_0x00c0
            int r0 = r16 + 1
            int r1 = r14.getItemViewType(r0)
            r0 = 0
            if (r1 != 0) goto L_0x00c1
        L_0x00c0:
            r0 = 4
        L_0x00c1:
            r2.setVisibility(r0)
            return
        L_0x00c5:
            X.8IX r10 = (X.AnonymousClass8IX) r10
            java.util.List r0 = X.C42011xT.A0I
            android.widget.TextView r1 = r10.A00
            java.lang.String r0 = r2.A02
            r1.setText(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C161748Hp.Bmc(X.1xT, int):void");
    }

    public int A0Q() {
        return this.A03.size();
    }

    /* JADX WARNING: Removed duplicated region for block: B:6:0x0013  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String A0U(int r5) {
        /*
            r4 = this;
            if (r5 < 0) goto L_0x002e
            java.util.List r1 = r4.A03
            int r0 = r1.size()
            if (r5 >= r0) goto L_0x002e
            java.lang.Object r0 = r1.get(r5)
            X.9oQ r0 = (X.C192459oQ) r0
        L_0x0010:
            r3 = 0
            if (r0 == 0) goto L_0x0042
            int r2 = r0.A00
            r1 = 3
            if (r2 != r1) goto L_0x0039
            X.8pS r0 = r0.A01
            if (r0 == 0) goto L_0x0042
            X.77e r0 = r0.A01
            if (r0 == 0) goto L_0x0042
            java.lang.String r1 = X.AnonymousClass8BS.A0h(r0)
            r0 = 0
            char r0 = r1.charAt(r0)
            java.lang.String r0 = java.lang.String.valueOf(r0)
            return r0
        L_0x002e:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "PAY: BankListAdapter/getItem invalid position "
            X.C17900vP.A0i(r0, r1, r5)
            r0 = 0
            goto L_0x0010
        L_0x0039:
            if (r2 != 0) goto L_0x0042
            int r0 = r5 + 1
            java.lang.String r0 = r4.A0U(r0)
            return r0
        L_0x0042:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C161748Hp.A0U(int):java.lang.String");
    }

    public int getItemViewType(int i) {
        List list = this.A03;
        if (i >= list.size()) {
            return -1;
        }
        return ((C192459oQ) list.get(i)).A00;
    }

    public C161748Hp(Context context, B5U b5u, AnonymousClass4VT r4, AnonymousClass1L4 r5) {
        this.A00 = context;
        this.A01 = b5u;
        this.A02 = r5;
        this.A04 = r4;
    }

    public C42011xT BqY(ViewGroup viewGroup, int i) {
        int i2;
        int i3;
        LayoutInflater A0D = AnonymousClass3MZ.A0D(viewGroup);
        if (i != 0) {
            if (i == 1) {
                List list = C42011xT.A0I;
                i3 = 2131625648;
            } else if (i == 2) {
                List list2 = C42011xT.A0I;
                i2 = 2131625653;
            } else if (i == 3) {
                List list3 = C42011xT.A0I;
                i3 = 2131625651;
            } else {
                Object[] objArr = new Object[1];
                C17880vN.A1T(objArr, i, 0);
                throw new UnsupportedOperationException(String.format("PAY: BankListAdapter/onCreateViewHolder  unsupported view type %d", objArr));
            }
            return new C162018Iq(A0D.inflate(i3, viewGroup, false), this.A04);
        }
        List list4 = C42011xT.A0I;
        i2 = 2131625650;
        return new AnonymousClass8IX(A0D.inflate(i2, viewGroup, false));
    }
}
