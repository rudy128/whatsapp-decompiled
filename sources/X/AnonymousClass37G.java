package X;

import android.content.SharedPreferences;
import android.util.Pair;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.37G  reason: invalid class name */
public class AnonymousClass37G implements AnonymousClass1O5 {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public AnonymousClass37G(Object obj, Object obj2, int i) {
        this.A00 = i;
        this.A02 = obj2;
        this.A01 = obj;
    }

    public static void A00(AnonymousClass37G r3) {
        ((AnonymousClass1DS) r3.A02).A0E(new C127146ds((Boolean) null, false));
    }

    public void BrD(String str) {
        Object obj;
        switch (this.A00) {
            case 0:
                A00(this);
                return;
            case 1:
                Log.e("EncryptionProtocolHelper failed with a server error");
                ((C72373Lr) this.A02).BrA();
                return;
            case 2:
                ((C61742qB) this.A02).A00 = false;
                return;
            case 3:
                C17900vP.A0f("LocationSubscriptionSendMethods/subscribe/onDeliveryFailure; iqId=", str, AnonymousClass000.A10());
                return;
            case 4:
                ((C57862jl) this.A02).A00();
                return;
            case 5:
                ((AnonymousClass1DS) this.A01).A0E(AnonymousClass000.A0h());
                return;
            case 6:
                Log.e("DisclosureResultSendWorker/onDeliveryFailure");
                int i = ((C20001A2q) this.A02).A01.A00;
                C25113CYi cYi = (C25113CYi) this.A01;
                if (i > 4) {
                    obj = new C162168Jj();
                } else {
                    obj = new Object();
                }
                cYi.A00(obj);
                return;
            default:
                C17900vP.A0f("TwoFactorXmppMethods/sendGetTwoFactorAuth/onDeliveryFailure; iq=", str, AnonymousClass000.A10());
                ((C23570Bly) this.A02).A04(new RuntimeException(AnonymousClass001.A1H("Delivery failure: iqId=", str, AnonymousClass000.A10())));
                return;
        }
    }

    public void Bt9(C29621ca r4, String str) {
        Object obj;
        Number number;
        switch (this.A00) {
            case 0:
                A00(this);
                return;
            case 1:
                Log.e("EncryptionProtocolHelper failed with a server error");
                ((C72373Lr) this.A02).Bsu(new C122936Sm(r4, str));
                return;
            case 2:
                C17880vN.A1B(C19830z4.A00(((C61742qB) this.A02).A02), "1on1_invite_code_from_referrer");
                return;
            case 3:
                int A002 = C60482o6.A00(r4);
                StringBuilder A10 = AnonymousClass000.A10();
                A10.append("LocationSubscriptionSendMethods/subscribe/onError; iqId=");
                A10.append(str);
                C17900vP.A0j(", error=", A10, A002);
                C17900vP.A0i("locationssubscriberesponsehandler/error ", AnonymousClass000.A10(), A002);
                return;
            case 4:
                ((C57862jl) this.A02).A00();
                return;
            case 5:
                ((AnonymousClass1DS) this.A01).A0E(AnonymousClass000.A0h());
                return;
            case 6:
                C18070vi.A0d(r4, 1);
                Pair A012 = C60482o6.A01(r4);
                C17900vP.A0X(A012, "DisclosureResultSendWorker/onError ", AnonymousClass000.A10());
                if (!(A012 == null || (number = (Number) A012.first) == null || number.intValue() != 400)) {
                    Log.i("DisclosureResultSendWorker/onError invalid stanza");
                }
                int i = ((C20001A2q) this.A02).A01.A00;
                C25113CYi cYi = (C25113CYi) this.A01;
                if (i > 4) {
                    obj = new C162168Jj();
                } else {
                    obj = new Object();
                }
                cYi.A00(obj);
                return;
            default:
                C17900vP.A0f("TwoFactorXmppMethods/sendGetTwoFactorAuth/onError; iq=", str, AnonymousClass000.A10());
                ((C23570Bly) this.A02).A04(new C122936Sm(r4, str));
                return;
        }
    }

