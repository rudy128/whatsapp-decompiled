package X;

import androidx.appcompat.widget.Toolbar;
import com.whatsapp.WaEditText;
import com.whatsapp.emoji.search.EmojiSearchProvider;

/* renamed from: X.3cR  reason: invalid class name and case insensitive filesystem */
public class C74763cR extends C161028Bb {
    public int A00 = 0;
    public int A01;
    public Toolbar A02;
    public WaEditText A03;
    public boolean A04 = true;
    public boolean A05;
    public boolean A06;
    public C74873d3 A07;
    public final int A08;
    public final int A09;
    public final int A0A;
    public final C107845ai A0B = new C92094gk(this, 4);
    public final AnonymousClass1KB A0C;
    public final C107355Zj A0D;
    public final int A0E;
    public final int A0F;
    public final int A0G;
    public final AnonymousClass190 A0H;
    public final AnonymousClass11C A0I;
    public final C19830z4 A0J;
    public final AnonymousClass1L2 A0K;
    public final A59 A0L;
    public final C1193267r A0M;
    public final AnonymousClass1KW A0N;
    public final EmojiSearchProvider A0O;
    public final C18010vc A0P;
    public final AnonymousClass1L4 A0Q;
    public final String A0R;

    public void A00() {
        AnonymousClass4Yv.A00(this.A00, this.A08);
    }

    public void onBackPressed() {
        if (this.A07.isShowing()) {
            this.A07.dismiss();
        } else {
            super.onBackPressed();
        }
    }

