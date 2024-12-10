package X;

import com.facebook.cameracore.ardelivery.model.ARAssetType;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

public class AIR implements BA6 {
    public final /* synthetic */ C20375AIg A00;
    public final /* synthetic */ C188409hN A01;
    public final /* synthetic */ C180189Lm A02;
    public final /* synthetic */ BA6 A03;
    public final /* synthetic */ AnonymousClass9OY A04;
    public final /* synthetic */ C20282AEq A05;
    public final /* synthetic */ A4D A06;

    public AIR(C20375AIg aIg, C188409hN r2, C180189Lm r3, BA6 ba6, AnonymousClass9OY r5, C20282AEq aEq, A4D a4d) {
        this.A00 = aIg;
        this.A05 = aEq;
        this.A01 = r2;
        this.A04 = r5;
        this.A03 = ba6;
        this.A02 = r3;
        this.A06 = a4d;
    }

    public void Btj(AnonymousClass9LV r5) {
        C20375AIg.A02(this.A00, this.A03, this.A05, this.A06, r5);
    }

    public /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        List list = (List) obj;
        C187119fI r6 = null;
        if (list != null) {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C183679Ze r3 = (C183679Ze) it.next();
                A6K a6k = r3.A00.A01;
                if (a6k.A02 == ARAssetType.EFFECT) {
                    try {
                        String canonicalPath = r3.A01.getCanonicalPath();
                        if (canonicalPath != null) {
                            r6 = new C187119fI(this.A05.A03, a6k.A0A, a6k.A0B, a6k.A09, canonicalPath);
                        }
                    } catch (IOException | SecurityException e) {
                        if (C26294Cx6.A01.BfN(6)) {
                            C26294Cx6.A01.CSY("DefaultCameraCoreEffectManager", "corrupted effect file path", e);
                        }
                    }
                }
            }
        }
        C188409hN r1 = this.A01;
        r1.A02 = r6;
        r1.A04 = true;
        if (r1.A05 && r1.A06) {
            C20375AIg aIg = this.A00;
            C20282AEq aEq = this.A05;
            AnonymousClass9OY r4 = this.A04;
            C20375AIg.A01(aIg, r1, this.A02, this.A03, r4, aEq, AnonymousClass000.A1W(r6));
        }
    }
}
