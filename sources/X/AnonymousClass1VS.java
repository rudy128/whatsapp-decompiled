package X;

import android.os.SystemClock;
import com.whatsapp.util.Log;

/* renamed from: X.1VS  reason: invalid class name */
public class AnonymousClass1VS extends AnonymousClass1VR {
    public final /* synthetic */ C24911Md A00;
    public final /* synthetic */ AnonymousClass1VQ A01;
    public final /* synthetic */ AnonymousClass1VM A02;
    public final /* synthetic */ AnonymousClass11P A03;
    public final /* synthetic */ AnonymousClass118 A04;
    public final /* synthetic */ C18030ve A05;

    public AnonymousClass1VS(C24911Md r1, AnonymousClass1VQ r2, AnonymousClass1VM r3, AnonymousClass11P r4, AnonymousClass118 r5, C18030ve r6) {
        this.A01 = r2;
        this.A03 = r4;
        this.A05 = r6;
        this.A04 = r5;
        this.A02 = r3;
        this.A00 = r1;
    }

    public void A06(String str, boolean z) {
        C17960vV.A02();
        AnonymousClass1VQ r3 = this.A01;
        C62172qu r5 = r3.A0g;
        StringBuilder sb = new StringBuilder();
        sb.append("app/startOutgoingCall/onCreateOutgoingConnection ");
        sb.append(str);
        sb.append(", pendingCallCommand: ");
        sb.append(r5);
        Log.i(sb.toString());
        if (r5 == null || !str.equals(r5.A0B)) {
            AnonymousClass1VM.A00(this.A02).A0J(str);
            return;
        }
        long j = r3.A00;
        if (j > 0) {
            r5.A01 = SystemClock.elapsedRealtime() - j;
        } else {
            C17960vV.A0F(false, "selfManagedConnectionNewCallTs is not set");
        }
        if (!z) {
            r3.A0M.CGF(new C21431Ajy(r3, r5, 35));
        } else {
            boolean z2 = r5.A0E;
            boolean z3 = r5.A06;
            if (z2 && !z3 && C40811vJ.A0X(r3.A0J)) {
                if (C18020vd.A05(C18040vf.A02, this.A05, 6688)) {
                    r3.BAc(this.A04.A00, true);
                }
            }
            AnonymousClass1VQ.A08(r3, r5);
        }
        r3.A0g = null;
        r3.A02.removeMessages(1);
    }
}
