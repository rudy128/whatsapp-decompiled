package X;

import android.content.SharedPreferences;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.jid.GroupJid;
import com.whatsapp.util.Log;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

/* renamed from: X.1Ma  reason: invalid class name and case insensitive filesystem */
public final class C24881Ma {
    public boolean A00;
    public final AnonymousClass11S A01;
    public final C23651Hc A02;
    public final AnonymousClass1M9 A03;
    public final AnonymousClass1MZ A04;
    public final C18030ve A05;
    public final AnonymousClass12M A06;
    public final AnonymousClass10I A07;
    public final AnonymousClass00H A08;
    public final AnonymousClass00H A09;
    public final Set A0A = new LinkedHashSet();
    public final Set A0B = new LinkedHashSet();
    public final C19830z4 A0C;
    public final AnonymousClass1CJ A0D;
    public final AnonymousClass18K A0E;

    public C24881Ma(AnonymousClass11S r2, C23651Hc r3, AnonymousClass1M9 r4, C19830z4 r5, AnonymousClass1CJ r6, AnonymousClass1MZ r7, C18030ve r8, AnonymousClass18K r9, AnonymousClass12M r10, AnonymousClass10I r11, AnonymousClass00H r12, AnonymousClass00H r13) {
        C18070vi.A0d(r8, 1);
        C18070vi.A0d(r2, 2);
        C18070vi.A0d(r11, 3);
        C18070vi.A0d(r6, 4);
        C18070vi.A0d(r9, 5);
        C18070vi.A0d(r12, 6);
        C18070vi.A0d(r13, 7);
        C18070vi.A0d(r4, 8);
        C18070vi.A0d(r3, 9);
        C18070vi.A0d(r5, 10);
        C18070vi.A0d(r10, 11);
        C18070vi.A0d(r7, 12);
        this.A05 = r8;
        this.A01 = r2;
        this.A07 = r11;
        this.A0D = r6;
        this.A0E = r9;
        this.A08 = r12;
        this.A09 = r13;
        this.A03 = r4;
        this.A02 = r3;
        this.A0C = r5;
        this.A06 = r10;
        this.A04 = r7;
    }

    public final void A02(C49752Rt r14, GroupJid groupJid, int i) {
        Set set;
        C49752Rt r10 = r14;
        GroupJid groupJid2 = groupJid;
        int i2 = i;
        if (i > 0) {
            C23651Hc r1 = this.A02;
            if (!r1.A02()) {
                r1.registerObserver(new C65862xE(r14, this, groupJid, i2));
                return;
            }
        } else if (i == 0 && r14.A01 == null) {
            r14.A01 = Boolean.valueOf(this.A01.A0O(this.A03.A0K(groupJid)));
        }
        C46702Fo r2 = new C46702Fo();
        r2.A01 = 1;
        r2.A02 = Integer.valueOf(r14.A00);
        r2.A00 = r14.A01;
        r2.A03 = Long.valueOf((long) i2);
        this.A0E.CC7(r2);
        if (i <= 0 || A03(groupJid)) {
            AnonymousClass00H r12 = this.A09;
            String A0B2 = ((AnonymousClass1OZ) r12.get()).A0B();
            String rawString = groupJid.getRawString();
            try {
                C29621ca r22 = (C29621ca) ((AnonymousClass1OZ) r12.get()).A09(new C29621ca(new C29621ca("ack", (AnonymousClass1MD[]) null), "iq", new AnonymousClass1MD[]{new AnonymousClass1MD((String) PublicKeyCredentialControllerUtility.JSON_KEY_ID, A0B2), new AnonymousClass1MD("xmlns", "w:g2"), new AnonymousClass1MD((String) PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "set"), new AnonymousClass1MD("to", rawString)}), A0B2, 388).get();
                if (!"result".equals(r22.A0Q(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, (String) null))) {
                    int A002 = C60482o6.A00(r22);
                    StringBuilder sb = new StringBuilder();
                    sb.append("AcknowledgeGroupHelper got error ");
                    sb.append(A002);
                    sb.append(" sending IQ for ");
                    sb.append(groupJid);
                    Log.w(sb.toString());
                    if (400 <= A002 && A002 < 500) {
                    }
                    if (i2 >= 7) {
                        set = this.A0A;
                        synchronized (set) {
                            set.remove(groupJid.getRawString());
                        }
                    }
                    this.A07.CGv(new C21365Aiu(this, groupJid2, r10, i2, 22), (long) (2500 << i));
                    return;
                }
            } catch (Exception e) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("AcknowledgeGroupHelper failed sending IQ for ");
                sb2.append(groupJid);
                Log.w(sb2.toString(), e);
            }
        }
        Set set2 = this.A0A;
        synchronized (set2) {
            set2.remove(groupJid.getRawString());
        }
        set = this.A0B;
        synchronized (set) {
            A00(this);
            if (set.remove(groupJid.getRawString())) {
                A01(this);
            }
        }
    }

    public static final void A00(C24881Ma r4) {
        if (!r4.A00) {
            r4.A00 = true;
            Set set = r4.A0B;
            Set<String> stringSet = ((SharedPreferences) r4.A0C.A00.get()).getStringSet("group_ack_unsent_gjids", new HashSet());
            C18070vi.A0X(stringSet);
            set.addAll(stringSet);
        }
    }

    public static final void A01(C24881Ma r2) {
        C19830z4 r0 = r2.A0C;
        C19830z4.A00(r0).putStringSet("group_ack_unsent_gjids", r2.A0B).apply();
    }

    public final boolean A03(GroupJid groupJid) {
        int i;
        C29691ci A0A2 = this.A0D.A0A(groupJid);
        if (!this.A04.A0J(groupJid) || A0A2 == null) {
            return false;
        }
        synchronized (A0A2) {
            i = A0A2.A06;
        }
        if (i == 1) {
            return true;
        }
        return false;
    }
}
