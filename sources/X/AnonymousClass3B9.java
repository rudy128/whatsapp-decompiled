package X;

import java.util.concurrent.TimeUnit;

/* renamed from: X.3B9  reason: invalid class name */
public final class AnonymousClass3B9 implements C22486B9s {
    public final AnonymousClass11N A00;
    public final C19830z4 A01;
    public final C18030ve A02;

    public boolean BCL(C186309dz r9, C22484B9q b9q, AnonymousClass5YR r11) {
        TimeUnit timeUnit;
        long parseLong;
        C18070vi.A0d(r9, 1);
        String A0s = C17880vN.A0s("param", r9.A01);
        if (A0s == null) {
            timeUnit = TimeUnit.MINUTES;
            parseLong = (long) C18020vd.A00(C18040vf.A02, this.A02, 4214);
        } else {
            timeUnit = TimeUnit.SECONDS;
            parseLong = Long.parseLong(A0s);
        }
        long millis = timeUnit.toMillis(parseLong);
        C19830z4 r1 = this.A01;
        int A0N = r1.A0N("privacy_groupadd");
        long A0W = r1.A0W("privacy_tip_exit_group_timestamp");
        if (((int) A0W) == -1) {
            return false;
        }
        long j = A0W + millis;
        if (A0N != 0 || System.currentTimeMillis() >= j) {
            return false;
        }
        return true;
    }

    public AnonymousClass3B9(AnonymousClass11N r1, C19830z4 r2, C18030ve r3) {
        C18070vi.A0o(r2, r3, r1);
        this.A01 = r2;
        this.A02 = r3;
        this.A00 = r1;
    }
}
