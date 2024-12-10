package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.WaFrameLayout;

/* renamed from: X.6FZ  reason: invalid class name */
public abstract class AnonymousClass6FZ extends C110385fY {
    public C108355bZ A00;
    public final ViewGroup A01 = AnonymousClass3MW.A0C(this, 2131434929);
    public final ViewGroup A02 = AnonymousClass3MW.A0C(this, 2131434930);

    public abstract View A02();

    public abstract View A03();

    public AnonymousClass6FZ(Context context) {
        super(context);
        A01();
        View.inflate(getContext(), 2131626813, this);
        ((WaFrameLayout) AnonymousClass1HF.A06(this, 2131431007)).setForeground(this.A00.BS0(AnonymousClass00R.A01, 2, false));
    }

    public void A04() {
        View A03 = A03();
        if (A03 != null) {
            this.A02.addView(A03);
        }
        View A022 = A02();
        if (A022 != null) {
            this.A01.addView(A022);
        }
    }
}
