package X;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.9pf  reason: invalid class name and case insensitive filesystem */
public class C193179pf {
    public final C18000vb A00;

    public C193179pf(C18000vb r1) {
        this.A00 = r1;
    }

    /* JADX WARNING: type inference failed for: r1v2, types: [X.Amp, java.util.Calendar, java.util.GregorianCalendar, X.94k] */
    public C1764894k A00(long j) {
        Calendar instance = Calendar.getInstance();
        instance.setTime(new Date(j));
        C18000vb r5 = this.A00;
        int i = instance.get(6);
        GregorianCalendar gregorianCalendar = new GregorianCalendar(instance.get(1), instance.get(2), 1);
        C18070vi.A0d(r5, 1);
        ? gregorianCalendar2 = new GregorianCalendar();
        gregorianCalendar2.whatsAppLocale = r5;
        gregorianCalendar2.id = i;
        gregorianCalendar2.setTime(gregorianCalendar.getTime());
        return gregorianCalendar2;
    }

    /* JADX WARNING: type inference failed for: r1v2, types: [X.Amp, java.util.Calendar, java.util.GregorianCalendar] */
    public C21601Amp A01(long j) {
        Calendar instance = Calendar.getInstance();
        instance.setTime(new Date(j));
        C18000vb r5 = this.A00;
        int i = instance.get(6);
        GregorianCalendar gregorianCalendar = new GregorianCalendar(instance.get(1), instance.get(2), AnonymousClass8BT.A02(instance));
        ? gregorianCalendar2 = new GregorianCalendar();
        gregorianCalendar2.whatsAppLocale = r5;
        gregorianCalendar2.id = i;
        gregorianCalendar2.setTime(gregorianCalendar.getTime());
        return gregorianCalendar2;
    }

    public ArrayList A02(List list) {
        ArrayList A13 = AnonymousClass000.A13();
        Iterator it = list.iterator();
        C21601Amp amp = null;
        while (it.hasNext()) {
            C21601Amp A01 = A01(((AW0) it.next()).A05);
            if (amp != null) {
                if (!amp.equals(A01)) {
                    A13.add(amp);
                } else {
                    amp.count++;
                }
            }
            A01.count = 0;
            amp = A01;
            amp.count++;
        }
        if (amp != null) {
            A13.add(amp);
        }
        return A13;
    }
}
