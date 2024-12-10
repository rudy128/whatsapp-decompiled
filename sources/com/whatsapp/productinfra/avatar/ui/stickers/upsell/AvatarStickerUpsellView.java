package com.whatsapp.productinfra.avatar.ui.stickers.upsell;

import X.AnonymousClass000;
import X.AnonymousClass009;
import X.AnonymousClass00H;
import X.AnonymousClass00R;
import X.AnonymousClass031;
import X.AnonymousClass033;
import X.AnonymousClass10E;
import X.AnonymousClass1DF;
import X.AnonymousClass1FU;
import X.AnonymousClass1OS;
import X.AnonymousClass1OX;
import X.AnonymousClass1Y1;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3MY;
import X.AnonymousClass3MZ;
import X.AnonymousClass6ES;
import X.AnonymousClass6ET;
import X.AnonymousClass6Z5;
import X.AnonymousClass73V;
import X.AnonymousClass7L4;
import X.C000200d;
import X.C108965cb;
import X.C108975cc;
import X.C123156Ti;
import X.C153177p6;
import X.C153187p7;
import X.C153197p8;
import X.C153207p9;
import X.C156757us;
import X.C17880vN;
import X.C17890vO;
import X.C18070vi;
import X.C18100vl;
import X.C18600wl;
import X.C27621Wu;
import X.C27691Xc;
import X.C30391dr;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import X.C39151sZ;
import X.C72453Mb;
import X.C89964dJ;
import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.whatsapp.WaImageView;
import kotlin.coroutines.jvm.internal.DebugMetadata;

public final class AvatarStickerUpsellView extends ConstraintLayout implements AnonymousClass009 {
    public C123156Ti A00;
    public AnonymousClass00H A01;
    public AnonymousClass00H A02;
    public AnonymousClass00H A03;
    public AnonymousClass00H A04;
    public AnonymousClass00H A05;
    public AnonymousClass00H A06;
    public AnonymousClass031 A07;
    public C18600wl A08;
    public AnonymousClass1OX A09;
    public boolean A0A;
    public final C18100vl A0B;
    public final C18100vl A0C;
    public final C18100vl A0D;
    public final C18100vl A0E;
    public final AnonymousClass7L4 A0F;
    public final WaImageView A0G;
    public final C18100vl A0H;

