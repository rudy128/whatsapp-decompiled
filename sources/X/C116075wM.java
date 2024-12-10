package X;

import android.view.View;
import android.view.animation.AlphaAnimation;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import com.whatsapp.voipcalling.CallInfo;
import com.whatsapp.voipcalling.ReplyWithMessageDialogFragment;
import com.whatsapp.voipcalling.VoipActivityV2;

/* renamed from: X.5wM  reason: invalid class name and case insensitive filesystem */
public abstract class C116075wM extends C116085wN {
    public C1594384n A00;
    public CallInfo A01;
    public boolean A02;
    public boolean A03;

    public final void setAnswerCallViewListener(C1594384n r2) {
        C18070vi.A0d(r2, 0);
        this.A00 = r2;
    }

    /* JADX WARNING: type inference failed for: r0v7, types: [java.lang.Object, X.6uK] */
    public final void A03() {
        int i = 1;
        if (this.A02) {
            i = 5;
        }
        C1594384n r0 = this.A00;
        if (r0 != null) {
            VoipActivityV2 voipActivityV2 = ((AnonymousClass7DG) r0).A00;
            C195199sx r5 = (C195199sx) voipActivityV2.A1x.get();
            View view = voipActivityV2.A0D;
            String str = voipActivityV2.A21;
            C18070vi.A0h(view, str);
            if ((C18020vd.A00(C18040vf.A02, r5.A04, 8175) & 4) == 4) {
                ? obj = new Object();
                obj.A02();
                r5.A02 = obj;
                r5.A02(view, str);
                Log.i("VoipUXResponsivenessLogger startCallAnswerMarker started");
            }
            VoipActivityV2.A1e(voipActivityV2, i);
            VoipActivityV2.A27(voipActivityV2);
        }
    }

    public final void A04() {
        String str;
        C1594384n r2 = this.A00;
        if (r2 != null) {
            CallInfo callInfo = this.A01;
            UserJid userJid = null;
            if (callInfo != null) {
                userJid = callInfo.getPeerJid();
            }
            if (userJid == null) {
                throw AnonymousClass000.A0n("Required value was null.");
            } else if (callInfo == null || (str = callInfo.callId) == null) {
                throw AnonymousClass000.A0n("Required value was null.");
            } else {
                VoipActivityV2 voipActivityV2 = ((AnonymousClass7DG) r2).A00;
                if (voipActivityV2.A2F) {
                    voipActivityV2.A4h(new ReplyWithMessageDialogFragment(userJid, str), "ReplyWithMessageDialogFragment");
                }
            }
        }
    }

    public void A05(boolean z) {
        C1594384n r0 = this.A00;
        if (r0 != null) {
            ((AnonymousClass7DG) r0).A00.A4j("ReplyWithMessageDialogFragment");
        }
        if (z) {
            Log.i("voip/VoipCallAnswerCallView/hide with animation");
            AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
            alphaAnimation.setDuration(125);
            alphaAnimation.setStartOffset(0);
            alphaAnimation.setAnimationListener(new C74613c2(this, 1));
            startAnimation(alphaAnimation);
            return;
        }
        Log.i("voip/VoipCallAnswerCallView/hide");
        setVisibility(8);
    }

    public void A06(CallInfo callInfo, boolean z, boolean z2) {
        this.A01 = callInfo;
        this.A03 = callInfo.isPeerRequestingUpgrade();
        this.A02 = z;
    }

    public final CallInfo getCallInfo() {
        return this.A01;
    }

    public final void setCallInfo(CallInfo callInfo) {
        this.A01 = callInfo;
    }

    public final void setPendingCall(boolean z) {
        this.A02 = z;
    }

    public final void setUpgrading(boolean z) {
        this.A03 = z;
    }
}
