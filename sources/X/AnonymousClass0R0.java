package X;

import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import java.lang.ref.Reference;
import java.util.Iterator;

/* renamed from: X.0R0  reason: invalid class name */
public final class AnonymousClass0R0 implements ComponentCallbacks2 {
    public final /* synthetic */ Configuration A00;
    public final /* synthetic */ AnonymousClass0HG A01;

    public AnonymousClass0R0(Configuration configuration, AnonymousClass0HG r2) {
        this.A00 = configuration;
        this.A01 = r2;
    }

    public void onConfigurationChanged(Configuration configuration) {
        Configuration configuration2 = this.A00;
        int updateFrom = configuration2.updateFrom(configuration);
        Iterator it = this.A01.A00.entrySet().iterator();
        while (it.hasNext()) {
            C03670Jg r0 = (C03670Jg) ((Reference) AnonymousClass000.A16(it).getValue()).get();
            if (r0 == null || Configuration.needNewResources(updateFrom, r0.A00)) {
                it.remove();
            }
        }
        configuration2.setTo(configuration);
    }

    public void onLowMemory() {
        this.A01.A00.clear();
    }

    public void onTrimMemory(int i) {
        this.A01.A00.clear();
    }
}
