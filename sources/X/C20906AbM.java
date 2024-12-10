package X;

import android.content.Context;
import android.content.Intent;
import com.whatsapp.jid.UserJid;
import java.util.Map;

/* renamed from: X.AbM  reason: case insensitive filesystem */
public final class C20906AbM implements C22521BBe {
    public final /* synthetic */ int A00;
    public final /* synthetic */ AnonymousClass1FR A01;
    public final /* synthetic */ C183159Xe A02;
    public final /* synthetic */ C191609ms A03;
    public final /* synthetic */ C195409tI A04;

    public C20906AbM(AnonymousClass1FR r1, C183159Xe r2, C191609ms r3, C195409tI r4, int i) {
        this.A03 = r3;
        this.A02 = r2;
        this.A04 = r4;
        this.A00 = i;
        this.A01 = r1;
    }

    public void Btu(C19980A1q a1q, Map map) {
        C183159Xe r0 = this.A02;
        if (r0 != null) {
            r0.A00.finish();
        }
    }

    public void C7V(Map map) {
        C191609ms r5 = this.A03;
        C183159Xe r0 = this.A02;
        if (r0 != null) {
            r0.A00.finish();
        }
        if (map == null) {
            ((A6O) r5.A03.get()).A04(this.A04, this.A00);
            return;
        }
        Object obj = map.get("completed");
        if ((obj instanceof Boolean) && AnonymousClass000.A1Y(obj)) {
            C195409tI r3 = this.A04;
            int i = this.A00;
            A6O.A01(new C171108rB(), (A6O) r5.A03.get(), r3, 8, i);
        }
        Object obj2 = map.get("shouldReport");
        if (!(obj2 instanceof Boolean) || !AnonymousClass000.A1Y(obj2)) {
            Object obj3 = map.get("shouldBlock");
            if ((obj3 instanceof Boolean) && AnonymousClass000.A1Y(obj3)) {
                Context context = r5.A01.A00;
                Intent A1E = AnonymousClass1LU.A1E(context, this.A04.A02, "biz_account_info_block", true, true, false, false);
                A1E.setFlags(268435456);
                context.startActivity(A1E);
                return;
            }
            return;
        }
        C18030ve r4 = r5.A02;
        UserJid userJid = this.A04.A02;
        C134136q6 r02 = new C134136q6(r4, userJid, "chat", false);
        r02.A06 = false;
        r02.A09 = false;
        r02.A08 = false;
        r02.A01 = userJid;
        AnonymousClass1FR r1 = this.A01;
        if (r1 != null) {
            r1.CMl(r02.A00());
        }
    }
}
