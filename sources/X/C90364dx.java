package X;

import android.view.View;
import android.view.ViewStub;
import android.widget.TextView;
import com.whatsapp.components.TextAndDateLayout;

/* renamed from: X.4dx  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C90364dx implements ViewStub.OnInflateListener {
    public final /* synthetic */ TextAndDateLayout A00;

    public final void onInflate(ViewStub viewStub, View view) {
        TextView textView = (TextView) view;
        textView.addTextChangedListener(new C89544cd(textView, this.A00, 2));
    }

    public /* synthetic */ C90364dx(TextAndDateLayout textAndDateLayout) {
        this.A00 = textAndDateLayout;
    }
}
