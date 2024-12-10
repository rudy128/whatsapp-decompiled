package X;

import com.whatsapp.voipcalling.CallInfo;

/* renamed from: X.4T2  reason: invalid class name */
public final class AnonymousClass4T2 {
    public final String A00;
    public final boolean A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass4T2) {
                AnonymousClass4T2 r5 = (AnonymousClass4T2) obj;
                if (!C18070vi.A18(this.A00, r5.A00) || this.A01 != r5.A01) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public AnonymousClass4T2(CallInfo callInfo) {
        String str = callInfo.callId;
        C18070vi.A0X(str);
        boolean z = callInfo.videoEnabled;
        this.A00 = str;
        this.A01 = z;
    }

    public int hashCode() {
        return C17880vN.A01(C17880vN.A03(this.A00), this.A01);
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("CallArEffectsCallInfo(callId=");
        A10.append(this.A00);
        A10.append(", isVideoEnabled=");
        return C17900vP.A0F(A10, this.A01);
    }
}
