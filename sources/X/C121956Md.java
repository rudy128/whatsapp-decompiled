package X;

import android.content.Context;
import android.net.Uri;
import android.os.SystemClock;
import android.text.TextUtils;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* renamed from: X.6Md  reason: invalid class name and case insensitive filesystem */
public class C121956Md extends A34 {
    public AnonymousClass190 A00;
    public C218617r A01;
    public AnonymousClass1KB A02;
    public C34531kd A03;
    public C33251iW A04;
    public C126976db A05;
    public AnonymousClass11P A06;
    public AnonymousClass118 A07;
    public C19830z4 A08;
    public C18030ve A09;
    public AnonymousClass18K A0A;
    public C26421Sb A0B;
    public C34501ka A0C;
    public C52312ai A0D;
    public C1198069x A0E;
    public C133066o7 A0F;
    public C130996kL A0G;
    public C58432kg A0H;
    public C32551hN A0I;
    public C24641Lc A0J;
    public AnonymousClass6GL A0K;
    public C26521Sl A0L;
    public AnonymousClass00H A0M;
    public AnonymousClass00H A0N;
    public final int A0O;
    public final Context A0P;
    public final AnonymousClass77N A0Q;
    public final AnonymousClass73D A0R;
    public final AnonymousClass87V A0S;
    public final AnonymousClass206 A0T;
    public final C136246tV A0U;
    public final Integer A0V;
    public final Collection A0W;
    public final HashSet A0X;
    public final HashSet A0Y;
    public final List A0Z;
    public final List A0a;
    public final Map A0b;
    public final Map A0c;
    public final boolean A0d;
    public final boolean A0e;
    public final boolean A0f;
    public final boolean A0g;
    public final boolean A0h;
    public final boolean A0i;
    public final boolean A0j;
    public final boolean A0k;
    public final long A0l;
    public final long A0m;
    public final AnonymousClass709 A0n;
    public final AnonymousClass709 A0o;
    public final C135306rz A0p;
    public final Boolean A0q;
    public final Long A0r;
    public final Long A0s;
    public final Long A0t;
    public final String A0u;

    private AnonymousClass64U A01(int i, boolean z) {
        AnonymousClass709 r11;
        int i2 = i;
        if (i2 == 1) {
            r11 = this.A0n;
        } else {
            r11 = this.A0o;
        }
        List list = this.A0a;
        boolean contains = list.contains(C29671cg.A00);
        int size = list.size();
        int i3 = this.A0O;
        long j = this.A0m;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        boolean z2 = this.A0g;
        boolean z3 = this.A0h;
        long j2 = this.A0l;
        C18030ve r12 = this.A09;
        C19830z4 r10 = this.A08;
        Integer num = this.A0V;
        Long l = this.A0r;
        Long l2 = this.A0s;
        Long l3 = this.A0t;
        C135306rz r5 = this.A0p;
        long j3 = j2;
        boolean z4 = z2;
        boolean z5 = z3;
        int i4 = i3;
        long j4 = j;
        Long l4 = l3;
        int i5 = i2;
        Long l5 = l;
        Long l6 = l2;
        AnonymousClass709 r13 = r11;
        return C123956Wm.A00(r10, r12, r13, r5, this.A0q, num, l5, l6, l4, i5, size, i4, j4, elapsedRealtime, j3, contains, z, z4, z5);
    }

    private String A03(C1409573s r7) {
        String A0E2;
        if (r7 != null) {
            StringBuilder A10 = AnonymousClass000.A10();
            Iterator it = r7.A04.iterator();
            while (it.hasNext()) {
                C1409773u A0k2 = C108945cZ.A0k(it);
                if (A0k2 instanceof AnonymousClass69c) {
                    A0E2 = ((AnonymousClass69c) A0k2).A0C;
                } else if (A0k2 instanceof AnonymousClass69Y) {
                    A10.append(" ");
                    A0E2 = ((AnonymousClass69Y) A0k2).A05;
                    A10.append(A0E2);
                } else {
                    A0E2 = A0k2.A0E(this.A07.A00);
                }
                if (!TextUtils.isEmpty(A0E2)) {
                    A10.append(" ");
                    A10.append(A0E2);
                }
            }
            if (A10.length() != 0) {
                return A10.toString().trim();
            }
        }
        return null;
    }

    private int A00(int i) {
        if (C18020vd.A05(C18040vf.A02, this.A09, 1516)) {
            return C123966Wn.A00(i);
        }
        if (i == 2 || i == 10 || i == 11) {
            return 4;
        }
        switch (i) {
            case 15:
            case 16:
            case 17:
                return 5;
            default:
                return 0;
        }
    }

    private AnonymousClass97M A02(String str) {
        C32551hN r4 = this.A0I;
        C29671cg r3 = C29671cg.A00;
        AnonymousClass210 r5 = new AnonymousClass210(C17880vN.A0Z(r3, r4.A00), AnonymousClass11P.A01(this.A06));
        r5.A0i(str);
        r5.A0S = 100;
        r5.A0a(13);
        C60512o9.A01(r5, new C693236t(AnonymousClass6RT.STATUS_TAPPABLE_MESSAGE, (A51) null, -1));
        r5.A0b(67108864);
        return new AnonymousClass97M(r5, -1L);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v0, resolved type: com.whatsapp.SerializablePoint[]} */
    /* JADX WARNING: type inference failed for: r2v1, types: [com.whatsapp.InteractiveAnnotation, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r2v4, types: [com.whatsapp.InteractiveAnnotation, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r5v2, types: [com.whatsapp.SerializablePoint, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00bb, code lost:
        if (r4 != null) goto L_0x00c4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00c2, code lost:
        if (r6.isEmpty() != false) goto L_0x00c4;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.util.ArrayList A04(android.net.Uri r16) {
        /*
            r15 = this;
            X.77N r4 = r15.A0Q
            r7 = 0
            r14 = 0
            if (r4 == 0) goto L_0x00ba
            java.util.List r0 = r4.A00
            if (r0 == 0) goto L_0x00ba
            java.util.ArrayList r6 = X.AnonymousClass000.A13()
            java.util.Iterator r13 = r0.iterator()
        L_0x0012:
            boolean r0 = r13.hasNext()
            if (r0 == 0) goto L_0x00be
            java.lang.Object r11 = r13.next()
            X.774 r11 = (X.AnonymousClass774) r11
            java.util.Map r0 = r15.A0c
            if (r0 == 0) goto L_0x002e
            r1 = r16
            java.lang.Object r0 = r0.get(r1)
            X.36j r0 = (X.C692236j) r0
            if (r0 == 0) goto L_0x002e
            r0.A01 = r4
        L_0x002e:
            X.0ve r2 = r15.A09
            r1 = 12411(0x307b, float:1.7392E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 == 0) goto L_0x00b8
            java.lang.String r3 = r4.A06
        L_0x003c:
            java.lang.String r0 = r11.A00
            java.lang.String r2 = r4.A07
            if (r0 == 0) goto L_0x00af
            android.net.Uri r0 = android.net.Uri.parse(r0)
            android.net.Uri$Builder r1 = r0.buildUpon()
            if (r2 == 0) goto L_0x0051
            java.lang.String r0 = "fallback_url"
            r1.appendQueryParameter(r0, r2)
        L_0x0051:
            if (r3 == 0) goto L_0x0058
            java.lang.String r0 = "share_type"
            r1.appendQueryParameter(r0, r3)
        L_0x0058:
            android.net.Uri r0 = r1.build()
            java.lang.String r12 = X.C18070vi.A0H(r0)
            java.util.List r10 = r11.A01
            int r0 = r10.size()
            com.whatsapp.SerializablePoint[] r8 = new com.whatsapp.SerializablePoint[r0]
            r9 = 0
        L_0x0069:
            int r0 = r10.size()
            if (r9 >= r0) goto L_0x0093
            java.lang.Object r0 = r10.get(r9)
            java.lang.Number r0 = (java.lang.Number) r0
            double r2 = r0.doubleValue()
            java.util.List r0 = r11.A02
            java.lang.Object r0 = r0.get(r9)
            java.lang.Number r0 = (java.lang.Number) r0
            double r0 = r0.doubleValue()
            com.whatsapp.SerializablePoint r5 = new com.whatsapp.SerializablePoint
            r5.<init>()
            r5.x = r2
            r5.y = r0
            r8[r9] = r5
            int r9 = r9 + 1
            goto L_0x0069
        L_0x0093:
            X.97M r5 = r15.A02(r12)
            X.2Qq r3 = X.C49482Qq.LINKCLICK
            com.whatsapp.InteractiveAnnotation r2 = new com.whatsapp.InteractiveAnnotation
            r2.<init>()
            r0 = -1
            r2.interactiveAnnotationId = r0
            r2.polygonVertices = r8
            r2.skipConfirmation = r7
            r2.type = r3
            r2.data = r5
            r6.add(r2)
            goto L_0x0012
        L_0x00af:
            android.net.Uri r0 = android.net.Uri.parse(r2)
            android.net.Uri$Builder r1 = r0.buildUpon()
            goto L_0x0051
        L_0x00b8:
            r3 = r14
            goto L_0x003c
        L_0x00ba:
            r6 = r14
            if (r4 == 0) goto L_0x0115
            goto L_0x00c4
        L_0x00be:
            boolean r0 = r6.isEmpty()
            if (r0 == 0) goto L_0x0115
        L_0x00c4:
            java.lang.String r0 = "SHARE_STORY_TO_STATUS"
            java.lang.String r3 = r4.A06
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0115
            X.0ve r2 = r15.A09
            r1 = 12411(0x307b, float:1.7392E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 == 0) goto L_0x0115
            if (r6 != 0) goto L_0x00e0
            java.util.ArrayList r6 = X.AnonymousClass000.A13()
        L_0x00e0:
            java.lang.String r0 = r4.A07
            android.net.Uri r0 = android.net.Uri.parse(r0)
            android.net.Uri$Builder r1 = r0.buildUpon()
            if (r3 == 0) goto L_0x00f1
            java.lang.String r0 = "share_type"
            r1.appendQueryParameter(r0, r3)
        L_0x00f1:
            android.net.Uri r0 = r1.build()
            java.lang.String r0 = X.C18070vi.A0H(r0)
            X.97M r5 = r15.A02(r0)
            com.whatsapp.SerializablePoint[] r4 = new com.whatsapp.SerializablePoint[r7]
            X.2Qq r3 = X.C49482Qq.LINKCLICK
            com.whatsapp.InteractiveAnnotation r2 = new com.whatsapp.InteractiveAnnotation
            r2.<init>()
            r0 = -1
            r2.interactiveAnnotationId = r0
            r2.polygonVertices = r4
            r2.skipConfirmation = r7
            r2.type = r3
            r2.data = r5
            r6.add(r2)
        L_0x0115:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C121956Md.A04(android.net.Uri):java.util.ArrayList");
    }

    private void A08(AnonymousClass64U r3, AnonymousClass72S r4) {
        C1198069x r1 = this.A0E;
        if (r4.A02() == 0 && r4.A08() == null && r1.A01(r4) == null && r4.A01() == 0) {
            Long l = r3.A0P;
            if (l != null) {
                r3.A0P = C108985cd.A0d(l);
                return;
            }
            return;
        }
        Long l2 = r3.A0J;
        if (l2 != null) {
            r3.A0J = C108985cd.A0d(l2);
        }
    }

    public /* bridge */ /* synthetic */ Object A0G(Object[] objArr) {
        if (this instanceof C1197969w) {
            return ((C1197969w) this).A0J((Void[]) objArr);
        }
        return A0J((Void[]) objArr);
    }

