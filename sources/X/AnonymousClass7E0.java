package X;

import android.os.SystemClock;
import android.widget.BaseAdapter;
import androidx.fragment.app.DialogFragment;
import com.whatsapp.avatar.home.AvatarHomeActivity;
import com.whatsapp.calling.callgrid.viewmodel.CallGridViewModel;
import com.whatsapp.contact.picker.ContactPickerFragment;
import com.whatsapp.jid.GroupJid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.mediaview.MediaViewFragment;
import com.whatsapp.notification.PopupNotification;
import com.whatsapp.search.SearchFragment;
import com.whatsapp.status.StatusesFragment;
import com.whatsapp.viewsharedcontacts.ViewSharedContactArrayActivity;
import com.whatsapp.voipcalling.CallInfo;
import com.whatsapp.voipcalling.VoipActivityV2;
import com.whatsapp.voipcalling.VoipCallControlBottomSheetV2;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* renamed from: X.7E0  reason: invalid class name */
public class AnonymousClass7E0 implements C23581Gv {
    public final int A00;
    public final Object A01;

    public AnonymousClass7E0(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public static void A01(AnonymousClass7E0 r2, C133356oc r3) {
        ContactPickerFragment contactPickerFragment = (ContactPickerFragment) r2.A01;
        if (AnonymousClass1E7.A03(r3, contactPickerFragment.A35)) {
            C108965cb.A19(contactPickerFragment.A0S, r2, 8);
        }
    }

    public void Bkk(UserJid userJid) {
        switch (this.A00) {
            case 0:
                C114635rQ r2 = (C114635rQ) this.A01;
                if (AnonymousClass1E7.A03(new C133356oc(r2.A05.A0H(userJid)), r2.A0I)) {
                    r2.A0O.notifyDataSetChanged();
                    return;
                }
                return;
            case 5:
                ((ContactPickerFragment) this.A01).A1y.CGF(new C146497Pi(this, userJid, 3));
                return;
            case 9:
                SearchFragment.A03(userJid, (SearchFragment) this.A01);
                return;
            default:
                return;
        }
    }

    public /* synthetic */ void Bm3() {
        if (2 - this.A00 == 0) {
            AvatarHomeActivity avatarHomeActivity = (AvatarHomeActivity) this.A01;
            if (C72453Mb.A1a(avatarHomeActivity.A0P)) {
                C23520Bik A012 = C23520Bik.A01(avatarHomeActivity.A00, 2131886828, 0);
                A012.A0F(new AnonymousClass78J(avatarHomeActivity, 8), 2131886829);
                A012.A08();
            }
        }
    }

    public void Bmh(Collection collection) {
        switch (this.A00) {
            case 0:
                ((C114635rQ) this.A01).A0O.notifyDataSetChanged();
                return;
            case 5:
                ((ContactPickerFragment) this.A01).A2J();
                return;
            default:
                return;
        }
    }

    public /* synthetic */ void Bq0(Collection collection) {
        AnonymousClass3WN r0;
        switch (this.A00) {
            case 1:
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    AnonymousClass1E7 A0O = C17880vN.A0O(it);
                    AnonymousClass1BI r3 = A0O.A0J;
                    if (r3 != null) {
                        AnonymousClass2PR r2 = (AnonymousClass2PR) this.A01;
                        C691936g r1 = r2.A02;
                        if (r3.equals(r1.A01) && A0O.A0G != null) {
                            r1.A00 = A0O;
                            AnonymousClass206 r32 = r2.A03;
                            r32.A0M(C691936g.class).A02(r1);
                            C676530i r22 = r2.A01;
                            r22.A08.A02(r32, 38);
                            r22.A04.unregisterObserver(this);
                        }
                    }
                }
                return;
            case 4:
                C110665gi.A00((C110665gi) this.A01, collection);
                return;
            case 5:
                ContactPickerFragment contactPickerFragment = (ContactPickerFragment) this.A01;
                if (!ContactPickerFragment.A4K) {
                    ContactPickerFragment.A0I(contactPickerFragment);
                    return;
                }
                return;
            case 12:
                C18070vi.A0d(collection, 0);
                ((C138696xX) this.A01).A0E.CGS(new AnonymousClass7RD(this, collection, 15), "ug_names_populator");
                return;
            case 14:
                VoipActivityV2 voipActivityV2 = (VoipActivityV2) this.A01;
                CallInfo A0Q = VoipActivityV2.A0Q(voipActivityV2);
                if (A0Q != null) {
                    Iterator it2 = collection.iterator();
                    while (it2.hasNext()) {
                        AnonymousClass1E7 A0O2 = C17880vN.A0O(it2);
                        AnonymousClass1BI r12 = A0O2.A0J;
                        if (r12 == null || !r12.equals(A0Q.groupJid)) {
                            AnonymousClass1BI r13 = A0O2.A0J;
                            if (r13 != null && !A0Q.isGroupCall && r13.equals(A0Q.getPeerJid()) && VoipActivityV2.A24(voipActivityV2) && C40811vJ.A0S(voipActivityV2.A0E)) {
                                if (C18020vd.A05(C18040vf.A02, voipActivityV2.A0E, 4455)) {
                                    VoipActivityV2.A1J(A0Q, voipActivityV2);
                                }
                            }
                        } else {
                            VoipActivityV2.A1J(A0Q, voipActivityV2);
                            VoipCallControlBottomSheetV2 voipCallControlBottomSheetV2 = voipActivityV2.A1b;
                            if (!(voipCallControlBottomSheetV2 == null || (r0 = voipCallControlBottomSheetV2.A0L) == null)) {
                                r0.A0Y();
                            }
                        }
                    }
                    return;
                }
                return;
            default:
                return;
        }
    }

