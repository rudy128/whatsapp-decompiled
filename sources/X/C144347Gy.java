package X;

import android.content.Context;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/* renamed from: X.7Gy  reason: invalid class name and case insensitive filesystem */
public final class C144347Gy implements AnonymousClass853 {
    public final Context A00;
    public final C18000vb A01;
    public final C147397Sz A02;
    public final C147397Sz A03;
    public final C147397Sz A04;
    public final Calendar A05;

    public C144347Gy(Context context, C18000vb r8) {
        int A0G = C72453Mb.A0G(context, r8, 1);
        this.A00 = context;
        this.A01 = r8;
        Calendar instance = Calendar.getInstance();
        C18070vi.A0X(instance);
        C147397Sz r5 = new C147397Sz(context, r8, instance, 1);
        this.A03 = r5;
        Calendar instance2 = Calendar.getInstance();
        C18070vi.A0X(instance2);
        C147397Sz r4 = new C147397Sz(context, r8, instance2, A0G);
        this.A04 = r4;
        Calendar instance3 = Calendar.getInstance();
        C18070vi.A0X(instance3);
        C147397Sz r3 = new C147397Sz(context, r8, instance3, 3);
        this.A02 = r3;
        Calendar instance4 = Calendar.getInstance();
        C18070vi.A0X(instance4);
        this.A05 = instance4;
        r5.add(6, -2);
        r4.add(6, -7);
        r3.add(6, -28);
        instance4.add(6, -366);
    }

    public final C147397Sz A00(long j) {
        GregorianCalendar gregorianCalendar;
        int i;
        Calendar instance = Calendar.getInstance();
        instance.setTime(new Date(j));
        C147397Sz r2 = this.A03;
        if (instance.after(r2)) {
            return r2;
        }
        C147397Sz r22 = this.A04;
        if (instance.after(r22)) {
            return r22;
        }
        C147397Sz r23 = this.A02;
        if (instance.after(r23)) {
            return r23;
        }
        boolean after = instance.after(this.A05);
        Context context = this.A00;
        C18000vb r3 = this.A01;
        if (after) {
            gregorianCalendar = new GregorianCalendar(instance.get(1), instance.get(2), 1);
            i = 4;
        } else {
            gregorianCalendar = new GregorianCalendar(instance.get(1), 1, 1);
            i = 5;
        }
        return new C147397Sz(context, r3, gregorianCalendar, i);
    }
}
