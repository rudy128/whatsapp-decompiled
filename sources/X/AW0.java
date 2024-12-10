package X;

import android.text.TextUtils;
import com.whatsapp.jid.UserJid;
import java.util.ArrayList;
import java.util.List;

public class AW0 implements B5K {
    public static final int[] A0S = {702, 701};
    public static final int[] A0T = {101, 102, 103, 104};
    public static final int[] A0U = {11, 12, 608};
    public static final int[] A0V = {401, 402, 403, 404, 410, 411, 413, 601, 602, 603, 425};
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public long A05;
    public long A06;
    public AnonymousClass1KJ A07;
    public C22565BDa A08;
    @Deprecated
    public AnonymousClass1KN A09;
    public AnonymousClass8pG A0A;
    public AEX A0B;
    public AnonymousClass1BI A0C;
    public UserJid A0D;
    public UserJid A0E;
    public String A0F;
    public String A0G;
    public String A0H;
    public String A0I;
    public String A0J;
    public String A0K;
    public String A0L;
    public String A0M;
    public ArrayList A0N;
    public boolean A0O = true;
    public boolean A0P;
    public boolean A0Q;
    public byte[] A0R;

    public synchronized AnonymousClass1KJ A01() {
        return this.A07;
    }

    public synchronized C22565BDa A02() {
        C22565BDa bDa;
        AnonymousClass8pG r1 = this.A0A;
        if (r1 == null || !(r1 instanceof C170318pf)) {
            bDa = null;
        } else {
            bDa = ((C170318pf) r1).A06;
        }
        return bDa;
    }

    public synchronized C22565BDa A03() {
        C22565BDa bDa;
        AnonymousClass8pG r1 = this.A0A;
        if (r1 == null || !(r1 instanceof C170318pf)) {
            bDa = null;
        } else {
            bDa = ((C170318pf) r1).A07;
        }
        return bDa;
    }

