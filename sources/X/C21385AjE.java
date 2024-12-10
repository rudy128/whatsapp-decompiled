package X;

import android.app.Activity;
import java.util.HashMap;
import java.util.Iterator;

/* renamed from: X.AjE  reason: case insensitive filesystem */
public final /* synthetic */ class C21385AjE implements Runnable {
    public final /* synthetic */ long A00;
    public final /* synthetic */ Activity A01;
    public final /* synthetic */ AnonymousClass8nx A02;
    public final /* synthetic */ AnonymousClass1BI A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ HashMap A06;

    public final void run() {
        C20285AEt A0g;
        C20277AEk aEk;
        HashMap hashMap = this.A06;
        AnonymousClass8nx r6 = this.A02;
        Activity activity = this.A01;
        String str = this.A04;
        long j = this.A00;
        AnonymousClass1BI r8 = this.A03;
        String str2 = this.A05;
        String A0m = AnonymousClass8BW.A0m(hashMap);
        C18070vi.A0z(activity, "null cannot be cast to non-null type com.whatsapp.conversation.ConversationInterface");
        ((C108885cS) activity).CHX(j, str, A0m);
        AnonymousClass206 A012 = AnonymousClass1W2.A01(AnonymousClass205.A01(r8, str2, false), r6.A03);
        if (A012 != null && (A0g = AnonymousClass8BR.A0g(A012)) != null && A0g.A00 == 5 && (aEk = A0g.A06) != null) {
            Iterator it = aEk.A03.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C20253ADl aDl = (C20253ADl) it.next();
                if (C18070vi.A18(aDl.A01.A02, "address_message")) {
                    aDl.A00 = true;
                    break;
                }
            }
            r6.A00.CQw(A012);
        }
    }

    public /* synthetic */ C21385AjE(Activity activity, AnonymousClass8nx r2, AnonymousClass1BI r3, String str, String str2, HashMap hashMap, long j) {
        this.A06 = hashMap;
        this.A02 = r2;
        this.A01 = activity;
        this.A04 = str;
        this.A00 = j;
        this.A03 = r3;
        this.A05 = str2;
    }
}
