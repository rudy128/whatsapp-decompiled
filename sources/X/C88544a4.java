package X;

import com.whatsapp.areffects.arclass.ArClassManager;
import com.whatsapp.areffects.util.ArEffectsGatingUtil;

/* renamed from: X.4a4  reason: invalid class name and case insensitive filesystem */
public abstract class C88544a4 {
    public boolean A00;
    public final ArClassManager A01;
    public final C107855aj A02;
    public final C92384hD A03;
    public final ArEffectsGatingUtil A04;
    public final AnonymousClass11P A05;
    public final C18030ve A06;
    public final C18100vl A07 = C99144sL.A00(AnonymousClass00R.A0C, this, 10);
    public final AnonymousClass18K A08;

    public abstract AnonymousClass184 A03();

    public abstract Integer A04();

    public abstract Integer A05();

    public abstract Integer A06();

    public abstract Integer A07();

    public abstract Long A08();

    public abstract Long A09();

    public abstract Long A0A();

    public abstract Long A0B();

    public abstract Long A0C();

    public abstract Long A0D();

    public abstract Long A0E();

    public abstract String A0F();

    public abstract String A0G();

    public abstract String A0H();

    public abstract void A0I();

    public abstract void A0J();

    public abstract void A0K();

    public abstract void A0L();

    public abstract void A0M();

    public abstract void A0N(int i);

    public abstract void A0O(int i);

    public abstract void A0P(int i);

    public abstract void A0Q(int i);

    public abstract void A0R(int i);

    public abstract void A0S(int i);

    public synchronized void A0T(int i) {
        A00(this, (Integer) null, (String) null, i);
    }

    public abstract void A0U(long j);

    public abstract void A0V(long j);

    public abstract void A0W(long j);

    public abstract void A0X(long j);

    public abstract void A0Y(long j);

    public abstract void A0Z(long j);

    public abstract void A0a(long j);

    public abstract void A0b(long j);

    public abstract void A0c(String str);

    public abstract void A0d(String str);

    public abstract void A0e(String str);

    public abstract void A0f(String str);

    public abstract void A0g(String str);

    public abstract void A0h(String str);

    public boolean A0i(Integer num) {
        C18070vi.A0d(num, 0);
        try {
            String A0F = A0F();
            Integer num2 = AnonymousClass00R.A00;
            A01(num2, num, A0F, "effectId");
            A01(num2, num, A0H(), "productSessionId");
            A01(num2, num, A06(), "productSurface");
            A01(num2, num, A0C(), "arClass");
            A01(num2, num, A04(), "effectCategory");
            A01(num2, num, A0A(), "effectStartT");
            A01(num2, num, A07(), "effectStartReason");
            A01(AnonymousClass00R.A01, num, A0G(), "effectSessionId");
            return true;
        } catch (IllegalStateException e) {
            e.getMessage();
            return false;
        }
    }

    public boolean A0j(boolean z) {
        try {
            A02(A0F(), "effectId", true);
            A02(A0H(), "productSessionId", true);
            A02(A06(), "productSurface", true);
            A02(A0C(), "arClass", true);
            A02(A04(), "effectCategory", true);
            A02(A0A(), "effectStartT", true);
            A02(A07(), "effectStartReason", true);
            boolean A1W = AnonymousClass000.A1W(A05());
            A02(A0E(), "effectTotalLoadingT", A1W);
            if (!A1W || !z) {
                return true;
            }
            throw AnonymousClass000.A0n("Loading failed reason not expected for a session that has finished loading");
        } catch (IllegalStateException e) {
            e.getMessage();
            return false;
        }
    }

    public static final void A00(C88544a4 r5, Integer num, String str, int i) {
        if (!C72453Mb.A1a(r5.A07) && r5.A0j(AnonymousClass000.A1W(num))) {
            AnonymousClass11P r2 = r5.A05;
            r5.A0b(AnonymousClass11P.A01(r2));
            r5.A0R(i);
            if (r5.A05() == null) {
                if (num == null) {
                    r5.A0O(2);
                } else {
                    r5.A0O(3);
                    r5.A0S(num.intValue());
                    if (str != null) {
                        r5.A0h(str);
                    } else {
                        throw AnonymousClass000.A0n("Required value was null.");
                    }
                }
                long A012 = AnonymousClass11P.A01(r2);
                Long A0A = r5.A0A();
                if (A0A != null) {
                    r5.A0Z(A012 - A0A.longValue());
                } else {
                    throw AnonymousClass000.A0n("Required value was null.");
                }
            } else {
                Long A0D = r5.A0D();
                if (A0D != null) {
                    long longValue = A0D.longValue();
                    Long A0A2 = r5.A0A();
                    if (A0A2 != null) {
                        long longValue2 = longValue - A0A2.longValue();
                        Long A0E = r5.A0E();
                        if (A0E != null) {
                            r5.A0a(longValue2 - A0E.longValue());
                        } else {
                            throw AnonymousClass000.A0n("Required value was null.");
                        }
                    } else {
                        throw AnonymousClass000.A0n("Required value was null.");
                    }
                } else {
                    throw AnonymousClass000.A0n("Required value was null.");
                }
            }
            r5.A08.CC7(r5.A03());
        }
    }

    public C88544a4(ArClassManager arClassManager, C107855aj r4, C92384hD r5, ArEffectsGatingUtil arEffectsGatingUtil, AnonymousClass11P r7, C18030ve r8, AnonymousClass18K r9) {
        this.A05 = r7;
        this.A06 = r8;
        this.A08 = r9;
        this.A01 = arClassManager;
        this.A04 = arEffectsGatingUtil;
        this.A02 = r4;
        this.A03 = r5;
    }

    public static final void A01(Integer num, Integer num2, Object obj, String str) {
        char c;
        char c2;
        String str2;
        String str3;
        int intValue = num2.intValue();
        switch (intValue) {
            case 0:
                c = 0;
                break;
            case 1:
                c = 1;
                break;
            default:
                c = 2;
                break;
        }
        switch (num.intValue()) {
            case 0:
                c2 = 0;
                break;
            case 1:
                c2 = 1;
                break;
            default:
                c2 = 2;
                break;
        }
        boolean z = true;
        boolean z2 = false;
        if (c >= c2) {
            z2 = true;
        }
        if (obj == null) {
            z = false;
        }
        if (z2 != z) {
            StringBuilder A11 = AnonymousClass000.A11(str);
            A11.append(" is unexpectedly ");
            if (obj == null) {
                str2 = "null";
            } else {
                str2 = "non-null";
            }
            A11.append(str2);
            A11.append(" for scenario: ");
            switch (intValue) {
                case 0:
                    str3 = "ASSETS_LOADED";
                    break;
                case 1:
                    str3 = "SET";
                    break;
                default:
                    str3 = "ENABLED";
                    break;
            }
            throw AnonymousClass000.A0o(str3, A11);
        }
    }

    public static final void A02(Object obj, String str, boolean z) {
        String str2;
        if (z != AnonymousClass000.A1W(obj)) {
            StringBuilder A11 = AnonymousClass000.A11(str);
            A11.append(" is unexpectedly ");
            if (obj == null) {
                str2 = "null";
            } else {
                str2 = "non-null";
            }
            throw AnonymousClass000.A0o(str2, A11);
        }
    }
}
