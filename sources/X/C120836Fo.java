package X;

import android.content.Context;
import android.util.AttributeSet;
import com.whatsapp.WaTextView;
import com.whatsapp.search.views.MessageThumbView;

/* renamed from: X.6Fo  reason: invalid class name and case insensitive filesystem */
public final class C120836Fo extends AnonymousClass6FV {
    public boolean A00;
    public final WaTextView A01 = AnonymousClass3Ma.A0N(this, 2131432435);
    public final MessageThumbView A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C120836Fo(Context context) {
        super(context, (AttributeSet) null);
        C18070vi.A0d(context, 1);
        this.A02 = true;
        this.A01 = true;
        AnonymousClass6FV.A00(context, this);
        A02();
        MessageThumbView messageThumbView = (MessageThumbView) C18070vi.A05(this, 2131436134);
        this.A02 = messageThumbView;
        AnonymousClass3MY.A0w(context, messageThumbView, 2131890772);
    }

    public float getRatio() {
        return 1.0f;
    }

    public void setMessage(C440021t r3) {
        C18070vi.A0d(r3, 0);
        super.setMessage(r3);
        MessageThumbView messageThumbView = this.A02;
        messageThumbView.setVisibility(0);
        messageThumbView.A01 = this.A00;
        messageThumbView.A06(r3, true);
        WaTextView waTextView = this.A01;
        AnonymousClass3MW.A1S(waTextView);
        waTextView.setVisibility(8);
    }

    public int getMark() {
        return 2131232594;
    }
}
