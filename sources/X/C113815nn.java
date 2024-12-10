package X;

import android.content.Context;
import android.util.AttributeSet;
import androidx.viewpager.widget.ViewPager;

/* renamed from: X.5nn  reason: invalid class name and case insensitive filesystem */
public abstract class C113815nn extends ViewPager implements AnonymousClass009 {
    public AnonymousClass031 A00;
    public boolean A01;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: X.5x2} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: com.whatsapp.status.playback.widget.StatusPlaybackPager} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v5, resolved type: X.5x2} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v6, resolved type: X.5x2} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0O() {
        /*
            r2 = this;
            boolean r0 = r2 instanceof com.whatsapp.status.playback.widget.StatusPlaybackPager
            if (r0 == 0) goto L_0x0012
            r1 = r2
            com.whatsapp.status.playback.widget.StatusPlaybackPager r1 = (com.whatsapp.status.playback.widget.StatusPlaybackPager) r1
            boolean r0 = r1.A00
            if (r0 != 0) goto L_0x0011
            r0 = 1
            r1.A00 = r0
        L_0x000e:
            r1.generatedComponent()
        L_0x0011:
            return
        L_0x0012:
            boolean r0 = r2 instanceof X.C116325x2
            if (r0 == 0) goto L_0x0021
            r1 = r2
            X.5x2 r1 = (X.C116325x2) r1
            boolean r0 = r1.A00
            if (r0 != 0) goto L_0x0011
            r0 = 1
            r1.A00 = r0
            goto L_0x000e
        L_0x0021:
            boolean r0 = r2.A01
            if (r0 != 0) goto L_0x0011
            r0 = 1
            r2.A01 = r0
            r2.generatedComponent()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C113815nn.A0O():void");
    }

    public final Object generatedComponent() {
        AnonymousClass031 r0 = this.A00;
        if (r0 == null) {
            r0 = AnonymousClass3MW.A0u(this);
            this.A00 = r0;
        }
        return r0.generatedComponent();
    }

    public C113815nn(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A0O();
    }
}
