package X;

import android.content.Context;
import android.view.View;

/* renamed from: X.ALe  reason: case insensitive filesystem */
public final class C20441ALe implements C28582E8t {
    public static final C198839z0 A0C = new Object();
    public View A00;
    public boolean A01;
    public final int A02;
    public final Context A03;
    public final AnonymousClass1L9 A04;
    public final AnonymousClass1NP A05;
    public final C192369oH A06;
    public final C19830z4 A07;
    public final C18000vb A08;
    public final C18030ve A09;
    public final C22654BId A0A;
    public final AnonymousClass18K A0B;

    public static final void A00(C20441ALe aLe, int i, int i2, int i3) {
        int i4;
        C170888qp r2 = new C170888qp();
        String valueOf = String.valueOf(i2);
        switch (i3) {
            case 1:
                i4 = 53;
                break;
            case 2:
                i4 = 64;
                break;
            case 3:
                i4 = 63;
                break;
            case 4:
                i4 = 65;
                break;
            case 5:
                i4 = 72;
                break;
            case 6:
                i4 = 71;
                break;
            case 7:
                i4 = 70;
                break;
            default:
                return;
        }
        r2.A02 = valueOf;
        r2.A00 = Integer.valueOf(i);
        r2.A01 = Integer.valueOf(i4);
        aLe.A0B.CC7(r2);
    }

