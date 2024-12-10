package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.View;
import com.whatsapp.WaImageView;
import com.whatsapp.search.views.MessageThumbView;

/* renamed from: X.6FU  reason: invalid class name */
public final class AnonymousClass6FU extends C116435xG {
    public boolean A00;
    public View A01 = C18070vi.A05(this, 2131433364);
    public WaImageView A02 = C108965cb.A0I(this, 2131431907);
    public WaImageView A03 = C108965cb.A0I(this, 2131435579);
    public MessageThumbView A04 = ((MessageThumbView) C18070vi.A05(this, 2131436134));

    public AnonymousClass6FU(Context context) {
        super(context, (AttributeSet) null);
        A02();
        this.A00 = 1.0f;
        View.inflate(context, 2131626818, this);
        AnonymousClass3MY.A0w(context, this.A04, 2131896451);
        this.A01.setVisibility(0);
    }

    public void setMessage(C441522i r4) {
        C18070vi.A0d(r4, 0);
        this.A03 = r4;
        A04(this.A03, this.A02);
        MessageThumbView messageThumbView = this.A04;
        messageThumbView.A01 = this.A00;
        messageThumbView.A00 = 2131233051;
        messageThumbView.A06(r4, false);
    }

    public void setRadius(int i) {
        this.A00 = i;
        if (i > 0) {
            View view = this.A01;
            AnonymousClass3MY.A0v(getContext(), view, 2131232923);
            C108965cb.A12(view, -1);
            Drawable background = view.getBackground();
            C18070vi.A0z(background, "null cannot be cast to non-null type android.graphics.drawable.GradientDrawable");
            ((GradientDrawable) background).setCornerRadius((float) i);
        }
    }
}
