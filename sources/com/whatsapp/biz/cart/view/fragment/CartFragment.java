package com.whatsapp.biz.cart.view.fragment;

import X.A8Q;
import X.AQ9;
import X.AnonymousClass00H;
import X.AnonymousClass10I;
import X.AnonymousClass11C;
import X.AnonymousClass11P;
import X.AnonymousClass11S;
import X.AnonymousClass190;
import X.AnonymousClass1E7;
import X.AnonymousClass1FL;
import X.AnonymousClass1FU;
import X.AnonymousClass1KB;
import X.AnonymousClass1KW;
import X.AnonymousClass1L4;
import X.AnonymousClass1PM;
import X.AnonymousClass1Y1;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3MY;
import X.AnonymousClass3MZ;
import X.AnonymousClass3Ma;
import X.AnonymousClass3NL;
import X.AnonymousClass4a6;
import X.AnonymousClass4aJ;
import X.AnonymousClass6P4;
import X.AnonymousClass8FS;
import X.AnonymousClass8G8;
import X.AnonymousClass9VJ;
import X.AnonymousClass9VO;
import X.AnonymousClass9VP;
import X.C107845ai;
import X.C1193267r;
import X.C139436yq;
import X.C161558Fv;
import X.C161848Hz;
import X.C17880vN;
import X.C179399Hu;
import X.C18000vb;
import X.C18010vc;
import X.C18020vd;
import X.C18030ve;
import X.C18040vf;
import X.C18070vi;
import X.C18090vk;
import X.C191899nN;
import X.C19830z4;
import X.C19949A0g;
import X.C20004A2u;
import X.C20005A2v;
import X.C20448ALl;
import X.C21424Ajr;
import X.C218617r;
import X.C22851Dl;
import X.C23581Gv;
import X.C24671Lf;
import X.C24921Me;
import X.C25001Mm;
import X.C26521Sl;
import X.C26911Ty;
import X.C28931bI;
import X.C33251iW;
import X.C42741yf;
import X.C56512ha;
import X.C72453Mb;
import X.C73203Rj;
import X.C74873d3;
import android.content.DialogInterface;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.KeyboardPopupLayout;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.WaTextView;
import com.whatsapp.jid.UserJid;
import com.whatsapp.mentions.MentionableEntry;
import com.whatsapp.wds.components.button.WDSButton;
import java.util.HashMap;
import java.util.List;

public final class CartFragment extends Hilt_CartFragment {
    public static boolean A1B;
    public static final HashMap A1C = C17880vN.A11();
    public static final HashMap A1D = C17880vN.A11();
    public int A00;
    public int A01;
    public int A02;
    public View A03;
    public TextView A04;
    public AnonymousClass190 A05;
    public AnonymousClass9VJ A06;
    public AnonymousClass9VO A07;
    public AnonymousClass9VP A08;
    public C56512ha A09;
    public C218617r A0A;
    public AnonymousClass1KB A0B;
    public KeyboardPopupLayout A0C;
    public AnonymousClass11S A0D;
    public C33251iW A0E;
    public C25001Mm A0F;
    public WaTextView A0G;
    public WaTextView A0H;
    public C26911Ty A0I;
    public C161848Hz A0J;
    public AnonymousClass8G8 A0K;
    public C161558Fv A0L;
    public AnonymousClass8FS A0M;
    public A8Q A0N;
    public C20005A2v A0O;
    public C191899nN A0P;
    public C24671Lf A0Q;
    public AnonymousClass1PM A0R;
    public C24921Me A0S;
    public AnonymousClass11C A0T;
    public AnonymousClass11P A0U;
    public C19830z4 A0V;
    public C18000vb A0W;
    public C74873d3 A0X;
    public C1193267r A0Y;
    public AnonymousClass1KW A0Z;
    public C18030ve A0a;
    public UserJid A0b;
    public MentionableEntry A0c;
    public C19949A0g A0d;
    public C20004A2u A0e;
    public C18010vc A0f;
    public AnonymousClass1L4 A0g;
    public C26521Sl A0h;
    public AnonymousClass10I A0i;
    public WDSButton A0j;
    public AnonymousClass00H A0k;
    public AnonymousClass00H A0l;
    public AnonymousClass00H A0m;
    public AnonymousClass00H A0n;
    public AnonymousClass00H A0o;
    public AnonymousClass00H A0p;
    public AnonymousClass00H A0q;
    public AnonymousClass00H A0r;
    public AnonymousClass00H A0s;
    public AnonymousClass00H A0t;
    public AnonymousClass00H A0u;
    public AnonymousClass00H A0v;
    public AnonymousClass00H A0w;
    public AnonymousClass00H A0x;
    public AnonymousClass00H A0y;
    public AnonymousClass00H A0z;
    public AnonymousClass00H A10;
    public boolean A11;
    public int A12;
    public View A13;
    public View A14;
    public View A15;
    public LinearLayout A16;
    public RecyclerView A17;
    public WaTextView A18;
    public final C107845ai A19 = new C20448ALl(this, 0);
    public final C23581Gv A1A = new AQ9(this, 0);

