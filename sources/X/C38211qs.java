package X;

import android.content.Context;
import android.util.AttributeSet;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.WaTextView;

/* renamed from: X.1qs  reason: invalid class name and case insensitive filesystem */
public abstract class C38211qs extends AnonymousClass03P implements AnonymousClass009 {
    public AnonymousClass031 A00;
    public boolean A01;

    public void A0I() {
        if (this instanceof C39361sw) {
            C39361sw r2 = (C39361sw) this;
            if (!r2.A00) {
                r2.A00 = true;
                TextEmojiLabel textEmojiLabel = (TextEmojiLabel) r2;
                AnonymousClass10E r1 = ((C27691Xc) ((AnonymousClass033) r2.generatedComponent())).A10;
                textEmojiLabel.A04 = (C18030ve) r1.A04.get();
                textEmojiLabel.A02 = (AnonymousClass11C) r1.AAp.get();
                textEmojiLabel.A03 = (C18000vb) r1.ABz.get();
                textEmojiLabel.A02 = (AnonymousClass1KW) r1.A3d.get();
                textEmojiLabel.A01 = (AnonymousClass1L2) r1.A00.A40.get();
                textEmojiLabel.A03 = (C18010vc) r1.A9s.get();
            }
        } else if (!this.A01) {
            this.A01 = true;
            WaTextView waTextView = (WaTextView) this;
            AnonymousClass10E r12 = ((C27691Xc) ((AnonymousClass033) generatedComponent())).A10;
            waTextView.A04 = (C18030ve) r12.A04.get();
            waTextView.A02 = (AnonymousClass11C) r12.AAp.get();
            waTextView.A03 = (C18000vb) r12.ABz.get();
        }
    }

    public final Object generatedComponent() {
        AnonymousClass031 r0 = this.A00;
        if (r0 == null) {
            r0 = new AnonymousClass031(this);
            this.A00 = r0;
        }
        return r0.generatedComponent();
    }

    public C38211qs(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A0I();
    }
}
