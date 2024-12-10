package X;

import android.widget.CompoundButton;

public class AG2 implements CompoundButton.OnCheckedChangeListener {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public AG2(Object obj, Object obj2, int i) {
        this.A00 = i;
        this.A01 = obj2;
        this.A02 = obj;
    }

    /* JADX WARNING: type inference failed for: r0v18, types: [java.lang.Object, X.9RF] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0081  */
    /* JADX WARNING: Removed duplicated region for block: B:48:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCheckedChanged(android.widget.CompoundButton r9, boolean r10) {
        /*
            r8 = this;
            int r0 = r8.A00
            if (r0 == 0) goto L_0x0067
            java.lang.Object r5 = r8.A01
            com.whatsapp.payments.ui.widget.MultiExclusionChipGroup r5 = (com.whatsapp.payments.ui.widget.MultiExclusionChipGroup) r5
            java.lang.Object r4 = r8.A02
            com.google.android.material.chip.Chip r4 = (com.google.android.material.chip.Chip) r4
            java.util.Map r2 = r5.A02
            boolean r0 = r2.containsKey(r4)
            if (r0 == 0) goto L_0x008d
            boolean r1 = r4.isChecked()
            r0 = 2131168217(0x7f070bd9, float:1.795073E38)
            if (r1 == 0) goto L_0x0020
            r0 = 2131168214(0x7f070bd6, float:1.7950724E38)
        L_0x0020:
            r4.setChipStrokeWidthResource(r0)
            boolean r1 = r4.isChecked()
            r0 = 2131168218(0x7f070bda, float:1.7950732E38)
            if (r1 == 0) goto L_0x002f
            r0 = 2131168215(0x7f070bd7, float:1.7950726E38)
        L_0x002f:
            r4.setTextStartPaddingResource(r0)
            java.util.List r3 = X.AnonymousClass8BS.A0t(r4, r2)
            if (r3 == 0) goto L_0x008d
            r2 = 0
        L_0x0039:
            int r0 = r3.size()
            if (r2 >= r0) goto L_0x008d
            java.lang.Object r1 = r3.get(r2)
            com.google.android.material.chip.Chip r1 = (com.google.android.material.chip.Chip) r1
            if (r1 == r4) goto L_0x0064
            boolean r0 = r4.isChecked()
            r0 = r0 ^ 1
            r1.setClickable(r0)
            boolean r0 = r4.isChecked()
            r0 = r0 ^ 1
            r1.setCheckable(r0)
            boolean r0 = r4.isChecked()
            int r0 = X.C72453Mb.A01(r0)
            r1.setVisibility(r0)
        L_0x0064:
            int r2 = r2 + 1
            goto L_0x0039
        L_0x0067:
            java.lang.Object r2 = r8.A02
            android.widget.CompoundButton r2 = (android.widget.CompoundButton) r2
            if (r2 == 0) goto L_0x0085
            java.lang.Object r1 = r8.A01
            X.AZh r1 = (X.C20804AZh) r1
            X.91R r0 = r1.A06
            X.AEP r0 = r0.A0U
            if (r0 == 0) goto L_0x0085
            com.whatsapp.payments.ui.ConfirmPaymentFragment r0 = r1.A05
            boolean r1 = r2.isChecked()
        L_0x007d:
            com.whatsapp.wds.components.button.WDSButton r0 = r0.A0M
            if (r0 == 0) goto L_0x00d2
            r0.setEnabled(r1)
            return
        L_0x0085:
            java.lang.Object r0 = r8.A01
            X.AZh r0 = (X.C20804AZh) r0
            com.whatsapp.payments.ui.ConfirmPaymentFragment r0 = r0.A05
            r1 = 1
            goto L_0x007d
        L_0x008d:
            java.util.Set r7 = r5.A03
            if (r10 == 0) goto L_0x00d3
            r7.add(r4)
        L_0x0094:
            X.B5h r0 = r5.A00
            if (r0 == 0) goto L_0x00d2
            X.Aaa r0 = (X.C20858Aaa) r0
            com.whatsapp.payments.ui.PaymentTransactionHistoryActivity r6 = r0.A00
            com.whatsapp.payments.ui.widget.MultiExclusionChip r5 = r0.A01
            com.whatsapp.payments.ui.widget.MultiExclusionChip r4 = r0.A02
            com.whatsapp.payments.ui.widget.MultiExclusionChip r3 = r0.A03
            com.whatsapp.payments.ui.widget.MultiExclusionChip r2 = r0.A04
            boolean r0 = r6.A0R
            if (r0 == 0) goto L_0x00bd
            X.9gq r1 = r6.A0X
            boolean r0 = r7.contains(r5)
            r1.A06 = r0
            boolean r0 = r7.contains(r4)
            if (r0 == 0) goto L_0x00bd
            X.9RF r0 = new X.9RF
            r0.<init>()
            r1.A00 = r0
        L_0x00bd:
            boolean r0 = r6.A0N
            if (r0 == 0) goto L_0x00cf
            X.9gq r1 = r6.A0X
            boolean r0 = r7.contains(r3)
            r1.A02 = r0
            boolean r0 = r7.contains(r2)
            r1.A03 = r0
        L_0x00cf:
            r6.A4b()
        L_0x00d2:
            return
        L_0x00d3:
            r7.remove(r4)
            goto L_0x0094
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AG2.onCheckedChanged(android.widget.CompoundButton, boolean):void");
    }
}
