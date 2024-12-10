package X;

import android.content.Context;
import android.os.Handler;
import com.facebook.cameracore.ardelivery.model.ARAssetType;
import com.facebook.cameracore.ardelivery.model.ARRequestAsset$CompressionMethod;
import com.facebook.cameracore.ardelivery.model.EffectAssetType;
import com.facebook.cameracore.ardelivery.model.VersionedCapability;
import com.facebook.quicklog.reliability.UserFlowJNIProvider;
import com.facebook.quicklog.reliability.UserFlowLogger;
import com.whatsapp.SecondaryProcessAbstractAppShellDelegate;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.UUID;

/* renamed from: X.9so  reason: invalid class name and case insensitive filesystem */
public final class C195109so {
    public final Context A00;
    public final EA4 A01;
    public final C18030ve A02;
    public final AnonymousClass00H A03;
    public final C18100vl A04 = AnonymousClass1DF.A00(AnonymousClass00R.A0C, new C21838AtQ(this));

    public C195109so(Context context, EA4 ea4, C65312wC r5, C18030ve r6, AnonymousClass00H r7) {
        C18070vi.A0d(r5, 1);
        C18070vi.A0p(r6, r7, context);
        C18070vi.A0d(ea4, 5);
        this.A02 = r6;
        this.A03 = r7;
        this.A00 = context;
        this.A01 = ea4;
        C25921Cof.A00 = true;
        AnonymousClass9TA.A00 = r5;
        UserFlowJNIProvider.setUserFlowLogger((UserFlowLogger) r5.A02.getValue());
    }

    public final void A00(C107855aj r40, BCO bco, C92384hD r42) {
        Integer num;
        String str;
        C107855aj r7 = r40;
        BCO bco2 = bco;
        C92384hD r8 = r42;
        if (r7 instanceof AM8) {
            AM8 am8 = (AM8) r7;
            A4B a4b = (A4B) this.A03.get();
            B1X b1x = new B1X(this, am8, bco2, r8);
            synchronized (a4b) {
                C18070vi.A0d(am8, 0);
                A4B.A01(a4b, C83454Fe.A00(r8));
                UUID randomUUID = UUID.randomUUID();
                AM9 am9 = am8.A01;
                String str2 = am9.A05.A00;
                String str3 = am9.A06;
                String str4 = am9.A0A;
                String str5 = am9.A08;
                String str6 = am9.A09;
                long j = (long) am9.A00;
                ARRequestAsset$CompressionMethod aRRequestAsset$CompressionMethod = am9.A02;
                List list = am9.A0B;
                String str7 = am9.A07;
                boolean z = am9.A0E;
                ARRequestAsset$CompressionMethod aRRequestAsset$CompressionMethod2 = aRRequestAsset$CompressionMethod;
                C20282AEq aEq = new C20282AEq(ARAssetType.EFFECT, aRRequestAsset$CompressionMethod2, EffectAssetType.NORMAL_EFFECT, (AnonymousClass9JJ) null, (VersionedCapability) null, AnonymousClass00R.A00, "", "", str2, str3, str4, str5, str6, str3, str7, list, -1, j, (long) am9.A01, z);
                String str8 = r8.A04;
                C191249mG r4 = new C191249mG();
                r4.A03 = str8;
                r4.A02 = SecondaryProcessAbstractAppShellDelegate.COMPRESSED_WHATSAPP_LIB_NAME;
                A4D A002 = r4.A00();
                AIQ aiq = new AIQ(a4b, b1x, randomUUID, bco2, r8, 1);
                LinkedHashMap linkedHashMap = a4b.A02;
                Integer valueOf = Integer.valueOf(C83454Fe.A00(r8));
                C18070vi.A0b(randomUUID);
                linkedHashMap.put(valueOf, new C193309ps(new C21368Aix(a4b, A002, aEq, aiq, 30), randomUUID));
                if (a4b.A00 == null) {
                    A4B.A00(a4b);
                }
            }
        } else if (r7 instanceof C92344h9) {
            C92344h9 r72 = (C92344h9) r7;
            C18030ve r2 = this.A02;
            C18070vi.A0d(r72, 0);
            AnonymousClass9WT r43 = new AnonymousClass9WT(bco2);
            float A0E = r2.A0E(9533);
            float f = 1.0f;
            if (r72.A01.A01.intValue() != 0) {
                num = AnonymousClass00R.A00;
            } else {
                num = AnonymousClass00R.A01;
            }
            Float valueOf2 = Float.valueOf(A0E);
            Float f2 = r8.A03;
            if (f2 != null) {
                f = f2.floatValue();
            }
            if (num.intValue() != 0) {
                str = "FastRetouchingFilter";
            } else {
                str = "LowLightFastFilter";
            }
            D4C d4c = new D4C(AnonymousClass00R.A0N, AnonymousClass00R.A0C, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, false);
            float[] fArr = AnonymousClass9T3.A00;
            float[] fArr2 = new float[16];
            System.arraycopy(fArr, 0, fArr2, 0, 16);
            float[] fArr3 = new float[16];
            System.arraycopy(fArr, 0, fArr3, 0, 16);
            D3R d3r = new D3R(new C26558D3y(AnonymousClass8BR.A17(), AnonymousClass8BR.A17(), AnonymousClass8BR.A17(), AnonymousClass8BR.A17(), AnonymousClass8BR.A17(), AnonymousClass8BR.A17(), AnonymousClass8BR.A17(), AnonymousClass8BR.A17()), d4c, str, fArr2, fArr3, true);
            C8N.A00(d3r, f);
            if (num == AnonymousClass00R.A00 && valueOf2 != null) {
                d3r.A01.A03.put("cutoff", valueOf2);
            }
            C26851DGi dGi = new C26851DGi(d3r, r43);
            bco2.Bx4(C17890vO.A0Q(), (String) null);
            try {
                C18100vl r3 = this.A04;
                ((C22804BPs) r3.getValue()).A0F(C83454Fe.A00(r8), false);
                C22804BPs bPs = (C22804BPs) r3.getValue();
                int A003 = C83454Fe.A00(r8);
                C22804BPs.A00(bPs, A003);
                C28607E9y e9y = bPs.A06[A003];
                if (e9y != null) {
                    C22804BPs.A01(bPs, e9y, dGi);
                    return;
                }
                throw AnonymousClass000.A0n("No renderer can be found at given index");
            } catch (Throwable th) {
                bco2.Btl(new C75553hi(th));
            }
        }
    }

