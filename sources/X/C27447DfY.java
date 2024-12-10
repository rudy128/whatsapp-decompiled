package X;

import com.facebook.cameracore.ardelivery.compression.zip.ZipDecompressor;
import com.facebook.jni.HybridData;
import com.facebook.wearable.airshield.security.Hash;
import com.facebook.wearable.airshield.security.PublicKey;
import com.facebook.wearable.airshield.security.Signature;
import com.facebook.wearable.datax.RemoteChannel;
import java.nio.ByteBuffer;

/* renamed from: X.DfY  reason: case insensitive filesystem */
public class C27447DfY extends AnonymousClass1JJ implements AnonymousClass1OS {
    public final int A00;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C27447DfY(java.lang.Object r8, int r9) {
        /*
            r7 = this;
            r0 = r7
            r7.A00 = r9
            switch(r9) {
                case 0: goto L_0x0013;
                case 1: goto L_0x001c;
                case 2: goto L_0x0025;
                case 3: goto L_0x0025;
                case 4: goto L_0x002e;
                default: goto L_0x0006;
            }
        L_0x0006:
            java.lang.Class<X.CXW> r3 = X.CXW.class
            java.lang.String r5 = "onTimingReceived(Lcom/whatsapp/voicetranscription/PhaseId;D)V"
            r6 = 0
            r1 = 2
            java.lang.String r4 = "onTimingReceived"
        L_0x000e:
            r2 = r8
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
        L_0x0013:
            java.lang.Class<X.CuL> r3 = X.C26193CuL.class
            java.lang.String r5 = "parseServiceMessage(Lcom/facebook/wearable/datax/RemoteChannel;Lcom/facebook/wearable/datax/TypedBuffer;)V"
            r6 = 0
            r1 = 2
            java.lang.String r4 = "parseServiceMessage"
            goto L_0x000e
        L_0x001c:
            java.lang.Class<X.CvH> r3 = X.C26226CvH.class
            java.lang.String r5 = "handleMediaStreamErrorEvent$fbandroid_java_com_facebook_wearable_mediastream_controller_wa_controller_mbed(Lcom/facebook/wearable/mediastream/api/errors/MediaStreamErrorEvent;Lcom/facebook/wearable/mediastream/api/errors/DebugInfo;)V"
            r6 = 0
            r1 = 2
            java.lang.String r4 = "handleMediaStreamErrorEvent"
            goto L_0x000e
        L_0x0025:
            java.lang.Class<X.CtE> r3 = X.C26149CtE.class
            java.lang.String r5 = "send(Ljava/nio/ByteBuffer;Ljava/nio/ByteBuffer;)Lcom/facebook/wearable/datax/Error;"
            r6 = 0
            r1 = 2
            java.lang.String r4 = "send"
            goto L_0x000e
        L_0x002e:
            java.lang.Class<X.CkM> r3 = X.C25691CkM.class
            java.lang.String r5 = "handleMessage(Lcom/facebook/wearable/datax/RemoteChannel;Lcom/facebook/wearable/datax/TypedBuffer;)V"
            r6 = 0
            r1 = 2
            java.lang.String r4 = "handleMessage"
            goto L_0x000e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C27447DfY.<init>(java.lang.Object, int):void");
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        C22870BTe bTe;
        switch (this.A00) {
            case 0:
                RemoteChannel remoteChannel = (RemoteChannel) obj;
                C25527ChP chP = (C25527ChP) obj2;
                C18070vi.A0h(remoteChannel, chP);
                C26193CuL cuL = (C26193CuL) this.receiver;
                C26193CuL.A01(cuL, new C27843Dme(cuL, remoteChannel, chP));
                break;
            case 1:
                C24474C5p c5p = (C24474C5p) obj;
                ((C26226CvH) AnonymousClass3Ma.A0z(c5p, this)).A0C((C22874BTj) obj2, c5p);
                break;
            case 4:
                RemoteChannel remoteChannel2 = (RemoteChannel) obj;
                C25527ChP chP2 = (C25527ChP) obj2;
                boolean A15 = C18070vi.A15(remoteChannel2, chP2);
                C25691CkM ckM = (C25691CkM) this.receiver;
                ByteBuffer byteBuffer = chP2.A00;
                if (byteBuffer != null) {
                    Hash hash = ckM.A00;
                    if (hash != null) {
                        int i = chP2.A01;
                        if (i != C13.ENABLE_TRUST.BVW()) {
                            C26294Cx6.A0B("lam:LinkAuthentication", AnonymousClass001.A1I("Unknown message type ", AnonymousClass000.A10(), i), (Throwable) null);
                            break;
                        } else {
                            C164258Yd r7 = (C164258Yd) C23577Bm6.A06(C164258Yd.DEFAULT_INSTANCE, byteBuffer);
                            CAW caw = Hash.Companion;
                            PublicKey publicKey = ckM.A03;
                            byte[] serialize = publicKey.serialize();
                            C18070vi.A0d(serialize, A15 ? 1 : 0);
                            Hash hash2 = new Hash((HybridData) null);
                            hash2.hashBytes(serialize);
                            byte[] A1P = AnonymousClass8BS.A1P(r7.identifier_);
                            Hash hash3 = new Hash((HybridData) null);
                            hash3.setRaw(A1P);
                            if (hash2.equals(hash3)) {
                                C24582CAd cAd = Signature.Companion;
                                byte[] A1P2 = AnonymousClass8BS.A1P(r7.signature_);
                                Signature signature = new Signature((HybridData) null);
                                signature.setRaw(A1P2);
                                if (publicKey.verifySignature(hash, signature)) {
                                    remoteChannel2.send(new C25792Cm4(ZipDecompressor.UNZIP_BUFFER_SIZE));
                                    C25691CkM.A00(ckM, new C27560DhR(ckM));
                                    break;
                                } else {
                                    C26294Cx6.A09("lam:LinkAuthentication", "Enable trust failed, invalid signature", (Throwable) null);
                                    bTe = C22870BTe.A03;
                                }
                            } else {
                                C26294Cx6.A09("lam:LinkAuthentication", "Enable trust failed, identity mismatch", (Throwable) null);
                                bTe = C22870BTe.A02;
                            }
                            remoteChannel2.send(new C25792Cm4(bTe.A00));
                            break;
                        }
                    } else {
                        C26294Cx6.A09("lam:LinkAuthentication", "No rx challenge! Cannot authenticate.", (Throwable) null);
                        ckM.A08.invoke(new C24202BxE(C25792Cm4.A03));
                        break;
                    }
                }
                break;
            case 5:
                C24338BzZ bzZ = (C24338BzZ) obj;
                double A002 = AnonymousClass8BR.A00(obj2);
                CXW cxw = (CXW) AnonymousClass3Ma.A0z(bzZ, this);
                int ordinal = bzZ.ordinal();
                double d = 0.0d;
                if (ordinal != 2) {
                    if (ordinal == 3) {
                        Double d2 = cxw.A00;
                        if (d2 != null) {
                            d = d2.doubleValue();
                        }
                        cxw.A00 = Double.valueOf(d + A002);
                        break;
                    }
                } else {
                    Double d3 = cxw.A01;
                    if (d3 != null) {
                        d = d3.doubleValue();
                    }
                    cxw.A01 = Double.valueOf(d + A002);
                    break;
                }
                break;
            default:
                ByteBuffer byteBuffer2 = (ByteBuffer) obj;
                ByteBuffer byteBuffer3 = (ByteBuffer) obj2;
                boolean A152 = C18070vi.A15(byteBuffer2, byteBuffer3);
                C26149CtE ctE = (C26149CtE) this.receiver;
                CRX crx = ctE.A08;
                if (crx.A03.get() == Thread.currentThread().getId()) {
                    C25792Cm4 A003 = C26149CtE.A00(ctE, byteBuffer2, A152);
                    if (C18070vi.A18(A003, C25792Cm4.A08)) {
                        return C26149CtE.A00(ctE, byteBuffer3, !AnonymousClass000.A1R(crx.A02.get()));
                    }
                    return A003;
                } else if (!ctE.A0D.get()) {
                    return C25792Cm4.A07;
                } else {
                    C25204Cax cax = ctE.A07;
                    C27081DTg dTg = new C27081DTg(ctE, cax.A01(byteBuffer2), cax.A01(byteBuffer3), 31);
                    crx.A02.incrementAndGet();
                    C27076DTa.A01(dTg, crx, crx.A01, 39);
                    return C25792Cm4.A08;
                }
        }
        return C27621Wu.A00;
    }
}
