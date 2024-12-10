package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.whatsapp.stickers.StickerView;
import com.whatsapp.wds.components.button.WDSButton;

/* renamed from: X.73a  reason: invalid class name and case insensitive filesystem */
public class C1407773a {
    public static final int A0V;
    public static final int A0W;
    public AnonymousClass21V A00;
    public boolean A01;
    public boolean A02;
    public final View.OnClickListener A03 = new C825048f(this, 19);
    public final View A04;
    public final View A05;
    public final AnonymousClass1KB A06;
    public final C34531kd A07;
    public final C33251iW A08;
    public final C219217x A09;
    public final C19830z4 A0A;
    public final C32861hs A0B;
    public final C32431hB A0C;
    public final AnonymousClass70H A0D;
    public final StickerView A0E;
    public final AnonymousClass3M2 A0F = new AnonymousClass7NE(this, 1);
    public final C32021gV A0G;
    public final C28931bI A0H;
    public final C28931bI A0I;
    public final WDSButton A0J;
    public final AnonymousClass00H A0K;
    public final Runnable A0L;
    public final C18000vb A0M;
    public final C18030ve A0N;
    public final C26631Sw A0O;
    public final C50522Ut A0P;
    public final C38471rL A0Q = new C825048f(this, 16);
    public final C38471rL A0R = new C825048f(this, 17);
    public final C38471rL A0S = new C825048f(this, 18);
    public final AnonymousClass10I A0T;
    public final AnonymousClass00H A0U;

    public void A06(AnonymousClass4LJ r10, C441322g r11, boolean z) {
        C441322g r5 = r11;
        this.A00 = r11;
        View view = this.A05;
        AnonymousClass205 r3 = r11.A0v;
        view.setTag(r3);
        boolean z2 = z;
        if (z) {
            this.A0E.setImageDrawable((Drawable) null);
        }
        C1418377d r1 = r11.A00;
        if (r1 == null || r1.A04 == null || r1.A0F == null) {
            AnonymousClass10I r2 = this.A0T;
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append(r3.A01);
            r2.CGL(new AnonymousClass7RT(this, r5, r10, 19, z2), AnonymousClass000.A0y("stickerRetriever", A10));
            return;
        }
        A01(this, r11, r1, z);
    }

    static {
        boolean z = AnonymousClass73J.A00;
        int i = 7;
        int i2 = 1;
        if (z) {
            i2 = 7;
        }
        A0V = i2;
        if (!z) {
            i = 3;
        }
        A0W = i;
    }

    public static void A00(View.OnClickListener onClickListener, C1407773a r2) {
        if (r2.A0L == null) {
            r2.A0E.setOnClickListener(onClickListener);
        } else {
            r2.A0E.setOnTouchListener((View.OnTouchListener) r2.A0U.get());
        }
    }

    public static void A02(C1407773a r7, C441322g r8, boolean z) {
        C441322g r3 = r8;
        if (!r7.A01 || z) {
            r7.A01 = false;
            r7.A0G.A0D(r7.A0E, r8, r7.A0F);
            return;
        }
        r7.A01 = false;
        r7.A0G.A0G(r7.A0E, r3, r7.A0F, r8.A0v, false);
    }

    public void A03() {
        C38471rL r0;
        AnonymousClass21V r1 = this.A00;
        if (!r1.A0v.A02 || AnonymousClass4H3.A00(r1)) {
            View view = this.A04;
            view.setVisibility(0);
            C28931bI r4 = this.A0I;
            C28931bI r5 = this.A0H;
            WDSButton wDSButton = this.A0J;
            AnonymousClass3uL.A0P(view, wDSButton, r4, r5, false, false);
            boolean z = this.A00.A0v.A02;
            StickerView stickerView = this.A0E;
            Context context = stickerView.getContext();
            if (z) {
                AnonymousClass3MY.A0w(context, stickerView, 2131895332);
                wDSButton.setText(2131895332);
                wDSButton.setCompoundDrawablesWithIntrinsicBounds(2131232382, 0, 0, 0);
                r0 = this.A0S;
            } else {
                AnonymousClass3MY.A0w(context, stickerView, 2131887592);
                wDSButton.setText(AnonymousClass25A.A0C(this.A0M, this.A00.A01));
                wDSButton.setCompoundDrawablesWithIntrinsicBounds(2131231868, 0, 0, 0);
                r0 = this.A0R;
            }
            wDSButton.setOnClickListener(r0);
        } else {
            this.A04.setVisibility(8);
            r0 = new C825048f(this, 20);
        }
        A00(r0, this);
    }

