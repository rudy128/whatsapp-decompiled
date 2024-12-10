package X;

import android.view.View;
import android.view.ViewGroup;
import java.util.List;

/* renamed from: X.3X3  reason: invalid class name */
public final class AnonymousClass3X3 extends C38391rD {
    public final C40431uh A00 = new C40431uh((C40411uf) new Object(), (C38391rD) this);
    public final AnonymousClass4J2 A01;
    public final AnonymousClass5XB A02;
    public final C98854rp A03 = new Object();
    public final C37451pZ A04;
    public final Integer A05;
    public final Integer A06;

    /* JADX WARNING: type inference failed for: r0v1, types: [X.4rp, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r1v0, types: [X.1uf, java.lang.Object] */
    public AnonymousClass3X3(AnonymousClass4J2 r3, AnonymousClass5XB r4, C37451pZ r5, Integer num, Integer num2) {
        C18070vi.A0f(r3, 1, r4);
        this.A01 = r3;
        this.A04 = r5;
        this.A05 = num;
        this.A02 = r4;
        this.A06 = num2;
    }

    public /* bridge */ /* synthetic */ C42011xT BqY(ViewGroup viewGroup, int i) {
        ViewGroup viewGroup2 = viewGroup;
        C18070vi.A0d(viewGroup2, 0);
        AnonymousClass4J2 r2 = this.A01;
        View A0B = AnonymousClass3MX.A0B(AnonymousClass3MZ.A0D(viewGroup2), viewGroup2, 2131625529, false);
        Integer num = this.A05;
        Integer num2 = this.A06;
        List list = C42011xT.A0I;
        AnonymousClass10E r1 = r2.A00.A01;
        C18030ve A8r = AnonymousClass10E.A8r(r1);
        AnonymousClass11S A17 = AnonymousClass10E.A17(r1);
        AnonymousClass1CJ A0d = AnonymousClass3Ma.A0d(r1);
        AnonymousClass1KW A0f = AnonymousClass3Ma.A0f(r1);
        return new C74293Zg(A0B, A17, AnonymousClass3MZ.A0T(r1.A00), AnonymousClass3MZ.A0e(r1), AnonymousClass10E.A4z(r1), AnonymousClass3MZ.A0g(r1), A0d, AnonymousClass3MY.A0V(r1), A0f, A8r, num, num2, AnonymousClass3MZ.A1B(r1), AnonymousClass3MZ.A1C(r1));
    }

    public int A0Q() {
        return this.A00.A02.size();
    }

