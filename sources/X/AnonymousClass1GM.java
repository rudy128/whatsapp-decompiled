package X;

import android.app.Dialog;
import android.view.View;
import android.view.Window;
import androidx.fragment.app.Fragment;

/* renamed from: X.1GM  reason: invalid class name */
public abstract class AnonymousClass1GM {
    public View A00(int i) {
        if (this instanceof AnonymousClass1GO) {
            return ((AnonymousClass1GO) this).A04.findViewById(i);
        }
        if (this instanceof C36051nG) {
            Fragment fragment = ((C36051nG) this).A00;
            View view = fragment.A0B;
            if (view != null) {
                return view.findViewById(i);
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Fragment ");
            sb.append(fragment);
            sb.append(" does not have a view");
            throw new IllegalStateException(sb.toString());
        }
        C451427k r2 = (C451427k) this;
        AnonymousClass1GM r1 = r2.A01;
        if (r1.A01()) {
            return r1.A00(i);
        }
        Dialog dialog = r2.A00.A03;
        if (dialog != null) {
            return dialog.findViewById(i);
        }
        return null;
    }

    public boolean A01() {
        if (this instanceof AnonymousClass1GO) {
            Window window = ((AnonymousClass1GO) this).A04.getWindow();
            if (window == null || window.peekDecorView() == null) {
                return false;
            }
            return true;
        } else if (!(this instanceof C36051nG)) {
            C451427k r1 = (C451427k) this;
            if (r1.A01.A01() || r1.A00.A0A) {
                return true;
            }
            return false;
        } else if (((C36051nG) this).A00.A0B != null) {
            return true;
        } else {
            return false;
        }
    }
}
