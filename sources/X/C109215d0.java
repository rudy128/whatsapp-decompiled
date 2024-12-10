package X;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.TextView;
import androidx.core.view.inputmethod.EditorInfoCompat;

/* renamed from: X.5d0  reason: invalid class name and case insensitive filesystem */
public final class C109215d0 extends Dialog implements AnonymousClass87U {
    public View A00;
    public AnonymousClass11C A01;
    public String A02;

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(this.A00);
        ((TextView) findViewById(2131434209)).setText(this.A02);
        AnonymousClass78K.A00(findViewById(2131430123), this, 30);
        Window window = getWindow();
        if (window != null) {
            window.setLayout(-1, -1);
            window.setFlags(EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH, EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH);
            window.clearFlags(256);
            if (AnonymousClass112.A05()) {
                window.getAttributes().layoutInDisplayCutoutMode = 1;
            }
            C39761tb.A00(this.A00, window, this.A01);
            window.setSoftInputMode(5);
        }
    }
}
