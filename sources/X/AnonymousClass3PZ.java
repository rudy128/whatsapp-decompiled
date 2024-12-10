package X;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;

/* renamed from: X.3PZ  reason: invalid class name */
public final class AnonymousClass3PZ extends FrameLayout implements AnonymousClass009 {
    public C18030ve A00;
    public AnonymousClass10I A01;
    public AnonymousClass00H A02;
    public AnonymousClass00H A03;
    public AnonymousClass031 A04;
    public boolean A05;
    public final C75713iJ A06;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass3PZ(Context context) {
        super(context, (AttributeSet) null, 0);
        if (!this.A05) {
            this.A05 = true;
            C27691Xc r2 = (C27691Xc) ((AnonymousClass033) generatedComponent());
            AnonymousClass10E r1 = r2.A10;
            this.A00 = AnonymousClass10E.A8r(r1);
            this.A02 = C000200d.A00(r2.A0b);
            this.A03 = C000200d.A00(r2.A0z.A5Z);
            this.A01 = AnonymousClass10E.AL1(r1);
        }
        this.A06 = new C75713iJ(this, (C36661oG) C18070vi.A0E(getProfilePrivacyTipQpManager()), (C189349iw) C18070vi.A0E(getDeepLinkHelper()), getAbProps(), getWaWorkers());
    }

    public final void setAbProps(C18030ve r2) {
        C18070vi.A0d(r2, 0);
        this.A00 = r2;
    }

    public final void setDeepLinkHelper(AnonymousClass00H r2) {
        C18070vi.A0d(r2, 0);
        this.A02 = r2;
    }

    public final void setProfilePrivacyTipQpManager(AnonymousClass00H r2) {
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

    public final AnonymousClass00H getProfilePrivacyTipQpManager() {
        AnonymousClass00H r0 = this.A03;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("profilePrivacyTipQpManager");
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
}
