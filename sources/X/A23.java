package X;

import com.facebook.cameracore.ardelivery.model.ARModelMetadataRequest;
import com.facebook.quicklog.reliability.UserFlowLogger;
import java.util.Map;

public final class A23 {
    public final C167138fT A00;
    public final C167158fV A01;
    public final C167128fS A02;
    public final Map A03;
    public final Map A04 = AnonymousClass8BW.A0u();
    public final C18100vl A05;

    public void A01(ARModelMetadataRequest aRModelMetadataRequest, AnonymousClass9LV r6, A4D a4d, boolean z) {
        short s;
        C18070vi.A0d(aRModelMetadataRequest, 0);
        if (!A00(a4d, this)) {
            C167128fS r3 = this.A02;
            String str = a4d.A01;
            C18070vi.A0X(str);
            int A0P = AnonymousClass000.A0P(aRModelMetadataRequest.mCapability.name(), C17890vO.A1a(str), 1);
            if (!z) {
                if (r6 != null) {
                    String A002 = r6.A00();
                    C18070vi.A0X(A002);
                    r3.A03(A0P, "failure_reason", A002);
                }
                s = 3;
            } else {
                s = 2;
            }
            r3.A04(A0P, s);
        }
    }

    public static final boolean A00(A4D a4d, A23 a23) {
        if (C72453Mb.A1a(a23.A05) || a4d.A02) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: type inference failed for: r0v4, types: [X.8fS, X.9uD] */
    public A23(AnonymousClass11P r4, C18030ve r5, AnonymousClass19Y r6, C48562My r7, AnonymousClass00H r8) {
        C18070vi.A0w(r4, r5, r7, r6, r8);
        this.A05 = AnonymousClass1DF.A00(AnonymousClass00R.A01, new C21837AtP(r5));
        Map A0u = AnonymousClass8BW.A0u();
        this.A03 = A0u;
        this.A01 = new C167158fV((AnonymousClass9WS) C18070vi.A0E(r8), r7, A0u);
        this.A02 = new C195949uD(r4, r6, A0u);
        this.A00 = new C167138fT((AnonymousClass9WS) C18070vi.A0E(r8), r4, r6, A0u);
    }

    public void A02(ARModelMetadataRequest aRModelMetadataRequest, A4D a4d, int i, boolean z) {
        String str;
        if (!A00(a4d, this)) {
            C167128fS r4 = this.A02;
            String str2 = a4d.A01;
            C18070vi.A0X(str2);
            int A0P = AnonymousClass000.A0P(aRModelMetadataRequest.mCapability.name(), C17890vO.A1a(str2), 1);
            if (z) {
                str = "model_cache_check_hit";
            } else {
                str = "model_cache_check_miss";
            }
            r4.A02(A0P, str);
            r4.A00.markerAnnotate(22413317, A0P, "version", i);
            if (z) {
                r4.A04(A0P, 2);
            }
        }
    }

    public void A03(C20282AEq aEq, AnonymousClass9LV r12, A4D a4d, boolean z) {
        String str;
        int i;
        String str2;
        C18070vi.A0i(aEq, a4d);
        this.A04.remove(aEq.A01.A0A);
        if (!A00(a4d, this)) {
            C167158fV r4 = this.A01;
            String str3 = a4d.A01;
            long A002 = r4.A00(22421767, str3.hashCode());
            synchronized (r4) {
                if (r4.A00 == A002) {
                    r4.A00 = 0;
                }
            }
            if (z) {
                C48562My r0 = r4.A01;
                if (r0 != null) {
                    r0.flowEndSuccess(A002);
                } else {
                    UserFlowLogger userFlowLogger = r4.A00;
                    if (userFlowLogger != null) {
                        userFlowLogger.flowEndSuccess(A002);
                    } else {
                        throw C17880vN.A0g();
                    }
                }
            } else {
                if (r12 != null) {
                    r4.A04(A002, "failure_reason", r12.toString());
                    str = r12.mType.name();
                    str2 = r12.A00();
                    C18070vi.A0X(str2);
                    i = 0;
                } else {
                    str = "unknown";
                    i = 0;
                    str2 = str;
                }
                r4.A03(A002, str, i, str2);
            }
            this.A03.remove(str3);
        }
    }
}
