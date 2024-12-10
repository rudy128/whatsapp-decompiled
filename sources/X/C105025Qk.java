package X;

import android.content.SharedPreferences;
import com.whatsapp.jid.UserJid;
import java.util.List;

/* renamed from: X.5Qk  reason: invalid class name and case insensitive filesystem */
public final class C105025Qk extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ AnonymousClass3Uv this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C105025Qk(AnonymousClass3Uv r2) {
        super(1);
        this.this$0 = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C20955Ac9 ac9;
        List list;
        int size;
        AnonymousClass3Uv r4 = this.this$0;
        AnonymousClass206 A0r = AnonymousClass3MX.A0r(r4.A00);
        List list2 = null;
        if (A0r != null) {
            ac9 = (C20955Ac9) C18070vi.A09(A0r, C20955Ac9.class).A02;
        } else {
            ac9 = null;
        }
        C22801Dg r2 = r4.A03;
        if (ac9 != null) {
            list2 = ac9.A03;
        }
        r2.A0F(list2);
        if (!(ac9 == null || ac9.A00 || (list = ac9.A03) == null || (size = list.size()) == 0)) {
            Object A06 = r4.A00.A06();
            if (A06 != null) {
                r4.A0F.CGF(new C21451AkI(r4, A06, 32));
            }
            AnonymousClass1BI r0 = r4.A0E;
            C32951i1 r6 = r4.A0A;
            long j = (long) size;
            SharedPreferences A00 = C32951i1.A00(r6);
            String rawString = r0.getRawString();
            StringBuilder A0K = C18070vi.A0K(rawString);
            A0K.append(rawString);
            r6.A0T.execute(new C21366Aiv(r6, A00, AnonymousClass000.A0y("_BotMessagePromptsRowCount", A0K), 4, j));
            ac9.A00 = true;
        }
        if (r2.A06() == null) {
            AnonymousClass206 A0r2 = AnonymousClass3MX.A0r(r4.A00);
            if (A0r2 != null) {
                AnonymousClass1BI r3 = A0r2.A0v.A00;
                if ((r3 instanceof UserJid) && r3 != null) {
                    r4.A0F.CGN(new C21434Ak1(r4, r3, A0r2, 7));
                }
            }
        } else {
            r4.A02.set(false);
        }
        return C27621Wu.A00;
    }
}