    public void Bcv() {
        if (this.A01) {
            C72453Mb.A1D(this.A00);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000e, code lost:
        if (X.C18020vd.A05(X.C18040vf.A02, r6.A09, 7298) == false) goto L_0x0010;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean CLk() {
        /*
            r6 = this;
            int r0 = r6.A02
            if (r0 != 0) goto L_0x0012
            X.0ve r2 = r6.A09
            r1 = 7298(0x1c82, float:1.0227E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 != 0) goto L_0x0012
        L_0x0010:
            r1 = 0
        L_0x0011:
            return r1
        L_0x0012:
            X.9oH r5 = r6.A06
            X.00H r0 = r5.A02
            int r1 = X.AnonymousClass8BV.A02(r0)
            if (r1 == 0) goto L_0x0010
            r0 = 4
            if (r1 == r0) goto L_0x0010
            X.0z4 r1 = r5.A00
            java.lang.String r0 = r1.A0f()
            long r3 = r1.A0U(r0)
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0010
            int r0 = r5.A00()
            r1 = 1
            if (r0 != 0) goto L_0x0011
            goto L_0x0010
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20441ALe.CLk():boolean");
    }

    public C20441ALe(Context context, View view, AnonymousClass1L9 r3, C22654BId bId, AnonymousClass1NP r5, C192369oH r6, C19830z4 r7, C18000vb r8, C18030ve r9, AnonymousClass18K r10, int i) {
        C18070vi.A0w(context, r9, r10, r3, r8);
        C18070vi.A0q(r7, r5, r6);
        this.A03 = context;
        this.A09 = r9;
        this.A0B = r10;
        this.A04 = r3;
        this.A08 = r8;
        this.A07 = r7;
        this.A05 = r5;
        this.A06 = r6;
        this.A0A = bId;
        this.A00 = view;
        this.A02 = i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0074, code lost:
        r4 = X.AnonymousClass8BS.A0A(r11);
        r3 = r0.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0080, code lost:
        if (r3.hasNext() == false) goto L_0x00ea;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0082, code lost:
        r4.A0M(X.AnonymousClass001.A1I("backup_storage_banner_shown_timestamp:", X.AnonymousClass000.A10(), X.C72453Mb.A0H(r3)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00d4, code lost:
        r0 = java.util.Arrays.asList(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00dd, code lost:
        X.C18070vi.A0X(r0);
     */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x02b8  */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x02d4  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0151  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x017e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A01() {
        /*
            r14 = this;
            boolean r0 = r14.CLk()
            if (r0 == 0) goto L_0x017a
            boolean r0 = r14.A01
            if (r0 != 0) goto L_0x017a
            X.BId r3 = r14.A0A
            android.view.View r0 = r14.A00
            if (r0 != 0) goto L_0x0034
            if (r3 == 0) goto L_0x0034
            X.0ve r2 = r14.A09
            X.0vf r1 = X.C18040vf.A01
            r0 = 5332(0x14d4, float:7.472E-42)
            boolean r0 = X.C18020vd.A05(r1, r2, r0)
            r2 = 0
            android.view.LayoutInflater r1 = X.AnonymousClass3MZ.A0D(r3)
            if (r0 == 0) goto L_0x00e1
            r0 = 2131625590(0x7f0e0676, float:1.8878392E38)
            android.view.View r1 = r1.inflate(r0, r3, r2)
            java.lang.String r0 = "null cannot be cast to non-null type com.whatsapp.wds.components.banners.WDSBanner"
            X.C18070vi.A0z(r1, r0)
        L_0x002f:
            r14.A00 = r1
            r3.addView(r1)
        L_0x0034:
            X.9oH r0 = r14.A06
            int r5 = r0.A00()
            X.00H r11 = r0.A02
            X.1NP r3 = X.AnonymousClass8BS.A0A(r11)
            android.content.SharedPreferences r0 = r3.A07()
            java.lang.String r2 = "backup_current_banner_shown"
            boolean r0 = X.C17880vN.A1W(r0, r2)
            if (r0 != 0) goto L_0x00ea
            r1 = 1
            android.content.SharedPreferences$Editor r0 = X.AnonymousClass8BT.A04(r3)
            X.C17880vN.A1F(r0, r2, r1)
            r13 = 4
            r12 = 0
            java.lang.Integer r10 = X.C108955ca.A0e()
            r9 = 5
            java.lang.Integer r8 = java.lang.Integer.valueOf(r9)
            r7 = 1
            r0 = 6
            java.lang.Integer r6 = java.lang.Integer.valueOf(r0)
            r4 = 3
            java.lang.Integer r3 = java.lang.Integer.valueOf(r4)
            r2 = 2
            java.lang.Integer r1 = java.lang.Integer.valueOf(r2)
            switch(r5) {
                case 1: goto L_0x00c5;
                case 2: goto L_0x00b8;
                case 3: goto L_0x00ad;
                case 4: goto L_0x00a4;
                case 5: goto L_0x009b;
                case 6: goto L_0x0094;
                case 7: goto L_0x00d9;
                default: goto L_0x0072;
            }
        L_0x0072:
            X.0wS r0 = X.C18460wS.A00
        L_0x0074:
            X.1NP r4 = X.AnonymousClass8BS.A0A(r11)
            java.util.Iterator r3 = r0.iterator()
        L_0x007c:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x00ea
            int r2 = X.C72453Mb.A0H(r3)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "backup_storage_banner_shown_timestamp:"
            java.lang.String r0 = X.AnonymousClass001.A1I(r0, r1, r2)
            r4.A0M(r0)
            goto L_0x007c
        L_0x0094:
            java.lang.Integer[] r0 = new java.lang.Integer[r2]
            r0[r12] = r6
            r0[r7] = r10
            goto L_0x00d4
        L_0x009b:
            java.lang.Integer[] r0 = new java.lang.Integer[r4]
            r0[r12] = r8
            r0[r7] = r6
            r0[r2] = r10
            goto L_0x00d4
        L_0x00a4:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r13)
            java.util.List r0 = java.util.Collections.singletonList(r0)
            goto L_0x00dd
        L_0x00ad:
            java.lang.Integer[] r0 = new java.lang.Integer[r13]
            r0[r12] = r3
            r0[r7] = r8
            r0[r2] = r6
            r0[r4] = r10
            goto L_0x00d4
        L_0x00b8:
            java.lang.Integer[] r0 = new java.lang.Integer[r9]
            r0[r12] = r1
            r0[r7] = r3
            r0[r2] = r8
            r0[r4] = r6
            r0[r13] = r10
            goto L_0x00d4
        L_0x00c5:
            java.lang.Integer[] r0 = new java.lang.Integer[r0]
            X.C17880vN.A1T(r0, r7, r12)
            r0[r7] = r1
            r0[r2] = r3
            r0[r4] = r8
            r0[r13] = r6
            r0[r9] = r10
        L_0x00d4:
            java.util.List r0 = java.util.Arrays.asList(r0)
            goto L_0x00dd
        L_0x00d9:
            java.util.List r0 = java.util.Collections.singletonList(r10)
        L_0x00dd:
            X.C18070vi.A0X(r0)
            goto L_0x0074
        L_0x00e1:
            r0 = 2131624255(0x7f0e013f, float:1.8875685E38)
            android.view.View r1 = r1.inflate(r0, r3, r2)
            goto L_0x002f
        L_0x00ea:
            android.view.View r3 = r14.A00
            if (r3 == 0) goto L_0x0172
            boolean r0 = r3 instanceof com.whatsapp.wds.components.banners.WDSBanner
            r4 = 0
            r2 = 1
            if (r0 == 0) goto L_0x025f
            X.4XT r8 = new X.4XT
            r8.<init>()
            if (r5 != r2) goto L_0x0100
            r0 = 2131886914(0x7f120342, float:1.940842E38)
            r8.A01 = r0
        L_0x0100:
            android.content.Context r7 = r14.A03
            r0 = 2131102982(0x7f060d06, float:1.7818417E38)
            java.lang.String r6 = X.AnonymousClass1EG.A03(r7, r0)
            X.C18070vi.A0X(r6)
            r0 = 4
            r10 = 2
            if (r5 != r0) goto L_0x0198
            X.0z4 r1 = r14.A07
            java.lang.String r0 = r1.A0f()
            r11 = -1
            if (r0 == 0) goto L_0x0190
            long r0 = r1.A0V(r0)
            int r9 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r9 == 0) goto L_0x0190
            r11 = 2131886915(0x7f120343, float:1.9408422E38)
            java.lang.Object[] r10 = new java.lang.Object[r10]
            X.0vb r9 = r14.A08
            java.lang.String r0 = X.C88584aA.A03(r9, r0)
        L_0x012d:
            r10[r4] = r0
            r10[r2] = r6
        L_0x0131:
            java.lang.String r0 = r7.getString(r11, r10)
        L_0x0135:
            X.C18070vi.A0b(r0)
        L_0x0138:
            android.text.Spanned r0 = android.text.Html.fromHtml(r0)
            X.C18070vi.A0X(r0)
            r8.A03 = r0
            r6 = r3
            com.whatsapp.wds.components.banners.WDSBanner r6 = (com.whatsapp.wds.components.banners.WDSBanner) r6
            r6.setVisibility(r4)
            X.78T r0 = new X.78T
            r0.<init>(r14, r5, r4, r3)
            r3.setOnClickListener(r0)
            if (r5 == r2) goto L_0x017e
            r0 = 2
            if (r5 == r0) goto L_0x017b
            r0 = 2131231717(0x7f0803e5, float:1.8079523E38)
            X.4AG r1 = new X.4AG
            r1.<init>(r0)
            X.4AC r0 = new X.4AC
            r0.<init>(r1)
        L_0x0161:
            r8.A02 = r0
        L_0x0163:
            X.4Os r0 = r8.A01()
            r6.setState(r0)
            X.AwQ r0 = new X.AwQ
            r0.<init>(r3, r14, r5)
            r6.setOnDismissListener((X.C18090vk) r0)
        L_0x0172:
            r1 = 1
            r14.A01 = r1
            int r0 = r14.A02
            A00(r14, r1, r0, r5)
        L_0x017a:
            return
        L_0x017b:
            X.4A9 r0 = X.AnonymousClass4A9.A00
            goto L_0x0161
        L_0x017e:
            X.4A9 r0 = X.AnonymousClass4A9.A00
            r8.A02 = r0
            int r0 = r14.A02
            if (r0 != r2) goto L_0x0163
            r8.A05 = r4
            X.4Os r0 = r8.A01()
            r6.setState(r0)
            goto L_0x0172
        L_0x0190:
            r11 = 2131886916(0x7f120344, float:1.9408424E38)
            java.lang.Object[] r10 = new java.lang.Object[r2]
            r10[r4] = r6
            goto L_0x0131
        L_0x0198:
            if (r5 == r2) goto L_0x023b
            if (r5 == r10) goto L_0x01e0
            r0 = 3
            if (r5 == r0) goto L_0x01cf
            r0 = 5
            if (r5 == r0) goto L_0x01bd
            r0 = 6
            if (r5 == r0) goto L_0x01ab
            r0 = 7
            if (r5 == r0) goto L_0x0243
            java.lang.String r0 = ""
            goto L_0x0138
        L_0x01ab:
            r9 = 2131886913(0x7f120341, float:1.9408418E38)
            java.lang.Object[] r10 = new java.lang.Object[r10]
            X.0vb r0 = r14.A08
            java.text.NumberFormat r11 = r0.A0M()
            r0 = 4603579539098121011(0x3fe3333333333333, double:0.6)
            goto L_0x0250
        L_0x01bd:
            r9 = 2131886913(0x7f120341, float:1.9408418E38)
            java.lang.Object[] r10 = new java.lang.Object[r10]
            X.0vb r0 = r14.A08
            java.text.NumberFormat r11 = r0.A0M()
            r0 = 4604480259023595110(0x3fe6666666666666, double:0.7)
            goto L_0x0250
        L_0x01cf:
            r9 = 2131886913(0x7f120341, float:1.9408418E38)
            java.lang.Object[] r10 = new java.lang.Object[r10]
            X.0vb r0 = r14.A08
            java.text.NumberFormat r11 = r0.A0M()
            r0 = 4605380978949069210(0x3fe999999999999a, double:0.8)
            goto L_0x0250
        L_0x01e0:
            X.1NP r1 = r14.A05
            X.0z4 r0 = r14.A07
            java.lang.String r11 = r0.A0f()
            if (r11 == 0) goto L_0x0223
            int r0 = r11.length()
            if (r0 == 0) goto L_0x0223
            android.content.SharedPreferences r9 = r1.A07()
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "backup_account_storage_percent:"
            java.lang.String r0 = X.AnonymousClass001.A1H(r0, r11, r1)
            int r11 = r9.getInt(r0, r4)
        L_0x0202:
            X.0ve r9 = r14.A09
            r1 = 9539(0x2543, float:1.3367E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r9, r1)
            if (r0 == 0) goto L_0x0225
            if (r11 == 0) goto L_0x0225
            r9 = 2131886917(0x7f120345, float:1.9408426E38)
            java.lang.Object[] r1 = new java.lang.Object[r10]
            X.0vb r0 = r14.A08
            java.lang.String r0 = X.AnonymousClass8BX.A0Z(r0, r11)
            r1[r4] = r0
            java.lang.String r0 = X.C17880vN.A0q(r7, r6, r1, r2, r9)
            goto L_0x0135
        L_0x0223:
            r11 = 0
            goto L_0x0202
        L_0x0225:
            r11 = 2131886913(0x7f120341, float:1.9408418E38)
            java.lang.Object[] r10 = new java.lang.Object[r10]
            X.0vb r0 = r14.A08
            java.text.NumberFormat r9 = r0.A0M()
            r0 = 4606281698874543309(0x3feccccccccccccd, double:0.9)
            java.lang.String r0 = r9.format(r0)
            goto L_0x012d
        L_0x023b:
            r0 = 2131886955(0x7f12036b, float:1.9408503E38)
            java.lang.String r0 = X.C17890vO.A0R(r7, r6, r2, r4, r0)
            goto L_0x025a
        L_0x0243:
            r9 = 2131886913(0x7f120341, float:1.9408418E38)
            java.lang.Object[] r10 = new java.lang.Object[r10]
            X.0vb r0 = r14.A08
            java.text.NumberFormat r11 = r0.A0M()
            r0 = 4602678819172646912(0x3fe0000000000000, double:0.5)
        L_0x0250:
            java.lang.String r0 = r11.format(r0)
            r10[r4] = r0
            java.lang.String r0 = X.C17880vN.A0q(r7, r6, r10, r2, r9)
        L_0x025a:
            X.C18070vi.A0X(r0)
            goto L_0x0138
        L_0x025f:
            r0 = 2131428078(0x7f0b02ee, float:1.847779E38)
            android.widget.TextView r1 = X.AnonymousClass3Ma.A0E(r3, r0)
            r0 = 8
            if (r5 != r2) goto L_0x0271
            r0 = 2131886914(0x7f120342, float:1.940842E38)
            r1.setText(r0)
            r0 = 0
        L_0x0271:
            r1.setVisibility(r0)
            android.content.Context r11 = r3.getContext()
            r0 = 2131428063(0x7f0b02df, float:1.847776E38)
            com.whatsapp.TextEmojiLabel r10 = X.C72453Mb.A0c(r3, r0)
            X.C18070vi.A0b(r11)
            int r0 = X.C72463Mc.A02(r11)
            java.lang.String r12 = X.AnonymousClass1EG.A03(r11, r0)
            X.C18070vi.A0X(r12)
            r0 = 4
            r9 = 2
            if (r5 != r0) goto L_0x0318
            X.0z4 r1 = r14.A07
            java.lang.String r0 = r1.A0f()
            r7 = -1
            if (r0 == 0) goto L_0x034a
            long r0 = r1.A0V(r0)
            int r6 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r6 == 0) goto L_0x034a
            r8 = 2131886915(0x7f120343, float:1.9408422E38)
            java.lang.Object[] r7 = new java.lang.Object[r9]
            X.0vb r6 = r14.A08
            java.lang.String r0 = X.C88584aA.A03(r6, r0)
        L_0x02ae:
            r7[r4] = r0
            r7[r2] = r12
        L_0x02b2:
            java.lang.String r0 = r11.getString(r8, r7)
            if (r0 == 0) goto L_0x02c0
            android.text.Spanned r1 = android.text.Html.fromHtml(r0)
            r0 = 0
            r10.A0S(r1, r0, r4, r4)
        L_0x02c0:
            X.78T r0 = new X.78T
            r0.<init>(r14, r5, r2, r3)
            r3.setOnClickListener(r0)
            r3.setVisibility(r4)
            r0 = 2131429132(0x7f0b070c, float:1.8479928E38)
            android.view.View r4 = X.C18070vi.A05(r3, r0)
            if (r5 != r2) goto L_0x0353
            android.content.Context r6 = r3.getContext()
            X.C18070vi.A0b(r6)
            r7 = 2130968762(0x7f0400ba, float:1.7546187E38)
            r1 = 2131099828(0x7f0600b4, float:1.781202E38)
            r0 = 0
            X.C18070vi.A0d(r6, r0)
            int r0 = X.AnonymousClass3Ma.A00(r6, r7, r1)
            r3.setBackgroundColor(r0)
            r0 = 2131428066(0x7f0b02e2, float:1.8477766E38)
            android.widget.ImageView r1 = X.AnonymousClass3Ma.A0C(r3, r0)
            r0 = 2131099829(0x7f0600b5, float:1.7812022E38)
            android.content.res.ColorStateList r0 = X.C19740yt.A03(r6, r0)
            X.AnonymousClass1HF.A0L(r0, r1)
            r0 = 2131232439(0x7f0806b7, float:1.8080987E38)
            android.graphics.drawable.Drawable r0 = X.AnonymousClass3MX.A06(r6, r0)
            r1.setImageDrawable(r0)
            r0 = 2131099830(0x7f0600b6, float:1.7812024E38)
            X.AnonymousClass8BS.A10(r6, r1, r0)
            int r0 = r14.A02
            if (r0 != r2) goto L_0x0353
            r0 = 8
            r4.setVisibility(r0)
            goto L_0x0172
        L_0x0318:
            if (r5 == r2) goto L_0x0346
            if (r5 == r9) goto L_0x0335
            r0 = 3
            if (r5 != r0) goto L_0x02c0
            r8 = 2131886913(0x7f120341, float:1.9408418E38)
            java.lang.Object[] r7 = new java.lang.Object[r9]
            X.0vb r0 = r14.A08
            java.text.NumberFormat r6 = r0.A0M()
            r0 = 4605380978949069210(0x3fe999999999999a, double:0.8)
        L_0x032f:
            java.lang.String r0 = r6.format(r0)
            goto L_0x02ae
        L_0x0335:
            r8 = 2131886913(0x7f120341, float:1.9408418E38)
            java.lang.Object[] r7 = new java.lang.Object[r9]
            X.0vb r0 = r14.A08
            java.text.NumberFormat r6 = r0.A0M()
            r0 = 4606281698874543309(0x3feccccccccccccd, double:0.9)
            goto L_0x032f
        L_0x0346:
            r8 = 2131886955(0x7f12036b, float:1.9408503E38)
            goto L_0x034d
        L_0x034a:
            r8 = 2131886916(0x7f120344, float:1.9408424E38)
        L_0x034d:
            java.lang.Object[] r7 = new java.lang.Object[r2]
            r7[r4] = r12
            goto L_0x02b2
        L_0x0353:
            X.78T r0 = new X.78T
            r0.<init>(r14, r5, r9, r3)
            r4.setOnClickListener(r0)
            goto L_0x0172
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20441ALe.A01():void");
    }

    public void CQJ() {
        A01();
    }
}
