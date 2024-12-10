package X;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.Aeo  reason: case insensitive filesystem */
public class C21120Aeo implements AnonymousClass1TI {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;

    public C21120Aeo(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.A00 = i;
        this.A01 = obj2;
        this.A02 = obj;
        this.A03 = obj3;
        this.A04 = obj4;
    }

    public final void accept(Object obj) {
        C21132Af0 af0;
        Throwable r2;
        String str;
        C195709tm r13;
        C20119A8c a8c;
        A2N a2n;
        C22521BBe bBe;
        Object obj2;
        String str2;
        Object A0h;
        Object obj3;
        Object obj4 = obj;
        switch (this.A00) {
            case 0:
                ((C33251iW) this.A01).A0L((Uri) obj4, (AnonymousClass1L9) this.A03, (AnonymousClass21V) this.A04, (WeakReference) this.A02);
                return;
            case 1:
                File file = (File) this.A02;
                AnonymousClass34B r5 = (AnonymousClass34B) this.A03;
                C53092by r4 = (C53092by) this.A04;
                Number number = (Number) obj4;
                C17900vP.A0Y(number, "external-mutations-uploader: media-job-finished for upload, mediaJobResult: ", AnonymousClass000.A10());
                long length = file.length();
                file.delete();
                r5.A05();
                int intValue = number.intValue();
                if (intValue != 0) {
                    if (C137266vB.A01(intValue)) {
                        boolean A1T = AnonymousClass000.A1T(intValue, 8);
                        af0 = r4.A00;
                        r2 = new AnonymousClass2E1("prepare-syncd-mutations-helper/startPrepareJob/onTransientFailure: Upload error", (Throwable) null, A1T);
                    }
                    af0 = r4.A00;
                    r2 = new AnonymousClass2E0("prepare-syncd-mutations-helper/startPrepareJob/onFailed: Upload error", (Exception) null);
                } else {
                    C55612g5 A032 = r5.A03();
                    if (A032 != null) {
                        C196299un r0 = A032.A02;
                        String A042 = r0.A04();
                        String A033 = r0.A03();
                        String A06 = r0.A06();
                        String A05 = r0.A05();
                        C61382pa A002 = r0.A00();
                        if (A002 == null || TextUtils.isEmpty(A042) || TextUtils.isEmpty(A033) || TextUtils.isEmpty(A06) || TextUtils.isEmpty(A05)) {
                            StringBuilder A10 = AnonymousClass000.A10();
                            A10.append("create-external-blob-reference response is missing field/s; handle = ");
                            A10.append(A042);
                            A10.append("; directPath = ");
                            A10.append(A033);
                            A10.append("; mediaHash = ");
                            A10.append(A06);
                            A10.append("; mediaEncHash = ");
                            A10.append(A05);
                            C17900vP.A0X(A002, "; mediaKey = ", A10);
                        } else {
                            C23624Bmt A0N = C165718be.DEFAULT_INSTANCE.A0N();
                            C23581BmB A034 = C17900vP.A03(A0N, A002.A01);
                            C165718be r1 = (C165718be) A0N.A00;
                            r1.bitField0_ |= 1;
                            r1.mediaKey_ = A034;
                            C165718be r12 = (C165718be) C17880vN.A0G(A0N);
                            A033.getClass();
                            r12.bitField0_ |= 2;
                            r12.directPath_ = A033;
                            C165718be r14 = (C165718be) C17880vN.A0G(A0N);
                            A042.getClass();
                            r14.bitField0_ |= 4;
                            r14.handle_ = A042;
                            C165718be r15 = (C165718be) C17880vN.A0G(A0N);
                            r15.bitField0_ |= 8;
                            r15.fileSizeBytes_ = length;
                            C23581BmB A0B = AnonymousClass8BW.A0B(A0N, A06, 0);
                            C165718be r16 = (C165718be) A0N.A00;
                            r16.bitField0_ |= 16;
                            r16.fileSha256_ = A0B;
                            C23581BmB A0B2 = AnonymousClass8BW.A0B(A0N, A05, 0);
                            C165718be r17 = (C165718be) A0N.A00;
                            r17.bitField0_ |= 32;
                            r17.fileEncSha256_ = A0B2;
                            C165718be r3 = (C165718be) A0N.A0C();
                            if (r3 != null) {
                                C17900vP.A0Y(r3, "external-mutations-uploader: media-job-finished for upload with response = ", AnonymousClass000.A10());
                                C58182kH r22 = r4.A01;
                                r22.A05 = r3;
                                r22.A09 = null;
                                r4.A00.A0B(r22.A00());
                                return;
                            }
                        }
                    }
                    Log.i("external-mutations-uploader: media-job-finished for upload but response has missing fields");
                    af0 = r4.A00;
                    r2 = new AnonymousClass2E0("prepare-syncd-mutations-helper/startPrepareJob/onFailed: Upload error", (Exception) null);
                }
                af0.A0C(r2);
                return;
            case 2:
                AQN aqn = (AQN) this.A01;
                Context context = (Context) this.A02;
                AnonymousClass206 r52 = (AnonymousClass206) this.A03;
                C20285AEt aEt = (C20285AEt) this.A04;
                if (AnonymousClass000.A1Y(obj4)) {
                    AER aer = aEt.A07;
                    if (aer != null) {
                        ((C192559ob) aqn.A06.get()).A01(aer.A00, AnonymousClass9QG.A00(), new C22273B1b(context, aqn, r52, aEt));
                        return;
                    }
                    return;
                }
                aqn.A04.get();
                C19957A0o.A00(context);
                return;
            case 3:
                a8c = (C20119A8c) this.A01;
                a2n = (A2N) this.A02;
                r13 = (C195709tm) this.A03;
                bBe = (C22521BBe) this.A04;
                AnonymousClass1D6 r6 = (AnonymousClass1D6) obj4;
                C18070vi.A0d(r6, 5);
                C20081A6h A0V = AnonymousClass8BR.A0V(a8c.A0I);
                boolean A1Y = AnonymousClass000.A1Y(r6.first);
                str = a2n.A05;
                int hashCode = str.hashCode();
                A0V.A07(hashCode, "psl_cache_hit", A1Y);
                if (AnonymousClass000.A1Y(r6.first)) {
                    AnonymousClass8BR.A0V(a8c.A0M).A08(hashCode, 2);
                    obj2 = r6.second;
                    if (obj2 == null) {
                        throw C17890vO.A0K();
                    }
                } else {
                    C20119A8c.A01(a8c, a2n, r13, bBe);
                    return;
                }
                break;
            default:
                a8c = (C20119A8c) this.A01;
                a2n = (A2N) this.A02;
                r13 = (C195709tm) this.A03;
                bBe = (C22521BBe) this.A04;
                AnonymousClass1D6 r62 = (AnonymousClass1D6) obj4;
                C18070vi.A0d(r62, 5);
                short s = 3;
                if (AnonymousClass000.A1Y(r62.first)) {
                    s = 2;
                }
                C20081A6h A0V2 = AnonymousClass8BR.A0V(a8c.A0M);
                str = a2n.A05;
                A0V2.A08(str.hashCode(), s);
                if (AnonymousClass000.A1Y(r62.first)) {
                    obj2 = r62.second;
                    if (obj2 == null) {
                        throw C17890vO.A0K();
                    }
                } else {
                    return;
                }
                break;
        }
        String str3 = (String) obj2;
        UserJid userJid = a2n.A02;
        UserJid userJid2 = userJid;
        String str4 = a2n.A08;
        String str5 = str4;
        LinkedHashMap A0B3 = AnonymousClass1D7.A0B(AnonymousClass1D6.A01("chat_jid", userJid), AnonymousClass1D6.A01("key_msg_id", str4));
        C18070vi.A0d(A0B3, 0);
        HashMap hashMap = ((AnonymousClass9XH) a8c.A0E.get()).A00;
        hashMap.clear();
        hashMap.putAll(A0B3);
        AnonymousClass1D6[] r9 = new AnonymousClass1D6[17];
        String str6 = a2n.A06;
        String str7 = a2n.A04;
        if (C20119A8c.A07(str6, str7)) {
            str2 = "navigate";
        } else {
            str2 = "INIT";
        }
        AnonymousClass1D6.A03("action", str2, r9, 0);
        if (C20119A8c.A07(str6, str7)) {
            Map map = a2n.A0A;
            Object obj5 = null;
            if (map != null) {
                obj3 = map.get("screen");
            } else {
                obj3 = null;
            }
            if (map != null) {
                obj5 = map.get("data");
            }
            AnonymousClass1D6[] r142 = new AnonymousClass1D6[2];
            AnonymousClass1D6[] r63 = new AnonymousClass1D6[2];
            AnonymousClass1D6.A03(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, obj3, r63, 0);
            AnonymousClass1D6.A03(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "screen", r63, 1);
            AnonymousClass1D6.A03("next", AnonymousClass1D7.A0B(r63), r142, 0);
            AnonymousClass1D6.A03("data", obj5, r142, 1);
            A0h = AnonymousClass1D7.A0B(r142);
        } else {
            A0h = C108975cc.A0h("business_payload", C108975cc.A0h("action", "INIT"));
        }
        AnonymousClass1D6.A03("action_payload", A0h, r9, 1);
        AnonymousClass1D6.A03("message_id", str5, r9, 2);
        String str8 = a2n.A09;
        C72463Mc.A1J("session_id", str8, r9);
        String A1H = AnonymousClass001.A1H("wae", str8, AnonymousClass000.A10());
        C18070vi.A0d(A1H, 0);
        String A0Y = AnonymousClass8BY.A0Y(A1H);
        C18070vi.A0X(A0Y);
        AnonymousClass8BW.A1L("product_qpl_session_id", A0Y, r9);
        A2N.A00(a2n, userJid2, str6, str, r9);
        String str9 = r13.A00;
        r9[11] = AnonymousClass1D6.A01("extension_status", str9);
        r9[12] = AnonymousClass1D6.A01("user_locale", a8c.A0A.A06());
        AnonymousClass1D6[] r122 = new AnonymousClass1D6[2];
        AnonymousClass1D6.A03(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "modal", r122, 0);
        AnonymousClass1D6.A03("modal_type", "bottom_sheet", r122, 1);
        AnonymousClass8BY.A1V(r9, C108975cc.A0h("style", AnonymousClass1D7.A0B(r122)));
        r9[16] = AnonymousClass1D6.A01("flow_json_version", Integer.valueOf(r13.A01));
        LinkedHashMap A0B4 = AnonymousClass1D7.A0B(r9);
        boolean A18 = C18070vi.A18(str9, "DRAFT");
        C193199ph A003 = AnonymousClass9Q7.A00(str5, str);
        AnonymousClass00H r11 = a8c.A0N;
        String str10 = A003.A00;
        C192819p2 A004 = ((C192089nm) r11.get()).A00(str10);
        if (!(!A18 || A004 == null || A004.A00() == null)) {
            if (C18020vd.A05(C18040vf.A02, a8c.A0B, 4819)) {
                A2X A0c = C108985cd.A0c(a8c.A0O, a2n.A03);
                AnonymousClass118 r7 = a8c.A08;
                A0c.A02(new AnonymousClass7NX(C18070vi.A0G(r7, 2131890451), C18070vi.A0G(r7, 2131898593), C18070vi.A0G(r7, 2131892908), new C22040Awg(a8c, a2n, bBe, A003, str3, A0B4), new C22041Awh(a8c, a2n, bBe, A003, str3, A0B4)));
                return;
            }
            ((C192089nm) r11.get()).A01(str10);
        }
        if (C20119A8c.A07(str6, str7)) {
            AnonymousClass8BR.A0S(a8c.A0G).A06(userJid2, str, str5, str8, new C22328B3f(a8c, a2n, bBe, A003, str3, A0B4, A18));
            return;
        }
        C20119A8c.A03(a8c, a2n, (B9G) null, bBe, A003, str3, A0B4, A18);
    }
}