    public /* bridge */ /* synthetic */ void A0R(C42011xT r2) {
        C74293Zg r22 = (C74293Zg) r2;
        C18070vi.A0d(r22, 0);
        AnonymousClass3Ma.A1R(r22.A00);
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x009c  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00b5  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00d3  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0116  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0154  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x016c  */
    /* JADX WARNING: Removed duplicated region for block: B:47:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ void Bmc(X.C42011xT r20, int r21) {
        /*
            r19 = this;
            r8 = r20
            X.3Zg r8 = (X.C74293Zg) r8
            r7 = 0
            X.C18070vi.A0d(r8, r7)
            r6 = r19
            X.1uh r0 = r6.A00
            java.util.List r0 = r0.A02
            r1 = r21
            java.lang.Object r5 = r0.get(r1)
            X.C18070vi.A0X(r5)
            X.4U3 r5 = (X.AnonymousClass4U3) r5
            X.1pZ r0 = r6.A04
            X.5XB r4 = r6.A02
            X.AnonymousClass3Ma.A1N(r5, r7, r0)
            X.1OB r1 = r8.A00
            r15 = 0
            if (r1 == 0) goto L_0x0028
            r1.BEM(r15)
        L_0x0028:
            X.A2B r3 = r5.A00
            X.1M9 r1 = r8.A06
            com.whatsapp.jid.GroupJid r2 = r3.A02
            X.1MA r1 = r1.A03
            X.1E7 r1 = r1.A0A(r2)
            if (r1 == 0) goto L_0x01b9
            X.C74293Zg.A00(r8, r0, r3, r1)
            X.C74293Zg.A01(r8, r1)
        L_0x003c:
            X.1CJ r10 = r8.A08
            int r1 = r10.A06(r2)
            r0 = 3
            if (r1 != r0) goto L_0x0190
            X.0vl r0 = r8.A0K
            java.lang.Object r0 = r0.getValue()
            X.1xh r0 = (X.C42141xh) r0
            r1 = 2131888506(0x7f12097a, float:1.941165E38)
            com.whatsapp.TextEmojiLabel r0 = r0.A01
            r0.setText(r1)
        L_0x0055:
            int r1 = r10.A06(r2)
            r0 = 3
            if (r1 == r0) goto L_0x0183
            X.1MZ r0 = r8.A09
            X.1MW r0 = r0.A08
            X.2tp r1 = r0.A0C(r2)
            X.11S r0 = r8.A03
            boolean r0 = r1.A0W(r0)
            if (r0 == 0) goto L_0x0170
            X.1Me r1 = r8.A07
            r0 = 1
            java.lang.String r1 = X.C24921Me.A04(r1, r2, r0, r0)
        L_0x0073:
            if (r1 == 0) goto L_0x0183
            X.0vl r0 = r8.A0J
            X.C72453Mb.A1U(r0, r7)
            java.lang.Object r0 = r0.getValue()
            com.whatsapp.TextEmojiLabel r0 = (com.whatsapp.TextEmojiLabel) r0
            r0.A0S(r1, r15, r7, r7)
        L_0x0083:
            X.0vl r9 = r8.A0E
            android.view.View r13 = X.AnonymousClass3MW.A0A(r9)
            android.view.View r0 = X.AnonymousClass3MW.A0A(r9)
            android.content.Context r14 = X.AnonymousClass3MY.A04(r0)
            java.lang.Integer r0 = r8.A0C
            java.lang.String r12 = r3.A06
            r11 = 1
            int r1 = r0.intValue()
            if (r1 == r7) goto L_0x016c
            r0 = 2131886261(0x7f1200b5, float:1.9407096E38)
            if (r1 == r11) goto L_0x00a4
            r0 = 2131886262(0x7f1200b6, float:1.9407098E38)
        L_0x00a4:
            java.lang.String r0 = X.C17890vO.A0R(r14, r12, r11, r7, r0)
            X.C18070vi.A0X(r0)
        L_0x00ab:
            X.AnonymousClass1Y5.A06(r13, r0)
            int r1 = r10.A06(r2)
            r0 = 3
            if (r1 == r0) goto L_0x014c
            X.0vl r2 = r8.A0I
            boolean r0 = X.C72453Mb.A1a(r2)
            if (r0 != 0) goto L_0x014c
            android.view.View r1 = X.AnonymousClass3MW.A0A(r9)
            r0 = 6
            X.C90004dN.A00(r1, r4, r3, r0)
            android.view.View r1 = X.AnonymousClass3MW.A0A(r9)
            r0 = 0
        L_0x00ca:
            r1.setVisibility(r0)
            boolean r0 = X.C72453Mb.A1a(r2)
            if (r0 == 0) goto L_0x0110
            boolean r0 = r5.A02
            X.0vl r3 = r8.A0H
            android.view.View r1 = X.C72463Mc.A0O(r3)
            X.3cj r1 = (X.C74793cj) r1
            if (r0 == 0) goto L_0x0126
            r0 = 2131233483(0x7f080acb, float:1.8083105E38)
            r1.setIcon((int) r0)
            android.view.View r2 = X.C72463Mc.A0O(r3)
            X.3cj r2 = (X.C74793cj) r2
            android.view.View r0 = r8.A01
            android.content.Context r1 = r0.getContext()
            r0 = 2131101221(0x7f060625, float:1.7814846E38)
            int r0 = X.C19740yt.A00(r1, r0)
            r2.setIconColor(r0)
            android.view.View r1 = X.C72463Mc.A0O(r3)
            X.3cj r1 = (X.C74793cj) r1
            r0 = 2131891171(0x7f1213e3, float:1.9417055E38)
        L_0x0104:
            r1.setDescription((int) r0)
            android.view.View r1 = X.C72463Mc.A0O(r3)
            r0 = 18
            X.C89894dC.A00(r1, r5, r0)
        L_0x0110:
            java.lang.Integer r1 = r6.A05
            java.lang.Integer r0 = X.AnonymousClass00R.A00
            if (r1 != r0) goto L_0x0125
            android.view.View r0 = X.AnonymousClass3MW.A0A(r9)
            r0.setOnClickListener(r15)
            android.view.View r1 = X.AnonymousClass3MW.A0A(r9)
            r0 = 4
            r1.setVisibility(r0)
        L_0x0125:
            return
        L_0x0126:
            r0 = 2131233484(0x7f080acc, float:1.8083107E38)
            r1.setIcon((int) r0)
            android.view.View r2 = X.C72463Mc.A0O(r3)
            X.3cj r2 = (X.C74793cj) r2
            android.view.View r0 = r8.A01
            android.content.Context r1 = r0.getContext()
            r0 = 2131103152(0x7f060db0, float:1.7818762E38)
            int r0 = X.C19740yt.A00(r1, r0)
            r2.setIconColor(r0)
            android.view.View r1 = X.C72463Mc.A0O(r3)
            X.3cj r1 = (X.C74793cj) r1
            r0 = 2131891173(0x7f1213e5, float:1.9417059E38)
            goto L_0x0104
        L_0x014c:
            X.0vl r2 = r8.A0I
            boolean r0 = X.C72453Mb.A1a(r2)
            if (r0 == 0) goto L_0x015e
            X.0vl r0 = r8.A0G
            android.view.View r1 = X.C72463Mc.A0O(r0)
            r0 = 7
            X.C90004dN.A00(r1, r4, r3, r0)
        L_0x015e:
            android.view.View r0 = X.AnonymousClass3MW.A0A(r9)
            r0.setOnClickListener(r15)
            android.view.View r1 = X.AnonymousClass3MW.A0A(r9)
            r0 = 4
            goto L_0x00ca
        L_0x016c:
            java.lang.String r0 = ""
            goto L_0x00ab
        L_0x0170:
            X.0vl r0 = r8.A0J
            android.view.View r0 = X.AnonymousClass3MW.A0A(r0)
            android.content.res.Resources r1 = r0.getResources()
            r0 = 2131888617(0x7f1209e9, float:1.9411874E38)
            java.lang.String r1 = r1.getString(r0)
            goto L_0x0073
        L_0x0183:
            X.0vl r0 = r8.A0J
            android.view.View r1 = X.AnonymousClass3MW.A0A(r0)
            r0 = 8
            r1.setVisibility(r0)
            goto L_0x0083
        L_0x0190:
            X.0vl r1 = r8.A0K
            java.lang.Object r11 = r1.getValue()
            X.1xh r11 = (X.C42141xh) r11
            java.lang.String r12 = r3.A06
            android.view.View r0 = r8.A0H
            android.content.Context r9 = r0.getContext()
            java.lang.Object r0 = r1.getValue()
            X.1xh r0 = (X.C42141xh) r0
            com.whatsapp.TextEmojiLabel r0 = r0.A01
            android.text.TextPaint r1 = r0.getPaint()
            X.1KW r0 = r8.A0A
            java.lang.CharSequence r1 = X.C43251zV.A03(r9, r1, r0, r12)
            com.whatsapp.TextEmojiLabel r0 = r11.A01
            r0.setText(r1)
            goto L_0x0055
        L_0x01b9:
            X.1VW r13 = r8.A05
            X.0vl r1 = r8.A0F
            android.widget.ImageView r14 = X.AnonymousClass3MX.A0J(r1)
            android.view.View r1 = X.AnonymousClass3MW.A0A(r1)
            android.content.res.Resources r9 = r1.getResources()
            r1 = 2131168739(0x7f070de3, float:1.7951788E38)
            int r18 = r9.getDimensionPixelSize(r1)
            r17 = 2131231053(0x7f08014d, float:1.8078176E38)
            r16 = -1082130432(0xffffffffbf800000, float:-1.0)
            r13.A0A(r14, r15, r16, r17, r18)
            X.1pl r10 = r8.A02
            X.0wl r9 = r8.A0L
            com.whatsapp.community.ManageSubgroupsViewHolder$setSubgroup$1 r1 = new com.whatsapp.community.ManageSubgroupsViewHolder$setSubgroup$1
            r1.<init>(r8, r0, r3, r15)
            java.lang.Integer r0 = X.AnonymousClass00R.A00
            X.1e4 r0 = X.C30451dy.A02(r0, r9, r1, r10)
            r8.A00 = r0
            goto L_0x003c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3X3.Bmc(X.1xT, int):void");
    }
}
