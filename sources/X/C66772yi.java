package X;

import android.text.TextUtils;
import android.widget.ImageView;
import com.whatsapp.HomeActivity;
import com.whatsapp.calling.callhistory.viewmodel.CallsHistoryFragmentViewModel;
import com.whatsapp.conversationslist.ConversationsFragment;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.locks.Lock;

/* renamed from: X.2yi  reason: invalid class name and case insensitive filesystem */
public class C66772yi implements C23581Gv {
    public final int A00;
    public final Object A01;

    public C66772yi(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public /* synthetic */ void Bkk(UserJid userJid) {
        switch (this.A00) {
            case 2:
                ((C40631v1) this.A01).A00.A0U(userJid);
                return;
            case 3:
                ConversationsFragment.A0m((ConversationsFragment) this.A01, Collections.singletonList(userJid));
                return;
            default:
                return;
        }
    }

    public /* synthetic */ void Bq0(Collection collection) {
        if (1 - this.A00 == 0) {
            C40971vb r1 = (C40971vb) this.A01;
            if (r1.A07 != null) {
                Collection collection2 = collection;
                if (!collection.isEmpty()) {
                    C41031vh r12 = r1.A07;
                    Log.i("CallsHistoryViewModel/onContactsAddedOrUpdated");
                    CallsHistoryFragmentViewModel callsHistoryFragmentViewModel = r12.A00;
                    if (!callsHistoryFragmentViewModel.A0J) {
                        Log.i("CallsHistoryViewModel/onContactsAddedOrUpdated skip due to no active observer");
                        return;
                    }
                    C17890vO.A0t(callsHistoryFragmentViewModel.A0C);
                    C41071vl r13 = callsHistoryFragmentViewModel.A0X;
                    Lock lock = callsHistoryFragmentViewModel.A0s;
                    AnonymousClass2PW r0 = new AnonymousClass2PW(r13, callsHistoryFragmentViewModel, callsHistoryFragmentViewModel.A0p, collection2, callsHistoryFragmentViewModel.A0r, lock);
                    callsHistoryFragmentViewModel.A0C = r0;
                    AnonymousClass1J2.A01(callsHistoryFragmentViewModel, r0);
                }
            }
        }
    }

    public /* synthetic */ void Bq1(Collection collection) {
        switch (this.A00) {
            case 0:
                return;
            case 1:
                Log.i("CallsHistoryDataSource/onContactsChanged");
                C41031vh r0 = ((C40971vb) this.A01).A07;
                if (r0 != null && collection != null) {
                    CallsHistoryFragmentViewModel callsHistoryFragmentViewModel = r0.A00;
                    synchronized (callsHistoryFragmentViewModel) {
                        callsHistoryFragmentViewModel.A0F = null;
                    }
                    C41101vo r1 = callsHistoryFragmentViewModel.A0Y;
                    if (!TextUtils.isEmpty(r1.A01)) {
                        r1.filter(r1.A01);
                        return;
                    }
                    return;
                }
                return;
            case 2:
                C40631v1 r02 = (C40631v1) this.A01;
                if (collection == null) {
                    C40401ue r3 = r02.A00;
                    r3.A03.A0J(new C98764rg((Object) r3, 14));
                    return;
                }
                r02.A00.A0V(C17880vN.A10(collection));
                return;
            case 3:
                ConversationsFragment.A0l((ConversationsFragment) this.A01, collection);
                return;
            default:
                C25201Nh.A07((C25201Nh) this.A01);
                return;
        }
    }

    public /* synthetic */ void Bq3(Collection collection) {
        if (3 - this.A00 == 0) {
            ConversationsFragment conversationsFragment = (ConversationsFragment) this.A01;
            if (C18020vd.A05(C18040vf.A02, conversationsFragment.A25, 5868)) {
                ArrayList A13 = AnonymousClass000.A13();
                if (collection != null && !collection.isEmpty()) {
                    Iterator it = collection.iterator();
                    while (it.hasNext()) {
                        A13.add(C17880vN.A0O(it).A0J);
                    }
                }
                ConversationsFragment.A0l(conversationsFragment, A13);
            }
        }
    }

    public /* synthetic */ void Bq4(Collection collection) {
        if (3 - this.A00 == 0) {
            ((ConversationsFragment) this.A01).A2f.CGF(new C98554rL(this, 46));
        }
    }

    public /* synthetic */ void Brx(UserJid userJid) {
        switch (this.A00) {
            case 2:
                ((C40631v1) this.A01).A00.A0U(userJid);
                return;
            case 3:
                ConversationsFragment.A0l((ConversationsFragment) this.A01, Collections.singleton(userJid));
                return;
            default:
                return;
        }
    }

    public void C1w(AnonymousClass1BI r10) {
        AnonymousClass1BI r5 = r10;
        switch (this.A00) {
            case 0:
                HomeActivity homeActivity = (HomeActivity) this.A01;
                if (homeActivity.A02.A0O(r10)) {
                    Log.i("HomeActivty/onProfilePhotoChanged");
                    HomeActivity.A1D(homeActivity);
                    return;
                }
                return;
            case 1:
                Log.i("CallsHistoryDataSource/onProfilePhotoChanged");
                C41031vh r1 = ((C40971vb) this.A01).A07;
                if (r1 != null) {
                    Log.i("CallsHistoryViewModel/onProfilePhotoChanged");
                    CallsHistoryFragmentViewModel callsHistoryFragmentViewModel = r1.A00;
                    if (!callsHistoryFragmentViewModel.A0J) {
                        Log.i("CallsHistoryViewModel/onProfilePhotoChanged skip due to no active observer");
                        return;
                    }
                    C17890vO.A0t(callsHistoryFragmentViewModel.A09);
                    Lock lock = callsHistoryFragmentViewModel.A0s;
                    C41061vk r2 = callsHistoryFragmentViewModel.A0W;
                    LinkedHashMap linkedHashMap = callsHistoryFragmentViewModel.A0r;
                    C49072Pb r12 = new C49072Pb(r2, callsHistoryFragmentViewModel, callsHistoryFragmentViewModel.A0Z, r5, callsHistoryFragmentViewModel.A0p, linkedHashMap, lock);
                    callsHistoryFragmentViewModel.A09 = r12;
                    AnonymousClass1J2.A01(callsHistoryFragmentViewModel, r12);
                    return;
                }
                return;
            case 2:
                ((C40631v1) this.A01).A00.A0U(r10);
                return;
            case 3:
                ConversationsFragment conversationsFragment = (ConversationsFragment) this.A01;
                C37621pr r3 = conversationsFragment.A1d;
                if (r3 instanceof C37641pt) {
                    C37631ps r32 = (C37631ps) r3;
                    if (C22971Dz.A0d(r10)) {
                        C18070vi.A0z(r10, "null cannot be cast to non-null type com.whatsapp.jid.UserJid");
                        String str = r10.user;
                        if (!AnonymousClass1EG.A0H(str)) {
                            Map map = r32.A0C;
                            if (map.containsKey(str)) {
                                ImageView imageView = (ImageView) map.get(str);
                                AnonymousClass1E7 A0E = r32.A04.A0E(r10);
                                if (!(A0E == null || imageView == null)) {
                                    r32.A0A.A07(imageView, A0E);
                                }
                            }
                        }
                    }
                }
                ConversationsFragment.A0l(conversationsFragment, Collections.singleton(r10));
                return;
            default:
                return;
        }
    }

    public /* synthetic */ void Bm3() {
    }

    public /* synthetic */ void Bmh(Collection collection) {
    }

    public /* synthetic */ void Bpv() {
    }

    public /* synthetic */ void Bpw(UserJid userJid) {
    }

    public /* synthetic */ void BtU(UserJid userJid) {
    }

    public /* synthetic */ void C1z(AnonymousClass1BI r1) {
    }
}
