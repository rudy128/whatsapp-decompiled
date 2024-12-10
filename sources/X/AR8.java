package X;

import com.whatsapp.profile.ViewProfilePhoto;
import com.whatsapp.settings.notificationsandsounds.NotificationsAndSoundsFragment;
import java.util.Collection;

public class AR8 implements C28741ap {
    public final int A00;
    public final Object A01;

    public AR8(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public void BoO(AnonymousClass1BI r4, C32961i2 r5) {
        switch (this.A00) {
            case 0:
                AnonymousClass1FP r2 = (AnonymousClass1FP) this.A01;
                C21445AkC.A01(r2.A05, r2, 22);
                return;
            case 1:
                ViewProfilePhoto.A03((ViewProfilePhoto) this.A01);
                return;
            default:
                return;
        }
    }

    public /* synthetic */ void BoP(AnonymousClass1BI r3, AnonymousClass201 r4) {
        if (2 - this.A00 == 0) {
            C18070vi.A0h(r3, r4);
            NotificationsAndSoundsFragment notificationsAndSoundsFragment = (NotificationsAndSoundsFragment) this.A01;
            if (r3.equals(notificationsAndSoundsFragment.A05)) {
                NotificationsAndSoundsFragment.A01(r4, notificationsAndSoundsFragment);
            }
        }
    }

    public /* synthetic */ void BoD(AnonymousClass1BI r1) {
    }

    public /* synthetic */ void BoE(AnonymousClass1BI r1) {
    }

    public /* synthetic */ void BoJ(AnonymousClass1BI r1) {
    }

    public /* synthetic */ void BoK() {
    }

    public /* synthetic */ void BoR(AnonymousClass1BI r1) {
    }

    public /* synthetic */ void BoW(AnonymousClass1BI r1) {
    }

    public /* synthetic */ void BoZ(AnonymousClass1BI r1) {
    }

    public /* synthetic */ void BoF(AnonymousClass1BI r1, Integer num) {
    }

    public /* synthetic */ void BoG(AnonymousClass1BI r1, boolean z) {
    }

    public /* synthetic */ void BoS(AnonymousClass1BI r1, Collection collection) {
    }

    public /* synthetic */ void BoX(AnonymousClass1BI r1, Integer num) {
    }

    public /* synthetic */ void BoY(AnonymousClass1BI r1, C32961i2 r2) {
    }

    public /* synthetic */ void BoQ(AnonymousClass1BI r1, Collection collection, int i, boolean z) {
    }
}
