package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.privacy.protocol.xmpp.DisclosureGetStageByIdsWorker;
import com.whatsapp.privacy.protocol.xmpp.DisclosureMetadataGetWorker;
import com.whatsapp.privacy.protocol.xmpp.DisclosureResetOnServerWorker;
import com.whatsapp.privacy.protocol.xmpp.DisclosureResultSendWorker;
import com.whatsapp.privacy.usernotice.UserNoticeStageUpdateWorker;

/* renamed from: X.79s  reason: invalid class name and case insensitive filesystem */
public class C1425079s implements E3Z {
    public final int A00;
    public final Object A01;

    public static A6Y A00(C20001A2q a2q, Object obj) {
        C18070vi.A0d(obj, 1);
        A6Y a6y = a2q.A01.A01;
        C18070vi.A0X(a6y);
        return a6y;
    }

    public C1425079s(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public static void A01(AnonymousClass1OZ r7, AnonymousClass1O5 r8, C29621ca r9, String str) {
        r7.A0N(r8, r9, str, 254, 32000);
    }

    public final Object BCk(C25113CYi cYi) {
        int length;
        int i;
        int i2;
        C25113CYi cYi2 = cYi;
        switch (this.A00) {
            case 0:
                DisclosureGetStageByIdsWorker disclosureGetStageByIdsWorker = (DisclosureGetStageByIdsWorker) this.A01;
                int[] A04 = A00(disclosureGetStageByIdsWorker, cYi2).A04("disclosure_ids");
                if (A04 == null || (length = A04.length) == 0) {
                    cYi2.A00(new C162168Jj());
                    return "Get Disclosure Stage by Ids";
                }
                AnonymousClass1OZ r4 = disclosureGetStageByIdsWorker.A01;
                String A0B = r4.A0B();
                long A002 = AnonymousClass11P.A00(disclosureGetStageByIdsWorker.A00);
                if (A002 > 2147483647L || A002 <= 0) {
                    i = 100;
                } else {
                    i = (int) A002;
                }
                C29621ca[] r8 = new C29621ca[length];
                for (int i3 = 0; i3 < length; i3++) {
                    AnonymousClass1MD[] r14 = new AnonymousClass1MD[2];
                    r14[0] = new AnonymousClass1MD(PublicKeyCredentialControllerUtility.JSON_KEY_ID, A04[i3]);
                    C17880vN.A1Q("t", String.valueOf(i), r14, 1);
                    r8[i3] = new C29621ca("get_disclosure_stage_by_id", r14);
                }
                AnonymousClass1MD[] r7 = new AnonymousClass1MD[4];
                C17880vN.A1Q("to", "s.whatsapp.net", r7, 0);
                C17880vN.A1Q(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "get", r7, 1);
                C17880vN.A1Q("xmlns", "tos", r7, 2);
                r7[3] = new AnonymousClass1MD(PublicKeyCredentialControllerUtility.JSON_KEY_ID, A0B);
                A01(r4, new AnonymousClass7LL(cYi2, disclosureGetStageByIdsWorker, A04, 3), new C29621ca("iq", r7, r8), A0B);
                return "Get Disclosure Stage by Ids";
            case 1:
                DisclosureMetadataGetWorker disclosureMetadataGetWorker = (DisclosureMetadataGetWorker) this.A01;
                int A02 = A00(disclosureMetadataGetWorker, cYi2).A02("disclosure_id", -1);
                AnonymousClass1OZ r5 = disclosureMetadataGetWorker.A01;
                String A0B2 = r5.A0B();
                long A003 = AnonymousClass11P.A00(disclosureMetadataGetWorker.A00);
                if (A003 > 2147483647L || A003 <= 0) {
                    i2 = 100;
                } else {
                    i2 = (int) A003;
                }
                AnonymousClass1MD[] r2 = new AnonymousClass1MD[1];
                boolean A1W = C17890vO.A1W("t", String.valueOf(i2), r2);
                C29621ca r82 = new C29621ca("get_user_disclosures", r2);
                AnonymousClass1MD[] r22 = new AnonymousClass1MD[4];
                C17880vN.A1Q("to", "s.whatsapp.net", r22, A1W ? 1 : 0);
                C17880vN.A1Q(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "get", r22, 1);
                C17890vO.A12("xmlns", "tos", r22);
                A01(r5, new AnonymousClass7LM(cYi2, A02, A1W, disclosureMetadataGetWorker), C29621ca.A01(r82, PublicKeyCredentialControllerUtility.JSON_KEY_ID, A0B2, r22), A0B2);
                return "Get Disclosure Metadata";
            case 2:
                DisclosureResetOnServerWorker disclosureResetOnServerWorker = (DisclosureResetOnServerWorker) this.A01;
                int A022 = A00(disclosureResetOnServerWorker, cYi2).A02("disclosure_id", -1);
                if (A022 != -1) {
                    C17900vP.A0j("DisclosureResetOnServerWorker/startwork/disclosureId: ", AnonymousClass000.A10(), A022);
                    C18100vl r1 = disclosureResetOnServerWorker.A00;
                    String A0B3 = ((AnonymousClass1OZ) r1.getValue()).A0B();
                    AnonymousClass1MD[] r12 = new AnonymousClass1MD[1];
                    boolean A1W2 = C17890vO.A1W(PublicKeyCredentialControllerUtility.JSON_KEY_ID, String.valueOf(A022), r12);
                    C29621ca r83 = new C29621ca("delete", r12);
                    AnonymousClass1MD[] r23 = new AnonymousClass1MD[4];
                    C17880vN.A1Q("to", "s.whatsapp.net", r23, A1W2 ? 1 : 0);
                    C17880vN.A1Q(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "set", r23, 1);
                    C17890vO.A12("xmlns", "tos", r23);
                    A01((AnonymousClass1OZ) r1.getValue(), new AnonymousClass7LM(cYi2, A022, 1, disclosureResetOnServerWorker), C29621ca.A01(r83, PublicKeyCredentialControllerUtility.JSON_KEY_ID, A0B3, r23), A0B3);
                    return "Stage on server reset";
                }
                break;
            case 3:
                DisclosureResultSendWorker disclosureResultSendWorker = (DisclosureResultSendWorker) this.A01;
                A6Y A004 = A00(disclosureResultSendWorker, cYi2);
                int A023 = A004.A02("disclosure_id", -1);
                int A024 = A004.A02("result", -1);
                if (!(A023 == -1 || A024 == -1)) {
                    StringBuilder A10 = AnonymousClass000.A10();
                    A10.append("DisclosureResultSendWorker/startWork/disclosureId: ");
                    A10.append(A023);
                    C17900vP.A0j(" result: ", A10, A024);
                    AnonymousClass1OZ r52 = disclosureResultSendWorker.A00;
                    String A0B4 = r52.A0B();
                    AnonymousClass1MD[] r24 = new AnonymousClass1MD[2];
                    boolean A1W3 = C17890vO.A1W(PublicKeyCredentialControllerUtility.JSON_KEY_ID, String.valueOf(A023), r24);
                    r24[1] = new AnonymousClass1MD("result", String.valueOf(A024));
                    C29621ca r3 = new C29621ca("trackable", r24);
                    AnonymousClass1MD[] r25 = new AnonymousClass1MD[4];
                    C17880vN.A1Q("to", "s.whatsapp.net", r25, A1W3 ? 1 : 0);
                    C17880vN.A1Q(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "set", r25, 1);
                    C17880vN.A1Q("xmlns", "tos", r25, 2);
                    A01(r52, new AnonymousClass37G(cYi2, disclosureResultSendWorker, 6), C29621ca.A01(r3, PublicKeyCredentialControllerUtility.JSON_KEY_ID, A0B4, r25), A0B4);
                    return "Send Stage Update";
                }
            case 4:
                UserNoticeStageUpdateWorker userNoticeStageUpdateWorker = (UserNoticeStageUpdateWorker) this.A01;
                A6Y A005 = A00(userNoticeStageUpdateWorker, cYi2);
                int A025 = A005.A02("notice_id", -1);
                int A026 = A005.A02("stage", -1);
                int A027 = A005.A02("version", -1);
                if (!(A025 == -1 || A026 == -1 || A027 == -1)) {
                    StringBuilder A102 = AnonymousClass000.A10();
                    A102.append("UserNoticeStageUpdateWorker/startWork/noticeId: ");
                    A102.append(A025);
                    C17900vP.A0j(" stage: ", A102, A026);
                    AnonymousClass1OZ r53 = userNoticeStageUpdateWorker.A00;
                    String A0B5 = r53.A0B();
                    AnonymousClass1MD[] r26 = new AnonymousClass1MD[2];
                    C17880vN.A1Q(PublicKeyCredentialControllerUtility.JSON_KEY_ID, String.valueOf(A025), r26, 0);
                    r26[1] = new AnonymousClass1MD("stage", String.valueOf(A026));
                    C29621ca r32 = new C29621ca("notice", r26);
                    AnonymousClass1MD[] r27 = new AnonymousClass1MD[4];
                    C17880vN.A1Q("to", "s.whatsapp.net", r27, 0);
                    C17880vN.A1Q(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "set", r27, 1);
                    C17880vN.A1Q("xmlns", "tos", r27, 2);
                    A01(r53, new AnonymousClass379(cYi2, userNoticeStageUpdateWorker, A026, A025, A027), C29621ca.A01(r32, PublicKeyCredentialControllerUtility.JSON_KEY_ID, A0B5, r27), A0B5);
                    return "Send Stage Update";
                }
            default:
                C129476hr r33 = (C129476hr) this.A01;
                C18070vi.A0d(cYi2, 1);
                Object obj = r33.A01.get();
                AnonymousClass7S0 r0 = new AnonymousClass7S0(cYi2, r33, 17);
                synchronized (obj) {
                    r0.invoke();
                }
                return C27621Wu.A00;
        }
        return new C162168Jj();
    }
}
