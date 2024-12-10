package X;

import com.facebook.graphql.calls.GraphQlCallInput;
import com.whatsapp.infra.graphql.generated.nativecontacts.ContactsBackupMutationResponseImpl;

/* renamed from: X.6pm  reason: invalid class name and case insensitive filesystem */
public final class C133956pm {
    public AnonymousClass1M9 A00;
    public C139486yv A01;
    public AnonymousClass12E A02;
    public AnonymousClass10I A03;
    public final C26811To A04;
    public final AnonymousClass1PY A05;

    /* JADX WARNING: Removed duplicated region for block: B:9:0x002a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A00(X.AnonymousClass1M9 r5, X.C139486yv r6, X.AnonymousClass12E r7, X.AnonymousClass10I r8, boolean r9, boolean r10, boolean r11, boolean r12) {
        /*
            r4 = this;
            r0 = 3
            X.C72473Md.A1M(r6, r5, r7, r0)
            r0 = 6
            X.C18070vi.A0d(r8, r0)
            r4.A01 = r6
            r4.A00 = r5
            r4.A02 = r7
            r4.A03 = r8
            java.util.ArrayList r3 = r5.A0L()
            if (r10 == 0) goto L_0x003e
            X.10I r2 = r4.A03
            if (r9 == 0) goto L_0x0034
            if (r2 == 0) goto L_0x0052
            r0 = 14
            X.7Qx r1 = new X.7Qx
            r1.<init>(r3, r4, r0, r12)
        L_0x0023:
            r2.CGF(r1)
        L_0x0026:
            X.10I r2 = r4.A03
            if (r2 == 0) goto L_0x0052
            r1 = 3
            X.4ro r0 = new X.4ro
            r0.<init>((java.lang.Object) r4, (int) r1)
            r2.CGF(r0)
            return
        L_0x0034:
            if (r2 == 0) goto L_0x0052
            r0 = 13
            X.7Qx r1 = new X.7Qx
            r1.<init>(r3, r4, r0, r11)
            goto L_0x0023
        L_0x003e:
            if (r9 != 0) goto L_0x0026
            boolean r0 = X.C17880vN.A1X(r3)
            if (r0 == 0) goto L_0x0026
            X.10I r2 = r4.A03
            if (r2 == 0) goto L_0x0052
            r0 = 20
            X.7Pl r1 = new X.7Pl
            r1.<init>(r4, r3, r0)
            goto L_0x0023
        L_0x0052:
            X.AnonymousClass3MW.A1G()
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C133956pm.A00(X.1M9, X.6yv, X.12E, X.10I, boolean, boolean, boolean, boolean):void");
    }

    public final void A01(C22821Di r5, boolean z) {
        A7K a7k = new A7K();
        C189819ju r1 = GraphQlCallInput.A02;
        Boolean valueOf = Boolean.valueOf(z);
        C162478Kx A002 = r1.A00();
        C162478Kx.A01(A002, valueOf, "contacts_backup_enabled");
        C108975cc.A0z(A002, a7k, "input");
        this.A05.A01(new AIj(a7k, ContactsBackupMutationResponseImpl.class, "ContactsBackupMutation")).A04(new AnonymousClass819(r5));
    }

    public C133956pm(C26811To r1, AnonymousClass1PY r2) {
        C18070vi.A0j(r2, r1);
        this.A05 = r2;
        this.A04 = r1;
    }
}