    @DebugMetadata(c = "com.whatsapp.productinfra.avatar.ui.stickers.upsell.AvatarStickerUpsellView$4", f = "AvatarStickerUpsellView.kt", i = {}, l = {130}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.whatsapp.productinfra.avatar.ui.stickers.upsell.AvatarStickerUpsellView$4  reason: invalid class name */
    public final class AnonymousClass4 extends C30431dv implements AnonymousClass1OS {
        public int label;

        public final C30391dr create(Object obj, C30391dr r4) {
            return new AnonymousClass4(r4);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return new AnonymousClass4((C30391dr) obj2).invokeSuspend(C27621Wu.A00);
        }

        public final Object invokeSuspend(Object obj) {
            C31751g4 r3 = C31751g4.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                C30691eM.A01(obj);
                AvatarStickerUpsellViewController A00 = AvatarStickerUpsellView.this.getViewController();
                C123156Ti r0 = AvatarStickerUpsellView.this.A00;
                if (r0 == null) {
                    C18070vi.A11("entryPoint");
                    throw null;
                }
                this.label = 1;
                if (A00.A00(r0, this) == r3) {
                    return r3;
                }
            } else if (i == 1) {
                C30691eM.A01(obj);
            } else {
                throw AnonymousClass000.A0l();
            }
            return C27621Wu.A00;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AvatarStickerUpsellView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C123156Ti r0;
        C18070vi.A0d(context, 1);
        if (!this.A0A) {
            this.A0A = true;
            C27691Xc r2 = (C27691Xc) ((AnonymousClass033) generatedComponent());
            AnonymousClass10E r1 = r2.A10;
            this.A09 = (AnonymousClass1OX) r1.A9C.get();
            this.A01 = C000200d.A00(r1.A0R);
            this.A02 = C000200d.A00(r2.A0z.A09);
            this.A03 = C000200d.A00(r1.ADn);
            this.A04 = C000200d.A00(r1.A0V);
            this.A05 = C000200d.A00(r1.A0W);
            this.A06 = C000200d.A00(r1.ADv);
            this.A08 = (C18600wl) r1.A9F.get();
        }
        Integer num = AnonymousClass00R.A0C;
        this.A0E = AnonymousClass1DF.A00(num, new C153207p9(context));
        this.A0C = AnonymousClass1DF.A00(num, new C153187p7(context));
        this.A0D = AnonymousClass1DF.A00(num, new C153197p8(context));
        this.A0B = AnonymousClass1DF.A00(num, new C153177p6(context));
        this.A0H = AnonymousClass1DF.A00(num, new C156757us(context, this));
        this.A0F = new AnonymousClass7L4(this, 3);
        LayoutInflater.from(context).inflate(2131627386, this, true);
        this.A0G = C108965cb.A0I(this, 2131435794);
        setBackgroundResource(2131233068);
        AnonymousClass3MY.A0w(context, this, 2131896522);
        View A052 = C18070vi.A05(this, 2131435793);
        if (attributeSet != null) {
            int[] iArr = AnonymousClass6Z5.A03;
            C18070vi.A0Z(iArr);
            int i2 = 0;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, 0, 0);
            A052.setVisibility(C72453Mb.A06(obtainStyledAttributes.getBoolean(0, true) ? 1 : 0));
            boolean z = obtainStyledAttributes.getBoolean(2, true);
            TextView A0J = AnonymousClass3MW.A0J(this, 2131435798);
            A0J.setVisibility(!z ? 8 : i2);
            A0J.setText("Meta");
            int i3 = obtainStyledAttributes.getInt(1, -1);
            if (i3 == 0) {
                r0 = AnonymousClass6ES.A00;
            } else if (i3 == 1) {
                r0 = AnonymousClass6ET.A00;
            } else {
                throw AnonymousClass000.A0k("Avatar sticker upsell entry point must be set");
            }
            this.A00 = r0;
            obtainStyledAttributes.recycle();
        }
        setOnClickListener(new C89964dJ(this, 31));
        C89964dJ.A00(A052, this, 32);
        AnonymousClass3MX.A1Q(new AnonymousClass4((C30391dr) null), getApplicationScope());
        setImportantForAccessibility(1);
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append(context.getString(2131896522));
        setContentDescription(AnonymousClass000.A0y("\nMeta", A10));
        context.getString(2131896525);
    }

    public static /* synthetic */ void getApplicationScope$annotations() {
    }

    public static /* synthetic */ void getMainDispatcher$annotations() {
    }

    public final void setApplicationScope(AnonymousClass1OX r2) {
        C18070vi.A0d(r2, 0);
        this.A09 = r2;
    }

    public final void setAvatarConfigRepository(AnonymousClass00H r2) {
        C18070vi.A0d(r2, 0);
        this.A01 = r2;
    }

    public final void setAvatarEditorLauncher(AnonymousClass00H r2) {
        C18070vi.A0d(r2, 0);
        this.A02 = r2;
    }

    public final void setAvatarEventObservers(AnonymousClass00H r2) {
        C18070vi.A0d(r2, 0);
        this.A03 = r2;
    }

    public final void setAvatarLogger(AnonymousClass00H r2) {
        C18070vi.A0d(r2, 0);
        this.A04 = r2;
    }

    public final void setAvatarRepository(AnonymousClass00H r2) {
        C18070vi.A0d(r2, 0);
        this.A05 = r2;
    }

    public final void setAvatarSharedPreferences(AnonymousClass00H r2) {
        C18070vi.A0d(r2, 0);
        this.A06 = r2;
    }

    public final void setMainDispatcher(C18600wl r2) {
        C18070vi.A0d(r2, 0);
        this.A08 = r2;
    }

    private final int getImageHeightLandscape() {
        return C72453Mb.A0I(this.A0B);
    }

    private final int getImageHeightPortrait() {
        return C72453Mb.A0I(this.A0C);
    }

    private final int getImageWidthLandscape() {
        return C72453Mb.A0I(this.A0D);
    }

    private final int getImageWidthPortrait() {
        return C72453Mb.A0I(this.A0E);
    }

