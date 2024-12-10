package X;

import android.content.Context;
import com.facebook.commonavatarliveediting.leplayer.ale.AleLiveEditingPlayer$generateAvatar$1;
import com.facebook.commonavatarliveediting.leplayer.ale.AleLiveEditingPlayer$generateColorRamp$1;
import com.facebook.commonavatarliveediting.leplayer.ale.AleLiveEditingPlayer$replayFirstLiveEditingPlayerRequestAfterAvatarGen$1;
import com.facebook.commonavatarliveediting.leplayer.ale.AleLiveEditingPlayer$updatePresets$1;
import com.facebook.commonavatarliveediting.leplayer.ale.AleLiveEditingPlayer$updateSkeleton$1;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public final class BRE extends C25274CcM implements C28490E3u {
    public C25243Cbe A00;
    public WeakReference A01;
    public Map A02;
    public boolean A03;
    public boolean A04;
    public C25252Cbr A05;
    public final C26027Cql A06;
    public final C18560wh A07;
    public final AnonymousClass1OX A08;
    public final Context A09;

    public void A07(String str, Map map) {
        String A0y;
        if (this.A03) {
            this.A08 = AnonymousClass1D7.A09(this.A08, map);
            A0y = "[GenerateColorRamp] First generation hasnt happened yet, return safely";
        } else if (C18070vi.A18(this.A05, map) || map.isEmpty()) {
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("[GenerateColorRamp] Already generated/generating colorRamp with config: ");
            A10.append(map);
            A0y = AnonymousClass000.A0y(", safely return", A10);
        } else {
            C26294Cx6.A04("AleLiveEditingPlayer", AnonymousClass001.A1E(map, "[GenerateColorRamp] Generating ramps: ", AnonymousClass000.A10()));
            this.A01 = (this.A01 | 2) ^ 2;
            A03(new BR2(str));
            this.A03 = str;
            this.A05 = map;
            C27845Dmg dmg = new C27845Dmg(C24315BzC.Colorization, this, str, map);
            C25243Cbe cbe = this.A00;
            if (cbe == null || !cbe.A0G) {
                dmg.invoke();
                return;
            }
            AnonymousClass3MW.A1X(this.A07, new AleLiveEditingPlayer$generateColorRamp$1((C30391dr) null, dmg), this.A08);
            return;
        }
        C26294Cx6.A04("AleLiveEditingPlayer", A0y);
    }

    public void A08(String str, Map map) {
        if (this.A03) {
            this.A07 = AnonymousClass1D7.A09(this.A07, map);
        } else if (!map.isEmpty()) {
            C26294Cx6.A04("AleLiveEditingPlayer", AnonymousClass001.A1E(map, "[UpdatePresets]: ", AnonymousClass000.A10()));
            C27840Dmb dmb = new C27840Dmb(this, str, map);
            C25243Cbe cbe = this.A00;
            if (cbe == null || !cbe.A0G) {
                dmb.invoke();
                return;
            }
            AnonymousClass3MW.A1X(this.A07, new AleLiveEditingPlayer$updatePresets$1((C30391dr) null, dmb), this.A08);
        }
    }

    public void A09(String str, Map map) {
        if (this.A03) {
            this.A09 = AnonymousClass1D7.A09(this.A09, map);
        } else if (!map.isEmpty()) {
            C26294Cx6.A04("AleLiveEditingPlayer", AnonymousClass001.A1E(map, "[updateSkeleton]: ", AnonymousClass000.A10()));
            C27841Dmc dmc = new C27841Dmc(this, str, map);
            C25243Cbe cbe = this.A00;
            if (cbe == null || !cbe.A0G) {
                dmc.invoke();
                return;
            }
            AnonymousClass3MW.A1X(this.A07, new AleLiveEditingPlayer$updateSkeleton$1((C30391dr) null, dmc), this.A08);
        }
    }

    public void Bm1(C33 c33) {
        String str;
        String str2;
        String str3;
        C3B br8;
        if (c33 instanceof BO8) {
            str2 = "[AvatarLiveEditingNotification][AvatarUpdateBegin]";
        } else if (c33 instanceof BOB) {
            str2 = "[AvatarLiveEditingNotification][AvatarUpdateEnd]";
        } else {
            if (c33 instanceof BO5) {
                C26294Cx6.A04("AleLiveEditingPlayer", "[AvatarLiveEditingNotification][AvatarGenerationBegin]");
                if (C18070vi.A18(((BO5) c33).A00, this.A03)) {
                    String str4 = this.A03;
                    if (str4 != null) {
                        br8 = new BR3(str4);
                    } else {
                        throw C17880vN.A0g();
                    }
                } else {
                    return;
                }
            } else if (c33 instanceof BOC) {
                StringBuilder A10 = AnonymousClass000.A10();
                A10.append("[AvatarLiveEditingNotification][AvatarGenerationEnd] result: ");
                BOC boc = (BOC) c33;
                Integer num = boc.A00;
                switch (num.intValue()) {
                    case 1:
                        str3 = "CDL Not Ready";
                        break;
                    case 2:
                        str3 = "CDL Error";
                        break;
                    case 3:
                        str3 = "No Current Avatar";
                        break;
                    case 4:
                        str3 = "Unknown Request Id";
                        break;
                    case 5:
                        str3 = "Duplicate Request Id";
                        break;
                    case 6:
                        str3 = "Skipped Request";
                        break;
                    case 7:
                        str3 = "Internal Error";
                        break;
                    case 8:
                        str3 = "Unknown";
                        break;
                    default:
                        str3 = "Success";
                        break;
                }
                C26294Cx6.A04("AleLiveEditingPlayer", AnonymousClass000.A0y(str3, A10));
                String str5 = this.A03;
                String str6 = boc.A01;
                if (!C18070vi.A18(str5, str6)) {
                    str2 = "request id does not match, safely return";
                } else {
                    Integer num2 = AnonymousClass00R.A00;
                    if (num == num2) {
                        this.A03 = false;
                        C30451dy.A02(num2, AnonymousClass1OR.A00, new AleLiveEditingPlayer$replayFirstLiveEditingPlayerRequestAfterAvatarGen$1(this, (C30391dr) null), this.A08);
                        A03(new BR9(str6, boc.A02));
                        this.A01 |= 1;
                        A01();
                        return;
                    } else if (num == AnonymousClass00R.A0C || num == AnonymousClass00R.A01 || num == AnonymousClass00R.A15) {
                        A02();
                        br8 = new BR8(str6, str3);
                    } else {
                        return;
                    }
                }
            } else if (c33 instanceof BO6) {
                str2 = "[AvatarLiveEditingNotification][AvatarParametersUpdateBegin]";
            } else if (c33 instanceof BO9) {
                str2 = "[AvatarLiveEditingNotification][AvatarParametersUpdateEnd]";
            } else if (c33 instanceof BO7) {
                String str7 = this.A03;
                String str8 = ((BO7) c33).A00;
                if (C18070vi.A18(str7, str8)) {
                    A03(new BR7(str8));
                    str2 = "[AvatarLiveEditingNotification][AvatarRenderUpdateBegin]";
                } else {
                    return;
                }
            } else if (c33 instanceof BOA) {
                String str9 = this.A03;
                BOA boa = (BOA) c33;
                String str10 = boa.A01;
                if (C18070vi.A18(str9, str10)) {
                    StringBuilder A102 = AnonymousClass000.A10();
                    A102.append("[AvatarLiveEditingNotification][AvatarRenderUpdateEnd] result: ");
                    switch (boa.A00.intValue()) {
                        case 1:
                            str = "CDL Not Ready";
                            break;
                        case 2:
                            str = "CDL Error";
                            break;
                        case 3:
                            str = "No Current Avatar";
                            break;
                        case 4:
                            str = "Unknown Request Id";
                            break;
                        case 5:
                            str = "Duplicate Request Id";
                            break;
                        case 6:
                            str = "Skipped Request";
                            break;
                        case 7:
                            str = "Internal Error";
                            break;
                        case 8:
                            str = "Unknown";
                            break;
                        default:
                            str = "Success";
                            break;
                    }
                    C26294Cx6.A04("AleLiveEditingPlayer", AnonymousClass000.A0y(str, A102));
                    A03(new BR6(str10));
                    str2 = "[AvatarLiveEditingNotification][AvatarRenderUpdateEnd]";
                } else {
                    return;
                }
            } else {
                return;
            }
            A03(br8);
            return;
        }
        C26294Cx6.A04("AleLiveEditingPlayer", str2);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BRE(Context context, E4O e4o, C26027Cql cql, C18560wh r5, AnonymousClass1OX r6) {
        super(cql);
        C108985cd.A1D(cql, r6);
        this.A09 = context;
        this.A06 = cql;
        this.A08 = r6;
        this.A07 = r5;
        this.A01 = AnonymousClass3MW.A0z(e4o);
    }

    public static final LinkedHashMap A00(Map map, boolean z) {
        String str;
        LinkedHashMap A0b = C108995ce.A0b(map);
        Iterator A15 = AnonymousClass000.A15(map);
        while (A15.hasNext()) {
            Map.Entry A16 = AnonymousClass000.A16(A15);
            StringBuilder A10 = AnonymousClass000.A10();
            String A0x = C17880vN.A0x(A16);
            if (z) {
                A10.append(A0x);
                str = "/parameter";
            } else {
                A10.append(A0x);
                str = "/value";
            }
            A0b.put(AnonymousClass000.A0y(str, A10), A16.getValue());
        }
        LinkedHashMap A0b2 = C108995ce.A0b(A0b);
        Iterator A152 = AnonymousClass000.A15(A0b);
        while (A152.hasNext()) {
            Map.Entry A162 = AnonymousClass000.A16(A152);
            Object key = A162.getKey();
            StringBuilder A102 = AnonymousClass000.A10();
            A102.append("FLOAT_RANGE:float:");
            A102.append(AnonymousClass000.A04(A162.getValue()));
            A0b2.put(key, A102.toString());
        }
        return A0b2;
    }

    public void A06() {
        super.A06();
        WeakReference weakReference = this.A01;
        E4O e4o = (E4O) weakReference.get();
        if (e4o != null) {
            EAU eau = ((DBR) e4o).A00;
            if (eau != null) {
                eau.CQB(this);
            }
            C18070vi.A11("aleBridge");
            throw null;
        }
        E4O e4o2 = (E4O) weakReference.get();
        if (e4o2 != null) {
            EAU eau2 = ((DBR) e4o2).A00;
            if (eau2 != null) {
                eau2.BEr();
                return;
            }
            C18070vi.A11("aleBridge");
            throw null;
        }
    }

    public boolean A0A(C25252Cbr cbr) {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("[GenerateAvatar] requestId: ");
        String str = cbr.A02;
        C26294Cx6.A04("AleLiveEditingPlayer", AnonymousClass000.A0y(str, A10));
        if (this.A05 == null) {
            this.A05 = cbr;
        }
        this.A04 = cbr.A03;
        this.A03 = str;
        this.A03 = true;
        A03(new BR5(str));
        int i = 5;
        if (cbr.A00().containsKey("root")) {
            i = 7;
        }
        this.A00 = i;
        this.A01 &= 4;
        C27838DmZ dmZ = new C27838DmZ(C24315BzC.Generation, cbr, this);
        C25243Cbe cbe = this.A00;
        if (cbe == null || !cbe.A0G) {
            dmZ.invoke();
            return true;
        }
        AnonymousClass3MW.A1X(this.A07, new AleLiveEditingPlayer$generateAvatar$1((C30391dr) null, dmZ), this.A08);
        return true;
    }
}
