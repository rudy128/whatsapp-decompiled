package X;

import com.whatsapp.util.Log;

/* renamed from: X.7Q8  reason: invalid class name */
public final /* synthetic */ class AnonymousClass7Q8 implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ C129996ii A02;
    public final /* synthetic */ C143397Df A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;

    public final void run() {
        AnonymousClass2SB A07;
        C143397Df r7 = this.A03;
        C129996ii r9 = this.A02;
        long j = this.A01;
        int i = this.A00;
        String str = this.A04;
        String str2 = this.A05;
        if (r9 == null || (A07 = r7.A04.A07(r9.A00, r9.A03)) == null) {
            Log.e("CompanionRegistrationLogger/no session id");
            return;
        }
        if (j != 0) {
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("CompanionRegistrationLogger/error: ");
            A10.append(i);
            A10.append(";");
            A10.append(j);
            C17900vP.A0e(";", str, A10);
        }
        AnonymousClass649 r6 = new AnonymousClass649();
        r6.A0B = A07.A01;
        r6.A07 = str2;
        r6.A0A = A07.A00;
        long A002 = AnonymousClass11P.A00(r7.A05);
        r6.A06 = Long.valueOf(A002);
        r6.A04 = C108945cZ.A1B(A002, r7.A01);
        r7.A01 = A002;
        r6.A01 = Integer.valueOf(i);
        r6.A05 = Long.valueOf(j);
        r6.A00 = r9.A02;
        r6.A03 = Integer.valueOf(r7.A00);
        r6.A08 = r7.A02;
        r6.A09 = str;
        r6.A02 = C17880vN.A0h();
        r7.A06.CC7(r6);
    }

    public /* synthetic */ AnonymousClass7Q8(C129996ii r1, C143397Df r2, String str, String str2, int i, long j) {
        this.A03 = r2;
        this.A02 = r1;
        this.A01 = j;
        this.A00 = i;
        this.A04 = str;
        this.A05 = str2;
    }
}
