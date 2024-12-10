package X;

import android.content.Context;
import com.facebook.cameracore.ardelivery.model.ModelPathsHolder;
import com.facebook.cameracore.ardelivery.model.VersionedCapability;
import com.facebook.cameracore.mediapipeline.featureconfig.ProductFeatureConfig;
import com.facebook.cameracore.mediapipeline.services.gallerypicker.GalleryPickerServiceConfiguration;
import com.whatsapp.SecondaryProcessAbstractAppShellDelegate;
import java.util.HashMap;
import java.util.List;

public final class B1X extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ BCO $callback;
    public final /* synthetic */ AM8 $effect;
    public final /* synthetic */ C92384hD $params;
    public final /* synthetic */ C195109so this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public B1X(C195109so r2, AM8 am8, BCO bco, C92384hD r5) {
        super(1);
        this.this$0 = r2;
        this.$effect = am8;
        this.$params = r5;
        this.$callback = bco;
    }

    /* JADX WARNING: type inference failed for: r1v22, types: [X.BQR, java.lang.Object] */
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        BCO bco;
        C99704tK r1;
        IllegalArgumentException illegalArgumentException;
        C24317BzE bzE;
        C6W c6w;
        C194779sH r2;
        String str;
        Long l;
        C25073CWg cWg;
        C85904Pe r11;
        ModelPathsHolder A00;
        ModelPathsHolder A002;
        ModelPathsHolder A003;
        ModelPathsHolder A004;
        ModelPathsHolder A005;
        ModelPathsHolder A006;
        ModelPathsHolder A007;
        HashMap hashMap;
        C187569g1 r5 = (C187569g1) obj;
        C18070vi.A0d(r5, 0);
        try {
            C195109so r12 = this.this$0;
            Context context = r12.A00;
            AM9 am9 = this.$effect.A01;
            C92384hD r122 = this.$params;
            BCO bco2 = this.$callback;
            C18030ve r13 = r12.A02;
            C108985cd.A1D(r122, bco2);
            List list = r5.A05;
            C18070vi.A0X(list);
            if (list.size() == 1) {
                C187119fI r7 = (C187119fI) C29431cG.A0b(list);
                String str2 = r7.A01;
                if (AnonymousClass8BR.A1S(str2)) {
                    C188849i6 r8 = new C188849i6();
                    String str3 = r7.A02;
                    String str4 = str3;
                    if (str3 == null || str3.isEmpty()) {
                        str4 = "0";
                    }
                    r8.A0F = str4;
                    if (str3 == null || str3.isEmpty()) {
                        str3 = "0";
                    }
                    r8.A0G = str3;
                    r8.A0I = r7.A04;
                    String str5 = r7.A03;
                    if (str5 == null) {
                        str5 = "0";
                    }
                    r8.A0H = str5;
                    r8.A02 = SecondaryProcessAbstractAppShellDelegate.COMPRESSED_WHATSAPP_LIB_NAME;
                    r8.A03 = r122.A04;
                    r8.A06 = r5.A01;
                    r8.A08 = r5.A02;
                    if (r122.A05) {
                        bzE = C24317BzE.USER_INTERACTION;
                    } else {
                        bzE = C24317BzE.SYSTEM;
                    }
                    r8.A01 = bzE;
                    r8.A0Q = r7.A00;
                    r8.A07 = str2;
                    r8.A0R = C201110w.copyOf(r5.A03.A00);
                    C25996CqC cqC = new C25996CqC(r13, am9.A07);
                    C199099zQ r9 = r5.A00;
                    C18070vi.A0X(r9);
                    if (C72453Mb.A1a(cqC.A06)) {
                        ModelPathsHolder A008 = C199099zQ.A00(r9, VersionedCapability.Facetracker);
                        if (A008 == null) {
                            hashMap = C17880vN.A11();
                        } else {
                            String modelPath = A008.getModelPath(AnonymousClass9JJ.A0C);
                            String modelPath2 = A008.getModelPath(AnonymousClass9JJ.A08);
                            String modelPath3 = A008.getModelPath(AnonymousClass9JJ.A0A);
                            String modelPath4 = A008.getModelPath(AnonymousClass9JJ.A0E);
                            HashMap A11 = C17880vN.A11();
                            String[] strArr = AnonymousClass9T4.A00;
                            A11.put(strArr[0], modelPath);
                            A11.put(strArr[1], modelPath2);
                            A11.put(strArr[2], modelPath3);
                            A11.put(strArr[3], modelPath4);
                            hashMap = new HashMap(A11);
                        }
                        r8.A0P = hashMap;
                    }
                    if (C72453Mb.A1a(cqC.A05) && (A007 = C199099zQ.A00(r9, VersionedCapability.FaceExpressionFitting)) != null) {
                        r8.A0A = A007.getModelPath(AnonymousClass9JJ.A06);
                    }
                    if (C72453Mb.A1a(cqC.A0F) && (A006 = C199099zQ.A00(r9, VersionedCapability.FaceExpressionFittingRTRRetargeting)) != null) {
                        r8.A0O = A006.getModelPath(AnonymousClass9JJ.A0f);
                    }
                    if (C72453Mb.A1a(cqC.A07) && (A005 = C199099zQ.A00(r9, VersionedCapability.FaceWave)) != null) {
                        r8.A09 = A005.getModelPath(AnonymousClass9JJ.A0c);
                    }
                    if (C72453Mb.A1a(cqC.A0D) && (A004 = C199099zQ.A00(r9, VersionedCapability.Segmentation)) != null) {
                        r8.A0M = A004.getModelPath(AnonymousClass9JJ.A02);
                        r8.A0N = A004.getModelPath(AnonymousClass9JJ.A03);
                        r8.A0L = A004.getModelPath(AnonymousClass9JJ.A04);
                        AnonymousClass9JJ r14 = AnonymousClass9JJ.A0T;
                        if (A004.mModelPaths.containsKey(r14)) {
                            r8.A0J = A004.getModelPath(r14);
                        }
                        AnonymousClass9JJ r15 = AnonymousClass9JJ.A0U;
                        if (A004.mModelPaths.containsKey(r15)) {
                            r8.A0K = A004.getModelPath(r15);
                        }
                    }
                    if (C72453Mb.A1a(cqC.A09) && (A003 = C199099zQ.A00(r9, VersionedCapability.HairSegmentation)) != null) {
                        r8.A0B = A003.getModelPath(AnonymousClass9JJ.A02);
                        r8.A0C = A003.getModelPath(AnonymousClass9JJ.A03);
                    }
                    if (C72453Mb.A1a(cqC.A0A) && (A002 = C199099zQ.A00(r9, VersionedCapability.HandTracker)) != null) {
                        r8.A0D = A002.getModelPath(AnonymousClass9JJ.A02);
                        r8.A0E = A002.getModelPath(AnonymousClass9JJ.A03);
                    }
                    if (C72453Mb.A1a(cqC.A03) && (A00 = C199099zQ.A00(r9, VersionedCapability.BodyTracking)) != null) {
                        r8.A04 = A00.getModelPath(AnonymousClass9JJ.A02);
                        r8.A05 = A00.getModelPath(AnonymousClass9JJ.A03);
                    }
                    C25602Cih cih = new C25602Cih();
                    cih.A03 = new CN0(context);
                    AnonymousClass9UR r0 = r5.A04;
                    C18070vi.A0X(r0);
                    C185349cR r16 = new C185349cR();
                    r16.A02 = true;
                    C19971A1g a1g = r122.A02;
                    boolean z = r0.A00;
                    r16.A00 = z;
                    r16.A01 = z;
                    cih.A02 = new ProductFeatureConfig(r16);
                    if (C72453Mb.A1a(cqC.A08)) {
                        cih.A06.put(GalleryPickerServiceConfiguration.A00, new Object());
                    }
                    if (C72453Mb.A1a(cqC.A04)) {
                        C25480Cgb cgb = BQR.A01;
                        C26720DAu dAu = new C26720DAu();
                        ? obj2 = new Object();
                        obj2.A00 = dAu;
                        cih.A06.put(cgb, obj2);
                    }
                    if (C72453Mb.A1a(cqC.A0C)) {
                        cih.A06.put(BQT.A01, new BQT(new C26718DAs(context)));
                    }
                    if (!(!C72453Mb.A1a(cqC.A0B) || a1g == null || (r11 = a1g.A02) == null)) {
                        cih.A06.put(BQU.A01, new BQU(new C185449cb(r122.A00, r11, am9.A0C)));
                    }
                    if (!(!C72453Mb.A1a(cqC.A0E) || a1g == null || (cWg = a1g.A01) == null)) {
                        C25480Cgb cgb2 = BQX.A02;
                        BQX bqx = (BQX) cWg.A03.getValue();
                        if (bqx == null) {
                            cih.A06.remove(cgb2);
                        } else {
                            cih.A06.put(cgb2, bqx);
                        }
                    }
                    if (C72453Mb.A1a(cqC.A0G)) {
                        cih.A06.put(BQV.A01, new BQV(new CWV()));
                    }
                    if (!C72453Mb.A1a(cqC.A02) || a1g == null || (r2 = a1g.A00) == null) {
                        c6w = new AnonymousClass8QT(bco2);
                    } else {
                        C26984DOg dOg = (C26984DOg) r2.A00;
                        c6w = dOg.A01;
                        C24765CJf cJf = dOg.A00;
                        C1418477e r02 = r2.A02;
                        String str6 = null;
                        if (r02 == null || (l = (Long) r02.A00) == null) {
                            str = null;
                        } else {
                            str = l.toString();
                        }
                        C1418477e r03 = r2.A01;
                        if (r03 != null) {
                            str6 = (String) r03.A00;
                        }
                        cih.A06.put(BQZ.A04, new BQZ(cJf, cJf.A00, str, str6));
                    }
                    r8.A00 = new CXC(cih);
                    C26852DGj dGj = new C26852DGj(new C191959nT(r8), c6w);
                    this.$callback.Bx4(r5.A02, r5.A01);
                    try {
                        ((C22804BPs) this.this$0.A04.getValue()).A0F(C83454Fe.A00(this.$params), true);
                        C22804BPs bPs = (C22804BPs) this.this$0.A04.getValue();
                        int A009 = C83454Fe.A00(this.$params);
                        C22804BPs.A00(bPs, A009);
                        C28607E9y e9y = bPs.A06[A009];
                        if (e9y != null) {
                            C22804BPs.A01(bPs, e9y, dGj);
                            return C27621Wu.A00;
                        }
                        throw AnonymousClass000.A0n("No renderer can be found at given index");
                    } catch (Throwable th) {
                        bco = this.$callback;
                        r1 = new C75553hi(th);
                        bco.Btl(r1);
                        return C27621Wu.A00;
                    }
                } else {
                    StringBuilder A10 = AnonymousClass000.A10();
                    A10.append("Received invalid mask for category: ");
                    A10.append(r122.A00);
                    illegalArgumentException = AnonymousClass000.A0j(A10);
                }
            } else {
                StringBuilder A102 = AnonymousClass000.A10();
                C17890vO.A15("Expected exactly one mask, received: ", A102, list);
                illegalArgumentException = AnonymousClass000.A0j(A102);
            }
            throw illegalArgumentException;
        } catch (Throwable th2) {
            bco = this.$callback;
            r1 = new C75513he(th2);
            bco.Btl(r1);
            return C27621Wu.A00;
        }
    }
}
