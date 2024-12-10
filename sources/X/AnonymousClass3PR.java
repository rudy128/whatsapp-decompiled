package X;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.whatsapp.webpagepreview.WebPagePreviewView;

/* renamed from: X.3PR  reason: invalid class name */
public abstract class AnonymousClass3PR extends FrameLayout implements AnonymousClass009 {
    public AnonymousClass031 A00;
    public boolean A01;

    public void A0E() {
        if (!this.A01) {
            this.A01 = true;
            WebPagePreviewView webPagePreviewView = (WebPagePreviewView) this;
            C27691Xc r3 = (C27691Xc) ((AnonymousClass033) generatedComponent());
            AnonymousClass10E r1 = r3.A10;
            webPagePreviewView.A0P = AnonymousClass10E.A8r(r1);
            webPagePreviewView.A0C = AnonymousClass10E.A12(r1);
            webPagePreviewView.A0S = AnonymousClass10E.AL1(r1);
            webPagePreviewView.A0Q = AnonymousClass3MY.A0d(r1);
            webPagePreviewView.A0O = AnonymousClass3Ma.A0f(r1);
            webPagePreviewView.A0H = AnonymousClass3MZ.A0V(r3.A0z);
            webPagePreviewView.A0N = (C32981i4) r1.A3G.get();
            webPagePreviewView.A0L = AnonymousClass10E.A6Q(r1);
            webPagePreviewView.A0M = (C36391no) r1.A8P.get();
        }
    }

    public final Object generatedComponent() {
        AnonymousClass031 r0 = this.A00;
        if (r0 == null) {
            r0 = AnonymousClass3MW.A0u(this);
            this.A00 = r0;
        }
        return r0.generatedComponent();
    }

    public AnonymousClass3PR(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A0E();
    }
}
