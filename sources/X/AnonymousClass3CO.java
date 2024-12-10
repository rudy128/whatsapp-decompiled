package X;

import android.app.Activity;
import android.content.ContentValues;
import androidx.fragment.app.Fragment;
import com.whatsapp.jid.GroupJid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import com.whatsapp.wabloks.commerce.ui.viewmodel.WaBkFlowsLayoutViewModel;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: X.3CO  reason: invalid class name */
public class AnonymousClass3CO implements Runnable {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final String A05;
    public final boolean A06;

    public AnonymousClass3CO(Object obj, Object obj2, Object obj3, Object obj4, String str, int i, boolean z) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
        this.A03 = obj3;
        this.A04 = obj4;
        this.A06 = z;
        this.A05 = str;
    }

    public final void run() {
        Fragment A0Q;
        ContentValues A09;
        Long l;
        byte[] bArr;
        switch (this.A00) {
            case 0:
                AnonymousClass4PB r4 = (AnonymousClass4PB) this.A01;
                List list = (List) this.A03;
                C692236j r7 = (C692236j) this.A04;
                boolean z = this.A06;
                String str = this.A05;
                C18070vi.A0i(r4, list);
                C33251iW r5 = r4.A06;
                C34531kd r6 = r4.A05;
                ArrayList A13 = AnonymousClass000.A13();
                for (AnonymousClass205 A012 : (List) this.A02) {
                    AnonymousClass206 A013 = AnonymousClass1W2.A01(A012, r4.A0A);
                    if (A013 != null) {
                        A13.add(A013);
                    }
                }
                r5.A0N(r6, r7, str, C25161Nd.A00(A13), list, z);
                return;
            case 1:
                AnonymousClass1BI r2 = (AnonymousClass1BI) this.A02;
                String str2 = this.A05;
                Runnable runnable = (Runnable) this.A03;
                boolean z2 = this.A06;
                C49502Qs r1 = (C49502Qs) this.A04;
                AnonymousClass00H r56 = ((C22621Co) this.A01).A01;
                AnonymousClass1LW r8 = C17880vN.A0M(r56).A07;
                AnonymousClass1CJ r52 = r8.A00;
                if (r52.A0A(r2) != null) {
                    Log.w("ChatStore/createchat/already exists");
                    return;
                }
                C29691ci r0 = new C29691ci(r2);
                if (z2) {
                    r0.A0H = -1;
                }
                if (!C22971Dz.A0V(r2)) {
                    r0.A01 = 1;
                } else {
                    long j = r0.A0Y;
                    long j2 = r0.A0Z;
                    C179509Ig r18 = C179509Ig.GUEST;
                    AnonymousClass9IR r21 = AnonymousClass9IR.PUBLIC;
                    AnonymousClass9IW r23 = AnonymousClass9IW.NOT_VERIFIED;
                    AnonymousClass9IZ r20 = AnonymousClass9IZ.UNKNOWN_VERIFICATION_SOURCE;
                    ArrayList A132 = AnonymousClass000.A13();
                    C179459Ia r22 = C179459Ia.NOT_ENFORCED;
                    C29691ci r17 = r0;
                    C46162Dk r15 = new C46162Dk((AnonymousClass1IX) null, r17, r18, C179519Ih.DEFAULT, r20, r21, r22, r23, C179469Ib.NOT_SET, (AnonymousClass206) null, AnonymousClass00R.A00, (Long) null, (Long) null, r0.A0k, (String) null, (String) null, (String) null, (String) null, (String) null, A132, C25511Om.A00, 0, 1, j, 0, 0, 0, 0, j2, 0, true, false, false);
                    r0 = r15;
                    r15.A01 = 0;
                }
                r52.A0K(r0, r2);
                r0.A06 = 1;
                r0.A0D = -1;
                r0.A0E = -1;
                r0.A0Z = System.currentTimeMillis();
                r0.A0k = str2;
                if (r0.A0b == null) {
                    r0.A0b = r1;
                }
                AnonymousClass1DL r62 = r8.A01;
                synchronized (r0) {
                    A09 = C17880vN.A09(9);
                    C17880vN.A19(A09, "jid_row_id", r62.A09(r0.A0u));
                    A09.put("subject", r0.A0k);
                    C17880vN.A18(A09, "plaintext_disabled", r0.A01);
                    C17880vN.A18(A09, "vcard_ui_dismissed", r0.A0D);
                    C17880vN.A19(A09, "change_number_notified_message_row_id", r0.A0E);
                    C17880vN.A19(A09, "sort_timestamp", r0.A0Z);
                    C17880vN.A18(A09, "spam_detection", 1);
                    C17880vN.A18(A09, "chat_encryption_state", r0.A00);
                }
                long A08 = r8.A08(A09, r1, r2);
                if (A08 == -1) {
                    C17900vP.A0X(r2, "ChatStore/addchat/insert/failed gid=", AnonymousClass000.A10());
                } else {
                    r0.A0Y = A08;
                }
                if (runnable != null) {
                    runnable.run();
                }
                AnonymousClass1Q1 r42 = (AnonymousClass1Q1) C17880vN.A0M(r56).A0N.get();
                C18070vi.A0B(r42, r2).CGP(new AnonymousClass3Bx(r42, r2, 9));
                return;
            case 2:
                AnonymousClass1BI r3 = (AnonymousClass1BI) this.A02;
                String str3 = this.A05;
                boolean z3 = this.A06;
                boolean z4 = (Boolean) this.A03;
                Boolean bool = (Boolean) this.A04;
                C55482fq r53 = (C55482fq) ((AnonymousClass1UJ) this.A01).A02.get();
                if (!(r3 instanceof GroupJid)) {
                    AnonymousClass1E7 A0E = r53.A00.A0E(r3);
                    boolean z5 = true;
                    if (A0E == null || !A0E.A0C()) {
                        AnonymousClass2G6 r43 = new AnonymousClass2G6();
                        if (z4 == null) {
                            if (C22971Dz.A0d(r3)) {
                                C25111Mx r12 = r53.A01;
                                UserJid userJid = (UserJid) r3;
                                C18070vi.A0d(userJid, 0);
                                C58962lX A052 = r12.A05(userJid);
                                if (A052 != null) {
                                    bArr = A052.A01;
                                } else {
                                    bArr = null;
                                }
                                z4 = Boolean.valueOf(AnonymousClass000.A1W(bArr));
                            } else {
                                z4 = false;
                            }
                        }
                        r43.A01 = z4;
                        if (bool == null && C22971Dz.A0d(r3)) {
                            if (r53.A04.A02((UserJid) r3) == null) {
                                z5 = false;
                            }
                            bool = Boolean.valueOf(z5);
                        }
                        r43.A02 = bool;
                        if (A0E == null || A0E.A0E == 0) {
                            l = null;
                        } else {
                            l = Long.valueOf(C17880vN.A04(AnonymousClass11P.A01(r53.A02) - A0E.A0E));
                        }
                        r43.A03 = l;
                        r43.A04 = str3;
                        r43.A00 = Boolean.valueOf(z3);
                        r53.A03.CC7(r43);
                        return;
                    }
                    return;
                }
                return;
            case 3:
                String str4 = this.A05;
                Activity activity = (Activity) this.A01;
                AnonymousClass7OQ r54 = (AnonymousClass7OQ) this.A02;
                A45 a45 = (A45) this.A03;
                Map map = (Map) this.A04;
                boolean z6 = this.A06;
                if (C18070vi.A18(str4, "error")) {
                    C18070vi.A0z(activity, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
                    Fragment A0Q2 = ((AnonymousClass1FL) activity).A03.A00.A03.A0Q("extensions_bottom_sheet_container");
                    if (!(A0Q2 == null || (A0Q = A0Q2.A1E().A0Q("BK_FRAGMENT")) == null)) {
                        ((WaBkFlowsLayoutViewModel) new C24071It(A0Q).A00(WaBkFlowsLayoutViewModel.class)).A0W((C172408tN) null, (String) null, (String) null, "extensions-fetch-catalog-error", z6);
                    }
                }
                r54.A01.A00(a45, "fetch_catalog").A02(str4, map);
                return;
            default:
                AnonymousClass7OQ r72 = (AnonymousClass7OQ) this.A01;
                String str5 = this.A05;
                boolean z7 = this.A06;
                C18070vi.A0d(str5, 2);
                r72.A00.A00((A20) this.A02, str5).CBv(new AnonymousClass7I2((Activity) this.A03, (A45) this.A04, r72, z7));
                return;
        }
    }
}
