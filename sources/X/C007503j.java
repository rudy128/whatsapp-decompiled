package X;

import android.graphics.Typeface;
import android.os.Build;
import android.widget.TextView;
import java.lang.ref.WeakReference;

/* renamed from: X.03j  reason: invalid class name and case insensitive filesystem */
public class C007503j extends C28251Zq {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ C007103e A02;
    public final /* synthetic */ WeakReference A03;

    public void A01(int i) {
    }

    public C007503j(C007103e r1, WeakReference weakReference, int i, int i2) {
        this.A02 = r1;
        this.A00 = i;
        this.A01 = i2;
        this.A03 = weakReference;
    }

    public void A03(Typeface typeface) {
        int i;
        if (Build.VERSION.SDK_INT >= 28 && (i = this.A00) != -1) {
            boolean z = false;
            if ((this.A01 & 2) != 0) {
                z = true;
            }
            typeface = AnonymousClass0DC.A00(typeface, i, z);
        }
        C007103e r3 = this.A02;
        WeakReference weakReference = this.A03;
        if (r3.A09) {
            r3.A01 = typeface;
            TextView textView = (TextView) weakReference.get();
            if (textView != null) {
                boolean isAttachedToWindow = textView.isAttachedToWindow();
                int i2 = r3.A00;
                if (isAttachedToWindow) {
                    textView.post(new AnonymousClass0ZU(typeface, textView, r3, i2));
                } else {
                    textView.setTypeface(typeface, i2);
                }
            }
        }
    }
}
