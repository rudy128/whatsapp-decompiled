package X;

import android.app.Activity;
import com.whatsapp.jid.Jid;

/* renamed from: X.AMo  reason: case insensitive filesystem */
public final /* synthetic */ class C20477AMo implements B77 {
    public final /* synthetic */ long A00;
    public final /* synthetic */ Activity A01;
    public final /* synthetic */ AnonymousClass5XY A02;
    public final /* synthetic */ AnonymousClass8nx A03;
    public final /* synthetic */ Jid A04;
    public final /* synthetic */ C20271AEe A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ String A07;

    public final void Bmx(AEW aew) {
        AnonymousClass8nx r3 = this.A03;
        Activity activity = this.A01;
        C20271AEe aEe = this.A05;
        String str = this.A06;
        String str2 = this.A07;
        long j = this.A00;
        AEW aew2 = aew;
        AnonymousClass8nx.A01(activity, aew2, this.A02, r3, this.A04, aEe, str, str2, j);
    }

    public /* synthetic */ C20477AMo(Activity activity, AnonymousClass5XY r2, AnonymousClass8nx r3, Jid jid, C20271AEe aEe, String str, String str2, long j) {
        this.A03 = r3;
        this.A01 = activity;
        this.A05 = aEe;
        this.A06 = str;
        this.A07 = str2;
        this.A00 = j;
        this.A04 = jid;
        this.A02 = r2;
    }
}
