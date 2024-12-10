package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.whatsapp.ListItemWithLeftIcon;

/* renamed from: X.3PU  reason: invalid class name */
public final class AnonymousClass3PU extends FrameLayout implements AnonymousClass009 {
    public AnonymousClass1RK A00;
    public C18030ve A01;
    public C81723zh A02;
    public AnonymousClass1EC A03;
    public AnonymousClass031 A04;
    public boolean A05;
    public final ListItemWithLeftIcon A06;
    public final View A07;
    public final C18100vl A08;

    public AnonymousClass3PU(Context context) {
        super(context, (AttributeSet) null);
        if (!this.A05) {
            this.A05 = true;
            AnonymousClass10E A0O = AnonymousClass3MW.A0O(generatedComponent());
            this.A01 = AnonymousClass10E.A8r(A0O);
            this.A00 = AnonymousClass3MZ.A0r(A0O);
        }
        this.A08 = AnonymousClass1DF.A01(new AnonymousClass5F8(context));
        View inflate = View.inflate(context, 2131624408, this);
        C18070vi.A0X(inflate);
        this.A07 = inflate;
        this.A06 = (ListItemWithLeftIcon) AnonymousClass3MX.A0C(inflate, 2131434529);
    }

    public final void setAbProps$app_product_community_community(C18030ve r2) {
        C18070vi.A0d(r2, 0);
        this.A01 = r2;
    }

    public final void setCompanionDeviceManager$app_product_community_community(AnonymousClass1RK r2) {
        C18070vi.A0d(r2, 0);
        this.A00 = r2;
    }

    public final Object generatedComponent() {
        AnonymousClass031 r0 = this.A04;
        if (r0 == null) {
            r0 = AnonymousClass3MW.A0u(this);
            this.A04 = r0;
        }
        return r0.generatedComponent();
    }

    public final C18030ve getAbProps$app_product_community_community() {
        C18030ve r0 = this.A01;
        if (r0 != null) {
            return r0;
        }
        AnonymousClass3MW.A1A();
        throw null;
    }

    public final AnonymousClass1FU getActivity() {
        return (AnonymousClass1FU) this.A08.getValue();
    }

    public final AnonymousClass1RK getCompanionDeviceManager$app_product_community_community() {
        AnonymousClass1RK r0 = this.A00;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("companionDeviceManager");
        throw null;
    }
}
