package X;

import android.os.HandlerThread;
import android.os.Message;
import android.os.SystemClock;
import android.util.SparseIntArray;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.1O4  reason: invalid class name */
public class AnonymousClass1O4 {
    public int A00 = 0;
    public HandlerThread A01;
    public final SparseIntArray A02 = new SparseIntArray();
    public final AnonymousClass190 A03;
    public final AnonymousClass1O2 A04;
    public final C25361Nx A05;
    public final AnonymousClass1O3 A06;
    public final C25381Nz A07;
    public final AnonymousClass1O7 A08;
    public final AnonymousClass1O5 A09 = new AnonymousClass1O6(this);
    public final C200710s A0A;
    public final Object A0B = new Object();
    public final List A0C = new ArrayList();
    public final Map A0D = new HashMap();
    public final Map A0E = new HashMap();

    public static void A00(AnonymousClass1O4 r6, C29621ca r7, String str) {
        String str2;
        AnonymousClass1O5 r3;
        AnonymousClass1O4 r2 = r6;
        synchronized (r6.A0B) {
            str2 = str;
            r3 = (AnonymousClass1O5) r6.A0D.remove(str);
        }
        if (r3 != null) {
            r6.A05.A02(str);
            r6.A0A.execute(new C21456AkN(r2, r3, r7, str2, 34));
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("XmppIncomingMessageRouter/ignoring response due to missing callback for iqId:");
        sb.append(str);
        Log.i(sb.toString());
    }

    public void A02(long j, String str, boolean z) {
        boolean z2 = true;
        boolean z3 = false;
        if (str != null) {
            z3 = true;
        }
        C17960vV.A0C(z3);
        if (j <= 0) {
            z2 = false;
        }
        C17960vV.A0C(z2);
        AnonymousClass1O7 r3 = this.A08;
        boolean z4 = true;
        boolean z5 = false;
        if (str != null) {
            z5 = true;
        }
        C17960vV.A0C(z5);
        if (j <= 0) {
            z4 = false;
        }
        C17960vV.A0C(z4);
        AnonymousClass1O7 r1 = r3.A01.A08;
        r1.sendMessageDelayed(r1.obtainMessage(8, z ? 1 : 0, 0, str), j);
        r3.A00.put(str, str);
    }

    public void A03(Message message, int i) {
        message.what = 1;
        message.arg1 = i;
        this.A08.sendMessage(message);
    }

    public static void A01(AnonymousClass1O4 r6, String str, boolean z) {
        AnonymousClass1O5 r5;
        if (z) {
            r6.A04.A01(str);
        }
        synchronized (r6.A0B) {
            r5 = (AnonymousClass1O5) r6.A0E.remove(str);
            if (r5 == null) {
                r5 = (AnonymousClass1O5) r6.A0D.remove(str);
            }
        }
        C25361Nx r4 = r6.A05;
        r4.A01(AnonymousClass00R.A0N, (Integer) null, str);
        r4.A02(str);
        if (r5 != null) {
            r6.A0A.execute(new C146817Qs(33, str, r5));
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("XmppIncomingMessageRouter/ignoring failure due to missing callback for iqId:");
            sb.append(str);
            Log.i(sb.toString());
        }
        r4.A03(str, (Integer) null);
    }

    /* JADX WARNING: type inference failed for: r2v2, types: [java.lang.Object, X.2gq] */
    public void A04(AnonymousClass1O5 r11, String str, int i, long j, boolean z) {
        String str2;
        synchronized (this.A0B) {
            boolean z2 = true;
            StringBuilder sb = new StringBuilder();
            sb.append("Pending iq-callback for id:");
            sb.append(str);
            C17960vV.A0H(!this.A0D.containsKey(str), sb.toString());
            AnonymousClass1O5 r1 = (AnonymousClass1O5) this.A0E.put(str, r11);
            if (!(r1 == null || r1 == this.A09)) {
                z2 = false;
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Pending request for id:");
            sb2.append(str);
            C17960vV.A0H(z2, sb2.toString());
            if (j > 0) {
                AnonymousClass1O7 r3 = this.A08;
                AnonymousClass1O7 r2 = r3.A01.A08;
                r2.sendMessageDelayed(r2.obtainMessage(4, z ? 1 : 0, 0, str), j);
                r3.A00.put(str, str);
            }
        }
        if (r11 instanceof C33061iC) {
            str2 = ((C33061iC) r11).getName();
        } else {
            str2 = null;
        }
        C25361Nx r32 = this.A05;
        C18070vi.A0d(str, 0);
        ConcurrentHashMap concurrentHashMap = r32.A03;
        if (!concurrentHashMap.containsKey(str)) {
            ? obj = new Object();
            obj.A00 = i;
            obj.A03 = str2;
            obj.A06 = SystemClock.uptimeMillis();
            concurrentHashMap.put(str, obj);
            C222119a A002 = C25361Nx.A00(r32);
            int hashCode = str.hashCode();
            A002.A0E("IqMessagePerfLoggerInterceptor", true, hashCode);
            C25361Nx.A00(r32).A09("iq_type", hashCode, (long) i, false);
            C25361Nx.A00(r32).A02(hashCode, "iq_queue");
            return;
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append("IqPerfLogger/onIqMessageQueued already exists iqId=");
        sb3.append(str);
        sb3.append(" iqSendType=");
        sb3.append(i);
        Log.e(sb3.toString());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0010, code lost:
        if (r2 == r4.A09) goto L_0x0012;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A05(java.lang.String r5) {
        /*
            r4 = this;
            java.lang.Object r3 = r4.A0B
            monitor-enter(r3)
            java.util.Map r0 = r4.A0E     // Catch:{ all -> 0x0018 }
            java.lang.Object r2 = r0.remove(r5)     // Catch:{ all -> 0x0018 }
            X.1O5 r2 = (X.AnonymousClass1O5) r2     // Catch:{ all -> 0x0018 }
            if (r2 == 0) goto L_0x0012
            X.1O5 r1 = r4.A09     // Catch:{ all -> 0x0018 }
            r0 = 0
            if (r2 != r1) goto L_0x0013
        L_0x0012:
            r0 = 1
        L_0x0013:
            X.C17960vV.A0D(r0)     // Catch:{ all -> 0x0018 }
            monitor-exit(r3)     // Catch:{ all -> 0x0018 }
            return
        L_0x0018:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0018 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1O4.A05(java.lang.String):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0012, code lost:
        if (r3.A0D.isEmpty() == false) goto L_0x0014;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A06(boolean r4) {
        /*
            r3 = this;
            java.lang.Object r2 = r3.A0B
            monitor-enter(r2)
            java.util.Map r0 = r3.A0E     // Catch:{ all -> 0x0038 }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x0038 }
            if (r0 == 0) goto L_0x0014
            java.util.Map r0 = r3.A0D     // Catch:{ all -> 0x0038 }
            boolean r1 = r0.isEmpty()     // Catch:{ all -> 0x0038 }
            r0 = 0
            if (r1 != 0) goto L_0x0015
        L_0x0014:
            r0 = 1
        L_0x0015:
            if (r4 != 0) goto L_0x002c
            if (r0 != 0) goto L_0x002c
            r0 = 0
            r3.A00 = r0     // Catch:{ all -> 0x003a }
            X.1O7 r1 = r3.A08     // Catch:{ all -> 0x003a }
            r0 = 4
            r1.removeMessages(r0)     // Catch:{ all -> 0x003a }
            r0 = 8
            r1.removeMessages(r0)     // Catch:{ all -> 0x003a }
            java.util.concurrent.ConcurrentMap r0 = r1.A00     // Catch:{ all -> 0x003a }
            r0.clear()     // Catch:{ all -> 0x003a }
        L_0x002c:
            monitor-exit(r2)     // Catch:{ all -> 0x003a }
            X.1O7 r1 = r3.A08
            r0 = 3
            android.os.Message r0 = r1.obtainMessage(r0)
            r0.sendToTarget()
            return
        L_0x0038:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x003a }
        L_0x003a:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x003a }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1O4.A06(boolean):void");
    }

    public boolean A07(int i) {
        int i2 = this.A02.get(i, -1);
        if (i2 < 0 || i2 >= this.A0C.size()) {
            return false;
        }
        return true;
    }

    public AnonymousClass1O4(AnonymousClass190 r4, AnonymousClass1O2 r5, C25361Nx r6, AnonymousClass1O3 r7, C25381Nz r8, AnonymousClass10I r9) {
        this.A03 = r4;
        this.A05 = r6;
        this.A07 = r8;
        this.A04 = r5;
        this.A06 = r7;
        HandlerThread handlerThread = new HandlerThread("XmppMessageRouter", 1);
        this.A01 = handlerThread;
        handlerThread.start();
        this.A08 = new AnonymousClass1O7(this.A01.getLooper(), this);
        this.A0A = new C200710s(r9, true);
    }

    public boolean A08(C29621ca r8, String str) {
        AnonymousClass1O7 r2;
        AnonymousClass1O5 r0;
        String A0Q = r8.A0Q(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, (String) null);
        if ("result".equals(A0Q)) {
            C25361Nx r6 = this.A05;
            C18070vi.A0d(str, 0);
            C56062gq r5 = (C56062gq) r6.A03.get(str);
            if (r5 != null && r5.A07 == 0) {
                r5.A07 = SystemClock.uptimeMillis();
                C222119a A002 = C25361Nx.A00(r6);
                int hashCode = str.hashCode();
                A002.A01(hashCode, "iq_send");
                C25361Nx.A00(r6).A02(hashCode, "iq_processing_queue");
            }
        } else if ("error".equals(A0Q)) {
            this.A05.A01(AnonymousClass00R.A0C, Integer.valueOf(C60482o6.A00(r8)), str);
        }
        synchronized (this.A0B) {
            r2 = this.A08;
            Object remove = r2.A00.remove(str);
            if (remove != null) {
                r2.removeMessages(4, remove);
            }
            r0 = (AnonymousClass1O5) this.A0D.get(str);
        }
        if (r0 == null) {
            StringBuilder sb = new StringBuilder();
            sb.append("xmppIncomingMessageRouter/handleIqResponse no callback found for id=");
            sb.append(str);
            Log.i(sb.toString());
            return false;
        } else if (r0 instanceof AnonymousClass372) {
            A00(this, r8, str);
            return true;
        } else {
            Message obtainMessage = r2.obtainMessage(2, r8);
            obtainMessage.getData().putString("iqId", str);
            obtainMessage.sendToTarget();
            return true;
        }
    }
}
