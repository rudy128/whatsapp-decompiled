package X;

import android.database.Cursor;
import android.os.Build;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.workers.ConstraintTrackingWorker;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.NoSuchElementException;

/* renamed from: X.9uw  reason: invalid class name and case insensitive filesystem */
public abstract class C196369uw {
    /* JADX INFO: finally extract failed */
    public static final void A01(AnonymousClass00I r5, A7G a7g, WorkDatabase workDatabase) {
        int i;
        int i2 = 0;
        C18070vi.A0d(r5, 1);
        if (Build.VERSION.SDK_INT >= 24) {
            ArrayList A11 = AnonymousClass8BR.A11(a7g, new A7G[1], 0);
            while (C17880vN.A1X(A11)) {
                if (!A11.isEmpty()) {
                    A7G a7g2 = (A7G) A11.remove(A11.size() - 1);
                    List<C185319cO> list = a7g2.A07;
                    C18070vi.A0X(list);
                    if (!(list instanceof Collection) || !list.isEmpty()) {
                        i = 0;
                        for (C185319cO r0 : list) {
                            if (r0.A00.A0B.A03() && (i = i + 1) < 0) {
                                AnonymousClass1ZU.A0A();
                                throw null;
                            }
                        }
                    } else {
                        i = 0;
                    }
                    i2 += i;
                    List list2 = a7g2.A06;
                    if (list2 != null) {
                        A11.addAll(list2);
                    }
                } else {
                    throw new NoSuchElementException("List is empty.");
                }
            }
            if (i2 != 0) {
                int i3 = 0;
                AHX A00 = A3D.A00("Select COUNT(*) FROM workspec WHERE LENGTH(content_uri_triggers)<>0 AND state NOT IN (2, 3, 5)", 0);
                C20076A6c a6c = ((C20365AHv) workDatabase.A0E()).A02;
                a6c.A06();
                Cursor A002 = AnonymousClass9OB.A00(a6c, A00, false);
                try {
                    if (A002.moveToFirst()) {
                        i3 = A002.getInt(0);
                    }
                    A002.close();
                    A00.A00();
                    if (i3 + i2 > 8) {
                        StringBuilder A10 = AnonymousClass000.A10();
                        A10.append("Too many workers with contentUriTriggers are enqueued:\ncontentUriTrigger workers limit: ");
                        A10.append(8);
                        A10.append(";\nalready enqueued count: ");
                        A10.append(i3);
                        A10.append(";\ncurrent enqueue operation count: ");
                        A10.append(i2);
                        throw AnonymousClass001.A12(".\nTo address this issue you can: \n1. enqueue less workers or batch some of workers with content uri triggers together;\n2. increase limit via Configuration.Builder.setContentUriTriggerWorkersLimit;\nPlease beware that workers with content uri triggers immediately occupy slots in JobScheduler so no updates to content uris are missed.", A10);
                    }
                } catch (Throwable th) {
                    A002.close();
                    A00.A00();
                    throw th;
                }
            }
        }
    }

    public static final A2t A00(A2t a2t, List list) {
        A2t a2t2 = a2t;
        List<Object> list2 = list;
        C18070vi.A0d(list2, 0);
        int i = Build.VERSION.SDK_INT;
        if (23 > i) {
            try {
                Class<?> cls = Class.forName("androidx.work.impl.background.gcm.GcmScheduler");
                if ((list2 instanceof Collection) && list2.isEmpty()) {
                    return a2t2;
                }
                for (Object obj : list2) {
                    if (cls.isAssignableFrom(obj.getClass())) {
                    }
                }
                return a2t2;
            } catch (ClassNotFoundException unused) {
                return a2t2;
            }
        } else if (i >= 26) {
            return a2t2;
        }
        C20078A6e a6e = a2t2.A0B;
        String str = a2t2.A0I;
        String name = ConstraintTrackingWorker.class.getName();
        if (C18070vi.A18(str, name)) {
            return a2t2;
        }
        if (!a6e.A01 && !a6e.A04) {
            return a2t2;
        }
        C192939pH r2 = new C192939pH();
        r2.A02(a2t2.A0C.A00);
        r2.A00.put("androidx.work.impl.workers.ConstraintTrackingWorker.ARGUMENT_CLASS_NAME", str);
        A6Y A00 = r2.A00();
        C18070vi.A0X(name);
        String str2 = a2t2.A0M;
        Integer num = a2t2.A0G;
        String str3 = a2t2.A0H;
        A6Y a6y = a2t2.A0D;
        long j = a2t2.A05;
        long j2 = a2t2.A06;
        long j3 = a2t2.A04;
        C20078A6e a6e2 = a2t2.A0B;
        int i2 = a2t2.A02;
        Integer num2 = a2t2.A0E;
        long j4 = a2t2.A03;
        long j5 = a2t2.A07;
        long j6 = a2t2.A08;
        long j7 = a2t2.A0A;
        boolean z = a2t2.A0J;
        Integer num3 = a2t2.A0F;
        int i3 = a2t2.A01;
        int i4 = a2t2.A0K;
        long j8 = a2t2.A09;
        int i5 = a2t2.A00;
        C18070vi.A0d(A00, 4);
        boolean z2 = z;
        return new A2t(a6e2, A00, a6y, num, num2, num3, str2, name, str3, i2, i3, i4, i5, a2t2.A0L, j, j2, j3, j4, j5, j6, j7, j8, z2);
    }
}
