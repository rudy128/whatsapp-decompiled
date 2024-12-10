package X;

import android.text.TextUtils;
import com.google.android.gms.tasks.Tasks;
import com.google.android.gms.tasks.zzw;
import com.whatsapp.util.Log;

/* renamed from: X.1Ka  reason: invalid class name and case insensitive filesystem */
public class C24361Ka {
    public final AnonymousClass1KZ A00;
    public final C18030ve A01;
    public final AnonymousClass190 A02;
    public final AnonymousClass118 A03;
    public final AnonymousClass00H A04;

    public void A00() {
        if (C41371wF.A00(this.A03.A00) == 0 && !((C88214Yt) this.A04.get()).A07()) {
            if (C18020vd.A05(C18040vf.A01, this.A01, 4391)) {
                AnonymousClass1KZ r2 = this.A00;
                if (!C26234CvS.A04()) {
                    synchronized (AnonymousClass1KY.class) {
                        if (!C26234CvS.A04()) {
                            zzw A012 = C26234CvS.A01(r2.A00.A00);
                            try {
                                Tasks.await(A012);
                                if (A012.isSuccessful()) {
                                    r2.A00();
                                    return;
                                }
                            } catch (Exception unused) {
                                Log.e("AbstractCronetEngineProvider/installAndCreateCronetEngine/Sync cronet engine install failed");
                            }
                        }
                    }
                }
                r2.A00();
            }
            return;
        }
        return;
        r2.A00();
    }

    public C24361Ka(AnonymousClass190 r1, AnonymousClass118 r2, AnonymousClass1KZ r3, C18030ve r4, AnonymousClass00H r5) {
        this.A01 = r4;
        this.A03 = r2;
        this.A02 = r1;
        this.A04 = r5;
        this.A00 = r3;
    }

    public void A01(String str) {
        if (!TextUtils.isEmpty(str)) {
            if (C18020vd.A05(C18040vf.A02, this.A01, 5478)) {
                this.A02.A0G("CronetExceptionFinal", str, true);
            }
        }
    }
}
