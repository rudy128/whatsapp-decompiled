package X;

import android.view.View;
import android.view.ViewGroup;

/* renamed from: X.ALd  reason: case insensitive filesystem */
public final class C20440ALd implements C28582E8t {
    public boolean A00;
    public final ViewGroup A01;
    public final C40751vD A02;
    public final C36531o3 A03;
    public final C138166wd A04;
    public final C36401np A05;
    public final C18100vl A06 = AnonymousClass1DF.A01(new C21849Atb(this));
    public final AnonymousClass11S A07;
    public final AnonymousClass11Q A08;
    public final C19830z4 A09;
    public final C18030ve A0A;
    public final AnonymousClass1LU A0B;

    public C20440ALd(ViewGroup viewGroup, AnonymousClass11S r3, C40751vD r4, C36531o3 r5, AnonymousClass11Q r6, C19830z4 r7, C18030ve r8, C138166wd r9, AnonymousClass1LU r10, C36401np r11) {
        C18070vi.A0d(viewGroup, 1);
        C72473Md.A1M(r8, r6, r5, 3);
        C18070vi.A0x(r11, r3, r4, r9, r7);
        this.A01 = viewGroup;
        this.A0B = r10;
        this.A0A = r8;
        this.A08 = r6;
        this.A03 = r5;
        this.A05 = r11;
        this.A07 = r3;
        this.A02 = r4;
        this.A04 = r9;
        this.A09 = r7;
    }

    public static final void A00(C20440ALd aLd) {
        C19830z4 r3 = aLd.A09;
        if (r3.A2P()) {
            AnonymousClass11Q r1 = aLd.A08;
            if (!C17880vN.A1W(AnonymousClass11Q.A01(r1), "username_is_set_triggered")) {
                C17880vN.A1F(AnonymousClass11Q.A01(r1).edit(), "username_is_set_triggered", true);
            }
        }
        if (C17890vO.A0B(r3).getBoolean("username_chats_ever_existed", false)) {
            AnonymousClass11Q r12 = aLd.A08;
            if (!AnonymousClass11Q.A01(r12).getBoolean("username_chats_exist_triggered", false)) {
                C17880vN.A1F(AnonymousClass11Q.A01(r12).edit(), "username_chats_exist_triggered", true);
            }
        }
    }

    public void Bcv() {
        if (this.A00) {
            C108965cb.A1N(this.A06.getValue());
        }
    }

    public boolean CLk() {
        if (!this.A07.A0N()) {
            return false;
        }
        if (!C18020vd.A05(C18040vf.A02, this.A0A, 5735)) {
            return false;
        }
        C19830z4 r2 = this.A09;
        if (r2.A2P() && !C17880vN.A1W(AnonymousClass11Q.A01(this.A08), "username_is_set_triggered")) {
            return true;
        }
        if (!C17890vO.A0B(r2).getBoolean("username_chats_ever_existed", false) || AnonymousClass11Q.A01(this.A08).getBoolean("username_chats_exist_triggered", false)) {
            return false;
        }
        return true;
    }

    public void CQJ() {
        boolean CLk = CLk();
        boolean z = this.A00;
        if (CLk) {
            if (!z) {
                this.A01.addView((View) this.A06.getValue());
                this.A00 = true;
            }
            ((View) this.A06.getValue()).setVisibility(0);
            C138166wd.A00(this.A04, 1);
        } else if (z) {
            Bcv();
        }
    }
}
