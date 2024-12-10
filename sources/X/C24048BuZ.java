package X;

import java.nio.ByteBuffer;

/* renamed from: X.BuZ  reason: case insensitive filesystem */
public class C24048BuZ extends C26189CuF {
    /* JADX WARNING: type inference failed for: r6v9, types: [X.E2p, java.lang.Object, X.DPb] */
    /* JADX WARNING: type inference failed for: r6v15, types: [X.E2p, java.lang.Object, X.DPb] */
    public /* bridge */ /* synthetic */ void A05(C28476E2r e2r, C24829CLx cLx, C24978CSd cSd, int i) {
        C24069Buu buu;
        C27006DPc dPc = (C27006DPc) e2r;
        C26189CuF.A02(dPc);
        C24829CLx cLx2 = cLx;
        C24978CSd cSd2 = cSd;
        int i2 = i;
        if (cLx2 instanceof C24063Buo) {
            try {
                ByteBuffer wrap = ByteBuffer.wrap(C25352CeB.A00((byte[]) cLx2.A00));
                byte b = wrap.get();
                if (b == 1 || b == 0) {
                    byte[] A01 = dPc.A09.A01(BE6.A1W("server_app_traffic_secret", dPc.A0U), C26287Cwn.A0B("traffic upd", new byte[0], dPc.A02), dPc.A02);
                    dPc.A0U.put("server_app_traffic_secret", A01);
                    dPc.A0U.put("server_app_key", dPc.A09.A01(A01, C26287Cwn.A0B("key", new byte[0], 16), 16));
                    dPc.A0U.put("server_app_iv", dPc.A09.A01(A01, C26287Cwn.A0B("iv", new byte[0], 12), 12));
                    int i3 = dPc.A03 + 1;
                    dPc.A03 = i3;
                    Integer num = AnonymousClass00R.A01;
                    C25420CfS.A00(num, AnonymousClass001.A1I("Updated Server App Traffic Keys : Current Gen = ", AnonymousClass000.A10(), i3));
                    C25191Cai cai = dPc.A0A;
                    if (cai == null || cai.A00.available() <= 0) {
                        ? obj = new Object();
                        obj.A00(BE6.A1W("server_app_key", dPc.A0U), BE6.A1W("server_app_iv", dPc.A0U));
                        C26189CuF.A01(obj, dPc);
                        if (b == 1) {
                            byte[] A012 = C25352CeB.A01(new byte[]{0}, (byte) 24);
                            dPc.A0B.A01(A012, 0, A012.length, (byte) 23);
                            byte[] A09 = C26287Cwn.A09(dPc.A09, dPc, "traffic upd", new byte[0], BE6.A1W("client_app_traffic_secret", dPc.A0U));
                            dPc.A0U.put("client_app_traffic_secret", A09);
                            dPc.A0U.put("client_app_key", C26189CuF.A04(dPc.A09, A09));
                            dPc.A0U.put("client_app_iv", C26189CuF.A03(dPc.A09, A09));
                            int i4 = dPc.A01 + 1;
                            dPc.A01 = i4;
                            C25420CfS.A00(num, AnonymousClass001.A1I("Updated Client App Traffic Keys : Current Gen = ", AnonymousClass000.A10(), i4));
                            ? obj2 = new Object();
                            obj2.A00(BE6.A1W("client_app_key", dPc.A0U), BE6.A1W("client_app_iv", dPc.A0U));
                            C27006DPc.A00(obj2, dPc);
                        }
                        if (wrap.hasRemaining()) {
                            C24978CSd cSd3 = cSd2;
                            C24829CLx cLx3 = cLx2;
                            C27006DPc dPc2 = dPc;
                            buu = new C24069Buu(dPc2, cLx3, cSd3, "Key update message has more than expected bytes.", BE9.A0b("Key update message has more than expected bytes.", (byte) 80), i2);
                        } else {
                            return;
                        }
                    } else {
                        C24829CLx cLx4 = cLx2;
                        C27006DPc dPc3 = dPc;
                        buu = new C24069Buu(dPc3, cLx4, cSd2, "Unexpected Messages: Found pending handshake messages", BE9.A0b("Found unprocessed messages in handshake buffer.", (byte) 10), i2);
                    }
                } else {
                    C24829CLx cLx5 = cLx2;
                    C27006DPc dPc4 = dPc;
                    buu = new C24069Buu(dPc4, cLx5, cSd2, AnonymousClass001.A1I("Invalid key update type ", AnonymousClass000.A10(), b), BE9.A0b(AnonymousClass001.A1I("Invalid key update type ", AnonymousClass000.A10(), b), (byte) 10), i2);
                }
                throw buu;
            } catch (C219718c e) {
                throw new C24069Buu(dPc, cLx2, cSd2, "Receive key update failed.", e, i2);
            }
        } else {
            throw C26189CuF.A00(dPc, cLx2, cSd2, BE9.A0b("Unexpected event", (byte) 80), i2);
        }
    }
}
