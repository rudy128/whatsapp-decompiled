package X;

import android.os.Environment;
import android.util.Pair;
import com.whatsapp.util.Log;
import java.io.File;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* renamed from: X.6MN  reason: invalid class name */
public class AnonymousClass6MN extends A34 {
    public long A00;
    public String A01;
    public final Pair A02;
    public final C23501Gn A03 = new C143707Em(this, 8);
    public final AnonymousClass1NM A04;
    public final AnonymousClass11Z A05;
    public final AnonymousClass770 A06;
    public final AnonymousClass1EC A07;
    public final C129846iT A08;
    public final C35551mQ A09;
    public final AnonymousClass707 A0A;
    public final String A0B;
    public final String A0C;
    public final List A0D;
    public final boolean A0E;

    public void A0F() {
        C129846iT r0 = this.A08;
        if (r0 != null) {
            AnonymousClass1FU r1 = r0.A00;
            if (!r1.isFinishing()) {
                r1.CNA(2131895005);
            }
        }
        C35551mQ r12 = this.A09;
        Log.e("contactsupporttask: PRIVACY SETTINGS BEGIN");
        Iterator A0h = C17890vO.A0h(r12.A0G);
        while (A0h.hasNext()) {
            ((C72413Lv) A0h.next()).BiY("contactsupporttask");
        }
        Log.e("contactsupporttask: PRIVACY SETTINGS END");
    }

    public /* bridge */ /* synthetic */ Object A0G(Object[] objArr) {
        AnonymousClass1FU r6 = this.A08.A00;
        if (r6.isFinishing()) {
            return null;
        }
        if (!this.A0E) {
            return new C128756gd((File) null, (String) null, (String) null);
        }
        AnonymousClass11Z r3 = this.A05;
        long A022 = r3.A02();
        this.A01 = Environment.getExternalStorageState();
        if (this.A04.A03(this.A03)) {
            this.A00 = r3.A01();
        }
        AnonymousClass707 r4 = this.A0A;
        String str = this.A0B;
        String str2 = this.A0C;
        long j = this.A00;
        String str3 = this.A01;
        Pair pair = this.A02;
        List list = this.A0D;
        AnonymousClass1EC r8 = this.A07;
        Pair A012 = r4.A01(r6, pair, r8, str, str2, str3, list, j, A022, true);
        String str4 = (String) A012.second;
        return new C128756gd((File) A012.first, this.A09.A04(r6, pair, r8, str, str2, str4, this.A01, (String) null, list, AnonymousClass6WX.A00(this.A06), (JSONObject) null, this.A00, A022, false, false, false), str4);
    }

    public /* bridge */ /* synthetic */ void A0H(Object obj) {
        C128756gd r13 = (C128756gd) obj;
        C129846iT r0 = this.A08;
        if (r0 != null && r13 != null) {
            File file = r13.A00;
            String str = r13.A01;
            AnonymousClass1FU r4 = r0.A00;
            C133186oJ r2 = r0.A01;
            boolean A012 = r2.A02.A01(r4, file, r0.A02, str, r0.A03, (String) null, r0.A04, true);
            r4.CEx();
            if (r4 instanceof AnonymousClass88C) {
                ((AnonymousClass88C) r4).C3G(A012);
            }
            r2.A00 = null;
        }
    }

    public AnonymousClass6MN(Pair pair, AnonymousClass1NM r4, AnonymousClass11Z r5, AnonymousClass770 r6, AnonymousClass1EC r7, C129846iT r8, C35551mQ r9, AnonymousClass707 r10, String str, String str2, List list, boolean z) {
        this.A05 = r5;
        this.A09 = r9;
        this.A04 = r4;
        this.A0A = r10;
        this.A08 = r8;
        this.A0B = str;
        this.A0C = str2;
        this.A02 = pair;
        this.A0D = list;
        this.A0E = z;
        this.A06 = r6;
        this.A07 = r7;
    }
}
