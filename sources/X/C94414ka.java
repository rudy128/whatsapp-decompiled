package X;

import android.view.View;
import android.view.animation.AnimationUtils;
import com.whatsapp.conversation.banner.viewmodel.ConversationBannersViewModel;
import com.whatsapp.conversation.banner.viewmodel.ConversationBannersViewModel$updateBannerStateWhenBannerIsHidden$1$1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.TreeSet;

/* renamed from: X.4ka  reason: invalid class name and case insensitive filesystem */
public class C94414ka implements AnonymousClass5Z8 {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C94414ka(Object obj, Object obj2, int i) {
        this.A00 = i;
        this.A01 = obj2;
        this.A02 = obj;
    }

    public final void Bvb() {
        ConversationBannersViewModel conversationBannersViewModel;
        Object obj;
        AnonymousClass1D6 A012;
        switch (this.A00) {
            case 0:
                Object obj2 = this.A02;
                TreeSet treeSet = ((C86414Rn) this.A01).A01;
                treeSet.remove(obj2);
                while (!treeSet.isEmpty()) {
                    C98524rI r1 = (C98524rI) treeSet.first();
                    if (r1.A08()) {
                        r1.A05();
                        View A04 = r1.A04();
                        if (A04 != null) {
                            A04.startAnimation(AnimationUtils.loadAnimation(A04.getContext(), 2130772004));
                            return;
                        }
                        return;
                    }
                    treeSet.remove(r1);
                }
                return;
            case 1:
                conversationBannersViewModel = (ConversationBannersViewModel) this.A01;
                obj = (Comparable) this.A02;
                break;
            default:
                conversationBannersViewModel = (ConversationBannersViewModel) this.A01;
                obj = this.A02;
                break;
        }
        C108915cV r8 = (C108915cV) obj;
        if (r8 != null) {
            synchronized (conversationBannersViewModel) {
                TreeSet treeSet2 = conversationBannersViewModel.A01;
                C98514rH r6 = (C98514rH) C29431cG.A0Y(treeSet2);
                ArrayList A13 = AnonymousClass000.A13();
                Iterator it = treeSet2.iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    if (((C98514rH) next).A00.compareTo((C98524rI) r8) != 0) {
                        A13.add(next);
                    }
                }
                treeSet2.clear();
                treeSet2.addAll(A13);
                A012 = AnonymousClass1D6.A01(r6, (C98514rH) C29431cG.A0Y(treeSet2));
            }
            Object obj3 = A012.first;
            C98514rH r12 = (C98514rH) A012.second;
            if (!C18070vi.A18(obj3, r12) && r12 != null) {
                C108915cV r3 = r12.A00;
                Object obj4 = r12.A01;
                if (obj4 != null) {
                    AnonymousClass3MX.A1Q(new ConversationBannersViewModel$updateBannerStateWhenBannerIsHidden$1$1(r3, conversationBannersViewModel, obj4, (C30391dr) null), C41561wd.A00(conversationBannersViewModel));
                }
            }
        }
    }
}
