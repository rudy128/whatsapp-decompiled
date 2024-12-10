package X;

/* renamed from: X.4iw  reason: invalid class name and case insensitive filesystem */
public class C93414iw implements C107175Yr {
    public final int A00;
    public final Object A01;

    public C93414iw(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void BwQ(AnonymousClass2Q4 r4) {
        int i = this.A00;
        Object obj = this.A01;
        if (i != 0) {
            C91454fi r2 = (C91454fi) obj;
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("GroupCallButtonController/fetchJoinableCallLogCallback groupJid: ");
            C17900vP.A0b(r2.A05, A10);
            if (!C42171xk.A00(r4, r2.A07)) {
                r2.A07 = r4;
                if (r4 != null) {
                    C91454fi.A01(r2, r4.A01());
                }
            }
            C91454fi.A00(r2);
            return;
        }
        C77843ra r22 = (C77843ra) obj;
        StringBuilder A102 = AnonymousClass000.A10();
        A102.append("groupconversationmenu/fetchJoinableCallLogCallback groupJid: ");
        C17900vP.A0b(r22.A0G, A102);
        if (!C42171xk.A00(r4, r22.A02)) {
            r22.A02 = r4;
            if (r4 != null) {
                C77843ra.A07(r22, r4.A01());
            }
            r22.A01.invalidateOptionsMenu();
        }
    }
}
