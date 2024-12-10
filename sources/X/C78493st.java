package X;

import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.TextEmojiLabel;

/* renamed from: X.3st  reason: invalid class name and case insensitive filesystem */
public final class C78493st extends C78883tq {
    public RecyclerView A00;
    public AnonymousClass3XU A01;
    public AnonymousClass4FA A02;
    public boolean A03;

    public C95874mw A1m(AnonymousClass206 r4) {
        C18070vi.A0d(r4, 0);
        if (this.A09 || !A02(this)) {
            return super.A1m(r4);
        }
        return new C95874mw(0, 768);
    }

    public void A2F(TextEmojiLabel textEmojiLabel, C82924Cr r12, AnonymousClass206 r13, String str, int i, boolean z, boolean z2, boolean z3) {
        String str2 = str;
        C18070vi.A0d(str, 0);
        TextEmojiLabel textEmojiLabel2 = textEmojiLabel;
        AnonymousClass206 r4 = r13;
        C18070vi.A0j(textEmojiLabel, r13);
        C82924Cr r3 = r12;
        boolean z4 = z;
        boolean z5 = z2;
        if (this.A09 || !A02(this)) {
            super.A2F(textEmojiLabel, r12, r13, str, i, z4, z5, z3);
            return;
        }
        super.A2F(textEmojiLabel2, r3, r4, str2, 0, z4, z5, false);
    }

    public void A2m(C108645c3 r4) {
        if (A02(this)) {
            C39441t5 r1 = new C39441t5(this.A0F);
            this.A02 = AnonymousClass3MW.A0C(this, 2131432248);
            RecyclerView recyclerView = (RecyclerView) AnonymousClass3MX.A0C(this, 2131434708);
            this.A00 = recyclerView;
            if (recyclerView == null) {
                C18070vi.A11("richResponseContainer");
                throw null;
            }
            recyclerView.setNestedScrollingEnabled(false);
            this.A0I = r4;
            A2i();
            r1.A00 = new C98784ri((Object) this, 0);
            if (A2Z()) {
                setLongClickable(true);
                setOnLongClickListener(this.A2t);
                return;
            }
            return;
        }
        super.A2m(r4);
    }

    public void A1M() {
        if (!this.A03) {
            this.A03 = true;
            C27691Xc A0O = AnonymousClass3MY.A0O(this);
            AnonymousClass10E r4 = A0O.A10;
            AnonymousClass1K1 A0n = AnonymousClass3uQ.A0n(r4, A0O, this);
            AnonymousClass10G r2 = r4.A00;
            AnonymousClass3uQ.A16(r2, this);
            AnonymousClass3uQ.A0w(A0n, r4, r2, this);
            AnonymousClass3uQ.A12(r4, r2, this);
            AnonymousClass3uQ.A0y(A0n, r4, this, BE8.A0d(r4));
            AnonymousClass3uQ.A13(r4, r2, this, r4.ABq);
            AnonymousClass3uQ.A0x(A0n, r4, r2, this, r4.AIy);
            C19890zB r1 = C19890zB.A00;
            AnonymousClass3uQ.A0v(r1, r4, r2, A0O, this);
            AnonymousClass3uQ.A11(r4, r2, this);
            AnonymousClass3uQ.A15(r4, this);
            AnonymousClass3uQ.A0s(r1, A0n, r4, r2, this);
            AnonymousClass3uQ.A0u(r1, r4, r2, A0O, this);
            AnonymousClass3uQ.A0t(r1, A0n, r4, A0O, this);
            AnonymousClass3uQ.A10(r4, r2, this);
            AnonymousClass3uQ.A0z(r4, r2, A0O, this, AnonymousClass3uQ.A0o(r4));
            C78313sa.A00(r1, r4, r2, A0O, this);
            C78313sa.A01(A0n, r4, this);
            C78783td.A03(r4, A0O, this);
        }
    }

