package X;

import android.os.Bundle;
import com.whatsapp.fieldstats.events.WamCall;
import com.whatsapp.fieldstats.extension.WamCallExtended;
import com.whatsapp.fieldstats.extension.WamCallExtendedField;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class A4u {
    public final AnonymousClass18K A00;
    public final C18030ve A01;
    public final C23641Hb A02;
    public final C25431Oe A03;
    public final AnonymousClass1DC A04;
    public final AnonymousClass00H A05;

    public static void A01(A4u a4u, AnonymousClass206 r6, int i) {
        if (r6 instanceof AnonymousClass210) {
            AnonymousClass210 r3 = (AnonymousClass210) r6;
            if (AnonymousClass25A.A0t(r6)) {
                AnonymousClass00H r2 = a4u.A05;
                if (((C32981i4) r2.get()).A0I(r3.A07)) {
                    a4u.A03(AnonymousClass74H.A02((String) null, i, 9, ((C32981i4) r2.get()).A0L(r3.A07)));
                }
            }
        }
    }

    public void A02(WamCall wamCall, boolean z) {
        long j;
        this.A02.A01 = wamCall;
        wamCall.unifiedSessionId = this.A03.A03();
        Long l = wamCall.logSampleRatio;
        if (l != null) {
            j = l.longValue();
        } else {
            j = 1;
        }
        wamCall.logSampleRatio = null;
        int i = (int) j;
        AnonymousClass18K r2 = this.A00;
        r2.CC8(wamCall, r2.BDn(new WamCall(), new C18180vt(i, i)));
        if (z) {
            r2.Bio();
        }
    }

    public void A03(C1182662u r2) {
        this.A00.CC7(r2);
    }

    public A4u(C18030ve r1, C23641Hb r2, AnonymousClass18K r3, C25431Oe r4, AnonymousClass1DC r5, AnonymousClass00H r6) {
        this.A01 = r1;
        this.A00 = r3;
        this.A04 = r5;
        this.A03 = r4;
        this.A02 = r2;
        this.A05 = r6;
    }

    public static Bundle A00(Object obj) {
        Bundle A0D = C17880vN.A0D();
        Class<?> cls = obj.getClass();
        Field[] declaredFields = cls.getDeclaredFields();
        ArrayList A13 = AnonymousClass000.A13();
        if (WamCallExtended.class == cls && cls.getSuperclass() != null) {
            Collections.addAll(A13, cls.getSuperclass().getDeclaredFields());
        }
        Collections.addAll(A13, declaredFields);
        Iterator it = A13.iterator();
        while (it.hasNext()) {
            Field field = (Field) it.next();
            int modifiers = field.getModifiers();
            if (Modifier.isPublic(modifiers) && !Modifier.isStatic(modifiers)) {
                String name = field.getName();
                try {
                    Object obj2 = field.get(obj);
                    if (obj2 != null) {
                        if (obj2 instanceof Double) {
                            A0D.putDouble(name, AnonymousClass8BR.A00(obj2));
                        } else if (obj2 instanceof Integer) {
                            A0D.putInt(name, AnonymousClass000.A0M(obj2));
                        } else if (obj2 instanceof Long) {
                            A0D.putLong(name, C17880vN.A05(obj2));
                        } else if (obj2 instanceof Boolean) {
                            A0D.putBoolean(name, AnonymousClass000.A1Y(obj2));
                        } else if (obj2 instanceof String) {
                            A0D.putString(name, (String) obj2);
                        } else if (!name.equals("fields") || !(obj2 instanceof ArrayList)) {
                            StringBuilder A10 = AnonymousClass000.A10();
                            A10.append("unexpected member ");
                            A10.append(name);
                            C17960vV.A0F(false, AnonymousClass000.A0y(" in fieldstats event, only Double, Integer, and String members are supported", A10));
                        } else {
                            ArrayList A132 = AnonymousClass000.A13();
                            Iterator it2 = ((AbstractCollection) obj2).iterator();
                            while (it2.hasNext()) {
                                Object next = it2.next();
                                if (next instanceof WamCallExtendedField) {
                                    A132.add(next);
                                }
                            }
                            A0D.putParcelableArrayList(name, A132);
                        }
                    }
                } catch (IllegalAccessException e) {
                    throw new IllegalArgumentException(e);
                }
            }
        }
        return A0D;
    }
}
