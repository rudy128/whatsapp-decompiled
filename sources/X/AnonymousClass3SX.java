package X;

import android.os.Bundle;
import android.view.View;
import com.whatsapp.ClearableEditText;
import java.util.List;

/* renamed from: X.3SX  reason: invalid class name */
public class AnonymousClass3SX extends C39401t1 {
    public final /* synthetic */ ClearableEditText A00;

    public void A1h(C26228CvK cvK, int i) {
        if (i == 1) {
            cvK.A0f(true);
            cvK.A0A(16);
            ClearableEditText clearableEditText = this.A00;
            cvK.A0Q(clearableEditText.getContext().getString(2131889895));
            cvK.A02.setBoundsInParent(clearableEditText.getClearBounds());
        }
    }

    public boolean A1m(int i, int i2, Bundle bundle) {
        if (i != 1 || i2 != 16) {
            return false;
        }
        ClearableEditText clearableEditText = this.A00;
        View.OnClickListener onClickListener = clearableEditText.A01;
        if (onClickListener != null) {
            onClickListener.onClick(clearableEditText);
        }
        AnonymousClass3MW.A1S(clearableEditText);
        clearableEditText.requestFocus();
        return true;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass3SX(View view, ClearableEditText clearableEditText) {
        super(view);
        this.A00 = clearableEditText;
    }

    public int A1b(float f, float f2) {
        if (ClearableEditText.A07(this.A00, (int) f, (int) f2)) {
            return 1;
        }
        return Integer.MIN_VALUE;
    }

    public void A1i(List list) {
        if (this.A00.getClearIconDrawable() != null) {
            list.add(C17880vN.A0h());
        }
    }
}
