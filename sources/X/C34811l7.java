package X;

import android.app.Activity;
import android.os.Bundle;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.1l7  reason: invalid class name and case insensitive filesystem */
public final class C34811l7 {
    public Map A00;
    public final AnonymousClass122 A01;
    public final AnonymousClass18K A02;
    public final AnonymousClass1QS A03;
    public final AnonymousClass10I A04;
    public final AnonymousClass00H A05;
    public final AnonymousClass00H A06;
    public final AnonymousClass00H A07;
    public final AnonymousClass00H A08;
    public final AnonymousClass00H A09;
    public final Map A0A;
    public final AnonymousClass1PM A0B;
    public final AnonymousClass00H A0C;
    public final Set A0D;
    public final Set A0E;

    public C34811l7(AnonymousClass1PM r2, AnonymousClass122 r3, AnonymousClass18K r4, AnonymousClass1QS r5, AnonymousClass10I r6, AnonymousClass00H r7, AnonymousClass00H r8, AnonymousClass00H r9, AnonymousClass00H r10, AnonymousClass00H r11, AnonymousClass00H r12, Map map, Map map2, Set set, Set set2) {
        C18070vi.A0d(r6, 1);
        C18070vi.A0d(r4, 2);
        C18070vi.A0d(r5, 3);
        C18070vi.A0d(r3, 4);
        C18070vi.A0d(r7, 5);
        C18070vi.A0d(map, 8);
        C18070vi.A0d(r2, 9);
        C18070vi.A0d(map2, 10);
        C18070vi.A0d(r8, 11);
        C18070vi.A0d(r9, 12);
        C18070vi.A0d(r10, 13);
        C18070vi.A0d(r11, 14);
        C18070vi.A0d(r12, 15);
        this.A04 = r6;
        this.A02 = r4;
        this.A03 = r5;
        this.A01 = r3;
        this.A06 = r7;
        this.A0D = set;
        this.A0E = set2;
        this.A0A = map;
        this.A0B = r2;
        this.A00 = map2;
        this.A0C = r8;
        this.A09 = r9;
        this.A08 = r10;
        this.A07 = r11;
        this.A05 = r12;
        Boolean bool = C17960vV.A01;
    }

    public C196289ul A02(String str, String str2) {
        C18070vi.A0d(str, 0);
        return ((C192029ne) this.A09.get()).A01(str, str2);
    }

    public void A03(Activity activity, AnonymousClass5XY r28, AnonymousClass206 r29, C20271AEe aEe, int i) {
        StringBuilder sb;
        String str;
        String str2;
        Integer num;
        String str3;
        Activity activity2 = activity;
        C18070vi.A0d(activity2, 0);
        AnonymousClass206 r14 = r29;
        C18070vi.A0d(r14, 2);
        C20271AEe aEe2 = aEe;
        C17960vV.A07(aEe2);
        String str4 = aEe2.A02;
        C196289ul A012 = ((C192029ne) this.A09.get()).A01(str4, aEe2.A00);
        if (A012 == null) {
            sb = new StringBuilder();
            str = "NativeFlowActionUtils/handleRequest -- can not recognize NFM action: ";
        } else {
            AnonymousClass5XY r0 = r28;
            if (this.A0D.contains(str4)) {
                AnonymousClass205 r1 = r14.A0v;
                AnonymousClass1BI r13 = r1.A00;
                String str5 = r1.A01;
                C18070vi.A0X(str5);
                long j = r14.A0x;
                C194419rh r9 = new C194419rh((Integer) null, (String) null, 0);
                UserJid A0I = r14.A0I();
                if (!(A012 instanceof AnonymousClass8nz)) {
                    str3 = "NativeFlowActionUtils/processCommerceNativeFlow. Base class for commerce action should be CommerceNativeFlowAction.";
                    Log.e(str3);
                }
                if ((r0 instanceof C94854lI) && (num = ((C94854lI) r0).A01) != null) {
                    if (C18020vd.A05(C18040vf.A02, (C18020vd) this.A05.get(), 11785) || num.intValue() == 5) {
                        r9 = new C194419rh(r9.A01, (String) null, num.intValue());
                    }
                }
                ((C19958A0p) this.A07.get()).A02(r9, str5);
                String obj = UUID.randomUUID().toString();
                C18070vi.A0X(obj);
                A00(A012, this, r13, r14, aEe2, obj, str4, ((C62242r5) this.A08.get()).A01(r14));
                ((AnonymousClass8nz) A012).A0H(activity2, r0, A0I, aEe2, str5, obj, j);
                return;
            } else if (!this.A0E.contains(str4)) {
                Bundle bundle = new Bundle();
                bundle.putString("nfm_action", str4);
                Class BVG = this.A03.A06().BVG(bundle);
                if (BVG == null) {
                    sb = new StringBuilder();
                    str = "NativeFlowActionUtils/handleRequest/processPaymentNativeFlow -- NFM action support class not found: ";
                } else {
                    int A013 = ((C62242r5) this.A08.get()).A01(r14);
                    String obj2 = UUID.randomUUID().toString();
                    C18070vi.A0X(obj2);
                    A00(A012, this, r14.A0v.A00, r14, aEe2, obj2, str4, A013);
                    A012.A0B(activity2, r0, r14, aEe2, BVG);
                    return;
                }
            } else if (aEe2.A00 != null) {
                Map map = this.A0A;
                if (map.containsKey(str4) && (str2 = (String) map.get(str4)) != null) {
                    int A014 = ((C62242r5) this.A08.get()).A01(r14);
                    String obj3 = UUID.randomUUID().toString();
                    C18070vi.A0X(obj3);
                    A00(A012, this, r14.A0v.A00, r14, aEe2, obj3, str2, A014);
                }
                A012.A0A(activity2, r0, r14, aEe2, i);
                return;
            } else {
                return;
            }
        }
        sb.append(str);
        sb.append(str4);
        str3 = sb.toString();
        Log.e(str3);
    }

