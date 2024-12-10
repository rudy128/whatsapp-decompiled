package X;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import com.whatsapp.instrumentation.notification.DelayedNotificationReceiver;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: X.33y  reason: invalid class name and case insensitive filesystem */
public class C685933y implements AnonymousClass3L9 {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C685933y(Object obj, Object obj2, int i) {
        this.A00 = i;
        this.A01 = obj2;
        this.A02 = obj;
    }

    public final void BKo(Set set) {
        List list;
        int i;
        if (this.A00 != 0) {
            DelayedNotificationReceiver delayedNotificationReceiver = (DelayedNotificationReceiver) this.A01;
            Context context = (Context) this.A02;
            Iterator it = set.iterator();
            while (it.hasNext()) {
                String A0v = C17880vN.A0v(it);
                AnonymousClass1HY r0 = delayedNotificationReceiver.A02;
                if (!C17880vN.A1W(AnonymousClass1HY.A00(r0), AnonymousClass1HY.A01(A0v, "metadata/delayed_notification_shown"))) {
                    AnonymousClass1HY r2 = delayedNotificationReceiver.A02;
                    long A05 = C17890vO.A05(AnonymousClass1HY.A00(r2), AnonymousClass1HY.A01(A0v, "auth/token_ts"));
                    Number number = (Number) ((C37271pF) delayedNotificationReceiver.A03.get()).A01.get(A0v);
                    if (number != null) {
                        i = number.intValue();
                    } else {
                        i = 2131897316;
                    }
                    String string = context.getString(2131893010);
                    String A002 = A8I.A00(delayedNotificationReceiver.A01, A05);
                    Object[] objArr = new Object[2];
                    objArr[0] = context.getString(i);
                    String A0q = C17880vN.A0q(context, A002, objArr, 1, 2131893009);
                    C1409673t A03 = C217217d.A03(context);
                    A03.A0M = "other_notifications@1";
                    A03.A0F(string);
                    A03.A0E(string);
                    A03.A0D(A0q);
                    Intent A0A = C17880vN.A0A();
                    A0A.setClassName(context.getPackageName(), "com.whatsapp.companiondevice.LinkedDevicesActivity");
                    A03.A0A = C1408573i.A00(context, 0, A0A, 0);
                    C17900vP.A0L(A03, A0q);
                    A03.A0G(true);
                    C17880vN.A1G(A03);
                    delayedNotificationReceiver.A00.BkR(41, A03.A05());
                    AnonymousClass1HY r02 = delayedNotificationReceiver.A02;
                    C17880vN.A1F(AnonymousClass1HY.A00(r02).edit(), AnonymousClass1HY.A01(A0v, "metadata/delayed_notification_shown"), true);
                }
            }
            return;
        }
        C37231pB r7 = (C37231pB) this.A01;
        AnonymousClass3L8 r6 = (AnonymousClass3L8) this.A02;
        if (set.isEmpty()) {
            list = Collections.emptyList();
        } else {
            ArrayList A13 = AnonymousClass000.A13();
            C37051ot r22 = r7.A00;
            AnonymousClass1IZ it2 = r22.A01.iterator();
            while (it2.hasNext()) {
                A13.add(((AnonymousClass00H) it2.next()).get());
            }
            C201110w r4 = r22.A00;
            Iterator it3 = set.iterator();
            while (it3.hasNext()) {
                String A0v2 = C17880vN.A0v(it3);
                try {
                    if (r7.A02.A01(A0v2).A03) {
                        AnonymousClass00H r03 = (AnonymousClass00H) r4.get(A0v2);
                        if (r03 != null) {
                            A13.add(r03.get());
                        }
                    }
                } catch (PackageManager.NameNotFoundException unused) {
                }
                C17900vP.A0g("InstrumentationChangeDispatcher/verification failed, dropping event for package - ", A0v2, AnonymousClass000.A10());
                r7.A01.A05(A0v2);
            }
            list = A13;
        }
        r6.BKm(list);
    }
}
