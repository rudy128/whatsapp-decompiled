package X;

import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.components.SelectionCheckView;
import java.lang.ref.WeakReference;
import java.util.List;

/* renamed from: X.3WH  reason: invalid class name */
public final class AnonymousClass3WH extends C41251w3 {
    public WeakReference A00;
    public C22821Di A01;
    public final AnonymousClass4K1 A02;

    /* JADX WARNING: type inference failed for: r0v1, types: [X.1uf, java.lang.Object] */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass3WH(AnonymousClass4K1 r2) {
        super((C40411uf) new Object());
        C18070vi.A0d(r2, 1);
        this.A02 = r2;
    }

    public /* bridge */ /* synthetic */ C42011xT BqY(ViewGroup viewGroup, int i) {
        C37451pZ r4;
        C18070vi.A0d(viewGroup, 0);
        AnonymousClass4K1 r2 = this.A02;
        View A0B = AnonymousClass3MX.A0B(AnonymousClass3MZ.A0D(viewGroup), viewGroup, 2131624629, false);
        C22821Di r5 = this.A01;
        WeakReference weakReference = this.A00;
        if (weakReference != null) {
            r4 = (C37451pZ) weakReference.get();
        } else {
            r4 = null;
        }
        List list = C42011xT.A0I;
        AnonymousClass10E r0 = r2.A00.A02;
        return new AnonymousClass3ZV(A0B, AnonymousClass3MZ.A0T(r0.A00), AnonymousClass3MZ.A0g(r0), r4, r5);
    }

    public /* bridge */ /* synthetic */ void A0R(C42011xT r4) {
        AnonymousClass3ZV r42 = (AnonymousClass3ZV) r4;
        C18070vi.A0d(r42, 0);
        r42.A00 = false;
        ((SelectionCheckView) r42.A09.getValue()).A04(false, r42.A00);
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0082  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x009c  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00ac  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00ae  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ void Bmc(X.C42011xT r12, int r13) {
        /*
            r11 = this;
            X.3ZV r12 = (X.AnonymousClass3ZV) r12
            r2 = 0
            java.lang.Object r1 = X.C72463Mc.A0l(r11, r12, r13)
            X.4Uw r1 = (X.C87254Uw) r1
            X.C18070vi.A0d(r1, r2)
            boolean r0 = r1.A03
            r6 = 0
            if (r0 == 0) goto L_0x00d0
            X.0vl r0 = r12.A04
            int r5 = X.C72453Mb.A0I(r0)
        L_0x0017:
            boolean r0 = r1.A04
            if (r0 == 0) goto L_0x0021
            X.0vl r0 = r12.A04
            int r6 = X.C72453Mb.A0I(r0)
        L_0x0021:
            android.view.View r3 = r12.A0H
            X.C18070vi.A0W(r3)
            X.0vl r0 = r12.A07
            int r4 = X.C72453Mb.A0I(r0)
            int r0 = X.C72453Mb.A0I(r0)
            X.C72463Mc.A15(r3, r4, r0)
            android.view.ViewGroup$LayoutParams r0 = r3.getLayoutParams()
            if (r0 == 0) goto L_0x00d3
            android.view.ViewGroup$MarginLayoutParams r0 = (android.view.ViewGroup.MarginLayoutParams) r0
            r0.topMargin = r5
            r0.bottomMargin = r6
            r3.setLayoutParams(r0)
            X.1Me r5 = r12.A02
            X.1E7 r7 = r1.A01
            int r9 = r1.A00
            X.1yg r6 = r5.A0D(r7, r9)
            java.lang.Integer r4 = r6.A00
            java.lang.Integer r0 = X.AnonymousClass00R.A0N
            if (r4 != r0) goto L_0x00b9
            java.lang.String r4 = X.AnonymousClass3MX.A17(r5, r7)
            boolean r0 = X.AnonymousClass1YF.A0T(r4)
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x00b9
            X.0vl r0 = r12.A06
            java.lang.Object r0 = r0.getValue()
            X.1xh r0 = (X.C42141xh) r0
            com.whatsapp.TextEmojiLabel r0 = r0.A01
            r0.setText(r4)
        L_0x006b:
            X.1pZ r4 = r12.A03
            if (r4 == 0) goto L_0x0078
            X.0vl r0 = r12.A08
            android.widget.ImageView r0 = X.AnonymousClass3MX.A0J(r0)
            r4.A07(r0, r7)
        L_0x0078:
            X.0vl r0 = r12.A0A
            android.view.View r5 = X.AnonymousClass3MW.A0A(r0)
            X.4ZN r4 = r1.A02
            if (r4 != 0) goto L_0x00ae
            r0 = 8
        L_0x0084:
            r5.setVisibility(r0)
            X.0vl r0 = r12.A09
            java.lang.Object r5 = r0.getValue()
            com.whatsapp.components.SelectionCheckView r5 = (com.whatsapp.components.SelectionCheckView) r5
            boolean r4 = r1.A05
            boolean r0 = r12.A00
            r5.A04(r4, r0)
            r12.A00 = r2
            X.1Di r0 = r12.A0B
            if (r0 == 0) goto L_0x00ac
            X.5VF r2 = new X.5VF
            r2.<init>(r1, r12, r0)
            r1 = 12
            X.4dA r0 = new X.4dA
            r0.<init>(r2, r1)
        L_0x00a8:
            r3.setOnClickListener(r0)
            return
        L_0x00ac:
            r0 = 0
            goto L_0x00a8
        L_0x00ae:
            java.lang.Object r0 = r0.getValue()
            android.widget.TextView r0 = (android.widget.TextView) r0
            X.AnonymousClass4ZN.A02(r3, r0, r4)
            r0 = 0
            goto L_0x0084
        L_0x00b9:
            X.0vl r0 = r12.A06
            java.lang.Object r5 = r0.getValue()
            X.1xh r5 = (X.C42141xh) r5
            java.lang.Object r0 = r0.getValue()
            X.1xh r0 = (X.C42141xh) r0
            boolean r10 = r0.A0C(r7)
            r8 = 0
            r5.A04(r6, r7, r8, r9, r10)
            goto L_0x006b
        L_0x00d0:
            r5 = 0
            goto L_0x0017
        L_0x00d3:
            java.lang.String r0 = "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams"
            java.lang.NullPointerException r0 = X.AnonymousClass000.A0s(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3WH.Bmc(X.1xT, int):void");
    }

    public long A0M(int i) {
        return ((C87254Uw) A0U(i)).A01.A0J();
    }
}
