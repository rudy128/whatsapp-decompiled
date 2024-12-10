package X;

import android.content.SharedPreferences;
import com.whatsapp.jid.UserJid;

/* renamed from: X.1PS  reason: invalid class name */
public final class AnonymousClass1PS {
    public final AnonymousClass1DT A00 = new AnonymousClass1DS();
    public final AnonymousClass11S A01;
    public final AnonymousClass1M9 A02;
    public final AnonymousClass1PR A03;
    public final AnonymousClass1PM A04;
    public final C25491Ok A05;
    public final AnonymousClass11P A06;
    public final AnonymousClass1PQ A07;

    /* JADX WARNING: type inference failed for: r0v7, types: [X.1DT, X.1DS] */
    public AnonymousClass1PS(AnonymousClass11S r2, AnonymousClass1M9 r3, AnonymousClass1PM r4, C25491Ok r5, AnonymousClass11P r6, AnonymousClass1PR r7, AnonymousClass1PQ r8) {
        C18070vi.A0d(r6, 1);
        C18070vi.A0d(r2, 2);
        C18070vi.A0d(r3, 3);
        C18070vi.A0d(r5, 4);
        C18070vi.A0d(r4, 5);
        C18070vi.A0d(r8, 6);
        C18070vi.A0d(r7, 7);
        this.A06 = r6;
        this.A01 = r2;
        this.A02 = r3;
        this.A05 = r5;
        this.A04 = r4;
        this.A07 = r8;
        this.A03 = r7;
    }

    public final int A01(UserJid userJid) {
        AnonymousClass1E7 A0E;
        C18070vi.A0d(userJid, 0);
        if (this.A01.A0O(userJid)) {
            return A00();
        }
        if (this.A04.A04(userJid) || (A0E = this.A02.A0E(userJid)) == null) {
            return 0;
        }
        return A0E.A02;
    }

    /* JADX WARNING: type inference failed for: r8v1, types: [X.2M9, X.20i, X.206] */
    public final AnonymousClass2M9 A04(AnonymousClass1BI r11) {
        C18070vi.A0d(r11, 0);
        UserJid A032 = A03(r11);
        if (A032 == null) {
            return null;
        }
        boolean A0O = this.A01.A0O(A032);
        int i = 2;
        if (A0O) {
            i = 1;
        }
        AnonymousClass1PQ r1 = this.A07;
        C22941Dw r0 = UserJid.Companion;
        UserJid A012 = C22941Dw.A01(r11);
        C17960vV.A07(A012);
        long A013 = AnonymousClass11P.A01(this.A06);
        int A014 = A01(A032);
        long A022 = A02(A032);
        Boolean valueOf = Boolean.valueOf(A0O);
        ? r8 = new C436420i(r1.A02.A01(A012, true), 68, A013);
        r8.A00 = A014;
        r8.A0h(Long.valueOf(A022));
        r8.A00 = i;
        r8.A04 = 2;
        if (valueOf == null) {
            return r8;
        }
        r8.A0Q = valueOf;
        return r8;
    }

    public final int A00() {
        Number number = (Number) this.A00.A06();
        if (number != null) {
            return number.intValue();
        }
        Object value = this.A03.A01.getValue();
        C18070vi.A0X(value);
        return ((SharedPreferences) value).getInt("disappearing_mode_duration_int", 0);
    }

    public final long A02(UserJid userJid) {
        if (this.A01.A0O(userJid)) {
            Object value = this.A03.A01.getValue();
            C18070vi.A0X(value);
            return ((SharedPreferences) value).getLong("disappearing_mode_timestamp", 0);
        }
        AnonymousClass1E7 A0E = this.A02.A0E(userJid);
        if (A0E != null) {
            return A0E.A0B;
        }
        return 0;
    }

    public final void A05(int i, long j) {
        C18100vl r2 = this.A03.A01;
        Object value = r2.getValue();
        C18070vi.A0X(value);
        ((SharedPreferences) value).edit().putInt("disappearing_mode_duration_int", i).apply();
        Object value2 = r2.getValue();
        C18070vi.A0X(value2);
        ((SharedPreferences) value2).edit().putLong("disappearing_mode_timestamp", j).apply();
        this.A00.A0E(Integer.valueOf(i));
    }

    public final boolean A06() {
        Object value = this.A03.A01.getValue();
        C18070vi.A0X(value);
        if (((SharedPreferences) value).getInt("disappearing_mode_duration_int", 0) != 0) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x004b, code lost:
        if (r1 <= r0) goto L_0x004d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.whatsapp.jid.UserJid A03(X.AnonymousClass1BI r6) {
        /*
            r5 = this;
            boolean r0 = X.C22971Dz.A0d(r6)
            r4 = 0
            if (r0 == 0) goto L_0x0022
            boolean r0 = X.C42701yb.A01(r6)
            if (r0 != 0) goto L_0x0022
            X.1PM r0 = r5.A04
            r3 = r6
            com.whatsapp.jid.UserJid r3 = (com.whatsapp.jid.UserJid) r3
            boolean r0 = r0.A04(r3)
            if (r0 != 0) goto L_0x0022
            X.1Ok r0 = r5.A05
            if (r3 == 0) goto L_0x0023
            boolean r0 = r0.A00(r3)
            if (r0 == 0) goto L_0x0023
        L_0x0022:
            return r4
        L_0x0023:
            boolean r0 = X.C22971Dz.A0S(r6)
            if (r0 != 0) goto L_0x0022
            boolean r0 = r5.A06()
            java.lang.String r1 = "Required value was null."
            if (r0 == 0) goto L_0x0057
            if (r6 == 0) goto L_0x0073
            X.1M9 r2 = r5.A02
            X.1E7 r0 = r2.A0E(r3)
            if (r0 == 0) goto L_0x004d
            int r0 = r0.A02
            if (r0 == 0) goto L_0x004d
            int r1 = r5.A00()
            X.1E7 r0 = r2.A0E(r3)
            if (r0 == 0) goto L_0x0055
            int r0 = r0.A02
        L_0x004b:
            if (r1 > r0) goto L_0x005f
        L_0x004d:
            X.11S r0 = r5.A01
            r0.A0I()
            com.whatsapp.jid.PhoneUserJid r4 = r0.A0E
            return r4
        L_0x0055:
            r0 = 0
            goto L_0x004b
        L_0x0057:
            if (r6 != 0) goto L_0x005f
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        L_0x005f:
            X.11S r0 = r5.A01
            boolean r0 = r0.A0O(r3)
            if (r0 == 0) goto L_0x006e
            boolean r0 = r5.A06()
        L_0x006b:
            if (r0 == 0) goto L_0x0022
            return r3
        L_0x006e:
            int r0 = r5.A01(r3)
            goto L_0x006b
        L_0x0073:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1PS.A03(X.1BI):com.whatsapp.jid.UserJid");
    }
}
