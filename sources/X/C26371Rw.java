package X;

import android.util.Base64;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.PhoneUserJid;
import com.whatsapp.util.Log;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.concurrent.TimeUnit;

/* renamed from: X.1Rw  reason: invalid class name and case insensitive filesystem */
public class C26371Rw implements C26361Rv {
    public String A00;
    public long A01 = 0;
    public final AnonymousClass11S A02;
    public final C25851Pw A03;
    public final AnonymousClass11P A04;
    public final AnonymousClass1P3 A05;
    public final C26331Rs A06;
    public final C18030ve A07;
    public final AnonymousClass18K A08;
    public final AnonymousClass1RK A09;

    public static Integer A00(int i) {
        if (!(i == 0 || i == 1)) {
            if (!(i == 2 || i == 3)) {
                if (i != 4) {
                    if (i != 5) {
                        return null;
                    }
                }
            }
            return 2;
        }
        return 1;
    }

    public static Integer A01(int i) {
        int i2 = 1;
        if (i != 0) {
            int i3 = 5;
            if (i != 1) {
                i2 = 2;
                if (i != 2) {
                    i2 = 3;
                    if (i != 3) {
                        i2 = 4;
                        if (i != 4) {
                            i3 = 6;
                            if (i != 5) {
                                return null;
                            }
                        }
                    }
                }
            }
            return Integer.valueOf(i3);
        }
        return Integer.valueOf(i2);
    }

    public static Integer A03(String str) {
        if (str != null) {
            switch (str.hashCode()) {
                case -849492943:
                    if (str.equals("regular_low")) {
                        return 2;
                    }
                    break;
                case -564602779:
                    if (str.equals("regular_high")) {
                        return 3;
                    }
                    break;
                case -498584183:
                    if (str.equals("critical_unblock_low")) {
                        return 5;
                    }
                    break;
                case 207170541:
                    if (str.equals("critical_block")) {
                        return 4;
                    }
                    break;
                case 1086463900:
                    if (str.equals("regular")) {
                        return 1;
                    }
                    break;
            }
        }
        return null;
    }

    public static String A05(C58252kO r7, C58252kO r8) {
        String str;
        if (r7 == null) {
            str = "SyncStatsManager/createBootstrapSessionId companionKey is null";
        } else if (r8 == null) {
            str = "SyncStatsManager/createBootstrapSessionId primaryKey is null";
        } else {
            try {
                byte[] bArr = {95};
                return Base64.encodeToString(MessageDigest.getInstance("SHA-256").digest(A8G.A05(r8.A00.A00, bArr, r7.A00.A00)), 2);
            } catch (NoSuchAlgorithmException e) {
                Log.e("sync-stats-manager/createBootstrapSessionId unable to create id because sha256 instance could not created.", e);
                return null;
            }
        }
        Log.w(str);
        return null;
    }

    public static Integer A02(long j) {
        int i;
        if (j == 0) {
            i = 1;
        } else if (j == 1) {
            i = 2;
        } else if (j < 10) {
            i = 3;
        } else if (j < 100) {
            i = 4;
        } else if (j < 500) {
            i = 5;
        } else if (j < 1000) {
            i = 6;
        } else {
            i = 8;
            if (j < 5000) {
                i = 7;
            }
        }
        return Integer.valueOf(i);
    }

