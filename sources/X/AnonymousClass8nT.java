package X;

import android.widget.LinearLayout;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.WaImageView;

/* renamed from: X.8nT  reason: invalid class name */
public final class AnonymousClass8nT extends AnonymousClass3uP {
    public C170008nw A00;
    public A2A A01;
    public boolean A02;
    public final LinearLayout A03 = ((LinearLayout) C18070vi.A05(this, 2131428715));
    public final TextEmojiLabel A04 = C72453Mb.A0c(this, 2131428714);
    public final TextEmojiLabel A05 = C72453Mb.A0c(this, 2131428720);
    public final TextEmojiLabel A06 = C72453Mb.A0c(this, 2131428721);
    public final WaImageView A07 = ((WaImageView) C18070vi.A05(this, 2131428713));
    public final AnonymousClass21L A08;
    public final boolean A09;

    public int getUserNameInGroupLayoutOption() {
        return 1;
    }

    public final void setCallPermissionRequestUtil(A2A a2a) {
        C18070vi.A0d(a2a, 0);
        this.A01 = a2a;
    }

    public final void setNativeFlowAction(C170008nw r2) {
        C18070vi.A0d(r2, 0);
        this.A00 = r2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x007d  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x008d  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0099  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x009f  */
    /* JADX WARNING: Removed duplicated region for block: B:40:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void A00() {
        /*
            r9 = this;
            com.whatsapp.TextEmojiLabel r1 = r9.A06
            r0 = 2131887829(0x7f1206d5, float:1.9410276E38)
            r1.setText(r0)
            com.whatsapp.TextEmojiLabel r7 = r9.A05
            X.8nw r8 = r9.getNativeFlowAction()
            android.content.Context r6 = X.AnonymousClass3MY.A04(r9)
            X.21L r3 = r9.A08
            r0 = 1
            X.C18070vi.A0d(r3, r0)
            X.AEe r0 = X.A2A.A00(r3)
            if (r0 != 0) goto L_0x00c0
            X.0wS r1 = X.C18460wS.A00
        L_0x0020:
            r0 = 0
            X.C18070vi.A0d(r1, r0)
            java.util.Iterator r4 = r1.iterator()
        L_0x0028:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x00bd
            java.lang.Object r2 = r4.next()
            r0 = r2
            X.A2Y r0 = (X.A2Y) r0
            X.9IT r1 = r0.A00
            X.9IT r0 = X.AnonymousClass9IT.YES
            if (r1 != r0) goto L_0x0028
        L_0x003b:
            X.A2Y r2 = (X.A2Y) r2
            if (r2 == 0) goto L_0x00b8
            java.lang.Long r0 = r2.A01
            if (r0 == 0) goto L_0x00b8
            long r4 = r0.longValue()
        L_0x0047:
            r0 = 86400(0x15180, double:4.26873E-319)
            long r4 = r4 / r0
            int r2 = (int) r4
            X.205 r0 = r3.A0v
            X.1BI r1 = r0.A00
            r0 = 2131887828(0x7f1206d4, float:1.9410274E38)
            java.lang.String r0 = X.C170008nw.A00(r6, r8, r1, r2, r0)
            r7.setText(r0)
            com.whatsapp.TextEmojiLabel r4 = r9.A04
            X.8nw r0 = r9.getNativeFlowAction()
            android.content.Context r2 = X.AnonymousClass3MY.A04(r9)
            X.A2A r1 = r0.A02
            java.lang.Integer r0 = X.AnonymousClass00R.A00
            boolean r0 = r1.A03(r3, r0)
            if (r0 == 0) goto L_0x00a5
            r0 = 2131887826(0x7f1206d2, float:1.941027E38)
        L_0x0071:
            java.lang.String r0 = X.C18070vi.A0F(r2, r0)
        L_0x0075:
            r4.setText(r0)
            boolean r3 = r9.A09
            r2 = 1
            if (r3 != r2) goto L_0x009f
            r1 = 2131103150(0x7f060dae, float:1.7818758E38)
        L_0x0080:
            android.content.Context r0 = r9.getContext()
            X.AnonymousClass3MX.A1C(r0, r4, r1)
            com.whatsapp.WaImageView r1 = r9.A07
            r0 = 8
            if (r3 != r2) goto L_0x008e
            r0 = 0
        L_0x008e:
            r1.setVisibility(r0)
            android.widget.LinearLayout r1 = r9.A03
            r0 = 0
            r1.setOnClickListener(r0)
            if (r3 == 0) goto L_0x009e
            r0 = 26
            X.C89904dD.A00(r1, r9, r0)
        L_0x009e:
            return
        L_0x009f:
            if (r3 != 0) goto L_0x00cb
            r1 = 2131103156(0x7f060db4, float:1.781877E38)
            goto L_0x0080
        L_0x00a5:
            boolean r0 = r1.A02(r3)
            if (r0 == 0) goto L_0x00af
            r0 = 2131887827(0x7f1206d3, float:1.9410272E38)
            goto L_0x0071
        L_0x00af:
            X.A2Y r0 = r1.A01(r3)
            java.lang.String r0 = X.C170008nw.A01(r2, r0)
            goto L_0x0075
        L_0x00b8:
            X.9aE r0 = r8.A01
            long r4 = r0.A00
            goto L_0x0047
        L_0x00bd:
            r2 = 0
            goto L_0x003b
        L_0x00c0:
            java.lang.String r1 = r0.A00
            X.9Wq r0 = new X.9Wq
            r0.<init>(r1)
            java.util.List r1 = r0.A00
            goto L_0x0020
        L_0x00cb:
            X.3EW r0 = X.AnonymousClass3MW.A14()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass8nT.A00():void");
    }

    public void A1M() {
        if (!this.A02) {
            this.A02 = true;
            C27691Xc A0O = AnonymousClass3MY.A0O(this);
            AnonymousClass10E r3 = A0O.A10;
            AnonymousClass1K1 A0n = AnonymousClass3uQ.A0n(r3, A0O, this);
            AnonymousClass10G r1 = r3.A00;
            AnonymousClass3uQ.A16(r1, this);
            AnonymousClass3uQ.A0w(A0n, r3, r1, this);
            AnonymousClass3uQ.A12(r3, r1, this);
            AnonymousClass3uQ.A0y(A0n, r3, this, BE8.A0d(r3));
            AnonymousClass3uQ.A13(r3, r1, this, r3.ABq);
            AnonymousClass3uQ.A0x(A0n, r3, r1, this, r3.AIy);
            C19890zB r0 = C19890zB.A00;
            AnonymousClass3uQ.A0v(r0, r3, r1, A0O, this);
            AnonymousClass3uQ.A11(r3, r1, this);
            AnonymousClass3uQ.A15(r3, this);
            AnonymousClass3uQ.A0s(r0, A0n, r3, r1, this);
            AnonymousClass3uQ.A0u(r0, r3, r1, A0O, this);
            AnonymousClass3uQ.A0t(r0, A0n, r3, A0O, this);
            AnonymousClass3uQ.A10(r3, r1, this);
            AnonymousClass3uQ.A0z(r3, r1, A0O, this, AnonymousClass3uQ.A0o(r3));
            this.A01 = (A2A) r3.A1Y.get();
            this.A00 = (C170008nw) r3.AGg.get();
        }
    }

    public final A2A getCallPermissionRequestUtil() {
        A2A a2a = this.A01;
        if (a2a != null) {
            return a2a;
        }
        C18070vi.A11("callPermissionRequestUtil");
        throw null;
    }

    public final C170008nw getNativeFlowAction() {
        C170008nw r0 = this.A00;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("nativeFlowAction");
        throw null;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x004d, code lost:
        if (r1.A02(r5) != false) goto L_0x004f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass8nT(android.content.Context r3, X.C108875cR r4, X.AnonymousClass21L r5) {
        /*
            r2 = this;
            X.C18070vi.A0j(r3, r5)
            r2.<init>(r3, r4, r5)
            r2.A1M()
            r2.A08 = r5
            r0 = 2131428721(0x7f0b0571, float:1.8479094E38)
            com.whatsapp.TextEmojiLabel r0 = X.C72453Mb.A0c(r2, r0)
            r2.A06 = r0
            r0 = 2131428720(0x7f0b0570, float:1.8479092E38)
            com.whatsapp.TextEmojiLabel r0 = X.C72453Mb.A0c(r2, r0)
            r2.A05 = r0
            r0 = 2131428715(0x7f0b056b, float:1.8479082E38)
            android.view.View r0 = X.C18070vi.A05(r2, r0)
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            r2.A03 = r0
            r0 = 2131428714(0x7f0b056a, float:1.847908E38)
            com.whatsapp.TextEmojiLabel r0 = X.C72453Mb.A0c(r2, r0)
            r2.A04 = r0
            r0 = 2131428713(0x7f0b0569, float:1.8479078E38)
            android.view.View r0 = X.C18070vi.A05(r2, r0)
            com.whatsapp.WaImageView r0 = (com.whatsapp.WaImageView) r0
            r2.A07 = r0
            X.A2A r1 = r2.getCallPermissionRequestUtil()
            java.lang.Integer r0 = X.AnonymousClass00R.A00
            boolean r0 = r1.A03(r5, r0)
            if (r0 != 0) goto L_0x004f
            boolean r1 = r1.A02(r5)
            r0 = 0
            if (r1 == 0) goto L_0x0050
        L_0x004f:
            r0 = 1
        L_0x0050:
            r0 = r0 ^ 1
            r2.A09 = r0
            r2.A00()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass8nT.<init>(android.content.Context, X.5cR, X.21L):void");
    }

    public void A1u() {
        A00();
        super.A1u();
    }

    public void A2V(AnonymousClass206 r1, boolean z) {
        super.A2V(r1, z);
        if (z) {
            A00();
        }
    }

    public int getCenteredLayoutId() {
        return 2131624794;
    }

    public int getIncomingLayoutId() {
        return 2131624794;
    }

    public final AnonymousClass21L getMessage() {
        return this.A08;
    }

    public int getOutgoingLayoutId() {
        return 2131624794;
    }
}
