package X;

import android.widget.CompoundButton;
import com.whatsapp.interopui.notification.InteropNotifOptInViewModel;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.4ek  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C90854ek implements CompoundButton.OnCheckedChangeListener {
    public final /* synthetic */ AnonymousClass42C A00;
    public final /* synthetic */ C86884Tl A01;
    public final /* synthetic */ C86884Tl A02;

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        C86884Tl r1;
        C86884Tl r2 = this.A01;
        C86884Tl r8 = this.A02;
        AnonymousClass42C r12 = this.A00;
        List list = C42011xT.A0I;
        r2.A00 = z;
        r8.A00 = z;
        InteropNotifOptInViewModel interopNotifOptInViewModel = r12.A00;
        boolean A1a = C72463Mc.A1a(interopNotifOptInViewModel.A05);
        Iterable<C86884Tl> iterable = (Iterable) interopNotifOptInViewModel.A06.getValue();
        ArrayList A0D = C29351c6.A0D(iterable);
        for (C86884Tl r4 : iterable) {
            C89514ca r3 = r4.A01;
            int i = r3.A00;
            C89514ca r22 = r8.A01;
            if (i == r22.A00) {
                r1 = new C86884Tl(r22, r8.A00);
            } else {
                r1 = new C86884Tl(r3, r4.A00);
            }
            A0D.add(r1);
        }
        InteropNotifOptInViewModel.A00(interopNotifOptInViewModel, A0D, A1a);
    }

    public /* synthetic */ C90854ek(AnonymousClass42C r1, C86884Tl r2, C86884Tl r3) {
        this.A01 = r2;
        this.A02 = r3;
        this.A00 = r1;
    }
}
