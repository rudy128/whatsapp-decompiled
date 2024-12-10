package X;

import android.view.View;
import com.whatsapp.jid.UserJid;

/* renamed from: X.4iB  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C92944iB implements C1598386b {
    public final /* synthetic */ View A00;
    public final /* synthetic */ AnonymousClass1FU A01;
    public final /* synthetic */ AnonymousClass3uP A02;
    public final /* synthetic */ UserJid A03;

    public final void BzV(boolean z) {
        AnonymousClass3uP r3 = this.A02;
        AnonymousClass1FU r2 = this.A01;
        UserJid userJid = this.A03;
        View view = this.A00;
        if (!z) {
            AnonymousClass3uP.A0V(view, r2, r3, userJid);
        }
    }

    public /* synthetic */ C92944iB(View view, AnonymousClass1FU r2, AnonymousClass3uP r3, UserJid userJid) {
        this.A02 = r3;
        this.A01 = r2;
        this.A03 = userJid;
        this.A00 = view;
    }
}
