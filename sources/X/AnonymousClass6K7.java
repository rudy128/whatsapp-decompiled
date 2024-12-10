package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.whatsapp.updates.ui.UpdatesFragment;

/* renamed from: X.6K7  reason: invalid class name */
public final class AnonymousClass6K7 extends C113585nK {
    public final View A00;
    public final ViewGroup A01;
    public final UpdatesFragment A02;

    public AnonymousClass6K7(View view, UpdatesFragment updatesFragment, boolean z, boolean z2) {
        super(view);
        this.A02 = updatesFragment;
        View findViewById = view.findViewById(2131430073);
        this.A00 = findViewById;
        ViewGroup A0D = AnonymousClass3MW.A0D(view, 2131435059);
        this.A01 = A0D;
        TextView A0E = C17880vN.A0E(view, 2131436546);
        TextView A0E2 = C17880vN.A0E(view, 2131435061);
        A0E.setText(2131892798);
        C43421zm.A04(A0E);
        A0E2.setText(2131892797);
        C43421zm.A04(A0E2);
        C18070vi.A0X(findViewById);
        int i = 0;
        findViewById.setVisibility(C72453Mb.A07(z ? 1 : 0));
        AnonymousClass3MX.A0C(view, 2131432786).setVisibility(8);
        C18070vi.A0V(A0D);
        A0D.setVisibility(!z2 ? 8 : i);
        AnonymousClass3Ma.A1E(A0D, this, 46);
        AnonymousClass1Y5.A0A(view, true);
    }
}
