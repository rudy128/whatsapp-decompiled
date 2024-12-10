package com.whatsapp.settings.chat.wallpaper;

import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass1BI;
import X.AnonymousClass1E7;
import X.AnonymousClass1FB;
import X.AnonymousClass1FY;
import X.AnonymousClass1LU;
import X.AnonymousClass1M9;
import X.AnonymousClass1VW;
import X.AnonymousClass1ZO;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3MY;
import X.AnonymousClass3MZ;
import X.AnonymousClass48o;
import X.AnonymousClass4SC;
import X.AnonymousClass4aW;
import X.AnonymousClass4aX;
import X.C003401n;
import X.C108875cR;
import X.C110885hR;
import X.C222219b;
import X.C24921Me;
import X.C27201Vd;
import X.C28281Zt;
import X.C37451pZ;
import X.C43421zm;
import X.C62762rw;
import X.C72463Mc;
import X.C72473Md;
import X.C72483Me;
import X.C88594aB;
import X.C90924er;
import X.C91034f2;
import X.C91264fP;
import android.content.Intent;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import com.whatsapp.TextEmojiLabel;

public class WallpaperCurrentPreviewActivity extends AnonymousClass1FY {
    public int A00;
    public View A01;
    public View A02;
    public View A03;
    public View A04;
    public View A05;
    public ViewGroup A06;
    public Button A07;
    public ImageView A08;
    public ImageView A09;
    public ImageView A0A;
    public ImageView A0B;
    public ImageView A0C;
    public SeekBar A0D;
    public TextView A0E;
    public TextEmojiLabel A0F;
    public AnonymousClass1VW A0G;
    public AnonymousClass1M9 A0H;
    public C24921Me A0I;
    public C37451pZ A0J;
    public C27201Vd A0K;
    public AnonymousClass1LU A0L;
    public AnonymousClass4SC A0M;
    public WallpaperImagePreview A0N;
    public WallpaperMockChatView A0O;
    public AnonymousClass4aW A0P;
    public C003401n A0Q;
    public boolean A0R;

    public WallpaperCurrentPreviewActivity() {
        this(0);
    }

    public int A31() {
        return 78318969;
    }

    private void A0Q(AnonymousClass1BI r3) {
        Integer num;
        this.A0M = this.A0P.A0E(this, r3);
        A03(this, getIntent(), this.A0M);
        Drawable A0B2 = this.A0P.A0B(this.A0M);
        if (A0B2 != null) {
            this.A0N.setImageDrawable(A0B2);
        }
        if (this.A0D.getVisibility() == 0) {
            AnonymousClass4SC r0 = this.A0M;
            int i = 0;
            if (!(r0 == null || (num = r0.A01) == null)) {
                i = num.intValue();
            }
            this.A0D.setProgress(i);
        }
    }

