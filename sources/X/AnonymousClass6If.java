package X;

import android.text.Editable;
import android.view.View;
import android.widget.TextView;
import com.whatsapp.WaEditText;
import com.whatsapp.picker.search.StickerSearchDialogFragment;

/* renamed from: X.6If  reason: invalid class name */
public class AnonymousClass6If extends C89564cf {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public AnonymousClass6If(Object obj, Object obj2, int i) {
        this.A00 = i;
        this.A02 = obj2;
        this.A01 = obj;
    }

    public void afterTextChanged(Editable editable) {
        if (this.A00 != 0) {
            super.afterTextChanged(editable);
            return;
        }
        C18070vi.A0d(editable, 0);
        C1404471l r4 = (C1404471l) this.A02;
        C43251zV.A07(r4.A03, ((TextView) this.A01).getPaint(), editable, r4.A07, r4.A08);
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        WaEditText waEditText;
        switch (this.A00) {
            case 1:
                C18070vi.A0d(charSequence, 0);
                StickerSearchDialogFragment stickerSearchDialogFragment = (StickerSearchDialogFragment) this.A02;
                Runnable runnable = stickerSearchDialogFragment.A0C;
                if (!(runnable == null || (waEditText = stickerSearchDialogFragment.A05) == null)) {
                    waEditText.removeCallbacks(runnable);
                }
                View view = (View) this.A01;
                AnonymousClass3C5 r3 = new AnonymousClass3C5(stickerSearchDialogFragment, charSequence, view, 6);
                stickerSearchDialogFragment.A0C = r3;
                WaEditText waEditText2 = stickerSearchDialogFragment.A05;
                if (waEditText2 != null) {
                    waEditText2.postDelayed(r3, 500);
                }
                view.setVisibility(0);
                return;
            case 2:
                ((View) this.A02).setEnabled(AnonymousClass000.A1R(charSequence.length()));
                return;
            default:
                super.onTextChanged(charSequence, i, i2, i3);
                return;
        }
    }
}
