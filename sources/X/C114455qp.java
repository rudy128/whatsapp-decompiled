package X;

import android.content.Context;
import android.util.AttributeSet;
import com.google.android.material.tabs.TabLayout;
import com.whatsapp.camera.mode.CameraModeTabLayout;

/* renamed from: X.5qp  reason: invalid class name and case insensitive filesystem */
public abstract class C114455qp extends TabLayout implements AnonymousClass009 {
    public AnonymousClass031 A00;
    public boolean A01;

    public void A0K() {
        if (this instanceof CameraModeTabLayout) {
            CameraModeTabLayout cameraModeTabLayout = (CameraModeTabLayout) this;
            if (!cameraModeTabLayout.A04) {
                cameraModeTabLayout.A04 = true;
                AnonymousClass10E A0X = C72463Mc.A0X(cameraModeTabLayout);
                cameraModeTabLayout.A01 = AnonymousClass3Ma.A0a(A0X);
                cameraModeTabLayout.A02 = AnonymousClass10E.A6Q(A0X);
                cameraModeTabLayout.A02 = C000200d.A00(A0X.A00.ADC);
            }
        } else if (!this.A01) {
            this.A01 = true;
            AnonymousClass6IX r2 = (AnonymousClass6IX) this;
            AnonymousClass10E r1 = ((C27691Xc) ((AnonymousClass033) generatedComponent())).A10;
            r2.A01 = AnonymousClass3Ma.A0a(r1);
            r2.A02 = AnonymousClass10E.A6Q(r1);
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

    public C114455qp(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A0K();
    }
}
