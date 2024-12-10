package X;

import android.app.Activity;
import com.whatsapp.util.Log;
import com.whatsapp.wabloks.base.BkFcsPreloadingScreenFragment;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Stack;

/* renamed from: X.8jw  reason: invalid class name and case insensitive filesystem */
public class C168938jw extends C65802x8 {
    public final C198159xs A00;

    public C168938jw(C198159xs r4) {
        super("wa.action.phoenix.FcsReturnResult", "wa.action.phoenix.FcsReturnResultV2", "wa.action.phoenix.FdsIq", "wa.action.phoenix.FdsIqV2", "wa.action.phoenix.statemachine.GoBack", "wa.action.phoenix.statemachine.GoBackV2", "wa.action.phoenix.FcsReturnResumableData");
        this.A00 = r4;
    }

    public static String A00(C23736Boh boh) {
        Object obj = boh.A00.A02.A00().get(2131428241);
        C28111Yx.A02(obj);
        return ((C185219cE) obj).A00;
    }

    public /* bridge */ /* synthetic */ Object BKe(C199029zJ r13, C25681CkC ckC, String str) {
        Integer num;
        C192819p2 r0;
        C20129A8p a8p;
        C20129A8p a8p2;
        C20522AOh aOh;
        C20522AOh aOh2;
        C20522AOh aOh3;
        C22579BDz bDz;
        AnonymousClass1FL r5;
        BkFcsPreloadingScreenFragment A002;
        C23736Boh boh = (C23736Boh) ckC;
        short s = -1;
        switch (str.hashCode()) {
            case -1883695124:
                s = AnonymousClass8BV.A0z("wa.action.phoenix.FcsReturnResultV2", str);
                break;
            case -579883706:
                s = AnonymousClass8BV.A10("wa.action.phoenix.FdsIqV2", str);
                break;
            case -574422768:
                if (str.equals("wa.action.phoenix.statemachine.GoBackV2")) {
                    s = 2;
                    break;
                }
                break;
            case -266954039:
                if (str.equals("wa.action.phoenix.FcsReturnResumableData")) {
                    s = 3;
                    break;
                }
                break;
            case 775692624:
                if (str.equals("wa.action.phoenix.FcsReturnResult")) {
                    s = 4;
                    break;
                }
                break;
        }
        switch (s) {
            case 0:
            case 4:
                List list = r13.A00;
                Map A16 = AnonymousClass8BR.A16(list, 0);
                E8A A08 = AnonymousClass8BT.A08(list, 1);
                E8A A082 = AnonymousClass8BT.A08(list, 2);
                E8A A083 = AnonymousClass8BT.A08(list, 3);
                HashMap A11 = C17880vN.A11();
                if (A08 != null) {
                    aOh = new C20522AOh(A08, 26);
                } else {
                    aOh = null;
                }
                A11.put("onStartLoading", aOh);
                if (A082 != null) {
                    aOh2 = new C20522AOh(A082, 26);
                } else {
                    aOh2 = null;
                }
                A11.put("onLoadingCompletion", aOh2);
                if (A083 != null) {
                    aOh3 = new C20522AOh(A083, 26);
                } else {
                    aOh3 = null;
                }
                A11.put("onLoadingFailure", aOh3);
                C198159xs r7 = this.A00;
                Activity A05 = ALS.A05(boh);
                C20517AOc aOc = new C20517AOc(boh, 2);
                String A003 = A00(boh);
                C18070vi.A0d(A05, 0);
                C20130A8q A004 = ((C189549jQ) r7.A00.get()).A00(A003);
                if (A004 != null) {
                    if (!(!(A05 instanceof AnonymousClass01E) || (r5 = (AnonymousClass1FL) A05) == null || (A002 = C198159xs.A00(AnonymousClass3MX.A0O(r5), r7)) == null)) {
                        A002.A04 = A11;
                        A002.A00 = aOc;
                    }
                    if (A16 != null) {
                        C20129A8p a8p3 = A004.A00;
                        C184829ba r1 = null;
                        if (a8p3 != null) {
                            r1 = a8p3.A04;
                        }
                        if (r1 instanceof AnonymousClass90N) {
                            String str2 = ((AnonymousClass90N) r1).A03;
                            if (!(a8p3 == null || (bDz = (C22579BDz) a8p3.A0A(str2)) == null || !(bDz instanceof C22578BDy))) {
                                bDz.BLG(A16);
                                return null;
                            }
                        }
                        Log.e("WaBkPhoenixInterpreterExtImpl: current resource is not a Bloks resource");
                        return null;
                    }
                }
                break;
            case 1:
                List list2 = r13.A00;
                String A0w = C17880vN.A0w(list2, 0);
                String A0w2 = C17880vN.A0w(list2, 1);
                String A0w3 = C17880vN.A0w(list2, 2);
                Map A162 = AnonymousClass8BR.A16(list2, 3);
                C198159xs r12 = this.A00;
                String A005 = A00(boh);
                C190479l0 r52 = new C190479l0(boh, r13, this);
                boolean A15 = C18070vi.A15(A0w, A0w2);
                A2X a2x = null;
                try {
                    if (A0w2.equals("GET")) {
                        num = AnonymousClass00R.A00;
                    } else if (A0w2.equals("SET")) {
                        num = AnonymousClass00R.A01;
                    } else {
                        throw AnonymousClass000.A0k(A0w2);
                    }
                    C20130A8q A006 = ((C189549jQ) r12.A00.get()).A00(A005);
                    if (A006 != null) {
                        C20129A8p a8p4 = A006.A00;
                        if (a8p4 != null) {
                            a2x = ((A2V) r12.A02.get()).A02(a8p4.A0N);
                            a2x.A02(new C21102AeW(A15));
                        }
                        A006.A0A(new AZM(r52, A006, a2x, A0w), new C194579rx(A0w, A0w3, A162), num, A0w);
                        return null;
                    }
                    r52.A00(C20062A5l.A01((Integer) null, (String) null, (String) null, (Map) null));
                    return null;
                } catch (IllegalArgumentException unused) {
                    r52.A00(C20062A5l.A01((Integer) null, (String) null, (String) null, (Map) null));
                    return null;
                }
            case 2:
                String A0t = AnonymousClass8BT.A0t(r13, 0);
                C198159xs r02 = this.A00;
                C20130A8q A007 = ((C189549jQ) r02.A00.get()).A00(A00(boh));
                if (!(A007 == null || (a8p2 = A007.A00) == null)) {
                    a8p2.A0J.A02(new C21106Aea(A0t, (String) null, false));
                    return null;
                }
            case 3:
                List list3 = r13.A00;
                Map A163 = AnonymousClass8BR.A16(list3, 0);
                String A0w4 = C17880vN.A0w(list3, 1);
                C198159xs r2 = this.A00;
                String A008 = A00(boh);
                C18070vi.A0d(A0w4, 1);
                if (A163 == null) {
                    A163 = null;
                }
                C20130A8q A009 = ((C189549jQ) r2.A00.get()).A00(A008);
                if (A009 == null || (a8p = A009.A00) == null) {
                    Map map = ((C192089nm) r2.A01.get()).A00;
                    Iterator A0x = AnonymousClass8BU.A0x(map);
                    if (A0x.hasNext()) {
                        Object next = A0x.next();
                        while (A0x.hasNext()) {
                            String A0v = C17880vN.A0v(A0x);
                            next = (String) next;
                            C192819p2 r14 = (C192819p2) map.get(next);
                            C192819p2 r03 = (C192819p2) map.get(A0v);
                            if (!(r14 == null || r03 == null || r14.A00 > r03.A00)) {
                                next = A0v;
                            }
                        }
                        r0 = (C192819p2) map.get(next);
                    } else {
                        throw new UnsupportedOperationException("Empty collection can't be reduced.");
                    }
                } else {
                    r0 = a8p.A05;
                }
                if (!(r0 == null || A163 == null)) {
                    Stack stack = r0.A06;
                    if (A0w4.equals(((C195039sh) stack.peek()).A01)) {
                        ((C195039sh) stack.peek()).A03.putAll(A163);
                        return null;
                    }
                }
                break;
        }
        return null;
    }
}
