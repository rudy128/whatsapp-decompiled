package X;

import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.1TG  reason: invalid class name */
public class AnonymousClass1TG {
    public final AnonymousClass190 A00;
    public final C218617r A01;
    public final AnonymousClass11P A02;
    public final AnonymousClass118 A03;
    public final AnonymousClass1LW A04;
    public final AnonymousClass121 A05;
    public final AnonymousClass1Q2 A06;
    public final AnonymousClass1DL A07;
    public final AnonymousClass1ST A08;
    public final C25301Nr A09;
    public final C24681Lg A0A;
    public final C22611Cn A0B;
    public final AnonymousClass1Cd A0C;
    public final C24621La A0D;
    public final C24631Lb A0E;
    public final C24661Le A0F;
    public final C26061Qr A0G;
    public final C18010vc A0H;
    public final AtomicBoolean A0I = new AtomicBoolean(false);
    public final C18030ve A0J;
    public final AnonymousClass1TF A0K;
    public final AnonymousClass00H A0L;
    public final AnonymousClass00H A0M;
    public final AnonymousClass00H A0N;
    public final AnonymousClass00H A0O;

    public void A05() {
        ArrayList A042 = A04((UserJid) null, -1);
        HashMap hashMap = new HashMap();
        Iterator it = A042.iterator();
        while (it.hasNext()) {
            AnonymousClass206 r2 = (AnonymousClass206) it.next();
            UserJid A0I2 = r2.A0I();
            if (A0I2 != null) {
                List list = (List) hashMap.get(A0I2);
                if (list == null) {
                    list = new ArrayList();
                }
                list.add(r2);
                hashMap.put(A0I2, list);
            }
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            UserJid userJid = (UserJid) entry.getKey();
            List list2 = (List) entry.getValue();
            C24661Le r3 = this.A0F;
            C63372sx A082 = r3.A08(userJid);
            if (A082 == null) {
                if (!list2.isEmpty()) {
                    A082 = new C63372sx(this.A02, userJid);
                }
            } else if (list2.size() == A082.A00()) {
            }
            C63372sx A002 = A00(A082, this, list2);
            if (A002 != null) {
                Log.e("StatusMessageStore/regenerateOutOfSyncStatusInfoObjects/newStatusInfoGenerated");
                r3.A0D(A002, userJid);
            }
        }
    }