    private String A04() {
        String str;
        String str2;
        AnonymousClass11S r1 = this.A02;
        if (r1.A0N()) {
            r1.A0I();
            PhoneUserJid phoneUserJid = r1.A0E;
            C17960vV.A07(phoneUserJid);
            DeviceJid primaryDevice = phoneUserJid.getPrimaryDevice();
            AnonymousClass1P3 r2 = this.A05;
            String A052 = A05(r2.A01.A03().A01, r2.A0D(C63962tz.A02(primaryDevice)));
            if (A052 != null) {
                byte[] bytes = A052.getBytes();
                C18070vi.A0d(bytes, 0);
                try {
                    MessageDigest instance = MessageDigest.getInstance("SHA-1");
                    C18070vi.A0X(instance);
                    byte[] digest = instance.digest(bytes);
                    C18070vi.A0b(digest);
                    str2 = C137496vY.A01(digest);
                } catch (NoSuchAlgorithmException unused) {
                    str2 = null;
                }
                if (str2 != null) {
                    return str2.substring(str2.length() - 6);
                }
            }
            return null;
        }
        LinkedList linkedList = new LinkedList();
        Iterator it = this.A09.A06().iterator();
        while (it.hasNext()) {
            AnonymousClass1P3 r3 = this.A05;
            String A053 = A05(r3.A0D(C63962tz.A02(((C88344Zh) it.next()).A08)), r3.A01.A03().A01);
            if (A053 != null) {
                byte[] bytes2 = A053.getBytes();
                C18070vi.A0d(bytes2, 0);
                try {
                    MessageDigest instance2 = MessageDigest.getInstance("SHA-1");
                    C18070vi.A0X(instance2);
                    byte[] digest2 = instance2.digest(bytes2);
                    C18070vi.A0b(digest2);
                    str = C137496vY.A01(digest2);
                } catch (NoSuchAlgorithmException unused2) {
                    str = null;
                }
                if (str != null) {
                    linkedList.add(str.substring(str.length() - 6));
                }
            }
        }
        return AnonymousClass2SU.A00(",", linkedList);
    }

    public static void A06(AnonymousClass2SB r3, C26371Rw r4, int i) {
        C46742Fs r2 = new C46742Fs();
        r2.A00 = Integer.valueOf(i);
        r2.A03 = r3.A01;
        r2.A02 = r3.A00;
        r2.A01 = Long.valueOf(AnonymousClass11P.A01(r4.A04));
        r4.A08.CC7(r2);
    }

    /* JADX WARNING: type inference failed for: r0v6, types: [X.2SB, java.lang.Object] */
    public AnonymousClass2SB A07(C58252kO r6, String str) {
        String A052 = A05(r6, this.A05.A01.A03().A01);
        String str2 = null;
        if (str != null) {
            AnonymousClass11S r0 = this.A02;
            r0.A0I();
            PhoneUserJid phoneUserJid = r0.A0E;
            if (phoneUserJid == null) {
                Log.e("sync-stats-manager/createMDRegAttemptId myUserJid is null");
            } else {
                try {
                    MessageDigest instance = MessageDigest.getInstance("SHA-256");
                    StringBuilder sb = new StringBuilder();
                    sb.append(phoneUserJid.user);
                    sb.append("_");
                    sb.append(str);
                    str2 = Base64.encodeToString(instance.digest(sb.toString().getBytes()), 2);
                } catch (NoSuchAlgorithmException e) {
                    Log.e("sync-stats-manager/createMDRegAttemptId unable to create id because sha256 instance could not created.", e);
                }
            }
        }
        if (A052 == null || str2 == null) {
            return null;
        }
        ? obj = new Object();
        obj.A01 = A052;
        obj.A00 = str2;
        return obj;
    }

    public void A08(int i) {
        if (C18020vd.A05(C18040vf.A02, this.A07, 624)) {
            C46462Eq r1 = new C46462Eq();
            r1.A00 = Integer.valueOf(i);
            this.A08.CC7(r1);
        }
    }

    public void A09(int i, String str) {
        AnonymousClass2F6 r1 = new AnonymousClass2F6();
        r1.A01 = Integer.valueOf(i);
        r1.A00 = A03(str);
        this.A08.CC7(r1);
    }

    public void A0A(long j, boolean z) {
        AnonymousClass2F5 r2 = new AnonymousClass2F5();
        r2.A00 = Boolean.valueOf(z);
        r2.A01 = Long.valueOf(AnonymousClass11P.A01(this.A04) - j);
        this.A08.CC7(r2);
    }

