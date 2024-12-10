package X;

import android.text.TextUtils;
import com.whatsapp.util.Log;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.Ach  reason: case insensitive filesystem */
public class C20989Ach implements AnonymousClass1O5 {
    public final int A00;
    public final Object A01;

    public C20989Ach(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public static void A00(AnonymousClass8GX r7, int i) {
        r7.A03.A0E(i, AnonymousClass11P.A01(r7.A02) + TimeUnit.DAYS.toMillis(1));
    }

    public void BrD(String str) {
        switch (this.A00) {
            case 0:
                Log.e("EmailVerificationXmppMethods/confirmEmail/onDeliveryFailure/delivery failure");
                ((C22501BAi) this.A01).Btp((Integer) null);
                return;
            case 1:
                Log.i("groupchatinfo/getgroupdescription/delivery fail");
                return;
            case 3:
                ((C26981Ug) this.A01).BrC(C17880vN.A0f("disconnected while waiting for response"));
                return;
            case 4:
                ((C30391dr) this.A01).resumeWith(C173558vH.A00);
                return;
            case 6:
                AnonymousClass8GX r3 = (AnonymousClass8GX) this.A01;
                AnonymousClass1DT r2 = r3.A00;
                C21576AmQ amQ = new C21576AmQ(0, "No Internet!");
                C191999na r0 = r3.A07;
                C198179xu.A00(r2, new C187779gM(2131897986, 2131897985, r0.A00(0, 500), r0.A01(0, 500), 0, 500), amQ, 1);
                return;
            case 7:
                Log.i("PushXmppMethod/clear config delivery failure");
                ((C22523BBg) this.A01).Bti();
                return;
            case 8:
                Log.i("clientActionLogUsingIQ/SetClientConfig delivery fail");
                ((AnonymousClass9ZI) ((C98494rF) this.A01).element).A00 = -2;
                return;
            default:
                return;
        }
    }

    public void Bt9(C29621ca r6, String str) {
        switch (this.A00) {
            case 0:
                int A012 = AnonymousClass8BW.A01(r6);
                C17900vP.A0i("EmailVerificationXmppMethods/confirmEmail/onError/", AnonymousClass000.A10(), A012);
                ((C22501BAi) this.A01).Btp(Integer.valueOf(A012));
                return;
            case 1:
                Log.i("groupchatinfo/getgroupdescription/error");
                return;
            case 2:
                ((AtomicInteger) this.A01).set(AnonymousClass8BW.A01(r6));
                return;
            case 3:
                C18070vi.A0d(r6, 1);
                ((C26981Ug) this.A01).BrF(r6);
                return;
            case 4:
                C18070vi.A0d(r6, 1);
                ((C30391dr) this.A01).resumeWith(new C173538vF(r6));
                return;
            case 5:
                return;
            case 6:
                try {
                    C29621ca A0K = r6.A0K("error");
                    C17960vV.A08(A0K, AnonymousClass000.A0y(" not found!", AnonymousClass000.A11("error")));
                    int A0A = A0K.A0A("code", 500);
                    AnonymousClass8GX.A00((AnonymousClass8GX) this.A01, new C21576AmQ(A0A, A0K.A0Q("text", "Unknown!")), A0A);
                    return;
                } catch (AnonymousClass1UI | NullPointerException e) {
                    AnonymousClass8GX.A00((AnonymousClass8GX) this.A01, e, 500);
                    return;
                }
            case 7:
                C17900vP.A0i("PushXmppMethod/clear config error/", AnonymousClass000.A10(), AnonymousClass8BW.A01(r6));
                ((C22523BBg) this.A01).Bti();
                return;
            default:
                int A013 = AnonymousClass8BW.A01(r6);
                C17900vP.A0i("clientActionLogUsingIQ/clientConfigSetError/", AnonymousClass000.A10(), A013);
                ((AnonymousClass9ZI) ((C98494rF) this.A01).element).A00 = -1;
                C18070vi.A0d(AnonymousClass001.A1I("clientActionLog/clientConfigSetError/", AnonymousClass000.A10(), A013), 0);
                return;
        }
    }

    public void C7Z(C29621ca r11, String str) {
        C191999na r1;
        int i;
        String str2;
        C48392Mh A0A;
        C42661yX r0;
        switch (this.A00) {
            case 0:
                Log.i("EmailVerificationXmppMethods/confirmEmail/success");
                ((C22501BAi) this.A01).onSuccess();
                return;
            case 1:
                Log.i("groupchatinfo/getgroupdescription/success");
                C29621ca A0I = r11.A0I();
                AnonymousClass1EC r7 = (AnonymousClass1EC) r11.A0F(AnonymousClass1EC.class, "from");
                if (r7 != null) {
                    AnonymousClass126 r5 = (AnonymousClass126) ((AnonymousClass12M) this.A01).A06.get();
                    C18070vi.A0d(A0I, 0);
                    C42661yX A0P = AnonymousClass8BW.A0P(A0I);
                    int A06 = r5.A0I.A06(r7);
                    AnonymousClass1M9 r2 = r5.A08;
                    AnonymousClass1E7 A0G = r2.A0G(r7);
                    if (A06 == 1) {
                        if (A0G == null || (r0 = A0G.A0M) == null) {
                            str2 = "groupmgr/onParentGroupDescription/new community";
                            Log.w(str2);
                            return;
                        }
                        String str3 = r0.A03;
                        AnonymousClass1EC A002 = ((C58632l0) r5.A0n.get()).A00(r7);
                        if (A002 != null && !TextUtils.equals(str3, A0P.A03)) {
                            Log.i("groupmgr/onParentGroupDescription/changed");
                            r2.A0f(r7, A0P);
                            C26991Uh r4 = r5.A0V;
                            AnonymousClass1PQ r3 = r5.A0h;
                            r4.BcH(r3.A0A(r7, A0P, (C62502rV) null, true), 3015);
                            A0A = r3.A0A(A002, A0P, (C62502rV) null, true);
                        } else {
                            return;
                        }
                    } else if (A0G == null) {
                        str2 = "groupmgr/onGroupDescription/new group";
                        Log.w(str2);
                        return;
                    } else if (!TextUtils.equals(A0G.A0M.A03, A0P.A03)) {
                        Log.i("groupmgr/onGroupDescription/changed");
                        r2.A0f(r7, A0P);
                        A0A = r5.A0h.A0A(r7, A0P, (C62502rV) null, false);
                    } else {
                        return;
                    }
                    r5.A0O(3006, A0A);
                    return;
                }
                return;
            case 3:
                C18070vi.A0d(r11, 1);
                ((C26981Ug) this.A01).BrF(r11);
                return;
            case 4:
                C18070vi.A0d(r11, 1);
                ((C30391dr) this.A01).resumeWith(new C173548vG(r11));
                return;
            case 6:
                try {
                    C29621ca A0K = r11.A0K("account");
                    C17960vV.A08(A0K, AnonymousClass000.A0y(" not found!", AnonymousClass000.A11("account")));
                    C29621ca A0K2 = A0K.A0K("link");
                    C17960vV.A08(A0K2, C17900vP.A0A("link", " not found!"));
                    int A0A2 = A0K2.A0A("status", 0);
                    int A0A3 = A0K2.A0A("redirection_type", 0);
                    AnonymousClass8GX r42 = (AnonymousClass8GX) this.A01;
                    if (A0A2 == 1) {
                        if (A0A3 != 0) {
                            if (A0A3 == 1) {
                                A00(r42, 2);
                            } else if (A0A3 == 2) {
                                A00(r42, 1);
                            }
                            AnonymousClass1DT r22 = r42.A00;
                            r1 = r42.A07;
                            int i2 = 2131897975;
                            if ((r1 instanceof AnonymousClass96N) || A0A3 != 1) {
                                i = 2131897974;
                            } else {
                                i2 = 2131887406;
                                i = 2131887405;
                            }
                            C198179xu.A00(r22, new C187779gM(i2, i, r1.A00(A0A3, 0), r1.A01(A0A3, 0), A0A3, 0), (Throwable) null, 0);
                            return;
                        }
                        A00(r42, 0);
                        AnonymousClass8BS.A1F("ViralityLinkViewModel", "postSuccessResult: unsupported redirection type");
                        AnonymousClass1DT r222 = r42.A00;
                        r1 = r42.A07;
                        int i22 = 2131897975;
                        if (r1 instanceof AnonymousClass96N) {
                        }
                        i = 2131897974;
                        C198179xu.A00(r222, new C187779gM(i22, i, r1.A00(A0A3, 0), r1.A01(A0A3, 0), A0A3, 0), (Throwable) null, 0);
                        return;
                    }
                    AnonymousClass8GX.A00(r42, AnonymousClass001.A13("Status is ", AnonymousClass000.A10(), A0A2), 500);
                    return;
                } catch (AnonymousClass1UI | NullPointerException e) {
                    AnonymousClass8GX.A00((AnonymousClass8GX) this.A01, e, 500);
                    return;
                }
            case 7:
                Log.i("PushXmppMethod/clear config success");
                ((C22523BBg) this.A01).onSuccess();
                return;
            case 8:
                Log.i("clientActionLogUsingIQ/read/client_config_set");
                return;
            default:
                return;
        }
    }

    public /* synthetic */ C22384B5n CM9(String str) {
        if (4 - this.A00 == 0) {
            C18070vi.A0d(str, 0);
        }
        return C20958AcC.A00;
    }
}