    public static C63372sx A00(C63372sx r9, AnonymousClass1TG r10, List list) {
        long j;
        C63372sx r4 = new C63372sx(r10.A02, r9);
        synchronized (r4) {
            r4.A03 = Long.MIN_VALUE;
        }
        r4.A07 = null;
        r4.A0A(Long.MIN_VALUE);
        r4.A09(0);
        synchronized (r4) {
            r4.A01 = 0;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AnonymousClass206 r7 = (AnonymousClass206) it.next();
            long j2 = r7.A0y;
            synchronized (r4) {
                r4.A04 = j2;
            }
            r4.A0C(r7);
            r4.A0B(r7.A0I);
            synchronized (r4) {
                r4.A00++;
            }
            if (r4.A0A != AnonymousClass1E5.A00) {
                if (r7.A0y <= r9.A05()) {
                    long j3 = r7.A0y;
                    synchronized (r4) {
                        r4.A05 = j3;
                    }
                } else {
                    synchronized (r4) {
                        r4.A01++;
                    }
                    if (r4.A01() == 1) {
                        long j4 = r7.A0y;
                        synchronized (r4) {
                            r4.A03 = j4;
                        }
                        r4.A07 = r7;
                    }
                    if (r4.A01() <= 2) {
                        r4.A0A(r7.A0y);
                    }
                }
                long j5 = r7.A0y;
                synchronized (r9) {
                    j = r9.A06;
                }
                if (j5 <= j) {
                    long j6 = r7.A0y;
                    synchronized (r4) {
                        r4.A06 = j6;
                    }
                } else {
                    continue;
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append("StatusMessageStore/regenerateStatusInfoAndUpdateStatusStore/ old: ");
        sb.append(r9);
        sb.append(" new:");
        sb.append(r4);
        Log.i(sb.toString());
        if (r4.A00() != 0) {
            return r4;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("StatusMessageStore/regenerateStatusInfo newStatusInfo has totalCount 0: ");
        sb2.append(r4);
        Log.i(sb2.toString());
        return null;
    }

    public int A01(UserJid userJid) {
        UserJid userJid2 = userJid;
        if (userJid2 == AnonymousClass1E5.A00) {
            Log.i("deleting MeJid status from StatusMessageStore/deleteStatuses");
        }
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        ArrayList A042 = A04(userJid2, -1);
        Iterator it = A042.iterator();
        int i = 0;
        int i2 = 0;
        boolean z = false;
        while (it.hasNext()) {
            AnonymousClass206 r10 = (AnonymousClass206) it.next();
            if (C63672tV.A02(r10) == null || !C63672tV.A02(r10).A02()) {
                this.A05.BIJ(r10, 1, false);
                UserJid A0I2 = r10.A0I();
                if (!r10.A0v.A02 && A0I2 != null && !C22971Dz.A0Z(A0I2)) {
                    i++;
                    hashSet.add(A0I2.user);
                    C63372sx A082 = this.A0F.A08(A0I2);
                    if (A082 != null) {
                        if (C20133A8t.A0C(r10, A082.A05(), C18020vd.A05(C18040vf.A02, this.A0J, 8880))) {
                            i2++;
                            hashSet2.add(A0I2.user);
                        }
                    }
                }
            } else {
                z = true;
            }
        }
        C24661Le r0 = this.A0F;
        C63372sx A083 = r0.A08(userJid2);
        if (A083 == null || !z) {
            r0.A06(userJid2);
        } else {
            C17960vV.A01();
            A00(A083, this, A04(A083.A0A, -1));
        }
        ((C24651Ld) this.A0O.get()).A02(hashSet, hashSet2, new HashSet(), new HashSet(), i, i2, 0, 0);
        this.A06.A01.post(new C70733Ch(this, A042, 2));
        return A042.size();
    }

    public AnonymousClass206 A02(UserJid userJid) {
        C63372sx A082 = this.A0F.A08(userJid);
        if (A082 == null) {
            StringBuilder sb = new StringBuilder();
            sb.append("statusmsgstore/getFirstStatusMessage/no status for ");
            sb.append(userJid);
            Log.w(sb.toString());
        } else if (A082.A00() == 1) {
            return A082.A08();
        } else {
            ArrayList A042 = A04(userJid, 1);
            if (A042.size() == 0) {
                A042 = A04(userJid, -1);
                if (C18020vd.A05(C18040vf.A02, this.A0J, 9102)) {
                    A06(true);
                }
            }
            if (A042.size() > 0) {
                return (AnonymousClass206) A042.get(0);
            }
        }
        return null;
    }

    public AnonymousClass206 A03(UserJid userJid) {
        C63372sx A082 = this.A0F.A08(userJid);
        if (A082 == null) {
            StringBuilder sb = new StringBuilder();
            sb.append("statusmsgstore/getlaststatusmessage/no status for ");
            sb.append(userJid);
            Log.w(sb.toString());
            return null;
        }
        if (A082.A08() == null) {
            A082.A0C(this.A05.BUh(A082.A03()));
        }
        return A082.A08();
    }

    public void A06(boolean z) {
        C31931gM r2;
        C70573Bq r1;
        int i;
        if (z) {
            r2 = (C31931gM) this.A0M.get();
            r1 = new C70573Bq(this, 38);
            i = 40;
        } else if (this.A0I.compareAndSet(false, true)) {
            r2 = (C31931gM) this.A0M.get();
            r1 = new C70573Bq(this, 39);
            i = 41;
        } else {
            return;
        }
        r2.A01(r1, i);
    }

    public AnonymousClass1TG(AnonymousClass190 r3, C218617r r4, AnonymousClass11P r5, AnonymousClass118 r6, AnonymousClass1LW r7, AnonymousClass121 r8, AnonymousClass1Q2 r9, AnonymousClass1DL r10, AnonymousClass1ST r11, C25301Nr r12, C24681Lg r13, C22611Cn r14, AnonymousClass1Cd r15, C24621La r16, C24631Lb r17, C24661Le r18, C18030ve r19, C26061Qr r20, C18010vc r21, AnonymousClass1TF r22, AnonymousClass00H r23, AnonymousClass00H r24, AnonymousClass00H r25, AnonymousClass00H r26) {
        this.A02 = r5;
        this.A0J = r19;
        this.A07 = r10;
        this.A04 = r7;
        this.A00 = r3;
        this.A03 = r6;
        this.A01 = r4;
        this.A0F = r18;
        this.A06 = r9;
        this.A09 = r12;
        this.A0N = r23;
        this.A05 = r8;
        this.A0A = r13;
        this.A0L = r24;
        this.A0K = r22;
        this.A08 = r11;
        this.A0D = r16;
        this.A0M = r25;
        this.A0C = r15;
        this.A0G = r20;
        this.A0E = r17;
        this.A0H = r21;
        this.A0B = r14;
        this.A0O = r26;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:40:0x01b2, code lost:
        if (X.C446824j.A02(r11.A0D(), 4) == false) goto L_0x01b4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x01d8, code lost:
        if (r1.A01(r5) != false) goto L_0x01da;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x01f9, code lost:
        if (r11.A0I > r18) goto L_0x01fb;
     */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0134 A[SYNTHETIC, Splitter:B:21:0x0134] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0153 A[Catch:{ all -> 0x0225, all -> 0x022c, all -> 0x0231 }] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x017e A[Catch:{ all -> 0x0225, all -> 0x022c, all -> 0x0231 }] */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0205 A[Catch:{ all -> 0x0225, all -> 0x022c, all -> 0x0231 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.ArrayList A04(com.whatsapp.jid.UserJid r22, int r23) {
        /*
            r21 = this;
            X.C17960vV.A01()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r7 = r21
            X.1Cd r0 = r7.A0C     // Catch:{ RuntimeException -> 0x023b }
            X.1at r20 = r0.get()     // Catch:{ RuntimeException -> 0x023b }
            X.1Qr r0 = r7.A0G     // Catch:{ all -> 0x0231 }
            X.0vl r0 = r0.A01     // Catch:{ all -> 0x0231 }
            java.lang.Object r5 = r0.getValue()     // Catch:{ all -> 0x0231 }
            X.10f r5 = (X.C199410f) r5     // Catch:{ all -> 0x0231 }
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch:{ all -> 0x0231 }
            r1.<init>()     // Catch:{ all -> 0x0231 }
            r8 = r22
            if (r22 != 0) goto L_0x0024
            goto L_0x006d
        L_0x0024:
            X.1E5 r0 = X.AnonymousClass1E5.A00     // Catch:{ all -> 0x0231 }
            boolean r0 = r0.equals(r8)     // Catch:{ all -> 0x0231 }
            if (r0 == 0) goto L_0x00b4
            X.1LW r0 = r7.A04     // Catch:{ all -> 0x0231 }
            X.1cg r10 = X.C29671cg.A00     // Catch:{ all -> 0x0231 }
            long r3 = r0.A09(r10)     // Catch:{ all -> 0x0231 }
            java.lang.String r0 = java.lang.String.valueOf(r3)     // Catch:{ all -> 0x0231 }
            r1.add(r0)     // Catch:{ all -> 0x0231 }
            X.C26061Qr.A01(r5, r1)     // Catch:{ all -> 0x0231 }
            r0 = r20
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x0231 }
            X.1Ev r6 = r0.A02     // Catch:{ all -> 0x0231 }
            int r4 = r5.size()     // Catch:{ all -> 0x0231 }
            java.lang.String r0 = X.C50972Wm.A05     // Catch:{ all -> 0x0231 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0231 }
            r3.<init>()     // Catch:{ all -> 0x0231 }
            r3.append(r0)     // Catch:{ all -> 0x0231 }
            java.lang.String r0 = X.AnonymousClass203.A00(r4)     // Catch:{ all -> 0x0231 }
            r3.append(r0)     // Catch:{ all -> 0x0231 }
            java.lang.String r0 = " ORDER BY sort_id ASC"
            r3.append(r0)     // Catch:{ all -> 0x0231 }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x0231 }
            java.lang.String[] r0 = X.C19620yd.A0M     // Catch:{ all -> 0x0231 }
            java.lang.Object[] r1 = r1.toArray(r0)     // Catch:{ all -> 0x0231 }
            java.lang.String[] r1 = (java.lang.String[]) r1     // Catch:{ all -> 0x0231 }
            java.lang.String r0 = "SELECT_STATUSES_FOR_ME_SQL"
            goto L_0x00af
        L_0x006d:
            X.1LW r0 = r7.A04     // Catch:{ all -> 0x0231 }
            X.1cg r10 = X.C29671cg.A00     // Catch:{ all -> 0x0231 }
            long r3 = r0.A09(r10)     // Catch:{ all -> 0x0231 }
            java.lang.String r0 = java.lang.String.valueOf(r3)     // Catch:{ all -> 0x0231 }
            r1.add(r0)     // Catch:{ all -> 0x0231 }
            X.C26061Qr.A01(r5, r1)     // Catch:{ all -> 0x0231 }
            r0 = r20
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x0231 }
            X.1Ev r6 = r0.A02     // Catch:{ all -> 0x0231 }
            int r4 = r5.size()     // Catch:{ all -> 0x0231 }
            java.lang.String r0 = X.C50972Wm.A05     // Catch:{ all -> 0x0231 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0231 }
            r3.<init>()     // Catch:{ all -> 0x0231 }
            java.lang.String r0 = X.C50972Wm.A01     // Catch:{ all -> 0x0231 }
            r3.append(r0)     // Catch:{ all -> 0x0231 }
            java.lang.String r0 = X.AnonymousClass203.A00(r4)     // Catch:{ all -> 0x0231 }
            r3.append(r0)     // Catch:{ all -> 0x0231 }
            java.lang.String r0 = " ORDER BY sort_id ASC"
            r3.append(r0)     // Catch:{ all -> 0x0231 }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x0231 }
            java.lang.String[] r0 = X.C19620yd.A0M     // Catch:{ all -> 0x0231 }
            java.lang.Object[] r1 = r1.toArray(r0)     // Catch:{ all -> 0x0231 }
            java.lang.String[] r1 = (java.lang.String[]) r1     // Catch:{ all -> 0x0231 }
            java.lang.String r0 = "GET_STATUS_MESSAGES_SQL"
        L_0x00af:
            android.database.Cursor r9 = r6.A0A(r3, r0, r1)     // Catch:{ all -> 0x0231 }
            goto L_0x0132
        L_0x00b4:
            r3 = -1
            int r9 = r5.size()     // Catch:{ all -> 0x0231 }
            r6 = r23
            if (r6 != r3) goto L_0x00f9
            java.lang.String r0 = X.C50972Wm.A05     // Catch:{ all -> 0x0231 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0231 }
            r4.<init>()     // Catch:{ all -> 0x0231 }
            java.lang.String r0 = X.C50972Wm.A03     // Catch:{ all -> 0x0231 }
            r4.append(r0)     // Catch:{ all -> 0x0231 }
            java.lang.String r0 = X.AnonymousClass203.A00(r9)     // Catch:{ all -> 0x0231 }
            r4.append(r0)     // Catch:{ all -> 0x0231 }
            java.lang.String r0 = " ORDER BY sort_id ASC"
        L_0x00d2:
            r4.append(r0)     // Catch:{ all -> 0x0231 }
            java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x0231 }
            X.1LW r0 = r7.A04     // Catch:{ all -> 0x0231 }
            X.1cg r10 = X.C29671cg.A00     // Catch:{ all -> 0x0231 }
            long r11 = r0.A09(r10)     // Catch:{ all -> 0x0231 }
            java.lang.String r0 = java.lang.String.valueOf(r11)     // Catch:{ all -> 0x0231 }
            r1.add(r0)     // Catch:{ all -> 0x0231 }
            X.1DL r0 = r7.A07     // Catch:{ all -> 0x0231 }
            long r11 = r0.A09(r8)     // Catch:{ all -> 0x0231 }
            java.lang.String r0 = java.lang.String.valueOf(r11)     // Catch:{ all -> 0x0231 }
            r1.add(r0)     // Catch:{ all -> 0x0231 }
            X.C26061Qr.A01(r5, r1)     // Catch:{ all -> 0x0231 }
            goto L_0x0114
        L_0x00f9:
            java.lang.String r0 = X.C50972Wm.A05     // Catch:{ all -> 0x0231 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0231 }
            r4.<init>()     // Catch:{ all -> 0x0231 }
            java.lang.String r0 = X.C50972Wm.A04     // Catch:{ all -> 0x0231 }
            r4.append(r0)     // Catch:{ all -> 0x0231 }
            java.lang.String r0 = X.AnonymousClass203.A00(r9)     // Catch:{ all -> 0x0231 }
            r4.append(r0)     // Catch:{ all -> 0x0231 }
            java.lang.String r0 = " ORDER BY sort_id ASC"
            r4.append(r0)     // Catch:{ all -> 0x0231 }
            java.lang.String r0 = " LIMIT ?"
            goto L_0x00d2
        L_0x0114:
            if (r6 == r3) goto L_0x011d
            java.lang.String r0 = java.lang.String.valueOf(r6)     // Catch:{ all -> 0x0231 }
            r1.add(r0)     // Catch:{ all -> 0x0231 }
        L_0x011d:
            int r0 = r1.size()     // Catch:{ all -> 0x0231 }
            java.lang.String[] r3 = new java.lang.String[r0]     // Catch:{ all -> 0x0231 }
            r1.toArray(r3)     // Catch:{ all -> 0x0231 }
            r0 = r20
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x0231 }
            X.1Ev r1 = r0.A02     // Catch:{ all -> 0x0231 }
            java.lang.String r0 = "SELECT_STATUSES_FOR_JID_SQL"
            android.database.Cursor r9 = r1.A0A(r4, r0, r3)     // Catch:{ all -> 0x0231 }
        L_0x0132:
            if (r22 == 0) goto L_0x0140
            X.1Le r0 = r7.A0F     // Catch:{ all -> 0x0225 }
            X.2sx r0 = r0.A08(r8)     // Catch:{ all -> 0x0225 }
            if (r0 != 0) goto L_0x0140
            if (r9 == 0) goto L_0x0221
            goto L_0x021e
        L_0x0140:
            X.11P r4 = r7.A02     // Catch:{ all -> 0x0225 }
            long r5 = X.AnonymousClass11P.A01(r4)     // Catch:{ all -> 0x0225 }
            long r0 = r4.A05()     // Catch:{ all -> 0x0225 }
            long r13 = r5 - r0
            r11 = 86400000(0x5265c00, double:4.2687272E-316)
            int r0 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r0 <= 0) goto L_0x0163
            X.0ve r3 = r7.A0J     // Catch:{ all -> 0x0225 }
            r1 = 6219(0x184b, float:8.715E-42)
            X.0vf r0 = X.C18040vf.A02     // Catch:{ all -> 0x0225 }
            boolean r0 = X.C18020vd.A05(r0, r3, r1)     // Catch:{ all -> 0x0225 }
            if (r0 == 0) goto L_0x0163
            long r5 = r4.A05()     // Catch:{ all -> 0x0225 }
        L_0x0163:
            long r18 = r5 - r11
            X.1La r4 = r7.A0D     // Catch:{ all -> 0x0225 }
            java.lang.String r3 = "status_psa_exipration_time"
            r0 = 0
            long r16 = r4.A01(r3, r0)     // Catch:{ all -> 0x0225 }
            java.lang.String r3 = "status_psa_viewed_time"
            long r14 = r4.A01(r3, r0)     // Catch:{ all -> 0x0225 }
            r13 = 0
        L_0x0178:
            boolean r0 = r9.moveToNext()     // Catch:{ all -> 0x0225 }
            if (r0 == 0) goto L_0x0203
            X.00H r0 = r7.A0N     // Catch:{ all -> 0x0225 }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x0225 }
            X.1W6 r0 = (X.AnonymousClass1W6) r0     // Catch:{ all -> 0x0225 }
            X.206 r11 = r0.A02(r9, r10)     // Catch:{ all -> 0x0225 }
            if (r11 != 0) goto L_0x01a2
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0225 }
            r1.<init>()     // Catch:{ all -> 0x0225 }
            java.lang.String r0 = "statusmsgstore/status-null-message for "
            r1.append(r0)     // Catch:{ all -> 0x0225 }
            r1.append(r8)     // Catch:{ all -> 0x0225 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0225 }
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x0225 }
            goto L_0x0178
        L_0x01a2:
            boolean r0 = X.AnonymousClass25A.A0p(r11)     // Catch:{ all -> 0x0225 }
            if (r0 == 0) goto L_0x01b4
            r1 = 4
            int r0 = r11.A0D()     // Catch:{ all -> 0x0225 }
            boolean r1 = X.C446824j.A02(r0, r1)     // Catch:{ all -> 0x0225 }
            r0 = 1
            if (r1 != 0) goto L_0x01b5
        L_0x01b4:
            r0 = 0
        L_0x01b5:
            if (r0 != 0) goto L_0x0178
            boolean r0 = X.C20133A8t.A0A(r11)     // Catch:{ all -> 0x0225 }
            if (r0 != 0) goto L_0x0178
            X.1BI r0 = r11.A0H()     // Catch:{ all -> 0x0225 }
            boolean r0 = X.C22971Dz.A0Z(r0)     // Catch:{ all -> 0x0225 }
            if (r0 == 0) goto L_0x01f5
            X.1Lb r0 = r7.A0E     // Catch:{ all -> 0x0225 }
            X.2ss r1 = r0.A00(r11)     // Catch:{ all -> 0x0225 }
            boolean r0 = r1.A00()     // Catch:{ all -> 0x0225 }
            if (r0 != 0) goto L_0x01da
            boolean r0 = r1.A01(r5)     // Catch:{ all -> 0x0225 }
            r12 = 1
            if (r0 == 0) goto L_0x01db
        L_0x01da:
            r12 = 0
        L_0x01db:
            boolean r0 = r1.A00()     // Catch:{ all -> 0x0225 }
            if (r0 == 0) goto L_0x01f2
            long r0 = r11.A0I     // Catch:{ all -> 0x0225 }
            int r3 = (r0 > r14 ? 1 : (r0 == r14 ? 0 : -1))
            if (r3 > 0) goto L_0x01fb
            int r0 = (r5 > r16 ? 1 : (r5 == r16 ? 0 : -1))
            if (r0 < 0) goto L_0x01fb
            r3 = 0
            int r0 = (r16 > r3 ? 1 : (r16 == r3 ? 0 : -1))
            if (r0 != 0) goto L_0x01f2
            goto L_0x01fb
        L_0x01f2:
            if (r12 == 0) goto L_0x0200
            goto L_0x01fb
        L_0x01f5:
            long r3 = r11.A0I     // Catch:{ all -> 0x0225 }
            int r0 = (r3 > r18 ? 1 : (r3 == r18 ? 0 : -1))
            if (r0 <= 0) goto L_0x0200
        L_0x01fb:
            r2.add(r11)     // Catch:{ all -> 0x0225 }
            goto L_0x0178
        L_0x0200:
            r13 = 1
            goto L_0x0178
        L_0x0203:
            if (r13 == 0) goto L_0x021e
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0225 }
            r1.<init>()     // Catch:{ all -> 0x0225 }
            java.lang.String r0 = "statusmsgstore/status-cleanup/ "
            r1.append(r0)     // Catch:{ all -> 0x0225 }
            r1.append(r8)     // Catch:{ all -> 0x0225 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0225 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0225 }
            r0 = 0
            r7.A06(r0)     // Catch:{ all -> 0x0225 }
        L_0x021e:
            r9.close()     // Catch:{ all -> 0x0231 }
        L_0x0221:
            r20.close()     // Catch:{ RuntimeException -> 0x023b }
            return r2
        L_0x0225:
            r1 = move-exception
            if (r9 == 0) goto L_0x0230
            r9.close()     // Catch:{ all -> 0x022c }
            goto L_0x0230
        L_0x022c:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ all -> 0x0231 }
        L_0x0230:
            throw r1     // Catch:{ all -> 0x0231 }
        L_0x0231:
            r1 = move-exception
            r20.close()     // Catch:{ all -> 0x0236 }
            goto L_0x023a
        L_0x0236:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ RuntimeException -> 0x023b }
        L_0x023a:
            throw r1     // Catch:{ RuntimeException -> 0x023b }
        L_0x023b:
            r1 = move-exception
            java.lang.String r0 = "StatusMessageStore/getStatusMessages/exception"
            com.whatsapp.util.Log.e(r0, r1)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1TG.A04(com.whatsapp.jid.UserJid, int):java.util.ArrayList");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:249:0x0851, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:251:?, code lost:
        r24.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:255:0x085a, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0215, code lost:
        if (X.C20133A8t.A0A(r5) == false) goto L_0x0217;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Removed duplicated region for block: B:266:0x0100 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0255 A[Catch:{ all -> 0x0851 }] */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x030d A[Catch:{ all -> 0x0851 }] */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x0354 A[Catch:{ all -> 0x0851 }] */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x035f A[Catch:{ all -> 0x0851 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A07(boolean r48) {
        /*
            r47 = this;
            X.C17960vV.A01()
            java.util.HashSet r21 = new java.util.HashSet
            r21.<init>()
            r2 = r47
            X.11P r0 = r2.A02
            r46 = r0
            long r3 = X.AnonymousClass11P.A01(r46)
            long r0 = r46.A05()
            long r8 = r3 - r0
            r6 = 86400000(0x5265c00, double:4.2687272E-316)
            int r0 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r0 <= 0) goto L_0x002f
            X.0ve r5 = r2.A0J
            r1 = 6219(0x184b, float:8.715E-42)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r5, r1)
            if (r0 == 0) goto L_0x002f
            long r3 = r46.A05()
        L_0x002f:
            long r3 = r3 - r6
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "statusmsgstore/deleteoldstatuses "
            r1.append(r0)
            r25 = r48
            r0 = r25
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            X.1Ez r20 = new X.1Ez
            r0 = r20
            r0.<init>((java.lang.String) r1)
            X.1Cd r0 = r2.A0C
            r45 = r0
            X.1au r23 = r45.A05()
            X.1xA r24 = r23.BD0()     // Catch:{ all -> 0x085b }
            X.1Qr r0 = r2.A0G     // Catch:{ all -> 0x0851 }
            X.0vl r0 = r0.A01     // Catch:{ all -> 0x0851 }
            java.lang.Object r5 = r0.getValue()     // Catch:{ all -> 0x0851 }
            X.10f r5 = (X.C199410f) r5     // Catch:{ all -> 0x0851 }
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch:{ all -> 0x0851 }
            r1.<init>()     // Catch:{ all -> 0x0851 }
            X.1LW r0 = r2.A04     // Catch:{ all -> 0x0851 }
            r37 = r0
            X.1cg r15 = X.C29671cg.A00     // Catch:{ all -> 0x0851 }
            long r6 = r0.A09(r15)     // Catch:{ all -> 0x0851 }
            java.lang.String r0 = java.lang.String.valueOf(r6)     // Catch:{ all -> 0x0851 }
            r1.add(r0)     // Catch:{ all -> 0x0851 }
            X.C26061Qr.A01(r5, r1)     // Catch:{ all -> 0x0851 }
            r0 = r23
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x0851 }
            X.1Ev r0 = r0.A02     // Catch:{ all -> 0x0851 }
            r36 = r0
            int r6 = r5.size()     // Catch:{ all -> 0x0851 }
            java.lang.String r0 = X.C50972Wm.A05     // Catch:{ all -> 0x0851 }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x0851 }
            r5.<init>()     // Catch:{ all -> 0x0851 }
            java.lang.String r0 = X.C50972Wm.A01     // Catch:{ all -> 0x0851 }
            r5.append(r0)     // Catch:{ all -> 0x0851 }
            java.lang.String r0 = X.AnonymousClass203.A00(r6)     // Catch:{ all -> 0x0851 }
            r5.append(r0)     // Catch:{ all -> 0x0851 }
            java.lang.String r0 = " ORDER BY sort_id ASC"
            r5.append(r0)     // Catch:{ all -> 0x0851 }
            java.lang.String r6 = r5.toString()     // Catch:{ all -> 0x0851 }
            java.lang.String[] r0 = X.C19620yd.A0M     // Catch:{ all -> 0x0851 }
            java.lang.Object[] r5 = r1.toArray(r0)     // Catch:{ all -> 0x0851 }
            java.lang.String[] r5 = (java.lang.String[]) r5     // Catch:{ all -> 0x0851 }
            java.lang.String r1 = "GET_STATUS_MESSAGES_SQL"
            r0 = r36
            android.database.Cursor r13 = r0.A0A(r6, r1, r5)     // Catch:{ all -> 0x0851 }
            X.1La r0 = r2.A0D     // Catch:{ all -> 0x0851 }
            r44 = r0
            java.lang.String r6 = "status_psa_viewed_time"
            r0 = 0
            r5 = r44
            long r18 = r5.A01(r6, r0)     // Catch:{ all -> 0x0851 }
            java.lang.String r6 = "status_psa_exipration_time"
            long r7 = r5.A01(r6, r0)     // Catch:{ all -> 0x0851 }
            java.util.HashMap r26 = new java.util.HashMap     // Catch:{ all -> 0x0851 }
            r26.<init>()     // Catch:{ all -> 0x0851 }
            java.util.ArrayList r35 = new java.util.ArrayList     // Catch:{ all -> 0x0851 }
            r35.<init>()     // Catch:{ all -> 0x0851 }
            java.util.ArrayList r34 = new java.util.ArrayList     // Catch:{ all -> 0x0851 }
            r34.<init>()     // Catch:{ all -> 0x0851 }
            java.util.LinkedList r33 = new java.util.LinkedList     // Catch:{ all -> 0x0851 }
            r33.<init>()     // Catch:{ all -> 0x0851 }
            java.util.HashSet r32 = new java.util.HashSet     // Catch:{ all -> 0x0851 }
            r32.<init>()     // Catch:{ all -> 0x0851 }
            java.util.HashSet r31 = new java.util.HashSet     // Catch:{ all -> 0x0851 }
            r31.<init>()     // Catch:{ all -> 0x0851 }
            java.util.HashSet r30 = new java.util.HashSet     // Catch:{ all -> 0x0851 }
            r30.<init>()     // Catch:{ all -> 0x0851 }
            java.util.HashSet r29 = new java.util.HashSet     // Catch:{ all -> 0x0851 }
            r29.<init>()     // Catch:{ all -> 0x0851 }
            r16 = 0
            r14 = 0
            r10 = 0
            r40 = 0
            r41 = 0
            r42 = 0
            r43 = 0
            r22 = 0
        L_0x0100:
            boolean r0 = r13.moveToNext()     // Catch:{ all -> 0x0851 }
            java.lang.String r12 = " deleted:"
            if (r0 == 0) goto L_0x03b0
            int r14 = r14 + 1
            X.00H r0 = r2.A0N     // Catch:{ all -> 0x0851 }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x0851 }
            X.1W6 r0 = (X.AnonymousClass1W6) r0     // Catch:{ all -> 0x0851 }
            X.206 r5 = r0.A02(r13, r15)     // Catch:{ all -> 0x0851 }
            if (r5 != 0) goto L_0x011f
            java.lang.String r0 = "statusmsgstore/deleteoldstatuses/no message"
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ all -> 0x0851 }
            goto L_0x0100
        L_0x011f:
            X.1BI r0 = r5.A0H()     // Catch:{ all -> 0x0851 }
            boolean r0 = X.C22971Dz.A0Z(r0)     // Catch:{ all -> 0x0851 }
            java.lang.String r6 = " "
            if (r0 == 0) goto L_0x01b1
            X.1Lb r0 = r2.A0E     // Catch:{ all -> 0x0851 }
            X.2ss r9 = r0.A00(r5)     // Catch:{ all -> 0x0851 }
            boolean r0 = r9.A00()     // Catch:{ all -> 0x0851 }
            java.lang.String r11 = "statusmsgstore/deleteoldstatuses/psamessage "
            if (r0 != 0) goto L_0x0146
            long r0 = X.AnonymousClass11P.A01(r46)     // Catch:{ all -> 0x0851 }
            boolean r0 = r9.A01(r0)     // Catch:{ all -> 0x0851 }
            if (r0 == 0) goto L_0x023c
            goto L_0x0217
        L_0x0146:
            long r27 = X.AnonymousClass11P.A01(r46)     // Catch:{ all -> 0x0851 }
            int r0 = (r27 > r7 ? 1 : (r27 == r7 ? 0 : -1))
            if (r0 <= 0) goto L_0x015c
            r27 = 0
            int r0 = (r7 > r27 ? 1 : (r7 == r27 ? 0 : -1))
            if (r0 <= 0) goto L_0x015c
            long r0 = r5.A0I     // Catch:{ all -> 0x0851 }
            int r9 = (r0 > r18 ? 1 : (r0 == r18 ? 0 : -1))
            if (r9 >= 0) goto L_0x015c
            goto L_0x0217
        L_0x015c:
            long r0 = r5.A0I     // Catch:{ all -> 0x0851 }
            int r9 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r9 >= 0) goto L_0x023c
            X.1Le r1 = r2.A0F     // Catch:{ all -> 0x0851 }
            com.whatsapp.jid.UserJid r0 = r5.A0I()     // Catch:{ all -> 0x0851 }
            X.2sx r0 = r1.A08(r0)     // Catch:{ all -> 0x0851 }
            if (r0 == 0) goto L_0x023c
            int r0 = r0.A01()     // Catch:{ all -> 0x0851 }
            if (r0 != 0) goto L_0x023c
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ all -> 0x0851 }
            r9.<init>()     // Catch:{ all -> 0x0851 }
            r9.append(r11)     // Catch:{ all -> 0x0851 }
            X.205 r0 = r5.A0v     // Catch:{ all -> 0x0851 }
            r9.append(r0)     // Catch:{ all -> 0x0851 }
            r9.append(r6)     // Catch:{ all -> 0x0851 }
            int r0 = r5.A0u     // Catch:{ all -> 0x0851 }
            r9.append(r0)     // Catch:{ all -> 0x0851 }
            r9.append(r6)     // Catch:{ all -> 0x0851 }
            int r0 = r5.A0D()     // Catch:{ all -> 0x0851 }
            r9.append(r0)     // Catch:{ all -> 0x0851 }
            r9.append(r6)     // Catch:{ all -> 0x0851 }
            long r0 = r5.A0I     // Catch:{ all -> 0x0851 }
            r9.append(r0)     // Catch:{ all -> 0x0851 }
            r9.append(r6)     // Catch:{ all -> 0x0851 }
            r9.append(r7)     // Catch:{ all -> 0x0851 }
            r9.append(r6)     // Catch:{ all -> 0x0851 }
            r0 = r18
            r9.append(r0)     // Catch:{ all -> 0x0851 }
            java.lang.String r0 = r9.toString()     // Catch:{ all -> 0x0851 }
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ all -> 0x0851 }
            goto L_0x0217
        L_0x01b1:
            X.205 r0 = r5.A0v     // Catch:{ all -> 0x0851 }
            boolean r0 = r0.A02     // Catch:{ all -> 0x0851 }
            if (r0 == 0) goto L_0x01c2
            long r0 = r5.A0H     // Catch:{ all -> 0x0851 }
            r27 = 0
            int r9 = (r0 > r27 ? 1 : (r0 == r27 ? 0 : -1))
            if (r9 <= 0) goto L_0x01c2
            long r0 = r5.A0H     // Catch:{ all -> 0x0851 }
            goto L_0x01c4
        L_0x01c2:
            long r0 = r5.A0I     // Catch:{ all -> 0x0851 }
        L_0x01c4:
            int r9 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r9 >= 0) goto L_0x0230
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ all -> 0x0851 }
            r9.<init>()     // Catch:{ all -> 0x0851 }
            java.lang.String r0 = "statusmsgstore/deleteoldstatuses/message "
            r9.append(r0)     // Catch:{ all -> 0x0851 }
            X.205 r0 = r5.A0v     // Catch:{ all -> 0x0851 }
            r9.append(r0)     // Catch:{ all -> 0x0851 }
            r9.append(r6)     // Catch:{ all -> 0x0851 }
            X.1BI r0 = r5.A0H()     // Catch:{ all -> 0x0851 }
            r9.append(r0)     // Catch:{ all -> 0x0851 }
            r9.append(r6)     // Catch:{ all -> 0x0851 }
            int r0 = r5.A0u     // Catch:{ all -> 0x0851 }
            r9.append(r0)     // Catch:{ all -> 0x0851 }
            r9.append(r6)     // Catch:{ all -> 0x0851 }
            int r0 = r5.A0D()     // Catch:{ all -> 0x0851 }
            r9.append(r0)     // Catch:{ all -> 0x0851 }
            r9.append(r6)     // Catch:{ all -> 0x0851 }
            long r0 = r5.A0I     // Catch:{ all -> 0x0851 }
            r9.append(r0)     // Catch:{ all -> 0x0851 }
            r9.append(r6)     // Catch:{ all -> 0x0851 }
            long r0 = r5.A0H     // Catch:{ all -> 0x0851 }
            r9.append(r0)     // Catch:{ all -> 0x0851 }
            java.lang.String r0 = r9.toString()     // Catch:{ all -> 0x0851 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0851 }
            boolean r0 = X.AnonymousClass25A.A0p(r5)     // Catch:{ all -> 0x0851 }
            if (r0 != 0) goto L_0x0219
            boolean r0 = X.C20133A8t.A0A(r5)     // Catch:{ all -> 0x0851 }
            if (r0 != 0) goto L_0x0219
        L_0x0217:
            r22 = 1
        L_0x0219:
            X.00H r0 = r2.A0L     // Catch:{ all -> 0x0851 }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x0851 }
            X.2dD r0 = (X.C53862dD) r0     // Catch:{ all -> 0x0851 }
            X.1TF r0 = r0.A00     // Catch:{ all -> 0x0851 }
            X.00H r0 = r0.A00     // Catch:{ all -> 0x0851 }
            r0.get()     // Catch:{ all -> 0x0851 }
            r0 = r35
            r0.add(r5)     // Catch:{ all -> 0x0851 }
            int r10 = r10 + 1
            goto L_0x024d
        L_0x0230:
            r27 = 0
            int r6 = (r16 > r27 ? 1 : (r16 == r27 ? 0 : -1))
            if (r6 == 0) goto L_0x023a
            int r6 = (r16 > r0 ? 1 : (r16 == r0 ? 0 : -1))
            if (r6 <= 0) goto L_0x023c
        L_0x023a:
            r16 = r0
        L_0x023c:
            boolean r0 = X.AnonymousClass25A.A0p(r5)     // Catch:{ all -> 0x0851 }
            if (r0 == 0) goto L_0x0301
            r1 = 4
            int r0 = r5.A0D()     // Catch:{ all -> 0x0851 }
            boolean r0 = X.C446824j.A02(r0, r1)     // Catch:{ all -> 0x0851 }
            if (r0 == 0) goto L_0x0301
        L_0x024d:
            int r1 = r35.size()     // Catch:{ all -> 0x0851 }
            r0 = 256(0x100, float:3.59E-43)
            if (r1 < r0) goto L_0x0100
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0851 }
            r1.<init>()     // Catch:{ all -> 0x0851 }
            java.lang.String r0 = "statusmsgstore/deleteoldstatuses/delete total:"
            r1.append(r0)     // Catch:{ all -> 0x0851 }
            r1.append(r14)     // Catch:{ all -> 0x0851 }
            r1.append(r12)     // Catch:{ all -> 0x0851 }
            r1.append(r10)     // Catch:{ all -> 0x0851 }
            java.lang.String r0 = " current batch:"
            r1.append(r0)     // Catch:{ all -> 0x0851 }
            int r0 = r35.size()     // Catch:{ all -> 0x0851 }
            r1.append(r0)     // Catch:{ all -> 0x0851 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0851 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0851 }
            r13.close()     // Catch:{ all -> 0x0851 }
            java.util.Iterator r28 = r35.iterator()     // Catch:{ all -> 0x0851 }
        L_0x0283:
            boolean r0 = r28.hasNext()     // Catch:{ all -> 0x0851 }
            if (r0 == 0) goto L_0x0388
            java.lang.Object r11 = r28.next()     // Catch:{ all -> 0x0851 }
            X.206 r11 = (X.AnonymousClass206) r11     // Catch:{ all -> 0x0851 }
            X.121 r6 = r2.A05     // Catch:{ all -> 0x0851 }
            r1 = 0
            r0 = 1
            r6.BIJ(r11, r0, r1)     // Catch:{ all -> 0x0851 }
            com.whatsapp.jid.UserJid r9 = r11.A0I()     // Catch:{ all -> 0x0851 }
            X.205 r0 = r11.A0v     // Catch:{ all -> 0x0851 }
            boolean r0 = r0.A02     // Catch:{ all -> 0x0851 }
            if (r0 != 0) goto L_0x0283
            if (r9 == 0) goto L_0x0283
            boolean r0 = X.C22971Dz.A0Z(r9)     // Catch:{ all -> 0x0851 }
            if (r0 != 0) goto L_0x0283
            int r40 = r40 + 1
            java.lang.String r1 = r9.user     // Catch:{ all -> 0x0851 }
            r0 = r32
            r0.add(r1)     // Catch:{ all -> 0x0851 }
            X.36j r0 = X.C63672tV.A02(r11)     // Catch:{ all -> 0x0851 }
            if (r0 == 0) goto L_0x02f2
            X.36j r0 = X.C63672tV.A02(r11)     // Catch:{ all -> 0x0851 }
            boolean r0 = r0.A02()     // Catch:{ all -> 0x0851 }
            if (r0 == 0) goto L_0x02f2
            r27 = 1
            int r42 = r42 + 1
            java.lang.String r1 = r9.user     // Catch:{ all -> 0x0851 }
            r0 = r30
            r0.add(r1)     // Catch:{ all -> 0x0851 }
        L_0x02cc:
            X.1Le r0 = r2.A0F     // Catch:{ all -> 0x0851 }
            X.2sx r0 = r0.A08(r9)     // Catch:{ all -> 0x0851 }
            if (r0 == 0) goto L_0x0283
            long r0 = r0.A05()     // Catch:{ all -> 0x0851 }
            X.0ve r13 = r2.A0J     // Catch:{ all -> 0x0851 }
            r12 = 8880(0x22b0, float:1.2444E-41)
            X.0vf r6 = X.C18040vf.A02     // Catch:{ all -> 0x0851 }
            boolean r6 = X.C18020vd.A05(r6, r13, r12)     // Catch:{ all -> 0x0851 }
            boolean r0 = X.C20133A8t.A0C(r11, r0, r6)     // Catch:{ all -> 0x0851 }
            if (r0 == 0) goto L_0x0283
            int r41 = r41 + 1
            java.lang.String r1 = r9.user     // Catch:{ all -> 0x0851 }
            r0 = r31
            r0.add(r1)     // Catch:{ all -> 0x0851 }
            goto L_0x02f5
        L_0x02f2:
            r27 = 0
            goto L_0x02cc
        L_0x02f5:
            if (r27 == 0) goto L_0x0283
            int r43 = r43 + 1
            java.lang.String r1 = r9.user     // Catch:{ all -> 0x0851 }
            r0 = r29
            r0.add(r1)     // Catch:{ all -> 0x0851 }
            goto L_0x0283
        L_0x0301:
            boolean r0 = X.C20133A8t.A0A(r5)     // Catch:{ all -> 0x0851 }
            if (r0 != 0) goto L_0x024d
            com.whatsapp.jid.UserJid r11 = r5.A0I()     // Catch:{ all -> 0x0851 }
            if (r11 != 0) goto L_0x034a
            X.190 r9 = r2.A00     // Catch:{ all -> 0x0851 }
            java.lang.String r6 = "statusmsgstore/deleteoldstatuses status message with null sender user jid"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0851 }
            r1.<init>()     // Catch:{ all -> 0x0851 }
            java.lang.String r0 = "message: "
            r1.append(r0)     // Catch:{ all -> 0x0851 }
            r1.append(r5)     // Catch:{ all -> 0x0851 }
            java.lang.String r0 = " senderJid: "
            r1.append(r0)     // Catch:{ all -> 0x0851 }
            X.1BI r0 = r5.A0H()     // Catch:{ all -> 0x0851 }
            r1.append(r0)     // Catch:{ all -> 0x0851 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x0851 }
            r0 = 0
            r9.A0G(r6, r1, r0)     // Catch:{ all -> 0x0851 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0851 }
            r1.<init>()     // Catch:{ all -> 0x0851 }
            java.lang.String r0 = "statusmsgstore/deleteoldstatuses/null message senderUserJid "
            r1.append(r0)     // Catch:{ all -> 0x0851 }
            X.205 r0 = r5.A0v     // Catch:{ all -> 0x0851 }
            r1.append(r0)     // Catch:{ all -> 0x0851 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0851 }
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x0851 }
        L_0x034a:
            r0 = r26
            java.lang.Object r0 = r0.get(r11)     // Catch:{ all -> 0x0851 }
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ all -> 0x0851 }
            if (r0 != 0) goto L_0x035f
            r0 = 1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0851 }
            r0 = r26
            r0.put(r11, r1)     // Catch:{ all -> 0x0851 }
            goto L_0x036e
        L_0x035f:
            int r0 = r0.intValue()     // Catch:{ all -> 0x0851 }
            int r0 = r0 + 1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0851 }
            r0 = r26
            r0.put(r11, r1)     // Catch:{ all -> 0x0851 }
        L_0x036e:
            if (r48 == 0) goto L_0x024d
            boolean r0 = r5 instanceof X.AnonymousClass21V     // Catch:{ all -> 0x0851 }
            if (r0 == 0) goto L_0x024d
            r0 = r5
            X.21V r0 = (X.AnonymousClass21V) r0     // Catch:{ all -> 0x0851 }
            X.2rc r1 = r0.A02     // Catch:{ all -> 0x0851 }
            if (r1 == 0) goto L_0x024d
            java.io.File r0 = r1.A0G     // Catch:{ all -> 0x0851 }
            if (r0 == 0) goto L_0x024d
            java.io.File r1 = r1.A0G     // Catch:{ all -> 0x0851 }
            r0 = r21
            r0.add(r1)     // Catch:{ all -> 0x0851 }
            goto L_0x024d
        L_0x0388:
            r35.clear()     // Catch:{ all -> 0x0851 }
            java.lang.String r9 = X.C50972Wm.A02     // Catch:{ all -> 0x0851 }
            r0 = 2
            java.lang.String[] r6 = new java.lang.String[r0]     // Catch:{ all -> 0x0851 }
            r0 = r37
            long r0 = r0.A09(r15)     // Catch:{ all -> 0x0851 }
            java.lang.String r1 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x0851 }
            r0 = 0
            r6[r0] = r1     // Catch:{ all -> 0x0851 }
            long r0 = r5.A0y     // Catch:{ all -> 0x0851 }
            java.lang.String r1 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x0851 }
            r0 = 1
            r6[r0] = r1     // Catch:{ all -> 0x0851 }
            java.lang.String r1 = "GET_STATUS_MESSAGES_WITH_REF_GREATER_SQL"
            r0 = r36
            android.database.Cursor r13 = r0.A0A(r9, r1, r6)     // Catch:{ all -> 0x0851 }
            goto L_0x0100
        L_0x03b0:
            r13.close()     // Catch:{ all -> 0x0851 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0851 }
            r1.<init>()     // Catch:{ all -> 0x0851 }
            java.lang.String r0 = "statusmsgstore/deleteoldstatuses time limit:"
            r1.append(r0)     // Catch:{ all -> 0x0851 }
            r1.append(r3)     // Catch:{ all -> 0x0851 }
            java.lang.String r0 = " total:"
            r1.append(r0)     // Catch:{ all -> 0x0851 }
            r1.append(r14)     // Catch:{ all -> 0x0851 }
            java.lang.String r0 = " archived:"
            r1.append(r0)     // Catch:{ all -> 0x0851 }
            int r0 = r33.size()     // Catch:{ all -> 0x0851 }
            r1.append(r0)     // Catch:{ all -> 0x0851 }
            r1.append(r12)     // Catch:{ all -> 0x0851 }
            r1.append(r10)     // Catch:{ all -> 0x0851 }
            java.lang.String r0 = " last batch:"
            r1.append(r0)     // Catch:{ all -> 0x0851 }
            int r0 = r35.size()     // Catch:{ all -> 0x0851 }
            r1.append(r0)     // Catch:{ all -> 0x0851 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0851 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0851 }
            java.util.Iterator r11 = r35.iterator()     // Catch:{ all -> 0x0851 }
        L_0x03f2:
            boolean r0 = r11.hasNext()     // Catch:{ all -> 0x0851 }
            if (r0 == 0) goto L_0x0485
            java.lang.Object r7 = r11.next()     // Catch:{ all -> 0x0851 }
            X.206 r7 = (X.AnonymousClass206) r7     // Catch:{ all -> 0x0851 }
            X.205 r5 = r7.A0v     // Catch:{ all -> 0x0851 }
            boolean r8 = r5.A02     // Catch:{ all -> 0x0851 }
            if (r8 == 0) goto L_0x0419
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0851 }
            r1.<init>()     // Catch:{ all -> 0x0851 }
            java.lang.String r0 = "statusmsgstore/deleteoldstatuses/deletingSelfStatus: "
            r1.append(r0)     // Catch:{ all -> 0x0851 }
            r1.append(r5)     // Catch:{ all -> 0x0851 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0851 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0851 }
        L_0x0419:
            com.whatsapp.jid.UserJid r6 = r7.A0I()     // Catch:{ all -> 0x0851 }
            X.1Le r0 = r2.A0F     // Catch:{ all -> 0x0851 }
            X.2sx r9 = r0.A08(r6)     // Catch:{ all -> 0x0851 }
            X.121 r5 = r2.A05     // Catch:{ all -> 0x0851 }
            r1 = 0
            r0 = 1
            r5.BIJ(r7, r0, r1)     // Catch:{ all -> 0x0851 }
            if (r8 != 0) goto L_0x03f2
            if (r6 == 0) goto L_0x03f2
            boolean r0 = X.C22971Dz.A0Z(r6)     // Catch:{ all -> 0x0851 }
            if (r0 != 0) goto L_0x03f2
            int r40 = r40 + 1
            java.lang.String r1 = r6.user     // Catch:{ all -> 0x0851 }
            r0 = r32
            r0.add(r1)     // Catch:{ all -> 0x0851 }
            X.36j r0 = X.C63672tV.A02(r7)     // Catch:{ all -> 0x0851 }
            if (r0 == 0) goto L_0x0458
            X.36j r0 = X.C63672tV.A02(r7)     // Catch:{ all -> 0x0851 }
            boolean r0 = r0.A02()     // Catch:{ all -> 0x0851 }
            if (r0 == 0) goto L_0x0458
            r10 = 1
            int r42 = r42 + 1
            java.lang.String r1 = r6.user     // Catch:{ all -> 0x0851 }
            r0 = r30
            r0.add(r1)     // Catch:{ all -> 0x0851 }
            goto L_0x0459
        L_0x0458:
            r10 = 0
        L_0x0459:
            if (r9 == 0) goto L_0x03f2
            long r0 = r9.A05()     // Catch:{ all -> 0x0851 }
            X.0ve r9 = r2.A0J     // Catch:{ all -> 0x0851 }
            r8 = 8880(0x22b0, float:1.2444E-41)
            X.0vf r5 = X.C18040vf.A02     // Catch:{ all -> 0x0851 }
            boolean r5 = X.C18020vd.A05(r5, r9, r8)     // Catch:{ all -> 0x0851 }
            boolean r0 = X.C20133A8t.A0C(r7, r0, r5)     // Catch:{ all -> 0x0851 }
            if (r0 == 0) goto L_0x03f2
            int r41 = r41 + 1
            java.lang.String r1 = r6.user     // Catch:{ all -> 0x0851 }
            r0 = r31
            r0.add(r1)     // Catch:{ all -> 0x0851 }
            if (r10 == 0) goto L_0x03f2
            int r43 = r43 + 1
            java.lang.String r1 = r6.user     // Catch:{ all -> 0x0851 }
            r0 = r29
            r0.add(r1)     // Catch:{ all -> 0x0851 }
            goto L_0x03f2
        L_0x0485:
            X.00H r0 = r2.A0O     // Catch:{ all -> 0x0851 }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x0851 }
            X.1Ld r0 = (X.C24651Ld) r0     // Catch:{ all -> 0x0851 }
            r35 = r0
            r36 = r32
            r37 = r31
            r38 = r30
            r39 = r29
            r35.A02(r36, r37, r38, r39, r40, r41, r42, r43)     // Catch:{ all -> 0x0851 }
            java.util.Iterator r6 = r34.iterator()     // Catch:{ all -> 0x0851 }
        L_0x049e:
            boolean r0 = r6.hasNext()     // Catch:{ all -> 0x0851 }
            if (r0 == 0) goto L_0x04cf
            java.lang.Object r8 = r6.next()     // Catch:{ all -> 0x0851 }
            X.206 r8 = (X.AnonymousClass206) r8     // Catch:{ all -> 0x0851 }
            X.205 r5 = r8.A0v     // Catch:{ all -> 0x0851 }
            boolean r0 = r5.A02     // Catch:{ all -> 0x0851 }
            if (r0 == 0) goto L_0x04c5
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0851 }
            r1.<init>()     // Catch:{ all -> 0x0851 }
            java.lang.String r0 = "statusmsgstore/deleteoldstatuses/deletingSelfArchivedStatus: "
            r1.append(r0)     // Catch:{ all -> 0x0851 }
            r1.append(r5)     // Catch:{ all -> 0x0851 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0851 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0851 }
        L_0x04c5:
            X.121 r7 = r2.A05     // Catch:{ all -> 0x0851 }
            r9 = 1
            r10 = 0
            r11 = r9
            r12 = r10
            r7.BIK(r8, r9, r10, r11, r12)     // Catch:{ all -> 0x0851 }
            goto L_0x049e
        L_0x04cf:
            java.lang.String r6 = "earliest_status_time"
            r5 = r44
            r0 = r16
            r5.A05(r6, r0)     // Catch:{ all -> 0x0851 }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x0851 }
            r5.<init>()     // Catch:{ all -> 0x0851 }
            java.lang.String r0 = "statusmsgstore/deleteoldstatuses new earliest time:"
            r5.append(r0)     // Catch:{ all -> 0x0851 }
            r0 = r16
            r5.append(r0)     // Catch:{ all -> 0x0851 }
            java.lang.String r0 = " active jids:"
            r5.append(r0)     // Catch:{ all -> 0x0851 }
            int r0 = r26.size()     // Catch:{ all -> 0x0851 }
            r5.append(r0)     // Catch:{ all -> 0x0851 }
            java.lang.String r0 = r5.toString()     // Catch:{ all -> 0x0851 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0851 }
            java.util.Set r0 = r26.entrySet()     // Catch:{ all -> 0x0851 }
            java.util.Iterator r9 = r0.iterator()     // Catch:{ all -> 0x0851 }
        L_0x0503:
            boolean r0 = r9.hasNext()     // Catch:{ all -> 0x0851 }
            if (r0 == 0) goto L_0x0623
            java.lang.Object r8 = r9.next()     // Catch:{ all -> 0x0851 }
            java.util.Map$Entry r8 = (java.util.Map.Entry) r8     // Catch:{ all -> 0x0851 }
            java.lang.Object r6 = r8.getKey()     // Catch:{ all -> 0x0851 }
            com.whatsapp.jid.UserJid r6 = (com.whatsapp.jid.UserJid) r6     // Catch:{ all -> 0x0851 }
            X.1Le r7 = r2.A0F     // Catch:{ all -> 0x0851 }
            X.1Dw r0 = com.whatsapp.jid.UserJid.Companion     // Catch:{ all -> 0x0851 }
            com.whatsapp.jid.UserJid r0 = X.C22941Dw.A01(r6)     // Catch:{ all -> 0x0851 }
            X.2sx r5 = r7.A08(r0)     // Catch:{ all -> 0x0851 }
            if (r5 == 0) goto L_0x05b3
            X.1E5 r0 = X.AnonymousClass1E5.A00     // Catch:{ all -> 0x0851 }
            if (r6 != r0) goto L_0x053c
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0851 }
            r1.<init>()     // Catch:{ all -> 0x0851 }
            java.lang.String r0 = "statusmsgstore/deleteoldstatuses activeStatuses contains MeJid, StatusInfo: "
            r1.append(r0)     // Catch:{ all -> 0x0851 }
            r1.append(r5)     // Catch:{ all -> 0x0851 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0851 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0851 }
        L_0x053c:
            int r1 = r5.A00()     // Catch:{ all -> 0x0851 }
            java.lang.Object r0 = r8.getValue()     // Catch:{ all -> 0x0851 }
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ all -> 0x0851 }
            int r0 = r0.intValue()     // Catch:{ all -> 0x0851 }
            if (r1 == r0) goto L_0x0503
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0851 }
            r1.<init>()     // Catch:{ all -> 0x0851 }
            java.lang.String r0 = "statusmsgstore/deleteoldstatuses inconsistency for "
            r1.append(r0)     // Catch:{ all -> 0x0851 }
            r1.append(r6)     // Catch:{ all -> 0x0851 }
            java.lang.String r0 = " old count:"
            r1.append(r0)     // Catch:{ all -> 0x0851 }
            int r0 = r5.A00()     // Catch:{ all -> 0x0851 }
            r1.append(r0)     // Catch:{ all -> 0x0851 }
            java.lang.String r0 = " ("
            r1.append(r0)     // Catch:{ all -> 0x0851 }
            int r0 = r5.A01()     // Catch:{ all -> 0x0851 }
            r1.append(r0)     // Catch:{ all -> 0x0851 }
            java.lang.String r0 = ") new:"
            r1.append(r0)     // Catch:{ all -> 0x0851 }
            java.lang.Object r0 = r8.getValue()     // Catch:{ all -> 0x0851 }
            r1.append(r0)     // Catch:{ all -> 0x0851 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0851 }
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ all -> 0x0851 }
            java.lang.Object r0 = r8.getValue()     // Catch:{ all -> 0x0851 }
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ all -> 0x0851 }
            int r0 = r0.intValue()     // Catch:{ all -> 0x0851 }
            r5.A09(r0)     // Catch:{ all -> 0x0851 }
            int r1 = r5.A01()     // Catch:{ all -> 0x0851 }
            int r0 = r5.A00()     // Catch:{ all -> 0x0851 }
            if (r1 <= r0) goto L_0x05a4
            int r0 = r5.A00()     // Catch:{ all -> 0x0851 }
            monitor-enter(r5)     // Catch:{ all -> 0x0851 }
            r5.A01 = r0     // Catch:{ all -> 0x0620 }
            monitor-exit(r5)     // Catch:{ all -> 0x0851 }
        L_0x05a4:
            int r1 = r5.A01()     // Catch:{ all -> 0x0851 }
            int r0 = r5.A00()     // Catch:{ all -> 0x0851 }
            r7.A0E(r6, r1, r0)     // Catch:{ all -> 0x0851 }
            r22 = 1
            goto L_0x0503
        L_0x05b3:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0851 }
            r1.<init>()     // Catch:{ all -> 0x0851 }
            java.lang.String r0 = "statusmsgstore/deleteoldstatuses no status info for "
            r1.append(r0)     // Catch:{ all -> 0x0851 }
            r1.append(r6)     // Catch:{ all -> 0x0851 }
            java.lang.String r0 = " with "
            r1.append(r0)     // Catch:{ all -> 0x0851 }
            java.lang.Object r0 = r8.getValue()     // Catch:{ all -> 0x0851 }
            r1.append(r0)     // Catch:{ all -> 0x0851 }
            java.lang.String r0 = " statuses"
            r1.append(r0)     // Catch:{ all -> 0x0851 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0851 }
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x0851 }
            if (r6 == 0) goto L_0x0503
            X.0ve r5 = r2.A0J     // Catch:{ all -> 0x0851 }
            r1 = 6640(0x19f0, float:9.305E-42)
            X.0vf r0 = X.C18040vf.A02     // Catch:{ all -> 0x0851 }
            boolean r0 = X.C18020vd.A05(r0, r5, r1)     // Catch:{ all -> 0x0851 }
            if (r0 == 0) goto L_0x0503
            X.2sx r1 = new X.2sx     // Catch:{ all -> 0x0851 }
            r0 = r46
            r1.<init>((X.AnonymousClass11P) r0, (com.whatsapp.jid.UserJid) r6)     // Catch:{ all -> 0x0851 }
            X.C17960vV.A01()     // Catch:{ all -> 0x0851 }
            com.whatsapp.jid.UserJid r5 = r1.A0A     // Catch:{ all -> 0x0851 }
            r0 = -1
            java.util.ArrayList r0 = r2.A04(r5, r0)     // Catch:{ all -> 0x0851 }
            X.2sx r5 = A00(r1, r2, r0)     // Catch:{ all -> 0x0851 }
            if (r5 == 0) goto L_0x0503
            r7.A0D(r5, r6)     // Catch:{ all -> 0x0851 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0851 }
            r1.<init>()     // Catch:{ all -> 0x0851 }
            java.lang.String r0 = "statusmsgstore/deleteoldstatuses/regenerating status info for "
            r1.append(r0)     // Catch:{ all -> 0x0851 }
            r1.append(r6)     // Catch:{ all -> 0x0851 }
            java.lang.String r0 = " statusInfo: "
            r1.append(r0)     // Catch:{ all -> 0x0851 }
            r1.append(r5)     // Catch:{ all -> 0x0851 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0851 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0851 }
            goto L_0x0503
        L_0x0620:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x0851 }
            throw r0     // Catch:{ all -> 0x0851 }
        L_0x0623:
            X.1Le r6 = r2.A0F     // Catch:{ all -> 0x0851 }
            java.util.Map r8 = r6.A0C()     // Catch:{ all -> 0x0851 }
            java.util.ArrayList r7 = new java.util.ArrayList     // Catch:{ all -> 0x0851 }
            r7.<init>()     // Catch:{ all -> 0x0851 }
            java.util.Set r0 = r8.keySet()     // Catch:{ all -> 0x0851 }
            java.util.Iterator r9 = r0.iterator()     // Catch:{ all -> 0x0851 }
        L_0x0636:
            boolean r0 = r9.hasNext()     // Catch:{ all -> 0x0851 }
            if (r0 == 0) goto L_0x0671
            java.lang.Object r5 = r9.next()     // Catch:{ all -> 0x0851 }
            com.whatsapp.jid.UserJid r5 = (com.whatsapp.jid.UserJid) r5     // Catch:{ all -> 0x0851 }
            r0 = r26
            boolean r0 = r0.containsKey(r5)     // Catch:{ all -> 0x0851 }
            if (r0 != 0) goto L_0x0636
            r7.add(r5)     // Catch:{ all -> 0x0851 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0851 }
            r1.<init>()     // Catch:{ all -> 0x0851 }
            java.lang.String r0 = "statusmsgstore/deleteoldstatuses delete inactive UserJid: "
            r1.append(r0)     // Catch:{ all -> 0x0851 }
            r1.append(r5)     // Catch:{ all -> 0x0851 }
            java.lang.String r0 = " StatusInfo: "
            r1.append(r0)     // Catch:{ all -> 0x0851 }
            java.lang.Object r0 = r8.get(r5)     // Catch:{ all -> 0x0851 }
            r1.append(r0)     // Catch:{ all -> 0x0851 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0851 }
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ all -> 0x0851 }
            r22 = 1
            goto L_0x0636
        L_0x0671:
            java.util.Iterator r5 = r7.iterator()     // Catch:{ all -> 0x0851 }
        L_0x0675:
            boolean r0 = r5.hasNext()     // Catch:{ all -> 0x0851 }
            if (r0 == 0) goto L_0x068e
            java.lang.Object r1 = r5.next()     // Catch:{ all -> 0x0851 }
            com.whatsapp.jid.UserJid r1 = (com.whatsapp.jid.UserJid) r1     // Catch:{ all -> 0x0851 }
            X.1E5 r0 = X.AnonymousClass1E5.A00     // Catch:{ all -> 0x0851 }
            if (r1 != r0) goto L_0x068a
            java.lang.String r0 = "deleting MeJid status from StatusMessageStore/deleteOldStatusesInternal"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0851 }
        L_0x068a:
            r6.A06(r1)     // Catch:{ all -> 0x0851 }
            goto L_0x0675
        L_0x068e:
            r24.A00()     // Catch:{ all -> 0x0851 }
            r24.close()     // Catch:{ all -> 0x085b }
            r23.close()
            if (r48 == 0) goto L_0x0827
            X.17r r8 = r2.A01
            X.2hC r0 = r8.A08()
            java.io.File r1 = r0.A0P
            r0 = 0
            X.C218617r.A07(r1, r0)
            java.io.File[] r7 = r1.listFiles()
            if (r7 == 0) goto L_0x0827
            X.1au r16 = r45.A05()
            int r6 = r7.length     // Catch:{ all -> 0x081f }
            r5 = 0
        L_0x06b1:
            if (r5 >= r6) goto L_0x0824
            r9 = r7[r5]     // Catch:{ all -> 0x081f }
            r0 = r21
            boolean r0 = r0.contains(r9)     // Catch:{ all -> 0x081f }
            if (r0 != 0) goto L_0x0807
            long r10 = r9.lastModified()     // Catch:{ all -> 0x081f }
            int r0 = (r10 > r3 ? 1 : (r10 == r3 ? 0 : -1))
            if (r0 >= 0) goto L_0x0807
            X.1ST r0 = r2.A08     // Catch:{ all -> 0x081f }
            java.util.List r12 = r0.A0F(r9)     // Catch:{ all -> 0x081f }
            boolean r0 = r12.isEmpty()     // Catch:{ all -> 0x081f }
            java.lang.String r10 = "statusmsgstore/deleteoldstatuses/cleanup/failed to delete "
            if (r0 == 0) goto L_0x0717
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ all -> 0x081f }
            r11.<init>()     // Catch:{ all -> 0x081f }
            java.lang.String r0 = "statusmsgstore/deleteoldstatuses/cleanup/ delete "
            r11.append(r0)     // Catch:{ all -> 0x081f }
            java.lang.String r0 = r9.getAbsolutePath()     // Catch:{ all -> 0x081f }
            r11.append(r0)     // Catch:{ all -> 0x081f }
            java.lang.String r0 = " "
            r11.append(r0)     // Catch:{ all -> 0x081f }
            long r0 = r9.lastModified()     // Catch:{ all -> 0x081f }
            r11.append(r0)     // Catch:{ all -> 0x081f }
            java.lang.String r0 = r11.toString()     // Catch:{ all -> 0x081f }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x081f }
            boolean r0 = r9.delete()     // Catch:{ all -> 0x081f }
            if (r0 != 0) goto L_0x0807
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x081f }
            r1.<init>()     // Catch:{ all -> 0x081f }
            r1.append(r10)     // Catch:{ all -> 0x081f }
            java.lang.String r0 = r9.getAbsolutePath()     // Catch:{ all -> 0x081f }
            r1.append(r0)     // Catch:{ all -> 0x081f }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x081f }
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ all -> 0x081f }
            goto L_0x0807
        L_0x0717:
            java.util.Iterator r0 = r12.iterator()     // Catch:{ all -> 0x081f }
            java.lang.Object r0 = r0.next()     // Catch:{ all -> 0x081f }
            X.206 r0 = (X.AnonymousClass206) r0     // Catch:{ all -> 0x081f }
            X.0vc r11 = r2.A0H     // Catch:{ all -> 0x081f }
            X.1So r1 = X.C63972u0.A02(r0)     // Catch:{ all -> 0x081f }
            int r0 = r0.A09     // Catch:{ all -> 0x081f }
            java.io.File r11 = X.C26511Sk.A0E(r8, r11, r1, r9, r0)     // Catch:{ all -> 0x081f }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x081f }
            r1.<init>()     // Catch:{ all -> 0x081f }
            java.lang.String r0 = "statusmsgstore/deleteoldstatuses/cleanup "
            r1.append(r0)     // Catch:{ all -> 0x081f }
            java.lang.String r0 = r9.getAbsolutePath()     // Catch:{ all -> 0x081f }
            r1.append(r0)     // Catch:{ all -> 0x081f }
            java.lang.String r0 = " found in "
            r1.append(r0)     // Catch:{ all -> 0x081f }
            int r0 = r12.size()     // Catch:{ all -> 0x081f }
            r1.append(r0)     // Catch:{ all -> 0x081f }
            java.lang.String r0 = " message(s), rename to "
            r1.append(r0)     // Catch:{ all -> 0x081f }
            java.lang.String r0 = r11.getAbsolutePath()     // Catch:{ all -> 0x081f }
            r1.append(r0)     // Catch:{ all -> 0x081f }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x081f }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x081f }
            r8.A0i(r9, r11)     // Catch:{ IOException -> 0x07e2 }
            X.1xA r15 = r16.BD0()     // Catch:{ all -> 0x081f }
            java.util.Iterator r12 = r12.iterator()     // Catch:{ all -> 0x0815 }
        L_0x0769:
            boolean r0 = r12.hasNext()     // Catch:{ all -> 0x0815 }
            if (r0 == 0) goto L_0x0788
            java.lang.Object r1 = r12.next()     // Catch:{ all -> 0x0815 }
            X.206 r1 = (X.AnonymousClass206) r1     // Catch:{ all -> 0x0815 }
            boolean r0 = r1 instanceof X.AnonymousClass21V     // Catch:{ all -> 0x0815 }
            if (r0 == 0) goto L_0x0769
            r0 = r1
            X.21V r0 = (X.AnonymousClass21V) r0     // Catch:{ all -> 0x0815 }
            X.2rc r0 = r0.A02     // Catch:{ all -> 0x0815 }
            if (r0 == 0) goto L_0x0769
            r0.A0G = r11     // Catch:{ all -> 0x0815 }
            X.121 r0 = r2.A05     // Catch:{ all -> 0x0815 }
            r0.CQw(r1)     // Catch:{ all -> 0x0815 }
            goto L_0x0769
        L_0x0788:
            X.1Nr r0 = r2.A09     // Catch:{ all -> 0x0815 }
            java.lang.String r14 = r9.getAbsolutePath()     // Catch:{ all -> 0x0815 }
            java.lang.String r1 = r11.getAbsolutePath()     // Catch:{ all -> 0x0815 }
            X.1Cd r0 = r0.A00     // Catch:{ all -> 0x0815 }
            X.1au r13 = r0.A05()     // Catch:{ all -> 0x0815 }
            android.content.ContentValues r12 = new android.content.ContentValues     // Catch:{ all -> 0x080b }
            r12.<init>()     // Catch:{ all -> 0x080b }
            java.lang.String r0 = "path"
            r12.put(r0, r1)     // Catch:{ all -> 0x080b }
            r0 = r13
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x080b }
            X.1Ev r11 = r0.A02     // Catch:{ all -> 0x080b }
            java.lang.String r25 = "media_refs"
            java.lang.String r26 = "path = ?"
            r0 = 1
            java.lang.String[] r1 = new java.lang.String[r0]     // Catch:{ all -> 0x080b }
            r0 = 0
            r1[r0] = r14     // Catch:{ all -> 0x080b }
            java.lang.String r27 = "RENAME_MEDIA_REF_SQL"
            r23 = r11
            r24 = r12
            r28 = r1
            r23.A02(r24, r25, r26, r27, r28)     // Catch:{ all -> 0x080b }
            r13.close()     // Catch:{ all -> 0x0815 }
            r15.A00()     // Catch:{ all -> 0x0815 }
            r15.close()     // Catch:{ all -> 0x081f }
            boolean r0 = r9.delete()     // Catch:{ all -> 0x081f }
            if (r0 != 0) goto L_0x0807
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x081f }
            r1.<init>()     // Catch:{ all -> 0x081f }
            r1.append(r10)     // Catch:{ all -> 0x081f }
            java.lang.String r0 = r9.getAbsolutePath()     // Catch:{ all -> 0x081f }
            r1.append(r0)     // Catch:{ all -> 0x081f }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x081f }
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ all -> 0x081f }
            goto L_0x0807
        L_0x07e2:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x081f }
            r1.<init>()     // Catch:{ all -> 0x081f }
            java.lang.String r0 = "statusmsgstore/deleteoldstatuses/cleanup/failed to copy from "
            r1.append(r0)     // Catch:{ all -> 0x081f }
            java.lang.String r0 = r9.getAbsolutePath()     // Catch:{ all -> 0x081f }
            r1.append(r0)     // Catch:{ all -> 0x081f }
            java.lang.String r0 = " to "
            r1.append(r0)     // Catch:{ all -> 0x081f }
            java.lang.String r0 = r11.getAbsolutePath()     // Catch:{ all -> 0x081f }
            r1.append(r0)     // Catch:{ all -> 0x081f }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x081f }
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ all -> 0x081f }
        L_0x0807:
            int r5 = r5 + 1
            goto L_0x06b1
        L_0x080b:
            r1 = move-exception
            r13.close()     // Catch:{ all -> 0x0810 }
            goto L_0x0814
        L_0x0810:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ all -> 0x0815 }
        L_0x0814:
            throw r1     // Catch:{ all -> 0x0815 }
        L_0x0815:
            r1 = move-exception
            r15.close()     // Catch:{ all -> 0x081a }
            goto L_0x081e
        L_0x081a:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ all -> 0x081f }
        L_0x081e:
            throw r1     // Catch:{ all -> 0x081f }
        L_0x081f:
            r1 = move-exception
            r16.close()     // Catch:{ all -> 0x0860 }
            throw r1
        L_0x0824:
            r16.close()
        L_0x0827:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r0 = "statusmsgstore/deleteoldstatuses time spent:"
            r3.append(r0)
            long r0 = r20.A02()
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            if (r22 == 0) goto L_0x0850
            X.1Q2 r0 = r2.A06
            android.os.Handler r3 = r0.A01
            r1 = 40
            X.3Bq r0 = new X.3Bq
            r0.<init>(r2, r1)
            r3.post(r0)
        L_0x0850:
            return
        L_0x0851:
            r1 = move-exception
            r24.close()     // Catch:{ all -> 0x0856 }
            goto L_0x085a
        L_0x0856:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ all -> 0x085b }
        L_0x085a:
            throw r1     // Catch:{ all -> 0x085b }
        L_0x085b:
            r1 = move-exception
            r23.close()     // Catch:{ all -> 0x0860 }
            throw r1
        L_0x0860:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1TG.A07(boolean):void");
    }
}
