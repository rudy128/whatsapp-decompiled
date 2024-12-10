package X;

import com.whatsapp.wamsys.JniBridge;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CountDownLatch;

/* renamed from: X.18C  reason: invalid class name */
public final class AnonymousClass18C implements AnonymousClass188 {
    public Boolean A00;
    public final AnonymousClass183 A01;
    public final AnonymousClass00H A02;
    public final CountDownLatch A03 = new CountDownLatch(1);
    public final AnonymousClass00H A04;

    public AnonymousClass18C(AnonymousClass183 r3, AnonymousClass00H r4, AnonymousClass00H r5) {
        C18070vi.A0d(r4, 1);
        C18070vi.A0d(r3, 2);
        C18070vi.A0d(r5, 3);
        this.A04 = r4;
        this.A01 = r3;
        this.A02 = r5;
    }

    public void CHx(Object obj, int i, int i2) {
        AnonymousClass183 r1 = this.A01;
        Object obj2 = obj;
        int i3 = i;
        int i4 = i2;
        if (r1.A00.A06()) {
            A00(this, obj, i, i2);
        } else {
            r1.A01.execute(new C70823Cq((Object) this, i3, obj2, i4, 6));
        }
    }

    public static final void A00(AnonymousClass18C r5, Object obj, int i, int i2) {
        boolean contains;
        long j;
        long j2;
        long j3;
        long j4;
        Object obj2;
        int i3;
        JniBridge jniBridge;
        Boolean bool = r5.A00;
        if (bool != null) {
            contains = bool.booleanValue();
        } else {
            List asList = Arrays.asList(new Integer[]{2, 3, 4});
            C18070vi.A0X(asList);
            contains = asList.contains(Integer.valueOf(C18020vd.A00(C18040vf.A02, (C18020vd) r5.A02.get(), 5120)));
            r5.A00 = Boolean.valueOf(contains);
        }
        if (contains && i == 11) {
            jniBridge = (JniBridge) r5.A04.get();
            j = 11;
            j4 = 62;
        } else if (obj == null) {
            JniBridge.jvidispatchIIIO(4, (long) i2, (long) i, ((JniBridge) r5.A04.get()).wajContext.get());
            return;
        } else if (obj instanceof String) {
            JniBridge.jvidispatchIIIOO(1, (long) i2, (long) i, obj, ((JniBridge) r5.A04.get()).wajContext.get());
            return;
        } else if (obj instanceof Integer) {
            jniBridge = (JniBridge) r5.A04.get();
            j = (long) i;
            j4 = (long) ((Number) obj).intValue();
        } else if (obj instanceof Long) {
            jniBridge = (JniBridge) r5.A04.get();
            j = (long) i;
            j4 = ((Number) obj).longValue();
        } else if (obj instanceof Double) {
            JniBridge.jvidispatchIIIDO((long) i2, (long) i, ((Number) obj).doubleValue(), ((JniBridge) r5.A04.get()).wajContext.get());
            return;
        } else if (obj instanceof Boolean) {
            JniBridge jniBridge2 = (JniBridge) r5.A04.get();
            j = (long) i;
            j2 = (long) i2;
            if (((Boolean) obj).booleanValue()) {
                j3 = 1;
            } else {
                j3 = 0;
            }
            obj2 = jniBridge2.wajContext.get();
            i3 = 1;
            JniBridge.jvidispatchIIIIO(i3, j2, j, j4, obj2);
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("Unsupported attribute type: ");
            sb.append(obj.getClass().getName());
            C17960vV.A0B(new IllegalArgumentException(sb.toString()));
            return;
        }
        j2 = (long) i2;
        obj2 = jniBridge.wajContext.get();
        i3 = 0;
        JniBridge.jvidispatchIIIIO(i3, j2, j, j4, obj2);
    }
}
