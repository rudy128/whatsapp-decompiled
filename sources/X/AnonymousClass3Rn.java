package X;

import com.whatsapp.WaEditText;
import com.whatsapp.mentions.MentionableEntry;
import com.whatsapp.payments.ui.widget.PaymentAmountInputField;
import com.whatsapp.status.widget.StatusEditText;
import com.whatsapp.text.FinalBackspaceAwareEntry;
import com.whatsapp.wds.components.edittext.WDSEditText;

/* renamed from: X.3Rn  reason: invalid class name */
public abstract class AnonymousClass3Rn extends C007603k implements AnonymousClass009 {
    public AnonymousClass031 A00;
    public boolean A01;

    public static void A04(AnonymousClass10E r1, WaEditText waEditText) {
        waEditText.A00 = (C18030ve) r1.A04.get();
        waEditText.A03 = (C18000vb) r1.ABz.get();
        waEditText.A02 = (AnonymousClass11C) r1.AAp.get();
    }

    public void A0G() {
        if (this instanceof AnonymousClass4C7) {
            AnonymousClass4C7 r2 = (AnonymousClass4C7) this;
            if (r2 instanceof FinalBackspaceAwareEntry) {
                FinalBackspaceAwareEntry finalBackspaceAwareEntry = (FinalBackspaceAwareEntry) r2;
                if (!finalBackspaceAwareEntry.A02) {
                    finalBackspaceAwareEntry.A02 = true;
                    AnonymousClass10E A0X = C72463Mc.A0X(finalBackspaceAwareEntry);
                    A04(A0X, finalBackspaceAwareEntry);
                    finalBackspaceAwareEntry.A00 = AnonymousClass10E.A8r(A0X);
                }
            } else if (r2 instanceof C77893rh) {
                C77893rh r22 = (C77893rh) r2;
                if (r22 instanceof StatusEditText) {
                    StatusEditText statusEditText = (StatusEditText) r22;
                    if (!statusEditText.A00) {
                        statusEditText.A00 = true;
                        AnonymousClass10E A0X2 = C72463Mc.A0X(statusEditText);
                        A04(A0X2, statusEditText);
                        statusEditText.A00 = AnonymousClass10E.A8r(A0X2);
                        statusEditText.A03 = AnonymousClass3Ma.A0w(A0X2.A00);
                        statusEditText.A00 = AnonymousClass10E.A17(A0X2);
                        statusEditText.A02 = AnonymousClass3Ma.A0c(A0X2);
                        statusEditText.A04 = AnonymousClass3MZ.A13(A0X2);
                        statusEditText.A0H = (C32091gc) A0X2.A6G.get();
                        statusEditText.A09 = AnonymousClass3Ma.A0d(A0X2);
                        statusEditText.A08 = AnonymousClass3Ma.A0U(A0X2);
                        statusEditText.A0J = C000200d.A00(A0X2.AFb);
                        statusEditText.A07 = AnonymousClass3MZ.A0M(A0X2.AFb);
                        statusEditText.A0A = AnonymousClass3MY.A0V(A0X2);
                        statusEditText.A0I = AnonymousClass3Ma.A0r(A0X2);
                    }
                } else if (!r22.A00) {
                    r22.A00 = true;
                    AnonymousClass033 A0T = AnonymousClass3MX.A0T(r22);
                    MentionableEntry mentionableEntry = (MentionableEntry) r22;
                    AnonymousClass10E r1 = ((C27691Xc) A0T).A10;
                    A04(r1, mentionableEntry);
                    mentionableEntry.A00 = AnonymousClass10E.A8r(r1);
                    mentionableEntry.A03 = AnonymousClass3Ma.A0w(r1.A00);
                    mentionableEntry.A00 = AnonymousClass10E.A17(r1);
                    mentionableEntry.A02 = AnonymousClass3Ma.A0c(r1);
                    mentionableEntry.A04 = AnonymousClass3MZ.A13(r1);
                    mentionableEntry.A0H = (C32091gc) r1.A6G.get();
                    mentionableEntry.A09 = AnonymousClass3Ma.A0d(r1);
                    mentionableEntry.A08 = AnonymousClass3Ma.A0U(r1);
                    mentionableEntry.A0J = C000200d.A00(r1.AFb);
                    mentionableEntry.A07 = AnonymousClass3MZ.A0M(r1.AFb);
                    mentionableEntry.A0A = AnonymousClass3MY.A0V(r1);
                    mentionableEntry.A0I = AnonymousClass3Ma.A0r(r1);
                }
            } else if (r2 instanceof AnonymousClass3gl) {
                AnonymousClass3gl r23 = (AnonymousClass3gl) r2;
                if (r23 instanceof PaymentAmountInputField) {
                    PaymentAmountInputField paymentAmountInputField = (PaymentAmountInputField) r23;
                    if (!paymentAmountInputField.A0F) {
                        paymentAmountInputField.A0F = true;
                        AnonymousClass10E A0X3 = C72463Mc.A0X(paymentAmountInputField);
                        A04(A0X3, paymentAmountInputField);
                        paymentAmountInputField.A07 = AnonymousClass10E.A12(A0X3);
                        paymentAmountInputField.A08 = AnonymousClass10E.A6Q(A0X3);
                    }
                } else if (!r23.A00) {
                    r23.A00 = true;
                    A04(C72463Mc.A0X(r23), r23);
                }
            } else if (r2 instanceof AnonymousClass3gk) {
                AnonymousClass3gk r24 = (AnonymousClass3gk) r2;
                if (!r24.A00) {
                    r24.A00 = true;
                    A04(C72463Mc.A0X(r24), r24);
                }
            } else if (!r2.A00) {
                r2.A00 = true;
                A04(((C27691Xc) AnonymousClass3MX.A0T(r2)).A10, (WaEditText) r2);
            }
        } else if (!this.A01) {
            this.A01 = true;
            ((WDSEditText) this).A00 = AnonymousClass10E.A8r(((C27691Xc) ((AnonymousClass033) generatedComponent())).A10);
        }
    }

    public final Object generatedComponent() {
        AnonymousClass031 r0 = this.A00;
        if (r0 == null) {
            r0 = AnonymousClass3MW.A0u(this);
            this.A00 = r0;
        }
        return r0.generatedComponent();
    }

    public static void A05(C74783cd r3) {
        r3.A0G();
        r3.A01 = C18020vd.A05(C18040vf.A02, r3.A00, 6616);
        r3.A0G();
    }
}
