package X;

import java.util.Iterator;
import java.util.Map;

/* renamed from: X.DfX  reason: case insensitive filesystem */
public class C27446DfX extends AnonymousClass1JJ implements C22821Di {
    public final int A00;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C27446DfX(java.lang.Object r8, int r9) {
        /*
            r7 = this;
            r0 = r7
            r7.A00 = r9
            switch(r9) {
                case 0: goto L_0x0013;
                case 1: goto L_0x001c;
                case 2: goto L_0x0025;
                case 3: goto L_0x002e;
                case 4: goto L_0x0037;
                case 5: goto L_0x0040;
                case 6: goto L_0x0049;
                case 7: goto L_0x0052;
                case 8: goto L_0x005b;
                case 9: goto L_0x0064;
                case 10: goto L_0x006d;
                case 11: goto L_0x0076;
                case 12: goto L_0x007f;
                case 13: goto L_0x0088;
                case 14: goto L_0x007f;
                case 15: goto L_0x0092;
                case 16: goto L_0x007f;
                case 17: goto L_0x007f;
                case 18: goto L_0x009c;
                case 19: goto L_0x00a6;
                default: goto L_0x0006;
            }
        L_0x0006:
            java.lang.Class<X.ClJ> r3 = X.C25749ClJ.class
            java.lang.String r5 = "isFeatureReady(Lcom/whatsapp/ml/v2/MLModelType;)Z"
            r6 = 0
            r1 = 1
            java.lang.String r4 = "isFeatureReady"
        L_0x000e:
            r2 = r8
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
        L_0x0013:
            java.lang.Class<X.Cit> r3 = X.C25613Cit.class
            java.lang.String r5 = "report(Lcom/bloks/foa/screen/tracker/NavigationEvent;)V"
            r6 = 0
            r1 = 1
            java.lang.String r4 = "report"
            goto L_0x000e
        L_0x001c:
            java.lang.Class<com.facebook.ale.native.ResponseCallback> r3 = com.facebook.ale.p000native.ResponseCallback.class
            java.lang.String r5 = "onSuccessfullCdnDownload(Ljava/nio/ByteBuffer;)V"
            r6 = 0
            r1 = 1
            java.lang.String r4 = "onSuccessfullCdnDownload"
            goto L_0x000e
        L_0x0025:
            java.lang.Class<com.facebook.ale.native.ResponseCallback> r3 = com.facebook.ale.p000native.ResponseCallback.class
            java.lang.String r5 = "onFailure(Ljava/lang/String;)V"
            r6 = 0
            r1 = 1
            java.lang.String r4 = "onFailure"
            goto L_0x000e
        L_0x002e:
            java.lang.Class<X.CuL> r3 = X.C26193CuL.class
            java.lang.String r5 = "parseChannelMessage(Lcom/facebook/wearable/datax/TypedBuffer;)V"
            r6 = 0
            r1 = 1
            java.lang.String r4 = "parseChannelMessage"
            goto L_0x000e
        L_0x0037:
            java.lang.Class<X.CAg> r3 = X.C24585CAg.class
            java.lang.String r5 = "deallocateNative(J)V"
            r6 = 0
            r1 = 1
            java.lang.String r4 = "deallocateNative"
            goto L_0x000e
        L_0x0040:
            java.lang.Class<X.CAi> r3 = X.C24587CAi.class
            java.lang.String r5 = "deallocateNative(J)V"
            r6 = 0
            r1 = 1
            java.lang.String r4 = "deallocateNative"
            goto L_0x000e
        L_0x0049:
            java.lang.Class<X.CAj> r3 = X.C24588CAj.class
            java.lang.String r5 = "deallocateNative(J)V"
            r6 = 0
            r1 = 1
            java.lang.String r4 = "deallocateNative"
            goto L_0x000e
        L_0x0052:
            java.lang.Class<X.BXJ> r3 = X.BXJ.class
            java.lang.String r5 = "handleDevicesDiscovered(Ljava/util/List;)V"
            r6 = 0
            r1 = 1
            java.lang.String r4 = "handleDevicesDiscovered"
            goto L_0x000e
        L_0x005b:
            java.lang.Class<X.CLA> r3 = X.CLA.class
            java.lang.String r5 = "handleMediaStreamLifecycleEvent(Lcom/facebook/wearable/mediastream/api/MediaStreamLifecycleEvent;)V"
            r6 = 0
            r1 = 1
            java.lang.String r4 = "handleMediaStreamLifecycleEvent"
            goto L_0x000e
        L_0x0064:
            java.lang.Class<X.CLB> r3 = X.CLB.class
            java.lang.String r5 = "handleMediaStreamSupEvent(Lcom/facebook/wearable/mediastream/api/MediaStreamSupEvent;)V"
            r6 = 0
            r1 = 1
            java.lang.String r4 = "handleMediaStreamSupEvent"
            goto L_0x000e
        L_0x006d:
            java.lang.Class<X.CvH> r3 = X.C26226CvH.class
            java.lang.String r5 = "handleHardwareStatusEvent(I)V"
            r6 = 0
            r1 = 1
            java.lang.String r4 = "handleHardwareStatusEvent"
            goto L_0x000e
        L_0x0076:
            java.lang.Class<X.Csp> r3 = X.C26127Csp.class
            java.lang.String r5 = "handleLinkSwitchStateEvent(Lcom/facebook/wearable/connectivity/linkmanager/api/LinkSwitchStateEvent;)V"
            r6 = 0
            r1 = 1
            java.lang.String r4 = "handleLinkSwitchStateEvent"
            goto L_0x000e
        L_0x007f:
            java.lang.Class<X.Csp> r3 = X.C26127Csp.class
            java.lang.String r5 = "handleLinkFailure(Ljava/lang/Throwable;)V"
            r6 = 0
            r1 = 1
            java.lang.String r4 = "handleLinkFailure"
            goto L_0x000e
        L_0x0088:
            java.lang.Class<X.Csp> r3 = X.C26127Csp.class
            java.lang.String r5 = "handleLinkEncrypted(Lcom/facebook/wearable/connectivity/security/linksetup/Challenges;)V"
            r6 = 0
            r1 = 1
            java.lang.String r4 = "handleLinkEncrypted"
            goto L_0x000e
        L_0x0092:
            java.lang.Class<X.Csp> r3 = X.C26127Csp.class
            java.lang.String r5 = "handleLinkReceived(Lcom/facebook/wearable/connectivity/iolinks/IOLinkPipeline$ReceiveContext;)V"
            r6 = 0
            r1 = 1
            java.lang.String r4 = "handleLinkReceived"
            goto L_0x000e
        L_0x009c:
            java.lang.Class<X.Csp> r3 = X.C26127Csp.class
            java.lang.String r5 = "setupPreambleOnReceived(Lcom/facebook/wearable/connectivity/iolinks/IOLinkPipeline$ReceiveContext;)V"
            r6 = 0
            r1 = 1
            java.lang.String r4 = "setupPreambleOnReceived"
            goto L_0x000e
        L_0x00a6:
            java.lang.Class<X.CkM> r3 = X.C25691CkM.class
            java.lang.String r5 = "handleError(Lcom/facebook/wearable/datax/ProtocolException;)V"
            r6 = 0
            r1 = 1
            java.lang.String r4 = "handleError"
            goto L_0x000e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C27446DfX.<init>(java.lang.Object, int):void");
    }

    /* JADX WARNING: type inference failed for: r5v9, types: [X.BTC, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x0324, code lost:
        r1.A01("sup:MediaStreamController", r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0066, code lost:
        if (r0 == false) goto L_0x0068;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:330:0x06f9, code lost:
        if (r1 == 4) goto L_0x06fb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:355:0x078b, code lost:
        if (r1 == 4) goto L_0x078d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0142, code lost:
        r15.A01.add(r0.A00());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x014d, code lost:
        X.C18070vi.A11("received");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0153, code lost:
        throw null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:593:0x0b5e, code lost:
        if (r0 != false) goto L_0x0b60;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:595:0x0b62, code lost:
        if (r1 != null) goto L_0x09de;
     */
    /* JADX WARNING: Removed duplicated region for block: B:225:0x0559  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r15) {
        /*
            r14 = this;
            int r0 = r14.A00
            switch(r0) {
                case 0: goto L_0x0cb9;
                case 1: goto L_0x0cad;
                case 2: goto L_0x0ca1;
                case 3: goto L_0x0c90;
                case 4: goto L_0x0019;
                case 5: goto L_0x0010;
                case 6: goto L_0x0007;
                case 7: goto L_0x0c28;
                case 8: goto L_0x06b1;
                case 9: goto L_0x0331;
                case 10: goto L_0x0267;
                case 11: goto L_0x0231;
                case 12: goto L_0x021f;
                case 13: goto L_0x0154;
                case 14: goto L_0x021f;
                case 15: goto L_0x0126;
                case 16: goto L_0x021f;
                case 17: goto L_0x021f;
                case 18: goto L_0x00c5;
                case 19: goto L_0x0073;
                case 20: goto L_0x0022;
                default: goto L_0x0005;
            }
        L_0x0005:
            r0 = 0
            return r0
        L_0x0007:
            long r0 = X.C17880vN.A05(r15)
            com.facebook.wearable.datax.RemoteChannel.deallocateNative(r0)
            goto L_0x0cc4
        L_0x0010:
            long r0 = X.C17880vN.A05(r15)
            com.facebook.wearable.datax.LocalChannel.deallocateNative(r0)
            goto L_0x0cc4
        L_0x0019:
            long r0 = X.C17880vN.A05(r15)
            com.facebook.wearable.datax.Connection.deallocateNative(r0)
            goto L_0x0cc4
        L_0x0022:
            X.6Rq r15 = (X.C122716Rq) r15
            r4 = 0
            X.C18070vi.A0d(r15, r4)
            java.lang.Object r3 = r14.receiver
            X.ClJ r3 = (X.C25749ClJ) r3
            int r2 = r15.ordinal()
            r1 = 1
            X.00H r0 = r3.A05
            java.lang.Object r0 = r0.get()
            X.73b r0 = (X.C1407873b) r0
            if (r2 != r4) goto L_0x006e
            boolean r0 = r0.A08(r15)
            if (r0 == 0) goto L_0x0068
            X.00H r0 = r3.A02
            java.lang.Object r0 = r0.get()
            X.195 r0 = (X.AnonymousClass195) r0
            boolean r0 = r0.A00
            if (r0 != 0) goto L_0x0069
            X.00H r0 = r3.A07
            X.4a3 r0 = X.AnonymousClass3MX.A0y(r0)
            X.0ve r2 = r0.A01
            r0 = 2890(0xb4a, float:4.05E-42)
            X.0vf r1 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r1, r2, r0)
            if (r0 == 0) goto L_0x0068
            r0 = 11344(0x2c50, float:1.5896E-41)
            boolean r0 = X.C18020vd.A05(r1, r2, r0)
            r1 = 1
            if (r0 != 0) goto L_0x0069
        L_0x0068:
            r1 = 0
        L_0x0069:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            return r0
        L_0x006e:
            boolean r1 = r0.A08(r15)
            goto L_0x0069
        L_0x0073:
            X.BxE r15 = (X.C24202BxE) r15
            java.lang.Object r4 = X.AnonymousClass3Ma.A0z(r15, r14)
            X.CkM r4 = (X.C25691CkM) r4
            X.Cm4 r0 = r15.error
            int r2 = r0.A00
            java.util.List r0 = X.C22870BTe.A05
            java.util.Iterator r1 = r0.iterator()
        L_0x0085:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x00a8
            java.lang.Object r3 = r1.next()
            r0 = r3
            X.BTe r0 = (X.C22870BTe) r0
            int r0 = r0.A00
            if (r0 != r2) goto L_0x0085
        L_0x0096:
            X.BTe r0 = X.C22870BTe.A04
            boolean r0 = X.C18070vi.A18(r3, r0)
            if (r0 == 0) goto L_0x00aa
            X.DhQ r0 = new X.DhQ
            r0.<init>(r4)
            X.C25691CkM.A00(r4, r0)
            goto L_0x0cc4
        L_0x00a8:
            r3 = 0
            goto L_0x0096
        L_0x00aa:
            java.lang.String r2 = "lam:LinkAuthentication"
            if (r3 != 0) goto L_0x00ba
            java.lang.String r0 = "Failed to authenticate, received unknown error"
        L_0x00b0:
            X.C26294Cx6.A0A(r2, r0, r15)
            X.1Di r0 = r4.A08
            r0.invoke(r15)
            goto L_0x0cc4
        L_0x00ba:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "Failed to authenticate with error: "
            java.lang.String r0 = X.AnonymousClass001.A1E(r3, r0, r1)
            goto L_0x00b0
        L_0x00c5:
            X.CPt r15 = (X.C24922CPt) r15
            java.lang.Object r2 = X.AnonymousClass3Ma.A0z(r15, r14)
            X.Csp r2 = (X.C26127Csp) r2
            com.facebook.wearable.datax.Connection r5 = r2.A08
            java.nio.ByteBuffer r0 = r15.A00
            if (r0 == 0) goto L_0x014d
            X.Cm4 r1 = r5.onReceivedWithInterrupt(r0)
            X.Cm4 r0 = X.C24708CGu.A00
            boolean r0 = X.C18070vi.A18(r1, r0)
            if (r0 == 0) goto L_0x011b
            X.CtE r0 = r15.A02
            X.CL5 r1 = r0.A03()
            X.CuL r4 = r2.A02
            if (r4 == 0) goto L_0x0cc4
            if (r1 == 0) goto L_0x0115
            X.CVn r0 = r1.A00
            X.1JD r3 = r0.A00
        L_0x00ef:
            X.1JD r2 = new X.1JD
            r2.<init>()
            X.CVI r0 = r5.receiveFragment
            java.nio.ByteBuffer r0 = r0.A00()
            r2.add(r0)
            if (r1 == 0) goto L_0x0106
            X.CVn r0 = r1.A00
            X.1JD r0 = r0.A01
            r2.addAll(r0)
        L_0x0106:
            X.CVn r1 = new X.CVn
            r1.<init>(r3, r2)
            X.Dol r0 = new X.Dol
            r0.<init>(r1)
            X.C26193CuL.A03(r4, r0)
            goto L_0x0cc4
        L_0x0115:
            X.1JD r3 = new X.1JD
            r3.<init>()
            goto L_0x00ef
        L_0x011b:
            X.Cm4 r0 = X.C24708CGu.A01
            boolean r0 = X.C18070vi.A18(r1, r0)
            if (r0 == 0) goto L_0x0cc4
            X.CVI r0 = r5.receiveFragment
            goto L_0x0142
        L_0x0126:
            X.CPt r15 = (X.C24922CPt) r15
            java.lang.Object r0 = X.AnonymousClass3Ma.A0z(r15, r14)
            X.Csp r0 = (X.C26127Csp) r0
            com.facebook.wearable.datax.Connection r2 = r0.A07
            java.nio.ByteBuffer r0 = r15.A00
            if (r0 == 0) goto L_0x014d
            X.Cm4 r1 = r2.onReceivedWithInterrupt(r0)
            X.Cm4 r0 = X.C24708CGu.A01
            boolean r0 = X.C18070vi.A18(r1, r0)
            if (r0 == 0) goto L_0x0cc4
            X.CVI r0 = r2.receiveFragment
        L_0x0142:
            java.nio.ByteBuffer r1 = r0.A00()
            X.1JD r0 = r15.A01
            r0.add(r1)
            goto L_0x0cc4
        L_0x014d:
            java.lang.String r0 = "received"
            X.C18070vi.A11(r0)
            r0 = 0
            throw r0
        L_0x0154:
            X.BTT r15 = (X.BTT) r15
            java.lang.Object r3 = X.AnonymousClass3Ma.A0z(r15, r14)
            X.Csp r3 = (X.C26127Csp) r3
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "Link encrypted "
            r1.append(r0)
            java.util.UUID r0 = r3.A0B
            java.lang.String r1 = X.C17890vO.A0V(r0, r1)
            java.lang.String r0 = "lam:LinkedDevice"
            X.C26294Cx6.A06(r0, r1)
            X.CkM r2 = r3.A03
            if (r2 == 0) goto L_0x0183
            com.facebook.wearable.airshield.security.Hash r1 = r15.A00
            com.facebook.wearable.airshield.security.Hash r0 = r15.A01
            r2.A00 = r1
            r2.A01 = r0
            com.facebook.wearable.datax.Connection r1 = r2.A04
            com.facebook.wearable.datax.Service r0 = r2.A06
            r1.register(r0)
        L_0x0183:
            X.CkM r4 = r3.A03
            if (r4 == 0) goto L_0x0cc4
            com.facebook.wearable.airshield.security.Hash r6 = r4.A01     // Catch:{ all -> 0x0217 }
            if (r6 != 0) goto L_0x01a1
            java.lang.String r2 = "lam:LinkAuthentication"
            java.lang.String r1 = "No tx challenge! Cannot authenticate"
            r0 = 0
            X.C26294Cx6.A09(r2, r1, r0)     // Catch:{ all -> 0x0217 }
            X.1Di r2 = r4.A08     // Catch:{ all -> 0x0217 }
            X.Cm4 r1 = X.C25792Cm4.A03     // Catch:{ all -> 0x0217 }
            X.BxE r0 = new X.BxE     // Catch:{ all -> 0x0217 }
            r0.<init>(r1)     // Catch:{ all -> 0x0217 }
            r2.invoke(r0)     // Catch:{ all -> 0x0217 }
            goto L_0x0cc4
        L_0x01a1:
            X.CAW r0 = com.facebook.wearable.airshield.security.Hash.Companion     // Catch:{ all -> 0x0217 }
            com.facebook.wearable.airshield.security.PrivateKey r3 = r4.A02     // Catch:{ all -> 0x0217 }
            com.facebook.wearable.airshield.security.PublicKey r0 = r3.recoverPublicKey()     // Catch:{ all -> 0x0217 }
            byte[] r2 = r0.serialize()     // Catch:{ all -> 0x0217 }
            r5 = 0
            X.C18070vi.A0d(r2, r5)     // Catch:{ all -> 0x0217 }
            r1 = 0
            com.facebook.wearable.airshield.security.Hash r0 = new com.facebook.wearable.airshield.security.Hash     // Catch:{ all -> 0x0217 }
            r0.<init>(r1)     // Catch:{ all -> 0x0217 }
            r0.hashBytes(r2)     // Catch:{ all -> 0x0217 }
            byte[] r1 = r0.toByteArray()     // Catch:{ all -> 0x0217 }
            com.facebook.wearable.airshield.security.Signature r0 = r3.sign(r6)     // Catch:{ all -> 0x0217 }
            byte[] r3 = r0.toByteArray()     // Catch:{ all -> 0x0217 }
            X.8Yd r0 = X.C164258Yd.DEFAULT_INSTANCE     // Catch:{ all -> 0x0217 }
            X.Bmt r2 = r0.A0N()     // Catch:{ all -> 0x0217 }
            X.8RY r2 = (X.AnonymousClass8RY) r2     // Catch:{ all -> 0x0217 }
            X.E67 r0 = X.DSQ.A01     // Catch:{ all -> 0x0217 }
            int r0 = r1.length     // Catch:{ all -> 0x0217 }
            X.BmB r1 = X.DSQ.A01(r1, r5, r0)     // Catch:{ all -> 0x0217 }
            X.Bm6 r0 = X.C17880vN.A0G(r2)     // Catch:{ all -> 0x0217 }
            X.8Yd r0 = (X.C164258Yd) r0     // Catch:{ all -> 0x0217 }
            r0.identifier_ = r1     // Catch:{ all -> 0x0217 }
            int r0 = r3.length     // Catch:{ all -> 0x0217 }
            X.BmB r1 = X.DSQ.A01(r3, r5, r0)     // Catch:{ all -> 0x0217 }
            X.Bm6 r0 = X.C17880vN.A0G(r2)     // Catch:{ all -> 0x0217 }
            X.8Yd r0 = (X.C164258Yd) r0     // Catch:{ all -> 0x0217 }
            r0.signature_ = r1     // Catch:{ all -> 0x0217 }
            X.Bm6 r1 = r2.A0C()     // Catch:{ all -> 0x0217 }
            r0 = 0
            int r0 = r1.A0J(r0)     // Catch:{ all -> 0x0217 }
            java.nio.ByteBuffer r3 = java.nio.ByteBuffer.allocateDirect(r0)     // Catch:{ all -> 0x0217 }
            X.C18070vi.A0b(r3)     // Catch:{ all -> 0x0217 }
            X.Bxe r0 = new X.Bxe     // Catch:{ all -> 0x0217 }
            r0.<init>(r3)     // Catch:{ all -> 0x0217 }
            r1.writeTo(r0)     // Catch:{ all -> 0x0217 }
            r3.flip()     // Catch:{ all -> 0x0217 }
            com.facebook.wearable.datax.LocalChannel r2 = r4.A05     // Catch:{ all -> 0x0217 }
            X.C13 r0 = X.C13.ENABLE_TRUST     // Catch:{ all -> 0x0217 }
            int r1 = r0.BVW()     // Catch:{ all -> 0x0217 }
            X.ChP r0 = new X.ChP     // Catch:{ all -> 0x0217 }
            r0.<init>((int) r1, (java.nio.ByteBuffer) r3)     // Catch:{ all -> 0x0217 }
            r2.send(r0)     // Catch:{ all -> 0x0217 }
            goto L_0x0cc4
        L_0x0217:
            r1 = move-exception
            X.1IU r0 = new X.1IU
            r0.<init>(r1)
            goto L_0x0cc4
        L_0x021f:
            java.lang.Throwable r15 = (java.lang.Throwable) r15
            java.lang.Object r1 = X.AnonymousClass3Ma.A0z(r15, r14)
            X.Csp r1 = (X.C26127Csp) r1
            X.Dm3 r0 = new X.Dm3
            r0.<init>(r1, r15)
            X.C26127Csp.A02(r1, r0)
            goto L_0x0cc4
        L_0x0231:
            java.lang.Object r3 = X.AnonymousClass3Ma.A0z(r15, r14)
            X.Csp r3 = (X.C26127Csp) r3
            boolean r0 = r15 instanceof X.BWI
            java.lang.String r2 = "lam:LinkedDevice"
            if (r0 == 0) goto L_0x0251
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "Link switch started "
        L_0x0243:
            r1.append(r0)
            java.util.UUID r0 = r3.A0B
            java.lang.String r0 = X.C17890vO.A0V(r0, r1)
            X.C26294Cx6.A06(r2, r0)
            goto L_0x0cc4
        L_0x0251:
            boolean r0 = r15 instanceof X.BWH
            if (r0 == 0) goto L_0x025c
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "Link switch output switched "
            goto L_0x0243
        L_0x025c:
            boolean r0 = r15 instanceof X.BWG
            if (r0 == 0) goto L_0x0cc4
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "Link switch input switched "
            goto L_0x0243
        L_0x0267:
            int r2 = X.AnonymousClass000.A0M(r15)
            java.lang.Object r6 = r14.receiver
            X.CvH r6 = (X.C26226CvH) r6
            java.lang.String r5 = "sup:MediaStreamController"
            r0 = 2
            r4 = 0
            if (r2 == r0) goto L_0x0316
            java.lang.String r3 = "SNAPP_DENIED_BY_PEAK_POWER"
            switch(r2) {
                case 11: goto L_0x0303;
                case 12: goto L_0x0303;
                case 13: goto L_0x0303;
                case 14: goto L_0x0320;
                default: goto L_0x027a;
            }
        L_0x027a:
            java.util.Iterator r7 = X.C26226CvH.A00(r6)
        L_0x027e:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x0cc4
            java.lang.Object r4 = X.C17890vO.A0P(r7)
            X.C6j r4 = (X.C24491C6j) r4
            X.BXe r4 = (X.C22958BXe) r4
            int r0 = r4.A00
            int r0 = 2 - r0
            if (r0 != 0) goto L_0x027e
            r0 = 4
            r6 = 1
            java.lang.String r5 = "sup:SUPDelegate"
            r3 = 0
            if (r2 == r0) goto L_0x02f9
            r0 = 5
            if (r2 == r0) goto L_0x02d2
            r0 = 18
            if (r2 == r0) goto L_0x02b9
            r0 = 19
            if (r2 != r0) goto L_0x027e
            X.Cn1 r1 = X.C24712CGy.A01
            java.lang.String r0 = "onHardwareStatusEvent DEVICE_IS_READY"
            r1.A01(r5, r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r6)
            com.facebook.wearable.mediastream.model.SUPToggleState.deviceIsReadyToConnect = r0
        L_0x02b1:
            java.lang.Object r0 = r4.A01
            X.DOs r0 = (X.C26996DOs) r0
            X.C26996DOs.A05(r0, r3)
            goto L_0x027e
        L_0x02b9:
            X.Cn1 r1 = X.C24712CGy.A01
            java.lang.String r0 = "onHardwareStatusEvent NO_DEVICE_READY"
            r1.A01(r5, r0)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r3)
            com.facebook.wearable.mediastream.model.SUPToggleState.deviceIsReadyToConnect = r1
            java.lang.Object r0 = r4.A01
            X.DOs r0 = (X.C26996DOs) r0
            X.1Di r0 = r0.A04
            if (r0 == 0) goto L_0x027e
            r0.invoke(r1)
            goto L_0x027e
        L_0x02d2:
            X.Cn1 r1 = X.C24712CGy.A01
            java.lang.String r0 = "onHardwareStatusEvent HINGED_CLOSED"
            r1.A01(r5, r0)
            com.facebook.wearable.mediastream.model.SUPToggleState.hingeOpen = r3
            java.lang.Object r1 = r4.A01
            X.DOs r1 = (X.C26996DOs) r1
            X.C26996DOs.A05(r1, r3)
            boolean r0 = r1.Be0()
            if (r0 == 0) goto L_0x027e
            X.A99 r4 = r1.A02
            if (r4 == 0) goto L_0x027e
            java.util.concurrent.ScheduledThreadPoolExecutor r3 = r4.A1E
            r1 = 43
            X.7Pb r0 = new X.7Pb
            r0.<init>(r4, r1)
            r3.execute(r0)
            goto L_0x027e
        L_0x02f9:
            X.Cn1 r1 = X.C24712CGy.A01
            java.lang.String r0 = "onHardwareStatusEvent HINGES_OPEN"
            r1.A01(r5, r0)
            com.facebook.wearable.mediastream.model.SUPToggleState.hingeOpen = r6
            goto L_0x02b1
        L_0x0303:
            java.lang.Integer r1 = r6.A0I
            java.lang.Integer r0 = X.AnonymousClass00R.A00
            if (r1 == r0) goto L_0x0311
            java.lang.Integer r0 = X.AnonymousClass00R.A0N
            if (r1 != r0) goto L_0x027a
            boolean r0 = r6.A0Q
            if (r0 == 0) goto L_0x027a
        L_0x0311:
            X.Cn1 r1 = X.C24712CGy.A01
            java.lang.String r0 = "handleHardwareStatusEvent PEAK_POWER_THROTTLE"
            goto L_0x0324
        L_0x0316:
            X.Cn1 r1 = X.C24712CGy.A01
            java.lang.String r0 = "handleHardwareStatusEvent DISCONNECTED"
            r1.A01(r5, r0)
            java.lang.String r3 = "SOCKET_CONNECTION_BT_DISABLED"
            goto L_0x0327
        L_0x0320:
            X.Cn1 r1 = X.C24712CGy.A01
            java.lang.String r0 = "handleHardwareStatusEvent PEAK_POWER_SHUTDOWN"
        L_0x0324:
            r1.A01(r5, r0)
        L_0x0327:
            X.BWx r0 = new X.BWx
            r0.<init>(r3)
            r6.A0C(r4, r0)
            goto L_0x027a
        L_0x0331:
            X.C3Y r15 = (X.C3Y) r15
            r7 = 0
            X.C18070vi.A0d(r15, r7)
            java.lang.Object r3 = r14.receiver
            X.CLB r3 = (X.CLB) r3
            boolean r0 = r15 instanceof X.BWo
            java.lang.String r6 = "sup:MediaStreamSupEventUtil"
            r4 = 1
            if (r0 == 0) goto L_0x038b
            X.CvH r2 = r3.A00
            boolean r0 = r2.A0R
            if (r0 != 0) goto L_0x034a
            r2.A0R = r4
        L_0x034a:
            boolean r0 = r2.A0P
            if (r0 == 0) goto L_0x0366
            X.CrL r0 = r2.A05()
            boolean r0 = r0.A0A()
            if (r0 != 0) goto L_0x0366
            X.Cn1 r1 = X.C24712CGy.A01
            java.lang.String r0 = "Got Video Codec Frame"
            r1.A01(r6, r0)
            X.CrL r0 = r2.A05()
            r0.A09(r4)
        L_0x0366:
            X.CrL r1 = r2.A05()
            X.BWo r15 = (X.BWo) r15
            java.nio.ByteBuffer r0 = r15.A00
            r1.A06(r0, 0)
            X.Cq6 r1 = r2.A0D
            if (r1 == 0) goto L_0x037c
            int r0 = r0.limit()
            r1.A01(r0)
        L_0x037c:
            X.Cj5 r0 = r2.A09
            if (r0 == 0) goto L_0x0cc4
            X.Cn1 r2 = X.C24712CGy.A01
            java.lang.String r1 = "sup:FrameRateAdaptiveVideoConfigHandler"
            java.lang.String r0 = "Received codec frame"
            r2.A01(r1, r0)
            goto L_0x0cc4
        L_0x038b:
            boolean r0 = r15 instanceof X.C22944BWq
            if (r0 == 0) goto L_0x0410
            X.CvH r6 = r3.A00
            X.CrL r2 = r6.A05()
            X.BWq r15 = (X.C22944BWq) r15
            java.nio.ByteBuffer r5 = r15.A01
            long r0 = r15.A00
            r2.A06(r5, r0)
            X.Cms r3 = r6.A0H
            if (r3 == 0) goto L_0x03ad
            int r2 = r3.A00
            if (r2 != 0) goto L_0x03ad
            java.lang.String r2 = "first_video_frame_received"
            r3.A03(r2)
            r3.A00 = r4
        L_0x03ad:
            X.Cq6 r3 = r6.A0D
            if (r3 == 0) goto L_0x03b8
            int r2 = r5.limit()
            r3.A01(r2)
        L_0x03b8:
            X.Cj5 r3 = r6.A09
            if (r3 == 0) goto L_0x0cc4
            boolean r2 = r3.A08
            if (r2 == 0) goto L_0x0cc4
            X.Cii r8 = r3.A04
            long r5 = android.os.SystemClock.uptimeMillis()
            long r0 = X.C17880vN.A04(r0)
            long r5 = r5 - r0
            r8.A00 = r5
            long r0 = r8.A02
            int r2 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r2 <= 0) goto L_0x03d4
            r0 = r5
        L_0x03d4:
            r8.A02 = r0
            long r5 = r5 - r0
            r8.A01 = r5
            long r1 = r8.A04
            r9 = 1
            int r0 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x03f2
            int r0 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r0 >= 0) goto L_0x03f2
            java.util.concurrent.atomic.AtomicBoolean r0 = r8.A06
            boolean r0 = r0.compareAndSet(r7, r4)
            if (r0 == 0) goto L_0x03f2
            X.0vk r0 = r8.A03
            r0.invoke()
        L_0x03f2:
            int r0 = r3.A02
            int r0 = r0 + 1
            r3.A02 = r0
            X.1OB r0 = r3.A07
            if (r0 != 0) goto L_0x0cc4
            X.0wl r0 = X.C23871Hy.A00
            X.1OY r2 = X.AnonymousClass1OW.A02(r0)
            r1 = 0
            com.facebook.wearable.mediastream.api.abr.FrameRateAdaptiveVideoConfigHandler$onVideoFrame$1 r0 = new com.facebook.wearable.mediastream.api.abr.FrameRateAdaptiveVideoConfigHandler$onVideoFrame$1
            r0.<init>(r3, r1)
            X.1e4 r0 = X.AnonymousClass3MY.A0s(r0, r2)
            r3.A07 = r0
            goto L_0x0cc4
        L_0x0410:
            boolean r0 = r15 instanceof X.C22938BWg
            if (r0 != 0) goto L_0x0cc4
            boolean r0 = r15 instanceof X.BWp
            if (r0 != 0) goto L_0x0cc4
            boolean r0 = r15 instanceof X.C22943BWl
            if (r0 == 0) goto L_0x044e
            X.CvH r0 = r3.A00
            X.Cj5 r1 = r0.A09
            if (r1 == 0) goto L_0x0cc4
            X.BWl r15 = (X.C22943BWl) r15
            int r0 = r15.A00
            if (r0 == 0) goto L_0x044b
            if (r0 == r4) goto L_0x0448
            java.lang.Integer r3 = X.AnonymousClass00R.A00
        L_0x042c:
            r1.A05 = r3
            X.Cn1 r2 = X.C24712CGy.A01
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "Setting max supported quality to "
            r1.append(r0)
            java.lang.String r0 = X.C24594CAp.A00(r3)
            java.lang.String r1 = X.AnonymousClass000.A0y(r0, r1)
            java.lang.String r0 = "sup:FrameRateAdaptiveVideoConfigHandler"
            r2.A01(r0, r1)
            goto L_0x0cc4
        L_0x0448:
            java.lang.Integer r3 = X.AnonymousClass00R.A01
            goto L_0x042c
        L_0x044b:
            java.lang.Integer r3 = X.AnonymousClass00R.A0C
            goto L_0x042c
        L_0x044e:
            boolean r0 = r15 instanceof X.C22937BWf
            if (r0 == 0) goto L_0x04d6
            X.Cn1 r5 = X.C24712CGy.A01
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "MediaStreamSupEvent.StreamingProtocolSwitched, isOnWifi = "
            r1.append(r0)
            X.BWf r15 = (X.C22937BWf) r15
            boolean r7 = r15.A00
            java.lang.String r0 = X.AnonymousClass3MY.A0r(r1, r7)
            r5.A01(r6, r0)
            X.CvH r2 = r3.A00
            java.lang.Integer r1 = r2.A0I
            java.lang.Integer r0 = X.AnonymousClass00R.A0N
            if (r1 != r0) goto L_0x0cc4
            r2.A0Q = r7
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "isStreamingOnWifi set to "
            java.lang.String r1 = X.C17900vP.A0D(r0, r1, r7)
            java.lang.String r0 = "sup:MediaStreamController"
            r5.A01(r0, r1)
            r0 = r7 ^ 1
            r2.A0E(r0)
            java.util.Iterator r6 = X.C26226CvH.A00(r2)
        L_0x048a:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x0cc4
            java.lang.Object r2 = X.C17890vO.A0P(r6)
            X.C6j r2 = (X.C24491C6j) r2
            X.BXe r2 = (X.C22958BXe) r2
            int r0 = r2.A00
            int r0 = 2 - r0
            if (r0 != 0) goto L_0x048a
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "MediaStreamStateListener:onStreamingProtocolChange, isOnWifi = "
            java.lang.String r1 = X.C17900vP.A0D(r0, r1, r7)
            java.lang.String r0 = "sup:SUPDelegate"
            r5.A02(r0, r1)
            java.lang.Object r3 = r2.A01
            X.DOs r3 = (X.C26996DOs) r3
            com.facebook.wearable.mediastream.model.SUPToggleState r8 = r3.A01
            java.lang.Boolean r13 = java.lang.Boolean.valueOf(r7)
            r9 = 0
            r11 = r9
            r12 = r9
            r10 = r9
            com.facebook.wearable.mediastream.model.SUPToggleState r0 = r8.getUpdatedStatusIndicatorAttributes(r9, r10, r11, r12, r13)
            if (r0 == 0) goto L_0x048a
            r3.A01 = r0
            X.0ve r2 = r3.A0I
            r1 = 8623(0x21af, float:1.2083E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 != 0) goto L_0x048a
            r3.CPZ(r4)
            X.C26996DOs.A05(r3, r4)
            goto L_0x048a
        L_0x04d6:
            boolean r0 = r15 instanceof X.C22942BWk
            if (r0 == 0) goto L_0x04ec
            X.BWk r15 = (X.C22942BWk) r15
            java.nio.ByteBuffer r1 = r15.A00
            int r0 = r1.limit()
            byte[] r0 = new byte[r0]
            r1.get(r0)
            X.C26226CvH.A03(r0)
            goto L_0x0cc4
        L_0x04ec:
            boolean r0 = r15 instanceof X.BWm
            if (r0 == 0) goto L_0x05c2
            X.BnE r0 = X.C23645BnE.DEFAULT_INSTANCE
            X.Bmt r2 = r0.A0N()
            X.BWm r15 = (X.BWm) r15
            java.nio.ByteBuffer r1 = r15.A00
            int r0 = r1.limit()
            byte[] r0 = new byte[r0]
            r1.get(r0)
            r2.A0A(r0)
            X.Bm6 r0 = r2.A0C()
            X.BnE r0 = (X.C23645BnE) r0
            X.CvH r2 = r3.A00
            X.CLC r7 = r2.A0E
            if (r7 == 0) goto L_0x0cc4
            int r6 = r0.status_
            int r1 = r0.type_
            long r3 = r0.level_
            X.BTC r5 = new X.BTC
            r5.<init>()
            r5.A00 = r6
            r5.A01 = r1
            r5.A02 = r3
            r0 = 2
            if (r1 == r0) goto L_0x053d
            r0 = 3
            if (r1 != r0) goto L_0x0555
            X.CmU r0 = r2.A0G
            if (r0 == 0) goto L_0x0555
            X.Cm6 r2 = r0.A03
            java.lang.Integer r1 = java.lang.Integer.valueOf(r6)
            monitor-enter(r2)
            r2.A00 = r1     // Catch:{ all -> 0x0551 }
            java.lang.Integer r0 = r2.A01     // Catch:{ all -> 0x0551 }
            if (r0 != 0) goto L_0x0554
            r2.A01 = r1     // Catch:{ all -> 0x0551 }
            goto L_0x0554
        L_0x053d:
            X.CmU r0 = r2.A0G
            if (r0 == 0) goto L_0x0555
            X.Cm6 r2 = r0.A03
            java.lang.Long r1 = java.lang.Long.valueOf(r3)
            monitor-enter(r2)
            r2.A02 = r1     // Catch:{ all -> 0x0551 }
            java.lang.Long r0 = r2.A03     // Catch:{ all -> 0x0551 }
            if (r0 != 0) goto L_0x0554
            r2.A03 = r1     // Catch:{ all -> 0x0551 }
            goto L_0x0554
        L_0x0551:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        L_0x0554:
            monitor-exit(r2)
        L_0x0555:
            int r4 = r5.A01
            if (r4 == 0) goto L_0x0cc4
            r3 = 4
            r2 = 3
            r1 = 1
            if (r4 == r1) goto L_0x05b1
            r0 = 2
            if (r4 == r0) goto L_0x057a
            if (r4 != r2) goto L_0x0cc4
            int r0 = r5.A00
            if (r0 == r1) goto L_0x0577
            if (r0 == r2) goto L_0x0574
            if (r0 != r3) goto L_0x0cc4
            X.BY6 r1 = X.BY6.A00
        L_0x056d:
            X.CuS r0 = r7.A00
            r0.A06(r1)
            goto L_0x0cc4
        L_0x0574:
            X.BXr r1 = X.C22971BXr.A00
            goto L_0x056d
        L_0x0577:
            X.BXq r1 = X.C22970BXq.A00
            goto L_0x056d
        L_0x057a:
            long r3 = r5.A02
            r8 = 81
            int r0 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r0 > 0) goto L_0x058e
            r1 = 101(0x65, double:5.0E-322)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x058e
            X.BY9 r1 = new X.BY9
            r1.<init>(r3)
            goto L_0x056d
        L_0x058e:
            r5 = 11
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r0 > 0) goto L_0x059e
            int r0 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r0 >= 0) goto L_0x059e
            X.BY3 r1 = new X.BY3
            r1.<init>(r3)
            goto L_0x056d
        L_0x059e:
            r1 = 1
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 > 0) goto L_0x05ae
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 >= 0) goto L_0x05ae
            X.BXk r1 = new X.BXk
            r1.<init>(r3)
            goto L_0x056d
        L_0x05ae:
            X.BY2 r1 = X.BY2.A00
            goto L_0x056d
        L_0x05b1:
            int r0 = r5.A00
            if (r0 == r1) goto L_0x05bf
            if (r0 == r2) goto L_0x05bc
            if (r0 != r3) goto L_0x0cc4
            X.BY5 r1 = X.BY5.A00
            goto L_0x056d
        L_0x05bc:
            X.BXx r1 = X.C22977BXx.A00
            goto L_0x056d
        L_0x05bf:
            X.BXt r1 = X.C22973BXt.A00
            goto L_0x056d
        L_0x05c2:
            boolean r0 = r15 instanceof X.BWn
            if (r0 == 0) goto L_0x0cc4
            X.BWn r15 = (X.BWn) r15
            java.nio.ByteBuffer r2 = r15.A00
            int r0 = r2.limit()
            byte[] r1 = new byte[r0]
            r2.get(r1)
            X.BnQ r0 = X.C23657BnQ.DEFAULT_INSTANCE
            X.Bm6 r5 = X.C23577Bm6.A07(r0, r1)
            X.BnQ r5 = (X.C23657BnQ) r5
            X.Cn1 r2 = X.C24712CGy.A01
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "User event received: "
            r1.append(r0)
            X.C12 r0 = r5.A0R()
            java.lang.String r0 = X.C17890vO.A0V(r0, r1)
            r2.A01(r6, r0)
            X.C12 r0 = r5.A0R()
            int r0 = r0.ordinal()
            if (r0 == r4) goto L_0x066c
            r2 = 2
            if (r0 == r2) goto L_0x0669
            int r0 = r5.userEventAction_
            switch(r0) {
                case 0: goto L_0x064b;
                case 1: goto L_0x064e;
                case 2: goto L_0x0651;
                case 3: goto L_0x0654;
                case 4: goto L_0x0657;
                case 5: goto L_0x065a;
                case 6: goto L_0x065d;
                case 7: goto L_0x0660;
                case 8: goto L_0x0663;
                case 9: goto L_0x0666;
                default: goto L_0x0603;
            }
        L_0x0603:
            X.C10 r0 = X.C10.UNRECOGNIZED
        L_0x0605:
            int r1 = r0.ordinal()
            if (r1 == r4) goto L_0x0648
            if (r1 == r2) goto L_0x0645
            r0 = 3
            if (r1 == r0) goto L_0x0642
            r0 = 4
            if (r1 == r0) goto L_0x063f
            r0 = 5
            if (r1 != r0) goto L_0x0cc4
            X.BX9 r2 = X.BX9.A00
        L_0x0618:
            boolean r0 = r2 instanceof X.BX7
            if (r0 == 0) goto L_0x066f
            X.CvH r2 = r3.A00
            X.CTk r0 = r2.A04()
            X.BQm r1 = r0.A00
            X.BXY r0 = X.BXY.A00
            r1.A04(r0)
            java.util.Iterator r2 = X.C26226CvH.A00(r2)
        L_0x062d:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0cc4
            java.lang.Object r1 = X.C17890vO.A0P(r2)
            X.C6j r1 = (X.C24491C6j) r1
            X.BX7 r0 = X.BX7.A00
            r1.A04(r0)
            goto L_0x062d
        L_0x063f:
            X.BX8 r2 = X.BX8.A00
            goto L_0x0618
        L_0x0642:
            X.BXA r2 = X.BXA.A00
            goto L_0x0618
        L_0x0645:
            X.BX7 r2 = X.BX7.A00
            goto L_0x0618
        L_0x0648:
            X.BX2 r2 = X.BX2.A00
            goto L_0x0618
        L_0x064b:
            X.C10 r0 = X.C10.USER_EVENT_ACTION_NONE
            goto L_0x0605
        L_0x064e:
            X.C10 r0 = X.C10.USER_EVENT_ACTION_REQUEST_SG_CAMERA_ON
            goto L_0x0605
        L_0x0651:
            X.C10 r0 = X.C10.USER_EVENT_ACTION_SG_MEDIA_STREAM_PAUSED
            goto L_0x0605
        L_0x0654:
            X.C10 r0 = X.C10.USER_EVENT_ACTION_TOGGLE_CAMERA_BACKGROUND
            goto L_0x0605
        L_0x0657:
            X.C10 r0 = X.C10.USER_EVENT_ACTION_REQUEST_PHOTO_CAPTURE
            goto L_0x0605
        L_0x065a:
            X.C10 r0 = X.C10.USER_EVENT_ACTION_REQUEST_TOGGLE_VIDEO_CAPTURE
            goto L_0x0605
        L_0x065d:
            X.C10 r0 = X.C10.USER_EVENT_ACTION_REQUEST_MODEL_RESPONSE
            goto L_0x0605
        L_0x0660:
            X.C10 r0 = X.C10.USER_EVENT_ACTION_REQUEST_END_CAPTURE
            goto L_0x0605
        L_0x0663:
            X.C10 r0 = X.C10.USER_EVENT_ACTION_REQUEST_END_STREAM_AND_SAVE
            goto L_0x0605
        L_0x0666:
            X.C10 r0 = X.C10.USER_EVENT_ACTION_REQUEST_END_STREAM_AND_DISCARD
            goto L_0x0605
        L_0x0669:
            X.BX5 r2 = X.BX5.A00
            goto L_0x0618
        L_0x066c:
            X.BX6 r2 = X.BX6.A00
            goto L_0x0618
        L_0x066f:
            boolean r0 = r2 instanceof X.BX2
            if (r0 == 0) goto L_0x069b
            X.CvH r2 = r3.A00
            boolean r0 = r2.A0T
            if (r0 != 0) goto L_0x068f
            java.util.Iterator r2 = X.C26226CvH.A00(r2)
        L_0x067d:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0cc4
            java.lang.Object r1 = X.C17890vO.A0P(r2)
            X.C6j r1 = (X.C24491C6j) r1
            X.BX2 r0 = X.BX2.A00
            r1.A04(r0)
            goto L_0x067d
        L_0x068f:
            int r1 = r2.A01
            r0 = 4
            if (r1 != r0) goto L_0x0cc4
            java.lang.Integer r0 = X.AnonymousClass00R.A0A
            r2.A0D(r0)
            goto L_0x0cc4
        L_0x069b:
            X.CvH r0 = r3.A00
            java.util.Iterator r1 = X.C26226CvH.A00(r0)
        L_0x06a1:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0cc4
            java.lang.Object r0 = X.C17890vO.A0P(r1)
            X.C6j r0 = (X.C24491C6j) r0
            r0.A04(r2)
            goto L_0x06a1
        L_0x06b1:
            X.C3W r15 = (X.C3W) r15
            r8 = 0
            X.C18070vi.A0d(r15, r8)
            java.lang.Object r3 = r14.receiver
            X.CLA r3 = (X.CLA) r3
            boolean r0 = r15 instanceof X.BWX
            if (r0 == 0) goto L_0x06dc
            X.Cn1 r2 = X.C24712CGy.A01
            java.lang.String r1 = "sup:LifecycleEventUtil"
            java.lang.String r0 = "MSC: MediaStreamLifecycleEvent.EnteredInitial"
            r2.A01(r1, r0)
            X.CvH r0 = r3.A00
            java.util.Iterator r1 = X.C26226CvH.A00(r0)
        L_0x06ce:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0cc4
            java.util.Map$Entry r0 = X.AnonymousClass000.A16(r1)
            r0.getValue()
            goto L_0x06ce
        L_0x06dc:
            boolean r0 = r15 instanceof X.BWW
            if (r0 == 0) goto L_0x0719
            X.Cn1 r2 = X.C24712CGy.A01
            java.lang.String r1 = "sup:LifecycleEventUtil"
            java.lang.String r0 = "MSC: MediaStreamLifecycleEvent.DiscoveryStarted"
            r2.A01(r1, r0)
            X.CvH r4 = r3.A00
            X.Cms r3 = r4.A0H
            if (r3 == 0) goto L_0x0cc4
            r0 = 2
            r3.A02(r0)
            int r1 = r4.A00
            if (r1 == r0) goto L_0x06fb
            r0 = 4
            r2 = 0
            if (r1 != r0) goto L_0x06fc
        L_0x06fb:
            r2 = 1
        L_0x06fc:
            X.CmZ r0 = X.C25822CmZ.A0B
            java.lang.String r1 = r0.A01()
            if (r2 == 0) goto L_0x0716
            java.lang.String r0 = "app_call_session_id"
        L_0x0706:
            X.C26226CvH.A01(r4, r3, r0, r1)
            java.lang.Integer r0 = r4.A0I
            java.lang.String r1 = X.C24592CAn.A00(r0)
            java.lang.String r0 = "streaming_protocol"
            r3.A04(r0, r1)
            goto L_0x0cc4
        L_0x0716:
            java.lang.String r0 = "app_stream_session_id"
            goto L_0x0706
        L_0x0719:
            boolean r0 = r15 instanceof X.BWU
            if (r0 == 0) goto L_0x076e
            X.Cn1 r5 = X.C24712CGy.A01
            java.lang.String r0 = "MSC: MediaStreamLifecycleEvent.DeviceDiscovered"
            java.lang.String r4 = "sup:LifecycleEventUtil"
            r5.A01(r4, r0)
            X.CvH r6 = r3.A00
            java.util.Map r2 = r6.A0K
            java.util.concurrent.atomic.AtomicBoolean r1 = r6.A0X
            r0 = 1
            boolean r0 = r1.compareAndSet(r8, r0)
            if (r0 == 0) goto L_0x0764
            java.util.Iterator r3 = X.AnonymousClass000.A15(r2)
        L_0x0737:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0764
            java.util.Map$Entry r2 = X.AnonymousClass000.A16(r3)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "Calling "
            r1.append(r0)
            java.lang.String r0 = X.C17880vN.A0x(r2)
            r1.append(r0)
            java.lang.String r0 = " onDiscovered callback"
            java.lang.String r0 = X.AnonymousClass000.A0y(r0, r1)
            r5.A01(r4, r0)
            java.lang.Object r0 = r2.getValue()
            X.C6j r0 = (X.C24491C6j) r0
            r0.A01()
            goto L_0x0737
        L_0x0764:
            X.Cms r1 = r6.A0H
            if (r1 == 0) goto L_0x0cc4
            r0 = 2
            r1.A01(r0)
            goto L_0x0cc4
        L_0x076e:
            boolean r0 = r15 instanceof X.BWT
            if (r0 == 0) goto L_0x081a
            X.Cn1 r2 = X.C24712CGy.A01
            java.lang.String r1 = "sup:LifecycleEventUtil"
            java.lang.String r0 = "MSC: MediaStreamLifecycleEvent.ConnectionStarted"
            r2.A01(r1, r0)
            X.CvH r3 = r3.A00
            X.Cms r2 = r3.A0H
            if (r2 == 0) goto L_0x07f4
            r2.A02(r8)
            int r1 = r3.A00
            r0 = 2
            if (r1 == r0) goto L_0x078d
            r0 = 4
            r4 = 0
            if (r1 != r0) goto L_0x078e
        L_0x078d:
            r4 = 1
        L_0x078e:
            boolean r0 = r3.A0O
            java.lang.String r1 = java.lang.String.valueOf(r0)
            if (r4 == 0) goto L_0x07a8
            java.lang.String r0 = "is_in_call"
            r2.A04(r0, r1)
            X.CmZ r6 = X.C25822CmZ.A0B
            java.lang.String r1 = r6.A01()
            java.lang.String r0 = "app_call_session_id"
        L_0x07a3:
            r2.A04(r0, r1)
            monitor-enter(r6)
            goto L_0x07b6
        L_0x07a8:
            java.lang.String r0 = "is_live"
            r2.A04(r0, r1)
            X.CmZ r6 = X.C25822CmZ.A0B
            java.lang.String r1 = r6.A01()
            java.lang.String r0 = "app_stream_session_id"
            goto L_0x07a3
        L_0x07b6:
            java.lang.String r1 = X.C108985cd.A0f()     // Catch:{ all -> 0x0902 }
            X.C25822CmZ.A07 = r1     // Catch:{ all -> 0x0902 }
            r0 = 1
            X.C25822CmZ.A00 = r0     // Catch:{ all -> 0x0902 }
            monitor-exit(r6)
            java.lang.String r0 = "app_cold_start_session_id"
            r2.A04(r0, r1)
            java.lang.Integer r0 = r3.A0I
            java.lang.String r1 = X.C24592CAn.A00(r0)
            java.lang.String r0 = "streaming_protocol"
            X.C26226CvH.A01(r3, r2, r0, r1)
            java.lang.String r1 = X.C24459C4z.A01
            if (r1 == 0) goto L_0x080b
            java.lang.String r0 = "device_type"
            r2.A04(r0, r1)
        L_0x07d9:
            java.lang.String r1 = X.C24459C4z.A03
            if (r1 == 0) goto L_0x0805
            java.lang.String r0 = "device_build_type"
            r2.A04(r0, r1)
        L_0x07e2:
            java.lang.String r1 = X.C24459C4z.A02
            if (r1 == 0) goto L_0x07ff
            java.lang.String r0 = "soc_version"
            r2.A04(r0, r1)
        L_0x07eb:
            java.lang.String r1 = X.C24459C4z.A00
            if (r1 == 0) goto L_0x07f9
            java.lang.String r0 = "build_flavor"
            r2.A04(r0, r1)
        L_0x07f4:
            X.CmZ r1 = X.C25822CmZ.A0B
            monitor-enter(r1)
            r0 = 1
            goto L_0x0811
        L_0x07f9:
            java.lang.String r0 = "BUILD_FLAVOR_NULL"
            X.C26226CvH.A02(r3, r0)
            goto L_0x07f4
        L_0x07ff:
            java.lang.String r0 = "SOC_VERSION_NULL"
            X.C26226CvH.A02(r3, r0)
            goto L_0x07eb
        L_0x0805:
            java.lang.String r0 = "DEVICE_BUILD_TYPE_NULL"
            X.C26226CvH.A02(r3, r0)
            goto L_0x07e2
        L_0x080b:
            java.lang.String r0 = "DEVICE_TYPE_NULL"
            X.C26226CvH.A02(r3, r0)
            goto L_0x07d9
        L_0x0811:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ all -> 0x0b66 }
            X.C25822CmZ.A01 = r0     // Catch:{ all -> 0x0b66 }
            monitor-exit(r1)
            goto L_0x0cc4
        L_0x081a:
            boolean r0 = r15 instanceof X.BWS
            if (r0 == 0) goto L_0x088d
            X.Cn1 r2 = X.C24712CGy.A01
            java.lang.String r1 = "sup:LifecycleEventUtil"
            java.lang.String r0 = "MSC: MediaStreamLifecycleEvent.Connected"
            r2.A01(r1, r0)
            X.CvH r4 = r3.A00
            r4.A0M = r8
            r0 = 1
            r4.A0L = r0
            X.Cms r1 = r4.A0H
            if (r1 == 0) goto L_0x0836
            r0 = 2
            r1.A01(r0)
        L_0x0836:
            X.CrL r0 = r4.A05()
            r0.A02()
            java.util.Iterator r1 = X.C26226CvH.A00(r4)
        L_0x0841:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0851
            java.lang.Object r0 = X.C17890vO.A0P(r1)
            X.C6j r0 = (X.C24491C6j) r0
            r0.A00()
            goto L_0x0841
        L_0x0851:
            X.CTk r0 = r4.A04()
            int r6 = r4.A00
            int r5 = X.C24457C4x.A00
            int r3 = X.C24457C4x.A01
            boolean r2 = X.C24457C4x.A02
            X.BQm r1 = r0.A00
            X.BXV r0 = new X.BXV
            r0.<init>(r6, r5, r3, r2)
            r1.A04(r0)
            X.CTk r0 = r4.A04()
            X.BTZ r2 = r4.A07
            X.BQm r1 = r0.A00
            X.BXP r0 = new X.BXP
            r0.<init>(r2)
            r1.A04(r0)
            X.CmU r0 = r4.A0G
            if (r0 == 0) goto L_0x0882
            X.CmR r1 = r0.A02
            X.BTZ r0 = r4.A07
            r1.A02(r0)
        L_0x0882:
            boolean r0 = r4.A0O
            if (r0 == 0) goto L_0x0cc4
            java.lang.Integer r0 = X.AnonymousClass00R.A07
            r4.A0D(r0)
            goto L_0x0cc4
        L_0x088d:
            boolean r0 = r15 instanceof X.BWZ
            if (r0 == 0) goto L_0x0936
            X.Cn1 r2 = X.C24712CGy.A01
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "MSC: MediaStreamLifecycleEvent.Streaming, isStreaming = "
            r1.append(r0)
            X.CvH r5 = r3.A00
            boolean r0 = r5.A0P
            java.lang.String r1 = X.AnonymousClass3MY.A0r(r1, r0)
            java.lang.String r0 = "sup:LifecycleEventUtil"
            r2.A01(r0, r1)
            r4 = 1
            r5.A0P = r4
            X.CmU r0 = r5.A0G
            if (r0 == 0) goto L_0x08e5
            X.CmR r6 = r0.A02
            monitor-enter(r6)
            java.util.concurrent.atomic.AtomicBoolean r0 = r6.A0A     // Catch:{ all -> 0x0902 }
            boolean r0 = r0.get()     // Catch:{ all -> 0x0902 }
            if (r0 == 0) goto L_0x08be
            r6.A00()     // Catch:{ all -> 0x0902 }
        L_0x08be:
            org.json.JSONObject r1 = r6.A05     // Catch:{ all -> 0x0902 }
            if (r1 == 0) goto L_0x08c7
            org.json.JSONArray r0 = r6.A01     // Catch:{ all -> 0x0902 }
            r0.put(r1)     // Catch:{ all -> 0x0902 }
        L_0x08c7:
            org.json.JSONObject r1 = r6.A07     // Catch:{ all -> 0x0902 }
            if (r1 == 0) goto L_0x08d0
            org.json.JSONArray r0 = r6.A03     // Catch:{ all -> 0x0902 }
            r0.put(r1)     // Catch:{ all -> 0x0902 }
        L_0x08d0:
            org.json.JSONObject r1 = r6.A04     // Catch:{ all -> 0x0902 }
            if (r1 == 0) goto L_0x08d9
            org.json.JSONArray r0 = r6.A00     // Catch:{ all -> 0x0902 }
            r0.put(r1)     // Catch:{ all -> 0x0902 }
        L_0x08d9:
            org.json.JSONObject r1 = r6.A06     // Catch:{ all -> 0x0902 }
            if (r1 == 0) goto L_0x08e2
            org.json.JSONArray r0 = r6.A02     // Catch:{ all -> 0x0902 }
            r0.put(r1)     // Catch:{ all -> 0x0902 }
        L_0x08e2:
            r6.A09 = r4     // Catch:{ all -> 0x0902 }
            monitor-exit(r6)
        L_0x08e5:
            X.CmU r0 = r5.A0G
            if (r0 == 0) goto L_0x0906
            X.CQY r6 = r0.A04
            monitor-enter(r6)
            java.lang.String r1 = "sup:SUPNetworkAnalyticsImpl"
            java.lang.String r0 = "Starting session info tracking"
            r2.A02(r1, r0)     // Catch:{ all -> 0x0902 }
            long r0 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0902 }
            r6.A00 = r0     // Catch:{ all -> 0x0902 }
            r6.A02 = r4     // Catch:{ all -> 0x0902 }
            org.json.JSONArray r0 = X.AnonymousClass8BR.A1A()     // Catch:{ all -> 0x0902 }
            r6.A01 = r0     // Catch:{ all -> 0x0902 }
            goto L_0x0905
        L_0x0902:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        L_0x0905:
            monitor-exit(r6)
        L_0x0906:
            r5.A0A(r8)
            X.CmU r0 = r5.A0G
            if (r0 == 0) goto L_0x0cc4
            X.CNj r5 = r0.A01
            X.DhJ r4 = new X.DhJ
            r4.<init>(r3)
            java.lang.String r1 = "sup:SUPMediaStreamLatencyManager"
            java.lang.String r0 = "startTrackingLatency"
            r2.A01(r1, r0)
            X.1OB r0 = r5.A01
            r2 = 0
            if (r0 == 0) goto L_0x0923
            r0.BEM(r2)
        L_0x0923:
            X.0wl r0 = X.C23871Hy.A00
            X.1OY r1 = X.AnonymousClass1OW.A02(r0)
            com.facebook.wearable.mediastream.analytics.logging.intf.SUPMediaStreamLatencyManager$startTrackingLatency$1 r0 = new com.facebook.wearable.mediastream.analytics.logging.intf.SUPMediaStreamLatencyManager$startTrackingLatency$1
            r0.<init>(r5, r2, r4)
            X.1e4 r0 = X.AnonymousClass3MY.A0s(r0, r1)
            r5.A01 = r0
            goto L_0x0cc4
        L_0x0936:
            boolean r0 = r15 instanceof X.BWR
            if (r0 == 0) goto L_0x0b96
            X.BWR r15 = (X.BWR) r15
            X.Cn1 r5 = X.C24712CGy.A01
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "MSC: MediaStreamLifecycleEvent.DeviceStreamStopped, reason="
            r1.append(r0)
            int r7 = r15.A00
            java.lang.String r0 = X.C17880vN.A0t(r1, r7)
            java.lang.String r6 = "sup:LifecycleEventUtil"
            r5.A01(r6, r0)
            r0 = 1
            if (r7 == r0) goto L_0x0b7e
            r0 = 20
            if (r7 == r0) goto L_0x0b7e
            r0 = 21
            if (r7 == r0) goto L_0x0b7e
            r0 = 8
            if (r7 != r0) goto L_0x098f
            X.CvH r2 = r3.A00
            X.CLC r0 = r2.A0E
            if (r0 == 0) goto L_0x096e
            X.BXo r1 = X.C22968BXo.A00
            X.CuS r0 = r0.A00
            r0.A06(r1)
        L_0x096e:
            X.CTk r0 = r2.A04()
            X.BQm r1 = r0.A00
            X.BXY r0 = X.BXY.A00
            r1.A04(r0)
            java.util.Iterator r2 = X.C26226CvH.A00(r2)
        L_0x097d:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0cc4
            java.lang.Object r1 = X.C17890vO.A0P(r2)
            X.C6j r1 = (X.C24491C6j) r1
            X.BX4 r0 = X.BX4.A00
            r1.A04(r0)
            goto L_0x097d
        L_0x098f:
            r0 = 9
            if (r7 != r0) goto L_0x09ab
            X.CvH r4 = r3.A00
            java.util.Iterator r2 = X.C26226CvH.A00(r4)
        L_0x0999:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0b69
            java.lang.Object r1 = X.C17890vO.A0P(r2)
            X.C6j r1 = (X.C24491C6j) r1
            X.BX3 r0 = X.BX3.A00
            r1.A04(r0)
            goto L_0x0999
        L_0x09ab:
            r0 = 6
            if (r7 != r0) goto L_0x09c4
            X.CvH r1 = r3.A00
            boolean r0 = r1.A0P
            if (r0 == 0) goto L_0x0cc4
            X.CmU r2 = r1.A0G
            if (r2 == 0) goto L_0x0cc4
            java.lang.String r1 = "STREAM_STOPPED_REASON_INACTIVITY_WHILE_STREAMING"
            X.BWz r0 = new X.BWz
            r0.<init>(r1)
            r2.A01(r0)
            goto L_0x0cc4
        L_0x09c4:
            r0 = 13
            if (r7 == r0) goto L_0x0cc4
            r0 = 2
            if (r7 != r0) goto L_0x09e8
            X.CvH r4 = r3.A00
            X.CLC r0 = r4.A0E
            if (r0 == 0) goto L_0x09d8
            X.BXn r1 = X.C22967BXn.A00
            X.CuS r0 = r0.A00
            r0.A06(r1)
        L_0x09d8:
            X.CmU r1 = r4.A0G
            if (r1 == 0) goto L_0x0b74
            java.lang.String r2 = "STREAM_STOPPED_REASON_SYSTEM_PREEMPT"
        L_0x09de:
            X.BWz r0 = new X.BWz
            r0.<init>(r2)
            r1.A01(r0)
            goto L_0x0b74
        L_0x09e8:
            r0 = 3
            if (r7 != r0) goto L_0x0a14
            X.CvH r4 = r3.A00
            X.CLC r0 = r4.A0E
            if (r0 == 0) goto L_0x09f8
            X.BXn r1 = X.C22967BXn.A00
            X.CuS r0 = r0.A00
            r0.A06(r1)
        L_0x09f8:
            X.CmU r1 = r4.A0G
            java.lang.String r2 = "STREAM_STOPPED_REASON_SYSTEM_SHUTDOWN"
            if (r1 == 0) goto L_0x0a06
            X.BWz r0 = new X.BWz
            r0.<init>(r2)
            r1.A01(r0)
        L_0x0a06:
            java.util.Iterator r1 = X.C26226CvH.A00(r4)
        L_0x0a0a:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0b74
            A00(r2, r1)
            goto L_0x0a0a
        L_0x0a14:
            r0 = 12
            java.lang.String r2 = "STREAM_STOPPED_REASON_BATTERY_LOW"
            if (r7 != r0) goto L_0x0a3c
            X.CvH r4 = r3.A00
            java.util.Iterator r1 = X.C26226CvH.A00(r4)
        L_0x0a20:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0a2a
            A00(r2, r1)
            goto L_0x0a20
        L_0x0a2a:
            X.CLC r0 = r4.A0E
            if (r0 == 0) goto L_0x0a35
            X.BY2 r1 = X.BY2.A00
            X.CuS r0 = r0.A00
            r0.A06(r1)
        L_0x0a35:
            X.CmU r1 = r4.A0G
            if (r1 == 0) goto L_0x0b74
            java.lang.String r2 = "STREAM_STOPPED_REASON_PEAK_POWER_INTERRUPT"
            goto L_0x09de
        L_0x0a3c:
            r0 = 14
            if (r7 != r0) goto L_0x0a6c
            X.CvH r3 = r3.A00
            X.CLC r0 = r3.A0E
            if (r0 == 0) goto L_0x0a4d
            X.BXz r1 = X.C22979BXz.A00
            X.CuS r0 = r0.A00
            r0.A06(r1)
        L_0x0a4d:
            X.CmU r1 = r3.A0G
            java.lang.String r2 = "STREAM_STOPPED_REASON_TAMPER_DETECTED"
            if (r1 == 0) goto L_0x0a5b
            X.BWz r0 = new X.BWz
            r0.<init>(r2)
            r1.A01(r0)
        L_0x0a5b:
            r3.A08()
            java.util.Iterator r1 = X.C26226CvH.A00(r3)
        L_0x0a62:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0cc4
            A00(r2, r1)
            goto L_0x0a62
        L_0x0a6c:
            r0 = 4
            if (r7 == r0) goto L_0x0b40
            r0 = 16
            if (r7 == r0) goto L_0x0b40
            r0 = 5
            if (r7 != r0) goto L_0x0a8b
            X.CvH r4 = r3.A00
            X.CLC r0 = r4.A0E
            if (r0 == 0) goto L_0x0a83
            X.BXq r1 = X.C22970BXq.A00
            X.CuS r0 = r0.A00
            r0.A06(r1)
        L_0x0a83:
            X.CmU r1 = r4.A0G
            if (r1 == 0) goto L_0x0b74
            java.lang.String r2 = "STREAM_STOPPED_REASON_THERMAL_THRESHOLD"
            goto L_0x09de
        L_0x0a8b:
            r0 = 22
            if (r7 != r0) goto L_0x0aa9
            X.CvH r4 = r3.A00
            java.util.Iterator r1 = X.C26226CvH.A00(r4)
        L_0x0a95:
            boolean r0 = r1.hasNext()
            java.lang.String r2 = "STREAM_STOPPED_REASON_WEAK_SIGNAL"
            if (r0 == 0) goto L_0x0aa1
            A00(r2, r1)
            goto L_0x0a95
        L_0x0aa1:
            X.CLC r0 = r4.A0E
            if (r0 == 0) goto L_0x0b60
            X.BXt r1 = X.C22973BXt.A00
            goto L_0x0b56
        L_0x0aa9:
            r0 = 7
            java.lang.String r2 = "DEVICE_ERROR"
            java.lang.String r1 = "Fire off onError state listeners."
            if (r7 != r0) goto L_0x0acb
            r5.A03(r6, r1)
            X.CvH r4 = r3.A00
            java.util.Iterator r1 = X.C26226CvH.A00(r4)
        L_0x0ab9:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0ac3
            A00(r2, r1)
            goto L_0x0ab9
        L_0x0ac3:
            X.CmU r1 = r4.A0G
            if (r1 == 0) goto L_0x0b74
            java.lang.String r2 = "STREAM_STOPPED_REASON_CAMERA_FAILURE"
            goto L_0x09de
        L_0x0acb:
            r0 = 10
            if (r7 != r0) goto L_0x0aea
            r5.A03(r6, r1)
            X.CvH r4 = r3.A00
            java.util.Iterator r1 = X.C26226CvH.A00(r4)
        L_0x0ad8:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0ae2
            A00(r2, r1)
            goto L_0x0ad8
        L_0x0ae2:
            X.CmU r1 = r4.A0G
            if (r1 == 0) goto L_0x0b74
            java.lang.String r2 = "STREAM_STOPPED_REASON_AUDIO_FAILURE"
            goto L_0x09de
        L_0x0aea:
            r0 = 11
            r5.A03(r6, r1)
            X.CvH r4 = r3.A00
            if (r7 != r0) goto L_0x0b16
            java.util.Iterator r3 = X.C26226CvH.A00(r4)
        L_0x0af7:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0b0e
            java.lang.Object r2 = X.C17890vO.A0P(r3)
            X.C6j r2 = (X.C24491C6j) r2
            java.lang.String r1 = "INTERNAL_ERROR"
            X.BWz r0 = new X.BWz
            r0.<init>(r1)
            r2.A03(r0)
            goto L_0x0af7
        L_0x0b0e:
            X.CmU r1 = r4.A0G
            if (r1 == 0) goto L_0x0b74
            java.lang.String r2 = "STREAM_STOPPED_REASON_MOBILE_STREAM_ERROR"
            goto L_0x09de
        L_0x0b16:
            java.util.Iterator r1 = X.C26226CvH.A00(r4)
            if (r7 != r8) goto L_0x0b28
        L_0x0b1c:
            boolean r0 = r1.hasNext()
            java.lang.String r2 = "STREAM_STOPPED_REASON_UNKNOWN"
            if (r0 == 0) goto L_0x0b60
            A00(r2, r1)
            goto L_0x0b1c
        L_0x0b28:
            boolean r0 = r1.hasNext()
            java.lang.String r2 = "BUG_MUST_FIX"
            if (r0 == 0) goto L_0x0b34
            A00(r2, r1)
            goto L_0x0b28
        L_0x0b34:
            X.CmZ r1 = X.C25822CmZ.A0B
            monitor-enter(r1)
            java.lang.Boolean r0 = X.C25822CmZ.A03     // Catch:{ all -> 0x0b66 }
            if (r0 == 0) goto L_0x0b5c
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x0b66 }
            goto L_0x0b5d
        L_0x0b40:
            X.CvH r4 = r3.A00
            java.util.Iterator r1 = X.C26226CvH.A00(r4)
        L_0x0b46:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0b50
            A00(r2, r1)
            goto L_0x0b46
        L_0x0b50:
            X.CLC r0 = r4.A0E
            if (r0 == 0) goto L_0x0b60
            X.BY2 r1 = X.BY2.A00
        L_0x0b56:
            X.CuS r0 = r0.A00
            r0.A06(r1)
            goto L_0x0b60
        L_0x0b5c:
            r0 = 0
        L_0x0b5d:
            monitor-exit(r1)
            if (r0 == 0) goto L_0x0b74
        L_0x0b60:
            X.CmU r1 = r4.A0G
            if (r1 == 0) goto L_0x0b74
            goto L_0x09de
        L_0x0b66:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        L_0x0b69:
            X.CLC r0 = r4.A0E
            if (r0 == 0) goto L_0x0b74
            X.BXn r1 = X.C22967BXn.A00
            X.CuS r0 = r0.A00
            r0.A06(r1)
        L_0x0b74:
            java.lang.String r0 = "Fire disconnect"
            r5.A03(r6, r0)
            r4.A07()
            goto L_0x0cc4
        L_0x0b7e:
            X.CvH r0 = r3.A00
            java.util.Iterator r2 = X.C26226CvH.A00(r0)
        L_0x0b84:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0cc4
            java.lang.Object r1 = X.C17890vO.A0P(r2)
            X.C6j r1 = (X.C24491C6j) r1
            X.BX1 r0 = X.BX1.A00
            r1.A04(r0)
            goto L_0x0b84
        L_0x0b96:
            boolean r0 = r15 instanceof X.BWY
            if (r0 == 0) goto L_0x0c14
            X.Cn1 r5 = X.C24712CGy.A01
            java.lang.String r0 = "MSC: MediaStreamLifecycleEvent.ExitStreamingEvent"
            java.lang.String r1 = "sup:LifecycleEventUtil"
            r5.A01(r1, r0)
            java.lang.String r0 = "Fire off onStreamStopped state listeners"
            r5.A03(r1, r0)
            X.CvH r4 = r3.A00
            X.CmU r0 = r4.A0G
            if (r0 == 0) goto L_0x0beb
            X.CQY r9 = r0.A04
            monitor-enter(r9)
            boolean r0 = r9.A02     // Catch:{ all -> 0x0be7 }
            if (r0 == 0) goto L_0x0bea
            java.lang.String r1 = "sup:SUPNetworkAnalyticsImpl"
            java.lang.String r0 = "Stopping session info tracking"
            r5.A02(r1, r0)     // Catch:{ all -> 0x0be7 }
            long r6 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0be7 }
            long r0 = r9.A00     // Catch:{ all -> 0x0be7 }
            long r2 = r6 - r0
            r9.A00 = r6     // Catch:{ all -> 0x0be7 }
            org.json.JSONArray r7 = r9.A01     // Catch:{ all -> 0x0be7 }
            org.json.JSONObject r6 = X.C17880vN.A15()     // Catch:{ all -> 0x0be7 }
            java.lang.String r1 = "uplink_type"
            java.lang.String r0 = "UNKNOWN"
            org.json.JSONObject r0 = r6.put(r1, r0)     // Catch:{ all -> 0x0be7 }
            r7.put(r0)     // Catch:{ all -> 0x0be7 }
            org.json.JSONObject r1 = X.C17880vN.A15()     // Catch:{ all -> 0x0be7 }
            java.lang.String r0 = "duration"
            org.json.JSONObject r0 = r1.put(r0, r2)     // Catch:{ all -> 0x0be7 }
            r7.put(r0)     // Catch:{ all -> 0x0be7 }
            r9.A02 = r8     // Catch:{ all -> 0x0be7 }
            goto L_0x0bea
        L_0x0be7:
            r0 = move-exception
            monitor-exit(r9)
            throw r0
        L_0x0bea:
            monitor-exit(r9)
        L_0x0beb:
            X.CmU r0 = r4.A0G
            if (r0 == 0) goto L_0x0c02
            X.CNj r2 = r0.A01
            java.lang.String r1 = "sup:SUPMediaStreamLatencyManager"
            java.lang.String r0 = "stopTrackingLatency"
            r5.A01(r1, r0)
            X.1OB r1 = r2.A01
            r0 = 0
            if (r1 == 0) goto L_0x0c00
            r1.BEM(r0)
        L_0x0c00:
            r2.A01 = r0
        L_0x0c02:
            java.util.Iterator r1 = X.C26226CvH.A00(r4)
        L_0x0c06:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0cc4
            java.util.Map$Entry r0 = X.AnonymousClass000.A16(r1)
            r0.getValue()
            goto L_0x0c06
        L_0x0c14:
            boolean r0 = r15 instanceof X.BWV
            if (r0 == 0) goto L_0x0cc4
            X.Cn1 r2 = X.C24712CGy.A01
            java.lang.String r1 = "sup:LifecycleEventUtil"
            java.lang.String r0 = "MSC: MediaStreamLifecycleEvent.Disconnected"
            r2.A01(r1, r0)
            X.CvH r0 = r3.A00
            r0.A07()
            goto L_0x0cc4
        L_0x0c28:
            java.util.List r15 = (java.util.List) r15
            java.lang.Object r6 = X.AnonymousClass3Ma.A0z(r15, r14)
            X.BXJ r6 = (X.BXJ) r6
            java.util.ArrayList r7 = X.AnonymousClass000.A13()
            java.util.Iterator r5 = r15.iterator()
        L_0x0c38:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x0c6f
            java.lang.Object r1 = r5.next()
            X.BTf r1 = (X.C22871BTf) r1
            java.util.UUID r0 = r1.A02
            if (r0 == 0) goto L_0x0c38
            java.lang.String r4 = r0.toString()
            if (r4 == 0) goto L_0x0c38
            X.BTc r3 = r1.A01
            r2 = 0
            if (r3 == 0) goto L_0x0c6d
            java.lang.String r1 = r3.A05
        L_0x0c55:
            java.lang.String r0 = "greatwhite"
            X.C18070vi.A18(r1, r0)
            if (r3 == 0) goto L_0x0c5e
            java.lang.String r2 = r3.A05
        L_0x0c5e:
            java.lang.String r0 = "colada"
            X.C18070vi.A18(r2, r0)
            X.BWt r0 = X.C22947BWt.A00
            X.1D6 r0 = X.AnonymousClass1D6.A01(r4, r0)
            r7.add(r0)
            goto L_0x0c38
        L_0x0c6d:
            r1 = r2
            goto L_0x0c55
        L_0x0c6f:
            java.util.Map r1 = X.AnonymousClass1D7.A0D(r7)
            X.BQm r3 = r6.A02
            X.CtL r0 = X.BQm.A0Q
            r0.A08(r1)
            X.Cn1 r2 = X.C24712CGy.A01
            java.lang.String r1 = "sup:InitialStateDelegate"
            java.lang.String r0 = "[INITIAL]: found sup device(s). Transition to DISCOVERED state"
            r2.A02(r1, r0)
            X.C6B r1 = X.BQm.A01(r3)
            X.BXR r0 = new X.BXR
            r0.<init>(r1)
            r3.A04(r0)
            goto L_0x0cc4
        L_0x0c90:
            X.ChP r15 = (X.C25527ChP) r15
            java.lang.Object r1 = X.AnonymousClass3Ma.A0z(r15, r14)
            X.CuL r1 = (X.C26193CuL) r1
            X.Dlk r0 = new X.Dlk
            r0.<init>(r1, r15)
            X.C26193CuL.A01(r1, r0)
            goto L_0x0cc4
        L_0x0ca1:
            java.lang.String r15 = (java.lang.String) r15
            java.lang.Object r0 = X.AnonymousClass3Ma.A0z(r15, r14)
            com.facebook.ale.native.ResponseCallback r0 = (com.facebook.ale.p000native.ResponseCallback) r0
            r0.onFailure(r15)
            goto L_0x0cc4
        L_0x0cad:
            java.nio.ByteBuffer r15 = (java.nio.ByteBuffer) r15
            java.lang.Object r0 = X.AnonymousClass3Ma.A0z(r15, r14)
            com.facebook.ale.native.ResponseCallback r0 = (com.facebook.ale.p000native.ResponseCallback) r0
            r0.onSuccessfullCdnDownload(r15)
            goto L_0x0cc4
        L_0x0cb9:
            X.ByS r15 = (X.C24269ByS) r15
            java.lang.Object r0 = X.AnonymousClass3Ma.A0z(r15, r14)
            X.Cit r0 = (X.C25613Cit) r0
            X.C25613Cit.A00(r0, r15)
        L_0x0cc4:
            X.1Wu r0 = X.C27621Wu.A00
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C27446DfX.invoke(java.lang.Object):java.lang.Object");
    }

    public static void A00(String str, Iterator it) {
        ((C24491C6j) ((Map.Entry) it.next()).getValue()).A03(new C22953BWz(str));
    }
}
