package com.whatsapp.productinfra.avatar.squid;

import X.AnonymousClass000;
import X.AnonymousClass009;
import X.AnonymousClass00R;
import X.AnonymousClass031;
import X.AnonymousClass033;
import X.AnonymousClass10E;
import X.AnonymousClass11C;
import X.AnonymousClass1DF;
import X.AnonymousClass1FU;
import X.AnonymousClass1KB;
import X.AnonymousClass1L8;
import X.AnonymousClass1OS;
import X.AnonymousClass1OX;
import X.AnonymousClass1Y1;
import X.AnonymousClass1YF;
import X.AnonymousClass1YL;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3MY;
import X.AnonymousClass3MZ;
import X.AnonymousClass3Ma;
import X.AnonymousClass6EM;
import X.AnonymousClass6EN;
import X.AnonymousClass6EO;
import X.AnonymousClass6RP;
import X.AnonymousClass6UW;
import X.AnonymousClass6Z5;
import X.AnonymousClass73V;
import X.C108965cb;
import X.C108985cd;
import X.C133856pc;
import X.C136936ue;
import X.C137856w8;
import X.C153157p4;
import X.C153167p5;
import X.C156747ur;
import X.C17890vO;
import X.C18070vi;
import X.C18100vl;
import X.C18600wl;
import X.C27021Uk;
import X.C27031Ul;
import X.C27621Wu;
import X.C27691Xc;
import X.C30391dr;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import X.C36361nl;
import X.C72453Mb;
import X.C74703cE;
import X.C90024dP;
import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.text.SpannableStringBuilder;
import android.text.style.StyleSpan;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.whatsapp.WaImageButton;
import com.whatsapp.WaImageView;
import com.whatsapp.WaTextView;
import kotlin.coroutines.jvm.internal.DebugMetadata;

public final class AvatarSquidUpsellView extends ConstraintLayout implements AnonymousClass009 {
    public AnonymousClass1KB A00;
    public C36361nl A01;
    public AnonymousClass11C A02;
    public C27021Uk A03;
    public C133856pc A04;
    public C27031Ul A05;
    public AnonymousClass73V A06;
    public C136936ue A07;
    public AvatarSquidConfiguration A08;
    public C137856w8 A09;
    public AnonymousClass6UW A0A;
    public AnonymousClass031 A0B;
    public C18600wl A0C;
    public AnonymousClass1OX A0D;
    public boolean A0E;
    public final C18100vl A0F;
    public final C18100vl A0G;
    public final WaImageButton A0H;
    public final WaImageView A0I;
    public final WaImageView A0J;
    public final WaTextView A0K;
    public final WaTextView A0L;
    public final C18100vl A0M;

