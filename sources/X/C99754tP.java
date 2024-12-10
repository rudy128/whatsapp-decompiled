package X;

import java.util.TimerTask;

/* renamed from: X.4tP  reason: invalid class name and case insensitive filesystem */
public class C99754tP extends TimerTask {
    public C87584Wd A00;

    public void run() {
        AnonymousClass126 r2;
        int i;
        C87584Wd r3 = this.A00;
        if (r3 instanceof C75023dM) {
            C75023dM r32 = (C75023dM) r3;
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("groupmgr/group_request/timeout/type:");
            C17900vP.A0o(A10, r32.A00);
            r32.A00 = true;
            r32.A02.A03(r32.A01, false);
            return;
        }
        C75033dN r33 = (C75033dN) r3;
        StringBuilder A102 = AnonymousClass000.A10();
        A102.append("groupmgr/group_request/timeout/type:");
        int i2 = r33.A00;
        C17900vP.A0o(A102, i2);
        r33.A00 = true;
        if (i2 != 30) {
            if (i2 == 91) {
                r2 = r33.A02;
                i = 1005;
            } else if (i2 != 92) {
                switch (i2) {
                    case 15:
                        r2 = r33.A02;
                        i = 1002;
                        break;
                    case 16:
                        r2 = r33.A02;
                        i = 1001;
                        break;
                    case 17:
                        r2 = r33.A02;
                        i = 1007;
                        break;
                }
            } else {
                r2 = r33.A02;
                i = 1006;
            }
            r2.A0O(i, r33.A03);
        } else {
            r2 = r33.A02;
            i = 1003;
            r2.A0O(i, r33.A03);
        }
        r33.A01.A03(r33.A03, false);
        r33.A00((Integer) null);
    }

    public C99754tP(C87584Wd r1) {
        this.A00 = r1;
    }
}
