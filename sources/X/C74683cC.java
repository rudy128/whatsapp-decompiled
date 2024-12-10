package X;

import android.content.Context;
import android.text.TextPaint;
import android.text.style.URLSpan;
import android.view.View;
import com.whatsapp.text.ReadMoreTextView;
import java.util.Map;

/* renamed from: X.3cC  reason: invalid class name and case insensitive filesystem */
public class C74683cC extends C39381sz {
    public final int A00;
    public final Object A01;
    public final Object A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C74683cC(Context context, Object obj, Object obj2, int i, int i2) {
        super(context, i);
        this.A00 = i2;
        this.A01 = obj2;
        this.A02 = obj;
    }

    public void onClick(View view) {
        int i = this.A00;
        Object obj = this.A01;
        if (i != 0) {
            Runnable runnable = (Runnable) ((Map) obj).get(((URLSpan) this.A02).getURL());
            if (runnable != null) {
                runnable.run();
                return;
            }
            return;
        }
        C98734rd r1 = (C98734rd) obj;
        r1.A01 = 0;
        r1.A00 = 0;
        ReadMoreTextView readMoreTextView = (ReadMoreTextView) this.A02;
        C107685aQ r0 = readMoreTextView.A03;
        if (r0 == null || !r0.Bor()) {
            readMoreTextView.setExpanded(true);
            readMoreTextView.A09.removeCallbacksAndMessages((Object) null);
        }
    }

    public void updateDrawState(TextPaint textPaint) {
        if (1 - this.A00 != 0) {
            super.updateDrawState(textPaint);
            return;
        }
        C18070vi.A0d(textPaint, 0);
        super.updateDrawState(textPaint);
    }
}
