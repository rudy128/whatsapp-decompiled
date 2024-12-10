package com.whatsapp.textstatuscomposer.bottombar;

import X.AnonymousClass009;
import X.AnonymousClass00H;
import X.AnonymousClass031;
import X.AnonymousClass033;
import X.AnonymousClass10E;
import X.AnonymousClass11C;
import X.AnonymousClass1K1;
import X.AnonymousClass3MW;
import X.AnonymousClass3Ma;
import X.AnonymousClass78P;
import X.AnonymousClass860;
import X.AnonymousClass88X;
import X.AnonymousClass8AJ;
import X.C000200d;
import X.C108955ca;
import X.C132026m3;
import X.C132536my;
import X.C1421978n;
import X.C18000vb;
import X.C18070vi;
import X.C27691Xc;
import X.C43171zN;
import X.C43191zP;
import X.C62762rw;
import X.C72463Mc;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import com.whatsapp.WaTextView;

public final class CreationModeBottomBar extends FrameLayout implements AnonymousClass009, AnonymousClass8AJ {
    public float A00;
    public float A01;
    public LayerDrawable A02;
    public ImageButton A03;
    public ImageButton A04;
    public AnonymousClass11C A05;
    public C18000vb A06;
    public C132026m3 A07;
    public AnonymousClass860 A08;
    public AnonymousClass88X A09;
    public C132536my A0A;
    public AnonymousClass00H A0B;
    public AnonymousClass031 A0C;
    public C43191zP A0D;
    public WaTextView A0E;
    public boolean A0F;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CreationModeBottomBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C18070vi.A0d(context, 1);
        A01();
        this.A00 = -1.0f;
        A00(context);
    }

    public final void setRecipientsControllerFactory(C132026m3 r2) {
        C18070vi.A0d(r2, 0);
        this.A07 = r2;
    }

    public final void setStatusConfig(AnonymousClass00H r2) {
        C18070vi.A0d(r2, 0);
        this.A0B = r2;
    }

    public final void setSystemServices(AnonymousClass11C r2) {
        C18070vi.A0d(r2, 0);
        this.A05 = r2;
    }

    public void setViewCallback(AnonymousClass860 r2) {
        C18070vi.A0d(r2, 0);
        this.A08 = r2;
    }

    public final void setVoiceNotePermissionCheckerFactory(AnonymousClass88X r2) {
        C18070vi.A0d(r2, 0);
        this.A09 = r2;
    }

    public final void setWhatsAppLocale(C18000vb r2) {
        C18070vi.A0d(r2, 0);
        this.A06 = r2;
    }

    public void A01() {
        if (!this.A0F) {
            this.A0F = true;
            C27691Xc r1 = (C27691Xc) ((AnonymousClass033) generatedComponent());
            AnonymousClass1K1 r2 = r1.A0z;
            this.A07 = AnonymousClass1K1.A1G(r2);
            AnonymousClass10E r12 = r1.A10;
            this.A0B = C000200d.A00(r12.AAB);
            this.A05 = AnonymousClass3Ma.A0a(r12);
            this.A09 = (AnonymousClass88X) r2.A7f.get();
            this.A06 = AnonymousClass10E.A6Q(r12);
        }
    }

    public final Object generatedComponent() {
        AnonymousClass031 r0 = this.A0C;
        if (r0 == null) {
            r0 = AnonymousClass3MW.A0u(this);
            this.A0C = r0;
        }
        return r0.generatedComponent();
    }

    public ImageButton getMicButton() {
        ImageButton imageButton = this.A03;
        if (imageButton != null) {
            return imageButton;
        }
        C18070vi.A11("micButton");
        throw null;
    }

    public LayerDrawable getMicButtonBackgroundDrawable() {
        LayerDrawable layerDrawable = this.A02;
        if (layerDrawable != null) {
            return layerDrawable;
        }
        C18070vi.A11("micButtonBackgroundDrawable");
        throw null;
    }

    public final C132026m3 getRecipientsControllerFactory() {
        C132026m3 r0 = this.A07;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("recipientsControllerFactory");
        throw null;
    }

    public ImageButton getSendButton() {
        ImageButton imageButton = this.A04;
        if (imageButton != null) {
            return imageButton;
        }
        C18070vi.A11("sendButton");
        throw null;
    }

    public WaTextView getSlidToCancelLabel() {
        WaTextView waTextView = this.A0E;
        if (waTextView != null) {
            return waTextView;
        }
        C18070vi.A11("slideToCancelLabel");
        throw null;
    }

    public final AnonymousClass00H getStatusConfig() {
        AnonymousClass00H r0 = this.A0B;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("statusConfig");
        throw null;
    }

    public final AnonymousClass11C getSystemServices() {
        AnonymousClass11C r0 = this.A05;
        if (r0 != null) {
            return r0;
        }
        AnonymousClass3MW.A1N();
        throw null;
    }

    public final AnonymousClass88X getVoiceNotePermissionCheckerFactory() {
        AnonymousClass88X r0 = this.A09;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("voiceNotePermissionCheckerFactory");
        throw null;
    }

    public final C18000vb getWhatsAppLocale() {
        C18000vb r0 = this.A06;
        if (r0 != null) {
            return r0;
        }
        AnonymousClass3MW.A1M();
        throw null;
    }

    /* JADX WARNING: type inference failed for: r0v11, types: [java.lang.Object, X.1zR] */
    private final void A00(Context context) {
        String str;
        View.inflate(context, 2131625028, this);
        this.A04 = (ImageButton) C18070vi.A05(this, 2131435142);
        this.A03 = (ImageButton) C18070vi.A05(this, 2131432752);
        this.A0E = AnonymousClass3Ma.A0N(this, 2131432754);
        ImageButton imageButton = this.A04;
        if (imageButton == null) {
            str = "sendButton";
        } else {
            AnonymousClass78P.A00(imageButton, this, 48);
            setClipChildren(false);
            C43191zP A012 = C43171zN.A00().A01();
            this.A0D = A012;
            ? obj = new Object();
            obj.A01 = 440.0d;
            obj.A00 = 21.0d;
            A012.A03 = obj;
            ImageButton imageButton2 = this.A03;
            if (imageButton2 != null) {
                imageButton2.setOnTouchListener(new C1421978n(this));
                ImageButton imageButton3 = this.A03;
                if (imageButton3 != null) {
                    C108955ca.A1K(imageButton3, this, 9);
                    int dimensionPixelSize = getResources().getDimensionPixelSize(2131169247);
                    ShapeDrawable shapeDrawable = new ShapeDrawable();
                    shapeDrawable.setShape(new OvalShape());
                    shapeDrawable.getPaint().setColor(getResources().getColor(C72463Mc.A03(getContext())));
                    AnonymousClass3MW.A1P(shapeDrawable.getPaint());
                    float f = (float) dimensionPixelSize;
                    shapeDrawable.getPaint().setStrokeWidth(f);
                    ShapeDrawable shapeDrawable2 = new ShapeDrawable();
                    shapeDrawable2.setShape(new OvalShape());
                    shapeDrawable2.getPaint().setStrokeWidth(f);
                    shapeDrawable2.getPaint().setStyle(Paint.Style.FILL_AND_STROKE);
                    shapeDrawable2.getPaint().setColor(AnonymousClass3Ma.A01(getContext(), getResources(), 2130970098, 2131101221));
                    LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{shapeDrawable2, shapeDrawable});
                    this.A02 = layerDrawable;
                    layerDrawable.getDrawable(1).setAlpha(0);
                    ImageButton imageButton4 = this.A03;
                    if (imageButton4 != null) {
                        LayerDrawable layerDrawable2 = this.A02;
                        if (layerDrawable2 == null) {
                            C18070vi.A11("micButtonBackgroundDrawable");
                            throw null;
                        }
                        imageButton4.setBackground(layerDrawable2);
                        this.A01 = ((float) ViewConfiguration.get(context).getScaledTouchSlop()) * 1.5f;
                        return;
                    }
                }
            }
            str = "micButton";
        }
        C18070vi.A11(str);
        throw null;
    }

    public ViewGroup getBottomBarSceneRoot() {
        return this;
    }

    public int getBottomBarWidth() {
        return getWidth();
    }

    public float getMaxCancellationTransition() {
        return this.A00;
    }

    public float getMinCancellationTransition() {
        return 0.0f;
    }

    public float getTouchSlop() {
        return this.A01;
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.A08 = null;
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (this.A00 == -1.0f) {
            int A012 = C62762rw.A01(getContext(), 16.0f);
            WaTextView waTextView = this.A0E;
            if (waTextView == null) {
                C18070vi.A11("slideToCancelLabel");
                throw null;
            }
            this.A00 = (float) (A012 - waTextView.getLeft());
            if (AnonymousClass3MW.A1Z(getWhatsAppLocale())) {
                this.A00 = -this.A00;
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CreationModeBottomBar(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        C18070vi.A0d(context, 1);
        A01();
        this.A00 = -1.0f;
        A00(context);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CreationModeBottomBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C18070vi.A0d(context, 1);
        A01();
        this.A00 = -1.0f;
        A00(context);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CreationModeBottomBar(Context context) {
        super(context);
        C18070vi.A0d(context, 1);
        A01();
        this.A00 = -1.0f;
        A00(context);
    }

    public CreationModeBottomBar(Context context, AttributeSet attributeSet, int i, int i2, int i3) {
        super(context, attributeSet);
        A01();
    }
}
