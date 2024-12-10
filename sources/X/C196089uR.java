package X;

import android.widget.ImageView;
import com.whatsapp.wamsys.JniBridge;
import java.io.File;
import java.util.List;
import java.util.Set;

/* renamed from: X.9uR  reason: invalid class name and case insensitive filesystem */
public class C196089uR {
    public int A00 = Integer.MAX_VALUE;
    public C115525vC A01;
    public boolean A02 = false;
    public final Set A03;
    public final AnonymousClass1KB A04;
    public final AnonymousClass181 A05;
    public final AnonymousClass11P A06;
    public final AnonymousClass118 A07;
    public final C18030ve A08;
    public final AnonymousClass18K A09;
    public final C24371Kb A0A;
    public final C24421Kg A0B;
    public final AnonymousClass10I A0C;
    public final JniBridge A0D;

    public void A02(C20467AMe aMe) {
        aMe.A01 = true;
        C115525vC r0 = this.A01;
        if (r0 != null) {
            r0.A02(aMe);
        }
        List list = aMe.A00;
        if (list != null && list.size() > 0) {
            for (C20467AMe A022 : aMe.A00) {
                A02(A022);
            }
        }
    }

    public void A00() {
        File A0e = C17880vN.A0e(C108945cZ.A16(this.A07), "linked_account_images");
        C20466AMd aMd = new C20466AMd(this.A00);
        AnonymousClass11P r5 = this.A06;
        C18030ve r6 = this.A08;
        AnonymousClass1KB r2 = this.A04;
        AnonymousClass10I r10 = this.A0C;
        AnonymousClass181 r3 = this.A05;
        AnonymousClass18K r7 = this.A09;
        JniBridge jniBridge = this.A0D;
        C115525vC r1 = new C115525vC(r2, r3, aMd, r5, r6, r7, this.A0A, this.A0B, r10, jniBridge, A0e, "linked-account-image-loader", 4, 16777216);
        this.A01 = r1;
        aMd.A00 = r1;
    }

    public void A01(ImageView imageView, AEI aei, B7F b7f, B7H b7h, int i) {
        AEI aei2 = aei;
        String str = aei2.A04;
        String str2 = aei2.A00;
        String str3 = aei2.A01;
        ImageView imageView2 = imageView;
        C168568j6 r6 = new C168568j6(imageView2, new ANQ(b7f, this, 2), new ANT(aei2, 2), new C20489ANa(b7h, this, 1), str, str2, str3, i, Integer.MAX_VALUE, Integer.MAX_VALUE);
        if (this.A01 == null) {
            A00();
        }
        if (this.A01 != null) {
            if (r6.BSp() != null) {
                r6.BSp().setTag(2131431533, r6.A05);
                r6.BSp().setTag(2131431539, Integer.valueOf(r6.A00));
                if (!r6.Bb5().equals(r6.BSp().getTag(2131432150))) {
                    r6.BSp().setTag(2131432150, (Object) null);
                }
            }
            this.A01.A03(r6, true);
        }
    }

    public C196089uR(AnonymousClass1KB r2, AnonymousClass181 r3, AnonymousClass11P r4, AnonymousClass118 r5, C18030ve r6, AnonymousClass18K r7, C24371Kb r8, C24421Kg r9, AnonymousClass10I r10, JniBridge jniBridge) {
        this.A07 = r5;
        this.A06 = r4;
        this.A08 = r6;
        this.A04 = r2;
        this.A0C = r10;
        this.A05 = r3;
        this.A09 = r7;
        this.A0D = jniBridge;
        this.A0B = r9;
        this.A0A = r8;
        this.A03 = C17880vN.A12();
        A00();
    }

    public void finalize() {
    }
}
