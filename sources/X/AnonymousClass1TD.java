package X;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.os.SystemClock;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.1TD  reason: invalid class name */
public class AnonymousClass1TD {
    public AnonymousClass1TE A00;
    public final AnonymousClass11S A01;
    public final AnonymousClass1TC A02;
    public final AnonymousClass11P A03;
    public final AnonymousClass1TB A04;
    public final AnonymousClass1CJ A05;
    public final AnonymousClass121 A06;
    public final AnonymousClass1Q2 A07;
    public final AnonymousClass1Q6 A08;
    public final C24681Lg A09;
    public final AnonymousClass1Cd A0A;
    public final AnonymousClass1NG A0B;
    public final C18030ve A0C;
    public final AnonymousClass1DC A0D;
    public final AnonymousClass00H A0E;
    public final AnonymousClass00H A0F;
    public final AnonymousClass00H A0G;
    public final Map A0H = new HashMap();

    public AnonymousClass1TD(AnonymousClass11S r3, AnonymousClass1TC r4, AnonymousClass11P r5, AnonymousClass1TB r6, AnonymousClass1CJ r7, AnonymousClass121 r8, AnonymousClass1Q2 r9, AnonymousClass1Q6 r10, C24681Lg r11, AnonymousClass1Cd r12, AnonymousClass1NG r13, C18030ve r14, AnonymousClass1DC r15, AnonymousClass00H r16, AnonymousClass00H r17, AnonymousClass00H r18) {
        AnonymousClass1TE r1 = new AnonymousClass1TE();
        this.A03 = r5;
        this.A00 = r1;
        this.A0C = r14;
        this.A01 = r3;
        this.A05 = r7;
        this.A04 = r6;
        this.A07 = r9;
        this.A0F = r16;
        this.A06 = r8;
        this.A09 = r11;
        this.A0E = r17;
        this.A08 = r10;
        this.A0A = r12;
        this.A0B = r13;
        this.A0G = r18;
        this.A02 = r4;
        this.A0D = r15;
    }

