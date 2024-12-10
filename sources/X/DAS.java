package X;

import android.content.Context;
import com.facebook.avatar.autogen.facetracker.AEFaceTrackerManager;
import com.facebook.avatar.autogen.presenter.AECapturePresenter$1;

public final class DAS implements E93 {
    public boolean A00;
    public boolean A01;
    public final AEFaceTrackerManager A02;
    public final C26555D3v A03;
    public final C25687CkI A04;
    public final AnonymousClass1OX A05;
    public final AnonymousClass1G4 A06;
    public final C18600wl A07;

    public DAS(Context context, C26555D3v d3v, C25687CkI ckI, C18600wl r8) {
        this.A03 = d3v;
        this.A04 = ckI;
        this.A07 = r8;
        AEFaceTrackerManager aEFaceTrackerManager = AEFaceTrackerManager.A02;
        if (aEFaceTrackerManager == null) {
            Context applicationContext = context.getApplicationContext();
            C18070vi.A0X(applicationContext);
            aEFaceTrackerManager = new AEFaceTrackerManager(applicationContext);
        }
        AEFaceTrackerManager.A02 = aEFaceTrackerManager;
        AEFaceTrackerManager.A03 = this;
        this.A02 = aEFaceTrackerManager;
        this.A06 = new AnonymousClass1G7(AnonymousClass4IV.A01);
        this.A00 = true;
        AnonymousClass1OY A0f = C108995ce.A0f(r8);
        this.A05 = A0f;
        AnonymousClass3MX.A1Q(new AECapturePresenter$1(this, (C30391dr) null), A0f);
    }

    public void BnS(Exception exc) {
    }

    public void BnZ() {
    }

    public void Bna(String str, String str2) {
    }

    public void Bni() {
    }
}
