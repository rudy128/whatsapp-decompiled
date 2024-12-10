package X;

import java.util.Iterator;

/* renamed from: X.9p6  reason: invalid class name and case insensitive filesystem */
public final class C192859p6 {
    public final C25931Qe A00;
    public final AnonymousClass00H A01;
    public final AnonymousClass00H A02;
    public final AnonymousClass00H A03;
    public final AnonymousClass00H A04;
    public final AnonymousClass00H A05;
    public final C18100vl A06 = AnonymousClass1DF.A01(new C21938Av2(this));
    public final C18100vl A07 = AnonymousClass1DF.A01(new C21939Av3(this));
    public final C18100vl A08 = AnonymousClass1DF.A01(new C21940Av4(this));
    public final C18100vl A09 = AnonymousClass1DF.A01(new C21941Av5(this));
    public final C19880zA A0A;
    public final AnonymousClass1SI A0B;
    public final C25491Ok A0C;
    public final C18030ve A0D;

    public final AnonymousClass8X1 A00(C195629te r8, AnonymousClass206 r9) {
        C138176we r5;
        String A0y;
        String str;
        Integer num;
        C18070vi.A0d(r9, 0);
        this.A00.A05(r9);
        int i = r9.A0u;
        C437020o r6 = (C437020o) ((AnonymousClass20Z) this.A09.getValue()).A00(i);
        AnonymousClass8X1 r2 = (AnonymousClass8X1) C166388co.DEFAULT_INSTANCE.A0N();
        AnonymousClass00H r3 = this.A03;
        r3.get();
        C18070vi.A0b(r2);
        C20106A7k.A03(r2, r9);
        r3.get();
        C18070vi.A0d(r2, 1);
        r2.A0H(C17880vN.A04(r9.A0I));
        r3.get();
        C20106A7k.A04(r2, r9);
        if (!r9.A11(134217728) || r8.A02) {
            try {
                r6.BDZ(r8, r2, r9);
                int i2 = ((C166388co) r2.A00).bitField0_;
                if ((i2 & 2) == 0 && (i2 & 16384) == 0) {
                    boolean z = r9 instanceof C436420i;
                    StringBuilder A11 = AnonymousClass000.A11("type=");
                    if (z) {
                        A11.append(i);
                        A11.append(", action=");
                        i = ((C436420i) r9).A00;
                    }
                    String A0t = C17880vN.A0t(A11, i);
                    C138176we r32 = (C138176we) this.A05.get();
                    String A0y2 = AnonymousClass000.A0y("-serialization-invalid", AnonymousClass000.A11(A0t));
                    C18070vi.A0d(A0y2, 0);
                    C138176we.A00(r32, A0y2, "fmessage-history-sync-serialization-invalid", A0t, new C22029AwV(r32, A0t));
                    throw AnonymousClass8BW.A0S(0);
                }
                Iterator A0m = AnonymousClass8BX.A0m(this.A04);
                while (A0m.hasNext()) {
                    ((C22511BAs) A0m.next()).C1A(r8, r2, r9);
                }
            } catch (Exception e) {
                boolean z2 = r9 instanceof C436420i;
                StringBuilder A112 = AnonymousClass000.A11("type=");
                if (z2) {
                    A112.append(i);
                    A112.append(", action=");
                    i = ((C436420i) r9).A00;
                }
                String A0t2 = C17880vN.A0t(A112, i);
                if (!(e instanceof AnonymousClass1T8) || (num = ((AnonymousClass1T8) e).e2eFailureReason) == null || num.intValue() != 69) {
                    String A0y3 = AnonymousClass000.A0y("-serialization-failure", AnonymousClass000.A11(A0t2));
                    r5 = (C138176we) this.A05.get();
                    A0y = AnonymousClass000.A0y("-serialization-failed", AnonymousClass000.A11(A0y3));
                    A0t2 = AnonymousClass001.A1E(e, ", ", AnonymousClass000.A11(A0t2));
                    str = "fmessage-history-sync-serialization-failed";
                } else {
                    A0y = AnonymousClass000.A0y("-serialization-not-supported", AnonymousClass000.A11(A0t2));
                    r5 = (C138176we) this.A05.get();
                    str = "fmessage-history-sync-serialization-not-supported";
                }
                C18070vi.A0d(A0y, 0);
                C138176we.A00(r5, A0y, str, A0t2, new C22036Awc(r5, str, A0t2, e));
                throw e;
            }
        } else {
            r3.get();
            r2.A0I(C179859Ke.A1q);
        }
        C19880zA r1 = this.A0A;
        if (!r1.A07()) {
            return r2;
        }
        r1.A03();
        throw AnonymousClass000.A0s("traceOutgoing");
    }

