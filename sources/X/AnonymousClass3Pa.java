package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.whatsapp.WaTextView;

/* renamed from: X.3Pa  reason: invalid class name */
public final class AnonymousClass3Pa extends FrameLayout implements AnonymousClass009 {
    public AnonymousClass4VN A00;
    public AnonymousClass11P A01;
    public C18000vb A02;
    public AnonymousClass00H A03;
    public AnonymousClass031 A04;
    public boolean A05;
    public final WaTextView A06;

    public AnonymousClass3Pa(Context context) {
        super(context, (AttributeSet) null, 0);
        if (!this.A05) {
            this.A05 = true;
            C27691Xc r1 = (C27691Xc) ((AnonymousClass033) generatedComponent());
            this.A03 = C000200d.A00(r1.A0z.A5a);
            AnonymousClass10E r12 = r1.A10;
            this.A00 = C72453Mb.A0i(r12);
            this.A01 = AnonymousClass10E.A6O(r12);
            this.A02 = AnonymousClass10E.A6Q(r12);
        }
        View.inflate(context, 2131624559, this);
        this.A06 = C72453Mb.A0g(this, 2131429204);
    }

    public final void setBubbleResolver(AnonymousClass00H r2) {
        C18070vi.A0d(r2, 0);
        this.A03 = r2;
    }

    public final void setConversationFont(AnonymousClass4VN r2) {
        C18070vi.A0d(r2, 0);
        this.A00 = r2;
    }

    public final void setTime(AnonymousClass11P r2) {
        C18070vi.A0d(r2, 0);
        this.A01 = r2;
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

    public final AnonymousClass00H getBubbleResolver() {
        AnonymousClass00H r0 = this.A03;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("bubbleResolver");
        throw null;
    }

    public final AnonymousClass4VN getConversationFont() {
        AnonymousClass4VN r0 = this.A00;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("conversationFont");
        throw null;
    }

    public final AnonymousClass11P getTime() {
        AnonymousClass11P r0 = this.A01;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("time");
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
