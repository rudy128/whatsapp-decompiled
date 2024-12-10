package X;

import android.content.ContentValues;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Base64;
import androidx.core.view.inputmethod.EditorInfoCompat;
import com.facebook.cameracore.ardelivery.compression.zip.ZipDecompressor;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.206  reason: invalid class name */
public abstract class AnonymousClass206 {
    public int A00 = 0;
    public int A01;
    public int A02;
    public int A03;
    public int A04 = 0;
    public int A05;
    public int A06;
    public int A07 = 0;
    public int A08;
    public int A09;
    public int A0A;
    public int A0B;
    public int A0C;
    public int A0D;
    public long A0E;
    public long A0F;
    public long A0G;
    public long A0H = -1;
    public long A0I;
    public C49502Qs A0J;
    public AnonymousClass1BI A0K;
    public AnonymousClass206 A0L;
    public C52562b7 A0M;
    public AnonymousClass205 A0N;
    public C42691ya A0O;
    public C59622mc A0P;
    public Boolean A0Q = null;
    public Integer A0R = null;
    public Integer A0S;
    public Long A0T;
    public Long A0U;
    public Long A0V = null;
    public Long A0W;
    public String A0X;
    public String A0Y;
    public String A0Z = null;
    public String A0a;
    public String A0b;
    public String A0c;
    public String A0d;
    public String A0e;
    public String A0f;
    public String A0g;
    public List A0h;
    public List A0i;
    public Map A0j;
    public boolean A0k = false;
    public boolean A0l;
    public boolean A0m;
    public boolean A0n;
    public boolean A0o = false;
    public boolean A0p;
    public boolean A0q;
    public boolean A0r;
    public byte[] A0s;
    public int A0t = 0;
    public final int A0u;
    public final AnonymousClass205 A0v;
    public final Object A0w = new Object();
    public volatile long A0x = -1;
    public volatile long A0y = -1;
    public volatile boolean A0z;
    public transient long A10;
    public transient long A11;
    public transient long A12;
    public transient DeviceJid A13;
    public transient Integer A14 = null;
    public transient String A15;
    public transient String A16;
    public transient boolean A17;
    public transient boolean A18 = false;
    public transient boolean A19 = false;
    public transient boolean A1A = false;
    public transient boolean A1B = false;
    public transient boolean A1C;
    public transient byte[] A1D;
    public transient boolean A1E;
    public final transient long A1F;
    public final transient ConcurrentHashMap A1G = new ConcurrentHashMap();
    public volatile transient int A1H;

    public static String[] A09(AnonymousClass206 r4) {
        return new String[]{String.valueOf(r4.A0x)};
    }

