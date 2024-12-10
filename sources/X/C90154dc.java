package X;

import android.text.TextWatcher;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.view.View;
import android.widget.TextView;
import java.util.List;

/* renamed from: X.4dc  reason: invalid class name and case insensitive filesystem */
public final class C90154dc implements View.OnFocusChangeListener {
    public TextView A00;
    public TextView A01;
    public final List A02;

    public static final void A00(TransformationMethod transformationMethod, TextView textView) {
        TextWatcher textWatcher;
        C18070vi.A0d(textView, 0);
        Object tag = textView.getTag(2131436093);
        if (!(tag instanceof TextWatcher) || (textWatcher = (TextWatcher) tag) == null) {
            textView.setTransformationMethod(transformationMethod);
            return;
        }
        textView.removeTextChangedListener(textWatcher);
        textView.setTransformationMethod(transformationMethod);
        textView.addTextChangedListener(textWatcher);
    }

    public void onFocusChange(View view, boolean z) {
        TextView textView;
        if (z && (view instanceof TextView)) {
            TextView textView2 = (TextView) view;
            CharSequence text = textView2.getText();
            if (text == null || text.length() == 0) {
                List list = this.A02;
                int indexOf = list.indexOf(textView2);
                if (indexOf > 0) {
                    textView = (TextView) list.get(indexOf - 1);
                } else {
                    textView = null;
                }
            } else {
                textView = null;
            }
            A00(PasswordTransformationMethod.getInstance(), this.A00);
            TextView textView3 = this.A01;
            if (textView3 != null) {
                A00(PasswordTransformationMethod.getInstance(), textView3);
            }
            if (textView != null) {
                A00((TransformationMethod) null, textView);
            }
            A00((TransformationMethod) null, textView2);
            this.A01 = textView;
            this.A00 = textView2;
        }
    }

    public C90154dc(List list) {
        PasswordTransformationMethod instance;
        this.A02 = list;
        this.A00 = (TextView) C29431cG.A0b(list);
        int i = 0;
        for (Object next : list) {
            int i2 = i + 1;
            if (i < 0) {
                AnonymousClass1ZU.A0B();
                throw null;
            }
            TextView textView = (TextView) next;
            textView.setOnFocusChangeListener(this);
            if (i == 0) {
                instance = null;
            } else {
                instance = PasswordTransformationMethod.getInstance();
            }
            textView.setTransformationMethod(instance);
            i = i2;
        }
    }
}
