package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.List;

/* renamed from: X.6Hv  reason: invalid class name and case insensitive filesystem */
public class C121126Hv extends C145227Kl {
    public View A00;
    public List A01;
    public final int A02;
    public final C26631Sw A03;
    public final AnonymousClass88B A04;

    public C121126Hv(Context context, LayoutInflater layoutInflater, C18030ve r9, C26631Sw r10, AnonymousClass88B r11, int i, int i2, int i3) {
        super(context, layoutInflater, r9, i2, i3);
        this.A04 = r11;
        this.A03 = r10;
        this.A02 = i;
    }

    public void A03(View view) {
        this.A00 = view.findViewById(2131430354);
    }

    public void BrI(ViewGroup viewGroup, View view, int i) {
        super.BrI(viewGroup, view, i);
        this.A00 = null;
    }
}
