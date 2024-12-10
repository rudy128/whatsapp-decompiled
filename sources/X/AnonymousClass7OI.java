package X;

import com.whatsapp.WaImageButton;
import com.whatsapp.calling.views.VoipReturnToCallBanner;
import com.whatsapp.camera.litecamera.LiteCameraView;
import com.whatsapp.search.SearchFragment;
import com.whatsapp.search.views.TokenizedSearchInput;
import com.whatsapp.util.Log;
import com.whatsapp.voipcalling.CallState;
import com.whatsapp.voipcalling.VoipActivityV2;
import java.io.File;

/* renamed from: X.7OI  reason: invalid class name */
public class AnonymousClass7OI implements AnonymousClass1IV {
    public final int A00;
    public final Object A01;

    public AnonymousClass7OI(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public void Bn7(C178119Bw r4) {
        switch (this.A00) {
            case 0:
                boolean A0W = r4.A0W();
                C110665gi r1 = (C110665gi) this.A01;
                if (!A0W) {
                    r1.A0G = false;
                }
                r1.setVisibility(8);
                return;
            case 3:
                SearchFragment searchFragment = (SearchFragment) this.A01;
                if (SearchFragment.A0B(searchFragment)) {
                    searchFragment.A0d.A0M();
                    return;
                }
                return;
            case 5:
                Log.i("voip/VoipActivityV2/onCallEnded");
                VoipActivityV2 voipActivityV2 = (VoipActivityV2) this.A01;
                if (!voipActivityV2.A0S.A00 || (!voipActivityV2.A2I && !voipActivityV2.A2J)) {
                    Log.i("voip/VoipActivityV2/finishActivity Finishing");
                    voipActivityV2.finish();
                    return;
                }
                return;
            default:
                return;
        }
    }

    public /* synthetic */ void BnG(C178119Bw r3, boolean z) {
        if (5 - this.A00 == 0) {
            Log.i("voip/VoipActivityV2/onCallMissed");
            VoipActivityV2 voipActivityV2 = (VoipActivityV2) this.A01;
            if (!voipActivityV2.A0S.A00 || (!voipActivityV2.A2I && !voipActivityV2.A2J)) {
                Log.i("voip/VoipActivityV2/finishActivity Finishing");
                voipActivityV2.finish();
            }
        }
    }

    public void BnH(long j, boolean z, boolean z2, boolean z3, boolean z4) {
        if (this.A00 != 0) {
            return;
        }
        if (z3) {
            C108965cb.A1N(this.A01);
            return;
        }
        C110665gi r2 = (C110665gi) this.A01;
        r2.A0G = true;
        r2.setVisibility(0);
        r2.setCallNotificationTimer(j);
        VoipReturnToCallBanner voipReturnToCallBanner = (VoipReturnToCallBanner) r2;
        if (voipReturnToCallBanner.A04.getVisibility() == 0 && z != voipReturnToCallBanner.A0J) {
            r2.A0J = z;
            r2.A01();
        } else if (r2.A0I != z2) {
            r2.A0I = z2;
        } else if (r2.A0H != z4) {
            r2.A0H = z4;
            r2.A03();
            return;
        } else {
            return;
        }
        r2.A02();
    }

    public void BnJ(C178119Bw r6) {
        switch (this.A00) {
            case 0:
                C135166rl A002 = AnonymousClass17U.A00(r6);
                C110665gi r4 = (C110665gi) this.A01;
                boolean z = A002.A02;
                boolean z2 = A002.A01;
                boolean z3 = A002.A00;
                if (z) {
                    r4.setVisibility(8);
                    return;
                }
                r4.A0I = z2;
                r4.A0H = z3;
                r4.A03();
                r4.setVisibility(8);
                r4.postDelayed(r4.A0N, 2000);
                return;
            case 3:
                TokenizedSearchInput tokenizedSearchInput = ((SearchFragment) this.A01).A0d;
                WaImageButton waImageButton = tokenizedSearchInput.A05;
                if (waImageButton != null && waImageButton.getVisibility() == 0) {
                    tokenizedSearchInput.A05.setEnabled(false);
                    return;
                }
                return;
            case 4:
                AnonymousClass74M r1 = (AnonymousClass74M) this.A01;
                AnonymousClass74M.A0J(r1, r1.A0b());
                return;
            default:
                return;
        }
    }

    public /* synthetic */ void C5e() {
        switch (this.A00) {
            case 1:
                Log.i("CameraUi/onShowingIncomingCallUI");
                AnonymousClass7DY r3 = (AnonymousClass7DY) this.A01;
                if (r3.A0t()) {
                    r3.A0l = false;
                    C140086zv r0 = r3.A0T;
                    if (r0 == null) {
                        C18070vi.A11("recordingController");
                        throw null;
                    } else {
                        AnonymousClass7DY.A0b(r3, r0.A03(), true, false);
                        return;
                    }
                } else {
                    return;
                }
            case 2:
                Log.i("ptvcameraui/onShowingIncomingCallUI");
                AnonymousClass74G r2 = (AnonymousClass74G) this.A01;
                LiteCameraView liteCameraView = r2.A04;
                if ((liteCameraView != null && liteCameraView.isRecording()) || C72463Mc.A1O(r2.A0w)) {
                    AnonymousClass74G.A06(r2, AnonymousClass00R.A0C, false);
                    return;
                }
                return;
            case 4:
                ((AnonymousClass74M) this.A01).A0U((File) null, (File) null);
                return;
            default:
                return;
        }
    }

    public /* synthetic */ void Bmn() {
    }

    public /* synthetic */ void BnK(AnonymousClass1BI r1, CallState callState, String str) {
    }
}
