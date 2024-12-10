package X;

import android.app.Activity;
import android.app.Dialog;
import android.os.Bundle;
import android.view.Window;
import androidx.core.view.inputmethod.EditorInfoCompat;
import com.whatsapp.mediacomposer.doodle.textentry.DoodleEditText;
import com.whatsapp.mediacomposer.doodle.textentry.TextEntryView;

/* renamed from: X.5d1  reason: invalid class name and case insensitive filesystem */
public final class C109225d1 extends Dialog implements AnonymousClass87U {
    public int A00;
    public AnonymousClass11C A01;
    public TextEntryView A02;
    public final AnonymousClass7JH A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C109225d1(Activity activity, AnonymousClass11C r3, AnonymousClass7JF r4, C130396jM r5, TextEntryView textEntryView, int i, boolean z) {
        super(activity, 2132083223);
        C18070vi.A0d(textEntryView, 6);
        this.A01 = r3;
        this.A02 = textEntryView;
        this.A00 = i;
        this.A03 = new AnonymousClass7JH(r4, r5, textEntryView, z);
    }

    public static final void A00(C109225d1 r5) {
        r5.setContentView(r5.A02);
        r5.A02.addOnLayoutChangeListener(new AnonymousClass78Z(r5.findViewById(2131429504), r5, 2));
        Window window = r5.getWindow();
        if (window != null) {
            window.setLayout(-1, -1);
            window.setFlags(EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH, EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH);
            window.clearFlags(256);
            if (AnonymousClass112.A05()) {
                window.getAttributes().layoutInDisplayCutoutMode = 1;
            }
            C39761tb.A00(r5.A02, window, r5.A01);
            window.setSoftInputMode(5);
        }
        AnonymousClass7JH r4 = r5.A03;
        r4.A01 = r5;
        r4.A02.A05(r4, r4.A04, r4.A00, r4.A05);
    }

    public final void A01() {
        DoodleEditText doodleEditText = this.A02.A05;
        if (doodleEditText == null) {
            C18070vi.A11("doodleEditText");
            throw null;
        } else {
            doodleEditText.A0I(true);
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        A00(this);
    }
}
