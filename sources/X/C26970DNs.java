package X;

import android.animation.Animator;
import android.util.Pair;
import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.DNs  reason: case insensitive filesystem */
public class C26970DNs implements C22415B6x {
    public final ALQ A00 = new Object();

    public static DOZ A07(C23736Boh boh, Object obj) {
        C18070vi.A0d(obj, 0);
        C18070vi.A0d(boh, 1);
        return boh.A00;
    }

    public static C26235CvV A09(C23736Boh boh, CUK cuk, Map map, boolean z, boolean z2) {
        String str;
        CUK cuk2 = cuk;
        DFL dfl = cuk.A00;
        List list = cuk.A0D;
        List list2 = cuk.A0C;
        List list3 = cuk.A0B;
        C25140CZq cZq = cuk.A02;
        List list4 = cuk.A0A;
        List list5 = cuk.A06;
        List list6 = cuk.A09;
        COF cof = cuk.A01;
        if (cof != null) {
            str = cof.A00;
        } else {
            str = null;
        }
        Map map2 = cuk.A0F;
        return A08(boh, dfl, cZq, str, list, list2, list3, list4, list5, list6, cuk2.A0E, map, map2, z, z2);
    }

    public static C26962DNk A0A(C23736Boh boh, C199029zJ r2) {
        return C26272CwJ.A01(A06(boh, r2, 2));
    }

    public static C26962DNk A0B(C23736Boh boh, C199029zJ r2) {
        return C26272CwJ.A01(A06(boh, r2, 3));
    }

    public static DFL A0E(C199029zJ r2, Object obj) {
        C18070vi.A0d(r2, 0);
        C18070vi.A0d(obj, 1);
        Object A002 = r2.A00(0);
        C18070vi.A0z(A002, "null cannot be cast to non-null type com.instagram.common.bloks.component.base.BloksModel");
        return (DFL) A002;
    }

    public static Object A0G(C199029zJ r1) {
        C18070vi.A0d(r1, 0);
        return r1.A00(0);
    }

    public static Object A0H(C199029zJ r2, Object obj) {
        C18070vi.A0d(r2, 0);
        C18070vi.A0d(obj, 1);
        return r2.A00(0);
    }

    public static Object A0I(C199029zJ r2, Object obj) {
        C18070vi.A0d(r2, 0);
        C18070vi.A0d(obj, 1);
        return r2.A00.get(0);
    }

    public static Object A0J(C199029zJ r2, Object obj) {
        C18070vi.A0d(r2, 0);
        C18070vi.A0d(obj, 1);
        return r2.A00.get(1);
    }

    public static String A0K(C199029zJ r1) {
        Object A002 = r1.A00(2);
        C18070vi.A0X(A002);
        return CCF.A00(A002);
    }

    public static String A0N(C199029zJ r2, Object obj) {
        C18070vi.A0d(r2, 0);
        C18070vi.A0d(obj, 1);
        Object A002 = r2.A00(0);
        C18070vi.A0X(A002);
        return CCF.A00(A002);
    }

    public static float A01(C199029zJ r2, int i) {
        Object A002 = r2.A00(i);
        C18070vi.A0z(A002, "null cannot be cast to non-null type kotlin.Number");
        return ((Number) A002).floatValue();
    }

    public static Interpolator A04(DFL dfl) {
        if (dfl == null) {
            return C29111bd.A00(0.0f, 0.0f, 1.0f, 1.0f);
        }
        return C29111bd.A00(dfl.A03(35, 0.0f), dfl.A03(38, 0.0f), dfl.A03(36, 1.0f), dfl.A03(40, 1.0f));
    }

    @Deprecated
    public static DOZ A06(C23736Boh boh, C199029zJ r3, int i) {
        List list = r3.A00;
        if (i < list.size()) {
            Object obj = list.get(i);
            if (obj instanceof DOZ) {
                return (DOZ) obj;
            }
        }
        return boh.A00;
    }

    /* JADX WARNING: type inference failed for: r0v8, types: [java.lang.Object, X.DNb] */
    /* JADX WARNING: type inference failed for: r0v11, types: [java.lang.Object, X.DNb] */
    public static C26235CvV A08(C23736Boh boh, DFL dfl, C25140CZq cZq, String str, List list, List list2, List list3, List list4, List list5, List list6, List list7, Map map, Map map2, boolean z, boolean z2) {
        List list8;
        List list9 = list5;
        List list10 = list6;
        C25140CZq cZq2 = cZq;
        List list11 = list4;
        DFL dfl2 = dfl;
        ArrayList A13 = AnonymousClass000.A13();
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                String A0v = C17880vN.A0v(it);
                Object obj = C25881Cns.A00(boh).A07.get(A0v);
                if (obj != null) {
                    A13.add(obj);
                } else {
                    StringBuilder A10 = AnonymousClass000.A10();
                    A10.append("Data Manifest for referenced internal variable id ");
                    A10.append(A0v);
                    throw AnonymousClass001.A12("\n\nYou are running parseEmbedded without the parent Bloks Context needed to process the data manifests. If you are implementing a new feature, check to makesure you're not calling evaluateWithoutTreeDANGEROUSLY on your signature. Otherwise, this is an infra error that you should post in the Bloks Q&A group about.", AnonymousClass000.A11(AnonymousClass000.A0y(" not found! ", A10)));
                }
            }
        }
        if (list2 != null) {
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                String A0v2 = C17880vN.A0v(it2);
                Map singletonMap = Collections.singletonMap("initial", C25881Cns.A02(boh, A0v2));
                ? obj2 = new Object();
                obj2.A00 = A0v2;
                obj2.A01 = "ls";
                obj2.A02 = singletonMap;
                A13.add(obj2);
            }
        }
        if (map != null) {
            Iterator A15 = AnonymousClass000.A15(map);
            while (A15.hasNext()) {
                Map.Entry A16 = AnonymousClass000.A16(A15);
                List list12 = boh.A06;
                String A002 = C25968Cpa.A00(AnonymousClass00R.A00, C17880vN.A0x(A16), list12, list12.size());
                Map singletonMap2 = Collections.singletonMap("initial", A16.getValue());
                ? obj3 = new Object();
                obj3.A00 = A002;
                obj3.A01 = "ls";
                obj3.A02 = singletonMap2;
                A13.add(obj3);
            }
        }
        HashMap A11 = C17880vN.A11();
        if (list3 != null) {
            Iterator it3 = list3.iterator();
            while (it3.hasNext()) {
                String A0v3 = C17880vN.A0v(it3);
                A11.put(A0v3, A0F(boh, A0v3));
            }
        }
        if (z && dfl2 != null) {
            if (z2) {
                list8 = boh.A06;
            } else {
                list8 = null;
            }
            dfl2 = CC3.A00((E9O) null, new C23715BoM(list8, dfl2, 1), dfl2);
        }
        if (list5 == null) {
            list9 = Collections.EMPTY_LIST;
        }
        if (list6 == null) {
            list10 = Collections.EMPTY_LIST;
        }
        if (cZq == null) {
            cZq2 = CCE.A00(Collections.EMPTY_MAP);
        }
        if (list4 == null) {
            list11 = Collections.EMPTY_LIST;
        }
        return new C26235CvV(dfl2, cZq2, str, A13, list9, list10, list11, list7, A11, map2);
    }

    public static C26963DNl A0C(String str) {
        return new C26963DNl(new C26965DNn(str));
    }

    public static String A0L(C199029zJ r2, int i) {
        Object A002 = r2.A00(i);
        C18070vi.A0z(A002, "null cannot be cast to non-null type kotlin.String");
        return (String) A002;
    }

    public static final String A0O(Object obj) {
        ArrayList arrayList;
        String str;
        String str2;
        if (obj instanceof Map) {
            Map map = (Map) obj;
            arrayList = C17880vN.A0z(map.size());
            Iterator A15 = AnonymousClass000.A15(map);
            while (A15.hasNext()) {
                Map.Entry A16 = AnonymousClass000.A16(A15);
                StringBuilder A10 = AnonymousClass000.A10();
                BE8.A1E(A10, A0O(A16.getKey()));
                A10.append(A0O(A16.getValue()));
                C108955ca.A1U(A10, arrayList);
            }
            str = "{ ";
            str2 = " }";
        } else if (obj instanceof List) {
            Iterable<Object> iterable = (Iterable) obj;
            arrayList = C29351c6.A0D(iterable);
            for (Object A0O : iterable) {
                arrayList.add(A0O(A0O));
            }
            str = "[ ";
            str2 = " ]";
        } else if (!(obj instanceof String)) {
            return String.valueOf(obj);
        } else {
            StringBuilder A102 = AnonymousClass000.A10();
            A102.append('\"');
            A102.append(obj);
            return C17890vO.A0c(A102, '\"');
        }
        return C29431cG.A0g(", ", str, str2, arrayList, (C22821Di) null);
    }

    public static void A0R(C26962DNk dNk, String str, List list) {
        C26965DNn dNn = new C26965DNn(str);
        Pair A0N = C108945cZ.A0N(new C26963DNl(dNn), new C23732Bod(dNn, list));
        dNk.A0A((E6I) A0N.first, (C24477C5s) A0N.second);
    }

    public static Object[] A0S() {
        return null;
    }

    public static float A00(C199029zJ r0, int i) {
        Object A002 = r0.A00(i);
        C18070vi.A0z(A002, "null cannot be cast to non-null type kotlin.Number");
        return ((Number) A002).floatValue();
    }

    public static int A02(C199029zJ r0, int i) {
        Object A002 = r0.A00(i);
        C18070vi.A0z(A002, "null cannot be cast to non-null type kotlin.Number");
        return ((Number) A002).intValue();
    }

    public static Animator A03(C199029zJ r0, int i) {
        Object A002 = r0.A00(i);
        C18070vi.A0z(A002, "null cannot be cast to non-null type android.animation.Animator");
        return (Animator) A002;
    }

    public static C25743ClD A05(C23736Boh boh, DFL dfl, C199029zJ r2, int i) {
        return (C25743ClD) C26272CwJ.A04(A06(boh, r2, i), dfl);
    }

    public static DFL A0D(C199029zJ r0, int i) {
        Object A002 = r0.A00(i);
        C18070vi.A0z(A002, "null cannot be cast to non-null type com.instagram.common.bloks.component.base.BloksModel");
        return (DFL) A002;
    }

    public static COE A0F(C23736Boh boh, String str) {
        COE coe = (COE) C25881Cns.A00(boh).A04.get(str);
        if (coe != null) {
            return coe;
        }
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("Payload for referenced embedded payload id ");
        A10.append(str);
        throw AnonymousClass001.A12("\n\nYou are running parseEmbedded without the parent Bloks Context needed to process the data manifests. If you are implementing a new feature, check to makesure you're not calling evaluateWithoutTreeDANGEROUSLY on your signature. Otherwise, this is an infra error that you should post in the Bloks Q&A group about.", AnonymousClass000.A11(AnonymousClass000.A0y(" not found!", A10)));
    }

    public static String A0M(C199029zJ r0, int i) {
        Object A002 = r0.A00(i);
        C18070vi.A0z(A002, "null cannot be cast to non-null type kotlin.String");
        return (String) A002;
    }

    public static ArrayList A0P(C26962DNk dNk, List list) {
        ArrayList A13 = AnonymousClass000.A13();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C26235CvV cvV = (C26235CvV) it.next();
            if (!dNk.A0N) {
                C26176Ctu.A02("Tree operations are only supported from the UI Thread");
                dNk.A0I.add(cvV);
                C26962DNk.A03(dNk);
            }
            A13.add(cvV.A01);
        }
        return A13;
    }

    public static final void A0Q(DOZ doz, List list) {
        if (C72463Mc.A1Y(DOZ.A00(doz, 2131428162))) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((Animator) it.next()).setDuration(0);
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v2, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v46, resolved type: X.E4R} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v47, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v47, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v345, resolved type: X.BHh} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v53, resolved type: android.animation.ValueAnimator} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v54, resolved type: android.animation.ValueAnimator} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v55, resolved type: android.animation.ValueAnimator} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v56, resolved type: android.animation.ValueAnimator} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v57, resolved type: android.animation.ValueAnimator} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v123, resolved type: X.BNF} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v74, resolved type: X.E4R} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v75, resolved type: X.E4R} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v683, resolved type: X.BNG} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v285, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v286, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v287, resolved type: android.animation.ValueAnimator} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v141, resolved type: X.BNF} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v142, resolved type: X.BNE} */
    /* JADX WARNING: type inference failed for: r3v3 */
    /* JADX WARNING: type inference failed for: r3v4 */
    /* JADX WARNING: type inference failed for: r3v8, types: [android.animation.Animator] */
    /* JADX WARNING: type inference failed for: r3v30, types: [java.lang.Throwable] */
    /* JADX WARNING: type inference failed for: r3v40 */
    /* JADX WARNING: type inference failed for: r3v101, types: [java.lang.Object] */
    /* JADX WARNING: type inference failed for: r3v115 */
    /* JADX WARNING: type inference failed for: r3v119 */
    /* JADX WARNING: type inference failed for: r3v144 */
    /* JADX WARNING: type inference failed for: r12v2, types: [java.lang.Object, X.Bm5, X.Ckp] */
    /* JADX WARNING: type inference failed for: r3v202 */
    /* JADX WARNING: type inference failed for: r3v208 */
    /* JADX WARNING: type inference failed for: r3v217 */
    /* JADX WARNING: type inference failed for: r3v242 */
    /* JADX WARNING: type inference failed for: r3v269 */
    /* JADX WARNING: type inference failed for: r3v285 */
    /* JADX WARNING: type inference failed for: r3v308 */
    /* JADX WARNING: type inference failed for: r3v310 */
    /* JADX WARNING: type inference failed for: r3v317 */
    /* JADX WARNING: type inference failed for: r3v321 */
    /* JADX WARNING: type inference failed for: r23v3, types: [X.CFu, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r3v339 */
    /* JADX WARNING: type inference failed for: r3v344 */
    /* JADX WARNING: type inference failed for: r3v362, types: [X.BoN, X.DFL] */
    /* JADX WARNING: type inference failed for: r3v393 */
    /* JADX WARNING: type inference failed for: r0v624, types: [java.lang.Object, X.COD] */
    /* JADX WARNING: type inference failed for: r3v440, types: [java.util.AbstractMap, java.util.HashMap] */
    /* JADX WARNING: type inference failed for: r3v460 */
    /* JADX WARNING: type inference failed for: r3v466 */
    /* JADX WARNING: type inference failed for: r0v748, types: [X.BLm, X.BMI] */
    /* JADX WARNING: type inference failed for: r3v481 */
    /* JADX WARNING: type inference failed for: r3v522 */
    /* JADX WARNING: type inference failed for: r3v525 */
    /* JADX WARNING: type inference failed for: r3v553 */
    /* JADX WARNING: type inference failed for: r3v567 */
    /* JADX WARNING: type inference failed for: r3v570 */
    /* JADX WARNING: type inference failed for: r3v580 */
    /* JADX WARNING: type inference failed for: r3v619 */
    /* JADX WARNING: type inference failed for: r3v633 */
    /* JADX WARNING: type inference failed for: r3v634 */
    /* JADX WARNING: type inference failed for: r3v635 */
    /* JADX WARNING: type inference failed for: r3v636 */
    /* JADX WARNING: type inference failed for: r3v637 */
    /* JADX WARNING: type inference failed for: r3v638 */
    /* JADX WARNING: type inference failed for: r3v639 */
    /* JADX WARNING: type inference failed for: r3v641 */
    /* JADX WARNING: type inference failed for: r3v642 */
    /* JADX WARNING: type inference failed for: r3v643 */
    /* JADX WARNING: type inference failed for: r3v644 */
    /* JADX WARNING: type inference failed for: r3v645 */
    /* JADX WARNING: type inference failed for: r3v646 */
    /* JADX WARNING: type inference failed for: r3v647 */
    /* JADX WARNING: type inference failed for: r3v648 */
    /* JADX WARNING: type inference failed for: r3v649 */
    /* JADX WARNING: type inference failed for: r3v650 */
    /* JADX WARNING: type inference failed for: r3v651 */
    /* JADX WARNING: type inference failed for: r3v652 */
    /* JADX WARNING: type inference failed for: r3v653 */
    /* JADX WARNING: type inference failed for: r3v654 */
    /* JADX WARNING: type inference failed for: r3v655 */
    /* JADX WARNING: type inference failed for: r3v656 */
    /* JADX WARNING: type inference failed for: r3v657 */
    /* JADX WARNING: type inference failed for: r3v658 */
    /* JADX WARNING: type inference failed for: r3v659 */
    /* JADX WARNING: type inference failed for: r3v660 */
    /* JADX WARNING: type inference failed for: r3v661 */
    /* JADX WARNING: type inference failed for: r3v662 */
    /* JADX WARNING: type inference failed for: r3v663 */
    /* JADX WARNING: type inference failed for: r3v664 */
    /* JADX WARNING: type inference failed for: r3v665 */
    /* JADX WARNING: type inference failed for: r3v666 */
    /* JADX WARNING: type inference failed for: r3v667 */
    /* JADX WARNING: type inference failed for: r3v668 */
    /* JADX WARNING: type inference failed for: r3v669 */
    /* JADX WARNING: type inference failed for: r3v670 */
    /* JADX WARNING: type inference failed for: r3v672 */
    /* JADX WARNING: type inference failed for: r3v673 */
    /* JADX WARNING: type inference failed for: r3v674 */
    /* JADX WARNING: type inference failed for: r3v675 */
    /* JADX WARNING: type inference failed for: r3v676 */
    /* JADX WARNING: type inference failed for: r3v677 */
    /* JADX WARNING: type inference failed for: r3v678 */
    /* JADX WARNING: type inference failed for: r3v679 */
    /* JADX WARNING: type inference failed for: r3v680 */
    /* JADX WARNING: type inference failed for: r3v681 */
    /* JADX WARNING: type inference failed for: r3v682 */
    /* JADX WARNING: type inference failed for: r3v684 */
    /* JADX WARNING: type inference failed for: r3v685 */
    /* JADX WARNING: type inference failed for: r3v686 */
    /* JADX WARNING: type inference failed for: r3v687 */
    /* JADX WARNING: type inference failed for: r3v688 */
    /* JADX WARNING: type inference failed for: r3v689 */
    /* JADX WARNING: type inference failed for: r3v690 */
    /* JADX WARNING: type inference failed for: r3v691 */
    /* JADX WARNING: type inference failed for: r3v692 */
    /* JADX WARNING: type inference failed for: r3v693 */
    /* JADX WARNING: type inference failed for: r3v694 */
    /* JADX WARNING: type inference failed for: r3v695 */
    /* JADX WARNING: type inference failed for: r3v696 */
    /* JADX WARNING: type inference failed for: r3v697 */
    /* JADX WARNING: type inference failed for: r3v698 */
    /* JADX WARNING: type inference failed for: r3v699 */
    /* JADX WARNING: type inference failed for: r3v700 */
    /* JADX WARNING: type inference failed for: r3v701 */
    /* JADX WARNING: type inference failed for: r3v702 */
    /* JADX WARNING: type inference failed for: r3v703 */
    /* JADX WARNING: type inference failed for: r3v704 */
    /* JADX WARNING: type inference failed for: r3v706 */
    /* JADX WARNING: type inference failed for: r3v707 */
    /* JADX WARNING: type inference failed for: r3v708 */
    /* JADX WARNING: type inference failed for: r3v709 */
    /* JADX WARNING: type inference failed for: r3v710 */
    /* JADX WARNING: type inference failed for: r3v711 */
    /* JADX WARNING: type inference failed for: r3v712 */
    /* JADX WARNING: type inference failed for: r3v713 */
    /* JADX WARNING: type inference failed for: r3v714 */
    /* JADX WARNING: type inference failed for: r3v715 */
    /* JADX WARNING: type inference failed for: r3v716 */
    /* JADX WARNING: type inference failed for: r3v717 */
    /* JADX WARNING: type inference failed for: r3v718 */
    /* JADX WARNING: type inference failed for: r3v719 */
    /* JADX WARNING: type inference failed for: r3v720 */
    /* JADX WARNING: type inference failed for: r3v721 */
    /* JADX WARNING: type inference failed for: r3v722 */
    /* JADX WARNING: type inference failed for: r3v723 */
    /* JADX WARNING: type inference failed for: r3v724 */
    /* JADX WARNING: type inference failed for: r3v725 */
    /* JADX WARNING: type inference failed for: r3v726 */
    /* JADX WARNING: type inference failed for: r3v727 */
    /* JADX WARNING: type inference failed for: r3v728 */
    /* JADX WARNING: type inference failed for: r3v729 */
    /* JADX WARNING: type inference failed for: r3v730 */
    /* JADX WARNING: type inference failed for: r3v731 */
    /* JADX WARNING: type inference failed for: r3v732 */
    /* JADX WARNING: type inference failed for: r3v733 */
    /* JADX WARNING: type inference failed for: r3v734 */
    /* JADX WARNING: type inference failed for: r3v735 */
    /* JADX WARNING: type inference failed for: r3v736 */
    /* JADX WARNING: type inference failed for: r3v737 */
    /* JADX WARNING: type inference failed for: r3v738 */
    /* JADX WARNING: type inference failed for: r3v739 */
    /* JADX WARNING: type inference failed for: r3v740 */
    /* JADX WARNING: type inference failed for: r3v741 */
    /* JADX WARNING: type inference failed for: r3v742 */
    /* JADX WARNING: type inference failed for: r3v743 */
    /* JADX WARNING: type inference failed for: r3v744 */
    /* JADX WARNING: type inference failed for: r3v745 */
    /* JADX WARNING: type inference failed for: r3v746 */
    /* JADX WARNING: type inference failed for: r3v747 */
    /* JADX WARNING: type inference failed for: r3v748 */
    /* JADX WARNING: type inference failed for: r3v749 */
    /* JADX WARNING: type inference failed for: r3v750 */
    /* JADX WARNING: type inference failed for: r3v751 */
    /* JADX WARNING: type inference failed for: r3v752 */
    /* JADX WARNING: type inference failed for: r3v753 */
    /* JADX WARNING: type inference failed for: r3v754 */
    /* JADX WARNING: type inference failed for: r3v755 */
    /* JADX WARNING: type inference failed for: r3v756 */
    /* JADX WARNING: type inference failed for: r3v757 */
    /* JADX WARNING: type inference failed for: r3v758 */
    /* JADX WARNING: type inference failed for: r3v759 */
    /* JADX WARNING: type inference failed for: r3v760 */
    /* JADX WARNING: type inference failed for: r3v761 */
    /* JADX WARNING: type inference failed for: r3v762 */
    /* JADX WARNING: type inference failed for: r3v763 */
    /* JADX WARNING: type inference failed for: r3v764 */
    /* JADX WARNING: type inference failed for: r3v765 */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Can't wrap try/catch for region: R(8:628|629|630|631|632|2535|(0)|2540) */
    /* JADX WARNING: Code restructure failed: missing block: B:1000:0x1477, code lost:
        r1 = (float) r8;
        r0 = (float) r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1001:0x147b, code lost:
        if (r14 != false) goto L_0x147d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1002:0x147d, code lost:
        r0 = (float) r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1003:0x147e, code lost:
        r2 = 1.0f - (r1 / r0);
        r1 = r7.A01.A03;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1004:0x1484, code lost:
        if (r6 < 0) goto L_0x1499;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1007:0x148c, code lost:
        r1 = ((X.DFE) r1.get(r6)).A01.A0C();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1008:0x1499, code lost:
        r1 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1009:0x149a, code lost:
        if (r1 != null) goto L_0x149c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1010:0x149c, code lost:
        r3.put("visibleItemId", r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1011:0x14a1, code lost:
        X.C17890vO.A0z("visibleItemIndex", r3, r6);
        X.C17890vO.A0z("visibleItemWidth", r3, r5);
        X.C17890vO.A0z("visibleItemHeight", r3, r4);
        X.BE7.A1H("visibleItemFractionFromOffset", r3, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1013:0x14bd, code lost:
        throw X.AnonymousClass000.A0n("Called GetVisibleCollectionItemAt when not attached to a tree");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1015:0x14c4, code lost:
        if (r5.equals("bk.action.animated.GetCurrentPlayTime") == false) goto L_0x39f6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1016:0x14c6, code lost:
        r1 = A07(r2, r0);
        r3 = X.BE7.A0W();
        r3 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1017:0x14ce, code lost:
        if (r1 == null) goto L_0x3a10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1018:0x14d0, code lost:
        r0 = X.C26258Cw3.A02(r1, A0M(r0, 0));
        r3 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1019:0x14d8, code lost:
        if (r0 == null) goto L_0x3a10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1020:0x14da, code lost:
        r3 = java.lang.Float.valueOf(((float) X.C26258Cw3.A00(r0)) / ((float) X.C26258Cw3.A00));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1022:0x14ef, code lost:
        if (r5.equals("bk.action.accessibility.GetFontScale") == false) goto L_0x39f6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1023:0x14f1, code lost:
        r0 = X.C25995CqB.A00().A00.getResources();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1024:0x14fb, code lost:
        if (r0 == null) goto L_0x3a04;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1025:0x14fd, code lost:
        r0 = r0.getConfiguration();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1026:0x1501, code lost:
        if (r0 == null) goto L_0x3a04;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1027:0x1503, code lost:
        r3 = java.lang.Float.valueOf(r0.fontScale);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1029:0x1511, code lost:
        if (r5.equals("bk.action.textspan.GetCenterX") == false) goto L_0x39f6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1030:0x1513, code lost:
        r1 = A0G(r0);
        X.C18070vi.A0z(r1, "null cannot be cast to non-null type com.instagram.common.bloks.component.TextSpanContext");
        r3 = X.C25343Ce2.A00((double) ((X.C24954CRe) r1).A00);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1032:0x152d, code lost:
        if (r5.equals("bk.action.textspan.GetCenterY") == false) goto L_0x39f6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1033:0x152f, code lost:
        r1 = A0G(r0);
        X.C18070vi.A0z(r1, "null cannot be cast to non-null type com.instagram.common.bloks.component.TextSpanContext");
        r3 = X.C25343Ce2.A00((double) ((X.C24954CRe) r1).A01);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1035:0x1549, code lost:
        if (r5.equals("bk.action.ttrc.CompleteStep") == false) goto L_0x39f6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1036:0x154b, code lost:
        X.C18070vi.A0d(r0, 0);
        r4 = A02(r0, 0);
        r3 = r0.A00(1);
        X.C18070vi.A0z(r3, "null cannot be cast to non-null type kotlin.String");
        r1 = A0L(r0, 2);
        X.C18070vi.A0d(r1, 2);
        r0 = X.A7e.A00((java.lang.String) r3, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1037:0x1569, code lost:
        if (r0 == null) goto L_0x3a04;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1038:0x156b, code lost:
        r0.A0H(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1040:0x1576, code lost:
        if (r5.equals("bk.action.payload.Make") == false) goto L_0x39f6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1041:0x1578, code lost:
        r3 = A0H(r0, r2);
        X.C18070vi.A0z(r3, "null cannot be cast to non-null type com.instagram.common.bloks.component.base.BloksModel");
        r3 = (X.DFL) r3;
        r1 = r0.A00(1);
        X.C18070vi.A0z(r1, "null cannot be cast to non-null type com.instagram.common.bloks.component.base.BloksModel");
        r1 = (X.DFL) r1;
        r21 = r1.A0G(40);
        r22 = r1.A0G(38);
        r23 = r1.A0G(36);
        r6 = r1.A0G(41);
        r5 = X.AnonymousClass000.A13();
        r1 = r1.A0A(43);
        r19 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1042:0x15b0, code lost:
        if (r1 == null) goto L_0x15c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1043:0x15b2, code lost:
        r1 = X.C25974Cph.A00(r2, X.C199029zJ.A01, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1044:0x15ba, code lost:
        if ((r1 instanceof java.util.Map) == false) goto L_0x15c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1045:0x15bc, code lost:
        r19 = X.CCE.A00((java.util.Map) r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1046:0x15c2, code lost:
        r7 = r6.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1048:0x15ca, code lost:
        if (r7.hasNext() == false) goto L_0x15f7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1049:0x15cc, code lost:
        r0 = X.BE6.A0d(r7);
        r6 = r0.A0D(36);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1050:0x15d4, code lost:
        if (r6 == null) goto L_0x15f0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1051:0x15d6, code lost:
        r1 = X.BE7.A0d(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1052:0x15da, code lost:
        if (r1 == null) goto L_0x15e9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1053:0x15dc, code lost:
        r0 = new java.lang.Object();
        r0.A00 = r6;
        r0.A01 = r1;
        r5.add(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1055:0x15ef, code lost:
        throw X.AnonymousClass000.A0k("Received null name from props in the payload.Make tree resource references");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1057:0x15f6, code lost:
        throw X.AnonymousClass000.A0k("Received null variable id from props in the payload.Make tree resource references");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1058:0x15f7, code lost:
        r25 = java.util.Collections.emptyList();
        r26 = java.util.Collections.emptyList();
        r1 = r2.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1059:0x1601, code lost:
        if (r1 != null) goto L_0x1605;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1060:0x1603, code lost:
        r0 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1061:0x1605, code lost:
        r0 = (java.lang.String) X.DOZ.A00(r1, 2131428171);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1062:0x160e, code lost:
        r3 = A08(r2, r3, r19, r0, r21, r22, r23, r5, r25, r26, (java.util.List) null, (java.util.Map) null, (java.util.Map) null, false, false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1063:0x1626, code lost:
        r7 = "bk.action.component.GetWidth2";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1064:0x162c, code lost:
        if (r5.equals(r7) == false) goto L_0x39f6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1065:0x162e, code lost:
        X.C18070vi.A0d(r0, 0);
        X.C18070vi.A0d(r2, 1);
        r5 = 0;
        r3 = A0D(r0, 0);
        r4 = A0M(r0, 1);
        r0 = r3.A06(r2.A00);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1066:0x1643, code lost:
        if (r0 == null) goto L_0x1649;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1067:0x1645, code lost:
        r5 = r0.getWidth();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1068:0x1649, code lost:
        r1 = (float) r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1069:0x164c, code lost:
        if (r4 == null) goto L_0x165b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1071:0x1652, code lost:
        if (r4.equalsIgnoreCase("px") == false) goto L_0x165b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1072:0x1654, code lost:
        r3 = X.C25343Ce2.A00((double) r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1074:0x165d, code lost:
        if (r4 == null) goto L_0x1673;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1076:0x1663, code lost:
        if (r4.equalsIgnoreCase("dp") == false) goto L_0x1673;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1077:0x1665, code lost:
        r0 = X.C25995CqB.A00().A00;
        X.C18070vi.A0X(r0);
        r1 = X.C25342Ce1.A01(r0, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1078:0x1673, code lost:
        r0 = X.AnonymousClass001.A1H("Unrecognised unit string ", r4, X.AnonymousClass000.A10());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1080:0x1685, code lost:
        if (r5.equals("bk.action.animation.linear.SetNewEndValue") == false) goto L_0x39f6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1081:0x1687, code lost:
        X.C18070vi.A0d(r0, 0);
        r7 = (android.animation.ValueAnimator) X.BE6.A0n(r0, 0);
        r3 = r0.A00(1);
        X.C18070vi.A0z(r3, "null cannot be cast to non-null type kotlin.Number");
        r6 = X.AnonymousClass000.A04(r3);
        r5 = A01(r0, 2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1082:0x16a2, code lost:
        if (r7 == null) goto L_0x3a04;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1083:0x16a4, code lost:
        r2 = r7.getAnimatedValue();
        X.C18070vi.A0z(r2, "null cannot be cast to non-null type kotlin.Float");
        r7.setFloatValues(new float[]{((java.lang.Float) r2).floatValue(), r6});
        r7.setDuration((long) (r5 * 1000.0f));
        r7.start();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1085:0x16ce, code lost:
        if (r5.equals("bk.action.bloks.GetPayload") == false) goto L_0x39f6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1086:0x16d0, code lost:
        X.C18070vi.A0d(r0, 0);
        X.C18070vi.A0d(r2, 1);
        r3 = A0M(r0, 0);
        r5 = (java.util.Map) X.BE6.A0n(r0, 1);
        r4 = A0F(r2, r3).A00.A00.A00;
        r0 = r2.A06;
        r3 = X.AnonymousClass000.A13();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1087:0x16f0, code lost:
        if (r0 == null) goto L_0x16f5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1088:0x16f2, code lost:
        r3.addAll(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1089:0x16f5, code lost:
        X.C17890vO.A1D(r3, X.CFq.A00.incrementAndGet());
        r3 = A09(X.C23736Boh.A02(r2, r3), r4, r5, true, true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1091:0x170e, code lost:
        if (r5.equals("bk.action.animation.linear.Start") == false) goto L_0x39f6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1092:0x1710, code lost:
        X.C18070vi.A0d(r0, 0);
        r0 = (android.animation.ValueAnimator) X.BE6.A0n(r0, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1093:0x1719, code lost:
        if (r0 == null) goto L_0x3a04;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1094:0x171b, code lost:
        r0.start();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1096:0x1726, code lost:
        if (r5.equals("bk.action.debug.internal.DeviceLogV2") == false) goto L_0x39f6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1097:0x1728, code lost:
        X.C18070vi.A0d(r0, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1098:0x1732, code lost:
        if (X.C26294Cx6.A01.BfN(5) == false) goto L_0x3a04;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1100:?, code lost:
        r0 = X.BE6.A13(X.BE6.A0n(r0, 0), "null cannot be cast to non-null type kotlin.collections.List<*>");
        r2 = X.C29351c6.A0D(r0);
        r1 = r0.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1102:0x174a, code lost:
        if (r1.hasNext() == false) goto L_0x1758;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1103:0x174c, code lost:
        r2.add(A0O(r1.next()));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1104:0x1758, code lost:
        r1 = X.C108995ce.A0X(", ", r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1105:0x1764, code lost:
        if (X.C26294Cx6.A01.BfN(5) == false) goto L_0x3a04;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1106:0x1766, code lost:
        X.C26294Cx6.A01.Bhz(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1107:0x176d, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1110:?, code lost:
        X.C26294Cx6.A09("BKS::debugLog", "Failed to log", r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1112:0x177d, code lost:
        if (r5.equals("bk.action.bloks.ParseHoistedPayload") == false) goto L_0x39f6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1113:0x177f, code lost:
        X.C18070vi.A0d(r0, 0);
        X.C18070vi.A0d(r2, 1);
        r3 = A09(r2, A0F(r2, A0M(r0, 0)).A00.A00.A00, (java.util.Map) null, true, false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1115:0x17a0, code lost:
        if (r5.equals("bk.action.bloks.ReplaceChild") == false) goto L_0x39f6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1116:0x17a2, code lost:
        A0R(A0B(r2, r0), A0K(r0), X.BE6.A13(A0J(r0, r2), "null cannot be cast to non-null type kotlin.collections.List<com.instagram.common.bloks.component.base.BloksModel>"));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1118:0x17bf, code lost:
        if (r5.equals("bk.action.animated.easing.CreateCubicBezier") == false) goto L_0x39f6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1119:0x17c1, code lost:
        r3 = A0G(r0);
        X.C18070vi.A0z(r3, "null cannot be cast to non-null type kotlin.Number");
        r3 = X.C29111bd.A00(X.AnonymousClass000.A04(r3), A01(r0, 1), A01(r0, 2), A01(r0, 3));
        X.C18070vi.A0X(r3);
        r3 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1121:0x17eb, code lost:
        if (r5.equals("bk.action.bloks.ReplaceChildrenAfter") == false) goto L_0x39f6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1122:0x17ed, code lost:
        r4 = X.BE6.A13(A0J(r0, r2), "null cannot be cast to non-null type kotlin.collections.List<com.instagram.common.bloks.component.base.BloksModel>");
        r3 = A0K(r0);
        A0B(r2, r0).A0A(A0C(r3), new X.C23731Boc(r3, r4));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1124:0x1813, code lost:
        if (r5.equals("bk.action.AsyncComponentCacheWrite") == false) goto L_0x39f6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1125:0x1815, code lost:
        r6 = A0H(r0, r2);
        X.C18070vi.A0z(r6, "null cannot be cast to non-null type kotlin.String");
        r6 = (java.lang.String) r6;
        r8 = A0L(r0, 1);
        r3 = r0.A00(2);
        X.C18070vi.A0z(r3, "null cannot be cast to non-null type kotlin.Number");
        r10 = X.C17880vN.A05(r3);
        r1 = (X.DFL) r0.A00(3);
        r9 = r2.A00;
        r3 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1126:0x183c, code lost:
        if (r9 == null) goto L_0x184c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1127:0x183e, code lost:
        r7 = (X.C26012CqT) r9.A01(2131428152);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1129:0x1849, code lost:
        if (r9 == null) goto L_0x18ce;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1131:0x184c, code lost:
        r7 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1132:0x184e, code lost:
        if (r7 == null) goto L_0x18ce;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1133:0x1850, code lost:
        r9 = X.C26272CwJ.A01(r9);
        X.C26176Ctu.A02("Tree resources can only be read from the UI Thread");
        r9 = (X.COG) r9.A04.A02.get(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1134:0x1863, code lost:
        if (r9 != null) goto L_0x1874;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1135:0x1865, code lost:
        X.C25913CoX.A01(X.AnonymousClass001.A1H("Didn't find payload with id ", r6, X.AnonymousClass000.A10()), "BKBloksActionAsyncComponentCacheWriteImpl");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1136:0x1874, code lost:
        if (r1 == null) goto L_0x1877;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1138:0x1877, code lost:
        r2 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1139:0x1879, code lost:
        r1 = r1.A0A(42);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1140:0x187f, code lost:
        if (r1 == null) goto L_0x1877;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1141:0x1881, code lost:
        r2 = (java.util.Map) X.C25974Cph.A00(r2, X.C199029zJ.A01, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1142:0x1889, code lost:
        r0 = r9.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1143:0x188b, code lost:
        if (r0 == null) goto L_0x18b7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1144:0x188d, code lost:
        r1 = (java.lang.String) r0.first;
        r0 = (X.C25487Cgi) r0.second;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1145:0x1895, code lost:
        if (r1 == null) goto L_0x18b7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1146:0x1897, code lost:
        if (r0 == null) goto L_0x18b7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1147:0x1899, code lost:
        r6 = X.CC5.A00(r0, (java.util.List) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1148:0x189d, code lost:
        if (r2 != null) goto L_0x18a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1149:0x189f, code lost:
        r2 = X.AnonymousClass1D7.A0I();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1150:0x18a3, code lost:
        X.C18070vi.A0d(r8, 0);
        r7.A05.A01.A00(r6, X.C24285Byi.HOISTED_PREFETCH, (com.instagram.common.bloks.payload.BloksComponentQueryResources) null, X.C26177Ctv.A00(r8, r2), r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1151:0x18b7, code lost:
        r1 = X.AnonymousClass000.A10();
        r1.append("Stored payload for ");
        r1.append(r6);
        X.C25913CoX.A01(X.AnonymousClass000.A0y(" is null", r1), "BKBloksActionAsyncComponentCacheWriteImpl");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1152:0x18ce, code lost:
        X.C25913CoX.A01("Failed to get query store", "BKBloksActionAsyncComponentCacheWriteImpl");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1154:0x18db, code lost:
        if (r5.equals("bk.action.animated.Loop") == false) goto L_0x39f6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1155:0x18dd, code lost:
        r5 = A07(r2, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1156:0x18e1, code lost:
        if (r5 == null) goto L_0x3a04;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1157:0x18e3, code lost:
        r3 = new X.BED(A03(r0, 1), r5, A02(r0, 0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1159:0x18f8, code lost:
        if (r5.equals("bk.action.textspan.GetWidth") == false) goto L_0x39f6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1160:0x18fa, code lost:
        r1 = A0G(r0);
        X.C18070vi.A0z(r1, "null cannot be cast to non-null type com.instagram.common.bloks.component.TextSpanContext");
        r3 = X.C25343Ce2.A00((double) ((X.C24954CRe) r1).A03);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1162:0x1914, code lost:
        if (r5.equals("bk.action.dispatch.GetMainQueue") == false) goto L_0x39f6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1163:0x1916, code lost:
        r3 = (android.os.Handler) X.AnonymousClass6YS.A00.getValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1165:0x1926, code lost:
        if (r5.equals("bk.action.animation.linear.Cancel") == false) goto L_0x39f6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1166:0x1928, code lost:
        X.C18070vi.A0d(r0, 0);
        r0 = (android.animation.ValueAnimator) X.BE6.A0n(r0, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1167:0x1931, code lost:
        if (r0 == null) goto L_0x3a04;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1170:0x193b, code lost:
        if (r5.equals("bk.action.callback.Apply") == false) goto L_0x39f6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1171:0x193d, code lost:
        X.C18070vi.A0d(r0, 0);
        X.C18070vi.A0d(r2, 1);
        r0 = r0.A00;
        r4 = (X.C25562Ci0) r0.get(0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1172:0x194b, code lost:
        if (r4 == null) goto L_0x3a04;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1173:0x194d, code lost:
        r3 = java.util.Collections.unmodifiableList(r0);
        r3 = new X.C199029zJ(r3.subList(1, X.BE7.A08(r3)));
        r1 = r4.A01;
        r0 = r4.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1174:0x1962, code lost:
        if (r0 != null) goto L_0x196c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1175:0x1964, code lost:
        r0 = r4.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1176:0x1966, code lost:
        if (r0 == null) goto L_0x1972;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1177:0x1968, code lost:
        r0 = X.C23736Boh.A02(r2, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1178:0x196c, code lost:
        r3 = X.C25974Cph.A00(r0, r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1179:0x1972, code lost:
        r1 = "BloksCallback";
        r0 = "An attempt to invoke an invalid callback";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1181:0x197e, code lost:
        if (r5.equals("bk.action.animated.CreateColor") == false) goto L_0x39f6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1182:0x1980, code lost:
        r7 = A07(r2, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1183:0x1984, code lost:
        if (r7 == null) goto L_0x3a04;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1184:0x1986, code lost:
        r9 = X.C25488Cgj.A00(r0, 0);
        r10 = r0.A00;
        r6 = X.AnonymousClass8BT.A08(r10, 1);
        r5 = r0.A00(2);
        X.C18070vi.A0z(r5, "null cannot be cast to non-null type kotlin.String");
        r12 = android.graphics.Color.parseColor((java.lang.String) r5);
        r5 = android.graphics.Color.parseColor(A0L(r0, 3));
        r11 = A00(r0, 4);
        r3 = new X.BER();
        r3.setIntValues(new int[]{r12, r5});
        r3.setEvaluator(new android.animation.ArgbEvaluator());
        r3.setDuration((long) (r11 * ((float) X.C26258Cw3.A00)));
        r3.setInterpolator((android.view.animation.Interpolator) r10.get(5));
        r0 = new X.C26315CxY(r9, r2, 2);
        r3 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1186:0x19e3, code lost:
        if (r5.equals("bk.action.visibility_context.HasSeenBefore") == false) goto L_0x39f6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1187:0x19e5, code lost:
        r1 = A0G(r0);
        X.C18070vi.A0z(r1, "null cannot be cast to non-null type com.bloks.foa.visibility.ViewpointSnapshotWithData");
        r3 = java.lang.Boolean.valueOf(((X.C128246fg) r1).A02);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1189:0x19fe, code lost:
        if (r5.equals("bk.action.collection.SetIndexById") == false) goto L_0x39f6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1190:0x1a00, code lost:
        r3 = A0E(r0, r2);
        r1 = r0.A00(1);
        X.C18070vi.A0X(r1);
        r6 = X.CCF.A00(r1);
        r5 = X.C25343Ce2.A01(r0.A00(2));
        r4 = A05(r2, r3, r0, 3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1191:0x1a1d, code lost:
        if (r4 == null) goto L_0x3a04;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1193:0x1a23, code lost:
        if (X.C26176Ctu.A03() == false) goto L_0x1a4f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1194:0x1a25, code lost:
        r3 = r4.A01.A03;
        r2 = r3.size();
        r1 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1195:0x1a2e, code lost:
        if (r1 >= r2) goto L_0x3a04;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1196:0x1a30, code lost:
        r0 = ((X.DFE) r3.get(r1)).A01.A0C();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1197:0x1a3c, code lost:
        if (r0 == null) goto L_0x1a45;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1199:0x1a42, code lost:
        if (r0.equals(r6) == false) goto L_0x1a45;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1201:0x1a45, code lost:
        r1 = r1 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1202:0x1a48, code lost:
        if (r1 < 0) goto L_0x3a04;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1203:0x1a4a, code lost:
        r4.A01(r1, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1205:0x1a55, code lost:
        throw X.AnonymousClass8BR.A0w("setIndexById cannot be called from a background thread.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1207:0x1a5c, code lost:
        if (r5.equals("bk.action.timer.Stop") == false) goto L_0x39f6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1208:0x1a5e, code lost:
        X.C18070vi.A0d(r0, 0);
        X.C18070vi.A0d(r2, 1);
        r3 = A0M(r0, 0);
        r2 = r2.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1209:0x1a6a, code lost:
        if (r2 == null) goto L_0x1a88;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1210:0x1a6c, code lost:
        r0 = (X.CXG) ((java.util.HashMap) r2.A01(2131428185)).get(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1211:0x1a7b, code lost:
        if (r0 == null) goto L_0x3a04;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1212:0x1a7d, code lost:
        r0.A01 = true;
        r0.A03.removeCallbacks(r0.A05);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1214:0x1a8c, code lost:
        throw X.C17880vN.A0g();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1216:0x1a93, code lost:
        if (r5.equals("bk.action.toast.DismissToast") == false) goto L_0x39f6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1217:0x1a95, code lost:
        X.C18070vi.A0d(r0, 0);
        r2 = X.AnonymousClass8BT.A0t(r0, 0);
        r0 = X.C26071Crl.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1218:0x1a9e, code lost:
        if (r2 == null) goto L_0x3a04;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1219:0x1aa0, code lost:
        r1 = (X.BIJ) X.C26071Crl.A00.get();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1220:0x1aa8, code lost:
        if (r1 == null) goto L_0x3a04;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1222:0x1ab5, code lost:
        if (r2.equals(r1.getTag(2131430937)) == false) goto L_0x3a04;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1223:0x1ab7, code lost:
        r1.A03(r1.A01);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1225:0x1ac4, code lost:
        if (r5.equals("bk.action.tree.Make") == false) goto L_0x39f6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1226:0x1ac6, code lost:
        r3 = A0H(r0, r2);
        X.C18070vi.A0z(r3, "null cannot be cast to non-null type kotlin.Int");
        r5 = X.BE6.A0F(r3);
        r7 = r0.A00;
        r3 = new X.DFL(r2.A06, r5, r7.size() / 2);
        r1 = X.C28851b7.A07(X.C28851b7.A08(1, r7.size()));
        r6 = r1.A00;
        r5 = r1.A01;
        r4 = r1.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1227:0x1af4, code lost:
        if (r4 <= 0) goto L_0x1af9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1228:0x1af6, code lost:
        if (r6 <= r5) goto L_0x1afd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1230:0x1af9, code lost:
        if (r4 >= 0) goto L_0x1b15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1231:0x1afb, code lost:
        if (r5 > r6) goto L_0x1b15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1232:0x1afd, code lost:
        r1 = r0.A00(r6);
        X.C18070vi.A0z(r1, "null cannot be cast to non-null type kotlin.Int");
        r3.A0H(X.BE6.A0F(r1), r7.get(r6 + 1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1233:0x1b11, code lost:
        if (r6 == r5) goto L_0x1b15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1234:0x1b13, code lost:
        r6 = r6 + r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1235:0x1b15, code lost:
        r3.A0J();
        r3 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1237:0x1b20, code lost:
        if (r5.equals("bk.action.device.GetDeviceOSVersion") == false) goto L_0x39f6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1238:0x1b22, code lost:
        r3 = java.lang.Integer.valueOf(android.os.Build.VERSION.SDK_INT);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1240:0x1b30, code lost:
        if (r5.equals("bk.action.bloks.InflateSync") == false) goto L_0x39f6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1241:0x1b32, code lost:
        r1 = A0I(r0, r2);
        X.C18070vi.A0z(r1, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.Any, kotlin.Any>");
        r1 = (java.util.Map) r1;
        X.AnonymousClass0O7.A01("InflateSync");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1243:?, code lost:
        r3 = X.AnonymousClass000.A15(r1);
        X.C25995CqB.A00();
        r0 = new X.C26954DNc(r2, r3);
        r0.BkN();
        r3 = X.C25338Cdx.A01((X.C24948CQy) null, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1245:?, code lost:
        X.AnonymousClass0O7.A00();
        r3 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1246:0x1b5b, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1249:?, code lost:
        X.C25913CoX.A02("inflate_sync_error", r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1250:0x1b63, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1252:?, code lost:
        X.AnonymousClass0O7.A00();
        r3 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1254:0x1b6f, code lost:
        if (r5.equals("bk.action.ttrc.AddAnnotation") == false) goto L_0x39f6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1255:0x1b71, code lost:
        X.C18070vi.A0d(r0, 0);
        r4 = A02(r0, 0);
        r3 = r0.A00;
        r2 = X.C17880vN.A0w(r3, 1);
        r1 = r3.get(2);
        X.C18070vi.A0z(r1, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.Any, kotlin.Any>");
        r1 = (java.util.Map) r1;
        X.C18070vi.A0d(r1, 2);
        r0 = X.A7e.A00(r2, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1256:0x1b92, code lost:
        if (r0 == null) goto L_0x3a04;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1257:0x1b94, code lost:
        X.A7e.A02(r0, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1259:0x1b9f, code lost:
        if (r5.equals("null") == false) goto L_0x39f6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1260:0x1ba1, code lost:
        X.C18070vi.A0d(r0, 0);
        r2 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1261:0x1ba9, code lost:
        if (X.BE6.A0n(r0, 0) != null) goto L_0x380d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1264:0x1bb3, code lost:
        if (r5.equals("bk.action.animated.CreateSharedElementV2") == false) goto L_0x39f6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1265:0x1bb5, code lost:
        r9 = A07(r2, r0);
        r3 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1266:0x1bba, code lost:
        if (r9 == null) goto L_0x3a10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1267:0x1bbc, code lost:
        r5 = r0.A00(0);
        X.C18070vi.A0z(r5, "null cannot be cast to non-null type com.instagram.common.bloks.component.base.BloksModel");
        r5 = (X.DFL) r5;
        r7 = r0.A00(1);
        X.C18070vi.A0z(r7, "null cannot be cast to non-null type com.instagram.common.bloks.component.base.BloksModel");
        r7 = (X.DFL) r7;
        r8 = r5.A0D(36);
        r2 = r5.A06(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1268:0x1bdc, code lost:
        if ((r2 instanceof X.C22645BHh) == false) goto L_0x1be1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1269:0x1bde, code lost:
        r3 = (X.C22645BHh) r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1270:0x1be1, code lost:
        r5 = X.BE7.A0f(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1271:0x1be5, code lost:
        if (r8 == null) goto L_0x1d19;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1272:0x1be7, code lost:
        if (r3 == 0) goto L_0x1d19;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1273:0x1be9, code lost:
        if (r5 == null) goto L_0x1d19;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1274:0x1beb, code lost:
        r0 = (java.util.Queue) X.CEH.A00.get(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1275:0x1bf4, code lost:
        if (r0 == null) goto L_0x1d19;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1276:0x1bf6, code lost:
        r8 = r0.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1278:0x1bfe, code lost:
        if (r8.hasNext() == false) goto L_0x1c39;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1279:0x1c00, code lost:
        r2 = r8.next();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1280:0x1c11, code lost:
        if ((!X.C18070vi.A18(((java.lang.ref.Reference) r2).get(), r3)) == false) goto L_0x1bfa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1281:0x1c13, code lost:
        r2 = (java.lang.ref.Reference) r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1282:0x1c15, code lost:
        if (r2 == null) goto L_0x1d19;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1283:0x1c17, code lost:
        r0 = (X.C22645BHh) r2.get();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1284:0x1c1d, code lost:
        if (r0 == null) goto L_0x1d19;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1285:0x1c1f, code lost:
        r0 = r0.getLastKnownLocation();
        r9 = r0.left;
        r8 = r0.top;
        r10 = r0.width();
        r2 = r0.height();
        r11 = r5.hashCode();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1286:0x1c36, code lost:
        if (r11 == -934437708) goto L_0x1c51;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1288:0x1c39, code lost:
        r2 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1290:0x1c3e, code lost:
        if (r11 == -711710159) goto L_0x1c46;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1292:0x1c43, code lost:
        if (r11 != 109250890) goto L_0x1d0b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1295:0x1c4c, code lost:
        if (r5.equals("scale_and_resize") == false) goto L_0x1d0b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1296:0x1c4e, code lost:
        r11 = X.AnonymousClass00R.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1298:0x1c57, code lost:
        if (r5.equals("resize") == false) goto L_0x1d0b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1299:0x1c59, code lost:
        r11 = X.AnonymousClass00R.A0C;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1301:0x1c62, code lost:
        if (r5.equals("scale") == false) goto L_0x1d0b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1302:0x1c64, code lost:
        r11 = X.AnonymousClass00R.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1304:0x1c68, code lost:
        if (r3.A01 != null) goto L_0x1c93;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1305:0x1c6a, code lost:
        r4 = android.animation.ValueAnimator.ofFloat(new float[]{1.0f});
        X.C18070vi.A0X(r4);
        r4 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1306:0x1c77, code lost:
        r4.setDuration((long) (r7.A03(35, 0.0f) * ((float) X.C26258Cw3.A00)));
        r0 = (android.view.animation.Interpolator) X.DFL.A00(r7, 36);
        r4 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1307:0x1c8c, code lost:
        if (r0 == null) goto L_0x3a0f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1308:0x1c8e, code lost:
        r4.setInterpolator(r0);
        r4 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1309:0x1c93, code lost:
        r5 = (float) r10;
        r2 = (float) r2;
        r0 = r11.intValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1310:0x1c99, code lost:
        if (r0 == 0) goto L_0x1cbd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1311:0x1c9b, code lost:
        if (r0 == 1) goto L_0x1cde;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1312:0x1c9d, code lost:
        r4 = android.animation.ValueAnimator.ofFloat(new float[]{1.0f});
        r17 = new X.C26324Cxh(r4, r3, r5, r2, r9, r8, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1313:0x1cbd, code lost:
        r0 = X.C108945cZ.A1V();
        r0 = {0, 1065353216} // fill-array;
        r4 = android.animation.ValueAnimator.ofFloat(r0);
        r17 = new X.C26324Cxh(r4, r3, r5, r2, r9, r8, 2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1314:0x1cde, code lost:
        r4 = android.animation.ValueAnimator.ofFloat(new float[]{1.0f});
        r17 = new X.C26324Cxh(r4, r3, r5, r2, r9, r8, 1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1315:0x1cfd, code lost:
        r4.addUpdateListener(r0);
        r4.addListener(new X.C26305CxO(r3, 0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1316:0x1d0b, code lost:
        r1 = X.AnonymousClass000.A10();
        r1.append("Invalid scale type: ");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1317:0x1d18, code lost:
        throw X.AnonymousClass001.A12(r5, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1318:0x1d19, code lost:
        r3 = android.animation.ValueAnimator.ofFloat(new float[]{1.0f});
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1320:0x1d2b, code lost:
        if (r5.equals("bk.action.ttrc.CachedContentDisplayed") == false) goto L_0x39f6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1321:0x1d2d, code lost:
        X.C18070vi.A0d(r0, 0);
        r8 = false;
        r2 = A02(r0, 0);
        r3 = r0.A00(1);
        X.C18070vi.A0z(r3, "null cannot be cast to non-null type kotlin.String");
        r3 = (java.lang.String) r3;
        r7 = A0L(r0, 2);
        r5 = r0.A00(3);
        X.C18070vi.A0z(r5, "null cannot be cast to non-null type kotlin.Long");
        r5 = ((java.lang.Long) r5).longValue();
        r1 = X.AnonymousClass8BR.A0G(r0.A00, 4);
        X.C25995CqB.A00();
        r9 = android.os.SystemClock.elapsedRealtime();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1322:0x1d63, code lost:
        if (r1 == null) goto L_0x1d6b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1323:0x1d65, code lost:
        r8 = r1.A0I(35, false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1324:0x1d6b, code lost:
        X.C18070vi.A0d(r7, 2);
        r4 = X.A7e.A00(r3, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1325:0x1d73, code lost:
        if (r4 == null) goto L_0x3a04;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1326:0x1d75, code lost:
        r4.A0B(r5, r7, r8, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1328:0x1d80, code lost:
        if (r5.equals("bk.action.animated.SetCurrentPlayTime") == false) goto L_0x39f6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1329:0x1d82, code lost:
        r6 = A07(r2, r0);
        r3 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1330:0x1d87, code lost:
        if (r6 == null) goto L_0x3a10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1331:0x1d89, code lost:
        r2 = A0M(r0, 0);
        r5 = A00(r0, 1);
        r4 = X.C26258Cw3.A02(r6, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1332:0x1d95, code lost:
        if (r4 == null) goto L_0x3a10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1333:0x1d97, code lost:
        X.C26258Cw3.A04(r4, (long) (r5 * ((float) X.C26258Cw3.A00)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1335:0x1da7, code lost:
        if (r5.equals("bk.action.hcollection.SetOffset") == false) goto L_0x39f6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1336:0x1da9, code lost:
        r6 = A0E(r0, r2);
        r5 = A00(r0, 1);
        r3 = X.C25343Ce2.A01(r0.A00(2));
        r2 = A05(r2, r6, r0, 3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1337:0x1dbf, code lost:
        if (r2 == null) goto L_0x3a04;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1338:0x1dc1, code lost:
        r0 = X.C25995CqB.A00().A00;
        X.C18070vi.A0X(r0);
        r1 = (int) X.C25342Ce1.A00(r0, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1339:0x1dd3, code lost:
        if (X.C26176Ctu.A03() == false) goto L_0x1dec;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1341:0x1dd9, code lost:
        if (X.C26176Ctu.A03() == false) goto L_0x1de5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1342:0x1ddb, code lost:
        r2.A00(r1 - r2.A02.A04, 0, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1344:0x1deb, code lost:
        throw X.AnonymousClass8BR.A0w("Cannot getScroll off the main thread!");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1346:0x1df2, code lost:
        throw X.AnonymousClass8BR.A0w("setXOffset cannot be called from a background thread.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1348:0x1df9, code lost:
        if (r5.equals("bk.action.bloks.InsertChildrenBefore") == false) goto L_0x39f6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1349:0x1dfb, code lost:
        r3 = X.BE6.A13(A0J(r0, r2), "null cannot be cast to non-null type kotlin.collections.List<com.instagram.common.bloks.component.base.BloksModel>");
        r1 = A0K(r0);
        r5 = A0B(r2, r0);
        r6 = A0C(r1);
        r2 = new X.C23735Bog(r3, 0, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1351:0x1e1e, code lost:
        if (r5.equals("bk.action.bloks.WriteGlobalConsistencyStore") == false) goto L_0x39f6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1352:0x1e20, code lost:
        X.C18070vi.A0d(r0, 0);
        X.C18070vi.A0d(r2, 1);
        r0 = r0.A00;
        r4 = r0.get(0);
        X.AnonymousClass8BR.A1I(r4);
        r4 = (java.lang.String) r4;
        r3 = r0.get(1);
        r1 = r2.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1353:0x1e37, code lost:
        if (r1 == null) goto L_0x1e57;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1354:0x1e39, code lost:
        r1 = X.C26272CwJ.A02(r1, "gs");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1355:0x1e3f, code lost:
        if (r1 == null) goto L_0x1e4e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1357:0x1e43, code lost:
        if ((r1 instanceof X.C26960DNi) == false) goto L_0x1e4e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1358:0x1e45, code lost:
        ((X.C26960DNi) r1).A00.A01(r4, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1359:0x1e4e, code lost:
        r1 = "BKBloksActionBloksWriteGlobalConsistencyStoreImpl";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1360:0x1e50, code lost:
        r0 = "Global State Module not found";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1361:0x1e52, code lost:
        X.C25913CoX.A01(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1363:0x1e5b, code lost:
        throw X.C17880vN.A0g();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1365:0x1e62, code lost:
        if (r5.equals("bk.action.DispatchAsync") == false) goto L_0x39f6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1366:0x1e64, code lost:
        r5 = A0H(r0, r2);
        X.C18070vi.A0z(r5, "null cannot be cast to non-null type android.os.Handler");
        r5 = (android.os.Handler) r5;
        r6 = X.C25488Cgj.A00(r0, 1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1367:0x1e77, code lost:
        if (X.C26176Ctu.A03() != false) goto L_0x1e8a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1369:0x1e85, code lost:
        if (X.C18070vi.A18(r5.getLooper(), android.os.Looper.getMainLooper()) == false) goto L_0x1e8a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1370:0x1e87, code lost:
        r0 = 34;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1372:0x1e8e, code lost:
        if (X.C26176Ctu.A03() == false) goto L_0x1ee2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1374:0x1e9c, code lost:
        if (X.C18070vi.A18(r5.getLooper(), android.os.Looper.getMainLooper()) != false) goto L_0x1ee2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1375:0x1e9e, code lost:
        r4 = r2.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1376:0x1ea0, code lost:
        if (r4 != null) goto L_0x1ea3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1378:0x1ea3, code lost:
        r3 = r2.A06;
        r17 = new X.C23736Boh((X.E9O) null, (X.DOZ) null, r4, X.C26272CwJ.A01(r4).A06(), (X.C24807CLa) null, new java.lang.Object(), r2.A05, r6, X.C26272CwJ.A03(r4), X.AnonymousClass00R.A01, (java.lang.String) X.DOZ.A00(r4, 2131428171), (java.lang.String) null, r3, (java.util.Map) null, (java.util.Map) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1379:0x1ee1, code lost:
        r2 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1380:0x1ee2, code lost:
        r0 = 35;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1381:0x1ee4, code lost:
        X.BE7.A19(r5, r6, r2, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1382:0x1ee9, code lost:
        r3 = "bk.action.animated.CancelWithToken";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1384:0x1eef, code lost:
        if (r5.equals(r3) == false) goto L_0x39f6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1385:0x1ef1, code lost:
        r1 = A07(r2, r0);
        r3 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1386:0x1ef6, code lost:
        if (r1 == null) goto L_0x3a10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1387:0x1ef8, code lost:
        r0 = X.C26258Cw3.A02(r1, A0M(r0, 0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1388:0x1f00, code lost:
        if (r0 == null) goto L_0x3a10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1389:0x1f02, code lost:
        r0.cancel();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1391:0x1f0d, code lost:
        if (r5.equals("bk.action.textinput.GetText") == false) goto L_0x39f6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1392:0x1f0f, code lost:
        r5 = A0E(r0, r2);
        r1 = A06(r2, r0, 1);
        r3 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1393:0x1f1e, code lost:
        if (r5.A0I(99, false) != false) goto L_0x3a10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1394:0x1f20, code lost:
        r1 = X.C26272CwJ.A04(r1, r5);
        r4 = "";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1395:0x1f28, code lost:
        if ((r1 instanceof X.CTH) == false) goto L_0x3a10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1396:0x1f2a, code lost:
        r1 = (X.CTH) r1;
        r0 = r1.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1397:0x1f2e, code lost:
        if (r0 == null) goto L_0x1f39;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1398:0x1f30, code lost:
        r0 = r0.getText();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1399:0x1f34, code lost:
        if (r0 == null) goto L_0x1f39;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1400:0x1f36, code lost:
        r0 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1401:0x1f39, code lost:
        r0 = r1.A05;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1402:0x1f3b, code lost:
        if (r0 != null) goto L_0x1f3f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1403:0x1f3d, code lost:
        r0 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1404:0x1f3f, code lost:
        if (r0 == null) goto L_0x3a0f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1405:0x1f41, code lost:
        r3 = r0.toString();
        r3 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1406:0x1f45, code lost:
        if (r3 != null) goto L_0x3a10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1409:0x1f4f, code lost:
        if (r5.equals("bk.action.bloks.RemoveChildrenBetween") == false) goto L_0x39f6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1410:0x1f51, code lost:
        r7 = A0I(r0, r2);
        X.C18070vi.A0z(r7, "null cannot be cast to non-null type com.instagram.common.bloks.component.base.BloksModel");
        r1 = r0.A00(1);
        X.C18070vi.A0X(r1);
        A0B(r2, r0).A0A(new X.C26964DNm((long) ((X.DFL) r7).A04), new X.C23730Bob(X.CCF.A00(r1), A0K(r0)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1412:0x1f87, code lost:
        if (r5.equals("bk.action.array.Slice") == false) goto L_0x39f6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1413:0x1f89, code lost:
        r4 = X.BE6.A13(A0G(r0), "null cannot be cast to non-null type java.util.List<kotlin.Any>");
        r2 = A02(r0, 1);
        r1 = (java.lang.Number) X.BE6.A0n(r0, 2);
        r3 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1414:0x1f9f, code lost:
        if (r2 < 0) goto L_0x1fca;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1416:0x1fa5, code lost:
        if (r2 >= r4.size()) goto L_0x1fca;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1417:0x1fa7, code lost:
        if (r1 != null) goto L_0x1fae;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1418:0x1fa9, code lost:
        r0 = r4.size();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1420:0x1fb2, code lost:
        if (r1.intValue() >= 0) goto L_0x1fb7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1421:0x1fb4, code lost:
        r0 = "argument length cannot be negative";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1422:0x1fb7, code lost:
        r0 = java.lang.Math.min(r1.intValue() + r2, r4.size());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1423:0x1fc4, code lost:
        r3 = r4.subList(r2, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1424:0x1fca, code lost:
        r0 = "argument offset is out of bounds";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1425:0x1fcc, code lost:
        X.C25913CoX.A01("bk.action.array.Slice", r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1427:0x1fd7, code lost:
        if (r5.equals("bk.action.ttrc.AddPoint") == false) goto L_0x39f6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1428:0x1fd9, code lost:
        X.C18070vi.A0d(r0, 0);
        r5 = A02(r0, 0);
        r4 = r0.A00(1);
        X.C18070vi.A0z(r4, "null cannot be cast to non-null type kotlin.String");
        r2 = A0L(r0, 2);
        r1 = r0.A00(3);
        X.C18070vi.A0z(r1, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.Any, kotlin.Any>");
        r3 = 0;
        X.A7e.A03((java.lang.Long) null, (java.lang.String) r4, r2, (java.util.Map) r1, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1430:0x2008, code lost:
        if (r5.equals("bk.action.ttrc.AddQuery") == false) goto L_0x39f6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1431:0x200a, code lost:
        r2 = A0G(r0);
        X.C18070vi.A0z(r2, "null cannot be cast to non-null type kotlin.Number");
        r3 = X.AnonymousClass000.A0M(r2);
        r2 = r0.A00(1);
        X.C18070vi.A0z(r2, "null cannot be cast to non-null type kotlin.String");
        r4 = A0L(r0, 2);
        r0 = r0.A00(3);
        X.C18070vi.A0z(r0, "null cannot be cast to non-null type kotlin.Number");
        r1 = X.AnonymousClass000.A0M(r0);
        X.C18070vi.A0d(r4, 2);
        r3 = X.A7e.A00((java.lang.String) r2, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1432:0x203b, code lost:
        if (r3 == null) goto L_0x3a04;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1433:0x203d, code lost:
        r3.A0K(r4, java.util.concurrent.TimeUnit.SECONDS, (long) r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1435:0x204b, code lost:
        if (r5.equals("bk.action.string.FromProvider") == false) goto L_0x39f6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1436:0x204d, code lost:
        X.C18070vi.A0d(r0, 0);
        r3 = X.CBz.A00(A0D(r0, 0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1438:0x2060, code lost:
        if (r5.equals("bk.action.bloks.RequestFocus") == false) goto L_0x39f6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1439:0x2062, code lost:
        r3 = (X.DFL) A0I(r0, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1440:0x2068, code lost:
        if (r3 == null) goto L_0x2863;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1441:0x206a, code lost:
        r0 = r3.A06(r2.A00);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1442:0x2070, code lost:
        if (r0 == null) goto L_0x2863;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1444:0x2076, code lost:
        if (r0.requestFocus() == false) goto L_0x2863;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1445:0x2078, code lost:
        r3 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1447:0x2084, code lost:
        if (r5.equals("bk.action.collection.SetIndex") == false) goto L_0x39f6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1448:0x2086, code lost:
        r5 = A0E(r0, r2);
        r4 = A02(r0, 1);
        r3 = X.C25343Ce2.A01(r0.A00(2));
        r0 = A05(r2, r5, r0, 3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1449:0x209c, code lost:
        if (r0 == null) goto L_0x3a04;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1450:0x209e, code lost:
        r0.A01(r4, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1452:0x20a9, code lost:
        if (r5.equals("bk.action.hcollection.GetOffset") == false) goto L_0x39f6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1453:0x20ab, code lost:
        r2 = A05(r2, A0E(r0, r2), r0, 1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1454:0x20b3, code lost:
        if (r2 == null) goto L_0x3a04;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1455:0x20b5, code lost:
        r1 = X.C25995CqB.A00().A00;
        X.C18070vi.A0X(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1456:0x20c2, code lost:
        if (X.C26176Ctu.A03() == false) goto L_0x20d4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1457:0x20c4, code lost:
        r3 = X.C25343Ce2.A00((double) X.C25342Ce1.A01(r1, (float) r2.A02.A04));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1459:0x20da, code lost:
        throw X.AnonymousClass8BR.A0w("Cannot getScroll off the main thread!");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1461:0x20e1, code lost:
        if (r5.equals("bk.action.callback.MakeWithScopeOnly") == false) goto L_0x39f6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1462:0x20e3, code lost:
        X.C18070vi.A0d(r0, 0);
        X.C18070vi.A0d(r2, 1);
        r1 = X.C25488Cgj.A00(r0, 0);
        r0 = r2.A06;
        X.C18070vi.A0W(r0);
        r3 = new X.C25562Ci0(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1464:0x20ff, code lost:
        if (r5.equals("bk.action.textinput.SetTextV2") == false) goto L_0x39f6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1465:0x2101, code lost:
        r3 = A0E(r0, r2);
        r5 = r0.A00(1);
        X.C18070vi.A0z(r5, "null cannot be cast to non-null type kotlin.CharSequence");
        r5 = (java.lang.CharSequence) r5;
        r2 = X.C26272CwJ.A04(A06(r2, r0, 2), r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1466:0x211b, code lost:
        if ((r2 instanceof X.CTH) == false) goto L_0x3a04;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1467:0x211d, code lost:
        r2 = (X.CTH) r2;
        X.C18070vi.A0d(r5, 0);
        r1 = true;
        X.C26176Ctu.A02((java.lang.String) null);
        r3 = r2.A02;
        r2.A04 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1468:0x212b, code lost:
        if (r3 != null) goto L_0x2131;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1469:0x212d, code lost:
        r2.A04 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1470:0x2131, code lost:
        r2 = r3.getText().length() - r3.getSelectionEnd();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1471:0x2142, code lost:
        if (r3.getSelectionEnd() == 0) goto L_0x2145;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1472:0x2144, code lost:
        r1 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1473:0x2145, code lost:
        r3.setText(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1474:0x2148, code lost:
        if (r1 != false) goto L_0x3a04;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1475:0x214a, code lost:
        r1 = r5.length();
        r0 = r5.length();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1476:0x2152, code lost:
        if (r1 < r2) goto L_0x2155;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1477:0x2154, code lost:
        r0 = r0 - r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1478:0x2155, code lost:
        r3.setSelection(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1480:0x2160, code lost:
        if (r5.equals("bk.action.bloks.WriteLocalState") == false) goto L_0x39f6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1481:0x2162, code lost:
        r7 = A07(r2, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1482:0x2166, code lost:
        if (r7 == null) goto L_0x21bb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1483:0x2168, code lost:
        r3 = r0.A00;
        r6 = X.C17880vN.A0w(r3, 0);
        r5 = r3.get(1);
        r1 = r3.get(2);
        X.C18070vi.A0z(r1, "null cannot be cast to non-null type kotlin.Number");
        r4 = X.AnonymousClass000.A0M(r1);
        r3 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1484:0x2181, code lost:
        if (r6 == null) goto L_0x3a10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1485:0x2183, code lost:
        r1 = r2.A06;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1486:0x2185, code lost:
        if (r4 != 0) goto L_0x2195;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1487:0x2187, code lost:
        r2 = X.C26272CwJ.A01(r7);
        r1 = new X.C23681Bno(r6, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1488:0x2190, code lost:
        r2.A09(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1489:0x2195, code lost:
        if (r1 == null) goto L_0x21b4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1491:0x219b, code lost:
        if (r4 > r1.size()) goto L_0x21ad;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1492:0x219d, code lost:
        r0 = X.C25968Cpa.A00(X.AnonymousClass00R.A00, r6, r1, r4);
        r2 = X.C26272CwJ.A01(r7);
        r1 = new X.C23681Bno(r0, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1494:0x21b3, code lost:
        throw X.AnonymousClass000.A0k("Depth supplied should never exceed the size of the key path.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1496:0x21ba, code lost:
        throw X.AnonymousClass000.A0k("Keypath must be set on environment if trying to WriteLocalState on a depth larger than 0.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1498:0x21c1, code lost:
        throw X.AnonymousClass000.A0n("Called WriteLocalState when not attached to a tree");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1500:0x21c8, code lost:
        if (r5.equals("bk.action.component.SetAttr") == false) goto L_0x39f6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1501:0x21ca, code lost:
        X.C18070vi.A0d(r0, 0);
        X.C18070vi.A0d(r2, 1);
        r6 = r0.A00;
        r3 = X.AnonymousClass8BR.A0G(r6, 0);
        r9 = r6.get(1);
        X.AnonymousClass8BR.A1I(r9);
        r9 = (java.lang.String) r9;
        r5 = r6.get(2);
        r7 = A06(r2, r0, 3);
        r6 = X.CCB.A00(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1502:0x21ef, code lost:
        if (r6 >= 32) goto L_0x2211;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1503:0x21f1, code lost:
        r2 = new java.lang.Object[3];
        X.C17880vN.A1T(r2, r6, 0);
        r2[1] = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1504:0x21f8, code lost:
        if (r3 == null) goto L_0x2201;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1505:0x21fa, code lost:
        r1 = java.lang.Integer.valueOf(r3.A05);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1506:0x2201, code lost:
        r1 = "unknown";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1507:0x2203, code lost:
        r2[2] = r1;
        X.C25913CoX.A01("BKBloksActionComponentSetAttrImpl", java.lang.String.format("Encountered invalid minified key: %s, raw: %s for styleId: %s while unwrapping binding expression", r2));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1508:0x2211, code lost:
        r1 = X.C26272CwJ.A04(r7, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1509:0x2215, code lost:
        if (r1 == null) goto L_0x2223;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1511:0x2219, code lost:
        if ((r1 instanceof X.E6D) == false) goto L_0x2223;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1513:0x2221, code lost:
        if (((X.E6D) r1).CHw(r7, r5, r6) != false) goto L_0x2237;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1514:0x2223, code lost:
        X.C26272CwJ.A01(r7).A0A(new X.C26964DNm((long) r3.A04), new X.C23734Bof(r6, r5));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1515:0x2237, code lost:
        r3 = X.C27621Wu.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1517:0x2241, code lost:
        if (r5.equals("bk.action.animated.GetCurrentDimensionValue") == false) goto L_0x39f6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1518:0x2243, code lost:
        r2 = A0G(r0);
        X.C18070vi.A0z(r2, "null cannot be cast to non-null type com.bloks.stdlib.animation.BloksDimensionValueAnimator");
        r2 = (X.BNG) r2;
        r6 = r2.getAnimatedValue();
        X.C18070vi.A0z(r6, "null cannot be cast to non-null type kotlin.Float");
        r6 = (java.lang.Float) r6;
        r5 = r6.floatValue();
        r2 = r2.A00;
        r0 = X.AnonymousClass00R.A00;
        r3 = java.util.Locale.US;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1519:0x2263, code lost:
        if (r2 != r0) goto L_0x2275;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1520:0x2265, code lost:
        r1 = java.util.Arrays.copyOf(new java.lang.Object[]{r6}, 1);
        r0 = "%.2f%%";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1521:0x226f, code lost:
        r3 = X.C108955ca.A12(r3, r0, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1522:0x2275, code lost:
        r2 = new java.lang.Object[1];
        X.C17880vN.A1T(r2, X.C22339B3q.A01(r5), 0);
        r1 = java.util.Arrays.copyOf(r2, 1);
        r0 = "%dpx";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1524:0x228b, code lost:
        if (r5.equals("bk.action.bloks.InvalidateCachedAsyncComponents") == false) goto L_0x39f6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1525:0x228d, code lost:
        X.C18070vi.A0d(r0, 0);
        X.C18070vi.A0d(r2, 1);
        r4 = A0M(r0, 0);
        r3 = r0.A00(1);
        X.C18070vi.A0z(r3, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any>");
        r3 = (java.util.Map) r3;
        r1 = r2.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1526:0x22a4, code lost:
        if (r1 == null) goto L_0x3a04;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1527:0x22a6, code lost:
        r1 = (X.C26012CqT) r1.A01(2131428152);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1528:0x22af, code lost:
        if (r1 == null) goto L_0x3a04;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1529:0x22b1, code lost:
        r1.A02(r4, r3, X.C24278Byb.A00);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1531:0x22be, code lost:
        if (r5.equals("bk.action.bloks.TimestampOfLastTouchUpV2") == false) goto L_0x39f6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1532:0x22c0, code lost:
        r3 = java.lang.Long.valueOf(com.bloks.foa.ttrc.touchuplistener.BloksTouchUpListenerUtils.getTouchUpTime());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1534:0x22d0, code lost:
        if (r5.equals("bk.action.context.Get") == false) goto L_0x39f6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1535:0x22d2, code lost:
        X.C18070vi.A0d(r2, 1);
        r3 = r2.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1537:0x22df, code lost:
        if (r5.equals("bk.action.screen.Open") == false) goto L_0x39f6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1538:0x22e1, code lost:
        r8 = A07(r2, r0);
        r3 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1539:0x22e6, code lost:
        if (r8 == null) goto L_0x2339;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1540:0x22e8, code lost:
        r5 = r8.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1542:0x22ec, code lost:
        if (r5 == null) goto L_0x239f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1543:0x22ee, code lost:
        r11 = r0.A00(0);
        X.C18070vi.A0z(r11, "null cannot be cast to non-null type com.instagram.common.bloks.component.base.BloksModel");
        r11 = (X.DFL) r11;
        r12 = r0.A00(1);
        X.C18070vi.A0z(r12, "null cannot be cast to non-null type com.instagram.common.bloks.component.base.BloksModel");
        r12 = (X.DFL) r12;
        r6 = r0.A00(2);
        X.C18070vi.A0z(r6, "null cannot be cast to non-null type kotlin.Boolean");
        r6 = X.AnonymousClass000.A1Y(r6);
        r9 = X.DFL.A00(r11, 38);
        X.C18070vi.A0z(r9, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any?>");
        r9 = (java.util.Map) r9;
        r7 = r11.A0A(40);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1544:0x2323, code lost:
        if (r7 == null) goto L_0x2337;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1545:0x2325, code lost:
        r10 = X.C25974Cph.A00(r2, X.C199029zJ.A01, r7);
        X.C18070vi.A0z(r10, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any?>");
        r10 = (java.util.Map) r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1546:0x2330, code lost:
        r7 = r12.A05;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1547:0x2334, code lost:
        if (r7 == 16542) goto L_0x2346;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1549:0x2337, code lost:
        r10 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1550:0x2339, code lost:
        r5 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1552:0x233d, code lost:
        if (r7 == 17043) goto L_0x2346;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1554:0x2341, code lost:
        if (r7 == 17044) goto L_0x2346;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1555:0x2343, code lost:
        r18 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1556:0x2346, code lost:
        r18 = X.C196419v1.A00(r12, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1557:0x234a, code lost:
        r0 = r11.A09(51);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1558:0x2350, code lost:
        if (r0 == null) goto L_0x2381;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1559:0x2352, code lost:
        r0 = java.lang.Integer.valueOf(r0.A05);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1560:0x2358, code lost:
        r0 = X.C25372CeX.A00(r5, r0);
        r21 = X.BE7.A0h(r11);
        r20 = java.lang.Boolean.valueOf(r11.A0I(43, true));
        X.C18070vi.A0e(r0, 1, r9);
        r17 = new X.AHz(r18, r0, r20, r21, X.C18460wS.A00, r9, r10, false, false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1561:0x2381, code lost:
        r0 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1562:0x2383, code lost:
        if (r8 == null) goto L_0x239a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1563:0x2385, code lost:
        r1 = r8.A02;
        X.C18070vi.A0z(r1, "null cannot be cast to non-null type com.instagram.common.bloks.Host");
        X.C196419v1.A01(r5, r17, new X.CLX(r1.A00()), r7, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1565:0x239e, code lost:
        throw X.AnonymousClass000.A0n("Required value was null.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1567:0x23a3, code lost:
        throw X.AnonymousClass000.A0n("Required value was null.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1569:0x23aa, code lost:
        if (r5.equals("bk.action.animated.GetCurrentColorValue") == false) goto L_0x39f6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1570:0x23ac, code lost:
        r2 = A0G(r0);
        X.C18070vi.A0z(r2, "null cannot be cast to non-null type android.animation.ValueAnimator");
        r3 = ((android.animation.ValueAnimator) r2).getAnimatedValue();
        X.C18070vi.A0z(r3, "null cannot be cast to non-null type kotlin.Int");
        r3 = X.C108955ca.A12(java.util.Locale.US, "#%08x", java.util.Arrays.copyOf(new java.lang.Object[]{r3}, 1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1572:0x23d8, code lost:
        if (r5.equals("bk.action.GetDatetimeText") == false) goto L_0x39f6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1573:0x23da, code lost:
        r3 = A0G(r0);
        X.C18070vi.A0z(r3, "null cannot be cast to non-null type kotlin.Number");
        r7 = X.C17880vN.A05(r3);
        r3 = r0.A00(1);
        X.C18070vi.A0z(r3, "null cannot be cast to non-null type kotlin.String");
        r4 = A0L(r0, 2);
        r1 = r0.A00;
        r3 = X.AnonymousClass9OT.A00((java.lang.String) r3, r4, X.C17880vN.A0w(r1, 3), X.C17880vN.A0w(r1, 5), r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1575:0x240f, code lost:
        if (r5.equals("bk.action.ttrc.AddStep") == false) goto L_0x39f6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1576:0x2411, code lost:
        X.C18070vi.A0d(r0, 0);
        r4 = A02(r0, 0);
        r3 = r0.A00(1);
        X.C18070vi.A0z(r3, "null cannot be cast to non-null type kotlin.String");
        r1 = A0L(r0, 2);
        X.C18070vi.A0d(r1, 2);
        r0 = X.A7e.A00((java.lang.String) r3, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1577:0x242f, code lost:
        if (r0 == null) goto L_0x3a04;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1578:0x2431, code lost:
        r0.A0C(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1580:0x243c, code lost:
        if (r5.equals("bk.action.bloks.PrependEmbeddedChildren") == false) goto L_0x39f6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1581:0x243e, code lost:
        r5 = A0N(r0, r2);
        r3 = X.BE6.A13(X.BE6.A0n(r0, 1), "null cannot be cast to non-null type kotlin.collections.List<com.instagram.common.bloks.BloksParseResult>");
        r6 = A0A(r2, r0);
        r0 = A0P(r6, r3);
        r3 = new X.C26965DNn(r5);
        r2 = new X.C23733Boe(r0, 1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1583:0x2466, code lost:
        if (r5.equals("bk.action.bloks.RemoveChild") == false) goto L_0x39f6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1584:0x2468, code lost:
        X.C18070vi.A0d(r0, 0);
        X.C18070vi.A0d(r2, 1);
        r1 = r0.A00(1);
        X.C18070vi.A0X(r1);
        r1 = X.CCF.A00(r1);
        r6 = A0A(r2, r0);
        r2 = A0C(r1);
        r0 = new X.C23729Boa(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1586:0x248e, code lost:
        if (r5.equals("bk.action.text_input.AppendText") == false) goto L_0x39f6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1587:0x2490, code lost:
        r3 = A0E(r0, r2);
        r5 = A0M(r0, 1);
        r3 = (X.CTH) X.C26272CwJ.A04(A06(r2, r0, 2), r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1588:0x24a3, code lost:
        if (r3 == null) goto L_0x3a04;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1589:0x24a5, code lost:
        X.C18070vi.A0d(r5, 0);
        X.C26176Ctu.A02((java.lang.String) null);
        r1 = r3.A02;
        r0 = r3.A04;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1590:0x24b0, code lost:
        if (r1 != null) goto L_0x24c5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1591:0x24b2, code lost:
        if (r0 == null) goto L_0x24b5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1593:0x24b5, code lost:
        r0 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1594:0x24b7, code lost:
        r0 = X.AnonymousClass000.A0y(r5, X.C17890vO.A0f(r0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1595:0x24bf, code lost:
        if (r0 == null) goto L_0x24b5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1596:0x24c1, code lost:
        r3.A04 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1597:0x24c5, code lost:
        if (r0 == null) goto L_0x24d2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1598:0x24c7, code lost:
        r0 = X.AnonymousClass000.A0y(r5, X.C17890vO.A0f(r0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1599:0x24cf, code lost:
        if (r0 == null) goto L_0x24d2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1600:0x24d1, code lost:
        r5 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1601:0x24d2, code lost:
        r0 = r3.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1602:0x24d4, code lost:
        if (r0 == null) goto L_0x24d9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1603:0x24d6, code lost:
        r0.append(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1604:0x24d9, code lost:
        r3.A04 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1606:0x24e3, code lost:
        if (r5.equals("bk.action.animated.GetTotalDuration") == false) goto L_0x39f6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1607:0x24e5, code lost:
        r1 = A07(r2, r0);
        r3 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1608:0x24ea, code lost:
        if (r1 == null) goto L_0x3a10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1609:0x24ec, code lost:
        r0 = X.C26258Cw3.A02(r1, A0M(r0, 0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1610:0x24f4, code lost:
        if (r0 == null) goto L_0x3a10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1611:0x24f6, code lost:
        r4 = X.C26258Cw3.A01(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1612:0x24fe, code lost:
        if (r4 != -1) goto L_0x2506;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1613:0x2500, code lost:
        r3 = -1L;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1614:0x2506, code lost:
        r3 = java.lang.Float.valueOf(((float) r4) / ((float) X.C26258Cw3.A00));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1616:0x2517, code lost:
        if (r5.equals("bk.action.animated.CreateDimension") == false) goto L_0x39f6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1617:0x2519, code lost:
        r7 = A07(r2, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1618:0x251d, code lost:
        if (r7 == null) goto L_0x3a04;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1619:0x251f, code lost:
        r5 = X.C25488Cgj.A00(r0, 0);
        r8 = r0.A00;
        r6 = X.AnonymousClass8BT.A08(r8, 1);
        r11 = r0.A00(2);
        X.C18070vi.A0z(r11, "null cannot be cast to non-null type kotlin.String");
        r11 = (java.lang.String) r11;
        r9 = A0L(r0, 3);
        r10 = A00(r0, 4);
        r8 = (android.view.animation.Interpolator) r8.get(5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1622:0x254a, code lost:
        if (X.BE6.A1V(r11) == false) goto L_0x2557;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1623:0x254c, code lost:
        r11 = X.A90.A00(r11);
        r9 = X.A90.A00(r9);
        r0 = X.AnonymousClass00R.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1624:0x2557, code lost:
        r11 = X.A90.A01(r11);
        r9 = X.A90.A01(r9);
        r0 = X.AnonymousClass00R.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1626:?, code lost:
        r3 = new X.BNG(r0);
        r3.setFloatValues(new float[]{r11, r9});
        r3.setDuration((long) (r10 * ((float) X.C26258Cw3.A00)));
        r3.setInterpolator(r8);
        r0 = new X.C26315CxY(r5, r2, 3);
        r3 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1627:0x2580, code lost:
        r3.addUpdateListener(r0);
        r3 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1628:0x2583, code lost:
        if (r6 == null) goto L_0x3a10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1629:0x2585, code lost:
        r0 = new X.BEP(r7, r2, r6);
        r3 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1630:0x258c, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1631:0x258d, code lost:
        r3 = X.AnonymousClass8BX.A0V(r2, "Could not parse start and end values. ", X.AnonymousClass000.A10());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1633:0x259f, code lost:
        if (r5.equals("bk.action.text_input.KeyboardEventBackspace") == false) goto L_0x39f6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1634:0x25a1, code lost:
        r3 = A0E(r0, r2);
        r2 = r2.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1635:0x25a7, code lost:
        if (r2 == null) goto L_0x25cd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1636:0x25a9, code lost:
        r5 = A02(r0, 1);
        r1 = (X.CTH) X.C26272CwJ.A04(r2, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1637:0x25b3, code lost:
        if (r1 == null) goto L_0x3a04;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1638:0x25b5, code lost:
        X.C26176Ctu.A02((java.lang.String) null);
        r3 = r1.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1639:0x25bb, code lost:
        if (r3 == null) goto L_0x3a04;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1640:0x25bd, code lost:
        r2 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1641:0x25be, code lost:
        if (r2 >= r5) goto L_0x3a04;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1642:0x25c0, code lost:
        r3.dispatchKeyEvent(new android.view.KeyEvent(0, 67));
        r2 = r2 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1644:0x25d1, code lost:
        throw X.C17880vN.A0g();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1646:0x25d8, code lost:
        if (r5.equals("bk.action.bloks.AppendEmbeddedChildren") == false) goto L_0x39f6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1647:0x25da, code lost:
        r4 = A0N(r0, r2);
        r1 = X.BE6.A13(X.BE6.A0n(r0, 1), "null cannot be cast to non-null type kotlin.collections.List<com.instagram.common.bloks.BloksParseResult>");
        r6 = A0A(r2, r0);
        r1 = A0P(r6, r1);
        r3 = new X.C26965DNn(r4);
        r2 = new X.C23733Boe(r1, 2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1649:0x2603, code lost:
        if (r5.equals("bk.action.animated.Build") == false) goto L_0x39f6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1650:0x2605, code lost:
        r2 = A07(r2, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1651:0x2609, code lost:
        if (r2 == null) goto L_0x3a04;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1652:0x260b, code lost:
        r3 = A03(r0, 0);
        X.C26258Cw3.A05(r3, r2, A0M(r0, 1));
        r3 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1654:0x261e, code lost:
        if (r5.equals("bk.action.animated.Pause") == false) goto L_0x39f6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1655:0x2620, code lost:
        r1 = A07(r2, r0);
        r3 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1656:0x2628, code lost:
        if (r1 == null) goto L_0x3a10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1657:0x262a, code lost:
        r1 = X.C26258Cw3.A02(r1, A0M(r0, 0));
        r3 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1658:0x2632, code lost:
        if (r1 == null) goto L_0x3a10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1659:0x2634, code lost:
        r0 = r1.isPaused();
        r1.pause();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1660:0x263b, code lost:
        if (r0 != false) goto L_0x317f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1662:0x2641, code lost:
        if (r1.isPaused() == false) goto L_0x317f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1665:0x264b, code lost:
        if (r5.equals("bk.action.animated.Start") == false) goto L_0x39f6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1666:0x264d, code lost:
        r7 = A07(r2, r0);
        r3 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1667:0x2652, code lost:
        if (r7 == null) goto L_0x3a10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1668:0x2654, code lost:
        r6 = A03(r0, 0);
        r5 = X.C26258Cw3.A01;
        r4 = X.AnonymousClass000.A10();
        r4.append("NO_ID");
        r4 = X.C17890vO.A0V(java.util.UUID.randomUUID(), r4);
        X.C26258Cw3.A05(r6, r7, r4);
        r0 = r2.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1669:0x2670, code lost:
        if (r0 == null) goto L_0x2675;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1670:0x2672, code lost:
        r0.BUC();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1671:0x2675, code lost:
        r5.A06(r7, r4, true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1673:0x2680, code lost:
        if (r5.equals("bk.action.animated.Cancel") == false) goto L_0x39f6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1674:0x2682, code lost:
        X.C18070vi.A0d(r0, 0);
        r0 = A03(r0, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1675:0x2689, code lost:
        r0.cancel();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1677:0x2694, code lost:
        if (r5.equals("bk.action.animated.Create") == false) goto L_0x39f6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1678:0x2696, code lost:
        r8 = A07(r2, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1679:0x269a, code lost:
        if (r8 == null) goto L_0x3a04;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1680:0x269c, code lost:
        r7 = X.C25488Cgj.A00(r0, 0);
        r9 = r0.A00;
        r6 = X.AnonymousClass8BT.A08(r9, 1);
        r5 = r0.A00(2);
        X.C18070vi.A0z(r5, "null cannot be cast to non-null type kotlin.Number");
        r12 = X.AnonymousClass000.A04(r5);
        r5 = A01(r0, 3);
        r10 = A01(r0, 4);
        r3 = new X.BER();
        r3.setFloatValues(new float[]{r12, r5});
        r3.setDuration((long) (r10 * ((float) X.C26258Cw3.A00)));
        r3.setInterpolator((android.view.animation.Interpolator) r9.get(5));
        r3.addUpdateListener(new X.C26315CxY(r7, r2, 1));
        r3 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1681:0x26e6, code lost:
        if (r6 == null) goto L_0x3a10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1682:0x26e8, code lost:
        r0 = new X.BEP(r8, r2, r6);
        r3 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1684:0x26f5, code lost:
        if (r5.equals("bk.action.accessibility.Announcement") == false) goto L_0x39f6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1685:0x26f7, code lost:
        r4 = A0I(r0, r2);
        r0 = r2.A00;
        r3 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1686:0x26fe, code lost:
        if (r0 == null) goto L_0x2727;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1687:0x2700, code lost:
        r2 = r0.A00.getSystemService("accessibility");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1688:0x2708, code lost:
        r2 = (android.view.accessibility.AccessibilityManager) r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1689:0x270a, code lost:
        if (r2 == null) goto L_0x3a10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1691:0x2710, code lost:
        if (r2.isEnabled() != true) goto L_0x3a10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1692:0x2712, code lost:
        r1 = android.view.accessibility.AccessibilityEvent.obtain();
        r1.setEventType(16384);
        r1.getText().add(r4);
        r2.sendAccessibilityEvent(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1693:0x2727, code lost:
        r2 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1695:0x272f, code lost:
        if (r5.equals("bk.action.bloks.GetParameter") == false) goto L_0x39f6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1696:0x2731, code lost:
        r1 = A0I(r0, r2);
        X.AnonymousClass8BR.A1I(r1);
        r3 = X.C25881Cns.A00(r2).A03.get((java.lang.String) r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1698:0x274c, code lost:
        if (r5.equals("bk.action.media.LoadMediaV3") == false) goto L_0x39f6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1699:0x274e, code lost:
        r5 = A07(r2, r0);
        r3 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1700:0x2753, code lost:
        if (r5 == null) goto L_0x3a10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1701:0x2755, code lost:
        r2 = (java.util.Map) r5.A01(2131428169);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1702:0x2760, code lost:
        if (r2 != null) goto L_0x2764;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1703:0x2762, code lost:
        r6 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1704:0x2764, code lost:
        r6 = (X.CVW) r2.get("media_store");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1706:0x276c, code lost:
        if ((r6 instanceof com.bloks.stdlib.datamodules.mediastore.MediaStoreDataModule) == false) goto L_0x27a2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1707:0x276e, code lost:
        r6 = (com.bloks.stdlib.datamodules.mediastore.MediaStoreDataModule) r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1708:0x2770, code lost:
        if (r6 == null) goto L_0x27a2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1709:0x2772, code lost:
        r8 = A0M(r0, 0);
        r2 = r0.A00;
        r9 = (java.util.List) r2.get(1);
        r10 = X.C17880vN.A0w(r2, 2);
        r1 = (java.lang.Number) r2.get(3);
        r12 = X.C17880vN.A0w(r2, 4);
        r7 = r5.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1710:0x2791, code lost:
        if (r1 == null) goto L_0x27a0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1711:0x2793, code lost:
        r11 = java.lang.Integer.valueOf(r1.intValue());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1712:0x279b, code lost:
        r6.loadMedia(r7, r8, r9, r10, r11, r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1713:0x27a0, code lost:
        r11 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1714:0x27a2, code lost:
        X.C25913CoX.A01("bk.action.media.LoadMediaV3", "Failed to load media: MediaStore data module is not found.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1716:0x27af, code lost:
        if (r5.equals("bk.action.text.GetText") == false) goto L_0x39f6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1717:0x27b1, code lost:
        X.C18070vi.A0d(r0, 0);
        r2 = X.AnonymousClass8BR.A0G(r0.A00, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1718:0x27ba, code lost:
        if (r2 == null) goto L_0x3a04;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1720:0x27c0, code lost:
        if (r2.A05 != 13335) goto L_0x3a04;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1721:0x27c2, code lost:
        r0 = r2.A09(44);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1722:0x27c8, code lost:
        if (r0 == null) goto L_0x27d4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1723:0x27ca, code lost:
        r3 = X.CBz.A00(r0).toString();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1724:0x27d4, code lost:
        r3 = X.BE7.A0h(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1726:0x27e0, code lost:
        if (r5.equals("bk.action.video.GetPlaybackStateV3") == false) goto L_0x39f6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1727:0x27e2, code lost:
        X.C18070vi.A0d(r0, 0);
        X.C18070vi.A0d(r2, 1);
        r2 = r2.A00;
        r3 = "unprepared";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1728:0x27ec, code lost:
        if (r2 == null) goto L_0x3a10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1729:0x27ee, code lost:
        r1 = X.BE7.A0d(A0D(r0, 0));
        r3 = "unprepared";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1730:0x27f6, code lost:
        if (r1 != null) goto L_0x3977;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1732:0x27fc, code lost:
        throw X.C17880vN.A0g();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1734:0x2803, code lost:
        if (r5.equals("bk.action.bloks.InsertEmbeddedChildrenBefore") == false) goto L_0x39f6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1735:0x2805, code lost:
        r1 = X.BE6.A13(A0J(r0, r2), "null cannot be cast to non-null type kotlin.collections.List<com.instagram.common.bloks.BloksParseResult>");
        r3 = A0K(r0);
        r5 = A0B(r2, r0);
        r1 = A0P(r5, r1);
        r6 = A0C(r3);
        r2 = new X.C23735Bog(r1, 0, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1737:0x282c, code lost:
        if (r5.equals("bk.action.animated.IsInitialized") == false) goto L_0x39f6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1738:0x282e, code lost:
        r1 = A07(r2, r0);
        r2 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1739:0x2833, code lost:
        if (r1 == null) goto L_0x2863;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1741:0x283d, code lost:
        if (X.C26258Cw3.A02(r1, A0M(r0, 0)) == null) goto L_0x380d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1744:0x2847, code lost:
        if (r5.equals("bk.action.video.GetIsMutedV2") == false) goto L_0x39f6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1745:0x2849, code lost:
        r3 = X.BE7.A0d(A0E(r0, r2));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1746:0x2851, code lost:
        if (r3 == null) goto L_0x2869;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1747:0x2853, code lost:
        r1 = r2.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1748:0x2855, code lost:
        if (r1 == null) goto L_0x2863;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1749:0x2857, code lost:
        ((java.util.AbstractMap) r1.A01(2131428187)).get(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1750:0x2863, code lost:
        r3 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1752:0x286d, code lost:
        throw X.C17880vN.A0g();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1754:0x2874, code lost:
        if (r5.equals("bk.action.text.IsTruncated") == false) goto L_0x39f6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1755:0x2876, code lost:
        r1 = A0E(r0, r2).A06(r2.A00);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1756:0x2882, code lost:
        if ((r1 instanceof com.facebook.rendercore.text.RCTextView) == false) goto L_0x28a0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1757:0x2884, code lost:
        r1 = (com.facebook.rendercore.text.RCTextView) r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1758:0x2888, code lost:
        if (r1.A04 != false) goto L_0x317d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1759:0x288a, code lost:
        r2 = r1.A02;
        r0 = X.C26086Cs4.A00;
        r1 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1761:0x2893, code lost:
        if (r1 >= r2.getLineCount()) goto L_0x317f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1763:0x2899, code lost:
        if (r2.getEllipsisCount(r1) <= 0) goto L_0x289d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1765:0x289d, code lost:
        r1 = r1 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1766:0x28a0, code lost:
        X.C25913CoX.A01("bk.action.text.IsTruncated", "called on non-text component");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1768:0x28ad, code lost:
        if (r5.equals("bk.action.i18n.LanguagePackResolveFbt") == false) goto L_0x39f6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1769:0x28af, code lost:
        X.C18070vi.A0d(r0, 0);
        X.C18070vi.A0d(r2, 1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1771:?, code lost:
        r6 = r0.A00(0);
        X.C18070vi.A0z(r6, "null cannot be cast to non-null type kotlin.String");
        r9 = X.BE6.A13(r0.A00(1), "null cannot be cast to non-null type kotlin.collections.List<kotlin.Int>");
        r15 = X.BE6.A13(r0.A00(2), "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
        r8 = A0L(r0, 3);
        r5 = A0L(r0, 4);
        r6 = java.nio.ByteBuffer.wrap(android.util.Base64.decode((java.lang.String) r6, 0));
        X.C18070vi.A0d(r5, 2);
        r12 = new java.lang.Object();
        r6.order(java.nio.ByteOrder.LITTLE_ENDIAN);
        r12.A00 = r6.getInt(r6.position()) + r6.position();
        r12.A01 = r6;
        r12.A01.getInt(r12.A02(8) + r12.A00);
        r12.A01.getInt(r12.A02(14) + r12.A00);
        r12.A01.getInt(r12.A02(20) + r12.A00);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1772:0x2936, code lost:
        if ("pt_PT".equals(r5) == false) goto L_0x2969;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1773:0x2938, code lost:
        r11 = new java.lang.Object();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1774:0x293d, code lost:
        r7 = X.C17880vN.A11();
        r2 = r12.A02(24);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1775:0x2947, code lost:
        if (r2 == 0) goto L_0x2967;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1776:0x2949, code lost:
        r6 = r12.A01.getInt(X.C25719Ckp.A00(r12, r2));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1777:0x2953, code lost:
        r2 = r12.A02(26);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1778:0x2959, code lost:
        if (r2 == 0) goto L_0x2f20;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1779:0x295b, code lost:
        r3 = r12.A01.getInt(X.C25719Ckp.A00(r12, r2));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1780:0x2967, code lost:
        r6 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1781:0x2969, code lost:
        r3 = X.AnonymousClass1YF.A0S(r5, new java.lang.String[]{"_"}, 0).get(0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1782:0x297d, code lost:
        if (androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility.JSON_KEY_ID.equals(r3) != false) goto L_0x2f19;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1784:0x2985, code lost:
        if ("ig".equals(r3) != false) goto L_0x2f19;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1786:0x298d, code lost:
        if ("ja".equals(r3) != false) goto L_0x2f19;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1788:0x2995, code lost:
        if ("jv".equals(r3) != false) goto L_0x2f19;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1790:0x299d, code lost:
        if ("km".equals(r3) != false) goto L_0x2f19;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1792:0x29a5, code lost:
        if ("ko".equals(r3) != false) goto L_0x2f19;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1794:0x29ad, code lost:
        if ("lo".equals(r3) != false) goto L_0x2f19;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1796:0x29b5, code lost:
        if ("ms".equals(r3) != false) goto L_0x2f19;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1798:0x29bd, code lost:
        if ("qz".equals(r3) != false) goto L_0x2f19;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1800:0x29c5, code lost:
        if ("th".equals(r3) != false) goto L_0x2f19;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1802:0x29cd, code lost:
        if ("vi".equals(r3) != false) goto L_0x2f19;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1804:0x29d5, code lost:
        if ("wo".equals(r3) != false) goto L_0x2f19;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1806:0x29dd, code lost:
        if ("yo".equals(r3) != false) goto L_0x2f19;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1808:0x29e5, code lost:
        if ("zh".equals(r3) != false) goto L_0x2f19;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1810:0x29ed, code lost:
        if ("am".equals(r3) != false) goto L_0x2f12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1812:0x29f5, code lost:
        if ("as".equals(r3) != false) goto L_0x2f12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1814:0x29fd, code lost:
        if ("bn".equals(r3) != false) goto L_0x2f12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1816:0x2a05, code lost:
        if ("eh".equals(r3) != false) goto L_0x2f12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1818:0x2a0d, code lost:
        if ("fa".equals(r3) != false) goto L_0x2f12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1820:0x2a15, code lost:
        if ("gu".equals(r3) != false) goto L_0x2f12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1822:0x2a1d, code lost:
        if ("kn".equals(r3) != false) goto L_0x2f12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1824:0x2a25, code lost:
        if ("mr".equals(r3) != false) goto L_0x2f12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1826:0x2a2d, code lost:
        if ("zu".equals(r3) != false) goto L_0x2f12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1828:0x2a35, code lost:
        if ("ff".equals(r3) != false) goto L_0x2f0b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1830:0x2a3d, code lost:
        if ("fr".equals(r3) != false) goto L_0x2f0b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1832:0x2a45, code lost:
        if ("hy".equals(r3) != false) goto L_0x2f0b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1834:0x2a4d, code lost:
        if ("qk".equals(r3) != false) goto L_0x2f0b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1836:0x2a55, code lost:
        if ("pt".equals(r3) == false) goto L_0x2a60;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1837:0x2a57, code lost:
        r11 = new java.lang.Object();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1838:0x2a5c, code lost:
        r11 = (X.E4R) r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1840:0x2a66, code lost:
        if ("ca".equals(r3) != false) goto L_0x2f04;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1842:0x2a6e, code lost:
        if ("de".equals(r3) != false) goto L_0x2f04;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1844:0x2a76, code lost:
        if ("en".equals(r3) != false) goto L_0x2f04;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1846:0x2a7e, code lost:
        if ("et".equals(r3) != false) goto L_0x2f04;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1848:0x2a86, code lost:
        if ("fi".equals(r3) != false) goto L_0x2f04;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1850:0x2a8e, code lost:
        if ("fy".equals(r3) != false) goto L_0x2f04;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1852:0x2a96, code lost:
        if ("gl".equals(r3) != false) goto L_0x2f04;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1854:0x2a9e, code lost:
        if ("it".equals(r3) != false) goto L_0x2f04;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1856:0x2aa6, code lost:
        if ("nl".equals(r3) != false) goto L_0x2f04;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1858:0x2aae, code lost:
        if ("sc".equals(r3) != false) goto L_0x2f04;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1860:0x2ab6, code lost:
        if ("sv".equals(r3) != false) goto L_0x2f04;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1862:0x2abe, code lost:
        if ("sw".equals(r3) != false) goto L_0x2f04;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1864:0x2ac6, code lost:
        if ("ur".equals(r3) != false) goto L_0x2f04;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1866:0x2ace, code lost:
        if ("yi".equals(r3) != false) goto L_0x2f04;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1868:0x2ad6, code lost:
        if ("si".equals(r3) == false) goto L_0x2adf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1869:0x2ad8, code lost:
        r11 = new java.lang.Object();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1871:0x2ae5, code lost:
        if ("ak".equals(r3) != false) goto L_0x2efd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1873:0x2aed, code lost:
        if ("ln".equals(r3) != false) goto L_0x2efd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1875:0x2af5, code lost:
        if ("mg".equals(r3) != false) goto L_0x2efd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1877:0x2afd, code lost:
        if ("ns".equals(r3) != false) goto L_0x2efd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1879:0x2b05, code lost:
        if ("pa".equals(r3) != false) goto L_0x2efd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1881:0x2b0d, code lost:
        if ("tz".equals(r3) == false) goto L_0x2b16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1882:0x2b0f, code lost:
        r11 = new java.lang.Object();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1884:0x2b1c, code lost:
        if ("af".equals(r3) != false) goto L_0x2ef6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1886:0x2b24, code lost:
        if ("az".equals(r3) != false) goto L_0x2ef6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1888:0x2b2c, code lost:
        if ("bg".equals(r3) != false) goto L_0x2ef6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:188:0x02bf, code lost:
        r1 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1890:0x2b34, code lost:
        if ("cb".equals(r3) != false) goto L_0x2ef6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1892:0x2b3c, code lost:
        if ("ck".equals(r3) != false) goto L_0x2ef6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1894:0x2b44, code lost:
        if ("el".equals(r3) != false) goto L_0x2ef6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1896:0x2b4c, code lost:
        if ("em".equals(r3) != false) goto L_0x2ef6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1898:0x2b54, code lost:
        if ("eo".equals(r3) != false) goto L_0x2ef6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:189:0x02c4, code lost:
        if (r5.equals(r4) != false) goto L_0x02c7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1900:0x2b5c, code lost:
        if ("es".equals(r3) != false) goto L_0x2ef6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1902:0x2b64, code lost:
        if ("eu".equals(r3) != false) goto L_0x2ef6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1904:0x2b6c, code lost:
        if ("fo".equals(r3) != false) goto L_0x2ef6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1906:0x2b74, code lost:
        if ("ha".equals(r3) != false) goto L_0x2ef6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1908:0x2b7c, code lost:
        if ("hu".equals(r3) != false) goto L_0x2ef6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:190:0x02c6, code lost:
        r1 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1910:0x2b84, code lost:
        if ("ka".equals(r3) != false) goto L_0x2ef6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1912:0x2b8c, code lost:
        if ("kk".equals(r3) != false) goto L_0x2ef6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1914:0x2b94, code lost:
        if ("ks".equals(r3) != false) goto L_0x2ef6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1916:0x2b9c, code lost:
        if ("ku".equals(r3) != false) goto L_0x2ef6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1918:0x2ba4, code lost:
        if ("ky".equals(r3) != false) goto L_0x2ef6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:191:0x02c7, code lost:
        r0 = r34;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1920:0x2bac, code lost:
        if ("lg".equals(r3) != false) goto L_0x2ef6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1922:0x2bb4, code lost:
        if ("ml".equals(r3) != false) goto L_0x2ef6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1924:0x2bbc, code lost:
        if ("mn".equals(r3) != false) goto L_0x2ef6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1926:0x2bc4, code lost:
        if ("nb".equals(r3) != false) goto L_0x2ef6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1928:0x2bcc, code lost:
        if ("nd".equals(r3) != false) goto L_0x2ef6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:192:0x02c9, code lost:
        if (r1 == false) goto L_0x3a06;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1930:0x2bd4, code lost:
        if ("ne".equals(r3) != false) goto L_0x2ef6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1932:0x2bdc, code lost:
        if ("nn".equals(r3) != false) goto L_0x2ef6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1934:0x2be4, code lost:
        if ("nr".equals(r3) != false) goto L_0x2ef6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1936:0x2bec, code lost:
        if ("ny".equals(r3) != false) goto L_0x2ef6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1938:0x2bf4, code lost:
        if ("om".equals(r3) != false) goto L_0x2ef6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1940:0x2bfc, code lost:
        if ("or".equals(r3) != false) goto L_0x2ef6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1942:0x2c04, code lost:
        if ("ps".equals(r3) != false) goto L_0x2ef6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1944:0x2c0c, code lost:
        if ("rm".equals(r3) != false) goto L_0x2ef6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1946:0x2c14, code lost:
        if ("sn".equals(r3) != false) goto L_0x2ef6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1948:0x2c1c, code lost:
        if ("so".equals(r3) != false) goto L_0x2ef6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:194:0x02cd, code lost:
        switch(r3) {
            case -2117986441: goto L_0x02d2;
            case -2056543270: goto L_0x02ee;
            case -2026866692: goto L_0x0317;
            case -2022606713: goto L_0x0342;
            case -2010677929: goto L_0x03b8;
            case -1992425284: goto L_0x03f2;
            case -1946563488: goto L_0x0493;
            case -1861584650: goto L_0x04d8;
            case -1841247856: goto L_0x0509;
            case -1805214761: goto L_0x053f;
            case -1802986003: goto L_0x05aa;
            case -1789084421: goto L_0x05ad;
            case -1781978860: goto L_0x05bf;
            case -1777951752: goto L_0x0635;
            case -1754815326: goto L_0x06a5;
            case -1735832563: goto L_0x06c6;
            case -1695660097: goto L_0x06e2;
            case -1676484103: goto L_0x06fb;
            case -1661285048: goto L_0x0720;
            case -1661285047: goto L_0x074c;
            case -1659672016: goto L_0x0778;
            case -1646637091: goto L_0x079d;
            case -1626463895: goto L_0x07fe;
            case -1623031430: goto L_0x0ad0;
            case -1611102039: goto L_0x0b35;
            case -1588639886: goto L_0x0b77;
            case -1518247991: goto L_0x0bc0;
            case -1483567756: goto L_0x0c10;
            case -1458151270: goto L_0x0c51;
            case -1443238847: goto L_0x0cac;
            case -1438001835: goto L_0x0ce6;
            case -1392615196: goto L_0x0d22;
            case -1391375021: goto L_0x0d3b;
            case -1384591763: goto L_0x0dbd;
            case -1370121672: goto L_0x0de8;
            case -1334580548: goto L_0x0e17;
            case -1327258861: goto L_0x0e7a;
            case -1298116857: goto L_0x0ec4;
            case -1276704697: goto L_0x0f02;
            case -1228789912: goto L_0x0f06;
            case -1162458791: goto L_0x0f58;
            case -1137953049: goto L_0x0f7d;
            case -1113972044: goto L_0x0fb9;
            case -1014172836: goto L_0x0fd0;
            case -985271337: goto L_0x1008;
            case -980451716: goto L_0x1037;
            case -965026292: goto L_0x1056;
            case -954842977: goto L_0x106b;
            case -925654548: goto L_0x116b;
            case -919818711: goto L_0x1192;
            case -914746283: goto L_0x11b2;
            case -903105410: goto L_0x1207;
            case -882687321: goto L_0x1247;
            case -876004762: goto L_0x1275;
            case -860553091: goto L_0x12f8;
            case -825948964: goto L_0x14be;
            case -810619240: goto L_0x14e9;
            case -791813135: goto L_0x150b;
            case -791813134: goto L_0x1527;
            case -776958417: goto L_0x1543;
            case -736419327: goto L_0x1570;
            case -729463970: goto L_0x1626;
            case -717377024: goto L_0x167f;
            case -689451380: goto L_0x16c8;
            case -686296522: goto L_0x1708;
            case -665884313: goto L_0x1720;
            case -640941045: goto L_0x1777;
            case -587000068: goto L_0x179a;
            case -573790654: goto L_0x17b9;
            case -545332995: goto L_0x17e5;
            case -528351887: goto L_0x180d;
            case -387628292: goto L_0x18d5;
            case -362131820: goto L_0x18f2;
            case -311533821: goto L_0x190e;
            case -275596506: goto L_0x1920;
            case -232028360: goto L_0x1935;
            case -214348689: goto L_0x1978;
            case -192998245: goto L_0x19dd;
            case -169377409: goto L_0x19f8;
            case -166805122: goto L_0x1a56;
            case -79583337: goto L_0x1a8d;
            case -71914581: goto L_0x1abe;
            case -67237747: goto L_0x1b1a;
            case -27526514: goto L_0x1b2a;
            case -24816282: goto L_0x1b69;
            case 3392903: goto L_0x1b99;
            case 23735743: goto L_0x1bad;
            case 31908788: goto L_0x1d25;
            case 94084688: goto L_0x1d7a;
            case 107264602: goto L_0x1da1;
            case 117073323: goto L_0x1df3;
            case 141784070: goto L_0x39ee;
            case 144735095: goto L_0x1e18;
            case 159720655: goto L_0x1e5c;
            case 163454477: goto L_0x2841;
            case 177085473: goto L_0x1ee9;
            case 201706399: goto L_0x1f07;
            case 211494449: goto L_0x1f49;
            case 226394026: goto L_0x1f81;
            case 226436345: goto L_0x1fd1;
            case 227534897: goto L_0x2002;
            case 250746789: goto L_0x2045;
            case 258140093: goto L_0x205a;
            case 290488333: goto L_0x207e;
            case 321881678: goto L_0x20a3;
            case 330028918: goto L_0x20db;
            case 351706759: goto L_0x20f9;
            case 358283377: goto L_0x215a;
            case 445300143: goto L_0x21c2;
            case 445536294: goto L_0x223b;
            case 459398657: goto L_0x2285;
            case 480128519: goto L_0x22b8;
            case 487489668: goto L_0x22ca;
            case 502083769: goto L_0x22d9;
            case 511230409: goto L_0x23a4;
            case 512914731: goto L_0x23d2;
            case 561587779: goto L_0x2409;
            case 610867619: goto L_0x2436;
            case 617100356: goto L_0x2460;
            case 697497290: goto L_0x2488;
            case 706379162: goto L_0x24dd;
            case 748692594: goto L_0x2511;
            case 787893679: goto L_0x2599;
            case 827053335: goto L_0x25d2;
            case 859362582: goto L_0x25fd;
            case 871707806: goto L_0x2618;
            case 875025162: goto L_0x2645;
            case 880735442: goto L_0x267a;
            case 896165716: goto L_0x268e;
            case 907240538: goto L_0x26ef;
            case 922966311: goto L_0x2729;
            case 944376542: goto L_0x2746;
            case 978494805: goto L_0x27a9;
            case 1006238115: goto L_0x27da;
            case 1067520376: goto L_0x02e0;
            case 1073247701: goto L_0x27fd;
            case 1092233714: goto L_0x2826;
            case 1096446054: goto L_0x286e;
            case 1156533274: goto L_0x28a7;
            case 1208990953: goto L_0x307c;
            case 1225820697: goto L_0x30a4;
            case 1265167879: goto L_0x30c0;
            case 1279004111: goto L_0x30d2;
            case 1287216889: goto L_0x3128;
            case 1314033285: goto L_0x314e;
            case 1335151616: goto L_0x3186;
            case 1335478715: goto L_0x31d1;
            case 1338730161: goto L_0x324c;
            case 1432836261: goto L_0x3291;
            case 1484610764: goto L_0x32b4;
            case 1500489556: goto L_0x333b;
            case 1522534035: goto L_0x3360;
            case 1572781663: goto L_0x3389;
            case 1588846766: goto L_0x33f2;
            case 1609278959: goto L_0x3415;
            case 1750927385: goto L_0x3509;
            case 1771618954: goto L_0x3562;
            case 1787890418: goto L_0x3582;
            case 1787916319: goto L_0x35a1;
            case 1834855622: goto L_0x35cb;
            case 1841033634: goto L_0x35f7;
            case 1851570220: goto L_0x364d;
            case 1866622129: goto L_0x3751;
            case 1890077967: goto L_0x379c;
            case 1907888977: goto L_0x37bd;
            case 1915396256: goto L_0x37f1;
            case 1947372055: goto L_0x3813;
            case 1995238836: goto L_0x38a6;
            case 2009638089: goto L_0x38cb;
            case 2048462760: goto L_0x38f9;
            case 2049614022: goto L_0x393b;
            case 2077597237: goto L_0x3956;
            case 2090086965: goto L_0x3985;
            case 2098589378: goto L_0x39a7;
            case 2100418198: goto L_0x39c6;
            default: goto L_0x02d0;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1950:0x2c24, code lost:
        if ("sq".equals(r3) != false) goto L_0x2ef6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1952:0x2c2c, code lost:
        if ("ss".equals(r3) != false) goto L_0x2ef6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1954:0x2c34, code lost:
        if ("st".equals(r3) != false) goto L_0x2ef6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1956:0x2c3c, code lost:
        if ("sy".equals(r3) != false) goto L_0x2ef6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1958:0x2c44, code lost:
        if ("ta".equals(r3) != false) goto L_0x2ef6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1960:0x2c4c, code lost:
        if ("te".equals(r3) != false) goto L_0x2ef6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1962:0x2c54, code lost:
        if ("tk".equals(r3) != false) goto L_0x2ef6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1964:0x2c5c, code lost:
        if ("tn".equals(r3) != false) goto L_0x2ef6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1966:0x2c64, code lost:
        if ("tr".equals(r3) != false) goto L_0x2ef6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1968:0x2c6c, code lost:
        if ("ts".equals(r3) != false) goto L_0x2ef6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1970:0x2c74, code lost:
        if ("uz".equals(r3) != false) goto L_0x2ef6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1972:0x2c7c, code lost:
        if ("ve".equals(r3) != false) goto L_0x2ef6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1974:0x2c84, code lost:
        if ("xh".equals(r3) != false) goto L_0x2ef6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1976:0x2c8c, code lost:
        if ("da".equals(r3) == false) goto L_0x2c95;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1977:0x2c8e, code lost:
        r11 = new java.lang.Object();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1979:0x2c9b, code lost:
        if ("is".equals(r3) == false) goto L_0x2ca4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:197:0x02d8, code lost:
        if (r5.equals("bk.action.io.CurrentTimeMillis") == false) goto L_0x39f6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1980:0x2c9d, code lost:
        r11 = new java.lang.Object();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1982:0x2caa, code lost:
        if ("mk".equals(r3) == false) goto L_0x2cb3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1983:0x2cac, code lost:
        r11 = new java.lang.Object();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1985:0x2cb9, code lost:
        if ("tl".equals(r3) == false) goto L_0x2cc2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1986:0x2cbb, code lost:
        r11 = new java.lang.Object();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1988:0x2cc8, code lost:
        if ("lv".equals(r3) == false) goto L_0x2cd1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1989:0x2cca, code lost:
        r11 = new java.lang.Object();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:198:0x02da, code lost:
        r3 = X.C108955ca.A0m();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1991:0x2cd7, code lost:
        if ("iu".equals(r3) != false) goto L_0x2eef;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1993:0x2cdf, code lost:
        if ("se".equals(r3) != false) goto L_0x2eef;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1995:0x2ce7, code lost:
        if ("ro".equals(r3) == false) goto L_0x2cf0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1996:0x2ce9, code lost:
        r11 = new java.lang.Object();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1998:0x2cf6, code lost:
        if ("bs".equals(r3) != false) goto L_0x2ee8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:199:0x02e0, code lost:
        if (r6 == false) goto L_0x39f6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2000:0x2cfe, code lost:
        if ("hr".equals(r3) != false) goto L_0x2ee8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2002:0x2d06, code lost:
        if ("sr".equals(r3) != false) goto L_0x2ee8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2004:0x2d0e, code lost:
        if ("sl".equals(r3) == false) goto L_0x2d17;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2005:0x2d10, code lost:
        r11 = new java.lang.Object();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2007:0x2d1d, code lost:
        if ("qb".equals(r3) != false) goto L_0x2ee1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2009:0x2d25, code lost:
        if ("qs".equals(r3) != false) goto L_0x2ee1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:200:0x02e2, code lost:
        X.C18070vi.A0d(r0, 0);
        X.AnonymousClass0O7.A01(A0M(r0, 0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2011:0x2d2d, code lost:
        if ("he".equals(r3) == false) goto L_0x2d36;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2012:0x2d2f, code lost:
        r11 = new java.lang.Object();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2014:0x2d3c, code lost:
        if ("cs".equals(r3) != false) goto L_0x2eda;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2016:0x2d44, code lost:
        if ("sk".equals(r3) != false) goto L_0x2eda;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2018:0x2d4c, code lost:
        if ("pl".equals(r3) == false) goto L_0x2d55;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2019:0x2d4e, code lost:
        r11 = new java.lang.Object();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2021:0x2d5b, code lost:
        if ("be".equals(r3) == false) goto L_0x2d64;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2022:0x2d5d, code lost:
        r11 = new java.lang.Object();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2024:0x2d6a, code lost:
        if ("lt".equals(r3) == false) goto L_0x2d73;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2025:0x2d6c, code lost:
        r11 = new java.lang.Object();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2027:0x2d79, code lost:
        if ("mt".equals(r3) == false) goto L_0x2d82;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2028:0x2d7b, code lost:
        r11 = new java.lang.Object();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:202:0x02f4, code lost:
        if (r5.equals("bk.action.visibility_context.GetTimeSinceLastImpressionInMS") == false) goto L_0x39f6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2030:0x2d88, code lost:
        if ("ru".equals(r3) != false) goto L_0x2ed3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2032:0x2d90, code lost:
        if ("uk".equals(r3) != false) goto L_0x2ed3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2034:0x2d98, code lost:
        if ("br".equals(r3) == false) goto L_0x2da1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2035:0x2d9a, code lost:
        r11 = new java.lang.Object();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2037:0x2da7, code lost:
        if ("ga".equals(r3) == false) goto L_0x2db0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2038:0x2da9, code lost:
        r11 = new java.lang.Object();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:203:0x02f6, code lost:
        X.C18070vi.A0d(r0, 0);
        r1 = X.BE6.A0n(r0, 0);
        X.C18070vi.A0z(r1, "null cannot be cast to non-null type com.bloks.foa.visibility.ViewpointSnapshotWithData");
        r2 = java.lang.System.currentTimeMillis();
        r0 = ((X.C128246fg) r1).A01;
        X.C18070vi.A0X(r0);
        r3 = X.C108945cZ.A1B(r2, r0.longValue());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2040:0x2db6, code lost:
        if ("ar".equals(r3) == false) goto L_0x2dbf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2041:0x2db8, code lost:
        r11 = new java.lang.Object();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2043:0x2dc5, code lost:
        if ("cy".equals(r3) == false) goto L_0x2dce;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2044:0x2dc7, code lost:
        r11 = new java.lang.Object();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2046:0x2dd4, code lost:
        if ("cx".equals(r3) != false) goto L_0x2ecc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2048:0x2ddc, code lost:
        if ("fv".equals(r3) != false) goto L_0x2ecc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2050:0x2de4, code lost:
        if ("su".equals(r3) != false) goto L_0x2ecc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2052:0x2dec, code lost:
        if ("co".equals(r3) != false) goto L_0x2ec5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2054:0x2df4, code lost:
        if ("fb".equals(r3) != false) goto L_0x2ec5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2056:0x2dfc, code lost:
        if ("gn".equals(r3) != false) goto L_0x2ec5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2058:0x2e04, code lost:
        if ("gx".equals(r3) != false) goto L_0x2ec5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:205:0x031d, code lost:
        if (r5.equals("bk.action.array.Concat") == false) goto L_0x39f6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2060:0x2e0c, code lost:
        if ("ht".equals(r3) != false) goto L_0x2ec5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2062:0x2e14, code lost:
        if ("la".equals(r3) != false) goto L_0x2ec5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2064:0x2e1c, code lost:
        if ("li".equals(r3) != false) goto L_0x2ec5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2066:0x2e24, code lost:
        if ("qc".equals(r3) != false) goto L_0x2ec5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2068:0x2e2c, code lost:
        if ("rw".equals(r3) != false) goto L_0x2ec5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:206:0x031f, code lost:
        X.C18070vi.A0d(r0, 0);
        r5 = r0.A00;
        r2 = X.BE6.A13(r5.get(0), "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
        r0 = X.BE6.A13(r5.get(1), "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
        r3 = X.AnonymousClass000.A13();
        r3.addAll(r2);
        r3.addAll(r0);
        r3 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2070:0x2e34, code lost:
        if ("zz".equals(r3) != false) goto L_0x2ec5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2072:0x2e3c, code lost:
        if ("mi".equals(r3) != false) goto L_0x2ebe;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2074:0x2e44, code lost:
        if ("tg".equals(r3) != false) goto L_0x2ebe;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2076:0x2e4c, code lost:
        if ("tt".equals(r3) == false) goto L_0x2e55;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2077:0x2e4e, code lost:
        r11 = new java.lang.Object();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2079:0x2e5b, code lost:
        if ("sa".equals(r3) == false) goto L_0x2e64;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2080:0x2e5d, code lost:
        r11 = new java.lang.Object();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2082:0x2e6a, code lost:
        if ("qu".equals(r3) == false) goto L_0x2e73;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2083:0x2e6c, code lost:
        r11 = new java.lang.Object();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2085:0x2e79, code lost:
        if ("ay".equals(r3) == false) goto L_0x2e82;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2086:0x2e7b, code lost:
        r11 = new java.lang.Object();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2088:0x2e88, code lost:
        if ("sz".equals(r3) == false) goto L_0x2e91;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2089:0x2e8a, code lost:
        r11 = new java.lang.Object();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:208:0x0348, code lost:
        if (r5.equals("bk.action.bloks.IndexOfChild") == false) goto L_0x39f6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2091:0x2e97, code lost:
        if ("bp".equals(r3) == false) goto L_0x2ea0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2092:0x2e99, code lost:
        r11 = new java.lang.Object();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2094:0x2ea6, code lost:
        if ("ik".equals(r3) == false) goto L_0x2eaf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2095:0x2ea8, code lost:
        r11 = new java.lang.Object();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2097:0x2eb5, code lost:
        if ("qr".equals(r3) == false) goto L_0x2f19;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2098:0x2eb7, code lost:
        r11 = new java.lang.Object();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2099:0x2ebe, code lost:
        r11 = new java.lang.Object();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:209:0x034a, code lost:
        r5 = A0I(r0, r2);
        X.C18070vi.A0z(r5, "null cannot be cast to non-null type com.instagram.common.bloks.component.base.BloksModel");
        r5 = (X.DFL) r5;
        r1 = r0.A00(1);
        X.C18070vi.A0X(r1);
        r3 = X.CCF.A00(r1);
        r1 = A06(r2, r0, 2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2100:0x2ec5, code lost:
        r11 = new java.lang.Object();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2101:0x2ecc, code lost:
        r11 = new java.lang.Object();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2102:0x2ed3, code lost:
        r11 = new java.lang.Object();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2103:0x2eda, code lost:
        r11 = new java.lang.Object();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2104:0x2ee1, code lost:
        r11 = new java.lang.Object();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2105:0x2ee8, code lost:
        r11 = new java.lang.Object();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2106:0x2eef, code lost:
        r11 = new java.lang.Object();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2107:0x2ef6, code lost:
        r11 = new java.lang.Object();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2108:0x2efd, code lost:
        r11 = new java.lang.Object();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2109:0x2f04, code lost:
        r11 = new java.lang.Object();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:210:0x0369, code lost:
        if (r5.A0C() != null) goto L_0x0373;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2110:0x2f0b, code lost:
        r11 = new java.lang.Object();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2111:0x2f12, code lost:
        r11 = new java.lang.Object();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2112:0x2f19, code lost:
        r11 = new java.lang.Object();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2113:0x2f20, code lost:
        r3 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2114:0x2f21, code lost:
        if (r6 != r3) goto L_0x3061;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2115:0x2f23, code lost:
        if (r6 <= 0) goto L_0x2f3e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2116:0x2f25, code lost:
        r6 = r6 - 1;
        r2 = r12.A02(24);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2117:0x2f2d, code lost:
        if (r2 == 0) goto L_0x2f3b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2118:0x2f2f, code lost:
        r12.A03((X.C25719Ckp.A00(r12, r2) + 4) + (r6 * 4));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2119:0x2f3b, code lost:
        r12.A04(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:211:0x036b, code lost:
        X.C25913CoX.A01("index_of_child_without_id", "bk.action.bloks.IndexOfChild called on a container without an ID");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2120:0x2f3e, code lost:
        r10 = X.C29431cG.A1B(r9);
        X.C18070vi.A0d(r8, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2121:0x2f49, code lost:
        if (r7.containsKey(r8) != false) goto L_0x2f9e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2122:0x2f4b, code lost:
        r2 = r12.A02(24);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2123:0x2f51, code lost:
        if (r2 == 0) goto L_0x2f93;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2124:0x2f53, code lost:
        r9 = r12.A01.getInt(X.C25719Ckp.A00(r12, r2));
        r6 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2125:0x2f5e, code lost:
        if (r6 >= r9) goto L_0x2f93;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2126:0x2f60, code lost:
        r3 = (r6 + r9) / 2;
        r2 = r12.A02(24);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2127:0x2f6a, code lost:
        if (r2 == 0) goto L_0x2f80;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2128:0x2f6c, code lost:
        r2 = r12.A03((X.C25719Ckp.A00(r12, r2) + 4) + (r3 * 4));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2129:0x2f79, code lost:
        r2 = r2.compareTo(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:212:0x0373, code lost:
        r4 = X.C26272CwJ.A01(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2130:0x2f7d, code lost:
        if (r2 != 0) goto L_0x2f82;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2132:0x2f80, code lost:
        r2 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2133:0x2f82, code lost:
        if (r2 >= 0) goto L_0x2f87;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2134:0x2f84, code lost:
        r6 = r3 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2135:0x2f87, code lost:
        r9 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2136:0x2f89, code lost:
        if (r3 < 0) goto L_0x2f93;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2137:0x2f8b, code lost:
        r2 = java.lang.Integer.valueOf(r3);
        r7.put(r8, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2138:0x2f93, code lost:
        X.C26294Cx6.A0G("LanguagePackReader", "Unable to find hashKey (%s)", r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2139:0x2f9e, code lost:
        r2 = (java.lang.Integer) r7.get(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:213:0x037b, code lost:
        if (r5.A0C() == null) goto L_0x03b6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2140:0x2fa4, code lost:
        r8 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2141:0x2fa5, code lost:
        if (r2 == null) goto L_0x3a04;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2142:0x2fa7, code lost:
        r9 = r2.intValue();
        r7 = r10.length - 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2143:0x2fad, code lost:
        if (r7 <= 0) goto L_0x2feb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2144:0x2faf, code lost:
        r6 = r10[r7];
        r2 = r10[r7 - 1];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2145:0x2fb5, code lost:
        if (r2 == 0) goto L_0x2fcb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2146:0x2fb7, code lost:
        if (r2 == 1) goto L_0x2fc1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2147:0x2fb9, code lost:
        if (r2 != 2) goto L_0x2fd4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2148:0x2fbb, code lost:
        r3 = new X.CYD(r8, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2149:0x2fc1, code lost:
        r3 = new X.BSA(r8, r11.BVX(r6), r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:214:0x037d, code lost:
        r2 = new X.C26965DNn(r5.A0C());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2150:0x2fcb, code lost:
        r3 = new X.CYD(r8, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2151:0x2fd0, code lost:
        r8 = r3;
        r7 = r7 - 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2152:0x2fd4, code lost:
        r3 = X.AnonymousClass000.A10();
        r3.append("Token type '");
        r3.append(r10[r7 - 1]);
        r1 = X.BE9.A0n("' is unknown.", r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2153:0x2feb, code lost:
        r6 = r12.A04(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2154:0x2fef, code lost:
        if (r6 == null) goto L_0x300a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2155:0x2ff1, code lost:
        r7 = r6.A02(4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2156:0x2ff6, code lost:
        if (r7 == 0) goto L_0x300a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2158:0x3001, code lost:
        if (r6.A01.get(r7 + r6.A00) == 0) goto L_0x300a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2159:0x3003, code lost:
        r8 = new X.CYD(r8, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:215:0x0388, code lost:
        if (r4.A0N == false) goto L_0x0391;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2160:0x300a, code lost:
        if (r8 == null) goto L_0x3010;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2161:0x300c, code lost:
        r6 = r8.A01(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2162:0x3010, code lost:
        if (r6 == null) goto L_0x3a04;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2163:0x3012, code lost:
        r3 = r6.A02(34);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2164:0x3018, code lost:
        if (r3 == 0) goto L_0x3a04;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2165:0x301a, code lost:
        r6.A03(r3 + r6.A00);
        r3 = r6.A02(34);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2166:0x3026, code lost:
        if (r3 == 0) goto L_0x3a04;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2167:0x3028, code lost:
        r6 = r6.A03(r3 + r6.A00);
        r3 = X.C108955ca.A1b(new X.C41661wr("_").A01(r5, 0));
        r5 = r3[0];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2168:0x3041, code lost:
        if (r3.length <= 1) goto L_0x305e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2169:0x3043, code lost:
        r1 = r3[1];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:216:0x038a, code lost:
        X.C25913CoX.A01("BloksTreeManager", "Trying to access a tree on a destroyed BloksTreeManager");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2170:0x3045, code lost:
        r3 = new java.util.Locale(r5, r1);
        r2 = X.C108955ca.A1b(r15);
        r2 = java.util.Arrays.copyOf(r2, r2.length);
        r3 = X.C108955ca.A12(r3, r6, java.util.Arrays.copyOf(r2, r2.length));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2171:0x305e, code lost:
        r1 = "";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2172:0x3061, code lost:
        r2 = X.AnonymousClass000.A10();
        r2.append("Error loading flatbuffer language pack. The sizes of resource ids (");
        r2.append(r6);
        r2.append(") and resource values (");
        r2.append(r3);
        r1 = X.BE9.A0n(") do not match.", r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2173:0x307b, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2177:0x3082, code lost:
        if (r5.equals("bk.action.animated.StartWithToken") == false) goto L_0x39f6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2178:0x3084, code lost:
        r7 = A07(r2, r0);
        r3 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2179:0x3089, code lost:
        if (r7 == null) goto L_0x3a10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:217:0x0391, code lost:
        X.C26176Ctu.A02("Tree operations are only supported from the UI Thread");
        r0 = X.DNW.A00(X.C26962DNk.A02(r4, r4.A0H), r2, 2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2180:0x308b, code lost:
        r6 = A03(r0, 0);
        r5 = A0M(r0, 1);
        r4 = X.C26258Cw3.A01;
        X.C26258Cw3.A05(r6, r7, r5);
        r0 = r2.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2181:0x309a, code lost:
        if (r0 == null) goto L_0x309f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2182:0x309c, code lost:
        r0.BUC();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2183:0x309f, code lost:
        r4.A06(r7, r5, true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2185:0x30aa, code lost:
        if (r5.equals("bk.action.textspan.GetHeight") == false) goto L_0x39f6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2186:0x30ac, code lost:
        r1 = A0G(r0);
        X.C18070vi.A0z(r1, "null cannot be cast to non-null type com.instagram.common.bloks.component.TextSpanContext");
        r3 = X.C25343Ce2.A00((double) ((X.C24954CRe) r1).A02);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2188:0x30c6, code lost:
        if (r5.equals("bk.action.GetClientTimezone") == false) goto L_0x39f6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2189:0x30c8, code lost:
        r3 = java.util.TimeZone.getDefault().getID();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:218:0x03a1, code lost:
        if (r0 == null) goto L_0x03b6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2191:0x30d8, code lost:
        if (r5.equals("bk.action.template.Make") == false) goto L_0x39f6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2192:0x30da, code lost:
        r5 = A0H(r0, r2);
        X.C18070vi.A0X(r5);
        r6 = r0.A00(1);
        X.C18070vi.A0z(r6, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any>");
        r6 = (java.util.Map) r6;
        r4 = A0M(r0, 2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2193:0x30f3, code lost:
        if ((r5 instanceof java.lang.String) == false) goto L_0x311c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2194:0x30f5, code lost:
        r1 = X.C25881Cns.A00(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2195:0x30ff, code lost:
        if (r1.A05.containsKey(r5) != false) goto L_0x311c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2197:0x3107, code lost:
        if (r1.A04.containsKey(r5) != false) goto L_0x311c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2198:0x3109, code lost:
        r1 = X.AnonymousClass000.A10();
        r1.append("Template with id ");
        r1.append(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2199:0x311b, code lost:
        throw X.AnonymousClass001.A12(" not found", r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:219:0x03a3, code lost:
        r0 = X.C25882Cnt.A00(new X.C26965DNn(r3), r0.A0E());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2200:0x311c, code lost:
        r0 = r2.A06;
        X.C18070vi.A0W(r0);
        r3 = new X.C25205Cay(r5, r4, r0, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2202:0x312e, code lost:
        if (r5.equals("bk.action.bloks.PrependChildren") == false) goto L_0x39f6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2203:0x3130, code lost:
        r5 = A0N(r0, r2);
        r3 = X.BE6.A13(X.BE6.A0n(r0, 1), "null cannot be cast to non-null type kotlin.collections.List<com.instagram.common.bloks.component.base.BloksModel>");
        r6 = A0A(r2, r0);
        r2 = new X.C26965DNn(r5);
        r0 = new X.C23733Boe(r3, 1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2205:0x3154, code lost:
        if (r5.equals("bk.action.animated.Resume") == false) goto L_0x39f6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2206:0x3156, code lost:
        r1 = A07(r2, r0);
        r3 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2207:0x315e, code lost:
        if (r1 == null) goto L_0x3a10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2208:0x3160, code lost:
        r1 = X.C26258Cw3.A02(r1, A0M(r0, 0));
        r3 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2209:0x3168, code lost:
        if (r1 == null) goto L_0x3a10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:220:0x03b0, code lost:
        r3 = java.lang.Integer.valueOf(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2210:0x316a, code lost:
        r0 = r1.isPaused();
        r1.resume();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2211:0x3171, code lost:
        if (r0 == false) goto L_0x317f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2213:0x3177, code lost:
        if (r1.isPaused() != false) goto L_0x317f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2216:0x317b, code lost:
        if (r1 == -1) goto L_0x317f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2217:0x317d, code lost:
        r0 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2218:0x317f, code lost:
        r0 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2219:0x3180, code lost:
        r3 = java.lang.Boolean.valueOf(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:221:0x03b6, code lost:
        r0 = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2220:0x3186, code lost:
        r7 = "bk.action.tooltip.Hide";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2221:0x318c, code lost:
        if (r5.equals(r7) == false) goto L_0x39f6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2222:0x318e, code lost:
        r3 = A07(r2, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2223:0x3192, code lost:
        if (r3 == null) goto L_0x31cc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2224:0x3194, code lost:
        r5 = r0.A00(0);
        X.C18070vi.A0X(r5);
        r5 = (X.DFL) r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2225:0x31a1, code lost:
        if (r5.A05 != 16444) goto L_0x31c8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2226:0x31a3, code lost:
        r3 = (X.C25579CiJ) X.BE9.A0l(r3, r5);
        r2 = r3.A04;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2227:0x31b7, code lost:
        if (((X.C25080CWp) r2.getValue()).A02.isShowing() == false) goto L_0x3a04;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2229:0x31c1, code lost:
        if (((X.C25080CWp) r2.getValue()).A01 != false) goto L_0x3a04;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2230:0x31c3, code lost:
        X.C25579CiJ.A00(r3, r5, false, true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2231:0x31c8, code lost:
        r0 = "Signature called with invalid model.";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2233:0x31d0, code lost:
        throw X.C17890vO.A0K();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2234:0x31d1, code lost:
        r7 = "bk.action.tooltip.Show";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2235:0x31d7, code lost:
        if (r5.equals(r7) == false) goto L_0x39f6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2236:0x31d9, code lost:
        r3 = A07(r2, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2237:0x31dd, code lost:
        if (r3 == null) goto L_0x3247;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2238:0x31df, code lost:
        r6 = r0.A00(0);
        X.C18070vi.A0X(r6);
        r6 = (X.DFL) r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2239:0x31ec, code lost:
        if (r6.A05 != 16444) goto L_0x3243;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:223:0x03be, code lost:
        if (r5.equals("bk.action.text_input.ClearText") == false) goto L_0x39f6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2240:0x31ee, code lost:
        r7 = (X.C25579CiJ) X.BE9.A0l(r3, r6);
        r2 = r7.A04;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2241:0x3202, code lost:
        if (((X.C25080CWp) r2.getValue()).A02.isShowing() != false) goto L_0x3a04;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2243:0x320c, code lost:
        if (((X.C25080CWp) r2.getValue()).A01 != false) goto L_0x3a04;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2244:0x320e, code lost:
        r3 = r7.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2245:0x3210, code lost:
        if (r3 == null) goto L_0x3a04;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2246:0x3212, code lost:
        r2 = (X.C25080CWp) r2.getValue();
        r5 = new X.C28038DqD(r7, r6);
        r4 = ((X.C25984Cpy) r2.A04.getValue()).A02(r3, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2247:0x3229, code lost:
        if (r4 == null) goto L_0x323e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2248:0x322b, code lost:
        r3 = r2.A02;
        r2 = r3.getContentView();
        X.C18070vi.A0z(r2, "null cannot be cast to non-null type com.facebook.rendercore.RenderTreeHostView");
        ((X.C01920By) r2).setRenderTree(r4);
        r5.invoke(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2249:0x323e, code lost:
        X.C25579CiJ.A00(r7, r6, true, true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:224:0x03c0, code lost:
        r4 = A0I(r0, r2);
        X.C18070vi.A0z(r4, "null cannot be cast to non-null type com.instagram.common.bloks.component.base.BloksModel");
        r2 = (X.CTH) X.C26272CwJ.A04(A06(r2, r0, 1), (X.DFL) r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2250:0x3243, code lost:
        r0 = "Signature called with invalid model.";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2252:0x324b, code lost:
        throw X.C17890vO.A0K();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2254:0x3252, code lost:
        if (r5.equals("bk.action.textinput.GetSensitiveText") == false) goto L_0x39f6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2255:0x3254, code lost:
        r1 = A0E(r0, r2);
        r0 = r2.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2256:0x325a, code lost:
        if (r0 == null) goto L_0x328c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2257:0x325c, code lost:
        r2 = X.C26272CwJ.A04(r0, r1);
        r1 = "";
        r3 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2258:0x3265, code lost:
        if ((r2 instanceof X.CTH) == false) goto L_0x3a10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2259:0x3267, code lost:
        r2 = (X.CTH) r2;
        r0 = r2.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:225:0x03d5, code lost:
        if (r2 == null) goto L_0x3a04;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2260:0x326b, code lost:
        if (r0 == null) goto L_0x3276;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2261:0x326d, code lost:
        r0 = r0.getText();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2262:0x3271, code lost:
        if (r0 == null) goto L_0x3276;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2263:0x3273, code lost:
        r0 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2264:0x3276, code lost:
        r0 = r2.A05;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2265:0x3278, code lost:
        if (r0 != null) goto L_0x327c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2266:0x327a, code lost:
        r0 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2267:0x327c, code lost:
        if (r0 == null) goto L_0x3285;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2268:0x327e, code lost:
        r0 = r0.toString();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2269:0x3282, code lost:
        if (r0 == null) goto L_0x3285;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:226:0x03d7, code lost:
        X.C26176Ctu.A02((java.lang.String) null);
        r0 = r2.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2270:0x3284, code lost:
        r1 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2271:0x3285, code lost:
        r3 = new X.CVO(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2273:0x3290, code lost:
        throw X.C17890vO.A0K();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2275:0x3297, code lost:
        if (r5.equals("bk.action.ttrc.InteractionFailed") == false) goto L_0x39f6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2276:0x3299, code lost:
        X.C18070vi.A0d(r0, 0);
        r3 = A02(r0, 0);
        r2 = A0M(r0, 1);
        r1 = X.AnonymousClass8BT.A0t(r0, 2);
        r0 = X.A7e.A00(r2, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2277:0x32ad, code lost:
        if (r0 == null) goto L_0x3a04;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2278:0x32af, code lost:
        r0.A0D(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:227:0x03dd, code lost:
        if (r0 != null) goto L_0x03e5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2280:0x32ba, code lost:
        if (r5.equals("bk.action.bloks.FetchAsyncComponents") == false) goto L_0x39f6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2281:0x32bc, code lost:
        X.C18070vi.A0d(r0, 0);
        X.C18070vi.A0d(r2, 1);
        r7 = A0M(r0, 0);
        r8 = r0.A00(1);
        X.C18070vi.A0z(r8, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any>");
        r8 = (java.util.Map) r8;
        r3 = r0.A00(2);
        X.C18070vi.A0z(r3, "null cannot be cast to non-null type kotlin.Number");
        r10 = X.C17880vN.A05(r3);
        r1 = X.AnonymousClass8BR.A0G(r0.A00, 3);
        r3 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2282:0x32e7, code lost:
        if (r1 == null) goto L_0x3339;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2283:0x32e9, code lost:
        r5 = X.BE7.A0e(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2284:0x32ed, code lost:
        if (r5 == null) goto L_0x3339;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2285:0x32ef, code lost:
        r0 = r5.toUpperCase(java.util.Locale.ROOT);
        X.C18070vi.A0X(r0);
        r5 = X.C24285Byi.valueOf(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2286:0x32fc, code lost:
        X.C18070vi.A0z(r5, "null cannot be cast to non-null type com.instagram.common.bloks.componentquery.BloksComponentQueryStore.BloksAsyncComponentQueryPurpose");
        r13 = r1.A0I(41, false);
        r12 = r1.A0I(40, false);
        r9 = X.C29431cG.A12(X.BE7.A0s(r1, 43));
        r1 = r2.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2287:0x3319, code lost:
        if (r1 == null) goto L_0x3a10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2288:0x331b, code lost:
        r6 = (X.C26012CqT) r1.A01(2131428152);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2289:0x3324, code lost:
        if (r6 == null) goto L_0x3a10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:228:0x03df, code lost:
        r2.A04 = "";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2290:0x3326, code lost:
        X.C18070vi.A0h(r7, r8);
        X.C18070vi.A0d(r5, 5);
        r6.A0B.execute(new X.DTK(r5, r6, r7, r8, r9, r10, r12, r13));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2291:0x3339, code lost:
        r5 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2293:0x3341, code lost:
        if (r5.equals("bk.action.component.GetWidth") == false) goto L_0x39f6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2294:0x3343, code lost:
        r1 = A0I(r0, r2);
        X.C18070vi.A0z(r1, "null cannot be cast to non-null type com.instagram.common.bloks.component.base.BloksModel");
        r0 = ((X.DFL) r1).A06(r2.A00);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2295:0x3354, code lost:
        if (r0 == null) goto L_0x3a04;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2296:0x3356, code lost:
        r3 = java.lang.Integer.valueOf(r0.getWidth());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2298:0x3366, code lost:
        if (r5.equals("bk.action.bloks.ReplaceEmbeddedChildrenAfter") == false) goto L_0x39f6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2299:0x3368, code lost:
        r3 = X.BE6.A13(A0J(r0, r2), "null cannot be cast to non-null type kotlin.collections.List<com.instagram.common.bloks.BloksParseResult>");
        r1 = A0K(r0);
        r5 = A0B(r2, r0);
        r0 = A0P(r5, r3);
        r6 = A0C(r1);
        r2 = new X.C23731Boc(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:229:0x03e5, code lost:
        r0 = r0.getText();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2301:0x338f, code lost:
        if (r5.equals("bk.action.animated.Parallel") == false) goto L_0x39f6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2302:0x3391, code lost:
        r7 = A07(r2, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2303:0x3395, code lost:
        if (r7 == null) goto L_0x3a04;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2304:0x3397, code lost:
        r6 = X.AnonymousClass8BT.A08(r0.A00, 0);
        r5 = A00(r0, 1);
        r8 = X.BE6.A13(r0.A00(2), "null cannot be cast to non-null type kotlin.collections.List<android.animation.Animator>");
        r4 = (long) (r5 * ((float) X.C26258Cw3.A00));
        X.C18070vi.A0d(r8, 1);
        A0Q(r7, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2305:0x33bb, code lost:
        if (r8.size() != 1) goto L_0x33c7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2306:0x33bd, code lost:
        r3 = (android.animation.Animator) X.C29431cG.A0b(r8);
        X.C26258Cw3.A03(r3, r4);
        r3 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2307:0x33c7, code lost:
        r1 = r8.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2309:0x33cf, code lost:
        if (r1.hasNext() == false) goto L_0x33de;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:230:0x03e9, code lost:
        if (r0 == null) goto L_0x03ee;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2310:0x33d1, code lost:
        r0 = (android.animation.Animator) r1.next();
        X.C26272CwJ.A05(r0, r7);
        X.C26258Cw3.A03(r0, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2311:0x33de, code lost:
        r3 = new X.BEC(X.AnonymousClass00R.A00, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2312:0x33e5, code lost:
        if (r6 == null) goto L_0x3a10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2313:0x33e7, code lost:
        X.C18070vi.A0d(r3, 0);
        r0 = new X.BEP(r7, r2, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2315:0x33f8, code lost:
        if (r5.equals("bk.action.bloks.ReplaceEmbeddedChildV2") == false) goto L_0x39f6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2316:0x33fa, code lost:
        r4 = X.BE6.A13(A0J(r0, r2), "null cannot be cast to non-null type kotlin.collections.List<com.instagram.common.bloks.BloksParseResult>");
        r3 = A0K(r0);
        r1 = A0B(r2, r0);
        A0R(r1, r3, A0P(r1, r4));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2318:0x341b, code lost:
        if (r5.equals("bk.action.bloks.GetValue") == false) goto L_0x39f6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2319:0x341d, code lost:
        X.C18070vi.A0d(r0, 0);
        X.C18070vi.A0d(r2, 1);
        r11 = A0M(r0, 0);
        r10 = (X.CQM) X.C25881Cns.A00(r2).A06.get(r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:231:0x03eb, code lost:
        r0.clear();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2320:0x3433, code lost:
        if (r10 == null) goto L_0x34ec;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2321:0x3435, code lost:
        r0 = r10.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2322:0x3437, code lost:
        if (r0 != null) goto L_0x343d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2323:0x3439, code lost:
        r0 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2324:0x343d, code lost:
        r3 = r0.intValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2325:0x3441, code lost:
        if (r3 == 0) goto L_0x344b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2326:0x3443, code lost:
        r11 = X.C25968Cpa.A00(X.AnonymousClass00R.A00, r11, r2.A06, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2327:0x344b, code lost:
        r12 = r2.A0A;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2328:0x344d, code lost:
        if (r12 == null) goto L_0x34d6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2329:0x344f, code lost:
        r3 = (X.C25165CaG) r12.get(r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:232:0x03ee, code lost:
        r2.A04 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2330:0x3455, code lost:
        if (r3 != null) goto L_0x34c7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2331:0x3457, code lost:
        r9 = new X.C24807CLa(X.C17880vN.A12());
        r19 = r2.A00;
        r18 = r2.A04;
        r17 = r2.A06;
        r15 = r2.A09;
        r14 = r2.A01;
        r13 = r2.A01;
        r8 = r2.A03;
        r7 = r2.A07;
        r6 = r2.A02;
        r5 = r2.A06;
        r17 = new X.C23736Boh(r6, r19, (X.DOZ) r2.A08.get(), r14, r9, r8, r2.A05, r18, r13, r2.A05, r7, r5, r17, r15, r12);
        r3 = r10.A00.A00((X.E9O) null, (java.util.List) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2332:0x34b2, code lost:
        if ((r3 instanceof X.C28669EDl) == false) goto L_0x34b7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2333:0x34b4, code lost:
        r3.BKO();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2334:0x34b7, code lost:
        r3 = new X.C25165CaG(X.C25974Cph.A01(r17, X.C199029zJ.A01, r3), r9.A00);
        r12.put(r11, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2335:0x34c7, code lost:
        r0 = r2.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2336:0x34c9, code lost:
        if (r0 == null) goto L_0x34d2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2337:0x34cb, code lost:
        X.C29401cD.A0J(r3.A01, r0.A00);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2338:0x34d2, code lost:
        r3 = r3.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2339:0x34d6, code lost:
        r1 = r10.A00.A00((X.E9O) null, (java.util.List) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2340:0x34df, code lost:
        if ((r1 instanceof X.C28669EDl) == false) goto L_0x34e4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2341:0x34e1, code lost:
        r1.BKO();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2342:0x34e4, code lost:
        r3 = X.C25974Cph.A01(r2, X.C199029zJ.A01, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2343:0x34ec, code lost:
        r1 = X.AnonymousClass000.A10();
        r1.append("Value for referenced id ");
        r1.append(r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2344:0x3508, code lost:
        throw X.AnonymousClass001.A12("\n\nYou are running parseEmbedded without the parent Bloks Context needed to process the data manifests. If you are implementing a new feature, check to makesure you're not calling evaluateWithoutTreeDANGEROUSLY on your signature. Otherwise, this is an infra error that you should post in the Bloks Q&A group about.", X.AnonymousClass000.A11(X.AnonymousClass000.A0y(" not found! ", r1)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2346:0x350f, code lost:
        if (r5.equals("bk.action.animated.Sequence") == false) goto L_0x39f6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2347:0x3511, code lost:
        r7 = A07(r2, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2348:0x3515, code lost:
        if (r7 == null) goto L_0x3a04;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2349:0x3517, code lost:
        r8 = X.BE6.A13(r0.A00(0), "null cannot be cast to non-null type kotlin.collections.List<android.animation.Animator>");
        X.C18070vi.A0d(r8, 1);
        A0Q(r7, r8);
        r6 = r8.size();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:234:0x03f8, code lost:
        if (r5.equals("bk.action.bloks.MarkerAnnotateAsyncComponentResponse") == false) goto L_0x39f6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2350:0x352b, code lost:
        if (r6 == 1) goto L_0x3552;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2351:0x352d, code lost:
        r5 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2352:0x352e, code lost:
        if (r5 >= r6) goto L_0x3557;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2353:0x3530, code lost:
        r4 = (android.animation.Animator) r8.get(r5);
        X.C26272CwJ.A05(r4, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2354:0x3539, code lost:
        if (r5 <= 0) goto L_0x354f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2355:0x353b, code lost:
        r0 = (android.animation.Animator) r8.get(r5 - 1);
        X.C26258Cw3.A03(r4, r0.getStartDelay() + r0.getDuration());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2356:0x354f, code lost:
        r5 = r5 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2357:0x3552, code lost:
        r3 = X.C29431cG.A0b(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2358:0x3557, code lost:
        r0 = X.AnonymousClass00R.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2359:0x3559, code lost:
        r3 = new X.BEC(r0, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:235:0x03fa, code lost:
        X.C18070vi.A0d(r0, 0);
        r7 = A02(r0, 0);
        r8 = r0.A00(1);
        X.C18070vi.A0z(r8, "null cannot be cast to non-null type kotlin.String");
        r8 = (java.lang.String) r8;
        r9 = A0L(r0, 2);
        r6 = (java.util.Map) X.BE6.A0n(r0, 3);
        r3 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2360:0x355e, code lost:
        r3 = (android.animation.Animator) r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2362:0x3568, code lost:
        if (r5.equals("bk.action.ttrc.SurfaceLeft") == false) goto L_0x39f6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2363:0x356a, code lost:
        X.C18070vi.A0d(r0, 0);
        r1 = X.A7e.A00(A0M(r0, 1), A02(r0, 0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2364:0x3579, code lost:
        if (r1 == null) goto L_0x3a04;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2365:0x357b, code lost:
        r1.A0E("leftSurface");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2367:0x3588, code lost:
        if (r5.equals("data.Get") == false) goto L_0x39f6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2368:0x358a, code lost:
        X.C18070vi.A0d(r0, 0);
        r2 = X.AnonymousClass8BR.A0G(r0.A00, 0);
        r1 = A02(r0, 1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2369:0x3597, code lost:
        if (r2 == null) goto L_0x3a04;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:236:0x0419, code lost:
        if (r6 == null) goto L_0x044f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2370:0x3599, code lost:
        r3 = r2.A06.get(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2372:0x35a7, code lost:
        if (r5.equals("bk.action.bloks.ReplaceChildren") == false) goto L_0x39f6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2373:0x35a9, code lost:
        r4 = A0N(r0, r2);
        r3 = X.BE6.A13(X.BE6.A0n(r0, 1), "null cannot be cast to non-null type kotlin.collections.List<com.instagram.common.bloks.component.base.BloksModel>");
        r6 = A0A(r2, r0);
        r2 = new X.C26965DNn(r4);
        r0 = new X.C23733Boe(r3, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2374:0x35c6, code lost:
        r6.A0A(r2, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2376:0x35d1, code lost:
        if (r5.equals("bk.action.bloks.InsertEmbeddedChildrenAfter") == false) goto L_0x39f6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2377:0x35d3, code lost:
        r4 = X.BE6.A13(A0J(r0, r2), "null cannot be cast to non-null type kotlin.collections.List<com.instagram.common.bloks.BloksParseResult>");
        r3 = A0K(r0);
        r5 = A0B(r2, r0);
        r0 = A0P(r5, r4);
        r6 = A0C(r3);
        r2 = new X.C23735Bog(r0, 1, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2378:0x35f2, code lost:
        r5.A0A(r6, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:237:0x041b, code lost:
        r0 = r6.get("points");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2380:0x35fd, code lost:
        if (r5.equals("bk.action.core.GetTemplateArg") == false) goto L_0x39f6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2381:0x35ff, code lost:
        X.C18070vi.A0d(r0, 0);
        X.C18070vi.A0d(r2, 1);
        r6 = 0;
        r5 = A0M(r0, 0);
        r4 = r0.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2382:0x3611, code lost:
        if (r4.size() < 2) goto L_0x3629;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2383:0x3613, code lost:
        r1 = r4.get(1);
        X.C18070vi.A0z(r1, "null cannot be cast to non-null type kotlin.Number");
        r3 = X.AnonymousClass000.A0M(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2384:0x3620, code lost:
        r1 = r2.A06;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2385:0x3622, code lost:
        if (r1 == null) goto L_0x362b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2386:0x3624, code lost:
        r6 = r1.size();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2387:0x3629, code lost:
        r3 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2388:0x362b, code lost:
        if (r3 > r6) goto L_0x3646;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2389:0x362d, code lost:
        r1 = X.C25968Cpa.A00(X.AnonymousClass00R.A01, r5, r1, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:238:0x0421, code lost:
        r0 = (java.util.Map) r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2390:0x3633, code lost:
        r3 = X.C25968Cpa.A01(r2).get(r1);
        r0 = r2.A02;
        r3 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2391:0x363d, code lost:
        if (r0 == null) goto L_0x3a10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2392:0x363f, code lost:
        r0.A00.add(r1);
        r3 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2394:0x364c, code lost:
        throw X.AnonymousClass000.A0k("Depth supplied should never exceed the size of the key path.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2395:0x364d, code lost:
        r7 = "bk.action.toast.ShowToastV2";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2396:0x3653, code lost:
        if (r5.equals(r7) == false) goto L_0x39f6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2397:0x3655, code lost:
        r5 = (X.C26235CvV) A0H(r0, r2);
        r6 = X.AnonymousClass8BR.A0G(r0.A00, 1);
        r22 = A06(r2, r0, 2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2398:0x3666, code lost:
        if (r6 != null) goto L_0x366f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2399:0x3668, code lost:
        r0 = "Cannot show toast with invalid options.";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:239:0x0423, code lost:
        if (r0 == null) goto L_0x0451;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2400:0x366a, code lost:
        X.C25913CoX.A01(r7, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2401:0x366f, code lost:
        X.C26272CwJ.A01(r22).A08(r5, (java.util.Map) null);
        r7 = r6.A04(35, 5000);
        r27 = r6.A04(42, 100);
        r28 = r6.A04(36, 100);
        r18 = A04(r6.A09(43));
        r19 = A04(r6.A09(38));
        r3 = new X.D8E(r2, r6.A0A(41));
        r0 = new X.D8C(r2, r6.A0A(40), 1);
        r29 = r6.A0I(54, false);
        r25 = r5.A01.A0C();
        r30 = "mini".equals(r6.A0D(44));
        r2 = r6.A0D(48);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2402:0x36d5, code lost:
        if (r2 == null) goto L_0x36f0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2403:0x36d7, code lost:
        r4 = r2.hashCode();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2404:0x36de, code lost:
        if (r4 == -1383228885) goto L_0x36f0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2406:0x36e3, code lost:
        if (r4 != 115029) goto L_0x36f0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2408:0x36eb, code lost:
        if (r2.equals("top") == false) goto L_0x36f0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2409:0x36ed, code lost:
        r24 = X.AnonymousClass00R.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:240:0x0425, code lost:
        r5 = X.AnonymousClass000.A15(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2410:0x36f0, code lost:
        r24 = X.AnonymousClass00R.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2412:0x36f3, code lost:
        if (r7 == -1) goto L_0x374a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2413:0x36f5, code lost:
        r17 = new X.CUA(r18, r19, r0, r3, r22, r5, r24, r25, r7, r27, r28, r29, r30);
        r1 = r17.A07;
        r6 = r1.A00;
        r5 = r17.A0B;
        r4 = r17.A09;
        r3 = new X.BIJ(r6, r4, r5);
        r3.setBloksContentViewFromParseResult(r1, r17.A08);
        r3.A00 = r17.A00;
        r3.A02 = r17.A02;
        r3.A01 = r17.A01;
        r3.A04 = r17.A04;
        r3.A03 = r17.A03;
        r3.A06 = new X.D8D(r17);
        r3.A05 = new X.D8C(r3, r17, 0);
        r3.A0A = r17.A0C;
        r3.setTag(2131430937, r17.A0A);
        X.C26071Crl.A01(r6, r3, r4, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2415:0x3750, code lost:
        throw X.AnonymousClass000.A0k("Auto-dismiss duration must be >= 0ms");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2417:0x3757, code lost:
        if (r5.equals("bk.action.array.FindIndex") == false) goto L_0x39f6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2418:0x3759, code lost:
        r7 = X.BE6.A13(A0H(r0, r2), "null cannot be cast to non-null type java.util.List<kotlin.Any>");
        r5 = X.C25488Cgj.A00(r0, 1);
        r4 = r7.size();
        r3 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2419:0x376c, code lost:
        if (r3 >= r4) goto L_0x3787;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2420:0x376e, code lost:
        r1 = X.C25974Cph.A00(r2, X.C108985cd.A0K(r7.get(r3)), r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2421:0x377c, code lost:
        if ((r1 instanceof java.lang.Number) != false) goto L_0x378d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2423:0x3780, code lost:
        if ((r1 instanceof java.lang.Boolean) != false) goto L_0x378d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2424:0x3782, code lost:
        X.C25913CoX.A01("bk.action.array.FindIndex", "Got non-boolean result while evaluating FindIndex predicate");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2425:0x3787, code lost:
        r3 = X.BE7.A0Z();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2427:0x3791, code lost:
        if (X.C25343Ce2.A01(r1) == false) goto L_0x3799;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2428:0x3793, code lost:
        r3 = java.lang.Integer.valueOf(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2429:0x3799, code lost:
        r3 = r3 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:242:0x042d, code lost:
        if (r5.hasNext() == false) goto L_0x0451;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2431:0x37a2, code lost:
        if (r5.equals("bk.action.animated.StartToken") == false) goto L_0x39f6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2432:0x37a4, code lost:
        r6 = A07(r2, r0);
        r3 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2433:0x37a9, code lost:
        if (r6 == null) goto L_0x3a10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2434:0x37ab, code lost:
        r5 = A0M(r0, 0);
        r1 = X.C26258Cw3.A01;
        r0 = r2.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2435:0x37b3, code lost:
        if (r0 == null) goto L_0x37b8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2436:0x37b5, code lost:
        r0.BUC();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2437:0x37b8, code lost:
        r1.A06(r6, r5, false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2439:0x37c3, code lost:
        if (r5.equals("bk.action.slider.SetPosition") == false) goto L_0x39f6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:243:0x042f, code lost:
        r4 = X.AnonymousClass000.A16(r5);
        X.A7e.A03((java.lang.Long) r4.getValue(), r8, X.C17890vO.A0Z(X.C17880vN.A0x(r4), X.AnonymousClass000.A11(r9), '_'), X.AnonymousClass1D7.A0I(), r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2440:0x37c5, code lost:
        r4 = A0E(r0, r2);
        r3 = A00(r0, 1);
        r0 = r2.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2441:0x37cf, code lost:
        if (r0 == null) goto L_0x37ec;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2442:0x37d1, code lost:
        r1 = X.C26272CwJ.A04(r0, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2443:0x37d7, code lost:
        if ((r1 instanceof X.CUL) == false) goto L_0x3a04;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2444:0x37d9, code lost:
        X.C26176Ctu.A02((java.lang.String) null);
        r1 = ((X.CUL) r1).A0C;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2445:0x37e1, code lost:
        if (r1 == null) goto L_0x3a04;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2446:0x37e3, code lost:
        r1.setProgress((int) (r3 * 2.14748365E9f));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2448:0x37f0, code lost:
        throw X.C17880vN.A0g();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:244:0x044f, code lost:
        r0 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2450:0x37f7, code lost:
        if (r5.equals("bk.action.accessibility.IsHighContrastEnabled") == false) goto L_0x39f6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2451:0x37f9, code lost:
        r2 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2452:0x380a, code lost:
        if (android.provider.Settings.Secure.getInt(X.C25995CqB.A00().A00.getContentResolver(), "high_text_contrast_enabled", 0) == 0) goto L_0x380d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2453:0x380c, code lost:
        r2 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2454:0x380d, code lost:
        r3 = java.lang.Boolean.valueOf(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2456:0x3819, code lost:
        if (r5.equals("bk.action.bloks.ClearCachedAsyncComponents") == false) goto L_0x39f6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2457:0x381b, code lost:
        X.C18070vi.A0d(r2, 1);
        r1 = r2.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2458:0x3820, code lost:
        if (r1 == null) goto L_0x3a04;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2459:0x3822, code lost:
        r0 = (X.C26012CqT) r1.A01(2131428152);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:245:0x0451, code lost:
        if (r6 == null) goto L_0x0454;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2460:0x382b, code lost:
        if (r0 == null) goto L_0x3a04;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2461:0x382d, code lost:
        r1 = X.C24278Byb.A00;
        X.C18070vi.A0d(r1, 0);
        r7 = r0.A05.A01;
        r6 = r1.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2463:0x383e, code lost:
        if (r6.hasNext() == false) goto L_0x3a04;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2465:0x384a, code lost:
        if (((X.C24278Byb) r6.next()).ordinal() != 0) goto L_0x383a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2466:0x384c, code lost:
        r3 = r7.A02;
        r5 = r3.A03;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2467:0x3850, code lost:
        monitor-enter(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2469:?, code lost:
        r2 = r3.A02;
        r0 = (X.AnonymousClass9Z5) r2.A01.A04("ASYNC_COMPONENT");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2470:0x385d, code lost:
        if (r0 == null) goto L_0x3865;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2471:0x385f, code lost:
        r0.A00.A07(-1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2472:0x3865, code lost:
        X.DNY.A00(r3, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2474:?, code lost:
        monitor-exit(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2476:0x386a, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2478:0x386c, code lost:
        r3 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2479:0x386d, code lost:
        r5 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:247:0x0454, code lost:
        r0 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2480:0x386e, code lost:
        r4 = r0.A00(0);
        X.C18070vi.A0z(r4, "null cannot be cast to non-null type kotlin.String");
        r3 = A0L(r0, 3);
        r2 = A0L(r0, 4);
        r1 = X.AnonymousClass000.A10();
        r1.append("Error when evaluating ");
        r1.append(r2);
        r1.append(" fbt {");
        r1.append(r3);
        r1.append("} (");
        r3 = new X.C1G(X.C17900vP.A0B((java.lang.String) r4, r1), r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2481:0x38a5, code lost:
        throw r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2483:0x38ac, code lost:
        if (r5.equals("bk.action.array.SortedArray") == false) goto L_0x39f6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2484:0x38ae, code lost:
        r3 = X.BE6.A13(A0H(r0, r2), "null cannot be cast to non-null type java.util.List<kotlin.Any>");
        r4 = X.C25488Cgj.A00(r0, 1);
        r3 = X.C17880vN.A10(r3);
        java.util.Collections.sort(r3, new X.DUK(r2, r4, 0));
        r3 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2486:0x38d1, code lost:
        if (r5.equals("bk.action.bloks.ReplaceEmbeddedChildren") == false) goto L_0x39f6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2487:0x38d3, code lost:
        r4 = A0N(r0, r2);
        r1 = X.BE6.A13(X.BE6.A0n(r0, 1), "null cannot be cast to non-null type kotlin.collections.List<com.instagram.common.bloks.BloksParseResult>");
        r6 = A0A(r2, r0);
        r1 = A0P(r6, r1);
        r3 = new X.C26965DNn(r4);
        r2 = new X.C23733Boe(r1, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2488:0x38f4, code lost:
        r6.A0A(r3, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:248:0x0456, code lost:
        r0 = r6.get("annotations");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2490:0x38ff, code lost:
        if (r5.equals("bk.action.accessibility.IsReduceMotionEnabled") == false) goto L_0x39f6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2491:0x3901, code lost:
        X.C18070vi.A0d(r2, 1);
        r5 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2492:0x390d, code lost:
        if (android.os.Build.VERSION.SDK_INT < 26) goto L_0x391b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2494:0x3913, code lost:
        if (X.C7r.A00() != false) goto L_0x391b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2495:0x3915, code lost:
        r3 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2496:0x391b, code lost:
        r0 = r2.A00;
        r3 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2497:0x391d, code lost:
        if (r0 == null) goto L_0x3a10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2498:0x391f, code lost:
        r2 = r0.A00.getContentResolver();
        r3 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2499:0x3925, code lost:
        if (r2 == null) goto L_0x3a10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:249:0x045c, code lost:
        r0 = (java.util.Map) r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2501:0x3932, code lost:
        if (android.provider.Settings.Global.getFloat(r2, "animator_duration_scale", 1.0f) != 0.0f) goto L_0x3935;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2502:0x3934, code lost:
        r5 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2503:0x3935, code lost:
        r3 = java.lang.Boolean.valueOf(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2505:0x3941, code lost:
        if (r5.equals("bk.action.visibility_context.PercentVisible") == false) goto L_0x39f6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2506:0x3943, code lost:
        r1 = A0G(r0);
        X.C18070vi.A0z(r1, "null cannot be cast to non-null type com.bloks.foa.visibility.ViewpointSnapshotWithData");
        r3 = java.lang.Float.valueOf(((X.C128246fg) r1).A00);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2508:0x395c, code lost:
        if (r5.equals("bk.action.video.GetPositionV2") == false) goto L_0x39f6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2509:0x395e, code lost:
        r2 = A07(r2, r0);
        r3 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:250:0x045e, code lost:
        if (r0 == null) goto L_0x3a10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2510:0x3966, code lost:
        if (r2 == null) goto L_0x3a10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2511:0x3968, code lost:
        r1 = X.BE7.A0d(A0D(r0, 0));
        r3 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2512:0x3970, code lost:
        if (r1 != null) goto L_0x3977;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2514:0x3976, code lost:
        throw X.C17880vN.A0g();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2515:0x3977, code lost:
        ((java.util.AbstractMap) r2.A01(2131428187)).get(r1);
        r3 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2517:0x398b, code lost:
        if (r5.equals("bk.action.animated.AddOnCompleteListener") == false) goto L_0x39f6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2518:0x398d, code lost:
        r5 = A07(r2, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2519:0x3991, code lost:
        if (r5 == null) goto L_0x3a04;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:251:0x0460, code lost:
        r6 = X.C108995ce.A0b(r0);
        r5 = X.AnonymousClass000.A15(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2520:0x3993, code lost:
        r3 = A03(r0, 0);
        r1 = X.C25488Cgj.A00(r0, 1);
        X.C18070vi.A0d(r3, 0);
        r0 = new X.BEP(r5, r2, r1);
        r3 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2521:0x39a3, code lost:
        r3.addListener(r0);
        r3 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2523:0x39ad, code lost:
        if (r5.equals("bk.action.animation.linear.GetCurrentValue") == false) goto L_0x39f6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2524:0x39af, code lost:
        X.C18070vi.A0d(r0, 0);
        r0 = (android.animation.ValueAnimator) X.BE6.A0n(r0, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2525:0x39b8, code lost:
        if (r0 == null) goto L_0x3a04;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2526:0x39ba, code lost:
        r3 = r0.getAnimatedValue();
        X.C18070vi.A0z(r3, "null cannot be cast to non-null type kotlin.Float");
        r3 = (java.lang.Float) r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2528:0x39cc, code lost:
        if (r5.equals("bk.action.animated.GetCurrentValue") == false) goto L_0x39f6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2529:0x39ce, code lost:
        r1 = A0G(r0);
        X.C18070vi.A0z(r1, "null cannot be cast to non-null type android.animation.ValueAnimator");
        r1 = ((android.animation.ValueAnimator) r1).getAnimatedValue();
        X.C18070vi.A0z(r1, "null cannot be cast to non-null type kotlin.Float");
        r3 = X.C25343Ce2.A00((double) ((java.lang.Float) r1).floatValue());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2531:0x39f4, code lost:
        if (r5.equals("bk.action.trace.EndSection") != false) goto L_0x3a01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2533:0x3a00, code lost:
        throw X.BE8.A0X("No implementation bound to key: %s", new java.lang.Object[]{r36});
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2534:0x3a01, code lost:
        X.AnonymousClass0O7.A00();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2535:0x3a04, code lost:
        r3 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2536:0x3a06, code lost:
        r3 = r33.A00.BKe(r0, r2, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2537:0x3a0f, code lost:
        r3 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:253:0x046c, code lost:
        if (r5.hasNext() == false) goto L_0x0488;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2547:0x3a10, code lost:
        r3 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:254:0x046e, code lost:
        r4 = X.AnonymousClass000.A16(r5);
        r6.put(X.C17890vO.A0Z(X.C17880vN.A0x(r4), X.AnonymousClass000.A11(r9), '_'), r4.getValue());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2559:0x3a10, code lost:
        r3 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:255:0x0488, code lost:
        r0 = X.A7e.A00(r8, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2560:0x3a10, code lost:
        r3 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:256:0x048c, code lost:
        if (r0 == null) goto L_0x3a10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:257:0x048e, code lost:
        X.A7e.A02(r0, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:258:0x0493, code lost:
        r7 = "bk.action.array.Filter";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:259:0x0499, code lost:
        if (r5.equals(r7) == false) goto L_0x39f6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:260:0x049b, code lost:
        r9 = X.BE6.A13(A0I(r0, r2), "null cannot be cast to non-null type java.util.List<kotlin.Any>");
        r8 = X.C25488Cgj.A00(r0, 1);
        r3 = X.AnonymousClass000.A13();
        r6 = r9.size();
        r5 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:261:0x04b2, code lost:
        if (r5 >= r6) goto L_0x3a10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:262:0x04b4, code lost:
        r4 = r9.get(r5);
        r1 = X.C25974Cph.A00(r2, X.C108985cd.A0K(r4), r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:263:0x04c2, code lost:
        if ((r1 instanceof java.lang.Number) != false) goto L_0x04cc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:265:0x04c6, code lost:
        if ((r1 instanceof java.lang.Boolean) != false) goto L_0x04cc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:266:0x04c8, code lost:
        r0 = "Got non-boolean result while evaluating filter predicate";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:268:0x04d0, code lost:
        if (X.C25343Ce2.A01(r1) == false) goto L_0x04d5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:269:0x04d2, code lost:
        r3.add(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:270:0x04d5, code lost:
        r5 = r5 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:272:0x04de, code lost:
        if (r5.equals("bk.action.timer.Cancel") == false) goto L_0x39f6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:273:0x04e0, code lost:
        X.C18070vi.A0d(r0, 0);
        X.C18070vi.A0d(r2, 1);
        r3 = A0M(r0, 1);
        r1 = r2.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:274:0x04ec, code lost:
        if (r1 == null) goto L_0x0504;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:275:0x04ee, code lost:
        r0 = (X.CXG) ((java.util.HashMap) r1.A01(2131428185)).get(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:276:0x04fd, code lost:
        if (r0 == null) goto L_0x3a04;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:277:0x04ff, code lost:
        r0.A00();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:279:0x0508, code lost:
        throw X.C17880vN.A0g();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:281:0x050f, code lost:
        if (r5.equals("bk.action.bloks.GetVariableWithScope") == false) goto L_0x39f6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:282:0x0511, code lost:
        X.C18070vi.A0d(r0, 0);
        X.C18070vi.A0d(r2, 1);
        r0 = r0.A00;
        r3 = r0.get(0);
        X.AnonymousClass8BR.A1I(r3);
        r3 = (java.lang.String) r3;
        r1 = r0.get(1);
        X.C18070vi.A0z(r1, "null cannot be cast to non-null type kotlin.Number");
        r1 = X.AnonymousClass000.A0M(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:283:0x052f, code lost:
        if (r1 != 0) goto L_0x0537;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:284:0x0531, code lost:
        r3 = X.C25881Cns.A02(r2, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:285:0x0537, code lost:
        r3 = X.CFr.A00.A02(r2, r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:287:0x0545, code lost:
        if (r5.equals("bk.action.bloks.IsAppInstalled") == false) goto L_0x39f6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:288:0x0547, code lost:
        r2 = A07(r2, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:289:0x054b, code lost:
        if (r2 == null) goto L_0x05a5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:290:0x054d, code lost:
        r3 = r2.A00;
        r7 = true;
        r6 = X.BE6.A13(r0.A00(1), "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
        r5 = A0M(r0, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:291:0x0564, code lost:
        if (X.AnonymousClass1YF.A0Y(r5, "://", false) != false) goto L_0x056a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:292:0x0566, code lost:
        r5 = X.C17900vP.A0A(r5, "://");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:293:0x056a, code lost:
        r3 = r3.getPackageManager();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:294:0x056e, code lost:
        if (r3 == null) goto L_0x059e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:295:0x0570, code lost:
        r0 = X.C26215Cuu.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:296:0x0581, code lost:
        if (new android.content.Intent("android.intent.action.VIEW", android.net.Uri.parse(r5)).resolveActivity(r3) == null) goto L_0x059e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:298:0x0587, code lost:
        if (r6.isEmpty() != false) goto L_0x059f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:299:0x0589, code lost:
        r1 = r6.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:302:0x0591, code lost:
        if (r1.hasNext() == false) goto L_0x059e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:306:0x059b, code lost:
        if (r3.getPackageInfo(X.C17880vN.A0v(r1), 0) == null) goto L_0x058d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:308:0x059e, code lost:
        r7 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:310:?, code lost:
        r3 = java.lang.Boolean.valueOf(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:312:0x05a9, code lost:
        throw X.C17880vN.A0g();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:313:0x05aa, code lost:
        r3 = "bk.action.bloks.Find";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:315:0x05b3, code lost:
        if (r5.equals("bk.action.dispatch.GetLowPriBackgroundQueue") == false) goto L_0x39f6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:316:0x05b5, code lost:
        r3 = (android.os.Handler) X.AnonymousClass6YR.A00.getValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:317:0x05bf, code lost:
        r3 = "bk.action.bloks.FindContainer";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:319:0x05c5, code lost:
        if (r5.equals(r3) == false) goto L_0x39f6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:320:0x05c7, code lost:
        r4 = A0N(r0, r2);
        r0 = A06(r2, r0, 1);
        r5 = X.C26272CwJ.A01(r0);
        r6 = new X.C26965DNn(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:321:0x05dc, code lost:
        if (X.C26272CwJ.A08(r0) == false) goto L_0x05f0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:322:0x05de, code lost:
        r3 = r5.A06;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:323:0x05e0, code lost:
        if (r3 == null) goto L_0x05f0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:324:0x05e2, code lost:
        r3 = X.DNW.A00(r3, new X.C26966DNo(r6), 3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:325:0x05ec, code lost:
        if (r3 == null) goto L_0x05f0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:326:0x05ee, code lost:
        r3 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:327:0x05f0, code lost:
        r0 = r5.A05;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:328:0x05f2, code lost:
        if (r0 == null) goto L_0x05ff;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:329:0x05f4, code lost:
        r3 = X.DNW.A00(r0.A01, r6, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:330:0x05fb, code lost:
        if (r3 == null) goto L_0x05ff;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:331:0x05fd, code lost:
        r3 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:333:0x0601, code lost:
        if (r5.A0N == false) goto L_0x060a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:334:0x0603, code lost:
        X.C25913CoX.A01("BloksTreeManager", "Trying to access a tree on a destroyed BloksTreeManager");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:335:0x060a, code lost:
        X.C26176Ctu.A02("Tree operations are only supported from the UI Thread");
        r3 = X.DNW.A00(X.C26962DNk.A02(r5, r5.A0H), r6, 2);
        r2 = X.AnonymousClass000.A1b(r4, 2);
        r0 = r5.A05;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:336:0x0620, code lost:
        if (r0 == null) goto L_0x0633;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:337:0x0622, code lost:
        r0 = r0.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:338:0x0624, code lost:
        r2[1] = r0;
        X.C25913CoX.A01("BloksModelFinder", java.lang.String.format("Found node %s in unbound tree but not in bound tree %s", r2));
        r3 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:339:0x0633, code lost:
        r0 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:341:0x063b, code lost:
        if (r5.equals("bk.action.bloks.asynccomponents.GetClientParamV2") == false) goto L_0x39f6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:342:0x063d, code lost:
        X.C18070vi.A0d(r0, 0);
        X.C18070vi.A0d(r2, 1);
        r3 = 0;
        r7 = A0M(r0, 0);
        r8 = X.C25343Ce2.A01(r0.A00(1));
        r6 = r2.A06;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:343:0x0652, code lost:
        if (r6 == null) goto L_0x0658;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:344:0x0654, code lost:
        r3 = r6.size();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:345:0x0658, code lost:
        if (r8 > r3) goto L_0x069d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:346:0x065a, code lost:
        r5 = X.CFr.A00;
        X.C18070vi.A0d(r7, 1);
        r1 = X.C25968Cpa.A01(r2);
        r9 = X.AnonymousClass00R.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:347:0x066d, code lost:
        if (r1.containsKey(X.C25968Cpa.A00(r9, r7, r6, r8)) == false) goto L_0x0671;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:348:0x066f, code lost:
        r3 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:349:0x0671, code lost:
        r3 = X.AnonymousClass00R.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:350:0x0681, code lost:
        if (X.C25881Cns.A00(r2).A08.containsKey(X.C25968Cpa.A00(r3, r7, r6, r8)) == false) goto L_0x3a04;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:352:0x0687, code lost:
        if (r3.intValue() == 0) goto L_0x068f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:353:0x0689, code lost:
        r1 = X.C25968Cpa.A00(r9, r7, r6, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:354:0x068f, code lost:
        if (r8 != 0) goto L_0x0697;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:355:0x0691, code lost:
        r3 = X.C25881Cns.A02(r2, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:356:0x0697, code lost:
        r3 = r5.A02(r2, r7, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:357:0x069d, code lost:
        r3 = X.AnonymousClass000.A0k("Trying to read a scoped client param from an un-scoped environment.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:359:0x06ab, code lost:
        if (r5.equals("bk.action.animated.Destroy") == false) goto L_0x39f6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:360:0x06ad, code lost:
        r2 = A07(r2, r0);
        r3 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:361:0x06b2, code lost:
        if (r2 == null) goto L_0x3a10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:362:0x06b4, code lost:
        ((java.util.HashMap) r2.A01(2131428149)).remove(A0M(r0, 0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:364:0x06cc, code lost:
        if (r5.equals("bk.action.bloks.GetScript") == false) goto L_0x39f6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:365:0x06ce, code lost:
        r0 = A0I(r0, r2);
        X.AnonymousClass8BR.A1I(r0);
        r3 = new X.C25488Cgj(X.C25881Cns.A01(r2, (java.lang.String) r0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:367:0x06e8, code lost:
        if (r5.equals("bk.action.bloks.ClearFocus") == false) goto L_0x39f6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:368:0x06ea, code lost:
        r0 = A0E(r0, r2).A06(r2.A00);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:369:0x06f4, code lost:
        if (r0 == null) goto L_0x3a04;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:370:0x06f6, code lost:
        r0.clearFocus();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:371:0x06fb, code lost:
        r7 = "bk.action.component.GetHeight2";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:372:0x0701, code lost:
        if (r5.equals(r7) == false) goto L_0x39f6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:373:0x0703, code lost:
        X.C18070vi.A0d(r0, 0);
        X.C18070vi.A0d(r2, 1);
        r5 = 0;
        r3 = A0D(r0, 0);
        r4 = A0M(r0, 1);
        r0 = r3.A06(r2.A00);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:374:0x0718, code lost:
        if (r0 == null) goto L_0x1649;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:375:0x071a, code lost:
        r5 = r0.getHeight();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:377:0x0726, code lost:
        if (r5.equals("bk.action.video.SendEventV2") == false) goto L_0x39f6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:378:0x0728, code lost:
        r2 = A07(r2, r0);
        r3 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:379:0x072d, code lost:
        if (r2 == null) goto L_0x3a10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:380:0x072f, code lost:
        r1 = X.BE7.A0d(A0D(r0, 1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:381:0x0737, code lost:
        if (r1 == null) goto L_0x0747;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:382:0x0739, code lost:
        ((java.util.AbstractMap) r2.A01(2131428187)).get(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:384:0x074b, code lost:
        throw X.C17880vN.A0g();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:386:0x0752, code lost:
        if (r5.equals("bk.action.video.SendEventV3") == false) goto L_0x39f6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:387:0x0754, code lost:
        r5 = A07(r2, r0);
        r3 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:388:0x0759, code lost:
        if (r5 == null) goto L_0x3a10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:389:0x075b, code lost:
        X.C18070vi.A0z(r0.A00(0), "null cannot be cast to non-null type com.instagram.common.bloks.component.base.BloksModel");
        r0 = r0.A00(1);
        X.C18070vi.A0z(r0, "null cannot be cast to non-null type com.instagram.common.bloks.component.base.BloksModel");
        r1 = X.BE7.A0d((X.DFL) r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:390:0x0771, code lost:
        if (r1 != null) goto L_0x0cd8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:392:0x0777, code lost:
        throw X.C17880vN.A0g();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:394:0x077e, code lost:
        if (r5.equals("bk.action.bloks.InsertChildrenAfter") == false) goto L_0x39f6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:395:0x0780, code lost:
        r4 = X.BE6.A13(A0J(r0, r2), "null cannot be cast to non-null type kotlin.collections.List<com.instagram.common.bloks.component.base.BloksModel>");
        r3 = A0K(r0);
        r5 = A0B(r2, r0);
        r6 = A0C(r3);
        r2 = new X.C23735Bog(r4, 1, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:397:0x07a3, code lost:
        if (r5.equals("bk.action.bloks.DismissKeyboard") == false) goto L_0x39f6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:398:0x07a5, code lost:
        X.C18070vi.A0d(r0, 0);
        X.C18070vi.A0d(r2, 1);
        r5 = A06(r2, r0, 0);
        r1 = X.C26272CwJ.A01(r5).A06;
        X.C18070vi.A0z(r1, "null cannot be cast to non-null type com.instagram.common.bloks.component.base.BloksModel");
        r2 = r1.A06(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:399:0x07c0, code lost:
        if (r2 == null) goto L_0x07da;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0016, code lost:
        if (r5.equals("bk.action.trace.EndSection") != false) goto L_0x0018;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:400:0x07c2, code lost:
        r1 = (android.view.inputmethod.InputMethodManager) r2.getContext().getSystemService("input_method");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:401:0x07cc, code lost:
        if (r1 == null) goto L_0x07d5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:402:0x07ce, code lost:
        r1.hideSoftInputFromWindow(r2.getWindowToken(), 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:403:0x07d5, code lost:
        r2.clearFocus();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:404:0x07da, code lost:
        r2 = r5.A00;
        r1 = X.C25902CoE.A00(r2, X.C25902CoE.A00);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:405:0x07e2, code lost:
        if (r1 == null) goto L_0x3a04;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:406:0x07e4, code lost:
        r0 = r1.findViewById(16908290);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:407:0x07eb, code lost:
        if (r0 == null) goto L_0x3a04;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:408:0x07ed, code lost:
        r1 = (android.view.inputmethod.InputMethodManager) r2.getSystemService("input_method");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:409:0x07f3, code lost:
        if (r1 == null) goto L_0x3a04;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:410:0x07f5, code lost:
        r1.hideSoftInputFromWindow(r0.getWindowToken(), 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:412:0x0804, code lost:
        if (r5.equals("bk.action.screen.Close") == false) goto L_0x39f6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:413:0x0806, code lost:
        r2 = A07(r2, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:414:0x080c, code lost:
        if (r2 == null) goto L_0x0aca;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:415:0x080e, code lost:
        r6 = A0D(r0, 0);
        r10 = r2.A02;
        r3 = 0;
        r7 = (java.lang.Integer) X.DOZ.A00(r2, 2131428193);
        r9 = r6.A09(45);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:416:0x0824, code lost:
        if (r7 == null) goto L_0x3a10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:417:0x0826, code lost:
        r8 = r6.A0D(35);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:418:0x082c, code lost:
        if (r8 == null) goto L_0x0ab2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:419:0x082e, code lost:
        r11 = r8.hashCode();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:420:0x0835, code lost:
        if (r11 == 111185) goto L_0x097a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:422:0x083a, code lost:
        if (r11 == 94756344) goto L_0x0966;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:424:0x083f, code lost:
        if (r11 != 530790978) goto L_0x0ab2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:426:0x0847, code lost:
        if (r8.equals("pop_to_screen") == false) goto L_0x0ab2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:427:0x0849, code lost:
        r5 = X.BE7.A0f(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:428:0x084d, code lost:
        if (r5 == null) goto L_0x0960;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:429:0x084f, code lost:
        r11 = r6.A0I(36, false);
        r8 = r7.intValue();
        r2 = r2.A00;
        new X.CLX(r10.A00());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:430:0x0866, code lost:
        if (r8 == 16542) goto L_0x093e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:432:0x086a, code lost:
        if (r8 == 17043) goto L_0x08c1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:434:0x086e, code lost:
        if (r8 != 17044) goto L_0x08b5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:435:0x0870, code lost:
        r0 = X.C24549C8u.A00(r2, android.app.Activity.class);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:436:0x0876, code lost:
        if (r0 == null) goto L_0x0a36;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:438:0x087a, code lost:
        if ((r0 instanceof com.whatsapp.wabloks.ui.screenquery.WaSqBloksActivity) == false) goto L_0x0a36;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:439:0x087c, code lost:
        r2 = (com.whatsapp.wabloks.ui.screenquery.WaSqBloksActivity) X.C24549C8u.A00(r2, com.whatsapp.wabloks.ui.screenquery.WaSqBloksActivity.class);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:440:0x0884, code lost:
        if (r2 == null) goto L_0x08ae;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:441:0x0886, code lost:
        X.C18070vi.A0X(r2.getSupportFragmentManager());
        r6 = r2.getSupportFragmentManager().A0O(2131428247);
        r7 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:442:0x089b, code lost:
        if ((r6 instanceof com.whatsapp.wabloks.ui.screenquery.WaBloksScreenQueryFragment) == false) goto L_0x08a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:443:0x089d, code lost:
        r6 = (com.whatsapp.wabloks.ui.screenquery.WaBloksScreenQueryFragment) r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:444:0x089f, code lost:
        if (r6 == null) goto L_0x08a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:445:0x08a1, code lost:
        r7 = r6.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:446:0x08a3, code lost:
        r6 = r2.getSupportFragmentManager();
        X.C18070vi.A0X(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:447:0x08aa, code lost:
        if (r11 == false) goto L_0x09e7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:450:0x08b4, code lost:
        throw X.AnonymousClass000.A0n("Context should be derived from a AmaBloksActivity");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:451:0x08b5, code lost:
        r3 = X.BE8.A0X("No implementation bound to key: %s", new java.lang.Object[]{r7});
     */
    /* JADX WARNING: Code restructure failed: missing block: B:452:0x08c1, code lost:
        r0 = (X.AnonymousClass1FL) X.C24549C8u.A00(r2, X.AnonymousClass1FL.class);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:453:0x08c9, code lost:
        if (r0 == null) goto L_0x0a6d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:454:0x08cb, code lost:
        r7 = X.C181819Ry.A00(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:455:0x08cf, code lost:
        if (r7 == null) goto L_0x0a6d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:456:0x08d1, code lost:
        r0 = r7.A2K();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:457:0x08d5, code lost:
        if (r0 == null) goto L_0x08e2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:458:0x08d7, code lost:
        r0 = r0.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:459:0x08d9, code lost:
        if (r0 != null) goto L_0x08e4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:460:0x08db, code lost:
        X.C18070vi.A11("screenProps");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:461:0x08e2, code lost:
        r2 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:462:0x08e4, code lost:
        r2 = r0.A06;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:463:0x08e6, code lost:
        r6 = r7.A1E();
        X.C18070vi.A0X(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:464:0x08ed, code lost:
        if (r11 == false) goto L_0x0917;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:466:0x08f3, code lost:
        if (r6.A0K() == 0) goto L_0x0906;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:468:0x0901, code lost:
        if (r5.equals(((X.C34001jj) r6.A0S(0)).A0A) == false) goto L_0x0906;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:469:0x0903, code lost:
        r7.A28();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:471:0x090a, code lost:
        if (r5.equals(r2) == false) goto L_0x0917;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:473:0x0910, code lost:
        if (r6.A0K() != 0) goto L_0x0a1b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:474:0x0912, code lost:
        r7.A28();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:476:0x091b, code lost:
        if (r5.equals(r2) != false) goto L_0x3a10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:477:0x091d, code lost:
        r2 = r6.A0K() - 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:479:0x0923, code lost:
        if (-1 >= r2) goto L_0x0a20;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:481:0x0931, code lost:
        if (r5.equals(((X.C34001jj) r6.A0S(r2)).A0A) == false) goto L_0x0937;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:482:0x0933, code lost:
        r6.A0v(r5, 1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:483:0x0937, code lost:
        r2 = r2 - 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:484:0x093a, code lost:
        if (r11 == false) goto L_0x3a10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:486:0x093e, code lost:
        if (r9 == null) goto L_0x0950;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:488:0x0944, code lost:
        if (r9.A05 != 16962) goto L_0x0950;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:489:0x0946, code lost:
        r1 = com.whatsapp.voipcalling.CallLinkInfo.DEFAULT_CALL_LINK_CALL_ID;
        r0 = X.BE7.A0d(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:490:0x094c, code lost:
        if (r0 == null) goto L_0x0952;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:491:0x094e, code lost:
        r1 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:492:0x0950, code lost:
        r1 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:493:0x0952, code lost:
        r1 = X.C25301Cd5.A00(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:494:0x0956, code lost:
        X.A8X.A04(r2, new X.C166558d5(r1), r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:495:0x0960, code lost:
        r3 = X.AnonymousClass000.A0k("Required value was null.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:497:0x096c, code lost:
        if (r8.equals("close") == false) goto L_0x0ab2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:498:0x096e, code lost:
        r8 = r7.intValue();
        r5 = r2.A00;
        r6 = new X.BNE(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:500:0x0980, code lost:
        if (r8.equals("pop") == false) goto L_0x0ab2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:501:0x0982, code lost:
        r8 = r7.intValue();
        r5 = r2.A00;
        r6 = new X.BNF(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:502:0x098d, code lost:
        new X.CLX(r10.A00());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:503:0x0998, code lost:
        if (r8 == 16542) goto L_0x0a76;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:505:0x099c, code lost:
        if (r8 == 17043) goto L_0x0a47;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:507:0x09a0, code lost:
        if (r8 != 17044) goto L_0x0a3b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:508:0x09a2, code lost:
        r0 = X.C24549C8u.A00(r5, android.app.Activity.class);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:509:0x09a8, code lost:
        if (r0 == null) goto L_0x0a36;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:511:0x09ac, code lost:
        if ((r0 instanceof com.whatsapp.wabloks.ui.screenquery.WaSqBloksActivity) == false) goto L_0x0a36;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:512:0x09ae, code lost:
        r2 = (com.whatsapp.wabloks.ui.screenquery.WaSqBloksActivity) X.C24549C8u.A00(r5, com.whatsapp.wabloks.ui.screenquery.WaSqBloksActivity.class);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:513:0x09b6, code lost:
        if (r2 == null) goto L_0x0a2e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:514:0x09b8, code lost:
        r1 = r2.getSupportFragmentManager();
        X.C18070vi.A0X(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:515:0x09c1, code lost:
        if ((r6 instanceof X.BNE) != false) goto L_0x09e2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:517:0x09c5, code lost:
        if ((r6 instanceof X.BNF) == false) goto L_0x3a10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:519:0x09cb, code lost:
        if (r1.A0K() == 0) goto L_0x09e2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:521:0x09cf, code lost:
        if (r1.A0F != false) goto L_0x09e2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:522:0x09d1, code lost:
        r1.A0b();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:524:0x09da, code lost:
        if (r5.equals(r7) == false) goto L_0x09e7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:526:0x09e0, code lost:
        if (r6.A0K() != 0) goto L_0x0a1b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:527:0x09e2, code lost:
        r2.finish();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:529:0x09eb, code lost:
        if (r5.equals(r7) != false) goto L_0x3a10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:530:0x09ed, code lost:
        r7 = r6.A0K() - 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:532:0x09f3, code lost:
        if (-1 >= r7) goto L_0x0a20;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:534:0x0a01, code lost:
        if (r5.equals(((X.C34001jj) r6.A0S(r7)).A0A) == false) goto L_0x0a07;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:535:0x0a03, code lost:
        r6.A0v(r5, 1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:536:0x0a07, code lost:
        r7 = r7 - 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:537:0x0a0a, code lost:
        if (r11 == false) goto L_0x3a10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:539:0x0a18, code lost:
        if (r5.equals(((X.C34001jj) r6.A0S(0)).A0A) == false) goto L_0x0a1b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:541:0x0a1b, code lost:
        r6.A0b();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:542:0x0a20, code lost:
        r1 = X.AnonymousClass001.A1H("Could not find Bloks screen with ID: ", r5, X.AnonymousClass000.A10());
        r0 = "WaBloksNavigationUtils";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:543:0x0a2e, code lost:
        r3 = X.AnonymousClass000.A0n("Context should be derived from a AmaBloksActivity");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:544:0x0a36, code lost:
        r1 = "WaBloksFullScreenContainerNavigator";
        r0 = "Attempting to close a bloks screen from a non-bloks activity";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:545:0x0a3b, code lost:
        r3 = X.BE8.A0X("No implementation bound to key: %s", new java.lang.Object[]{r7});
     */
    /* JADX WARNING: Code restructure failed: missing block: B:546:0x0a47, code lost:
        r0 = (X.AnonymousClass1FL) X.C24549C8u.A00(r5, X.AnonymousClass1FL.class);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:547:0x0a4f, code lost:
        if (r0 == null) goto L_0x0a6d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:548:0x0a51, code lost:
        r1 = X.C181819Ry.A00(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:549:0x0a55, code lost:
        if (r1 == null) goto L_0x0a6d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:551:0x0a59, code lost:
        if ((r6 instanceof X.BNE) == false) goto L_0x0a60;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:552:0x0a5b, code lost:
        r1.A28();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:554:0x0a62, code lost:
        if ((r6 instanceof X.BNF) == false) goto L_0x3a10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:555:0x0a64, code lost:
        r1.A1E().A0b();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:556:0x0a6d, code lost:
        r1 = "WaBloksBottomSheetContainerNavigator";
        r0 = "Attempting to close a bloks bottomsheet from a non-bloks host fragment";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:557:0x0a71, code lost:
        X.C25913CoX.A01(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:558:0x0a76, code lost:
        r4 = r6 instanceof X.BNF;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:559:0x0a78, code lost:
        if (r4 == false) goto L_0x0a80;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:560:0x0a7a, code lost:
        r2 = r6.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:561:0x0a80, code lost:
        r2 = ((X.BNE) r6).A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:562:0x0a85, code lost:
        if (r2 == null) goto L_0x0a97;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:564:0x0a8b, code lost:
        if (r2.A05 != 16962) goto L_0x0a97;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:565:0x0a8d, code lost:
        r1 = com.whatsapp.voipcalling.CallLinkInfo.DEFAULT_CALL_LINK_CALL_ID;
        r0 = X.BE7.A0d(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:566:0x0a93, code lost:
        if (r0 == null) goto L_0x0a99;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:567:0x0a95, code lost:
        r1 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:568:0x0a97, code lost:
        r1 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:569:0x0a99, code lost:
        r1 = X.C25301Cd5.A00(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:571:0x0a9f, code lost:
        if ((r6 instanceof X.BNE) == false) goto L_0x0aa6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:572:0x0aa1, code lost:
        X.A8X.A03(r5, (X.DOZ) null, (X.DFL) null, (X.E8A) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:573:0x0aa6, code lost:
        if (r4 == false) goto L_0x3a10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:574:0x0aa8, code lost:
        X.A8X.A04(r5, new X.C166558d5(r1), (java.lang.String) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:575:0x0ab2, code lost:
        r1 = X.AnonymousClass000.A10();
        r1.append("Unrecognized close type: ");
        r1 = X.AnonymousClass000.A0y(r6.A0D(35), r1);
        r0 = "BKBloksActionScreenCloseImpl";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:576:0x0ac5, code lost:
        X.C25913CoX.A01(r0, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:577:0x0aca, code lost:
        r3 = X.AnonymousClass000.A0n("Required value was null.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:579:0x0ad6, code lost:
        if (r5.equals("bk.action.bloks.WithScope") == false) goto L_0x39f6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:580:0x0ad8, code lost:
        X.C18070vi.A0d(r0, 0);
        X.C18070vi.A0d(r2, 1);
        r12 = X.C25488Cgj.A00(r0, 0);
        r1 = X.CFq.A00.incrementAndGet();
        r13 = new java.util.LinkedList(r2.A06);
        X.C17890vO.A1D(r13, r1);
        r11 = r2.A00;
        r10 = r2.A04;
        r9 = r2.A09;
        r8 = r2.A01;
        r7 = r2.A02;
        r6 = r2.A0A;
        r5 = r2.A01;
        r19 = r11;
        r21 = r8;
        r3 = X.C25974Cph.A00(new X.C23736Boh((X.E9O) null, r19, (X.DOZ) null, r21, r7, r2.A03, r2.A05, r10, r5, r2.A05, r2.A07, (java.lang.String) null, r13, r9, r6), X.C199029zJ.A01, r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:582:0x0b3b, code lost:
        if (r5.equals("bk.action.bloks.ParseEmbedded") == false) goto L_0x39f6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:583:0x0b3d, code lost:
        r1 = A0I(r0, r2);
        X.AnonymousClass8BR.A1I(r1);
        r1 = (java.lang.String) r1;
        X.AnonymousClass0O7.A01("ParseEmbedded");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:585:?, code lost:
        X.C25995CqB.A00();
        r0 = X.C25529ChR.A00(X.BEA.A0V(r1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:586:0x0b56, code lost:
        if (r0 == null) goto L_0x0b68;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:587:0x0b58, code lost:
        r0 = r0.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:588:0x0b5a, code lost:
        if (r0 == null) goto L_0x0b68;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:592:?, code lost:
        r3 = A09(r2, r0.A00, (java.util.Map) null, false, false);
        X.AnonymousClass0O7.A00();
        r3 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:596:0x0b6e, code lost:
        throw X.AnonymousClass000.A0k("Encountered empty BloksResponse. Could not parse embedded payload");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:602:0x0b7d, code lost:
        if (r5.equals("bk.action.text_input.InsertTextAtCursor") == false) goto L_0x39f6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:603:0x0b7f, code lost:
        r3 = A0E(r0, r2);
        r5 = A0M(r0, 1);
        r0 = r2.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:604:0x0b89, code lost:
        if (r0 == null) goto L_0x3a04;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:605:0x0b8b, code lost:
        r1 = (X.CTH) X.C26272CwJ.A04(r0, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:606:0x0b91, code lost:
        if (r1 == null) goto L_0x3a04;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:607:0x0b93, code lost:
        X.C18070vi.A0d(r5, 0);
        X.C26176Ctu.A02((java.lang.String) null);
        r3 = r1.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:608:0x0b9c, code lost:
        if (r3 == null) goto L_0x3a04;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:609:0x0b9e, code lost:
        r2 = r3.getSelectionStart();
        r1 = r3.getSelectionEnd();
        r0 = r3.getText();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:610:0x0baa, code lost:
        if (r2 == r1) goto L_0x0bbc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:611:0x0bac, code lost:
        r0.replace(r2, r1, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:612:0x0baf, code lost:
        r3.setText(r0);
        r3.setSelection(r2 + r5.length());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:613:0x0bbc, code lost:
        r0.insert(r2, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:615:0x0bc6, code lost:
        if (r5.equals("bk.action.bloks.UpdateGlobalConsistencyStore") == false) goto L_0x39f6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:616:0x0bc8, code lost:
        r4 = A0I(r0, r2);
        X.AnonymousClass8BR.A1I(r4);
        r4 = (java.lang.String) r4;
        r3 = ((X.C25488Cgj) r0.A00(1)).A00;
        X.C18070vi.A0z(r3, "null cannot be cast to non-null type com.instagram.common.lispy.lang.Expression");
        r1 = r2.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:617:0x0be0, code lost:
        if (r1 == null) goto L_0x0c0b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:618:0x0be2, code lost:
        r1 = X.C26272CwJ.A02(r1, "gs");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:619:0x0be8, code lost:
        if (r1 == null) goto L_0x0c07;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:621:0x0bec, code lost:
        if ((r1 instanceof X.C26960DNi) == false) goto L_0x0c07;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:622:0x0bee, code lost:
        r5 = ((X.C26960DNi) r1).A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:623:0x0bf2, code lost:
        monitor-enter(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:625:?, code lost:
        r1 = r5.A00.get(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:627:?, code lost:
        r1 = X.CCJ.A00(X.C108985cd.A0K(r1), r3, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:629:?, code lost:
        r5.A01(r4, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:631:?, code lost:
        monitor-exit(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:633:0x0c07, code lost:
        r1 = "BloksLegacyDataModule";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:635:0x0c0f, code lost:
        throw X.C17880vN.A0g();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:637:0x0c16, code lost:
        if (r5.equals("bk.action.array.Map") == false) goto L_0x39f6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:638:0x0c18, code lost:
        r9 = (java.util.List) A0I(r0, r2);
        r8 = X.C25488Cgj.A00(r0, 1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:639:0x0c22, code lost:
        if (r9 != null) goto L_0x0c28;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:640:0x0c24, code lost:
        r3 = java.util.Collections.EMPTY_LIST;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:641:0x0c28, code lost:
        r3 = X.AnonymousClass000.A14(r9);
        r7 = r9.size();
        r6 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:642:0x0c31, code lost:
        if (r6 >= r7) goto L_0x3a10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:643:0x0c33, code lost:
        r5 = new X.C20046A4p();
        r5.A03(java.lang.Integer.valueOf(r6), 0);
        r3.add(X.C25974Cph.A00(r2, X.BE7.A0R(r5, r9.get(r6), 1), r8));
        r6 = r6 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:645:0x0c57, code lost:
        if (r5.equals("bk.action.bloks.Reduce") == false) goto L_0x39f6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:646:0x0c59, code lost:
        r5 = A0N(r0, r2);
        r0 = r2.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:647:0x0c5f, code lost:
        if (r0 == null) goto L_0x0ca7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:648:0x0c61, code lost:
        r4 = X.C26272CwJ.A01(r0);
        r3 = new X.C25974Cph(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:649:0x0c6e, code lost:
        if (X.C26176Ctu.A03() == false) goto L_0x0c9f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:650:0x0c70, code lost:
        X.AnonymousClass0O7.A01("Bloks Reduce");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:651:0x0c77, code lost:
        if (r4.A0N == false) goto L_0x0c80;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:652:0x0c79, code lost:
        X.C25913CoX.A01("BloksTreeManager", "Trying to access a tree on a destroyed BloksTreeManager");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:653:0x0c80, code lost:
        X.C26176Ctu.A02("Tree operations are only supported from the UI Thread");
        r2 = X.C26962DNk.A02(r4, r4.A0H);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:654:0x0c95, code lost:
        if (r2 == X.CC3.A00((X.E9O) null, new X.C23714BoL(r3, r5), r2)) goto L_0x3a01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:655:0x0c97, code lost:
        r3 = X.AnonymousClass000.A0n("Reflow traversal produced an updated component");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:656:0x0c9f, code lost:
        r3 = X.AnonymousClass8BR.A0w("Accessing state is only supported from the UI Thread");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:658:0x0cab, code lost:
        throw X.C17880vN.A0g();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:660:0x0cb2, code lost:
        if (r5.equals("bk.action.video.SetPositionV2") == false) goto L_0x39f6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:661:0x0cb4, code lost:
        r5 = A07(r2, r0);
        r3 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:662:0x0cb9, code lost:
        if (r5 == null) goto L_0x3a10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:663:0x0cbb, code lost:
        r4 = r0.A00(0);
        X.C18070vi.A0z(r4, "null cannot be cast to non-null type kotlin.Number");
        ((java.lang.Number) r4).intValue();
        r1 = X.BE7.A0d(A0D(r0, 1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:664:0x0cd1, code lost:
        if (r1 != null) goto L_0x0cd8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:666:0x0cd7, code lost:
        throw X.C17880vN.A0g();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:667:0x0cd8, code lost:
        ((java.util.AbstractMap) r5.A01(2131428187)).get(r1);
        r3 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:669:0x0cec, code lost:
        if (r5.equals("bk.action.ttrc.AddPointV2") == false) goto L_0x39f6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:670:0x0cee, code lost:
        X.C18070vi.A0d(r0, 0);
        r5 = A02(r0, 0);
        r4 = r0.A00(1);
        X.C18070vi.A0z(r4, "null cannot be cast to non-null type kotlin.String");
        r3 = A0L(r0, 2);
        r2 = r0.A00(3);
        X.C18070vi.A0z(r2, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.Any, kotlin.Any>");
        r1 = X.BE6.A0n(r0, 4);
        X.C18070vi.A0z(r1, "null cannot be cast to non-null type kotlin.Long");
        X.A7e.A03((java.lang.Long) r1, (java.lang.String) r4, r3, (java.util.Map) r2, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:672:0x0d28, code lost:
        if (r5.equals("bk.action.callback.Make") == false) goto L_0x39f6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:673:0x0d2a, code lost:
        X.C18070vi.A0d(r0, 0);
        X.C18070vi.A0d(r2, 1);
        r3 = new X.C25562Ci0(r2, X.C25488Cgj.A00(r0, 0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:675:0x0d41, code lost:
        if (r5.equals("bk.action.bloks.Inflate") == false) goto L_0x39f6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:676:0x0d43, code lost:
        X.C18070vi.A0d(r0, 0);
        X.C18070vi.A0d(r2, 1);
        r5 = r0.A00;
        r3 = r5.get(0);
        X.C18070vi.A0z(r3, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.Any, kotlin.Any>");
        r3 = (java.util.Map) r3;
        r4 = X.AnonymousClass8BT.A08(r5, 1);
        r5 = X.AnonymousClass8BT.A08(r5, 2);
        X.AnonymousClass0O7.A01("Inflate");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:678:?, code lost:
        r3 = X.AnonymousClass000.A15(r3);
        X.C25995CqB.A00();
        r0 = new X.C26954DNc(r2, r3);
        r0.BkN();
        r0 = X.C25338Cdx.A01((X.C24948CQy) null, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:679:0x0d78, code lost:
        if (r4 == null) goto L_0x3a01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:680:0x0d7a, code lost:
        r1 = X.C108985cd.A0K(r0);
        X.C18070vi.A0d(r1, 2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:682:?, code lost:
        X.CCJ.A00(r1, r4, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:683:0x0d89, code lost:
        r4 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:685:?, code lost:
        X.C25913CoX.A00((X.DOZ) null, "BKBloksActionBloksInflateImpl", X.AnonymousClass001.A1H("Exception while executing ", "SuccessCallback", X.AnonymousClass000.A10()), r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:686:0x0d9c, code lost:
        if (r5 != null) goto L_0x0d9e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:690:?, code lost:
        r0 = X.C199029zJ.A01;
        X.C18070vi.A0Z(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:692:?, code lost:
        X.CCJ.A00(r0, r5, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:693:0x0daa, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:695:?, code lost:
        X.C25913CoX.A00((X.DOZ) null, "BKBloksActionBloksInflateImpl", X.AnonymousClass001.A1H("Exception while executing ", "FailureCallback", X.AnonymousClass000.A10()), r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:699:0x0dc3, code lost:
        if (r5.equals("bk.action.bloks.AppendChildren") == false) goto L_0x39f6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:700:0x0dc5, code lost:
        r4 = A0N(r0, r2);
        r3 = X.BE6.A13(X.BE6.A0n(r0, 1), "null cannot be cast to non-null type kotlin.collections.List<com.instagram.common.bloks.component.base.BloksModel>");
        r6 = X.C26272CwJ.A01(A06(r2, r0, 2));
        r2 = new X.C26965DNn(r4);
        r0 = new X.C23733Boe(r3, 2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:702:0x0dee, code lost:
        if (r5.equals("bk.action.bloks.ShowKeyboard") == false) goto L_0x39f6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:703:0x0df0, code lost:
        r3 = (X.DFL) A0I(r0, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:704:0x0df6, code lost:
        if (r3 == null) goto L_0x2863;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:705:0x0df8, code lost:
        r3 = r3.A06(r2.A00);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:706:0x0dfe, code lost:
        if (r3 == null) goto L_0x2863;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:707:0x0e00, code lost:
        r2 = X.BE9.A0j(r3);
        X.C18070vi.A0z(r2, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        r3.requestFocus();
        ((android.view.inputmethod.InputMethodManager) r2).showSoftInput(r3, 0);
        r3 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:709:0x0e1d, code lost:
        if (r5.equals("bk.action.animation.linear.CreateAnimation") == false) goto L_0x39f6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:710:0x0e1f, code lost:
        X.C18070vi.A0d(r0, 0);
        X.C18070vi.A0d(r2, 1);
        r11 = X.C25488Cgj.A00(r0, 0);
        r10 = X.C25488Cgj.A00(r0, 1);
        r5 = r0.A00(2);
        X.C18070vi.A0z(r5, "null cannot be cast to non-null type kotlin.Number");
        r8 = X.AnonymousClass000.A04(r5);
        r7 = A01(r0, 3);
        r6 = A01(r0, 4);
        r3 = new android.animation.ValueAnimator();
        r5 = X.C108985cd.A0K(r3);
        r3.addUpdateListener(new X.C26317Cxa(r2, r11, r5, 0));
        r3.addListener(new X.AnonymousClass74T(r10, r5, r2, 0));
        r3.setInterpolator(new android.view.animation.LinearInterpolator());
        r3.setFloatValues(new float[]{r8, r7});
        r3.setDuration((long) (r6 * 1000.0f));
        r3 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:712:0x0e80, code lost:
        if (r5.equals("bk.action.timer.Restart") == false) goto L_0x39f6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:713:0x0e82, code lost:
        X.C18070vi.A0d(r0, 0);
        X.C18070vi.A0d(r2, 1);
        r3 = A0M(r0, 0);
        r2 = r2.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:714:0x0e8e, code lost:
        if (r2 == null) goto L_0x0ebf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:715:0x0e90, code lost:
        r5 = (X.CXG) ((java.util.HashMap) r2.A01(2131428185)).get(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:716:0x0e9f, code lost:
        if (r5 == null) goto L_0x3a04;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:718:0x0ea3, code lost:
        if (r5.A00 != false) goto L_0x3a04;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:720:0x0ea7, code lost:
        if (r5.A01 != false) goto L_0x0eb2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:721:0x0ea9, code lost:
        r5.A01 = true;
        r5.A03.removeCallbacks(r5.A05);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:722:0x0eb2, code lost:
        r5.A01 = false;
        r5.A03.postDelayed(r5.A05, r5.A02);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:724:0x0ec3, code lost:
        throw X.C17880vN.A0g();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:726:0x0eca, code lost:
        if (r5.equals("bk.action.string.SplitWithString") == false) goto L_0x39f6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:727:0x0ecc, code lost:
        X.C18070vi.A0d(r0, 0);
        r6 = 0;
        r5 = r0.A00(0);
        X.C18070vi.A0z(r5, "null cannot be cast to non-null type kotlin.String");
        r0 = A0L(r0, 1);
        r3 = X.AnonymousClass000.A13();
        r1 = java.util.regex.Pattern.quote(r0);
        X.C18070vi.A0X(r1);
        r2 = X.C108955ca.A1b(new X.C41661wr(r1).A01((java.lang.String) r5, 0));
        r1 = r2.length;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:728:0x0ef8, code lost:
        if (r6 >= r1) goto L_0x3a10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:729:0x0efa, code lost:
        r3.add(r2[r6]);
        r6 = r6 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:730:0x0f02, code lost:
        r3 = "bk.action.animated.CancelToken";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:732:0x0f0c, code lost:
        if (r5.equals("bk.action.vcollection.SetOffset") == false) goto L_0x39f6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:733:0x0f0e, code lost:
        r6 = A0E(r0, r2);
        r5 = A00(r0, 1);
        r3 = X.C25343Ce2.A01(r0.A00(2));
        r2 = A05(r2, r6, r0, 3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:734:0x0f24, code lost:
        if (r2 == null) goto L_0x3a04;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:735:0x0f26, code lost:
        r0 = X.C25995CqB.A00().A00;
        X.C18070vi.A0X(r0);
        r1 = (int) X.C25342Ce1.A00(r0, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:736:0x0f38, code lost:
        if (X.C26176Ctu.A03() == false) goto L_0x0f51;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:738:0x0f3e, code lost:
        if (X.C26176Ctu.A03() == false) goto L_0x0f4a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:739:0x0f40, code lost:
        r2.A00(0, r1 - r2.A02.A05, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:741:0x0f50, code lost:
        throw X.AnonymousClass8BR.A0w("Cannot getScroll off the main thread!");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:743:0x0f57, code lost:
        throw X.AnonymousClass8BR.A0w("setYOffset cannot be called from  a background thread!");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:745:0x0f5e, code lost:
        if (r5.equals("bk.action.component.GetHeight") == false) goto L_0x39f6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:746:0x0f60, code lost:
        r1 = A0I(r0, r2);
        X.C18070vi.A0z(r1, "null cannot be cast to non-null type com.instagram.common.bloks.component.base.BloksModel");
        r0 = ((X.DFL) r1).A06(r2.A00);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:747:0x0f71, code lost:
        if (r0 == null) goto L_0x3a04;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:748:0x0f73, code lost:
        r3 = java.lang.Integer.valueOf(r0.getHeight());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:750:0x0f83, code lost:
        if (r5.equals("bk.action.media.LoadAlbums") == false) goto L_0x39f6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:751:0x0f85, code lost:
        r5 = A07(r2, r0);
        r3 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:752:0x0f8a, code lost:
        if (r5 == null) goto L_0x3a10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:753:0x0f8c, code lost:
        r1 = (java.util.Map) r5.A01(2131428169);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:754:0x0f97, code lost:
        if (r1 != null) goto L_0x0f9b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:755:0x0f99, code lost:
        r2 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:756:0x0f9b, code lost:
        r2 = (X.CVW) r1.get("media_store");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:758:0x0fa3, code lost:
        if ((r2 instanceof com.bloks.stdlib.datamodules.mediastore.MediaStoreDataModule) == false) goto L_0x0fb2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:759:0x0fa5, code lost:
        r2 = (com.bloks.stdlib.datamodules.mediastore.MediaStoreDataModule) r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:760:0x0fa7, code lost:
        if (r2 == null) goto L_0x0fb2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:761:0x0fa9, code lost:
        r2.loadAlbums(r5, A0M(r0, 0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:762:0x0fb2, code lost:
        X.C25913CoX.A01("bk.action.media.LoadAlbums", "Failed to load albums: MediaStore data module is not found.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:764:0x0fbf, code lost:
        if (r5.equals("bk.action.bloks.GetVariable2") == false) goto L_0x39f6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:765:0x0fc1, code lost:
        r0 = A0I(r0, r2);
        X.AnonymousClass8BR.A1I(r0);
        r3 = X.C25881Cns.A02(r2, (java.lang.String) r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:767:0x0fd6, code lost:
        if (r5.equals("bk.action.vcollection.GetOffset") == false) goto L_0x39f6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:768:0x0fd8, code lost:
        r2 = A05(r2, A0E(r0, r2), r0, 1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:769:0x0fe0, code lost:
        if (r2 == null) goto L_0x3a04;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:770:0x0fe2, code lost:
        r1 = X.C25995CqB.A00().A00;
        X.C18070vi.A0X(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:771:0x0fef, code lost:
        if (X.C26176Ctu.A03() == false) goto L_0x1001;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:772:0x0ff1, code lost:
        r3 = java.lang.Integer.valueOf((int) X.C25342Ce1.A01(r1, (float) r2.A02.A05));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:774:0x1007, code lost:
        throw X.AnonymousClass8BR.A0w("Cannot getScroll off the main thread!");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:776:0x100e, code lost:
        if (r5.equals("bk.action.bloks.ChildAtIndex") == false) goto L_0x39f6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:777:0x1010, code lost:
        X.C18070vi.A0d(r0, 0);
        r3 = r0.A00;
        r2 = r3.get(0);
        X.C18070vi.A0z(r2, "null cannot be cast to non-null type com.instagram.common.bloks.component.base.BloksModel");
        r1 = r3.get(1);
        X.C18070vi.A0z(r1, "null cannot be cast to non-null type kotlin.Number");
        r3 = ((X.DFL) r2).A0E().get(X.AnonymousClass000.A0M(r1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:779:0x103d, code lost:
        if (r5.equals("bk.action.bloks.OneTimeBind") == false) goto L_0x39f6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:780:0x103f, code lost:
        r1 = (X.DFL) A0I(r0, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:781:0x1045, code lost:
        if (r1 == null) goto L_0x3a04;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:782:0x1047, code lost:
        r0 = r2.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:783:0x1049, code lost:
        if (r0 == null) goto L_0x1051;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:784:0x104b, code lost:
        r3 = X.CBy.A00(r0, r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:786:0x1055, code lost:
        throw X.C17880vN.A0g();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:788:0x105c, code lost:
        if (r5.equals("bk.action.string.Trim") == false) goto L_0x39f6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:789:0x105e, code lost:
        X.C18070vi.A0d(r0, 0);
        r3 = X.AnonymousClass1YF.A0I(A0M(r0, 0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:791:0x1071, code lost:
        if (r5.equals("bk.action.collection.ScrollToIndexById") == false) goto L_0x39f6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:792:0x1073, code lost:
        r6 = A0H(r0, r2);
        X.C18070vi.A0z(r6, "null cannot be cast to non-null type com.instagram.common.bloks.component.base.BloksModel");
        r5 = r0.A00(1);
        X.C18070vi.A0z(r5, "null cannot be cast to non-null type com.instagram.common.bloks.component.base.BloksModel");
        r5 = (X.DFL) r5;
        r10 = A05(r2, (X.DFL) r6, r0, 2);
        r6 = X.DFL.A00(r5, 36);
        r3 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:793:0x1095, code lost:
        if ((r6 instanceof java.lang.String) == false) goto L_0x109b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:794:0x1097, code lost:
        r6 = (java.lang.String) r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:795:0x1099, code lost:
        if (r6 != null) goto L_0x10a5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:796:0x109b, code lost:
        r6 = java.lang.String.valueOf(X.DFL.A00(r5, 36));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:797:0x10a5, code lost:
        if (r10 == null) goto L_0x3a10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:798:0x10a7, code lost:
        r9 = X.BE7.A0d(r5);
        r8 = r5.A0I(38, true);
        r11 = X.BE7.A0g(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:799:0x10b9, code lost:
        if (X.C26176Ctu.A03() == false) goto L_0x1164;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:800:0x10bb, code lost:
        r5 = r10.A01.A03;
        r2 = r5.size();
        r7 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:801:0x10c4, code lost:
        if (r7 >= r2) goto L_0x3a10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:802:0x10c6, code lost:
        r0 = ((X.DFE) r5.get(r7)).A01.A0C();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:803:0x10d2, code lost:
        if (r0 == null) goto L_0x10db;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:805:0x10d8, code lost:
        if (r0.equals(r6) == false) goto L_0x10db;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:807:0x10db, code lost:
        r7 = r7 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:808:0x10de, code lost:
        if (r7 < 0) goto L_0x3a10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:809:0x10e0, code lost:
        r6 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:810:0x10e1, code lost:
        if (r11 == null) goto L_0x10f0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:812:0x10e9, code lost:
        if (X.BE6.A1V(r11) == false) goto L_0x1110;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:813:0x10eb, code lost:
        X.C25913CoX.A01("CollectionBinderUtils", "Offsets defined as a percentage value are not supported");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:823:?, code lost:
        r6 = (int) X.A90.A01(r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:827:?, code lost:
        X.C25913CoX.A01("CollectionBinderUtils", "Error parsing offset when scrolling to index");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:845:0x116a, code lost:
        throw X.AnonymousClass8BR.A0w("scrollToIndexById cannot be called from a background thread.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:847:0x1171, code lost:
        if (r5.equals("bk.action.ttrc.NetworkContentDisplayed") == false) goto L_0x39f6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:848:0x1173, code lost:
        X.C18070vi.A0d(r0, 0);
        r3 = A02(r0, 0);
        r2 = X.AnonymousClass8BT.A0t(r0, 1);
        r1 = A0M(r0, 2);
        X.C18070vi.A0d(r1, 2);
        r0 = X.A7e.A00(r2, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:849:0x118b, code lost:
        if (r0 == null) goto L_0x3a04;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:850:0x118d, code lost:
        r0.A0G(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:852:0x1198, code lost:
        if (r5.equals("bk.action.accessibility.SetFocus") == false) goto L_0x39f6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:853:0x119a, code lost:
        r1 = (X.DFL) A0I(r0, r2);
        r3 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:854:0x11a1, code lost:
        if (r1 == null) goto L_0x3a10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:855:0x11a3, code lost:
        r1 = r1.A06(r2.A00);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:856:0x11a9, code lost:
        if (r1 == null) goto L_0x3a10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:857:0x11ab, code lost:
        r1.sendAccessibilityEvent(8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:859:0x11b8, code lost:
        if (r5.equals("bk.action.animated.Stagger") == false) goto L_0x39f6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:860:0x11ba, code lost:
        r7 = A07(r2, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:861:0x11be, code lost:
        if (r7 == null) goto L_0x3a04;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:862:0x11c0, code lost:
        r4 = A00(r0, 0);
        r8 = X.BE6.A13(r0.A00(1), "null cannot be cast to non-null type kotlin.collections.List<android.animation.Animator>");
        r4 = (long) (r4 * ((float) X.C26258Cw3.A00));
        X.C18070vi.A0d(r8, 1);
        A0Q(r7, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:863:0x11dd, code lost:
        if (r8.size() == 1) goto L_0x3552;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:864:0x11df, code lost:
        r6 = r8.iterator();
        r1 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:866:0x11e8, code lost:
        if (r6.hasNext() == false) goto L_0x1203;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:867:0x11ea, code lost:
        r3 = r6.next();
        r2 = r1 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:868:0x11f0, code lost:
        if (r1 >= 0) goto L_0x11f7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:869:0x11f2, code lost:
        X.AnonymousClass1ZU.A0B();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:870:0x11f6, code lost:
        throw null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:871:0x11f7, code lost:
        r3 = (android.animation.Animator) r3;
        X.C26272CwJ.A05(r3, r7);
        X.C26258Cw3.A03(r3, ((long) r1) * r4);
        r1 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:872:0x1203, code lost:
        r0 = X.AnonymousClass00R.A0C;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:874:0x120d, code lost:
        if (r5.equals("bk.action.ttrc.MarkerStart") == false) goto L_0x39f6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:875:0x120f, code lost:
        X.C18070vi.A0d(r0, 0);
        r4 = A02(r0, 0);
        r3 = A0M(r0, 1);
        X.C18070vi.A0z(r0.A00(2), "null cannot be cast to non-null type kotlin.Long");
        r2 = X.C25995CqB.A00().A09;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:876:0x122a, code lost:
        if (r2 == null) goto L_0x1240;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:877:0x122c, code lost:
        if (r3 == null) goto L_0x3a04;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:879:?, code lost:
        r2.A00((java.lang.String) null, r4, java.lang.Integer.parseInt(r3));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:880:0x1238, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:883:?, code lost:
        X.C25913CoX.A02("BloksTTRCFunctionsUtil", r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:885:0x1246, code lost:
        throw X.AnonymousClass000.A0n("TTRC Logger not configured as part of Bloks initialization in your app.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:887:0x124d, code lost:
        if (r5.equals("bk.action.core.Delay") == false) goto L_0x39f6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:888:0x124f, code lost:
        r4 = A0H(r0, r2);
        X.C18070vi.A0z(r4, "null cannot be cast to non-null type kotlin.Number");
        X.C17890vO.A0D().postDelayed(new X.C27081DTg(X.C25488Cgj.A00(r0, 1), A06(r2, r0, 2), r2, 12), X.C17880vN.A05(r4));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:890:0x127b, code lost:
        if (r5.equals("bk.action.timer.Start") == false) goto L_0x39f6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:891:0x127d, code lost:
        X.C18070vi.A0d(r0, 0);
        X.C18070vi.A0d(r2, 1);
        r5 = r0.A00(1);
        X.C18070vi.A0z(r5, "null cannot be cast to non-null type kotlin.Number");
        r5 = X.C17880vN.A05(r5);
        r9 = X.C25343Ce2.A01(r0.A00(2));
        r7 = X.C25488Cgj.A00(r0, 3);
        r3 = A0M(r0, 4);
        r8 = r2.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:892:0x12a5, code lost:
        if (r8 == null) goto L_0x12f3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:893:0x12a7, code lost:
        X.C18070vi.A0d(r3, 1);
        r7 = new X.CXG(new X.CR0(r2, r7, r3, X.AnonymousClass3MW.A0z(r8)), r5, r9);
        r7.A01 = false;
        r7.A03.postDelayed(r7.A05, r7.A02);
        r2 = (java.util.HashMap) r8.A01(2131428185);
        r0 = (X.CXG) r2.get(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:894:0x12d2, code lost:
        if (r0 == null) goto L_0x12ee;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:895:0x12d4, code lost:
        r0.A00();
        r1 = X.AnonymousClass000.A10();
        r1.append("Timer with id ");
        r1.append(r3);
        X.C25913CoX.A01("BloksTimer", X.AnonymousClass000.A0y(" already exists. Overwriting previous timer.", r1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:896:0x12ee, code lost:
        r2.put(r3, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:898:0x12f7, code lost:
        throw X.C17880vN.A0g();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:900:0x12fe, code lost:
        if (r5.equals("bk.action.collection.GetVisibleCollectionItemAt") == false) goto L_0x39f6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:901:0x1300, code lost:
        r5 = A0H(r0, r2);
        X.C18070vi.A0X(r5);
        r5 = (X.DFL) r5;
        r3 = r0.A00;
        r4 = X.C17880vN.A0w(r3, 1);
        r6 = X.C17880vN.A0w(r3, 2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:902:0x1314, code lost:
        if (r6 != null) goto L_0x1318;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:903:0x1316, code lost:
        r6 = "start";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:904:0x1318, code lost:
        r0 = r2.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:905:0x131a, code lost:
        if (r0 == null) goto L_0x14b7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:906:0x131c, code lost:
        r3 = X.C17880vN.A13();
        r7 = (X.C25743ClD) X.C26272CwJ.A04(r0, r5);
        r3 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:907:0x1326, code lost:
        if (r7 == null) goto L_0x3a10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:908:0x1328, code lost:
        r3 = X.C17880vN.A11();
        r1 = r7.A02.A07;
        r3 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:909:0x1330, code lost:
        if (r1 == null) goto L_0x3a10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:910:0x1332, code lost:
        r5 = r1.getLayoutManager();
        r3 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:911:0x1336, code lost:
        if (r5 == null) goto L_0x3a10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:912:0x1338, code lost:
        r9 = r5 instanceof androidx.recyclerview.widget.LinearLayoutManager;
        r14 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:913:0x133b, code lost:
        if (r9 == false) goto L_0x1343;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:914:0x133d, code lost:
        r0 = ((androidx.recyclerview.widget.LinearLayoutManager) r5).A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:916:0x1345, code lost:
        if ((r5 instanceof androidx.recyclerview.widget.StaggeredGridLayoutManager) == false) goto L_0x134e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:917:0x1347, code lost:
        r0 = ((androidx.recyclerview.widget.StaggeredGridLayoutManager) r5).A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:918:0x134c, code lost:
        if (r0 != 0) goto L_0x134f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:919:0x134e, code lost:
        r14 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:921:0x1354, code lost:
        r13 = X.AnonymousClass000.A1P(r5.A07.getLayoutDirection());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:922:0x1359, code lost:
        if (r4 == null) goto L_0x1398;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:923:0x135b, code lost:
        if (r14 == false) goto L_0x1362;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:925:?, code lost:
        r2 = r1.getWidth();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:926:0x1362, code lost:
        r2 = r1.getHeight();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:928:0x136a, code lost:
        if (X.BE6.A1V(r4) == false) goto L_0x1388;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:930:0x136f, code lost:
        r1 = X.BE7.A01((float) r2, X.A90.A00(r4));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:933:?, code lost:
        r2 = (float) r2;
        r1 = java.lang.Math.min(r2, java.lang.Math.max(0.0f, r1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:934:0x1385, code lost:
        if (r6.equals("end") == false) goto L_0x138f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:936:0x1388, code lost:
        r1 = X.A90.A01(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:937:0x138d, code lost:
        r1 = r2 - r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:938:0x138f, code lost:
        r8 = (int) r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:942:?, code lost:
        X.C25913CoX.A01("CollectionBinderUtils", "Error parsing offset");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:943:0x1398, code lost:
        r8 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:944:0x1399, code lost:
        r1 = r5 instanceof androidx.recyclerview.widget.GridLayoutManager;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:945:0x139b, code lost:
        if (r1 != false) goto L_0x13a7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:947:0x139f, code lost:
        r4 = ((androidx.recyclerview.widget.LinearLayoutManager) r5).A1O();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:948:0x13a7, code lost:
        r4 = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:949:0x13a8, code lost:
        if (r1 != false) goto L_0x13b4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:951:0x13ac, code lost:
        r2 = ((androidx.recyclerview.widget.LinearLayoutManager) r5).A1Q();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:952:0x13b4, code lost:
        r2 = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:953:0x13b5, code lost:
        r3 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:954:0x13b6, code lost:
        if (r4 == -1) goto L_0x3a10;
        r3 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:955:0x13b8, code lost:
        if (r2 != -1) goto L_0x13ba;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:956:0x13ba, code lost:
        r12 = r6.equals("end");
        r6 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:957:0x13c1, code lost:
        if (r12 != false) goto L_0x13c3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:958:0x13c3, code lost:
        r6 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:959:0x13c4, code lost:
        r10 = r5.A0j(r6);
        r9 = X.C25743ClD.A09;
        r15 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:960:0x13cb, code lost:
        if (r10 != null) goto L_0x13cd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:964:0x13d7, code lost:
        if ((r10.getLayoutParams() instanceof android.view.ViewGroup.MarginLayoutParams) != false) goto L_0x13d9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:965:0x13d9, code lost:
        r9 = X.AnonymousClass3MW.A0B(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:966:0x13de, code lost:
        r9 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:967:0x13df, code lost:
        r11 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:968:0x13e0, code lost:
        if (r14 != false) goto L_0x13e2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:969:0x13e2, code lost:
        if (r13 != false) goto L_0x13e4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:971:0x13ed, code lost:
        if ((r10.getLeft() - r9.getMarginStart()) <= r8) goto L_0x13ef;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:972:0x13ef, code lost:
        r1 = r10.getRight();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:974:0x13fd, code lost:
        if ((r10.getRight() - r9.getMarginStart()) <= r8) goto L_0x13ff;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:975:0x13ff, code lost:
        r1 = r10.getLeft();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:976:0x1403, code lost:
        r0 = r9.getMarginEnd();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:978:0x140f, code lost:
        if ((r10.getTop() - r9.topMargin) <= r8) goto L_0x1411;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:979:0x1411, code lost:
        r1 = r10.getBottom();
        r0 = r9.bottomMargin;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:980:0x1418, code lost:
        r11 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:982:0x141b, code lost:
        if ((r1 + r0) < r8) goto L_0x1418;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:983:0x141d, code lost:
        if (r11 == false) goto L_0x141f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:984:0x141f, code lost:
        if (r12 != false) goto L_0x1421;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:985:0x1421, code lost:
        r6 = r6 - 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:986:0x1424, code lost:
        r6 = r6 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:987:0x1426, code lost:
        r10 = r5.A0j(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:988:0x142b, code lost:
        if (r10 != null) goto L_0x142d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:989:0x142d, code lost:
        r5 = (r10.getWidth() + r9.getMarginStart()) + r9.getMarginEnd();
        r4 = X.BE9.A09(r10, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:990:0x143f, code lost:
        if (r14 != false) goto L_0x1441;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:991:0x1441, code lost:
        if (r13 != false) goto L_0x1443;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:992:0x1443, code lost:
        r2 = r10.getLeft();
        r1 = r10.getRight();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:993:0x144c, code lost:
        r2 = r10.getRight();
        r1 = r10.getLeft();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:994:0x1454, code lost:
        if (r12 != false) goto L_0x1456;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:995:0x1456, code lost:
        r8 = r8 - (r2 + r9.leftMargin);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:996:0x145b, code lost:
        r8 = (r1 + r9.getMarginEnd()) - r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:997:0x1463, code lost:
        if (r12 != false) goto L_0x1465;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:998:0x1465, code lost:
        r8 = r8 - (r10.getTop() + r9.topMargin);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:999:0x146e, code lost:
        r8 = (r10.getBottom() + r9.bottomMargin) - r8;
     */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Missing exception handler attribute for start block: B:628:0x0c01 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:2539:0x3a12  */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:1625:0x2561=Splitter:B:1625:0x2561, B:309:0x059f=Splitter:B:309:0x059f} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ java.lang.Object BKe(X.C199029zJ r34, X.C25681CkC r35, java.lang.String r36) {
        /*
            r33 = this;
            r2 = r35
            X.Boh r2 = (X.C23736Boh) r2
            java.lang.String r4 = "bk.action.trace.BeginSection"
            r5 = r36
            boolean r6 = r5.equals(r4)
            if (r6 != 0) goto L_0x0018
            java.lang.String r0 = "bk.action.trace.EndSection"
            boolean r0 = r5.equals(r0)
            r16 = 0
            if (r0 == 0) goto L_0x001a
        L_0x0018:
            r16 = 1
        L_0x001a:
            if (r16 != 0) goto L_0x001f
            X.AnonymousClass0O7.A01(r5)     // Catch:{ all -> 0x3a16 }
        L_0x001f:
            java.lang.Object[] r1 = A0S()     // Catch:{ all -> 0x3a16 }
            if (r1 == 0) goto L_0x002a
            r0 = 0
            r3 = r1[r0]     // Catch:{ all -> 0x3a16 }
            goto L_0x3a10
        L_0x002a:
            int r3 = r5.hashCode()     // Catch:{ all -> 0x3a16 }
            switch(r3) {
                case -2117986441: goto L_0x02bd;
                case -2056543270: goto L_0x02ba;
                case -2026866692: goto L_0x02b7;
                case -2022606713: goto L_0x02b4;
                case -2010677929: goto L_0x02b1;
                case -1992425284: goto L_0x02ae;
                case -1946563488: goto L_0x02ab;
                case -1861584650: goto L_0x02a8;
                case -1841247856: goto L_0x02a5;
                case -1805214761: goto L_0x02a2;
                case -1802986003: goto L_0x029f;
                case -1789084421: goto L_0x029c;
                case -1781978860: goto L_0x0299;
                case -1777951752: goto L_0x0296;
                case -1754815326: goto L_0x0293;
                case -1735832563: goto L_0x0290;
                case -1695660097: goto L_0x028d;
                case -1676484103: goto L_0x028a;
                case -1661285048: goto L_0x0287;
                case -1661285047: goto L_0x0284;
                case -1659672016: goto L_0x0281;
                case -1646637091: goto L_0x027e;
                case -1626463895: goto L_0x027b;
                case -1623031430: goto L_0x0278;
                case -1611102039: goto L_0x0275;
                case -1588639886: goto L_0x0272;
                case -1518247991: goto L_0x026f;
                case -1483567756: goto L_0x026c;
                case -1458151270: goto L_0x0269;
                case -1443238847: goto L_0x0266;
                case -1438001835: goto L_0x0263;
                case -1392615196: goto L_0x0260;
                case -1391375021: goto L_0x025d;
                case -1384591763: goto L_0x025a;
                case -1370121672: goto L_0x0257;
                case -1334580548: goto L_0x0254;
                case -1327258861: goto L_0x0251;
                case -1298116857: goto L_0x024e;
                case -1276704697: goto L_0x024b;
                case -1228789912: goto L_0x0248;
                case -1162458791: goto L_0x0245;
                case -1137953049: goto L_0x0242;
                case -1113972044: goto L_0x023f;
                case -1014172836: goto L_0x023b;
                case -985271337: goto L_0x0237;
                case -980451716: goto L_0x0233;
                case -965026292: goto L_0x022f;
                case -954842977: goto L_0x022b;
                case -925654548: goto L_0x0227;
                case -919818711: goto L_0x0223;
                case -914746283: goto L_0x021f;
                case -903105410: goto L_0x021b;
                case -882687321: goto L_0x0217;
                case -876004762: goto L_0x0213;
                case -860553091: goto L_0x020f;
                case -825948964: goto L_0x020b;
                case -810619240: goto L_0x0207;
                case -791813135: goto L_0x0203;
                case -791813134: goto L_0x01ff;
                case -776958417: goto L_0x01fb;
                case -736419327: goto L_0x01f7;
                case -729463970: goto L_0x01f3;
                case -717377024: goto L_0x01ef;
                case -689451380: goto L_0x01eb;
                case -686296522: goto L_0x01e7;
                case -665884313: goto L_0x01e3;
                case -640941045: goto L_0x01df;
                case -587000068: goto L_0x01db;
                case -573790654: goto L_0x01d7;
                case -545332995: goto L_0x01d3;
                case -528351887: goto L_0x01cf;
                case -387628292: goto L_0x01cb;
                case -362131820: goto L_0x01c7;
                case -311533821: goto L_0x01c3;
                case -275596506: goto L_0x01bf;
                case -232028360: goto L_0x01bb;
                case -214348689: goto L_0x01b7;
                case -192998245: goto L_0x01b3;
                case -169377409: goto L_0x01af;
                case -166805122: goto L_0x01ab;
                case -79583337: goto L_0x01a7;
                case -71914581: goto L_0x01a3;
                case -67237747: goto L_0x019f;
                case -27526514: goto L_0x019b;
                case -24816282: goto L_0x0197;
                case 3392903: goto L_0x0193;
                case 23735743: goto L_0x018f;
                case 31908788: goto L_0x018b;
                case 94084688: goto L_0x0187;
                case 107264602: goto L_0x0183;
                case 117073323: goto L_0x017f;
                case 141784070: goto L_0x017b;
                case 144735095: goto L_0x0177;
                case 159720655: goto L_0x0173;
                case 163454477: goto L_0x016f;
                case 177085473: goto L_0x016b;
                case 201706399: goto L_0x0167;
                case 211494449: goto L_0x0163;
                case 226394026: goto L_0x015f;
                case 226436345: goto L_0x015b;
                case 227534897: goto L_0x0157;
                case 250746789: goto L_0x0153;
                case 258140093: goto L_0x014f;
                case 290488333: goto L_0x014b;
                case 321881678: goto L_0x0147;
                case 330028918: goto L_0x0143;
                case 351706759: goto L_0x013f;
                case 358283377: goto L_0x013b;
                case 445300143: goto L_0x0137;
                case 445536294: goto L_0x0133;
                case 459398657: goto L_0x012f;
                case 480128519: goto L_0x012b;
                case 487489668: goto L_0x0127;
                case 502083769: goto L_0x0123;
                case 511230409: goto L_0x011f;
                case 512914731: goto L_0x011b;
                case 561587779: goto L_0x0117;
                case 610867619: goto L_0x0113;
                case 617100356: goto L_0x010f;
                case 697497290: goto L_0x010b;
                case 706379162: goto L_0x0107;
                case 748692594: goto L_0x0103;
                case 787893679: goto L_0x00ff;
                case 827053335: goto L_0x00fb;
                case 859362582: goto L_0x00f7;
                case 871707806: goto L_0x00f3;
                case 875025162: goto L_0x00ef;
                case 880735442: goto L_0x00eb;
                case 896165716: goto L_0x00e7;
                case 907240538: goto L_0x00e3;
                case 922966311: goto L_0x00df;
                case 944376542: goto L_0x00db;
                case 978494805: goto L_0x00d7;
                case 1006238115: goto L_0x00d3;
                case 1067520376: goto L_0x02bf;
                case 1073247701: goto L_0x00cf;
                case 1092233714: goto L_0x00cb;
                case 1096446054: goto L_0x00c7;
                case 1156533274: goto L_0x00c3;
                case 1208990953: goto L_0x00bf;
                case 1225820697: goto L_0x00bb;
                case 1265167879: goto L_0x00b7;
                case 1279004111: goto L_0x00b3;
                case 1287216889: goto L_0x00af;
                case 1314033285: goto L_0x00ab;
                case 1335151616: goto L_0x00a7;
                case 1335478715: goto L_0x00a3;
                case 1338730161: goto L_0x009f;
                case 1432836261: goto L_0x009b;
                case 1484610764: goto L_0x0097;
                case 1500489556: goto L_0x0093;
                case 1522534035: goto L_0x008f;
                case 1572781663: goto L_0x008b;
                case 1588846766: goto L_0x0087;
                case 1609278959: goto L_0x0083;
                case 1750927385: goto L_0x007f;
                case 1771618954: goto L_0x007b;
                case 1787890418: goto L_0x0077;
                case 1787916319: goto L_0x0073;
                case 1834855622: goto L_0x006f;
                case 1841033634: goto L_0x006b;
                case 1851570220: goto L_0x0067;
                case 1866622129: goto L_0x0063;
                case 1890077967: goto L_0x005f;
                case 1907888977: goto L_0x005b;
                case 1915396256: goto L_0x0057;
                case 1947372055: goto L_0x0053;
                case 1995238836: goto L_0x004f;
                case 2009638089: goto L_0x004b;
                case 2048462760: goto L_0x0047;
                case 2049614022: goto L_0x0043;
                case 2077597237: goto L_0x003f;
                case 2090086965: goto L_0x003b;
                case 2098589378: goto L_0x0037;
                case 2100418198: goto L_0x0033;
                default: goto L_0x0031;
            }     // Catch:{ all -> 0x3a16 }
        L_0x0031:
            goto L_0x02c6
        L_0x0033:
            java.lang.String r4 = "bk.action.animated.GetCurrentValue"
            goto L_0x02bf
        L_0x0037:
            java.lang.String r4 = "bk.action.animation.linear.GetCurrentValue"
            goto L_0x02bf
        L_0x003b:
            java.lang.String r4 = "bk.action.animated.AddOnCompleteListener"
            goto L_0x02bf
        L_0x003f:
            java.lang.String r4 = "bk.action.video.GetPositionV2"
            goto L_0x02bf
        L_0x0043:
            java.lang.String r4 = "bk.action.visibility_context.PercentVisible"
            goto L_0x02bf
        L_0x0047:
            java.lang.String r4 = "bk.action.accessibility.IsReduceMotionEnabled"
            goto L_0x02bf
        L_0x004b:
            java.lang.String r4 = "bk.action.bloks.ReplaceEmbeddedChildren"
            goto L_0x02bf
        L_0x004f:
            java.lang.String r4 = "bk.action.array.SortedArray"
            goto L_0x02bf
        L_0x0053:
            java.lang.String r4 = "bk.action.bloks.ClearCachedAsyncComponents"
            goto L_0x02bf
        L_0x0057:
            java.lang.String r4 = "bk.action.accessibility.IsHighContrastEnabled"
            goto L_0x02bf
        L_0x005b:
            java.lang.String r4 = "bk.action.slider.SetPosition"
            goto L_0x02bf
        L_0x005f:
            java.lang.String r4 = "bk.action.animated.StartToken"
            goto L_0x02bf
        L_0x0063:
            java.lang.String r4 = "bk.action.array.FindIndex"
            goto L_0x02bf
        L_0x0067:
            java.lang.String r4 = "bk.action.toast.ShowToastV2"
            goto L_0x02bf
        L_0x006b:
            java.lang.String r4 = "bk.action.core.GetTemplateArg"
            goto L_0x02bf
        L_0x006f:
            java.lang.String r4 = "bk.action.bloks.InsertEmbeddedChildrenAfter"
            goto L_0x02bf
        L_0x0073:
            java.lang.String r4 = "bk.action.bloks.ReplaceChildren"
            goto L_0x02bf
        L_0x0077:
            java.lang.String r4 = "data.Get"
            goto L_0x02bf
        L_0x007b:
            java.lang.String r4 = "bk.action.ttrc.SurfaceLeft"
            goto L_0x02bf
        L_0x007f:
            java.lang.String r4 = "bk.action.animated.Sequence"
            goto L_0x02bf
        L_0x0083:
            java.lang.String r4 = "bk.action.bloks.GetValue"
            goto L_0x02bf
        L_0x0087:
            java.lang.String r4 = "bk.action.bloks.ReplaceEmbeddedChildV2"
            goto L_0x02bf
        L_0x008b:
            java.lang.String r4 = "bk.action.animated.Parallel"
            goto L_0x02bf
        L_0x008f:
            java.lang.String r4 = "bk.action.bloks.ReplaceEmbeddedChildrenAfter"
            goto L_0x02bf
        L_0x0093:
            java.lang.String r4 = "bk.action.component.GetWidth"
            goto L_0x02bf
        L_0x0097:
            java.lang.String r4 = "bk.action.bloks.FetchAsyncComponents"
            goto L_0x02bf
        L_0x009b:
            java.lang.String r4 = "bk.action.ttrc.InteractionFailed"
            goto L_0x02bf
        L_0x009f:
            java.lang.String r4 = "bk.action.textinput.GetSensitiveText"
            goto L_0x02bf
        L_0x00a3:
            java.lang.String r4 = "bk.action.tooltip.Show"
            goto L_0x02bf
        L_0x00a7:
            java.lang.String r4 = "bk.action.tooltip.Hide"
            goto L_0x02bf
        L_0x00ab:
            java.lang.String r4 = "bk.action.animated.Resume"
            goto L_0x02bf
        L_0x00af:
            java.lang.String r4 = "bk.action.bloks.PrependChildren"
            goto L_0x02bf
        L_0x00b3:
            java.lang.String r4 = "bk.action.template.Make"
            goto L_0x02bf
        L_0x00b7:
            java.lang.String r4 = "bk.action.GetClientTimezone"
            goto L_0x02bf
        L_0x00bb:
            java.lang.String r4 = "bk.action.textspan.GetHeight"
            goto L_0x02bf
        L_0x00bf:
            java.lang.String r4 = "bk.action.animated.StartWithToken"
            goto L_0x02bf
        L_0x00c3:
            java.lang.String r4 = "bk.action.i18n.LanguagePackResolveFbt"
            goto L_0x02bf
        L_0x00c7:
            java.lang.String r4 = "bk.action.text.IsTruncated"
            goto L_0x02bf
        L_0x00cb:
            java.lang.String r4 = "bk.action.animated.IsInitialized"
            goto L_0x02bf
        L_0x00cf:
            java.lang.String r4 = "bk.action.bloks.InsertEmbeddedChildrenBefore"
            goto L_0x02bf
        L_0x00d3:
            java.lang.String r4 = "bk.action.video.GetPlaybackStateV3"
            goto L_0x02bf
        L_0x00d7:
            java.lang.String r4 = "bk.action.text.GetText"
            goto L_0x02bf
        L_0x00db:
            java.lang.String r4 = "bk.action.media.LoadMediaV3"
            goto L_0x02bf
        L_0x00df:
            java.lang.String r4 = "bk.action.bloks.GetParameter"
            goto L_0x02bf
        L_0x00e3:
            java.lang.String r4 = "bk.action.accessibility.Announcement"
            goto L_0x02bf
        L_0x00e7:
            java.lang.String r4 = "bk.action.animated.Create"
            goto L_0x02bf
        L_0x00eb:
            java.lang.String r4 = "bk.action.animated.Cancel"
            goto L_0x02bf
        L_0x00ef:
            java.lang.String r4 = "bk.action.animated.Start"
            goto L_0x02bf
        L_0x00f3:
            java.lang.String r4 = "bk.action.animated.Pause"
            goto L_0x02bf
        L_0x00f7:
            java.lang.String r4 = "bk.action.animated.Build"
            goto L_0x02bf
        L_0x00fb:
            java.lang.String r4 = "bk.action.bloks.AppendEmbeddedChildren"
            goto L_0x02bf
        L_0x00ff:
            java.lang.String r4 = "bk.action.text_input.KeyboardEventBackspace"
            goto L_0x02bf
        L_0x0103:
            java.lang.String r4 = "bk.action.animated.CreateDimension"
            goto L_0x02bf
        L_0x0107:
            java.lang.String r4 = "bk.action.animated.GetTotalDuration"
            goto L_0x02bf
        L_0x010b:
            java.lang.String r4 = "bk.action.text_input.AppendText"
            goto L_0x02bf
        L_0x010f:
            java.lang.String r4 = "bk.action.bloks.RemoveChild"
            goto L_0x02bf
        L_0x0113:
            java.lang.String r4 = "bk.action.bloks.PrependEmbeddedChildren"
            goto L_0x02bf
        L_0x0117:
            java.lang.String r4 = "bk.action.ttrc.AddStep"
            goto L_0x02bf
        L_0x011b:
            java.lang.String r4 = "bk.action.GetDatetimeText"
            goto L_0x02bf
        L_0x011f:
            java.lang.String r4 = "bk.action.animated.GetCurrentColorValue"
            goto L_0x02bf
        L_0x0123:
            java.lang.String r4 = "bk.action.screen.Open"
            goto L_0x02bf
        L_0x0127:
            java.lang.String r4 = "bk.action.context.Get"
            goto L_0x02bf
        L_0x012b:
            java.lang.String r4 = "bk.action.bloks.TimestampOfLastTouchUpV2"
            goto L_0x02bf
        L_0x012f:
            java.lang.String r4 = "bk.action.bloks.InvalidateCachedAsyncComponents"
            goto L_0x02bf
        L_0x0133:
            java.lang.String r4 = "bk.action.animated.GetCurrentDimensionValue"
            goto L_0x02bf
        L_0x0137:
            java.lang.String r4 = "bk.action.component.SetAttr"
            goto L_0x02bf
        L_0x013b:
            java.lang.String r4 = "bk.action.bloks.WriteLocalState"
            goto L_0x02bf
        L_0x013f:
            java.lang.String r4 = "bk.action.textinput.SetTextV2"
            goto L_0x02bf
        L_0x0143:
            java.lang.String r4 = "bk.action.callback.MakeWithScopeOnly"
            goto L_0x02bf
        L_0x0147:
            java.lang.String r4 = "bk.action.hcollection.GetOffset"
            goto L_0x02bf
        L_0x014b:
            java.lang.String r4 = "bk.action.collection.SetIndex"
            goto L_0x02bf
        L_0x014f:
            java.lang.String r4 = "bk.action.bloks.RequestFocus"
            goto L_0x02bf
        L_0x0153:
            java.lang.String r4 = "bk.action.string.FromProvider"
            goto L_0x02bf
        L_0x0157:
            java.lang.String r4 = "bk.action.ttrc.AddQuery"
            goto L_0x02bf
        L_0x015b:
            java.lang.String r4 = "bk.action.ttrc.AddPoint"
            goto L_0x02bf
        L_0x015f:
            java.lang.String r4 = "bk.action.array.Slice"
            goto L_0x02bf
        L_0x0163:
            java.lang.String r4 = "bk.action.bloks.RemoveChildrenBetween"
            goto L_0x02bf
        L_0x0167:
            java.lang.String r4 = "bk.action.textinput.GetText"
            goto L_0x02bf
        L_0x016b:
            java.lang.String r4 = "bk.action.animated.CancelWithToken"
            goto L_0x02bf
        L_0x016f:
            java.lang.String r4 = "bk.action.video.GetIsMutedV2"
            goto L_0x02bf
        L_0x0173:
            java.lang.String r4 = "bk.action.DispatchAsync"
            goto L_0x02bf
        L_0x0177:
            java.lang.String r4 = "bk.action.bloks.WriteGlobalConsistencyStore"
            goto L_0x02bf
        L_0x017b:
            java.lang.String r4 = "bk.action.trace.EndSection"
            goto L_0x02bf
        L_0x017f:
            java.lang.String r4 = "bk.action.bloks.InsertChildrenBefore"
            goto L_0x02bf
        L_0x0183:
            java.lang.String r4 = "bk.action.hcollection.SetOffset"
            goto L_0x02bf
        L_0x0187:
            java.lang.String r4 = "bk.action.animated.SetCurrentPlayTime"
            goto L_0x02bf
        L_0x018b:
            java.lang.String r4 = "bk.action.ttrc.CachedContentDisplayed"
            goto L_0x02bf
        L_0x018f:
            java.lang.String r4 = "bk.action.animated.CreateSharedElementV2"
            goto L_0x02bf
        L_0x0193:
            java.lang.String r4 = "null"
            goto L_0x02bf
        L_0x0197:
            java.lang.String r4 = "bk.action.ttrc.AddAnnotation"
            goto L_0x02bf
        L_0x019b:
            java.lang.String r4 = "bk.action.bloks.InflateSync"
            goto L_0x02bf
        L_0x019f:
            java.lang.String r4 = "bk.action.device.GetDeviceOSVersion"
            goto L_0x02bf
        L_0x01a3:
            java.lang.String r4 = "bk.action.tree.Make"
            goto L_0x02bf
        L_0x01a7:
            java.lang.String r4 = "bk.action.toast.DismissToast"
            goto L_0x02bf
        L_0x01ab:
            java.lang.String r4 = "bk.action.timer.Stop"
            goto L_0x02bf
        L_0x01af:
            java.lang.String r4 = "bk.action.collection.SetIndexById"
            goto L_0x02bf
        L_0x01b3:
            java.lang.String r4 = "bk.action.visibility_context.HasSeenBefore"
            goto L_0x02bf
        L_0x01b7:
            java.lang.String r4 = "bk.action.animated.CreateColor"
            goto L_0x02bf
        L_0x01bb:
            java.lang.String r4 = "bk.action.callback.Apply"
            goto L_0x02bf
        L_0x01bf:
            java.lang.String r4 = "bk.action.animation.linear.Cancel"
            goto L_0x02bf
        L_0x01c3:
            java.lang.String r4 = "bk.action.dispatch.GetMainQueue"
            goto L_0x02bf
        L_0x01c7:
            java.lang.String r4 = "bk.action.textspan.GetWidth"
            goto L_0x02bf
        L_0x01cb:
            java.lang.String r4 = "bk.action.animated.Loop"
            goto L_0x02bf
        L_0x01cf:
            java.lang.String r4 = "bk.action.AsyncComponentCacheWrite"
            goto L_0x02bf
        L_0x01d3:
            java.lang.String r4 = "bk.action.bloks.ReplaceChildrenAfter"
            goto L_0x02bf
        L_0x01d7:
            java.lang.String r4 = "bk.action.animated.easing.CreateCubicBezier"
            goto L_0x02bf
        L_0x01db:
            java.lang.String r4 = "bk.action.bloks.ReplaceChild"
            goto L_0x02bf
        L_0x01df:
            java.lang.String r4 = "bk.action.bloks.ParseHoistedPayload"
            goto L_0x02bf
        L_0x01e3:
            java.lang.String r4 = "bk.action.debug.internal.DeviceLogV2"
            goto L_0x02bf
        L_0x01e7:
            java.lang.String r4 = "bk.action.animation.linear.Start"
            goto L_0x02bf
        L_0x01eb:
            java.lang.String r4 = "bk.action.bloks.GetPayload"
            goto L_0x02bf
        L_0x01ef:
            java.lang.String r4 = "bk.action.animation.linear.SetNewEndValue"
            goto L_0x02bf
        L_0x01f3:
            java.lang.String r4 = "bk.action.component.GetWidth2"
            goto L_0x02bf
        L_0x01f7:
            java.lang.String r4 = "bk.action.payload.Make"
            goto L_0x02bf
        L_0x01fb:
            java.lang.String r4 = "bk.action.ttrc.CompleteStep"
            goto L_0x02bf
        L_0x01ff:
            java.lang.String r4 = "bk.action.textspan.GetCenterY"
            goto L_0x02bf
        L_0x0203:
            java.lang.String r4 = "bk.action.textspan.GetCenterX"
            goto L_0x02bf
        L_0x0207:
            java.lang.String r4 = "bk.action.accessibility.GetFontScale"
            goto L_0x02bf
        L_0x020b:
            java.lang.String r4 = "bk.action.animated.GetCurrentPlayTime"
            goto L_0x02bf
        L_0x020f:
            java.lang.String r4 = "bk.action.collection.GetVisibleCollectionItemAt"
            goto L_0x02bf
        L_0x0213:
            java.lang.String r4 = "bk.action.timer.Start"
            goto L_0x02bf
        L_0x0217:
            java.lang.String r4 = "bk.action.core.Delay"
            goto L_0x02bf
        L_0x021b:
            java.lang.String r4 = "bk.action.ttrc.MarkerStart"
            goto L_0x02bf
        L_0x021f:
            java.lang.String r4 = "bk.action.animated.Stagger"
            goto L_0x02bf
        L_0x0223:
            java.lang.String r4 = "bk.action.accessibility.SetFocus"
            goto L_0x02bf
        L_0x0227:
            java.lang.String r4 = "bk.action.ttrc.NetworkContentDisplayed"
            goto L_0x02bf
        L_0x022b:
            java.lang.String r4 = "bk.action.collection.ScrollToIndexById"
            goto L_0x02bf
        L_0x022f:
            java.lang.String r4 = "bk.action.string.Trim"
            goto L_0x02bf
        L_0x0233:
            java.lang.String r4 = "bk.action.bloks.OneTimeBind"
            goto L_0x02bf
        L_0x0237:
            java.lang.String r4 = "bk.action.bloks.ChildAtIndex"
            goto L_0x02bf
        L_0x023b:
            java.lang.String r4 = "bk.action.vcollection.GetOffset"
            goto L_0x02bf
        L_0x023f:
            java.lang.String r4 = "bk.action.bloks.GetVariable2"
            goto L_0x02bf
        L_0x0242:
            java.lang.String r4 = "bk.action.media.LoadAlbums"
            goto L_0x02bf
        L_0x0245:
            java.lang.String r4 = "bk.action.component.GetHeight"
            goto L_0x02bf
        L_0x0248:
            java.lang.String r4 = "bk.action.vcollection.SetOffset"
            goto L_0x02bf
        L_0x024b:
            java.lang.String r4 = "bk.action.animated.CancelToken"
            goto L_0x02bf
        L_0x024e:
            java.lang.String r4 = "bk.action.string.SplitWithString"
            goto L_0x02bf
        L_0x0251:
            java.lang.String r4 = "bk.action.timer.Restart"
            goto L_0x02bf
        L_0x0254:
            java.lang.String r4 = "bk.action.animation.linear.CreateAnimation"
            goto L_0x02bf
        L_0x0257:
            java.lang.String r4 = "bk.action.bloks.ShowKeyboard"
            goto L_0x02bf
        L_0x025a:
            java.lang.String r4 = "bk.action.bloks.AppendChildren"
            goto L_0x02bf
        L_0x025d:
            java.lang.String r4 = "bk.action.bloks.Inflate"
            goto L_0x02bf
        L_0x0260:
            java.lang.String r4 = "bk.action.callback.Make"
            goto L_0x02bf
        L_0x0263:
            java.lang.String r4 = "bk.action.ttrc.AddPointV2"
            goto L_0x02bf
        L_0x0266:
            java.lang.String r4 = "bk.action.video.SetPositionV2"
            goto L_0x02bf
        L_0x0269:
            java.lang.String r4 = "bk.action.bloks.Reduce"
            goto L_0x02bf
        L_0x026c:
            java.lang.String r4 = "bk.action.array.Map"
            goto L_0x02bf
        L_0x026f:
            java.lang.String r4 = "bk.action.bloks.UpdateGlobalConsistencyStore"
            goto L_0x02bf
        L_0x0272:
            java.lang.String r4 = "bk.action.text_input.InsertTextAtCursor"
            goto L_0x02bf
        L_0x0275:
            java.lang.String r4 = "bk.action.bloks.ParseEmbedded"
            goto L_0x02bf
        L_0x0278:
            java.lang.String r4 = "bk.action.bloks.WithScope"
            goto L_0x02bf
        L_0x027b:
            java.lang.String r4 = "bk.action.screen.Close"
            goto L_0x02bf
        L_0x027e:
            java.lang.String r4 = "bk.action.bloks.DismissKeyboard"
            goto L_0x02bf
        L_0x0281:
            java.lang.String r4 = "bk.action.bloks.InsertChildrenAfter"
            goto L_0x02bf
        L_0x0284:
            java.lang.String r4 = "bk.action.video.SendEventV3"
            goto L_0x02bf
        L_0x0287:
            java.lang.String r4 = "bk.action.video.SendEventV2"
            goto L_0x02bf
        L_0x028a:
            java.lang.String r4 = "bk.action.component.GetHeight2"
            goto L_0x02bf
        L_0x028d:
            java.lang.String r4 = "bk.action.bloks.ClearFocus"
            goto L_0x02bf
        L_0x0290:
            java.lang.String r4 = "bk.action.bloks.GetScript"
            goto L_0x02bf
        L_0x0293:
            java.lang.String r4 = "bk.action.animated.Destroy"
            goto L_0x02bf
        L_0x0296:
            java.lang.String r4 = "bk.action.bloks.asynccomponents.GetClientParamV2"
            goto L_0x02bf
        L_0x0299:
            java.lang.String r4 = "bk.action.bloks.FindContainer"
            goto L_0x02bf
        L_0x029c:
            java.lang.String r4 = "bk.action.dispatch.GetLowPriBackgroundQueue"
            goto L_0x02bf
        L_0x029f:
            java.lang.String r4 = "bk.action.bloks.Find"
            goto L_0x02bf
        L_0x02a2:
            java.lang.String r4 = "bk.action.bloks.IsAppInstalled"
            goto L_0x02bf
        L_0x02a5:
            java.lang.String r4 = "bk.action.bloks.GetVariableWithScope"
            goto L_0x02bf
        L_0x02a8:
            java.lang.String r4 = "bk.action.timer.Cancel"
            goto L_0x02bf
        L_0x02ab:
            java.lang.String r4 = "bk.action.array.Filter"
            goto L_0x02bf
        L_0x02ae:
            java.lang.String r4 = "bk.action.bloks.MarkerAnnotateAsyncComponentResponse"
            goto L_0x02bf
        L_0x02b1:
            java.lang.String r4 = "bk.action.text_input.ClearText"
            goto L_0x02bf
        L_0x02b4:
            java.lang.String r4 = "bk.action.bloks.IndexOfChild"
            goto L_0x02bf
        L_0x02b7:
            java.lang.String r4 = "bk.action.array.Concat"
            goto L_0x02bf
        L_0x02ba:
            java.lang.String r4 = "bk.action.visibility_context.GetTimeSinceLastImpressionInMS"
            goto L_0x02bf
        L_0x02bd:
            java.lang.String r4 = "bk.action.io.CurrentTimeMillis"
        L_0x02bf:
            boolean r0 = r5.equals(r4)     // Catch:{ all -> 0x3a16 }
            r1 = 1
            if (r0 != 0) goto L_0x02c7
        L_0x02c6:
            r1 = 0
        L_0x02c7:
            r0 = r34
            if (r1 == 0) goto L_0x3a06
            r1 = 1
            r4 = 0
            switch(r3) {
                case -2117986441: goto L_0x02d2;
                case -2056543270: goto L_0x02ee;
                case -2026866692: goto L_0x0317;
                case -2022606713: goto L_0x0342;
                case -2010677929: goto L_0x03b8;
                case -1992425284: goto L_0x03f2;
                case -1946563488: goto L_0x0493;
                case -1861584650: goto L_0x04d8;
                case -1841247856: goto L_0x0509;
                case -1805214761: goto L_0x053f;
                case -1802986003: goto L_0x05aa;
                case -1789084421: goto L_0x05ad;
                case -1781978860: goto L_0x05bf;
                case -1777951752: goto L_0x0635;
                case -1754815326: goto L_0x06a5;
                case -1735832563: goto L_0x06c6;
                case -1695660097: goto L_0x06e2;
                case -1676484103: goto L_0x06fb;
                case -1661285048: goto L_0x0720;
                case -1661285047: goto L_0x074c;
                case -1659672016: goto L_0x0778;
                case -1646637091: goto L_0x079d;
                case -1626463895: goto L_0x07fe;
                case -1623031430: goto L_0x0ad0;
                case -1611102039: goto L_0x0b35;
                case -1588639886: goto L_0x0b77;
                case -1518247991: goto L_0x0bc0;
                case -1483567756: goto L_0x0c10;
                case -1458151270: goto L_0x0c51;
                case -1443238847: goto L_0x0cac;
                case -1438001835: goto L_0x0ce6;
                case -1392615196: goto L_0x0d22;
                case -1391375021: goto L_0x0d3b;
                case -1384591763: goto L_0x0dbd;
                case -1370121672: goto L_0x0de8;
                case -1334580548: goto L_0x0e17;
                case -1327258861: goto L_0x0e7a;
                case -1298116857: goto L_0x0ec4;
                case -1276704697: goto L_0x0f02;
                case -1228789912: goto L_0x0f06;
                case -1162458791: goto L_0x0f58;
                case -1137953049: goto L_0x0f7d;
                case -1113972044: goto L_0x0fb9;
                case -1014172836: goto L_0x0fd0;
                case -985271337: goto L_0x1008;
                case -980451716: goto L_0x1037;
                case -965026292: goto L_0x1056;
                case -954842977: goto L_0x106b;
                case -925654548: goto L_0x116b;
                case -919818711: goto L_0x1192;
                case -914746283: goto L_0x11b2;
                case -903105410: goto L_0x1207;
                case -882687321: goto L_0x1247;
                case -876004762: goto L_0x1275;
                case -860553091: goto L_0x12f8;
                case -825948964: goto L_0x14be;
                case -810619240: goto L_0x14e9;
                case -791813135: goto L_0x150b;
                case -791813134: goto L_0x1527;
                case -776958417: goto L_0x1543;
                case -736419327: goto L_0x1570;
                case -729463970: goto L_0x1626;
                case -717377024: goto L_0x167f;
                case -689451380: goto L_0x16c8;
                case -686296522: goto L_0x1708;
                case -665884313: goto L_0x1720;
                case -640941045: goto L_0x1777;
                case -587000068: goto L_0x179a;
                case -573790654: goto L_0x17b9;
                case -545332995: goto L_0x17e5;
                case -528351887: goto L_0x180d;
                case -387628292: goto L_0x18d5;
                case -362131820: goto L_0x18f2;
                case -311533821: goto L_0x190e;
                case -275596506: goto L_0x1920;
                case -232028360: goto L_0x1935;
                case -214348689: goto L_0x1978;
                case -192998245: goto L_0x19dd;
                case -169377409: goto L_0x19f8;
                case -166805122: goto L_0x1a56;
                case -79583337: goto L_0x1a8d;
                case -71914581: goto L_0x1abe;
                case -67237747: goto L_0x1b1a;
                case -27526514: goto L_0x1b2a;
                case -24816282: goto L_0x1b69;
                case 3392903: goto L_0x1b99;
                case 23735743: goto L_0x1bad;
                case 31908788: goto L_0x1d25;
                case 94084688: goto L_0x1d7a;
                case 107264602: goto L_0x1da1;
                case 117073323: goto L_0x1df3;
                case 141784070: goto L_0x39ee;
                case 144735095: goto L_0x1e18;
                case 159720655: goto L_0x1e5c;
                case 163454477: goto L_0x2841;
                case 177085473: goto L_0x1ee9;
                case 201706399: goto L_0x1f07;
                case 211494449: goto L_0x1f49;
                case 226394026: goto L_0x1f81;
                case 226436345: goto L_0x1fd1;
                case 227534897: goto L_0x2002;
                case 250746789: goto L_0x2045;
                case 258140093: goto L_0x205a;
                case 290488333: goto L_0x207e;
                case 321881678: goto L_0x20a3;
                case 330028918: goto L_0x20db;
                case 351706759: goto L_0x20f9;
                case 358283377: goto L_0x215a;
                case 445300143: goto L_0x21c2;
                case 445536294: goto L_0x223b;
                case 459398657: goto L_0x2285;
                case 480128519: goto L_0x22b8;
                case 487489668: goto L_0x22ca;
                case 502083769: goto L_0x22d9;
                case 511230409: goto L_0x23a4;
                case 512914731: goto L_0x23d2;
                case 561587779: goto L_0x2409;
                case 610867619: goto L_0x2436;
                case 617100356: goto L_0x2460;
                case 697497290: goto L_0x2488;
                case 706379162: goto L_0x24dd;
                case 748692594: goto L_0x2511;
                case 787893679: goto L_0x2599;
                case 827053335: goto L_0x25d2;
                case 859362582: goto L_0x25fd;
                case 871707806: goto L_0x2618;
                case 875025162: goto L_0x2645;
                case 880735442: goto L_0x267a;
                case 896165716: goto L_0x268e;
                case 907240538: goto L_0x26ef;
                case 922966311: goto L_0x2729;
                case 944376542: goto L_0x2746;
                case 978494805: goto L_0x27a9;
                case 1006238115: goto L_0x27da;
                case 1067520376: goto L_0x02e0;
                case 1073247701: goto L_0x27fd;
                case 1092233714: goto L_0x2826;
                case 1096446054: goto L_0x286e;
                case 1156533274: goto L_0x28a7;
                case 1208990953: goto L_0x307c;
                case 1225820697: goto L_0x30a4;
                case 1265167879: goto L_0x30c0;
                case 1279004111: goto L_0x30d2;
                case 1287216889: goto L_0x3128;
                case 1314033285: goto L_0x314e;
                case 1335151616: goto L_0x3186;
                case 1335478715: goto L_0x31d1;
                case 1338730161: goto L_0x324c;
                case 1432836261: goto L_0x3291;
                case 1484610764: goto L_0x32b4;
                case 1500489556: goto L_0x333b;
                case 1522534035: goto L_0x3360;
                case 1572781663: goto L_0x3389;
                case 1588846766: goto L_0x33f2;
                case 1609278959: goto L_0x3415;
                case 1750927385: goto L_0x3509;
                case 1771618954: goto L_0x3562;
                case 1787890418: goto L_0x3582;
                case 1787916319: goto L_0x35a1;
                case 1834855622: goto L_0x35cb;
                case 1841033634: goto L_0x35f7;
                case 1851570220: goto L_0x364d;
                case 1866622129: goto L_0x3751;
                case 1890077967: goto L_0x379c;
                case 1907888977: goto L_0x37bd;
                case 1915396256: goto L_0x37f1;
                case 1947372055: goto L_0x3813;
                case 1995238836: goto L_0x38a6;
                case 2009638089: goto L_0x38cb;
                case 2048462760: goto L_0x38f9;
                case 2049614022: goto L_0x393b;
                case 2077597237: goto L_0x3956;
                case 2090086965: goto L_0x3985;
                case 2098589378: goto L_0x39a7;
                case 2100418198: goto L_0x39c6;
                default: goto L_0x02d0;
            }     // Catch:{ all -> 0x3a16 }
        L_0x02d0:
            goto L_0x39f6
        L_0x02d2:
            java.lang.String r0 = "bk.action.io.CurrentTimeMillis"
            boolean r0 = r5.equals(r0)     // Catch:{ all -> 0x3a16 }
            if (r0 == 0) goto L_0x39f6
            java.lang.Long r3 = X.C108955ca.A0m()     // Catch:{ all -> 0x3a16 }
            goto L_0x3a10
        L_0x02e0:
            if (r6 == 0) goto L_0x39f6
            X.C18070vi.A0d(r0, r4)     // Catch:{ all -> 0x3a16 }
            java.lang.String r0 = A0M(r0, r4)     // Catch:{ all -> 0x3a16 }
            X.AnonymousClass0O7.A01(r0)     // Catch:{ all -> 0x3a16 }
            goto L_0x3a04
        L_0x02ee:
            java.lang.String r2 = "bk.action.visibility_context.GetTimeSinceLastImpressionInMS"
            boolean r2 = r5.equals(r2)     // Catch:{ all -> 0x3a16 }
            if (r2 == 0) goto L_0x39f6
            X.C18070vi.A0d(r0, r4)     // Catch:{ all -> 0x3a16 }
            java.lang.Object r1 = X.BE6.A0n(r0, r4)     // Catch:{ all -> 0x3a16 }
            java.lang.String r0 = "null cannot be cast to non-null type com.bloks.foa.visibility.ViewpointSnapshotWithData"
            X.C18070vi.A0z(r1, r0)     // Catch:{ all -> 0x3a16 }
            X.6fg r1 = (X.C128246fg) r1     // Catch:{ all -> 0x3a16 }
            long r2 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x3a16 }
            java.lang.Long r0 = r1.A01     // Catch:{ all -> 0x3a16 }
            X.C18070vi.A0X(r0)     // Catch:{ all -> 0x3a16 }
            long r0 = r0.longValue()     // Catch:{ all -> 0x3a16 }
            java.lang.Long r3 = X.C108945cZ.A1B(r2, r0)     // Catch:{ all -> 0x3a16 }
            goto L_0x3a10
        L_0x0317:
            java.lang.String r2 = "bk.action.array.Concat"
            boolean r2 = r5.equals(r2)     // Catch:{ all -> 0x3a16 }
            if (r2 == 0) goto L_0x39f6
            X.C18070vi.A0d(r0, r4)     // Catch:{ all -> 0x3a16 }
            java.util.List r5 = r0.A00     // Catch:{ all -> 0x3a16 }
            java.lang.Object r0 = r5.get(r4)     // Catch:{ all -> 0x3a16 }
            java.lang.String r3 = "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>"
            java.util.List r2 = X.BE6.A13(r0, r3)     // Catch:{ all -> 0x3a16 }
            java.lang.Object r0 = r5.get(r1)     // Catch:{ all -> 0x3a16 }
            java.util.List r0 = X.BE6.A13(r0, r3)     // Catch:{ all -> 0x3a16 }
            java.util.ArrayList r3 = X.AnonymousClass000.A13()     // Catch:{ all -> 0x3a16 }
            r3.addAll(r2)     // Catch:{ all -> 0x3a16 }
            r3.addAll(r0)     // Catch:{ all -> 0x3a16 }
            goto L_0x3a10
        L_0x0342:
            java.lang.String r3 = "bk.action.bloks.IndexOfChild"
            boolean r3 = r5.equals(r3)     // Catch:{ all -> 0x3a16 }
            if (r3 == 0) goto L_0x39f6
            java.lang.Object r5 = A0I(r0, r2)     // Catch:{ all -> 0x3a16 }
            java.lang.String r3 = "null cannot be cast to non-null type com.instagram.common.bloks.component.base.BloksModel"
            X.C18070vi.A0z(r5, r3)     // Catch:{ all -> 0x3a16 }
            X.DFL r5 = (X.DFL) r5     // Catch:{ all -> 0x3a16 }
            java.lang.Object r1 = r0.A00(r1)     // Catch:{ all -> 0x3a16 }
            X.C18070vi.A0X(r1)     // Catch:{ all -> 0x3a16 }
            java.lang.String r3 = X.CCF.A00(r1)     // Catch:{ all -> 0x3a16 }
            r1 = 2
            X.DOZ r1 = A06(r2, r0, r1)     // Catch:{ all -> 0x3a16 }
            java.lang.String r0 = r5.A0C()     // Catch:{ all -> 0x3a16 }
            if (r0 != 0) goto L_0x0373
            java.lang.String r1 = "index_of_child_without_id"
            java.lang.String r0 = "bk.action.bloks.IndexOfChild called on a container without an ID"
            X.C25913CoX.A01(r1, r0)     // Catch:{ all -> 0x3a16 }
            goto L_0x03b6
        L_0x0373:
            X.DNk r4 = X.C26272CwJ.A01(r1)     // Catch:{ all -> 0x3a16 }
            java.lang.String r0 = r5.A0C()     // Catch:{ all -> 0x3a16 }
            if (r0 == 0) goto L_0x03b6
            java.lang.String r0 = r5.A0C()     // Catch:{ all -> 0x3a16 }
            X.DNn r2 = new X.DNn     // Catch:{ all -> 0x3a16 }
            r2.<init>(r0)     // Catch:{ all -> 0x3a16 }
            boolean r0 = r4.A0N     // Catch:{ all -> 0x3a16 }
            if (r0 == 0) goto L_0x0391
            java.lang.String r1 = "BloksTreeManager"
            java.lang.String r0 = "Trying to access a tree on a destroyed BloksTreeManager"
            X.C25913CoX.A01(r1, r0)     // Catch:{ all -> 0x3a16 }
        L_0x0391:
            java.lang.String r0 = "Tree operations are only supported from the UI Thread"
            X.C26176Ctu.A02(r0)     // Catch:{ all -> 0x3a16 }
            java.util.List r0 = r4.A0H     // Catch:{ all -> 0x3a16 }
            X.DFL r1 = X.C26962DNk.A02(r4, r0)     // Catch:{ all -> 0x3a16 }
            r0 = 2
            X.DFL r0 = X.DNW.A00(r1, r2, r0)     // Catch:{ all -> 0x3a16 }
            if (r0 == 0) goto L_0x03b6
            java.util.List r1 = r0.A0E()     // Catch:{ all -> 0x3a16 }
            X.DNn r0 = new X.DNn     // Catch:{ all -> 0x3a16 }
            r0.<init>(r3)     // Catch:{ all -> 0x3a16 }
            int r0 = X.C25882Cnt.A00(r0, r1)     // Catch:{ all -> 0x3a16 }
        L_0x03b0:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x3a16 }
            goto L_0x3a10
        L_0x03b6:
            r0 = -1
            goto L_0x03b0
        L_0x03b8:
            java.lang.String r3 = "bk.action.text_input.ClearText"
            boolean r3 = r5.equals(r3)     // Catch:{ all -> 0x3a16 }
            if (r3 == 0) goto L_0x39f6
            java.lang.Object r4 = A0I(r0, r2)     // Catch:{ all -> 0x3a16 }
            java.lang.String r3 = "null cannot be cast to non-null type com.instagram.common.bloks.component.base.BloksModel"
            X.C18070vi.A0z(r4, r3)     // Catch:{ all -> 0x3a16 }
            X.DFL r4 = (X.DFL) r4     // Catch:{ all -> 0x3a16 }
            X.DOZ r0 = A06(r2, r0, r1)     // Catch:{ all -> 0x3a16 }
            java.lang.Object r2 = X.C26272CwJ.A04(r0, r4)     // Catch:{ all -> 0x3a16 }
            X.CTH r2 = (X.CTH) r2     // Catch:{ all -> 0x3a16 }
            if (r2 == 0) goto L_0x3a04
            r1 = 0
            X.C26176Ctu.A02(r1)     // Catch:{ all -> 0x3a16 }
            com.facebook.primitive.textinput.TextInputView r0 = r2.A02     // Catch:{ all -> 0x3a16 }
            if (r0 != 0) goto L_0x03e5
            java.lang.String r0 = ""
            r2.A04 = r0     // Catch:{ all -> 0x3a16 }
            goto L_0x3a04
        L_0x03e5:
            android.text.Editable r0 = r0.getText()     // Catch:{ all -> 0x3a16 }
            if (r0 == 0) goto L_0x03ee
            r0.clear()     // Catch:{ all -> 0x3a16 }
        L_0x03ee:
            r2.A04 = r1     // Catch:{ all -> 0x3a16 }
            goto L_0x3a04
        L_0x03f2:
            java.lang.String r2 = "bk.action.bloks.MarkerAnnotateAsyncComponentResponse"
            boolean r2 = r5.equals(r2)     // Catch:{ all -> 0x3a16 }
            if (r2 == 0) goto L_0x39f6
            X.C18070vi.A0d(r0, r4)     // Catch:{ all -> 0x3a16 }
            int r7 = A02(r0, r4)     // Catch:{ all -> 0x3a16 }
            java.lang.Object r8 = r0.A00(r1)     // Catch:{ all -> 0x3a16 }
            java.lang.String r1 = "null cannot be cast to non-null type kotlin.String"
            X.C18070vi.A0z(r8, r1)     // Catch:{ all -> 0x3a16 }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ all -> 0x3a16 }
            r1 = 2
            java.lang.String r9 = A0L(r0, r1)     // Catch:{ all -> 0x3a16 }
            r1 = 3
            java.lang.Object r6 = X.BE6.A0n(r0, r1)     // Catch:{ all -> 0x3a16 }
            java.util.Map r6 = (java.util.Map) r6     // Catch:{ all -> 0x3a16 }
            r3 = 0
            if (r6 == 0) goto L_0x044f
            java.lang.String r0 = "points"
            java.lang.Object r0 = r6.get(r0)     // Catch:{ all -> 0x3a16 }
        L_0x0421:
            java.util.Map r0 = (java.util.Map) r0     // Catch:{ all -> 0x3a16 }
            if (r0 == 0) goto L_0x0451
            java.util.Iterator r5 = X.AnonymousClass000.A15(r0)     // Catch:{ all -> 0x3a16 }
        L_0x0429:
            boolean r0 = r5.hasNext()     // Catch:{ all -> 0x3a16 }
            if (r0 == 0) goto L_0x0451
            java.util.Map$Entry r4 = X.AnonymousClass000.A16(r5)     // Catch:{ all -> 0x3a16 }
            java.lang.String r2 = X.C17880vN.A0x(r4)     // Catch:{ all -> 0x3a16 }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A11(r9)     // Catch:{ all -> 0x3a16 }
            r0 = 95
            java.lang.String r2 = X.C17890vO.A0Z(r2, r1, r0)     // Catch:{ all -> 0x3a16 }
            X.1CQ r1 = X.AnonymousClass1D7.A0I()     // Catch:{ all -> 0x3a16 }
            java.lang.Object r0 = r4.getValue()     // Catch:{ all -> 0x3a16 }
            java.lang.Long r0 = (java.lang.Long) r0     // Catch:{ all -> 0x3a16 }
            X.A7e.A03(r0, r8, r2, r1, r7)     // Catch:{ all -> 0x3a16 }
            goto L_0x0429
        L_0x044f:
            r0 = r3
            goto L_0x0421
        L_0x0451:
            if (r6 == 0) goto L_0x0454
            goto L_0x0456
        L_0x0454:
            r0 = r3
            goto L_0x045c
        L_0x0456:
            java.lang.String r0 = "annotations"
            java.lang.Object r0 = r6.get(r0)     // Catch:{ all -> 0x3a16 }
        L_0x045c:
            java.util.Map r0 = (java.util.Map) r0     // Catch:{ all -> 0x3a16 }
            if (r0 == 0) goto L_0x3a10
            java.util.LinkedHashMap r6 = X.C108995ce.A0b(r0)     // Catch:{ all -> 0x3a16 }
            java.util.Iterator r5 = X.AnonymousClass000.A15(r0)     // Catch:{ all -> 0x3a16 }
        L_0x0468:
            boolean r0 = r5.hasNext()     // Catch:{ all -> 0x3a16 }
            if (r0 == 0) goto L_0x0488
            java.util.Map$Entry r4 = X.AnonymousClass000.A16(r5)     // Catch:{ all -> 0x3a16 }
            java.lang.String r2 = X.C17880vN.A0x(r4)     // Catch:{ all -> 0x3a16 }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A11(r9)     // Catch:{ all -> 0x3a16 }
            r0 = 95
            java.lang.String r1 = X.C17890vO.A0Z(r2, r1, r0)     // Catch:{ all -> 0x3a16 }
            java.lang.Object r0 = r4.getValue()     // Catch:{ all -> 0x3a16 }
            r6.put(r1, r0)     // Catch:{ all -> 0x3a16 }
            goto L_0x0468
        L_0x0488:
            X.A8s r0 = X.A7e.A00(r8, r7)     // Catch:{ all -> 0x3a16 }
            if (r0 == 0) goto L_0x3a10
            X.A7e.A02(r0, r6)     // Catch:{ all -> 0x3a16 }
            goto L_0x3a10
        L_0x0493:
            java.lang.String r7 = "bk.action.array.Filter"
            boolean r3 = r5.equals(r7)     // Catch:{ all -> 0x3a16 }
            if (r3 == 0) goto L_0x39f6
            java.lang.Object r4 = A0I(r0, r2)     // Catch:{ all -> 0x3a16 }
            java.lang.String r3 = "null cannot be cast to non-null type java.util.List<kotlin.Any>"
            java.util.List r9 = X.BE6.A13(r4, r3)     // Catch:{ all -> 0x3a16 }
            X.E8A r8 = X.C25488Cgj.A00(r0, r1)     // Catch:{ all -> 0x3a16 }
            java.util.ArrayList r3 = X.AnonymousClass000.A13()     // Catch:{ all -> 0x3a16 }
            int r6 = r9.size()     // Catch:{ all -> 0x3a16 }
            r5 = 0
        L_0x04b2:
            if (r5 >= r6) goto L_0x3a10
            java.lang.Object r4 = r9.get(r5)     // Catch:{ all -> 0x3a16 }
            X.9zJ r0 = X.C108985cd.A0K(r4)     // Catch:{ all -> 0x3a16 }
            java.lang.Object r1 = X.C25974Cph.A00(r2, r0, r8)     // Catch:{ all -> 0x3a16 }
            boolean r0 = r1 instanceof java.lang.Number     // Catch:{ all -> 0x3a16 }
            if (r0 != 0) goto L_0x04cc
            boolean r0 = r1 instanceof java.lang.Boolean     // Catch:{ all -> 0x3a16 }
            if (r0 != 0) goto L_0x04cc
            java.lang.String r0 = "Got non-boolean result while evaluating filter predicate"
            goto L_0x366a
        L_0x04cc:
            boolean r0 = X.C25343Ce2.A01(r1)     // Catch:{ all -> 0x3a16 }
            if (r0 == 0) goto L_0x04d5
            r3.add(r4)     // Catch:{ all -> 0x3a16 }
        L_0x04d5:
            int r5 = r5 + 1
            goto L_0x04b2
        L_0x04d8:
            java.lang.String r3 = "bk.action.timer.Cancel"
            boolean r3 = r5.equals(r3)     // Catch:{ all -> 0x3a16 }
            if (r3 == 0) goto L_0x39f6
            X.C18070vi.A0d(r0, r4)     // Catch:{ all -> 0x3a16 }
            X.C18070vi.A0d(r2, r1)     // Catch:{ all -> 0x3a16 }
            java.lang.String r3 = A0M(r0, r1)     // Catch:{ all -> 0x3a16 }
            X.DOZ r1 = r2.A00     // Catch:{ all -> 0x3a16 }
            if (r1 == 0) goto L_0x0504
            r0 = 2131428185(0x7f0b0359, float:1.8478007E38)
            java.lang.Object r0 = r1.A01(r0)     // Catch:{ all -> 0x3a16 }
            java.util.HashMap r0 = (java.util.HashMap) r0     // Catch:{ all -> 0x3a16 }
            java.lang.Object r0 = r0.get(r3)     // Catch:{ all -> 0x3a16 }
            X.CXG r0 = (X.CXG) r0     // Catch:{ all -> 0x3a16 }
            if (r0 == 0) goto L_0x3a04
            r0.A00()     // Catch:{ all -> 0x3a16 }
            goto L_0x3a04
        L_0x0504:
            java.lang.IllegalStateException r0 = X.C17880vN.A0g()     // Catch:{ all -> 0x3a16 }
            throw r0     // Catch:{ all -> 0x3a16 }
        L_0x0509:
            java.lang.String r3 = "bk.action.bloks.GetVariableWithScope"
            boolean r3 = r5.equals(r3)     // Catch:{ all -> 0x3a16 }
            if (r3 == 0) goto L_0x39f6
            X.C18070vi.A0d(r0, r4)     // Catch:{ all -> 0x3a16 }
            X.C18070vi.A0d(r2, r1)     // Catch:{ all -> 0x3a16 }
            java.util.List r0 = r0.A00     // Catch:{ all -> 0x3a16 }
            java.lang.Object r3 = r0.get(r4)     // Catch:{ all -> 0x3a16 }
            X.AnonymousClass8BR.A1I(r3)     // Catch:{ all -> 0x3a16 }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ all -> 0x3a16 }
            java.lang.Object r1 = r0.get(r1)     // Catch:{ all -> 0x3a16 }
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.Number"
            X.C18070vi.A0z(r1, r0)     // Catch:{ all -> 0x3a16 }
            int r1 = X.AnonymousClass000.A0M(r1)     // Catch:{ all -> 0x3a16 }
            if (r1 != 0) goto L_0x0537
            java.lang.Object r3 = X.C25881Cns.A02(r2, r3)     // Catch:{ all -> 0x3a16 }
            goto L_0x3a10
        L_0x0537:
            X.Cpa r0 = X.CFr.A00     // Catch:{ all -> 0x3a16 }
            java.lang.Object r3 = r0.A02(r2, r3, r1)     // Catch:{ all -> 0x3a16 }
            goto L_0x3a10
        L_0x053f:
            java.lang.String r3 = "bk.action.bloks.IsAppInstalled"
            boolean r3 = r5.equals(r3)     // Catch:{ all -> 0x3a16 }
            if (r3 == 0) goto L_0x39f6
            X.DOZ r2 = A07(r2, r0)     // Catch:{ all -> 0x3a16 }
            if (r2 == 0) goto L_0x05a5
            android.content.Context r3 = r2.A00     // Catch:{ all -> 0x3a16 }
            r7 = 1
            java.lang.Object r2 = r0.A00(r1)     // Catch:{ all -> 0x3a16 }
            java.lang.String r1 = "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>"
            java.util.List r6 = X.BE6.A13(r2, r1)     // Catch:{ all -> 0x3a16 }
            java.lang.String r5 = A0M(r0, r4)     // Catch:{ all -> 0x3a16 }
            java.lang.String r1 = "://"
            boolean r0 = X.AnonymousClass1YF.A0Y(r5, r1, r4)     // Catch:{ all -> 0x3a16 }
            if (r0 != 0) goto L_0x056a
            java.lang.String r5 = X.C17900vP.A0A(r5, r1)     // Catch:{ all -> 0x3a16 }
        L_0x056a:
            android.content.pm.PackageManager r3 = r3.getPackageManager()     // Catch:{ all -> 0x3a16 }
            if (r3 == 0) goto L_0x059e
            java.lang.String r2 = "android.intent.action.VIEW"
            android.util.LruCache r0 = X.C26215Cuu.A00     // Catch:{ all -> 0x3a16 }
            android.net.Uri r1 = android.net.Uri.parse(r5)     // Catch:{ all -> 0x3a16 }
            android.content.Intent r0 = new android.content.Intent     // Catch:{ all -> 0x3a16 }
            r0.<init>(r2, r1)     // Catch:{ all -> 0x3a16 }
            android.content.ComponentName r0 = r0.resolveActivity(r3)     // Catch:{ all -> 0x3a16 }
            if (r0 == 0) goto L_0x059e
            boolean r0 = r6.isEmpty()     // Catch:{ all -> 0x3a16 }
            if (r0 != 0) goto L_0x059f
            java.util.Iterator r1 = r6.iterator()     // Catch:{ all -> 0x3a16 }
        L_0x058d:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x3a16 }
            if (r0 == 0) goto L_0x059e
            java.lang.String r0 = X.C17880vN.A0v(r1)     // Catch:{ all -> 0x3a16 }
            android.content.pm.PackageInfo r0 = r3.getPackageInfo(r0, r4)     // Catch:{ NameNotFoundException -> 0x058d }
            if (r0 == 0) goto L_0x058d
            goto L_0x059f
        L_0x059e:
            r7 = 0
        L_0x059f:
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r7)     // Catch:{ all -> 0x3a16 }
            goto L_0x3a10
        L_0x05a5:
            java.lang.IllegalStateException r0 = X.C17880vN.A0g()     // Catch:{ all -> 0x3a16 }
            throw r0     // Catch:{ all -> 0x3a16 }
        L_0x05aa:
            java.lang.String r3 = "bk.action.bloks.Find"
            goto L_0x05c1
        L_0x05ad:
            java.lang.String r0 = "bk.action.dispatch.GetLowPriBackgroundQueue"
            boolean r0 = r5.equals(r0)     // Catch:{ all -> 0x3a16 }
            if (r0 == 0) goto L_0x39f6
            X.0vl r0 = X.AnonymousClass6YR.A00     // Catch:{ all -> 0x3a16 }
            java.lang.Object r3 = r0.getValue()     // Catch:{ all -> 0x3a16 }
            android.os.Handler r3 = (android.os.Handler) r3     // Catch:{ all -> 0x3a16 }
            goto L_0x3a10
        L_0x05bf:
            java.lang.String r3 = "bk.action.bloks.FindContainer"
        L_0x05c1:
            boolean r3 = r5.equals(r3)     // Catch:{ all -> 0x3a16 }
            if (r3 == 0) goto L_0x39f6
            java.lang.String r4 = A0N(r0, r2)     // Catch:{ all -> 0x3a16 }
            X.DOZ r0 = A06(r2, r0, r1)     // Catch:{ all -> 0x3a16 }
            X.DNk r5 = X.C26272CwJ.A01(r0)     // Catch:{ all -> 0x3a16 }
            X.DNn r6 = new X.DNn     // Catch:{ all -> 0x3a16 }
            r6.<init>(r4)     // Catch:{ all -> 0x3a16 }
            boolean r0 = X.C26272CwJ.A08(r0)     // Catch:{ all -> 0x3a16 }
            if (r0 == 0) goto L_0x05f0
            X.DFL r3 = r5.A06     // Catch:{ all -> 0x3a16 }
            if (r3 == 0) goto L_0x05f0
            X.DNo r2 = new X.DNo     // Catch:{ all -> 0x3a16 }
            r2.<init>(r6)     // Catch:{ all -> 0x3a16 }
            r0 = 3
            X.DFL r3 = X.DNW.A00(r3, r2, r0)     // Catch:{ all -> 0x3a16 }
            if (r3 == 0) goto L_0x05f0
            goto L_0x3a10
        L_0x05f0:
            X.CTl r0 = r5.A05     // Catch:{ all -> 0x3a16 }
            if (r0 == 0) goto L_0x05ff
            X.DFL r2 = r0.A01     // Catch:{ all -> 0x3a16 }
            r0 = 0
            X.DFL r3 = X.DNW.A00(r2, r6, r0)     // Catch:{ all -> 0x3a16 }
            if (r3 == 0) goto L_0x05ff
            goto L_0x3a10
        L_0x05ff:
            boolean r0 = r5.A0N     // Catch:{ all -> 0x3a16 }
            if (r0 == 0) goto L_0x060a
            java.lang.String r2 = "BloksTreeManager"
            java.lang.String r0 = "Trying to access a tree on a destroyed BloksTreeManager"
            X.C25913CoX.A01(r2, r0)     // Catch:{ all -> 0x3a16 }
        L_0x060a:
            java.lang.String r0 = "Tree operations are only supported from the UI Thread"
            X.C26176Ctu.A02(r0)     // Catch:{ all -> 0x3a16 }
            java.util.List r0 = r5.A0H     // Catch:{ all -> 0x3a16 }
            X.DFL r2 = X.C26962DNk.A02(r5, r0)     // Catch:{ all -> 0x3a16 }
            r0 = 2
            X.DFL r3 = X.DNW.A00(r2, r6, r0)     // Catch:{ all -> 0x3a16 }
            java.lang.Object[] r2 = X.AnonymousClass000.A1b(r4, r0)     // Catch:{ all -> 0x3a16 }
            X.CTl r0 = r5.A05     // Catch:{ all -> 0x3a16 }
            if (r0 == 0) goto L_0x0633
            X.DFL r0 = r0.A01     // Catch:{ all -> 0x3a16 }
        L_0x0624:
            r2[r1] = r0     // Catch:{ all -> 0x3a16 }
            java.lang.String r0 = "Found node %s in unbound tree but not in bound tree %s"
            java.lang.String r1 = java.lang.String.format(r0, r2)     // Catch:{ all -> 0x3a16 }
            java.lang.String r0 = "BloksModelFinder"
            X.C25913CoX.A01(r0, r1)     // Catch:{ all -> 0x3a16 }
            goto L_0x3a10
        L_0x0633:
            r0 = 0
            goto L_0x0624
        L_0x0635:
            java.lang.String r3 = "bk.action.bloks.asynccomponents.GetClientParamV2"
            boolean r3 = r5.equals(r3)     // Catch:{ all -> 0x3a16 }
            if (r3 == 0) goto L_0x39f6
            X.C18070vi.A0d(r0, r4)     // Catch:{ all -> 0x3a16 }
            X.C18070vi.A0d(r2, r1)     // Catch:{ all -> 0x3a16 }
            r3 = 0
            java.lang.String r7 = A0M(r0, r4)     // Catch:{ all -> 0x3a16 }
            java.lang.Object r0 = r0.A00(r1)     // Catch:{ all -> 0x3a16 }
            boolean r8 = X.C25343Ce2.A01(r0)     // Catch:{ all -> 0x3a16 }
            java.util.List r6 = r2.A06     // Catch:{ all -> 0x3a16 }
            if (r6 == 0) goto L_0x0658
            int r3 = r6.size()     // Catch:{ all -> 0x3a16 }
        L_0x0658:
            if (r8 > r3) goto L_0x069d
            X.Cpa r5 = X.CFr.A00     // Catch:{ all -> 0x3a16 }
            X.C18070vi.A0d(r7, r1)     // Catch:{ all -> 0x3a16 }
            java.util.Map r1 = X.C25968Cpa.A01(r2)     // Catch:{ all -> 0x3a16 }
            java.lang.Integer r9 = X.AnonymousClass00R.A01     // Catch:{ all -> 0x3a16 }
            java.lang.String r0 = X.C25968Cpa.A00(r9, r7, r6, r8)     // Catch:{ all -> 0x3a16 }
            boolean r0 = r1.containsKey(r0)     // Catch:{ all -> 0x3a16 }
            if (r0 == 0) goto L_0x0671
            r3 = r9
            goto L_0x0683
        L_0x0671:
            java.lang.Integer r3 = X.AnonymousClass00R.A00     // Catch:{ all -> 0x3a16 }
            java.lang.String r1 = X.C25968Cpa.A00(r3, r7, r6, r8)     // Catch:{ all -> 0x3a16 }
            X.CrK r0 = X.C25881Cns.A00(r2)     // Catch:{ all -> 0x3a16 }
            java.util.Map r0 = r0.A08     // Catch:{ all -> 0x3a16 }
            boolean r0 = r0.containsKey(r1)     // Catch:{ all -> 0x3a16 }
            if (r0 == 0) goto L_0x3a04
        L_0x0683:
            int r0 = r3.intValue()     // Catch:{ all -> 0x3a16 }
            if (r0 == r4) goto L_0x068f
            java.lang.String r1 = X.C25968Cpa.A00(r9, r7, r6, r8)     // Catch:{ all -> 0x3a16 }
            goto L_0x3633
        L_0x068f:
            if (r8 != 0) goto L_0x0697
            java.lang.Object r3 = X.C25881Cns.A02(r2, r7)     // Catch:{ all -> 0x3a16 }
            goto L_0x3a10
        L_0x0697:
            java.lang.Object r3 = r5.A02(r2, r7, r8)     // Catch:{ all -> 0x3a16 }
            goto L_0x3a10
        L_0x069d:
            java.lang.String r0 = "Trying to read a scoped client param from an un-scoped environment."
            java.lang.IllegalArgumentException r3 = X.AnonymousClass000.A0k(r0)     // Catch:{ all -> 0x3a16 }
            goto L_0x38a5
        L_0x06a5:
            java.lang.String r3 = "bk.action.animated.Destroy"
            boolean r3 = r5.equals(r3)     // Catch:{ all -> 0x3a16 }
            if (r3 == 0) goto L_0x39f6
            X.DOZ r2 = A07(r2, r0)     // Catch:{ all -> 0x3a16 }
            r3 = 0
            if (r2 == 0) goto L_0x3a10
            java.lang.String r1 = A0M(r0, r4)     // Catch:{ all -> 0x3a16 }
            r0 = 2131428149(0x7f0b0335, float:1.8477934E38)
            java.lang.Object r0 = r2.A01(r0)     // Catch:{ all -> 0x3a16 }
            java.util.HashMap r0 = (java.util.HashMap) r0     // Catch:{ all -> 0x3a16 }
            r0.remove(r1)     // Catch:{ all -> 0x3a16 }
            goto L_0x3a10
        L_0x06c6:
            java.lang.String r3 = "bk.action.bloks.GetScript"
            boolean r3 = r5.equals(r3)     // Catch:{ all -> 0x3a16 }
            if (r3 == 0) goto L_0x39f6
            java.lang.Object r0 = A0I(r0, r2)     // Catch:{ all -> 0x3a16 }
            X.AnonymousClass8BR.A1I(r0)     // Catch:{ all -> 0x3a16 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x3a16 }
            X.DNu r0 = X.C25881Cns.A01(r2, r0)     // Catch:{ all -> 0x3a16 }
            X.Cgj r3 = new X.Cgj     // Catch:{ all -> 0x3a16 }
            r3.<init>(r0)     // Catch:{ all -> 0x3a16 }
            goto L_0x3a10
        L_0x06e2:
            java.lang.String r3 = "bk.action.bloks.ClearFocus"
            boolean r3 = r5.equals(r3)     // Catch:{ all -> 0x3a16 }
            if (r3 == 0) goto L_0x39f6
            X.DFL r1 = A0E(r0, r2)     // Catch:{ all -> 0x3a16 }
            X.DOZ r0 = r2.A00     // Catch:{ all -> 0x3a16 }
            android.view.View r0 = r1.A06(r0)     // Catch:{ all -> 0x3a16 }
            if (r0 == 0) goto L_0x3a04
            r0.clearFocus()     // Catch:{ all -> 0x3a16 }
            goto L_0x3a04
        L_0x06fb:
            java.lang.String r7 = "bk.action.component.GetHeight2"
            boolean r3 = r5.equals(r7)     // Catch:{ all -> 0x3a16 }
            if (r3 == 0) goto L_0x39f6
            X.C18070vi.A0d(r0, r4)     // Catch:{ all -> 0x3a16 }
            X.C18070vi.A0d(r2, r1)     // Catch:{ all -> 0x3a16 }
            r5 = 0
            X.DFL r3 = A0D(r0, r4)     // Catch:{ all -> 0x3a16 }
            java.lang.String r4 = A0M(r0, r1)     // Catch:{ all -> 0x3a16 }
            X.DOZ r0 = r2.A00     // Catch:{ all -> 0x3a16 }
            android.view.View r0 = r3.A06(r0)     // Catch:{ all -> 0x3a16 }
            if (r0 == 0) goto L_0x1649
            int r5 = r0.getHeight()     // Catch:{ all -> 0x3a16 }
            goto L_0x1649
        L_0x0720:
            java.lang.String r3 = "bk.action.video.SendEventV2"
            boolean r3 = r5.equals(r3)     // Catch:{ all -> 0x3a16 }
            if (r3 == 0) goto L_0x39f6
            X.DOZ r2 = A07(r2, r0)     // Catch:{ all -> 0x3a16 }
            r3 = 0
            if (r2 == 0) goto L_0x3a10
            X.DFL r0 = A0D(r0, r1)     // Catch:{ all -> 0x3a16 }
            java.lang.String r1 = X.BE7.A0d(r0)     // Catch:{ all -> 0x3a16 }
            if (r1 == 0) goto L_0x0747
            r0 = 2131428187(0x7f0b035b, float:1.8478011E38)
            java.lang.Object r0 = r2.A01(r0)     // Catch:{ all -> 0x3a16 }
            java.util.AbstractMap r0 = (java.util.AbstractMap) r0     // Catch:{ all -> 0x3a16 }
            r0.get(r1)     // Catch:{ all -> 0x3a16 }
            goto L_0x3a10
        L_0x0747:
            java.lang.IllegalStateException r0 = X.C17880vN.A0g()     // Catch:{ all -> 0x3a16 }
            throw r0     // Catch:{ all -> 0x3a16 }
        L_0x074c:
            java.lang.String r3 = "bk.action.video.SendEventV3"
            boolean r3 = r5.equals(r3)     // Catch:{ all -> 0x3a16 }
            if (r3 == 0) goto L_0x39f6
            X.DOZ r5 = A07(r2, r0)     // Catch:{ all -> 0x3a16 }
            r3 = 0
            if (r5 == 0) goto L_0x3a10
            java.lang.Object r4 = r0.A00(r4)     // Catch:{ all -> 0x3a16 }
            java.lang.String r2 = "null cannot be cast to non-null type com.instagram.common.bloks.component.base.BloksModel"
            X.C18070vi.A0z(r4, r2)     // Catch:{ all -> 0x3a16 }
            java.lang.Object r0 = r0.A00(r1)     // Catch:{ all -> 0x3a16 }
            X.C18070vi.A0z(r0, r2)     // Catch:{ all -> 0x3a16 }
            X.DFL r0 = (X.DFL) r0     // Catch:{ all -> 0x3a16 }
            java.lang.String r1 = X.BE7.A0d(r0)     // Catch:{ all -> 0x3a16 }
            if (r1 != 0) goto L_0x0cd8
            java.lang.IllegalStateException r0 = X.C17880vN.A0g()     // Catch:{ all -> 0x3a16 }
            throw r0     // Catch:{ all -> 0x3a16 }
        L_0x0778:
            java.lang.String r3 = "bk.action.bloks.InsertChildrenAfter"
            boolean r3 = r5.equals(r3)     // Catch:{ all -> 0x3a16 }
            if (r3 == 0) goto L_0x39f6
            java.lang.Object r4 = A0J(r0, r2)     // Catch:{ all -> 0x3a16 }
            java.lang.String r3 = "null cannot be cast to non-null type kotlin.collections.List<com.instagram.common.bloks.component.base.BloksModel>"
            java.util.List r4 = X.BE6.A13(r4, r3)     // Catch:{ all -> 0x3a16 }
            java.lang.String r3 = A0K(r0)     // Catch:{ all -> 0x3a16 }
            X.DNk r5 = A0B(r2, r0)     // Catch:{ all -> 0x3a16 }
            X.DNl r6 = A0C(r3)     // Catch:{ all -> 0x3a16 }
            X.Bog r2 = new X.Bog     // Catch:{ all -> 0x3a16 }
            r2.<init>(r4, r1, r3)     // Catch:{ all -> 0x3a16 }
            goto L_0x35f2
        L_0x079d:
            java.lang.String r3 = "bk.action.bloks.DismissKeyboard"
            boolean r3 = r5.equals(r3)     // Catch:{ all -> 0x3a16 }
            if (r3 == 0) goto L_0x39f6
            X.C18070vi.A0d(r0, r4)     // Catch:{ all -> 0x3a16 }
            X.C18070vi.A0d(r2, r1)     // Catch:{ all -> 0x3a16 }
            X.DOZ r5 = A06(r2, r0, r4)     // Catch:{ all -> 0x3a16 }
            X.DNk r0 = X.C26272CwJ.A01(r5)     // Catch:{ all -> 0x3a16 }
            X.DFL r1 = r0.A06     // Catch:{ all -> 0x3a16 }
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.common.bloks.component.base.BloksModel"
            X.C18070vi.A0z(r1, r0)     // Catch:{ all -> 0x3a16 }
            android.view.View r2 = r1.A06(r5)     // Catch:{ all -> 0x3a16 }
            java.lang.String r3 = "input_method"
            if (r2 == 0) goto L_0x07da
            android.content.Context r0 = r2.getContext()     // Catch:{ all -> 0x3a16 }
            java.lang.Object r1 = r0.getSystemService(r3)     // Catch:{ all -> 0x3a16 }
            android.view.inputmethod.InputMethodManager r1 = (android.view.inputmethod.InputMethodManager) r1     // Catch:{ all -> 0x3a16 }
            if (r1 == 0) goto L_0x07d5
            android.os.IBinder r0 = r2.getWindowToken()     // Catch:{ all -> 0x3a16 }
            r1.hideSoftInputFromWindow(r0, r4)     // Catch:{ all -> 0x3a16 }
        L_0x07d5:
            r2.clearFocus()     // Catch:{ all -> 0x3a16 }
            goto L_0x3a04
        L_0x07da:
            android.content.Context r2 = r5.A00     // Catch:{ all -> 0x3a16 }
            X.CoE r0 = X.C25902CoE.A00     // Catch:{ all -> 0x3a16 }
            android.app.Activity r1 = X.C25902CoE.A00(r2, r0)     // Catch:{ all -> 0x3a16 }
            if (r1 == 0) goto L_0x3a04
            r0 = 16908290(0x1020002, float:2.3877235E-38)
            android.view.View r0 = r1.findViewById(r0)     // Catch:{ all -> 0x3a16 }
            if (r0 == 0) goto L_0x3a04
            java.lang.Object r1 = r2.getSystemService(r3)     // Catch:{ all -> 0x3a16 }
            android.view.inputmethod.InputMethodManager r1 = (android.view.inputmethod.InputMethodManager) r1     // Catch:{ all -> 0x3a16 }
            if (r1 == 0) goto L_0x3a04
            android.os.IBinder r0 = r0.getWindowToken()     // Catch:{ all -> 0x3a16 }
            r1.hideSoftInputFromWindow(r0, r4)     // Catch:{ all -> 0x3a16 }
            goto L_0x3a04
        L_0x07fe:
            java.lang.String r3 = "bk.action.screen.Close"
            boolean r3 = r5.equals(r3)     // Catch:{ all -> 0x3a16 }
            if (r3 == 0) goto L_0x39f6
            X.DOZ r2 = A07(r2, r0)     // Catch:{ all -> 0x3a16 }
            java.lang.String r12 = "Required value was null."
            if (r2 == 0) goto L_0x0aca
            X.DFL r6 = A0D(r0, r4)     // Catch:{ all -> 0x3a16 }
            X.CXY r10 = r2.A02     // Catch:{ all -> 0x3a16 }
            r3 = 0
            r0 = 2131428193(0x7f0b0361, float:1.8478024E38)
            java.lang.Object r7 = X.DOZ.A00(r2, r0)     // Catch:{ all -> 0x3a16 }
            java.lang.Integer r7 = (java.lang.Integer) r7     // Catch:{ all -> 0x3a16 }
            r0 = 45
            X.DFL r9 = r6.A09(r0)     // Catch:{ all -> 0x3a16 }
            if (r7 == 0) goto L_0x3a10
            r5 = 35
            java.lang.String r8 = r6.A0D(r5)     // Catch:{ all -> 0x3a16 }
            if (r8 == 0) goto L_0x0ab2
            int r11 = r8.hashCode()     // Catch:{ all -> 0x3a16 }
            r0 = 111185(0x1b251, float:1.55803E-40)
            if (r11 == r0) goto L_0x097a
            r0 = 94756344(0x5a5ddf8, float:1.5598064E-35)
            if (r11 == r0) goto L_0x0966
            r0 = 530790978(0x1fa33a42, float:6.9129565E-20)
            if (r11 != r0) goto L_0x0ab2
            java.lang.String r0 = "pop_to_screen"
            boolean r0 = r8.equals(r0)     // Catch:{ all -> 0x3a16 }
            if (r0 == 0) goto L_0x0ab2
            java.lang.String r5 = X.BE7.A0f(r6)     // Catch:{ all -> 0x3a16 }
            if (r5 == 0) goto L_0x0960
            r0 = 36
            boolean r11 = r6.A0I(r0, r4)     // Catch:{ all -> 0x3a16 }
            int r8 = r7.intValue()     // Catch:{ all -> 0x3a16 }
            android.content.Context r2 = r2.A00     // Catch:{ all -> 0x3a16 }
            android.util.SparseArray r6 = r10.A00()     // Catch:{ all -> 0x3a16 }
            X.CLX r0 = new X.CLX     // Catch:{ all -> 0x3a16 }
            r0.<init>(r6)     // Catch:{ all -> 0x3a16 }
            r0 = 16542(0x409e, float:2.318E-41)
            if (r8 == r0) goto L_0x093e
            r0 = 17043(0x4293, float:2.3882E-41)
            if (r8 == r0) goto L_0x08c1
            r0 = 17044(0x4294, float:2.3884E-41)
            if (r8 != r0) goto L_0x08b5
            java.lang.Class<android.app.Activity> r0 = android.app.Activity.class
            android.content.Context r0 = X.C24549C8u.A00(r2, r0)     // Catch:{ all -> 0x3a16 }
            if (r0 == 0) goto L_0x0a36
            boolean r0 = r0 instanceof com.whatsapp.wabloks.ui.screenquery.WaSqBloksActivity     // Catch:{ all -> 0x3a16 }
            if (r0 == 0) goto L_0x0a36
            java.lang.Class<com.whatsapp.wabloks.ui.screenquery.WaSqBloksActivity> r0 = com.whatsapp.wabloks.ui.screenquery.WaSqBloksActivity.class
            android.content.Context r2 = X.C24549C8u.A00(r2, r0)     // Catch:{ all -> 0x3a16 }
            com.whatsapp.wabloks.ui.screenquery.WaSqBloksActivity r2 = (com.whatsapp.wabloks.ui.screenquery.WaSqBloksActivity) r2     // Catch:{ all -> 0x3a16 }
            if (r2 == 0) goto L_0x08ae
            X.1GP r0 = r2.getSupportFragmentManager()     // Catch:{ all -> 0x3a16 }
            X.C18070vi.A0X(r0)     // Catch:{ all -> 0x3a16 }
            X.1GP r6 = r2.getSupportFragmentManager()     // Catch:{ all -> 0x3a16 }
            r0 = 2131428247(0x7f0b0397, float:1.8478133E38)
            androidx.fragment.app.Fragment r6 = r6.A0O(r0)     // Catch:{ all -> 0x3a16 }
            boolean r0 = r6 instanceof com.whatsapp.wabloks.ui.screenquery.WaBloksScreenQueryFragment     // Catch:{ all -> 0x3a16 }
            r7 = 0
            if (r0 == 0) goto L_0x08a3
            com.whatsapp.wabloks.ui.screenquery.WaBloksScreenQueryFragment r6 = (com.whatsapp.wabloks.ui.screenquery.WaBloksScreenQueryFragment) r6     // Catch:{ all -> 0x3a16 }
            if (r6 == 0) goto L_0x08a3
            java.lang.String r7 = r6.A02     // Catch:{ all -> 0x3a16 }
        L_0x08a3:
            X.1GP r6 = r2.getSupportFragmentManager()     // Catch:{ all -> 0x3a16 }
            X.C18070vi.A0X(r6)     // Catch:{ all -> 0x3a16 }
            if (r11 == 0) goto L_0x09e7
            goto L_0x09d6
        L_0x08ae:
            java.lang.String r0 = "Context should be derived from a AmaBloksActivity"
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0n(r0)     // Catch:{ all -> 0x3a16 }
            throw r0     // Catch:{ all -> 0x3a16 }
        L_0x08b5:
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch:{ all -> 0x3a16 }
            r1[r4] = r7     // Catch:{ all -> 0x3a16 }
            java.lang.String r0 = "No implementation bound to key: %s"
            java.lang.IllegalArgumentException r3 = X.BE8.A0X(r0, r1)     // Catch:{ all -> 0x3a16 }
            goto L_0x38a5
        L_0x08c1:
            java.lang.Class<X.1FL> r0 = X.AnonymousClass1FL.class
            android.content.Context r0 = X.C24549C8u.A00(r2, r0)     // Catch:{ all -> 0x3a16 }
            X.1FL r0 = (X.AnonymousClass1FL) r0     // Catch:{ all -> 0x3a16 }
            if (r0 == 0) goto L_0x0a6d
            com.whatsapp.wabloks.ui.screenquery.WaBloksScreenQueryBottomSheetHostFragment r7 = X.C181819Ry.A00(r0)     // Catch:{ all -> 0x3a16 }
            if (r7 == 0) goto L_0x0a6d
            com.whatsapp.wabloks.ui.screenquery.WaBloksScreenQueryBottomSheetFragment r0 = r7.A2K()     // Catch:{ all -> 0x3a16 }
            if (r0 == 0) goto L_0x08e2
            X.AHz r0 = r0.A01     // Catch:{ all -> 0x3a16 }
            if (r0 != 0) goto L_0x08e4
            java.lang.String r0 = "screenProps"
            X.C18070vi.A11(r0)     // Catch:{ all -> 0x3a16 }
            goto L_0x38a5
        L_0x08e2:
            r2 = 0
            goto L_0x08e6
        L_0x08e4:
            java.lang.String r2 = r0.A06     // Catch:{ all -> 0x3a16 }
        L_0x08e6:
            X.1GP r6 = r7.A1E()     // Catch:{ all -> 0x3a16 }
            X.C18070vi.A0X(r6)     // Catch:{ all -> 0x3a16 }
            if (r11 == 0) goto L_0x0917
            int r0 = r6.A0K()     // Catch:{ all -> 0x3a16 }
            if (r0 == 0) goto L_0x0906
            X.1ji r0 = r6.A0S(r4)     // Catch:{ all -> 0x3a16 }
            X.1jj r0 = (X.C34001jj) r0     // Catch:{ all -> 0x3a16 }
            java.lang.String r0 = r0.A0A     // Catch:{ all -> 0x3a16 }
            boolean r0 = r5.equals(r0)     // Catch:{ all -> 0x3a16 }
            if (r0 == 0) goto L_0x0906
            r7.A28()     // Catch:{ all -> 0x3a16 }
        L_0x0906:
            boolean r0 = r5.equals(r2)     // Catch:{ all -> 0x3a16 }
            if (r0 == 0) goto L_0x0917
            int r0 = r6.A0K()     // Catch:{ all -> 0x3a16 }
            if (r0 != 0) goto L_0x0a1b
            r7.A28()     // Catch:{ all -> 0x3a16 }
            goto L_0x3a10
        L_0x0917:
            boolean r0 = r5.equals(r2)     // Catch:{ all -> 0x3a16 }
            if (r0 != 0) goto L_0x3a10
            int r2 = r6.A0K()     // Catch:{ all -> 0x3a16 }
            int r2 = r2 - r1
        L_0x0922:
            r0 = -1
            if (r0 >= r2) goto L_0x0a20
            X.1ji r0 = r6.A0S(r2)     // Catch:{ all -> 0x3a16 }
            X.1jj r0 = (X.C34001jj) r0     // Catch:{ all -> 0x3a16 }
            java.lang.String r0 = r0.A0A     // Catch:{ all -> 0x3a16 }
            boolean r0 = r5.equals(r0)     // Catch:{ all -> 0x3a16 }
            if (r0 == 0) goto L_0x0937
            r6.A0v(r5, r1)     // Catch:{ all -> 0x3a16 }
            goto L_0x093a
        L_0x0937:
            int r2 = r2 + -1
            goto L_0x0922
        L_0x093a:
            if (r11 == 0) goto L_0x3a10
            goto L_0x0a1b
        L_0x093e:
            if (r9 == 0) goto L_0x0950
            int r1 = r9.A05     // Catch:{ all -> 0x3a16 }
            r0 = 16962(0x4242, float:2.3769E-41)
            if (r1 != r0) goto L_0x0950
            java.lang.String r1 = "default"
            java.lang.String r0 = X.BE7.A0d(r9)     // Catch:{ all -> 0x3a16 }
            if (r0 == 0) goto L_0x0952
            r1 = r0
            goto L_0x0952
        L_0x0950:
            r1 = r3
            goto L_0x0956
        L_0x0952:
            java.lang.Integer r1 = X.C25301Cd5.A00(r1)     // Catch:{ all -> 0x3a16 }
        L_0x0956:
            X.8d5 r0 = new X.8d5     // Catch:{ all -> 0x3a16 }
            r0.<init>(r1)     // Catch:{ all -> 0x3a16 }
            X.A8X.A04(r2, r0, r5)     // Catch:{ all -> 0x3a16 }
            goto L_0x3a10
        L_0x0960:
            java.lang.IllegalArgumentException r3 = X.AnonymousClass000.A0k(r12)     // Catch:{ all -> 0x3a16 }
            goto L_0x38a5
        L_0x0966:
            java.lang.String r0 = "close"
            boolean r0 = r8.equals(r0)     // Catch:{ all -> 0x3a16 }
            if (r0 == 0) goto L_0x0ab2
            int r8 = r7.intValue()     // Catch:{ all -> 0x3a16 }
            android.content.Context r5 = r2.A00     // Catch:{ all -> 0x3a16 }
            X.BNE r6 = new X.BNE     // Catch:{ all -> 0x3a16 }
            r6.<init>(r9)     // Catch:{ all -> 0x3a16 }
            goto L_0x098d
        L_0x097a:
            java.lang.String r0 = "pop"
            boolean r0 = r8.equals(r0)     // Catch:{ all -> 0x3a16 }
            if (r0 == 0) goto L_0x0ab2
            int r8 = r7.intValue()     // Catch:{ all -> 0x3a16 }
            android.content.Context r5 = r2.A00     // Catch:{ all -> 0x3a16 }
            X.BNF r6 = new X.BNF     // Catch:{ all -> 0x3a16 }
            r6.<init>(r9)     // Catch:{ all -> 0x3a16 }
        L_0x098d:
            android.util.SparseArray r2 = r10.A00()     // Catch:{ all -> 0x3a16 }
            X.CLX r0 = new X.CLX     // Catch:{ all -> 0x3a16 }
            r0.<init>(r2)     // Catch:{ all -> 0x3a16 }
            r0 = 16542(0x409e, float:2.318E-41)
            if (r8 == r0) goto L_0x0a76
            r0 = 17043(0x4293, float:2.3882E-41)
            if (r8 == r0) goto L_0x0a47
            r0 = 17044(0x4294, float:2.3884E-41)
            if (r8 != r0) goto L_0x0a3b
            java.lang.Class<android.app.Activity> r0 = android.app.Activity.class
            android.content.Context r0 = X.C24549C8u.A00(r5, r0)     // Catch:{ all -> 0x3a16 }
            if (r0 == 0) goto L_0x0a36
            boolean r0 = r0 instanceof com.whatsapp.wabloks.ui.screenquery.WaSqBloksActivity     // Catch:{ all -> 0x3a16 }
            if (r0 == 0) goto L_0x0a36
            java.lang.Class<com.whatsapp.wabloks.ui.screenquery.WaSqBloksActivity> r0 = com.whatsapp.wabloks.ui.screenquery.WaSqBloksActivity.class
            android.content.Context r2 = X.C24549C8u.A00(r5, r0)     // Catch:{ all -> 0x3a16 }
            com.whatsapp.wabloks.ui.screenquery.WaSqBloksActivity r2 = (com.whatsapp.wabloks.ui.screenquery.WaSqBloksActivity) r2     // Catch:{ all -> 0x3a16 }
            if (r2 == 0) goto L_0x0a2e
            X.1GP r1 = r2.getSupportFragmentManager()     // Catch:{ all -> 0x3a16 }
            X.C18070vi.A0X(r1)     // Catch:{ all -> 0x3a16 }
            boolean r0 = r6 instanceof X.BNE     // Catch:{ all -> 0x3a16 }
            if (r0 != 0) goto L_0x09e2
            boolean r0 = r6 instanceof X.BNF     // Catch:{ all -> 0x3a16 }
            if (r0 == 0) goto L_0x3a10
            int r0 = r1.A0K()     // Catch:{ all -> 0x3a16 }
            if (r0 == 0) goto L_0x09e2
            boolean r0 = r1.A0F     // Catch:{ all -> 0x3a16 }
            if (r0 != 0) goto L_0x09e2
            r1.A0b()     // Catch:{ all -> 0x3a16 }
            goto L_0x3a10
        L_0x09d6:
            boolean r0 = r5.equals(r7)     // Catch:{ all -> 0x3a16 }
            if (r0 == 0) goto L_0x09e7
            int r0 = r6.A0K()     // Catch:{ all -> 0x3a16 }
            if (r0 != 0) goto L_0x0a1b
        L_0x09e2:
            r2.finish()     // Catch:{ all -> 0x3a16 }
            goto L_0x3a10
        L_0x09e7:
            boolean r0 = r5.equals(r7)     // Catch:{ all -> 0x3a16 }
            if (r0 != 0) goto L_0x3a10
            int r7 = r6.A0K()     // Catch:{ all -> 0x3a16 }
            int r7 = r7 - r1
        L_0x09f2:
            r0 = -1
            if (r0 >= r7) goto L_0x0a20
            X.1ji r0 = r6.A0S(r7)     // Catch:{ all -> 0x3a16 }
            X.1jj r0 = (X.C34001jj) r0     // Catch:{ all -> 0x3a16 }
            java.lang.String r0 = r0.A0A     // Catch:{ all -> 0x3a16 }
            boolean r0 = r5.equals(r0)     // Catch:{ all -> 0x3a16 }
            if (r0 == 0) goto L_0x0a07
            r6.A0v(r5, r1)     // Catch:{ all -> 0x3a16 }
            goto L_0x0a0a
        L_0x0a07:
            int r7 = r7 + -1
            goto L_0x09f2
        L_0x0a0a:
            if (r11 == 0) goto L_0x3a10
            X.1ji r0 = r6.A0S(r4)     // Catch:{ all -> 0x3a16 }
            X.1jj r0 = (X.C34001jj) r0     // Catch:{ all -> 0x3a16 }
            java.lang.String r0 = r0.A0A     // Catch:{ all -> 0x3a16 }
            boolean r0 = r5.equals(r0)     // Catch:{ all -> 0x3a16 }
            if (r0 == 0) goto L_0x0a1b
            goto L_0x09e2
        L_0x0a1b:
            r6.A0b()     // Catch:{ all -> 0x3a16 }
            goto L_0x3a10
        L_0x0a20:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x3a16 }
            java.lang.String r0 = "Could not find Bloks screen with ID: "
            java.lang.String r1 = X.AnonymousClass001.A1H(r0, r5, r1)     // Catch:{ all -> 0x3a16 }
            java.lang.String r0 = "WaBloksNavigationUtils"
            goto L_0x0ac5
        L_0x0a2e:
            java.lang.String r0 = "Context should be derived from a AmaBloksActivity"
            java.lang.IllegalStateException r3 = X.AnonymousClass000.A0n(r0)     // Catch:{ all -> 0x3a16 }
            goto L_0x38a5
        L_0x0a36:
            java.lang.String r1 = "WaBloksFullScreenContainerNavigator"
            java.lang.String r0 = "Attempting to close a bloks screen from a non-bloks activity"
            goto L_0x0a71
        L_0x0a3b:
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch:{ all -> 0x3a16 }
            r1[r4] = r7     // Catch:{ all -> 0x3a16 }
            java.lang.String r0 = "No implementation bound to key: %s"
            java.lang.IllegalArgumentException r3 = X.BE8.A0X(r0, r1)     // Catch:{ all -> 0x3a16 }
            goto L_0x38a5
        L_0x0a47:
            java.lang.Class<X.1FL> r0 = X.AnonymousClass1FL.class
            android.content.Context r0 = X.C24549C8u.A00(r5, r0)     // Catch:{ all -> 0x3a16 }
            X.1FL r0 = (X.AnonymousClass1FL) r0     // Catch:{ all -> 0x3a16 }
            if (r0 == 0) goto L_0x0a6d
            com.whatsapp.wabloks.ui.screenquery.WaBloksScreenQueryBottomSheetHostFragment r1 = X.C181819Ry.A00(r0)     // Catch:{ all -> 0x3a16 }
            if (r1 == 0) goto L_0x0a6d
            boolean r0 = r6 instanceof X.BNE     // Catch:{ all -> 0x3a16 }
            if (r0 == 0) goto L_0x0a60
            r1.A28()     // Catch:{ all -> 0x3a16 }
            goto L_0x3a10
        L_0x0a60:
            boolean r0 = r6 instanceof X.BNF     // Catch:{ all -> 0x3a16 }
            if (r0 == 0) goto L_0x3a10
            X.1GP r0 = r1.A1E()     // Catch:{ all -> 0x3a16 }
            r0.A0b()     // Catch:{ all -> 0x3a16 }
            goto L_0x3a10
        L_0x0a6d:
            java.lang.String r1 = "WaBloksBottomSheetContainerNavigator"
            java.lang.String r0 = "Attempting to close a bloks bottomsheet from a non-bloks host fragment"
        L_0x0a71:
            X.C25913CoX.A01(r1, r0)     // Catch:{ all -> 0x3a16 }
            goto L_0x3a10
        L_0x0a76:
            boolean r4 = r6 instanceof X.BNF     // Catch:{ all -> 0x3a16 }
            if (r4 == 0) goto L_0x0a80
            r0 = r6
            X.BNF r0 = (X.BNF) r0     // Catch:{ all -> 0x3a16 }
            X.DFL r2 = r0.A00     // Catch:{ all -> 0x3a16 }
            goto L_0x0a85
        L_0x0a80:
            r0 = r6
            X.BNE r0 = (X.BNE) r0     // Catch:{ all -> 0x3a16 }
            X.DFL r2 = r0.A00     // Catch:{ all -> 0x3a16 }
        L_0x0a85:
            if (r2 == 0) goto L_0x0a97
            int r1 = r2.A05     // Catch:{ all -> 0x3a16 }
            r0 = 16962(0x4242, float:2.3769E-41)
            if (r1 != r0) goto L_0x0a97
            java.lang.String r1 = "default"
            java.lang.String r0 = X.BE7.A0d(r2)     // Catch:{ all -> 0x3a16 }
            if (r0 == 0) goto L_0x0a99
            r1 = r0
            goto L_0x0a99
        L_0x0a97:
            r1 = r3
            goto L_0x0a9d
        L_0x0a99:
            java.lang.Integer r1 = X.C25301Cd5.A00(r1)     // Catch:{ all -> 0x3a16 }
        L_0x0a9d:
            boolean r0 = r6 instanceof X.BNE     // Catch:{ all -> 0x3a16 }
            if (r0 == 0) goto L_0x0aa6
            X.A8X.A03(r5, r3, r3, r3)     // Catch:{ all -> 0x3a16 }
            goto L_0x3a10
        L_0x0aa6:
            if (r4 == 0) goto L_0x3a10
            X.8d5 r0 = new X.8d5     // Catch:{ all -> 0x3a16 }
            r0.<init>(r1)     // Catch:{ all -> 0x3a16 }
            X.A8X.A04(r5, r0, r3)     // Catch:{ all -> 0x3a16 }
            goto L_0x3a10
        L_0x0ab2:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x3a16 }
            java.lang.String r0 = "Unrecognized close type: "
            r1.append(r0)     // Catch:{ all -> 0x3a16 }
            java.lang.String r0 = r6.A0D(r5)     // Catch:{ all -> 0x3a16 }
            java.lang.String r1 = X.AnonymousClass000.A0y(r0, r1)     // Catch:{ all -> 0x3a16 }
            java.lang.String r0 = "BKBloksActionScreenCloseImpl"
        L_0x0ac5:
            X.C25913CoX.A01(r0, r1)     // Catch:{ all -> 0x3a16 }
            goto L_0x3a10
        L_0x0aca:
            java.lang.IllegalStateException r3 = X.AnonymousClass000.A0n(r12)     // Catch:{ all -> 0x3a16 }
            goto L_0x38a5
        L_0x0ad0:
            java.lang.String r3 = "bk.action.bloks.WithScope"
            boolean r3 = r5.equals(r3)     // Catch:{ all -> 0x3a16 }
            if (r3 == 0) goto L_0x39f6
            X.C18070vi.A0d(r0, r4)     // Catch:{ all -> 0x3a16 }
            X.C18070vi.A0d(r2, r1)     // Catch:{ all -> 0x3a16 }
            X.E8A r12 = X.C25488Cgj.A00(r0, r4)     // Catch:{ all -> 0x3a16 }
            java.util.concurrent.atomic.AtomicInteger r0 = X.CFq.A00     // Catch:{ all -> 0x3a16 }
            int r1 = r0.incrementAndGet()     // Catch:{ all -> 0x3a16 }
            java.util.List r0 = r2.A06     // Catch:{ all -> 0x3a16 }
            java.util.LinkedList r13 = new java.util.LinkedList     // Catch:{ all -> 0x3a16 }
            r13.<init>(r0)     // Catch:{ all -> 0x3a16 }
            X.C17890vO.A1D(r13, r1)     // Catch:{ all -> 0x3a16 }
            X.DOZ r11 = r2.A00     // Catch:{ all -> 0x3a16 }
            X.E8A r10 = r2.A04     // Catch:{ all -> 0x3a16 }
            java.util.Map r9 = r2.A09     // Catch:{ all -> 0x3a16 }
            X.CrK r8 = r2.A01     // Catch:{ all -> 0x3a16 }
            X.CLa r7 = r2.A02     // Catch:{ all -> 0x3a16 }
            java.util.Map r6 = r2.A0A     // Catch:{ all -> 0x3a16 }
            X.B6x r5 = r2.A01     // Catch:{ all -> 0x3a16 }
            X.CFu r4 = r2.A03     // Catch:{ all -> 0x3a16 }
            java.lang.String r3 = r2.A07     // Catch:{ all -> 0x3a16 }
            java.lang.Integer r0 = r2.A05     // Catch:{ all -> 0x3a16 }
            r18 = 0
            X.9zJ r2 = r2.A05     // Catch:{ all -> 0x3a16 }
            X.Boh r1 = new X.Boh     // Catch:{ all -> 0x3a16 }
            r29 = r18
            r20 = r18
            r22 = r7
            r23 = r4
            r24 = r2
            r25 = r10
            r26 = r5
            r27 = r0
            r28 = r3
            r30 = r13
            r31 = r9
            r32 = r6
            r19 = r11
            r21 = r8
            r17 = r1
            r17.<init>(r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32)     // Catch:{ all -> 0x3a16 }
            X.9zJ r0 = X.C199029zJ.A01     // Catch:{ all -> 0x3a16 }
            java.lang.Object r3 = X.C25974Cph.A00(r1, r0, r12)     // Catch:{ all -> 0x3a16 }
            goto L_0x3a10
        L_0x0b35:
            java.lang.String r3 = "bk.action.bloks.ParseEmbedded"
            boolean r3 = r5.equals(r3)     // Catch:{ all -> 0x3a16 }
            if (r3 == 0) goto L_0x39f6
            java.lang.Object r1 = A0I(r0, r2)     // Catch:{ all -> 0x3a16 }
            X.AnonymousClass8BR.A1I(r1)     // Catch:{ all -> 0x3a16 }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ all -> 0x3a16 }
            java.lang.String r0 = "ParseEmbedded"
            X.AnonymousClass0O7.A01(r0)     // Catch:{ all -> 0x3a16 }
            X.C25995CqB.A00()     // Catch:{ IOException -> 0x0b6f }
            X.ALN r0 = X.BEA.A0V(r1)     // Catch:{ IOException -> 0x0b6f }
            X.ChR r0 = X.C25529ChR.A00(r0)     // Catch:{ IOException -> 0x0b6f }
            if (r0 == 0) goto L_0x0b68
            X.CLb r0 = r0.A00     // Catch:{ IOException -> 0x0b6f }
            if (r0 == 0) goto L_0x0b68
            X.CUK r1 = r0.A00     // Catch:{ IOException -> 0x0b6f }
            r0 = 0
            X.CvV r3 = A09(r2, r1, r0, r4, r4)     // Catch:{ all -> 0x3a16 }
            X.AnonymousClass0O7.A00()     // Catch:{ all -> 0x3a16 }
            goto L_0x3a10
        L_0x0b68:
            java.lang.String r0 = "Encountered empty BloksResponse. Could not parse embedded payload"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0k(r0)     // Catch:{ IOException -> 0x0b6f }
            throw r0     // Catch:{ IOException -> 0x0b6f }
        L_0x0b6f:
            java.lang.String r0 = "Could not parse embedded payload"
            java.lang.IllegalArgumentException r3 = X.AnonymousClass000.A0k(r0)     // Catch:{ all -> 0x3a16 }
            goto L_0x38a5
        L_0x0b77:
            java.lang.String r3 = "bk.action.text_input.InsertTextAtCursor"
            boolean r3 = r5.equals(r3)     // Catch:{ all -> 0x3a16 }
            if (r3 == 0) goto L_0x39f6
            X.DFL r3 = A0E(r0, r2)     // Catch:{ all -> 0x3a16 }
            java.lang.String r5 = A0M(r0, r1)     // Catch:{ all -> 0x3a16 }
            X.DOZ r0 = r2.A00     // Catch:{ all -> 0x3a16 }
            if (r0 == 0) goto L_0x3a04
            java.lang.Object r1 = X.C26272CwJ.A04(r0, r3)     // Catch:{ all -> 0x3a16 }
            X.CTH r1 = (X.CTH) r1     // Catch:{ all -> 0x3a16 }
            if (r1 == 0) goto L_0x3a04
            X.C18070vi.A0d(r5, r4)     // Catch:{ all -> 0x3a16 }
            r0 = 0
            X.C26176Ctu.A02(r0)     // Catch:{ all -> 0x3a16 }
            com.facebook.primitive.textinput.TextInputView r3 = r1.A02     // Catch:{ all -> 0x3a16 }
            if (r3 == 0) goto L_0x3a04
            int r2 = r3.getSelectionStart()     // Catch:{ all -> 0x3a16 }
            int r1 = r3.getSelectionEnd()     // Catch:{ all -> 0x3a16 }
            android.text.Editable r0 = r3.getText()     // Catch:{ all -> 0x3a16 }
            if (r2 == r1) goto L_0x0bbc
            r0.replace(r2, r1, r5)     // Catch:{ all -> 0x3a16 }
        L_0x0baf:
            r3.setText(r0)     // Catch:{ all -> 0x3a16 }
            int r0 = r5.length()     // Catch:{ all -> 0x3a16 }
            int r2 = r2 + r0
            r3.setSelection(r2)     // Catch:{ all -> 0x3a16 }
            goto L_0x3a04
        L_0x0bbc:
            r0.insert(r2, r5)     // Catch:{ all -> 0x3a16 }
            goto L_0x0baf
        L_0x0bc0:
            java.lang.String r3 = "bk.action.bloks.UpdateGlobalConsistencyStore"
            boolean r3 = r5.equals(r3)     // Catch:{ all -> 0x3a16 }
            if (r3 == 0) goto L_0x39f6
            java.lang.Object r4 = A0I(r0, r2)     // Catch:{ all -> 0x3a16 }
            X.AnonymousClass8BR.A1I(r4)     // Catch:{ all -> 0x3a16 }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ all -> 0x3a16 }
            java.lang.Object r0 = r0.A00(r1)     // Catch:{ all -> 0x3a16 }
            X.Cgj r0 = (X.C25488Cgj) r0     // Catch:{ all -> 0x3a16 }
            X.E8A r3 = r0.A00     // Catch:{ all -> 0x3a16 }
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.common.lispy.lang.Expression"
            X.C18070vi.A0z(r3, r0)     // Catch:{ all -> 0x3a16 }
            X.DOZ r1 = r2.A00     // Catch:{ all -> 0x3a16 }
            if (r1 == 0) goto L_0x0c0b
            java.lang.String r0 = "gs"
            X.E89 r1 = X.C26272CwJ.A02(r1, r0)     // Catch:{ all -> 0x3a16 }
            if (r1 == 0) goto L_0x0c07
            boolean r0 = r1 instanceof X.C26960DNi     // Catch:{ all -> 0x3a16 }
            if (r0 == 0) goto L_0x0c07
            X.DNi r1 = (X.C26960DNi) r1     // Catch:{ all -> 0x3a16 }
            X.Cjj r5 = r1.A00     // Catch:{ all -> 0x3a16 }
            monitor-enter(r5)     // Catch:{ all -> 0x3a16 }
            java.util.Map r0 = r5.A00     // Catch:{ all -> 0x386a }
            java.lang.Object r1 = r0.get(r4)     // Catch:{ all -> 0x386a }
            X.9zJ r0 = X.C108985cd.A0K(r1)     // Catch:{ Exception -> 0x0c01 }
            java.lang.Object r1 = X.CCJ.A00(r0, r3, r2)     // Catch:{ Exception -> 0x0c01 }
        L_0x0c01:
            r5.A01(r4, r1)     // Catch:{ all -> 0x386a }
            monitor-exit(r5)     // Catch:{ all -> 0x3a16 }
            goto L_0x3a04
        L_0x0c07:
            java.lang.String r1 = "BloksLegacyDataModule"
            goto L_0x1e50
        L_0x0c0b:
            java.lang.IllegalStateException r0 = X.C17880vN.A0g()     // Catch:{ all -> 0x3a16 }
            throw r0     // Catch:{ all -> 0x3a16 }
        L_0x0c10:
            java.lang.String r3 = "bk.action.array.Map"
            boolean r3 = r5.equals(r3)     // Catch:{ all -> 0x3a16 }
            if (r3 == 0) goto L_0x39f6
            java.lang.Object r9 = A0I(r0, r2)     // Catch:{ all -> 0x3a16 }
            java.util.List r9 = (java.util.List) r9     // Catch:{ all -> 0x3a16 }
            X.E8A r8 = X.C25488Cgj.A00(r0, r1)     // Catch:{ all -> 0x3a16 }
            if (r9 != 0) goto L_0x0c28
            java.util.List r3 = java.util.Collections.EMPTY_LIST     // Catch:{ all -> 0x3a16 }
            goto L_0x3a10
        L_0x0c28:
            java.util.ArrayList r3 = X.AnonymousClass000.A14(r9)     // Catch:{ all -> 0x3a16 }
            int r7 = r9.size()     // Catch:{ all -> 0x3a16 }
            r6 = 0
        L_0x0c31:
            if (r6 >= r7) goto L_0x3a10
            X.A4p r5 = new X.A4p     // Catch:{ all -> 0x3a16 }
            r5.<init>()     // Catch:{ all -> 0x3a16 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x3a16 }
            r5.A03(r0, r4)     // Catch:{ all -> 0x3a16 }
            java.lang.Object r0 = r9.get(r6)     // Catch:{ all -> 0x3a16 }
            X.9zJ r0 = X.BE7.A0R(r5, r0, r1)     // Catch:{ all -> 0x3a16 }
            java.lang.Object r0 = X.C25974Cph.A00(r2, r0, r8)     // Catch:{ all -> 0x3a16 }
            r3.add(r0)     // Catch:{ all -> 0x3a16 }
            int r6 = r6 + 1
            goto L_0x0c31
        L_0x0c51:
            java.lang.String r3 = "bk.action.bloks.Reduce"
            boolean r3 = r5.equals(r3)     // Catch:{ all -> 0x3a16 }
            if (r3 == 0) goto L_0x39f6
            java.lang.String r5 = A0N(r0, r2)     // Catch:{ all -> 0x3a16 }
            X.DOZ r0 = r2.A00     // Catch:{ all -> 0x3a16 }
            if (r0 == 0) goto L_0x0ca7
            X.DNk r4 = X.C26272CwJ.A01(r0)     // Catch:{ all -> 0x3a16 }
            X.Cph r3 = new X.Cph     // Catch:{ all -> 0x3a16 }
            r3.<init>(r2)     // Catch:{ all -> 0x3a16 }
            boolean r0 = X.C26176Ctu.A03()     // Catch:{ all -> 0x3a16 }
            if (r0 == 0) goto L_0x0c9f
            java.lang.String r0 = "Bloks Reduce"
            X.AnonymousClass0O7.A01(r0)     // Catch:{ all -> 0x3a16 }
            boolean r0 = r4.A0N     // Catch:{ all -> 0x3a16 }
            if (r0 == 0) goto L_0x0c80
            java.lang.String r1 = "BloksTreeManager"
            java.lang.String r0 = "Trying to access a tree on a destroyed BloksTreeManager"
            X.C25913CoX.A01(r1, r0)     // Catch:{ all -> 0x3a16 }
        L_0x0c80:
            java.lang.String r0 = "Tree operations are only supported from the UI Thread"
            X.C26176Ctu.A02(r0)     // Catch:{ all -> 0x3a16 }
            java.util.List r0 = r4.A0H     // Catch:{ all -> 0x3a16 }
            X.DFL r2 = X.C26962DNk.A02(r4, r0)     // Catch:{ all -> 0x3a16 }
            X.BoL r1 = new X.BoL     // Catch:{ all -> 0x3a16 }
            r1.<init>(r3, r5)     // Catch:{ all -> 0x3a16 }
            r0 = 0
            X.DFL r0 = X.CC3.A00(r0, r1, r2)     // Catch:{ all -> 0x3a16 }
            if (r2 == r0) goto L_0x3a01
            java.lang.String r0 = "Reflow traversal produced an updated component"
            java.lang.IllegalStateException r3 = X.AnonymousClass000.A0n(r0)     // Catch:{ all -> 0x3a16 }
            goto L_0x38a5
        L_0x0c9f:
            java.lang.String r0 = "Accessing state is only supported from the UI Thread"
            java.lang.RuntimeException r3 = X.AnonymousClass8BR.A0w(r0)     // Catch:{ all -> 0x3a16 }
            goto L_0x38a5
        L_0x0ca7:
            java.lang.IllegalStateException r0 = X.C17880vN.A0g()     // Catch:{ all -> 0x3a16 }
            throw r0     // Catch:{ all -> 0x3a16 }
        L_0x0cac:
            java.lang.String r3 = "bk.action.video.SetPositionV2"
            boolean r3 = r5.equals(r3)     // Catch:{ all -> 0x3a16 }
            if (r3 == 0) goto L_0x39f6
            X.DOZ r5 = A07(r2, r0)     // Catch:{ all -> 0x3a16 }
            r3 = 0
            if (r5 == 0) goto L_0x3a10
            java.lang.Object r4 = r0.A00(r4)     // Catch:{ all -> 0x3a16 }
            java.lang.String r2 = "null cannot be cast to non-null type kotlin.Number"
            X.C18070vi.A0z(r4, r2)     // Catch:{ all -> 0x3a16 }
            java.lang.Number r4 = (java.lang.Number) r4     // Catch:{ all -> 0x3a16 }
            r4.intValue()     // Catch:{ all -> 0x3a16 }
            X.DFL r0 = A0D(r0, r1)     // Catch:{ all -> 0x3a16 }
            java.lang.String r1 = X.BE7.A0d(r0)     // Catch:{ all -> 0x3a16 }
            if (r1 != 0) goto L_0x0cd8
            java.lang.IllegalStateException r0 = X.C17880vN.A0g()     // Catch:{ all -> 0x3a16 }
            throw r0     // Catch:{ all -> 0x3a16 }
        L_0x0cd8:
            r0 = 2131428187(0x7f0b035b, float:1.8478011E38)
            java.lang.Object r0 = r5.A01(r0)     // Catch:{ all -> 0x3a16 }
            java.util.AbstractMap r0 = (java.util.AbstractMap) r0     // Catch:{ all -> 0x3a16 }
            r0.get(r1)     // Catch:{ all -> 0x3a16 }
            goto L_0x3a10
        L_0x0ce6:
            java.lang.String r2 = "bk.action.ttrc.AddPointV2"
            boolean r2 = r5.equals(r2)     // Catch:{ all -> 0x3a16 }
            if (r2 == 0) goto L_0x39f6
            X.C18070vi.A0d(r0, r4)     // Catch:{ all -> 0x3a16 }
            int r5 = A02(r0, r4)     // Catch:{ all -> 0x3a16 }
            java.lang.Object r4 = r0.A00(r1)     // Catch:{ all -> 0x3a16 }
            java.lang.String r1 = "null cannot be cast to non-null type kotlin.String"
            X.C18070vi.A0z(r4, r1)     // Catch:{ all -> 0x3a16 }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ all -> 0x3a16 }
            r1 = 2
            java.lang.String r3 = A0L(r0, r1)     // Catch:{ all -> 0x3a16 }
            r1 = 3
            java.lang.Object r2 = r0.A00(r1)     // Catch:{ all -> 0x3a16 }
            java.lang.String r1 = "null cannot be cast to non-null type kotlin.collections.Map<kotlin.Any, kotlin.Any>"
            X.C18070vi.A0z(r2, r1)     // Catch:{ all -> 0x3a16 }
            java.util.Map r2 = (java.util.Map) r2     // Catch:{ all -> 0x3a16 }
            r1 = 4
            java.lang.Object r1 = X.BE6.A0n(r0, r1)     // Catch:{ all -> 0x3a16 }
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.Long"
            X.C18070vi.A0z(r1, r0)     // Catch:{ all -> 0x3a16 }
            java.lang.Long r1 = (java.lang.Long) r1     // Catch:{ all -> 0x3a16 }
            X.A7e.A03(r1, r4, r3, r2, r5)     // Catch:{ all -> 0x3a16 }
            goto L_0x3a04
        L_0x0d22:
            java.lang.String r3 = "bk.action.callback.Make"
            boolean r3 = r5.equals(r3)     // Catch:{ all -> 0x3a16 }
            if (r3 == 0) goto L_0x39f6
            X.C18070vi.A0d(r0, r4)     // Catch:{ all -> 0x3a16 }
            X.C18070vi.A0d(r2, r1)     // Catch:{ all -> 0x3a16 }
            X.E8A r0 = X.C25488Cgj.A00(r0, r4)     // Catch:{ all -> 0x3a16 }
            X.Ci0 r3 = new X.Ci0     // Catch:{ all -> 0x3a16 }
            r3.<init>((X.C23736Boh) r2, (X.E8A) r0)     // Catch:{ all -> 0x3a16 }
            goto L_0x3a10
        L_0x0d3b:
            java.lang.String r3 = "bk.action.bloks.Inflate"
            boolean r3 = r5.equals(r3)     // Catch:{ all -> 0x3a16 }
            if (r3 == 0) goto L_0x39f6
            X.C18070vi.A0d(r0, r4)     // Catch:{ all -> 0x3a16 }
            X.C18070vi.A0d(r2, r1)     // Catch:{ all -> 0x3a16 }
            java.util.List r5 = r0.A00     // Catch:{ all -> 0x3a16 }
            java.lang.Object r3 = r5.get(r4)     // Catch:{ all -> 0x3a16 }
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.collections.Map<kotlin.Any, kotlin.Any>"
            X.C18070vi.A0z(r3, r0)     // Catch:{ all -> 0x3a16 }
            java.util.Map r3 = (java.util.Map) r3     // Catch:{ all -> 0x3a16 }
            X.E8A r4 = X.AnonymousClass8BT.A08(r5, r1)     // Catch:{ all -> 0x3a16 }
            r0 = 2
            X.E8A r5 = X.AnonymousClass8BT.A08(r5, r0)     // Catch:{ all -> 0x3a16 }
            java.lang.String r0 = "Inflate"
            X.AnonymousClass0O7.A01(r0)     // Catch:{ all -> 0x3a16 }
            java.util.Iterator r3 = X.AnonymousClass000.A15(r3)     // Catch:{ IOException -> 0x0d9c }
            X.C25995CqB.A00()     // Catch:{ IOException -> 0x0d9c }
            r1 = 0
            X.DNc r0 = new X.DNc     // Catch:{ IOException -> 0x0d9c }
            r0.<init>(r2, r3)     // Catch:{ IOException -> 0x0d9c }
            r0.BkN()     // Catch:{ IOException -> 0x0d9c }
            X.DFL r0 = X.C25338Cdx.A01(r1, r0)     // Catch:{ IOException -> 0x0d9c }
            if (r4 == 0) goto L_0x3a01
            java.lang.String r3 = "SuccessCallback"
            X.9zJ r1 = X.C108985cd.A0K(r0)     // Catch:{ IOException -> 0x0d9c }
            r0 = 2
            X.C18070vi.A0d(r1, r0)     // Catch:{ IOException -> 0x0d9c }
            X.CCJ.A00(r1, r4, r2)     // Catch:{ Da9 -> 0x0d89 }
            goto L_0x3a01
        L_0x0d89:
            r4 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ IOException -> 0x0d9c }
            java.lang.String r0 = "Exception while executing "
            java.lang.String r3 = X.AnonymousClass001.A1H(r0, r3, r1)     // Catch:{ IOException -> 0x0d9c }
            r1 = 0
            java.lang.String r0 = "BKBloksActionBloksInflateImpl"
            X.C25913CoX.A00(r1, r0, r3, r4)     // Catch:{ IOException -> 0x0d9c }
            goto L_0x3a01
        L_0x0d9c:
            if (r5 == 0) goto L_0x3a01
            java.lang.String r4 = "FailureCallback"
            X.9zJ r0 = X.C199029zJ.A01     // Catch:{ all -> 0x1b63 }
            X.C18070vi.A0Z(r0)     // Catch:{ all -> 0x1b63 }
            X.CCJ.A00(r0, r5, r2)     // Catch:{ Da9 -> 0x0daa }
            goto L_0x3a01
        L_0x0daa:
            r3 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x1b63 }
            java.lang.String r0 = "Exception while executing "
            java.lang.String r2 = X.AnonymousClass001.A1H(r0, r4, r1)     // Catch:{ all -> 0x1b63 }
            r1 = 0
            java.lang.String r0 = "BKBloksActionBloksInflateImpl"
            X.C25913CoX.A00(r1, r0, r2, r3)     // Catch:{ all -> 0x1b63 }
            goto L_0x3a01
        L_0x0dbd:
            java.lang.String r3 = "bk.action.bloks.AppendChildren"
            boolean r3 = r5.equals(r3)     // Catch:{ all -> 0x3a16 }
            if (r3 == 0) goto L_0x39f6
            java.lang.String r4 = A0N(r0, r2)     // Catch:{ all -> 0x3a16 }
            java.lang.Object r3 = X.BE6.A0n(r0, r1)     // Catch:{ all -> 0x3a16 }
            java.lang.String r1 = "null cannot be cast to non-null type kotlin.collections.List<com.instagram.common.bloks.component.base.BloksModel>"
            java.util.List r3 = X.BE6.A13(r3, r1)     // Catch:{ all -> 0x3a16 }
            r1 = 2
            X.DOZ r0 = A06(r2, r0, r1)     // Catch:{ all -> 0x3a16 }
            X.DNk r6 = X.C26272CwJ.A01(r0)     // Catch:{ all -> 0x3a16 }
            X.DNn r2 = new X.DNn     // Catch:{ all -> 0x3a16 }
            r2.<init>(r4)     // Catch:{ all -> 0x3a16 }
            X.Boe r0 = new X.Boe     // Catch:{ all -> 0x3a16 }
            r0.<init>(r3, r1)     // Catch:{ all -> 0x3a16 }
            goto L_0x35c6
        L_0x0de8:
            java.lang.String r3 = "bk.action.bloks.ShowKeyboard"
            boolean r3 = r5.equals(r3)     // Catch:{ all -> 0x3a16 }
            if (r3 == 0) goto L_0x39f6
            java.lang.Object r3 = A0I(r0, r2)     // Catch:{ all -> 0x3a16 }
            X.DFL r3 = (X.DFL) r3     // Catch:{ all -> 0x3a16 }
            if (r3 == 0) goto L_0x2863
            X.DOZ r0 = r2.A00     // Catch:{ all -> 0x3a16 }
            android.view.View r3 = r3.A06(r0)     // Catch:{ all -> 0x3a16 }
            if (r3 == 0) goto L_0x2863
            java.lang.Object r2 = X.BE9.A0j(r3)     // Catch:{ all -> 0x3a16 }
            java.lang.String r0 = "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager"
            X.C18070vi.A0z(r2, r0)     // Catch:{ all -> 0x3a16 }
            android.view.inputmethod.InputMethodManager r2 = (android.view.inputmethod.InputMethodManager) r2     // Catch:{ all -> 0x3a16 }
            r3.requestFocus()     // Catch:{ all -> 0x3a16 }
            r2.showSoftInput(r3, r4)     // Catch:{ all -> 0x3a16 }
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r1)     // Catch:{ all -> 0x3a16 }
            goto L_0x3a10
        L_0x0e17:
            java.lang.String r3 = "bk.action.animation.linear.CreateAnimation"
            boolean r3 = r5.equals(r3)     // Catch:{ all -> 0x3a16 }
            if (r3 == 0) goto L_0x39f6
            X.C18070vi.A0d(r0, r4)     // Catch:{ all -> 0x3a16 }
            X.C18070vi.A0d(r2, r1)     // Catch:{ all -> 0x3a16 }
            X.E8A r11 = X.C25488Cgj.A00(r0, r4)     // Catch:{ all -> 0x3a16 }
            X.E8A r10 = X.C25488Cgj.A00(r0, r1)     // Catch:{ all -> 0x3a16 }
            r9 = 2
            java.lang.Object r5 = r0.A00(r9)     // Catch:{ all -> 0x3a16 }
            java.lang.String r3 = "null cannot be cast to non-null type kotlin.Number"
            X.C18070vi.A0z(r5, r3)     // Catch:{ all -> 0x3a16 }
            float r8 = X.AnonymousClass000.A04(r5)     // Catch:{ all -> 0x3a16 }
            r3 = 3
            float r7 = A01(r0, r3)     // Catch:{ all -> 0x3a16 }
            r3 = 4
            float r6 = A01(r0, r3)     // Catch:{ all -> 0x3a16 }
            android.animation.ValueAnimator r3 = new android.animation.ValueAnimator     // Catch:{ all -> 0x3a16 }
            r3.<init>()     // Catch:{ all -> 0x3a16 }
            X.9zJ r5 = X.C108985cd.A0K(r3)     // Catch:{ all -> 0x3a16 }
            X.Cxa r0 = new X.Cxa     // Catch:{ all -> 0x3a16 }
            r0.<init>(r2, r11, r5, r4)     // Catch:{ all -> 0x3a16 }
            r3.addUpdateListener(r0)     // Catch:{ all -> 0x3a16 }
            X.74T r0 = new X.74T     // Catch:{ all -> 0x3a16 }
            r0.<init>(r10, r5, r2, r4)     // Catch:{ all -> 0x3a16 }
            r3.addListener(r0)     // Catch:{ all -> 0x3a16 }
            android.view.animation.LinearInterpolator r0 = new android.view.animation.LinearInterpolator     // Catch:{ all -> 0x3a16 }
            r0.<init>()     // Catch:{ all -> 0x3a16 }
            android.animation.TimeInterpolator r0 = (android.animation.TimeInterpolator) r0     // Catch:{ all -> 0x3a16 }
            r3.setInterpolator(r0)     // Catch:{ all -> 0x3a16 }
            float[] r0 = new float[r9]     // Catch:{ all -> 0x3a16 }
            r0[r4] = r8     // Catch:{ all -> 0x3a16 }
            r0[r1] = r7     // Catch:{ all -> 0x3a16 }
            r3.setFloatValues(r0)     // Catch:{ all -> 0x3a16 }
            r0 = 1148846080(0x447a0000, float:1000.0)
            float r6 = r6 * r0
            long r0 = (long) r6     // Catch:{ all -> 0x3a16 }
            r3.setDuration(r0)     // Catch:{ all -> 0x3a16 }
            goto L_0x3a10
        L_0x0e7a:
            java.lang.String r3 = "bk.action.timer.Restart"
            boolean r3 = r5.equals(r3)     // Catch:{ all -> 0x3a16 }
            if (r3 == 0) goto L_0x39f6
            X.C18070vi.A0d(r0, r4)     // Catch:{ all -> 0x3a16 }
            X.C18070vi.A0d(r2, r1)     // Catch:{ all -> 0x3a16 }
            java.lang.String r3 = A0M(r0, r4)     // Catch:{ all -> 0x3a16 }
            X.DOZ r2 = r2.A00     // Catch:{ all -> 0x3a16 }
            if (r2 == 0) goto L_0x0ebf
            r0 = 2131428185(0x7f0b0359, float:1.8478007E38)
            java.lang.Object r0 = r2.A01(r0)     // Catch:{ all -> 0x3a16 }
            java.util.HashMap r0 = (java.util.HashMap) r0     // Catch:{ all -> 0x3a16 }
            java.lang.Object r5 = r0.get(r3)     // Catch:{ all -> 0x3a16 }
            X.CXG r5 = (X.CXG) r5     // Catch:{ all -> 0x3a16 }
            if (r5 == 0) goto L_0x3a04
            boolean r0 = r5.A00     // Catch:{ all -> 0x3a16 }
            if (r0 != 0) goto L_0x3a04
            boolean r0 = r5.A01     // Catch:{ all -> 0x3a16 }
            if (r0 != 0) goto L_0x0eb2
            r5.A01 = r1     // Catch:{ all -> 0x3a16 }
            android.os.Handler r1 = r5.A03     // Catch:{ all -> 0x3a16 }
            java.lang.Runnable r0 = r5.A05     // Catch:{ all -> 0x3a16 }
            r1.removeCallbacks(r0)     // Catch:{ all -> 0x3a16 }
        L_0x0eb2:
            r5.A01 = r4     // Catch:{ all -> 0x3a16 }
            android.os.Handler r3 = r5.A03     // Catch:{ all -> 0x3a16 }
            java.lang.Runnable r2 = r5.A05     // Catch:{ all -> 0x3a16 }
            long r0 = r5.A02     // Catch:{ all -> 0x3a16 }
            r3.postDelayed(r2, r0)     // Catch:{ all -> 0x3a16 }
            goto L_0x3a04
        L_0x0ebf:
            java.lang.IllegalStateException r0 = X.C17880vN.A0g()     // Catch:{ all -> 0x3a16 }
            throw r0     // Catch:{ all -> 0x3a16 }
        L_0x0ec4:
            java.lang.String r2 = "bk.action.string.SplitWithString"
            boolean r2 = r5.equals(r2)     // Catch:{ all -> 0x3a16 }
            if (r2 == 0) goto L_0x39f6
            X.C18070vi.A0d(r0, r4)     // Catch:{ all -> 0x3a16 }
            r6 = 0
            java.lang.Object r5 = r0.A00(r4)     // Catch:{ all -> 0x3a16 }
            java.lang.String r2 = "null cannot be cast to non-null type kotlin.String"
            X.C18070vi.A0z(r5, r2)     // Catch:{ all -> 0x3a16 }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ all -> 0x3a16 }
            java.lang.String r0 = A0L(r0, r1)     // Catch:{ all -> 0x3a16 }
            java.util.ArrayList r3 = X.AnonymousClass000.A13()     // Catch:{ all -> 0x3a16 }
            java.lang.String r1 = java.util.regex.Pattern.quote(r0)     // Catch:{ all -> 0x3a16 }
            X.C18070vi.A0X(r1)     // Catch:{ all -> 0x3a16 }
            X.1wr r0 = new X.1wr     // Catch:{ all -> 0x3a16 }
            r0.<init>((java.lang.String) r1)     // Catch:{ all -> 0x3a16 }
            java.util.List r0 = r0.A01(r5, r4)     // Catch:{ all -> 0x3a16 }
            java.lang.String[] r2 = X.C108955ca.A1b(r0)     // Catch:{ all -> 0x3a16 }
            int r1 = r2.length     // Catch:{ all -> 0x3a16 }
        L_0x0ef8:
            if (r6 >= r1) goto L_0x3a10
            r0 = r2[r6]     // Catch:{ all -> 0x3a16 }
            r3.add(r0)     // Catch:{ all -> 0x3a16 }
            int r6 = r6 + 1
            goto L_0x0ef8
        L_0x0f02:
            java.lang.String r3 = "bk.action.animated.CancelToken"
            goto L_0x1eeb
        L_0x0f06:
            java.lang.String r3 = "bk.action.vcollection.SetOffset"
            boolean r3 = r5.equals(r3)     // Catch:{ all -> 0x3a16 }
            if (r3 == 0) goto L_0x39f6
            X.DFL r6 = A0E(r0, r2)     // Catch:{ all -> 0x3a16 }
            float r5 = A00(r0, r1)     // Catch:{ all -> 0x3a16 }
            r1 = 2
            java.lang.Object r1 = r0.A00(r1)     // Catch:{ all -> 0x3a16 }
            boolean r3 = X.C25343Ce2.A01(r1)     // Catch:{ all -> 0x3a16 }
            r1 = 3
            X.ClD r2 = A05(r2, r6, r0, r1)     // Catch:{ all -> 0x3a16 }
            if (r2 == 0) goto L_0x3a04
            X.CqB r0 = X.C25995CqB.A00()     // Catch:{ all -> 0x3a16 }
            android.content.Context r0 = r0.A00     // Catch:{ all -> 0x3a16 }
            X.C18070vi.A0X(r0)     // Catch:{ all -> 0x3a16 }
            float r0 = X.C25342Ce1.A00(r0, r5)     // Catch:{ all -> 0x3a16 }
            int r1 = (int) r0     // Catch:{ all -> 0x3a16 }
            boolean r0 = X.C26176Ctu.A03()     // Catch:{ all -> 0x3a16 }
            if (r0 == 0) goto L_0x0f51
            boolean r0 = X.C26176Ctu.A03()     // Catch:{ all -> 0x3a16 }
            if (r0 == 0) goto L_0x0f4a
            X.CU5 r0 = r2.A02     // Catch:{ all -> 0x3a16 }
            int r0 = r0.A05     // Catch:{ all -> 0x3a16 }
            int r1 = r1 - r0
            r2.A00(r4, r1, r3)     // Catch:{ all -> 0x3a16 }
            goto L_0x3a04
        L_0x0f4a:
            java.lang.String r0 = "Cannot getScroll off the main thread!"
            java.lang.RuntimeException r0 = X.AnonymousClass8BR.A0w(r0)     // Catch:{ all -> 0x3a16 }
            throw r0     // Catch:{ all -> 0x3a16 }
        L_0x0f51:
            java.lang.String r0 = "setYOffset cannot be called from  a background thread!"
            java.lang.RuntimeException r0 = X.AnonymousClass8BR.A0w(r0)     // Catch:{ all -> 0x3a16 }
            throw r0     // Catch:{ all -> 0x3a16 }
        L_0x0f58:
            java.lang.String r3 = "bk.action.component.GetHeight"
            boolean r3 = r5.equals(r3)     // Catch:{ all -> 0x3a16 }
            if (r3 == 0) goto L_0x39f6
            java.lang.Object r1 = A0I(r0, r2)     // Catch:{ all -> 0x3a16 }
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.common.bloks.component.base.BloksModel"
            X.C18070vi.A0z(r1, r0)     // Catch:{ all -> 0x3a16 }
            X.DFL r1 = (X.DFL) r1     // Catch:{ all -> 0x3a16 }
            X.DOZ r0 = r2.A00     // Catch:{ all -> 0x3a16 }
            android.view.View r0 = r1.A06(r0)     // Catch:{ all -> 0x3a16 }
            if (r0 == 0) goto L_0x3a04
            int r0 = r0.getHeight()     // Catch:{ all -> 0x3a16 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x3a16 }
            goto L_0x3a10
        L_0x0f7d:
            java.lang.String r6 = "bk.action.media.LoadAlbums"
            boolean r3 = r5.equals(r6)     // Catch:{ all -> 0x3a16 }
            if (r3 == 0) goto L_0x39f6
            X.DOZ r5 = A07(r2, r0)     // Catch:{ all -> 0x3a16 }
            r3 = 0
            if (r5 == 0) goto L_0x3a10
            java.lang.String r2 = "media_store"
            r1 = 2131428169(0x7f0b0349, float:1.8477975E38)
            java.lang.Object r1 = r5.A01(r1)     // Catch:{ all -> 0x3a16 }
            java.util.Map r1 = (java.util.Map) r1     // Catch:{ all -> 0x3a16 }
            if (r1 != 0) goto L_0x0f9b
            r2 = 0
            goto L_0x0fa1
        L_0x0f9b:
            java.lang.Object r2 = r1.get(r2)     // Catch:{ all -> 0x3a16 }
            X.CVW r2 = (X.CVW) r2     // Catch:{ all -> 0x3a16 }
        L_0x0fa1:
            boolean r1 = r2 instanceof com.bloks.stdlib.datamodules.mediastore.MediaStoreDataModule     // Catch:{ all -> 0x3a16 }
            if (r1 == 0) goto L_0x0fb2
            com.bloks.stdlib.datamodules.mediastore.MediaStoreDataModule r2 = (com.bloks.stdlib.datamodules.mediastore.MediaStoreDataModule) r2     // Catch:{ all -> 0x3a16 }
            if (r2 == 0) goto L_0x0fb2
            java.lang.String r0 = A0M(r0, r4)     // Catch:{ all -> 0x3a16 }
            r2.loadAlbums(r5, r0)     // Catch:{ all -> 0x3a16 }
            goto L_0x3a10
        L_0x0fb2:
            java.lang.String r0 = "Failed to load albums: MediaStore data module is not found."
            X.C25913CoX.A01(r6, r0)     // Catch:{ all -> 0x3a16 }
            goto L_0x3a10
        L_0x0fb9:
            java.lang.String r3 = "bk.action.bloks.GetVariable2"
            boolean r3 = r5.equals(r3)     // Catch:{ all -> 0x3a16 }
            if (r3 == 0) goto L_0x39f6
            java.lang.Object r0 = A0I(r0, r2)     // Catch:{ all -> 0x3a16 }
            X.AnonymousClass8BR.A1I(r0)     // Catch:{ all -> 0x3a16 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x3a16 }
            java.lang.Object r3 = X.C25881Cns.A02(r2, r0)     // Catch:{ all -> 0x3a16 }
            goto L_0x3a10
        L_0x0fd0:
            java.lang.String r3 = "bk.action.vcollection.GetOffset"
            boolean r3 = r5.equals(r3)     // Catch:{ all -> 0x3a16 }
            if (r3 == 0) goto L_0x39f6
            X.DFL r3 = A0E(r0, r2)     // Catch:{ all -> 0x3a16 }
            X.ClD r2 = A05(r2, r3, r0, r1)     // Catch:{ all -> 0x3a16 }
            if (r2 == 0) goto L_0x3a04
            X.CqB r0 = X.C25995CqB.A00()     // Catch:{ all -> 0x3a16 }
            android.content.Context r1 = r0.A00     // Catch:{ all -> 0x3a16 }
            X.C18070vi.A0X(r1)     // Catch:{ all -> 0x3a16 }
            boolean r0 = X.C26176Ctu.A03()     // Catch:{ all -> 0x3a16 }
            if (r0 == 0) goto L_0x1001
            X.CU5 r0 = r2.A02     // Catch:{ all -> 0x3a16 }
            int r0 = r0.A05     // Catch:{ all -> 0x3a16 }
            float r0 = (float) r0     // Catch:{ all -> 0x3a16 }
            float r0 = X.C25342Ce1.A01(r1, r0)     // Catch:{ all -> 0x3a16 }
            int r0 = (int) r0     // Catch:{ all -> 0x3a16 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x3a16 }
            goto L_0x3a10
        L_0x1001:
            java.lang.String r0 = "Cannot getScroll off the main thread!"
            java.lang.RuntimeException r0 = X.AnonymousClass8BR.A0w(r0)     // Catch:{ all -> 0x3a16 }
            throw r0     // Catch:{ all -> 0x3a16 }
        L_0x1008:
            java.lang.String r2 = "bk.action.bloks.ChildAtIndex"
            boolean r2 = r5.equals(r2)     // Catch:{ all -> 0x3a16 }
            if (r2 == 0) goto L_0x39f6
            X.C18070vi.A0d(r0, r4)     // Catch:{ all -> 0x3a16 }
            java.util.List r3 = r0.A00     // Catch:{ all -> 0x3a16 }
            java.lang.Object r2 = r3.get(r4)     // Catch:{ all -> 0x3a16 }
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.common.bloks.component.base.BloksModel"
            X.C18070vi.A0z(r2, r0)     // Catch:{ all -> 0x3a16 }
            X.DFL r2 = (X.DFL) r2     // Catch:{ all -> 0x3a16 }
            java.lang.Object r1 = r3.get(r1)     // Catch:{ all -> 0x3a16 }
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.Number"
            X.C18070vi.A0z(r1, r0)     // Catch:{ all -> 0x3a16 }
            int r1 = X.AnonymousClass000.A0M(r1)     // Catch:{ all -> 0x3a16 }
            java.util.List r0 = r2.A0E()     // Catch:{ all -> 0x3a16 }
            java.lang.Object r3 = r0.get(r1)     // Catch:{ all -> 0x3a16 }
            goto L_0x3a10
        L_0x1037:
            java.lang.String r3 = "bk.action.bloks.OneTimeBind"
            boolean r3 = r5.equals(r3)     // Catch:{ all -> 0x3a16 }
            if (r3 == 0) goto L_0x39f6
            java.lang.Object r1 = A0I(r0, r2)     // Catch:{ all -> 0x3a16 }
            X.DFL r1 = (X.DFL) r1     // Catch:{ all -> 0x3a16 }
            if (r1 == 0) goto L_0x3a04
            X.DOZ r0 = r2.A00     // Catch:{ all -> 0x3a16 }
            if (r0 == 0) goto L_0x1051
            X.DFL r3 = X.CBy.A00(r0, r2, r1)     // Catch:{ all -> 0x3a16 }
            goto L_0x3a10
        L_0x1051:
            java.lang.IllegalStateException r0 = X.C17880vN.A0g()     // Catch:{ all -> 0x3a16 }
            throw r0     // Catch:{ all -> 0x3a16 }
        L_0x1056:
            java.lang.String r2 = "bk.action.string.Trim"
            boolean r2 = r5.equals(r2)     // Catch:{ all -> 0x3a16 }
            if (r2 == 0) goto L_0x39f6
            X.C18070vi.A0d(r0, r4)     // Catch:{ all -> 0x3a16 }
            java.lang.String r0 = A0M(r0, r4)     // Catch:{ all -> 0x3a16 }
            java.lang.String r3 = X.AnonymousClass1YF.A0I(r0)     // Catch:{ all -> 0x3a16 }
            goto L_0x3a10
        L_0x106b:
            java.lang.String r3 = "bk.action.collection.ScrollToIndexById"
            boolean r3 = r5.equals(r3)     // Catch:{ all -> 0x3a16 }
            if (r3 == 0) goto L_0x39f6
            java.lang.Object r6 = A0H(r0, r2)     // Catch:{ all -> 0x3a16 }
            java.lang.String r3 = "null cannot be cast to non-null type com.instagram.common.bloks.component.base.BloksModel"
            X.C18070vi.A0z(r6, r3)     // Catch:{ all -> 0x3a16 }
            X.DFL r6 = (X.DFL) r6     // Catch:{ all -> 0x3a16 }
            java.lang.Object r5 = r0.A00(r1)     // Catch:{ all -> 0x3a16 }
            X.C18070vi.A0z(r5, r3)     // Catch:{ all -> 0x3a16 }
            X.DFL r5 = (X.DFL) r5     // Catch:{ all -> 0x3a16 }
            r3 = 2
            X.ClD r10 = A05(r2, r6, r0, r3)     // Catch:{ all -> 0x3a16 }
            r0 = 36
            java.lang.Object r6 = X.DFL.A00(r5, r0)     // Catch:{ all -> 0x3a16 }
            boolean r0 = r6 instanceof java.lang.String     // Catch:{ all -> 0x3a16 }
            r3 = 0
            if (r0 == 0) goto L_0x109b
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ all -> 0x3a16 }
            if (r6 != 0) goto L_0x10a5
        L_0x109b:
            r0 = 36
            java.lang.Object r0 = X.DFL.A00(r5, r0)     // Catch:{ all -> 0x3a16 }
            java.lang.String r6 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x3a16 }
        L_0x10a5:
            if (r10 == 0) goto L_0x3a10
            java.lang.String r9 = X.BE7.A0d(r5)     // Catch:{ all -> 0x3a16 }
            r0 = 38
            boolean r8 = r5.A0I(r0, r1)     // Catch:{ all -> 0x3a16 }
            java.lang.String r11 = X.BE7.A0g(r5)     // Catch:{ all -> 0x3a16 }
            boolean r0 = X.C26176Ctu.A03()     // Catch:{ all -> 0x3a16 }
            if (r0 == 0) goto L_0x1164
            X.BVF r0 = r10.A01     // Catch:{ all -> 0x3a16 }
            java.util.List r5 = r0.A03     // Catch:{ all -> 0x3a16 }
            int r2 = r5.size()     // Catch:{ all -> 0x3a16 }
            r7 = 0
        L_0x10c4:
            if (r7 >= r2) goto L_0x3a10
            java.lang.Object r0 = r5.get(r7)     // Catch:{ all -> 0x3a16 }
            X.DFE r0 = (X.DFE) r0     // Catch:{ all -> 0x3a16 }
            X.DFL r0 = r0.A01     // Catch:{ all -> 0x3a16 }
            java.lang.String r0 = r0.A0C()     // Catch:{ all -> 0x3a16 }
            if (r0 == 0) goto L_0x10db
            boolean r0 = r0.equals(r6)     // Catch:{ all -> 0x3a16 }
            if (r0 == 0) goto L_0x10db
            goto L_0x10de
        L_0x10db:
            int r7 = r7 + 1
            goto L_0x10c4
        L_0x10de:
            if (r7 < 0) goto L_0x3a10
            r6 = 0
            if (r11 == 0) goto L_0x10f0
            boolean r0 = X.BE6.A1V(r11)     // Catch:{ all -> 0x3a16 }
            java.lang.String r2 = "CollectionBinderUtils"
            if (r0 == 0) goto L_0x1110
            java.lang.String r0 = "Offsets defined as a percentage value are not supported"
            X.C25913CoX.A01(r2, r0)     // Catch:{ all -> 0x3a16 }
        L_0x10f0:
            X.CU5 r5 = r10.A02     // Catch:{ all -> 0x3a16 }
            androidx.recyclerview.widget.RecyclerView r2 = r5.A07     // Catch:{ all -> 0x3a16 }
            if (r2 == 0) goto L_0x1156
            X.BLm r0 = r10.A00     // Catch:{ all -> 0x3a16 }
            if (r0 != 0) goto L_0x110b
            android.content.Context r2 = r2.getContext()     // Catch:{ all -> 0x3a16 }
            X.BLm r0 = new X.BLm     // Catch:{ all -> 0x3a16 }
            r0.<init>(r2)     // Catch:{ all -> 0x3a16 }
            r0.A00 = r4     // Catch:{ all -> 0x3a16 }
            r0.A03 = r1     // Catch:{ all -> 0x3a16 }
            r0.A01 = r4     // Catch:{ all -> 0x3a16 }
            r10.A00 = r0     // Catch:{ all -> 0x3a16 }
        L_0x110b:
            X.BM9 r4 = r10.A05     // Catch:{ all -> 0x3a16 }
            if (r4 == 0) goto L_0x1125
            goto L_0x111c
        L_0x1110:
            float r0 = X.A90.A01(r11)     // Catch:{ 9HX -> 0x1116 }
            int r6 = (int) r0     // Catch:{ 9HX -> 0x1116 }
            goto L_0x10f0
        L_0x1116:
            java.lang.String r0 = "Error parsing offset when scrolling to index"
            X.C25913CoX.A01(r2, r0)     // Catch:{ all -> 0x3a16 }
            goto L_0x10f0
        L_0x111c:
            if (r6 == 0) goto L_0x1125
            java.lang.Integer r0 = r10.A07     // Catch:{ all -> 0x3a16 }
            if (r0 == 0) goto L_0x1125
            if (r9 == 0) goto L_0x1125
            goto L_0x1127
        L_0x1125:
            r2 = 0
            goto L_0x113c
        L_0x1127:
            java.lang.String r0 = X.CCH.A00(r0)     // Catch:{ all -> 0x3a16 }
            boolean r0 = r0.equalsIgnoreCase(r9)     // Catch:{ all -> 0x3a16 }
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x1125
            X.BLm r1 = r10.A00     // Catch:{ all -> 0x3a16 }
            androidx.recyclerview.widget.RecyclerView r0 = r5.A07     // Catch:{ all -> 0x3a16 }
            X.CP3 r2 = new X.CP3     // Catch:{ all -> 0x3a16 }
            r2.<init>(r0, r4, r1)     // Catch:{ all -> 0x3a16 }
        L_0x113c:
            X.BLm r1 = r10.A00     // Catch:{ all -> 0x3a16 }
            r1.A02 = r2     // Catch:{ all -> 0x3a16 }
            r1.A0D(r9)     // Catch:{ all -> 0x3a16 }
            r1.A00 = r6     // Catch:{ all -> 0x3a16 }
            r1.A03 = r8     // Catch:{ all -> 0x3a16 }
            r1.A00 = r7     // Catch:{ all -> 0x3a16 }
            androidx.recyclerview.widget.RecyclerView r0 = r5.A07     // Catch:{ all -> 0x3a16 }
            X.1qy r0 = r0.getLayoutManager()     // Catch:{ all -> 0x3a16 }
            if (r0 == 0) goto L_0x3a10
            r0.A0e(r1)     // Catch:{ all -> 0x3a16 }
            goto L_0x3a10
        L_0x1156:
            r5.A00 = r7     // Catch:{ all -> 0x3a16 }
            if (r9 != 0) goto L_0x115c
            java.lang.String r9 = ""
        L_0x115c:
            r5.A08 = r9     // Catch:{ all -> 0x3a16 }
            r5.A03 = r6     // Catch:{ all -> 0x3a16 }
            r5.A0B = r8     // Catch:{ all -> 0x3a16 }
            goto L_0x3a10
        L_0x1164:
            java.lang.String r0 = "scrollToIndexById cannot be called from a background thread."
            java.lang.RuntimeException r0 = X.AnonymousClass8BR.A0w(r0)     // Catch:{ all -> 0x3a16 }
            throw r0     // Catch:{ all -> 0x3a16 }
        L_0x116b:
            java.lang.String r2 = "bk.action.ttrc.NetworkContentDisplayed"
            boolean r2 = r5.equals(r2)     // Catch:{ all -> 0x3a16 }
            if (r2 == 0) goto L_0x39f6
            X.C18070vi.A0d(r0, r4)     // Catch:{ all -> 0x3a16 }
            int r3 = A02(r0, r4)     // Catch:{ all -> 0x3a16 }
            java.lang.String r2 = X.AnonymousClass8BT.A0t(r0, r1)     // Catch:{ all -> 0x3a16 }
            r1 = 2
            java.lang.String r1 = A0M(r0, r1)     // Catch:{ all -> 0x3a16 }
            r0 = 2
            X.C18070vi.A0d(r1, r0)     // Catch:{ all -> 0x3a16 }
            X.A8s r0 = X.A7e.A00(r2, r3)     // Catch:{ all -> 0x3a16 }
            if (r0 == 0) goto L_0x3a04
            r0.A0G(r1)     // Catch:{ all -> 0x3a16 }
            goto L_0x3a04
        L_0x1192:
            java.lang.String r3 = "bk.action.accessibility.SetFocus"
            boolean r3 = r5.equals(r3)     // Catch:{ all -> 0x3a16 }
            if (r3 == 0) goto L_0x39f6
            java.lang.Object r1 = A0I(r0, r2)     // Catch:{ all -> 0x3a16 }
            X.DFL r1 = (X.DFL) r1     // Catch:{ all -> 0x3a16 }
            r3 = 0
            if (r1 == 0) goto L_0x3a10
            X.DOZ r0 = r2.A00     // Catch:{ all -> 0x3a16 }
            android.view.View r1 = r1.A06(r0)     // Catch:{ all -> 0x3a16 }
            if (r1 == 0) goto L_0x3a10
            r0 = 8
            r1.sendAccessibilityEvent(r0)     // Catch:{ all -> 0x3a16 }
            goto L_0x3a10
        L_0x11b2:
            java.lang.String r3 = "bk.action.animated.Stagger"
            boolean r3 = r5.equals(r3)     // Catch:{ all -> 0x3a16 }
            if (r3 == 0) goto L_0x39f6
            X.DOZ r7 = A07(r2, r0)     // Catch:{ all -> 0x3a16 }
            if (r7 == 0) goto L_0x3a04
            float r4 = A00(r0, r4)     // Catch:{ all -> 0x3a16 }
            java.lang.Object r2 = r0.A00(r1)     // Catch:{ all -> 0x3a16 }
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.collections.List<android.animation.Animator>"
            java.util.List r8 = X.BE6.A13(r2, r0)     // Catch:{ all -> 0x3a16 }
            long r2 = X.C26258Cw3.A00     // Catch:{ all -> 0x3a16 }
            float r0 = (float) r2     // Catch:{ all -> 0x3a16 }
            float r4 = r4 * r0
            long r4 = (long) r4     // Catch:{ all -> 0x3a16 }
            X.C18070vi.A0d(r8, r1)     // Catch:{ all -> 0x3a16 }
            A0Q(r7, r8)     // Catch:{ all -> 0x3a16 }
            int r0 = r8.size()     // Catch:{ all -> 0x3a16 }
            if (r0 == r1) goto L_0x3552
            java.util.Iterator r6 = r8.iterator()     // Catch:{ all -> 0x3a16 }
            r1 = 0
        L_0x11e4:
            boolean r0 = r6.hasNext()     // Catch:{ all -> 0x3a16 }
            if (r0 == 0) goto L_0x1203
            java.lang.Object r3 = r6.next()     // Catch:{ all -> 0x3a16 }
            int r2 = r1 + 1
            if (r1 >= 0) goto L_0x11f7
            X.AnonymousClass1ZU.A0B()     // Catch:{ all -> 0x3a16 }
            r0 = 0
            throw r0     // Catch:{ all -> 0x3a16 }
        L_0x11f7:
            android.animation.Animator r3 = (android.animation.Animator) r3     // Catch:{ all -> 0x3a16 }
            X.C26272CwJ.A05(r3, r7)     // Catch:{ all -> 0x3a16 }
            long r0 = (long) r1     // Catch:{ all -> 0x3a16 }
            long r0 = r0 * r4
            X.C26258Cw3.A03(r3, r0)     // Catch:{ all -> 0x3a16 }
            r1 = r2
            goto L_0x11e4
        L_0x1203:
            java.lang.Integer r0 = X.AnonymousClass00R.A0C     // Catch:{ all -> 0x3a16 }
            goto L_0x3559
        L_0x1207:
            java.lang.String r2 = "bk.action.ttrc.MarkerStart"
            boolean r2 = r5.equals(r2)     // Catch:{ all -> 0x3a16 }
            if (r2 == 0) goto L_0x39f6
            X.C18070vi.A0d(r0, r4)     // Catch:{ all -> 0x3a16 }
            int r4 = A02(r0, r4)     // Catch:{ all -> 0x3a16 }
            java.lang.String r3 = A0M(r0, r1)     // Catch:{ all -> 0x3a16 }
            r1 = 2
            java.lang.Object r1 = r0.A00(r1)     // Catch:{ all -> 0x3a16 }
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.Long"
            X.C18070vi.A0z(r1, r0)     // Catch:{ all -> 0x3a16 }
            X.CqB r0 = X.C25995CqB.A00()     // Catch:{ all -> 0x3a16 }
            X.9me r2 = r0.A09     // Catch:{ all -> 0x3a16 }
            if (r2 == 0) goto L_0x1240
            if (r3 == 0) goto L_0x3a04
            int r1 = java.lang.Integer.parseInt(r3)     // Catch:{ NumberFormatException -> 0x1238 }
            r0 = 0
            r2.A00(r0, r4, r1)     // Catch:{ NumberFormatException -> 0x1238 }
            goto L_0x3a04
        L_0x1238:
            r1 = move-exception
            java.lang.String r0 = "BloksTTRCFunctionsUtil"
            X.C25913CoX.A02(r0, r1)     // Catch:{ all -> 0x3a16 }
            goto L_0x3a04
        L_0x1240:
            java.lang.String r0 = "TTRC Logger not configured as part of Bloks initialization in your app."
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0n(r0)     // Catch:{ all -> 0x3a16 }
            throw r0     // Catch:{ all -> 0x3a16 }
        L_0x1247:
            java.lang.String r3 = "bk.action.core.Delay"
            boolean r3 = r5.equals(r3)     // Catch:{ all -> 0x3a16 }
            if (r3 == 0) goto L_0x39f6
            java.lang.Object r4 = A0H(r0, r2)     // Catch:{ all -> 0x3a16 }
            java.lang.String r3 = "null cannot be cast to non-null type kotlin.Number"
            X.C18070vi.A0z(r4, r3)     // Catch:{ all -> 0x3a16 }
            long r3 = X.C17880vN.A05(r4)     // Catch:{ all -> 0x3a16 }
            X.E8A r7 = X.C25488Cgj.A00(r0, r1)     // Catch:{ all -> 0x3a16 }
            r1 = 2
            X.DOZ r6 = A06(r2, r0, r1)     // Catch:{ all -> 0x3a16 }
            android.os.Handler r5 = X.C17890vO.A0D()     // Catch:{ all -> 0x3a16 }
            r1 = 12
            X.DTg r0 = new X.DTg     // Catch:{ all -> 0x3a16 }
            r0.<init>(r7, r6, r2, r1)     // Catch:{ all -> 0x3a16 }
            r5.postDelayed(r0, r3)     // Catch:{ all -> 0x3a16 }
            goto L_0x3a04
        L_0x1275:
            java.lang.String r3 = "bk.action.timer.Start"
            boolean r3 = r5.equals(r3)     // Catch:{ all -> 0x3a16 }
            if (r3 == 0) goto L_0x39f6
            X.C18070vi.A0d(r0, r4)     // Catch:{ all -> 0x3a16 }
            X.C18070vi.A0d(r2, r1)     // Catch:{ all -> 0x3a16 }
            java.lang.Object r5 = r0.A00(r1)     // Catch:{ all -> 0x3a16 }
            java.lang.String r3 = "null cannot be cast to non-null type kotlin.Number"
            X.C18070vi.A0z(r5, r3)     // Catch:{ all -> 0x3a16 }
            long r5 = X.C17880vN.A05(r5)     // Catch:{ all -> 0x3a16 }
            r3 = 2
            java.lang.Object r3 = r0.A00(r3)     // Catch:{ all -> 0x3a16 }
            boolean r9 = X.C25343Ce2.A01(r3)     // Catch:{ all -> 0x3a16 }
            r3 = 3
            X.E8A r7 = X.C25488Cgj.A00(r0, r3)     // Catch:{ all -> 0x3a16 }
            r3 = 4
            java.lang.String r3 = A0M(r0, r3)     // Catch:{ all -> 0x3a16 }
            X.DOZ r8 = r2.A00     // Catch:{ all -> 0x3a16 }
            if (r8 == 0) goto L_0x12f3
            X.C18070vi.A0d(r3, r1)     // Catch:{ all -> 0x3a16 }
            java.lang.ref.WeakReference r1 = X.AnonymousClass3MW.A0z(r8)     // Catch:{ all -> 0x3a16 }
            X.CR0 r0 = new X.CR0     // Catch:{ all -> 0x3a16 }
            r0.<init>(r2, r7, r3, r1)     // Catch:{ all -> 0x3a16 }
            X.CXG r7 = new X.CXG     // Catch:{ all -> 0x3a16 }
            r7.<init>(r0, r5, r9)     // Catch:{ all -> 0x3a16 }
            r7.A01 = r4     // Catch:{ all -> 0x3a16 }
            android.os.Handler r4 = r7.A03     // Catch:{ all -> 0x3a16 }
            java.lang.Runnable r2 = r7.A05     // Catch:{ all -> 0x3a16 }
            long r0 = r7.A02     // Catch:{ all -> 0x3a16 }
            r4.postDelayed(r2, r0)     // Catch:{ all -> 0x3a16 }
            r0 = 2131428185(0x7f0b0359, float:1.8478007E38)
            java.lang.Object r2 = r8.A01(r0)     // Catch:{ all -> 0x3a16 }
            java.util.HashMap r2 = (java.util.HashMap) r2     // Catch:{ all -> 0x3a16 }
            java.lang.Object r0 = r2.get(r3)     // Catch:{ all -> 0x3a16 }
            X.CXG r0 = (X.CXG) r0     // Catch:{ all -> 0x3a16 }
            if (r0 == 0) goto L_0x12ee
            r0.A00()     // Catch:{ all -> 0x3a16 }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x3a16 }
            java.lang.String r0 = "Timer with id "
            r1.append(r0)     // Catch:{ all -> 0x3a16 }
            r1.append(r3)     // Catch:{ all -> 0x3a16 }
            java.lang.String r0 = " already exists. Overwriting previous timer."
            java.lang.String r1 = X.AnonymousClass000.A0y(r0, r1)     // Catch:{ all -> 0x3a16 }
            java.lang.String r0 = "BloksTimer"
            X.C25913CoX.A01(r0, r1)     // Catch:{ all -> 0x3a16 }
        L_0x12ee:
            r2.put(r3, r7)     // Catch:{ all -> 0x3a16 }
            goto L_0x3a04
        L_0x12f3:
            java.lang.IllegalStateException r0 = X.C17880vN.A0g()     // Catch:{ all -> 0x3a16 }
            throw r0     // Catch:{ all -> 0x3a16 }
        L_0x12f8:
            java.lang.String r3 = "bk.action.collection.GetVisibleCollectionItemAt"
            boolean r3 = r5.equals(r3)     // Catch:{ all -> 0x3a16 }
            if (r3 == 0) goto L_0x39f6
            java.lang.Object r5 = A0H(r0, r2)     // Catch:{ all -> 0x3a16 }
            X.C18070vi.A0X(r5)     // Catch:{ all -> 0x3a16 }
            X.DFL r5 = (X.DFL) r5     // Catch:{ all -> 0x3a16 }
            java.util.List r3 = r0.A00     // Catch:{ all -> 0x3a16 }
            java.lang.String r4 = X.C17880vN.A0w(r3, r1)     // Catch:{ all -> 0x3a16 }
            r0 = 2
            java.lang.String r6 = X.C17880vN.A0w(r3, r0)     // Catch:{ all -> 0x3a16 }
            if (r6 != 0) goto L_0x1318
            java.lang.String r6 = "start"
        L_0x1318:
            X.DOZ r0 = r2.A00     // Catch:{ all -> 0x3a16 }
            if (r0 == 0) goto L_0x14b7
            java.util.LinkedHashMap r3 = X.C17880vN.A13()     // Catch:{ all -> 0x3a16 }
            java.lang.Object r7 = X.C26272CwJ.A04(r0, r5)     // Catch:{ all -> 0x3a16 }
            X.ClD r7 = (X.C25743ClD) r7     // Catch:{ all -> 0x3a16 }
            if (r7 == 0) goto L_0x3a10
            java.util.HashMap r3 = X.C17880vN.A11()     // Catch:{ all -> 0x3a16 }
            X.CU5 r0 = r7.A02     // Catch:{ all -> 0x3a16 }
            androidx.recyclerview.widget.RecyclerView r1 = r0.A07     // Catch:{ all -> 0x3a16 }
            if (r1 == 0) goto L_0x3a10
            X.1qy r5 = r1.getLayoutManager()     // Catch:{ all -> 0x3a16 }
            if (r5 == 0) goto L_0x3a10
            boolean r9 = r5 instanceof androidx.recyclerview.widget.LinearLayoutManager     // Catch:{ all -> 0x3a16 }
            r14 = 0
            if (r9 == 0) goto L_0x1343
            r0 = r5
            androidx.recyclerview.widget.LinearLayoutManager r0 = (androidx.recyclerview.widget.LinearLayoutManager) r0     // Catch:{ all -> 0x3a16 }
            int r0 = r0.A01     // Catch:{ all -> 0x3a16 }
            goto L_0x134c
        L_0x1343:
            boolean r0 = r5 instanceof androidx.recyclerview.widget.StaggeredGridLayoutManager     // Catch:{ all -> 0x3a16 }
            if (r0 == 0) goto L_0x134e
            r0 = r5
            androidx.recyclerview.widget.StaggeredGridLayoutManager r0 = (androidx.recyclerview.widget.StaggeredGridLayoutManager) r0     // Catch:{ all -> 0x3a16 }
            int r0 = r0.A02     // Catch:{ all -> 0x3a16 }
        L_0x134c:
            if (r0 != 0) goto L_0x134f
        L_0x134e:
            r14 = 1
        L_0x134f:
            androidx.recyclerview.widget.RecyclerView r0 = r5.A07     // Catch:{ all -> 0x3a16 }
            int r0 = r0.getLayoutDirection()     // Catch:{ all -> 0x3a16 }
            boolean r13 = X.AnonymousClass000.A1P(r0)
            if (r4 == 0) goto L_0x1398
            if (r14 == 0) goto L_0x1362
            int r2 = r1.getWidth()     // Catch:{ 9HX -> 0x1391 }
            goto L_0x1366
        L_0x1362:
            int r2 = r1.getHeight()     // Catch:{ 9HX -> 0x1391 }
        L_0x1366:
            boolean r0 = X.BE6.A1V(r4)     // Catch:{ 9HX -> 0x1391 }
            if (r0 == 0) goto L_0x1388
            float r1 = X.A90.A00(r4)     // Catch:{ 9HX -> 0x1391 }
            float r0 = (float) r2
            float r1 = X.BE7.A01(r0, r1)
        L_0x1375:
            r0 = 0
            float r0 = java.lang.Math.max(r0, r1)     // Catch:{ 9HX -> 0x1391 }
            float r2 = (float) r2     // Catch:{ 9HX -> 0x1391 }
            float r1 = java.lang.Math.min(r2, r0)     // Catch:{ 9HX -> 0x1391 }
            java.lang.String r0 = "end"
            boolean r0 = r6.equals(r0)     // Catch:{ 9HX -> 0x1391 }
            if (r0 == 0) goto L_0x138f
            goto L_0x138d
        L_0x1388:
            float r1 = X.A90.A01(r4)     // Catch:{ 9HX -> 0x1391 }
            goto L_0x1375
        L_0x138d:
            float r1 = r2 - r1
        L_0x138f:
            int r8 = (int) r1     // Catch:{ 9HX -> 0x1391 }
            goto L_0x1399
        L_0x1391:
            java.lang.String r1 = "CollectionBinderUtils"
            java.lang.String r0 = "Error parsing offset"
            X.C25913CoX.A01(r1, r0)     // Catch:{ all -> 0x3a16 }
        L_0x1398:
            r8 = 0
        L_0x1399:
            boolean r1 = r5 instanceof androidx.recyclerview.widget.GridLayoutManager     // Catch:{ all -> 0x3a16 }
            if (r1 != 0) goto L_0x13a7
            if (r9 == 0) goto L_0x13a7
            r0 = r5
            androidx.recyclerview.widget.LinearLayoutManager r0 = (androidx.recyclerview.widget.LinearLayoutManager) r0     // Catch:{ all -> 0x3a16 }
            int r4 = r0.A1O()     // Catch:{ all -> 0x3a16 }
            goto L_0x13a8
        L_0x13a7:
            r4 = -1
        L_0x13a8:
            if (r1 != 0) goto L_0x13b4
            if (r9 == 0) goto L_0x13b4
            r0 = r5
            androidx.recyclerview.widget.LinearLayoutManager r0 = (androidx.recyclerview.widget.LinearLayoutManager) r0     // Catch:{ all -> 0x3a16 }
            int r2 = r0.A1Q()     // Catch:{ all -> 0x3a16 }
            goto L_0x13b5
        L_0x13b4:
            r2 = -1
        L_0x13b5:
            r0 = -1
            if (r4 == r0) goto L_0x3a10
            if (r2 == r0) goto L_0x3a10
            java.lang.String r0 = "end"
            boolean r12 = r6.equals(r0)     // Catch:{ all -> 0x3a16 }
            r6 = r4
            if (r12 == 0) goto L_0x13c4
            r6 = r2
        L_0x13c4:
            android.view.View r10 = r5.A0j(r6)     // Catch:{ all -> 0x3a16 }
            android.view.ViewGroup$MarginLayoutParams r9 = X.C25743ClD.A09     // Catch:{ all -> 0x3a16 }
            r15 = r9
        L_0x13cb:
            if (r10 == 0) goto L_0x142b
            if (r6 < r4) goto L_0x142b
            if (r6 > r2) goto L_0x142b
            android.view.ViewGroup$LayoutParams r0 = r10.getLayoutParams()     // Catch:{ all -> 0x3a16 }
            boolean r0 = r0 instanceof android.view.ViewGroup.MarginLayoutParams     // Catch:{ all -> 0x3a16 }
            if (r0 == 0) goto L_0x13de
            android.view.ViewGroup$MarginLayoutParams r9 = X.AnonymousClass3MW.A0B(r10)     // Catch:{ all -> 0x3a16 }
            goto L_0x13df
        L_0x13de:
            r9 = r15
        L_0x13df:
            r11 = 1
            if (r14 == 0) goto L_0x1408
            if (r13 == 0) goto L_0x13f4
            int r1 = r10.getLeft()     // Catch:{ all -> 0x3a16 }
            int r0 = r9.getMarginStart()     // Catch:{ all -> 0x3a16 }
            int r1 = r1 - r0
            if (r1 > r8) goto L_0x1418
            int r1 = r10.getRight()     // Catch:{ all -> 0x3a16 }
            goto L_0x1403
        L_0x13f4:
            int r1 = r10.getRight()     // Catch:{ all -> 0x3a16 }
            int r0 = r9.getMarginStart()     // Catch:{ all -> 0x3a16 }
            int r1 = r1 - r0
            if (r1 > r8) goto L_0x1418
            int r1 = r10.getLeft()     // Catch:{ all -> 0x3a16 }
        L_0x1403:
            int r0 = r9.getMarginEnd()     // Catch:{ all -> 0x3a16 }
            goto L_0x141a
        L_0x1408:
            int r1 = r10.getTop()     // Catch:{ all -> 0x3a16 }
            int r0 = r9.topMargin     // Catch:{ all -> 0x3a16 }
            int r1 = r1 - r0
            if (r1 > r8) goto L_0x1418
            int r1 = r10.getBottom()     // Catch:{ all -> 0x3a16 }
            int r0 = r9.bottomMargin     // Catch:{ all -> 0x3a16 }
            goto L_0x141a
        L_0x1418:
            r11 = 0
            goto L_0x141d
        L_0x141a:
            int r1 = r1 + r0
            if (r1 < r8) goto L_0x1418
        L_0x141d:
            if (r11 != 0) goto L_0x142b
            if (r12 == 0) goto L_0x1424
            int r6 = r6 + -1
            goto L_0x1426
        L_0x1424:
            int r6 = r6 + 1
        L_0x1426:
            android.view.View r10 = r5.A0j(r6)     // Catch:{ all -> 0x3a16 }
            goto L_0x13cb
        L_0x142b:
            if (r10 == 0) goto L_0x3a10
            int r5 = r10.getWidth()     // Catch:{ all -> 0x3a16 }
            int r0 = r9.getMarginStart()     // Catch:{ all -> 0x3a16 }
            int r5 = r5 + r0
            int r0 = r9.getMarginEnd()     // Catch:{ all -> 0x3a16 }
            int r5 = r5 + r0
            int r4 = X.BE9.A09(r10, r9)     // Catch:{ all -> 0x3a16 }
            if (r14 == 0) goto L_0x1463
            if (r13 == 0) goto L_0x144c
            int r2 = r10.getLeft()     // Catch:{ all -> 0x3a16 }
            int r1 = r10.getRight()     // Catch:{ all -> 0x3a16 }
            goto L_0x1454
        L_0x144c:
            int r2 = r10.getRight()     // Catch:{ all -> 0x3a16 }
            int r1 = r10.getLeft()     // Catch:{ all -> 0x3a16 }
        L_0x1454:
            if (r12 == 0) goto L_0x145b
            int r0 = r9.leftMargin     // Catch:{ all -> 0x3a16 }
            int r2 = r2 + r0
            int r8 = r8 - r2
            goto L_0x1477
        L_0x145b:
            int r0 = r9.getMarginEnd()     // Catch:{ all -> 0x3a16 }
            int r1 = r1 + r0
            int r8 = r1 - r8
            goto L_0x1477
        L_0x1463:
            if (r12 == 0) goto L_0x146e
            int r1 = r10.getTop()     // Catch:{ all -> 0x3a16 }
            int r0 = r9.topMargin     // Catch:{ all -> 0x3a16 }
            int r1 = r1 + r0
            int r8 = r8 - r1
            goto L_0x1477
        L_0x146e:
            int r1 = r10.getBottom()     // Catch:{ all -> 0x3a16 }
            int r0 = r9.bottomMargin     // Catch:{ all -> 0x3a16 }
            int r1 = r1 + r0
            int r1 = r1 - r8
            r8 = r1
        L_0x1477:
            r2 = 1065353216(0x3f800000, float:1.0)
            float r1 = (float) r8     // Catch:{ all -> 0x3a16 }
            float r0 = (float) r4     // Catch:{ all -> 0x3a16 }
            if (r14 == 0) goto L_0x147e
            float r0 = (float) r5     // Catch:{ all -> 0x3a16 }
        L_0x147e:
            float r1 = r1 / r0
            float r2 = r2 - r1
            X.BVF r0 = r7.A01     // Catch:{ all -> 0x3a16 }
            java.util.List r1 = r0.A03     // Catch:{ all -> 0x3a16 }
            if (r6 < 0) goto L_0x1499
            int r0 = r1.size()     // Catch:{ all -> 0x3a16 }
            if (r6 >= r0) goto L_0x1499
            java.lang.Object r0 = r1.get(r6)     // Catch:{ all -> 0x3a16 }
            X.DFE r0 = (X.DFE) r0     // Catch:{ all -> 0x3a16 }
            X.DFL r0 = r0.A01     // Catch:{ all -> 0x3a16 }
            java.lang.String r1 = r0.A0C()     // Catch:{ all -> 0x3a16 }
            goto L_0x149a
        L_0x1499:
            r1 = 0
        L_0x149a:
            if (r1 == 0) goto L_0x14a1
            java.lang.String r0 = "visibleItemId"
            r3.put(r0, r1)     // Catch:{ all -> 0x3a16 }
        L_0x14a1:
            java.lang.String r0 = "visibleItemIndex"
            X.C17890vO.A0z(r0, r3, r6)     // Catch:{ all -> 0x3a16 }
            java.lang.String r0 = "visibleItemWidth"
            X.C17890vO.A0z(r0, r3, r5)     // Catch:{ all -> 0x3a16 }
            java.lang.String r0 = "visibleItemHeight"
            X.C17890vO.A0z(r0, r3, r4)     // Catch:{ all -> 0x3a16 }
            java.lang.String r0 = "visibleItemFractionFromOffset"
            X.BE7.A1H(r0, r3, r2)     // Catch:{ all -> 0x3a16 }
            goto L_0x3a10
        L_0x14b7:
            java.lang.String r0 = "Called GetVisibleCollectionItemAt when not attached to a tree"
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0n(r0)     // Catch:{ all -> 0x3a16 }
            throw r0     // Catch:{ all -> 0x3a16 }
        L_0x14be:
            java.lang.String r3 = "bk.action.animated.GetCurrentPlayTime"
            boolean r3 = r5.equals(r3)     // Catch:{ all -> 0x3a16 }
            if (r3 == 0) goto L_0x39f6
            X.DOZ r1 = A07(r2, r0)     // Catch:{ all -> 0x3a16 }
            java.lang.Float r3 = X.BE7.A0W()     // Catch:{ all -> 0x3a16 }
            if (r1 == 0) goto L_0x3a10
            java.lang.String r0 = A0M(r0, r4)     // Catch:{ all -> 0x3a16 }
            android.animation.Animator r0 = X.C26258Cw3.A02(r1, r0)     // Catch:{ all -> 0x3a16 }
            if (r0 == 0) goto L_0x3a10
            long r0 = X.C26258Cw3.A00(r0)     // Catch:{ all -> 0x3a16 }
            float r3 = (float) r0     // Catch:{ all -> 0x3a16 }
            long r1 = X.C26258Cw3.A00     // Catch:{ all -> 0x3a16 }
            float r0 = (float) r1     // Catch:{ all -> 0x3a16 }
            float r3 = r3 / r0
            java.lang.Float r3 = java.lang.Float.valueOf(r3)     // Catch:{ all -> 0x3a16 }
            goto L_0x3a10
        L_0x14e9:
            java.lang.String r0 = "bk.action.accessibility.GetFontScale"
            boolean r0 = r5.equals(r0)     // Catch:{ all -> 0x3a16 }
            if (r0 == 0) goto L_0x39f6
            X.CqB r0 = X.C25995CqB.A00()     // Catch:{ all -> 0x3a16 }
            android.content.Context r0 = r0.A00     // Catch:{ all -> 0x3a16 }
            android.content.res.Resources r0 = r0.getResources()     // Catch:{ all -> 0x3a16 }
            if (r0 == 0) goto L_0x3a04
            android.content.res.Configuration r0 = r0.getConfiguration()     // Catch:{ all -> 0x3a16 }
            if (r0 == 0) goto L_0x3a04
            float r0 = r0.fontScale     // Catch:{ all -> 0x3a16 }
            java.lang.Float r3 = java.lang.Float.valueOf(r0)     // Catch:{ all -> 0x3a16 }
            goto L_0x3a10
        L_0x150b:
            java.lang.String r2 = "bk.action.textspan.GetCenterX"
            boolean r2 = r5.equals(r2)     // Catch:{ all -> 0x3a16 }
            if (r2 == 0) goto L_0x39f6
            java.lang.Object r1 = A0G(r0)     // Catch:{ all -> 0x3a16 }
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.common.bloks.component.TextSpanContext"
            X.C18070vi.A0z(r1, r0)     // Catch:{ all -> 0x3a16 }
            X.CRe r1 = (X.C24954CRe) r1     // Catch:{ all -> 0x3a16 }
            float r0 = r1.A00     // Catch:{ all -> 0x3a16 }
            double r0 = (double) r0     // Catch:{ all -> 0x3a16 }
            java.lang.Number r3 = X.C25343Ce2.A00(r0)     // Catch:{ all -> 0x3a16 }
            goto L_0x3a10
        L_0x1527:
            java.lang.String r2 = "bk.action.textspan.GetCenterY"
            boolean r2 = r5.equals(r2)     // Catch:{ all -> 0x3a16 }
            if (r2 == 0) goto L_0x39f6
            java.lang.Object r1 = A0G(r0)     // Catch:{ all -> 0x3a16 }
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.common.bloks.component.TextSpanContext"
            X.C18070vi.A0z(r1, r0)     // Catch:{ all -> 0x3a16 }
            X.CRe r1 = (X.C24954CRe) r1     // Catch:{ all -> 0x3a16 }
            float r0 = r1.A01     // Catch:{ all -> 0x3a16 }
            double r0 = (double) r0     // Catch:{ all -> 0x3a16 }
            java.lang.Number r3 = X.C25343Ce2.A00(r0)     // Catch:{ all -> 0x3a16 }
            goto L_0x3a10
        L_0x1543:
            java.lang.String r2 = "bk.action.ttrc.CompleteStep"
            boolean r2 = r5.equals(r2)     // Catch:{ all -> 0x3a16 }
            if (r2 == 0) goto L_0x39f6
            X.C18070vi.A0d(r0, r4)     // Catch:{ all -> 0x3a16 }
            int r4 = A02(r0, r4)     // Catch:{ all -> 0x3a16 }
            java.lang.Object r3 = r0.A00(r1)     // Catch:{ all -> 0x3a16 }
            java.lang.String r1 = "null cannot be cast to non-null type kotlin.String"
            X.C18070vi.A0z(r3, r1)     // Catch:{ all -> 0x3a16 }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ all -> 0x3a16 }
            r2 = 2
            java.lang.String r1 = A0L(r0, r2)     // Catch:{ all -> 0x3a16 }
            X.C18070vi.A0d(r1, r2)     // Catch:{ all -> 0x3a16 }
            X.A8s r0 = X.A7e.A00(r3, r4)     // Catch:{ all -> 0x3a16 }
            if (r0 == 0) goto L_0x3a04
            r0.A0H(r1)     // Catch:{ all -> 0x3a16 }
            goto L_0x3a04
        L_0x1570:
            java.lang.String r3 = "bk.action.payload.Make"
            boolean r3 = r5.equals(r3)     // Catch:{ all -> 0x3a16 }
            if (r3 == 0) goto L_0x39f6
            java.lang.Object r3 = A0H(r0, r2)     // Catch:{ all -> 0x3a16 }
            java.lang.String r5 = "null cannot be cast to non-null type com.instagram.common.bloks.component.base.BloksModel"
            X.C18070vi.A0z(r3, r5)     // Catch:{ all -> 0x3a16 }
            X.DFL r3 = (X.DFL) r3     // Catch:{ all -> 0x3a16 }
            java.lang.Object r1 = r0.A00(r1)     // Catch:{ all -> 0x3a16 }
            X.C18070vi.A0z(r1, r5)     // Catch:{ all -> 0x3a16 }
            X.DFL r1 = (X.DFL) r1     // Catch:{ all -> 0x3a16 }
            r0 = 40
            java.util.List r21 = r1.A0G(r0)     // Catch:{ all -> 0x3a16 }
            r0 = 38
            java.util.List r22 = r1.A0G(r0)     // Catch:{ all -> 0x3a16 }
            r8 = 36
            java.util.List r23 = r1.A0G(r8)     // Catch:{ all -> 0x3a16 }
            r0 = 41
            java.util.List r6 = r1.A0G(r0)     // Catch:{ all -> 0x3a16 }
            java.util.ArrayList r5 = X.AnonymousClass000.A13()     // Catch:{ all -> 0x3a16 }
            r0 = 43
            X.E8A r1 = r1.A0A(r0)     // Catch:{ all -> 0x3a16 }
            r19 = 0
            if (r1 == 0) goto L_0x15c2
            X.9zJ r0 = X.C199029zJ.A01     // Catch:{ all -> 0x3a16 }
            java.lang.Object r1 = X.C25974Cph.A00(r2, r0, r1)     // Catch:{ all -> 0x3a16 }
            boolean r0 = r1 instanceof java.util.Map     // Catch:{ all -> 0x3a16 }
            if (r0 == 0) goto L_0x15c2
            java.util.Map r1 = (java.util.Map) r1     // Catch:{ all -> 0x3a16 }
            X.CZq r19 = X.CCE.A00(r1)     // Catch:{ all -> 0x3a16 }
        L_0x15c2:
            java.util.Iterator r7 = r6.iterator()     // Catch:{ all -> 0x3a16 }
        L_0x15c6:
            boolean r0 = r7.hasNext()     // Catch:{ all -> 0x3a16 }
            if (r0 == 0) goto L_0x15f7
            X.DFL r0 = X.BE6.A0d(r7)     // Catch:{ all -> 0x3a16 }
            java.lang.String r6 = r0.A0D(r8)     // Catch:{ all -> 0x3a16 }
            if (r6 == 0) goto L_0x15f0
            java.lang.String r1 = X.BE7.A0d(r0)     // Catch:{ all -> 0x3a16 }
            if (r1 == 0) goto L_0x15e9
            X.COD r0 = new X.COD     // Catch:{ all -> 0x3a16 }
            r0.<init>()     // Catch:{ all -> 0x3a16 }
            r0.A00 = r6     // Catch:{ all -> 0x3a16 }
            r0.A01 = r1     // Catch:{ all -> 0x3a16 }
            r5.add(r0)     // Catch:{ all -> 0x3a16 }
            goto L_0x15c6
        L_0x15e9:
            java.lang.String r0 = "Received null name from props in the payload.Make tree resource references"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0k(r0)     // Catch:{ all -> 0x3a16 }
            throw r0     // Catch:{ all -> 0x3a16 }
        L_0x15f0:
            java.lang.String r0 = "Received null variable id from props in the payload.Make tree resource references"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0k(r0)     // Catch:{ all -> 0x3a16 }
            throw r0     // Catch:{ all -> 0x3a16 }
        L_0x15f7:
            java.util.List r25 = java.util.Collections.emptyList()     // Catch:{ all -> 0x3a16 }
            java.util.List r26 = java.util.Collections.emptyList()     // Catch:{ all -> 0x3a16 }
            X.DOZ r1 = r2.A00     // Catch:{ all -> 0x3a16 }
            if (r1 != 0) goto L_0x1605
            r0 = 0
            goto L_0x160e
        L_0x1605:
            r0 = 2131428171(0x7f0b034b, float:1.8477979E38)
            java.lang.Object r0 = X.DOZ.A00(r1, r0)     // Catch:{ all -> 0x3a16 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x3a16 }
        L_0x160e:
            r27 = 0
            r29 = r27
            r31 = r4
            r17 = r2
            r18 = r3
            r20 = r0
            r24 = r5
            r28 = r27
            r30 = r4
            X.CvV r3 = A08(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31)     // Catch:{ all -> 0x3a16 }
            goto L_0x3a10
        L_0x1626:
            java.lang.String r7 = "bk.action.component.GetWidth2"
            boolean r3 = r5.equals(r7)     // Catch:{ all -> 0x3a16 }
            if (r3 == 0) goto L_0x39f6
            X.C18070vi.A0d(r0, r4)     // Catch:{ all -> 0x3a16 }
            X.C18070vi.A0d(r2, r1)     // Catch:{ all -> 0x3a16 }
            r5 = 0
            X.DFL r3 = A0D(r0, r4)     // Catch:{ all -> 0x3a16 }
            java.lang.String r4 = A0M(r0, r1)     // Catch:{ all -> 0x3a16 }
            X.DOZ r0 = r2.A00     // Catch:{ all -> 0x3a16 }
            android.view.View r0 = r3.A06(r0)     // Catch:{ all -> 0x3a16 }
            if (r0 == 0) goto L_0x1649
            int r5 = r0.getWidth()     // Catch:{ all -> 0x3a16 }
        L_0x1649:
            float r1 = (float) r5     // Catch:{ all -> 0x3a16 }
            java.lang.String r0 = "px"
            if (r4 == 0) goto L_0x165b
            boolean r0 = r4.equalsIgnoreCase(r0)     // Catch:{ all -> 0x3a16 }
            if (r0 == 0) goto L_0x165b
        L_0x1654:
            double r0 = (double) r1     // Catch:{ all -> 0x3a16 }
            java.lang.Number r3 = X.C25343Ce2.A00(r0)     // Catch:{ all -> 0x3a16 }
            goto L_0x3a10
        L_0x165b:
            java.lang.String r0 = "dp"
            if (r4 == 0) goto L_0x1673
            boolean r0 = r4.equalsIgnoreCase(r0)     // Catch:{ all -> 0x3a16 }
            if (r0 == 0) goto L_0x1673
            X.CqB r0 = X.C25995CqB.A00()     // Catch:{ all -> 0x3a16 }
            android.content.Context r0 = r0.A00     // Catch:{ all -> 0x3a16 }
            X.C18070vi.A0X(r0)     // Catch:{ all -> 0x3a16 }
            float r1 = X.C25342Ce1.A01(r0, r1)     // Catch:{ all -> 0x3a16 }
            goto L_0x1654
        L_0x1673:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x3a16 }
            java.lang.String r0 = "Unrecognised unit string "
            java.lang.String r0 = X.AnonymousClass001.A1H(r0, r4, r1)     // Catch:{ all -> 0x3a16 }
            goto L_0x366a
        L_0x167f:
            java.lang.String r2 = "bk.action.animation.linear.SetNewEndValue"
            boolean r2 = r5.equals(r2)     // Catch:{ all -> 0x3a16 }
            if (r2 == 0) goto L_0x39f6
            X.C18070vi.A0d(r0, r4)     // Catch:{ all -> 0x3a16 }
            java.lang.Object r7 = X.BE6.A0n(r0, r4)     // Catch:{ all -> 0x3a16 }
            android.animation.ValueAnimator r7 = (android.animation.ValueAnimator) r7     // Catch:{ all -> 0x3a16 }
            java.lang.Object r3 = r0.A00(r1)     // Catch:{ all -> 0x3a16 }
            java.lang.String r2 = "null cannot be cast to non-null type kotlin.Number"
            X.C18070vi.A0z(r3, r2)     // Catch:{ all -> 0x3a16 }
            float r6 = X.AnonymousClass000.A04(r3)     // Catch:{ all -> 0x3a16 }
            r2 = 2
            float r5 = A01(r0, r2)     // Catch:{ all -> 0x3a16 }
            if (r7 == 0) goto L_0x3a04
            float[] r3 = new float[r2]     // Catch:{ all -> 0x3a16 }
            java.lang.Object r2 = r7.getAnimatedValue()     // Catch:{ all -> 0x3a16 }
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.Float"
            X.C18070vi.A0z(r2, r0)     // Catch:{ all -> 0x3a16 }
            java.lang.Float r2 = (java.lang.Float) r2     // Catch:{ all -> 0x3a16 }
            float r0 = r2.floatValue()     // Catch:{ all -> 0x3a16 }
            r3[r4] = r0     // Catch:{ all -> 0x3a16 }
            r3[r1] = r6     // Catch:{ all -> 0x3a16 }
            r7.setFloatValues(r3)     // Catch:{ all -> 0x3a16 }
            r0 = 1148846080(0x447a0000, float:1000.0)
            float r5 = r5 * r0
            long r0 = (long) r5     // Catch:{ all -> 0x3a16 }
            r7.setDuration(r0)     // Catch:{ all -> 0x3a16 }
            r7.start()     // Catch:{ all -> 0x3a16 }
            goto L_0x3a04
        L_0x16c8:
            java.lang.String r3 = "bk.action.bloks.GetPayload"
            boolean r3 = r5.equals(r3)     // Catch:{ all -> 0x3a16 }
            if (r3 == 0) goto L_0x39f6
            X.C18070vi.A0d(r0, r4)     // Catch:{ all -> 0x3a16 }
            X.C18070vi.A0d(r2, r1)     // Catch:{ all -> 0x3a16 }
            java.lang.String r3 = A0M(r0, r4)     // Catch:{ all -> 0x3a16 }
            java.lang.Object r5 = X.BE6.A0n(r0, r1)     // Catch:{ all -> 0x3a16 }
            java.util.Map r5 = (java.util.Map) r5     // Catch:{ all -> 0x3a16 }
            X.COE r0 = A0F(r2, r3)     // Catch:{ all -> 0x3a16 }
            X.ChR r0 = r0.A00     // Catch:{ all -> 0x3a16 }
            X.CLb r0 = r0.A00     // Catch:{ all -> 0x3a16 }
            X.CUK r4 = r0.A00     // Catch:{ all -> 0x3a16 }
            java.util.List r0 = r2.A06     // Catch:{ all -> 0x3a16 }
            java.util.ArrayList r3 = X.AnonymousClass000.A13()     // Catch:{ all -> 0x3a16 }
            if (r0 == 0) goto L_0x16f5
            r3.addAll(r0)     // Catch:{ all -> 0x3a16 }
        L_0x16f5:
            java.util.concurrent.atomic.AtomicInteger r0 = X.CFq.A00     // Catch:{ all -> 0x3a16 }
            int r0 = r0.incrementAndGet()     // Catch:{ all -> 0x3a16 }
            X.C17890vO.A1D(r3, r0)     // Catch:{ all -> 0x3a16 }
            X.Boh r0 = X.C23736Boh.A02(r2, r3)     // Catch:{ all -> 0x3a16 }
            X.CvV r3 = A09(r0, r4, r5, r1, r1)     // Catch:{ all -> 0x3a16 }
            goto L_0x3a10
        L_0x1708:
            java.lang.String r2 = "bk.action.animation.linear.Start"
            boolean r2 = r5.equals(r2)     // Catch:{ all -> 0x3a16 }
            if (r2 == 0) goto L_0x39f6
            X.C18070vi.A0d(r0, r4)     // Catch:{ all -> 0x3a16 }
            java.lang.Object r0 = X.BE6.A0n(r0, r4)     // Catch:{ all -> 0x3a16 }
            android.animation.ValueAnimator r0 = (android.animation.ValueAnimator) r0     // Catch:{ all -> 0x3a16 }
            if (r0 == 0) goto L_0x3a04
            r0.start()     // Catch:{ all -> 0x3a16 }
            goto L_0x3a04
        L_0x1720:
            java.lang.String r2 = "bk.action.debug.internal.DeviceLogV2"
            boolean r2 = r5.equals(r2)     // Catch:{ all -> 0x3a16 }
            if (r2 == 0) goto L_0x39f6
            X.C18070vi.A0d(r0, r4)     // Catch:{ all -> 0x3a16 }
            r3 = 5
            X.EAY r1 = X.C26294Cx6.A01     // Catch:{ all -> 0x3a16 }
            boolean r1 = r1.BfN(r3)     // Catch:{ all -> 0x3a16 }
            if (r1 == 0) goto L_0x3a04
            java.lang.Object r1 = X.BE6.A0n(r0, r4)     // Catch:{ Exception -> 0x176d }
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.collections.List<*>"
            java.util.List r0 = X.BE6.A13(r1, r0)     // Catch:{ Exception -> 0x176d }
            java.util.ArrayList r2 = X.C29351c6.A0D(r0)     // Catch:{ Exception -> 0x176d }
            java.util.Iterator r1 = r0.iterator()     // Catch:{ Exception -> 0x176d }
        L_0x1746:
            boolean r0 = r1.hasNext()     // Catch:{ Exception -> 0x176d }
            if (r0 == 0) goto L_0x1758
            java.lang.Object r0 = r1.next()     // Catch:{ Exception -> 0x176d }
            java.lang.String r0 = A0O(r0)     // Catch:{ Exception -> 0x176d }
            r2.add(r0)     // Catch:{ Exception -> 0x176d }
            goto L_0x1746
        L_0x1758:
            java.lang.String r0 = ", "
            java.lang.String r1 = X.C108995ce.A0X(r0, r2)     // Catch:{ Exception -> 0x176d }
            X.EAY r0 = X.C26294Cx6.A01     // Catch:{ Exception -> 0x176d }
            boolean r0 = r0.BfN(r3)     // Catch:{ Exception -> 0x176d }
            if (r0 == 0) goto L_0x3a04
            X.EAY r0 = X.C26294Cx6.A01     // Catch:{ Exception -> 0x176d }
            r0.Bhz(r1)     // Catch:{ Exception -> 0x176d }
            goto L_0x3a04
        L_0x176d:
            r2 = move-exception
            java.lang.String r1 = "BKS::debugLog"
            java.lang.String r0 = "Failed to log"
            X.C26294Cx6.A09(r1, r0, r2)     // Catch:{ all -> 0x3a16 }
            goto L_0x3a04
        L_0x1777:
            java.lang.String r3 = "bk.action.bloks.ParseHoistedPayload"
            boolean r3 = r5.equals(r3)     // Catch:{ all -> 0x3a16 }
            if (r3 == 0) goto L_0x39f6
            X.C18070vi.A0d(r0, r4)     // Catch:{ all -> 0x3a16 }
            X.C18070vi.A0d(r2, r1)     // Catch:{ all -> 0x3a16 }
            java.lang.String r0 = A0M(r0, r4)     // Catch:{ all -> 0x3a16 }
            X.COE r0 = A0F(r2, r0)     // Catch:{ all -> 0x3a16 }
            X.ChR r0 = r0.A00     // Catch:{ all -> 0x3a16 }
            X.CLb r0 = r0.A00     // Catch:{ all -> 0x3a16 }
            X.CUK r3 = r0.A00     // Catch:{ all -> 0x3a16 }
            r0 = 0
            X.CvV r3 = A09(r2, r3, r0, r1, r4)     // Catch:{ all -> 0x3a16 }
            goto L_0x3a10
        L_0x179a:
            java.lang.String r3 = "bk.action.bloks.ReplaceChild"
            boolean r3 = r5.equals(r3)     // Catch:{ all -> 0x3a16 }
            if (r3 == 0) goto L_0x39f6
            java.lang.Object r3 = A0J(r0, r2)     // Catch:{ all -> 0x3a16 }
            java.lang.String r1 = "null cannot be cast to non-null type kotlin.collections.List<com.instagram.common.bloks.component.base.BloksModel>"
            java.util.List r3 = X.BE6.A13(r3, r1)     // Catch:{ all -> 0x3a16 }
            java.lang.String r1 = A0K(r0)     // Catch:{ all -> 0x3a16 }
            X.DNk r0 = A0B(r2, r0)     // Catch:{ all -> 0x3a16 }
            A0R(r0, r1, r3)     // Catch:{ all -> 0x3a16 }
            goto L_0x3a04
        L_0x17b9:
            java.lang.String r2 = "bk.action.animated.easing.CreateCubicBezier"
            boolean r2 = r5.equals(r2)     // Catch:{ all -> 0x3a16 }
            if (r2 == 0) goto L_0x39f6
            java.lang.Object r3 = A0G(r0)     // Catch:{ all -> 0x3a16 }
            java.lang.String r2 = "null cannot be cast to non-null type kotlin.Number"
            X.C18070vi.A0z(r3, r2)     // Catch:{ all -> 0x3a16 }
            float r4 = X.AnonymousClass000.A04(r3)     // Catch:{ all -> 0x3a16 }
            float r3 = A01(r0, r1)     // Catch:{ all -> 0x3a16 }
            r1 = 2
            float r2 = A01(r0, r1)     // Catch:{ all -> 0x3a16 }
            r1 = 3
            float r0 = A01(r0, r1)     // Catch:{ all -> 0x3a16 }
            android.view.animation.Interpolator r3 = X.C29111bd.A00(r4, r3, r2, r0)     // Catch:{ all -> 0x3a16 }
            X.C18070vi.A0X(r3)     // Catch:{ all -> 0x3a16 }
            goto L_0x3a10
        L_0x17e5:
            java.lang.String r3 = "bk.action.bloks.ReplaceChildrenAfter"
            boolean r3 = r5.equals(r3)     // Catch:{ all -> 0x3a16 }
            if (r3 == 0) goto L_0x39f6
            java.lang.Object r3 = A0J(r0, r2)     // Catch:{ all -> 0x3a16 }
            java.lang.String r1 = "null cannot be cast to non-null type kotlin.collections.List<com.instagram.common.bloks.component.base.BloksModel>"
            java.util.List r4 = X.BE6.A13(r3, r1)     // Catch:{ all -> 0x3a16 }
            java.lang.String r3 = A0K(r0)     // Catch:{ all -> 0x3a16 }
            X.DNk r2 = A0B(r2, r0)     // Catch:{ all -> 0x3a16 }
            X.DNl r1 = A0C(r3)     // Catch:{ all -> 0x3a16 }
            X.Boc r0 = new X.Boc     // Catch:{ all -> 0x3a16 }
            r0.<init>(r3, r4)     // Catch:{ all -> 0x3a16 }
            r2.A0A(r1, r0)     // Catch:{ all -> 0x3a16 }
            goto L_0x3a04
        L_0x180d:
            java.lang.String r3 = "bk.action.AsyncComponentCacheWrite"
            boolean r3 = r5.equals(r3)     // Catch:{ all -> 0x3a16 }
            if (r3 == 0) goto L_0x39f6
            java.lang.Object r6 = A0H(r0, r2)     // Catch:{ all -> 0x3a16 }
            java.lang.String r3 = "null cannot be cast to non-null type kotlin.String"
            X.C18070vi.A0z(r6, r3)     // Catch:{ all -> 0x3a16 }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ all -> 0x3a16 }
            java.lang.String r8 = A0L(r0, r1)     // Catch:{ all -> 0x3a16 }
            r1 = 2
            java.lang.Object r3 = r0.A00(r1)     // Catch:{ all -> 0x3a16 }
            java.lang.String r1 = "null cannot be cast to non-null type kotlin.Number"
            X.C18070vi.A0z(r3, r1)     // Catch:{ all -> 0x3a16 }
            long r10 = X.C17880vN.A05(r3)     // Catch:{ all -> 0x3a16 }
            r1 = 3
            java.lang.Object r1 = r0.A00(r1)     // Catch:{ all -> 0x3a16 }
            X.DFL r1 = (X.DFL) r1     // Catch:{ all -> 0x3a16 }
            X.DOZ r9 = r2.A00     // Catch:{ all -> 0x3a16 }
            r3 = 0
            if (r9 == 0) goto L_0x184c
            r0 = 2131428152(0x7f0b0338, float:1.847794E38)
            java.lang.Object r7 = r9.A01(r0)     // Catch:{ all -> 0x3a16 }
            X.CqT r7 = (X.C26012CqT) r7     // Catch:{ all -> 0x3a16 }
        L_0x1847:
            java.lang.String r5 = "BKBloksActionAsyncComponentCacheWriteImpl"
            if (r9 == 0) goto L_0x18ce
            goto L_0x184e
        L_0x184c:
            r7 = r3
            goto L_0x1847
        L_0x184e:
            if (r7 == 0) goto L_0x18ce
            X.DNk r9 = X.C26272CwJ.A01(r9)     // Catch:{ all -> 0x3a16 }
            java.lang.String r0 = "Tree resources can only be read from the UI Thread"
            X.C26176Ctu.A02(r0)     // Catch:{ all -> 0x3a16 }
            X.CrK r0 = r9.A04     // Catch:{ all -> 0x3a16 }
            java.util.Map r0 = r0.A02     // Catch:{ all -> 0x3a16 }
            java.lang.Object r9 = r0.get(r6)     // Catch:{ all -> 0x3a16 }
            X.COG r9 = (X.COG) r9     // Catch:{ all -> 0x3a16 }
            if (r9 != 0) goto L_0x1874
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x3a16 }
            java.lang.String r0 = "Didn't find payload with id "
            java.lang.String r0 = X.AnonymousClass001.A1H(r0, r6, r1)     // Catch:{ all -> 0x3a16 }
            X.C25913CoX.A01(r0, r5)     // Catch:{ all -> 0x3a16 }
            goto L_0x3a10
        L_0x1874:
            if (r1 == 0) goto L_0x1877
            goto L_0x1879
        L_0x1877:
            r2 = r3
            goto L_0x1889
        L_0x1879:
            r0 = 42
            X.E8A r1 = r1.A0A(r0)     // Catch:{ all -> 0x3a16 }
            if (r1 == 0) goto L_0x1877
            X.9zJ r0 = X.C199029zJ.A01     // Catch:{ all -> 0x3a16 }
            java.lang.Object r2 = X.C25974Cph.A00(r2, r0, r1)     // Catch:{ all -> 0x3a16 }
            java.util.Map r2 = (java.util.Map) r2     // Catch:{ all -> 0x3a16 }
        L_0x1889:
            android.util.Pair r0 = r9.A00     // Catch:{ all -> 0x3a16 }
            if (r0 == 0) goto L_0x18b7
            java.lang.Object r1 = r0.first     // Catch:{ all -> 0x3a16 }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ all -> 0x3a16 }
            java.lang.Object r0 = r0.second     // Catch:{ all -> 0x3a16 }
            X.Cgi r0 = (X.C25487Cgi) r0     // Catch:{ all -> 0x3a16 }
            if (r1 == 0) goto L_0x18b7
            if (r0 == 0) goto L_0x18b7
            X.Cad r6 = X.CC5.A00(r0, r3)     // Catch:{ all -> 0x3a16 }
            if (r2 != 0) goto L_0x18a3
            X.1CQ r2 = X.AnonymousClass1D7.A0I()     // Catch:{ all -> 0x3a16 }
        L_0x18a3:
            X.C18070vi.A0d(r8, r4)     // Catch:{ all -> 0x3a16 }
            java.lang.String r9 = X.C26177Ctv.A00(r8, r2)     // Catch:{ all -> 0x3a16 }
            X.CQK r0 = r7.A05     // Catch:{ all -> 0x3a16 }
            X.CWI r0 = r0.A01     // Catch:{ all -> 0x3a16 }
            X.Byi r7 = X.C24285Byi.HOISTED_PREFETCH     // Catch:{ all -> 0x3a16 }
            r5 = r0
            r8 = r3
            r5.A00(r6, r7, r8, r9, r10)     // Catch:{ all -> 0x3a16 }
            goto L_0x3a10
        L_0x18b7:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x3a16 }
            java.lang.String r0 = "Stored payload for "
            r1.append(r0)     // Catch:{ all -> 0x3a16 }
            r1.append(r6)     // Catch:{ all -> 0x3a16 }
            java.lang.String r0 = " is null"
            java.lang.String r0 = X.AnonymousClass000.A0y(r0, r1)     // Catch:{ all -> 0x3a16 }
            X.C25913CoX.A01(r0, r5)     // Catch:{ all -> 0x3a16 }
            goto L_0x3a10
        L_0x18ce:
            java.lang.String r0 = "Failed to get query store"
            X.C25913CoX.A01(r0, r5)     // Catch:{ all -> 0x3a16 }
            goto L_0x3a10
        L_0x18d5:
            java.lang.String r3 = "bk.action.animated.Loop"
            boolean r3 = r5.equals(r3)     // Catch:{ all -> 0x3a16 }
            if (r3 == 0) goto L_0x39f6
            X.DOZ r5 = A07(r2, r0)     // Catch:{ all -> 0x3a16 }
            if (r5 == 0) goto L_0x3a04
            int r2 = A02(r0, r4)     // Catch:{ all -> 0x3a16 }
            android.animation.Animator r0 = A03(r0, r1)     // Catch:{ all -> 0x3a16 }
            X.BED r3 = new X.BED     // Catch:{ all -> 0x3a16 }
            r3.<init>(r0, r5, r2)     // Catch:{ all -> 0x3a16 }
            goto L_0x3a10
        L_0x18f2:
            java.lang.String r2 = "bk.action.textspan.GetWidth"
            boolean r2 = r5.equals(r2)     // Catch:{ all -> 0x3a16 }
            if (r2 == 0) goto L_0x39f6
            java.lang.Object r1 = A0G(r0)     // Catch:{ all -> 0x3a16 }
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.common.bloks.component.TextSpanContext"
            X.C18070vi.A0z(r1, r0)     // Catch:{ all -> 0x3a16 }
            X.CRe r1 = (X.C24954CRe) r1     // Catch:{ all -> 0x3a16 }
            float r0 = r1.A03     // Catch:{ all -> 0x3a16 }
            double r0 = (double) r0     // Catch:{ all -> 0x3a16 }
            java.lang.Number r3 = X.C25343Ce2.A00(r0)     // Catch:{ all -> 0x3a16 }
            goto L_0x3a10
        L_0x190e:
            java.lang.String r0 = "bk.action.dispatch.GetMainQueue"
            boolean r0 = r5.equals(r0)     // Catch:{ all -> 0x3a16 }
            if (r0 == 0) goto L_0x39f6
            X.0vl r0 = X.AnonymousClass6YS.A00     // Catch:{ all -> 0x3a16 }
            java.lang.Object r3 = r0.getValue()     // Catch:{ all -> 0x3a16 }
            android.os.Handler r3 = (android.os.Handler) r3     // Catch:{ all -> 0x3a16 }
            goto L_0x3a10
        L_0x1920:
            java.lang.String r2 = "bk.action.animation.linear.Cancel"
            boolean r2 = r5.equals(r2)     // Catch:{ all -> 0x3a16 }
            if (r2 == 0) goto L_0x39f6
            X.C18070vi.A0d(r0, r4)     // Catch:{ all -> 0x3a16 }
            java.lang.Object r0 = X.BE6.A0n(r0, r4)     // Catch:{ all -> 0x3a16 }
            android.animation.ValueAnimator r0 = (android.animation.ValueAnimator) r0     // Catch:{ all -> 0x3a16 }
            if (r0 == 0) goto L_0x3a04
            goto L_0x2689
        L_0x1935:
            java.lang.String r3 = "bk.action.callback.Apply"
            boolean r3 = r5.equals(r3)     // Catch:{ all -> 0x3a16 }
            if (r3 == 0) goto L_0x39f6
            X.C18070vi.A0d(r0, r4)     // Catch:{ all -> 0x3a16 }
            X.C18070vi.A0d(r2, r1)     // Catch:{ all -> 0x3a16 }
            java.util.List r0 = r0.A00     // Catch:{ all -> 0x3a16 }
            java.lang.Object r4 = r0.get(r4)     // Catch:{ all -> 0x3a16 }
            X.Ci0 r4 = (X.C25562Ci0) r4     // Catch:{ all -> 0x3a16 }
            if (r4 == 0) goto L_0x3a04
            java.util.List r3 = java.util.Collections.unmodifiableList(r0)     // Catch:{ all -> 0x3a16 }
            int r0 = X.BE7.A08(r3)     // Catch:{ all -> 0x3a16 }
            java.util.List r0 = r3.subList(r1, r0)     // Catch:{ all -> 0x3a16 }
            X.9zJ r3 = new X.9zJ     // Catch:{ all -> 0x3a16 }
            r3.<init>(r0)     // Catch:{ all -> 0x3a16 }
            X.E8A r1 = r4.A01     // Catch:{ all -> 0x3a16 }
            X.Boh r0 = r4.A00     // Catch:{ all -> 0x3a16 }
            if (r0 != 0) goto L_0x196c
            java.util.List r0 = r4.A02     // Catch:{ all -> 0x3a16 }
            if (r0 == 0) goto L_0x1972
            X.Boh r0 = X.C23736Boh.A02(r2, r0)     // Catch:{ all -> 0x3a16 }
        L_0x196c:
            java.lang.Object r3 = X.C25974Cph.A00(r0, r3, r1)     // Catch:{ all -> 0x3a16 }
            goto L_0x3a10
        L_0x1972:
            java.lang.String r1 = "BloksCallback"
            java.lang.String r0 = "An attempt to invoke an invalid callback"
            goto L_0x1e52
        L_0x1978:
            java.lang.String r3 = "bk.action.animated.CreateColor"
            boolean r3 = r5.equals(r3)     // Catch:{ all -> 0x3a16 }
            if (r3 == 0) goto L_0x39f6
            X.DOZ r7 = A07(r2, r0)     // Catch:{ all -> 0x3a16 }
            if (r7 == 0) goto L_0x3a04
            X.E8A r9 = X.C25488Cgj.A00(r0, r4)     // Catch:{ all -> 0x3a16 }
            java.util.List r10 = r0.A00     // Catch:{ all -> 0x3a16 }
            X.E8A r6 = X.AnonymousClass8BT.A08(r10, r1)     // Catch:{ all -> 0x3a16 }
            r8 = 2
            java.lang.Object r5 = r0.A00(r8)     // Catch:{ all -> 0x3a16 }
            java.lang.String r3 = "null cannot be cast to non-null type kotlin.String"
            X.C18070vi.A0z(r5, r3)     // Catch:{ all -> 0x3a16 }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ all -> 0x3a16 }
            int r12 = android.graphics.Color.parseColor(r5)     // Catch:{ all -> 0x3a16 }
            r3 = 3
            java.lang.String r3 = A0L(r0, r3)     // Catch:{ all -> 0x3a16 }
            int r5 = android.graphics.Color.parseColor(r3)     // Catch:{ all -> 0x3a16 }
            r3 = 4
            float r11 = A00(r0, r3)     // Catch:{ all -> 0x3a16 }
            r0 = 5
            java.lang.Object r10 = r10.get(r0)     // Catch:{ all -> 0x3a16 }
            android.view.animation.Interpolator r10 = (android.view.animation.Interpolator) r10     // Catch:{ all -> 0x3a16 }
            X.BER r3 = new X.BER     // Catch:{ all -> 0x3a16 }
            r3.<init>()     // Catch:{ all -> 0x3a16 }
            int[] r0 = new int[r8]     // Catch:{ all -> 0x3a16 }
            r0[r4] = r12     // Catch:{ all -> 0x3a16 }
            r0[r1] = r5     // Catch:{ all -> 0x3a16 }
            r3.setIntValues(r0)     // Catch:{ all -> 0x3a16 }
            android.animation.ArgbEvaluator r0 = new android.animation.ArgbEvaluator     // Catch:{ all -> 0x3a16 }
            r0.<init>()     // Catch:{ all -> 0x3a16 }
            r3.setEvaluator(r0)     // Catch:{ all -> 0x3a16 }
            long r4 = X.C26258Cw3.A00     // Catch:{ all -> 0x3a16 }
            float r0 = (float) r4     // Catch:{ all -> 0x3a16 }
            float r11 = r11 * r0
            long r0 = (long) r11     // Catch:{ all -> 0x3a16 }
            r3.setDuration(r0)     // Catch:{ all -> 0x3a16 }
            r3.setInterpolator(r10)     // Catch:{ all -> 0x3a16 }
            X.CxY r0 = new X.CxY     // Catch:{ all -> 0x3a16 }
            r0.<init>(r9, r2, r8)     // Catch:{ all -> 0x3a16 }
            goto L_0x2580
        L_0x19dd:
            java.lang.String r2 = "bk.action.visibility_context.HasSeenBefore"
            boolean r2 = r5.equals(r2)     // Catch:{ all -> 0x3a16 }
            if (r2 == 0) goto L_0x39f6
            java.lang.Object r1 = A0G(r0)     // Catch:{ all -> 0x3a16 }
            java.lang.String r0 = "null cannot be cast to non-null type com.bloks.foa.visibility.ViewpointSnapshotWithData"
            X.C18070vi.A0z(r1, r0)     // Catch:{ all -> 0x3a16 }
            X.6fg r1 = (X.C128246fg) r1     // Catch:{ all -> 0x3a16 }
            boolean r0 = r1.A02     // Catch:{ all -> 0x3a16 }
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r0)     // Catch:{ all -> 0x3a16 }
            goto L_0x3a10
        L_0x19f8:
            java.lang.String r3 = "bk.action.collection.SetIndexById"
            boolean r3 = r5.equals(r3)     // Catch:{ all -> 0x3a16 }
            if (r3 == 0) goto L_0x39f6
            X.DFL r3 = A0E(r0, r2)     // Catch:{ all -> 0x3a16 }
            java.lang.Object r1 = r0.A00(r1)     // Catch:{ all -> 0x3a16 }
            X.C18070vi.A0X(r1)     // Catch:{ all -> 0x3a16 }
            java.lang.String r6 = X.CCF.A00(r1)     // Catch:{ all -> 0x3a16 }
            r1 = 2
            java.lang.Object r1 = r0.A00(r1)     // Catch:{ all -> 0x3a16 }
            boolean r5 = X.C25343Ce2.A01(r1)     // Catch:{ all -> 0x3a16 }
            r1 = 3
            X.ClD r4 = A05(r2, r3, r0, r1)     // Catch:{ all -> 0x3a16 }
            if (r4 == 0) goto L_0x3a04
            boolean r0 = X.C26176Ctu.A03()     // Catch:{ all -> 0x3a16 }
            if (r0 == 0) goto L_0x1a4f
            X.BVF r0 = r4.A01     // Catch:{ all -> 0x3a16 }
            java.util.List r3 = r0.A03     // Catch:{ all -> 0x3a16 }
            int r2 = r3.size()     // Catch:{ all -> 0x3a16 }
            r1 = 0
        L_0x1a2e:
            if (r1 >= r2) goto L_0x3a04
            java.lang.Object r0 = r3.get(r1)     // Catch:{ all -> 0x3a16 }
            X.DFE r0 = (X.DFE) r0     // Catch:{ all -> 0x3a16 }
            X.DFL r0 = r0.A01     // Catch:{ all -> 0x3a16 }
            java.lang.String r0 = r0.A0C()     // Catch:{ all -> 0x3a16 }
            if (r0 == 0) goto L_0x1a45
            boolean r0 = r0.equals(r6)     // Catch:{ all -> 0x3a16 }
            if (r0 == 0) goto L_0x1a45
            goto L_0x1a48
        L_0x1a45:
            int r1 = r1 + 1
            goto L_0x1a2e
        L_0x1a48:
            if (r1 < 0) goto L_0x3a04
            r4.A01(r1, r5)     // Catch:{ all -> 0x3a16 }
            goto L_0x3a04
        L_0x1a4f:
            java.lang.String r0 = "setIndexById cannot be called from a background thread."
            java.lang.RuntimeException r0 = X.AnonymousClass8BR.A0w(r0)     // Catch:{ all -> 0x3a16 }
            throw r0     // Catch:{ all -> 0x3a16 }
        L_0x1a56:
            java.lang.String r3 = "bk.action.timer.Stop"
            boolean r3 = r5.equals(r3)     // Catch:{ all -> 0x3a16 }
            if (r3 == 0) goto L_0x39f6
            X.C18070vi.A0d(r0, r4)     // Catch:{ all -> 0x3a16 }
            X.C18070vi.A0d(r2, r1)     // Catch:{ all -> 0x3a16 }
            java.lang.String r3 = A0M(r0, r4)     // Catch:{ all -> 0x3a16 }
            X.DOZ r2 = r2.A00     // Catch:{ all -> 0x3a16 }
            if (r2 == 0) goto L_0x1a88
            r0 = 2131428185(0x7f0b0359, float:1.8478007E38)
            java.lang.Object r0 = r2.A01(r0)     // Catch:{ all -> 0x3a16 }
            java.util.HashMap r0 = (java.util.HashMap) r0     // Catch:{ all -> 0x3a16 }
            java.lang.Object r0 = r0.get(r3)     // Catch:{ all -> 0x3a16 }
            X.CXG r0 = (X.CXG) r0     // Catch:{ all -> 0x3a16 }
            if (r0 == 0) goto L_0x3a04
            r0.A01 = r1     // Catch:{ all -> 0x3a16 }
            android.os.Handler r1 = r0.A03     // Catch:{ all -> 0x3a16 }
            java.lang.Runnable r0 = r0.A05     // Catch:{ all -> 0x3a16 }
            r1.removeCallbacks(r0)     // Catch:{ all -> 0x3a16 }
            goto L_0x3a04
        L_0x1a88:
            java.lang.IllegalStateException r0 = X.C17880vN.A0g()     // Catch:{ all -> 0x3a16 }
            throw r0     // Catch:{ all -> 0x3a16 }
        L_0x1a8d:
            java.lang.String r2 = "bk.action.toast.DismissToast"
            boolean r2 = r5.equals(r2)     // Catch:{ all -> 0x3a16 }
            if (r2 == 0) goto L_0x39f6
            X.C18070vi.A0d(r0, r4)     // Catch:{ all -> 0x3a16 }
            java.lang.String r2 = X.AnonymousClass8BT.A0t(r0, r4)     // Catch:{ all -> 0x3a16 }
            java.lang.ref.WeakReference r0 = X.C26071Crl.A00     // Catch:{ all -> 0x3a16 }
            if (r2 == 0) goto L_0x3a04
            java.lang.ref.WeakReference r0 = X.C26071Crl.A00     // Catch:{ all -> 0x3a16 }
            java.lang.Object r1 = r0.get()     // Catch:{ all -> 0x3a16 }
            X.BIJ r1 = (X.BIJ) r1     // Catch:{ all -> 0x3a16 }
            if (r1 == 0) goto L_0x3a04
            r0 = 2131430937(0x7f0b0e19, float:1.848359E38)
            java.lang.Object r0 = r1.getTag(r0)     // Catch:{ all -> 0x3a16 }
            boolean r0 = r2.equals(r0)     // Catch:{ all -> 0x3a16 }
            if (r0 == 0) goto L_0x3a04
            int r0 = r1.A01     // Catch:{ all -> 0x3a16 }
            r1.A03(r0)     // Catch:{ all -> 0x3a16 }
            goto L_0x3a04
        L_0x1abe:
            java.lang.String r3 = "bk.action.tree.Make"
            boolean r3 = r5.equals(r3)     // Catch:{ all -> 0x3a16 }
            if (r3 == 0) goto L_0x39f6
            java.lang.Object r3 = A0H(r0, r2)     // Catch:{ all -> 0x3a16 }
            java.lang.String r8 = "null cannot be cast to non-null type kotlin.Int"
            X.C18070vi.A0z(r3, r8)     // Catch:{ all -> 0x3a16 }
            int r5 = X.BE6.A0F(r3)     // Catch:{ all -> 0x3a16 }
            java.util.List r7 = r0.A00     // Catch:{ all -> 0x3a16 }
            int r4 = r7.size()     // Catch:{ all -> 0x3a16 }
            r3 = 2
            int r4 = r4 / r3
            java.util.List r2 = r2.A06     // Catch:{ all -> 0x3a16 }
            X.BoN r3 = new X.BoN     // Catch:{ all -> 0x3a16 }
            r3.<init>(r2, r5, r4)     // Catch:{ all -> 0x3a16 }
            int r2 = r7.size()     // Catch:{ all -> 0x3a16 }
            X.1Oc r1 = X.C28851b7.A08(r1, r2)     // Catch:{ all -> 0x3a16 }
            X.1Oa r1 = X.C28851b7.A07(r1)     // Catch:{ all -> 0x3a16 }
            int r6 = r1.A00     // Catch:{ all -> 0x3a16 }
            int r5 = r1.A01     // Catch:{ all -> 0x3a16 }
            int r4 = r1.A02     // Catch:{ all -> 0x3a16 }
            if (r4 <= 0) goto L_0x1af9
            if (r6 <= r5) goto L_0x1afd
            goto L_0x1b15
        L_0x1af9:
            if (r4 >= 0) goto L_0x1b15
            if (r5 > r6) goto L_0x1b15
        L_0x1afd:
            java.lang.Object r1 = r0.A00(r6)     // Catch:{ all -> 0x3a16 }
            X.C18070vi.A0z(r1, r8)     // Catch:{ all -> 0x3a16 }
            int r2 = X.BE6.A0F(r1)     // Catch:{ all -> 0x3a16 }
            int r1 = r6 + 1
            java.lang.Object r1 = r7.get(r1)     // Catch:{ all -> 0x3a16 }
            r3.A0H(r2, r1)     // Catch:{ all -> 0x3a16 }
            if (r6 == r5) goto L_0x1b15
            int r6 = r6 + r4
            goto L_0x1afd
        L_0x1b15:
            r3.A0J()     // Catch:{ all -> 0x3a16 }
            goto L_0x3a10
        L_0x1b1a:
            java.lang.String r0 = "bk.action.device.GetDeviceOSVersion"
            boolean r0 = r5.equals(r0)     // Catch:{ all -> 0x3a16 }
            if (r0 == 0) goto L_0x39f6
            int r0 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x3a16 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x3a16 }
            goto L_0x3a10
        L_0x1b2a:
            java.lang.String r3 = "bk.action.bloks.InflateSync"
            boolean r3 = r5.equals(r3)     // Catch:{ all -> 0x3a16 }
            if (r3 == 0) goto L_0x39f6
            java.lang.Object r1 = A0I(r0, r2)     // Catch:{ all -> 0x3a16 }
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.collections.Map<kotlin.Any, kotlin.Any>"
            X.C18070vi.A0z(r1, r0)     // Catch:{ all -> 0x3a16 }
            java.util.Map r1 = (java.util.Map) r1     // Catch:{ all -> 0x3a16 }
            java.lang.String r0 = "InflateSync"
            X.AnonymousClass0O7.A01(r0)     // Catch:{ all -> 0x3a16 }
            java.util.Iterator r3 = X.AnonymousClass000.A15(r1)     // Catch:{ IOException -> 0x1b5b }
            X.C25995CqB.A00()     // Catch:{ IOException -> 0x1b5b }
            r1 = 0
            X.DNc r0 = new X.DNc     // Catch:{ IOException -> 0x1b5b }
            r0.<init>(r2, r3)     // Catch:{ IOException -> 0x1b5b }
            r0.BkN()     // Catch:{ IOException -> 0x1b5b }
            X.DFL r3 = X.C25338Cdx.A01(r1, r0)     // Catch:{ IOException -> 0x1b5b }
            X.AnonymousClass0O7.A00()     // Catch:{ all -> 0x3a16 }
            goto L_0x3a10
        L_0x1b5b:
            r1 = move-exception
            java.lang.String r0 = "inflate_sync_error"
            X.C25913CoX.A02(r0, r1)     // Catch:{ all -> 0x1b63 }
            goto L_0x3a01
        L_0x1b63:
            r3 = move-exception
            X.AnonymousClass0O7.A00()     // Catch:{ all -> 0x3a16 }
            goto L_0x38a5
        L_0x1b69:
            java.lang.String r2 = "bk.action.ttrc.AddAnnotation"
            boolean r2 = r5.equals(r2)     // Catch:{ all -> 0x3a16 }
            if (r2 == 0) goto L_0x39f6
            X.C18070vi.A0d(r0, r4)     // Catch:{ all -> 0x3a16 }
            int r4 = A02(r0, r4)     // Catch:{ all -> 0x3a16 }
            java.util.List r3 = r0.A00     // Catch:{ all -> 0x3a16 }
            java.lang.String r2 = X.C17880vN.A0w(r3, r1)     // Catch:{ all -> 0x3a16 }
            r0 = 2
            java.lang.Object r1 = r3.get(r0)     // Catch:{ all -> 0x3a16 }
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.collections.Map<kotlin.Any, kotlin.Any>"
            X.C18070vi.A0z(r1, r0)     // Catch:{ all -> 0x3a16 }
            java.util.Map r1 = (java.util.Map) r1     // Catch:{ all -> 0x3a16 }
            r0 = 2
            X.C18070vi.A0d(r1, r0)     // Catch:{ all -> 0x3a16 }
            X.A8s r0 = X.A7e.A00(r2, r4)     // Catch:{ all -> 0x3a16 }
            if (r0 == 0) goto L_0x3a04
            X.A7e.A02(r0, r1)     // Catch:{ all -> 0x3a16 }
            goto L_0x3a04
        L_0x1b99:
            java.lang.String r2 = "null"
            boolean r2 = r5.equals(r2)     // Catch:{ all -> 0x3a16 }
            if (r2 == 0) goto L_0x39f6
            X.C18070vi.A0d(r0, r4)     // Catch:{ all -> 0x3a16 }
            r2 = 0
            java.lang.Object r0 = X.BE6.A0n(r0, r4)     // Catch:{ all -> 0x3a16 }
            if (r0 != 0) goto L_0x380d
            goto L_0x380c
        L_0x1bad:
            java.lang.String r3 = "bk.action.animated.CreateSharedElementV2"
            boolean r3 = r5.equals(r3)     // Catch:{ all -> 0x3a16 }
            if (r3 == 0) goto L_0x39f6
            X.DOZ r9 = A07(r2, r0)     // Catch:{ all -> 0x3a16 }
            r3 = 0
            if (r9 == 0) goto L_0x3a10
            java.lang.Object r5 = r0.A00(r4)     // Catch:{ all -> 0x3a16 }
            java.lang.String r2 = "null cannot be cast to non-null type com.instagram.common.bloks.component.base.BloksModel"
            X.C18070vi.A0z(r5, r2)     // Catch:{ all -> 0x3a16 }
            X.DFL r5 = (X.DFL) r5     // Catch:{ all -> 0x3a16 }
            java.lang.Object r7 = r0.A00(r1)     // Catch:{ all -> 0x3a16 }
            X.C18070vi.A0z(r7, r2)     // Catch:{ all -> 0x3a16 }
            X.DFL r7 = (X.DFL) r7     // Catch:{ all -> 0x3a16 }
            r6 = 36
            java.lang.String r8 = r5.A0D(r6)     // Catch:{ all -> 0x3a16 }
            android.view.View r2 = r5.A06(r9)     // Catch:{ all -> 0x3a16 }
            boolean r0 = r2 instanceof X.C22645BHh     // Catch:{ all -> 0x3a16 }
            if (r0 == 0) goto L_0x1be1
            r3 = r2
            X.BHh r3 = (X.C22645BHh) r3     // Catch:{ all -> 0x3a16 }
        L_0x1be1:
            java.lang.String r5 = X.BE7.A0f(r7)     // Catch:{ all -> 0x3a16 }
            if (r8 == 0) goto L_0x1d19
            if (r3 == 0) goto L_0x1d19
            if (r5 == 0) goto L_0x1d19
            java.util.Map r0 = X.CEH.A00     // Catch:{ all -> 0x3a16 }
            java.lang.Object r0 = r0.get(r8)     // Catch:{ all -> 0x3a16 }
            java.util.Queue r0 = (java.util.Queue) r0     // Catch:{ all -> 0x3a16 }
            r9 = 0
            if (r0 == 0) goto L_0x1d19
            java.util.Iterator r8 = r0.iterator()     // Catch:{ all -> 0x3a16 }
        L_0x1bfa:
            boolean r0 = r8.hasNext()     // Catch:{ all -> 0x3a16 }
            if (r0 == 0) goto L_0x1c39
            java.lang.Object r2 = r8.next()     // Catch:{ all -> 0x3a16 }
            r0 = r2
            java.lang.ref.Reference r0 = (java.lang.ref.Reference) r0     // Catch:{ all -> 0x3a16 }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x3a16 }
            boolean r0 = X.C18070vi.A18(r0, r3)     // Catch:{ all -> 0x3a16 }
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x1bfa
        L_0x1c13:
            java.lang.ref.Reference r2 = (java.lang.ref.Reference) r2     // Catch:{ all -> 0x3a16 }
            if (r2 == 0) goto L_0x1d19
            java.lang.Object r0 = r2.get()     // Catch:{ all -> 0x3a16 }
            X.BHh r0 = (X.C22645BHh) r0     // Catch:{ all -> 0x3a16 }
            if (r0 == 0) goto L_0x1d19
            android.graphics.Rect r0 = r0.getLastKnownLocation()     // Catch:{ all -> 0x3a16 }
            int r9 = r0.left     // Catch:{ all -> 0x3a16 }
            int r8 = r0.top     // Catch:{ all -> 0x3a16 }
            int r10 = r0.width()     // Catch:{ all -> 0x3a16 }
            int r2 = r0.height()     // Catch:{ all -> 0x3a16 }
            int r11 = r5.hashCode()     // Catch:{ all -> 0x3a16 }
            r0 = -934437708(0xffffffffc84d9cb4, float:-210546.81)
            if (r11 == r0) goto L_0x1c51
            goto L_0x1c3b
        L_0x1c39:
            r2 = r9
            goto L_0x1c13
        L_0x1c3b:
            r0 = -711710159(0xffffffffd5942a31, float:-2.03636165E13)
            if (r11 == r0) goto L_0x1c46
            r0 = 109250890(0x683094a, float:4.929037E-35)
            if (r11 != r0) goto L_0x1d0b
            goto L_0x1c5c
        L_0x1c46:
            java.lang.String r0 = "scale_and_resize"
            boolean r0 = r5.equals(r0)     // Catch:{ all -> 0x3a16 }
            if (r0 == 0) goto L_0x1d0b
            java.lang.Integer r11 = X.AnonymousClass00R.A01     // Catch:{ all -> 0x3a16 }
            goto L_0x1c66
        L_0x1c51:
            java.lang.String r0 = "resize"
            boolean r0 = r5.equals(r0)     // Catch:{ all -> 0x3a16 }
            if (r0 == 0) goto L_0x1d0b
            java.lang.Integer r11 = X.AnonymousClass00R.A0C     // Catch:{ all -> 0x3a16 }
            goto L_0x1c66
        L_0x1c5c:
            java.lang.String r0 = "scale"
            boolean r0 = r5.equals(r0)     // Catch:{ all -> 0x3a16 }
            if (r0 == 0) goto L_0x1d0b
            java.lang.Integer r11 = X.AnonymousClass00R.A00     // Catch:{ all -> 0x3a16 }
        L_0x1c66:
            X.0Mi r0 = r3.A01     // Catch:{ all -> 0x3a16 }
            if (r0 != 0) goto L_0x1c93
            float[] r1 = new float[r1]     // Catch:{ all -> 0x3a16 }
            r0 = 1065353216(0x3f800000, float:1.0)
            r1[r4] = r0     // Catch:{ all -> 0x3a16 }
            android.animation.ValueAnimator r4 = android.animation.ValueAnimator.ofFloat(r1)     // Catch:{ all -> 0x3a16 }
            X.C18070vi.A0X(r4)     // Catch:{ all -> 0x3a16 }
        L_0x1c77:
            r1 = 0
            r0 = 35
            float r3 = r7.A03(r0, r1)     // Catch:{ all -> 0x3a16 }
            long r1 = X.C26258Cw3.A00     // Catch:{ all -> 0x3a16 }
            float r0 = (float) r1     // Catch:{ all -> 0x3a16 }
            float r3 = r3 * r0
            long r0 = (long) r3     // Catch:{ all -> 0x3a16 }
            r4.setDuration(r0)     // Catch:{ all -> 0x3a16 }
            java.lang.Object r0 = X.DFL.A00(r7, r6)     // Catch:{ all -> 0x3a16 }
            android.view.animation.Interpolator r0 = (android.view.animation.Interpolator) r0     // Catch:{ all -> 0x3a16 }
            if (r0 == 0) goto L_0x3a0f
            r4.setInterpolator(r0)     // Catch:{ all -> 0x3a16 }
            goto L_0x3a0f
        L_0x1c93:
            float r5 = (float) r10     // Catch:{ all -> 0x3a16 }
            float r2 = (float) r2     // Catch:{ all -> 0x3a16 }
            int r0 = r11.intValue()     // Catch:{ all -> 0x3a16 }
            if (r0 == r4) goto L_0x1cbd
            if (r0 == r1) goto L_0x1cde
            float[] r1 = new float[r1]     // Catch:{ all -> 0x3a16 }
            r0 = 1065353216(0x3f800000, float:1.0)
            r1[r4] = r0     // Catch:{ all -> 0x3a16 }
            android.animation.ValueAnimator r4 = android.animation.ValueAnimator.ofFloat(r1)     // Catch:{ all -> 0x3a16 }
            r24 = 0
            X.Cxh r0 = new X.Cxh     // Catch:{ all -> 0x3a16 }
            r17 = r0
            r18 = r4
            r19 = r3
            r20 = r5
            r21 = r2
            r22 = r9
            r23 = r8
            r17.<init>(r18, r19, r20, r21, r22, r23, r24)     // Catch:{ all -> 0x3a16 }
            goto L_0x1cfd
        L_0x1cbd:
            float[] r0 = X.C108945cZ.A1V()     // Catch:{ all -> 0x3a16 }
            r0 = {0, 1065353216} // fill-array     // Catch:{ all -> 0x3a16 }
            android.animation.ValueAnimator r4 = android.animation.ValueAnimator.ofFloat(r0)     // Catch:{ all -> 0x3a16 }
            r24 = 2
            X.Cxh r0 = new X.Cxh     // Catch:{ all -> 0x3a16 }
            r17 = r0
            r18 = r4
            r19 = r3
            r20 = r5
            r21 = r2
            r22 = r9
            r23 = r8
            r17.<init>(r18, r19, r20, r21, r22, r23, r24)     // Catch:{ all -> 0x3a16 }
            goto L_0x1cfd
        L_0x1cde:
            float[] r10 = new float[r1]     // Catch:{ all -> 0x3a16 }
            r0 = 1065353216(0x3f800000, float:1.0)
            r10[r4] = r0     // Catch:{ all -> 0x3a16 }
            android.animation.ValueAnimator r4 = android.animation.ValueAnimator.ofFloat(r10)     // Catch:{ all -> 0x3a16 }
            X.Cxh r0 = new X.Cxh     // Catch:{ all -> 0x3a16 }
            r17 = r0
            r18 = r4
            r19 = r3
            r20 = r5
            r21 = r2
            r22 = r9
            r23 = r8
            r24 = r1
            r17.<init>(r18, r19, r20, r21, r22, r23, r24)     // Catch:{ all -> 0x3a16 }
        L_0x1cfd:
            r4.addUpdateListener(r0)     // Catch:{ all -> 0x3a16 }
            r1 = 0
            X.CxO r0 = new X.CxO     // Catch:{ all -> 0x3a16 }
            r0.<init>(r3, r1)     // Catch:{ all -> 0x3a16 }
            r4.addListener(r0)     // Catch:{ all -> 0x3a16 }
            goto L_0x1c77
        L_0x1d0b:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x3a16 }
            java.lang.String r0 = "Invalid scale type: "
            r1.append(r0)     // Catch:{ all -> 0x3a16 }
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A12(r5, r1)     // Catch:{ all -> 0x3a16 }
            throw r0     // Catch:{ all -> 0x3a16 }
        L_0x1d19:
            float[] r1 = new float[r1]     // Catch:{ all -> 0x3a16 }
            r0 = 1065353216(0x3f800000, float:1.0)
            r1[r4] = r0     // Catch:{ all -> 0x3a16 }
            android.animation.ValueAnimator r3 = android.animation.ValueAnimator.ofFloat(r1)     // Catch:{ all -> 0x3a16 }
            goto L_0x3a10
        L_0x1d25:
            java.lang.String r2 = "bk.action.ttrc.CachedContentDisplayed"
            boolean r2 = r5.equals(r2)     // Catch:{ all -> 0x3a16 }
            if (r2 == 0) goto L_0x39f6
            X.C18070vi.A0d(r0, r4)     // Catch:{ all -> 0x3a16 }
            r8 = 0
            int r2 = A02(r0, r4)     // Catch:{ all -> 0x3a16 }
            java.lang.Object r3 = r0.A00(r1)     // Catch:{ all -> 0x3a16 }
            java.lang.String r1 = "null cannot be cast to non-null type kotlin.String"
            X.C18070vi.A0z(r3, r1)     // Catch:{ all -> 0x3a16 }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ all -> 0x3a16 }
            r1 = 2
            java.lang.String r7 = A0L(r0, r1)     // Catch:{ all -> 0x3a16 }
            r1 = 3
            java.lang.Object r5 = r0.A00(r1)     // Catch:{ all -> 0x3a16 }
            java.lang.String r1 = "null cannot be cast to non-null type kotlin.Long"
            X.C18070vi.A0z(r5, r1)     // Catch:{ all -> 0x3a16 }
            java.lang.Long r5 = (java.lang.Long) r5     // Catch:{ all -> 0x3a16 }
            long r5 = r5.longValue()     // Catch:{ all -> 0x3a16 }
            r1 = 4
            java.util.List r0 = r0.A00     // Catch:{ all -> 0x3a16 }
            X.DFL r1 = X.AnonymousClass8BR.A0G(r0, r1)     // Catch:{ all -> 0x3a16 }
            X.C25995CqB.A00()     // Catch:{ all -> 0x3a16 }
            long r9 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x3a16 }
            if (r1 == 0) goto L_0x1d6b
            r0 = 35
            boolean r8 = r1.A0I(r0, r4)     // Catch:{ all -> 0x3a16 }
        L_0x1d6b:
            r0 = 2
            X.C18070vi.A0d(r7, r0)     // Catch:{ all -> 0x3a16 }
            X.A8s r4 = X.A7e.A00(r3, r2)     // Catch:{ all -> 0x3a16 }
            if (r4 == 0) goto L_0x3a04
            r4.A0B(r5, r7, r8, r9)     // Catch:{ all -> 0x3a16 }
            goto L_0x3a04
        L_0x1d7a:
            java.lang.String r3 = "bk.action.animated.SetCurrentPlayTime"
            boolean r3 = r5.equals(r3)     // Catch:{ all -> 0x3a16 }
            if (r3 == 0) goto L_0x39f6
            X.DOZ r6 = A07(r2, r0)     // Catch:{ all -> 0x3a16 }
            r3 = 0
            if (r6 == 0) goto L_0x3a10
            java.lang.String r2 = A0M(r0, r4)     // Catch:{ all -> 0x3a16 }
            float r5 = A00(r0, r1)     // Catch:{ all -> 0x3a16 }
            android.animation.Animator r4 = X.C26258Cw3.A02(r6, r2)     // Catch:{ all -> 0x3a16 }
            if (r4 == 0) goto L_0x3a10
            long r1 = X.C26258Cw3.A00     // Catch:{ all -> 0x3a16 }
            float r0 = (float) r1     // Catch:{ all -> 0x3a16 }
            float r5 = r5 * r0
            long r0 = (long) r5     // Catch:{ all -> 0x3a16 }
            X.C26258Cw3.A04(r4, r0)     // Catch:{ all -> 0x3a16 }
            goto L_0x3a10
        L_0x1da1:
            java.lang.String r3 = "bk.action.hcollection.SetOffset"
            boolean r3 = r5.equals(r3)     // Catch:{ all -> 0x3a16 }
            if (r3 == 0) goto L_0x39f6
            X.DFL r6 = A0E(r0, r2)     // Catch:{ all -> 0x3a16 }
            float r5 = A00(r0, r1)     // Catch:{ all -> 0x3a16 }
            r1 = 2
            java.lang.Object r1 = r0.A00(r1)     // Catch:{ all -> 0x3a16 }
            boolean r3 = X.C25343Ce2.A01(r1)     // Catch:{ all -> 0x3a16 }
            r1 = 3
            X.ClD r2 = A05(r2, r6, r0, r1)     // Catch:{ all -> 0x3a16 }
            if (r2 == 0) goto L_0x3a04
            X.CqB r0 = X.C25995CqB.A00()     // Catch:{ all -> 0x3a16 }
            android.content.Context r0 = r0.A00     // Catch:{ all -> 0x3a16 }
            X.C18070vi.A0X(r0)     // Catch:{ all -> 0x3a16 }
            float r0 = X.C25342Ce1.A00(r0, r5)     // Catch:{ all -> 0x3a16 }
            int r1 = (int) r0     // Catch:{ all -> 0x3a16 }
            boolean r0 = X.C26176Ctu.A03()     // Catch:{ all -> 0x3a16 }
            if (r0 == 0) goto L_0x1dec
            boolean r0 = X.C26176Ctu.A03()     // Catch:{ all -> 0x3a16 }
            if (r0 == 0) goto L_0x1de5
            X.CU5 r0 = r2.A02     // Catch:{ all -> 0x3a16 }
            int r0 = r0.A04     // Catch:{ all -> 0x3a16 }
            int r1 = r1 - r0
            r2.A00(r1, r4, r3)     // Catch:{ all -> 0x3a16 }
            goto L_0x3a04
        L_0x1de5:
            java.lang.String r0 = "Cannot getScroll off the main thread!"
            java.lang.RuntimeException r0 = X.AnonymousClass8BR.A0w(r0)     // Catch:{ all -> 0x3a16 }
            throw r0     // Catch:{ all -> 0x3a16 }
        L_0x1dec:
            java.lang.String r0 = "setXOffset cannot be called from a background thread."
            java.lang.RuntimeException r0 = X.AnonymousClass8BR.A0w(r0)     // Catch:{ all -> 0x3a16 }
            throw r0     // Catch:{ all -> 0x3a16 }
        L_0x1df3:
            java.lang.String r3 = "bk.action.bloks.InsertChildrenBefore"
            boolean r3 = r5.equals(r3)     // Catch:{ all -> 0x3a16 }
            if (r3 == 0) goto L_0x39f6
            java.lang.Object r3 = A0J(r0, r2)     // Catch:{ all -> 0x3a16 }
            java.lang.String r1 = "null cannot be cast to non-null type kotlin.collections.List<com.instagram.common.bloks.component.base.BloksModel>"
            java.util.List r3 = X.BE6.A13(r3, r1)     // Catch:{ all -> 0x3a16 }
            java.lang.String r1 = A0K(r0)     // Catch:{ all -> 0x3a16 }
            X.DNk r5 = A0B(r2, r0)     // Catch:{ all -> 0x3a16 }
            X.DNl r6 = A0C(r1)     // Catch:{ all -> 0x3a16 }
            X.Bog r2 = new X.Bog     // Catch:{ all -> 0x3a16 }
            r2.<init>(r3, r4, r1)     // Catch:{ all -> 0x3a16 }
            goto L_0x35f2
        L_0x1e18:
            java.lang.String r3 = "bk.action.bloks.WriteGlobalConsistencyStore"
            boolean r3 = r5.equals(r3)     // Catch:{ all -> 0x3a16 }
            if (r3 == 0) goto L_0x39f6
            X.C18070vi.A0d(r0, r4)     // Catch:{ all -> 0x3a16 }
            X.C18070vi.A0d(r2, r1)     // Catch:{ all -> 0x3a16 }
            java.util.List r0 = r0.A00     // Catch:{ all -> 0x3a16 }
            java.lang.Object r4 = r0.get(r4)     // Catch:{ all -> 0x3a16 }
            X.AnonymousClass8BR.A1I(r4)     // Catch:{ all -> 0x3a16 }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ all -> 0x3a16 }
            java.lang.Object r3 = r0.get(r1)     // Catch:{ all -> 0x3a16 }
            X.DOZ r1 = r2.A00     // Catch:{ all -> 0x3a16 }
            if (r1 == 0) goto L_0x1e57
            java.lang.String r0 = "gs"
            X.E89 r1 = X.C26272CwJ.A02(r1, r0)     // Catch:{ all -> 0x3a16 }
            if (r1 == 0) goto L_0x1e4e
            boolean r0 = r1 instanceof X.C26960DNi     // Catch:{ all -> 0x3a16 }
            if (r0 == 0) goto L_0x1e4e
            X.DNi r1 = (X.C26960DNi) r1     // Catch:{ all -> 0x3a16 }
            X.Cjj r0 = r1.A00     // Catch:{ all -> 0x3a16 }
            r0.A01(r4, r3)     // Catch:{ all -> 0x3a16 }
            goto L_0x3a04
        L_0x1e4e:
            java.lang.String r1 = "BKBloksActionBloksWriteGlobalConsistencyStoreImpl"
        L_0x1e50:
            java.lang.String r0 = "Global State Module not found"
        L_0x1e52:
            X.C25913CoX.A01(r1, r0)     // Catch:{ all -> 0x3a16 }
            goto L_0x3a04
        L_0x1e57:
            java.lang.IllegalStateException r0 = X.C17880vN.A0g()     // Catch:{ all -> 0x3a16 }
            throw r0     // Catch:{ all -> 0x3a16 }
        L_0x1e5c:
            java.lang.String r3 = "bk.action.DispatchAsync"
            boolean r3 = r5.equals(r3)     // Catch:{ all -> 0x3a16 }
            if (r3 == 0) goto L_0x39f6
            java.lang.Object r5 = A0H(r0, r2)     // Catch:{ all -> 0x3a16 }
            java.lang.String r3 = "null cannot be cast to non-null type android.os.Handler"
            X.C18070vi.A0z(r5, r3)     // Catch:{ all -> 0x3a16 }
            android.os.Handler r5 = (android.os.Handler) r5     // Catch:{ all -> 0x3a16 }
            X.E8A r6 = X.C25488Cgj.A00(r0, r1)     // Catch:{ all -> 0x3a16 }
            boolean r0 = X.C26176Ctu.A03()     // Catch:{ all -> 0x3a16 }
            if (r0 != 0) goto L_0x1e8a
            android.os.Looper r1 = r5.getLooper()     // Catch:{ all -> 0x3a16 }
            android.os.Looper r0 = android.os.Looper.getMainLooper()     // Catch:{ all -> 0x3a16 }
            boolean r0 = X.C18070vi.A18(r1, r0)     // Catch:{ all -> 0x3a16 }
            if (r0 == 0) goto L_0x1e8a
            r0 = 34
            goto L_0x1ee4
        L_0x1e8a:
            boolean r0 = X.C26176Ctu.A03()     // Catch:{ all -> 0x3a16 }
            if (r0 == 0) goto L_0x1ee2
            android.os.Looper r1 = r5.getLooper()     // Catch:{ all -> 0x3a16 }
            android.os.Looper r0 = android.os.Looper.getMainLooper()     // Catch:{ all -> 0x3a16 }
            boolean r0 = X.C18070vi.A18(r1, r0)     // Catch:{ all -> 0x3a16 }
            if (r0 != 0) goto L_0x1ee2
            X.DOZ r4 = r2.A00     // Catch:{ all -> 0x3a16 }
            if (r4 != 0) goto L_0x1ea3
            goto L_0x1ee1
        L_0x1ea3:
            java.util.List r3 = r2.A06     // Catch:{ all -> 0x3a16 }
            X.DNk r0 = X.C26272CwJ.A01(r4)     // Catch:{ all -> 0x3a16 }
            X.CrK r21 = r0.A06()     // Catch:{ all -> 0x3a16 }
            X.B6x r26 = X.C26272CwJ.A03(r4)     // Catch:{ all -> 0x3a16 }
            X.CFu r23 = new X.CFu     // Catch:{ all -> 0x3a16 }
            r23.<init>()     // Catch:{ all -> 0x3a16 }
            r0 = 2131428171(0x7f0b034b, float:1.8477979E38)
            java.lang.Object r1 = X.DOZ.A00(r4, r0)     // Catch:{ all -> 0x3a16 }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ all -> 0x3a16 }
            java.lang.Integer r27 = X.AnonymousClass00R.A01     // Catch:{ all -> 0x3a16 }
            X.9zJ r0 = r2.A05     // Catch:{ all -> 0x3a16 }
            r18 = 0
            X.Boh r2 = new X.Boh     // Catch:{ all -> 0x3a16 }
            r22 = r18
            r29 = r18
            r31 = r18
            r32 = r18
            r17 = r2
            r19 = r18
            r20 = r4
            r24 = r0
            r25 = r6
            r28 = r1
            r30 = r3
            r17.<init>(r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32)     // Catch:{ all -> 0x3a16 }
            goto L_0x1ee2
        L_0x1ee1:
            r2 = 0
        L_0x1ee2:
            r0 = 35
        L_0x1ee4:
            X.BE7.A19(r5, r6, r2, r0)     // Catch:{ all -> 0x3a16 }
            goto L_0x3a04
        L_0x1ee9:
            java.lang.String r3 = "bk.action.animated.CancelWithToken"
        L_0x1eeb:
            boolean r3 = r5.equals(r3)     // Catch:{ all -> 0x3a16 }
            if (r3 == 0) goto L_0x39f6
            X.DOZ r1 = A07(r2, r0)     // Catch:{ all -> 0x3a16 }
            r3 = 0
            if (r1 == 0) goto L_0x3a10
            java.lang.String r0 = A0M(r0, r4)     // Catch:{ all -> 0x3a16 }
            android.animation.Animator r0 = X.C26258Cw3.A02(r1, r0)     // Catch:{ all -> 0x3a16 }
            if (r0 == 0) goto L_0x3a10
            r0.cancel()     // Catch:{ all -> 0x3a16 }
            goto L_0x3a10
        L_0x1f07:
            java.lang.String r3 = "bk.action.textinput.GetText"
            boolean r3 = r5.equals(r3)     // Catch:{ all -> 0x3a16 }
            if (r3 == 0) goto L_0x39f6
            X.DFL r5 = A0E(r0, r2)     // Catch:{ all -> 0x3a16 }
            X.DOZ r1 = A06(r2, r0, r1)     // Catch:{ all -> 0x3a16 }
            r0 = 99
            boolean r0 = r5.A0I(r0, r4)     // Catch:{ all -> 0x3a16 }
            r3 = 0
            if (r0 != 0) goto L_0x3a10
            java.lang.Object r1 = X.C26272CwJ.A04(r1, r5)     // Catch:{ all -> 0x3a16 }
            java.lang.String r4 = ""
            boolean r0 = r1 instanceof X.CTH     // Catch:{ all -> 0x3a16 }
            if (r0 == 0) goto L_0x3a10
            X.CTH r1 = (X.CTH) r1     // Catch:{ all -> 0x3a16 }
            com.facebook.primitive.textinput.TextInputView r0 = r1.A02     // Catch:{ all -> 0x3a16 }
            if (r0 == 0) goto L_0x1f39
            android.text.Editable r0 = r0.getText()     // Catch:{ all -> 0x3a16 }
            if (r0 == 0) goto L_0x1f39
        L_0x1f36:
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0     // Catch:{ all -> 0x3a16 }
            goto L_0x1f3f
        L_0x1f39:
            java.lang.CharSequence r0 = r1.A05     // Catch:{ all -> 0x3a16 }
            if (r0 != 0) goto L_0x1f3f
            r0 = r4
            goto L_0x1f36
        L_0x1f3f:
            if (r0 == 0) goto L_0x3a0f
            java.lang.String r3 = r0.toString()     // Catch:{ all -> 0x3a16 }
            if (r3 != 0) goto L_0x3a10
            goto L_0x3a0f
        L_0x1f49:
            java.lang.String r3 = "bk.action.bloks.RemoveChildrenBetween"
            boolean r3 = r5.equals(r3)     // Catch:{ all -> 0x3a16 }
            if (r3 == 0) goto L_0x39f6
            java.lang.Object r7 = A0I(r0, r2)     // Catch:{ all -> 0x3a16 }
            java.lang.String r3 = "null cannot be cast to non-null type com.instagram.common.bloks.component.base.BloksModel"
            X.C18070vi.A0z(r7, r3)     // Catch:{ all -> 0x3a16 }
            X.DFL r7 = (X.DFL) r7     // Catch:{ all -> 0x3a16 }
            java.lang.Object r1 = r0.A00(r1)     // Catch:{ all -> 0x3a16 }
            X.C18070vi.A0X(r1)     // Catch:{ all -> 0x3a16 }
            java.lang.String r6 = X.CCF.A00(r1)     // Catch:{ all -> 0x3a16 }
            java.lang.String r5 = A0K(r0)     // Catch:{ all -> 0x3a16 }
            X.DNk r4 = A0B(r2, r0)     // Catch:{ all -> 0x3a16 }
            int r0 = r7.A04     // Catch:{ all -> 0x3a16 }
            long r2 = (long) r0     // Catch:{ all -> 0x3a16 }
            X.Bob r1 = new X.Bob     // Catch:{ all -> 0x3a16 }
            r1.<init>(r6, r5)     // Catch:{ all -> 0x3a16 }
            X.DNm r0 = new X.DNm     // Catch:{ all -> 0x3a16 }
            r0.<init>(r2)     // Catch:{ all -> 0x3a16 }
            r4.A0A(r0, r1)     // Catch:{ all -> 0x3a16 }
            goto L_0x3a04
        L_0x1f81:
            java.lang.String r6 = "bk.action.array.Slice"
            boolean r2 = r5.equals(r6)     // Catch:{ all -> 0x3a16 }
            if (r2 == 0) goto L_0x39f6
            java.lang.Object r3 = A0G(r0)     // Catch:{ all -> 0x3a16 }
            java.lang.String r2 = "null cannot be cast to non-null type java.util.List<kotlin.Any>"
            java.util.List r4 = X.BE6.A13(r3, r2)     // Catch:{ all -> 0x3a16 }
            int r2 = A02(r0, r1)     // Catch:{ all -> 0x3a16 }
            r1 = 2
            java.lang.Object r1 = X.BE6.A0n(r0, r1)     // Catch:{ all -> 0x3a16 }
            java.lang.Number r1 = (java.lang.Number) r1     // Catch:{ all -> 0x3a16 }
            r3 = 0
            if (r2 < 0) goto L_0x1fca
            int r0 = r4.size()     // Catch:{ all -> 0x3a16 }
            if (r2 >= r0) goto L_0x1fca
            if (r1 != 0) goto L_0x1fae
            int r0 = r4.size()     // Catch:{ all -> 0x3a16 }
            goto L_0x1fc4
        L_0x1fae:
            int r0 = r1.intValue()     // Catch:{ all -> 0x3a16 }
            if (r0 >= 0) goto L_0x1fb7
            java.lang.String r0 = "argument length cannot be negative"
            goto L_0x1fcc
        L_0x1fb7:
            int r1 = r1.intValue()     // Catch:{ all -> 0x3a16 }
            int r1 = r1 + r2
            int r0 = r4.size()     // Catch:{ all -> 0x3a16 }
            int r0 = java.lang.Math.min(r1, r0)     // Catch:{ all -> 0x3a16 }
        L_0x1fc4:
            java.util.List r3 = r4.subList(r2, r0)     // Catch:{ all -> 0x3a16 }
            goto L_0x3a10
        L_0x1fca:
            java.lang.String r0 = "argument offset is out of bounds"
        L_0x1fcc:
            X.C25913CoX.A01(r6, r0)     // Catch:{ all -> 0x3a16 }
            goto L_0x3a10
        L_0x1fd1:
            java.lang.String r2 = "bk.action.ttrc.AddPoint"
            boolean r2 = r5.equals(r2)     // Catch:{ all -> 0x3a16 }
            if (r2 == 0) goto L_0x39f6
            X.C18070vi.A0d(r0, r4)     // Catch:{ all -> 0x3a16 }
            int r5 = A02(r0, r4)     // Catch:{ all -> 0x3a16 }
            java.lang.Object r4 = r0.A00(r1)     // Catch:{ all -> 0x3a16 }
            java.lang.String r1 = "null cannot be cast to non-null type kotlin.String"
            X.C18070vi.A0z(r4, r1)     // Catch:{ all -> 0x3a16 }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ all -> 0x3a16 }
            r1 = 2
            java.lang.String r2 = A0L(r0, r1)     // Catch:{ all -> 0x3a16 }
            r1 = 3
            java.lang.Object r1 = r0.A00(r1)     // Catch:{ all -> 0x3a16 }
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.collections.Map<kotlin.Any, kotlin.Any>"
            X.C18070vi.A0z(r1, r0)     // Catch:{ all -> 0x3a16 }
            java.util.Map r1 = (java.util.Map) r1     // Catch:{ all -> 0x3a16 }
            r3 = 0
            X.A7e.A03(r3, r4, r2, r1, r5)     // Catch:{ all -> 0x3a16 }
            goto L_0x3a10
        L_0x2002:
            java.lang.String r2 = "bk.action.ttrc.AddQuery"
            boolean r2 = r5.equals(r2)     // Catch:{ all -> 0x3a16 }
            if (r2 == 0) goto L_0x39f6
            java.lang.Object r2 = A0G(r0)     // Catch:{ all -> 0x3a16 }
            java.lang.String r5 = "null cannot be cast to non-null type kotlin.Number"
            X.C18070vi.A0z(r2, r5)     // Catch:{ all -> 0x3a16 }
            int r3 = X.AnonymousClass000.A0M(r2)     // Catch:{ all -> 0x3a16 }
            java.lang.Object r2 = r0.A00(r1)     // Catch:{ all -> 0x3a16 }
            java.lang.String r1 = "null cannot be cast to non-null type kotlin.String"
            X.C18070vi.A0z(r2, r1)     // Catch:{ all -> 0x3a16 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ all -> 0x3a16 }
            r1 = 2
            java.lang.String r4 = A0L(r0, r1)     // Catch:{ all -> 0x3a16 }
            r1 = 3
            java.lang.Object r0 = r0.A00(r1)     // Catch:{ all -> 0x3a16 }
            X.C18070vi.A0z(r0, r5)     // Catch:{ all -> 0x3a16 }
            int r1 = X.AnonymousClass000.A0M(r0)     // Catch:{ all -> 0x3a16 }
            r0 = 2
            X.C18070vi.A0d(r4, r0)     // Catch:{ all -> 0x3a16 }
            X.A8s r3 = X.A7e.A00(r2, r3)     // Catch:{ all -> 0x3a16 }
            if (r3 == 0) goto L_0x3a04
            long r1 = (long) r1     // Catch:{ all -> 0x3a16 }
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ all -> 0x3a16 }
            r3.A0K(r4, r0, r1)     // Catch:{ all -> 0x3a16 }
            goto L_0x3a04
        L_0x2045:
            java.lang.String r2 = "bk.action.string.FromProvider"
            boolean r2 = r5.equals(r2)     // Catch:{ all -> 0x3a16 }
            if (r2 == 0) goto L_0x39f6
            X.C18070vi.A0d(r0, r4)     // Catch:{ all -> 0x3a16 }
            X.DFL r0 = A0D(r0, r4)     // Catch:{ all -> 0x3a16 }
            java.lang.String r3 = X.CBz.A00(r0)     // Catch:{ all -> 0x3a16 }
            goto L_0x3a10
        L_0x205a:
            java.lang.String r3 = "bk.action.bloks.RequestFocus"
            boolean r3 = r5.equals(r3)     // Catch:{ all -> 0x3a16 }
            if (r3 == 0) goto L_0x39f6
            java.lang.Object r3 = A0I(r0, r2)     // Catch:{ all -> 0x3a16 }
            X.DFL r3 = (X.DFL) r3     // Catch:{ all -> 0x3a16 }
            if (r3 == 0) goto L_0x2863
            X.DOZ r0 = r2.A00     // Catch:{ all -> 0x3a16 }
            android.view.View r0 = r3.A06(r0)     // Catch:{ all -> 0x3a16 }
            if (r0 == 0) goto L_0x2863
            boolean r0 = r0.requestFocus()     // Catch:{ all -> 0x3a16 }
            if (r0 == 0) goto L_0x2863
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r1)     // Catch:{ all -> 0x3a16 }
            goto L_0x3a10
        L_0x207e:
            java.lang.String r3 = "bk.action.collection.SetIndex"
            boolean r3 = r5.equals(r3)     // Catch:{ all -> 0x3a16 }
            if (r3 == 0) goto L_0x39f6
            X.DFL r5 = A0E(r0, r2)     // Catch:{ all -> 0x3a16 }
            int r4 = A02(r0, r1)     // Catch:{ all -> 0x3a16 }
            r1 = 2
            java.lang.Object r1 = r0.A00(r1)     // Catch:{ all -> 0x3a16 }
            boolean r3 = X.C25343Ce2.A01(r1)     // Catch:{ all -> 0x3a16 }
            r1 = 3
            X.ClD r0 = A05(r2, r5, r0, r1)     // Catch:{ all -> 0x3a16 }
            if (r0 == 0) goto L_0x3a04
            r0.A01(r4, r3)     // Catch:{ all -> 0x3a16 }
            goto L_0x3a04
        L_0x20a3:
            java.lang.String r3 = "bk.action.hcollection.GetOffset"
            boolean r3 = r5.equals(r3)     // Catch:{ all -> 0x3a16 }
            if (r3 == 0) goto L_0x39f6
            X.DFL r3 = A0E(r0, r2)     // Catch:{ all -> 0x3a16 }
            X.ClD r2 = A05(r2, r3, r0, r1)     // Catch:{ all -> 0x3a16 }
            if (r2 == 0) goto L_0x3a04
            X.CqB r0 = X.C25995CqB.A00()     // Catch:{ all -> 0x3a16 }
            android.content.Context r1 = r0.A00     // Catch:{ all -> 0x3a16 }
            X.C18070vi.A0X(r1)     // Catch:{ all -> 0x3a16 }
            boolean r0 = X.C26176Ctu.A03()     // Catch:{ all -> 0x3a16 }
            if (r0 == 0) goto L_0x20d4
            X.CU5 r0 = r2.A02     // Catch:{ all -> 0x3a16 }
            int r0 = r0.A04     // Catch:{ all -> 0x3a16 }
            float r0 = (float) r0     // Catch:{ all -> 0x3a16 }
            float r0 = X.C25342Ce1.A01(r1, r0)     // Catch:{ all -> 0x3a16 }
            double r0 = (double) r0     // Catch:{ all -> 0x3a16 }
            java.lang.Number r3 = X.C25343Ce2.A00(r0)     // Catch:{ all -> 0x3a16 }
            goto L_0x3a10
        L_0x20d4:
            java.lang.String r0 = "Cannot getScroll off the main thread!"
            java.lang.RuntimeException r0 = X.AnonymousClass8BR.A0w(r0)     // Catch:{ all -> 0x3a16 }
            throw r0     // Catch:{ all -> 0x3a16 }
        L_0x20db:
            java.lang.String r3 = "bk.action.callback.MakeWithScopeOnly"
            boolean r3 = r5.equals(r3)     // Catch:{ all -> 0x3a16 }
            if (r3 == 0) goto L_0x39f6
            X.C18070vi.A0d(r0, r4)     // Catch:{ all -> 0x3a16 }
            X.C18070vi.A0d(r2, r1)     // Catch:{ all -> 0x3a16 }
            X.E8A r1 = X.C25488Cgj.A00(r0, r4)     // Catch:{ all -> 0x3a16 }
            java.util.List r0 = r2.A06     // Catch:{ all -> 0x3a16 }
            X.C18070vi.A0W(r0)     // Catch:{ all -> 0x3a16 }
            X.Ci0 r3 = new X.Ci0     // Catch:{ all -> 0x3a16 }
            r3.<init>((X.E8A) r1, (java.util.List) r0)     // Catch:{ all -> 0x3a16 }
            goto L_0x3a10
        L_0x20f9:
            java.lang.String r3 = "bk.action.textinput.SetTextV2"
            boolean r3 = r5.equals(r3)     // Catch:{ all -> 0x3a16 }
            if (r3 == 0) goto L_0x39f6
            X.DFL r3 = A0E(r0, r2)     // Catch:{ all -> 0x3a16 }
            java.lang.Object r5 = r0.A00(r1)     // Catch:{ all -> 0x3a16 }
            java.lang.String r1 = "null cannot be cast to non-null type kotlin.CharSequence"
            X.C18070vi.A0z(r5, r1)     // Catch:{ all -> 0x3a16 }
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5     // Catch:{ all -> 0x3a16 }
            r1 = 2
            X.DOZ r0 = A06(r2, r0, r1)     // Catch:{ all -> 0x3a16 }
            java.lang.Object r2 = X.C26272CwJ.A04(r0, r3)     // Catch:{ all -> 0x3a16 }
            boolean r0 = r2 instanceof X.CTH     // Catch:{ all -> 0x3a16 }
            if (r0 == 0) goto L_0x3a04
            X.CTH r2 = (X.CTH) r2     // Catch:{ all -> 0x3a16 }
            X.C18070vi.A0d(r5, r4)     // Catch:{ all -> 0x3a16 }
            r0 = 0
            r1 = 1
            X.C26176Ctu.A02(r0)     // Catch:{ all -> 0x3a16 }
            com.facebook.primitive.textinput.TextInputView r3 = r2.A02     // Catch:{ all -> 0x3a16 }
            r2.A04 = r0     // Catch:{ all -> 0x3a16 }
            if (r3 != 0) goto L_0x2131
            r2.A04 = r5     // Catch:{ all -> 0x3a16 }
            goto L_0x3a04
        L_0x2131:
            android.text.Editable r0 = r3.getText()     // Catch:{ all -> 0x3a16 }
            int r2 = r0.length()     // Catch:{ all -> 0x3a16 }
            int r0 = r3.getSelectionEnd()     // Catch:{ all -> 0x3a16 }
            int r2 = r2 - r0
            int r0 = r3.getSelectionEnd()     // Catch:{ all -> 0x3a16 }
            if (r0 == 0) goto L_0x2145
            r1 = 0
        L_0x2145:
            r3.setText(r5)     // Catch:{ all -> 0x3a16 }
            if (r1 != 0) goto L_0x3a04
            int r1 = r5.length()     // Catch:{ all -> 0x3a16 }
            int r0 = r5.length()     // Catch:{ all -> 0x3a16 }
            if (r1 < r2) goto L_0x2155
            int r0 = r0 - r2
        L_0x2155:
            r3.setSelection(r0)     // Catch:{ all -> 0x3a16 }
            goto L_0x3a04
        L_0x215a:
            java.lang.String r3 = "bk.action.bloks.WriteLocalState"
            boolean r3 = r5.equals(r3)     // Catch:{ all -> 0x3a16 }
            if (r3 == 0) goto L_0x39f6
            X.DOZ r7 = A07(r2, r0)     // Catch:{ all -> 0x3a16 }
            if (r7 == 0) goto L_0x21bb
            java.util.List r3 = r0.A00     // Catch:{ all -> 0x3a16 }
            java.lang.String r6 = X.C17880vN.A0w(r3, r4)     // Catch:{ all -> 0x3a16 }
            java.lang.Object r5 = r3.get(r1)     // Catch:{ all -> 0x3a16 }
            r0 = 2
            java.lang.Object r1 = r3.get(r0)     // Catch:{ all -> 0x3a16 }
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.Number"
            X.C18070vi.A0z(r1, r0)     // Catch:{ all -> 0x3a16 }
            int r4 = X.AnonymousClass000.A0M(r1)     // Catch:{ all -> 0x3a16 }
            r3 = 0
            if (r6 == 0) goto L_0x3a10
            java.util.List r1 = r2.A06     // Catch:{ all -> 0x3a16 }
            if (r4 != 0) goto L_0x2195
            X.DNk r2 = X.C26272CwJ.A01(r7)     // Catch:{ all -> 0x3a16 }
            X.Bno r1 = new X.Bno     // Catch:{ all -> 0x3a16 }
            r1.<init>(r6, r5)     // Catch:{ all -> 0x3a16 }
        L_0x2190:
            r2.A09(r1)     // Catch:{ all -> 0x3a16 }
            goto L_0x3a10
        L_0x2195:
            if (r1 == 0) goto L_0x21b4
            int r0 = r1.size()     // Catch:{ all -> 0x3a16 }
            if (r4 > r0) goto L_0x21ad
            java.lang.Integer r0 = X.AnonymousClass00R.A00     // Catch:{ all -> 0x3a16 }
            java.lang.String r0 = X.C25968Cpa.A00(r0, r6, r1, r4)     // Catch:{ all -> 0x3a16 }
            X.DNk r2 = X.C26272CwJ.A01(r7)     // Catch:{ all -> 0x3a16 }
            X.Bno r1 = new X.Bno     // Catch:{ all -> 0x3a16 }
            r1.<init>(r0, r5)     // Catch:{ all -> 0x3a16 }
            goto L_0x2190
        L_0x21ad:
            java.lang.String r0 = "Depth supplied should never exceed the size of the key path."
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0k(r0)     // Catch:{ all -> 0x3a16 }
            throw r0     // Catch:{ all -> 0x3a16 }
        L_0x21b4:
            java.lang.String r0 = "Keypath must be set on environment if trying to WriteLocalState on a depth larger than 0."
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0k(r0)     // Catch:{ all -> 0x3a16 }
            throw r0     // Catch:{ all -> 0x3a16 }
        L_0x21bb:
            java.lang.String r0 = "Called WriteLocalState when not attached to a tree"
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0n(r0)     // Catch:{ all -> 0x3a16 }
            throw r0     // Catch:{ all -> 0x3a16 }
        L_0x21c2:
            java.lang.String r3 = "bk.action.component.SetAttr"
            boolean r3 = r5.equals(r3)     // Catch:{ all -> 0x3a16 }
            if (r3 == 0) goto L_0x39f6
            X.C18070vi.A0d(r0, r4)     // Catch:{ all -> 0x3a16 }
            X.C18070vi.A0d(r2, r1)     // Catch:{ all -> 0x3a16 }
            java.util.List r6 = r0.A00     // Catch:{ all -> 0x3a16 }
            X.DFL r3 = X.AnonymousClass8BR.A0G(r6, r4)     // Catch:{ all -> 0x3a16 }
            java.lang.Object r9 = r6.get(r1)     // Catch:{ all -> 0x3a16 }
            X.AnonymousClass8BR.A1I(r9)     // Catch:{ all -> 0x3a16 }
            java.lang.String r9 = (java.lang.String) r9     // Catch:{ all -> 0x3a16 }
            r5 = 2
            java.lang.Object r5 = r6.get(r5)     // Catch:{ all -> 0x3a16 }
            r8 = 3
            X.DOZ r7 = A06(r2, r0, r8)     // Catch:{ all -> 0x3a16 }
            int r6 = X.CCB.A00(r9)     // Catch:{ all -> 0x3a16 }
            r0 = 32
            if (r6 >= r0) goto L_0x2211
            java.lang.Object[] r2 = new java.lang.Object[r8]     // Catch:{ all -> 0x3a16 }
            X.C17880vN.A1T(r2, r6, r4)     // Catch:{ all -> 0x3a16 }
            r2[r1] = r9     // Catch:{ all -> 0x3a16 }
            if (r3 == 0) goto L_0x2201
            int r0 = r3.A05     // Catch:{ all -> 0x3a16 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x3a16 }
            goto L_0x2203
        L_0x2201:
            java.lang.String r1 = "unknown"
        L_0x2203:
            r0 = 2
            r2[r0] = r1     // Catch:{ all -> 0x3a16 }
            java.lang.String r0 = "Encountered invalid minified key: %s, raw: %s for styleId: %s while unwrapping binding expression"
            java.lang.String r1 = java.lang.String.format(r0, r2)     // Catch:{ all -> 0x3a16 }
            java.lang.String r0 = "BKBloksActionComponentSetAttrImpl"
            X.C25913CoX.A01(r0, r1)     // Catch:{ all -> 0x3a16 }
        L_0x2211:
            java.lang.Object r1 = X.C26272CwJ.A04(r7, r3)     // Catch:{ all -> 0x3a16 }
            if (r1 == 0) goto L_0x2223
            boolean r0 = r1 instanceof X.E6D     // Catch:{ all -> 0x3a16 }
            if (r0 == 0) goto L_0x2223
            X.E6D r1 = (X.E6D) r1     // Catch:{ all -> 0x3a16 }
            boolean r0 = r1.CHw(r7, r5, r6)     // Catch:{ all -> 0x3a16 }
            if (r0 != 0) goto L_0x2237
        L_0x2223:
            X.DNk r4 = X.C26272CwJ.A01(r7)     // Catch:{ all -> 0x3a16 }
            int r0 = r3.A04     // Catch:{ all -> 0x3a16 }
            long r2 = (long) r0     // Catch:{ all -> 0x3a16 }
            X.Bof r1 = new X.Bof     // Catch:{ all -> 0x3a16 }
            r1.<init>(r6, r5)     // Catch:{ all -> 0x3a16 }
            X.DNm r0 = new X.DNm     // Catch:{ all -> 0x3a16 }
            r0.<init>(r2)     // Catch:{ all -> 0x3a16 }
            r4.A0A(r0, r1)     // Catch:{ all -> 0x3a16 }
        L_0x2237:
            X.1Wu r3 = X.C27621Wu.A00     // Catch:{ all -> 0x3a16 }
            goto L_0x3a10
        L_0x223b:
            java.lang.String r2 = "bk.action.animated.GetCurrentDimensionValue"
            boolean r2 = r5.equals(r2)     // Catch:{ all -> 0x3a16 }
            if (r2 == 0) goto L_0x39f6
            java.lang.Object r2 = A0G(r0)     // Catch:{ all -> 0x3a16 }
            java.lang.String r0 = "null cannot be cast to non-null type com.bloks.stdlib.animation.BloksDimensionValueAnimator"
            X.C18070vi.A0z(r2, r0)     // Catch:{ all -> 0x3a16 }
            X.BNG r2 = (X.BNG) r2     // Catch:{ all -> 0x3a16 }
            java.lang.Object r6 = r2.getAnimatedValue()     // Catch:{ all -> 0x3a16 }
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.Float"
            X.C18070vi.A0z(r6, r0)     // Catch:{ all -> 0x3a16 }
            java.lang.Float r6 = (java.lang.Float) r6     // Catch:{ all -> 0x3a16 }
            float r5 = r6.floatValue()     // Catch:{ all -> 0x3a16 }
            java.lang.Integer r2 = r2.A00     // Catch:{ all -> 0x3a16 }
            java.lang.Integer r0 = X.AnonymousClass00R.A00     // Catch:{ all -> 0x3a16 }
            java.util.Locale r3 = java.util.Locale.US     // Catch:{ all -> 0x3a16 }
            if (r2 != r0) goto L_0x2275
            java.lang.Object[] r0 = new java.lang.Object[r1]     // Catch:{ all -> 0x3a16 }
            r0[r4] = r6     // Catch:{ all -> 0x3a16 }
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r0, r1)     // Catch:{ all -> 0x3a16 }
            java.lang.String r0 = "%.2f%%"
        L_0x226f:
            java.lang.String r3 = X.C108955ca.A12(r3, r0, r1)     // Catch:{ all -> 0x3a16 }
            goto L_0x3a10
        L_0x2275:
            java.lang.Object[] r2 = new java.lang.Object[r1]     // Catch:{ all -> 0x3a16 }
            int r0 = X.C22339B3q.A01(r5)     // Catch:{ all -> 0x3a16 }
            X.C17880vN.A1T(r2, r0, r4)     // Catch:{ all -> 0x3a16 }
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r2, r1)     // Catch:{ all -> 0x3a16 }
            java.lang.String r0 = "%dpx"
            goto L_0x226f
        L_0x2285:
            java.lang.String r3 = "bk.action.bloks.InvalidateCachedAsyncComponents"
            boolean r3 = r5.equals(r3)     // Catch:{ all -> 0x3a16 }
            if (r3 == 0) goto L_0x39f6
            X.C18070vi.A0d(r0, r4)     // Catch:{ all -> 0x3a16 }
            X.C18070vi.A0d(r2, r1)     // Catch:{ all -> 0x3a16 }
            java.lang.String r4 = A0M(r0, r4)     // Catch:{ all -> 0x3a16 }
            java.lang.Object r3 = r0.A00(r1)     // Catch:{ all -> 0x3a16 }
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any>"
            X.C18070vi.A0z(r3, r0)     // Catch:{ all -> 0x3a16 }
            java.util.Map r3 = (java.util.Map) r3     // Catch:{ all -> 0x3a16 }
            X.DOZ r1 = r2.A00     // Catch:{ all -> 0x3a16 }
            if (r1 == 0) goto L_0x3a04
            r0 = 2131428152(0x7f0b0338, float:1.847794E38)
            java.lang.Object r1 = r1.A01(r0)     // Catch:{ all -> 0x3a16 }
            X.CqT r1 = (X.C26012CqT) r1     // Catch:{ all -> 0x3a16 }
            if (r1 == 0) goto L_0x3a04
            java.util.Set r0 = X.C24278Byb.A00     // Catch:{ all -> 0x3a16 }
            r1.A02(r4, r3, r0)     // Catch:{ all -> 0x3a16 }
            goto L_0x3a04
        L_0x22b8:
            java.lang.String r0 = "bk.action.bloks.TimestampOfLastTouchUpV2"
            boolean r0 = r5.equals(r0)     // Catch:{ all -> 0x3a16 }
            if (r0 == 0) goto L_0x39f6
            long r0 = com.bloks.foa.ttrc.touchuplistener.BloksTouchUpListenerUtils.getTouchUpTime()     // Catch:{ all -> 0x3a16 }
            java.lang.Long r3 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x3a16 }
            goto L_0x3a10
        L_0x22ca:
            java.lang.String r0 = "bk.action.context.Get"
            boolean r0 = r5.equals(r0)     // Catch:{ all -> 0x3a16 }
            if (r0 == 0) goto L_0x39f6
            X.C18070vi.A0d(r2, r1)     // Catch:{ all -> 0x3a16 }
            X.DOZ r3 = r2.A00     // Catch:{ all -> 0x3a16 }
            goto L_0x3a10
        L_0x22d9:
            java.lang.String r3 = "bk.action.screen.Open"
            boolean r3 = r5.equals(r3)     // Catch:{ all -> 0x3a16 }
            if (r3 == 0) goto L_0x39f6
            X.DOZ r8 = A07(r2, r0)     // Catch:{ all -> 0x3a16 }
            r3 = 0
            if (r8 == 0) goto L_0x2339
            android.content.Context r5 = r8.A00     // Catch:{ all -> 0x3a16 }
        L_0x22ea:
            java.lang.String r14 = "Required value was null."
            if (r5 == 0) goto L_0x239f
            java.lang.Object r11 = r0.A00(r4)     // Catch:{ all -> 0x3a16 }
            java.lang.String r6 = "null cannot be cast to non-null type com.instagram.common.bloks.component.base.BloksModel"
            X.C18070vi.A0z(r11, r6)     // Catch:{ all -> 0x3a16 }
            X.DFL r11 = (X.DFL) r11     // Catch:{ all -> 0x3a16 }
            java.lang.Object r12 = r0.A00(r1)     // Catch:{ all -> 0x3a16 }
            X.C18070vi.A0z(r12, r6)     // Catch:{ all -> 0x3a16 }
            X.DFL r12 = (X.DFL) r12     // Catch:{ all -> 0x3a16 }
            r6 = 2
            java.lang.Object r6 = r0.A00(r6)     // Catch:{ all -> 0x3a16 }
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.Boolean"
            X.C18070vi.A0z(r6, r0)     // Catch:{ all -> 0x3a16 }
            boolean r6 = X.AnonymousClass000.A1Y(r6)     // Catch:{ all -> 0x3a16 }
            r0 = 38
            java.lang.Object r9 = X.DFL.A00(r11, r0)     // Catch:{ all -> 0x3a16 }
            java.lang.String r13 = "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any?>"
            X.C18070vi.A0z(r9, r13)     // Catch:{ all -> 0x3a16 }
            java.util.Map r9 = (java.util.Map) r9     // Catch:{ all -> 0x3a16 }
            r0 = 40
            X.E8A r7 = r11.A0A(r0)     // Catch:{ all -> 0x3a16 }
            if (r7 == 0) goto L_0x2337
            X.9zJ r0 = X.C199029zJ.A01     // Catch:{ all -> 0x3a16 }
            java.lang.Object r10 = X.C25974Cph.A00(r2, r0, r7)     // Catch:{ all -> 0x3a16 }
            X.C18070vi.A0z(r10, r13)     // Catch:{ all -> 0x3a16 }
            java.util.Map r10 = (java.util.Map) r10     // Catch:{ all -> 0x3a16 }
        L_0x2330:
            int r7 = r12.A05     // Catch:{ all -> 0x3a16 }
            r0 = 16542(0x409e, float:2.318E-41)
            if (r7 == r0) goto L_0x2346
            goto L_0x233b
        L_0x2337:
            r10 = r3
            goto L_0x2330
        L_0x2339:
            r5 = r3
            goto L_0x22ea
        L_0x233b:
            r0 = 17043(0x4293, float:2.3882E-41)
            if (r7 == r0) goto L_0x2346
            r0 = 17044(0x4294, float:2.3884E-41)
            if (r7 == r0) goto L_0x2346
            r18 = r3
            goto L_0x234a
        L_0x2346:
            X.B6g r18 = X.C196419v1.A00(r12, r7)     // Catch:{ all -> 0x3a16 }
        L_0x234a:
            r0 = 51
            X.DFL r0 = r11.A09(r0)     // Catch:{ all -> 0x3a16 }
            if (r0 == 0) goto L_0x2381
            int r0 = r0.A05     // Catch:{ all -> 0x3a16 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x3a16 }
        L_0x2358:
            X.CvV r0 = X.C25372CeX.A00(r5, r0)     // Catch:{ all -> 0x3a16 }
            java.lang.String r21 = X.BE7.A0h(r11)     // Catch:{ all -> 0x3a16 }
            r2 = 43
            boolean r2 = r11.A0I(r2, r1)     // Catch:{ all -> 0x3a16 }
            java.lang.Boolean r20 = java.lang.Boolean.valueOf(r2)     // Catch:{ all -> 0x3a16 }
            X.C18070vi.A0e(r0, r1, r9)     // Catch:{ all -> 0x3a16 }
            X.0wS r22 = X.C18460wS.A00     // Catch:{ all -> 0x3a16 }
            X.AHz r2 = new X.AHz     // Catch:{ all -> 0x3a16 }
            r26 = r4
            r23 = r9
            r24 = r10
            r25 = r4
            r19 = r0
            r17 = r2
            r17.<init>(r18, r19, r20, r21, r22, r23, r24, r25, r26)     // Catch:{ all -> 0x3a16 }
            goto L_0x2383
        L_0x2381:
            r0 = r3
            goto L_0x2358
        L_0x2383:
            if (r8 == 0) goto L_0x239a
            X.CXY r1 = r8.A02     // Catch:{ all -> 0x3a16 }
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.common.bloks.Host"
            X.C18070vi.A0z(r1, r0)     // Catch:{ all -> 0x3a16 }
            android.util.SparseArray r1 = r1.A00()     // Catch:{ all -> 0x3a16 }
            X.CLX r0 = new X.CLX     // Catch:{ all -> 0x3a16 }
            r0.<init>(r1)     // Catch:{ all -> 0x3a16 }
            X.C196419v1.A01(r5, r2, r0, r7, r6)     // Catch:{ all -> 0x3a16 }
            goto L_0x3a10
        L_0x239a:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0n(r14)     // Catch:{ all -> 0x3a16 }
            throw r0     // Catch:{ all -> 0x3a16 }
        L_0x239f:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0n(r14)     // Catch:{ all -> 0x3a16 }
            throw r0     // Catch:{ all -> 0x3a16 }
        L_0x23a4:
            java.lang.String r2 = "bk.action.animated.GetCurrentColorValue"
            boolean r2 = r5.equals(r2)     // Catch:{ all -> 0x3a16 }
            if (r2 == 0) goto L_0x39f6
            java.lang.Object r2 = A0G(r0)     // Catch:{ all -> 0x3a16 }
            java.lang.String r0 = "null cannot be cast to non-null type android.animation.ValueAnimator"
            X.C18070vi.A0z(r2, r0)     // Catch:{ all -> 0x3a16 }
            android.animation.ValueAnimator r2 = (android.animation.ValueAnimator) r2     // Catch:{ all -> 0x3a16 }
            java.lang.Object r3 = r2.getAnimatedValue()     // Catch:{ all -> 0x3a16 }
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.Int"
            X.C18070vi.A0z(r3, r0)     // Catch:{ all -> 0x3a16 }
            java.util.Locale r2 = java.util.Locale.US     // Catch:{ all -> 0x3a16 }
            java.lang.Object[] r0 = new java.lang.Object[r1]     // Catch:{ all -> 0x3a16 }
            r0[r4] = r3     // Catch:{ all -> 0x3a16 }
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r0, r1)     // Catch:{ all -> 0x3a16 }
            java.lang.String r0 = "#%08x"
            java.lang.String r3 = X.C108955ca.A12(r2, r0, r1)     // Catch:{ all -> 0x3a16 }
            goto L_0x3a10
        L_0x23d2:
            java.lang.String r2 = "bk.action.GetDatetimeText"
            boolean r2 = r5.equals(r2)     // Catch:{ all -> 0x3a16 }
            if (r2 == 0) goto L_0x39f6
            java.lang.Object r3 = A0G(r0)     // Catch:{ all -> 0x3a16 }
            java.lang.String r2 = "null cannot be cast to non-null type kotlin.Number"
            X.C18070vi.A0z(r3, r2)     // Catch:{ all -> 0x3a16 }
            long r7 = X.C17880vN.A05(r3)     // Catch:{ all -> 0x3a16 }
            java.lang.Object r3 = r0.A00(r1)     // Catch:{ all -> 0x3a16 }
            java.lang.String r1 = "null cannot be cast to non-null type kotlin.String"
            X.C18070vi.A0z(r3, r1)     // Catch:{ all -> 0x3a16 }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ all -> 0x3a16 }
            r1 = 2
            java.lang.String r4 = A0L(r0, r1)     // Catch:{ all -> 0x3a16 }
            r2 = 3
            java.util.List r1 = r0.A00     // Catch:{ all -> 0x3a16 }
            java.lang.String r5 = X.C17880vN.A0w(r1, r2)     // Catch:{ all -> 0x3a16 }
            r0 = 5
            java.lang.String r6 = X.C17880vN.A0w(r1, r0)     // Catch:{ all -> 0x3a16 }
            java.lang.String r3 = X.AnonymousClass9OT.A00(r3, r4, r5, r6, r7)     // Catch:{ all -> 0x3a16 }
            goto L_0x3a10
        L_0x2409:
            java.lang.String r2 = "bk.action.ttrc.AddStep"
            boolean r2 = r5.equals(r2)     // Catch:{ all -> 0x3a16 }
            if (r2 == 0) goto L_0x39f6
            X.C18070vi.A0d(r0, r4)     // Catch:{ all -> 0x3a16 }
            int r4 = A02(r0, r4)     // Catch:{ all -> 0x3a16 }
            java.lang.Object r3 = r0.A00(r1)     // Catch:{ all -> 0x3a16 }
            java.lang.String r1 = "null cannot be cast to non-null type kotlin.String"
            X.C18070vi.A0z(r3, r1)     // Catch:{ all -> 0x3a16 }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ all -> 0x3a16 }
            r2 = 2
            java.lang.String r1 = A0L(r0, r2)     // Catch:{ all -> 0x3a16 }
            X.C18070vi.A0d(r1, r2)     // Catch:{ all -> 0x3a16 }
            X.A8s r0 = X.A7e.A00(r3, r4)     // Catch:{ all -> 0x3a16 }
            if (r0 == 0) goto L_0x3a04
            r0.A0C(r1)     // Catch:{ all -> 0x3a16 }
            goto L_0x3a04
        L_0x2436:
            java.lang.String r3 = "bk.action.bloks.PrependEmbeddedChildren"
            boolean r3 = r5.equals(r3)     // Catch:{ all -> 0x3a16 }
            if (r3 == 0) goto L_0x39f6
            java.lang.String r5 = A0N(r0, r2)     // Catch:{ all -> 0x3a16 }
            java.lang.Object r4 = X.BE6.A0n(r0, r1)     // Catch:{ all -> 0x3a16 }
            java.lang.String r3 = "null cannot be cast to non-null type kotlin.collections.List<com.instagram.common.bloks.BloksParseResult>"
            java.util.List r3 = X.BE6.A13(r4, r3)     // Catch:{ all -> 0x3a16 }
            X.DNk r6 = A0A(r2, r0)     // Catch:{ all -> 0x3a16 }
            java.util.ArrayList r0 = A0P(r6, r3)     // Catch:{ all -> 0x3a16 }
            X.DNn r3 = new X.DNn     // Catch:{ all -> 0x3a16 }
            r3.<init>(r5)     // Catch:{ all -> 0x3a16 }
            X.Boe r2 = new X.Boe     // Catch:{ all -> 0x3a16 }
            r2.<init>(r0, r1)     // Catch:{ all -> 0x3a16 }
            goto L_0x38f4
        L_0x2460:
            java.lang.String r3 = "bk.action.bloks.RemoveChild"
            boolean r3 = r5.equals(r3)     // Catch:{ all -> 0x3a16 }
            if (r3 == 0) goto L_0x39f6
            X.C18070vi.A0d(r0, r4)     // Catch:{ all -> 0x3a16 }
            X.C18070vi.A0d(r2, r1)     // Catch:{ all -> 0x3a16 }
            java.lang.Object r1 = r0.A00(r1)     // Catch:{ all -> 0x3a16 }
            X.C18070vi.A0X(r1)     // Catch:{ all -> 0x3a16 }
            java.lang.String r1 = X.CCF.A00(r1)     // Catch:{ all -> 0x3a16 }
            X.DNk r6 = A0A(r2, r0)     // Catch:{ all -> 0x3a16 }
            X.DNl r2 = A0C(r1)     // Catch:{ all -> 0x3a16 }
            X.Boa r0 = new X.Boa     // Catch:{ all -> 0x3a16 }
            r0.<init>(r1)     // Catch:{ all -> 0x3a16 }
            goto L_0x35c6
        L_0x2488:
            java.lang.String r3 = "bk.action.text_input.AppendText"
            boolean r3 = r5.equals(r3)     // Catch:{ all -> 0x3a16 }
            if (r3 == 0) goto L_0x39f6
            X.DFL r3 = A0E(r0, r2)     // Catch:{ all -> 0x3a16 }
            java.lang.String r5 = A0M(r0, r1)     // Catch:{ all -> 0x3a16 }
            r1 = 2
            X.DOZ r0 = A06(r2, r0, r1)     // Catch:{ all -> 0x3a16 }
            java.lang.Object r3 = X.C26272CwJ.A04(r0, r3)     // Catch:{ all -> 0x3a16 }
            X.CTH r3 = (X.CTH) r3     // Catch:{ all -> 0x3a16 }
            if (r3 == 0) goto L_0x3a04
            X.C18070vi.A0d(r5, r4)     // Catch:{ all -> 0x3a16 }
            r2 = 0
            X.C26176Ctu.A02(r2)     // Catch:{ all -> 0x3a16 }
            com.facebook.primitive.textinput.TextInputView r1 = r3.A02     // Catch:{ all -> 0x3a16 }
            java.lang.CharSequence r0 = r3.A04     // Catch:{ all -> 0x3a16 }
            if (r1 != 0) goto L_0x24c5
            if (r0 == 0) goto L_0x24b5
            goto L_0x24b7
        L_0x24b5:
            r0 = r5
            goto L_0x24c1
        L_0x24b7:
            java.lang.StringBuilder r0 = X.C17890vO.A0f(r0)     // Catch:{ all -> 0x3a16 }
            java.lang.String r0 = X.AnonymousClass000.A0y(r5, r0)     // Catch:{ all -> 0x3a16 }
            if (r0 == 0) goto L_0x24b5
        L_0x24c1:
            r3.A04 = r0     // Catch:{ all -> 0x3a16 }
            goto L_0x3a04
        L_0x24c5:
            if (r0 == 0) goto L_0x24d2
            java.lang.StringBuilder r0 = X.C17890vO.A0f(r0)     // Catch:{ all -> 0x3a16 }
            java.lang.String r0 = X.AnonymousClass000.A0y(r5, r0)     // Catch:{ all -> 0x3a16 }
            if (r0 == 0) goto L_0x24d2
            r5 = r0
        L_0x24d2:
            com.facebook.primitive.textinput.TextInputView r0 = r3.A02     // Catch:{ all -> 0x3a16 }
            if (r0 == 0) goto L_0x24d9
            r0.append(r5)     // Catch:{ all -> 0x3a16 }
        L_0x24d9:
            r3.A04 = r2     // Catch:{ all -> 0x3a16 }
            goto L_0x3a04
        L_0x24dd:
            java.lang.String r3 = "bk.action.animated.GetTotalDuration"
            boolean r3 = r5.equals(r3)     // Catch:{ all -> 0x3a16 }
            if (r3 == 0) goto L_0x39f6
            X.DOZ r1 = A07(r2, r0)     // Catch:{ all -> 0x3a16 }
            r3 = 0
            if (r1 == 0) goto L_0x3a10
            java.lang.String r0 = A0M(r0, r4)     // Catch:{ all -> 0x3a16 }
            android.animation.Animator r0 = X.C26258Cw3.A02(r1, r0)     // Catch:{ all -> 0x3a16 }
            if (r0 == 0) goto L_0x3a10
            long r4 = X.C26258Cw3.A01(r0)     // Catch:{ all -> 0x3a16 }
            r1 = -1
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x2506
            java.lang.Long r3 = java.lang.Long.valueOf(r1)     // Catch:{ all -> 0x3a16 }
            goto L_0x3a10
        L_0x2506:
            float r3 = (float) r4     // Catch:{ all -> 0x3a16 }
            long r1 = X.C26258Cw3.A00     // Catch:{ all -> 0x3a16 }
            float r0 = (float) r1     // Catch:{ all -> 0x3a16 }
            float r3 = r3 / r0
            java.lang.Float r3 = java.lang.Float.valueOf(r3)     // Catch:{ all -> 0x3a16 }
            goto L_0x3a10
        L_0x2511:
            java.lang.String r3 = "bk.action.animated.CreateDimension"
            boolean r3 = r5.equals(r3)     // Catch:{ all -> 0x3a16 }
            if (r3 == 0) goto L_0x39f6
            X.DOZ r7 = A07(r2, r0)     // Catch:{ all -> 0x3a16 }
            if (r7 == 0) goto L_0x3a04
            X.E8A r5 = X.C25488Cgj.A00(r0, r4)     // Catch:{ all -> 0x3a16 }
            java.util.List r8 = r0.A00     // Catch:{ all -> 0x3a16 }
            X.E8A r6 = X.AnonymousClass8BT.A08(r8, r1)     // Catch:{ all -> 0x3a16 }
            r12 = 2
            java.lang.Object r11 = r0.A00(r12)     // Catch:{ all -> 0x3a16 }
            java.lang.String r3 = "null cannot be cast to non-null type kotlin.String"
            X.C18070vi.A0z(r11, r3)     // Catch:{ all -> 0x3a16 }
            java.lang.String r11 = (java.lang.String) r11     // Catch:{ all -> 0x3a16 }
            r3 = 3
            java.lang.String r9 = A0L(r0, r3)     // Catch:{ all -> 0x3a16 }
            r3 = 4
            float r10 = A00(r0, r3)     // Catch:{ all -> 0x3a16 }
            r0 = 5
            java.lang.Object r8 = r8.get(r0)     // Catch:{ all -> 0x3a16 }
            android.view.animation.Interpolator r8 = (android.view.animation.Interpolator) r8     // Catch:{ all -> 0x3a16 }
            boolean r0 = X.BE6.A1V(r11)     // Catch:{ 9HX -> 0x258c }
            if (r0 == 0) goto L_0x2557
            float r11 = X.A90.A00(r11)     // Catch:{ 9HX -> 0x258c }
            float r9 = X.A90.A00(r9)     // Catch:{ 9HX -> 0x258c }
            java.lang.Integer r0 = X.AnonymousClass00R.A00     // Catch:{ 9HX -> 0x258c }
            goto L_0x2561
        L_0x2557:
            float r11 = X.A90.A01(r11)     // Catch:{ 9HX -> 0x258c }
            float r9 = X.A90.A01(r9)     // Catch:{ 9HX -> 0x258c }
            java.lang.Integer r0 = X.AnonymousClass00R.A01     // Catch:{ 9HX -> 0x258c }
        L_0x2561:
            X.BNG r3 = new X.BNG     // Catch:{ all -> 0x3a16 }
            r3.<init>(r0)     // Catch:{ all -> 0x3a16 }
            float[] r0 = new float[r12]     // Catch:{ all -> 0x3a16 }
            r0[r4] = r11     // Catch:{ all -> 0x3a16 }
            r0[r1] = r9     // Catch:{ all -> 0x3a16 }
            r3.setFloatValues(r0)     // Catch:{ all -> 0x3a16 }
            long r0 = X.C26258Cw3.A00     // Catch:{ all -> 0x3a16 }
            float r4 = (float) r0     // Catch:{ all -> 0x3a16 }
            float r10 = r10 * r4
            long r0 = (long) r10     // Catch:{ all -> 0x3a16 }
            r3.setDuration(r0)     // Catch:{ all -> 0x3a16 }
            r3.setInterpolator(r8)     // Catch:{ all -> 0x3a16 }
            r1 = 3
            X.CxY r0 = new X.CxY     // Catch:{ all -> 0x3a16 }
            r0.<init>(r5, r2, r1)     // Catch:{ all -> 0x3a16 }
        L_0x2580:
            r3.addUpdateListener(r0)     // Catch:{ all -> 0x3a16 }
            if (r6 == 0) goto L_0x3a10
            X.BEP r0 = new X.BEP     // Catch:{ all -> 0x3a16 }
            r0.<init>(r7, r2, r6)     // Catch:{ all -> 0x3a16 }
            goto L_0x39a3
        L_0x258c:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x3a16 }
            java.lang.String r0 = "Could not parse start and end values. "
            java.lang.IllegalArgumentException r3 = X.AnonymousClass8BX.A0V(r2, r0, r1)     // Catch:{ all -> 0x3a16 }
            goto L_0x38a5
        L_0x2599:
            java.lang.String r3 = "bk.action.text_input.KeyboardEventBackspace"
            boolean r3 = r5.equals(r3)     // Catch:{ all -> 0x3a16 }
            if (r3 == 0) goto L_0x39f6
            X.DFL r3 = A0E(r0, r2)     // Catch:{ all -> 0x3a16 }
            X.DOZ r2 = r2.A00     // Catch:{ all -> 0x3a16 }
            if (r2 == 0) goto L_0x25cd
            int r5 = A02(r0, r1)     // Catch:{ all -> 0x3a16 }
            java.lang.Object r1 = X.C26272CwJ.A04(r2, r3)     // Catch:{ all -> 0x3a16 }
            X.CTH r1 = (X.CTH) r1     // Catch:{ all -> 0x3a16 }
            if (r1 == 0) goto L_0x3a04
            r0 = 0
            X.C26176Ctu.A02(r0)     // Catch:{ all -> 0x3a16 }
            com.facebook.primitive.textinput.TextInputView r3 = r1.A02     // Catch:{ all -> 0x3a16 }
            if (r3 == 0) goto L_0x3a04
            r2 = 0
        L_0x25be:
            if (r2 >= r5) goto L_0x3a04
            r1 = 67
            android.view.KeyEvent r0 = new android.view.KeyEvent     // Catch:{ all -> 0x3a16 }
            r0.<init>(r4, r1)     // Catch:{ all -> 0x3a16 }
            r3.dispatchKeyEvent(r0)     // Catch:{ all -> 0x3a16 }
            int r2 = r2 + 1
            goto L_0x25be
        L_0x25cd:
            java.lang.IllegalStateException r0 = X.C17880vN.A0g()     // Catch:{ all -> 0x3a16 }
            throw r0     // Catch:{ all -> 0x3a16 }
        L_0x25d2:
            java.lang.String r3 = "bk.action.bloks.AppendEmbeddedChildren"
            boolean r3 = r5.equals(r3)     // Catch:{ all -> 0x3a16 }
            if (r3 == 0) goto L_0x39f6
            java.lang.String r4 = A0N(r0, r2)     // Catch:{ all -> 0x3a16 }
            java.lang.Object r3 = X.BE6.A0n(r0, r1)     // Catch:{ all -> 0x3a16 }
            java.lang.String r1 = "null cannot be cast to non-null type kotlin.collections.List<com.instagram.common.bloks.BloksParseResult>"
            java.util.List r1 = X.BE6.A13(r3, r1)     // Catch:{ all -> 0x3a16 }
            X.DNk r6 = A0A(r2, r0)     // Catch:{ all -> 0x3a16 }
            java.util.ArrayList r1 = A0P(r6, r1)     // Catch:{ all -> 0x3a16 }
            X.DNn r3 = new X.DNn     // Catch:{ all -> 0x3a16 }
            r3.<init>(r4)     // Catch:{ all -> 0x3a16 }
            r0 = 2
            X.Boe r2 = new X.Boe     // Catch:{ all -> 0x3a16 }
            r2.<init>(r1, r0)     // Catch:{ all -> 0x3a16 }
            goto L_0x38f4
        L_0x25fd:
            java.lang.String r3 = "bk.action.animated.Build"
            boolean r3 = r5.equals(r3)     // Catch:{ all -> 0x3a16 }
            if (r3 == 0) goto L_0x39f6
            X.DOZ r2 = A07(r2, r0)     // Catch:{ all -> 0x3a16 }
            if (r2 == 0) goto L_0x3a04
            android.animation.Animator r3 = A03(r0, r4)     // Catch:{ all -> 0x3a16 }
            java.lang.String r0 = A0M(r0, r1)     // Catch:{ all -> 0x3a16 }
            X.C26258Cw3.A05(r3, r2, r0)     // Catch:{ all -> 0x3a16 }
            goto L_0x3a10
        L_0x2618:
            java.lang.String r3 = "bk.action.animated.Pause"
            boolean r3 = r5.equals(r3)     // Catch:{ all -> 0x3a16 }
            if (r3 == 0) goto L_0x39f6
            X.DOZ r1 = A07(r2, r0)     // Catch:{ all -> 0x3a16 }
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r4)     // Catch:{ all -> 0x3a16 }
            if (r1 == 0) goto L_0x3a10
            java.lang.String r0 = A0M(r0, r4)     // Catch:{ all -> 0x3a16 }
            android.animation.Animator r1 = X.C26258Cw3.A02(r1, r0)     // Catch:{ all -> 0x3a16 }
            if (r1 == 0) goto L_0x3a10
            boolean r0 = r1.isPaused()     // Catch:{ all -> 0x3a16 }
            r1.pause()     // Catch:{ all -> 0x3a16 }
            if (r0 != 0) goto L_0x317f
            boolean r0 = r1.isPaused()     // Catch:{ all -> 0x3a16 }
            if (r0 == 0) goto L_0x317f
            goto L_0x317d
        L_0x2645:
            java.lang.String r3 = "bk.action.animated.Start"
            boolean r3 = r5.equals(r3)     // Catch:{ all -> 0x3a16 }
            if (r3 == 0) goto L_0x39f6
            X.DOZ r7 = A07(r2, r0)     // Catch:{ all -> 0x3a16 }
            r3 = 0
            if (r7 == 0) goto L_0x3a10
            android.animation.Animator r6 = A03(r0, r4)     // Catch:{ all -> 0x3a16 }
            X.Cw3 r5 = X.C26258Cw3.A01     // Catch:{ all -> 0x3a16 }
            java.lang.StringBuilder r4 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x3a16 }
            java.lang.String r0 = "NO_ID"
            r4.append(r0)     // Catch:{ all -> 0x3a16 }
            java.util.UUID r0 = java.util.UUID.randomUUID()     // Catch:{ all -> 0x3a16 }
            java.lang.String r4 = X.C17890vO.A0V(r0, r4)     // Catch:{ all -> 0x3a16 }
            X.C26258Cw3.A05(r6, r7, r4)     // Catch:{ all -> 0x3a16 }
            X.E9O r0 = r2.A02     // Catch:{ all -> 0x3a16 }
            if (r0 == 0) goto L_0x2675
            r0.BUC()     // Catch:{ all -> 0x3a16 }
        L_0x2675:
            r5.A06(r7, r4, r1)     // Catch:{ all -> 0x3a16 }
            goto L_0x3a10
        L_0x267a:
            java.lang.String r2 = "bk.action.animated.Cancel"
            boolean r2 = r5.equals(r2)     // Catch:{ all -> 0x3a16 }
            if (r2 == 0) goto L_0x39f6
            X.C18070vi.A0d(r0, r4)     // Catch:{ all -> 0x3a16 }
            android.animation.Animator r0 = A03(r0, r4)     // Catch:{ all -> 0x3a16 }
        L_0x2689:
            r0.cancel()     // Catch:{ all -> 0x3a16 }
            goto L_0x3a04
        L_0x268e:
            java.lang.String r3 = "bk.action.animated.Create"
            boolean r3 = r5.equals(r3)     // Catch:{ all -> 0x3a16 }
            if (r3 == 0) goto L_0x39f6
            X.DOZ r8 = A07(r2, r0)     // Catch:{ all -> 0x3a16 }
            if (r8 == 0) goto L_0x3a04
            X.E8A r7 = X.C25488Cgj.A00(r0, r4)     // Catch:{ all -> 0x3a16 }
            java.util.List r9 = r0.A00     // Catch:{ all -> 0x3a16 }
            X.E8A r6 = X.AnonymousClass8BT.A08(r9, r1)     // Catch:{ all -> 0x3a16 }
            r11 = 2
            java.lang.Object r5 = r0.A00(r11)     // Catch:{ all -> 0x3a16 }
            java.lang.String r3 = "null cannot be cast to non-null type kotlin.Number"
            X.C18070vi.A0z(r5, r3)     // Catch:{ all -> 0x3a16 }
            float r12 = X.AnonymousClass000.A04(r5)     // Catch:{ all -> 0x3a16 }
            r3 = 3
            float r5 = A01(r0, r3)     // Catch:{ all -> 0x3a16 }
            r3 = 4
            float r10 = A01(r0, r3)     // Catch:{ all -> 0x3a16 }
            r0 = 5
            java.lang.Object r9 = r9.get(r0)     // Catch:{ all -> 0x3a16 }
            android.view.animation.Interpolator r9 = (android.view.animation.Interpolator) r9     // Catch:{ all -> 0x3a16 }
            X.BER r3 = new X.BER     // Catch:{ all -> 0x3a16 }
            r3.<init>()     // Catch:{ all -> 0x3a16 }
            float[] r0 = new float[r11]     // Catch:{ all -> 0x3a16 }
            r0[r4] = r12     // Catch:{ all -> 0x3a16 }
            r0[r1] = r5     // Catch:{ all -> 0x3a16 }
            r3.setFloatValues(r0)     // Catch:{ all -> 0x3a16 }
            long r4 = X.C26258Cw3.A00     // Catch:{ all -> 0x3a16 }
            float r0 = (float) r4     // Catch:{ all -> 0x3a16 }
            float r10 = r10 * r0
            long r4 = (long) r10     // Catch:{ all -> 0x3a16 }
            r3.setDuration(r4)     // Catch:{ all -> 0x3a16 }
            r3.setInterpolator(r9)     // Catch:{ all -> 0x3a16 }
            X.CxY r0 = new X.CxY     // Catch:{ all -> 0x3a16 }
            r0.<init>(r7, r2, r1)     // Catch:{ all -> 0x3a16 }
            r3.addUpdateListener(r0)     // Catch:{ all -> 0x3a16 }
            if (r6 == 0) goto L_0x3a10
            X.BEP r0 = new X.BEP     // Catch:{ all -> 0x3a16 }
            r0.<init>(r8, r2, r6)     // Catch:{ all -> 0x3a16 }
            goto L_0x39a3
        L_0x26ef:
            java.lang.String r3 = "bk.action.accessibility.Announcement"
            boolean r3 = r5.equals(r3)     // Catch:{ all -> 0x3a16 }
            if (r3 == 0) goto L_0x39f6
            java.lang.Object r4 = A0I(r0, r2)     // Catch:{ all -> 0x3a16 }
            X.DOZ r0 = r2.A00     // Catch:{ all -> 0x3a16 }
            r3 = 0
            if (r0 == 0) goto L_0x2727
            android.content.Context r2 = r0.A00     // Catch:{ all -> 0x3a16 }
            java.lang.String r0 = "accessibility"
            java.lang.Object r2 = r2.getSystemService(r0)     // Catch:{ all -> 0x3a16 }
        L_0x2708:
            android.view.accessibility.AccessibilityManager r2 = (android.view.accessibility.AccessibilityManager) r2     // Catch:{ all -> 0x3a16 }
            if (r2 == 0) goto L_0x3a10
            boolean r0 = r2.isEnabled()     // Catch:{ all -> 0x3a16 }
            if (r0 != r1) goto L_0x3a10
            android.view.accessibility.AccessibilityEvent r1 = android.view.accessibility.AccessibilityEvent.obtain()     // Catch:{ all -> 0x3a16 }
            r0 = 16384(0x4000, float:2.2959E-41)
            r1.setEventType(r0)     // Catch:{ all -> 0x3a16 }
            java.util.List r0 = r1.getText()     // Catch:{ all -> 0x3a16 }
            r0.add(r4)     // Catch:{ all -> 0x3a16 }
            r2.sendAccessibilityEvent(r1)     // Catch:{ all -> 0x3a16 }
            goto L_0x3a10
        L_0x2727:
            r2 = r3
            goto L_0x2708
        L_0x2729:
            java.lang.String r3 = "bk.action.bloks.GetParameter"
            boolean r3 = r5.equals(r3)     // Catch:{ all -> 0x3a16 }
            if (r3 == 0) goto L_0x39f6
            java.lang.Object r1 = A0I(r0, r2)     // Catch:{ all -> 0x3a16 }
            X.AnonymousClass8BR.A1I(r1)     // Catch:{ all -> 0x3a16 }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ all -> 0x3a16 }
            X.CrK r0 = X.C25881Cns.A00(r2)     // Catch:{ all -> 0x3a16 }
            java.util.Map r0 = r0.A03     // Catch:{ all -> 0x3a16 }
            java.lang.Object r3 = r0.get(r1)     // Catch:{ all -> 0x3a16 }
            goto L_0x3a10
        L_0x2746:
            java.lang.String r7 = "bk.action.media.LoadMediaV3"
            boolean r3 = r5.equals(r7)     // Catch:{ all -> 0x3a16 }
            if (r3 == 0) goto L_0x39f6
            X.DOZ r5 = A07(r2, r0)     // Catch:{ all -> 0x3a16 }
            r3 = 0
            if (r5 == 0) goto L_0x3a10
            java.lang.String r6 = "media_store"
            r2 = 2131428169(0x7f0b0349, float:1.8477975E38)
            java.lang.Object r2 = r5.A01(r2)     // Catch:{ all -> 0x3a16 }
            java.util.Map r2 = (java.util.Map) r2     // Catch:{ all -> 0x3a16 }
            if (r2 != 0) goto L_0x2764
            r6 = 0
            goto L_0x276a
        L_0x2764:
            java.lang.Object r6 = r2.get(r6)     // Catch:{ all -> 0x3a16 }
            X.CVW r6 = (X.CVW) r6     // Catch:{ all -> 0x3a16 }
        L_0x276a:
            boolean r2 = r6 instanceof com.bloks.stdlib.datamodules.mediastore.MediaStoreDataModule     // Catch:{ all -> 0x3a16 }
            if (r2 == 0) goto L_0x27a2
            com.bloks.stdlib.datamodules.mediastore.MediaStoreDataModule r6 = (com.bloks.stdlib.datamodules.mediastore.MediaStoreDataModule) r6     // Catch:{ all -> 0x3a16 }
            if (r6 == 0) goto L_0x27a2
            java.lang.String r8 = A0M(r0, r4)     // Catch:{ all -> 0x3a16 }
            java.util.List r2 = r0.A00     // Catch:{ all -> 0x3a16 }
            java.lang.Object r9 = r2.get(r1)     // Catch:{ all -> 0x3a16 }
            java.util.List r9 = (java.util.List) r9     // Catch:{ all -> 0x3a16 }
            r0 = 2
            java.lang.String r10 = X.C17880vN.A0w(r2, r0)     // Catch:{ all -> 0x3a16 }
            r0 = 3
            java.lang.Object r1 = r2.get(r0)     // Catch:{ all -> 0x3a16 }
            java.lang.Number r1 = (java.lang.Number) r1     // Catch:{ all -> 0x3a16 }
            r0 = 4
            java.lang.String r12 = X.C17880vN.A0w(r2, r0)     // Catch:{ all -> 0x3a16 }
            android.content.Context r7 = r5.A00     // Catch:{ all -> 0x3a16 }
            if (r1 == 0) goto L_0x27a0
            int r0 = r1.intValue()     // Catch:{ all -> 0x3a16 }
            java.lang.Integer r11 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x3a16 }
        L_0x279b:
            r6.loadMedia(r7, r8, r9, r10, r11, r12)     // Catch:{ all -> 0x3a16 }
            goto L_0x3a10
        L_0x27a0:
            r11 = r3
            goto L_0x279b
        L_0x27a2:
            java.lang.String r0 = "Failed to load media: MediaStore data module is not found."
            X.C25913CoX.A01(r7, r0)     // Catch:{ all -> 0x3a16 }
            goto L_0x3a10
        L_0x27a9:
            java.lang.String r2 = "bk.action.text.GetText"
            boolean r2 = r5.equals(r2)     // Catch:{ all -> 0x3a16 }
            if (r2 == 0) goto L_0x39f6
            X.C18070vi.A0d(r0, r4)     // Catch:{ all -> 0x3a16 }
            java.util.List r0 = r0.A00     // Catch:{ all -> 0x3a16 }
            X.DFL r2 = X.AnonymousClass8BR.A0G(r0, r4)     // Catch:{ all -> 0x3a16 }
            if (r2 == 0) goto L_0x3a04
            int r1 = r2.A05     // Catch:{ all -> 0x3a16 }
            r0 = 13335(0x3417, float:1.8686E-41)
            if (r1 != r0) goto L_0x3a04
            r0 = 44
            X.DFL r0 = r2.A09(r0)     // Catch:{ all -> 0x3a16 }
            if (r0 == 0) goto L_0x27d4
            java.lang.String r0 = X.CBz.A00(r0)     // Catch:{ all -> 0x3a16 }
            java.lang.String r3 = r0.toString()     // Catch:{ all -> 0x3a16 }
            goto L_0x3a10
        L_0x27d4:
            java.lang.String r3 = X.BE7.A0h(r2)     // Catch:{ all -> 0x3a16 }
            goto L_0x3a10
        L_0x27da:
            java.lang.String r3 = "bk.action.video.GetPlaybackStateV3"
            boolean r3 = r5.equals(r3)     // Catch:{ all -> 0x3a16 }
            if (r3 == 0) goto L_0x39f6
            X.C18070vi.A0d(r0, r4)     // Catch:{ all -> 0x3a16 }
            X.C18070vi.A0d(r2, r1)     // Catch:{ all -> 0x3a16 }
            java.lang.String r3 = "unprepared"
            X.DOZ r2 = r2.A00     // Catch:{ all -> 0x3a16 }
            if (r2 == 0) goto L_0x3a10
            X.DFL r0 = A0D(r0, r4)     // Catch:{ all -> 0x3a16 }
            java.lang.String r1 = X.BE7.A0d(r0)     // Catch:{ all -> 0x3a16 }
            if (r1 != 0) goto L_0x3977
            java.lang.IllegalStateException r0 = X.C17880vN.A0g()     // Catch:{ all -> 0x3a16 }
            throw r0     // Catch:{ all -> 0x3a16 }
        L_0x27fd:
            java.lang.String r3 = "bk.action.bloks.InsertEmbeddedChildrenBefore"
            boolean r3 = r5.equals(r3)     // Catch:{ all -> 0x3a16 }
            if (r3 == 0) goto L_0x39f6
            java.lang.Object r3 = A0J(r0, r2)     // Catch:{ all -> 0x3a16 }
            java.lang.String r1 = "null cannot be cast to non-null type kotlin.collections.List<com.instagram.common.bloks.BloksParseResult>"
            java.util.List r1 = X.BE6.A13(r3, r1)     // Catch:{ all -> 0x3a16 }
            java.lang.String r3 = A0K(r0)     // Catch:{ all -> 0x3a16 }
            X.DNk r5 = A0B(r2, r0)     // Catch:{ all -> 0x3a16 }
            java.util.ArrayList r1 = A0P(r5, r1)     // Catch:{ all -> 0x3a16 }
            X.DNl r6 = A0C(r3)     // Catch:{ all -> 0x3a16 }
            X.Bog r2 = new X.Bog     // Catch:{ all -> 0x3a16 }
            r2.<init>(r1, r4, r3)     // Catch:{ all -> 0x3a16 }
            goto L_0x35f2
        L_0x2826:
            java.lang.String r3 = "bk.action.animated.IsInitialized"
            boolean r3 = r5.equals(r3)     // Catch:{ all -> 0x3a16 }
            if (r3 == 0) goto L_0x39f6
            X.DOZ r1 = A07(r2, r0)     // Catch:{ all -> 0x3a16 }
            r2 = 0
            if (r1 == 0) goto L_0x2863
            java.lang.String r0 = A0M(r0, r4)     // Catch:{ all -> 0x3a16 }
            android.animation.Animator r0 = X.C26258Cw3.A02(r1, r0)     // Catch:{ all -> 0x3a16 }
            if (r0 == 0) goto L_0x380d
            goto L_0x380c
        L_0x2841:
            java.lang.String r3 = "bk.action.video.GetIsMutedV2"
            boolean r3 = r5.equals(r3)     // Catch:{ all -> 0x3a16 }
            if (r3 == 0) goto L_0x39f6
            X.DFL r0 = A0E(r0, r2)     // Catch:{ all -> 0x3a16 }
            java.lang.String r3 = X.BE7.A0d(r0)     // Catch:{ all -> 0x3a16 }
            if (r3 == 0) goto L_0x2869
            X.DOZ r1 = r2.A00     // Catch:{ all -> 0x3a16 }
            if (r1 == 0) goto L_0x2863
            r0 = 2131428187(0x7f0b035b, float:1.8478011E38)
            java.lang.Object r0 = r1.A01(r0)     // Catch:{ all -> 0x3a16 }
            java.util.AbstractMap r0 = (java.util.AbstractMap) r0     // Catch:{ all -> 0x3a16 }
            r0.get(r3)     // Catch:{ all -> 0x3a16 }
        L_0x2863:
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r4)     // Catch:{ all -> 0x3a16 }
            goto L_0x3a10
        L_0x2869:
            java.lang.IllegalStateException r0 = X.C17880vN.A0g()     // Catch:{ all -> 0x3a16 }
            throw r0     // Catch:{ all -> 0x3a16 }
        L_0x286e:
            java.lang.String r6 = "bk.action.text.IsTruncated"
            boolean r3 = r5.equals(r6)     // Catch:{ all -> 0x3a16 }
            if (r3 == 0) goto L_0x39f6
            X.DFL r1 = A0E(r0, r2)     // Catch:{ all -> 0x3a16 }
            X.DOZ r0 = r2.A00     // Catch:{ all -> 0x3a16 }
            android.view.View r1 = r1.A06(r0)     // Catch:{ all -> 0x3a16 }
            boolean r0 = r1 instanceof com.facebook.rendercore.text.RCTextView     // Catch:{ all -> 0x3a16 }
            if (r0 == 0) goto L_0x28a0
            com.facebook.rendercore.text.RCTextView r1 = (com.facebook.rendercore.text.RCTextView) r1     // Catch:{ all -> 0x3a16 }
            boolean r0 = r1.A04     // Catch:{ all -> 0x3a16 }
            if (r0 != 0) goto L_0x317d
            android.text.Layout r2 = r1.A02     // Catch:{ all -> 0x3a16 }
            android.util.SparseIntArray r0 = X.C26086Cs4.A00     // Catch:{ all -> 0x3a16 }
            r1 = 0
        L_0x288f:
            int r0 = r2.getLineCount()     // Catch:{ all -> 0x3a16 }
            if (r1 >= r0) goto L_0x317f
            int r0 = r2.getEllipsisCount(r1)     // Catch:{ all -> 0x3a16 }
            if (r0 <= 0) goto L_0x289d
            goto L_0x317a
        L_0x289d:
            int r1 = r1 + 1
            goto L_0x288f
        L_0x28a0:
            java.lang.String r0 = "called on non-text component"
            X.C25913CoX.A01(r6, r0)     // Catch:{ all -> 0x3a16 }
            goto L_0x317f
        L_0x28a7:
            java.lang.String r3 = "bk.action.i18n.LanguagePackResolveFbt"
            boolean r3 = r5.equals(r3)     // Catch:{ all -> 0x3a16 }
            if (r3 == 0) goto L_0x39f6
            X.C18070vi.A0d(r0, r4)     // Catch:{ all -> 0x3a16 }
            X.C18070vi.A0d(r2, r1)     // Catch:{ all -> 0x3a16 }
            java.lang.Object r6 = r0.A00(r4)     // Catch:{ Exception -> 0x386d }
            java.lang.String r2 = "null cannot be cast to non-null type kotlin.String"
            X.C18070vi.A0z(r6, r2)     // Catch:{ Exception -> 0x386d }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ Exception -> 0x386d }
            java.lang.Object r3 = r0.A00(r1)     // Catch:{ Exception -> 0x386d }
            java.lang.String r2 = "null cannot be cast to non-null type kotlin.collections.List<kotlin.Int>"
            java.util.List r9 = X.BE6.A13(r3, r2)     // Catch:{ Exception -> 0x386d }
            r2 = 2
            java.lang.Object r3 = r0.A00(r2)     // Catch:{ Exception -> 0x386d }
            java.lang.String r2 = "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>"
            java.util.List r15 = X.BE6.A13(r3, r2)     // Catch:{ Exception -> 0x386d }
            r2 = 3
            java.lang.String r8 = A0L(r0, r2)     // Catch:{ Exception -> 0x386d }
            r2 = 4
            java.lang.String r5 = A0L(r0, r2)     // Catch:{ Exception -> 0x386d }
            byte[] r2 = android.util.Base64.decode(r6, r4)     // Catch:{ Exception -> 0x386d }
            java.nio.ByteBuffer r6 = java.nio.ByteBuffer.wrap(r2)     // Catch:{ Exception -> 0x386d }
            r13 = 2
            X.C18070vi.A0d(r5, r13)     // Catch:{ Exception -> 0x386d }
            X.Bm5 r12 = new X.Bm5     // Catch:{ Exception -> 0x386d }
            r12.<init>()     // Catch:{ Exception -> 0x386d }
            java.nio.ByteOrder r2 = java.nio.ByteOrder.LITTLE_ENDIAN     // Catch:{ Exception -> 0x386d }
            r6.order(r2)     // Catch:{ Exception -> 0x386d }
            int r2 = r6.position()     // Catch:{ Exception -> 0x386d }
            int r3 = r6.getInt(r2)     // Catch:{ Exception -> 0x386d }
            int r2 = r6.position()     // Catch:{ Exception -> 0x386d }
            int r3 = r3 + r2
            r12.A00 = r3     // Catch:{ Exception -> 0x386d }
            r12.A01 = r6     // Catch:{ Exception -> 0x386d }
            r2 = 8
            int r3 = r12.A02(r2)     // Catch:{ Exception -> 0x386d }
            int r2 = r12.A00     // Catch:{ Exception -> 0x386d }
            int r3 = r3 + r2
            java.nio.ByteBuffer r2 = r12.A01     // Catch:{ Exception -> 0x386d }
            r2.getInt(r3)     // Catch:{ Exception -> 0x386d }
            r2 = 14
            int r3 = r12.A02(r2)     // Catch:{ Exception -> 0x386d }
            int r2 = r12.A00     // Catch:{ Exception -> 0x386d }
            int r3 = r3 + r2
            java.nio.ByteBuffer r2 = r12.A01     // Catch:{ Exception -> 0x386d }
            r2.getInt(r3)     // Catch:{ Exception -> 0x386d }
            r2 = 20
            int r3 = r12.A02(r2)     // Catch:{ Exception -> 0x386d }
            int r2 = r12.A00     // Catch:{ Exception -> 0x386d }
            int r3 = r3 + r2
            java.nio.ByteBuffer r2 = r12.A01     // Catch:{ Exception -> 0x386d }
            r2.getInt(r3)     // Catch:{ Exception -> 0x386d }
            java.lang.String r2 = "pt_PT"
            boolean r2 = r2.equals(r5)     // Catch:{ Exception -> 0x386d }
            if (r2 == 0) goto L_0x2969
            X.DC4 r11 = new X.DC4     // Catch:{ Exception -> 0x386d }
            r11.<init>()     // Catch:{ Exception -> 0x386d }
        L_0x293d:
            java.util.HashMap r7 = X.C17880vN.A11()     // Catch:{ Exception -> 0x386d }
            r2 = 24
            int r2 = r12.A02(r2)     // Catch:{ Exception -> 0x386d }
            if (r2 == 0) goto L_0x2967
            int r3 = X.C25719Ckp.A00(r12, r2)     // Catch:{ Exception -> 0x386d }
            java.nio.ByteBuffer r2 = r12.A01     // Catch:{ Exception -> 0x386d }
            int r6 = r2.getInt(r3)     // Catch:{ Exception -> 0x386d }
        L_0x2953:
            r2 = 26
            int r2 = r12.A02(r2)     // Catch:{ Exception -> 0x386d }
            if (r2 == 0) goto L_0x2f20
            int r3 = X.C25719Ckp.A00(r12, r2)     // Catch:{ Exception -> 0x386d }
            java.nio.ByteBuffer r2 = r12.A01     // Catch:{ Exception -> 0x386d }
            int r3 = r2.getInt(r3)     // Catch:{ Exception -> 0x386d }
            goto L_0x2f21
        L_0x2967:
            r6 = 0
            goto L_0x2953
        L_0x2969:
            java.lang.String[] r3 = new java.lang.String[r1]     // Catch:{ Exception -> 0x386d }
            java.lang.String r2 = "_"
            r3[r4] = r2     // Catch:{ Exception -> 0x386d }
            java.util.List r2 = X.AnonymousClass1YF.A0S(r5, r3, r4)     // Catch:{ Exception -> 0x386d }
            java.lang.Object r3 = r2.get(r4)     // Catch:{ Exception -> 0x386d }
            java.lang.String r2 = "id"
            boolean r2 = r2.equals(r3)     // Catch:{ Exception -> 0x386d }
            if (r2 != 0) goto L_0x2f19
            java.lang.String r2 = "ig"
            boolean r2 = r2.equals(r3)     // Catch:{ Exception -> 0x386d }
            if (r2 != 0) goto L_0x2f19
            java.lang.String r2 = "ja"
            boolean r2 = r2.equals(r3)     // Catch:{ Exception -> 0x386d }
            if (r2 != 0) goto L_0x2f19
            java.lang.String r2 = "jv"
            boolean r2 = r2.equals(r3)     // Catch:{ Exception -> 0x386d }
            if (r2 != 0) goto L_0x2f19
            java.lang.String r2 = "km"
            boolean r2 = r2.equals(r3)     // Catch:{ Exception -> 0x386d }
            if (r2 != 0) goto L_0x2f19
            java.lang.String r2 = "ko"
            boolean r2 = r2.equals(r3)     // Catch:{ Exception -> 0x386d }
            if (r2 != 0) goto L_0x2f19
            java.lang.String r2 = "lo"
            boolean r2 = r2.equals(r3)     // Catch:{ Exception -> 0x386d }
            if (r2 != 0) goto L_0x2f19
            java.lang.String r2 = "ms"
            boolean r2 = r2.equals(r3)     // Catch:{ Exception -> 0x386d }
            if (r2 != 0) goto L_0x2f19
            java.lang.String r2 = "qz"
            boolean r2 = r2.equals(r3)     // Catch:{ Exception -> 0x386d }
            if (r2 != 0) goto L_0x2f19
            java.lang.String r2 = "th"
            boolean r2 = r2.equals(r3)     // Catch:{ Exception -> 0x386d }
            if (r2 != 0) goto L_0x2f19
            java.lang.String r2 = "vi"
            boolean r2 = r2.equals(r3)     // Catch:{ Exception -> 0x386d }
            if (r2 != 0) goto L_0x2f19
            java.lang.String r2 = "wo"
            boolean r2 = r2.equals(r3)     // Catch:{ Exception -> 0x386d }
            if (r2 != 0) goto L_0x2f19
            java.lang.String r2 = "yo"
            boolean r2 = r2.equals(r3)     // Catch:{ Exception -> 0x386d }
            if (r2 != 0) goto L_0x2f19
            java.lang.String r2 = "zh"
            boolean r2 = r2.equals(r3)     // Catch:{ Exception -> 0x386d }
            if (r2 != 0) goto L_0x2f19
            java.lang.String r2 = "am"
            boolean r2 = r2.equals(r3)     // Catch:{ Exception -> 0x386d }
            if (r2 != 0) goto L_0x2f12
            java.lang.String r2 = "as"
            boolean r2 = r2.equals(r3)     // Catch:{ Exception -> 0x386d }
            if (r2 != 0) goto L_0x2f12
            java.lang.String r2 = "bn"
            boolean r2 = r2.equals(r3)     // Catch:{ Exception -> 0x386d }
            if (r2 != 0) goto L_0x2f12
            java.lang.String r2 = "eh"
            boolean r2 = r2.equals(r3)     // Catch:{ Exception -> 0x386d }
            if (r2 != 0) goto L_0x2f12
            java.lang.String r2 = "fa"
            boolean r2 = r2.equals(r3)     // Catch:{ Exception -> 0x386d }
            if (r2 != 0) goto L_0x2f12
            java.lang.String r2 = "gu"
            boolean r2 = r2.equals(r3)     // Catch:{ Exception -> 0x386d }
            if (r2 != 0) goto L_0x2f12
            java.lang.String r2 = "kn"
            boolean r2 = r2.equals(r3)     // Catch:{ Exception -> 0x386d }
            if (r2 != 0) goto L_0x2f12
            java.lang.String r2 = "mr"
            boolean r2 = r2.equals(r3)     // Catch:{ Exception -> 0x386d }
            if (r2 != 0) goto L_0x2f12
            java.lang.String r2 = "zu"
            boolean r2 = r2.equals(r3)     // Catch:{ Exception -> 0x386d }
            if (r2 != 0) goto L_0x2f12
            java.lang.String r2 = "ff"
            boolean r2 = r2.equals(r3)     // Catch:{ Exception -> 0x386d }
            if (r2 != 0) goto L_0x2f0b
            java.lang.String r2 = "fr"
            boolean r2 = r2.equals(r3)     // Catch:{ Exception -> 0x386d }
            if (r2 != 0) goto L_0x2f0b
            java.lang.String r2 = "hy"
            boolean r2 = r2.equals(r3)     // Catch:{ Exception -> 0x386d }
            if (r2 != 0) goto L_0x2f0b
            java.lang.String r2 = "qk"
            boolean r2 = r2.equals(r3)     // Catch:{ Exception -> 0x386d }
            if (r2 != 0) goto L_0x2f0b
            java.lang.String r2 = "pt"
            boolean r2 = r2.equals(r3)     // Catch:{ Exception -> 0x386d }
            if (r2 == 0) goto L_0x2a60
            X.DC3 r11 = new X.DC3     // Catch:{ Exception -> 0x386d }
            r11.<init>()     // Catch:{ Exception -> 0x386d }
        L_0x2a5c:
            X.E4R r11 = (X.E4R) r11     // Catch:{ Exception -> 0x386d }
            goto L_0x293d
        L_0x2a60:
            java.lang.String r2 = "ca"
            boolean r2 = r2.equals(r3)     // Catch:{ Exception -> 0x386d }
            if (r2 != 0) goto L_0x2f04
            java.lang.String r2 = "de"
            boolean r2 = r2.equals(r3)     // Catch:{ Exception -> 0x386d }
            if (r2 != 0) goto L_0x2f04
            java.lang.String r2 = "en"
            boolean r2 = r2.equals(r3)     // Catch:{ Exception -> 0x386d }
            if (r2 != 0) goto L_0x2f04
            java.lang.String r2 = "et"
            boolean r2 = r2.equals(r3)     // Catch:{ Exception -> 0x386d }
            if (r2 != 0) goto L_0x2f04
            java.lang.String r2 = "fi"
            boolean r2 = r2.equals(r3)     // Catch:{ Exception -> 0x386d }
            if (r2 != 0) goto L_0x2f04
            java.lang.String r2 = "fy"
            boolean r2 = r2.equals(r3)     // Catch:{ Exception -> 0x386d }
            if (r2 != 0) goto L_0x2f04
            java.lang.String r2 = "gl"
            boolean r2 = r2.equals(r3)     // Catch:{ Exception -> 0x386d }
            if (r2 != 0) goto L_0x2f04
            java.lang.String r2 = "it"
            boolean r2 = r2.equals(r3)     // Catch:{ Exception -> 0x386d }
            if (r2 != 0) goto L_0x2f04
            java.lang.String r2 = "nl"
            boolean r2 = r2.equals(r3)     // Catch:{ Exception -> 0x386d }
            if (r2 != 0) goto L_0x2f04
            java.lang.String r2 = "sc"
            boolean r2 = r2.equals(r3)     // Catch:{ Exception -> 0x386d }
            if (r2 != 0) goto L_0x2f04
            java.lang.String r2 = "sv"
            boolean r2 = r2.equals(r3)     // Catch:{ Exception -> 0x386d }
            if (r2 != 0) goto L_0x2f04
            java.lang.String r2 = "sw"
            boolean r2 = r2.equals(r3)     // Catch:{ Exception -> 0x386d }
            if (r2 != 0) goto L_0x2f04
            java.lang.String r2 = "ur"
            boolean r2 = r2.equals(r3)     // Catch:{ Exception -> 0x386d }
            if (r2 != 0) goto L_0x2f04
            java.lang.String r2 = "yi"
            boolean r2 = r2.equals(r3)     // Catch:{ Exception -> 0x386d }
            if (r2 != 0) goto L_0x2f04
            java.lang.String r2 = "si"
            boolean r2 = r2.equals(r3)     // Catch:{ Exception -> 0x386d }
            if (r2 == 0) goto L_0x2adf
            X.DC5 r11 = new X.DC5     // Catch:{ Exception -> 0x386d }
            r11.<init>()     // Catch:{ Exception -> 0x386d }
            goto L_0x2a5c
        L_0x2adf:
            java.lang.String r2 = "ak"
            boolean r2 = r2.equals(r3)     // Catch:{ Exception -> 0x386d }
            if (r2 != 0) goto L_0x2efd
            java.lang.String r2 = "ln"
            boolean r2 = r2.equals(r3)     // Catch:{ Exception -> 0x386d }
            if (r2 != 0) goto L_0x2efd
            java.lang.String r2 = "mg"
            boolean r2 = r2.equals(r3)     // Catch:{ Exception -> 0x386d }
            if (r2 != 0) goto L_0x2efd
            java.lang.String r2 = "ns"
            boolean r2 = r2.equals(r3)     // Catch:{ Exception -> 0x386d }
            if (r2 != 0) goto L_0x2efd
            java.lang.String r2 = "pa"
            boolean r2 = r2.equals(r3)     // Catch:{ Exception -> 0x386d }
            if (r2 != 0) goto L_0x2efd
            java.lang.String r2 = "tz"
            boolean r2 = r2.equals(r3)     // Catch:{ Exception -> 0x386d }
            if (r2 == 0) goto L_0x2b16
            X.DC7 r11 = new X.DC7     // Catch:{ Exception -> 0x386d }
            r11.<init>()     // Catch:{ Exception -> 0x386d }
            goto L_0x2a5c
        L_0x2b16:
            java.lang.String r2 = "af"
            boolean r2 = r2.equals(r3)     // Catch:{ Exception -> 0x386d }
            if (r2 != 0) goto L_0x2ef6
            java.lang.String r2 = "az"
            boolean r2 = r2.equals(r3)     // Catch:{ Exception -> 0x386d }
            if (r2 != 0) goto L_0x2ef6
            java.lang.String r2 = "bg"
            boolean r2 = r2.equals(r3)     // Catch:{ Exception -> 0x386d }
            if (r2 != 0) goto L_0x2ef6
            java.lang.String r2 = "cb"
            boolean r2 = r2.equals(r3)     // Catch:{ Exception -> 0x386d }
            if (r2 != 0) goto L_0x2ef6
            java.lang.String r2 = "ck"
            boolean r2 = r2.equals(r3)     // Catch:{ Exception -> 0x386d }
            if (r2 != 0) goto L_0x2ef6
            java.lang.String r2 = "el"
            boolean r2 = r2.equals(r3)     // Catch:{ Exception -> 0x386d }
            if (r2 != 0) goto L_0x2ef6
            java.lang.String r2 = "em"
            boolean r2 = r2.equals(r3)     // Catch:{ Exception -> 0x386d }
            if (r2 != 0) goto L_0x2ef6
            java.lang.String r2 = "eo"
            boolean r2 = r2.equals(r3)     // Catch:{ Exception -> 0x386d }
            if (r2 != 0) goto L_0x2ef6
            java.lang.String r2 = "es"
            boolean r2 = r2.equals(r3)     // Catch:{ Exception -> 0x386d }
            if (r2 != 0) goto L_0x2ef6
            java.lang.String r2 = "eu"
            boolean r2 = r2.equals(r3)     // Catch:{ Exception -> 0x386d }
            if (r2 != 0) goto L_0x2ef6
            java.lang.String r2 = "fo"
            boolean r2 = r2.equals(r3)     // Catch:{ Exception -> 0x386d }
            if (r2 != 0) goto L_0x2ef6
            java.lang.String r2 = "ha"
            boolean r2 = r2.equals(r3)     // Catch:{ Exception -> 0x386d }
            if (r2 != 0) goto L_0x2ef6
            java.lang.String r2 = "hu"
            boolean r2 = r2.equals(r3)     // Catch:{ Exception -> 0x386d }
            if (r2 != 0) goto L_0x2ef6
            java.lang.String r2 = "ka"
            boolean r2 = r2.equals(r3)     // Catch:{ Exception -> 0x386d }
            if (r2 != 0) goto L_0x2ef6
            java.lang.String r2 = "kk"
            boolean r2 = r2.equals(r3)     // Catch:{ Exception -> 0x386d }
            if (r2 != 0) goto L_0x2ef6
            java.lang.String r2 = "ks"
            boolean r2 = r2.equals(r3)     // Catch:{ Exception -> 0x386d }
            if (r2 != 0) goto L_0x2ef6
            java.lang.String r2 = "ku"
            boolean r2 = r2.equals(r3)     // Catch:{ Exception -> 0x386d }
            if (r2 != 0) goto L_0x2ef6
            java.lang.String r2 = "ky"
            boolean r2 = r2.equals(r3)     // Catch:{ Exception -> 0x386d }
            if (r2 != 0) goto L_0x2ef6
            java.lang.String r2 = "lg"
            boolean r2 = r2.equals(r3)     // Catch:{ Exception -> 0x386d }
            if (r2 != 0) goto L_0x2ef6
            java.lang.String r2 = "ml"
            boolean r2 = r2.equals(r3)     // Catch:{ Exception -> 0x386d }
            if (r2 != 0) goto L_0x2ef6
            java.lang.String r2 = "mn"
            boolean r2 = r2.equals(r3)     // Catch:{ Exception -> 0x386d }
            if (r2 != 0) goto L_0x2ef6
            java.lang.String r2 = "nb"
            boolean r2 = r2.equals(r3)     // Catch:{ Exception -> 0x386d }
            if (r2 != 0) goto L_0x2ef6
            java.lang.String r2 = "nd"
            boolean r2 = r2.equals(r3)     // Catch:{ Exception -> 0x386d }
            if (r2 != 0) goto L_0x2ef6
            java.lang.String r2 = "ne"
            boolean r2 = r2.equals(r3)     // Catch:{ Exception -> 0x386d }
            if (r2 != 0) goto L_0x2ef6
            java.lang.String r2 = "nn"
            boolean r2 = r2.equals(r3)     // Catch:{ Exception -> 0x386d }
            if (r2 != 0) goto L_0x2ef6
            java.lang.String r2 = "nr"
            boolean r2 = r2.equals(r3)     // Catch:{ Exception -> 0x386d }
            if (r2 != 0) goto L_0x2ef6
            java.lang.String r2 = "ny"
            boolean r2 = r2.equals(r3)     // Catch:{ Exception -> 0x386d }
            if (r2 != 0) goto L_0x2ef6
            java.lang.String r2 = "om"
            boolean r2 = r2.equals(r3)     // Catch:{ Exception -> 0x386d }
            if (r2 != 0) goto L_0x2ef6
            java.lang.String r2 = "or"
            boolean r2 = r2.equals(r3)     // Catch:{ Exception -> 0x386d }
            if (r2 != 0) goto L_0x2ef6
            java.lang.String r2 = "ps"
            boolean r2 = r2.equals(r3)     // Catch:{ Exception -> 0x386d }
            if (r2 != 0) goto L_0x2ef6
            java.lang.String r2 = "rm"
            boolean r2 = r2.equals(r3)     // Catch:{ Exception -> 0x386d }
            if (r2 != 0) goto L_0x2ef6
            java.lang.String r2 = "sn"
            boolean r2 = r2.equals(r3)     // Catch:{ Exception -> 0x386d }
            if (r2 != 0) goto L_0x2ef6
            java.lang.String r2 = "so"
            boolean r2 = r2.equals(r3)     // Catch:{ Exception -> 0x386d }
            if (r2 != 0) goto L_0x2ef6
            java.lang.String r2 = "sq"
            boolean r2 = r2.equals(r3)     // Catch:{ Exception -> 0x386d }
            if (r2 != 0) goto L_0x2ef6
            java.lang.String r2 = "ss"
            boolean r2 = r2.equals(r3)     // Catch:{ Exception -> 0x386d }
            if (r2 != 0) goto L_0x2ef6
            java.lang.String r2 = "st"
            boolean r2 = r2.equals(r3)     // Catch:{ Exception -> 0x386d }
            if (r2 != 0) goto L_0x2ef6
            java.lang.String r2 = "sy"
            boolean r2 = r2.equals(r3)     // Catch:{ Exception -> 0x386d }
            if (r2 != 0) goto L_0x2ef6
            java.lang.String r2 = "ta"
            boolean r2 = r2.equals(r3)     // Catch:{ Exception -> 0x386d }
            if (r2 != 0) goto L_0x2ef6
            java.lang.String r2 = "te"
            boolean r2 = r2.equals(r3)     // Catch:{ Exception -> 0x386d }
            if (r2 != 0) goto L_0x2ef6
            java.lang.String r2 = "tk"
            boolean r2 = r2.equals(r3)     // Catch:{ Exception -> 0x386d }
            if (r2 != 0) goto L_0x2ef6
            java.lang.String r2 = "tn"
            boolean r2 = r2.equals(r3)     // Catch:{ Exception -> 0x386d }
            if (r2 != 0) goto L_0x2ef6
            java.lang.String r2 = "tr"
            boolean r2 = r2.equals(r3)     // Catch:{ Exception -> 0x386d }
            if (r2 != 0) goto L_0x2ef6
            java.lang.String r2 = "ts"
            boolean r2 = r2.equals(r3)     // Catch:{ Exception -> 0x386d }
            if (r2 != 0) goto L_0x2ef6
            java.lang.String r2 = "uz"
            boolean r2 = r2.equals(r3)     // Catch:{ Exception -> 0x386d }
            if (r2 != 0) goto L_0x2ef6
            java.lang.String r2 = "ve"
            boolean r2 = r2.equals(r3)     // Catch:{ Exception -> 0x386d }
            if (r2 != 0) goto L_0x2ef6
            java.lang.String r2 = "xh"
            boolean r2 = r2.equals(r3)     // Catch:{ Exception -> 0x386d }
            if (r2 != 0) goto L_0x2ef6
            java.lang.String r2 = "da"
            boolean r2 = r2.equals(r3)     // Catch:{ Exception -> 0x386d }
            if (r2 == 0) goto L_0x2c95
            X.DC9 r11 = new X.DC9     // Catch:{ Exception -> 0x386d }
            r11.<init>()     // Catch:{ Exception -> 0x386d }
            goto L_0x2a5c
        L_0x2c95:
            java.lang.String r2 = "is"
            boolean r2 = r2.equals(r3)     // Catch:{ Exception -> 0x386d }
            if (r2 == 0) goto L_0x2ca4
            X.DCA r11 = new X.DCA     // Catch:{ Exception -> 0x386d }
            r11.<init>()     // Catch:{ Exception -> 0x386d }
            goto L_0x2a5c
        L_0x2ca4:
            java.lang.String r2 = "mk"
            boolean r2 = r2.equals(r3)     // Catch:{ Exception -> 0x386d }
            if (r2 == 0) goto L_0x2cb3
            X.DCB r11 = new X.DCB     // Catch:{ Exception -> 0x386d }
            r11.<init>()     // Catch:{ Exception -> 0x386d }
            goto L_0x2a5c
        L_0x2cb3:
            java.lang.String r2 = "tl"
            boolean r2 = r2.equals(r3)     // Catch:{ Exception -> 0x386d }
            if (r2 == 0) goto L_0x2cc2
            X.DCC r11 = new X.DCC     // Catch:{ Exception -> 0x386d }
            r11.<init>()     // Catch:{ Exception -> 0x386d }
            goto L_0x2a5c
        L_0x2cc2:
            java.lang.String r2 = "lv"
            boolean r2 = r2.equals(r3)     // Catch:{ Exception -> 0x386d }
            if (r2 == 0) goto L_0x2cd1
            X.DCD r11 = new X.DCD     // Catch:{ Exception -> 0x386d }
            r11.<init>()     // Catch:{ Exception -> 0x386d }
            goto L_0x2a5c
        L_0x2cd1:
            java.lang.String r2 = "iu"
            boolean r2 = r2.equals(r3)     // Catch:{ Exception -> 0x386d }
            if (r2 != 0) goto L_0x2eef
            java.lang.String r2 = "se"
            boolean r2 = r2.equals(r3)     // Catch:{ Exception -> 0x386d }
            if (r2 != 0) goto L_0x2eef
            java.lang.String r2 = "ro"
            boolean r2 = r2.equals(r3)     // Catch:{ Exception -> 0x386d }
            if (r2 == 0) goto L_0x2cf0
            X.DCF r11 = new X.DCF     // Catch:{ Exception -> 0x386d }
            r11.<init>()     // Catch:{ Exception -> 0x386d }
            goto L_0x2a5c
        L_0x2cf0:
            java.lang.String r2 = "bs"
            boolean r2 = r2.equals(r3)     // Catch:{ Exception -> 0x386d }
            if (r2 != 0) goto L_0x2ee8
            java.lang.String r2 = "hr"
            boolean r2 = r2.equals(r3)     // Catch:{ Exception -> 0x386d }
            if (r2 != 0) goto L_0x2ee8
            java.lang.String r2 = "sr"
            boolean r2 = r2.equals(r3)     // Catch:{ Exception -> 0x386d }
            if (r2 != 0) goto L_0x2ee8
            java.lang.String r2 = "sl"
            boolean r2 = r2.equals(r3)     // Catch:{ Exception -> 0x386d }
            if (r2 == 0) goto L_0x2d17
            X.DCH r11 = new X.DCH     // Catch:{ Exception -> 0x386d }
            r11.<init>()     // Catch:{ Exception -> 0x386d }
            goto L_0x2a5c
        L_0x2d17:
            java.lang.String r2 = "qb"
            boolean r2 = r2.equals(r3)     // Catch:{ Exception -> 0x386d }
            if (r2 != 0) goto L_0x2ee1
            java.lang.String r2 = "qs"
            boolean r2 = r2.equals(r3)     // Catch:{ Exception -> 0x386d }
            if (r2 != 0) goto L_0x2ee1
            java.lang.String r2 = "he"
            boolean r2 = r2.equals(r3)     // Catch:{ Exception -> 0x386d }
            if (r2 == 0) goto L_0x2d36
            X.DCJ r11 = new X.DCJ     // Catch:{ Exception -> 0x386d }
            r11.<init>()     // Catch:{ Exception -> 0x386d }
            goto L_0x2a5c
        L_0x2d36:
            java.lang.String r2 = "cs"
            boolean r2 = r2.equals(r3)     // Catch:{ Exception -> 0x386d }
            if (r2 != 0) goto L_0x2eda
            java.lang.String r2 = "sk"
            boolean r2 = r2.equals(r3)     // Catch:{ Exception -> 0x386d }
            if (r2 != 0) goto L_0x2eda
            java.lang.String r2 = "pl"
            boolean r2 = r2.equals(r3)     // Catch:{ Exception -> 0x386d }
            if (r2 == 0) goto L_0x2d55
            X.DCL r11 = new X.DCL     // Catch:{ Exception -> 0x386d }
            r11.<init>()     // Catch:{ Exception -> 0x386d }
            goto L_0x2a5c
        L_0x2d55:
            java.lang.String r2 = "be"
            boolean r2 = r2.equals(r3)     // Catch:{ Exception -> 0x386d }
            if (r2 == 0) goto L_0x2d64
            X.DCM r11 = new X.DCM     // Catch:{ Exception -> 0x386d }
            r11.<init>()     // Catch:{ Exception -> 0x386d }
            goto L_0x2a5c
        L_0x2d64:
            java.lang.String r2 = "lt"
            boolean r2 = r2.equals(r3)     // Catch:{ Exception -> 0x386d }
            if (r2 == 0) goto L_0x2d73
            X.DCN r11 = new X.DCN     // Catch:{ Exception -> 0x386d }
            r11.<init>()     // Catch:{ Exception -> 0x386d }
            goto L_0x2a5c
        L_0x2d73:
            java.lang.String r2 = "mt"
            boolean r2 = r2.equals(r3)     // Catch:{ Exception -> 0x386d }
            if (r2 == 0) goto L_0x2d82
            X.DCO r11 = new X.DCO     // Catch:{ Exception -> 0x386d }
            r11.<init>()     // Catch:{ Exception -> 0x386d }
            goto L_0x2a5c
        L_0x2d82:
            java.lang.String r2 = "ru"
            boolean r2 = r2.equals(r3)     // Catch:{ Exception -> 0x386d }
            if (r2 != 0) goto L_0x2ed3
            java.lang.String r2 = "uk"
            boolean r2 = r2.equals(r3)     // Catch:{ Exception -> 0x386d }
            if (r2 != 0) goto L_0x2ed3
            java.lang.String r2 = "br"
            boolean r2 = r2.equals(r3)     // Catch:{ Exception -> 0x386d }
            if (r2 == 0) goto L_0x2da1
            X.DCQ r11 = new X.DCQ     // Catch:{ Exception -> 0x386d }
            r11.<init>()     // Catch:{ Exception -> 0x386d }
            goto L_0x2a5c
        L_0x2da1:
            java.lang.String r2 = "ga"
            boolean r2 = r2.equals(r3)     // Catch:{ Exception -> 0x386d }
            if (r2 == 0) goto L_0x2db0
            X.DCR r11 = new X.DCR     // Catch:{ Exception -> 0x386d }
            r11.<init>()     // Catch:{ Exception -> 0x386d }
            goto L_0x2a5c
        L_0x2db0:
            java.lang.String r2 = "ar"
            boolean r2 = r2.equals(r3)     // Catch:{ Exception -> 0x386d }
            if (r2 == 0) goto L_0x2dbf
            X.DCS r11 = new X.DCS     // Catch:{ Exception -> 0x386d }
            r11.<init>()     // Catch:{ Exception -> 0x386d }
            goto L_0x2a5c
        L_0x2dbf:
            java.lang.String r2 = "cy"
            boolean r2 = r2.equals(r3)     // Catch:{ Exception -> 0x386d }
            if (r2 == 0) goto L_0x2dce
            X.DCT r11 = new X.DCT     // Catch:{ Exception -> 0x386d }
            r11.<init>()     // Catch:{ Exception -> 0x386d }
            goto L_0x2a5c
        L_0x2dce:
            java.lang.String r2 = "cx"
            boolean r2 = r2.equals(r3)     // Catch:{ Exception -> 0x386d }
            if (r2 != 0) goto L_0x2ecc
            java.lang.String r2 = "fv"
            boolean r2 = r2.equals(r3)     // Catch:{ Exception -> 0x386d }
            if (r2 != 0) goto L_0x2ecc
            java.lang.String r2 = "su"
            boolean r2 = r2.equals(r3)     // Catch:{ Exception -> 0x386d }
            if (r2 != 0) goto L_0x2ecc
            java.lang.String r2 = "co"
            boolean r2 = r2.equals(r3)     // Catch:{ Exception -> 0x386d }
            if (r2 != 0) goto L_0x2ec5
            java.lang.String r2 = "fb"
            boolean r2 = r2.equals(r3)     // Catch:{ Exception -> 0x386d }
            if (r2 != 0) goto L_0x2ec5
            java.lang.String r2 = "gn"
            boolean r2 = r2.equals(r3)     // Catch:{ Exception -> 0x386d }
            if (r2 != 0) goto L_0x2ec5
            java.lang.String r2 = "gx"
            boolean r2 = r2.equals(r3)     // Catch:{ Exception -> 0x386d }
            if (r2 != 0) goto L_0x2ec5
            java.lang.String r2 = "ht"
            boolean r2 = r2.equals(r3)     // Catch:{ Exception -> 0x386d }
            if (r2 != 0) goto L_0x2ec5
            java.lang.String r2 = "la"
            boolean r2 = r2.equals(r3)     // Catch:{ Exception -> 0x386d }
            if (r2 != 0) goto L_0x2ec5
            java.lang.String r2 = "li"
            boolean r2 = r2.equals(r3)     // Catch:{ Exception -> 0x386d }
            if (r2 != 0) goto L_0x2ec5
            java.lang.String r2 = "qc"
            boolean r2 = r2.equals(r3)     // Catch:{ Exception -> 0x386d }
            if (r2 != 0) goto L_0x2ec5
            java.lang.String r2 = "rw"
            boolean r2 = r2.equals(r3)     // Catch:{ Exception -> 0x386d }
            if (r2 != 0) goto L_0x2ec5
            java.lang.String r2 = "zz"
            boolean r2 = r2.equals(r3)     // Catch:{ Exception -> 0x386d }
            if (r2 != 0) goto L_0x2ec5
            java.lang.String r2 = "mi"
            boolean r2 = r2.equals(r3)     // Catch:{ Exception -> 0x386d }
            if (r2 != 0) goto L_0x2ebe
            java.lang.String r2 = "tg"
            boolean r2 = r2.equals(r3)     // Catch:{ Exception -> 0x386d }
            if (r2 != 0) goto L_0x2ebe
            java.lang.String r2 = "tt"
            boolean r2 = r2.equals(r3)     // Catch:{ Exception -> 0x386d }
            if (r2 == 0) goto L_0x2e55
            X.DCX r11 = new X.DCX     // Catch:{ Exception -> 0x386d }
            r11.<init>()     // Catch:{ Exception -> 0x386d }
            goto L_0x2a5c
        L_0x2e55:
            java.lang.String r2 = "sa"
            boolean r2 = r2.equals(r3)     // Catch:{ Exception -> 0x386d }
            if (r2 == 0) goto L_0x2e64
            X.DCY r11 = new X.DCY     // Catch:{ Exception -> 0x386d }
            r11.<init>()     // Catch:{ Exception -> 0x386d }
            goto L_0x2a5c
        L_0x2e64:
            java.lang.String r2 = "qu"
            boolean r2 = r2.equals(r3)     // Catch:{ Exception -> 0x386d }
            if (r2 == 0) goto L_0x2e73
            X.DCZ r11 = new X.DCZ     // Catch:{ Exception -> 0x386d }
            r11.<init>()     // Catch:{ Exception -> 0x386d }
            goto L_0x2a5c
        L_0x2e73:
            java.lang.String r2 = "ay"
            boolean r2 = r2.equals(r3)     // Catch:{ Exception -> 0x386d }
            if (r2 == 0) goto L_0x2e82
            X.DCa r11 = new X.DCa     // Catch:{ Exception -> 0x386d }
            r11.<init>()     // Catch:{ Exception -> 0x386d }
            goto L_0x2a5c
        L_0x2e82:
            java.lang.String r2 = "sz"
            boolean r2 = r2.equals(r3)     // Catch:{ Exception -> 0x386d }
            if (r2 == 0) goto L_0x2e91
            X.DCb r11 = new X.DCb     // Catch:{ Exception -> 0x386d }
            r11.<init>()     // Catch:{ Exception -> 0x386d }
            goto L_0x2a5c
        L_0x2e91:
            java.lang.String r2 = "bp"
            boolean r2 = r2.equals(r3)     // Catch:{ Exception -> 0x386d }
            if (r2 == 0) goto L_0x2ea0
            X.DCc r11 = new X.DCc     // Catch:{ Exception -> 0x386d }
            r11.<init>()     // Catch:{ Exception -> 0x386d }
            goto L_0x2a5c
        L_0x2ea0:
            java.lang.String r2 = "ik"
            boolean r2 = r2.equals(r3)     // Catch:{ Exception -> 0x386d }
            if (r2 == 0) goto L_0x2eaf
            X.DCd r11 = new X.DCd     // Catch:{ Exception -> 0x386d }
            r11.<init>()     // Catch:{ Exception -> 0x386d }
            goto L_0x2a5c
        L_0x2eaf:
            java.lang.String r2 = "qr"
            boolean r2 = r2.equals(r3)     // Catch:{ Exception -> 0x386d }
            if (r2 == 0) goto L_0x2f19
            X.DCe r11 = new X.DCe     // Catch:{ Exception -> 0x386d }
            r11.<init>()     // Catch:{ Exception -> 0x386d }
            goto L_0x2a5c
        L_0x2ebe:
            X.DCW r11 = new X.DCW     // Catch:{ Exception -> 0x386d }
            r11.<init>()     // Catch:{ Exception -> 0x386d }
            goto L_0x2a5c
        L_0x2ec5:
            X.DCV r11 = new X.DCV     // Catch:{ Exception -> 0x386d }
            r11.<init>()     // Catch:{ Exception -> 0x386d }
            goto L_0x2a5c
        L_0x2ecc:
            X.DCU r11 = new X.DCU     // Catch:{ Exception -> 0x386d }
            r11.<init>()     // Catch:{ Exception -> 0x386d }
            goto L_0x2a5c
        L_0x2ed3:
            X.DCP r11 = new X.DCP     // Catch:{ Exception -> 0x386d }
            r11.<init>()     // Catch:{ Exception -> 0x386d }
            goto L_0x2a5c
        L_0x2eda:
            X.DCK r11 = new X.DCK     // Catch:{ Exception -> 0x386d }
            r11.<init>()     // Catch:{ Exception -> 0x386d }
            goto L_0x2a5c
        L_0x2ee1:
            X.DCI r11 = new X.DCI     // Catch:{ Exception -> 0x386d }
            r11.<init>()     // Catch:{ Exception -> 0x386d }
            goto L_0x2a5c
        L_0x2ee8:
            X.DCG r11 = new X.DCG     // Catch:{ Exception -> 0x386d }
            r11.<init>()     // Catch:{ Exception -> 0x386d }
            goto L_0x2a5c
        L_0x2eef:
            X.DCE r11 = new X.DCE     // Catch:{ Exception -> 0x386d }
            r11.<init>()     // Catch:{ Exception -> 0x386d }
            goto L_0x2a5c
        L_0x2ef6:
            X.DC8 r11 = new X.DC8     // Catch:{ Exception -> 0x386d }
            r11.<init>()     // Catch:{ Exception -> 0x386d }
            goto L_0x2a5c
        L_0x2efd:
            X.DC6 r11 = new X.DC6     // Catch:{ Exception -> 0x386d }
            r11.<init>()     // Catch:{ Exception -> 0x386d }
            goto L_0x2a5c
        L_0x2f04:
            X.DC4 r11 = new X.DC4     // Catch:{ Exception -> 0x386d }
            r11.<init>()     // Catch:{ Exception -> 0x386d }
            goto L_0x2a5c
        L_0x2f0b:
            X.DC2 r11 = new X.DC2     // Catch:{ Exception -> 0x386d }
            r11.<init>()     // Catch:{ Exception -> 0x386d }
            goto L_0x2a5c
        L_0x2f12:
            X.DC1 r11 = new X.DC1     // Catch:{ Exception -> 0x386d }
            r11.<init>()     // Catch:{ Exception -> 0x386d }
            goto L_0x2a5c
        L_0x2f19:
            X.DC0 r11 = new X.DC0     // Catch:{ Exception -> 0x386d }
            r11.<init>()     // Catch:{ Exception -> 0x386d }
            goto L_0x2a5c
        L_0x2f20:
            r3 = 0
        L_0x2f21:
            if (r6 != r3) goto L_0x3061
            if (r6 <= 0) goto L_0x2f3e
            int r6 = r6 + -1
            r2 = 24
            int r2 = r12.A02(r2)     // Catch:{ Exception -> 0x386d }
            if (r2 == 0) goto L_0x2f3b
            int r2 = X.C25719Ckp.A00(r12, r2)     // Catch:{ Exception -> 0x386d }
            int r3 = r2 + 4
            int r2 = r6 * 4
            int r3 = r3 + r2
            r12.A03(r3)     // Catch:{ Exception -> 0x386d }
        L_0x2f3b:
            r12.A04(r6)     // Catch:{ Exception -> 0x386d }
        L_0x2f3e:
            int[] r10 = X.C29431cG.A1B(r9)     // Catch:{ Exception -> 0x386d }
            X.C18070vi.A0d(r8, r4)     // Catch:{ Exception -> 0x386d }
            boolean r2 = r7.containsKey(r8)     // Catch:{ Exception -> 0x386d }
            if (r2 != 0) goto L_0x2f9e
            r2 = 24
            int r2 = r12.A02(r2)     // Catch:{ Exception -> 0x386d }
            if (r2 == 0) goto L_0x2f93
            int r3 = X.C25719Ckp.A00(r12, r2)     // Catch:{ Exception -> 0x386d }
            java.nio.ByteBuffer r2 = r12.A01     // Catch:{ Exception -> 0x386d }
            int r9 = r2.getInt(r3)     // Catch:{ Exception -> 0x386d }
            r6 = 0
        L_0x2f5e:
            if (r6 >= r9) goto L_0x2f93
            int r2 = r6 + r9
            int r3 = r2 / 2
            r2 = 24
            int r2 = r12.A02(r2)     // Catch:{ Exception -> 0x386d }
            if (r2 == 0) goto L_0x2f80
            int r2 = X.C25719Ckp.A00(r12, r2)     // Catch:{ Exception -> 0x386d }
            int r14 = r2 + 4
            int r2 = r3 * 4
            int r14 = r14 + r2
            java.lang.String r2 = r12.A03(r14)     // Catch:{ Exception -> 0x386d }
        L_0x2f79:
            int r2 = r2.compareTo(r8)     // Catch:{ Exception -> 0x386d }
            if (r2 != 0) goto L_0x2f82
            goto L_0x2f89
        L_0x2f80:
            r2 = 0
            goto L_0x2f79
        L_0x2f82:
            if (r2 >= 0) goto L_0x2f87
            int r6 = r3 + 1
            goto L_0x2f5e
        L_0x2f87:
            r9 = r3
            goto L_0x2f5e
        L_0x2f89:
            if (r3 < 0) goto L_0x2f93
            java.lang.Integer r2 = java.lang.Integer.valueOf(r3)     // Catch:{ Exception -> 0x386d }
            r7.put(r8, r2)     // Catch:{ Exception -> 0x386d }
            goto L_0x2fa4
        L_0x2f93:
            java.lang.Object[] r6 = new java.lang.Object[r1]     // Catch:{ Exception -> 0x386d }
            r6[r4] = r8     // Catch:{ Exception -> 0x386d }
            java.lang.String r3 = "LanguagePackReader"
            java.lang.String r2 = "Unable to find hashKey (%s)"
            X.C26294Cx6.A0G(r3, r2, r6)     // Catch:{ Exception -> 0x386d }
        L_0x2f9e:
            java.lang.Object r2 = r7.get(r8)     // Catch:{ Exception -> 0x386d }
            java.lang.Integer r2 = (java.lang.Integer) r2     // Catch:{ Exception -> 0x386d }
        L_0x2fa4:
            r8 = 0
            if (r2 == 0) goto L_0x3a04
            int r9 = r2.intValue()     // Catch:{ Exception -> 0x386d }
            int r7 = r10.length     // Catch:{ Exception -> 0x386d }
            int r7 = r7 - r1
        L_0x2fad:
            if (r7 <= 0) goto L_0x2feb
            r6 = r10[r7]     // Catch:{ Exception -> 0x386d }
            int r2 = r7 + -1
            r2 = r10[r2]     // Catch:{ Exception -> 0x386d }
            if (r2 == 0) goto L_0x2fcb
            if (r2 == r1) goto L_0x2fc1
            if (r2 != r13) goto L_0x2fd4
            X.BS8 r3 = new X.BS8     // Catch:{ Exception -> 0x386d }
            r3.<init>(r8, r6)     // Catch:{ Exception -> 0x386d }
            goto L_0x2fd0
        L_0x2fc1:
            int r2 = r11.BVX(r6)     // Catch:{ Exception -> 0x386d }
            X.BSA r3 = new X.BSA     // Catch:{ Exception -> 0x386d }
            r3.<init>(r8, r2, r6)     // Catch:{ Exception -> 0x386d }
            goto L_0x2fd0
        L_0x2fcb:
            X.BS7 r3 = new X.BS7     // Catch:{ Exception -> 0x386d }
            r3.<init>(r8, r6)     // Catch:{ Exception -> 0x386d }
        L_0x2fd0:
            r8 = r3
            int r7 = r7 + -2
            goto L_0x2fad
        L_0x2fd4:
            java.lang.StringBuilder r3 = X.AnonymousClass000.A10()     // Catch:{ Exception -> 0x386d }
            java.lang.String r2 = "Token type '"
            r3.append(r2)     // Catch:{ Exception -> 0x386d }
            int r7 = r7 - r1
            r1 = r10[r7]     // Catch:{ Exception -> 0x386d }
            r3.append(r1)     // Catch:{ Exception -> 0x386d }
            java.lang.String r1 = "' is unknown."
            java.lang.RuntimeException r1 = X.BE9.A0n(r1, r3)     // Catch:{ Exception -> 0x386d }
            goto L_0x307b
        L_0x2feb:
            X.Bm4 r6 = r12.A04(r9)     // Catch:{ Exception -> 0x386d }
            if (r6 == 0) goto L_0x300a
            r2 = 4
            int r7 = r6.A02(r2)     // Catch:{ Exception -> 0x386d }
            if (r7 == 0) goto L_0x300a
            java.nio.ByteBuffer r3 = r6.A01     // Catch:{ Exception -> 0x386d }
            int r2 = r6.A00     // Catch:{ Exception -> 0x386d }
            int r7 = r7 + r2
            byte r2 = r3.get(r7)     // Catch:{ Exception -> 0x386d }
            if (r2 == 0) goto L_0x300a
            X.BS9 r2 = new X.BS9     // Catch:{ Exception -> 0x386d }
            r2.<init>(r8, r4)     // Catch:{ Exception -> 0x386d }
            r8 = r2
            goto L_0x300c
        L_0x300a:
            if (r8 == 0) goto L_0x3010
        L_0x300c:
            X.Bm4 r6 = r8.A01(r6)     // Catch:{ Exception -> 0x386d }
        L_0x3010:
            if (r6 == 0) goto L_0x3a04
            r2 = 34
            int r3 = r6.A02(r2)     // Catch:{ Exception -> 0x386d }
            if (r3 == 0) goto L_0x3a04
            int r2 = r6.A00     // Catch:{ Exception -> 0x386d }
            int r3 = r3 + r2
            r6.A03(r3)     // Catch:{ Exception -> 0x386d }
            r2 = 34
            int r3 = r6.A02(r2)     // Catch:{ Exception -> 0x386d }
            if (r3 == 0) goto L_0x3a04
            int r2 = r6.A00     // Catch:{ Exception -> 0x386d }
            int r3 = r3 + r2
            java.lang.String r6 = r6.A03(r3)     // Catch:{ Exception -> 0x386d }
            java.lang.String r3 = "_"
            X.1wr r2 = new X.1wr     // Catch:{ Exception -> 0x386d }
            r2.<init>((java.lang.String) r3)     // Catch:{ Exception -> 0x386d }
            java.util.List r2 = r2.A01(r5, r4)     // Catch:{ Exception -> 0x386d }
            java.lang.String[] r3 = X.C108955ca.A1b(r2)     // Catch:{ Exception -> 0x386d }
            r5 = r3[r4]     // Catch:{ Exception -> 0x386d }
            int r2 = r3.length     // Catch:{ Exception -> 0x386d }
            if (r2 <= r1) goto L_0x305e
            r1 = r3[r1]     // Catch:{ Exception -> 0x386d }
        L_0x3045:
            java.util.Locale r3 = new java.util.Locale     // Catch:{ Exception -> 0x386d }
            r3.<init>(r5, r1)     // Catch:{ Exception -> 0x386d }
            java.lang.String[] r2 = X.C108955ca.A1b(r15)     // Catch:{ Exception -> 0x386d }
            int r1 = r2.length     // Catch:{ Exception -> 0x386d }
            java.lang.Object[] r2 = java.util.Arrays.copyOf(r2, r1)     // Catch:{ Exception -> 0x386d }
            int r1 = r2.length     // Catch:{ Exception -> 0x386d }
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r2, r1)     // Catch:{ Exception -> 0x386d }
            java.lang.String r3 = X.C108955ca.A12(r3, r6, r1)     // Catch:{ Exception -> 0x386d }
            goto L_0x3a10
        L_0x305e:
            java.lang.String r1 = ""
            goto L_0x3045
        L_0x3061:
            java.lang.StringBuilder r2 = X.AnonymousClass000.A10()     // Catch:{ Exception -> 0x386d }
            java.lang.String r1 = "Error loading flatbuffer language pack. The sizes of resource ids ("
            r2.append(r1)     // Catch:{ Exception -> 0x386d }
            r2.append(r6)     // Catch:{ Exception -> 0x386d }
            java.lang.String r1 = ") and resource values ("
            r2.append(r1)     // Catch:{ Exception -> 0x386d }
            r2.append(r3)     // Catch:{ Exception -> 0x386d }
            java.lang.String r1 = ") do not match."
            java.lang.RuntimeException r1 = X.BE9.A0n(r1, r2)     // Catch:{ Exception -> 0x386d }
        L_0x307b:
            throw r1     // Catch:{ Exception -> 0x386d }
        L_0x307c:
            java.lang.String r3 = "bk.action.animated.StartWithToken"
            boolean r3 = r5.equals(r3)     // Catch:{ all -> 0x3a16 }
            if (r3 == 0) goto L_0x39f6
            X.DOZ r7 = A07(r2, r0)     // Catch:{ all -> 0x3a16 }
            r3 = 0
            if (r7 == 0) goto L_0x3a10
            android.animation.Animator r6 = A03(r0, r4)     // Catch:{ all -> 0x3a16 }
            java.lang.String r5 = A0M(r0, r1)     // Catch:{ all -> 0x3a16 }
            X.Cw3 r4 = X.C26258Cw3.A01     // Catch:{ all -> 0x3a16 }
            X.C26258Cw3.A05(r6, r7, r5)     // Catch:{ all -> 0x3a16 }
            X.E9O r0 = r2.A02     // Catch:{ all -> 0x3a16 }
            if (r0 == 0) goto L_0x309f
            r0.BUC()     // Catch:{ all -> 0x3a16 }
        L_0x309f:
            r4.A06(r7, r5, r1)     // Catch:{ all -> 0x3a16 }
            goto L_0x3a10
        L_0x30a4:
            java.lang.String r2 = "bk.action.textspan.GetHeight"
            boolean r2 = r5.equals(r2)     // Catch:{ all -> 0x3a16 }
            if (r2 == 0) goto L_0x39f6
            java.lang.Object r1 = A0G(r0)     // Catch:{ all -> 0x3a16 }
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.common.bloks.component.TextSpanContext"
            X.C18070vi.A0z(r1, r0)     // Catch:{ all -> 0x3a16 }
            X.CRe r1 = (X.C24954CRe) r1     // Catch:{ all -> 0x3a16 }
            float r0 = r1.A02     // Catch:{ all -> 0x3a16 }
            double r0 = (double) r0     // Catch:{ all -> 0x3a16 }
            java.lang.Number r3 = X.C25343Ce2.A00(r0)     // Catch:{ all -> 0x3a16 }
            goto L_0x3a10
        L_0x30c0:
            java.lang.String r0 = "bk.action.GetClientTimezone"
            boolean r0 = r5.equals(r0)     // Catch:{ all -> 0x3a16 }
            if (r0 == 0) goto L_0x39f6
            java.util.TimeZone r0 = java.util.TimeZone.getDefault()     // Catch:{ all -> 0x3a16 }
            java.lang.String r3 = r0.getID()     // Catch:{ all -> 0x3a16 }
            goto L_0x3a10
        L_0x30d2:
            java.lang.String r3 = "bk.action.template.Make"
            boolean r3 = r5.equals(r3)     // Catch:{ all -> 0x3a16 }
            if (r3 == 0) goto L_0x39f6
            java.lang.Object r5 = A0H(r0, r2)     // Catch:{ all -> 0x3a16 }
            X.C18070vi.A0X(r5)     // Catch:{ all -> 0x3a16 }
            java.lang.Object r6 = r0.A00(r1)     // Catch:{ all -> 0x3a16 }
            java.lang.String r1 = "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any>"
            X.C18070vi.A0z(r6, r1)     // Catch:{ all -> 0x3a16 }
            java.util.Map r6 = (java.util.Map) r6     // Catch:{ all -> 0x3a16 }
            r1 = 2
            java.lang.String r4 = A0M(r0, r1)     // Catch:{ all -> 0x3a16 }
            boolean r0 = r5 instanceof java.lang.String     // Catch:{ all -> 0x3a16 }
            if (r0 == 0) goto L_0x311c
            X.CrK r1 = X.C25881Cns.A00(r2)     // Catch:{ all -> 0x3a16 }
            java.util.Map r0 = r1.A05     // Catch:{ all -> 0x3a16 }
            boolean r0 = r0.containsKey(r5)     // Catch:{ all -> 0x3a16 }
            if (r0 != 0) goto L_0x311c
            java.util.Map r0 = r1.A04     // Catch:{ all -> 0x3a16 }
            boolean r0 = r0.containsKey(r5)     // Catch:{ all -> 0x3a16 }
            if (r0 != 0) goto L_0x311c
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x3a16 }
            java.lang.String r0 = "Template with id "
            r1.append(r0)     // Catch:{ all -> 0x3a16 }
            r1.append(r5)     // Catch:{ all -> 0x3a16 }
            java.lang.String r0 = " not found"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A12(r0, r1)     // Catch:{ all -> 0x3a16 }
            throw r0     // Catch:{ all -> 0x3a16 }
        L_0x311c:
            java.util.List r0 = r2.A06     // Catch:{ all -> 0x3a16 }
            X.C18070vi.A0W(r0)     // Catch:{ all -> 0x3a16 }
            X.Cay r3 = new X.Cay     // Catch:{ all -> 0x3a16 }
            r3.<init>(r5, r4, r0, r6)     // Catch:{ all -> 0x3a16 }
            goto L_0x3a10
        L_0x3128:
            java.lang.String r3 = "bk.action.bloks.PrependChildren"
            boolean r3 = r5.equals(r3)     // Catch:{ all -> 0x3a16 }
            if (r3 == 0) goto L_0x39f6
            java.lang.String r5 = A0N(r0, r2)     // Catch:{ all -> 0x3a16 }
            java.lang.Object r4 = X.BE6.A0n(r0, r1)     // Catch:{ all -> 0x3a16 }
            java.lang.String r3 = "null cannot be cast to non-null type kotlin.collections.List<com.instagram.common.bloks.component.base.BloksModel>"
            java.util.List r3 = X.BE6.A13(r4, r3)     // Catch:{ all -> 0x3a16 }
            X.DNk r6 = A0A(r2, r0)     // Catch:{ all -> 0x3a16 }
            X.DNn r2 = new X.DNn     // Catch:{ all -> 0x3a16 }
            r2.<init>(r5)     // Catch:{ all -> 0x3a16 }
            X.Boe r0 = new X.Boe     // Catch:{ all -> 0x3a16 }
            r0.<init>(r3, r1)     // Catch:{ all -> 0x3a16 }
            goto L_0x35c6
        L_0x314e:
            java.lang.String r3 = "bk.action.animated.Resume"
            boolean r3 = r5.equals(r3)     // Catch:{ all -> 0x3a16 }
            if (r3 == 0) goto L_0x39f6
            X.DOZ r1 = A07(r2, r0)     // Catch:{ all -> 0x3a16 }
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r4)     // Catch:{ all -> 0x3a16 }
            if (r1 == 0) goto L_0x3a10
            java.lang.String r0 = A0M(r0, r4)     // Catch:{ all -> 0x3a16 }
            android.animation.Animator r1 = X.C26258Cw3.A02(r1, r0)     // Catch:{ all -> 0x3a16 }
            if (r1 == 0) goto L_0x3a10
            boolean r0 = r1.isPaused()     // Catch:{ all -> 0x3a16 }
            r1.resume()     // Catch:{ all -> 0x3a16 }
            if (r0 == 0) goto L_0x317f
            boolean r0 = r1.isPaused()     // Catch:{ all -> 0x3a16 }
            if (r0 != 0) goto L_0x317f
            goto L_0x317d
        L_0x317a:
            r0 = -1
            if (r1 == r0) goto L_0x317f
        L_0x317d:
            r0 = 1
            goto L_0x3180
        L_0x317f:
            r0 = 0
        L_0x3180:
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r0)     // Catch:{ all -> 0x3a16 }
            goto L_0x3a10
        L_0x3186:
            java.lang.String r7 = "bk.action.tooltip.Hide"
            boolean r3 = r5.equals(r7)     // Catch:{ all -> 0x3a16 }
            if (r3 == 0) goto L_0x39f6
            X.DOZ r3 = A07(r2, r0)     // Catch:{ all -> 0x3a16 }
            if (r3 == 0) goto L_0x31cc
            java.lang.Object r5 = r0.A00(r4)     // Catch:{ all -> 0x3a16 }
            X.C18070vi.A0X(r5)     // Catch:{ all -> 0x3a16 }
            X.DFL r5 = (X.DFL) r5     // Catch:{ all -> 0x3a16 }
            int r2 = r5.A05     // Catch:{ all -> 0x3a16 }
            r0 = 16444(0x403c, float:2.3043E-41)
            if (r2 != r0) goto L_0x31c8
            java.lang.Object r3 = X.BE9.A0l(r3, r5)     // Catch:{ all -> 0x3a16 }
            X.CiJ r3 = (X.C25579CiJ) r3     // Catch:{ all -> 0x3a16 }
            X.0vl r2 = r3.A04     // Catch:{ all -> 0x3a16 }
            java.lang.Object r0 = r2.getValue()     // Catch:{ all -> 0x3a16 }
            X.CWp r0 = (X.C25080CWp) r0     // Catch:{ all -> 0x3a16 }
            X.BIv r0 = r0.A02     // Catch:{ all -> 0x3a16 }
            boolean r0 = r0.isShowing()     // Catch:{ all -> 0x3a16 }
            if (r0 == 0) goto L_0x3a04
            java.lang.Object r0 = r2.getValue()     // Catch:{ all -> 0x3a16 }
            X.CWp r0 = (X.C25080CWp) r0     // Catch:{ all -> 0x3a16 }
            boolean r0 = r0.A01     // Catch:{ all -> 0x3a16 }
            if (r0 != 0) goto L_0x3a04
            X.C25579CiJ.A00(r3, r5, r4, r1)     // Catch:{ all -> 0x3a16 }
            goto L_0x3a04
        L_0x31c8:
            java.lang.String r0 = "Signature called with invalid model."
            goto L_0x366a
        L_0x31cc:
            java.lang.IllegalArgumentException r0 = X.C17890vO.A0K()     // Catch:{ all -> 0x3a16 }
            throw r0     // Catch:{ all -> 0x3a16 }
        L_0x31d1:
            java.lang.String r7 = "bk.action.tooltip.Show"
            boolean r3 = r5.equals(r7)     // Catch:{ all -> 0x3a16 }
            if (r3 == 0) goto L_0x39f6
            X.DOZ r3 = A07(r2, r0)     // Catch:{ all -> 0x3a16 }
            if (r3 == 0) goto L_0x3247
            java.lang.Object r6 = r0.A00(r4)     // Catch:{ all -> 0x3a16 }
            X.C18070vi.A0X(r6)     // Catch:{ all -> 0x3a16 }
            X.DFL r6 = (X.DFL) r6     // Catch:{ all -> 0x3a16 }
            int r2 = r6.A05     // Catch:{ all -> 0x3a16 }
            r0 = 16444(0x403c, float:2.3043E-41)
            if (r2 != r0) goto L_0x3243
            java.lang.Object r7 = X.BE9.A0l(r3, r6)     // Catch:{ all -> 0x3a16 }
            X.CiJ r7 = (X.C25579CiJ) r7     // Catch:{ all -> 0x3a16 }
            X.0vl r2 = r7.A04     // Catch:{ all -> 0x3a16 }
            java.lang.Object r0 = r2.getValue()     // Catch:{ all -> 0x3a16 }
            X.CWp r0 = (X.C25080CWp) r0     // Catch:{ all -> 0x3a16 }
            X.BIv r0 = r0.A02     // Catch:{ all -> 0x3a16 }
            boolean r0 = r0.isShowing()     // Catch:{ all -> 0x3a16 }
            if (r0 != 0) goto L_0x3a04
            java.lang.Object r0 = r2.getValue()     // Catch:{ all -> 0x3a16 }
            X.CWp r0 = (X.C25080CWp) r0     // Catch:{ all -> 0x3a16 }
            boolean r0 = r0.A01     // Catch:{ all -> 0x3a16 }
            if (r0 != 0) goto L_0x3a04
            android.view.View r3 = r7.A00     // Catch:{ all -> 0x3a16 }
            if (r3 == 0) goto L_0x3a04
            java.lang.Object r2 = r2.getValue()     // Catch:{ all -> 0x3a16 }
            X.CWp r2 = (X.C25080CWp) r2     // Catch:{ all -> 0x3a16 }
            X.DqD r5 = new X.DqD     // Catch:{ all -> 0x3a16 }
            r5.<init>(r7, r6)     // Catch:{ all -> 0x3a16 }
            X.0vl r0 = r2.A04     // Catch:{ all -> 0x3a16 }
            java.lang.Object r0 = r0.getValue()     // Catch:{ all -> 0x3a16 }
            X.Cpy r0 = (X.C25984Cpy) r0     // Catch:{ all -> 0x3a16 }
            X.0Mk r4 = r0.A02(r3, r6)     // Catch:{ all -> 0x3a16 }
            if (r4 == 0) goto L_0x323e
            X.BIv r3 = r2.A02     // Catch:{ all -> 0x3a16 }
            android.view.View r2 = r3.getContentView()     // Catch:{ all -> 0x3a16 }
            java.lang.String r0 = "null cannot be cast to non-null type com.facebook.rendercore.RenderTreeHostView"
            X.C18070vi.A0z(r2, r0)     // Catch:{ all -> 0x3a16 }
            X.0By r2 = (X.C01920By) r2     // Catch:{ all -> 0x3a16 }
            r2.setRenderTree(r4)     // Catch:{ all -> 0x3a16 }
            r5.invoke(r3)     // Catch:{ all -> 0x3a16 }
        L_0x323e:
            X.C25579CiJ.A00(r7, r6, r1, r1)     // Catch:{ all -> 0x3a16 }
            goto L_0x3a04
        L_0x3243:
            java.lang.String r0 = "Signature called with invalid model."
            goto L_0x366a
        L_0x3247:
            java.lang.IllegalArgumentException r0 = X.C17890vO.A0K()     // Catch:{ all -> 0x3a16 }
            throw r0     // Catch:{ all -> 0x3a16 }
        L_0x324c:
            java.lang.String r3 = "bk.action.textinput.GetSensitiveText"
            boolean r3 = r5.equals(r3)     // Catch:{ all -> 0x3a16 }
            if (r3 == 0) goto L_0x39f6
            X.DFL r1 = A0E(r0, r2)     // Catch:{ all -> 0x3a16 }
            X.DOZ r0 = r2.A00     // Catch:{ all -> 0x3a16 }
            if (r0 == 0) goto L_0x328c
            java.lang.Object r2 = X.C26272CwJ.A04(r0, r1)     // Catch:{ all -> 0x3a16 }
            java.lang.String r1 = ""
            r3 = 0
            boolean r0 = r2 instanceof X.CTH     // Catch:{ all -> 0x3a16 }
            if (r0 == 0) goto L_0x3a10
            X.CTH r2 = (X.CTH) r2     // Catch:{ all -> 0x3a16 }
            com.facebook.primitive.textinput.TextInputView r0 = r2.A02     // Catch:{ all -> 0x3a16 }
            if (r0 == 0) goto L_0x3276
            android.text.Editable r0 = r0.getText()     // Catch:{ all -> 0x3a16 }
            if (r0 == 0) goto L_0x3276
        L_0x3273:
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0     // Catch:{ all -> 0x3a16 }
            goto L_0x327c
        L_0x3276:
            java.lang.CharSequence r0 = r2.A05     // Catch:{ all -> 0x3a16 }
            if (r0 != 0) goto L_0x327c
            r0 = r1
            goto L_0x3273
        L_0x327c:
            if (r0 == 0) goto L_0x3285
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x3a16 }
            if (r0 == 0) goto L_0x3285
            r1 = r0
        L_0x3285:
            X.CVO r3 = new X.CVO     // Catch:{ all -> 0x3a16 }
            r3.<init>(r1)     // Catch:{ all -> 0x3a16 }
            goto L_0x3a10
        L_0x328c:
            java.lang.IllegalArgumentException r0 = X.C17890vO.A0K()     // Catch:{ all -> 0x3a16 }
            throw r0     // Catch:{ all -> 0x3a16 }
        L_0x3291:
            java.lang.String r2 = "bk.action.ttrc.InteractionFailed"
            boolean r2 = r5.equals(r2)     // Catch:{ all -> 0x3a16 }
            if (r2 == 0) goto L_0x39f6
            X.C18070vi.A0d(r0, r4)     // Catch:{ all -> 0x3a16 }
            int r3 = A02(r0, r4)     // Catch:{ all -> 0x3a16 }
            java.lang.String r2 = A0M(r0, r1)     // Catch:{ all -> 0x3a16 }
            r1 = 2
            java.lang.String r1 = X.AnonymousClass8BT.A0t(r0, r1)     // Catch:{ all -> 0x3a16 }
            X.A8s r0 = X.A7e.A00(r2, r3)     // Catch:{ all -> 0x3a16 }
            if (r0 == 0) goto L_0x3a04
            r0.A0D(r1)     // Catch:{ all -> 0x3a16 }
            goto L_0x3a04
        L_0x32b4:
            java.lang.String r3 = "bk.action.bloks.FetchAsyncComponents"
            boolean r3 = r5.equals(r3)     // Catch:{ all -> 0x3a16 }
            if (r3 == 0) goto L_0x39f6
            X.C18070vi.A0d(r0, r4)     // Catch:{ all -> 0x3a16 }
            X.C18070vi.A0d(r2, r1)     // Catch:{ all -> 0x3a16 }
            java.lang.String r7 = A0M(r0, r4)     // Catch:{ all -> 0x3a16 }
            java.lang.Object r8 = r0.A00(r1)     // Catch:{ all -> 0x3a16 }
            java.lang.String r1 = "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any>"
            X.C18070vi.A0z(r8, r1)     // Catch:{ all -> 0x3a16 }
            java.util.Map r8 = (java.util.Map) r8     // Catch:{ all -> 0x3a16 }
            r1 = 2
            java.lang.Object r3 = r0.A00(r1)     // Catch:{ all -> 0x3a16 }
            java.lang.String r1 = "null cannot be cast to non-null type kotlin.Number"
            X.C18070vi.A0z(r3, r1)     // Catch:{ all -> 0x3a16 }
            long r10 = X.C17880vN.A05(r3)     // Catch:{ all -> 0x3a16 }
            r1 = 3
            java.util.List r0 = r0.A00     // Catch:{ all -> 0x3a16 }
            X.DFL r1 = X.AnonymousClass8BR.A0G(r0, r1)     // Catch:{ all -> 0x3a16 }
            r3 = 0
            if (r1 == 0) goto L_0x3339
            java.lang.String r5 = X.BE7.A0e(r1)     // Catch:{ all -> 0x3a16 }
            if (r5 == 0) goto L_0x3339
            java.util.Locale r0 = java.util.Locale.ROOT     // Catch:{ all -> 0x3a16 }
            java.lang.String r0 = r5.toUpperCase(r0)     // Catch:{ all -> 0x3a16 }
            X.C18070vi.A0X(r0)     // Catch:{ all -> 0x3a16 }
            X.Byi r5 = X.C24285Byi.valueOf(r0)     // Catch:{ all -> 0x3a16 }
        L_0x32fc:
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.common.bloks.componentquery.BloksComponentQueryStore.BloksAsyncComponentQueryPurpose"
            X.C18070vi.A0z(r5, r0)     // Catch:{ all -> 0x3a16 }
            r0 = 41
            boolean r13 = r1.A0I(r0, r4)     // Catch:{ all -> 0x3a16 }
            r0 = 40
            boolean r12 = r1.A0I(r0, r4)     // Catch:{ all -> 0x3a16 }
            r0 = 43
            java.util.List r0 = X.BE7.A0s(r1, r0)     // Catch:{ all -> 0x3a16 }
            java.util.Set r9 = X.C29431cG.A12(r0)     // Catch:{ all -> 0x3a16 }
            X.DOZ r1 = r2.A00     // Catch:{ all -> 0x3a16 }
            if (r1 == 0) goto L_0x3a10
            r0 = 2131428152(0x7f0b0338, float:1.847794E38)
            java.lang.Object r6 = r1.A01(r0)     // Catch:{ all -> 0x3a16 }
            X.CqT r6 = (X.C26012CqT) r6     // Catch:{ all -> 0x3a16 }
            if (r6 == 0) goto L_0x3a10
            X.C18070vi.A0h(r7, r8)     // Catch:{ all -> 0x3a16 }
            r0 = 5
            X.C18070vi.A0d(r5, r0)     // Catch:{ all -> 0x3a16 }
            java.util.concurrent.Executor r0 = r6.A0B     // Catch:{ all -> 0x3a16 }
            X.DTK r4 = new X.DTK     // Catch:{ all -> 0x3a16 }
            r4.<init>(r5, r6, r7, r8, r9, r10, r12, r13)     // Catch:{ all -> 0x3a16 }
            r0.execute(r4)     // Catch:{ all -> 0x3a16 }
            goto L_0x3a10
        L_0x3339:
            r5 = r3
            goto L_0x32fc
        L_0x333b:
            java.lang.String r3 = "bk.action.component.GetWidth"
            boolean r3 = r5.equals(r3)     // Catch:{ all -> 0x3a16 }
            if (r3 == 0) goto L_0x39f6
            java.lang.Object r1 = A0I(r0, r2)     // Catch:{ all -> 0x3a16 }
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.common.bloks.component.base.BloksModel"
            X.C18070vi.A0z(r1, r0)     // Catch:{ all -> 0x3a16 }
            X.DFL r1 = (X.DFL) r1     // Catch:{ all -> 0x3a16 }
            X.DOZ r0 = r2.A00     // Catch:{ all -> 0x3a16 }
            android.view.View r0 = r1.A06(r0)     // Catch:{ all -> 0x3a16 }
            if (r0 == 0) goto L_0x3a04
            int r0 = r0.getWidth()     // Catch:{ all -> 0x3a16 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x3a16 }
            goto L_0x3a10
        L_0x3360:
            java.lang.String r3 = "bk.action.bloks.ReplaceEmbeddedChildrenAfter"
            boolean r3 = r5.equals(r3)     // Catch:{ all -> 0x3a16 }
            if (r3 == 0) goto L_0x39f6
            java.lang.Object r3 = A0J(r0, r2)     // Catch:{ all -> 0x3a16 }
            java.lang.String r1 = "null cannot be cast to non-null type kotlin.collections.List<com.instagram.common.bloks.BloksParseResult>"
            java.util.List r3 = X.BE6.A13(r3, r1)     // Catch:{ all -> 0x3a16 }
            java.lang.String r1 = A0K(r0)     // Catch:{ all -> 0x3a16 }
            X.DNk r5 = A0B(r2, r0)     // Catch:{ all -> 0x3a16 }
            java.util.ArrayList r0 = A0P(r5, r3)     // Catch:{ all -> 0x3a16 }
            X.DNl r6 = A0C(r1)     // Catch:{ all -> 0x3a16 }
            X.Boc r2 = new X.Boc     // Catch:{ all -> 0x3a16 }
            r2.<init>(r1, r0)     // Catch:{ all -> 0x3a16 }
            goto L_0x35f2
        L_0x3389:
            java.lang.String r3 = "bk.action.animated.Parallel"
            boolean r3 = r5.equals(r3)     // Catch:{ all -> 0x3a16 }
            if (r3 == 0) goto L_0x39f6
            X.DOZ r7 = A07(r2, r0)     // Catch:{ all -> 0x3a16 }
            if (r7 == 0) goto L_0x3a04
            java.util.List r3 = r0.A00     // Catch:{ all -> 0x3a16 }
            X.E8A r6 = X.AnonymousClass8BT.A08(r3, r4)     // Catch:{ all -> 0x3a16 }
            float r5 = A00(r0, r1)     // Catch:{ all -> 0x3a16 }
            r3 = 2
            java.lang.Object r3 = r0.A00(r3)     // Catch:{ all -> 0x3a16 }
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.collections.List<android.animation.Animator>"
            java.util.List r8 = X.BE6.A13(r3, r0)     // Catch:{ all -> 0x3a16 }
            long r3 = X.C26258Cw3.A00     // Catch:{ all -> 0x3a16 }
            float r0 = (float) r3     // Catch:{ all -> 0x3a16 }
            float r5 = r5 * r0
            long r4 = (long) r5     // Catch:{ all -> 0x3a16 }
            X.C18070vi.A0d(r8, r1)     // Catch:{ all -> 0x3a16 }
            A0Q(r7, r8)     // Catch:{ all -> 0x3a16 }
            int r0 = r8.size()     // Catch:{ all -> 0x3a16 }
            if (r0 != r1) goto L_0x33c7
            java.lang.Object r3 = X.C29431cG.A0b(r8)     // Catch:{ all -> 0x3a16 }
            android.animation.Animator r3 = (android.animation.Animator) r3     // Catch:{ all -> 0x3a16 }
            X.C26258Cw3.A03(r3, r4)     // Catch:{ all -> 0x3a16 }
            goto L_0x33e5
        L_0x33c7:
            java.util.Iterator r1 = r8.iterator()     // Catch:{ all -> 0x3a16 }
        L_0x33cb:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x3a16 }
            if (r0 == 0) goto L_0x33de
            java.lang.Object r0 = r1.next()     // Catch:{ all -> 0x3a16 }
            android.animation.Animator r0 = (android.animation.Animator) r0     // Catch:{ all -> 0x3a16 }
            X.C26272CwJ.A05(r0, r7)     // Catch:{ all -> 0x3a16 }
            X.C26258Cw3.A03(r0, r4)     // Catch:{ all -> 0x3a16 }
            goto L_0x33cb
        L_0x33de:
            java.lang.Integer r0 = X.AnonymousClass00R.A00     // Catch:{ all -> 0x3a16 }
            X.BEC r3 = new X.BEC     // Catch:{ all -> 0x3a16 }
            r3.<init>(r0, r8)     // Catch:{ all -> 0x3a16 }
        L_0x33e5:
            if (r6 == 0) goto L_0x3a10
            r0 = 0
            X.C18070vi.A0d(r3, r0)     // Catch:{ all -> 0x3a16 }
            X.BEP r0 = new X.BEP     // Catch:{ all -> 0x3a16 }
            r0.<init>(r7, r2, r6)     // Catch:{ all -> 0x3a16 }
            goto L_0x39a3
        L_0x33f2:
            java.lang.String r3 = "bk.action.bloks.ReplaceEmbeddedChildV2"
            boolean r3 = r5.equals(r3)     // Catch:{ all -> 0x3a16 }
            if (r3 == 0) goto L_0x39f6
            java.lang.Object r3 = A0J(r0, r2)     // Catch:{ all -> 0x3a16 }
            java.lang.String r1 = "null cannot be cast to non-null type kotlin.collections.List<com.instagram.common.bloks.BloksParseResult>"
            java.util.List r4 = X.BE6.A13(r3, r1)     // Catch:{ all -> 0x3a16 }
            java.lang.String r3 = A0K(r0)     // Catch:{ all -> 0x3a16 }
            X.DNk r1 = A0B(r2, r0)     // Catch:{ all -> 0x3a16 }
            java.util.ArrayList r0 = A0P(r1, r4)     // Catch:{ all -> 0x3a16 }
            A0R(r1, r3, r0)     // Catch:{ all -> 0x3a16 }
            goto L_0x3a04
        L_0x3415:
            java.lang.String r3 = "bk.action.bloks.GetValue"
            boolean r3 = r5.equals(r3)     // Catch:{ all -> 0x3a16 }
            if (r3 == 0) goto L_0x39f6
            X.C18070vi.A0d(r0, r4)     // Catch:{ all -> 0x3a16 }
            X.C18070vi.A0d(r2, r1)     // Catch:{ all -> 0x3a16 }
            java.lang.String r11 = A0M(r0, r4)     // Catch:{ all -> 0x3a16 }
            X.CrK r0 = X.C25881Cns.A00(r2)     // Catch:{ all -> 0x3a16 }
            java.util.Map r0 = r0.A06     // Catch:{ all -> 0x3a16 }
            java.lang.Object r10 = r0.get(r11)     // Catch:{ all -> 0x3a16 }
            X.CQM r10 = (X.CQM) r10     // Catch:{ all -> 0x3a16 }
            if (r10 == 0) goto L_0x34ec
            java.lang.Integer r0 = r10.A01     // Catch:{ all -> 0x3a16 }
            if (r0 != 0) goto L_0x343d
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)     // Catch:{ all -> 0x3a16 }
        L_0x343d:
            int r3 = r0.intValue()     // Catch:{ all -> 0x3a16 }
            if (r3 == 0) goto L_0x344b
            java.util.List r1 = r2.A06     // Catch:{ all -> 0x3a16 }
            java.lang.Integer r0 = X.AnonymousClass00R.A00     // Catch:{ all -> 0x3a16 }
            java.lang.String r11 = X.C25968Cpa.A00(r0, r11, r1, r3)     // Catch:{ all -> 0x3a16 }
        L_0x344b:
            java.util.Map r12 = r2.A0A     // Catch:{ all -> 0x3a16 }
            if (r12 == 0) goto L_0x34d6
            java.lang.Object r3 = r12.get(r11)     // Catch:{ all -> 0x3a16 }
            X.CaG r3 = (X.C25165CaG) r3     // Catch:{ all -> 0x3a16 }
            if (r3 != 0) goto L_0x34c7
            java.util.HashSet r0 = X.C17880vN.A12()     // Catch:{ all -> 0x3a16 }
            X.CLa r9 = new X.CLa     // Catch:{ all -> 0x3a16 }
            r9.<init>(r0)     // Catch:{ all -> 0x3a16 }
            X.DOZ r0 = r2.A00     // Catch:{ all -> 0x3a16 }
            r19 = r0
            X.E8A r0 = r2.A04     // Catch:{ all -> 0x3a16 }
            r18 = r0
            java.util.List r0 = r2.A06     // Catch:{ all -> 0x3a16 }
            r17 = r0
            java.util.Map r15 = r2.A09     // Catch:{ all -> 0x3a16 }
            X.CrK r14 = r2.A01     // Catch:{ all -> 0x3a16 }
            X.B6x r13 = r2.A01     // Catch:{ all -> 0x3a16 }
            X.CFu r8 = r2.A03     // Catch:{ all -> 0x3a16 }
            java.lang.String r7 = r2.A07     // Catch:{ all -> 0x3a16 }
            X.E9O r6 = r2.A02     // Catch:{ all -> 0x3a16 }
            java.lang.String r5 = r2.A06     // Catch:{ all -> 0x3a16 }
            java.lang.Integer r4 = r2.A05     // Catch:{ all -> 0x3a16 }
            java.lang.ref.WeakReference r0 = r2.A08     // Catch:{ all -> 0x3a16 }
            java.lang.Object r3 = r0.get()     // Catch:{ all -> 0x3a16 }
            X.DOZ r3 = (X.DOZ) r3     // Catch:{ all -> 0x3a16 }
            X.9zJ r1 = r2.A05     // Catch:{ all -> 0x3a16 }
            X.Boh r0 = new X.Boh     // Catch:{ all -> 0x3a16 }
            r22 = r9
            r23 = r8
            r24 = r1
            r25 = r18
            r26 = r13
            r27 = r4
            r28 = r7
            r29 = r5
            r30 = r17
            r31 = r15
            r32 = r12
            r18 = r6
            r20 = r3
            r21 = r14
            r17 = r0
            r17.<init>(r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32)     // Catch:{ all -> 0x3a16 }
            X.DNu r3 = r10.A00     // Catch:{ all -> 0x3a16 }
            r1 = 0
            X.DNu r3 = r3.A00(r1, r1)     // Catch:{ all -> 0x3a16 }
            boolean r1 = r3 instanceof X.C28669EDl     // Catch:{ all -> 0x3a16 }
            if (r1 == 0) goto L_0x34b7
            r3.BKO()     // Catch:{ all -> 0x3a16 }
        L_0x34b7:
            X.9zJ r1 = X.C199029zJ.A01     // Catch:{ all -> 0x3a16 }
            java.lang.Object r1 = X.C25974Cph.A01(r0, r1, r3)     // Catch:{ all -> 0x3a16 }
            java.util.Set r0 = r9.A00     // Catch:{ all -> 0x3a16 }
            X.CaG r3 = new X.CaG     // Catch:{ all -> 0x3a16 }
            r3.<init>(r1, r0)     // Catch:{ all -> 0x3a16 }
            r12.put(r11, r3)     // Catch:{ all -> 0x3a16 }
        L_0x34c7:
            X.CLa r0 = r2.A02     // Catch:{ all -> 0x3a16 }
            if (r0 == 0) goto L_0x34d2
            java.util.Set r1 = r3.A01     // Catch:{ all -> 0x3a16 }
            java.util.Set r0 = r0.A00     // Catch:{ all -> 0x3a16 }
            X.C29401cD.A0J(r1, r0)     // Catch:{ all -> 0x3a16 }
        L_0x34d2:
            java.lang.Object r3 = r3.A00     // Catch:{ all -> 0x3a16 }
            goto L_0x3a10
        L_0x34d6:
            X.DNu r1 = r10.A00     // Catch:{ all -> 0x3a16 }
            r0 = 0
            X.DNu r1 = r1.A00(r0, r0)     // Catch:{ all -> 0x3a16 }
            boolean r0 = r1 instanceof X.C28669EDl     // Catch:{ all -> 0x3a16 }
            if (r0 == 0) goto L_0x34e4
            r1.BKO()     // Catch:{ all -> 0x3a16 }
        L_0x34e4:
            X.9zJ r0 = X.C199029zJ.A01     // Catch:{ all -> 0x3a16 }
            java.lang.Object r3 = X.C25974Cph.A01(r2, r0, r1)     // Catch:{ all -> 0x3a16 }
            goto L_0x3a10
        L_0x34ec:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x3a16 }
            java.lang.String r0 = "Value for referenced id "
            r1.append(r0)     // Catch:{ all -> 0x3a16 }
            r1.append(r11)     // Catch:{ all -> 0x3a16 }
            java.lang.String r0 = " not found! "
            java.lang.String r0 = X.AnonymousClass000.A0y(r0, r1)     // Catch:{ all -> 0x3a16 }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A11(r0)     // Catch:{ all -> 0x3a16 }
            java.lang.String r0 = "\n\nYou are running parseEmbedded without the parent Bloks Context needed to process the data manifests. If you are implementing a new feature, check to makesure you're not calling evaluateWithoutTreeDANGEROUSLY on your signature. Otherwise, this is an infra error that you should post in the Bloks Q&A group about."
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A12(r0, r1)     // Catch:{ all -> 0x3a16 }
            throw r0     // Catch:{ all -> 0x3a16 }
        L_0x3509:
            java.lang.String r3 = "bk.action.animated.Sequence"
            boolean r3 = r5.equals(r3)     // Catch:{ all -> 0x3a16 }
            if (r3 == 0) goto L_0x39f6
            X.DOZ r7 = A07(r2, r0)     // Catch:{ all -> 0x3a16 }
            if (r7 == 0) goto L_0x3a04
            java.lang.Object r2 = r0.A00(r4)     // Catch:{ all -> 0x3a16 }
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.collections.List<android.animation.Animator>"
            java.util.List r8 = X.BE6.A13(r2, r0)     // Catch:{ all -> 0x3a16 }
            X.C18070vi.A0d(r8, r1)     // Catch:{ all -> 0x3a16 }
            A0Q(r7, r8)     // Catch:{ all -> 0x3a16 }
            int r6 = r8.size()     // Catch:{ all -> 0x3a16 }
            if (r6 == r1) goto L_0x3552
            r5 = 0
        L_0x352e:
            if (r5 >= r6) goto L_0x3557
            java.lang.Object r4 = r8.get(r5)     // Catch:{ all -> 0x3a16 }
            android.animation.Animator r4 = (android.animation.Animator) r4     // Catch:{ all -> 0x3a16 }
            X.C26272CwJ.A05(r4, r7)     // Catch:{ all -> 0x3a16 }
            if (r5 <= 0) goto L_0x354f
            int r0 = r5 + -1
            java.lang.Object r0 = r8.get(r0)     // Catch:{ all -> 0x3a16 }
            android.animation.Animator r0 = (android.animation.Animator) r0     // Catch:{ all -> 0x3a16 }
            long r2 = r0.getStartDelay()     // Catch:{ all -> 0x3a16 }
            long r0 = r0.getDuration()     // Catch:{ all -> 0x3a16 }
            long r2 = r2 + r0
            X.C26258Cw3.A03(r4, r2)     // Catch:{ all -> 0x3a16 }
        L_0x354f:
            int r5 = r5 + 1
            goto L_0x352e
        L_0x3552:
            java.lang.Object r3 = X.C29431cG.A0b(r8)     // Catch:{ all -> 0x3a16 }
            goto L_0x355e
        L_0x3557:
            java.lang.Integer r0 = X.AnonymousClass00R.A01     // Catch:{ all -> 0x3a16 }
        L_0x3559:
            X.BEC r3 = new X.BEC     // Catch:{ all -> 0x3a16 }
            r3.<init>(r0, r8)     // Catch:{ all -> 0x3a16 }
        L_0x355e:
            android.animation.Animator r3 = (android.animation.Animator) r3     // Catch:{ all -> 0x3a16 }
            goto L_0x3a10
        L_0x3562:
            java.lang.String r2 = "bk.action.ttrc.SurfaceLeft"
            boolean r2 = r5.equals(r2)     // Catch:{ all -> 0x3a16 }
            if (r2 == 0) goto L_0x39f6
            X.C18070vi.A0d(r0, r4)     // Catch:{ all -> 0x3a16 }
            int r2 = A02(r0, r4)     // Catch:{ all -> 0x3a16 }
            java.lang.String r0 = A0M(r0, r1)     // Catch:{ all -> 0x3a16 }
            X.A8s r1 = X.A7e.A00(r0, r2)     // Catch:{ all -> 0x3a16 }
            if (r1 == 0) goto L_0x3a04
            java.lang.String r0 = "leftSurface"
            r1.A0E(r0)     // Catch:{ all -> 0x3a16 }
            goto L_0x3a04
        L_0x3582:
            java.lang.String r2 = "data.Get"
            boolean r2 = r5.equals(r2)     // Catch:{ all -> 0x3a16 }
            if (r2 == 0) goto L_0x39f6
            X.C18070vi.A0d(r0, r4)     // Catch:{ all -> 0x3a16 }
            java.util.List r2 = r0.A00     // Catch:{ all -> 0x3a16 }
            X.DFL r2 = X.AnonymousClass8BR.A0G(r2, r4)     // Catch:{ all -> 0x3a16 }
            int r1 = A02(r0, r1)     // Catch:{ all -> 0x3a16 }
            if (r2 == 0) goto L_0x3a04
            android.util.SparseArray r0 = r2.A06     // Catch:{ all -> 0x3a16 }
            java.lang.Object r3 = r0.get(r1)     // Catch:{ all -> 0x3a16 }
            goto L_0x3a10
        L_0x35a1:
            java.lang.String r3 = "bk.action.bloks.ReplaceChildren"
            boolean r3 = r5.equals(r3)     // Catch:{ all -> 0x3a16 }
            if (r3 == 0) goto L_0x39f6
            java.lang.String r4 = A0N(r0, r2)     // Catch:{ all -> 0x3a16 }
            java.lang.Object r3 = X.BE6.A0n(r0, r1)     // Catch:{ all -> 0x3a16 }
            java.lang.String r1 = "null cannot be cast to non-null type kotlin.collections.List<com.instagram.common.bloks.component.base.BloksModel>"
            java.util.List r3 = X.BE6.A13(r3, r1)     // Catch:{ all -> 0x3a16 }
            X.DNk r6 = A0A(r2, r0)     // Catch:{ all -> 0x3a16 }
            X.DNn r2 = new X.DNn     // Catch:{ all -> 0x3a16 }
            r2.<init>(r4)     // Catch:{ all -> 0x3a16 }
            r1 = 0
            X.Boe r0 = new X.Boe     // Catch:{ all -> 0x3a16 }
            r0.<init>(r3, r1)     // Catch:{ all -> 0x3a16 }
        L_0x35c6:
            r6.A0A(r2, r0)     // Catch:{ all -> 0x3a16 }
            goto L_0x3a04
        L_0x35cb:
            java.lang.String r3 = "bk.action.bloks.InsertEmbeddedChildrenAfter"
            boolean r3 = r5.equals(r3)     // Catch:{ all -> 0x3a16 }
            if (r3 == 0) goto L_0x39f6
            java.lang.Object r4 = A0J(r0, r2)     // Catch:{ all -> 0x3a16 }
            java.lang.String r3 = "null cannot be cast to non-null type kotlin.collections.List<com.instagram.common.bloks.BloksParseResult>"
            java.util.List r4 = X.BE6.A13(r4, r3)     // Catch:{ all -> 0x3a16 }
            java.lang.String r3 = A0K(r0)     // Catch:{ all -> 0x3a16 }
            X.DNk r5 = A0B(r2, r0)     // Catch:{ all -> 0x3a16 }
            java.util.ArrayList r0 = A0P(r5, r4)     // Catch:{ all -> 0x3a16 }
            X.DNl r6 = A0C(r3)     // Catch:{ all -> 0x3a16 }
            X.Bog r2 = new X.Bog     // Catch:{ all -> 0x3a16 }
            r2.<init>(r0, r1, r3)     // Catch:{ all -> 0x3a16 }
        L_0x35f2:
            r5.A0A(r6, r2)     // Catch:{ all -> 0x3a16 }
            goto L_0x3a04
        L_0x35f7:
            java.lang.String r3 = "bk.action.core.GetTemplateArg"
            boolean r3 = r5.equals(r3)     // Catch:{ all -> 0x3a16 }
            if (r3 == 0) goto L_0x39f6
            X.C18070vi.A0d(r0, r4)     // Catch:{ all -> 0x3a16 }
            X.C18070vi.A0d(r2, r1)     // Catch:{ all -> 0x3a16 }
            r6 = 0
            java.lang.String r5 = A0M(r0, r4)     // Catch:{ all -> 0x3a16 }
            java.util.List r4 = r0.A00     // Catch:{ all -> 0x3a16 }
            int r3 = r4.size()     // Catch:{ all -> 0x3a16 }
            r0 = 2
            if (r3 < r0) goto L_0x3629
            java.lang.Object r1 = r4.get(r1)     // Catch:{ all -> 0x3a16 }
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.Number"
            X.C18070vi.A0z(r1, r0)     // Catch:{ all -> 0x3a16 }
            int r3 = X.AnonymousClass000.A0M(r1)     // Catch:{ all -> 0x3a16 }
        L_0x3620:
            java.util.List r1 = r2.A06     // Catch:{ all -> 0x3a16 }
            if (r1 == 0) goto L_0x362b
            int r6 = r1.size()     // Catch:{ all -> 0x3a16 }
            goto L_0x362b
        L_0x3629:
            r3 = 0
            goto L_0x3620
        L_0x362b:
            if (r3 > r6) goto L_0x3646
            java.lang.Integer r0 = X.AnonymousClass00R.A01     // Catch:{ all -> 0x3a16 }
            java.lang.String r1 = X.C25968Cpa.A00(r0, r5, r1, r3)     // Catch:{ all -> 0x3a16 }
        L_0x3633:
            java.util.Map r0 = X.C25968Cpa.A01(r2)     // Catch:{ all -> 0x3a16 }
            java.lang.Object r3 = r0.get(r1)     // Catch:{ all -> 0x3a16 }
            X.CLa r0 = r2.A02     // Catch:{ all -> 0x3a16 }
            if (r0 == 0) goto L_0x3a10
            java.util.Set r0 = r0.A00     // Catch:{ all -> 0x3a16 }
            r0.add(r1)     // Catch:{ all -> 0x3a16 }
            goto L_0x3a10
        L_0x3646:
            java.lang.String r0 = "Depth supplied should never exceed the size of the key path."
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0k(r0)     // Catch:{ all -> 0x3a16 }
            throw r0     // Catch:{ all -> 0x3a16 }
        L_0x364d:
            java.lang.String r7 = "bk.action.toast.ShowToastV2"
            boolean r3 = r5.equals(r7)     // Catch:{ all -> 0x3a16 }
            if (r3 == 0) goto L_0x39f6
            java.lang.Object r5 = A0H(r0, r2)     // Catch:{ all -> 0x3a16 }
            X.CvV r5 = (X.C26235CvV) r5     // Catch:{ all -> 0x3a16 }
            java.util.List r3 = r0.A00     // Catch:{ all -> 0x3a16 }
            X.DFL r6 = X.AnonymousClass8BR.A0G(r3, r1)     // Catch:{ all -> 0x3a16 }
            r3 = 2
            X.DOZ r22 = A06(r2, r0, r3)     // Catch:{ all -> 0x3a16 }
            if (r6 != 0) goto L_0x366f
            java.lang.String r0 = "Cannot show toast with invalid options."
        L_0x366a:
            X.C25913CoX.A01(r7, r0)     // Catch:{ all -> 0x3a16 }
            goto L_0x3a04
        L_0x366f:
            X.DNk r3 = X.C26272CwJ.A01(r22)     // Catch:{ all -> 0x3a16 }
            r0 = 0
            r3.A08(r5, r0)     // Catch:{ all -> 0x3a16 }
            r3 = 35
            r0 = 5000(0x1388, float:7.006E-42)
            int r7 = r6.A04(r3, r0)     // Catch:{ all -> 0x3a16 }
            r0 = 42
            r3 = 100
            int r27 = r6.A04(r0, r3)     // Catch:{ all -> 0x3a16 }
            r0 = 36
            int r28 = r6.A04(r0, r3)     // Catch:{ all -> 0x3a16 }
            r0 = 43
            X.DFL r0 = r6.A09(r0)     // Catch:{ all -> 0x3a16 }
            android.view.animation.Interpolator r18 = A04(r0)     // Catch:{ all -> 0x3a16 }
            r0 = 38
            X.DFL r0 = r6.A09(r0)     // Catch:{ all -> 0x3a16 }
            android.view.animation.Interpolator r19 = A04(r0)     // Catch:{ all -> 0x3a16 }
            r0 = 41
            X.E8A r0 = r6.A0A(r0)     // Catch:{ all -> 0x3a16 }
            X.D8E r3 = new X.D8E     // Catch:{ all -> 0x3a16 }
            r3.<init>(r2, r0)     // Catch:{ all -> 0x3a16 }
            r0 = 40
            X.E8A r8 = r6.A0A(r0)     // Catch:{ all -> 0x3a16 }
            X.D8C r0 = new X.D8C     // Catch:{ all -> 0x3a16 }
            r0.<init>(r2, r8, r1)     // Catch:{ all -> 0x3a16 }
            r1 = 54
            boolean r29 = r6.A0I(r1, r4)     // Catch:{ all -> 0x3a16 }
            X.DFL r1 = r5.A01     // Catch:{ all -> 0x3a16 }
            java.lang.String r25 = r1.A0C()     // Catch:{ all -> 0x3a16 }
            r1 = 44
            java.lang.String r2 = r6.A0D(r1)     // Catch:{ all -> 0x3a16 }
            java.lang.String r1 = "mini"
            boolean r30 = r1.equals(r2)     // Catch:{ all -> 0x3a16 }
            r1 = 48
            java.lang.String r2 = r6.A0D(r1)     // Catch:{ all -> 0x3a16 }
            if (r2 == 0) goto L_0x36f0
            int r4 = r2.hashCode()     // Catch:{ all -> 0x3a16 }
            r1 = -1383228885(0xffffffffad8d9a2b, float:-1.6098308E-11)
            if (r4 == r1) goto L_0x36f0
            r1 = 115029(0x1c155, float:1.6119E-40)
            if (r4 != r1) goto L_0x36f0
            java.lang.String r1 = "top"
            boolean r1 = r2.equals(r1)     // Catch:{ all -> 0x3a16 }
            if (r1 == 0) goto L_0x36f0
            java.lang.Integer r24 = X.AnonymousClass00R.A00     // Catch:{ all -> 0x3a16 }
            goto L_0x36f2
        L_0x36f0:
            java.lang.Integer r24 = X.AnonymousClass00R.A01     // Catch:{ all -> 0x3a16 }
        L_0x36f2:
            r1 = -1
            if (r7 == r1) goto L_0x374a
            X.CUA r2 = new X.CUA     // Catch:{ all -> 0x3a16 }
            r23 = r5
            r26 = r7
            r20 = r0
            r21 = r3
            r17 = r2
            r17.<init>(r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30)     // Catch:{ all -> 0x3a16 }
            X.DOZ r1 = r2.A07     // Catch:{ all -> 0x3a16 }
            android.content.Context r6 = r1.A00     // Catch:{ all -> 0x3a16 }
            boolean r5 = r2.A0B     // Catch:{ all -> 0x3a16 }
            java.lang.Integer r4 = r2.A09     // Catch:{ all -> 0x3a16 }
            X.BIJ r3 = new X.BIJ     // Catch:{ all -> 0x3a16 }
            r3.<init>(r6, r4, r5)     // Catch:{ all -> 0x3a16 }
            X.CvV r0 = r2.A08     // Catch:{ all -> 0x3a16 }
            r3.setBloksContentViewFromParseResult(r1, r0)     // Catch:{ all -> 0x3a16 }
            int r0 = r2.A00     // Catch:{ all -> 0x3a16 }
            r3.A00 = r0     // Catch:{ all -> 0x3a16 }
            int r0 = r2.A02     // Catch:{ all -> 0x3a16 }
            r3.A02 = r0     // Catch:{ all -> 0x3a16 }
            int r0 = r2.A01     // Catch:{ all -> 0x3a16 }
            r3.A01 = r0     // Catch:{ all -> 0x3a16 }
            android.view.animation.Interpolator r0 = r2.A04     // Catch:{ all -> 0x3a16 }
            r3.A04 = r0     // Catch:{ all -> 0x3a16 }
            android.view.animation.Interpolator r0 = r2.A03     // Catch:{ all -> 0x3a16 }
            r3.A03 = r0     // Catch:{ all -> 0x3a16 }
            X.D8D r0 = new X.D8D     // Catch:{ all -> 0x3a16 }
            r0.<init>(r2)     // Catch:{ all -> 0x3a16 }
            r3.A06 = r0     // Catch:{ all -> 0x3a16 }
            r1 = 0
            X.D8C r0 = new X.D8C     // Catch:{ all -> 0x3a16 }
            r0.<init>(r3, r2, r1)     // Catch:{ all -> 0x3a16 }
            r3.A05 = r0     // Catch:{ all -> 0x3a16 }
            boolean r0 = r2.A0C     // Catch:{ all -> 0x3a16 }
            r3.A0A = r0     // Catch:{ all -> 0x3a16 }
            r1 = 2131430937(0x7f0b0e19, float:1.848359E38)
            java.lang.String r0 = r2.A0A     // Catch:{ all -> 0x3a16 }
            r3.setTag(r1, r0)     // Catch:{ all -> 0x3a16 }
            X.C26071Crl.A01(r6, r3, r4, r5)     // Catch:{ all -> 0x3a16 }
            goto L_0x3a04
        L_0x374a:
            java.lang.String r0 = "Auto-dismiss duration must be >= 0ms"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0k(r0)     // Catch:{ all -> 0x3a16 }
            throw r0     // Catch:{ all -> 0x3a16 }
        L_0x3751:
            java.lang.String r6 = "bk.action.array.FindIndex"
            boolean r3 = r5.equals(r6)     // Catch:{ all -> 0x3a16 }
            if (r3 == 0) goto L_0x39f6
            java.lang.Object r4 = A0H(r0, r2)     // Catch:{ all -> 0x3a16 }
            java.lang.String r3 = "null cannot be cast to non-null type java.util.List<kotlin.Any>"
            java.util.List r7 = X.BE6.A13(r4, r3)     // Catch:{ all -> 0x3a16 }
            X.E8A r5 = X.C25488Cgj.A00(r0, r1)     // Catch:{ all -> 0x3a16 }
            int r4 = r7.size()     // Catch:{ all -> 0x3a16 }
            r3 = 0
        L_0x376c:
            if (r3 >= r4) goto L_0x3787
            java.lang.Object r0 = r7.get(r3)     // Catch:{ all -> 0x3a16 }
            X.9zJ r0 = X.C108985cd.A0K(r0)     // Catch:{ all -> 0x3a16 }
            java.lang.Object r1 = X.C25974Cph.A00(r2, r0, r5)     // Catch:{ all -> 0x3a16 }
            boolean r0 = r1 instanceof java.lang.Number     // Catch:{ all -> 0x3a16 }
            if (r0 != 0) goto L_0x378d
            boolean r0 = r1 instanceof java.lang.Boolean     // Catch:{ all -> 0x3a16 }
            if (r0 != 0) goto L_0x378d
            java.lang.String r0 = "Got non-boolean result while evaluating FindIndex predicate"
            X.C25913CoX.A01(r6, r0)     // Catch:{ all -> 0x3a16 }
        L_0x3787:
            java.lang.Integer r3 = X.BE7.A0Z()     // Catch:{ all -> 0x3a16 }
            goto L_0x3a10
        L_0x378d:
            boolean r0 = X.C25343Ce2.A01(r1)     // Catch:{ all -> 0x3a16 }
            if (r0 == 0) goto L_0x3799
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x3a16 }
            goto L_0x3a10
        L_0x3799:
            int r3 = r3 + 1
            goto L_0x376c
        L_0x379c:
            java.lang.String r3 = "bk.action.animated.StartToken"
            boolean r3 = r5.equals(r3)     // Catch:{ all -> 0x3a16 }
            if (r3 == 0) goto L_0x39f6
            X.DOZ r6 = A07(r2, r0)     // Catch:{ all -> 0x3a16 }
            r3 = 0
            if (r6 == 0) goto L_0x3a10
            java.lang.String r5 = A0M(r0, r4)     // Catch:{ all -> 0x3a16 }
            X.Cw3 r1 = X.C26258Cw3.A01     // Catch:{ all -> 0x3a16 }
            X.E9O r0 = r2.A02     // Catch:{ all -> 0x3a16 }
            if (r0 == 0) goto L_0x37b8
            r0.BUC()     // Catch:{ all -> 0x3a16 }
        L_0x37b8:
            r1.A06(r6, r5, r4)     // Catch:{ all -> 0x3a16 }
            goto L_0x3a10
        L_0x37bd:
            java.lang.String r3 = "bk.action.slider.SetPosition"
            boolean r3 = r5.equals(r3)     // Catch:{ all -> 0x3a16 }
            if (r3 == 0) goto L_0x39f6
            X.DFL r4 = A0E(r0, r2)     // Catch:{ all -> 0x3a16 }
            float r3 = A00(r0, r1)     // Catch:{ all -> 0x3a16 }
            X.DOZ r0 = r2.A00     // Catch:{ all -> 0x3a16 }
            if (r0 == 0) goto L_0x37ec
            java.lang.Object r1 = X.C26272CwJ.A04(r0, r4)     // Catch:{ all -> 0x3a16 }
            boolean r0 = r1 instanceof X.CUL     // Catch:{ all -> 0x3a16 }
            if (r0 == 0) goto L_0x3a04
            X.CUL r1 = (X.CUL) r1     // Catch:{ all -> 0x3a16 }
            r0 = 0
            X.C26176Ctu.A02(r0)     // Catch:{ all -> 0x3a16 }
            android.widget.SeekBar r1 = r1.A0C     // Catch:{ all -> 0x3a16 }
            if (r1 == 0) goto L_0x3a04
            r0 = 1325400064(0x4f000000, float:2.14748365E9)
            float r3 = r3 * r0
            int r0 = (int) r3     // Catch:{ all -> 0x3a16 }
            r1.setProgress(r0)     // Catch:{ all -> 0x3a16 }
            goto L_0x3a04
        L_0x37ec:
            java.lang.IllegalStateException r0 = X.C17880vN.A0g()     // Catch:{ all -> 0x3a16 }
            throw r0     // Catch:{ all -> 0x3a16 }
        L_0x37f1:
            java.lang.String r0 = "bk.action.accessibility.IsHighContrastEnabled"
            boolean r0 = r5.equals(r0)     // Catch:{ all -> 0x3a16 }
            if (r0 == 0) goto L_0x39f6
            r2 = 0
            X.CqB r0 = X.C25995CqB.A00()     // Catch:{ all -> 0x3a16 }
            android.content.Context r0 = r0.A00     // Catch:{ all -> 0x3a16 }
            android.content.ContentResolver r1 = r0.getContentResolver()     // Catch:{ all -> 0x3a16 }
            java.lang.String r0 = "high_text_contrast_enabled"
            int r0 = android.provider.Settings.Secure.getInt(r1, r0, r4)     // Catch:{ all -> 0x3a16 }
            if (r0 == 0) goto L_0x380d
        L_0x380c:
            r2 = 1
        L_0x380d:
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r2)     // Catch:{ all -> 0x3a16 }
            goto L_0x3a10
        L_0x3813:
            java.lang.String r0 = "bk.action.bloks.ClearCachedAsyncComponents"
            boolean r0 = r5.equals(r0)     // Catch:{ all -> 0x3a16 }
            if (r0 == 0) goto L_0x39f6
            X.C18070vi.A0d(r2, r1)     // Catch:{ all -> 0x3a16 }
            X.DOZ r1 = r2.A00     // Catch:{ all -> 0x3a16 }
            if (r1 == 0) goto L_0x3a04
            r0 = 2131428152(0x7f0b0338, float:1.847794E38)
            java.lang.Object r0 = r1.A01(r0)     // Catch:{ all -> 0x3a16 }
            X.CqT r0 = (X.C26012CqT) r0     // Catch:{ all -> 0x3a16 }
            if (r0 == 0) goto L_0x3a04
            java.util.Set r1 = X.C24278Byb.A00     // Catch:{ all -> 0x3a16 }
            X.C18070vi.A0d(r1, r4)     // Catch:{ all -> 0x3a16 }
            X.CQK r0 = r0.A05     // Catch:{ all -> 0x3a16 }
            X.CWI r7 = r0.A01     // Catch:{ all -> 0x3a16 }
            java.util.Iterator r6 = r1.iterator()     // Catch:{ all -> 0x3a16 }
        L_0x383a:
            boolean r0 = r6.hasNext()     // Catch:{ all -> 0x3a16 }
            if (r0 == 0) goto L_0x3a04
            java.lang.Object r0 = r6.next()     // Catch:{ all -> 0x3a16 }
            X.Byb r0 = (X.C24278Byb) r0     // Catch:{ all -> 0x3a16 }
            int r0 = r0.ordinal()     // Catch:{ all -> 0x3a16 }
            if (r0 != r4) goto L_0x383a
            X.DNY r3 = r7.A02     // Catch:{ all -> 0x3a16 }
            java.lang.Object r5 = r3.A03     // Catch:{ all -> 0x3a16 }
            monitor-enter(r5)     // Catch:{ all -> 0x3a16 }
            X.A2o r2 = r3.A02     // Catch:{ all -> 0x386a }
            java.lang.String r1 = "ASYNC_COMPONENT"
            X.00z r0 = r2.A01     // Catch:{ all -> 0x386a }
            java.lang.Object r0 = r0.A04(r1)     // Catch:{ all -> 0x386a }
            X.9Z5 r0 = (X.AnonymousClass9Z5) r0     // Catch:{ all -> 0x386a }
            if (r0 == 0) goto L_0x3865
            X.00z r1 = r0.A00     // Catch:{ all -> 0x386a }
            r0 = -1
            r1.A07(r0)     // Catch:{ all -> 0x386a }
        L_0x3865:
            X.DNY.A00(r3, r2)     // Catch:{ all -> 0x386a }
            monitor-exit(r5)     // Catch:{ all -> 0x3a16 }
            goto L_0x383a
        L_0x386a:
            r3 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x3a16 }
            goto L_0x38a5
        L_0x386d:
            r5 = move-exception
            java.lang.Object r4 = r0.A00(r4)     // Catch:{ all -> 0x3a16 }
            java.lang.String r1 = "null cannot be cast to non-null type kotlin.String"
            X.C18070vi.A0z(r4, r1)     // Catch:{ all -> 0x3a16 }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ all -> 0x3a16 }
            r1 = 3
            java.lang.String r3 = A0L(r0, r1)     // Catch:{ all -> 0x3a16 }
            r1 = 4
            java.lang.String r2 = A0L(r0, r1)     // Catch:{ all -> 0x3a16 }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x3a16 }
            java.lang.String r0 = "Error when evaluating "
            r1.append(r0)     // Catch:{ all -> 0x3a16 }
            r1.append(r2)     // Catch:{ all -> 0x3a16 }
            java.lang.String r0 = " fbt {"
            r1.append(r0)     // Catch:{ all -> 0x3a16 }
            r1.append(r3)     // Catch:{ all -> 0x3a16 }
            java.lang.String r0 = "} ("
            r1.append(r0)     // Catch:{ all -> 0x3a16 }
            java.lang.String r0 = X.C17900vP.A0B(r4, r1)     // Catch:{ all -> 0x3a16 }
            X.C1G r3 = new X.C1G     // Catch:{ all -> 0x3a16 }
            r3.<init>(r0, r5)     // Catch:{ all -> 0x3a16 }
        L_0x38a5:
            throw r3     // Catch:{ all -> 0x3a16 }
        L_0x38a6:
            java.lang.String r3 = "bk.action.array.SortedArray"
            boolean r3 = r5.equals(r3)     // Catch:{ all -> 0x3a16 }
            if (r3 == 0) goto L_0x39f6
            java.lang.Object r4 = A0H(r0, r2)     // Catch:{ all -> 0x3a16 }
            java.lang.String r3 = "null cannot be cast to non-null type java.util.List<kotlin.Any>"
            java.util.List r3 = X.BE6.A13(r4, r3)     // Catch:{ all -> 0x3a16 }
            X.E8A r4 = X.C25488Cgj.A00(r0, r1)     // Catch:{ all -> 0x3a16 }
            java.util.ArrayList r3 = X.C17880vN.A10(r3)     // Catch:{ all -> 0x3a16 }
            r1 = 0
            X.DUK r0 = new X.DUK     // Catch:{ all -> 0x3a16 }
            r0.<init>(r2, r4, r1)     // Catch:{ all -> 0x3a16 }
            java.util.Collections.sort(r3, r0)     // Catch:{ all -> 0x3a16 }
            goto L_0x3a10
        L_0x38cb:
            java.lang.String r3 = "bk.action.bloks.ReplaceEmbeddedChildren"
            boolean r3 = r5.equals(r3)     // Catch:{ all -> 0x3a16 }
            if (r3 == 0) goto L_0x39f6
            java.lang.String r4 = A0N(r0, r2)     // Catch:{ all -> 0x3a16 }
            java.lang.Object r3 = X.BE6.A0n(r0, r1)     // Catch:{ all -> 0x3a16 }
            java.lang.String r1 = "null cannot be cast to non-null type kotlin.collections.List<com.instagram.common.bloks.BloksParseResult>"
            java.util.List r1 = X.BE6.A13(r3, r1)     // Catch:{ all -> 0x3a16 }
            X.DNk r6 = A0A(r2, r0)     // Catch:{ all -> 0x3a16 }
            java.util.ArrayList r1 = A0P(r6, r1)     // Catch:{ all -> 0x3a16 }
            X.DNn r3 = new X.DNn     // Catch:{ all -> 0x3a16 }
            r3.<init>(r4)     // Catch:{ all -> 0x3a16 }
            r0 = 0
            X.Boe r2 = new X.Boe     // Catch:{ all -> 0x3a16 }
            r2.<init>(r1, r0)     // Catch:{ all -> 0x3a16 }
        L_0x38f4:
            r6.A0A(r3, r2)     // Catch:{ all -> 0x3a16 }
            goto L_0x3a04
        L_0x38f9:
            java.lang.String r0 = "bk.action.accessibility.IsReduceMotionEnabled"
            boolean r0 = r5.equals(r0)     // Catch:{ all -> 0x3a16 }
            if (r0 == 0) goto L_0x39f6
            X.C18070vi.A0d(r2, r1)     // Catch:{ all -> 0x3a16 }
            int r6 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x3a16 }
            r5 = 0
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r4)     // Catch:{ all -> 0x3a16 }
            r0 = 26
            if (r6 < r0) goto L_0x391b
            boolean r0 = X.C7r.A00()     // Catch:{ all -> 0x3a16 }
            if (r0 != 0) goto L_0x391b
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r1)     // Catch:{ all -> 0x3a16 }
            goto L_0x3a10
        L_0x391b:
            X.DOZ r0 = r2.A00     // Catch:{ all -> 0x3a16 }
            if (r0 == 0) goto L_0x3a10
            android.content.Context r0 = r0.A00     // Catch:{ all -> 0x3a16 }
            android.content.ContentResolver r2 = r0.getContentResolver()     // Catch:{ all -> 0x3a16 }
            if (r2 == 0) goto L_0x3a10
            java.lang.String r1 = "animator_duration_scale"
            r0 = 1065353216(0x3f800000, float:1.0)
            float r1 = android.provider.Settings.Global.getFloat(r2, r1, r0)     // Catch:{ all -> 0x3a16 }
            r0 = 0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 != 0) goto L_0x3935
            r5 = 1
        L_0x3935:
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r5)     // Catch:{ all -> 0x3a16 }
            goto L_0x3a10
        L_0x393b:
            java.lang.String r2 = "bk.action.visibility_context.PercentVisible"
            boolean r2 = r5.equals(r2)     // Catch:{ all -> 0x3a16 }
            if (r2 == 0) goto L_0x39f6
            java.lang.Object r1 = A0G(r0)     // Catch:{ all -> 0x3a16 }
            java.lang.String r0 = "null cannot be cast to non-null type com.bloks.foa.visibility.ViewpointSnapshotWithData"
            X.C18070vi.A0z(r1, r0)     // Catch:{ all -> 0x3a16 }
            X.6fg r1 = (X.C128246fg) r1     // Catch:{ all -> 0x3a16 }
            float r0 = r1.A00     // Catch:{ all -> 0x3a16 }
            java.lang.Float r3 = java.lang.Float.valueOf(r0)     // Catch:{ all -> 0x3a16 }
            goto L_0x3a10
        L_0x3956:
            java.lang.String r3 = "bk.action.video.GetPositionV2"
            boolean r3 = r5.equals(r3)     // Catch:{ all -> 0x3a16 }
            if (r3 == 0) goto L_0x39f6
            X.DOZ r2 = A07(r2, r0)     // Catch:{ all -> 0x3a16 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r4)     // Catch:{ all -> 0x3a16 }
            if (r2 == 0) goto L_0x3a10
            X.DFL r0 = A0D(r0, r4)     // Catch:{ all -> 0x3a16 }
            java.lang.String r1 = X.BE7.A0d(r0)     // Catch:{ all -> 0x3a16 }
            if (r1 != 0) goto L_0x3977
            java.lang.IllegalStateException r0 = X.C17880vN.A0g()     // Catch:{ all -> 0x3a16 }
            throw r0     // Catch:{ all -> 0x3a16 }
        L_0x3977:
            r0 = 2131428187(0x7f0b035b, float:1.8478011E38)
            java.lang.Object r0 = r2.A01(r0)     // Catch:{ all -> 0x3a16 }
            java.util.AbstractMap r0 = (java.util.AbstractMap) r0     // Catch:{ all -> 0x3a16 }
            r0.get(r1)     // Catch:{ all -> 0x3a16 }
            goto L_0x3a10
        L_0x3985:
            java.lang.String r3 = "bk.action.animated.AddOnCompleteListener"
            boolean r3 = r5.equals(r3)     // Catch:{ all -> 0x3a16 }
            if (r3 == 0) goto L_0x39f6
            X.DOZ r5 = A07(r2, r0)     // Catch:{ all -> 0x3a16 }
            if (r5 == 0) goto L_0x3a04
            android.animation.Animator r3 = A03(r0, r4)     // Catch:{ all -> 0x3a16 }
            X.E8A r1 = X.C25488Cgj.A00(r0, r1)     // Catch:{ all -> 0x3a16 }
            X.C18070vi.A0d(r3, r4)     // Catch:{ all -> 0x3a16 }
            X.BEP r0 = new X.BEP     // Catch:{ all -> 0x3a16 }
            r0.<init>(r5, r2, r1)     // Catch:{ all -> 0x3a16 }
        L_0x39a3:
            r3.addListener(r0)     // Catch:{ all -> 0x3a16 }
            goto L_0x3a10
        L_0x39a7:
            java.lang.String r2 = "bk.action.animation.linear.GetCurrentValue"
            boolean r2 = r5.equals(r2)     // Catch:{ all -> 0x3a16 }
            if (r2 == 0) goto L_0x39f6
            X.C18070vi.A0d(r0, r4)     // Catch:{ all -> 0x3a16 }
            java.lang.Object r0 = X.BE6.A0n(r0, r4)     // Catch:{ all -> 0x3a16 }
            android.animation.ValueAnimator r0 = (android.animation.ValueAnimator) r0     // Catch:{ all -> 0x3a16 }
            if (r0 == 0) goto L_0x3a04
            java.lang.Object r3 = r0.getAnimatedValue()     // Catch:{ all -> 0x3a16 }
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.Float"
            X.C18070vi.A0z(r3, r0)     // Catch:{ all -> 0x3a16 }
            java.lang.Float r3 = (java.lang.Float) r3     // Catch:{ all -> 0x3a16 }
            goto L_0x3a10
        L_0x39c6:
            java.lang.String r2 = "bk.action.animated.GetCurrentValue"
            boolean r2 = r5.equals(r2)     // Catch:{ all -> 0x3a16 }
            if (r2 == 0) goto L_0x39f6
            java.lang.Object r1 = A0G(r0)     // Catch:{ all -> 0x3a16 }
            java.lang.String r0 = "null cannot be cast to non-null type android.animation.ValueAnimator"
            X.C18070vi.A0z(r1, r0)     // Catch:{ all -> 0x3a16 }
            android.animation.ValueAnimator r1 = (android.animation.ValueAnimator) r1     // Catch:{ all -> 0x3a16 }
            java.lang.Object r1 = r1.getAnimatedValue()     // Catch:{ all -> 0x3a16 }
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.Float"
            X.C18070vi.A0z(r1, r0)     // Catch:{ all -> 0x3a16 }
            java.lang.Float r1 = (java.lang.Float) r1     // Catch:{ all -> 0x3a16 }
            float r0 = r1.floatValue()     // Catch:{ all -> 0x3a16 }
            double r0 = (double) r0     // Catch:{ all -> 0x3a16 }
            java.lang.Number r3 = X.C25343Ce2.A00(r0)     // Catch:{ all -> 0x3a16 }
            goto L_0x3a10
        L_0x39ee:
            java.lang.String r0 = "bk.action.trace.EndSection"
            boolean r0 = r5.equals(r0)     // Catch:{ all -> 0x3a16 }
            if (r0 != 0) goto L_0x3a01
        L_0x39f6:
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch:{ all -> 0x3a16 }
            r1[r4] = r36     // Catch:{ all -> 0x3a16 }
            java.lang.String r0 = "No implementation bound to key: %s"
            java.lang.IllegalArgumentException r0 = X.BE8.A0X(r0, r1)     // Catch:{ all -> 0x3a16 }
            throw r0     // Catch:{ all -> 0x3a16 }
        L_0x3a01:
            X.AnonymousClass0O7.A00()     // Catch:{ all -> 0x3a16 }
        L_0x3a04:
            r3 = 0
            goto L_0x3a10
        L_0x3a06:
            r1 = r33
            X.ALQ r1 = r1.A00     // Catch:{ all -> 0x3a16 }
            java.lang.Object r3 = r1.BKe(r0, r2, r5)     // Catch:{ all -> 0x3a16 }
            goto L_0x3a10
        L_0x3a0f:
            r3 = r4
        L_0x3a10:
            if (r16 != 0) goto L_0x3a15
            X.AnonymousClass0O7.A00()
        L_0x3a15:
            return r3
        L_0x3a16:
            r0 = move-exception
            if (r16 != 0) goto L_0x3a1c
            X.AnonymousClass0O7.A00()
        L_0x3a1c:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26970DNs.BKe(X.9zJ, X.CkC, java.lang.String):java.lang.Object");
    }
}
