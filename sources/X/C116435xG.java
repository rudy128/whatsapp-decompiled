package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.whatsapp.components.AspectRatioFrameLayout;

/* renamed from: X.5xG  reason: invalid class name and case insensitive filesystem */
public abstract class C116435xG extends AspectRatioFrameLayout {
    public int A00;
    public boolean A01 = true;
    public boolean A02 = true;
    public AnonymousClass206 A03;

    public abstract void setMessage(AnonymousClass21V r1);

    public void setScrolling(boolean z) {
    }

    public void setShouldPlay(boolean z) {
    }

    public void A04(View view, View view2) {
        AnonymousClass206 r0 = this.A03;
        if (r0 != null) {
            if (!r0.A0q || !this.A02) {
                view.setVisibility(8);
            } else {
                view.setVisibility(0);
            }
            AnonymousClass206 r02 = this.A03;
            C18070vi.A0d(r02, 0);
            if (1 != r02.A0C() || !this.A01) {
                view2.setVisibility(8);
            } else {
                view2.setVisibility(0);
            }
        }
    }

    public C116435xG(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public void setRadius(int i) {
        this.A00 = i;
    }
}
