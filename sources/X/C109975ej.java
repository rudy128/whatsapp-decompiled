package X;

import android.graphics.Outline;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewOutlineProvider;

/* renamed from: X.5ej  reason: invalid class name and case insensitive filesystem */
public class C109975ej extends ViewOutlineProvider {
    public final /* synthetic */ C109945eR A00;

    public C109975ej(C109945eR r1) {
        this.A00 = r1;
    }

    public void getOutline(View view, Outline outline) {
        C109945eR r2 = this.A00;
        outline.setAlpha(((float) r2.A0K) / 255.0f);
        Rect A07 = AnonymousClass3MW.A07();
        r2.A0X.roundOut(A07);
        outline.setRoundRect(A07, (float) r2.A0J);
    }
}
