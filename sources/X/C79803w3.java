package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.whatsapp.jid.UserJid;
import java.util.Collection;

/* renamed from: X.3w3  reason: invalid class name and case insensitive filesystem */
public final class C79803w3 extends C94974lU {
    public final AnonymousClass1L9 A00;
    public final AnonymousClass1M9 A01;
    public final AnonymousClass1MZ A02;
    public final AnonymousClass12L A03;
    public final AnonymousClass00H A04;
    public final AnonymousClass00H A05;
    public final AnonymousClass4MR A06;

    public Drawable BSc(Context context, C18000vb r3) {
        C18070vi.A0d(context, 0);
        return C24261Jm.A00(context, 2131233235);
    }

    public String BaW(C108015az r6) {
        String A0R;
        AnonymousClass206 r0;
        UserJid A032;
        C18070vi.A0d(r6, 0);
        AnonymousClass4MR r2 = this.A06;
        Collection BYq = r6.BYq();
        String str = null;
        if (!(BYq == null || (r0 = (AnonymousClass206) C29431cG.A0Y(BYq)) == null || (A032 = AnonymousClass126.A03(r0)) == null)) {
            str = AnonymousClass3MY.A0q(r2.A01, r2.A00.A0H(A032));
        }
        Context context = (Context) ((C94964lT) r6).A01;
        if (str == null) {
            A0R = context.getString(2131892048);
        } else {
            A0R = C17890vO.A0R(context, str, 1, 0, 2131892049);
        }
        C18070vi.A0X(A0R);
        return A0R;
    }

    public boolean BRj() {
        return true;
    }

    public int getId() {
        return 11;
    }

    public C79803w3(AnonymousClass1L9 r2, AnonymousClass1M9 r3, AnonymousClass4MR r4, AnonymousClass1MZ r5, AnonymousClass12L r6, AnonymousClass00H r7, AnonymousClass00H r8) {
        C18070vi.A0w(r6, r2, r7, r3, r8);
        C18070vi.A0d(r5, 6);
        this.A03 = r6;
        this.A00 = r2;
        this.A04 = r7;
        this.A01 = r3;
        this.A05 = r8;
        this.A02 = r5;
        this.A06 = r4;
    }
}
