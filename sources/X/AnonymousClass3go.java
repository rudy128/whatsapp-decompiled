package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.WaFrameLayout;

/* renamed from: X.3go  reason: invalid class name */
public final class AnonymousClass3go extends WaFrameLayout {
    public C18030ve A00;
    public boolean A01;
    public final TextEmojiLabel A02;

    public AnonymousClass3go(Context context) {
        super(context, (AttributeSet) null);
        A04();
        LayoutInflater.from(context).inflate(2131624847, this, true);
        TextEmojiLabel A0c = C72453Mb.A0c(this, 2131431525);
        this.A02 = A0c;
        A0c.setLongClickable(C72483Me.A1A(A0c, A0c.getAbProps()));
    }

    public final void setAbProps(C18030ve r2) {
        C18070vi.A0d(r2, 0);
        this.A00 = r2;
    }

    public final C18030ve getAbProps() {
        C18030ve r0 = this.A00;
        if (r0 != null) {
            return r0;
        }
        AnonymousClass3MW.A1A();
        throw null;
    }
}
