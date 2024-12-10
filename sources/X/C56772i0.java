package X;

/* renamed from: X.2i0  reason: invalid class name and case insensitive filesystem */
public class C56772i0 {
    public final /* synthetic */ C63292sp A00;

    public C56772i0(C63292sp r1) {
        this.A00 = r1;
    }

    public void A00(C129996ii r5, String str, int i) {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("CompanionDeviceQrHandler/onError code=");
        A10.append(i);
        A10.append(" reason : ");
        A10.append(str);
        A10.append("; pairing device=");
        C17900vP.A0b(r5.A01, A10);
        C63292sp r3 = this.A00;
        C63292sp.A00(r3);
        AnonymousClass1RK r2 = r3.A0C;
        synchronized (r2.A0M) {
            r2.A01 = null;
        }
        r3.A00 = null;
        C138556xH r22 = r3.A05;
        r22.A04.BiE(2, i, str);
        r22.A05.C00(str, i);
    }
}
