package X;

import com.whatsapp.jid.GroupJid;
import java.lang.ref.WeakReference;

/* renamed from: X.48z  reason: invalid class name and case insensitive filesystem */
public class C825948z extends A34 {
    public final AnonymousClass1TA A00;
    public final GroupJid A01;
    public final WeakReference A02;

    public /* bridge */ /* synthetic */ Object A0G(Object[] objArr) {
        return this.A00.A03(this.A01);
    }

    public /* bridge */ /* synthetic */ void A0H(Object obj) {
        AnonymousClass2Q4 r2 = (AnonymousClass2Q4) obj;
        C107175Yr r0 = (C107175Yr) this.A02.get();
        if (r0 != null) {
            r0.BwQ(r2);
        }
    }

    public C825948z(C107175Yr r2, AnonymousClass1TA r3, GroupJid groupJid) {
        this.A00 = r3;
        this.A02 = AnonymousClass3MW.A0z(r2);
        this.A01 = groupJid;
    }
}