    /* JADX WARNING: type inference failed for: r1v5, types: [android.text.TextWatcher] */
    /* JADX WARNING: type inference failed for: r14v3, types: [X.48A] */
    /* JADX WARNING: type inference failed for: r14v4, types: [X.488] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r33) {
        /*
            r32 = this;
            r9 = r32
            r0 = r33
            super.onCreate(r0)
            r0 = 2131430313(0x7f0b0ba9, float:1.8482323E38)
            android.view.View r1 = X.C123576Uz.A00(r9, r0)
            androidx.appcompat.widget.Toolbar r1 = (androidx.appcompat.widget.Toolbar) r1
            r9.A02 = r1
            int r0 = r9.A0G
            r1.setTitle((int) r0)
            r9.setTitle(r0)
            r0 = 2131433259(0x7f0b172b, float:1.8488299E38)
            android.view.View r3 = r9.findViewById(r0)
            r0 = 11
            X.C89934dG.A00(r3, r9, r0)
            r0 = 2131428814(0x7f0b05ce, float:1.8479283E38)
            android.view.View r1 = r9.findViewById(r0)
            r0 = 12
            X.C89934dG.A00(r1, r9, r0)
            java.util.ArrayList r4 = X.AnonymousClass000.A13()
            r0 = 2131429681(0x7f0b0931, float:1.8481042E38)
            android.view.View r10 = X.C123576Uz.A00(r9, r0)
            android.widget.TextView r10 = (android.widget.TextView) r10
            r0 = 2131430266(0x7f0b0b7a, float:1.8482228E38)
            android.view.View r0 = X.C123576Uz.A00(r9, r0)
            com.whatsapp.WaEditText r0 = (com.whatsapp.WaEditText) r0
            r9.A03 = r0
            X.0vb r8 = r9.A02
            X.C27641Ww.A09(r0, r8)
            int r6 = r9.A0A
            r2 = 0
            if (r6 == 0) goto L_0x0063
            int r0 = r9.A01
            if (r0 != 0) goto L_0x005b
            r10.setVisibility(r2)
        L_0x005b:
            X.77f r0 = new X.77f
            r0.<init>(r6)
            r4.add(r0)
        L_0x0063:
            boolean r0 = r4.isEmpty()
            if (r0 != 0) goto L_0x0076
            com.whatsapp.WaEditText r1 = r9.A03
            android.text.InputFilter[] r0 = new android.text.InputFilter[r2]
            java.lang.Object[] r0 = r4.toArray(r0)
            android.text.InputFilter[] r0 = (android.text.InputFilter[]) r0
            r1.setFilters(r0)
        L_0x0076:
            boolean r1 = r9.A05
            X.0ve r13 = r9.A03
            X.1KW r7 = r9.A0N
            X.11C r12 = r9.A0I
            X.0vc r11 = r9.A0P
            X.1L2 r5 = r9.A0K
            com.whatsapp.WaEditText r4 = r9.A03
            int r2 = r9.A01
            boolean r0 = r9.A06
            if (r1 == 0) goto L_0x01d4
            X.488 r1 = new X.488
            r14 = r1
            r15 = r4
            r16 = r10
            r17 = r12
            r18 = r8
            r19 = r5
            r20 = r7
            r21 = r13
            r22 = r11
            r23 = r6
            r24 = r2
            r25 = r0
            r14.<init>(r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)
        L_0x00a5:
            com.whatsapp.WaEditText r0 = r9.A03
            r0.addTextChangedListener(r1)
            boolean r0 = r9.A04
            if (r0 != 0) goto L_0x00b9
            com.whatsapp.WaEditText r2 = r9.A03
            r1 = 1
            X.48B r0 = new X.48B
            r0.<init>(r3, r9, r1)
            r2.addTextChangedListener(r0)
        L_0x00b9:
            com.whatsapp.WaEditText r1 = r9.A03
            int r0 = r9.A0F
            r1.setInputType(r0)
            android.view.Window r0 = r9.getWindow()
            android.view.WindowManager$LayoutParams r1 = r0.getAttributes()
            r0 = -1
            r1.width = r0
            r0 = 48
            r1.gravity = r0
            android.view.Window r0 = r9.getWindow()
            r0.setAttributes(r1)
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 23
            if (r1 < r0) goto L_0x010d
            android.view.Window r2 = r9.getWindow()
            if (r2 == 0) goto L_0x010d
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r2.addFlags(r0)
            r0 = 67108864(0x4000000, float:1.5046328E-36)
            r2.clearFlags(r0)
            android.app.Activity r1 = r9.A00
            r0 = 0
            X.C18070vi.A0d(r1, r0)
            int r0 = X.AnonymousClass3MZ.A00(r1)
            r2.setStatusBarColor(r0)
            androidx.appcompat.widget.Toolbar r1 = r9.A02
            boolean r0 = r1 instanceof com.whatsapp.wds.components.topbar.WDSToolbar
            if (r0 == 0) goto L_0x01d1
            com.whatsapp.wds.components.topbar.WDSToolbar r1 = (com.whatsapp.wds.components.topbar.WDSToolbar) r1
            X.1Xw r0 = r1.A08
            X.1Y3 r1 = r0.A00
        L_0x0105:
            X.1YM r0 = X.AnonymousClass1YM.A00
            if (r1 != r0) goto L_0x010d
            r0 = 1
            X.C28281Zt.A0A(r2, r0)
        L_0x010d:
            r0 = 2131430312(0x7f0b0ba8, float:1.8482321E38)
            android.view.View r10 = r9.findViewById(r0)
            com.whatsapp.KeyboardPopupLayout r10 = (com.whatsapp.KeyboardPopupLayout) r10
            r0 = 2131430310(0x7f0b0ba6, float:1.8482317E38)
            android.view.View r16 = r9.findViewById(r0)
            android.app.Activity r15 = r9.A00
            X.1L4 r6 = r9.A0Q
            X.190 r5 = r9.A0H
            X.67r r4 = r9.A0M
            com.whatsapp.emoji.search.EmojiSearchProvider r3 = r9.A0O
            X.0z4 r2 = r9.A0J
            com.whatsapp.WaEditText r1 = r9.A03
            r0 = 28
            java.lang.Integer r30 = java.lang.Integer.valueOf(r0)
            r31 = 0
            X.A59 r0 = r9.A0L
            X.3d3 r14 = new X.3d3
            r26 = r3
            r27 = r13
            r28 = r11
            r29 = r6
            r25 = r7
            r24 = r4
            r23 = r0
            r22 = r8
            r21 = r2
            r20 = r12
            r19 = r1
            r18 = r10
            r17 = r5
            r14.<init>(r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31)
            r9.A07 = r14
            r0 = 2131430335(0x7f0b0bbf, float:1.8482368E38)
            android.view.View r1 = r9.findViewById(r0)
            com.whatsapp.emoji.search.EmojiSearchContainer r1 = (com.whatsapp.emoji.search.EmojiSearchContainer) r1
            X.3d3 r0 = r9.A07
            X.4UI r3 = new X.4UI
            r3.<init>(r15, r0, r1)
            r1 = 3
            X.4n0 r0 = new X.4n0
            r0.<init>(r9, r1)
            r3.A00 = r0
            X.3d3 r2 = r9.A07
            X.5ai r0 = r9.A0B
            r2.A0J(r0)
            r1 = 38
            X.3Ch r0 = new X.3Ch
            r0.<init>(r9, r3, r1)
            r2.A0E = r0
            r1 = 7
            X.4an r0 = new X.4an
            r0.<init>(r9, r1)
            r9.setOnCancelListener(r0)
            r0 = 2131429979(0x7f0b0a5b, float:1.8481646E38)
            android.view.View r1 = r9.findViewById(r0)
            android.widget.TextView r1 = (android.widget.TextView) r1
            int r0 = r9.A00
            if (r0 != 0) goto L_0x01c7
            r0 = 8
            r1.setVisibility(r0)
        L_0x0199:
            int r1 = r9.A0E
            if (r1 == 0) goto L_0x01a2
            com.whatsapp.WaEditText r0 = r9.A03
            r0.setHint(r1)
        L_0x01a2:
            com.whatsapp.WaEditText r2 = r9.A03
            java.lang.String r1 = r9.A0R
            java.lang.CharSequence r0 = X.C43251zV.A05(r15, r7, r1)
            r2.setText(r0)
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x01b8
            com.whatsapp.WaEditText r0 = r9.A03
            r0.selectAll()
        L_0x01b8:
            com.whatsapp.WaEditText r1 = r9.A03
            r0 = 0
            r1.A0I(r0)
            android.view.Window r1 = r9.getWindow()
            r0 = 5
            r1.setSoftInputMode(r0)
            return
        L_0x01c7:
            r0 = 0
            r1.setVisibility(r0)
            int r0 = r9.A00
            r1.setText(r0)
            goto L_0x0199
        L_0x01d1:
            r1 = 0
            goto L_0x0105
        L_0x01d4:
            r26 = 0
            X.48A r1 = new X.48A
            r14 = r1
            r15 = r4
            r16 = r10
            r17 = r12
            r18 = r8
            r19 = r5
            r20 = r7
            r21 = r13
            r22 = r11
            r23 = r6
            r24 = r2
            r25 = r0
            r27 = r26
            r14.<init>(r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            goto L_0x00a5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C74763cR.onCreate(android.os.Bundle):void");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C74763cR(android.app.Activity r10, X.AnonymousClass190 r11, X.AnonymousClass1KB r12, X.AnonymousClass11C r13, X.AnonymousClass11P r14, X.C19830z4 r15, X.C18000vb r16, X.C107355Zj r17, X.AnonymousClass1L2 r18, X.A59 r19, X.C1193267r r20, X.AnonymousClass1KW r21, com.whatsapp.emoji.search.EmojiSearchProvider r22, X.C18030ve r23, X.C18010vc r24, X.AnonymousClass1L4 r25, java.lang.String r26, int r27, int r28, int r29, int r30, int r31, int r32) {
        /*
            r9 = this;
            r8 = 2131625181(0x7f0e04dd, float:1.8877563E38)
            r0 = 1
            r2 = r9
            r6 = r16
            r5 = r14
            r4 = r13
            r3 = r10
            r7 = r23
            r2.<init>(r3, r4, r5, r6, r7, r8)
            r9.A04 = r0
            r0 = 0
            r9.A00 = r0
            r1 = 4
            X.4gk r0 = new X.4gk
            r0.<init>(r9, r1)
            r9.A0B = r0
            r9.A0C = r12
            r0 = r25
            r9.A0Q = r0
            r9.A0H = r11
            r0 = r21
            r9.A0N = r0
            r0 = r20
            r9.A0M = r0
            r9.A0I = r13
            r0 = r22
            r9.A0O = r0
            r9.A0J = r15
            r0 = r24
            r9.A0P = r0
            r0 = r19
            r9.A0L = r0
            r0 = r18
            r9.A0K = r0
            r0 = r27
            r9.A08 = r0
            r0 = r32
            r9.A0F = r0
            r0 = r17
            r9.A0D = r0
            r0 = r28
            r9.A0G = r0
            r0 = r29
            r9.A0A = r0
            r0 = r30
            r9.A0E = r0
            r0 = r31
            r9.A09 = r0
            r0 = r26
            r9.A0R = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C74763cR.<init>(android.app.Activity, X.190, X.1KB, X.11C, X.11P, X.0z4, X.0vb, X.5Zj, X.1L2, X.A59, X.67r, X.1KW, com.whatsapp.emoji.search.EmojiSearchProvider, X.0ve, X.0vc, X.1L4, java.lang.String, int, int, int, int, int, int):void");
    }
}