    @DebugMetadata(c = "com.whatsapp.productinfra.avatar.squid.AvatarSquidUpsellView$5", f = "AvatarSquidUpsellView.kt", i = {}, l = {128}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.whatsapp.productinfra.avatar.squid.AvatarSquidUpsellView$5  reason: invalid class name */
    public final class AnonymousClass5 extends C30431dv implements AnonymousClass1OS {
        public int label;

        public final C30391dr create(Object obj, C30391dr r4) {
            return new AnonymousClass5(r4);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return new AnonymousClass5((C30391dr) obj2).invokeSuspend(C27621Wu.A00);
        }

        public final Object invokeSuspend(Object obj) {
            C31751g4 r3 = C31751g4.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                C30691eM.A01(obj);
                AvatarSquidUpsellViewController A00 = AvatarSquidUpsellView.this.getViewController();
                AnonymousClass6UW r0 = AvatarSquidUpsellView.this.A0A;
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
    public AvatarSquidUpsellView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        AnonymousClass6UW r0;
        C18070vi.A0d(context, 1);
        if (!this.A0E) {
            this.A0E = true;
            C27691Xc r3 = (C27691Xc) ((AnonymousClass033) generatedComponent());
            AnonymousClass10E r1 = r3.A10;
            this.A0D = (AnonymousClass1OX) r1.A9C.get();
            this.A03 = (C27021Uk) r1.A0R.get();
            this.A06 = (AnonymousClass73V) r3.A0z.A09.get();
            this.A07 = (C136936ue) r1.A0V.get();
            this.A04 = (C133856pc) r1.A0W.get();
            this.A05 = (C27031Ul) r1.ADv.get();
            this.A08 = (AvatarSquidConfiguration) r1.ADx.get();
            this.A09 = (C137856w8) r1.ADy.get();
            this.A00 = AnonymousClass10E.A12(r1);
            this.A01 = C108985cd.A0N(r1);
            this.A0C = (C18600wl) r1.A9F.get();
            this.A02 = AnonymousClass3Ma.A0a(r1);
        }
        Integer num = AnonymousClass00R.A0C;
        this.A0G = AnonymousClass1DF.A00(num, new C153167p5(context));
        this.A0F = AnonymousClass1DF.A00(num, new C153157p4(context));
        this.A0M = AnonymousClass1DF.A00(num, new C156747ur(context, this));
        LayoutInflater.from(context).inflate(2131627383, this, true);
        this.A0I = C108965cb.A0I(this, 2131435794);
        this.A0J = C108965cb.A0I(this, 2131435796);
        WaImageButton waImageButton = (WaImageButton) C18070vi.A05(this, 2131435793);
        this.A0H = waImageButton;
        WaTextView A0N = AnonymousClass3Ma.A0N(this, 2131435800);
        A0N.setText(2131886875);
        this.A0L = A0N;
        this.A0K = AnonymousClass3Ma.A0N(this, 2131435799);
        AnonymousClass6RP A002 = getAvatarSquidConfiguration().A00();
        setupSquidPhaseImageAndTextLayouts(A002);
        setBackgroundResource(2131233068);
        AnonymousClass3MW.A1Q(this);
        setOnClickListener(new C90024dP(this, A002, 17));
        C90024dP.A00(waImageButton, this, A002, 18);
        if (attributeSet != null) {
            int[] iArr = AnonymousClass6Z5.A02;
            C18070vi.A0Z(iArr);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, 0, 0);
            int i2 = obtainStyledAttributes.getInt(0, -1);
            if (i2 == 0) {
                r0 = AnonymousClass6EO.A00;
            } else if (i2 == 1) {
                r0 = AnonymousClass6EM.A00;
            } else if (i2 == 2) {
                r0 = AnonymousClass6EN.A00;
            } else {
                throw AnonymousClass000.A0k("Avatar sticker upsell entry point must be set");
            }
            this.A0A = r0;
            obtainStyledAttributes.recycle();
        }
        AnonymousClass3MX.A1Q(new AnonymousClass5((C30391dr) null), getApplicationScope());
    }

    public static /* synthetic */ void getApplicationScope$annotations() {
    }

    public static /* synthetic */ void getMainDispatcher$annotations() {
    }

    public final void setApplicationScope(AnonymousClass1OX r2) {
        C18070vi.A0d(r2, 0);
        this.A0D = r2;
    }

    public final void setAvatarConfigRepository(C27021Uk r2) {
        C18070vi.A0d(r2, 0);
        this.A03 = r2;
    }

    public final void setAvatarEditorLauncher(AnonymousClass73V r2) {
        C18070vi.A0d(r2, 0);
        this.A06 = r2;
    }

    public final void setAvatarLogger(C136936ue r2) {
        C18070vi.A0d(r2, 0);
        this.A07 = r2;
    }

    public final void setAvatarRepository(C133856pc r2) {
        C18070vi.A0d(r2, 0);
        this.A04 = r2;
    }

    public final void setAvatarSharedPreferences(C27031Ul r2) {
        C18070vi.A0d(r2, 0);
        this.A05 = r2;
    }

    public final void setAvatarSquidConfiguration(AvatarSquidConfiguration avatarSquidConfiguration) {
        C18070vi.A0d(avatarSquidConfiguration, 0);
        this.A08 = avatarSquidConfiguration;
    }

    public final void setAvatarSquidLogger(C137856w8 r2) {
        C18070vi.A0d(r2, 0);
        this.A09 = r2;
    }

    public final void setGlobalUI(AnonymousClass1KB r2) {
        C18070vi.A0d(r2, 0);
        this.A00 = r2;
    }

    public final void setLinkLauncher(C36361nl r2) {
        C18070vi.A0d(r2, 0);
        this.A01 = r2;
    }

    public final void setMainDispatcher(C18600wl r2) {
        C18070vi.A0d(r2, 0);
        this.A0C = r2;
    }

    public final void setSystemServices(AnonymousClass11C r2) {
        C18070vi.A0d(r2, 0);
        this.A02 = r2;
    }

    private final int getImageWidthLandscape() {
        return C72453Mb.A0I(this.A0F);
    }

    private final int getImageWidthPortrait() {
        return C72453Mb.A0I(this.A0G);
    }

    /* access modifiers changed from: private */
    public final AvatarSquidUpsellViewController getViewController() {
        return (AvatarSquidUpsellViewController) this.A0M.getValue();
    }

    public final Object generatedComponent() {
        AnonymousClass031 r0 = this.A0B;
        if (r0 == null) {
            r0 = AnonymousClass3MW.A0u(this);
            this.A0B = r0;
        }
        return r0.generatedComponent();
    }

    public final AnonymousClass1OX getApplicationScope() {
        AnonymousClass1OX r0 = this.A0D;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("applicationScope");
        throw null;
    }

    public final C27021Uk getAvatarConfigRepository() {
        C27021Uk r0 = this.A03;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("avatarConfigRepository");
        throw null;
    }

    public final AnonymousClass73V getAvatarEditorLauncher() {
        AnonymousClass73V r0 = this.A06;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("avatarEditorLauncher");
        throw null;
    }

    public final C136936ue getAvatarLogger() {
        C136936ue r0 = this.A07;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("avatarLogger");
        throw null;
    }

    public final C133856pc getAvatarRepository() {
        C133856pc r0 = this.A04;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("avatarRepository");
        throw null;
    }

    public final C27031Ul getAvatarSharedPreferences() {
        C27031Ul r0 = this.A05;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("avatarSharedPreferences");
        throw null;
    }

    public final AvatarSquidConfiguration getAvatarSquidConfiguration() {
        AvatarSquidConfiguration avatarSquidConfiguration = this.A08;
        if (avatarSquidConfiguration != null) {
            return avatarSquidConfiguration;
        }
        C18070vi.A11("avatarSquidConfiguration");
        throw null;
    }

    public final C137856w8 getAvatarSquidLogger() {
        C137856w8 r0 = this.A09;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("avatarSquidLogger");
        throw null;
    }

    public final AnonymousClass1KB getGlobalUI() {
        AnonymousClass1KB r0 = this.A00;
        if (r0 != null) {
            return r0;
        }
        AnonymousClass3MW.A1C();
        throw null;
    }

    public final C36361nl getLinkLauncher() {
        C36361nl r0 = this.A01;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("linkLauncher");
        throw null;
    }

    public final C18600wl getMainDispatcher() {
        C18600wl r0 = this.A0C;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("mainDispatcher");
        throw null;
    }

    public final AnonymousClass11C getSystemServices() {
        AnonymousClass11C r0 = this.A02;
        if (r0 != null) {
            return r0;
        }
        AnonymousClass3MW.A1N();
        throw null;
    }

    public static final void A01(AnonymousClass6RP r3, AvatarSquidUpsellView avatarSquidUpsellView) {
        C137856w8 avatarSquidLogger = avatarSquidUpsellView.getAvatarSquidLogger();
        AnonymousClass6UW r0 = avatarSquidUpsellView.A0A;
        if (r0 == null) {
            C18070vi.A11("entryPoint");
            throw null;
        }
        C137856w8.A00(r3, avatarSquidLogger, r0.A00(), 2);
        AvatarSquidUpsellViewController viewController = avatarSquidUpsellView.getViewController();
        AnonymousClass73V r32 = viewController.A03;
        Activity activity = viewController.A00;
        C18070vi.A0z(activity, "null cannot be cast to non-null type com.whatsapp.DialogActivity");
        r32.A04((AnonymousClass1FU) activity, "avatar_sticker_upsell", "whatsapp://avatar/edit/update");
    }

    public static final void A02(AnonymousClass6RP r3, AvatarSquidUpsellView avatarSquidUpsellView) {
        C137856w8 avatarSquidLogger = avatarSquidUpsellView.getAvatarSquidLogger();
        AnonymousClass6UW r0 = avatarSquidUpsellView.A0A;
        if (r0 == null) {
            C18070vi.A11("entryPoint");
            throw null;
        }
        C137856w8.A00(r3, avatarSquidLogger, r0.A00(), 3);
        AvatarSquidUpsellViewController viewController = avatarSquidUpsellView.getViewController();
        viewController.A02.A00(viewController.A04.A00());
        viewController.A01.setVisibility(8);
    }

    private final void setupSquidPhaseImageAndTextLayouts(AnonymousClass6RP r15) {
        String str;
        String str2;
        View view;
        Resources resources;
        int i;
        int ordinal = r15.ordinal();
        if (ordinal != 1) {
            if (ordinal == 2) {
                str2 = AnonymousClass3MY.A0m(getResources(), 2131886880);
                str = AnonymousClass3MY.A0m(getResources(), 2131886879);
                resources = getResources();
                i = 2131886876;
            } else if (ordinal != 3) {
                str = "";
                str2 = str;
            } else {
                str2 = AnonymousClass3MY.A0m(getResources(), 2131886882);
                str = AnonymousClass3MY.A0m(getResources(), 2131886885);
                resources = getResources();
                i = 2131886881;
            }
            AnonymousClass3MX.A1D(resources, this, i);
            this.A0L.setVisibility(8);
            this.A0I.setVisibility(8);
            view = this.A0J;
            view.setVisibility(0);
        } else {
            str2 = AnonymousClass3MY.A0m(getResources(), 2131886871);
            str = AnonymousClass3MY.A0m(getResources(), 2131886874);
            AnonymousClass3MX.A1D(getResources(), this, 2131886870);
            this.A0I.setVisibility(0);
            this.A0J.setVisibility(8);
            view = this.A0L;
            view.setVisibility(0);
        }
        String A0Z = C17890vO.A0Z(str2, AnonymousClass000.A11(str), ' ');
        SpannableStringBuilder A092 = AnonymousClass3MW.A09(A0Z);
        int A0F2 = AnonymousClass1YF.A0F(A0Z, str2, 0, false);
        StyleSpan styleSpan = new StyleSpan(1);
        int length = str2.length() + A0F2;
        A092.setSpan(styleSpan, A0F2, length, 33);
        Context A042 = AnonymousClass3MY.A04(this);
        int A002 = AnonymousClass1YL.A00(getContext(), 2130968627, 2131099690);
        A092.setSpan(new C74703cE(A042, (AnonymousClass1L8) getLinkLauncher(), getGlobalUI(), getSystemServices(), "http://wa.me/avatar/edit", A002), A0F2, length, 33);
        this.A0K.setText(A092);
    }

    public void onConfigurationChanged(Configuration configuration) {
        int A0I2;
        super.onConfigurationChanged(configuration);
        if (configuration != null) {
            if (configuration.orientation == 2) {
                A0I2 = C72453Mb.A0I(this.A0F);
            } else {
                A0I2 = C72453Mb.A0I(this.A0G);
            }
            this.A0I.getLayoutParams().width = A0I2;
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public AvatarSquidUpsellView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C18070vi.A0d(context, 1);
    }

    public /* synthetic */ AvatarSquidUpsellView(Context context, AttributeSet attributeSet, int i, int i2, AnonymousClass1Y1 r7) {
        this(context, AnonymousClass3MZ.A0C(attributeSet, i2), AnonymousClass3MY.A00(i2, i));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public AvatarSquidUpsellView(Context context) {
        this(context, (AttributeSet) null, 0);
        C18070vi.A0d(context, 1);
    }
}
