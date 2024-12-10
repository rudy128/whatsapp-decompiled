package X;

import com.facebook.cameracore.ardelivery.model.ARCapabilityMinVersionModeling;
import com.facebook.cameracore.ardelivery.model.ARRequestAsset$CompressionMethod;
import com.facebook.cameracore.ardelivery.model.VersionedCapability;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.9PA  reason: invalid class name */
public abstract class AnonymousClass9PA {
    public static final AM8 A00(C194769sG r30) {
        ARRequestAsset$CompressionMethod aRRequestAsset$CompressionMethod;
        C194769sG r1 = r30;
        C18070vi.A0d(r1, 0);
        String str = r1.A00.A00;
        String str2 = r1.A02;
        String str3 = r1.A03;
        C195599tb r2 = r1.A01;
        String str4 = r2.A01;
        C195519tT r0 = r2.A00;
        String str5 = r0.A03;
        String str6 = r0.A05;
        String str7 = r0.A04;
        String str8 = r2.A03;
        int i = r0.A00;
        int i2 = r0.A01;
        C122476Qn r3 = r0.A02;
        int ordinal = r3.ordinal();
        if (ordinal == 0) {
            aRRequestAsset$CompressionMethod = ARRequestAsset$CompressionMethod.NONE;
        } else if (ordinal == 1) {
            aRRequestAsset$CompressionMethod = ARRequestAsset$CompressionMethod.ZIP;
        } else if (ordinal == 2) {
            aRRequestAsset$CompressionMethod = ARRequestAsset$CompressionMethod.TAR_BROTLI;
        } else if (ordinal != 3) {
            throw AnonymousClass3MW.A14();
        } else {
            throw new UnsupportedOperationException(AnonymousClass000.A0y(" is not a supported compression method", C17890vO.A0f(r3)));
        }
        List<AnonymousClass9q0> list = r2.A04;
        ArrayList A13 = AnonymousClass000.A13();
        for (AnonymousClass9q0 r12 : list) {
            C18070vi.A0d(r12, 0);
            VersionedCapability fromServerValue = VersionedCapability.fromServerValue(r12.A01);
            if (fromServerValue != null) {
                A13.add(new ARCapabilityMinVersionModeling(fromServerValue, r12.A00));
            }
        }
        String str9 = r2.A02;
        boolean z = r2.A06;
        List<C194759sF> list2 = r2.A05;
        ArrayList A0D = C29351c6.A0D(list2);
        for (C194759sF r02 : list2) {
            A0D.add(new C193389q1(r02.A01, r02.A00));
        }
        return new AM8(new AM9(aRRequestAsset$CompressionMethod, str2, str4, str3, str5, str6, str7, str8, str9, A13, A0D, i, i2, z), str);
    }
}
