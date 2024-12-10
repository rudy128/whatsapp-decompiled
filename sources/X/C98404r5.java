package X;

import com.whatsapp.util.Log;
import com.whatsapp.voipcalling.CallState;
import com.whatsapp.wds.components.button.WDSButton;

/* renamed from: X.4r5  reason: invalid class name and case insensitive filesystem */
public class C98404r5 implements AnonymousClass1IV {
    public final int A00;
    public final Object A01;

    public C98404r5(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public /* synthetic */ void Bmn() {
    }

    public /* synthetic */ void Bn7(C178119Bw r9) {
        switch (this.A00) {
            case 0:
                return;
            case 1:
                AnonymousClass3s0.A00((AnonymousClass3s0) this.A01);
                return;
            case 2:
                AnonymousClass4aY r5 = (AnonymousClass4aY) this.A01;
                if (C18020vd.A00(C18040vf.A02, r5.A3F, 11700) > 0 && r5.A2O != null) {
                    r5.A2Q.getTime();
                    long currentTimeMillis = System.currentTimeMillis();
                    AnonymousClass4NF r3 = r5.A2O;
                    if (currentTimeMillis - r3.A00 <= 3000) {
                        r5.A1M.post(new AnonymousClass7RF(r5, r3.A01, 35, r3.A02));
                    } else {
                        Log.e("conversation/maybeStartPendingOutgoingCall failed with timeout");
                    }
                    r5.A2O = null;
                }
                r5.A2Q.invalidateOptionsMenu();
                r5.A2Y.A0W(true);
                AnonymousClass4aY.A15(r5);
                return;
            default:
                C91454fi.A00((C91454fi) this.A01);
                return;
        }
    }

    public /* synthetic */ void BnH(long j, boolean z, boolean z2, boolean z3, boolean z4) {
        switch (this.A00) {
            case 1:
                AnonymousClass3s0 r2 = (AnonymousClass3s0) this.A01;
                WDSButton wDSButton = r2.A0A;
                if (wDSButton != null) {
                    wDSButton.setEnabled(false);
                }
                AnonymousClass3s0.A01(r2);
                return;
            case 2:
                ((AnonymousClass4aY) this.A01).A2Y.A0W(false);
                return;
            default:
                return;
        }
    }

    public void BnJ(C178119Bw r4) {
        switch (this.A00) {
            case 0:
                Log.i("voipnotallowedactivity/onCallStarted finish this activity");
                AnonymousClass3MW.A1U(this.A01);
                return;
            case 1:
                AnonymousClass3s0.A00((AnonymousClass3s0) this.A01);
                return;
            case 2:
                AnonymousClass4aY r2 = (AnonymousClass4aY) this.A01;
                AnonymousClass4aY.A0u(r2);
                AnonymousClass4aY.A0W(AnonymousClass17U.A00(r4), r2);
                r2.A2Y.A0W(false);
                C72453Mb.A1M(r2.A4Z);
                return;
            default:
                C91454fi.A00((C91454fi) this.A01);
                return;
        }
    }

    public /* synthetic */ void BnK(AnonymousClass1BI r2, CallState callState, String str) {
        if (2 - this.A00 == 0 && callState == CallState.ACTIVE) {
            ((AnonymousClass4aY) this.A01).A2Q.invalidateOptionsMenu();
        }
    }

    public /* synthetic */ void C5e() {
        if (2 - this.A00 == 0) {
            C108865cQ r0 = ((AnonymousClass4aY) this.A01).A2Q;
            AnonymousClass4aV.A02(r0.getContentView(), r0.getMessageAudioPlayerProvider());
        }
    }

    public /* synthetic */ void BnG(C178119Bw r1, boolean z) {
    }
}
