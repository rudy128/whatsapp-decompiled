package X;

import android.widget.TextView;
import com.whatsapp.calling.callrating.CallRatingFragment;

/* renamed from: X.5Qq  reason: invalid class name and case insensitive filesystem */
public final class C105085Qq extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ CallRatingFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C105085Qq(CallRatingFragment callRatingFragment) {
        super(1);
        this.this$0 = callRatingFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        int i;
        Number number = (Number) obj;
        TextView textView = this.this$0.A00;
        if (textView != null) {
            if (number == null || number.intValue() != -1) {
                textView.setText(AnonymousClass3MY.A03(number));
                i = 0;
            } else {
                i = 4;
            }
            textView.setVisibility(i);
        }
        return C27621Wu.A00;
    }
}