    public void A0B(AnonymousClass2SB r6, int i, int i2, int i3, long j, long j2, long j3, long j4, long j5) {
        if (r6 != null) {
            AnonymousClass2H6 r2 = new AnonymousClass2H6();
            r2.A06 = Long.valueOf(j2);
            r2.A07 = Long.valueOf(j3);
            r2.A08 = Long.valueOf(j4);
            r2.A01 = Integer.valueOf(i3);
            r2.A0C = r6.A01;
            r2.A0B = r6.A00;
            r2.A0A = Long.valueOf(AnonymousClass11P.A01(this.A04));
            int i4 = 1;
            if (i3 != 1) {
                i4 = 2;
            }
            r2.A03 = Integer.valueOf(i4);
            r2.A00 = A01(i);
            r2.A02 = A00(i);
            r2.A05 = Long.valueOf(j);
            r2.A09 = Long.valueOf(TimeUnit.MILLISECONDS.toSeconds(j5));
            r2.A04 = Long.valueOf((long) i2);
            this.A08.CC7(r2);
        }
    }

    public void A0C(AnonymousClass2SB r4, int i, int i2, long j, boolean z, boolean z2) {
        if (r4 != null) {
            C47032Gv r2 = new C47032Gv();
            r2.A09 = r4.A01;
            r2.A08 = r4.A00;
            r2.A07 = Long.valueOf(AnonymousClass11P.A01(this.A04));
            int i3 = 2;
            r2.A03 = 2;
            if (z) {
                i3 = 1;
            }
            r2.A04 = Integer.valueOf(i3);
            r2.A01 = A01(i);
            r2.A02 = A00(i);
            r2.A06 = Long.valueOf(j);
            r2.A00 = Boolean.valueOf(z2);
            r2.A05 = Long.valueOf((long) i2);
            this.A08.CC7(r2);
        }
    }

    public void A0D(AnonymousClass2SB r4, int i, long j, long j2, boolean z) {
        AnonymousClass2GU r2 = new AnonymousClass2GU();
        r2.A06 = r4.A01;
        r2.A05 = r4.A00;
        r2.A04 = Long.valueOf(AnonymousClass11P.A01(this.A04));
        r2.A02 = Long.valueOf(j);
        r2.A00 = Integer.valueOf(i);
        int i2 = 2;
        if (z) {
            i2 = 1;
        }
        r2.A01 = Integer.valueOf(i2);
        r2.A03 = Long.valueOf(j2);
        this.A08.CC7(r2);
    }

    public void A0E(AnonymousClass2SB r4, int i, boolean z) {
        C47032Gv r2 = new C47032Gv();
        r2.A09 = r4.A01;
        r2.A08 = r4.A00;
        r2.A07 = Long.valueOf(AnonymousClass11P.A01(this.A04));
        int i2 = 1;
        r2.A03 = 1;
        if (!z) {
            i2 = 2;
        }
        r2.A04 = Integer.valueOf(i2);
        r2.A02 = Integer.valueOf(i);
        this.A08.CC7(r2);
    }

