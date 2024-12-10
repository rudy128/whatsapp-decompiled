package X;

import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;

/* renamed from: X.1eX  reason: invalid class name and case insensitive filesystem */
public class C30801eX {
    public C30811eY A00;
    public C30811eY A01;
    public C18030ve A02;
    public AnonymousClass00H A03;
    public final AnonymousClass00H A04;
    public final AnonymousClass11P A05;
    public final C30781eV A06;
    public final AnonymousClass00H A07;
    public final AnonymousClass00H A08;

    public static void A00(C30801eX r2, C60082nM r3) {
        try {
            r2.A01.A00.A05("entry_point_conversions_for_sending").edit().putString(r3.A04.getRawString(), r3.A00()).apply();
        } catch (JSONException e) {
            StringBuilder sb = new StringBuilder();
            sb.append("CTWA: EntryPointConversionStore/updateConversion/json error");
            sb.append(e);
            Log.e(sb.toString());
        }
    }

    public C60082nM A02(UserJid userJid) {
        C46142Db A082;
        C18030ve r2 = this.A02;
        C18070vi.A0d(r2, 0);
        if (!C18020vd.A05(C18040vf.A02, r2, 7129) || (A082 = ((C48172Ll) this.A03.get()).BPQ(userJid)) == null) {
            return this.A00.A01(userJid);
        }
        AnonymousClass2DX r1 = A082.A01;
        C56112gv r3 = new C56112gv(r1.A00, r1.A03, r1.A02, r1.A00, A082.A00);
        r3.A05 = r1.A04;
        r3.A01 = r1.A01;
        C196189ub r12 = A082.A02;
        r3.A00 = r12.A00;
        r3.A04 = r12.A02;
        return new C60082nM(r3);
    }

    public C60082nM A03(UserJid userJid) {
        AnonymousClass2DX r0;
        C18030ve r2 = this.A02;
        C18070vi.A0d(r2, 0);
        boolean A052 = C18020vd.A05(C18040vf.A02, r2, 6122);
        UserJid userJid2 = userJid;
        if (!A052 || (r0 = (AnonymousClass2DX) ((A5T) this.A04.get()).A02(userJid)) == null) {
            return this.A01.A01(userJid);
        }
        String str = r0.A03;
        String str2 = r0.A02;
        long j = r0.A00;
        C56112gv r1 = new C56112gv(userJid2, str, str2, j, j);
        r1.A05 = r0.A04;
        return new C60082nM(r1);
    }

    public void A04(C60082nM r7) {
        C30811eY r1 = this.A01;
        C60082nM A012 = r1.A01(r7.A04);
        if (A012 == null) {
            r1.A03(r7);
            return;
        }
        if (System.currentTimeMillis() - A012.A03 > TimeUnit.DAYS.toMillis((long) C18020vd.A00(C18040vf.A02, this.A02, 3017))) {
            A00(this, r7);
        }
    }

    public void A05(UserJid userJid, String str, String str2, long j, long j2) {
        C20942Abw abw;
        C18030ve r2 = this.A02;
        C18070vi.A0d(r2, 0);
        boolean A052 = C18020vd.A05(C18040vf.A02, r2, 6122);
        UserJid userJid2 = userJid;
        String str3 = str;
        String str4 = str2;
        long j3 = j;
        if (A052) {
            this.A07.get();
            if (userJid == null || str == null) {
                abw = new C20942Abw(0);
            } else {
                abw = new AnonymousClass2DX(userJid2, str3, str4, j3, -1, false);
            }
            this.A06.A01(abw);
            return;
        }
        A04(new C60082nM(new C56112gv(userJid2, str3, str4, j3, j2)));
    }

    public C30801eX(AnonymousClass11P r3, C30781eV r4, C18030ve r5, C18010vc r6, AnonymousClass00H r7, AnonymousClass00H r8, AnonymousClass00H r9, AnonymousClass00H r10) {
        this.A02 = r5;
        this.A05 = r3;
        this.A08 = r7;
        this.A07 = r8;
        this.A06 = r4;
        this.A04 = r9;
        this.A03 = r10;
        this.A01 = new C30811eY(r6, "entry_point_conversions_for_sending");
        this.A00 = new C30811eY(r6, "entry_point_conversions_for_logging");
    }

    public static void A01(C30801eX r8, C30811eY r9) {
        Iterator it = r9.A02().iterator();
        while (it.hasNext()) {
            C60082nM r4 = (C60082nM) it.next();
            if (System.currentTimeMillis() - r4.A03 > TimeUnit.DAYS.toMillis((long) C18020vd.A00(C18040vf.A02, r8.A02, 3017))) {
                r9.A00.A05(r9.A01).edit().remove(r4.A04.getRawString()).apply();
            }
        }
    }
}
