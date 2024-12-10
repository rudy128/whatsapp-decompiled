package X;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.whatsapp.gifsearch.GifSearchContainer;

/* renamed from: X.5fd  reason: invalid class name and case insensitive filesystem */
public abstract class C110435fd extends FrameLayout implements AnonymousClass009 {
    public AnonymousClass031 A00;
    public boolean A01;

    public void A01() {
        if (!this.A01) {
            this.A01 = true;
            GifSearchContainer gifSearchContainer = (GifSearchContainer) this;
            AnonymousClass10E r2 = ((C27691Xc) ((AnonymousClass033) generatedComponent())).A10;
            gifSearchContainer.A0B = AnonymousClass10E.A8r(r2);
            gifSearchContainer.A0D = (AnonymousClass736) r2.AUc.get();
            AnonymousClass10G r1 = r2.A00;
            gifSearchContainer.A0I = (C129036h9) r1.ABb.get();
            gifSearchContainer.A0K = C108975cc.A0P(r1);
            gifSearchContainer.A0J = AnonymousClass3Ma.A0r(r2);
            gifSearchContainer.A07 = AnonymousClass3Ma.A0a(r2);
            gifSearchContainer.A08 = AnonymousClass3Ma.A0c(r2);
            gifSearchContainer.A0L = AnonymousClass10E.AL1(r2);
            gifSearchContainer.A0C = AnonymousClass3Ma.A0g(r2);
            gifSearchContainer.A09 = AnonymousClass10E.A6Q(r2);
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

    public C110435fd(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A01();
    }
}
