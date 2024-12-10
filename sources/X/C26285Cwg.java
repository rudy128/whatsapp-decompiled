package X;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import com.bloks.components.bkcomponentszoomable.BKBloksComponentsZoomableBinderUtil;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.Cwg  reason: case insensitive filesystem */
public class C26285Cwg {
    public final AnonymousClass16S A00;
    public final C26109CsU A01;
    public final C26025Cqj A02;

    public static float A00(DOZ doz, String str, String str2) {
        if (str != null) {
            try {
                return A90.A01(str);
            } catch (AnonymousClass9HX e) {
                Object[] A1b = AnonymousClass3MW.A1b();
                AnonymousClass001.A1Q(str2, str, A1b);
                C25913CoX.A00(doz, "BKBloksComponentsRichTextBinderUtil", String.format("Error parsing %s: %s", A1b), e);
            }
        }
        return 0.0f;
    }

    public static int A03(Rect rect, int i, int i2, int i3) {
        int size = (View.MeasureSpec.getSize(i) - rect.left) - rect.right;
        int size2 = (View.MeasureSpec.getSize(i2) - rect.top) - rect.bottom;
        if (i3 == 1) {
            return size;
        }
        return size2;
    }

    public static AnonymousClass0YI A04(C05050Qf r2, int i, int i2) {
        return new AnonymousClass0YI(r2, (Object) null, i, i2);
    }

    public static final DFE A05(CW7 cw7, AnonymousClass0IV r9, DFL dfl, int i, int i2) {
        C18070vi.A0d(dfl, 2);
        C24724CHl.A01.get();
        C04220Mi A002 = cw7.A00(dfl);
        Context context = r9.A02;
        AnonymousClass0Jt r3 = new AnonymousClass0Jt(dfl, (Object) null, (List) null);
        Object obj = r9.A03;
        CBx.A00((DOZ) obj);
        int i3 = r9.A01;
        long A003 = C02740Fe.A00(i, i2);
        AnonymousClass0CC r4 = new AnonymousClass0CC(A002, new C07020aE(context, A002, r3, obj, i3, A003), A003);
        long j = (long) dfl.A04;
        DFE dfe = new DFE(r4, dfl);
        cw7.A01.put(j, dfe);
        return dfe;
    }

    public static boolean A08(int i) {
        switch (i) {
            case 13317:
            case 13320:
            case 13323:
            case 13326:
            case 13327:
            case 13329:
            case 13334:
            case 13335:
            case 13336:
            case 13666:
            case 13708:
            case 13797:
            case 14093:
            case 15728:
            case 15778:
            case 15981:
            case 16160:
            case 16260:
            case 16444:
            case 16675:
            case 16682:
            case 17184:
                return true;
            default:
                return false;
        }
    }

    public static float[] A09(C26112Csa csa) {
        C26112Csa.A00(csa, 2);
        return csa.A01;
    }

    public static final Integer A06(DFL dfl) {
        Integer num = AnonymousClass00R.A00;
        String A0D = dfl.A0D(96);
        DFL A09 = dfl.A09(94);
        if (A0D == null || A09 == null) {
            return num;
        }
        if (A0D.equals("grid")) {
            if (A09.A05 == 16373) {
                return AnonymousClass00R.A01;
            }
            throw AnonymousClass000.A0k("CollectionLayoutUtils: requested \"grid\" layout_config_type, but provided layout_config doesn't match bk.types.GridCollectionLayoutConfig");
        } else if (!A0D.equals("staggered_grid")) {
            return num;
        } else {
            if (A09.A05 == 16483) {
                return AnonymousClass00R.A0C;
            }
            throw AnonymousClass000.A0k("CollectionLayoutUtils: requested \"staggered_grid\" layout_config_type, but provided layout_config doesn't match bk.types.StaggeredGridCollectionLayoutConfig");
        }
    }