    public C192859p6(C19880zA r2, AnonymousClass1SI r3, C25491Ok r4, C18030ve r5, C25931Qe r6, AnonymousClass00H r7, AnonymousClass00H r8, AnonymousClass00H r9, AnonymousClass00H r10, AnonymousClass00H r11) {
        C18070vi.A0w(r5, r7, r8, r2, r4);
        C18070vi.A0x(r9, r6, r3, r10, r11);
        this.A0D = r5;
        this.A04 = r7;
        this.A01 = r8;
        this.A0A = r2;
        this.A0C = r4;
        this.A05 = r9;
        this.A00 = r6;
        this.A0B = r3;
        this.A03 = r10;
        this.A02 = r11;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: X.B87} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: X.BAt} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v20, resolved type: X.2Mh} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v22, resolved type: X.20i} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v26, resolved type: X.20i} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v28, resolved type: X.20i} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v38, resolved type: X.20i} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v41, resolved type: X.2Mh} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v0, resolved type: X.2Mg} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v50, resolved type: X.2Mh} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v52, resolved type: X.20i} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v70, resolved type: X.2MQ} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v77, resolved type: X.20i} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v99, resolved type: X.20i} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v103, resolved type: X.20i} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v107, resolved type: X.20i} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v115, resolved type: X.2Mh} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v123, resolved type: X.2Mh} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v132, resolved type: X.2Mh} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v135, resolved type: X.2Mh} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v137, resolved type: X.2Mh} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v160, resolved type: X.2Mh} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v164, resolved type: X.2Mh} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v171, resolved type: X.2Mh} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v255, resolved type: X.98B} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v256, resolved type: X.98B} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v257, resolved type: X.98B} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v258, resolved type: X.98B} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v283, resolved type: X.2Mh} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v285, resolved type: X.2Mh} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v291, resolved type: X.2Mh} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v296, resolved type: X.2Mh} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v299, resolved type: X.20i} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v339, resolved type: X.2Mh} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v349, resolved type: X.20i} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v354, resolved type: X.2Mg} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v170, resolved type: X.B87} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v171, resolved type: X.B87} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v444, resolved type: X.2Mg} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v445, resolved type: X.2Mg} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v446, resolved type: X.2Mg} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v447, resolved type: X.2Mg} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v448, resolved type: X.2Mg} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v450, resolved type: X.2Mg} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v451, resolved type: X.20i} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v452, resolved type: X.2Mg} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v455, resolved type: X.2Mg} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v456, resolved type: X.2Mg} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v457, resolved type: X.2Mg} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v458, resolved type: X.2Mh} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v459, resolved type: X.2Mg} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v460, resolved type: X.2Mg} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v461, resolved type: X.2Mg} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v462, resolved type: X.2Mg} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v463, resolved type: X.2Mg} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v464, resolved type: X.2Mg} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v29, resolved type: X.2MQ} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v465, resolved type: X.2Mg} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v30, resolved type: X.2MQ} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v466, resolved type: X.2Mg} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v468, resolved type: X.20i} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v469, resolved type: X.2Mg} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v470, resolved type: X.2Mg} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v471, resolved type: X.2Mh} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v472, resolved type: X.2Mh} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v475, resolved type: X.20i} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v477, resolved type: X.2Mg} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v478, resolved type: X.2Mg} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v479, resolved type: X.2Mg} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v480, resolved type: X.2Mg} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v481, resolved type: X.2Mg} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v482, resolved type: X.2Mg} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v483, resolved type: X.2Mg} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v484, resolved type: X.2Mg} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v485, resolved type: X.2Mg} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v486, resolved type: X.2Mg} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v487, resolved type: X.2Mg} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v488, resolved type: X.2Mg} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v489, resolved type: X.2Mh} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v490, resolved type: X.2Mh} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v491, resolved type: X.2Mg} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v492, resolved type: X.2Mg} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v493, resolved type: X.2Mh} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v494, resolved type: X.2Mg} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v495, resolved type: X.2Mh} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v496, resolved type: X.2Mg} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v497, resolved type: X.2Mg} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v498, resolved type: X.2Mg} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v31, resolved type: X.2Mg} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v32, resolved type: X.2Mg} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v33, resolved type: X.2Mg} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v499, resolved type: X.2Mh} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v34, resolved type: X.2Mg} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v500, resolved type: X.2Mh} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v501, resolved type: X.2Mg} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v502, resolved type: X.2Mg} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v503, resolved type: X.2Mg} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v504, resolved type: X.2Mh} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v505, resolved type: X.2Mg} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v506, resolved type: X.2Mg} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v507, resolved type: X.2Mg} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v35, resolved type: X.2Mg} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v36, resolved type: X.2Mg} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v508, resolved type: X.2Mg} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v509, resolved type: X.2Mg} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v510, resolved type: X.2Mg} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v512, resolved type: X.2Mg} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v37, resolved type: X.2Mg} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v38, resolved type: X.2Mg} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v513, resolved type: X.2Mg} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v514, resolved type: X.2Mg} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v39, resolved type: X.2Mg} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v522, resolved type: X.2Mg} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v523, resolved type: X.2Mg} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v524, resolved type: X.2Mg} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v525, resolved type: X.2Mg} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v526, resolved type: X.2Mg} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v527, resolved type: X.2Mg} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v528, resolved type: X.2Mg} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v529, resolved type: X.2Mh} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v530, resolved type: X.2Mb} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v531, resolved type: X.2Mg} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v532, resolved type: X.2Mg} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v533, resolved type: X.2Mh} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v534, resolved type: X.2Mg} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v535, resolved type: X.2Mh} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v536, resolved type: X.2Mh} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v537, resolved type: X.2Mh} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v538, resolved type: X.2Mg} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v539, resolved type: X.2Mh} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v540, resolved type: X.2Mg} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v541, resolved type: X.2Mh} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v542, resolved type: X.2Mh} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v543, resolved type: X.2Mh} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v544, resolved type: X.2Mh} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v545, resolved type: X.2Mg} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v546, resolved type: X.2Mh} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v547, resolved type: X.2Mg} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v548, resolved type: X.2Mg} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v549, resolved type: X.2Mg} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v550, resolved type: X.20i} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v551, resolved type: X.2Mh} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v552, resolved type: X.2Mh} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v553, resolved type: X.2Mh} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v554, resolved type: X.2Mh} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v555, resolved type: X.2Mh} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v556, resolved type: X.2Mh} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v558, resolved type: X.2Mh} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v560, resolved type: X.2Mg} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v561, resolved type: X.2Mg} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v563, resolved type: X.2Mg} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v564, resolved type: X.2Mh} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v565, resolved type: X.2Mg} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v566, resolved type: X.20i} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v567, resolved type: X.2Mg} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v568, resolved type: X.2Mg} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v569, resolved type: X.20i} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v570, resolved type: X.2Mg} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v571, resolved type: X.2Mg} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v572, resolved type: X.2Mg} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v573, resolved type: X.2Mg} */
    /* JADX WARNING: type inference failed for: r0v54 */
    /* JADX WARNING: type inference failed for: r1v32, types: [X.2ME] */
    /* JADX WARNING: type inference failed for: r1v36, types: [X.97o, X.20i, X.206] */
    /* JADX WARNING: type inference failed for: r1v43, types: [X.2MM, X.20i] */
    /* JADX WARNING: type inference failed for: r1v48, types: [X.20i, X.2MC] */
    /* JADX WARNING: type inference failed for: r1v73, types: [X.2MJ, X.20i] */
    /* JADX WARNING: type inference failed for: r1v79, types: [X.97p, X.20i, X.206] */
    /* JADX WARNING: type inference failed for: r1v86, types: [X.20i, X.2MA] */
    /* JADX WARNING: type inference failed for: r1v88, types: [X.2Mh, X.2MS] */
    /* JADX WARNING: type inference failed for: r1v90, types: [X.2M9, X.20i, X.206] */
    /* JADX WARNING: type inference failed for: r1v93, types: [X.20i, X.2MD] */
    /* JADX WARNING: type inference failed for: r1v95, types: [X.20i, X.2MD] */
    /* JADX WARNING: type inference failed for: r1v97, types: [X.20i, X.2MB] */
    /* JADX WARNING: type inference failed for: r1v105, types: [X.2MI, X.20i] */
    /* JADX WARNING: type inference failed for: r1v113, types: [X.98A, X.2Mh, X.206] */
    /* JADX WARNING: type inference failed for: r1v142, types: [X.2Mh, X.206] */
    /* JADX WARNING: type inference failed for: r1v150, types: [X.2MP, X.20i, X.206] */
    /* JADX WARNING: type inference failed for: r4v48, types: [com.whatsapp.data.ProfilePhotoChange, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r3v89, types: [com.whatsapp.jid.Jid] */
    /* JADX WARNING: type inference failed for: r1v179, types: [X.983, X.2Mf, X.206] */
    /* JADX WARNING: type inference failed for: r1v185, types: [X.983, X.2Mf, X.206] */
    /* JADX WARNING: type inference failed for: r1v187, types: [X.983, X.2Mf] */
    /* JADX WARNING: type inference failed for: r1v195, types: [X.984, X.2Mf, X.206] */
    /* JADX WARNING: type inference failed for: r6v53, types: [com.whatsapp.jid.Jid] */
    /* JADX WARNING: type inference failed for: r11v6, types: [com.whatsapp.jid.Jid] */
    /* JADX WARNING: type inference failed for: r1v229, types: [X.2Mh, X.2MW] */
    /* JADX WARNING: type inference failed for: r1v235, types: [X.2Mf, X.97v] */
    /* JADX WARNING: type inference failed for: r1v236, types: [X.2Mf, X.97x] */
    /* JADX WARNING: type inference failed for: r1v237, types: [X.2Mf, X.97y] */
    /* JADX WARNING: type inference failed for: r1v238, types: [X.980, X.2Mf] */
    /* JADX WARNING: type inference failed for: r1v239, types: [X.981, X.2Mf] */
    /* JADX WARNING: type inference failed for: r1v240, types: [X.2Mf, X.97z] */
    /* JADX WARNING: type inference failed for: r1v241, types: [X.2Mf, X.97w] */
    /* JADX WARNING: type inference failed for: r1v246, types: [X.2MU, X.2Mh, X.206] */
    /* JADX WARNING: type inference failed for: r1v263, types: [X.2Me, X.206] */
    /* JADX WARNING: type inference failed for: r4v56, types: [com.whatsapp.jid.Jid] */
    /* JADX WARNING: type inference failed for: r1v267, types: [X.206, X.2Mc] */
    /* JADX WARNING: type inference failed for: r3v97, types: [com.whatsapp.jid.Jid] */
    /* JADX WARNING: type inference failed for: r1v284, types: [X.2MN, X.20i] */
    /* JADX WARNING: type inference failed for: r1v292, types: [X.2MN, X.20i] */
    /* JADX WARNING: type inference failed for: r1v298, types: [X.2ML, X.20i] */
    /* JADX WARNING: type inference failed for: r1v319, types: [X.2Mh, X.2MX] */
    /* JADX WARNING: type inference failed for: r1v320, types: [X.2Mh, X.2MW, X.206] */
    /* JADX WARNING: type inference failed for: r1v346, types: [X.2Mh, X.2MT, X.206] */
    /* JADX WARNING: type inference failed for: r1v347, types: [X.989, X.2Mh] */
    /* JADX WARNING: type inference failed for: r1v351, types: [X.20i, X.2MG] */
    /* JADX WARNING: type inference failed for: r1v353, types: [X.2MO, X.20i] */
    /* JADX WARNING: type inference failed for: r1v357, types: [X.97q, X.20i] */
    /* JADX WARNING: type inference failed for: r0v653, types: [X.9HC, X.9Ge] */
    /* JADX WARNING: type inference failed for: r0v660, types: [X.97S, X.9Fy] */
    /* JADX WARNING: type inference failed for: r1v449 */
    /* JADX WARNING: type inference failed for: r1v453 */
    /* JADX WARNING: type inference failed for: r1v454 */
    /* JADX WARNING: type inference failed for: r14v40, types: [X.2Mg] */
    /* JADX WARNING: type inference failed for: r14v41, types: [X.2Mg] */
    /* JADX WARNING: type inference failed for: r14v42, types: [X.2Mg] */
    /* JADX WARNING: type inference failed for: r14v43, types: [X.2Mg] */
    /* JADX WARNING: type inference failed for: r14v44, types: [X.2Mg] */
    /* JADX WARNING: type inference failed for: r0v726 */
    /* JADX WARNING: type inference failed for: r0v727 */
    /* JADX WARNING: type inference failed for: r0v728 */
    /* JADX WARNING: type inference failed for: r0v729 */
    /* JADX WARNING: type inference failed for: r0v730 */
    /* JADX WARNING: type inference failed for: r0v731 */
    /* JADX WARNING: type inference failed for: r0v732 */
    /* JADX WARNING: type inference failed for: r0v733 */
    /* JADX WARNING: type inference failed for: r0v734 */
    /* JADX WARNING: type inference failed for: r0v735 */
    /* JADX WARNING: type inference failed for: r0v736 */
    /* JADX WARNING: type inference failed for: r0v737 */
    /* JADX WARNING: type inference failed for: r0v738 */
    /* JADX WARNING: type inference failed for: r0v739 */
    /* JADX WARNING: type inference failed for: r0v740 */
    /* JADX WARNING: type inference failed for: r0v741 */
    /* JADX WARNING: type inference failed for: r0v742 */
    /* JADX WARNING: type inference failed for: r0v743 */
    /* JADX WARNING: type inference failed for: r0v744 */
    /* JADX WARNING: type inference failed for: r0v745 */
    /* JADX WARNING: type inference failed for: r0v746 */
    /* JADX WARNING: type inference failed for: r0v747 */
    /* JADX WARNING: type inference failed for: r0v748 */
    /* JADX WARNING: type inference failed for: r0v749 */
    /* JADX WARNING: type inference failed for: r0v750 */
    /* JADX WARNING: type inference failed for: r0v751 */
    /* JADX WARNING: type inference failed for: r0v752 */
    /* JADX WARNING: type inference failed for: r0v753 */
    /* JADX WARNING: type inference failed for: r0v754 */
    /* JADX WARNING: type inference failed for: r0v755 */
    /* JADX WARNING: type inference failed for: r0v756 */
    /* JADX WARNING: type inference failed for: r0v757 */
    /* JADX WARNING: type inference failed for: r0v758 */
    /* JADX WARNING: type inference failed for: r0v759 */
    /* JADX WARNING: type inference failed for: r0v760 */
    /* JADX WARNING: type inference failed for: r0v761 */
    /* JADX WARNING: type inference failed for: r0v762 */
    /* JADX WARNING: type inference failed for: r0v763 */
    /* JADX WARNING: type inference failed for: r0v764 */
    /* JADX WARNING: type inference failed for: r0v765 */
    /* JADX WARNING: type inference failed for: r0v766 */
    /* JADX WARNING: type inference failed for: r0v767 */
    /* JADX WARNING: type inference failed for: r0v768 */
    /* JADX WARNING: type inference failed for: r0v769 */
    /* JADX WARNING: type inference failed for: r0v770 */
    /* JADX WARNING: type inference failed for: r0v771 */
    /* JADX WARNING: type inference failed for: r0v772 */
    /* JADX WARNING: type inference failed for: r0v773 */
    /* JADX WARNING: type inference failed for: r0v774 */
    /* JADX WARNING: type inference failed for: r0v775 */
    /* JADX WARNING: type inference failed for: r0v776 */
    /* JADX WARNING: type inference failed for: r0v777 */
    /* JADX WARNING: type inference failed for: r0v778 */
    /* JADX WARNING: type inference failed for: r0v779 */
    /* JADX WARNING: type inference failed for: r14v48, types: [X.8tj] */
    /* JADX WARNING: type inference failed for: r14v49, types: [X.8tk] */
    /* JADX WARNING: type inference failed for: r0v780 */
    /* JADX WARNING: type inference failed for: r0v781 */
    /* JADX WARNING: type inference failed for: r0v782 */
    /* JADX WARNING: type inference failed for: r0v783 */
    /* JADX WARNING: type inference failed for: r0v784 */
    /* JADX WARNING: type inference failed for: r0v785 */
    /* JADX WARNING: type inference failed for: r0v786 */
    /* JADX WARNING: type inference failed for: r0v787 */
    /* JADX WARNING: type inference failed for: r0v788 */
    /* JADX WARNING: type inference failed for: r0v789 */
    /* JADX WARNING: type inference failed for: r0v790 */
    /* JADX WARNING: type inference failed for: r0v791 */
    /* JADX WARNING: type inference failed for: r0v792 */
    /* JADX WARNING: type inference failed for: r0v793 */
    /* JADX WARNING: type inference failed for: r0v794 */
    /* JADX WARNING: type inference failed for: r0v795 */
    /* JADX WARNING: type inference failed for: r0v796 */
    /* JADX WARNING: type inference failed for: r0v797 */
    /* JADX WARNING: type inference failed for: r0v798 */
    /* JADX WARNING: type inference failed for: r0v799 */
    /* JADX WARNING: type inference failed for: r14v50, types: [X.9H0] */
    /* JADX WARNING: type inference failed for: r0v800 */
    /* JADX WARNING: type inference failed for: r0v801 */
    /* JADX WARNING: type inference failed for: r0v802 */
    /* JADX WARNING: type inference failed for: r0v803 */
    /* JADX WARNING: type inference failed for: r0v804 */
    /* JADX WARNING: type inference failed for: r0v805 */
    /* JADX WARNING: type inference failed for: r0v806 */
    /* JADX WARNING: Code restructure failed: missing block: B:1141:0x0020, code lost:
        continue;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:312:0x08f7, code lost:
        r1.A0d(r0);
        r1 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:398:0x0b1d, code lost:
        if (r4 == null) goto L_0x0b1f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:400:0x0b23, code lost:
        X.C17960vV.A0D(r0);
        r1 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:401:0x0b26, code lost:
        r1.A0d(r4);
        r1 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:434:0x0c12, code lost:
        if (r4 == null) goto L_0x0c14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:647:0x10bf, code lost:
        if (r3 == false) goto L_0x04ab;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:765:0x1340, code lost:
        r1.A0m(r3);
        r1 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:880:0x15b0, code lost:
        r1 = new X.C436420i(r3, r6, r4);
        r1 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:881:0x15b9, code lost:
        if (X.AnonymousClass8BR.A03(r2) <= 0) goto L_0x04ab;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:882:0x15bb, code lost:
        r0 = X.AnonymousClass3MX.A0l(X.C20108A7n.A0A(r2));
        r1 = r1;
        r1 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:883:0x15c3, code lost:
        if (r0 == null) goto L_0x04ab;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:884:0x15c5, code lost:
        r1.A0d(r0);
        r1 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:923:0x1650, code lost:
        r1.A18(r4);
        r1 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:934:0x1683, code lost:
        r1.A01 = r3;
        r1 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:959:0x1708, code lost:
        r1.A01 = r5;
        r1 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:961:0x1710, code lost:
        r1.A18(r4);
        r1 = r1;
     */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:824:0x146d  */
    /* JADX WARNING: Removed duplicated region for block: B:971:0x1757  */
    /* JADX WARNING: Unknown variable types count: 6 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.AnonymousClass206 A01(X.C193069pU r25, X.C166388co r26) {
        /*
            r24 = this;
            r0 = 0
            r2 = r26
            X.C18070vi.A0d(r2, r0)
            r7 = r24
            X.0zA r1 = r7.A0A
            boolean r0 = r1.A07()
            if (r0 == 0) goto L_0x001a
            r1.A03()
            java.lang.String r0 = "traceIncoming"
            java.lang.NullPointerException r0 = X.AnonymousClass000.A0s(r0)
            throw r0
        L_0x001a:
            X.0vl r0 = r7.A06
            java.util.Iterator r9 = X.AnonymousClass8BW.A0s(r0)
        L_0x0020:
            boolean r0 = r9.hasNext()
            r23 = r25
            if (r0 == 0) goto L_0x03e6
            java.lang.Object r12 = r9.next()
            X.9qk r12 = (X.C193839qk) r12
            X.AUJ r13 = r12.A01
            int r0 = r2.bitField0_
            r0 = r0 & 16384(0x4000, float:2.2959E-41)
            if (r0 == 0) goto L_0x0020
            r5 = 0
            X.9Ke r6 = r2.A0R()
            X.00H r0 = r13.A01
            java.lang.Object r0 = r0.get()
            X.17t r0 = (X.C218817t) r0
            X.C18070vi.A0b(r6)
            int r1 = r6.ordinal()
            switch(r1) {
                case 4: goto L_0x0281;
                case 5: goto L_0x0281;
                case 6: goto L_0x0281;
                case 7: goto L_0x0281;
                case 8: goto L_0x0281;
                case 9: goto L_0x004d;
                case 10: goto L_0x004d;
                case 11: goto L_0x004d;
                case 12: goto L_0x004d;
                case 13: goto L_0x004d;
                case 14: goto L_0x004d;
                case 15: goto L_0x004d;
                case 16: goto L_0x0281;
                case 17: goto L_0x0281;
                case 18: goto L_0x0281;
                case 19: goto L_0x004d;
                case 20: goto L_0x0463;
                case 21: goto L_0x0372;
                case 22: goto L_0x032d;
                case 23: goto L_0x038a;
                case 24: goto L_0x031e;
                case 25: goto L_0x0315;
                case 26: goto L_0x02f4;
                case 27: goto L_0x0367;
                case 28: goto L_0x03dd;
                case 29: goto L_0x03b7;
                case 30: goto L_0x03ae;
                case 31: goto L_0x03c9;
                case 32: goto L_0x03c0;
                case 33: goto L_0x0341;
                case 34: goto L_0x037b;
                case 35: goto L_0x0367;
                case 36: goto L_0x03dd;
                case 37: goto L_0x004d;
                case 38: goto L_0x035e;
                case 39: goto L_0x02a5;
                case 40: goto L_0x004d;
                case 41: goto L_0x004d;
                case 42: goto L_0x0336;
                case 43: goto L_0x03d4;
                case 44: goto L_0x02eb;
                case 45: goto L_0x004d;
                case 46: goto L_0x004d;
                case 47: goto L_0x004d;
                case 48: goto L_0x004d;
                case 49: goto L_0x004d;
                case 50: goto L_0x004d;
                case 51: goto L_0x004d;
                case 52: goto L_0x004d;
                case 53: goto L_0x004d;
                case 54: goto L_0x023e;
                case 55: goto L_0x023e;
                case 56: goto L_0x023e;
                case 57: goto L_0x004d;
                case 58: goto L_0x004d;
                case 59: goto L_0x004d;
                case 60: goto L_0x0281;
                case 61: goto L_0x0281;
                case 62: goto L_0x004d;
                case 63: goto L_0x004d;
                case 64: goto L_0x0281;
                case 65: goto L_0x0281;
                case 66: goto L_0x004d;
                case 67: goto L_0x004d;
                case 68: goto L_0x004d;
                case 69: goto L_0x02be;
                case 70: goto L_0x0293;
                case 71: goto L_0x028a;
                case 72: goto L_0x025d;
                case 73: goto L_0x0355;
                case 74: goto L_0x004d;
                case 75: goto L_0x026f;
                case 76: goto L_0x0278;
                case 77: goto L_0x0278;
                case 78: goto L_0x0278;
                case 79: goto L_0x02a5;
                case 80: goto L_0x0278;
                case 81: goto L_0x02a5;
                case 82: goto L_0x0278;
                case 83: goto L_0x0278;
                case 84: goto L_0x02a5;
                case 85: goto L_0x0278;
                case 86: goto L_0x02a5;
                case 87: goto L_0x0278;
                case 88: goto L_0x0278;
                case 89: goto L_0x0278;
                case 90: goto L_0x0278;
                case 91: goto L_0x0278;
                case 92: goto L_0x0278;
                case 93: goto L_0x0278;
                case 94: goto L_0x02a5;
                case 95: goto L_0x0278;
                case 96: goto L_0x02a5;
                case 97: goto L_0x0278;
                case 98: goto L_0x0278;
                case 99: goto L_0x0281;
                case 100: goto L_0x0281;
                case 101: goto L_0x0278;
                case 102: goto L_0x0278;
                case 103: goto L_0x0278;
                case 104: goto L_0x0278;
                case 105: goto L_0x0278;
                case 106: goto L_0x0278;
                case 107: goto L_0x0278;
                case 108: goto L_0x0278;
                case 109: goto L_0x0278;
                case 110: goto L_0x0278;
                case 111: goto L_0x0278;
                case 112: goto L_0x0278;
                case 113: goto L_0x0278;
                case 114: goto L_0x0278;
                case 115: goto L_0x0278;
                case 116: goto L_0x0278;
                case 117: goto L_0x0278;
                case 118: goto L_0x0266;
                case 119: goto L_0x004d;
                case 120: goto L_0x004d;
                case 121: goto L_0x004d;
                case 122: goto L_0x02c7;
                case 123: goto L_0x0254;
                case 124: goto L_0x004d;
                case 125: goto L_0x004d;
                case 126: goto L_0x02a5;
                case 127: goto L_0x02a5;
                case 128: goto L_0x026f;
                case 129: goto L_0x026f;
                case 130: goto L_0x0249;
                case 131: goto L_0x034c;
                case 132: goto L_0x004d;
                case 133: goto L_0x0235;
                case 134: goto L_0x020e;
                case 135: goto L_0x01ed;
                case 136: goto L_0x01d5;
                case 137: goto L_0x01f5;
                case 138: goto L_0x01e5;
                case 139: goto L_0x01cd;
                case 140: goto L_0x004d;
                case 141: goto L_0x0227;
                case 142: goto L_0x011c;
                case 143: goto L_0x0170;
                case 144: goto L_0x02d0;
                case 145: goto L_0x02d9;
                case 146: goto L_0x0151;
                case 147: goto L_0x03a5;
                case 148: goto L_0x039c;
                case 149: goto L_0x01b9;
                case 150: goto L_0x02e2;
                case 151: goto L_0x01a0;
                case 152: goto L_0x0167;
                case 153: goto L_0x004d;
                case 154: goto L_0x015e;
                case 155: goto L_0x004d;
                case 156: goto L_0x004d;
                case 157: goto L_0x0146;
                case 158: goto L_0x01c4;
                case 159: goto L_0x0187;
                case 160: goto L_0x004d;
                case 161: goto L_0x0179;
                case 162: goto L_0x0132;
                case 163: goto L_0x011c;
                case 164: goto L_0x011c;
                case 165: goto L_0x011c;
                case 166: goto L_0x011c;
                case 167: goto L_0x011c;
                case 168: goto L_0x011c;
                case 169: goto L_0x004d;
                case 170: goto L_0x004d;
                case 171: goto L_0x0104;
                case 172: goto L_0x00fb;
                case 173: goto L_0x010d;
                case 174: goto L_0x00c1;
                case 175: goto L_0x00b8;
                case 176: goto L_0x00e7;
                case 177: goto L_0x00f2;
                case 178: goto L_0x00d3;
                case 179: goto L_0x00d3;
                case 180: goto L_0x00d3;
                case 181: goto L_0x00ca;
                case 182: goto L_0x00dc;
                case 183: goto L_0x009f;
                case 184: goto L_0x004d;
                case 185: goto L_0x011c;
                case 186: goto L_0x0094;
                case 187: goto L_0x004d;
                case 188: goto L_0x006f;
                case 189: goto L_0x0087;
                case 190: goto L_0x0064;
                case 191: goto L_0x029c;
                case 192: goto L_0x013b;
                case 193: goto L_0x02a5;
                case 194: goto L_0x026f;
                case 195: goto L_0x005b;
                case 196: goto L_0x029c;
                case 197: goto L_0x0129;
                case 198: goto L_0x004d;
                case 199: goto L_0x004d;
                case 200: goto L_0x02a5;
                case 201: goto L_0x026f;
                case 202: goto L_0x004e;
                case 203: goto L_0x01dd;
                case 204: goto L_0x030a;
                case 205: goto L_0x02ff;
                case 206: goto L_0x0393;
                case 207: goto L_0x007c;
                case 208: goto L_0x02a5;
                default: goto L_0x004d;
            }
        L_0x004d:
            goto L_0x0020
        L_0x004e:
            X.190 r4 = r0.A01
            X.1CJ r3 = r0.A0G
            X.1PQ r1 = r0.A0N
            X.9H8 r0 = new X.9H8
            r0.<init>(r4, r3, r5, r1)
            goto L_0x046a
        L_0x005b:
            X.190 r1 = r0.A01
            X.9H2 r0 = new X.9H2
            r0.<init>(r1, r5)
            goto L_0x046a
        L_0x0064:
            X.190 r3 = r0.A01
            X.1PQ r1 = r0.A0N
            X.9H4 r0 = new X.9H4
            r0.<init>(r3, r5, r1)
            goto L_0x046a
        L_0x006f:
            X.190 r4 = r0.A01
            X.1PQ r3 = r0.A0N
            X.1CJ r1 = r0.A0G
            X.9H6 r0 = new X.9H6
            r0.<init>(r4, r1, r5, r3)
            goto L_0x046a
        L_0x007c:
            X.190 r3 = r0.A01
            X.1PQ r1 = r0.A0N
            X.9H3 r0 = new X.9H3
            r0.<init>(r3, r5, r1)
            goto L_0x046a
        L_0x0087:
            X.190 r4 = r0.A01
            X.1PQ r3 = r0.A0N
            X.1CJ r1 = r0.A0G
            X.9H7 r0 = new X.9H7
            r0.<init>(r4, r1, r5, r3)
            goto L_0x046a
        L_0x0094:
            X.190 r1 = X.AnonymousClass8BT.A09(r0)
            X.9HE r0 = new X.9HE
            r0.<init>(r1, r5)
            goto L_0x046a
        L_0x009f:
            X.190 r8 = r0.A01
            X.1CJ r4 = r0.A0G
            X.1MZ r3 = r0.A0H
            X.1PQ r1 = r0.A0N
            X.9H0 r0 = new X.9H0
            r14 = r0
            r15 = r8
            r16 = r4
            r17 = r3
            r18 = r5
            r19 = r1
            r14.<init>(r15, r16, r17, r18, r19)
            goto L_0x046a
        L_0x00b8:
            X.190 r1 = r0.A01
            X.9GY r0 = new X.9GY
            r0.<init>(r1, r5)
            goto L_0x046a
        L_0x00c1:
            X.190 r1 = r0.A01
            X.9GZ r0 = new X.9GZ
            r0.<init>(r1, r5)
            goto L_0x046a
        L_0x00ca:
            X.190 r1 = r0.A01
            X.9GW r0 = new X.9GW
            r0.<init>(r1, r5)
            goto L_0x046a
        L_0x00d3:
            X.190 r1 = r0.A01
            X.9Ga r0 = new X.9Ga
            r0.<init>(r1, r5)
            goto L_0x046a
        L_0x00dc:
            X.190 r3 = r0.A01
            X.1MZ r1 = r0.A0H
            X.9H5 r0 = new X.9H5
            r0.<init>(r3, r1, r5)
            goto L_0x046a
        L_0x00e7:
            X.190 r1 = X.AnonymousClass8BT.A09(r0)
            X.9HD r0 = new X.9HD
            r0.<init>(r1, r5)
            goto L_0x046a
        L_0x00f2:
            X.190 r1 = r0.A01
            X.9Gb r0 = new X.9Gb
            r0.<init>(r1, r5)
            goto L_0x046a
        L_0x00fb:
            X.190 r1 = r0.A01
            X.9GX r0 = new X.9GX
            r0.<init>(r1, r5)
            goto L_0x046a
        L_0x0104:
            X.190 r1 = r0.A01
            X.9GT r0 = new X.9GT
            r0.<init>(r1, r5)
            goto L_0x046a
        L_0x010d:
            X.190 r4 = X.AnonymousClass8BT.A09(r0)
            X.9Ke r3 = X.C179859Ke.A1K
            java.lang.String r1 = "COMMUNITY_CHANGE_DESCRIPTION"
            X.9Gv r0 = new X.9Gv
            r0.<init>(r4, r3, r5, r1)
            goto L_0x046a
        L_0x011c:
            X.190 r4 = r0.A01
            X.1CJ r3 = r0.A0G
            X.1PQ r1 = r0.A0N
            X.9Gu r0 = new X.9Gu
            r0.<init>(r4, r3, r5, r1)
            goto L_0x046a
        L_0x0129:
            X.190 r1 = r0.A01
            X.9Gc r0 = new X.9Gc
            r0.<init>(r1, r5)
            goto L_0x046a
        L_0x0132:
            X.190 r1 = r0.A01
            X.9Gd r0 = new X.9Gd
            r0.<init>(r1, r5)
            goto L_0x046a
        L_0x013b:
            X.190 r1 = X.AnonymousClass8BT.A09(r0)
            X.9Gg r0 = new X.9Gg
            r0.<init>(r1, r5)
            goto L_0x046a
        L_0x0146:
            X.190 r1 = X.AnonymousClass8BT.A09(r0)
            X.9Fx r0 = new X.9Fx
            r0.<init>(r1)
            goto L_0x046a
        L_0x0151:
            X.0ve r4 = r0.A0K
            X.190 r3 = r0.A01
            X.1CJ r1 = r0.A0G
            X.9Gy r0 = new X.9Gy
            r0.<init>(r3, r1, r4, r5)
            goto L_0x046a
        L_0x015e:
            X.190 r1 = r0.A01
            X.9GJ r0 = new X.9GJ
            r0.<init>(r1, r5)
            goto L_0x046a
        L_0x0167:
            X.190 r1 = r0.A01
            X.9Fw r0 = new X.9Fw
            r0.<init>(r1)
            goto L_0x046a
        L_0x0170:
            X.190 r1 = r0.A01
            X.9GO r0 = new X.9GO
            r0.<init>(r1, r5)
            goto L_0x046a
        L_0x0179:
            X.190 r3 = r0.A01
            X.11S r1 = r0.A0D
            X.C18070vi.A0j(r3, r1)
            X.8th r0 = new X.8th
            r0.<init>(r3, r1, r5)
            goto L_0x046a
        L_0x0187:
            X.190 r8 = r0.A01
            X.11S r4 = r0.A0D
            X.1CJ r3 = r0.A0G
            X.1MF r1 = r0.A0I
            X.8tk r0 = new X.8tk
            r15 = r8
            r16 = r4
            r17 = r3
            r18 = r1
            r19 = r5
            r14 = r0
            r14.<init>(r15, r16, r17, r18, r19)
            goto L_0x046a
        L_0x01a0:
            X.190 r8 = r0.A01
            X.11S r4 = r0.A0D
            X.1CJ r3 = r0.A0G
            X.1MF r1 = r0.A0I
            X.8tj r0 = new X.8tj
            r15 = r8
            r16 = r4
            r17 = r3
            r18 = r1
            r19 = r5
            r14 = r0
            r14.<init>(r15, r16, r17, r18, r19)
            goto L_0x046a
        L_0x01b9:
            X.190 r3 = r0.A01
            X.1PQ r1 = r0.A0N
            X.9Gi r0 = new X.9Gi
            r0.<init>(r3, r5, r1)
            goto L_0x046a
        L_0x01c4:
            X.190 r1 = r0.A01
            X.9Fz r0 = new X.9Fz
            r0.<init>(r1, r5)
            goto L_0x046a
        L_0x01cd:
            X.9in r0 = r0.A0A
            X.8mW r0 = r0.A00(r5)
            goto L_0x046a
        L_0x01d5:
            X.9il r0 = r0.A08
            X.8mV r0 = r0.A00(r5)
            goto L_0x046a
        L_0x01dd:
            X.9im r0 = r0.A09
            X.8mR r0 = r0.A00(r5)
            goto L_0x046a
        L_0x01e5:
            X.9ik r0 = r0.A07
            X.8mT r0 = r0.A00(r5)
            goto L_0x046a
        L_0x01ed:
            X.9ij r0 = r0.A02
            X.8mS r0 = r0.A00(r5)
            goto L_0x046a
        L_0x01f5:
            X.9Vo r0 = r0.A05
            X.10F r0 = r0.A00
            X.10E r0 = r0.A00
            X.190 r4 = X.AnonymousClass8BW.A0C(r0)
            X.1CJ r3 = X.AnonymousClass8BV.A0C(r0)
            X.1PQ r1 = X.AnonymousClass8BV.A0N(r0)
            X.8mQ r0 = new X.8mQ
            r0.<init>(r4, r3, r5, r1)
            goto L_0x046a
        L_0x020e:
            X.9Vn r0 = r0.A03
            X.10F r0 = r0.A00
            X.10E r0 = r0.A00
            X.190 r4 = X.AnonymousClass8BW.A0C(r0)
            X.1CJ r3 = X.AnonymousClass8BV.A0C(r0)
            X.1PQ r1 = X.AnonymousClass8BV.A0N(r0)
            X.8mP r0 = new X.8mP
            r0.<init>(r4, r3, r5, r1)
            goto L_0x046a
        L_0x0227:
            X.190 r3 = r0.A01
            X.11S r1 = r0.A0D
            X.C18070vi.A0j(r3, r1)
            X.8tg r0 = new X.8tg
            r0.<init>(r3, r1, r5)
            goto L_0x046a
        L_0x0235:
            X.190 r1 = r0.A01
            X.9Gn r0 = new X.9Gn
            r0.<init>(r1, r5, r5)
            goto L_0x046a
        L_0x023e:
            X.190 r3 = r0.A01
            X.1R5 r1 = r0.A0M
            X.9Gt r0 = new X.9Gt
            r0.<init>(r3, r1, r5)
            goto L_0x046a
        L_0x0249:
            X.190 r3 = r0.A01
            X.11S r1 = r0.A0D
            X.9Gr r0 = new X.9Gr
            r0.<init>(r3, r1, r5)
            goto L_0x046a
        L_0x0254:
            X.190 r1 = r0.A01
            X.9GP r0 = new X.9GP
            r0.<init>(r1, r5)
            goto L_0x046a
        L_0x025d:
            X.190 r1 = r0.A01
            X.9GI r0 = new X.9GI
            r0.<init>(r1, r5)
            goto L_0x046a
        L_0x0266:
            X.190 r1 = r0.A01
            X.9GE r0 = new X.9GE
            r0.<init>(r1, r5)
            goto L_0x046a
        L_0x026f:
            X.190 r1 = r0.A01
            X.9GH r0 = new X.9GH
            r0.<init>(r1, r5)
            goto L_0x046a
        L_0x0278:
            X.190 r1 = r0.A01
            X.9GG r0 = new X.9GG
            r0.<init>(r1, r5)
            goto L_0x046a
        L_0x0281:
            X.190 r1 = r0.A01
            X.9GF r0 = new X.9GF
            r0.<init>(r1, r5)
            goto L_0x046a
        L_0x028a:
            X.190 r1 = r0.A01
            X.9G5 r0 = new X.9G5
            r0.<init>(r1, r5)
            goto L_0x046a
        L_0x0293:
            X.190 r1 = r0.A01
            X.9G4 r0 = new X.9G4
            r0.<init>(r1, r5)
            goto L_0x046a
        L_0x029c:
            X.190 r1 = r0.A01
            X.9GD r0 = new X.9GD
            r0.<init>(r1, r5)
            goto L_0x046a
        L_0x02a5:
            X.190 r4 = r0.A01
            X.12L r3 = r0.A0L
            X.0zA r1 = r0.A00
            X.9Fy r0 = new X.9Fy
            r0.<init>(r4)
            r0.A00 = r3
            java.lang.Object r1 = r1.A04()
            X.1gl r1 = (X.C32171gl) r1
            r0.A01 = r1
            r0.A02 = r5
            goto L_0x046a
        L_0x02be:
            X.190 r1 = r0.A01
            X.9GQ r0 = new X.9GQ
            r0.<init>(r1, r5)
            goto L_0x046a
        L_0x02c7:
            X.190 r1 = r0.A01
            X.9GC r0 = new X.9GC
            r0.<init>(r1, r5)
            goto L_0x046a
        L_0x02d0:
            X.190 r1 = r0.A01
            X.9GV r0 = new X.9GV
            r0.<init>(r1, r5)
            goto L_0x046a
        L_0x02d9:
            X.190 r1 = r0.A01
            X.9GU r0 = new X.9GU
            r0.<init>(r1, r5)
            goto L_0x046a
        L_0x02e2:
            X.190 r1 = r0.A01
            X.9GS r0 = new X.9GS
            r0.<init>(r1, r5)
            goto L_0x046a
        L_0x02eb:
            X.190 r1 = r0.A01
            X.9Fv r0 = new X.9Fv
            r0.<init>(r1)
            goto L_0x046a
        L_0x02f4:
            X.190 r1 = r0.A01
            X.9HC r0 = new X.9HC
            r0.<init>(r1, r5)
            r0.A00 = r5
            goto L_0x046a
        L_0x02ff:
            X.190 r3 = r0.A01
            X.11S r1 = r0.A0D
            X.9HA r0 = new X.9HA
            r0.<init>(r3, r1, r5)
            goto L_0x046a
        L_0x030a:
            X.190 r3 = r0.A01
            X.11S r1 = r0.A0D
            X.9HB r0 = new X.9HB
            r0.<init>(r3, r1, r5)
            goto L_0x046a
        L_0x0315:
            X.190 r1 = r0.A01
            X.9GR r0 = new X.9GR
            r0.<init>(r1, r5)
            goto L_0x046a
        L_0x031e:
            X.190 r4 = X.AnonymousClass8BT.A09(r0)
            X.9Ke r3 = X.C179859Ke.A1y
            java.lang.String r1 = "GROUP_CHANGE_DESCRIPTION"
            X.9Gw r0 = new X.9Gw
            r0.<init>(r4, r3, r5, r1)
            goto L_0x046a
        L_0x032d:
            X.190 r1 = r0.A01
            X.9G2 r0 = new X.9G2
            r0.<init>(r1, r5)
            goto L_0x046a
        L_0x0336:
            X.190 r3 = r0.A01
            X.1Ln r1 = r0.A0J
            X.9Gl r0 = new X.9Gl
            r0.<init>(r3, r1, r5)
            goto L_0x046a
        L_0x0341:
            X.190 r3 = r0.A01
            X.1Ln r1 = r0.A0J
            X.9Gq r0 = new X.9Gq
            r0.<init>(r3, r1, r5)
            goto L_0x046a
        L_0x034c:
            X.190 r1 = r0.A01
            X.9GN r0 = new X.9GN
            r0.<init>(r1, r5)
            goto L_0x046a
        L_0x0355:
            X.190 r1 = r0.A01
            X.9GM r0 = new X.9GM
            r0.<init>(r1, r5)
            goto L_0x046a
        L_0x035e:
            X.190 r1 = r0.A01
            X.9GB r0 = new X.9GB
            r0.<init>(r1, r5)
            goto L_0x046a
        L_0x0367:
            X.190 r3 = r0.A01
            X.11S r1 = r0.A0D
            X.9Gm r0 = new X.9Gm
            r0.<init>(r3, r1, r5)
            goto L_0x046a
        L_0x0372:
            X.190 r1 = r0.A01
            X.9G8 r0 = new X.9G8
            r0.<init>(r1, r5)
            goto L_0x046a
        L_0x037b:
            X.190 r3 = r0.A01
            X.11S r0 = r0.A0D
            com.whatsapp.jid.PhoneUserJid r1 = X.AnonymousClass11S.A00(r0)
            X.9Gp r0 = new X.9Gp
            r0.<init>(r3, r1, r5)
            goto L_0x046a
        L_0x038a:
            X.190 r1 = r0.A01
            X.9G3 r0 = new X.9G3
            r0.<init>(r1, r5)
            goto L_0x046a
        L_0x0393:
            X.190 r1 = r0.A01
            X.9Gf r0 = new X.9Gf
            r0.<init>(r1, r5)
            goto L_0x046a
        L_0x039c:
            X.190 r1 = r0.A01
            X.9GK r0 = new X.9GK
            r0.<init>(r1, r5)
            goto L_0x046a
        L_0x03a5:
            X.190 r1 = r0.A01
            X.9GL r0 = new X.9GL
            r0.<init>(r1, r5)
            goto L_0x046a
        L_0x03ae:
            X.190 r1 = r0.A01
            X.9G9 r0 = new X.9G9
            r0.<init>(r1, r5)
            goto L_0x046a
        L_0x03b7:
            X.190 r1 = r0.A01
            X.9GA r0 = new X.9GA
            r0.<init>(r1, r5)
            goto L_0x046a
        L_0x03c0:
            X.190 r1 = r0.A01
            X.9G6 r0 = new X.9G6
            r0.<init>(r1, r5)
            goto L_0x046a
        L_0x03c9:
            X.190 r3 = r0.A01
            X.11S r1 = r0.A0D
            X.8ti r0 = new X.8ti
            r0.<init>(r3, r1, r5)
            goto L_0x046a
        L_0x03d4:
            X.190 r1 = r0.A01
            X.9G1 r0 = new X.9G1
            r0.<init>(r1, r5)
            goto L_0x046a
        L_0x03dd:
            X.190 r1 = r0.A01
            X.9G7 r0 = new X.9G7
            r0.<init>(r1, r5)
            goto L_0x046a
        L_0x03e6:
            int r0 = r2.bitField0_
            r0 = r0 & 16384(0x4000, float:2.2959E-41)
            if (r0 == 0) goto L_0x041c
            X.9Ke r1 = r2.A0R()
            X.9Ke r0 = X.C179859Ke.A38
            if (r1 == r0) goto L_0x041c
            X.0vl r0 = r7.A08
            java.lang.Object r0 = X.AnonymousClass8BV.A0n(r1, r0)
            java.util.List r0 = (java.util.List) r0
            if (r0 == 0) goto L_0x041c
            java.util.Iterator r1 = r0.iterator()
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x041c
            java.lang.Object r0 = r1.next()
            X.9rn r0 = (X.C194479rn) r0
            X.BAt r3 = r0.A01
            X.206 r1 = r3.CBA(r2)
            int r4 = r0.A00
        L_0x0416:
            java.lang.Class r0 = r3.getClass()
            goto L_0x04b1
        L_0x041c:
            int r0 = r2.bitField0_
            r0 = r0 & 2
            if (r0 == 0) goto L_0x1973
            X.00H r0 = r7.A03
            X.205 r1 = X.C20106A7k.A02(r2, r0)
            long r3 = X.C20106A7k.A00(r2)
            X.8cr r0 = r2.message_
            if (r0 != 0) goto L_0x0432
            X.8cr r0 = X.C166418cr.DEFAULT_INSTANCE
        L_0x0432:
            X.C18070vi.A0X(r0)
            X.9p8 r1 = X.C196699vU.A00(r0, r1, r3)
            r0 = 1
            r1.A0A = r0
            r1.A0B = r0
            X.A6d r1 = r1.A00()
            X.00H r0 = r7.A02
            X.206 r1 = X.AnonymousClass8BV.A0K(r1, r0)
            X.0vl r0 = r7.A07
            java.util.Map r0 = X.AnonymousClass3MW.A12(r0)
            int r4 = r1.A0u
            java.lang.Object r0 = X.AnonymousClass000.A0w(r0, r4)
            X.9ql r0 = (X.C193849ql) r0
            if (r0 != 0) goto L_0x045b
            java.lang.Class<X.9p6> r0 = X.C192859p6.class
            goto L_0x04b1
        L_0x045b:
            X.B87 r3 = r0.A01
            r0 = r23
            r3.CBB(r0, r2, r1)
            goto L_0x0416
        L_0x0463:
            X.190 r1 = r0.A01
            X.9G0 r0 = new X.9G0
            r0.<init>(r1, r5)
        L_0x046a:
            X.00H r1 = r13.A00
            X.205 r3 = X.C20106A7k.A02(r2, r1)
            long r4 = X.C20106A7k.A00(r2)
            X.9Ke r1 = X.C179859Ke.A2i
            if (r6 == r1) goto L_0x0481
            X.1BI r8 = r3.A00
            r6 = 1
            java.lang.String r1 = r3.A01
            X.205 r3 = X.AnonymousClass205.A01(r8, r1, r6)
        L_0x0481:
            boolean r1 = r0 instanceof X.C179019Gg
            if (r1 == 0) goto L_0x0504
            r1 = 0
            X.C18070vi.A0e(r3, r1, r2)
            X.EE9 r0 = r2.messageStubParameters_
            java.lang.String r8 = X.C17880vN.A0w(r0, r1)
            if (r8 == 0) goto L_0x0020
            r1 = 1
            X.EE9 r0 = r2.messageStubParameters_
            java.lang.String r6 = X.C17880vN.A0w(r0, r1)
            if (r6 == 0) goto L_0x0020
            r0 = 165(0xa5, float:2.31E-43)
            X.97q r1 = new X.97q
            r1.<init>(r3, r0, r4)
            java.lang.String r0 = ""
            r1.A01 = r0
            r1.A00 = r0
            r1.A01 = r8
            r1.A00 = r6
        L_0x04ab:
            int r4 = r12.A00
            java.lang.Class r0 = r13.getClass()
        L_0x04b1:
            X.20F r3 = X.AnonymousClass3MW.A15(r0)
            X.9rm r0 = new X.9rm
            r0.<init>(r1, r3, r4)
            X.206 r4 = r0.A00
            X.1BI r0 = r4.A0H()
            if (r0 != 0) goto L_0x04e1
            X.00H r0 = r7.A03
            r0.get()
            X.8cq r0 = r2.key_
            r1 = r0
            if (r0 != 0) goto L_0x04ce
            X.8cq r0 = X.C166408cq.DEFAULT_INSTANCE
        L_0x04ce:
            int r0 = r0.bitField0_
            r0 = r0 & 8
            if (r0 == 0) goto L_0x04f9
            if (r1 != 0) goto L_0x04d8
            X.8cq r1 = X.C166408cq.DEFAULT_INSTANCE
        L_0x04d8:
            java.lang.String r0 = r1.participant_
        L_0x04da:
            com.whatsapp.jid.UserJid r0 = X.C22941Dw.A02(r0)
        L_0x04de:
            r4.A0d(r0)
        L_0x04e1:
            X.00H r0 = r7.A04
            java.util.Iterator r3 = X.AnonymousClass8BX.A0m(r0)
        L_0x04e7:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x192d
            java.lang.Object r1 = r3.next()
            X.BAs r1 = (X.C22511BAs) r1
            r0 = r23
            r1.C1B(r0, r2, r4)
            goto L_0x04e7
        L_0x04f9:
            int r0 = r2.bitField0_
            r0 = r0 & 16
            if (r0 == 0) goto L_0x0502
            java.lang.String r0 = r2.participant_
            goto L_0x04da
        L_0x0502:
            r0 = 0
            goto L_0x04de
        L_0x0504:
            boolean r1 = r0 instanceof X.C179009Gf
            if (r1 == 0) goto L_0x0525
            r6 = 0
            X.C18070vi.A0e(r3, r6, r2)
            r0 = 173(0xad, float:2.42E-43)
            X.2Mh r1 = X.AnonymousClass8BR.A0n(r3, r0, r4)
            X.1Dw r3 = com.whatsapp.jid.UserJid.Companion
            java.lang.String r0 = r2.participant_
            X.AnonymousClass8BT.A1F(r3, r1, r0)
            X.EE9 r0 = r2.messageStubParameters_
            java.util.ArrayList r0 = X.AnonymousClass000.A14(r0)
            X.C20108A7n.A0C(r3, r2, r0, r6)
            r1.A01 = r0
            goto L_0x04ab
        L_0x0525:
            boolean r1 = r0 instanceof X.AnonymousClass9H2
            if (r1 == 0) goto L_0x0536
            r0 = 0
            X.C18070vi.A0d(r3, r0)
            r0 = 156(0x9c, float:2.19E-43)
            X.97a r1 = new X.97a
            r1.<init>(r3, r0, r4)
            goto L_0x04ab
        L_0x0536:
            boolean r1 = r0 instanceof X.C178989Gd
            if (r1 == 0) goto L_0x058a
            int r1 = X.AnonymousClass8BR.A03(r2)
            r0 = 3
            if (r1 == r0) goto L_0x0548
            java.lang.String r0 = "ScheduledCallStartWebQuery/restoreFMessage wrong number of parameters"
        L_0x0543:
            com.whatsapp.util.Log.e((java.lang.String) r0)
            goto L_0x0020
        L_0x0548:
            r0 = 117(0x75, float:1.64E-43)
            X.2MO r1 = new X.2MO
            r1.<init>(r3, r0, r4)
            java.lang.String r0 = ""
            r1.A02 = r0
            java.lang.String r5 = X.C20108A7n.A0A(r2)
            r3 = 1
            X.EE9 r0 = r2.messageStubParameters_
            java.lang.String r4 = X.C17880vN.A0w(r0, r3)
            r3 = 2
            X.EE9 r0 = r2.messageStubParameters_
            java.lang.String r8 = X.C17880vN.A0w(r0, r3)
            boolean r0 = X.AnonymousClass1EG.A0H(r5)
            if (r0 != 0) goto L_0x0587
            boolean r0 = X.AnonymousClass1EG.A0H(r4)
            if (r0 != 0) goto L_0x0587
            boolean r0 = X.AnonymousClass1EG.A0H(r8)
            if (r0 != 0) goto L_0x0587
            long r5 = java.lang.Long.parseLong(r5)
            long r3 = java.lang.Long.parseLong(r4)
            r1.A01 = r5
            r1.A00 = r3
            r1.A02 = r8
            goto L_0x04ab
        L_0x0587:
            java.lang.String r0 = "ScheduledCallStartWebQuery/restoreFMessage one of the parameters is invalid"
            goto L_0x0543
        L_0x058a:
            boolean r1 = r0 instanceof X.C178979Gc
            if (r1 == 0) goto L_0x05df
            r6 = 0
            int r8 = X.C72453Mb.A0G(r3, r2, r6)
            int r1 = X.AnonymousClass8BR.A03(r2)
            r0 = 3
            if (r1 != r0) goto L_0x0020
            r0 = 162(0xa2, float:2.27E-43)
            X.2MG r1 = new X.2MG
            r1.<init>(r3, r0, r4)
            X.EE9 r0 = r2.messageStubParameters_
            java.lang.String r4 = X.C17880vN.A0w(r0, r6)
            r3 = 1
            X.EE9 r0 = r2.messageStubParameters_
            java.lang.String r6 = X.C17880vN.A0w(r0, r3)
            X.EE9 r0 = r2.messageStubParameters_
            java.lang.String r5 = X.C17880vN.A0w(r0, r8)
            boolean r0 = X.AnonymousClass1EG.A0H(r4)
            if (r0 != 0) goto L_0x0020
            boolean r0 = X.AnonymousClass1EG.A0H(r6)
            if (r0 != 0) goto L_0x0020
            boolean r0 = X.AnonymousClass1EG.A0H(r5)
            if (r0 != 0) goto L_0x0020
            X.C18070vi.A0b(r4)
            long r3 = java.lang.Long.parseLong(r4)
            r1.A00 = r3
            X.C18070vi.A0b(r6)
            long r3 = java.lang.Long.parseLong(r6)
            r1.A01 = r3
            X.C72453Mb.A1R(r5)
            r1.A02 = r5
            goto L_0x04ab
        L_0x05df:
            boolean r1 = r0 instanceof X.C178969Gb
            if (r1 == 0) goto L_0x0601
            r6 = 0
            X.C18070vi.A0e(r3, r6, r2)
            r0 = 118(0x76, float:1.65E-43)
            X.97m r1 = new X.97m
            r1.<init>(r3, r0, r4)
            int r0 = X.AnonymousClass8BR.A03(r2)
            if (r0 <= 0) goto L_0x04ab
            X.1Dw r3 = com.whatsapp.jid.UserJid.Companion
            X.EE9 r0 = r2.messageStubParameters_
            java.lang.String r0 = X.C17880vN.A0w(r0, r6)
            X.AnonymousClass8BT.A1F(r3, r1, r0)
            goto L_0x04ab
        L_0x0601:
            boolean r1 = r0 instanceof X.C179149Gt
            if (r1 == 0) goto L_0x0624
            X.9Ke r0 = r2.A0R()
            int r1 = r0.ordinal()
            r0 = 54
            r6 = 40
            if (r1 == r0) goto L_0x15b0
            r0 = 55
            r6 = 41
            if (r1 == r0) goto L_0x15b0
            r0 = 56
            if (r1 == r0) goto L_0x15ae
            java.lang.String r0 = "PaymentWebQuery/restoreFMessage malformed WMI"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            goto L_0x0020
        L_0x0624:
            boolean r1 = r0 instanceof X.C178959Ga
            if (r1 == 0) goto L_0x0695
            X.9Ke r0 = r2.A0R()
            int r9 = r0.ordinal()
            r8 = 1
            r1 = 178(0xb2, float:2.5E-43)
            r6 = 2
            r0 = 179(0xb3, float:2.51E-43)
            if (r9 == r1) goto L_0x068a
            if (r9 == r0) goto L_0x067f
            r0 = 180(0xb4, float:2.52E-43)
            if (r9 != r0) goto L_0x192e
            X.C18070vi.A0d(r3, r8)
            r0 = 66
            X.98I r1 = new X.98I
            r1.<init>(r3, r0, r4)
        L_0x0648:
            int r0 = X.AnonymousClass8BR.A03(r2)
            boolean r0 = X.C108975cc.A1C(r0, r6)
            java.lang.String r0 = X.C20108A7n.A0B(r2, r0)
            int r0 = java.lang.Integer.parseInt(r0)
            r1.A00 = r0
            X.EE9 r0 = r2.messageStubParameters_
            java.lang.String r0 = X.C17880vN.A0w(r0, r8)
            boolean r0 = java.lang.Boolean.parseBoolean(r0)
            r1.A01 = r0
            int r0 = X.AnonymousClass8BR.A03(r2)
            if (r0 <= r6) goto L_0x04ab
            X.EE9 r0 = r2.messageStubParameters_
            java.lang.String r0 = X.C17880vN.A0w(r0, r6)
            X.1BI r0 = X.AnonymousClass3MX.A0l(r0)
            if (r0 != 0) goto L_0x15c5
            java.lang.String r0 = "Invalid Sender JID"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            goto L_0x04ab
        L_0x067f:
            X.C18070vi.A0d(r3, r8)
            r0 = 65
            X.98H r1 = new X.98H
            r1.<init>(r3, r0, r4)
            goto L_0x0648
        L_0x068a:
            X.C18070vi.A0d(r3, r8)
            r0 = 64
            X.98J r1 = new X.98J
            r1.<init>(r3, r0, r4)
            goto L_0x0648
        L_0x0695:
            boolean r1 = r0 instanceof X.AnonymousClass9GZ
            if (r1 == 0) goto L_0x06b7
            r8 = 0
            X.C18070vi.A0e(r3, r8, r2)
            r6 = 1
            r0 = 136(0x88, float:1.9E-43)
            X.97o r1 = new X.97o
            r1.<init>(r3, r0, r4)
            r1.A00 = r6
            int r0 = X.AnonymousClass8BR.A03(r2)
            if (r0 <= 0) goto L_0x04ab
            X.EE9 r0 = r2.messageStubParameters_
            java.lang.String r0 = X.C17880vN.A0w(r0, r8)
            r1.A0X = r0
            goto L_0x04ab
        L_0x06b7:
            boolean r1 = r0 instanceof X.AnonymousClass9GY
            if (r1 == 0) goto L_0x06c8
            r0 = 0
            X.C18070vi.A0d(r3, r0)
            r0 = 135(0x87, float:1.89E-43)
            X.97e r1 = new X.97e
            r1.<init>(r3, r0, r4)
            goto L_0x04ab
        L_0x06c8:
            boolean r1 = r0 instanceof X.AnonymousClass9GX
            if (r1 == 0) goto L_0x06ee
            X.C18070vi.A0i(r3, r2)
            r0 = 120(0x78, float:1.68E-43)
            X.2MV r1 = new X.2MV
            r1.<init>(r3, r0, r4)
            X.1Dw r4 = com.whatsapp.jid.UserJid.Companion
            java.lang.String r0 = r2.participant_
            X.AnonymousClass8BT.A1F(r4, r1, r0)
            java.util.ArrayList r5 = X.AnonymousClass000.A13()
            int r3 = X.AnonymousClass8BR.A03(r2)
            r0 = 0
        L_0x06e6:
            if (r0 >= r3) goto L_0x1708
            X.C20108A7n.A0C(r4, r2, r5, r0)
            int r0 = r0 + 1
            goto L_0x06e6
        L_0x06ee:
            boolean r1 = r0 instanceof X.AnonymousClass9GW
            if (r1 == 0) goto L_0x0729
            r0 = 70
            X.2MM r1 = new X.2MM
            r1.<init>(r3, r0, r4)
            int r0 = X.AnonymousClass8BR.A03(r2)
            r4 = 2
            boolean r0 = X.C108975cc.A1C(r0, r4)
            java.lang.String r0 = X.C20108A7n.A0B(r2, r0)
            boolean r0 = java.lang.Boolean.parseBoolean(r0)
            r1.A02 = r0
            r3 = 1
            X.EE9 r0 = r2.messageStubParameters_
            java.lang.String r0 = X.C17880vN.A0w(r0, r3)
            int r0 = java.lang.Integer.parseInt(r0)
            r1.A00 = r0
            int r0 = X.AnonymousClass8BR.A03(r2)
            if (r0 <= r4) goto L_0x04ab
            X.EE9 r0 = r2.messageStubParameters_
            java.lang.String r0 = X.C17880vN.A0w(r0, r4)
            r1.A01 = r0
            goto L_0x04ab
        L_0x0729:
            boolean r1 = r0 instanceof X.C179199Gy
            if (r1 == 0) goto L_0x0770
            int r0 = X.AnonymousClass8BR.A03(r2)
            r8 = 1
            boolean r0 = X.C108975cc.A1C(r0, r8)
            java.lang.String r1 = X.C20108A7n.A0B(r2, r0)
            X.1yz r0 = X.AnonymousClass1EC.A01
            X.1EC r6 = r0.A02(r1)
            X.C18070vi.A0d(r3, r8)
            r17 = 105(0x69, float:1.47E-43)
            r16 = 0
            X.98S r1 = new X.98S
            r18 = r4
            r14 = r1
            r15 = r3
            r14.<init>((X.AnonymousClass205) r15, (X.C62502rV) r16, (int) r17, (long) r18)
            int r3 = X.AnonymousClass8BR.A03(r2)
            r0 = 2
            if (r3 < r0) goto L_0x076e
            X.EE9 r0 = r2.messageStubParameters_
            java.lang.String r4 = X.C17880vN.A0w(r0, r8)
        L_0x075d:
            if (r6 == 0) goto L_0x04ab
            r3 = 0
            X.2md r0 = new X.2md
            r0.<init>(r6, r4, r8, r3)
            java.util.List r0 = X.C18070vi.A0M(r0)
            r1.A1D(r0)
            goto L_0x04ab
        L_0x076e:
            r4 = 0
            goto L_0x075d
        L_0x0770:
            boolean r1 = r0 instanceof X.AnonymousClass9Fy
            if (r1 == 0) goto L_0x07a3
            r0 = 67
            X.2MC r1 = new X.2MC
            r1.<init>(r3, r0, r4)
            r0 = 0
            r1.A00 = r0
            X.9Ke r0 = r2.A0R()
            int r0 = r0.ordinal()
            switch(r0) {
                case 79: goto L_0x07a0;
                case 81: goto L_0x079d;
                case 84: goto L_0x079b;
                case 86: goto L_0x0798;
                case 94: goto L_0x0796;
                case 96: goto L_0x0794;
                case 126: goto L_0x0796;
                case 127: goto L_0x079b;
                case 193: goto L_0x0791;
                case 200: goto L_0x078e;
                default: goto L_0x0789;
            }
        L_0x0789:
            r0 = 0
        L_0x078a:
            r1.A00 = r0
            goto L_0x04ab
        L_0x078e:
            r0 = 16
            goto L_0x078a
        L_0x0791:
            r0 = 17
            goto L_0x078a
        L_0x0794:
            r0 = 6
            goto L_0x078a
        L_0x0796:
            r0 = 5
            goto L_0x078a
        L_0x0798:
            r0 = 8
            goto L_0x078a
        L_0x079b:
            r0 = 7
            goto L_0x078a
        L_0x079d:
            r0 = 10
            goto L_0x078a
        L_0x07a0:
            r0 = 9
            goto L_0x078a
        L_0x07a3:
            boolean r1 = r0 instanceof X.AnonymousClass9Fx
            if (r1 == 0) goto L_0x07b4
            r0 = 0
            X.C18070vi.A0d(r3, r0)
            r0 = 99
            X.988 r1 = new X.988
            r1.<init>(r3, r0, r4)
            goto L_0x04ab
        L_0x07b4:
            boolean r1 = r0 instanceof X.C178949Fw
            if (r1 == 0) goto L_0x07c5
            r0 = 1
            X.C18070vi.A0d(r3, r0)
            r0 = 96
            X.97i r1 = new X.97i
            r1.<init>(r3, r0, r4)
            goto L_0x04ab
        L_0x07c5:
            boolean r1 = r0 instanceof X.AnonymousClass9GV
            if (r1 == 0) goto L_0x07f0
            r6 = 1
            X.C18070vi.A0d(r3, r6)
            r0 = 83
            X.989 r1 = new X.989
            r1.<init>(r3, r0, r4)
            int r0 = X.AnonymousClass8BR.A03(r2)
            if (r0 != r6) goto L_0x0020
            java.lang.String r0 = X.C20108A7n.A0A(r2)
            java.lang.String r0 = X.C181599Rc.A00(r0)
            if (r0 == 0) goto L_0x0020
            r1.A00 = r0
            java.lang.String r0 = r2.participant_
            com.whatsapp.jid.UserJid r0 = X.C22941Dw.A02(r0)
            if (r0 != 0) goto L_0x15c5
            goto L_0x0020
        L_0x07f0:
            boolean r1 = r0 instanceof X.AnonymousClass9GU
            if (r1 == 0) goto L_0x0842
            int r1 = X.AnonymousClass8BR.A03(r2)
            r0 = 2
            if (r1 != r0) goto L_0x0020
            java.lang.String r1 = X.C20108A7n.A0A(r2)
            java.lang.String r0 = "on"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0837
            r8 = 84
        L_0x0809:
            r1 = 1
            X.EE9 r0 = r2.messageStubParameters_
            java.lang.String r6 = X.C17880vN.A0w(r0, r1)
            java.lang.String r0 = "admin"
            boolean r0 = r0.equals(r6)
            if (r0 != 0) goto L_0x0820
            java.lang.String r0 = "regular"
            boolean r0 = r0.equals(r6)
            if (r0 == 0) goto L_0x0020
        L_0x0820:
            java.lang.String r0 = r2.participant_
            com.whatsapp.jid.UserJid r0 = X.C22941Dw.A02(r0)
            if (r0 == 0) goto L_0x0020
            X.C18070vi.A0d(r3, r1)
            X.2MT r1 = new X.2MT
            r1.<init>(r3, r8, r4)
            r1.A00 = r6
            r1.A0d(r0)
            goto L_0x04ab
        L_0x0837:
            java.lang.String r0 = "off"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0020
            r8 = 85
            goto L_0x0809
        L_0x0842:
            boolean r1 = r0 instanceof X.AnonymousClass9GT
            if (r1 == 0) goto L_0x087b
            r6 = 0
            X.C18070vi.A0e(r3, r6, r2)
            int r1 = X.AnonymousClass8BR.A03(r2)
            r0 = 1
            if (r1 != r0) goto L_0x0020
            X.EE9 r0 = r2.messageStubParameters_
            java.lang.String r1 = X.C17880vN.A0w(r0, r6)
            java.lang.String r0 = "on"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0870
            r0 = 91
        L_0x0861:
            X.2Mh r1 = X.AnonymousClass8BR.A0n(r3, r0, r4)
            X.1Dw r3 = com.whatsapp.jid.UserJid.Companion
            java.lang.String r0 = r2.participant_
            X.AnonymousClass8BT.A1F(r3, r1, r0)
        L_0x086c:
            if (r1 == 0) goto L_0x0020
            goto L_0x04ab
        L_0x0870:
            java.lang.String r0 = "off"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0020
            r0 = 92
            goto L_0x0861
        L_0x087b:
            boolean r1 = r0 instanceof X.AnonymousClass9GS
            if (r1 == 0) goto L_0x0918
            r6 = 0
            X.C18070vi.A0e(r3, r6, r2)
            int r1 = X.AnonymousClass8BR.A03(r2)
            r0 = 5
            r8 = 0
            if (r1 < r0) goto L_0x0020
            java.lang.String r0 = r2.participant_
            if (r0 == 0) goto L_0x0916
            com.whatsapp.jid.Jid r0 = X.AnonymousClass3MX.A0n(r0)
            boolean r1 = r0 instanceof com.whatsapp.jid.UserJid
            if (r1 != 0) goto L_0x0898
            r0 = r8
        L_0x0898:
            X.1BI r0 = (X.AnonymousClass1BI) r0
        L_0x089a:
            X.EE9 r1 = r2.messageStubParameters_
            java.lang.String r1 = X.C17880vN.A0w(r1, r6)
            if (r1 == 0) goto L_0x0020
            com.whatsapp.jid.Jid r6 = X.AnonymousClass3MX.A0n(r1)
            boolean r1 = r6 instanceof com.whatsapp.jid.GroupJid
            if (r1 != 0) goto L_0x08ab
            r6 = r8
        L_0x08ab:
            com.whatsapp.jid.GroupJid r6 = (com.whatsapp.jid.GroupJid) r6
            if (r6 == 0) goto L_0x0020
            r9 = 1
            X.EE9 r1 = r2.messageStubParameters_
            java.lang.String r9 = X.C17880vN.A0w(r1, r9)
            java.lang.String r1 = ""
            boolean r1 = X.C18070vi.A18(r9, r1)
            if (r1 != 0) goto L_0x08bf
            r8 = r9
        L_0x08bf:
            r9 = 3
            X.EE9 r1 = r2.messageStubParameters_
            java.lang.String r1 = X.C17880vN.A0w(r1, r9)
            java.lang.String r11 = "true"
            boolean r10 = r1.equals(r11)
            r9 = 4
            X.EE9 r1 = r2.messageStubParameters_
            java.lang.String r1 = X.C17880vN.A0w(r1, r9)
            boolean r1 = r1.equals(r11)
            r16 = 0
            if (r10 == 0) goto L_0x08fc
            r17 = 104(0x68, float:1.46E-43)
            X.98P r1 = new X.98P
            r14 = r1
            r15 = r3
            r18 = r4
            r14.<init>((X.AnonymousClass205) r15, (X.C62502rV) r16, (int) r17, (long) r18)
        L_0x08e6:
            java.util.ArrayList r9 = X.AnonymousClass000.A13()
            r5 = 1
            r4 = 0
            X.2md r3 = new X.2md
            r3.<init>(r6, r8, r5, r4)
            r9.add(r3)
            r1.A1D(r9)
        L_0x08f7:
            r1.A0d(r0)
            goto L_0x04ab
        L_0x08fc:
            if (r1 == 0) goto L_0x090a
            r17 = 103(0x67, float:1.44E-43)
            X.98Q r1 = new X.98Q
            r14 = r1
            r15 = r3
            r18 = r4
            r14.<init>((X.AnonymousClass205) r15, (X.C62502rV) r16, (int) r17, (long) r18)
            goto L_0x08e6
        L_0x090a:
            r17 = 102(0x66, float:1.43E-43)
            X.98R r1 = new X.98R
            r14 = r1
            r15 = r3
            r18 = r4
            r14.<init>((X.AnonymousClass205) r15, (X.C62502rV) r16, (int) r17, (long) r18)
            goto L_0x08e6
        L_0x0916:
            r0 = r8
            goto L_0x089a
        L_0x0918:
            boolean r1 = r0 instanceof X.AnonymousClass9H1
            if (r1 == 0) goto L_0x094b
            r0 = 95
            X.2MW r1 = new X.2MW
            r1.<init>(r3, r0, r4)
            r4 = 0
            r1.A00 = r4
            r0 = 2
            r1.A00 = r0
            java.lang.String r0 = r2.participant_
            com.whatsapp.jid.UserJid r0 = X.C22941Dw.A02(r0)
            r3 = 0
            if (r0 == 0) goto L_0x0020
            r1.A0d(r0)
            int r0 = X.AnonymousClass8BR.A03(r2)
            if (r0 <= 0) goto L_0x0947
            X.EE9 r0 = r2.messageStubParameters_
            java.lang.String r3 = X.C17880vN.A0w(r0, r4)
            X.1yz r0 = X.AnonymousClass1EC.A01
            X.1EC r3 = r0.A02(r3)
        L_0x0947:
            r1.A01 = r3
            goto L_0x04ab
        L_0x094b:
            boolean r1 = r0 instanceof X.AnonymousClass9GR
            if (r1 == 0) goto L_0x0960
            int r1 = X.AnonymousClass8BR.A03(r2)
            r8 = 1
            r6 = 0
            r0 = 2
            boolean r0 = X.AnonymousClass000.A1T(r1, r0)
            java.lang.String r1 = X.C20108A7n.A0B(r2, r0)
            goto L_0x12be
        L_0x0960:
            boolean r1 = r0 instanceof X.AnonymousClass9H5
            if (r1 == 0) goto L_0x0990
            r1 = 0
            X.C18070vi.A0e(r3, r1, r2)
            X.EE9 r0 = r2.messageStubParameters_
            java.lang.String r6 = X.C17880vN.A0w(r0, r1)
            java.lang.String r0 = "on"
            boolean r0 = X.C18070vi.A18(r6, r0)
            if (r0 == 0) goto L_0x0985
            r0 = 140(0x8c, float:1.96E-43)
        L_0x0978:
            X.2Mh r1 = X.AnonymousClass8BR.A0n(r3, r0, r4)
            X.1Dw r3 = com.whatsapp.jid.UserJid.Companion
            java.lang.String r0 = r2.participant_
            X.AnonymousClass8BT.A1F(r3, r1, r0)
            goto L_0x086c
        L_0x0985:
            java.lang.String r0 = "off"
            boolean r0 = X.C18070vi.A18(r6, r0)
            if (r0 == 0) goto L_0x193c
            r0 = 141(0x8d, float:1.98E-43)
            goto L_0x0978
        L_0x0990:
            boolean r1 = r0 instanceof X.AnonymousClass9GQ
            if (r1 == 0) goto L_0x09be
            int r0 = X.AnonymousClass8BR.A03(r2)
            boolean r0 = X.C17890vO.A1R(r0)
            java.lang.String r1 = X.C20108A7n.A0B(r2, r0)
            java.lang.String r0 = "on"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x09b3
            r0 = 53
        L_0x09aa:
            X.2Mh r1 = X.AnonymousClass8BR.A0n(r3, r0, r4)
            X.C20108A7n.A0E(r2, r1)
            goto L_0x086c
        L_0x09b3:
            java.lang.String r0 = "off"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x194a
            r0 = 54
            goto L_0x09aa
        L_0x09be:
            boolean r1 = r0 instanceof X.AnonymousClass9HE
            if (r1 == 0) goto L_0x09ee
            r1 = 0
            X.C18070vi.A0e(r3, r1, r2)
            X.EE9 r0 = r2.messageStubParameters_
            java.lang.String r6 = X.C17880vN.A0w(r0, r1)
            java.lang.String r0 = "on"
            boolean r0 = X.C18070vi.A18(r6, r0)
            if (r0 == 0) goto L_0x09e3
            r0 = 150(0x96, float:2.1E-43)
        L_0x09d6:
            X.2Mh r1 = X.AnonymousClass8BR.A0n(r3, r0, r4)
            X.1Dw r3 = com.whatsapp.jid.UserJid.Companion
            java.lang.String r0 = r2.participant_
            X.AnonymousClass8BT.A1F(r3, r1, r0)
            goto L_0x086c
        L_0x09e3:
            java.lang.String r0 = "off"
            boolean r0 = X.C18070vi.A18(r6, r0)
            if (r0 == 0) goto L_0x1950
            r0 = 151(0x97, float:2.12E-43)
            goto L_0x09d6
        L_0x09ee:
            boolean r1 = r0 instanceof X.AnonymousClass9HC
            if (r1 == 0) goto L_0x0a1c
            int r0 = X.AnonymousClass8BR.A03(r2)
            boolean r0 = X.C17890vO.A1R(r0)
            java.lang.String r1 = X.C20108A7n.A0B(r2, r0)
            java.lang.String r0 = "on"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0a11
            r0 = 31
        L_0x0a08:
            X.2Mh r1 = X.AnonymousClass8BR.A0n(r3, r0, r4)
            X.C20108A7n.A0E(r2, r1)
            goto L_0x086c
        L_0x0a11:
            java.lang.String r0 = "off"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x195e
            r0 = 32
            goto L_0x0a08
        L_0x0a1c:
            boolean r1 = r0 instanceof X.AnonymousClass9HD
            if (r1 == 0) goto L_0x0a4c
            r1 = 0
            X.C18070vi.A0e(r3, r1, r2)
            X.EE9 r0 = r2.messageStubParameters_
            java.lang.String r6 = X.C17880vN.A0w(r0, r1)
            java.lang.String r0 = "on"
            boolean r0 = X.C18070vi.A18(r6, r0)
            if (r0 == 0) goto L_0x0a41
            r0 = 137(0x89, float:1.92E-43)
        L_0x0a34:
            X.2Mh r1 = X.AnonymousClass8BR.A0n(r3, r0, r4)
            X.1Dw r3 = com.whatsapp.jid.UserJid.Companion
            java.lang.String r0 = r2.participant_
            X.AnonymousClass8BT.A1F(r3, r1, r0)
            goto L_0x086c
        L_0x0a41:
            java.lang.String r0 = "off"
            boolean r0 = X.C18070vi.A18(r6, r0)
            if (r0 == 0) goto L_0x1965
            r0 = 138(0x8a, float:1.93E-43)
            goto L_0x0a34
        L_0x0a4c:
            boolean r1 = r0 instanceof X.C178939Fv
            if (r1 == 0) goto L_0x0a58
            r0 = 33
            X.2Mh r1 = X.AnonymousClass8BR.A0n(r3, r0, r4)
            goto L_0x086c
        L_0x0a58:
            boolean r1 = r0 instanceof X.C179139Gs
            if (r1 == 0) goto L_0x0adf
            X.9Gs r0 = (X.C179139Gs) r0
            r10 = 0
            int r9 = X.C72453Mb.A0G(r3, r2, r10)
            int r1 = X.AnonymousClass8BR.A03(r2)
            r8 = 1
            boolean r1 = X.AnonymousClass000.A1T(r1, r9)
            java.lang.String r6 = X.C20108A7n.A0B(r2, r1)
            X.C18070vi.A0b(r6)
            boolean r11 = r0 instanceof X.AnonymousClass9HB
            r1 = 3
            X.C18070vi.A0d(r6, r1)
            r20 = 0
            if (r11 == 0) goto L_0x0acf
            r17 = 169(0xa9, float:2.37E-43)
            X.2MQ r1 = new X.2MQ
            r18 = r4
            r22 = r10
            r14 = r1
            r15 = r3
            r16 = r6
            r14.<init>(r15, r16, r17, r18, r20, r22)
        L_0x0a8c:
            X.EE9 r3 = r2.messageStubParameters_
            java.lang.String r5 = X.C17880vN.A0w(r3, r8)
            X.C18070vi.A0X(r5)
            java.lang.String[] r4 = new java.lang.String[r8]
            java.lang.String r3 = "_"
            r4[r10] = r3
            java.util.List r5 = X.AnonymousClass1YF.A0S(r5, r4, r10)
            int r4 = r5.size()
            r3 = 4
            if (r4 >= r3) goto L_0x0aa7
            r8 = 0
        L_0x0aa7:
            X.C17960vV.A0D(r8)
            java.lang.Object r4 = r5.get(r9)
            java.lang.String r3 = "1"
            boolean r3 = X.C18070vi.A18(r4, r3)
            if (r3 == 0) goto L_0x0ac3
            X.11S r0 = r0.A00
            com.whatsapp.jid.PhoneUserJid r0 = X.AnonymousClass11S.A00(r0)
        L_0x0abc:
            X.1BI r0 = (X.AnonymousClass1BI) r0
            r1.A0d(r0)
            goto L_0x04ab
        L_0x0ac3:
            X.1Dw r0 = com.whatsapp.jid.UserJid.Companion
            r0 = 3
            java.lang.String r0 = X.C17880vN.A0w(r5, r0)
            com.whatsapp.jid.UserJid r0 = X.C22941Dw.A03(r0)
            goto L_0x0abc
        L_0x0acf:
            r17 = 170(0xaa, float:2.38E-43)
            X.985 r1 = new X.985
            r18 = r4
            r22 = r10
            r14 = r1
            r15 = r3
            r16 = r6
            r14.<init>(r15, r16, r17, r18, r20, r22)
            goto L_0x0a8c
        L_0x0adf:
            boolean r1 = r0 instanceof X.AnonymousClass9GP
            if (r1 == 0) goto L_0x0afe
            r0 = 60
            X.2MJ r1 = new X.2MJ
            r1.<init>(r3, r0, r4)
            int r0 = X.AnonymousClass8BR.A03(r2)
            boolean r0 = X.AnonymousClass000.A1R(r0)
            java.lang.String r0 = X.C20108A7n.A0B(r2, r0)
            int r0 = java.lang.Integer.parseInt(r0)
            r1.A00 = r0
            goto L_0x04ab
        L_0x0afe:
            boolean r1 = r0 instanceof X.AnonymousClass9GO
            if (r1 == 0) goto L_0x0b2d
            r6 = 1
            X.C18070vi.A0d(r3, r6)
            r0 = 80
            X.97h r1 = new X.97h
            r1.<init>(r3, r0, r4)
            int r0 = X.AnonymousClass8BR.A03(r2)
            if (r0 <= r6) goto L_0x0b2b
            X.EE9 r0 = r2.messageStubParameters_
            java.lang.String r0 = X.C17880vN.A0w(r0, r6)
            com.whatsapp.jid.UserJid r4 = X.C22941Dw.A02(r0)
            if (r4 != 0) goto L_0x0b26
        L_0x0b1f:
            X.1BI r0 = r3.A00
            boolean r0 = r0 instanceof com.whatsapp.jid.UserJid
        L_0x0b23:
            X.C17960vV.A0D(r0)
        L_0x0b26:
            r1.A0d(r4)
            goto L_0x04ab
        L_0x0b2b:
            r4 = 0
            goto L_0x0b1f
        L_0x0b2d:
            boolean r1 = r0 instanceof X.AnonymousClass9GN
            if (r1 == 0) goto L_0x0b47
            r0 = 1
            X.C18070vi.A0d(r3, r0)
            r0 = 71
            X.97f r1 = new X.97f
            r1.<init>(r3, r0, r4)
            java.lang.String r3 = X.C20108A7n.A0A(r2)
            X.1Dw r0 = com.whatsapp.jid.UserJid.Companion
            X.AnonymousClass8BT.A1F(r0, r1, r3)
            goto L_0x04ab
        L_0x0b47:
            boolean r1 = r0 instanceof X.AnonymousClass9GM
            if (r1 == 0) goto L_0x0b77
            r0 = 57
            X.97p r1 = new X.97p
            r1.<init>(r3, r0, r4)
            java.lang.String r3 = X.C20108A7n.A0A(r2)
            X.1Dw r0 = com.whatsapp.jid.UserJid.Companion
            X.AnonymousClass8BT.A1F(r0, r1, r3)
            r3 = 1
            X.EE9 r0 = r2.messageStubParameters_
            java.lang.String r0 = X.C17880vN.A0w(r0, r3)
            int r0 = java.lang.Integer.parseInt(r0)
            r1.A00 = r0
            r3 = 2
            X.EE9 r0 = r2.messageStubParameters_
            java.lang.String r0 = X.C17880vN.A0w(r0, r3)
            int r0 = java.lang.Integer.parseInt(r0)
            r1.A01 = r0
            goto L_0x04ab
        L_0x0b77:
            boolean r1 = r0 instanceof X.AnonymousClass9GL
            if (r1 == 0) goto L_0x0b9b
            r0 = 81
            X.2Mh r1 = X.AnonymousClass8BR.A0n(r3, r0, r4)
            java.lang.String r0 = r2.participant_
            X.1Dw r4 = com.whatsapp.jid.UserJid.Companion
            X.AnonymousClass8BT.A1F(r4, r1, r0)
            X.EE9 r0 = r2.messageStubParameters_
            java.util.ArrayList r5 = X.AnonymousClass000.A14(r0)
            r3 = 0
        L_0x0b8f:
            int r0 = X.AnonymousClass8BR.A03(r2)
            if (r3 >= r0) goto L_0x1708
            X.C20108A7n.A0D(r4, r2, r5, r3)
            int r3 = r3 + 1
            goto L_0x0b8f
        L_0x0b9b:
            boolean r1 = r0 instanceof X.AnonymousClass9GK
            if (r1 == 0) goto L_0x0bc6
            r0 = 82
            X.2Mh r1 = X.AnonymousClass8BR.A0n(r3, r0, r4)
            java.lang.String r0 = r2.participant_
            X.1Dw r4 = com.whatsapp.jid.UserJid.Companion
            com.whatsapp.jid.UserJid r0 = r4.A04(r0)
            X.C17960vV.A07(r0)
            r1.A0d(r0)
            X.EE9 r0 = r2.messageStubParameters_
            java.util.ArrayList r5 = X.AnonymousClass000.A14(r0)
            r3 = 0
        L_0x0bba:
            int r0 = X.AnonymousClass8BR.A03(r2)
            if (r3 >= r0) goto L_0x1708
            X.C20108A7n.A0C(r4, r2, r5, r3)
            int r3 = r3 + 1
            goto L_0x0bba
        L_0x0bc6:
            boolean r1 = r0 instanceof X.AnonymousClass9GJ
            if (r1 == 0) goto L_0x0bde
            r0 = 97
            X.2ML r1 = new X.2ML
            r1.<init>(r3, r0, r4)
            X.9Ke r4 = r2.A0R()
            X.9Ke r0 = X.C179859Ke.A05
            r3 = 1
            if (r4 != r0) goto L_0x15a4
            r1.A01 = r3
            goto L_0x04ab
        L_0x0bde:
            boolean r1 = r0 instanceof X.AnonymousClass9GI
            if (r1 == 0) goto L_0x0c24
            int r0 = X.AnonymousClass8BR.A03(r2)
            r9 = 1
            boolean r0 = X.AnonymousClass000.A1R(r0)
            java.lang.String r0 = X.C20108A7n.A0B(r2, r0)
            int r8 = java.lang.Integer.parseInt(r0)
            X.1BI r6 = r3.A00
            boolean r0 = r6 instanceof com.whatsapp.jid.GroupJid
            if (r0 == 0) goto L_0x0c1a
            r0 = 56
            X.2MS r1 = new X.2MS
            r1.<init>(r3, r0, r4)
            r1.A00 = r8
        L_0x0c02:
            int r0 = X.AnonymousClass8BR.A03(r2)
            if (r0 <= r9) goto L_0x0c18
            X.EE9 r0 = r2.messageStubParameters_
            java.lang.String r0 = X.C17880vN.A0w(r0, r9)
            com.whatsapp.jid.UserJid r4 = X.C22941Dw.A02(r0)
            if (r4 != 0) goto L_0x0b26
        L_0x0c14:
            boolean r0 = r6 instanceof com.whatsapp.jid.UserJid
            goto L_0x0b23
        L_0x0c18:
            r4 = 0
            goto L_0x0c14
        L_0x0c1a:
            r0 = 59
            X.2MA r1 = new X.2MA
            r1.<init>(r3, r0, r4)
            r1.A00 = r8
            goto L_0x0c02
        L_0x0c24:
            boolean r1 = r0 instanceof X.C179129Gr
            if (r1 == 0) goto L_0x0c63
            X.9Gr r0 = (X.C179129Gr) r0
            r6 = 68
            X.2M9 r1 = new X.2M9
            r1.<init>(r3, r6, r4)
            int r4 = X.AnonymousClass8BR.A03(r2)
            r5 = 1
            boolean r4 = X.AnonymousClass000.A1R(r4)
            java.lang.String r4 = X.C20108A7n.A0B(r2, r4)
            int r4 = java.lang.Integer.parseInt(r4)
            r1.A00 = r4
            int r4 = X.AnonymousClass8BR.A03(r2)
            if (r4 <= r5) goto L_0x15d7
            X.EE9 r4 = r2.messageStubParameters_
            java.lang.String r4 = X.C17880vN.A0w(r4, r5)
            com.whatsapp.jid.UserJid r4 = X.C22941Dw.A02(r4)
            if (r4 == 0) goto L_0x15d7
            X.11S r0 = r0.A00
            boolean r0 = r0.A0O(r4)
            if (r0 != 0) goto L_0x15d7
            r0 = 2
            r1.A00 = r0
            goto L_0x04ab
        L_0x0c63:
            boolean r1 = r0 instanceof X.C179189Gx
            if (r1 == 0) goto L_0x0c96
            X.9Gx r0 = (X.C179189Gx) r0
            r6 = 0
            X.C18070vi.A0e(r3, r6, r2)
            boolean r0 = r0 instanceof X.C179179Gw
            if (r0 == 0) goto L_0x0c8f
            r0 = 27
            X.2Mh r1 = X.AnonymousClass8BR.A0n(r3, r0, r4)
        L_0x0c77:
            X.1Dw r3 = com.whatsapp.jid.UserJid.Companion
            java.lang.String r0 = r2.participant_
            X.AnonymousClass8BT.A1F(r3, r1, r0)
            int r0 = X.AnonymousClass8BR.A03(r2)
            if (r0 <= 0) goto L_0x086c
            X.EE9 r0 = r2.messageStubParameters_
            java.lang.String r0 = X.C17880vN.A0w(r0, r6)
            r1.A0i(r0)
            goto L_0x04ab
        L_0x0c8f:
            r0 = 131(0x83, float:1.84E-43)
            X.2Mh r1 = X.AnonymousClass8BR.A0n(r3, r0, r4)
            goto L_0x0c77
        L_0x0c96:
            boolean r1 = r0 instanceof X.AnonymousClass9GH
            if (r1 == 0) goto L_0x0cc2
            r0 = 69
            X.2MD r1 = new X.2MD
            r1.<init>(r3, r0, r4)
            X.9Ke r0 = r2.A0R()
            int r6 = r0.ordinal()
            r5 = 2
            r4 = 129(0x81, float:1.81E-43)
            r0 = 128(0x80, float:1.794E-43)
            if (r6 == r0) goto L_0x0cbe
            r5 = 3
            r3 = 194(0xc2, float:2.72E-43)
            if (r6 == r4) goto L_0x0cbe
            r5 = 4
            r0 = 201(0xc9, float:2.82E-43)
            if (r6 == r3) goto L_0x0cbe
            r5 = 5
            if (r6 == r0) goto L_0x0cbe
            r5 = 1
        L_0x0cbe:
            r1.A00 = r5
            goto L_0x04ab
        L_0x0cc2:
            boolean r1 = r0 instanceof X.AnonymousClass9GG
            if (r1 == 0) goto L_0x0cde
            r0 = 61
            X.2MD r1 = new X.2MD
            r1.<init>(r3, r0, r4)
            X.9Ke r0 = r2.A0R()
            int r0 = r0.ordinal()
            switch(r0) {
                case 76: goto L_0x161c;
                case 77: goto L_0x161f;
                case 78: goto L_0x1619;
                case 79: goto L_0x0cd8;
                case 80: goto L_0x15e4;
                case 81: goto L_0x0cd8;
                case 82: goto L_0x15e6;
                case 83: goto L_0x162b;
                case 84: goto L_0x0cd8;
                case 85: goto L_0x15e8;
                case 86: goto L_0x0cd8;
                case 87: goto L_0x15ea;
                case 88: goto L_0x163d;
                case 89: goto L_0x163a;
                case 90: goto L_0x1637;
                case 91: goto L_0x1634;
                case 92: goto L_0x1625;
                case 93: goto L_0x1622;
                case 94: goto L_0x0cd8;
                case 95: goto L_0x15ec;
                case 96: goto L_0x0cd8;
                case 97: goto L_0x15ee;
                case 98: goto L_0x1628;
                case 99: goto L_0x0cd8;
                case 100: goto L_0x0cd8;
                case 101: goto L_0x162e;
                case 102: goto L_0x1640;
                case 103: goto L_0x1631;
                case 104: goto L_0x1604;
                case 105: goto L_0x1610;
                case 106: goto L_0x160a;
                case 107: goto L_0x1607;
                case 108: goto L_0x1601;
                case 109: goto L_0x15f8;
                case 110: goto L_0x15f2;
                case 111: goto L_0x15f0;
                case 112: goto L_0x1616;
                case 113: goto L_0x160d;
                case 114: goto L_0x15fe;
                case 115: goto L_0x15f5;
                case 116: goto L_0x1613;
                case 117: goto L_0x15fb;
                default: goto L_0x0cd8;
            }
        L_0x0cd8:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>()
            throw r0
        L_0x0cde:
            boolean r1 = r0 instanceof X.AnonymousClass9GF
            if (r1 == 0) goto L_0x0d36
            X.9Ke r0 = r2.A0R()
            int r0 = r0.ordinal()
            switch(r0) {
                case 4: goto L_0x0d18;
                case 5: goto L_0x0d12;
                case 6: goto L_0x0d15;
                case 7: goto L_0x0d0f;
                case 8: goto L_0x0d0c;
                case 16: goto L_0x0d1e;
                case 17: goto L_0x0d21;
                case 18: goto L_0x0d1b;
                case 60: goto L_0x0d2d;
                case 61: goto L_0x0d27;
                case 64: goto L_0x0d33;
                case 65: goto L_0x0d30;
                case 99: goto L_0x0d2a;
                case 100: goto L_0x0d24;
                default: goto L_0x0ced;
            }
        L_0x0ced:
            r8 = 0
        L_0x0cee:
            r6 = 1
            boolean r0 = X.AnonymousClass000.A1O(r8)
            X.C17960vV.A0D(r0)
            X.2MB r1 = new X.2MB
            r1.<init>(r3, r8, r4)
            int r0 = X.AnonymousClass8BR.A03(r2)
            if (r0 != r6) goto L_0x04ab
            r3 = 0
            X.EE9 r0 = r2.messageStubParameters_
            java.lang.String r0 = X.C17880vN.A0w(r0, r3)
            r1.A00 = r0
            goto L_0x04ab
        L_0x0d0c:
            r8 = 23
            goto L_0x0cee
        L_0x0d0f:
            r8 = 22
            goto L_0x0cee
        L_0x0d12:
            r8 = 25
            goto L_0x0cee
        L_0x0d15:
            r8 = 24
            goto L_0x0cee
        L_0x0d18:
            r8 = 26
            goto L_0x0cee
        L_0x0d1b:
            r8 = 34
            goto L_0x0cee
        L_0x0d1e:
            r8 = 35
            goto L_0x0cee
        L_0x0d21:
            r8 = 36
            goto L_0x0cee
        L_0x0d24:
            r8 = 47
            goto L_0x0cee
        L_0x0d27:
            r8 = 48
            goto L_0x0cee
        L_0x0d2a:
            r8 = 46
            goto L_0x0cee
        L_0x0d2d:
            r8 = 49
            goto L_0x0cee
        L_0x0d30:
            r8 = 50
            goto L_0x0cee
        L_0x0d33:
            r8 = 55
            goto L_0x0cee
        L_0x0d36:
            boolean r1 = r0 instanceof X.AnonymousClass9GE
            if (r1 == 0) goto L_0x0d5c
            X.9Ke r0 = r2.A0R()
            int r8 = r0.ordinal()
            r6 = 1
            r0 = 75
            if (r8 == r0) goto L_0x0d59
            r1 = 118(0x76, float:1.65E-43)
            r0 = 63
            if (r8 == r1) goto L_0x0d4f
            r0 = 0
            r6 = 0
        L_0x0d4f:
            X.C17960vV.A0D(r6)
            X.20i r1 = new X.20i
            r1.<init>(r3, r0, r4)
            goto L_0x04ab
        L_0x0d59:
            r0 = 62
            goto L_0x0d4f
        L_0x0d5c:
            boolean r1 = r0 instanceof X.AnonymousClass9GD
            if (r1 == 0) goto L_0x0d76
            X.C18070vi.A0i(r3, r2)
            X.9Ke r6 = r2.A0R()
            X.9Ke r1 = X.C179859Ke.BIZ_BOT_1P_MESSAGING_ENABLED
            r0 = 155(0x9b, float:2.17E-43)
            if (r6 != r1) goto L_0x0d6f
            r0 = 147(0x93, float:2.06E-43)
        L_0x0d6f:
            X.2M8 r1 = new X.2M8
            r1.<init>(r3, r0, r4)
            goto L_0x04ab
        L_0x0d76:
            boolean r1 = r0 instanceof X.AnonymousClass9GC
            if (r1 == 0) goto L_0x0d95
            r0 = 58
            X.2MI r1 = new X.2MI
            r1.<init>(r3, r0, r4)
            int r0 = X.AnonymousClass8BR.A03(r2)
            boolean r0 = X.C17890vO.A1R(r0)
            java.lang.String r0 = X.C20108A7n.A0B(r2, r0)
            boolean r0 = java.lang.Boolean.parseBoolean(r0)
            r1.A00 = r0
            goto L_0x04ab
        L_0x0d95:
            boolean r1 = r0 instanceof X.AnonymousClass9GB
            if (r1 == 0) goto L_0x0dbb
            r0 = 18
            X.20i r1 = new X.20i
            r1.<init>(r3, r0, r4)
            java.lang.String r0 = X.C20108A7n.A0A(r2)
            X.1BI r4 = X.AnonymousClass3MX.A0l(r0)
            if (r4 == 0) goto L_0x04ab
            X.1BI r0 = r3.A00
            boolean r0 = r4.equals(r0)
            if (r0 != 0) goto L_0x04ab
            com.whatsapp.jid.UserJid r0 = X.C22941Dw.A00(r4)
            r1.A0d(r0)
            goto L_0x04ab
        L_0x0dbb:
            boolean r1 = r0 instanceof X.AnonymousClass9GA
            if (r1 == 0) goto L_0x0ddf
            r0 = 15
            X.2Mh r1 = X.AnonymousClass8BR.A0n(r3, r0, r4)
            java.lang.String r0 = r2.participant_
            X.1Dw r4 = com.whatsapp.jid.UserJid.Companion
            X.AnonymousClass8BT.A1F(r4, r1, r0)
            X.EE9 r0 = r2.messageStubParameters_
            java.util.ArrayList r5 = X.AnonymousClass000.A14(r0)
            r3 = 0
        L_0x0dd3:
            int r0 = X.AnonymousClass8BR.A03(r2)
            if (r3 >= r0) goto L_0x1708
            X.C20108A7n.A0D(r4, r2, r5, r3)
            int r3 = r3 + 1
            goto L_0x0dd3
        L_0x0ddf:
            boolean r1 = r0 instanceof X.AnonymousClass9G9
            if (r1 == 0) goto L_0x0e0a
            r0 = 16
            X.2Mh r1 = X.AnonymousClass8BR.A0n(r3, r0, r4)
            java.lang.String r0 = r2.participant_
            X.1Dw r4 = com.whatsapp.jid.UserJid.Companion
            com.whatsapp.jid.UserJid r0 = r4.A04(r0)
            X.C17960vV.A07(r0)
            r1.A0d(r0)
            X.EE9 r0 = r2.messageStubParameters_
            java.util.ArrayList r5 = X.AnonymousClass000.A14(r0)
            r3 = 0
        L_0x0dfe:
            int r0 = X.AnonymousClass8BR.A03(r2)
            if (r3 >= r0) goto L_0x1708
            X.C20108A7n.A0C(r4, r2, r5, r3)
            int r3 = r3 + 1
            goto L_0x0dfe
        L_0x0e0a:
            boolean r1 = r0 instanceof X.AnonymousClass9G8
            if (r1 == 0) goto L_0x0e2e
            r6 = 1
            X.98A r1 = new X.98A
            r1.<init>(r3, r6, r4)
            java.lang.String r0 = X.C20108A7n.A0A(r2)
            r1.A18(r0)
            int r0 = X.AnonymousClass8BR.A03(r2)
            if (r0 <= r6) goto L_0x0e29
            X.EE9 r0 = r2.messageStubParameters_
            java.lang.String r0 = X.C17880vN.A0w(r0, r6)
            r1.A01 = r0
        L_0x0e29:
            X.C20108A7n.A0E(r2, r1)
            goto L_0x04ab
        L_0x0e2e:
            boolean r1 = r0 instanceof X.AnonymousClass9G7
            if (r1 == 0) goto L_0x0e72
            java.lang.String r0 = r2.participant_
            X.1Dw r6 = com.whatsapp.jid.UserJid.Companion
            com.whatsapp.jid.UserJid r1 = r6.A04(r0)
            r8 = 7
            r0 = 14
            if (r1 != 0) goto L_0x0e40
            r0 = 7
        L_0x0e40:
            X.2Mh r1 = X.AnonymousClass8BR.A0n(r3, r0, r4)
            r4 = 0
            if (r0 != r8) goto L_0x0e6c
            X.EE9 r0 = r2.messageStubParameters_
            java.lang.String r0 = X.C17880vN.A0w(r0, r4)
            X.AnonymousClass8BT.A1F(r6, r1, r0)
            r4 = 1
        L_0x0e51:
            int r0 = X.AnonymousClass8BR.A03(r2)
            if (r0 <= r4) goto L_0x086c
            int r0 = X.AnonymousClass8BR.A03(r2)
            int r0 = r0 - r4
            java.util.ArrayList r3 = X.C17880vN.A0z(r0)
        L_0x0e60:
            int r0 = X.AnonymousClass8BR.A03(r2)
            if (r4 >= r0) goto L_0x1683
            X.C20108A7n.A0D(r6, r2, r3, r4)
            int r4 = r4 + 1
            goto L_0x0e60
        L_0x0e6c:
            java.lang.String r0 = r2.participant_
            X.AnonymousClass8BT.A1F(r6, r1, r0)
            goto L_0x0e51
        L_0x0e72:
            boolean r1 = r0 instanceof X.C179119Gq
            if (r1 == 0) goto L_0x0eac
            X.9Gq r0 = (X.C179119Gq) r0
            r6 = 10
            X.2MN r1 = new X.2MN
            r1.<init>(r3, r6, r4)
            X.190 r3 = r0.A0F
            r1.A02 = r3
            java.lang.String r3 = r2.participant_
            X.1Dw r4 = com.whatsapp.jid.UserJid.Companion
            com.whatsapp.jid.UserJid r3 = r4.A04(r3)
            if (r3 == 0) goto L_0x0020
            r1.A01 = r3
            java.lang.String r3 = X.C20108A7n.A0A(r2)
            com.whatsapp.jid.UserJid r4 = r4.A04(r3)
            boolean r3 = r4 instanceof X.AnonymousClass1E2
            if (r3 == 0) goto L_0x164c
            X.1Ln r0 = r0.A00
            X.1E1 r4 = (X.AnonymousClass1E1) r4
            com.whatsapp.jid.PhoneUserJid r4 = r0.A0D(r4)
            if (r4 != 0) goto L_0x1650
            java.lang.String r0 = "GroupParticipantChangedNumberWebQuery/restoreFMessage/LID -> PN mapping unknown"
        L_0x0ea7:
            com.whatsapp.util.Log.w((java.lang.String) r0)
            goto L_0x0020
        L_0x0eac:
            boolean r1 = r0 instanceof X.C179109Gp
            if (r1 == 0) goto L_0x0ec2
            X.9Gp r0 = (X.C179109Gp) r0
            r1 = 9
            X.2Mh r1 = X.AnonymousClass8BR.A0n(r3, r1, r4)
            java.lang.String r3 = r2.participant_
            X.1Dw r5 = com.whatsapp.jid.UserJid.Companion
            X.AnonymousClass8BT.A1F(r5, r1, r3)
            r6 = 0
            goto L_0x12fb
        L_0x0ec2:
            boolean r1 = r0 instanceof X.AnonymousClass9G6
            if (r1 == 0) goto L_0x0ee5
            int r0 = X.AnonymousClass8BR.A03(r2)
            r6 = 0
            r1 = 1
            if (r0 != r1) goto L_0x1655
            r0 = 5
            X.2Mh r1 = X.AnonymousClass8BR.A0n(r3, r0, r4)
            X.EE9 r0 = r2.messageStubParameters_
            java.lang.String r0 = X.C17880vN.A0w(r0, r6)
            com.whatsapp.jid.UserJid r0 = X.C22941Dw.A02(r0)
            X.C17960vV.A07(r0)
            r1.A0d(r0)
            goto L_0x04ab
        L_0x0ee5:
            boolean r1 = r0 instanceof X.AnonymousClass9G5
            if (r1 == 0) goto L_0x0f09
            r0 = 52
            X.2Mh r1 = X.AnonymousClass8BR.A0n(r3, r0, r4)
            java.lang.String r0 = r2.participant_
            X.1Dw r4 = com.whatsapp.jid.UserJid.Companion
            X.AnonymousClass8BT.A1F(r4, r1, r0)
            X.EE9 r0 = r2.messageStubParameters_
            java.util.ArrayList r5 = X.AnonymousClass000.A14(r0)
            r3 = 0
        L_0x0efd:
            int r0 = X.AnonymousClass8BR.A03(r2)
            if (r3 >= r0) goto L_0x1708
            X.C20108A7n.A0C(r4, r2, r5, r3)
            int r3 = r3 + 1
            goto L_0x0efd
        L_0x0f09:
            boolean r1 = r0 instanceof X.C179099Go
            if (r1 == 0) goto L_0x1007
            X.9Go r0 = (X.C179099Go) r0
            boolean r1 = r0 instanceof X.C172608th
            if (r1 == 0) goto L_0x0f4f
            r1 = 0
            X.C18070vi.A0d(r3, r1)
            r17 = 101(0x65, float:1.42E-43)
            r16 = 0
            X.98U r1 = new X.98U
            r18 = r4
            r14 = r1
            r15 = r3
            r14.<init>((X.AnonymousClass205) r15, (X.C62502rV) r16, (int) r17, (long) r18)
        L_0x0f24:
            java.lang.String r3 = r2.participant_
            X.1BI r3 = X.AnonymousClass3MX.A0l(r3)
            r1.A0d(r3)
            java.util.ArrayList r5 = X.AnonymousClass000.A13()
            boolean r3 = r0 instanceof X.C172638tk
            if (r3 == 0) goto L_0x1687
            java.util.HashSet r6 = X.C17880vN.A12()
            int r8 = X.AnonymousClass8BR.A03(r2)
            r4 = 3
        L_0x0f3e:
            if (r4 >= r8) goto L_0x16a2
            X.EE9 r3 = r2.messageStubParameters_
            java.lang.String r3 = X.C17880vN.A0w(r3, r4)
            X.C18070vi.A0X(r3)
            r6.add(r3)
            int r4 = r4 + 1
            goto L_0x0f3e
        L_0x0f4f:
            boolean r1 = r0 instanceof X.C172638tk
            if (r1 == 0) goto L_0x0fa4
            r9 = r0
            X.8tk r9 = (X.C172638tk) r9
            r6 = 0
            int r8 = X.C72453Mb.A0G(r3, r2, r6)
            r17 = 101(0x65, float:1.42E-43)
            r16 = 0
            X.98U r1 = new X.98U
            r18 = r4
            r14 = r1
            r15 = r3
            r14.<init>((X.AnonymousClass205) r15, (X.C62502rV) r16, (int) r17, (long) r18)
            X.EE9 r3 = r2.messageStubParameters_
            java.lang.String r10 = X.C17880vN.A0w(r3, r6)
            r4 = 1
            X.EE9 r3 = r2.messageStubParameters_
            java.lang.String r5 = X.C17880vN.A0w(r3, r4)
            X.1yz r3 = X.AnonymousClass1EC.A01
            X.1EC r4 = r3.A02(r10)
            java.util.ArrayList r10 = X.AnonymousClass000.A13()
            if (r4 == 0) goto L_0x0fa0
            X.2md r3 = new X.2md
            r3.<init>(r4, r5, r8, r6)
            r10.add(r3)
            X.1MF r3 = r9.A01
            X.1EC r8 = r3.A03(r4)
            if (r8 == 0) goto L_0x0fa0
            X.1CJ r3 = r9.A00
            java.lang.String r5 = r3.A0F(r8)
            r4 = 1
            X.2md r3 = new X.2md
            r3.<init>(r8, r5, r4, r6)
            r10.add(r3)
        L_0x0fa0:
            r1.A1D(r10)
            goto L_0x0f24
        L_0x0fa4:
            boolean r1 = r0 instanceof X.C172628tj
            if (r1 == 0) goto L_0x0fe2
            java.lang.String r9 = X.C20108A7n.A0A(r2)
            int r1 = X.AnonymousClass8BR.A03(r2)
            r8 = 1
            if (r1 <= r8) goto L_0x0fe0
            X.EE9 r1 = r2.messageStubParameters_
            java.lang.String r6 = X.C17880vN.A0w(r1, r8)
        L_0x0fb9:
            X.C18070vi.A0d(r3, r8)
            r17 = 106(0x6a, float:1.49E-43)
            r16 = 0
            X.98T r1 = new X.98T
            r18 = r4
            r14 = r1
            r15 = r3
            r14.<init>((X.AnonymousClass205) r15, (X.C62502rV) r16, (int) r17, (long) r18)
            X.1nh r3 = com.whatsapp.jid.GroupJid.Companion
            com.whatsapp.jid.GroupJid r5 = r3.A03(r9)
            if (r5 == 0) goto L_0x0f24
            r4 = 0
            X.2md r3 = new X.2md
            r3.<init>(r5, r6, r8, r4)
            java.util.List r3 = X.C18070vi.A0M(r3)
            r1.A1D(r3)
            goto L_0x0f24
        L_0x0fe0:
            r6 = 0
            goto L_0x0fb9
        L_0x0fe2:
            boolean r1 = r0 instanceof X.C172618ti
            if (r1 == 0) goto L_0x0fee
            r1 = 20
            X.2Mh r1 = X.AnonymousClass8BR.A0n(r3, r1, r4)
            goto L_0x0f24
        L_0x0fee:
            boolean r1 = r0 instanceof X.C172598tg
            if (r1 == 0) goto L_0x0ffe
            r1 = 0
            X.C18070vi.A0d(r3, r1)
            r1 = 79
            X.2Mh r1 = X.AnonymousClass8BR.A0n(r3, r1, r4)
            goto L_0x0f24
        L_0x0ffe:
            r6 = 90
            X.2MU r1 = new X.2MU
            r1.<init>(r3, r6, r4)
            goto L_0x0f24
        L_0x1007:
            boolean r1 = r0 instanceof X.AnonymousClass9G4
            if (r1 == 0) goto L_0x102b
            r0 = 51
            X.2Mh r1 = X.AnonymousClass8BR.A0n(r3, r0, r4)
            java.lang.String r0 = r2.participant_
            X.1Dw r4 = com.whatsapp.jid.UserJid.Companion
            X.AnonymousClass8BT.A1F(r4, r1, r0)
            X.EE9 r0 = r2.messageStubParameters_
            java.util.ArrayList r5 = X.AnonymousClass000.A14(r0)
            r3 = 0
        L_0x101f:
            int r0 = X.AnonymousClass8BR.A03(r2)
            if (r3 >= r0) goto L_0x1708
            X.C20108A7n.A0C(r4, r2, r5, r3)
            int r3 = r3 + 1
            goto L_0x101f
        L_0x102b:
            boolean r1 = r0 instanceof X.AnonymousClass9G3
            if (r1 == 0) goto L_0x103a
            r0 = 21
            X.2Mh r1 = X.AnonymousClass8BR.A0n(r3, r0, r4)
            X.C20108A7n.A0E(r2, r1)
            goto L_0x086c
        L_0x103a:
            boolean r1 = r0 instanceof X.C179089Gn
            if (r1 == 0) goto L_0x105a
            int r0 = X.AnonymousClass8BR.A03(r2)
            boolean r0 = X.C17890vO.A1R(r0)
            java.lang.String r0 = X.C20108A7n.A0B(r2, r0)
            boolean r1 = java.lang.Boolean.parseBoolean(r0)
            r0 = 74
            if (r1 == 0) goto L_0x1054
            r0 = 73
        L_0x1054:
            X.2Mh r1 = X.AnonymousClass8BR.A0n(r3, r0, r4)
            goto L_0x086c
        L_0x105a:
            boolean r1 = r0 instanceof X.AnonymousClass9G2
            if (r1 == 0) goto L_0x10c8
            r0 = 6
            X.2MP r1 = new X.2MP
            r1.<init>(r3, r0, r4)
            X.C20108A7n.A0E(r2, r1)
            r4 = 0
            r1.A0i(r4)
            r6 = 0
            X.EE9 r0 = r2.messageStubParameters_
            java.lang.String r3 = X.C17880vN.A0w(r0, r6)
            java.lang.String r0 = "remove"
            boolean r0 = r0.equalsIgnoreCase(r3)
            if (r0 == 0) goto L_0x10c4
            r1.A19(r4)
        L_0x107d:
            int r3 = r2.bitField0_
            r0 = 134217728(0x8000000, float:3.85186E-34)
            r3 = r3 & r0
            if (r3 == 0) goto L_0x04ab
            X.8aZ r5 = r2.photoChange_
            if (r5 != 0) goto L_0x108a
            X.8aZ r5 = X.C165088aZ.DEFAULT_INSTANCE
        L_0x108a:
            com.whatsapp.data.ProfilePhotoChange r4 = new com.whatsapp.data.ProfilePhotoChange
            r4.<init>()
            int r0 = r5.bitField0_
            r0 = r0 & 2
            boolean r0 = X.AnonymousClass000.A1O(r0)
            r3 = 1
            if (r0 == 0) goto L_0x10a3
            X.DSQ r0 = r5.newPhoto_
            byte[] r0 = r0.A06()
            r4.newPhoto = r0
            r6 = 1
        L_0x10a3:
            int r0 = r5.bitField0_
            r0 = r0 & 1
            if (r0 == 0) goto L_0x10c2
            X.DSQ r0 = r5.oldPhoto_
            byte[] r0 = r0.A06()
            r4.oldPhoto = r0
        L_0x10b1:
            int r0 = r5.bitField0_
            r0 = r0 & 4
            if (r0 == 0) goto L_0x10bf
            int r0 = r5.newPhotoId_
            r4.newPhotoId = r0
        L_0x10bb:
            r1.A00 = r4
            goto L_0x04ab
        L_0x10bf:
            if (r3 == 0) goto L_0x04ab
            goto L_0x10bb
        L_0x10c2:
            r3 = r6
            goto L_0x10b1
        L_0x10c4:
            r1.A19(r3)
            goto L_0x107d
        L_0x10c8:
            boolean r1 = r0 instanceof X.AnonymousClass9G1
            if (r1 == 0) goto L_0x10d7
            r0 = 17
            X.2Mh r1 = X.AnonymousClass8BR.A0n(r3, r0, r4)
            X.C20108A7n.A0E(r2, r1)
            goto L_0x086c
        L_0x10d7:
            boolean r1 = r0 instanceof X.AnonymousClass9G0
            if (r1 == 0) goto L_0x10f3
            r0 = 11
            X.2Mh r1 = X.AnonymousClass8BR.A0n(r3, r0, r4)
            X.C20108A7n.A0E(r2, r1)
            int r0 = X.AnonymousClass8BR.A03(r2)
            if (r0 <= 0) goto L_0x086c
            java.lang.String r0 = X.C20108A7n.A0A(r2)
            r1.A0i(r0)
            goto L_0x04ab
        L_0x10f3:
            boolean r1 = r0 instanceof X.C179079Gm
            if (r1 == 0) goto L_0x1121
            X.9Gm r0 = (X.C179079Gm) r0
            int r1 = X.AnonymousClass8BR.A03(r2)
            r8 = 0
            r6 = 1
            if (r1 != r6) goto L_0x16c5
            r1 = 4
            X.2Mh r1 = X.AnonymousClass8BR.A0n(r3, r1, r4)
            X.EE9 r3 = r2.messageStubParameters_
            java.lang.String r4 = X.C17880vN.A0w(r3, r8)
            X.1Dw r3 = com.whatsapp.jid.UserJid.Companion
            X.AnonymousClass8BT.A1F(r3, r1, r4)
            X.11S r3 = r0.A00
            X.1BI r0 = r1.A0H()
            boolean r0 = r3.A0O(r0)
            if (r0 == 0) goto L_0x04ab
            r1.A00 = r6
            goto L_0x04ab
        L_0x1121:
            boolean r1 = r0 instanceof X.C179069Gl
            if (r1 == 0) goto L_0x115d
            X.9Gl r0 = (X.C179069Gl) r0
            r6 = 28
            X.2MN r1 = new X.2MN
            r1.<init>(r3, r6, r4)
            X.190 r3 = r0.A0F
            r1.A02 = r3
            java.lang.String r3 = X.C20108A7n.A0A(r2)
            X.1Dw r5 = com.whatsapp.jid.UserJid.Companion
            com.whatsapp.jid.UserJid r3 = r5.A04(r3)
            if (r3 == 0) goto L_0x0020
            r1.A01 = r3
            r4 = 1
            X.EE9 r3 = r2.messageStubParameters_
            java.lang.String r3 = X.C17880vN.A0w(r3, r4)
            com.whatsapp.jid.UserJid r4 = r5.A04(r3)
            boolean r3 = r4 instanceof X.AnonymousClass1E2
            if (r3 == 0) goto L_0x170c
            X.1Ln r0 = r0.A00
            X.1E1 r4 = (X.AnonymousClass1E1) r4
            com.whatsapp.jid.PhoneUserJid r4 = r0.A0D(r4)
            if (r4 != 0) goto L_0x1710
            java.lang.String r0 = "ContactChangedNumberWebQuery/restoreFMessage/LID -> PN mapping unknown"
            goto L_0x0ea7
        L_0x115d:
            boolean r1 = r0 instanceof X.AnonymousClass9H4
            if (r1 == 0) goto L_0x1183
            r0 = 0
            X.C18070vi.A0e(r3, r0, r2)
            java.lang.String r8 = X.AnonymousClass9SZ.A00(r2, r0)
            if (r8 != 0) goto L_0x116d
            java.lang.String r8 = ""
        L_0x116d:
            X.1Dw r1 = com.whatsapp.jid.UserJid.Companion
            java.lang.String r0 = r2.participant_
            com.whatsapp.jid.UserJid r6 = r1.A04(r0)
            r0 = 145(0x91, float:2.03E-43)
            X.2Mh r1 = X.AnonymousClass8BR.A0n(r3, r0, r4)
            r1.A0d(r6)
            r1.A0i(r8)
            goto L_0x04ab
        L_0x1183:
            boolean r1 = r0 instanceof X.AnonymousClass9Fz
            if (r1 == 0) goto L_0x11d3
            r6 = 0
            int r8 = X.C72453Mb.A0G(r3, r2, r6)
            r17 = 107(0x6b, float:1.5E-43)
            r16 = 0
            X.2Mb r1 = new X.2Mb
            r18 = r4
            r14 = r1
            r15 = r3
            r14.<init>((X.AnonymousClass205) r15, (X.C62502rV) r16, (int) r17, (long) r18)
            java.lang.String r0 = r2.participant_
            r4 = 0
            if (r0 == 0) goto L_0x11d1
            com.whatsapp.jid.Jid r3 = X.AnonymousClass3MX.A0n(r0)
            boolean r0 = r3 instanceof com.whatsapp.jid.UserJid
            if (r0 != 0) goto L_0x11a7
            r3 = r4
        L_0x11a7:
            X.1BI r3 = (X.AnonymousClass1BI) r3
        L_0x11a9:
            r1.A0d(r3)
            int r0 = X.AnonymousClass8BR.A03(r2)
            if (r0 < r8) goto L_0x04ab
            X.EE9 r0 = r2.messageStubParameters_
            java.lang.String r0 = X.C17880vN.A0w(r0, r6)
            if (r0 == 0) goto L_0x11c5
            com.whatsapp.jid.Jid r3 = X.AnonymousClass3MX.A0n(r0)
            boolean r0 = r3 instanceof X.AnonymousClass1EC
            if (r0 == 0) goto L_0x11c3
            r4 = r3
        L_0x11c3:
            com.whatsapp.jid.GroupJid r4 = (com.whatsapp.jid.GroupJid) r4
        L_0x11c5:
            r3 = 1
            X.EE9 r0 = r2.messageStubParameters_
            java.lang.String r0 = X.C17880vN.A0w(r0, r3)
            r1.A1E(r4, r0)
            goto L_0x04ab
        L_0x11d1:
            r3 = r4
            goto L_0x11a9
        L_0x11d3:
            boolean r1 = r0 instanceof X.AnonymousClass9H3
            if (r1 == 0) goto L_0x11fb
            r0 = 0
            X.C18070vi.A0e(r3, r0, r2)
            java.lang.String r1 = X.AnonymousClass9SZ.A00(r2, r0)
            java.lang.String r0 = "on"
            boolean r0 = X.C18070vi.A18(r1, r0)
            if (r0 == 0) goto L_0x0020
            X.1Dw r1 = com.whatsapp.jid.UserJid.Companion
            java.lang.String r0 = r2.participant_
            com.whatsapp.jid.UserJid r6 = r1.A04(r0)
            r0 = 177(0xb1, float:2.48E-43)
            X.987 r1 = new X.987
            r1.<init>(r3, r0, r4)
            r1.A0d(r6)
            goto L_0x04ab
        L_0x11fb:
            boolean r1 = r0 instanceof X.AnonymousClass9H8
            if (r1 == 0) goto L_0x1227
            X.9H8 r0 = (X.AnonymousClass9H8) r0
            X.C18070vi.A0i(r3, r2)
            X.1CJ r1 = r0.A00
            X.1BI r0 = r3.A00
            java.lang.String r8 = r1.A0F(r0)
            if (r8 != 0) goto L_0x1210
            java.lang.String r8 = ""
        L_0x1210:
            X.1Dw r1 = com.whatsapp.jid.UserJid.Companion
            java.lang.String r0 = r2.participant_
            com.whatsapp.jid.UserJid r6 = r1.A04(r0)
            r0 = 168(0xa8, float:2.35E-43)
            X.986 r1 = new X.986
            r1.<init>(r3, r0, r4)
            r1.A0i(r8)
            r1.A0d(r6)
            goto L_0x04ab
        L_0x1227:
            boolean r1 = r0 instanceof X.AnonymousClass9H7
            if (r1 == 0) goto L_0x1270
            X.9H7 r0 = (X.AnonymousClass9H7) r0
            r1 = 0
            X.C18070vi.A0e(r3, r1, r2)
            java.lang.String r11 = X.AnonymousClass9SZ.A00(r2, r1)
            X.1yz r1 = X.AnonymousClass1EC.A01
            X.1BI r1 = r3.A00
            X.1EC r8 = X.C42941yz.A00(r1)
            X.1CJ r0 = r0.A00
            java.lang.String r9 = r0.A0F(r1)
            if (r9 != 0) goto L_0x1247
            java.lang.String r9 = ""
        L_0x1247:
            X.1Dw r1 = com.whatsapp.jid.UserJid.Companion
            java.lang.String r0 = r2.participant_
            com.whatsapp.jid.UserJid r6 = r1.A04(r0)
            r0 = 2
            java.lang.Integer[] r14 = X.AnonymousClass00R.A00(r0)
            int r10 = r14.length
            r1 = 0
        L_0x1256:
            if (r1 >= r10) goto L_0x1715
            r15 = r14[r1]
            int r0 = r15.intValue()
            int r0 = 1 - r0
            if (r0 == 0) goto L_0x126d
            java.lang.String r0 = "full"
        L_0x1264:
            boolean r0 = r0.equals(r11)
            if (r0 != 0) goto L_0x1717
            int r1 = r1 + 1
            goto L_0x1256
        L_0x126d:
            java.lang.String r0 = "server"
            goto L_0x1264
        L_0x1270:
            boolean r1 = r0 instanceof X.AnonymousClass9H6
            if (r1 == 0) goto L_0x1345
            r0 = 0
            int r1 = X.C72453Mb.A0G(r3, r2, r0)
            r8 = 0
            java.lang.String r11 = X.AnonymousClass9SZ.A00(r2, r0)
            r0 = 1
            java.lang.String r6 = X.AnonymousClass9SZ.A00(r2, r0)
            java.lang.String r0 = X.AnonymousClass9SZ.A00(r2, r1)
            if (r0 == 0) goto L_0x128f
            boolean r0 = java.lang.Boolean.parseBoolean(r0)
            if (r0 != 0) goto L_0x1290
        L_0x128f:
            r8 = 1
        L_0x1290:
            java.lang.String r0 = "created"
            boolean r1 = X.C18070vi.A18(r11, r0)
            java.lang.String r10 = ""
            r9 = r8 ^ 1
            X.1yz r0 = X.AnonymousClass1EC.A01
            X.1BI r0 = r3.A00
            X.1EC r8 = X.C42941yz.A00(r0)
            if (r1 == 0) goto L_0x1737
            if (r6 == 0) goto L_0x12a7
            r10 = r6
        L_0x12a7:
            X.1Dw r1 = com.whatsapp.jid.UserJid.Companion
            java.lang.String r0 = r2.participant_
            com.whatsapp.jid.UserJid r0 = r1.A04(r0)
            r6 = 148(0x94, float:2.07E-43)
            X.98D r1 = new X.98D
            r1.<init>(r3, r6, r4)
            r3 = 6
            r1.A00 = r3
            r1.A1G(r8, r10, r9)
            goto L_0x08f7
        L_0x12be:
            X.EE9 r0 = r2.messageStubParameters_     // Catch:{ NumberFormatException -> 0x12c9 }
            java.lang.String r0 = X.C17880vN.A0w(r0, r8)     // Catch:{ NumberFormatException -> 0x12c9 }
            int r6 = java.lang.Integer.parseInt(r0)     // Catch:{ NumberFormatException -> 0x12c9 }
            goto L_0x12ce
        L_0x12c9:
            java.lang.String r0 = "Failed to parse number group size threshold."
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x12ce:
            java.lang.String r0 = "on"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x12e9
            if (r6 <= 0) goto L_0x12f4
            X.C18070vi.A0d(r3, r8)
            r0 = 142(0x8e, float:1.99E-43)
            X.2MX r1 = new X.2MX
            r1.<init>(r3, r0, r4)
            r1.A00 = r6
        L_0x12e4:
            X.C20108A7n.A0E(r2, r1)
            goto L_0x086c
        L_0x12e9:
            java.lang.String r0 = "off"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x1935
            r0 = 30
            goto L_0x12f6
        L_0x12f4:
            r0 = 29
        L_0x12f6:
            X.2Mh r1 = X.AnonymousClass8BR.A0n(r3, r0, r4)
            goto L_0x12e4
        L_0x12fb:
            X.EE9 r3 = r2.messageStubParameters_     // Catch:{ NumberFormatException -> 0x1306 }
            java.lang.String r3 = X.C17880vN.A0w(r3, r6)     // Catch:{ NumberFormatException -> 0x1306 }
            int r6 = java.lang.Integer.parseInt(r3)     // Catch:{ NumberFormatException -> 0x1306 }
            goto L_0x130b
        L_0x1306:
            java.lang.String r3 = "Failed to parse number of broadcast participants."
            com.whatsapp.util.Log.e((java.lang.String) r3)
        L_0x130b:
            int r3 = X.AnonymousClass8BR.A03(r2)
            r4 = 1
            if (r3 <= r4) goto L_0x131b
            X.EE9 r3 = r2.messageStubParameters_
            java.lang.String r3 = X.C17880vN.A0w(r3, r4)
            r1.A0i(r3)
        L_0x131b:
            int r3 = X.AnonymousClass8BR.A03(r2)
            r4 = 2
            int r3 = r3 - r4
            if (r3 != r6) goto L_0x1338
            int r0 = X.AnonymousClass8BR.A03(r2)
            int r0 = r0 - r4
            java.util.ArrayList r3 = X.C17880vN.A0z(r0)
        L_0x132c:
            int r0 = X.AnonymousClass8BR.A03(r2)
            if (r4 >= r0) goto L_0x1340
            X.C20108A7n.A0D(r5, r2, r3, r4)
            int r4 = r4 + 1
            goto L_0x132c
        L_0x1338:
            com.whatsapp.jid.UserJid r0 = r0.A00
            if (r0 == 0) goto L_0x086c
            java.util.List r3 = java.util.Collections.nCopies(r6, r0)
        L_0x1340:
            r1.A0m(r3)
            goto L_0x04ab
        L_0x1345:
            boolean r1 = r0 instanceof X.AnonymousClass9H0
            if (r1 == 0) goto L_0x13d5
            X.9H0 r0 = (X.AnonymousClass9H0) r0
            r1 = 0
            int r8 = X.C72453Mb.A0G(r3, r2, r1)
            X.1yz r6 = X.AnonymousClass1EC.A01
            java.lang.String r1 = X.AnonymousClass9SZ.A00(r2, r1)
            X.1EC r14 = r6.A02(r1)
            r1 = 1
            java.lang.String r11 = X.AnonymousClass9SZ.A00(r2, r1)
            java.lang.String r10 = X.AnonymousClass9SZ.A00(r2, r8)
            r1 = 3
            java.lang.String r17 = X.AnonymousClass9SZ.A00(r2, r1)
            r1 = 4
            java.lang.String r16 = X.AnonymousClass9SZ.A00(r2, r1)
            X.1BI r9 = r3.A00
            boolean r1 = r9 instanceof X.AnonymousClass1E9
            r8 = 0
            if (r1 == 0) goto L_0x13d3
            r1 = r9
            X.1E9 r1 = (X.AnonymousClass1E9) r1
            if (r1 == 0) goto L_0x13d3
            X.1MZ r0 = r0.A01
            X.1MW r0 = r0.A08
            X.2tp r0 = r0.A0B(r1)
            java.util.ArrayList r0 = r0.A0K()
            java.util.Iterator r15 = r0.iterator()
        L_0x1389:
            boolean r0 = r15.hasNext()
            if (r0 == 0) goto L_0x13d1
            java.lang.Object r6 = r15.next()
            r0 = r6
            X.2sr r0 = (X.C63312sr) r0
            int r1 = r0.A01
            r0 = 2
            if (r1 != r0) goto L_0x1389
        L_0x139b:
            X.2sr r6 = (X.C63312sr) r6
        L_0x139d:
            boolean r0 = r9 instanceof X.AnonymousClass1EC
            if (r0 == 0) goto L_0x13cf
            com.whatsapp.jid.GroupJid r9 = (com.whatsapp.jid.GroupJid) r9
        L_0x13a3:
            if (r6 == 0) goto L_0x13cd
            com.whatsapp.jid.UserJid r15 = r6.A04
        L_0x13a7:
            if (r17 == 0) goto L_0x13ad
            java.lang.Boolean r8 = X.AnonymousClass8BU.A0g(r17)
        L_0x13ad:
            if (r16 == 0) goto L_0x13cb
            boolean r6 = java.lang.Boolean.parseBoolean(r16)
        L_0x13b3:
            r0 = 143(0x8f, float:2.0E-43)
            X.984 r1 = new X.984
            r1.<init>(r3, r0, r4)
            r0 = 2
            r1.A00 = r0
            r1.A1F(r14, r11)
            r1.A1G(r9, r8, r10, r6)
            r1.A0d(r15)
            r1.A0i(r10)
            goto L_0x04ab
        L_0x13cb:
            r6 = 0
            goto L_0x13b3
        L_0x13cd:
            r15 = r8
            goto L_0x13a7
        L_0x13cf:
            r9 = r8
            goto L_0x13a3
        L_0x13d1:
            r6 = r8
            goto L_0x139b
        L_0x13d3:
            r6 = r8
            goto L_0x139d
        L_0x13d5:
            boolean r1 = r0 instanceof X.C179059Gk
            if (r1 == 0) goto L_0x1415
            X.9Gk r0 = (X.C179059Gk) r0
            int r6 = X.AnonymousClass8BR.A03(r2)
            r1 = 2
            boolean r1 = X.AnonymousClass000.A1T(r6, r1)
            X.C17960vV.A0C(r1)
            r6 = 0
            X.EE9 r1 = r2.messageStubParameters_
            java.lang.String r6 = X.C17880vN.A0w(r1, r6)
            X.1yz r1 = X.AnonymousClass1EC.A01
            X.1EC r16 = r1.A02(r6)
            r6 = 1
            X.EE9 r1 = r2.messageStubParameters_
            java.lang.String r20 = X.C17880vN.A0w(r1, r6)
            X.1PQ r14 = r0.A01
            java.lang.String r0 = r2.participant_
            com.whatsapp.jid.UserJid r17 = X.C22941Dw.A02(r0)
            X.1BI r0 = r3.A00
            com.whatsapp.jid.GroupJid r15 = X.C36321nh.A00(r0)
            r18 = 0
            r19 = r18
            r21 = r4
            X.2Mb r1 = r14.A0E(r15, r16, r17, r18, r19, r20, r21)
            goto L_0x086c
        L_0x1415:
            boolean r1 = r0 instanceof X.C179049Gj
            if (r1 == 0) goto L_0x14b8
            X.9Gj r0 = (X.C179049Gj) r0
            r10 = 0
            int r6 = X.C72453Mb.A0G(r3, r2, r10)
            X.9Ke r8 = r2.A0R()
            boolean r14 = r0 instanceof X.AnonymousClass8mQ
            if (r14 == 0) goto L_0x14b1
            r1 = r0
            X.8mQ r1 = (X.AnonymousClass8mQ) r1
            X.9Ke r1 = r1.A00
        L_0x142d:
            r9 = 0
            if (r8 != r1) goto L_0x148b
            int r1 = X.AnonymousClass8BR.A03(r2)
            if (r1 < r6) goto L_0x148b
            X.1BI r6 = r3.A00
            boolean r1 = r6 instanceof com.whatsapp.jid.GroupJid
            if (r1 == 0) goto L_0x148b
            if (r6 == 0) goto L_0x148b
            X.EE9 r1 = r2.messageStubParameters_
            java.lang.String r1 = X.C17880vN.A0w(r1, r10)
            if (r1 == 0) goto L_0x1489
            com.whatsapp.jid.Jid r6 = X.AnonymousClass3MX.A0n(r1)
            boolean r1 = r6 instanceof com.whatsapp.jid.GroupJid
            if (r1 != 0) goto L_0x144f
            r6 = r9
        L_0x144f:
            com.whatsapp.jid.GroupJid r6 = (com.whatsapp.jid.GroupJid) r6
        L_0x1451:
            r8 = 1
            X.EE9 r1 = r2.messageStubParameters_
            java.lang.String r8 = X.C17880vN.A0w(r1, r8)
            if (r8 != 0) goto L_0x145c
            java.lang.String r8 = ""
        L_0x145c:
            java.lang.String r1 = r2.participant_
            if (r1 == 0) goto L_0x146b
            com.whatsapp.jid.Jid r11 = X.AnonymousClass3MX.A0n(r1)
            boolean r1 = r11 instanceof com.whatsapp.jid.UserJid
            if (r1 == 0) goto L_0x1469
            r9 = r11
        L_0x1469:
            com.whatsapp.jid.UserJid r9 = (com.whatsapp.jid.UserJid) r9
        L_0x146b:
            if (r14 == 0) goto L_0x1757
            X.8mQ r0 = (X.AnonymousClass8mQ) r0
            X.1PQ r11 = r0.A01
            r0 = 0
            r17 = 116(0x74, float:1.63E-43)
            X.98G r1 = new X.98G
            r18 = r4
            r14 = r1
            r15 = r3
            r16 = r0
            r14.<init>((X.AnonymousClass205) r15, (X.C62502rV) r16, (int) r17, (long) r18)
            r1.A03 = r0
            r1.A1F(r6, r8)
            X.AnonymousClass1PQ.A01(r9, r1, r11, r10)
            goto L_0x04ab
        L_0x1489:
            r6 = r9
            goto L_0x1451
        L_0x148b:
            java.lang.StringBuilder r6 = X.AnonymousClass000.A10()
            if (r14 == 0) goto L_0x14ae
            java.lang.String r1 = "SUBGROUP_UNLINKED_FROM_PARENT"
        L_0x1493:
            r6.append(r1)
            java.lang.String r1 = "/invalid wmi"
            X.C17890vO.A19(r6, r1)
            java.lang.String r1 = r2.participant_
            if (r1 == 0) goto L_0x14aa
            com.whatsapp.jid.Jid r6 = X.AnonymousClass3MX.A0n(r1)
            boolean r1 = r6 instanceof com.whatsapp.jid.UserJid
            if (r1 == 0) goto L_0x14a8
            r9 = r6
        L_0x14a8:
            com.whatsapp.jid.UserJid r9 = (com.whatsapp.jid.UserJid) r9
        L_0x14aa:
            r6 = 0
            java.lang.String r8 = ""
            goto L_0x146b
        L_0x14ae:
            java.lang.String r1 = "SUBGROUP_LINKED_TO_PARENT"
            goto L_0x1493
        L_0x14b1:
            r1 = r0
            X.8mP r1 = (X.AnonymousClass8mP) r1
            X.9Ke r1 = r1.A00
            goto L_0x142d
        L_0x14b8:
            boolean r1 = r0 instanceof X.C179209Gz
            if (r1 == 0) goto L_0x1514
            X.9Gz r0 = (X.C179209Gz) r0
            int r1 = X.AnonymousClass8BR.A03(r2)
            r9 = 0
            if (r1 <= 0) goto L_0x1512
            X.EE9 r1 = r2.messageStubParameters_
            java.lang.String r6 = X.C17880vN.A0w(r1, r9)
            X.1yz r1 = X.AnonymousClass1EC.A01
            X.1EC r8 = r1.A02(r6)
        L_0x14d1:
            java.lang.Integer r11 = java.lang.Integer.valueOf(r9)
            X.9Ke r6 = r2.A0R()
            X.9Ke r1 = X.C179859Ke.A1P
            r9 = 2
            if (r6 != r1) goto L_0x1501
            r10 = 2
        L_0x14df:
            X.1PQ r14 = r0.A03
            X.1yz r0 = X.AnonymousClass1EC.A01
            java.lang.String r0 = r2.participant_
            com.whatsapp.jid.UserJid r9 = X.C22941Dw.A02(r0)
            r6 = 0
            r0 = 75
            X.2MW r1 = new X.2MW
            r1.<init>(r3, r0, r4)
            r0 = 0
            r1.A00 = r0
            r1.A03 = r6
            r1.A02 = r11
            r1.A00 = r10
            r1.A01 = r8
            X.AnonymousClass1PQ.A01(r9, r1, r14, r0)
            goto L_0x04ab
        L_0x1501:
            X.9Ke r1 = X.C179859Ke.A1b
            boolean r6 = X.AnonymousClass000.A1Z(r6, r1)
            java.lang.String r1 = "MessageStubeType was not COMMUNITY_UNLINK_PARENT_GROUP"
            X.C17960vV.A0F(r6, r1)
            java.lang.Integer r11 = java.lang.Integer.valueOf(r9)
            r10 = 0
            goto L_0x14df
        L_0x1512:
            r8 = 0
            goto L_0x14d1
        L_0x1514:
            boolean r1 = r0 instanceof X.C179159Gu
            if (r1 == 0) goto L_0x155f
            r6 = 0
            int r11 = X.C72453Mb.A0G(r3, r2, r6)
            int r0 = X.AnonymousClass8BR.A03(r2)
            r9 = 0
            if (r0 <= 0) goto L_0x155d
            X.1yz r1 = X.AnonymousClass1EC.A01
            X.EE9 r0 = r2.messageStubParameters_
            java.lang.String r0 = X.C17880vN.A0w(r0, r6)
            X.1EC r8 = r1.A02(r0)
        L_0x1530:
            int r0 = X.AnonymousClass8BR.A03(r2)
            r1 = 1
            if (r0 <= r1) goto L_0x155b
            X.EE9 r0 = r2.messageStubParameters_
            java.lang.String r6 = X.C17880vN.A0w(r0, r1)
        L_0x153d:
            X.9Ke r10 = r2.A0R()
            int r0 = r10.ordinal()
            switch(r0) {
                case 142: goto L_0x17df;
                case 163: goto L_0x17d4;
                case 164: goto L_0x17c9;
                case 165: goto L_0x17bf;
                case 166: goto L_0x17b5;
                case 167: goto L_0x1773;
                case 168: goto L_0x17aa;
                case 185: goto L_0x179f;
                default: goto L_0x1548;
            }
        L_0x1548:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "MessageStubType "
            r1.append(r0)
            r1.append(r10)
            java.lang.String r0 = " is not supported"
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0o(r0, r1)
            throw r0
        L_0x155b:
            r6 = r9
            goto L_0x153d
        L_0x155d:
            r8 = r9
            goto L_0x1530
        L_0x155f:
            boolean r1 = r0 instanceof X.C179039Gi
            if (r1 == 0) goto L_0x1585
            int r0 = X.AnonymousClass8BR.A03(r2)
            if (r0 <= 0) goto L_0x1583
            java.lang.String r8 = X.C20108A7n.A0A(r2)
        L_0x156d:
            X.1yz r0 = X.AnonymousClass1EC.A01
            java.lang.String r0 = r2.participant_
            com.whatsapp.jid.UserJid r6 = X.C22941Dw.A02(r0)
            r0 = 87
            X.2MU r1 = new X.2MU
            r1.<init>(r3, r0, r4)
            r1.A00 = r8
            r1.A0d(r6)
            goto L_0x04ab
        L_0x1583:
            r8 = 0
            goto L_0x156d
        L_0x1585:
            boolean r1 = r0 instanceof X.C179029Gh
            if (r1 == 0) goto L_0x17ee
            r0 = 11
            X.2Mh r1 = X.AnonymousClass8BR.A0n(r3, r0, r4)
            int r0 = X.AnonymousClass8BR.A03(r2)
            r3 = 1
            if (r0 <= r3) goto L_0x159f
            X.EE9 r0 = r2.messageStubParameters_
            java.lang.String r0 = X.C17880vN.A0w(r0, r3)
            r1.A0i(r0)
        L_0x159f:
            X.C20108A7n.A0E(r2, r1)
            goto L_0x086c
        L_0x15a4:
            int r0 = X.AnonymousClass8BR.A03(r2)
            if (r0 == r3) goto L_0x15ca
            java.lang.String r0 = "ChatAssignmentWebQuery/restoreFMessage  wrong parameter size"
            goto L_0x0543
        L_0x15ae:
            r6 = 42
        L_0x15b0:
            X.2MH r1 = new X.2MH
            r1.<init>(r3, r6, r4)
            int r0 = X.AnonymousClass8BR.A03(r2)
            if (r0 <= 0) goto L_0x04ab
            java.lang.String r0 = X.C20108A7n.A0A(r2)
            X.1BI r0 = X.AnonymousClass3MX.A0l(r0)
            if (r0 == 0) goto L_0x04ab
        L_0x15c5:
            r1.A0d(r0)
            goto L_0x04ab
        L_0x15ca:
            r3 = 0
            X.EE9 r0 = r2.messageStubParameters_
            java.lang.String r0 = X.C17880vN.A0w(r0, r3)
            r1.A01 = r3
            r1.A00 = r0
            goto L_0x04ab
        L_0x15d7:
            r1.A00 = r5
            X.1BI r0 = r3.A00
            boolean r0 = X.C22971Dz.A0d(r0)
            X.C17960vV.A0D(r0)
            goto L_0x04ab
        L_0x15e4:
            r0 = 1
            goto L_0x1642
        L_0x15e6:
            r0 = 2
            goto L_0x1642
        L_0x15e8:
            r0 = 3
            goto L_0x1642
        L_0x15ea:
            r0 = 4
            goto L_0x1642
        L_0x15ec:
            r0 = 5
            goto L_0x1642
        L_0x15ee:
            r0 = 6
            goto L_0x1642
        L_0x15f0:
            r0 = 7
            goto L_0x1642
        L_0x15f2:
            r0 = 8
            goto L_0x1642
        L_0x15f5:
            r0 = 9
            goto L_0x1642
        L_0x15f8:
            r0 = 10
            goto L_0x1642
        L_0x15fb:
            r0 = 11
            goto L_0x1642
        L_0x15fe:
            r0 = 12
            goto L_0x1642
        L_0x1601:
            r0 = 13
            goto L_0x1642
        L_0x1604:
            r0 = 14
            goto L_0x1642
        L_0x1607:
            r0 = 15
            goto L_0x1642
        L_0x160a:
            r0 = 16
            goto L_0x1642
        L_0x160d:
            r0 = 17
            goto L_0x1642
        L_0x1610:
            r0 = 18
            goto L_0x1642
        L_0x1613:
            r0 = 19
            goto L_0x1642
        L_0x1616:
            r0 = 20
            goto L_0x1642
        L_0x1619:
            r0 = 21
            goto L_0x1642
        L_0x161c:
            r0 = 22
            goto L_0x1642
        L_0x161f:
            r0 = 23
            goto L_0x1642
        L_0x1622:
            r0 = 24
            goto L_0x1642
        L_0x1625:
            r0 = 25
            goto L_0x1642
        L_0x1628:
            r0 = 26
            goto L_0x1642
        L_0x162b:
            r0 = 27
            goto L_0x1642
        L_0x162e:
            r0 = 28
            goto L_0x1642
        L_0x1631:
            r0 = 29
            goto L_0x1642
        L_0x1634:
            r0 = 30
            goto L_0x1642
        L_0x1637:
            r0 = 31
            goto L_0x1642
        L_0x163a:
            r0 = 32
            goto L_0x1642
        L_0x163d:
            r0 = 33
            goto L_0x1642
        L_0x1640:
            r0 = 34
        L_0x1642:
            r1.A00 = r0
            java.lang.String r0 = X.C20108A7n.A0A(r2)
            r1.A01 = r0
            goto L_0x04ab
        L_0x164c:
            if (r4 != 0) goto L_0x1650
            goto L_0x0020
        L_0x1650:
            r1.A18(r4)
            goto L_0x04ab
        L_0x1655:
            int r0 = X.AnonymousClass8BR.A03(r2)
            if (r0 > r1) goto L_0x165c
            r1 = 0
        L_0x165c:
            X.C17960vV.A0D(r1)
            r0 = 13
            X.2Mh r1 = X.AnonymousClass8BR.A0n(r3, r0, r4)
            X.EE9 r0 = r2.messageStubParameters_
            java.util.ArrayList r3 = X.AnonymousClass000.A14(r0)
        L_0x166b:
            int r0 = X.AnonymousClass8BR.A03(r2)
            if (r6 >= r0) goto L_0x1683
            X.EE9 r0 = r2.messageStubParameters_
            java.lang.String r0 = X.C17880vN.A0w(r0, r6)
            com.whatsapp.jid.UserJid r0 = X.C22941Dw.A02(r0)
            if (r0 == 0) goto L_0x1680
            r3.add(r0)
        L_0x1680:
            int r6 = r6 + 1
            goto L_0x166b
        L_0x1683:
            r1.A01 = r3
            goto L_0x04ab
        L_0x1687:
            boolean r3 = r0 instanceof X.C172628tj
            java.util.HashSet r6 = X.C17880vN.A12()
            if (r3 != 0) goto L_0x16a2
            r4 = 0
        L_0x1690:
            int r3 = X.AnonymousClass8BR.A03(r2)
            if (r4 >= r3) goto L_0x16a2
            X.EE9 r3 = r2.messageStubParameters_
            java.lang.String r3 = X.C17880vN.A0w(r3, r4)
            r6.add(r3)
            int r4 = r4 + 1
            goto L_0x1690
        L_0x16a2:
            java.util.Iterator r6 = r6.iterator()
        L_0x16a6:
            boolean r3 = r6.hasNext()
            if (r3 == 0) goto L_0x1708
            java.lang.String r3 = X.C17880vN.A0v(r6)
            com.whatsapp.jid.UserJid r4 = X.C22941Dw.A02(r3)
            if (r4 == 0) goto L_0x16a6
            X.11S r3 = r0.A00
            boolean r3 = r3.A0O(r4)
            if (r3 == 0) goto L_0x16c1
            r3 = 1
            r1.A00 = r3
        L_0x16c1:
            r5.add(r4)
            goto L_0x16a6
        L_0x16c5:
            int r1 = X.AnonymousClass8BR.A03(r2)
            boolean r1 = X.C108975cc.A1D(r1, r6)
            X.C17960vV.A0C(r1)
            r1 = 12
            X.2Mh r1 = X.AnonymousClass8BR.A0n(r3, r1, r4)
            X.EE9 r3 = r2.messageStubParameters_
            java.util.ArrayList r5 = X.AnonymousClass000.A14(r3)
            int r3 = r2.bitField0_
            r3 = r3 & 16
            if (r3 == 0) goto L_0x16e5
            X.C20108A7n.A0E(r2, r1)
        L_0x16e5:
            int r3 = X.AnonymousClass8BR.A03(r2)
            if (r8 >= r3) goto L_0x1708
            X.EE9 r3 = r2.messageStubParameters_
            java.lang.String r3 = X.C17880vN.A0w(r3, r8)
            com.whatsapp.jid.UserJid r4 = X.C22941Dw.A02(r3)
            X.C17960vV.A07(r4)
            X.11S r3 = r0.A00
            boolean r3 = r3.A0O(r4)
            if (r3 == 0) goto L_0x1702
            r1.A00 = r6
        L_0x1702:
            r5.add(r4)
            int r8 = r8 + 1
            goto L_0x16e5
        L_0x1708:
            r1.A01 = r5
            goto L_0x04ab
        L_0x170c:
            if (r4 != 0) goto L_0x1710
            goto L_0x0020
        L_0x1710:
            r1.A18(r4)
            goto L_0x04ab
        L_0x1715:
            java.lang.Integer r15 = X.AnonymousClass00R.A00
        L_0x1717:
            r0 = 152(0x98, float:2.13E-43)
            X.98E r1 = new X.98E
            r1.<init>(r3, r0, r4)
            r0 = 6
            r1.A00 = r0
            int r0 = r15.intValue()
            int r0 = 1 - r0
            if (r0 == 0) goto L_0x1735
            r0 = 0
        L_0x172a:
            r1.A1G(r8, r9, r0)
            r1.A0i(r9)
            r1.A0d(r6)
            goto L_0x04ab
        L_0x1735:
            r0 = 1
            goto L_0x172a
        L_0x1737:
            if (r6 == 0) goto L_0x173a
            r10 = r6
        L_0x173a:
            X.1Dw r1 = com.whatsapp.jid.UserJid.Companion
            java.lang.String r0 = r2.participant_
            com.whatsapp.jid.UserJid r6 = r1.A04(r0)
            r0 = 149(0x95, float:2.09E-43)
            X.98C r1 = new X.98C
            r1.<init>(r3, r0, r4)
            r0 = 6
            r1.A00 = r0
            r1.A1G(r8, r10, r9)
            r1.A0d(r6)
            r1.A0i(r11)
            goto L_0x04ab
        L_0x1757:
            X.8mP r0 = (X.AnonymousClass8mP) r0
            X.1PQ r11 = r0.A01
            r0 = 0
            r17 = 112(0x70, float:1.57E-43)
            X.98F r1 = new X.98F
            r18 = r4
            r14 = r1
            r15 = r3
            r16 = r0
            r14.<init>((X.AnonymousClass205) r15, (X.C62502rV) r16, (int) r17, (long) r18)
            r1.A03 = r0
            r1.A1F(r6, r8)
            X.AnonymousClass1PQ.A01(r9, r1, r11, r10)
            goto L_0x04ab
        L_0x1773:
            java.lang.String r0 = X.AnonymousClass9SZ.A00(r2, r11)
            if (r0 == 0) goto L_0x177d
            java.lang.Boolean r9 = X.AnonymousClass8BU.A0g(r0)
        L_0x177d:
            r0 = 3
            java.lang.String r0 = X.AnonymousClass9SZ.A00(r2, r0)
            if (r0 == 0) goto L_0x179d
            boolean r0 = java.lang.Boolean.parseBoolean(r0)
        L_0x1788:
            r16 = 0
            r17 = 128(0x80, float:1.794E-43)
            X.982 r1 = new X.982
            r18 = r4
            r14 = r1
            r15 = r3
            r14.<init>((X.AnonymousClass205) r15, (X.C62502rV) r16, (int) r17, (long) r18)
            r1.A1F(r8, r6)
            r1.A1G(r8, r9, r6, r0)
            goto L_0x04ab
        L_0x179d:
            r0 = 0
            goto L_0x1788
        L_0x179f:
            r0 = 144(0x90, float:2.02E-43)
            X.97w r1 = new X.97w
            r1.<init>(r3, r0, r4)
            r0 = 3
            r1.A00 = r0
            goto L_0x17e9
        L_0x17aa:
            r0 = 124(0x7c, float:1.74E-43)
            X.97z r1 = new X.97z
            r1.<init>(r3, r0, r4)
            r0 = 3
            r1.A00 = r0
            goto L_0x17e9
        L_0x17b5:
            r0 = 127(0x7f, float:1.78E-43)
            X.981 r1 = new X.981
            r1.<init>(r3, r0, r4)
            r1.A00 = r11
            goto L_0x17e9
        L_0x17bf:
            r0 = 126(0x7e, float:1.77E-43)
            X.980 r1 = new X.980
            r1.<init>(r3, r0, r4)
            r1.A00 = r11
            goto L_0x17e9
        L_0x17c9:
            r0 = 125(0x7d, float:1.75E-43)
            X.97y r1 = new X.97y
            r1.<init>(r3, r0, r4)
            r0 = 3
            r1.A00 = r0
            goto L_0x17e9
        L_0x17d4:
            r0 = 123(0x7b, float:1.72E-43)
            X.97x r1 = new X.97x
            r1.<init>(r3, r0, r4)
            r0 = 3
            r1.A00 = r0
            goto L_0x17e9
        L_0x17df:
            r0 = 122(0x7a, float:1.71E-43)
            X.97v r1 = new X.97v
            r1.<init>(r3, r0, r4)
            r0 = 3
            r1.A00 = r0
        L_0x17e9:
            r1.A1F(r8, r6)
            goto L_0x04ab
        L_0x17ee:
            boolean r1 = r0 instanceof X.AnonymousClass9H9
            if (r1 == 0) goto L_0x0020
            X.9H9 r0 = (X.AnonymousClass9H9) r0
            X.1CJ r11 = r0.A00
            java.util.HashSet r6 = X.C17880vN.A12()
            int r10 = X.AnonymousClass8BR.A03(r2)
            r9 = 0
        L_0x17ff:
            if (r9 >= r10) goto L_0x183b
            X.EE9 r1 = r2.messageStubParameters_     // Catch:{ 11T -> 0x182f }
            java.lang.String r8 = X.C17880vN.A0w(r1, r9)     // Catch:{ 11T -> 0x182f }
            X.1yz r1 = X.AnonymousClass1EC.A01     // Catch:{ 11T -> 0x182f }
            X.1EC r8 = X.C42941yz.A01(r8)     // Catch:{ 11T -> 0x182f }
            X.1ci r14 = r11.A0A(r8)
            if (r14 == 0) goto L_0x1832
            java.lang.String r1 = r14.A0A()
            if (r1 == 0) goto L_0x1832
            java.lang.String r16 = r14.A0A()
        L_0x181d:
            if (r16 != 0) goto L_0x1821
            java.lang.String r16 = ""
        L_0x1821:
            r18 = 0
            r17 = 2
            X.A2B r1 = new X.A2B
            r15 = r8
            r14 = r1
            r14.<init>(r15, r16, r17, r18)
            r6.add(r1)
        L_0x182f:
            int r9 = r9 + 2
            goto L_0x17ff
        L_0x1832:
            int r14 = r9 + 1
            X.EE9 r1 = r2.messageStubParameters_
            java.lang.String r16 = X.C17880vN.A0w(r1, r14)
            goto L_0x181d
        L_0x183b:
            X.1BI r1 = r3.A00
            X.1EC r8 = X.AnonymousClass3MW.A0i(r1)
            boolean r1 = r0 instanceof X.AnonymousClass8mX
            if (r1 == 0) goto L_0x1880
            X.8mX r0 = (X.AnonymousClass8mX) r0
            r1 = 0
            X.AnonymousClass8BX.A1J(r3, r2, r6, r1)
            boolean r0 = r0 instanceof X.AnonymousClass8mW
            r16 = 0
            if (r0 == 0) goto L_0x1874
            r17 = 111(0x6f, float:1.56E-43)
            X.98O r1 = new X.98O
            r14 = r1
            r15 = r3
            r18 = r4
            r14.<init>((X.AnonymousClass205) r15, (X.C62502rV) r16, (int) r17, (long) r18)
        L_0x185c:
            java.lang.String r0 = r2.participant_
            r4 = 0
            if (r0 == 0) goto L_0x186c
            com.whatsapp.jid.Jid r3 = X.AnonymousClass3MX.A0n(r0)
            boolean r0 = r3 instanceof X.AnonymousClass1BI
            if (r0 == 0) goto L_0x186a
            r4 = r3
        L_0x186a:
            X.1BI r4 = (X.AnonymousClass1BI) r4
        L_0x186c:
            r1.A0d(r4)
            r1.A1F(r6)
            goto L_0x04ab
        L_0x1874:
            r17 = 110(0x6e, float:1.54E-43)
            X.98N r1 = new X.98N
            r14 = r1
            r15 = r3
            r18 = r4
            r14.<init>((X.AnonymousClass205) r15, (X.C62502rV) r16, (int) r17, (long) r18)
            goto L_0x185c
        L_0x1880:
            boolean r1 = r0 instanceof X.AnonymousClass8mU
            if (r1 == 0) goto L_0x18d9
            X.8mU r0 = (X.AnonymousClass8mU) r0
            X.C18070vi.A0p(r2, r6, r8)
            boolean r1 = r0 instanceof X.AnonymousClass8mT
            if (r1 == 0) goto L_0x18bb
            r16 = 0
            r17 = 109(0x6d, float:1.53E-43)
            X.98M r1 = new X.98M
            r14 = r1
            r15 = r3
            r18 = r4
            r14.<init>((X.AnonymousClass205) r15, (X.C62502rV) r16, (int) r17, (long) r18)
        L_0x189a:
            java.lang.String r3 = r2.participant_
            r5 = 0
            if (r3 == 0) goto L_0x18aa
            com.whatsapp.jid.Jid r4 = X.AnonymousClass3MX.A0n(r3)
            boolean r3 = r4 instanceof X.AnonymousClass1BI
            if (r3 == 0) goto L_0x18a8
            r5 = r4
        L_0x18a8:
            X.1BI r5 = (X.AnonymousClass1BI) r5
        L_0x18aa:
            r1.A0d(r5)
            X.1MF r0 = r0.A01
            X.1EC r0 = r0.A03(r8)
            r1.A1F(r0)
            r1.A1G(r6)
            goto L_0x04ab
        L_0x18bb:
            boolean r1 = r0 instanceof X.AnonymousClass8mS
            r16 = 0
            if (r1 == 0) goto L_0x18cd
            r17 = 108(0x6c, float:1.51E-43)
            X.98L r1 = new X.98L
            r14 = r1
            r15 = r3
            r18 = r4
            r14.<init>((X.AnonymousClass205) r15, (X.C62502rV) r16, (int) r17, (long) r18)
            goto L_0x189a
        L_0x18cd:
            r17 = 171(0xab, float:2.4E-43)
            X.98K r1 = new X.98K
            r14 = r1
            r15 = r3
            r18 = r4
            r14.<init>((X.AnonymousClass205) r15, (X.C62502rV) r16, (int) r17, (long) r18)
            goto L_0x189a
        L_0x18d9:
            boolean r1 = r0 instanceof X.AnonymousClass8mO
            if (r1 == 0) goto L_0x18ef
            r9 = 89
            X.98B r1 = new X.98B
            r1.<init>(r3, r9, r4)
            X.C20108A7n.A0E(r2, r1)
            int r0 = X.AnonymousClass9H9.A09(r0, r8, r1, r6)
            r1.A00 = r0
            goto L_0x04ab
        L_0x18ef:
            boolean r1 = r0 instanceof X.AnonymousClass8mN
            if (r1 == 0) goto L_0x1905
            r9 = 88
            X.98B r1 = new X.98B
            r1.<init>(r3, r9, r4)
            X.C20108A7n.A0E(r2, r1)
            int r0 = X.AnonymousClass9H9.A09(r0, r8, r1, r6)
            r1.A00 = r0
            goto L_0x04ab
        L_0x1905:
            boolean r1 = r0 instanceof X.AnonymousClass8mM
            if (r1 == 0) goto L_0x191b
            r9 = 78
            X.98B r1 = new X.98B
            r1.<init>(r3, r9, r4)
            X.C20108A7n.A0E(r2, r1)
            int r0 = X.AnonymousClass9H9.A09(r0, r8, r1, r6)
            r1.A00 = r0
            goto L_0x04ab
        L_0x191b:
            r9 = 77
            X.98B r1 = new X.98B
            r1.<init>(r3, r9, r4)
            X.C20108A7n.A0E(r2, r1)
            int r0 = X.AnonymousClass9H9.A09(r0, r8, r1, r6)
            r1.A00 = r0
            goto L_0x04ab
        L_0x192d:
            return r4
        L_0x192e:
            java.lang.String r0 = "Invalid stub type."
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0k(r0)
            throw r0
        L_0x1935:
            java.lang.String r0 = "GroupChangeRestrict/restoreFMessage/invalid value of restrictModeEnabledValue parameter."
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0n(r0)
            throw r0
        L_0x193c:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "GroupChangeReportToAdminEnabledWebQuery/restoreFMessage/invalid value of allow parameter: "
            r1.append(r0)
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0o(r6, r1)
            throw r0
        L_0x194a:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>()
            throw r0
        L_0x1950:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "GROUP_CHANGE_RECENT_HISTORY_SHARING/restoreFMessage/invalid value of allow parameter: "
            r1.append(r0)
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0o(r6, r1)
            throw r0
        L_0x195e:
            java.lang.String r0 = "GroupChangeAnnounceQuery/restoreFMessage/invalid value of groupAnnouncementsEnabled parameter."
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0n(r0)
            throw r0
        L_0x1965:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "GroupChangeAllowNonAdminSubgroupCreationWebQuery/restoreFMessage/invalid value of allow parameter: "
            r1.append(r0)
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0o(r6, r1)
            throw r0
        L_0x1973:
            X.1hd r0 = X.AnonymousClass8BT.A0b()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C192859p6.A01(X.9pU, X.8co):X.206");
    }
}
