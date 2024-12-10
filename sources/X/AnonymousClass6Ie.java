package X;

import android.text.Editable;
import com.whatsapp.contact.picker.SharedTextPreviewDialogFragment;

/* renamed from: X.6Ie  reason: invalid class name */
public class AnonymousClass6Ie extends C89564cf {
    public boolean A00;
    public final /* synthetic */ SharedTextPreviewDialogFragment A01;

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        int codePointCount;
        boolean z = false;
        if (i3 > i2 && ((codePointCount = Character.codePointCount(charSequence, i, i3 + i)) > 1 || (codePointCount == 1 && Character.isWhitespace(Character.codePointAt(charSequence, i))))) {
            z = true;
        }
        this.A00 = z;
    }

    public AnonymousClass6Ie(SharedTextPreviewDialogFragment sharedTextPreviewDialogFragment) {
        this.A01 = sharedTextPreviewDialogFragment;
    }

    public void afterTextChanged(Editable editable) {
        SharedTextPreviewDialogFragment sharedTextPreviewDialogFragment = this.A01;
        C18030ve r9 = sharedTextPreviewDialogFragment.A02;
        AnonymousClass1FL A1B = sharedTextPreviewDialogFragment.A1B();
        AnonymousClass1KW r8 = sharedTextPreviewDialogFragment.A09;
        Editable editable2 = editable;
        C26302CxJ.A0L(A1B, editable2, sharedTextPreviewDialogFragment.A0D.getPaint(), sharedTextPreviewDialogFragment.A08, r8, r9, sharedTextPreviewDialogFragment.A0E, AnonymousClass1YL.A00(sharedTextPreviewDialogFragment.A1n(), 2130970892, 2131102330), AnonymousClass1YL.A00(sharedTextPreviewDialogFragment.A1n(), 2130970132, 2131101250), true);
        SharedTextPreviewDialogFragment.A01(editable, sharedTextPreviewDialogFragment, this.A00);
    }
}