    public void A0G(AnonymousClass231 r8, int i) {
        if (r8 instanceof AnonymousClass23J) {
            AnonymousClass23J r82 = (AnonymousClass23J) r8;
            String str = r82.A0J;
            String str2 = r82.A0I;
            int i2 = r82.A03;
            int i3 = 1;
            boolean z = false;
            if (i == -1) {
                z = true;
            }
            if (str != null && str2 != null) {
                C46962Go r2 = new C46962Go();
                r2.A08 = str;
                r2.A07 = str2;
                r2.A01 = A00(i2);
                r2.A06 = Long.valueOf(AnonymousClass11P.A01(this.A04));
                if (!z) {
                    i3 = 2;
                }
                r2.A02 = Integer.valueOf(i3);
                if (!z) {
                    r2.A05 = Long.valueOf((long) i);
                }
                Integer A012 = A01(i2);
                r2.A00 = A012;
                int intValue = A012.intValue();
                if (intValue == 2 || intValue == 3) {
                    r2.A04 = Long.valueOf((long) r82.A01);
                }
                r2.A03 = Long.valueOf((long) r82.A00);
                this.A08.CC7(r2);
            }
        }
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [X.2SB, java.lang.Object] */
    public void Btg(AnonymousClass231 r18) {
        AnonymousClass231 r2 = r18;
        if (r2 instanceof AnonymousClass23J) {
            AnonymousClass23J r22 = (AnonymousClass23J) r2;
            String str = r22.A0J;
            String str2 = r22.A0I;
            if (str != null && str2 != null) {
                ? obj = new Object();
                obj.A01 = str;
                obj.A00 = str2;
                long j = r22.A04;
                long j2 = r22.A07;
                long j3 = r22.A05;
                long j4 = r22.A0A;
                int i = r22.A00;
                A0B(obj, r22.A03, i, 1, (long) r22.A01, j, j2, j3, j4);
            }
        }
    }

    public C26371Rw(AnonymousClass11S r3, C26351Ru r4, C25851Pw r5, AnonymousClass11P r6, AnonymousClass1P3 r7, AnonymousClass1RK r8, C26331Rs r9, C18030ve r10, AnonymousClass18K r11) {
        this.A04 = r6;
        this.A07 = r10;
        this.A02 = r3;
        this.A08 = r11;
        this.A05 = r7;
        this.A06 = r9;
        this.A03 = r5;
        this.A09 = r8;
        r4.registerObserver(this);
    }

    public void A0F(C59892n3 r6) {
        String A042 = A04();
        if (A042 == null) {
            Log.e("sync-stats-manager/logWamMdSyncdBundleEvent could not create companion session ids");
            return;
        }
        C47202Hm r4 = new C47202Hm();
        r4.A08 = A042;
        r4.A02 = A03(r6.A08);
        C59372mC r0 = r6.A04;
        if (r0 != null) {
            byte[] bArr = r0.A02;
            try {
                MessageDigest instance = MessageDigest.getInstance("SHA-256");
                C18070vi.A0X(instance);
                byte[] digest = instance.digest(bArr);
                C18070vi.A0b(digest);
                String A012 = C137496vY.A01(digest);
                r4.A0E = A012.substring(A012.length() - 6);
            } catch (NoSuchAlgorithmException unused) {
            }
        }
        C19999A2n a2n = r6.A05;
        if (a2n != null) {
            r4.A0F = C137496vY.A01(a2n.A00);
        }
        byte[] bArr2 = r6.A0B;
        if (bArr2 != null) {
            r4.A0B = C137496vY.A01(bArr2);
        }
        byte[] bArr3 = r6.A0C;
        if (bArr3 != null) {
            r4.A0D = C137496vY.A01(bArr3);
        }
        byte[] bArr4 = r6.A0A;
        if (bArr4 != null) {
            r4.A09 = C137496vY.A01(bArr4);
        }
        byte[] bArr5 = r6.A09;
        if (bArr5 != null) {
            r4.A0A = C137496vY.A01(bArr5);
        }
        r4.A01 = Integer.valueOf(r6.A03);
        r4.A00 = Integer.valueOf(r6.A02);
        r4.A04 = r6.A06;
        r4.A06 = r6.A07;
        r4.A03 = r6.A00;
        r4.A0C = r6.A01;
        long j = this.A01;
        this.A01 = 1 + j;
        r4.A05 = Long.valueOf(j);
        String str = this.A00;
        if (str == null) {
            byte[] bArr6 = new byte[16];
            new SecureRandom().nextBytes(bArr6);
            str = C137496vY.A01(bArr6);
            this.A00 = str;
        }
        r4.A07 = str;
        this.A08.CC7(r4);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x004e  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0058  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0064  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x009a  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00b1  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00cc  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00ce  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00c3 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0H(java.util.List r8) {
        /*
            r7 = this;
            java.lang.String r5 = r7.A04()
            if (r5 != 0) goto L_0x000d
            java.lang.String r0 = "sync-stats-manager/logWamMdSyncdMutationEvent could not create companion session ids"
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x000c:
            return
        L_0x000d:
            java.util.Iterator r6 = r8.iterator()
        L_0x0011:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x000c
            java.lang.Object r2 = r6.next()
            X.2n0 r2 = (X.C59862n0) r2
            X.2Hk r4 = new X.2Hk
            r4.<init>()
            r4.A08 = r5
            X.2rJ r1 = r2.A02
            X.2rJ r0 = X.C62382rJ.A03
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x00d0
            r0 = 0
        L_0x002f:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
        L_0x0033:
            r4.A03 = r1
            java.lang.String r0 = r2.A07
            java.lang.Integer r0 = A03(r0)
            r4.A04 = r0
            java.lang.String r0 = r2.A08
            r4.A0A = r0
            int r0 = r2.A01
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r4.A02 = r0
            byte[] r0 = r2.A09
            r3 = 0
            if (r0 == 0) goto L_0x00ce
            java.lang.String r0 = X.C137496vY.A01(r0)
        L_0x0052:
            r4.A09 = r0
            X.A2n r0 = r2.A04
            if (r0 == 0) goto L_0x00cc
            byte[] r0 = r0.A00
            java.lang.String r0 = X.C137496vY.A01(r0)
        L_0x005e:
            r4.A0D = r0
            X.2mC r0 = r2.A03
            if (r0 == 0) goto L_0x0086
            byte[] r1 = r0.A02
            java.lang.String r0 = "SHA-256"
            java.security.MessageDigest r0 = java.security.MessageDigest.getInstance(r0)     // Catch:{ NoSuchAlgorithmException -> 0x0086 }
            X.C18070vi.A0X(r0)     // Catch:{ NoSuchAlgorithmException -> 0x0086 }
            byte[] r0 = r0.digest(r1)
            X.C18070vi.A0b(r0)
            java.lang.String r1 = X.C137496vY.A01(r0)
            int r0 = r1.length()
            int r0 = r0 + -6
            java.lang.String r0 = r1.substring(r0)
            r4.A0C = r0
        L_0x0086:
            java.lang.Long r0 = r2.A06
            r4.A05 = r0
            int r0 = r2.A00
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r4.A01 = r0
            java.lang.Boolean r0 = r2.A05
            r4.A00 = r0
            byte[] r0 = r2.A0A
            if (r0 == 0) goto L_0x009e
            java.lang.String r3 = X.C137496vY.A01(r0)
        L_0x009e:
            r4.A0B = r3
            long r2 = r7.A01
            r0 = 1
            long r0 = r0 + r2
            r7.A01 = r0
            java.lang.Long r0 = java.lang.Long.valueOf(r2)
            r4.A06 = r0
            java.lang.String r0 = r7.A00
            if (r0 != 0) goto L_0x00c3
            r0 = 16
            byte[] r1 = new byte[r0]
            java.security.SecureRandom r0 = new java.security.SecureRandom
            r0.<init>()
            r0.nextBytes(r1)
            java.lang.String r0 = X.C137496vY.A01(r1)
            r7.A00 = r0
        L_0x00c3:
            r4.A07 = r0
            X.18K r0 = r7.A08
            r0.CC7(r4)
            goto L_0x0011
        L_0x00cc:
            r0 = r3
            goto L_0x005e
        L_0x00ce:
            r0 = r3
            goto L_0x0052
        L_0x00d0:
            X.2rJ r0 = X.C62382rJ.A02
            boolean r0 = r1.equals(r0)
            r1 = 0
            if (r0 == 0) goto L_0x0033
            r0 = 1
            goto L_0x002f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26371Rw.A0H(java.util.List):void");
    }
}
