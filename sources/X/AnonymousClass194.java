package X;

import android.content.SharedPreferences;
import com.whatsapp.Me;
import com.whatsapp.util.Log;
import java.util.Date;

/* renamed from: X.194  reason: invalid class name */
public final class AnonymousClass194 {
    public Date A00;
    public boolean A01;
    public final C19830z4 A02;
    public final AnonymousClass11S A03;

    public AnonymousClass194(AnonymousClass11S r2, C19830z4 r3) {
        C18070vi.A0d(r2, 1);
        C18070vi.A0d(r3, 2);
        this.A03 = r2;
        this.A02 = r3;
    }

    public final Date A00() {
        String str;
        Long A04;
        AnonymousClass00H r3 = this.A02.A00;
        long j = ((SharedPreferences) r3.get()).getLong("software_forced_expiration", 0);
        long j2 = 0;
        if (j <= 0) {
            j = ((SharedPreferences) r3.get()).getLong("client_expiration_time", 0);
            if (j <= 0) {
                AnonymousClass11S r0 = this.A03;
                r0.A0I();
                Me me = r0.A00;
                String str2 = null;
                if (me == null || (str = me.number) == null || (A04 = AnonymousClass1YD.A04(str)) == null) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("number format not valid: ");
                    if (me != null) {
                        str2 = me.number;
                    }
                    sb.append(str2);
                    Log.w(sb.toString());
                } else {
                    long longValue = A04.longValue() % 14;
                    if (longValue >= 0 && longValue <= 13) {
                        j2 = longValue - 6;
                    }
                }
                C18070vi.A0Z(C000700k.A00);
                return new Date(1733338680000L + ((90 + j2) * 86400000));
            }
        }
        return new Date(j);
    }

    public final boolean A01() {
        if (this.A01) {
            return true;
        }
        boolean after = new Date().after(A00());
        this.A01 = after;
        return after;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x001a, code lost:
        r3 = r4.after(new java.util.Date(A00().getTime() + 31536000000L));
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A02() {
        /*
            r5 = this;
            java.util.Date r0 = r5.A00
            r3 = 1
            if (r0 != 0) goto L_0x0035
            java.util.Date r4 = new java.util.Date
            r4.<init>()
            r1 = 1733165880000(0x19388bc92c0, double:8.56297719852E-312)
            java.util.Date r0 = new java.util.Date
            r0.<init>(r1)
            boolean r0 = r4.before(r0)
            if (r0 != 0) goto L_0x0033
            java.util.Date r0 = r5.A00()
            long r2 = r0.getTime()
            r0 = 31536000000(0x757b12c00, double:1.55808542072E-313)
            long r2 = r2 + r0
            java.util.Date r0 = new java.util.Date
            r0.<init>(r2)
            boolean r3 = r4.after(r0)
            if (r3 == 0) goto L_0x0035
        L_0x0033:
            r5.A00 = r4
        L_0x0035:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass194.A02():boolean");
    }
}
