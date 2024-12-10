package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

/* renamed from: X.DFr  reason: case insensitive filesystem */
public final class C26835DFr implements AnonymousClass0sY {
    public static final C26835DFr A00 = new C26835DFr();

    public /* bridge */ /* synthetic */ Object BC3(Context context) {
        try {
            EditText editText = new EditText(context, (AttributeSet) null);
            editText.setBackgroundResource(17170445);
            return editText;
        } catch (NullPointerException e) {
            String message = e.getMessage();
            if (message == null || !AnonymousClass1YF.A0V(message, "ConstantState.newDrawable")) {
                throw e;
            }
            View A09 = AnonymousClass3MX.A09(LayoutInflater.from(context), (ViewGroup) null, 2131625301);
            C18070vi.A0z(A09, "null cannot be cast to non-null type com.facebook.primitive.textinput.TextInputView");
            return A09;
        }
    }
}
