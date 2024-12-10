package X;

import android.database.Cursor;
import android.os.SystemClock;
import android.telephony.PhoneNumberUtils;
import android.text.TextUtils;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.73Y  reason: invalid class name */
public class AnonymousClass73Y {
    public final AnonymousClass1M9 A00;
    public final AnonymousClass11C A01;
    public final AnonymousClass118 A02;
    public final C18000vb A03;
    public final AnonymousClass73C A04 = new AnonymousClass73C();

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public static X.C54032dU A03(X.AnonymousClass1M9 r5, X.AnonymousClass11C r6, X.AnonymousClass118 r7, X.C18000vb r8, X.C442222p r9) {
        /*
            monitor-enter(r9)
            java.lang.Object r4 = r9.A0w     // Catch:{ all -> 0x0031 }
            monitor-enter(r4)     // Catch:{ all -> 0x0031 }
            X.2dU r3 = r9.A02     // Catch:{ all -> 0x002e }
            monitor-exit(r4)     // Catch:{ all -> 0x002e }
            if (r3 != 0) goto L_0x002c
            r3 = 0
            java.lang.String r2 = r9.A17()     // Catch:{ 1iZ -> 0x0026 }
            X.73Y r0 = new X.73Y     // Catch:{ 1iZ -> 0x0026 }
            r0.<init>(r5, r6, r7, r8)     // Catch:{ 1iZ -> 0x0026 }
            r0.A05(r2)     // Catch:{ 1iZ -> 0x0026 }
            X.73C r1 = r0.A04     // Catch:{ 1iZ -> 0x0026 }
            X.2dU r0 = new X.2dU     // Catch:{ 1iZ -> 0x0026 }
            r0.<init>(r2, r1)     // Catch:{ 1iZ -> 0x0026 }
            monitor-enter(r4)     // Catch:{ 1iZ -> 0x0026 }
            r9.A02 = r0     // Catch:{ all -> 0x0023 }
            monitor-exit(r4)     // Catch:{ all -> 0x0023 }
            monitor-exit(r9)     // Catch:{ all -> 0x0031 }
            return r0
        L_0x0023:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0023 }
            throw r0     // Catch:{ 1iZ -> 0x0026 }
        L_0x0026:
            r1 = move-exception
            java.lang.String r0 = "Can't read VCard contact."
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x0031 }
        L_0x002c:
            monitor-exit(r9)     // Catch:{ all -> 0x0031 }
            return r3
        L_0x002e:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x002e }
            throw r0     // Catch:{ all -> 0x0031 }
        L_0x0031:
            r0 = move-exception
            monitor-exit(r9)     // Catch:{ all -> 0x0031 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass73Y.A03(X.1M9, X.11C, X.118, X.0vb, X.22p):X.2dU");
    }

    /* JADX WARNING: type inference failed for: r0v123, types: [X.6fc, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v170, types: [java.lang.Object, X.6jA] */
    /* JADX WARNING: type inference failed for: r1v40, types: [java.lang.Object, X.6jA] */
    /* JADX WARNING: type inference failed for: r7v3, types: [X.6z2, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:310:0x055f, code lost:
        r1 = r4.A04;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:334:0x05ba, code lost:
        r1 = r4.A04;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A06(X.C128926gu r27) {
        /*
            r26 = this;
            r5 = 0
            r2 = r27
            java.lang.String r1 = r2.A01
            java.lang.String r0 = "VCARD"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x05d1
            java.util.ArrayList r0 = r2.A02
            java.util.Iterator r19 = r0.iterator()
            r18 = 0
            r17 = 0
            r15 = 0
            r14 = 0
        L_0x0019:
            boolean r0 = r19.hasNext()
            r4 = r26
            if (r0 == 0) goto L_0x055d
            java.lang.Object r3 = r19.next()
            X.6tl r3 = (X.C136406tl) r3
            java.lang.String r1 = r3.A01
            java.lang.String r0 = r3.A02
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0019
            java.lang.String r0 = "VERSION"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x0019
            java.lang.String r0 = "FN"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x004a
            X.73C r0 = r4.A04
            X.6oE r1 = r0.A0A
            java.lang.String r0 = r3.A02
            r1.A01 = r0
            goto L_0x0019
        L_0x004a:
            java.lang.String r0 = "NAME"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x005f
            X.73C r0 = r4.A04
            X.6oE r2 = r0.A0A
            java.lang.String r0 = r2.A01
            if (r0 != 0) goto L_0x005f
            java.lang.String r0 = r3.A02
            r2.A01 = r0
            goto L_0x0019
        L_0x005f:
            java.lang.String r0 = "N"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0071
            X.73C r0 = r4.A04
            X.6oE r1 = r0.A0A
            java.util.List r0 = r3.A03
            X.AnonymousClass73C.A01(r0, r1)
            goto L_0x0019
        L_0x0071:
            java.lang.String r0 = "SORT-STRING"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0080
            X.73C r1 = r4.A04
            java.lang.String r0 = r3.A02
            r1.A01 = r0
            goto L_0x0019
        L_0x0080:
            java.lang.String r0 = "SOUND"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x00bb
            java.util.Set r1 = r3.A04
            java.lang.String r0 = "X-IRMC-N"
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L_0x052f
            X.73C r7 = r4.A04
            java.lang.String r0 = r7.A01
            if (r0 != 0) goto L_0x052f
            java.lang.StringBuilder r6 = X.AnonymousClass000.A10()
            java.lang.String r4 = r3.A02
            int r3 = r4.length()
            r2 = 0
        L_0x00a3:
            if (r2 >= r3) goto L_0x00b3
            char r1 = r4.charAt(r2)
            r0 = 59
            if (r1 == r0) goto L_0x00b0
            r6.append(r1)
        L_0x00b0:
            int r2 = r2 + 1
            goto L_0x00a3
        L_0x00b3:
            java.lang.String r0 = r6.toString()
            r7.A01 = r0
            goto L_0x0019
        L_0x00bb:
            java.lang.String r0 = "ADR"
            boolean r0 = r1.equals(r0)
            java.lang.String r10 = "X-"
            r2 = -1
            java.lang.String r9 = "PREF"
            java.lang.String r6 = ""
            java.lang.String r8 = "WORK"
            java.lang.String r7 = "HOME"
            if (r0 == 0) goto L_0x01dd
            java.util.List r13 = r3.A03
            java.util.Iterator r1 = r13.iterator()
        L_0x00d4:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0019
            java.lang.String r0 = X.C17880vN.A0v(r1)
            int r0 = r0.length()
            if (r0 <= 0) goto L_0x00d4
            java.util.Set r0 = r3.A04
            java.util.Iterator r16 = r0.iterator()
            r12 = r6
            r11 = 0
        L_0x00ec:
            boolean r0 = r16.hasNext()
            if (r0 == 0) goto L_0x0153
            java.lang.String r1 = X.C17880vN.A0v(r16)
            boolean r0 = r1.equals(r9)
            if (r0 == 0) goto L_0x0102
            if (r17 != 0) goto L_0x0102
            r17 = 1
            r11 = 1
            goto L_0x00ec
        L_0x0102:
            boolean r0 = r1.equalsIgnoreCase(r7)
            if (r0 == 0) goto L_0x010b
            r12 = r6
            r2 = 1
            goto L_0x00ec
        L_0x010b:
            boolean r0 = r1.equalsIgnoreCase(r8)
            if (r0 != 0) goto L_0x0150
            java.lang.String r0 = "COMPANY"
            boolean r0 = r1.equalsIgnoreCase(r0)
            if (r0 != 0) goto L_0x0150
            java.lang.String r0 = "POSTAL"
            boolean r0 = r1.equalsIgnoreCase(r0)
            if (r0 != 0) goto L_0x00ec
            java.lang.String r0 = "PARCEL"
            boolean r0 = r1.equalsIgnoreCase(r0)
            if (r0 != 0) goto L_0x00ec
            java.lang.String r0 = "DOM"
            boolean r0 = r1.equalsIgnoreCase(r0)
            if (r0 != 0) goto L_0x00ec
            java.lang.String r0 = "INTL"
            boolean r0 = r1.equalsIgnoreCase(r0)
            if (r0 != 0) goto L_0x00ec
            java.lang.String r0 = X.C108955ca.A0y(r1)
            boolean r0 = r0.startsWith(r10)
            if (r0 == 0) goto L_0x014c
            if (r2 >= 0) goto L_0x00ec
            r0 = 2
            java.lang.String r12 = r1.substring(r0)
        L_0x014a:
            r2 = 0
            goto L_0x00ec
        L_0x014c:
            if (r2 >= 0) goto L_0x00ec
            r12 = r1
            goto L_0x014a
        L_0x0150:
            r12 = r6
            r2 = 2
            goto L_0x00ec
        L_0x0153:
            if (r2 >= 0) goto L_0x0156
            r2 = 1
        L_0x0156:
            int r1 = r13.size()
            r0 = 1
            if (r1 <= r0) goto L_0x01d9
            X.6z2 r7 = new X.6z2
            r7.<init>()
            int r1 = r13.size()
            r0 = 2
            if (r1 <= r0) goto L_0x016f
            java.lang.String r0 = X.C17880vN.A0w(r13, r0)
            r7.A03 = r0
        L_0x016f:
            int r1 = r13.size()
            r0 = 3
            if (r1 <= r0) goto L_0x017c
            java.lang.String r0 = X.C17880vN.A0w(r13, r0)
            r7.A00 = r0
        L_0x017c:
            int r1 = r13.size()
            r0 = 4
            if (r1 <= r0) goto L_0x0189
            java.lang.String r0 = X.C17880vN.A0w(r13, r0)
            r7.A02 = r0
        L_0x0189:
            int r1 = r13.size()
            r0 = 5
            if (r1 <= r0) goto L_0x0196
            java.lang.String r0 = X.C17880vN.A0w(r13, r0)
            r7.A04 = r0
        L_0x0196:
            int r1 = r13.size()
            r0 = 6
            if (r1 <= r0) goto L_0x01a3
            java.lang.String r0 = X.C17880vN.A0w(r13, r0)
            r7.A01 = r0
        L_0x01a3:
            int r1 = r13.size()
            r0 = 7
            if (r1 <= r0) goto L_0x01ad
            r13.get(r0)
        L_0x01ad:
            java.lang.String r0 = r7.toString()
            java.lang.String r6 = r0.trim()
        L_0x01b5:
            X.73C r0 = r4.A04
            java.util.List r3 = r0.A03
            if (r3 != 0) goto L_0x01c1
            java.util.ArrayList r3 = X.AnonymousClass000.A13()
            r0.A03 = r3
        L_0x01c1:
            X.6jA r1 = new X.6jA
            r1.<init>()
            java.lang.Class<android.provider.ContactsContract$CommonDataKinds$StructuredPostal> r0 = android.provider.ContactsContract.CommonDataKinds.StructuredPostal.class
            r1.A01 = r0
            r1.A00 = r2
            r1.A02 = r6
            r1.A04 = r7
            r1.A03 = r12
            r1.A05 = r11
            r3.add(r1)
            goto L_0x0019
        L_0x01d9:
            java.lang.String r6 = r3.A02
            r7 = 0
            goto L_0x01b5
        L_0x01dd:
            java.lang.String r0 = "ORG"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x020c
            java.util.Set r0 = r3.A04
            java.util.Iterator r1 = r0.iterator()
        L_0x01eb:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x01ff
            java.lang.String r0 = X.C17880vN.A0v(r1)
            boolean r0 = r0.equals(r9)
            if (r0 == 0) goto L_0x01eb
            if (r14 != 0) goto L_0x01eb
            r14 = 1
            goto L_0x01eb
        L_0x01ff:
            X.73C r1 = r4.A04
            java.util.List r0 = r3.A03
            java.lang.String r0 = A01(r0)
            r1.A04(r0, r6)
            goto L_0x0019
        L_0x020c:
            java.lang.String r0 = "TITLE"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x0536
            java.lang.String r0 = "ROLE"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x0536
            java.lang.String r0 = "PHOTO"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0244
            java.lang.String r0 = r3.A02
            byte[] r2 = r0.getBytes()
            X.73C r1 = r4.A04
            r0 = 0
            r1.A0B = r0
            if (r2 == 0) goto L_0x0019
            int r0 = r2.length
            if (r0 <= 0) goto L_0x0019
            byte[] r0 = android.util.Base64.decode(r2, r5)     // Catch:{ ArrayIndexOutOfBoundsException | IllegalArgumentException | StringIndexOutOfBoundsException -> 0x023c }
            r1.A0B = r0     // Catch:{ ArrayIndexOutOfBoundsException | IllegalArgumentException | StringIndexOutOfBoundsException -> 0x023c }
            goto L_0x0019
        L_0x023c:
            r1 = move-exception
            java.lang.String r0 = "contactstruct/constructcontactfromvnode/base64-decode/error"
            com.whatsapp.util.Log.e(r0, r1)
            goto L_0x0019
        L_0x0244:
            java.lang.String r0 = "LOGO"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0253
            java.lang.String r0 = "name/LOGO/we_don't_support"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            goto L_0x0019
        L_0x0253:
            java.lang.String r0 = "EMAIL"
            boolean r0 = r1.equals(r0)
            java.lang.String r6 = "CELL"
            if (r0 == 0) goto L_0x02a9
            java.util.Set r0 = r3.A04
            java.util.Iterator r13 = r0.iterator()
            r12 = 0
            r11 = 0
        L_0x0265:
            boolean r0 = r13.hasNext()
            if (r0 == 0) goto L_0x0379
            java.lang.String r1 = X.C17880vN.A0v(r13)
            boolean r0 = r1.equals(r9)
            if (r0 == 0) goto L_0x027a
            if (r15 != 0) goto L_0x027a
            r15 = 1
            r11 = 1
            goto L_0x0265
        L_0x027a:
            boolean r0 = r1.equalsIgnoreCase(r7)
            if (r0 == 0) goto L_0x0282
            r2 = 1
            goto L_0x0265
        L_0x0282:
            boolean r0 = r1.equalsIgnoreCase(r8)
            if (r0 == 0) goto L_0x028a
            r2 = 2
            goto L_0x0265
        L_0x028a:
            boolean r0 = r1.equalsIgnoreCase(r6)
            if (r0 == 0) goto L_0x0292
            r2 = 4
            goto L_0x0265
        L_0x0292:
            java.lang.String r0 = X.C108955ca.A0y(r1)
            boolean r0 = r0.startsWith(r10)
            if (r0 == 0) goto L_0x02a6
            if (r2 >= 0) goto L_0x0265
            r0 = 2
            java.lang.String r1 = r1.substring(r0)
        L_0x02a3:
            r12 = r1
            r2 = 0
            goto L_0x0265
        L_0x02a6:
            if (r2 >= 0) goto L_0x0265
            goto L_0x02a3
        L_0x02a9:
            java.lang.String r0 = "TEL"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x036a
            java.util.Set r0 = r3.A04
            java.util.Iterator r12 = r0.iterator()
            r23 = r7
            r11 = 0
            r25 = 0
        L_0x02bc:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L_0x034d
            java.lang.String r1 = X.C17880vN.A0v(r12)
            if (r11 == 0) goto L_0x02e2
            boolean r0 = r1.equals(r7)
            if (r0 == 0) goto L_0x02da
            r2 = 5
        L_0x02cf:
            android.content.ContentValues r1 = r3.A00
            java.lang.String r0 = "waId"
            java.lang.String r1 = r1.getAsString(r0)
            if (r1 == 0) goto L_0x0359
            goto L_0x0352
        L_0x02da:
            boolean r0 = r1.equals(r8)
            if (r0 == 0) goto L_0x034d
            r2 = 4
            goto L_0x02cf
        L_0x02e2:
            boolean r0 = r1.equals(r9)
            if (r0 == 0) goto L_0x02ef
            if (r18 != 0) goto L_0x02ef
            r18 = 1
            r25 = 1
            goto L_0x02bc
        L_0x02ef:
            boolean r0 = r1.equalsIgnoreCase(r7)
            if (r0 == 0) goto L_0x02f7
            r2 = 1
            goto L_0x02bc
        L_0x02f7:
            boolean r0 = r1.equalsIgnoreCase(r8)
            if (r0 == 0) goto L_0x02ff
            r2 = 3
            goto L_0x02bc
        L_0x02ff:
            boolean r0 = r1.equalsIgnoreCase(r6)
            if (r0 != 0) goto L_0x034a
            java.lang.String r0 = "MOBILE"
            boolean r0 = r1.equalsIgnoreCase(r0)
            if (r0 != 0) goto L_0x034a
            java.lang.String r0 = "PAGER"
            boolean r0 = r1.equalsIgnoreCase(r0)
            if (r0 == 0) goto L_0x0317
            r2 = 6
            goto L_0x02bc
        L_0x0317:
            java.lang.String r0 = "FAX"
            boolean r0 = r1.equalsIgnoreCase(r0)
            if (r0 == 0) goto L_0x0321
            r11 = 1
            goto L_0x02bc
        L_0x0321:
            java.lang.String r0 = "VOICE"
            boolean r0 = r1.equalsIgnoreCase(r0)
            if (r0 != 0) goto L_0x02bc
            java.lang.String r0 = "MSG"
            boolean r0 = r1.equalsIgnoreCase(r0)
            if (r0 != 0) goto L_0x02bc
            java.lang.String r0 = X.C108955ca.A0y(r1)
            boolean r0 = r0.startsWith(r10)
            if (r0 == 0) goto L_0x0345
            if (r2 >= 0) goto L_0x02bc
            r0 = 2
            java.lang.String r23 = r1.substring(r0)
        L_0x0342:
            r2 = 0
            goto L_0x02bc
        L_0x0345:
            if (r2 >= 0) goto L_0x02bc
            r23 = r1
            goto L_0x0342
        L_0x034a:
            r2 = 2
            goto L_0x02bc
        L_0x034d:
            if (r2 >= 0) goto L_0x02cf
            r2 = 1
            goto L_0x02cf
        L_0x0352:
            X.1Dx r0 = com.whatsapp.jid.PhoneUserJid.Companion     // Catch:{ 11T -> 0x0359 }
            com.whatsapp.jid.PhoneUserJid r21 = X.C22951Dx.A01(r1)     // Catch:{ 11T -> 0x0359 }
            goto L_0x035b
        L_0x0359:
            r21 = 0
        L_0x035b:
            X.73C r1 = r4.A04
            java.lang.String r0 = r3.A02
            r20 = r1
            r22 = r0
            r24 = r2
            r20.A03(r21, r22, r23, r24, r25)
            goto L_0x0019
        L_0x036a:
            java.lang.String r0 = "NOTE"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x03a0
            X.73C r0 = r4.A04
            java.util.List r1 = r0.A04
            java.lang.String r0 = r3.A02
            goto L_0x039b
        L_0x0379:
            if (r2 >= 0) goto L_0x037c
            r2 = 3
        L_0x037c:
            X.73C r0 = r4.A04
            java.lang.Class<android.provider.ContactsContract$CommonDataKinds$Email> r4 = android.provider.ContactsContract.CommonDataKinds.Email.class
            java.lang.String r3 = r3.A02
            java.util.List r1 = r0.A03
            if (r1 != 0) goto L_0x038c
            java.util.ArrayList r1 = X.AnonymousClass000.A13()
            r0.A03 = r1
        L_0x038c:
            X.6jA r0 = new X.6jA
            r0.<init>()
            r0.A01 = r4
            r0.A00 = r2
            r0.A02 = r3
            r0.A03 = r12
            r0.A05 = r11
        L_0x039b:
            r1.add(r0)
            goto L_0x0019
        L_0x03a0:
            java.lang.String r0 = "BDAY"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x03cf
            X.73C r4 = r4.A04
            java.lang.String r2 = r3.A02
            if (r2 == 0) goto L_0x03ca
            java.lang.String r0 = "1604"
            boolean r0 = r2.startsWith(r0)
            if (r0 == 0) goto L_0x03ca
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "-"
            r1.append(r0)
            r0 = 4
            java.lang.String r0 = r2.substring(r0)
            java.lang.String r0 = X.AnonymousClass000.A0y(r0, r1)
            r3.A02 = r0
        L_0x03ca:
            r4.A05(r3)
            goto L_0x0019
        L_0x03cf:
            java.lang.String r0 = "URL"
            boolean r0 = r1.equals(r0)
            java.lang.String r2 = "PROFILE"
            if (r0 == 0) goto L_0x0449
            java.lang.String r6 = r3.A02
            java.util.Set r0 = r3.A04
            java.util.Iterator r9 = r0.iterator()
            r3 = -1
        L_0x03e2:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x042c
            java.lang.String r1 = X.C17880vN.A0v(r9)
            java.lang.String r0 = "BLOG"
            boolean r0 = r1.equalsIgnoreCase(r0)
            if (r0 == 0) goto L_0x03f6
            r3 = 2
            goto L_0x03e2
        L_0x03f6:
            java.lang.String r0 = "FTP"
            boolean r0 = r1.equalsIgnoreCase(r0)
            if (r0 == 0) goto L_0x0400
            r3 = 6
            goto L_0x03e2
        L_0x0400:
            boolean r0 = r1.equalsIgnoreCase(r7)
            if (r0 == 0) goto L_0x0408
            r3 = 4
            goto L_0x03e2
        L_0x0408:
            java.lang.String r0 = "HOMEPAGE"
            boolean r0 = r1.equalsIgnoreCase(r0)
            if (r0 == 0) goto L_0x0412
            r3 = 1
            goto L_0x03e2
        L_0x0412:
            java.lang.String r0 = "OTHER"
            boolean r0 = r1.equalsIgnoreCase(r0)
            if (r0 == 0) goto L_0x041c
            r3 = 7
            goto L_0x03e2
        L_0x041c:
            boolean r0 = r1.equalsIgnoreCase(r2)
            if (r0 == 0) goto L_0x0424
            r3 = 3
            goto L_0x03e2
        L_0x0424:
            boolean r0 = r1.equalsIgnoreCase(r8)
            if (r0 == 0) goto L_0x03e2
            r3 = 5
            goto L_0x03e2
        L_0x042c:
            X.73C r0 = r4.A04
            java.util.List r1 = r0.A07
            if (r1 != 0) goto L_0x0438
            java.util.ArrayList r1 = X.AnonymousClass000.A13()
            r0.A07 = r1
        L_0x0438:
            X.6fc r0 = new X.6fc
            r0.<init>()
            r0.A00 = r3
            X.C17960vV.A07(r6)
            r0.A01 = r6
            r1.add(r0)
            goto L_0x0019
        L_0x0449:
            java.lang.String r0 = "REV"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x052f
            java.lang.String r0 = "UID"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x052f
            java.lang.String r0 = "KEY"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x052f
            java.lang.String r0 = "MAILER"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x052f
            java.lang.String r0 = "TZ"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x052f
            java.lang.String r0 = "GEO"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x052f
            java.lang.String r0 = "NICKNAME"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x052f
            java.lang.String r0 = "CLASS"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x052f
            boolean r0 = r1.equals(r2)
            if (r0 != 0) goto L_0x052f
            java.lang.String r0 = "CATEGORIES"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x052f
            java.lang.String r0 = "SOURCE"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x052f
            java.lang.String r0 = "PRODID"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x052f
            java.lang.String r0 = "X-PHONETIC-FIRST-NAME"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x04b9
            X.73C r0 = r4.A04
            X.6oE r1 = r0.A0A
            java.lang.String r0 = r3.A02
            r1.A04 = r0
            goto L_0x0019
        L_0x04b9:
            java.lang.String r0 = "X-PHONETIC-MIDDLE-NAME"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x0019
            java.lang.String r0 = "X-PHONETIC-LAST-NAME"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x04d3
            X.73C r0 = r4.A04
            X.6oE r1 = r0.A0A
            java.lang.String r0 = r3.A02
            r1.A05 = r0
            goto L_0x0019
        L_0x04d3:
            java.lang.String r0 = "X-WA-BIZ-NAME"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x04e5
            X.73C r0 = r4.A04
            X.6oE r1 = r0.A0A
            java.lang.String r0 = r3.A02
            r1.A08 = r0
            goto L_0x0019
        L_0x04e5:
            java.lang.String r0 = "X-WA-BIZ-DESCRIPTION"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x04f5
            X.73C r1 = r4.A04
            java.lang.String r0 = r3.A02
            r1.A02 = r0
            goto L_0x0019
        L_0x04f5:
            java.lang.String r0 = "X-WA-BIZ-AUTOMATED-TYPE"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0505
            X.73C r1 = r4.A04
            java.lang.String r0 = r3.A02
            r1.A00 = r0
            goto L_0x0019
        L_0x0505:
            java.lang.String r0 = "X-WA-LID"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x051d
            X.73C r0 = r4.A04
            X.6fa r2 = r0.A09
            java.lang.String r1 = r3.A02
            X.1yH r0 = X.AnonymousClass1E2.A01
            X.1E2 r0 = r0.A02(r1)
            r2.A00 = r0
            goto L_0x0019
        L_0x051d:
            java.lang.String r0 = "X-WA-LID-DISPLAY-NAME"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x052f
            X.73C r0 = r4.A04
            X.6fa r1 = r0.A09
            java.lang.String r0 = r3.A02
            r1.A01 = r0
            goto L_0x0019
        L_0x052f:
            X.73C r0 = r4.A04
            r0.A05(r3)
            goto L_0x0019
        L_0x0536:
            X.73C r4 = r4.A04
            java.lang.String r3 = r3.A02
            java.util.List r0 = r4.A05
            if (r0 != 0) goto L_0x0544
            java.util.ArrayList r0 = X.AnonymousClass000.A13()
            r4.A05 = r0
        L_0x0544:
            int r2 = r0.size()
            r1 = 1
            if (r2 != 0) goto L_0x0550
            r0 = 0
            r4.A04(r6, r0)
            r2 = 1
        L_0x0550:
            java.util.List r0 = r4.A05
            int r2 = r2 - r1
            java.lang.Object r0 = r0.get(r2)
            X.6fb r0 = (X.C128196fb) r0
            r0.A01 = r3
            goto L_0x0019
        L_0x055d:
            if (r18 != 0) goto L_0x0576
            X.73C r1 = r4.A04
            java.util.List r0 = r1.A06
            if (r0 == 0) goto L_0x0576
            int r0 = r0.size()
            if (r0 <= 0) goto L_0x0576
            java.util.List r0 = r1.A06
            java.lang.Object r1 = r0.get(r5)
            X.6ib r1 = (X.C129926ib) r1
            r0 = 1
            r1.A04 = r0
        L_0x0576:
            if (r17 != 0) goto L_0x0597
            X.73C r0 = r4.A04
            java.util.List r0 = r0.A03
            if (r0 == 0) goto L_0x0597
            java.util.Iterator r3 = r0.iterator()
        L_0x0582:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0597
            java.lang.Object r2 = r3.next()
            X.6jA r2 = (X.C130276jA) r2
            java.lang.Class r1 = r2.A01
            java.lang.Class<android.provider.ContactsContract$CommonDataKinds$StructuredPostal> r0 = android.provider.ContactsContract.CommonDataKinds.StructuredPostal.class
            if (r1 != r0) goto L_0x0582
            r0 = 1
            r2.A05 = r0
        L_0x0597:
            if (r15 != 0) goto L_0x05b8
            X.73C r0 = r4.A04
            java.util.List r0 = r0.A03
            if (r0 == 0) goto L_0x05b8
            java.util.Iterator r3 = r0.iterator()
        L_0x05a3:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x05b8
            java.lang.Object r2 = r3.next()
            X.6jA r2 = (X.C130276jA) r2
            java.lang.Class r1 = r2.A01
            java.lang.Class<android.provider.ContactsContract$CommonDataKinds$Email> r0 = android.provider.ContactsContract.CommonDataKinds.Email.class
            if (r1 != r0) goto L_0x05a3
            r0 = 1
            r2.A05 = r0
        L_0x05b8:
            if (r14 != 0) goto L_0x05cb
            X.73C r1 = r4.A04
            java.util.List r0 = r1.A05
            if (r0 == 0) goto L_0x05cb
            int r0 = r0.size()
            if (r0 <= 0) goto L_0x05cb
            java.util.List r0 = r1.A05
            r0.get(r5)
        L_0x05cb:
            X.73C r0 = r4.A04
            r4.A07(r0)
            return
        L_0x05d1:
            java.lang.String r1 = "Non VCARD data is inserted."
            com.whatsapp.util.Log.e((java.lang.String) r1)
            X.1iZ r0 = new X.1iZ
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass73Y.A06(X.6gu):void");
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [X.6xA, java.lang.Object] */
    public static ArrayList A02(AnonymousClass1M9 r5, AnonymousClass11C r6, AnonymousClass118 r7, C18000vb r8, List list) {
        ? obj = new Object();
        ArrayList A14 = AnonymousClass000.A14(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            try {
                C138486xA.A00(C17880vN.A0v(it), A14, obj, new AnonymousClass73Y(r5, r6, r7, r8));
            } catch (C33281iZ unused) {
            }
        }
        int i = obj.A01;
        if (i > 0 || obj.A00 > 0) {
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("contactstruct/construct/too_long=");
            A10.append(i);
            A10.append("; exceed_max=");
            Log.w(C17880vN.A0t(A10, obj.A00));
        }
        return A14;
    }

    public void A04(C26911Ty r8) {
        String str;
        AnonymousClass73C r4 = this.A04;
        List<C129926ib> list = r4.A06;
        if (list != null) {
            for (C129926ib r3 : list) {
                AnonymousClass1E7 A0J = this.A00.A0J(r3.A02, true);
                if (A0J != null) {
                    if (A0J.A0C()) {
                        C133136oE r1 = r4.A0A;
                        r1.A08 = r1.A01;
                        UserJid A0x = AnonymousClass3MZ.A0x(A0J);
                        String A09 = r8.A09(A0x);
                        if (!TextUtils.isEmpty(A09)) {
                            r4.A02 = A09;
                        }
                        if (A0x != null) {
                            int A0I = ((AnonymousClass9CB) r8.A04.getValue()).A0I(A0x);
                            if (A0I == 1) {
                                str = "1p_partial";
                            } else if (A0I == 2) {
                                str = "3p_full";
                            }
                            r4.A00 = str;
                        }
                    }
                    UserJid A0x2 = AnonymousClass3MZ.A0x(A0J);
                    if (A0J.A10 && A0x2 != null) {
                        r3.A01 = A0x2;
                        return;
                    }
                } else {
                    return;
                }
            }
        }
    }

    public void A07(AnonymousClass73C r11) {
        Cursor A032;
        boolean z;
        Map map;
        String str;
        String A05;
        String str2;
        String str3;
        String str4;
        List list = r11.A06;
        if (list != null) {
            ArrayList A14 = AnonymousClass000.A14(list);
            for (C129926ib r1 : r11.A06) {
                if (r1.A01 == null && (str4 = r1.A02) != null) {
                    int indexOf = str4.indexOf(44);
                    if (indexOf != -1) {
                        str4 = str4.substring(0, indexOf);
                    }
                    A14.add(PhoneNumberUtils.stripSeparators(str4.trim()));
                }
            }
            long uptimeMillis = SystemClock.uptimeMillis();
            AnonymousClass1M2 r7 = this.A00.A04;
            if (A14.isEmpty()) {
                map = Collections.emptyMap();
            } else {
                boolean z2 = false;
                if (A14.size() <= 10) {
                    z2 = true;
                }
                C17960vV.A0D(z2);
                Iterator it = A14.iterator();
                while (it.hasNext()) {
                    String A0v = C17880vN.A0v(it);
                    if (A0v != null) {
                        int length = A0v.length();
                        z = true;
                        if (length <= 30) {
                            C17960vV.A0D(z);
                        }
                    }
                    z = false;
                    C17960vV.A0D(z);
                }
                HashMap hashMap = new HashMap(A14.size());
                C28781at A052 = r7.A00.get();
                try {
                    int size = A14.size();
                    String str5 = C42631yU.A0A;
                    StringBuilder A10 = AnonymousClass000.A10();
                    A10.append("SELECT wa_contacts.jid, number FROM wa_contacts LEFT JOIN wa_vnames ON (wa_contacts.jid = wa_vnames.jid) LEFT JOIN wa_group_descriptions ON (wa_contacts.jid = wa_group_descriptions.jid) LEFT JOIN wa_group_admin_settings ON (wa_contacts.jid = wa_group_admin_settings.jid) LEFT JOIN wa_biz_profiles ON (wa_contacts.jid = wa_biz_profiles.jid) WHERE ");
                    A10.append("number IN ");
                    A032 = C24861Ly.A03(A052, AnonymousClass000.A0y(AnonymousClass1H2.A00(size), A10), "GET_JIDS_BY_PHONE_NUMBERS", C17890vO.A1b(A14, 0));
                    int columnIndexOrThrow = A032.getColumnIndexOrThrow("jid");
                    int columnIndexOrThrow2 = A032.getColumnIndexOrThrow("number");
                    while (A032.moveToNext()) {
                        UserJid A022 = C22941Dw.A02(A032.getString(columnIndexOrThrow));
                        String string = A032.getString(columnIndexOrThrow2);
                        if (!(A022 == null || string == null)) {
                            hashMap.put(string, A022);
                        }
                    }
                    A032.close();
                    A052.close();
                    map = hashMap;
                } catch (Throwable th) {
                    try {
                        A052.close();
                        throw th;
                    } catch (Throwable th2) {
                        AnonymousClass0DT.A00(th, th2);
                        throw th;
                    }
                }
            }
            r11.A0C.A03 = SystemClock.uptimeMillis() - uptimeMillis;
            for (C129926ib r3 : r11.A06) {
                AnonymousClass1BI r0 = r3.A01;
                if (r0 == null) {
                    String str6 = r3.A02;
                    int indexOf2 = str6.indexOf(44);
                    if (indexOf2 != -1) {
                        str6 = str6.substring(0, indexOf2);
                    }
                    r0 = (AnonymousClass1BI) map.get(PhoneNumberUtils.stripSeparators(str6.trim()));
                    if (r0 == null) {
                        A05 = r3.A02.trim();
                        r3.A02 = A05;
                    }
                }
                A05 = AnonymousClass17K.A05(r0);
                if (!(A05 == null || (str2 = r3.A02) == null || r3.A01 != null)) {
                    int indexOf3 = str2.indexOf(44);
                    if (indexOf3 != -1) {
                        str3 = str2.substring(indexOf3 + 1);
                    } else {
                        str3 = "";
                    }
                    String stripSeparators = PhoneNumberUtils.stripSeparators(str3.trim());
                    if (!TextUtils.isEmpty(stripSeparators)) {
                        A05 = C17890vO.A0Z(stripSeparators, AnonymousClass000.A11(A05), ',');
                    }
                }
                r3.A02 = A05;
            }
            for (C129926ib r2 : r11.A06) {
                if (r2.A00 == 0 && ((str = r2.A03) == null || str.equalsIgnoreCase("null"))) {
                    r2.A03 = this.A02.A00.getString(2131892957);
                }
            }
            return;
        }
        return;
        throw th;
    }

    public AnonymousClass73Y(AnonymousClass1M9 r2, AnonymousClass11C r3, AnonymousClass118 r4, C18000vb r5) {
        this.A02 = r4;
        this.A00 = r2;
        this.A01 = r3;
        this.A03 = r5;
    }

    public static String A00(AnonymousClass1M9 r9, AnonymousClass11C r10, AnonymousClass118 r11, C18000vb r12, String str) {
        AnonymousClass73C r0;
        C128926gu A002 = AnonymousClass73C.A00(str);
        if (A002 != null) {
            Iterator it = A002.A02.iterator();
            C136406tl r5 = null;
            C136406tl r3 = null;
            C136406tl r2 = null;
            while (it.hasNext()) {
                C136406tl r1 = (C136406tl) it.next();
                String str2 = r1.A01;
                if (!TextUtils.isEmpty(r1.A02)) {
                    if ("FN".equals(str2)) {
                        r5 = r1;
                    } else if ("NAME".equals(str2)) {
                        r3 = r1;
                    } else if ("ORG".equals(str2) && r2 == null) {
                        r2 = r1;
                    }
                }
            }
            if (r5 != null) {
                return r5.A02;
            }
            if (r3 != null) {
                return r3.A02;
            }
            if (r2 != null) {
                return A01(r2.A03);
            }
            AnonymousClass73Y r02 = new AnonymousClass73Y(r9, r10, r11, r12);
            try {
                r02.A06(A002);
                r0 = r02.A04;
            } catch (C33281iZ unused) {
                r0 = null;
            }
            if (r0 != null) {
                return r0.A02();
            }
        }
        return null;
    }

    public static String A01(List list) {
        StringBuilder A10 = AnonymousClass000.A10();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            A10.append(C17880vN.A0v(it));
            if (it.hasNext()) {
                A10.append(' ');
            }
        }
        return A10.toString();
    }

    public void A05(String str) {
        long uptimeMillis = SystemClock.uptimeMillis();
        C128926gu A002 = AnonymousClass73C.A00(str);
        long uptimeMillis2 = SystemClock.uptimeMillis();
        if (A002 != null) {
            try {
                A06(A002);
                long uptimeMillis3 = SystemClock.uptimeMillis();
                C138486xA r2 = this.A04.A0C;
                r2.A04 = uptimeMillis2 - uptimeMillis;
                r2.A02 = uptimeMillis3 - uptimeMillis2;
                return;
            } catch (C33281iZ unused) {
                Log.e("Failed to construct VCard from node.");
            }
        }
        throw new C33281iZ("Invalid VCard node.");
    }
}
