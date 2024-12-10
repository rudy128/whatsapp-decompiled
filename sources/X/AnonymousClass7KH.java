package X;

import android.content.Context;
import com.whatsapp.updates.viewmodels.UpdatesViewModel;
import java.lang.ref.Reference;

/* renamed from: X.7KH  reason: invalid class name */
public class AnonymousClass7KH implements C1601087d {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    public AnonymousClass7KH(Object obj, Object obj2, Object obj3, int i) {
        this.A00 = i;
        this.A01 = obj2;
        this.A02 = obj3;
        this.A03 = obj;
    }

    public final void BzB(Integer num, boolean z) {
        switch (this.A00) {
            case 0:
                C135356s4 r4 = (C135356s4) this.A01;
                AnonymousClass749 r0 = (AnonymousClass749) this.A02;
                Context context = (Context) this.A03;
                if (r4 != null) {
                    r0.A0C.get();
                    C109005cf.A0P(context, r4.A02, r4.A01, r4.A00);
                    return;
                }
                return;
            case 1:
                AnonymousClass749 r2 = (AnonymousClass749) this.A01;
                Object obj = this.A02;
                C136516tw r02 = (C136516tw) this.A03;
                C29681ch r42 = r02.A02;
                int i = r02.A00;
                r2.A03.A0J(new AnonymousClass3CT(r2, obj, r42, r02.A03, r02.A07, i, 2, true));
                return;
            case 2:
                ((C34561kh) this.A01).C8R((AnonymousClass1FU) this.A02, (C136516tw) this.A03);
                return;
            default:
                C46162Dk r3 = (C46162Dk) this.A02;
                C18090vk r22 = (C18090vk) this.A03;
                UpdatesViewModel updatesViewModel = (UpdatesViewModel) C108975cc.A0Z((Reference) this.A01);
                if (updatesViewModel != null) {
                    updatesViewModel.A0V(r3, AnonymousClass00R.A02, r22);
                    return;
                }
                return;
        }
    }
}
