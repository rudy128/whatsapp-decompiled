package X;

import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;

/* renamed from: X.4Zu  reason: invalid class name and case insensitive filesystem */
public final class C88464Zu {
    public final C108895cT A00;
    public final AnonymousClass1PM A01;
    public final C24921Me A02;
    public final AnonymousClass1DC A03;
    public final C18100vl A04 = AnonymousClass1DF.A01(new AnonymousClass5DL(this));
    public final C18100vl A05 = AnonymousClass1DF.A01(new AnonymousClass5DM(this));
    public final C18100vl A06 = AnonymousClass1DF.A01(new AnonymousClass5DN(this));
    public final C18100vl A07 = AnonymousClass1DF.A01(new AnonymousClass5DO(this));
    public final C18100vl A08 = AnonymousClass1DF.A01(new AnonymousClass5DP(this));
    public final C18100vl A09 = AnonymousClass1DF.A01(new AnonymousClass5DQ(this));
    public final C18100vl A0A = AnonymousClass1DF.A01(new AnonymousClass5DR(this));
    public final C18030ve A0B;

    public static final AnonymousClass5X1 A01(C87624Wh r11, C88464Zu r12) {
        Integer num;
        AnonymousClass5X1 r4;
        String A0X;
        C86534Sa r42 = r11.A00;
        if (r42.A0P) {
            num = AnonymousClass00R.A0C;
        } else if (r42.A0K) {
            num = AnonymousClass00R.A0N;
        } else {
            num = AnonymousClass00R.A00;
        }
        int intValue = num.intValue();
        if (intValue == 2) {
            r4 = new C93474j2(new C93464j1((AnonymousClass4ZN) null, (AnonymousClass4DG) null, (C27881Xz) null, 0, 0, 0, 0, 0, false, true), AnonymousClass3MX.A0t(2131898282), C18460wS.A00, 0);
        } else if (intValue != 3) {
            r4 = C93484j3.A00;
        } else {
            Object[] objArr = new Object[1];
            UserJid userJid = r42.A0A;
            if (userJid == null) {
                Log.i("InCallControlUseCase/getDisplayName/null peer jid");
                A0X = null;
            } else {
                A0X = r12.A02.A0X(userJid);
                if (A0X == null) {
                    Log.i("InCallControlUseCase/getDisplayName/null display name");
                }
            }
            objArr[0] = A0X;
            r4 = new C93474j2(C93454j0.A00, C1402670q.A02(objArr, 2131898281), C18460wS.A00, 4);
        }
        return r4;
    }

    public static final int A00(C87624Wh r2) {
        Integer num;
        C86534Sa r22 = r2.A00;
        if (r22.A0P) {
            num = AnonymousClass00R.A0C;
        } else if (r22.A0K) {
            num = AnonymousClass00R.A0N;
        } else {
            num = AnonymousClass00R.A00;
        }
        if (num == AnonymousClass00R.A01) {
            return 2131231174;
        }
        if ((r22.A0Q || !r22.A0L) && !r22.A0G) {
            return 2131231174;
        }
        return 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0023, code lost:
        if (r0.A0W == true) goto L_0x0025;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean A02(X.C87624Wh r4, X.C88464Zu r5) {
        /*
            X.4Y6 r3 = r4.A01
            java.lang.String r1 = r3.A01
            java.lang.String r0 = "capi"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0025
            X.4Sa r2 = r4.A00
            boolean r0 = r2.A0L
            if (r0 != 0) goto L_0x002e
            X.1PM r1 = r5.A01
            com.whatsapp.jid.UserJid r0 = r2.A0A
            boolean r0 = r1.A04(r0)
            if (r0 == 0) goto L_0x002e
            X.AEW r0 = r3.A00
            if (r0 == 0) goto L_0x002e
            boolean r1 = r0.A0W
            r0 = 1
            if (r1 != r0) goto L_0x002e
        L_0x0025:
            X.0ve r0 = r5.A0B
            boolean r1 = X.C40811vJ.A0S(r0)
            r0 = 1
            if (r1 != 0) goto L_0x002f
        L_0x002e:
            r0 = 0
        L_0x002f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C88464Zu.A02(X.4Wh, X.4Zu):boolean");
    }

    public C88464Zu(C108895cT r2, AnonymousClass1PM r3, C24921Me r4, C18030ve r5, AnonymousClass1DC r6) {
        C18070vi.A0w(r5, r6, r4, r3, r2);
        this.A0B = r5;
        this.A03 = r6;
        this.A02 = r4;
        this.A01 = r3;
        this.A00 = r2;
    }
}