    public void A04() {
        boolean z = this.A00.A0v.A02;
        View view = this.A04;
        if (!z) {
            view.setVisibility(0);
            C28931bI r4 = this.A0I;
            C28931bI r5 = this.A0H;
            WDSButton wDSButton = this.A0J;
            AnonymousClass3uL.A0P(view, wDSButton, r4, r5, true, false);
            StickerView stickerView = this.A0E;
            AnonymousClass3MY.A0w(stickerView.getContext(), stickerView, 2131891256);
            C38471rL r0 = this.A0Q;
            wDSButton.setOnClickListener(r0);
            r4.A05(r0);
        } else {
            view.setVisibility(8);
        }
        StickerView stickerView2 = this.A0E;
        stickerView2.setOnClickListener((View.OnClickListener) null);
        stickerView2.setOnTouchListener((View.OnTouchListener) null);
    }

    public void A05() {
        View view = this.A04;
        view.setVisibility(8);
        C28931bI r3 = this.A0I;
        C28931bI r4 = this.A0H;
        WDSButton wDSButton = this.A0J;
        AnonymousClass3uL.A0P(view, wDSButton, r3, r4, false, false);
        wDSButton.setOnClickListener((View.OnClickListener) null);
        A00(this.A03, this);
    }

    public C1407773a(View view, AnonymousClass1KB r5, C34531kd r6, C33251iW r7, C219217x r8, C19830z4 r9, C18000vb r10, C18030ve r11, C32861hs r12, C32431hB r13, AnonymousClass70H r14, C26631Sw r15, C50522Ut r16, C32021gV r17, AnonymousClass10I r18, AnonymousClass00H r19, Runnable runnable) {
        this.A05 = view;
        this.A0E = (StickerView) view.findViewById(2131435733);
        C28931bI A002 = C28931bI.A00(view, 2131434181);
        this.A0I = A002;
        this.A0P = r16;
        A002.A07(new C98244qo(9));
        this.A0H = C28931bI.A00(view, 2131428820);
        this.A04 = view.findViewById(2131429544);
        this.A0J = AnonymousClass3MW.A0r(view, 2131429541);
        this.A0N = r11;
        this.A0O = r15;
        this.A07 = r6;
        this.A06 = r5;
        this.A0K = r19;
        this.A0T = r18;
        this.A08 = r7;
        this.A0D = r14;
        this.A0M = r10;
        this.A0G = r17;
        this.A09 = r8;
        this.A0A = r9;
        this.A0C = r13;
        this.A0B = r12;
        this.A0L = runnable;
        this.A0U = C18150vq.A01(new C147087Rt(this, 2));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0071, code lost:
        if (r6 != null) goto L_0x0030;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A01(X.C1407773a r13, X.C441322g r14, X.C1418377d r15, boolean r16) {
        /*
            X.2rc r2 = X.AnonymousClass206.A00(r14)
            r1 = r13
            com.whatsapp.stickers.StickerView r7 = r13.A0E
            android.content.res.Resources r4 = X.AnonymousClass000.A0Y(r7)
            r0 = 2131166307(0x7f070463, float:1.7946856E38)
            int r10 = r4.getDimensionPixelSize(r0)
            r0 = 0
            r7.setOnClickListener(r0)
            r7.setOnTouchListener(r0)
            r8 = r15
            java.lang.String r0 = r15.A0B
            if (r0 == 0) goto L_0x003a
            X.73B r6 = r15.A04
            X.0ve r5 = r13.A0N
            r4 = 1396(0x574, float:1.956E-42)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r5, r4)
            if (r0 == 0) goto L_0x0071
            if (r6 == 0) goto L_0x003a
            r14.A05 = r6
        L_0x0030:
            X.737[] r0 = r6.A0H
            if (r0 == 0) goto L_0x003a
            java.lang.String r0 = X.C137426vR.A00(r0)
            r15.A09 = r0
        L_0x003a:
            android.content.Context r0 = r7.getContext()
            X.C108955ca.A1B(r0, r7, r15)
            java.lang.String r0 = r15.A0F
            r4 = r16
            if (r0 == 0) goto L_0x006d
            java.io.File r0 = r2.A0G
            if (r0 != 0) goto L_0x0051
            java.lang.String r0 = r14.A19()
            if (r0 == 0) goto L_0x006d
        L_0x0051:
            X.1Sw r0 = r13.A0O
            X.7MO r9 = new X.7MO
            r9.<init>(r2, r13, r14, r4)
            r12 = 1
            r13 = 0
            X.2my r6 = new X.2my
            r16 = r13
            r11 = r10
            r14 = r12
            r15 = r13
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            r0.A06(r6)
        L_0x0067:
            android.view.View r0 = r1.A05
            r0.invalidate()
            return
        L_0x006d:
            A02(r13, r14, r4)
            goto L_0x0067
        L_0x0071:
            if (r6 == 0) goto L_0x003a
            goto L_0x0030
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1407773a.A01(X.73a, X.22g, X.77d, boolean):void");
    }
}
