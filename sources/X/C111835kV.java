package X;

import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.wds.components.topbar.WDSToolbar;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.5kV  reason: invalid class name and case insensitive filesystem */
public final class C111835kV extends C41251w3 {
    public int A00;
    public C1417976z A01;
    public boolean A02;
    public boolean A03;
    public long A04 = -1;
    public final int A05;
    public final C25311Ns A06;
    public final C125906bs A07;
    public final C132866nk A08;
    public final C18030ve A09;
    public final C26631Sw A0A;
    public final AnonymousClass88B A0B;
    public final WDSToolbar A0C;
    public final AnonymousClass00H A0D;
    public final AnonymousClass00H A0E;
    public final AnonymousClass00H A0F;
    public final Integer A0G;
    public final Map A0H = C17880vN.A13();
    public final C18100vl A0I = AnonymousClass1DF.A01(new C150527kp(this));
    public final C18090vk A0J;
    public final C18090vk A0K;
    public final C18090vk A0L;
    public final C22821Di A0M;
    public final C22821Di A0N;
    public final C22821Di A0O;
    public final C22821Di A0P;
    public final C22821Di A0Q;
    public final C22821Di A0R;
    public final C22821Di A0S;
    public final AnonymousClass1OS A0T;
    public final boolean A0U;
    public final boolean A0V;
    public final boolean A0W;
    public final boolean A0X;
    public final boolean A0Y;

    public /* bridge */ /* synthetic */ C42011xT BqY(ViewGroup viewGroup, int i) {
        boolean z;
        int intValue;
        ViewGroup viewGroup2 = viewGroup;
        C18070vi.A0d(viewGroup2, 0);
        switch (i) {
            case 0:
                return new AnonymousClass619(AnonymousClass3MY.A0E(AnonymousClass3MZ.A0D(viewGroup2), viewGroup2, 2131627300), this.A0E);
            case 1:
                LayoutInflater A0D2 = AnonymousClass3MZ.A0D(viewGroup2);
                C18030ve r7 = this.A09;
                C18070vi.A0d(r7, 0);
                int i2 = 2131627309;
                if (C25291Nq.A04(r7, 10692)) {
                    i2 = 2131627295;
                }
                View inflate = A0D2.inflate(i2, viewGroup2, false);
                boolean A042 = C25291Nq.A04(r7, 10692);
                List list = C42011xT.A0I;
                if (A042) {
                    C18070vi.A0b(inflate);
                    C22821Di r8 = this.A0S;
                    C22821Di r9 = this.A0R;
                    C22821Di r10 = this.A0Q;
                    Integer num = this.A0G;
                    if (num == null || ((intValue = num.intValue()) != 0 && (intValue != 5 || !C72453Mb.A1a(this.A0I)))) {
                        z = false;
                    } else {
                        z = true;
                    }
                    return new AnonymousClass61G(inflate, r7, r8, r9, r10, z);
                }
                C18070vi.A0b(inflate);
                return new AnonymousClass617(inflate);
            case 2:
                View A0E2 = AnonymousClass3MY.A0E(AnonymousClass3MZ.A0D(viewGroup2), viewGroup2, 2131627306);
                AnonymousClass00H r11 = this.A0E;
                int i3 = this.A05;
                return new AnonymousClass61I(A0E2, this.A06, this.A0A, this.A0B, new AnonymousClass7MW(this, 2), r11, this.A0T, i3);
            case 3:
                return new AnonymousClass61H(AnonymousClass3MY.A0E(AnonymousClass3MZ.A0D(viewGroup2), viewGroup2, 2131627299), this.A0K, true ^ this.A03);
            case 5:
                boolean z2 = this.A0X;
                LayoutInflater A0D3 = AnonymousClass3MZ.A0D(viewGroup2);
                int i4 = 2131627303;
                if (z2) {
                    i4 = 2131627304;
                }
                return new AnonymousClass61D(AnonymousClass3MY.A0E(A0D3, viewGroup2, i4), this.A08, new AnonymousClass7zJ(this));
            case 6:
                return new AnonymousClass61F(AnonymousClass3MY.A0E(AnonymousClass3MZ.A0D(viewGroup2), viewGroup2, 2131627307), this.A0E, this.A0L, this.A0W);
            case 7:
                return new AnonymousClass61E(AnonymousClass3MY.A0E(AnonymousClass3MZ.A0D(viewGroup2), viewGroup2, 2131627308), this.A0L, this.A0J, this.A0W);
            case 8:
                return new AnonymousClass61A(AnonymousClass3MY.A0E(AnonymousClass3MZ.A0D(viewGroup2), viewGroup2, 2131627301), this.A0N);
            case 9:
                return new AnonymousClass616(AnonymousClass3MY.A0E(AnonymousClass3MZ.A0D(viewGroup2), viewGroup2, 2131627296));
            case 10:
                return new C80903yL(AnonymousClass3MY.A0E(AnonymousClass3MZ.A0D(viewGroup2), viewGroup2, 2131627297), this.A0F, this.A0D);
            case 11:
                return new AnonymousClass61B(AnonymousClass3MY.A0E(AnonymousClass3MZ.A0D(viewGroup2), viewGroup2, 2131627302), this.A08, new AnonymousClass7zK(this));
            case 12:
                View inflate2 = AnonymousClass3MZ.A0D(viewGroup2).inflate(2131627298, viewGroup2, false);
                C18030ve r46 = this.A09;
                AnonymousClass00H r45 = this.A0F;
                AnonymousClass00H r44 = this.A0D;
                AnonymousClass00H r43 = this.A0E;
                boolean z3 = this.A0U;
                boolean z4 = this.A0W;
                boolean z5 = this.A0Y;
                C26631Sw r22 = this.A0A;
                C25311Ns r21 = this.A06;
                int i5 = this.A05;
                boolean z6 = this.A0V;
                AnonymousClass88B r20 = this.A0B;
                AnonymousClass1OS r16 = this.A0T;
                C132866nk r17 = this.A08;
                C22821Di r15 = this.A0O;
                C18090vk r13 = this.A0K;
                C18090vk r112 = this.A0L;
                C18090vk r102 = this.A0J;
                C22821Di r92 = this.A0M;
                C22821Di r82 = this.A0P;
                C22821Di r72 = this.A0N;
                C1417976z r6 = this.A01;
                C125906bs r5 = this.A07;
                WDSToolbar wDSToolbar = this.A0C;
                AnonymousClass1OS r36 = r16;
                int i6 = i5;
                boolean z7 = z4;
                boolean z8 = z5;
                boolean z9 = z6;
                C25311Ns r14 = r21;
                C1417976z r152 = r6;
                C125906bs r162 = r5;
                C18030ve r18 = r46;
                C26631Sw r19 = r22;
                WDSToolbar wDSToolbar2 = wDSToolbar;
                AnonymousClass00H r222 = r45;
                AnonymousClass00H r23 = r44;
                AnonymousClass00H r24 = r43;
                C111835kV r132 = new C111835kV(r14, r152, r162, r17, r18, r19, r20, wDSToolbar2, r222, r23, r24, this.A0G, r13, r112, r102, r15, r92, r82, r72, this.A0S, this.A0R, this.A0Q, r36, i6, z3, z7, z8, z9, true);
                GridLayoutManager gridLayoutManager = new GridLayoutManager(inflate2.getContext(), 9);
                gridLayoutManager.A01 = new C111625k1();
                RecyclerView A0Q2 = AnonymousClass3MX.A0Q(inflate2, 2131435720);
                A0Q2.setLayoutManager(gridLayoutManager);
                C108965cb.A14(r132, A0Q2);
                return new AnonymousClass618(inflate2, r132);
            case 13:
                return new AnonymousClass61C(AnonymousClass3MY.A0E(AnonymousClass3MZ.A0D(viewGroup2), viewGroup2, 2131627305), this.A08, new AnonymousClass7zI(this));
            default:
                throw AnonymousClass000.A0k("Unsupported view type for StickerGrid adapter");
        }
    }

