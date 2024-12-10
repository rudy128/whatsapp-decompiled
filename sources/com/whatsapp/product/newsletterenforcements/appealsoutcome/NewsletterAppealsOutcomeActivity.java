package com.whatsapp.product.newsletterenforcements.appealsoutcome;

import X.AnonymousClass00H;
import X.AnonymousClass00R;
import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass1DF;
import X.AnonymousClass1FB;
import X.AnonymousClass1FY;
import X.AnonymousClass1K1;
import X.AnonymousClass1K3;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3MY;
import X.AnonymousClass3MZ;
import X.AnonymousClass3Ma;
import X.AnonymousClass4SX;
import X.AnonymousClass5JZ;
import X.AnonymousClass5OP;
import X.AnonymousClass5OQ;
import X.AnonymousClass5YF;
import X.AnonymousClass5ZI;
import X.C103105Ja;
import X.C103115Jb;
import X.C103125Jc;
import X.C103135Jd;
import X.C103145Je;
import X.C103155Jf;
import X.C103165Jg;
import X.C18100vl;
import X.C21448AkF;
import X.C27201Vd;
import X.C36401np;
import X.C72473Md;
import X.C72483Me;
import X.C73273Tk;
import X.C91024f1;
import X.C99274sY;
import com.whatsapp.WaTextView;

public final class NewsletterAppealsOutcomeActivity extends AnonymousClass1FY {
    public C27201Vd A00;
    public AnonymousClass5ZI A01;
    public AnonymousClass4SX A02;
    public AnonymousClass5YF A03;
    public AnonymousClass1K3 A04;
    public C36401np A05;
    public AnonymousClass00H A06;
    public boolean A07;
    public final C18100vl A08;
    public final C18100vl A09;
    public final C18100vl A0A;
    public final C18100vl A0B;
    public final C18100vl A0C;
    public final C18100vl A0D;
    public final C18100vl A0E;
    public final C18100vl A0F;

    public NewsletterAppealsOutcomeActivity() {
        this(0);
        this.A0D = AnonymousClass1DF.A00(AnonymousClass00R.A01, new AnonymousClass5OP(this));
        this.A0B = AnonymousClass1DF.A01(new C103125Jc(this));
        this.A0F = C99274sY.A00(new C103145Je(this), new C103165Jg(this), new AnonymousClass5OQ(this), AnonymousClass3MW.A15(C73273Tk.class));
        this.A08 = AnonymousClass1DF.A01(new AnonymousClass5JZ(this));
        this.A0E = AnonymousClass1DF.A01(new C103155Jf(this));
        this.A09 = AnonymousClass1DF.A01(new C103105Ja(this));
        this.A0A = AnonymousClass1DF.A01(new C103115Jb(this));
        this.A0C = AnonymousClass1DF.A01(new C103135Jd(this));
    }

    private final void A03(WaTextView waTextView, String str) {
        C36401np r1 = this.A05;
        if (r1 != null) {
            waTextView.setText(r1.A06(this, new C21448AkF(this, 43), str, "clickable-span", C72473Md.A05(waTextView)));
            C72473Md.A1D(waTextView);
            return;
        }
        AnonymousClass3MW.A1E();
        throw null;
    }

