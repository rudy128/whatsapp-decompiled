package X;

import android.content.ContentValues;
import android.location.Address;
import android.location.Geocoder;
import android.location.Location;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.Jid;
import com.whatsapp.util.Log;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: X.1RK  reason: invalid class name */
public class AnonymousClass1RK extends AnonymousClass17A implements AnonymousClass1RJ {
    public C59312m6 A00;
    public DeviceJid A01;
    public Comparator A02 = new AnonymousClass3D1(3);
    public boolean A03;
    public final Handler A04 = new Handler(Looper.getMainLooper());
    public final C19880zA A05;
    public final AnonymousClass190 A06;
    public final AnonymousClass1RI A07;
    public final AnonymousClass1RB A08;
    public final AnonymousClass11S A09;
    public final C25851Pw A0A;
    public final AnonymousClass1R8 A0B;
    public final AnonymousClass11P A0C;
    public final AnonymousClass118 A0D;
    public final C19830z4 A0E;
    public final AnonymousClass1P3 A0F;
    public final AnonymousClass1RE A0G;
    public final AnonymousClass1MQ A0H;
    public final C200710s A0I;
    public final AnonymousClass10I A0J;
    public final AnonymousClass00H A0K;
    public final AnonymousClass00H A0L;
    public final Object A0M = new Object();
    public final Set A0N = new HashSet();
    public final AnonymousClass1RG A0O;
    public final AnonymousClass1RH A0P;
    public final C18000vb A0Q;
    public final AnonymousClass00H A0R;
    public final Map A0S = new HashMap();

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass1RK(X.C19880zA r4, X.AnonymousClass190 r5, X.AnonymousClass1RG r6, X.AnonymousClass1RI r7, X.AnonymousClass1RH r8, X.AnonymousClass1RB r9, X.AnonymousClass11S r10, X.C25851Pw r11, X.AnonymousClass1R8 r12, X.AnonymousClass11P r13, X.AnonymousClass118 r14, X.C19830z4 r15, X.C18000vb r16, X.AnonymousClass1P3 r17, X.AnonymousClass1RE r18, X.AnonymousClass1MQ r19, X.AnonymousClass10I r20, X.AnonymousClass00H r21, X.AnonymousClass00H r22, X.AnonymousClass00H r23, X.AnonymousClass00H r24) {
        /*
            r3 = this;
            r1 = 1
            r2 = r24
            X.C18070vi.A0d(r2, r1)
            r0 = 0
            r3.<init>(r2, r0)
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            r3.A0N = r0
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r3.A0M = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r3.A0S = r0
            android.os.Looper r2 = android.os.Looper.getMainLooper()
            android.os.Handler r0 = new android.os.Handler
            r0.<init>(r2)
            r3.A04 = r0
            r2 = 3
            X.3D1 r0 = new X.3D1
            r0.<init>(r2)
            r3.A02 = r0
            r3.A0C = r13
            r3.A0B = r12
            r3.A06 = r5
            r3.A09 = r10
            r3.A0D = r14
            r2 = r20
            r3.A0J = r2
            r0 = r19
            r3.A0H = r0
            r0 = r21
            r3.A0K = r0
            r0 = r22
            r3.A0L = r0
            r0 = r16
            r3.A0Q = r0
            r0 = r23
            r3.A0R = r0
            r0 = r17
            r3.A0F = r0
            r3.A05 = r4
            r3.A0E = r15
            r3.A08 = r9
            r3.A0A = r11
            r3.A0P = r8
            r0 = r18
            r3.A0G = r0
            X.10s r0 = new X.10s
            r0.<init>(r2, r1)
            r3.A0I = r0
            r3.A0O = r6
            r3.A07 = r7
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1RK.<init>(X.0zA, X.190, X.1RG, X.1RI, X.1RH, X.1RB, X.11S, X.1Pw, X.1R8, X.11P, X.118, X.0z4, X.0vb, X.1P3, X.1RE, X.1MQ, X.10I, X.00H, X.00H, X.00H, X.00H):void");
    }

    public C88344Zh A05(int i) {
        if (i > 0 && A0B()) {
            AnonymousClass1IZ it = this.A0H.A04.A00().entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                if (((Jid) entry.getKey()).getDevice() == i) {
                    return (C88344Zh) entry.getValue();
                }
            }
        }
        return null;
    }

    public int[] BSG() {
        return new int[]{213};
    }

    public static void A02(Location location, C88344Zh r12, AnonymousClass1RK r13) {
        C88344Zh r0;
        String str = null;
        try {
            List<Address> fromLocation = new Geocoder(r13.A0D.A00, r13.A0Q.A0N()).getFromLocation(location.getLatitude(), location.getLongitude(), 1);
            if (fromLocation != null) {
                for (Address locality : fromLocation) {
                    str = locality.getLocality();
                    if (!TextUtils.isEmpty(str)) {
                        break;
                    }
                }
            }
        } catch (IOException | IllegalArgumentException unused) {
        }
        if (!TextUtils.isEmpty(str)) {
            AnonymousClass1MQ r02 = r13.A0H;
            DeviceJid deviceJid = r12.A08;
            AnonymousClass1MO r3 = r02.A04;
            ContentValues contentValues = new ContentValues();
            contentValues.put("place_name", str);
            C28791au A062 = r3.A02.A06();
            try {
                ((C28801av) A062).A02.A02(contentValues, "devices", "device_id = ?", "setDevicePlaceName/UPDATE_DEVICES", new String[]{deviceJid.getRawString()});
                synchronized (r3) {
                    C201110w r03 = r3.A00;
                    if (!(r03 == null || (r0 = (C88344Zh) r03.get(deviceJid)) == null)) {
                        r0.A04 = str;
                    }
                }
                A062.close();
                r13.notifyAllObservers(new AnonymousClass35V(r12, 37));
            } catch (Throwable th) {
                try {
                    A062.close();
                    throw th;
                } catch (Throwable th2) {
                    AnonymousClass0DT.A00(th, th2);
                    throw th;
                }
            }
        }
    }

    public static void A03(AnonymousClass1RK r4, String str) {
        synchronized (r4.A0M) {
            C59312m6 r2 = r4.A00;
            if (r2 != null) {
                StringBuilder sb = new StringBuilder();
                sb.append("companion-device-manager/device login canceled: ");
                sb.append(r2.A02.A08);
                Log.i(sb.toString());
                r4.A09(r4.A00.A02.A08, str, true, false);
                r4.A00 = null;
                r4.A03 = false;
            }
        }
    }

    public C21132Af0 A04() {
        C21132Af0 af0 = new C21132Af0();
        if (!A0B()) {
            af0.A0B(false);
            return af0;
        }
        this.A0J.CGD(new AnonymousClass9BR(af0, this, 2), new Void[0]);
        return af0;
    }

    public void A08(C199410f r3, boolean z) {
        boolean z2;
        StringBuilder sb = new StringBuilder();
        sb.append("companion-device-manager/onDeviceRemovedByServer/devices: ");
        sb.append(r3);
        Log.i(sb.toString());
        Iterator it = r3.iterator();
        while (true) {
            if (it.hasNext()) {
                if (C62832s4.A00((Jid) it.next())) {
                    z2 = true;
                    break;
                }
            } else {
                z2 = false;
                break;
            }
        }
        C17960vV.A0F(!z2, "companion-device-manager/hostedDevice present when not supported in build");
        Log.i("companion-device-manager/onDeviceRemovedByServer/removing device locally");
        this.A0I.execute(new C70753Cj(r3, this, z));
    }

    public void A0A(String str, boolean z, boolean z2) {
        StringBuilder sb = new StringBuilder();
        sb.append("companion-device-manager/logoutAllCompanionDevicesAndNotify/remove on error: ");
        boolean z3 = z;
        sb.append(z3);
        sb.append(", removalReason ");
        String str2 = str;
        sb.append(str2);
        sb.append(", isEncryptionTypeTransitioning ");
        sb.append(z2);
        Log.i(sb.toString());
        C199410f keySet = this.A0H.A04.A00().keySet();
        if (keySet.isEmpty()) {
            notifyAllObservers(new AnonymousClass35V(keySet, 38));
            return;
        }
        AnonymousClass37F A012 = A01(keySet, this.A0P.A00((DeviceJid) null, str2), str2, z3, false);
        A012.A00 = keySet;
        AnonymousClass1OZ r10 = A012.A02;
        String A0B2 = r10.A0B();
        String str3 = A012.A03;
        boolean A0N2 = r10.A0N(A012, new C29621ca(new C29621ca("remove-companion-device", new AnonymousClass1MD[]{new AnonymousClass1MD("all", "true"), new AnonymousClass1MD("reason", str3)}), "iq", new AnonymousClass1MD[]{new AnonymousClass1MD((Jid) C173438v4.A00, "to"), new AnonymousClass1MD((String) PublicKeyCredentialControllerUtility.JSON_KEY_ID, A0B2), new AnonymousClass1MD("xmlns", "md"), new AnonymousClass1MD((String) PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "set")}), A0B2, 237, 32000);
        StringBuilder sb2 = new StringBuilder();
        sb2.append("app/sendRemoveAllDevicesRequest success: ");
        sb2.append(str3);
        sb2.append(": ");
        sb2.append(A0N2);
        Log.i(sb2.toString());
        if (!A0N2) {
            A012.A01.BtB(keySet, (String) null, -1);
        }
    }

    public boolean A0B() {
        return ((AnonymousClass1HV) this.A0R.get()).A01.A2S();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x008e, code lost:
        if (r1 != false) goto L_0x0090;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A0C(X.C201110w r12, boolean r13, boolean r14) {
        /*
            r11 = this;
            java.lang.String r0 = "companion-device-manager/refreshDevices"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.1MQ r0 = r11.A0H
            X.10w r2 = r0.A04()
            r9 = r2
            java.lang.Object r6 = r11.A0M
            monitor-enter(r6)
            X.2m6 r0 = r11.A00     // Catch:{ all -> 0x01d3 }
            if (r0 == 0) goto L_0x0025
            java.util.HashMap r1 = new java.util.HashMap     // Catch:{ all -> 0x01d3 }
            r1.<init>(r2)     // Catch:{ all -> 0x01d3 }
            X.2m6 r0 = r11.A00     // Catch:{ all -> 0x01d3 }
            X.4Zh r0 = r0.A02     // Catch:{ all -> 0x01d3 }
            com.whatsapp.jid.DeviceJid r0 = r0.A08     // Catch:{ all -> 0x01d3 }
            r1.remove(r0)     // Catch:{ all -> 0x01d3 }
            X.10w r9 = X.C201110w.copyOf((java.util.Map) r1)     // Catch:{ all -> 0x01d3 }
        L_0x0025:
            monitor-exit(r6)     // Catch:{ all -> 0x01d3 }
            r5 = 1
            r4 = 0
            if (r12 == 0) goto L_0x01c4
            X.1F8 r3 = new X.1F8
            r3.<init>()
            X.10f r0 = r9.entrySet()
            X.1IZ r8 = r0.iterator()
        L_0x0037:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x006f
            java.lang.Object r7 = r8.next()
            java.util.Map$Entry r7 = (java.util.Map.Entry) r7
            java.lang.Object r0 = r7.getKey()
            boolean r0 = r12.containsKey(r0)
            if (r0 == 0) goto L_0x0067
            if (r13 == 0) goto L_0x0037
            java.lang.Object r0 = r7.getKey()
            java.lang.Object r0 = r12.get(r0)
            java.lang.Number r0 = (java.lang.Number) r0
            int r1 = r0.intValue()
            java.lang.Object r0 = r7.getValue()
            X.4Zh r0 = (X.C88344Zh) r0
            int r0 = r0.A05
            if (r1 == r0) goto L_0x0037
        L_0x0067:
            java.lang.Object r0 = r7.getKey()
            r3.add((java.lang.Object) r0)
            goto L_0x0037
        L_0x006f:
            X.10f r7 = r3.build()
            boolean r0 = r7.isEmpty()
            if (r0 != 0) goto L_0x0094
            int r3 = r7.size()
            int r0 = r9.size()
            r1 = 0
            if (r3 != r0) goto L_0x0085
            r1 = 1
        L_0x0085:
            X.11S r0 = r11.A09
            boolean r0 = r0.A0N()
            if (r0 != 0) goto L_0x0090
            r0 = 1
            if (r1 == 0) goto L_0x0091
        L_0x0090:
            r0 = 0
        L_0x0091:
            r11.A08(r7, r0)
        L_0x0094:
            java.util.HashMap r3 = new java.util.HashMap
            r3.<init>()
            X.10f r0 = r12.entrySet()
            X.1IZ r9 = r0.iterator()
        L_0x00a1:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x00ee
            java.lang.Object r8 = r9.next()
            java.util.Map$Entry r8 = (java.util.Map.Entry) r8
            java.lang.Object r1 = r8.getKey()
            X.11S r0 = r11.A09
            r0.A0I()
            X.1E3 r0 = r0.A02
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x00a1
            java.lang.Object r0 = r8.getKey()
            boolean r0 = r2.containsKey(r0)
            if (r0 == 0) goto L_0x00e2
            if (r13 == 0) goto L_0x00a1
            java.lang.Object r0 = r8.getKey()
            java.lang.Object r0 = r2.get(r0)
            X.4Zh r0 = (X.C88344Zh) r0
            int r1 = r0.A05
            java.lang.Object r0 = r8.getValue()
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            if (r1 == r0) goto L_0x00a1
        L_0x00e2:
            java.lang.Object r1 = r8.getKey()
            java.lang.Object r0 = r8.getValue()
            r3.put(r1, r0)
            goto L_0x00a1
        L_0x00ee:
            boolean r0 = r3.isEmpty()
            if (r0 != 0) goto L_0x01bd
            java.util.Set r0 = r3.entrySet()
            java.util.Iterator r10 = r0.iterator()
        L_0x00fc:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x01bd
            java.lang.Object r8 = r10.next()
            java.util.Map$Entry r8 = (java.util.Map.Entry) r8
            monitor-enter(r6)
            X.2m6 r0 = r11.A00     // Catch:{ all -> 0x01ba }
            if (r0 == 0) goto L_0x011e
            X.4Zh r0 = r0.A02     // Catch:{ all -> 0x01ba }
            com.whatsapp.jid.DeviceJid r1 = r0.A08     // Catch:{ all -> 0x01ba }
            java.lang.Object r0 = r8.getKey()     // Catch:{ all -> 0x01ba }
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x01ba }
            if (r0 == 0) goto L_0x011e
            if (r14 == 0) goto L_0x01b7
            goto L_0x015b
        L_0x011e:
            X.11S r0 = r11.A09     // Catch:{ all -> 0x01ba }
            boolean r0 = r0.A0N()     // Catch:{ all -> 0x01ba }
            if (r0 == 0) goto L_0x0131
            X.10s r2 = r11.A0I     // Catch:{ all -> 0x01ba }
            r0 = 13
            X.3Ch r1 = new X.3Ch     // Catch:{ all -> 0x01ba }
            r1.<init>(r11, r8, r0)     // Catch:{ all -> 0x01ba }
            goto L_0x01b4
        L_0x0131:
            java.lang.Object r1 = r8.getKey()     // Catch:{ all -> 0x01ba }
            com.whatsapp.jid.DeviceJid r1 = (com.whatsapp.jid.DeviceJid) r1     // Catch:{ all -> 0x01ba }
            java.lang.String r0 = "unknown_companion"
            r11.A09(r1, r0, r5, r4)     // Catch:{ all -> 0x01ba }
            X.190 r8 = r11.A06     // Catch:{ all -> 0x01ba }
            java.lang.String r2 = "ContactSyncDevicesUpdater/update add unknown device of self"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x01ba }
            r1.<init>()     // Catch:{ all -> 0x01ba }
            java.lang.String r0 = "toAdd="
            r1.append(r0)     // Catch:{ all -> 0x01ba }
            java.util.Set r0 = r3.keySet()     // Catch:{ all -> 0x01ba }
            r1.append(r0)     // Catch:{ all -> 0x01ba }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x01ba }
            r8.A0G(r2, r0, r4)     // Catch:{ all -> 0x01ba }
            goto L_0x01b7
        L_0x015b:
            X.2m6 r9 = r11.A00     // Catch:{ all -> 0x01ba }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x01ba }
            r1.<init>()     // Catch:{ all -> 0x01ba }
            java.lang.String r0 = "companion-device-manager/device registered: "
            r1.append(r0)     // Catch:{ all -> 0x01ba }
            X.4Zh r0 = r9.A02     // Catch:{ all -> 0x01ba }
            com.whatsapp.jid.DeviceJid r0 = r0.A08     // Catch:{ all -> 0x01ba }
            r1.append(r0)     // Catch:{ all -> 0x01ba }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x01ba }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x01ba }
            r1 = 40
            X.35V r0 = new X.35V     // Catch:{ all -> 0x01ba }
            r0.<init>(r9, r1)     // Catch:{ all -> 0x01ba }
            r11.notifyAllObservers(r0)     // Catch:{ all -> 0x01ba }
            X.1Pw r2 = r11.A0A     // Catch:{ all -> 0x01ba }
            android.content.SharedPreferences r0 = X.C25851Pw.A00(r2)     // Catch:{ all -> 0x01ba }
            android.content.SharedPreferences$Editor r1 = r0.edit()     // Catch:{ all -> 0x01ba }
            java.lang.String r0 = "syncd_last_fatal_error_time"
            android.content.SharedPreferences$Editor r0 = r1.remove(r0)     // Catch:{ all -> 0x01ba }
            r0.apply()     // Catch:{ all -> 0x01ba }
            X.11P r0 = r11.A0C     // Catch:{ all -> 0x01ba }
            long r0 = X.AnonymousClass11P.A01(r0)     // Catch:{ all -> 0x01ba }
            android.content.SharedPreferences r2 = X.C25851Pw.A00(r2)     // Catch:{ all -> 0x01ba }
            android.content.SharedPreferences$Editor r8 = r2.edit()     // Catch:{ all -> 0x01ba }
            java.lang.String r2 = "syncd_last_device_reg_time"
            android.content.SharedPreferences$Editor r0 = r8.putLong(r2, r0)     // Catch:{ all -> 0x01ba }
            r0.apply()     // Catch:{ all -> 0x01ba }
            X.10s r2 = r11.A0I     // Catch:{ all -> 0x01ba }
            r0 = 12
            X.3Ch r1 = new X.3Ch     // Catch:{ all -> 0x01ba }
            r1.<init>(r11, r9, r0)     // Catch:{ all -> 0x01ba }
        L_0x01b4:
            r2.execute(r1)     // Catch:{ all -> 0x01ba }
        L_0x01b7:
            monitor-exit(r6)     // Catch:{ all -> 0x01ba }
            goto L_0x00fc
        L_0x01ba:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x01ba }
            throw r0
        L_0x01bd:
            boolean r0 = r7.isEmpty()
            r0 = r0 ^ 1
            return r0
        L_0x01c4:
            boolean r0 = r9.isEmpty()
            if (r0 != 0) goto L_0x01d2
            X.10f r0 = r9.keySet()
            r11.A08(r0, r4)
            return r5
        L_0x01d2:
            return r4
        L_0x01d3:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x01d3 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1RK.A0C(X.10w, boolean, boolean):boolean");
    }

    public boolean A0D(DeviceJid deviceJid) {
        boolean z;
        synchronized (this.A0M) {
            DeviceJid deviceJid2 = this.A01;
            if (deviceJid2 == null || !deviceJid2.equals(deviceJid)) {
                C59312m6 r0 = this.A00;
                if (r0 == null || !r0.A02.A08.equals(deviceJid) || !this.A03) {
                    z = false;
                }
            }
            z = true;
        }
        return z;
    }

    public boolean BcT(Message message, int i) {
        long A012;
        if (i != 213) {
            return false;
        }
        if (message == null) {
            return true;
        }
        C29621ca r4 = (C29621ca) message.obj;
        DeviceJid deviceJid = (DeviceJid) r4.A0G(DeviceJid.class, "from");
        if (deviceJid == null) {
            return true;
        }
        if (!this.A09.A0P(deviceJid)) {
            return true;
        }
        String A0Q2 = r4.A0Q(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, (String) null);
        if (A0Q2 == null || "available".equals(A0Q2)) {
            A012 = AnonymousClass11P.A01(this.A0C);
            this.A0N.add(deviceJid);
        } else if (!"unavailable".equals(A0Q2)) {
            return true;
        } else {
            A012 = C60522oA.A00(r4);
            this.A0N.remove(deviceJid);
        }
        if (A012 == 0) {
            return true;
        }
        this.A0J.CGF(new AnonymousClass3C3(this, deviceJid, 12, A012));
        return true;
    }

    public static C88344Zh A00(AnonymousClass1RK r1, DeviceJid deviceJid) {
        if (!r1.A0B()) {
            return null;
        }
        return (C88344Zh) r1.A0H.A04.A00().get(deviceJid);
    }

    private AnonymousClass37F A01(C199410f r4, C198589ya r5, String str, boolean z, boolean z2) {
        boolean z3;
        Iterator it = r4.iterator();
        while (true) {
            if (it.hasNext()) {
                if (C62832s4.A00((Jid) it.next())) {
                    z3 = true;
                    break;
                }
            } else {
                z3 = false;
                break;
            }
        }
        C17960vV.A0F(!z3, "companion-device-manager/hostedDevice present when not supported in build");
        return new AnonymousClass37F(r5, new C678230z(this, z2, z), (AnonymousClass1OZ) this.A07.A00.A00.A6N.get(), str);
    }

    public ArrayList A06() {
        if (!A0B()) {
            return new ArrayList();
        }
        return new ArrayList(this.A0H.A04.A00().values());
    }

    public ArrayList A07() {
        if (!A0B()) {
            return new ArrayList();
        }
        return new ArrayList(this.A0H.A04().values());
    }

    public void A09(DeviceJid deviceJid, String str, boolean z, boolean z2) {
        if (C22971Dz.A0T(deviceJid)) {
            StringBuilder sb = new StringBuilder();
            sb.append("companion-device-manager/logoutDeviceAndNotify: skipping LID device: ");
            sb.append(deviceJid);
            Log.i(sb.toString());
            return;
        }
        String str2 = str;
        if (!(str == "user_initiated" || str == "smb_subscription_deactivated" || str == "account_sync_timeout" || str == "critical_sync_timeout" || str == "syncd_error_during_bootstrap")) {
            Map map = this.A0S;
            if (map.containsKey(deviceJid) && AnonymousClass11P.A01(this.A0C) - ((Number) map.get(deviceJid)).longValue() < 3600000) {
                return;
            }
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("companion-device-manager/logoutDeviceAndNotify: ");
        sb2.append(deviceJid);
        sb2.append(", removalReason ");
        sb2.append(str);
        sb2.append(", remove on error: ");
        sb2.append(z);
        Log.i(sb2.toString());
        this.A0S.put(deviceJid, Long.valueOf(AnonymousClass11P.A01(this.A0C)));
        A01(C199410f.of(deviceJid), this.A0P.A00(deviceJid, str), str2, z, z2).A00(deviceJid);
    }
}
