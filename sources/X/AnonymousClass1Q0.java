package X;

import android.content.Context;
import android.util.Pair;
import android.view.View;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: X.1Q0  reason: invalid class name */
public class AnonymousClass1Q0 {
    public final AnonymousClass11S A00;
    public final C25161Nd A01;
    public final C19830z4 A02;
    public final AnonymousClass1CJ A03;
    public final AnonymousClass18K A04;
    public final AnonymousClass190 A05;
    public final C25861Px A06;
    public final AnonymousClass10I A07;

    /* JADX WARNING: Code restructure failed: missing block: B:82:0x00d5, code lost:
        if ((!r0) == false) goto L_0x00d7;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A06(X.C29691ci r9, X.AnonymousClass206 r10) {
        /*
            r8 = this;
            r7 = 0
            if (r9 == 0) goto L_0x0057
            boolean r0 = r9.A0l
            if (r0 == 0) goto L_0x0057
            boolean r0 = X.AnonymousClass25A.A0c(r10)
            if (r0 != 0) goto L_0x0057
            boolean r0 = r10 instanceof X.AnonymousClass2MI
            if (r0 != 0) goto L_0x0057
            boolean r0 = r10 instanceof X.AnonymousClass97d
            if (r0 != 0) goto L_0x0057
            boolean r0 = r10 instanceof X.C1771297j
            if (r0 != 0) goto L_0x0057
            int r1 = r10.A0u
            r0 = 8
            if (r1 == r0) goto L_0x0057
            boolean r0 = X.AnonymousClass25A.A0f(r10)
            if (r0 != 0) goto L_0x0057
            boolean r0 = X.AnonymousClass25A.A0n(r10)
            if (r0 != 0) goto L_0x0057
            boolean r0 = X.AnonymousClass25A.A0h(r10)
            if (r0 != 0) goto L_0x0057
            boolean r0 = X.AnonymousClass25A.A0i(r10)
            if (r0 != 0) goto L_0x0057
            X.205 r0 = r10.A0v
            boolean r3 = r0.A02
            if (r3 == 0) goto L_0x0058
            boolean r0 = X.AnonymousClass25A.A0r(r10)
            if (r0 == 0) goto L_0x0058
            r0 = r10
            X.20i r0 = (X.C436420i) r0
            int r1 = r0.A00
            r0 = 21
            if (r1 == r0) goto L_0x0057
            r0 = 27
            if (r1 == r0) goto L_0x0057
            r0 = 131(0x83, float:1.84E-43)
            if (r1 == r0) goto L_0x0057
            r0 = 6
            if (r1 != r0) goto L_0x0058
        L_0x0057:
            return r7
        L_0x0058:
            boolean r0 = X.AnonymousClass25A.A0u(r10)
            if (r0 != 0) goto L_0x0057
            boolean r0 = X.AnonymousClass25A.A0d(r10)
            if (r0 != 0) goto L_0x0057
            if (r3 == 0) goto L_0x008e
            boolean r0 = X.AnonymousClass25A.A0r(r10)
            if (r0 == 0) goto L_0x008e
            r0 = r10
            X.20i r0 = (X.C436420i) r0
            int r1 = r0.A00
            r0 = 29
            if (r1 == r0) goto L_0x0057
            r0 = 30
            if (r1 == r0) goto L_0x0057
            r0 = 31
            if (r1 == r0) goto L_0x0057
            r0 = 32
            if (r1 == r0) goto L_0x0057
            r0 = 53
            if (r1 == r0) goto L_0x0057
            r0 = 54
            if (r1 == r0) goto L_0x0057
            r0 = 56
            if (r1 != r0) goto L_0x008e
            return r7
        L_0x008e:
            boolean r0 = X.AnonymousClass25A.A0k(r10)
            if (r0 != 0) goto L_0x0057
            boolean r4 = r10 instanceof X.C436420i
            if (r4 == 0) goto L_0x00ab
            r0 = r10
            X.20i r0 = (X.C436420i) r0
            int r0 = r0.A00
            long r1 = (long) r0
            r5 = 62
            int r0 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r0 == 0) goto L_0x0057
            r5 = 63
            int r0 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r0 != 0) goto L_0x00ab
            return r7
        L_0x00ab:
            X.11S r2 = r8.A00
            if (r4 == 0) goto L_0x00d7
            r0 = r10
            X.20i r0 = (X.C436420i) r0
            int r1 = r0.A00
            boolean r0 = X.AnonymousClass25A.A0F(r1)
            if (r0 != 0) goto L_0x00ed
            r0 = 13
            if (r1 == r0) goto L_0x00ed
            r0 = 14
            if (r1 == r0) goto L_0x00ed
            r0 = 4
            if (r1 == r0) goto L_0x00cb
            r0 = 7
            if (r1 == r0) goto L_0x00cb
            r0 = 5
            if (r1 != r0) goto L_0x00d7
        L_0x00cb:
            X.1BI r0 = r10.A0H()
            boolean r0 = r2.A0O(r0)
        L_0x00d3:
            r0 = r0 ^ 1
            if (r0 != 0) goto L_0x0057
        L_0x00d7:
            if (r3 == 0) goto L_0x00ff
            boolean r0 = X.AnonymousClass25A.A0r(r10)
            if (r0 == 0) goto L_0x00ff
            r0 = r10
            X.20i r0 = (X.C436420i) r0
            int r1 = r0.A00
            r0 = 73
            if (r1 == r0) goto L_0x0057
            r0 = 74
            if (r1 != r0) goto L_0x00ff
            return r7
        L_0x00ed:
            r0 = r10
            X.2Mh r0 = (X.C48392Mh) r0
            java.util.List r1 = r0.A01
            r2.A0I()
            com.whatsapp.jid.PhoneUserJid r0 = r2.A0E
            X.C17960vV.A07(r0)
            boolean r0 = r1.contains(r0)
            goto L_0x00d3
        L_0x00ff:
            boolean r0 = X.AnonymousClass25A.A0r(r10)
            if (r0 == 0) goto L_0x0168
            r0 = r10
            X.20i r0 = (X.C436420i) r0
            int r1 = r0.A00
            java.util.Set r0 = X.AnonymousClass2WQ.A01
            r0 = 78
            if (r1 == r0) goto L_0x0057
            r0 = 109(0x6d, float:1.53E-43)
            if (r1 == r0) goto L_0x0057
            r0 = 171(0xab, float:2.4E-43)
            if (r1 == r0) goto L_0x0057
            r0 = 87
            if (r1 == r0) goto L_0x0057
            r0 = 116(0x74, float:1.63E-43)
            if (r1 == r0) goto L_0x0057
            r0 = 98
            if (r1 == r0) goto L_0x0057
            r0 = 105(0x69, float:1.47E-43)
            if (r1 == r0) goto L_0x0057
            r0 = 95
            if (r1 == r0) goto L_0x0057
            r0 = 102(0x66, float:1.43E-43)
            if (r1 == r0) goto L_0x0057
            r0 = 75
            if (r1 == r0) goto L_0x0057
            r0 = 103(0x67, float:1.44E-43)
            if (r1 == r0) goto L_0x0057
            r0 = 104(0x68, float:1.46E-43)
            if (r1 == r0) goto L_0x0057
            r0 = 112(0x70, float:1.57E-43)
            if (r1 == r0) goto L_0x0057
            r0 = 128(0x80, float:1.794E-43)
            if (r1 == r0) goto L_0x0057
            r0 = 113(0x71, float:1.58E-43)
            if (r1 == r0) goto L_0x0057
            r0 = 114(0x72, float:1.6E-43)
            if (r1 == r0) goto L_0x0057
            r0 = 115(0x73, float:1.61E-43)
            if (r1 == r0) goto L_0x0057
            r0 = 173(0xad, float:2.42E-43)
            if (r1 != r0) goto L_0x0168
            r0 = r10
            X.2Mh r0 = (X.C48392Mh) r0
            java.util.List r1 = r0.A01
            r2.A0I()
            com.whatsapp.jid.PhoneUserJid r0 = r2.A0E
            X.C17960vV.A07(r0)
            boolean r0 = r1.contains(r0)
            if (r0 != 0) goto L_0x0168
            return r7
        L_0x0168:
            if (r4 == 0) goto L_0x0174
            r0 = r10
            X.20i r0 = (X.C436420i) r0
            int r1 = r0.A00
            r0 = 118(0x76, float:1.65E-43)
            if (r1 != r0) goto L_0x0174
            return r7
        L_0x0174:
            boolean r0 = X.AnonymousClass25A.A0r(r10)
            if (r0 == 0) goto L_0x0190
            r0 = r10
            X.20i r0 = (X.C436420i) r0
            int r1 = r0.A00
            r0 = 137(0x89, float:1.92E-43)
            if (r1 == r0) goto L_0x0057
            r0 = 138(0x8a, float:1.93E-43)
            if (r1 == r0) goto L_0x0057
            r0 = 150(0x96, float:2.1E-43)
            if (r1 == r0) goto L_0x0057
            r0 = 151(0x97, float:2.12E-43)
            if (r1 != r0) goto L_0x0190
            return r7
        L_0x0190:
            boolean r0 = X.AnonymousClass25A.A0b(r10)
            if (r0 != 0) goto L_0x0057
            boolean r0 = X.AnonymousClass25A.A0s(r10)
            if (r0 != 0) goto L_0x0057
            boolean r0 = X.AnonymousClass25A.A0o(r10)
            if (r0 != 0) goto L_0x0057
            X.0z4 r1 = r8.A02
            boolean r0 = r1.A2Q()
            if (r0 != 0) goto L_0x01ba
            if (r3 != 0) goto L_0x01c0
            boolean r0 = r2.A0N()
            if (r0 != 0) goto L_0x01c0
            java.lang.String r0 = "archiveutil/enableArchiveV2IfNeededForMessage/Enabling archive2.0"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r8.A04()
        L_0x01ba:
            boolean r0 = r1.A2R()
            if (r0 == 0) goto L_0x0057
        L_0x01c0:
            r7 = 1
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1Q0.A06(X.1ci, X.206):boolean");
    }

    public static Pair A00(AnonymousClass1CJ r5, Collection collection) {
        ArrayList arrayList = new ArrayList();
        Iterator it = collection.iterator();
        boolean z = true;
        while (it.hasNext()) {
            AnonymousClass1BI r1 = (AnonymousClass1BI) it.next();
            boolean A0Q = r5.A0Q(r1);
            z &= A0Q;
            if (!A0Q) {
                arrayList.add(r1);
            }
        }
        return new Pair(Boolean.valueOf(z), arrayList);
    }

    private void A02(boolean z) {
        C19830z4.A00(this.A02).putBoolean("notify_new_message_for_archived_chats", z).apply();
        AnonymousClass10I r3 = this.A07;
        C25861Px r2 = this.A06;
        r2.getClass();
        r3.CGF(new C98554rL(r2, 20));
    }

    public void A04() {
        if (!this.A00.A0N()) {
            C19830z4.A00(this.A02).putBoolean("archive_v2_enabled", true).apply();
            A02(false);
        }
    }

    public void A05(boolean z) {
        C17960vV.A0H(!this.A00.A0N(), "archiveutil/setArchiveModeAndUpdateCompanion only primary can set this setting");
        A02(z);
        AnonymousClass18K r2 = this.A04;
        C46332Ed r1 = new C46332Ed();
        r1.A00 = Boolean.valueOf(!z);
        r2.CC7(r1);
    }

    public AnonymousClass1Q0(AnonymousClass190 r1, AnonymousClass11S r2, C25161Nd r3, C25861Px r4, C19830z4 r5, AnonymousClass1CJ r6, AnonymousClass18K r7, AnonymousClass10I r8) {
        this.A05 = r1;
        this.A00 = r2;
        this.A07 = r8;
        this.A03 = r6;
        this.A04 = r7;
        this.A02 = r5;
        this.A01 = r3;
        this.A06 = r4;
    }

    public static void A01(Context context, View view, C33251iW r7, AnonymousClass1BI r8, Integer num) {
        C23520Bik A002 = C23520Bik.A00((Context) null, view, context.getString(2131886740), 0);
        A002.A0G(context.getString(2131897266), new AnonymousClass48j(num, r7, r8, 22));
        A002.A0E(C19740yt.A00(context, AnonymousClass1YL.A00(context, 2130971311, 2131102579)));
        TextView textView = (TextView) A002.A0J.findViewById(2131435508);
        textView.setSingleLine(false);
        A002.A08();
        textView.requestFocus();
    }

    public static boolean A03(C19830z4 r1, AnonymousClass1CJ r2, AnonymousClass1BI r3) {
        if (!r1.A2Q() || r1.A2R() || !r2.A0Q(r3)) {
            return false;
        }
        return true;
    }
}
