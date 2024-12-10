package X;

import android.animation.ValueAnimator;
import com.whatsapp.biz.catalog.view.widgets.QuantitySelector;

/* renamed from: X.8jQ  reason: invalid class name and case insensitive filesystem */
public final class C168658jQ extends C168858jn {
    public final AnonymousClass11S A00;
    public final B7L A01;
    public final B7Q A02;
    public final C18100vl A03;
    public final C18100vl A04;
    public final AnonymousClass9PS A05;
    public final AnonymousClass1LU A06;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C168658jQ(android.view.View r13, X.AnonymousClass11S r14, X.C20114A7x r15, X.C182919Wf r16, X.C20005A2v r17, X.C22536BBt r18, X.B7L r19, X.C19973A1i r20, X.C189919k4 r21, X.B7Q r22, X.C22369B4x r23, X.AnonymousClass9PS r24, X.C18000vb r25, X.AnonymousClass1LU r26, com.whatsapp.jid.UserJid r27) {
        /*
            r12 = this;
            r0 = 1
            r10 = r25
            X.C18070vi.A0d(r10, r0)
            r0 = 2
            r4 = r15
            r6 = r17
            r8 = r20
            X.C72473Md.A1M(r6, r15, r8, r0)
            r0 = 6
            r3 = r13
            X.C18070vi.A0d(r13, r0)
            r0 = 9
            r1 = r23
            X.C18070vi.A0d(r1, r0)
            r0 = r26
            X.C72473Md.A1L(r14, r0)
            r2 = r12
            r11 = r27
            r5 = r16
            r7 = r18
            r9 = r21
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r12.A00 = r14
            r12.A06 = r0
            r0 = r24
            r12.A05 = r0
            r0 = r19
            r12.A01 = r0
            r0 = r22
            r12.A02 = r0
            X.Atg r0 = new X.Atg
            r0.<init>(r13)
            X.0vm r0 = X.AnonymousClass1DF.A01(r0)
            r12.A03 = r0
            X.AwT r0 = new X.AwT
            r0.<init>(r13, r12, r1)
            X.0vm r0 = X.AnonymousClass1DF.A01(r0)
            r12.A04 = r0
            r0 = 45
            X.AnonymousClass3Ma.A1C(r13, r12, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C168658jQ.<init>(android.view.View, X.11S, X.A7x, X.9Wf, X.A2v, X.BBt, X.B7L, X.A1i, X.9k4, X.B7Q, X.B4x, X.9PS, X.0vb, X.1LU, com.whatsapp.jid.UserJid):void");
    }

    public void A0C(C168738jb r6) {
        C18070vi.A0d(r6, 0);
        super.A0C(r6);
        ((QuantitySelector) AnonymousClass3MX.A14(this.A04)).A04(r6.A00, r6.A01.A01);
    }

    public final void A0E() {
        QuantitySelector quantitySelector = (QuantitySelector) AnonymousClass3MX.A14(this.A04);
        if (quantitySelector.A0C) {
            quantitySelector.A0E.removeCallbacksAndMessages((Object) null);
            ValueAnimator valueAnimator = quantitySelector.A02;
            if (valueAnimator != null) {
                valueAnimator.end();
                quantitySelector.A02.removeAllUpdateListeners();
                quantitySelector.A0B = false;
            }
            quantitySelector.A0A = AnonymousClass00R.A00;
            quantitySelector.A04(quantitySelector.A01, quantitySelector.A00);
        }
    }
}
