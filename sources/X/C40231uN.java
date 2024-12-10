package X;

/* renamed from: X.1uN  reason: invalid class name and case insensitive filesystem */
public abstract class C40231uN {
    public static final C40111uB A00 = C40111uB.A01("ty", "nm");
    public static final C40111uB A01 = C40111uB.A01("nm", "ind", "refId", "ty", "parent", "sw", "sh", "sc", "ks", "tt", "masksProperties", "shapes", "t", "ef", "sr", "st", "w", "h", "ip", "op", "tm", "cl", "hd", "ao", "bm");
    public static final C40111uB A02 = C40111uB.A01("d", "a");

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r28v7, resolved type: X.1ur} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r28v8, resolved type: X.1ur} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v71, resolved type: X.1ur} */
    /* JADX WARNING: type inference failed for: r28v4 */
    /* JADX WARNING: type inference failed for: r5v9, types: [X.1ur] */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x01dc, code lost:
        r2.A0H();
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C40941vX A00(X.C39801tf r71, X.C39941tt r72) {
        /*
            java.lang.Integer r32 = X.AnonymousClass00R.A00
            java.util.ArrayList r31 = new java.util.ArrayList
            r31.<init>()
            java.util.ArrayList r30 = new java.util.ArrayList
            r30.<init>()
            r2 = r72
            r2.A0G()
            java.lang.String r29 = "UNSET"
            r13 = 0
            r11 = 0
            r51 = 0
            java.lang.Float r49 = java.lang.Float.valueOf(r51)
            r0 = 1065353216(0x3f800000, float:1.0)
            java.lang.Float r64 = java.lang.Float.valueOf(r0)
            r41 = r32
            r42 = r32
            r40 = r13
            r44 = r13
            r28 = r13
            r12 = r13
            r34 = r13
            r38 = r13
            r39 = r13
            r16 = 0
            r18 = -1
            r27 = 0
            r15 = 0
            r20 = 0
            r21 = 0
            r54 = 0
            r22 = 1065353216(0x3f800000, float:1.0)
            r23 = 0
            r24 = 0
            r25 = 0
            r59 = 0
            r14 = 0
            r26 = r13
        L_0x004c:
            boolean r1 = r2.A0M()
            r0 = r71
            if (r1 == 0) goto L_0x0486
            X.1uB r1 = A01
            int r3 = r2.A09(r1)
            r1 = 1
            r7 = 3
            switch(r3) {
                case 0: goto L_0x0066;
                case 1: goto L_0x006b;
                case 2: goto L_0x0073;
                case 3: goto L_0x0078;
                case 4: goto L_0x0089;
                case 5: goto L_0x0091;
                case 6: goto L_0x009f;
                case 7: goto L_0x00ad;
                case 8: goto L_0x00b6;
                case 9: goto L_0x00bb;
                case 10: goto L_0x00f5;
                case 11: goto L_0x01be;
                case 12: goto L_0x01e1;
                case 13: goto L_0x0291;
                case 14: goto L_0x03fd;
                case 15: goto L_0x0406;
                case 16: goto L_0x040f;
                case 17: goto L_0x041e;
                case 18: goto L_0x042d;
                case 19: goto L_0x0434;
                case 20: goto L_0x043b;
                case 21: goto L_0x0441;
                case 22: goto L_0x0447;
                case 23: goto L_0x044d;
                case 24: goto L_0x0459;
                default: goto L_0x005f;
            }
        L_0x005f:
            r2.A0J()
            r2.A0K()
            goto L_0x004c
        L_0x0066:
            java.lang.String r29 = r2.A0D()
            goto L_0x004c
        L_0x006b:
            int r0 = r2.A08()
            long r0 = (long) r0
            r16 = r0
            goto L_0x004c
        L_0x0073:
            java.lang.String r44 = r2.A0D()
            goto L_0x004c
        L_0x0078:
            int r1 = r2.A08()
            java.lang.Integer r40 = X.AnonymousClass00R.A0u
            r0 = 6
            if (r1 >= r0) goto L_0x004c
            r0 = 7
            java.lang.Integer[] r0 = X.AnonymousClass00R.A00(r0)
            r40 = r0[r1]
            goto L_0x004c
        L_0x0089:
            int r0 = r2.A08()
            long r0 = (long) r0
            r18 = r0
            goto L_0x004c
        L_0x0091:
            int r0 = r2.A08()
            float r0 = (float) r0
            float r1 = X.C40171uH.A00()
            float r0 = r0 * r1
            int r0 = (int) r0
            r20 = r0
            goto L_0x004c
        L_0x009f:
            int r0 = r2.A08()
            float r0 = (float) r0
            float r1 = X.C40171uH.A00()
            float r0 = r0 * r1
            int r0 = (int) r0
            r21 = r0
            goto L_0x004c
        L_0x00ad:
            java.lang.String r0 = r2.A0D()
            int r54 = android.graphics.Color.parseColor(r0)
            goto L_0x004c
        L_0x00b6:
            X.1v7 r13 = X.C40271uR.A00(r0, r2)
            goto L_0x004c
        L_0x00bb:
            int r1 = r2.A08()
            r4 = 6
            java.lang.Integer[] r3 = X.AnonymousClass00R.A00(r4)
            int r3 = r3.length
            if (r1 < r3) goto L_0x00d6
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Unsupported matte type: "
            r3.append(r4)
            r3.append(r1)
            goto L_0x03f4
        L_0x00d6:
            java.lang.Integer[] r3 = X.AnonymousClass00R.A00(r4)
            r41 = r3[r1]
            int r1 = r41.intValue()
            if (r1 == r7) goto L_0x00f2
            r3 = 4
            if (r1 != r3) goto L_0x00ea
            java.lang.String r1 = "Unsupported matte type: Luma Inverted"
        L_0x00e7:
            r0.A02(r1)
        L_0x00ea:
            int r1 = r0.A03
            int r1 = r1 + 1
            r0.A03 = r1
            goto L_0x004c
        L_0x00f2:
            java.lang.String r1 = "Unsupported matte type: Luma"
            goto L_0x00e7
        L_0x00f5:
            r2.A0F()
        L_0x00f8:
            boolean r1 = r2.A0M()
            if (r1 == 0) goto L_0x01d3
            r2.A0G()
            r1 = 0
            r5 = r1
            r7 = r1
            r6 = 0
        L_0x0105:
            boolean r3 = r2.A0M()
            if (r3 == 0) goto L_0x01af
            java.lang.String r3 = r2.A0C()
            int r4 = r3.hashCode()
            switch(r4) {
                case 111: goto L_0x01a1;
                case 3588: goto L_0x0188;
                case 104433: goto L_0x017a;
                case 3357091: goto L_0x011a;
                default: goto L_0x0116;
            }
        L_0x0116:
            r2.A0K()
            goto L_0x0105
        L_0x011a:
            java.lang.String r4 = "mode"
            boolean r4 = r3.equals(r4)
            if (r4 == 0) goto L_0x0116
            java.lang.String r1 = r2.A0D()
            int r4 = r1.hashCode()
            switch(r4) {
                case 97: goto L_0x016f;
                case 105: goto L_0x015f;
                case 110: goto L_0x0154;
                case 115: goto L_0x0149;
                default: goto L_0x012d;
            }
        L_0x012d:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r4 = "Unknown mask mode "
            r1.append(r4)
            r1.append(r3)
            java.lang.String r3 = ". Defaulting to Add."
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            X.C196379ux.A00(r1)
            r1 = r32
            goto L_0x0105
        L_0x0149:
            java.lang.String r4 = "s"
            boolean r1 = r1.equals(r4)
            if (r1 == 0) goto L_0x012d
            java.lang.Integer r1 = X.AnonymousClass00R.A01
            goto L_0x0105
        L_0x0154:
            java.lang.String r4 = "n"
            boolean r1 = r1.equals(r4)
            if (r1 == 0) goto L_0x012d
            java.lang.Integer r1 = X.AnonymousClass00R.A0N
            goto L_0x0105
        L_0x015f:
            java.lang.String r4 = "i"
            boolean r1 = r1.equals(r4)
            if (r1 == 0) goto L_0x012d
            java.lang.String r1 = "Animation contains intersect masks. They are not supported but will be treated like add masks."
            r0.A02(r1)
            java.lang.Integer r1 = X.AnonymousClass00R.A0C
            goto L_0x0105
        L_0x016f:
            java.lang.String r4 = "a"
            boolean r1 = r1.equals(r4)
            if (r1 == 0) goto L_0x012d
            r1 = r32
            goto L_0x0105
        L_0x017a:
            java.lang.String r4 = "inv"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x0116
            boolean r6 = r2.A0N()
            goto L_0x0105
        L_0x0188:
            java.lang.String r4 = "pt"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x0116
            float r4 = X.C40171uH.A00()
            X.1vC r3 = X.C40741vC.A00
            java.util.ArrayList r3 = X.C40321uW.A00(r0, r3, r2, r4, r11)
            X.1vH r5 = new X.1vH
            r5.<init>(r3)
            goto L_0x0105
        L_0x01a1:
            java.lang.String r4 = "o"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x0116
            X.1us r7 = X.C40291uT.A02(r0, r2)
            goto L_0x0105
        L_0x01af:
            r2.A0I()
            X.CQx r3 = new X.CQx
            r3.<init>(r7, r5, r1, r6)
            r1 = r31
            r1.add(r3)
            goto L_0x00f8
        L_0x01be:
            r2.A0F()
        L_0x01c1:
            boolean r1 = r2.A0M()
            if (r1 == 0) goto L_0x01dc
            X.1v6 r3 = X.C40711v9.A02(r0, r2)
            if (r3 == 0) goto L_0x01c1
            r1 = r30
            r1.add(r3)
            goto L_0x01c1
        L_0x01d3:
            int r3 = r31.size()
            int r1 = r0.A03
            int r1 = r1 + r3
            r0.A03 = r1
        L_0x01dc:
            r2.A0H()
            goto L_0x004c
        L_0x01e1:
            r2.A0G()
        L_0x01e4:
            boolean r3 = r2.A0M()
            if (r3 == 0) goto L_0x028c
            X.1uB r3 = A02
            int r3 = r2.A09(r3)
            if (r3 == 0) goto L_0x0279
            if (r3 == r1) goto L_0x01fb
            r2.A0J()
            r2.A0K()
            goto L_0x01e4
        L_0x01fb:
            r2.A0F()
            boolean r3 = r2.A0M()
            if (r3 == 0) goto L_0x026a
            X.1uB r3 = X.AnonymousClass2WG.A00
            r2.A0G()
            r4 = 0
            r12 = r4
        L_0x020b:
            boolean r3 = r2.A0M()
            if (r3 == 0) goto L_0x0260
            X.1uB r3 = X.AnonymousClass2WG.A01
            int r3 = r2.A09(r3)
            if (r3 == 0) goto L_0x0220
            r2.A0J()
            r2.A0K()
            goto L_0x020b
        L_0x0220:
            r2.A0G()
            r5 = 0
            r10 = r4
            r9 = r4
            r8 = r4
        L_0x0227:
            boolean r3 = r2.A0M()
            if (r3 == 0) goto L_0x0257
            X.1uB r3 = X.AnonymousClass2WG.A00
            int r3 = r2.A09(r3)
            if (r3 == 0) goto L_0x0252
            if (r3 == r1) goto L_0x024d
            r6 = 2
            if (r3 == r6) goto L_0x0248
            if (r3 == r7) goto L_0x0243
            r2.A0J()
            r2.A0K()
            goto L_0x0227
        L_0x0243:
            X.1uu r8 = X.C40291uT.A01(r0, r2, r1)
            goto L_0x0227
        L_0x0248:
            X.1uu r9 = X.C40291uT.A01(r0, r2, r1)
            goto L_0x0227
        L_0x024d:
            X.1xP r10 = X.C40291uT.A00(r0, r2)
            goto L_0x0227
        L_0x0252:
            X.1xP r5 = X.C40291uT.A00(r0, r2)
            goto L_0x0227
        L_0x0257:
            r2.A0I()
            X.CQw r12 = new X.CQw
            r12.<init>(r5, r10, r9, r8)
            goto L_0x020b
        L_0x0260:
            r2.A0I()
            if (r12 != 0) goto L_0x026a
            X.CQw r12 = new X.CQw
            r12.<init>(r4, r4, r4, r4)
        L_0x026a:
            boolean r3 = r2.A0M()
            if (r3 == 0) goto L_0x0274
            r2.A0K()
            goto L_0x026a
        L_0x0274:
            r2.A0H()
            goto L_0x01e4
        L_0x0279:
            float r4 = X.C40171uH.A00()
            X.2w4 r3 = X.C65242w4.A00
            java.util.ArrayList r4 = X.C40321uW.A00(r0, r3, r2, r4, r11)
            X.BMz r28 = new X.BMz
            r3 = r28
            r3.<init>(r4)
            goto L_0x01e4
        L_0x028c:
            r2.A0I()
            goto L_0x004c
        L_0x0291:
            r2.A0F()
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
        L_0x0299:
            boolean r3 = r2.A0M()
            if (r3 == 0) goto L_0x03e4
            r2.A0G()
        L_0x02a2:
            boolean r3 = r2.A0M()
            if (r3 == 0) goto L_0x03df
            X.1uB r3 = A00
            int r3 = r2.A09(r3)
            if (r3 == 0) goto L_0x02c1
            if (r3 == r1) goto L_0x02b9
            r2.A0J()
            r2.A0K()
            goto L_0x02a2
        L_0x02b9:
            java.lang.String r3 = r2.A0D()
            r5.add(r3)
            goto L_0x02a2
        L_0x02c1:
            int r3 = r2.A08()
            r4 = 29
            if (r3 != r4) goto L_0x0327
            X.1uB r3 = X.AnonymousClass2WH.A00
            r38 = 0
        L_0x02cd:
            boolean r3 = r2.A0M()
            if (r3 == 0) goto L_0x02a2
            X.1uB r3 = X.AnonymousClass2WH.A00
            int r3 = r2.A09(r3)
            if (r3 == 0) goto L_0x02e2
            r2.A0J()
            r2.A0K()
            goto L_0x02cd
        L_0x02e2:
            r2.A0F()
        L_0x02e5:
            boolean r3 = r2.A0M()
            if (r3 == 0) goto L_0x0323
            r2.A0G()
            r3 = 0
        L_0x02ef:
            r6 = 0
        L_0x02f0:
            boolean r4 = r2.A0M()
            if (r4 == 0) goto L_0x031b
            X.1uB r4 = X.AnonymousClass2WH.A01
            int r4 = r2.A09(r4)
            if (r4 == 0) goto L_0x0313
            if (r4 == r1) goto L_0x0307
            r2.A0J()
        L_0x0303:
            r2.A0K()
            goto L_0x02f0
        L_0x0307:
            if (r6 == 0) goto L_0x0303
            X.1uu r4 = X.C40291uT.A01(r0, r2, r1)
            X.CIj r3 = new X.CIj
            r3.<init>(r4)
            goto L_0x02f0
        L_0x0313:
            int r4 = r2.A08()
            r6 = 1
            if (r4 == 0) goto L_0x02f0
            goto L_0x02ef
        L_0x031b:
            r2.A0I()
            if (r3 == 0) goto L_0x02e5
            r38 = r3
            goto L_0x02e5
        L_0x0323:
            r2.A0H()
            goto L_0x02cd
        L_0x0327:
            r4 = 25
            if (r3 != r4) goto L_0x02a2
            X.1uB r3 = X.AnonymousClass2WI.A00
            r66 = 0
            r68 = 0
            r69 = 0
            r67 = 0
            r70 = 0
        L_0x0337:
            boolean r3 = r2.A0M()
            if (r3 == 0) goto L_0x03c8
            X.1uB r3 = X.AnonymousClass2WI.A00
            int r3 = r2.A09(r3)
            if (r3 == 0) goto L_0x034c
            r2.A0J()
            r2.A0K()
            goto L_0x0337
        L_0x034c:
            r2.A0F()
        L_0x034f:
            boolean r3 = r2.A0M()
            if (r3 == 0) goto L_0x03c3
            r2.A0G()
            java.lang.String r3 = ""
        L_0x035a:
            boolean r4 = r2.A0M()
            if (r4 == 0) goto L_0x03bf
            X.1uB r4 = X.AnonymousClass2WI.A01
            int r4 = r2.A09(r4)
            if (r4 == 0) goto L_0x03ba
            if (r4 == r1) goto L_0x0371
            r2.A0J()
        L_0x036d:
            r2.A0K()
            goto L_0x035a
        L_0x0371:
            int r4 = r3.hashCode()
            switch(r4) {
                case 353103893: goto L_0x03ad;
                case 397447147: goto L_0x03a0;
                case 1041377119: goto L_0x0393;
                case 1379387491: goto L_0x0386;
                case 1383710113: goto L_0x0379;
                default: goto L_0x0378;
            }
        L_0x0378:
            goto L_0x036d
        L_0x0379:
            java.lang.String r4 = "Softness"
            boolean r4 = r3.equals(r4)
            if (r4 == 0) goto L_0x036d
            X.1uu r70 = X.C40291uT.A01(r0, r2, r1)
            goto L_0x035a
        L_0x0386:
            java.lang.String r4 = "Shadow Color"
            boolean r4 = r3.equals(r4)
            if (r4 == 0) goto L_0x036d
            X.1xP r66 = X.C40291uT.A00(r0, r2)
            goto L_0x035a
        L_0x0393:
            java.lang.String r4 = "Direction"
            boolean r4 = r3.equals(r4)
            if (r4 == 0) goto L_0x036d
            X.1uu r68 = X.C40291uT.A01(r0, r2, r11)
            goto L_0x035a
        L_0x03a0:
            java.lang.String r4 = "Opacity"
            boolean r4 = r3.equals(r4)
            if (r4 == 0) goto L_0x036d
            X.1uu r67 = X.C40291uT.A01(r0, r2, r11)
            goto L_0x035a
        L_0x03ad:
            java.lang.String r4 = "Distance"
            boolean r4 = r3.equals(r4)
            if (r4 == 0) goto L_0x036d
            X.1uu r69 = X.C40291uT.A01(r0, r2, r1)
            goto L_0x035a
        L_0x03ba:
            java.lang.String r3 = r2.A0D()
            goto L_0x035a
        L_0x03bf:
            r2.A0I()
            goto L_0x034f
        L_0x03c3:
            r2.A0H()
            goto L_0x0337
        L_0x03c8:
            if (r66 == 0) goto L_0x03db
            if (r67 == 0) goto L_0x03db
            if (r68 == 0) goto L_0x03db
            if (r69 == 0) goto L_0x03db
            if (r70 == 0) goto L_0x03db
            X.CS8 r39 = new X.CS8
            r65 = r39
            r65.<init>(r66, r67, r68, r69, r70)
            goto L_0x02a2
        L_0x03db:
            r39 = 0
            goto L_0x02a2
        L_0x03df:
            r2.A0I()
            goto L_0x0299
        L_0x03e4:
            r2.A0H()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r1 = "Lottie doesn't support layer effects. If you are using them for  fills, strokes, trim paths etc. then try adding them directly as contents  in your shape. Found: "
            r3.append(r1)
            r3.append(r5)
        L_0x03f4:
            java.lang.String r1 = r3.toString()
            r0.A02(r1)
            goto L_0x004c
        L_0x03fd:
            double r0 = r2.A07()
            float r3 = (float) r0
            r22 = r3
            goto L_0x004c
        L_0x0406:
            double r0 = r2.A07()
            float r3 = (float) r0
            r23 = r3
            goto L_0x004c
        L_0x040f:
            double r0 = r2.A07()
            float r3 = X.C40171uH.A00()
            double r3 = (double) r3
            double r0 = r0 * r3
            float r3 = (float) r0
            r24 = r3
            goto L_0x004c
        L_0x041e:
            double r0 = r2.A07()
            float r3 = X.C40171uH.A00()
            double r3 = (double) r3
            double r0 = r0 * r3
            float r3 = (float) r0
            r25 = r3
            goto L_0x004c
        L_0x042d:
            double r0 = r2.A07()
            float r15 = (float) r0
            goto L_0x004c
        L_0x0434:
            double r0 = r2.A07()
            float r14 = (float) r0
            goto L_0x004c
        L_0x043b:
            X.1uu r34 = X.C40291uT.A01(r0, r2, r11)
            goto L_0x004c
        L_0x0441:
            java.lang.String r26 = r2.A0D()
            goto L_0x004c
        L_0x0447:
            boolean r59 = r2.A0N()
            goto L_0x004c
        L_0x044d:
            int r0 = r2.A08()
            r27 = 0
            if (r0 != r1) goto L_0x004c
            r27 = 1
            goto L_0x004c
        L_0x0459:
            int r4 = r2.A08()
            r3 = 18
            java.lang.Integer[] r1 = X.AnonymousClass00R.A00(r3)
            int r1 = r1.length
            if (r4 < r1) goto L_0x047e
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r1 = "Unsupported Blend Mode: "
            r3.append(r1)
            r3.append(r4)
            java.lang.String r1 = r3.toString()
            r0.A02(r1)
            r42 = r32
            goto L_0x004c
        L_0x047e:
            java.lang.Integer[] r0 = X.AnonymousClass00R.A00(r3)
            r42 = r0[r4]
            goto L_0x004c
        L_0x0486:
            r2.A0I()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            int r2 = (r15 > r51 ? 1 : (r15 == r51 ? 0 : -1))
            if (r2 <= 0) goto L_0x04a6
            java.lang.Float r48 = java.lang.Float.valueOf(r15)
            r46 = 0
            X.1up r2 = new X.1up
            r45 = r2
            r47 = r0
            r50 = r49
            r45.<init>((android.view.animation.Interpolator) r46, (X.C39801tf) r47, (java.lang.Float) r48, (java.lang.Object) r49, (java.lang.Object) r50, (float) r51)
            r1.add(r2)
        L_0x04a6:
            int r2 = (r14 > r51 ? 1 : (r14 == r51 ? 0 : -1))
            if (r2 > 0) goto L_0x04ac
            float r14 = r0.A00
        L_0x04ac:
            r61 = 0
            java.lang.Float r63 = java.lang.Float.valueOf(r14)
            X.1up r2 = new X.1up
            r60 = r2
            r62 = r0
            r65 = r64
            r66 = r15
            r60.<init>((android.view.animation.Interpolator) r61, (X.C39801tf) r62, (java.lang.Float) r63, (java.lang.Object) r64, (java.lang.Object) r65, (float) r66)
            r1.add(r2)
            r2 = 2139095039(0x7f7fffff, float:3.4028235E38)
            java.lang.Float r5 = java.lang.Float.valueOf(r2)
            X.1up r2 = new X.1up
            r7 = r49
            r3 = r61
            r4 = r0
            r6 = r7
            r8 = r14
            r2.<init>((android.view.animation.Interpolator) r3, (X.C39801tf) r4, (java.lang.Float) r5, (java.lang.Object) r6, (java.lang.Object) r7, (float) r8)
            r1.add(r2)
            java.lang.String r3 = ".ai"
            r2 = r29
            boolean r2 = r2.endsWith(r3)
            if (r2 != 0) goto L_0x04ec
            java.lang.String r3 = "ai"
            r2 = r26
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x04f1
        L_0x04ec:
            java.lang.String r2 = "Convert your Illustrator layers to shape layers."
            r0.A02(r2)
        L_0x04f1:
            if (r27 == 0) goto L_0x04fd
            if (r13 != 0) goto L_0x04fa
            X.1v7 r13 = new X.1v7
            r13.<init>()
        L_0x04fa:
            r2 = 1
            r13.A00 = r2
        L_0x04fd:
            X.1vX r32 = new X.1vX
            r36 = r12
            r37 = r13
            r43 = r29
            r45 = r30
            r46 = r31
            r47 = r1
            r48 = r22
            r49 = r23
            r50 = r24
            r51 = r25
            r52 = r20
            r53 = r21
            r55 = r16
            r57 = r18
            r33 = r0
            r35 = r28
            r32.<init>(r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r57, r59)
            return r32
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C40231uN.A00(X.1tf, X.1tt):X.1vX");
    }
}
