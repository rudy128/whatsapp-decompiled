package com.whatsapp.statuscomposer.composer;

import X.AnonymousClass000;
import X.AnonymousClass009;
import X.AnonymousClass031;
import X.AnonymousClass033;
import X.AnonymousClass11C;
import X.AnonymousClass3MW;
import X.AnonymousClass7BQ;
import X.C108945cZ;
import X.C110595gJ;
import X.C122696Rj;
import X.C136836uU;
import X.C1597285q;
import X.C18030ve;
import X.C18070vi;
import X.C27691Xc;
import android.content.Context;
import android.util.AttributeSet;
import com.google.android.material.tabs.TabLayout;

public final class ComposerModeTabLayout extends TabLayout implements AnonymousClass009 {
    public C136836uU A00;
    public AnonymousClass11C A01;
    public C18030ve A02;
    public C1597285q A03;
    public AnonymousClass031 A04;
    public boolean A05;
    public boolean A06;
    public final C136836uU A07;
    public final C136836uU A08;
    public final C136836uU A09;

    public final void setAbProps(C18030ve r2) {
        C18070vi.A0d(r2, 0);
        this.A02 = r2;
    }

    public final void setPreviouslySelectedTab(C136836uU r2) {
        C18070vi.A0d(r2, 0);
        this.A00 = r2;
    }

    public final void setSystemServices(AnonymousClass11C r2) {
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
        C18030ve r0 = this.A02;
        if (r0 != null) {
            return r0;
        }
        AnonymousClass3MW.A1A();
        throw null;
    }

    public final AnonymousClass11C getSystemServices() {
        AnonymousClass11C r0 = this.A01;
        if (r0 != null) {
            return r0;
        }
        AnonymousClass3MW.A1N();
        throw null;
    }

    public ComposerModeTabLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        if (!this.A05) {
            this.A05 = true;
            C27691Xc.A14((C27691Xc) ((AnonymousClass033) generatedComponent()), this);
        }
    }

    public final C1597285q getComposerTabViewListener() {
        return this.A03;
    }

    public final boolean getManualSwitch() {
        return this.A06;
    }

    public final C136836uU getPreviouslySelectedTab() {
        return this.A00;
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        C110595gJ r2;
        int i5;
        int i6;
        super.onLayout(z, i, i2, i3, i4);
        C136836uU A082 = A08(0);
        C110595gJ r4 = null;
        if (A082 != null) {
            r2 = A082.A02;
        } else {
            r2 = null;
        }
        C136836uU A083 = A08(AnonymousClass000.A0Q(this.A0h));
        if (A083 != null) {
            r4 = A083.A02;
        }
        int width = getWidth();
        if (r2 != null) {
            i5 = r2.getWidth();
        } else {
            i5 = 0;
        }
        int i7 = (width - i5) / 2;
        int width2 = getWidth();
        if (r4 != null) {
            i6 = r4.getWidth();
        } else {
            i6 = 0;
        }
        getChildAt(0).setPaddingRelative(i7, 0, (width2 - i6) / 2, 0);
        C136836uU r1 = this.A07;
        if (!r1.A03() || this.A06) {
            r1 = this.A08;
            if (!r1.A03()) {
                return;
            }
        }
        A0B(0.0f, r1.A00, false, true);
    }

    public final void setComposerTabViewListener(C1597285q r1) {
        this.A03 = r1;
    }

    public final void setManualSwitch(boolean z) {
        this.A06 = z;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ComposerModeTabLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C18070vi.A0d(context, 1);
        if (!this.A05) {
            this.A05 = true;
            C27691Xc.A14((C27691Xc) ((AnonymousClass033) generatedComponent()), this);
        }
        C136836uU A072 = A07();
        A072.A01(2131887882);
        A072.A06 = C122696Rj.VIDEO;
        this.A09 = A072;
        C136836uU A073 = A07();
        A073.A01(2131887880);
        A073.A06 = C122696Rj.PHOTO;
        this.A07 = A073;
        C136836uU A074 = A07();
        A074.A01(2131894713);
        A074.A06 = C122696Rj.TEXT;
        this.A08 = A074;
        A0F(A072);
        A0H(A073, C108945cZ.A07(this), true);
        A0F(A074);
        this.A00 = A073;
        A0E(new AnonymousClass7BQ(this, 2));
    }
}
