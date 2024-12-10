package X;

import android.content.Context;
import android.text.TextUtils;
import android.util.Base64;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.1jA  reason: invalid class name and case insensitive filesystem */
public class C33651jA {
    public final AnonymousClass1KB A00;
    public final AnonymousClass118 A01;
    public final AnonymousClass121 A02;
    public final AnonymousClass1KI A03;
    public final AnonymousClass1QD A04;
    public final C31061ex A05;
    public final AnonymousClass1QS A06;
    public final C30951em A07;
    public final AnonymousClass00H A08;
    public final AnonymousClass00H A09;
    public final AnonymousClass00H A0A;

    @Deprecated
    public void A02(C33661jB r8, String str, boolean z) {
        A00(r8, this.A06.A06(), str, z, false);
    }

    public void A01(C33661jB r16, Integer num, Integer num2, String str, String str2) {
        BD1 A052;
        BD4 bd4;
        ArrayList arrayList = new ArrayList();
        arrayList.add(new AnonymousClass1MD("action", "get-transactions"));
        String str3 = str;
        if (!TextUtils.isEmpty(str3)) {
            arrayList.add(new AnonymousClass1MD("after", str3));
        }
        if (num != null) {
            arrayList.add(new AnonymousClass1MD("version", num.intValue()));
        }
        if (num2 != null) {
            arrayList.add(new AnonymousClass1MD("limit", num2.intValue()));
        }
        C21522AlV A002 = C21522AlV.A00();
        if (!A002.A00.get()) {
            arrayList.add(new AnonymousClass1MD("client-public-key", Base64.encodeToString(A002.A02, 10)));
            C29621ca r11 = new C29621ca("account", (AnonymousClass1MD[]) arrayList.toArray(new AnonymousClass1MD[0]));
            String str4 = str2;
            boolean A0H = AnonymousClass1EG.A0H(str4);
            AnonymousClass1QS r0 = this.A06;
            if (A0H) {
                A052 = r0.A06();
            } else {
                A052 = r0.A05(str4);
                if (A052 == null) {
                    bd4 = null;
                    C33661jB r2 = r16;
                    this.A05.A0I(new C175468yl(this.A01.A00, r2, (C33711jG) this.A08.get(), this, A002, bd4, this.A00, true), r11, "get", 0);
                    return;
                }
            }
            bd4 = A052.BRb();
            if (bd4 != null) {
                bd4.COK();
            }
            C33661jB r22 = r16;
            this.A05.A0I(new C175468yl(this.A01.A00, r22, (C33711jG) this.A08.get(), this, A002, bd4, this.A00, true), r11, "get", 0);
            return;
        }
        throw new IllegalStateException("key has been destroyed");
    }

    public void A03(C176028zf r9) {
        List list = r9.A01;
        if (list != null && list.size() > 0) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            for (AW0 aw0 : r9.A01) {
                AnonymousClass205 r1 = new AnonymousClass205(aw0.A0C, aw0.A0L, aw0.A0Q);
                if (aw0.A0P || r1.A00 == null || r1.A01 == null) {
                    arrayList2.add(aw0);
                } else {
                    arrayList.add(new C19760yx(r1, aw0));
                }
            }
            if (!arrayList2.isEmpty()) {
                AnonymousClass1QS r0 = this.A06;
                AnonymousClass1QS.A00(r0);
                A5I a5i = r0.A00;
                C17960vV.A07(a5i);
                C17960vV.A07(a5i);
                List list2 = r9.A01;
                a5i.A03.CGD(new AnonymousClass8p1(a5i, new C70653Bz(this, arrayList2, 35), list2), new Void[0]);
            }
            if (!arrayList.isEmpty()) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    C19760yx r02 = (C19760yx) it.next();
                    this.A02.CQz((AW0) r02.A01, (AnonymousClass205) r02.A00);
                }
            }
        }
    }

    public C33651jA(AnonymousClass1KB r1, AnonymousClass118 r2, AnonymousClass121 r3, AnonymousClass1KI r4, AnonymousClass1QD r5, C31061ex r6, AnonymousClass1QS r7, C30951em r8, AnonymousClass00H r9, AnonymousClass00H r10, AnonymousClass00H r11) {
        this.A00 = r1;
        this.A01 = r2;
        this.A06 = r7;
        this.A02 = r3;
        this.A04 = r5;
        this.A09 = r9;
        this.A07 = r8;
        this.A05 = r6;
        this.A03 = r4;
        this.A08 = r10;
        this.A0A = r11;
    }

    public void A00(C33661jB r16, BD1 bd1, String str, boolean z, boolean z2) {
        C21522AlV A002 = C21522AlV.A00();
        AnonymousClass1MD[] r3 = new AnonymousClass1MD[4];
        r3[0] = new AnonymousClass1MD("action", "get-transaction");
        int i = 1;
        r3[1] = new AnonymousClass1MD(PublicKeyCredentialControllerUtility.JSON_KEY_ID, str);
        if (!z) {
            i = 2;
        }
        r3[2] = new AnonymousClass1MD("version", i);
        if (!A002.A00.get()) {
            r3[3] = new AnonymousClass1MD("client-public-key", Base64.encodeToString(A002.A02, 10));
            if (z2) {
                r3 = (AnonymousClass1MD[]) Arrays.copyOf(r3, 5);
                r3[4] = new AnonymousClass1MD("sync_from_provider", Boolean.TRUE.toString());
            }
            C29621ca r11 = new C29621ca("account", r3);
            C31061ex r9 = this.A05;
            BD4 BRb = bd1.BRb();
            Context context = this.A01.A00;
            AnonymousClass1KB r7 = this.A00;
            C33661jB r2 = r16;
            r9.A0I(new C175468yl(context, r2, (C33711jG) this.A08.get(), this, A002, BRb, r7, false), r11, "get", 0);
            return;
        }
        throw new IllegalStateException("key has been destroyed");
    }
}