    public void A2y() {
        if (!this.A07) {
            this.A07 = true;
            AnonymousClass1K1 A0K = C72473Md.A0K(this);
            AnonymousClass10E r2 = A0K.AAQ;
            C72483Me.A0q(r2, this);
            AnonymousClass10G r1 = r2.A00;
            AnonymousClass1FB.A0K(r2, r1, this, r1.A45);
            AnonymousClass1FB.A0L(r2, r1, this, r1.A5A);
            this.A00 = AnonymousClass3MZ.A0i(r2);
            this.A06 = AnonymousClass3MX.A10(r2);
            this.A02 = AnonymousClass3Ma.A0W(A0K);
            this.A01 = (AnonymousClass5ZI) A0K.A2I.get();
            this.A04 = AnonymousClass3Ma.A0v(r2);
            this.A05 = AnonymousClass3MY.A0e(r1);
            this.A03 = (AnonymousClass5YF) A0K.A3N.get();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:77:0x02a8, code lost:
        if (r0 == null) goto L_0x0051;
     */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x00b1  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00d5  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r10) {
        /*
            r9 = this;
            super.onCreate(r10)
            r0 = 2131888100(0x7f1207e4, float:1.9410826E38)
            r9.setTitle(r0)
            r9.A3f()
            X.C72473Md.A18(r9)
            r0 = 2131624081(0x7f0e0091, float:1.8875332E38)
            r9.setContentView((int) r0)
            X.0vl r2 = r9.A0B
            java.lang.Object r3 = r2.getValue()
            X.4cY r3 = (X.C89494cY) r3
            boolean r0 = r3 instanceof X.AnonymousClass443
            if (r0 == 0) goto L_0x013e
            X.443 r3 = (X.AnonymousClass443) r3
            com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2AppealState r0 = r3.A00
            int r1 = r0.ordinal()
            java.lang.String r5 = "clickable-span"
            r4 = 0
            r3 = 1
            if (r1 == r3) goto L_0x0361
            r0 = 3
            if (r1 == r0) goto L_0x0123
            r0 = 2
            if (r1 != r0) goto L_0x0051
            X.0vl r0 = r9.A0E
            java.lang.Object r1 = X.AnonymousClass3MX.A14(r0)
            com.whatsapp.WaTextView r1 = (com.whatsapp.WaTextView) r1
            r0 = 2131892522(0x7f12192a, float:1.9419795E38)
            r1.setText(r0)
        L_0x0043:
            X.0vl r0 = r9.A09
            java.lang.Object r1 = X.AnonymousClass3MX.A14(r0)
            com.whatsapp.WaTextView r1 = (com.whatsapp.WaTextView) r1
            r0 = 2131892516(0x7f121924, float:1.9419782E38)
        L_0x004e:
            r1.setText(r0)
        L_0x0051:
            android.view.View r1 = r9.A00
            r0 = 2131432989(0x7f0b161d, float:1.848775E38)
            android.widget.TextView r5 = X.C17880vN.A0E(r1, r0)
            X.C18070vi.A0b(r5)
            java.lang.Object r0 = r2.getValue()
            X.4cY r0 = (X.C89494cY) r0
            java.lang.String r0 = r0.A05()
            X.C43531zx.A04(r5, r0)
            java.lang.Object r0 = r2.getValue()
            X.4cY r0 = (X.C89494cY) r0
            java.lang.String r0 = r0.A05()
            if (r0 == 0) goto L_0x0095
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.SECONDS
            long r0 = java.lang.Long.parseLong(r0)
            long r3 = r3.toMillis(r0)
            X.11Y r1 = X.AnonymousClass11X.A00
            X.0vb r0 = r9.A00
            X.C18070vi.A0W(r0)
            java.lang.String r1 = r1.A07(r0, r3)
            r0 = 2131892529(0x7f121931, float:1.9419809E38)
            java.lang.String r0 = X.C72473Md.A0j(r9, r1, r0)
            r5.setText(r0)
        L_0x0095:
            X.0vl r0 = r9.A08
            java.lang.Object r4 = X.AnonymousClass3MX.A14(r0)
            android.widget.ImageView r4 = (android.widget.ImageView) r4
            java.lang.Object r0 = r2.getValue()
            X.4cY r0 = (X.C89494cY) r0
            com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2AppealState r0 = r0.A02()
            int r3 = r0.ordinal()
            r0 = 1
            r1 = 2131233655(0x7f080b77, float:1.8083454E38)
            if (r3 == r0) goto L_0x00c4
            r0 = 3
            r1 = 2131233654(0x7f080b76, float:1.8083452E38)
            if (r3 == r0) goto L_0x00c4
            r0 = 2
            r1 = 2131233656(0x7f080b78, float:1.8083456E38)
            if (r3 == r0) goto L_0x00c4
            r0 = 4
            r1 = 2131233657(0x7f080b79, float:1.8083458E38)
            if (r3 == r0) goto L_0x00c4
            r1 = 0
        L_0x00c4:
            r4.setImageResource(r1)
            java.lang.Object r0 = r2.getValue()
            X.4cY r0 = (X.C89494cY) r0
            com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2AppealState r1 = r0.A02()
            com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2AppealState r0 = com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2AppealState.REJECT
            if (r1 != r0) goto L_0x00ea
            X.1jj r2 = X.AnonymousClass3Ma.A0H(r9)
            r1 = 2131433017(0x7f0b1639, float:1.8487808E38)
            X.0vl r0 = r9.A0C
            java.lang.Object r0 = r0.getValue()
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            r2.A08(r0, r1)
            r2.A01()
        L_0x00ea:
            X.0vl r3 = r9.A0F
            java.lang.Object r0 = r3.getValue()
            X.3Tk r0 = (X.C73273Tk) r0
            X.1DT r1 = r0.A01
            X.5Ti r0 = new X.5Ti
            r0.<init>(r9)
            r2 = 7
            X.C91634g0.A00(r9, r1, r0, r2)
            java.lang.Object r0 = r3.getValue()
            X.3Tk r0 = (X.C73273Tk) r0
            X.1DT r1 = r0.A00
            X.5Tj r0 = new X.5Tj
            r0.<init>(r9)
            X.C91634g0.A00(r9, r1, r0, r2)
            java.lang.Object r4 = r3.getValue()
            X.3Tk r4 = (X.C73273Tk) r4
            X.1OX r3 = X.C41561wd.A00(r4)
            X.0wl r2 = r4.A05
            r1 = 0
            com.whatsapp.product.newsletterenforcements.appealsoutcome.NewsletterAppealsOutcomeViewModel$fetchNewsletterContact$1 r0 = new com.whatsapp.product.newsletterenforcements.appealsoutcome.NewsletterAppealsOutcomeViewModel$fetchNewsletterContact$1
            r0.<init>(r4, r1)
            X.AnonymousClass3MW.A1X(r2, r0, r3)
            return
        L_0x0123:
            X.0vl r0 = r9.A0E
            java.lang.Object r1 = X.AnonymousClass3MX.A14(r0)
            com.whatsapp.WaTextView r1 = (com.whatsapp.WaTextView) r1
            r0 = 2131892514(0x7f121922, float:1.9419778E38)
            r1.setText(r0)
            X.0vl r0 = r9.A09
            java.lang.Object r8 = X.AnonymousClass3MX.A14(r0)
            com.whatsapp.WaTextView r8 = (com.whatsapp.WaTextView) r8
            r1 = 2131892528(0x7f121930, float:1.9419807E38)
            goto L_0x037a
        L_0x013e:
            boolean r0 = r3 instanceof X.AnonymousClass444
            if (r0 == 0) goto L_0x01b7
            X.444 r3 = (X.AnonymousClass444) r3
            X.1K3 r4 = r9.A04
            if (r4 == 0) goto L_0x038a
            X.0vb r1 = r9.A00
            java.lang.String r0 = r3.A04
            java.lang.String r7 = r4.A03(r1, r0)
            if (r7 != 0) goto L_0x0153
            r7 = r0
        L_0x0153:
            X.C18070vi.A0b(r7)
            com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2AppealState r0 = r3.A00
            int r1 = r0.ordinal()
            java.lang.String r6 = "clickable-span"
            r5 = 0
            r3 = 2
            r0 = 3
            r4 = 1
            if (r1 == r4) goto L_0x0196
            if (r1 == r0) goto L_0x017c
            if (r1 != r3) goto L_0x0051
            X.0vl r0 = r9.A0E
            java.lang.Object r3 = X.AnonymousClass3MX.A14(r0)
            com.whatsapp.WaTextView r3 = (com.whatsapp.WaTextView) r3
            r1 = 2131892518(0x7f121926, float:1.9419787E38)
            java.lang.Object[] r0 = new java.lang.Object[r4]
            r0[r5] = r7
            X.AnonymousClass3MY.A0y(r9, r3, r0, r1)
            goto L_0x0043
        L_0x017c:
            X.0vl r0 = r9.A0E
            java.lang.Object r1 = X.AnonymousClass3MX.A14(r0)
            com.whatsapp.WaTextView r1 = (com.whatsapp.WaTextView) r1
            r0 = 2131892511(0x7f12191f, float:1.9419772E38)
            r1.setText(r0)
            X.0vl r0 = r9.A09
            java.lang.Object r8 = X.AnonymousClass3MX.A14(r0)
            com.whatsapp.WaTextView r8 = (com.whatsapp.WaTextView) r8
            r1 = 2131892526(0x7f12192e, float:1.9419803E38)
            goto L_0x01af
        L_0x0196:
            X.0vl r0 = r9.A0E
            java.lang.Object r1 = X.AnonymousClass3MX.A14(r0)
            com.whatsapp.WaTextView r1 = (com.whatsapp.WaTextView) r1
            r0 = 2131892511(0x7f12191f, float:1.9419772E38)
            r1.setText(r0)
            X.0vl r0 = r9.A09
            java.lang.Object r8 = X.AnonymousClass3MX.A14(r0)
            com.whatsapp.WaTextView r8 = (com.whatsapp.WaTextView) r8
            r1 = 2131892532(0x7f121934, float:1.9419815E38)
        L_0x01af:
            java.lang.Object[] r0 = new java.lang.Object[r3]
            r0[r5] = r7
            r0[r4] = r6
            goto L_0x037e
        L_0x01b7:
            boolean r0 = r3 instanceof X.AnonymousClass446
            if (r0 == 0) goto L_0x0272
            X.446 r3 = (X.AnonymousClass446) r3
            com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2AppealState r0 = r3.A01
            int r1 = r0.ordinal()
            java.lang.String r6 = "clickable-span"
            r5 = 0
            r4 = 1
            if (r1 == r4) goto L_0x024d
            r0 = 3
            if (r1 == r0) goto L_0x0233
            r0 = 2
            if (r1 == r0) goto L_0x0219
            r0 = 4
            if (r1 != r0) goto L_0x01ee
            X.0vl r0 = r9.A0E
            java.lang.Object r1 = X.AnonymousClass3MX.A14(r0)
            com.whatsapp.WaTextView r1 = (com.whatsapp.WaTextView) r1
            r0 = 2131892512(0x7f121920, float:1.9419774E38)
            r1.setText(r0)
            X.0vl r0 = r9.A09
            java.lang.Object r1 = X.AnonymousClass3MX.A14(r0)
            com.whatsapp.WaTextView r1 = (com.whatsapp.WaTextView) r1
            r0 = 2131892515(0x7f121923, float:1.941978E38)
        L_0x01eb:
            r1.setText(r0)
        L_0x01ee:
            java.lang.String r0 = r3.A07
        L_0x01f0:
            java.lang.Long r0 = X.AnonymousClass1YD.A04(r0)
            if (r0 == 0) goto L_0x0051
            long r7 = r0.longValue()
            X.0vl r0 = r9.A0F
            java.lang.Object r5 = r0.getValue()
            X.3Tk r5 = (X.C73273Tk) r5
            X.0vl r0 = r9.A0D
            X.1ch r4 = X.AnonymousClass3MX.A0o(r0)
            X.1OX r1 = X.C72453Mb.A12(r5, r4)
            X.0wl r0 = r5.A05
            r6 = 0
            com.whatsapp.product.newsletterenforcements.appealsoutcome.NewsletterAppealsOutcomeViewModel$fetchViolatingMessage$1 r3 = new com.whatsapp.product.newsletterenforcements.appealsoutcome.NewsletterAppealsOutcomeViewModel$fetchViolatingMessage$1
            r3.<init>(r4, r5, r6, r7)
            X.AnonymousClass3MW.A1X(r0, r3, r1)
            goto L_0x0051
        L_0x0219:
            X.0vl r0 = r9.A0E
            java.lang.Object r1 = X.AnonymousClass3MX.A14(r0)
            com.whatsapp.WaTextView r1 = (com.whatsapp.WaTextView) r1
            r0 = 2131892519(0x7f121927, float:1.9419789E38)
            r1.setText(r0)
            X.0vl r0 = r9.A09
            java.lang.Object r1 = X.AnonymousClass3MX.A14(r0)
            com.whatsapp.WaTextView r1 = (com.whatsapp.WaTextView) r1
            r0 = 2131892523(0x7f12192b, float:1.9419797E38)
            goto L_0x01eb
        L_0x0233:
            X.0vl r0 = r9.A0E
            java.lang.Object r1 = X.AnonymousClass3MX.A14(r0)
            com.whatsapp.WaTextView r1 = (com.whatsapp.WaTextView) r1
            r0 = 2131892512(0x7f121920, float:1.9419774E38)
            r1.setText(r0)
            X.0vl r0 = r9.A09
            java.lang.Object r1 = X.AnonymousClass3MX.A14(r0)
            com.whatsapp.WaTextView r1 = (com.whatsapp.WaTextView) r1
            r0 = 2131892525(0x7f12192d, float:1.94198E38)
            goto L_0x0266
        L_0x024d:
            X.0vl r0 = r9.A0E
            java.lang.Object r1 = X.AnonymousClass3MX.A14(r0)
            com.whatsapp.WaTextView r1 = (com.whatsapp.WaTextView) r1
            r0 = 2131892512(0x7f121920, float:1.9419774E38)
            r1.setText(r0)
            X.0vl r0 = r9.A09
            java.lang.Object r1 = X.AnonymousClass3MX.A14(r0)
            com.whatsapp.WaTextView r1 = (com.whatsapp.WaTextView) r1
            r0 = 2131892531(0x7f121933, float:1.9419813E38)
        L_0x0266:
            java.lang.String r0 = X.C17890vO.A0R(r9, r6, r4, r5, r0)
            X.C18070vi.A0X(r0)
            r9.A03(r1, r0)
            goto L_0x01ee
        L_0x0272:
            boolean r0 = r3 instanceof X.AnonymousClass445
            if (r0 == 0) goto L_0x02fa
            X.445 r3 = (X.AnonymousClass445) r3
            com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2AppealState r0 = r3.A01
            int r1 = r0.ordinal()
            r0 = 1
            if (r1 == r0) goto L_0x02e0
            r0 = 3
            if (r1 == r0) goto L_0x02c6
            r0 = 2
            if (r1 == r0) goto L_0x02ac
            r0 = 4
            if (r1 != r0) goto L_0x02a6
            X.0vl r0 = r9.A0E
            java.lang.Object r1 = X.AnonymousClass3MX.A14(r0)
            com.whatsapp.WaTextView r1 = (com.whatsapp.WaTextView) r1
            r0 = 2131892512(0x7f121920, float:1.9419774E38)
            r1.setText(r0)
            X.0vl r0 = r9.A09
            java.lang.Object r1 = X.AnonymousClass3MX.A14(r0)
            com.whatsapp.WaTextView r1 = (com.whatsapp.WaTextView) r1
            r0 = 2131892515(0x7f121923, float:1.941978E38)
        L_0x02a3:
            r1.setText(r0)
        L_0x02a6:
            java.lang.String r0 = r3.A07
            if (r0 == 0) goto L_0x0051
            goto L_0x01f0
        L_0x02ac:
            X.0vl r0 = r9.A0E
            java.lang.Object r1 = X.AnonymousClass3MX.A14(r0)
            com.whatsapp.WaTextView r1 = (com.whatsapp.WaTextView) r1
            r0 = 2131892519(0x7f121927, float:1.9419789E38)
            r1.setText(r0)
            X.0vl r0 = r9.A09
            java.lang.Object r1 = X.AnonymousClass3MX.A14(r0)
            com.whatsapp.WaTextView r1 = (com.whatsapp.WaTextView) r1
            r0 = 2131892517(0x7f121925, float:1.9419785E38)
            goto L_0x02a3
        L_0x02c6:
            X.0vl r0 = r9.A0E
            java.lang.Object r1 = X.AnonymousClass3MX.A14(r0)
            com.whatsapp.WaTextView r1 = (com.whatsapp.WaTextView) r1
            r0 = 2131892512(0x7f121920, float:1.9419774E38)
            r1.setText(r0)
            X.0vl r0 = r9.A09
            java.lang.Object r1 = X.AnonymousClass3MX.A14(r0)
            com.whatsapp.WaTextView r1 = (com.whatsapp.WaTextView) r1
            r0 = 2131892524(0x7f12192c, float:1.9419799E38)
            goto L_0x02a3
        L_0x02e0:
            X.0vl r0 = r9.A0E
            java.lang.Object r1 = X.AnonymousClass3MX.A14(r0)
            com.whatsapp.WaTextView r1 = (com.whatsapp.WaTextView) r1
            r0 = 2131892512(0x7f121920, float:1.9419774E38)
            r1.setText(r0)
            X.0vl r0 = r9.A09
            java.lang.Object r1 = X.AnonymousClass3MX.A14(r0)
            com.whatsapp.WaTextView r1 = (com.whatsapp.WaTextView) r1
            r0 = 2131892530(0x7f121932, float:1.941981E38)
            goto L_0x02a3
        L_0x02fa:
            boolean r0 = r3 instanceof X.AnonymousClass442
            if (r0 == 0) goto L_0x0051
            X.442 r3 = (X.AnonymousClass442) r3
            com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2AppealState r0 = r3.A00
            int r1 = r0.ordinal()
            java.lang.String r5 = "clickable-span"
            r4 = 0
            r3 = 1
            if (r1 == r3) goto L_0x0347
            r0 = 3
            if (r1 == r0) goto L_0x032d
            r0 = 2
            if (r1 != r0) goto L_0x0051
            X.0vl r0 = r9.A0E
            java.lang.Object r1 = X.AnonymousClass3MX.A14(r0)
            com.whatsapp.WaTextView r1 = (com.whatsapp.WaTextView) r1
            r0 = 2131892520(0x7f121928, float:1.941979E38)
            r1.setText(r0)
            X.0vl r0 = r9.A09
            java.lang.Object r1 = X.AnonymousClass3MX.A14(r0)
            com.whatsapp.WaTextView r1 = (com.whatsapp.WaTextView) r1
            r0 = 2131892521(0x7f121929, float:1.9419793E38)
            goto L_0x004e
        L_0x032d:
            X.0vl r0 = r9.A0E
            java.lang.Object r1 = X.AnonymousClass3MX.A14(r0)
            com.whatsapp.WaTextView r1 = (com.whatsapp.WaTextView) r1
            r0 = 2131892513(0x7f121921, float:1.9419776E38)
            r1.setText(r0)
            X.0vl r0 = r9.A09
            java.lang.Object r8 = X.AnonymousClass3MX.A14(r0)
            com.whatsapp.WaTextView r8 = (com.whatsapp.WaTextView) r8
            r1 = 2131892527(0x7f12192f, float:1.9419805E38)
            goto L_0x037a
        L_0x0347:
            X.0vl r0 = r9.A0E
            java.lang.Object r1 = X.AnonymousClass3MX.A14(r0)
            com.whatsapp.WaTextView r1 = (com.whatsapp.WaTextView) r1
            r0 = 2131892513(0x7f121921, float:1.9419776E38)
            r1.setText(r0)
            X.0vl r0 = r9.A09
            java.lang.Object r8 = X.AnonymousClass3MX.A14(r0)
            com.whatsapp.WaTextView r8 = (com.whatsapp.WaTextView) r8
            r1 = 2131892533(0x7f121935, float:1.9419817E38)
            goto L_0x037a
        L_0x0361:
            X.0vl r0 = r9.A0E
            java.lang.Object r1 = X.AnonymousClass3MX.A14(r0)
            com.whatsapp.WaTextView r1 = (com.whatsapp.WaTextView) r1
            r0 = 2131892514(0x7f121922, float:1.9419778E38)
            r1.setText(r0)
            X.0vl r0 = r9.A09
            java.lang.Object r8 = X.AnonymousClass3MX.A14(r0)
            com.whatsapp.WaTextView r8 = (com.whatsapp.WaTextView) r8
            r1 = 2131892534(0x7f121936, float:1.941982E38)
        L_0x037a:
            java.lang.Object[] r0 = new java.lang.Object[r3]
            r0[r4] = r5
        L_0x037e:
            java.lang.String r0 = r9.getString(r1, r0)
            X.C18070vi.A0X(r0)
            r9.A03(r8, r0)
            goto L_0x0051
        L_0x038a:
            java.lang.String r0 = "countryUtils"
            X.C18070vi.A11(r0)
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.product.newsletterenforcements.appealsoutcome.NewsletterAppealsOutcomeActivity.onCreate(android.os.Bundle):void");
    }

    public NewsletterAppealsOutcomeActivity(int i) {
        this.A07 = false;
        C91024f1.A00(this, 20);
    }
}
