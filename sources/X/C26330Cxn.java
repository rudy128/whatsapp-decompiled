package X;

import android.content.ComponentCallbacks;
import android.content.res.Configuration;

/* renamed from: X.Cxn  reason: case insensitive filesystem */
public class C26330Cxn implements ComponentCallbacks {
    public final /* synthetic */ BIS A00;

    public void onConfigurationChanged(Configuration configuration) {
    }

    public C26330Cxn(BIS bis) {
        this.A00 = bis;
    }

    public void onLowMemory() {
        this.A00.A0C();
    }
}