    /* JADX WARNING: Code restructure failed: missing block: B:126:0x0491, code lost:
        if (r3 == 1) goto L_0x0493;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View A1q(android.os.Bundle r33, android.view.LayoutInflater r34, android.view.ViewGroup r35) {
        /*
            r32 = this;
            r7 = 0
            r5 = r34
            X.C18070vi.A0d(r5, r7)
            r2 = r32
            android.os.Bundle r1 = r2.A15()
            java.lang.String r0 = "extra_business_id"
            android.os.Parcelable r0 = r1.getParcelable(r0)
            com.whatsapp.jid.UserJid r0 = (com.whatsapp.jid.UserJid) r0
            r2.A0b = r0
            android.os.Bundle r1 = r2.A15()
            java.lang.String r0 = "extra_entry_point"
            int r0 = r1.getInt(r0)
            r2.A00 = r0
            android.os.Bundle r1 = r2.A15()
            java.lang.String r0 = "extra_is_new_instance"
            boolean r0 = r1.getBoolean(r0)
            A1B = r0
            com.whatsapp.jid.UserJid r1 = r2.A0b
            if (r1 == 0) goto L_0x0065
            int r8 = r2.A00
            X.A2u r6 = r2.A2M()
            X.11S r0 = r2.A0D
            if (r0 == 0) goto L_0x05db
            boolean r0 = r0.A0O(r1)
            r3 = 1
            r1 = r0 ^ 1
            java.lang.String r4 = "cart_view_tag"
            java.lang.String r0 = "IsConsumer"
            r6.A05(r4, r0, r1)
            if (r8 == 0) goto L_0x05b9
            if (r8 == r3) goto L_0x05b5
            r0 = 2
            if (r8 == r0) goto L_0x05b1
            r0 = 3
            if (r8 == r0) goto L_0x05ad
            r0 = 4
            if (r8 == r0) goto L_0x05a9
            r0 = 5
            if (r8 != r0) goto L_0x05d4
            java.lang.String r3 = "CatalogSearch"
        L_0x005c:
            X.A2u r1 = r2.A2M()
            java.lang.String r0 = "EntryPoint"
            r1.A04(r4, r0, r3)
        L_0x0065:
            r0 = 2131625352(0x7f0e0588, float:1.887791E38)
            r1 = r35
            android.view.View r1 = r5.inflate(r0, r1, r7)
            r2.A15 = r1
            if (r1 == 0) goto L_0x05cc
            r0 = 2131433322(0x7f0b176a, float:1.8488426E38)
            com.whatsapp.WaTextView r0 = X.AnonymousClass3MW.A0T(r1, r0)
            r2.A0H = r0
            r0 = 2131428857(0x7f0b05f9, float:1.847937E38)
            android.view.View r0 = X.AnonymousClass1HF.A06(r1, r0)
            com.whatsapp.KeyboardPopupLayout r0 = (com.whatsapp.KeyboardPopupLayout) r0
            r2.A0C = r0
            r0 = 2131430490(0x7f0b0c5a, float:1.8482682E38)
            android.view.View r0 = X.AnonymousClass1HF.A06(r1, r0)
            com.whatsapp.mentions.MentionableEntry r0 = (com.whatsapp.mentions.MentionableEntry) r0
            r2.A0c = r0
            r0 = 2131430328(0x7f0b0bb8, float:1.8482354E38)
            android.view.View r16 = X.C18070vi.A05(r1, r0)
            r0 = 2131430949(0x7f0b0e25, float:1.8483613E38)
            android.view.View r0 = X.AnonymousClass1HF.A06(r1, r0)
            r2.A14 = r0
            r0 = 2131428862(0x7f0b05fe, float:1.847938E38)
            android.view.View r0 = X.AnonymousClass1HF.A06(r1, r0)
            r2.A13 = r0
            r0 = 2131430357(0x7f0b0bd5, float:1.8482413E38)
            com.whatsapp.WaTextView r0 = X.AnonymousClass3MW.A0T(r1, r0)
            r2.A18 = r0
            android.view.View r4 = r2.A13
            r9 = 8
            if (r4 == 0) goto L_0x00cd
            r0 = 2131428858(0x7f0b05fa, float:1.8479372E38)
            android.view.View r3 = X.C18070vi.A05(r4, r0)
            r0 = 2131430356(0x7f0b0bd4, float:1.848241E38)
            android.view.View r0 = X.C18070vi.A05(r4, r0)
            r0.setVisibility(r9)
            r3.setVisibility(r7)
        L_0x00cd:
            r0 = 2131430355(0x7f0b0bd3, float:1.8482409E38)
            com.whatsapp.WaTextView r0 = X.AnonymousClass3MW.A0T(r1, r0)
            r2.A0G = r0
            r0 = 2131428864(0x7f0b0600, float:1.8479385E38)
            android.view.View r0 = X.AnonymousClass1HF.A06(r1, r0)
            r2.A03 = r0
            r0 = 2131428876(0x7f0b060c, float:1.8479409E38)
            androidx.recyclerview.widget.RecyclerView r0 = X.C108945cZ.A0U(r1, r0)
            r2.A17 = r0
            r0 = 2131435150(0x7f0b1e8e, float:1.8492134E38)
            r10 = 2131435150(0x7f0b1e8e, float:1.8492134E38)
            android.widget.LinearLayout r0 = X.AnonymousClass3MX.A0K(r1, r0)
            r2.A16 = r0
            X.00H r0 = r2.A0o
            if (r0 == 0) goto L_0x05a5
            java.lang.Object r0 = r0.get()
            X.9ce r0 = (X.C185479ce) r0
            X.0ve r0 = r0.A02
            r6 = 1867(0x74b, float:2.616E-42)
            X.0vf r5 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r5, r0, r6)
            if (r0 == 0) goto L_0x0113
            r0 = 2131435155(0x7f0b1e93, float:1.8492144E38)
            android.widget.TextView r0 = X.AnonymousClass3MW.A0J(r1, r0)
            r2.A04 = r0
        L_0x0113:
            r0 = 2131435151(0x7f0b1e8f, float:1.8492136E38)
            com.whatsapp.wds.components.button.WDSButton r0 = X.AnonymousClass3MW.A0q(r1, r0)
            r2.A0j = r0
            r0 = 2131428859(0x7f0b05fb, float:1.8479374E38)
            android.view.View r12 = X.C18070vi.A05(r1, r0)
            X.1FL r0 = r2.A1D()
            int r0 = X.C49962Sp.A00(r0)
            r1.setMinimumHeight(r0)
            r0 = 2131436064(0x7f0b2220, float:1.8493988E38)
            android.view.View r8 = X.C18070vi.A05(r1, r0)
            int r0 = r8.getPaddingLeft()
            double r3 = (double) r0
            int r0 = r8.getPaddingRight()
            double r0 = (double) r0
            double r0 = java.lang.Math.max(r3, r0)
            int r3 = (int) r0
            android.view.ViewGroup$LayoutParams r1 = r8.getLayoutParams()
            java.lang.String r0 = "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams"
            X.C18070vi.A0z(r1, r0)
            android.view.ViewGroup$MarginLayoutParams r1 = (android.view.ViewGroup.MarginLayoutParams) r1
            X.0vb r0 = r2.A0W
            if (r0 == 0) goto L_0x05a1
            boolean r0 = X.AnonymousClass3MY.A1b(r0)
            if (r0 == 0) goto L_0x059d
            r1.rightMargin = r3
        L_0x015b:
            r8.setLayoutParams(r1)
            android.content.res.Resources r1 = X.AnonymousClass3MZ.A09(r2)
            r0 = 2131168125(0x7f070b7d, float:1.7950543E38)
            int r0 = r1.getDimensionPixelSize(r0)
            r2.A02 = r0
            android.content.res.Resources r1 = X.AnonymousClass3MZ.A09(r2)
            r0 = 2131168124(0x7f070b7c, float:1.795054E38)
            int r0 = r1.getDimensionPixelSize(r0)
            r2.A01 = r0
            android.app.Dialog r0 = r2.A03
            if (r0 == 0) goto L_0x0187
            android.view.Window r1 = r0.getWindow()
            if (r1 == 0) goto L_0x0187
            r0 = 16
            r1.setSoftInputMode(r0)
        L_0x0187:
            com.whatsapp.mentions.MentionableEntry r3 = r2.A0c
            if (r3 == 0) goto L_0x0199
            android.content.Context r1 = r2.A14()
            r0 = 2131899167(0x7f12331f, float:1.9433272E38)
            java.lang.String r0 = r1.getString(r0)
            r3.setHint(r0)
        L_0x0199:
            com.whatsapp.jid.UserJid r4 = r2.A0b
            if (r4 == 0) goto L_0x0259
            X.9VO r0 = r2.A07
            if (r0 == 0) goto L_0x01f9
            X.1na r11 = r0.A00
            X.10E r8 = r11.A02
            X.1KB r18 = X.AnonymousClass10E.A12(r8)
            X.10I r28 = X.AnonymousClass10E.AL1(r8)
            X.00S r0 = r8.A1n
            java.lang.Object r3 = r0.get()
            X.9k1 r3 = (X.C189889k1) r3
            X.00S r0 = r8.A1o
            java.lang.Object r1 = r0.get()
            X.A8S r1 = (X.A8S) r1
            X.00S r0 = r8.A8o
            java.lang.Object r0 = r0.get()
            X.8yS r0 = (X.C175278yS) r0
            X.A7x r24 = X.AnonymousClass8BU.A0C(r8)
            X.1nZ r11 = r11.A01
            X.8hz r26 = X.C36241nZ.A0C(r11)
            X.8hr r22 = X.C36241nZ.A06(r11)
            X.1Ty r19 = X.AnonymousClass8BT.A0D(r8)
            X.A8Q r25 = X.AnonymousClass8BU.A0D(r8)
            X.9yv r8 = new X.9yv
            r20 = r3
            r21 = r1
            r23 = r0
            r27 = r4
            r17 = r8
            r17.<init>(r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)
            X.0ve r14 = r2.A0a
            if (r14 == 0) goto L_0x0589
            X.A2v r13 = r2.A0O
            if (r13 != 0) goto L_0x01fc
            java.lang.String r0 = "catalogLoadSession"
        L_0x01f4:
            X.C18070vi.A11(r0)
            r0 = 0
            throw r0
        L_0x01f9:
            java.lang.String r0 = "cartRepositoryFactory"
            goto L_0x01f4
        L_0x01fc:
            X.0vb r11 = r2.A0W
            if (r11 == 0) goto L_0x05a1
            X.9VJ r3 = r2.A06
            if (r3 == 0) goto L_0x0599
            com.whatsapp.jid.UserJid r1 = r2.A0b
            X.8Hz r0 = new X.8Hz
            r21 = r2
            r22 = r2
            r19 = r8
            r20 = r2
            r23 = r13
            r24 = r11
            r25 = r14
            r26 = r1
            r18 = r3
            r17 = r0
            r17.<init>(r18, r19, r20, r21, r22, r23, r24, r25, r26)
            r2.A0J = r0
            X.9VP r1 = r2.A08
            if (r1 == 0) goto L_0x0595
            X.AH3 r0 = new X.AH3
            r0.<init>(r1, r8, r4)
            X.1It r1 = X.AnonymousClass8BR.A0C(r0, r2)
            java.lang.Class<X.8G8> r0 = X.AnonymousClass8G8.class
            X.1J2 r0 = r1.A00(r0)
            X.8G8 r0 = (X.AnonymousClass8G8) r0
            X.C18070vi.A0d(r0, r7)
            r2.A0K = r0
            X.2ha r0 = r2.A09
            if (r0 == 0) goto L_0x0591
            X.9yn r1 = r0.A00(r4)
            X.AGy r0 = new X.AGy
            r0.<init>(r1)
            X.1It r1 = X.AnonymousClass8BR.A0C(r0, r2)
            java.lang.Class<X.8Fv> r0 = X.C161558Fv.class
            X.1J2 r0 = r1.A00(r0)
            X.8Fv r0 = (X.C161558Fv) r0
            X.C18070vi.A0d(r0, r7)
            r2.A0L = r0
        L_0x0259:
            X.1It r1 = X.AnonymousClass3MW.A0N(r2)
            java.lang.Class<X.8FS> r0 = X.AnonymousClass8FS.class
            X.1J2 r0 = r1.A00(r0)
            X.8FS r0 = (X.AnonymousClass8FS) r0
            X.C18070vi.A0d(r0, r7)
            r2.A0M = r0
            r1 = 41
            X.AFU r0 = new X.AFU
            r0.<init>((com.whatsapp.biz.cart.view.fragment.CartFragment) r2, (int) r1)
            r11 = 39
            X.6LG r1 = new X.6LG
            r1.<init>(r0, r11)
            com.whatsapp.wds.components.button.WDSButton r0 = r2.A0j
            if (r0 == 0) goto L_0x027f
            r0.setOnClickListener(r1)
        L_0x027f:
            X.8G8 r0 = r2.A2K()
            X.1DT r3 = r0.A0E
            r1 = 6
            X.Are r0 = new X.Are
            r0.<init>(r2, r1)
            r8 = 1
            X.C20339AGv.A00(r2, r3, r0, r8)
            com.whatsapp.jid.UserJid r3 = r2.A0b
            if (r3 == 0) goto L_0x029b
            X.10I r1 = r2.A0i
            if (r1 == 0) goto L_0x058d
            r0 = 4
            X.C21450AkH.A01(r1, r2, r3, r0)
        L_0x029b:
            androidx.recyclerview.widget.RecyclerView r0 = r2.A17
            if (r0 == 0) goto L_0x02ff
            android.view.ViewGroup$LayoutParams r1 = r0.getLayoutParams()
        L_0x02a3:
            boolean r0 = r1 instanceof android.widget.RelativeLayout.LayoutParams
            if (r0 == 0) goto L_0x02fd
            android.widget.RelativeLayout$LayoutParams r1 = (android.widget.RelativeLayout.LayoutParams) r1
            if (r1 == 0) goto L_0x02b2
            r1.setMargins(r7, r7, r7, r7)
            r0 = 2
            r1.addRule(r0, r10)
        L_0x02b2:
            androidx.recyclerview.widget.RecyclerView r0 = r2.A17
            if (r0 == 0) goto L_0x02b9
            r0.setLayoutParams(r1)
        L_0x02b9:
            android.widget.LinearLayout r0 = r2.A16
            if (r0 == 0) goto L_0x02c0
            r0.setVisibility(r7)
        L_0x02c0:
            android.view.View r0 = r2.A14
            if (r0 == 0) goto L_0x02c7
            r0.setVisibility(r9)
        L_0x02c7:
            r0 = 22
            X.AnonymousClass3Ma.A1C(r12, r2, r0)
            android.view.View r4 = r2.A03
            if (r4 == 0) goto L_0x02df
            r1 = 42
            X.AFU r3 = new X.AFU
            r3.<init>((com.whatsapp.biz.cart.view.fragment.CartFragment) r2, (int) r1)
            X.6LG r1 = new X.6LG
            r1.<init>(r3, r11)
            r4.setOnClickListener(r1)
        L_0x02df:
            androidx.recyclerview.widget.RecyclerView r4 = r2.A17
            if (r4 == 0) goto L_0x02ef
            android.content.Context r3 = r2.A14()
            X.8I6 r1 = new X.8I6
            r1.<init>(r3)
            r4.A0r(r1)
        L_0x02ef:
            androidx.recyclerview.widget.RecyclerView r3 = r2.A17
            if (r3 == 0) goto L_0x0304
            r3.A0R = r8
            X.8Hz r1 = r2.A0J
            if (r1 != 0) goto L_0x0301
            java.lang.String r0 = "cartItemsAdapter"
            goto L_0x01f4
        L_0x02fd:
            r1 = 0
            goto L_0x02b2
        L_0x02ff:
            r1 = 0
            goto L_0x02a3
        L_0x0301:
            r3.setAdapter(r1)
        L_0x0304:
            androidx.recyclerview.widget.RecyclerView r1 = r2.A17
            if (r1 == 0) goto L_0x0562
            X.1qT r3 = r1.A0C
        L_0x030a:
            boolean r1 = r3 instanceof X.C37971qU
            if (r1 == 0) goto L_0x0314
            X.1qU r3 = (X.C37971qU) r3
            if (r3 == 0) goto L_0x0314
            r3.A00 = r7
        L_0x0314:
            X.8G8 r1 = r2.A2K()
            X.1DT r4 = r1.A08
            X.1q9 r3 = r2.A1G()
            X.Axn r1 = new X.Axn
            r1.<init>(r2)
            X.C20339AGv.A00(r3, r4, r1, r8)
            X.8G8 r1 = r2.A2K()
            X.1DT r4 = r1.A0C
            X.1q9 r3 = r2.A1G()
            X.Axo r1 = new X.Axo
            r1.<init>(r2)
            X.C20339AGv.A00(r3, r4, r1, r8)
            X.8G8 r1 = r2.A2K()
            X.1DT r4 = r1.A03
            X.1q9 r3 = r2.A1G()
            X.Axa r1 = new X.Axa
            r1.<init>(r2)
            X.C20339AGv.A00(r3, r4, r1, r8)
            X.8G8 r1 = r2.A2K()
            X.1DT r4 = r1.A02
            X.1q9 r3 = r2.A1G()
            X.Axb r1 = new X.Axb
            r1.<init>(r2)
            X.C20339AGv.A00(r3, r4, r1, r8)
            X.8Fv r1 = r2.A2L()
            X.1Dg r4 = r1.A01
            X.1q9 r3 = r2.A1G()
            X.Axc r1 = new X.Axc
            r1.<init>(r2)
            X.C20339AGv.A00(r3, r4, r1, r8)
            X.8Fv r1 = r2.A2L()
            X.9yn r1 = r1.A02
            X.1wy r4 = r1.A0B
            X.1q9 r3 = r2.A1G()
            X.Axd r1 = new X.Axd
            r1.<init>(r2)
            X.C20339AGv.A00(r3, r4, r1, r8)
            X.8FS r1 = r2.A0M
            if (r1 == 0) goto L_0x05c5
            X.1wy r4 = r1.A03
            X.1q9 r3 = r2.A1G()
            X.Axe r1 = new X.Axe
            r1.<init>(r2)
            X.C20339AGv.A00(r3, r4, r1, r8)
            X.8G8 r1 = r2.A2K()
            X.1DT r4 = r1.A0A
            X.1q9 r3 = r2.A1G()
            X.Axf r1 = new X.Axf
            r1.<init>(r2)
            X.C20339AGv.A00(r3, r4, r1, r8)
            X.8G8 r1 = r2.A2K()
            X.1DT r4 = r1.A07
            X.1q9 r3 = r2.A1G()
            X.Axg r1 = new X.Axg
            r1.<init>(r2)
            X.C20339AGv.A00(r3, r4, r1, r8)
            X.8G8 r1 = r2.A2K()
            X.1DT r4 = r1.A06
            X.1q9 r3 = r2.A1G()
            X.Axh r1 = new X.Axh
            r1.<init>(r2)
            X.C20339AGv.A00(r3, r4, r1, r8)
            X.8G8 r1 = r2.A2K()
            X.1DT r4 = r1.A09
            X.1q9 r3 = r2.A1G()
            X.Axi r1 = new X.Axi
            r1.<init>(r2)
            X.C20339AGv.A00(r3, r4, r1, r8)
            X.8G8 r1 = r2.A2K()
            X.1DT r4 = r1.A05
            X.1q9 r3 = r2.A1G()
            X.Axj r1 = new X.Axj
            r1.<init>(r2)
            X.C20339AGv.A00(r3, r4, r1, r8)
            X.8G8 r1 = r2.A2K()
            X.1DT r4 = r1.A0D
            X.1q9 r3 = r2.A1G()
            X.Axk r1 = new X.Axk
            r1.<init>(r2)
            X.C20339AGv.A00(r3, r4, r1, r8)
            X.8G8 r1 = r2.A2K()
            X.1DT r4 = r1.A04
            X.1q9 r3 = r2.A1G()
            X.Axl r1 = new X.Axl
            r1.<init>(r2)
            X.C20339AGv.A00(r3, r4, r1, r8)
            X.00H r1 = r2.A0o
            if (r1 == 0) goto L_0x05a5
            java.lang.Object r1 = r1.get()
            X.9ce r1 = (X.C185479ce) r1
            X.0ve r1 = r1.A02
            boolean r1 = X.C18020vd.A05(r5, r1, r6)
            if (r1 == 0) goto L_0x0454
            android.widget.TextView r1 = r2.A04
            if (r1 == 0) goto L_0x0454
            X.8G8 r1 = r2.A2K()
            X.1DT r4 = r1.A0B
            X.1q9 r3 = r2.A1G()
            X.Axm r1 = new X.Axm
            r1.<init>(r2)
            X.C20339AGv.A00(r3, r4, r1, r8)
            com.whatsapp.jid.UserJid r10 = r2.A0b
            if (r10 == 0) goto L_0x0454
            X.8G8 r1 = r2.A2K()
            X.9ce r3 = r1.A0H
            X.AN0 r9 = new X.AN0
            r9.<init>(r1)
            X.0ve r1 = r3.A02
            boolean r1 = X.C18020vd.A05(r5, r1, r6)
            if (r1 != 0) goto L_0x0555
            r9.C3p(r7)
        L_0x0454:
            X.8G8 r1 = r2.A2K()
            r1.A00 = r7
            r1.A01 = r8
            X.9yv r4 = r1.A0I
            X.10I r3 = r4.A0N
            r1 = 21
            X.C21424Ajr.A00(r3, r4, r1)
            X.8G8 r1 = r2.A2K()
            X.9yv r4 = r1.A0I
            X.1Ty r3 = r4.A0C
            com.whatsapp.jid.UserJid r1 = r4.A0K
            X.C20478AMp.A00(r3, r1, r4, r8)
            A04(r2)
            com.whatsapp.WaTextView r6 = r2.A0G
            if (r6 == 0) goto L_0x0499
            X.8G8 r1 = r2.A2K()
            X.1PM r5 = r1.A0L
            com.whatsapp.jid.UserJid r4 = r1.A0O
            r3 = 0
            X.2tn r1 = new X.2tn
            r1.<init>((X.AnonymousClass1PM) r5, (X.C25491Ok) r3, (com.whatsapp.jid.UserJid) r4)
            X.1ya r1 = r1.A01
            int r3 = r1.hostStorage
            r1 = 2
            if (r3 == r1) goto L_0x0493
            r1 = 2131889739(0x7f120e4b, float:1.941415E38)
            if (r3 != r8) goto L_0x0496
        L_0x0493:
            r1 = 2131889740(0x7f120e4c, float:1.9414152E38)
        L_0x0496:
            r6.setText(r1)
        L_0x0499:
            com.whatsapp.KeyboardPopupLayout r10 = r2.A0C
            if (r10 == 0) goto L_0x052a
            X.1FL r15 = r2.A1D()
            X.0ve r12 = r2.A0a
            if (r12 == 0) goto L_0x0589
            X.1L4 r11 = r2.A0g
            if (r11 == 0) goto L_0x0585
            X.190 r9 = r2.A05
            if (r9 == 0) goto L_0x0581
            X.1KW r8 = r2.A0Z
            if (r8 == 0) goto L_0x057d
            X.67r r7 = r2.A0Y
            if (r7 == 0) goto L_0x0579
            X.11C r6 = r2.A0T
            if (r6 == 0) goto L_0x0575
            X.0vb r5 = r2.A0W
            if (r5 == 0) goto L_0x05a1
            X.00H r1 = r2.A0v
            if (r1 == 0) goto L_0x0571
            java.lang.Object r4 = r1.get()
            com.whatsapp.emoji.search.EmojiSearchProvider r4 = (com.whatsapp.emoji.search.EmojiSearchProvider) r4
            X.0z4 r3 = r2.A0V
            if (r3 == 0) goto L_0x056d
            X.0vc r1 = r2.A0f
            if (r1 == 0) goto L_0x0569
            com.whatsapp.mentions.MentionableEntry r13 = r2.A0c
            java.lang.Integer r30 = java.lang.Integer.valueOf(r0)
            X.00H r0 = r2.A0w
            if (r0 == 0) goto L_0x0565
            java.lang.Object r0 = r0.get()
            X.A59 r0 = (X.A59) r0
            r31 = 0
            X.3d3 r14 = new X.3d3
            r20 = r6
            r21 = r3
            r22 = r5
            r23 = r0
            r24 = r7
            r25 = r8
            r26 = r4
            r27 = r12
            r28 = r1
            r29 = r11
            r19 = r13
            r18 = r10
            r17 = r9
            r14.<init>(r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31)
            r2.A0X = r14
            r0 = 2131430335(0x7f0b0bbf, float:1.8482368E38)
            android.view.View r1 = r10.findViewById(r0)
            com.whatsapp.emoji.search.EmojiSearchContainer r1 = (com.whatsapp.emoji.search.EmojiSearchContainer) r1
            X.1FL r0 = r2.A1D()
            X.4UI r3 = new X.4UI
            r3.<init>(r0, r14, r1)
            r1 = 0
            X.4n0 r0 = new X.4n0
            r0.<init>(r2, r1)
            r3.A00 = r0
            X.5ai r0 = r2.A19
            r14.A0J(r0)
            r1 = 26
            X.Ajr r0 = new X.Ajr
            r0.<init>(r2, r1)
            r14.A0E = r0
        L_0x052a:
            com.whatsapp.jid.UserJid r1 = r2.A0b
            if (r1 == 0) goto L_0x054d
            java.util.HashMap r0 = A1D
            java.lang.String r3 = X.C108945cZ.A1G(r1, r0)
            if (r3 == 0) goto L_0x054d
            int r0 = r3.length()
            if (r0 == 0) goto L_0x054d
            java.util.HashMap r0 = A1C
            java.lang.String r0 = X.C108945cZ.A1G(r1, r0)
            java.util.ArrayList r1 = X.AnonymousClass4aJ.A03(r0)
            com.whatsapp.mentions.MentionableEntry r0 = r2.A0c
            if (r0 == 0) goto L_0x054d
            r0.setMentionableText(r3, r1)
        L_0x054d:
            r2.A00()
            android.view.View r0 = r2.A15
            if (r0 == 0) goto L_0x05bd
            return r0
        L_0x0555:
            X.1Ty r4 = r3.A00
            r3 = 2
            X.AMg r1 = new X.AMg
            r1.<init>(r9, r3)
            r4.A0C(r1, r10)
            goto L_0x0454
        L_0x0562:
            r3 = 0
            goto L_0x030a
        L_0x0565:
            java.lang.String r0 = "expressionUserJourneyLogger"
            goto L_0x01f4
        L_0x0569:
            java.lang.String r0 = "sharedPreferencesFactory"
            goto L_0x01f4
        L_0x056d:
            java.lang.String r0 = "waSharedPreferences"
            goto L_0x01f4
        L_0x0571:
            java.lang.String r0 = "emojiSearchProvider"
            goto L_0x01f4
        L_0x0575:
            java.lang.String r0 = "systemServices"
            goto L_0x01f4
        L_0x0579:
            java.lang.String r0 = "recentEmojis"
            goto L_0x01f4
        L_0x057d:
            java.lang.String r0 = "emojiLoader"
            goto L_0x01f4
        L_0x0581:
            java.lang.String r0 = "crashLogs"
            goto L_0x01f4
        L_0x0585:
            java.lang.String r0 = "imeUtils"
            goto L_0x01f4
        L_0x0589:
            java.lang.String r0 = "abProps"
            goto L_0x01f4
        L_0x058d:
            java.lang.String r0 = "waWorkers"
            goto L_0x01f4
        L_0x0591:
            java.lang.String r0 = "promotionsRepositoryFactory"
            goto L_0x01f4
        L_0x0595:
            java.lang.String r0 = "cartViewModelFactory"
            goto L_0x01f4
        L_0x0599:
            java.lang.String r0 = "cartItemWithQuantityViewHolderFactory"
            goto L_0x01f4
        L_0x059d:
            r1.leftMargin = r3
            goto L_0x015b
        L_0x05a1:
            java.lang.String r0 = "whatsAppLocale"
            goto L_0x01f4
        L_0x05a5:
            java.lang.String r0 = "cartManager"
            goto L_0x01f4
        L_0x05a9:
            java.lang.String r3 = "Conversation"
            goto L_0x005c
        L_0x05ad:
            java.lang.String r3 = "PLM"
            goto L_0x005c
        L_0x05b1:
            java.lang.String r3 = "Collection"
            goto L_0x005c
        L_0x05b5:
            java.lang.String r3 = "Product"
            goto L_0x005c
        L_0x05b9:
            java.lang.String r3 = "Catalog"
            goto L_0x005c
        L_0x05bd:
            java.lang.String r1 = "CartFragment: view not found"
            java.lang.Exception r0 = new java.lang.Exception
            r0.<init>(r1)
            throw r0
        L_0x05c5:
            java.lang.String r0 = "refreshCartDialogSequenceViewModel"
            X.C18070vi.A11(r0)
            r0 = 0
            throw r0
        L_0x05cc:
            java.lang.String r1 = "CartFragment: root view not found"
            java.lang.Exception r0 = new java.lang.Exception
            r0.<init>(r1)
            throw r0
        L_0x05d4:
            java.lang.String r0 = "CartFragment/logQplCartViewAnnotations/unhandled entry point"
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0n(r0)
            throw r0
        L_0x05db:
            java.lang.String r0 = "meManager"
            X.C18070vi.A11(r0)
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.biz.cart.view.fragment.CartFragment.A1q(android.os.Bundle, android.view.LayoutInflater, android.view.ViewGroup):android.view.View");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x002f, code lost:
        if (X.AnonymousClass1L4.A00(r1) != true) goto L_0x0031;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A20(android.os.Bundle r4) {
        /*
            r3 = this;
            r0 = 0
            X.C18070vi.A0d(r4, r0)
            super.A20(r4)
            X.3d3 r0 = r3.A0X
            r2 = 1
            if (r0 == 0) goto L_0x0021
            boolean r0 = r0.isShowing()
            if (r0 != r2) goto L_0x0021
        L_0x0012:
            r3.A12 = r2
            java.lang.String r0 = "extra_input_method"
            r4.putInt(r0, r2)
            java.lang.String r1 = "extra_is_sending_order"
            boolean r0 = r3.A11
            r4.putBoolean(r1, r0)
            return
        L_0x0021:
            com.whatsapp.KeyboardPopupLayout r1 = r3.A0C
            if (r1 == 0) goto L_0x0031
            X.1L4 r0 = r3.A0g
            if (r0 == 0) goto L_0x0033
            boolean r1 = X.AnonymousClass1L4.A00(r1)
            r0 = 1
            r2 = 0
            if (r1 == r0) goto L_0x0012
        L_0x0031:
            r2 = 2
            goto L_0x0012
        L_0x0033:
            java.lang.String r0 = "imeUtils"
            X.C18070vi.A11(r0)
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.biz.cart.view.fragment.CartFragment.A20(android.os.Bundle):void");
    }

    public void A2I(C139436yq r4) {
        C18070vi.A0d(r4, 0);
        r4.A00(new AnonymousClass6P4((C18090vk) null, (AnonymousClass1Y1) null, 1));
    }

    public void onConfigurationChanged(Configuration configuration) {
        C18070vi.A0d(configuration, 0);
        super.onConfigurationChanged(configuration);
        A00();
    }

    public void onDismiss(DialogInterface dialogInterface) {
        String str;
        AnonymousClass1FU r1;
        C18070vi.A0d(dialogInterface, 0);
        super.onDismiss(dialogInterface);
        C18030ve r2 = this.A0a;
        if (r2 != null) {
            if (C18020vd.A05(C18040vf.A02, r2, 6715)) {
                AnonymousClass10I r12 = this.A0i;
                if (r12 != null) {
                    C21424Ajr.A00(r12, this, 28);
                } else {
                    str = "waWorkers";
                }
            }
            AnonymousClass1FL A1B2 = A1B();
            if ((A1B2 instanceof AnonymousClass1FU) && (r1 = (AnonymousClass1FU) A1B2) != null) {
                r1.A3h(0);
                return;
            }
            return;
        }
        str = "abProps";
        C18070vi.A11(str);
        throw null;
    }

    public static final void A01(C22851Dl r3, C179399Hu r4, CartFragment cartFragment) {
        int i = 2131891509;
        if (r4 == C179399Hu.AT_LEAST_ONE_UPDATED) {
            i = 2131887957;
        }
        C73203Rj A032 = AnonymousClass4a6.A03(cartFragment);
        A032.A0T(false);
        A032.A0D(i);
        A032.A0g(cartFragment, r3, 2131899286);
        AnonymousClass3MY.A1G(A032);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000b, code lost:
        if (r1.A02 != false) goto L_0x000d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A02(com.whatsapp.biz.cart.view.fragment.CartFragment r5) {
        /*
            X.8FS r1 = r5.A0M
            if (r1 == 0) goto L_0x0077
            boolean r0 = r1.A01
            if (r0 != 0) goto L_0x000d
            boolean r1 = r1.A02
            r0 = 0
            if (r1 == 0) goto L_0x000e
        L_0x000d:
            r0 = 1
        L_0x000e:
            r4 = 0
            if (r0 != 0) goto L_0x0023
            X.8Fv r0 = r5.A2L()
            X.9yn r3 = r0.A02
            X.10I r2 = r3.A0C
            r1 = 11
            X.7RK r0 = new X.7RK
            r0.<init>((int) r1, (java.lang.Object) r3, (boolean) r4)
            r2.CGF(r0)
        L_0x0023:
            A03(r5)
            X.8Hz r0 = r5.A0J
            if (r0 != 0) goto L_0x0031
            java.lang.String r0 = "cartItemsAdapter"
        L_0x002c:
            X.C18070vi.A11(r0)
            r0 = 0
            throw r0
        L_0x0031:
            int r0 = r0.A0U()
            r1 = 8
            if (r0 != 0) goto L_0x0063
            android.view.View r0 = r5.A13
            if (r0 == 0) goto L_0x0040
            r0.setVisibility(r4)
        L_0x0040:
            androidx.recyclerview.widget.RecyclerView r0 = r5.A17
            if (r0 == 0) goto L_0x0047
            r0.setVisibility(r1)
        L_0x0047:
            android.view.View r0 = r5.A14
            if (r0 == 0) goto L_0x004e
            r0.setVisibility(r1)
        L_0x004e:
            android.widget.LinearLayout r0 = r5.A16
        L_0x0050:
            if (r0 == 0) goto L_0x0055
            r0.setVisibility(r1)
        L_0x0055:
            X.00H r0 = r5.A0p
            if (r0 == 0) goto L_0x0074
            X.10T r1 = X.C17880vN.A0V(r0)
            r0 = 18
            X.C20735AWq.A00(r1, r0)
            return
        L_0x0063:
            androidx.recyclerview.widget.RecyclerView r0 = r5.A17
            if (r0 == 0) goto L_0x006a
            r0.setVisibility(r4)
        L_0x006a:
            android.widget.LinearLayout r0 = r5.A16
            if (r0 == 0) goto L_0x0071
            r0.setVisibility(r4)
        L_0x0071:
            android.view.View r0 = r5.A13
            goto L_0x0050
        L_0x0074:
            java.lang.String r0 = "cartObservers"
            goto L_0x002c
        L_0x0077:
            java.lang.String r0 = "refreshCartDialogSequenceViewModel"
            goto L_0x002c
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.biz.cart.view.fragment.CartFragment.A02(com.whatsapp.biz.cart.view.fragment.CartFragment):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:104:0x0239  */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x0263  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00e8  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0117  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0136  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x013c  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x013e  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0144  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A03(com.whatsapp.biz.cart.view.fragment.CartFragment r23) {
        /*
            r2 = r23
            X.8Hz r0 = r2.A0J
            java.lang.String r14 = "cartItemsAdapter"
            if (r0 == 0) goto L_0x02f8
            int r5 = r0.A0U()
            X.8Hz r0 = r2.A0J
            if (r0 == 0) goto L_0x02f8
            java.util.ArrayList r4 = r0.A0V()
            X.00H r0 = r2.A0l
            if (r0 == 0) goto L_0x02f2
            r0.get()
            X.8Hz r0 = r2.A0J
            if (r0 == 0) goto L_0x02f8
            java.util.Date r11 = r0.A01
            java.util.ArrayList r1 = X.AnonymousClass000.A13()
            java.util.Iterator r12 = r4.iterator()
        L_0x0029:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L_0x0080
            X.9rM r6 = X.AnonymousClass8BR.A0J(r12)
            X.AEv r7 = r6.A01
            java.util.List r9 = r7.A0A
            boolean r0 = r9.isEmpty()
            if (r0 != 0) goto L_0x007e
            r8 = 0
            java.lang.Object r0 = r9.get(r8)
            X.AEI r0 = (X.AEI) r0
            java.lang.String r3 = r0.A04
            java.lang.Object r0 = r9.get(r8)
            X.AEI r0 = (X.AEI) r0
            java.lang.String r0 = r0.A00
            X.ADe r10 = new X.ADe
            r10.<init>(r3, r0)
        L_0x0053:
            java.math.BigDecimal r3 = r7.A09
            X.AE5 r0 = r7.A04
            java.math.BigDecimal r21 = X.AnonymousClass9PG.A00(r0, r3, r11)
            java.lang.String r9 = r7.A0H
            java.lang.String r8 = r7.A08
            X.A6S r3 = r7.A07
            long r6 = r6.A00
            int r0 = (int) r6
            X.C18070vi.A0j(r9, r8)
            r16 = 0
            r23 = 0
            X.ADV r15 = new X.ADV
            r17 = r10
            r18 = r3
            r19 = r9
            r20 = r8
            r22 = r0
            r15.<init>(r16, r17, r18, r19, r20, r21, r22, r23)
            r1.add(r15)
            goto L_0x0029
        L_0x007e:
            r10 = 0
            goto L_0x0053
        L_0x0080:
            X.8Fv r0 = r2.A2L()
            X.9tj r3 = r0.A0T()
            X.00H r0 = r2.A2N()
            r0.get()
            java.math.BigDecimal r11 = X.A6E.A02(r4)
            X.00H r0 = r2.A2N()
            r0.get()
            X.8Hz r0 = r2.A0J
            if (r0 == 0) goto L_0x02f8
            java.util.Date r0 = r0.A01
            java.math.BigDecimal r10 = X.A6E.A01(r0, r4)
            X.00H r0 = r2.A2N()
            r0.get()
            java.math.BigDecimal r9 = X.A6E.A00(r3, r11, r10, r1)
            X.00H r0 = r2.A2N()
            r0.get()
            r3 = r10
            r4 = 0
            if (r10 == 0) goto L_0x0140
            if (r9 == 0) goto L_0x00d3
            java.math.BigDecimal r0 = java.math.BigDecimal.ZERO
            int r0 = r10.compareTo(r0)
            if (r0 < 0) goto L_0x00dc
            java.math.BigDecimal r0 = java.math.BigDecimal.ZERO
            int r0 = r9.compareTo(r0)
            if (r0 < 0) goto L_0x00dc
            java.math.BigDecimal r3 = r10.add(r9)
            X.C18070vi.A0X(r3)
        L_0x00d3:
            java.math.BigDecimal r0 = java.math.BigDecimal.ZERO
            int r0 = r3.compareTo(r0)
            if (r0 <= 0) goto L_0x00dc
            r4 = r3
        L_0x00dc:
            if (r11 == 0) goto L_0x00f8
            if (r4 == 0) goto L_0x00f8
            int r0 = r4.compareTo(r11)
            if (r0 <= 0) goto L_0x00f8
            if (r10 != 0) goto L_0x013e
            java.math.BigDecimal r0 = java.math.BigDecimal.ZERO
        L_0x00ea:
            java.math.BigDecimal r3 = r11.subtract(r0)
            if (r9 == 0) goto L_0x00f7
            int r0 = r9.compareTo(r3)
            if (r0 <= 0) goto L_0x00f7
            r9 = r3
        L_0x00f7:
            r4 = r11
        L_0x00f8:
            X.8Fv r0 = r2.A2L()
            X.1Dg r0 = r0.A01
            java.lang.Object r8 = r0.A06()
            X.A1h r8 = (X.C19972A1h) r8
            X.8G8 r0 = r2.A2K()
            X.1DT r0 = r0.A03
            java.util.List r3 = X.AnonymousClass3MW.A10(r0)
            if (r8 == 0) goto L_0x016a
            if (r3 == 0) goto L_0x016a
            boolean r0 = r8.A01
            r7 = 0
            if (r0 == 0) goto L_0x013c
            java.util.Iterator r6 = r3.iterator()
        L_0x011b:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x013a
            X.9rM r0 = X.AnonymousClass8BR.A0J(r6)
            X.AEv r0 = r0.A01
            X.A6S r3 = r0.A07
            if (r3 == 0) goto L_0x011b
        L_0x012b:
            X.9tj r0 = r8.A00
            X.8iB r12 = new X.8iB
            r12.<init>(r0, r3, r9)
        L_0x0132:
            X.8Hz r8 = r2.A0J
            if (r8 != 0) goto L_0x0144
            X.C18070vi.A11(r14)
            throw r7
        L_0x013a:
            r3 = r7
            goto L_0x012b
        L_0x013c:
            r12 = r7
            goto L_0x0132
        L_0x013e:
            r0 = r10
            goto L_0x00ea
        L_0x0140:
            if (r9 == 0) goto L_0x00dc
            r3 = r9
            goto L_0x00d3
        L_0x0144:
            java.util.List r7 = r8.A0C
            int r6 = X.AnonymousClass3MX.A01(r7)
            if (r6 < 0) goto L_0x02e4
        L_0x014c:
            int r13 = r6 + -1
            java.lang.Object r3 = r7.get(r6)
            boolean r0 = r3 instanceof X.C168038iB
            if (r0 != 0) goto L_0x015c
            boolean r0 = r3 instanceof X.C168018i9
            if (r0 == 0) goto L_0x02e1
            int r6 = r6 + 1
        L_0x015c:
            if (r12 == 0) goto L_0x02cf
            int r0 = r7.size()
            if (r6 != r0) goto L_0x02b5
            r7.add(r12)
        L_0x0167:
            r8.A0H(r6)
        L_0x016a:
            X.00H r0 = r2.A2N()
            java.lang.Object r0 = r0.get()
            X.A6E r0 = (X.A6E) r0
            java.lang.String r8 = r0.A03(r11, r4, r1)
            X.00H r0 = r2.A2N()
            java.lang.Object r0 = X.C18070vi.A0E(r0)
            X.A6E r0 = (X.A6E) r0
            r16 = 0
            r7 = 0
            java.lang.String r3 = r0.A04(r4, r1, r7)
            android.view.View r4 = r2.A15
            if (r4 == 0) goto L_0x0242
            r0 = 2131435157(0x7f0b1e95, float:1.8492148E38)
            android.view.View r13 = X.C18070vi.A05(r4, r0)
            r0 = 2131435156(0x7f0b1e94, float:1.8492146E38)
            android.widget.TextView r12 = X.AnonymousClass3Ma.A0E(r4, r0)
            r0 = 2131435154(0x7f0b1e92, float:1.8492142E38)
            android.widget.TextView r6 = X.AnonymousClass3Ma.A0E(r4, r0)
            r0 = 2131435153(0x7f0b1e91, float:1.849214E38)
            android.widget.TextView r4 = X.AnonymousClass3Ma.A0E(r4, r0)
            if (r3 == 0) goto L_0x02ab
            int r0 = r3.length()
            if (r0 == 0) goto L_0x02ab
            r13.setVisibility(r7)
            r12.setVisibility(r7)
            r12.setText(r3)
            X.0ve r12 = r2.A0a
            if (r12 == 0) goto L_0x02ec
            r3 = 5996(0x176c, float:8.402E-42)
            X.0vf r0 = X.C18040vf.A02
            boolean r3 = X.C18020vd.A05(r0, r12, r3)
            if (r3 == 0) goto L_0x02a8
            X.00H r3 = r2.A2N()
            java.lang.Object r12 = X.C18070vi.A0E(r3)
            X.A6E r12 = (X.A6E) r12
            r3 = 8
            java.lang.String r17 = r12.A04(r11, r1, r7)
            X.00H r11 = r2.A2N()
            java.lang.Object r12 = r11.get()
            X.A6E r12 = (X.A6E) r12
            r11 = 1
            java.lang.String r18 = r12.A04(r10, r1, r11)
            X.00H r10 = r2.A2N()
            java.lang.Object r10 = r10.get()
            X.A6E r10 = (X.A6E) r10
            java.lang.String r19 = r10.A04(r9, r1, r11)
            X.0ve r9 = r2.A0a
            if (r9 == 0) goto L_0x02ec
            r1 = 7120(0x1bd0, float:9.977E-42)
            boolean r0 = X.C18020vd.A05(r0, r9, r1)
            if (r0 == 0) goto L_0x0219
            if (r17 == 0) goto L_0x0219
            int r0 = r17.length()
            if (r0 == 0) goto L_0x0219
            if (r18 == 0) goto L_0x0211
            int r0 = r18.length()
            if (r0 != 0) goto L_0x0270
        L_0x0211:
            if (r19 == 0) goto L_0x0219
            int r0 = r19.length()
            if (r0 != 0) goto L_0x0270
        L_0x0219:
            X.8Hz r11 = r2.A0J
            if (r11 == 0) goto L_0x02e8
            int r10 = X.C161848Hz.A00(r11)
            java.util.List r9 = r11.A0C
            java.lang.Object r1 = X.C29431cG.A0f(r9, r10)
            boolean r0 = r1 instanceof X.C168048iC
            if (r0 == 0) goto L_0x0233
            if (r1 == 0) goto L_0x0233
            r9.remove(r10)
            r11.A0I(r10)
        L_0x0233:
            boolean r0 = android.text.TextUtils.isEmpty(r8)
            if (r0 == 0) goto L_0x0263
            r0 = 2131887952(0x7f120750, float:1.9410526E38)
            r6.setText(r0)
            r4.setVisibility(r3)
        L_0x0242:
            X.8Hz r6 = r2.A0J
            if (r6 == 0) goto L_0x02f8
            java.util.List r4 = r6.A0C
            int r3 = r4.size()
            r2 = 0
        L_0x024d:
            if (r2 >= r3) goto L_0x02e7
            java.lang.Object r1 = r4.get(r2)
            X.9Wb r1 = (X.C182879Wb) r1
            boolean r0 = r1 instanceof X.C167998i7
            if (r0 == 0) goto L_0x0260
            X.8i7 r1 = (X.C167998i7) r1
            r1.A00 = r5
            r6.A0G(r2)
        L_0x0260:
            int r2 = r2 + 1
            goto L_0x024d
        L_0x0263:
            r0 = 2131896960(0x7f122a80, float:1.9428796E38)
            r6.setText(r0)
            r4.setText(r8)
            r4.setVisibility(r7)
            goto L_0x0242
        L_0x0270:
            X.8Hz r9 = r2.A0J
            if (r9 == 0) goto L_0x02e8
            X.8iC r15 = new X.8iC
            r20 = r16
            r21 = r7
            r15.<init>(r16, r17, r18, r19, r20, r21)
            int r11 = X.C161848Hz.A00(r9)
            java.util.List r10 = r9.A0C
            int r0 = r10.size()
            if (r11 != r0) goto L_0x0290
            r10.add(r15)
        L_0x028c:
            r9.A0H(r11)
            goto L_0x0233
        L_0x0290:
            java.lang.Object r1 = X.C29431cG.A0f(r10, r11)
            boolean r0 = r1 instanceof X.C168048iC
            if (r0 == 0) goto L_0x02a1
            if (r1 == 0) goto L_0x02a1
            r10.set(r11, r15)
            r9.A0G(r11)
            goto L_0x0233
        L_0x02a1:
            r0 = -1
            if (r11 == r0) goto L_0x0233
            r10.add(r11, r15)
            goto L_0x028c
        L_0x02a8:
            r3 = 8
            goto L_0x0233
        L_0x02ab:
            r3 = 8
            r13.setVisibility(r3)
            r12.setVisibility(r3)
            goto L_0x0219
        L_0x02b5:
            java.lang.Object r3 = X.C29431cG.A0f(r7, r6)
            boolean r0 = r3 instanceof X.C168038iB
            if (r0 == 0) goto L_0x02c7
            if (r3 == 0) goto L_0x02c7
            r7.set(r6, r12)
            r8.A0G(r6)
            goto L_0x016a
        L_0x02c7:
            r0 = -1
            if (r6 == r0) goto L_0x016a
            r7.add(r6, r12)
            goto L_0x0167
        L_0x02cf:
            java.lang.Object r3 = X.C29431cG.A0f(r7, r6)
            boolean r0 = r3 instanceof X.C168038iB
            if (r0 == 0) goto L_0x016a
            if (r3 == 0) goto L_0x016a
            r7.remove(r6)
            r8.A0I(r6)
            goto L_0x016a
        L_0x02e1:
            r6 = r13
            if (r13 >= 0) goto L_0x014c
        L_0x02e4:
            r6 = -1
            goto L_0x015c
        L_0x02e7:
            return
        L_0x02e8:
            X.C18070vi.A11(r14)
            throw r16
        L_0x02ec:
            java.lang.String r0 = "abProps"
            X.C18070vi.A11(r0)
            throw r16
        L_0x02f2:
            java.lang.String r0 = "cartItemMapper"
            X.C18070vi.A11(r0)
            goto L_0x02fb
        L_0x02f8:
            X.C18070vi.A11(r14)
        L_0x02fb:
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.biz.cart.view.fragment.CartFragment.A03(com.whatsapp.biz.cart.view.fragment.CartFragment):void");
    }

    public void A1v() {
        String str;
        C18030ve r2 = this.A0a;
        if (r2 != null) {
            if (C18020vd.A05(C18040vf.A02, r2, 6715)) {
                AnonymousClass00H r0 = this.A0y;
                if (r0 != null) {
                    AnonymousClass3MX.A0u(r0).A02(this.A0b, 62);
                } else {
                    str = "navigationTimeSpentManager";
                }
            }
            super.A1v();
            return;
        }
        str = "abProps";
        C18070vi.A11(str);
        throw null;
    }

    public final AnonymousClass8G8 A2K() {
        AnonymousClass8G8 r0 = this.A0K;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("cartViewModel");
        throw null;
    }

    public final C161558Fv A2L() {
        C161558Fv r0 = this.A0L;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("promotionsViewModel");
        throw null;
    }

    public final C20004A2u A2M() {
        C20004A2u a2u = this.A0e;
        if (a2u != null) {
            return a2u;
        }
        C18070vi.A11("bizQPLManager");
        throw null;
    }

    public final AnonymousClass00H A2N() {
        AnonymousClass00H r0 = this.A0z;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("orderPriceUtils");
        throw null;
    }

    private final void A00() {
        int i;
        ViewGroup.LayoutParams layoutParams;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        ViewGroup.LayoutParams layoutParams2;
        int dimensionPixelSize = AnonymousClass3MZ.A09(this).getDimensionPixelSize(2131167007);
        if (C72453Mb.A08(A14()) == 1) {
            i = dimensionPixelSize * 2;
        } else {
            i = dimensionPixelSize / 2;
            dimensionPixelSize = i;
        }
        WaTextView waTextView = this.A18;
        ViewGroup.MarginLayoutParams marginLayoutParams2 = null;
        if (waTextView != null) {
            layoutParams = waTextView.getLayoutParams();
        } else {
            layoutParams = null;
        }
        if (layoutParams instanceof LinearLayout.LayoutParams) {
            marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            if (marginLayoutParams != null) {
                marginLayoutParams.topMargin = i;
            }
        } else {
            marginLayoutParams = null;
        }
        WaTextView waTextView2 = this.A18;
        if (waTextView2 != null) {
            waTextView2.setLayoutParams(marginLayoutParams);
        }
        WaTextView waTextView3 = this.A0G;
        if (waTextView3 != null) {
            layoutParams2 = waTextView3.getLayoutParams();
        } else {
            layoutParams2 = null;
        }
        if ((layoutParams2 instanceof LinearLayout.LayoutParams) && (marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2) != null) {
            marginLayoutParams2.topMargin = dimensionPixelSize;
        }
        WaTextView waTextView4 = this.A0G;
        if (waTextView4 != null) {
            waTextView4.setLayoutParams(marginLayoutParams2);
        }
    }

    public static final void A04(CartFragment cartFragment) {
        String A0I2;
        View view;
        AnonymousClass8G8 A2K = cartFragment.A2K();
        AnonymousClass1PM r0 = A2K.A0L;
        UserJid userJid = A2K.A0O;
        C42741yf A022 = r0.A02(userJid);
        if (A022 != null) {
            A0I2 = A022.A08;
        } else {
            A0I2 = A2K.A0M.A0I(new AnonymousClass1E7(userJid));
        }
        if (A0I2 != null && A0I2.length() != 0 && (view = cartFragment.A15) != null) {
            View A023 = C28931bI.A00(view, 2131434396).A02();
            C18070vi.A0X(A023);
            ImageView A0C2 = AnonymousClass3Ma.A0C(A023, 2131434397);
            TextEmojiLabel A0c2 = C72453Mb.A0c(A023, 2131434398);
            C18000vb r2 = cartFragment.A0W;
            if (r2 != null) {
                AnonymousClass3NL.A01(cartFragment.A14(), A0C2, r2, 2131231228);
                A0c2.A0S(A0I2, (List) null, 0, false);
                return;
            }
            AnonymousClass3MW.A1M();
            throw null;
        }
    }

    public void A1r() {
        String str;
        super.A1r();
        C20005A2v a2v = this.A0O;
        if (a2v == null) {
            str = "catalogLoadSession";
        } else {
            a2v.A02();
            C24671Lf r1 = this.A0Q;
            if (r1 != null) {
                r1.unregisterObserver(this.A1A);
                A2M().A06("cart_view_tag", false);
                return;
            }
            str = "contactObservers";
        }
        C18070vi.A11(str);
        throw null;
    }

    public void A1t() {
        List list;
        super.A1t();
        UserJid userJid = this.A0b;
        MentionableEntry mentionableEntry = this.A0c;
        if (!(userJid == null || mentionableEntry == null)) {
            HashMap hashMap = A1D;
            String stringText = mentionableEntry.getStringText();
            C18070vi.A0X(stringText);
            hashMap.put(userJid, stringText);
            HashMap hashMap2 = A1C;
            MentionableEntry mentionableEntry2 = this.A0c;
            if (mentionableEntry2 != null) {
                list = mentionableEntry2.getMentions();
            } else {
                list = null;
            }
            hashMap2.put(userJid, AnonymousClass4aJ.A01(list));
        }
        if (this.A00 == 1) {
            A1D().setRequestedOrientation(1);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000f, code lost:
        if (r0 != 2) goto L_0x0011;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A1u() {
        /*
            r5 = this;
            super.A1u()
            X.1FL r3 = r5.A1D()
            int r0 = r5.A12
            if (r0 == 0) goto L_0x0066
            r1 = 1
            r4 = 2
            if (r0 == r1) goto L_0x0045
            if (r0 == r4) goto L_0x004f
        L_0x0011:
            X.8G8 r1 = r5.A2K()
            r0 = 0
            r1.A00 = r0
            r0 = 1
            r1.A01 = r0
            X.9yv r2 = r1.A0I
            X.10I r1 = r2.A0N
            r0 = 21
            X.C21424Ajr.A00(r1, r2, r0)
            X.8Fv r0 = r5.A2L()
            X.9yn r2 = r0.A02
            java.util.concurrent.atomic.AtomicBoolean r0 = r2.A0D
            r1 = 1
            boolean r0 = r0.getAndSet(r1)
            if (r0 != 0) goto L_0x003f
            X.1DT r0 = r2.A01
            X.AnonymousClass3MY.A1M(r0, r1)
            X.10I r1 = r2.A0C
            r0 = 23
            X.C21424Ajr.A00(r1, r2, r0)
        L_0x003f:
            r0 = 10
            r3.setRequestedOrientation(r0)
            return
        L_0x0045:
            X.3d3 r0 = r5.A0X
            if (r0 == 0) goto L_0x0057
            boolean r0 = r0.isShowing()
            if (r0 != r1) goto L_0x0057
        L_0x004f:
            android.view.Window r0 = r3.getWindow()
            r0.setSoftInputMode(r4)
            goto L_0x0011
        L_0x0057:
            com.whatsapp.KeyboardPopupLayout r2 = r5.A0C
            if (r2 == 0) goto L_0x004f
            r1 = 27
            X.Ajr r0 = new X.Ajr
            r0.<init>(r5, r1)
            r2.post(r0)
            goto L_0x004f
        L_0x0066:
            android.view.Window r1 = r3.getWindow()
            r0 = 4
            r1.setSoftInputMode(r0)
            goto L_0x0011
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.biz.cart.view.fragment.CartFragment.A1u():void");
    }

    public void A1z(Bundle bundle) {
        String str;
        A2M().A01(774774619, "cart_view_tag", "CartFragment");
        super.A1z(bundle);
        C24671Lf r1 = this.A0Q;
        if (r1 != null) {
            r1.registerObserver(this.A1A);
            C191899nN r12 = this.A0P;
            if (r12 != null) {
                AnonymousClass00H r0 = this.A0s;
                if (r0 != null) {
                    this.A0O = C20005A2v.A00(r12, r0);
                    if (bundle == null) {
                        this.A12 = 2;
                        return;
                    }
                    this.A12 = bundle.getInt("extra_input_method");
                    this.A11 = bundle.getBoolean("extra_is_sending_order");
                    return;
                }
                str = "catalogOperationsImageLoadQplLogger";
            } else {
                str = "catalogMediaManager";
            }
        } else {
            str = "contactObservers";
        }
        C18070vi.A11(str);
        throw null;
    }

    public int A25() {
        return 2132083071;
    }
}
