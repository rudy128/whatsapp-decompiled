package X;

import com.whatsapp.util.Log;
import java.util.HashSet;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.2lC  reason: invalid class name and case insensitive filesystem */
public final class C58752lC {
    public String A00;
    public final AnonymousClass1PP A01;
    public final AnonymousClass11S A02;
    public final AnonymousClass11E A03;
    public final AnonymousClass11P A04;
    public final C19830z4 A05;
    public final AnonymousClass121 A06;
    public final AnonymousClass1MW A07;
    public final C18030ve A08;
    public final AnonymousClass00H A09;

    public final void A00() {
        HashSet A0M;
        String A0I;
        C18030ve r9 = this.A08;
        C18040vf r8 = C18040vf.A02;
        int A002 = C18020vd.A00(r8, r9, 8474);
        C19830z4 r5 = this.A05;
        if (AnonymousClass11P.A01(this.A04) - r5.A0W("pref_distribute_status_sender_key_last_timestamp") >= C17890vO.A03(A002)) {
            JSONObject A022 = C18020vd.A02(r8, r9, 8475);
            if (A022.has("supported_radio_types")) {
                JSONArray jSONArray = A022.getJSONArray("supported_radio_types");
                Integer A003 = AnonymousClass1LS.A00(this.A03.A04());
                if (A003 != null) {
                    C18070vi.A0b(jSONArray);
                    int length = jSONArray.length();
                    Object[] objArr = new Integer[length];
                    for (int i = 0; i < length; i++) {
                        objArr[i] = jSONArray.get(i);
                    }
                    if (!C200410p.A0U(A003, objArr)) {
                        return;
                    }
                } else {
                    return;
                }
            }
            AnonymousClass1MW r0 = this.A07;
            C29671cg r6 = C29671cg.A00;
            C63872tp A0B = r0.A0B(r6);
            if (A0B.A00 != 0) {
                A0M = A0B.A0L();
            } else {
                A0M = A0B.A0M();
            }
            int size = A0M.size() - 1;
            if (size >= C18020vd.A00(r8, r9, 7957) && size <= C18020vd.A00(r8, r9, 7958)) {
                HashSet A0N = A0B.A0N(this.A02, r9, (C63182se) this.A09.get(), false);
                if (A0B.A00 != 0) {
                    A0I = A0B.A0G();
                } else {
                    A0I = A0B.A0I();
                }
                C18070vi.A0X(A0I);
                if (C22339B3q.A00((((double) A0N.size()) / ((double) size)) * 100.0d) >= C18020vd.A00(r8, r9, 2860) && !A0I.equals(this.A00) && C18020vd.A05(r8, r9, 7927)) {
                    Log.i("StatusDistributeSenderKeyRequester/sending invisible message to status participants");
                    this.A00 = A0I;
                    A01(C17880vN.A0Z(r6, this.A01));
                    r5.A1i("pref_distribute_status_sender_key_last_timestamp");
                }
            }
        }
    }

    public C58752lC(AnonymousClass11S r2, AnonymousClass11E r3, AnonymousClass11P r4, C19830z4 r5, AnonymousClass121 r6, AnonymousClass1MW r7, C18030ve r8, AnonymousClass1PP r9, AnonymousClass00H r10) {
        C18070vi.A0w(r4, r8, r2, r9, r6);
        C18070vi.A0q(r7, r5, r3);
        C18070vi.A0d(r10, 9);
        this.A04 = r4;
        this.A08 = r8;
        this.A02 = r2;
        this.A01 = r9;
        this.A06 = r6;
        this.A07 = r7;
        this.A05 = r5;
        this.A03 = r3;
        this.A09 = r10;
    }

    public final void A01(AnonymousClass205 r6) {
        C17900vP.A0Y(r6, "StatusDistributeSenderKeyRequester/sendInvisibleHello to ", AnonymousClass000.A10());
        this.A06.BBM(new AnonymousClass206(r6, 58, AnonymousClass11P.A01(this.A04)));
    }
}
