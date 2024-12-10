package com.facebook.primitive.textinput;

import X.AnonymousClass1HF;
import X.AnonymousClass1Y1;
import X.AnonymousClass3MW;
import X.C18070vi;
import X.D6W;
import X.E1H;
import X.E1I;
import X.E1J;
import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
import androidx.core.view.inputmethod.EditorInfoCompat;
import androidx.core.view.inputmethod.InputConnectionCompat;
import java.lang.ref.WeakReference;

public final class TextInputView extends EditText implements E1I {
    public E1H A00;
    public E1J A01;
    public String[] A02;
    public boolean A03;

    public /* synthetic */ TextInputView(Context context, AnonymousClass1Y1 r3) {
        super(context, (AttributeSet) null);
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        String[] strArr;
        C18070vi.A0d(editorInfo, 0);
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        if (onCreateInputConnection == null || this.A00 == null || ((strArr = this.A02) != null && strArr.length == 0)) {
            return onCreateInputConnection;
        }
        WeakReference A0z = AnonymousClass3MW.A0z(this);
        EditorInfoCompat.setContentMimeTypes(editorInfo, this.A02);
        InputConnection createWrapper = InputConnectionCompat.createWrapper((View) this, onCreateInputConnection, editorInfo);
        AnonymousClass1HF.A0i(this, new D6W(A0z), this.A02);
        return createWrapper;
    }

    public final boolean A00() {
        if (Build.VERSION.SDK_INT >= 29) {
            return isSingleLine();
        }
        return this.A03;
    }

    public final E1J getSelectionChangedListener$fbandroid_libraries_rendercore_rendercore_primitive_components_textinput_textinput() {
        return null;
    }

    public void setSelection(int i, int i2) {
        int length = length();
        if (i > length) {
            i = length;
        }
        int length2 = length();
        if (i2 > length2) {
            i2 = length2;
        }
        super.setSelection(i, i2);
    }

    public void setSingleLine(boolean z) {
        super.setSingleLine(z);
        this.A03 = z;
    }

    public void setAllowedContentTypes(String[] strArr) {
        this.A02 = strArr;
    }

    public void setContentCommittedListener(E1H e1h) {
        this.A00 = e1h;
    }

    public final void setSelectionChangedListener$fbandroid_libraries_rendercore_rendercore_primitive_components_textinput_textinput(E1J e1j) {
        this.A01 = e1j;
    }

    public void onSelectionChanged(int i, int i2) {
        super.onSelectionChanged(i, i2);
    }

    public TextInputView(Context context) {
        super(context, (AttributeSet) null);
    }

    public void setSelection(int i) {
        int length = length();
        if (i > length) {
            i = length;
        }
        super.setSelection(i);
    }

    public TextInputView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