    public static void A00(AnonymousClass1TD r8, C178119Bw r9) {
        boolean z;
        boolean A042;
        int i;
        AnonymousClass1TB r2 = r8.A04;
        synchronized (r2) {
            if (r9.A05) {
                Log.w("CallLogStore/insertCallLog - only regular call log is stored here");
            } else {
                synchronized (r9) {
                    A042 = r9.A04();
                    i = r9.A01;
                }
                if (!A042) {
                    Log.w("CallLogStore/insertCallLog - no need to commit");
                } else {
                    C28791au A052 = r2.A06.A05();
                    try {
                        C41851xA BD0 = A052.BD0();
                        try {
                            r9.A03(((C28801av) A052).A02.A06("call_log", "insertCallLog/INSERT_CALL_LOG", AnonymousClass1TB.A00(r2, r9, r9.A04)));
                            synchronized (r9) {
                                int i2 = r9.A01;
                                if (i == i2) {
                                    r9.A02 = false;
                                    r9.A01 = i2 + 1;
                                }
                            }
                            AnonymousClass1TB.A02(r2, r9);
                            BD0.A00();
                            BD0.close();
                            A052.close();
                            z = true;
                        } catch (Throwable th) {
                            BD0.close();
                            throw th;
                        }
                    } catch (Throwable th2) {
                        try {
                            A052.close();
                        } catch (Throwable th3) {
                            AnonymousClass0DT.A00(th2, th3);
                        }
                        throw th2;
                    }
                }
            }
            z = false;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("CallsMessageStore/insertCallLog; callLog.key=");
        sb.append(r9.A04);
        sb.append("; callLog.row_id=");
        sb.append(r9.A01());
        sb.append("; callLog.timestamp=");
        sb.append(r9.A01);
        Log.i(sb.toString());
        if (z) {
            r8.A00.A00(r9);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0079, code lost:
        if (r9.A06 == 0) goto L_0x007b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00b8, code lost:
        if (r1 != com.whatsapp.voipcalling.CallState.PRECALLING) goto L_0x00ba;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00ba, code lost:
        r8.A0H.put(r3, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00bf, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00ca, code lost:
        if (((X.C56762hz) r2.get()).A00(r5) != false) goto L_0x00ba;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A01(X.AnonymousClass1TD r8, X.C178119Bw r9) {
        /*
            com.whatsapp.jid.GroupJid r0 = r9.A0C
            if (r0 != 0) goto L_0x0087
            X.4cT r0 = r9.A04
            com.whatsapp.jid.UserJid r3 = r0.A01
        L_0x0008:
            if (r3 == 0) goto L_0x0080
            X.11S r0 = r8.A01
            boolean r0 = r0.A0O(r3)
            if (r0 != 0) goto L_0x0080
            X.1NG r0 = r8.A0B
            X.1BI r2 = r0.A01(r3)
            X.4cT r0 = r9.A04
            boolean r1 = r0.A03
            java.lang.String r5 = r0.A02
            java.lang.String r0 = X.C40811vJ.A09(r5)
            X.205 r7 = new X.205
            r7.<init>(r2, r0, r1)
            X.1Q6 r6 = r8.A08
            X.1Q7 r0 = r6.A01
            X.206 r4 = r0.A00(r7)
            boolean r0 = r4 instanceof X.AnonymousClass22M
            if (r0 == 0) goto L_0x0081
            X.22M r4 = (X.AnonymousClass22M) r4
            if (r4 == 0) goto L_0x0081
            X.25F r0 = r4.A00
            r0.A02(r9)
            X.0ve r2 = r8.A0C
            X.0vf r1 = X.C18040vf.A01
            r0 = 7515(0x1d5b, float:1.0531E-41)
            boolean r0 = X.C18020vd.A05(r1, r2, r0)
            if (r0 == 0) goto L_0x004b
            r6.A0C(r7)
        L_0x004b:
            X.0ve r2 = r8.A0C
            X.0vf r1 = X.C18040vf.A01
            r0 = 7515(0x1d5b, float:1.0531E-41)
            boolean r0 = X.C18020vd.A05(r1, r2, r0)
            if (r0 != 0) goto L_0x005a
            r6.A0B(r4)
        L_0x005a:
            boolean r0 = r9.A0O()
            if (r0 == 0) goto L_0x0091
            X.2Q4 r0 = r9.A0E
            if (r0 == 0) goto L_0x008b
            com.whatsapp.jid.GroupJid r0 = r9.A0C
            if (r0 != 0) goto L_0x007b
            X.1Dw r0 = com.whatsapp.jid.UserJid.Companion
            com.whatsapp.jid.UserJid r0 = X.C22941Dw.A01(r3)
            if (r0 == 0) goto L_0x008b
            int r1 = r9.A07(r0)
            r0 = 5
            if (r1 != r0) goto L_0x008b
            int r0 = r9.A06
            if (r0 != 0) goto L_0x008b
        L_0x007b:
            java.util.Map r0 = r8.A0H
            r0.put(r3, r4)
        L_0x0080:
            return
        L_0x0081:
            X.22M r4 = new X.22M
            r4.<init>((X.AnonymousClass205) r7, (X.C178119Bw) r9)
            goto L_0x004b
        L_0x0087:
            com.whatsapp.jid.GroupJid r3 = r9.A0C
            goto L_0x0008
        L_0x008b:
            java.util.Map r0 = r8.A0H
            r0.remove(r3)
            return
        L_0x0091:
            int r0 = r9.A06
            if (r0 != 0) goto L_0x00cd
            X.00H r2 = r8.A0G
            java.lang.Object r0 = r2.get()
            X.2hz r0 = (X.C56762hz) r0
            if (r5 == 0) goto L_0x00c0
            java.lang.String r1 = X.C40811vJ.A09(r5)
            X.C18070vi.A0X(r1)
            java.util.concurrent.ConcurrentHashMap r0 = r0.A00
            java.lang.Object r1 = r0.get(r1)
            if (r1 == 0) goto L_0x00c0
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.NONE
            if (r1 == r0) goto L_0x00c0
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.LINK
            if (r1 == r0) goto L_0x00c0
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.PRECALLING
            if (r1 == r0) goto L_0x00c0
        L_0x00ba:
            java.util.Map r0 = r8.A0H
            r0.put(r3, r4)
            return
        L_0x00c0:
            java.lang.Object r0 = r2.get()
            X.2hz r0 = (X.C56762hz) r0
            boolean r0 = r0.A00(r5)
            if (r0 == 0) goto L_0x00cd
            goto L_0x00ba
        L_0x00cd:
            java.util.Map r0 = r8.A0H
            r0.remove(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1TD.A01(X.1TD, X.9Bw):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:128:0x0193, code lost:
        r1 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:?, code lost:
        r10.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x0198, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:?, code lost:
        X.AnonymousClass0DT.A00(r1, r0);
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:75:0x010c, B:83:0x012c] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:126:0x0192=Splitter:B:126:0x0192, B:112:0x016d=Splitter:B:112:0x016d} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A02(X.AnonymousClass1TD r19, X.C178119Bw r20) {
        /*
            r1 = r20
            long r2 = r1.A01()
            r8 = -1
            int r0 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r0 == 0) goto L_0x01de
            r4 = r19
            X.1TB r2 = r4.A04
            monitor-enter(r2)
            boolean r5 = r1.A05     // Catch:{ all -> 0x01db }
            r0 = 1
            r3 = 0
            r6 = r5 ^ 1
            java.lang.String r5 = "Only regular call log is stored here"
            X.C17960vV.A0G(r6, r5)     // Catch:{ all -> 0x01db }
            long r6 = r1.A01()     // Catch:{ all -> 0x01db }
            int r5 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            r6 = 0
            if (r5 == 0) goto L_0x0026
            r6 = 1
        L_0x0026:
            java.lang.String r5 = "CallLog row_id is not set"
            X.C17960vV.A0G(r6, r5)     // Catch:{ all -> 0x01db }
            monitor-enter(r1)     // Catch:{ all -> 0x01db }
            boolean r5 = r1.A04()     // Catch:{ all -> 0x01d8 }
            int r8 = r1.A01     // Catch:{ all -> 0x01d8 }
            monitor-exit(r1)     // Catch:{ all -> 0x01db }
            if (r5 == 0) goto L_0x01c2
            X.1Cd r5 = r2.A06     // Catch:{ all -> 0x01db }
            X.1au r14 = r5.A05()     // Catch:{ all -> 0x01db }
            X.1xA r13 = r14.BD0()     // Catch:{ all -> 0x01b8 }
            X.4cT r5 = r1.A04     // Catch:{ all -> 0x01ae }
            android.content.ContentValues r16 = X.AnonymousClass1TB.A00(r2, r1, r5)     // Catch:{ all -> 0x01ae }
            r5 = r14
            X.1av r5 = (X.C28801av) r5     // Catch:{ all -> 0x01ae }
            X.1Ev r15 = r5.A02     // Catch:{ all -> 0x01ae }
            java.lang.String r17 = "call_log"
            java.lang.String r18 = "_id = ?"
            java.lang.String[] r7 = new java.lang.String[r0]     // Catch:{ all -> 0x01ae }
            long r5 = r1.A01()     // Catch:{ all -> 0x01ae }
            java.lang.String r5 = java.lang.Long.toString(r5)     // Catch:{ all -> 0x01ae }
            r7[r3] = r5     // Catch:{ all -> 0x01ae }
            java.lang.String r19 = "updateCallLog/UPDATE_CALL_LOG"
            r20 = r7
            r15.A02(r16, r17, r18, r19, r20)     // Catch:{ all -> 0x01ae }
            monitor-enter(r1)     // Catch:{ all -> 0x01ae }
            int r5 = r1.A01     // Catch:{ all -> 0x01a8 }
            if (r8 != r5) goto L_0x006d
            r1.A02 = r3     // Catch:{ all -> 0x01a8 }
            int r5 = r5 + 1
            r1.A01 = r5     // Catch:{ all -> 0x01a8 }
        L_0x006d:
            monitor-exit(r1)     // Catch:{ all -> 0x01ae }
            X.AnonymousClass1TB.A02(r2, r1)     // Catch:{ all -> 0x01ae }
            X.2Q4 r5 = r1.A0E     // Catch:{ all -> 0x01ae }
            if (r5 == 0) goto L_0x0119
            boolean r5 = r1.A0H     // Catch:{ all -> 0x01ae }
            if (r5 == 0) goto L_0x019e
            X.2Q4 r7 = r1.A0E     // Catch:{ all -> 0x01ae }
            long r5 = r1.A01()     // Catch:{ all -> 0x01ae }
            r7.A03(r5)     // Catch:{ all -> 0x01ae }
            X.2Q4 r6 = r1.A0E     // Catch:{ all -> 0x01ae }
            monitor-enter(r6)     // Catch:{ all -> 0x01ae }
            boolean r5 = r6.A04()     // Catch:{ all -> 0x01ab }
            monitor-exit(r6)     // Catch:{ all -> 0x01ae }
            if (r5 == 0) goto L_0x0111
            X.1TA r9 = r2.A05     // Catch:{ all -> 0x01ae }
            X.2Q4 r6 = r1.A0E     // Catch:{ all -> 0x01ae }
            monitor-enter(r6)     // Catch:{ all -> 0x01ae }
            boolean r7 = r6.A04()     // Catch:{ all -> 0x01ab }
            int r5 = r6.A01     // Catch:{ all -> 0x01ab }
            monitor-exit(r6)     // Catch:{ all -> 0x01ae }
            if (r7 != 0) goto L_0x009c
            goto L_0x0185
        L_0x009c:
            X.1Cd r7 = r9.A01     // Catch:{ all -> 0x01ae }
            X.1au r12 = r7.A05()     // Catch:{ all -> 0x01ae }
            X.1xA r11 = r12.BD0()     // Catch:{ all -> 0x010b }
            android.content.ContentValues r16 = X.AnonymousClass1TA.A00(r9, r6)     // Catch:{ all -> 0x0101 }
            r7 = r12
            X.1av r7 = (X.C28801av) r7     // Catch:{ all -> 0x0101 }
            X.1Ev r15 = r7.A02     // Catch:{ all -> 0x0101 }
            java.lang.String r17 = "joinable_call_log"
            java.lang.String r18 = "call_log_row_id = ?"
            java.lang.String[] r10 = new java.lang.String[r0]     // Catch:{ all -> 0x0101 }
            long r7 = r6.A01()     // Catch:{ all -> 0x0101 }
            java.lang.String r0 = java.lang.Long.toString(r7)     // Catch:{ all -> 0x0101 }
            r10[r3] = r0     // Catch:{ all -> 0x0101 }
            java.lang.String r19 = "joinable_call_log_store/update"
            r20 = r10
            r15.A02(r16, r17, r18, r19, r20)     // Catch:{ all -> 0x0101 }
            X.00H r0 = r9.A00     // Catch:{ all -> 0x0101 }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x0101 }
            X.2ig r0 = (X.C57192ig) r0     // Catch:{ all -> 0x0101 }
            r0.A00(r6)     // Catch:{ all -> 0x0101 }
            monitor-enter(r6)     // Catch:{ all -> 0x0101 }
            int r0 = r6.A01     // Catch:{ all -> 0x00fe }
            if (r5 != r0) goto L_0x00dc
            r6.A02 = r3     // Catch:{ all -> 0x00fe }
            int r0 = r0 + 1
            r6.A01 = r0     // Catch:{ all -> 0x00fe }
        L_0x00dc:
            monitor-exit(r6)     // Catch:{ all -> 0x0101 }
            r11.A00()     // Catch:{ all -> 0x0101 }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x0101 }
            r5.<init>()     // Catch:{ all -> 0x0101 }
            java.lang.String r0 = "JoinableCallLogStore/updateCallLogInternal/updaetd; joinableCallLog.callId="
            r5.append(r0)     // Catch:{ all -> 0x0101 }
            java.lang.String r0 = r6.A00     // Catch:{ all -> 0x0101 }
            r5.append(r0)     // Catch:{ all -> 0x0101 }
            java.lang.String r0 = r5.toString()     // Catch:{ all -> 0x0101 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0101 }
            r11.close()     // Catch:{ all -> 0x010b }
            r12.close()     // Catch:{ all -> 0x01ae }
            goto L_0x018a
        L_0x00fe:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x0101 }
            throw r0     // Catch:{ all -> 0x0101 }
        L_0x0101:
            r1 = move-exception
            r11.close()     // Catch:{ all -> 0x0106 }
            goto L_0x010a
        L_0x0106:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ all -> 0x010b }
        L_0x010a:
            throw r1     // Catch:{ all -> 0x010b }
        L_0x010b:
            r1 = move-exception
            r12.close()     // Catch:{ all -> 0x0198 }
            goto L_0x019c
        L_0x0111:
            X.1TA r5 = r2.A05     // Catch:{ all -> 0x01ae }
            X.2Q4 r0 = r1.A0E     // Catch:{ all -> 0x01ae }
            r5.A06(r0)     // Catch:{ all -> 0x01ae }
            goto L_0x018a
        L_0x0119:
            boolean r5 = r1.A0H     // Catch:{ all -> 0x01ae }
            if (r5 == 0) goto L_0x019e
            X.1TA r11 = r2.A05     // Catch:{ all -> 0x01ae }
            X.4cT r5 = r1.A09()     // Catch:{ all -> 0x01ae }
            java.lang.String r9 = r5.A02     // Catch:{ all -> 0x01ae }
            X.1Cd r5 = r11.A01     // Catch:{ all -> 0x01ae }
            X.1au r10 = r5.A05()     // Catch:{ all -> 0x01ae }
            r5 = r10
            X.1av r5 = (X.C28801av) r5     // Catch:{ all -> 0x0193 }
            X.1Ev r8 = r5.A02     // Catch:{ all -> 0x0193 }
            java.lang.String r7 = "joinable_call_log"
            java.lang.String r6 = "call_id = ?"
            java.lang.String[] r5 = new java.lang.String[r0]     // Catch:{ all -> 0x0193 }
            r5[r3] = r9     // Catch:{ all -> 0x0193 }
            java.lang.String r0 = "joinable_call_log_store/DELETE_CALL_LOG"
            r8.A04(r7, r6, r0, r5)     // Catch:{ all -> 0x0193 }
            X.00H r0 = r11.A00     // Catch:{ all -> 0x0193 }
            java.lang.Object r8 = r0.get()     // Catch:{ all -> 0x0193 }
            X.2ig r8 = (X.C57192ig) r8     // Catch:{ all -> 0x0193 }
            java.util.HashMap r5 = r8.A00     // Catch:{ all -> 0x0193 }
            monitor-enter(r5)     // Catch:{ all -> 0x0193 }
            java.lang.Object r7 = r5.remove(r9)     // Catch:{ all -> 0x0190 }
            X.2Q4 r7 = (X.AnonymousClass2Q4) r7     // Catch:{ all -> 0x0190 }
            r6 = 0
            r5.put(r9, r6)     // Catch:{ all -> 0x018e }
            monitor-exit(r5)     // Catch:{ all -> 0x0190 }
            if (r7 == 0) goto L_0x016d
            com.whatsapp.jid.GroupJid r0 = r7.A02     // Catch:{ all -> 0x0193 }
            if (r0 == 0) goto L_0x016d
            java.util.HashMap r5 = r8.A01     // Catch:{ all -> 0x0193 }
            monitor-enter(r5)     // Catch:{ all -> 0x0193 }
            com.whatsapp.jid.GroupJid r0 = r7.A02     // Catch:{ all -> 0x016a }
            r5.remove(r0)     // Catch:{ all -> 0x016a }
            com.whatsapp.jid.GroupJid r0 = r7.A02     // Catch:{ all -> 0x016a }
            r5.put(r0, r6)     // Catch:{ all -> 0x0168 }
            monitor-exit(r5)     // Catch:{ all -> 0x016a }
            goto L_0x016d
        L_0x0168:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x016a }
        L_0x016a:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x016a }
            goto L_0x0192
        L_0x016d:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x0193 }
            r5.<init>()     // Catch:{ all -> 0x0193 }
            java.lang.String r0 = "JoinableCallLogStore/deleteCallLog/callId="
            r5.append(r0)     // Catch:{ all -> 0x0193 }
            r5.append(r9)     // Catch:{ all -> 0x0193 }
            java.lang.String r0 = r5.toString()     // Catch:{ all -> 0x0193 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0193 }
            r10.close()     // Catch:{ all -> 0x01ae }
            goto L_0x018a
        L_0x0185:
            java.lang.String r0 = "No update needed"
            X.C17960vV.A0F(r3, r0)     // Catch:{ all -> 0x01ae }
        L_0x018a:
            monitor-enter(r1)     // Catch:{ all -> 0x01ae }
            r1.A0H = r3     // Catch:{ all -> 0x01a8 }
            goto L_0x019d
        L_0x018e:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0190 }
        L_0x0190:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x0190 }
        L_0x0192:
            throw r0     // Catch:{ all -> 0x0193 }
        L_0x0193:
            r1 = move-exception
            r10.close()     // Catch:{ all -> 0x0198 }
            goto L_0x019c
        L_0x0198:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ all -> 0x01ae }
        L_0x019c:
            throw r1     // Catch:{ all -> 0x01ae }
        L_0x019d:
            monitor-exit(r1)     // Catch:{ all -> 0x01ae }
        L_0x019e:
            r13.A00()     // Catch:{ all -> 0x01ae }
            r13.close()     // Catch:{ all -> 0x01b8 }
            r14.close()     // Catch:{ all -> 0x01db }
            goto L_0x01c2
        L_0x01a8:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x01ae }
            goto L_0x01ad
        L_0x01ab:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x01ae }
        L_0x01ad:
            throw r0     // Catch:{ all -> 0x01ae }
        L_0x01ae:
            r1 = move-exception
            r13.close()     // Catch:{ all -> 0x01b3 }
            goto L_0x01b7
        L_0x01b3:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ all -> 0x01b8 }
        L_0x01b7:
            throw r1     // Catch:{ all -> 0x01b8 }
        L_0x01b8:
            r1 = move-exception
            r14.close()     // Catch:{ all -> 0x01bd }
            goto L_0x01c1
        L_0x01bd:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ all -> 0x01db }
        L_0x01c1:
            throw r1     // Catch:{ all -> 0x01db }
        L_0x01c2:
            monitor-exit(r2)
            X.1TE r0 = r4.A00
            r0.A00(r1)
            X.1Q2 r0 = r4.A07
            android.os.Handler r2 = r0.A02
            X.3Bx r0 = new X.3Bx
            r0.<init>(r4, r1, r3)
            r2.post(r0)
            A01(r4, r1)
            return
        L_0x01d8:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x01db }
            throw r0     // Catch:{ all -> 0x01db }
        L_0x01db:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        L_0x01de:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1TD.A02(X.1TD, X.9Bw):void");
    }

    public static void A03(AnonymousClass1TD r2, C89444cT r3) {
        StringBuilder sb = new StringBuilder();
        sb.append("CallsMessageStore/checkIfCallLogAlreadyExists; callLog.key=");
        sb.append(r3);
        Log.i(sb.toString());
        if (r2.A07(r3) != null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("CallsMessageStore/checkIfCallLogAlreadyExists call log already exists for this key=");
            sb2.append(r3);
            throw new IllegalArgumentException(sb2.toString());
        }
    }

    public C178119Bw A04(long j) {
        C178119Bw r0;
        C002100z r1 = this.A00.A01;
        synchronized (r1) {
            r0 = (C178119Bw) r1.A04(Long.valueOf(j));
        }
        return r0;
    }

    public C178119Bw A05(long j) {
        C178119Bw r0;
        AnonymousClass1TE r2 = this.A00;
        C002100z r1 = r2.A01;
        synchronized (r1) {
            r0 = (C178119Bw) r1.A04(Long.valueOf(j));
        }
        if (r0 == null && (r0 = this.A04.A04(j)) != null) {
            r2.A00(r0);
        }
        return r0;
    }

    public C178119Bw A06(C178119Bw r19, C89444cT r20) {
        C178119Bw r5;
        C41851xA BD0;
        C89444cT r8;
        C178119Bw A052;
        ArrayList arrayList;
        C89444cT r2 = r20;
        if (A07(r2) == null) {
            AnonymousClass1TB r6 = this.A04;
            synchronized (r6) {
                r5 = r19;
                C17960vV.A0G(!r5.A05, "Only regular call log is stored here");
                boolean z = false;
                if (r5.A01() != -1) {
                    z = true;
                }
                C17960vV.A0G(z, "CallLog row_id is not set");
                C28791au A053 = r6.A06.A05();
                try {
                    BD0 = A053.BD0();
                    ContentValues A002 = AnonymousClass1TB.A00(r6, r5, r2);
                    ((C28801av) A053).A02.A02(A002, "call_log", "_id = ?", "updateCallLog/UPDATE_CALL_LOG", new String[]{Long.toString(r5.A01())});
                    BD0.A00();
                    r8 = r5.A04;
                    BD0.close();
                    A053.close();
                    A052 = r6.A05(r2);
                } catch (Throwable th) {
                    try {
                        A053.close();
                    } catch (Throwable th2) {
                        AnonymousClass0DT.A00(th, th2);
                    }
                    throw th;
                }
            }
            if (A052 != null) {
                AnonymousClass1TE r0 = this.A00;
                r0.A01(r5);
                r0.A00(A052);
                StringBuilder sb = new StringBuilder();
                sb.append("CallsMessageStore/updateCallLogOnCurrentThread; callLog.key=");
                sb.append(r8);
                sb.append("; callLog.row_id=");
                sb.append(r5.A01());
                sb.append("; callLog.timestamp=");
                sb.append(r5.A01);
                sb.append("; new key=");
                sb.append(r2);
                Log.i(sb.toString());
                if (r5.A0O()) {
                    AnonymousClass1Q6 r7 = this.A08;
                    String A092 = C40811vJ.A09(r8.A02);
                    AnonymousClass1Q7 r9 = r7.A01;
                    synchronized (r9) {
                        C002100z r82 = r9.A01;
                        HashSet hashSet = new HashSet(r82.A06().values());
                        arrayList = new ArrayList();
                        Iterator it = hashSet.iterator();
                        while (it.hasNext()) {
                            AnonymousClass206 r22 = (AnonymousClass206) it.next();
                            AnonymousClass205 r1 = r22.A0v;
                            if (A092.equals(r1.A01)) {
                                arrayList.add(r22);
                                r82.A05(r1);
                            }
                        }
                    }
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        Map map = r7.A02;
                        AnonymousClass205 r12 = ((AnonymousClass206) it2.next()).A0v;
                        map.remove(r12);
                        r7.A00.A0N(r12);
                    }
                }
                ((C31931gM) this.A0E.get()).A01(new C70633Bw(this, A052, 49), 16);
                return A052;
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("CallsMessageStore/updateCallLogOnCurrentThread error on creating new call log for this key=");
            sb2.append(r2);
            throw new IllegalArgumentException(sb2.toString());
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append("CallsMessageStore/updateCallLogOnCurrentThread already exists for this key=");
        sb3.append(r2);
        throw new IllegalArgumentException(sb3.toString());
        throw th;
    }

    public C178119Bw A07(C89444cT r4) {
        C178119Bw r0;
        AnonymousClass1TE r2 = this.A00;
        C002100z r1 = r2.A00;
        synchronized (r1) {
            r0 = (C178119Bw) r1.A04(r4);
        }
        if (r0 == null && (r0 = this.A04.A05(r4)) != null) {
            r2.A00(r0);
        }
        return r0;
    }

    public ArrayList A08(long j) {
        String str;
        Cursor A0A2;
        AnonymousClass1TB r10 = this.A04;
        ArrayList arrayList = new ArrayList();
        long uptimeMillis = SystemClock.uptimeMillis();
        C28781at A042 = r10.A06.get();
        try {
            C23141Ev r9 = ((C28801av) A042).A02;
            boolean A052 = C18020vd.A05(C18040vf.A02, r10.A07, 6136);
            StringBuilder sb = new StringBuilder();
            sb.append("SELECT _id, call_id, jid_row_id, from_me, transaction_id, timestamp, video_call, duration, call_result, is_dnd_mode_on, bytes_transferred, call_log.group_jid_row_id, is_joinable_group_call, call_creator_device_jid_row_id, call_random_id, call_type, offer_silence_reason, scheduled_id FROM call_log WHERE call_result = 2 AND from_me = 0 AND timestamp >= ?");
            if (A052) {
                str = " ORDER BY timestamp DESC";
            } else {
                str = " ORDER BY call_log._id DESC";
            }
            sb.append(str);
            sb.append(" LIMIT 100");
            Cursor A0A3 = r9.A0A(sb.toString(), "GET_MISSED_CALL_LOG_SQL", new String[]{Long.toString(j)});
            try {
                int columnIndexOrThrow = A0A3.getColumnIndexOrThrow("_id");
                if (A0A3.moveToLast()) {
                    do {
                        A0A2 = r9.A0A("SELECT _id, jid_row_id, call_result FROM call_log_participant_v2 WHERE call_log_row_id = ? ORDER BY _id", "GET_CALL_LOG_PARTICIPANTS_BY_CALL_LOG_MISSED_CALLS", new String[]{Long.toString(A0A3.getLong(columnIndexOrThrow))});
                        C178119Bw A012 = AnonymousClass1TB.A01(A0A3, A0A2, r10);
                        if (A012 != null) {
                            arrayList.add(A012);
                        }
                        if (A0A2 != null) {
                            A0A2.close();
                        }
                    } while (A0A3.moveToPrevious());
                }
                A0A3.close();
                A042.close();
                r10.A03.A01("CallLogStore/getMissedCalls", SystemClock.uptimeMillis() - uptimeMillis);
                StringBuilder sb2 = new StringBuilder();
                sb2.append("CallLogStore/getMissedCalls/size:");
                sb2.append(arrayList.size());
                Log.i(sb2.toString());
                ArrayList arrayList2 = new ArrayList(arrayList);
                StringBuilder sb3 = new StringBuilder();
                sb3.append("CallsMessageStore/getMissedCalls/size:");
                sb3.append(arrayList2.size());
                Log.i(sb3.toString());
                return arrayList2;
            } catch (Throwable th) {
                if (A0A3 != null) {
                    A0A3.close();
                }
                throw th;
            }
            throw th;
        } catch (Throwable th2) {
            try {
                A042.close();
                throw th2;
            } catch (Throwable th3) {
                AnonymousClass0DT.A00(th2, th3);
                throw th2;
            }
        }
    }

    public ArrayList A09(C72163Kw r17, int i, int i2) {
        String str;
        Cursor A0A2;
        ArrayList arrayList = new ArrayList();
        try {
            AnonymousClass1TB r11 = this.A04;
            ArrayList arrayList2 = new ArrayList();
            String[] strArr = {Integer.toString(i), Integer.toString(i2)};
            long uptimeMillis = SystemClock.uptimeMillis();
            C28781at A042 = r11.A06.get();
            try {
                C23141Ev r9 = ((C28801av) A042).A02;
                boolean A052 = C18020vd.A05(C18040vf.A02, r11.A07, 6136);
                StringBuilder sb = new StringBuilder();
                sb.append("SELECT call_log._id, call_log.call_id, call_log.jid_row_id, from_me, transaction_id, timestamp, video_call, duration, call_log.call_result, is_dnd_mode_on, bytes_transferred, call_log.group_jid_row_id, is_joinable_group_call, call_creator_device_jid_row_id, call_random_id, call_type, offer_silence_reason, scheduled_id, joinable_call_log.call_log_row_id, joinable_video_call, call_link._id AS call_link_id, token, creator_jid_row_id FROM call_log LEFT JOIN joinable_call_log ON joinable_call_log.call_log_row_id = call_log._id LEFT JOIN call_link ON call_link._id = call_link_row_id");
                if (A052) {
                    str = " ORDER BY timestamp DESC LIMIT ?,?";
                } else {
                    str = " ORDER BY call_log._id DESC LIMIT ?,?";
                }
                sb.append(str);
                Cursor A0A3 = r9.A0A(sb.toString(), "GET_CALL_LOG_SQL", strArr);
                try {
                    int columnIndexOrThrow = A0A3.getColumnIndexOrThrow("_id");
                    while (A0A3.moveToNext() && (r17 == null || !r17.CMS())) {
                        A0A2 = r9.A0A("SELECT _id, jid_row_id, call_result FROM call_log_participant_v2 WHERE call_log_row_id = ? ORDER BY _id", "GET_CALL_LOG_PARTICIPANTS_BY_CALL_LOG_GET_CALLS", new String[]{Long.toString(A0A3.getLong(columnIndexOrThrow))});
                        C178119Bw A012 = AnonymousClass1TB.A01(A0A3, A0A2, r11);
                        if (A012 != null) {
                            arrayList2.add(A012);
                        }
                        if (A0A2 != null) {
                            A0A2.close();
                        }
                    }
                    A0A3.close();
                    A042.close();
                    r11.A03.A01("CallLogStore/getCalls", SystemClock.uptimeMillis() - uptimeMillis);
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("CallLogStore/getCalls/size=");
                    sb2.append(arrayList2.size());
                    Log.i(sb2.toString());
                    arrayList.addAll(arrayList2);
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("CallsMessageStore/calls/size:");
                    sb3.append(arrayList.size());
                    Log.i(sb3.toString());
                    return arrayList;
                } catch (Throwable th) {
                    if (A0A3 != null) {
                        A0A3.close();
                    }
                    throw th;
                }
                throw th;
            } catch (Throwable th2) {
                A042.close();
                throw th2;
            }
        } catch (SQLiteException e) {
            Log.e("CallsMessageStore/getCalls/db/unavailable", e);
            return arrayList;
        } catch (Throwable th3) {
            AnonymousClass0DT.A00(th2, th3);
        }
    }

    public void A0A(C178119Bw r4) {
        StringBuilder sb = new StringBuilder();
        sb.append("CallsMessageStore/updateCallLog; callLog.key=");
        sb.append(r4.A04);
        sb.append("; callLog.row_id=");
        sb.append(r4.A01());
        sb.append("; callLog.timestamp=");
        sb.append(r4.A01);
        Log.i(sb.toString());
        ((C31931gM) this.A0E.get()).A01(new AnonymousClass3Bx(this, r4, 1), 16);
    }

    public void A0C(Collection collection) {
        StringBuilder sb = new StringBuilder();
        sb.append("CallsMessageStore/deleteCallLogs ");
        sb.append(collection.size());
        Log.i(sb.toString());
        ((C31931gM) this.A0E.get()).A01(new C70633Bw(this, collection, 48), 17);
    }

    public void A0B(C178119Bw r4) {
        C17960vV.A01();
        StringBuilder sb = new StringBuilder();
        sb.append("CallsMessageStore/updateCallLogOnCurrentThread; callLog.key=");
        sb.append(r4.A04);
        sb.append("; callLog.row_id=");
        sb.append(r4.A01());
        sb.append("; callLog.timestamp=");
        sb.append(r4.A01);
        Log.i(sb.toString());
        A02(this, r4);
    }
}
