package X;

import com.whatsapp.payments.ui.HybridPaymentMethodPickerFragment;

/* renamed from: X.AZn  reason: case insensitive filesystem */
public class C20810AZn implements C22465B8x {
    public final int A00;
    public final Object A01;

    public C20810AZn(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public void C0H(int i) {
        C187399fk r0;
        if (this.A00 != 0) {
            HybridPaymentMethodPickerFragment hybridPaymentMethodPickerFragment = (HybridPaymentMethodPickerFragment) this.A01;
            C183429Yf r1 = (C183429Yf) hybridPaymentMethodPickerFragment.A0P.get(i);
            if ((r1 instanceof AnonymousClass960) && (r0 = hybridPaymentMethodPickerFragment.A0B) != null) {
                C20284AEs aEs = ((AnonymousClass960) r1).A01;
                AnonymousClass92u r4 = r0.A02;
                r4.BiK(r4.A0S.A08(aEs, (C20112A7u) null), C17880vN.A0h(), 169, "payment_method_prompt");
                return;
            }
            return;
        }
        C161758Hq r12 = (C161758Hq) this.A01;
        int i2 = r12.A00;
        r12.A00 = i;
        r12.A0G(i2);
        r12.A04.C0H(i);
    }
}