    public /* bridge */ /* synthetic */ void A0H(Object obj) {
        ArrayList arrayList = (ArrayList) obj;
        AnonymousClass8B4 r0 = (AnonymousClass8B4) A0A(AnonymousClass8B4.class);
        if (r0 != null) {
            r0.By8(arrayList);
        }
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
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeEndlessLoop(RegionMaker.java:368)
        	at jadx.core.dex.visitors.regions.RegionMaker.processLoop(RegionMaker.java:172)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* JADX WARNING: Removed duplicated region for block: B:459:0x09d5  */
    /* JADX WARNING: Removed duplicated region for block: B:574:0x0be3  */
    public java.util.ArrayList A0J(java.lang.Void... r60) {
        /*
            r59 = this;
            r0 = r59
            X.2ai r2 = r0.A0D
            boolean r1 = r0.A0f
            r17 = r1
            X.19Y r4 = r2.A00
            r3 = 453122092(0x1b02182c, float:1.0761158E-22)
            r2 = 1
            r4.markerStart(r3, r2)
            java.lang.String r1 = "SEND_TASK_START"
            r4.markerPoint((int) r3, (int) r2, (java.lang.String) r1)
            if (r17 == 0) goto L_0x0432
            java.lang.String r1 = "ACTUAL_SEND"
        L_0x001a:
            r4.markerPoint((int) r3, (int) r2, (java.lang.String) r1)
            boolean r1 = r0.A0i
            r27 = r1
            if (r1 != 0) goto L_0x002b
            X.77N r1 = r0.A0Q
            if (r1 == 0) goto L_0x0443
            boolean r1 = r1.A08
            if (r1 == 0) goto L_0x0443
        L_0x002b:
            X.73D r1 = r0.A0R
            java.util.ArrayList r1 = r1.A04()
            java.util.Iterator r20 = r1.iterator()
        L_0x0035:
            boolean r1 = r20.hasNext()
            if (r1 == 0) goto L_0x0443
            java.lang.Object r21 = r20.next()
            r1 = r21
            X.72S r1 = (X.AnonymousClass72S) r1
            X.1ka r2 = r0.A0C
            int r5 = r2.A01(r1)
            boolean r4 = r1.A0V()
            X.1Lc r2 = r0.A0J
            X.0ve r3 = r2.A01
            if (r4 == 0) goto L_0x042e
            r2 = 9162(0x23ca, float:1.2839E-41)
        L_0x0055:
            X.0vf r7 = X.C18040vf.A02
            boolean r3 = X.C18020vd.A05(r7, r3, r2)
            r2 = 3
            if (r5 == r2) goto L_0x0062
            r2 = 13
            if (r5 != r2) goto L_0x006c
        L_0x0062:
            if (r3 != 0) goto L_0x006c
            X.77N r2 = r0.A0Q
            if (r2 == 0) goto L_0x0428
            boolean r2 = r2.A08
            if (r2 == 0) goto L_0x0428
        L_0x006c:
            X.77N r11 = r0.A0Q
            if (r11 == 0) goto L_0x01f0
            boolean r2 = r11.A08
            if (r2 == 0) goto L_0x01f0
            X.6GL r3 = r0.A0K
            android.content.Context r7 = r0.A0P
            r2 = 0
            X.C18070vi.A0d(r7, r2)
            r10 = 1
            X.01k r19 = X.C28281Zt.A02(r7)
            java.io.File r6 = r1.A0C()
            if (r6 == 0) goto L_0x0035
            X.71b r5 = r3.A00
            X.1Lc r4 = r3.A02
            X.6GG r2 = new X.6GG
            r2.<init>(r7, r5, r4)
            X.7E7 r5 = r3.A00
            monitor-enter(r21)
            java.lang.Integer r9 = r1.A0E     // Catch:{ all -> 0x0439 }
            monitor-exit(r21)
            if (r9 != 0) goto L_0x009a
            java.lang.Integer r9 = r11.A02
        L_0x009a:
            monitor-enter(r21)
            java.lang.Integer r8 = r1.A0D     // Catch:{ all -> 0x0439 }
            monitor-exit(r21)
            if (r8 != 0) goto L_0x00a2
            java.lang.Integer r8 = r11.A04
        L_0x00a2:
            monitor-enter(r21)
            java.lang.Integer r7 = r1.A0C     // Catch:{ all -> 0x0439 }
            monitor-exit(r21)
            if (r7 != 0) goto L_0x00aa
            java.lang.Integer r7 = r11.A03
        L_0x00aa:
            r4 = 0
            X.C18070vi.A0d(r5, r4)
            android.graphics.Bitmap r6 = X.C1408873l.A01(r6)
            if (r6 == 0) goto L_0x00f9
            X.71b r12 = r2.A01
            int r5 = r6.getWidth()
            int r4 = r6.getHeight()
            X.6rw r4 = r12.A02(r5, r4)
            android.content.res.Resources r5 = X.AnonymousClass000.A0Y(r2)
            X.6xg r28 = X.C138786xg.A00
            android.content.Context r29 = X.AnonymousClass3MY.A04(r2)
            int r12 = r4.A01
            java.lang.Integer r32 = java.lang.Integer.valueOf(r12)
            int r4 = r4.A00
            java.lang.Integer r33 = java.lang.Integer.valueOf(r4)
            X.1Lc r4 = r2.A02
            r30 = r6
            r31 = r4
            r34 = r8
            r35 = r7
            r36 = r9
            r37 = r10
            X.6cj r4 = r28.A00(r29, r30, r31, r32, r33, r34, r35, r36, r37)
            android.graphics.Bitmap r7 = r4.A00
            android.graphics.drawable.BitmapDrawable r4 = new android.graphics.drawable.BitmapDrawable
            r4.<init>(r5, r7)
            r2.setBackground(r4)
            com.whatsapp.components.button.ThumbnailButton r4 = r2.A00
            r4.setImageBitmap(r6)
        L_0x00f9:
            r2.A03()
            java.lang.String r14 = r11.A07
            if (r14 == 0) goto L_0x0173
            float r5 = X.C108945cZ.A03(r2)
            com.whatsapp.components.button.ThumbnailButton r8 = r2.A00
            float r4 = X.C108945cZ.A03(r8)
            float r5 = r5 - r4
            float r4 = X.C108945cZ.A03(r2)
            float r5 = r5 / r4
            r4 = 1052938076(0x3ec28f5c, float:0.38)
            float r6 = java.lang.Math.max(r4, r5)
            r7 = 1073741824(0x40000000, float:2.0)
            float r6 = r6 / r7
            float r5 = X.C108945cZ.A04(r2)
            float r4 = X.C108945cZ.A04(r8)
            float r5 = r5 - r4
            float r4 = X.C108945cZ.A04(r2)
            float r5 = r5 / r4
            float r5 = r5 / r7
            double r15 = (double) r6
            r4 = 1065353216(0x3f800000, float:1.0)
            float r6 = r4 - r6
            double r8 = (double) r6
            double r6 = (double) r5
            float r4 = r4 - r5
            double r4 = (double) r4
            r13 = 4
            java.lang.Double[] r12 = new java.lang.Double[r13]
            java.lang.Double r15 = java.lang.Double.valueOf(r15)
            r18 = 0
            r12[r18] = r15
            java.lang.Double r8 = java.lang.Double.valueOf(r8)
            r12[r10] = r8
            r16 = 2
            r12[r16] = r8
            r8 = 3
            java.util.List r9 = X.C18070vi.A0O(r15, r12, r8)
            java.lang.Double[] r12 = new java.lang.Double[r13]
            java.lang.Double r6 = java.lang.Double.valueOf(r6)
            r12[r18] = r6
            r12[r10] = r6
            java.lang.Double r4 = java.lang.Double.valueOf(r4)
            r12[r16] = r4
            java.util.List r5 = X.C18070vi.A0O(r4, r12, r8)
            X.774 r4 = new X.774
            r4.<init>(r14, r9, r5)
            java.util.List r5 = r11.A00
            java.util.List r4 = X.C18070vi.A0M(r4)
            if (r5 == 0) goto L_0x0171
            java.util.ArrayList r4 = X.C29431cG.A0k(r5, r4)
        L_0x0171:
            r11.A00 = r4
        L_0x0173:
            java.lang.Integer r4 = X.C17880vN.A0j()
            r1.A0O(r4)
            r6 = 720(0x2d0, float:1.009E-42)
            r5 = 1280(0x500, float:1.794E-42)
            android.graphics.Point r4 = new android.graphics.Point
            r4.<init>(r6, r5)
            r1.A0K(r4)
            android.content.res.Resources r5 = r19.getResources()
            r4 = 2131168804(0x7f070e24, float:1.795192E38)
            float r7 = r5.getDimension(r4)
            X.6ye r6 = r3.A03
            com.whatsapp.components.button.ThumbnailButton r5 = r2.A00
            android.graphics.RectF r4 = X.C139326ye.A00(r2, r5)
            r1.A0M(r4)
            r1.A0I()
            monitor-enter(r21)
            r1.A0L = r10     // Catch:{ all -> 0x0439 }
            monitor-exit(r21)
            r4 = r19
            java.io.File r5 = r6.A01(r4, r2, r5, r7)
            if (r5 == 0) goto L_0x0035
            java.util.ArrayList r4 = X.AnonymousClass000.A13()
            java.lang.String r6 = X.C18070vi.A0H(r5)
            X.69W r5 = new X.69W
            r5.<init>((java.lang.String) r6)
            r4.add(r5)
            X.6jL r5 = r3.A01
            java.lang.String r14 = r1.A0F()
            X.6yp r6 = X.C1409573s.A06
            android.content.Context r7 = r5.A00
            X.1KW r10 = r5.A03
            X.0vb r9 = r5.A02
            X.1Sw r13 = r5.A06
            X.0ve r11 = r5.A04
            X.1Nq r12 = r5.A05
            X.1T1 r8 = r5.A01
            X.73s r5 = r6.A02(r7, r8, r9, r10, r11, r12, r13, r14)
            if (r5 == 0) goto L_0x01eb
            java.util.List r2 = r5.A04
            java.util.ArrayList r2 = X.C29431cG.A0m(r2)
            r2.addAll(r4)
            r5.A04 = r2
            java.lang.String r2 = r5.A05()
            r1.A0Q(r2)
            goto L_0x0035
        L_0x01eb:
            r3.A03(r2, r1, r4)
            goto L_0x0035
        L_0x01f0:
            X.6kL r5 = r0.A0G
            r14 = 0
            r2 = 1
            r1.A0I()
            r1.A0T(r2)
            boolean r2 = r1.A0W()
            if (r2 != 0) goto L_0x0218
            boolean r2 = r1.A0X()
            if (r2 != 0) goto L_0x0218
            X.1ka r2 = r5.A06
            int r2 = X.AnonymousClass72S.A00(r1, r2)
            byte r3 = (byte) r2
            r2 = 3
            if (r3 == r2) goto L_0x0218
            r2 = 13
            if (r3 == r2) goto L_0x0218
            r2 = 81
            if (r3 != r2) goto L_0x0035
        L_0x0218:
            boolean r2 = r1.A0V()
            if (r2 != 0) goto L_0x0035
            java.io.File r4 = r1.A0C()
            if (r4 == 0) goto L_0x0035
            X.71x r3 = r1.A07()
            if (r3 != 0) goto L_0x023b
            X.1Sl r2 = r5.A0C     // Catch:{ Exception -> 0x0234 }
            com.whatsapp.media.WamediaManager r2 = r2.A04     // Catch:{ Exception -> 0x0234 }
            X.71x r3 = new X.71x     // Catch:{ Exception -> 0x0234 }
            r3.<init>(r2, r4)     // Catch:{ Exception -> 0x0234 }
            goto L_0x023b
        L_0x0234:
            java.lang.String r1 = "StatusMediaPreviewGenerator/prepareMediaPreviewItemForFixedCanvas/Error getting video metadata"
            com.whatsapp.util.Log.e((java.lang.String) r1)
            goto L_0x0035
        L_0x023b:
            boolean r13 = r3.A02()
            r10 = 0
            if (r13 == 0) goto L_0x026d
            int r6 = r3.A00
            float r8 = (float) r6
            int r2 = r3.A02
            r4 = r2
        L_0x0248:
            float r2 = (float) r2
            android.graphics.RectF r3 = new android.graphics.RectF
            r3.<init>(r10, r10, r8, r2)
            r9 = 1144258560(0x44340000, float:720.0)
            r8 = 1151336448(0x44a00000, float:1280.0)
            android.graphics.RectF r2 = new android.graphics.RectF
            r2.<init>(r10, r10, r9, r8)
            android.graphics.RectF r3 = X.C137316vG.A01(r3, r2)
            float r2 = r3.width()
            int r2 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            if (r2 != 0) goto L_0x0274
            float r2 = r3.height()
            int r2 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r2 != 0) goto L_0x0274
            goto L_0x0035
        L_0x026d:
            int r4 = r3.A02
            float r8 = (float) r4
            int r2 = r3.A00
            r6 = r2
            goto L_0x0248
        L_0x0274:
            java.lang.String r2 = "StatusMediaPreviewGenerator/getBackgroundThumbnail"
            X.5dc r8 = new X.5dc
            r8.<init>(r2)
            java.io.File r10 = r1.A0C()     // Catch:{ all -> 0x043c }
            r9 = 0
            if (r10 == 0) goto L_0x02d6
            r8.A00(r10)     // Catch:{ Exception -> 0x028c }
            r2 = 1
            android.graphics.Bitmap r30 = r8.getFrameAtTime(r2)     // Catch:{ Exception -> 0x028c }
            goto L_0x0296
        L_0x028c:
            r3 = move-exception
            java.lang.String r2 = "StatusMediaPreviewGenerator/getBackgroundThumbnail/exception"
            com.whatsapp.util.Log.e(r2, r3)     // Catch:{ all -> 0x043c }
            android.graphics.Bitmap r30 = X.C1408873l.A01(r10)     // Catch:{ all -> 0x043c }
        L_0x0296:
            if (r30 == 0) goto L_0x02d6
            X.71b r9 = r5.A08     // Catch:{ all -> 0x043c }
            int r3 = r30.getWidth()     // Catch:{ all -> 0x043c }
            int r2 = r30.getHeight()     // Catch:{ all -> 0x043c }
            X.6rw r3 = r9.A02(r3, r2)     // Catch:{ all -> 0x043c }
            X.6xg r28 = X.C138786xg.A00     // Catch:{ all -> 0x043c }
            android.content.Context r11 = r5.A00     // Catch:{ all -> 0x043c }
            int r2 = r3.A01     // Catch:{ all -> 0x043c }
            java.lang.Integer r32 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x043c }
            int r2 = r3.A00     // Catch:{ all -> 0x043c }
            java.lang.Integer r33 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x043c }
            X.1Lc r10 = r5.A0A     // Catch:{ all -> 0x043c }
            monitor-enter(r21)     // Catch:{ all -> 0x043c }
            java.lang.Integer r9 = r1.A0D     // Catch:{ all -> 0x0436 }
            monitor-exit(r21)     // Catch:{ all -> 0x043c }
            monitor-enter(r21)     // Catch:{ all -> 0x043c }
            java.lang.Integer r3 = r1.A0C     // Catch:{ all -> 0x0436 }
            monitor-exit(r21)     // Catch:{ all -> 0x043c }
            monitor-enter(r21)     // Catch:{ all -> 0x043c }
            java.lang.Integer r2 = r1.A0E     // Catch:{ all -> 0x0436 }
            monitor-exit(r21)     // Catch:{ all -> 0x043c }
            r29 = r11
            r31 = r10
            r34 = r9
            r35 = r3
            r36 = r2
            r37 = r14
            X.6cj r2 = r28.A00(r29, r30, r31, r32, r33, r34, r35, r36, r37)     // Catch:{ all -> 0x043c }
            android.graphics.Bitmap r9 = r2.A00     // Catch:{ all -> 0x043c }
        L_0x02d6:
            r8.close()
            if (r9 == 0) goto L_0x0035
            int r8 = r9.getWidth()
            int r3 = r9.getHeight()
            android.graphics.Point r2 = new android.graphics.Point
            r2.<init>(r8, r3)
            r1.A0K(r2)
            X.1Lc r2 = r5.A0A
            X.0ve r10 = r2.A01
            r2 = 10072(0x2758, float:1.4114E-41)
            boolean r2 = X.C18020vd.A05(r7, r10, r2)
            if (r2 == 0) goto L_0x031a
            float r8 = (float) r4
            float r2 = (float) r6
            float r8 = r8 / r2
            r2 = 1058013184(0x3f100000, float:0.5625)
            int r2 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r2 >= 0) goto L_0x031a
            r3 = 1058013184(0x3f100000, float:0.5625)
            float r2 = r3 - r8
            float r2 = r2 / r3
            r12 = -1082130432(0xffffffffbf800000, float:-1.0)
            float r11 = r2 + r12
            r8 = 1065353216(0x3f800000, float:1.0)
            float r3 = r8 - r2
            android.graphics.RectF r2 = new android.graphics.RectF
            r2.<init>(r11, r8, r3, r12)
            r1.A0M(r2)
            r2 = 1
            monitor-enter(r21)
            r1.A0J = r2     // Catch:{ all -> 0x0439 }
            monitor-exit(r21)
        L_0x031a:
            r2 = 10212(0x27e4, float:1.431E-41)
            boolean r2 = X.C18020vd.A05(r7, r10, r2)
            monitor-enter(r21)
            r1.A0L = r2     // Catch:{ all -> 0x0439 }
            monitor-exit(r21)
            X.6yp r28 = X.C1409573s.A06
            java.lang.String r36 = r1.A0F()
            android.content.Context r12 = r5.A00
            X.1KW r11 = r5.A04
            X.0vb r10 = r5.A03
            X.1Sw r8 = r5.A0B
            X.0ve r7 = r5.A05
            X.1Nq r3 = r5.A07
            X.1T1 r2 = r5.A01
            r29 = r12
            r30 = r2
            r31 = r10
            r32 = r11
            r33 = r7
            r34 = r3
            r35 = r8
            X.73s r3 = r28.A02(r29, r30, r31, r32, r33, r34, r35, r36)
            if (r3 != 0) goto L_0x035a
            android.graphics.RectF r8 = X.C137316vG.A00(r9)
            android.graphics.RectF r7 = X.C137316vG.A00(r9)
            X.0wS r3 = X.C18460wS.A00
            X.73s r3 = r2.A00(r8, r7, r3, r14)
        L_0x035a:
            android.graphics.Bitmap$Config r7 = android.graphics.Bitmap.Config.ARGB_8888     // Catch:{ RuntimeException -> 0x03ea, IOException -> 0x03ee }
            r2 = 1
            android.graphics.Bitmap r7 = r9.copy(r7, r2)     // Catch:{ RuntimeException -> 0x03ea, IOException -> 0x03ee }
            android.graphics.Canvas r9 = X.C108945cZ.A0I(r7)     // Catch:{ RuntimeException -> 0x03ea, IOException -> 0x03ee }
            android.graphics.Paint r8 = X.C108945cZ.A0K(r2)     // Catch:{ RuntimeException -> 0x03ea, IOException -> 0x03ee }
            android.graphics.PorterDuff$Mode r2 = android.graphics.PorterDuff.Mode.SRC_OUT     // Catch:{ RuntimeException -> 0x03ea, IOException -> 0x03ee }
            X.C108965cb.A11(r8, r2)     // Catch:{ RuntimeException -> 0x03ea, IOException -> 0x03ee }
            r8.setColor(r14)     // Catch:{ RuntimeException -> 0x03ea, IOException -> 0x03ee }
            r10 = 0
            float r11 = (float) r4     // Catch:{ RuntimeException -> 0x03ea, IOException -> 0x03ee }
            if (r13 == 0) goto L_0x0377
            float r11 = (float) r6     // Catch:{ RuntimeException -> 0x03ea, IOException -> 0x03ee }
            goto L_0x0378
        L_0x0377:
            r4 = r6
        L_0x0378:
            float r2 = (float) r4     // Catch:{ RuntimeException -> 0x03ea, IOException -> 0x03ee }
            android.graphics.RectF r4 = new android.graphics.RectF     // Catch:{ RuntimeException -> 0x03ea, IOException -> 0x03ee }
            r4.<init>(r10, r10, r11, r2)     // Catch:{ RuntimeException -> 0x03ea, IOException -> 0x03ee }
            X.C18070vi.A0b(r7)     // Catch:{ RuntimeException -> 0x03ea, IOException -> 0x03ee }
            android.graphics.RectF r2 = X.C137316vG.A00(r7)     // Catch:{ RuntimeException -> 0x03ea, IOException -> 0x03ee }
            android.graphics.RectF r6 = X.C137316vG.A01(r4, r2)     // Catch:{ RuntimeException -> 0x03ea, IOException -> 0x03ee }
            float r4 = r6.top     // Catch:{ RuntimeException -> 0x03ea, IOException -> 0x03ee }
            int r2 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r2 <= 0) goto L_0x0394
            r2 = 1065353216(0x3f800000, float:1.0)
            float r4 = r4 + r2
            r6.top = r4     // Catch:{ RuntimeException -> 0x03ea, IOException -> 0x03ee }
        L_0x0394:
            float r4 = r6.bottom     // Catch:{ RuntimeException -> 0x03ea, IOException -> 0x03ee }
            int r2 = r7.getHeight()     // Catch:{ RuntimeException -> 0x03ea, IOException -> 0x03ee }
            float r2 = (float) r2     // Catch:{ RuntimeException -> 0x03ea, IOException -> 0x03ee }
            int r2 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r2 >= 0) goto L_0x03a6
            float r4 = r6.bottom     // Catch:{ RuntimeException -> 0x03ea, IOException -> 0x03ee }
            r2 = 1065353216(0x3f800000, float:1.0)
            float r4 = r4 - r2
            r6.bottom = r4     // Catch:{ RuntimeException -> 0x03ea, IOException -> 0x03ee }
        L_0x03a6:
            float r4 = r6.left     // Catch:{ RuntimeException -> 0x03ea, IOException -> 0x03ee }
            int r2 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r2 <= 0) goto L_0x03b1
            r2 = 1065353216(0x3f800000, float:1.0)
            float r4 = r4 + r2
            r6.left = r4     // Catch:{ RuntimeException -> 0x03ea, IOException -> 0x03ee }
        L_0x03b1:
            float r4 = r6.right     // Catch:{ RuntimeException -> 0x03ea, IOException -> 0x03ee }
            int r2 = r7.getWidth()     // Catch:{ RuntimeException -> 0x03ea, IOException -> 0x03ee }
            float r2 = (float) r2     // Catch:{ RuntimeException -> 0x03ea, IOException -> 0x03ee }
            int r2 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r2 >= 0) goto L_0x03c3
            float r4 = r6.right     // Catch:{ RuntimeException -> 0x03ea, IOException -> 0x03ee }
            r2 = 1065353216(0x3f800000, float:1.0)
            float r4 = r4 - r2
            r6.right = r4     // Catch:{ RuntimeException -> 0x03ea, IOException -> 0x03ee }
        L_0x03c3:
            r9.drawRect(r6, r8)     // Catch:{ RuntimeException -> 0x03ea, IOException -> 0x03ee }
            X.17r r10 = r5.A02     // Catch:{ RuntimeException -> 0x03ea, IOException -> 0x03ee }
            X.0vc r11 = r5.A09     // Catch:{ RuntimeException -> 0x03ea, IOException -> 0x03ee }
            java.lang.String r13 = ".png"
            X.1So r12 = X.C26551So.A0E     // Catch:{ RuntimeException -> 0x03ea, IOException -> 0x03ee }
            r15 = 2
            java.io.File r6 = X.C26511Sk.A0G(r10, r11, r12, r13, r14, r15)     // Catch:{ RuntimeException -> 0x03ea, IOException -> 0x03ee }
            java.io.FileOutputStream r5 = X.C108945cZ.A19(r6)     // Catch:{ RuntimeException -> 0x03ea, IOException -> 0x03ee }
            android.graphics.Bitmap$CompressFormat r4 = android.graphics.Bitmap.CompressFormat.PNG     // Catch:{ all -> 0x03e3 }
            r2 = 100
            boolean r2 = r7.compress(r4, r2, r5)     // Catch:{ all -> 0x03e3 }
            r5.close()     // Catch:{ RuntimeException -> 0x03ea, IOException -> 0x03ee }
            goto L_0x03f5
        L_0x03e3:
            r2 = move-exception
            throw r2     // Catch:{ all -> 0x03e5 }
        L_0x03e5:
            r1 = move-exception
            X.CDX.A00(r5, r2)     // Catch:{ RuntimeException -> 0x03ea, IOException -> 0x03ee }
            throw r1     // Catch:{ RuntimeException -> 0x03ea, IOException -> 0x03ee }
        L_0x03ea:
            r2 = move-exception
            java.lang.String r1 = "StatusMediaPreviewGenerator/generateImage/runtimeexception"
            goto L_0x03f1
        L_0x03ee:
            r2 = move-exception
            java.lang.String r1 = "StatusMediaPreviewGenerator/generateImage/ioexception"
        L_0x03f1:
            com.whatsapp.util.Log.e(r1, r2)
            goto L_0x0412
        L_0x03f5:
            if (r2 == 0) goto L_0x0422
            java.lang.String r2 = X.C18070vi.A0H(r6)
            X.69W r4 = new X.69W
            r4.<init>((java.lang.String) r2)
            java.util.List r2 = r3.A04
            java.util.ArrayList r2 = X.C29431cG.A0m(r2)
            r2.add(r14, r4)
            r3.A04 = r2
            java.lang.String r2 = r3.A05()
            r1.A0Q(r2)
        L_0x0412:
            monitor-enter(r21)
            monitor-exit(r21)
            monitor-enter(r21)
            monitor-exit(r21)
            monitor-enter(r21)
            monitor-exit(r21)
            monitor-enter(r21)
            monitor-exit(r21)
            monitor-enter(r21)
            monitor-exit(r21)
            monitor-enter(r21)
            monitor-exit(r21)
            monitor-enter(r21)
            monitor-exit(r21)
            goto L_0x0035
        L_0x0422:
            java.lang.String r1 = "StatusMediaPreviewGenerator/generateImage/Error generating media"
            com.whatsapp.util.Log.e((java.lang.String) r1)     // Catch:{ RuntimeException -> 0x03ea, IOException -> 0x03ee }
            goto L_0x0412
        L_0x0428:
            r2 = 0
            r1.A0T(r2)
            goto L_0x0035
        L_0x042e:
            r2 = 11003(0x2afb, float:1.5418E-41)
            goto L_0x0055
        L_0x0432:
            java.lang.String r1 = "INFO_UPDATE"
            goto L_0x001a
        L_0x0436:
            r0 = move-exception
            monitor-exit(r21)     // Catch:{ all -> 0x043c }
            throw r0     // Catch:{ all -> 0x043c }
        L_0x0439:
            r0 = move-exception
            monitor-exit(r21)
            throw r0
        L_0x043c:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x043e }
        L_0x043e:
            r0 = move-exception
            X.CDX.A00(r8, r1)
            throw r0
        L_0x0443:
            java.util.HashMap r29 = X.C17880vN.A11()
            java.util.ArrayList r26 = X.AnonymousClass000.A13()
            java.util.ArrayList r31 = X.AnonymousClass000.A13()
            java.util.List r1 = r0.A0Z
            r58 = r1
            java.util.Iterator r4 = r58.iterator()
        L_0x0457:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L_0x04a0
            android.net.Uri r3 = X.C108945cZ.A0M(r4)
            java.lang.StringBuilder r2 = X.AnonymousClass000.A10()
            java.lang.String r1 = "PrepareAndSendMediaTask/prepareMediaPreviewItemAndType/uri = "
            X.C17900vP.A0Y(r3, r1, r2)
            X.73D r1 = r0.A0R
            X.72S r3 = r1.A02(r3)
            boolean r1 = r3.A0W()
            if (r1 == 0) goto L_0x0482
            r1 = 13
        L_0x0478:
            android.util.Pair r2 = X.C17890vO.A0E(r3, r1)
            r1 = r31
            r1.add(r2)
            goto L_0x0457
        L_0x0482:
            boolean r1 = r3.A0X()
            if (r1 == 0) goto L_0x048b
            r1 = 81
            goto L_0x0478
        L_0x048b:
            int r2 = r0.A0O
            X.6xe r1 = X.C138086wV.A02
            boolean r1 = r1.A01(r2)
            if (r1 == 0) goto L_0x0498
            r1 = 20
            goto L_0x0478
        L_0x0498:
            X.1ka r1 = r0.A0C
            int r1 = X.AnonymousClass72S.A00(r3, r1)
            byte r1 = (byte) r1
            goto L_0x0478
        L_0x04a0:
            r8 = 0
            if (r17 == 0) goto L_0x0518
            int r2 = r31.size()
            r1 = 2
            if (r2 < r1) goto L_0x0518
            boolean r1 = r0.A0k
            if (r1 != 0) goto L_0x0518
            r5 = 0
            r3 = 0
            r4 = 0
        L_0x04b1:
            int r1 = r31.size()
            if (r5 >= r1) goto L_0x04f3
            r1 = r31
            java.lang.Object r1 = r1.get(r5)
            android.util.Pair r1 = (android.util.Pair) r1
            java.lang.Object r7 = r1.first
            X.72S r7 = (X.AnonymousClass72S) r7
            int r6 = X.C108965cb.A00(r1)
            java.lang.String r1 = r7.A0E()
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            r1 = r1 ^ 1
            if (r1 == 0) goto L_0x04e2
            if (r5 > 0) goto L_0x0518
            X.0ve r3 = r0.A09
            r2 = 10847(0x2a5f, float:1.52E-41)
            X.0vf r1 = X.C18040vf.A02
            boolean r1 = X.C18020vd.A05(r1, r3, r2)
            if (r1 == 0) goto L_0x0518
            r3 = 1
        L_0x04e2:
            boolean r2 = r7.A0W()
            r1 = 1
            if (r6 == r1) goto L_0x04ec
            r1 = 3
            if (r6 != r1) goto L_0x04f0
        L_0x04ec:
            if (r2 != 0) goto L_0x04f0
            int r4 = r4 + 1
        L_0x04f0:
            int r5 = r5 + 1
            goto L_0x04b1
        L_0x04f3:
            X.0ve r2 = r0.A09
            r1 = 10848(0x2a60, float:1.5201E-41)
            if (r3 == 0) goto L_0x04fb
            r1 = 12538(0x30fa, float:1.757E-41)
        L_0x04fb:
            X.0vf r3 = X.C18040vf.A02
            int r1 = X.C18020vd.A00(r3, r2, r1)
            if (r4 < r1) goto L_0x0518
            X.6db r1 = r0.A05
            X.0ve r2 = r1.A01
            r1 = 8529(0x2151, float:1.1952E-41)
            boolean r1 = X.C18020vd.A05(r3, r2, r1)
            if (r1 == 0) goto L_0x0518
            r1 = 8783(0x224f, float:1.2308E-41)
            boolean r1 = X.C18020vd.A05(r3, r2, r1)
            if (r1 == 0) goto L_0x0518
            r8 = 1
        L_0x0518:
            r24 = 0
            if (r8 == 0) goto L_0x05a7
            X.6db r5 = r0.A05
            java.util.List r1 = r0.A0a
            X.206 r4 = r0.A0T
            java.util.ArrayList r3 = X.C72463Mc.A0s(r1)
            java.util.Iterator r9 = r1.iterator()
        L_0x052a:
            boolean r1 = r9.hasNext()
            if (r1 == 0) goto L_0x0561
            java.lang.Object r6 = r9.next()
            r7 = r6
            com.whatsapp.jid.Jid r7 = (com.whatsapp.jid.Jid) r7
            X.0ve r8 = r5.A01
            r1 = 1
            X.C18070vi.A0d(r7, r1)
            boolean r1 = X.C22971Dz.A0e(r7)
            if (r1 == 0) goto L_0x054d
            r2 = 11473(0x2cd1, float:1.6077E-41)
            X.0vf r1 = X.C18040vf.A02
            boolean r1 = X.C18020vd.A05(r1, r8, r2)
            if (r1 != 0) goto L_0x055a
        L_0x054d:
            boolean r1 = X.C22971Dz.A0Y(r7)
            if (r1 != 0) goto L_0x055a
            boolean r2 = X.C22971Dz.A0U(r7)
            r1 = 0
            if (r2 == 0) goto L_0x055b
        L_0x055a:
            r1 = 1
        L_0x055b:
            if (r1 == 0) goto L_0x052a
            r3.add(r6)
            goto L_0x052a
        L_0x0561:
            int r2 = X.C200510q.A00(r3)
            java.util.LinkedHashMap r30 = new java.util.LinkedHashMap
            r1 = r30
            r1.<init>(r2)
            java.util.Iterator r9 = r3.iterator()
        L_0x0570:
            boolean r1 = r9.hasNext()
            if (r1 == 0) goto L_0x05a9
            java.lang.Object r6 = r9.next()
            r2 = r6
            X.1BI r2 = (X.AnonymousClass1BI) r2
            X.1iW r7 = r5.A00
            X.1PP r1 = r7.A0x
            X.205 r8 = X.C17880vN.A0Z(r2, r1)
            X.11P r1 = r7.A0K
            long r1 = X.AnonymousClass11P.A01(r1)
            X.247 r3 = new X.247
            r3.<init>(r8, r1)
            r2 = 1
            r3.A0a(r2)
            X.1R0 r1 = r7.A10
            r1.A00(r3, r4)
            r7.A0b(r3)
            X.122 r1 = r7.A0U
            r1.BBN(r3, r2)
            r1 = r30
            r1.put(r6, r3)
            goto L_0x0570
        L_0x05a7:
            r30 = r24
        L_0x05a9:
            r18 = 0
            r23 = r24
            r2 = 0
            r5 = 0
        L_0x05af:
            int r1 = r58.size()
            r28 = 3
            if (r2 >= r1) goto L_0x05ff
            X.73D r3 = r0.A0R
            r1 = r58
            java.lang.Object r1 = r1.get(r2)
            android.net.Uri r1 = (android.net.Uri) r1
            X.72S r4 = r3.A02(r1)
            r1 = r31
            java.lang.Object r1 = r1.get(r2)
            android.util.Pair r1 = (android.util.Pair) r1
            int r3 = X.C108965cb.A00(r1)
            r1 = r28
            boolean r1 = X.AnonymousClass000.A1T(r3, r1)
            r5 = r5 | r1
            java.lang.String r1 = r4.A0E()
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L_0x05f1
            if (r23 != 0) goto L_0x05f4
            java.lang.StringBuilder r23 = X.AnonymousClass000.A10()
            r1 = r23
            r1.append(r2)
        L_0x05ed:
            r3 = 1
            long r18 = r18 + r3
        L_0x05f1:
            int r2 = r2 + 1
            goto L_0x05af
        L_0x05f4:
            java.lang.String r3 = ","
            r1 = r23
            r1.append(r3)
            r1.append(r2)
            goto L_0x05ed
        L_0x05ff:
            if (r5 == 0) goto L_0x060e
            X.0ve r1 = r0.A09
            boolean r1 = X.C1402270m.A02(r1)
            if (r1 == 0) goto L_0x060e
            r1 = 1000(0x3e8, double:4.94E-321)
            java.lang.Thread.sleep(r1)     // Catch:{ InterruptedException -> 0x060e }
        L_0x060e:
            r20 = 0
        L_0x0610:
            int r2 = r58.size()
            r1 = r20
            if (r1 >= r2) goto L_0x111b
            r2 = r58
            java.lang.Object r2 = r2.get(r1)
            android.net.Uri r2 = (android.net.Uri) r2
            r3 = r31
            java.lang.Object r4 = r3.get(r1)
            android.util.Pair r4 = (android.util.Pair) r4
            X.1ka r3 = r0.A0C
            java.lang.Object r1 = r4.first
            X.72S r1 = (X.AnonymousClass72S) r1
            int r6 = r3.A01(r1)
            X.1Lc r1 = r0.A0J
            X.0ve r5 = r1.A01
            r1 = 10542(0x292e, float:1.4772E-41)
            X.0vf r3 = X.C18040vf.A02
            boolean r1 = X.C18020vd.A05(r3, r5, r1)
            if (r1 == 0) goto L_0x1114
            if (r27 == 0) goto L_0x1114
            r1 = r28
            if (r6 == r1) goto L_0x064a
            r1 = 13
            if (r6 != r1) goto L_0x0656
        L_0x064a:
            X.1Lc r1 = r0.A0J
            X.0ve r5 = r1.A01
            r1 = 11003(0x2afb, float:1.5418E-41)
            boolean r1 = X.C18020vd.A05(r3, r5, r1)
            if (r1 == 0) goto L_0x1114
        L_0x0656:
            X.63x r16 = new X.63x
            r16.<init>()
        L_0x065b:
            java.lang.Object r1 = r4.first
            X.72S r1 = (X.AnonymousClass72S) r1
            int r9 = X.C108965cb.A00(r4)
            if (r23 != 0) goto L_0x110e
            r8 = r24
        L_0x0667:
            r44 = r30
            X.0z4 r4 = r0.A08
            r5 = 1
            android.content.SharedPreferences$Editor r6 = X.C19830z4.A00(r4)
            java.lang.String r4 = "media_quality_has_send_media"
            X.C17880vN.A1F(r6, r4, r5)
            java.lang.Integer r4 = r0.A0V
            r25 = r4
            int r6 = r25.intValue()
            r4 = r28
            if (r6 != r4) goto L_0x0694
            java.util.HashSet r4 = r0.A0Y
            int r4 = r4.size()
            if (r4 <= 0) goto L_0x0694
            X.0z4 r4 = r0.A08
            android.content.SharedPreferences$Editor r6 = X.C19830z4.A00(r4)
            java.lang.String r4 = "media_quality_has_send_hd_media"
            X.C17880vN.A1F(r6, r4, r5)
        L_0x0694:
            boolean r5 = r1.A0W()
            r11 = 1
            if (r9 == r11) goto L_0x069f
            r4 = r28
            if (r9 != r4) goto L_0x110b
        L_0x069f:
            if (r5 != 0) goto L_0x110b
        L_0x06a1:
            boolean r4 = r0.A0k
            r21 = r4
            if (r4 == 0) goto L_0x06c7
            r0.A05(r2, r1)
            boolean r4 = r0.A0j
            if (r4 == 0) goto L_0x06d0
            java.io.File r4 = X.C64062u9.A04(r2)
            r4.delete()     // Catch:{ Exception -> 0x06b6 }
            goto L_0x06d0
        L_0x06b6:
            r4 = move-exception
            java.lang.String r7 = "PrepareAndSendMediaTask/deleteExternalForViewOnce"
            com.whatsapp.util.Log.e(r7, r4)
            X.190 r6 = r0.A00
            java.lang.String r5 = r4.getMessage()
            r4 = 1
            r6.A0G(r7, r5, r4)
            goto L_0x06d0
        L_0x06c7:
            boolean r4 = r1.A0X()
            if (r4 == 0) goto L_0x0f3e
            r0.A05(r2, r1)
        L_0x06d0:
            java.lang.StringBuilder r5 = X.AnonymousClass000.A10()
            java.lang.String r4 = "PrepareAndSendMediaTask/sendMedia/uri = "
            X.C17900vP.A0Y(r2, r4, r5)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r9)
            r4 = r29
            java.lang.Object r6 = r4.get(r5)
            X.64U r6 = (X.AnonymousClass64U) r6
            if (r6 != 0) goto L_0x06f2
            r4 = r21
            X.64U r6 = r0.A01(r9, r4)
            r4 = r29
            r4.put(r5, r6)
        L_0x06f2:
            java.lang.Long r4 = r6.A0O
            if (r4 != 0) goto L_0x06fc
            java.lang.Long r4 = X.C17890vO.A0L()
            r6.A0O = r4
        L_0x06fc:
            java.lang.Long r4 = X.C108995ce.A0T(r4)
            r6.A0O = r4
            X.0ve r5 = r0.A09
            r4 = 8954(0x22fa, float:1.2547E-41)
            boolean r4 = X.C18020vd.A05(r3, r5, r4)
            if (r4 == 0) goto L_0x0716
            if (r8 == 0) goto L_0x0710
            r6.A0b = r8
        L_0x0710:
            java.lang.Long r4 = java.lang.Long.valueOf(r18)
            r6.A0E = r4
        L_0x0716:
            r4 = 1
            r22 = 0
            if (r9 == r4) goto L_0x0da9
            r5 = 81
            r7 = 13
            r8 = 3
            if (r9 == r8) goto L_0x0932
            if (r9 == r7) goto L_0x0932
            r4 = 20
            if (r9 == r4) goto L_0x0797
            if (r9 == r5) goto L_0x0932
        L_0x072a:
            X.0ve r4 = r0.A09
            X.0vf r3 = X.C18040vf.A01
            r2 = 5976(0x1758, float:8.374E-42)
            boolean r2 = X.C18020vd.A05(r3, r4, r2)
            if (r2 == 0) goto L_0x10d9
            java.lang.Long r2 = r6.A0I
            if (r2 == 0) goto L_0x10d9
            long r5 = r2.longValue()
            r3 = 0
            int r2 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r2 <= 0) goto L_0x10d9
            java.util.List r3 = r0.A0a
            X.1cg r2 = X.C29671cg.A00
            boolean r2 = r3.contains(r2)
            int r3 = r3.size()
            X.62t r6 = new X.62t
            r6.<init>()
            if (r2 == 0) goto L_0x0794
            r4 = 1
        L_0x0759:
            java.lang.Long r2 = java.lang.Long.valueOf(r4)
            r6.A03 = r2
            long r4 = (long) r3
            long r2 = r2.longValue()
            java.lang.Long r2 = X.C108945cZ.A1B(r4, r2)
            r6.A01 = r2
            X.6o7 r2 = r0.A0F
            X.73s r1 = r2.A01(r1)
            java.util.List r1 = r1.A04
            java.util.ArrayList r3 = X.AnonymousClass000.A13()
            java.util.Iterator r4 = r1.iterator()
        L_0x077a:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L_0x10bd
            X.73u r2 = X.C108945cZ.A0k(r4)
            boolean r1 = r2 instanceof X.AnonymousClass69N
            if (r1 == 0) goto L_0x077a
            X.69N r2 = (X.AnonymousClass69N) r2
            if (r2 == 0) goto L_0x077a
            boolean r1 = r2.A01
            if (r1 == 0) goto L_0x077a
            r3.add(r2)
            goto L_0x077a
        L_0x0794:
            r4 = 0
            goto L_0x0759
        L_0x0797:
            java.lang.String r4 = "PrepareAndSendMediaTask/sendSticker"
            com.whatsapp.util.Log.i((java.lang.String) r4)
            X.2ai r4 = r0.A0D
            X.19Y r8 = r4.A00
            r7 = 1
            java.lang.String r5 = "SEND_TASK_IMAGE_START"
            r4 = 453122092(0x1b02182c, float:1.0761158E-22)
            r8.markerPoint((int) r4, (int) r7, (java.lang.String) r5)
            X.69x r13 = r0.A0E
            r9 = 0
            X.C18070vi.A0d(r2, r9)
            X.1Sl r4 = r13.A02
            android.net.Uri$Builder r8 = X.C123976Wo.A00(r6, r1, r4)
            r11 = 0
            java.lang.String r5 = X.C108975cc.A0c(r2, r4)
            java.lang.String r4 = "mime_type"
            r8.appendQueryParameter(r4, r5)
            X.C26521Sl.A0Z(r8, r1)
            int r12 = r1.A01()
            X.73s r10 = r13.A01(r1)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r9)
            X.00H r4 = r13.A04
            X.6ub r5 = X.C108945cZ.A0j(r4)
            r4 = 1
            X.6nF r4 = r5.A00(r7, r4, r9)
            X.C17960vV.A07(r4)
            X.C18070vi.A0X(r4)
            java.lang.String r9 = "ImageSendPrepHelper/getStickerBitmap/error"
            android.graphics.Bitmap r4 = X.C1198069x.A00(r8, r4, r13)     // Catch:{ Exception | OutOfMemoryError -> 0x092c }
            if (r4 == 0) goto L_0x072a
            X.00H r8 = r13.A05     // Catch:{ Exception | OutOfMemoryError -> 0x092c }
            r8.get()     // Catch:{ Exception | OutOfMemoryError -> 0x092c }
            android.graphics.Bitmap r7 = X.C1403971g.A01(r4)     // Catch:{ Exception | OutOfMemoryError -> 0x092c }
            java.lang.Integer r4 = r6.A07     // Catch:{ Exception | OutOfMemoryError -> 0x092c }
            if (r4 == 0) goto L_0x0835
            int r5 = r4.intValue()     // Catch:{ Exception | OutOfMemoryError -> 0x092c }
            r4 = 42
            if (r5 == r4) goto L_0x0805
            r4 = 44
            if (r5 == r4) goto L_0x0805
            r4 = 50
            r14 = 0
            if (r5 != r4) goto L_0x0806
        L_0x0805:
            r14 = 1
        L_0x0806:
            if (r10 != 0) goto L_0x0815
            if (r14 != 0) goto L_0x0835
            java.lang.Object r4 = r8.get()     // Catch:{ Exception | OutOfMemoryError -> 0x092c }
            X.71g r4 = (X.C1403971g) r4     // Catch:{ Exception | OutOfMemoryError -> 0x092c }
            android.graphics.Bitmap r5 = r4.A02(r7)     // Catch:{ Exception | OutOfMemoryError -> 0x092c }
            goto L_0x0821
        L_0x0815:
            java.lang.Object r4 = r8.get()     // Catch:{ Exception | OutOfMemoryError -> 0x092c }
            X.71g r4 = (X.C1403971g) r4     // Catch:{ Exception | OutOfMemoryError -> 0x092c }
            if (r14 == 0) goto L_0x0825
            android.graphics.Bitmap r5 = X.C1403971g.A00(r7)     // Catch:{ Exception | OutOfMemoryError -> 0x092c }
        L_0x0821:
            r7.recycle()     // Catch:{ Exception | OutOfMemoryError -> 0x092c }
            goto L_0x0834
        L_0x0825:
            android.graphics.Bitmap r4 = r4.A02(r7)     // Catch:{ Exception | OutOfMemoryError -> 0x092c }
            r7.recycle()     // Catch:{ Exception | OutOfMemoryError -> 0x092c }
            android.graphics.Bitmap r5 = X.C1403971g.A00(r4)     // Catch:{ Exception | OutOfMemoryError -> 0x092c }
            r4.recycle()     // Catch:{ Exception | OutOfMemoryError -> 0x092c }
            goto L_0x0821
        L_0x0834:
            r7 = r5
        L_0x0835:
            if (r12 == 0) goto L_0x084d
            boolean r4 = r7.isMutable()     // Catch:{ Exception | OutOfMemoryError -> 0x092c }
            X.C17960vV.A0C(r4)     // Catch:{ Exception | OutOfMemoryError -> 0x092c }
            X.2E5 r4 = r13.A01     // Catch:{ Exception | OutOfMemoryError -> 0x092c }
            com.whatsapp.filter.FilterUtils.A00(r7, r4, r12, r11)     // Catch:{ Exception | OutOfMemoryError -> 0x092c }
            java.lang.Long r4 = r6.A0N     // Catch:{ Exception | OutOfMemoryError -> 0x092c }
            if (r4 == 0) goto L_0x084d
            java.lang.Long r4 = X.C108995ce.A0T(r4)     // Catch:{ Exception | OutOfMemoryError -> 0x092c }
            r6.A0N = r4     // Catch:{ Exception | OutOfMemoryError -> 0x092c }
        L_0x084d:
            if (r10 == 0) goto L_0x0869
            java.util.List r4 = r10.A04     // Catch:{ Exception | OutOfMemoryError -> 0x092c }
            java.util.Iterator r5 = r4.iterator()     // Catch:{ Exception | OutOfMemoryError -> 0x092c }
        L_0x0855:
            boolean r4 = r5.hasNext()     // Catch:{ Exception | OutOfMemoryError -> 0x092c }
            if (r4 == 0) goto L_0x0863
            X.73u r4 = X.C108945cZ.A0k(r5)     // Catch:{ Exception | OutOfMemoryError -> 0x092c }
            r4.A0G()     // Catch:{ Exception | OutOfMemoryError -> 0x092c }
            goto L_0x0855
        L_0x0863:
            r10.A07(r7)     // Catch:{ Exception | OutOfMemoryError -> 0x092c }
            r10.A0A(r6)     // Catch:{ Exception | OutOfMemoryError -> 0x092c }
        L_0x0869:
            android.graphics.Bitmap r5 = X.AnonymousClass204.A03(r7)     // Catch:{ Exception | OutOfMemoryError -> 0x092c }
            X.C18070vi.A0X(r5)     // Catch:{ Exception | OutOfMemoryError -> 0x092c }
            boolean r4 = r5.sameAs(r7)     // Catch:{ Exception | OutOfMemoryError -> 0x092c }
            if (r4 != 0) goto L_0x0879
            r7.recycle()     // Catch:{ Exception | OutOfMemoryError -> 0x092c }
        L_0x0879:
            r7 = 512(0x200, float:7.175E-43)
            r4 = 16
            android.graphics.Bitmap r10 = X.AnonymousClass204.A04(r5, r7, r4)     // Catch:{ Exception | OutOfMemoryError -> 0x092c }
            X.C18070vi.A0X(r10)     // Catch:{ Exception | OutOfMemoryError -> 0x092c }
            r5.recycle()     // Catch:{ Exception | OutOfMemoryError -> 0x092c }
            r0.A08(r6, r1)
            X.6o7 r4 = r0.A0F
            X.73s r4 = r4.A01(r1)
            java.lang.String r9 = r0.A03(r4)
            X.1kd r8 = r0.A03
            java.util.List r7 = r0.A0a
            int r5 = r58.size()
            X.00H r4 = r8.A0J
            java.lang.Object r13 = r4.get()
            X.72H r13 = (X.AnonymousClass72H) r13
            X.0ve r14 = r8.A07
            r12 = 11136(0x2b80, float:1.5605E-41)
            int r12 = X.C18020vd.A00(r3, r14, r12)
            r3 = r24
            X.77d r12 = r13.A02(r10, r3, r12)
            if (r12 != 0) goto L_0x08c2
            java.lang.String r2 = "SendMedia/sendComposedStaticSticker/sticker is null"
            com.whatsapp.util.Log.e((java.lang.String) r2)
        L_0x08b9:
            X.2ai r2 = r0.A0D
            X.19Y r5 = r2.A00
            r4 = 1
            java.lang.String r3 = "SEND_TASK_IMAGE_END"
            goto L_0x0d8f
        L_0x08c2:
            boolean r3 = android.text.TextUtils.isEmpty(r9)
            if (r3 != 0) goto L_0x08ca
            r12.A06 = r9
        L_0x08ca:
            r45 = 1
            r43 = 4
            X.73B r3 = new X.73B
            r34 = r24
            r35 = r24
            r36 = r24
            r37 = r24
            r38 = r24
            r40 = r24
            r41 = r24
            r42 = r24
            r46 = r11
            r47 = r11
            r48 = r11
            r49 = r11
            r50 = r11
            r32 = r3
            r33 = r24
            r39 = r9
            r44 = r11
            r32.<init>(r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50)
            r12.A04 = r3
            java.lang.Object r3 = r4.get()
            X.72H r3 = (X.AnonymousClass72H) r3
            r3.A04(r12)
            r10.recycle()
            java.lang.StringBuilder r4 = X.AnonymousClass000.A10()
            java.lang.String r3 = "SendMedia/sendComposedStaticSticker/stickers to "
            X.C17890vO.A15(r3, r4, r7)
            java.lang.String r3 = " chats"
            X.C17890vO.A1A(r4, r3)
            X.1iW r4 = r8.A03
            r3 = 8
            X.2bF r5 = r4.A0H(r12, r7, r3, r5)
            if (r5 == 0) goto L_0x08b9
            X.87V r3 = r0.A0S
            if (r3 == 0) goto L_0x08b9
            r4 = 22
            X.7Ne r3 = new X.7Ne
            r3.<init>(r2, r0, r4)
            X.Af0 r2 = r5.A00
            r2.A09(r3)
            goto L_0x08b9
        L_0x092c:
            r2 = move-exception
            com.whatsapp.util.Log.e(r9, r2)
            goto L_0x072a
        L_0x0932:
            if (r16 == 0) goto L_0x093f
            if (r9 == r7) goto L_0x0937
            r8 = 2
        L_0x0937:
            java.lang.Integer r7 = java.lang.Integer.valueOf(r8)
            r4 = r16
            r4.A05 = r7
        L_0x093f:
            if (r9 != r5) goto L_0x0960
            X.18K r10 = r0.A0A
            java.lang.Integer r34 = X.AnonymousClass00R.A0C
            r9 = 1
            X.C18070vi.A0d(r10, r9)
            X.6tV r8 = r0.A0U
            java.lang.String r4 = "PtvRecordingData cannot be null for PTV"
            X.C17960vV.A08(r8, r4)
            X.71x r7 = r1.A07()
            if (r7 != 0) goto L_0x09f6
            X.190 r8 = r0.A00
            r7 = 0
            java.lang.String r5 = "PrepareAndSendMediaTask/VideoMeta is null for PTV"
            r4 = r24
            r8.A0G(r5, r4, r7)
        L_0x0960:
            if (r11 != 0) goto L_0x0964
            r44 = r24
        L_0x0964:
            X.2ai r4 = r0.A0D
            X.19Y r8 = r4.A00
            r7 = 1
            java.lang.String r5 = "SEND_TASK_VIDEO_START"
            r4 = 453122092(0x1b02182c, float:1.0761158E-22)
            r8.markerPoint((int) r4, (int) r7, (java.lang.String) r5)
            java.util.HashSet r5 = r0.A0Y
            boolean r4 = r5.contains(r2)
            if (r4 != 0) goto L_0x0983
            android.net.Uri r4 = r1.A0X
            boolean r4 = r5.contains(r4)
            if (r4 != 0) goto L_0x0983
            r25 = r24
        L_0x0983:
            boolean r4 = r1.A0V()
            if (r4 == 0) goto L_0x09f4
            X.69x r4 = r0.A0E
            java.lang.Integer r12 = java.lang.Integer.valueOf(r28)
            java.util.List r7 = r0.A0a
            X.1cg r5 = X.C29671cg.A00
            boolean r13 = r7.contains(r5)
            if (r17 != 0) goto L_0x099e
            boolean r5 = r0.A0d
            r14 = 1
            if (r5 != 0) goto L_0x099f
        L_0x099e:
            r14 = 0
        L_0x099f:
            r15 = 1
            r7 = r4
            r8 = r2
            r9 = r16
            r10 = r6
            r11 = r1
            android.net.Uri$Builder r4 = r7.A02(r8, r9, r10, r11, r12, r13, r14, r15)
            if (r4 == 0) goto L_0x09ed
            android.net.Uri r10 = r4.build()
        L_0x09b0:
            boolean r4 = r1.A0V()
            if (r4 == 0) goto L_0x09c6
            if (r10 == 0) goto L_0x09d1
            java.lang.String r4 = r10.getPath()
            java.io.File r9 = X.C108945cZ.A17(r4)
        L_0x09c0:
            android.graphics.Point r11 = r1.A04()
            monitor-enter(r1)
            goto L_0x0a0d
        L_0x09c6:
            X.73D r4 = r0.A0R
            X.72S r4 = r4.A02(r2)
            java.io.File r9 = r4.A0C()
            goto L_0x09d2
        L_0x09d1:
            r9 = 0
        L_0x09d2:
            r4 = 1
            if (r9 != 0) goto L_0x09c0
            java.lang.String r2 = "PrepareAndSendMediaTask/sendVideoOrGif/file is null"
            com.whatsapp.util.Log.e((java.lang.String) r2)
            X.190 r5 = r0.A00
            java.lang.StringBuilder r3 = X.AnonymousClass000.A10()
            java.lang.String r2 = "file is null for uri = "
            java.lang.String r3 = X.AnonymousClass001.A1E(r10, r2, r3)
            java.lang.String r2 = "PrepareAndSendMediaTask/sendVideoOrGif"
            r5.A0G(r2, r3, r4)
            goto L_0x072a
        L_0x09ed:
            java.lang.String r4 = "PrepareAndSendMediaTask/sendVideoOrGif/photo to video failed to prepare send URI image"
            com.whatsapp.util.Log.e((java.lang.String) r4)
            r10 = 0
            goto L_0x09b0
        L_0x09f4:
            r10 = r2
            goto L_0x09b0
        L_0x09f6:
            java.lang.Integer r35 = X.AnonymousClass00R.A00
            long r4 = r7.A03
            java.io.File r7 = r7.A05
            long r38 = r7.length()
            r32 = r10
            r33 = r8
            r36 = r4
            r40 = r9
            X.AnonymousClass6XK.A00(r32, r33, r34, r35, r36, r38, r40)
            goto L_0x0960
        L_0x0a0d:
            long r4 = r1.A02     // Catch:{ all -> 0x1118 }
            monitor-exit(r1)
            int r7 = (int) r4
            r5 = 0
            android.graphics.Point r4 = new android.graphics.Point
            r4.<init>(r5, r7)
            if (r11 == 0) goto L_0x0a5c
            boolean r4 = r11.equals(r4)
            if (r4 != 0) goto L_0x0a5c
            int r4 = r11.x
            long r7 = (long) r4
            int r4 = r11.y
            long r12 = (long) r4
            r35 = 0
        L_0x0a27:
            android.graphics.Point r4 = r1.A03()
            if (r4 == 0) goto L_0x0a59
            int r5 = r4.x
            int r4 = r4.y
            r34 = r4
        L_0x0a33:
            if (r16 == 0) goto L_0x0a57
            X.71x r4 = r1.A07()
            if (r4 == 0) goto L_0x0a57
            X.71x r4 = r1.A07()
            int r4 = r4.A02
            java.lang.Long r11 = X.C17880vN.A0n(r4)
            r4 = r16
            r4.A07 = r11
            X.71x r4 = r1.A07()
            int r4 = r4.A00
            java.lang.Long r11 = X.C17880vN.A0n(r4)
            r4 = r16
            r4.A06 = r11
        L_0x0a57:
            monitor-enter(r1)
            goto L_0x0a63
        L_0x0a59:
            r34 = 0
            goto L_0x0a33
        L_0x0a5c:
            r7 = 0
            r35 = 1
            r12 = 0
            goto L_0x0a27
        L_0x0a63:
            X.CrM r4 = r1.A05     // Catch:{ all -> 0x1118 }
            monitor-exit(r1)
            if (r4 == 0) goto L_0x0ad3
            X.0ve r14 = r0.A09
            r11 = 11636(0x2d74, float:1.6306E-41)
            boolean r3 = X.C18020vd.A05(r3, r14, r11)
            if (r3 == 0) goto L_0x0ad3
            boolean r32 = r1.A0U()
            X.6rN r3 = r1.A06
            boolean r33 = X.AnonymousClass000.A1W(r3)
            r40 = r12
            r38 = r7
            r14 = 0
            int r3 = (r7 > r14 ? 1 : (r7 == r14 ? 0 : -1))
            if (r3 > 0) goto L_0x0a88
            r38 = 0
        L_0x0a88:
            int r3 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r3 > 0) goto L_0x0a8e
            r40 = -1
        L_0x0a8e:
            java.util.concurrent.TimeUnit r37 = java.util.concurrent.TimeUnit.MILLISECONDS
            X.A5W r3 = new X.A5W
            r36 = r3
            r36.<init>(r37, r38, r40)
            X.Cac r11 = new X.Cac
            r11.<init>()
            X.BzJ r15 = X.C24322BzJ.VIDEO
            A06(r3, r15, r11, r4)
            if (r32 == 0) goto L_0x0aa7
            r32 = 1
            if (r33 == 0) goto L_0x0aae
        L_0x0aa7:
            r32 = 0
            X.BzJ r14 = X.C24322BzJ.AUDIO
            A06(r3, r14, r11, r4)
        L_0x0aae:
            A07(r15, r11, r4)
            if (r32 != 0) goto L_0x0ab8
            X.BzJ r3 = X.C24322BzJ.AUDIO
            A07(r3, r11, r4)
        L_0x0ab8:
            X.CrM r3 = new X.CrM
            r3.<init>(r11)
            org.json.JSONObject r3 = r3.A08()     // Catch:{ JSONException -> 0x0ac6 }
            java.lang.String r48 = r3.toString()     // Catch:{ JSONException -> 0x0ac6 }
            goto L_0x0ad5
        L_0x0ac6:
            r4 = move-exception
            java.io.IOException r3 = new java.io.IOException     // Catch:{ IOException -> 0x0acd }
            r3.<init>(r4)     // Catch:{ IOException -> 0x0acd }
            throw r3     // Catch:{ IOException -> 0x0acd }
        L_0x0acd:
            r4 = move-exception
            java.lang.String r3 = "PrepareAndSendMediaTask/sendVideoOrGif/failed to serialize media composition"
            com.whatsapp.util.Log.e(r3, r4)
        L_0x0ad3:
            r48 = 0
        L_0x0ad5:
            X.6o7 r3 = r0.A0F
            X.73s r11 = r3.A01(r1)
            X.2rc r3 = new X.2rc
            r3.<init>()
            r3.A0G = r9
            r3.A0D = r7
            r3.A0E = r12
            monitor-enter(r1)
            boolean r4 = r1.A0J     // Catch:{ all -> 0x1118 }
            r33 = r4
            monitor-exit(r1)
            monitor-enter(r1)
            boolean r4 = r1.A0L     // Catch:{ all -> 0x1118 }
            r32 = r4
            monitor-exit(r1)
            android.graphics.RectF r46 = r1.A06()
            monitor-enter(r1)
            boolean r15 = r1.A0R     // Catch:{ all -> 0x1118 }
            monitor-exit(r1)
            monitor-enter(r1)
            X.6rN r14 = r1.A06     // Catch:{ all -> 0x1118 }
            monitor-exit(r1)
            boolean r54 = r1.A0V()
            X.2ra r4 = new X.2ra
            r45 = r4
            r47 = r14
            r49 = r5
            r50 = r34
            r51 = r33
            r52 = r32
            r53 = r15
            r45.<init>(r46, r47, r48, r49, r50, r51, r52, r53, r54)
            r3.A0F = r4
            boolean r4 = r1.A0U()
            r3.A0T = r4
            if (r25 == 0) goto L_0x0b28
            int r15 = r25.intValue()
            r14 = 1
            r4 = r28
            if (r15 == r4) goto L_0x0b29
        L_0x0b28:
            r14 = 0
        L_0x0b29:
            r3.A0S = r14
            java.lang.String r4 = r0.A03(r11)
            r3.A0H = r4
            if (r11 == 0) goto L_0x0b3b
            boolean r4 = r11.A0B()
            if (r4 == 0) goto L_0x0b3b
            r35 = 0
        L_0x0b3b:
            r14 = 1000(0x3e8, double:4.94E-321)
            boolean r4 = r1.A0V()
            if (r11 != 0) goto L_0x0b9e
            if (r4 == 0) goto L_0x0b4f
            X.1Sl r5 = r0.A0L     // Catch:{ 1iX | IOException -> 0x0c02 }
            r4 = 100
            android.graphics.Bitmap r4 = r5.A0h(r10, r4, r4)     // Catch:{ 1iX | IOException -> 0x0c02 }
            goto L_0x0c09
        L_0x0b4f:
            if (r5 <= 0) goto L_0x0b86
            if (r34 <= 0) goto L_0x0b86
            long r51 = r7 * r14
            android.graphics.RectF r45 = r1.A06()
            r50 = 0
            r4 = 0
            X.DRK.A04(r9)     // Catch:{ IOException -> 0x0b71 }
            android.graphics.Bitmap r4 = X.DRK.A00(r9)     // Catch:{ IOException | IllegalArgumentException -> 0x0b69, Exception -> 0x0b65 }
            goto L_0x0c09
        L_0x0b65:
            r9 = move-exception
            java.lang.String r5 = "mediafileutils/createGifThumbnail/unexpected gif exception "
            goto L_0x0b6c
        L_0x0b69:
            r9 = move-exception
            java.lang.String r5 = "mediafileutils/createGifThumbnail/gif file not read "
        L_0x0b6c:
            com.whatsapp.util.Log.e(r5, r9)
            goto L_0x0c09
        L_0x0b71:
            r49 = -1
            X.6c1 r4 = new X.6c1
            r4.<init>(r9)
            r46 = r4
            r47 = r5
            r48 = r34
            r53 = r50
            android.graphics.Bitmap r4 = X.C1408873l.A00(r45, r46, r47, r48, r49, r50, r51, r53)
            goto L_0x0c09
        L_0x0b86:
            long r4 = r7 * r14
            r14 = 0
            int r11 = (r4 > r14 ? 1 : (r4 == r14 ? 0 : -1))
            if (r11 != 0) goto L_0x0b93
            byte[] r39 = X.C1408873l.A04(r9)
            goto L_0x0c0f
        L_0x0b93:
            android.graphics.Bitmap r5 = X.C1408873l.A02(r9, r4)
            r4 = 100
            byte[] r39 = X.C1408873l.A03(r5, r4)
            goto L_0x0c0f
        L_0x0b9e:
            if (r4 == 0) goto L_0x0ba9
            X.1Sl r5 = r0.A0L     // Catch:{ 1iX | IOException -> 0x0bf7 }
            r4 = 100
            android.graphics.Bitmap r14 = r5.A0h(r10, r4, r4)     // Catch:{ 1iX | IOException -> 0x0bf7 }
            goto L_0x0bb1
        L_0x0ba9:
            java.io.File r9 = r3.A0G
            long r4 = r7 * r14
            android.graphics.Bitmap r14 = X.C1408873l.A02(r9, r4)
        L_0x0bb1:
            if (r14 == 0) goto L_0x0bfd
            boolean r4 = r14.isMutable()
            if (r4 != 0) goto L_0x0bc2
            android.graphics.Bitmap$Config r5 = android.graphics.Bitmap.Config.ARGB_8888
            r4 = 1
            android.graphics.Bitmap r14 = r14.copy(r5, r4)
            if (r14 == 0) goto L_0x0bfd
        L_0x0bc2:
            int r4 = r14.getWidth()
            float r5 = (float) r4
            int r4 = r14.getHeight()
            float r4 = (float) r4
            java.util.ArrayList r9 = r11.A06(r5, r4)
            r5 = 0
            r11.A08(r14, r5, r5, r5)
            r4 = 100
            byte[] r39 = X.C1408873l.A03(r14, r4)
        L_0x0bda:
            r11.A0A(r6)
            boolean r4 = r11.A0B()
            if (r4 != 0) goto L_0x0be5
            r5 = r35
        L_0x0be5:
            java.lang.String r14 = X.C26511Sk.A0K()
            r3.A0K = r14
            X.17r r4 = r0.A01
            java.io.File r4 = X.C26511Sk.A0H(r4, r14)
            r11.A0C(r4)
            r35 = r5
            goto L_0x0c10
        L_0x0bf7:
            r5 = move-exception
            java.lang.String r4 = "PrepareAndSendMediaTask/sendVideoOrGif/failed to get PTV thumbnail"
            com.whatsapp.util.Log.e(r4, r5)
        L_0x0bfd:
            r5 = 0
            r39 = 0
            r9 = 0
            goto L_0x0bda
        L_0x0c02:
            r5 = move-exception
            java.lang.String r4 = "PrepareAndSendMediaTask/sendVideoOrGif/failed to get PTV thumbnail"
            com.whatsapp.util.Log.e(r4, r5)
            r4 = 0
        L_0x0c09:
            r5 = 100
            byte[] r39 = X.C1408873l.A03(r4, r5)
        L_0x0c0f:
            r9 = 0
        L_0x0c10:
            boolean r4 = r1.A0W()
            if (r4 == 0) goto L_0x0c54
            r54 = 13
        L_0x0c18:
            if (r35 == 0) goto L_0x0c4b
            java.lang.Long r4 = r6.A0P
            java.lang.Long r4 = X.C108985cd.A0d(r4)
            r6.A0P = r4
        L_0x0c22:
            java.lang.String r15 = r1.A0E()
            X.2kg r5 = r0.A0H
            java.lang.String r4 = r1.A0G()
            java.util.List r14 = r5.A00(r4)
            java.util.ArrayList r4 = r0.A04(r10)
            if (r4 == 0) goto L_0x0c3f
            if (r9 != 0) goto L_0x0c3c
            java.util.ArrayList r9 = X.AnonymousClass000.A13()
        L_0x0c3c:
            r9.addAll(r4)
        L_0x0c3f:
            X.6rN r4 = r1.A06
            if (r4 == 0) goto L_0x0cab
            if (r9 != 0) goto L_0x0c49
            java.util.ArrayList r9 = X.AnonymousClass000.A13()
        L_0x0c49:
            monitor-enter(r1)
            goto L_0x0c64
        L_0x0c4b:
            java.lang.Long r4 = r6.A0J
            java.lang.Long r4 = X.C108985cd.A0d(r4)
            r6.A0J = r4
            goto L_0x0c22
        L_0x0c54:
            boolean r4 = r1.A0X()
            if (r4 == 0) goto L_0x0c5d
            r54 = 81
            goto L_0x0c18
        L_0x0c5d:
            X.1ka r4 = r0.A0C
            int r54 = X.AnonymousClass72S.A00(r1, r4)
            goto L_0x0c18
        L_0x0c64:
            X.6rN r4 = r1.A06     // Catch:{ all -> 0x1118 }
            r34 = r4
            monitor-exit(r1)
            if (r4 != 0) goto L_0x0c72
            java.lang.String r2 = "PrepareAndSendMediaTask/appendMusic/song null"
            com.whatsapp.util.Log.e((java.lang.String) r2)
            goto L_0x072a
        L_0x0c72:
            long r4 = r12 - r7
            r32 = 0
            int r11 = (r4 > r32 ? 1 : (r4 == r32 ? 0 : -1))
            if (r11 > 0) goto L_0x0c7e
            monitor-enter(r1)
            long r4 = r1.A02     // Catch:{ all -> 0x1118 }
            monitor-exit(r1)
        L_0x0c7e:
            monitor-enter(r1)
            monitor-exit(r1)
            X.00H r11 = r0.A0M
            java.lang.Object r11 = r11.get()
            com.whatsapp.productinfra.music.publishing.MusicPublishing r11 = (com.whatsapp.productinfra.music.publishing.MusicPublishing) r11
            com.whatsapp.productinfra.music.publishing.MusicPublishing$publishBlocking$1 r25 = new com.whatsapp.productinfra.music.publishing.MusicPublishing$publishBlocking$1
            r32 = r25
            r33 = r34
            r34 = r11
            r35 = r24
            r36 = r4
            r32.<init>(r33, r34, r35, r36)
            X.1OR r5 = X.AnonymousClass1OR.A00
            r4 = r25
            java.lang.Object r5 = X.AnonymousClass4GT.A00(r5, r4)
            X.77U r5 = (X.AnonymousClass77U) r5
            if (r5 == 0) goto L_0x0d97
            com.whatsapp.InteractiveAnnotation r4 = new com.whatsapp.InteractiveAnnotation
            r4.<init>(r5)
            r9.add(r4)
        L_0x0cab:
            if (r17 == 0) goto L_0x0d0b
            java.util.Map r4 = r0.A0c
            if (r4 == 0) goto L_0x0d09
            java.lang.Object r7 = r4.get(r2)
            X.36j r7 = (X.C692236j) r7
        L_0x0cb7:
            X.1Sb r8 = r0.A0B
            java.util.List r5 = r0.A0a
            if (r21 == 0) goto L_0x0cc7
            r4 = r54
            r54 = 42
            r2 = r28
            if (r4 != r2) goto L_0x0cc7
            r54 = 43
        L_0x0cc7:
            int r2 = r0.A0O
            int r55 = r0.A00(r2)
            X.206 r4 = r0.A0T
            boolean r2 = r0.A0e
            r56 = 0
            r45 = r8
            r46 = r24
            r47 = r3
            r48 = r4
            r49 = r7
            r50 = r15
            r51 = r5
            r52 = r14
            r53 = r9
            r57 = r2
            X.2tS r5 = r45.A04(r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56, r57)
            int r2 = r58.size()
            r5.A00 = r2
            X.87V r3 = r0.A0S
            if (r3 == 0) goto L_0x0d52
            java.util.concurrent.CopyOnWriteArrayList r2 = r5.A03
            java.util.Iterator r4 = X.C29431cG.A0o(r2)
        L_0x0cfb:
            boolean r2 = r4.hasNext()
            if (r2 == 0) goto L_0x0d52
            X.206 r2 = X.C17880vN.A0Y(r4)
            r3.CCY(r10, r2)
            goto L_0x0cfb
        L_0x0d09:
            r7 = 0
            goto L_0x0cb7
        L_0x0d0b:
            android.net.Uri$Builder r5 = r10.buildUpon()
            if (r15 == 0) goto L_0x0d16
            java.lang.String r2 = "caption"
            r5.appendQueryParameter(r2, r15)
        L_0x0d16:
            if (r14 == 0) goto L_0x0d2a
            X.2kg r4 = r0.A0H
            java.lang.String r2 = r1.A0G()
            r4.A01(r2, r14)
            java.lang.String r4 = "mentions"
            java.lang.String r2 = r1.A0G()
            r5.appendQueryParameter(r4, r2)
        L_0x0d2a:
            r14 = 0
            int r2 = (r7 > r14 ? 1 : (r7 == r14 ? 0 : -1))
            if (r2 != 0) goto L_0x0d34
            int r2 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r2 == 0) goto L_0x0d46
        L_0x0d34:
            java.lang.String r2 = "from"
            java.lang.String r4 = java.lang.Long.toString(r7)
            r5.appendQueryParameter(r2, r4)
            java.lang.String r2 = "to"
            java.lang.String r4 = java.lang.Long.toString(r12)
            r5.appendQueryParameter(r2, r4)
        L_0x0d46:
            java.lang.String r3 = r3.A0K
            if (r3 == 0) goto L_0x0d4f
            java.lang.String r2 = "doodle"
            r5.appendQueryParameter(r2, r3)
        L_0x0d4f:
            X.6o7 r3 = r0.A0F
            goto L_0x0d75
        L_0x0d52:
            X.1iW r4 = r0.A04
            boolean r3 = r0.A0g
            boolean r2 = r0.A0h
            r34 = r24
            r36 = r24
            r37 = r24
            r32 = r4
            r33 = r24
            r35 = r5
            r38 = r44
            r40 = r56
            r41 = r3
            r42 = r2
            X.C33251iW.A04(r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42)
            X.6o7 r3 = r0.A0F
            android.net.Uri$Builder r5 = r10.buildUpon()
        L_0x0d75:
            r2 = 0
            X.C18070vi.A0d(r5, r2)
            X.1Sl r2 = r3.A02
            java.lang.String r3 = X.C108975cc.A0c(r10, r2)
            java.lang.String r2 = "mime_type"
            r5.appendQueryParameter(r2, r3)
            android.net.Uri r22 = r5.build()
            X.2ai r2 = r0.A0D
            X.19Y r5 = r2.A00
            r4 = 1
            java.lang.String r3 = "SEND_TASK_VIDEO_END"
        L_0x0d8f:
            r2 = 453122092(0x1b02182c, float:1.0761158E-22)
            r5.markerPoint((int) r2, (int) r4, (java.lang.String) r3)
            goto L_0x072a
        L_0x0d97:
            java.lang.String r2 = "PrepareAndSendMediaTask/appendMusic/creation reporting failed"
            com.whatsapp.util.Log.e((java.lang.String) r2)
            X.1KB r4 = r0.A02
            r3 = 1
            X.7RE r2 = new X.7RE
            r2.<init>(r0, r3)
            r4.A0J(r2)
            goto L_0x072a
        L_0x0da9:
            if (r16 == 0) goto L_0x0db3
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r3 = r16
            r3.A05 = r4
        L_0x0db3:
            if (r11 != 0) goto L_0x0db7
            r44 = r24
        L_0x0db7:
            java.lang.String r3 = "PrepareAndSendMediaTask/sendImage"
            com.whatsapp.util.Log.i((java.lang.String) r3)
            X.2ai r3 = r0.A0D
            X.19Y r7 = r3.A00
            r5 = 1
            java.lang.String r4 = "SEND_TASK_IMAGE_START"
            r3 = 453122092(0x1b02182c, float:1.0761158E-22)
            r7.markerPoint((int) r3, (int) r5, (java.lang.String) r4)
            java.util.HashSet r5 = r0.A0Y
            boolean r3 = r5.contains(r2)
            r4 = 0
            if (r3 != 0) goto L_0x0ddc
            android.net.Uri r3 = r1.A0X
            boolean r3 = r5.contains(r3)
            if (r3 != 0) goto L_0x0ddc
            r25 = r4
        L_0x0ddc:
            X.69x r5 = r0.A0E
            java.util.List r12 = r0.A0a
            X.1cg r3 = X.C29671cg.A00
            boolean r38 = r12.contains(r3)
            r40 = 0
            if (r17 != 0) goto L_0x0df0
            boolean r3 = r0.A0d
            r39 = 1
            if (r3 != 0) goto L_0x0df2
        L_0x0df0:
            r39 = 0
        L_0x0df2:
            r32 = r5
            r33 = r2
            r34 = r16
            r35 = r6
            r36 = r1
            r37 = r25
            android.net.Uri$Builder r3 = r32.A02(r33, r34, r35, r36, r37, r38, r39, r40)
            if (r3 == 0) goto L_0x072a
            r0.A08(r6, r1)
            android.net.Uri r22 = r3.build()
            X.69x r3 = r0.A0E
            int r5 = r1.A02()
            if (r5 != 0) goto L_0x0e27
            java.io.File r5 = r1.A08()
            if (r5 != 0) goto L_0x0e27
            X.73s r3 = r3.A01(r1)
            if (r3 != 0) goto L_0x0e27
            int r3 = r1.A01()
            r49 = 0
            if (r3 == 0) goto L_0x0e29
        L_0x0e27:
            r49 = 1
        L_0x0e29:
            if (r17 == 0) goto L_0x0f2f
            X.6o7 r3 = r0.A0F
            X.73s r5 = r3.A01(r1)
            if (r5 == 0) goto L_0x0e41
            android.graphics.RectF r3 = r5.A02
            float r4 = r3.width()
            float r3 = r3.height()
            java.util.ArrayList r4 = r5.A06(r4, r3)
        L_0x0e41:
            android.net.Uri r3 = X.C26521Sl.A0U(r22)
            android.net.Uri$Builder r9 = r3.buildUpon()
            if (r25 == 0) goto L_0x0e4f
            int r40 = r25.intValue()
        L_0x0e4f:
            java.lang.Integer r7 = java.lang.Integer.valueOf(r40)
            r8 = 0
            if (r49 != 0) goto L_0x0e6c
            if (r21 != 0) goto L_0x0e6c
            java.util.Map r3 = r0.A0b
            java.lang.Object r3 = r3.get(r7)
            java.util.Map r3 = (java.util.Map) r3
            if (r3 == 0) goto L_0x0e6c
            android.net.Uri r7 = r9.build()
            java.lang.Object r8 = r3.get(r7)
            X.85B r8 = (X.AnonymousClass85B) r8
        L_0x0e6c:
            java.lang.String r40 = r0.A03(r5)
            java.util.ArrayList r3 = r0.A04(r2)
            if (r3 == 0) goto L_0x0e7f
            if (r4 != 0) goto L_0x0e7c
            java.util.ArrayList r4 = X.AnonymousClass000.A13()
        L_0x0e7c:
            r4.addAll(r3)
        L_0x0e7f:
            X.206 r3 = r0.A0T
            r35 = r3
            java.lang.String r7 = "PrepareAndSendMediaTask/sendImageWithExceptionHandling/share-failed/ "
            java.util.Map r3 = r0.A0c     // Catch:{ IOException -> 0x0efc, OutOfMemoryError -> 0x0ef4, SecurityException -> 0x0f1e, 1iX -> 0x0eec }
            if (r3 == 0) goto L_0x0eea
            java.lang.Object r5 = r3.get(r2)     // Catch:{ IOException -> 0x0efc, OutOfMemoryError -> 0x0ef4, SecurityException -> 0x0f1e, 1iX -> 0x0eec }
            X.36j r5 = (X.C692236j) r5     // Catch:{ IOException -> 0x0efc, OutOfMemoryError -> 0x0ef4, SecurityException -> 0x0f1e, 1iX -> 0x0eec }
        L_0x0e8f:
            X.1kd r3 = r0.A03     // Catch:{ IOException -> 0x0efc, OutOfMemoryError -> 0x0ef4, SecurityException -> 0x0f1e, 1iX -> 0x0eec }
            int r9 = r0.A0O     // Catch:{ IOException -> 0x0efc, OutOfMemoryError -> 0x0ef4, SecurityException -> 0x0f1e, 1iX -> 0x0eec }
            int r45 = r0.A00(r9)     // Catch:{ IOException -> 0x0efc, OutOfMemoryError -> 0x0ef4, SecurityException -> 0x0f1e, 1iX -> 0x0eec }
            boolean r15 = r0.A0e     // Catch:{ IOException -> 0x0efc, OutOfMemoryError -> 0x0ef4, SecurityException -> 0x0f1e, 1iX -> 0x0eec }
            boolean r14 = r0.A0g     // Catch:{ IOException -> 0x0efc, OutOfMemoryError -> 0x0ef4, SecurityException -> 0x0f1e, 1iX -> 0x0eec }
            boolean r13 = r0.A0h     // Catch:{ IOException -> 0x0efc, OutOfMemoryError -> 0x0ef4, SecurityException -> 0x0f1e, 1iX -> 0x0eec }
            int r47 = r58.size()     // Catch:{ IOException -> 0x0efc, OutOfMemoryError -> 0x0ef4, SecurityException -> 0x0f1e, 1iX -> 0x0eec }
            X.00H r9 = r3.A0I     // Catch:{ IOException -> 0x0efc, OutOfMemoryError -> 0x0ef4, SecurityException -> 0x0f1e, 1iX -> 0x0eec }
            java.lang.Object r11 = r9.get()     // Catch:{ IOException -> 0x0efc, OutOfMemoryError -> 0x0ef4, SecurityException -> 0x0f1e, 1iX -> 0x0eec }
            X.2kg r11 = (X.C58432kg) r11     // Catch:{ IOException -> 0x0efc, OutOfMemoryError -> 0x0ef4, SecurityException -> 0x0f1e, 1iX -> 0x0eec }
            java.lang.String r10 = "mentions"
            r9 = r22
            java.lang.String r9 = r9.getQueryParameter(r10)     // Catch:{ IOException -> 0x0efc, OutOfMemoryError -> 0x0ef4, SecurityException -> 0x0f1e, 1iX -> 0x0eec }
            java.util.List r42 = r11.A00(r9)     // Catch:{ IOException -> 0x0efc, OutOfMemoryError -> 0x0ef4, SecurityException -> 0x0f1e, 1iX -> 0x0eec }
            java.lang.String r10 = "caption"
            r9 = r22
            java.lang.String r39 = r9.getQueryParameter(r10)     // Catch:{ IOException -> 0x0efc, OutOfMemoryError -> 0x0ef4, SecurityException -> 0x0f1e, 1iX -> 0x0eec }
            r46 = 0
            r32 = r3
            r33 = r9
            r34 = r8
            r36 = r5
            r38 = r24
            r41 = r12
            r43 = r4
            r48 = r15
            r50 = r21
            r51 = r14
            r52 = r13
            X.2bF r5 = r32.A04(r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52)     // Catch:{ IOException -> 0x0efc, OutOfMemoryError -> 0x0ef4, SecurityException -> 0x0f1e, 1iX -> 0x0eec }
            X.87V r3 = r0.A0S     // Catch:{ IOException -> 0x0efc, OutOfMemoryError -> 0x0ef4, SecurityException -> 0x0f1e, 1iX -> 0x0eec }
            if (r3 == 0) goto L_0x0f2f
            r4 = 22
            X.7Ne r3 = new X.7Ne     // Catch:{ IOException -> 0x0efc, OutOfMemoryError -> 0x0ef4, SecurityException -> 0x0f1e, 1iX -> 0x0eec }
            r3.<init>(r2, r0, r4)     // Catch:{ IOException -> 0x0efc, OutOfMemoryError -> 0x0ef4, SecurityException -> 0x0f1e, 1iX -> 0x0eec }
            X.Af0 r2 = r5.A00     // Catch:{ IOException -> 0x0efc, OutOfMemoryError -> 0x0ef4, SecurityException -> 0x0f1e, 1iX -> 0x0eec }
            r2.A09(r3)     // Catch:{ IOException -> 0x0efc, OutOfMemoryError -> 0x0ef4, SecurityException -> 0x0f1e, 1iX -> 0x0eec }
            goto L_0x0f2f
        L_0x0eea:
            r5 = 0
            goto L_0x0e8f
        L_0x0eec:
            r2 = move-exception
            com.whatsapp.util.Log.e(r7, r2)
            r4 = 2131889970(0x7f120f32, float:1.9414619E38)
            goto L_0x0f25
        L_0x0ef4:
            r2 = move-exception
            com.whatsapp.util.Log.e(r7, r2)
            r4 = 2131889999(0x7f120f4f, float:1.9414677E38)
            goto L_0x0f25
        L_0x0efc:
            r2 = move-exception
            com.whatsapp.util.Log.e(r7, r2)
            java.lang.String r3 = r2.getMessage()
            if (r3 == 0) goto L_0x0f15
            java.lang.String r3 = r2.getMessage()
            java.lang.String r2 = "No space"
            boolean r2 = r3.contains(r2)
            r4 = 2131889993(0x7f120f49, float:1.9414665E38)
            if (r2 != 0) goto L_0x0f25
        L_0x0f15:
            r4 = 0
            X.1KB r3 = r0.A02
            X.7RE r2 = new X.7RE
            r2.<init>(r0, r4)
            goto L_0x0f2c
        L_0x0f1e:
            r2 = move-exception
            com.whatsapp.util.Log.e(r7, r2)
            r4 = 2131892909(0x7f121aad, float:1.942058E38)
        L_0x0f25:
            X.1KB r3 = r0.A02
            X.7RM r2 = new X.7RM
            r2.<init>(r0, r4)
        L_0x0f2c:
            r3.A0J(r2)
        L_0x0f2f:
            X.2ai r2 = r0.A0D
            X.19Y r5 = r2.A00
            r4 = 1
            java.lang.String r3 = "SEND_TASK_IMAGE_END"
            r2 = 453122092(0x1b02182c, float:1.0761158E-22)
            r5.markerPoint((int) r2, (int) r4, (java.lang.String) r3)
            goto L_0x072a
        L_0x0f3e:
            java.util.Map r10 = r0.A0c
            if (r10 == 0) goto L_0x06d0
            java.lang.Object r7 = r10.get(r2)
            X.1Sl r5 = r0.A0L
            java.io.File r13 = X.C64062u9.A04(r2)
            java.lang.StringBuilder r6 = X.AnonymousClass000.A10()
            java.lang.String r4 = "MediaFileUtils/move "
            X.C17900vP.A0Y(r13, r4, r6)
            if (r13 == 0) goto L_0x1007
            java.lang.String r6 = r13.getName()     // Catch:{ IOException -> 0x0ffd }
            X.17r r14 = r5.A00     // Catch:{ IOException -> 0x0ffd }
            java.lang.String r12 = r13.getCanonicalPath()     // Catch:{ IOException -> 0x0ffd }
            X.2hC r4 = r14.A08()     // Catch:{ IOException -> 0x0ffd }
            java.io.File r4 = r4.A08     // Catch:{ IOException -> 0x0ffd }
            java.lang.String r4 = r4.getCanonicalPath()     // Catch:{ IOException -> 0x0ffd }
            boolean r4 = r12.startsWith(r4)     // Catch:{ IOException -> 0x0ffd }
            if (r4 == 0) goto L_0x0f92
            X.2hC r4 = r14.A08()     // Catch:{ IOException -> 0x0ffd }
            java.io.File r4 = r4.A07     // Catch:{ IOException -> 0x0ffd }
            java.io.File r12 = X.C26511Sk.A0I(r4, r6)     // Catch:{ IOException -> 0x0ffd }
            X.1NL r6 = r5.A05     // Catch:{ IOException -> 0x0ffd }
            X.0ve r5 = r5.A03     // Catch:{ IOException -> 0x0ffd }
            r4 = 11097(0x2b59, float:1.555E-41)
            boolean r4 = X.C18020vd.A05(r3, r5, r4)     // Catch:{ IOException -> 0x0ffd }
            X.C64062u9.A0F(r6, r13, r12, r4)     // Catch:{ IOException -> 0x0ffd }
            java.lang.StringBuilder r5 = X.AnonymousClass000.A10()     // Catch:{ IOException -> 0x0ffd }
            java.lang.String r4 = "MediaFileUtils/moved image "
            X.C17900vP.A0Y(r12, r4, r5)     // Catch:{ IOException -> 0x0ffd }
            goto L_0x0fc6
        L_0x0f92:
            java.lang.String r12 = r13.getCanonicalPath()     // Catch:{ IOException -> 0x0ffd }
            X.2hC r4 = r14.A08()     // Catch:{ IOException -> 0x0ffd }
            java.io.File r4 = r4.A09     // Catch:{ IOException -> 0x0ffd }
            java.lang.String r4 = r4.getCanonicalPath()     // Catch:{ IOException -> 0x0ffd }
            boolean r4 = r12.startsWith(r4)     // Catch:{ IOException -> 0x0ffd }
            if (r4 == 0) goto L_0x1007
            X.2hC r4 = r14.A08()     // Catch:{ IOException -> 0x0ffd }
            java.io.File r4 = r4.A0Q     // Catch:{ IOException -> 0x0ffd }
            java.io.File r12 = X.C26511Sk.A0I(r4, r6)     // Catch:{ IOException -> 0x0ffd }
            X.1NL r6 = r5.A05     // Catch:{ IOException -> 0x0ffd }
            X.0ve r5 = r5.A03     // Catch:{ IOException -> 0x0ffd }
            r4 = 11097(0x2b59, float:1.555E-41)
            boolean r4 = X.C18020vd.A05(r3, r5, r4)     // Catch:{ IOException -> 0x0ffd }
            X.C64062u9.A0F(r6, r13, r12, r4)     // Catch:{ IOException -> 0x0ffd }
            java.lang.StringBuilder r5 = X.AnonymousClass000.A10()     // Catch:{ IOException -> 0x0ffd }
            java.lang.String r4 = "MediaFileUtils/moved video"
            X.C17900vP.A0Y(r12, r4, r5)     // Catch:{ IOException -> 0x0ffd }
        L_0x0fc6:
            X.73D r6 = r0.A0R
            X.72S r5 = r6.A02(r2)
            r6.A03(r2)
            android.net.Uri$Builder r13 = X.C108965cb.A06(r12)
            r4 = 0
            X.C26521Sl.A0Y(r13, r2, r4)
            java.lang.String r4 = "flip-h"
            java.lang.String r14 = r2.getQueryParameter(r4)
            if (r14 == 0) goto L_0x0fe6
            java.lang.String r2 = r2.getQueryParameter(r4)
            r13.appendQueryParameter(r4, r2)
        L_0x0fe6:
            android.net.Uri r2 = r13.build()
            X.72S r4 = new X.72S
            r4.<init>(r2, r5)
            r4.A0N(r12)
            r6.A06(r4)
            X.118 r4 = r0.A07
            android.content.Context r4 = r4.A00
            X.C26511Sk.A0O(r4, r2)
            goto L_0x1007
        L_0x0ffd:
            r6 = move-exception
            java.lang.StringBuilder r5 = X.AnonymousClass000.A10()
            java.lang.String r4 = "MediaFileUtils/unable to move capture to external "
            X.C108995ce.A1J(r13, r4, r5, r6)
        L_0x1007:
            r10.put(r2, r7)
            java.util.Iterator r32 = X.AnonymousClass000.A15(r10)
        L_0x100e:
            boolean r4 = r32.hasNext()
            if (r4 == 0) goto L_0x06d0
            java.util.Map$Entry r22 = X.AnonymousClass000.A16(r32)
            X.00H r4 = r0.A0N
            java.lang.Object r6 = r4.get()
            X.6f0 r6 = (X.C127836f0) r6
            java.lang.Object r12 = r22.getValue()
            X.36j r12 = (X.C692236j) r12
            if (r12 != 0) goto L_0x1031
            r12 = 0
        L_0x1029:
            java.lang.Object r4 = r22.getKey()
            r10.put(r4, r12)
            goto L_0x100e
        L_0x1031:
            java.util.LinkedHashSet r7 = X.C17880vN.A14()
            java.util.Set r4 = r12.A05
            if (r4 == 0) goto L_0x10a3
            java.util.Iterator r15 = r4.iterator()
        L_0x103d:
            boolean r4 = r15.hasNext()
            if (r4 == 0) goto L_0x10a3
            X.1BI r5 = X.C17880vN.A0Q(r15)
            boolean r4 = r5 instanceof X.AnonymousClass1E9
            if (r4 == 0) goto L_0x109f
            boolean r4 = X.C22971Dz.A0e(r5)
            if (r4 == 0) goto L_0x103d
            X.1MW r4 = r6.A00
            X.1E9 r5 = (X.AnonymousClass1E9) r5
            X.2tp r5 = r4.A0B(r5)
            int r4 = r5.A00
            if (r4 == 0) goto L_0x1094
            java.util.Map r4 = r5.A08
            java.util.Set r4 = r4.keySet()
            X.10f r4 = X.C199410f.copyOf((java.util.Collection) r4)
            X.C18070vi.A0X(r4)
            java.util.ArrayList r13 = X.C29351c6.A0D(r4)
            java.util.Iterator r14 = r4.iterator()
        L_0x1072:
            boolean r4 = r14.hasNext()
            if (r4 == 0) goto L_0x1085
            java.lang.Object r5 = r14.next()
            java.lang.String r4 = "null cannot be cast to non-null type com.whatsapp.jid.AccountUserJid"
            X.C18070vi.A0z(r5, r4)
            r13.add(r5)
            goto L_0x1072
        L_0x1085:
            java.util.Set r5 = X.C29431cG.A12(r13)
            X.1Ln r4 = r6.A01
            java.util.LinkedHashMap r4 = r4.A0H(r5)
            java.util.Set r4 = r4.keySet()
            goto L_0x109b
        L_0x1094:
            X.10f r4 = r5.A07()
            X.C18070vi.A0b(r4)
        L_0x109b:
            r7.addAll(r4)
            goto L_0x103d
        L_0x109f:
            r7.add(r5)
            goto L_0x103d
        L_0x10a3:
            X.77K r6 = r12.A03
            if (r6 == 0) goto L_0x1029
            int r5 = r6.A00
            r4 = 1
            if (r5 == r4) goto L_0x10b6
            r4 = 2
            if (r5 != r4) goto L_0x1029
            java.util.List r4 = r6.A02
            r4.removeAll(r7)
            goto L_0x1029
        L_0x10b6:
            java.util.List r4 = r6.A01
            r4.addAll(r7)
            goto L_0x1029
        L_0x10bd:
            java.lang.Long r1 = X.C108975cc.A0Y(r3)
            r6.A00 = r1
            boolean r1 = r3 instanceof java.util.Collection
            r4 = 0
            if (r1 == 0) goto L_0x10ef
            boolean r1 = r3.isEmpty()
            if (r1 == 0) goto L_0x10ef
        L_0x10ce:
            java.lang.Long r1 = X.C17880vN.A0n(r4)
            r6.A02 = r1
            X.18K r1 = r0.A0A
            r1.CC7(r6)
        L_0x10d9:
            if (r22 == 0) goto L_0x10e2
            r2 = r26
            r1 = r22
            r2.add(r1)
        L_0x10e2:
            if (r16 == 0) goto L_0x10eb
            X.18K r2 = r0.A0A
            r1 = r16
            r2.CC7(r1)
        L_0x10eb:
            int r20 = r20 + 1
            goto L_0x0610
        L_0x10ef:
            java.util.Iterator r2 = r3.iterator()
        L_0x10f3:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L_0x10ce
            java.lang.Object r1 = r2.next()
            X.69N r1 = (X.AnonymousClass69N) r1
            boolean r1 = r1.A02
            if (r1 == 0) goto L_0x10f3
            int r4 = r4 + 1
            if (r4 >= 0) goto L_0x10f3
            X.AnonymousClass1ZU.A0A()
            throw r24
        L_0x110b:
            r11 = 0
            goto L_0x06a1
        L_0x110e:
            java.lang.String r8 = r23.toString()
            goto L_0x0667
        L_0x1114:
            r16 = r24
            goto L_0x065b
        L_0x1118:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        L_0x111b:
            X.2ai r1 = r0.A0D
            X.19Y r2 = r1.A00
            r3 = 1
            java.lang.String r1 = "TASK_CLEAN_UP_START"
            r5 = 453122092(0x1b02182c, float:1.0761158E-22)
            r2.markerPoint((int) r5, (int) r3, (java.lang.String) r1)
            java.util.HashSet r6 = r0.A0X
            java.util.Iterator r8 = r6.iterator()
        L_0x112e:
            boolean r1 = r8.hasNext()
            if (r1 == 0) goto L_0x116a
            java.lang.Object r2 = r8.next()
            X.72S r2 = (X.AnonymousClass72S) r2
            X.1ka r1 = r0.A0C
            int r7 = X.AnonymousClass72S.A00(r2, r1)
            boolean r1 = r2.A0W()
            if (r1 == 0) goto L_0x1148
            r7 = 13
        L_0x1148:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r7)
            r1 = r29
            java.lang.Object r2 = r1.get(r4)
            X.64U r2 = (X.AnonymousClass64U) r2
            if (r2 != 0) goto L_0x1161
            boolean r1 = r0.A0k
            X.64U r2 = r0.A01(r7, r1)
            r1 = r29
            r1.put(r4, r2)
        L_0x1161:
            java.lang.Long r1 = r2.A0L
            java.lang.Long r1 = X.C108995ce.A0T(r1)
            r2.A0L = r1
            goto L_0x112e
        L_0x116a:
            X.1Sl r4 = r0.A0L
            java.util.Collection r2 = r0.A0W
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>(r2)
            X.C26521Sl.A0a(r4, r1, r6)
            X.2ai r1 = r0.A0D
            X.19Y r2 = r1.A00
            java.lang.String r1 = "TASK_CLEAN_UP_END"
            r2.markerPoint((int) r5, (int) r3, (java.lang.String) r1)
            java.lang.String r5 = r0.A0u
            boolean r1 = android.text.TextUtils.isEmpty(r5)
            if (r1 != 0) goto L_0x11a2
            java.util.Map r2 = r0.A0c
            if (r2 == 0) goto L_0x11a2
            r1 = r24
            java.lang.Object r1 = r2.get(r1)
            if (r1 == 0) goto L_0x11a2
            X.1iW r4 = r0.A04
            r1 = r24
            java.lang.Object r2 = r2.get(r1)
            X.36j r2 = (X.C692236j) r2
            java.util.List r1 = r0.A0a
            r4.A0k(r2, r5, r1)
        L_0x11a2:
            java.util.Iterator r4 = X.C17890vO.A0j(r29)
        L_0x11a6:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L_0x11b8
            java.lang.Object r2 = r4.next()
            X.184 r2 = (X.AnonymousClass184) r2
            X.18K r1 = r0.A0A
            r1.CC7(r2)
            goto L_0x11a6
        L_0x11b8:
            X.2ai r0 = r0.A0D
            X.19Y r2 = r0.A00
            java.lang.String r0 = "SEND_TASK_END"
            r1 = 453122092(0x1b02182c, float:1.0761158E-22)
            r2.markerPoint((int) r1, (int) r3, (java.lang.String) r0)
            r0 = 2
            r2.markerEnd(r1, r3, r0)
            return r26
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C121956Md.A0J(java.lang.Void[]):java.util.ArrayList");
    }

    private void A05(Uri uri, AnonymousClass72S r6) {
        File A042 = C64062u9.A04(uri);
        if (A042 != null) {
            try {
                if (!A042.getCanonicalPath().startsWith(this.A01.A08().A08.getCanonicalPath())) {
                    if (!A042.getCanonicalPath().startsWith(this.A01.A08().A09.getCanonicalPath())) {
                        return;
                    }
                }
                if (!A042.delete()) {
                    this.A00.A0G("PrepareAndSendMediaTask/failed to delete capture", uri.toString(), false);
                }
                if (r6.A09() == null || !r6.A09().exists()) {
                    this.A00.A0G("PrepareAndSendMediaTask/file missing", uri.toString(), false);
                }
            } catch (IOException e) {
                Log.e("PrepareAndSendMediaTask/deleteInternalCapture", e);
                this.A00.A0G("PrepareAndSendMediaTask/deleteInternalCapture", e.getMessage(), true);
            }
        }
    }

    public static final void A06(A5W a5w, C24322BzJ bzJ, C25186Cac cac, C26052CrM crM) {
        HashMap A062 = crM.A06(bzJ);
        if (A062 != null) {
            Iterator A0i2 = C17890vO.A0i(A062);
            while (A0i2.hasNext()) {
                ArrayList A10 = C17880vN.A10(((C25833Cmm) C17890vO.A0P(A0i2)).A04);
                if (C17880vN.A1X(A10)) {
                    C26010CqR cqR = new C26010CqR(bzJ);
                    Iterator it = A10.iterator();
                    while (it.hasNext()) {
                        C25271CcJ ccJ = (C25271CcJ) it.next();
                        CXD A002 = ccJ.A00();
                        if (ccJ.A03.A02(TimeUnit.MILLISECONDS) < 0) {
                            A002.A03 = a5w;
                        }
                        cqR.A04.add(A002.A00());
                    }
                    cac.A02(new C25833Cmm(cqR));
                }
            }
        }
    }

    public static final void A07(C24322BzJ bzJ, C25186Cac cac, C26052CrM crM) {
        Iterator A0i2 = C17890vO.A0i(crM.A05(bzJ));
        while (A0i2.hasNext()) {
            Object A0P2 = C17890vO.A0P(A0i2);
            C18070vi.A0X(A0P2);
            for (C6M c6m : (Iterable) A0P2) {
                cac.A00(c6m.A00, bzJ, c6m.A01);
            }
        }
    }

    public C121956Md(Context context, AnonymousClass77N r4, AnonymousClass709 r5, AnonymousClass709 r6, AnonymousClass73D r7, C135306rz r8, AnonymousClass8B4 r9, AnonymousClass87V r10, AnonymousClass206 r11, C136246tV r12, Boolean bool, Integer num, Long l, Long l2, Long l3, String str, Collection collection, HashSet hashSet, HashSet hashSet2, List list, List list2, Map map, Map map2, int i, long j, long j2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8) {
        super(r9, true);
        this.A0P = context;
        this.A0a = list;
        this.A0Z = list2;
        this.A0W = collection;
        this.A0R = r7;
        this.A0T = r11;
        this.A0m = j;
        this.A0e = z;
        this.A0O = i;
        this.A0f = z2;
        this.A0S = r10;
        this.A0b = map;
        this.A0X = hashSet;
        this.A0k = z3;
        this.A0j = z4;
        this.A0c = map2;
        this.A0g = z5;
        this.A0h = z6;
        this.A0l = j2;
        this.A0V = num;
        this.A0Y = hashSet2;
        this.A0r = l;
        this.A0s = l2;
        this.A0t = l3;
        this.A0p = r8;
        this.A0q = bool;
        this.A0i = z7;
        this.A0U = r12;
        this.A0n = r5 == null ? new AnonymousClass709() : r5;
        this.A0o = r6 == null ? new AnonymousClass709() : r6;
        this.A0d = z8;
        this.A0Q = r4;
        this.A0u = str;
    }
}
