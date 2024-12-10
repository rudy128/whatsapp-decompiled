package X;

import android.content.SharedPreferences;
import com.whatsapp.jid.GroupJid;

/* renamed from: X.4Q3  reason: invalid class name */
public final class AnonymousClass4Q3 {
    public final C18010vc A00;
    public final C18100vl A01 = AnonymousClass1DF.A01(new C101895Ej(this));

    public AnonymousClass4Q3(C18010vc r2) {
        C18070vi.A0d(r2, 1);
        this.A00 = r2;
    }

    public final void A00(GroupJid groupJid, boolean z) {
        C17900vP.A0n("CommunitySharedPrefs/ setTempIsClosed()/isClosed = ", AnonymousClass000.A10(), z);
        SharedPreferences.Editor A0A = C17890vO.A0A(this.A01);
        C18070vi.A0X(A0A);
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("closed_");
        C17880vN.A1F(A0A, AnonymousClass000.A0y(groupJid.getRawString(), A10), z);
    }
}
