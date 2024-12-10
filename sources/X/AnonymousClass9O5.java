package X;

import android.content.IntentFilter;
import android.media.AudioManager;
import com.whatsapp.util.Log;
import com.whatsapp.voipcalling.CallInfo;
import com.whatsapp.voipcalling.CallState;

/* renamed from: X.9O5  reason: invalid class name */
public abstract class AnonymousClass9O5 {
    public C184259af A00;
    public boolean A01;

    public void A00() {
        AnonymousClass8lJ r0 = (AnonymousClass8lJ) this;
        r0.A02.A01(r0.A01, r0.A00, new IntentFilter("android.intent.action.HEADSET_PLUG"), true);
    }

    public void A01() {
        AnonymousClass8lJ r0 = (AnonymousClass8lJ) this;
        r0.A02.A02(r0.A00, r0.A01);
    }

    public boolean A03() {
        AudioManager A0D = ((AnonymousClass8lJ) this).A03.A0D();
        if (A0D == null) {
            return false;
        }
        return A0D.isWiredHeadsetOn();
    }

    public final void A02() {
        boolean A03 = A03();
        if (this.A01 != A03) {
            this.A01 = A03;
            C184259af r0 = this.A00;
            if (r0 != null) {
                C21067Adx adx = r0.A01;
                AnonymousClass1HQ r2 = r0.A00;
                C17900vP.A0Y(adx, "voip/audio_route/HeadsetMonitor ", AnonymousClass000.A10());
                CallInfo BO3 = r2.BO3();
                if (BO3 == null || BO3.callState == CallState.NONE) {
                    Log.e("voip/audio_route/headsetPlugReceiver ignored, not in any call");
                    return;
                }
                adx.A05 = A03;
                adx.A07(BO3, (Boolean) null);
                if (A03) {
                    adx.A04 = true;
                    Log.i("voip/audio_route/headset Plugged");
                    if (adx.A00 == 1) {
                        C21431Ajy.A00(adx.A0L, adx, BO3, 6);
                        adx.A0A(BO3, false);
                        return;
                    }
                    return;
                }
                Log.i("voip/audio_route/headset Unplugged");
                adx.A06(BO3, (Boolean) null);
            }
        }
    }
}
