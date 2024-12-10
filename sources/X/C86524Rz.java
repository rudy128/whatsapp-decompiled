package X;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.RadioButton;
import android.widget.TextView;
import com.whatsapp.util.Log;

/* renamed from: X.4Rz  reason: invalid class name and case insensitive filesystem */
public final class C86524Rz {
    public ViewGroup A00;
    public ViewGroup A01;
    public RadioButton A02;

    public final void A01(RadioButton radioButton) {
        String str;
        ViewGroup viewGroup;
        C18070vi.A0d(radioButton, 0);
        RadioButton radioButton2 = this.A02;
        if (radioButton != radioButton2) {
            if (radioButton2 != null) {
                A00();
            }
            ViewParent parent = radioButton.getParent();
            if (!(parent instanceof ViewGroup) || (viewGroup = (ViewGroup) parent) == null) {
                str = "PrivacyRadioSpinner: cannot wrap";
            } else {
                View inflate = AnonymousClass3MZ.A0D(radioButton).inflate(2131626608, viewGroup, false);
                if (!(inflate instanceof ViewGroup)) {
                    str = "PrivacyRadioSpinner: substitute layout unexpectedly not a ViewGroup";
                } else {
                    View findViewById = inflate.findViewById(2131434089);
                    if (findViewById instanceof TextView) {
                        ((TextView) findViewById).setText(radioButton.getText());
                    }
                    int indexOfChild = viewGroup.indexOfChild(radioButton);
                    viewGroup.removeViewAt(indexOfChild);
                    viewGroup.addView(inflate, indexOfChild);
                    radioButton.setVisibility(4);
                    ViewGroup viewGroup2 = (ViewGroup) inflate;
                    viewGroup2.addView(radioButton);
                    this.A02 = radioButton;
                    this.A01 = viewGroup2;
                    this.A00 = viewGroup;
                    return;
                }
            }
            Log.e(str);
        }
    }

    public final void A00() {
        RadioButton radioButton = this.A02;
        ViewGroup viewGroup = this.A01;
        ViewGroup viewGroup2 = this.A00;
        if (!(radioButton == null || viewGroup == null || viewGroup2 == null)) {
            int indexOfChild = viewGroup2.indexOfChild(viewGroup);
            viewGroup2.removeViewAt(indexOfChild);
            viewGroup.removeView(radioButton);
            viewGroup2.addView(radioButton, indexOfChild);
            radioButton.setVisibility(0);
        }
        this.A02 = null;
        this.A01 = null;
        this.A00 = null;
    }
}
