package X;

import android.telecom.CallAudioState;
import android.telecom.CallEndpoint;
import com.whatsapp.util.Log;
import com.whatsapp.voipcalling.CallInfo;
import com.whatsapp.voipcalling.Voip;

/* renamed from: X.8lN  reason: invalid class name */
public class AnonymousClass8lN extends AnonymousClass1VR {
    public final /* synthetic */ AnonymousClass1HQ A00;
    public final /* synthetic */ C21067Adx A01;
    public final /* synthetic */ A99 A02;
    public final /* synthetic */ AnonymousClass1VM A03;
    public final /* synthetic */ AnonymousClass1DC A04;

    public AnonymousClass8lN(AnonymousClass1HQ r1, C21067Adx adx, A99 a99, AnonymousClass1VM r4, AnonymousClass1DC r5) {
        this.A01 = adx;
        this.A00 = r1;
        this.A04 = r5;
        this.A03 = r4;
        this.A02 = a99;
    }

    public void A00(CallAudioState callAudioState, String str) {
        C17960vV.A02();
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("voip/audio_route/selfManagedConnectionListener/onCallAudioStateChanged ");
        AnonymousClass8BT.A1V(A10, str);
        C21067Adx adx = this.A01;
        A10.append(Voip.A06(adx.A00));
        C17900vP.A0Y(callAudioState, " -> ", A10);
        CallInfo BO3 = this.A00.BO3();
        if (Voip.A09(BO3, str)) {
            C17960vV.A07(BO3);
            C21431Ajy.A00(adx.A0L, adx, BO3, 3);
        }
    }

    public void A01(CallEndpoint callEndpoint, String str) {
        C17960vV.A02();
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("voip/audio_route/selfManagedConnectionListener/onCallEndPointChanged ");
        AnonymousClass8BT.A1V(A10, str);
        C21067Adx adx = this.A01;
        A10.append(Voip.A06(adx.A00));
        C17900vP.A0Y(callEndpoint, " -> ", A10);
        CallInfo BO3 = this.A00.BO3();
        if (Voip.A09(BO3, str)) {
            C21431Ajy.A00(adx.A0L, adx, BO3, 3);
            A99 a99 = this.A02;
            Log.i("voip/service/onCallEndPointSet removing HANDLER_WHAT_AUTO_UPADTE_AUDIO_ROUTE");
            a99.A0H.removeMessages(63);
        }
    }
}