    public final void A01(C92374hC r6) {
        Handler handler;
        C22804BPs bPs = (C22804BPs) this.A04.getValue();
        float f = r6.A00;
        int A002 = C83454Fe.A00(r6);
        C22804BPs.A00(bPs, A002);
        C28607E9y e9y = bPs.A06[A002];
        if (e9y == null) {
            throw AnonymousClass000.A0n("No renderer can be found at given index");
        } else if (e9y instanceof BVr) {
            C146477Pg r1 = new C146477Pg(e9y, f, 0);
            DDv dDv = bPs.A00;
            if (dDv == null || (handler = dDv.A02) == null) {
                r1.run();
            } else {
                handler.post(r1);
            }
        } else {
            throw new C122776Rw("Strength updating is not supported for AR effects yet");
        }
    }

    public final void A02(C92364hB r5) {
        C28560E7m dGi;
        A4B.A01((A4B) this.A03.get(), C83454Fe.A00(r5));
        C22804BPs bPs = (C22804BPs) this.A04.getValue();
        int A002 = C83454Fe.A00(r5);
        C22804BPs.A00(bPs, A002);
        C28607E9y e9y = bPs.A06[A002];
        if (e9y != null) {
            if (e9y instanceof DGT) {
                dGi = new C26852DGj((C191959nT) null, (C6W) null);
            } else if (e9y instanceof BVr) {
                dGi = new C26851DGi((D3R) null, (AnonymousClass9WT) null);
            } else {
                return;
            }
            C22804BPs.A01(bPs, e9y, dGi);
        }
    }
}
