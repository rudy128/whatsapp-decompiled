package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import java.util.List;

/* renamed from: X.3X2  reason: invalid class name */
public final class AnonymousClass3X2 extends C38391rD {
    public List A00 = C18460wS.A00;
    public final AnonymousClass1L9 A01;
    public final C18000vb A02;
    public final C29681ch A03;
    public final AnonymousClass4OB A04;

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00fb, code lost:
        if (r1 == com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2AppealState.A01) goto L_0x00fd;
     */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0137  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void Bmc(X.C42011xT r12, int r13) {
        /*
            r11 = this;
            r0 = 0
            X.C18070vi.A0d(r12, r0)
            boolean r0 = r12 instanceof X.C74043Yh
            if (r0 == 0) goto L_0x002c
            r0 = r12
            X.3Yh r0 = (X.C74043Yh) r0
            com.whatsapp.WaTextView r2 = r0.A00
            java.util.List r0 = r11.A00
            java.lang.Object r1 = r0.get(r13)
            java.lang.String r0 = "null cannot be cast to non-null type com.whatsapp.product.newsletterenforcements.alerts.HeaderDataItem"
            X.C18070vi.A0z(r1, r0)
            X.455 r1 = (X.AnonymousClass455) r1
            int r0 = r1.A00
            r2.setText(r0)
            android.view.View r0 = r12.A0H
            android.content.Context r1 = r0.getContext()
            r0 = 2131103152(0x7f060db0, float:1.7818762E38)
            X.AnonymousClass3MX.A1C(r1, r2, r0)
        L_0x002b:
            return
        L_0x002c:
            boolean r0 = r12 instanceof X.AnonymousClass3ZD
            if (r0 == 0) goto L_0x002b
            java.util.List r0 = r11.A00
            java.lang.Object r1 = r0.get(r13)
            boolean r0 = r1 instanceof X.AnonymousClass454
            if (r0 == 0) goto L_0x00ce
            X.3ZD r12 = (X.AnonymousClass3ZD) r12
            java.util.List r0 = r11.A00
            java.lang.Object r1 = r0.get(r13)
            java.lang.String r0 = "null cannot be cast to non-null type com.whatsapp.product.newsletterenforcements.alerts.AlertDataItem"
            X.C18070vi.A0z(r1, r0)
            X.454 r1 = (X.AnonymousClass454) r1
            X.4Et r5 = r1.A00
            android.view.View r1 = r12.A0H
            android.content.Context r4 = r1.getContext()
            r0 = 1
            X.C90024dP.A00(r1, r11, r5, r0)
            boolean r0 = r5 instanceof X.AnonymousClass452
            if (r0 == 0) goto L_0x0086
            com.whatsapp.WaTextView r1 = r12.A02
            r0 = 2131891209(0x7f121409, float:1.9417132E38)
            r1.setText(r0)
            com.whatsapp.WaTextView r1 = r12.A01
            r0 = 2131891208(0x7f121408, float:1.941713E38)
        L_0x0066:
            r1.setText(r0)
        L_0x0069:
            com.whatsapp.WaTextView r1 = r12.A01
            boolean r0 = r5 instanceof X.AnonymousClass44z
            r0 = r0 ^ 1
            int r0 = X.C72453Mb.A07(r0)
            r1.setVisibility(r0)
            com.whatsapp.WaImageView r1 = r12.A00
            r0 = 2131233497(0x7f080ad9, float:1.8083133E38)
            android.graphics.drawable.Drawable r0 = X.AnonymousClass03S.A01(r4, r0)
            r1.setImageDrawable(r0)
            r1.clearColorFilter()
            return
        L_0x0086:
            boolean r0 = r5 instanceof X.AnonymousClass453
            if (r0 != 0) goto L_0x00c0
            boolean r0 = r5 instanceof X.AnonymousClass450
            if (r0 != 0) goto L_0x00c0
            boolean r0 = r5 instanceof X.AnonymousClass451
            if (r0 == 0) goto L_0x00b6
            com.whatsapp.WaTextView r1 = r12.A02
            r0 = 2131890757(0x7f121245, float:1.9416215E38)
            r1.setText(r0)
            com.whatsapp.WaTextView r3 = r12.A01
            X.0vb r0 = r11.A02
            java.lang.String r2 = r0.A06()
            r0 = r5
            X.451 r0 = (X.AnonymousClass451) r0
            X.444 r0 = r0.A00
            java.lang.String r1 = r0.A04
            java.util.Locale r0 = new java.util.Locale
            r0.<init>(r2, r1)
            java.lang.String r0 = r0.getDisplayCountry()
            r3.setText(r0)
            goto L_0x0069
        L_0x00b6:
            boolean r0 = r5 instanceof X.AnonymousClass44z
            if (r0 == 0) goto L_0x0069
            com.whatsapp.WaTextView r1 = r12.A02
            r0 = 2131892751(0x7f121a0f, float:1.942026E38)
            goto L_0x0066
        L_0x00c0:
            com.whatsapp.WaTextView r1 = r12.A02
            r0 = 2131896636(0x7f12293c, float:1.9428139E38)
            r1.setText(r0)
            com.whatsapp.WaTextView r1 = r12.A01
            r0 = 2131896635(0x7f12293b, float:1.9428137E38)
            goto L_0x0066
        L_0x00ce:
            boolean r0 = r1 instanceof X.AnonymousClass456
            if (r0 == 0) goto L_0x002b
            X.3ZD r12 = (X.AnonymousClass3ZD) r12
            java.util.List r0 = r11.A00
            java.lang.Object r1 = r0.get(r13)
            java.lang.String r0 = "null cannot be cast to non-null type com.whatsapp.product.newsletterenforcements.alerts.ReviewDataItem"
            X.C18070vi.A0z(r1, r0)
            X.456 r1 = (X.AnonymousClass456) r1
            X.4cY r7 = r1.A00
            android.view.View r6 = r12.A0H
            android.content.Context r5 = r6.getContext()
            com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2AppealState r1 = r7.A02()
            com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2AppealState r0 = com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2AppealState.REJECT
            if (r1 == r0) goto L_0x00fd
            com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2AppealState r0 = com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2AppealState.SUCCESS
            if (r1 == r0) goto L_0x00fd
            com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2AppealState r0 = com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2AppealState.CONTENT_UNAVAILABLE
            r10 = 0
            r8 = 2131233422(0x7f080a8e, float:1.8082981E38)
            if (r1 != r0) goto L_0x0101
        L_0x00fd:
            r10 = 1
            r8 = 2131233274(0x7f0809fa, float:1.808268E38)
        L_0x0101:
            boolean r0 = r7 instanceof X.AnonymousClass446
            r9 = 0
            r4 = 1
            if (r0 != 0) goto L_0x0192
            boolean r0 = r7 instanceof X.AnonymousClass445
            if (r0 != 0) goto L_0x0192
            boolean r0 = r7 instanceof X.AnonymousClass443
            if (r0 == 0) goto L_0x015b
            r1 = 2131892522(0x7f12192a, float:1.9419795E38)
            if (r10 == 0) goto L_0x0117
            r1 = 2131892508(0x7f12191c, float:1.9419766E38)
        L_0x0117:
            com.whatsapp.WaTextView r0 = r12.A02
            r0.setText(r1)
        L_0x011c:
            com.whatsapp.WaImageView r2 = r12.A00
            android.graphics.drawable.Drawable r0 = X.AnonymousClass03S.A01(r5, r8)
            r2.setImageDrawable(r0)
            r0 = 2131103152(0x7f060db0, float:1.7818762E38)
            int r1 = X.C19740yt.A00(r5, r0)
            android.graphics.PorterDuff$Mode r0 = android.graphics.PorterDuff.Mode.SRC_IN
            r2.setColorFilter(r1, r0)
            java.lang.String r0 = r7.A05()
            if (r0 == 0) goto L_0x0155
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.SECONDS
            long r0 = java.lang.Long.parseLong(r0)
            long r0 = r2.toMillis(r0)
            X.11Y r3 = X.AnonymousClass11X.A00
            X.0vb r2 = r11.A02
            java.lang.String r3 = r3.A07(r2, r0)
            com.whatsapp.WaTextView r2 = r12.A01
            r1 = 2131892529(0x7f121931, float:1.9419809E38)
            java.lang.Object[] r0 = new java.lang.Object[r4]
            r0[r9] = r3
            X.AnonymousClass3MY.A0y(r5, r2, r0, r1)
        L_0x0155:
            r0 = 34
            X.AnonymousClass3Ma.A1F(r6, r11, r5, r7, r0)
            return
        L_0x015b:
            boolean r0 = r7 instanceof X.AnonymousClass444
            if (r0 == 0) goto L_0x0185
            X.0vb r0 = r11.A02
            java.lang.String r2 = r0.A06()
            r0 = r7
            X.444 r0 = (X.AnonymousClass444) r0
            java.lang.String r1 = r0.A04
            java.util.Locale r0 = new java.util.Locale
            r0.<init>(r2, r1)
            java.lang.String r3 = r0.getDisplayCountry()
            r2 = 2131892510(0x7f12191e, float:1.941977E38)
            if (r10 == 0) goto L_0x017b
            r2 = 2131892509(0x7f12191d, float:1.9419768E38)
        L_0x017b:
            com.whatsapp.WaTextView r1 = r12.A02
            java.lang.Object[] r0 = new java.lang.Object[r4]
            r0[r9] = r3
            X.AnonymousClass3MY.A0y(r5, r1, r0, r2)
            goto L_0x011c
        L_0x0185:
            boolean r0 = r7 instanceof X.AnonymousClass442
            if (r0 == 0) goto L_0x011c
            r1 = 2131892753(0x7f121a11, float:1.9420263E38)
            if (r10 == 0) goto L_0x0117
            r1 = 2131892752(0x7f121a10, float:1.9420261E38)
            goto L_0x0117
        L_0x0192:
            r1 = 2131892519(0x7f121927, float:1.9419789E38)
            if (r10 == 0) goto L_0x0117
            r1 = 2131892507(0x7f12191b, float:1.9419764E38)
            goto L_0x0117
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3X2.Bmc(X.1xT, int):void");
    }

    public C42011xT BqY(ViewGroup viewGroup, int i) {
        C18070vi.A0d(viewGroup, 0);
        if (i == 0) {
            return new C74043Yh(AnonymousClass3MX.A0B(AnonymousClass3MY.A0B(viewGroup), viewGroup, 2131625857, false));
        }
        if (i == 1) {
            View inflate = AnonymousClass3MZ.A0D(viewGroup).inflate(2131626168, viewGroup, false);
            ImageView A0H = AnonymousClass3MW.A0H(inflate, 2131434711);
            AnonymousClass3NL.A01(A0H.getContext(), A0H, this.A02, 2131231900);
            return new AnonymousClass3ZD(inflate);
        }
        throw AnonymousClass000.A0k("Invalid view type");
    }

    public int A0Q() {
        return this.A00.size();
    }

    public int getItemViewType(int i) {
        return (this.A00.get(i) instanceof AnonymousClass455) ^ true ? 1 : 0;
    }

    public AnonymousClass3X2(AnonymousClass1L9 r2, C18000vb r3, C29681ch r4, AnonymousClass4OB r5) {
        C18070vi.A0o(r2, r3, r4);
        this.A01 = r2;
        this.A02 = r3;
        this.A03 = r4;
        this.A04 = r5;
    }
}