    public void Bq1(Collection collection) {
        C38391rD r0;
        switch (this.A00) {
            case 0:
                C114635rQ.A0z((C114635rQ) this.A01);
                return;
            case 5:
                ContactPickerFragment contactPickerFragment = (ContactPickerFragment) this.A01;
                if (!ContactPickerFragment.A4K) {
                    ContactPickerFragment.A0I(contactPickerFragment);
                    return;
                }
                return;
            case 6:
                r0 = ((C143087By) this.A01).A0K;
                break;
            case 8:
                PopupNotification.A0V((PopupNotification) this.A01);
                return;
            case 9:
                r0 = ((SearchFragment) this.A01).A0a;
                break;
            case 10:
                if (collection != null) {
                    Iterator it = collection.iterator();
                    while (true) {
                        boolean z = false;
                        while (true) {
                            if (it.hasNext()) {
                                AnonymousClass1BI A0Q = C17880vN.A0Q(it);
                                if (z || StatusesFragment.A0C(A0Q, (StatusesFragment) this.A01)) {
                                    z = true;
                                }
                            } else if (z) {
                                C110285fE.A00((StatusesFragment) this.A01);
                                return;
                            } else {
                                return;
                            }
                        }
                    }
                } else {
                    return;
                }
                break;
            case 11:
                r0 = ((C1406672l) this.A01).A03;
                if (r0 == null) {
                    AnonymousClass3MW.A1B();
                    throw null;
                }
                break;
            case 13:
                r0 = ((ViewSharedContactArrayActivity) this.A01).A0L;
                break;
            default:
                return;
        }
        if (r0 == null) {
            return;
        }
        r0.notifyDataSetChanged();
    }

    public /* synthetic */ void Bq3(Collection collection) {
        if (4 - this.A00 == 0) {
            C110665gi.A00((C110665gi) this.A01, collection);
        }
    }

    public void Brx(UserJid userJid) {
        BaseAdapter baseAdapter;
        switch (this.A00) {
            case 0:
                C114635rQ r2 = (C114635rQ) this.A01;
                if (AnonymousClass1E7.A03(new C133356oc(r2.A05.A0H(userJid)), r2.A0I)) {
                    baseAdapter = r2.A0O;
                    break;
                } else {
                    return;
                }
            case 4:
                C110665gi r1 = (C110665gi) this.A01;
                if (userJid.equals(r1.A0C)) {
                    r1.A02();
                    return;
                }
                return;
            case 5:
                ((ContactPickerFragment) this.A01).A1y.CGF(new C146497Pi(this, userJid, 5));
                return;
            case 6:
                ((C143087By) this.A01).A0K.notifyDataSetChanged();
                return;
            case 8:
                PopupNotification popupNotification = (PopupNotification) this.A01;
                if (!popupNotification.A1L.isEmpty()) {
                    AnonymousClass1BI r0 = popupNotification.A0x.A0v.A00;
                    C17960vV.A07(r0);
                    if (r0.equals(userJid) || userJid.equals(popupNotification.A0x.A0H())) {
                        PopupNotification.A0s(popupNotification, popupNotification.A0s.getCurrentItem());
                        return;
                    }
                    return;
                }
                return;
            case 9:
                SearchFragment.A03(userJid, (SearchFragment) this.A01);
                return;
            case 10:
                StatusesFragment statusesFragment = (StatusesFragment) this.A01;
                if (StatusesFragment.A0C(userJid, statusesFragment)) {
                    baseAdapter = statusesFragment.A0e;
                    break;
                } else {
                    return;
                }
            case 11:
                C18070vi.A0d(userJid, 0);
                C112195l5 r02 = ((C1406672l) this.A01).A03;
                if (r02 == null) {
                    AnonymousClass3MW.A1B();
                    throw null;
                } else {
                    r02.A0U(userJid);
                    return;
                }
            case 14:
                CallGridViewModel.A0D(((VoipActivityV2) this.A01).A0g);
                return;
            default:
                return;
        }
        baseAdapter.notifyDataSetChanged();
    }

