package X;

import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.9ol  reason: invalid class name and case insensitive filesystem */
public class C192659ol {
    public final C172778u0 A00;
    public final C172788u1 A01;
    public final AnonymousClass9MP A02;
    public final AnonymousClass00H A03;
    public final AnonymousClass00H A04;

    public Object A01(C29621ca r7, Class cls, String str) {
        Object obj;
        Object obj2;
        int A0G = C72453Mb.A0G(cls, str, 1);
        try {
            C29621ca A0K = r7.A0K("result");
            if (A0K == null && (A0K = r7.A0K("update")) == null) {
                throw new C172908uD();
            }
            String A0M = A0K.A0M();
            boolean z = false;
            if (A0M != null && (A0M.length() < A0G || AnonymousClass1YE.A0A(A0M, "{", false))) {
                z = true;
            }
            if (z) {
                obj = this.A01.A00(new C20676AUi(r7));
            } else {
                CQZ cqz = (CQZ) this.A03.get();
                C25175CaR caR = (C25175CaR) ((C25767Cle) cqz.A02.getValue()).A00.get(str);
                if (caR != null) {
                    obj2 = caR.A00;
                    Throwable A002 = C30671eK.A00(obj2);
                    if (A002 != null) {
                        try {
                            cqz.A00.A0G("ArgoWireTypeStoreProvider", C18070vi.A0H(new StringBuilder("Unable to get ArgoWireType")), false);
                            C30691eM.A01(C27621Wu.A00);
                            throw A002;
                        } catch (Throwable th) {
                            obj2 = C108945cZ.A1J(th);
                        }
                    }
                    if (obj2 instanceof AnonymousClass1IU) {
                        Throwable A003 = C30671eK.A00(obj2);
                        if (A003 == null) {
                            A003 = new C172928uF(AnonymousClass001.A1H("Unexpected null exception while getting wire type for ", str, AnonymousClass000.A10()), (Throwable) null);
                        }
                        obj = C30691eM.A00(new C172898uC(str, A003));
                    } else {
                        C172778u0 r1 = this.A00;
                        C30691eM.A01(obj2);
                        obj = r1.A00(new C20677AUj((C28473E2o) obj2, r7));
                    }
                } else {
                    StringBuilder A10 = AnonymousClass000.A10();
                    A10.append("ArgoWireType not found for ");
                    throw AnonymousClass001.A12(str, A10);
                }
            }
            if (!(obj instanceof AnonymousClass1IU)) {
                C30691eM.A01(obj);
                return A00((C199129zU) obj, cls);
            }
            Throwable A004 = C30671eK.A00(obj);
            if (A004 != null) {
                return C108945cZ.A1J(A004);
            }
            return C30691eM.A00(new C172928uF(AnonymousClass001.A1H("Unknown error during parseInput for: ", str, AnonymousClass000.A10()), new UnknownError()));
        } catch (Throwable th2) {
            return C108945cZ.A1J(th2);
        }
    }

    public C192659ol(C172778u0 r1, C172788u1 r2, AnonymousClass9MP r3, AnonymousClass00H r4, AnonymousClass00H r5) {
        C108985cd.A1D(r4, r5);
        this.A00 = r1;
        this.A01 = r2;
        this.A03 = r4;
        this.A04 = r5;
        this.A02 = r3;
    }

    public final Object A00(C199129zU r7, Class cls) {
        Object obj;
        Object obj2;
        Object obj3;
        C18070vi.A0j(r7, cls);
        this.A04.get();
        boolean z = r7 instanceof C172768tz;
        if (z) {
            obj = ((C172768tz) r7).A00;
        } else {
            obj = r7.A00;
        }
        C18070vi.A0d(obj, 0);
        try {
            obj2 = cls.getConstructor(new Class[]{JSONObject.class}).newInstance(new Object[]{obj});
        } catch (Throwable th) {
            obj2 = C108945cZ.A1J(th);
        }
        if (!(!(obj2 instanceof AnonymousClass1IU))) {
            return C30691eM.A00(new C172808u3(cls, C30671eK.A00(obj2)));
        }
        C30691eM.A01(obj2);
        C20125A8k a8k = (C20125A8k) obj2;
        if (z) {
            obj3 = ((C172768tz) r7).A01;
        } else {
            obj3 = r7.A01;
        }
        return new C172768tz(a8k, (JSONArray) obj3);
    }
}
