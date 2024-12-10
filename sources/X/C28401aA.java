package X;

import com.whatsapp.util.Log;
import java.util.Map;

/* renamed from: X.1aA  reason: invalid class name and case insensitive filesystem */
public class C28401aA {
    public final C26811To A00;
    public final AnonymousClass00H A01;
    public final Map A02;
    public final AnonymousClass10I A03;

    public C28401aA(C26811To r16, AnonymousClass11P r17, C19830z4 r18, C18030ve r19, C28391a8 r20, AnonymousClass10I r21, AnonymousClass00H r22) {
        C18030ve r14 = r19;
        C18070vi.A0d(r14, 1);
        AnonymousClass11P r7 = r17;
        C18070vi.A0d(r7, 2);
        C28391a8 r4 = r20;
        C18070vi.A0d(r4, 3);
        AnonymousClass10I r1 = r21;
        C18070vi.A0d(r1, 4);
        AnonymousClass00H r0 = r22;
        C18070vi.A0d(r0, 5);
        C19830z4 r5 = r18;
        C18070vi.A0d(r5, 6);
        C26811To r2 = r16;
        C18070vi.A0d(r2, 7);
        this.A03 = r1;
        this.A01 = r0;
        this.A00 = r2;
        this.A02 = AnonymousClass1D7.A0C(new AnonymousClass1D6("community_home", new C28421aC(r5)), new AnonymousClass1D6("community", new C28431aD(r5, r14)), new AnonymousClass1D6("ephemeral", new C28441aE(r5)), new AnonymousClass1D6("ephemeral_view_once", new C28451aF(r5)), new AnonymousClass1D6("ephemeral_view_once_receiver", new AnonymousClass1aG(r5)), new AnonymousClass1D6("newsletter_multi_admin", new C28461aH(r5)), new AnonymousClass1D6("support_ai", new C28471aI(r5)), new AnonymousClass1D6("community_events", new C28481aJ(r7, r5)), new AnonymousClass1D6("add_to_favorites", new C28491aK(r4)), new AnonymousClass1D6("message_label_deprecation_migrated", new C28501aL(r5)), new AnonymousClass1D6("lists_nux", new C28511aM(r4)));
    }

    public final boolean A01(Object obj, String str) {
        C28411aB r1;
        Object obj2 = this.A02.get(str);
        if ((obj2 instanceof C28411aB) && (r1 = (C28411aB) obj2) != null) {
            return r1.Bck(obj);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Support for the nux key ");
        sb.append(str);
        sb.append(" has not been added yet.");
        Log.e(sb.toString());
        return false;
    }

    public final void A00(String str, Object obj) {
        Object obj2 = this.A02.get(str);
        if (!(obj2 instanceof C28411aB) || obj2 == null) {
            StringBuilder sb = new StringBuilder();
            sb.append("Support for the nux key ");
            sb.append(str);
            sb.append(" has not been added yet.");
            Log.e(sb.toString());
            return;
        }
        this.A03.CGF(new C21435Ak2(obj2, obj, this, 24));
    }
}
