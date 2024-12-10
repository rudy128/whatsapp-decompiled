package X;

import android.content.SharedPreferences;
import com.whatsapp.Me;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.PhoneUserJid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.11S  reason: invalid class name */
public class AnonymousClass11S {
    public Me A00;
    public C42521yJ A01;
    public AnonymousClass1E3 A02;
    public AnonymousClass1E2 A03;
    public String A04;
    public boolean A05 = false;
    public final AnonymousClass11R A06;
    public final AnonymousClass11U A07 = new AnonymousClass11U();
    public final AnonymousClass118 A08;
    public final AnonymousClass11O A09;
    public final List A0A = new ArrayList();
    public final C19830z4 A0B;
    public final AnonymousClass00H A0C;
    public volatile AnonymousClass1E8 A0D;
    public volatile PhoneUserJid A0E;

    private synchronized void A02() {
        if (!this.A05) {
            A04(Jid.Companion.A02(((SharedPreferences) this.A0B.A00.get()).getString("self_lid", "")));
            this.A05 = true;
        }
    }

    private synchronized void A04(Jid jid) {
        C42521yJ r0;
        if (jid instanceof AnonymousClass1E2) {
            AnonymousClass1E2 r3 = (AnonymousClass1E2) jid;
            this.A03 = r3;
            try {
                int i = this.A06.A01.A00.getInt("registration_device_id", 0);
                if (i == 99) {
                    r0 = new C47732Jq(r3, i);
                } else {
                    r0 = new C42521yJ(r3, i);
                }
                this.A01 = r0;
            } catch (AnonymousClass11T e) {
                Log.w("memanager/setMyLidDeviceJid/invalid_jid_error", e);
            }
        } else if (jid instanceof C42521yJ) {
            C42521yJ r2 = (C42521yJ) jid;
            UserJid userJid = r2.userJid;
            C18070vi.A0z(userJid, "null cannot be cast to non-null type com.whatsapp.jid.LidUserJid");
            this.A03 = (AnonymousClass1E2) userJid;
            this.A01 = r2;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("memanager/setSelfLidsFromJid: ");
        sb.append(jid);
        Log.i(sb.toString());
    }

    public synchronized C42521yJ A08() {
        A02();
        return this.A01;
    }

    public synchronized AnonymousClass1E2 A09() {
        A02();
        return this.A03;
    }

    public synchronized AnonymousClass1E2 A0A() {
        AnonymousClass1E2 r0;
        A02();
        r0 = this.A03;
        C17960vV.A07(r0);
        return r0;
    }

    public synchronized String A0E() {
        String string;
        string = ((SharedPreferences) this.A0B.A00.get()).getString("self_display_name", "");
        if (AnonymousClass1EG.A0H(string)) {
            return null;
        }
        return string;
    }

    public synchronized void A0J(Jid jid) {
        if (!jid.equals(A09()) && ((jid instanceof AnonymousClass1E2) || (jid instanceof C42521yJ))) {
            this.A0B.A1u("self_lid", jid.getRawString());
            A04(jid);
            for (C29581cW r0 : this.A0A) {
                C25431Oe r2 = r0.A00;
                AnonymousClass11S r02 = r2.A02;
                r02.A0I();
                PhoneUserJid phoneUserJid = r02.A0E;
                if (!C18070vi.A18(phoneUserJid, r2.A00)) {
                    r2.A00 = phoneUserJid;
                    C25431Oe.A00(r2);
                    C25431Oe.A01(r2);
                }
            }
        }
    }

    public synchronized void A0M(String str) {
        this.A0B.A1u("self_display_name", str);
    }

    public boolean A0R(DeviceJid deviceJid) {
        return (deviceJid == null || !A0O(deviceJid.userJid) || deviceJid.getDevice() == this.A06.A01.A00.getInt("registration_device_id", 0)) ? false : true;
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [X.1E7, X.1E8] */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0032 A[Catch:{ 11T -> 0x003a }] */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x00a5  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0019 A[Catch:{ 11T -> 0x003a }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A03(com.whatsapp.Me r4, X.AnonymousClass11S r5) {
        /*
            r5.A00 = r4
            r2 = 0
            r3 = 0
            if (r4 == 0) goto L_0x0007
            goto L_0x0009
        L_0x0007:
            r0 = r3
            goto L_0x0013
        L_0x0009:
            java.lang.String r1 = r4.jabber_id     // Catch:{ 11T -> 0x003a }
            if (r1 == 0) goto L_0x0007
            android.os.Parcelable$Creator r0 = com.whatsapp.jid.PhoneUserJid.CREATOR     // Catch:{ 11T -> 0x003a }
            com.whatsapp.jid.PhoneUserJid r0 = X.C22951Dx.A01(r1)     // Catch:{ 11T -> 0x003a }
        L_0x0013:
            r5.A0E = r0     // Catch:{ 11T -> 0x003a }
            com.whatsapp.jid.PhoneUserJid r0 = r5.A0E     // Catch:{ 11T -> 0x003a }
            if (r0 == 0) goto L_0x0032
            com.whatsapp.jid.PhoneUserJid r4 = r5.A0E     // Catch:{ 11T -> 0x003a }
            X.11R r0 = r5.A06     // Catch:{ 11T -> 0x003a }
            X.11O r0 = r0.A01     // Catch:{ 11T -> 0x003a }
            android.content.SharedPreferences r1 = r0.A00     // Catch:{ 11T -> 0x003a }
            java.lang.String r0 = "registration_device_id"
            int r1 = r1.getInt(r0, r2)     // Catch:{ 11T -> 0x003a }
            X.1E0 r0 = com.whatsapp.jid.DeviceJid.Companion     // Catch:{ 11T -> 0x003a }
            com.whatsapp.jid.DeviceJid r0 = r0.A03(r4, r1)     // Catch:{ 11T -> 0x003a }
            X.1E3 r0 = (X.AnonymousClass1E3) r0     // Catch:{ 11T -> 0x003a }
            r5.A02 = r0     // Catch:{ 11T -> 0x003a }
            goto L_0x0049
        L_0x0032:
            r5.A02 = r3     // Catch:{ 11T -> 0x003a }
            X.11R r0 = r5.A06     // Catch:{ 11T -> 0x003a }
            r0.A00(r2)     // Catch:{ 11T -> 0x003a }
            goto L_0x0049
        L_0x003a:
            r1 = move-exception
            java.lang.String r0 = "memanager/setMe/invalid_jid_error"
            com.whatsapp.util.Log.e(r0, r1)
            r5.A0E = r3
            r5.A02 = r3
            X.11R r0 = r5.A06
            r0.A00(r2)
        L_0x0049:
            com.whatsapp.jid.PhoneUserJid r0 = r5.A0E
            if (r0 != 0) goto L_0x00a5
            r5.A0D = r3
        L_0x004f:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "memanager/setMe me: "
            r1.append(r0)
            com.whatsapp.Me r0 = r5.A00
            r1.append(r0)
            java.lang.String r0 = ", myUserJid: "
            r1.append(r0)
            com.whatsapp.jid.PhoneUserJid r0 = r5.A0E
            r1.append(r0)
            java.lang.String r0 = ", myDeviceJid: "
            r1.append(r0)
            X.1E3 r0 = r5.A02
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.util.List r0 = r5.A0A
            java.util.Iterator r3 = r0.iterator()
        L_0x007f:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x00d4
            java.lang.Object r0 = r3.next()
            X.1cW r0 = (X.C29581cW) r0
            X.1Oe r2 = r0.A00
            X.11S r0 = r2.A02
            r0.A0I()
            com.whatsapp.jid.PhoneUserJid r1 = r0.A0E
            com.whatsapp.jid.PhoneUserJid r0 = r2.A00
            boolean r0 = X.C18070vi.A18(r1, r0)
            if (r0 != 0) goto L_0x007f
            r2.A00 = r1
            X.C25431Oe.A00(r2)
            X.C25431Oe.A01(r2)
            goto L_0x007f
        L_0x00a5:
            com.whatsapp.jid.PhoneUserJid r1 = r5.A0E
            X.1E8 r0 = new X.1E8
            r0.<init>(r1)
            r5.A0D = r0
            X.1E8 r1 = r5.A0D
            X.11O r0 = r5.A09
            android.content.SharedPreferences r3 = r0.A00
            java.lang.String r0 = "profile_photo_thumb_id"
            int r0 = r3.getInt(r0, r2)
            r1.A08 = r0
            X.1E8 r1 = r5.A0D
            java.lang.String r0 = "profile_photo_full_id"
            int r0 = r3.getInt(r0, r2)
            r1.A07 = r0
            X.1E8 r2 = r5.A0D
            java.lang.String r1 = "push_name"
            java.lang.String r0 = ""
            java.lang.String r0 = r3.getString(r1, r0)
            r2.A0c = r0
            goto L_0x004f
        L_0x00d4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass11S.A03(com.whatsapp.Me, X.11S):void");
    }

    public static boolean A05(Me me, AnonymousClass11S r5, String str) {
        StringBuilder sb;
        String str2;
        ObjectOutputStream objectOutputStream;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("memanager/save ");
        sb2.append(str);
        Log.i(sb2.toString());
        try {
            objectOutputStream = new ObjectOutputStream(r5.A08.A00.openFileOutput(str, 0));
            objectOutputStream.writeObject(me);
            objectOutputStream.close();
            return true;
        } catch (FileNotFoundException e) {
            e = e;
            sb = new StringBuilder();
            str2 = "memanager/save/notfounderror ";
            sb.append(str2);
            sb.append(str);
            Log.e(sb.toString(), e);
            return false;
        } catch (IOException e2) {
            e = e2;
            sb = new StringBuilder();
            str2 = "memanager/save/ioerror ";
            sb.append(str2);
            sb.append(str);
            Log.e(sb.toString(), e);
            return false;
        } catch (Throwable th) {
            AnonymousClass0DT.A00(th, th);
        }
        throw th;
    }

    public int A06() {
        return this.A06.A01.A00.getInt("registration_device_id", 0);
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x0046 A[SYNTHETIC, Splitter:B:25:0x0046] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.whatsapp.Me A07() {
        /*
            r5 = this;
            java.lang.String r0 = "memanager/getoldme"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r5.A0I()
            X.118 r0 = r5.A08
            android.content.Context r3 = r0.A00
            java.io.File r2 = r3.getFilesDir()
            java.lang.String r1 = "me_old"
            java.io.File r0 = new java.io.File
            r0.<init>(r2, r1)
            boolean r0 = r0.exists()
            r4 = 0
            if (r0 == 0) goto L_0x0062
            java.io.FileInputStream r3 = r3.openFileInput(r1)     // Catch:{ ClassNotFoundException -> 0x0051, IOException -> 0x004f }
            X.1Dq r2 = new X.1Dq     // Catch:{ all -> 0x0040 }
            r2.<init>(r3)     // Catch:{ all -> 0x0040 }
            java.lang.Object r0 = r2.readObject()     // Catch:{ all -> 0x0036 }
            com.whatsapp.Me r0 = (com.whatsapp.Me) r0     // Catch:{ all -> 0x0036 }
            r2.close()     // Catch:{ all -> 0x0042 }
            if (r3 == 0) goto L_0x0035
            r3.close()     // Catch:{ ClassNotFoundException -> 0x0053, IOException -> 0x005b }
        L_0x0035:
            return r0
        L_0x0036:
            r1 = move-exception
            r2.close()     // Catch:{ all -> 0x003b }
            goto L_0x003f
        L_0x003b:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ all -> 0x0040 }
        L_0x003f:
            throw r1     // Catch:{ all -> 0x0040 }
        L_0x0040:
            r1 = move-exception
            goto L_0x0044
        L_0x0042:
            r1 = move-exception
            r4 = r0
        L_0x0044:
            if (r3 == 0) goto L_0x004e
            r3.close()     // Catch:{ all -> 0x004a }
            goto L_0x004e
        L_0x004a:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ ClassNotFoundException -> 0x0051, IOException -> 0x004f }
        L_0x004e:
            throw r1     // Catch:{ ClassNotFoundException -> 0x0051, IOException -> 0x004f }
        L_0x004f:
            r1 = move-exception
            goto L_0x005d
        L_0x0051:
            r1 = move-exception
            goto L_0x0055
        L_0x0053:
            r1 = move-exception
            r4 = r0
        L_0x0055:
            java.lang.String r0 = "memanager/read_old_me/serialization_error"
            com.whatsapp.util.Log.w(r0, r1)
            return r4
        L_0x005b:
            r1 = move-exception
            r4 = r0
        L_0x005d:
            java.lang.String r0 = "memanager/read_old_me/io_error"
            com.whatsapp.util.Log.e(r0, r1)
        L_0x0062:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass11S.A07():com.whatsapp.Me");
    }

    public String A0C() {
        String str = this.A04;
        if (str == null) {
            str = ((SharedPreferences) this.A0B.A00.get()).getString("self_user_name", "");
            if (str.isEmpty()) {
                return "";
            }
            this.A04 = str;
        }
        return str;
    }

    public String A0D() {
        return this.A09.A00.getString("push_name", "");
    }

    public void A0F() {
        Log.i("memanager/clearMe");
        A0I();
        A03((Me) null, this);
    }

    public void A0G() {
        Log.i("memanager/deleteoldme");
        A0I();
        new File(this.A08.A00.getFilesDir(), "me").delete();
    }

    public void A0H() {
        Log.i("memanager/deleteoldme");
        A0I();
        new File(this.A08.A00.getFilesDir(), "me_old").delete();
    }

    public void A0I() {
        AnonymousClass11U r2 = this.A07;
        if (r2.A06()) {
            r2.A04(new AnonymousClass3DB(this, 1));
            r2.A00();
        }
    }

    public void A0K(String str) {
        String str2 = this.A04;
        if (!str.equals(str2)) {
            if (str2 == null) {
                str2 = "";
            }
            this.A0B.A1u("self_user_name", str);
            this.A04 = str;
            ((AnonymousClass10T) this.A0C.get()).notifyAllObservers(new AnonymousClass35Q(str2, AnonymousClass1E5.A00, str));
        }
    }

    public void A0L(String str) {
        this.A09.A00.edit().putString("push_name", str).apply();
        A0I();
        AnonymousClass1E8 r0 = this.A0D;
        if (r0 != null) {
            r0.A0c = str;
        }
    }

    public boolean A0O(AnonymousClass1BI r2) {
        if (r2 == null) {
            return false;
        }
        A0I();
        if (r2.equals(this.A0E) || r2.equals(A09())) {
            return true;
        }
        return false;
    }

    public boolean A0P(DeviceJid deviceJid) {
        if (deviceJid == null || !A0O(deviceJid.userJid) || deviceJid.getDevice() == 0) {
            return false;
        }
        return true;
    }

    public boolean A0S(Jid jid) {
        DeviceJid A022 = DeviceJid.Companion.A02(jid);
        if (A022 == null || !A0O(A022.userJid)) {
            return false;
        }
        return true;
    }

    public AnonymousClass11S(AnonymousClass11R r2, AnonymousClass118 r3, C19830z4 r4, AnonymousClass11O r5, AnonymousClass00H r6) {
        this.A08 = r3;
        this.A0C = r6;
        this.A0B = r4;
        this.A06 = r2;
        this.A09 = r5;
    }

    public static PhoneUserJid A00(AnonymousClass11S r0) {
        r0.A0I();
        return r0.A0E;
    }

    public static PhoneUserJid A01(AnonymousClass11S r0) {
        r0.A0I();
        PhoneUserJid phoneUserJid = r0.A0E;
        C17960vV.A07(phoneUserJid);
        return phoneUserJid;
    }

    public String A0B() {
        A0I();
        if (this.A0E == null) {
            return null;
        }
        return this.A0E.user;
    }

    public boolean A0N() {
        A0I();
        if (this.A06.A01.A00.getInt("registration_device_id", 0) > 0) {
            return true;
        }
        return false;
    }

    public boolean A0Q(DeviceJid deviceJid) {
        A0I();
        if (deviceJid.equals(this.A02) || deviceJid.equals(A08())) {
            return true;
        }
        return false;
    }
}
