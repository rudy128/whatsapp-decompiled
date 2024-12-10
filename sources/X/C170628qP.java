package X;

import com.whatsapp.util.Log;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;

/* renamed from: X.8qP  reason: invalid class name and case insensitive filesystem */
public class C170628qP extends C196279uk {
    public final C18000vb A00;
    public final AnonymousClass1KG A01;
    public final AnonymousClass1QD A02;
    public final AnonymousClass118 A03;
    public final AnonymousClass1D9 A04;
    public final C220418j A05;

    public synchronized File A02(String str) {
        File A0f;
        A0f = AnonymousClass8BU.A0f(this.A03.A00, str);
        if (!A0f.exists()) {
            return null;
        }
        return A0f;
    }

    public C170628qP(AnonymousClass181 r8, AnonymousClass118 r9, C18000vb r10, AnonymousClass1D9 r11, AnonymousClass1KG r12, AnonymousClass1QD r13, C220418j r14, AnonymousClass10I r15) {
        super(r8, r9, r11, r14, r15, 14);
        this.A03 = r9;
        this.A00 = r10;
        this.A05 = r14;
        this.A04 = r11;
        this.A02 = r13;
        this.A01 = r12;
    }

    public /* bridge */ /* synthetic */ boolean A09(InputStream inputStream, Object obj) {
        FileOutputStream A19;
        File A022 = A02("payments_error_map.json");
        if (A022 != null) {
            C64062u9.A0Q(A022);
        }
        File A023 = super.A02("");
        if (A023 == null) {
            Log.e("PAY:ErrorMapAssetManager/storeAssets/ Could not prepare resource directory");
            return false;
        }
        try {
            A19 = C108945cZ.A19(AnonymousClass8BR.A0u(A023.getAbsolutePath(), "payments_error_map.json"));
            C64062u9.A00(inputStream, A19);
            A19.close();
            return true;
        } catch (IOException e) {
            Log.e("PAY:ErrorMapAssetManager/store Failed!", e);
            return false;
        } catch (Throwable th) {
            AnonymousClass0DT.A00(th, th);
        }
        throw th;
    }

    public void A0B() {
        File A022;
        C20607ARr aRr = new C20607ARr(this);
        AnonymousClass1QD r1 = this.A02;
        if (AnonymousClass11P.A01(r1.A01) - r1.A03().getLong("payments_error_map_last_sync_time_millis", (System.currentTimeMillis() - 604800000) - 1) > 604800000 || A0C()) {
            if (A0C() && (A022 = A02("payments_error_map.json")) != null) {
                C64062u9.A0Q(A022);
            }
            String BPX = this.A01.BPX();
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("https://static.whatsapp.net/payments/error_map?product_type=payments_p2p_fbpay&country=");
            A10.append(BPX);
            A10.append("&lg=");
            A10.append(this.A00.A05());
            A10.append("&platform=android&app_type=");
            A10.append("CONSUMER");
            A10.append("&api_version=");
            super.A04(aRr, (Object) null, AnonymousClass000.A0y("1", A10), (Map) null);
        }
    }

    public boolean A0C() {
        String A0r = C17880vN.A0r(this.A02.A03(), "error_map_key");
        String BPX = this.A01.BPX();
        if (A0r == null) {
            return true;
        }
        String[] split = A0r.split("_");
        if (!split[0].equals(BPX) || !split[1].equals(this.A00.A05()) || !split[2].equals("1")) {
            return true;
        }
        return false;
    }
}
