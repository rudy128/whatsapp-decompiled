package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.jid.UserJid;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.9FK  reason: invalid class name */
public final class AnonymousClass9FK extends AnonymousClass9CP {
    public final AnonymousClass1EC A00;
    public final C29621ca A01;
    public final AnonymousClass9CY A02;
    public final List A03;

    public AnonymousClass9FK(C29621ca r33, AnonymousClass9F6 r34) {
        StringBuilder A10;
        C29621ca r5 = r33;
        C29621ca A002 = AnonymousClass9F6.A00(r5, r34);
        C62672rm A0s = AnonymousClass8BR.A0s();
        String[] strArr = {"from"};
        Class<AnonymousClass1EC> cls = AnonymousClass1EC.class;
        String[] strArr2 = new String[1];
        Long A0Z = AnonymousClass8BW.A0Z("to", strArr2, 0);
        Long A0j = AnonymousClass8BU.A0j();
        Object A05 = A0s.A05(A002, cls, A0Z, A0j, (Object) null, strArr2, false);
        if (A05 != null) {
            C62672rm r24 = A0s;
            Long l = A0Z;
            Long l2 = A0j;
            AnonymousClass1EC r1 = (AnonymousClass1EC) r24.A05(r5, cls, l, l2, A05, strArr, true);
            if (r1 != null) {
                this.A00 = r1;
                String[] strArr3 = {PublicKeyCredentialControllerUtility.JSON_KEY_ID};
                Class<String> cls2 = String.class;
                C29621ca r25 = A002;
                Object A052 = r24.A05(r25, cls2, l, l2, (Object) null, new String[]{PublicKeyCredentialControllerUtility.JSON_KEY_ID}, false);
                if (A052 != null) {
                    C29621ca r252 = r5;
                    if (r24.A05(r252, cls2, l, l2, A052, strArr3, true) != null) {
                        if (A0s.A05(r5, cls2, A0Z, A0j, "result", AnonymousClass8BS.A1a(1, 0), false) != null) {
                            r24.A05(r252, cls2, l, l2, "true", new String[]{"remove", "linked_groups"}, false);
                            C18070vi.A0d(A97.A00, 0);
                            this.A02 = A97.A03(r5, A0s);
                            String[] strArr4 = {"remove", "participant"};
                            long j = 1;
                            C29621ca A0Q = AnonymousClass8BS.A0Q(r5, strArr4, 0);
                            if (A0Q == null) {
                                A10 = AnonymousClass000.A10();
                                AnonymousClass8BY.A12(r5, A10, strArr4, 0);
                            } else {
                                String str = strArr4[1];
                                List A0R = A0Q.A0R(str);
                                ArrayList A0t = C108965cb.A0t(A0R);
                                Iterator it = A0R.iterator();
                                while (it.hasNext()) {
                                    C29621ca A0R2 = AnonymousClass8BW.A0R(it, 1);
                                    if (A0s.A09(A0R2, "participant")) {
                                        C29621ca r253 = A0R2;
                                        UserJid userJid = (UserJid) r24.A05(r253, UserJid.class, l, l2, (Object) null, AnonymousClass8BS.A1Y(1, 0), false);
                                        if (userJid != null) {
                                            AnonymousClass9DO A0A = A97.A0A(A0R2, A0s);
                                            C22470B9c[] b9cArr = new C22470B9c[4];
                                            b9cArr[0] = C21238Agl.A00;
                                            b9cArr[1] = C21239Agm.A00;
                                            b9cArr[2] = C21240Agn.A00;
                                            A0t.add(new AnonymousClass9DL(userJid, A0R2, A0A, (C178179Cc) A0s.A06(A0R2, "ParticipantNotInGroup|ParticipantNotAllowed|ParticipantNotAcceptable|RemoveParticipantsLinkedGroupsServerError", C18070vi.A0O(C21241Ago.A00, b9cArr, 3), new String[0])));
                                        }
                                    }
                                }
                                if (AnonymousClass8BR.A06(A0t) < 1) {
                                    A10 = AnonymousClass000.A10();
                                    AnonymousClass8BY.A1K(str, A10, A0t);
                                } else if (AnonymousClass8BR.A06(A0t) > 1024) {
                                    A10 = AnonymousClass000.A10();
                                    AnonymousClass8BY.A1J(str, A10, A0t);
                                    j = 1024;
                                } else {
                                    this.A03 = A0t;
                                    this.A00 = r5;
                                    String str2 = new String[]{"remove"}[0];
                                    List A0R3 = r5.A0R(str2);
                                    ArrayList A0t2 = C108965cb.A0t(A0R3);
                                    Iterator it2 = A0R3.iterator();
                                    while (it2.hasNext()) {
                                        AnonymousClass8BX.A1M(A0t2, it2);
                                    }
                                    if (AnonymousClass8BR.A06(A0t2) < 1) {
                                        StringBuilder A102 = AnonymousClass000.A10();
                                        AnonymousClass8BY.A1K(str2, A102, A0t2);
                                        throw C198999zG.A01(A102);
                                    } else if (AnonymousClass8BR.A06(A0t2) <= 1) {
                                        this.A01 = AnonymousClass8BR.A0m(A0t2, 0);
                                        return;
                                    } else {
                                        StringBuilder A103 = AnonymousClass000.A10();
                                        AnonymousClass8BY.A1J(str2, A103, A0t2);
                                        throw C198999zG.A01(A103);
                                    }
                                }
                                A10.append(j);
                                A10.append('.');
                            }
                            String obj = A10.toString();
                            A0s.A00 = obj;
                            throw AnonymousClass1UI.A01(obj);
                        }
                        throw AnonymousClass1O9.A00(A0s);
                    }
                    throw AnonymousClass1O9.A00(A0s);
                }
                throw AnonymousClass1O9.A00(A0s);
            }
            throw AnonymousClass1O9.A00(A0s);
        }
        throw AnonymousClass1O9.A00(A0s);
    }
}