    public final AnonymousClass25F A0N(Class cls) {
        AnonymousClass25F r1 = new AnonymousClass25F(this, cls, false);
        this.A1G.put(cls, r1);
        return r1;
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public java.lang.String A0P() {
        /*
            r6 = this;
            r4 = r6
            boolean r0 = r6 instanceof X.AnonymousClass2MO
            if (r0 == 0) goto L_0x0029
            r4 = r6
            X.2MO r4 = (X.AnonymousClass2MO) r4
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            long r0 = r4.A01
            r3.append(r0)
            java.lang.String r2 = ","
            r3.append(r2)
            long r0 = r4.A00
            r3.append(r0)
            r3.append(r2)
            java.lang.String r0 = r4.A02
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            return r0
        L_0x0029:
            boolean r0 = r6 instanceof X.AnonymousClass2MP
            if (r0 == 0) goto L_0x0035
            r0 = r6
            X.2MP r0 = (X.AnonymousClass2MP) r0
            java.lang.String r0 = r0.A18()
            return r0
        L_0x0035:
            boolean r0 = r6 instanceof X.AnonymousClass2MM
            if (r0 == 0) goto L_0x0055
            r2 = r6
            X.2MM r2 = (X.AnonymousClass2MM) r2
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = r2.A01
            r1.append(r0)
            java.lang.String r0 = ","
            r1.append(r0)
            int r0 = r2.A00
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            return r0
        L_0x0055:
            boolean r0 = r6 instanceof X.AnonymousClass2MX
            if (r0 == 0) goto L_0x0063
            r0 = r6
            X.2MX r0 = (X.AnonymousClass2MX) r0
            int r0 = r0.A00
            java.lang.String r0 = java.lang.String.valueOf(r0)
            return r0
        L_0x0063:
            boolean r0 = r6 instanceof X.AnonymousClass2MQ
            if (r0 == 0) goto L_0x0083
            r3 = r6
            X.2MQ r3 = (X.AnonymousClass2MQ) r3
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            long r0 = r3.A00
            r2.append(r0)
            r0 = 44
            r2.append(r0)
            java.lang.String r0 = r3.A01
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            return r0
        L_0x0083:
            boolean r0 = r6 instanceof X.AnonymousClass2MJ
            if (r0 == 0) goto L_0x0092
            r0 = r6
            X.2MJ r0 = (X.AnonymousClass2MJ) r0
            monitor-enter(r4)
            int r0 = r0.A00     // Catch:{ all -> 0x00ce }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x00ce }
            goto L_0x00cc
        L_0x0092:
            boolean r0 = r6 instanceof X.AnonymousClass2ML
            if (r0 == 0) goto L_0x009c
            r0 = r6
            X.2ML r0 = (X.AnonymousClass2ML) r0
            java.lang.String r0 = r0.A00
            return r0
        L_0x009c:
            boolean r0 = r6 instanceof X.AnonymousClass2MI
            if (r0 == 0) goto L_0x00ab
            r0 = r6
            X.2MI r0 = (X.AnonymousClass2MI) r0
            monitor-enter(r4)
            boolean r0 = r0.A00     // Catch:{ all -> 0x00ce }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x00ce }
            goto L_0x00cc
        L_0x00ab:
            boolean r0 = r6 instanceof X.AnonymousClass2MK
            if (r0 == 0) goto L_0x00d1
            r3 = r6
            X.2MK r3 = (X.AnonymousClass2MK) r3
            monitor-enter(r4)
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch:{ all -> 0x00ce }
            r2.<init>()     // Catch:{ all -> 0x00ce }
            java.lang.String r1 = "bizOptOutAction"
            int r0 = r3.A00     // Catch:{ all -> 0x00ce }
            org.json.JSONObject r2 = r2.put(r1, r0)     // Catch:{ all -> 0x00ce }
            java.lang.String r1 = "bizOptOutCategory"
            int r0 = r3.A01     // Catch:{ all -> 0x00ce }
            org.json.JSONObject r0 = r2.put(r1, r0)     // Catch:{ all -> 0x00ce }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x00ce }
        L_0x00cc:
            monitor-exit(r4)
            return r0
        L_0x00ce:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        L_0x00d1:
            boolean r0 = r6 instanceof X.AnonymousClass22H
            if (r0 == 0) goto L_0x00db
            r0 = r6
            X.22H r0 = (X.AnonymousClass22H) r0
            java.lang.String r0 = r0.A05
            return r0
        L_0x00db:
            boolean r0 = r6 instanceof X.C438721g
            if (r0 == 0) goto L_0x011f
            r0 = r6
            X.21g r0 = (X.C438721g) r0
            java.lang.Object r5 = r0.A0w
            X.C18070vi.A0W(r5)
            monitor-enter(r5)
            X.AEb r4 = r0.A00     // Catch:{ all -> 0x011c }
            r0 = 0
            if (r4 == 0) goto L_0x011a
            java.lang.String r3 = r4.A04     // Catch:{ all -> 0x011c }
            if (r3 == 0) goto L_0x0118
            int r0 = r3.length()     // Catch:{ all -> 0x011c }
            if (r0 == 0) goto L_0x0118
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x011c }
            r2.<init>()     // Catch:{ all -> 0x011c }
            java.lang.String r1 = "\n     "
            r2.append(r1)     // Catch:{ all -> 0x011c }
            java.lang.String r0 = r4.A05     // Catch:{ all -> 0x011c }
            r2.append(r0)     // Catch:{ all -> 0x011c }
            r2.append(r1)     // Catch:{ all -> 0x011c }
            r2.append(r3)     // Catch:{ all -> 0x011c }
            r2.append(r1)     // Catch:{ all -> 0x011c }
            java.lang.String r0 = r2.toString()     // Catch:{ all -> 0x011c }
            java.lang.String r0 = X.AnonymousClass1Y7.A01(r0)     // Catch:{ all -> 0x011c }
            goto L_0x011a
        L_0x0118:
            java.lang.String r0 = r4.A05     // Catch:{ all -> 0x011c }
        L_0x011a:
            monitor-exit(r5)
            return r0
        L_0x011c:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        L_0x011f:
            boolean r0 = r6 instanceof X.C445123s
            if (r0 == 0) goto L_0x0129
            r0 = r6
            X.23s r0 = (X.C445123s) r0
            java.lang.String r0 = r0.A00
            return r0
        L_0x0129:
            boolean r0 = r6 instanceof X.C442222p
            if (r0 == 0) goto L_0x013a
            r0 = r6
            X.22p r0 = (X.C442222p) r0
            java.lang.Object r1 = r0.A0w
            monitor-enter(r1)
            java.lang.String r0 = r0.A01     // Catch:{ all -> 0x0137 }
            monitor-exit(r1)     // Catch:{ all -> 0x0137 }
            return r0
        L_0x0137:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0137 }
            throw r0
        L_0x013a:
            boolean r0 = r6 instanceof X.AnonymousClass24P
            if (r0 == 0) goto L_0x0144
            r0 = r6
            X.24P r0 = (X.AnonymousClass24P) r0
            java.lang.String r0 = r0.A00
            return r0
        L_0x0144:
            java.lang.Object r3 = r6.A0w
            monitor-enter(r3)
            int r1 = r6.A02     // Catch:{ all -> 0x0164 }
            r0 = 1
            if (r1 != r0) goto L_0x014f
            monitor-exit(r3)     // Catch:{ all -> 0x0164 }
            r2 = 0
            return r2
        L_0x014f:
            java.lang.String r2 = r6.A0X     // Catch:{ all -> 0x0164 }
            if (r2 != 0) goto L_0x0162
            byte[] r1 = r6.A0s     // Catch:{ all -> 0x0164 }
            if (r1 == 0) goto L_0x0162
            java.lang.String r0 = X.C19620yd.A0A     // Catch:{ UnsupportedEncodingException -> 0x015f }
            java.lang.String r2 = new java.lang.String     // Catch:{ UnsupportedEncodingException -> 0x015f }
            r2.<init>(r1, r0)     // Catch:{ UnsupportedEncodingException -> 0x015f }
            goto L_0x0160
        L_0x015f:
            r2 = 0
        L_0x0160:
            r6.A0X = r2     // Catch:{ all -> 0x0164 }
        L_0x0162:
            monitor-exit(r3)     // Catch:{ all -> 0x0164 }
            return r2
        L_0x0164:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0164 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass206.A0P():java.lang.String");
    }

    public synchronized void A0p(byte[] bArr) {
        A15(bArr, false);
    }

    public synchronized void A15(byte[] bArr, boolean z) {
        boolean z2 = false;
        if (A0O() != null) {
            z2 = true;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("FMessage/setThumbnailBytes/should only be called on a message that supports thumbnails. Message type = ");
        sb.append(this.A0u);
        C17960vV.A0F(z2, sb.toString());
        AnonymousClass25F A092 = C18070vi.A09(this, C693336u.class);
        C693336u r1 = (C693336u) A092.A02;
        if (r1 != null) {
            byte[] bArr2 = null;
            if (z) {
                bArr2 = bArr;
            }
            A0o(bArr2);
            boolean z3 = !z;
            synchronized (r1) {
                r1.A01 = z3;
                r1.A00 = null;
                r1.A02 = bArr;
            }
            A092.A00();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0039, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0049, code lost:
        return r3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized boolean A16() {
        /*
            r4 = this;
            monitor-enter(r4)
            X.36u r0 = r4.A0O()     // Catch:{ all -> 0x004a }
            r3 = 0
            if (r0 == 0) goto L_0x0048
            java.lang.Class<X.36u> r0 = X.C693336u.class
            X.25F r2 = X.C18070vi.A09(r4, r0)     // Catch:{ all -> 0x004a }
            boolean r0 = r2.A03     // Catch:{ all -> 0x004a }
            r1 = 1
            if (r0 == 0) goto L_0x0022
            X.229 r0 = r2.A02     // Catch:{ all -> 0x004a }
            if (r0 == 0) goto L_0x0022
            X.229 r0 = r2.A02     // Catch:{ all -> 0x004a }
            X.36u r0 = (X.C693336u) r0     // Catch:{ all -> 0x004a }
            byte[] r0 = r0.A01()     // Catch:{ all -> 0x004a }
            if (r0 == 0) goto L_0x0022
            goto L_0x0038
        L_0x0022:
            int r0 = r4.A0B()     // Catch:{ all -> 0x004a }
            if (r0 != 0) goto L_0x003a
            java.lang.String r0 = r4.A0P()     // Catch:{ all -> 0x004a }
            if (r0 == 0) goto L_0x003a
            java.lang.String r0 = r4.A0P()     // Catch:{ all -> 0x004a }
            int r0 = r0.length()     // Catch:{ all -> 0x004a }
            if (r0 <= 0) goto L_0x003a
        L_0x0038:
            monitor-exit(r4)
            return r1
        L_0x003a:
            byte[] r0 = r4.A12()     // Catch:{ all -> 0x004a }
            if (r0 == 0) goto L_0x0048
            byte[] r0 = r4.A12()     // Catch:{ all -> 0x004a }
            int r0 = r0.length     // Catch:{ all -> 0x004a }
            if (r0 <= 0) goto L_0x0048
            r3 = 1
        L_0x0048:
            monitor-exit(r4)
            return r3
        L_0x004a:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass206.A16():boolean");
    }

    public static C62572rc A00(AnonymousClass21V r0) {
        C62572rc r02 = r0.A02;
        C17960vV.A07(r02);
        return r02;
    }

    public static IllegalArgumentException A02(AnonymousClass206 r2, String str, String str2, String str3, String str4) {
        StringBuilder sb = new StringBuilder();
        sb.append("Failed requirement: ");
        sb.append(r2.A0u);
        sb.append("; expected subclass of ");
        sb.append(str);
        sb.append(", but was ");
        sb.append(str2);
        sb.append(str3);
        sb.append(str4);
        return new IllegalArgumentException(sb.toString());
    }

    public static void A04(ContentValues contentValues, AnonymousClass206 r4) {
        contentValues.put("message_row_id", Long.valueOf(r4.A0x));
    }

    public int A0B() {
        int i;
        synchronized (this.A0w) {
            i = this.A02;
        }
        return i;
    }

    public int A0C() {
        if (this instanceof AnonymousClass22A) {
            return ((AnonymousClass22A) this).A01;
        }
        return this.A07;
    }

    public int A0D() {
        if (this instanceof C445623x) {
            return 6;
        }
        return this.A0C;
    }

    public int A0E() {
        if (this instanceof AnonymousClass212) {
            return 4;
        }
        return this.A0t;
    }

    public AnonymousClass1BI A0H() {
        if (this instanceof AnonymousClass2MN) {
            return null;
        }
        return this.A0K;
    }

    public UserJid A0I() {
        AnonymousClass1BI r0;
        int i;
        String str;
        if (this instanceof C436420i) {
            C436420i r1 = (C436420i) this;
            if (r1 instanceof AnonymousClass2MH) {
                return ((AnonymousClass2MH) r1).A01;
            }
            if (!(r1 instanceof AnonymousClass2MQ) && !(r1 instanceof AnonymousClass464)) {
                return null;
            }
            r0 = r1.A0H();
        } else if (A0w()) {
            return null;
        } else {
            if (C42701yb.A01(this.A0K)) {
                r0 = this.A0K;
            } else {
                try {
                    AnonymousClass205 r2 = this.A0v;
                    AnonymousClass1BI r02 = r2.A00;
                    if (C22971Dz.A0a(r02) && r2.A02) {
                        return AnonymousClass1E5.A00;
                    }
                    if (C22971Dz.A0e(r02) || C22971Dz.A0N(r02)) {
                        return (UserJid) this.A0K;
                    }
                    return (UserJid) r02;
                } catch (ClassCastException e) {
                    AnonymousClass205 r3 = this.A0v;
                    AnonymousClass1BI r03 = r3.A00;
                    if (r03 != null) {
                        i = r03.getType();
                    } else {
                        i = -1;
                    }
                    StringBuilder sb = new StringBuilder();
                    sb.append("FMessage/getSenderUserJid/key.id=");
                    sb.append(r3.A01);
                    sb.append("; key.ChatJidType=");
                    sb.append(i);
                    sb.append("; msg_type=");
                    sb.append(this.A0u);
                    sb.append("; senderJid=");
                    sb.append(this.A0K);
                    Log.e(sb.toString(), e);
                    AnonymousClass1BI r22 = this.A0K;
                    if (r22 != null) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("FMessage/getSenderUserJid/SenderJid type: ");
                        sb2.append(r22.getType());
                        str = sb2.toString();
                    } else {
                        str = "FMessage/getSenderUserJid/SenderJid is NULL";
                    }
                    Log.e(str);
                    return null;
                }
            }
        }
        return (UserJid) r0;
    }

    public C29721cl A0J() {
        Long l = this.A0T;
        boolean z = false;
        if (this.A05 > 0) {
            z = true;
        }
        long j = 0;
        if (!z && (l == null || l.longValue() <= 0)) {
            return null;
        }
        int i = this.A05;
        if (l != null) {
            j = l.longValue();
        }
        return new C29721cl(i, j, this.A00);
    }

    public AnonymousClass206 A0K() {
        if ((this instanceof C436420i) || (this instanceof C442622t) || (this instanceof C442822v) || (this instanceof AnonymousClass212)) {
            return null;
        }
        return this.A0L;
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [java.lang.Object, X.2b7] */
    public C52562b7 A0L() {
        C52562b7 r0 = this.A0M;
        if (r0 != null) {
            return r0;
        }
        ? obj = new Object();
        this.A0M = obj;
        return obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0011, code lost:
        r1 = r0.invoke();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.AnonymousClass25F A0M(java.lang.Class r4) {
        /*
            r3 = this;
            java.util.concurrent.ConcurrentHashMap r2 = r3.A1G
            r1 = 0
            X.3Dj r0 = new X.3Dj
            r0.<init>(r3, r4, r1)
            X.C18070vi.A0d(r2, r1)
            java.lang.Object r1 = r2.get(r4)
            if (r1 != 0) goto L_0x001c
            java.lang.Object r1 = r0.invoke()
            java.lang.Object r0 = r2.putIfAbsent(r4, r1)
            if (r0 == 0) goto L_0x001c
            r1 = r0
        L_0x001c:
            X.25F r1 = (X.AnonymousClass25F) r1
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass206.A0M(java.lang.Class):X.25F");
    }

    /* JADX WARNING: type inference failed for: r0v6, types: [java.lang.Object, X.229] */
    public C693336u A0O() {
        AnonymousClass25F A092 = C18070vi.A09(this, C693336u.class);
        if (A092.A02 == null && AnonymousClass25A.A0K(this.A0u)) {
            ? obj = new Object();
            synchronized (A092) {
                A092.A02 = obj;
            }
        }
        return (C693336u) A092.A02;
    }

    public String A0Q() {
        if (this instanceof AnonymousClass21V) {
            return ((AnonymousClass21V) this).A0A;
        }
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: X.21e} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v4, resolved type: X.21a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v7, resolved type: X.21e} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v8, resolved type: X.21e} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String A0R() {
        /*
            r3 = this;
            boolean r0 = r3 instanceof X.AnonymousClass210
            if (r0 != 0) goto L_0x00bb
            boolean r0 = r3 instanceof X.C436420i
            if (r0 != 0) goto L_0x00bb
            boolean r0 = r3 instanceof X.AnonymousClass22H
            if (r0 == 0) goto L_0x0012
            r0 = r3
            X.22H r0 = (X.AnonymousClass22H) r0
            java.lang.String r0 = r0.A05
            return r0
        L_0x0012:
            boolean r0 = r3 instanceof X.AnonymousClass21F
            if (r0 == 0) goto L_0x001c
            r0 = r3
            X.21F r0 = (X.AnonymousClass21F) r0
            java.lang.String r0 = r0.A00
            return r0
        L_0x001c:
            boolean r0 = r3 instanceof X.AnonymousClass219
            if (r0 == 0) goto L_0x0026
            r0 = r3
            X.219 r0 = (X.AnonymousClass219) r0
            java.lang.String r0 = r0.A03
            return r0
        L_0x0026:
            boolean r0 = r3 instanceof X.AnonymousClass21L
            if (r0 == 0) goto L_0x003e
            r2 = r3
            X.21L r2 = (X.AnonymousClass21L) r2
            r0 = 2097152(0x200000, double:1.0361308E-317)
            boolean r0 = r2.A11(r0)
            r1 = 0
            if (r0 == 0) goto L_0x003d
            X.AEt r0 = r2.A00
            if (r0 == 0) goto L_0x003d
            java.lang.String r1 = r0.A0B
        L_0x003d:
            return r1
        L_0x003e:
            boolean r0 = r3 instanceof X.AnonymousClass21V
            if (r0 == 0) goto L_0x0073
            r2 = r3
            X.21V r2 = (X.AnonymousClass21V) r2
            boolean r0 = r2 instanceof X.C438121a
            if (r0 == 0) goto L_0x005b
            X.21a r2 = (X.C438121a) r2
            r0 = 2097152(0x200000, double:1.0361308E-317)
            boolean r0 = r2.A11(r0)
            if (r0 == 0) goto L_0x006d
            X.AEt r0 = r2.A00
        L_0x0056:
            if (r0 == 0) goto L_0x00b9
            java.lang.String r0 = r0.A0B
            return r0
        L_0x005b:
            boolean r0 = r2 instanceof X.C438521e
            if (r0 == 0) goto L_0x0070
            X.21e r2 = (X.C438521e) r2
            r0 = 2097152(0x200000, double:1.0361308E-317)
            boolean r0 = r2.A11(r0)
            if (r0 == 0) goto L_0x006d
            X.AEt r0 = r2.A00
            goto L_0x0056
        L_0x006d:
            java.lang.String r0 = r2.A04
            return r0
        L_0x0070:
            java.lang.String r0 = r2.A04
            return r0
        L_0x0073:
            boolean r0 = r3 instanceof X.AnonymousClass23S
            if (r0 == 0) goto L_0x007d
            r0 = r3
            X.23S r0 = (X.AnonymousClass23S) r0
            java.lang.String r0 = r0.A04
            return r0
        L_0x007d:
            boolean r0 = r3 instanceof X.C445123s
            if (r0 == 0) goto L_0x0087
            r0 = r3
            X.23s r0 = (X.C445123s) r0
            java.lang.String r0 = r0.A00
            return r0
        L_0x0087:
            boolean r0 = r3 instanceof X.C442022n
            if (r0 == 0) goto L_0x0091
            r0 = r3
            X.22n r0 = (X.C442022n) r0
            java.lang.String r0 = r0.A00
            return r0
        L_0x0091:
            boolean r0 = r3 instanceof X.C442222p
            if (r0 == 0) goto L_0x009b
            r0 = r3
            X.22p r0 = (X.C442222p) r0
            java.lang.String r0 = r0.A00
            return r0
        L_0x009b:
            boolean r0 = r3 instanceof X.AnonymousClass24P
            if (r0 == 0) goto L_0x00a5
            r0 = r3
            X.24P r0 = (X.AnonymousClass24P) r0
            java.lang.String r0 = r0.A00
            return r0
        L_0x00a5:
            boolean r0 = r3 instanceof X.AnonymousClass24N
            if (r0 == 0) goto L_0x00af
            r0 = r3
            X.24N r0 = (X.AnonymousClass24N) r0
            java.lang.String r0 = r0.A02
            return r0
        L_0x00af:
            boolean r0 = r3 instanceof X.C445823z
            if (r0 == 0) goto L_0x00b9
            r0 = r3
            X.23z r0 = (X.C445823z) r0
            java.lang.String r0 = r0.A06
            return r0
        L_0x00b9:
            r0 = 0
            return r0
        L_0x00bb:
            java.lang.String r0 = r3.A0P()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass206.A0R():java.lang.String");
    }

    public String A0S() {
        String str;
        synchronized (this.A0w) {
            str = this.A0g;
        }
        return str;
    }

    public List A0T() {
        boolean z;
        String str;
        if (!(this instanceof C436420i)) {
            return this.A0i;
        }
        C436420i r1 = (C436420i) this;
        if (r1 instanceof AnonymousClass2MH) {
            z = false;
            str = "should not be called for FMessageSystemPayment";
        } else if (r1 instanceof C48392Mh) {
            return ((C48392Mh) r1).A01;
        } else {
            z = false;
            str = "should not be called for FMessageSystem";
        }
        C17960vV.A0F(z, str);
        return null;
    }

    public void A0U() {
        String str;
        if (this instanceof C436420i) {
            str = "Cannot change status for FMessageSystem";
        } else if (this instanceof AnonymousClass22J) {
            str = "Cannot change status for calls message type";
        } else {
            this.A0C = 0;
            return;
        }
        C17960vV.A0F(false, str);
    }

    public void A0V(int i) {
        this.A11 |= (long) i;
    }

    public void A0W(int i) {
        this.A08 = i | this.A08;
    }

    public void A0X(int i) {
        this.A11 &= (long) (i ^ -1);
    }

    public void A0Y(int i) {
        synchronized (this.A0w) {
            this.A02 = i;
        }
    }

    public void A0Z(int i) {
        if (!(this instanceof C442622t) && !(this instanceof C442822v)) {
            if (i <= 0) {
                this.A05 = 0;
                A0c(256);
                return;
            }
            this.A05 = i;
            A0b(256);
        }
    }

    public void A0a(int i) {
        if (C446824j.A00(this.A0C, i) > 0) {
            StringBuilder sb = new StringBuilder();
            sb.append("FMessage/setStatus/statusDowngrade/key=");
            sb.append(this.A0v);
            sb.append("; type=");
            sb.append(this.A0u);
            sb.append("; current=");
            sb.append(this.A0C);
            sb.append("; new=");
            sb.append(i);
            Log.e(sb.toString());
        }
        this.A0C = i;
    }

    public void A0b(long j) {
        this.A0E = j | this.A0E;
    }

    public void A0c(long j) {
        this.A0E = (j ^ -1) & this.A0E;
    }

    public void A0d(AnonymousClass1BI r4) {
        if (this instanceof C436420i) {
            C436420i r2 = (C436420i) this;
            if (r2 instanceof AnonymousClass2MH) {
                if (r4 == null) {
                    return;
                }
                if (!r2.A17()) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("should not be called for FMessageSystem, key = ");
                    sb.append(r2.A0v);
                    sb.append(" action = ");
                    sb.append(r2.A00);
                    C17960vV.A0F(false, sb.toString());
                }
            } else if (!(r2 instanceof AnonymousClass2MN) && r4 != null) {
                if (!r2.A17()) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("FMessageSystem/setRemoteResourceJid/should not be called for FMessageSystem, key = ");
                    sb2.append(r2.A0v);
                    sb2.append(" action = ");
                    sb2.append(r2.A00);
                    Log.e(sb2.toString());
                    return;
                }
            } else {
                return;
            }
            r2.A0K = r4;
            return;
        }
        this.A0K = r4;
        this.A0i = null;
    }

    public void A0e(AnonymousClass206 r4) {
        ArrayList arrayList;
        int i;
        this.A0x = r4.A0x;
        this.A0y = r4.A0y;
        this.A0I = r4.A0I;
        this.A0G = r4.A0G;
        this.A0K = r4.A0H();
        this.A13 = r4.A13;
        if (r4.A0T() != null) {
            arrayList = new ArrayList(r4.A0T());
        } else {
            arrayList = null;
        }
        this.A0i = arrayList;
        this.A0H = r4.A0H;
        this.A0m = r4.A0m;
        this.A0z = r4.A0z;
        A0W(r4.A08);
        AW0 A002 = AnonymousClass25B.A00(r4);
        AW0 A003 = AnonymousClass25B.A00(this);
        if (A002 != null && (A003 == null || !((i = A002.A03) == 4 || i == 20))) {
            AnonymousClass25B.A03(this, new AnonymousClass25E(A002, AnonymousClass25B.A01(r4)));
        }
        int i2 = r4.A05;
        if (i2 > 0) {
            this.A05 = i2;
            this.A0U = r4.A0U;
            this.A07 = r4.A07;
        }
    }

    public void A0f(AnonymousClass206 r4) {
        boolean z;
        String str;
        if (r4 != null) {
            if ((this instanceof C436420i) || (this instanceof C442622t) || (this instanceof C442822v) || (this instanceof AnonymousClass212)) {
                z = false;
            } else {
                z = true;
            }
            boolean z2 = false;
            if (!z) {
                str = "message type is not allowed to have a quoted message";
            } else if ((r4 instanceof C436420i) || (r4 instanceof C442622t) || (r4 instanceof C442822v) || (r4 instanceof AnonymousClass212)) {
                str = "message type can not be a quoted message";
            } else {
                if (r4.A0E() == 2) {
                    z2 = true;
                }
                C17960vV.A0F(z2, "quoted message should be marked StorageType.QUOTED");
                r4.A0f((AnonymousClass206) null);
            }
            C17960vV.A0F(false, str);
            return;
        }
        this.A0L = r4;
    }

    public void A0h(Long l) {
        if (this instanceof C442622t) {
            C17960vV.A07(l);
            C18070vi.A0b(l);
            ((C442622t) this).A01 = l.longValue();
            return;
        }
        if (this instanceof C442822v) {
            C17960vV.A0F(false, "For FMessageEphemeralSettingChange the setting timestamp is the timestamp");
        }
        this.A0T = l;
    }

    public void A0i(String str) {
        synchronized (this.A0w) {
            this.A0X = str;
            this.A0s = null;
        }
    }

    public void A0j(String str) {
        C438121a r2;
        C20285AEt aEt;
        C20285AEt aEt2;
        if ((this instanceof AnonymousClass210) || (this instanceof C436420i)) {
            A0i(str);
        } else if (this instanceof AnonymousClass22H) {
            AnonymousClass22H r0 = (AnonymousClass22H) this;
            if (str == null) {
                str = "";
            }
            r0.A05 = str;
        } else if (this instanceof AnonymousClass21F) {
            ((AnonymousClass21F) this).A00 = str;
        } else if (this instanceof AnonymousClass219) {
            ((AnonymousClass219) this).A03 = str;
        } else if (this instanceof AnonymousClass21L) {
            AnonymousClass21L r22 = (AnonymousClass21L) this;
            if (r22.A11(2097152) && (aEt2 = r22.A00) != null && aEt2.A0B != null) {
                aEt2.A0B = str;
            }
        } else if (this instanceof AnonymousClass21V) {
            AnonymousClass21V r23 = (AnonymousClass21V) this;
            if (r23 instanceof C438121a) {
                C438121a r24 = (C438121a) r23;
                boolean A112 = r24.A11(2097152);
                r2 = r24;
                if (A112) {
                    aEt = r24.A00;
                }
                r2.A04 = str;
                return;
            }
            boolean z = r23 instanceof C438521e;
            r2 = r23;
            if (z) {
                C438521e r25 = (C438521e) r23;
                boolean A113 = r25.A11(2097152);
                r2 = r25;
                if (A113) {
                    aEt = r25.A00;
                }
            }
            r2.A04 = str;
            return;
            if (aEt != null) {
                aEt.A0B = str;
            }
        } else if (this instanceof AnonymousClass23S) {
            ((AnonymousClass23S) this).A04 = str;
        } else if (this instanceof C445123s) {
            C445123s r02 = (C445123s) this;
            if (str != null) {
                r02.A00 = str;
            }
        } else if (this instanceof C442022n) {
            ((C442022n) this).A00 = str;
        } else if (this instanceof C442222p) {
            ((C442222p) this).A00 = str;
        } else if (this instanceof AnonymousClass24P) {
            AnonymousClass24P r03 = (AnonymousClass24P) this;
            if (str == null) {
                str = "";
            }
            r03.A00 = str;
        } else if (this instanceof AnonymousClass24N) {
            ((AnonymousClass24N) this).A02 = str;
        } else if (this instanceof C445823z) {
            C445823z r04 = (C445823z) this;
            if (str != null) {
                r04.A06 = str;
            }
        }
    }

    public void A0k(String str) {
        synchronized (this.A0w) {
            this.A0g = str;
        }
    }

    public void A0l(List list) {
        if (list == null || list.isEmpty()) {
            this.A0h = null;
            return;
        }
        this.A0h = new ArrayList(list);
        this.A11 |= 1;
    }

    public void A0m(List list) {
        boolean z;
        String str;
        if (this instanceof C436420i) {
            C436420i r1 = (C436420i) this;
            if (r1 instanceof AnonymousClass2MH) {
                z = false;
                str = "should not be called for FMessageSystemPayment";
            } else if (r1 instanceof C48392Mh) {
                C48392Mh r12 = (C48392Mh) r1;
                if (list == null) {
                    list = new ArrayList();
                }
                r12.A01 = list;
                return;
            } else {
                z = false;
                str = "should not be called for FMessageSystem";
            }
            C17960vV.A0F(z, str);
            return;
        }
        this.A0K = null;
        this.A0i = list;
    }

    public void A0n(boolean z) {
        synchronized (this.A0w) {
            this.A1E = z;
        }
    }

    public void A0o(byte[] bArr) {
        synchronized (this.A0w) {
            this.A0s = bArr;
            this.A0X = null;
            this.A02 = 1;
        }
    }

    public boolean A0q() {
        boolean z;
        synchronized (this.A0w) {
            z = this.A1E;
        }
        return z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000a, code lost:
        if (r3.A0s != null) goto L_0x000c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A0r() {
        /*
            r3 = this;
            java.lang.Object r2 = r3.A0w
            monitor-enter(r2)
            java.lang.String r0 = r3.A0X     // Catch:{ all -> 0x000f }
            if (r0 != 0) goto L_0x000c
            byte[] r1 = r3.A0s     // Catch:{ all -> 0x000f }
            r0 = 0
            if (r1 == 0) goto L_0x000d
        L_0x000c:
            r0 = 1
        L_0x000d:
            monitor-exit(r2)     // Catch:{ all -> 0x000f }
            return r0
        L_0x000f:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x000f }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass206.A0r():boolean");
    }

    public boolean A0s() {
        List list = this.A0h;
        if (list == null || list.isEmpty()) {
            return false;
        }
        return true;
    }

    public boolean A0t() {
        byte[] bArr = this.A1D;
        if (bArr == null || bArr.length <= 0) {
            return false;
        }
        return true;
    }

    public boolean A0u() {
        if (this.A0y < -1 || A11(1048576)) {
            return true;
        }
        return false;
    }

    public boolean A0v() {
        if ((this instanceof AnonymousClass22H) || (this instanceof AnonymousClass23U) || (this instanceof C445823z)) {
            return !A0w();
        }
        if (A0w() || !this.A0o) {
            return false;
        }
        return true;
    }

    public boolean A0w() {
        return C22971Dz.A0V(this.A0v.A00);
    }

    public boolean A0x() {
        C42691ya r0 = this.A0O;
        if (r0 == null || r0.hostStorage != 2) {
            return false;
        }
        return true;
    }

    public boolean A0y() {
        if ((this instanceof AnonymousClass24R) || (this instanceof C436420i) || (this instanceof C439721q) || (this instanceof AnonymousClass23U) || (this instanceof AnonymousClass2M1) || (this instanceof AnonymousClass22J) || (this instanceof AnonymousClass22M)) {
            return false;
        }
        return true;
    }

    public boolean A0z(int i) {
        long j = (long) i;
        if ((this.A11 & j) == j) {
            return true;
        }
        return false;
    }

    public boolean A10(int i) {
        if ((this.A08 & i) == i) {
            return true;
        }
        return false;
    }

    public boolean A11(long j) {
        if ((this.A0E & j) == j) {
            return true;
        }
        return false;
    }

    public byte[] A12() {
        byte[] bArr;
        String str;
        synchronized (this.A0w) {
            bArr = this.A0s;
            if (bArr == null && (str = this.A0X) != null) {
                try {
                    bArr = str.getBytes(C19620yd.A0A);
                } catch (UnsupportedEncodingException unused) {
                    bArr = null;
                }
                this.A0s = bArr;
            }
        }
        return bArr;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0005, code lost:
        if (r3 == r5) goto L_0x0007;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A14(int r5) {
        /*
            r4 = this;
            int r3 = r4.A0t
            if (r3 == 0) goto L_0x0007
            r2 = 0
            if (r3 != r5) goto L_0x0008
        L_0x0007:
            r2 = 1
        L_0x0008:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "FMessage/setStorageType/should only update storage type when it is undefined; current="
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = "; new="
            r1.append(r0)
            r1.append(r5)
            java.lang.String r0 = r1.toString()
            X.C17960vV.A0F(r2, r0)
            r4.A0t = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass206.A14(int):void");
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" key=");
        sb.append(this.A0v);
        sb.append(" media_wa_type=");
        sb.append(this.A0u);
        return sb.toString();
    }

    public AnonymousClass206(AnonymousClass205 r4, int i, long j) {
        C17960vV.A07(r4);
        this.A0v = r4;
        this.A0I = j;
        this.A0u = i;
        long uptimeMillis = SystemClock.uptimeMillis();
        this.A1F = uptimeMillis;
        this.A12 = uptimeMillis;
    }

    public static AnonymousClass229 A01(AnonymousClass206 r0, Class cls) {
        return r0.A0M(cls).A02;
    }

    public static String A03(AnonymousClass206 r0, String str, StringBuilder sb) {
        sb.append(str);
        sb.append(r0.A0v);
        return sb.toString();
    }

    public static void A05(AnonymousClass206 r0, AnonymousClass229 r1, Class cls) {
        r0.A0M(cls).A02(r1);
    }

    public static void A06(AnonymousClass206 r0, String str, StringBuilder sb) {
        sb.append(str);
        sb.append(r0.A0x);
    }

    public static void A07(AnonymousClass206 r0, String str, StringBuilder sb) {
        sb.append(str);
        sb.append(r0.A0u);
    }

    public static boolean A08(AnonymousClass206 r2) {
        return r2.A11(16777216);
    }

    public long A0F() {
        long j;
        if (A0s()) {
            j = 1;
        } else {
            j = 0;
        }
        if (this.A0L != null || this.A0F > 0) {
            j |= 2;
        }
        if (AnonymousClass25B.A01(this) != null) {
            j |= 4;
        }
        if (A0z(8)) {
            j |= 8;
        }
        if (A0z(16)) {
            j |= 16;
        }
        if (A0z(256)) {
            j |= 256;
        }
        if (A0z(16384)) {
            j |= 16384;
        }
        if (A0z(EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH)) {
            j |= 1024;
        }
        if (A0z(EditorInfoCompat.MEMORY_EFFICIENT_TEXT_LENGTH)) {
            j |= 2048;
        }
        if (A0z(ZipDecompressor.UNZIP_BUFFER_SIZE)) {
            j |= 4096;
        }
        if (AnonymousClass2UY.A00(this) != null) {
            j |= 32;
        }
        if (AnonymousClass9RV.A00(this) != null) {
            j |= 64;
        }
        if (AnonymousClass9RY.A00(this) != null) {
            j |= 128;
        }
        C20955Ac9 ac9 = (C20955Ac9) A0M(C20955Ac9.class).A02;
        if (!(ac9 == null || ac9.A03 == null)) {
            j |= 512;
        }
        if (A0M(C20952Ac6.class).A02 != null) {
            j |= 32768;
        }
        if (A0z(65536)) {
            return j | 65536;
        }
        return j;
    }

    public long A0G() {
        if (TextUtils.isEmpty(A0Q())) {
            A0c(64);
        }
        return this.A0E;
    }

    public void A0g(C194599rz r5) {
        A0L().A00 = r5;
        this.A11 |= 8;
    }

    public byte[] A13() {
        byte[] A122;
        String A0P2;
        if (A0B() == 0 && (A0P2 = A0P()) != null && A0P2.length() > 0) {
            try {
                return Base64.decode(A0P(), 0);
            } catch (IllegalArgumentException unused) {
                return null;
            }
        } else if (A0B() != 1 || (A122 = A12()) == null || A122.length <= 0) {
            return null;
        } else {
            return A122;
        }
    }
}
