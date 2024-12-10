package X;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;

/* renamed from: X.279  reason: invalid class name */
public final class AnonymousClass279 extends LinearLayout implements AnonymousClass009 {
    public AnonymousClass1L9 A00;
    public C18030ve A01;
    public AnonymousClass1EC A02;
    public AnonymousClass031 A03;
    public boolean A04;
    public final C28931bI A05;
    public final View A06;
    public final View A07;
    public final View A08;

    public final void setAbProps$app_product_community_community(C18030ve r2) {
        C18070vi.A0d(r2, 0);
        this.A01 = r2;
    }

    public final void setActivityUtils$app_product_community_community(AnonymousClass1L9 r2) {
        C18070vi.A0d(r2, 0);
        this.A00 = r2;
    }

    private final void setUpClickListeners(C38471rL r2, C38471rL r3) {
        this.A06.setOnClickListener(r2);
        this.A07.setOnClickListener(r3);
    }

    public final Object generatedComponent() {
        AnonymousClass031 r0 = this.A03;
        if (r0 == null) {
            r0 = new AnonymousClass031(this);
            this.A03 = r0;
        }
        return r0.generatedComponent();
    }

    public final C18030ve getAbProps$app_product_community_community() {
        C18030ve r0 = this.A01;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("abProps");
        throw null;
    }

    public final AnonymousClass1L9 getActivityUtils$app_product_community_community() {
        AnonymousClass1L9 r0 = this.A00;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("activityUtils");
        throw null;
    }

    public AnonymousClass279(Context context) {
        super(context);
        if (!this.A04) {
            this.A04 = true;
            AnonymousClass10E r1 = ((C27691Xc) ((AnonymousClass033) generatedComponent())).A10;
            this.A01 = AnonymousClass10E.A8r(r1);
            this.A00 = (AnonymousClass1L9) r1.A0E.get();
        }
        Activity A012 = AnonymousClass1L9.A01(context, AnonymousClass01E.class);
        View inflate = View.inflate(getContext(), 2131624575, this);
        C18070vi.A0X(inflate);
        this.A08 = inflate;
        this.A06 = C18070vi.A05(inflate, 2131430246);
        this.A07 = C18070vi.A05(inflate, 2131432259);
        this.A05 = new C28931bI(findViewById(2131429282));
        setUpClickListeners(new C825248h(A012, this, 31), new C825248h(context, this, 32));
    }
}
