package X;

import android.view.View;
import android.view.ViewTreeObserver;
import com.whatsapp.HomeActivity;

/* renamed from: X.1cQ  reason: invalid class name and case insensitive filesystem */
public class C29521cQ implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ View A00;
    public final /* synthetic */ HomeActivity A01;

    public C29521cQ(View view, HomeActivity homeActivity) {
        this.A01 = homeActivity;
        this.A00 = view;
    }

    public boolean onPreDraw() {
        this.A00.getViewTreeObserver().removeOnPreDrawListener(this);
        this.A01.A05.A0J(new C449025f((Object) this, 26));
        return true;
    }
}
