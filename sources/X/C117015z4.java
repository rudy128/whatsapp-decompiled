package X;

import android.animation.ObjectAnimator;
import android.app.Activity;
import android.view.View;
import android.widget.ImageView;

/* renamed from: X.5z4  reason: invalid class name and case insensitive filesystem */
public final class C117015z4 extends C74873d3 implements AnonymousClass870 {
    public int A00;
    public View A01;
    public AnonymousClass7MX A02;
    public boolean A03;
    public View A04;
    public final C39711tW A05;
    public final AnonymousClass1KB A06;
    public final AnonymousClass18O A07;
    public final C134106q3 A08;
    public final C144547Hs A09;
    public final C134166q9 A0A;
    public final C18030ve A0B;
    public final AnonymousClass1BI A0C;
    public final C27021Uk A0D;
    public final AnonymousClass2L4 A0E;
    public final AnonymousClass8B1 A0F;
    public final C136936ue A0G;
    public final boolean A0H;
    public final AnonymousClass11S A0I;
    public final C130046in A0J;

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x001f, code lost:
        if (r12 != 0) goto L_0x0021;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0054, code lost:
        if (r12 != 0) goto L_0x0056;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A03(X.C117015z4 r11, int r12) {
        /*
            r6 = 1
            if (r12 == 0) goto L_0x0011
            if (r12 == r6) goto L_0x0011
            r0 = 2
            if (r12 != r0) goto L_0x0152
            X.6q9 r0 = r11.A0A
            if (r0 == 0) goto L_0x0010
            X.6CF r0 = r0.A05
            if (r0 != 0) goto L_0x0011
        L_0x0010:
            r12 = 0
        L_0x0011:
            r10 = 8
            r7 = 8
            if (r12 != r6) goto L_0x0018
            r7 = 0
        L_0x0018:
            r2 = 2
            r8 = 0
            if (r12 == r2) goto L_0x0021
            r8 = 8
            r9 = 0
            if (r12 == 0) goto L_0x0023
        L_0x0021:
            r9 = 8
        L_0x0023:
            r4 = 3
            r3 = 8
            if (r12 != r4) goto L_0x0029
            r3 = 0
        L_0x0029:
            android.view.View r5 = r11.A04
            if (r5 == 0) goto L_0x003d
            r1 = 0
            if (r12 == 0) goto L_0x0032
            if (r12 == r6) goto L_0x003a
        L_0x0032:
            com.whatsapp.emoji.search.EmojiSearchProvider r0 = r11.A0N
            boolean r0 = r0.A02
            if (r0 != 0) goto L_0x003a
            r1 = 8
        L_0x003a:
            r5.setVisibility(r1)
        L_0x003d:
            boolean r0 = r11.A06()
            if (r0 == 0) goto L_0x0141
            android.view.View r1 = r11.A01
            if (r12 == 0) goto L_0x013b
            if (r1 == 0) goto L_0x004d
            r0 = 0
        L_0x004a:
            r1.setVisibility(r0)
        L_0x004d:
            X.4MZ r0 = r11.A08
            boolean r0 = r0.A01
            if (r0 == 0) goto L_0x0056
            r0 = 1
            if (r12 == 0) goto L_0x0057
        L_0x0056:
            r0 = 0
        L_0x0057:
            r11.A0L(r0)
            com.whatsapp.WaEditText r0 = r11.A0M
            if (r12 != 0) goto L_0x0134
            if (r0 == 0) goto L_0x0063
            r0.requestFocus()
        L_0x0063:
            android.view.View r0 = r11.getContentView()
            android.content.Context r5 = r0.getContext()
            r1 = 2130970098(0x7f0405f2, float:1.7548897E38)
            r0 = 2131101221(0x7f060625, float:1.7814846E38)
            int r5 = X.AnonymousClass1YL.A00(r5, r1, r0)
            boolean r0 = X.AnonymousClass000.A1P(r12)
            X.6in r10 = r11.A0J
            r1 = 2131101222(0x7f060626, float:1.7814848E38)
            if (r0 == 0) goto L_0x0081
            r1 = r5
        L_0x0081:
            X.6fw r0 = r10.A01
            if (r0 == 0) goto L_0x0168
            X.0vl r0 = r0.A02
            A05(r0, r1)
            X.6fw r0 = r10.A01
            if (r0 == 0) goto L_0x0168
            X.0vl r0 = r0.A01
            X.C72453Mb.A1U(r0, r9)
            X.6fw r0 = r10.A01
            if (r0 == 0) goto L_0x0168
            X.0vl r0 = r0.A00
            X.C72453Mb.A1U(r0, r9)
            X.7Hs r9 = r11.A09
            if (r9 == 0) goto L_0x00c5
            r1 = 2131101222(0x7f060626, float:1.7814848E38)
            if (r12 != r6) goto L_0x00a6
            r1 = r5
        L_0x00a6:
            X.6oG r0 = r9.A01
            if (r0 == 0) goto L_0x0165
            X.0vl r0 = r0.A04
            A05(r0, r1)
            X.6oG r0 = r9.A01
            if (r0 == 0) goto L_0x0165
            android.view.View r0 = r0.A01
            if (r0 == 0) goto L_0x00ba
            r0.setVisibility(r7)
        L_0x00ba:
            X.6oG r0 = r9.A01
            if (r0 == 0) goto L_0x0165
            android.view.View r0 = r0.A00
            if (r0 == 0) goto L_0x00c5
            r0.setVisibility(r7)
        L_0x00c5:
            X.6q9 r7 = r11.A0A
            if (r7 == 0) goto L_0x00f7
            boolean r6 = X.AnonymousClass000.A1T(r12, r2)
            X.6CF r1 = r7.A05
            if (r1 == 0) goto L_0x00ea
            androidx.viewpager.widget.ViewPager r0 = r1.A07
            r0.setVisibility(r8)
            X.7Kn r2 = r1.A0b
            if (r2 == 0) goto L_0x00ea
            android.view.View r0 = r2.A08
            r0.setVisibility(r8)
            if (r8 != 0) goto L_0x00ea
            int r1 = r2.A01
            if (r1 < 0) goto L_0x00ea
            androidx.recyclerview.widget.LinearLayoutManager r0 = r2.A09
            r0.A13(r1)
        L_0x00ea:
            r1 = 2131101222(0x7f060626, float:1.7814848E38)
            if (r6 == 0) goto L_0x00f0
            r1 = r5
        L_0x00f0:
            X.6i6 r0 = r7.A02
            X.0vl r0 = r0.A03
            A05(r0, r1)
        L_0x00f7:
            X.6q3 r2 = r11.A08
            if (r2 == 0) goto L_0x0126
            if (r12 == r4) goto L_0x0100
            r5 = 2131101222(0x7f060626, float:1.7814848E38)
        L_0x0100:
            X.6h3 r0 = r2.A01
            if (r0 == 0) goto L_0x0111
            android.widget.ImageView r1 = r0.A03
            android.content.Context r0 = r1.getContext()
            android.content.res.ColorStateList r0 = X.C19740yt.A03(r0, r5)
            X.C28081Yu.A00(r0, r1)
        L_0x0111:
            X.6CG r1 = r2.A04
            if (r1 == 0) goto L_0x0121
            androidx.viewpager.widget.ViewPager r0 = r1.A07
            r0.setVisibility(r3)
            X.7Km r0 = r1.A0K
            android.view.View r0 = r0.A02
            r0.setVisibility(r3)
        L_0x0121:
            if (r12 != r4) goto L_0x0126
            r2.A00()
        L_0x0126:
            r11.A00 = r12
            X.0z4 r0 = r11.A06
            android.content.SharedPreferences$Editor r1 = X.C19830z4.A00(r0)
            java.lang.String r0 = "emoji_popup_window_tab_state"
            X.C17880vN.A1C(r1, r0, r12)
            return
        L_0x0134:
            if (r0 == 0) goto L_0x0063
            r0.clearFocus()
            goto L_0x0063
        L_0x013b:
            if (r1 == 0) goto L_0x004d
            r0 = 8
            goto L_0x004a
        L_0x0141:
            android.view.View r0 = r11.A01
            if (r0 == 0) goto L_0x0148
            r0.setVisibility(r10)
        L_0x0148:
            android.view.ViewGroup r1 = r11.A04
            r0 = 2131435769(0x7f0b20f9, float:1.849339E38)
            X.AnonymousClass3MY.A1B(r1, r0, r8)
            goto L_0x004d
        L_0x0152:
            r0 = 3
            if (r12 != r0) goto L_0x0010
            boolean r0 = r11.A06()
            if (r0 == 0) goto L_0x0010
            X.1Uk r0 = r11.A0D
            boolean r0 = r0.A01()
            if (r0 != 0) goto L_0x0011
            goto L_0x0010
        L_0x0165:
            java.lang.String r0 = "gifKeyboardView"
            goto L_0x016a
        L_0x0168:
            java.lang.String r0 = "emojiKeyboardViewController"
        L_0x016a:
            X.C18070vi.A11(r0)
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C117015z4.A03(X.5z4, int):void");
    }

    public void A0I(View view) {
        C18070vi.A0d(view, 0);
        this.A0N.A00 = new AnonymousClass7IN(view, this, 1);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C117015z4(android.app.Activity r24, android.view.View r25, X.AnonymousClass190 r26, X.AnonymousClass1KB r27, com.whatsapp.KeyboardPopupLayout r28, X.AnonymousClass11S r29, X.AnonymousClass18O r30, com.whatsapp.WaEditText r31, X.AnonymousClass11C r32, X.C19830z4 r33, X.C18000vb r34, X.C134106q3 r35, X.C130046in r36, X.C144547Hs r37, X.C134166q9 r38, X.A59 r39, X.C18030ve r40, X.AnonymousClass1BI r41, X.C18010vc r42, X.C27021Uk r43, X.AnonymousClass2L4 r44, X.C136936ue r45, X.AnonymousClass1L4 r46, java.lang.Integer r47, int r48, boolean r49) {
        /*
            r23 = this;
            r3 = r36
            r6 = r24
            X.1KW r1 = r3.A03
            X.67r r15 = r3.A02
            com.whatsapp.emoji.search.EmojiSearchProvider r0 = r3.A04
            java.lang.Integer r21 = java.lang.Integer.valueOf(r48)
            r5 = r23
            r13 = r34
            r12 = r33
            r11 = r32
            r10 = r31
            r9 = r28
            r8 = r26
            r7 = r25
            r22 = r47
            r20 = r46
            r19 = r42
            r2 = r40
            r14 = r39
            r18 = r2
            r16 = r1
            r17 = r0
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            r5.A0B = r2
            r0 = r27
            r5.A06 = r0
            r0 = r29
            r5.A0I = r0
            r0 = r30
            r5.A07 = r0
            r0 = r45
            r5.A0G = r0
            r0 = r43
            r5.A0D = r0
            r0 = r44
            r5.A0E = r0
            r4 = r38
            r5.A0A = r4
            r0 = r37
            r5.A09 = r0
            r5.A0J = r3
            r0 = r49
            r5.A0H = r0
            r0 = r41
            r5.A0C = r0
            boolean r1 = r5.A06()
            r0 = 0
            r3 = r35
            if (r1 == 0) goto L_0x0067
            r0 = r3
        L_0x0067:
            r5.A08 = r0
            if (r38 == 0) goto L_0x0095
            r4.A01 = r5
            X.00H r0 = r4.A0J
            X.67t r2 = X.C108945cZ.A0w(r0)
            r0 = 16
            X.7RI r1 = X.AnonymousClass7RI.A00(r2, r0)
            java.util.List r0 = r2.A03
            if (r0 == 0) goto L_0x00a5
            r1.run()
        L_0x0080:
            X.6pA r0 = r4.A0E
            boolean r0 = r0.A01()
            if (r0 == 0) goto L_0x0095
            X.5ii r0 = r4.A0F
            if (r0 == 0) goto L_0x0095
            X.1DT r1 = r0.A02
            X.1F9 r6 = (X.AnonymousClass1F9) r6
            r0 = 14
            X.AnonymousClass7AO.A01(r6, r1, r4, r0)
        L_0x0095:
            X.7L5 r0 = new X.7L5
            r0.<init>(r3, r5)
            r5.A0F = r0
            r1 = 3
            X.3XY r0 = new X.3XY
            r0.<init>(r5, r1)
            r5.A05 = r0
            return
        L_0x00a5:
            X.10s r0 = r2.A07
            r0.execute(r1)
            goto L_0x0080
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C117015z4.<init>(android.app.Activity, android.view.View, X.190, X.1KB, com.whatsapp.KeyboardPopupLayout, X.11S, X.18O, com.whatsapp.WaEditText, X.11C, X.0z4, X.0vb, X.6q3, X.6in, X.7Hs, X.6q9, X.A59, X.0ve, X.1BI, X.0vc, X.1Uk, X.2L4, X.6ue, X.1L4, java.lang.Integer, int, boolean):void");
    }

    public static final void A02(C117015z4 r4) {
        View view = r4.A0J;
        if (view != null) {
            Activity activity = r4.A03;
            AnonymousClass4W7.A00(AnonymousClass4aX.A02(activity, r4.A00, 2131101210), view);
            AnonymousClass3MY.A0w(activity, view, 2131898949);
            view.setOnClickListener(r4.A0I);
        }
    }

    public static final void A04(C117015z4 r7, int i) {
        View view = r7.A0J;
        if (view == null) {
            return;
        }
        if (i != 0) {
            int i2 = r7.A0H;
            if (i != 1) {
                if (i2 != 2) {
                    Activity activity = r7.A03;
                    AnonymousClass4W7.A00(AnonymousClass4aX.A03(activity, 2130971385, 2131102623, 2131233057), view);
                    AnonymousClass3MY.A0w(activity, view, 2131896403);
                    ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "alpha", new float[]{0.7f, 1.0f});
                    C18070vi.A0X(ofFloat);
                    ofFloat.setDuration(100);
                    ofFloat.start();
                    C89944dH.A00(view, r7, 33);
                    r7.A0H = 2;
                }
            } else if (i2 != 1) {
                r7.A0F();
            }
        } else {
            int i3 = r7.A0H;
            if (i3 != 0) {
                if (i3 == 2) {
                    ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view, "alpha", new float[]{1.0f, 0.7f});
                    C18070vi.A0X(ofFloat2);
                    ofFloat2.setDuration(75);
                    ofFloat2.addListener(new AnonymousClass74R(r7, 2));
                    ofFloat2.start();
                } else {
                    A02(r7);
                }
                r7.A0H = 0;
            }
        }
    }

    private final boolean A06() {
        if (!this.A0I.A0N()) {
            if (!C18020vd.A05(C18040vf.A02, this.A0B, 1396)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public void A0D() {
        AnonymousClass6CF r2;
        String id;
        AnonymousClass6CG r22;
        AnonymousClass6CF r6;
        int A002 = C17890vO.A00(C17890vO.A0B(this.A06), "emoji_popup_window_tab_state");
        int i = 6;
        if (A002 != 1) {
            i = 10;
            if (A002 != 2) {
                i = 3;
                if (A002 != 3) {
                    i = 4;
                }
            }
        }
        A0K(Integer.valueOf(i), this.A0O, this.A0D);
        super.A0D();
        C144547Hs r0 = this.A09;
        if (r0 != null) {
            r0.A00();
        }
        C134166q9 r4 = this.A0A;
        if (!(r4 == null || (r6 = r4.A05) == null)) {
            r6.A07.getViewTreeObserver().addOnGlobalLayoutListener(r6.A0Q);
            AnonymousClass722 r02 = r6.A0c;
            r02.A03 = r6;
            r02.A03();
            r6.A0U.CC7(new C1179761r());
            C25251Nm r1 = r6.A0V.A01;
            synchronized (r1.A03) {
                C17880vN.A1C(C25251Nm.A00(r1), "sticker_picker_opened_count", C17890vO.A00(C17880vN.A0C(r1.A05), "sticker_picker_opened_count") + 1);
            }
            r6.A0F = true;
        }
        C134106q3 r03 = this.A08;
        if (!(r03 == null || (r22 = r03.A04) == null)) {
            r22.A07.getViewTreeObserver().addOnGlobalLayoutListener(r22.A0C);
            AnonymousClass722 r04 = r22.A0J;
            r04.A03 = r22;
            r04.A03();
            r22.A06 = true;
        }
        if (r4 != null && r4.A01() && (r2 = r4.A05) != null) {
            if (this.A00 == 2) {
                C145227Kl r05 = r2.A0C;
                if (r05 == null) {
                    id = null;
                } else {
                    id = r05.getId();
                }
                if ("contextual_suggestion".equals(id)) {
                    return;
                }
            }
            A0O("contextual_suggestion");
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0188, code lost:
        if (r1.A0D.A01() == false) goto L_0x018a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0E() {
        /*
            r36 = this;
            r1 = r36
            super.A0E()
            android.view.ViewGroup r0 = r1.A04
            X.C18070vi.A0W(r0)
            X.6fw r3 = new X.6fw
            r3.<init>(r0)
            X.6in r0 = r1.A0J
            r0.A00 = r1
            r0.A01 = r3
            X.1rL r2 = r0.A05
            r8 = 0
            X.C18070vi.A0d(r2, r8)
            X.0vl r0 = r3.A02
            android.view.View r0 = X.AnonymousClass3MW.A0A(r0)
            r0.setOnClickListener(r2)
            android.view.ViewGroup r2 = r1.A04
            r0 = 2131434860(0x7f0b1d6c, float:1.8491546E38)
            android.view.View r0 = r2.findViewById(r0)
            r1.A04 = r0
            android.view.View r2 = r1.getContentView()
            r0 = 2131435834(0x7f0b213a, float:1.8493521E38)
            android.view.View r0 = r2.findViewById(r0)
            r1.A01 = r0
            android.view.View r2 = r1.A04
            if (r2 == 0) goto L_0x004b
            com.whatsapp.emoji.search.EmojiSearchProvider r0 = r1.A0N
            boolean r0 = r0.A02
            int r0 = X.C72453Mb.A07(r0)
            r2.setVisibility(r0)
        L_0x004b:
            android.view.View r2 = r1.A04
            if (r2 == 0) goto L_0x0054
            r0 = 10
            X.C825148g.A00(r2, r1, r0)
        L_0x0054:
            X.7Hs r7 = r1.A09
            if (r7 == 0) goto L_0x00e5
            X.1tW r3 = r1.A05
            android.view.ViewGroup r2 = r1.A04
            X.C18070vi.A0W(r2)
            android.app.Activity r0 = r1.A03
            X.C18070vi.A0W(r0)
            X.6oG r9 = new X.6oG
            r9.<init>(r0, r2)
            X.7MX r0 = r1.A02
            X.C18070vi.A0d(r3, r8)
            r7.A01 = r9
            r7.A04 = r0
            r7.A00 = r1
            X.1rL r2 = r7.A0A
            X.0vl r0 = r9.A04
            android.view.View r0 = X.AnonymousClass3MW.A0A(r0)
            r0.setOnClickListener(r2)
            X.66O r6 = new X.66O
            r6.<init>(r7)
            r7.A03 = r6
            android.view.ViewGroup r2 = r9.A03
            r0 = 2131431141(0x7f0b0ee5, float:1.8484003E38)
            android.view.View r0 = X.AnonymousClass1HF.A06(r2, r0)
            r9.A01 = r0
            r0 = 2131431142(0x7f0b0ee6, float:1.8484005E38)
            android.view.View r0 = X.AnonymousClass1HF.A06(r2, r0)
            r9.A00 = r0
            X.0vl r5 = r9.A05
            java.lang.Object r0 = r5.getValue()
            androidx.recyclerview.widget.RecyclerView r0 = (androidx.recyclerview.widget.RecyclerView) r0
            r0.A0t(r3)
            android.content.Context r0 = r9.A02
            android.content.res.Resources r2 = r0.getResources()
            r0 = 2131168605(0x7f070d5d, float:1.7951517E38)
            int r4 = r2.getDimensionPixelSize(r0)
            java.lang.Object r3 = r5.getValue()
            androidx.recyclerview.widget.RecyclerView r3 = (androidx.recyclerview.widget.RecyclerView) r3
            r2 = 1
            X.5lq r0 = new X.5lq
            r0.<init>(r4, r2)
            r3.A0r(r0)
            X.0vl r0 = r9.A08
            android.view.View r2 = X.AnonymousClass3MW.A0A(r0)
            r0 = 48
            X.C825248h.A00(r2, r6, r9, r0)
            java.lang.Object r0 = r5.getValue()
            androidx.recyclerview.widget.RecyclerView r0 = (androidx.recyclerview.widget.RecyclerView) r0
            r0.setAdapter(r6)
            X.6oG r0 = r7.A01
            if (r0 != 0) goto L_0x00e0
            java.lang.String r0 = "gifKeyboardView"
            X.C18070vi.A11(r0)
            r0 = 0
            throw r0
        L_0x00e0:
            X.0vl r0 = r0.A04
            X.C72453Mb.A1U(r0, r8)
        L_0x00e5:
            X.6q3 r3 = r1.A08
            if (r3 == 0) goto L_0x018f
            android.view.ViewGroup r0 = r1.A04
            X.C18070vi.A0W(r0)
            X.6h3 r7 = new X.6h3
            r7.<init>(r0)
            X.6ka r4 = r3.A06
            X.0ve r0 = r1.A0B
            r20 = r0
            android.app.Activity r0 = r1.A03
            r32 = r0
            X.1KB r0 = r4.A01
            r17 = r0
            X.11S r0 = r4.A02
            r18 = r0
            X.10I r0 = r4.A0A
            r16 = r0
            android.view.ViewGroup r0 = r7.A02
            r31 = r0
            X.6ue r14 = r1.A0G
            X.0vl r0 = r4.A0I
            java.lang.Object r13 = r0.getValue()
            X.722 r13 = (X.AnonymousClass722) r13
            X.0vb r12 = r4.A05
            X.1SB r11 = r3.A08
            X.00H r0 = r4.A0D
            java.lang.Object r10 = r0.get()
            X.6vK r10 = (X.C137356vK) r10
            X.00H r0 = r4.A0H
            java.lang.Object r9 = r0.get()
            com.whatsapp.stickers.stickerpack.StickerPackDownloader r9 = (com.whatsapp.stickers.stickerpack.StickerPackDownloader) r9
            X.00H r0 = r4.A0E
            java.lang.Object r6 = X.C18070vi.A0E(r0)
            X.67t r6 = (X.C1193467t) r6
            X.1tW r5 = r1.A05
            X.1Sw r2 = r3.A07
            X.00H r0 = r4.A0B
            java.lang.Object r15 = r0.get()
            X.73V r15 = (X.AnonymousClass73V) r15
            X.1BI r0 = r1.A0C
            X.6CG r4 = new X.6CG
            r23 = r14
            r24 = r10
            r25 = r6
            r26 = r2
            r27 = r11
            r28 = r13
            r29 = r9
            r30 = r16
            r16 = r5
            r19 = r12
            r21 = r0
            r22 = r15
            r13 = r4
            r14 = r32
            r15 = r31
            r13.<init>(r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30)
            r3.A01 = r7
            r3.A02 = r1
            r3.A04 = r4
            X.1rL r2 = r3.A0C
            X.C18070vi.A0d(r2, r8)
            android.widget.ImageView r0 = r7.A03
            r0.setOnClickListener(r2)
            X.88B r0 = r3.A03
            if (r0 == 0) goto L_0x017b
            X.7MW r0 = r3.A05
            r4.A04 = r0
        L_0x017b:
            boolean r0 = r1.A06()
            if (r0 == 0) goto L_0x018a
            X.1Uk r0 = r1.A0D
            boolean r2 = r0.A01()
            r0 = 0
            if (r2 != 0) goto L_0x018c
        L_0x018a:
            r0 = 8
        L_0x018c:
            r3.A01(r0)
        L_0x018f:
            X.6q9 r3 = r1.A0A
            if (r3 == 0) goto L_0x026a
            android.view.ViewGroup r0 = r1.A04
            X.C18070vi.A0W(r0)
            android.app.Activity r4 = r1.A03
            X.C18070vi.A0W(r4)
            X.6i6 r2 = new X.6i6
            r2.<init>(r4, r0)
            X.6ka r6 = r3.A06
            X.C18070vi.A0X(r6)
            X.0ve r0 = r6.A06
            r35 = r0
            X.190 r0 = r6.A00
            r34 = r0
            X.11S r0 = r6.A02
            r33 = r0
            X.10I r0 = r6.A0A
            r28 = r0
            X.18K r0 = r6.A07
            r17 = r0
            X.00H r0 = r3.A0J
            r29 = r0
            X.0vb r0 = r6.A05
            r32 = r0
            X.2LK r0 = r3.A0B
            r22 = r0
            X.1SB r5 = r3.A0C
            X.0z4 r0 = r6.A04
            r31 = r0
            X.00H r0 = r6.A0H
            java.lang.Object r13 = r0.get()
            com.whatsapp.stickers.stickerpack.StickerPackDownloader r13 = (com.whatsapp.stickers.stickerpack.StickerPackDownloader) r13
            X.1No r0 = r3.A09
            r20 = r0
            android.view.ViewGroup r0 = r2.A00
            r16 = r0
            X.7MX r15 = r1.A02
            X.1Sw r14 = r3.A0A
            X.1tW r12 = r1.A05
            X.722 r11 = r3.A0H
            X.5ii r10 = r3.A0F
            X.6pA r9 = r3.A0E
            boolean r7 = r1.A0H
            r6 = 0
            X.1BI r0 = r1.A0C
            X.6CF r8 = new X.6CF
            r18 = r0
            r19 = r15
            r21 = r14
            r23 = r5
            r24 = r9
            r25 = r10
            r26 = r11
            r27 = r13
            r30 = r7
            r9 = r4
            r10 = r16
            r11 = r12
            r12 = r34
            r13 = r33
            r14 = r31
            r15 = r32
            r16 = r35
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30)
            X.7MX r7 = r1.A02
            X.4MZ r0 = r1.A08
            boolean r4 = r0.A00
            r3.A03 = r7
            r3.A02 = r2
            r3.A05 = r8
            X.1rL r7 = r3.A0I
            X.C18070vi.A0d(r7, r6)
            X.0vl r0 = r2.A03
            android.view.View r0 = X.AnonymousClass3MW.A0A(r0)
            r0.setOnClickListener(r7)
            X.88B r0 = r3.A04
            if (r0 == 0) goto L_0x025c
            X.88B r0 = r3.A0D
            r8.A08 = r0
            android.content.SharedPreferences r2 = X.C17890vO.A0B(r31)
            java.lang.String r0 = "sticker_picker_initial_download"
            boolean r0 = r2.getBoolean(r0, r6)
            if (r0 != 0) goto L_0x028d
            X.0ve r2 = r3.A07
            r0 = 9754(0x261a, float:1.3668E-41)
            boolean r0 = X.C25291Nq.A04(r2, r0)
            if (r0 != 0) goto L_0x028d
            X.6HA r0 = new X.6HA
            r0.<init>(r3, r4)
            X.6LX r4 = new X.6LX
            r4.<init>(r0, r5)
            java.lang.Object[] r2 = new java.lang.Object[r6]
            X.10I r0 = r5.A0C
            r0.CGD(r4, r2)
        L_0x025c:
            boolean r0 = r3.A01()
            if (r0 == 0) goto L_0x026a
            X.870 r2 = r3.A01
            r0 = 2
            X.5z4 r2 = (X.C117015z4) r2
            A03(r2, r0)
        L_0x026a:
            X.0z4 r0 = r1.A06
            android.content.SharedPreferences r2 = X.C17890vO.A0B(r0)
            java.lang.String r0 = "emoji_popup_window_tab_state"
            int r0 = X.C17890vO.A00(r2, r0)
            A03(r1, r0)
            boolean r0 = r1.A06()
            if (r0 == 0) goto L_0x028c
            X.2L4 r2 = r1.A0E
            X.8B1 r0 = r1.A0F
            r2.registerObserver(r0)
            X.6ue r1 = r1.A0G
            r0 = 2
            r1.A01(r0)
        L_0x028c:
            return
        L_0x028d:
            r3.A00(r4)
            goto L_0x025c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C117015z4.A0E():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0062, code lost:
        if (r3.A0D.A01() == false) goto L_0x0064;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000a, code lost:
        if (r3.A00 != 0) goto L_0x000c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0G() {
        /*
            r3 = this;
            X.4MZ r0 = r3.A08
            boolean r0 = r0.A01
            r2 = 0
            if (r0 == 0) goto L_0x000c
            int r1 = r3.A00
            r0 = 1
            if (r1 == 0) goto L_0x000d
        L_0x000c:
            r0 = 0
        L_0x000d:
            r3.A0L(r0)
            X.4MZ r0 = r3.A08
            boolean r0 = r0.A00
            r1 = 8
            if (r0 != 0) goto L_0x001a
            r2 = 8
        L_0x001a:
            X.6in r0 = r3.A0J
            X.6fw r0 = r0.A01
            if (r0 != 0) goto L_0x0027
            java.lang.String r0 = "emojiKeyboardViewController"
        L_0x0022:
            X.C18070vi.A11(r0)
            r0 = 0
            throw r0
        L_0x0027:
            X.0vl r0 = r0.A02
            X.C72453Mb.A1U(r0, r2)
            X.7Hs r0 = r3.A09
            if (r0 == 0) goto L_0x003c
            X.6oG r0 = r0.A01
            if (r0 != 0) goto L_0x0037
            java.lang.String r0 = "gifKeyboardView"
            goto L_0x0022
        L_0x0037:
            X.0vl r0 = r0.A04
            X.C72453Mb.A1U(r0, r2)
        L_0x003c:
            X.6q9 r0 = r3.A0A
            if (r0 == 0) goto L_0x0047
            X.6i6 r0 = r0.A02
            X.0vl r0 = r0.A02
            X.C72453Mb.A1U(r0, r2)
        L_0x0047:
            X.6q3 r2 = r3.A08
            if (r2 == 0) goto L_0x0054
            X.4MZ r0 = r3.A08
            boolean r0 = r0.A00
            if (r0 != 0) goto L_0x0055
            r2.A01(r1)
        L_0x0054:
            return
        L_0x0055:
            boolean r0 = r3.A06()
            if (r0 == 0) goto L_0x0064
            X.1Uk r0 = r3.A0D
            boolean r1 = r0.A01()
            r0 = 0
            if (r1 != 0) goto L_0x0066
        L_0x0064:
            r0 = 8
        L_0x0066:
            r2.A01(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C117015z4.A0G():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0015, code lost:
        if (X.C18020vd.A05(X.C18040vf.A02, r3.A0B, 3403) != false) goto L_0x0017;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0H() {
        /*
            r3 = this;
            X.6q9 r0 = r3.A0A
            if (r0 == 0) goto L_0x0017
            boolean r0 = r0.A01()
            if (r0 == 0) goto L_0x0017
            X.0ve r2 = r3.A0B
            r1 = 3403(0xd4b, float:4.769E-42)
            X.0vf r0 = X.C18040vf.A02
            boolean r1 = X.C18020vd.A05(r0, r2, r1)
            r0 = 2
            if (r1 == 0) goto L_0x0018
        L_0x0017:
            r0 = 0
        L_0x0018:
            A04(r3, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C117015z4.A0H():void");
    }

    public final void A0N(AnonymousClass88B r2) {
        C134166q9 r0 = this.A0A;
        if (r0 != null) {
            r0.A04 = r2;
        }
        C134106q3 r02 = this.A08;
        if (r02 != null) {
            r02.A03 = r2;
        }
    }

    public final void A0O(String str) {
        C134166q9 r3 = this.A0A;
        if (r3 != null) {
            if (r3.A05 == null || !isShowing()) {
                A0K(10, this.A0O, this.A0D);
                A0D();
            }
            A03(this, 2);
            AnonymousClass6CF r2 = r3.A05;
            if (r2 != null) {
                r2.A0D = str;
                C145227Kl A002 = AnonymousClass6CF.A00(str, r2.A0E);
                if (A002 != null) {
                    r2.A05(r2.A0E.indexOf(A002), true);
                    r2.A0D = null;
                }
            }
        }
    }

    public void dismiss() {
        AnonymousClass6CF r2;
        C134166q9 r0 = this.A0A;
        if (!(r0 == null || (r2 = r0.A05) == null)) {
            r2.A07.getViewTreeObserver().removeOnGlobalLayoutListener(r2.A0Q);
            r2.A0F = false;
        }
        C144547Hs r3 = this.A09;
        if (r3 != null) {
            r3.A05.A0A.CGF(new C70573Bq(r3, 27));
        }
        C19830z4 r02 = this.A06;
        C17880vN.A1C(C19830z4.A00(r02), "emoji_popup_window_tab_state", this.A00);
        super.dismiss();
    }

    public static void A05(C18100vl r2, int i) {
        C28081Yu.A00(C19740yt.A03(((View) r2.getValue()).getContext(), i), (ImageView) r2.getValue());
    }

    public final void A0M() {
        if (isShowing()) {
            dismiss();
        }
        C134166q9 r3 = this.A0A;
        if (r3 != null) {
            AnonymousClass6CF r1 = r3.A05;
            if (r1 != null) {
                AnonymousClass722 r2 = r1.A0c;
                r2.A03 = null;
                r2.A01 = null;
                r2.A00 = null;
                r1.A07 = null;
                r2.A0B.unregisterObserver(r2.A0A);
            }
            ObjectAnimator objectAnimator = r3.A00;
            if (objectAnimator != null) {
                objectAnimator.cancel();
                r3.A00 = null;
            }
            r3.A04 = null;
            r3.A01 = null;
        }
        C134106q3 r32 = this.A08;
        if (r32 != null) {
            AnonymousClass6CG r0 = r32.A04;
            if (r0 != null) {
                AnonymousClass722 r22 = r0.A0J;
                r22.A03 = null;
                r22.A01 = null;
                r22.A00 = null;
                r22.A0B.unregisterObserver(r22.A09);
                r22.A0B.unregisterObserver(r22.A08);
            }
            ObjectAnimator objectAnimator2 = r32.A00;
            if (objectAnimator2 != null) {
                objectAnimator2.cancel();
                r32.A00 = null;
            }
            r32.A03 = null;
            r32.A02 = null;
        }
        C144547Hs r12 = this.A09;
        if (r12 != null) {
            r12.A02 = null;
            r12.A00 = null;
        }
        if (A06()) {
            this.A0E.unregisterObserver(this.A0F);
            C136936ue r13 = this.A0G;
            r13.A02 = null;
            r13.A00 = null;
        }
    }
}