    public int A0A(DFL dfl) {
        int i = dfl.A05;
        if (i != 13504) {
            if (i == 13327) {
                return 35;
            }
            if (i == 13708) {
                return 41;
            }
            if (i == 14093) {
                return 36;
            }
            if (i == 16444) {
                return 42;
            }
            if (i != 16675) {
                return 32;
            }
            return 36;
        }
        return 32;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v15, resolved type: X.E3m} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v26, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v143, resolved type: X.E3m} */
    /* JADX WARNING: type inference failed for: r10v9, types: [X.5kH, X.BM9] */
    /* JADX WARNING: type inference failed for: r6v80, types: [java.lang.Object, X.6yz] */
    /* JADX WARNING: type inference failed for: r10v10, types: [X.5kZ, X.BM9] */
    /* JADX WARNING: type inference failed for: r6v87, types: [java.lang.Object, X.6yz] */
    /* JADX WARNING: type inference failed for: r6v99, types: [X.1tW, java.lang.Object, X.BMA] */
    /* JADX WARNING: type inference failed for: r0v113, types: [X.0Qf, X.BV4, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v116, types: [X.0Qf, X.BV4] */
    /* JADX WARNING: Code restructure failed: missing block: B:195:0x03c8, code lost:
        r0.A0L(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:196:0x03cb, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x005d, code lost:
        if (r5.equals(r0) == false) goto L_0x005f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:256:0x0538, code lost:
        if (r1.A09(87) != null) goto L_0x053a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:336:0x0637, code lost:
        if (r14.A04 == r18.A04) goto L_0x0639;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:361:0x06ba, code lost:
        throw new X.AnonymousClass9HX(X.AnonymousClass001.A1H("can't parse unknown snap gravity: ", r7, X.AnonymousClass000.A10()));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:410:0x0788, code lost:
        if (X.C25337Cdw.A00(r7.A02, r11) != false) goto L_0x07b8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:420:0x07b6, code lost:
        if (X.C25337Cdw.A00(r7.A02, r11) != false) goto L_0x07b8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00d3, code lost:
        if (r2 == false) goto L_0x00d5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:491:0x08c8, code lost:
        if (r13 != 0) goto L_0x08ca;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:554:0x0a11, code lost:
        return new X.C23701Bo8(r2, r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00f9, code lost:
        if (r4 == false) goto L_0x00fb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:582:0x0aab, code lost:
        return new X.BV6(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:583:0x0aac, code lost:
        r6 = (X.EAQ) X.DOZ.A00(r3, 2131428943);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:584:0x0ab5, code lost:
        if (r6 != null) goto L_0x0ac0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:585:0x0ab7, code lost:
        X.C25913CoX.A01("CDSBottomSheetWrapperBinderUtils", "Rendering a bk.cds.bottomsheet.Wrapper outside of a CDS bottom sheet. The header will not render properly.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:586:0x0ac0, code lost:
        r0 = new X.BV9(r3, (long) r1.A04, X.C26272CwJ.A07(r3));
        r0.A0L(new X.AnonymousClass0Ij(new X.C26824DFg(r6), r1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:587:0x0ad9, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:609:?, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:613:?, code lost:
        return r0;
     */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x021a  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x007a  */
    /* JADX WARNING: Removed duplicated region for block: B:308:0x05d6  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x008e  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00a1  */
    /* JADX WARNING: Removed duplicated region for block: B:446:0x0821  */
    /* JADX WARNING: Removed duplicated region for block: B:452:0x0836  */
    /* JADX WARNING: Removed duplicated region for block: B:455:0x0841  */
    /* JADX WARNING: Removed duplicated region for block: B:505:0x08fc A[Catch:{ 9HX -> 0x0902 }] */
    /* JADX WARNING: Removed duplicated region for block: B:506:0x08fd A[Catch:{ 9HX -> 0x0902 }] */
    /* JADX WARNING: Removed duplicated region for block: B:515:0x094e  */
    /* JADX WARNING: Removed duplicated region for block: B:526:0x096a  */
    /* JADX WARNING: Removed duplicated region for block: B:617:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x0182  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C05050Qf A0C(X.DOZ r28, X.DFL r29) {
        /*
            r27 = this;
            r1 = r29
            int r2 = r1.A05
            r0 = r27
            r3 = r28
            switch(r2) {
                case 13323: goto L_0x0a92;
                case 13648: goto L_0x0a8a;
                case 13745: goto L_0x09f8;
                case 13889: goto L_0x0a82;
                case 13948: goto L_0x0a7a;
                case 14005: goto L_0x0aa0;
                case 14093: goto L_0x0aac;
                case 15763: goto L_0x0a72;
                case 15768: goto L_0x0ada;
                case 15972: goto L_0x0a9a;
                case 15981: goto L_0x09fe;
                case 16094: goto L_0x0a6a;
                case 16451: goto L_0x0a5f;
                case 16534: goto L_0x0a1d;
                case 16586: goto L_0x09c8;
                case 16682: goto L_0x0aa6;
                case 16718: goto L_0x0a12;
                case 16910: goto L_0x09c2;
                default: goto L_0x000b;
            }
        L_0x000b:
            switch(r2) {
                case 13496: goto L_0x09ba;
                case 13497: goto L_0x09b2;
                case 13498: goto L_0x09aa;
                case 13499: goto L_0x09a2;
                default: goto L_0x000e;
            }
        L_0x000e:
            switch(r2) {
                case 13501: goto L_0x099a;
                case 13502: goto L_0x0992;
                case 13503: goto L_0x098a;
                case 13504: goto L_0x0982;
                default: goto L_0x0011;
            }
        L_0x0011:
            boolean r0 = A08(r2)
            if (r0 == 0) goto L_0x0971
            switch(r2) {
                case 13317: goto L_0x03df;
                case 13320: goto L_0x001f;
                case 13323: goto L_0x022e;
                case 13326: goto L_0x02ea;
                case 13327: goto L_0x02f3;
                case 13329: goto L_0x02fc;
                case 13334: goto L_0x0326;
                case 13335: goto L_0x032c;
                case 13336: goto L_0x0abe;
                case 13666: goto L_0x0350;
                case 13708: goto L_0x0359;
                case 13797: goto L_0x035f;
                case 14093: goto L_0x0aac;
                case 15728: goto L_0x036c;
                case 15778: goto L_0x0375;
                case 15981: goto L_0x0a04;
                case 16160: goto L_0x03d9;
                case 16260: goto L_0x03d4;
                case 16444: goto L_0x037e;
                case 16675: goto L_0x0384;
                case 16682: goto L_0x0aa6;
                case 17184: goto L_0x03ce;
                default: goto L_0x001a;
            }
        L_0x001a:
            java.lang.IllegalArgumentException r0 = X.BEB.A0S(r2)
            throw r0
        L_0x001f:
            r7 = 0
            r9 = 1
            r0 = 38
            X.DFL r8 = r1.A09(r0)
            boolean r6 = X.C26272CwJ.A07(r3)
            if (r8 == 0) goto L_0x0033
            r0 = 43
            boolean r6 = r8.A0I(r0, r6)
        L_0x0033:
            r0 = 49
            java.lang.String r4 = r1.A0D(r0)
            if (r4 == 0) goto L_0x006f
            java.util.Locale r0 = java.util.Locale.US
            X.C18070vi.A0Z(r0)
            java.lang.String r5 = X.AnonymousClass8BS.A0p(r0, r4)
            int r2 = r5.hashCode()
            r0 = -1901805651(0xffffffff8ea4bfad, float:-4.06137E-30)
            if (r2 == r0) goto L_0x0114
            r0 = 3178655(0x30809f, float:4.454244E-39)
            if (r2 == r0) goto L_0x0110
            r0 = 466743410(0x1bd1f072, float:3.4731534E-22)
            if (r2 != r0) goto L_0x005f
            java.lang.String r0 = "visible"
        L_0x0059:
            boolean r0 = r5.equals(r0)
            if (r0 != 0) goto L_0x006f
        L_0x005f:
            java.lang.StringBuilder r2 = X.AnonymousClass000.A10()
            java.lang.String r0 = "unknown visibility "
            java.lang.String r4 = X.AnonymousClass001.A1H(r0, r4, r2)
            r2 = 0
            java.lang.String r0 = "Bloks Flexbox"
            X.C25913CoX.A00(r3, r0, r4, r2)
        L_0x006f:
            r0 = 0
        L_0x0070:
            r2 = 40
            boolean r2 = r1.A0I(r2, r9)
            if (r2 != 0) goto L_0x0084
            if (r0 != 0) goto L_0x0082
            int r0 = r1.A04
            long r4 = (long) r0
            X.BV9 r0 = new X.BV9
            r0.<init>(r3, r4, r6)
        L_0x0082:
            r0.A05 = r7
        L_0x0084:
            r2 = 45
            X.E8A r10 = r1.A0A(r2)
            if (r10 == 0) goto L_0x009f
            if (r0 != 0) goto L_0x0096
            int r0 = r1.A04
            long r4 = (long) r0
            X.BV9 r0 = new X.BV9
            r0.<init>(r3, r4, r6)
        L_0x0096:
            X.4dV r2 = new X.4dV
            r2.<init>((X.DOZ) r3, (X.DFL) r1, (X.E8A) r10, (int) r9)
            r0.A04 = r2
            r0.A06 = r9
        L_0x009f:
            if (r8 == 0) goto L_0x0170
            if (r0 != 0) goto L_0x00ab
            int r0 = r1.A04
            long r4 = (long) r0
            X.BV9 r0 = new X.BV9
            r0.<init>(r3, r4, r6)
        L_0x00ab:
            r0.A01 = r8
            X.DFL r10 = X.BE7.A0O(r8)
            X.DOZ r9 = r0.A03
            r9.getClass()
            r11 = 1
            r8 = 0
            if (r10 == 0) goto L_0x010e
            X.CqB r2 = X.C25995CqB.A00()
            X.C5l r4 = r2.A01
            X.DFL r2 = r0.A01
            android.graphics.drawable.Drawable r5 = r4.A00(r9, r10, r2)
            if (r5 == 0) goto L_0x00d5
            X.C25995CqB.A00()
            int r4 = r10.A05
            r2 = 13761(0x35c1, float:1.9283E-41)
            if (r4 == r2) goto L_0x0107
            r2 = 0
        L_0x00d2:
            r12 = 1
            if (r2 != 0) goto L_0x00d6
        L_0x00d5:
            r12 = 0
        L_0x00d6:
            X.DFL r4 = r0.A01
            r2 = 49
            X.DFL r10 = r4.A09(r2)
            if (r10 == 0) goto L_0x00fd
            X.CqB r2 = X.C25995CqB.A00()
            X.C5l r4 = r2.A01
            X.DFL r2 = r0.A01
            android.graphics.drawable.Drawable r8 = r4.A00(r9, r10, r2)
            if (r8 == 0) goto L_0x00fb
            X.C25995CqB.A00()
            int r4 = r10.A05
            r2 = 13761(0x35c1, float:1.9283E-41)
            if (r4 == r2) goto L_0x0100
            r4 = 0
        L_0x00f8:
            r2 = 1
            if (r4 != 0) goto L_0x00fc
        L_0x00fb:
            r2 = 0
        L_0x00fc:
            r12 = r12 | r2
        L_0x00fd:
            if (r5 != 0) goto L_0x0167
            goto L_0x0129
        L_0x0100:
            r2 = 40
            boolean r4 = r10.A0I(r2, r11)
            goto L_0x00f8
        L_0x0107:
            r2 = 40
            boolean r2 = r10.A0I(r2, r11)
            goto L_0x00d2
        L_0x010e:
            r5 = r8
            goto L_0x00d5
        L_0x0110:
            java.lang.String r0 = "gone"
            goto L_0x0059
        L_0x0114:
            java.lang.String r0 = "invisible"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x005f
            r2 = 4
            int r0 = r1.A04
            long r4 = (long) r0
            X.BV9 r0 = new X.BV9
            r0.<init>(r3, r4, r6)
            r0.A00 = r2
            goto L_0x0070
        L_0x0129:
            X.DFL r4 = r0.A01     // Catch:{ 9HX -> 0x0161 }
            r2 = 43
            boolean r2 = r4.A0I(r2, r7)     // Catch:{ 9HX -> 0x0161 }
            r10 = r2 ^ 1
            X.DFL r4 = r0.A01     // Catch:{ 9HX -> 0x0161 }
            r2 = 46
            java.lang.String r2 = r4.A0D(r2)     // Catch:{ 9HX -> 0x0161 }
            r4 = 0
            if (r2 == 0) goto L_0x0147
            float r2 = X.A90.A01(r2)     // Catch:{ 9HX -> 0x0161 }
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 == 0) goto L_0x0147
            r11 = 0
        L_0x0147:
            if (r10 != 0) goto L_0x014b
            if (r11 == 0) goto L_0x0167
        L_0x014b:
            X.DFL r2 = r0.A01     // Catch:{ 9HX -> 0x0161 }
            java.lang.String r2 = X.BE7.A0g(r2)     // Catch:{ 9HX -> 0x0161 }
            if (r2 == 0) goto L_0x0167
            float r2 = X.A90.A01(r2)     // Catch:{ 9HX -> 0x0161 }
            int r2 = (int) r2     // Catch:{ 9HX -> 0x0161 }
            if (r2 == 0) goto L_0x0167
            X.DFL r2 = r0.A01     // Catch:{ 9HX -> 0x0161 }
            X.BEz r5 = X.C25885Cnw.A01(r9, r2, r7)     // Catch:{ 9HX -> 0x0161 }
            goto L_0x0167
        L_0x0161:
            r4 = move-exception
            java.lang.String r2 = "HostWithDecoratorRenderUnit"
            X.C25913CoX.A02(r2, r4)
        L_0x0167:
            r0.A02 = r5
            r0.A03 = r8
            if (r12 == 0) goto L_0x0170
            r2 = 2
            r0.A01 = r2
        L_0x0170:
            java.util.ArrayList r8 = X.AnonymousClass000.A13()
            java.util.List r2 = X.BE7.A0r(r1)
            java.util.Iterator r11 = r2.iterator()
        L_0x017c:
            boolean r2 = r11.hasNext()
            if (r2 == 0) goto L_0x0212
            X.DFL r10 = X.BE6.A0d(r11)
            X.DFL r5 = X.BE7.A0P(r10)
            if (r5 == 0) goto L_0x017c
            int r4 = r5.A05
            r2 = 13368(0x3438, float:1.8733E-41)
            if (r4 != r2) goto L_0x017c
            r2 = 75
            X.DFL r4 = r5.A09(r2)
            if (r4 == 0) goto L_0x017c
            X.CTS r9 = new X.CTS
            r9.<init>()
            int r2 = r10.A04
            r9.A06 = r2
            r2 = 81
            int r2 = r5.A04(r2, r7)
            r9.A07 = r2
            r2 = 42
            java.lang.String r2 = r4.A0D(r2)     // Catch:{ 9HX -> 0x0202 }
            if (r2 != 0) goto L_0x01b5
            r2 = 1
            goto L_0x01b9
        L_0x01b5:
            float r2 = X.A90.A01(r2)     // Catch:{ 9HX -> 0x0202 }
        L_0x01b9:
            r9.A05 = r2     // Catch:{ 9HX -> 0x0202 }
            java.lang.String r2 = X.BE7.A0d(r4)     // Catch:{ 9HX -> 0x0202 }
            if (r2 != 0) goto L_0x01c3
            r2 = 1
            goto L_0x01c7
        L_0x01c3:
            float r2 = X.A90.A01(r2)     // Catch:{ 9HX -> 0x0202 }
        L_0x01c7:
            r9.A00 = r2     // Catch:{ 9HX -> 0x0202 }
            java.lang.String r2 = X.BE7.A0h(r4)     // Catch:{ 9HX -> 0x0202 }
            if (r2 != 0) goto L_0x01d1
            r2 = 1
            goto L_0x01d5
        L_0x01d1:
            float r2 = X.A90.A01(r2)     // Catch:{ 9HX -> 0x0202 }
        L_0x01d5:
            r9.A04 = r2     // Catch:{ 9HX -> 0x0202 }
            java.lang.String r2 = X.BE7.A0e(r4)     // Catch:{ 9HX -> 0x0202 }
            if (r2 != 0) goto L_0x01df
            r2 = 1
            goto L_0x01e3
        L_0x01df:
            float r2 = X.A90.A01(r2)     // Catch:{ 9HX -> 0x0202 }
        L_0x01e3:
            r9.A01 = r2     // Catch:{ 9HX -> 0x0202 }
            java.lang.String r2 = X.BE7.A0f(r4)     // Catch:{ 9HX -> 0x0202 }
            if (r2 != 0) goto L_0x01ed
            r2 = 1
            goto L_0x01f1
        L_0x01ed:
            float r2 = X.A90.A01(r2)     // Catch:{ 9HX -> 0x0202 }
        L_0x01f1:
            r9.A02 = r2     // Catch:{ 9HX -> 0x0202 }
            java.lang.String r2 = X.BE7.A0g(r4)     // Catch:{ 9HX -> 0x0202 }
            if (r2 != 0) goto L_0x01fb
            r2 = 1
            goto L_0x01ff
        L_0x01fb:
            float r2 = X.A90.A01(r2)     // Catch:{ 9HX -> 0x0202 }
        L_0x01ff:
            r9.A03 = r2     // Catch:{ 9HX -> 0x0202 }
            goto L_0x020d
        L_0x0202:
            r5 = move-exception
            java.lang.String r4 = "FlexboxBinderUtils"
            java.lang.String r2 = "Error parsing touch expansion property"
            X.C25913CoX.A01(r4, r2)
            r5.printStackTrace()
        L_0x020d:
            r8.add(r9)
            goto L_0x017c
        L_0x0212:
            boolean r2 = X.C17880vN.A1X(r8)
            if (r2 == 0) goto L_0x0ae3
            if (r0 != 0) goto L_0x0222
            int r0 = r1.A04
            long r1 = (long) r0
            X.BV9 r0 = new X.BV9
            r0.<init>(r3, r1, r6)
        L_0x0222:
            X.AIs r1 = new X.AIs
            r1.<init>()
            X.0Ij r3 = new X.0Ij
            r3.<init>(r1, r8)
            goto L_0x03c8
        L_0x022e:
            r8 = 0
            r0 = 2131428150(0x7f0b0336, float:1.8477936E38)
            android.util.SparseArray r7 = r3.A01
            r7.get(r0)
            r0 = 46
            X.DFL r2 = r1.A09(r0)
            if (r2 == 0) goto L_0x0244
            r0 = 40
            r2.A0D(r0)
        L_0x0244:
            X.CUz r4 = new X.CUz
            r4.<init>(r2)
            android.net.Uri r6 = X.C25865CnY.A00(r3, r1)
            if (r6 != 0) goto L_0x02c0
            X.DBz r5 = X.C26746DBz.A00
        L_0x0251:
            X.E9v r11 = X.C25865CnY.A01(r3, r1)
            r0 = 63
            X.E8A r0 = r1.A0A(r0)
            if (r0 != 0) goto L_0x02ba
            r9 = 0
        L_0x025e:
            r0 = 2131428164(0x7f0b0344, float:1.8477965E38)
            java.lang.Object r2 = r7.get(r0)
            X.DBs r6 = new X.DBs
            r6.<init>()
            if (r9 == 0) goto L_0x0271
            java.util.concurrent.CopyOnWriteArrayList r0 = r6.A00
            r0.add(r9)
        L_0x0271:
            if (r2 == 0) goto L_0x0278
            java.util.concurrent.CopyOnWriteArrayList r0 = r6.A00
            r0.add(r2)
        L_0x0278:
            X.BRd r12 = X.C25865CnY.A02(r3, r1)
            r0 = 74
            boolean r17 = r1.A0I(r0, r8)
            java.lang.String r3 = "BloksImageComponent"
            r0 = 2131428158(0x7f0b033e, float:1.8477953E38)
            java.lang.Object r2 = r7.get(r0)
            X.D4B r2 = (X.D4B) r2
            java.lang.String r0 = "i"
            X.D4B r7 = new X.D4B
            r7.<init>(r2, r0, r3)
            int r0 = r1.A04
            long r2 = (long) r0
            java.util.concurrent.CopyOnWriteArrayList r0 = r6.A00
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x02a0
            r6 = 0
        L_0x02a0:
            r0 = 73
            java.lang.String r1 = r1.A0D(r0)
            if (r1 == 0) goto L_0x02ae
            X.D4B r0 = new X.D4B
            r0.<init>(r7, r1)
            r7 = r0
        L_0x02ae:
            X.0C6 r0 = new X.0C6
            r8 = r0
            r9 = r7
            r10 = r6
            r13 = r5
            r14 = r4
            r15 = r2
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r17)
            return r0
        L_0x02ba:
            X.DBt r9 = new X.DBt
            r9.<init>(r3, r1, r0)
            goto L_0x025e
        L_0x02c0:
            r0 = 58
            java.lang.String r2 = r1.A0D(r0)
            if (r2 == 0) goto L_0x02e8
            java.lang.String r0 = "image_format"
            java.util.Map r0 = X.C108975cc.A0h(r0, r2)
        L_0x02ce:
            X.DVM r2 = new X.DVM
            r2.<init>()
            if (r0 == 0) goto L_0x02d8
            r2.putAll(r0)
        L_0x02d8:
            java.lang.String r0 = "uri_source"
            r2.put(r0, r6)
            X.DVM r0 = X.C200610r.A05(r2)
            X.DBy r5 = new X.DBy
            r5.<init>(r6, r0)
            goto L_0x0251
        L_0x02e8:
            r0 = 0
            goto L_0x02ce
        L_0x02ea:
            X.C18070vi.A0b(r3)
            X.Bny r0 = new X.Bny
            r0.<init>(r3, r1)
            return r0
        L_0x02f3:
            X.C18070vi.A0b(r3)
            X.Bo0 r0 = new X.Bo0
            r0.<init>(r3, r1)
            return r0
        L_0x02fc:
            int r0 = r1.A04
            long r4 = (long) r0
            java.lang.Integer r2 = X.AnonymousClass00R.A01
            X.BV4 r0 = new X.BV4
            r0.<init>(r2)
            r0.A00 = r4
            X.0tO r2 = X.BV4.A01
            X.BE7.A1A(r2, r0)
            r2 = 41
            X.E8A r4 = r1.A0A(r2)
            if (r4 == 0) goto L_0x031d
            X.DFm r2 = new X.DFm
            r2.<init>(r3, r1, r4)
            X.BE7.A1A(r2, r0)
        L_0x031d:
            X.DFh r1 = new X.DFh
            r1.<init>(r3)
            X.BE7.A1A(r1, r0)
            return r0
        L_0x0326:
            X.Bnx r0 = new X.Bnx
            r0.<init>(r3, r1)
            return r0
        L_0x032c:
            int r0 = r1.A04
            long r4 = (long) r0
            java.lang.Integer r2 = X.AnonymousClass00R.A01
            X.BV4 r0 = new X.BV4
            r0.<init>(r2)
            r0.A00 = r4
            X.0tO r2 = X.BV4.A01
            X.BE7.A1A(r2, r0)
            r2 = 40
            X.E8A r4 = r1.A0A(r2)
            if (r4 == 0) goto L_0x0ae3
            X.DFm r2 = new X.DFm
            r2.<init>(r3, r1, r4)
            X.0Ij r3 = new X.0Ij
            r3.<init>(r2, r0)
            goto L_0x03c8
        L_0x0350:
            X.C18070vi.A0b(r3)
            X.Bnz r0 = new X.Bnz
            r0.<init>(r3, r1)
            return r0
        L_0x0359:
            X.BoI r0 = new X.BoI
            r0.<init>(r3, r1)
            return r0
        L_0x035f:
            int r0 = r1.A04
            long r4 = (long) r0
            boolean r1 = X.C26272CwJ.A07(r3)
            X.BV9 r0 = new X.BV9
            r0.<init>(r3, r4, r1)
            return r0
        L_0x036c:
            X.C18070vi.A0b(r3)
            X.Bnw r0 = new X.Bnw
            r0.<init>(r3, r1)
            return r0
        L_0x0375:
            X.C18070vi.A0b(r3)
            X.Bnv r0 = new X.Bnv
            r0.<init>(r3, r1)
            return r0
        L_0x037e:
            X.Bo9 r0 = new X.Bo9
            r0.<init>(r3, r1)
            return r0
        L_0x0384:
            int r0 = r1.A04
            long r4 = (long) r0
            boolean r2 = X.C26272CwJ.A07(r3)
            X.BV9 r0 = new X.BV9
            r0.<init>(r3, r4, r2)
            long r5 = r0.A07
            X.Bnq r4 = new X.Bnq
            r4.<init>(r3, r5)
            X.0Ij r2 = new X.0Ij
            r2.<init>(r4, r1)
            r0.A0L(r2)
            r7 = 38
            X.DFL r4 = r1.A09(r7)
            r6 = 0
            if (r4 == 0) goto L_0x03cc
            r2 = 36
            X.E8A r5 = r4.A0A(r2)
        L_0x03ae:
            X.DFL r4 = r1.A09(r7)
            if (r4 == 0) goto L_0x03ba
            r2 = 35
            X.E8A r6 = r4.A0A(r2)
        L_0x03ba:
            if (r5 != 0) goto L_0x03be
            if (r6 == 0) goto L_0x0ae3
        L_0x03be:
            X.AIt r2 = new X.AIt
            r2.<init>(r3, r1, r6, r5)
            X.0Ij r3 = new X.0Ij
            r3.<init>(r2, r1)
        L_0x03c8:
            r0.A0L(r3)
            return r0
        L_0x03cc:
            r5 = r6
            goto L_0x03ae
        L_0x03ce:
            X.Bo3 r0 = new X.Bo3
            r0.<init>(r3, r1)
            return r0
        L_0x03d4:
            X.0Qf r0 = com.bloks.components.bkcomponentszoomable.BKBloksComponentsZoomableBinderUtil.createRenderUnit(r3, r1)
            return r0
        L_0x03d9:
            X.BoH r0 = new X.BoH
            r0.<init>(r3, r1)
            return r0
        L_0x03df:
            java.lang.Object r4 = X.C26272CwJ.A04(r3, r1)
            X.ClD r4 = (X.C25743ClD) r4
            X.C24518C7m.A00(r1)
            int r0 = r1.A04
            long r5 = (long) r0
            X.BVF r11 = r4.A01
            android.content.Context r8 = r3.A00
            r2 = 0
            java.lang.Integer r0 = A06(r1)
            int r7 = r0.intValue()
            if (r7 == r2) goto L_0x0478
            r2 = 1
            X.Cvf r0 = X.C26242Cvf.A00
            if (r7 == r2) goto L_0x043d
            X.CT8 r0 = r0.A05(r8, r1)
            int r2 = r0.A01
            int r0 = r0.A02
            X.BVC r13 = new X.BVC
            r13.<init>(r2, r0)
        L_0x040c:
            X.BV5 r0 = new X.BV5
            r0.<init>(r13, r11, r5)
            java.lang.Integer r5 = A06(r1)
            java.lang.Integer r17 = X.AnonymousClass00R.A01
            r2 = r17
            if (r5 != r2) goto L_0x0428
            X.DFP r5 = new X.DFP
            r5.<init>()
            X.0Ij r2 = new X.0Ij
            r2.<init>(r5, r1)
            r0.A0L(r2)
        L_0x0428:
            X.CKb r2 = r4.A03
            r0.A07 = r2
            r5 = 67
            r2 = 0
            boolean r6 = r1.A0I(r5, r2)
            r5 = 1
            if (r6 == 0) goto L_0x0654
            r6 = 71
            java.lang.String r9 = r1.A0D(r6)
            goto L_0x04ab
        L_0x043d:
            X.CT8 r9 = r0.A05(r8, r1)
            java.util.List r0 = X.BE7.A0r(r1)
            java.util.ArrayList r10 = X.C29351c6.A0D(r0)
            java.util.Iterator r7 = r0.iterator()
        L_0x044d:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x0468
            X.DFL r2 = X.BE8.A0R(r7)
            boolean r0 = X.C26242Cvf.A03(r2)
            if (r0 == 0) goto L_0x0463
            int r0 = r9.A02
        L_0x045f:
            X.C17890vO.A1D(r10, r0)
            goto L_0x044d
        L_0x0463:
            int r0 = X.C26242Cvf.A00(r2)
            goto L_0x045f
        L_0x0468:
            r0 = 0
            X.BLi r7 = new X.BLi
            r7.<init>(r10, r0)
            int r2 = r9.A01
            int r0 = r9.A02
            X.BVD r13 = new X.BVD
            r13.<init>(r7, r2, r0)
            goto L_0x040c
        L_0x0478:
            int r12 = X.C24520C7o.A00(r1)
            r0 = 73
            r10 = 0
            boolean r9 = r1.A0I(r0, r2)
            java.util.List r0 = X.BE7.A0r(r1)
            java.util.Iterator r7 = r0.iterator()
        L_0x048b:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x04a4
            java.lang.Object r2 = r7.next()
            r0 = r2
            X.DFL r0 = (X.DFL) r0
            X.C18070vi.A0b(r0)
            boolean r0 = X.C24522C7q.A00(r0)
            if (r0 == 0) goto L_0x048b
            if (r2 == 0) goto L_0x04a4
            r10 = 1
        L_0x04a4:
            X.BVE r13 = new X.BVE
            r13.<init>(r12, r9, r10)
            goto L_0x040c
        L_0x04ab:
            float r7 = X.C72463Mc.A00(r8)     // Catch:{ 9HX -> 0x05bd }
            r6 = 1082130432(0x40800000, float:4.0)
            float r7 = r7 * r6
            if (r9 == 0) goto L_0x04b8
            float r7 = X.A90.A01(r9)     // Catch:{ 9HX -> 0x05bd }
        L_0x04b8:
            int r6 = (int) r7
            r25 = r6
            r6 = 70
            X.DFL r6 = r1.A09(r6)
            if (r6 == 0) goto L_0x0580
            int r12 = X.C25340Cdz.A01(r3, r6, r2)
        L_0x04c7:
            r6 = 78
            X.DFL r6 = r1.A09(r6)
            if (r6 == 0) goto L_0x057d
            int r11 = X.C25340Cdz.A01(r3, r6, r2)
        L_0x04d3:
            r6 = 68
            boolean r16 = r1.A0I(r6, r2)
            r6 = 72
            java.lang.String r6 = r1.A0D(r6)
            if (r6 != 0) goto L_0x0577
            r6 = 0
        L_0x04e2:
            int r6 = (int) r6
            r24 = r6
            X.BM0 r10 = r4.A06
            r6 = 87
            X.DFL r9 = r1.A09(r6)
            r6 = 76
            if (r9 == 0) goto L_0x0563
            r6 = 42
            float r6 = X.CC7.A00(r9, r6)
            int r15 = (int) r6
            r6 = 40
            float r6 = X.CC7.A00(r9, r6)
            int r14 = (int) r6
            r6 = 41
            float r6 = X.CC7.A00(r9, r6)
            int r13 = (int) r6
            r6 = 35
            float r6 = X.CC7.A00(r9, r6)
            int r7 = (int) r6
            r6 = 36
            float r6 = X.CC7.A00(r9, r6)
            int r6 = (int) r6
            r18 = r6
            r6 = 38
            float r6 = X.CC7.A00(r9, r6)
            int r6 = (int) r6
            if (r15 != 0) goto L_0x0521
            r15 = r18
        L_0x0521:
            if (r13 != 0) goto L_0x0524
            r13 = r6
        L_0x0524:
            android.graphics.Rect r9 = new android.graphics.Rect
            r9.<init>(r15, r14, r13, r7)
        L_0x0529:
            r6 = 81
            X.DFL r6 = r1.A09(r6)
            if (r6 != 0) goto L_0x053a
            r6 = 87
            X.DFL r6 = r1.A09(r6)
            r7 = 0
            if (r6 == 0) goto L_0x053b
        L_0x053a:
            r7 = 1
        L_0x053b:
            r6 = 90
            java.lang.String r13 = r1.A0D(r6)
            r6 = 0
            if (r13 != 0) goto L_0x055e
            r19 = 0
        L_0x0546:
            r13 = 89
            java.lang.String r13 = r1.A0D(r13)
            if (r13 != 0) goto L_0x0559
            r20 = 0
        L_0x0550:
            r13 = 93
            java.lang.String r13 = r1.A0D(r13)
            if (r13 == 0) goto L_0x05c4
            goto L_0x0585
        L_0x0559:
            float r20 = X.A90.A01(r13)     // Catch:{ 9HX -> 0x0599 }
            goto L_0x0550
        L_0x055e:
            float r19 = X.A90.A01(r13)     // Catch:{ 9HX -> 0x05a4 }
            goto L_0x0546
        L_0x0563:
            java.lang.String r6 = r1.A0D(r6)     // Catch:{ 9HX -> 0x05af }
            if (r6 != 0) goto L_0x056a
            goto L_0x056f
        L_0x056a:
            float r6 = X.A90.A01(r6)     // Catch:{ 9HX -> 0x05af }
            goto L_0x0570
        L_0x056f:
            r6 = 0
        L_0x0570:
            int r6 = (int) r6
            android.graphics.Rect r9 = new android.graphics.Rect
            r9.<init>(r6, r6, r6, r6)
            goto L_0x0529
        L_0x0577:
            float r6 = X.A90.A01(r6)     // Catch:{ 9HX -> 0x05b6 }
            goto L_0x04e2
        L_0x057d:
            r11 = 0
            goto L_0x04d3
        L_0x0580:
            r12 = -7829368(0xffffffffff888888, float:NaN)
            goto L_0x04c7
        L_0x0585:
            float r22 = X.A90.A01(r13)     // Catch:{ 9HX -> 0x058e }
            int r13 = (r22 > r6 ? 1 : (r22 == r6 ? 0 : -1))
            if (r13 != 0) goto L_0x05c6
            goto L_0x05c4
        L_0x058e:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "Error parsing scroll indicator's shadow Radius: "
            java.lang.RuntimeException r0 = X.BEA.A0g(r0, r13, r1)
            throw r0
        L_0x0599:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "Error parsing scroll indicator's shadow Height: "
            java.lang.RuntimeException r0 = X.BEA.A0g(r0, r13, r1)
            throw r0
        L_0x05a4:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "Error parsing scroll indicator's shadow Width: "
            java.lang.RuntimeException r0 = X.BEA.A0g(r0, r13, r1)
            throw r0
        L_0x05af:
            java.lang.String r0 = "Invalid pixel format for scroll indicator margin"
            java.lang.RuntimeException r0 = X.AnonymousClass8BR.A0w(r0)
            throw r0
        L_0x05b6:
            java.lang.String r0 = "Invalid pixel format for scroll indicator corner radius"
            java.lang.RuntimeException r0 = X.AnonymousClass8BR.A0w(r0)
            throw r0
        L_0x05bd:
            java.lang.String r0 = "Invalid pixel format for scroll indicator size"
            java.lang.RuntimeException r0 = X.AnonymousClass8BR.A0w(r0)
            throw r0
        L_0x05c4:
            r22 = 1056964608(0x3f000000, float:0.5)
        L_0x05c6:
            r13 = 91
            float r21 = r1.A03(r13, r6)
            int r6 = (r21 > r6 ? 1 : (r21 == r6 ? 0 : -1))
            if (r6 < 0) goto L_0x096a
            r6 = 1065353216(0x3f800000, float:1.0)
            int r6 = (r21 > r6 ? 1 : (r21 == r6 ? 0 : -1))
            if (r6 > 0) goto L_0x096a
            r6 = 88
            X.DFL r6 = r1.A09(r6)
            if (r6 == 0) goto L_0x0700
            int r23 = X.C25340Cdz.A01(r3, r6, r2)
        L_0x05e2:
            X.CSs r6 = new X.CSs
            r18 = r6
            r18.<init>(r19, r20, r21, r22, r23)
            if (r10 == 0) goto L_0x06e7
            int r13 = r10.A04
            if (r13 != r12) goto L_0x06e7
            int r13 = r10.A03
            if (r13 != r11) goto L_0x06e7
            int r14 = r10.A06
            r13 = r25
            if (r14 != r13) goto L_0x06e7
            int r14 = r10.A05
            r13 = r24
            if (r14 != r13) goto L_0x06e7
            boolean r14 = r10.A09
            r13 = r16
            if (r14 != r13) goto L_0x06e7
            android.graphics.Rect r13 = r10.A07
            boolean r13 = r13.equals(r9)
            if (r13 == 0) goto L_0x06e7
            boolean r13 = r10.A0A
            if (r13 != r7) goto L_0x06e7
            X.CSs r14 = r10.A08
            float r15 = r14.A01
            float r13 = r6.A01
            int r13 = (r15 > r13 ? 1 : (r15 == r13 ? 0 : -1))
            if (r13 != 0) goto L_0x06e7
            float r15 = r14.A00
            float r13 = r6.A00
            int r13 = (r15 > r13 ? 1 : (r15 == r13 ? 0 : -1))
            if (r13 != 0) goto L_0x06e7
            float r15 = r14.A02
            float r13 = r6.A02
            int r13 = (r15 > r13 ? 1 : (r15 == r13 ? 0 : -1))
            if (r13 != 0) goto L_0x06e7
            float r15 = r14.A03
            float r13 = r6.A03
            int r13 = (r15 > r13 ? 1 : (r15 == r13 ? 0 : -1))
            if (r13 != 0) goto L_0x06e7
            int r14 = r14.A04
            int r13 = r6.A04
            if (r14 != r13) goto L_0x06e7
        L_0x0639:
            r6 = 77
            boolean r7 = r1.A0I(r6, r2)
            X.8IC r6 = new X.8IC
            r6.<init>(r10, r7)
            r0.A0M(r6)
            java.util.List r6 = r0.A08
            if (r6 != 0) goto L_0x0651
            java.util.ArrayList r6 = X.AnonymousClass000.A13()
            r0.A08 = r6
        L_0x0651:
            r6.add(r10)
        L_0x0654:
            r6 = 50
            X.E8A r7 = r1.A0A(r6)
            if (r7 == 0) goto L_0x0664
            X.BME r6 = new X.BME
            r6.<init>(r3, r1, r7)
            r0.A0M(r6)
        L_0x0664:
            r6 = 61
            X.E8A r7 = r1.A0A(r6)
            if (r7 == 0) goto L_0x0674
            X.BMD r6 = new X.BMD
            r6.<init>(r3, r1, r7)
            r0.A0M(r6)
        L_0x0674:
            r6 = 49
            X.E8A r9 = r1.A0A(r6)
            if (r9 == 0) goto L_0x068d
            android.view.ViewGroup$MarginLayoutParams r6 = X.BMA.A01
            X.CW6 r7 = new X.CW6
            r7.<init>(r3, r1, r9)
            X.BMA r6 = new X.BMA
            r6.<init>()
            r6.A00 = r7
            r0.A0M(r6)
        L_0x068d:
            r6 = 54
            java.lang.String r7 = r1.A0D(r6)
            if (r7 != 0) goto L_0x06a4
            java.lang.Integer r9 = X.AnonymousClass00R.A0N
        L_0x0697:
            java.lang.Integer r6 = X.AnonymousClass00R.A0N
            if (r9 == r6) goto L_0x07d6
            r6 = 69
            java.lang.String r7 = r1.A0D(r6)
            if (r7 == 0) goto L_0x072e
            goto L_0x0704
        L_0x06a4:
            int r6 = r7.hashCode()     // Catch:{ 9HX -> 0x0963 }
            switch(r6) {
                case -1364013995: goto L_0x06dc;
                case 100571: goto L_0x06d1;
                case 3387192: goto L_0x06c6;
                case 109757538: goto L_0x06bb;
                default: goto L_0x06ab;
            }     // Catch:{ 9HX -> 0x0963 }
        L_0x06ab:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ 9HX -> 0x0963 }
            java.lang.String r0 = "can't parse unknown snap gravity: "
            java.lang.String r1 = X.AnonymousClass001.A1H(r0, r7, r1)     // Catch:{ 9HX -> 0x0963 }
            X.9HX r0 = new X.9HX     // Catch:{ 9HX -> 0x0963 }
            r0.<init>(r1)     // Catch:{ 9HX -> 0x0963 }
            throw r0     // Catch:{ 9HX -> 0x0963 }
        L_0x06bb:
            java.lang.String r6 = "start"
            boolean r6 = r7.equals(r6)     // Catch:{ 9HX -> 0x0963 }
            if (r6 == 0) goto L_0x06ab
            java.lang.Integer r9 = X.AnonymousClass00R.A00     // Catch:{ 9HX -> 0x0963 }
            goto L_0x0697
        L_0x06c6:
            java.lang.String r6 = "none"
            boolean r6 = r7.equals(r6)     // Catch:{ 9HX -> 0x0963 }
            if (r6 == 0) goto L_0x06ab
            java.lang.Integer r9 = X.AnonymousClass00R.A0N     // Catch:{ 9HX -> 0x0963 }
            goto L_0x0697
        L_0x06d1:
            java.lang.String r6 = "end"
            boolean r6 = r7.equals(r6)     // Catch:{ 9HX -> 0x0963 }
            if (r6 == 0) goto L_0x06ab
            java.lang.Integer r9 = X.AnonymousClass00R.A0C     // Catch:{ 9HX -> 0x0963 }
            goto L_0x0697
        L_0x06dc:
            java.lang.String r6 = "center"
            boolean r6 = r7.equals(r6)     // Catch:{ 9HX -> 0x0963 }
            if (r6 == 0) goto L_0x06ab
            r9 = r17
            goto L_0x0697
        L_0x06e7:
            X.BM0 r10 = new X.BM0
            r22 = r11
            r23 = r25
            r25 = r16
            r26 = r7
            r18 = r10
            r19 = r9
            r20 = r6
            r21 = r12
            r18.<init>(r19, r20, r21, r22, r23, r24, r25, r26)
            r4.A06 = r10
            goto L_0x0639
        L_0x0700:
            r23 = 0
            goto L_0x05e2
        L_0x0704:
            java.lang.String r6 = "linear"
            boolean r6 = r7.equals(r6)     // Catch:{ 9HX -> 0x0727 }
            if (r6 != 0) goto L_0x0724
            java.lang.String r6 = "pager"
            boolean r6 = r7.equals(r6)     // Catch:{ 9HX -> 0x0727 }
            if (r6 != 0) goto L_0x072e
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ 9HX -> 0x0727 }
            java.lang.String r0 = "can't parse unknown snap style: "
            java.lang.String r1 = X.AnonymousClass001.A1H(r0, r7, r1)     // Catch:{ 9HX -> 0x0727 }
            X.9HX r0 = new X.9HX     // Catch:{ 9HX -> 0x0727 }
            r0.<init>(r1)     // Catch:{ 9HX -> 0x0727 }
            throw r0     // Catch:{ 9HX -> 0x0727 }
        L_0x0724:
            java.lang.Integer r17 = X.AnonymousClass00R.A00     // Catch:{ 9HX -> 0x0727 }
            goto L_0x072e
        L_0x0727:
            java.lang.String r0 = "Invalid snap style value"
            java.lang.RuntimeException r0 = X.AnonymousClass8BR.A0w(r0)
            throw r0
        L_0x072e:
            r6 = 45
            java.lang.String r6 = r1.A0D(r6)
            if (r6 != 0) goto L_0x075d
            r6 = 0
        L_0x0737:
            java.lang.Float r11 = java.lang.Float.valueOf(r6)
            X.BM9 r10 = r4.A05
            int r13 = r17.intValue()
            java.lang.String r12 = "Invalid gravity type :"
            r7 = 2
            int r6 = r9.intValue()
            if (r13 == r2) goto L_0x0762
            if (r6 == r2) goto L_0x07a3
            if (r6 == r7) goto L_0x07a3
            if (r6 == r5) goto L_0x07a3
            java.lang.StringBuilder r1 = X.AnonymousClass000.A11(r12)
            java.lang.String r0 = X.CCH.A00(r9)
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A12(r0, r1)
            throw r0
        L_0x075d:
            float r6 = X.A90.A01(r6)     // Catch:{ 9HX -> 0x079c }
            goto L_0x0737
        L_0x0762:
            if (r6 == r2) goto L_0x0775
            if (r6 == r7) goto L_0x0775
            if (r6 == r5) goto L_0x0775
            java.lang.StringBuilder r1 = X.AnonymousClass000.A11(r12)
            java.lang.String r0 = X.CCH.A00(r9)
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A12(r0, r1)
            throw r0
        L_0x0775:
            boolean r6 = r10 instanceof X.C111695kH
            if (r6 == 0) goto L_0x078b
            r6 = r10
            X.5kH r6 = (X.C111695kH) r6
            X.6yz r7 = r6.A00
            java.lang.Integer r6 = r7.A03
            if (r6 != r9) goto L_0x078b
            java.lang.Float r6 = r7.A02
            boolean r6 = X.C25337Cdw.A00(r6, r11)
            if (r6 == 0) goto L_0x078b
            goto L_0x07b8
        L_0x078b:
            X.5kH r10 = new X.5kH
            r10.<init>()
            X.6yz r6 = new X.6yz
            r6.<init>()
            r6.A03 = r9
            r6.A02 = r11
            r10.A00 = r6
            goto L_0x07b8
        L_0x079c:
            java.lang.String r0 = "Invalid pixel format for left offset on snap"
            java.lang.RuntimeException r0 = X.AnonymousClass8BR.A0w(r0)
            throw r0
        L_0x07a3:
            boolean r6 = r10 instanceof X.C111875kZ
            if (r6 == 0) goto L_0x08e4
            r6 = r10
            X.5kZ r6 = (X.C111875kZ) r6
            X.6yz r7 = r6.A00
            java.lang.Integer r6 = r7.A03
            if (r6 != r9) goto L_0x08e4
            java.lang.Float r6 = r7.A02
            boolean r6 = X.C25337Cdw.A00(r6, r11)
            if (r6 == 0) goto L_0x08e4
        L_0x07b8:
            r0.A06 = r10
            r4.A05 = r10
            r4.A07 = r9
            r6 = 51
            X.E8A r7 = r1.A0A(r6)
            r6 = 97
            X.E8A r6 = r1.A0A(r6)
            if (r7 != 0) goto L_0x07ce
            if (r6 == 0) goto L_0x07d6
        L_0x07ce:
            X.BMG r6 = new X.BMG
            r6.<init>(r10, r3, r1)
            r0.A0M(r6)
        L_0x07d6:
            r13 = 0
            java.lang.Integer r6 = A06(r1)
            int r6 = r6.intValue()
            if (r6 == r2) goto L_0x07fb
            X.Cvf r6 = X.C26242Cvf.A00
            X.CT8 r6 = r6.A05(r8, r1)
            android.graphics.Rect r7 = r6.A04
            int r6 = r7.left
            if (r6 != 0) goto L_0x07f9
            int r6 = r7.top
            if (r6 != 0) goto L_0x07f9
            int r6 = r7.right
            if (r6 != 0) goto L_0x07f9
            int r6 = r7.bottom
            if (r6 == 0) goto L_0x07fb
        L_0x07f9:
            r0.A04 = r7
        L_0x07fb:
            java.lang.Integer r6 = A06(r1)
            int r6 = r6.intValue()
            if (r6 == r2) goto L_0x0857
            if (r6 == r5) goto L_0x0851
            X.BLz r13 = new X.BLz
            r13.<init>(r3, r1)
        L_0x080c:
            java.util.List r6 = r0.A08
            if (r6 != 0) goto L_0x0816
            java.util.ArrayList r6 = X.AnonymousClass000.A13()
            r0.A08 = r6
        L_0x0816:
            r6.add(r13)
        L_0x0819:
            r6 = 43
            boolean r6 = r1.A0I(r6, r2)
            if (r6 == 0) goto L_0x082d
            X.1qV r6 = r4.A04
            if (r6 == 0) goto L_0x084b
            X.1qV r6 = r4.A04
        L_0x0827:
            r4.A04 = r6
            r6.A00 = r2
            r0.A05 = r6
        L_0x082d:
            r6 = 35
            boolean r7 = r1.A0I(r6, r2)
            r6 = 2
            if (r7 == 0) goto L_0x0837
            r6 = 0
        L_0x0837:
            r0.A02 = r6
            r6 = 41
            X.DFL r6 = r1.A09(r6)
            if (r6 == 0) goto L_0x0847
            int r6 = X.C25340Cdz.A01(r3, r6, r2)
            r0.A00 = r6
        L_0x0847:
            r6 = 75
            goto L_0x08f6
        L_0x084b:
            X.1qV r6 = new X.1qV
            r6.<init>()
            goto L_0x0827
        L_0x0851:
            X.BLw r13 = new X.BLw
            r13.<init>(r3, r1)
            goto L_0x080c
        L_0x0857:
            r6 = 55
            java.lang.String r6 = r1.A0D(r6)     // Catch:{ 9HX -> 0x095c }
            r12 = 0
            if (r6 != 0) goto L_0x0863
            r17 = 0
            goto L_0x0867
        L_0x0863:
            float r17 = X.A90.A01(r6)     // Catch:{ 9HX -> 0x095c }
        L_0x0867:
            r6 = 56
            java.lang.String r6 = r1.A0D(r6)     // Catch:{ 9HX -> 0x095c }
            if (r6 != 0) goto L_0x0871
            r15 = 0
            goto L_0x0875
        L_0x0871:
            float r15 = X.A90.A01(r6)     // Catch:{ 9HX -> 0x095c }
        L_0x0875:
            r6 = 44
            java.lang.String r6 = r1.A0D(r6)     // Catch:{ 9HX -> 0x095c }
            if (r6 != 0) goto L_0x0880
            r16 = 0
            goto L_0x0884
        L_0x0880:
            float r16 = X.A90.A01(r6)     // Catch:{ 9HX -> 0x095c }
        L_0x0884:
            r6 = 100
            java.lang.String r6 = r1.A0D(r6)     // Catch:{ 9HX -> 0x095c }
            X.Byh r8 = X.C24284Byh.STRETCH     // Catch:{ 9HX -> 0x095c }
            X.Byh r14 = X.C24519C7n.A00(r8, r6)     // Catch:{ 9HX -> 0x095c }
            r11 = 0
            if (r14 != r8) goto L_0x08ca
            java.util.List r7 = X.BE7.A0r(r1)     // Catch:{ 9HX -> 0x095c }
            boolean r6 = r7 instanceof java.util.Collection     // Catch:{ 9HX -> 0x095c }
            r10 = 0
            if (r6 == 0) goto L_0x08a3
            boolean r6 = r7.isEmpty()     // Catch:{ 9HX -> 0x095c }
            if (r6 == 0) goto L_0x08a3
            goto L_0x08cb
        L_0x08a3:
            java.util.Iterator r9 = r7.iterator()     // Catch:{ 9HX -> 0x095c }
        L_0x08a7:
            boolean r6 = r9.hasNext()     // Catch:{ 9HX -> 0x095c }
            if (r6 == 0) goto L_0x08c8
            X.DFL r6 = X.BE6.A0d(r9)     // Catch:{ 9HX -> 0x095c }
            X.DFL r7 = X.BE7.A0P(r6)     // Catch:{ 9HX -> 0x095c }
            r6 = r11
            if (r7 == 0) goto L_0x08bc
            java.lang.String r6 = X.BE7.A0i(r7)     // Catch:{ 9HX -> 0x095c }
        L_0x08bc:
            X.Byh r6 = X.C24519C7n.A00(r14, r6)     // Catch:{ 9HX -> 0x095c }
            if (r6 == r8) goto L_0x08a7
            int r13 = r13 + 1
            if (r13 >= 0) goto L_0x08a7
            goto L_0x0958
        L_0x08c8:
            if (r13 == 0) goto L_0x08cb
        L_0x08ca:
            r10 = 1
        L_0x08cb:
            int r6 = (r17 > r12 ? 1 : (r17 == r12 ? 0 : -1))
            if (r6 != 0) goto L_0x08d9
            int r6 = (r15 > r12 ? 1 : (r15 == r12 ? 0 : -1))
            if (r6 != 0) goto L_0x08d9
            int r6 = (r16 > r12 ? 1 : (r16 == r12 ? 0 : -1))
            if (r6 != 0) goto L_0x08d9
            if (r10 == 0) goto L_0x0819
        L_0x08d9:
            int r18 = X.C24520C7o.A00(r1)     // Catch:{ 9HX -> 0x095c }
            X.BM1 r13 = new X.BM1     // Catch:{ 9HX -> 0x095c }
            r13.<init>(r14, r15, r16, r17, r18)     // Catch:{ 9HX -> 0x095c }
            goto L_0x080c
        L_0x08e4:
            X.5kZ r10 = new X.5kZ
            r10.<init>()
            X.6yz r6 = new X.6yz
            r6.<init>()
            r6.A03 = r9
            r6.A02 = r11
            r10.A00 = r6
            goto L_0x07b8
        L_0x08f6:
            java.lang.String r6 = r1.A0D(r6)     // Catch:{ 9HX -> 0x0902 }
            if (r6 != 0) goto L_0x08fd
            goto L_0x090b
        L_0x08fd:
            float r2 = X.A90.A01(r6)     // Catch:{ 9HX -> 0x0902 }
            goto L_0x090c
        L_0x0902:
            r8 = move-exception
            java.lang.String r7 = "CollectionBinderUtils"
            java.lang.String r6 = "Invalid dimension for fading edge length"
            X.C25913CoX.A00(r3, r7, r6, r8)
            goto L_0x090d
        L_0x090b:
            r2 = 0
        L_0x090c:
            int r2 = (int) r2
        L_0x090d:
            r0.A01 = r2
            r6 = 66
            r2 = -1
            int r2 = r1.A04(r6, r2)
            r0.A03 = r2
            r2 = 95
            boolean r2 = r1.A0I(r2, r5)
            r0.A0B = r2
            r2 = 98
            boolean r2 = r1.A0I(r2, r5)
            r0.A0A = r2
            X.CU5 r5 = r4.A02
            X.CIp r4 = new X.CIp
            r4.<init>(r3)
            X.DFk r2 = new X.DFk
            r2.<init>(r4, r5)
            X.BE7.A1A(r2, r0)
            X.CXY r2 = r3.A02
            X.E86 r2 = r2.A01
            r2.BNU()
            r2 = 65
            java.lang.String r2 = r1.A0D(r2)
            if (r2 == 0) goto L_0x0ae3
            java.lang.String r1 = "on_drag"
            boolean r1 = r2.equalsIgnoreCase(r1)
            if (r1 == 0) goto L_0x0ae3
            r2 = 1
            X.BMB r1 = new X.BMB
            r1.<init>(r3, r2)
            r0.A0M(r1)
            return r0
        L_0x0958:
            X.AnonymousClass1ZU.A0A()     // Catch:{ 9HX -> 0x095c }
            throw r11     // Catch:{ 9HX -> 0x095c }
        L_0x095c:
            java.lang.String r0 = "Invalid pixel format for Collection spacing"
            java.lang.RuntimeException r0 = X.AnonymousClass8BR.A0w(r0)
            throw r0
        L_0x0963:
            java.lang.String r0 = "Invalid snap gravity value"
            java.lang.RuntimeException r0 = X.AnonymousClass8BR.A0w(r0)
            throw r0
        L_0x096a:
            java.lang.String r0 = "Error parsing scroll indicator's shadow opacity: it should be in range [0..1]"
            java.lang.RuntimeException r0 = X.AnonymousClass8BR.A0w(r0)
            throw r0
        L_0x0971:
            java.lang.Object[] r1 = X.BEA.A1b(r2)
            java.lang.String r0 = "Attempting to createRenderUnit for unrecognized component style id %s"
            java.lang.String r1 = java.lang.String.format(r0, r1)
            java.lang.String r0 = "ComponentMapper"
            X.C25913CoX.A01(r0, r1)
            goto L_0x0abe
        L_0x0982:
            X.Cqj r2 = r0.A02
            X.Bo7 r0 = new X.Bo7
            r0.<init>(r3, r1, r2)
            return r0
        L_0x098a:
            X.Cqj r2 = r0.A02
            X.Bo5 r0 = new X.Bo5
            r0.<init>(r3, r1, r2)
            return r0
        L_0x0992:
            X.Cqj r2 = r0.A02
            X.8cw r0 = new X.8cw
            r0.<init>(r3, r1, r1, r2)
            return r0
        L_0x099a:
            X.Cqj r2 = r0.A02
            X.8cx r0 = new X.8cx
            r0.<init>(r3, r1, r2)
            return r0
        L_0x09a2:
            X.Cqj r2 = r0.A02
            X.8cv r0 = new X.8cv
            r0.<init>(r3, r1, r1, r2)
            return r0
        L_0x09aa:
            X.Cqj r2 = r0.A02
            X.8cu r0 = new X.8cu
            r0.<init>(r3, r1, r1, r2)
            return r0
        L_0x09b2:
            X.Cqj r2 = r0.A02
            X.8cy r0 = new X.8cy
            r0.<init>(r3, r1, r2)
            return r0
        L_0x09ba:
            X.CsU r2 = r0.A01
            X.BoC r0 = new X.BoC
            r0.<init>(r3, r1, r1, r2)
            return r0
        L_0x09c2:
            X.8cz r0 = new X.8cz
            r0.<init>(r3, r1)
            return r0
        L_0x09c8:
            java.lang.Object r6 = X.BE9.A0l(r3, r1)
            X.CMZ r6 = (X.CMZ) r6
            int r0 = r1.A04
            long r4 = (long) r0
            X.DsK r0 = new X.DsK
            r0.<init>(r6, r3, r1)
            X.DFs r3 = new X.DFs
            r3.<init>(r0)
            X.DFq r0 = X.C26834DFq.A00
            X.0YE r2 = new X.0YE
            r2.<init>(r0)
            X.Dod r0 = new X.Dod
            r0.<init>()
            X.0Hn r1 = new X.0Hn
            r1.<init>(r2, r0, r4)
            X.0YK r0 = new X.0YK
            r0.<init>(r3, r1)
            r6.A00 = r0
            X.0Hn r0 = r0.A00
            X.0C3 r0 = r0.A02
            return r0
        L_0x09f8:
            X.5qu r0 = new X.5qu
            r0.<init>(r3, r1)
            return r0
        L_0x09fe:
            X.D82 r2 = new X.D82
            r2.<init>()
            goto L_0x0a0c
        L_0x0a04:
            X.C18070vi.A0b(r3)
            X.D81 r2 = new X.D81
            r2.<init>()
        L_0x0a0c:
            X.Bo8 r0 = new X.Bo8
            r0.<init>(r2, r3, r1)
            return r0
        L_0x0a12:
            X.Cqj r2 = r0.A02
            X.C18070vi.A0i(r3, r2)
            X.5qt r0 = new X.5qt
            r0.<init>(r3, r1, r2)
            return r0
        L_0x0a1d:
            X.CsU r4 = r0.A01
            android.content.Context r2 = r3.A00
            android.view.TextureView r0 = new android.view.TextureView
            r0.<init>(r2)
            X.DAU r5 = X.C25307CdB.A01(r2, r0)
            r2 = 921600(0xe1000, float:1.291437E-39)
            r5.CLM(r2)     // Catch:{ Exception -> 0x0a42 }
            r0 = 1048576(0x100000, float:1.469368E-39)
            r5.CJv(r0)     // Catch:{ Exception -> 0x0a42 }
            r5.CK8(r2)     // Catch:{ Exception -> 0x0a42 }
            r0 = 1
            r5.CJA(r0)     // Catch:{ Exception -> 0x0a42 }
            r5.A05()     // Catch:{ Exception -> 0x0a42 }
            r5.CJm(r0)     // Catch:{ Exception -> 0x0a42 }
        L_0x0a42:
            X.00H r0 = r4.A03
            java.lang.Object r4 = r0.get()
            X.CTN r4 = (X.CTN) r4
            r0 = 3
            X.C18070vi.A0d(r4, r0)
            X.COL r2 = new X.COL
            r2.<init>(r3, r1)
            X.BoG r0 = new X.BoG
            r6 = r0
            r7 = r5
            r8 = r3
            r9 = r1
            r10 = r2
            r11 = r4
            r6.<init>(r7, r8, r9, r10, r11)
            return r0
        L_0x0a5f:
            X.16S r2 = r0.A00
            X.C18070vi.A0i(r3, r2)
            X.BoJ r0 = new X.BoJ
            r0.<init>(r3, r1, r2)
            return r0
        L_0x0a6a:
            X.Cqj r2 = r0.A02
            X.Bo6 r0 = new X.Bo6
            r0.<init>(r3, r1, r2)
            return r0
        L_0x0a72:
            X.Cqj r2 = r0.A02
            X.Bo4 r0 = new X.Bo4
            r0.<init>(r3, r1, r2)
            return r0
        L_0x0a7a:
            X.Cqj r2 = r0.A02
            X.BoB r0 = new X.BoB
            r0.<init>(r3, r1, r1, r2)
            return r0
        L_0x0a82:
            X.Cqj r2 = r0.A02
            X.BoF r0 = new X.BoF
            r0.<init>(r3, r1, r1, r2)
            return r0
        L_0x0a8a:
            X.Cqj r2 = r0.A02
            X.BoA r0 = new X.BoA
            r0.<init>(r3, r1, r1, r2)
            return r0
        L_0x0a92:
            X.Cqj r2 = r0.A02
            X.BoD r0 = new X.BoD
            r0.<init>(r3, r1, r1, r2)
            return r0
        L_0x0a9a:
            X.Bo2 r0 = new X.Bo2
            r0.<init>(r3, r1)
            return r0
        L_0x0aa0:
            X.Bo1 r0 = new X.Bo1
            r0.<init>(r3, r1)
            return r0
        L_0x0aa6:
            X.Bnu r0 = new X.Bnu
            r0.<init>(r3, r1)
            return r0
        L_0x0aac:
            r0 = 2131428943(0x7f0b064f, float:1.8479545E38)
            java.lang.Object r6 = X.DOZ.A00(r3, r0)
            X.EAQ r6 = (X.EAQ) r6
            if (r6 != 0) goto L_0x0ac0
            java.lang.String r1 = "CDSBottomSheetWrapperBinderUtils"
            java.lang.String r0 = "Rendering a bk.cds.bottomsheet.Wrapper outside of a CDS bottom sheet. The header will not render properly."
            X.C25913CoX.A01(r1, r0)
        L_0x0abe:
            r0 = 0
            return r0
        L_0x0ac0:
            int r0 = r1.A04
            long r4 = (long) r0
            boolean r2 = X.C26272CwJ.A07(r3)
            X.BV9 r0 = new X.BV9
            r0.<init>(r3, r4, r2)
            X.DFg r3 = new X.DFg
            r3.<init>(r6)
            X.0Ij r2 = new X.0Ij
            r2.<init>(r3, r1)
            r0.A0L(r2)
            return r0
        L_0x0ada:
            X.Cqj r2 = r0.A02
            if (r2 == 0) goto L_0x0ae4
            X.BoE r0 = new X.BoE
            r0.<init>(r3, r1, r1, r2)
        L_0x0ae3:
            return r0
        L_0x0ae4:
            java.lang.String r0 = "Cannot measure BKVideoComponentBinderUtils's render unit with a null BloksContext or WaBkComponentConfigurator or BloksModel"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0k(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26285Cwg.A0C(X.DOZ, X.DFL):X.0Qf");
    }

    /* JADX WARNING: type inference failed for: r4v6, types: [java.lang.Object, X.6ff] */
    /* JADX WARNING: type inference failed for: r4v13, types: [X.ALI, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r4v20, types: [java.lang.Object, X.DNQ] */
    /* JADX WARNING: type inference failed for: r2v2, types: [java.lang.Object, X.CKb] */
    public Object A0D(DOZ doz, DFL dfl) {
        int i = dfl.A05;
        switch (i) {
            case 13323:
                return new Object();
            case 13745:
                ? obj = new Object();
                obj.A00 = new C110705gv();
                return obj;
            case 13889:
                return new Object();
            case 13948:
                return new Object();
            case 14005:
            case 14093:
            case 15763:
            case 15768:
            case 15972:
            case 15981:
            case 16094:
            case 16451:
            case 16534:
            case 16718:
                return null;
            case 16586:
                return new CMZ(new C25741ClB(5, 10));
            case 16682:
                return new Object();
            case 16910:
                return new Object();
            default:
                switch (i) {
                    case 13496:
                        return new CUD();
                    case 13497:
                    case 13499:
                        return null;
                    case 13498:
                        return new Object();
                    default:
                        switch (i) {
                            case 13501:
                                String str = "";
                                String A0D = dfl.A0D(50);
                                if (A0D != null) {
                                    str = A0D;
                                }
                                ? obj2 = new Object();
                                obj2.A01 = -1;
                                obj2.A05 = str;
                                return obj2;
                            case 13502:
                                return new Object();
                            case 13503:
                            case 13504:
                                return null;
                            default:
                                if (i == 13326) {
                                    return null;
                                }
                                if (i == 13336) {
                                    return new CTH();
                                }
                                if (!A08(i)) {
                                    return null;
                                }
                                switch (i) {
                                    case 13317:
                                        ViewGroup.MarginLayoutParams marginLayoutParams = C25743ClD.A09;
                                        return new C25743ClD(new BVF(doz, dfl, C24518C7m.A00(dfl)), new CU5(), new Object());
                                    case 13320:
                                    case 13329:
                                    case 13334:
                                    case 13335:
                                    case 13666:
                                    case 14093:
                                    case 15728:
                                    case 15778:
                                    case 15981:
                                    case 16675:
                                    case 17184:
                                        return null;
                                    case 13323:
                                        return new C26741DBu();
                                    case 13327:
                                        boolean A0I = dfl.A0I(38, false);
                                        ? obj3 = new Object();
                                        obj3.A01 = A0I;
                                        return obj3;
                                    case 13708:
                                        return new C25080CWp(doz);
                                    case 13797:
                                        AtomicInteger atomicInteger = CFq.A00;
                                        return C17890vO.A0E(Integer.valueOf(atomicInteger.incrementAndGet()), atomicInteger.incrementAndGet());
                                    case 16160:
                                        return new CUL(Float.valueOf(dfl.A03(49, 0.0f)));
                                    case 16260:
                                        return BKBloksComponentsZoomableBinderUtil.createController(doz, dfl);
                                    case 16444:
                                        return new C25579CiJ(doz, dfl);
                                    case 16682:
                                        return new Object();
                                    default:
                                        throw BEB.A0S(i);
                                }
                        }
                }
        }
    }

    public C26285Cwg(AnonymousClass16S r1, C26109CsU csU, C26025Cqj cqj) {
        this.A02 = cqj;
        this.A01 = csU;
        this.A00 = r1;
    }

    public static int A01(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode == Integer.MIN_VALUE || mode == 1073741824) {
            return size;
        }
        return i2;
    }

    public static int A02(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        if ((mode == Integer.MIN_VALUE || mode == 1073741824) && size < i) {
            return size;
        }
        return i;
    }

    public static Object A07(AnonymousClass0IV r0, C05050Qf r1) {
        return r1.A0D().BHD(r0.A02);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v101, resolved type: X.C59[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v24, resolved type: X.C59} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v25, resolved type: X.C59} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v141, resolved type: X.C59} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v26, resolved type: X.C59} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v28, resolved type: X.C59} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v19, resolved type: X.C59} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v328, resolved type: X.C59} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v333, resolved type: X.C59} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v72, resolved type: X.6Mr} */
    /* JADX WARNING: type inference failed for: r2v363, types: [java.lang.Object, X.C59] */
    /* JADX WARNING: type inference failed for: r1v154, types: [X.0tO, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r1v155, types: [X.0tO, java.lang.Object] */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:1003:0x1791, code lost:
        if (r16 != false) goto L_0x1793;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1378:0x1ec0, code lost:
        r3 = X.C108945cZ.A1W();
        r3[0] = A01(r6, 0);
        r2 = A01(r7, 0);
        r3[1] = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1379:0x1ed9, code lost:
        return new X.AnonymousClass0YI(r4, r3, r3[0], r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1380:0x1eda, code lost:
        X.C18070vi.A0d(r4, 2);
        r1 = X.C108965cb.A08(r1.A02);
        X.C18070vi.A0X(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1381:0x1eeb, code lost:
        if (android.view.View.MeasureSpec.getMode(r7) != 0) goto L_0x1f08;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1382:0x1eed, code lost:
        r2 = X.C22339B3q.A01(52.0f * (((float) r1.densityDpi) / 160.0f));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1384:0x1f07, code lost:
        return A04(r4, A01(r6, 0), A01(r7, r2));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1385:0x1f08, code lost:
        r2 = 50;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1386:0x1f0b, code lost:
        r5 = r0.A09(36);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1387:0x1f11, code lost:
        if (r5 == null) goto L_0x1f66;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1388:0x1f13, code lost:
        r3 = android.view.View.MeasureSpec.makeMeasureSpec(android.view.View.MeasureSpec.getSize(r7), Integer.MIN_VALUE);
        r0 = r0.A09(40);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1389:0x1f23, code lost:
        if (r0 == null) goto L_0x1f64;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1390:0x1f25, code lost:
        r10 = r0.BDo(r1, r6, r3);
        X.C18070vi.A0X(r10);
        r3 = X.AnonymousClass0OS.A00(r1, r10, r0, (java.lang.Object) null, X.C02740Fe.A00(r6, r3));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1391:0x1f37, code lost:
        r2 = android.view.View.MeasureSpec.getSize(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1392:0x1f3b, code lost:
        if (r3 == null) goto L_0x1f62;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1393:0x1f3d, code lost:
        r13 = X.BE8.A0A(r3.A01);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1394:0x1f43, code lost:
        r7 = r5.BDo(r1, r6, android.view.View.MeasureSpec.makeMeasureSpec(r2 - r13, Integer.MIN_VALUE));
        X.C18070vi.A0X(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1395:0x1f61, code lost:
        return new X.DFK(r7, r4, r3, android.view.View.MeasureSpec.getSize(r6), r7.getHeight() + r13, 0, r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1396:0x1f62, code lost:
        r13 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1397:0x1f64, code lost:
        r3 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1399:0x1f6c, code lost:
        throw X.AnonymousClass000.A0n("bk.cds.bottomsheet.Wrapper has no content.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1444:0x2097, code lost:
        if (r12 != 0) goto L_0x200d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:188:0x0365, code lost:
        if (r11 == Integer.MIN_VALUE) goto L_0x0367;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:224:0x0456, code lost:
        if (r9.A02.isEmpty() != false) goto L_0x0458;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:229:0x0462, code lost:
        if (r5 != false) goto L_0x0464;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:262:0x0516, code lost:
        X.C18070vi.A0z(r2, r0);
        r2 = (android.view.View) r2;
        r2.measure(r6, r7);
        r1 = r2.getMeasuredWidth();
        r0 = r2.getMeasuredHeight();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:264:0x052a, code lost:
        return A04(r4, r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00ad, code lost:
        return new X.AnonymousClass0YI(r4, r2, r1, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:411:0x07b5, code lost:
        if (r28 != false) goto L_0x07b7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:412:0x07b7, code lost:
        r16 = X.AnonymousClass00R.A0C;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:413:0x07ba, code lost:
        if (r28 != false) goto L_0x07bc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:414:0x07bc, code lost:
        r16 = X.AnonymousClass00R.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:417:0x07c4, code lost:
        r3 = (java.lang.String) r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:420:0x07ca, code lost:
        if (X.BE6.A1V(r3) == false) goto L_0x07fa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:421:0x07cc, code lost:
        r8 = X.A90.A00(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:422:0x07d6, code lost:
        if (java.lang.Float.compare(r8, Float.NaN) == 0) goto L_0x07b2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:423:0x07d8, code lost:
        X.C25977Cpq.A00(r13, 3);
        r5 = r13.A01;
        r3 = r13.A00;
        r15 = r3 + 1;
        r13.A00 = r15;
        r5[r3] = 8.0f;
        r3 = r15 + 1;
        r13.A00 = r3;
        r5[r15] = (float) X.C26057CrT.A00(r16);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:424:0x07f3, code lost:
        r13.A00 = r3 + 1;
        r5[r3] = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:425:0x07fa, code lost:
        r8 = X.A90.A01(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:426:0x0804, code lost:
        if (java.lang.Float.compare(r8, Float.NaN) == 0) goto L_0x07b2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:427:0x0806, code lost:
        X.C25977Cpq.A00(r13, 3);
        r5 = r13.A01;
        r3 = r13.A00;
        r15 = r3 + 1;
        r13.A00 = r15;
        r5[r3] = 7.0f;
        r3 = r15 + 1;
        r13.A00 = r3;
        r5[r15] = (float) X.C26057CrT.A00(r16);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:428:0x0822, code lost:
        r8 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:429:0x0823, code lost:
        X.C25913CoX.A00((X.DOZ) null, "BloksFlexLayoutProvider", "Error parsing padding value", r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:553:0x0b02, code lost:
        if (X.BE6.A1V(r8) == false) goto L_0x0b31;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:554:0x0b04, code lost:
        r16 = X.A90.A00(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:555:0x0b0c, code lost:
        if (X.C26112Csa.A01(r16) != false) goto L_0x090e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:556:0x0b0e, code lost:
        X.C26112Csa.A00(r11, 3);
        r9 = r11.A01;
        r8 = r11.A00;
        r5 = r8 + 1;
        r11.A00 = r5;
        r9[r8] = 25.0f;
        r8 = r5 + 1;
        r11.A00 = r8;
        r9[r5] = (float) X.C26057CrT.A00(r17);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:557:0x0b29, code lost:
        r11.A00 = r8 + 1;
        r9[r8] = r16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:559:0x0b35, code lost:
        if (r8.equals("auto") == false) goto L_0x0b52;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:560:0x0b37, code lost:
        r15 = A09(r11);
        r9 = r11.A00;
        r8 = r9 + 1;
        r11.A00 = r8;
        r15[r9] = 26.0f;
        r11.A00 = r8 + 1;
        r15[r8] = (float) X.C26057CrT.A00(r17);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:561:0x0b52, code lost:
        r16 = X.A90.A01(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:562:0x0b5a, code lost:
        if (X.C26112Csa.A01(r16) != false) goto L_0x090e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:563:0x0b5c, code lost:
        X.C26112Csa.A00(r11, 3);
        r9 = r11.A01;
        r8 = r11.A00;
        r5 = r8 + 1;
        r11.A00 = r5;
        r9[r8] = 24.0f;
        r8 = r5 + 1;
        r11.A00 = r8;
        r9[r5] = (float) X.C26057CrT.A00(r17);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:564:0x0b78, code lost:
        r15 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:567:?, code lost:
        X.C25913CoX.A00((X.DOZ) null, "BloksFlexLayoutProvider", "Error parsing margin value", r15);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:667:0x0e4e, code lost:
        return new X.DFK(r5.BDo(r1, r6, r7), r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x014a, code lost:
        if (r2 != null) goto L_0x012d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x017e, code lost:
        throw new X.AnonymousClass9HX(X.AnonymousClass001.A1H("can't parse unknown textUniSize: ", r3, X.AnonymousClass000.A10()));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:861:0x1290, code lost:
        if (r8 != null) goto L_0x1292;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:1119:0x1995  */
    /* JADX WARNING: Removed duplicated region for block: B:1125:0x19a0  */
    /* JADX WARNING: Removed duplicated region for block: B:1200:0x1b09  */
    /* JADX WARNING: Removed duplicated region for block: B:1287:0x1c42 A[Catch:{ 9HX -> 0x1c75 }] */
    /* JADX WARNING: Removed duplicated region for block: B:1290:0x1c49 A[Catch:{ 9HX -> 0x1c75 }] */
    /* JADX WARNING: Removed duplicated region for block: B:1440:0x2047  */
    /* JADX WARNING: Removed duplicated region for block: B:1479:0x05b9 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:357:0x06aa  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C16930tS A0B(X.AnonymousClass0IV r53, X.DFL r54, X.C05050Qf r55, int r56, int r57) {
        /*
            r52 = this;
            r0 = r54
            r4 = r55
            int r3 = r0.A05
            r2 = r52
            r1 = r53
            r6 = r56
            r7 = r57
            switch(r3) {
                case 13323: goto L_0x1ea1;
                case 13745: goto L_0x1e90;
                case 13889: goto L_0x210e;
                case 13948: goto L_0x20d9;
                case 14005: goto L_0x1eb8;
                case 14093: goto L_0x1f0b;
                case 15763: goto L_0x20a2;
                case 15768: goto L_0x1fb2;
                case 15972: goto L_0x1eb8;
                case 15981: goto L_0x1e80;
                case 16094: goto L_0x1ec0;
                case 16451: goto L_0x1e6e;
                case 16534: goto L_0x1e60;
                case 16586: goto L_0x1f6d;
                case 16682: goto L_0x1eda;
                case 16718: goto L_0x1f8e;
                case 16910: goto L_0x1e31;
                default: goto L_0x0011;
            }
        L_0x0011:
            switch(r3) {
                case 13496: goto L_0x1dab;
                case 13497: goto L_0x1ec0;
                case 13498: goto L_0x1dcc;
                case 13499: goto L_0x1d89;
                default: goto L_0x0014;
            }
        L_0x0014:
            switch(r3) {
                case 13501: goto L_0x1d58;
                case 13502: goto L_0x1caf;
                case 13503: goto L_0x1d23;
                case 13504: goto L_0x1cf7;
                default: goto L_0x0017;
            }
        L_0x0017:
            boolean r2 = A08(r3)
            if (r2 == 0) goto L_0x1c7c
            switch(r3) {
                case 13317: goto L_0x1021;
                case 13320: goto L_0x052b;
                case 13323: goto L_0x0fb8;
                case 13326: goto L_0x050c;
                case 13327: goto L_0x0f5f;
                case 13329: goto L_0x02bd;
                case 13334: goto L_0x04ed;
                case 13335: goto L_0x00d3;
                case 13336: goto L_0x0d9e;
                case 13666: goto L_0x00c7;
                case 13708: goto L_0x0da6;
                case 13797: goto L_0x0e74;
                case 14093: goto L_0x1f0b;
                case 15728: goto L_0x009d;
                case 15778: goto L_0x0082;
                case 15981: goto L_0x0075;
                case 16160: goto L_0x0052;
                case 16260: goto L_0x0d99;
                case 16444: goto L_0x0e5b;
                case 16675: goto L_0x0e08;
                case 16682: goto L_0x1eda;
                case 17184: goto L_0x0025;
                default: goto L_0x0020;
            }
        L_0x0020:
            java.lang.IllegalArgumentException r0 = X.BEB.A0S(r3)
            throw r0
        L_0x0025:
            r2 = 2
            X.C18070vi.A0d(r4, r2)
            X.DFL r10 = X.BE7.A0O(r0)
            if (r10 != 0) goto L_0x0032
            r2 = 0
            r1 = 0
            goto L_0x00a8
        L_0x0032:
            X.0OS r8 = X.C04220Mi.A04
            long r12 = X.C02740Fe.A00(r6, r7)
            r11 = 0
            r9 = r1
            X.0Mi r3 = r8.A04(r9, r10, r11, r12)
            X.0Mk r0 = r3.A01
            com.facebook.rendercore.RenderTreeNode r0 = r0.A03
            android.graphics.Rect r0 = r0.A03
            int r2 = r0.width()
            int r1 = r0.height()
            X.0YI r0 = new X.0YI
            r0.<init>(r4, r3, r2, r1)
            return r0
        L_0x0052:
            int r0 = android.view.View.MeasureSpec.getMode(r7)
            if (r0 != 0) goto L_0x0073
            java.lang.Object r0 = A07(r1, r4)
            android.view.View r0 = (android.view.View) r0
            r0.measure(r6, r7)
            int r2 = r0.getMeasuredHeight()
        L_0x0065:
            r0 = 0
            int r1 = A01(r6, r0)
            int r0 = A01(r7, r2)
            X.0YI r0 = A04(r4, r1, r0)
            return r0
        L_0x0073:
            r2 = 0
            goto L_0x0065
        L_0x0075:
            r0 = 2147483647(0x7fffffff, float:NaN)
            int r1 = A02(r0, r6)
            int r0 = A02(r0, r7)
            goto L_0x0526
        L_0x0082:
            int r0 = android.view.View.MeasureSpec.getMode(r6)
            if (r0 != 0) goto L_0x0092
            r1 = 0
        L_0x0089:
            int r0 = android.view.View.MeasureSpec.getMode(r7)
            if (r0 != 0) goto L_0x0097
            r0 = 0
            goto L_0x0526
        L_0x0092:
            int r1 = android.view.View.MeasureSpec.getSize(r6)
            goto L_0x0089
        L_0x0097:
            int r0 = android.view.View.MeasureSpec.getSize(r7)
            goto L_0x0526
        L_0x009d:
            X.DFL r1 = X.BE7.A0O(r0)
            r0 = 36
            if (r1 != 0) goto L_0x00ae
            r2 = 0
            r1 = 24
        L_0x00a8:
            X.0YI r0 = new X.0YI
            r0.<init>(r4, r2, r1, r1)
            return r0
        L_0x00ae:
            java.lang.String r0 = r1.A0D(r0)     // Catch:{ 9HX -> 0x00ba }
            if (r0 != 0) goto L_0x00b5
            goto L_0x00bd
        L_0x00b5:
            float r0 = X.A90.A01(r0)     // Catch:{ 9HX -> 0x00ba }
            goto L_0x00bf
        L_0x00ba:
            r2 = 24
            goto L_0x00c0
        L_0x00bd:
            r0 = 1103101952(0x41c00000, float:24.0)
        L_0x00bf:
            int r2 = (int) r0
        L_0x00c0:
            r1 = 0
            X.0YI r0 = new X.0YI
            r0.<init>(r4, r1, r2, r2)
            return r0
        L_0x00c7:
            r0 = 2
            X.C18070vi.A0d(r4, r0)
            java.lang.Object r2 = A07(r1, r4)
            java.lang.String r0 = "null cannot be cast to non-null type com.bloks.stdlib.components.bkcomponentsspinner.SpinnerImageView"
            goto L_0x0516
        L_0x00d3:
            android.content.Context r2 = r1.A02
            r17 = r2
            java.lang.Object r14 = r1.A03
            X.DOZ r14 = (X.DOZ) r14
            X.DS3 r13 = X.C26094CsE.A00(r17)
            r2 = 1
            r13.A0c = r2
            r2 = 0
            r13.A09 = r2
            java.lang.String r2 = X.BE7.A0i(r0)
            if (r2 == 0) goto L_0x00fd
            int r2 = X.A90.A06(r2)     // Catch:{ 9HX -> 0x00f0 }
            goto L_0x00f6
        L_0x00f0:
            r0 = move-exception
            java.lang.RuntimeException r0 = X.AnonymousClass8BR.A0x(r0)
            throw r0
        L_0x00f6:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            X.DS3.A00(r13, r2)
        L_0x00fd:
            r2 = 38
            r5 = -1
            int r3 = r0.A04(r2, r5)
            if (r3 <= r5) goto L_0x010c
            r13.A0H = r3
            android.text.TextUtils$TruncateAt r2 = android.text.TextUtils.TruncateAt.END
            r13.A0S = r2
        L_0x010c:
            if (r3 != r5) goto L_0x0117
            if (r14 == 0) goto L_0x0117
            X.CXY r2 = r14.A02
            X.E86 r2 = r2.A01
            r2.BNU()
        L_0x0117:
            r2 = 51
            java.util.List r3 = r0.A0G(r2)
            boolean r2 = r3.isEmpty()
            if (r2 != 0) goto L_0x0144
            r2 = 1
            X.C18070vi.A0d(r14, r2)
            X.CP1 r2 = X.C26276CwV.A03(r14, r0, r3)
            java.lang.CharSequence r2 = r2.A00
        L_0x012d:
            r13.A0V = r2
        L_0x012f:
            r2 = 45
            java.lang.String r9 = r0.A0D(r2)
            java.lang.String r12 = ""
            r16 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r9 == 0) goto L_0x01a8
            r2 = 53
            java.lang.String r3 = r0.A0D(r2)
            if (r3 == 0) goto L_0x019c
            goto L_0x014d
        L_0x0144:
            r2 = 49
            java.lang.String r2 = r0.A0D(r2)
            if (r2 == 0) goto L_0x012f
            goto L_0x012d
        L_0x014d:
            java.lang.String r2 = "[^0-9.]"
            java.lang.String r8 = r9.replaceAll(r2, r12)     // Catch:{ 9HX -> 0x01a2 }
            int r5 = r8.length()     // Catch:{ 9HX -> 0x01a2 }
            int r2 = r9.length()     // Catch:{ 9HX -> 0x01a2 }
            if (r5 == r2) goto L_0x0164
            java.lang.String r5 = "text_size_ignored"
            java.lang.String r2 = "Only specify a size value for text_size if also specifying the text_size_unit property."
            X.C25913CoX.A01(r5, r2)     // Catch:{ 9HX -> 0x01a2 }
        L_0x0164:
            float r11 = java.lang.Float.parseFloat(r8)     // Catch:{ 9HX -> 0x01a2 }
            int r2 = r3.hashCode()     // Catch:{ 9HX -> 0x01a2 }
            switch(r2) {
                case 3212: goto L_0x017f;
                case 3592: goto L_0x0188;
                case 3677: goto L_0x0191;
                default: goto L_0x016f;
            }     // Catch:{ 9HX -> 0x01a2 }
        L_0x016f:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ 9HX -> 0x01a2 }
            java.lang.String r0 = "can't parse unknown textUniSize: "
            java.lang.String r1 = X.AnonymousClass001.A1H(r0, r3, r1)     // Catch:{ 9HX -> 0x01a2 }
            X.9HX r0 = new X.9HX     // Catch:{ 9HX -> 0x01a2 }
            r0.<init>(r1)     // Catch:{ 9HX -> 0x01a2 }
            throw r0     // Catch:{ 9HX -> 0x01a2 }
        L_0x017f:
            java.lang.String r2 = "dp"
            boolean r2 = r3.equals(r2)     // Catch:{ 9HX -> 0x01a2 }
            if (r2 == 0) goto L_0x016f
            goto L_0x019a
        L_0x0188:
            java.lang.String r2 = "px"
            boolean r2 = r3.equals(r2)     // Catch:{ 9HX -> 0x01a2 }
            if (r2 == 0) goto L_0x016f
            goto L_0x01ac
        L_0x0191:
            java.lang.String r2 = "sp"
            boolean r2 = r3.equals(r2)     // Catch:{ 9HX -> 0x01a2 }
            if (r2 != 0) goto L_0x01a0
            goto L_0x016f
        L_0x019a:
            r10 = 1
            goto L_0x01ad
        L_0x019c:
            float r11 = X.A90.A02(r9)     // Catch:{ 9HX -> 0x01a2 }
        L_0x01a0:
            r10 = 2
            goto L_0x01ad
        L_0x01a2:
            r0 = move-exception
            java.lang.RuntimeException r0 = X.AnonymousClass8BR.A0x(r0)
            throw r0
        L_0x01a8:
            r11 = -1082130432(0xffffffffbf800000, float:-1.0)
            r10 = -1
            goto L_0x01b8
        L_0x01ac:
            r10 = 0
        L_0x01ad:
            android.util.DisplayMetrics r2 = X.C108965cb.A08(r17)
            float r2 = android.util.TypedValue.applyDimension(r10, r11, r2)
            int r2 = (int) r2
            r13.A0O = r2
        L_0x01b8:
            r2 = 46
            java.lang.String r3 = r0.A0D(r2)
            java.lang.String r15 = X.BE7.A0d(r0)
            r9 = 0
            r8 = 0
            if (r14 == 0) goto L_0x01f4
            if (r15 == 0) goto L_0x01d4
            X.CqB r2 = X.C25995CqB.A00()
            X.C5r r5 = r2.A02
            android.content.Context r2 = r14.A00
            android.graphics.Typeface r8 = r5.A00(r2, r15)
        L_0x01d4:
            if (r3 == 0) goto L_0x01ee
            boolean r2 = r3.isEmpty()
            if (r2 != 0) goto L_0x01ee
            r2 = r17
            android.graphics.Typeface r8 = X.AnonymousClass9OS.A00(r2, r8, r3, r15)     // Catch:{ 9HX -> 0x01e3 }
            goto L_0x01ee
        L_0x01e3:
            r5 = move-exception
            java.lang.String r3 = "BKBloksComponentsTextBinderUtil"
            java.lang.String r2 = "Error parsing typeface for Text"
            r5 = r5
            r3 = r3
            r2 = r2
            X.C25913CoX.A00(r14, r3, r2, r5)
        L_0x01ee:
            if (r15 == 0) goto L_0x01f4
            if (r8 == 0) goto L_0x01f4
            r13.A0R = r8
        L_0x01f4:
            r2 = 59
            java.lang.String r2 = r0.A0D(r2)     // Catch:{ 9HX -> 0x020c }
            if (r2 != 0) goto L_0x01fd
            goto L_0x0202
        L_0x01fd:
            float r3 = X.A90.A01(r2)     // Catch:{ 9HX -> 0x020c }
            goto L_0x0204
        L_0x0202:
            r3 = -1082130432(0xffffffffbf800000, float:-1.0)
        L_0x0204:
            r2 = 0
            int r2 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r2 < 0) goto L_0x0214
            r13.A02 = r3     // Catch:{ 9HX -> 0x020c }
            goto L_0x0214
        L_0x020c:
            r5 = move-exception
            java.lang.String r3 = "BKBloksComponentsTextBinderUtil"
            java.lang.String r2 = "Error parsing lineHeight for Text"
            X.C25913CoX.A00(r14, r3, r2, r5)
        L_0x0214:
            r3 = 36
            r2 = r16
            float r5 = r0.A03(r3, r2)
            r3 = 1
            r2 = 0
            int r2 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r2 <= 0) goto L_0x0226
            r13.A0b = r3
            r13.A03 = r5
        L_0x0226:
            r2 = 44
            X.DFL r2 = r0.A09(r2)
            if (r2 == 0) goto L_0x02ae
            java.lang.String r12 = X.CBz.A00(r2)
        L_0x0232:
            android.util.DisplayMetrics r3 = X.C108965cb.A08(r17)
            r2 = 48
            X.DFL r2 = r0.A09(r2)
            if (r2 == 0) goto L_0x029b
            int r2 = X.C25340Cdz.A01(r14, r2, r9)
            java.lang.Integer r14 = java.lang.Integer.valueOf(r2)
        L_0x0246:
            r2 = 50
            boolean r15 = r0.A0I(r2, r9)
            android.text.SpannableStringBuilder r5 = new android.text.SpannableStringBuilder
            r5.<init>()
            int r2 = r5.length()
            r5.append(r12)
            int r12 = r5.length()
            if (r14 == 0) goto L_0x026a
            int r14 = r14.intValue()
            android.text.style.ForegroundColorSpan r0 = new android.text.style.ForegroundColorSpan
            r0.<init>(r14)
            r5.setSpan(r0, r2, r12, r9)
        L_0x026a:
            int r0 = (r11 > r16 ? 1 : (r11 == r16 ? 0 : -1))
            if (r0 <= 0) goto L_0x027b
            float r0 = android.util.TypedValue.applyDimension(r10, r11, r3)
            int r3 = (int) r0
            android.text.style.AbsoluteSizeSpan r0 = new android.text.style.AbsoluteSizeSpan
            r0.<init>(r3)
            r5.setSpan(r0, r2, r12, r9)
        L_0x027b:
            if (r8 == 0) goto L_0x0284
            android.text.style.MetricAffectingSpan r0 = X.C26276CwV.A00(r8)
            r5.setSpan(r0, r2, r12, r9)
        L_0x0284:
            if (r15 == 0) goto L_0x028e
            android.text.style.StrikethroughSpan r0 = new android.text.style.StrikethroughSpan
            r0.<init>()
            r5.setSpan(r0, r2, r12, r9)
        L_0x028e:
            X.BV4 r4 = (X.BV4) r4
            r0 = r1
            r1 = r4
            r2 = r13
            r3 = r5
            r4 = r6
            r5 = r7
            X.0YI r0 = X.C26086Cs4.A02(r0, r1, r2, r3, r4, r5)
            return r0
        L_0x029b:
            r2 = 43
            java.lang.String r2 = r0.A0D(r2)
            if (r2 != 0) goto L_0x02a5
            r14 = 0
            goto L_0x0246
        L_0x02a5:
            int r2 = X.A90.A04(r2)     // Catch:{ 9HX -> 0x02b7 }
            java.lang.Integer r14 = java.lang.Integer.valueOf(r2)     // Catch:{ 9HX -> 0x02b7 }
            goto L_0x0246
        L_0x02ae:
            java.lang.String r2 = X.BE7.A0h(r0)
            if (r2 == 0) goto L_0x0232
            r12 = r2
            goto L_0x0232
        L_0x02b7:
            r0 = move-exception
            java.lang.RuntimeException r0 = X.AnonymousClass8BR.A0x(r0)
            throw r0
        L_0x02bd:
            android.content.Context r2 = r1.A02
            java.lang.Object r13 = r1.A03
            X.DOZ r13 = (X.DOZ) r13
            X.DS3 r10 = X.C26094CsE.A00(r2)
            r2 = 1
            r10.A0c = r2
            r8 = 0
            r10.A09 = r8
            java.lang.String r2 = X.BE7.A0i(r0)
            if (r2 == 0) goto L_0x02e5
            int r2 = X.A90.A06(r2)     // Catch:{ 9HX -> 0x02d8 }
            goto L_0x02de
        L_0x02d8:
            r0 = move-exception
            java.lang.RuntimeException r0 = X.AnonymousClass8BR.A0x(r0)
            throw r0
        L_0x02de:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            X.DS3.A00(r10, r2)
        L_0x02e5:
            r2 = 40
            r5 = -1
            int r3 = r0.A04(r2, r5)
            if (r3 <= r5) goto L_0x02f4
            r10.A0H = r3
            android.text.TextUtils$TruncateAt r2 = android.text.TextUtils.TruncateAt.END
            r10.A0S = r2
        L_0x02f4:
            if (r3 != r5) goto L_0x02ff
            if (r13 == 0) goto L_0x02ff
            X.CXY r2 = r13.A02
            X.E86 r2 = r2.A01
            r2.BNU()
        L_0x02ff:
            r2 = 68
            r3 = 0
            boolean r12 = r0.A0I(r2, r8)
            r2 = 44
            if (r12 == 0) goto L_0x030c
            r2 = 70
        L_0x030c:
            java.util.List r5 = r0.A0G(r2)
            boolean r2 = r5.isEmpty()
            r15 = 0
            if (r2 != 0) goto L_0x038b
            X.CP1 r9 = X.C26276CwV.A04(r13, r0, r5, r12)
            java.lang.CharSequence r2 = r9.A00
            r10.A0V = r2
        L_0x031f:
            r2 = 54
            java.lang.String r11 = r0.A0D(r2)
            X.C199610h.A04(r13)
            android.content.Context r8 = r13.A00
            boolean r5 = X.C24567C9o.A00(r8)
            if (r11 == 0) goto L_0x033c
            java.lang.String r2 = "text_first_strong"
            boolean r2 = r11.equals(r2)
            if (r2 != 0) goto L_0x0383
            X.1X5 r2 = X.AnonymousClass1X4.A03
        L_0x033a:
            r10.A0T = r2
        L_0x033c:
            r2 = 53
            X.DFL r2 = r0.A09(r2)
            if (r2 == 0) goto L_0x0381
            int r2 = X.C25340Cdz.A01(r13, r2, r3)
        L_0x0348:
            r10.A09 = r2
            r2 = 52
            int r2 = r0.A04(r2, r3)
            r10.A0A = r2
            r2 = 46
            r14 = -2147483648(0xffffffff80000000, float:-0.0)
            int r5 = r0.A04(r2, r14)
            r2 = 48
            int r11 = r0.A04(r2, r14)
            if (r5 == r14) goto L_0x0367
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r14 = 1
            if (r11 != r2) goto L_0x0368
        L_0x0367:
            r14 = 0
        L_0x0368:
            if (r14 == 0) goto L_0x037c
            float r8 = X.C72463Mc.A00(r8)
            float r2 = (float) r5
            int r5 = X.BE6.A04(r2, r8)
            float r2 = (float) r11
            int r2 = X.BE6.A04(r2, r8)
            r10.A0E = r5
            r10.A0F = r2
        L_0x037c:
            r2 = 67
            r11 = -1082130432(0xffffffffbf800000, float:-1.0)
            goto L_0x038d
        L_0x0381:
            r2 = 0
            goto L_0x0348
        L_0x0383:
            if (r5 == 0) goto L_0x0388
            X.1X5 r2 = X.AnonymousClass1X4.A02
            goto L_0x033a
        L_0x0388:
            X.1X5 r2 = X.AnonymousClass1X4.A01
            goto L_0x033a
        L_0x038b:
            r9 = r15
            goto L_0x031f
        L_0x038d:
            java.lang.String r2 = r0.A0D(r2)     // Catch:{ 9HX -> 0x03a3 }
            if (r2 != 0) goto L_0x0394
            goto L_0x0399
        L_0x0394:
            float r5 = X.A90.A01(r2)     // Catch:{ 9HX -> 0x03a3 }
            goto L_0x039b
        L_0x0399:
            r5 = -1082130432(0xffffffffbf800000, float:-1.0)
        L_0x039b:
            r2 = 0
            int r2 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r2 < 0) goto L_0x03ab
            r10.A02 = r5     // Catch:{ 9HX -> 0x03a3 }
            goto L_0x03ab
        L_0x03a3:
            r8 = move-exception
            java.lang.String r5 = "BKBloksComponentsRichTextBinderUtil"
            java.lang.String r2 = "Error parsing lineHeight for RichText"
            X.C25913CoX.A00(r13, r5, r2, r8)
        L_0x03ab:
            r2 = 38
            float r8 = r0.A03(r2, r11)
            r5 = r14 ^ 1
            r2 = 0
            int r2 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r2 <= 0) goto L_0x03bc
            r10.A0b = r5
            r10.A03 = r8
        L_0x03bc:
            r2 = 32
            if (r12 == 0) goto L_0x03c2
            r2 = 69
        L_0x03c2:
            java.util.List r2 = r0.A0G(r2)
            X.CP1 r11 = X.C26276CwV.A04(r13, r0, r2, r12)
            java.lang.String r2 = r11.A01
            r10.A0Y = r2
            java.lang.CharSequence r2 = r11.A00
            r23 = r2
            android.text.SpannableString r20 = android.text.SpannableString.valueOf(r23)
            r2 = 50
            boolean r2 = r0.A0I(r2, r3)
            if (r2 == 0) goto L_0x03e1
            X.C25995CqB.A00()
        L_0x03e1:
            r2 = 140(0x8c, float:1.96E-43)
            X.DFL r8 = r0.A09(r2)
            if (r8 == 0) goto L_0x043d
            r2 = 65
            java.lang.String r3 = r0.A0D(r2)
            java.lang.String r2 = "background start padding"
            float r5 = A00(r13, r3, r2)
            r2 = 63
            java.lang.String r3 = r0.A0D(r2)
            java.lang.String r2 = "background end padding"
            float r19 = A00(r13, r3, r2)
            r2 = 66
            java.lang.String r3 = r0.A0D(r2)
            java.lang.String r2 = "background top padding"
            float r18 = A00(r13, r3, r2)
            r2 = 62
            java.lang.String r3 = r0.A0D(r2)
            java.lang.String r2 = "background bottom padding"
            float r17 = A00(r13, r3, r2)
            r2 = 58
            java.lang.String r2 = r0.A0D(r2)
            java.lang.String r0 = "background corner radius"
            float r16 = A00(r13, r2, r0)
            android.graphics.RectF r14 = new android.graphics.RectF
            r3 = r19
            r2 = r18
            r0 = r17
            r14.<init>(r5, r2, r3, r0)
            int r3 = X.C25340Cdz.A00(r13, r8)
            X.CPg r2 = new X.CPg
            r0 = r16
            r2.<init>(r14, r0, r3)
            r10.A0U = r2
        L_0x043d:
            X.BV4 r4 = (X.BV4) r4
            r17 = r1
            r18 = r4
            r19 = r10
            r21 = r6
            r22 = r7
            X.0YI r0 = X.C26086Cs4.A02(r17, r18, r19, r20, r21, r22)
            if (r9 == 0) goto L_0x0458
            java.util.List r2 = r9.A02
            boolean r2 = r2.isEmpty()
            r5 = 1
            if (r2 == 0) goto L_0x0459
        L_0x0458:
            r5 = 0
        L_0x0459:
            java.util.List r3 = r11.A02
            boolean r2 = r3.isEmpty()
            if (r2 == 0) goto L_0x0464
            r2 = 0
            if (r5 == 0) goto L_0x0465
        L_0x0464:
            r2 = 1
        L_0x0465:
            if (r12 == 0) goto L_0x0504
            if (r2 == 0) goto L_0x0504
            android.text.SpannableString r18 = android.text.SpannableString.valueOf(r23)
            if (r9 != 0) goto L_0x04ae
            r13 = r15
        L_0x0470:
            if (r9 == 0) goto L_0x0474
            java.util.List r15 = r9.A02
        L_0x0474:
            java.util.Iterator r5 = r3.iterator()
        L_0x0478:
            boolean r2 = r5.hasNext()
            if (r2 == 0) goto L_0x04b5
            java.lang.Object r3 = r5.next()
            X.CQz r3 = (X.C24949CQz) r3
            java.lang.Object r2 = r0.A00
            X.CTX r2 = (X.CTX) r2
            if (r2 == 0) goto L_0x04b5
            android.text.Layout r2 = r2.A02
            if (r2 == 0) goto L_0x04b5
            X.CXP r0 = r3.A02
            r16 = r0
            r17 = r2
            r19 = r3
            r20 = r6
            r21 = r7
            r16.A00(r17, r18, r19, r20, r21)
            r19 = r1
            r20 = r4
            r21 = r10
            r22 = r18
            r23 = r6
            r24 = r7
            X.0YI r0 = X.C26086Cs4.A02(r19, r20, r21, r22, r23, r24)
            goto L_0x0478
        L_0x04ae:
            java.lang.CharSequence r2 = r9.A00
            android.text.SpannableString r13 = android.text.SpannableString.valueOf(r2)
            goto L_0x0470
        L_0x04b5:
            if (r13 == 0) goto L_0x0504
            if (r15 == 0) goto L_0x0504
            java.util.Iterator r5 = r15.iterator()
        L_0x04bd:
            boolean r2 = r5.hasNext()
            if (r2 == 0) goto L_0x0504
            java.lang.Object r3 = r5.next()
            X.CQz r3 = (X.C24949CQz) r3
            java.lang.Object r2 = r0.A00
            X.CTX r2 = (X.CTX) r2
            if (r2 == 0) goto L_0x0504
            android.text.Layout r2 = r2.A02
            if (r2 == 0) goto L_0x0504
            X.CXP r0 = r3.A02
            r11 = r0
            r12 = r2
            r14 = r3
            r15 = r6
            r16 = r7
            r11.A00(r12, r13, r14, r15, r16)
            r14 = r1
            r15 = r4
            r16 = r10
            r17 = r13
            r18 = r6
            r19 = r7
            X.0YI r0 = X.C26086Cs4.A02(r14, r15, r16, r17, r18, r19)
            goto L_0x04bd
        L_0x04ed:
            if (r55 == 0) goto L_0x0505
            java.lang.Object r0 = A07(r1, r4)
            X.E9c r0 = (X.C28588E9c) r0
            r0.measure(r6, r7)
            int r1 = r0.getMeasuredWidth()
            int r0 = r0.getMeasuredHeight()
            X.0YI r0 = A04(r4, r1, r0)
        L_0x0504:
            return r0
        L_0x0505:
            java.lang.String r0 = "A render unit was defined for this component but none was found"
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0n(r0)
            throw r0
        L_0x050c:
            r0 = 2
            X.C18070vi.A0d(r4, r0)
            java.lang.Object r2 = A07(r1, r4)
            java.lang.String r0 = "null cannot be cast to non-null type android.widget.ProgressBar"
        L_0x0516:
            X.C18070vi.A0z(r2, r0)
            android.view.View r2 = (android.view.View) r2
            r2.measure(r6, r7)
            int r1 = r2.getMeasuredWidth()
            int r0 = r2.getMeasuredHeight()
        L_0x0526:
            X.0YI r0 = A04(r4, r1, r0)
            return r0
        L_0x052b:
            X.DFG r27 = X.CEJ.A00
            r5 = 0
            r2 = 49
            java.lang.String r3 = r0.A0D(r2)
            if (r3 == 0) goto L_0x053f
            java.lang.String r2 = "gone"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x053f
            r5 = 1
        L_0x053f:
            if (r5 == 0) goto L_0x0547
            X.0tS r0 = X.AnonymousClass0PH.A00
        L_0x0543:
            X.C18070vi.A0X(r0)
            return r0
        L_0x0547:
            android.content.Context r2 = r1.A02
            boolean r2 = X.C24567C9o.A00(r2)
            r28 = r2 ^ 1
            X.DFL r14 = X.DFG.A02(r0)
            X.Cpq r13 = new X.Cpq
            r13.<init>()
            android.util.SparseArray r11 = r0.A06
            int r16 = r11.size()
            X.CVv r2 = r0.A07
            java.lang.Object r10 = r2.A00()
            android.util.SparseArray r10 = (android.util.SparseArray) r10
            int r9 = r10.size()
            int r9 = r9 + r16
            r8 = 0
        L_0x056d:
            if (r8 >= r9) goto L_0x076c
            int r2 = r16 + -1
            if (r8 > r2) goto L_0x0764
            int r12 = r11.keyAt(r8)
        L_0x0577:
            java.lang.Object r5 = X.DFL.A00(r0, r12)
            if (r5 == 0) goto L_0x05b9
            r2 = 35
            if (r12 == r2) goto L_0x06f9
            r3 = 36
            if (r12 == r3) goto L_0x069b
            r2 = 41
            if (r12 == r2) goto L_0x0653
            r2 = 42
            if (r12 == r2) goto L_0x05f3
            r2 = 44
            if (r12 != r2) goto L_0x05b9
            java.lang.String r5 = (java.lang.String) r5
            int r2 = r5.hashCode()
            switch(r2) {
                case -1364013995: goto L_0x05e8;
                case -932331738: goto L_0x05dd;
                case -814425728: goto L_0x05d2;
                case 1682480591: goto L_0x05c7;
                case 1744442261: goto L_0x05bc;
                default: goto L_0x059a;
            }
        L_0x059a:
            X.Bzd r12 = X.C24342Bzd.FLEX_START
        L_0x059c:
            X.Bzd r2 = X.C25977Cpq.A05
            if (r12 == r2) goto L_0x05b9
            r2 = 2
            X.C25977Cpq.A00(r13, r2)
            float[] r5 = r13.A01
            int r2 = r13.A00
            int r3 = r2 + 1
            r13.A00 = r3
            r15 = 1073741824(0x40000000, float:2.0)
            r5[r2] = r15
            int r2 = r3 + 1
            r13.A00 = r2
            int r2 = r12.mIntValue
        L_0x05b6:
            float r2 = (float) r2
            r5[r3] = r2
        L_0x05b9:
            int r8 = r8 + 1
            goto L_0x056d
        L_0x05bc:
            java.lang.String r2 = "flex_end"
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto L_0x059a
            X.Bzd r12 = X.C24342Bzd.FLEX_END
            goto L_0x059c
        L_0x05c7:
            java.lang.String r2 = "space_between"
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto L_0x059a
            X.Bzd r12 = X.C24342Bzd.SPACE_BETWEEN
            goto L_0x059c
        L_0x05d2:
            java.lang.String r2 = "space_evenly"
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto L_0x059a
            X.Bzd r12 = X.C24342Bzd.SPACE_EVENLY
            goto L_0x059c
        L_0x05dd:
            java.lang.String r2 = "space_around"
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto L_0x059a
            X.Bzd r12 = X.C24342Bzd.SPACE_AROUND
            goto L_0x059c
        L_0x05e8:
            java.lang.String r2 = "center"
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto L_0x059a
            X.Bzd r12 = X.C24342Bzd.CENTER
            goto L_0x059c
        L_0x05f3:
            java.lang.String r5 = (java.lang.String) r5
            java.lang.String r3 = r0.A0D(r3)
            if (r3 == 0) goto L_0x0651
            java.lang.String r2 = "auto"
            boolean r2 = r3.equals(r2)
            if (r2 != 0) goto L_0x0613
            java.lang.String r2 = "space_between"
            boolean r2 = r3.equals(r2)
            if (r2 != 0) goto L_0x0613
            java.lang.String r2 = "space_around"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x0651
        L_0x0613:
            r3 = 1
        L_0x0614:
            int r2 = r5.hashCode()
            switch(r2) {
                case 3657802: goto L_0x0644;
                case 491642861: goto L_0x0639;
                default: goto L_0x061b;
            }
        L_0x061b:
            X.BzH r12 = X.C24320BzH.NO_WRAP
        L_0x061d:
            X.BzH r2 = X.C25977Cpq.A06
            if (r12 == r2) goto L_0x05b9
            r2 = 2
            X.C25977Cpq.A00(r13, r2)
            float[] r5 = r13.A01
            int r2 = r13.A00
            int r3 = r2 + 1
            r13.A00 = r3
            r15 = 1084227584(0x40a00000, float:5.0)
            r5[r2] = r15
            int r2 = r3 + 1
            r13.A00 = r2
            int r2 = r12.mIntValue
            goto L_0x05b6
        L_0x0639:
            java.lang.String r2 = "wrap_reverse"
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto L_0x061b
            X.BzH r12 = X.C24320BzH.WRAP_REVERSE
            goto L_0x061d
        L_0x0644:
            java.lang.String r2 = "wrap"
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto L_0x061b
            if (r3 != 0) goto L_0x061b
            X.BzH r12 = X.C24320BzH.WRAP
            goto L_0x061d
        L_0x0651:
            r3 = 0
            goto L_0x0614
        L_0x0653:
            java.lang.String r5 = (java.lang.String) r5
            int r2 = r5.hashCode()
            switch(r2) {
                case -1781065991: goto L_0x0690;
                case -1354837162: goto L_0x0685;
                case -207799939: goto L_0x067a;
                default: goto L_0x065c;
            }
        L_0x065c:
            X.BzQ r12 = X.C24329BzQ.ROW
        L_0x065e:
            X.BzQ r2 = X.C25977Cpq.A04
            if (r12 == r2) goto L_0x05b9
            r2 = 2
            X.C25977Cpq.A00(r13, r2)
            float[] r5 = r13.A01
            int r2 = r13.A00
            int r3 = r2 + 1
            r13.A00 = r3
            r15 = 1065353216(0x3f800000, float:1.0)
            r5[r2] = r15
            int r2 = r3 + 1
            r13.A00 = r2
            int r2 = r12.mIntValue
            goto L_0x05b6
        L_0x067a:
            java.lang.String r2 = "row_reverse"
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto L_0x065c
            X.BzQ r12 = X.C24329BzQ.ROW_REVERSE
            goto L_0x065e
        L_0x0685:
            java.lang.String r2 = "column"
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto L_0x065c
            X.BzQ r12 = X.C24329BzQ.COLUMN
            goto L_0x065e
        L_0x0690:
            java.lang.String r2 = "column_reverse"
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto L_0x065c
            X.BzQ r12 = X.C24329BzQ.COLUMN_REVERSE
            goto L_0x065e
        L_0x069b:
            java.lang.String r5 = (java.lang.String) r5
            int r2 = r5.hashCode()
            switch(r2) {
                case -1720785339: goto L_0x06ee;
                case -1364013995: goto L_0x06e3;
                case -932331738: goto L_0x06d8;
                case 3005871: goto L_0x06d5;
                case 1384876188: goto L_0x06ca;
                case 1682480591: goto L_0x06c7;
                case 1744442261: goto L_0x06c4;
                default: goto L_0x06a4;
            }
        L_0x06a4:
            X.Byh r12 = X.C24284Byh.STRETCH
        L_0x06a6:
            X.Byh r2 = X.C25977Cpq.A03
            if (r12 == r2) goto L_0x05b9
            r2 = 2
            X.C25977Cpq.A00(r13, r2)
            float[] r5 = r13.A01
            int r2 = r13.A00
            int r3 = r2 + 1
            r13.A00 = r3
            r15 = 1082130432(0x40800000, float:4.0)
            r5[r2] = r15
            int r2 = r3 + 1
            r13.A00 = r2
            int r2 = r12.ordinal()
            goto L_0x05b6
        L_0x06c4:
            java.lang.String r2 = "flex_end"
            goto L_0x06da
        L_0x06c7:
            java.lang.String r2 = "space_between"
            goto L_0x06da
        L_0x06ca:
            java.lang.String r2 = "flex_start"
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto L_0x06a4
            X.Byh r12 = X.C24284Byh.FLEX_START
            goto L_0x06a6
        L_0x06d5:
            java.lang.String r2 = "auto"
            goto L_0x06da
        L_0x06d8:
            java.lang.String r2 = "space_around"
        L_0x06da:
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto L_0x06a4
            X.Byh r12 = X.C24284Byh.FLEX_END
            goto L_0x06a6
        L_0x06e3:
            java.lang.String r2 = "center"
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto L_0x06a4
            X.Byh r12 = X.C24284Byh.CENTER
            goto L_0x06a6
        L_0x06ee:
            java.lang.String r2 = "baseline"
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto L_0x06a4
            X.Byh r12 = X.C24284Byh.BASELINE
            goto L_0x06a6
        L_0x06f9:
            java.lang.String r5 = (java.lang.String) r5
            int r2 = r5.hashCode()
            switch(r2) {
                case -1881872635: goto L_0x0759;
                case -1720785339: goto L_0x074e;
                case -1364013995: goto L_0x0743;
                case -932331738: goto L_0x0738;
                case 1682480591: goto L_0x072d;
                case 1744442261: goto L_0x0722;
                default: goto L_0x0702;
            }
        L_0x0702:
            X.Byu r12 = X.C24297Byu.FLEX_START
        L_0x0704:
            X.Byu r2 = X.C25977Cpq.A02
            if (r12 == r2) goto L_0x05b9
            r2 = 2
            X.C25977Cpq.A00(r13, r2)
            float[] r5 = r13.A01
            int r2 = r13.A00
            int r3 = r2 + 1
            r13.A00 = r3
            r15 = 1077936128(0x40400000, float:3.0)
            r5[r2] = r15
            int r2 = r3 + 1
            r13.A00 = r2
            int r2 = r12.ordinal()
            goto L_0x05b6
        L_0x0722:
            java.lang.String r2 = "flex_end"
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto L_0x0702
            X.Byu r12 = X.C24297Byu.FLEX_END
            goto L_0x0704
        L_0x072d:
            java.lang.String r2 = "space_between"
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto L_0x0702
            X.Byu r12 = X.C24297Byu.SPACE_BETWEEN
            goto L_0x0704
        L_0x0738:
            java.lang.String r2 = "space_around"
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto L_0x0702
            X.Byu r12 = X.C24297Byu.SPACE_AROUND
            goto L_0x0704
        L_0x0743:
            java.lang.String r2 = "center"
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto L_0x0702
            X.Byu r12 = X.C24297Byu.CENTER
            goto L_0x0704
        L_0x074e:
            java.lang.String r2 = "baseline"
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto L_0x0702
            X.Byu r12 = X.C24297Byu.BASELINE
            goto L_0x0704
        L_0x0759:
            java.lang.String r2 = "stretch"
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto L_0x0702
            X.Byu r12 = X.C24297Byu.STRETCH
            goto L_0x0704
        L_0x0764:
            int r2 = r8 - r16
            int r12 = r10.keyAt(r2)
            goto L_0x0577
        L_0x076c:
            if (r28 != 0) goto L_0x0788
            X.BzG r9 = X.C24319BzG.RTL
            r2 = 2
            X.C25977Cpq.A00(r13, r2)
            float[] r8 = r13.A01
            int r5 = r13.A00
            int r3 = r5 + 1
            r13.A00 = r3
            r2 = 0
            r8[r5] = r2
            int r2 = r3 + 1
            r13.A00 = r2
            int r2 = r9.mIntValue
            float r2 = (float) r2
            r8[r3] = r2
        L_0x0788:
            if (r14 == 0) goto L_0x0834
            android.util.SparseArray r12 = r14.A06
            int r17 = r12.size()
            X.CVv r2 = r14.A07
            java.lang.Object r11 = r2.A00()
            android.util.SparseArray r11 = (android.util.SparseArray) r11
            int r10 = r11.size()
            int r10 = r10 + r17
            r9 = 0
        L_0x079f:
            if (r9 >= r10) goto L_0x0834
            int r2 = r17 + -1
            if (r9 > r2) goto L_0x082c
            int r2 = r12.keyAt(r9)
        L_0x07a9:
            java.lang.Object r3 = X.DFL.A00(r14, r2)
            if (r3 == 0) goto L_0x07b2
            switch(r2) {
                case 55: goto L_0x07bf;
                case 56: goto L_0x07b5;
                case 57: goto L_0x07bc;
                case 58: goto L_0x07b7;
                case 59: goto L_0x07ba;
                case 60: goto L_0x07b2;
                case 61: goto L_0x07c2;
                default: goto L_0x07b2;
            }
        L_0x07b2:
            int r9 = r9 + 1
            goto L_0x079f
        L_0x07b5:
            if (r28 == 0) goto L_0x07bc
        L_0x07b7:
            java.lang.Integer r16 = X.AnonymousClass00R.A0C
            goto L_0x07c4
        L_0x07ba:
            if (r28 == 0) goto L_0x07b7
        L_0x07bc:
            java.lang.Integer r16 = X.AnonymousClass00R.A00
            goto L_0x07c4
        L_0x07bf:
            java.lang.Integer r16 = X.AnonymousClass00R.A0N
            goto L_0x07c4
        L_0x07c2:
            java.lang.Integer r16 = X.AnonymousClass00R.A01
        L_0x07c4:
            java.lang.String r3 = (java.lang.String) r3
            boolean r2 = X.BE6.A1V(r3)     // Catch:{ 9HX -> 0x0822 }
            if (r2 == 0) goto L_0x07fa
            float r8 = X.A90.A00(r3)     // Catch:{ 9HX -> 0x0822 }
            r2 = 2143289344(0x7fc00000, float:NaN)
            int r2 = java.lang.Float.compare(r8, r2)     // Catch:{ 9HX -> 0x0822 }
            if (r2 == 0) goto L_0x07b2
            r2 = 3
            X.C25977Cpq.A00(r13, r2)     // Catch:{ 9HX -> 0x0822 }
            float[] r5 = r13.A01     // Catch:{ 9HX -> 0x0822 }
            int r3 = r13.A00     // Catch:{ 9HX -> 0x0822 }
            int r15 = r3 + 1
            r13.A00 = r15     // Catch:{ 9HX -> 0x0822 }
            r2 = 1090519040(0x41000000, float:8.0)
            r5[r3] = r2     // Catch:{ 9HX -> 0x0822 }
            int r3 = r15 + 1
            r13.A00 = r3     // Catch:{ 9HX -> 0x0822 }
            int r2 = X.C26057CrT.A00(r16)     // Catch:{ 9HX -> 0x0822 }
            float r2 = (float) r2     // Catch:{ 9HX -> 0x0822 }
            r5[r15] = r2     // Catch:{ 9HX -> 0x0822 }
        L_0x07f3:
            int r2 = r3 + 1
            r13.A00 = r2     // Catch:{ 9HX -> 0x0822 }
            r5[r3] = r8     // Catch:{ 9HX -> 0x0822 }
            goto L_0x07b2
        L_0x07fa:
            float r8 = X.A90.A01(r3)     // Catch:{ 9HX -> 0x0822 }
            r2 = 2143289344(0x7fc00000, float:NaN)
            int r2 = java.lang.Float.compare(r8, r2)     // Catch:{ 9HX -> 0x0822 }
            if (r2 == 0) goto L_0x07b2
            r2 = 3
            X.C25977Cpq.A00(r13, r2)     // Catch:{ 9HX -> 0x0822 }
            float[] r5 = r13.A01     // Catch:{ 9HX -> 0x0822 }
            int r3 = r13.A00     // Catch:{ 9HX -> 0x0822 }
            int r15 = r3 + 1
            r13.A00 = r15     // Catch:{ 9HX -> 0x0822 }
            r2 = 1088421888(0x40e00000, float:7.0)
            r5[r3] = r2     // Catch:{ 9HX -> 0x0822 }
            int r3 = r15 + 1
            r13.A00 = r3     // Catch:{ 9HX -> 0x0822 }
            int r2 = X.C26057CrT.A00(r16)     // Catch:{ 9HX -> 0x0822 }
            float r2 = (float) r2     // Catch:{ 9HX -> 0x0822 }
            r5[r15] = r2     // Catch:{ 9HX -> 0x0822 }
            goto L_0x07f3
        L_0x0822:
            r8 = move-exception
            java.lang.String r5 = "Error parsing padding value"
            java.lang.String r3 = "BloksFlexLayoutProvider"
            r2 = 0
            X.C25913CoX.A00(r2, r3, r5, r8)
            goto L_0x07b2
        L_0x082c:
            int r2 = r9 - r17
            int r2 = r11.keyAt(r2)
            goto L_0x07a9
        L_0x0834:
            float[] r3 = r13.A01
            int r2 = r13.A00
            float[] r29 = java.util.Arrays.copyOf(r3, r2)
            java.util.List r26 = r0.A0E()
            int r2 = r26.size()
            float[][] r3 = new float[r2][]
            int r2 = r26.size()
            X.CJn[] r2 = new X.C24770CJn[r2]
            java.util.Iterator r25 = r26.iterator()
            r14 = 0
            r24 = 0
        L_0x0853:
            boolean r5 = r25.hasNext()
            if (r5 == 0) goto L_0x0cd2
            java.lang.Object r13 = r25.next()
            X.0sU r13 = (X.AnonymousClass0sU) r13
            boolean r5 = r13 instanceof X.DFL
            r10 = 0
            if (r5 == 0) goto L_0x087e
            r9 = r13
            X.DFL r9 = (X.DFL) r9
            int r8 = r9.A05
            r5 = 13320(0x3408, float:1.8665E-41)
            if (r8 != r5) goto L_0x087e
            r5 = 49
            java.lang.String r8 = r9.A0D(r5)
            if (r8 == 0) goto L_0x087e
            java.lang.String r5 = "gone"
            boolean r5 = r8.equals(r5)
            if (r5 == 0) goto L_0x087e
            r10 = 1
        L_0x087e:
            if (r10 != 0) goto L_0x0853
            X.DFL r12 = X.DFG.A02(r13)
            if (r12 == 0) goto L_0x0caa
            X.Csa r11 = new X.Csa
            r11.<init>()
            r8 = 62
            java.lang.String r5 = r12.A0D(r8)
            if (r5 == 0) goto L_0x0ca6
            java.lang.String r8 = r12.A0D(r8)
            java.lang.String r5 = "absolute"
            boolean r5 = r8.equals(r5)
            if (r5 == 0) goto L_0x0ca6
            r23 = 1
            X.Bz9 r9 = X.C24312Bz9.ABSOLUTE
            float[] r15 = A09(r11)
            int r10 = r11.A00
            int r8 = r10 + 1
            r11.A00 = r8
            r5 = 1101529088(0x41a80000, float:21.0)
            r15[r10] = r5
            int r5 = r8 + 1
            r11.A00 = r5
            int r5 = r9.mIntValue
            float r5 = (float) r5
            r15[r8] = r5
        L_0x08ba:
            if (r28 == 0) goto L_0x0c9c
            java.lang.Integer r22 = X.AnonymousClass00R.A00
            r32 = r22
            java.lang.Integer r21 = X.AnonymousClass00R.A0C
            r31 = r21
        L_0x08c4:
            android.util.SparseArray r5 = r12.A06
            r30 = r5
            int r20 = r30.size()
            X.CVv r5 = r12.A07
            java.lang.Object r19 = r5.A00()
            r5 = r19
            android.util.SparseArray r5 = (android.util.SparseArray) r5
            r19 = r5
            int r18 = r19.size()
            int r18 = r18 + r20
            r10 = 0
        L_0x08df:
            r5 = r18
            if (r10 >= r5) goto L_0x0cac
            int r5 = r20 + -1
            if (r10 > r5) goto L_0x0c92
            r5 = r30
            int r5 = r5.keyAt(r10)
        L_0x08ed:
            java.lang.Object r8 = X.DFL.A00(r12, r5)
            if (r8 == 0) goto L_0x090e
            r9 = 35
            if (r5 == r9) goto L_0x0c26
            r9 = 36
            if (r5 == r9) goto L_0x0c06
            r9 = 38
            if (r5 == r9) goto L_0x0b93
            r9 = 63
            if (r5 == r9) goto L_0x0b83
            java.lang.String r9 = "auto"
            switch(r5) {
                case 40: goto L_0x0a79;
                case 41: goto L_0x0a8a;
                case 42: goto L_0x0aa1;
                case 43: goto L_0x0adf;
                case 44: goto L_0x0af0;
                case 45: goto L_0x0af5;
                case 46: goto L_0x0afa;
                default: goto L_0x0908;
            }
        L_0x0908:
            switch(r5) {
                case 48: goto L_0x0a73;
                case 49: goto L_0x0987;
                case 50: goto L_0x098d;
                case 51: goto L_0x0993;
                case 52: goto L_0x09cb;
                case 53: goto L_0x0a03;
                case 54: goto L_0x0a3b;
                default: goto L_0x090b;
            }
        L_0x090b:
            switch(r5) {
                case 65: goto L_0x094f;
                case 66: goto L_0x0967;
                case 67: goto L_0x0977;
                case 68: goto L_0x0911;
                default: goto L_0x090e;
            }
        L_0x090e:
            int r10 = r10 + 1
            goto L_0x08df
        L_0x0911:
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ 9HX -> 0x0c87 }
            boolean r5 = X.BE6.A1V(r8)     // Catch:{ 9HX -> 0x0c87 }
            if (r5 == 0) goto L_0x0931
            float r16 = X.A90.A00(r8)     // Catch:{ 9HX -> 0x0c87 }
            boolean r5 = X.C26112Csa.A01(r16)     // Catch:{ 9HX -> 0x0c87 }
            if (r5 != 0) goto L_0x090e
            float[] r15 = A09(r11)     // Catch:{ 9HX -> 0x0c87 }
            int r9 = r11.A00     // Catch:{ 9HX -> 0x0c87 }
            int r8 = r9 + 1
            r11.A00 = r8     // Catch:{ 9HX -> 0x0c87 }
            r5 = 1088421888(0x40e00000, float:7.0)
            goto L_0x0c1c
        L_0x0931:
            boolean r5 = r8.equals(r9)     // Catch:{ 9HX -> 0x0c87 }
            if (r5 != 0) goto L_0x090e
            float r16 = X.A90.A01(r8)     // Catch:{ 9HX -> 0x0c87 }
            boolean r5 = X.C26112Csa.A01(r16)     // Catch:{ 9HX -> 0x0c87 }
            if (r5 != 0) goto L_0x090e
            float[] r15 = A09(r11)     // Catch:{ 9HX -> 0x0c87 }
            int r9 = r11.A00     // Catch:{ 9HX -> 0x0c87 }
            int r8 = r9 + 1
            r11.A00 = r8     // Catch:{ 9HX -> 0x0c87 }
            r5 = 1086324736(0x40c00000, float:6.0)
            goto L_0x0c1c
        L_0x094f:
            float r16 = X.AnonymousClass000.A04(r8)     // Catch:{ 9HX -> 0x0c87 }
            r5 = 1065353216(0x3f800000, float:1.0)
            int r5 = (r16 > r5 ? 1 : (r16 == r5 ? 0 : -1))
            if (r5 == 0) goto L_0x090e
            float[] r15 = A09(r11)     // Catch:{ 9HX -> 0x0c87 }
            int r9 = r11.A00     // Catch:{ 9HX -> 0x0c87 }
            int r8 = r9 + 1
            r11.A00 = r8     // Catch:{ 9HX -> 0x0c87 }
            r5 = 1073741824(0x40000000, float:2.0)
            goto L_0x0c1c
        L_0x0967:
            if (r23 == 0) goto L_0x096f
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ 9HX -> 0x0c87 }
            r17 = r22
            goto L_0x0b99
        L_0x096f:
            java.lang.String r8 = "Ignoring 'start' value since 'position' is not 'absolute'"
            java.lang.String r5 = "BloksFlexLayoutProvider"
            X.C25913CoX.A01(r5, r8)     // Catch:{ 9HX -> 0x0c87 }
            goto L_0x090e
        L_0x0977:
            if (r23 == 0) goto L_0x097f
            java.lang.Integer r17 = X.AnonymousClass00R.A01     // Catch:{ 9HX -> 0x0c87 }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ 9HX -> 0x0c87 }
            goto L_0x0b99
        L_0x097f:
            java.lang.String r8 = "Ignoring 'top' value since 'position' is not 'absolute'"
            java.lang.String r5 = "BloksFlexLayoutProvider"
            X.C25913CoX.A01(r5, r8)     // Catch:{ 9HX -> 0x0c87 }
            goto L_0x090e
        L_0x0987:
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ 9HX -> 0x0c87 }
            r17 = r22
            goto L_0x0afe
        L_0x098d:
            java.lang.Integer r17 = X.AnonymousClass00R.A01     // Catch:{ 9HX -> 0x0c87 }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ 9HX -> 0x0c87 }
            goto L_0x0afe
        L_0x0993:
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ 9HX -> 0x0c87 }
            boolean r5 = X.BE6.A1V(r8)     // Catch:{ 9HX -> 0x0c87 }
            if (r5 == 0) goto L_0x09b3
            float r16 = X.A90.A00(r8)     // Catch:{ 9HX -> 0x0c87 }
            boolean r5 = X.C26112Csa.A01(r16)     // Catch:{ 9HX -> 0x0c87 }
            if (r5 != 0) goto L_0x090e
            float[] r15 = A09(r11)     // Catch:{ 9HX -> 0x0c87 }
            int r9 = r11.A00     // Catch:{ 9HX -> 0x0c87 }
            int r8 = r9 + 1
            r11.A00 = r8     // Catch:{ 9HX -> 0x0c87 }
            r5 = 1100480512(0x41980000, float:19.0)
            goto L_0x0c1c
        L_0x09b3:
            float r16 = X.A90.A01(r8)     // Catch:{ 9HX -> 0x0c87 }
            boolean r5 = X.C26112Csa.A01(r16)     // Catch:{ 9HX -> 0x0c87 }
            if (r5 != 0) goto L_0x090e
            float[] r15 = A09(r11)     // Catch:{ 9HX -> 0x0c87 }
            int r9 = r11.A00     // Catch:{ 9HX -> 0x0c87 }
            int r8 = r9 + 1
            r11.A00 = r8     // Catch:{ 9HX -> 0x0c87 }
            r5 = 1099956224(0x41900000, float:18.0)
            goto L_0x0c1c
        L_0x09cb:
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ 9HX -> 0x0c87 }
            boolean r5 = X.BE6.A1V(r8)     // Catch:{ 9HX -> 0x0c87 }
            if (r5 == 0) goto L_0x09eb
            float r16 = X.A90.A00(r8)     // Catch:{ 9HX -> 0x0c87 }
            boolean r5 = X.C26112Csa.A01(r16)     // Catch:{ 9HX -> 0x0c87 }
            if (r5 != 0) goto L_0x090e
            float[] r15 = A09(r11)     // Catch:{ 9HX -> 0x0c87 }
            int r9 = r11.A00     // Catch:{ 9HX -> 0x0c87 }
            int r8 = r9 + 1
            r11.A00 = r8     // Catch:{ 9HX -> 0x0c87 }
            r5 = 1094713344(0x41400000, float:12.0)
            goto L_0x0c1c
        L_0x09eb:
            float r16 = X.A90.A01(r8)     // Catch:{ 9HX -> 0x0c87 }
            boolean r5 = X.C26112Csa.A01(r16)     // Catch:{ 9HX -> 0x0c87 }
            if (r5 != 0) goto L_0x090e
            float[] r15 = A09(r11)     // Catch:{ 9HX -> 0x0c87 }
            int r9 = r11.A00     // Catch:{ 9HX -> 0x0c87 }
            int r8 = r9 + 1
            r11.A00 = r8     // Catch:{ 9HX -> 0x0c87 }
            r5 = 1093664768(0x41300000, float:11.0)
            goto L_0x0c1c
        L_0x0a03:
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ 9HX -> 0x0c87 }
            boolean r5 = X.BE6.A1V(r8)     // Catch:{ 9HX -> 0x0c87 }
            if (r5 == 0) goto L_0x0a23
            float r16 = X.A90.A00(r8)     // Catch:{ 9HX -> 0x0c87 }
            boolean r5 = X.C26112Csa.A01(r16)     // Catch:{ 9HX -> 0x0c87 }
            if (r5 != 0) goto L_0x090e
            float[] r15 = A09(r11)     // Catch:{ 9HX -> 0x0c87 }
            int r9 = r11.A00     // Catch:{ 9HX -> 0x0c87 }
            int r8 = r9 + 1
            r11.A00 = r8     // Catch:{ 9HX -> 0x0c87 }
            r5 = 1099431936(0x41880000, float:17.0)
            goto L_0x0c1c
        L_0x0a23:
            float r16 = X.A90.A01(r8)     // Catch:{ 9HX -> 0x0c87 }
            boolean r5 = X.C26112Csa.A01(r16)     // Catch:{ 9HX -> 0x0c87 }
            if (r5 != 0) goto L_0x090e
            float[] r15 = A09(r11)     // Catch:{ 9HX -> 0x0c87 }
            int r9 = r11.A00     // Catch:{ 9HX -> 0x0c87 }
            int r8 = r9 + 1
            r11.A00 = r8     // Catch:{ 9HX -> 0x0c87 }
            r5 = 1098907648(0x41800000, float:16.0)
            goto L_0x0c1c
        L_0x0a3b:
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ 9HX -> 0x0c87 }
            boolean r5 = X.BE6.A1V(r8)     // Catch:{ 9HX -> 0x0c87 }
            if (r5 == 0) goto L_0x0a5b
            float r16 = X.A90.A00(r8)     // Catch:{ 9HX -> 0x0c87 }
            boolean r5 = X.C26112Csa.A01(r16)     // Catch:{ 9HX -> 0x0c87 }
            if (r5 != 0) goto L_0x090e
            float[] r15 = A09(r11)     // Catch:{ 9HX -> 0x0c87 }
            int r9 = r11.A00     // Catch:{ 9HX -> 0x0c87 }
            int r8 = r9 + 1
            r11.A00 = r8     // Catch:{ 9HX -> 0x0c87 }
            r5 = 1092616192(0x41200000, float:10.0)
            goto L_0x0c1c
        L_0x0a5b:
            float r16 = X.A90.A01(r8)     // Catch:{ 9HX -> 0x0c87 }
            boolean r5 = X.C26112Csa.A01(r16)     // Catch:{ 9HX -> 0x0c87 }
            if (r5 != 0) goto L_0x090e
            float[] r15 = A09(r11)     // Catch:{ 9HX -> 0x0c87 }
            int r9 = r11.A00     // Catch:{ 9HX -> 0x0c87 }
            int r8 = r9 + 1
            r11.A00 = r8     // Catch:{ 9HX -> 0x0c87 }
            r5 = 1091567616(0x41100000, float:9.0)
            goto L_0x0c1c
        L_0x0a73:
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ 9HX -> 0x0c87 }
            r17 = r31
            goto L_0x0afe
        L_0x0a79:
            if (r23 == 0) goto L_0x0a81
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ 9HX -> 0x0c87 }
            r17 = r21
            goto L_0x0b99
        L_0x0a81:
            java.lang.String r8 = "Ignoring 'end' value since 'position' is not 'absolute'"
            java.lang.String r5 = "BloksFlexLayoutProvider"
            X.C25913CoX.A01(r5, r8)     // Catch:{ 9HX -> 0x0c87 }
            goto L_0x090e
        L_0x0a8a:
            float r16 = X.AnonymousClass000.A04(r8)     // Catch:{ 9HX -> 0x0c87 }
            r5 = 0
            int r5 = (r16 > r5 ? 1 : (r16 == r5 ? 0 : -1))
            if (r5 == 0) goto L_0x090e
            float[] r15 = A09(r11)     // Catch:{ 9HX -> 0x0c87 }
            int r9 = r11.A00     // Catch:{ 9HX -> 0x0c87 }
            int r8 = r9 + 1
            r11.A00 = r8     // Catch:{ 9HX -> 0x0c87 }
            r5 = 1065353216(0x3f800000, float:1.0)
            goto L_0x0c1c
        L_0x0aa1:
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ 9HX -> 0x0c87 }
            boolean r5 = X.BE6.A1V(r8)     // Catch:{ 9HX -> 0x0c87 }
            if (r5 == 0) goto L_0x0ac1
            float r16 = X.A90.A00(r8)     // Catch:{ 9HX -> 0x0c87 }
            boolean r5 = X.C26112Csa.A01(r16)     // Catch:{ 9HX -> 0x0c87 }
            if (r5 != 0) goto L_0x090e
            float[] r15 = A09(r11)     // Catch:{ 9HX -> 0x0c87 }
            int r9 = r11.A00     // Catch:{ 9HX -> 0x0c87 }
            int r8 = r9 + 1
            r11.A00 = r8     // Catch:{ 9HX -> 0x0c87 }
            r5 = 1096810496(0x41600000, float:14.0)
            goto L_0x0c1c
        L_0x0ac1:
            boolean r5 = r8.equals(r9)     // Catch:{ 9HX -> 0x0c87 }
            if (r5 != 0) goto L_0x090e
            float r16 = X.A90.A01(r8)     // Catch:{ 9HX -> 0x0c87 }
            boolean r5 = X.C26112Csa.A01(r16)     // Catch:{ 9HX -> 0x0c87 }
            if (r5 != 0) goto L_0x090e
            float[] r15 = A09(r11)     // Catch:{ 9HX -> 0x0c87 }
            int r9 = r11.A00     // Catch:{ 9HX -> 0x0c87 }
            int r8 = r9 + 1
            r11.A00 = r8     // Catch:{ 9HX -> 0x0c87 }
            r5 = 1095761920(0x41500000, float:13.0)
            goto L_0x0c1c
        L_0x0adf:
            if (r23 == 0) goto L_0x0ae7
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ 9HX -> 0x0c87 }
            r17 = r32
            goto L_0x0b99
        L_0x0ae7:
            java.lang.String r8 = "Ignoring 'left' value since 'position' is not 'absolute'"
            java.lang.String r5 = "BloksFlexLayoutProvider"
            X.C25913CoX.A01(r5, r8)     // Catch:{ 9HX -> 0x0c87 }
            goto L_0x090e
        L_0x0af0:
            java.lang.Integer r17 = X.AnonymousClass00R.A0N     // Catch:{ 9HX -> 0x0c87 }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ 9HX -> 0x0c87 }
            goto L_0x0afe
        L_0x0af5:
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ 9HX -> 0x0c87 }
            r17 = r21
            goto L_0x0afe
        L_0x0afa:
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ 9HX -> 0x0c87 }
            r17 = r32
        L_0x0afe:
            boolean r5 = X.BE6.A1V(r8)     // Catch:{ 9HX -> 0x0b78 }
            if (r5 == 0) goto L_0x0b31
            float r16 = X.A90.A00(r8)     // Catch:{ 9HX -> 0x0b78 }
            boolean r5 = X.C26112Csa.A01(r16)     // Catch:{ 9HX -> 0x0b78 }
            if (r5 != 0) goto L_0x090e
            r5 = 3
            X.C26112Csa.A00(r11, r5)     // Catch:{ 9HX -> 0x0b78 }
            float[] r9 = r11.A01     // Catch:{ 9HX -> 0x0b78 }
            int r8 = r11.A00     // Catch:{ 9HX -> 0x0b78 }
            int r5 = r8 + 1
            r11.A00 = r5     // Catch:{ 9HX -> 0x0b78 }
            r15 = 1103626240(0x41c80000, float:25.0)
            r9[r8] = r15     // Catch:{ 9HX -> 0x0b78 }
            int r8 = r5 + 1
            r11.A00 = r8     // Catch:{ 9HX -> 0x0b78 }
            int r15 = X.C26057CrT.A00(r17)     // Catch:{ 9HX -> 0x0b78 }
            float r15 = (float) r15     // Catch:{ 9HX -> 0x0b78 }
            r9[r5] = r15     // Catch:{ 9HX -> 0x0b78 }
        L_0x0b29:
            int r5 = r8 + 1
            r11.A00 = r5     // Catch:{ 9HX -> 0x0b78 }
            r9[r8] = r16     // Catch:{ 9HX -> 0x0b78 }
            goto L_0x090e
        L_0x0b31:
            boolean r5 = r8.equals(r9)     // Catch:{ 9HX -> 0x0b78 }
            if (r5 == 0) goto L_0x0b52
            float[] r15 = A09(r11)     // Catch:{ 9HX -> 0x0b78 }
            int r9 = r11.A00     // Catch:{ 9HX -> 0x0b78 }
            int r8 = r9 + 1
            r11.A00 = r8     // Catch:{ 9HX -> 0x0b78 }
            r5 = 1104150528(0x41d00000, float:26.0)
            r15[r9] = r5     // Catch:{ 9HX -> 0x0b78 }
            int r5 = r8 + 1
            r11.A00 = r5     // Catch:{ 9HX -> 0x0b78 }
            int r5 = X.C26057CrT.A00(r17)     // Catch:{ 9HX -> 0x0b78 }
            float r5 = (float) r5     // Catch:{ 9HX -> 0x0b78 }
            r15[r8] = r5     // Catch:{ 9HX -> 0x0b78 }
            goto L_0x090e
        L_0x0b52:
            float r16 = X.A90.A01(r8)     // Catch:{ 9HX -> 0x0b78 }
            boolean r5 = X.C26112Csa.A01(r16)     // Catch:{ 9HX -> 0x0b78 }
            if (r5 != 0) goto L_0x090e
            r5 = 3
            X.C26112Csa.A00(r11, r5)     // Catch:{ 9HX -> 0x0b78 }
            float[] r9 = r11.A01     // Catch:{ 9HX -> 0x0b78 }
            int r8 = r11.A00     // Catch:{ 9HX -> 0x0b78 }
            int r5 = r8 + 1
            r11.A00 = r5     // Catch:{ 9HX -> 0x0b78 }
            r15 = 1103101952(0x41c00000, float:24.0)
            r9[r8] = r15     // Catch:{ 9HX -> 0x0b78 }
            int r8 = r5 + 1
            r11.A00 = r8     // Catch:{ 9HX -> 0x0b78 }
            int r15 = X.C26057CrT.A00(r17)     // Catch:{ 9HX -> 0x0b78 }
            float r15 = (float) r15     // Catch:{ 9HX -> 0x0b78 }
            r9[r5] = r15     // Catch:{ 9HX -> 0x0b78 }
            goto L_0x0b29
        L_0x0b78:
            r15 = move-exception
            java.lang.String r9 = "Error parsing margin value"
            java.lang.String r8 = "BloksFlexLayoutProvider"
            r5 = 0
            X.C25913CoX.A00(r5, r8, r9, r15)     // Catch:{ 9HX -> 0x0c87 }
            goto L_0x090e
        L_0x0b83:
            if (r23 == 0) goto L_0x0b8a
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ 9HX -> 0x0c87 }
            r17 = r31
            goto L_0x0b99
        L_0x0b8a:
            java.lang.String r8 = "Ignoring 'right' value since 'position' is not 'absolute'"
            java.lang.String r5 = "BloksFlexLayoutProvider"
            X.C25913CoX.A01(r5, r8)     // Catch:{ 9HX -> 0x0c87 }
            goto L_0x090e
        L_0x0b93:
            if (r23 == 0) goto L_0x0bfd
            java.lang.Integer r17 = X.AnonymousClass00R.A0N     // Catch:{ 9HX -> 0x0c87 }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ 9HX -> 0x0c87 }
        L_0x0b99:
            boolean r5 = X.BE6.A1V(r8)     // Catch:{ 9HX -> 0x0bf2 }
            if (r5 == 0) goto L_0x0bcc
            float r16 = X.A90.A00(r8)     // Catch:{ 9HX -> 0x0bf2 }
            boolean r5 = X.C26112Csa.A01(r16)     // Catch:{ 9HX -> 0x0bf2 }
            if (r5 != 0) goto L_0x090e
            r5 = 3
            X.C26112Csa.A00(r11, r5)     // Catch:{ 9HX -> 0x0bf2 }
            float[] r9 = r11.A01     // Catch:{ 9HX -> 0x0bf2 }
            int r8 = r11.A00     // Catch:{ 9HX -> 0x0bf2 }
            int r5 = r8 + 1
            r11.A00 = r5     // Catch:{ 9HX -> 0x0bf2 }
            r15 = 1105199104(0x41e00000, float:28.0)
            r9[r8] = r15     // Catch:{ 9HX -> 0x0bf2 }
            int r8 = r5 + 1
            r11.A00 = r8     // Catch:{ 9HX -> 0x0bf2 }
            int r15 = X.C26057CrT.A00(r17)     // Catch:{ 9HX -> 0x0bf2 }
            float r15 = (float) r15     // Catch:{ 9HX -> 0x0bf2 }
            r9[r5] = r15     // Catch:{ 9HX -> 0x0bf2 }
        L_0x0bc4:
            int r5 = r8 + 1
            r11.A00 = r5     // Catch:{ 9HX -> 0x0bf2 }
            r9[r8] = r16     // Catch:{ 9HX -> 0x0bf2 }
            goto L_0x090e
        L_0x0bcc:
            float r16 = X.A90.A01(r8)     // Catch:{ 9HX -> 0x0bf2 }
            boolean r5 = X.C26112Csa.A01(r16)     // Catch:{ 9HX -> 0x0bf2 }
            if (r5 != 0) goto L_0x090e
            r5 = 3
            X.C26112Csa.A00(r11, r5)     // Catch:{ 9HX -> 0x0bf2 }
            float[] r9 = r11.A01     // Catch:{ 9HX -> 0x0bf2 }
            int r8 = r11.A00     // Catch:{ 9HX -> 0x0bf2 }
            int r5 = r8 + 1
            r11.A00 = r5     // Catch:{ 9HX -> 0x0bf2 }
            r15 = 1104674816(0x41d80000, float:27.0)
            r9[r8] = r15     // Catch:{ 9HX -> 0x0bf2 }
            int r8 = r5 + 1
            r11.A00 = r8     // Catch:{ 9HX -> 0x0bf2 }
            int r15 = X.C26057CrT.A00(r17)     // Catch:{ 9HX -> 0x0bf2 }
            float r15 = (float) r15     // Catch:{ 9HX -> 0x0bf2 }
            r9[r5] = r15     // Catch:{ 9HX -> 0x0bf2 }
            goto L_0x0bc4
        L_0x0bf2:
            r15 = move-exception
            java.lang.String r9 = "Error parsing position value"
            java.lang.String r8 = "BloksFlexLayoutProvider"
            r5 = 0
            X.C25913CoX.A00(r5, r8, r9, r15)     // Catch:{ 9HX -> 0x0c87 }
            goto L_0x090e
        L_0x0bfd:
            java.lang.String r8 = "Ignoring 'bottom' value since 'position' is not 'absolute'"
            java.lang.String r5 = "BloksFlexLayoutProvider"
            X.C25913CoX.A01(r5, r8)     // Catch:{ 9HX -> 0x0c87 }
            goto L_0x090e
        L_0x0c06:
            float r16 = X.AnonymousClass000.A04(r8)     // Catch:{ 9HX -> 0x0c87 }
            boolean r5 = X.C26112Csa.A01(r16)     // Catch:{ 9HX -> 0x0c87 }
            if (r5 != 0) goto L_0x090e
            float[] r15 = A09(r11)     // Catch:{ 9HX -> 0x0c87 }
            int r9 = r11.A00     // Catch:{ 9HX -> 0x0c87 }
            int r8 = r9 + 1
            r11.A00 = r8     // Catch:{ 9HX -> 0x0c87 }
            r5 = 1102053376(0x41b00000, float:22.0)
        L_0x0c1c:
            r15[r9] = r5     // Catch:{ 9HX -> 0x0c87 }
            int r5 = r8 + 1
            r11.A00 = r5     // Catch:{ 9HX -> 0x0c87 }
            r15[r8] = r16     // Catch:{ 9HX -> 0x0c87 }
            goto L_0x090e
        L_0x0c26:
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ 9HX -> 0x0c87 }
            int r5 = r8.hashCode()     // Catch:{ 9HX -> 0x0c87 }
            switch(r5) {
                case -1881872635: goto L_0x0c7c;
                case -1720785339: goto L_0x0c71;
                case -1364013995: goto L_0x0c66;
                case 1384876188: goto L_0x0c5b;
                case 1744442261: goto L_0x0c50;
                default: goto L_0x0c2f;
            }     // Catch:{ 9HX -> 0x0c87 }
        L_0x0c2f:
            X.Byp r9 = X.C24292Byp.AUTO     // Catch:{ 9HX -> 0x0c87 }
        L_0x0c31:
            X.Byp r5 = X.C26112Csa.A02     // Catch:{ 9HX -> 0x0c87 }
            if (r9 == r5) goto L_0x090e
            float[] r16 = A09(r11)     // Catch:{ 9HX -> 0x0c87 }
            int r5 = r11.A00     // Catch:{ 9HX -> 0x0c87 }
            int r8 = r5 + 1
            r11.A00 = r8     // Catch:{ 9HX -> 0x0c87 }
            r15 = 1101004800(0x41a00000, float:20.0)
            r16[r5] = r15     // Catch:{ 9HX -> 0x0c87 }
            int r5 = r8 + 1
            r11.A00 = r5     // Catch:{ 9HX -> 0x0c87 }
            int r5 = r9.ordinal()     // Catch:{ 9HX -> 0x0c87 }
            float r5 = (float) r5     // Catch:{ 9HX -> 0x0c87 }
            r16[r8] = r5     // Catch:{ 9HX -> 0x0c87 }
            goto L_0x090e
        L_0x0c50:
            java.lang.String r5 = "flex_end"
            boolean r5 = r8.equals(r5)     // Catch:{ 9HX -> 0x0c87 }
            if (r5 == 0) goto L_0x0c2f
            X.Byp r9 = X.C24292Byp.FLEX_END     // Catch:{ 9HX -> 0x0c87 }
            goto L_0x0c31
        L_0x0c5b:
            java.lang.String r5 = "flex_start"
            boolean r5 = r8.equals(r5)     // Catch:{ 9HX -> 0x0c87 }
            if (r5 == 0) goto L_0x0c2f
            X.Byp r9 = X.C24292Byp.FLEX_START     // Catch:{ 9HX -> 0x0c87 }
            goto L_0x0c31
        L_0x0c66:
            java.lang.String r5 = "center"
            boolean r5 = r8.equals(r5)     // Catch:{ 9HX -> 0x0c87 }
            if (r5 == 0) goto L_0x0c2f
            X.Byp r9 = X.C24292Byp.CENTER     // Catch:{ 9HX -> 0x0c87 }
            goto L_0x0c31
        L_0x0c71:
            java.lang.String r5 = "baseline"
            boolean r5 = r8.equals(r5)     // Catch:{ 9HX -> 0x0c87 }
            if (r5 == 0) goto L_0x0c2f
            X.Byp r9 = X.C24292Byp.BASELINE     // Catch:{ 9HX -> 0x0c87 }
            goto L_0x0c31
        L_0x0c7c:
            java.lang.String r5 = "stretch"
            boolean r5 = r8.equals(r5)     // Catch:{ 9HX -> 0x0c87 }
            if (r5 == 0) goto L_0x0c2f
            X.Byp r9 = X.C24292Byp.STRETCH     // Catch:{ 9HX -> 0x0c87 }
            goto L_0x0c31
        L_0x0c87:
            r15 = move-exception
            java.lang.String r9 = "Error parsing flexbox style value"
            java.lang.String r8 = "BloksFlexLayoutProvider"
            r5 = 0
            X.C25913CoX.A00(r5, r8, r9, r15)
            goto L_0x090e
        L_0x0c92:
            int r8 = r10 - r20
            r5 = r19
            int r5 = r5.keyAt(r8)
            goto L_0x08ed
        L_0x0c9c:
            java.lang.Integer r22 = X.AnonymousClass00R.A0C
            r31 = r22
            java.lang.Integer r21 = X.AnonymousClass00R.A00
            r32 = r21
            goto L_0x08c4
        L_0x0ca6:
            r23 = 0
            goto L_0x08ba
        L_0x0caa:
            X.Csa r11 = X.DFG.A00
        L_0x0cac:
            float[] r8 = r11.A01
            int r5 = r11.A00
            float[] r5 = java.util.Arrays.copyOf(r8, r5)
            r3[r14] = r5
            X.0Mh r9 = new X.0Mh
            r8 = r27
            r5 = r28
            r9.<init>(r8, r1, r13, r5)
            X.CJn r5 = new X.CJn
            r5.<init>(r9)
            r2[r14] = r5
            int r5 = r8.BkQ(r13)
            if (r5 == 0) goto L_0x0cce
            r24 = 1
        L_0x0cce:
            int r14 = r14 + 1
            goto L_0x0853
        L_0x0cd2:
            int r1 = r26.size()
            if (r1 <= r14) goto L_0x0ce4
            java.lang.Object[] r3 = java.util.Arrays.copyOf(r3, r14)
            float[][] r3 = (float[][]) r3
            java.lang.Object[] r2 = java.util.Arrays.copyOf(r2, r14)
            X.CJn[] r2 = (X.C24770CJn[]) r2
        L_0x0ce4:
            r9 = 0
            if (r24 == 0) goto L_0x0cf5
            java.lang.Integer[] r8 = new java.lang.Integer[r14]
            r5 = 0
        L_0x0cea:
            if (r5 >= r14) goto L_0x0cf7
            java.lang.Integer r1 = java.lang.Integer.valueOf(r5)
            r8[r5] = r1
            int r5 = r5 + 1
            goto L_0x0cea
        L_0x0cf5:
            r8 = r9
            goto L_0x0d04
        L_0x0cf7:
            r11 = 1
            X.0Ze r10 = new X.0Ze
            r5 = r27
            r1 = r26
            r10.<init>(r5, r1, r11)
            java.util.Arrays.sort(r8, r10)
        L_0x0d04:
            float[] r13 = X.AnonymousClass0PH.A02(r6)
            float[] r12 = X.AnonymousClass0PH.A02(r7)
            r5 = 1
            r11 = r13[r5]
            r7 = r12[r5]
            X.DFL r10 = X.DFG.A02(r0)
            if (r10 == 0) goto L_0x0d4f
            r0 = 6
            float[] r9 = new float[r0]
            r0 = 68
            float r0 = X.DFG.A00(r10, r11, r0, r5)
            r6 = 0
            r9[r6] = r0
            r0 = 42
            float r0 = X.DFG.A00(r10, r7, r0, r5)
            r9[r5] = r0
            r0 = 54
            float r1 = X.DFG.A00(r10, r11, r0, r6)
            r0 = 2
            r9[r0] = r1
            r0 = 53
            float r1 = X.DFG.A00(r10, r7, r0, r6)
            r0 = 3
            r9[r0] = r1
            r0 = 52
            float r1 = X.DFG.A00(r10, r11, r0, r6)
            r0 = 4
            r9[r0] = r1
            r0 = 51
            float r1 = X.DFG.A00(r10, r7, r0, r6)
            r0 = 5
            r9[r0] = r1
        L_0x0d4f:
            r11 = 0
            if (r9 == 0) goto L_0x0d72
            r10 = r9[r11]
            r0 = 2
            r7 = r9[r0]
            r0 = 4
            r6 = r9[r0]
            r1 = r13[r11]
            r0 = r13[r5]
            float[] r13 = X.AnonymousClass0PH.A01(r10, r7, r6, r1, r0)
            r10 = r9[r5]
            r0 = 3
            r7 = r9[r0]
            r0 = 5
            r6 = r9[r0]
            r1 = r12[r11]
            r0 = r12[r5]
            float[] r12 = X.AnonymousClass0PH.A01(r10, r7, r6, r1, r0)
        L_0x0d72:
            r31 = r13[r11]
            r32 = r13[r5]
            r33 = r12[r11]
            r34 = r12[r5]
            int r0 = r3.length
            com.facebook.flexlayout.layoutoutput.LayoutOutput r1 = new com.facebook.flexlayout.layoutoutput.LayoutOutput
            r1.<init>(r0)
            X.BRb r0 = new X.BRb
            r0.<init>(r1, r2)
            r30 = r3
            r35 = r32
            r36 = r34
            r37 = r1
            r38 = r0
            com.facebook.flexlayout.FlexLayoutNative.jni_calculateLayout(r29, r30, r31, r32, r33, r34, r35, r36, r37, r38)
            X.0YJ r0 = new X.0YJ
            r0.<init>(r1, r4, r8)
            goto L_0x0543
        L_0x0d99:
            X.0tS r0 = com.bloks.components.bkcomponentszoomable.BKBloksComponentsZoomableBinderUtil.calculateLayoutForComponent(r1, r0, r4, r6, r7)
            return r0
        L_0x0d9e:
            r2 = 0
            r1 = 0
            X.0YI r0 = new X.0YI
            r0.<init>(r4, r1, r2, r2)
            return r0
        L_0x0da6:
            r2 = 41
            X.DFL r5 = r0.A09(r2)
            if (r5 == 0) goto L_0x0e01
            java.lang.Object r2 = r1.A03
            if (r2 == 0) goto L_0x0dfc
            X.DOZ r2 = (X.DOZ) r2
            java.lang.Object r0 = X.BE9.A0l(r2, r0)
            X.CWp r0 = (X.C25080CWp) r0
            X.CbA r3 = r0.A00
            if (r3 == 0) goto L_0x0e45
            android.graphics.RectF r0 = r3.A01
            float r0 = r0.width()
            int r2 = (int) r0
            int r0 = X.C24676CEq.A00
            int r2 = X.BE7.A06(r2)
            android.graphics.RectF r6 = r3.A01
            float r0 = r6.height()
            int r0 = (int) r0
            int r0 = X.BE7.A06(r0)
            X.0tS r7 = r5.BDo(r1, r2, r0)
            X.C18070vi.A0X(r7)
            android.graphics.RectF r1 = r3.A02
            float r0 = r1.width()
            int r5 = (int) r0
            float r0 = r1.height()
            int r3 = (int) r0
            float r0 = r6.left
            int r2 = (int) r0
            float r0 = r6.top
            int r1 = (int) r0
            r9 = 0
            X.DFK r0 = new X.DFK
            r6 = r0
            r8 = r4
            r10 = r5
            r11 = r3
            r12 = r2
            r13 = r1
            r6.<init>(r7, r8, r9, r10, r11, r12, r13)
            return r0
        L_0x0dfc:
            java.lang.IllegalArgumentException r0 = X.C17890vO.A0K()
            throw r0
        L_0x0e01:
            java.lang.String r0 = "Server should have ensured that the Tooltip always has a child."
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0k(r0)
            throw r0
        L_0x0e08:
            r2 = 2
            X.C18070vi.A0d(r4, r2)
            java.lang.Object r3 = r1.A03
            if (r3 == 0) goto L_0x0e56
            X.DOZ r3 = (X.DOZ) r3
            r2 = 36
            X.DFL r5 = r0.A09(r2)
            if (r5 == 0) goto L_0x0e4f
            r2 = 2131428192(0x7f0b0360, float:1.8478022E38)
            java.lang.Object r8 = X.DOZ.A00(r3, r2)
            X.BDb r8 = (X.C22566BDb) r8
            boolean r2 = r8 instanceof X.E7K
            if (r2 == 0) goto L_0x0e45
            r3 = 35
            X.DFL r2 = r0.A09(r3)
            if (r2 == 0) goto L_0x0e45
            X.E7K r8 = (X.E7K) r8
            X.DFL r2 = r0.A09(r3)
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.common.bloks.component.base.BloksModel"
            X.C18070vi.A0z(r2, r0)
            r9 = r1
            r10 = r4
            r11 = r5
            r12 = r2
            r13 = r6
            r14 = r7
            X.0tS r0 = r8.BhM(r9, r10, r11, r12, r13, r14)
            return r0
        L_0x0e45:
            X.0tS r1 = r5.BDo(r1, r6, r7)
            X.DFK r0 = new X.DFK
            r0.<init>(r1, r4)
            return r0
        L_0x0e4f:
            java.lang.String r0 = "Expected content in screen wrapper but found none"
            java.lang.RuntimeException r0 = X.AnonymousClass8BR.A0w(r0)
            throw r0
        L_0x0e56:
            java.lang.IllegalStateException r0 = X.C17880vN.A0g()
            throw r0
        L_0x0e5b:
            r2 = 42
            X.DFL r0 = r0.A09(r2)
            if (r0 == 0) goto L_0x0e6d
            X.0tS r1 = r0.BDo(r1, r6, r7)
            X.DFK r0 = new X.DFK
            r0.<init>(r1, r4)
            return r0
        L_0x0e6d:
            java.lang.String r0 = "Server should have ensured that the Tooltip Container always has a child."
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0k(r0)
            throw r0
        L_0x0e74:
            r3 = 35
            r2 = 0
            float r14 = r0.A03(r3, r2)
            java.util.List r5 = r0.A0E()
            r9 = 0
            int r2 = (r14 > r2 ? 1 : (r14 == r2 ? 0 : -1))
            if (r2 != 0) goto L_0x0ea3
            java.lang.Object r0 = r5.get(r9)
        L_0x0e88:
            X.DFL r0 = (X.DFL) r0
            X.0tS r0 = r0.BDo(r1, r6, r7)
            java.util.ArrayList r3 = X.AnonymousClass000.A13()
            r3.add(r0)
            int r2 = r0.getWidth()
            int r1 = r0.getHeight()
            X.DFJ r0 = new X.DFJ
            r0.<init>(r4, r3, r2, r1)
            return r0
        L_0x0ea3:
            r3 = 1
            r13 = 1065353216(0x3f800000, float:1.0)
            int r2 = (r14 > r13 ? 1 : (r14 == r13 ? 0 : -1))
            if (r2 != 0) goto L_0x0eaf
            java.lang.Object r0 = r5.get(r3)
            goto L_0x0e88
        L_0x0eaf:
            X.DFL r2 = X.AnonymousClass8BR.A0G(r5, r9)
            X.0tS r2 = r2.BDo(r1, r6, r7)
            X.DFL r3 = X.AnonymousClass8BR.A0G(r5, r3)
            X.0tS r8 = r3.BDo(r1, r6, r7)
            int r6 = r2.getWidth()
            float r5 = (float) r6
            int r3 = r8.getWidth()
            int r3 = r3 - r6
            float r3 = (float) r3
            float r3 = r3 * r14
            float r5 = r5 + r3
            int r7 = (int) r5
            int r6 = r2.getHeight()
            float r5 = (float) r6
            int r3 = r8.getHeight()
            int r3 = r3 - r6
            float r3 = (float) r3
            float r3 = r3 * r14
            float r5 = r5 + r3
            int r6 = (int) r5
            java.util.ArrayList r5 = X.AnonymousClass000.A13()
            java.lang.Object r10 = r1.A03
            X.DOZ r10 = (X.DOZ) r10
            if (r10 == 0) goto L_0x0f58
            java.lang.Object r12 = X.C26272CwJ.A04(r10, r0)
            android.util.Pair r12 = (android.util.Pair) r12
            if (r12 == 0) goto L_0x0f51
            r1 = 36
            boolean r0 = r0.A0I(r1, r9)
            if (r0 == 0) goto L_0x0f4a
            int r0 = X.C108965cb.A01(r12)
            long r0 = (long) r0
            boolean r3 = X.C26272CwJ.A07(r10)
            X.BV9 r11 = new X.BV9
            r11.<init>(r10, r0, r3)
            float r13 = r13 - r14
            java.lang.Float r3 = java.lang.Float.valueOf(r13)
            X.DFQ r1 = new X.DFQ
            r1.<init>()
            X.0Ij r0 = new X.0Ij
            r0.<init>(r1, r3)
            r11.A0L(r0)
            X.DFK r9 = new X.DFK
            r9.<init>(r2, r11)
            int r0 = X.C108965cb.A00(r12)
            long r0 = (long) r0
            boolean r2 = X.C26272CwJ.A07(r10)
            X.BV9 r3 = new X.BV9
            r3.<init>(r10, r0, r2)
            java.lang.Float r2 = java.lang.Float.valueOf(r14)
            X.DFQ r1 = new X.DFQ
            r1.<init>()
            X.0Ij r0 = new X.0Ij
            r0.<init>(r1, r2)
            r3.A0L(r0)
            X.DFK r0 = new X.DFK
            r0.<init>(r8, r3)
            r5.add(r9)
            r5.add(r0)
        L_0x0f44:
            X.DFJ r0 = new X.DFJ
            r0.<init>(r4, r5, r7, r6)
            return r0
        L_0x0f4a:
            r5.add(r2)
            r5.add(r8)
            goto L_0x0f44
        L_0x0f51:
            java.lang.String r0 = "Controller for component returned null but it should have returned a Pair<Integer, Integer>"
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0n(r0)
            throw r0
        L_0x0f58:
            java.lang.String r0 = "Calculate layout was called without a valid BloksContext"
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0n(r0)
            throw r0
        L_0x0f5f:
            r9 = 0
            r8 = 1
            r2 = 35
            java.lang.Object r0 = X.DFL.A00(r0, r2)
            X.DFL r0 = (X.DFL) r0
            if (r0 == 0) goto L_0x0fb1
            X.0tS r11 = r0.BDo(r1, r6, r7)
            X.C18070vi.A0X(r11)
            r13 = 0
            long r14 = X.C02740Fe.A00(r6, r7)
            r10 = r1
            r12 = r0
            X.0Mi r5 = X.AnonymousClass0OS.A00(r10, r11, r12, r13, r14)
            int[] r1 = X.C108945cZ.A1W()
            int r0 = android.view.View.MeasureSpec.getMode(r6)
            if (r0 != 0) goto L_0x0fac
            X.0Mk r0 = r5.A01
            int r0 = X.BE8.A0B(r0)
        L_0x0f8d:
            r1[r9] = r0
            int r0 = android.view.View.MeasureSpec.getMode(r7)
            if (r0 != 0) goto L_0x0fa7
            X.0Mk r0 = r5.A01
            int r3 = X.BE8.A0A(r0)
        L_0x0f9b:
            r1[r8] = r3
            r2 = r1[r9]
            X.0Mk r1 = r5.A01
            X.0YI r0 = new X.0YI
            r0.<init>(r4, r1, r2, r3)
            return r0
        L_0x0fa7:
            int r3 = android.view.View.MeasureSpec.getSize(r7)
            goto L_0x0f9b
        L_0x0fac:
            int r0 = android.view.View.MeasureSpec.getSize(r6)
            goto L_0x0f8d
        L_0x0fb1:
            java.lang.String r0 = "PTR container has no child"
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0n(r0)
            throw r0
        L_0x0fb8:
            r0 = 2147483647(0x7fffffff, float:NaN)
            int r5 = A02(r0, r6)
            int r3 = A02(r0, r7)
            boolean r0 = r4 instanceof X.AnonymousClass0C6
            if (r0 != 0) goto L_0x0fdd
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "Expected FrescoRenderUnit (got "
            r1.append(r0)
            java.lang.Class r0 = X.C108975cc.A0R(r4)
            java.lang.String r0 = X.AnonymousClass001.A1F(r0, r1)
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0n(r0)
            throw r0
        L_0x0fdd:
            r1 = r4
            X.0C6 r1 = (X.AnonymousClass0C6) r1
            r0 = 0
            X.C18070vi.A0d(r1, r0)
            X.E13 r2 = r1.A05
            boolean r0 = r2 instanceof X.C26746DBz
            if (r0 != 0) goto L_0x1015
            boolean r0 = r2 instanceof X.C26745DBy
            if (r0 == 0) goto L_0x0ffa
            java.lang.Class<X.Cnd> r1 = X.C25869Cnd.class
            monitor-enter(r1)
            X.DBx r0 = X.C26744DBx.A01     // Catch:{ all -> 0x0ff7 }
            r0.BXQ()     // Catch:{ all -> 0x0ff7 }
            goto L_0x1014
        L_0x0ff7:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        L_0x0ffa:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "Expected SingleImageSource (got "
            r1.append(r0)
            java.lang.Class r0 = r2.getClass()
            X.20F r0 = X.AnonymousClass3MW.A15(r0)
            java.lang.String r0 = X.AnonymousClass001.A1F(r0, r1)
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0n(r0)
            throw r0
        L_0x1014:
            monitor-exit(r1)
        L_0x1015:
            r0 = 0
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>(r0, r0, r5, r3)
            X.0YI r0 = new X.0YI
            r0.<init>(r4, r1, r5, r3)
            return r0
        L_0x1021:
            r5 = 0
            r12 = 1
            r2 = 2
            X.C18070vi.A0d(r4, r2)
            java.lang.Integer r2 = A06(r0)
            int r2 = r2.intValue()
            if (r2 == r5) goto L_0x1757
            if (r2 == r12) goto L_0x12f4
            X.Cvf r2 = X.C26242Cvf.A00
            android.content.Context r3 = r1.A02
            X.CT8 r2 = r2.A05(r3, r0)
            int r11 = r2.A01
            int r10 = r2.A02
            android.graphics.Rect r9 = r2.A04
            int r13 = r2.A00
            int r8 = r2.A03
            boolean r28 = X.CC8.A00(r3)
            java.util.List r2 = r0.A0E()
            java.util.ArrayList r27 = X.AnonymousClass000.A14(r2)
            X.CW7 r26 = new X.CW7
            r2 = r26
            r2.<init>(r1, r0)
            int r2 = A03(r9, r6, r7, r11)
            int[] r25 = X.C26242Cvf.A04(r2, r10)
            r3 = r8
            if (r11 != r12) goto L_0x1064
            r3 = r13
        L_0x1064:
            r2 = r28
            android.graphics.Rect[] r24 = X.C24521C7p.A00(r11, r3, r10, r2)
            if (r11 != r12) goto L_0x1082
            int r8 = r8 / 2
        L_0x106e:
            X.C59[] r3 = new X.C59[r10]
            r14 = 0
        L_0x1071:
            r13 = 0
            if (r14 >= r10) goto L_0x1085
            X.C59 r2 = new X.C59
            r2.<init>()
            r2.A00 = r5
            r2.A01 = r13
            r3[r14] = r2
            int r14 = r14 + 1
            goto L_0x1071
        L_0x1082:
            int r8 = r13 / 2
            goto L_0x106e
        L_0x1085:
            java.util.List r2 = r0.A0E()
            java.util.ArrayList r23 = X.AnonymousClass000.A14(r2)
            java.util.List r2 = X.BE7.A0r(r0)
            java.util.Iterator r22 = r2.iterator()
            r21 = 0
        L_0x1097:
            boolean r2 = r22.hasNext()
            if (r2 == 0) goto L_0x1258
            java.lang.Object r20 = r22.next()
            int r19 = r21 + 1
            if (r21 < 0) goto L_0x19ed
            r2 = r20
            X.DFL r2 = (X.DFL) r2
            r20 = r2
            X.C18070vi.A0b(r20)
            X.DFL r14 = X.BE7.A0P(r20)
            r18 = 0
            if (r14 == 0) goto L_0x10c2
            int r13 = r14.A05
            r2 = 16482(0x4062, float:2.3096E-41)
            if (r13 != r2) goto L_0x10c2
            r2 = 36
            boolean r18 = r14.A0I(r2, r5)
        L_0x10c2:
            X.5Ls r13 = new X.5Ls
            r13.<init>(r3)
            X.4rJ r2 = new X.4rJ
            r2.<init>(r13)
            java.util.Iterator r16 = r2.iterator()
            boolean r2 = r16.hasNext()
            if (r18 == 0) goto L_0x1222
            if (r2 == 0) goto L_0x1250
            java.lang.Object r14 = r16.next()
            boolean r2 = r16.hasNext()
            if (r2 == 0) goto L_0x1102
            r2 = r14
            X.9rE r2 = (X.C194139rE) r2
            java.lang.Object r2 = r2.A01
            X.C59 r2 = (X.C59) r2
            int r13 = r2.A00
        L_0x10eb:
            java.lang.Object r15 = r16.next()
            r2 = r15
            X.9rE r2 = (X.C194139rE) r2
            java.lang.Object r2 = r2.A01
            X.C59 r2 = (X.C59) r2
            int r2 = r2.A00
            if (r13 >= r2) goto L_0x10fc
            r13 = r2
            r14 = r15
        L_0x10fc:
            boolean r2 = r16.hasNext()
            if (r2 != 0) goto L_0x10eb
        L_0x1102:
            X.9rE r14 = (X.C194139rE) r14
            if (r14 == 0) goto L_0x1253
            int r2 = r14.A00
            r17 = r2
            java.lang.Integer r2 = java.lang.Integer.valueOf(r17)
            if (r2 == 0) goto L_0x1253
            if (r18 == 0) goto L_0x1219
            android.graphics.Rect r13 = X.AnonymousClass3MW.A07()
        L_0x1116:
            r2 = r23
            r2.add(r13)
            X.DFL r14 = X.BE7.A0P(r20)
            r16 = 0
            if (r14 == 0) goto L_0x1141
            int r2 = r14.A05
            r15 = 16482(0x4062, float:2.3096E-41)
            if (r2 != r15) goto L_0x1141
            r2 = 35
            java.lang.Object r14 = X.DFL.A00(r14, r2)
            if (r14 == 0) goto L_0x1141
            boolean r2 = r14 instanceof java.lang.Number
            if (r2 == 0) goto L_0x1141
            java.lang.Number r14 = (java.lang.Number) r14
            if (r14 == 0) goto L_0x1141
            float r2 = r14.floatValue()
            java.lang.Float r16 = java.lang.Float.valueOf(r2)
        L_0x1141:
            if (r18 == 0) goto L_0x1154
            r2 = r25
            int r2 = r2.length
            r29 = r2
            r15 = 0
            r14 = 0
        L_0x114a:
            r2 = r29
            if (r15 >= r2) goto L_0x1156
            r2 = r25[r15]
            int r14 = r14 + r2
            int r15 = r15 + 1
            goto L_0x114a
        L_0x1154:
            r14 = r25[r17]
        L_0x1156:
            if (r11 != r12) goto L_0x11dd
            int r2 = r13.left
            int r14 = r14 - r2
            int r2 = r13.right
        L_0x115d:
            int r14 = r14 - r2
            if (r16 == 0) goto L_0x11da
            if (r18 != 0) goto L_0x11da
            float r13 = (float) r14
            float r2 = r16.floatValue()
            float r13 = r13 * r2
            int r13 = (int) r13
            int r2 = X.C24676CEq.A00
            int r13 = X.BE7.A06(r13)
        L_0x116f:
            int r2 = X.BE7.A06(r14)
            r14 = r2
            if (r11 != 0) goto L_0x1178
            r14 = r13
            r13 = r2
        L_0x1178:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r14)
            X.1D6 r2 = X.AnonymousClass1D6.A00(r2, r13)
            int r15 = X.AnonymousClass3MZ.A04(r2)
            int r14 = X.C108955ca.A09(r2)
            r13 = r26
            r2 = r20
            X.DFE r13 = A05(r13, r1, r2, r15, r14)
            r2 = r27
            r2.add(r13)
            X.0CC r2 = r13.A00
            java.lang.Object r2 = r2.A00()
            X.0Mi r2 = (X.C04220Mi) r2
            X.0Mk r2 = r2.A01
            if (r11 != r12) goto L_0x11d5
            int r14 = X.BE8.A0A(r2)
        L_0x11a5:
            r16 = r3[r17]
            r2 = r16
            int r13 = r2.A00
            int r13 = r13 + r14
            X.CIr r2 = r2.A01
            if (r2 == 0) goto L_0x11f2
            int r2 = r8 * 2
            int r13 = r13 + r2
            r14 = 0
        L_0x11b4:
            if (r14 >= r10) goto L_0x11e4
            r2 = r3[r14]
            X.CIr r2 = r2.A01
            if (r2 == 0) goto L_0x11ca
            int r2 = r2.A00
            r15 = r23
            java.lang.Object r2 = r15.get(r2)
            android.graphics.Rect r2 = (android.graphics.Rect) r2
            if (r11 != r12) goto L_0x11cd
            r2.bottom = r8
        L_0x11ca:
            int r14 = r14 + 1
            goto L_0x11b4
        L_0x11cd:
            if (r28 != 0) goto L_0x11d2
            r2.right = r8
            goto L_0x11ca
        L_0x11d2:
            r2.left = r8
            goto L_0x11ca
        L_0x11d5:
            int r14 = X.BE8.A0B(r2)
            goto L_0x11a5
        L_0x11da:
            int r13 = X.C24676CEq.A00
            goto L_0x116f
        L_0x11dd:
            int r2 = r13.top
            int r14 = r14 - r2
            int r2 = r13.bottom
            goto L_0x115d
        L_0x11e4:
            r14 = r23
            r2 = r21
            java.lang.Object r2 = r14.get(r2)
            android.graphics.Rect r2 = (android.graphics.Rect) r2
            if (r11 != r12) goto L_0x1207
            r2.top = r8
        L_0x11f2:
            X.CIr r14 = new X.CIr
            r2 = r21
            r14.<init>(r2)
            if (r18 == 0) goto L_0x120f
            r15 = 0
        L_0x11fc:
            if (r15 >= r10) goto L_0x1215
            r2 = r3[r15]
            r2.A01 = r14
            r2.A00 = r13
            int r15 = r15 + 1
            goto L_0x11fc
        L_0x1207:
            if (r28 != 0) goto L_0x120c
            r2.left = r8
            goto L_0x11f2
        L_0x120c:
            r2.right = r8
            goto L_0x11f2
        L_0x120f:
            r2 = r16
            r2.A01 = r14
            r2.A00 = r13
        L_0x1215:
            r21 = r19
            goto L_0x1097
        L_0x1219:
            r2 = r24[r17]
            android.graphics.Rect r13 = new android.graphics.Rect
            r13.<init>(r2)
            goto L_0x1116
        L_0x1222:
            if (r2 == 0) goto L_0x1250
            java.lang.Object r14 = r16.next()
            boolean r2 = r16.hasNext()
            if (r2 == 0) goto L_0x1102
            r2 = r14
            X.9rE r2 = (X.C194139rE) r2
            java.lang.Object r2 = r2.A01
            X.C59 r2 = (X.C59) r2
            int r13 = r2.A00
        L_0x1237:
            java.lang.Object r15 = r16.next()
            r2 = r15
            X.9rE r2 = (X.C194139rE) r2
            java.lang.Object r2 = r2.A01
            X.C59 r2 = (X.C59) r2
            int r2 = r2.A00
            if (r13 <= r2) goto L_0x1248
            r13 = r2
            r14 = r15
        L_0x1248:
            boolean r2 = r16.hasNext()
            if (r2 != 0) goto L_0x1237
            goto L_0x1102
        L_0x1250:
            r14 = 0
            goto L_0x1102
        L_0x1253:
            java.lang.IllegalStateException r0 = X.BE6.A0k()
            throw r0
        L_0x1258:
            java.lang.Object r1 = r1.A03
            X.DOZ r1 = (X.DOZ) r1
            if (r1 == 0) goto L_0x1268
            java.lang.Object r1 = X.BE9.A0l(r1, r0)
            X.ClD r1 = (X.C25743ClD) r1
            r0 = r23
            r1.A08 = r0
        L_0x1268:
            int r14 = android.view.View.MeasureSpec.getMode(r6)
            int r13 = android.view.View.MeasureSpec.getMode(r7)
            if (r11 != r12) goto L_0x127b
            if (r14 != 0) goto L_0x1284
            java.lang.String r0 = "StaggeredGridCollectionMeasureHelper: Width should be specified for vertical grid collection"
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0n(r0)
            throw r0
        L_0x127b:
            if (r13 != 0) goto L_0x1284
            java.lang.String r0 = "StaggeredGridCollectionMeasureHelper: Height should be specified for horizontal grid collection"
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0n(r0)
            throw r0
        L_0x1284:
            r1 = 0
            if (r10 == 0) goto L_0x1294
            r8 = r3[r5]
            X.C18070vi.A0d(r3, r5)
            int r10 = r10 + -1
            if (r10 != 0) goto L_0x12e2
            if (r8 == 0) goto L_0x1294
        L_0x1292:
            int r1 = r8.A00
        L_0x1294:
            if (r11 != r12) goto L_0x12dd
            int r2 = r9.top
            int r0 = r9.bottom
        L_0x129a:
            int r2 = r2 + r0
            int r1 = r1 + r2
            int r3 = android.view.View.MeasureSpec.getSize(r6)
            if (r11 != 0) goto L_0x12ac
            r0 = 1073741824(0x40000000, float:2.0)
            if (r14 == r0) goto L_0x12ac
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r14 != r0) goto L_0x12db
            if (r1 < r3) goto L_0x12db
        L_0x12ac:
            int r2 = android.view.View.MeasureSpec.getSize(r7)
            if (r11 != r12) goto L_0x12bc
            r0 = 1073741824(0x40000000, float:2.0)
            if (r13 == r0) goto L_0x12bc
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r13 != r0) goto L_0x12d9
            if (r1 < r2) goto L_0x12d9
        L_0x12bc:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
            X.1D6 r0 = X.AnonymousClass1D6.A00(r0, r2)
            int r3 = X.AnonymousClass3MZ.A04(r0)
            int r2 = X.C108955ca.A09(r0)
            X.CPf r1 = new X.CPf
            r0 = r27
            r1.<init>(r0, r3, r2)
            X.0YI r0 = new X.0YI
            r0.<init>(r4, r1, r3, r2)
            return r0
        L_0x12d9:
            r2 = r1
            goto L_0x12bc
        L_0x12db:
            r3 = r1
            goto L_0x12ac
        L_0x12dd:
            int r2 = r9.left
            int r0 = r9.right
            goto L_0x129a
        L_0x12e2:
            int r5 = r8.A00
            if (r12 > r10) goto L_0x1292
            r2 = 1
        L_0x12e7:
            r1 = r3[r2]
            int r0 = r1.A00
            if (r5 >= r0) goto L_0x12ef
            r8 = r1
            r5 = r0
        L_0x12ef:
            if (r2 == r10) goto L_0x1292
            int r2 = r2 + 1
            goto L_0x12e7
        L_0x12f4:
            X.Cvf r35 = X.C26242Cvf.A00
            android.content.Context r2 = r1.A02
            r51 = r2
            r3 = r35
            X.CT8 r2 = r3.A05(r2, r0)
            java.lang.Integer r3 = r2.A06
            java.lang.Integer r2 = X.AnonymousClass00R.A00
            if (r3 != r2) goto L_0x131b
            java.lang.Object r11 = r1.A03
            X.DOZ r11 = (X.DOZ) r11
            boolean r2 = X.C26272CwJ.A08(r11)
            if (r2 != 0) goto L_0x150e
            if (r11 == 0) goto L_0x131b
            X.CXY r2 = r11.A02
            X.E86 r2 = r2.A01
            if (r2 == 0) goto L_0x131b
            r2.BNU()
        L_0x131b:
            r3 = r35
            r2 = r51
            X.CT8 r5 = r3.A05(r2, r0)
            int r2 = r5.A01
            r27 = r2
            int r2 = r5.A02
            r41 = r2
            int r2 = r5.A00
            r38 = r2
            int r2 = r5.A03
            r39 = r2
            android.graphics.Rect r2 = r5.A04
            r45 = r2
            X.DFL r3 = r5.A05
            r2 = 35
            java.lang.Object r9 = X.DFL.A00(r3, r2)
            boolean r2 = r9 instanceof java.lang.Number
            r26 = 0
            if (r2 == 0) goto L_0x1435
            java.lang.Number r9 = (java.lang.Number) r9
        L_0x1347:
            java.lang.Integer r2 = r5.A06
            r44 = r2
            java.util.List r5 = X.BE7.A0r(r0)
            r3 = r35
            r2 = r41
            java.util.ArrayList r25 = r3.A06(r5, r2)
            int r40 = r25.size()
            java.util.ArrayList r24 = X.C17880vN.A0z(r40)
            java.util.List r2 = r0.A0E()
            java.util.ArrayList r23 = X.AnonymousClass000.A14(r2)
            X.CW7 r22 = new X.CW7
            r2 = r22
            r2.<init>(r1, r0)
            r3 = r45
            r2 = r27
            int r3 = A03(r3, r6, r7, r2)
            r2 = r41
            int[] r30 = X.C26242Cvf.A04(r3, r2)
            java.util.ArrayList r21 = X.C17880vN.A0z(r40)
            java.util.ArrayList r20 = X.C17880vN.A0z(r40)
            java.util.ArrayList r19 = X.C17880vN.A0z(r40)
            int r18 = r25.size()
            r8 = 0
            r17 = 0
        L_0x138f:
            r2 = r18
            if (r8 >= r2) goto L_0x1439
            r2 = r25
            java.lang.Object r5 = r2.get(r8)
            java.util.List r5 = (java.util.List) r5
            java.util.ArrayList r15 = X.AnonymousClass000.A13()
            boolean r43 = X.CC8.A00(r51)
            r36 = r5
            r37 = r27
            r42 = r8
            java.util.ArrayList r14 = X.C26242Cvf.A01(r36, r37, r38, r39, r40, r41, r42, r43)
            int r16 = r5.size()
            r10 = 0
            r3 = 0
        L_0x13b3:
            r2 = r16
            if (r3 >= r2) goto L_0x1422
            X.DFL r11 = X.AnonymousClass8BR.A0G(r5, r3)
            boolean r34 = X.C26242Cvf.A03(r11)
            if (r34 == 0) goto L_0x141d
            r33 = r41
        L_0x13c3:
            java.lang.Object r2 = r14.get(r3)
            android.graphics.Rect r2 = (android.graphics.Rect) r2
            if (r9 == 0) goto L_0x141a
            float r12 = r9.floatValue()
            java.lang.Float r29 = java.lang.Float.valueOf(r12)
        L_0x13d3:
            r28 = r2
            r31 = r27
            r32 = r3
            X.1D6 r2 = X.C26242Cvf.A02(r28, r29, r30, r31, r32, r33, r34)
            int r13 = X.AnonymousClass3MZ.A04(r2)
            int r12 = X.C108955ca.A09(r2)
            r2 = r22
            X.DFE r2 = A05(r2, r1, r11, r13, r12)
            X.0CC r2 = r2.A00
            java.lang.Object r2 = r2.A00()
            X.0Mi r2 = (X.C04220Mi) r2
            X.0Mk r2 = r2.A01
            r28 = r2
            r11 = 1
            r2 = r27
            if (r2 != r11) goto L_0x1415
            int r11 = X.BE8.A0A(r28)
        L_0x1400:
            r2 = r17
            int r17 = java.lang.Math.max(r2, r11)
            int r10 = java.lang.Math.max(r10, r11)
            X.CMb r2 = new X.CMb
            r2.<init>(r13, r12)
            r15.add(r2)
            int r3 = r3 + 1
            goto L_0x13b3
        L_0x1415:
            int r11 = X.BE8.A0B(r28)
            goto L_0x1400
        L_0x141a:
            r29 = r26
            goto L_0x13d3
        L_0x141d:
            int r33 = X.C26242Cvf.A00(r11)
            goto L_0x13c3
        L_0x1422:
            r2 = r20
            r2.add(r14)
            r2 = r19
            X.C17890vO.A1D(r2, r10)
            r2 = r21
            r2.add(r15)
            int r8 = r8 + 1
            goto L_0x138f
        L_0x1435:
            r9 = r26
            goto L_0x1347
        L_0x1439:
            int r12 = r25.size()
            r11 = 0
        L_0x143e:
            if (r11 >= r12) goto L_0x14b6
            r2 = r25
            java.lang.Object r13 = r2.get(r11)
            java.util.List r13 = (java.util.List) r13
            java.util.ArrayList r10 = X.AnonymousClass000.A13()
            r2 = r21
            java.lang.Object r9 = X.AnonymousClass8BS.A0Z(r2, r11)
            java.util.List r9 = (java.util.List) r9
            int r8 = r13.size()
            r5 = 0
        L_0x1459:
            if (r5 >= r8) goto L_0x14ae
            X.DFL r14 = X.AnonymousClass8BR.A0G(r13, r5)
            java.lang.Object r3 = r9.get(r5)
            X.CMb r3 = (X.C24833CMb) r3
            java.lang.Integer r15 = X.AnonymousClass00R.A01
            r2 = r44
            if (r2 != r15) goto L_0x149d
            int r2 = X.C24676CEq.A00
            int r15 = X.BE7.A06(r17)
        L_0x1471:
            if (r27 != 0) goto L_0x149a
            r2 = r15
            int r15 = r3.A00
        L_0x1476:
            r3 = r22
            X.DFE r3 = A05(r3, r1, r14, r2, r15)
            r2 = r20
            java.lang.Object r2 = r2.get(r11)
            java.util.List r2 = (java.util.List) r2
            java.lang.Object r14 = r2.get(r5)
            android.graphics.Rect r14 = (android.graphics.Rect) r14
            X.CMa r2 = new X.CMa
            r2.<init>(r14, r3)
            r10.add(r2)
            r2 = r23
            r2.add(r3)
            int r5 = r5 + 1
            goto L_0x1459
        L_0x149a:
            int r2 = r3.A01
            goto L_0x1476
        L_0x149d:
            r2 = r19
            java.lang.Object r2 = r2.get(r11)
            int r15 = X.AnonymousClass8BU.A03(r2)
            int r2 = X.C24676CEq.A00
            int r15 = X.BE7.A06(r15)
            goto L_0x1471
        L_0x14ae:
            r2 = r24
            r2.add(r10)
            int r11 = r11 + 1
            goto L_0x143e
        L_0x14b6:
            java.lang.Object r1 = r1.A03
            X.DOZ r1 = (X.DOZ) r1
            if (r1 == 0) goto L_0x14c8
            java.lang.Object r2 = X.BE9.A0l(r1, r0)
            X.ClD r2 = (X.C25743ClD) r2
            java.util.ArrayList r1 = X.C29351c6.A0F(r20)
            r2.A08 = r1
        L_0x14c8:
            r8 = r35
            r9 = r45
            r10 = r24
            r11 = r6
            r12 = r7
            r13 = r27
            X.1D6 r1 = r8.A07(r9, r10, r11, r12, r13)
            int r6 = X.AnonymousClass3MZ.A04(r1)
            int r7 = X.C108955ca.A09(r1)
            java.util.List r0 = X.BE7.A0r(r0)
            java.util.ArrayList r3 = X.C29351c6.A0D(r0)
            java.util.Iterator r2 = r0.iterator()
        L_0x14ea:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x1505
            X.DFL r1 = X.BE8.A0R(r2)
            boolean r0 = X.C26242Cvf.A03(r1)
            if (r0 == 0) goto L_0x1500
            r0 = r41
        L_0x14fc:
            X.C17890vO.A1D(r3, r0)
            goto L_0x14ea
        L_0x1500:
            int r0 = X.C26242Cvf.A00(r1)
            goto L_0x14fc
        L_0x1505:
            X.BVB r1 = new X.BVB
            r0 = r23
            r1.<init>(r0, r3, r6, r7)
            goto L_0x1c6f
        L_0x150e:
            r3 = r35
            r2 = r51
            X.CT8 r3 = r3.A05(r2, r0)
            int r2 = r3.A01
            r45 = r2
            int r2 = r3.A02
            r50 = r2
            int r2 = r3.A00
            r38 = r2
            int r2 = r3.A03
            r39 = r2
            android.graphics.Rect r2 = r3.A04
            r49 = r2
            X.DFL r3 = r3.A05
            r2 = 35
            java.lang.Object r9 = X.DFL.A00(r3, r2)
            boolean r2 = r9 instanceof java.lang.Number
            r34 = 0
            if (r2 == 0) goto L_0x1657
            java.lang.Number r9 = (java.lang.Number) r9
        L_0x153a:
            java.util.List r8 = X.BE7.A0r(r0)
            r3 = r35
            r2 = r50
            java.util.ArrayList r33 = r3.A06(r8, r2)
            int r40 = r33.size()
            java.util.ArrayList r32 = X.C17880vN.A0z(r40)
            java.util.List r2 = r0.A0E()
            java.util.ArrayList r31 = X.AnonymousClass000.A14(r2)
            X.CW7 r30 = new X.CW7
            r2 = r30
            r2.<init>(r1, r0)
            r3 = r49
            r2 = r45
            int r3 = A03(r3, r6, r7, r2)
            r2 = r50
            int[] r44 = X.C26242Cvf.A04(r3, r2)
            java.util.ArrayList r29 = X.C17880vN.A0z(r40)
            java.util.ArrayList r28 = X.C17880vN.A0z(r40)
            java.lang.ThreadLocal r2 = X.C24724CHl.A01
            r2.get()
            java.util.ArrayList r27 = X.C108975cc.A0g(r33)
            int r26 = r33.size()
            r8 = 0
        L_0x1581:
            r2 = r26
            if (r8 >= r2) goto L_0x165b
            r2 = r33
            java.lang.Object r14 = r2.get(r8)
            java.util.List r14 = (java.util.List) r14
            java.util.ArrayList r25 = X.AnonymousClass000.A14(r14)
            java.util.ArrayList r24 = X.AnonymousClass000.A13()
            boolean r43 = X.CC8.A00(r51)
            r36 = r14
            r37 = r45
            r41 = r50
            r42 = r8
            java.util.ArrayList r23 = X.C26242Cvf.A01(r36, r37, r38, r39, r40, r41, r42, r43)
            java.util.ArrayList r22 = X.AnonymousClass000.A14(r14)
            java.util.ArrayList r21 = X.AnonymousClass000.A14(r14)
            int r20 = r14.size()
            r10 = 0
        L_0x15b2:
            r2 = r20
            if (r10 >= r2) goto L_0x1628
            X.DFL r19 = X.AnonymousClass8BR.A0G(r14, r10)
            boolean r48 = X.C26242Cvf.A03(r19)
            if (r48 == 0) goto L_0x1623
            r47 = r50
        L_0x15c2:
            r2 = r23
            java.lang.Object r2 = r2.get(r10)
            android.graphics.Rect r2 = (android.graphics.Rect) r2
            if (r9 == 0) goto L_0x1620
            float r3 = r9.floatValue()
            java.lang.Float r43 = java.lang.Float.valueOf(r3)
        L_0x15d4:
            r42 = r2
            r46 = r10
            X.1D6 r2 = X.C26242Cvf.A02(r42, r43, r44, r45, r46, r47, r48)
            int r18 = X.AnonymousClass3MZ.A04(r2)
            int r15 = X.C108955ca.A09(r2)
            r2 = r34
            X.0Jt r13 = new X.0Jt
            r3 = r19
            r13.<init>(r3, r2, r2)
            r2 = r25
            r2.add(r13)
            r2 = r18
            long r16 = X.C02740Fe.A00(r2, r15)
            X.0JN r12 = new X.0JN
            r2 = r16
            r12.<init>(r2)
            r2 = r22
            r2.add(r12)
            r3 = r19
            r2 = r30
            X.0Mi r3 = r2.A00(r3)
            r2 = r21
            r2.add(r3)
            X.CMb r3 = new X.CMb
            r2 = r18
            r3.<init>(r2, r15)
            r2 = r24
            r2.add(r3)
            int r10 = r10 + 1
            goto L_0x15b2
        L_0x1620:
            r43 = r34
            goto L_0x15d4
        L_0x1623:
            int r47 = X.C26242Cvf.A00(r19)
            goto L_0x15c2
        L_0x1628:
            X.CBx.A00(r11)
            int r2 = r1.A01
            X.CTg r3 = new X.CTg
            r12 = r3
            r13 = r51
            r14 = r11
            r15 = r25
            r16 = r21
            r17 = r22
            r18 = r45
            r19 = r2
            r12.<init>(r13, r14, r15, r16, r17, r18, r19)
            r2 = r27
            r2.add(r3)
            r3 = r28
            r2 = r23
            r3.add(r2)
            r3 = r29
            r2 = r24
            r3.add(r2)
            int r8 = r8 + 1
            goto L_0x1581
        L_0x1657:
            r9 = r34
            goto L_0x153a
        L_0x165b:
            int r23 = r33.size()
            r9 = 0
        L_0x1660:
            r2 = r23
            if (r9 >= r2) goto L_0x170c
            r2 = r33
            java.lang.Object r22 = r2.get(r9)
            r2 = r22
            java.util.List r2 = (java.util.List) r2
            r22 = r2
            java.util.ArrayList r21 = X.AnonymousClass000.A13()
            r2 = r29
            java.lang.Object r10 = X.AnonymousClass8BS.A0Z(r2, r9)
            java.util.List r10 = (java.util.List) r10
            r2 = r27
            java.lang.Object r20 = X.AnonymousClass8BS.A0Z(r2, r9)
            r2 = r20
            X.CTg r2 = (X.C25006CTg) r2
            r20 = r2
            int r19 = r22.size()
            r8 = 0
        L_0x168d:
            r2 = r19
            if (r8 >= r2) goto L_0x1701
            r2 = r22
            X.DFL r12 = X.AnonymousClass8BR.A0G(r2, r8)
            java.lang.Object r13 = r10.get(r8)
            X.CMb r13 = (X.C24833CMb) r13
            r2 = r30
            X.0Mi r39 = r2.A00(r12)
            X.0Mi r14 = r2.A00(r12)
            int r3 = r13.A01
            int r2 = r13.A00
            long r17 = X.C02740Fe.A00(r3, r2)
            X.DVn r13 = new X.DVn
            r36 = r13
            r37 = r20
            r38 = r1
            r40 = r12
            r41 = r8
            r42 = r45
            r36.<init>(r37, r38, r39, r40, r41, r42)
            X.0CC r16 = new X.0CC
            r15 = r14
            r2 = r17
            r14 = r13
            r13 = r16
            r13.<init>(r15, r14, r2)
            X.C18070vi.A0d(r12, r5)
            int r2 = r12.A04
            long r2 = (long) r2
            r14 = r2
            X.DFE r13 = new X.DFE
            r2 = r16
            r13.<init>(r2, r12)
            r2 = r30
            android.util.LongSparseArray r12 = r2.A01
            r2 = r14
            r12.put(r2, r13)
            r2 = r28
            java.lang.Object r2 = r2.get(r9)
            java.util.List r2 = (java.util.List) r2
            java.lang.Object r2 = r2.get(r8)
            android.graphics.Rect r2 = (android.graphics.Rect) r2
            X.CMa r3 = new X.CMa
            r3.<init>(r2, r13)
            r2 = r21
            r2.add(r3)
            r2 = r31
            r2.add(r13)
            int r8 = r8 + 1
            goto L_0x168d
        L_0x1701:
            r3 = r32
            r2 = r21
            r3.add(r2)
            int r9 = r9 + 1
            goto L_0x1660
        L_0x170c:
            if (r11 == 0) goto L_0x171a
            java.lang.Object r2 = X.BE9.A0l(r11, r0)
            X.ClD r2 = (X.C25743ClD) r2
            java.util.ArrayList r1 = X.C29351c6.A0F(r28)
            r2.A08 = r1
        L_0x171a:
            r8 = r35
            r9 = r49
            r10 = r32
            r11 = r6
            r12 = r7
            r13 = r45
            X.1D6 r1 = r8.A07(r9, r10, r11, r12, r13)
            int r6 = X.AnonymousClass3MZ.A04(r1)
            int r7 = X.C108955ca.A09(r1)
            java.util.List r1 = X.BE7.A0r(r0)
            java.util.ArrayList r3 = X.C29351c6.A0D(r1)
            java.util.Iterator r8 = r1.iterator()
        L_0x173c:
            boolean r1 = r8.hasNext()
            if (r1 == 0) goto L_0x1c5d
            X.DFL r2 = X.BE8.A0R(r8)
            boolean r1 = X.C26242Cvf.A03(r2)
            if (r1 == 0) goto L_0x1752
            r1 = r50
        L_0x174e:
            X.C17890vO.A1D(r3, r1)
            goto L_0x173c
        L_0x1752:
            int r1 = X.C26242Cvf.A00(r2)
            goto L_0x174e
        L_0x1757:
            r2 = 99
            java.lang.String r3 = r0.A0D(r2)
            if (r3 != 0) goto L_0x1761
            java.lang.String r3 = "v1"
        L_0x1761:
            java.lang.String r2 = "v2"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x19f2
            java.lang.String r11 = "ListCollectionMeasureV2Helper"
            r8 = 1
            int r3 = X.C24520C7o.A00(r0)
            r2 = 63
            boolean r10 = r0.A0I(r2, r5)
            int r9 = android.view.View.MeasureSpec.getMode(r6)
            int r2 = android.view.View.MeasureSpec.getMode(r7)
            if (r10 != 0) goto L_0x1784
            if (r3 != r12) goto L_0x17dc
            if (r9 != 0) goto L_0x17df
        L_0x1784:
            r17 = 1
        L_0x1786:
            if (r10 != 0) goto L_0x178c
            if (r3 != r12) goto L_0x17d6
            if (r2 != 0) goto L_0x17d9
        L_0x178c:
            r16 = 1
        L_0x178e:
            if (r17 != 0) goto L_0x1793
            r14 = 0
            if (r16 == 0) goto L_0x1794
        L_0x1793:
            r14 = 1
        L_0x1794:
            X.CYA r29 = new X.CYA
            r2 = r29
            r2.<init>(r1, r0)
            java.util.List r2 = r0.A0E()
            java.util.ArrayList r9 = X.AnonymousClass000.A14(r2)
            java.util.Iterator r13 = r2.iterator()
        L_0x17a7:
            boolean r2 = r13.hasNext()
            if (r2 == 0) goto L_0x17e2
            X.DFL r12 = X.BE8.A0R(r13)
            r23 = r6
            if (r3 != r8) goto L_0x17b7
            r23 = r7
        L_0x17b7:
            r24 = r7
            if (r3 != r8) goto L_0x17bd
            r24 = r6
        L_0x17bd:
            r25 = r17 ^ 1
            r18 = r29
            r19 = r1
            r20 = r12
            r21 = r0
            r22 = r3
            X.0CC r10 = X.C26232CvO.A03(r18, r19, r20, r21, r22, r23, r24, r25)
            X.DFE r2 = new X.DFE
            r2.<init>(r10, r12)
            r9.add(r2)
            goto L_0x17a7
        L_0x17d6:
            if (r9 != 0) goto L_0x17d9
            goto L_0x178c
        L_0x17d9:
            r16 = 0
            goto L_0x178e
        L_0x17dc:
            if (r2 != 0) goto L_0x17df
            goto L_0x1784
        L_0x17df:
            r17 = 0
            goto L_0x1786
        L_0x17e2:
            r10 = 73
            if (r14 != 0) goto L_0x1808
            int r6 = android.view.View.MeasureSpec.getSize(r6)
            int r2 = android.view.View.MeasureSpec.getSize(r7)
            int r1 = r0.A04
            boolean r0 = r0.A0I(r10, r5)
            X.0HH r3 = X.AnonymousClass0PG.A01(r9, r1, r0)
        L_0x17f8:
            X.CPf r0 = new X.CPf
            r0.<init>(r9, r6, r2)
            X.BVA r1 = new X.BVA
            r1.<init>(r3, r0)
            X.0YI r0 = new X.0YI
            r0.<init>(r4, r1, r6, r2)
            return r0
        L_0x1808:
            r13 = 55
            r12 = 0
            java.lang.String r2 = r0.A0D(r13)     // Catch:{ 9HX -> 0x1818 }
            if (r2 != 0) goto L_0x1813
            r10 = 0
            goto L_0x182d
        L_0x1813:
            float r10 = X.A90.A01(r2)     // Catch:{ 9HX -> 0x1818 }
            goto L_0x182d
        L_0x1818:
            java.lang.StringBuilder r10 = X.AnonymousClass000.A10()
            java.lang.String r2 = "Invalid format for spacing-after: "
            r10.append(r2)
            java.lang.String r2 = r0.A0D(r13)
            java.lang.String r2 = X.AnonymousClass000.A0y(r2, r10)
            X.C25913CoX.A01(r11, r2)
            r10 = 0
        L_0x182d:
            r14 = 56
            java.lang.String r2 = r0.A0D(r14)     // Catch:{ 9HX -> 0x183c }
            if (r2 != 0) goto L_0x1837
            r13 = 0
            goto L_0x1851
        L_0x1837:
            float r13 = X.A90.A01(r2)     // Catch:{ 9HX -> 0x183c }
            goto L_0x1851
        L_0x183c:
            java.lang.StringBuilder r13 = X.AnonymousClass000.A10()
            java.lang.String r2 = "Invalid format for spacing-before: "
            r13.append(r2)
            java.lang.String r2 = r0.A0D(r14)
            java.lang.String r2 = X.AnonymousClass000.A0y(r2, r13)
            X.C25913CoX.A01(r11, r2)
            r13 = 0
        L_0x1851:
            r15 = 44
            java.lang.String r2 = r0.A0D(r15)     // Catch:{ 9HX -> 0x185e }
            if (r2 == 0) goto L_0x1872
            float r12 = X.A90.A01(r2)     // Catch:{ 9HX -> 0x185e }
            goto L_0x1872
        L_0x185e:
            java.lang.StringBuilder r14 = X.AnonymousClass000.A10()
            java.lang.String r2 = "Invalid format for item-spacing: "
            r14.append(r2)
            java.lang.String r2 = r0.A0D(r15)
            java.lang.String r2 = X.AnonymousClass000.A0y(r2, r14)
            X.C25913CoX.A01(r11, r2)
        L_0x1872:
            int r2 = (int) r13
            r28 = r2
            int r2 = (int) r12
            r27 = r2
            int r2 = (int) r10
            r26 = r2
            r14 = r16
            if (r3 != r8) goto L_0x1881
            r14 = r17
        L_0x1881:
            if (r3 != r8) goto L_0x1885
            r17 = r16
        L_0x1885:
            r12 = 0
            r25 = 0
            r24 = 1
            if (r3 != 0) goto L_0x1890
            r25 = 1
            r24 = 0
        L_0x1890:
            int r23 = android.view.View.MeasureSpec.getMode(r6)
            int r22 = android.view.View.MeasureSpec.getMode(r7)
            r2 = 2
            int[] r11 = new int[r2]
            r11 = {-1, -1} // fill-array
            r10 = 2147483647(0x7fffffff, float:NaN)
            if (r23 == 0) goto L_0x19da
            int r13 = android.view.View.MeasureSpec.getSize(r6)
        L_0x18a7:
            if (r14 != 0) goto L_0x18ab
            r11[r5] = r13
        L_0x18ab:
            if (r22 == 0) goto L_0x18b1
            int r10 = android.view.View.MeasureSpec.getSize(r7)
        L_0x18b1:
            if (r17 != 0) goto L_0x18b5
            r11[r8] = r10
        L_0x18b5:
            r16 = r11[r5]
            r6 = -1
            r2 = r16
            if (r2 <= r6) goto L_0x1907
            r2 = r11[r8]
            if (r2 <= r6) goto L_0x1907
        L_0x18c0:
            r6 = r11[r5]
            java.util.Iterator r15 = r9.iterator()
            r12 = 0
        L_0x18c7:
            boolean r7 = r15.hasNext()
            if (r7 == 0) goto L_0x19df
            java.lang.Object r7 = r15.next()
            int r14 = r12 + 1
            if (r12 < 0) goto L_0x19ed
            X.DFE r7 = (X.DFE) r7
            X.DFL r11 = r7.A01
            r13 = r6
            if (r3 != r8) goto L_0x18dd
            r13 = r2
        L_0x18dd:
            int r7 = X.C24676CEq.A00
            r10 = 1073741824(0x40000000, float:2.0)
            int r21 = android.view.View.MeasureSpec.makeMeasureSpec(r13, r10)
            r7 = r2
            if (r3 != r8) goto L_0x18e9
            r7 = r6
        L_0x18e9:
            int r22 = android.view.View.MeasureSpec.makeMeasureSpec(r7, r10)
            r16 = r29
            r17 = r1
            r18 = r11
            r19 = r0
            r20 = r3
            r23 = r8
            X.0CC r10 = X.C26232CvO.A03(r16, r17, r18, r19, r20, r21, r22, r23)
            X.DFE r7 = new X.DFE
            r7.<init>(r10, r11)
            r9.set(r12, r7)
            r12 = r14
            goto L_0x18c7
        L_0x1907:
            r21 = 0
            r20 = 0
            r19 = 0
            if (r25 == 0) goto L_0x1915
            r21 = r28
            r20 = r27
            r19 = r26
        L_0x1915:
            if (r24 != 0) goto L_0x191d
            r28 = 0
            r27 = 0
            r26 = 0
        L_0x191d:
            r15 = 0
            r14 = 0
            r7 = 0
            r18 = 0
        L_0x1922:
            int r2 = r9.size()
            if (r15 >= r2) goto L_0x1991
            java.lang.Object r2 = r9.get(r15)
            X.0sP r2 = (X.AnonymousClass0sP) r2
            X.DFE r2 = (X.DFE) r2
            X.0CC r2 = r2.A00
            java.lang.Object r2 = r2.A00()
            X.0Mi r2 = (X.C04220Mi) r2
            X.0Mk r2 = r2.A01
            r30 = r2
            boolean r17 = X.AnonymousClass000.A1P(r15)
            int r2 = X.AnonymousClass000.A0Q(r9)
            boolean r16 = X.AnonymousClass000.A1S(r15, r2)
            int r2 = X.BE8.A0B(r30)
            if (r16 == 0) goto L_0x19c2
            if (r17 == 0) goto L_0x1952
            int r2 = r21 + r2
        L_0x1952:
            int r2 = r2 + r20
        L_0x1954:
            int r12 = java.lang.Math.max(r12, r2)
            int r14 = r14 + r2
            r2 = r11[r5]
            if (r2 > r6) goto L_0x1967
            if (r25 == 0) goto L_0x1961
            if (r14 >= r13) goto L_0x1965
        L_0x1961:
            if (r24 == 0) goto L_0x1967
            if (r12 < r13) goto L_0x1967
        L_0x1965:
            r11[r5] = r13
        L_0x1967:
            int r2 = X.BE8.A0A(r30)
            if (r16 == 0) goto L_0x19bb
            if (r17 == 0) goto L_0x1971
            int r2 = r28 + r2
        L_0x1971:
            int r2 = r2 + r27
        L_0x1973:
            int r7 = java.lang.Math.max(r7, r2)
            int r18 = r18 + r2
            if (r22 == 0) goto L_0x1987
            if (r24 == 0) goto L_0x1981
            r2 = r18
            if (r2 >= r10) goto L_0x1985
        L_0x1981:
            if (r25 == 0) goto L_0x1987
            if (r7 < r10) goto L_0x1987
        L_0x1985:
            r11[r8] = r10
        L_0x1987:
            r16 = r11[r5]
            r2 = r16
            if (r2 <= r6) goto L_0x19b7
            r2 = r11[r8]
            if (r2 <= r6) goto L_0x19b7
        L_0x1991:
            r2 = r16
            if (r2 > r6) goto L_0x199c
            if (r23 != 0) goto L_0x19ab
            if (r25 == 0) goto L_0x199a
            r12 = r14
        L_0x199a:
            r11[r5] = r12
        L_0x199c:
            r2 = r11[r8]
            if (r2 > r6) goto L_0x18c0
            if (r22 != 0) goto L_0x19c9
            if (r24 == 0) goto L_0x19a6
            r7 = r18
        L_0x19a6:
            r11[r8] = r7
            r2 = r7
            goto L_0x18c0
        L_0x19ab:
            if (r25 == 0) goto L_0x19b2
            int r12 = java.lang.Math.min(r14, r13)
            goto L_0x199a
        L_0x19b2:
            int r12 = java.lang.Math.min(r12, r13)
            goto L_0x199a
        L_0x19b7:
            int r15 = r15 + 1
            goto L_0x1922
        L_0x19bb:
            if (r17 == 0) goto L_0x19bf
            int r2 = r28 + r2
        L_0x19bf:
            int r2 = r2 + r26
            goto L_0x1973
        L_0x19c2:
            if (r17 == 0) goto L_0x19c6
            int r2 = r21 + r2
        L_0x19c6:
            int r2 = r2 + r19
            goto L_0x1954
        L_0x19c9:
            if (r24 == 0) goto L_0x19d5
            r2 = r18
            int r2 = java.lang.Math.min(r2, r10)
        L_0x19d1:
            r11[r8] = r2
            goto L_0x18c0
        L_0x19d5:
            int r2 = java.lang.Math.min(r7, r10)
            goto L_0x19d1
        L_0x19da:
            r13 = 2147483647(0x7fffffff, float:NaN)
            goto L_0x18a7
        L_0x19df:
            int r3 = r0.A04
            r1 = 73
            boolean r0 = r0.A0I(r1, r5)
            X.0HH r3 = X.AnonymousClass0PG.A01(r9, r3, r0)
            goto L_0x17f8
        L_0x19ed:
            X.AnonymousClass1ZU.A0B()
            r0 = 0
            throw r0
        L_0x19f2:
            r8 = 1
            int r9 = X.C24520C7o.A00(r0)
            java.util.List r3 = r0.A0E()
            X.CW7 r10 = new X.CW7
            r10.<init>(r1, r0)
            java.util.List r2 = r0.A0E()
            java.util.ArrayList r25 = X.AnonymousClass000.A14(r2)
            X.C18070vi.A0b(r3)
            java.util.Iterator r17 = r3.iterator()
        L_0x1a0f:
            boolean r2 = r17.hasNext()
            if (r2 == 0) goto L_0x1ada
            X.DFL r16 = X.BE8.A0R(r17)
            int r13 = android.view.View.MeasureSpec.getSize(r6)
            if (r9 != r8) goto L_0x1ad6
            if (r13 == 0) goto L_0x1ad6
            int r2 = X.C24676CEq.A00
            int r11 = X.BE7.A06(r13)
        L_0x1a27:
            X.DFL r12 = X.BE7.A0P(r16)
            if (r12 == 0) goto L_0x1a70
            int r3 = r12.A05
            r2 = 13366(0x3436, float:1.873E-41)
            if (r3 != r2) goto L_0x1a70
            java.lang.String r12 = X.BE7.A0h(r12)
            if (r9 != 0) goto L_0x1a70
            if (r12 == 0) goto L_0x1a70
            X.Cjs r2 = X.A90.A0A(r12)     // Catch:{ 9HX -> 0x1a61 }
            float r3 = r2.A00     // Catch:{ 9HX -> 0x1a61 }
            java.lang.Integer r2 = r2.A01     // Catch:{ 9HX -> 0x1a61 }
            int r2 = r2.intValue()     // Catch:{ 9HX -> 0x1a61 }
            if (r2 == r5) goto L_0x1a59
            if (r2 != r8) goto L_0x1a70
            float r2 = (float) r13     // Catch:{ 9HX -> 0x1a61 }
            float r3 = r3 * r2
            double r2 = (double) r3     // Catch:{ 9HX -> 0x1a61 }
            r13 = 4636737291354636288(0x4059000000000000, double:100.0)
            double r2 = r2 / r13
            int r13 = (int) r2     // Catch:{ 9HX -> 0x1a61 }
            r2 = 1073741824(0x40000000, float:2.0)
            int r11 = android.view.View.MeasureSpec.makeMeasureSpec(r13, r2)     // Catch:{ 9HX -> 0x1a61 }
            goto L_0x1a70
        L_0x1a59:
            int r3 = (int) r3     // Catch:{ 9HX -> 0x1a61 }
            r2 = 1073741824(0x40000000, float:2.0)
            int r11 = android.view.View.MeasureSpec.makeMeasureSpec(r3, r2)     // Catch:{ 9HX -> 0x1a61 }
            goto L_0x1a70
        L_0x1a61:
            java.lang.StringBuilder r3 = X.AnonymousClass000.A10()
            java.lang.String r2 = "Error parsing style width: "
            java.lang.String r3 = X.AnonymousClass001.A1H(r2, r12, r3)
            java.lang.String r2 = "ListCollectionMeasureHelper"
            X.C25913CoX.A01(r2, r3)
        L_0x1a70:
            int r14 = android.view.View.MeasureSpec.getSize(r7)
            if (r9 == r8) goto L_0x1a91
            if (r14 == 0) goto L_0x1a91
            int r12 = X.BE7.A06(r14)
        L_0x1a7c:
            X.DFL r13 = X.BE7.A0P(r16)
            if (r13 == 0) goto L_0x1ac9
            int r3 = r13.A05
            r2 = 13366(0x3436, float:1.873E-41)
            if (r3 != r2) goto L_0x1ac9
            java.lang.String r13 = X.BE7.A0d(r13)
            if (r9 != r8) goto L_0x1ac9
            if (r13 == 0) goto L_0x1ac9
            goto L_0x1a94
        L_0x1a91:
            int r12 = X.C24676CEq.A00
            goto L_0x1a7c
        L_0x1a94:
            X.Cjs r2 = X.A90.A0A(r13)     // Catch:{ 9HX -> 0x1aba }
            float r3 = r2.A00     // Catch:{ 9HX -> 0x1aba }
            java.lang.Integer r2 = r2.A01     // Catch:{ 9HX -> 0x1aba }
            int r2 = r2.intValue()     // Catch:{ 9HX -> 0x1aba }
            if (r2 == r5) goto L_0x1ab2
            if (r2 != r8) goto L_0x1ac9
            float r2 = (float) r14     // Catch:{ 9HX -> 0x1aba }
            float r3 = r3 * r2
            double r2 = (double) r3     // Catch:{ 9HX -> 0x1aba }
            r14 = 4636737291354636288(0x4059000000000000, double:100.0)
            double r2 = r2 / r14
            int r14 = (int) r2     // Catch:{ 9HX -> 0x1aba }
            r2 = 1073741824(0x40000000, float:2.0)
            int r12 = android.view.View.MeasureSpec.makeMeasureSpec(r14, r2)     // Catch:{ 9HX -> 0x1aba }
            goto L_0x1ac9
        L_0x1ab2:
            int r3 = (int) r3     // Catch:{ 9HX -> 0x1aba }
            r2 = 1073741824(0x40000000, float:2.0)
            int r12 = android.view.View.MeasureSpec.makeMeasureSpec(r3, r2)     // Catch:{ 9HX -> 0x1aba }
            goto L_0x1ac9
        L_0x1aba:
            java.lang.StringBuilder r3 = X.AnonymousClass000.A10()
            java.lang.String r2 = "Error parsing style height: "
            java.lang.String r3 = X.AnonymousClass001.A1H(r2, r13, r3)
            java.lang.String r2 = "ListCollectionMeasureHelper"
            X.C25913CoX.A01(r2, r3)
        L_0x1ac9:
            r2 = r16
            X.DFE r3 = A05(r10, r1, r2, r11, r12)
            r2 = r25
            r2.add(r3)
            goto L_0x1a0f
        L_0x1ad6:
            int r11 = X.C24676CEq.A00
            goto L_0x1a27
        L_0x1ada:
            r1 = 63
            boolean r1 = r0.A0I(r1, r5)
            r1 = r1 ^ 1
            if (r1 == 0) goto L_0x1b0c
            int r10 = android.view.View.MeasureSpec.getMode(r6)
            int r3 = android.view.View.MeasureSpec.getMode(r7)
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = 1073741824(0x40000000, float:2.0)
            if (r10 == r1) goto L_0x1af4
            if (r10 != r2) goto L_0x1b0c
        L_0x1af4:
            if (r3 == r1) goto L_0x1af8
            if (r3 != r2) goto L_0x1b0c
        L_0x1af8:
            r1 = 2
            int[] r12 = new int[r1]
            int r1 = android.view.View.MeasureSpec.getSize(r6)
            r12[r5] = r1
            int r1 = android.view.View.MeasureSpec.getSize(r7)
            r12[r8] = r1
        L_0x1b07:
            if (r12 != 0) goto L_0x1b70
            r1 = 55
            goto L_0x1b0e
        L_0x1b0c:
            r12 = 0
            goto L_0x1b07
        L_0x1b0e:
            java.lang.String r3 = r0.A0D(r1)     // Catch:{ 9HX -> 0x1c75 }
            r1 = 56
            java.lang.String r10 = r0.A0D(r1)     // Catch:{ 9HX -> 0x1c75 }
            r1 = 44
            java.lang.String r2 = r0.A0D(r1)     // Catch:{ 9HX -> 0x1c75 }
            if (r3 != 0) goto L_0x1b21
            goto L_0x1b26
        L_0x1b21:
            float r3 = X.A90.A01(r3)     // Catch:{ 9HX -> 0x1c75 }
            goto L_0x1b27
        L_0x1b26:
            r3 = 0
        L_0x1b27:
            if (r10 != 0) goto L_0x1b47
            r1 = 0
        L_0x1b2a:
            if (r2 != 0) goto L_0x1b42
            r2 = 0
        L_0x1b2d:
            int r1 = (int) r1     // Catch:{ 9HX -> 0x1c75 }
            r24 = r1
            int r1 = (int) r2     // Catch:{ 9HX -> 0x1c75 }
            r23 = r1
            int r1 = (int) r3     // Catch:{ 9HX -> 0x1c75 }
            r22 = r1
            r11 = 0
            r21 = 0
            r20 = 1
            if (r9 != 0) goto L_0x1b4c
            r21 = 1
            r20 = 0
            goto L_0x1b4c
        L_0x1b42:
            float r2 = X.A90.A01(r2)     // Catch:{ 9HX -> 0x1c75 }
            goto L_0x1b2d
        L_0x1b47:
            float r1 = X.A90.A01(r10)     // Catch:{ 9HX -> 0x1c75 }
            goto L_0x1b2a
        L_0x1b4c:
            int r10 = android.view.View.MeasureSpec.getMode(r6)     // Catch:{ 9HX -> 0x1c75 }
            int r9 = android.view.View.MeasureSpec.getMode(r7)     // Catch:{ 9HX -> 0x1c75 }
            r1 = 2
            int[] r12 = new int[r1]     // Catch:{ 9HX -> 0x1c75 }
            r12 = {-1, -1} // fill-array     // Catch:{ 9HX -> 0x1c75 }
            int r13 = android.view.View.MeasureSpec.getSize(r6)     // Catch:{ 9HX -> 0x1c75 }
            r1 = 1073741824(0x40000000, float:2.0)
            if (r10 != r1) goto L_0x1b64
            r12[r5] = r13     // Catch:{ 9HX -> 0x1c75 }
        L_0x1b64:
            int r14 = android.view.View.MeasureSpec.getSize(r7)     // Catch:{ 9HX -> 0x1c75 }
            if (r9 != r1) goto L_0x1b6c
            r12[r8] = r14     // Catch:{ 9HX -> 0x1c75 }
        L_0x1b6c:
            if (r10 != r1) goto L_0x1b8e
            if (r9 != r1) goto L_0x1b8e
        L_0x1b70:
            r6 = r12[r5]
            r7 = r12[r8]
            int r2 = r0.A04
            r1 = 73
            boolean r1 = r0.A0I(r1, r5)
            r0 = r25
            X.0HH r3 = X.AnonymousClass0PG.A01(r0, r2, r1)
            X.CPf r2 = new X.CPf
            r2.<init>(r0, r6, r7)
            X.BVA r1 = new X.BVA
            r1.<init>(r3, r2)
            goto L_0x1c6f
        L_0x1b8e:
            r19 = 0
            r18 = 0
            r17 = 0
            if (r21 == 0) goto L_0x1b9c
            r19 = r24
            r18 = r23
            r17 = r22
        L_0x1b9c:
            if (r20 != 0) goto L_0x1ba4
            r24 = 0
            r23 = 0
            r22 = 0
        L_0x1ba4:
            r7 = 0
            r6 = 0
            r3 = 0
            r2 = 0
        L_0x1ba8:
            int r1 = r25.size()     // Catch:{ 9HX -> 0x1c75 }
            if (r7 >= r1) goto L_0x1c29
            r1 = r25
            java.lang.Object r1 = r1.get(r7)     // Catch:{ 9HX -> 0x1c75 }
            X.0sP r1 = (X.AnonymousClass0sP) r1     // Catch:{ 9HX -> 0x1c75 }
            X.DFE r1 = (X.DFE) r1     // Catch:{ 9HX -> 0x1c75 }
            X.0CC r1 = r1.A00     // Catch:{ 9HX -> 0x1c75 }
            java.lang.Object r1 = r1.A00()     // Catch:{ 9HX -> 0x1c75 }
            X.0Mi r1 = (X.C04220Mi) r1     // Catch:{ 9HX -> 0x1c75 }
            X.0Mk r1 = r1.A01     // Catch:{ 9HX -> 0x1c75 }
            r26 = r1
            boolean r16 = X.AnonymousClass000.A1P(r7)
            int r1 = X.AnonymousClass000.A0Q(r25)     // Catch:{ 9HX -> 0x1c75 }
            boolean r15 = X.AnonymousClass000.A1S(r7, r1)
            int r1 = X.BE8.A0B(r26)     // Catch:{ 9HX -> 0x1c75 }
            if (r15 == 0) goto L_0x1bdd
            if (r16 == 0) goto L_0x1bda
            int r1 = r19 + r1
        L_0x1bda:
            int r1 = r1 + r18
            goto L_0x1be3
        L_0x1bdd:
            if (r16 == 0) goto L_0x1be1
            int r1 = r19 + r1
        L_0x1be1:
            int r1 = r1 + r17
        L_0x1be3:
            int r11 = java.lang.Math.max(r11, r1)     // Catch:{ 9HX -> 0x1c75 }
            int r6 = r6 + r1
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r10 != r1) goto L_0x1bf6
            if (r21 == 0) goto L_0x1bf0
            if (r6 >= r13) goto L_0x1bf4
        L_0x1bf0:
            if (r20 == 0) goto L_0x1bf6
            if (r11 < r13) goto L_0x1bf6
        L_0x1bf4:
            r12[r5] = r13     // Catch:{ 9HX -> 0x1c75 }
        L_0x1bf6:
            int r1 = X.BE8.A0A(r26)     // Catch:{ 9HX -> 0x1c75 }
            if (r15 == 0) goto L_0x1c03
            if (r16 == 0) goto L_0x1c00
            int r1 = r1 + r24
        L_0x1c00:
            int r1 = r1 + r23
            goto L_0x1c09
        L_0x1c03:
            if (r16 == 0) goto L_0x1c07
            int r1 = r1 + r24
        L_0x1c07:
            int r1 = r1 + r22
        L_0x1c09:
            int r3 = java.lang.Math.max(r3, r1)     // Catch:{ 9HX -> 0x1c75 }
            int r2 = r2 + r1
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r9 != r1) goto L_0x1c1c
            if (r20 == 0) goto L_0x1c16
            if (r2 >= r14) goto L_0x1c1a
        L_0x1c16:
            if (r21 == 0) goto L_0x1c1c
            if (r3 < r14) goto L_0x1c1c
        L_0x1c1a:
            r12[r8] = r14     // Catch:{ 9HX -> 0x1c75 }
        L_0x1c1c:
            r15 = r12[r5]     // Catch:{ 9HX -> 0x1c75 }
            r1 = -1
            if (r15 <= r1) goto L_0x1c26
            r15 = r12[r8]     // Catch:{ 9HX -> 0x1c75 }
            if (r15 <= r1) goto L_0x1c26
            goto L_0x1c29
        L_0x1c26:
            int r7 = r7 + 1
            goto L_0x1ba8
        L_0x1c29:
            if (r10 != 0) goto L_0x1c2f
            if (r21 == 0) goto L_0x1c3e
            r11 = r6
            goto L_0x1c3e
        L_0x1c2f:
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r10 != r1) goto L_0x1c40
            if (r21 == 0) goto L_0x1c3a
            int r11 = java.lang.Math.min(r6, r13)     // Catch:{ 9HX -> 0x1c75 }
            goto L_0x1c3e
        L_0x1c3a:
            int r11 = java.lang.Math.min(r11, r13)     // Catch:{ 9HX -> 0x1c75 }
        L_0x1c3e:
            r12[r5] = r11     // Catch:{ 9HX -> 0x1c75 }
        L_0x1c40:
            if (r9 != 0) goto L_0x1c49
            if (r20 == 0) goto L_0x1c45
            r3 = r2
        L_0x1c45:
            r12[r8] = r3     // Catch:{ 9HX -> 0x1c75 }
            goto L_0x1b70
        L_0x1c49:
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r9 != r1) goto L_0x1b70
            if (r20 == 0) goto L_0x1c50
            goto L_0x1c55
        L_0x1c50:
            int r1 = java.lang.Math.min(r3, r14)     // Catch:{ 9HX -> 0x1c75 }
            goto L_0x1c59
        L_0x1c55:
            int r1 = java.lang.Math.min(r2, r14)     // Catch:{ 9HX -> 0x1c75 }
        L_0x1c59:
            r12[r8] = r1     // Catch:{ 9HX -> 0x1c75 }
            goto L_0x1b70
        L_0x1c5d:
            int r2 = r0.A04
            r1 = 73
            boolean r1 = r0.A0I(r1, r5)
            r0 = r31
            X.AnonymousClass0PG.A01(r0, r2, r1)
            X.BVB r1 = new X.BVB
            r1.<init>(r0, r3, r6, r7)
        L_0x1c6f:
            X.0YI r0 = new X.0YI
            r0.<init>(r4, r1, r6, r7)
            return r0
        L_0x1c75:
            java.lang.String r0 = "Invalid pixel format for Collection spacing"
            java.lang.RuntimeException r0 = X.AnonymousClass8BR.A0w(r0)
            throw r0
        L_0x1c7c:
            java.lang.Object[] r1 = X.AnonymousClass3MW.A1a()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
            r3 = 0
            r1[r3] = r0
            java.lang.String r0 = "Attempting to calculateLayoutForComponent for unrecognized component style id %s"
            java.lang.String r1 = java.lang.String.format(r0, r1)
            java.lang.String r0 = "ComponentMapper"
            X.C25913CoX.A01(r0, r1)
            int r0 = android.view.View.MeasureSpec.getMode(r6)
            r2 = 1073741824(0x40000000, float:2.0)
            if (r0 != r2) goto L_0x1cad
            int r1 = android.view.View.MeasureSpec.getSize(r6)
        L_0x1c9e:
            int r0 = android.view.View.MeasureSpec.getMode(r7)
            if (r0 != r2) goto L_0x1ca8
            int r3 = android.view.View.MeasureSpec.getSize(r7)
        L_0x1ca8:
            X.0YI r0 = A04(r4, r1, r3)
            return r0
        L_0x1cad:
            r1 = 0
            goto L_0x1c9e
        L_0x1caf:
            r1 = 45
            java.lang.String r1 = r0.A0D(r1)     // Catch:{ 9HX -> 0x1cf1 }
            if (r1 != 0) goto L_0x1cb8
            goto L_0x1cbd
        L_0x1cb8:
            float r1 = X.A90.A01(r1)     // Catch:{ 9HX -> 0x1cf1 }
            goto L_0x1cbf
        L_0x1cbd:
            r1 = 1183252480(0x46870000, float:17280.0)
        L_0x1cbf:
            int r5 = (int) r1     // Catch:{ 9HX -> 0x1cf1 }
            r1 = 40
            java.lang.String r0 = r0.A0D(r1)     // Catch:{ 9HX -> 0x1ceb }
            if (r0 != 0) goto L_0x1cc9
            goto L_0x1cce
        L_0x1cc9:
            float r0 = X.A90.A01(r0)     // Catch:{ 9HX -> 0x1ceb }
            goto L_0x1cd0
        L_0x1cce:
            r0 = 1183252480(0x46870000, float:17280.0)
        L_0x1cd0:
            int r2 = (int) r0
            int[] r3 = X.C108945cZ.A1W()
            int r0 = A02(r5, r6)
            r1 = 0
            r3[r1] = r0
            int r2 = A02(r2, r7)
            r0 = 1
            r3[r0] = r2
            r1 = r3[r1]
            X.0YI r0 = new X.0YI
            r0.<init>(r4, r3, r1, r2)
            return r0
        L_0x1ceb:
            r0 = move-exception
            java.lang.RuntimeException r0 = X.AnonymousClass8BR.A0x(r0)
            throw r0
        L_0x1cf1:
            r0 = move-exception
            java.lang.RuntimeException r0 = X.AnonymousClass8BR.A0x(r0)
            throw r0
        L_0x1cf7:
            X.Cqj r5 = r2.A02
            java.lang.Object r3 = A07(r1, r4)
            X.03P r3 = (X.AnonymousClass03P) r3
            java.lang.Object r2 = r1.A03
            X.DOZ r2 = (X.DOZ) r2
            if (r2 == 0) goto L_0x1d1c
            android.text.SpannableStringBuilder r1 = X.C25914CoY.A00(r2, r0)
            X.C25914CoY.A01(r1, r3, r2, r0, r5)
            r3.measure(r6, r7)
            int r1 = r3.getMeasuredWidth()
            int r0 = r3.getMeasuredHeight()
            X.0YI r0 = A04(r4, r1, r0)
            return r0
        L_0x1d1c:
            java.lang.String r0 = "Cannot measure WaRichTextComponent's render unit with a null BloksContext"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0k(r0)
            throw r0
        L_0x1d23:
            X.Cqj r2 = r2.A02
            java.lang.Object r5 = A07(r1, r4)
            android.view.View r5 = (android.view.View) r5
            java.lang.Object r1 = r1.A03
            X.DOZ r1 = (X.DOZ) r1
            if (r1 == 0) goto L_0x1d51
            r3 = 0
            X.AnonymousClass9PZ.A00(r5, r1, r0, r2)
            r5.measure(r6, r7)
            int r2 = r5.getMeasuredWidth()
            int r1 = r5.getMeasuredHeight()
            r0 = 2131434428(0x7f0b1bbc, float:1.849067E38)
            android.view.View r0 = X.AnonymousClass1HF.A06(r5, r0)
            androidx.recyclerview.widget.RecyclerView r0 = (androidx.recyclerview.widget.RecyclerView) r0
            r0.setAdapter(r3)
            X.0YI r0 = A04(r4, r2, r1)
            return r0
        L_0x1d51:
            java.lang.String r0 = "Cannot measure WaRcListViewBinderUtil's render unit with a null BloksContext"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0k(r0)
            throw r0
        L_0x1d58:
            java.lang.Object r5 = A07(r1, r4)
            android.view.View r5 = (android.view.View) r5
            java.lang.Object r3 = r1.A03
            X.DOZ r3 = (X.DOZ) r3
            if (r3 == 0) goto L_0x1d82
            java.lang.String r2 = ""
            r1 = 50
            java.lang.String r1 = r0.A0D(r1)
            if (r1 == 0) goto L_0x1d6f
            r2 = r1
        L_0x1d6f:
            X.C20014A3g.A01(r5, r3, r0, r2)
            r5.measure(r6, r7)
            int r1 = r5.getMeasuredWidth()
            int r0 = r5.getMeasuredHeight()
            X.0YI r0 = A04(r4, r1, r0)
            return r0
        L_0x1d82:
            java.lang.String r0 = "Cannot measure WaRcFormInputComponentBinderUtils's render unit with a null BloksContext"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0k(r0)
            throw r0
        L_0x1d89:
            java.lang.Object r1 = A07(r1, r4)
            android.view.View r1 = (android.view.View) r1
            r1.measure(r6, r7)
            int[] r3 = X.C108945cZ.A1W()
            int r0 = r1.getMeasuredWidth()
            r2 = 0
            r3[r2] = r0
            int r1 = r1.getMeasuredHeight()
            r0 = 1
            r3[r0] = r1
            r0 = r3[r2]
            X.0YI r0 = A04(r4, r0, r1)
            return r0
        L_0x1dab:
            android.util.DisplayMetrics r1 = X.C108965cb.A07()
            int[] r3 = X.C108945cZ.A1W()
            int r0 = r1.widthPixels
            int r0 = A02(r0, r6)
            r2 = 0
            r3[r2] = r0
            int r0 = r1.heightPixels
            int r1 = A02(r0, r7)
            r0 = 1
            r3[r0] = r1
            r0 = r3[r2]
            X.0YI r0 = A04(r4, r0, r1)
            return r0
        L_0x1dcc:
            X.Cqj r10 = r2.A02
            java.lang.Object r5 = A07(r1, r4)
            android.view.View r5 = (android.view.View) r5
            long r1 = X.AnonymousClass9PY.A00(r0)
            int[] r14 = X.C108945cZ.A1W()
            r12 = 0
            r11 = 1
            r9 = 0
            int r3 = (r1 > r12 ? 1 : (r1 == r12 ? 0 : -1))
            if (r3 <= 0) goto L_0x1e28
            java.lang.String r3 = X.BE7.A0f(r0)
            r0 = 2131435598(0x7f0b204e, float:1.8493043E38)
            android.widget.TextView r0 = X.AnonymousClass3MW.A0J(r5, r0)
            r0.setText(r3)
            r0 = 2131436203(0x7f0b22ab, float:1.849427E38)
            android.widget.TextView r8 = X.AnonymousClass3MW.A0J(r5, r0)
            X.0vb r3 = r10.A04
            r0 = 0
            java.lang.String r0 = X.C64052u8.A0D(r3, r0, r1)
            r8.setText(r0)
            r5.measure(r6, r7)
            int r0 = r5.getMeasuredWidth()
            r14[r9] = r0
            int r0 = r5.getMeasuredHeight()
            r14[r11] = r0
            r0 = 2131435598(0x7f0b204e, float:1.8493043E38)
            android.widget.TextView r0 = X.AnonymousClass3MW.A0J(r5, r0)
            java.lang.String r1 = ""
            r0.setText(r1)
            r0 = 2131436203(0x7f0b22ab, float:1.849427E38)
            android.widget.TextView r0 = X.AnonymousClass3MW.A0J(r5, r0)
            r0.setText(r1)
        L_0x1e28:
            r1 = r14[r9]
            r0 = r14[r11]
            X.0YI r0 = A04(r4, r1, r0)
            return r0
        L_0x1e31:
            r0 = 2
            X.C18070vi.A0d(r4, r0)
            android.content.Context r0 = r1.A02
            android.util.DisplayMetrics r0 = X.C108965cb.A08(r0)
            X.C18070vi.A0X(r0)
            r2 = 1106247680(0x41f00000, float:30.0)
            int r0 = r0.densityDpi
            float r1 = (float) r0
            r0 = 1126170624(0x43200000, float:160.0)
            float r1 = r1 / r0
            float r2 = r2 * r1
            int r2 = X.C22339B3q.A01(r2)
            r0 = 1135312896(0x43ab8000, float:343.0)
            float r0 = r0 * r1
            int r0 = X.C22339B3q.A01(r0)
            int r1 = A01(r6, r0)
            int r0 = A01(r7, r2)
            X.0YI r0 = A04(r4, r1, r0)
            return r0
        L_0x1e60:
            r0 = 0
            int r1 = A01(r6, r0)
            int r0 = A01(r7, r0)
            X.0YI r0 = A04(r4, r1, r0)
            return r0
        L_0x1e6e:
            r0 = 2
            X.C18070vi.A0d(r4, r0)
            r0 = 0
            int r1 = A01(r6, r0)
            int r0 = A01(r7, r0)
            X.0YI r0 = A04(r4, r1, r0)
            return r0
        L_0x1e80:
            r0 = 2147483647(0x7fffffff, float:NaN)
            int r1 = A02(r0, r6)
            int r0 = A02(r0, r7)
            X.0YI r0 = A04(r4, r1, r0)
            return r0
        L_0x1e90:
            r0 = 2
            X.C18070vi.A0d(r4, r0)
            int r1 = android.view.View.MeasureSpec.getSize(r6)
            int r0 = android.view.View.MeasureSpec.getSize(r7)
            X.0YI r0 = A04(r4, r1, r0)
            return r0
        L_0x1ea1:
            r0 = 2147483647(0x7fffffff, float:NaN)
            int r3 = A02(r0, r6)
            int r2 = A02(r0, r7)
            r0 = 0
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>(r0, r0, r3, r2)
            X.0YI r0 = new X.0YI
            r0.<init>(r4, r1, r3, r2)
            return r0
        L_0x1eb8:
            r2 = 1
            r1 = 0
            X.0YI r0 = new X.0YI
            r0.<init>(r4, r1, r2, r2)
            return r0
        L_0x1ec0:
            int[] r3 = X.C108945cZ.A1W()
            r1 = 0
            int r0 = A01(r6, r1)
            r3[r1] = r0
            int r2 = A01(r7, r1)
            r0 = 1
            r3[r0] = r2
            r1 = r3[r1]
            X.0YI r0 = new X.0YI
            r0.<init>(r4, r3, r1, r2)
            return r0
        L_0x1eda:
            r0 = 2
            X.C18070vi.A0d(r4, r0)
            android.content.Context r0 = r1.A02
            android.util.DisplayMetrics r1 = X.C108965cb.A08(r0)
            X.C18070vi.A0X(r1)
            int r0 = android.view.View.MeasureSpec.getMode(r7)
            if (r0 != 0) goto L_0x1f08
            r2 = 1112539136(0x42500000, float:52.0)
            int r0 = r1.densityDpi
            float r1 = (float) r0
            r0 = 1126170624(0x43200000, float:160.0)
            float r1 = r1 / r0
            float r2 = r2 * r1
            int r2 = X.C22339B3q.A01(r2)
        L_0x1efa:
            r0 = 0
            int r1 = A01(r6, r0)
            int r0 = A01(r7, r2)
            X.0YI r0 = A04(r4, r1, r0)
            return r0
        L_0x1f08:
            r2 = 50
            goto L_0x1efa
        L_0x1f0b:
            r2 = 36
            X.DFL r5 = r0.A09(r2)
            if (r5 == 0) goto L_0x1f66
            int r2 = android.view.View.MeasureSpec.getSize(r7)
            r8 = -2147483648(0xffffffff80000000, float:-0.0)
            int r3 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r8)
            r2 = 40
            X.DFL r0 = r0.A09(r2)
            if (r0 == 0) goto L_0x1f64
            X.0tS r10 = r0.BDo(r1, r6, r3)
            X.C18070vi.A0X(r10)
            r12 = 0
            long r13 = X.C02740Fe.A00(r6, r3)
            r9 = r1
            r11 = r0
            X.0Mi r3 = X.AnonymousClass0OS.A00(r9, r10, r11, r12, r13)
        L_0x1f37:
            int r2 = android.view.View.MeasureSpec.getSize(r7)
            if (r3 == 0) goto L_0x1f62
            X.0Mk r0 = r3.A01
            int r13 = X.BE8.A0A(r0)
        L_0x1f43:
            int r2 = r2 - r13
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r8)
            X.0tS r7 = r5.BDo(r1, r6, r0)
            X.C18070vi.A0X(r7)
            int r10 = android.view.View.MeasureSpec.getSize(r6)
            int r11 = r7.getHeight()
            int r11 = r11 + r13
            r12 = 0
            X.DFK r0 = new X.DFK
            r6 = r0
            r8 = r4
            r9 = r3
            r6.<init>(r7, r8, r9, r10, r11, r12, r13)
            return r0
        L_0x1f62:
            r13 = 0
            goto L_0x1f43
        L_0x1f64:
            r3 = 0
            goto L_0x1f37
        L_0x1f66:
            java.lang.String r0 = "bk.cds.bottomsheet.Wrapper has no content."
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0n(r0)
            throw r0
        L_0x1f6d:
            java.lang.Object r3 = r1.A03
            java.lang.String r2 = "Required value was null."
            if (r3 == 0) goto L_0x1f89
            X.DOZ r3 = (X.DOZ) r3
            java.lang.Object r0 = X.BE9.A0l(r3, r0)
            X.CMZ r0 = (X.CMZ) r0
            X.0YK r0 = r0.A00
            if (r0 == 0) goto L_0x1f84
            X.0tS r0 = r0.BDo(r1, r6, r7)
            return r0
        L_0x1f84:
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0k(r2)
            throw r0
        L_0x1f89:
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0k(r2)
            throw r0
        L_0x1f8e:
            if (r55 == 0) goto L_0x1fab
            java.lang.Object r2 = A07(r1, r4)
            java.lang.String r0 = "null cannot be cast to non-null type android.view.View"
            X.C18070vi.A0z(r2, r0)
            android.view.View r2 = (android.view.View) r2
            r2.measure(r6, r7)
            int r1 = r2.getMeasuredWidth()
            int r0 = r2.getMeasuredHeight()
            X.0YI r0 = A04(r4, r1, r0)
            return r0
        L_0x1fab:
            java.lang.String r0 = "A render unit was defined for this node but none was found"
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0n(r0)
            throw r0
        L_0x1fb2:
            X.Cqj r8 = r2.A02
            java.lang.Object r2 = r1.A03
            if (r2 == 0) goto L_0x209b
            if (r8 == 0) goto L_0x209b
            android.content.Context r2 = r1.A02
            r1 = 2131624282(0x7f0e015a, float:1.887574E38)
            r10 = 0
            android.view.View r3 = android.view.View.inflate(r2, r1, r10)
            r1 = 52
            r2 = 1
            r0.A0I(r1, r2)
            r1 = 56
            r0.A0I(r1, r2)
            r5 = 59
            r1 = 0
            r0.A0I(r5, r1)
            r5 = 44
            java.util.List r0 = r0.A0G(r5)
            java.util.Iterator r15 = r0.iterator()
            r14 = 0
            r13 = 0
            r12 = 0
        L_0x1fe2:
            boolean r0 = r15.hasNext()
            if (r0 == 0) goto L_0x2011
            X.DFL r11 = X.BE6.A0d(r15)
            java.lang.String r5 = "regular"
            java.lang.String r0 = X.BE7.A0e(r11)
            if (r0 == 0) goto L_0x1ff5
            r5 = r0
        L_0x1ff5:
            java.lang.String r0 = "hd"
            boolean r9 = r5.equals(r0)
            r5 = 35
            r0 = 41
            if (r9 == 0) goto L_0x2091
            android.net.Uri r14 = X.BEA.A0K(r11)
        L_0x2005:
            int r13 = r11.A04(r0, r1)
            int r12 = r11.A04(r5, r1)
        L_0x200d:
            if (r14 == 0) goto L_0x1fe2
            if (r10 == 0) goto L_0x1fe2
        L_0x2011:
            if (r3 == 0) goto L_0x2017
            if (r10 != 0) goto L_0x2036
            if (r14 != 0) goto L_0x2036
        L_0x2017:
            r3.measure(r6, r7)
            int[] r5 = X.C108945cZ.A1W()
            int r0 = r3.getMeasuredWidth()
            r5[r1] = r0
            int r0 = r3.getMeasuredHeight()
            r5[r2] = r0
            r8.A02(r3)
            r1 = r5[r1]
            r0 = r5[r2]
            X.0YI r0 = A04(r4, r1, r0)
            return r0
        L_0x2036:
            r0 = 2131436764(0x7f0b24dc, float:1.8495408E38)
            android.view.View r0 = r3.findViewById(r0)
            com.whatsapp.videoplayback.BloksVideoPlayerView r0 = (com.whatsapp.videoplayback.BloksVideoPlayerView) r0
            if (r14 != 0) goto L_0x2043
            if (r10 == 0) goto L_0x2017
        L_0x2043:
            X.70X r10 = r0.A0A
            if (r10 != 0) goto L_0x2083
            X.190 r12 = r0.getCrashLogs()
            X.1KB r13 = r0.getGlobalUI()
            X.11C r14 = r0.getSystemServices()
            android.app.Activity r11 = X.AnonymousClass3Ma.A05(r0)
            X.118 r15 = r0.getWaContext()
            X.0ve r16 = r0.getAbProps()
            X.6Mx r9 = X.BEB.A0Q(r0)
            X.10I r18 = r0.getWaWorkers()
            X.00H r5 = r0.getHeroSettingProvider()
            java.lang.Object r5 = r5.get()
            X.6gC r5 = (X.AnonymousClass6gC) r5
            r19 = 0
            r20 = r1
            X.6Mr r10 = new X.6Mr
            r21 = r1
            r17 = r5
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            r10.A0f(r9)
            r0.A0A = r10
        L_0x2083:
            android.view.View r10 = r10.A09()
            r9 = -1
            android.widget.FrameLayout$LayoutParams r5 = new android.widget.FrameLayout$LayoutParams
            r5.<init>(r9, r9)
            r0.addView(r10, r1, r5)
            goto L_0x2017
        L_0x2091:
            android.net.Uri r10 = X.BEA.A0K(r11)
            if (r13 == 0) goto L_0x2005
            if (r12 != 0) goto L_0x200d
            goto L_0x2005
        L_0x209b:
            java.lang.String r0 = "Cannot measure BKVideoComponentBinderUtils's render unit with a null BloksContext or WaBkComponentConfigurator"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0k(r0)
            throw r0
        L_0x20a2:
            X.Cqj r5 = r2.A02
            java.lang.Object r3 = r1.A03
            X.DOZ r3 = (X.DOZ) r3
            if (r3 == 0) goto L_0x20d2
            if (r55 == 0) goto L_0x20d2
            java.lang.Object r2 = A07(r1, r4)
            android.view.View r2 = (android.view.View) r2
            X.C123746Vr.A00(r2, r3, r0, r5)
            r2.measure(r6, r7)
            int[] r3 = X.C108945cZ.A1W()
            int r0 = r2.getMeasuredWidth()
            r1 = 0
            r3[r1] = r0
            int r2 = r2.getMeasuredHeight()
            r0 = 1
            r3[r0] = r2
            r1 = r3[r1]
            X.0YI r0 = new X.0YI
            r0.<init>(r4, r3, r1, r2)
            return r0
        L_0x20d2:
            java.lang.String r0 = "Cannot measure WaRcCheckBoxComponentBinderUtils's render unit with a null BloksContext or RenderUnit"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0k(r0)
            throw r0
        L_0x20d9:
            X.Cqj r3 = r2.A02
            android.content.Context r2 = r1.A02
            com.whatsapp.TextEmojiLabel r5 = new com.whatsapp.TextEmojiLabel
            r5.<init>(r2)
            java.lang.Object r1 = r1.A03
            X.DOZ r1 = (X.DOZ) r1
            if (r1 == 0) goto L_0x2107
            X.CCX.A00(r5, r1, r0, r3)
            r5.measure(r6, r7)
            int[] r3 = X.C108945cZ.A1W()
            int r0 = r5.getMeasuredWidth()
            r2 = 0
            r3[r2] = r0
            int r1 = r5.getMeasuredHeight()
            r0 = 1
            r3[r0] = r1
            r0 = r3[r2]
            X.0YI r0 = A04(r4, r0, r1)
            return r0
        L_0x2107:
            java.lang.String r0 = "Cannot measure WaTextWithEntitiesComponent's render unit with a null BloksContext"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0k(r0)
            throw r0
        L_0x210e:
            X.Cqj r8 = r2.A02
            java.lang.Object r2 = r1.A03
            if (r2 == 0) goto L_0x2157
            android.content.Context r2 = r1.A02
            r1 = 2131624299(0x7f0e016b, float:1.8875774E38)
            android.view.View r5 = X.AnonymousClass3MX.A08(r2, r1)
            java.lang.String r3 = X.BE7.A0e(r0)
            r2 = 35
            r1 = 0
            boolean r0 = r0.A0I(r2, r1)
            r8.A03(r5, r3, r0)
            r5.measure(r6, r7)
            int[] r3 = X.C108945cZ.A1W()
            int r0 = r5.getMeasuredWidth()
            r3[r1] = r0
            int r0 = r5.getMeasuredHeight()
            r2 = 1
            r3[r2] = r0
            r0 = 2131436771(0x7f0b24e3, float:1.8495422E38)
            android.view.View r0 = X.AnonymousClass1HF.A06(r5, r0)
            com.whatsapp.videoplayback.VideoSurfaceView r0 = (com.whatsapp.videoplayback.VideoSurfaceView) r0
            r0.A05()
            com.whatsapp.videoplayback.VideoSurfaceView.A03(r0, r1)
            r1 = r3[r1]
            r0 = r3[r2]
            X.0YI r0 = A04(r4, r1, r0)
            return r0
        L_0x2157:
            java.lang.String r0 = "Cannot measure WaRcVideoViewComponentBinderUtils's render unit with a null BloksContext"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0k(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26285Cwg.A0B(X.0IV, X.DFL, X.0Qf, int, int):X.0tS");
    }

    public C26285Cwg() {
    }
}
