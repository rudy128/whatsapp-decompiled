package X;

import com.whatsapp.conversationslist.ConversationsFragment;

/* renamed from: X.4ol  reason: invalid class name and case insensitive filesystem */
public class C97004ol implements C23691Hg {
    public final int A00;
    public final String A01;

    public C97004ol(String str, int i) {
        this.A00 = i;
        this.A01 = str;
    }

    public final void CGE(Object obj) {
        C38361rA r0;
        if (this.A00 != 0) {
            String str = this.A01;
            AnonymousClass4LW r10 = (AnonymousClass4LW) obj;
            C18070vi.A0d(r10, 1);
            AnonymousClass4aY r1 = r10.A00;
            if (AnonymousClass4aY.A26(r1)) {
                if (r1.A3D == null) {
                    AnonymousClass4aY.A0y(r1);
                }
                ((A59) AnonymousClass3Ma.A0Z(r1).A08.get()).A04(A3P.A00(r1.A3R), 37, 5, 31, true);
                r1.A3D.A0J(str);
                return;
            }
            return;
        }
        String str2 = this.A01;
        AnonymousClass4FJ r102 = (AnonymousClass4FJ) obj;
        C18070vi.A0d(r102, 1);
        AnonymousClass41K r103 = (AnonymousClass41K) r102;
        if (1 - r103.A00 == 0 && (r0 = ((ConversationsFragment) r103.A01).A1V) != null) {
            r0.CKf(str2);
        }
    }
}
