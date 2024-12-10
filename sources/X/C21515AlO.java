package X;

import android.os.FileObserver;
import java.io.File;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;

/* renamed from: X.AlO  reason: case insensitive filesystem */
public class C21515AlO implements C18140vp {
    public volatile File A00 = null;
    public final /* synthetic */ C20032A4b A01;

    public /* bridge */ /* synthetic */ Object get() {
        boolean z;
        List list;
        if (this.A00 == null) {
            synchronized (this) {
                if (this.A00 == null) {
                    File A0e = C17880vN.A0e((File) this.A01.A03.get(), "linkedapp_app_identity");
                    File parentFile = A0e.getParentFile();
                    if (parentFile != null) {
                        if (parentFile.exists()) {
                            if (!parentFile.isDirectory()) {
                                C26294Cx6.A0G("LightSharedPreferencesFactory", "Failed to create directory %s. It is an existing *file*.", parentFile.getAbsolutePath());
                            }
                        } else if (!parentFile.mkdirs() && !parentFile.exists()) {
                            Object[] A1b = AnonymousClass3MW.A1b();
                            A1b[0] = parentFile.getAbsolutePath();
                            A1b[1] = A0e.getName();
                            C26294Cx6.A0F("LightSharedPreferencesFactory", "Failed to create directory %s for %s", A1b);
                        }
                        this.A00 = A0e;
                        z = true;
                    } else {
                        throw AnonymousClass8BR.A0v("expecting a file which is always under some dir");
                    }
                } else {
                    z = false;
                }
            }
            if (z) {
                C20032A4b a4b = this.A01;
                String A002 = C182269Ts.A00();
                String str = null;
                if (A002 != null && AnonymousClass1YF.A0Y(A002, ":", false)) {
                    List A0v = C108965cb.A0v(A002, ":", 0);
                    if (!A0v.isEmpty()) {
                        ListIterator A18 = C108955ca.A18(A0v);
                        while (true) {
                            if (A18.hasPrevious()) {
                                if (C108985cd.A08(A18) != 0) {
                                    list = C108985cd.A0t(A0v, A18);
                                    break;
                                }
                            } else {
                                break;
                            }
                        }
                        str = C108955ca.A1b(list)[1];
                    }
                    list = C18460wS.A00;
                    str = C108955ca.A1b(list)[1];
                }
                Map map = a4b.A00;
                synchronized (map) {
                    if (!map.containsKey("linkedapp_app_identity")) {
                        if (str != null) {
                            if (a4b.A01.contains(str)) {
                                map.put("linkedapp_app_identity", new C161208Cf(a4b, ((File) get()).getPath(), this));
                            }
                        }
                    } else if (str != null) {
                    }
                    if (a4b.A01.contains(str)) {
                        Iterator A15 = AnonymousClass000.A15(map);
                        while (A15.hasNext()) {
                            ((FileObserver) C17890vO.A0P(A15)).startWatching();
                        }
                    }
                }
            }
        }
        return this.A00;
    }

    public C21515AlO(C20032A4b a4b) {
        this.A01 = a4b;
    }
}
