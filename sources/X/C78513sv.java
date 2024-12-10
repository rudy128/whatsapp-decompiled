package X;

/* renamed from: X.3sv  reason: invalid class name and case insensitive filesystem */
public class C78513sv extends C78893tr {
    public static final AnonymousClass4NA A03 = new AnonymousClass4NA(2131897853, 2131889532, 2131889464);
    public static final AnonymousClass4NA A04 = new AnonymousClass4NA(2131898077, 2131889534, 2131889466);
    public static final AnonymousClass4NA A05 = new AnonymousClass4NA(2131897850, 2131889531, 2131889463);
    public static final AnonymousClass4NA A06 = new AnonymousClass4NA(2131898075, 2131889533, 2131889465);
    public AnonymousClass1VP A00;
    public AnonymousClass00H A01;
    public boolean A02;

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
            this.A00 = (AnonymousClass1VP) r3.A1l.get();
            this.A01 = C000200d.A00(r3.ABV);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x003f, code lost:
        if (X.C18020vd.A05(X.C18040vf.A02, r10.A0F, 6307) == false) goto L_0x0041;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A2i() {
        /*
            r10 = this;
            X.206 r7 = r10.A0I
            X.22O r7 = (X.AnonymousClass22O) r7
            java.util.List r1 = r7.A00
            boolean r0 = r1.isEmpty()
            r5 = 0
            if (r0 != 0) goto L_0x001a
            java.lang.Object r0 = r1.get(r5)
            X.9Bw r0 = (X.C178119Bw) r0
            boolean r0 = r0.A0R()
            if (r0 == 0) goto L_0x001a
            r5 = 1
        L_0x001a:
            java.util.List r4 = r7.A00
            boolean r0 = r4.isEmpty()
            r1 = 0
            if (r0 != 0) goto L_0x0030
            java.lang.Object r0 = r4.get(r1)
            X.9Bw r0 = (X.C178119Bw) r0
            boolean r0 = r0.A0U()
            if (r0 == 0) goto L_0x0030
            r1 = 1
        L_0x0030:
            r3 = 1
            r8 = 0
            if (r1 == 0) goto L_0x0041
            X.0ve r2 = r10.A0F
            r1 = 6307(0x18a3, float:8.838E-42)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            r2 = 1
            if (r0 != 0) goto L_0x0042
        L_0x0041:
            r2 = 0
        L_0x0042:
            int r1 = r7.A17()
            if (r1 == 0) goto L_0x00db
            if (r1 == r3) goto L_0x00d7
            r0 = 2
            if (r1 == r0) goto L_0x00d3
            X.4NA r1 = A03
        L_0x004f:
            if (r5 == 0) goto L_0x00b6
            r9 = 2131887858(0x7f1206f2, float:1.9410335E38)
        L_0x0054:
            X.11P r2 = r10.A0u
            long r0 = r7.A0I
            long r1 = r2.A09(r0)
            android.widget.TextView r6 = r10.A00
            X.0vb r5 = r10.A0D
            android.content.Context r4 = r10.getContext()
            java.lang.Object[] r3 = new java.lang.Object[r3]
            X.0vb r0 = r10.A0D
            java.lang.String r0 = X.A8I.A00(r0, r1)
            r3[r8] = r0
            java.lang.String r0 = r4.getString(r9, r3)
            java.lang.String r0 = X.A8I.A01(r5, r0, r1)
            r6.setText(r0)
            r0 = 15
            X.C90074dU.A01(r6, r10, r7, r0)
            X.0vb r5 = r10.A0D
            android.content.Context r4 = r10.getContext()
            boolean r0 = r7.A18()
            r3 = 2131232191(0x7f0805bf, float:1.8080484E38)
            if (r0 == 0) goto L_0x0090
            r3 = 2131232108(0x7f08056c, float:1.8080316E38)
        L_0x0090:
            android.content.Context r2 = r10.getContext()
            r1 = 2130970567(0x7f0407c7, float:1.7549848E38)
            r0 = 2131101886(0x7f0608be, float:1.7816194E38)
            int r1 = X.AnonymousClass1YL.A00(r2, r1, r0)
            android.graphics.drawable.Drawable r0 = X.AnonymousClass3MX.A06(r4, r3)
            android.graphics.drawable.Drawable r2 = X.AnonymousClass4aX.A05(r4, r0, r1)
            boolean r0 = X.AnonymousClass3MW.A1Z(r5)
            r1 = 0
            if (r0 == 0) goto L_0x00df
            X.3cP r0 = new X.3cP
            r0.<init>(r2, r5)
            r6.setCompoundDrawablesWithIntrinsicBounds(r1, r1, r0, r1)
            return
        L_0x00b6:
            if (r2 == 0) goto L_0x00bb
            int r9 = r1.A00
            goto L_0x0054
        L_0x00bb:
            boolean r0 = r4.isEmpty()
            if (r0 != 0) goto L_0x00d0
            java.lang.Object r0 = r4.get(r8)
            X.9Bw r0 = (X.C178119Bw) r0
            boolean r0 = r0.A0S()
            if (r0 == 0) goto L_0x00d0
            int r9 = r1.A01
            goto L_0x0054
        L_0x00d0:
            int r9 = r1.A02
            goto L_0x0054
        L_0x00d3:
            X.4NA r1 = A04
            goto L_0x004f
        L_0x00d7:
            X.4NA r1 = A05
            goto L_0x004f
        L_0x00db:
            X.4NA r1 = A06
            goto L_0x004f
        L_0x00df:
            r6.setCompoundDrawablesWithIntrinsicBounds(r2, r1, r1, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C78513sv.A2i():void");
    }

    public AnonymousClass22O getFMessage() {
        return (AnonymousClass22O) this.A0I;
    }

    public void setFMessage(AnonymousClass206 r2) {
        C17960vV.A0D(r2 instanceof AnonymousClass22O);
        this.A0I = r2;
    }
}
