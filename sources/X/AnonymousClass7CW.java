package X;

import com.facebook.shimmer.ShimmerFrameLayout;
import com.whatsapp.WaTextView;

/* renamed from: X.7CW  reason: invalid class name */
public final class AnonymousClass7CW implements BCR {
    public int A00;
    public int A01;
    public AnonymousClass1GP A02;
    public AnonymousClass1F9 A03;
    public ShimmerFrameLayout A04;
    public C20245ADd A05;
    public AnonymousClass86T A06 = new AnonymousClass7CY(2);
    public AnonymousClass77B A07 = C123716Vo.A00();
    public C28931bI A08;
    public C28931bI A09;
    public WaTextView A0A;
    public final AnonymousClass6a1 A0B;
    public final AnonymousClass1KB A0C;
    public final C18100vl A0D = AnonymousClass1DF.A01(new C148337hH(this));
    public final C18100vl A0E = AnonymousClass1DF.A01(new C148347hI(this));
    public final C131476lA A0F;

    public void A00(AnonymousClass1GP r5, AnonymousClass1F9 r6, ShimmerFrameLayout shimmerFrameLayout, int i) {
        C18070vi.A0d(shimmerFrameLayout, 2);
        this.A03 = r6;
        this.A02 = r5;
        this.A04 = shimmerFrameLayout;
        shimmerFrameLayout.A03();
        this.A01 = i;
        if (i != 0) {
            ShimmerFrameLayout shimmerFrameLayout2 = this.A04;
            if (shimmerFrameLayout2 == null) {
                C18070vi.A11("shimmerView");
                throw null;
            }
            shimmerFrameLayout2.setPaddingRelative(shimmerFrameLayout.getResources().getDimensionPixelSize(2131169533), shimmerFrameLayout.getResources().getDimensionPixelSize(2131169544), 0, 0);
        }
        WaTextView A0N = AnonymousClass3Ma.A0N(shimmerFrameLayout, 2131436667);
        A0N.getLayoutParams().width = A0N.getResources().getDimensionPixelSize(2131168372);
        A0N.setBackgroundColor(-16777216);
        this.A0A = A0N;
        this.A08 = C28931bI.A00(shimmerFrameLayout, 2131436660);
        this.A09 = C28931bI.A00(shimmerFrameLayout, 2131436661);
    }

    public void C8d(C20245ADd aDd, AnonymousClass77B r2, int i) {
    }

    public void Bcv() {
        ShimmerFrameLayout shimmerFrameLayout = this.A04;
        if (shimmerFrameLayout == null) {
            C18070vi.A11("shimmerView");
            throw null;
        }
        shimmerFrameLayout.A01();
        shimmerFrameLayout.setVisibility(8);
    }

    public void Bql() {
        ShimmerFrameLayout shimmerFrameLayout = this.A04;
        if (shimmerFrameLayout != null) {
            shimmerFrameLayout.setVisibility(0);
            ShimmerFrameLayout shimmerFrameLayout2 = this.A04;
            if (shimmerFrameLayout2 != null) {
                shimmerFrameLayout2.A02();
                return;
            }
        }
        C18070vi.A11("shimmerView");
        throw null;
    }

