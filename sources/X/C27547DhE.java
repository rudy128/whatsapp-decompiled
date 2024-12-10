package X;

import java.util.UUID;

/* renamed from: X.DhE  reason: case insensitive filesystem */
public final class C27547DhE extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ BXM this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C27547DhE(BXM bxm) {
        super(0);
        this.this$0 = bxm;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        String str;
        C3Z c3z;
        int i;
        int i2;
        int i3;
        C27547DhE.super.A07();
        this.this$0.A00.A0L.invoke(BWZ.A00);
        C22871BTf bTf = this.this$0.A00.A00.A04;
        if (bTf != null) {
            C18070vi.A0z(bTf, "null cannot be cast to non-null type com.facebook.wearable.mediastream.client.state.LinkedDeviceWrapper");
            C26127Csp csp = bTf.A00;
            if (csp != null) {
                C25845Cn1 cn1 = C24712CGy.A01;
                StringBuilder A10 = AnonymousClass000.A10();
                A10.append("[STREAMING]: Transport type = ");
                if (csp.A04()) {
                    str = "BTC";
                } else {
                    str = "WifiDirect";
                }
                cn1.A02("sup:StreamingStateDelegate", AnonymousClass000.A0y(str, A10));
                if (this.this$0.A00.A0G.A03 == AnonymousClass00R.A0N && csp.A04()) {
                    C26153CtL ctL = BQm.A0Q;
                    CXV A03 = ctL.A03();
                    if (A03 == null) {
                        c3z = null;
                    } else if (A03 instanceof BXD) {
                        c3z = ((BXD) A03).A01;
                    } else if (A03 instanceof BXC) {
                        c3z = ((BXC) A03).A00;
                    } else {
                        c3z = A03.A08;
                    }
                    if (!C18070vi.A18(c3z, C22945BWr.A00)) {
                        BXM bxm = this.this$0;
                        cn1.A02("sup:StreamingStateDelegate", "[STREAMING]: Attempt switch to wifi direct");
                        BQm bQm = bxm.A00;
                        CYR cyr = bQm.A0I;
                        if (cyr != null) {
                            C18100vl r8 = cyr.A01;
                            if (!C72453Mb.A1a(r8)) {
                                cyr.A00.Bj2(325398066, false);
                            }
                            C25822CmZ cmZ = C25822CmZ.A0B;
                            String A00 = cmZ.A00();
                            if (A00 != null) {
                                cyr.A01("app_cold_start_session_id", A00);
                            }
                            String A02 = cmZ.A02();
                            if (A02 != null) {
                                cyr.A01("app_warm_start_session_id", A02);
                            }
                            String A01 = cmZ.A01();
                            if (!C72453Mb.A1a(r8)) {
                                cyr.A01("app_call_session_id", A01);
                            }
                        }
                        CXV A032 = ctL.A03();
                        if (A032 != null) {
                            StringBuilder A102 = AnonymousClass000.A10();
                            A102.append("Validating peak power state before connecting: ");
                            Integer num = A032.A04;
                            if (num != null) {
                                i = num.intValue();
                            } else {
                                i = A032.A02;
                            }
                            cn1.A02("sup:StreamingStateDelegate", C17880vN.A0t(A102, i));
                            UUID fromString = UUID.fromString(A032.A00());
                            Integer num2 = A032.A04;
                            if (num2 != null) {
                                i2 = num2.intValue();
                            } else {
                                i2 = A032.A02;
                            }
                            if (i2 == 10) {
                                cn1.A02("sup:StreamingStateDelegate", AnonymousClass001.A1E(fromString, "Calling switchLink for ", AnonymousClass000.A10()));
                                if (cyr != null && !C72453Mb.A1a(cyr.A01)) {
                                    cyr.A00.markerPoint(325398066, "wifi_direct_connection_request");
                                }
                                CZ7 cz7 = bQm.A00.A05;
                                if (cz7 != null) {
                                    C18070vi.A0b(fromString);
                                    cz7.A01(C24337BzY.WIFI_DIRECT, fromString, new C27971Dp7(bxm));
                                }
                            } else {
                                cn1.A02("sup:StreamingStateDelegate", "Peak power not ideal. Do not switch to wifi direct");
                                if (cyr != null) {
                                    cyr.A01("failure_reason", "request_wifi_direct_peak_power_not_ideal");
                                    cyr.A00(3);
                                }
                                C22821Di r1 = bQm.A0K;
                                Integer num3 = A032.A04;
                                if (num3 != null) {
                                    i3 = num3.intValue();
                                } else {
                                    i3 = A032.A02;
                                }
                                r1.invoke(Integer.valueOf(i3));
                            }
                        }
                        cn1.A04("sup:StreamingStateDelegate", "[STREAMING]: LinkedDevice is null", (Throwable) null);
                        bQm.A00.A03 = BQm.A01(bQm);
                    }
                }
            }
        } else {
            C24712CGy.A01.A02("sup:StreamingStateDelegate", "[STREAMING]: Transport type = FeatureClient BTC");
        }
        return C27621Wu.A00;
    }
}
