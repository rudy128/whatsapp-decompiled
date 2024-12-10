package com.whatsapp;

import X.AnonymousClass009;
import X.AnonymousClass00H;
import X.AnonymousClass031;
import X.AnonymousClass033;
import X.AnonymousClass10E;
import X.AnonymousClass10I;
import X.AnonymousClass1Y1;
import X.AnonymousClass3MW;
import X.AnonymousClass3MY;
import X.AnonymousClass3MZ;
import X.C000200d;
import X.C18030ve;
import X.C18070vi;
import X.C189349iw;
import X.C27691Xc;
import X.C36631oD;
import X.C75693iH;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;

public final class SettingsBannerView extends FrameLayout implements AnonymousClass009 {
    public C18030ve A00;
    public AnonymousClass10I A01;
    public AnonymousClass00H A02;
    public AnonymousClass00H A03;
    public AnonymousClass031 A04;
    public boolean A05;
    public final C75693iH A06;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public SettingsBannerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C18070vi.A0d(context, 1);
    }

    public final void setAbProps(C18030ve r2) {
        C18070vi.A0d(r2, 0);
        this.A00 = r2;
    }

    public final void setDeepLinkHelper(AnonymousClass00H r2) {
        C18070vi.A0d(r2, 0);
        this.A02 = r2;
    }

    public final void setSettingsQpManager(AnonymousClass00H r2) {
        C18070vi.A0d(r2, 0);
        this.A03 = r2;
    }

    public final void setWaWorkers(AnonymousClass10I r2) {
        C18070vi.A0d(r2, 0);
        this.A01 = r2;
    }

    public final Object generatedComponent() {
        AnonymousClass031 r0 = this.A04;
        if (r0 == null) {
            r0 = AnonymousClass3MW.A0u(this);
            this.A04 = r0;
        }
        return r0.generatedComponent();
    }

    public final C18030ve getAbProps() {
        C18030ve r0 = this.A00;
        if (r0 != null) {
            return r0;
        }
        AnonymousClass3MW.A1A();
        throw null;
    }

    public final AnonymousClass00H getDeepLinkHelper() {
        AnonymousClass00H r0 = this.A02;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("deepLinkHelper");
        throw null;
    }

    public final AnonymousClass00H getSettingsQpManager() {
        AnonymousClass00H r0 = this.A03;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("settingsQpManager");
        throw null;
    }

    public final AnonymousClass10I getWaWorkers() {
        AnonymousClass10I r0 = this.A01;
        if (r0 != null) {
            return r0;
        }
        AnonymousClass3MW.A1G();
        throw null;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SettingsBannerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C18070vi.A0d(context, 1);
        if (!this.A05) {
            this.A05 = true;
            C27691Xc r2 = (C27691Xc) ((AnonymousClass033) generatedComponent());
            AnonymousClass10E r1 = r2.A10;
            this.A00 = AnonymousClass10E.A8r(r1);
            this.A02 = C000200d.A00(r2.A0b);
            this.A03 = C000200d.A00(r2.A0z.A9w);
            this.A01 = AnonymousClass10E.AL1(r1);
        }
        AnonymousClass10I waWorkers = getWaWorkers();
        this.A06 = new C75693iH(this, (C189349iw) C18070vi.A0E(getDeepLinkHelper()), (C36631oD) C18070vi.A0E(getSettingsQpManager()), getAbProps(), waWorkers);
    }

    public /* synthetic */ SettingsBannerView(Context context, AttributeSet attributeSet, int i, int i2, AnonymousClass1Y1 r7) {
        this(context, AnonymousClass3MZ.A0C(attributeSet, i2), AnonymousClass3MY.A00(i2, i));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public SettingsBannerView(Context context) {
        this(context, (AttributeSet) null, 0);
        C18070vi.A0d(context, 1);
    }
}
