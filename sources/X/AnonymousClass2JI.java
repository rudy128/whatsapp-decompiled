package X;

import android.os.Build;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.2JI  reason: invalid class name */
public final class AnonymousClass2JI extends AnonymousClass7IA {
    public final C18000vb A00;
    public final AnonymousClass00H A01;
    public final AnonymousClass11P A02;

    public void A0A(JSONObject jSONObject) {
        C18070vi.A0d(jSONObject, 0);
        JSONObject A15 = C17880vN.A15();
        JSONObject A152 = C17880vN.A15();
        File[] A002 = ((C139036y6) this.A01.get()).A00();
        ArrayList A13 = AnonymousClass000.A13();
        for (File A003 : A002) {
            try {
                A13.add(new String(AnonymousClass1EW.A00(A003), C26571Sq.A05));
            } catch (IOException e) {
                Log.e("HierarchyUploaderGraphqlRequest/readFile/ioerror", e);
            }
        }
        JSONArray jSONArray = new JSONArray();
        Iterator it = A13.iterator();
        while (it.hasNext()) {
            try {
                jSONArray.put(C17880vN.A16(C17880vN.A0v(it)));
            } catch (Exception e2) {
                Log.e("HierarchyUploaderGraphqlRequest/getBatches/batch json error", e2);
            }
        }
        A152.put("batches", jSONArray);
        A152.put("is_employee", C18020vd.A05(C18040vf.A02, this.A03, 1777));
        A152.put("primary_locale", this.A00.A0N().toString());
        A152.put("device_model", Build.MODEL);
        A152.put("device_os", "android");
        A152.put("device_os_version", Build.VERSION.RELEASE);
        A152.put("event_time", System.currentTimeMillis());
        A15.put("input", A152);
        jSONObject.put("variables", A15.toString());
    }

    public boolean A0B() {
        return true;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass2JI(X.AnonymousClass181 r17, X.AnonymousClass11P r18, X.C19830z4 r19, X.C18000vb r20, X.C18030ve r21, X.C31611fq r22, X.AnonymousClass00H r23, X.AnonymousClass00H r24, X.C18140vp r25, X.C18140vp r26) {
        /*
            r16 = this;
            r5 = r17
            r6 = r19
            r7 = r21
            r9 = r23
            r12 = r25
            X.C18070vi.A0w(r7, r5, r6, r9, r12)
            r0 = 6
            r13 = r26
            X.C18070vi.A0d(r13, r0)
            r0 = 8
            r1 = r24
            X.C18070vi.A0d(r1, r0)
            r0 = 9
            r3 = r18
            X.C18070vi.A0d(r3, r0)
            r0 = 10
            r2 = r20
            X.C18070vi.A0d(r2, r0)
            r10 = 0
            r14 = 7236799486398397(0x19b5d4aeb28fbd, double:3.5754540120710253E-308)
            r4 = r16
            r8 = r22
            r11 = r10
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            r4.A01 = r1
            r4.A02 = r3
            r4.A00 = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass2JI.<init>(X.181, X.11P, X.0z4, X.0vb, X.0ve, X.1fq, X.00H, X.00H, X.0vp, X.0vp):void");
    }
}
