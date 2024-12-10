package X;

import com.whatsapp.contact.picker.ContactPickerFragment;
import com.whatsapp.notification.PopupNotification;
import com.whatsapp.search.SearchFragment;
import com.whatsapp.status.playback.fragment.StatusPlaybackContactFragment;
import java.util.Set;

/* renamed from: X.7ID  reason: invalid class name */
public class AnonymousClass7ID implements C25221Nj {
    public final int A00;
    public final Object A01;

    public AnonymousClass7ID(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public /* synthetic */ void BvN(AnonymousClass1E9 r3) {
        if (7 - this.A00 == 0) {
            C18070vi.A0d(r3, 0);
            if (r3 instanceof AnonymousClass1EC) {
                C138696xX.A00((C138696xX) this.A01, C18070vi.A0P(r3));
            }
        }
    }

    public void BvO(Set set) {
        C38391rD r0;
        switch (this.A00) {
            case 0:
                C114635rQ.A0z((C114635rQ) this.A01);
                return;
            case 1:
                ContactPickerFragment contactPickerFragment = (ContactPickerFragment) this.A01;
                if (!ContactPickerFragment.A4K) {
                    ContactPickerFragment.A0I(contactPickerFragment);
                    return;
                }
                return;
            case 2:
                r0 = ((C143087By) this.A01).A0K;
                break;
            case 3:
                PopupNotification.A0V((PopupNotification) this.A01);
                return;
            case 4:
                C112355lL r3 = ((SearchFragment) this.A01).A0a;
                if (r3 != null) {
                    int i = 0;
                    while (true) {
                        C147387Sy r1 = r3.A0S;
                        if (i < r1.size()) {
                            if (set.contains(C108955ca.A0o(r1, i))) {
                                r3.A0G(i);
                            }
                            i++;
                        } else {
                            return;
                        }
                    }
                } else {
                    return;
                }
            case 5:
                StatusPlaybackContactFragment.A07((StatusPlaybackContactFragment) this.A01);
                return;
            case 6:
                r0 = ((C1406672l) this.A01).A03;
                if (r0 == null) {
                    AnonymousClass3MW.A1B();
                    throw null;
                }
                break;
            default:
                C18070vi.A0d(set, 0);
                C138696xX.A00((C138696xX) this.A01, set);
                return;
        }
        r0.notifyDataSetChanged();
    }

    public /* synthetic */ void Bxf(AnonymousClass1EC r3) {
        if (7 - this.A00 == 0) {
            C18070vi.A0d(r3, 0);
            C138696xX.A00((C138696xX) this.A01, C18070vi.A0P(r3));
        }
    }

    public /* synthetic */ void Bxh(AnonymousClass1EC r3) {
        if (7 - this.A00 == 0) {
            C18070vi.A0d(r3, 0);
            C138696xX.A00((C138696xX) this.A01, C18070vi.A0P(r3));
        }
    }

    public /* synthetic */ void Bxd(AnonymousClass1EC r1) {
    }

    public /* synthetic */ void Bxe(AnonymousClass1EC r1) {
    }

    public /* synthetic */ void Bxg(AnonymousClass1EC r1) {
    }
}
