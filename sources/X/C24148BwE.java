package X;

import android.content.Context;
import android.view.ViewOutlineProvider;

/* renamed from: X.BwE  reason: case insensitive filesystem */
public class C24148BwE extends BIV {
    public final BHr A00;

    public void setIsFullscreen(boolean z) {
        this.A00.A01 = !z;
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [android.view.ViewOutlineProvider, X.BHr] */
    public C24148BwE(Context context, int i) {
        super(context);
        if (!this.A01) {
            this.A01 = true;
            generatedComponent();
        }
        setClipToOutline(true);
        ? viewOutlineProvider = new ViewOutlineProvider();
        this.A00 = viewOutlineProvider;
        viewOutlineProvider.A00 = i;
        setOutlineProvider(viewOutlineProvider);
    }
}
