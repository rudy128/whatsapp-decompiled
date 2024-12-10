package X;

import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.util.Pair;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.jobqueue.job.SendReadReceiptJob;
import com.whatsapp.util.Log;
import java.util.AbstractCollection;
import java.util.AbstractList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.1N9  reason: invalid class name */
public class AnonymousClass1N9 implements C201511a {
    public final AnonymousClass190 A00;
    public final C25001Mm A01;
    public final AnonymousClass1N3 A02;
    public final AnonymousClass1N8 A03;
    public final C18030ve A04;
    public final AnonymousClass1N5 A05;
    public final AtomicInteger A06 = new AtomicInteger(0);
    public final C25111Mx A07;
    public final AnonymousClass1N7 A08;
    public final AnonymousClass10I A09;
    public final AnonymousClass00H A0A;
    public final AnonymousClass00H A0B;

    public static Message A00(AnonymousClass190 r8, C18030ve r9, AnonymousClass206 r10, int i) {
        long j = r10.A10;
        C63902ts.A07(r8, r9, "message", "receipt", r10.A0v.A01, j, true);
        return Message.obtain((Handler) null, 0, 9, i, r10);
    }

    public static C60132nR A01(AnonymousClass206 r5, String str, String str2) {
        AnonymousClass205 r4 = r5.A0v;
        Pair A052 = C20133A8t.A05(r5.A13, r4.A00, r5.A0H());
        C58762lD r2 = new C58762lD();
        r2.A06 = "message";
        r2.A08 = r4.A01;
        r2.A00 = r5.A10;
        r2.A02 = (Jid) A052.first;
        r2.A01 = (Jid) A052.second;
        r2.A09 = str;
        if (!TextUtils.isEmpty(str2)) {
            r2.A01(str2);
        }
        return r2.A00();
    }

    public static void A02(Message message, AnonymousClass1N9 r2) {
        ((AnonymousClass1OZ) r2.A0B.get()).A0M(message);
    }

    private void A03(AnonymousClass206 r4) {
        AnonymousClass205 r1 = r4.A0v;
        if (C22971Dz.A0a(r1.A00)) {
            if (!r1.A02) {
                if (!C18020vd.A05(C18040vf.A02, this.A04, 11658)) {
                    return;
                }
            } else {
                return;
            }
        } else if (!this.A05.A06(r4)) {
            return;
        } else {
            if (r4.A0D() != 17) {
                ((C31931gM) this.A0A.get()).A01(new C70643By(this, r4, 38), 43);
                return;
            }
        }
        A0A(r4);
    }

