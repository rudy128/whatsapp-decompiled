package X;

import java.lang.reflect.Array;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.text.DateFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.Clg  reason: case insensitive filesystem */
public abstract class C25769Clg {
    public final CWO A00;

    public static C23739Bok A00(Class cls, Object obj) {
        StringBuilder sb = new StringBuilder();
        sb.append("can not map a ");
        sb.append(obj);
        sb.append(" to ");
        sb.append(cls.getName());
        return new C23739Bok(sb.toString());
    }

    public Object A01() {
        if (!(this instanceof C28249DuA)) {
            if (this instanceof C28250DuB) {
                try {
                    return BEA.A0d(((C28250DuB) this).A00);
                } catch (Exception unused) {
                    return null;
                }
            } else if (!(this instanceof C28248Du9)) {
                if (this instanceof C28260DuL) {
                    return AnonymousClass000.A13();
                }
                StringBuilder A10 = AnonymousClass000.A10();
                A10.append("Invalid or non Implemented status");
                BE9.A1G(this, " createArray() in ", A10);
                throw BE8.A0f(A10);
            }
        }
        return new ArrayList();
    }

    public Object A02() {
        if (this instanceof C28249DuA) {
            return C17880vN.A13();
        }
        if (this instanceof C28250DuB) {
            try {
                return BEA.A0d(((C28250DuB) this).A00);
            } catch (Exception unused) {
                return null;
            }
        } else if (this instanceof C28248Du9) {
            return new HashMap();
        } else {
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("Invalid or non Implemented status");
            BE9.A1G(this, " createObject() in ", A10);
            throw BE8.A0f(A10);
        }
    }

    public Object A03(Object obj) {
        if (this instanceof C28246Du7) {
            List<Object> list = (List) obj;
            Object[] objArr = (Object[]) Array.newInstance(((C28246Du7) this).A01, list.size());
            int i = 0;
            for (Object obj2 : list) {
                objArr[i] = obj2;
                i++;
            }
            return objArr;
        } else if (this instanceof C28259DuK) {
            return C17900vP.A08(obj);
        } else {
            if (this instanceof C28258DuJ) {
                if (obj == null) {
                    return null;
                }
                Class<Long> cls = Long.class;
                Class<?> cls2 = obj.getClass();
                if (cls.isAssignableFrom(cls2)) {
                    return obj;
                }
                if (Integer.class.isAssignableFrom(cls2) || Double.class.isAssignableFrom(cls2) || BigDecimal.class.isAssignableFrom(cls2) || Float.class.isAssignableFrom(cls2)) {
                    return Long.valueOf(((Number) obj).longValue());
                }
                if (String.class.isAssignableFrom(cls2)) {
                    return Long.valueOf(obj.toString());
                }
                throw A00(cls, cls2);
            } else if (this instanceof C28257DuI) {
                if (obj == null) {
                    return null;
                }
                Class<Integer> cls3 = Integer.class;
                Class<?> cls4 = obj.getClass();
                if (cls3.isAssignableFrom(cls4)) {
                    return obj;
                }
                if (Long.class.isAssignableFrom(cls4) || Double.class.isAssignableFrom(cls4) || BigDecimal.class.isAssignableFrom(cls4) || Float.class.isAssignableFrom(cls4)) {
                    return Integer.valueOf(((Number) obj).intValue());
                }
                if (String.class.isAssignableFrom(cls4)) {
                    return Integer.valueOf(obj.toString());
                }
                throw A00(cls3, cls4);
            } else if (this instanceof C28256DuH) {
                if (obj == null) {
                    return null;
                }
                Class<Float> cls5 = Float.class;
                Class<?> cls6 = obj.getClass();
                if (cls5.isAssignableFrom(cls6)) {
                    return obj;
                }
                if (Integer.class.isAssignableFrom(cls6) || Long.class.isAssignableFrom(cls6) || BigDecimal.class.isAssignableFrom(cls6) || Double.class.isAssignableFrom(cls6)) {
                    return Float.valueOf(((Number) obj).floatValue());
                }
                if (String.class.isAssignableFrom(cls6)) {
                    return Float.valueOf(obj.toString());
                }
                throw A00(cls5, cls6);
            } else if (this instanceof C28255DuG) {
                if (obj == null) {
                    return null;
                }
                Class<Double> cls7 = Double.class;
                Class<?> cls8 = obj.getClass();
                if (cls7.isAssignableFrom(cls8)) {
                    return obj;
                }
                if (Integer.class.isAssignableFrom(cls8) || Long.class.isAssignableFrom(cls8) || BigDecimal.class.isAssignableFrom(cls8) || Float.class.isAssignableFrom(cls8)) {
                    return Double.valueOf(((Number) obj).doubleValue());
                }
                if (String.class.isAssignableFrom(cls8)) {
                    return Double.valueOf(obj.toString());
                }
                throw A00(cls7, cls8);
            } else if (this instanceof C28254DuF) {
                if (obj == null) {
                    return null;
                }
                Class<Date> cls9 = Date.class;
                Class<?> cls10 = obj.getClass();
                if (cls9.isAssignableFrom(cls10)) {
                    return obj;
                }
                if (Long.class.isAssignableFrom(cls10)) {
                    return new Date(C17880vN.A05(obj));
                }
                if (String.class.isAssignableFrom(cls10)) {
                    try {
                        return DateFormat.getInstance().parse(obj.toString());
                    } catch (ParseException e) {
                        throw new C23739Bok((Throwable) e);
                    }
                } else {
                    throw A00(cls9, cls10);
                }
            } else if (this instanceof C28253DuE) {
                if (obj == null) {
                    return null;
                }
                Class<Boolean> cls11 = Boolean.class;
                Class<?> cls12 = obj.getClass();
                if (cls11.isAssignableFrom(cls12)) {
                    return obj;
                }
                throw A00(cls11, cls12);
            } else if (this instanceof C28252DuD) {
                if (obj != null) {
                    return new BigInteger(obj.toString());
                }
                return null;
            } else if (!(this instanceof C28251DuC)) {
                return obj;
            } else {
                if (obj != null) {
                    return new BigDecimal(obj.toString());
                }
                return null;
            }
        }
    }

    public C25769Clg(CWO cwo) {
        this.A00 = cwo;
    }
}
