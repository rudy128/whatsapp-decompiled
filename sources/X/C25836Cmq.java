package X;

import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.regex.Pattern;

/* renamed from: X.Cmq  reason: case insensitive filesystem */
public abstract class C25836Cmq {
    /* JADX WARNING: type inference failed for: r1v4, types: [X.Du6, X.CtO] */
    public static C25836Cmq A02(Object obj) {
        char charAt;
        if (obj == null) {
            return EB4.A02;
        }
        if (obj instanceof C25836Cmq) {
            return (C25836Cmq) obj;
        }
        if (obj instanceof Class) {
            return new C23752Box((Class) obj);
        }
        if (obj instanceof String) {
            String trim = obj.toString().trim();
            if (trim.length() > 0 && ((charAt = trim.charAt(0)) == '@' || charAt == '$')) {
                try {
                    C26182Cu5.A01(trim, new E6J[0]);
                    return new C23753Boy(C26182Cu5.A01(obj.toString().toString(), new E6J[0]), false, false);
                } catch (Exception unused) {
                }
            }
            String trim2 = obj.toString().trim();
            int length = trim2.length();
            if (length > 1) {
                char charAt2 = trim2.charAt(0);
                char charAt3 = trim2.charAt(length - 1);
                if (charAt2 != '[' ? charAt2 == '{' && charAt3 == '}' : charAt3 == ']') {
                    try {
                        new C26156CtO(-1).A0D(trim2, C25453Cg5.A02.A00);
                        return new C23758Bp3((CharSequence) obj.toString());
                    } catch (Exception unused2) {
                    }
                }
            }
            return new C23755Bp0(obj.toString(), true);
        } else if (obj instanceof Character) {
            return new C23755Bp0(obj.toString(), false);
        } else {
            if (obj instanceof Number) {
                return new C23757Bp2((CharSequence) obj.toString());
            }
            if (obj instanceof Boolean) {
                if (Boolean.parseBoolean(obj.toString().toString())) {
                    return EB4.A01;
                }
                return EB4.A00;
            } else if (obj instanceof Pattern) {
                return new C23756Bp1((Pattern) obj);
            } else {
                if (obj instanceof OffsetDateTime) {
                    return new C23754Boz(obj.toString());
                }
                throw new C27232DaC("Could not determine value type");
            }
        }
    }

    public C23758Bp3 A03() {
        if (this instanceof C23758Bp3) {
            return (C23758Bp3) this;
        }
        throw C23741Bom.A00("Expected json node");
    }

    public C23757Bp2 A04() {
        if (this instanceof C23755Bp0) {
            try {
                return new C23757Bp2(new BigDecimal(((C23755Bp0) this).A01));
            } catch (NumberFormatException unused) {
                return C23757Bp2.A01;
            }
        } else if (this instanceof C23757Bp2) {
            return (C23757Bp2) this;
        } else {
            throw C23741Bom.A00("Expected number node");
        }
    }

    public C23754Boz A05() {
        if (this instanceof C23754Boz) {
            return (C23754Boz) this;
        }
        throw C23741Bom.A00("Expected offsetDateTime node");
    }

    public C23755Bp0 A06() {
        if (this instanceof C23755Bp0) {
            return (C23755Bp0) this;
        }
        if (this instanceof C23757Bp2) {
            return new C23755Bp0(((C23757Bp2) this).A00.toString(), false);
        }
        throw C23741Bom.A00("Expected string node");
    }

    public C23759Bp4 A07() {
        if (this instanceof C23759Bp4) {
            return (C23759Bp4) this;
        }
        throw C23741Bom.A00("Expected value list node");
    }

    public static int A01(C25836Cmq cmq, C25836Cmq cmq2) {
        return cmq.A04().A00.compareTo(cmq2.A04().A00);
    }
}