    public boolean A04(AnonymousClass21L r6, String str) {
        C20277AEk aEk;
        C18070vi.A0d(r6, 0);
        C20285AEt aEt = r6.A00;
        if (aEt == null || (aEk = aEt.A06) == null || aEk.A03.size() != 1 || !str.equals(((C20253ADl) aEk.A03.get(0)).A01.A02)) {
            return false;
        }
        return true;
    }

    public static final void A00(C196289ul r5, C34811l7 r6, AnonymousClass1BI r7, AnonymousClass206 r8, C20271AEe aEe, String str, String str2, int i) {
        Integer num;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("cta", str2);
            r5.A0D(r8, aEe, str, jSONObject);
        } catch (JSONException e) {
            StringBuilder sb = new StringBuilder();
            sb.append("NativeFlowActionUtils/sendWamEvent/");
            sb.append(e.getMessage());
            Log.w(sb.toString());
        }
        if (!(r5 instanceof C170018ny)) {
            C190579lB r2 = (C190579lB) r6.A0C.get();
            String obj = jSONObject.toString();
            AnonymousClass1BI r3 = r7;
            if (C22971Dz.A0d(r7)) {
                num = Integer.valueOf(AnonymousClass9Q5.A00(r6.A0B.A02((UserJid) r3)));
            } else {
                num = null;
            }
            r2.A00(r3, num, obj, (String) null, 0, 4, i, true);
        }
    }

    public C196289ul A01(C166418cr r6) {
        String str;
        if ((r6.bitField1_ & 1) != 0) {
            C165858bs r0 = r6.buttonsMessage_;
            C165858bs r1 = r0;
            if (r0 == null) {
                r0 = C165858bs.DEFAULT_INSTANCE;
            }
            if (r0.buttons_ != null) {
                if (r1 == null) {
                    r1 = C165858bs.DEFAULT_INSTANCE;
                }
                for (C165228an r2 : r1.buttons_) {
                    if ((r2.bitField0_ & 8) != 0) {
                        C164458Yx r02 = r2.nativeFlowInfo_;
                        if (r02 == null) {
                            r02 = C164458Yx.DEFAULT_INSTANCE;
                        }
                        String str2 = r02.name_;
                        C18070vi.A0X(str2);
                        C164458Yx r03 = r2.nativeFlowInfo_;
                        if (r03 == null) {
                            r03 = C164458Yx.DEFAULT_INSTANCE;
                        }
                        C196289ul A022 = A02(str2, r03.paramsJson_);
                        if (A022 != null) {
                            return A022;
                        }
                    }
                }
                return null;
            }
        }
        if (!A89.A05(r6) || A89.A00(r6).interactiveMessageCase_ != 6) {
            return null;
        }
        C164818a7 A0S = A89.A00(r6).A0S();
        for (AnonymousClass8Z3 r22 : A0S.buttons_) {
            if ((r22.bitField0_ & 1) != 0) {
                String str3 = r22.name_;
                C18070vi.A0X(str3);
                C196289ul A023 = A02(str3, r22.buttonParamsJson_);
                if (A023 != null) {
                    return A023;
                }
            }
        }
        if ((A0S.bitField0_ & 1) == 0 || (str = A0S.messageParamsJson_) == null || str.length() == 0) {
            return null;
        }
        try {
            String optString = new JSONObject(str).optString(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE);
            C18070vi.A0b(optString);
            C196289ul A024 = A02(optString, str);
            if (A024 != null) {
                return A024;
            }
            return null;
        } catch (JSONException unused) {
            Log.e("NativeFlowActionUtils/getNativeFlowAction. NFM message has invalid params json");
            return null;
        }
    }
}
