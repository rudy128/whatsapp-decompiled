package X;

import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import com.whatsapp.WaEditText;

/* renamed from: X.Bpo  reason: case insensitive filesystem */
public final class C23800Bpo extends WaEditText {
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        C18070vi.A0d(editorInfo, 0);
        editorInfo.actionLabel = null;
        editorInfo.inputType = 0;
        BaseInputConnection baseInputConnection = new BaseInputConnection(this, false);
        try {
            InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
            if (onCreateInputConnection != null) {
                return new BI0(baseInputConnection, onCreateInputConnection);
            }
            return null;
        } catch (Exception unused) {
            return super.onCreateInputConnection(editorInfo);
        }
    }
}
