package X;

import android.content.SharedPreferences;
import java.util.Collection;
import java.util.Set;

/* renamed from: X.9nR  reason: invalid class name and case insensitive filesystem */
public class C191939nR {
    public final SharedPreferences A00;
    public final C182709Vk A01;
    public final C182719Vl A02;
    public final AnonymousClass11P A03;
    public final C18030ve A04;
    public final AnonymousClass18K A05;
    public final AnonymousClass9SQ A06 = new Object();
    public final AnonymousClass9SR A07 = new Object();
    public final AnonymousClass9SS A08 = new Object();
    public final C189779jq A09;
    public final AnonymousClass9ST A0A = new Object();
    public final AnonymousClass9SU A0B = new Object();
    public final AnonymousClass9SV A0C = new Object();
    public final AnonymousClass00H A0D;

    public C188729ht A00(C22484B9q b9q, Integer num, Integer num2, Set set) {
        Integer num3;
        C18030ve r11 = this.A04;
        if (C18020vd.A05(C18040vf.A02, r11, 9232)) {
            num3 = AnonymousClass00R.A00;
        } else {
            num3 = AnonymousClass00R.A01;
        }
        C182719Vl r2 = this.A02;
        String num4 = Integer.toString(num.intValue());
        SharedPreferences sharedPreferences = this.A00;
        AnonymousClass10E r1 = r2.A00.A00;
        A6F a6f = new A6F(sharedPreferences, AnonymousClass10E.A6O(r1), C000200d.A00(r1.A9H), num4);
        C199410f copyOf = C199410f.copyOf((Collection) set);
        AnonymousClass9SR r15 = this.A07;
        C189779jq r14 = this.A09;
        AnonymousClass10E r12 = this.A01.A00.A00;
        C186329e1 r9 = new C186329e1(AnonymousClass10E.A6O(r12), a6f, AnonymousClass10E.A0H(r12));
        AnonymousClass9SS r13 = this.A08;
        AnonymousClass9SU r122 = this.A0B;
        AnonymousClass9SQ r8 = this.A06;
        AnonymousClass9SV r7 = this.A0C;
        AnonymousClass9ST r6 = this.A0A;
        AnonymousClass11P r5 = this.A03;
        long currentTimeMillis = System.currentTimeMillis();
        return new C188729ht(copyOf, r9, r8, r15, r13, r14, r6, r122, r7, new C191209mC(r5, r11, this.A05, C17880vN.A0U(this.A0D)), a6f, b9q, num3, currentTimeMillis, (long) (num2.intValue() * 1000));
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, X.9SR] */
    /* JADX WARNING: type inference failed for: r0v1, types: [java.lang.Object, X.9SS] */
    /* JADX WARNING: type inference failed for: r0v2, types: [java.lang.Object, X.9SV] */
    /* JADX WARNING: type inference failed for: r0v3, types: [java.lang.Object, X.9SQ] */
    /* JADX WARNING: type inference failed for: r0v4, types: [X.9SU, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v5, types: [X.9ST, java.lang.Object] */
    public C191939nR(C182709Vk r2, C182719Vl r3, AnonymousClass11P r4, C18030ve r5, AnonymousClass18K r6, C18010vc r7, AnonymousClass00H r8, AnonymousClass00H r9) {
        this.A03 = r4;
        this.A04 = r5;
        this.A05 = r6;
        this.A0D = r8;
        this.A00 = r7.A05("com.whatsapp.psa.qp_surface");
        this.A01 = r2;
        this.A02 = r3;
        this.A09 = new C189779jq(r9);
    }
}