    public /* synthetic */ void BtU(UserJid userJid) {
        if (5 - this.A00 == 0) {
            Bkk(userJid);
        }
    }

    public void C1w(AnonymousClass1BI r6) {
        BaseAdapter baseAdapter;
        DialogFragment dialogFragment;
        AnonymousClass3WN r0;
        switch (this.A00) {
            case 0:
                C114635rQ r2 = (C114635rQ) this.A01;
                if (AnonymousClass1E7.A03(new C133356oc(r2.A05.A0H(r6)), r2.A0I)) {
                    baseAdapter = r2.A0O;
                    break;
                } else {
                    return;
                }
            case 3:
                ((C112285lE) this.A01).A0Z(C22941Dw.A00(r6));
                return;
            case 5:
                ((ContactPickerFragment) this.A01).A1y.CGF(new C146497Pi(this, r6, 4));
                return;
            case 6:
                ((C143087By) this.A01).A0K.notifyDataSetChanged();
                return;
            case 7:
                MediaViewFragment mediaViewFragment = (MediaViewFragment) this.A01;
                GroupJid groupJid = mediaViewFragment.A0h;
                if (groupJid == null || !groupJid.equals(r6)) {
                    AnonymousClass11S r02 = mediaViewFragment.A0G;
                    r02.A0I();
                    AnonymousClass1E8 r03 = r02.A0D;
                    if (r03 != null && r6.equals(r03.A0J) && (dialogFragment = mediaViewFragment.A0A) != null) {
                        dialogFragment.A28();
                        mediaViewFragment.A0A = null;
                        return;
                    }
                    return;
                }
                DialogFragment dialogFragment2 = mediaViewFragment.A09;
                if (dialogFragment2 != null) {
                    dialogFragment2.A28();
                    mediaViewFragment.A09 = null;
                    return;
                }
                return;
            case 8:
                PopupNotification popupNotification = (PopupNotification) this.A01;
                AnonymousClass1E7 r04 = popupNotification.A0i;
                if (r04 != null && r6 != null && r6.equals(r04.A0J)) {
                    PopupNotification.A0r(popupNotification);
                    return;
                }
                return;
            case 9:
                SearchFragment.A03(r6, (SearchFragment) this.A01);
                return;
            case 10:
                StatusesFragment statusesFragment = (StatusesFragment) this.A01;
                if (StatusesFragment.A0C(r6, statusesFragment)) {
                    baseAdapter = statusesFragment.A0e;
                    break;
                } else {
                    return;
                }
            case 11:
                C18070vi.A0d(r6, 0);
                C112195l5 r05 = ((C1406672l) this.A01).A03;
                if (r05 == null) {
                    AnonymousClass3MW.A1B();
                    throw null;
                } else {
                    r05.A0U(r6);
                    return;
                }
            case 14:
                VoipActivityV2 voipActivityV2 = (VoipActivityV2) this.A01;
                CallInfo A0Q = VoipActivityV2.A0Q(voipActivityV2);
                if (A0Q != null) {
                    C36321nh r06 = GroupJid.Companion;
                    GroupJid A002 = C36321nh.A00(r6);
                    if (A002 == null || !A002.equals(A0Q.groupJid) || !VoipActivityV2.A22(A0Q.callState, voipActivityV2, A0Q.isGroupCall)) {
                        UserJid A003 = C22941Dw.A00(r6);
                        if (A003 != null && A0Q.participants.containsKey(A003)) {
                            boolean z = A0Q.isGroupCall;
                            if (!z && VoipActivityV2.A22(A0Q.callState, voipActivityV2, z)) {
                                voipActivityV2.A0W.A03(A0Q);
                            }
                            VoipCallControlBottomSheetV2 voipCallControlBottomSheetV2 = voipActivityV2.A1b;
                            if (voipCallControlBottomSheetV2 != null && (r0 = voipCallControlBottomSheetV2.A0L) != null) {
                                r0.A0Z(A003);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    voipActivityV2.A0W.A03(A0Q);
                    return;
                }
                return;
            default:
                return;
        }
        baseAdapter.notifyDataSetChanged();
    }

    public static final void A00(AnonymousClass7E0 r5) {
        ArrayList A13 = AnonymousClass000.A13();
        C138696xX r3 = (C138696xX) r5.A01;
        Set set = r3.A0H;
        synchronized (set) {
            A13.addAll(set);
            set.clear();
            r3.A00 = Long.valueOf(SystemClock.uptimeMillis());
        }
        if (!A13.isEmpty() && AnonymousClass11S.A00(r3.A04) != null) {
            r3.A0E.CGS(new AnonymousClass7RD(A13, r3, 16), "ug_names_populator");
        }
    }

    public /* synthetic */ void Bpv() {
    }

    public /* synthetic */ void Bpw(UserJid userJid) {
    }

    public /* synthetic */ void Bq4(Collection collection) {
    }

    public /* synthetic */ void C1z(AnonymousClass1BI r1) {
    }
}
