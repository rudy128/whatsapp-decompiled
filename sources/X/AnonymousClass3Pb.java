package X;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;

/* renamed from: X.3Pb  reason: invalid class name */
public final class AnonymousClass3Pb extends FrameLayout implements AnonymousClass009 {
    public C108355bZ A00;
    public AnonymousClass4VN A01;
    public C18000vb A02;
    public AnonymousClass1DC A03;
    public AnonymousClass031 A04;
    public boolean A05;
    public final Runnable A06;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass3Pb(Context context, Runnable runnable) {
        super(context);
        C18070vi.A0d(context, 1);
        if (!this.A05) {
            this.A05 = true;
            C27691Xc r1 = (C27691Xc) ((AnonymousClass033) generatedComponent());
            this.A00 = AnonymousClass3MZ.A0V(r1.A0z);
            AnonymousClass10E r12 = r1.A10;
            this.A01 = C72453Mb.A0i(r12);
            this.A03 = AnonymousClass3MZ.A13(r12);
            this.A02 = AnonymousClass10E.A6Q(r12);
        }
        this.A06 = runnable;
        getSystemFeatures();
        View.inflate(context, 2131626665, this);
        getSystemFeatures();
        ((FrameLayout) C18070vi.A05(this, 2131434295)).setForeground(AnonymousClass4aX.A08(getBubbleResolver().BS0(AnonymousClass00R.A01, 2, false), C19740yt.A00(context, 2131100221)));
        C27641Ww.A05(AnonymousClass1HF.A06(this, 2131434308), getWhatsAppLocale(), 0, context.getResources().getDimensionPixelSize(2131166335));
        View A052 = C18070vi.A05(this, 2131428811);
        A052.setVisibility(0);
        AnonymousClass3Ma.A1A(A052, this, 8);
        TextView A0E = AnonymousClass3Ma.A0E(this, 2131434307);
        A0E.setTextSize(getConversationFont().A00(context.getTheme(), context.getResources()));
        C43421zm.A04(A0E);
    }

    public final void setBubbleResolver(C108355bZ r2) {
        C18070vi.A0d(r2, 0);
        this.A00 = r2;
    }

    public final void setConversationFont(AnonymousClass4VN r2) {
        C18070vi.A0d(r2, 0);
        this.A01 = r2;
    }

    public final void setSystemFeatures(AnonymousClass1DC r2) {
        C18070vi.A0d(r2, 0);
        this.A03 = r2;
    }

    public final void setWhatsAppLocale(C18000vb r2) {
        C18070vi.A0d(r2, 0);
        this.A02 = r2;
    }

    public final Object generatedComponent() {
        AnonymousClass031 r0 = this.A04;
        if (r0 == null) {
            r0 = AnonymousClass3MW.A0u(this);
            this.A04 = r0;
        }
        return r0.generatedComponent();
    }

    public final C108355bZ getBubbleResolver() {
        C108355bZ r0 = this.A00;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("bubbleResolver");
        throw null;
    }

    public final AnonymousClass4VN getConversationFont() {
        AnonymousClass4VN r0 = this.A01;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("conversationFont");
        throw null;
    }

    public final AnonymousClass1DC getSystemFeatures() {
        AnonymousClass1DC r0 = this.A03;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("systemFeatures");
        throw null;
    }

    public final C18000vb getWhatsAppLocale() {
        C18000vb r0 = this.A02;
        if (r0 != null) {
            return r0;
        }
        AnonymousClass3MW.A1M();
        throw null;
    }
}
