package X;

import com.whatsapp.jid.UserJid;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Awa  reason: case insensitive filesystem */
public final class C22034Awa extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ UserJid $bizCompatibleLid;
    public final /* synthetic */ String $iqId;
    public final /* synthetic */ C195119sp $request;
    public final /* synthetic */ C167838hr this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C22034Awa(C195119sp r2, C167838hr r3, UserJid userJid, String str) {
        super(0);
        this.this$0 = r3;
        this.$iqId = str;
        this.$request = r2;
        this.$bizCompatibleLid = userJid;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        C178759Ei r7;
        C178759Ei r8;
        C167838hr r1 = this.this$0;
        String str = this.$iqId;
        C195119sp r4 = this.$request;
        UserJid userJid = this.$bizCompatibleLid;
        C18070vi.A0n(str, r4, userJid);
        String A0A = r1.A01.A0A(userJid);
        if (A0A != null) {
            r1.A00 = r4;
        }
        long j = (long) r4.A01;
        long j2 = (long) r4.A00;
        List list = r4.A04;
        ArrayList A0D = C29351c6.A0D(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            A0D.add(new C178709Ed(C17880vN.A0v(it), 3));
        }
        C178759Ei r9 = null;
        if (A0A != null) {
            r7 = new C178759Ei(A0A, 7);
        } else {
            r7 = null;
        }
        C194359rb r42 = r4.A02;
        if (r42 != null) {
            r8 = new C178759Ei(C29431cG.A0h(",", r42.A02, C22338B3p.A00), 8);
            r9 = new C178759Ei((long) r42.A01, (long) r42.A00);
        } else {
            r8 = null;
        }
        return new AnonymousClass9F6(userJid, r7, r8, r9, str, A0D, j, j2);
    }
}
