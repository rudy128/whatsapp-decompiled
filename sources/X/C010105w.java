package X;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Message;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.widget.ListView;
import android.widget.TextView;

/* renamed from: X.05w  reason: invalid class name and case insensitive filesystem */
public class C010105w extends AnonymousClass02A implements DialogInterface {
    public final AnonymousClass0QH A00 = new AnonymousClass0QH(getContext(), getWindow(), this);

    public static int A00(Context context, int i) {
        if (((i >>> 24) & 255) >= 1) {
            return i;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(2130968656, typedValue, true);
        return typedValue.resourceId;
    }

    public ListView A07() {
        return this.A00.A0K;
    }

    public void A08(int i, CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        AnonymousClass0QH r2 = this.A00;
        Message obtainMessage = r2.A09.obtainMessage(i, onClickListener);
        if (i == -3) {
            r2.A0P = charSequence;
            r2.A0B = obtainMessage;
        } else if (i != -2) {
            r2.A0Q = charSequence;
            r2.A0C = obtainMessage;
        } else {
            r2.A0O = charSequence;
            r2.A0A = obtainMessage;
        }
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (this.A00.A07(keyEvent)) {
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (this.A00.A08(keyEvent)) {
            return true;
        }
        return super.onKeyUp(i, keyEvent);
    }

    public C010105w(Context context, int i) {
        super(context, A00(context, i));
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.A00.A06();
    }

    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        AnonymousClass0QH r0 = this.A00;
        r0.A0S = charSequence;
        TextView textView = r0.A0M;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }
}