    /* access modifiers changed from: private */
    public final AvatarStickerUpsellViewController getViewController() {
        return (AvatarStickerUpsellViewController) this.A0H.getValue();
    }

    public final Object generatedComponent() {
        AnonymousClass031 r0 = this.A07;
        if (r0 == null) {
            r0 = AnonymousClass3MW.A0u(this);
            this.A07 = r0;
        }
        return r0.generatedComponent();
    }

    public final AnonymousClass1OX getApplicationScope() {
        AnonymousClass1OX r0 = this.A09;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("applicationScope");
        throw null;
    }

    public final AnonymousClass00H getAvatarConfigRepository() {
        AnonymousClass00H r0 = this.A01;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("avatarConfigRepository");
        throw null;
    }

    public final AnonymousClass00H getAvatarEditorLauncher() {
        AnonymousClass00H r0 = this.A02;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("avatarEditorLauncher");
        throw null;
    }

    public final AnonymousClass00H getAvatarEventObservers() {
        AnonymousClass00H r0 = this.A03;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("avatarEventObservers");
        throw null;
    }

    public final AnonymousClass00H getAvatarLogger() {
        AnonymousClass00H r0 = this.A04;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("avatarLogger");
        throw null;
    }

    public final AnonymousClass00H getAvatarRepository() {
        AnonymousClass00H r0 = this.A05;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("avatarRepository");
        throw null;
    }

    public final AnonymousClass00H getAvatarSharedPreferences() {
        AnonymousClass00H r0 = this.A06;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("avatarSharedPreferences");
        throw null;
    }

    public final C18600wl getMainDispatcher() {
        C18600wl r0 = this.A08;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("mainDispatcher");
        throw null;
    }

    public static final void A01(AvatarStickerUpsellView avatarStickerUpsellView) {
        C108975cc.A0L(avatarStickerUpsellView.getAvatarLogger()).A03((Boolean) null, 10);
        AvatarStickerUpsellViewController viewController = avatarStickerUpsellView.getViewController();
        AnonymousClass73V r2 = viewController.A03;
        Activity activity = viewController.A00;
        C18070vi.A0z(activity, "null cannot be cast to non-null type com.whatsapp.DialogActivity");
        r2.A04((AnonymousClass1FU) activity, "avatar_sticker_upsell", (String) null);
    }

    public static final void A02(AvatarStickerUpsellView avatarStickerUpsellView) {
        C108975cc.A0L(avatarStickerUpsellView.getAvatarLogger()).A03((Boolean) null, 11);
        AvatarStickerUpsellViewController viewController = avatarStickerUpsellView.getViewController();
        C17880vN.A1F(C17890vO.A0A(viewController.A02.A01), "pref_has_dismissed_sticker_upsell", true);
        viewController.A01.setVisibility(8);
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        C17880vN.A0V(getAvatarEventObservers()).registerObserver(this.A0F);
    }

    public void onConfigurationChanged(Configuration configuration) {
        int A0I;
        int A0I2;
        super.onConfigurationChanged(configuration);
        if (configuration != null) {
            if (configuration.orientation == 2) {
                A0I = C72453Mb.A0I(this.A0D);
            } else {
                A0I = C72453Mb.A0I(this.A0E);
            }
            if (configuration.orientation == 2) {
                A0I2 = C72453Mb.A0I(this.A0B);
            } else {
                A0I2 = C72453Mb.A0I(this.A0C);
            }
            this.A0G.setLayoutParams(new C39151sZ(A0I, A0I2));
        }
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C17880vN.A0V(getAvatarEventObservers()).unregisterObserver(this.A0F);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public AvatarStickerUpsellView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C18070vi.A0d(context, 1);
    }

    public /* synthetic */ AvatarStickerUpsellView(Context context, AttributeSet attributeSet, int i, int i2, AnonymousClass1Y1 r7) {
        this(context, AnonymousClass3MZ.A0C(attributeSet, i2), AnonymousClass3MY.A00(i2, i));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public AvatarStickerUpsellView(Context context) {
        this(context, (AttributeSet) null, 0);
        C18070vi.A0d(context, 1);
    }
}