    /* JADX WARNING: type inference failed for: r10v2, types: [X.6uy, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r12v1, types: [X.6uz, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0083, code lost:
        if (X.C196499vA.A00(X.C196499vA.A01(r4, r13), r5, r4.A02) != null) goto L_0x0085;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void C8V(X.C20245ADd r18, X.AnonymousClass77B r19, int r20, boolean r21) {
        /*
            r17 = this;
            r3 = r17
            com.facebook.shimmer.ShimmerFrameLayout r0 = r3.A04
            java.lang.String r16 = "shimmerView"
            if (r0 == 0) goto L_0x0023
            r0.A01()
            com.facebook.shimmer.ShimmerFrameLayout r1 = r3.A04
            if (r1 == 0) goto L_0x0023
            r0 = 2131432172(0x7f0b12ec, float:1.8486094E38)
            X.C108975cc.A0t(r1, r0)
            r5 = r18
            r3.A05 = r5
            r2 = r20
            r3.A00 = r2
            com.whatsapp.WaTextView r10 = r3.A0A
            if (r10 != 0) goto L_0x0028
            java.lang.String r16 = "titleView"
        L_0x0023:
            X.C18070vi.A11(r16)
        L_0x0026:
            r0 = 0
            throw r0
        L_0x0028:
            android.view.ViewGroup$LayoutParams r1 = r10.getLayoutParams()
            r0 = -2
            r1.width = r0
            r8 = 0
            r10.setBackgroundColor(r8)
            X.6lA r0 = r3.A0F
            r4 = r19
            java.lang.String r6 = r4.A00
            java.lang.String r0 = r0.A00(r6)
            r10.setText(r0)
            android.content.Context r9 = r10.getContext()
            android.content.Context r7 = r10.getContext()
            r1 = 2131103152(0x7f060db0, float:1.7818762E38)
            r0 = 2130968992(0x7f0401a0, float:1.7546653E38)
            X.C72463Mc.A0w(r7, r9, r10, r0, r1)
            com.facebook.shimmer.ShimmerFrameLayout r0 = r3.A04
            if (r0 == 0) goto L_0x0023
            r0.setVisibility(r8)
            int r12 = r3.A01
            java.util.List r0 = r4.A01
            java.util.ArrayList r1 = X.C29351c6.A0D(r0)
            java.util.Iterator r15 = r0.iterator()
            r13 = 0
        L_0x0065:
            boolean r0 = r15.hasNext()
            if (r0 == 0) goto L_0x0097
            java.lang.Object r11 = r15.next()
            int r14 = r13 + 1
            if (r13 < 0) goto L_0x01e3
            X.AD8 r11 = (X.AD8) r11
            r10 = 1
            if (r12 == 0) goto L_0x0085
            X.ADd r7 = X.C196499vA.A01(r4, r13)
            java.util.Map r0 = r4.A02
            X.ADo r0 = X.C196499vA.A00(r7, r5, r0)
            r9 = 0
            if (r0 == 0) goto L_0x0086
        L_0x0085:
            r9 = 1
        L_0x0086:
            boolean r7 = X.C123726Vp.A00(r5, r4, r12, r13)
            if (r13 == r2) goto L_0x008d
            r10 = 0
        L_0x008d:
            X.77A r0 = new X.77A
            r0.<init>(r11, r9, r7, r10)
            r1.add(r0)
            r13 = r14
            goto L_0x0065
        L_0x0097:
            boolean r0 = r1 instanceof java.util.Collection
            if (r0 == 0) goto L_0x00aa
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L_0x00aa
        L_0x00a1:
            X.1bI r2 = r3.A09
            r11 = 0
            if (r2 != 0) goto L_0x00d3
            java.lang.String r16 = "variantDropdownViewStubHolder"
            goto L_0x0023
        L_0x00aa:
            java.util.Iterator r7 = r1.iterator()
        L_0x00ae:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x00c7
            java.lang.Object r0 = r7.next()
            X.77A r0 = (X.AnonymousClass77A) r0
            boolean r0 = r0.A03
            if (r0 == 0) goto L_0x00ae
            int r8 = r8 + 1
            if (r8 >= 0) goto L_0x00ae
            X.AnonymousClass1ZU.A0A()
            goto L_0x0026
        L_0x00c7:
            r0 = 15
            if (r8 <= r0) goto L_0x00a1
            X.1bI r6 = r3.A08
            if (r6 != 0) goto L_0x01ed
            java.lang.String r16 = "variantChipViewStubHolder"
            goto L_0x0023
        L_0x00d3:
            r0 = 8
            r2.A04(r0)
            X.1bI r0 = r3.A08
            java.lang.String r2 = "variantChipViewStubHolder"
            if (r0 == 0) goto L_0x01e8
            int r0 = r0.A01()
            r10 = 0
            boolean r12 = X.AnonymousClass000.A1O(r0)
            X.1bI r0 = r3.A08
            if (r0 == 0) goto L_0x01e8
            r0.A04(r10)
            X.1bI r0 = r3.A08
            if (r0 == 0) goto L_0x01e8
            android.view.View r2 = r0.A02()
            r0 = 2131436662(0x7f0b2476, float:1.84952E38)
            android.view.View r5 = r2.findViewById(r0)
            com.google.android.material.chip.ChipGroup r5 = (com.google.android.material.chip.ChipGroup) r5
            X.77B r0 = r3.A07
            java.lang.String r0 = r0.A00
            boolean r0 = X.C18070vi.A18(r6, r0)
            if (r0 != 0) goto L_0x010c
            r5.removeAllViews()
        L_0x010c:
            java.util.Iterator r8 = r1.iterator()
        L_0x0110:
            boolean r0 = r8.hasNext()
            java.lang.String r9 = "null cannot be cast to non-null type com.google.android.material.chip.Chip"
            if (r0 == 0) goto L_0x019b
            java.lang.Object r0 = r8.next()
            X.77A r0 = (X.AnonymousClass77A) r0
            X.AD8 r0 = r0.A00
            X.8iQ r0 = (X.C168168iQ) r0
            java.lang.String r2 = r0.A00
            r0 = 36
            java.lang.String r6 = X.AnonymousClass1EG.A0F(r2, r0)
            X.C18070vi.A0X(r6)
            X.C18070vi.A0b(r5)
            r2 = 1
            X.4so r0 = new X.4so
            r0.<init>(r5, r2)
            java.util.List r0 = X.AnonymousClass1b2.A06(r0)
            java.util.Iterator r7 = r0.iterator()
        L_0x013e:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x0199
            java.lang.Object r2 = r7.next()
            r0 = r2
            android.view.View r0 = (android.view.View) r0
            X.C18070vi.A0z(r0, r9)
            android.widget.TextView r0 = (android.widget.TextView) r0
            java.lang.CharSequence r0 = r0.getText()
            boolean r0 = X.C18070vi.A18(r0, r6)
            if (r0 == 0) goto L_0x013e
        L_0x015a:
            boolean r0 = r2 instanceof com.google.android.material.chip.Chip
            if (r0 == 0) goto L_0x0160
            if (r2 != 0) goto L_0x0110
        L_0x0160:
            com.facebook.shimmer.ShimmerFrameLayout r0 = r3.A04
            if (r0 == 0) goto L_0x0023
            android.view.LayoutInflater r2 = X.AnonymousClass3MZ.A0D(r0)
            r0 = 2131627313(0x7f0e0d31, float:1.8881887E38)
            android.view.View r2 = r2.inflate(r0, r5, r10)
            X.C18070vi.A0z(r2, r9)
            com.google.android.material.chip.Chip r2 = (com.google.android.material.chip.Chip) r2
            int r0 = android.view.View.generateViewId()
            r2.setId(r0)
            r2.setText(r6)
            r5.addView(r2)
            X.0vl r0 = r3.A0E
            java.lang.Object r0 = r0.getValue()
            android.content.res.ColorStateList r0 = (android.content.res.ColorStateList) r0
            r2.setTextColor(r0)
            X.0vl r0 = r3.A0D
            java.lang.Object r0 = r0.getValue()
            android.content.res.ColorStateList r0 = (android.content.res.ColorStateList) r0
            r2.setChipBackgroundColor(r0)
            goto L_0x0110
        L_0x0199:
            r2 = r11
            goto L_0x015a
        L_0x019b:
            X.C18070vi.A0b(r5)
            r0 = 1
            java.util.Iterator r11 = X.C99434so.A00(r5, r0)
        L_0x01a3:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L_0x024f
            java.lang.Object r8 = r11.next()
            int r7 = r10 + 1
            if (r10 < 0) goto L_0x01e3
            android.view.View r8 = (android.view.View) r8
            X.C18070vi.A0z(r8, r9)
            java.lang.Object r6 = r1.get(r10)
            X.77A r6 = (X.AnonymousClass77A) r6
            boolean r0 = r6.A03
            int r0 = X.C72453Mb.A07(r0)
            r8.setVisibility(r0)
            boolean r2 = r6.A01
            r8.setActivated(r2)
            boolean r0 = r6.A02
            r8.setSelected(r0)
            if (r2 == 0) goto L_0x01dc
            r0 = 5
            X.4dX r2 = new X.4dX
            r2.<init>(r3, r10, r0)
        L_0x01d7:
            r8.setOnClickListener(r2)
            r10 = r7
            goto L_0x01a3
        L_0x01dc:
            r0 = 7
            X.AFB r2 = new X.AFB
            r2.<init>(r8, r0)
            goto L_0x01d7
        L_0x01e3:
            X.AnonymousClass1ZU.A0B()
            goto L_0x0026
        L_0x01e8:
            X.C18070vi.A11(r2)
            goto L_0x0026
        L_0x01ed:
            r0 = 8
            r6.A04(r0)
            X.1bI r6 = r3.A09
            java.lang.String r11 = "variantDropdownViewStubHolder"
            if (r6 == 0) goto L_0x024a
            r0 = 0
            r6.A04(r0)
            X.1bI r0 = r3.A09
            if (r0 == 0) goto L_0x024a
            android.view.View r6 = r0.A02()
            r0 = 2131436671(0x7f0b247f, float:1.849522E38)
            r8 = 2131436671(0x7f0b247f, float:1.849522E38)
            android.widget.TextView r10 = X.C17880vN.A0E(r6, r0)
            android.content.Context r9 = r10.getContext()
            android.content.Context r7 = r10.getContext()
            r6 = 2131100048(0x7f060190, float:1.7812466E38)
            r0 = 2130968989(0x7f04019d, float:1.7546647E38)
            int r7 = X.AnonymousClass3MZ.A02(r7, r9, r0, r6)
            android.graphics.drawable.Drawable[] r6 = r10.getCompoundDrawables()
            r0 = 2
            r0 = r6[r0]
            r0.setTint(r7)
            X.6a1 r6 = r3.A0B
            int r15 = r3.A01
            X.1bI r0 = r3.A09
            if (r0 == 0) goto L_0x024a
            android.view.View r0 = r0.A02()
            android.widget.TextView r7 = X.AnonymousClass3Ma.A0E(r0, r8)
            X.1F9 r9 = r3.A03
            if (r9 != 0) goto L_0x0242
            java.lang.String r16 = "host"
            goto L_0x0023
        L_0x0242:
            X.1GP r8 = r3.A02
            if (r8 != 0) goto L_0x026e
            java.lang.String r16 = "hostFragmentManager"
            goto L_0x0023
        L_0x024a:
            X.C18070vi.A11(r11)
            goto L_0x0026
        L_0x024f:
            android.content.res.Resources r1 = r5.getResources()
            r0 = 2131169545(0x7f071109, float:1.7953423E38)
            int r0 = r1.getDimensionPixelSize(r0)
            r5.setChipSpacing(r0)
            if (r12 == 0) goto L_0x0298
            X.1KB r2 = r3.A0C
            r0 = 15
            X.AkH r1 = new X.AkH
            r1.<init>(r3, r5, r0)
            android.os.Handler r0 = r2.A02
            r0.post(r1)
            goto L_0x0298
        L_0x026e:
            r0 = 3
            X.7CZ r11 = new X.7CZ
            r11.<init>(r3, r0)
            X.1na r0 = r6.A00
            X.10E r0 = r0.A02
            X.0ve r14 = X.AnonymousClass10E.A8q(r0)
            X.0vb r13 = X.AnonymousClass10E.A6R(r0)
            X.6uy r10 = new X.6uy
            r10.<init>()
            X.6uz r12 = new X.6uz
            r12.<init>()
            X.6z8 r6 = new X.6z8
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15)
            r11 = r21
            r8 = r4
            r9 = r1
            r10 = r2
            r7 = r5
            r6.A01(r7, r8, r9, r10, r11)
        L_0x0298:
            r3.A07 = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7CW.C8V(X.ADd, X.77B, int, boolean):void");
    }

    public AnonymousClass7CW(AnonymousClass6a1 r3, AnonymousClass1KB r4, C131476lA r5) {
        C72473Md.A1I(r4, r3);
        this.A0C = r4;
        this.A0F = r5;
        this.A0B = r3;
    }
}
