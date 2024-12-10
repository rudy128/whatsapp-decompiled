package X;

import android.content.Context;
import com.facebook.cameracore.ardelivery.model.ARAssetType;
import com.facebook.cameracore.ardelivery.model.VersionedCapability;
import com.facebook.cameracore.ardelivery.modelmanager.metadataloader.ARModelMetadataDownloader;
import java.io.File;
import java.util.HashMap;
import java.util.LinkedHashMap;

/* renamed from: X.AtN  reason: case insensitive filesystem */
public final class C21835AtN extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ A4B this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C21835AtN(A4B a4b) {
        super(0);
        this.this$0 = a4b;
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [X.BVf, X.BVe, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r11v0, types: [X.9iK, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r3v4, types: [X.8Kt, java.lang.Object, X.AIa] */
    /* JADX WARNING: type inference failed for: r10v1, types: [X.8Kr, X.AIb] */
    /* JADX WARNING: type inference failed for: r11v2, types: [X.9iK, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r17v5, types: [X.E94, java.lang.Object] */
    public /* bridge */ /* synthetic */ Object invoke() {
        long j;
        C188659hm r0 = (C188659hm) ((AnonymousClass9WR) this.this$0.A01.get()).A00.get();
        if (r0.A0D == null) {
            synchronized (r0) {
                if (r0.A0D == null) {
                    Context context = r0.A02.A00;
                    ? obj = new Object();
                    obj.A01(context);
                    File A00 = obj.A00(111);
                    C21512AlL alL = new C21512AlL(C17880vN.A0e(A00, "tmp_extract"));
                    C25655Cjl cjl = r0.A03;
                    AnonymousClass00H r24 = r0.A06;
                    C183819Zs r12 = new C183819Zs((AnonymousClass9P7) C18070vi.A0E(r24), cjl);
                    r24.get();
                    r24.get();
                    long j2 = 100 << 20;
                    C20371AIc aIc = new C20371AIc((B4X) new DWK(r12, 106, j2).get());
                    r24.get();
                    r24.get();
                    C20371AIc aIc2 = new C20371AIc((B4X) new DWK(r12, 110, 1 << 20).get());
                    LinkedHashMap A13 = C17880vN.A13();
                    VersionedCapability versionedCapability = VersionedCapability.Facetracker;
                    r24.get();
                    AnonymousClass8BT.A1O(versionedCapability, A13, 25);
                    VersionedCapability versionedCapability2 = VersionedCapability.Segmentation;
                    r24.get();
                    A13.put(versionedCapability2, AnonymousClass8BV.A0b());
                    ? obj2 = new Object();
                    r24.get();
                    r24.get();
                    LinkedHashMap A132 = C17880vN.A13();
                    Long l = (Long) A13.get(versionedCapability);
                    long j3 = 100;
                    if (l != null) {
                        j = l.longValue();
                    } else {
                        j = 100;
                    }
                    B4X b4x = (B4X) new DWK(r12, 107, j << 20).get();
                    C20371AIc aIc3 = new C20371AIc(b4x);
                    C21511AlK alK = new C21511AlK(b4x);
                    VersionedCapability versionedCapability3 = VersionedCapability.Facetracker;
                    A132.put(versionedCapability3, new C20369AIa(aIc3, AnonymousClass1IX.of(versionedCapability3), obj2, alK));
                    Long l2 = (Long) A13.get(versionedCapability2);
                    if (l2 != null) {
                        j3 = l2.longValue();
                    }
                    B4X b4x2 = (B4X) new DWK(r12, AnonymousClass74N.A03, j3 << 20).get();
                    A132.put(versionedCapability2, new C20369AIa(new C20371AIc(b4x2), AnonymousClass1IX.of(versionedCapability2), obj2, new C21511AlK(b4x2)));
                    B4X b4x3 = (B4X) new DWK(r12, 109, j2).get();
                    C20371AIc aIc4 = new C20371AIc(b4x3);
                    C21511AlK alK2 = new C21511AlK(b4x3);
                    C18100vl r2 = C198909z7.A01;
                    ? aIa = new C20369AIa(aIc4, (AnonymousClass1IX) AnonymousClass3MX.A14(r2), obj2, alK2);
                    AnonymousClass1IZ it = ((AnonymousClass1IX) AnonymousClass3MX.A14(r2)).iterator();
                    while (it.hasNext()) {
                        Object next = it.next();
                        C18070vi.A0b(next);
                        A132.put(next, aIa);
                    }
                    C162438Ks r22 = new C162438Ks(aIa, A132);
                    LinkedHashMap A133 = C17880vN.A13();
                    A133.put(ARAssetType.EFFECT, aIc);
                    ARAssetType aRAssetType = ARAssetType.SUPPORT;
                    A133.put(aRAssetType, r22);
                    A133.put(ARAssetType.SCRIPTING_PACKAGE, aIc2);
                    ? aIb = new C20370AIb(A133);
                    if (!(A133.get(aRAssetType) instanceof C162438Ks)) {
                        C26294Cx6.A08("ARAssetTypeCompositeStorage", "Support storage is not properly initialized");
                    }
                    AnonymousClass9US r11 = new AnonymousClass9US(alL);
                    C20372AId aId = new C20372AId(aIb, r11, r11, r11, r11, r11, r11);
                    C71353Ey BHn = r0.A04.BHn("AR Delivery Thread", 3, true);
                    C20376AIh aIh = new C20376AIh(r0);
                    File A0e = C17880vN.A0e(A00, "tmp_download");
                    ? obj3 = new Object();
                    AnonymousClass10E r23 = r0.A00.A00.A00;
                    C187139fK r16 = new C187139fK(C108965cb.A0H(r23), AnonymousClass8BT.A0J(r23), (C220418j) r23.A9d.get(), AnonymousClass10E.AL1(r23), A0e);
                    AnonymousClass00H r25 = r0.A05;
                    A65 a65 = new A65(aIh, r16, (AnonymousClass9WS) r25.get(), obj3, (AnonymousClass9P7) r24.get());
                    A23 a23 = r0.A01;
                    C20123A8i a8i = new C20123A8i(a65, aId, a23, obj3, (AnonymousClass9P7) r24.get(), BHn, BHn, BHn);
                    C162438Ks r3 = (C162438Ks) aId.A00.A00(aRAssetType);
                    C18070vi.A0X(r3);
                    C20123A8i a8i2 = a8i;
                    A23 a232 = a23;
                    AIW aiw = new AIW(r3.A00);
                    C187129fJ r162 = new C187129fJ(new C20033A4c(a8i2, aiw, new AIX(r3), (ARModelMetadataDownloader) r0.A08.get(), a232, (AnonymousClass9P7) r24.get()), (C189859jy) r0.A09.get(), a232, (AnonymousClass9P7) r24.get(), BHn);
                    HashMap A11 = C17880vN.A11();
                    A11.put("AnimationModule", "3b739dcdda7e755cc76237c7d897006b4c1358dc");
                    A11.put("AssetsModule", "9af3fb78670fd7666028818a1730be583cb56a18");
                    A11.put("AudioModule", "36dbd1c784057d78e9c16b7b5067e924b1516a12");
                    A11.put("AvatarModule", "957560f619b094c8906cb9210ca2c5cf87695818");
                    A11.put("BlocksModule", "0af67ca21ef3a10719fddfe4d462e90609a12e57");
                    A11.put("CameraInfoModule", "5dbd5b837c94c87ed1fd17aa32434431e44701cc");
                    A11.put("CapabilitiesModule", "7eb80207d574baaa40650617c83e4686360e6c4a");
                    A11.put("ComposedMaterialDynamicInstantiation", "dd215d9e2ee0a0768a24b827176c54323fe3dfcc");
                    A11.put("CoreModule", "14f3a5d288215ff543b586b1973f919c2d64f32c");
                    A11.put("DeviceMotionModule", "50fc5a51c508a3b12f67d7e17eb8494090b16ce1");
                    A11.put("DiagnosticsModule", "076484314d9d8fc5e66ba9838085a41616492c55");
                    A11.put("FaceGesturesModule", "a2ea6ba24d0d84da2e5b15cdecc33eefa9cdf3ce");
                    A11.put("FaceSceneModule", "9f44036ae25a630de7f31f2613657849c73f1a29");
                    A11.put("FaceTrackingModule", "cfd2a3880902daa36c6efd62b0448e510266f8ea");
                    A11.put("FacialActionsModule", "6c6569cf5390d5a1069714c8abe0205a3dca7705");
                    A11.put("FontsModule", "c9f6afdec8c650f8bb122353b74da3aeebac45e4");
                    A11.put("GalleryTextureModule", "273ab023a2667cb1d8e375397cdd780063b92bff");
                    A11.put("InstructionModule", "ae57f28711c6e8c23ba51c4016a6942a27c3e685");
                    A11.put("InstructionModuleExtension", "a8df79185606b246c75c88c52b66f72830de9bfd");
                    A11.put("IrisTrackingModule", "08f35387fe2a4d29b289d31305179bdba1f8f48f");
                    A11.put("LayersModule", "c3178b1e9859e303e29f45191a9860aa4601789e");
                    A11.put("MaterialsModule", "0a7d2bd0a01b642ef25698a23c4ac31b5c2abd09");
                    A11.put("MaterialsShadersExtension", "abd7db0edd16510328327c9b37e809af371d041c");
                    A11.put("ParticleSystemModule", "777296dca0d06430c3468a25ecd7aeaf8d207c31");
                    A11.put("PatchesModule", "14911bb3ffc1c71d21eede453291f1e06213581c");
                    A11.put("PersonSegmentationModule", "214e98af74bc360dcabaf9f3ed595c8c02022203");
                    A11.put("PlanarTextModule", "71344ee57ed2961278e9aa85952d494f914c35db");
                    A11.put("PlatformEventsModule", "dabc6f84b4b97dda6eca320de409f2f0221b3bef");
                    A11.put("PrefabsModule", "6d29e38a79a04615bcd8162018d09d90c84f05a3");
                    A11.put("RandomModule", "7a45e21503cf3837a200da3011ba728759c7c912");
                    A11.put("ReactiveLogicExtension", "c95348bf6861e2d7ee307c82b5268efc71a11a97");
                    A11.put("ReactiveMathExtension", "49bde7d9d318c292b3fa394ec7d7c1af19c95103");
                    A11.put("ReactiveModule", "be2495d9c9aef8a6394920d8de3381a2b3a3e317");
                    A11.put("ReactiveUtilExtension", "2fddbec4fcaa578cba97575e5a22c326f7101c31");
                    A11.put("RuntimeModule", "ffbc9537eb12eea1f89e8671bf0ed55002365aa4");
                    A11.put("SceneModule", "19ad4efce7f9a84c8844c99319c5f8333cd455b6");
                    A11.put("SegmentationModule", "4607d5782fa05404ae42de07c5da25e26708813e");
                    A11.put("ShadersModule", "4a256ef9d8d11f1974274c1beea1672329112181");
                    A11.put("SystraceModule", "8817929726b84ffc5e9e127066d439b1bf832cd8");
                    A11.put("TextExtrusionModule", "244dc3bd215590d99c2b48564786f29fad56b6a9");
                    A11.put("TexturesModule", "d676149a5bb8fc9bbc7f9aa6412b0dac893f8e88");
                    A11.put("TimeModule", "1fb326fc980746e53c91adee08d2b4c034ad52c6");
                    A11.put("TimeModuleExtension", "4c9439cae464c3b531ac407a2e4820b6bcca05f2");
                    A11.put("TouchGesturesModule", "a67b01ce90b3b7d908ced52fd47681fdf7691155");
                    A11.put("UnitsModule", "d41439446b8b6774ff7cdbe06975ad84bb732987");
                    A11.put("VisualShadersExtension", "d92e19a0706bde9c4cf161ff9a177251187723d2");
                    A11.put("VisualTimeExtension", "f2b5ead5ff6de527007cb9363c81d503c5589c35");
                    A11.put("WorkerModule", "27cfebf44f6ed3e187f05398ceeb8d46996892a7");
                    A11.put("arfx", "0bfbe7d5dd76d30ed81335551e8ca9e83f2c1d97");
                    A11.put("arfx_polyfill", "e12262d01285f417d7ede31a47497d1471ab0f67");
                    C198439yL r18 = new C198439yL(a8i, (AnonymousClass9WQ) C18070vi.A0E(r0.A0A), (AnonymousClass9P7) C18070vi.A0E(r24), A11, BHn);
                    ? obj4 = new Object();
                    r25.get();
                    r0.A0D = new C20375AIg(a8i2, r162, obj4, r18, (C167148fU) r0.A07.get(), a23, (AnonymousClass9P7) r24.get(), BHn);
                }
            }
        }
        if (r0.A0D != null) {
            C20375AIg aIg = r0.A0D;
            if (aIg != null) {
                return aIg;
            }
            throw AnonymousClass000.A0n("Required value was null.");
        }
        throw AnonymousClass000.A0n("Required value was null.");
    }
}
