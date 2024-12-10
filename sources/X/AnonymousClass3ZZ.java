package X;

import android.view.View;
import androidx.cardview.widget.CardView;

/* renamed from: X.3ZZ  reason: invalid class name */
public abstract class AnonymousClass3ZZ extends C42011xT {
    public final View A00;

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0013, code lost:
        if ((r9 instanceof X.C445323u) != false) goto L_0x0015;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0B(java.lang.Object r9) {
        /*
            r8 = this;
            boolean r0 = r8 instanceof X.AnonymousClass3s5
            if (r0 == 0) goto L_0x0074
            r0 = r8
            X.3s5 r0 = (X.AnonymousClass3s5) r0
            boolean r1 = r9 instanceof X.C438521e
            r3 = 1
            if (r1 != 0) goto L_0x0015
            boolean r1 = r9 instanceof X.C438121a
            if (r1 != 0) goto L_0x0015
            boolean r2 = r9 instanceof X.C445323u
            r1 = 0
            if (r2 == 0) goto L_0x0016
        L_0x0015:
            r1 = 1
        L_0x0016:
            X.C17960vV.A0C(r1)
            android.view.View r1 = r0.A00
            boolean r2 = r1 instanceof android.widget.FrameLayout
            X.C17960vV.A0C(r2)
            java.lang.String r2 = "null cannot be cast to non-null type com.whatsapp.protocol.message.FMessageMedia"
            X.C18070vi.A0z(r9, r2)
            r6 = r9
            X.21V r6 = (X.AnonymousClass21V) r6
            java.lang.String r2 = "null cannot be cast to non-null type android.widget.FrameLayout"
            X.C18070vi.A0z(r1, r2)
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            X.3uL r2 = r0.A00
            if (r2 != 0) goto L_0x00ce
            boolean r2 = r6 instanceof X.C438521e
            if (r2 == 0) goto L_0x004c
            android.content.Context r3 = r0.A02
            X.1GP r4 = r0.A03
            X.21e r6 = (X.C438521e) r6
            X.5cR r5 = r0.A04
            int r7 = r0.A01
            X.3tE r2 = new X.3tE
            r2.<init>(r3, r4, r5, r6, r7)
        L_0x0046:
            r0.A00 = r2
            r1.addView(r2)
        L_0x004b:
            return
        L_0x004c:
            boolean r2 = r6 instanceof X.C438121a
            if (r2 == 0) goto L_0x0060
            android.content.Context r3 = r0.A02
            X.1GP r4 = r0.A03
            X.21a r6 = (X.C438121a) r6
            X.5cR r5 = r0.A04
            int r7 = r0.A01
            X.3tg r2 = new X.3tg
            r2.<init>(r3, r4, r5, r6, r7)
            goto L_0x0046
        L_0x0060:
            boolean r2 = r6 instanceof X.C445323u
            if (r2 == 0) goto L_0x00c7
            android.content.Context r3 = r0.A02
            X.1GP r4 = r0.A03
            X.23u r6 = (X.C445323u) r6
            X.5cR r5 = r0.A04
            int r7 = r0.A01
            X.3tT r2 = new X.3tT
            r2.<init>(r3, r4, r5, r6, r7)
            goto L_0x0046
        L_0x0074:
            boolean r1 = r8 instanceof X.C78063s4
            boolean r0 = r9 instanceof X.AnonymousClass4TT
            if (r1 == 0) goto L_0x0090
            if (r0 == 0) goto L_0x004b
            X.4TT r9 = (X.AnonymousClass4TT) r9
            if (r9 == 0) goto L_0x004b
            android.view.View r1 = r8.A00
            boolean r0 = r1 instanceof X.C79133ud
        L_0x0084:
            if (r0 == 0) goto L_0x004b
            X.3ul r1 = (X.C79163ul) r1
            if (r1 == 0) goto L_0x004b
            X.210 r0 = r9.A01
            r1.A02(r0)
            return
        L_0x0090:
            if (r0 == 0) goto L_0x004b
            X.4TT r9 = (X.AnonymousClass4TT) r9
            if (r9 == 0) goto L_0x004b
            int r0 = r9.A00
            boolean r4 = X.C17890vO.A1R(r0)
            android.view.View r3 = r8.A0H
            android.view.ViewGroup$LayoutParams r2 = r3.getLayoutParams()
            android.content.res.Resources r1 = X.AnonymousClass000.A0Y(r3)
            r0 = 2131166258(0x7f070432, float:1.7946756E38)
            int r0 = r1.getDimensionPixelSize(r0)
            r2.height = r0
            if (r4 == 0) goto L_0x00bc
            r0 = -1
        L_0x00b2:
            r2.width = r0
            r3.setLayoutParams(r2)
            android.view.View r1 = r8.A00
            boolean r0 = r1 instanceof X.C79123uc
            goto L_0x0084
        L_0x00bc:
            android.content.Context r1 = r3.getContext()
            r0 = 72
            int r0 = X.C88264Yz.A01(r1, r0)
            goto L_0x00b2
        L_0x00c7:
            java.lang.String r0 = "InteractiveMessageCarouselViewHolder/createConversationRowInteractive; unsupported message type"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0k(r0)
            throw r0
        L_0x00ce:
            X.206 r9 = (X.AnonymousClass206) r9
            r2.A2V(r9, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3ZZ.A0B(java.lang.Object):void");
    }

    public AnonymousClass3ZZ(CardView cardView) {
        super(cardView);
        View A0F = AnonymousClass3MY.A0F(cardView);
        C18070vi.A0X(A0F);
        this.A00 = A0F;
    }
}