    public static boolean A02(C78883tq r0) {
        return ((AnonymousClass1UD) r0.getBonsaiGating().get()).A04();
    }

    /* JADX WARNING: type inference failed for: r7v0, types: [X.4FA, java.lang.Object] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0127  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A2i() {
        /*
            r13 = this;
            boolean r0 = A02(r13)
            if (r0 == 0) goto L_0x019b
            X.206 r4 = r13.A0I
            X.210 r4 = (X.AnonymousClass210) r4
            X.C18070vi.A0X(r4)
            java.lang.String r8 = r13.getMessageText()
            X.C18070vi.A0X(r8)
            r0 = 0
            r13.A00 = r0
            r13.A2P(r4)
            r13.A2N(r4)
            X.AnonymousClass3uO.A07(r13, r4)
            X.4FA r7 = new X.4FA
            r7.<init>()
            java.lang.String r2 = "```(.*?)```"
            X.4De r0 = X.C83054De.A03
            int r1 = r0.value
            r0 = r1 & 2
            if (r0 == 0) goto L_0x0031
            r1 = r1 | 64
        L_0x0031:
            java.util.regex.Pattern r1 = java.util.regex.Pattern.compile(r2, r1)
            X.C18070vi.A0X(r1)
            X.1wr r0 = new X.1wr
            r0.<init>((java.util.regex.Pattern) r1)
            java.util.ArrayList r6 = X.AnonymousClass000.A13()
            int r5 = r8.length()
            if (r5 == 0) goto L_0x00ca
            r3 = 0
            if (r3 > r5) goto L_0x00a9
            X.7wH r2 = new X.7wH
            r2.<init>(r8, r0)
            X.7gl r1 = X.C148017gl.A00
            r0 = 1
            X.C18070vi.A0d(r1, r0)
            X.1JR r0 = new X.1JR
            r0.<init>(r2, r1)
            X.1JT r9 = new X.1JT
            r9.<init>(r0)
            r1 = 0
        L_0x0060:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x00c0
            java.lang.Object r12 = r9.next()
            X.6pE r12 = (X.C133636pE) r12
            X.1Oc r0 = r12.A00()
            int r10 = r0.A00
            X.1Oc r0 = r12.A00()
            int r0 = r0.A01
            r2 = 1
            int r11 = r0 + 1
            if (r1 >= r10) goto L_0x0085
            X.CRj r0 = new X.CRj
            r0.<init>(r1, r10, r8, r3)
            r6.add(r0)
        L_0x0085:
            X.7TC r1 = r12.A01
            X.6rh r0 = r1.A0C(r2)
            if (r0 == 0) goto L_0x0091
            X.1Oc r0 = r0.A01
            int r10 = r0.A00
        L_0x0091:
            X.6rh r0 = r1.A0C(r2)
            if (r0 == 0) goto L_0x00a7
            X.1Oc r0 = r0.A01
            int r0 = r0.A01
            int r1 = r0 + 1
        L_0x009d:
            X.CRj r0 = new X.CRj
            r0.<init>(r10, r1, r8, r2)
            r6.add(r0)
            r1 = r11
            goto L_0x0060
        L_0x00a7:
            r1 = r11
            goto L_0x009d
        L_0x00a9:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "Start index out of bounds: "
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = ", input length: "
            java.lang.String r0 = X.AnonymousClass001.A1I(r0, r1, r5)
            java.lang.IndexOutOfBoundsException r0 = X.BE6.A0l(r0)
            throw r0
        L_0x00c0:
            if (r1 >= r5) goto L_0x00ca
            X.CRj r0 = new X.CRj
            r0.<init>(r1, r5, r8, r3)
            r6.add(r0)
        L_0x00ca:
            r7.A00 = r6
            r13.A02 = r7
            int r2 = r6.size()
            r1 = 0
            r0 = 1
            if (r2 != r0) goto L_0x00e1
            java.lang.Object r0 = r6.get(r1)
            X.CRj r0 = (X.C24959CRj) r0
            int r0 = r0.A01
            if (r0 != 0) goto L_0x00e1
            r1 = 1
        L_0x00e1:
            r13.A09 = r1
            r7 = 0
            if (r1 != 0) goto L_0x010d
            X.00H r0 = r13.getBonsaiGating()
            java.lang.Object r1 = r0.get()
            X.1UD r1 = (X.AnonymousClass1UD) r1
            boolean r0 = r1.A04()
            if (r0 == 0) goto L_0x010d
            X.0ve r2 = r1.A00
            X.0vf r1 = X.C18040vf.A01
            r0 = 12303(0x300f, float:1.724E-41)
            boolean r0 = X.C18020vd.A05(r1, r2, r0)
            if (r0 == 0) goto L_0x010d
            X.4FA r0 = r13.A02
            if (r0 != 0) goto L_0x011f
            java.lang.String r0 = "botTextSegmentContainer"
            X.C18070vi.A11(r0)
        L_0x010b:
            r0 = 0
            throw r0
        L_0x010d:
            X.206 r0 = r13.A0I
            X.210 r0 = (X.AnonymousClass210) r0
            java.lang.String r1 = r0.A17()
            X.CRj r0 = new X.CRj
            r0.<init>(r7, r5, r1, r7)
            java.util.List r6 = X.C18070vi.A0M(r0)
            goto L_0x0121
        L_0x011f:
            java.util.List r6 = r0.A00
        L_0x0121:
            androidx.recyclerview.widget.RecyclerView r5 = r13.A00
            java.lang.String r3 = "richResponseContainer"
            if (r5 == 0) goto L_0x0196
            android.content.Context r2 = r13.getContext()
            r1 = 1
            androidx.recyclerview.widget.LinearLayoutManager r0 = new androidx.recyclerview.widget.LinearLayoutManager
            r0.<init>(r2, r1, r7)
            r5.setLayoutManager(r0)
            android.content.Context r0 = X.AnonymousClass3MY.A04(r13)
            X.BLq r1 = new X.BLq
            r1.<init>(r0, r13, r4, r6)
            androidx.recyclerview.widget.RecyclerView r0 = r13.A00
            if (r0 == 0) goto L_0x0196
            r0.setAdapter(r1)
            X.3XU r0 = r13.A01
            if (r0 != 0) goto L_0x0161
            android.content.res.Resources r1 = r13.getResources()
            r0 = 2131168487(0x7f070ce7, float:1.7951277E38)
            int r0 = r1.getDimensionPixelSize(r0)
            X.3XU r1 = new X.3XU
            r1.<init>(r13, r0)
            r13.A01 = r1
            androidx.recyclerview.widget.RecyclerView r0 = r13.A00
            if (r0 == 0) goto L_0x0196
            r0.A0r(r1)
        L_0x0161:
            X.4X8 r3 = X.C87754Wv.A05
            X.0ve r2 = r13.A0F
            X.C18070vi.A0W(r2)
            X.1gU r1 = r13.A1D
            X.C18070vi.A0W(r1)
            android.content.Context r0 = X.AnonymousClass3MY.A04(r13)
            X.4Wv r0 = r3.A01(r0, r2, r1, r4)
            r13.A2k(r4, r0)
            r13.A2q()
            X.0ve r2 = r13.A0F
            r1 = 7268(0x1c64, float:1.0185E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 != 0) goto L_0x018a
            r13.A2p()
        L_0x018a:
            r13.A2o()
            X.206 r0 = r13.A0I
            X.C18070vi.A0X(r0)
            r13.A2r(r0)
            return
        L_0x0196:
            X.C18070vi.A11(r3)
            goto L_0x010b
        L_0x019b:
            super.A2i()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C78493st.A2i():void");
    }

    public int getIncomingLayoutId() {
        if (A02(this)) {
            return 2131624775;
        }
        return 2131624946;
    }
}
