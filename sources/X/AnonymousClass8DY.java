package X;

import android.widget.LinearLayout;
import com.whatsapp.TextEmojiLabel;

/* renamed from: X.8DY  reason: invalid class name */
public class AnonymousClass8DY extends LinearLayout implements AnonymousClass009 {
    public TextEmojiLabel A00;
    public C198539yV A01;
    public AnonymousClass031 A02;
    public boolean A03;

    public final Object generatedComponent() {
        AnonymousClass031 r0 = this.A02;
        if (r0 == null) {
            r0 = AnonymousClass3MW.A0u(this);
            this.A02 = r0;
        }
        return r0.generatedComponent();
    }

    public void setFAQLink(String str) {
        C198539yV.A00(getContext(), this.A00, this.A01, getContext().getString(2131887020), "account-and-profile", str);
    }
}
