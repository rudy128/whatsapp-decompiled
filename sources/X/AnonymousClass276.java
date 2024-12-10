package X;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;

/* renamed from: X.276  reason: invalid class name */
public final class AnonymousClass276 extends FrameLayout implements AnonymousClass009 {
    public AnonymousClass3KI A00;
    public C36671oH A01;
    public C189349iw A02;
    public C18030ve A03;
    public AnonymousClass10I A04;
    public AnonymousClass031 A05;
    public boolean A06;
    public final C75733iL A07;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass276(Context context) {
        super(context, (AttributeSet) null, 0);
        if (!this.A06) {
            this.A06 = true;
            C27691Xc r2 = (C27691Xc) ((AnonymousClass033) generatedComponent());
            AnonymousClass10E r1 = r2.A10;
            this.A03 = AnonymousClass10E.A8r(r1);
            this.A01 = AnonymousClass1K1.A09(r2.A0z);
            this.A02 = (C189349iw) r2.A0b.get();
            this.A04 = AnonymousClass10E.AL1(r1);
        }
        this.A07 = new C75733iL(this, getCallListQpManager(), getDeepLinkHelper(), getAbProps(), getWaWorkers(), new AnonymousClass3H2(this));
    }

    public final void setAbProps(C18030ve r2) {
        C18070vi.A0d(r2, 0);
        this.A03 = r2;
    }

    public final void setCallListQpManager(C36671oH r2) {
        C18070vi.A0d(r2, 0);
        this.A01 = r2;
    }

    public final void setDeepLinkHelper(C189349iw r2) {
        C18070vi.A0d(r2, 0);
        this.A02 = r2;
    }

    public final void setWaWorkers(AnonymousClass10I r2) {
        C18070vi.A0d(r2, 0);
        this.A04 = r2;
    }

    public final Object generatedComponent() {
        AnonymousClass031 r0 = this.A05;
        if (r0 == null) {
            r0 = new AnonymousClass031(this);
            this.A05 = r0;
        }
        return r0.generatedComponent();
    }

    public final C18030ve getAbProps() {
        C18030ve r0 = this.A03;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("abProps");
        throw null;
    }

    public final C36671oH getCallListQpManager() {
        C36671oH r0 = this.A01;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("callListQpManager");
        throw null;
    }

    public final C189349iw getDeepLinkHelper() {
        C189349iw r0 = this.A02;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("deepLinkHelper");
        throw null;
    }

    public final AnonymousClass10I getWaWorkers() {
        AnonymousClass10I r0 = this.A04;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("waWorkers");
        throw null;
    }

    public final AnonymousClass3KI getEventListener() {
        return this.A00;
    }

    public final void setEventListener(AnonymousClass3KI r1) {
        this.A00 = r1;
    }
}