    private boolean A04(AnonymousClass206 r8) {
        AnonymousClass205 r2 = r8.A0v;
        AnonymousClass1BI r3 = r2.A00;
        if (r3 == null || !r3.equals(r8.A0H())) {
            return false;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("ReadReceipts/generateReceiptGroups key=");
        sb.append(r2);
        sb.append(" participant=");
        sb.append(r8.A0H());
        sb.append(" type=");
        int i = r8.A0u;
        sb.append(i);
        Log.w(sb.toString());
        AnonymousClass190 r5 = this.A00;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("type=");
        sb2.append(i);
        String obj = sb2.toString();
        StringBuilder sb3 = new StringBuilder();
        sb3.append("jidType=");
        sb3.append(r3.getType());
        String obj2 = sb3.toString();
        AnonymousClass192 r52 = (AnonymousClass192) r5;
        ConcurrentHashMap concurrentHashMap = r52.A0D;
        if (!concurrentHashMap.containsKey("dropping_malformed_outgoing_read_receipt")) {
            concurrentHashMap.put("dropping_malformed_outgoing_read_receipt", true);
            r52.A0H("dropping_malformed_outgoing_read_receipt", obj, false, obj2);
            return true;
        }
        StringBuilder sb4 = new StringBuilder();
        sb4.append("CrashLogsImpl/reportCriticalEventOnce ");
        sb4.append("dropping_malformed_outgoing_read_receipt");
        sb4.append(" is already reported, ignoring");
        Log.w(sb4.toString());
        return true;
    }

    public static boolean A06(AnonymousClass206 r2) {
        int A0D;
        int i;
        if ((r2 instanceof C445623x) || (r2 instanceof AnonymousClass212) || (r2 instanceof AnonymousClass22M) || (A0D = r2.A0D()) == 16 || A0D == 6 || AnonymousClass25A.A0p(r2) || (i = r2.A0u) == 19 || i == 21 || C20133A8t.A0A(r2) || A05(r2)) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x007a, code lost:
        if (X.C22971Dz.A0V(r4) != false) goto L_0x007c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.HashMap A07(java.util.Collection r9) {
        /*
            r8 = this;
            java.util.HashMap r3 = new java.util.HashMap
            r3.<init>()
            java.util.Iterator r7 = r9.iterator()
        L_0x0009:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x0099
            java.lang.Object r6 = r7.next()
            X.206 r6 = (X.AnonymousClass206) r6
            int r2 = r6.A0u
            r0 = 19
            if (r2 != r0) goto L_0x0032
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "ReadReceipts/generateReceiptGroups skip read receipt for hsm rejection message. key="
            r1.append(r0)
            X.205 r0 = r6.A0v
            r1.append(r0)
        L_0x002a:
            java.lang.String r0 = r1.toString()
        L_0x002e:
            com.whatsapp.util.Log.i((java.lang.String) r0)
            goto L_0x0009
        L_0x0032:
            r0 = 21
            if (r2 != r0) goto L_0x0039
            java.lang.String r0 = "ReadReceipts/generateReceiptGroups skip sending read-receipt for payment request declined message."
            goto L_0x002e
        L_0x0039:
            X.205 r5 = r6.A0v
            X.1BI r4 = r5.A00
            boolean r0 = X.C22971Dz.A0S(r4)
            if (r0 != 0) goto L_0x0009
            X.1BI r0 = r6.A0K
            boolean r0 = X.C22971Dz.A0S(r0)
            if (r0 != 0) goto L_0x0009
            boolean r0 = A06(r6)
            if (r0 != 0) goto L_0x0067
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "ReadReceipts/generateReceiptGroups skip sending read-receipt for "
            r1.append(r0)
            r1.append(r5)
            java.lang.String r0 = " type="
            r1.append(r0)
            r1.append(r2)
            goto L_0x002a
        L_0x0067:
            boolean r0 = r8.A04(r6)
            if (r0 != 0) goto L_0x0009
            X.1BI r2 = r6.A0H()
            boolean r0 = r6 instanceof X.AnonymousClass212
            if (r0 != 0) goto L_0x007c
            boolean r0 = X.C22971Dz.A0V(r4)
            r1 = 0
            if (r0 == 0) goto L_0x007d
        L_0x007c:
            r1 = 1
        L_0x007d:
            X.2kt r0 = new X.2kt
            r0.<init>(r4, r2, r1)
            java.lang.Object r1 = r3.get(r0)
            java.util.AbstractCollection r1 = (java.util.AbstractCollection) r1
            if (r1 != 0) goto L_0x0092
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r3.put(r0, r1)
        L_0x0092:
            java.lang.String r0 = r5.A01
            r1.add(r0)
            goto L_0x0009
        L_0x0099:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1N9.A07(java.util.Collection):java.util.HashMap");
    }

    /* JADX WARNING: Removed duplicated region for block: B:35:0x00c2  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00d6  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A08(X.AnonymousClass206 r9) {
        /*
            r8 = this;
            int r1 = r9.A0u
            r0 = 31
            r7 = 0
            if (r1 != r0) goto L_0x000b
            r8.A0C(r9, r7)
        L_0x000a:
            return
        L_0x000b:
            X.1BI r6 = r9.A0H()
            r1 = r6
            if (r6 != 0) goto L_0x0016
            X.205 r0 = r9.A0v
            X.1BI r6 = r0.A00
        L_0x0016:
            boolean r0 = X.C22971Dz.A0Z(r1)
            if (r0 != 0) goto L_0x004a
            boolean r0 = r9.A0p
            if (r0 != 0) goto L_0x004a
            boolean r0 = r9.A0w()
            if (r0 != 0) goto L_0x004a
            int r1 = r9.A0D()
            r0 = 6
            if (r1 == r0) goto L_0x004a
            boolean r0 = A05(r9)
            if (r0 == 0) goto L_0x0070
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "ReadReceipts/acknowledgeMessageIfNeeded ignoring bot response key="
            r1.append(r0)
            X.205 r0 = r9.A0v
            r1.append(r0)
        L_0x0042:
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            return
        L_0x004a:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "ReadReceipts/acknowledgeMessageIfNeeded ignoring key="
            r1.append(r0)
            X.205 r0 = r9.A0v
            r1.append(r0)
            java.lang.String r0 = " status="
            r1.append(r0)
            int r0 = r9.A0D()
            r1.append(r0)
            java.lang.String r0 = " isSendRetryReceipt="
            r1.append(r0)
            boolean r0 = r9.A0p
            r1.append(r0)
            goto L_0x0042
        L_0x0070:
            X.1Mx r5 = r8.A07
            r0 = 0
            X.C18070vi.A0d(r6, r0)
            X.0ve r2 = r5.A04
            r1 = 6163(0x1813, float:8.636E-42)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 == 0) goto L_0x0119
            boolean r0 = X.C22971Dz.A0d(r6)
            if (r0 == 0) goto L_0x0119
            r1 = r6
            com.whatsapp.jid.UserJid r1 = (com.whatsapp.jid.UserJid) r1
            boolean r0 = X.C22971Dz.A0S(r1)
            if (r0 != 0) goto L_0x0119
            boolean r0 = X.C22971Dz.A0M(r1)
            if (r0 != 0) goto L_0x0119
            X.2dk r0 = X.C25111Mx.A01(r5, r1)
            if (r0 == 0) goto L_0x0117
            java.lang.Integer r1 = r0.A01
            java.lang.Integer r0 = X.AnonymousClass00R.A00
            if (r1 != r0) goto L_0x0119
            X.0vl r0 = r5.A06
            java.lang.Object r4 = r0.getValue()
            X.C18070vi.A0X(r4)
            java.util.Map r4 = (java.util.Map) r4
            java.lang.Integer r3 = X.AnonymousClass00R.A01
            X.11P r0 = r5.A02
            long r1 = r0.A05()
            X.2dk r0 = new X.2dk
            r0.<init>(r5, r3, r1)
            r4.put(r6, r0)
            r2 = 2
        L_0x00bf:
            r5 = 1
            if (r2 != 0) goto L_0x00ce
            java.lang.String r0 = "ReadReceipts/acknowledgeMessageIfNeeded Privacy token decision not computed"
            com.whatsapp.util.Log.w((java.lang.String) r0)
            X.190 r1 = r8.A00
            java.lang.String r0 = "ReadReceipts/PrivacyTokenDecisionNotComputed"
            r1.A0G(r0, r7, r5)
        L_0x00ce:
            int r1 = r9.A0D()
            r0 = 13
            if (r1 != r0) goto L_0x0121
            X.1N5 r1 = r8.A05
            X.205 r0 = r9.A0v
            X.1BI r0 = r0.A00
            boolean r0 = r1.A03(r0)
            if (r0 == 0) goto L_0x0121
            long r3 = r9.A0I
            r6 = 1415214000000(0x1498153e780, double:6.992086189136E-312)
            int r0 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r0 < 0) goto L_0x0121
            boolean r0 = X.AnonymousClass25A.A0p(r9)
            if (r0 != 0) goto L_0x0121
            boolean r0 = r9.A19
            if (r0 != 0) goto L_0x0121
            boolean r0 = r9.A1B
            if (r0 == 0) goto L_0x011b
            boolean r0 = r1.A06(r9)
            if (r0 != 0) goto L_0x0115
            X.0ve r1 = r8.A04
            X.190 r0 = r8.A00
            android.os.Message r0 = A00(r0, r1, r9, r2)
            A02(r0, r8)
        L_0x010c:
            r0 = 0
            r9.A1B = r0
            if (r5 == 0) goto L_0x011b
            r8.A09(r9)
            return
        L_0x0115:
            r5 = 0
            goto L_0x010c
        L_0x0117:
            r2 = 0
            goto L_0x00bf
        L_0x0119:
            r2 = 1
            goto L_0x00bf
        L_0x011b:
            boolean r0 = r8.A0I(r9, r2)
            if (r0 != 0) goto L_0x000a
        L_0x0121:
            X.0ve r1 = r8.A04
            X.190 r0 = r8.A00
            android.os.Message r0 = A00(r0, r1, r9, r2)
            A02(r0, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1N9.A08(X.206):void");
    }

    public void A0A(AnonymousClass206 r4) {
        if (!(r4 instanceof AnonymousClass212) && !r4.A0w()) {
            r4.A0a(16);
            this.A09.CGF(new C70643By(this, r4, 39));
        }
    }

    public void A0D(C63362sw r7) {
        String str;
        if (r7.A0U) {
            StringBuilder sb = new StringBuilder();
            sb.append("ReadReceipts/acknowledgeMessageIfNeeded ignoring because retry id=");
            sb.append(r7.A0h);
            Log.i(sb.toString());
            return;
        }
        AnonymousClass206 r0 = r7.A0A;
        if (r0 != null) {
            A08(r0);
            return;
        }
        if (C20133A8t.A0E(r7)) {
            str = "group-invisible-hello";
        } else if (C20133A8t.A0F(r7)) {
            str = "status-invisible-hello";
        } else {
            C18030ve r5 = this.A04;
            AnonymousClass190 r4 = this.A00;
            AnonymousClass210 r1 = new AnonymousClass210(r7.A0B, r7.A0X);
            r7.A09(r1);
            A02(A00(r4, r5, r1, 1), this);
            return;
        }
        A0F(r7, str, (String) null);
    }

    public void A0F(C63362sw r4, String str, String str2) {
        if (str != null) {
            C60132nR A072 = r4.A07(str2);
            A02(C63902ts.A02(this.A00, this.A04, A072), this);
        }
    }

    public void A0G(Collection collection) {
        long max;
        C25001Mm r2;
        SendReadReceiptJob sendReadReceiptJob;
        Collection<AnonymousClass206> collection2 = collection;
        A0H(A07(collection2));
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        for (AnonymousClass206 r3 : collection2) {
            if (this.A05.A06(r3)) {
                if (r3.A0D() == 17) {
                    A0A(r3);
                } else {
                    if (A05(r3) && r3.A0D() != 16) {
                        if (C42701yb.A01(r3.A0I())) {
                            AnonymousClass205 r7 = r3.A0v;
                            AnonymousClass1BI r13 = r7.A00;
                            if (!C42701yb.A01(r13)) {
                                if (C22971Dz.A0e(r13)) {
                                    r2 = this.A01;
                                    sendReadReceiptJob = new SendReadReceiptJob(r13, r3.A0H(), (AnonymousClass1BI) null, (DeviceJid) null, new String[]{r7.A01}, r3.A0I, r3.A10, true);
                                } else if (!C42701yb.A01(r13) && C22971Dz.A0d(r13)) {
                                    r2 = this.A01;
                                    sendReadReceiptJob = new SendReadReceiptJob(r3.A0H(), (AnonymousClass1BI) null, r13, (DeviceJid) null, new String[]{r7.A01}, r3.A0I, r3.A10, true);
                                }
                                r2.A01(sendReadReceiptJob);
                            }
                        }
                        A0A(r3);
                    }
                    AnonymousClass1BI r10 = r3.A0v.A00;
                    if (C22971Dz.A0a(r10)) {
                        AnonymousClass1BI A0H = r3.A0H();
                        if (C22971Dz.A0Y(A0H)) {
                            Number number = (Number) hashMap2.get(A0H);
                            if (number == null) {
                                max = r3.A0y;
                            } else {
                                max = Math.max(number.longValue(), r3.A0y);
                            }
                            hashMap2.put(A0H, Long.valueOf(max));
                        }
                    } else {
                        AnonymousClass206 r9 = (AnonymousClass206) hashMap.get(r10);
                        if (r9 != null && r9.A0y > r3.A0y) {
                            r3 = r9;
                        }
                        hashMap.put(r10, r3);
                    }
                }
            }
        }
        ((C31931gM) this.A0A.get()).A01(new AnonymousClass7R0(this, hashMap, hashMap2, 37), 43);
    }

    public void A0H(HashMap hashMap) {
        for (Map.Entry entry : hashMap.entrySet()) {
            int size = ((AbstractCollection) entry.getValue()).size();
            int i = 0;
            while (i < size) {
                int min = Math.min(i + 256, size);
                String[] strArr = (String[]) ((AbstractList) entry.getValue()).subList(i, min).toArray(new String[0]);
                AnonymousClass1BI r11 = ((C58562kt) entry.getKey()).A00;
                if (C42701yb.A02(r11.user) && C22971Dz.A0X(r11)) {
                    if (C18020vd.A05(C18040vf.A02, this.A04, 11965)) {
                        C22941Dw r0 = UserJid.Companion;
                        r11 = C22971Dz.A04(C22941Dw.A01(r11));
                    }
                }
                this.A01.A01(new SendReadReceiptJob(r11, ((C58562kt) entry.getKey()).A01, (AnonymousClass1BI) null, (DeviceJid) null, strArr, -1, 0, ((C58562kt) entry.getKey()).A02));
                i = min;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x001a, code lost:
        if (X.C22971Dz.A0Z(r1.A0H()) != false) goto L_0x001c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A0I(X.AnonymousClass206 r22, int r23) {
        /*
            r21 = this;
            r1 = r22
            boolean r0 = A06(r1)
            r2 = r21
            if (r0 == 0) goto L_0x0079
            X.205 r4 = r1.A0v
            boolean r0 = r1 instanceof X.AnonymousClass212
            if (r0 != 0) goto L_0x001c
            X.1BI r0 = r1.A0H()
            boolean r0 = X.C22971Dz.A0Z(r0)
            r17 = 0
            if (r0 == 0) goto L_0x001e
        L_0x001c:
            r17 = 1
        L_0x001e:
            X.1N5 r8 = r2.A05
            X.1BI r9 = r4.A00
            X.C17960vV.A07(r9)
            r3 = 1
            java.lang.String[] r7 = new java.lang.String[r3]
            java.lang.String r6 = r4.A01
            r0 = 0
            r7[r0] = r6
            long r4 = r1.A0I
            java.lang.Throwable r10 = new java.lang.Throwable
            r10.<init>()
            r11 = r7
            r12 = r4
            r14 = r17
            boolean r4 = r8.A05(r9, r10, r11, r12, r14)
            if (r4 == 0) goto L_0x0079
            X.C17960vV.A07(r9)
            X.1BI r10 = r1.A0H()
            com.whatsapp.jid.DeviceJid r11 = r1.A13
            java.lang.String[] r13 = new java.lang.String[r3]
            r13[r0] = r6
            long r15 = r1.A10
            r12 = 0
            r14 = r23
            X.2gc r7 = r8.A01(r9, r10, r11, r12, r13, r14, r15, r17)
            X.0ve r14 = r2.A04
            X.190 r13 = r2.A00
            long r4 = r7.A01
            X.205 r6 = r7.A06
            java.lang.String r6 = r6.A01
            java.lang.String r15 = "message"
            java.lang.String r16 = "read-receipt"
            r20 = r3
            r17 = r6
            r18 = r4
            X.C63902ts.A07(r13, r14, r15, r16, r17, r18, r20)
            r3 = 419(0x1a3, float:5.87E-43)
            android.os.Message r0 = android.os.Message.obtain(r12, r0, r3, r0, r7)
            A02(r0, r2)
            r0 = 1
        L_0x0075:
            r2.A03(r1)
            return r0
        L_0x0079:
            r0 = 0
            goto L_0x0075
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1N9.A0I(X.206, int):boolean");
    }

    public AnonymousClass1N9(AnonymousClass190 r3, C25001Mm r4, C25111Mx r5, AnonymousClass1N3 r6, AnonymousClass1N8 r7, C18030ve r8, AnonymousClass1N5 r9, AnonymousClass1N7 r10, AnonymousClass10I r11, AnonymousClass00H r12, AnonymousClass00H r13) {
        this.A04 = r8;
        this.A00 = r3;
        this.A09 = r11;
        this.A01 = r4;
        this.A0B = r12;
        this.A02 = r6;
        this.A05 = r9;
        this.A0A = r13;
        this.A08 = r10;
        this.A07 = r5;
        this.A03 = r7;
    }

    public static boolean A05(AnonymousClass206 r1) {
        if (!C42701yb.A01(r1.A0I())) {
            return false;
        }
        AnonymousClass1BI r12 = r1.A0v.A00;
        if (C42701yb.A01(r12)) {
            return false;
        }
        if (C22971Dz.A0d(r12) || C22971Dz.A0e(r12)) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x002e, code lost:
        if (X.C22971Dz.A0Z(r4) != false) goto L_0x0030;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A09(X.AnonymousClass206 r14) {
        /*
            r13 = this;
            boolean r0 = A06(r14)
            if (r0 == 0) goto L_0x003c
            boolean r0 = r13.A04(r14)
            if (r0 != 0) goto L_0x003c
            X.205 r2 = r14.A0v
            X.1Mm r1 = r13.A01
            X.1BI r3 = r2.A00
            X.C17960vV.A07(r3)
            X.1BI r4 = r14.A0H()
            com.whatsapp.jid.DeviceJid r6 = r14.A13
            r0 = 1
            java.lang.String[] r7 = new java.lang.String[r0]
            java.lang.String r2 = r2.A01
            r0 = 0
            r7[r0] = r2
            long r8 = r14.A0I
            boolean r0 = r14 instanceof X.AnonymousClass212
            if (r0 != 0) goto L_0x0030
            boolean r0 = X.C22971Dz.A0Z(r4)
            r12 = 0
            if (r0 == 0) goto L_0x0031
        L_0x0030:
            r12 = 1
        L_0x0031:
            long r10 = r14.A10
            r5 = 0
            com.whatsapp.jobqueue.job.SendReadReceiptJob r2 = new com.whatsapp.jobqueue.job.SendReadReceiptJob
            r2.<init>(r3, r4, r5, r6, r7, r8, r10, r12)
            r1.A01(r2)
        L_0x003c:
            r13.A03(r14)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1N9.A09(X.206):void");
    }

    public void A0B(AnonymousClass206 r4, int i) {
        if (r4.A0D() == 6) {
            StringBuilder sb = new StringBuilder();
            sb.append("ReadReceipts/sendNack ignoring key=");
            sb.append(r4.A0v);
            sb.append(" status=");
            sb.append(r4.A0D());
            Log.i(sb.toString());
            return;
        }
        C60132nR A012 = A01(r4, (String) null, String.valueOf(i));
        A02(C63902ts.A02(this.A00, this.A04, A012), this);
    }

    public void A0C(AnonymousClass206 r4, String str) {
        if (r4.A0D() == 6) {
            StringBuilder sb = new StringBuilder();
            sb.append("ReadReceipts/acknowledgeMessageSilent ignoring type=");
            sb.append(str);
            sb.append(" key=");
            sb.append(r4.A0v);
            Log.i(sb.toString());
            return;
        }
        C60132nR A012 = A01(r4, str, (String) null);
        A02(C63902ts.A02(this.A00, this.A04, A012), this);
    }

    public void A0E(C63362sw r4, int i) {
        C60132nR A072 = r4.A07(String.valueOf(i));
        A02(C63902ts.A02(this.A00, this.A04, A072), this);
    }
}
