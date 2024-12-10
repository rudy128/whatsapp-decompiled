package X;

/* renamed from: X.AcI  reason: case insensitive filesystem */
public final class C20964AcI implements AnonymousClass1O5 {
    public final /* synthetic */ C21004Acw A00;
    public final /* synthetic */ String A01;

    public C20964AcI(C21004Acw acw, String str) {
        this.A01 = str;
        this.A00 = acw;
    }

    public void BrD(String str) {
        StringBuilder A0K = C18070vi.A0K(str);
        A0K.append("CallingIncomingPushObserver/sendPing/onDeliveryFailure: callId = ");
        A0K.append(this.A01);
        C17900vP.A0e(", iqId = ", str, A0K);
        C29771cq r3 = this.A00.A04;
        r3.A0F.execute(new C70583Br(r3, 37));
    }

    public void Bt9(C29621ca r3, String str) {
        StringBuilder A0K = C18070vi.A0K(str);
        A0K.append("CallingIncomingPushObserver/sendPing/onError: callId = ");
        A0K.append(this.A01);
        C17900vP.A0e(", iqId = ", str, A0K);
    }

    public void C7Z(C29621ca r3, String str) {
        StringBuilder A0K = C18070vi.A0K(str);
        A0K.append("CallingIncomingPushObserver/sendPing/onSuccess: callId = ");
        A0K.append(this.A01);
        C17900vP.A0f(", iqId = ", str, A0K);
    }

    public /* synthetic */ C22384B5n CM9(String str) {
        return C20958AcC.A00;
    }
}
