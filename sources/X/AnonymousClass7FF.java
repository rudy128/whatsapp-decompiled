package X;

import com.whatsapp.contact.picker.ContactPickerFragment;
import com.whatsapp.notification.PopupNotification;
import com.whatsapp.search.SearchFragment;
import com.whatsapp.status.playback.fragment.StatusPlaybackContactFragment;
import java.util.Collection;

/* renamed from: X.7FF  reason: invalid class name */
public class AnonymousClass7FF implements C28741ap {
    public final int A00;
    public final Object A01;

    public static void A00(AnonymousClass7FF r1, AnonymousClass1BI r2) {
        C29681ch r22;
        C18070vi.A0d(r2, 0);
        C131026kO r12 = (C131026kO) r1.A01;
        if ((r2 instanceof C29681ch) && (r22 = (C29681ch) r2) != null) {
            r12.A0A.A0W(r22, AnonymousClass00R.A01);
        }
    }

    public AnonymousClass7FF(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public /* synthetic */ void BoD(AnonymousClass1BI r2) {
        if (7 - this.A00 == 0) {
            A00(this, r2);
        }
    }

    public /* synthetic */ void BoG(AnonymousClass1BI r2, boolean z) {
        if (7 - this.A00 == 0) {
            A00(this, r2);
        }
    }

    public void BoO(AnonymousClass1BI r3, C32961i2 r4) {
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
                SearchFragment.A03(r3, (SearchFragment) this.A01);
                return;
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
                return;
        }
        r0.notifyDataSetChanged();
    }

    public /* synthetic */ void BoQ(AnonymousClass1BI r2, Collection collection, int i, boolean z) {
        switch (this.A00) {
            case 4:
                ((SearchFragment) this.A01).A0b.A0c();
                return;
            case 7:
                A00(this, r2);
                return;
            default:
                return;
        }
    }

    public /* synthetic */ void BoR(AnonymousClass1BI r2) {
        if (7 - this.A00 == 0) {
            A00(this, r2);
        }
    }

    public /* synthetic */ void BoZ(AnonymousClass1BI r2) {
        switch (this.A00) {
            case 4:
                ((SearchFragment) this.A01).A0b.A0c();
                return;
            case 7:
                A00(this, r2);
                return;
            default:
                return;
        }
    }

    public /* synthetic */ void BoK() {
    }

    public /* synthetic */ void BoE(AnonymousClass1BI r1) {
    }

    public /* synthetic */ void BoJ(AnonymousClass1BI r1) {
    }

    public /* synthetic */ void BoW(AnonymousClass1BI r1) {
    }

    public /* synthetic */ void BoF(AnonymousClass1BI r1, Integer num) {
    }

    public /* synthetic */ void BoP(AnonymousClass1BI r1, AnonymousClass201 r2) {
    }

    public /* synthetic */ void BoS(AnonymousClass1BI r1, Collection collection) {
    }

    public /* synthetic */ void BoX(AnonymousClass1BI r1, Integer num) {
    }

    public /* synthetic */ void BoY(AnonymousClass1BI r1, C32961i2 r2) {
    }
}
