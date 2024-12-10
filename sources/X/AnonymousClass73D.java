package X;

import android.graphics.Point;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Bundle;
import com.whatsapp.mediacomposer.MediaComposerActivity;
import com.whatsapp.util.Log;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.73D  reason: invalid class name */
public class AnonymousClass73D {
    public final Map A00 = C17880vN.A11();

    public static AnonymousClass72S A00(Uri uri, Object obj) {
        return ((MediaComposerActivity) obj).A1q.A02(uri);
    }

    public static void A01(Bundle bundle, AnonymousClass73D r25) {
        String str;
        String str2;
        Map map = r25.A00;
        synchronized (map) {
            ArrayList A13 = AnonymousClass000.A13();
            Iterator A0l = C17890vO.A0l(map);
            while (A0l.hasNext()) {
                AnonymousClass72S r0 = (AnonymousClass72S) A0l.next();
                if (r0.A0A() != null) {
                    r0.A0Q((String) null);
                }
                if (r0.A0B() != null) {
                    r0.A0R((String) null);
                }
                Uri uri = r0.A0X;
                Integer A0D = r0.A0D();
                File A0C = r0.A0C();
                String A0E = r0.A0E();
                String A0G = r0.A0G();
                String A0F = r0.A0F();
                File A0A = r0.A0A();
                synchronized (r0) {
                    str = r0.A0I;
                }
                File A0B = r0.A0B();
                int A02 = r0.A02();
                File A08 = r0.A08();
                Rect A05 = r0.A05();
                boolean A0W = r0.A0W();
                Point A04 = r0.A04();
                int A01 = r0.A01();
                boolean A0U = r0.A0U();
                synchronized (r0) {
                    str2 = r0.A0H;
                }
                AnonymousClass77R r6 = new AnonymousClass77R(A04, A05, uri, A0C, A0A, A0B, A08, A0D, A0E, A0G, A0F, str, str2, A02, A01, A0W, A0U);
                r6.A00 = r0;
                A13.add(r6);
            }
            bundle.putParcelableArrayList("items", A13);
        }
    }

    public AnonymousClass72S A02(Uri uri) {
        AnonymousClass72S r0;
        Map map = this.A00;
        synchronized (map) {
            r0 = (AnonymousClass72S) map.get(uri);
            if (r0 == null) {
                Log.e("mediapreviewparams/get/item should be explicitly added");
                r0 = new AnonymousClass72S(uri);
                map.put(uri, r0);
            }
        }
        return r0;
    }

    public AnonymousClass72S A03(Uri uri) {
        AnonymousClass72S r0;
        Map map = this.A00;
        synchronized (map) {
            r0 = (AnonymousClass72S) map.remove(uri);
        }
        return r0;
    }

    public ArrayList A04() {
        ArrayList A10;
        Map map = this.A00;
        synchronized (map) {
            A10 = C17880vN.A10(map.values());
        }
        return A10;
    }

    public void A05(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("media_preview_params");
        if (bundle2 != null) {
            Map map = this.A00;
            synchronized (map) {
                map.clear();
                ArrayList parcelableArrayList = bundle2.getParcelableArrayList("items");
                if (parcelableArrayList != null) {
                    Iterator it = parcelableArrayList.iterator();
                    while (it.hasNext()) {
                        AnonymousClass72S r1 = ((AnonymousClass77R) it.next()).A00;
                        if (r1.A0A() != null) {
                            r1.A0Q(C64062u9.A07(r1.A0A()));
                        }
                        if (r1.A0B() != null) {
                            r1.A0R(C64062u9.A07(r1.A0B()));
                        }
                        map.put(r1.A0X, r1);
                    }
                }
            }
        }
    }

    public void A06(AnonymousClass72S r4) {
        Map map = this.A00;
        synchronized (map) {
            Uri uri = r4.A0X;
            if (map.containsKey(uri)) {
                Log.e("mediapreviewparams/add/item was already added");
            }
            map.put(uri, r4);
        }
    }

    public AnonymousClass73D(AnonymousClass72S r2) {
        A06(r2);
    }

    public AnonymousClass73D() {
    }
}
