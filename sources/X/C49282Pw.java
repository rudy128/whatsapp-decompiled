package X;

import android.app.Activity;
import android.location.Location;
import android.location.LocationListener;
import android.os.Bundle;
import com.whatsapp.util.Log;
import java.util.ArrayList;

/* renamed from: X.2Pw  reason: invalid class name and case insensitive filesystem */
public class C49282Pw extends A34 implements LocationListener {
    public int A00 = 15;
    public Location A01 = null;
    public Location A02 = null;
    public Location A03;
    public boolean A04;
    public int A05 = 0;
    public final AnonymousClass190 A06;
    public final AnonymousClass1RB A07;
    public final AnonymousClass181 A08;
    public final AnonymousClass1RW A09;
    public final AnonymousClass11P A0A;
    public final C219217x A0B;
    public final AnonymousClass121 A0C;
    public final C24681Lg A0D;
    public final C26111Qw A0E;
    public final AnonymousClass1D9 A0F;
    public final C27131Uv A0G;
    public final AnonymousClass218 A0H;

    public void A0F() {
        AnonymousClass1RB r2 = this.A07;
        if (r2 != null) {
            try {
                r2.A06(this, "map-download", 0.0f, 3, 1000, 1000);
            } catch (IllegalArgumentException e) {
                Log.w("MapDownload/registerListener/GPS error ", e);
            }
        }
        AnonymousClass218 r22 = this.A0H;
        r22.A02 = 1;
        this.A0D.A02(r22, -1);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0114, code lost:
        if (r11 == null) goto L_0x011b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static byte[] A00(X.AnonymousClass181 r18, X.AnonymousClass1D9 r19, double r20, double r22, int r24) {
        /*
            r1 = 100
            java.lang.String r17 = "bad bitmap received"
            java.lang.String r5 = "MapDownload/downloadMapThumbnailBitmap/error "
            r3 = 170(0xaa, float:2.38E-43)
            java.lang.StringBuilder r4 = X.AnonymousClass000.A10()
            java.lang.String r0 = "https://maps.googleapis.com/maps/api/staticmap?center="
            r4.append(r0)
            r8 = r20
            r4.append(r8)
            java.lang.String r12 = ","
            r4.append(r12)
            r6 = r22
            r4.append(r6)
            java.lang.String r0 = "&zoom="
            r4.append(r0)
            r0 = 1
            r2 = r24
            int r2 = java.lang.Math.max(r0, r2)
            r0 = 21
            int r13 = java.lang.Math.min(r0, r2)
            r4.append(r13)
            java.lang.String r0 = "&size="
            r4.append(r0)
            r4.append(r3)
            java.lang.String r0 = "x"
            r4.append(r0)
            r4.append(r3)
            java.lang.String r0 = "&sensor=true&format=png8&mobile=true&markers=color:red%7Csize:mid%7C"
            r4.append(r0)
            r4.append(r8)
            r4.append(r12)
            r4.append(r6)
            java.lang.String r0 = "&client=gme-whatsappinc"
            java.lang.String r2 = X.AnonymousClass000.A0y(r0, r4)
            java.net.URL r0 = new java.net.URL     // Catch:{ MalformedURLException -> 0x0064 }
            r0.<init>(r2)     // Catch:{ MalformedURLException -> 0x0064 }
            java.lang.String r14 = r0.getFile()     // Catch:{ MalformedURLException -> 0x0064 }
            goto L_0x0066
        L_0x0064:
            r14 = 0
            goto L_0x00a0
        L_0x0066:
            java.lang.StringBuilder r4 = X.AnonymousClass000.A11(r2)
            java.lang.String r0 = "&signature="
            r4.append(r0)
            java.lang.String r10 = X.C197569wu.A0P
            r2 = 45
            r0 = 43
            java.lang.String r10 = r10.replace(r2, r0)
            r2 = 95
            r0 = 47
            java.lang.String r0 = r10.replace(r2, r0)
            r11 = 0
            byte[] r10 = android.util.Base64.decode(r0, r11)
            r0 = 1
            byte[][] r2 = new byte[r0][]
            byte[] r0 = r14.getBytes()
            r2[r11] = r0
            byte[] r2 = X.C17970vW.A0M(r10, r2)
            r0 = 2
            java.lang.String r0 = android.util.Base64.encodeToString(r2, r0)
            java.lang.String r0 = X.AnonymousClass1EG.A0A(r0)
            java.lang.String r14 = X.AnonymousClass000.A0y(r0, r4)
        L_0x00a0:
            r0 = 24
            r11 = 0
            r16 = 0
            r10 = 0
            r2 = r18
            r4 = r19
            X.AUZ r14 = r4.A07(r11, r14, r11)     // Catch:{ IOException -> 0x0104, all -> 0x0100 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x00f2 }
            X.9Hb r15 = r14.BMP(r2, r11, r0)     // Catch:{ all -> 0x00f2 }
            android.graphics.BitmapFactory$Options r0 = X.AnonymousClass2WU.A00     // Catch:{ all -> 0x00e4 }
            android.graphics.Bitmap r11 = android.graphics.BitmapFactory.decodeStream(r15, r11, r0)     // Catch:{ all -> 0x00e4 }
            if (r11 == 0) goto L_0x00db
            int r0 = r11.getWidth()     // Catch:{ all -> 0x00d9 }
            if (r0 != r3) goto L_0x00db
            int r0 = r11.getHeight()     // Catch:{ all -> 0x00d9 }
            if (r0 != r3) goto L_0x00db
            r0 = 35
            android.graphics.Bitmap r3 = android.graphics.Bitmap.createBitmap(r11, r0, r0, r1, r1)     // Catch:{ all -> 0x00d9 }
            r15.close()     // Catch:{ all -> 0x00d7 }
            r14.close()     // Catch:{ IOException -> 0x00fe }
            goto L_0x0116
        L_0x00d7:
            r15 = move-exception
            goto L_0x00f5
        L_0x00d9:
            r3 = move-exception
            goto L_0x00e6
        L_0x00db:
            java.io.IOException r0 = X.C17880vN.A0f(r17)     // Catch:{ all -> 0x00e0 }
            throw r0     // Catch:{ all -> 0x00e0 }
        L_0x00e0:
            r3 = move-exception
            r16 = 1
            goto L_0x00e6
        L_0x00e4:
            r3 = move-exception
            r11 = 0
        L_0x00e6:
            r15.close()     // Catch:{ all -> 0x00ea }
            goto L_0x00ee
        L_0x00ea:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r3, r0)     // Catch:{ all -> 0x00ef }
        L_0x00ee:
            throw r3     // Catch:{ all -> 0x00ef }
        L_0x00ef:
            r15 = move-exception
            r3 = 0
            goto L_0x00f5
        L_0x00f2:
            r15 = move-exception
            r3 = 0
            r11 = 0
        L_0x00f5:
            r14.close()     // Catch:{ all -> 0x00f9 }
            goto L_0x00fd
        L_0x00f9:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r15, r0)     // Catch:{ IOException -> 0x00fe }
        L_0x00fd:
            throw r15     // Catch:{ IOException -> 0x00fe }
        L_0x00fe:
            r0 = move-exception
            goto L_0x0107
        L_0x0100:
            r0 = move-exception
            r3 = 0
            r11 = 0
            goto L_0x010c
        L_0x0104:
            r0 = move-exception
            r3 = 0
            r11 = 0
        L_0x0107:
            com.whatsapp.util.Log.w(r5, r0)     // Catch:{ all -> 0x010b }
            goto L_0x0114
        L_0x010b:
            r0 = move-exception
        L_0x010c:
            if (r11 == 0) goto L_0x0113
            if (r11 == r3) goto L_0x0113
            r11.recycle()
        L_0x0113:
            throw r0
        L_0x0114:
            if (r11 == 0) goto L_0x011b
        L_0x0116:
            if (r11 == r3) goto L_0x011b
            r11.recycle()
        L_0x011b:
            if (r3 != 0) goto L_0x01a6
            if (r16 == 0) goto L_0x01a6
            java.lang.StringBuilder r11 = X.AnonymousClass000.A10()
            java.lang.String r0 = "https://dev.virtualearth.net/REST/v1/Imagery/Map/Road/"
            r11.append(r0)
            r11.append(r8)
            r11.append(r12)
            r11.append(r6)
            java.lang.String r0 = "/"
            r11.append(r0)
            r11.append(r13)
            java.lang.String r0 = "?mapSize="
            r11.append(r0)
            r11.append(r1)
            r11.append(r12)
            r11.append(r1)
            java.lang.String r0 = "&pp="
            r11.append(r0)
            r11.append(r8)
            r11.append(r12)
            r11.append(r6)
            java.lang.String r0 = ";54;&key="
            r11.append(r0)
            java.lang.String r0 = X.C197569wu.A06
            java.lang.String r0 = X.AnonymousClass000.A0y(r0, r11)
            X.AUZ r4 = r4.A07(r10, r0, r10)     // Catch:{ IOException -> 0x01a2 }
            r0 = 24
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0198 }
            X.9Hb r2 = r4.BMP(r2, r10, r0)     // Catch:{ all -> 0x0198 }
            android.graphics.BitmapFactory$Options r0 = X.AnonymousClass2WU.A00     // Catch:{ all -> 0x018e }
            android.graphics.Bitmap r3 = android.graphics.BitmapFactory.decodeStream(r2, r10, r0)     // Catch:{ all -> 0x018e }
            if (r3 == 0) goto L_0x0189
            int r0 = r3.getWidth()     // Catch:{ all -> 0x018e }
            if (r0 != r1) goto L_0x0189
            int r0 = r3.getHeight()     // Catch:{ all -> 0x018e }
            if (r0 != r1) goto L_0x0189
            r2.close()     // Catch:{ all -> 0x0198 }
            r4.close()     // Catch:{ IOException -> 0x01a2 }
            goto L_0x01a6
        L_0x0189:
            java.io.IOException r0 = X.C17880vN.A0f(r17)     // Catch:{ all -> 0x018e }
            throw r0     // Catch:{ all -> 0x018e }
        L_0x018e:
            r1 = move-exception
            r2.close()     // Catch:{ all -> 0x0193 }
            goto L_0x0197
        L_0x0193:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ all -> 0x0198 }
        L_0x0197:
            throw r1     // Catch:{ all -> 0x0198 }
        L_0x0198:
            r1 = move-exception
            r4.close()     // Catch:{ all -> 0x019d }
            goto L_0x01a1
        L_0x019d:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ IOException -> 0x01a2 }
        L_0x01a1:
            throw r1     // Catch:{ IOException -> 0x01a2 }
        L_0x01a2:
            r0 = move-exception
            com.whatsapp.util.Log.w(r5, r0)
        L_0x01a6:
            if (r3 == 0) goto L_0x01bf
            java.io.ByteArrayOutputStream r2 = new java.io.ByteArrayOutputStream
            r2.<init>()
            android.graphics.Bitmap$CompressFormat r1 = android.graphics.Bitmap.CompressFormat.JPEG
            r0 = 80
            r3.compress(r1, r0, r2)
            byte[] r0 = r2.toByteArray()
            r2.close()     // Catch:{ IOException -> 0x01bb }
        L_0x01bb:
            r3.recycle()
            return r0
        L_0x01bf:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C49282Pw.A00(X.181, X.1D9, double, double, int):byte[]");
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
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x012e  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0161  */
    public /* bridge */ /* synthetic */ java.lang.Object A0G(java.lang.Object[] r23) {
        /*
            r22 = this;
            r2 = r22
            android.location.Location r0 = r2.A03
            if (r0 != 0) goto L_0x004b
            X.1RB r0 = r2.A07
            if (r0 == 0) goto L_0x00fd
            boolean r0 = r0.A07()
            if (r0 == 0) goto L_0x00fd
            X.17x r0 = r2.A0B
            boolean r0 = r0.A06()
            if (r0 == 0) goto L_0x00fd
            r3 = 0
        L_0x0019:
            boolean r0 = r2.A04
            if (r0 != 0) goto L_0x0029
            r0 = 40
            if (r3 >= r0) goto L_0x002c
            r0 = 250(0xfa, double:1.235E-321)
            android.os.SystemClock.sleep(r0)
            int r3 = r3 + 1
            goto L_0x0019
        L_0x0029:
            android.location.Location r0 = r2.A02
            goto L_0x0049
        L_0x002c:
            android.location.Location r3 = r2.A01
            if (r3 == 0) goto L_0x00f8
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "MapDownload/doInBackground/using coarseLocation "
            r1.append(r0)
            float r0 = r3.getAccuracy()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            android.location.Location r0 = r2.A01
        L_0x0049:
            r2.A03 = r0
        L_0x004b:
            X.1D9 r4 = r2.A0F
            X.181 r3 = r2.A08
            double r5 = r0.getLatitude()
            android.location.Location r0 = r2.A03
            double r7 = r0.getLongitude()
            int r9 = r2.A00
            byte[] r1 = A00(r3, r4, r5, r7, r9)
            X.218 r0 = r2.A0H
            r0.A0p(r1)
            r0 = 1
        L_0x0065:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r15 = r0.booleanValue()
            X.218 r5 = r2.A0H
            if (r15 == 0) goto L_0x00f4
            r0 = 2
            r5.A02 = r0
            android.location.Location r0 = r2.A03
            double r0 = r0.getLatitude()
            r5.A00 = r0
            android.location.Location r0 = r2.A03
            double r0 = r0.getLongitude()
            r5.A01 = r0
        L_0x0084:
            boolean r0 = r5 instanceof X.AnonymousClass219
            if (r0 == 0) goto L_0x0114
            X.11P r0 = r2.A0A
            long r6 = X.AnonymousClass11P.A01(r0)
            long r0 = r5.A0I
            X.219 r5 = (X.AnonymousClass219) r5
            int r3 = r5.A00
            long r3 = X.C17890vO.A03(r3)
            long r0 = r0 + r3
            int r3 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r3 <= 0) goto L_0x0100
            if (r15 == 0) goto L_0x0114
            android.location.Location r4 = r2.A03
            X.205 r10 = r5.A0v
            X.1BI r8 = r10.A00
            boolean r3 = r8 instanceof X.AnonymousClass1E9
            if (r3 == 0) goto L_0x00f2
            X.190 r6 = r2.A06
            X.1Qw r3 = r2.A0E
            X.1Qt r3 = X.C26111Qw.A01(r3, r10)
            java.util.Set r3 = r3.A05(r10)
            java.util.Set r7 = X.C22971Dz.A0D(r6, r3)
        L_0x00b9:
            X.1Uv r3 = r2.A0G
            java.lang.StringBuilder r6 = X.AnonymousClass000.A10()
            java.lang.String r2 = "LocationSharingManager/setShareLocation; message.key="
            r6.append(r2)
            r6.append(r10)
            java.lang.String r9 = "; expiration="
            X.C17900vP.A0m(r9, r6, r0)
            java.util.ArrayList r12 = X.AnonymousClass000.A13()
            boolean r2 = X.C22971Dz.A0e(r8)
            if (r2 == 0) goto L_0x0102
            if (r7 == 0) goto L_0x0120
            java.util.Iterator r7 = r7.iterator()
        L_0x00dc:
            boolean r2 = r7.hasNext()
            if (r2 == 0) goto L_0x0120
            X.1BI r6 = X.C17880vN.A0Q(r7)
            X.11S r2 = r3.A08
            boolean r2 = r2.A0O(r6)
            if (r2 != 0) goto L_0x00dc
            r12.add(r6)
            goto L_0x00dc
        L_0x00f2:
            r7 = 0
            goto L_0x00b9
        L_0x00f4:
            r0 = 0
            r5.A02 = r0
            goto L_0x0084
        L_0x00f8:
            java.lang.String r0 = "MapDownload/doInBackground/failed to get location"
            com.whatsapp.util.Log.i((java.lang.String) r0)
        L_0x00fd:
            r0 = 0
            goto L_0x0065
        L_0x0100:
            r15 = 1
            goto L_0x0114
        L_0x0102:
            boolean r2 = X.C22971Dz.A0N(r8)
            if (r2 == 0) goto L_0x0119
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "LocationSharingManager/setShareLocation/can't share location with broadcast remote_resource; messageKey="
            X.C17900vP.A0Z(r10, r0, r1)
        L_0x0111:
            r3.A0U(r4)
        L_0x0114:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r15)
            return r0
        L_0x0119:
            com.whatsapp.jid.UserJid r2 = X.C22941Dw.A00(r8)
            r12.add(r2)
        L_0x0120:
            X.00H r2 = r3.A0Q
            java.lang.Object r7 = r2.get()
            X.2qa r7 = (X.C61972qa) r7
            boolean r2 = r12.isEmpty()
            if (r2 != 0) goto L_0x016a
            java.lang.String r2 = "LiveLocationManager/convertToLidsIfNeeded"
            com.whatsapp.util.Log.i((java.lang.String) r2)
            java.util.ArrayList r11 = X.AnonymousClass000.A13()
            X.1Ln r6 = r7.A00
            java.util.Set r2 = X.C29431cG.A12(r12)
            java.util.LinkedHashMap r13 = r6.A0G(r2)
            boolean r2 = X.C61972qa.A00(r7)
            if (r2 != 0) goto L_0x016e
            X.0ve r7 = r7.A01
            r6 = 4718(0x126e, float:6.611E-42)
            X.0vf r2 = X.C18040vf.A02
            boolean r2 = X.C18020vd.A05(r2, r7, r6)
            if (r2 == 0) goto L_0x016e
            java.util.Set r7 = r13.keySet()
        L_0x0157:
            int r6 = r12.size()
            int r2 = r7.size()
            if (r6 == r2) goto L_0x0166
            java.lang.String r2 = "LiveLocationManager/convertToLidsIfNeeded/jidSet size mismatch"
            com.whatsapp.util.Log.w((java.lang.String) r2)
        L_0x0166:
            r11.addAll(r7)
            r12 = r11
        L_0x016a:
            java.lang.Object r2 = r3.A0U
            monitor-enter(r2)
            goto L_0x0177
        L_0x016e:
            java.util.Collection r2 = r13.values()
            java.util.Set r7 = X.C29431cG.A12(r2)
            goto L_0x0157
        L_0x0177:
            java.util.Map r11 = X.C27131Uv.A06(r3)     // Catch:{ all -> 0x0258 }
            java.lang.Object r13 = r11.get(r8)     // Catch:{ all -> 0x0258 }
            X.2er r13 = (X.C54882er) r13     // Catch:{ all -> 0x0258 }
            if (r13 == 0) goto L_0x01b2
            X.205 r7 = r13.A02     // Catch:{ all -> 0x0258 }
            boolean r6 = r7.equals(r10)     // Catch:{ all -> 0x0258 }
            if (r6 == 0) goto L_0x0197
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x0258 }
            java.lang.String r0 = "LocationSharingManager/setShareLocation/already enabled for this message; messageKey="
            X.C17900vP.A0Y(r10, r0, r1)     // Catch:{ all -> 0x0258 }
            monitor-exit(r2)     // Catch:{ all -> 0x0258 }
            goto L_0x0111
        L_0x0197:
            r11.remove(r8)     // Catch:{ all -> 0x0258 }
            X.219 r6 = X.C27131Uv.A03(r3, r7)     // Catch:{ all -> 0x0258 }
            if (r6 == 0) goto L_0x01a3
            X.C27131Uv.A0E(r3, r6)     // Catch:{ all -> 0x0258 }
        L_0x01a3:
            X.1Uu r14 = r3.A0K     // Catch:{ all -> 0x0258 }
            java.util.List r13 = java.util.Collections.singletonList(r13)     // Catch:{ all -> 0x0258 }
            X.11P r6 = r3.A0D     // Catch:{ all -> 0x0258 }
            long r6 = X.AnonymousClass11P.A01(r6)     // Catch:{ all -> 0x0258 }
            r14.A07(r13, r6)     // Catch:{ all -> 0x0258 }
        L_0x01b2:
            long r6 = X.C27131Uv.A00(r3)     // Catch:{ all -> 0x0258 }
            r5.A01 = r6     // Catch:{ all -> 0x0258 }
            X.2er r6 = new X.2er     // Catch:{ all -> 0x0258 }
            r6.<init>(r10, r12, r0)     // Catch:{ all -> 0x0258 }
            r11.put(r8, r6)     // Catch:{ all -> 0x0258 }
            X.1Uu r13 = r3.A0K     // Catch:{ all -> 0x0258 }
            X.C17960vV.A07(r8)     // Catch:{ all -> 0x0258 }
            java.lang.String r11 = r10.A01     // Catch:{ all -> 0x0258 }
            int r6 = r12.size()     // Catch:{ all -> 0x0258 }
            java.util.ArrayList r7 = X.C17880vN.A0z(r6)     // Catch:{ all -> 0x0258 }
            java.util.Iterator r14 = r12.iterator()     // Catch:{ all -> 0x0258 }
        L_0x01d3:
            boolean r6 = r14.hasNext()     // Catch:{ all -> 0x0258 }
            if (r6 == 0) goto L_0x01f8
            java.lang.Object r12 = r14.next()     // Catch:{ all -> 0x0258 }
            X.C17960vV.A07(r12)     // Catch:{ all -> 0x0258 }
            com.whatsapp.jid.UserJid r12 = (com.whatsapp.jid.UserJid) r12     // Catch:{ all -> 0x0258 }
            r6 = 1
            X.205 r19 = X.AnonymousClass205.A01(r8, r11, r6)     // Catch:{ all -> 0x0258 }
            X.2pv r6 = new X.2pv     // Catch:{ all -> 0x0258 }
            r20 = r0
            r17 = r8
            r18 = r12
            r16 = r6
            r16.<init>(r17, r18, r19, r20)     // Catch:{ all -> 0x0258 }
            r7.add(r6)     // Catch:{ all -> 0x0258 }
            goto L_0x01d3
        L_0x01f8:
            r13.A08(r7)     // Catch:{ all -> 0x0258 }
            java.lang.StringBuilder r7 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x0258 }
            java.lang.String r6 = "LocationSharingManager/setShareLocation; saved sharing; message.key="
            r7.append(r6)     // Catch:{ all -> 0x0258 }
            r7.append(r10)     // Catch:{ all -> 0x0258 }
            r7.append(r9)     // Catch:{ all -> 0x0258 }
            r7.append(r0)     // Catch:{ all -> 0x0258 }
            java.lang.String r0 = "; sequenceNumber="
            r7.append(r0)     // Catch:{ all -> 0x0258 }
            long r0 = r5.A01     // Catch:{ all -> 0x0258 }
            X.C17890vO.A16(r7, r0)     // Catch:{ all -> 0x0258 }
            monitor-exit(r2)     // Catch:{ all -> 0x0258 }
            X.00H r0 = r3.A0O
            java.lang.Object r0 = r0.get()
            X.121 r0 = (X.AnonymousClass121) r0
            r0.CQw(r5)
            X.C27131Uv.A0C(r3)
            X.118 r0 = r3.A0E
            android.content.Context r2 = r0.A00
            X.17x r1 = r3.A0F
            X.195 r0 = r3.A07
            com.whatsapp.location.LocationSharingService.A03(r2, r0, r1, r3)
            java.util.List r0 = r3.A0W
            java.util.Iterator r1 = r0.iterator()
        L_0x0237:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x024a
            java.lang.Object r0 = r1.next()
            X.3Lh r0 = (X.C72273Lh) r0
            X.C17960vV.A07(r8)
            r0.C6P(r8)
            goto L_0x0237
        L_0x024a:
            android.os.Handler r2 = r3.A06
            r1 = 49
            X.7Pj r0 = new X.7Pj
            r0.<init>(r3, r5, r1)
            r2.post(r0)
            goto L_0x0111
        L_0x0258:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0258 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C49282Pw.A0G(java.lang.Object[]):java.lang.Object");
    }

    public C49282Pw(AnonymousClass190 r7, AnonymousClass1RB r8, AnonymousClass181 r9, AnonymousClass1RW r10, AnonymousClass11P r11, C219217x r12, AnonymousClass121 r13, C24681Lg r14, C26111Qw r15, AnonymousClass1D9 r16, C27131Uv r17, AnonymousClass218 r18) {
        this.A0A = r11;
        this.A08 = r9;
        AnonymousClass218 r3 = r18;
        this.A0H = r3;
        this.A06 = r7;
        this.A0C = r13;
        this.A0D = r14;
        this.A0F = r16;
        this.A0B = r12;
        this.A0E = r15;
        this.A0G = r17;
        this.A09 = r10;
        if (r3.A00 == 0.0d || r3.A01 == 0.0d) {
            this.A07 = r8;
            return;
        }
        Location location = new Location("");
        this.A03 = location;
        location.setLatitude(r3.A00);
        this.A03.setLongitude(r3.A01);
        this.A03.setTime(r3.A0I);
        this.A04 = true;
    }

    public /* bridge */ /* synthetic */ void A0H(Object obj) {
        if (AnonymousClass000.A1Y(obj)) {
            this.A0C.CQx(this.A0H, 4);
        } else {
            C24681Lg r0 = this.A0D;
            AnonymousClass218 r5 = this.A0H;
            r0.A02(r5, -1);
            AnonymousClass1RB r1 = this.A07;
            if (r1 != null) {
                AnonymousClass1RX A002 = this.A09.A00();
                C219217x r3 = this.A0B;
                if (!r3.A06()) {
                    if (A002.A01(r5.A0v.A00)) {
                        AnonymousClass74O.A0K((Activity) A002.A00(), r3, 2131894346, 2131894345, -1);
                    }
                } else if (!r1.A07()) {
                    AnonymousClass1BI r12 = r5.A0v.A00;
                    if (A002.A01(r12)) {
                        AnonymousClass4Yv.A01((Activity) A002.A00(), 2);
                    } else {
                        ArrayList arrayList = AnonymousClass4IT.A01;
                        C17960vV.A07(r12);
                        arrayList.add(r12);
                    }
                }
            }
        }
        AnonymousClass1RB r02 = this.A07;
        if (r02 != null) {
            r02.A05(this);
        }
    }

    public void onLocationChanged(Location location) {
        System.currentTimeMillis();
        location.getTime();
        location.getAccuracy();
        if (C27091Ur.A01(location, this.A01)) {
            this.A01 = location;
        }
        int i = this.A05 + 1;
        this.A05 = i;
        if (i >= 2 || location.getAccuracy() < 80.0f) {
            this.A02 = location;
            this.A04 = true;
        }
    }

    public void onProviderDisabled(String str) {
    }

    public void onProviderEnabled(String str) {
    }

    public void onStatusChanged(String str, int i, Bundle bundle) {
    }
}
