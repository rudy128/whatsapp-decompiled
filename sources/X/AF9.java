package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import com.whatsapp.WaTextView;

public class AF9 implements LayoutInflater.Factory2 {
    public final AnonymousClass013 A00;

    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView((View) null, str, context, attributeSet);
    }

    public AF9(AnonymousClass013 r1) {
        this.A00 = r1;
    }

    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        if ("TextView".equals(str)) {
            return new WaTextView(context, attributeSet);
        }
        return this.A00.A0W(str, context, attributeSet);
    }
}
