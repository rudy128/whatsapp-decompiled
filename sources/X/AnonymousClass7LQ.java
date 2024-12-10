package X;

import com.whatsapp.util.Log;

/* renamed from: X.7LQ  reason: invalid class name */
public final class AnonymousClass7LQ implements AnonymousClass1O5 {
    public C126306cW A00;
    public final AnonymousClass11S A01;
    public final AnonymousClass11E A02;
    public final AnonymousClass00H A03;
    public final AnonymousClass190 A04;
    public final AnonymousClass1KB A05;

    public void Bt9(C29621ca r5, String str) {
        C18070vi.A0d(r5, 1);
        Log.e("DeleteBusinessActivityReport/onError");
        C146767Qn.A00(this.A05, this, 36);
        AnonymousClass190 r2 = this.A04;
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("error_code=");
        r2.A0G("DeleteBusinessActivityReport/delete business activity error", C17880vN.A0t(A10, C60482o6.A00(r5)), true);
    }

    public void BrD(String str) {
        Log.e("DeleteBusinessActivityReportProtocolHelper/delivery-error");
        C146767Qn.A00(this.A05, this, 38);
    }

    public void C7Z(C29621ca r3, String str) {
        C146767Qn.A00(this.A05, this, 37);
    }

    public AnonymousClass7LQ(AnonymousClass190 r1, AnonymousClass1KB r2, AnonymousClass11S r3, AnonymousClass11E r4, AnonymousClass00H r5) {
        C18070vi.A0w(r2, r1, r3, r5, r4);
        this.A05 = r2;
        this.A04 = r1;
        this.A01 = r3;
        this.A03 = r5;
        this.A02 = r4;
    }

    public /* synthetic */ C22384B5n CM9(String str) {
        return C20958AcC.A00;
    }
}