    public synchronized AEX A04() {
        return this.A0B;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0026, code lost:
        return r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized java.lang.Boolean A05() {
        /*
            r3 = this;
            monitor-enter(r3)
            int r2 = r3.A03     // Catch:{ all -> 0x0027 }
            r1 = 1
            if (r2 == r1) goto L_0x0021
            r0 = 100
            if (r2 == r0) goto L_0x0021
            r0 = 20
            if (r2 == r0) goto L_0x0021
            r0 = 2
            if (r2 == r0) goto L_0x001c
            r0 = 200(0xc8, float:2.8E-43)
            if (r2 == r0) goto L_0x001c
            r0 = 10
            if (r2 == r0) goto L_0x001c
            monitor-exit(r3)
            r0 = 0
            return r0
        L_0x001c:
            java.lang.Boolean r0 = X.AnonymousClass000.A0h()     // Catch:{ all -> 0x0027 }
            goto L_0x0025
        L_0x0021:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)     // Catch:{ all -> 0x0027 }
        L_0x0025:
            monitor-exit(r3)
            return r0
        L_0x0027:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AW0.A05():java.lang.Boolean");
    }

    public synchronized void A06(long j, String str, int i, String str2, String str3) {
        synchronized (this) {
            this.A02 = i;
            if (j >= 0) {
                this.A06 = j;
                this.A0O = true;
                this.A0H = str;
                this.A0J = str2;
                this.A0F = str3;
            } else {
                throw AnonymousClass000.A0k(C17890vO.A0a("PAY: PaymentTransaction update called with invalid timestamp: ", AnonymousClass000.A10(), j));
            }
        }
    }

    public synchronized void A07(C20280AEo aEo, AnonymousClass8pG r3) {
        AnonymousClass8pG r0 = this.A0A;
        if (r0 == null) {
            this.A0A = r3;
            r0 = r3;
        }
        r0.A02 = aEo;
    }

    public synchronized void A08(AnonymousClass8pG r3, int i) {
        if (i > 0) {
            AnonymousClass8pG r1 = this.A0A;
            if (r1 == null) {
                this.A0A = r3;
                r1 = r3;
            }
            if (!(r1 instanceof C170308pe)) {
                if (r1 instanceof C170298pd) {
                    ((C170298pd) r1).A00 = i;
                } else if (r1 instanceof C170318pf) {
                    ((C170318pf) r1).A00 = i;
                }
            }
        }
    }

    public synchronized void A09(AnonymousClass8pG r4, long j) {
        if (j > 0) {
            AnonymousClass8pG r1 = this.A0A;
            if (r1 == null) {
                this.A0A = r4;
                r1 = r4;
            }
            if (r1 instanceof C170308pe) {
                ((C170308pe) r1).A00 = j;
            } else if (r1 instanceof C170298pd) {
                ((C170298pd) r1).A02 = j;
            } else if (r1 instanceof C170318pf) {
                ((C170318pf) r1).A04 = j;
            } else {
                ((C170288pc) r1).A00 = j;
            }
        }
    }

    public synchronized void A0A(AW0 aw0) {
        synchronized (this) {
            if (!TextUtils.isEmpty(aw0.A0K)) {
                A0C(aw0.A0K);
            }
            this.A05 = aw0.A05;
            this.A0E = aw0.A0E;
            this.A0D = aw0.A0D;
            this.A09 = aw0.A09;
            this.A0I = aw0.A0I;
            this.A03 = aw0.A03;
            this.A0G = aw0.A0G;
            this.A07 = aw0.A07;
            this.A04 = aw0.A04;
            this.A0R = aw0.A0R;
            this.A0L = aw0.A0L;
            this.A0Q = aw0.A0Q;
            this.A0C = aw0.A0C;
            this.A0M = aw0.A0M;
            this.A0A = aw0.A0A;
            this.A0B = aw0.A0B;
            A06(this.A06, this.A0H, this.A02, this.A0J, this.A0F);
        }
    }

    public synchronized void A0B(AEX aex) {
        this.A0B = aex;
    }

    public synchronized void A0C(String str) {
        C17960vV.A06(str);
        this.A0K = str;
        this.A0O = true;
    }

    public synchronized void A0D(List list) {
        if (list != null) {
            if (list.size() > 0) {
                this.A0N = C17880vN.A10(list);
            }
        }
    }

    public synchronized void A0E(boolean z) {
        this.A0O = z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0036, code lost:
        if (r1 != 200) goto L_0x0038;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0039, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0068, code lost:
        return true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized boolean A0F() {
        /*
            r7 = this;
            monitor-enter(r7)
            int r1 = r7.A03     // Catch:{ all -> 0x0069 }
            r6 = 0
            r5 = 1
            if (r1 == r5) goto L_0x0008
            goto L_0x0018
        L_0x0008:
            int[] r4 = A0V     // Catch:{ all -> 0x0069 }
            r3 = 11
            r2 = 0
        L_0x000d:
            r1 = r4[r2]     // Catch:{ all -> 0x0069 }
            int r0 = r7.A02     // Catch:{ all -> 0x0069 }
            if (r1 == r0) goto L_0x0038
            int r2 = r2 + 1
            if (r2 >= r3) goto L_0x0067
            goto L_0x000d
        L_0x0018:
            r0 = 2
            if (r1 == r0) goto L_0x0058
            r0 = 3
            if (r1 == r0) goto L_0x0067
            r0 = 6
            if (r1 == r0) goto L_0x0049
            r0 = 7
            if (r1 == r0) goto L_0x0058
            r0 = 8
            if (r1 == r0) goto L_0x003a
            r0 = 10
            if (r1 == r0) goto L_0x003a
            r0 = 20
            if (r1 == r0) goto L_0x003a
            r0 = 100
            if (r1 == r0) goto L_0x0008
            r0 = 200(0xc8, float:2.8E-43)
            if (r1 == r0) goto L_0x0058
        L_0x0038:
            monitor-exit(r7)
            return r6
        L_0x003a:
            int[] r4 = A0U     // Catch:{ all -> 0x0069 }
            r3 = 3
            r2 = 0
        L_0x003e:
            r1 = r4[r2]     // Catch:{ all -> 0x0069 }
            int r0 = r7.A02     // Catch:{ all -> 0x0069 }
            if (r1 == r0) goto L_0x0038
            int r2 = r2 + 1
            if (r2 >= r3) goto L_0x0067
            goto L_0x003e
        L_0x0049:
            int[] r4 = A0S     // Catch:{ all -> 0x0069 }
            r3 = 2
            r2 = 0
        L_0x004d:
            r1 = r4[r2]     // Catch:{ all -> 0x0069 }
            int r0 = r7.A02     // Catch:{ all -> 0x0069 }
            if (r1 == r0) goto L_0x0038
            int r2 = r2 + 1
            if (r2 >= r3) goto L_0x0067
            goto L_0x004d
        L_0x0058:
            int[] r4 = A0T     // Catch:{ all -> 0x0069 }
            r3 = 4
            r2 = 0
        L_0x005c:
            r1 = r4[r2]     // Catch:{ all -> 0x0069 }
            int r0 = r7.A02     // Catch:{ all -> 0x0069 }
            if (r1 == r0) goto L_0x0038
            int r2 = r2 + 1
            if (r2 >= r3) goto L_0x0067
            goto L_0x005c
        L_0x0067:
            monitor-exit(r7)
            return r5
        L_0x0069:
            r0 = move-exception
            monitor-exit(r7)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AW0.A0F():boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000a, code lost:
        if (r1 == false) goto L_0x000c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized boolean A0H() {
        /*
            r2 = this;
            monitor-enter(r2)
            X.8pG r0 = r2.A0A     // Catch:{ all -> 0x000f }
            if (r0 == 0) goto L_0x000c
            boolean r1 = r0.A0X()     // Catch:{ all -> 0x000f }
            r0 = 1
            if (r1 != 0) goto L_0x000d
        L_0x000c:
            r0 = 0
        L_0x000d:
            monitor-exit(r2)
            return r0
        L_0x000f:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AW0.A0H():boolean");
    }

    public synchronized boolean A0I() {
        boolean z;
        int i;
        if (this.A03 == 10 && ((i = this.A02) == 12 || i == 19)) {
            z = true;
        } else {
            z = false;
        }
        return z;
    }

    public synchronized boolean A0J() {
        boolean z;
        int i;
        if (!A0K() || !((i = this.A02) == 12 || i == 19 || i == 20)) {
            z = false;
        } else {
            z = true;
        }
        return z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0014, code lost:
        if (r2 == 30) goto L_0x0016;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized boolean A0K() {
        /*
            r3 = this;
            monitor-enter(r3)
            int r2 = r3.A03     // Catch:{ all -> 0x0019 }
            X.A8n r0 = X.C20128A8n.$redex_init_class     // Catch:{ all -> 0x0019 }
            r0 = 20
            if (r2 == r0) goto L_0x0016
            r0 = 40
            if (r2 == r0) goto L_0x0016
            r0 = 10
            if (r2 == r0) goto L_0x0016
            r1 = 30
            r0 = 0
            if (r2 != r1) goto L_0x0017
        L_0x0016:
            r0 = 1
        L_0x0017:
            monitor-exit(r3)
            return r0
        L_0x0019:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AW0.A0K():boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0018, code lost:
        if (r3.A03 == 30) goto L_0x001a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized boolean A0L() {
        /*
            r3 = this;
            monitor-enter(r3)
            int r1 = r3.A02     // Catch:{ all -> 0x001d }
            r0 = 106(0x6a, float:1.49E-43)
            if (r1 == r0) goto L_0x001a
            r0 = 405(0x195, float:5.68E-43)
            if (r1 == r0) goto L_0x001a
            r0 = 604(0x25c, float:8.46E-43)
            if (r1 == r0) goto L_0x001a
            r0 = 703(0x2bf, float:9.85E-43)
            if (r1 == r0) goto L_0x001a
            int r2 = r3.A03     // Catch:{ all -> 0x001d }
            r1 = 30
            r0 = 0
            if (r2 != r1) goto L_0x001b
        L_0x001a:
            r0 = 1
        L_0x001b:
            monitor-exit(r3)
            return r0
        L_0x001d:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AW0.A0L():boolean");
    }

    public synchronized boolean A0M() {
        return C20128A8n.A09(this.A0G, this.A04);
    }

    public synchronized boolean A0N() {
        boolean z;
        AnonymousClass8pG r2;
        String str;
        if (!(this.A09 == null || (r2 = this.A0A) == null)) {
            if (r2 instanceof C170318pf) {
                C170318pf r22 = (C170318pf) r2;
                if (!r22.A0a) {
                    String str2 = r22.A0T;
                    if (!(str2 == null || str2.length() == 0 || (str = r22.A0R) == null)) {
                        if (str.length() == 0) {
                        }
                    }
                }
                if (!"FULL".equals(r22.A0W) && A0F()) {
                    String str3 = this.A0F;
                    if (str3 != null) {
                        if (str3.length() == 0) {
                        }
                    }
                }
            }
            z = false;
        }
        z = true;
        return z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:49:0x007e, code lost:
        if ((!X.C42171xk.A00(r11.A0H, r15.A0H)) == false) goto L_0x0080;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0082, code lost:
        if (r7 != r8) goto L_0x0088;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0086, code lost:
        if (r0 > r2) goto L_0x0088;
     */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x002d  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0030  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0070  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized boolean A0O(X.AnonymousClass8pG r15, int r16, long r17) {
        /*
            r14 = this;
            monitor-enter(r14)
            long r4 = r14.A06     // Catch:{ all -> 0x008b }
            X.8pG r11 = r14.A0A     // Catch:{ all -> 0x008b }
            r13 = 0
            if (r11 == 0) goto L_0x000d
            int r10 = r11.A08()     // Catch:{ all -> 0x008b }
            goto L_0x000e
        L_0x000d:
            r10 = 0
        L_0x000e:
            if (r15 == 0) goto L_0x0015
            int r9 = r15.A08()     // Catch:{ all -> 0x008b }
            goto L_0x0016
        L_0x0015:
            r9 = 0
        L_0x0016:
            r8 = 0
            if (r15 == 0) goto L_0x0027
            boolean r0 = r15 instanceof X.C170318pf     // Catch:{ all -> 0x008b }
            if (r0 == 0) goto L_0x0027
            r0 = r15
            X.8pf r0 = (X.C170318pf) r0     // Catch:{ all -> 0x008b }
            X.ADS r0 = r0.A0I     // Catch:{ all -> 0x008b }
            if (r0 == 0) goto L_0x0028
            java.lang.String r7 = r0.A02     // Catch:{ all -> 0x008b }
            goto L_0x0029
        L_0x0027:
            r0 = r8
        L_0x0028:
            r7 = r8
        L_0x0029:
            r2 = 0
            if (r0 == 0) goto L_0x0030
            long r0 = r0.A01     // Catch:{ all -> 0x008b }
            goto L_0x0032
        L_0x0030:
            r0 = 0
        L_0x0032:
            if (r11 == 0) goto L_0x0043
            boolean r6 = r11 instanceof X.C170318pf     // Catch:{ all -> 0x008b }
            if (r6 == 0) goto L_0x0043
            r6 = r11
            X.8pf r6 = (X.C170318pf) r6     // Catch:{ all -> 0x008b }
            X.ADS r6 = r6.A0I     // Catch:{ all -> 0x008b }
            if (r6 == 0) goto L_0x0043
            java.lang.String r8 = r6.A02     // Catch:{ all -> 0x008b }
            long r2 = r6.A01     // Catch:{ all -> 0x008b }
        L_0x0043:
            int r6 = r14.A03     // Catch:{ all -> 0x008b }
            r12 = 5
            if (r6 == r12) goto L_0x004c
            r12 = 1000(0x3e8, float:1.401E-42)
            if (r6 != r12) goto L_0x0050
        L_0x004c:
            r12 = r16
            if (r6 != r12) goto L_0x0088
        L_0x0050:
            int r6 = (r17 > r4 ? 1 : (r17 == r4 ? 0 : -1))
            if (r6 > 0) goto L_0x0088
            int r6 = (r17 > r4 ? 1 : (r17 == r4 ? 0 : -1))
            if (r6 != 0) goto L_0x005e
            if (r9 != 0) goto L_0x005c
            if (r10 == 0) goto L_0x0088
        L_0x005c:
            if (r9 > r10) goto L_0x0088
        L_0x005e:
            if (r11 == 0) goto L_0x0080
            boolean r4 = r11 instanceof X.C170318pf     // Catch:{ all -> 0x008b }
            if (r4 == 0) goto L_0x0080
            X.8pf r11 = (X.C170318pf) r11     // Catch:{ all -> 0x008b }
            java.lang.String r5 = "MISSING_FIELD_NOT_PARTIAL"
            java.lang.String r4 = r11.A0W     // Catch:{ all -> 0x008b }
            boolean r4 = r5.equals(r4)     // Catch:{ all -> 0x008b }
            if (r4 != 0) goto L_0x0088
            X.8pf r15 = (X.C170318pf) r15     // Catch:{ all -> 0x008b }
            if (r15 == 0) goto L_0x0080
            X.9ue r5 = r11.A0H     // Catch:{ all -> 0x008b }
            X.9ue r4 = r15.A0H     // Catch:{ all -> 0x008b }
            boolean r4 = X.C42171xk.A00(r5, r4)     // Catch:{ all -> 0x008b }
            r4 = r4 ^ 1
            if (r4 != 0) goto L_0x0088
        L_0x0080:
            if (r7 == 0) goto L_0x0084
            if (r7 != r8) goto L_0x0088
        L_0x0084:
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto L_0x0089
        L_0x0088:
            r13 = 1
        L_0x0089:
            monitor-exit(r14)
            return r13
        L_0x008b:
            r0 = move-exception
            monitor-exit(r14)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AW0.A0O(X.8pG, int, long):boolean");
    }

    public synchronized boolean A0P(AW0 aw0) {
        return A0O(aw0.A0A, aw0.A03, aw0.A06);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0016, code lost:
        if (r3.equals(r2.A0D) != false) goto L_0x0018;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized boolean A0Q(com.whatsapp.jid.UserJid r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            if (r3 == 0) goto L_0x0018
            com.whatsapp.jid.UserJid r0 = r2.A0E     // Catch:{ all -> 0x0012 }
            boolean r0 = r3.equals(r0)     // Catch:{ all -> 0x0012 }
            if (r0 != 0) goto L_0x0018
            com.whatsapp.jid.UserJid r0 = r2.A0D     // Catch:{ all -> 0x0012 }
            boolean r1 = r3.equals(r0)     // Catch:{ all -> 0x0012 }
            goto L_0x0015
        L_0x0012:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        L_0x0015:
            r0 = 0
            if (r1 == 0) goto L_0x0019
        L_0x0018:
            r0 = 1
        L_0x0019:
            monitor-exit(r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AW0.A0Q(com.whatsapp.jid.UserJid):boolean");
    }

    public synchronized String toString() {
        StringBuilder A10;
        A10 = AnonymousClass000.A10();
        A10.append("id: ");
        A10.append(this.A0K);
        A10.append(" key_remote_id: ");
        A10.append(this.A0C);
        A10.append(" key_from_me: ");
        A10.append(this.A0Q);
        A10.append(" key_id: ");
        A10.append(this.A0L);
        A10.append(" status: ");
        A10.append(this.A02);
        A10.append(" type: ");
        A10.append(this.A03);
        A10.append(" updateTs: ");
        A10.append(this.A06);
        A10.append(" initTs: ");
        A10.append(this.A05);
        A10.append(" error_code: ");
        A10.append(this.A0J);
        A10.append(" sender: ");
        A10.append(this.A0E);
        A10.append(" receiver: ");
        A10.append(this.A0D);
        A10.append(" credential_id: ");
        A10.append(this.A0H);
        A10.append(" methods: ");
        A10.append(this.A0N);
        A10.append(" reqMsgKeyId: ");
        A10.append(this.A0M);
        A10.append(" metadata: ");
        A10.append(this.A0A);
        A10.append(" country: ");
        A10.append(this.A0G);
        A10.append(" version: ");
        A10.append(this.A04);
        A10.append(" interop: ");
        A10.append(this.A0P);
        A10.append(" background: ");
        A10.append(this.A0B);
        A10.append(" purchase_initiator: ");
        return C17880vN.A0t(A10, this.A00);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x004b, code lost:
        if (r2 == 40) goto L_0x004d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AW0(X.AnonymousClass1KJ r12, X.AnonymousClass1KN r13, com.whatsapp.jid.UserJid r14, com.whatsapp.jid.UserJid r15, java.lang.String r16, java.lang.String r17, java.lang.String r18, java.lang.String r19, java.lang.String r20, java.lang.String r21, java.lang.String r22, int r23, int r24, int r25, int r26, int r27, long r28, long r30) {
        /*
            r11 = this;
            r3 = r17
            r4 = r11
            r11.<init>()
            r0 = 1
            r11.A0O = r0
            r2 = r23
            if (r23 != 0) goto L_0x000e
            r0 = 0
        L_0x000e:
            X.C17960vV.A0D(r0)
            r11.A03 = r2
            r11.A0E = r14
            r11.A0D = r15
            r0 = r16
            r11.A0I = r0
            r11.A09 = r13
            r0 = r28
            r11.A05 = r0
            r0 = r22
            r11.A0G = r0
            r0 = r25
            r11.A04 = r0
            r0 = r26
            r11.A01 = r0
            r11.A07 = r12
            r0 = r27
            r11.A00 = r0
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 == 0) goto L_0x004d
            r3 = r21
            boolean r0 = android.text.TextUtils.isEmpty(r21)
            if (r0 != 0) goto L_0x0050
            r0 = 10
            if (r2 == r0) goto L_0x004d
            r0 = 20
            if (r2 == r0) goto L_0x004d
            r0 = 40
            if (r2 != r0) goto L_0x0050
        L_0x004d:
            r11.A0C(r3)
        L_0x0050:
            r7 = r18
            r9 = r19
            r10 = r20
            r8 = r24
            r5 = r30
            r4.A06(r5, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AW0.<init>(X.1KJ, X.1KN, com.whatsapp.jid.UserJid, com.whatsapp.jid.UserJid, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, int, int, int, int, long, long):void");
    }

    public static boolean A00(AW0 aw0) {
        if (aw0 == null) {
            return false;
        }
        int i = aw0.A02;
        if (i == 405 || i == 106 || i == 604) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002c, code lost:
        return false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized boolean A0G() {
        /*
            r4 = this;
            r3 = 10
            monitor-enter(r4)
            java.util.ArrayList r0 = r4.A0N     // Catch:{ all -> 0x002d }
            boolean r0 = X.C137476vW.A00(r0)     // Catch:{ all -> 0x002d }
            r2 = 0
            if (r0 != 0) goto L_0x002b
            java.util.ArrayList r0 = r4.A0N     // Catch:{ all -> 0x002d }
            java.util.Iterator r1 = r0.iterator()     // Catch:{ all -> 0x002d }
        L_0x0012:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x002d }
            if (r0 == 0) goto L_0x002b
            java.lang.Object r0 = r1.next()     // Catch:{ all -> 0x002d }
            X.9dI r0 = (X.C185879dI) r0     // Catch:{ all -> 0x002d }
            X.AEs r0 = r0.A01     // Catch:{ all -> 0x002d }
            if (r0 == 0) goto L_0x0012
            int r0 = r0.A05()     // Catch:{ all -> 0x002d }
            if (r3 != r0) goto L_0x0012
            monitor-exit(r4)
            r0 = 1
            return r0
        L_0x002b:
            monitor-exit(r4)
            return r2
        L_0x002d:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AW0.A0G():boolean");
    }

    public AW0(String str, int i, int i2, int i3, long j) {
        this.A03 = i;
        this.A05 = j;
        this.A0G = str;
        this.A04 = i2;
        this.A01 = i3;
        this.A0I = "XXX";
        this.A07 = AnonymousClass1KL.A0C;
    }
}
