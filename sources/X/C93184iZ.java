package X;

import android.content.Context;
import android.content.Intent;
import com.whatsapp.jid.UserJid;

/* renamed from: X.4iZ  reason: invalid class name and case insensitive filesystem */
public final class C93184iZ implements C108835cN {
    public final C84674Kk A00;
    public final AnonymousClass1V9 A01;
    public final AnonymousClass1LU A02;
    public final UserJid A03;

    public /* bridge */ /* synthetic */ void Bop(Object obj) {
        Context context = (Context) obj;
        C18070vi.A0d(context, 0);
        Intent A20 = this.A02.A20(context, this.A03, false);
        C18070vi.A0X(A20);
        A20.putExtra("lobbyEntryPoint", 7);
        this.A01.A00(37, 86);
        AnonymousClass1VE r1 = this.A00.A00;
        if (!C17880vN.A1W(AnonymousClass1VE.A00(r1), "permanently_hide_return_to_call_text")) {
            AnonymousClass3MZ.A08(r1).putBoolean("permanently_hide_return_to_call_text", true).commit();
        }
        context.startActivity(A20);
    }

    public C93184iZ(C84674Kk r1, AnonymousClass1V9 r2, AnonymousClass1LU r3, UserJid userJid) {
        C18070vi.A0j(r3, r1);
        this.A02 = r3;
        this.A00 = r1;
        this.A01 = r2;
        this.A03 = userJid;
    }
}
