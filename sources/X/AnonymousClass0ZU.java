package X;

import android.graphics.Typeface;
import android.widget.TextView;

/* renamed from: X.0ZU  reason: invalid class name */
public class AnonymousClass0ZU implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ Typeface A01;
    public final /* synthetic */ TextView A02;
    public final /* synthetic */ C007103e A03;

    public AnonymousClass0ZU(Typeface typeface, TextView textView, C007103e r3, int i) {
        this.A03 = r3;
        this.A02 = textView;
        this.A01 = typeface;
        this.A00 = i;
    }

    public void run() {
        this.A02.setTypeface(this.A01, this.A00);
    }
}
