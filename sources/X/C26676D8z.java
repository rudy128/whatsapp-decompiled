package X;

import com.facebook.android.exoplayer2.util.Util;
import java.util.ArrayDeque;

/* renamed from: X.D8z  reason: case insensitive filesystem */
public final class C26676D8z implements E8W, C28585E8y {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public long A07;
    public long A08;
    public D9O A09;
    public C26207Cui A0A;
    public boolean A0B;
    public boolean A0C;
    public CR6[] A0D;
    public long[][] A0E;
    public final C26207Cui A0F = new C26207Cui(16);
    public final C26207Cui A0G;
    public final C26207Cui A0H;
    public final C26207Cui A0I;
    public final ArrayDeque A0J = new ArrayDeque();

    public boolean BgN() {
        return true;
    }

    public boolean CNV(C26036Cqw cqw) {
        return C25374CeZ.A00(cqw, false);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v202, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v2, resolved type: X.D42} */
    /* JADX WARNING: type inference failed for: r38v1, types: [X.E8X] */
    /* JADX WARNING: type inference failed for: r0v334, types: [X.D93] */
    /* JADX WARNING: type inference failed for: r0v335, types: [X.D92] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:163:0x0326  */
    /* JADX WARNING: Removed duplicated region for block: B:201:0x03dc  */
    /* JADX WARNING: Removed duplicated region for block: B:409:0x091b  */
    /* JADX WARNING: Removed duplicated region for block: B:531:0x0097 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:543:0x03af A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void A00(long r53) {
        /*
            r52 = this;
        L_0x0000:
            r51 = r52
            r0 = r51
            java.util.ArrayDeque r0 = r0.A0J
            r50 = r0
            boolean r0 = r50.isEmpty()
            if (r0 != 0) goto L_0x0bb2
            java.lang.Object r0 = r50.peek()
            X.BOi r0 = (X.C22769BOi) r0
            long r1 = r0.A00
            int r0 = (r1 > r53 ? 1 : (r1 == r53 ? 0 : -1))
            if (r0 != 0) goto L_0x0bb2
            java.lang.Object r21 = r50.pop()
            r0 = r21
            X.BOi r0 = (X.C22769BOi) r0
            r21 = r0
            int r1 = r0.A00
            r0 = 1836019574(0x6d6f6f76, float:4.631354E27)
            if (r1 != r0) goto L_0x0b8f
            java.util.ArrayList r23 = X.AnonymousClass000.A13()
            r22 = -1
            r17 = -1
            r1 = 1969517665(0x75647461, float:2.8960062E32)
            r0 = r21
            X.BOh r1 = r0.A01(r1)
            r16 = 0
            if (r1 == 0) goto L_0x0414
            byte[] r0 = X.C26169Ctl.A00
            X.Cui r13 = r1.A00
            r12 = 8
            r13.A0I(r12)
            r6 = 0
            r11 = r6
        L_0x004b:
            int r0 = r13.A00
            int r10 = r13.A01
            int r0 = r0 - r10
            if (r0 < r12) goto L_0x039d
            int r18 = r13.A03()
            int r1 = r13.A03()
            r0 = 1835365473(0x6d657461, float:4.4382975E27)
            if (r1 != r0) goto L_0x0331
            r13.A0I(r10)
            int r3 = r10 + r18
            r13.A0J(r12)
            int r2 = r13.A01
            r0 = 4
            r13.A0J(r0)
            int r1 = r13.A03()
            r0 = 1751411826(0x68646c72, float:4.3148E24)
            if (r1 == r0) goto L_0x0078
            int r2 = r2 + 4
        L_0x0078:
            r13.A0I(r2)
        L_0x007b:
            int r9 = r13.A01
            if (r9 >= r3) goto L_0x039b
            int r2 = r13.A03()
            int r1 = r13.A03()
            r0 = 1768715124(0x696c7374, float:1.7865732E25)
            if (r1 != r0) goto L_0x032b
            r13.A0I(r9)
            int r9 = r9 + r2
            r13.A0J(r12)
            java.util.ArrayList r8 = X.AnonymousClass000.A13()
        L_0x0097:
            int r7 = r13.A01
            if (r7 >= r9) goto L_0x0380
            int r0 = r13.A03()
            int r7 = r7 + r0
            int r3 = r13.A03()
            int r0 = r3 >> 24
            r1 = r0 & 255(0xff, float:3.57E-43)
            r0 = 169(0xa9, float:2.37E-43)
            if (r1 == r0) goto L_0x024f
            r0 = 253(0xfd, float:3.55E-43)
            if (r1 == r0) goto L_0x024f
            r0 = 1735291493(0x676e7265, float:1.1260334E24)
            if (r3 != r0) goto L_0x00ef
            r0 = 4
            r13.A0J(r0)     // Catch:{ all -> 0x0ba4 }
            int r1 = r13.A03()     // Catch:{ all -> 0x0ba4 }
            r0 = 1684108385(0x64617461, float:1.6635614E22)
            if (r1 != r0) goto L_0x00dd
            int r1 = X.C26207Cui.A01(r13, r12)     // Catch:{ all -> 0x0ba4 }
            if (r1 <= 0) goto L_0x00e4
            java.lang.String[] r2 = X.C26073Crn.A00     // Catch:{ all -> 0x0ba4 }
            r0 = 148(0x94, float:2.07E-43)
            if (r1 > r0) goto L_0x00e4
            int r0 = r1 + -1
            r1 = r2[r0]     // Catch:{ all -> 0x0ba4 }
            if (r1 == 0) goto L_0x00e4
            java.lang.String r0 = "TCON"
            X.BOp r6 = new X.BOp     // Catch:{ all -> 0x0ba4 }
            r6.<init>(r0, r1)     // Catch:{ all -> 0x0ba4 }
            goto L_0x0321
        L_0x00dd:
            java.lang.String r1 = "MetadataUtil"
            java.lang.String r0 = "Failed to parse uint8 attribute value"
            android.util.Log.w(r1, r0)     // Catch:{ all -> 0x0ba4 }
        L_0x00e4:
            java.lang.String r1 = "MetadataUtil"
            java.lang.String r0 = "Failed to parse standard genre code"
            android.util.Log.w(r1, r0)     // Catch:{ all -> 0x0ba4 }
            r6 = r16
            goto L_0x0321
        L_0x00ef:
            r0 = 1684632427(0x6469736b, float:1.7225632E22)
            if (r3 != r0) goto L_0x00fc
            java.lang.String r0 = "TPOS"
            X.BOp r6 = X.C26073Crn.A01(r13, r0, r3)     // Catch:{ all -> 0x0ba4 }
            goto L_0x0321
        L_0x00fc:
            r0 = 1953655662(0x74726b6e, float:7.6825853E31)
            if (r3 != r0) goto L_0x0109
            java.lang.String r0 = "TRCK"
            X.BOp r6 = X.C26073Crn.A01(r13, r0, r3)     // Catch:{ all -> 0x0ba4 }
            goto L_0x0321
        L_0x0109:
            r0 = 1953329263(0x746d706f, float:7.5247484E31)
            r2 = 0
            r1 = 1
            if (r3 != r0) goto L_0x0118
            java.lang.String r0 = "TBPM"
            X.D9F r6 = X.C26073Crn.A00(r13, r0, r3, r1, r2)     // Catch:{ all -> 0x0ba4 }
            goto L_0x0321
        L_0x0118:
            r0 = 1668311404(0x6370696c, float:4.434815E21)
            if (r3 != r0) goto L_0x0125
            java.lang.String r0 = "TCMP"
            X.D9F r6 = X.C26073Crn.A00(r13, r0, r3, r1, r1)     // Catch:{ all -> 0x0ba4 }
            goto L_0x0321
        L_0x0125:
            r0 = 1668249202(0x636f7672, float:4.4173067E21)
            if (r3 != r0) goto L_0x0172
            int r4 = r13.A03()     // Catch:{ all -> 0x0ba4 }
            int r1 = r13.A03()     // Catch:{ all -> 0x0ba4 }
            r0 = 1684108385(0x64617461, float:1.6635614E22)
            java.lang.String r3 = "MetadataUtil"
            if (r1 != r0) goto L_0x0160
            int r1 = r13.A03()     // Catch:{ all -> 0x0ba4 }
            r0 = 16777215(0xffffff, float:2.3509886E-38)
            r1 = r1 & r0
            r0 = 13
            if (r1 != r0) goto L_0x0159
            java.lang.String r1 = "image/jpeg"
        L_0x0147:
            r0 = 4
            r13.A0J(r0)     // Catch:{ all -> 0x0ba4 }
            int r3 = r4 + -16
            byte[] r0 = new byte[r3]     // Catch:{ all -> 0x0ba4 }
            r13.A0K(r0, r2, r3)     // Catch:{ all -> 0x0ba4 }
            X.BOs r6 = new X.BOs     // Catch:{ all -> 0x0ba4 }
            r6.<init>(r1, r0)     // Catch:{ all -> 0x0ba4 }
            goto L_0x0321
        L_0x0159:
            r0 = 14
            if (r1 != r0) goto L_0x0163
            java.lang.String r1 = "image/png"
            goto L_0x0147
        L_0x0160:
            java.lang.String r0 = "Failed to parse cover art attribute"
            goto L_0x016d
        L_0x0163:
            java.lang.StringBuilder r2 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x0ba4 }
            java.lang.String r0 = "Unrecognized cover art flags: "
            java.lang.String r0 = X.AnonymousClass001.A1I(r0, r2, r1)     // Catch:{ all -> 0x0ba4 }
        L_0x016d:
            android.util.Log.w(r3, r0)     // Catch:{ all -> 0x0ba4 }
            goto L_0x031f
        L_0x0172:
            r0 = 1631670868(0x61415254, float:2.2288462E20)
            if (r3 != r0) goto L_0x017f
            java.lang.String r0 = "TPE2"
            X.BOp r6 = X.C26073Crn.A02(r13, r0, r3)     // Catch:{ all -> 0x0ba4 }
            goto L_0x0321
        L_0x017f:
            r0 = 1936682605(0x736f6e6d, float:1.8969706E31)
            if (r3 != r0) goto L_0x018c
            java.lang.String r0 = "TSOT"
            X.BOp r6 = X.C26073Crn.A02(r13, r0, r3)     // Catch:{ all -> 0x0ba4 }
            goto L_0x0321
        L_0x018c:
            r0 = 1936679276(0x736f616c, float:1.8965681E31)
            if (r3 != r0) goto L_0x0199
            java.lang.String r0 = "TSO2"
            X.BOp r6 = X.C26073Crn.A02(r13, r0, r3)     // Catch:{ all -> 0x0ba4 }
            goto L_0x0321
        L_0x0199:
            r0 = 1936679282(0x736f6172, float:1.8965689E31)
            if (r3 != r0) goto L_0x01a6
            java.lang.String r0 = "TSOA"
            X.BOp r6 = X.C26073Crn.A02(r13, r0, r3)     // Catch:{ all -> 0x0ba4 }
            goto L_0x0321
        L_0x01a6:
            r0 = 1936679265(0x736f6161, float:1.8965668E31)
            if (r3 != r0) goto L_0x01b3
            java.lang.String r0 = "TSOP"
            X.BOp r6 = X.C26073Crn.A02(r13, r0, r3)     // Catch:{ all -> 0x0ba4 }
            goto L_0x0321
        L_0x01b3:
            r0 = 1936679791(0x736f636f, float:1.8966304E31)
            if (r3 != r0) goto L_0x01c0
            java.lang.String r0 = "TSOC"
            X.BOp r6 = X.C26073Crn.A02(r13, r0, r3)     // Catch:{ all -> 0x0ba4 }
            goto L_0x0321
        L_0x01c0:
            r0 = 1920233063(0x72746e67, float:4.84146E30)
            if (r3 != r0) goto L_0x01cd
            java.lang.String r0 = "ITUNESADVISORY"
            X.D9F r6 = X.C26073Crn.A00(r13, r0, r3, r2, r2)     // Catch:{ all -> 0x0ba4 }
            goto L_0x0321
        L_0x01cd:
            r0 = 1885823344(0x70676170, float:2.8643533E29)
            if (r3 != r0) goto L_0x01da
            java.lang.String r0 = "ITUNESGAPLESS"
            X.D9F r6 = X.C26073Crn.A00(r13, r0, r3, r2, r1)     // Catch:{ all -> 0x0ba4 }
            goto L_0x0321
        L_0x01da:
            r0 = 1936683886(0x736f736e, float:1.8971255E31)
            if (r3 != r0) goto L_0x01e7
            java.lang.String r0 = "TVSHOWSORT"
            X.BOp r6 = X.C26073Crn.A02(r13, r0, r3)     // Catch:{ all -> 0x0ba4 }
            goto L_0x0321
        L_0x01e7:
            r0 = 1953919848(0x74767368, float:7.810338E31)
            if (r3 != r0) goto L_0x01f4
            java.lang.String r0 = "TVSHOW"
            X.BOp r6 = X.C26073Crn.A02(r13, r0, r3)     // Catch:{ all -> 0x0ba4 }
            goto L_0x0321
        L_0x01f4:
            r0 = 757935405(0x2d2d2d2d, float:9.8439425E-12)
            if (r3 != r0) goto L_0x02f6
            r6 = 0
            r5 = r6
            r4 = r6
            r3 = -1
            r2 = -1
        L_0x01fe:
            int r14 = r13.A01     // Catch:{ all -> 0x0ba4 }
            if (r14 >= r7) goto L_0x0233
            int r15 = r13.A03()     // Catch:{ all -> 0x0ba4 }
            int r1 = r13.A03()     // Catch:{ all -> 0x0ba4 }
            r0 = 4
            r13.A0J(r0)     // Catch:{ all -> 0x0ba4 }
            r0 = 1835360622(0x6d65616e, float:4.4368658E27)
            if (r1 != r0) goto L_0x021a
            int r0 = r15 + -12
            java.lang.String r5 = r13.A0D(r0)     // Catch:{ all -> 0x0ba4 }
            goto L_0x01fe
        L_0x021a:
            r0 = 1851878757(0x6e616d65, float:1.7441594E28)
            if (r1 != r0) goto L_0x0226
            int r0 = r15 + -12
            java.lang.String r4 = r13.A0D(r0)     // Catch:{ all -> 0x0ba4 }
            goto L_0x01fe
        L_0x0226:
            r0 = 1684108385(0x64617461, float:1.6635614E22)
            if (r1 != r0) goto L_0x022d
            r3 = r14
            r2 = r15
        L_0x022d:
            int r0 = r15 + -12
            r13.A0J(r0)     // Catch:{ all -> 0x0ba4 }
            goto L_0x01fe
        L_0x0233:
            if (r5 == 0) goto L_0x0321
            if (r4 == 0) goto L_0x0321
            r0 = r22
            if (r3 == r0) goto L_0x0321
            r13.A0I(r3)     // Catch:{ all -> 0x0ba4 }
            r0 = 16
            r13.A0J(r0)     // Catch:{ all -> 0x0ba4 }
            int r2 = r2 - r0
            java.lang.String r0 = r13.A0D(r2)     // Catch:{ all -> 0x0ba4 }
            X.BOr r6 = new X.BOr     // Catch:{ all -> 0x0ba4 }
            r6.<init>(r5, r4, r0)     // Catch:{ all -> 0x0ba4 }
            goto L_0x0321
        L_0x024f:
            r1 = 16777215(0xffffff, float:2.3509886E-38)
            r1 = r1 & r3
            r0 = 6516084(0x636d74, float:9.130979E-39)
            if (r1 != r0) goto L_0x028e
            int r2 = r13.A03()     // Catch:{ all -> 0x0ba4 }
            int r1 = r13.A03()     // Catch:{ all -> 0x0ba4 }
            r0 = 1684108385(0x64617461, float:1.6635614E22)
            if (r1 != r0) goto L_0x0275
            r13.A0J(r12)     // Catch:{ all -> 0x0ba4 }
            int r0 = r2 + -16
            java.lang.String r0 = r13.A0D(r0)     // Catch:{ all -> 0x0ba4 }
            X.BOq r6 = new X.BOq     // Catch:{ all -> 0x0ba4 }
            r6.<init>(r0, r0)     // Catch:{ all -> 0x0ba4 }
            goto L_0x0321
        L_0x0275:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x0ba4 }
            java.lang.String r0 = "Failed to parse comment attribute: "
            r1.append(r0)     // Catch:{ all -> 0x0ba4 }
            java.lang.String r0 = X.C25973Cpg.A00(r3)     // Catch:{ all -> 0x0ba4 }
            java.lang.String r1 = X.AnonymousClass000.A0y(r0, r1)     // Catch:{ all -> 0x0ba4 }
            java.lang.String r0 = "MetadataUtil"
            android.util.Log.w(r0, r1)     // Catch:{ all -> 0x0ba4 }
            r6 = 0
            goto L_0x0321
        L_0x028e:
            r0 = 7233901(0x6e616d, float:1.0136854E-38)
            if (r1 == r0) goto L_0x0318
            r0 = 7631467(0x74726b, float:1.0693963E-38)
            if (r1 == r0) goto L_0x0318
            r0 = 6516589(0x636f6d, float:9.131686E-39)
            if (r1 == r0) goto L_0x0311
            r0 = 7828084(0x777274, float:1.0969482E-38)
            if (r1 == r0) goto L_0x0311
            r0 = 6578553(0x646179, float:9.218516E-39)
            if (r1 != r0) goto L_0x02ae
            java.lang.String r0 = "TDRC"
            X.BOp r6 = X.C26073Crn.A02(r13, r0, r3)     // Catch:{ all -> 0x0ba4 }
            goto L_0x0321
        L_0x02ae:
            r0 = 4280916(0x415254, float:5.998841E-39)
            if (r1 != r0) goto L_0x02ba
            java.lang.String r0 = "TPE1"
            X.BOp r6 = X.C26073Crn.A02(r13, r0, r3)     // Catch:{ all -> 0x0ba4 }
            goto L_0x0321
        L_0x02ba:
            r0 = 7630703(0x746f6f, float:1.0692892E-38)
            if (r1 != r0) goto L_0x02c6
            java.lang.String r0 = "TSSE"
            X.BOp r6 = X.C26073Crn.A02(r13, r0, r3)     // Catch:{ all -> 0x0ba4 }
            goto L_0x0321
        L_0x02c6:
            r0 = 6384738(0x616c62, float:8.946924E-39)
            if (r1 != r0) goto L_0x02d2
            java.lang.String r0 = "TALB"
            X.BOp r6 = X.C26073Crn.A02(r13, r0, r3)     // Catch:{ all -> 0x0ba4 }
            goto L_0x0321
        L_0x02d2:
            r0 = 7108978(0x6c7972, float:9.9618E-39)
            if (r1 != r0) goto L_0x02de
            java.lang.String r0 = "USLT"
            X.BOp r6 = X.C26073Crn.A02(r13, r0, r3)     // Catch:{ all -> 0x0ba4 }
            goto L_0x0321
        L_0x02de:
            r0 = 6776174(0x67656e, float:9.495442E-39)
            if (r1 != r0) goto L_0x02ea
            java.lang.String r0 = "TCON"
            X.BOp r6 = X.C26073Crn.A02(r13, r0, r3)     // Catch:{ all -> 0x0ba4 }
            goto L_0x0321
        L_0x02ea:
            r0 = 6779504(0x677270, float:9.500109E-39)
            if (r1 != r0) goto L_0x02f6
            java.lang.String r0 = "TIT1"
            X.BOp r6 = X.C26073Crn.A02(r13, r0, r3)     // Catch:{ all -> 0x0ba4 }
            goto L_0x0321
        L_0x02f6:
            java.lang.String r2 = "MetadataUtil"
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x0ba4 }
            java.lang.String r0 = "Skipped unknown metadata entry: "
            r1.append(r0)     // Catch:{ all -> 0x0ba4 }
            java.lang.String r0 = X.C25973Cpg.A00(r3)     // Catch:{ all -> 0x0ba4 }
            java.lang.String r0 = X.AnonymousClass000.A0y(r0, r1)     // Catch:{ all -> 0x0ba4 }
            android.util.Log.d(r2, r0)     // Catch:{ all -> 0x0ba4 }
            r13.A0I(r7)
            goto L_0x0097
        L_0x0311:
            java.lang.String r0 = "TCOM"
            X.BOp r6 = X.C26073Crn.A02(r13, r0, r3)     // Catch:{ all -> 0x0ba4 }
            goto L_0x0321
        L_0x0318:
            java.lang.String r0 = "TIT2"
            X.BOp r6 = X.C26073Crn.A02(r13, r0, r3)     // Catch:{ all -> 0x0ba4 }
            goto L_0x0321
        L_0x031f:
            r6 = r16
        L_0x0321:
            r13.A0I(r7)
            if (r6 == 0) goto L_0x0097
            r8.add(r6)
            goto L_0x0097
        L_0x032b:
            int r9 = r9 + r2
            r13.A0I(r9)
            goto L_0x007b
        L_0x0331:
            r0 = 1936553057(0x736d7461, float:1.8813092E31)
            if (r1 != r0) goto L_0x0394
            r13.A0I(r10)
            int r5 = r10 + r18
            r4 = 12
            r13.A0J(r4)
        L_0x0340:
            int r3 = r13.A01
            r11 = 0
            if (r3 >= r5) goto L_0x0394
            int r2 = r13.A03()
            int r1 = r13.A03()
            r0 = 1935766900(0x73617574, float:1.7862687E31)
            if (r1 != r0) goto L_0x037b
            r0 = 14
            if (r2 < r0) goto L_0x0394
            r0 = 5
            int r1 = X.C26207Cui.A01(r13, r0)
            if (r1 == r4) goto L_0x0378
            r0 = 13
            if (r1 != r0) goto L_0x0394
            r3 = 1123024896(0x42f00000, float:120.0)
        L_0x0363:
            r1 = 1
            int r0 = X.C26207Cui.A01(r13, r1)
            X.ECQ[] r2 = new X.ECQ[r1]
            X.D9G r1 = new X.D9G
            r1.<init>(r0, r3)
            r0 = 0
            r2[r0] = r1
            X.D42 r11 = new X.D42
            r11.<init>((X.ECQ[]) r2)
            goto L_0x0394
        L_0x0378:
            r3 = 1131413504(0x43700000, float:240.0)
            goto L_0x0363
        L_0x037b:
            int r3 = r3 + r2
            r13.A0I(r3)
            goto L_0x0340
        L_0x0380:
            boolean r0 = r8.isEmpty()
            if (r0 != 0) goto L_0x039b
            r0 = 0
            X.ECQ[] r0 = new X.ECQ[r0]
            java.lang.Object[] r0 = r8.toArray(r0)
            X.ECQ[] r0 = (X.ECQ[]) r0
            X.D42 r6 = new X.D42
            r6.<init>((X.ECQ[]) r0)
        L_0x0394:
            int r10 = r10 + r18
            r13.A0I(r10)
            goto L_0x004b
        L_0x039b:
            r6 = 0
            goto L_0x0394
        L_0x039d:
            android.util.Pair r0 = android.util.Pair.create(r6, r11)
            java.lang.Object r0 = r0.first
            r18 = r0
            r0 = r18
            X.D42 r0 = (X.D42) r0
            r18 = r0
            if (r0 == 0) goto L_0x0416
            r3 = 0
            goto L_0x03b1
        L_0x03af:
            int r3 = r3 + 1
        L_0x03b1:
            r0 = r18
            X.ECQ[] r0 = r0.A01
            int r0 = r0.length
            if (r3 >= r0) goto L_0x0416
            r0 = r18
            X.ECQ[] r0 = r0.A01
            r2 = r0[r3]
            boolean r0 = r2 instanceof X.C22777BOq
            java.lang.String r4 = "iTunSMPB"
            if (r0 == 0) goto L_0x03f9
            X.BOq r2 = (X.C22777BOq) r2
            java.lang.String r0 = r2.A00
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x03af
            java.lang.String r1 = r2.A02
        L_0x03d0:
            java.util.regex.Pattern r0 = X.CEP.A00
            java.util.regex.Matcher r4 = r0.matcher(r1)
            boolean r0 = r4.find()
            if (r0 == 0) goto L_0x03af
            r0 = 1
            java.lang.String r0 = r4.group(r0)     // Catch:{ NumberFormatException -> 0x03af }
            r2 = 16
            int r1 = java.lang.Integer.parseInt(r0, r2)     // Catch:{ NumberFormatException -> 0x03af }
            r0 = 2
            java.lang.String r0 = r4.group(r0)     // Catch:{ NumberFormatException -> 0x03af }
            int r0 = java.lang.Integer.parseInt(r0, r2)     // Catch:{ NumberFormatException -> 0x03af }
            if (r1 > 0) goto L_0x03f4
            if (r0 <= 0) goto L_0x03af
        L_0x03f4:
            r22 = r1
            r17 = r0
            goto L_0x0416
        L_0x03f9:
            boolean r0 = r2 instanceof X.C22778BOr
            if (r0 == 0) goto L_0x03af
            X.BOr r2 = (X.C22778BOr) r2
            java.lang.String r1 = "com.apple.iTunes"
            java.lang.String r0 = r2.A01
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x03af
            java.lang.String r0 = r2.A00
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x03af
            java.lang.String r1 = r2.A02
            goto L_0x03d0
        L_0x0414:
            r18 = r16
        L_0x0416:
            r1 = 1835365473(0x6d657461, float:4.4382975E27)
            r0 = r21
            X.BOi r3 = r0.A00(r1)
            if (r3 == 0) goto L_0x04e7
            byte[] r0 = X.C26169Ctl.A00
            r0 = 1751411826(0x68646c72, float:4.3148E24)
            X.BOh r1 = r3.A01(r0)
            r0 = 1801812339(0x6b657973, float:2.7741754E26)
            X.BOh r2 = r3.A01(r0)
            r0 = 1768715124(0x696c7374, float:1.7865732E25)
            X.BOh r3 = r3.A01(r0)
            if (r1 == 0) goto L_0x04e7
            if (r2 == 0) goto L_0x04e7
            if (r3 == 0) goto L_0x04e7
            X.Cui r1 = r1.A00
            r0 = 16
            int r1 = X.C26207Cui.A02(r1, r0)
            r0 = 1835299937(0x6d647461, float:4.4189547E27)
            if (r1 != r0) goto L_0x04e7
            X.Cui r2 = r2.A00
            r0 = 12
            int r11 = X.C26207Cui.A02(r2, r0)
            java.lang.String[] r10 = new java.lang.String[r11]
            r1 = 0
        L_0x0456:
            r9 = 8
            if (r1 >= r11) goto L_0x046c
            int r4 = r2.A03()
            r0 = 4
            r2.A0J(r0)
            int r4 = r4 - r9
            java.lang.String r0 = r2.A0E(r4)
            r10[r1] = r0
            int r1 = r1 + 1
            goto L_0x0456
        L_0x046c:
            X.Cui r8 = r3.A00
            r8.A0I(r9)
            java.util.ArrayList r7 = X.AnonymousClass000.A13()
        L_0x0475:
            int r0 = r8.A00
            int r6 = r8.A01
            int r0 = r0 - r6
            if (r0 <= r9) goto L_0x04d1
            int r13 = r8.A03()
            int r0 = r8.A03()
            int r2 = r0 + -1
            if (r2 < 0) goto L_0x04c1
            if (r2 >= r11) goto L_0x04c1
            r5 = r10[r2]
            int r3 = r6 + r13
        L_0x048e:
            int r2 = r8.A01
            if (r2 >= r3) goto L_0x04b7
            int r12 = r8.A03()
            int r1 = r8.A03()
            r0 = 1684108385(0x64617461, float:1.6635614E22)
            if (r1 != r0) goto L_0x04bc
            int r4 = r8.A03()
            int r3 = r8.A03()
            int r2 = r12 + -16
            byte[] r1 = new byte[r2]
            r0 = 0
            r8.A0K(r1, r0, r2)
            X.D9H r0 = new X.D9H
            r0.<init>(r1, r3, r4, r5)
            r7.add(r0)
        L_0x04b7:
            int r6 = r6 + r13
            r8.A0I(r6)
            goto L_0x0475
        L_0x04bc:
            int r2 = r2 + r12
            r8.A0I(r2)
            goto L_0x048e
        L_0x04c1:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "Skipped metadata with unknown key index: "
            java.lang.String r1 = X.AnonymousClass001.A1I(r0, r1, r2)
            java.lang.String r0 = "AtomParsers"
            android.util.Log.w(r0, r1)
            goto L_0x04b7
        L_0x04d1:
            boolean r0 = r7.isEmpty()
            if (r0 != 0) goto L_0x04e7
            r0 = 0
            X.ECQ[] r0 = new X.ECQ[r0]
            java.lang.Object[] r1 = r7.toArray(r0)
            X.ECQ[] r1 = (X.ECQ[]) r1
            X.D42 r16 = new X.D42
            r0 = r16
            r0.<init>((X.ECQ[]) r1)
        L_0x04e7:
            r20 = 0
            java.util.ArrayList r19 = X.AnonymousClass000.A13()
            r24 = 0
        L_0x04ef:
            r0 = r21
            java.util.List r2 = r0.A01
            int r1 = r2.size()
            r0 = r24
            if (r0 >= r1) goto L_0x09cf
            java.lang.Object r9 = r2.get(r0)
            X.BOi r9 = (X.C22769BOi) r9
            int r1 = r9.A00
            r0 = 1953653099(0x7472616b, float:7.681346E31)
            if (r1 != r0) goto L_0x0572
            r1 = 1836476516(0x6d766864, float:4.7662196E27)
            r0 = r21
            X.BOh r10 = r0.A01(r1)
            r8 = 0
            r0 = r51
            boolean r13 = r0.A0C
            r11 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r7 = 0
            X.CU2 r30 = X.C26169Ctl.A03(r8, r9, r10, r11, r13)
            if (r30 == 0) goto L_0x0572
            r0 = 1835297121(0x6d646961, float:4.4181236E27)
            X.BOi r1 = r9.A00(r0)
            r0 = 1835626086(0x6d696e66, float:4.515217E27)
            X.BOi r1 = r1.A00(r0)
            r0 = 1937007212(0x7374626c, float:1.9362132E31)
            X.BOi r3 = r1.A00(r0)
            r0 = 1937011578(0x7374737a, float:1.936741E31)
            X.BOh r1 = r3.A01(r0)
            if (r1 == 0) goto L_0x09bd
            r0 = r30
            X.D48 r2 = r0.A07
            X.D92 r38 = new X.D92
            r0 = r38
            r0.<init>(r2, r1)
        L_0x054b:
            int r37 = r38.BYT()
            if (r37 != 0) goto L_0x0576
            long[] r4 = new long[r7]
            int[] r3 = new int[r7]
            long[] r2 = new long[r7]
            int[] r1 = new int[r7]
            r12 = 0
            X.CXK r0 = new X.CXK
            r5 = r0
            r6 = r30
            r7 = r3
            r8 = r1
            r9 = r4
            r10 = r2
            r11 = r20
            r5.<init>(r6, r7, r8, r9, r10, r11, r12)
        L_0x0569:
            int r1 = r0.A01
            if (r1 == 0) goto L_0x0572
            r1 = r19
            r1.add(r0)
        L_0x0572:
            int r24 = r24 + 1
            goto L_0x04ef
        L_0x0576:
            r0 = 1937007471(0x7374636f, float:1.9362445E31)
            X.BOh r0 = r3.A01(r0)
            r5 = 1
            if (r0 != 0) goto L_0x064a
            r0 = 1668232756(0x636f3634, float:4.4126776E21)
            X.BOh r0 = r3.A01(r0)
            X.C26056CrS.A01(r0)
            r2 = 1
        L_0x058b:
            X.Cui r1 = r0.A00
            r0 = 1937011555(0x73747363, float:1.9367382E31)
            X.BOh r0 = r3.A01(r0)
            X.C26056CrS.A01(r0)
            X.Cui r0 = r0.A00
            r4 = 1937011827(0x73747473, float:1.9367711E31)
            X.BOh r4 = r3.A01(r4)
            X.C26056CrS.A01(r4)
            X.Cui r4 = r4.A00
            r39 = r4
            r4 = 1937011571(0x73747373, float:1.9367401E31)
            X.BOh r4 = r3.A01(r4)
            if (r4 == 0) goto L_0x0646
            X.Cui r4 = r4.A00
            r32 = r4
        L_0x05b4:
            r4 = 1668576371(0x63747473, float:4.5093966E21)
            X.BOh r3 = r3.A01(r4)
            if (r3 == 0) goto L_0x0643
            X.Cui r15 = r3.A00
        L_0x05bf:
            X.CXQ r10 = new X.CXQ
            r10.<init>(r0, r1, r2)
            r2 = 12
            r0 = r39
            r0.A0I(r2)
            int r9 = r39.A05()
            int r9 = r9 - r5
            int r13 = r39.A05()
            int r31 = r39.A05()
            if (r15 == 0) goto L_0x0640
            r15.A0I(r2)
            int r28 = r15.A05()
        L_0x05e1:
            r1 = -1
            if (r32 == 0) goto L_0x063d
            r0 = r32
            r0.A0I(r2)
            int r8 = r32.A05()
            if (r8 <= 0) goto L_0x063a
            int r0 = r32.A05()
            int r14 = r0 + -1
        L_0x05f5:
            int r29 = r38.BRp()
            r0 = r30
            X.D48 r0 = r0.A07
            r46 = r0
            java.lang.String r2 = r0.A0S
            r0 = r29
            if (r0 == r1) goto L_0x069a
            java.lang.String r0 = "audio/raw"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L_0x061d
            java.lang.String r0 = "audio/g711-mlaw"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L_0x061d
            java.lang.String r0 = "audio/g711-alaw"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x069a
        L_0x061d:
            if (r9 != 0) goto L_0x069a
            if (r28 != 0) goto L_0x069a
            if (r8 != 0) goto L_0x069a
            int r11 = r10.A05
            long[] r12 = new long[r11]
            int[] r9 = new int[r11]
        L_0x0629:
            boolean r0 = r10.A00()
            if (r0 == 0) goto L_0x064d
            int r2 = r10.A00
            long r0 = r10.A04
            r12[r2] = r0
            int r0 = r10.A02
            r9[r2] = r0
            goto L_0x0629
        L_0x063a:
            r32 = 0
            goto L_0x063e
        L_0x063d:
            r8 = 0
        L_0x063e:
            r14 = -1
            goto L_0x05f5
        L_0x0640:
            r28 = 0
            goto L_0x05e1
        L_0x0643:
            r15 = 0
            goto L_0x05bf
        L_0x0646:
            r32 = 0
            goto L_0x05b4
        L_0x064a:
            r2 = 0
            goto L_0x058b
        L_0x064d:
            r0 = r31
            long r3 = (long) r0
            r10 = 8192(0x2000, float:1.14794E-41)
            int r10 = r10 / r29
            r8 = 0
            r1 = 0
            r0 = 0
        L_0x0657:
            if (r1 >= r11) goto L_0x0663
            r2 = r9[r1]
            int r2 = r2 + r10
            int r2 = r2 + -1
            int r2 = r2 / r10
            int r0 = r0 + r2
            int r1 = r1 + 1
            goto L_0x0657
        L_0x0663:
            long[] r15 = new long[r0]
            int[] r6 = new int[r0]
            long[] r14 = new long[r0]
            int[] r13 = new int[r0]
            r28 = 0
            r5 = 0
        L_0x066e:
            if (r8 >= r11) goto L_0x07ad
            r2 = r9[r8]
            r26 = r12[r8]
        L_0x0674:
            if (r2 <= 0) goto L_0x0697
            int r25 = java.lang.Math.min(r10, r2)
            r15[r28] = r26
            int r0 = r29 * r25
            r6[r28] = r0
            int r5 = java.lang.Math.max(r5, r0)
            long r0 = (long) r7
            long r0 = r0 * r3
            r14[r28] = r0
            r0 = 1
            r13[r28] = r0
            r0 = r6[r28]
            long r0 = (long) r0
            long r26 = r26 + r0
            int r7 = r7 + r25
            int r2 = r2 - r25
            int r28 = r28 + 1
            goto L_0x0674
        L_0x0697:
            int r8 = r8 + 1
            goto L_0x066e
        L_0x069a:
            r0 = r37
            long[] r0 = new long[r0]
            r36 = r0
            r0 = r37
            int[] r0 = new int[r0]
            r35 = r0
            r0 = r37
            long[] r2 = new long[r0]
            int[] r0 = new int[r0]
            r33 = r0
            r34 = 0
            r27 = 0
            r12 = 0
            r11 = 0
            r0 = 0
            r5 = 0
        L_0x06b8:
            java.lang.String r25 = "AtomParsers"
            r3 = r37
            if (r7 >= r3) goto L_0x0745
        L_0x06be:
            if (r12 != 0) goto L_0x06cb
            boolean r3 = r10.A00()
            if (r3 == 0) goto L_0x0726
            long r5 = r10.A04
            int r12 = r10.A02
            goto L_0x06be
        L_0x06cb:
            if (r15 == 0) goto L_0x06de
        L_0x06cd:
            if (r11 != 0) goto L_0x06dc
            if (r28 <= 0) goto L_0x06dc
            int r11 = r15.A05()
            int r27 = r15.A03()
            int r28 = r28 + -1
            goto L_0x06cd
        L_0x06dc:
            int r11 = r11 + -1
        L_0x06de:
            r36[r7] = r5
            int r4 = r38.CDS()
            r35[r7] = r4
            r3 = r34
            if (r4 <= r3) goto L_0x06ec
            r34 = r4
        L_0x06ec:
            r3 = r27
            long r3 = (long) r3
            long r3 = r3 + r0
            r2[r7] = r3
            boolean r3 = X.AnonymousClass000.A1X(r32)
            r33[r7] = r3
            if (r7 != r14) goto L_0x0709
            r3 = 1
            r33[r7] = r3
            int r8 = r8 + -1
            if (r8 <= 0) goto L_0x0709
            X.C26056CrS.A01(r32)
            int r14 = r32.A05()
            int r14 = r14 - r3
        L_0x0709:
            r3 = r31
            long r3 = (long) r3
            long r0 = r0 + r3
            int r13 = r13 + -1
            if (r13 != 0) goto L_0x071d
            if (r9 <= 0) goto L_0x071d
            int r13 = r39.A05()
            int r31 = r39.A03()
            int r9 = r9 + -1
        L_0x071d:
            r3 = r35[r7]
            long r3 = (long) r3
            long r5 = r5 + r3
            int r12 = r12 + -1
            int r7 = r7 + 1
            goto L_0x06b8
        L_0x0726:
            java.lang.String r4 = "Unexpected end of chunk data"
            r3 = r25
            android.util.Log.w(r3, r4)
            r3 = r36
            long[] r36 = java.util.Arrays.copyOf(r3, r7)
            r3 = r35
            int[] r35 = java.util.Arrays.copyOf(r3, r7)
            long[] r2 = java.util.Arrays.copyOf(r2, r7)
            r3 = r33
            int[] r33 = java.util.Arrays.copyOf(r3, r7)
            r37 = r7
        L_0x0745:
            r3 = r27
            long r3 = (long) r3
            long r0 = r0 + r3
            if (r15 == 0) goto L_0x07ab
        L_0x074b:
            if (r28 <= 0) goto L_0x07ab
            int r3 = r15.A05()
            if (r3 == 0) goto L_0x07a5
            r5 = 0
        L_0x0754:
            if (r8 != 0) goto L_0x0760
            if (r13 != 0) goto L_0x0760
            if (r12 != 0) goto L_0x0760
            if (r9 != 0) goto L_0x0760
            if (r11 != 0) goto L_0x0760
            if (r5 != 0) goto L_0x07cf
        L_0x0760:
            java.lang.StringBuilder r4 = X.AnonymousClass000.A10()
            java.lang.String r3 = "Inconsistent stbl box for track "
            r4.append(r3)
            r3 = r30
            int r3 = r3.A00
            r4.append(r3)
            java.lang.String r3 = ": remainingSynchronizationSamples "
            r4.append(r3)
            r4.append(r8)
            java.lang.String r3 = ", remainingSamplesAtTimestampDelta "
            r4.append(r3)
            r4.append(r13)
            java.lang.String r3 = ", remainingSamplesInChunk "
            r4.append(r3)
            r4.append(r12)
            java.lang.String r3 = ", remainingTimestampDeltaChanges "
            r4.append(r3)
            r4.append(r9)
            java.lang.String r3 = ", remainingSamplesAtTimestampOffset "
            r4.append(r3)
            r4.append(r11)
            if (r5 != 0) goto L_0x07a2
            java.lang.String r5 = ", ctts invalid"
        L_0x079c:
            r3 = r25
            X.BE9.A1H(r5, r3, r4)
            goto L_0x07cf
        L_0x07a2:
            java.lang.String r5 = ""
            goto L_0x079c
        L_0x07a5:
            r15.A03()
            int r28 = r28 + -1
            goto L_0x074b
        L_0x07ab:
            r5 = 1
            goto L_0x0754
        L_0x07ad:
            long r0 = (long) r7
            long r3 = r3 * r0
            X.CSj r0 = new X.CSj
            r7 = r15
            r8 = r14
            r9 = r5
            r10 = r3
            r4 = r0
            r5 = r6
            r6 = r13
            r4.<init>(r5, r6, r7, r8, r9, r10)
            long[] r1 = r0.A04
            r36 = r1
            int[] r1 = r0.A03
            r35 = r1
            int r1 = r0.A00
            r34 = r1
            long[] r2 = r0.A05
            int[] r1 = r0.A02
            r33 = r1
            long r0 = r0.A01
        L_0x07cf:
            r7 = 1000000(0xf4240, double:4.940656E-318)
            r3 = r30
            long r3 = r3.A06
            r5 = r0
            r9 = r3
            long r10 = com.facebook.android.exoplayer2.util.Util.A06(r5, r7, r9)
            r5 = r30
            long[] r9 = r5.A08
            if (r9 != 0) goto L_0x07f8
            com.facebook.android.exoplayer2.util.Util.A0A(r2, r3)
        L_0x07e5:
            X.CXK r0 = new X.CXK
            r3 = r0
            r4 = r30
            r5 = r35
            r6 = r33
            r7 = r36
            r8 = r2
            r9 = r34
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)
            goto L_0x0569
        L_0x07f8:
            int r12 = r9.length
            r6 = 1
            if (r12 != r6) goto L_0x08ad
            int r5 = r5.A03
            if (r5 != r6) goto L_0x0885
            int r7 = r2.length
            r5 = 2
            if (r7 < r5) goto L_0x0885
            r5 = r30
            long[] r5 = r5.A09
            X.C26056CrS.A01(r5)
            r44 = r5[r20]
            r38 = r9[r20]
            r5 = r30
            long r10 = r5.A05
            r40 = r3
            r42 = r10
            long r5 = com.facebook.android.exoplayer2.util.Util.A06(r38, r40, r42)
            long r25 = r44 + r5
            r5 = 1
            int r8 = r7 - r5
            r6 = 4
            r5 = r20
            int r15 = X.BE8.A07(r6, r8, r5)
            int r7 = r7 - r6
            int r8 = X.BE8.A07(r7, r8, r5)
            r13 = r2[r20]
            int r5 = (r13 > r44 ? 1 : (r13 == r44 ? 0 : -1))
            if (r5 > 0) goto L_0x0885
            r6 = r2[r15]
            int r5 = (r44 > r6 ? 1 : (r44 == r6 ? 0 : -1))
            if (r5 >= 0) goto L_0x0885
            r6 = r2[r8]
            int r5 = (r6 > r25 ? 1 : (r6 == r25 ? 0 : -1))
            if (r5 >= 0) goto L_0x0885
            int r5 = (r25 > r0 ? 1 : (r25 == r0 ? 0 : -1))
            if (r5 > 0) goto L_0x0885
            long r38 = r0 - r25
            long r44 = r44 - r13
            r5 = r46
            int r5 = r5.A0F
            long r7 = (long) r5
            r46 = r7
            r48 = r3
            long r5 = com.facebook.android.exoplayer2.util.Util.A06(r44, r46, r48)
            r40 = r7
            r42 = r3
            long r7 = com.facebook.android.exoplayer2.util.Util.A06(r38, r40, r42)
            r14 = 0
            int r13 = (r5 > r14 ? 1 : (r5 == r14 ? 0 : -1))
            if (r13 != 0) goto L_0x0865
            int r13 = (r7 > r14 ? 1 : (r7 == r14 ? 0 : -1))
            if (r13 == 0) goto L_0x0885
        L_0x0865:
            r14 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r13 = (r5 > r14 ? 1 : (r5 == r14 ? 0 : -1))
            if (r13 > 0) goto L_0x0885
            int r13 = (r7 > r14 ? 1 : (r7 == r14 ? 0 : -1))
            if (r13 > 0) goto L_0x0885
            int r0 = (int) r5
            r22 = r0
            int r0 = (int) r7
            r17 = r0
            r5 = 1000000(0xf4240, double:4.940656E-318)
            com.facebook.android.exoplayer2.util.Util.A0A(r2, r3)
            r3 = r9[r20]
            r7 = r10
            long r10 = com.facebook.android.exoplayer2.util.Util.A06(r3, r5, r7)
            goto L_0x07e5
        L_0x0885:
            r10 = r9[r20]
            r6 = 0
            int r5 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r5 != 0) goto L_0x08ad
            r5 = r30
            long[] r5 = r5.A09
            X.C26056CrS.A01(r5)
            r8 = r5[r20]
            r7 = 0
        L_0x0897:
            int r5 = r2.length
            if (r7 >= r5) goto L_0x08a6
            r5 = r2[r7]
            long r5 = r5 - r8
            long r5 = X.BE8.A0E(r5, r3)
            r2[r7] = r5
            int r7 = r7 + 1
            goto L_0x0897
        L_0x08a6:
            long r0 = r0 - r8
            long r10 = X.BE8.A0E(r0, r3)
            goto L_0x07e5
        L_0x08ad:
            r0 = r30
            int r1 = r0.A03
            r0 = 1
            boolean r25 = X.AnonymousClass000.A1T(r1, r0)
            int[] r8 = new int[r12]
            int[] r13 = new int[r12]
            r0 = r30
            long[] r0 = r0.A09
            r32 = r0
            X.C26056CrS.A01(r32)
            r7 = 0
            r31 = 0
            r10 = 0
            r6 = 0
        L_0x08c8:
            if (r7 >= r12) goto L_0x0923
            r0 = r32[r7]
            r14 = -1
            int r5 = (r0 > r14 ? 1 : (r0 == r14 ? 0 : -1))
            if (r5 == 0) goto L_0x091e
            r38 = r9[r7]
            r5 = r30
            long r14 = r5.A05
            r40 = r3
            r42 = r14
            long r14 = com.facebook.android.exoplayer2.util.Util.A06(r38, r40, r42)
            r5 = 1
            int r5 = com.facebook.android.exoplayer2.util.Util.A03(r2, r0, r5)
            r8[r7] = r5
            long r0 = r0 + r14
            int r11 = java.util.Arrays.binarySearch(r2, r0)
            if (r11 >= 0) goto L_0x090d
            r11 = r11 ^ -1
        L_0x08f0:
            r13[r7] = r11
        L_0x08f2:
            r1 = r8[r7]
            r0 = r13[r7]
            if (r1 >= r0) goto L_0x0903
            r5 = r33[r1]
            r5 = r5 & 1
            if (r5 != 0) goto L_0x0903
            int r0 = r1 + 1
            r8[r7] = r0
            goto L_0x08f2
        L_0x0903:
            int r5 = r0 - r1
            int r10 = r10 + r5
            boolean r1 = X.AnonymousClass000.A1S(r6, r1)
            r31 = r31 | r1
            goto L_0x091f
        L_0x090d:
            int r11 = r11 + 1
            int r5 = r2.length
            if (r11 >= r5) goto L_0x0919
            r14 = r2[r11]
            int r5 = (r14 > r0 ? 1 : (r14 == r0 ? 0 : -1))
            if (r5 != 0) goto L_0x0919
            goto L_0x090d
        L_0x0919:
            if (r25 == 0) goto L_0x08f0
            int r11 = r11 + -1
            goto L_0x08f0
        L_0x091e:
            r0 = r6
        L_0x091f:
            int r7 = r7 + 1
            r6 = r0
            goto L_0x08c8
        L_0x0923:
            r7 = 0
            r1 = 1
            r0 = r37
            if (r10 != r0) goto L_0x092a
            r1 = 0
        L_0x092a:
            r31 = r31 | r1
            if (r31 == 0) goto L_0x0997
            long[] r0 = new long[r10]
            r44 = r0
            int[] r15 = new int[r10]
            r34 = 0
            int[] r0 = new int[r10]
            r43 = r0
        L_0x093a:
            long[] r0 = new long[r10]
            r29 = r0
            r37 = 0
            r6 = 0
        L_0x0941:
            if (r7 >= r12) goto L_0x099e
            r27 = r32[r7]
            r5 = r8[r7]
            r14 = r13[r7]
            if (r31 == 0) goto L_0x0960
            int r10 = r14 - r5
            r1 = r36
            r0 = r44
            java.lang.System.arraycopy(r1, r5, r0, r6, r10)
            r0 = r35
            java.lang.System.arraycopy(r0, r5, r15, r6, r10)
            r1 = r33
            r0 = r43
            java.lang.System.arraycopy(r1, r5, r0, r6, r10)
        L_0x0960:
            if (r5 >= r14) goto L_0x0990
            r39 = 1000000(0xf4240, double:4.940656E-318)
            r0 = r30
            long r0 = r0.A05
            r41 = r0
            long r25 = com.facebook.android.exoplayer2.util.Util.A06(r37, r39, r41)
            r0 = r2[r5]
            long r0 = r0 - r27
            r10 = 0
            long r0 = java.lang.Math.max(r10, r0)
            long r0 = X.BE8.A0E(r0, r3)
            long r25 = r25 + r0
            r29[r6] = r25
            if (r31 == 0) goto L_0x098b
            r1 = r15[r6]
            r0 = r34
            if (r1 <= r0) goto L_0x098b
            r34 = r35[r5]
        L_0x098b:
            int r6 = r6 + 1
            int r5 = r5 + 1
            goto L_0x0960
        L_0x0990:
            r0 = r9[r7]
            long r37 = r37 + r0
            int r7 = r7 + 1
            goto L_0x0941
        L_0x0997:
            r44 = r36
            r15 = r35
            r43 = r33
            goto L_0x093a
        L_0x099e:
            r39 = 1000000(0xf4240, double:4.940656E-318)
            r0 = r30
            long r0 = r0.A05
            r41 = r0
            long r7 = com.facebook.android.exoplayer2.util.Util.A06(r37, r39, r41)
            X.CXK r0 = new X.CXK
            r1 = r30
            r2 = r15
            r3 = r43
            r4 = r44
            r5 = r29
            r6 = r34
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            goto L_0x0569
        L_0x09bd:
            r0 = 1937013298(0x73747a32, float:1.9369489E31)
            X.BOh r1 = r3.A01(r0)
            if (r1 == 0) goto L_0x0ba9
            X.D93 r38 = new X.D93
            r0 = r38
            r0.<init>(r1)
            goto L_0x054b
        L_0x09cf:
            int r9 = r19.size()
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r1 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r8 = 0
            r7 = -1
        L_0x09df:
            if (r8 >= r9) goto L_0x0aee
            r0 = r19
            java.lang.Object r12 = r0.get(r8)
            X.CXK r12 = (X.CXK) r12
            X.CU2 r11 = r12.A03
            long r3 = r11.A04
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 == 0) goto L_0x0aea
            long r5 = r11.A04
        L_0x09f3:
            long r1 = java.lang.Math.max(r1, r5)
            r0 = r51
            X.D9O r0 = r0.A09
            int r3 = r11.A03
            X.E8z r0 = r0.A05(r8)
            X.CR6 r10 = new X.CR6
            r10.<init>(r0, r11, r12)
            int r0 = r12.A00
            int r13 = r0 + 30
            X.D48 r4 = r11.A07
            X.CkX r0 = new X.CkX
            r0.<init>(r4)
            r0.A09 = r13
            X.D48 r4 = new X.D48
            r4.<init>(r0)
            r0 = 2
            if (r3 != r0) goto L_0x0a3b
            r13 = 0
            int r0 = (r5 > r13 ? 1 : (r5 == r13 ? 0 : -1))
            if (r0 <= 0) goto L_0x0a3b
            int r3 = r12.A01
            r0 = 1
            if (r3 <= r0) goto L_0x0a3b
            int r0 = r12.A01
            float r3 = (float) r0
            float r0 = (float) r5
            r5 = 1232348160(0x49742400, float:1000000.0)
            float r0 = r0 / r5
            float r3 = r3 / r0
            X.CkX r0 = new X.CkX
            r0.<init>(r4)
            r0.A00 = r3
            X.D48 r4 = new X.D48
            r4.<init>(r0)
        L_0x0a3b:
            int r5 = r11.A03
            r11 = 1
            if (r5 != r11) goto L_0x0a88
            r3 = -1
            r0 = r22
            if (r0 == r3) goto L_0x0a5b
            r0 = r17
            if (r0 == r3) goto L_0x0a5b
            X.CkX r0 = new X.CkX
            r0.<init>(r4)
            r3 = r22
            r0.A06 = r3
            r3 = r17
            r0.A07 = r3
            X.D48 r4 = new X.D48
            r4.<init>(r0)
        L_0x0a5b:
            if (r18 == 0) goto L_0x0a6b
            X.CkX r0 = new X.CkX
            r0.<init>(r4)
            r3 = r18
            r0.A0L = r3
            X.D48 r4 = new X.D48
            r4.<init>(r0)
        L_0x0a6b:
            X.E8z r0 = r10.A01
            r0.BLZ(r4)
            r0 = 2
            if (r5 != r0) goto L_0x0a7a
            r0 = -1
            if (r7 != r0) goto L_0x0a7a
            int r7 = r23.size()
        L_0x0a7a:
            r0 = r23
            r0.add(r10)
            int r8 = r8 + 1
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            goto L_0x09df
        L_0x0a88:
            r0 = 2
            if (r5 != r0) goto L_0x0a6b
            if (r16 == 0) goto L_0x0a6b
            r6 = 0
        L_0x0a8e:
            r0 = r16
            X.ECQ[] r3 = r0.A01
            int r0 = r3.length
            if (r6 >= r0) goto L_0x0a6b
            r12 = r3[r6]
            boolean r0 = r12 instanceof X.D9H
            if (r0 == 0) goto L_0x0ae7
            X.D9H r12 = (X.D9H) r12
            java.lang.String r3 = "com.android.capture.fps"
            java.lang.String r0 = r12.A02
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0ae7
            int r3 = r12.A01
            r0 = 23
            if (r3 != r0) goto L_0x0ae7
            byte[] r0 = r12.A03     // Catch:{ NumberFormatException -> 0x0ade }
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.wrap(r0)     // Catch:{ NumberFormatException -> 0x0ade }
            java.nio.FloatBuffer r0 = r0.asFloatBuffer()     // Catch:{ NumberFormatException -> 0x0ade }
            float r0 = r0.get()     // Catch:{ NumberFormatException -> 0x0ade }
            X.CkX r3 = new X.CkX     // Catch:{ NumberFormatException -> 0x0ade }
            r3.<init>(r4)     // Catch:{ NumberFormatException -> 0x0ade }
            r3.A00 = r0     // Catch:{ NumberFormatException -> 0x0ade }
            X.D48 r0 = new X.D48     // Catch:{ NumberFormatException -> 0x0ade }
            r0.<init>(r3)     // Catch:{ NumberFormatException -> 0x0ade }
            r4 = r0
            X.ECQ[] r3 = new X.ECQ[r11]     // Catch:{ NumberFormatException -> 0x0ade }
            r3[r20] = r12     // Catch:{ NumberFormatException -> 0x0ade }
            X.D42 r0 = new X.D42     // Catch:{ NumberFormatException -> 0x0ade }
            r0.<init>((X.ECQ[]) r3)     // Catch:{ NumberFormatException -> 0x0ade }
            X.CkX r3 = new X.CkX     // Catch:{ NumberFormatException -> 0x0ade }
            r3.<init>(r4)     // Catch:{ NumberFormatException -> 0x0ade }
            r3.A0L = r0     // Catch:{ NumberFormatException -> 0x0ade }
            X.D48 r0 = new X.D48     // Catch:{ NumberFormatException -> 0x0ade }
            r0.<init>(r3)     // Catch:{ NumberFormatException -> 0x0ade }
            goto L_0x0ae6
        L_0x0ade:
            java.lang.String r3 = "MetadataUtil"
            java.lang.String r0 = "Ignoring invalid framerate"
            android.util.Log.w(r3, r0)
            goto L_0x0ae7
        L_0x0ae6:
            r4 = r0
        L_0x0ae7:
            int r6 = r6 + 1
            goto L_0x0a8e
        L_0x0aea:
            long r5 = r12.A02
            goto L_0x09f3
        L_0x0aee:
            r0 = r51
            r0.A02 = r7
            r0.A08 = r1
            r0 = r20
            X.CR6[] r1 = new X.CR6[r0]
            r0 = r23
            java.lang.Object[] r7 = r0.toArray(r1)
            X.CR6[] r7 = (X.CR6[]) r7
            r0 = r51
            r0.A0D = r7
            int r8 = r7.length
            long[][] r6 = new long[r8][]
            int[] r5 = new int[r8]
            long[] r4 = new long[r8]
            boolean[] r3 = new boolean[r8]
            r2 = 0
            r9 = 0
        L_0x0b0f:
            if (r9 >= r8) goto L_0x0b28
            r0 = r7[r9]
            X.CXK r0 = r0.A03
            int r0 = r0.A01
            long[] r0 = new long[r0]
            r6[r9] = r0
            r0 = r7[r9]
            X.CXK r0 = r0.A03
            long[] r0 = r0.A07
            r0 = r0[r20]
            r4[r9] = r0
            int r9 = r9 + 1
            goto L_0x0b0f
        L_0x0b28:
            r14 = 0
        L_0x0b2a:
            if (r2 >= r8) goto L_0x0b68
            r11 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r13 = -1
            r1 = 0
        L_0x0b33:
            if (r1 >= r8) goto L_0x0b44
            boolean r0 = r3[r1]
            if (r0 != 0) goto L_0x0b41
            r9 = r4[r1]
            int r0 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r0 > 0) goto L_0x0b41
            r13 = r1
            r11 = r9
        L_0x0b41:
            int r1 = r1 + 1
            goto L_0x0b33
        L_0x0b44:
            r12 = r5[r13]
            r11 = r6[r13]
            r11[r12] = r14
            r0 = r7[r13]
            X.CXK r10 = r0.A03
            int[] r0 = r10.A05
            r0 = r0[r12]
            long r0 = (long) r0
            long r14 = r14 + r0
            r9 = 1
            int r1 = r12 + 1
            r5[r13] = r1
            int r0 = r11.length
            if (r1 >= r0) goto L_0x0b63
            long[] r0 = r10.A07
            r0 = r0[r1]
            r4[r13] = r0
            goto L_0x0b2a
        L_0x0b63:
            r3[r13] = r9
            int r2 = r2 + 1
            goto L_0x0b2a
        L_0x0b68:
            r0 = r51
            r0.A0E = r6
            X.D9O r2 = r0.A09
            r0 = 1
            r2.A0G = r0
            android.os.Handler r1 = r2.A0O
            java.lang.Runnable r0 = r2.A0U
            r1.post(r0)
            r0 = r51
            X.D9O r2 = r0.A09
            r2.A07 = r0
            android.os.Handler r1 = r2.A0O
            java.lang.Runnable r0 = r2.A0U
            r1.post(r0)
            r50.clear()
            r1 = 2
            r0 = r51
            r0.A03 = r1
            goto L_0x0000
        L_0x0b8f:
            boolean r0 = r50.isEmpty()
            if (r0 != 0) goto L_0x0000
            java.lang.Object r0 = r50.peek()
            X.BOi r0 = (X.C22769BOi) r0
            java.util.List r1 = r0.A01
            r0 = r21
            r1.add(r0)
            goto L_0x0000
        L_0x0ba4:
            r0 = move-exception
            r13.A0I(r7)
            throw r0
        L_0x0ba9:
            java.lang.String r2 = "Track has no sample table size information"
            r1 = 1
            X.BxS r0 = new X.BxS
            r0.<init>(r2, r8, r1)
            throw r0
        L_0x0bb2:
            r0 = r51
            int r1 = r0.A03
            r0 = 2
            if (r1 == r0) goto L_0x0bc0
            r1 = 0
            r0 = r51
            r0.A03 = r1
            r0.A00 = r1
        L_0x0bc0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26676D8z.A00(long):void");
    }

    public long BR1() {
        return this.A08;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x003c, code lost:
        if (r3 == -1) goto L_0x003e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x008b, code lost:
        if (r1 == -1) goto L_0x008d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C25155Ca6 BYo(long r18) {
        /*
            r17 = this;
            r8 = r18
            r12 = r17
            X.CR6[] r1 = r12.A0D
            int r0 = r1.length
            if (r0 == 0) goto L_0x003e
            int r0 = r12.A02
            r11 = -1
            r15 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r4 = -1
            if (r0 == r11) goto L_0x002d
            r0 = r1[r0]
            X.CXK r10 = r0.A03
            long[] r1 = r10.A07
            r0 = 0
            int r3 = com.facebook.android.exoplayer2.util.Util.A03(r1, r8, r0)
        L_0x0020:
            if (r3 < 0) goto L_0x0038
            int[] r0 = r10.A04
            r0 = r0[r3]
            r0 = r0 & 1
            if (r0 != 0) goto L_0x0046
            int r3 = r3 + -1
            goto L_0x0020
        L_0x002d:
            r6 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            goto L_0x0065
        L_0x0038:
            int r3 = r10.A00(r8)
            if (r3 != r11) goto L_0x0046
        L_0x003e:
            X.Cls r0 = X.C25781Cls.A02
            X.Ca6 r2 = new X.Ca6
            r2.<init>(r0, r0)
            return r2
        L_0x0046:
            long[] r2 = r10.A07
            r13 = r2[r3]
            long[] r1 = r10.A06
            r6 = r1[r3]
            int r0 = (r13 > r18 ? 1 : (r13 == r18 ? 0 : -1))
            if (r0 >= 0) goto L_0x00c0
            int r0 = r10.A01
            int r0 = r0 + -1
            if (r3 >= r0) goto L_0x00c0
            int r0 = r10.A00(r8)
            if (r0 == r11) goto L_0x00c0
            if (r0 == r3) goto L_0x00c0
            r2 = r2[r0]
            r4 = r1[r0]
        L_0x0064:
            r8 = r13
        L_0x0065:
            r10 = 0
        L_0x0066:
            X.CR6[] r1 = r12.A0D
            int r0 = r1.length
            if (r10 >= r0) goto L_0x00c6
            int r0 = r12.A02
            if (r10 == r0) goto L_0x00b4
            r0 = r1[r10]
            X.CXK r13 = r0.A03
            long[] r1 = r13.A07
            r0 = 0
            int r1 = com.facebook.android.exoplayer2.util.Util.A03(r1, r8, r0)
        L_0x007a:
            if (r1 < 0) goto L_0x0087
            int[] r0 = r13.A04
            r0 = r0[r1]
            r0 = r0 & 1
            if (r0 != 0) goto L_0x00a5
            int r1 = r1 + -1
            goto L_0x007a
        L_0x0087:
            int r1 = r13.A00(r8)
            if (r1 != r11) goto L_0x00a5
        L_0x008d:
            int r0 = (r2 > r15 ? 1 : (r2 == r15 ? 0 : -1))
            if (r0 == 0) goto L_0x00b4
            long[] r1 = r13.A07
            r0 = 0
            int r1 = com.facebook.android.exoplayer2.util.Util.A03(r1, r2, r0)
        L_0x0098:
            if (r1 < 0) goto L_0x00ae
            int[] r0 = r13.A04
            r0 = r0[r1]
            r0 = r0 & 1
            if (r0 != 0) goto L_0x00b7
            int r1 = r1 + -1
            goto L_0x0098
        L_0x00a5:
            long[] r0 = r13.A06
            r0 = r0[r1]
            long r6 = java.lang.Math.min(r0, r6)
            goto L_0x008d
        L_0x00ae:
            int r1 = r13.A00(r2)
            if (r1 != r11) goto L_0x00b7
        L_0x00b4:
            int r10 = r10 + 1
            goto L_0x0066
        L_0x00b7:
            long[] r0 = r13.A06
            r0 = r0[r1]
            long r4 = java.lang.Math.min(r0, r4)
            goto L_0x00b4
        L_0x00c0:
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            goto L_0x0064
        L_0x00c6:
            X.Cls r1 = new X.Cls
            r1.<init>(r8, r6)
            int r0 = (r2 > r15 ? 1 : (r2 == r15 ? 0 : -1))
            if (r0 != 0) goto L_0x00d5
            X.Ca6 r2 = new X.Ca6
            r2.<init>(r1, r1)
            return r2
        L_0x00d5:
            X.Cls r0 = new X.Cls
            r0.<init>(r2, r4)
            X.Ca6 r2 = new X.Ca6
            r2.<init>(r1, r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26676D8z.BYo(long):X.Ca6");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0054, code lost:
        if (r3 == false) goto L_0x0056;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0058, code lost:
        if (r17 < r19) goto L_0x005a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x005a, code lost:
        r3 = r1;
        r19 = r17;
        r25 = r4;
        r21 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0063, code lost:
        if (r15 >= r23) goto L_0x0069;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0065, code lost:
        r11 = r1;
        r2 = r4;
        r23 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x006d, code lost:
        if (true == r3) goto L_0x0056;
     */
    /* JADX WARNING: Removed duplicated region for block: B:182:0x036f A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x012e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int CDJ(X.C26036Cqw r27, X.C24761CIy r28) {
        /*
            r26 = this;
        L_0x0000:
            r10 = r26
            int r0 = r10.A03
            r13 = r27
            if (r0 == 0) goto L_0x00e7
            r12 = 1
            r14 = r28
            if (r0 == r12) goto L_0x0070
            long r7 = r13.A02
            int r2 = r10.A06
            r9 = -1
            if (r2 != r9) goto L_0x0278
            r2 = -1
            r25 = -1
            r4 = 0
            r23 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r11 = 1
            r21 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r3 = 1
            r19 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
        L_0x0029:
            X.CR6[] r5 = r10.A0D
            int r0 = r5.length
            if (r4 >= r0) goto L_0x024e
            r5 = r5[r4]
            int r1 = r5.A00
            X.CXK r0 = r5.A03
            int r0 = r0.A01
            if (r1 == r0) goto L_0x0069
            X.CXK r0 = r5.A03
            long[] r0 = r0.A06
            r17 = r0[r1]
            long[][] r0 = r10.A0E
            r0 = r0[r4]
            r15 = r0[r1]
            long r17 = r17 - r7
            r5 = 0
            int r0 = (r17 > r5 ? 1 : (r17 == r5 ? 0 : -1))
            if (r0 < 0) goto L_0x006c
            r5 = 262144(0x40000, double:1.295163E-318)
            int r0 = (r17 > r5 ? 1 : (r17 == r5 ? 0 : -1))
            if (r0 >= 0) goto L_0x006c
            r1 = 0
            if (r3 != 0) goto L_0x005a
        L_0x0056:
            int r0 = (r17 > r19 ? 1 : (r17 == r19 ? 0 : -1))
            if (r0 >= 0) goto L_0x0061
        L_0x005a:
            r3 = r1
            r19 = r17
            r25 = r4
            r21 = r15
        L_0x0061:
            int r0 = (r15 > r23 ? 1 : (r15 == r23 ? 0 : -1))
            if (r0 >= 0) goto L_0x0069
            r11 = r1
            r2 = r4
            r23 = r15
        L_0x0069:
            int r4 = r4 + 1
            goto L_0x0029
        L_0x006c:
            r1 = 1
            if (r12 != r3) goto L_0x0061
            goto L_0x0056
        L_0x0070:
            long r2 = r10.A07
            int r6 = r10.A00
            long r0 = (long) r6
            long r2 = r2 - r0
            long r0 = r13.A02
            long r0 = r0 + r2
            X.Cui r4 = r10.A0A
            if (r4 == 0) goto L_0x00d7
            byte[] r5 = r4.A02
            int r4 = (int) r2
            r2 = 0
            r13.A05(r5, r6, r4, r2)
            int r3 = r10.A01
            r2 = 1718909296(0x66747970, float:2.8862439E23)
            if (r3 != r2) goto L_0x00ba
            X.Cui r5 = r10.A0A
            r2 = 8
            int r2 = X.C26207Cui.A02(r5, r2)
            r4 = 1903435808(0x71742020, float:1.2088509E30)
            if (r2 == r4) goto L_0x00a9
            r2 = 4
            r5.A0J(r2)
        L_0x009c:
            int r3 = r5.A00
            int r2 = r5.A01
            int r3 = r3 - r2
            if (r3 <= 0) goto L_0x00b8
            int r2 = r5.A03()
            if (r2 != r4) goto L_0x009c
        L_0x00a9:
            r2 = 1
        L_0x00aa:
            r10.A0C = r2
        L_0x00ac:
            r2 = 0
        L_0x00ad:
            r10.A00(r0)
            if (r2 == 0) goto L_0x0000
            int r1 = r10.A03
            r0 = 2
            if (r1 == r0) goto L_0x0000
            return r12
        L_0x00b8:
            r2 = 0
            goto L_0x00aa
        L_0x00ba:
            java.util.ArrayDeque r3 = r10.A0J
            boolean r2 = r3.isEmpty()
            if (r2 != 0) goto L_0x00ac
            java.lang.Object r5 = r3.peek()
            X.BOi r5 = (X.C22769BOi) r5
            int r4 = r10.A01
            X.Cui r2 = r10.A0A
            X.BOh r3 = new X.BOh
            r3.<init>(r2, r4)
            java.util.List r2 = r5.A02
            r2.add(r3)
            goto L_0x00ac
        L_0x00d7:
            r5 = 262144(0x40000, double:1.295163E-318)
            int r4 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r4 >= 0) goto L_0x00e3
            int r4 = (int) r2
            r13.A02(r4)
            goto L_0x00ac
        L_0x00e3:
            r14.A00 = r0
            r2 = 1
            goto L_0x00ad
        L_0x00e7:
            int r0 = r10.A00
            r8 = 1
            r7 = 8
            r6 = 0
            if (r0 != 0) goto L_0x010a
            X.Cui r2 = r10.A0F
            byte[] r0 = r2.A02
            boolean r0 = r13.A05(r0, r6, r7, r8)
            if (r0 == 0) goto L_0x0376
            r10.A00 = r7
            r2.A0I(r6)
            long r0 = r2.A09()
            r10.A07 = r0
            int r0 = r2.A03()
            r10.A01 = r0
        L_0x010a:
            long r0 = r10.A07
            r3 = 1
            int r2 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r2 != 0) goto L_0x01d9
            X.Cui r1 = r10.A0F
            byte[] r0 = r1.A02
            r13.A05(r0, r7, r7, r6)
            int r0 = r10.A00
            int r0 = r0 + 8
            r10.A00 = r0
            long r2 = r1.A0A()
        L_0x0123:
            r10.A07 = r2
        L_0x0125:
            long r4 = r10.A07
            int r1 = r10.A00
            long r2 = (long) r1
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r0 < 0) goto L_0x036f
            int r9 = r10.A01
            r0 = 1836019574(0x6d6f6f76, float:4.631354E27)
            if (r9 == r0) goto L_0x0204
            r0 = 1953653099(0x7472616b, float:7.681346E31)
            if (r9 == r0) goto L_0x0204
            r0 = 1835297121(0x6d646961, float:4.4181236E27)
            if (r9 == r0) goto L_0x0204
            r0 = 1835626086(0x6d696e66, float:4.515217E27)
            if (r9 == r0) goto L_0x0204
            r0 = 1937007212(0x7374626c, float:1.9362132E31)
            if (r9 == r0) goto L_0x0204
            r0 = 1701082227(0x65647473, float:6.742798E22)
            if (r9 == r0) goto L_0x0204
            r0 = 1835365473(0x6d657461, float:4.4382975E27)
            if (r9 == r0) goto L_0x0204
            r0 = 1835296868(0x6d646864, float:4.418049E27)
            if (r9 == r0) goto L_0x01b4
            r0 = 1836476516(0x6d766864, float:4.7662196E27)
            if (r9 == r0) goto L_0x01b4
            r0 = 1751411826(0x68646c72, float:4.3148E24)
            if (r9 == r0) goto L_0x01b4
            r0 = 1937011556(0x73747364, float:1.9367383E31)
            if (r9 == r0) goto L_0x01b4
            r0 = 1937011827(0x73747473, float:1.9367711E31)
            if (r9 == r0) goto L_0x01b4
            r0 = 1937011571(0x73747373, float:1.9367401E31)
            if (r9 == r0) goto L_0x01b4
            r0 = 1668576371(0x63747473, float:4.5093966E21)
            if (r9 == r0) goto L_0x01b4
            r0 = 1701606260(0x656c7374, float:6.9788014E22)
            if (r9 == r0) goto L_0x01b4
            r0 = 1937011555(0x73747363, float:1.9367382E31)
            if (r9 == r0) goto L_0x01b4
            r0 = 1937011578(0x7374737a, float:1.936741E31)
            if (r9 == r0) goto L_0x01b4
            r0 = 1937013298(0x73747a32, float:1.9369489E31)
            if (r9 == r0) goto L_0x01b4
            r0 = 1937007471(0x7374636f, float:1.9362445E31)
            if (r9 == r0) goto L_0x01b4
            r0 = 1668232756(0x636f3634, float:4.4126776E21)
            if (r9 == r0) goto L_0x01b4
            r0 = 1953196132(0x746b6864, float:7.46037E31)
            if (r9 == r0) goto L_0x01b4
            r0 = 1718909296(0x66747970, float:2.8862439E23)
            if (r9 == r0) goto L_0x01b4
            r0 = 1969517665(0x75647461, float:2.8960062E32)
            if (r9 == r0) goto L_0x01b4
            r0 = 1801812339(0x6b657973, float:2.7741754E26)
            if (r9 == r0) goto L_0x01b4
            r0 = 1768715124(0x696c7374, float:1.7865732E25)
            if (r9 == r0) goto L_0x01b4
            r0 = 0
            r10.A0A = r0
        L_0x01b0:
            r10.A03 = r8
            goto L_0x0000
        L_0x01b4:
            boolean r0 = X.AnonymousClass000.A1T(r1, r7)
            X.C26056CrS.A03(r0)
            r1 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            boolean r0 = X.C108975cc.A1A(r0)
            X.C26056CrS.A03(r0)
            int r0 = (int) r4
            X.Cui r2 = new X.Cui
            r2.<init>(r0)
            r10.A0A = r2
            X.Cui r0 = r10.A0F
            byte[] r1 = r0.A02
            byte[] r0 = r2.A02
            java.lang.System.arraycopy(r1, r6, r0, r6, r7)
            goto L_0x01b0
        L_0x01d9:
            r3 = 0
            int r2 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r2 != 0) goto L_0x0125
            long r2 = r13.A04
            r4 = -1
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 != 0) goto L_0x01f7
            java.util.ArrayDeque r1 = r10.A0J
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x01f7
            java.lang.Object r0 = r1.peek()
            X.BOi r0 = (X.C22769BOi) r0
            long r2 = r0.A00
        L_0x01f7:
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 == 0) goto L_0x0125
            long r0 = r13.A02
            long r2 = r2 - r0
            int r0 = r10.A00
            long r0 = (long) r0
            long r2 = r2 + r0
            goto L_0x0123
        L_0x0204:
            long r0 = r13.A02
            long r0 = r0 + r4
            long r0 = r0 - r2
            int r8 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r8 == 0) goto L_0x022a
            r2 = 1835365473(0x6d657461, float:4.4382975E27)
            if (r9 != r2) goto L_0x022a
            X.Cui r3 = r10.A0I
            r3.A0G(r7)
            byte[] r2 = r3.A02
            r13.A03(r2, r6, r7)
            r4 = 4
            r3.A0J(r4)
            int r3 = r3.A03()
            r2 = 1751411826(0x68646c72, float:4.3148E24)
            if (r3 != r2) goto L_0x0244
            r13.A01 = r6
        L_0x022a:
            java.util.ArrayDeque r4 = r10.A0J
            int r3 = r10.A01
            X.BOi r2 = new X.BOi
            r2.<init>(r3, r0)
            r4.push(r2)
            long r7 = r10.A07
            int r2 = r10.A00
            long r3 = (long) r2
            int r2 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r2 != 0) goto L_0x0248
            r10.A00(r0)
            goto L_0x0000
        L_0x0244:
            r13.A02(r4)
            goto L_0x022a
        L_0x0248:
            r10.A03 = r6
            r10.A00 = r6
            goto L_0x0000
        L_0x024e:
            r3 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r0 = (r23 > r3 ? 1 : (r23 == r3 ? 0 : -1))
            if (r0 == 0) goto L_0x0262
            if (r11 == 0) goto L_0x0262
            r0 = 10485760(0xa00000, double:5.180654E-317)
            long r23 = r23 + r0
            int r0 = (r21 > r23 ? 1 : (r21 == r23 ? 0 : -1))
            if (r0 >= 0) goto L_0x0264
        L_0x0262:
            r2 = r25
        L_0x0264:
            r10.A06 = r2
            if (r2 == r9) goto L_0x0376
            r0 = r5[r2]
            X.CU2 r0 = r0.A02
            X.D48 r0 = r0.A07
            java.lang.String r1 = r0.A0S
            java.lang.String r0 = "audio/ac4"
            boolean r0 = r0.equals(r1)
            r10.A0B = r0
        L_0x0278:
            X.CR6[] r0 = r10.A0D
            r6 = r0[r2]
            X.E8z r5 = r6.A01
            int r11 = r6.A00
            X.CXK r1 = r6.A03
            long[] r0 = r1.A06
            r3 = r0[r11]
            int[] r0 = r1.A05
            r2 = r0[r11]
            long r0 = r3 - r7
            int r7 = r10.A04
            long r7 = (long) r7
            long r0 = r0 + r7
            r15 = 0
            int r7 = (r0 > r15 ? 1 : (r0 == r15 ? 0 : -1))
            if (r7 < 0) goto L_0x036b
            r15 = 262144(0x40000, double:1.295163E-318)
            int r7 = (r0 > r15 ? 1 : (r0 == r15 ? 0 : -1))
            if (r7 >= 0) goto L_0x036b
            X.CU2 r3 = r6.A02
            int r3 = r3.A02
            if (r3 != r12) goto L_0x02a8
            r3 = 8
            long r0 = r0 + r3
            int r2 = r2 + -8
        L_0x02a8:
            int r3 = (int) r0
            r13.A02(r3)
            X.CU2 r0 = r6.A02
            int r14 = r0.A01
            r1 = 0
            if (r14 == 0) goto L_0x02fa
            X.Cui r8 = r10.A0G
            byte[] r7 = r8.A02
            r7[r1] = r1
            r7[r12] = r1
            r0 = 2
            r7[r0] = r1
            r12 = 4
            int r4 = 4 - r14
        L_0x02c1:
            int r0 = r10.A04
            if (r0 >= r2) goto L_0x034c
            int r0 = r10.A05
            if (r0 != 0) goto L_0x02e4
            r13.A05(r7, r4, r14, r1)
            int r0 = X.C26207Cui.A02(r8, r1)
            if (r0 < 0) goto L_0x02f3
            r10.A05 = r0
            X.Cui r0 = r10.A0H
            r0.A0I(r1)
            r5.CGY(r0, r12)
            int r0 = r10.A04
            int r0 = r0 + 4
            r10.A04 = r0
            int r2 = r2 + r4
            goto L_0x02c1
        L_0x02e4:
            int r3 = r5.CGZ(r13, r0)
            int r0 = r10.A04
            int r0 = r0 + r3
            r10.A04 = r0
            int r0 = r10.A05
            int r0 = r0 - r3
            r10.A05 = r0
            goto L_0x02c1
        L_0x02f3:
            java.lang.String r0 = "Invalid NAL length"
            X.BxS r0 = X.C24215BxS.A00(r0)
            throw r0
        L_0x02fa:
            boolean r0 = r10.A0B
            if (r0 == 0) goto L_0x0337
            X.Cui r4 = r10.A0I
            r0 = 7
            r4.A0G(r0)
            byte[] r7 = r4.A02
            r0 = -84
            r7[r1] = r0
            r0 = 64
            r7[r12] = r0
            r0 = 2
            r7[r0] = r9
            r0 = 3
            r7[r0] = r9
            int r0 = r2 >> 16
            r0 = r0 & 255(0xff, float:3.57E-43)
            byte r3 = (byte) r0
            r0 = 4
            r7[r0] = r3
            int r0 = r2 >> 8
            r0 = r0 & 255(0xff, float:3.57E-43)
            byte r3 = (byte) r0
            r0 = 5
            r7[r0] = r3
            r0 = r2 & 255(0xff, float:3.57E-43)
            byte r3 = (byte) r0
            r0 = 6
            r7[r0] = r3
            int r3 = r4.A00
            r5.CGY(r4, r3)
            int r2 = r2 + r3
            int r0 = r10.A04
            int r0 = r0 + r3
            r10.A04 = r0
            r10.A0B = r1
        L_0x0337:
            int r0 = r10.A04
            if (r0 >= r2) goto L_0x034c
            int r0 = r2 - r0
            int r3 = r5.CGZ(r13, r0)
            int r0 = r10.A04
            int r0 = r0 + r3
            r10.A04 = r0
            int r0 = r10.A05
            int r0 = r0 - r3
            r10.A05 = r0
            goto L_0x0337
        L_0x034c:
            X.CXK r3 = r6.A03
            long[] r0 = r3.A07
            r16 = r0[r11]
            int[] r0 = r3.A04
            r13 = r0[r11]
            r12 = 0
            r14 = r2
            r15 = r1
            r11 = r5
            r11.CGa(r12, r13, r14, r15, r16)
            int r0 = r6.A00
            int r0 = r0 + 1
            r6.A00 = r0
            r10.A06 = r9
            r10.A04 = r1
            r10.A05 = r1
            r0 = 0
            return r0
        L_0x036b:
            r14.A00 = r3
            r0 = 1
            return r0
        L_0x036f:
            java.lang.String r0 = "Atom size less than header length (unsupported)."
            X.BxS r0 = X.C24215BxS.A00(r0)
            throw r0
        L_0x0376:
            r0 = -1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26676D8z.CDJ(X.Cqw, X.CIy):int");
    }

    public void CH9(long j, long j2) {
        this.A0J.clear();
        this.A00 = 0;
        this.A06 = -1;
        this.A04 = 0;
        this.A05 = 0;
        this.A0B = false;
        if (j == 0) {
            this.A03 = 0;
            this.A00 = 0;
            return;
        }
        CR6[] cr6Arr = this.A0D;
        if (cr6Arr != null) {
            for (CR6 cr6 : cr6Arr) {
                CXK cxk = cr6.A03;
                int A032 = Util.A03(cxk.A07, j2, false);
                while (true) {
                    if (A032 >= 0) {
                        if ((cxk.A04[A032] & 1) != 0) {
                            break;
                        }
                        A032--;
                    } else {
                        A032 = cxk.A00(j2);
                        break;
                    }
                }
                cr6.A00 = A032;
            }
        }
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [java.lang.Object, X.Cui] */
    public C26676D8z() {
        byte[] bArr = C24727CHp.A02;
        ? obj = new Object();
        obj.A02 = bArr;
        obj.A00 = 4;
        this.A0H = obj;
        this.A0G = new C26207Cui(4);
        this.A0I = new C26207Cui();
        this.A06 = -1;
    }

    public void Bd7(D9O d9o) {
        this.A09 = d9o;
    }
}
