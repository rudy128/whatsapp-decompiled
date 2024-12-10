package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import java.util.List;

/* renamed from: X.3XO  reason: invalid class name */
public class AnonymousClass3XO extends C38391rD implements Filterable {
    public int A00;
    public int A01 = -1;
    public int A02;
    public C98884rs A03;
    public String A04 = "";
    public List A05 = AnonymousClass000.A13();
    public List A06 = AnonymousClass000.A13();
    public boolean A07;
    public AnonymousClass3P3 A08;
    public final int A09;
    public final int A0A;
    public final AnonymousClass1KB A0B;
    public final AnonymousClass11S A0C;
    public final C72043Kk A0D;
    public final C24921Me A0E;
    public final C37451pZ A0F;
    public final AnonymousClass11P A0G;
    public final C18000vb A0H;
    public final AnonymousClass1BI A0I;
    public final AnonymousClass5Y5 A0J;
    public final C32091gc A0K;
    public final AnonymousClass00H A0L;
    public final boolean A0M;
    public final C18030ve A0N;

    public int A0Q() {
        return this.A06.size();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v1, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v2, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v3, resolved type: android.text.SpannableStringBuilder} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v9, resolved type: android.text.SpannableStringBuilder} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v10, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v11, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v4, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v5, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v6, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v12, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void Bmc(X.C42011xT r30, int r31) {
        /*
            r29 = this;
            r8 = r30
            boolean r0 = r8 instanceof X.AnonymousClass3ZS
            r10 = r31
            if (r0 == 0) goto L_0x024b
            X.3ZS r8 = (X.AnonymousClass3ZS) r8
            X.3XO r7 = r8.A07
            java.util.List r0 = r7.A06
            java.lang.Object r9 = r0.get(r10)
            X.4Mh r9 = (X.C85154Mh) r9
            java.lang.Object r6 = r9.A01
            X.C17960vV.A07(r6)
            com.whatsapp.TextEmojiLabel r5 = r8.A02
            android.text.TextUtils$TruncateAt r0 = android.text.TextUtils.TruncateAt.END
            r5.setEllipsize(r0)
            X.1E7 r6 = (X.AnonymousClass1E7) r6
            X.1BI r0 = r7.A0I
            X.1EC r21 = X.AnonymousClass3MW.A0i(r0)
            X.1gc r1 = r7.A0K
            r0 = r21
            X.1yg r20 = r1.A01(r6, r0)
            r0 = r20
            java.lang.String r0 = r0.A01
            r19 = r0
            X.C17960vV.A07(r19)
            X.1xh r11 = r8.A04
            java.lang.String r1 = r7.A04
            r4 = r0
            java.lang.String r0 = r19.toLowerCase()
            int r3 = r0.indexOf(r1)
            int r2 = r1.length()
            if (r2 <= 0) goto L_0x005e
            if (r3 < 0) goto L_0x005e
            android.text.SpannableStringBuilder r4 = X.AnonymousClass3MW.A09(r19)
            r0 = 1
            android.text.style.StyleSpan r1 = new android.text.style.StyleSpan
            r1.<init>(r0)
            int r2 = r2 + r3
            r0 = 33
            r4.setSpan(r1, r3, r2, r0)
        L_0x005e:
            r0 = 0
            r11.A0B(r0, r4)
            boolean r0 = r6.A0P()
            r11.A03(r0)
            r0 = r20
            java.lang.Integer r0 = r0.A00
            r28 = r0
            java.lang.Integer r18 = X.AnonymousClass00R.A0Y
            r1 = r0
            r0 = r18
            if (r1 != r0) goto L_0x007f
            X.1Me r1 = r7.A0E
            r0 = 2131898920(0x7f123228, float:1.9432771E38)
            java.lang.String r19 = X.C24921Me.A03(r1, r6, r0)
        L_0x007f:
            X.1pZ r15 = r7.A0F
            com.whatsapp.components.button.ThumbnailButton r1 = r8.A05
            r15.A07(r1, r6)
            boolean r0 = r6.A0F()
            r13 = 8
            r11 = 0
            if (r0 == 0) goto L_0x0241
            r1.setVisibility(r13)
            X.1bI r0 = r8.A06
            r22 = r0
            android.view.View r14 = r22.A02()
            com.whatsapp.community.SubgroupWithParentView r14 = (com.whatsapp.community.SubgroupWithParentView) r14
            android.content.Context r17 = r14.getContext()
            android.content.res.Resources r1 = r14.getResources()
            r0 = 2131166003(0x7f070333, float:1.794624E38)
            int r0 = r1.getDimensionPixelSize(r0)
            r14.A00 = r0
            android.widget.FrameLayout$LayoutParams r1 = new android.widget.FrameLayout$LayoutParams
            r1.<init>(r0, r0)
            com.whatsapp.WaImageView r0 = r14.A01
            r0.setLayoutParams(r1)
            android.content.res.Resources r1 = r17.getResources()
            r0 = 2131166012(0x7f07033c, float:1.7946257E38)
            int r0 = r1.getDimensionPixelSize(r0)
            android.widget.FrameLayout$LayoutParams r1 = new android.widget.FrameLayout$LayoutParams
            r1.<init>(r0, r0)
            r0 = 8388693(0x800055, float:1.1755063E-38)
            r1.gravity = r0
            com.whatsapp.components.button.ThumbnailButton r12 = r14.A02
            r12.setLayoutParams(r1)
            android.view.ViewGroup$MarginLayoutParams r4 = X.AnonymousClass3MW.A0B(r12)
            android.content.res.Resources r0 = r12.getResources()
            r1 = 2131166009(0x7f070339, float:1.7946251E38)
            int r3 = r0.getDimensionPixelSize(r1)
            android.content.res.Resources r0 = r12.getResources()
            r1 = 2131166011(0x7f07033b, float:1.7946255E38)
            int r2 = r0.getDimensionPixelSize(r1)
            android.content.res.Resources r0 = r12.getResources()
            r1 = 2131166010(0x7f07033a, float:1.7946253E38)
            int r16 = r0.getDimensionPixelSize(r1)
            android.content.res.Resources r0 = r12.getResources()
            r1 = 2131166008(0x7f070338, float:1.794625E38)
            int r0 = r0.getDimensionPixelSize(r1)
            r1 = r16
            r4.setMargins(r3, r2, r1, r0)
            r12.setLayoutParams(r4)
            android.content.res.Resources r1 = r17.getResources()
            r0 = 2131166007(0x7f070337, float:1.7946247E38)
            float r0 = X.AnonymousClass3MW.A00(r1, r0)
            r12.A00 = r0
            android.content.Context r2 = r12.getContext()
            r1 = 2130970495(0x7f04077f, float:1.7549702E38)
            r0 = 2131101860(0x7f0608a4, float:1.7816142E38)
            int r0 = X.AnonymousClass1YL.A00(r2, r1, r0)
            r14.setSubgroupProfilePhotoBorderColor(r0)
            boolean r0 = r7.A0M
            if (r0 == 0) goto L_0x013c
            android.content.Context r2 = r14.getContext()
            r1 = 2130970496(0x7f040780, float:1.7549704E38)
            r0 = 2131101861(0x7f0608a5, float:1.7816144E38)
            int r0 = X.AnonymousClass1YL.A00(r2, r1, r0)
            r14.setSubgroupProfilePhotoBorderColor(r0)
        L_0x013c:
            r0 = 2
            r14.setSubgroupProfilePhoto(r6, r0, r15)
            r0 = r22
            r0.A04(r11)
        L_0x0145:
            android.widget.FrameLayout r1 = r8.A01
            r27 = 21
            X.78E r0 = new X.78E
            r22 = r0
            r23 = r8
            r24 = r6
            r25 = r20
            r26 = r9
            r22.<init>(r23, r24, r25, r26, r27)
            r1.setOnClickListener(r0)
            android.view.View r2 = r8.A00
            android.view.ViewGroup$MarginLayoutParams r3 = X.AnonymousClass3MW.A0B(r2)
            int r0 = r7.A01
            if (r10 != r0) goto L_0x023a
            r3.setMarginStart(r11)
        L_0x0168:
            int r0 = r7.A09
            r2.setBackgroundColor(r0)
            r2.setLayoutParams(r3)
            boolean r0 = r7.A07
            if (r0 == 0) goto L_0x017f
            java.util.List r0 = r7.A06
            int r0 = X.AnonymousClass3MX.A01(r0)
            if (r10 != r0) goto L_0x0235
            r2.setVisibility(r13)
        L_0x017f:
            X.1Me r3 = r7.A0E
            r0 = r21
            int r2 = r3.A08(r6, r0)
            r0 = r28
            X.1yg r12 = r3.A0G(r6, r0, r2)
            java.lang.String r10 = r12.A01
            r4 = r10
            if (r10 != 0) goto L_0x0194
            java.lang.String r4 = ""
        L_0x0194:
            int r0 = r9.A00
            if (r0 != r13) goto L_0x01f5
            X.00H r0 = r7.A0L
            java.lang.Object r2 = r0.get()
            X.1Pk r2 = (X.C25731Pk) r2
            X.00H r0 = r2.A03
            java.lang.Object r0 = r0.get()
            X.73d r0 = (X.C1408073d) r0
            X.00H r0 = r0.A01
            java.lang.Object r0 = r0.get()
            X.1rq r0 = (X.C38761rq) r0
            boolean r0 = r0.A02()
            if (r0 != 0) goto L_0x0231
            X.118 r2 = r2.A02
            r0 = 2131887308(0x7f1204cc, float:1.940922E38)
            java.lang.String r0 = r2.A01(r0)
            if (r0 == 0) goto L_0x0231
            r5.setText(r0)
            r5.setVisibility(r11)
            r4 = r0
        L_0x01c8:
            com.whatsapp.TextEmojiLabel r3 = r8.A03
            if (r3 == 0) goto L_0x01df
            X.11P r2 = r7.A0G
            android.content.Context r0 = r3.getContext()
            java.lang.String r2 = X.AnonymousClass72Y.A01(r0, r2, r6)
            boolean r0 = X.AnonymousClass1EG.A0H(r2)
            if (r0 != 0) goto L_0x01df
            r3.setText(r2)
        L_0x01df:
            android.content.Context r5 = r1.getContext()
            r3 = 2131891981(0x7f12170d, float:1.9418697E38)
            r0 = r19
            java.lang.Object[] r2 = X.AnonymousClass3MX.A1b(r0, r11)
            r0 = 1
            java.lang.String r0 = X.C17880vN.A0q(r5, r4, r2, r0, r3)
            r1.setContentDescription(r0)
        L_0x01f4:
            return
        L_0x01f5:
            boolean r0 = android.text.TextUtils.isEmpty(r10)
            if (r0 != 0) goto L_0x0231
            java.lang.String r2 = r7.A04
            java.lang.String r0 = r10.toLowerCase()
            int r13 = r0.indexOf(r2)
            int r9 = r2.length()
            if (r9 <= 0) goto L_0x021d
            if (r13 < 0) goto L_0x021d
            android.text.SpannableStringBuilder r10 = X.AnonymousClass3MW.A09(r10)
            r0 = 1
            android.text.style.StyleSpan r2 = new android.text.style.StyleSpan
            r2.<init>(r0)
            int r9 = r9 + r13
            r0 = 33
            r10.setSpan(r2, r13, r9, r0)
        L_0x021d:
            r5.setText(r10)
            r5.setVisibility(r11)
            java.lang.Integer r2 = r12.A00
            r0 = r18
            if (r2 != r0) goto L_0x01c8
            r0 = 2131898920(0x7f123228, float:1.9432771E38)
            java.lang.String r4 = X.C24921Me.A03(r3, r6, r0)
            goto L_0x01c8
        L_0x0231:
            r5.setVisibility(r13)
            goto L_0x01c8
        L_0x0235:
            r2.setVisibility(r11)
            goto L_0x017f
        L_0x023a:
            int r0 = r7.A0A
            r3.setMarginStart(r0)
            goto L_0x0168
        L_0x0241:
            r1.setVisibility(r11)
            X.1bI r0 = r8.A06
            r0.A04(r13)
            goto L_0x0145
        L_0x024b:
            boolean r0 = r8 instanceof X.AnonymousClass3ZC
            if (r0 == 0) goto L_0x01f4
            X.3ZC r8 = (X.AnonymousClass3ZC) r8
            android.widget.TextView r1 = r8.A01
            X.3XO r0 = r8.A02
            java.util.List r0 = r0.A06
            java.lang.Object r0 = r0.get(r10)
            X.4Mh r0 = (X.C85154Mh) r0
            java.lang.Object r0 = r0.A01
            int r0 = X.AnonymousClass000.A0M(r0)
            r1.setText(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3XO.Bmc(X.1xT, int):void");
    }

    public Filter getFilter() {
        AnonymousClass3P3 r0 = this.A08;
        if (r0 != null) {
            return r0;
        }
        AnonymousClass3P3 r02 = new AnonymousClass3P3(this);
        this.A08 = r02;
        return r02;
    }

    public int getItemViewType(int i) {
        if (i < 0 || i >= this.A06.size()) {
            return 1;
        }
        return ((C85154Mh) this.A06.get(i)).A00;
    }

    public AnonymousClass3XO(Context context, AnonymousClass1KB r4, AnonymousClass11S r5, C72043Kk r6, C24921Me r7, C27201Vd r8, AnonymousClass11P r9, C18000vb r10, C18030ve r11, AnonymousClass1BI r12, AnonymousClass5Y5 r13, C32091gc r14, AnonymousClass00H r15, boolean z, boolean z2) {
        int i;
        int i2;
        this.A0G = r9;
        this.A0N = r11;
        this.A0K = r14;
        this.A0B = r4;
        this.A0C = r5;
        this.A0E = r7;
        this.A0H = r10;
        this.A0L = r15;
        this.A0D = r6;
        this.A0F = r8.A05(context, "mentions-adapter");
        this.A0J = r13;
        this.A0I = r12;
        this.A0M = z;
        if (z) {
            this.A00 = AnonymousClass3Ma.A00(context, 2130970498, 2131101864);
            this.A02 = C19740yt.A00(context, 2131101865);
            i = 2130970494;
            i2 = 2131101859;
        } else {
            this.A00 = AnonymousClass3Ma.A00(context, 2130970343, 2131101314);
            this.A02 = AnonymousClass3Ma.A00(context, 2130970338, 2131101307);
            i = 2130969386;
            i2 = 2131100378;
        }
        this.A09 = AnonymousClass3Ma.A00(context, i, i2);
        this.A0A = AnonymousClass3MW.A01(context.getResources(), 2131167709);
        this.A07 = z2;
    }

    public C42011xT BqY(ViewGroup viewGroup, int i) {
        int i2;
        Context context = viewGroup.getContext();
        LayoutInflater from = LayoutInflater.from(context);
        if (i != 1) {
            if (i != 2) {
                if (i == 4) {
                    return new AnonymousClass3ZC((LinearLayout) from.inflate(2131626011, viewGroup, false), this);
                }
                if (i != 8) {
                    if (i == 16) {
                        i2 = 2131626014;
                        return new AnonymousClass3ZS((FrameLayout) from.inflate(i2, viewGroup, false), this);
                    }
                }
            }
            i2 = 2131626013;
            return new AnonymousClass3ZS((FrameLayout) from.inflate(i2, viewGroup, false), this);
        }
        List list = C42011xT.A0I;
        View view = new View(context);
        C18070vi.A0d(view, 1);
        return new C42011xT(view);
    }
}
