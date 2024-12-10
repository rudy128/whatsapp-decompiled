package X;

import android.content.Context;
import java.util.List;

/* renamed from: X.Dns  reason: case insensitive filesystem */
public final class C27917Dns extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ BXK this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C27917Dns(BXK bxk) {
        super(0);
        this.this$0 = bxk;
    }

    public static C24410C2i A00(String str, String str2) {
        return new C24410C2i(new C22951BWx(str), str2);
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        String str;
        C27917Dns.super.A07();
        BXK bxk = this.this$0;
        BQm bQm = bxk.A01;
        bQm.A00.A06 = bQm.A0G.A03;
        Boolean bool = C25459CgC.A00;
        if (bool != null && !bool.equals(false)) {
            C25845Cn1 cn1 = C24712CGy.A01;
            cn1.A02("sup:DiscoveredStateDelegate", "[DISCOVERED] Version enforcement enabled");
            if (!C72463Mc.A1Y(C25459CgC.A01)) {
                cn1.A02("sup:DiscoveredStateDelegate", AnonymousClass001.A1H("[DISCOVERED] Minimum app version is ", (String) null, AnonymousClass000.A10()));
                BQm bQm2 = bxk.A01;
                if (bQm2.A0G.A00 == 4) {
                    String A00 = C25630CjG.A00.A00(bQm2.A00.A00);
                    cn1.A02("sup:DiscoveredStateDelegate", AnonymousClass001.A1H("[DISCOVERED] MWA version is ", A00, AnonymousClass000.A10()));
                    if (A00.length() != 0) {
                        String str2 = C25459CgC.A03;
                        cn1.A02("sup:DiscoveredStateDelegate", AnonymousClass001.A1H("[DISCOVERED] Min MWA version is ", str2, AnonymousClass000.A10()));
                        if (str2 == null || str2.length() == 0) {
                            StringBuilder A10 = AnonymousClass000.A10();
                            C17890vO.A10("[DISCOVERED] Minimum MWA version \"", str2, "\" is null or empty", A10);
                            throw A00("OUTDATED_MWA_VERSION", A10.toString());
                        } else if (C25459CgC.A01(A00, str2)) {
                            C25459CgC.A00(true);
                            throw A00("OUTDATED_MWA_VERSION", AnonymousClass000.A0y(" and out of date", AnonymousClass8BW.A0o("[DISCOVERED] MWA version is ", A00)));
                        } else {
                            String str3 = C24459C4z.A02;
                            cn1.A02("sup:DiscoveredStateDelegate", AnonymousClass001.A1H("[DISCOVERED] Firmware version is ", str3, AnonymousClass000.A10()));
                            if (str3 == null || str3.length() == 0) {
                                StringBuilder A102 = AnonymousClass000.A10();
                                C17890vO.A10("[DISCOVERED] Glasses firmware version \"", str3, "\" is null or empty", A102);
                                throw A00("OUTDATED_GLASSES_FIRMWARE", A102.toString());
                            }
                            String str4 = C25459CgC.A02;
                            cn1.A02("sup:DiscoveredStateDelegate", AnonymousClass001.A1H("[DISCOVERED] Min Firmware version is ", str4, AnonymousClass000.A10()));
                            if (str4 == null || str4.length() == 0) {
                                StringBuilder A103 = AnonymousClass000.A10();
                                C17890vO.A10("[DISCOVERED] Min Glasses firmware version \"", str4, "\" is null or empty", A103);
                                throw A00("OUTDATED_GLASSES_FIRMWARE", A103.toString());
                            } else if (C25459CgC.A01(str3, str4)) {
                                C25459CgC.A00(true);
                                StringBuilder A104 = AnonymousClass000.A10();
                                A104.append("[DISCOVERED] Glasses firmware is ");
                                A104.append(str3);
                                throw A00("OUTDATED_GLASSES_FIRMWARE", AnonymousClass000.A0y(" and out of date", A104));
                            } else {
                                C25459CgC.A00(false);
                            }
                        }
                    } else {
                        StringBuilder A105 = AnonymousClass000.A10();
                        C17890vO.A10("[DISCOVERED] MWA version \"", A00, "\" is null or empty", A105);
                        throw A00("OUTDATED_MWA_VERSION", A105.toString());
                    }
                } else {
                    Context context = bQm2.A00.A00;
                    String packageName = context.getPackageName();
                    C18070vi.A0X(packageName);
                    List A002 = CCQ.A00(context, packageName);
                    if (A002 != null) {
                        str = C29431cG.A0h(".", A002, (C22821Di) null);
                    } else {
                        str = null;
                    }
                    cn1.A02("sup:DiscoveredStateDelegate", AnonymousClass001.A1H("[DISCOVERED] App version is ", str, AnonymousClass000.A10()));
                    if (str == null || str.length() == 0) {
                        StringBuilder A106 = AnonymousClass000.A10();
                        A106.append("[DISCOVERED] App version \"");
                        A106.append(str);
                        throw A00("OUTDATED_APP_VERSION", AnonymousClass000.A0y("\" is null or empty", A106));
                    }
                    throw new C24410C2i(new C22951BWx("OUTDATED_APP_VERSION"), "[DISCOVERED] Minimum app version is null or empty");
                }
            } else {
                throw new C24410C2i(new C22951BWx("OUTDATED_APP_VERSION"), "[DISCOVERED] App version upgrade is required");
            }
        }
        BQm bQm3 = this.this$0.A01;
        if (bQm3.A0G.A03 == AnonymousClass00R.A0N) {
            bQm3.A0M.invoke(new C22937BWf(false));
        }
        return C27621Wu.A00;
    }
}
