package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.graphics.Rect;
import android.os.SystemClock;
import java.util.List;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

/* renamed from: X.CsL  reason: case insensitive filesystem */
public abstract class C26101CsL {
    public static long A00;
    public static BroadcastReceiver A01;
    public static Context A02;
    public static String A03;
    public static String A04;
    public static String A05;
    public static boolean A06;
    public static final CTC A07 = new CTC("https://maps.instagram.com/maps/tile/?", "https://maps.instagram.com/maps/static/?", (Rect[]) null, (String[]) null, (C199339zp[][]) null, Integer.MAX_VALUE);
    public static final List A08 = AnonymousClass8BR.A14();
    public static final Semaphore A09 = new Semaphore(1);
    public static final CTC A0A;
    public static volatile CTC A0B;
    public static volatile String A0C;
    public static volatile String A0D = "https://graph.facebook.com/v2.2/maps_configs?fields=base_url,static_base_url,osm_config,url_override_config&pretty=0&access_token=";

    static {
        CTC ctc = new CTC("https://www.facebook.com/maps/tile/?", "https://www.facebook.com/maps/static/?", (Rect[]) null, (String[]) null, (C199339zp[][]) null, Integer.MAX_VALUE);
        A0A = ctc;
        A0B = ctc;
        A00();
    }

    public static void A01(Context context, String str) {
        A0C = str;
        Context applicationContext = context.getApplicationContext();
        A02 = applicationContext;
        A00 = 0;
        String packageName = applicationContext.getPackageName();
        if ("com.instagram.android".equals(packageName)) {
            A0D = "https://graph.instagram.com/maps_configs?fields=base_url,static_base_url,osm_config,url_override_config&pretty=0&access_token=";
            A0B = A07;
        } else if ("com.whatsapp".equals(packageName) || "com.whatsapp.w4b".equals(packageName)) {
            A0D = "https://graph.whatsapp.net/v2.2/maps_configs?fields=base_url,static_base_url,osm_config,url_override_config&pretty=0&access_token=";
        }
        if (A01 == null) {
            C22583BEh bEh = new C22583BEh();
            A01 = bEh;
            Context context2 = A02;
            IntentFilter intentFilter = new IntentFilter("android.intent.action.LOCALE_CHANGED");
            C18070vi.A0d(context2, 0);
            context2.registerReceiver(bEh, intentFilter);
        }
    }

    public static void A02(boolean z) {
        if (A0C != null && A02 != null) {
            Semaphore semaphore = A09;
            if (semaphore.availablePermits() > 0) {
                long j = A00;
                if (j == 0 || SystemClock.uptimeMillis() - j >= 3600000) {
                    A06 = z;
                    C22795BPi bPi = new C22795BPi(A02);
                    C27087DTm.A00(bPi);
                    C27087DTm.A01(bPi, "MapConfigUpdateDispatchable");
                }
            } else if (z) {
                try {
                    if (semaphore.tryAcquire(10, TimeUnit.SECONDS)) {
                        semaphore.release();
                    }
                } catch (InterruptedException unused) {
                    C26138Ct1.A07.A02();
                }
            }
        }
    }

    public static void A00() {
        String str;
        String str2;
        String language = Locale.getDefault().getLanguage();
        if (language.length() == 2) {
            String country = Locale.getDefault().getCountry();
            StringBuilder A11 = AnonymousClass000.A11(language);
            if (country.length() == 2) {
                str2 = AnonymousClass001.A1H("_", country, AnonymousClass000.A10());
            } else {
                str2 = "";
            }
            str = AnonymousClass000.A0y(str2, A11);
        } else {
            str = "en";
        }
        A04 = str;
        A05 = AnonymousClass8BS.A0n(str);
        try {
            Locale.getDefault().getISO3Language();
        } catch (MissingResourceException unused) {
        }
    }
}
