package X;

import com.whatsapp.jid.UserJid;
import com.whatsapp.voipcalling.CallInfo;
import com.whatsapp.voipcalling.CallState;

/* renamed from: X.BCr  reason: case insensitive filesystem */
public interface C22558BCr {
    void BE4(CallInfo callInfo, CallState callState, boolean z);

    void C2A(boolean z);

    void CQS(CallInfo callInfo, int i, boolean z);

    void CRo(CallInfo callInfo);

    void finish();

    void videoRenderStarted(UserJid userJid);
}
