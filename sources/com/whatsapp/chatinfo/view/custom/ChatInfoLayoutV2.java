package com.whatsapp.chatinfo.view.custom;

import X.AnonymousClass112;
import X.AnonymousClass12Q;
import X.AnonymousClass17O;
import X.AnonymousClass1HF;
import X.AnonymousClass1L9;
import X.AnonymousClass1VW;
import X.AnonymousClass1YL;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.C139106yE;
import X.C17890vO;
import X.C19740yt;
import X.C201911e;
import X.C28281Zt;
import X.C72463Mc;
import X.C76733o2;
import X.C76773oE;
import X.C90584eJ;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Color;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.whatsapp.wds.components.profilephoto.WDSProfilePhoto;

public class ChatInfoLayoutV2 extends C76773oE {
    public float A00;
    public int A01 = 0;
    public ImageView A02;
    public ImageView A03;
    public CollapsingProfilePhotoView A04;
    public AnonymousClass1VW A05;
    public boolean A06 = true;
    public int A07 = 0;
    public C139106yE A08;
    public final Handler A09 = C17890vO.A0D();
    public final C201911e A0A = AnonymousClass12Q.A00(AnonymousClass17O.class);

    public static void A01(ChatInfoLayoutV2 chatInfoLayoutV2) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) chatInfoLayoutV2.A0I.getLayoutParams();
        int i = 80;
        if (chatInfoLayoutV2.getWidth() >= chatInfoLayoutV2.getHeight()) {
            i = 17;
        }
        layoutParams.gravity = i;
        chatInfoLayoutV2.A0I.setLayoutParams(layoutParams);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0012, code lost:
        if (r1 == null) goto L_0x0014;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A02(com.whatsapp.chatinfo.view.custom.ChatInfoLayoutV2 r5) {
        /*
            X.6yE r4 = r5.A08
            com.whatsapp.chatinfo.view.custom.CollapsingProfilePhotoView r2 = r5.A04
            boolean r0 = r5.A06
            r3 = 1
            if (r0 == 0) goto L_0x0014
            android.widget.ImageView r0 = r5.A02
            if (r0 == 0) goto L_0x0014
            android.graphics.drawable.Drawable r1 = r0.getDrawable()
            r0 = 1
            if (r1 != 0) goto L_0x0015
        L_0x0014:
            r0 = 0
        L_0x0015:
            r2.setHaloEnabled(r0)
            if (r4 == 0) goto L_0x003d
            boolean r0 = r4.A01()
            if (r0 == 0) goto L_0x003d
            boolean r0 = r5.A06
            if (r0 == 0) goto L_0x003d
            android.widget.ImageView r2 = r5.A03
            com.whatsapp.wds.components.profilephoto.WDSProfilePhoto r2 = (com.whatsapp.wds.components.profilephoto.WDSProfilePhoto) r2
            r2.setStatusIndicatorEnabled(r3)
            int r0 = r4.A01
            if (r0 <= 0) goto L_0x003a
            X.1sh r1 = X.C39211sh.UNSEEN
        L_0x0031:
            X.1sj r0 = new X.1sj
            r0.<init>(r1)
            r2.setProfileStatus(r0)
        L_0x0039:
            return
        L_0x003a:
            X.1sh r1 = X.C39211sh.SEEN_80_ALPHA
            goto L_0x0031
        L_0x003d:
            android.widget.ImageView r1 = r5.A03
            boolean r0 = r1 instanceof com.whatsapp.wds.components.profilephoto.WDSProfilePhoto
            if (r0 == 0) goto L_0x0039
            com.whatsapp.wds.components.profilephoto.WDSProfilePhoto r1 = (com.whatsapp.wds.components.profilephoto.WDSProfilePhoto) r1
            r0 = 0
            r1.setStatusIndicatorEnabled(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.chatinfo.view.custom.ChatInfoLayoutV2.A02(com.whatsapp.chatinfo.view.custom.ChatInfoLayoutV2):void");
    }

    public void setStatusData(C139106yE r1) {
        this.A08 = r1;
        A02(this);
    }

    public ChatInfoLayoutV2(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    private ImageView getProfilePhotoImage() {
        CollapsingProfilePhotoView collapsingProfilePhotoView = (CollapsingProfilePhotoView) AnonymousClass1HF.A06(this, 2131429179);
        this.A04 = collapsingProfilePhotoView;
        WDSProfilePhoto wDSProfilePhoto = collapsingProfilePhotoView.A09;
        collapsingProfilePhotoView.A00 = (float) (this.A07 - (this.A01 * 2));
        collapsingProfilePhotoView.A02(this.A04, this.A03);
        return wDSProfilePhoto;
    }

    public int A08(int i) {
        return AnonymousClass3MX.A00(getResources(), 2131168777, getResources().getDimensionPixelSize(2131165849));
    }

    public void A09() {
        super.A09();
        this.A0P.setVisibility(0);
        A01(this);
    }

    public void A0A() {
        super.A0A();
        this.A01 = getResources().getDimensionPixelSize(2131165565);
        this.A07 = getResources().getConfiguration().orientation;
        this.A02 = AnonymousClass3MW.A0G(this, 2131433831);
        this.A03 = getProfilePhotoImage();
    }

    public void A0F(int i, int i2) {
        super.A0F(i, i2);
        CollapsingProfilePhotoView collapsingProfilePhotoView = this.A04;
        collapsingProfilePhotoView.A00 = (float) (this.A07 - (this.A01 * 2));
        collapsingProfilePhotoView.A02(this.A04, this.A03);
    }

    public void A0I() {
        int i;
        if (getContext() instanceof C76733o2) {
            C76733o2 r3 = (C76733o2) AnonymousClass1L9.A01(getContext(), C76733o2.class);
            View view = r3.A01;
            if (view != null && view.getVisibility() == 0) {
                i = C19740yt.A00(r3, r3.A0D.getBackgroundColorRes());
            } else if (((int) (this.A00 * 255.0f)) > 0) {
                i = this.A05;
            } else if (AnonymousClass112.A01()) {
                C72463Mc.A0t(r3);
                return;
            } else {
                C28281Zt.A05(r3, AnonymousClass1YL.A00(r3, 2130970603, 2131101963));
                return;
            }
            r3.getWindow().setStatusBarColor(i);
            if (Color.alpha(i) == 255) {
                C28281Zt.A0A(r3.getWindow(), AnonymousClass1YL.A02(i));
            }
        }
    }

    public int getToolbarColorResId() {
        return AnonymousClass1YL.A00(getContext(), 2130971620, 2131102722);
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        int i = this.A07;
        int i2 = configuration.orientation;
        if (i != i2) {
            this.A07 = i2;
            CollapsingProfilePhotoView collapsingProfilePhotoView = this.A04;
            C90584eJ.A00(collapsingProfilePhotoView.A09.getViewTreeObserver(), collapsingProfilePhotoView, 11);
            this.A06 = true;
            A02(this);
        }
        A0D();
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ((AnonymousClass17O) this.A0A.get()).A00();
        this.A09.removeCallbacksAndMessages((Object) null);
    }

    public void setOnPhotoClickListener(View.OnClickListener onClickListener) {
        this.A0A = onClickListener;
    }

    public void setRadius(float f) {
        this.A00 = f;
    }

    public ChatInfoLayoutV2(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A05();
    }

    public ChatInfoLayoutV2(Context context) {
        super(context);
        A05();
    }
}
