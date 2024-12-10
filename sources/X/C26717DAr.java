package X;

import com.facebook.cameracore.mediapipeline.dataproviders.facetracker.interfaces.FaceTrackerDataProviderConfiguration$FaceTrackerErrorHandler;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;

/* renamed from: X.DAr  reason: case insensitive filesystem */
public class C26717DAr implements FaceTrackerDataProviderConfiguration$FaceTrackerErrorHandler {
    public final /* synthetic */ CSP A00;
    public final /* synthetic */ C191959nT A01;

    public C26717DAr(CSP csp, C191959nT r2) {
        this.A00 = csp;
        this.A01 = r2;
    }

    public void handleLoadError(String str) {
        long j;
        CK0 ck0 = this.A00.A03;
        IOException A0f = C17880vN.A0f(str);
        HashMap hashMap = this.A01.A0O;
        StringBuilder A11 = AnonymousClass000.A11("onFaceTrackerLoadModelFailed");
        Iterator A0k = C17890vO.A0k(hashMap);
        while (A0k.hasNext()) {
            Object next = A0k.next();
            String A1G = C108945cZ.A1G(next, hashMap);
            if (A1G != null) {
                File A17 = C108945cZ.A17(A1G);
                if (A17.exists()) {
                    j = A17.length();
                } else {
                    j = 0;
                }
            } else {
                j = -1;
            }
            BE6.A1J(A11);
            A11.append(C108945cZ.A1G(next, hashMap));
            A11.append(":");
            A11.append(j);
        }
        ck0.A00.CNX("FbMsqrdRendererModelLoaderCallback", A11.toString(), A0f);
    }
}
