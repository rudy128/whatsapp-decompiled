package X;

import com.whatsapp.community.CommunityDeleteDialogFragment;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.498  reason: invalid class name */
public final class AnonymousClass498 extends A34 {
    public final /* synthetic */ long A00;
    public final /* synthetic */ CommunityDeleteDialogFragment A01;
    public final /* synthetic */ WeakReference A02;
    public final /* synthetic */ List A03;

    public /* bridge */ /* synthetic */ void A0H(Object obj) {
        AnonymousClass1FU r1 = (AnonymousClass1FU) this.A02.get();
        if (r1 != null && !r1.isFinishing()) {
            r1.CEx();
        }
        AnonymousClass1NN r12 = this.A01.A06;
        if (r12 != null) {
            r12.A01(0);
        } else {
            C18070vi.A11("conversationObservers");
            throw null;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass498(AnonymousClass1FU r2, CommunityDeleteDialogFragment communityDeleteDialogFragment, WeakReference weakReference, List list, long j) {
        super(r2, true);
        this.A03 = list;
        this.A00 = j;
        this.A01 = communityDeleteDialogFragment;
        this.A02 = weakReference;
    }

    public /* bridge */ /* synthetic */ Object A0G(Object[] objArr) {
        List list = this.A03;
        CommunityDeleteDialogFragment communityDeleteDialogFragment = this.A01;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AnonymousClass1BI A0Q = C17880vN.A0Q(it);
            C33251iW r3 = communityDeleteDialogFragment.A01;
            if (r3 != null) {
                boolean z = false;
                if (list.size() > 1) {
                    z = true;
                }
                r3.A0X(A0Q, true, z);
            } else {
                C18070vi.A11("userActions");
                throw null;
            }
        }
        AnonymousClass1FU.A0X(this.A00, 300);
        return null;
    }
}
