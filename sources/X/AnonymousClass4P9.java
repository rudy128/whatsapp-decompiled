package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.SwitchCompat;

/* renamed from: X.4P9  reason: invalid class name */
public final class AnonymousClass4P9 {
    public final View A00;
    public final TextView A01;
    public final SwitchCompat A02;
    public final C18000vb A03;
    public final C18090vk A04;
    public final C18090vk A05;
    public final LayoutInflater A06;
    public final ViewGroup A07;
    public final Button A08;
    public final LinearLayout A09;

    public AnonymousClass4P9(LayoutInflater layoutInflater, ViewGroup viewGroup, C18000vb r6, C18090vk r7, C18090vk r8) {
        boolean A1Z = C72453Mb.A1Z(layoutInflater);
        C18070vi.A0d(r6, 6);
        this.A06 = layoutInflater;
        this.A07 = viewGroup;
        this.A05 = r7;
        this.A04 = r8;
        this.A03 = r6;
        View A0B = AnonymousClass3MX.A0B(layoutInflater, viewGroup, 2131625099, A1Z);
        this.A00 = A0B;
        LinearLayout linearLayout = (LinearLayout) AnonymousClass3MX.A0C(A0B, 2131431957);
        this.A09 = linearLayout;
        this.A01 = C72453Mb.A0W(A0B, 2131428265);
        this.A02 = (SwitchCompat) AnonymousClass3MX.A0C(A0B, 2131435956);
        Button button = (Button) AnonymousClass3MX.A0C(A0B, 2131428600);
        this.A08 = button;
        C89974dK.A00(linearLayout, this, 42);
        C89974dK.A00(button, this, 43);
    }
}