    public long A0M(int i) {
        String str;
        if (!this.A0U) {
            return -1;
        }
        C138756xd r4 = (C138756xd) A0U(i);
        boolean z = r4 instanceof C1177260s;
        if (z) {
            C1418377d r1 = ((C1177260s) r4).A01;
            if (!r1.A0N && C18070vi.A18(r1.A0F, "loading-hash")) {
                long j = this.A04;
                this.A04 = -1 + j;
                return j;
            }
        }
        if (r4 instanceof C1177360t) {
            str = ((C1177360t) r4).A02;
        } else if (r4 instanceof C1177060q) {
            str = ((C1177060q) r4).A02;
        } else if (r4 instanceof C1176560l) {
            str = "id-sticker-pack-browse-more";
        } else if (r4 instanceof C1176460k) {
            str = "id-sticker-maker-upsell";
        } else if (r4 instanceof C1176360j) {
            str = "id-sticker-maker";
        } else if (z) {
            str = ((C1177260s) r4).A02;
        } else if (r4 instanceof C1177160r) {
            str = ((C1177160r) r4).A01;
        } else if (r4 instanceof C1176960p) {
            str = ((C1176960p) r4).A02;
        } else if (r4 instanceof C1176860o) {
            str = ((C1176860o) r4).A02;
        } else if (r4 instanceof C1176760n) {
            str = ((C1176760n) r4).A02;
        } else if (r4 instanceof C1176660m) {
            str = "content_stickers_remake_section";
        } else {
            str = "id-avatar-squid-upsell";
        }
        return (long) str.hashCode();
    }

    public /* bridge */ /* synthetic */ void A0R(C42011xT r3) {
        C112825m6 r32 = (C112825m6) r3;
        C18070vi.A0d(r32, 0);
        if (r32 instanceof AnonymousClass61I) {
            AnonymousClass61I r33 = (AnonymousClass61I) r32;
            r33.A0B(false);
            r33.A0C(false);
        }
    }

