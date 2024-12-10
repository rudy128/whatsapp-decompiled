package X;

import android.text.TextUtils;
import android.widget.ImageView;
import com.whatsapp.jid.UserJid;
import com.whatsapp.wamsys.JniBridge;
import java.io.File;
import java.util.Set;

/* renamed from: X.A2v  reason: case insensitive filesystem */
public class C20005A2v {
    public boolean A00 = true;
    public final C190299kh A01;
    public final Set A02;
    public final C191899nN A03;

    public void A03(ImageView imageView, AEI aei, B7F b7f, C183889Zz r23, B7G b7g, B7H b7h, int i) {
        Integer num;
        UserJid userJid = null;
        C183889Zz r5 = r23;
        if (r23 != null) {
            C182919Wf r0 = r5.A00;
            C190299kh r4 = this.A01;
            int i2 = r0.A00;
            num = Integer.valueOf(((C63252sl) r4.A00.get()).A02(i2));
            r4.A01.put(num, Integer.valueOf(i2));
            userJid = r5.A01;
        } else {
            num = null;
        }
        AEI aei2 = aei;
        String str = aei2.A04;
        String str2 = aei2.A00;
        String str3 = aei2.A01;
        B7G b7g2 = b7g;
        ImageView imageView2 = imageView;
        C168568j6 r52 = new C168568j6(imageView2, new ANQ(b7f, this, 0), new ANW(aei2, b7g2, this, userJid, num), new C20492ANd(b7h, this, userJid, num, 0), str, str2, str3, i, Integer.MAX_VALUE, Integer.MAX_VALUE);
        if (!TextUtils.isEmpty(r52.Bb5())) {
            C191899nN A012 = A01();
            if (A012.A01 != null) {
                ImageView BSp = r52.BSp();
                if (BSp != null) {
                    BSp.setTag(2131431533, r52.A05);
                    BSp.setTag(2131431539, Integer.valueOf(r52.A00));
                    if (!r52.Bb5().equals(BSp.getTag(2131432150))) {
                        BSp.setTag(2131432150, (Object) null);
                    }
                }
                A012.A01.A03(r52, true);
            }
        } else if (b7g != null) {
            AnonymousClass8BX.A17(this, userJid, num);
            b7g2.Bwx(r52);
        }
    }

    public void A04(ImageView imageView, AEI aei, B7F b7f, B7H b7h, int i) {
        A03(imageView, aei, b7f, (C183889Zz) null, (B7G) null, b7h, i);
    }

    public void A05(ImageView imageView, AnonymousClass773 r22, B7F b7f, C183889Zz r24, B7H b7h) {
        Integer num;
        UserJid userJid = null;
        C183889Zz r6 = r24;
        if (r24 != null) {
            C182919Wf r0 = r6.A00;
            C190299kh r3 = this.A01;
            int i = r0.A00;
            num = Integer.valueOf(((C63252sl) r3.A00.get()).A02(i));
            r3.A01.put(num, Integer.valueOf(i));
            userJid = r6.A01;
        } else {
            num = null;
        }
        AnonymousClass773 r62 = r22;
        ImageView imageView2 = imageView;
        C168558j5 r7 = new C168558j5(imageView2, new ANQ(b7f, this, 1), new ANV(r62, this, userJid, num), new C20492ANd(b7h, this, userJid, num, 1), r62.A02, r62.A00);
        String Bb5 = r7.Bb5();
        if (TextUtils.isEmpty(Bb5)) {
            AnonymousClass8BX.A17(this, userJid, num);
            return;
        }
        C191899nN A012 = A01();
        if (A012.A01 != null) {
            ImageView BSp = r7.BSp();
            if (BSp != null) {
                BSp.setTag(2131431533, r7.A05);
                if (!Bb5.equals(BSp.getTag(2131432150))) {
                    BSp.setTag(2131432150, (Object) null);
                }
            }
            A012.A01.A03(r7, true);
        }
    }

    /* JADX WARNING: type inference failed for: r2v6, types: [X.5vC, X.67j] */
    public synchronized C191899nN A01() {
        C191899nN r0;
        synchronized (this) {
            if (this.A00) {
                this.A00 = false;
                C191899nN r02 = this.A03;
                if (r02.A0C.getAndIncrement() == 0) {
                    File A0e = C17880vN.A0e(C108945cZ.A16(r02.A05), "product_catalog_images");
                    C20465AMc aMc = new C20465AMc(r02.A00);
                    AnonymousClass11P r6 = r02.A04;
                    C18030ve r7 = r02.A06;
                    AnonymousClass1KB r3 = r02.A02;
                    AnonymousClass10I r11 = r02.A0A;
                    AnonymousClass181 r4 = r02.A03;
                    AnonymousClass18K r8 = r02.A07;
                    JniBridge jniBridge = r02.A0B;
                    C24421Kg r10 = r02.A09;
                    C24371Kb r9 = r02.A08;
                    C18070vi.A0o(r6, r7, r3);
                    C18070vi.A0g(r11, 4, r4);
                    C18070vi.A0q(r8, jniBridge, r10);
                    C18070vi.A0d(r9, 9);
                    ? r2 = new C115525vC(r3, r4, aMc, r6, r7, r8, r9, r10, r11, jniBridge, A0e, "catalog-imager", 4, 16777216);
                    r02.A01 = r2;
                    aMc.A00 = r2;
                }
            }
            r0 = this.A03;
        }
        return r0;
    }

    public void A02() {
        C1192567j r1;
        if (!this.A00) {
            Set<C20467AMe> set = this.A02;
            for (C20467AMe A002 : set) {
                this.A03.A00(A002);
            }
            set.clear();
            C191899nN r2 = this.A03;
            if (r2.A0C.decrementAndGet() == 0 && (r1 = r2.A01) != null) {
                r1.A04(false);
                r2.A01 = null;
            }
            this.A00 = true;
        }
    }

    public C20005A2v(C191899nN r2, C190299kh r3) {
        this.A03 = r2;
        this.A01 = r3;
        this.A02 = C17880vN.A12();
    }

    public static C20005A2v A00(C191899nN r2, AnonymousClass00H r3) {
        return new C20005A2v(r2, (C190299kh) r3.get());
    }

    public void finalize() {
    }
}
