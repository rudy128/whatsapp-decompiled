package X;

import android.content.Context;
import android.content.Intent;
import com.whatsapp.updates.viewmodels.UpdatesViewModel;
import java.lang.ref.Reference;

/* renamed from: X.7KF  reason: invalid class name */
public class AnonymousClass7KF implements C1601087d {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public AnonymousClass7KF(Object obj, Object obj2, int i) {
        this.A00 = i;
        this.A01 = obj2;
        this.A02 = obj;
    }

    public final void BzB(Integer num, boolean z) {
        int i = this.A00;
        Object obj = this.A01;
        switch (i) {
            case 0:
                Context context = (Context) this.A02;
                Intent A06 = AnonymousClass3MZ.A06(((AnonymousClass749) obj).A0C);
                A06.setClassName(context.getPackageName(), "com.whatsapp.newsletter.ui.directory.NewsletterDirectoryCategoriesActivity");
                context.startActivity(A06);
                return;
            case 1:
                AnonymousClass749 r4 = (AnonymousClass749) this.A02;
                Object A0Z = C108975cc.A0Z((Reference) obj);
                if (A0Z != null) {
                    r4.A03.A0J(new C21458AkP(A0Z, r4, 30));
                    return;
                }
                return;
            default:
                C46162Dk r1 = (C46162Dk) this.A02;
                UpdatesViewModel updatesViewModel = (UpdatesViewModel) C108975cc.A0Z((Reference) obj);
                if (updatesViewModel != null) {
                    updatesViewModel.A0U(r1);
                    return;
                }
                return;
        }
    }
}