    public final void A0X() {
        Menu menu;
        WDSToolbar wDSToolbar = this.A0C;
        if (wDSToolbar != null && (menu = wDSToolbar.getMenu()) != null) {
            Iterator A002 = C99434so.A00(menu, 0);
            while (A002.hasNext()) {
                MenuItem menuItem = (MenuItem) A002.next();
                menuItem.setEnabled(!this.A0H.isEmpty());
                Drawable icon = menuItem.getIcon();
                if (icon != null) {
                    float f = 0.5f;
                    if (menuItem.isEnabled()) {
                        f = 1.0f;
                    }
                    icon.setAlpha((int) (255.0f * f));
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0051, code lost:
        if (r8 != false) goto L_0x0053;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x018e, code lost:
        if (X.AnonymousClass61I.A01(r5) != false) goto L_0x0190;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ void Bmc(X.C42011xT r25, int r26) {
        /*
            r24 = this;
            r10 = r25
            X.5m6 r10 = (X.C112825m6) r10
            r2 = 0
            X.C18070vi.A0d(r10, r2)
            boolean r0 = r10 instanceof X.AnonymousClass617
            java.lang.String r1 = "null cannot be cast to non-null type com.whatsapp.expressionstray.ui.stickergrid.StickerGridViewItem.Title"
            r8 = 0
            r7 = 1
            r6 = r24
            r9 = r26
            if (r0 == 0) goto L_0x0063
            java.lang.Object r3 = r6.A0U(r9)
            X.C18070vi.A0z(r3, r1)
            X.60t r3 = (X.C1177360t) r3
            X.617 r10 = (X.AnonymousClass617) r10
            X.C18070vi.A0d(r3, r2)
            java.lang.Integer r0 = r3.A01
            com.whatsapp.WaTextView r9 = r10.A00
            if (r0 == 0) goto L_0x005d
            int r0 = r0.intValue()
            r9.setText(r0)
        L_0x002f:
            X.1Di r1 = r6.A0O
            if (r1 == 0) goto L_0x0038
            X.6UU r0 = r3.A00
            r1.invoke(r0)
        L_0x0038:
            boolean r0 = r6.A03
            if (r0 == 0) goto L_0x0043
            X.6UU r0 = r3.A00
            boolean r0 = r0 instanceof X.AnonymousClass615
            if (r0 != 0) goto L_0x0043
            r8 = 1
        L_0x0043:
            android.content.Context r3 = r9.getContext()
            android.content.Context r2 = r9.getContext()
            r1 = 2130971113(0x7f0409e9, float:1.7550955E38)
            r0 = 2131102439(0x7f060ae7, float:1.7817316E38)
            if (r8 == 0) goto L_0x0059
        L_0x0053:
            r1 = 2130969369(0x7f040319, float:1.7547418E38)
            r0 = 2131100372(0x7f0602d4, float:1.7813124E38)
        L_0x0059:
            X.C72463Mc.A0w(r2, r3, r9, r1, r0)
        L_0x005c:
            return
        L_0x005d:
            java.lang.String r0 = r3.A03
            r9.setText(r0)
            goto L_0x002f
        L_0x0063:
            boolean r0 = r10 instanceof X.AnonymousClass61G
            if (r0 == 0) goto L_0x0140
            java.lang.Object r3 = r6.A0U(r9)
            X.C18070vi.A0z(r3, r1)
            X.60t r3 = (X.C1177360t) r3
            X.61G r10 = (X.AnonymousClass61G) r10
            X.C18070vi.A0d(r3, r2)
            com.google.android.material.appbar.MaterialToolbar r4 = r10.A02
            android.view.Menu r0 = r4.getMenu()
            r0.clear()
            android.view.View r2 = r10.A00
            android.content.Context r1 = r2.getContext()
            r0 = 2132083763(0x7f150433, float:1.9807677E38)
            r4.A0Q(r1, r0)
            java.lang.Integer r0 = r3.A01
            if (r0 == 0) goto L_0x00ff
            int r0 = r0.intValue()
            r4.setTitle((int) r0)
        L_0x0095:
            X.0ve r1 = r10.A03
            r0 = 11793(0x2e11, float:1.6526E-41)
            boolean r0 = X.C25291Nq.A04(r1, r0)
            if (r0 == 0) goto L_0x00f4
            X.614 r0 = r10.A01
            if (r0 == 0) goto L_0x00f4
            X.725 r0 = r0.A00
            boolean r0 = r0.A0T
            if (r0 != r7) goto L_0x00f4
        L_0x00a9:
            X.1Di r1 = r6.A0O
            if (r1 == 0) goto L_0x00b2
            X.6UU r0 = r3.A00
            r1.invoke(r0)
        L_0x00b2:
            boolean r0 = r6.A03
            if (r0 == 0) goto L_0x00bd
            X.6UU r0 = r3.A00
            boolean r0 = r0 instanceof X.AnonymousClass615
            if (r0 != 0) goto L_0x00bd
            r8 = 1
        L_0x00bd:
            android.content.Context r3 = r4.getContext()
            android.content.Context r2 = r4.getContext()
            r1 = 2130971113(0x7f0409e9, float:1.7550955E38)
            r0 = 2131102439(0x7f060ae7, float:1.7817316E38)
            if (r8 == 0) goto L_0x00d3
            r1 = 2130969369(0x7f040319, float:1.7547418E38)
            r0 = 2131100372(0x7f0602d4, float:1.7813124E38)
        L_0x00d3:
            int r0 = X.AnonymousClass3MZ.A02(r2, r3, r1, r0)
            r4.setTitleTextColor((int) r0)
            android.view.Menu r4 = r4.getMenu()
            X.C18070vi.A0X(r4)
            int r3 = r4.size()
            r2 = 0
        L_0x00e6:
            if (r2 >= r3) goto L_0x005c
            android.view.MenuItem r1 = r4.getItem(r2)
            r0 = r8 ^ 1
            r1.setVisible(r0)
            int r2 = r2 + 1
            goto L_0x00e6
        L_0x00f4:
            android.view.Menu r1 = r4.getMenu()
            r0 = 2131435741(0x7f0b20dd, float:1.8493333E38)
            r1.removeItem(r0)
            goto L_0x00a9
        L_0x00ff:
            java.lang.String r0 = r3.A03
            r4.setTitle((java.lang.CharSequence) r0)
            X.6UU r1 = r3.A00
            boolean r0 = r1 instanceof X.AnonymousClass614
            if (r0 == 0) goto L_0x0095
            boolean r0 = r10.A07
            if (r0 == 0) goto L_0x0095
            X.614 r1 = (X.AnonymousClass614) r1
            r10.A01 = r1
            r0 = 2131820592(0x7f110030, float:1.9273903E38)
            r4.A0N(r0)
            android.view.Menu r0 = r4.getMenu()
            X.C18070vi.A0X(r0)
            X.C137526vb.A01(r0, r7)
            android.content.Context r2 = r2.getContext()
            r1 = 2131233369(0x7f080a59, float:1.8082874E38)
            r0 = 2131102439(0x7f060ae7, float:1.7817316E38)
            android.graphics.drawable.Drawable r0 = X.AnonymousClass4aX.A02(r2, r1, r0)
            X.C18070vi.A0X(r0)
            r4.setOverflowIcon(r0)
            r1 = 2
            X.79q r0 = new X.79q
            r0.<init>(r10, r1)
            r4.A0C = r0
            goto L_0x0095
        L_0x0140:
            boolean r0 = r10 instanceof X.AnonymousClass618
            if (r0 == 0) goto L_0x015c
            java.lang.Object r2 = r6.A0U(r9)
            java.lang.String r0 = "null cannot be cast to non-null type com.whatsapp.expressionstray.ui.stickergrid.StickerGridViewItem.ContentStickersSection"
            X.C18070vi.A0z(r2, r0)
            X.60m r2 = (X.C1176660m) r2
            X.618 r10 = (X.AnonymousClass618) r10
            X.5kV r1 = r10.A00
            java.util.List r0 = r2.A01
            r1.A0W(r0)
            r1.notifyDataSetChanged()
            return
        L_0x015c:
            boolean r0 = r10 instanceof X.AnonymousClass61I
            if (r0 == 0) goto L_0x02f6
            java.lang.Object r5 = r6.A0U(r9)
            java.lang.String r0 = "null cannot be cast to non-null type com.whatsapp.expressionstray.ui.stickergrid.StickerGridViewItem.StickerLocal"
            X.C18070vi.A0z(r5, r0)
            X.60s r5 = (X.C1177260s) r5
            X.61I r10 = (X.AnonymousClass61I) r10
            int r12 = r6.A00
            boolean r11 = r6.A0V
            boolean r4 = r6.A03
            java.util.Map r0 = r6.A0H
            X.77d r15 = r5.A01
            boolean r1 = r0.containsKey(r15)
            java.lang.String r0 = r5.A02
            r10.A00 = r0
            r10.A02 = r1
            if (r4 == 0) goto L_0x0190
            boolean r0 = X.AnonymousClass61I.A00(r5)
            if (r0 != 0) goto L_0x0190
            boolean r0 = X.AnonymousClass61I.A01(r5)
            r3 = 1
            if (r0 == 0) goto L_0x0191
        L_0x0190:
            r3 = 0
        L_0x0191:
            if (r11 == 0) goto L_0x01e0
            X.0vl r0 = r10.A0H
            int r0 = X.C72453Mb.A0I(r0)
            android.view.View r11 = r10.A05
            X.C18070vi.A0d(r11, r7)
            X.C108975cc.A0v(r11, r0)
            X.00H r13 = r10.A0C
            java.lang.Object r1 = r13.get()
            X.6sK r1 = (X.C135516sK) r1
            android.content.Context r0 = X.AnonymousClass3MY.A04(r11)
            int r1 = r1.A00(r0)
            com.whatsapp.stickers.StickerView r0 = r10.A0B
            X.C124146Xf.A00(r0, r1)
            java.lang.Object r1 = r13.get()
            X.6sK r1 = (X.C135516sK) r1
            android.content.Context r0 = X.AnonymousClass3MY.A04(r11)
            int r1 = r1.A01(r0)
            X.0vl r0 = r10.A0D
            android.view.View r0 = X.AnonymousClass3MW.A0A(r0)
            X.C124146Xf.A00(r0, r1)
            java.lang.Object r1 = r13.get()
            X.6sK r1 = (X.C135516sK) r1
            android.content.Context r0 = X.AnonymousClass3MY.A04(r11)
            int r1 = r1.A01(r0)
            android.widget.FrameLayout r0 = r10.A06
            X.C124146Xf.A00(r0, r1)
        L_0x01e0:
            com.whatsapp.stickers.StickerView r14 = r10.A0B
            r14.setDisabled(r3)
            X.0vl r11 = r10.A0F
            android.view.View r1 = X.AnonymousClass3MW.A0A(r11)
            int r0 = X.C72453Mb.A07(r3)
            r1.setVisibility(r0)
            if (r3 != 0) goto L_0x0200
            java.lang.String r1 = r15.A0F
            if (r1 == 0) goto L_0x02a0
            java.lang.String r0 = "loading-hash"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x02a0
        L_0x0200:
            android.widget.FrameLayout r13 = r10.A06
            r0 = 0
            r13.setOnClickListener(r0)
            r13.setOnLongClickListener(r0)
            if (r3 == 0) goto L_0x0213
            android.view.View r1 = X.AnonymousClass3MW.A0A(r11)
            r0 = 2
            X.C89944dH.A00(r1, r10, r0)
        L_0x0213:
            r13.setEnabled(r2)
        L_0x0216:
            android.view.View r1 = r10.A0H
            r0 = 2131232942(0x7f0808ae, float:1.8082007E38)
            r1.setBackgroundResource(r0)
            r14.A02 = r7
            X.1Sw r2 = r10.A08
            X.0vl r0 = r10.A0H
            int r17 = X.C72453Mb.A0I(r0)
            int r18 = X.C72453Mb.A0I(r0)
            X.7MN r1 = new X.7MN
            r1.<init>(r10, r15, r4)
            boolean r0 = r5.A03
            X.2my r13 = new X.2my
            r21 = r7
            r22 = r7
            r23 = r0
            r19 = r12
            r20 = r9
            r16 = r1
            r13.<init>(r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
            r2.A06(r13)
            X.0vl r0 = r10.A0E
            android.view.View r1 = X.AnonymousClass3MW.A0A(r0)
            if (r4 == 0) goto L_0x029d
            boolean r0 = X.AnonymousClass61I.A00(r5)
            if (r0 != 0) goto L_0x025b
            boolean r0 = X.AnonymousClass61I.A01(r5)
            if (r0 == 0) goto L_0x029d
        L_0x025b:
            r0 = 0
        L_0x025c:
            r1.setVisibility(r0)
            X.0vl r0 = r10.A0D
            android.view.View r1 = X.AnonymousClass3MW.A0A(r0)
            boolean r0 = r10.A02
            int r0 = X.C72453Mb.A07(r0)
            r1.setVisibility(r0)
            X.0vl r0 = r10.A0G
            android.view.View r1 = X.C72453Mb.A0T(r0)
            boolean r0 = r10.A02
            int r0 = X.C72453Mb.A07(r0)
            r1.setVisibility(r0)
            r14.setDisabled(r3)
            android.view.View r1 = X.AnonymousClass3MW.A0A(r11)
            int r0 = X.C72453Mb.A07(r3)
            r1.setVisibility(r0)
            boolean r0 = r6.A0Y
            if (r0 == 0) goto L_0x0294
            boolean r0 = r6.A02
            if (r0 == 0) goto L_0x0294
            r8 = 1
        L_0x0294:
            r10.A0C(r8)
            boolean r0 = r6.A02
            r10.A0B(r0)
            return
        L_0x029d:
            r0 = 8
            goto L_0x025c
        L_0x02a0:
            android.widget.FrameLayout r1 = r10.A06
            r1.setEnabled(r7)
            boolean r0 = X.AnonymousClass61I.A01(r5)
            if (r0 == 0) goto L_0x02c4
            r13 = 3
        L_0x02ac:
            if (r4 == 0) goto L_0x02d8
            X.78C r0 = new X.78C
            r16 = r0
            r17 = r15
            r18 = r9
            r19 = r10
            r20 = r13
            r21 = r2
            r16.<init>(r17, r18, r19, r20, r21)
            r1.setOnClickListener(r0)
            goto L_0x0216
        L_0x02c4:
            boolean r0 = X.AnonymousClass61I.A00(r5)
            if (r0 == 0) goto L_0x02cc
            r13 = 4
            goto L_0x02ac
        L_0x02cc:
            X.6UU r0 = r5.A00
            boolean r0 = r0 instanceof X.AnonymousClass613
            if (r0 == 0) goto L_0x02d5
            r13 = 14
            goto L_0x02ac
        L_0x02d5:
            int r13 = r10.A04
            goto L_0x02ac
        L_0x02d8:
            X.6LA r0 = new X.6LA
            r16 = r0
            r17 = r10
            r18 = r9
            r19 = r15
            r20 = r13
            r21 = r7
            r16.<init>(r17, r18, r19, r20, r21)
            r1.setOnClickListener(r0)
            X.78f r0 = new X.78f
            r0.<init>(r5, r15, r10, r2)
            r1.setOnLongClickListener(r0)
            goto L_0x0216
        L_0x02f6:
            boolean r0 = r10 instanceof X.AnonymousClass619
            if (r0 == 0) goto L_0x0331
            X.619 r10 = (X.AnonymousClass619) r10
            boolean r0 = r6.A0V
            if (r0 == 0) goto L_0x005c
            android.view.View r4 = r10.A00
            r0 = 2131430734(0x7f0b0d4e, float:1.8483177E38)
            android.view.View r3 = r4.findViewById(r0)
            X.00H r2 = r10.A01
            java.lang.Object r1 = r2.get()
            X.6sK r1 = (X.C135516sK) r1
            android.content.Context r0 = X.AnonymousClass3MY.A04(r4)
            int r0 = r1.A02(r0)
            X.C124146Xf.A00(r4, r0)
            java.lang.Object r1 = r2.get()
            X.6sK r1 = (X.C135516sK) r1
            android.content.Context r0 = X.AnonymousClass3MY.A04(r4)
            int r0 = r1.A00(r0)
            X.C18070vi.A0b(r3)
            X.C124146Xf.A00(r3, r0)
            return
        L_0x0331:
            boolean r0 = r10 instanceof X.AnonymousClass61F
            if (r0 == 0) goto L_0x03a6
            X.61F r10 = (X.AnonymousClass61F) r10
            boolean r0 = r6.A03
            r7 = r0 ^ 1
            boolean r6 = r6.A0V
            android.view.ViewGroup r4 = r10.A00
            r4.setEnabled(r7)
            com.whatsapp.wds.components.button.WDSButton r3 = r10.A02
            android.view.View r5 = r10.A03
            if (r7 == 0) goto L_0x039e
            r0 = 49
            X.AnonymousClass78O.A00(r5, r10, r0)
            android.content.Context r1 = r3.getContext()
            r0 = 2131103277(0x7f060e2d, float:1.7819016E38)
            android.content.res.ColorStateList r0 = X.C19740yt.A03(r1, r0)
            r3.setBackgroundTintList(r0)
            X.AnonymousClass3MW.A1Q(r5)
        L_0x035e:
            boolean r1 = r10.A06
            r0 = 2131233389(0x7f080a6d, float:1.8082914E38)
            if (r1 == 0) goto L_0x0368
            r0 = 2131233046(0x7f080916, float:1.8082218E38)
        L_0x0368:
            r3.setEnabled(r7)
            r3.setIcon((int) r0)
            com.whatsapp.WaTextView r2 = r10.A01
            android.content.res.Resources r1 = r5.getResources()
            r0 = 2131103156(0x7f060db4, float:1.781877E38)
            if (r7 == 0) goto L_0x037c
            r0 = 2131103150(0x7f060dae, float:1.7818758E38)
        L_0x037c:
            int r0 = r1.getColor(r0)
            r2.setTextColor(r0)
            if (r6 == 0) goto L_0x005c
            X.00H r0 = r10.A04
            java.lang.Object r1 = r0.get()
            X.6sK r1 = (X.C135516sK) r1
            android.content.Context r0 = X.AnonymousClass3MY.A04(r5)
            int r0 = r1.A02(r0)
            X.C108975cc.A0v(r4, r0)
            X.4D1 r0 = X.AnonymousClass4D1.SMALL
            r3.setSize(r0)
            return
        L_0x039e:
            r0 = 0
            r5.setOnClickListener(r0)
            r3.setBackgroundTintList(r0)
            goto L_0x035e
        L_0x03a6:
            boolean r0 = r10 instanceof X.AnonymousClass61H
            if (r0 == 0) goto L_0x03b4
            X.61H r10 = (X.AnonymousClass61H) r10
            boolean r0 = r6.A03
            r0 = r0 ^ 1
            r10.A0B(r0)
            return
        L_0x03b4:
            boolean r0 = r10 instanceof X.AnonymousClass61E
            if (r0 == 0) goto L_0x03dc
            X.61E r10 = (X.AnonymousClass61E) r10
            com.whatsapp.WaTextView r1 = r10.A02
            r0 = 2131896425(0x7f122869, float:1.942771E38)
            r1.setText(r0)
            boolean r0 = r10.A05
            r1 = 2131896429(0x7f12286d, float:1.942772E38)
            if (r0 == 0) goto L_0x03cc
            r1 = 2131896430(0x7f12286e, float:1.9427721E38)
        L_0x03cc:
            com.whatsapp.WaTextView r0 = r10.A01
            r0.setText(r1)
            android.view.View r0 = r10.A0H
            X.C89944dH.A00(r0, r10, r2)
            android.view.View r0 = r10.A00
            X.C89944dH.A00(r0, r10, r7)
            return
        L_0x03dc:
            boolean r0 = r10 instanceof X.AnonymousClass61A
            if (r0 == 0) goto L_0x0414
            X.61A r10 = (X.AnonymousClass61A) r10
            java.lang.Object r8 = r6.A0U(r9)
            boolean r0 = r8 instanceof X.C1177060q
            if (r0 == 0) goto L_0x0412
            X.60q r8 = (X.C1177060q) r8
        L_0x03ec:
            boolean r4 = r6.A03
            if (r8 == 0) goto L_0x005c
            com.whatsapp.WaTextView r9 = r10.A00
            android.content.Context r3 = r9.getContext()
            r1 = 2131896471(0x7f122897, float:1.9427804E38)
            java.lang.Object[] r0 = new java.lang.Object[r7]
            java.lang.String r5 = r8.A01
            r0[r2] = r5
            X.AnonymousClass3MY.A0y(r3, r9, r0, r1)
            if (r4 == 0) goto L_0x04c2
            r0 = 0
            r9.setOnClickListener(r0)
            android.content.Context r3 = r9.getContext()
            android.content.Context r2 = r9.getContext()
            goto L_0x0053
        L_0x0412:
            r8 = 0
            goto L_0x03ec
        L_0x0414:
            boolean r0 = r10 instanceof X.AnonymousClass61D
            if (r0 == 0) goto L_0x0459
            java.lang.Object r1 = r6.A0U(r9)
            java.lang.String r0 = "null cannot be cast to non-null type com.whatsapp.expressionstray.ui.stickergrid.StickerGridViewItem.ShapeSticker"
            X.C18070vi.A0z(r1, r0)
            X.60o r1 = (X.C1176860o) r1
            boolean r0 = r6.A0X
            X.61D r10 = (X.AnonymousClass61D) r10
            if (r0 == 0) goto L_0x0444
            X.6zT r4 = r1.A00
            X.76z r3 = r6.A01
            android.view.View r1 = r10.A0H
            r0 = 28
            X.C90014dO.A00(r1, r10, r4, r0)
            android.widget.ImageView r2 = r10.A00
            X.AnonymousClass3MW.A1Q(r2)
            X.6nk r1 = r10.A01
        L_0x043b:
            X.73u r0 = r4.A01
            X.C18070vi.A0W(r2)
            r1.A00(r2, r3, r0, r7)
            return
        L_0x0444:
            X.6zT r5 = r1.A00
            X.76z r4 = r6.A01
            java.util.List r0 = X.C42011xT.A0I
            android.view.View r1 = r10.A0H
            r0 = 28
            X.C90014dO.A00(r1, r10, r5, r0)
            android.widget.ImageView r3 = r10.A00
            X.AnonymousClass3MW.A1Q(r3)
            X.6nk r1 = r10.A01
            goto L_0x047c
        L_0x0459:
            boolean r0 = r10 instanceof X.AnonymousClass61B
            if (r0 == 0) goto L_0x0485
            X.61B r10 = (X.AnonymousClass61B) r10
            java.lang.Object r1 = r6.A0U(r9)
            java.lang.String r0 = "null cannot be cast to non-null type com.whatsapp.expressionstray.ui.stickergrid.StickerGridViewItem.ShapeEmoji"
            X.C18070vi.A0z(r1, r0)
            X.60n r1 = (X.C1176760n) r1
            X.6zT r5 = r1.A00
            X.76z r4 = r6.A01
            android.view.View r1 = r10.A0H
            r0 = 26
            X.C90014dO.A00(r1, r10, r5, r0)
            android.widget.ImageView r3 = r10.A00
            X.AnonymousClass3MW.A1Q(r3)
            X.6nk r1 = r10.A01
        L_0x047c:
            X.73u r0 = r5.A01
            X.C18070vi.A0W(r3)
            r1.A00(r3, r4, r0, r2)
            return
        L_0x0485:
            boolean r0 = r10 instanceof X.AnonymousClass616
            if (r0 == 0) goto L_0x0499
            X.616 r10 = (X.AnonymousClass616) r10
            X.1Di r2 = r6.A0M
            if (r2 != 0) goto L_0x0491
            X.83Z r2 = X.AnonymousClass83Z.A00
        L_0x0491:
            android.view.View r1 = r10.A00
            r0 = 25
            X.C90014dO.A00(r1, r2, r10, r0)
            return
        L_0x0499:
            boolean r0 = r10 instanceof X.C80903yL
            if (r0 != 0) goto L_0x005c
            boolean r0 = r10 instanceof X.AnonymousClass61C
            if (r0 == 0) goto L_0x005c
            X.61C r10 = (X.AnonymousClass61C) r10
            java.lang.Object r1 = r6.A0U(r9)
            java.lang.String r0 = "null cannot be cast to non-null type com.whatsapp.expressionstray.ui.stickergrid.StickerGridViewItem.ShapeStickerLast"
            X.C18070vi.A0z(r1, r0)
            X.60p r1 = (X.C1176960p) r1
            X.6zT r4 = r1.A00
            X.76z r3 = r6.A01
            android.view.View r1 = r10.A0H
            r0 = 27
            X.C90014dO.A00(r1, r10, r4, r0)
            android.widget.ImageView r2 = r10.A00
            X.AnonymousClass3MW.A1Q(r2)
            X.6nk r1 = r10.A01
            goto L_0x043b
        L_0x04c2:
            android.content.Context r4 = r9.getContext()
            android.content.Context r3 = r9.getContext()
            r1 = 2130971977(0x7f040d49, float:1.7552708E38)
            r0 = 2131103150(0x7f060dae, float:1.7818758E38)
            X.C72463Mc.A0w(r3, r4, r9, r1, r0)
            r0 = 4
            X.AnonymousClass3MY.A1E(r9, r8, r10, r0)
            X.AnonymousClass3MW.A1Q(r9)
            android.content.Context r1 = r9.getContext()
            r0 = 2131896472(0x7f122898, float:1.9427806E38)
            java.lang.String r0 = X.C17890vO.A0R(r1, r5, r7, r2, r0)
            r9.setContentDescription(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C111835kV.Bmc(X.1xT, int):void");
    }

    public int getItemViewType(int i) {
        if (i >= A0Q()) {
            return 0;
        }
        Object A0U2 = A0U(i);
        if (A0U2 instanceof C1177160r) {
            return 0;
        }
        if (A0U2 instanceof C1177360t) {
            return 1;
        }
        if (A0U2 instanceof C1177260s) {
            return 2;
        }
        if (A0U2 instanceof C1176860o) {
            return 5;
        }
        if (A0U2 instanceof C1176760n) {
            return 11;
        }
        if (A0U2 instanceof C1176360j) {
            return 6;
        }
        if (A0U2 instanceof C1176460k) {
            return 7;
        }
        if (A0U2 instanceof C1177060q) {
            return 8;
        }
        if (A0U2 instanceof C1176260i) {
            return 9;
        }
        if (A0U2 instanceof C1176560l) {
            return 10;
        }
        if (A0U2 instanceof C1176660m) {
            return 12;
        }
        if (A0U2 instanceof C1176960p) {
            return 13;
        }
        throw AnonymousClass3MW.A14();
    }

    /* JADX WARNING: type inference failed for: r0v4, types: [X.1uf, java.lang.Object] */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C111835kV(C25311Ns r4, C1417976z r5, C125906bs r6, C132866nk r7, C18030ve r8, C26631Sw r9, AnonymousClass88B r10, WDSToolbar wDSToolbar, AnonymousClass00H r12, AnonymousClass00H r13, AnonymousClass00H r14, Integer num, C18090vk r16, C18090vk r17, C18090vk r18, C22821Di r19, C22821Di r20, C22821Di r21, C22821Di r22, C22821Di r23, C22821Di r24, C22821Di r25, AnonymousClass1OS r26, int i, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        super((C40411uf) new Object());
        C18070vi.A0s(r8, r12, r13, r14);
        C18070vi.A0d(r9, 8);
        C108975cc.A10(r4, 9, r10);
        AnonymousClass1OS r1 = r26;
        C18070vi.A0d(r1, 13);
        C18070vi.A0d(r7, 14);
        this.A09 = r8;
        this.A0F = r12;
        this.A0D = r13;
        this.A0E = r14;
        boolean z6 = z;
        this.A0U = z6;
        this.A0W = z2;
        this.A0Y = z3;
        this.A0A = r9;
        this.A06 = r4;
        this.A05 = i;
        this.A0V = z4;
        this.A0B = r10;
        this.A0T = r1;
        this.A08 = r7;
        this.A0O = r19;
        this.A0K = r16;
        this.A0L = r17;
        this.A0J = r18;
        this.A0M = r20;
        this.A0P = r21;
        this.A0N = r22;
        this.A01 = r5;
        this.A07 = r6;
        this.A0C = wDSToolbar;
        this.A0S = r23;
        this.A0R = r24;
        this.A0Q = r25;
        this.A0G = num;
        this.A0X = z5;
        A0K(z6);
    }
}
