package X;

import android.util.Base64;
import com.whatsapp.util.Log;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: X.37Y  reason: invalid class name */
public final class AnonymousClass37Y implements AnonymousClass3M6 {
    public final AnonymousClass190 A00;
    public final AnonymousClass00H A01;

    public /* synthetic */ void CB9(C63362sw r1, C29621ca r2) {
    }

    public boolean CM6(C63362sw r3) {
        C18070vi.A0d(r3, 0);
        if (!C22971Dz.A0V(r3.A0Z) || C63362sw.A00(r3, C688634z.class) == null) {
            return false;
        }
        return true;
    }

    public /* bridge */ /* synthetic */ B5K CBD(C194979sb r23, C29621ca r24) {
        C29621ca[] r7;
        C58882lP r0;
        String str;
        String str2;
        C59052lg r12;
        C194979sb r10 = r23;
        C29621ca r9 = r24;
        C18070vi.A0h(r9, r10);
        if (r9.A0K("plaintext") == null || C22971Dz.A0V(r10.A01)) {
            C58882lP r2 = null;
            if (!C22971Dz.A0V(r10.A01) || (r7 = r9.A02) == null) {
                return null;
            }
            long A0E = r9.A0E(r9.A0P("server_id"), "server_id");
            String str3 = null;
            HashSet hashSet = null;
            C59052lg r1 = null;
            C58892lQ r02 = null;
            for (C29621ca r122 : r7) {
                String str4 = r122.A00;
                int hashCode = str4.hashCode();
                if (hashCode != -867509719) {
                    if (hashCode != 112397001) {
                        if (hashCode == 1973234167 && str4.equals("plaintext")) {
                            byte[] bArr = r122.A01;
                            boolean z = false;
                            if (!(bArr == null || bArr.length == 0)) {
                                z = true;
                            }
                            C29621ca A0K = r9.A0K("meta");
                            C58892lQ r5 = null;
                            String A0Q = r9.A0Q("edit", (String) null);
                            C166418cr r4 = null;
                            if (A0K != null) {
                                str2 = A0K.A0Q("is_wamo_sub", (String) null);
                            } else {
                                str2 = null;
                            }
                            if (C18070vi.A18(str2, "true")) {
                                r5 = new C58892lQ(true);
                            }
                            if (z) {
                                try {
                                    r4 = C166418cr.A01(bArr);
                                } catch (AnonymousClass1PN unused) {
                                    Log.e("IncomingNewsletterHandler/parseRegularNewsletterMessage failed to parse the message");
                                }
                                if (A0K != null) {
                                    long A0D = A0K.A0D("original_msg_t", -1) * 1000;
                                    long A0D2 = A0K.A0D("msg_edit_t", -1);
                                    if (A0D > 0 && A0D2 > 0) {
                                        r12 = new C59052lg(A0D, A0D2);
                                    }
                                }
                                r12 = null;
                            } else {
                                if (!"8".equals(A0Q)) {
                                    this.A01.get();
                                    Log.e("IncomingNewsletterHandler/parsePlaintextNewsletterMessage invalid message received");
                                }
                                r12 = null;
                            }
                            AnonymousClass7PS r03 = new AnonymousClass7PS(new C58882lP(r4), r12, r5);
                            r2 = (C58882lP) r03.first;
                            r1 = (C59052lg) r03.second;
                            r02 = (C58892lQ) r03.third;
                        }
                    } else if (str4.equals("votes")) {
                        hashSet = C17880vN.A12();
                        Iterator A03 = C29621ca.A03(r122, "vote");
                        while (A03.hasNext()) {
                            String encodeToString = Base64.encodeToString(C17880vN.A0a(A03).A01, 2);
                            C18070vi.A0X(encodeToString);
                            hashSet.add(encodeToString);
                        }
                    }
                } else if (str4.equals("reaction")) {
                    str3 = C29621ca.A02(r122, "code");
                }
            }
            C688634z r14 = new C688634z(r1, r2, r02, str3, hashSet, A0E);
            long j = r14.A00;
            if (j < 0) {
                StringBuilder A10 = AnonymousClass000.A10();
                A10.append("IncomingNewsletterHandler/isValidNewsletterMessage serverId (");
                A10.append(j);
                str = AnonymousClass000.A0y(") should be non-negative", A10);
            } else {
                if (r14.A04 == null && r14.A03 == null && ((r0 = r14.A02) == null || r0.A00 == null)) {
                    this.A01.get();
                    if (r10.A00 != 8) {
                        str = "IncomingNewsletterHandler/isValidNewsletterMessage received an unknown newsletter message";
                    }
                }
                return r14;
            }
            Log.w(str);
            return null;
        }
        this.A00.A0G("Received plaintext message to e2ee chat!", (String) null, false);
        throw AnonymousClass1UI.A01("Unexpected plaintext message");
    }

    public /* synthetic */ void CBF(C63362sw r1, C29621ca r2) {
    }

    public AnonymousClass37Y(AnonymousClass190 r1, AnonymousClass00H r2) {
        C18070vi.A0j(r1, r2);
        this.A00 = r1;
        this.A01 = r2;
    }

    public /* synthetic */ long CBC(C29621ca r3) {
        return 0;
    }
}
