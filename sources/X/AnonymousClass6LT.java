package X;

import android.view.MenuItem;
import com.whatsapp.group.GroupAddBlacklistPickerActivity;
import com.whatsapp.jid.UserJid;
import com.whatsapp.lastseen.LastSeenBlockListPickerActivity;
import com.whatsapp.profile.AboutStatusBlockListPickerActivity;
import com.whatsapp.profile.PixBlockListPickerActivity;
import com.whatsapp.profile.ProfilePhotoBlockListPickerActivity;
import com.whatsapp.status.audienceselector.StatusRecipientsActivity;
import com.whatsapp.status.audienceselector.StatusTemporalRecipientsActivity;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: X.6LT  reason: invalid class name */
public class AnonymousClass6LT extends A34 {
    public final Set A00;
    public final /* synthetic */ C114635rQ A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass6LT(C114635rQ r2, Set set) {
        super(r2, true);
        this.A01 = r2;
        HashSet A12 = C17880vN.A12();
        this.A00 = A12;
        A12.addAll(set);
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [java.lang.Object, X.6fi] */
    public /* bridge */ /* synthetic */ Object A0G(Object[] objArr) {
        Collection A4c;
        String str;
        boolean z;
        C60112nP r0;
        AnonymousClass00H r02;
        ? obj = new Object();
        ArrayList A13 = AnonymousClass000.A13();
        obj.A00 = A13;
        C114635rQ r5 = this.A01;
        r5.A05.A0m(A13);
        if (!C18020vd.A05(C18040vf.A02, ((C52682bJ) r5.A0F.get()).A00, 3763)) {
            Iterator it = obj.A00.iterator();
            while (it.hasNext()) {
                if (C22971Dz.A0T(C72453Mb.A0l(it))) {
                    it.remove();
                }
            }
        }
        obj.A01 = new HashSet(obj.A00.size(), 1.0f);
        Iterator it2 = obj.A00.iterator();
        while (it2.hasNext()) {
            obj.A01.add(AnonymousClass1E7.A01(C17880vN.A0O(it2)));
        }
        if (!r5.A0K) {
            A4c = r5.A4c();
        } else if (r5 instanceof StatusRecipientsActivity) {
            StatusRecipientsActivity statusRecipientsActivity = (StatusRecipientsActivity) r5;
            if (statusRecipientsActivity instanceof StatusTemporalRecipientsActivity) {
                A4c = StatusTemporalRecipientsActivity.A12((StatusTemporalRecipientsActivity) statusRecipientsActivity).A02;
            } else {
                C24661Le r03 = statusRecipientsActivity.A03;
                if (r03 != null) {
                    A4c = r03.A0B();
                }
                str = "statusStore";
                C18070vi.A11(str);
                throw null;
            }
        } else {
            if (r5 instanceof ProfilePhotoBlockListPickerActivity) {
                r02 = ((ProfilePhotoBlockListPickerActivity) r5).A00;
                if (r02 == null) {
                    str = "profilePhotoBlockListManager";
                    C18070vi.A11(str);
                    throw null;
                }
            } else {
                if (r5 instanceof PixBlockListPickerActivity) {
                    r0 = ((PixBlockListPickerActivity) r5).A00;
                    if (r0 == null) {
                        str = "pixBlockListManager";
                    }
                    A4c = C29431cG.A0t(r0.A03());
                } else if (r5 instanceof AboutStatusBlockListPickerActivity) {
                    A4c = C17880vN.A10(((C60112nP) ((AboutStatusBlockListPickerActivity) r5).A00.get()).A03());
                } else if (r5 instanceof LastSeenBlockListPickerActivity) {
                    r02 = ((LastSeenBlockListPickerActivity) r5).A00;
                    if (r02 == null) {
                        str = "lastSeenBlockListManager";
                    }
                } else if (r5 instanceof GroupAddBlacklistPickerActivity) {
                    A4c = C17880vN.A10(((C60112nP) ((GroupAddBlacklistPickerActivity) r5).A00.get()).A03());
                } else {
                    A4c = AnonymousClass000.A13();
                }
                C18070vi.A11(str);
                throw null;
            }
            r0 = (C60112nP) r02.get();
            A4c = C29431cG.A0t(r0.A03());
        }
        List userJidsFromChatJids = UserJid.userJidsFromChatJids(A4c);
        obj.A02 = new HashSet(userJidsFromChatJids.size());
        Iterator it3 = userJidsFromChatJids.iterator();
        while (it3.hasNext()) {
            AnonymousClass1BI A0Q = C17880vN.A0Q(it3);
            if (r5 instanceof StatusRecipientsActivity) {
                z = !r5.A0K;
            } else if ((r5 instanceof LastSeenBlockListPickerActivity) || (r5 instanceof GroupAddBlacklistPickerActivity)) {
                z = false;
            } else {
                z = true;
            }
            boolean contains = obj.A01.contains(A0Q);
            if (z) {
                if (!contains) {
                }
            } else if (!contains) {
                obj.A01.add(A0Q);
                AnonymousClass3MY.A1O(r5.A05, A0Q, obj.A00);
            }
            obj.A02.add(A0Q);
        }
        Collections.sort(obj.A00, new C116485xp(obj, this, r5.A07, r5.A00));
        if (userJidsFromChatJids.size() != obj.A02.size()) {
            StringBuilder A10 = AnonymousClass000.A10();
            C17890vO.A15("statusrecipients/update old:", A10, userJidsFromChatJids);
            A10.append(" new:");
            C17900vP.A0o(A10, obj.A02.size());
            Set set = obj.A02;
            if (r5 instanceof StatusRecipientsActivity) {
                StatusRecipientsActivity statusRecipientsActivity2 = (StatusRecipientsActivity) r5;
                C18070vi.A0d(set, 0);
                C24661Le r2 = statusRecipientsActivity2.A03;
                if (r2 != null) {
                    r2.A0G(C17880vN.A10(set), C72453Mb.A03(statusRecipientsActivity2.A0K ? 1 : 0));
                    C41911xI r04 = statusRecipientsActivity2.A02;
                    if (r04 != null) {
                        r04.A02();
                    } else {
                        str = "syncdUpdateHelper";
                        C18070vi.A11(str);
                        throw null;
                    }
                }
                str = "statusStore";
                C18070vi.A11(str);
                throw null;
            }
        }
        return obj;
    }

    public /* bridge */ /* synthetic */ void A0H(Object obj) {
        C128266fi r8 = (C128266fi) obj;
        C114635rQ r4 = this.A01;
        r4.A03 = null;
        Set set = r4.A0S;
        set.clear();
        set.addAll(r8.A02);
        Set set2 = r4.A0Q;
        set2.clear();
        set2.addAll(set);
        Set set3 = this.A00;
        if (!set3.isEmpty()) {
            for (Object next : set3) {
                if (!(r4 instanceof StatusRecipientsActivity) ? !((r4 instanceof LastSeenBlockListPickerActivity) || (r4 instanceof GroupAddBlacklistPickerActivity)) : (!r4.A0K)) {
                    if (!r8.A01.contains(next)) {
                    }
                }
                set.add(next);
            }
            HashSet A12 = C17880vN.A12();
            for (Object next2 : r8.A02) {
                if (!set3.contains(next2)) {
                    A12.add(next2);
                }
            }
            set.removeAll(A12);
        }
        r4.A4f();
        ArrayList arrayList = r8.A00;
        r4.A0I = arrayList;
        r4.A0J = r8.A01;
        MenuItem menuItem = r4.A00;
        if (menuItem != null) {
            menuItem.setVisible(C17880vN.A1X(arrayList));
        }
        C114635rQ.A0y(r4);
    }
}