    public void A2y() {
        if (!this.A0R) {
            this.A0R = true;
            AnonymousClass10E A0L2 = C72473Md.A0L(this);
            C72483Me.A0q(A0L2, this);
            AnonymousClass10G r1 = A0L2.A00;
            AnonymousClass1FB.A0K(A0L2, r1, this, r1.A45);
            AnonymousClass1FB.A0L(A0L2, r1, this, r1.A5A);
            this.A0L = AnonymousClass3MY.A0Z(A0L2);
            this.A0K = AnonymousClass3MZ.A0i(A0L2);
            this.A0G = AnonymousClass3MZ.A0e(A0L2);
            this.A0H = AnonymousClass10E.A4z(A0L2);
            this.A0I = AnonymousClass3MZ.A0g(A0L2);
            this.A0P = (AnonymousClass4aW) r1.A5C.get();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000d, code lost:
        if (r4.A04 != false) goto L_0x000f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A03(android.app.Activity r2, android.content.Intent r3, X.AnonymousClass4SC r4) {
        /*
            X.1BI r0 = X.C88594aB.A04(r3)
            if (r0 == 0) goto L_0x0016
            if (r4 == 0) goto L_0x000f
            boolean r0 = r4.A04
            r1 = 2131898407(0x7f123027, float:1.943173E38)
            if (r0 == 0) goto L_0x0012
        L_0x000f:
            r1 = 2131898405(0x7f123025, float:1.9431727E38)
        L_0x0012:
            r2.setTitle(r1)
            return
        L_0x0016:
            boolean r0 = X.C28281Zt.A0B(r2)
            r1 = 2131898418(0x7f123032, float:1.9431753E38)
            if (r0 == 0) goto L_0x0012
            r1 = 2131898408(0x7f123028, float:1.9431733E38)
            goto L_0x0012
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.settings.chat.wallpaper.WallpaperCurrentPreviewActivity.A03(android.app.Activity, android.content.Intent, X.4SC):void");
    }

    public static void A0V(WallpaperCurrentPreviewActivity wallpaperCurrentPreviewActivity) {
        Point A002 = AnonymousClass4aW.A00(wallpaperCurrentPreviewActivity);
        AnonymousClass3MY.A1C(wallpaperCurrentPreviewActivity.A07, A002.y, 0, View.MeasureSpec.makeMeasureSpec(A002.x, 1073741824));
        AnonymousClass3MY.A1C(wallpaperCurrentPreviewActivity.A04, A002.y, 0, View.MeasureSpec.makeMeasureSpec(A002.x, 1073741824));
        boolean A0B2 = C28281Zt.A0B(wallpaperCurrentPreviewActivity);
        TextView textView = wallpaperCurrentPreviewActivity.A0E;
        int i = 2131898421;
        if (A0B2) {
            i = 2131898423;
        }
        textView.setText(i);
        int A003 = C62762rw.A00(wallpaperCurrentPreviewActivity);
        float min = Math.min(0.56f, ((float) (((A002.y - wallpaperCurrentPreviewActivity.A04.getMeasuredHeight()) - wallpaperCurrentPreviewActivity.A07.getMeasuredHeight()) - wallpaperCurrentPreviewActivity.getResources().getDimensionPixelSize(2131169302))) / ((float) (A002.y + A003)));
        Point A004 = AnonymousClass4aW.A00(wallpaperCurrentPreviewActivity);
        int min2 = (int) Math.min(wallpaperCurrentPreviewActivity.getResources().getDimension(2131165474), ((float) A004.x) * min);
        int i2 = (int) (((float) A004.y) * min);
        ViewGroup.LayoutParams layoutParams = wallpaperCurrentPreviewActivity.A05.getLayoutParams();
        int i3 = (int) (((float) wallpaperCurrentPreviewActivity.A00) * min);
        View A0A2 = C110885hR.A0A(wallpaperCurrentPreviewActivity, 2131436993);
        ViewGroup.LayoutParams layoutParams2 = A0A2.getLayoutParams();
        layoutParams2.height = i3;
        layoutParams2.width = min2;
        A0A2.setLayoutParams(layoutParams2);
        View A0A3 = C110885hR.A0A(wallpaperCurrentPreviewActivity, 2131429746);
        ViewGroup.LayoutParams layoutParams3 = A0A3.getLayoutParams();
        layoutParams3.height = i2;
        layoutParams3.width = min2;
        A0A3.setLayoutParams(layoutParams3);
        int i4 = i2 + layoutParams.height;
        View A0A4 = C110885hR.A0A(wallpaperCurrentPreviewActivity, 2131436990);
        ViewGroup.LayoutParams layoutParams4 = A0A4.getLayoutParams();
        layoutParams4.height = i4;
        layoutParams4.width = min2;
        A0A4.setLayoutParams(layoutParams4);
        ViewGroup.LayoutParams layoutParams5 = wallpaperCurrentPreviewActivity.A01.getLayoutParams();
        layoutParams5.width = min2;
        wallpaperCurrentPreviewActivity.A01.setLayoutParams(layoutParams5);
        AnonymousClass48o r1 = new AnonymousClass48o(wallpaperCurrentPreviewActivity, 46);
        wallpaperCurrentPreviewActivity.A01.setOnClickListener(r1);
        wallpaperCurrentPreviewActivity.A02.setOnClickListener(r1);
        wallpaperCurrentPreviewActivity.A06.setFocusable(false);
        wallpaperCurrentPreviewActivity.A06.setDescendantFocusability(393216);
        AnonymousClass1BI A032 = C88594aB.A03(wallpaperCurrentPreviewActivity);
        TextView textView2 = wallpaperCurrentPreviewActivity.A0E;
        if (A032 != null) {
            textView2.setVisibility(4);
        } else {
            textView2.setVisibility(0);
        }
        wallpaperCurrentPreviewActivity.A0Q(A032);
        ViewGroup.LayoutParams layoutParams6 = wallpaperCurrentPreviewActivity.A06.getLayoutParams();
        layoutParams6.height = Math.max(layoutParams6.height, wallpaperCurrentPreviewActivity.getResources().getDimensionPixelSize(2131169351));
        ViewGroup viewGroup = wallpaperCurrentPreviewActivity.A06;
        ViewGroup.LayoutParams layoutParams7 = viewGroup.getLayoutParams();
        AnonymousClass3MZ.A1G(viewGroup, layoutParams7, (float) layoutParams7.height, min);
        if (wallpaperCurrentPreviewActivity.A0O.getChildCount() == 0) {
            wallpaperCurrentPreviewActivity.A0O.setMessages(wallpaperCurrentPreviewActivity.getString(2131891602), wallpaperCurrentPreviewActivity.getString(2131891603), (C108875cR) null);
        }
        WallpaperMockChatView wallpaperMockChatView = wallpaperCurrentPreviewActivity.A0O;
        wallpaperMockChatView.A00.setVisibility(4);
        wallpaperMockChatView.A03.setVisibility(4);
        wallpaperMockChatView.A03.setMinLines(1);
        wallpaperMockChatView.A03.setMaxLines(1);
        wallpaperMockChatView.A02.setMinEms(5);
        AnonymousClass3MW.A1S(wallpaperMockChatView.A02);
        ViewGroup.MarginLayoutParams A0B3 = AnonymousClass3MW.A0B(wallpaperMockChatView.A02);
        A0B3.bottomMargin = wallpaperMockChatView.A03.getPaddingBottom() + wallpaperMockChatView.A04.getPaddingTop();
        wallpaperMockChatView.A02.setLayoutParams(A0B3);
        wallpaperMockChatView.A01.setVisibility(4);
        wallpaperMockChatView.A04.setVisibility(4);
        wallpaperMockChatView.A04.setMinLines(1);
        wallpaperMockChatView.A04.setMaxLines(1);
        wallpaperCurrentPreviewActivity.A0F.setTextSize(0, (float) ((int) (AnonymousClass3MW.A00(wallpaperCurrentPreviewActivity.getResources(), 2131166057) * min)));
        if (A032 == null) {
            wallpaperCurrentPreviewActivity.A0F.setText(2131898415);
            wallpaperCurrentPreviewActivity.A0G.A09(wallpaperCurrentPreviewActivity.A09, 2131231047);
        } else {
            AnonymousClass1E7 A0H2 = wallpaperCurrentPreviewActivity.A0H.A0H(A032);
            C37451pZ A082 = wallpaperCurrentPreviewActivity.A0K.A08("wallpaper-current-preview-contact-photo", -1.0f, (int) (AnonymousClass3MW.A00(wallpaperCurrentPreviewActivity.A09.getResources(), 2131168739) * min));
            wallpaperCurrentPreviewActivity.A0J = A082;
            A082.A07(wallpaperCurrentPreviewActivity.A09, A0H2);
            wallpaperCurrentPreviewActivity.A0F.setText(wallpaperCurrentPreviewActivity.A0I.A0I(A0H2));
        }
        boolean A0B4 = C28281Zt.A0B(wallpaperCurrentPreviewActivity);
        View view = wallpaperCurrentPreviewActivity.A03;
        if (!A0B4) {
            view.setVisibility(8);
            return;
        }
        view.setVisibility(0);
        wallpaperCurrentPreviewActivity.A0D.setThumb(new LayerDrawable(new Drawable[]{AnonymousClass3MX.A06(wallpaperCurrentPreviewActivity, 2131233601), AnonymousClass4aX.A03(wallpaperCurrentPreviewActivity, 2130971803, 2131102944, 2131231842)}));
        wallpaperCurrentPreviewActivity.A0D.setOnSeekBarChangeListener(new C90924er(wallpaperCurrentPreviewActivity));
    }

    public C222219b A33() {
        C222219b A33 = super.A33();
        C72483Me.A10(A33, this);
        return A33;
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 199 && i2 == -1) {
            A0Q(C88594aB.A03(this));
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(2131624125);
        AnonymousClass1ZO.A04((ViewGroup) C110885hR.A0A(this, 2131429504), new C91264fP(this, 15));
        AnonymousClass1ZO.A03(this);
        C003401n A0S = C72463Mc.A0S(this, (Toolbar) C110885hR.A0A(this, 2131436992));
        this.A0Q = A0S;
        A0S.A0W(true);
        A03(this, getIntent(), this.A0M);
        View A0A2 = C110885hR.A0A(this, 2131428960);
        this.A01 = A0A2;
        AnonymousClass48o.A00(A0A2, this, 45);
        C43421zm.A04(AnonymousClass3MW.A0I(this, 2131436974));
        this.A00 = C62762rw.A00(this);
        this.A03 = C110885hR.A0A(this, 2131436972);
        this.A0D = (SeekBar) C110885hR.A0A(this, 2131436973);
        this.A04 = C110885hR.A0A(this, 2131436972);
        this.A07 = (Button) C110885hR.A0A(this, 2131428960);
        this.A0A = (ImageView) C110885hR.A0A(this, 2131430328);
        this.A0B = (ImageView) C110885hR.A0A(this, 2131431645);
        this.A08 = (ImageView) C110885hR.A0A(this, 2131428782);
        this.A0C = (ImageView) C110885hR.A0A(this, 2131436880);
        this.A0E = AnonymousClass3MW.A0I(this, 2131436971);
        this.A06 = (ViewGroup) C110885hR.A0A(this, 2131436064);
        this.A0N = (WallpaperImagePreview) C110885hR.A0A(this, 2131429745);
        this.A09 = (ImageView) C110885hR.A0A(this, 2131429559);
        this.A06 = (ViewGroup) C110885hR.A0A(this, 2131431654);
        this.A02 = C110885hR.A0A(this, 2131429746);
        this.A01 = C110885hR.A0A(this, 2131428960);
        this.A05 = C110885hR.A0A(this, 2131436993);
        this.A0O = (WallpaperMockChatView) C110885hR.A0A(this, 2131436984);
        this.A0F = (TextEmojiLabel) C110885hR.A0A(this, 2131429556);
        A0V(this);
        C110885hR.A0A(this, 2131429556).setImportantForAccessibility(2);
        C110885hR.A0A(this, 2131430328).setImportantForAccessibility(2);
        C110885hR.A0A(this, 2131430490).setImportantForAccessibility(2);
        C110885hR.A0A(this, 2131431645).setImportantForAccessibility(2);
        C110885hR.A0A(this, 2131428782).setImportantForAccessibility(2);
        C110885hR.A0A(this, 2131436880).setImportantForAccessibility(2);
        ((WallpaperMockChatView) C110885hR.A0A(this, 2131436984)).A07.setImportantForAccessibility(2);
        this.A06.setPadding(0, 0, 0, 0);
        int dimensionPixelSize = getResources().getDimensionPixelSize(2131169535);
        this.A0A.setPadding(0, dimensionPixelSize, 0, dimensionPixelSize);
        this.A0B.setPadding(0, dimensionPixelSize, 0, dimensionPixelSize);
        this.A08.setPadding(0, dimensionPixelSize, 0, dimensionPixelSize);
        ViewGroup.LayoutParams layoutParams = this.A0B.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ((ViewGroup.MarginLayoutParams) layoutParams).setMargins(0, 0, 0, 0);
        }
        this.A0C.setImageResource(2131232098);
        A39(this.A00, this.A05);
    }

    public void onDestroy() {
        super.onDestroy();
        C37451pZ r0 = this.A0J;
        if (r0 != null) {
            r0.A02();
        }
    }

    public WallpaperCurrentPreviewActivity(int i) {
        this.A0R = false;
        C91034f2.A00(this, 39);
    }
}
