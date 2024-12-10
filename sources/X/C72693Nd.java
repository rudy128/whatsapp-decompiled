package X;

import android.content.Intent;
import android.text.style.ClickableSpan;
import android.view.View;
import com.whatsapp.text.SeeMoreTextView;

/* renamed from: X.3Nd  reason: invalid class name and case insensitive filesystem */
public class C72693Nd extends ClickableSpan {
    public final int A00;
    public final Object A01;

    public C72693Nd(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public void onClick(View view) {
        if (this.A00 != 0) {
            SeeMoreTextView seeMoreTextView = (SeeMoreTextView) this.A01;
            if (!seeMoreTextView.A03) {
                seeMoreTextView.A03 = true;
                seeMoreTextView.setText(seeMoreTextView.A01);
                return;
            }
            return;
        }
        Intent intent = new Intent("android.settings.DATE_SETTINGS");
        C74753cQ r0 = (C74753cQ) this.A01;
        r0.A00.A08(r0.A00, intent);
    }
}