    /* JADX WARNING: type inference failed for: r7v0, types: [java.lang.Object, X.2rm] */
    public void C7Z(C29621ca r16, String str) {
        int i;
        long j;
        AnonymousClass1DS r3;
        C127146ds r2;
        String str2;
        C29621ca r8 = r16;
        String str3 = str;
        switch (this.A00) {
            case 0:
                try {
                    if ("result".equals(C29621ca.A02(r8, PublicKeyCredentialControllerUtility.JSON_KEY_TYPE))) {
                        r3 = (AnonymousClass1DS) this.A02;
                        C29621ca A0K = r8.A0K("accept");
                        if (A0K != null) {
                            str2 = C29621ca.A02(A0K, "optout");
                        } else {
                            str2 = null;
                        }
                        r2 = new C127146ds(Boolean.valueOf("true".equals(str2)), true);
                    } else {
                        r3 = (AnonymousClass1DS) this.A02;
                        r2 = new C127146ds((Boolean) null, false);
                    }
                    r3.A0E(r2);
                    return;
                } catch (AnonymousClass1UI unused) {
                    A00(this);
                    return;
                }
            case 1:
                ((C72373Lr) this.A02).C7l(new C134676qy(AnonymousClass7GR.A00(r8), r8));
                return;
            case 2:
                C18070vi.A0d(r8, 1);
                AnonymousClass9F7 r22 = (AnonymousClass9F7) this.A01;
                C18070vi.A0d(r22, 2);
                C29621ca.A04(r8, "iq");
                Object obj = r22.A00;
                ? obj2 = new Object();
                UserJid userJid = (UserJid) obj2.A05(r8, UserJid.class, -9007199254740991L, 9007199254740991L, (Object) null, new String[]{"invite", "sender", PublicKeyCredentialControllerUtility.JSON_KEY_USER}, false);
                if (new C21160AfV(obj, C60992ow.A00, 0).BCF(r8, obj2) != null) {
                    C61742qB.A00((C61742qB) this.A02, userJid);
                    return;
                }
                throw AnonymousClass1O9.A00(obj2);
            case 3:
                C17900vP.A0f("LocationSubscriptionSendMethods/subscribe/onSuccess; iqId=", str3, AnonymousClass000.A10());
                int i2 = 0;
                C29621ca A0J = r8.A0J(0);
                if (A0J != null) {
                    String A022 = C29621ca.A02(A0J, "duration");
                    if (A022 != null) {
                        i = Integer.parseInt(A022);
                    } else {
                        i = 0;
                    }
                    C29621ca A0J2 = A0J.A0J(0);
                    if (A0J2 != null) {
                        List A0R = A0J2.A0R("participant");
                        ArrayList A14 = AnonymousClass000.A14(A0R);
                        Iterator it = A0R.iterator();
                        while (it.hasNext()) {
                            A14.add(C17880vN.A0a(it).A0F(UserJid.class, "jid"));
                        }
                        C27101Us r6 = (C27101Us) this.A01;
                        C27131Uv r82 = (C27131Uv) r6.A00.get();
                        AnonymousClass1BI r9 = ((C57262in) this.A02).A00;
                        StringBuilder A10 = AnonymousClass000.A10();
                        A10.append("LocationSharingManager/onReceiveServerSharingList; jid=");
                        A10.append(r9);
                        A10.append("; participants.size=");
                        C17900vP.A0o(A10, A14.size());
                        HashSet A12 = C17880vN.A12();
                        synchronized (r82.A0T) {
                            Map A05 = C27131Uv.A05(r82);
                            Map map = (Map) A05.get(r9);
                            if (map != null) {
                                A12.addAll(map.keySet());
                                A12.removeAll(new HashSet(A14));
                                HashSet A122 = C17880vN.A12();
                                Iterator it2 = A12.iterator();
                                while (it2.hasNext()) {
                                    UserJid A0T = C17880vN.A0T(it2);
                                    C27131Uv.A0D(r82, (C54392e4) map.remove(A0T));
                                    A122.add(A0T);
                                }
                                C27121Uu.A01(r9, r82.A0K, A122, false);
                                if (map.isEmpty()) {
                                    A05.remove(r9);
                                }
                                if (!A12.isEmpty()) {
                                    C27131Uv.A0F(r82, A05);
                                }
                            }
                        }
                        Iterator it3 = A12.iterator();
                        while (it3.hasNext()) {
                            UserJid A0T2 = C17880vN.A0T(it3);
                            for (C72393Lt C2g : r82.A0X) {
                                C2g.C2g(r9, A0T2);
                            }
                        }
                        if (!A12.isEmpty()) {
                            C27131Uv.A0B(r82);
                        }
                        Log.i("locationssubscriberesponsehandler/subscription list updated");
                        Iterator it4 = A0R.iterator();
                        while (it4.hasNext()) {
                            C29621ca A0a = C17880vN.A0a(it4);
                            UserJid userJid2 = (UserJid) A0a.A0F(UserJid.class, "jid");
                            C29621ca A0J3 = A0a.A0J(0);
                            if (A0J3 != null) {
                                C17900vP.A0Y(userJid2, "LocationSubscriptionSendMethods/subscribe/handleLocationUpdate; from=", AnonymousClass000.A10());
                                C29621ca A0J4 = A0J3.A0J(0);
                                if (A0J4 == null || !"enc".equals(A0J4.A00)) {
                                    throw AnonymousClass1UI.A01("invalid location node");
                                }
                                C194059r6 A002 = AnonymousClass9RW.A00(A0J4);
                                String A023 = C29621ca.A02(A0J3, "elapsed");
                                if (A023 != null) {
                                    j = (long) Integer.parseInt(A023);
                                } else {
                                    j = 0;
                                }
                                ((C33611j6) r6.A01.get()).A00(userJid2, A002, j);
                            }
                        }
                    }
                    i2 = i;
                }
                ((C57262in) this.A02).A00(i2 * 1000);
                return;
            case 4:
                C57862jl r23 = (C57862jl) this.A02;
                r23.A01.A06((C59412mG) this.A01);
                r23.A00();
                return;
            case 5:
                C18070vi.A0d(r8, 1);
                C60112nP r7 = (C60112nP) this.A02;
                C29621ca A0K2 = r8.A0L("privacy").A0K("list");
                if (A0K2 != null) {
                    HashSet A123 = C17880vN.A12();
                    String A024 = C29621ca.A02(A0K2, "dhash");
                    Iterator A03 = C29621ca.A03(A0K2, PublicKeyCredentialControllerUtility.JSON_KEY_USER);
                    while (A03.hasNext()) {
                        A123.add(C17880vN.A0a(A03).A0G(UserJid.class, "jid"));
                    }
                    r7.A04(A024, A123, false);
                }
                ((AnonymousClass1DS) this.A01).A0E(true);
                return;
            case 6:
                C18070vi.A0d(r8, 1);
                Log.i("DisclosureResultSendWorker/onSuccess");
                C29621ca A0K3 = r8.A0K("trackable");
                if (A0K3 != null) {
                    A0K3.A09("result");
                }
                ((C25113CYi) this.A01).A00(new C162178Jk());
                return;
            default:
                C17900vP.A0f("TwoFactorXmppMethods/sendGetTwoFactorAuth/onSuccess; iq=", str3, AnonymousClass000.A10());
                C29621ca A0K4 = r8.A0K("2fa");
                C17960vV.A07(A0K4);
                C30901eh r1 = (C30901eh) ((C30891eg) this.A01).A02.get();
                A0K4.A0K("code");
                boolean z = true;
                if (A0K4.A0K("email") == null) {
                    z = false;
                }
                SharedPreferences.Editor edit = C30901eh.A00(r1).edit();
                int i3 = 2;
                if (z) {
                    i3 = 1;
                }
                C17880vN.A1C(edit, "two_factor_auth_email_set", i3);
                ((C23570Bly) this.A02).A03((Object) null);
                return;
        }
    }

    public /* synthetic */ C22384B5n CM9(String str) {
        return C20958AcC.A00;
    }
}
