package com.whatsapp.businessdirectory.viewmodel;

import X.AM7;
import X.AnonymousClass00H;
import X.AnonymousClass1DT;
import X.AnonymousClass1E7;
import X.AnonymousClass3MW;
import X.AnonymousClass8FK;
import X.C108945cZ;
import X.C125776bf;
import X.C133076o8;
import X.C1599986r;
import X.C1600887b;
import X.C1600987c;
import X.C17880vN;
import X.C17890vO;
import X.C41731wy;
import android.app.Application;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class BusinessDirectoryFrequentContactedViewModel extends AnonymousClass8FK implements C1599986r, C1600887b, C1600987c {
    public final AnonymousClass1DT A00 = C108945cZ.A0S();
    public final AM7 A01;
    public final C41731wy A02 = AnonymousClass3MW.A0o();
    public final AnonymousClass00H A03;

    public void A0S() {
        C17890vO.A0t(((C133076o8) this.A03.get()).A00);
    }

    public void Bq2(C125776bf r14) {
        synchronized (BusinessDirectoryFrequentContactedViewModel.class) {
            ArrayList arrayList = r14.A00;
            if (!arrayList.isEmpty()) {
                this.A00.A0E(arrayList);
                int size = arrayList.size();
                Iterator it = arrayList.iterator();
                int i = 0;
                while (it.hasNext()) {
                    if (C17880vN.A0O(it).A0G.A02()) {
                        i++;
                    }
                }
                int i2 = size - i;
                AM7 am7 = this.A01;
                Iterator it2 = arrayList.iterator();
                int i3 = 0;
                while (it2.hasNext()) {
                    if (C17880vN.A0O(it2).A0G.A02()) {
                        i3++;
                    }
                }
                LinkedHashMap A13 = C17880vN.A13();
                A13.put("local_biz_count", Integer.valueOf(i2));
                A13.put("api_biz_count", Integer.valueOf(i3));
                LinkedHashMap A132 = C17880vN.A13();
                A132.put("result", A13);
                am7.A08((Integer) null, 12, A132, 12, 84, 2);
            }
        }
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, X.6UH] */
    public /* bridge */ /* synthetic */ void BwF(Object obj) {
        C41731wy r2 = this.A02;
        ? obj2 = new Object();
        obj2.A00 = 0;
        obj2.A01 = (AnonymousClass1E7) obj;
        r2.A0E(obj2);
        this.A01.A08((Integer) null, C17880vN.A0k(), (Map) null, 12, 80, 1);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, X.6UH] */
    public void C6J(AnonymousClass1E7 r8) {
        C41731wy r2 = this.A02;
        ? obj = new Object();
        obj.A00 = 1;
        obj.A01 = r8;
        r2.A0E(obj);
        this.A01.A08((Integer) null, C17880vN.A0l(), (Map) null, 12, 81, 1);
    }

    public BusinessDirectoryFrequentContactedViewModel(Application application, AM7 am7, AnonymousClass00H r6) {
        super(application);
        this.A03 = r6;
        this.A01 = am7;
        am7.A04((Integer) null, 12, 84);
        ((C133076o8) this.A03.get()).A00(this, 100);
    }
}
